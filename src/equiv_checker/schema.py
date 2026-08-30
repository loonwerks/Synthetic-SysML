"""Versioned, backend-neutral interfaces for SysML/GUMBO comparison.

The checker deliberately separates a *run status* from a semantic result.  A
semantic result exists only after the relevant evidence is definitive; parser,
coverage, solver, and tool failures therefore cannot be serialized as
``NOT_EQUIVALENT`` by accident.
"""

from __future__ import annotations

from dataclasses import asdict, dataclass, field, is_dataclass
from enum import Enum
from pathlib import Path
from typing import Any, Mapping


COMPARISON_PLAN_SCHEMA = "3.0.0"
UNIT_RESULT_SCHEMA = "3.0.0"
REPORT_SCHEMA = "3.0.0"


class RunStatus(str, Enum):
    COMPLETED = "COMPLETED"
    INCONCLUSIVE = "INCONCLUSIVE"
    ERROR = "ERROR"


class SemanticResult(str, Enum):
    MODEL_MISMATCH = "MODEL_MISMATCH"
    EQUIVALENT = "EQUIVALENT"
    NOT_EQUIVALENT = "NOT_EQUIVALENT"


class ComparisonVerdict(str, Enum):
    """The result of comparing behavior, independent of contract health."""

    EQUIVALENT = "EQUIVALENT"
    CANDIDATE_STRONGER = "CANDIDATE_STRONGER"
    CANDIDATE_WEAKER = "CANDIDATE_WEAKER"
    INCOMPARABLE = "INCOMPARABLE"
    INCONCLUSIVE = "INCONCLUSIVE"
    INVALID_INPUT = "INVALID_INPUT"


class HealthStatus(str, Enum):
    """Public contract-health status, kept separate from comparison."""

    PASSED = "PASSED"
    FAILED = "FAILED"
    UNKNOWN = "UNKNOWN"
    NOT_CHECKED = "NOT_CHECKED"


class UnitClassification(str, Enum):
    EQUIVALENT = "EQUIVALENT"
    CANDIDATE_STRONGER = "CANDIDATE_STRONGER"
    CANDIDATE_WEAKER = "CANDIDATE_WEAKER"
    INCOMPARABLE = "INCOMPARABLE"
    INVALID_CONTRACT = "INVALID_CONTRACT"
    INCONCLUSIVE = "INCONCLUSIVE"


class VCStatus(str, Enum):
    VERIFIED = "VERIFIED"
    COUNTEREXAMPLE = "COUNTEREXAMPLE"
    UNKNOWN = "UNKNOWN"
    TIMEOUT = "TIMEOUT"
    TOOL_ERROR = "TOOL_ERROR"
    NOT_RUN = "NOT_RUN"


class UnitKind(str, Enum):
    DATATYPE_INVARIANT = "datatype-invariant"
    INITIALIZE = "initialize"
    COMPUTE = "compute"


class ObservationRole(str, Enum):
    INPUT = "input"
    OUTPUT = "output"
    PRE_STATE = "pre-state"
    POST_STATE = "post-state"
    VALUE = "value"


@dataclass(frozen=True)
class SourceLocation:
    uri: str
    line: int
    column: int
    offset: int | None = None


@dataclass(frozen=True)
class ClauseProvenance:
    clause_id: str
    kind: str
    trace_ids: tuple[str, ...] = ()
    source: SourceLocation | None = None


@dataclass(frozen=True)
class NormalizedType:
    """A validated structural type description for the fixed-model carrier."""

    key: str
    kind: str
    qualified_name: str
    fields: tuple[tuple[str, str], ...] = ()
    literals: tuple[str, ...] = ()
    element_type: str | None = None
    bound: int | None = None
    oracle_type: str | None = None
    candidate_type: str | None = None
    oracle_enum_owner: str | None = None
    candidate_enum_owner: str | None = None
    oracle_index_type: str | None = None
    candidate_index_type: str | None = None
    oracle_index_minimum: int | None = None
    candidate_index_minimum: int | None = None
    recursive: bool = False
    supported: bool = True
    unsupported_reason: str | None = None


@dataclass(frozen=True)
class Observation:
    name: str
    role: ObservationRole
    type_key: str
    oracle_type: str | None
    candidate_type: str | None
    oracle_declared: bool = True
    candidate_declared: bool = True


@dataclass(frozen=True)
class WriteFootprint:
    """Resolved state names that an entrypoint is explicitly allowed to change."""

    restricted: bool = False
    targets: tuple[str, ...] = ()


@dataclass(frozen=True)
class PredicateBinding:
    side: str
    assumption: str | None
    guarantee: str | None
    container_assumption: str | None = None
    container_guarantee: str | None = None
    source_object: str | None = None
    generated_source: str | None = None
    generated_sha256: str | None = None
    synthetic_true_assumption: bool = False
    synthetic_true_guarantee: bool = False
    # Ordered ComparisonUnit.observations consumed by the generated native
    # predicates.  ``None`` means that signature binding has not yet been
    # certified; an empty tuple is an explicitly parameterless predicate.
    assumption_observations: tuple[str, ...] | None = None
    guarantee_observations: tuple[str, ...] | None = None


@dataclass(frozen=True)
class ComparisonUnit:
    key: str
    kind: UnitKind
    root: str | None
    instance_path: str | None
    classifier: str
    phase: str
    observations: tuple[Observation, ...]
    oracle: PredicateBinding | None
    candidate: PredicateBinding | None
    oracle_clauses: tuple[ClauseProvenance, ...] = ()
    candidate_clauses: tuple[ClauseProvenance, ...] = ()
    coverage_complete: bool = True
    unsupported_reasons: tuple[str, ...] = ()
    oracle_writes: WriteFootprint = field(default_factory=WriteFootprint)
    candidate_writes: WriteFootprint = field(default_factory=WriteFootprint)


@dataclass(frozen=True)
class ModelFingerprint:
    sha256: str
    canonical_ast_path: str
    canonical_ast_sha256: str
    parser: str


@dataclass(frozen=True)
class ComparisonPlan:
    oracle_input: str
    candidate_input: str
    oracle_fingerprint: ModelFingerprint
    candidate_fingerprint: ModelFingerprint
    roots: tuple[str, ...]
    types: tuple[NormalizedType, ...]
    units: tuple[ComparisonUnit, ...]
    coverage_complete: bool
    coverage_gaps: tuple[str, ...] = ()
    neutralization_evidence: tuple[str, ...] = ()
    schema_version: str = COMPARISON_PLAN_SCHEMA

    def validate(self) -> None:
        if self.schema_version != COMPARISON_PLAN_SCHEMA:
            raise ValueError(f"unsupported comparison plan schema: {self.schema_version}")
        keys = [unit.key for unit in self.units]
        if len(keys) != len(set(keys)):
            raise ValueError("comparison plan contains duplicate unit keys")
        type_keys = [item.key for item in self.types]
        if len(type_keys) != len(set(type_keys)):
            raise ValueError("comparison plan contains duplicate normalized type keys")
        known_types = set(type_keys)
        requires_neutral_carriers = False
        for unit in self.units:
            observation_names = {item.name for item in unit.observations}
            post_state = {
                item.name: item
                for item in unit.observations
                if item.role is ObservationRole.POST_STATE
            }
            pre_state = {
                item.name.removeprefix("In_"): item
                for item in unit.observations
                if item.role is ObservationRole.PRE_STATE
            }
            if unit.kind is UnitKind.COMPUTE and set(post_state) != set(pre_state):
                raise ValueError(
                    f"compute unit {unit.key} does not pair every old and new state value"
                )
            if unit.kind is UnitKind.INITIALIZE and pre_state:
                raise ValueError(f"initialize unit {unit.key} contains old state")
            for name in set(post_state) & set(pre_state):
                if post_state[name].type_key != pre_state[name].type_key:
                    raise ValueError(
                        f"unit {unit.key} uses different old/new types for state {name}"
                    )
                if (
                    post_state[name].oracle_declared
                    != pre_state[name].oracle_declared
                    or post_state[name].candidate_declared
                    != pre_state[name].candidate_declared
                ):
                    raise ValueError(
                        f"unit {unit.key} disagrees about declaration of old/new state {name}"
                    )
            for side, footprint in (
                ("oracle", unit.oracle_writes),
                ("candidate", unit.candidate_writes),
            ):
                declared = {
                    name
                    for name, item in post_state.items()
                    if (
                        item.oracle_declared
                        if side == "oracle"
                        else item.candidate_declared
                    )
                }
                unknown_writes = set(footprint.targets) - declared
                if unknown_writes:
                    raise ValueError(
                        f"unit {unit.key} {side} write limit names undeclared state: "
                        f"{sorted(unknown_writes)}"
                    )
                if not footprint.restricted and footprint.targets:
                    raise ValueError(
                        f"unit {unit.key} has targets on an unrestricted {side} write limit"
                    )
            for observation in unit.observations:
                if observation.type_key not in known_types:
                    raise ValueError(
                        f"unit {unit.key} references unknown type {observation.type_key}"
                    )
            if self.coverage_complete and unit.coverage_complete:
                for binding in (unit.oracle, unit.candidate):
                    if binding is None:
                        raise ValueError(f"proof-ready unit {unit.key} has no predicate binding")
                    for polarity, method, synthetic, arguments in (
                        (
                            "assumption",
                            binding.assumption,
                            binding.synthetic_true_assumption,
                            binding.assumption_observations,
                        ),
                        (
                            "guarantee",
                            binding.guarantee,
                            binding.synthetic_true_guarantee,
                            binding.guarantee_observations,
                        ),
                    ):
                        if method is None and not synthetic:
                            raise ValueError(
                                f"unit {unit.key} has no {binding.side} {polarity} semantics"
                            )
                        if method is not None and arguments is None:
                            raise ValueError(
                                f"unit {unit.key} has an uncertified {binding.side} "
                                f"{polarity} signature"
                            )
                        unknown = set(arguments or ()) - observation_names
                        if unknown:
                            raise ValueError(
                                f"unit {unit.key} {binding.side} {polarity} references "
                                f"unknown observations: {sorted(unknown)}"
                            )
                if unit.kind is UnitKind.DATATYPE_INVARIANT:
                    requires_neutral_carriers = requires_neutral_carriers or any(
                        binding is not None
                        and not binding.synthetic_true_guarantee
                        for binding in (unit.oracle, unit.candidate)
                    )
        if self.coverage_complete and requires_neutral_carriers and not self.neutralization_evidence:
            raise ValueError(
                "proof-ready datatype invariants have no neutral-carrier attestation"
            )


@dataclass(frozen=True)
class AtomicVCResult:
    name: str
    formula: str
    status: VCStatus
    validity_evidence: str | None = None
    witness_evidence: str | None = None
    detail: str | None = None


@dataclass(frozen=True)
class UnitResult:
    unit_key: str
    classification: UnitClassification
    atomic_vcs: tuple[AtomicVCResult, ...]
    oracle_health: VCStatus
    candidate_health: VCStatus
    oracle_health_evidence: tuple[str, ...] = ()
    candidate_health_evidence: tuple[str, ...] = ()
    warnings: tuple[str, ...] = ()
    schema_version: str = UNIT_RESULT_SCHEMA

    def validate(self) -> None:
        if self.schema_version != UNIT_RESULT_SCHEMA:
            raise ValueError(f"unsupported unit result schema: {self.schema_version}")
        required = {"A* -> A", "A* & G -> G*", "A -> A*", "A & G* -> G"}
        actual = {vc.name for vc in self.atomic_vcs}
        if actual != required:
            raise ValueError(
                f"unit {self.unit_key} has wrong atomic VC inventory: {sorted(actual)}"
            )


@dataclass(frozen=True)
class AffectedUnit:
    unit_key: str
    owner_instance: str | None
    classifier: str
    phase: str
    classification: UnitClassification
    failed_atomic_vcs: tuple[str, ...]
    oracle_clause_ids: tuple[str, ...]
    oracle_trace_ids: tuple[str, ...]
    candidate_clause_ids: tuple[str, ...]
    candidate_trace_ids: tuple[str, ...]
    oracle_locations: tuple[SourceLocation, ...]
    candidate_locations: tuple[SourceLocation, ...]
    evidence_paths: tuple[str, ...]


@dataclass(frozen=True)
class CheckerReport:
    run_status: RunStatus
    result: SemanticResult | None
    comparison_verdict: ComparisonVerdict
    oracle_health: HealthStatus
    candidate_health: HealthStatus
    breakdown_complete: bool
    affected_units: tuple[AffectedUnit, ...]
    unit_results: tuple[UnitResult, ...]
    comparison_plan: str | None
    manifest: str | None
    diagnostics: tuple[str, ...] = ()
    schema_version: str = REPORT_SCHEMA

    def validate(self) -> None:
        if self.schema_version != REPORT_SCHEMA:
            raise ValueError(f"unsupported report schema: {self.schema_version}")
        if self.run_status is RunStatus.COMPLETED and self.result is None:
            raise ValueError("a completed run must have a semantic result")
        if self.run_status is not RunStatus.COMPLETED and self.result is not None:
            raise ValueError("an inconclusive/error run must not have a semantic result")
        for result in self.unit_results:
            result.validate()


def _json_value(value: Any) -> Any:
    if isinstance(value, Enum):
        return value.value
    if isinstance(value, Path):
        return str(value)
    if is_dataclass(value):
        return {key: _json_value(item) for key, item in asdict(value).items()}
    if isinstance(value, Mapping):
        return {str(key): _json_value(item) for key, item in value.items()}
    if isinstance(value, (tuple, list)):
        return [_json_value(item) for item in value]
    return value


def to_json(value: Any) -> dict[str, Any]:
    """Convert a schema object into stable JSON-compatible primitives."""

    converted = _json_value(value)
    if not isinstance(converted, dict):
        raise TypeError("top-level schema value must serialize to an object")
    return converted
