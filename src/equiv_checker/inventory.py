"""Resolved GUMBO inventory loading and concrete-instance unit pairing."""

from __future__ import annotations

from dataclasses import dataclass
import json
from pathlib import Path
import subprocess
import tempfile
from typing import Any, Iterable, Mapping, Sequence
from urllib.parse import unquote, urlparse

from sysml_tools.gumbo import resolve_sireum_toolchain
from equiv_checker.schema import (
    ClauseProvenance,
    ComparisonUnit,
    NormalizedType,
    Observation,
    ObservationRole,
    PredicateBinding,
    SourceLocation,
    UnitKind,
    WriteFootprint,
)


REPO_ROOT = Path(__file__).resolve().parents[2]
INVENTORY_ADAPTER = Path(__file__).parent / "adapters" / "GumboInventory.scala"
DEFAULT_LIBRARY = REPO_ROOT / "external" / "sysml-aadl-libraries"
SUPPORTED_SCHEMA_MAJORS = frozenset({1, 2})


def _mapping(value: Any, label: str) -> Mapping[str, Any]:
    if not isinstance(value, Mapping):
        raise InventoryError(f"{label} is not a JSON object")
    return value


def _sequence(value: Any, label: str) -> Sequence[Any]:
    if isinstance(value, (str, bytes)) or not isinstance(value, Sequence):
        raise InventoryError(f"{label} is not a JSON array")
    return value


def _required_text(value: Mapping[str, Any], key: str) -> str:
    item = value.get(key)
    if not isinstance(item, str) or not item:
        raise InventoryError(f"inventory field {key!r} must be a non-empty string")
    return item


def _boolean(value: Any, label: str) -> bool:
    if not isinstance(value, bool):
        raise InventoryError(f"{label} must be a JSON boolean")
    return value


def _nonnegative_int(value: Any, label: str) -> int:
    if isinstance(value, bool) or not isinstance(value, int) or value < 0:
        raise InventoryError(f"{label} must be a non-negative JSON integer")
    return value


class InventoryError(RuntimeError):
    """The inventory tool did not produce trustworthy evidence."""


class InventoryInvalidInput(InventoryError):
    """Sireum rejected the supplied SysML model."""


class InventoryModelMismatch(InventoryError):
    """Resolved non-contract model inventories are not the same."""


class InventoryTimeout(InventoryError):
    """Sireum did not finish within the configured bound."""


@dataclass(frozen=True)
class InventoryClause:
    owner: str
    phase: str
    kind: str
    clause_id: str
    scope: str | None = None
    trace_ids: tuple[str, ...] = ()
    source: SourceLocation | None = None
    supported: bool = True
    unsupported_reason: str | None = None

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "InventoryClause":
        supported = _boolean(value.get("supported", True), "clause supported")
        reason = value.get("unsupported_reason")
        if reason is not None and (not isinstance(reason, str) or not reason):
            raise InventoryError("unsupported clause reason must be non-empty text")
        if supported == (reason is not None):
            raise InventoryError("clause support flag and unsupported reason disagree")
        return cls(
            owner=_required_text(value, "owner"),
            phase=_required_text(value, "phase"),
            kind=_required_text(value, "kind"),
            clause_id=_required_text(
                value, "clause_id" if "clause_id" in value else "id"
            ),
            scope=str(value["scope"]) if value.get("scope") is not None else None,
            trace_ids=tuple(str(item) for item in value.get("trace_ids", ())),
            source=_source_location(value.get("source")),
            supported=supported,
            unsupported_reason=reason,
        )

    def provenance(self) -> ClauseProvenance:
        return ClauseProvenance(
            clause_id=self.clause_id,
            kind=self.kind,
            trace_ids=self.trace_ids,
            source=self.source,
        )


@dataclass(frozen=True)
class InventoryObservation:
    name: str
    role: str
    qualified_type: str

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "InventoryObservation":
        return cls(
            name=_required_text(value, "name"),
            role=_required_text(value, "role"),
            qualified_type=_required_text(value, "qualified_type"),
        )


@dataclass(frozen=True)
class InventoryState:
    classifier: str
    name: str
    qualified_type: str
    source: SourceLocation | None = None

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "InventoryState":
        return cls(
            classifier=_required_text(value, "classifier"),
            name=_required_text(value, "name"),
            qualified_type=_required_text(value, "qualified_type"),
            source=_source_location(value.get("source")),
        )


@dataclass(frozen=True)
class InventoryWriteFootprint:
    classifier: str
    phase: str
    restricted: bool
    targets: tuple[str, ...]

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "InventoryWriteFootprint":
        targets = tuple(
            _required_text({"value": item}, "value")
            for item in _sequence(value.get("targets", ()), "write targets")
        )
        if len(targets) != len(set(targets)):
            raise InventoryError("write footprint contains duplicate targets")
        restricted = _boolean(value.get("restricted", False), "write restriction")
        if not restricted and targets:
            raise InventoryError("unrestricted write footprint cannot contain targets")
        phase = _required_text(value, "phase")
        if phase not in {"initialize", "compute"}:
            raise InventoryError(f"unsupported write-footprint phase: {phase}")
        return cls(
            classifier=_required_text(value, "classifier"),
            phase=phase,
            restricted=restricted,
            targets=targets,
        )


@dataclass(frozen=True)
class InventoryRoot:
    instance_path: str
    classifier: str
    category: str
    type_names: tuple[str, ...]

    @property
    def key(self) -> tuple[str, str]:
        return (self.classifier, self.instance_path)

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "InventoryRoot":
        type_names = tuple(
            sorted(
                _required_text({"value": item}, "value")
                for item in _sequence(value.get("type_names", ()), "type_names")
            )
        )
        if len(type_names) != len(set(type_names)):
            raise InventoryError("root descriptor contains duplicate datatype names")
        return cls(
            instance_path=_required_text(value, "instance_path"),
            classifier=_required_text(value, "classifier"),
            category=_required_text(value, "category"),
            type_names=type_names,
        )


@dataclass(frozen=True)
class InventoryInstance:
    root: str
    root_instance_path: str
    instance_path: str
    classifier: str
    category: str
    observations: tuple[InventoryObservation, ...] = ()
    source: SourceLocation | None = None
    gumbox_object: str = ""
    gumbox_naming_authority: str = ""
    supported: bool = True
    unsupported_reasons: tuple[str, ...] = ()

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "InventoryInstance":
        observations = tuple(
            InventoryObservation.from_json(_mapping(item, "observation"))
            for item in _sequence(value.get("observations", ()), "observations")
        )
        names = [item.name for item in observations]
        if len(names) != len(set(names)):
            raise InventoryError(
                f"duplicate observation name on {value.get('instance_path', '<unknown>')}"
            )
        reasons = tuple(
            str(item)
            for item in _sequence(value.get("unsupported_reasons", ()), "unsupported_reasons")
        )
        supported = _boolean(value.get("supported", True), "instance supported")
        if supported == bool(reasons):
            raise InventoryError("instance support flag and unsupported reasons disagree")
        return cls(
            root=_required_text(value, "root"),
            root_instance_path=_required_text(value, "root_instance_path"),
            instance_path=_required_text(value, "instance_path"),
            classifier=_required_text(value, "classifier"),
            category=_required_text(value, "category"),
            observations=observations,
            source=_source_location(value.get("source")),
            gumbox_object=_required_text(value, "gumbox_object"),
            gumbox_naming_authority=_required_text(value, "gumbox_naming_authority"),
            supported=supported,
            unsupported_reasons=reasons,
        )


@dataclass(frozen=True)
class InventoryType:
    qualified_name: str
    kind: str
    fields: tuple[tuple[str, str], ...] = ()
    literals: tuple[str, ...] = ()
    element_type: str | None = None
    dimensions: tuple[int, ...] = ()
    array_size_kind: str | None = None
    supported: bool = True
    unsupported_reason: str | None = None

    @property
    def key(self) -> str:
        return self.qualified_name

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "InventoryType":
        fields = tuple(
            (str(item["name"]), str(item["qualified_type"]))
            for item in value.get("fields", ())
        )
        dimensions = tuple(int(item) for item in value.get("dimensions", ()))
        reason = value.get("unsupported_reason")
        supported = _boolean(value.get("supported", True), "type supported")
        if len(dimensions) > 1:
            supported = False
            reason = reason or "multidimensional arrays are not in the first-slice comparison catalog"
        if reason is not None and (not isinstance(reason, str) or not reason):
            raise InventoryError("unsupported datatype reason must be non-empty text")
        if supported == (reason is not None):
            raise InventoryError("datatype support flag and unsupported reason disagree")
        kind = _required_text(value, "kind")
        if kind not in {"scalar", "enum", "record", "bounded-sequence", "unknown"}:
            raise InventoryError(f"unknown normalized datatype kind: {kind}")
        return cls(
            qualified_name=_required_text(value, "qualified_name"),
            kind=kind,
            fields=fields,
            literals=tuple(str(item) for item in value.get("literals", ())),
            element_type=(
                str(value["element_type"])
                if value.get("element_type") is not None
                else None
            ),
            dimensions=dimensions,
            array_size_kind=(
                str(value["array_size_kind"])
                if value.get("array_size_kind") is not None
                else None
            ),
            supported=supported,
            unsupported_reason=str(reason) if reason is not None else None,
        )

    def normalized(self) -> NormalizedType:
        bound = self.dimensions[0] if len(self.dimensions) == 1 else None
        return NormalizedType(
            key=self.key,
            kind=self.kind,
            qualified_name=self.qualified_name,
            fields=self.fields,
            literals=self.literals,
            element_type=self.element_type,
            bound=bound,
            recursive=False,
            supported=self.supported,
            unsupported_reason=self.unsupported_reason,
        )


@dataclass(frozen=True)
class ContractOwner:
    classifier: str
    phase: str
    source_object: str
    source: SourceLocation | None
    assumption_count: int
    guarantee_count: int
    case_count: int
    contributor_count: int
    supported: bool = True
    unsupported_reasons: tuple[str, ...] = ()

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "ContractOwner":
        reasons = tuple(
            str(item)
            for item in _sequence(value.get("unsupported_reasons", ()), "unsupported_reasons")
        )
        supported = _boolean(value.get("supported", True), "owner supported")
        if supported == bool(reasons):
            raise InventoryError("owner support flag and unsupported reasons disagree")
        return cls(
            classifier=_required_text(value, "classifier"),
            phase=_required_text(value, "phase"),
            source_object=_required_text(value, "source_object"),
            source=_source_location(value.get("source")),
            assumption_count=_nonnegative_int(
                value.get("assumption_count", 0), "assumption_count"
            ),
            guarantee_count=_nonnegative_int(
                value.get("guarantee_count", 0), "guarantee_count"
            ),
            case_count=_nonnegative_int(value.get("case_count", 0), "case_count"),
            contributor_count=_nonnegative_int(
                value.get("contributor_count", 0), "contributor_count"
            ),
            supported=supported,
            unsupported_reasons=reasons,
        )


@dataclass(frozen=True)
class Inventory:
    schema_version: str
    semantic_authority: str
    sireum_version: str
    roots: tuple[InventoryRoot, ...]
    instances: tuple[InventoryInstance, ...]
    types: tuple[InventoryType, ...]
    clauses: tuple[InventoryClause, ...]
    contract_owners: tuple[ContractOwner, ...]
    states: tuple[InventoryState, ...]
    write_footprints: tuple[InventoryWriteFootprint, ...]
    coverage_gaps: tuple[str, ...]
    declared_clause_count: int
    supported_clause_count: int
    resolved_models: tuple[Mapping[str, Any], ...] = ()

    @classmethod
    def from_json(cls, value: Mapping[str, Any]) -> "Inventory":
        schema = str(
            value.get("inventory_schema_version", value.get("schema_version", ""))
        )
        try:
            major = int(schema.split(".", 1)[0])
        except (ValueError, IndexError) as error:
            raise InventoryError(f"invalid inventory schema version: {schema!r}") from error
        if major not in SUPPORTED_SCHEMA_MAJORS:
            raise InventoryError(f"unsupported inventory schema version: {schema}")
        authority = _required_text(value, "semantic_authority")
        if "FrontEnd.typeCheck" not in authority:
            raise InventoryError(
                "inventory does not identify Sireum FrontEnd.typeCheck as semantic authority"
            )
        roots = tuple(
            sorted(
                (
                    InventoryRoot.from_json(_mapping(item, "root"))
                    for item in _sequence(value.get("roots", ()), "roots")
                ),
                key=lambda item: item.key,
            )
        )
        root_keys = [item.key for item in roots]
        if not roots or len(root_keys) != len(set(root_keys)):
            raise InventoryError("inventory root descriptors must be non-empty and unique")
        clauses = tuple(
            InventoryClause.from_json(_mapping(item, "clause"))
            for item in _sequence(value.get("records", ()), "records")
        )
        declared = _nonnegative_int(
            value.get("declared_clause_count", len(clauses)), "declared_clause_count"
        )
        supported = _nonnegative_int(
            value.get("supported_clause_count", sum(item.supported for item in clauses)),
            "supported_clause_count",
        )
        if declared != len(clauses):
            raise InventoryError(
                f"inventory clause accounting mismatch: declared={declared}, records={len(clauses)}"
            )
        if supported != sum(item.supported for item in clauses):
            raise InventoryError(
                "inventory supported-clause accounting does not match its records"
            )
        instances = tuple(
            sorted(
                (
                    InventoryInstance.from_json(_mapping(item, "instance"))
                    for item in _sequence(value.get("instances", ()), "instances")
                ),
                key=lambda item: (item.root, item.root_instance_path, item.instance_path),
            )
        )
        instance_keys = [
            (item.root, item.root_instance_path, item.instance_path) for item in instances
        ]
        if len(instance_keys) != len(set(instance_keys)):
            raise InventoryError("inventory contains duplicate concrete component instances")
        unknown_roots = sorted(
            {(item.root, item.root_instance_path) for item in instances} - set(root_keys)
        )
        if unknown_roots:
            raise InventoryError(f"instances reference unknown roots: {unknown_roots}")
        types = tuple(
            sorted(
                (
                    InventoryType.from_json(_mapping(item, "type"))
                    for item in _sequence(value.get("types", ()), "types")
                ),
                key=lambda item: item.qualified_name,
            )
        )
        type_names = [item.qualified_name for item in types]
        if len(type_names) != len(set(type_names)):
            raise InventoryError("inventory contains duplicate qualified datatype names")
        owners = tuple(
            sorted(
                (
                    ContractOwner.from_json(_mapping(item, "contract owner"))
                    for item in _sequence(
                        value.get("contract_owners", ()), "contract_owners"
                    )
                ),
                key=lambda item: (item.classifier, item.phase),
            )
        )
        owner_keys = [(item.classifier, item.phase) for item in owners]
        if len(owner_keys) != len(set(owner_keys)):
            raise InventoryError("inventory contains duplicate contract owner/phase records")
        states = tuple(
            sorted(
                (
                    InventoryState.from_json(_mapping(item, "state declaration"))
                    for item in _sequence(
                        value.get("state_declarations", ()), "state_declarations"
                    )
                ),
                key=lambda item: (item.classifier, item.name),
            )
        )
        state_keys = [(item.classifier, item.name) for item in states]
        if len(state_keys) != len(set(state_keys)):
            raise InventoryError("inventory contains duplicate state declarations")
        write_footprints = tuple(
            sorted(
                (
                    InventoryWriteFootprint.from_json(_mapping(item, "write footprint"))
                    for item in _sequence(
                        value.get("write_footprints", ()), "write_footprints"
                    )
                ),
                key=lambda item: (item.classifier, item.phase),
            )
        )
        footprint_keys = [(item.classifier, item.phase) for item in write_footprints]
        if len(footprint_keys) != len(set(footprint_keys)):
            raise InventoryError("inventory contains duplicate write footprints")
        state_names = {
            classifier: {item.name for item in states if item.classifier == classifier}
            for classifier, _ in state_keys
        }
        for footprint in write_footprints:
            unknown = set(footprint.targets) - state_names.get(footprint.classifier, set())
            if unknown:
                raise InventoryError(
                    f"write footprint for {(footprint.classifier, footprint.phase)} "
                    f"contains non-state targets: {sorted(unknown)}"
                )
        clause_keys = [
            (
                item.owner,
                item.phase,
                item.clause_id,
                item.source.uri if item.source else "",
                item.source.offset if item.source else None,
            )
            for item in clauses
        ]
        if len(clause_keys) != len(set(clause_keys)):
            raise InventoryError("inventory contains duplicate resolved clauses")
        owner_key_set = set(owner_keys)
        clause_owner_keys = {
            (item.owner, "compute" if item.phase == "compute-handler" else item.phase)
            for item in clauses
        }
        unowned = sorted(
            clause_owner_keys - owner_key_set
        )
        if unowned:
            raise InventoryError(f"resolved clauses have no owner/phase record: {unowned}")
        for owner in owners:
            direct = tuple(
                item
                for item in clauses
                if item.owner == owner.classifier and item.phase == owner.phase
            )
            assumptions = sum(item.kind == "assumption" for item in direct)
            guarantees = sum(
                item.kind in ({"invariant"} if owner.phase == "datatype-invariant" else {"guarantee"})
                for item in direct
            )
            cases = sum(item.kind == "case" for item in direct)
            actual = (assumptions, guarantees, cases)
            expected = (
                owner.assumption_count,
                owner.guarantee_count,
                owner.case_count,
            )
            if actual != expected:
                raise InventoryError(
                    f"owner clause accounting mismatch for {(owner.classifier, owner.phase)}: "
                    f"declared={expected}, records={actual}"
                )
        resolved_models = tuple(
            _mapping(item, "resolved model")
            for item in _sequence(value.get("resolved_models", ()), "resolved_models")
        )
        return cls(
            schema_version=schema,
            semantic_authority=authority,
            sireum_version=_required_text(value, "sireum_version"),
            roots=roots,
            instances=instances,
            types=types,
            clauses=clauses,
            contract_owners=owners,
            states=states,
            write_footprints=write_footprints,
            coverage_gaps=tuple(
                sorted(
                    str(item)
                    for item in value.get(
                        "coverage_gaps", value.get("first_slice_coverage_gaps", ())
                    )
                )
            ),
            declared_clause_count=declared,
            supported_clause_count=supported,
            resolved_models=resolved_models,
        )

    @property
    def coverage_complete(self) -> bool:
        return (
            not self.coverage_gaps
            and self.declared_clause_count == self.supported_clause_count
            and all(item.supported for item in self.instances)
            and all(item.supported for item in self.types)
            and all(item.supported for item in self.contract_owners)
        )

    def normalized_types(self) -> tuple[NormalizedType, ...]:
        return tuple(item.normalized() for item in self.types)


def _source_location(value: Any) -> SourceLocation | None:
    if not isinstance(value, Mapping):
        return None
    uri = str(value.get("uri", ""))
    if uri.startswith("file:"):
        parsed = urlparse(uri)
        uri = unquote(parsed.path)
    return SourceLocation(
        uri=uri,
        line=int(value.get("line", 0)),
        column=int(value.get("column", 0)),
        offset=int(value["offset"]) if value.get("offset") is not None else None,
    )


def load_inventory(path: Path | str) -> Inventory:
    source = Path(path)
    try:
        value = json.loads(source.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError) as error:
        raise InventoryError(f"could not read inventory {source}: {error}") from error
    if not isinstance(value, Mapping):
        raise InventoryError(f"inventory is not a JSON object: {source}")
    return Inventory.from_json(value)


def run_inventory(
    model: Path | str,
    *,
    sireum_home: Path | str | None = None,
    library_dir: Path | str | None = None,
    output_path: Path | str | None = None,
    timeout: int = 180,
) -> Inventory:
    """Run the resolved Sireum adapter and return a validated inventory."""

    return run_inventories(
        (model,),
        sireum_home=sireum_home,
        library_dir=library_dir,
        output_paths=(output_path,),
        timeout=timeout,
    )[0]


def run_inventories(
    models: Sequence[Path | str],
    *,
    sireum_home: Path | str | None = None,
    library_dir: Path | str | None = None,
    output_paths: Sequence[Path | str | None] | None = None,
    timeout: int = 180,
) -> tuple[Inventory, ...]:
    """Inventory several models in one Sireum JVM, preserving independent checks."""

    if not models:
        raise InventoryInvalidInput("inventory batch is empty")
    if output_paths is None:
        output_paths = tuple(None for _ in models)
    if len(output_paths) != len(models):
        raise InventoryError("inventory output count does not match model count")

    model_paths = tuple(Path(model).expanduser().resolve() for model in models)
    for model_path in model_paths:
        if model_path.is_file():
            if model_path.suffix != ".sysml":
                raise InventoryInvalidInput(
                    f"model input is not a .sysml file: {model_path}"
                )
        elif model_path.is_dir():
            if not any(model_path.rglob("*.sysml")):
                raise InventoryInvalidInput(
                    f"model input contains no .sysml files: {model_path}"
                )
        else:
            raise InventoryInvalidInput(f"model input does not exist: {model_path}")
    if timeout <= 0:
        raise InventoryError("inventory timeout must be positive")
    try:
        toolchain = resolve_sireum_toolchain(Path(sireum_home) if sireum_home else None)
    except (OSError, ValueError) as error:
        raise InventoryError(f"could not resolve Sireum toolchain: {error}") from error
    sireum = toolchain.home / "bin" / "sireum"
    library = Path(library_dir) if library_dir else DEFAULT_LIBRARY
    if not library.exists():
        raise InventoryError(f"SysML/AADL library directory does not exist: {library}")

    temporary: tempfile.TemporaryDirectory[str] | None = None
    if any(path is None for path in output_paths):
        temporary = tempfile.TemporaryDirectory(prefix="equiv-inventory-batch-")
    destinations: list[Path] = []
    for index, output_path in enumerate(output_paths):
        destination = (
            Path(output_path)
            if output_path is not None
            else Path(temporary.name) / f"inventory-{index}.json"  # type: ignore[union-attr]
        )
        destination.parent.mkdir(parents=True, exist_ok=True)
        destinations.append(destination.resolve())

    command = [
        str(sireum),
        "slang",
        "run",
        str(INVENTORY_ADAPTER),
        "--batch",
        str(library.resolve()),
    ]
    for model_path, destination in zip(model_paths, destinations, strict=True):
        command.extend((str(model_path), str(destination)))
    try:
        completed = subprocess.run(
            command,
            cwd=REPO_ROOT,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            timeout=timeout,
            check=False,
        )
    except subprocess.TimeoutExpired as error:
        if temporary is not None:
            temporary.cleanup()
        raise InventoryTimeout(
            f"Sireum inventory batch timed out after {timeout}s"
        ) from error
    except OSError as error:
        if temporary is not None:
            temporary.cleanup()
        raise InventoryError(f"could not execute Sireum inventory batch: {error}") from error
    if completed.returncode != 0:
        if temporary is not None:
            temporary.cleanup()
        detail = completed.stdout.strip()
        if "GUMBO_INVENTORY_RESULT=INVALID_INPUT" in detail:
            raise InventoryInvalidInput(detail)
        raise InventoryError(
            f"Sireum inventory batch failed with exit code {completed.returncode}: {detail}"
        )
    try:
        return tuple(load_inventory(destination) for destination in destinations)
    finally:
        if temporary is not None:
            temporary.cleanup()
def _role(value: str) -> ObservationRole:
    try:
        return ObservationRole(value)
    except ValueError as error:
        raise InventoryError(f"unknown observation role: {value}") from error


def _owner_index(inventory: Inventory) -> dict[tuple[str, str], ContractOwner]:
    result: dict[tuple[str, str], ContractOwner] = {}
    for owner in inventory.contract_owners:
        key = (owner.classifier, owner.phase)
        if key in result:
            raise InventoryError(f"duplicate contract owner/phase record: {key}")
        result[key] = owner
    return result


def _instance_index(
    inventory: Inventory,
) -> dict[tuple[str, str, str], InventoryInstance]:
    result: dict[tuple[str, str, str], InventoryInstance] = {}
    for instance in inventory.instances:
        key = (instance.root, instance.root_instance_path, instance.instance_path)
        if key in result:
            raise InventoryError(f"duplicate concrete component instance: {key}")
        result[key] = instance
    return result


def _clauses_for(
    inventory: Inventory, classifier: str, phase: str
) -> tuple[InventoryClause, ...]:
    phases = {phase}
    if phase == "compute":
        phases.add("integration")
    return tuple(
        item
        for item in inventory.clauses
        if item.owner == classifier and item.phase in phases
    )


def _binding(
    side: str,
    owner: ContractOwner | None,
    phase: str,
    instance: InventoryInstance | None = None,
) -> PredicateBinding:
    if owner is None:
        return PredicateBinding(
            side=side,
            assumption=None,
            guarantee=None,
            synthetic_true_assumption=True,
            synthetic_true_guarantee=True,
            assumption_observations=(),
            guarantee_observations=(),
        )
    assumption_absent = phase in {"initialize", "datatype-invariant"} or owner.assumption_count == 0
    guarantee_absent = owner.guarantee_count == 0 and owner.case_count == 0
    return PredicateBinding(
        side=side,
        assumption=None,
        guarantee=None,
        source_object=instance.gumbox_object if instance is not None else owner.source_object,
        synthetic_true_assumption=assumption_absent,
        synthetic_true_guarantee=guarantee_absent,
        assumption_observations=() if assumption_absent else None,
        guarantee_observations=() if guarantee_absent else None,
    )


def _observations(
    oracle: InventoryInstance | None, candidate: InventoryInstance | None
) -> tuple[Observation, ...]:
    oracle_map = {item.name: item for item in oracle.observations} if oracle else {}
    candidate_map = {item.name: item for item in candidate.observations} if candidate else {}
    result: list[Observation] = []
    for name in sorted(set(oracle_map) | set(candidate_map)):
        left = oracle_map.get(name)
        right = candidate_map.get(name)
        roles = {item.role for item in (left, right) if item is not None}
        if len(roles) != 1:
            raise InventoryError(f"observation role mismatch for {name}: {sorted(roles)}")
        left_type = left.qualified_type if left else None
        right_type = right.qualified_type if right else None
        type_key = left_type or right_type
        assert type_key is not None
        result.append(
            Observation(
                name=name,
                role=_role(next(iter(roles))),
                type_key=type_key,
                oracle_type=left_type,
                candidate_type=right_type,
            )
        )
    return tuple(result)


def _states_by_classifier(inventory: Inventory) -> dict[str, dict[str, InventoryState]]:
    result: dict[str, dict[str, InventoryState]] = {}
    for state in inventory.states:
        owner = result.setdefault(state.classifier, {})
        if state.name in owner:
            raise InventoryError(
                f"duplicate state declaration for {state.classifier}::{state.name}"
            )
        owner[state.name] = state
    return result


def _footprints_by_owner(
    inventory: Inventory,
) -> dict[tuple[str, str], InventoryWriteFootprint]:
    return {(item.classifier, item.phase): item for item in inventory.write_footprints}


def _contract_observations(
    oracle_instance: InventoryInstance | None,
    candidate_instance: InventoryInstance | None,
    oracle_states: Mapping[str, InventoryState],
    candidate_states: Mapping[str, InventoryState],
    phase: str,
) -> tuple[Observation, ...]:
    result = list(_observations(oracle_instance, candidate_instance))
    for name in sorted(set(oracle_states) | set(candidate_states)):
        left = oracle_states.get(name)
        right = candidate_states.get(name)
        left_type = left.qualified_type if left else None
        right_type = right.qualified_type if right else None
        type_key = left_type or right_type
        assert type_key is not None
        if left_type is not None and right_type is not None and left_type != right_type:
            owner = left.classifier if left is not None else right.classifier
            raise InventoryModelMismatch(
                f"state type differs for {owner}::{name}: "
                f"oracle={left_type}, candidate={right_type}"
            )
        if phase == "compute":
            result.append(
                Observation(
                    name=f"In_{name}",
                    role=ObservationRole.PRE_STATE,
                    type_key=type_key,
                    oracle_type=left_type or type_key,
                    candidate_type=right_type or type_key,
                    oracle_declared=left is not None,
                    candidate_declared=right is not None,
                )
            )
        result.append(
            Observation(
                name=name,
                role=ObservationRole.POST_STATE,
                type_key=type_key,
                oracle_type=left_type or type_key,
                candidate_type=right_type or type_key,
                oracle_declared=left is not None,
                candidate_declared=right is not None,
            )
        )
    names = [item.name for item in result]
    if len(names) != len(set(names)):
        raise InventoryError("port and state observations have colliding generated names")
    return tuple(result)


def _write_footprint(
    item: InventoryWriteFootprint | None,
) -> WriteFootprint:
    if item is None:
        return WriteFootprint()
    return WriteFootprint(restricted=item.restricted, targets=item.targets)


def _type_signature(item: InventoryType) -> tuple[Any, ...]:
    return (
        item.kind,
        item.fields,
        item.literals,
        item.element_type,
        item.dimensions,
        item.array_size_kind,
    )


def _assert_same_model_inventory(oracle: Inventory, candidate: Inventory) -> None:
    """Reject architecture/type drift as model mismatch, not backend coverage."""

    root_structure = lambda inventory: tuple(
        (item.classifier, item.instance_path, item.category)
        for item in inventory.roots
    )
    if root_structure(oracle) != root_structure(candidate):
        raise InventoryModelMismatch(
            f"resolved root inventories differ: oracle={oracle.roots}, candidate={candidate.roots}"
        )
    # Sireum materializes datatype/value nodes in componentMap as Data
    # components, and GUMBO expression reachability can add or rename those
    # nodes without changing M*.  Datatype structure is certified separately
    # below for the exact proof-relevant closure.
    left_instances = {
        key: item
        for key, item in _instance_index(oracle).items()
        if item.category != "Data"
    }
    right_instances = {
        key: item
        for key, item in _instance_index(candidate).items()
        if item.category != "Data"
    }
    if set(left_instances) != set(right_instances):
        raise InventoryModelMismatch("resolved concrete instance inventories differ")
    for key in sorted(left_instances):
        left = left_instances[key]
        right = right_instances[key]
        left_observations = tuple(
            (item.name, item.role, item.qualified_type) for item in left.observations
        )
        right_observations = tuple(
            (item.name, item.role, item.qualified_type) for item in right.observations
        )
        if (
            left.classifier,
            left.category,
            left_observations,
            left.gumbox_object,
        ) != (
            right.classifier,
            right.category,
            right_observations,
            right.gumbox_object,
        ):
            raise InventoryModelMismatch(f"resolved component instance differs: {key}")


def _assert_required_types_match(
    oracle: Inventory,
    candidate: Inventory,
    qualified_names: Iterable[str],
) -> None:
    """Certify only the transitive datatype closure consumed by proof units."""

    left_types = {item.qualified_name: item for item in oracle.types}
    right_types = {item.qualified_name: item for item in candidate.types}
    pending = list(qualified_names)
    seen: set[str] = set()
    while pending:
        name = pending.pop()
        if name in seen:
            continue
        seen.add(name)
        left = left_types.get(name)
        right = right_types.get(name)
        if left is None or right is None:
            missing = [
                side
                for side, item in (("oracle", left), ("candidate", right))
                if item is None
            ]
            raise InventoryError(
                f"required resolved datatype {name} is missing from {', '.join(missing)} inventory"
            )
        if _type_signature(left) != _type_signature(right):
            raise InventoryModelMismatch(f"required resolved datatype differs: {name}")
        pending.extend(field_type for _, field_type in left.fields)
        if left.element_type is not None:
            pending.append(left.element_type)


def _type_coverage_gaps(
    inventories: Sequence[Inventory], qualified_names: Iterable[str]
) -> set[str]:
    gaps: set[str] = set()
    for inventory in inventories:
        types = {item.qualified_name: item for item in inventory.types}
        pending = list(qualified_names)
        seen: set[str] = set()
        while pending:
            name = pending.pop()
            if name in seen:
                continue
            seen.add(name)
            item = types.get(name)
            if item is None:
                gaps.add(f"unknown-datatype:{name}")
                continue
            if not item.supported:
                gaps.add(item.unsupported_reason or f"unsupported-datatype:{name}")
            pending.extend(field_type for _, field_type in item.fields)
            if item.element_type is not None:
                pending.append(item.element_type)
    return gaps


def pair_inventories(
    oracle: Inventory, candidate: Inventory
) -> tuple[ComparisonUnit, ...]:
    """Pair the union inventory by datatype or concrete root/instance/phase."""

    _assert_same_model_inventory(oracle, candidate)
    oracle_owners = _owner_index(oracle)
    candidate_owners = _owner_index(candidate)
    oracle_instances = _instance_index(oracle)
    candidate_instances = _instance_index(candidate)
    oracle_states = _states_by_classifier(oracle)
    candidate_states = _states_by_classifier(candidate)
    oracle_footprints = _footprints_by_owner(oracle)
    candidate_footprints = _footprints_by_owner(candidate)
    units: list[ComparisonUnit] = []

    component_contract_classifiers = {
        classifier
        for classifier, phase in set(oracle_owners) | set(candidate_owners)
        if phase in {"initialize", "compute"}
    }
    for label, instances in (
        ("oracle", oracle_instances),
        ("candidate", candidate_instances),
    ):
        identities: dict[str, tuple[str, str, str]] = {}
        for key, instance in instances.items():
            if instance.classifier not in component_contract_classifiers:
                continue
            previous = identities.get(instance.gumbox_object)
            if previous is not None and previous != key:
                raise InventoryError(
                    f"{label} GumboX object identity is ambiguous for {previous} and {key}: "
                    f"{instance.gumbox_object}"
                )
            identities[instance.gumbox_object] = key

    datatype_classifiers = {
        classifier
        for classifier, phase in set(oracle_owners) | set(candidate_owners)
        if phase == "datatype-invariant"
    }
    required_types = set(datatype_classifiers)
    required_types.update(
        observation.qualified_type
        for instance in oracle.instances
        if instance.classifier in component_contract_classifiers
        for observation in instance.observations
    )
    _assert_required_types_match(oracle, candidate, required_types)
    for classifier in sorted(datatype_classifiers):
        left_owner = oracle_owners.get((classifier, "datatype-invariant"))
        right_owner = candidate_owners.get((classifier, "datatype-invariant"))
        clauses_left = _clauses_for(oracle, classifier, "datatype-invariant")
        clauses_right = _clauses_for(candidate, classifier, "datatype-invariant")
        gaps = tuple(
            sorted(
                {
                    reason
                    for owner in (left_owner, right_owner)
                    if owner is not None
                    for reason in owner.unsupported_reasons
                }
                | _type_coverage_gaps((oracle, candidate), (classifier,))
            )
        )
        units.append(
            ComparisonUnit(
                key=f"datatype::{classifier}::invariant",
                kind=UnitKind.DATATYPE_INVARIANT,
                root=None,
                instance_path=None,
                classifier=classifier,
                phase="invariant",
                observations=(
                    Observation(
                        name="value",
                        role=ObservationRole.VALUE,
                        type_key=classifier,
                        oracle_type=classifier if left_owner else None,
                        candidate_type=classifier if right_owner else None,
                    ),
                ),
                oracle=_binding("oracle", left_owner, "datatype-invariant"),
                candidate=_binding("candidate", right_owner, "datatype-invariant"),
                oracle_clauses=tuple(item.provenance() for item in clauses_left),
                candidate_clauses=tuple(item.provenance() for item in clauses_right),
                coverage_complete=not gaps and all(item.supported for item in clauses_left + clauses_right),
                unsupported_reasons=gaps,
            )
        )

    instance_keys = set(oracle_instances)
    for root, root_instance_path, path in sorted(instance_keys):
        left_instance = oracle_instances.get((root, root_instance_path, path))
        right_instance = candidate_instances.get((root, root_instance_path, path))
        classifiers = {
            item.classifier for item in (left_instance, right_instance) if item is not None
        }
        if len(classifiers) != 1:
            raise InventoryError(
                f"classifier mismatch for concrete instance {root}/{path}: {sorted(classifiers)}"
            )
        classifier = next(iter(classifiers))
        for phase, kind in (("initialize", UnitKind.INITIALIZE), ("compute", UnitKind.COMPUTE)):
            left_owner = oracle_owners.get((classifier, phase))
            right_owner = candidate_owners.get((classifier, phase))
            if left_owner is None and right_owner is None:
                continue
            clauses_left = _clauses_for(oracle, classifier, phase)
            clauses_right = _clauses_for(candidate, classifier, phase)
            gaps = {
                reason
                for owner in (left_owner, right_owner)
                if owner is not None
                for reason in owner.unsupported_reasons
            }
            for instance in (left_instance, right_instance):
                if instance is not None:
                    gaps.update(instance.unsupported_reasons)
            for clause in clauses_left + clauses_right:
                if not clause.supported and clause.unsupported_reason:
                    gaps.add(clause.unsupported_reason)
            observed_types = {
                item.qualified_type
                for instance in (left_instance, right_instance)
                if instance is not None
                for item in instance.observations
            }
            gaps.update(_type_coverage_gaps((oracle, candidate), observed_types))
            units.append(
                ComparisonUnit(
                    key=(
                        f"root::{root}/root-instance::{root_instance_path}/"
                        f"component::{path}::{phase}"
                    ),
                    kind=kind,
                    root=root,
                    instance_path=path,
                    classifier=classifier,
                    phase=phase,
                    observations=_contract_observations(
                        left_instance,
                        right_instance,
                        oracle_states.get(classifier, {}),
                        candidate_states.get(classifier, {}),
                        phase,
                    ),
                    oracle=_binding("oracle", left_owner, phase, left_instance),
                    candidate=_binding("candidate", right_owner, phase, right_instance),
                    oracle_clauses=tuple(item.provenance() for item in clauses_left),
                    candidate_clauses=tuple(item.provenance() for item in clauses_right),
                    coverage_complete=not gaps and all(
                        item.supported for item in clauses_left + clauses_right
                    ),
                    unsupported_reasons=tuple(sorted(gaps)),
                    oracle_writes=_write_footprint(
                        oracle_footprints.get((classifier, phase))
                    ),
                    candidate_writes=_write_footprint(
                        candidate_footprints.get((classifier, phase))
                    ),
                )
            )
    keys = [item.key for item in units]
    if len(keys) != len(set(keys)):
        raise InventoryError("unit pairing produced duplicate unit keys")
    return tuple(units)


def select_codegen_roots(
    oracle: Inventory,
    candidate: Inventory,
    units: Sequence[ComparisonUnit],
) -> tuple[str, ...]:
    """Select exact HAMR ``--system-name`` classifiers needed by ``units``.

    Concrete component units retain their root-instance distinction in their
    keys and instance paths.  Datatype-only work is assigned to one
    deterministic resolved root whose type table contains every otherwise
    unhosted datatype.  A classifier collision between distinct required root
    instances is rejected because HAMR's classifier-valued selector cannot
    disambiguate it.
    """

    _assert_same_model_inventory(oracle, candidate)
    if not units:
        raise InventoryError("cannot select a codegen root for an empty unit inventory")
    roots = {item.key: item for item in oracle.roots}
    candidate_roots = {item.key: item for item in candidate.roots}
    selected: dict[tuple[str, str], InventoryRoot] = {}
    datatype_names: set[str] = set()
    for unit in units:
        if unit.kind is UnitKind.DATATYPE_INVARIANT:
            datatype_names.add(unit.classifier)
            continue
        if unit.root is None or unit.instance_path is None:
            raise InventoryError(f"component unit lacks resolved root identity: {unit.key}")
        matches = [
            item
            for item in oracle.instances
            if item.root == unit.root and item.instance_path == unit.instance_path
        ]
        if len(matches) != 1:
            raise InventoryError(
                f"component unit does not identify exactly one resolved root instance: {unit.key}"
            )
        instance = matches[0]
        root_key = (instance.root, instance.root_instance_path)
        root = roots.get(root_key)
        if root is None:
            raise InventoryError(f"component unit references an unknown root: {unit.key}")
        selected[root_key] = root

    uncovered_types = {
        name
        for name in datatype_names
        if not any(
            name in root.type_names
            and name in candidate_roots[root.key].type_names
            for root in selected.values()
        )
    }
    if uncovered_types:
        hosts = [
            root
            for root in oracle.roots
            if uncovered_types.issubset(root.type_names)
            and uncovered_types.issubset(candidate_roots[root.key].type_names)
        ]
        if not hosts:
            raise InventoryError(
                "no resolved codegen root hosts datatype-only units: "
                + ", ".join(sorted(uncovered_types))
            )
        host = min(hosts, key=lambda item: item.key)
        selected[host.key] = host

    if not selected:
        raise InventoryError("no resolved codegen-capable root hosts the paired units")
    selected_classifiers = {root.classifier for root in selected.values()}
    by_classifier: dict[str, list[InventoryRoot]] = {
        classifier: [] for classifier in selected_classifiers
    }
    # HAMR accepts only a classifier-valued --system-name.  An unselected root
    # instance with the same classifier therefore still makes that selector
    # globally ambiguous.
    for root in oracle.roots:
        if root.classifier in selected_classifiers:
            by_classifier[root.classifier].append(root)
    ambiguous = {
        classifier: tuple(sorted(item.instance_path for item in descriptors))
        for classifier, descriptors in by_classifier.items()
        if len(descriptors) > 1
    }
    if ambiguous:
        raise InventoryError(
            f"HAMR root classifier selector is ambiguous across root instances: {ambiguous}"
        )
    return tuple(sorted(by_classifier))


def clause_accounting(inventory: Inventory, units: Iterable[ComparisonUnit]) -> dict[str, Any]:
    """Audit whether every source clause occurs in a unit or an explicit gap."""

    represented: set[tuple[str, str, str, int | None]] = set()
    for unit in units:
        for clause in unit.oracle_clauses + unit.candidate_clauses:
            represented.add(
                (
                    clause.clause_id,
                    clause.kind,
                    clause.source.uri if clause.source else "",
                    clause.source.offset if clause.source else None,
                )
            )
    missing = []
    unsupported = []
    for clause in inventory.clauses:
        key = (
            clause.clause_id,
            clause.kind,
            clause.source.uri if clause.source else "",
            clause.source.offset if clause.source else None,
        )
        if not clause.supported:
            unsupported.append(clause.clause_id)
        elif key not in represented:
            missing.append(clause.clause_id)
    return {
        "declared": inventory.declared_clause_count,
        "supported": inventory.supported_clause_count,
        "represented": inventory.supported_clause_count - len(missing),
        "missing_supported_clause_ids": sorted(missing),
        "explicitly_unsupported_clause_ids": sorted(unsupported),
        "complete": not missing and inventory.coverage_complete,
    }
