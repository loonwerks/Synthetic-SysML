"""Focused, isolated Sireum/GumboX semantic-export helpers."""

from __future__ import annotations

from dataclasses import dataclass
import hashlib
import json
import os
from pathlib import Path
import re
import shutil
import subprocess
from typing import Iterable, Mapping

from .gumbox import (
    catalog_gumbox_file,
    catalog_slang_objects,
    lex_slang,
    matching_token,
)


@dataclass(frozen=True)
class CommandRun:
    command: tuple[str, ...]
    status: str
    exit_code: int | None
    output: str


@dataclass(frozen=True)
class GeneratedRoot:
    root: str
    package_name: str
    project: Path
    manifest: Path
    run: CommandRun


@dataclass(frozen=True)
class GeneratedSide:
    label: str
    staged_root: Path
    staged_file: Path
    export: CommandRun
    roots: tuple[GeneratedRoot, ...]


@dataclass(frozen=True)
class ReplayProject:
    project: Path
    copied_candidate_sources: tuple[Path, ...]
    proof_sources: tuple[Path, ...]
    neutralized_sources: tuple[Path, ...]
    required_neutral_sources: tuple[Path, ...]
    neutralization_records: tuple["NeutralCarrierReplacement", ...]
    disabled_container_adapters: tuple["DisabledContainerAdapter", ...] = ()


@dataclass(frozen=True)
class CandidateInvariantRewrite:
    """One native candidate datatype predicate relocated onto shared carriers."""

    source: Path
    source_object: str
    method_name: str


@dataclass(frozen=True)
class NeutralCarrierAttestation:
    """Hash-bound output of a structurally verified neutralization pass."""

    side: str
    generated_source: Path
    neutral_source: Path
    source_sha256: str
    neutral_sha256: str
    structural_verified: bool
    preserved_predicate_sha256: tuple[tuple[str, str], ...]

    @classmethod
    def from_record(cls, side: str, record: object) -> "NeutralCarrierAttestation":
        preserved = getattr(record, "preserved_predicate_sha256")
        if not isinstance(preserved, Mapping):
            raise TypeError("neutralization record has no predicate-hash mapping")
        return cls(
            side=side,
            generated_source=Path(str(getattr(record, "source"))),
            neutral_source=Path(str(getattr(record, "neutral_source"))),
            source_sha256=str(getattr(record, "source_sha256")),
            neutral_sha256=str(getattr(record, "neutral_sha256")),
            structural_verified=bool(getattr(record, "structural_verified")),
            preserved_predicate_sha256=tuple(
                sorted((str(name), str(digest)) for name, digest in preserved.items())
            ),
        )


@dataclass(frozen=True)
class NeutralCarrierReplacement:
    side: str
    generated_source: Path
    neutral_source: Path
    staged_source: Path
    source_sha256: str
    neutral_sha256: str
    staged_sha256: str
    preserved_predicate_sha256: tuple[tuple[str, str], ...]


@dataclass(frozen=True)
class DisabledContainerAdapter:
    """One unused generated container convenience method removed from proof code."""

    source: Path
    method_name: str
    original_body_sha256: str
    replacement_body_sha256: str


def disable_unused_container_adapters(source: Path) -> tuple[DisabledContainerAdapter, ...]:
    """Replace unused GumboX container convenience bodies with ``T``.

    Equivalence proofs call the direct composite predicates. Some Sireum
    versions also emit container convenience methods that do not type-check
    when initialization contracts read input ports. Those methods are safe to
    remove from the proof-only copy only when no retained method calls them.
    """

    source = source.resolve()
    text = source.read_text(encoding="utf-8")
    objects = catalog_gumbox_file(source)
    if len(objects) != 1:
        raise ValueError(f"expected one GumboX object in {source}, found {len(objects)}")
    owner = objects[0]
    adapters = {
        method.name
        for phase in (owner.initialize, owner.compute)
        for method in (phase.container_assumption, phase.container_guarantee)
        if method is not None
    }
    if not adapters:
        return ()
    direct = {
        method.name
        for phase in (owner.initialize, owner.compute)
        for method in (phase.assumption, phase.guarantee)
        if method is not None
    }
    callers = [
        f"{method.name}->{called}"
        for method in owner.methods
        if method.name not in adapters
        for called in method.calls
        if called in adapters
    ]
    if callers:
        raise ValueError(
            "generated contract calls a container convenience method: "
            + ", ".join(callers)
        )
    if adapters & direct:
        raise ValueError("direct contract method was mistaken for a container convenience method")

    preserved = {
        method.name: hashlib.sha256(
            text[method.start : method.end].encode("utf-8")
        ).hexdigest()
        for method in owner.methods
        if method.name not in adapters
    }
    tokens = lex_slang(text)
    token_by_start = {token.start: index for index, token in enumerate(tokens)}
    edits: list[tuple[int, int, str, str]] = []
    records: list[DisabledContainerAdapter] = []
    for method in owner.methods:
        if method.name not in adapters:
            continue
        first_index = token_by_start.get(method.body_start)
        if first_index is None:
            raise ValueError(f"cannot locate container convenience body for {method.name}")
        first = tokens[first_index]
        if first.text == "{":
            expression_end = tokens[matching_token(tokens, first_index)].end
        elif (
            first.kind == "identifier"
            and first_index + 1 < len(tokens)
            and tokens[first_index + 1].text == "("
        ):
            expression_end = tokens[matching_token(tokens, first_index + 1)].end
        else:
            raise ValueError(
                f"unsupported container convenience body shape for {method.name}"
            )
        original_body = text[method.body_start : expression_end]
        replacement = "{\n      T\n    }\n\n"
        edits.append((method.body_start, expression_end, replacement, method.name))
        records.append(
            DisabledContainerAdapter(
                source=source,
                method_name=method.name,
                original_body_sha256=hashlib.sha256(
                    original_body.encode("utf-8")
                ).hexdigest(),
                replacement_body_sha256=hashlib.sha256(
                    replacement.encode("utf-8")
                ).hexdigest(),
            )
        )
    rewritten = text
    for start, end, replacement, _ in sorted(edits, reverse=True):
        rewritten = rewritten[:start] + replacement + rewritten[end:]
    source.write_text(rewritten, encoding="utf-8")

    checked = catalog_gumbox_file(source)
    if len(checked) != 1:
        raise ValueError("container convenience removal damaged the GumboX source")
    checked_methods = {method.name: method for method in checked[0].methods}
    for name, expected in preserved.items():
        method = checked_methods.get(name)
        if method is None:
            raise ValueError(f"container convenience removal lost contract method {name}")
        actual = hashlib.sha256(
            rewritten[method.start : method.end].encode("utf-8")
        ).hexdigest()
        if actual != expected:
            raise ValueError(f"container convenience removal changed contract method {name}")
    return tuple(records)


SEMANTIC_EXPORT_SCHEMA = "equiv-checker-gumbo-semantic-export"
SEMANTIC_EXPORT_VERSION = 2
_SEMANTIC_ROLES = {
    "gumbox",
    "datatype",
    "container",
    "art-data-content",
    "project",
    "project-metadata",
    "gumbo-helper-carrier",
}


def validate_semantic_export(generated: GeneratedRoot) -> Mapping[str, object]:
    """Validate a focused export before any generated source is trusted.

    The manifest is a hash-bound allowlist, not merely an informational log.
    Every emitted file must be listed, every listed path must stay below the
    export root, and roles are restricted to the semantic closure required by
    GumboX replay.
    """

    if generated.project.is_symlink():
        raise ValueError("semantic export root must not be a symlink")
    project = generated.project.resolve()
    manifest_source = generated.manifest
    if manifest_source.is_symlink():
        raise ValueError("semantic export manifest must not be a symlink")
    manifest_path = manifest_source.resolve()
    if not manifest_path.is_file():
        raise ValueError(f"semantic export manifest is missing: {generated.manifest}")
    for path in generated.project.rglob("*"):
        if path.is_symlink():
            raise ValueError(f"semantic export contains a symlink: {path}")
    try:
        raw = json.loads(manifest_path.read_text(encoding="utf-8"))
    except (OSError, UnicodeError, json.JSONDecodeError) as error:
        raise ValueError(f"invalid semantic export manifest: {error}") from error
    if not isinstance(raw, dict):
        raise ValueError("semantic export manifest must be a JSON object")
    if raw.get("schema") != SEMANTIC_EXPORT_SCHEMA:
        raise ValueError("unknown semantic export manifest schema")
    if raw.get("version") not in {1, SEMANTIC_EXPORT_VERSION}:
        raise ValueError("unsupported semantic export manifest version")
    if raw.get("root") != generated.root:
        raise ValueError("semantic export root does not match requested root")
    if raw.get("package") != generated.package_name:
        raise ValueError("semantic export package does not match requested package")
    if not isinstance(raw.get("model"), str) or not raw["model"]:
        raise ValueError("semantic export manifest has no model identity")
    elapsed = raw.get("elapsed_seconds")
    if not isinstance(elapsed, (int, float)) or isinstance(elapsed, bool) or elapsed < 0:
        raise ValueError("semantic export elapsed_seconds is invalid")
    rejected = raw.get("rejected_resource_counts")
    if not isinstance(rejected, dict) or any(
        not isinstance(key, str)
        or not isinstance(value, int)
        or isinstance(value, bool)
        or value < 0
        for key, value in rejected.items()
    ):
        raise ValueError("semantic export rejected-resource counts are invalid")
    resources = raw.get("resources")
    if not isinstance(resources, list) or not resources:
        raise ValueError("semantic export manifest contains no resources")

    package_path = generated.package_name.replace(".", "/")
    seen: set[str] = set()
    roles: list[str] = []
    for entry in resources:
        if not isinstance(entry, dict):
            raise ValueError("semantic export resource entry must be an object")
        relative_text = entry.get("path")
        role = entry.get("role")
        digest = entry.get("sha256")
        native = entry.get("native_resource")
        if not isinstance(relative_text, str) or not relative_text:
            raise ValueError("semantic export resource has no relative path")
        relative = Path(relative_text)
        if relative.is_absolute() or ".." in relative.parts or relative_text in seen:
            raise ValueError(f"unsafe or duplicate semantic resource path: {relative_text}")
        seen.add(relative_text)
        if role not in _SEMANTIC_ROLES:
            raise ValueError(f"disallowed semantic resource role: {role!r}")
        if not isinstance(digest, str) or len(digest) != 64:
            raise ValueError(f"invalid semantic resource digest: {relative_text}")
        if not isinstance(native, bool):
            raise ValueError(f"semantic resource native flag is invalid: {relative_text}")

        expected_prefix: str
        if role == "gumbox":
            expected_prefix = f"src/main/bridge/{package_path}/"
            allowed = relative_text.startswith(expected_prefix) and relative_text.endswith(
                "_GumboX.scala"
            )
        elif role in {"datatype", "container"}:
            expected_prefix = f"src/main/data/{package_path}/"
            allowed = relative_text.startswith(expected_prefix) and relative_text.endswith(
                ".scala"
            )
        elif role == "gumbo-helper-carrier":
            expected_prefix = f"src/main/component/{package_path}/"
            allowed = relative_text.startswith(expected_prefix) and relative_text.endswith(
                ".scala"
            )
        elif role == "art-data-content":
            allowed = relative_text == "src/main/art/art/DataContent.scala"
        elif role == "project-metadata":
            allowed = relative_text == "versions.properties"
        else:
            allowed = relative_text == "bin/project.cmd"
        if not allowed:
            raise ValueError(
                f"semantic resource path is inconsistent with role {role}: {relative_text}"
            )
        if native != (
            role in {"gumbox", "datatype", "container", "project-metadata"}
        ):
            raise ValueError(
                f"semantic resource native flag is inconsistent with role {role}: "
                f"{relative_text}"
            )

        target_source = project / relative
        if target_source.is_symlink():
            raise ValueError(f"semantic resource is a symlink: {relative_text}")
        target = target_source.resolve()
        try:
            target.relative_to(project)
        except ValueError as error:
            raise ValueError(f"semantic resource escapes export root: {relative_text}") from error
        if not target.is_file() or target.is_symlink():
            raise ValueError(f"semantic resource is missing or unsafe: {relative_text}")
        actual = hashlib.sha256(target.read_bytes()).hexdigest()
        if actual != digest:
            raise ValueError(f"semantic resource hash mismatch: {relative_text}")
        roles.append(role)

    emitted = {
        path.relative_to(project).as_posix()
        for path in project.rglob("*")
        if path.is_file() and path.resolve() != manifest_path
    }
    if emitted != seen:
        missing = sorted(seen - emitted)
        extra = sorted(emitted - seen)
        raise ValueError(
            f"semantic export manifest/file mismatch: missing={missing}, extra={extra}"
        )
    if (
        roles.count("art-data-content") != 1
        or roles.count("project") != 1
        or roles.count("project-metadata") != 1
    ):
        raise ValueError(
            "semantic export must contain one runtime stub, project file, and versions file"
        )
    return raw


def resolve_sireum_executable(configured_home: Path | None = None) -> Path:
    candidates: list[Path] = []
    if configured_home is not None:
        candidates.append(configured_home.expanduser().resolve() / "bin" / "sireum")
    environment = os.environ.get("SIREUM_HOME")
    if environment:
        candidates.append(Path(environment).expanduser().resolve() / "bin" / "sireum")
    executable = shutil.which("sireum")
    if executable:
        candidates.append(Path(executable).resolve())
    for candidate in candidates:
        if candidate.is_file() and os.access(candidate, os.X_OK):
            return candidate
    raise FileNotFoundError("Sireum was not found; set SIREUM_HOME")


def run_command(command: Iterable[str | Path], *, cwd: Path, timeout: int) -> CommandRun:
    normalized = tuple(str(item) for item in command)
    try:
        completed = subprocess.run(
            normalized,
            cwd=cwd,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            timeout=timeout,
            check=False,
        )
        return CommandRun(
            normalized,
            "PASSED" if completed.returncode == 0 else "REJECTED",
            completed.returncode,
            completed.stdout,
        )
    except subprocess.TimeoutExpired as error:
        raw = error.stdout or ""
        output = raw.decode() if isinstance(raw, bytes) else raw
        return CommandRun(normalized, "TIMEOUT", None, output)
    except OSError as error:
        return CommandRun(normalized, "TOOL_ERROR", None, str(error))


def stage_input(source: Path, destination: Path) -> tuple[Path, Path]:
    """Copy an input without carrying generated/cache directories along."""

    source = source.resolve()
    if source.is_file():
        destination.mkdir(parents=True, exist_ok=False)
        staged_file = destination / source.name
        shutil.copy2(source, staged_file)
        return destination, staged_file
    if source.is_dir():
        shutil.copytree(
            source,
            destination,
            ignore=shutil.ignore_patterns(".slang", "out", "target", ".idea", "__pycache__"),
        )
        files = tuple(sorted(destination.rglob("*.sysml")))
        if len(files) != 1:
            raise ValueError(
                "the first release requires exactly one root SysML file per input directory; "
                f"found {len(files)}"
            )
        return destination, files[0]
    raise FileNotFoundError(source)


def generate_sides(
    *,
    oracle_source: Path,
    candidate_source: Path,
    roots: tuple[str, ...],
    workspace: Path,
    sireum: Path,
    library: Path,
    timeout: int,
    repo_root: Path,
) -> tuple[GeneratedSide, GeneratedSide]:
    """Export both sides and all selected roots in one Sireum JVM.

    The exporter itself performs SysML parsing/resolution.  The former
    ``hamr sysml logika --sat`` preflight checked only integration constraints,
    which this checker's supported slice rejects before reaching this stage.
    Running it here therefore added a process launch without strengthening the
    component/datatype proof obligations.
    """

    staged: dict[str, tuple[Path, Path]] = {}
    for label, source in (
        ("oracle", oracle_source),
        ("candidate", candidate_source),
    ):
        staged[label] = stage_input(source, workspace / f"{label}-input")

    arguments: list[str | Path] = [
        sireum,
        "slang",
        "run",
        repo_root / "src" / "equiv_checker" / "adapters" / "GumboSemanticExport.scala",
        "--batch",
        library.resolve(),
    ]
    descriptors: dict[str, list[tuple[str, str, Path]]] = {
        "oracle": [],
        "candidate": [],
    }
    for label in ("oracle", "candidate"):
        _, staged_file = staged[label]
        for index, root in enumerate(roots):
            package_name = (
                f"equiv_shared_{index}" if label == "oracle" else f"equiv_candidate_{index}"
            )
            output = workspace / f"{label}-root-{index}-semantic"
            arguments.extend((staged_file, root, package_name, output))
            descriptors[label].append((root, package_name, output))

    run = run_command(arguments, cwd=repo_root, timeout=timeout)
    sides: list[GeneratedSide] = []
    for label in ("oracle", "candidate"):
        generated = tuple(
            GeneratedRoot(
                root=root,
                package_name=package_name,
                project=output,
                manifest=output / "semantic-export.json",
                run=run,
            )
            for root, package_name, output in descriptors[label]
            if (output / "semantic-export.json").is_file()
        )
        staged_root, staged_file = staged[label]
        sides.append(GeneratedSide(label, staged_root, staged_file, run, generated))
    return sides[0], sides[1]


def merge_generated_projects(oracle: Path, candidate: Path) -> tuple[Path, ...]:
    """Merge candidate namespaced sources, rejecting every differing collision."""

    oracle_main = oracle / "src" / "main"
    candidate_main = candidate / "src" / "main"
    if not oracle_main.is_dir() or not candidate_main.is_dir():
        raise ValueError("generated Slang project has no src/main")
    pending: list[tuple[Path, Path]] = []
    collisions: list[str] = []
    for source in sorted(candidate_main.rglob("*.scala")):
        relative = source.relative_to(candidate_main)
        destination = oracle_main / relative
        if destination.exists():
            if source.read_bytes() != destination.read_bytes():
                collisions.append(str(relative))
            continue
        pending.append((source, destination))
    if collisions:
        raise ValueError(
            "independently generated common sources differ: " + ", ".join(collisions)
        )
    copied: list[Path] = []
    for source, destination in pending:
        destination.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(source, destination)
        copied.append(destination)
    return tuple(copied)


def _top_level_object_region(text: str, object_name: str) -> tuple[int, int, int, int]:
    """Return object-name and full declaration spans for one top-level object."""

    tokens = lex_slang(text)
    enclosing: list[int] = []
    matches: list[tuple[int, int, int, int]] = []
    for index, token in enumerate(tokens):
        enclosing = [close for close in enclosing if index < close]
        if token.text != "object" or index + 1 >= len(tokens):
            continue
        name = tokens[index + 1]
        cursor = index + 2
        while cursor < len(tokens) and tokens[cursor].text not in {"{", "=", ";"}:
            cursor += 1
        if cursor >= len(tokens) or tokens[cursor].text != "{":
            continue
        close = matching_token(tokens, cursor)
        if not enclosing and name.text == object_name:
            matches.append((name.start, name.end, token.start, tokens[close].end))
        enclosing.append(close)
    if len(matches) != 1:
        raise ValueError(
            f"expected exactly one top-level object {object_name!r}, found {len(matches)}"
        )
    return matches[0]


def _package_suffix(source_object: str, package_name: str) -> str:
    prefix = f"{package_name}."
    if not source_object.startswith(prefix):
        raise ValueError(
            f"generated object {source_object!r} is outside package {package_name!r}"
        )
    return source_object[len(prefix) :]


def _replace_identifier(text: str, old: str, new: str) -> str:
    return re.sub(rf"(?<![A-Za-z0-9_]){re.escape(old)}(?![A-Za-z0-9_])", new, text)


def _shared_candidate_gumbox(
    source: Path,
    *,
    candidate_package: str,
    shared_package: str,
    invariant_rewrites: Iterable[CandidateInvariantRewrite],
    helper_objects: Iterable[str] = (),
) -> tuple[str, str]:
    """Relocate native candidate GumboX onto the fixed model's shared types."""

    text = source.read_text(encoding="utf-8")
    gumbox = catalog_gumbox_file(source)
    if len(gumbox) != 1:
        raise ValueError(f"candidate GumboX source has {len(gumbox)} GumboX objects: {source}")
    old_name = gumbox[0].name
    new_name = f"{old_name.removesuffix('_GumboX')}_Candidate_GumboX"
    name_start, name_end, _, _ = _top_level_object_region(text, old_name)
    text = text[:name_start] + new_name + text[name_end:]
    text = _replace_identifier(text, candidate_package, shared_package)

    # Candidate contracts must continue to call the candidate's helper
    # definitions after both contracts are moved into the shared type package.
    # Renaming the whole helper object keeps those definitions separate without
    # translating or reimplementing any helper body.
    for helper_object in helper_objects:
        text = _replace_identifier(text, helper_object, f"{helper_object}_Candidate")

    for rewrite in invariant_rewrites:
        relative_owner = _package_suffix(rewrite.source_object, candidate_package)
        owner_prefix, _, owner_name = relative_owner.rpartition(".")
        candidate_owner_name = f"{owner_name}_Candidate"
        target_owner = (
            f"{owner_prefix}.{candidate_owner_name}"
            if owner_prefix
            else candidate_owner_name
        )
        target_method = f"{rewrite.method_name}_Candidate"
        text = text.replace(
            f"{relative_owner}.{rewrite.method_name}",
            f"{target_owner}.{target_method}",
        )
        text = text.replace(
            f"{rewrite.source_object}.{rewrite.method_name}",
            f"{shared_package}.{target_owner}.{target_method}",
        )
    return new_name, text


def _shared_candidate_helper(
    source: Path,
    *,
    candidate_package: str,
    shared_package: str,
) -> tuple[str, str]:
    """Relocate one native candidate helper carrier without changing its body."""

    text = source.read_text(encoding="utf-8")
    owners = catalog_slang_objects(text, source)
    if len(owners) != 1:
        raise ValueError(
            f"candidate helper carrier must contain exactly one object: {source}"
        )
    old_name = owners[0].name
    new_name = f"{old_name}_Candidate"
    name_start, name_end, _, _ = _top_level_object_region(text, old_name)
    text = text[:name_start] + new_name + text[name_end:]
    text = _replace_identifier(text, candidate_package, shared_package)
    return new_name, text


def _shared_candidate_invariant(
    rewrite: CandidateInvariantRewrite,
    *,
    candidate_package: str,
    shared_package: str,
) -> tuple[str, str, str]:
    """Extract a candidate invariant object without its duplicate datatype class."""

    text = rewrite.source.read_text(encoding="utf-8")
    relative_owner = _package_suffix(rewrite.source_object, candidate_package)
    owner_package, _, owner_name = relative_owner.rpartition(".")
    name_start, name_end, declaration_start, declaration_end = _top_level_object_region(
        text, owner_name
    )
    declaration = text[declaration_start:declaration_end]
    local_name_start = name_start - declaration_start
    local_name_end = name_end - declaration_start
    candidate_owner = f"{owner_name}_Candidate"
    declaration = (
        declaration[:local_name_start]
        + candidate_owner
        + declaration[local_name_end:]
    )
    candidate_method = f"{rewrite.method_name}_Candidate"
    declaration = _replace_identifier(declaration, rewrite.method_name, candidate_method)

    imports = []
    for line in text.splitlines():
        stripped = line.strip()
        if stripped.startswith("import "):
            imports.append(_replace_identifier(line, candidate_package, shared_package))
    package = f"{shared_package}.{owner_package}" if owner_package else shared_package
    rendered = (
        "// #Sireum\n\n"
        f"package {package}\n\n"
        + "\n".join(imports)
        + "\n\n"
        + declaration
        + "\n"
    )
    return candidate_owner, candidate_method, rendered


def create_shared_replay_project(
    *,
    oracle_project: Path,
    candidate_project: Path,
    oracle_package: str,
    candidate_package: str,
    destination: Path,
    required_neutral_sources: Iterable[Path],
    neutralizations: Iterable[NeutralCarrierAttestation],
    candidate_invariants: Iterable[CandidateInvariantRewrite],
) -> ReplayProject:
    """Build one fixed-model type universe with two native contract namespaces.

    The oracle export supplies the sole datatype/container implementation. Its
    invariant-bearing carriers are neutralized as before. Candidate GumboX
    objects are relocated into the oracle package and renamed, so their direct
    methods consume those same types. Candidate datatype invariant companions
    are extracted without copying the duplicate carrier class.
    """

    oracle_project = oracle_project.resolve()
    candidate_project = candidate_project.resolve()
    destination = destination.resolve()
    required = tuple(Path(item).resolve() for item in required_neutral_sources)
    attestations = tuple(neutralizations)
    invariants = tuple(candidate_invariants)
    if any(item.side != "oracle" for item in attestations):
        raise ValueError("shared replay accepts neutral carriers only from the oracle model")
    if destination.exists():
        raise FileExistsError(f"replay project destination already exists: {destination}")
    try:
        # Reuse the existing hash-bound replacement implementation without
        # merging candidate datatypes. An empty candidate tree is sufficient.
        empty_candidate = destination.parent / f".{destination.name}-empty-candidate"
        (empty_candidate / "src" / "main").mkdir(parents=True)
        try:
            base = create_replay_project(
                oracle_project=oracle_project,
                candidate_project=empty_candidate,
                destination=destination,
                required_neutral_sources=required,
                neutralizations=attestations,
            )
        finally:
            shutil.rmtree(empty_candidate, ignore_errors=True)
        copied: list[Path] = []
        invariant_targets: list[Path] = []
        shared_path = oracle_package.replace(".", "/")

        candidate_component = (
            candidate_project / "src/main/component" / candidate_package.replace(".", "/")
        )
        candidate_helper_sources = (
            sorted(candidate_component.rglob("*.scala"))
            if candidate_component.is_dir()
            else []
        )
        helper_objects: list[str] = []
        for source in candidate_helper_sources:
            name, rendered = _shared_candidate_helper(
                source,
                candidate_package=candidate_package,
                shared_package=oracle_package,
            )
            helper_objects.append(name.removesuffix("_Candidate"))
            relative_parent = source.relative_to(candidate_component).parent
            target = (
                destination
                / "src/main/component"
                / shared_path
                / relative_parent
                / f"{name}.scala"
            )
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_text(rendered, encoding="utf-8")
            copied.append(target)

        for rewrite in invariants:
            owner, _, rendered = _shared_candidate_invariant(
                rewrite,
                candidate_package=candidate_package,
                shared_package=oracle_package,
            )
            relative_owner = _package_suffix(rewrite.source_object, candidate_package)
            owner_package = relative_owner.rpartition(".")[0].replace(".", "/")
            target = (
                destination
                / "src/main/data"
                / shared_path
                / owner_package
                / f"{owner}.scala"
            )
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_text(rendered, encoding="utf-8")
            copied.append(target)
            invariant_targets.append(target)

        candidate_bridge = candidate_project / "src/main/bridge" / candidate_package.replace(
            ".", "/"
        )
        candidate_gumbox_sources = (
            sorted(candidate_bridge.rglob("*_GumboX.scala"))
            if candidate_bridge.is_dir()
            else []
        )
        for source in candidate_gumbox_sources:
            name, rendered = _shared_candidate_gumbox(
                source,
                candidate_package=candidate_package,
                shared_package=oracle_package,
                invariant_rewrites=invariants,
                helper_objects=helper_objects,
            )
            relative_parent = source.relative_to(candidate_bridge).parent
            target = (
                destination
                / "src/main/bridge"
                / shared_path
                / relative_parent
                / f"{name}.scala"
            )
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_text(rendered, encoding="utf-8")
            copied.append(target)

        disabled_adapters: list[DisabledContainerAdapter] = []
        replay_bridge = destination / "src/main/bridge"
        for source in sorted(replay_bridge.rglob("*_GumboX.scala")):
            disabled_adapters.extend(disable_unused_container_adapters(source))

        return ReplayProject(
            destination,
            tuple(copied),
            (),
            base.neutralized_sources,
            base.required_neutral_sources,
            base.neutralization_records,
            tuple(disabled_adapters),
        )
    except Exception:
        shutil.rmtree(destination, ignore_errors=True)
        raise


def create_replay_project(
    *,
    oracle_project: Path,
    candidate_project: Path,
    destination: Path,
    required_neutral_sources: Iterable[Path],
    neutralizations: Iterable[NeutralCarrierAttestation],
    proof_sources: Iterable[Path] = (),
) -> ReplayProject:
    """Build an isolated, minimal two-sided Proyek tree for proof replay.

    Generated inputs are never edited.  Candidate sources are collision-checked
    before copying, verified neutral-carrier files may replace their exact
    generated counterparts only in the replay tree, and proof sources are
    archived under the generated project's configured ``src/main/bridge``
    source root.
    """

    oracle_project = oracle_project.resolve()
    candidate_project = candidate_project.resolve()
    destination = destination.resolve()
    required = tuple(Path(item).resolve() for item in required_neutral_sources)
    if len(required) != len(set(required)):
        raise ValueError("required neutral carrier sources contain duplicates")
    attestations = tuple(neutralizations)
    attested_sources = [item.generated_source.resolve() for item in attestations]
    if len(attested_sources) != len(set(attested_sources)):
        raise ValueError("neutral carrier attestations contain duplicate generated sources")
    missing = sorted(set(required) - set(attested_sources))
    if missing:
        raise ValueError(
            "required datatype carrier neutralization is missing for: "
            + ", ".join(str(item) for item in missing)
        )
    extra = sorted(set(attested_sources) - set(required))
    if extra:
        raise ValueError(
            "neutral carrier attestations were not declared as required: "
            + ", ".join(str(item) for item in extra)
        )
    if destination.exists():
        raise FileExistsError(f"replay project destination already exists: {destination}")
    for project in (oracle_project, candidate_project):
        if not (project / "src" / "main").is_dir():
            raise ValueError(f"generated Slang project has no src/main: {project}")
    destination.mkdir(parents=True)
    try:
        shutil.copytree(oracle_project / "src" / "main", destination / "src" / "main")
        if (oracle_project / "bin" / "project.cmd").is_file():
            (destination / "bin").mkdir(parents=True)
            shutil.copy2(
                oracle_project / "bin" / "project.cmd",
                destination / "bin" / "project.cmd",
            )
        if (oracle_project / "versions.properties").is_file():
            shutil.copy2(
                oracle_project / "versions.properties", destination / "versions.properties"
            )
        copied_candidate = merge_generated_projects(destination, candidate_project)

        neutralized: list[Path] = []
        replacement_records: list[NeutralCarrierReplacement] = []
        for attestation in attestations:
            if attestation.side not in {"oracle", "candidate"}:
                raise ValueError(f"unknown neutral carrier side {attestation.side!r}")
            if not attestation.structural_verified:
                raise ValueError("neutral carrier is not structurally verified")
            if not attestation.preserved_predicate_sha256:
                raise ValueError("neutral carrier attestation has no preserved D_Inv hashes")
            if any(
                len(name) == 0 or len(digest) != 64
                for name, digest in attestation.preserved_predicate_sha256
            ):
                raise ValueError("neutral carrier predicate hash attestation is malformed")
            original = attestation.generated_source.resolve()
            neutral = attestation.neutral_source.resolve()
            if not neutral.is_file():
                raise FileNotFoundError(neutral)
            source_project = oracle_project if attestation.side == "oracle" else candidate_project
            source_main = source_project / "src" / "main"
            try:
                relative = original.relative_to(source_main)
            except ValueError as error:
                raise ValueError(
                    f"neutral carrier source is not in the attested {attestation.side} project: "
                    f"{original}"
                ) from error
            target = destination / "src" / "main" / relative
            if not target.is_file():
                raise ValueError(
                    f"neutral carrier source is not an exact generated project file: {original}"
                )
            source_hash = hashlib.sha256(original.read_bytes()).hexdigest()
            neutral_hash = hashlib.sha256(neutral.read_bytes()).hexdigest()
            if source_hash != attestation.source_sha256:
                raise ValueError(f"generated carrier hash changed after neutralization: {original}")
            if neutral_hash != attestation.neutral_sha256:
                raise ValueError(f"neutral carrier hash does not match attestation: {neutral}")
            if source_hash == neutral_hash:
                raise ValueError(f"neutral carrier did not change source bytes: {original}")
            shutil.copy2(neutral, target)
            staged_hash = hashlib.sha256(target.read_bytes()).hexdigest()
            if staged_hash != neutral_hash:
                raise ValueError(f"staged neutral carrier hash mismatch: {target}")
            neutralized.append(target)
            replacement_records.append(
                NeutralCarrierReplacement(
                    side=attestation.side,
                    generated_source=original,
                    neutral_source=neutral,
                    staged_source=target,
                    source_sha256=source_hash,
                    neutral_sha256=neutral_hash,
                    staged_sha256=staged_hash,
                    preserved_predicate_sha256=attestation.preserved_predicate_sha256,
                )
            )

        archived_proofs: list[Path] = []
        proof_root = (
            destination / "src" / "main" / "bridge" / "equiv_checker" / "proofs"
        )
        for index, source in enumerate(proof_sources, 1):
            source = Path(source).resolve()
            if not source.is_file():
                raise FileNotFoundError(source)
            target = proof_root / f"{index:04d}-{source.name}"
            target.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(source, target)
            archived_proofs.append(target)
        return ReplayProject(
            destination,
            tuple(copied_candidate),
            tuple(archived_proofs),
            tuple(neutralized),
            required,
            tuple(replacement_records),
        )
    except Exception:
        # The destination was created by this function and has never been
        # returned to the caller, so removing a failed partial stage is safe.
        shutil.rmtree(destination)
        raise
