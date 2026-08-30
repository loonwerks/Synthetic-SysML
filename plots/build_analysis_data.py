#!/usr/bin/env python3
"""Build the joined 48-instance campaign table used by all repository plots."""

from __future__ import annotations

import json
import re
from collections import Counter
from pathlib import Path


HERE = Path(__file__).resolve().parent
ROOT = HERE.parent
DATASETS = ROOT / "datasets"
SCP = ROOT / "experiments" / "scp-terra-high"
SCP_RUNS = SCP / "runs"
SCP_SUMMARY = SCP / "summary"
SCP_TOKENS = HERE / "scp-terra-high" / "token-usage-recovered.json"
POOLSIDE = ROOT / "experiments" / "poolside-synthetic"
POOLSIDE_RUNS = POOLSIDE / "runs"
POOLSIDE_SUMMARY = POOLSIDE / "summary"
POOLSIDE_METADATA = HERE / "poolside-synthetic" / "restored_run_metadata.json"
POOLSIDE_EQUIVALENCE = POOLSIDE_SUMMARY / "equivalence-results.json"
OUTPUT = HERE / "analysis-data.json"


def read_json(path: Path) -> dict:
    return json.loads(path.read_text(encoding="utf-8"))


def text_stats(path: Path) -> dict[str, int]:
    text = path.read_text(encoding="utf-8")
    return {
        "lines": len(text.splitlines()),
        "nonblank_lines": sum(bool(line.strip()) for line in text.splitlines()),
        "words": len(re.findall(r"\b\w+\b", text)),
        "characters": len(text),
    }


def dataset_source_map() -> dict[str, tuple[Path, Path]]:
    markdown = (DATASETS / "README.md").read_text(encoding="utf-8")
    quoted = r"`([^`]+)`"
    rows = re.findall(
        rf"^\| {quoted} \| {quoted} \| {quoted} \|", markdown, flags=re.MULTILINE
    )
    if len(rows) != 48:
        raise RuntimeError(f"expected 48 dataset source rows, found {len(rows)}")
    return {dataset_id: (ROOT / run_path, ROOT / model_path)
            for dataset_id, run_path, model_path in rows}


def generation_usage(path: Path) -> dict:
    usage = read_json(path)
    aggregate = usage["aggregate"]
    matrix = aggregate["token_matrix"]
    timing = usage.get("timing") or {}
    stages = timing.get("stages", timing.get("completed_stages", []))
    agents = {}
    for agent in usage["agents"]:
        role_matrix = agent["token_matrix"]
        role_stages = [stage for stage in stages if stage.get("role") == agent["role"]]
        agents[agent["role"]] = {
            "input_tokens": role_matrix["totals"]["input"],
            "cached_input_tokens": role_matrix["cached"]["input"],
            "output_tokens": role_matrix["totals"]["output"],
            "reasoning_output_tokens": agent["reasoning_output_tokens"],
            "wall_seconds": agent.get(
                "wall_clock_seconds",
                sum(stage.get("duration_seconds", 0) for stage in role_stages) or None,
            ),
            "stage_count": len(agent.get("stages", role_stages)),
        }
    base_stages = [stage["stage"].split("@", 1)[0] for stage in stages]
    elapsed = timing.get("run_elapsed_seconds", timing.get("wall_clock_seconds"))
    agent_seconds = timing.get(
        "summed_agent_stage_seconds",
        sum(stage.get("duration_seconds", 0) for stage in stages) or None,
    )
    return {
        "input_tokens": matrix["totals"]["input"],
        "cached_input_tokens": matrix["cached"]["input"],
        "noncached_input_tokens": matrix["non_cached"]["input"],
        "output_tokens": matrix["totals"]["output"],
        "reasoning_output_tokens": aggregate["reasoning_output_tokens"],
        "overall_tokens": matrix["totals"]["overall"],
        "cache_fraction": matrix["cached"]["input"] / matrix["totals"]["input"],
        "elapsed_seconds": elapsed,
        "agent_seconds": agent_seconds,
        "harness_gap_seconds": (
            elapsed - agent_seconds if elapsed is not None and agent_seconds is not None else None
        ),
        "stage_count": len(stages),
        "repeat_stage_count": len(base_stages) - len(set(base_stages)),
        "agents": agents,
    }


def published_metrics(dataset_id: str) -> dict:
    base = DATASETS / dataset_id
    n_path = base / "agent" / "N.md"
    mstar_path = base / "agent" / "M-star.sysml"
    oracle_path = base / "evaluator" / "oracle.sysml"
    n_text = n_path.read_text(encoding="utf-8")
    mstar = text_stats(mstar_path)
    oracle = text_stats(oracle_path)
    mstar_text = mstar_path.read_text(encoding="utf-8")
    oracle_text = oracle_path.read_text(encoding="utf-8")
    context_counts = Counter(re.findall(
        r"^(NEED|PURPOSE|GOAL|CTX|MON|CTRL|RISK|HAZARD|MODE|ASM)-\d+:",
        n_text,
        flags=re.MULTILINE,
    ))
    return {
        "mstar": mstar,
        "natural_language": text_stats(n_path),
        "oracle": oracle,
        "erased_nonblank_lines": oracle["nonblank_lines"] - mstar["nonblank_lines"],
        "formal_clauses": len(re.findall(
            r"^#{4,6} `[^`]+` —", n_text, flags=re.MULTILINE
        )),
        # A topology-oriented model-complexity proxy: every declared port plus
        # every declared connection in the contract-erased model M*. Unlike
        # line count, this measures explicit interface and wiring structure.
        "architectural_interfaces": (
            len(re.findall(r"^\s*port\s+[A-Za-z_]\w*", mstar_text, flags=re.MULTILINE))
            + len(re.findall(
                r"^\s*connection(?:\s+def)?\s+[A-Za-z_]\w*",
                mstar_text,
                flags=re.MULTILINE,
            ))
        ),
        # Count actual GUMBO guarantee declarations in the formal oracle. A
        # guarantee may carry its name on the following line, so matching only
        # named single-line declarations would undercount the corpus.
        "gumbo_contract_clauses": len(re.findall(
            r"^\s*guarantee(?:\s|$)", oracle_text, flags=re.MULTILINE
        )),
        "requirement_owners": len(re.findall(
            r"^### Requirements for ", n_text, flags=re.MULTILINE
        )),
        "states": len(re.findall(r"^### State `", n_text, flags=re.MULTILINE)),
        "functions": len(re.findall(
            r"^### `[^`]+::[^`]+::[^`]+`$", n_text, flags=re.MULTILINE
        )),
        "context_statements": sum(context_counts.values()),
        "context_by_kind": dict(sorted(context_counts.items())),
    }


def generation_record(dataset_id: str, run_dir: Path, model_path: Path) -> dict:
    metrics = read_json(run_dir / "metrics.json")
    config_path = run_dir / "run-config.json"
    config = read_json(config_path) if config_path.is_file() else {}
    complexity = metrics.get("campaign_complexity", {})
    if not complexity:
        raise RuntimeError(f"missing CPS-48 campaign complexity for {dataset_id}")
    family, difficulty, replicate = (
        config["family_id"], config["complexity"], config["replicate"]
    )
    return {
        "dataset_id": dataset_id,
        "source_run": str(run_dir.relative_to(ROOT)),
        "source_model": str(model_path.relative_to(ROOT)),
        "source_kind": "cps-48",
        "family": family,
        "difficulty": difficulty,
        "replicate": replicate,
        "attempt": config.get("attempt"),
        "complexity": {
            "semantic_usages": complexity.get("semantic_usages"),
            "semantic_interactions": complexity.get("semantic_interactions"),
            "nontrivial_contract_cases": complexity.get("nontrivial_contract_cases"),
            "scenario_families": complexity.get("scenario_families"),
        },
        "generation": generation_usage(run_dir / "agent-token-usage.json"),
        "published": published_metrics(dataset_id),
    }


def proof_metrics(run_dir: Path) -> dict:
    verification = read_json(run_dir / "result" / "verification.json")
    proofs = verification.get("proofs", [])
    outcomes = Counter(proof.get("outcome", "UNKNOWN") for proof in proofs)
    categories = Counter(proof.get("category", "unknown") for proof in proofs)
    seconds = [proof.get("verification_seconds", 0) or 0 for proof in proofs]
    return {
        "proof_count": len(proofs),
        "atomic_proof_count": categories["atomic"],
        "health_proof_count": categories["health"],
        "verified_count": outcomes["VERIFIED"],
        "rejected_count": outcomes["REJECTED"],
        "sat_count": outcomes["SAT"],
        "unsat_count": outcomes["UNSAT"],
        "timeout_count": outcomes["TIMEOUT"],
        "error_count": sum(value for key, value in outcomes.items()
                           if key not in {"VERIFIED", "REJECTED", "SAT", "UNSAT", "TIMEOUT"}),
        "verification_seconds": sum(seconds),
        "max_proof_seconds": max(seconds, default=0),
    }


def checker_metrics(run_dir: Path) -> dict:
    events = read_json(run_dir / "result" / "timings.json").get("events", [])
    by_stage = Counter()
    backend_total = None
    for event in events:
        stage = event.get("stage", "unknown")
        if stage == "backend-total":
            backend_total = event.get("elapsed_seconds", 0) or 0
            continue
        if stage in {"logika-resident-request", "logika-resident-retry"}:
            group = "proof requests"
        elif "startup" in stage:
            group = "proof startup"
        elif "inventory" in stage:
            group = "inventory"
        elif "model-gate" in stage:
            group = "model gate"
        elif "semantic-export" in stage:
            group = "semantic export"
        else:
            group = "other"
        by_stage[group] += event.get("elapsed_seconds", 0) or 0
    return {
        "event_count": len(events),
        "elapsed_seconds_sum": sum(by_stage.values()),
        "backend_total_seconds": backend_total,
        "seconds_by_stage": dict(sorted(by_stage.items())),
    }


def candidate_metrics(run_dir: Path, baseline: dict) -> dict:
    candidate = text_stats(run_dir / "candidate" / "M-star.sysml")
    return {
        **candidate,
        "added_nonblank_lines": candidate["nonblank_lines"] - baseline["nonblank_lines"],
    }


def scp_records(generation: list[dict]) -> list[dict]:
    generation_by_id = {row["dataset_id"]: row for row in generation}
    ledger = read_json(SCP_SUMMARY / "retry-ledger.json")
    token_snapshot = read_json(SCP_TOKENS)["runs"]
    records = []
    for trial in ledger["trials"]:
        dataset_id = trial["dataset_id"]
        if dataset_id not in generation_by_id:
            continue
        run_dir = SCP_RUNS / dataset_id
        acceptance = read_json(run_dir / "evaluation" / "acceptance.json")
        result = read_json(run_dir / "result" / "result.json")
        gate_passes = {
            gate: data.get("exit_code") == 0
            for gate, data in acceptance.get("gates", {}).items()
        }
        unit_classes = Counter(
            unit.get("classification", "UNKNOWN")
            for unit in result.get("unit_results", [])
        )
        diagnostics = result.get("diagnostics", [])
        tokens = token_snapshot[dataset_id]
        # Comparable provider total. Cached input is a subset of input and
        # reasoning output is a subset of output, so neither is added again.
        tokens["total_tokens"] = tokens["input_tokens"] + tokens["output_tokens"]
        records.append({
            "dataset_id": dataset_id,
            "status": trial["status"],
            "timed_out": trial["status"] == "timeout",
            "active_seconds": trial["active_seconds"],
            "attempt_count": len(trial["attempts"]),
            "acceptance_passed": acceptance.get("status") == "passed",
            "gate_passes": gate_passes,
            "comparison_verdict": result.get("comparison_verdict"),
            "unit_count": len(result.get("unit_results", [])),
            "affected_unit_count": len(result.get("affected_units", [])),
            "unit_classifications": dict(sorted(unit_classes.items())),
            "checker_timeout": any(
                vc.get("status") == "TIMEOUT"
                for unit in result.get("unit_results", [])
                for vc in unit.get("atomic_vcs", [])
            ),
            "logika_bug": any(str(d).startswith("proof tool failure:") for d in diagnostics),
            "diagnostic_count": len(diagnostics),
            "tokens": tokens,
            "candidate": candidate_metrics(run_dir, generation_by_id[dataset_id]["published"]["mstar"]),
            "proofs": proof_metrics(run_dir),
            "checker": checker_metrics(run_dir),
        })
    if len(records) != 48:
        raise RuntimeError(f"expected 48 campaign SCP records, found {len(records)}")
    return records


def poolside_records(generation: list[dict]) -> list[dict]:
    """Normalize Poolside's campaign metadata onto the Terra resource schema."""
    campaign_ids = {row["dataset_id"] for row in generation}
    metadata = read_json(POOLSIDE_METADATA)
    run_by_id = {row["dataset"]: row for row in metadata["runs"]}
    trajectory_by_id = {row["trajectory_id"]: row for row in metadata["trajectories"]}
    equivalence = read_json(POOLSIDE_EQUIVALENCE)
    equivalence_by_id = {row["dataset_id"]: row for row in equivalence["results"]}
    if not campaign_ids <= run_by_id.keys() or not campaign_ids <= equivalence_by_id.keys():
        raise RuntimeError("Poolside metadata/equivalence results do not cover the 48 campaign IDs")

    records = []
    for dataset_id in sorted(campaign_ids):
        run = run_by_id[dataset_id]
        result = read_json(POOLSIDE_RUNS / dataset_id / "result" / "result.json")
        trajectories = [trajectory_by_id[value] for value in run["trajectory_ids"]]
        if len(trajectories) != run["trajectory_count"]:
            raise RuntimeError(f"Poolside trajectory count mismatch for {dataset_id}")
        if sum(row["input_tokens"] for row in trajectories) != run["input_tokens"]:
            raise RuntimeError(f"Poolside input-token aggregation mismatch for {dataset_id}")
        if sum(row["output_tokens"] for row in trajectories) != run["output_tokens"]:
            raise RuntimeError(f"Poolside output-token aggregation mismatch for {dataset_id}")
        if equivalence_by_id[dataset_id]["equivalent"] != (
            result.get("comparison_verdict") == "EQUIVALENT"
        ):
            raise RuntimeError(f"Poolside equivalence summary mismatch for {dataset_id}")
        cached = sum(row.get("cache_read_input_tokens", 0) or 0 for row in trajectories)
        cache_write = sum(row.get("cache_write_input_tokens", 0) or 0 for row in trajectories)
        if cache_write:
            raise RuntimeError(f"unexpected nonzero Poolside cache-write usage for {dataset_id}")
        tokens = {
            "input_tokens": run["input_tokens"],
            "cached_input_tokens": cached,
            "output_tokens": run["output_tokens"],
            "total_tokens": run["input_tokens"] + run["output_tokens"],
        }
        records.append({
            "dataset_id": dataset_id,
            "status": run["result"],
            "timed_out": not run["success"],
            "active_seconds": run["active_seconds"],
            "active_seconds_precision": run["active_seconds_precision"],
            "gate_qualified": run["success"],
            "two_hour_gate_qualified": run["two_hour_success"],
            "comparison_verdict": result.get("comparison_verdict"),
            "equivalence_check_seconds": equivalence_by_id[dataset_id]["duration_seconds"],
            "trajectory_count": run["trajectory_count"],
            "inference_calls": run["inference_calls"],
            "tokens": tokens,
        })
    if len(records) != 48:
        raise RuntimeError(f"expected 48 Poolside records, found {len(records)}")
    return records


def main() -> None:
    sources = dataset_source_map()
    generation = [generation_record(dataset_id, *sources[dataset_id])
                  for dataset_id in sorted(sources)]
    if len(generation) != 48:
        raise RuntimeError("expected exactly 48 canonical campaign datasets")
    scp = scp_records(generation)
    poolside = poolside_records(generation)
    ids = {row["dataset_id"] for row in generation}
    if ids != {row["dataset_id"] for row in scp} or ids != {row["dataset_id"] for row in poolside}:
        raise RuntimeError("generation, Terra, and Poolside campaign IDs do not match exactly")
    payload = {
        "schema_version": 3,
        "record_count": 48,
        "provenance": {
            "dataset_mapping": "datasets/README.md",
            "generation_runs": "source_run and source_model fields in each generation record",
            "scp_ledger": "experiments/scp-terra-high/summary/retry-ledger.json",
            "scp_results": "experiments/scp-terra-high/runs/<dataset>/result and evaluation/acceptance.json",
            "scp_tokens": "plots/scp-terra-high/token-usage-recovered.json",
            "poolside_runs": "plots/poolside-synthetic/restored_run_metadata.json",
            "poolside_results": "experiments/poolside-synthetic/runs/<dataset>/result/result.json",
            "poolside_equivalence": "experiments/poolside-synthetic/summary/equivalence-results.json",
        },
        "generation": generation,
        "scp": scp,
        "poolside": poolside,
    }
    OUTPUT.write_text(json.dumps(payload, indent=2, sort_keys=True) + "\n", encoding="utf-8")
    print(f"wrote {OUTPUT} ({len(generation)} generation + {len(scp)} Terra + "
          f"{len(poolside)} Poolside records)")


if __name__ == "__main__":
    main()
