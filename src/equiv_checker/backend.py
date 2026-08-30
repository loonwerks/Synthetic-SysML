"""Production orchestration for generalized two-file GUMBO comparison.

The backend deliberately contains no GUMBO expression parser.  Sireum owns
source resolution and GumboX owns expression lowering; this module connects
their resolved inventories to native Slang predicates compiled against one
fixed-model carrier namespace and archives the exact Logika project checked.
"""

from __future__ import annotations

from collections import defaultdict
from contextlib import nullcontext
from dataclasses import replace
import hashlib
import math
from pathlib import Path
import tempfile
from typing import Iterable, Mapping

from .cli import BackendOutcome, CompareRequest
from .codegen import (
    CandidateInvariantRewrite,
    GeneratedRoot,
    GeneratedSide,
    NeutralCarrierAttestation,
    create_shared_replay_project,
    generate_sides,
    resolve_sireum_executable,
    validate_semantic_export,
)
from .evidence import EvidenceBundle, sha256_file
from .gumbox import (
    GeneratedSemanticGap,
    GumboXObject,
    ResolvedPhaseBinding,
    ResolvedUnitBinding,
    bind_resolved_unit,
    discover_gumbox,
)
from .inventory import (
    DEFAULT_LIBRARY,
    Inventory,
    InventoryError,
    InventoryInvalidInput,
    InventoryModelMismatch,
    InventoryRoot,
    InventoryTimeout,
    clause_accounting,
    pair_inventories,
    run_inventories,
    select_codegen_roots,
)
from .model_gate import (
    ModelGateError,
    ModelGateInvalidInput,
    compare_model_fingerprints,
    fingerprint_models,
)
from .proof import ResidentLogikaBackend, execute_unit_proof
from .schema import (
    ComparisonPlan,
    ComparisonUnit,
    ModelFingerprint,
    NormalizedType,
    Observation,
    ObservationRole,
    PredicateBinding,
    RunStatus,
    UnitKind,
    UnitResult,
    to_json,
)
from .slang_proof import GeneratedUnitProof, generate_unit_proof
from .type_alignment import (
    DatatypeInvariantPredicate,
    EnumType,
    TypeAlignment,
    TypeCatalog,
    TypeCatalogError,
    align_type_pair,
    bind_resolved_datatype_unit,
    catalog_types,
    discover_datatype_invariants,
    neutralize_datatype_source,
)


REPO_ROOT = Path(__file__).resolve().parents[2]


class UnsupportedComparison(RuntimeError):
    """The input is valid, but this checker slice cannot prove it soundly."""


class CheckerInfrastructureError(RuntimeError):
    """A required parser, generator, or proof tool failed operationally."""


def _safe_name(value: str) -> str:
    stem = "".join(character.lower() if character.isalnum() else "-" for character in value)
    stem = "-".join(part for part in stem.split("-") if part)
    digest = hashlib.sha256(value.encode("utf-8")).hexdigest()[:10]
    return f"{stem[:48] or 'item'}-{digest}"


def _measure(request: CompareRequest, stage: str, **detail: object):
    if request.timings is None:
        return nullcontext()
    return request.timings.measure(stage, **detail)


def _inventory_json(inventory: Inventory) -> Mapping[str, object]:
    return to_json(inventory)


def _archive_fingerprint(
    *,
    label: str,
    raw: ModelFingerprint,
    input_file: Path,
    artifact: Path,
    evidence: EvidenceBundle,
) -> ModelFingerprint:
    relative = evidence.archive_copy(
        artifact,
        f"model/{label}-canonical-ast.json",
        kind="model-canonical-ast",
    )
    return replace(
        raw,
        # The public record binds both the exact input and exact canonical
        # artifact.  The semantic projection digest remains inside the
        # canonical artifact envelope and was used before this replacement.
        sha256=sha256_file(input_file),
        canonical_ast_path=relative,
        canonical_ast_sha256=sha256_file(evidence.root / relative),
    )


def _source_types(inventory: Inventory) -> tuple[NormalizedType, ...]:
    values = inventory.normalized_types()
    keys = [item.key for item in values]
    if len(keys) != len(set(keys)):
        raise InventoryError("resolved inventory contains duplicate normalized type keys")
    return values


def _inventory_root_labels(inventory: Inventory) -> tuple[str, ...]:
    """Render every resolved root without collapsing repeated instances."""

    return tuple(
        f"{root.classifier}@{root.instance_path}"
        for root in inventory.roots
    )


def _assign_units_to_roots(
    inventory: Inventory,
    codegen_roots: tuple[str, ...],
    units: tuple[ComparisonUnit, ...],
) -> dict[str, tuple[ComparisonUnit, ...]]:
    """Assign every proof unit to exactly one generated HAMR root."""

    descriptors: dict[str, InventoryRoot] = {}
    for root in inventory.roots:
        if root.classifier in codegen_roots:
            if root.classifier in descriptors:
                raise UnsupportedComparison(
                    f"generated root classifier is ambiguous: {root.classifier}"
                )
            descriptors[root.classifier] = root
    if set(descriptors) != set(codegen_roots):
        missing = sorted(set(codegen_roots) - set(descriptors))
        raise UnsupportedComparison(f"selected codegen roots are unresolved: {missing}")

    assigned: dict[str, list[ComparisonUnit]] = {
        root: [] for root in codegen_roots
    }
    for unit in units:
        if unit.kind is not UnitKind.DATATYPE_INVARIANT:
            if unit.root not in assigned:
                raise UnsupportedComparison(
                    f"component unit has no generated root: {unit.key}"
                )
            assigned[unit.root].append(unit)
            continue
        hosts = sorted(
            root
            for root, descriptor in descriptors.items()
            if unit.classifier in descriptor.type_names
        )
        if not hosts:
            raise UnsupportedComparison(
                f"no generated root contains datatype invariant {unit.classifier}"
            )
        assigned[hosts[0]].append(unit)

    flattened = [unit.key for root in codegen_roots for unit in assigned[root]]
    expected = [unit.key for unit in units]
    if sorted(flattened) != sorted(expected) or len(flattened) != len(expected):
        raise CheckerInfrastructureError("proof-unit root assignment is not one-to-one")
    return {root: tuple(assigned[root]) for root in codegen_roots}


def _coverage_gaps(
    oracle: Inventory,
    candidate: Inventory,
    units: Iterable[ComparisonUnit],
) -> tuple[str, ...]:
    frozen = tuple(units)
    gaps: list[str] = [
        *(f"oracle:{item}" for item in oracle.coverage_gaps),
        *(f"candidate:{item}" for item in candidate.coverage_gaps),
    ]
    for unit in frozen:
        gaps.extend(f"{unit.key}:{reason}" for reason in unit.unsupported_reasons)
        if not unit.coverage_complete and not unit.unsupported_reasons:
            gaps.append(f"{unit.key}:incomplete-source-coverage")
    for label, inventory in (("oracle", oracle), ("candidate", candidate)):
        accounting = clause_accounting(inventory, frozen)
        gaps.extend(
            f"{label}:unrepresented-clause:{clause_id}"
            for clause_id in accounting["missing_supported_clause_ids"]
        )
    return tuple(dict.fromkeys(gaps))


def _certifies_empty_contract_semantics(inventory: Inventory) -> bool:
    """Independently certify that an empty unit inventory means no contracts."""

    return (
        inventory.coverage_complete
        and inventory.declared_clause_count == 0
        and inventory.supported_clause_count == 0
        and not inventory.clauses
        and not inventory.contract_owners
    )


def _provisional_plan(
    *,
    request: CompareRequest,
    oracle_fingerprint: ModelFingerprint,
    candidate_fingerprint: ModelFingerprint,
    inventory: Inventory,
    units: tuple[ComparisonUnit, ...],
    gaps: tuple[str, ...],
) -> ComparisonPlan:
    return ComparisonPlan(
        oracle_input=str(request.oracle),
        candidate_input=str(request.candidate),
        oracle_fingerprint=oracle_fingerprint,
        candidate_fingerprint=candidate_fingerprint,
        roots=_inventory_root_labels(inventory),
        types=_source_types(inventory),
        units=units,
        coverage_complete=False,
        coverage_gaps=gaps or ("semantic proof plan has not been generated",),
    )


def _command_json(side: GeneratedSide) -> Mapping[str, object]:
    return {
        "label": side.label,
        "export": to_json(side.export),
        "roots": [
            {
                "root": item.root,
                "package_name": item.package_name,
                "manifest": validate_semantic_export(item),
            }
            for item in side.roots
        ],
    }


def _validate_generated_side(side: GeneratedSide, expected_roots: tuple[str, ...]) -> None:
    if side.export.status == "TIMEOUT":
        raise UnsupportedComparison(f"{side.label} semantic export timed out")
    if side.export.status != "PASSED":
        lower = side.export.output.lower()
        if "unsupported" in lower or "not supported" in lower:
            raise UnsupportedComparison(f"{side.label} semantic export is unsupported")
        raise CheckerInfrastructureError(f"{side.label} semantic export failed")
    actual_roots = tuple(item.root for item in side.roots)
    if actual_roots != expected_roots:
        raise CheckerInfrastructureError(
            f"{side.label} code generation did not cover every resolved root: "
            f"expected={expected_roots}, actual={actual_roots}"
        )
    for generated in side.roots:
        try:
            validate_semantic_export(generated)
        except ValueError as error:
            raise CheckerInfrastructureError(
                f"{side.label} semantic export is not trustworthy for "
                f"{generated.root}: {error}"
            ) from error


def _generated_type(catalog: TypeCatalog, source_type: str) -> str:
    suffix = source_type.replace("::", ".").removeprefix(".")
    matches = [
        (name, declaration)
        for name, declaration in catalog.declarations.items()
        if name == suffix or name.endswith(f".{suffix}")
    ]
    if len(matches) != 1:
        raise TypeCatalogError(
            f"expected one generated type for {source_type!r}, found "
            f"{[name for name, _ in matches]}"
        )
    name, declaration = matches[0]
    return f"{name}.Type" if isinstance(declaration, EnumType) else name


def _merge_alignment(
    destination: dict[str, NormalizedType], alignment: TypeAlignment
) -> None:
    if not alignment.supported:
        raise UnsupportedComparison("; ".join(alignment.unsupported_reasons))
    for item in alignment.normalized_types:
        # The model gate has already established one fixed SysML type universe.
        # Preserve the structural comparison as a fail-closed generation check,
        # then canonicalize both contract sides onto the oracle-generated type.
        normalized = replace(
            item,
            candidate_type=item.oracle_type,
            candidate_enum_owner=item.oracle_enum_owner,
            candidate_index_type=item.oracle_index_type,
            candidate_index_minimum=item.oracle_index_minimum,
        )
        previous = destination.get(normalized.key)
        if previous is not None and previous != normalized:
            raise TypeCatalogError(
                f"inconsistent generated alignment for normalized type {normalized.key}"
            )
        destination[normalized.key] = normalized


def _align_unit(
    unit: ComparisonUnit,
    *,
    scope: str,
    oracle_catalog: TypeCatalog,
    candidate_catalog: TypeCatalog,
    normalized: dict[str, NormalizedType],
) -> ComparisonUnit:
    aligned_observations: list[Observation] = []
    cache: dict[str, TypeAlignment] = {}
    for observation in unit.observations:
        source_type = observation.type_key
        # A state declared on only one side is deliberately an unconstrained
        # value on the other side.  Its fixed proof carrier therefore comes
        # from the side that actually declares and uses it; requiring the
        # absent side's generated project to contain that contract-only type
        # would reject exactly the case this comparison is meant to handle.
        one_sided_state = observation.role in {
            ObservationRole.PRE_STATE,
            ObservationRole.POST_STATE,
        } and observation.oracle_declared != observation.candidate_declared
        cache_key = (
            f"{source_type}:oracle-only"
            if one_sided_state and observation.oracle_declared
            else f"{source_type}:candidate-only"
            if one_sided_state
            else source_type
        )
        alignment = cache.get(cache_key)
        if alignment is None:
            key = f"{scope}/type::{source_type}"
            left_catalog = oracle_catalog
            right_catalog = candidate_catalog
            if one_sided_state:
                left_catalog = (
                    oracle_catalog if observation.oracle_declared else candidate_catalog
                )
                right_catalog = left_catalog
            alignment = align_type_pair(
                key=key,
                oracle_catalog=left_catalog,
                candidate_catalog=right_catalog,
                oracle_type=_generated_type(left_catalog, source_type),
                candidate_type=_generated_type(right_catalog, source_type),
            )
            cache[cache_key] = alignment
            _merge_alignment(normalized, alignment)
        root = normalized[alignment.root_key]
        aligned_observations.append(
            replace(
                observation,
                type_key=root.key,
                oracle_type=root.oracle_type,
                candidate_type=root.oracle_type,
            )
        )
    return replace(unit, observations=tuple(aligned_observations))


def _gumbox_index(project: Path) -> dict[str, GumboXObject]:
    result: dict[str, GumboXObject] = {}
    for item in discover_gumbox(project):
        if item.qualified_name in result:
            raise GeneratedSemanticGap(
                f"generated GumboX object is duplicated: {item.qualified_name}"
            )
        result[item.qualified_name] = item
    return result


def _component_owner(
    *, generated: GeneratedRoot, objects: Mapping[str, GumboXObject], binding: PredicateBinding
) -> GumboXObject | None:
    if binding.source_object is None:
        if binding.synthetic_true_assumption and binding.synthetic_true_guarantee:
            return None
        raise GeneratedSemanticGap("inventory has no resolved GumboX object identity")
    expected = f"{generated.package_name}.{binding.source_object}"
    owner = objects.get(expected)
    if owner is None and not (
        binding.synthetic_true_assumption and binding.synthetic_true_guarantee
    ):
        raise GeneratedSemanticGap(f"generated GumboX object is missing: {expected}")
    return owner


def _shared_component_owner(
    *,
    shared_package: str,
    objects: Mapping[str, GumboXObject],
    binding: PredicateBinding,
    candidate: bool,
) -> GumboXObject | None:
    if binding.source_object is None:
        if binding.synthetic_true_assumption and binding.synthetic_true_guarantee:
            return None
        raise GeneratedSemanticGap("inventory has no resolved GumboX object identity")
    relative = binding.source_object
    if candidate:
        if not relative.endswith("_GumboX"):
            raise GeneratedSemanticGap(f"invalid GumboX object identity: {relative}")
        relative = f"{relative.removesuffix('_GumboX')}_Candidate_GumboX"
    expected = f"{shared_package}.{relative}"
    owner = objects.get(expected)
    if owner is None and not (
        binding.synthetic_true_assumption and binding.synthetic_true_guarantee
    ):
        raise GeneratedSemanticGap(f"shared-project GumboX object is missing: {expected}")
    return owner


def _shared_invariant_predicate(
    predicates: Iterable[DatatypeInvariantPredicate],
    *,
    shared_package: str,
    source_classifier: str,
    candidate: bool,
) -> DatatypeInvariantPredicate | None:
    base = f"{shared_package}.{source_classifier.replace('::', '.')}"
    expected = f"{base}_Candidate" if candidate else base
    matches = [item for item in predicates if item.source_object == expected]
    if len(matches) > 1:
        raise TypeCatalogError(
            f"ambiguous shared datatype invariant for {source_classifier}: "
            f"{[item.qualified_method for item in matches]}"
        )
    if not matches:
        return None
    # The transformed candidate companion has a distinct generated object name,
    # but semantically remains the invariant for the fixed-model classifier.
    return replace(matches[0], datatype=base) if candidate else matches[0]


def _invariant_predicate(
    predicates: Iterable[DatatypeInvariantPredicate], source_classifier: str
) -> DatatypeInvariantPredicate | None:
    suffix = source_classifier.replace("::", ".")
    matches = [
        item
        for item in predicates
        if item.datatype == suffix or item.datatype.endswith(f".{suffix}")
    ]
    if len(matches) > 1:
        raise TypeCatalogError(
            f"ambiguous generated datatype invariant for {source_classifier}: "
            f"{[item.qualified_method for item in matches]}"
        )
    return matches[0] if matches else None


def _is_present(binding: PredicateBinding | None, polarity: str) -> bool | None:
    if binding is None:
        return None
    synthetic = (
        binding.synthetic_true_assumption
        if polarity == "assumption"
        else binding.synthetic_true_guarantee
    )
    return not synthetic


def _neutral_carriers(
    *,
    root_index: int,
    side: str,
    generated: GeneratedRoot,
    predicates: Iterable[DatatypeInvariantPredicate],
    datatype_classifiers: set[str],
    temporary: Path,
    evidence: EvidenceBundle,
) -> tuple[NeutralCarrierAttestation, ...]:
    selected: dict[Path, set[str]] = defaultdict(set)
    for predicate in predicates:
        if any(
            predicate.datatype == classifier.replace("::", ".")
            or predicate.datatype.endswith(f".{classifier.replace('::', '.')}")
            for classifier in datatype_classifiers
        ):
            selected[predicate.source.resolve()].add(predicate.datatype.rsplit(".", 1)[-1])

    result: list[NeutralCarrierAttestation] = []
    records: list[Mapping[str, object]] = []
    for ordinal, (source, classes) in enumerate(sorted(selected.items(), key=lambda item: str(item[0]))):
        relative = source.relative_to(generated.project / "src" / "main")
        original_relative = evidence.archive_copy(
            source,
            f"generated/root-{root_index}/{side}-original/{relative.as_posix()}",
            kind="generated-original-invariant",
        )
        neutral = temporary / f"root-{root_index}-{side}-{ordinal}-{source.name}"
        record = neutralize_datatype_source(
            source, neutral, class_names=tuple(sorted(classes))
        )
        neutral_relative = evidence.archive_copy(
            neutral,
            f"generated/root-{root_index}/{side}-neutral/{relative.as_posix()}",
            kind="generated-neutral-carrier",
        )
        result.append(NeutralCarrierAttestation.from_record(side, record))
        archived_record = to_json(record)
        archived_record["source"] = original_relative
        archived_record["neutral_source"] = neutral_relative
        records.append(archived_record)
    if records:
        evidence.write_json(
            f"generated/root-{root_index}/{side}-neutralization.json",
            {"records": records},
            kind="generated-neutralization-audit",
        )
    return tuple(result)


def _target_for_source(
    source: Path,
    *,
    oracle_project: Path,
    candidate_project: Path,
    replay_project: Path,
) -> Path:
    source = source.resolve()
    replay_main = replay_project.resolve() / "src" / "main"
    try:
        source.relative_to(replay_main)
    except ValueError:
        pass
    else:
        if source.is_file():
            return source
    for project in (oracle_project.resolve(), candidate_project.resolve()):
        try:
            relative = source.relative_to(project / "src" / "main")
        except ValueError:
            continue
        target = replay_project / "src" / "main" / relative
        if target.is_file():
            return target
    raise CheckerInfrastructureError(f"generated predicate source was not replayed: {source}")


def _rebase_phase(
    phase: ResolvedPhaseBinding,
    *,
    oracle_project: Path,
    candidate_project: Path,
    replay_project: Path,
    evidence_root: Path,
) -> ResolvedPhaseBinding:
    binding = phase.binding
    if binding.generated_source is None:
        return phase
    target = _target_for_source(
        Path(binding.generated_source),
        oracle_project=oracle_project,
        candidate_project=candidate_project,
        replay_project=replay_project,
    )
    return replace(
        phase,
        binding=replace(
            binding,
            generated_source=str(target.relative_to(evidence_root)),
            generated_sha256=sha256_file(target),
        ),
    )


def _rebase_resolved(
    resolved: ResolvedUnitBinding,
    *,
    oracle_project: Path,
    candidate_project: Path,
    replay_project: Path,
    evidence_root: Path,
) -> ResolvedUnitBinding:
    oracle = _rebase_phase(
        resolved.oracle,
        oracle_project=oracle_project,
        candidate_project=candidate_project,
        replay_project=replay_project,
        evidence_root=evidence_root,
    )
    candidate = _rebase_phase(
        resolved.candidate,
        oracle_project=oracle_project,
        candidate_project=candidate_project,
        replay_project=replay_project,
        evidence_root=evidence_root,
    )
    return replace(
        resolved,
        unit=replace(resolved.unit, oracle=oracle.binding, candidate=candidate.binding),
        oracle=oracle,
        candidate=candidate,
    )


class GeneralizedComparisonBackend:
    def __init__(
        self,
        *,
        sireum_home: Path | None = None,
        library: Path = DEFAULT_LIBRARY,
    ) -> None:
        self.sireum_home = sireum_home
        self.library = library

    def compare(
        self, request: CompareRequest, evidence: EvidenceBundle
    ) -> BackendOutcome:
        timeout = max(1, math.ceil(request.timeout_seconds))
        inventory_pair: tuple[Inventory, Inventory] | None = None
        try:
            with _measure(request, "inventory-original-pair"):
                oracle_inventory, candidate_inventory = run_inventories(
                    (request.archived_oracle, request.archived_candidate),
                    sireum_home=self.sireum_home,
                    library_dir=self.library,
                    timeout=timeout,
                )
            inventory_pair = (oracle_inventory, candidate_inventory)
        except (InventoryInvalidInput, InventoryTimeout) as error:
            return BackendOutcome(
                run_status=RunStatus.INCONCLUSIVE,
                diagnostics=(f"{type(error).__name__}: {error}",),
                invalid_input=isinstance(error, InventoryInvalidInput),
            )

        inventories = (
            _inventory_json(oracle_inventory),
            _inventory_json(candidate_inventory),
        )
        with tempfile.TemporaryDirectory(prefix="equiv-generalized-") as temporary_text:
            temporary = Path(temporary_text)
            try:
                with _measure(request, "model-gate-pair"):
                    raw_oracle, raw_candidate = fingerprint_models(
                        (request.archived_oracle, request.archived_candidate),
                        sireum_home=self.sireum_home,
                        library_dir=self.library,
                        output_paths=(
                            temporary / "oracle-canonical.json",
                            temporary / "candidate-canonical.json",
                        ),
                        timeout=timeout,
                    )
            except (InventoryInvalidInput, InventoryTimeout, ModelGateError) as error:
                return BackendOutcome(
                    run_status=RunStatus.INCONCLUSIVE,
                    diagnostics=(f"{type(error).__name__}: {error}",),
                    oracle_inventory=inventories[0],
                    candidate_inventory=inventories[1],
                    invalid_input=isinstance(
                        error, (InventoryInvalidInput, ModelGateInvalidInput)
                    ),
                )

            model_comparison = compare_model_fingerprints(raw_oracle, raw_candidate)
            oracle_fingerprint = _archive_fingerprint(
                label="oracle",
                raw=raw_oracle,
                input_file=request.archived_oracle,
                artifact=temporary / "oracle-canonical.json",
                evidence=evidence,
            )
            candidate_fingerprint = _archive_fingerprint(
                label="candidate",
                raw=raw_candidate,
                input_file=request.archived_candidate,
                artifact=temporary / "candidate-canonical.json",
                evidence=evidence,
            )

            if not model_comparison.matches:
                plan = ComparisonPlan(
                    oracle_input=str(request.oracle),
                    candidate_input=str(request.candidate),
                    oracle_fingerprint=oracle_fingerprint,
                    candidate_fingerprint=candidate_fingerprint,
                    roots=_inventory_root_labels(oracle_inventory),
                    types=_source_types(oracle_inventory),
                    units=(),
                    coverage_complete=False,
                    coverage_gaps=(model_comparison.reason or "resolved model mismatch",),
                )
                return BackendOutcome(
                    run_status=RunStatus.COMPLETED,
                    plan=plan,
                    model_equivalent=False,
                    diagnostics=(model_comparison.reason or "resolved model mismatch",),
                    oracle_inventory=inventories[0],
                    candidate_inventory=inventories[1],
                )

            try:
                units = pair_inventories(oracle_inventory, candidate_inventory)
            except InventoryModelMismatch as error:
                # The parser-certified contract-erased AIR gate already
                # established M* equality.  A contradictory inventory gate is
                # therefore an evaluator inconsistency, never a model verdict.
                return BackendOutcome(
                    run_status=RunStatus.ERROR,
                    plan=_provisional_plan(
                        request=request,
                        oracle_fingerprint=oracle_fingerprint,
                        candidate_fingerprint=candidate_fingerprint,
                        inventory=oracle_inventory,
                        units=(),
                        gaps=(str(error),),
                    ),
                    diagnostics=(f"resolved inventory contradicts model gate: {error}",),
                    oracle_inventory=inventories[0],
                    candidate_inventory=inventories[1],
                )

            gaps = _coverage_gaps(oracle_inventory, candidate_inventory, units)
            if gaps:
                return BackendOutcome(
                    run_status=RunStatus.INCONCLUSIVE,
                    plan=_provisional_plan(
                        request=request,
                        oracle_fingerprint=oracle_fingerprint,
                        candidate_fingerprint=candidate_fingerprint,
                        inventory=oracle_inventory,
                        units=units,
                        gaps=gaps,
                    ),
                    diagnostics=tuple(f"coverage gap: {item}" for item in gaps),
                    oracle_inventory=inventories[0],
                    candidate_inventory=inventories[1],
                )

            if not units:
                if not all(
                    _certifies_empty_contract_semantics(inventory)
                    for inventory in (oracle_inventory, candidate_inventory)
                ):
                    reason = (
                        "empty proof-unit inventory is not backed by an empty-contract "
                        "certificate on both sides"
                    )
                    return BackendOutcome(
                        run_status=RunStatus.ERROR,
                        plan=_provisional_plan(
                            request=request,
                            oracle_fingerprint=oracle_fingerprint,
                            candidate_fingerprint=candidate_fingerprint,
                            inventory=oracle_inventory,
                            units=(),
                            gaps=(reason,),
                        ),
                        diagnostics=(reason,),
                        oracle_inventory=inventories[0],
                        candidate_inventory=inventories[1],
                    )
                plan = ComparisonPlan(
                    oracle_input=str(request.oracle),
                    candidate_input=str(request.candidate),
                    oracle_fingerprint=oracle_fingerprint,
                    candidate_fingerprint=candidate_fingerprint,
                    roots=_inventory_root_labels(oracle_inventory),
                    types=(),
                    units=(),
                    coverage_complete=True,
                )
                return BackendOutcome(
                    run_status=RunStatus.COMPLETED,
                    plan=plan,
                    model_equivalent=True,
                    oracle_inventory=inventories[0],
                    candidate_inventory=inventories[1],
                )

            try:
                codegen_roots = select_codegen_roots(
                    oracle_inventory, candidate_inventory, units
                )
            except InventoryError as error:
                return BackendOutcome(
                    run_status=RunStatus.INCONCLUSIVE,
                    plan=_provisional_plan(
                        request=request,
                        oracle_fingerprint=oracle_fingerprint,
                        candidate_fingerprint=candidate_fingerprint,
                        inventory=oracle_inventory,
                        units=units,
                        gaps=(str(error),),
                    ),
                    diagnostics=(f"cannot select proof roots: {error}",),
                    oracle_inventory=inventories[0],
                    candidate_inventory=inventories[1],
                )

            sireum = resolve_sireum_executable(self.sireum_home)
            with _measure(request, "semantic-export-pair"):
                oracle_generated, candidate_generated = generate_sides(
                    oracle_source=request.archived_oracle,
                    candidate_source=request.archived_candidate,
                    roots=codegen_roots,
                    workspace=temporary / "codegen",
                    sireum=sireum,
                    library=self.library,
                    timeout=timeout,
                    repo_root=REPO_ROOT,
                )
            try:
                _validate_generated_side(oracle_generated, codegen_roots)
                _validate_generated_side(candidate_generated, codegen_roots)
            except UnsupportedComparison as error:
                return BackendOutcome(
                    run_status=RunStatus.INCONCLUSIVE,
                    plan=_provisional_plan(
                        request=request,
                        oracle_fingerprint=oracle_fingerprint,
                        candidate_fingerprint=candidate_fingerprint,
                        inventory=oracle_inventory,
                        units=units,
                        gaps=(str(error),),
                    ),
                    diagnostics=(str(error),),
                    oracle_inventory=inventories[0],
                    candidate_inventory=inventories[1],
                )
            evidence.write_json(
                "logs/semantic-export-oracle.json",
                _command_json(oracle_generated),
                kind="log-semantic-export",
            )
            evidence.write_json(
                "logs/semantic-export-candidate.json",
                _command_json(candidate_generated),
                kind="log-semantic-export",
            )

            try:
                return self._prove(
                    request=request,
                    evidence=evidence,
                    temporary=temporary,
                    sireum=sireum,
                    timeout=timeout,
                    oracle_inventory=oracle_inventory,
                    candidate_inventory=candidate_inventory,
                    oracle_fingerprint=oracle_fingerprint,
                    candidate_fingerprint=candidate_fingerprint,
                    units=units,
                    oracle_generated=oracle_generated,
                    candidate_generated=candidate_generated,
                    inventories=inventories,
                    codegen_roots=codegen_roots,
                )
            except (UnsupportedComparison, GeneratedSemanticGap, TypeCatalogError) as error:
                return BackendOutcome(
                    run_status=RunStatus.INCONCLUSIVE,
                    plan=_provisional_plan(
                        request=request,
                        oracle_fingerprint=oracle_fingerprint,
                        candidate_fingerprint=candidate_fingerprint,
                        inventory=oracle_inventory,
                        units=units,
                        gaps=(str(error),),
                    ),
                    diagnostics=(f"unsupported semantic comparison: {error}",),
                    oracle_inventory=inventories[0],
                    candidate_inventory=inventories[1],
                )
            finally:
                # Proof tools write in place.  Reconcile every partial file so
                # an exceptional run is still a sealed, auditable bundle
                # rather than failing finalization because of hidden output.
                evidence.register_tree("generated", kind="dependency-partial")
                evidence.register_tree("logs", kind="log-partial")

    def _prove(
        self,
        *,
        request: CompareRequest,
        evidence: EvidenceBundle,
        temporary: Path,
        sireum: Path,
        timeout: int,
        oracle_inventory: Inventory,
        candidate_inventory: Inventory,
        oracle_fingerprint: ModelFingerprint,
        candidate_fingerprint: ModelFingerprint,
        units: tuple[ComparisonUnit, ...],
        oracle_generated: GeneratedSide,
        candidate_generated: GeneratedSide,
        inventories: tuple[Mapping[str, object], Mapping[str, object]],
        codegen_roots: tuple[str, ...],
    ) -> BackendOutcome:
        normalized: dict[str, NormalizedType] = {}
        resolved_by_key: dict[str, ResolvedUnitBinding] = {}
        final_resolved: dict[str, ResolvedUnitBinding] = {}
        results: dict[str, UnitResult] = {}
        neutralization_evidence: list[str] = []
        datatype_units = tuple(
            unit for unit in units if unit.kind is UnitKind.DATATYPE_INVARIANT
        )
        datatype_classifiers = {unit.classifier for unit in datatype_units}
        logika = ResidentLogikaBackend(
            sireum,
            timings=request.timings,
            restart_after_run=True,
            minimum_available_memory_fraction=0.25,
        )

        units_by_root = _assign_units_to_roots(
            oracle_inventory, codegen_roots, units
        )

        for root_index, (oracle_root, candidate_root) in enumerate(
            zip(oracle_generated.roots, candidate_generated.roots, strict=True)
        ):
            if oracle_root.root != candidate_root.root:
                raise CheckerInfrastructureError("generated root order differs between sides")
            root = oracle_root.root
            oracle_catalog = catalog_types(oracle_root.project)
            candidate_catalog = catalog_types(candidate_root.project)
            oracle_invariants = discover_datatype_invariants(oracle_root.project)
            candidate_invariants = discover_datatype_invariants(candidate_root.project)

            root_units = units_by_root[root]
            aligned_by_key: dict[str, ComparisonUnit] = {}
            for unit in root_units:
                scope = (
                    f"root::{root}"
                    if unit.kind is not UnitKind.DATATYPE_INVARIANT
                    else f"root::{root}/datatype"
                )
                aligned = _align_unit(
                    unit,
                    scope=scope,
                    oracle_catalog=oracle_catalog,
                    candidate_catalog=candidate_catalog,
                    normalized=normalized,
                )
                if aligned.oracle is None or aligned.candidate is None:
                    raise GeneratedSemanticGap(f"unit has no inventory binding: {unit.key}")
                aligned_by_key[unit.key] = aligned

            neutral_dir = temporary / "neutral"
            neutral_dir.mkdir(exist_ok=True)
            neutralizations = _neutral_carriers(
                root_index=root_index,
                side="oracle",
                generated=oracle_root,
                predicates=oracle_invariants,
                datatype_classifiers=datatype_classifiers,
                temporary=neutral_dir,
                evidence=evidence,
            )
            replay_relative = f"generated/root-{root_index}/proof-project"
            replay_path = evidence.root / replay_relative
            replay = create_shared_replay_project(
                oracle_project=oracle_root.project,
                candidate_project=candidate_root.project,
                oracle_package=oracle_root.package_name,
                candidate_package=candidate_root.package_name,
                destination=replay_path,
                required_neutral_sources=tuple(
                    item.generated_source for item in neutralizations
                ),
                neutralizations=neutralizations,
                candidate_invariants=tuple(
                    CandidateInvariantRewrite(
                        source=item.source,
                        source_object=item.source_object,
                        method_name=item.method_name,
                    )
                    for item in candidate_invariants
                ),
            )
            neutralization_evidence.append(evidence.write_json(
                f"generated/root-{root_index}/replay-neutralization.json",
                {
                    "required_source_sha256": [
                        item.source_sha256 for item in neutralizations
                    ],
                    "replacements": [
                        {
                            "side": item.side,
                            "original_source": (
                                f"generated/root-{root_index}/{item.side}-original/"
                                + str(
                                    item.generated_source.relative_to(
                                        (
                                            oracle_root.project
                                        )
                                        / "src"
                                        / "main"
                                    )
                                )
                            ),
                            "neutral_source": (
                                f"generated/root-{root_index}/{item.side}-neutral/"
                                + str(
                                    item.generated_source.relative_to(
                                        (
                                            oracle_root.project
                                        )
                                        / "src"
                                        / "main"
                                    )
                                )
                            ),
                            "source_sha256": item.source_sha256,
                            "neutral_sha256": item.neutral_sha256,
                            "staged_sha256": item.staged_sha256,
                            "staged_source": str(
                                item.staged_source.relative_to(evidence.root)
                            ),
                            "preserved_predicate_sha256": dict(
                                item.preserved_predicate_sha256
                            ),
                        }
                        for item in replay.neutralization_records
                    ],
                    "disabled_container_adapters": [
                        {
                            "source": str(item.source.relative_to(evidence.root)),
                            "method": item.method_name,
                            "original_body_sha256": item.original_body_sha256,
                            "replacement_body_sha256": item.replacement_body_sha256,
                        }
                        for item in replay.disabled_container_adapters
                    ],
                },
                kind="generated-neutralization-attestation",
            ))

            shared_objects = _gumbox_index(replay.project)
            shared_invariants = discover_datatype_invariants(replay.project)
            for unit in root_units:
                aligned = aligned_by_key[unit.key]
                assert aligned.oracle is not None and aligned.candidate is not None
                if aligned.kind is UnitKind.DATATYPE_INVARIANT:
                    resolved = bind_resolved_datatype_unit(
                        unit=aligned,
                        oracle_predicate=_shared_invariant_predicate(
                            shared_invariants,
                            shared_package=oracle_root.package_name,
                            source_classifier=aligned.classifier,
                            candidate=False,
                        ),
                        candidate_predicate=_shared_invariant_predicate(
                            shared_invariants,
                            shared_package=oracle_root.package_name,
                            source_classifier=aligned.classifier,
                            candidate=True,
                        ),
                        oracle_invariant_present=_is_present(aligned.oracle, "guarantee"),
                        candidate_invariant_present=_is_present(
                            aligned.candidate, "guarantee"
                        ),
                        candidate_method_suffix="_Candidate",
                    )
                else:
                    resolved = bind_resolved_unit(
                        unit=aligned,
                        oracle_owner=_shared_component_owner(
                            shared_package=oracle_root.package_name,
                            objects=shared_objects,
                            binding=aligned.oracle,
                            candidate=False,
                        ),
                        candidate_owner=_shared_component_owner(
                            shared_package=oracle_root.package_name,
                            objects=shared_objects,
                            binding=aligned.candidate,
                            candidate=True,
                        ),
                        oracle_assumption_present=_is_present(
                            aligned.oracle, "assumption"
                        ),
                        oracle_guarantee_present=_is_present(
                            aligned.oracle, "guarantee"
                        ),
                        candidate_assumption_present=_is_present(
                            aligned.candidate, "assumption"
                        ),
                        candidate_guarantee_present=_is_present(
                            aligned.candidate, "guarantee"
                        ),
                        candidate_owner_suffix="_Candidate",
                    )
                if resolved.unit.key in resolved_by_key:
                    raise CheckerInfrastructureError(
                        f"unit was assigned to multiple generated roots: {resolved.unit.key}"
                    )
                resolved_by_key[resolved.unit.key] = resolved
            proof_snapshot = evidence.snapshot_tree(replay_relative)

            for unit in root_units:
                resolved = resolved_by_key[unit.key]
                unit_dir = (
                    replay.project
                    / "src"
                    / "main"
                    / "bridge"
                    / "equiv_checker"
                    / "proofs"
                    / _safe_name(unit.key)
                )
                proof: GeneratedUnitProof = generate_unit_proof(
                    resolved,
                    normalized,
                    unit_dir,
                    proof_package="equiv_checker.proofs",
                )
                logs_relative = f"logs/units/root-{root_index}/{_safe_name(unit.key)}"
                logs_path = evidence.root / logs_relative
                result = execute_unit_proof(
                    backend=logika,
                    project=replay.project,
                    proof=proof,
                    timeout=timeout,
                    evidence_dir=logs_path,
                    evidence_base=evidence.root,
                    run_health_checks=request.run_health_checks,
                )
                results[unit.key] = result
                evidence.register_tree(logs_relative, kind="log-proof")

                final_resolved[unit.key] = _rebase_resolved(
                    resolved,
                    oracle_project=oracle_root.project,
                    candidate_project=candidate_root.project,
                    replay_project=replay.project,
                    evidence_root=evidence.root,
                )

            evidence.register_tree(
                replay_relative,
                kind="dependency-proof-project",
                pre_execution=proof_snapshot,
            )

        close_logika = getattr(logika, "close", None)
        if callable(close_logika):
            close_logika()

        missing = [unit.key for unit in units if unit.key not in results]
        if missing:
            raise CheckerInfrastructureError(
                f"no generated proof result for units: {missing}"
            )
        ordered_units = tuple(final_resolved[unit.key].unit for unit in units)
        plan = ComparisonPlan(
            oracle_input=str(request.oracle),
            candidate_input=str(request.candidate),
            oracle_fingerprint=oracle_fingerprint,
            candidate_fingerprint=candidate_fingerprint,
            roots=codegen_roots,
            types=tuple(normalized[key] for key in sorted(normalized)),
            units=ordered_units,
            coverage_complete=True,
            neutralization_evidence=tuple(neutralization_evidence),
        )
        plan.validate()
        return BackendOutcome(
            run_status=RunStatus.COMPLETED,
            plan=plan,
            unit_results=tuple(results[unit.key] for unit in units),
            model_equivalent=True,
            oracle_inventory=inventories[0],
            candidate_inventory=inventories[1],
        )


def create_backend() -> GeneralizedComparisonBackend:
    return GeneralizedComparisonBackend()


__all__ = [
    "CheckerInfrastructureError",
    "GeneralizedComparisonBackend",
    "UnsupportedComparison",
    "create_backend",
]
