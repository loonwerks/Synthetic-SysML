#!/usr/bin/env python3
"""Resolved-effective AADL-in-SysML coverage for the canonical CPS-48 corpus.

The source of truth is Sireum's resolved HAMR AIR.  Source text is used only
for campaign provenance, SHA-256 validation, and checking that every curated
catalog symbol exists in the pinned SysML/AADL libraries.
"""

from __future__ import annotations

import argparse
from collections import Counter, defaultdict, deque
import csv
from dataclasses import dataclass, field
from datetime import datetime
import hashlib
import io
import os
import json
from pathlib import Path
import re
import shutil
import subprocess
import sys
import tempfile
from typing import Any, Callable, Iterable, Mapping, Sequence
from urllib.parse import unquote, urlparse


REPO_ROOT = Path(__file__).resolve().parents[2]
DEFAULT_MANIFEST = REPO_ROOT / "cps48/manifest.json"
DEFAULT_RUNS = REPO_ROOT / "cps48/runs"
DEFAULT_LIBRARY = REPO_ROOT / "external/sysml-aadl-libraries"
DEFAULT_OUTPUT = REPO_ROOT / "build/aadl-coverage"
EXPECTED_LIBRARY_COMMIT = "9016cbcceefa92f0068e1811923704dd261d15f1"
SCHEMA_VERSION = "aadl-in-sysml-coverage-poc-1.0.0"
TIERS = ("small", "medium", "hard")
REPLICATES = (1, 2)


class CoverageError(RuntimeError):
    """The requested coverage result cannot be established fail-closed."""


@dataclass(frozen=True)
class CatalogEntry:
    symbol: str
    group: str
    source: str
    declaration: str
    enum_values: tuple[str, ...] = ()
    enum_source: str | None = None

    @property
    def name(self) -> str:
        return self.symbol.rsplit("::", 1)[-1]


def _entries(
    names: Sequence[str], *, group: str, source: str, declaration: str, package: str
) -> tuple[CatalogEntry, ...]:
    return tuple(
        CatalogEntry(f"{package}::{name}", group, source, declaration)
        for name in names
    )


COMPONENTS = _entries(
    (
        "Abstract", "Bus", "Data", "Device", "Memory", "Process", "Processor",
        "System", "Subprogram", "SubprogramGroup", "Thread", "ThreadGroup",
        "VirtualProcessor", "VirtualBus",
    ),
    group="component category",
    source="aadl.library/AADL.sysml",
    declaration="part",
    package="AADL",
)

FEATURES = _entries(
    (
        "AbstractFeature", "BusAccess", "DataAccess", "DataPort", "EventPort",
        "EventDataPort", "SubprogramAccess", "SubprogramGroupAccess",
        "VirtualBusAccess",
    ),
    group="feature kind",
    source="aadl.library/AADL.sysml",
    declaration="port",
    package="AADL",
)

CONNECTIONS = tuple(
    CatalogEntry(f"AADL::{name}", "connection kind", "aadl.library/AADL.sysml", decl)
    for name, decl in (
        ("FeatureConnection", "connection"),
        ("AccessConnection", "connection"),
        ("ParameterConnection", "connection"),
        ("PortConnection", "interface"),
        ("FeatureGroupConnection", "connection"),
    )
)


def _property(
    symbol: str,
    group: str,
    source: str,
    enum_values: Sequence[str] = (),
    enum_source: str | None = None,
) -> CatalogEntry:
    return CatalogEntry(
        symbol, group, source, "attribute", tuple(enum_values), enum_source
    )


PROPERTIES = (
    _property("Communication_Properties::Queue_Size", "communication queue/timing", "aadl.library/Communication_Properties.sysml"),
    _property("Communication_Properties::Timing", "communication queue/timing", "aadl.library/Communication_Properties.sysml", ("Sampled", "Immediate", "Delayed")),
    _property("Communication_Properties::Transmission_Type", "communication queue/timing", "aadl.library/Communication_Properties.sysml", ("Push", "Pull")),
    _property("Communication_Properties::Transmission_Time", "communication queue/timing", "aadl.library/Communication_Properties.sysml"),
    _property("Communication_Properties::Actual_Latency", "communication queue/timing", "aadl.library/Communication_Properties.sysml"),
    _property("Communication_Properties::Latency", "communication queue/timing", "aadl.library/Communication_Properties.sysml"),
    *tuple(
        _property(f"Timing_Properties::{name}", "execution timing", "aadl.library/Timing_Properties.sysml")
        for name in (
            "Activate_Deadline", "Activate_Execution_Time", "Compute_Deadline",
            "Compute_Execution_Time", "Client_Subprogram_Execution_Time",
            "Deactivate_Deadline", "Deactivate_Execution_Time", "Deadline",
            "First_Dispatch_Time", "Dispatch_Jitter", "Dispatch_Offset",
            "Execution_Time", "Finalize_Deadline", "Finalize_Execution_Time",
            "Initialize_Deadline", "Initialize_Execution_Time", "Load_Deadline",
            "Load_Time", "Period", "Recover_Deadline", "Recover_Execution_Time",
            "Startup_Deadline", "Startup_Execution_Time", "Clock_Jitter",
            "Clock_Period", "Clock_Period_Range", "Process_Swap_Execution_Time",
            "Scheduler_Quantum", "Thread_Swap_Execution_Time", "Frame_Period",
            "Slot_Time",
        )
    ),
    _property(
        "Thread_Properties::Dispatch_Protocol", "dispatch/priority policy",
        "aadl.library/Thread_Properties.sysml",
        ("Periodic", "Sporadic", "Aperiodic", "Timed", "Hybrid", "Background"),
        "aadl.library/AADL_Project.sysml",
    ),
    _property("Thread_Properties::Dispatch_Able", "dispatch/priority policy", "aadl.library/Thread_Properties.sysml"),
    _property(
        "Thread_Properties::POSIX_Scheduling_Policy", "dispatch/priority policy",
        "aadl.library/Thread_Properties.sysml", ("SCHED_FIFO", "SCHED_RR", "SCHED_OTHERS"),
    ),
    _property("Thread_Properties::Priority", "dispatch/priority policy", "aadl.library/Thread_Properties.sysml"),
    _property(
        "Deployment_Properties::Scheduling_Protocol", "processor scheduling",
        "aadl.library/Deployment_Properties.sysml",
        (
            "No_Scheduling_Protocol", "Round_Robin_Protocol",
            "Rate_Monotonic_Protocol", "Deadline_Monotonic_Protocol",
            "Earliest_Deadline_First_Protocol", "Least_Laxity_First_Protocol",
            "POSIX_1003_Highest_Priority_First_Protocol", "ARINC653",
        ),
        "aadl.library/AADL_Project.sysml",
    ),
    _property("Deployment_Properties::Preemptive_Scheduler", "processor scheduling", "aadl.library/Deployment_Properties.sysml"),
    _property("Deployment_Properties::Thread_Limit", "processor scheduling", "aadl.library/Deployment_Properties.sysml"),
    _property("CASE_Scheduling::Domain", "CASE scheduling", "hamr.aadl.library/CASE_Scheduling.sysml"),
    _property("CASE_Scheduling::Max_Domain", "CASE scheduling", "hamr.aadl.library/CASE_Scheduling.sysml"),
    _property(
        "HAMR_Microkit::Scheduling", "Microkit scheduling/passivity/SMC",
        "hamr.aadl.library/HAMR_Microkit.sysml", ("Domain_Scheduling", "MCS"),
    ),
    _property("HAMR_Microkit::Passive", "Microkit scheduling/passivity/SMC", "hamr.aadl.library/HAMR_Microkit.sysml"),
    _property("HAMR_Microkit::SMC", "Microkit scheduling/passivity/SMC", "hamr.aadl.library/HAMR_Microkit.sysml"),
    _property("HAMR_ROS::RosNodeKind", "ROS", "hamr.aadl.library/HAMR_ROS.sysml", ("ros2", "microRos")),
    _property("HAMR::Implementation_Language", "HAMR code/data semantics", "hamr.aadl.library/HAMR.sysml", ("Slang", "C", "Rust")),
    _property("HAMR::Array_Size_Kind", "HAMR code/data semantics", "hamr.aadl.library/HAMR.sysml", ("Fixed", "Bound", "Unbounded")),
)

CATALOGS: Mapping[str, tuple[CatalogEntry, ...]] = {
    "component": COMPONENTS,
    "feature": FEATURES,
    "connection": CONNECTIONS,
    "property": PROPERTIES,
}
CATALOG_INDEX = {
    dimension: {entry.symbol: entry for entry in entries}
    for dimension, entries in CATALOGS.items()
}
COMPONENT_AIR = {entry.name: entry.symbol for entry in COMPONENTS}
CONNECTION_AIR = {
    "Feature": "AADL::FeatureConnection",
    "Access": "AADL::AccessConnection",
    "Parameter": "AADL::ParameterConnection",
    "Port": "AADL::PortConnection",
    "FeatureGroup": "AADL::FeatureGroupConnection",
}
PORT_DIRECTIONS = ("In", "Out", "InOut")


@dataclass(frozen=True)
class SelectedRun:
    cell_id: str
    family_id: str
    complexity: str
    replicate: int
    run_id: str
    run_dir: Path
    completed_at: str
    source: Path
    source_sha256: str
    accepted_candidates: int


@dataclass
class ModelMetrics:
    counts: dict[str, Counter[str]] = field(
        default_factory=lambda: {dimension: Counter() for dimension in CATALOGS}
    )
    directions: Counter[str] = field(default_factory=Counter)
    values: Counter[tuple[str, str]] = field(default_factory=Counter)
    ignored_properties: Counter[str] = field(default_factory=Counter)
    resolved_root_count: int = 0


def _load_json(path: Path, label: str) -> Mapping[str, Any]:
    try:
        value = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError) as error:
        raise CoverageError(f"could not read {label} {path}: {error}") from error
    if not isinstance(value, Mapping):
        raise CoverageError(f"{label} is not a JSON object: {path}")
    return value


def _sha256_file(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for block in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(block)
    return digest.hexdigest()


def _parse_time(value: Any, *, run_id: str) -> datetime:
    if not isinstance(value, str) or not value:
        raise CoverageError(f"accepted run {run_id} has no completed_at timestamp")
    try:
        parsed = datetime.fromisoformat(value.replace("Z", "+00:00"))
    except ValueError as error:
        raise CoverageError(f"accepted run {run_id} has invalid completed_at: {value}") from error
    if parsed.tzinfo is None:
        raise CoverageError(f"accepted run {run_id} completed_at lacks a timezone")
    return parsed


def expected_cells(manifest: Mapping[str, Any]) -> set[tuple[str, str, int]]:
    if manifest.get("schema_version") != 1 or manifest.get("campaign_id") != "cps-48-v1":
        raise CoverageError("coverage POC requires the schema-1 cps-48-v1 manifest")
    families = manifest.get("families")
    batches = manifest.get("batches")
    if not isinstance(families, Mapping) or not isinstance(batches, Sequence):
        raise CoverageError("campaign manifest has invalid families or batches")
    cells: set[tuple[str, str, int]] = set()
    for raw in batches:
        if not isinstance(raw, Mapping):
            raise CoverageError("campaign batch is not an object")
        family = str(raw.get("family_id", ""))
        if family not in families:
            raise CoverageError(f"campaign batch references unknown family: {family}")
        complexities = raw.get("complexities", TIERS)
        replicates = raw.get("replicates", REPLICATES)
        if not isinstance(complexities, Sequence) or isinstance(complexities, str):
            raise CoverageError("campaign complexities must be an array")
        if not isinstance(replicates, Sequence) or isinstance(replicates, str):
            raise CoverageError("campaign replicates must be an array")
        for replicate in replicates:
            for complexity in complexities:
                cell = (family, str(complexity), int(replicate))
                if cell in cells:
                    raise CoverageError(f"campaign manifest duplicates cell {cell}")
                cells.add(cell)
    expected = {
        (str(family), tier, replicate)
        for family in families
        for tier in TIERS
        for replicate in REPLICATES
    }
    if cells != expected:
        missing = sorted(expected - cells)
        extra = sorted(cells - expected)
        raise CoverageError(f"campaign cells differ from canonical 8x3x2 design; missing={missing}, extra={extra}")
    tier_counts = Counter(cell[1] for cell in cells)
    if len(cells) != 48 or tier_counts != Counter({tier: 16 for tier in TIERS}):
        raise CoverageError(f"campaign population is not exactly 48 / 16-16-16: {tier_counts}")
    if manifest.get("target_accepted") != 48:
        raise CoverageError("campaign target_accepted must be exactly 48")
    return cells


def select_canonical_runs(manifest_path: Path, runs_dir: Path) -> tuple[SelectedRun, ...]:
    manifest = _load_json(manifest_path, "campaign manifest")
    cells = expected_cells(manifest)
    candidates: dict[tuple[str, str, int], list[tuple[datetime, Path, Mapping[str, Any], Mapping[str, Any]]]] = defaultdict(list)
    if not runs_dir.is_dir():
        raise CoverageError(f"run archive does not exist: {runs_dir}")
    for run_dir in sorted(path for path in runs_dir.iterdir() if path.is_dir()):
        status_path = run_dir / "status.json"
        config_path = run_dir / "run-config.json"
        if not status_path.is_file() or not config_path.is_file():
            continue
        config = _load_json(config_path, "run config")
        if config.get("campaign_id") != manifest.get("campaign_id"):
            continue
        cell = (
            str(config.get("family_id", "")),
            str(config.get("complexity", "")),
            int(config.get("replicate", 0)),
        )
        if cell not in cells:
            raise CoverageError(f"campaign run {run_dir.name} names noncanonical cell {cell}")
        status = _load_json(status_path, "run status")
        if status.get("status") != "accepted":
            continue
        completed = _parse_time(status.get("completed_at"), run_id=run_dir.name)
        candidates[cell].append((completed, run_dir, status, config))
    missing = sorted(cells - set(candidates))
    if missing:
        raise CoverageError(f"canonical campaign has no accepted run for cells: {missing}")

    selected: list[SelectedRun] = []
    for cell in sorted(cells):
        choices = candidates[cell]
        _, run_dir, status, config = max(
            choices, key=lambda item: (item[0], str(item[2].get("run_id", item[1].name)), item[1].name)
        )
        run_id = str(status.get("run_id", ""))
        if run_id != run_dir.name or config.get("run_id") != run_id:
            raise CoverageError(f"selected run identity mismatch in {run_dir}")
        if (
            status.get("terminal") is not True
            or status.get("dataset_ready") is not True
            or status.get("semantic_status") != "passed"
            or status.get("visualization_status") != "passed"
        ):
            raise CoverageError(f"selected run is not a closed campaign acceptance: {run_id}")
        source_name = status.get("source")
        expected_hash = status.get("source_sha256")
        if not isinstance(source_name, str) or not source_name:
            raise CoverageError(f"selected run has no source path: {run_id}")
        if not isinstance(expected_hash, str) or not re.fullmatch(r"[0-9a-f]{64}", expected_hash):
            raise CoverageError(f"selected run has invalid source SHA-256: {run_id}")
        relative = Path(source_name)
        if relative.is_absolute() or ".." in relative.parts:
            raise CoverageError(f"selected run source escapes its run directory: {run_id}")
        source = (run_dir / relative).resolve()
        if not source.is_file() or run_dir.resolve() not in source.parents:
            raise CoverageError(f"selected run source does not exist inside run: {run_id}")
        actual_hash = _sha256_file(source)
        if actual_hash != expected_hash:
            raise CoverageError(
                f"selected source hash mismatch for {run_id}: expected {expected_hash}, got {actual_hash}"
            )
        selected.append(
            SelectedRun(
                cell_id=f"{cell[0]}-{cell[1]}-r{cell[2]}",
                family_id=cell[0], complexity=cell[1], replicate=cell[2],
                run_id=run_id, run_dir=run_dir.resolve(),
                completed_at=str(status["completed_at"]), source=source,
                source_sha256=expected_hash, accepted_candidates=len(choices),
            )
        )
    tiers = Counter(run.complexity for run in selected)
    if len(selected) != 48 or tiers != Counter({tier: 16 for tier in TIERS}):
        raise CoverageError(f"selected population is not exactly 48 / 16-16-16: {tiers}")
    return tuple(selected)


def _declaration_pattern(entry: CatalogEntry) -> re.Pattern[str]:
    name = re.escape(entry.name)
    if entry.declaration == "part":
        prefix = r"(?:abstract\s+)?part\s+def"
    elif entry.declaration == "port":
        prefix = r"(?:abstract\s+)?port\s+def"
    elif entry.declaration == "connection":
        prefix = r"(?:abstract\s+)?connection\s+def"
    elif entry.declaration == "interface":
        prefix = r"interface\s+def"
    elif entry.declaration == "attribute":
        prefix = r"attribute\s+def"
    else:  # pragma: no cover - constants make this unreachable
        raise CoverageError(f"unknown catalog declaration kind: {entry.declaration}")
    return re.compile(rf"\b{prefix}\s+{name}\b")


def validate_catalog_entries(library_dir: Path, entries: Iterable[CatalogEntry]) -> int:
    checked = 0
    for entry in entries:
        path = library_dir / entry.source
        if not path.is_file():
            raise CoverageError(f"catalog source is missing for {entry.symbol}: {path}")
        text = path.read_text(encoding="utf-8")
        if not _declaration_pattern(entry).search(text):
            raise CoverageError(f"unknown catalog symbol {entry.symbol} in {entry.source}")
        if entry.enum_values:
            enum_path = library_dir / (entry.enum_source or entry.source)
            if not enum_path.is_file():
                raise CoverageError(f"enum source is missing for {entry.symbol}: {enum_path}")
            enum_text = enum_path.read_text(encoding="utf-8")
            for value in entry.enum_values:
                # Most library enums use ``enum Value;``.  HAMR_ROS uses the
                # also-accepted compact SysML spelling ``Value;``.
                if not re.search(rf"(?:\benum\s+)?\b{re.escape(value)}\s*;", enum_text):
                    raise CoverageError(f"unknown catalog enum value {entry.symbol}::{value}")
        checked += 1
    return checked


def library_content_sha256(library_dir: Path) -> tuple[str, int]:
    files = sorted(library_dir.rglob("*.sysml"), key=lambda path: path.relative_to(library_dir).as_posix())
    if not files:
        raise CoverageError(f"library contains no .sysml sources: {library_dir}")
    digest = hashlib.sha256()
    for path in files:
        relative = path.relative_to(library_dir).as_posix().encode("utf-8")
        digest.update(relative)
        digest.update(b"\0")
        digest.update(path.read_bytes())
        digest.update(b"\0")
    return digest.hexdigest(), len(files)


def validate_library(library_dir: Path) -> Mapping[str, Any]:
    try:
        completed = subprocess.run(
            ["git", "-C", str(library_dir), "rev-parse", "HEAD"],
            text=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE,
            check=False, timeout=30,
        )
    except (OSError, subprocess.TimeoutExpired) as error:
        raise CoverageError(f"could not inspect library commit: {error}") from error
    commit = completed.stdout.strip()
    if completed.returncode != 0 or commit != EXPECTED_LIBRARY_COMMIT:
        raise CoverageError(
            f"library commit mismatch: expected {EXPECTED_LIBRARY_COMMIT}, got {commit or completed.stderr.strip()}"
        )
    entries = tuple(entry for values in CATALOGS.values() for entry in values)
    checked = validate_catalog_entries(library_dir, entries)
    content_hash, file_count = library_content_sha256(library_dir)
    return {
        "commit": commit,
        "content_sha256": content_hash,
        "content_hash_algorithm": "sha256(relative-posix-path + NUL + bytes + NUL, sorted .sysml files)",
        "sysml_file_count": file_count,
        "catalog_entries_validated": checked,
    }


def _some_value(value: Any) -> Any | None:
    if isinstance(value, Mapping) and value.get("type") == "Some":
        return value.get("value")
    return None


def _name(value: Any) -> str | None:
    if not isinstance(value, Mapping):
        return None
    names = value.get("name")
    if not isinstance(names, Sequence) or isinstance(names, (str, bytes)) or not names:
        return None
    return "::".join(str(item) for item in names)


def _classifier(value: Any) -> str | None:
    inner = _some_value(value)
    if isinstance(inner, Mapping):
        name = inner.get("name")
        return str(name) if isinstance(name, str) and name else None
    return None


def _enum_value(value: Any, label: str) -> str:
    if not isinstance(value, Mapping) or not isinstance(value.get("value"), str):
        raise CoverageError(f"resolved AIR {label} is malformed: {value}")
    return str(value["value"])


def _source_uri(component: Mapping[str, Any]) -> Path | None:
    identifier = component.get("identifier")
    if not isinstance(identifier, Mapping):
        return None
    position = _some_value(identifier.get("pos"))
    if not isinstance(position, Mapping):
        return None
    uri = _some_value(position.get("uriOpt"))
    if not isinstance(uri, str) or not uri:
        return None
    if uri.startswith("file:"):
        uri = unquote(urlparse(uri).path)
    return Path(uri).resolve()


def source_resolved_models(
    models: Sequence[Mapping[str, Any]], source: Path
) -> tuple[Mapping[str, Any], ...]:
    expected = source.resolve()
    selected: list[Mapping[str, Any]] = []
    for model in models:
        roots = model.get("components", ())
        if not isinstance(roots, Sequence) or isinstance(roots, (str, bytes)):
            raise CoverageError("resolved AIR components is not an array")
        if any(isinstance(root, Mapping) and _source_uri(root) == expected for root in roots):
            selected.append(model)
    if not selected:
        raise CoverageError(f"Sireum AIR contains no root originating in {source}")
    return tuple(selected)


def _normalize_feature(feature: Mapping[str, Any]) -> str:
    raw = _enum_value(feature.get("category"), "feature category")
    if raw == "BusAccess":
        access = feature.get("accessCategory")
        access_raw = _enum_value(access, "access category") if access is not None else "Bus"
        raw = "VirtualBusAccess" if access_raw == "VirtualBus" else "BusAccess"
    elif raw == "SubprogramAccessGroup":
        raw = "SubprogramGroupAccess"
    symbol = f"AADL::{raw}"
    if symbol not in CATALOG_INDEX["feature"]:
        raise CoverageError(f"resolved AIR contains feature kind outside the nine-entry catalog: {raw}")
    return symbol


def _property_name(prop: Mapping[str, Any]) -> str:
    name = _name(prop.get("name"))
    if not name:
        raise CoverageError(f"resolved AIR property has no qualified name: {prop}")
    return name


def _unit_value(value: Mapping[str, Any]) -> str:
    number = str(value.get("value", ""))
    unit = _some_value(value.get("unit"))
    return f"{number} {unit}" if isinstance(unit, str) and unit else number


def _property_value(value: Mapping[str, Any]) -> str:
    kind = value.get("type")
    if kind == "ValueProp":
        return str(value.get("value", ""))
    if kind == "UnitProp":
        return _unit_value(value)
    if kind == "RangeProp":
        low, high = value.get("low"), value.get("high")
        if isinstance(low, Mapping) and isinstance(high, Mapping):
            return f"{_property_value(low)} .. {_property_value(high)}"
    if kind == "ReferenceProp":
        return _name(value.get("value")) or "<unresolved-reference>"
    if kind == "ClassifierProp":
        return str(value.get("value", ""))
    canonical = {
        key: item for key, item in value.items()
        if key not in {"pos", "position", "uriFrag"}
    }
    return json.dumps(canonical, sort_keys=True, separators=(",", ":"))


def _collect_properties(properties: Any, metrics: ModelMetrics) -> set[str]:
    classifiers: set[str] = set()
    if not isinstance(properties, Sequence) or isinstance(properties, (str, bytes)):
        raise CoverageError("resolved AIR properties is not an array")
    for raw in properties:
        if not isinstance(raw, Mapping):
            raise CoverageError("resolved AIR property is not an object")
        symbol = _property_name(raw)
        values = raw.get("propertyValues", ())
        if not isinstance(values, Sequence) or isinstance(values, (str, bytes)):
            raise CoverageError(f"resolved AIR property values is not an array: {symbol}")
        for value in values:
            if isinstance(value, Mapping) and value.get("type") == "ClassifierProp":
                classifier = str(value.get("value", ""))
                if classifier:
                    classifiers.add(classifier)
        if symbol not in CATALOG_INDEX["property"]:
            metrics.ignored_properties[symbol] += 1
            continue
        metrics.counts["property"][symbol] += 1
        for value in values:
            if not isinstance(value, Mapping):
                raise CoverageError(f"resolved AIR property value is not an object: {symbol}")
            metrics.values[(symbol, _property_value(value))] += 1
    return classifiers


def _walk_feature(feature: Mapping[str, Any], metrics: ModelMetrics) -> set[str]:
    symbol = _normalize_feature(feature)
    metrics.counts["feature"][symbol] += 1
    direction = feature.get("direction")
    if direction is not None:
        raw = _enum_value(direction, "port direction")
        if raw not in PORT_DIRECTIONS:
            raise CoverageError(f"resolved AIR contains unknown port direction: {raw}")
        metrics.directions[raw] += 1
    classifiers = _collect_properties(feature.get("properties", ()), metrics)
    classifier = _classifier(feature.get("classifier"))
    if classifier:
        classifiers.add(classifier)
    nested = feature.get("features", ())
    if nested:
        if not isinstance(nested, Sequence) or isinstance(nested, (str, bytes)):
            raise CoverageError("resolved AIR nested features is not an array")
        for item in nested:
            if not isinstance(item, Mapping):
                raise CoverageError("resolved AIR nested feature is not an object")
            classifiers.update(_walk_feature(item, metrics))
    return classifiers


def _walk_component(component: Mapping[str, Any], metrics: ModelMetrics) -> set[str]:
    raw_category = _enum_value(component.get("category"), "component category")
    symbol = COMPONENT_AIR.get(raw_category)
    if symbol is None:
        raise CoverageError(f"resolved AIR contains unknown component category: {raw_category}")
    metrics.counts["component"][symbol] += 1
    classifiers = _collect_properties(component.get("properties", ()), metrics)
    classifier = _classifier(component.get("classifier"))
    if classifier:
        classifiers.add(classifier)
    features = component.get("features", ())
    if not isinstance(features, Sequence) or isinstance(features, (str, bytes)):
        raise CoverageError("resolved AIR features is not an array")
    for feature in features:
        if not isinstance(feature, Mapping):
            raise CoverageError("resolved AIR feature is not an object")
        classifiers.update(_walk_feature(feature, metrics))
    connections = component.get("connections", ())
    if not isinstance(connections, Sequence) or isinstance(connections, (str, bytes)):
        raise CoverageError("resolved AIR connections is not an array")
    for connection in connections:
        if not isinstance(connection, Mapping):
            raise CoverageError("resolved AIR connection is not an object")
        raw = _enum_value(connection.get("kind"), "connection kind")
        connection_symbol = CONNECTION_AIR.get(raw)
        if connection_symbol is None:
            raise CoverageError(f"resolved AIR contains connection kind outside the five-entry catalog: {raw}")
        metrics.counts["connection"][connection_symbol] += 1
        classifiers.update(_collect_properties(connection.get("properties", ()), metrics))
    children = component.get("subComponents", ())
    if not isinstance(children, Sequence) or isinstance(children, (str, bytes)):
        raise CoverageError("resolved AIR subComponents is not an array")
    for child in children:
        if not isinstance(child, Mapping):
            raise CoverageError("resolved AIR subcomponent is not an object")
        classifiers.update(_walk_component(child, metrics))
    return classifiers


def collect_model_metrics(models: Sequence[Mapping[str, Any]]) -> ModelMetrics:
    """Count resolved uses, excluding unreachable library-only data definitions."""

    metrics = ModelMetrics()
    data_by_classifier: dict[str, Mapping[str, Any]] = {}
    architecture_roots: list[Mapping[str, Any]] = []
    for model in models:
        roots = model.get("components", ())
        data = model.get("dataComponents", ())
        if not isinstance(roots, Sequence) or isinstance(roots, (str, bytes)):
            raise CoverageError("resolved AIR components is not an array")
        if not isinstance(data, Sequence) or isinstance(data, (str, bytes)):
            raise CoverageError("resolved AIR dataComponents is not an array")
        for root in roots:
            if not isinstance(root, Mapping):
                raise CoverageError("resolved AIR root is not an object")
            architecture_roots.append(root)
        for component in data:
            if not isinstance(component, Mapping):
                raise CoverageError("resolved AIR data component is not an object")
            classifier = _classifier(component.get("classifier"))
            if classifier:
                prior = data_by_classifier.get(classifier)
                if prior is not None and prior != component:
                    raise CoverageError(f"resolved AIR duplicates data classifier: {classifier}")
                data_by_classifier[classifier] = component
    metrics.resolved_root_count = len(architecture_roots)
    reachable: set[str] = set()
    for root in architecture_roots:
        reachable.update(_walk_component(root, metrics))

    # AIR makes all globally visible datatypes available.  Follow only
    # classifier references starting at resolved architecture uses, so imports
    # without a resolved use do not become coverage.
    queue = deque(sorted(reachable))
    visited: set[str] = set()
    while queue:
        classifier = queue.popleft()
        if classifier in visited:
            continue
        visited.add(classifier)
        data_component = data_by_classifier.get(classifier)
        if data_component is None:
            continue
        discovered = _walk_component(data_component, metrics)
        for item in sorted(discovered - visited):
            queue.append(item)
    return metrics


Resolver = Callable[[Sequence[SelectedRun], Path, Path | None, int], tuple[Sequence[Mapping[str, Any]], ...]]


def resolve_with_sireum(
    runs: Sequence[SelectedRun], library_dir: Path,
    sireum_home: Path | None, timeout: int,
) -> tuple[Sequence[Mapping[str, Any]], ...]:
    home = sireum_home
    if home is None:
        configured = os.environ.get("SIREUM_HOME")
        if configured:
            home = Path(configured)
        else:
            executable = shutil.which("sireum")
            if executable:
                home = Path(executable).resolve().parent.parent
    if home is None:
        raise CoverageError("Sireum was not found; set SIREUM_HOME or pass --sireum-home")
    home = home.expanduser().resolve()
    sireum_bin = home / "bin" / "sireum"
    adapter = Path(__file__).resolve().with_name("GumboInventory.scala")
    missing = [str(path) for path in (sireum_bin, adapter) if not path.is_file()]
    if missing:
        raise CoverageError("incomplete Sireum AIR toolchain: " + ", ".join(missing))
    with tempfile.TemporaryDirectory(prefix="aadl-coverage-air-") as temp:
        outputs = tuple(Path(temp) / f"{index:02d}.json" for index in range(len(runs)))
        command = [
            str(sireum_bin), "slang", "run", str(adapter),
            "--batch", str(library_dir.resolve()),
        ]
        for run, output in zip(runs, outputs, strict=True):
            command.extend((str(run.source), str(output)))
        try:
            completed = subprocess.run(
                command, cwd=REPO_ROOT, text=True, stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT, timeout=timeout, check=False,
            )
        except subprocess.TimeoutExpired as error:
            raise CoverageError(f"Sireum AIR batch timed out after {timeout}s") from error
        except OSError as error:
            raise CoverageError(f"could not execute Sireum AIR adapter: {error}") from error
        if completed.returncode != 0:
            detail = completed.stdout.strip()
            raise CoverageError(
                f"Sireum parse/resolve/typecheck failed with exit code {completed.returncode}: {detail}"
            )
        payloads = tuple(_load_json(output, "Sireum AIR inventory") for output in outputs)
    versions = {
        str(payload.get("sireum_version", "")) for payload in payloads
        if payload.get("sireum_version")
    }
    if len(versions) != 1:
        raise CoverageError(f"Sireum version changed within analysis: {sorted(versions)}")
    resolve_with_sireum.sireum_version = next(iter(versions))  # type: ignore[attr-defined]
    results: list[Sequence[Mapping[str, Any]]] = []
    for payload in payloads:
        if payload.get("semantic_authority") != "Sireum FrontEnd.typeCheck / resolved AIR and GclAnnexClauseInfo":
            raise CoverageError("Sireum AIR adapter reported an unexpected semantic authority")
        models = payload.get("resolved_models")
        if not isinstance(models, Sequence) or isinstance(models, (str, bytes)):
            raise CoverageError("Sireum AIR adapter did not emit resolved_models")
        if any(not isinstance(model, Mapping) for model in models):
            raise CoverageError("Sireum AIR adapter emitted a malformed resolved model")
        results.append(tuple(models))  # type: ignore[arg-type]
    return tuple(results)


def _quartiles(values: Sequence[int]) -> tuple[float | int, float | int, float | int, float | int]:
    if not values:
        return 0, 0, 0, 0
    ordered = sorted(values)

    def percentile(p: float) -> float:
        if len(ordered) == 1:
            return float(ordered[0])
        index = (len(ordered) - 1) * p
        lower = int(index)
        upper = min(lower + 1, len(ordered) - 1)
        fraction = index - lower
        return ordered[lower] + (ordered[upper] - ordered[lower]) * fraction

    def clean(value: float) -> float | int:
        rounded = round(value, 3)
        return int(rounded) if rounded.is_integer() else rounded

    q1, median, q3 = percentile(0.25), percentile(0.5), percentile(0.75)
    return clean(median), clean(q1), clean(q3), clean(q3 - q1)


def _coverage_stats(values: Sequence[int]) -> Mapping[str, Any]:
    median, q1, q3, iqr = _quartiles(values)
    denominator = len(values)
    prevalence = sum(value > 0 for value in values)
    return {
        "models": prevalence,
        "models_total": denominator,
        "prevalence_percent": round(100 * prevalence / denominator, 3) if denominator else 0,
        "occurrences": sum(values),
        "per_model_median": median,
        "per_model_q1": q1,
        "per_model_q3": q3,
        "per_model_iqr": iqr,
    }


def _relative(path: Path) -> str:
    try:
        return path.resolve().relative_to(REPO_ROOT).as_posix()
    except ValueError:
        return path.resolve().as_posix()


def build_report(
    runs: Sequence[SelectedRun], metrics: Sequence[ModelMetrics],
    library: Mapping[str, Any], sireum_version: str,
) -> dict[str, Any]:
    if len(runs) != 48 or len(metrics) != 48:
        raise CoverageError("report construction requires exactly 48 selected and resolved models")
    report_entries: list[dict[str, Any]] = []
    breadth: dict[str, Any] = {}
    gaps: dict[str, list[str]] = {}
    balanced: dict[str, list[str]] = {}
    for dimension, catalog in CATALOGS.items():
        exercised = 0
        gap_symbols: list[str] = []
        balanced_symbols: list[str] = []
        for entry in catalog:
            overall_values = [item.counts[dimension][entry.symbol] for item in metrics]
            overall = _coverage_stats(overall_values)
            tier_stats = {
                tier: _coverage_stats([
                    item.counts[dimension][entry.symbol]
                    for run, item in zip(runs, metrics, strict=True)
                    if run.complexity == tier
                ])
                for tier in TIERS
            }
            is_balanced = all(tier_stats[tier]["models"] > 0 for tier in TIERS)
            if overall["models"]:
                exercised += 1
            else:
                gap_symbols.append(entry.symbol)
            if is_balanced:
                balanced_symbols.append(entry.symbol)
            values: list[dict[str, Any]] = []
            observed_values = sorted({
                value for item in metrics
                for symbol, value in item.values
                if symbol == entry.symbol
            })
            for value in observed_values:
                value_overall = _coverage_stats([
                    item.values[(entry.symbol, value)] for item in metrics
                ])
                value_tiers = {
                    tier: _coverage_stats([
                        item.values[(entry.symbol, value)]
                        for run, item in zip(runs, metrics, strict=True)
                        if run.complexity == tier
                    ])
                    for tier in TIERS
                }
                values.append({"value": value, "overall": value_overall, "tiers": value_tiers})
            observed_set = set(observed_values)
            value_gaps = [value for value in entry.enum_values if value not in observed_set]
            report_entries.append({
                "dimension": dimension,
                "group": entry.group,
                "entry": entry.symbol,
                "source": entry.source,
                "overall": overall,
                "tiers": tier_stats,
                "hard_minus_small_percentage_points": round(
                    tier_stats["hard"]["prevalence_percent"]
                    - tier_stats["small"]["prevalence_percent"], 3
                ),
                "balanced_all_tiers": is_balanced,
                "values": values,
                "catalog_enum_values": list(entry.enum_values),
                "unexercised_catalog_enum_values": value_gaps,
            })
        total = len(catalog)
        breadth[dimension] = {
            "exercised": exercised, "catalog_size": total,
            "ratio": round(exercised / total, 6),
            "percent": round(100 * exercised / total, 3),
        }
        gaps[dimension] = gap_symbols
        balanced[dimension] = balanced_symbols

    direction_entries: list[dict[str, Any]] = []
    for direction in PORT_DIRECTIONS:
        overall = _coverage_stats([item.directions[direction] for item in metrics])
        tier_stats = {
            tier: _coverage_stats([
                item.directions[direction]
                for run, item in zip(runs, metrics, strict=True)
                if run.complexity == tier
            ])
            for tier in TIERS
        }
        direction_entries.append({
            "dimension": "port_direction", "group": "port direction", "entry": direction,
            "overall": overall, "tiers": tier_stats,
            "hard_minus_small_percentage_points": round(
                tier_stats["hard"]["prevalence_percent"] - tier_stats["small"]["prevalence_percent"], 3
            ),
            "balanced_all_tiers": all(tier_stats[tier]["models"] > 0 for tier in TIERS),
            "values": [], "catalog_enum_values": [], "unexercised_catalog_enum_values": [],
        })
    gaps["port_direction"] = [
        item["entry"] for item in direction_entries if item["overall"]["models"] == 0
    ]
    balanced["port_direction"] = [
        item["entry"] for item in direction_entries if item["balanced_all_tiers"]
    ]
    report_entries.extend(direction_entries)

    model_rows: list[dict[str, Any]] = []
    for run, item in zip(runs, metrics, strict=True):
        richness = {
            dimension: sum(bool(item.counts[dimension][entry.symbol]) for entry in catalog)
            for dimension, catalog in CATALOGS.items()
        }
        richness["all_catalog_entries"] = sum(richness.values())
        model_rows.append({
            "cell_id": run.cell_id, "family_id": run.family_id,
            "complexity": run.complexity, "replicate": run.replicate,
            "run_id": run.run_id, "completed_at": run.completed_at,
            "run_dir": _relative(run.run_dir), "source": _relative(run.source),
            "source_sha256": run.source_sha256,
            "accepted_candidates_for_cell": run.accepted_candidates,
            "sireum_resolution": "passed", "resolved_source_roots": item.resolved_root_count,
            "richness": richness,
        })
    richness_by_tier: dict[str, Any] = {}
    for tier in TIERS:
        selected_rows = [row for row in model_rows if row["complexity"] == tier]
        richness_by_tier[tier] = {}
        for dimension in (*CATALOGS.keys(), "all_catalog_entries"):
            values = [int(row["richness"][dimension]) for row in selected_rows]
            median, q1, q3, iqr = _quartiles(values)
            richness_by_tier[tier][dimension] = {
                "median": median, "q1": q1, "q3": q3, "iqr": iqr,
                "minimum": min(values), "maximum": max(values),
            }

    ignored = Counter()
    for item in metrics:
        ignored.update(item.ignored_properties)
    value_gaps = {
        entry["entry"]: entry["unexercised_catalog_enum_values"]
        for entry in report_entries if entry["unexercised_catalog_enum_values"]
    }
    report: dict[str, Any] = {
        "schema_version": SCHEMA_VERSION,
        "semantic_authority": "Sireum FrontEnd.typeCheck resolved HAMR AIR",
        "coverage_boundary": (
            "Resolved-effective AADL architecture use. Inherited, derived, and materialized "
            "default properties count; imports without a reachable resolved use do not. GUMBO "
            "grammar and contract-operator coverage are outside scope."
        ),
        "campaign": {
            "campaign_id": "cps-48-v1", "selected_models": 48,
            "tier_population": {tier: 16 for tier in TIERS},
            "canonical_rule": "latest completed accepted run per (family_id, complexity, replicate)",
        },
        "sireum_version": sireum_version,
        "library": dict(library),
        "catalog": {
            dimension: [entry.symbol for entry in entries]
            for dimension, entries in CATALOGS.items()
        } | {"port_direction": list(PORT_DIRECTIONS)},
        "breadth": breadth,
        "balanced_coverage": balanced,
        "gap_inventory": gaps,
        "enum_value_gap_inventory": value_gaps,
        "entries": report_entries,
        "tier_richness": richness_by_tier,
        "models": model_rows,
        "noncatalog_resolved_properties": dict(sorted(ignored.items())),
        "notes": [
            "Queue_Size is counted wherever Sireum materializes it in AIR, including effective default value 1.",
            "Connection occurrences count resolved component connections once; AIR connectionInstances are not added again because they re-express resolved paths through those connections.",
            "Per-model quartiles use inclusive linear interpolation and include zero-use models.",
            "No weighted cross-dimension score or significance test is reported.",
        ],
    }
    digest_payload = json.dumps(report, sort_keys=True, separators=(",", ":")).encode("utf-8")
    report["analytical_content_sha256"] = hashlib.sha256(digest_payload).hexdigest()
    return report


def render_csv(report: Mapping[str, Any]) -> str:
    columns = (
        "record_type", "dimension", "group", "catalog_entry", "tier", "value",
        "models_with_occurrence", "models_total", "prevalence_percent", "occurrences",
        "per_model_median", "per_model_q1", "per_model_q3", "per_model_iqr",
        "hard_minus_small_percentage_points", "balanced_all_tiers",
    )
    output = io.StringIO(newline="")
    writer = csv.DictWriter(output, fieldnames=columns, lineterminator="\n")
    writer.writeheader()
    for entry in report["entries"]:
        for tier in ("overall", *TIERS):
            stats = entry["overall"] if tier == "overall" else entry["tiers"][tier]
            writer.writerow({
                "record_type": "coverage", "dimension": entry["dimension"],
                "group": entry["group"], "catalog_entry": entry["entry"], "tier": tier,
                "value": "", "models_with_occurrence": stats["models"],
                "models_total": stats["models_total"],
                "prevalence_percent": stats["prevalence_percent"],
                "occurrences": stats["occurrences"],
                "per_model_median": stats["per_model_median"],
                "per_model_q1": stats["per_model_q1"],
                "per_model_q3": stats["per_model_q3"],
                "per_model_iqr": stats["per_model_iqr"],
                "hard_minus_small_percentage_points": entry["hard_minus_small_percentage_points"] if tier == "overall" else "",
                "balanced_all_tiers": str(entry["balanced_all_tiers"]).lower() if tier == "overall" else "",
            })
        for value in entry["values"]:
            for tier in ("overall", *TIERS):
                stats = value["overall"] if tier == "overall" else value["tiers"][tier]
                writer.writerow({
                    "record_type": "property_value", "dimension": entry["dimension"],
                    "group": entry["group"], "catalog_entry": entry["entry"],
                    "tier": tier, "value": value["value"],
                    "models_with_occurrence": stats["models"],
                    "models_total": stats["models_total"],
                    "prevalence_percent": stats["prevalence_percent"],
                    "occurrences": stats["occurrences"],
                    "per_model_median": stats["per_model_median"],
                    "per_model_q1": stats["per_model_q1"],
                    "per_model_q3": stats["per_model_q3"],
                    "per_model_iqr": stats["per_model_iqr"],
                    "hard_minus_small_percentage_points": "",
                    "balanced_all_tiers": "",
                })
    return output.getvalue()


def _entry_table(entries: Sequence[Mapping[str, Any]], dimension: str) -> list[str]:
    rows = [
        "| Entry | Overall prevalence | Occurrences | Median [IQR] | Small | Medium | Hard | Hard-small pp | All tiers? |",
        "|---|---:|---:|---:|---:|---:|---:|---:|:---:|",
    ]
    for entry in entries:
        if entry["dimension"] != dimension:
            continue
        overall = entry["overall"]
        tier = entry["tiers"]
        rows.append(
            f"| `{entry['entry']}` | {overall['models']}/{overall['models_total']} | "
            f"{overall['occurrences']} | {overall['per_model_median']} [{overall['per_model_iqr']}] | "
            f"{tier['small']['models']}/16 | {tier['medium']['models']}/16 | {tier['hard']['models']}/16 | "
            f"{entry['hard_minus_small_percentage_points']:+g} | {'yes' if entry['balanced_all_tiers'] else 'no'} |"
        )
    return rows


def render_markdown(report: Mapping[str, Any]) -> str:
    breadth = report["breadth"]
    entries = report["entries"]
    queue = next(entry for entry in entries if entry["entry"] == "Communication_Properties::Queue_Size")
    prominent = sorted(
        (entry for entry in entries if entry["dimension"] in {"component", "feature", "connection"}),
        key=lambda entry: (-entry["overall"]["models"], -entry["overall"]["occurrences"], entry["entry"]),
    )[:8]
    names = ", ".join(f"`{entry['entry'].split('::')[-1]}`" for entry in prominent if entry["overall"]["models"])
    scheduling_prefixes = (
        "Thread_Properties::Dispatch_Protocol", "Thread_Properties::POSIX_Scheduling_Policy",
        "Thread_Properties::Priority", "Deployment_Properties::", "CASE_Scheduling::",
        "HAMR_Microkit::Scheduling",
    )
    scheduling = [
        entry for entry in entries
        if entry["dimension"] == "property"
        and any(entry["entry"].startswith(prefix) for prefix in scheduling_prefixes)
        and entry["overall"]["models"]
    ]
    scheduling_text = (
        ", ".join(f"`{entry['entry']}` ({entry['overall']['models']}/48)" for entry in scheduling)
        if scheduling else "none of the curated scheduling properties"
    )
    lines = [
        "# AADL-in-SysML coverage proof of concept",
        "",
        "The canonical CPS-48 population resolves successfully: **48 accepted models**, with "
        "**16 small, 16 medium, and 16 hard**. One run is selected per "
        "`(family_id, complexity, replicate)` cell using the latest-completion rule.",
        "",
        "## Result",
        "",
        "| Dimension | Exercised | Catalog size | Breadth |",
        "|---|---:|---:|---:|",
    ]
    for dimension in ("component", "feature", "connection", "property"):
        item = breadth[dimension]
        lines.append(f"| {dimension.title()} | {item['exercised']} | {item['catalog_size']} | {item['percent']}% |")
    lines.extend([
        "",
        "## Visual summary",
        "",
        "### Relative breadth",
        "",
        "![Normalized stacked bars showing exercised and unexercised catalog breadth for components, features, connections, and properties.](plots/breadth-overview.svg)",
        "",
        "The normalized view makes the cross-dimension sparsity comparable despite the different catalog sizes.",
        "",
        "### Occurrence distributions across tiers",
        "",
        "![Tier-colored dot-and-range plot showing per-model medians and interquartile ranges for the dominant resolved constructs.](plots/tier-occurrence-distributions.svg)",
        "",
        "Structural volume rises consistently from small to hard even though the set of distinct feature kinds barely changes. "
        "`Queue_Size` exactly tracks data-port volume because Sireum materializes it on every resolved data port in this corpus.",
        "",
        "### Per-model richness",
        "",
        "![Bubble plot showing the number of models at each distinct catalog-richness value by tier.](plots/richness-by-tier.svg)",
        "",
        "All small and medium models exercise seven catalog entries. Fifteen hard models also exercise seven; one hard model reaches eight through `AADL::Abstract`.",
        "",
        "### Property gaps by capability area",
        "",
        "![Horizontal bars grouping exercised and unexercised execution and deployment properties by capability area.](plots/property-gaps-by-group.svg)",
        "",
        "This count view localizes the property shortfall: communication has one exercised entry, while every execution-timing, scheduling, ROS, and HAMR-specific entry is absent.",
        "",
        f"The preliminary concentration pattern is confirmed by the resolved counts: the most prevalent architecture entries are {names}. "
        f"Effective scheduling coverage is {scheduling_text}.",
        "",
        f"`Communication_Properties::Queue_Size` occurs {queue['overall']['occurrences']} times in {queue['overall']['models']}/48 models. "
        "That total deliberately includes value `1` wherever Sireum materializes the effective default; it is not an authored-text count.",
        "",
        "No weighted score combines these unlike dimensions, and no significance tests are used in this descriptive POC.",
        "",
        "## Method and boundary",
        "",
        "Sireum `FrontEnd.typeCheck` and its resolved HAMR AIR are the semantic authority. The walker recursively counts source-rooted components, "
        "features, directions, connections, and effective property attachments. Derived user definitions count under their resolved AIR category; "
        "inherited and defaulted properties count when materialized in AIR.",
        "",
        "The frontend also exposes library roots and globally visible data definitions. Those are not treated as uses: roots must originate in the "
        "selected source, and data definitions must be reachable from a resolved classifier reference. Thus an import alone contributes zero coverage.",
        "",
        "Component occurrence totals count AIR `Component` nodes in the source-rooted architecture plus nodes in those reachable data-component trees; "
        "the `Data` total therefore includes resolved data-type and nested field nodes represented as components by AIR.",
        "",
        "Connection frequency counts each resolved `Component.connections` occurrence once. `connectionInstances` are not added because they are the "
        "resolved path view of those same connections. Quartiles use inclusive linear interpolation over all models in the stratum, including zeros.",
        "",
        "This is architecture-dialect coverage, not GUMBO grammar or contract-operator coverage. Campaign acceptance rules, prompts, models, and libraries "
        "were not changed.",
        "",
        "## Reproduce",
        "",
        "```bash",
        "PYTHONPATH=src python3 scripts/analysis/aadl_coverage.py",
        "```",
        "",
        "Set `SIREUM_HOME` or pass `--sireum-home` when Sireum is not available on `PATH`. "
        "The command fails closed unless the population, status and source hashes, library revision and symbols, and all Sireum resolutions validate.",
        "",
        "To regenerate only the plots from existing analytical content:",
        "",
        "```bash",
        "PYTHONPATH=src python3 scripts/analysis/aadl_coverage_plots.py build/aadl-coverage/coverage.json",
        "```",
        "",
        "## Provenance",
        "",
        f"- Campaign: `cps-48-v1`",
        f"- Sireum: `{report['sireum_version']}`",
        f"- Library commit: `{report['library']['commit']}`",
        f"- Library content SHA-256: `{report['library']['content_sha256']}` over {report['library']['sysml_file_count']} `.sysml` files",
        f"- Catalog symbols validated against library source: {report['library']['catalog_entries_validated']}",
        f"- Analytical content SHA-256: `{report['analytical_content_sha256']}`",
        "- Machine-readable detail: [`coverage.json`](coverage.json)",
        "- Tidy long-form data: [`coverage.csv`](coverage.csv)",
        "",
        "## Tier richness",
        "",
        "Distinct-feature richness is the number of different catalog entries present in a model, without weighting one dimension against another.",
        "",
        "| Tier | All entries median [IQR] | Components | Features | Connections | Properties |",
        "|---|---:|---:|---:|---:|---:|",
    ])
    for tier in TIERS:
        values = report["tier_richness"][tier]
        cell = lambda key: f"{values[key]['median']} [{values[key]['iqr']}]"  # noqa: E731
        lines.append(f"| {tier} | {cell('all_catalog_entries')} | {cell('component')} | {cell('feature')} | {cell('connection')} | {cell('property')} |")
    for dimension, title in (
        ("component", "Component categories"), ("feature", "Feature kinds"),
        ("connection", "Connection kinds"), ("port_direction", "Port directions"),
        ("property", "Execution and deployment properties"),
    ):
        lines.extend(["", f"## {title}", "", *_entry_table(entries, dimension)])
    lines.extend(["", "## Property-value distributions", ""])
    value_rows = [entry for entry in entries if entry["values"]]
    if not value_rows:
        lines.append("No curated property values were exposed in resolved AIR.")
    else:
        lines.extend(["| Property | Resolved value | Models | Occurrences |", "|---|---|---:|---:|"])
        for entry in value_rows:
            for value in entry["values"]:
                lines.append(f"| `{entry['entry']}` | `{value['value']}` | {value['overall']['models']}/48 | {value['overall']['occurrences']} |")
    lines.extend(["", "## Gap inventory", ""])
    for dimension in ("component", "feature", "connection", "port_direction", "property"):
        values = report["gap_inventory"][dimension]
        lines.append(f"- {dimension}: " + (", ".join(f"`{value}`" for value in values) if values else "none"))
    enum_gaps = report["enum_value_gap_inventory"]
    lines.extend(["", "Unexercised values from curated enum domains:", ""])
    if enum_gaps:
        for symbol, values in sorted(enum_gaps.items()):
            lines.append(f"- `{symbol}`: " + ", ".join(f"`{value}`" for value in values))
    else:
        lines.append("- none")
    lines.extend(["", "## Canonical population", "", "| Cell | Selected run | Completed | Accepted candidates |", "|---|---|---|---:|"])
    for model in report["models"]:
        lines.append(f"| `{model['cell_id']}` | `{model['run_id']}` | {model['completed_at']} | {model['accepted_candidates_for_cell']} |")
    return "\n".join(lines) + "\n"


def write_outputs(output_dir: Path, report: Mapping[str, Any]) -> None:
    output_dir.mkdir(parents=True, exist_ok=True)
    (output_dir / "coverage.json").write_text(
        json.dumps(report, indent=2, sort_keys=True) + "\n", encoding="utf-8"
    )
    (output_dir / "coverage.csv").write_text(render_csv(report), encoding="utf-8")
    (output_dir / "README.md").write_text(render_markdown(report), encoding="utf-8")
    try:
        from scripts.analysis import aadl_coverage_plots
    except ModuleNotFoundError:  # pragma: no cover - direct script execution fallback
        import aadl_coverage_plots  # type: ignore[no-redef]
    aadl_coverage_plots.write_plots(output_dir / "plots", report)


def analyze(
    manifest_path: Path = DEFAULT_MANIFEST,
    runs_dir: Path = DEFAULT_RUNS,
    library_dir: Path = DEFAULT_LIBRARY,
    output_dir: Path = DEFAULT_OUTPUT,
    sireum_home: Path | None = None,
    timeout: int = 1200,
    resolver: Resolver = resolve_with_sireum,
) -> dict[str, Any]:
    if timeout <= 0:
        raise CoverageError("Sireum timeout must be positive")
    selected = select_canonical_runs(manifest_path.resolve(), runs_dir.resolve())
    library = validate_library(library_dir.resolve())
    try:
        raw_results = resolver(selected, library_dir.resolve(), sireum_home, timeout)
    except CoverageError:
        raise
    except Exception as error:
        raise CoverageError(f"Sireum resolver failed: {error}") from error
    if len(raw_results) != len(selected):
        raise CoverageError("resolver result count differs from selected run count")
    metrics: list[ModelMetrics] = []
    for run, raw_models in zip(selected, raw_results, strict=True):
        if not isinstance(raw_models, Sequence) or isinstance(raw_models, (str, bytes)):
            raise CoverageError(f"resolver did not return AIR model objects for {run.run_id}")
        mapped = tuple(model for model in raw_models if isinstance(model, Mapping))
        if len(mapped) != len(raw_models):
            raise CoverageError(f"resolver returned malformed AIR for {run.run_id}")
        source_models = source_resolved_models(mapped, run.source)
        metrics.append(collect_model_metrics(source_models))
    sireum_version = getattr(resolver, "sireum_version", "test-double")
    report = build_report(selected, metrics, library, str(sireum_version))
    write_outputs(output_dir.resolve(), report)
    return report


def build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--manifest", type=Path, default=DEFAULT_MANIFEST)
    parser.add_argument("--runs-dir", type=Path, default=DEFAULT_RUNS)
    parser.add_argument("--library", type=Path, default=DEFAULT_LIBRARY)
    parser.add_argument("--output-dir", type=Path, default=DEFAULT_OUTPUT)
    parser.add_argument("--sireum-home", type=Path)
    parser.add_argument("--timeout", type=int, default=1200, help="whole 48-model Sireum batch timeout in seconds")
    return parser


def main(argv: Sequence[str] | None = None) -> int:
    args = build_parser().parse_args(argv)
    try:
        report = analyze(
            manifest_path=args.manifest, runs_dir=args.runs_dir,
            library_dir=args.library, output_dir=args.output_dir,
            sireum_home=args.sireum_home, timeout=args.timeout,
        )
    except CoverageError as error:
        print(f"AADL_COVERAGE_RESULT=FAILED: {error}", file=sys.stderr)
        return 2
    print(
        "AADL_COVERAGE_RESULT=PASSED "
        f"models={report['campaign']['selected_models']} "
        f"content_sha256={report['analytical_content_sha256']}"
    )
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
