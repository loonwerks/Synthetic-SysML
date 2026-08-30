#!/usr/bin/env python3
"""Build and validate the complete Sireum-authoritative SCP dataset corpus."""

from __future__ import annotations

import argparse
from concurrent.futures import ThreadPoolExecutor, as_completed
from dataclasses import dataclass
import json
import os
from pathlib import Path
import re
import shutil
import subprocess
import sys
import tempfile
from typing import Iterable, Sequence

from equiv_checker.model_gate import (
    ModelGateError,
    compare_model_fingerprints,
    fingerprint_models,
)
from publisher.publish import BuildError, build, clean_abstract_title, split_abstract
from sysml_tools.gumbo import resolve_sireum_toolchain


REPOSITORY_ROOT = Path(__file__).resolve().parents[2]
RUNS_ROOT = REPOSITORY_ROOT / "cps48" / "runs"
SNL_RENDERER = REPOSITORY_ROOT / "src" / "snl_parser" / "SnlRules.scala"
SYSML_LIBRARY = REPOSITORY_ROOT / "external" / "sysml-aadl-libraries"
EVALUATOR = REPOSITORY_ROOT / "scripts" / "evaluate.sh"
EXPECTED_CORPUS_SIZE = 48


class CorpusBuildError(RuntimeError):
    """The all-or-nothing corpus build failed an acceptance gate."""


@dataclass(frozen=True)
class CorpusSource:
    run_id: str
    run_dir: Path
    model: Path
    abstract: Path
    title: str
    directory_name: str = ""


@dataclass(frozen=True)
class BuiltInstance:
    source: CorpusSource
    root: Path
    manifest: dict[str, object]


def _load_object(path: Path) -> dict[str, object]:
    try:
        value = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError) as exc:
        raise CorpusBuildError(f"cannot read JSON object {path}: {exc}") from exc
    if not isinstance(value, dict):
        raise CorpusBuildError(f"expected JSON object in {path}")
    return value


def _one_model(run_dir: Path, status: dict[str, object] | None = None) -> Path:
    source = status.get("source") if status else None
    if isinstance(source, str):
        model = run_dir / source
        if model.is_file():
            return model
        raise CorpusBuildError(f"status source is missing: {model}")
    models = sorted((run_dir / "model").glob("*.sysml"))
    if len(models) != 1:
        raise CorpusBuildError(
            f"source run must contain exactly one SysML model: {run_dir}"
        )
    return models[0]


def _source(run_dir: Path) -> CorpusSource:
    status_path = run_dir / "status.json"
    status = _load_object(status_path) if status_path.is_file() else None
    abstract = run_dir / "system-abstract.md"
    if not abstract.is_file():
        raise CorpusBuildError(f"source run has no System Abstract: {run_dir}")
    raw_title, _ = split_abstract(abstract.read_text(encoding="utf-8"))
    return CorpusSource(
        run_id=run_dir.name,
        run_dir=run_dir,
        model=_one_model(run_dir, status),
        abstract=abstract,
        title=clean_abstract_title(raw_title),
    )


def _slug(value: str) -> str:
    result = re.sub(r"[^a-z0-9]+", "-", value.casefold()).strip("-")
    if not result:
        raise CorpusBuildError(f"title has no usable directory name: {value!r}")
    return result


def _difficulty(run_id: str) -> str:
    match = re.search(r"-(small|medium|hard)(?:-|$)", run_id)
    if not match:
        raise CorpusBuildError(
            f"colliding title has no small/medium/hard tier in run id: {run_id}"
        )
    return match.group(1)


def discover_sources() -> tuple[CorpusSource, ...]:
    """Return the 48 publication-ready CPS campaign sources."""

    ready: list[CorpusSource] = []
    for status_path in sorted(RUNS_ROOT.glob("*/status.json")):
        status = _load_object(status_path)
        if status.get("dataset_ready") is True:
            ready.append(_source(status_path.parent))
    if len(ready) != EXPECTED_CORPUS_SIZE:
        raise CorpusBuildError(
            f"expected {EXPECTED_CORPUS_SIZE} dataset-ready runs, found {len(ready)}"
        )
    sources = ready
    if len({source.model.resolve() for source in sources}) != EXPECTED_CORPUS_SIZE:
        raise CorpusBuildError("corpus source models are not unique")

    by_slug: dict[str, list[CorpusSource]] = {}
    for source in sources:
        by_slug.setdefault(_slug(source.title), []).append(source)
    named: list[CorpusSource] = []
    for base_slug, group in by_slug.items():
        if len(group) == 1:
            names = {group[0].run_id: base_slug}
        else:
            names = {
                source.run_id: f"{base_slug}-{_difficulty(source.run_id)}"
                for source in group
            }
            if len(set(names.values())) != len(group):
                raise CorpusBuildError(
                    f"title collision cannot be resolved by difficulty: {base_slug}"
                )
        named.extend(
            CorpusSource(**{**source.__dict__, "directory_name": names[source.run_id]})
            for source in group
        )
    named.sort(key=lambda source: source.directory_name)
    if len({source.directory_name for source in named}) != EXPECTED_CORPUS_SIZE:
        raise CorpusBuildError("semantic dataset directory names are not unique")
    return tuple(named)


def _render_snl(
    source: CorpusSource, work_root: Path, sireum: Path, timeout: int
) -> tuple[CorpusSource, Path, Path]:
    work = work_root / source.run_id
    work.mkdir()
    snl = work / "snl.md"
    inventory = work / "inventory.json"
    completed = subprocess.run(
        [
            str(sireum),
            "slang",
            "run",
            str(SNL_RENDERER),
            "--model",
            str(source.model),
            "--library",
            str(SYSML_LIBRARY),
            "--output",
            str(snl),
            "--inventory-output",
            str(inventory),
        ],
        cwd=REPOSITORY_ROOT,
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        timeout=timeout,
        check=False,
    )
    if completed.returncode != 0 or not snl.is_file() or not inventory.is_file():
        raise CorpusBuildError(
            f"SNL render failed for {source.run_id}:\n{completed.stdout.strip()}"
        )
    return source, snl, inventory




def _build_instance(
    source: CorpusSource,
    snl: Path,
    inventory: Path,
    output_root: Path,
    sireum_home: Path,
) -> BuiltInstance:
    try:
        visible_n, m_star, manifest = build(
            source.model,
            source.abstract,
            snl,
            inventory,
            sireum_home=sireum_home,
            verify_projection=False,
        )
    except (BuildError, OSError) as exc:
        raise CorpusBuildError(f"publisher failed for {source.run_id}: {exc}") from exc
    root = output_root / source.directory_name
    agent = root / "agent"
    evaluator = root / "evaluator"
    agent.mkdir(parents=True)
    evaluator.mkdir()
    (agent / "M-star.sysml").write_text(m_star, encoding="utf-8")
    (agent / "N.md").write_text(visible_n, encoding="utf-8")
    shutil.copyfile(source.model, evaluator / "oracle.sysml")
    return BuiltInstance(source, root, manifest)


def _chunks(values: Sequence[BuiltInstance], size: int) -> Iterable[Sequence[BuiltInstance]]:
    for index in range(0, len(values), size):
        yield values[index : index + size]


def _validate_resolved_air(
    instances: Sequence[BuiltInstance], sireum_home: Path, timeout: int
) -> None:
    for chunk in _chunks(instances, 8):
        paths: list[Path] = []
        for instance in chunk:
            paths.extend(
                (
                    instance.root / "evaluator" / "oracle.sysml",
                    instance.root / "agent" / "M-star.sysml",
                )
            )
        try:
            fingerprints = fingerprint_models(
                paths,
                sireum_home=sireum_home,
                library_dir=SYSML_LIBRARY,
                timeout=timeout,
            )
        except ModelGateError as exc:
            run_ids = ", ".join(item.source.run_id for item in chunk)
            raise CorpusBuildError(
                f"corpus resolved-AIR gate failed for [{run_ids}]: {exc}"
            ) from exc
        for index, instance in enumerate(chunk):
            comparison = compare_model_fingerprints(
                fingerprints[index * 2], fingerprints[index * 2 + 1]
            )
            if not comparison.matches:
                raise CorpusBuildError(
                    "oracle-minus-GUMBO and M-star resolved AIR differ for "
                    f"{instance.source.run_id}: {comparison.reason}"
                )


def _validate_layout(instances: Sequence[BuiltInstance]) -> None:
    expected = {
        Path("agent/M-star.sysml"),
        Path("agent/N.md"),
        Path("evaluator/oracle.sysml"),
    }
    for instance in instances:
        actual: set[Path] = set()
        for path in instance.root.rglob("*"):
            if path.is_symlink():
                raise CorpusBuildError(f"dataset contains symlink: {path}")
            if path.is_file():
                actual.add(path.relative_to(instance.root))
        if actual != expected:
            raise CorpusBuildError(
                f"invalid operational file set for {instance.source.run_id}: {actual}"
            )
        m_star = (instance.root / "agent" / "M-star.sysml").read_text(encoding="utf-8")
        forbidden_model = ('language "GUMBO"', "@gumbo-anchor", "@trace", "@generated-support")
        retained = [token for token in forbidden_model if token in m_star]
        if retained:
            raise CorpusBuildError(
                f"M-star retains forbidden material for {instance.source.run_id}: {retained}"
            )
        n_text = (instance.root / "agent" / "N.md").read_text(encoding="utf-8")
        expected_functions = len(instance.manifest["functions"])  # type: ignore[arg-type]
        expected_clauses = len(instance.manifest["requirements"])  # type: ignore[arg-type]
        if len(re.findall(r"^### `[^`]+`$", n_text, re.MULTILINE)) != expected_functions:
            raise CorpusBuildError(f"function accounting failed for {instance.source.run_id}")
        if len(re.findall(r"^#{4,5} `[^`]+` — ", n_text, re.MULTILINE)) != expected_clauses:
            raise CorpusBuildError(f"clause accounting failed for {instance.source.run_id}")


def _validate_agent_staging(instances: Sequence[BuiltInstance]) -> None:
    with tempfile.TemporaryDirectory(prefix="dataset-agent-sandbox-") as temporary:
        root = Path(temporary)
        (root / ".git").mkdir()
        for instance in instances:
            shutil.copytree(
                instance.root / "agent", root / instance.source.directory_name
            )
        if any(root.rglob("oracle.sysml")):
            raise CorpusBuildError("agent-only staging exposed an oracle")
        if len(tuple(root.rglob("M-star.sysml"))) != len(instances):
            raise CorpusBuildError("agent-only staging lost an M-star input")


def _validate_evaluator_smokes(
    instances: Sequence[BuiltInstance], dataset_root: Path
) -> None:
    if not EVALUATOR.is_file() or EVALUATOR.is_symlink() or not os.access(EVALUATOR, os.X_OK):
        raise CorpusBuildError(f"invalid shared evaluator: {EVALUATOR}")
    environment = os.environ.copy()
    environment["EQUIV_CHECKER_ROOT"] = str(REPOSITORY_ROOT)
    environment["DATASET_ROOT"] = str(dataset_root)
    for instance in instances:
        evaluator = instance.root / "evaluator"
        completed = subprocess.run(
            (
                str(EVALUATOR),
                instance.source.directory_name,
                str(evaluator / "oracle.sysml"),
            ),
            cwd=REPOSITORY_ROOT,
            env=environment,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            timeout=30,
            check=False,
        )
        if completed.returncode != 0 or "EQUIVALENT" not in completed.stdout:
            raise CorpusBuildError(
                f"evaluator smoke failed for {instance.source.run_id}: "
                f"{completed.stdout.strip()}"
            )


def _readme(instances: Sequence[BuiltInstance]) -> str:
    function_count = sum(len(item.manifest["functions"]) for item in instances)  # type: ignore[arg-type]
    clause_count = sum(len(item.manifest["requirements"]) for item in instances)  # type: ignore[arg-type]
    lines = [
        "# Sireum-authoritative SCP datasets",
        "",
        (
            f"This corpus contains {len(instances)} contract-reconstruction instances "
            "published from the canonical CPS campaign. Sireum-rendered "
            f"SNL publishes {function_count} function definitions and {clause_count} "
            "resolved formal clauses."
        ),
        "",
        "Each instance exposes only `agent/M-star.sysml` and `agent/N.md` to the agent.",
        "Each instance contains its evaluator-owned `evaluator/oracle.sysml`.",
        "The repository evaluator in `scripts/evaluate.sh` evaluates any instance by",
        "directory name. Run it as `scripts/evaluate.sh <semantic-name> CANDIDATE.sysml`.",
        "",
        "| Directory | Source run | Source model |",
        "|---|---|---|",
    ]
    for instance in instances:
        source = instance.source
        run_path = source.run_dir.relative_to(REPOSITORY_ROOT).as_posix()
        model_path = source.model.relative_to(REPOSITORY_ROOT).as_posix()
        lines.append(
            f"| `{source.directory_name}` | `{run_path}` | `{model_path}` |"
        )
    return "\n".join(lines) + "\n"


def build_corpus(
    output_dir: Path,
    *,
    sireum_home: Path | None = None,
    workers: int = 4,
    render_timeout: int = 900,
    validation_timeout: int = 900,
) -> tuple[BuiltInstance, ...]:
    """Build all payloads into a new directory and pass every acceptance gate."""

    output = output_dir.resolve()
    if output.exists():
        raise CorpusBuildError(f"output directory already exists: {output}")
    if workers < 1:
        raise CorpusBuildError("workers must be positive")
    toolchain = resolve_sireum_toolchain(sireum_home)
    sireum = toolchain.home / "bin" / ("sireum.bat" if os.name == "nt" else "sireum")
    if not sireum.is_file():
        raise CorpusBuildError(f"Sireum launcher is missing: {sireum}")
    sources = discover_sources()
    output.mkdir(parents=True)
    try:
        with tempfile.TemporaryDirectory(prefix="dataset-corpus-snl-") as temporary:
            work_root = Path(temporary)
            rendered: dict[str, tuple[Path, Path]] = {}
            with ThreadPoolExecutor(max_workers=workers) as executor:
                futures = {
                    executor.submit(
                        _render_snl, source, work_root, sireum, render_timeout
                    ): source
                    for source in sources
                }
                for future in as_completed(futures):
                    source, snl, inventory = future.result()
                    rendered[source.run_id] = (snl, inventory)

            instances = tuple(
                _build_instance(
                    source,
                    *rendered[source.run_id],
                    output,
                    toolchain.home,
                )
                for source in sources
            )
            _validate_layout(instances)
            _validate_resolved_air(instances, toolchain.home, validation_timeout)
            _validate_agent_staging(instances)
            _validate_evaluator_smokes(instances, output)
            (output / "README.md").write_text(_readme(instances), encoding="utf-8")
            return instances
    except Exception:
        shutil.rmtree(output, ignore_errors=True)
        raise


def parse_args(argv: Iterable[str] | None = None) -> argparse.Namespace:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--output-dir", type=Path, required=True)
    parser.add_argument("--sireum-home", type=Path)
    parser.add_argument("--workers", type=int, default=4)
    parser.add_argument("--render-timeout", type=int, default=900)
    parser.add_argument("--validation-timeout", type=int, default=900)
    return parser.parse_args(argv)


def main(argv: Iterable[str] | None = None) -> int:
    args = parse_args(argv)
    try:
        instances = build_corpus(
            args.output_dir,
            sireum_home=args.sireum_home,
            workers=args.workers,
            render_timeout=args.render_timeout,
            validation_timeout=args.validation_timeout,
        )
    except (CorpusBuildError, BuildError, ModelGateError, OSError, ValueError) as exc:
        print(f"error: {exc}", file=sys.stderr)
        return 2
    functions = sum(len(item.manifest["functions"]) for item in instances)  # type: ignore[arg-type]
    clauses = sum(len(item.manifest["requirements"]) for item in instances)  # type: ignore[arg-type]
    print(f"built {len(instances)} datasets with {functions} functions and {clauses} clauses")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
