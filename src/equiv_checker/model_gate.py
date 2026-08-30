"""Resolved, contract-erased SysML model fingerprints.

The public fingerprinting path is deliberately fail-closed.  Sireum's SysML
parser certifies the exact GUMBO spans, and ``GumboInventory.scala`` invokes
``FrontEnd.typeCheck`` to produce resolved AIR.  Python's job is limited to a
documented projection of that AIR: source positions and GUMBO annex values are
removed, object keys are sorted, and otherwise every resolved model value is
retained.

``canonicalize_source_for_tests`` is a small lexical helper for unit tests.  It
is not used by :func:`fingerprint_model` and never claims resolved authority.
"""

from __future__ import annotations

from dataclasses import dataclass
import hashlib
import json
from pathlib import Path
import re
import tempfile
from typing import Any, Iterable, Mapping, Sequence

from sysml_tools.gumbo import (
    ParserSpan,
    erase_gumbo_spans,
    parser_spans,
    resolve_sireum_toolchain,
)
from equiv_checker.schema import ModelFingerprint


MODEL_FINGERPRINT_POLICY = "sireum-resolved-air-contract-erased-v1"


class ModelGateError(RuntimeError):
    """Fingerprint evidence could not be established."""


class ModelGateInvalidInput(ModelGateError):
    """The parser or semantic front end rejected the stripped model."""


class ModelGateTimeout(ModelGateError):
    """Resolved fingerprint construction exceeded its configured bound."""


@dataclass(frozen=True)
class FingerprintComparison:
    matches: bool
    oracle_sha256: str
    candidate_sha256: str
    oracle_canonical_ast: str
    candidate_canonical_ast: str
    reason: str | None = None


def _sha256_bytes(value: bytes) -> str:
    return hashlib.sha256(value).hexdigest()


def _input_sha256(root: Path, files: Sequence[Path], *, single_file: bool) -> str:
    """Hash exact input bytes, or a stable byte manifest for a multi-file input."""

    if single_file:
        return _sha256_bytes(files[0].read_bytes())
    manifest = [
        {
            "path": str(path.relative_to(root)),
            "size": path.stat().st_size,
            "sha256": _sha256_bytes(path.read_bytes()),
        }
        for path in files
    ]
    payload = (
        json.dumps(manifest, sort_keys=True, separators=(",", ":"), ensure_ascii=False)
        + "\n"
    ).encode("utf-8")
    return _sha256_bytes(payload)


_LEXICAL_TOKEN = re.compile(
    r"(?:<'(?:[^'\\]|\\.)*'>|'(?:[^'\\]|\\.)*'|\"(?:[^\"\\]|\\.)*\"|"
    r"[A-Za-z_][A-Za-z0-9_]*|[0-9]+(?:\.[0-9]+)?|::|:>>|:>|->|[{}()\[\];,:.=<>+*/-])"
)


def _without_comments(source: str) -> str:
    result: list[str] = []
    index = 0
    state = "code"
    while index < len(source):
        pair = source[index : index + 2]
        char = source[index]
        if state == "code":
            if pair == "//":
                state = "line"
                index += 2
                continue
            if pair == "/*":
                state = "block"
                index += 2
                continue
            result.append(char)
            if char == '"':
                state = "string"
        elif state == "line":
            if char in "\r\n":
                result.append(char)
                state = "code"
        elif state == "block":
            if pair == "*/":
                state = "code"
                index += 2
                continue
            if char in "\r\n":
                result.append(char)
        else:
            result.append(char)
            if char == "\\" and index + 1 < len(source):
                index += 1
                result.append(source[index])
            elif char == '"':
                state = "code"
        index += 1
    if state in {"block", "string"}:
        raise ValueError(f"unterminated {state} in SysML source")
    return "".join(result)


def canonicalize_source_for_tests(source: str, spans: Iterable[ParserSpan]) -> str:
    """Return a bounded lexical projection for pure tests only.

    The result is useful for testing span erasure and comment/formatting
    insensitivity.  It is intentionally not accepted by ``fingerprint_model``
    because tokens are not a substitute for resolved SysML structure.
    """

    erased = erase_gumbo_spans(source, spans)
    comment_free = _without_comments(erased)
    return " ".join(_LEXICAL_TOKEN.findall(comment_free))


_POSITION_KEYS = {
    "pos",
    "posOpt",
    "position",
    "sourcePos",
    "sourcePosition",
}
_SOURCE_IDENTITY_KEYS = {"uriFrag"}


def _is_gumbo_annex(value: Any) -> bool:
    if not isinstance(value, Mapping):
        return False
    if str(value.get("name", "")).upper() == "GUMBO":
        return True
    clause = value.get("clause")
    return isinstance(clause, Mapping) and str(clause.get("type", "")).startswith("Gcl")


def _canonical_air(value: Any, *, parent_key: str | None = None) -> Any:
    if isinstance(value, Mapping):
        result: dict[str, Any] = {}
        for key in sorted(str(item) for item in value.keys()):
            if key in _POSITION_KEYS or key in _SOURCE_IDENTITY_KEYS:
                continue
            item = value[key]
            if key == "annexes" and isinstance(item, Sequence):
                item = [annex for annex in item if not _is_gumbo_annex(annex)]
            if key == "annexLib" and isinstance(item, Sequence):
                item = [annex for annex in item if not _is_gumbo_annex(annex)]
            result[key] = _canonical_air(item, parent_key=key)
        return result
    if isinstance(value, (list, tuple)):
        items = [_canonical_air(item, parent_key=parent_key) for item in value]
        # FrontEnd may enumerate independent roots/maps in implementation order.
        # AIR child arrays (ports, parts, connections) retain declaration order.
        if parent_key in {"resolved_models"}:
            return sorted(items, key=lambda item: json.dumps(item, sort_keys=True, separators=(",", ":")))
        return items
    return value


def canonicalize_resolved_models(resolved_models: Sequence[Mapping[str, Any]]) -> bytes:
    """Project resolved AIR into the position/comment/contract-insensitive AST."""

    projected = _canonical_air({"resolved_models": list(resolved_models)})
    return (json.dumps(projected, sort_keys=True, separators=(",", ":"), ensure_ascii=False) + "\n").encode("utf-8")


def _model_files(path: Path) -> tuple[Path, tuple[Path, ...]]:
    resolved = path.expanduser().resolve()
    if resolved.is_file() and resolved.suffix == ".sysml":
        return resolved.parent, (resolved,)
    if resolved.is_dir():
        files = tuple(sorted(item.resolve() for item in resolved.rglob("*.sysml")))
        if files:
            return resolved, files
    raise ModelGateError(f"model input contains no .sysml files: {path}")


def fingerprint_model(
    path: Path | str,
    *,
    sireum_home: Path | str | None = None,
    library_dir: Path | str | None = None,
    output_path: Path | str | None = None,
    timeout: int = 180,
) -> ModelFingerprint:
    """Create a resolved model fingerprint or fail without a semantic verdict."""

    return fingerprint_models(
        (path,),
        sireum_home=sireum_home,
        library_dir=library_dir,
        output_paths=(output_path,),
        timeout=timeout,
    )[0]


def _fingerprint_inventory(
    *,
    input_digest: str,
    inventory: Any,
    output_path: Path | str | None,
) -> ModelFingerprint:
    if not inventory.resolved_models:
        raise ModelGateError("Sireum inventory returned no resolved model AST")
    canonical = canonicalize_resolved_models(inventory.resolved_models)
    semantic_digest = _sha256_bytes(canonical)
    envelope = {
        "schema_version": "1.0.0",
        "policy": MODEL_FINGERPRINT_POLICY,
        "semantic_projection_sha256": semantic_digest,
        "parser": f"{inventory.semantic_authority}; Sireum {inventory.sireum_version}",
        "canonical_ast": json.loads(canonical),
    }
    artifact_bytes = (
        json.dumps(envelope, indent=2, sort_keys=True, ensure_ascii=False) + "\n"
    ).encode("utf-8")
    artifact_digest = _sha256_bytes(artifact_bytes)
    artifact = "<memory>"
    if output_path is not None:
        destination = Path(output_path)
        destination.parent.mkdir(parents=True, exist_ok=True)
        destination.write_bytes(artifact_bytes)
        artifact = str(destination.resolve())
    return ModelFingerprint(
        sha256=input_digest,
        canonical_ast_path=artifact,
        canonical_ast_sha256=artifact_digest,
        parser=(
            f"{inventory.semantic_authority}; Sireum {inventory.sireum_version}; "
            f"{MODEL_FINGERPRINT_POLICY}"
        ),
    )


def fingerprint_models(
    paths: Sequence[Path | str],
    *,
    sireum_home: Path | str | None = None,
    library_dir: Path | str | None = None,
    output_paths: Sequence[Path | str | None] | None = None,
    timeout: int = 180,
) -> tuple[ModelFingerprint, ...]:
    """Fingerprint contract-erased models with one batched Sireum invocation."""

    if not paths:
        raise ModelGateError("model fingerprint batch is empty")
    if output_paths is None:
        output_paths = tuple(None for _ in paths)
    if len(output_paths) != len(paths):
        raise ModelGateError("fingerprint output count does not match model count")

    try:
        toolchain = resolve_sireum_toolchain(Path(sireum_home) if sireum_home else None)
    except (OSError, ValueError) as error:
        raise ModelGateError(f"could not resolve Sireum toolchain: {error}") from error

    prepared: list[tuple[str, bool, list[tuple[Path, str]]]] = []
    for raw_path in paths:
        model_path = Path(raw_path)
        root, files = _model_files(model_path)
        single_file = model_path.expanduser().resolve().is_file()
        try:
            input_digest = _input_sha256(root, files, single_file=single_file)
            erased_sources: list[tuple[Path, str]] = []
            for source_path in files:
                source = source_path.read_text(encoding="utf-8")
                try:
                    spans = tuple(parser_spans(source_path, toolchain))
                except ValueError as error:
                    raise ModelGateInvalidInput(str(error)) from error
                erased_sources.append(
                    (source_path.relative_to(root), erase_gumbo_spans(source, spans))
                )
        except OSError as error:
            raise ModelGateError(str(error)) from error
        prepared.append((input_digest, single_file, erased_sources))

    from equiv_checker.inventory import (
        InventoryError,
        InventoryInvalidInput,
        InventoryTimeout,
        run_inventories,
    )

    with tempfile.TemporaryDirectory(prefix="equiv-model-gate-batch-") as temporary:
        staging = Path(temporary)
        staged_inputs: list[Path] = []
        for index, (_, single_file, erased_sources) in enumerate(prepared):
            staged_root = staging / f"model-{index}"
            for relative, erased in erased_sources:
                staged = staged_root / relative
                staged.parent.mkdir(parents=True, exist_ok=True)
                staged.write_text(erased, encoding="utf-8")
            staged_inputs.append(
                staged_root / erased_sources[0][0] if single_file else staged_root
            )
        try:
            inventories = run_inventories(
                staged_inputs,
                sireum_home=toolchain.home,
                library_dir=Path(library_dir) if library_dir else None,
                timeout=timeout,
            )
        except InventoryError as error:
            if isinstance(error, InventoryInvalidInput):
                raise ModelGateInvalidInput(str(error)) from error
            if isinstance(error, InventoryTimeout):
                raise ModelGateTimeout(str(error)) from error
            raise ModelGateError(str(error)) from error

    return tuple(
        _fingerprint_inventory(
            input_digest=item[0],
            inventory=inventory,
            output_path=output_path,
        )
        for item, inventory, output_path in zip(
            prepared, inventories, output_paths, strict=True
        )
    )


def compare_model_fingerprints(
    oracle: ModelFingerprint, candidate: ModelFingerprint
) -> FingerprintComparison:
    if oracle.parser != candidate.parser:
        raise ModelGateError(
            "fingerprints were produced by different semantic authorities; "
            "no model mismatch verdict is available"
        )
    matches = oracle.canonical_ast_sha256 == candidate.canonical_ast_sha256
    return FingerprintComparison(
        matches=matches,
        oracle_sha256=oracle.sha256,
        candidate_sha256=candidate.sha256,
        oracle_canonical_ast=oracle.canonical_ast_path,
        candidate_canonical_ast=candidate.canonical_ast_path,
        reason=None if matches else "contract-erased resolved SysML AST fingerprints differ",
    )
