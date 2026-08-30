#!/usr/bin/env python3
"""Plan, execute, and summarize immutable synthetic-synthesis campaign batches."""

from __future__ import annotations

import argparse
import csv
import io
import json
import subprocess
import sys
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from dataclasses import dataclass
from datetime import datetime, timezone
from pathlib import Path
from typing import Any

try:
    from synthesizer import run
except ModuleNotFoundError:  # pragma: no cover
    import run  # type: ignore[no-redef]


class CampaignError(RuntimeError):
    pass


@dataclass(frozen=True)
class Cell:
    batch_id: str
    family_id: str
    complexity: str
    replicate: int
    attempt: int
    port: int
    seed_source: Path | None
    seed: Path | None = None
    seed_sha256: str | None = None
    diversity_card: Path | None = None

    @property
    def cell_id(self) -> str:
        return f"{self.family_id}-{self.complexity}-r{self.replicate}"

    @property
    def label(self) -> str:
        return f"{self.cell_id}-a{self.attempt}"


def read_manifest(path: Path) -> dict[str, Any]:
    try:
        value = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError) as exc:
        raise CampaignError(f"invalid manifest {path}: {exc}") from exc
    if not isinstance(value, dict) or value.get("schema_version") != 1:
        raise CampaignError("campaign manifest must be a schema_version 1 object")
    return value


def expand_batch(
    manifest: dict[str, Any],
    manifest_path: Path,
    batch_id: str,
    attempt_override: int | None = None,
) -> list[Cell]:
    families = manifest.get("families")
    batches = manifest.get("batches")
    if not isinstance(families, dict) or not isinstance(batches, list):
        raise CampaignError("manifest families/batches have invalid shapes")
    batch = next(
        (item for item in batches if isinstance(item, dict) and item.get("batch_id") == batch_id),
        None,
    )
    if batch is None:
        raise CampaignError(f"unknown batch {batch_id!r}")
    family_id = str(batch.get("family_id", ""))
    family = families.get(family_id)
    if not isinstance(family, dict):
        raise CampaignError(f"batch {batch_id} references unknown family {family_id!r}")
    source_value = family.get("seed_source")
    source = (
        (manifest_path.parent / str(source_value)).resolve()
        if source_value
        else None
    )
    if source is not None and not source.is_file():
        raise CampaignError(f"seed source does not exist: {source}")
    seed_value = family.get("seed")
    seed = (
        (manifest_path.parent / str(seed_value)).resolve()
        if seed_value
        else None
    )
    expected_seed_hash = family.get("seed_sha256")
    if seed is not None:
        if not seed.is_file():
            raise CampaignError(f"frozen family seed does not exist: {seed}")
        if not isinstance(expected_seed_hash, str) or not expected_seed_hash:
            raise CampaignError(f"family {family_id!r} must pin seed_sha256")
        actual = run.sha256_file(seed)
        if actual != expected_seed_hash:
            raise CampaignError(
                f"family {family_id!r} seed hash mismatch: expected {expected_seed_hash}, got {actual}"
            )
    diversity_cards = family.get("diversity_cards", {})
    if not isinstance(diversity_cards, dict):
        raise CampaignError(f"family {family_id!r} diversity_cards must be an object")
    complexities = batch.get("complexities", list(run.COMPLEXITY_PROFILES))
    replicates = batch.get("replicates", [1, 2])
    if not isinstance(complexities, list) or not isinstance(replicates, list):
        raise CampaignError("batch complexities and replicates must be arrays")
    unknown = [name for name in complexities if name not in run.COMPLEXITY_PROFILES]
    if unknown:
        raise CampaignError(f"unknown complexities: {unknown}")
    base_port = int(batch.get("base_port", 4782))
    cells: list[Cell] = []
    for index, (replicate, complexity) in enumerate(
        (replicate, complexity)
        for replicate in replicates
        for complexity in complexities
    ):
        card_value = diversity_cards.get(str(replicate))
        card = (manifest_path.parent / str(card_value)).resolve() if card_value else None
        if card is not None and not card.is_file():
            raise CampaignError(f"diversity card does not exist: {card}")
        cells.append(
            Cell(
                batch_id=batch_id,
                family_id=family_id,
                complexity=str(complexity),
                replicate=int(replicate),
                attempt=attempt_override or int(batch.get("attempt", 1)),
                port=base_port + (index % int(manifest.get("max_workers", 3))),
                seed_source=source,
                seed=seed,
                seed_sha256=str(expected_seed_hash) if expected_seed_hash else None,
                diversity_card=card,
            )
        )
    return cells


def run_command(
    workspace: Path, manifest: dict[str, Any], cell: Cell, timeout: int | None
) -> tuple[Cell, dict[str, Any]]:
    campaign_id = str(manifest["campaign_id"])
    watchdogs = manifest.get("stage_watchdogs", {})
    effective_timeout = timeout if timeout is not None else int(
        watchdogs.get(cell.complexity, 0) if isinstance(watchdogs, dict) else 0
    )
    if cell.seed is None:
        raise CampaignError(
            f"family {cell.family_id!r} has no reviewed frozen seed; generate and pin it before executing cells"
        )
    if cell.seed_sha256 != run.sha256_file(cell.seed):
        raise CampaignError(f"frozen seed changed before launch: {cell.seed}")
    command = [
        sys.executable,
        str(workspace / "src" / "synthesizer" / "run.py"),
        "--seed",
        str(cell.seed),
        "--label",
        cell.label,
        "--campaign-id",
        campaign_id,
        "--family-id",
        cell.family_id,
        "--complexity",
        cell.complexity,
        "--replicate",
        str(cell.replicate),
        "--attempt",
        str(cell.attempt),
        "--sysml-viz-port",
        str(cell.port),
        "--model",
        str(manifest.get("model", "gpt-5.6-sol")),
        "--reasoning-effort",
        str(manifest.get("reasoning_effort", "high")),
        "--timeout",
        str(effective_timeout),
    ]
    if cell.diversity_card is not None:
        command.extend(["--diversity-card", str(cell.diversity_card)])
    started = time.monotonic()
    stdout_parts: list[str] = []
    stderr_parts: list[str] = []
    run_dir: Path | None = None
    status: dict[str, Any] = {}
    seen_checkpoints: set[tuple[str, str, str, str]] = set()
    completed: subprocess.CompletedProcess[str]
    while True:
        completed = subprocess.run(
            command,
            cwd=workspace,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            check=False,
        )
        stdout_parts.append(completed.stdout)
        stderr_parts.append(completed.stderr)
        if run_dir is None:
            for line in reversed(completed.stdout.splitlines()):
                candidate = Path(line.strip())
                if candidate.is_dir() and candidate.parent.name == "runs":
                    run_dir = candidate.resolve()
                    break
        if run_dir is None or not (run_dir / "status.json").is_file():
            break
        status = run.read_json(run_dir / "status.json")
        if status.get("status") not in run.RESUMABLE_STATUSES:
            break
        checkpoint = (
            str(status.get("status")),
            str(status.get("checkpoint_stage")),
            str(status.get("reason")),
            str(status.get("repair_progress_fingerprint", "")),
        )
        if checkpoint in seen_checkpoints:
            break
        seen_checkpoints.add(checkpoint)
        command = [
            sys.executable,
            str(workspace / "src" / "synthesizer" / "run.py"),
            "--resume-run",
            str(run_dir),
            "--model",
            str(manifest.get("model", "gpt-5.6-sol")),
            "--reasoning-effort",
            str(manifest.get("reasoning_effort", "high")),
            "--timeout",
            str(effective_timeout),
        ]
    elapsed = round(time.monotonic() - started, 3)
    return cell, {
        "cell_id": cell.cell_id,
        "attempt": cell.attempt,
        "run_dir": run.relative_path(run_dir, workspace) if run_dir else None,
        "returncode": completed.returncode,
        "status": status.get("status", "launch-failed"),
        "semantic_status": status.get("semantic_status", "not-run"),
        "visualization_status": status.get("visualization_status", "not-run"),
        "dataset_ready": bool(status.get("dataset_ready", False)),
        "reason": status.get("reason", completed.stderr.strip()),
        "batch_elapsed_seconds": elapsed,
        "stdout": "\n".join(stdout_parts),
        "stderr": "\n".join(stderr_parts),
    }


def summarize_results(
    manifest: dict[str, Any],
    batch_id: str,
    results: list[dict[str, Any]],
    expected_cell_ids: set[str],
) -> tuple[dict[str, Any], str, str]:
    rows: list[dict[str, Any]] = []
    for result in sorted(results, key=lambda item: item["cell_id"]):
        run_dir = Path(result["run_dir"]) if result.get("run_dir") else None
        config = run.read_json(run_dir / "run-config.json") if run_dir else {}
        usage_path = run_dir / "agent-token-usage.json" if run_dir else None
        usage = run.read_json(usage_path) if usage_path and usage_path.is_file() else {}
        aggregate = usage.get("aggregate", {}).get("token_matrix", {}).get("totals", {})
        retained_timing = usage.get("timing", {})
        if isinstance(retained_timing, dict) and isinstance(
            retained_timing.get("summed_agent_stage_seconds"), (int, float)
        ):
            agent_duration = float(retained_timing["summed_agent_stage_seconds"])
        else:
            agent_duration = 0.0
        if not agent_duration and run_dir and (run_dir / "journal.jsonl").is_file():
            for line in (run_dir / "journal.jsonl").read_text(encoding="utf-8").splitlines():
                try:
                    event = json.loads(line)
                except json.JSONDecodeError:
                    continue
                agent_duration += float(event.get("duration_seconds", 0.0))
        complexity_path = run_dir / "evaluation" / "complexity-validation.json" if run_dir else None
        if complexity_path and complexity_path.is_file():
            complexity = run.read_json(complexity_path).get("observed", {})
        elif run_dir and (run_dir / "metrics.json").is_file():
            fallback = run.read_json(run_dir / "metrics.json").get(
                "campaign_complexity", {}
            )
            complexity = {
                key: fallback[key]
                for key in (
                    "semantic_usages",
                    "semantic_interactions",
                    "nontrivial_contract_cases",
                    "scenario_families",
                )
                if isinstance(fallback, dict) and key in fallback
            }
        else:
            complexity = {}
        rows.append(
            {
                "cell_id": result["cell_id"],
                "complexity": config.get("complexity"),
                "replicate": config.get("replicate"),
                "attempt": result["attempt"],
                "status": result["status"],
                "semantic_status": result.get("semantic_status", "not-run"),
                "visualization_status": result.get("visualization_status", "not-run"),
                "dataset_ready": bool(result.get("dataset_ready", False)),
                "run_dir": result.get("run_dir"),
                "total_tokens": aggregate.get("overall", 0),
                "input_tokens": aggregate.get("input", 0),
                "output_tokens": aggregate.get("output", 0),
                "agent_seconds": round(agent_duration, 3),
                "batch_elapsed_seconds": result["batch_elapsed_seconds"],
                **complexity,
            }
        )
    accepted_cells = {
        str(row["cell_id"]) for row in rows if row["status"] == "accepted"
    }
    semantic_cells = {
        str(row["cell_id"])
        for row in rows
        if row.get("semantic_status") == "passed"
    }
    report = {
        "schema_version": 1,
        "campaign_id": manifest["campaign_id"],
        "batch_id": batch_id,
        "recorded_at": datetime.now(timezone.utc).strftime("%Y-%m-%dT%H:%M:%SZ"),
        "attempted": len(rows),
        "accepted": len(accepted_cells),
        "semantic_accepted": len(semantic_cells),
        "expected_cells": len(expected_cell_ids),
        "complete": expected_cell_ids <= accepted_cells,
        "aggregate_tokens": sum(int(row["total_tokens"]) for row in rows),
        "aggregate_agent_seconds": round(sum(float(row["agent_seconds"]) for row in rows), 3),
        "rows": rows,
    }
    buffer = io.StringIO()
    fieldnames = list(dict.fromkeys(key for row in rows for key in row)) or [
        "cell_id", "status"
    ]
    writer = csv.DictWriter(buffer, fieldnames=fieldnames)
    writer.writeheader()
    writer.writerows(rows)
    markdown = [
        f"# {batch_id} review summary",
        "",
        f"Accepted cells: **{len(accepted_cells)}/{len(expected_cell_ids)}**",
        f"Semantically accepted cells: **{len(semantic_cells)}/{len(expected_cell_ids)}**",
        "",
        "## Attempts",
        "",
        "| Cell | Attempt | Status | Usages | Interactions | Contract cases | Scenarios | Tokens | Agent time (s) | Run |",
        "|---|---:|---:|---:|---:|---:|---:|---:|---:|---|",
    ]
    for row in rows:
        run_link = (
            f"[run]({Path(str(row['run_dir'])).as_posix()})"
            if row.get("run_dir")
            else "not-created"
        )
        markdown.append(
            f"| {row['cell_id']} | {row['attempt']} | {row['status']} | "
            f"{row.get('semantic_usages', '')} | "
            f"{row.get('semantic_interactions', '')} | "
            f"{row.get('nontrivial_contract_cases', '')} | "
            f"{row.get('scenario_families', '')} | {row['total_tokens']} | "
            f"{row['agent_seconds']} | {run_link} |"
        )
    accepted_rows: dict[str, dict[str, Any]] = {}
    for row in rows:
        if row["status"] == "accepted":
            accepted_rows[str(row["cell_id"])] = row
    markdown.extend(["", "## Accepted artifacts", ""])
    for cell_id in sorted(accepted_rows):
        row = accepted_rows[cell_id]
        run_dir = Path(str(row["run_dir"]))
        links = []
        artifacts = [
            ("seed", run_dir / "seed.md"),
            ("system abstract", run_dir / "system-abstract.md"),
            ("verification", run_dir / "verification-report.json"),
            ("visualization", run_dir / "visualization" / "system-overview.svg"),
        ]
        model_sources = sorted((run_dir / "model").glob("*.sysml"))
        if model_sources:
            artifacts.insert(1, ("model", model_sources[0]))
        for label, artifact in artifacts:
            if artifact.is_file():
                links.append(f"[{label}]({artifact.as_posix()})")
        markdown.append(f"- **{cell_id}**: " + ", ".join(links))
    return report, buffer.getvalue(), "\n".join(markdown) + "\n"


def execute_batch(
    manifest_path: Path,
    batch_id: str,
    output: Path,
    execute: bool,
    timeout: int | None,
    attempt: int | None,
    only: set[str],
) -> int:
    manifest = read_manifest(manifest_path)
    base_cells = expand_batch(manifest, manifest_path, batch_id)
    expected_cell_ids = {cell.cell_id for cell in base_cells}
    cells = expand_batch(manifest, manifest_path, batch_id, attempt)
    if only:
        unknown = only - expected_cell_ids
        if unknown:
            raise CampaignError(f"--only contains unknown cells: {sorted(unknown)}")
        cells = [cell for cell in cells if cell.cell_id in only]
    plan = {
        "campaign_id": manifest["campaign_id"],
        "batch_id": batch_id,
        "cells": [
            {
                "cell_id": cell.cell_id,
                "complexity": cell.complexity,
                "replicate": cell.replicate,
                "attempt": cell.attempt,
                "port": cell.port,
                "seed_source": (
                    run.relative_path(cell.seed_source, manifest_path.parent.parent)
                    if cell.seed_source else None
                ),
                "seed": (
                    run.relative_path(cell.seed, manifest_path.parent.parent)
                    if cell.seed else None
                ),
                "seed_sha256": cell.seed_sha256,
                "diversity_card": (
                    run.relative_path(cell.diversity_card, manifest_path.parent.parent)
                    if cell.diversity_card else None
                ),
            }
            for cell in cells
        ],
    }
    output.mkdir(parents=True, exist_ok=True)
    run.write_json(output / "batch-plan.json", plan)
    if not execute:
        print(json.dumps(plan, indent=2))
        return 0
    workspace = Path(__file__).resolve().parents[2]
    state_path = output / "batch-state.json"
    if state_path.is_file():
        prior = run.read_json(state_path).get("results", [])
        results = list(prior) if isinstance(prior, list) else []
    else:
        results = []
    max_workers = min(int(manifest.get("max_workers", 3)), len(cells))
    with ThreadPoolExecutor(max_workers=max_workers) as pool:
        futures = [pool.submit(run_command, workspace, manifest, cell, timeout) for cell in cells]
        for future in as_completed(futures):
            cell, result = future.result()
            (output / f"{cell.label}.stdout.txt").write_text(result.pop("stdout"), encoding="utf-8")
            (output / f"{cell.label}.stderr.txt").write_text(result.pop("stderr"), encoding="utf-8")
            results.append(result)
            run.write_json(output / "batch-state.json", {"results": results})
    report, csv_text, markdown = summarize_results(
        manifest, batch_id, results, expected_cell_ids
    )
    run.write_json(output / "batch-summary.json", report)
    (output / "batch-summary.csv").write_text(csv_text, encoding="utf-8")
    (output / "REVIEW.md").write_text(markdown, encoding="utf-8")
    print(output)
    return 0 if report["complete"] else 1


def parse_args(argv: list[str] | None = None) -> argparse.Namespace:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--manifest", required=True)
    parser.add_argument("--batch", required=True)
    parser.add_argument("--output", required=True)
    parser.add_argument("--execute", action="store_true")
    parser.add_argument(
        "--timeout",
        type=int,
        help="Optional per-agent operational watchdog; 0 or omission disables it",
    )
    parser.add_argument("--attempt", type=int)
    parser.add_argument(
        "--only", help="Comma-separated campaign cell IDs; defaults to the whole batch"
    )
    return parser.parse_args(argv)


def main(argv: list[str] | None = None) -> int:
    args = parse_args(argv)
    try:
        return execute_batch(
            Path(args.manifest).resolve(),
            args.batch,
            Path(args.output).resolve(),
            args.execute,
            args.timeout,
            args.attempt,
            {item for item in (args.only or "").split(",") if item},
        )
    except CampaignError as exc:
        print(f"campaign error: {exc}", file=sys.stderr)
        return 2


if __name__ == "__main__":
    raise SystemExit(main())
