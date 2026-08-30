"""Immutable, content-addressed evidence bundles for equivalence runs."""

from __future__ import annotations

from dataclasses import asdict, dataclass, is_dataclass
from enum import Enum
import hashlib
import json
from pathlib import Path, PurePosixPath
import shutil
from typing import Any, Iterable, Mapping


BUNDLE_SCHEMA = "1.0.0"


class EvidenceError(RuntimeError):
    """An evidence bundle could not be created without losing integrity."""


class InvalidOutputDirectoryError(EvidenceError):
    """The requested output path is unsafe or unsuitable for a new bundle."""


class OutputDirectoryNotEmptyError(InvalidOutputDirectoryError):
    """The requested output directory already contains data."""


@dataclass(frozen=True)
class EvidenceEntry:
    path: str
    kind: str
    size: int
    sha256: str
    pre_execution_sha256: str | None = None
    post_execution_sha256: str | None = None
    source: str | None = None


def sha256_file(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for block in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(block)
    return digest.hexdigest()


def _json_value(value: Any) -> Any:
    if isinstance(value, Enum):
        return value.value
    if isinstance(value, Path):
        return str(value)
    if is_dataclass(value):
        return {key: _json_value(item) for key, item in asdict(value).items()}
    if isinstance(value, Mapping):
        return {str(key): _json_value(item) for key, item in value.items()}
    if isinstance(value, (tuple, list, set, frozenset)):
        return [_json_value(item) for item in value]
    return value


def stable_json_bytes(value: Any) -> bytes:
    return (
        json.dumps(_json_value(value), indent=2, sort_keys=True, ensure_ascii=False)
        + "\n"
    ).encode("utf-8")


class EvidenceBundle:
    """A write-once result directory with a hash record for every artifact.

    Backends should use :meth:`archive_copy`, :meth:`write_text`, or
    :meth:`write_json` instead of writing into the directory directly.  A
    backend that must execute a tool in-place may use ``path_for`` followed by
    ``register_tree`` with a pre-execution snapshot.
    """

    def __init__(self, output_dir: Path):
        requested = output_dir.expanduser()
        if requested.is_symlink():
            raise InvalidOutputDirectoryError(
                f"output directory must not be a symlink: {requested}"
            )
        if requested.exists():
            if not requested.is_dir():
                raise InvalidOutputDirectoryError(
                    f"output path is not a directory: {requested}"
                )
            if any(requested.iterdir()):
                raise OutputDirectoryNotEmptyError(
                    f"refusing to overwrite nonempty result directory: {requested}"
                )
        else:
            requested.parent.mkdir(parents=True, exist_ok=True)
            requested.mkdir()
        self.root = requested.absolute()
        self._entries: dict[str, EvidenceEntry] = {}
        self._sealed = False
        for directory in (
            "inputs",
            "model",
            "inventories",
            "proofs",
            "generated",
            "logs",
            "commands",
            "hashes",
        ):
            (self.root / directory).mkdir()

    @property
    def entries(self) -> tuple[EvidenceEntry, ...]:
        return tuple(self._entries[key] for key in sorted(self._entries))

    def _relative(self, relative_path: str | Path) -> str:
        raw = str(relative_path).replace("\\", "/")
        relative = PurePosixPath(raw)
        if not raw or relative.is_absolute() or ".." in relative.parts:
            raise EvidenceError(f"artifact path must be bundle-relative: {relative_path}")
        normalized = relative.as_posix()
        if normalized in {".", "manifest.json"}:
            if normalized == "manifest.json":
                raise EvidenceError("manifest.json is reserved for bundle finalization")
            raise EvidenceError(f"artifact path must name a file: {relative_path}")
        return normalized

    def path_for(self, relative_path: str | Path, *, directory: bool = False) -> Path:
        """Return a checked bundle path without registering its content."""

        if self._sealed:
            raise EvidenceError("evidence bundle is already sealed")
        relative = self._relative(relative_path)
        target = self.root.joinpath(*PurePosixPath(relative).parts)
        target.parent.mkdir(parents=True, exist_ok=True)
        if directory:
            target.mkdir(parents=True, exist_ok=True)
        return target

    def _record(
        self,
        relative: str,
        *,
        kind: str,
        pre_execution_sha256: str | None = None,
        post_execution_sha256: str | None = None,
        source: str | None = None,
    ) -> EvidenceEntry:
        if relative in self._entries:
            raise EvidenceError(f"artifact is already registered: {relative}")
        target = self.root.joinpath(*PurePosixPath(relative).parts)
        if target.is_symlink() or not target.is_file():
            raise EvidenceError(f"artifact is not a regular file: {relative}")
        digest = sha256_file(target)
        entry = EvidenceEntry(
            path=relative,
            kind=kind,
            size=target.stat().st_size,
            sha256=digest,
            pre_execution_sha256=pre_execution_sha256 or digest,
            post_execution_sha256=post_execution_sha256 or digest,
            source=source,
        )
        self._entries[relative] = entry
        return entry

    def write_bytes(self, relative_path: str | Path, data: bytes, *, kind: str) -> str:
        relative = self._relative(relative_path)
        target = self.path_for(relative)
        try:
            with target.open("xb") as stream:
                stream.write(data)
        except FileExistsError as exc:
            raise EvidenceError(f"refusing to overwrite artifact: {relative}") from exc
        self._record(relative, kind=kind)
        return relative

    def write_text(self, relative_path: str | Path, text: str, *, kind: str) -> str:
        return self.write_bytes(relative_path, text.encode("utf-8"), kind=kind)

    def write_json(self, relative_path: str | Path, value: Any, *, kind: str) -> str:
        return self.write_bytes(relative_path, stable_json_bytes(value), kind=kind)

    def archive_copy(
        self, source: Path, relative_path: str | Path, *, kind: str
    ) -> str:
        source = source.expanduser().absolute()
        if not source.is_file():
            raise EvidenceError(f"evidence source is not a regular file: {source}")
        before = sha256_file(source)
        relative = self._relative(relative_path)
        target = self.path_for(relative)
        try:
            with source.open("rb") as input_stream, target.open("xb") as output_stream:
                shutil.copyfileobj(input_stream, output_stream, length=1024 * 1024)
        except FileExistsError as exc:
            raise EvidenceError(f"refusing to overwrite artifact: {relative}") from exc
        after = sha256_file(source)
        archived = sha256_file(target)
        if before != after or archived != before:
            target.unlink(missing_ok=True)
            raise EvidenceError(f"source changed while it was archived: {source}")
        self._record(
            relative,
            kind=kind,
            pre_execution_sha256=before,
            post_execution_sha256=after,
            source=str(source),
        )
        return relative

    def archive_tree(self, source: Path, relative_dir: str | Path, *, kind: str) -> tuple[str, ...]:
        source = source.expanduser().absolute()
        if not source.is_dir():
            raise EvidenceError(f"evidence tree source is not a directory: {source}")
        destination = self._relative(relative_dir)
        paths: list[str] = []
        for item in sorted(path for path in source.rglob("*") if path.is_file()):
            child = item.relative_to(source).as_posix()
            paths.append(self.archive_copy(item, f"{destination}/{child}", kind=kind))
        return tuple(paths)

    def snapshot_tree(self, relative_dir: str | Path) -> dict[str, str]:
        relative = self._relative(relative_dir)
        root = self.root.joinpath(*PurePosixPath(relative).parts)
        if not root.exists():
            return {}
        if not root.is_dir():
            raise EvidenceError(f"snapshot target is not a directory: {relative}")
        return {
            path.relative_to(self.root).as_posix(): sha256_file(path)
            for path in sorted(item for item in root.rglob("*") if item.is_file())
        }

    def register_tree(
        self,
        relative_dir: str | Path,
        *,
        kind: str,
        pre_execution: Mapping[str, str] | None = None,
    ) -> tuple[str, ...]:
        """Register files produced or checked by an in-place tool execution."""

        relative = self._relative(relative_dir)
        root = self.root.joinpath(*PurePosixPath(relative).parts)
        if not root.is_dir():
            raise EvidenceError(f"registered tree is not a directory: {relative}")
        before = dict(pre_execution or {})
        registered: list[str] = []
        for path in sorted(item for item in root.rglob("*") if item.is_file()):
            child = path.relative_to(self.root).as_posix()
            # A backend may register a completed unit subtree eagerly and then
            # register its enclosing execution tree in a ``finally`` block so
            # partial tool output is not hidden when a later unit fails.  Such
            # repeat registration is safe only while the already-recorded
            # bytes are unchanged.
            previous = self._entries.get(child)
            if previous is not None:
                if path.is_symlink() or sha256_file(path) != previous.sha256:
                    raise EvidenceError(
                        f"registered artifact changed before tree reconciliation: {child}"
                    )
                registered.append(child)
                continue
            self._record(
                child,
                kind=kind,
                pre_execution_sha256=before.get(child),
                post_execution_sha256=sha256_file(path),
            )
            registered.append(child)
        return tuple(registered)

    def contains(self, relative_path: str | Path) -> bool:
        try:
            relative = self._relative(relative_path)
        except EvidenceError:
            return False
        return relative in self._entries and (
            self.root.joinpath(*PurePosixPath(relative).parts).is_file()
        )

    def verify_links(self, relative_paths: Iterable[str]) -> None:
        missing = sorted({path for path in relative_paths if not self.contains(path)})
        if missing:
            raise EvidenceError(f"report references unarchived evidence: {missing}")

    def verify_integrity(self) -> None:
        """Verify that registered artifacts are unchanged and no files are hidden.

        ``manifest.json`` is excluded because it is created only after this
        check and deliberately describes, rather than hashes, the bundle.
        """

        actual = {
            path.relative_to(self.root).as_posix()
            for path in self.root.rglob("*")
            if path.is_file() or path.is_symlink()
        }
        expected = set(self._entries)
        unregistered = sorted(actual - expected)
        missing = sorted(expected - actual)
        if unregistered:
            raise EvidenceError(
                f"evidence bundle contains unregistered files: {unregistered}"
            )
        if missing:
            raise EvidenceError(f"registered evidence is missing: {missing}")
        changed = sorted(
            relative
            for relative, entry in self._entries.items()
            if (self.root / relative).is_symlink()
            or sha256_file(self.root / relative) != entry.sha256
        )
        if changed:
            raise EvidenceError(f"registered evidence changed after capture: {changed}")

    def write_hash_index(self) -> str:
        return self.write_json(
            "hashes/pre-post.json",
            {
                "schema_version": BUNDLE_SCHEMA,
                "files": [asdict(entry) for entry in self.entries],
            },
            kind="hash-index",
        )

    def seal(self, *, metadata: Mapping[str, Any] | None = None) -> Path:
        if self._sealed:
            raise EvidenceError("evidence bundle is already sealed")
        self.verify_integrity()
        manifest = {
            "schema_version": BUNDLE_SCHEMA,
            "files": [asdict(entry) for entry in self.entries],
            "metadata": dict(metadata or {}),
        }
        target = self.root / "manifest.json"
        try:
            with target.open("xb") as stream:
                stream.write(stable_json_bytes(manifest))
        except FileExistsError as exc:
            raise EvidenceError("refusing to overwrite manifest.json") from exc
        self._sealed = True
        return target
