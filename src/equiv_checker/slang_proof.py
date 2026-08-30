"""Generate replayable Slang/Logika sources from a frozen comparison unit."""

from __future__ import annotations

from dataclasses import dataclass
import hashlib
from itertools import product
from pathlib import Path
import re
from typing import Mapping, Sequence

from .gumbox import PredicateCallSignature, ResolvedUnitBinding
from .proof import ATOMIC_VCS, Obligation
from .schema import (
    ComparisonUnit,
    NormalizedType,
    Observation,
    ObservationRole,
    PredicateBinding,
    UnitKind,
)


@dataclass(frozen=True)
class HealthObligation:
    side: str
    kind: str
    source: Path | None
    mode: str
    complement_source: Path | None = None
    complement_content: str | None = None
    supported: bool = True
    unsupported_reason: str | None = None


@dataclass(frozen=True)
class GeneratedUnitProof:
    unit_key: str
    directory: Path
    atomic: tuple[Obligation, ...]
    health: tuple[HealthObligation, ...]
    sources: tuple[Path, ...]


def generate_unit_proof(
    unit: ComparisonUnit | ResolvedUnitBinding,
    types: Mapping[str, NormalizedType],
    destination: Path,
    *,
    proof_package: str = "equiv_checker.generated",
) -> GeneratedUnitProof:
    """Emit isolated validity/SAT sources for one plan-selected unit.

    Generated code calls only the composite predicates named by the frozen
    plan.  Clause IDs and helper names never enter a proof obligation.
    """

    resolved = unit if isinstance(unit, ResolvedUnitBinding) else None
    unit = resolved.unit if resolved is not None else unit
    if not unit.coverage_complete or unit.oracle is None or unit.candidate is None:
        raise ValueError(f"unit is not proof-ready: {unit.key}")
    if unit.unsupported_reasons:
        raise ValueError(
            f"unit is unsupported: {unit.key}: {'; '.join(unit.unsupported_reasons)}"
        )
    destination.mkdir(parents=True, exist_ok=True)
    variables = _variables(unit.observations)
    parameters = ",\n      ".join(
        f"{names[0]}: {observation.oracle_type}"
        for observation, names in zip(unit.observations, variables)
    )
    if any(
        observation.oracle_type is None or observation.candidate_type is None
        for observation in unit.observations
    ):
        raise ValueError(f"unit has an unpaired observation type: {unit.key}")
    if any(
        observation.oracle_type != observation.candidate_type
        for observation in unit.observations
    ):
        raise ValueError(f"unit does not use one fixed-model datatype namespace: {unit.key}")
    oracle_a = _predicate(
        unit.oracle,
        "assumption",
        unit.observations,
        variables,
        "oracle",
        resolved.oracle.assumption if resolved else None,
    )
    candidate_a = _predicate(
        unit.candidate,
        "assumption",
        unit.observations,
        variables,
        "candidate",
        resolved.candidate.assumption if resolved else None,
    )
    oracle_g = _predicate(
        unit.oracle,
        "guarantee",
        unit.observations,
        variables,
        "oracle",
        resolved.oracle.guarantee if resolved else None,
    )
    candidate_g = _predicate(
        unit.candidate,
        "guarantee",
        unit.observations,
        variables,
        "candidate",
        resolved.candidate.guarantee if resolved else None,
    )
    oracle_g = _with_state_frames(unit, variables, "oracle", oracle_g)
    candidate_g = _with_state_frames(unit, variables, "candidate", candidate_g)
    candidate_write_refines = "T" if _writes_refine(unit, "candidate", "oracle") else "F"
    oracle_write_refines = "T" if _writes_refine(unit, "oracle", "candidate") else "F"
    formulas = {
        "A* -> A": _implies(oracle_a, candidate_a),
        "A* & G -> G*": _and(
            _implies(_and(oracle_a, candidate_g), oracle_g),
            candidate_write_refines,
        ),
        "A -> A*": _implies(candidate_a, oracle_a),
        "A & G* -> G": _and(
            _implies(_and(candidate_a, oracle_g), candidate_g),
            oracle_write_refines,
        ),
    }
    prefix = hashlib.sha256(unit.key.encode("utf-8")).hexdigest()[:12]
    atomic: list[Obligation] = []
    sources: list[Path] = []
    for index, name in enumerate(ATOMIC_VCS, 1):
        formula = formulas[name]
        validity = destination / f"{index:02d}-{prefix}-valid.scala"
        complement = destination / f"{index:02d}-{prefix}-sat-complement.scala"
        validity.write_text(
            _source(
                proof_package,
                f"VC_{prefix}_{index}_Valid",
                parameters,
                "T",
                formula,
                mode="valid",
            ),
            encoding="utf-8",
        )
        complement_content = _source(
            proof_package,
            f"VC_{prefix}_{index}_Complement",
            parameters,
            f"!({formula})",
            None,
            mode="sat",
        )
        sources.append(validity)
        atomic.append(
            Obligation(
                unit.key,
                name,
                formula,
                validity,
                complement,
                complement_content,
            )
        )

    health: list[HealthObligation] = []
    for side, assumption, guarantee, phase_binding in (
        ("oracle", oracle_a, oracle_g, resolved.oracle if resolved else None),
        ("candidate", candidate_a, candidate_g, resolved.candidate if resolved else None),
    ):
        side_binding = unit.oracle if side == "oracle" else unit.candidate
        assert side_binding is not None
        side_parameters = _bound_parameters(
            unit.observations,
            variables,
            side,
            side_binding,
            "assumption",
            phase_binding.assumption if phase_binding else None,
        )
        assumption_path = destination / f"health-{side}-assumption-satisfiable.scala"
        assumption_path.write_text(
            _source(
                proof_package,
                f"Health_{prefix}_{side.title()}_Assumption_Satisfiable",
                side_parameters,
                assumption,
                None,
                mode="sat",
            ),
            encoding="utf-8",
        )
        sources.append(assumption_path)
        health.append(
            HealthObligation(side, "assumption-satisfiable", assumption_path, "sat")
        )

        realizability_path = destination / f"health-{side}-pointwise-realizable.scala"
        if unit.kind is UnitKind.DATATYPE_INVARIANT:
            # With no input variables, SAT(A & G) is exactly the required
            # existential output witness, not a weakening of pointwise health.
            realizability_path.write_text(
                _source(
                    proof_package,
                    f"Health_{prefix}_{side.title()}_Pointwise_Realizable",
                    _bound_parameters(
                        unit.observations,
                        variables,
                        side,
                        side_binding,
                        "guarantee",
                        phase_binding.guarantee if phase_binding else None,
                    ),
                    f"({assumption}) & ({guarantee})",
                    None,
                    mode="sat",
                ),
                encoding="utf-8",
            )
            sources.append(realizability_path)
            health.append(
                HealthObligation(side, "pointwise-realizable", realizability_path, "sat")
            )
            continue

        try:
            realizability = _pointwise_realizability(
                unit,
                types,
                variables,
                side,
                assumption,
                phase_binding.guarantee if phase_binding else None,
            )
        except ValueError as error:
            health.append(
                HealthObligation(
                    side,
                    "pointwise-realizable",
                    None,
                    "valid",
                    None,
                    supported=False,
                    unsupported_reason=str(error),
                )
            )
        else:
            realizability_complement = (
                destination / f"health-{side}-pointwise-realizable-complement.scala"
            )
            realizability_path.write_text(
                _source(
                    proof_package,
                    f"Health_{prefix}_{side.title()}_Pointwise_Realizable",
                    _input_parameters(unit.observations, variables, side),
                    "T",
                    f"({assumption}) ___>: ({realizability})",
                    mode="valid",
                ),
                encoding="utf-8",
            )
            realizability_complement_content = _source(
                proof_package,
                f"Health_{prefix}_{side.title()}_Pointwise_Realizable_Complement",
                _input_parameters(unit.observations, variables, side),
                f"({assumption}) & !({realizability})",
                None,
                mode="sat",
            )
            sources.append(realizability_path)
            health.append(
                HealthObligation(
                    side,
                    "pointwise-realizable",
                    realizability_path,
                    "valid",
                    realizability_complement,
                    realizability_complement_content,
                )
            )

    return GeneratedUnitProof(
        unit.key,
        destination,
        tuple(atomic),
        tuple(health),
        tuple(sources),
    )


def _and(left: str, right: str) -> str:
    """Apply only exact Boolean identities while rendering a conjunction."""

    if left == "F" or right == "F":
        return "F"
    if left == "T":
        return right
    if right == "T":
        return left
    return f"({left}) & ({right})"


def _implies(left: str, right: str) -> str:
    """Apply only exact Boolean identities while rendering an implication."""

    if left == "F" or right == "T":
        return "T"
    if left == "T":
        return right
    return f"({left}) ___>: ({right})"


def _state_names(unit: ComparisonUnit) -> tuple[str, ...]:
    return tuple(
        observation.name
        for observation in unit.observations
        if observation.role is ObservationRole.POST_STATE
    )


def _allowed_writes(unit: ComparisonUnit, side: str) -> frozenset[str]:
    footprint = unit.oracle_writes if side == "oracle" else unit.candidate_writes
    all_state = set(_state_names(unit))
    if not footprint.restricted:
        return frozenset(all_state)
    declared_attr = "oracle_declared" if side == "oracle" else "candidate_declared"
    missing_here = {
        observation.name
        for observation in unit.observations
        if observation.role is ObservationRole.POST_STATE
        and not getattr(observation, declared_attr)
    }
    return frozenset(set(footprint.targets) | missing_here)


def _writes_refine(unit: ComparisonUnit, stronger: str, weaker: str) -> bool:
    return _allowed_writes(unit, stronger) <= _allowed_writes(unit, weaker)


def _with_state_frames(
    unit: ComparisonUnit,
    variables: tuple[tuple[str, str], ...],
    side: str,
    guarantee: str,
) -> str:
    if unit.kind is not UnitKind.COMPUTE:
        return guarantee
    footprint = unit.oracle_writes if side == "oracle" else unit.candidate_writes
    if not footprint.restricted:
        return guarantee
    declared_attr = "oracle_declared" if side == "oracle" else "candidate_declared"
    by_name = {
        observation.name: index for index, observation in enumerate(unit.observations)
    }
    frames: list[str] = []
    for index, observation in enumerate(unit.observations):
        if (
            observation.role is not ObservationRole.POST_STATE
            or not getattr(observation, declared_attr)
            or observation.name in footprint.targets
        ):
            continue
        pre_index = by_name.get(f"In_{observation.name}")
        if pre_index is None:
            raise ValueError(
                f"post-state {observation.name!r} has no matching old-state observation"
            )
        frames.append(f"{variables[index][0]} == {variables[pre_index][0]}")
    if not frames:
        return guarantee
    result = guarantee
    for frame in frames:
        result = _and(result, frame)
    return result


def _variables(observations: tuple[Observation, ...]) -> tuple[tuple[str, str], ...]:
    used: set[str] = set()
    result: list[tuple[str, str]] = []
    for index, observation in enumerate(observations):
        base = _identifier(observation.name).lower() or f"value_{index}"
        if base in used:
            base = f"{base}_{index}"
        used.add(base)
        # Both native contract predicates consume the same canonical carrier.
        result.append((base, base))
    return tuple(result)


def _side_parameters(
    observations: tuple[Observation, ...],
    variables: tuple[tuple[str, str], ...],
    side: str,
) -> str:
    offset = 0 if side == "oracle" else 1
    return ",\n      ".join(
        f"{names[offset]}: {observation.oracle_type if side == 'oracle' else observation.candidate_type}"
        for observation, names in zip(observations, variables)
    )


def _input_parameters(
    observations: tuple[Observation, ...],
    variables: tuple[tuple[str, str], ...],
    side: str,
) -> str:
    offset = 0 if side == "oracle" else 1
    return ",\n      ".join(
        f"{names[offset]}: {observation.oracle_type if side == 'oracle' else observation.candidate_type}"
        for observation, names in zip(observations, variables)
        if observation.role in {ObservationRole.INPUT, ObservationRole.PRE_STATE}
    )


def _bound_parameters(
    observations: tuple[Observation, ...],
    variables: tuple[tuple[str, str], ...],
    side: str,
    binding: PredicateBinding,
    polarity: str,
    signature: PredicateCallSignature | None,
) -> str:
    offset = 0 if side == "oracle" else 1
    if signature is not None:
        indices = signature.observation_indices
    else:
        names = (
            binding.assumption_observations
            if polarity == "assumption"
            else binding.guarantee_observations
        )
        if names is None:
            if (
                binding.synthetic_true_assumption
                if polarity == "assumption"
                else binding.synthetic_true_guarantee
            ):
                names = ()
            else:
                raise ValueError(f"uncertified generated {polarity} signature")
        index_by_name = {observation.name: index for index, observation in enumerate(observations)}
        try:
            indices = tuple(index_by_name[name] for name in names)
        except KeyError as error:
            raise ValueError(
                f"generated {polarity} signature references unknown observation {error.args[0]!r}"
            ) from error
    return ",\n      ".join(
        f"{variables[index][offset]}: "
        f"{observations[index].oracle_type if side == 'oracle' else observations[index].candidate_type}"
        for index in indices
    )


def _predicate(
    binding: PredicateBinding,
    polarity: str,
    observations: tuple[Observation, ...],
    variables: tuple[tuple[str, str], ...],
    side: str,
    signature: PredicateCallSignature | None = None,
    replacements: Mapping[int, str] | None = None,
) -> str:
    method = binding.assumption if polarity == "assumption" else binding.guarantee
    synthetic = (
        binding.synthetic_true_assumption
        if polarity == "assumption"
        else binding.synthetic_true_guarantee
    )
    if method is None:
        if synthetic:
            return "T"
        raise ValueError(f"missing generated {polarity} for present source semantics")
    offset = 0 if side == "oracle" else 1
    replacements = replacements or {}
    if signature is not None:
        if signature.qualified_method != method:
            raise ValueError(
                f"resolved signature method {signature.qualified_method!r} does not match {method!r}"
            )
        selected = [
            replacements.get(index, variables[index][offset])
            for index in signature.observation_indices
        ]
        return f"{method}({', '.join(selected)})"

    bound_names = (
        binding.assumption_observations
        if polarity == "assumption"
        else binding.guarantee_observations
    )
    if bound_names is None:
        raise ValueError(f"uncertified generated {polarity} signature: {method}")
    indices_by_name = {observation.name: index for index, observation in enumerate(observations)}
    if len(indices_by_name) != len(observations):
        raise ValueError("comparison unit contains duplicate observation names")
    try:
        selected = [
            replacements.get(indices_by_name[name], variables[indices_by_name[name]][offset])
            for name in bound_names
        ]
    except KeyError as error:
        raise ValueError(
            f"generated {polarity} signature references unknown observation {error.args[0]!r}"
        ) from error
    return f"{method}({', '.join(selected)})"


def _pointwise_realizability(
    unit: ComparisonUnit,
    types: Mapping[str, NormalizedType],
    variables: tuple[tuple[str, str], ...],
    side: str,
    assumption: str,
    signature: PredicateCallSignature | None,
) -> str:
    """Render ``exists outputs. G`` by finite, explicit output enumeration."""

    del assumption  # The caller places A on the implication's left side.
    output_indices = [
        index
        for index, observation in enumerate(unit.observations)
        if observation.role in {ObservationRole.OUTPUT, ObservationRole.POST_STATE}
    ]
    value_sets: list[tuple[str, ...]] = []
    for index in output_indices:
        observation = unit.observations[index]
        values = _finite_values(
            observation.type_key,
            side,
            types,
            observation.oracle_type if side == "oracle" else observation.candidate_type,
            (),
        )
        if values is None:
            raise ValueError(
                f"cannot establish pointwise realizability: output {observation.name!r} "
                "does not have a finite enumerable generated domain"
            )
        value_sets.append(values)
    combinations = 1
    for values in value_sets:
        combinations *= len(values)
    if combinations > 256:
        raise ValueError(
            f"cannot establish pointwise realizability: finite output domain has "
            f"{combinations} combinations (limit 256)"
        )
    guarantee_binding = unit.oracle if side == "oracle" else unit.candidate
    assert guarantee_binding is not None
    if not output_indices:
        return _predicate(
            guarantee_binding,
            "guarantee",
            unit.observations,
            variables,
            side,
            signature,
        )
    cases = []
    for chosen in product(*value_sets):
        replacements = dict(zip(output_indices, chosen, strict=True))
        cases.append(
            _predicate(
                guarantee_binding,
                "guarantee",
                unit.observations,
                variables,
                side,
                signature,
                replacements,
            )
        )
    return " |\n        ".join(f"({case})" for case in cases) if cases else "F"


def _finite_values(
    type_key: str,
    side: str,
    types: Mapping[str, NormalizedType],
    concrete_type: str | None,
    stack: tuple[str, ...],
) -> tuple[str, ...] | None:
    if type_key in stack:
        return None
    tipe = types.get(type_key)
    if tipe is None or not tipe.supported or tipe.recursive:
        return None
    side_type = concrete_type or (
        tipe.oracle_type if side == "oracle" else tipe.candidate_type
    )
    if tipe.kind in {"boolean", "scalar"} and side_type in {
        "B",
        "Boolean",
        "org.sireum.B",
    }:
        return ("F", "T")
    if tipe.kind == "enum":
        owner = (
            tipe.oracle_enum_owner if side == "oracle" else tipe.candidate_enum_owner
        ) or str(side_type).removesuffix(".Type")
        return tuple(f"{owner}.{literal}" for literal in tipe.literals)
    if tipe.kind == "option" and tipe.element_type is not None:
        payloads = _finite_values(
            tipe.element_type, side, types, None, stack + (type_key,)
        )
        if payloads is None:
            return None
        return ("None()", *(f"Some({payload})" for payload in payloads))
    if tipe.kind == "record":
        field_values: list[tuple[str, tuple[str, ...]]] = []
        for field_name, field_key in tipe.fields:
            values = _finite_values(field_key, side, types, None, stack + (type_key,))
            if values is None:
                return None
            field_values.append((field_name, values))
        owner = str(side_type)
        combinations = product(*(values for _, values in field_values))
        return tuple(
            f"{owner}({', '.join(f'{name} = {value}' for (name, _), value in zip(field_values, chosen, strict=True))})"
            for chosen in combinations
        )
    return None


def _source(
    package: str,
    object_name: str,
    parameters: str,
    requires: str,
    ensures: str | None,
    *,
    mode: str,
) -> str:
    contract = (
        f"Contract(Requires({requires}),\n      Ensures({ensures}))"
        if mode == "valid"
        else f"Contract(Requires({requires}))"
    )
    return f"""// #Sireum #Logika
package {package}

import org.sireum._

object {object_name} {{
  @pure def check(
      {parameters}): Unit = {{
    {contract}
  }}
}}
"""


def _identifier(value: str) -> str:
    result = re.sub(r"[^A-Za-z0-9_]", "_", value)
    if result and result[0].isdigit():
        result = "_" + result
    return result
