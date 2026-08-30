"""Write the small, user-facing result directory from a checked staging bundle."""

from __future__ import annotations

import hashlib
import json
import os
from pathlib import Path
from pathlib import PurePosixPath
import re
import shlex
import shutil
from typing import Any, Mapping, Sequence

from .evidence import stable_json_bytes


COMPACT_RESULT_SCHEMA = "2.0.0"


def _relative_path(path: Path, base: Path) -> str:
    return Path(os.path.relpath(path.resolve(), base.resolve())).as_posix()


def _portable_value(value: Any, *, repository: Path, staging: Path) -> Any:
    """Remove checkout and temporary-workspace paths from retained results."""
    if isinstance(value, Mapping):
        return {
            key: _portable_value(item, repository=repository, staging=staging)
            for key, item in value.items()
        }
    if isinstance(value, list):
        return [
            _portable_value(item, repository=repository, staging=staging)
            for item in value
        ]
    if not isinstance(value, str):
        return value
    text = value.replace(str(staging.resolve()), "<temporary-workspace>")
    text = text.replace(str(repository.resolve()), ".")
    if text.startswith("file://"):
        text = text.removeprefix("file://")
    text = re.sub(
        r"(?<![A-Za-z0-9:])/(?:home|Users)/[^\s\"'<>]+",
        "<external-path>",
        text,
    )
    text = re.sub(
        r"[A-Za-z]:\\Users\\[^\s\"'<>]+",
        "<external-path>",
        text,
    )
    if Path(text).is_absolute():
        text = _relative_path(Path(text), repository)
    return text


def _retained_argv(argv: Sequence[str], base: Path) -> list[str]:
    """Describe the replayable retained invocation without original locations."""
    replacements = {
        "--oracle": "inputs/oracle.sysml",
        "--candidate": "inputs/candidate.sysml",
        "--output-dir": "<new-output-directory>",
    }
    result: list[str] = []
    replace_next: str | None = None
    for item in argv:
        if replace_next is not None:
            result.append(replace_next)
            replace_next = None
        else:
            result.append(
                _relative_path(Path(item), base) if Path(item).is_absolute() else item
            )
            replace_next = replacements.get(item)
    return result


def _write_json(path: Path, value: object) -> None:
    path.write_bytes(stable_json_bytes(value))


def _sha256_file(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def _proof_path(value: str) -> str:
    parts = PurePosixPath(value).parts
    if (
        len(parts) >= 4
        and parts[0] == "generated"
        and parts[1].startswith("root-")
        and parts[2] == "proof-project"
    ):
        return str(PurePosixPath("proofs", parts[1], *parts[3:]))
    return value


def _verification_id(relative: str) -> str:
    path = PurePosixPath(relative)
    if path.parts[:2] == ("logs", "units"):
        return ":".join(path.parts[2:]).removesuffix(".json")
    return path.as_posix().removesuffix(".json").replace("/", ":")


def _rewrite_links(value: Any) -> Any:
    if isinstance(value, Mapping):
        rewritten: dict[str, Any] = {}
        for key, item in value.items():
            if key == "manifest":
                continue
            if key == "comparison_plan":
                rewritten["comparison_breakdown"] = "comparison-breakdown.json"
                continue
            if key in {"validity_evidence", "witness_evidence"}:
                rewritten[key] = (
                    _verification_id(item) if isinstance(item, str) else item
                )
                continue
            if key in {
                "oracle_health_evidence",
                "candidate_health_evidence",
                "evidence_paths",
            } and isinstance(item, list):
                rewritten[key] = [
                    _verification_id(path) if isinstance(path, str) else path
                    for path in item
                ]
                continue
            rewritten[key] = _rewrite_links(item)
        return rewritten
    if isinstance(value, list):
        return [_rewrite_links(item) for item in value]
    return value


def _compact_breakdown(plan: Mapping[str, Any]) -> dict[str, Any]:
    result = _rewrite_links(plan)
    result["schema_version"] = COMPACT_RESULT_SCHEMA
    result.pop("neutralization_evidence", None)
    result.pop("oracle_fingerprint", None)
    result.pop("candidate_fingerprint", None)
    result.pop("oracle_input", None)
    result.pop("candidate_input", None)
    for unit in result.get("units", []):
        if not isinstance(unit, dict):
            continue
        for side in ("oracle", "candidate"):
            binding = unit.get(side)
            if isinstance(binding, dict) and isinstance(binding.get("generated_source"), str):
                binding["generated_source"] = _proof_path(binding["generated_source"])
    return result


def _compact_run(relative: str, raw: Mapping[str, Any]) -> dict[str, Any]:
    request = raw.get("request")
    request_id = (
        request[1]
        if isinstance(request, list) and len(request) > 1 and isinstance(request[1], str)
        else None
    )
    return {
        "id": _verification_id(relative),
        "unit": (
            PurePosixPath(relative).parts[3]
            if len(PurePosixPath(relative).parts) > 3
            else None
        ),
        "check": PurePosixPath(relative).stem,
        "category": (
            PurePosixPath(relative).parts[-2]
            if len(PurePosixPath(relative).parts) > 1
            else None
        ),
        "request_id": request_id,
        "engine": raw.get("engine"),
        "mode": raw.get("mode"),
        "outcome": raw.get("outcome"),
        "exit_code": raw.get("exit_code"),
        "source": _proof_path(str(raw.get("source", ""))),
        "source_sha256": raw.get("source_sha256"),
        "verification_seconds": raw.get("verification_seconds"),
        "wall_seconds": raw.get("wall_seconds"),
    }


def _compact_export(raw: Mapping[str, Any]) -> dict[str, Any]:
    export = raw.get("export") if isinstance(raw.get("export"), Mapping) else {}
    roots: list[dict[str, Any]] = []
    for item in raw.get("roots", []):
        if not isinstance(item, Mapping):
            continue
        manifest = item.get("manifest") if isinstance(item.get("manifest"), Mapping) else {}
        resources = manifest.get("resources") if isinstance(manifest.get("resources"), list) else []
        roots.append(
            {
                "root": item.get("root"),
                "package_name": item.get("package_name"),
                "elapsed_seconds": manifest.get("elapsed_seconds"),
                "resource_count": len(resources),
                "rejected_resource_counts": manifest.get("rejected_resource_counts", {}),
            }
        )
    return {
        "side": raw.get("label"),
        "status": export.get("status"),
        "exit_code": export.get("exit_code"),
        "roots": roots,
    }


def _compact_verification(staging: Path) -> tuple[dict[str, Any], list[str]]:
    exports: list[dict[str, Any]] = []
    proofs: list[dict[str, Any]] = []
    errors: list[str] = []
    logs = staging / "logs"
    for side in ("oracle", "candidate"):
        path = logs / f"semantic-export-{side}.json"
        if path.is_file():
            raw = json.loads(path.read_text(encoding="utf-8"))
            exports.append(_compact_export(raw))
    units = logs / "units"
    if units.is_dir():
        for path in sorted(units.rglob("*.json")):
            relative = path.relative_to(staging).as_posix()
            raw = json.loads(path.read_text(encoding="utf-8"))
            proofs.append(_compact_run(relative, raw))
            if raw.get("outcome") in {"TIMEOUT", "TOOL_ERROR", "UNKNOWN"}:
                output = raw.get("output")
                if isinstance(output, str) and output.strip():
                    errors.append(f"[{_verification_id(relative)}]\n{output.strip()}")
    for path in sorted(logs.glob("*.txt")) if logs.is_dir() else ():
        content = path.read_text(encoding="utf-8", errors="replace").strip()
        if content:
            errors.append(f"[{path.name}]\n{content}")
    return {
        "schema_version": COMPACT_RESULT_SCHEMA,
        "semantic_exports": exports,
        "proofs": proofs,
    }, errors


def _copy_proofs(staging: Path, destination: Path) -> None:
    generated = staging / "generated"
    if not generated.is_dir():
        return
    for source_project in sorted(generated.glob("root-*/proof-project")):
        target = destination / "proofs" / source_project.parent.name
        source_tree = source_project / "src"
        if source_tree.is_dir():
            shutil.copytree(source_tree, target / "src")
        for relative in ("bin/project.cmd", "versions.properties"):
            source = source_project / relative
            if source.is_file():
                output = target / relative
                output.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(source, output)


def _verify_copied_proofs(destination: Path, verification: Mapping[str, Any]) -> None:
    for record in verification.get("proofs", []):
        if not isinstance(record, Mapping):
            continue
        relative = record.get("source")
        expected = record.get("source_sha256")
        if not isinstance(relative, str) or not relative:
            raise RuntimeError("verification record is missing its proof source path")
        source = destination / relative
        if not source.is_file():
            raise RuntimeError(f"retained proof source is missing: {relative}")
        if isinstance(expected, str) and _sha256_file(source) != expected:
            raise RuntimeError(f"retained proof source hash changed: {relative}")


def _compact_timings(raw: Mapping[str, Any]) -> dict[str, Any]:
    events: list[dict[str, Any]] = []
    for event in raw.get("events", []):
        if not isinstance(event, Mapping):
            continue
        detail = event.get("detail") if isinstance(event.get("detail"), Mapping) else {}
        kept = {
            key: (_proof_path(value) if key == "source" and isinstance(value, str) else value)
            for key, value in detail.items()
            if key not in {"command", "project"}
        }
        events.append(
            {
                "stage": event.get("stage"),
                "elapsed_seconds": event.get("elapsed_seconds"),
                "detail": kept,
            }
        )
    return {
        "schema_version": COMPACT_RESULT_SCHEMA,
        "overall_elapsed_seconds": raw.get("overall_elapsed_seconds"),
        "stage_totals_seconds": raw.get("stage_totals_seconds", {}),
        "events": events,
    }


def _write_replay(
    destination: Path,
    *,
    timeout: float,
    defer_health: bool,
) -> None:
    content = (
        "#!/usr/bin/env sh\n"
        "set -eu\n"
        'RESULT_DIR=$(CDPATH= cd "$(dirname "$0")" && pwd)\n'
        'if [ -n "${EQUIV_CHECKER_ROOT:-}" ]; then\n'
        '  CHECKER_ROOT=$EQUIV_CHECKER_ROOT\n'
        'else\n'
        '  SEARCH_DIR=$RESULT_DIR\n'
        '  CHECKER_ROOT=\n'
        '  while [ "$SEARCH_DIR" != "/" ]; do\n'
        '    if [ -d "$SEARCH_DIR/.git" ] && [ -d "$SEARCH_DIR/src/equiv_checker" ]; then\n'
        '      CHECKER_ROOT=$SEARCH_DIR\n'
        '      break\n'
        '    fi\n'
        '    SEARCH_DIR=$(dirname "$SEARCH_DIR")\n'
        '  done\n'
        'fi\n'
        'if [ -z "$CHECKER_ROOT" ]; then\n'
        '  echo "could not locate the repository; set EQUIV_CHECKER_ROOT" >&2\n'
        '  exit 2\n'
        'fi\n'
        'OUTPUT_DIR=${1:-"${RESULT_DIR}.replay"}\n'
        'cd "$CHECKER_ROOT"\n'
        "exec env PYTHONPATH=src python3 -m equiv_checker compare \\\n"
        '  --oracle "$RESULT_DIR/inputs/oracle.sysml" \\\n'
        '  --candidate "$RESULT_DIR/inputs/candidate.sysml" \\\n'
        '  --output-dir "$OUTPUT_DIR" \\\n'
        f"  --timeout {timeout}"
        + (" --defer-health" if defer_health else "")
        + "\n"
    )
    path = destination / "replay.sh"
    path.write_text(content, encoding="utf-8")
    path.chmod(0o755)


def write_compact_output(
    *,
    staging: Path,
    destination: Path,
    oracle: Path,
    candidate: Path,
    invocation: Sequence[str],
    cwd: Path,
    timeout: float,
    checker_root: Path,
) -> None:
    report = json.loads((staging / "report.json").read_text(encoding="utf-8"))
    plan_path = staging / "comparison-plan.json"
    plan = json.loads(plan_path.read_text(encoding="utf-8")) if plan_path.is_file() else {
        "schema_version": COMPACT_RESULT_SCHEMA,
        "coverage_complete": False,
        "coverage_gaps": list(report.get("diagnostics", [])),
        "roots": [],
        "types": [],
        "units": [],
    }
    timings = json.loads((staging / "timings.json").read_text(encoding="utf-8"))
    verification, errors = _compact_verification(staging)

    compact_report = _portable_value(
        _rewrite_links(report), repository=checker_root, staging=staging
    )
    compact_report["schema_version"] = COMPACT_RESULT_SCHEMA
    compact_report["inputs"] = {
        "oracle": "inputs/oracle.sysml",
        "candidate": "inputs/candidate.sysml",
    }
    compact_report["command"] = {
        "argv": _retained_argv(invocation, checker_root),
        "cwd": ".",
    }
    compact_report["timings"] = "timings.json"
    compact_report["verification"] = "verification.json"

    _write_json(destination / "result.json", compact_report)
    _write_json(
        destination / "comparison-breakdown.json",
        _portable_value(
            _compact_breakdown(plan), repository=checker_root, staging=staging
        ),
    )
    _write_json(
        destination / "timings.json",
        _portable_value(
            _compact_timings(timings), repository=checker_root, staging=staging
        ),
    )
    _write_json(
        destination / "verification.json",
        _portable_value(verification, repository=checker_root, staging=staging),
    )
    shutil.copytree(staging / "inputs", destination / "inputs")
    _copy_proofs(staging, destination)
    _verify_copied_proofs(destination, verification)
    _write_replay(
        destination,
        timeout=timeout,
        defer_health="--defer-health" in invocation,
    )
    if errors:
        portable_errors = [
            _portable_value(error, repository=checker_root, staging=staging)
            for error in errors
        ]
        (destination / "errors.log").write_text(
            "\n\n".join(portable_errors) + "\n", encoding="utf-8"
        )


__all__ = ["COMPACT_RESULT_SCHEMA", "write_compact_output"]
