#!/usr/bin/env python3
"""Minimal sequential harness for one LLM-first SysML generation run.

The harness deliberately owns orchestration and mechanical evidence only.
Designer, Model, and Visualization roles retain
semantic judgment and write their role-owned artifacts into a unique run
directory. Reusable Seed generation is a separate family-preparation job, not a
stage in a synthesis run. Operational interruptions checkpoint a run; they do
not reject its candidate model.
"""

from __future__ import annotations

import argparse
import fnmatch
import hashlib
import json
import os
import re
import shutil
import subprocess
import sys
import time
from dataclasses import dataclass
from datetime import datetime, timezone
from pathlib import Path
from string import Template
from typing import Any, Iterable


RESUMABLE_STATUSES = {"in-progress", "incomplete", "awaiting-visualization"}

COMPLEXITY_PROFILES: dict[str, dict[str, Any]] = {
    "small": {
        "semantic_usages": (5, 8),
        "semantic_interactions": (7, 14),
        "nontrivial_contract_cases": (6, 12),
        "scenario_families": (4, 6),
        "requirements": (
            "one principal decision owner",
            "nominal, boundary, invalid/fault, and recovery behavior",
        ),
    },
    "medium": {
        "semantic_usages": (8, 12),
        "semantic_interactions": (15, 21),
        "nontrivial_contract_cases": (12, 20),
        "scenario_families": (6, 9),
        "requirements": (
            "at least two cooperating decision or qualification owners",
            "at least one explicit priority conflict",
        ),
    },
    "hard": {
        "semantic_usages": (13, 16),
        "semantic_interactions": (22, 35),
        "nontrivial_contract_cases": (21, 30),
        "scenario_families": (9, 12),
        "requirements": (
            "multiple state or decision owners",
            "priority, fault propagation, recovery, and composition obligations",
        ),
    },
}


ACCEPTED_RETENTION_PROFILE = "accepted-run-minimal-v1"

ACCEPTED_RETENTION_FILES = frozenset(
    {
        "agent-token-usage.json",
        "design-selection.md",
        "metrics.json",
        "model/.sysmlviz/views.json",
        "provenance.json",
        "run-config.json",
        "seed.md",
        "status.json",
        "system-abstract.md",
        "validation/bounded-analysis.mjs",
        "validation/contract-coverage.json",
        "verification-report.json",
        "visualization/system-overview.svg",
        "visualization/system-overview.svg.json",
    }
)


def complexity_spec(name: str) -> str:
    profile = COMPLEXITY_PROFILES[name]
    lines = [f"Declared campaign complexity: {name}."]
    for key in (
        "semantic_usages",
        "semantic_interactions",
        "nontrivial_contract_cases",
        "scenario_families",
    ):
        low, high = profile[key]
        lines.append(f"- {key.replace('_', ' ')}: {low}..{high} inclusive")
    lines.extend(f"- required: {item}" for item in profile["requirements"])
    return "\n".join(lines)


class HarnessError(RuntimeError):
    """A diagnosed run failure."""


class GateRejected(HarnessError):
    """A candidate artifact failed a named acceptance gate."""

    def __init__(self, status: str, message: str):
        super().__init__(message)
        self.status = status


class OperationalCheckpoint(HarnessError):
    """A resumable operational stop that is not a candidate-quality verdict."""

    def __init__(self, stage: str, message: str, usage: dict[str, int] | None = None):
        super().__init__(message)
        self.stage = stage
        self.usage = usage


def write_repair_request(
    run_dir: Path,
    *,
    target_stage: str,
    source_stage: str,
    diagnostic: str,
    actions: Iterable[Any] = (),
) -> None:
    """Publish the single current repair handoff consumed by the owning role."""
    context_files = {
        "model-generate": [
            "evaluation/repair-request.json",
            "system-abstract.md",
            "design-selection.md",
            "decisions/model-generation.json",
            "model/*.sysml",
            "validation/**",
            "metrics.json",
            "traceability.json",
        ],
        "visualize": [
            "evaluation/repair-request.json",
            "system-abstract.md",
            "decisions/model-generation.json",
            "model/*.sysml",
            "model/.sysmlviz/views.json",
            "visualization/**",
            "decisions/visualization.json",
        ],
    }.get(target_stage, ["evaluation/repair-request.json"])
    write_json(
        run_dir / "evaluation" / "repair-request.json",
        {
            "schema_version": 2,
            "target_stage": target_stage,
            "source_stage": source_stage,
            "diagnostic": diagnostic,
            "repair_actions": [str(action) for action in actions if str(action)],
            "context_files": context_files,
            "context_policy": (
                "Read the listed run-relative files first; expand context only when "
                "a listed repair action cannot be resolved from them."
            ),
            "recorded_at": utc_now(),
        },
    )


def clear_owned_repair_request(run_dir: Path, completed_stage: str) -> None:
    path = run_dir / "evaluation" / "repair-request.json"
    if not path.is_file():
        return
    request = read_json(path)
    if request.get("target_stage") == completed_stage:
        path.unlink()


def ensure_repair_request(
    run_dir: Path, *, target_stage: str, source_stage: str, diagnostic: str
) -> None:
    """Keep a richer existing handoff, otherwise record the checkpoint reason."""
    path = run_dir / "evaluation" / "repair-request.json"
    if path.is_file():
        request = read_json(path)
        if request.get("target_stage") == target_stage:
            return
    write_repair_request(
        run_dir,
        target_stage=target_stage,
        source_stage=source_stage,
        diagnostic=diagnostic,
    )


@dataclass(frozen=True)
class Paths:
    workspace: Path
    synthesizer: Path
    harness: Path
    experiment: Path
    runs: Path
    docs: Path
    sysml_viz: Path
    library: Path
    trusted: Path
    corpus: Path | None = None


@dataclass(frozen=True)
class Stage:
    name: str
    role: str
    template: str
    allowed: tuple[str, ...]
    decision: str
    dispositions: tuple[str, ...]


SEED_STAGE = Stage(
    "seed-generate",
    "seed",
    "seed-generate.md",
    (
        "seed.md",
        "decisions/seed-generation.json",
        "responses/seed-generate.md",
    ),
    "decisions/seed-generation.json",
    ("passed", "failed"),
)


STAGES = (
    Stage(
        "designer-initial",
        "designer",
        "designer-initial.md",
        (
            "system-abstract.initial.md",
            "design-selection.initial.md",
            "decisions/designer-initial.json",
            "responses/designer-initial.md",
        ),
        "decisions/designer-initial.json",
        ("passed", "failed"),
    ),
    Stage(
        "model-review",
        "model",
        "model-review.md",
        (
            "interactions/01-model-review.md",
            "decisions/model-review.json",
            "responses/model-review.md",
        ),
        "decisions/model-review.json",
        ("no-concern", "revision-recommended", "blocker"),
    ),
    Stage(
        "designer-resolution",
        "designer",
        "designer-resolution.md",
        (
            "system-abstract.md",
            "design-selection.md",
            "interactions/02-designer-resolution.md",
            "decisions/designer-resolution.json",
            "responses/designer-resolution.md",
        ),
        "decisions/designer-resolution.json",
        ("approved", "rejected"),
    ),
    Stage(
        "model-generate",
        "model",
        "model-generate.md",
        (
            "model/**",
            "validation/**",
            "model-summary.json",
            "model-summary.md",
            "metrics.json",
            "traceability.json",
            "provenance.json",
            "interactions/03-model-report.md",
            "decisions/model-generation.json",
            "responses/model-generate.md",
        ),
        "decisions/model-generation.json",
        ("passed", "failed", "blocker"),
    ),
    Stage(
        "visualize",
        "visualization",
        "visualize.md",
        (
            "visualization/**",
            "model/.sysmlviz/**",
            "decisions/visualization.json",
            "responses/visualize.md",
        ),
        "decisions/visualization.json",
        ("accepted", "visualization-rejected", "semantic-defect"),
    ),
    Stage(
        "designer-final",
        "designer",
        "designer-final.md",
        (
            "designer-validation.md",
            "interactions/04-designer-final.md",
            "decisions/designer-final.json",
            "responses/designer-final.md",
        ),
        "decisions/designer-final.json",
        ("accepted", "designer-rejected"),
    ),
)

def utc_now() -> str:
    return datetime.now(timezone.utc).strftime("%Y-%m-%dT%H:%M:%SZ")


def run_stamp() -> str:
    return datetime.now(timezone.utc).strftime("%Y%m%dT%H%M%SZ")


def slug(value: str) -> str:
    result = re.sub(r"[^a-z0-9]+", "-", value.lower()).strip("-")
    if not result:
        raise HarnessError("run label must contain an alphanumeric character")
    return result


def sha256_file(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def parse_front_matter(text: str) -> dict[str, str]:
    """Parse the flat YAML front matter used by frozen seed Markdown files."""
    if not text.startswith("---\n"):
        return {}
    end = text.find("\n---\n", 4)
    if end < 0:
        raise HarnessError("unterminated seed YAML front matter")
    result: dict[str, str] = {}
    for line in text[4:end].splitlines():
        if not line.strip() or line.lstrip().startswith("#"):
            continue
        if ":" not in line:
            raise HarnessError(f"invalid seed front-matter line: {line!r}")
        key, value = line.split(":", 1)
        result[key.strip()] = value.strip().strip("\"'")
    return result


def write_json(path: Path, value: Any) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(value, indent=2, sort_keys=False) + "\n", encoding="utf-8")


def read_json(path: Path) -> dict[str, Any]:
    try:
        value = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError) as exc:
        raise HarnessError(f"invalid or missing JSON artifact: {path}: {exc}") from exc
    if not isinstance(value, dict):
        raise HarnessError(f"JSON artifact must contain an object: {path}")
    return value


def append_jsonl(path: Path, value: dict[str, Any]) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("a", encoding="utf-8") as stream:
        stream.write(json.dumps(value, sort_keys=True) + "\n")


def relative_path(path: Path, base: Path | None = None) -> str:
    """Return a portable path without embedding the checkout location."""
    anchor = (base or Path.cwd()).resolve()
    return Path(os.path.relpath(path.resolve(), anchor)).as_posix()


def resolve_relative_path(value: str, base: Path) -> Path:
    """Resolve a stored path relative to its repository/workspace anchor."""
    path = Path(value).expanduser()
    return path.resolve() if path.is_absolute() else (base / path).resolve()


def discover_paths() -> Paths:
    synthesizer = Path(__file__).resolve().parent
    workspace = synthesizer.parents[1]
    campaign = workspace / "cps48"
    return Paths(
        workspace=workspace,
        synthesizer=synthesizer,
        harness=synthesizer,
        experiment=campaign,
        runs=campaign / "runs",
        docs=synthesizer / "guidelines",
        sysml_viz=workspace / "sysml-viz",
        library=workspace / "external/sysml-aadl-libraries",
        trusted=workspace / "external/inspecta-scp" / "scp_demo_artifacts" / "isolette_io",
        corpus=workspace / "external/sysml-v2-models",
    )


def snapshot(root: Path) -> dict[str, str]:
    result: dict[str, str] = {}
    if not root.exists():
        return result
    for path in sorted(root.rglob("*")):
        if path.is_file():
            result[path.relative_to(root).as_posix()] = sha256_file(path)
    return result


def repair_progress_fingerprint(run_dir: Path) -> str:
    """Hash substantive candidate state while excluding volatile wire/log files."""
    exact = {
        "seed.md",
        "system-abstract.initial.md",
        "system-abstract.md",
        "design-selection.initial.md",
        "design-selection.md",
        "metrics.json",
        "traceability.json",
        "visualization/system-overview.svg",
        "visualization/system-overview.png",
    }
    prefixes = ("model/", "validation/")
    records = {
        relative: digest
        for relative, digest in snapshot(run_dir).items()
        if (relative in exact or relative.startswith(prefixes))
        # SysML-viz rewrites session/audit timestamps even when the authored
        # routes and rendered result are unchanged. Rendered SVG evidence is
        # already covered by visualization/, so session churn is not progress.
        and not relative.startswith("model/.sysmlviz/")
        and "/history/" not in relative
        and not relative.endswith((".stderr.txt", ".stdout.txt"))
    }
    views = run_dir / "model" / ".sysmlviz" / "views.json"
    if views.is_file():
        try:
            view_state = json.loads(views.read_text(encoding="utf-8"))

            def without_timestamps(value: Any) -> Any:
                if isinstance(value, dict):
                    return {
                        key: without_timestamps(item)
                        for key, item in value.items()
                        if key.lower()
                        not in {
                            "updatedat",
                            "completedat",
                            "createdat",
                            "recordedat",
                            "timestamp",
                        }
                    }
                if isinstance(value, list):
                    return [without_timestamps(item) for item in value]
                return value

            canonical_views = json.dumps(
                without_timestamps(view_state),
                sort_keys=True,
                separators=(",", ":"),
            )
            records["model/.sysmlviz/views.json#semantic"] = hashlib.sha256(
                canonical_views.encode("utf-8")
            ).hexdigest()
        except (OSError, json.JSONDecodeError):
            # A partially written session file is not substantive progress; a
            # later valid authored state or exported SVG will change the hash.
            pass
    payload = json.dumps(records, sort_keys=True, separators=(",", ":"))
    return hashlib.sha256(payload.encode("utf-8")).hexdigest()


def changed_paths(before: dict[str, str], after: dict[str, str]) -> set[str]:
    return {
        name
        for name in before.keys() | after.keys()
        if before.get(name) != after.get(name)
    }


def path_allowed(path: str, patterns: Iterable[str]) -> bool:
    return any(fnmatch.fnmatch(path, pattern) for pattern in patterns)


def validate_agent_mutations(
    before: dict[str, str], after: dict[str, str], allowed: Iterable[str]
) -> list[str]:
    return sorted(path for path in changed_paths(before, after) if not path_allowed(path, allowed))


def walk_dicts(value: Any) -> Iterable[dict[str, Any]]:
    if isinstance(value, dict):
        yield value
        for child in value.values():
            yield from walk_dicts(child)
    elif isinstance(value, list):
        for child in value:
            yield from walk_dicts(child)


def extract_usage(jsonl: str) -> dict[str, int]:
    """Return the largest cumulative usage record found in Codex JSONL."""
    candidates: list[dict[str, int]] = []
    for line in jsonl.splitlines():
        try:
            event = json.loads(line)
        except json.JSONDecodeError:
            continue
        for item in walk_dicts(event):
            if "input_tokens" not in item or "output_tokens" not in item:
                continue
            try:
                record = {
                    "input_tokens": int(item.get("input_tokens", 0)),
                    "cached_input_tokens": int(item.get("cached_input_tokens", 0)),
                    "cache_write_input_tokens": int(item.get("cache_write_input_tokens", 0)),
                    "output_tokens": int(item.get("output_tokens", 0)),
                    "reasoning_output_tokens": int(item.get("reasoning_output_tokens", 0)),
                }
            except (TypeError, ValueError):
                continue
            record["total_tokens"] = int(
                item.get("total_tokens", record["input_tokens"] + record["output_tokens"])
            )
            candidates.append(record)
    if not candidates:
        return {
            "input_tokens": 0,
            "cached_input_tokens": 0,
            "cache_write_input_tokens": 0,
            "output_tokens": 0,
            "reasoning_output_tokens": 0,
            "total_tokens": 0,
        }
    return max(candidates, key=lambda item: (item["total_tokens"], item["input_tokens"]))


def aggregate_usage(records: Iterable[dict[str, int]]) -> dict[str, int]:
    keys = (
        "input_tokens",
        "cached_input_tokens",
        "cache_write_input_tokens",
        "output_tokens",
        "reasoning_output_tokens",
        "total_tokens",
    )
    result = {key: 0 for key in keys}
    for record in records:
        for key in keys:
            result[key] += int(record.get(key, 0))
    return result


def record_stage_usage(
    stage_usage: dict[str, dict[str, int]],
    stage_name: str,
    usage: dict[str, int],
    *,
    completed: bool = True,
) -> str:
    """Retain every invocation while keeping the canonical completion key."""
    if completed and stage_name not in stage_usage:
        key = stage_name
    else:
        suffix = "retry" if completed else "checkpoint"
        number = 1
        key = f"{stage_name}@{suffix}-{number}"
        while key in stage_usage:
            number += 1
            key = f"{stage_name}@{suffix}-{number}"
    stage_usage[key] = usage
    return key


def base_stage_name(invocation_name: str) -> str:
    return invocation_name.split("@", 1)[0]


_CAMPAIGN_BLOCK = re.compile(
    r"(?ms)^<!-- campaign-only:start -->\n(.*?)"
    r"^<!-- campaign-only:end -->\n?"
)


def render_prompt(template_path: Path, values: dict[str, str]) -> str:
    text = template_path.read_text(encoding="utf-8")
    starts = text.count("<!-- campaign-only:start -->")
    ends = text.count("<!-- campaign-only:end -->")
    if starts != ends:
        raise HarnessError(f"unbalanced campaign-only prompt block in {template_path}")
    campaign = values.get("SEED_GENERATED") == "true"
    text, replacements = _CAMPAIGN_BLOCK.subn(
        lambda match: match.group(1) if campaign else "", text
    )
    if replacements != starts:
        raise HarnessError(f"invalid campaign-only prompt block in {template_path}")
    return Template(text).safe_substitute(values)


def validate_decision(path: Path, allowed: tuple[str, ...]) -> dict[str, Any]:
    decision = read_json(path)
    disposition = decision.get("disposition", decision.get("status"))
    if disposition not in allowed:
        raise HarnessError(
            f"{path} disposition/status must be one of {allowed}, got {disposition!r}"
        )
    return decision


DIVERSITY_DIMENSIONS = {
    "boundary",
    "state_ownership",
    "interaction_topology",
    "priority_policy",
    "recovery_policy",
}


def validate_designer_diversity(decision: dict[str, Any], config: dict[str, Any]) -> None:
    """Fail closed before Model work when a run has a frozen diversity card."""
    if not config.get("diversity_card"):
        return
    evidence = decision.get("diversity")
    if not isinstance(evidence, dict):
        raise GateRejected("designer-rejected", "Designer decision lacks diversity evidence")
    if evidence.get("primary_scope_differs") is not True:
        raise GateRejected("designer-rejected", "primary controlled scope does not differ")
    if evidence.get("controlled_purpose_differs") is not True:
        raise GateRejected("designer-rejected", "controlled purpose does not differ")
    dimensions = evidence.get("differing_dimensions")
    if not isinstance(dimensions, list):
        raise GateRejected("designer-rejected", "differing_dimensions must be an array")
    distinct = {str(item) for item in dimensions}
    unknown = distinct - DIVERSITY_DIMENSIONS
    if unknown:
        raise GateRejected("designer-rejected", f"unknown diversity dimensions: {sorted(unknown)}")
    if len(distinct) < 2:
        raise GateRejected("designer-rejected", "fewer than two architecture/policy dimensions differ")
    for field in ("selected_primary_scope", "closest_baseline", "why_not_extension_or_rename"):
        if not isinstance(evidence.get(field), str) or not evidence[field].strip():
            raise GateRejected("designer-rejected", f"diversity evidence lacks {field}")


def terminal_status_for_failure(stage: str, decision: dict[str, Any]) -> str | None:
    """Agent dispositions never automatically make a synthesis run terminal.

    Terminal archival is a campaign/operator decision. Negative role decisions
    are routed by repair_stage_for_failure so the same run and candidate can be
    repaired with all prior token/time accounting intact.
    """
    return None


def repair_stage_for_failure(stage: str, decision: dict[str, Any]) -> str | None:
    """Return the stage that owns the next repair, or None when work may proceed."""
    disposition = decision.get("disposition", decision.get("status"))
    if stage == "seed-generate" and disposition == "failed":
        return "seed-generate"
    if stage == "designer-initial" and disposition == "failed":
        return "designer-initial"
    # A Model-review blocker is input to the normal Designer-resolution stage.
    if stage == "model-review" and disposition == "blocker":
        return None
    if stage == "designer-resolution" and disposition == "rejected":
        return "designer-resolution"
    if stage == "model-generate" and disposition in {"failed", "blocker"}:
        return "model-generate"
    if stage == "designer-final" and disposition == "designer-rejected":
        owner = decision.get("repair_owner")
        if owner == "designer":
            return "designer-resolution"
        if owner == "visualization":
            return "visualize"
        if owner == "model":
            return "model-generate"
        if decision.get("visualization_fitness") == "failed" and decision.get(
            "source_fitness"
        ) == "passed":
            return "visualize"
        if decision.get("source_fitness") == "failed":
            return "model-generate"
        return "designer-resolution"
    return None


def designer_visualization_checkpoint_reason(
    decision: dict[str, Any],
) -> str | None:
    """Keep a semantically accepted candidate resumable when presentation fails."""
    disposition = decision.get("disposition", decision.get("status"))
    if disposition != "accepted" or decision.get("visualization_fitness") != "failed":
        return None
    summary = str(decision.get("summary", "Designer rejected visualization fitness"))
    return "Designer accepted source semantics but rejected visualization fitness: " + summary


def prompt_values(paths: Paths, run_dir: Path, run_id: str, seed: Path) -> dict[str, str]:
    config_path = run_dir / "run-config.json"
    config = read_json(config_path) if config_path.is_file() else {}
    configured_complexity = config.get("complexity")
    complexity = (
        str(configured_complexity)
        if configured_complexity in COMPLEXITY_PROFILES
        else ""
    )
    return {
        "RUN_ID": run_id,
        "RUN_DIR": str(run_dir),
        "SEED": str(seed),
        "SEED_SOURCE": str(seed),
        "SEED_GUIDELINES": str(paths.docs / "SEED_GUIDELINES.md"),
        "CORPUS_ROOT": str(paths.corpus),
        "PLAN": str(paths.docs / "LLM_FIRST_GENERATOR_PLAN.md"),
        "DESIGNER_GUIDELINES": str(paths.docs / "DESIGNER_AGENT_GUIDELINES.md"),
        "MODEL_GUIDELINES": str(paths.docs / "MODEL_AGENT_GUIDELINES.md"),
        "VISUALIZATION_GUIDELINES": str(paths.docs / "VISUALIZATION_AGENT_GUIDELINES.md"),
        "SYSML_VIZ": str(paths.sysml_viz),
        "SYSML_VIZ_PORT": str(config.get("sysml_viz_port", 4782)),
        "SEED_GENERATED": "true" if (
            config.get("seed_generated") is True or bool(config.get("campaign_id"))
        ) else "false",
        "COMPLEXITY": complexity,
        "COMPLEXITY_SPEC": complexity_spec(complexity) if complexity else "",
        "SEED_VALIDATION_FEEDBACK": str(
            run_dir / "evaluation" / "seed-validation-feedback.md"
        ),
        "REPAIR_REQUEST": str(run_dir / "evaluation" / "repair-request.json"),
        "DIVERSITY_CARD": str(config.get("diversity_card", "")),
    }


def codex_command(args: argparse.Namespace, paths: Paths, response: Path) -> list[str]:
    return [
        args.codex_bin,
        "exec",
        "--json",
        "--ephemeral",
        "--color",
        "never",
        "-C",
        str(paths.workspace),
        "-s",
        "workspace-write",
        "-m",
        args.model,
        "-c",
        f'model_reasoning_effort="{args.reasoning_effort}"',
        "-o",
        str(response),
        "-",
    ]


def archive_stage_invocation(run_dir: Path, stage: Stage) -> None:
    """Preserve prior wire artifacts before a resumable stage is invoked again."""
    candidates = (
        run_dir / "prompts" / f"{stage.name}.md",
        run_dir / "responses" / f"{stage.name}.md",
        run_dir / "events" / f"{stage.name}.jsonl",
        run_dir / "events" / f"{stage.name}.stderr.txt",
        run_dir / stage.decision,
    )
    for path in candidates:
        if not path.is_file():
            continue
        history = path.parent / "history"
        history.mkdir(exist_ok=True)
        number = 1
        target = history / f"{path.stem}.invocation-{number}{path.suffix}"
        while target.exists():
            number += 1
            target = history / f"{path.stem}.invocation-{number}{path.suffix}"
        shutil.move(path, target)


def prompt_template_for_stage(run_dir: Path, stage: Stage) -> str:
    """Select a compact role prompt when a stage owns a localized repair."""
    repair_request = run_dir / "evaluation" / "repair-request.json"
    if not repair_request.is_file():
        return stage.template
    request = read_json(repair_request)
    if request.get("target_stage") != stage.name:
        return stage.template
    return {
        "model-generate": "model-repair.md",
        "visualize": "visualize-repair.md",
    }.get(stage.name, stage.template)


def run_agent_stage(
    args: argparse.Namespace,
    paths: Paths,
    run_dir: Path,
    run_id: str,
    seed: Path,
    stage: Stage,
) -> tuple[dict[str, Any], dict[str, int]]:
    archive_stage_invocation(run_dir, stage)
    template = prompt_template_for_stage(run_dir, stage)
    prompt = render_prompt(
        paths.harness / "prompts" / template,
        {
            **prompt_values(paths, run_dir, run_id, seed),
            "STAGE_NAME": stage.name,
            "DECISION_PATH": str(run_dir / stage.decision),
        },
    )
    prompt_path = run_dir / "prompts" / f"{stage.name}.md"
    response_path = run_dir / "responses" / f"{stage.name}.md"
    events_path = run_dir / "events" / f"{stage.name}.jsonl"
    stderr_path = run_dir / "events" / f"{stage.name}.stderr.txt"
    prompt_path.write_text(prompt, encoding="utf-8")

    before = snapshot(run_dir)
    started = time.monotonic()
    command = codex_command(args, paths, response_path)
    timeout = args.timeout if args.timeout and args.timeout > 0 else None
    try:
        completed = subprocess.run(
            command,
            input=prompt,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            cwd=paths.workspace,
            timeout=timeout,
            check=False,
        )
    except subprocess.TimeoutExpired as exc:
        stdout = exc.stdout or ""
        stderr = exc.stderr or ""
        if isinstance(stdout, bytes):
            stdout = stdout.decode("utf-8", errors="replace")
        if isinstance(stderr, bytes):
            stderr = stderr.decode("utf-8", errors="replace")
        events_path.write_text(stdout, encoding="utf-8")
        stderr_path.write_text(stderr, encoding="utf-8")
        usage = extract_usage(stdout)
        append_jsonl(
            run_dir / "journal.jsonl",
            {
                "event": "stage-checkpointed",
                "stage": stage.name,
                "role": stage.role,
                "completed_at": utc_now(),
                "duration_seconds": round(time.monotonic() - started, 3),
                "reason": "watchdog",
                "watchdog_seconds": args.timeout,
                "usage": usage,
            },
        )
        raise OperationalCheckpoint(
            stage.name,
            f"Codex stage {stage.name} reached the {args.timeout}s operational watchdog",
            usage,
        ) from exc

    events_path.write_text(completed.stdout, encoding="utf-8")
    stderr_path.write_text(completed.stderr, encoding="utf-8")
    usage = extract_usage(completed.stdout)
    after = snapshot(run_dir)
    allowed = stage.allowed + (
        f"events/{stage.name}.jsonl",
        f"events/{stage.name}.stderr.txt",
    )
    violations = validate_agent_mutations(before, after, allowed)

    append_jsonl(
        run_dir / "journal.jsonl",
        {
            "event": "stage-completed" if completed.returncode == 0 else "stage-command-failed",
            "stage": stage.name,
            "role": stage.role,
            "completed_at": utc_now(),
            "duration_seconds": round(time.monotonic() - started, 3),
            "returncode": completed.returncode,
            "usage": usage,
            "mutation_violations": violations,
        },
    )
    if completed.returncode != 0:
        raise HarnessError(
            f"Codex stage {stage.name} failed with exit {completed.returncode}; see {stderr_path}"
        )
    if violations:
        raise HarnessError(
            f"Codex stage {stage.name} changed unauthorized run artifacts: {violations}"
        )
    decision = validate_decision(run_dir / stage.decision, stage.dispositions)
    return decision, usage


def find_canonical_source(run_dir: Path, decision: dict[str, Any]) -> Path:
    declared = decision.get("canonical_source")
    if isinstance(declared, str):
        candidate = (run_dir / declared).resolve()
        if candidate.is_file() and candidate.parent == (run_dir / "model").resolve():
            return candidate
    candidates = sorted((run_dir / "model").glob("*.sysml"))
    if len(candidates) != 1:
        raise HarnessError(f"expected exactly one canonical model/*.sysml, found {len(candidates)}")
    return candidates[0]


def require_well_formed(path: Path) -> None:
    text = path.read_text(encoding="utf-8")
    error_diagnostic = re.search(
        r"(?im)^(?:.*:\d+:\d+(?::\d+:\d+)?:\s*|\s*-\s*\[[^]]+\]\s*)error:",
        text,
    )
    if "Well-formed!" not in text or error_diagnostic:
        raise HarnessError(f"source gate did not pass cleanly: {path}")


def normalize_model_protocols(
    run_dir: Path, coverage: dict[str, Any], trace: dict[str, Any]
) -> tuple[dict[str, Any], dict[str, Any], list[str]]:
    """Canonicalize mechanically equivalent wire fields without changing semantics."""
    normalizations: list[str] = []
    if "status" not in coverage and coverage.get("passed") is True:
        coverage["status"] = "passed"
        normalizations.append("bounded analyzer passed=true -> status=passed")
    if "status" not in trace and trace.get("coverage_status") in {"passed", "complete"}:
        trace["status"] = trace["coverage_status"]
        normalizations.append("traceability coverage_status -> status")
    for key in (
        "missing_ids",
        "unexplained_trace_ids",
        "unannotated_significant_elements",
    ):
        if key not in trace:
            trace[key] = []
            normalizations.append(f"traceability omitted {key} -> []")
    if normalizations:
        raw_trace = run_dir / "validation" / "traceability.raw.json"
        if not raw_trace.exists():
            shutil.copy2(run_dir / "traceability.json", raw_trace)
        write_json(run_dir / "traceability.json", trace)
        write_json(
            run_dir / "validation" / "protocol-normalization.json",
            {
                "schema_version": 1,
                "status": "passed",
                "normalizations": normalizations,
                "semantic_changes": False,
            },
        )
    return coverage, trace, normalizations


OWNERSHIP_ROLES = frozenset({"applicability", "proposal", "decision"})
OWNERSHIP_EVIDENCE_FIELDS = (
    "assigned_inputs",
    "owner_local_facts",
    "contract_cases",
    "analyzer_checks",
)


def _nonempty_string_list(value: Any, field: str) -> list[str]:
    if (
        not isinstance(value, list)
        or not value
        or any(not isinstance(item, str) or not item.strip() for item in value)
    ):
        raise HarnessError(f"ownership_audit.{field} must be a nonempty string list")
    if len(set(value)) != len(value):
        raise HarnessError(f"ownership_audit.{field} must not contain duplicates")
    return value


def validate_ownership_audit(
    value: Any, *, analyzer: bool = False
) -> dict[str, dict[str, Any]]:
    """Validate the ownership evidence wire contract without guessing semantics."""
    if not isinstance(value, list) or not value:
        raise HarnessError("ownership_audit must be a nonempty array")
    records: dict[str, dict[str, Any]] = {}
    for index, item in enumerate(value):
        if not isinstance(item, dict):
            raise HarnessError(f"ownership_audit[{index}] must be an object")
        usage = item.get("usage")
        if not isinstance(usage, str) or not usage.strip():
            raise HarnessError(
                f"ownership_audit[{index}].usage must be a nonempty string"
            )
        if usage in records:
            raise HarnessError(f"ownership_audit contains duplicate usage {usage!r}")
        for field in OWNERSHIP_EVIDENCE_FIELDS:
            _nonempty_string_list(item.get(field), field)
        if analyzer:
            if item.get("passed") is not True:
                raise HarnessError(
                    f"bounded analyzer did not pass ownership audit for {usage!r}"
                )
        else:
            roles = set(
                _nonempty_string_list(item.get("claimed_roles"), "claimed_roles")
            )
            unsupported = sorted(roles - OWNERSHIP_ROLES)
            if unsupported:
                raise HarnessError(
                    f"ownership_audit for {usage!r} has unsupported roles: {unsupported}"
                )
        records[usage] = item
    return records


def run_mechanical_model_checks(
    args: argparse.Namespace, paths: Paths, run_dir: Path, decision: dict[str, Any]
) -> tuple[Path, str]:
    source = find_canonical_source(run_dir, decision)
    source_hash = sha256_file(source)
    architecture_tipe = run_dir / "validation" / "architecture-stage" / "tipe.txt"
    final_tipe = run_dir / "validation" / "final-tipe.txt"
    require_well_formed(architecture_tipe)
    require_well_formed(final_tipe)

    command = [
        args.sireum_bin,
        "hamr",
        "sysml",
        "tipe",
        "-s",
        f"{run_dir / 'model'}:{paths.library}",
        str(source),
    ]
    completed = subprocess.run(
        command,
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        cwd=paths.workspace,
        timeout=args.tool_timeout,
        check=False,
    )
    harness_tipe = run_dir / "validation" / "harness-final-tipe.txt"
    harness_tipe.write_text(completed.stdout, encoding="utf-8")
    if completed.returncode != 0:
        raise HarnessError(f"independent Sireum gate exited {completed.returncode}")
    require_well_formed(harness_tipe)

    analyzer = run_dir / "validation" / "bounded-analysis.mjs"
    if not analyzer.is_file():
        raise HarnessError("Model Agent did not retain validation/bounded-analysis.mjs")
    analysis = subprocess.run(
        [args.node_bin, str(analyzer)],
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        cwd=run_dir,
        timeout=args.tool_timeout,
        check=False,
    )
    (run_dir / "validation" / "bounded-analysis.stderr.txt").write_text(
        analysis.stderr, encoding="utf-8"
    )
    if analysis.returncode != 0:
        raise HarnessError(f"bounded analyzer exited {analysis.returncode}")
    try:
        coverage = json.loads(analysis.stdout)
    except json.JSONDecodeError as exc:
        raise HarnessError("bounded analyzer stdout was not one JSON object") from exc
    if not isinstance(coverage, dict):
        raise HarnessError("bounded analyzer result must be a JSON object")
    trace = read_json(run_dir / "traceability.json")
    coverage, trace, normalizations = normalize_model_protocols(
        run_dir, coverage, trace
    )
    coverage.setdefault("source_sha256", source_hash)
    if coverage.get("source_sha256") != source_hash:
        raise HarnessError("bounded analyzer source hash does not match canonical source")
    if coverage.get("status") != "passed":
        raise HarnessError("bounded analyzer did not report status=passed")
    config = read_json(run_dir / "run-config.json")
    if config.get("seed_generated") is True or bool(config.get("campaign_id")):
        validate_ownership_audit(coverage.get("ownership_audit"), analyzer=True)
    observations = coverage.get("observations", {})
    if isinstance(observations, dict):
        for key, value in observations.items():
            if key.endswith(("violations", "gaps", "overlaps", "mismatches")) and value != 0:
                raise HarnessError(f"bounded analyzer reports {key}={value}")
    checks = coverage.get("checks", {})
    if isinstance(checks, dict) and any(value is not True for value in checks.values()):
        raise HarnessError("bounded analyzer contains a failed boolean check")
    write_json(run_dir / "validation" / "contract-coverage.json", coverage)

    if trace.get("status") not in {"passed", "complete"}:
        raise HarnessError("traceability status is not passed/complete")
    for key in ("missing_ids", "unexplained_trace_ids", "unannotated_significant_elements"):
        if trace.get(key, []):
            raise HarnessError(f"traceability reports nonempty {key}")

    append_jsonl(
        run_dir / "journal.jsonl",
        {
            "event": "mechanical-model-checks-passed",
            "completed_at": utc_now(),
            "source": source.relative_to(run_dir).as_posix(),
            "source_sha256": source_hash,
            "protocol_normalizations": normalizations,
        },
    )
    return source, source_hash


def validate_complexity_metrics(run_dir: Path, declared: str) -> dict[str, Any]:
    metrics = read_json(run_dir / "metrics.json")
    normalized = metrics.get("campaign_complexity")
    if not isinstance(normalized, dict):
        raise HarnessError("metrics.json lacks campaign_complexity normalized counts")
    if normalized.get("tier") != declared:
        raise HarnessError(
            f"campaign_complexity tier {normalized.get('tier')!r} does not match {declared!r}",
        )
    profile = COMPLEXITY_PROFILES[declared]
    observed: dict[str, int] = {}
    for key in (
        "semantic_usages",
        "semantic_interactions",
        "nontrivial_contract_cases",
        "scenario_families",
    ):
        value = normalized.get(key)
        if not isinstance(value, int) or isinstance(value, bool):
            raise HarnessError(
                f"campaign_complexity.{key} must be an integer"
            )
        low, high = profile[key]
        if not low <= value <= high:
            raise HarnessError(
                f"{declared} campaign_complexity.{key}={value} is outside {low}..{high}",
            )
        observed[key] = value

    features = normalized.get("features")
    if not isinstance(features, dict):
        raise HarnessError("campaign_complexity.features must be an object")
    required_features: tuple[str, ...] = ()
    if declared == "medium":
        required_features = ("multiple_decision_owners", "priority_conflict")
    elif declared == "hard":
        required_features = (
            "multiple_decision_owners",
            "priority_conflict",
            "fault_propagation",
            "recovery",
            "composition",
        )
    missing = [name for name in required_features if features.get(name) is not True]
    if missing:
        raise HarnessError(
            f"{declared} complexity is missing required features: {missing}"
        )
    if normalized.get("counting_rules") != "campaign-v1":
        raise HarnessError("campaign_complexity.counting_rules must be campaign-v1")
    metric_owners = validate_ownership_audit(normalized.get("ownership_audit"))
    minimum_owners = 1 if declared == "small" else 2
    if len(metric_owners) < minimum_owners:
        raise HarnessError(
            f"{declared} complexity requires at least {minimum_owners} audited "
            "applicability/proposal/decision owners"
        )
    coverage_path = run_dir / "validation" / "contract-coverage.json"
    if not coverage_path.is_file():
        raise HarnessError("ownership audit requires validation/contract-coverage.json")
    analyzer_owners = validate_ownership_audit(
        read_json(coverage_path).get("ownership_audit"), analyzer=True
    )
    if set(metric_owners) != set(analyzer_owners):
        raise HarnessError(
            "metrics and bounded analyzer ownership_audit usages do not match"
        )
    for usage, metric_record in metric_owners.items():
        analyzer_record = analyzer_owners[usage]
        for field in OWNERSHIP_EVIDENCE_FIELDS:
            if metric_record[field] != analyzer_record[field]:
                raise HarnessError(
                    f"metrics and bounded analyzer ownership_audit.{field} "
                    f"do not match for {usage!r}"
                )
    report = {
        "schema_version": 1,
        "status": "passed",
        "declared_tier": declared,
        "observed": observed,
        "features": features,
        "ownership_audit": list(metric_owners.values()),
        "counting_rules": "campaign-v1",
    }
    write_json(run_dir / "evaluation" / "complexity-validation.json", report)
    return report


def run_pre_final_gates(
    args: argparse.Namespace,
    paths: Paths,
    run_dir: Path,
    decisions: dict[str, dict[str, Any]],
    source_hash: str | None,
    metadata: dict[str, Any] | None,
) -> tuple[Path, str, dict[str, Any]]:
    """Prove deterministic gates are green before spending a final-review call.

    In an uninterrupted run these checks reuse the results established directly
    after Model and Visualization.  On a resumed final-review checkpoint they
    re-run the mechanical source/analyzer checks and validate the retained
    visualization sidecar before the Designer is invoked.
    """
    model_decision = decisions.get("model-generate")
    visualization_decision = decisions.get("visualize")
    if not model_decision or not visualization_decision:
        raise HarnessError("pre-final gates require completed Model and Visualization decisions")

    source = find_canonical_source(run_dir, model_decision)
    current_hash = sha256_file(source)
    source_changed_since_visualization = source_hash != current_hash
    if source_changed_since_visualization:
        metadata = None
    if source_changed_since_visualization or metadata is None:
        source, current_hash = run_mechanical_model_checks(
            args, paths, run_dir, model_decision
        )
        config = read_json(run_dir / "run-config.json")
        if config.get("seed_generated") or config.get("campaign_id"):
            validate_complexity_metrics(
                run_dir, str(config.get("complexity", "medium"))
            )

    disposition = visualization_decision.get(
        "disposition", visualization_decision.get("status")
    )
    if disposition != "accepted":
        raise OperationalCheckpoint(
            "visualize",
            "deterministic pre-final gate requires an accepted Visualization decision",
        )
    if metadata is None:
        try:
            metadata = validate_visualization(
                run_dir, current_hash, visualization_decision
            )
        except HarnessError as exc:
            raise OperationalCheckpoint(
                "visualize", f"deterministic pre-final visualization gate: {exc}"
            ) from exc
    return source, current_hash, metadata


def validate_or_checkpoint_visualization(
    run_dir: Path, source_hash: str, decision: dict[str, Any]
) -> dict[str, Any]:
    """Stop before semantic rereview when presentation evidence is not green."""
    disposition = decision.get("disposition", decision.get("status"))
    if disposition == "visualization-rejected":
        diagnostic = str(
            decision.get("summary", "visualization requires another pass")
        )
        write_repair_request(
            run_dir,
            target_stage="visualize",
            source_stage="visualize",
            diagnostic=diagnostic,
            actions=decision.get("repair_actions", ()),
        )
        raise OperationalCheckpoint(
            "visualize", "visualization requires repair: " + diagnostic
        )
    try:
        return validate_visualization(run_dir, source_hash, decision)
    except HarnessError as exc:
        write_repair_request(
            run_dir,
            target_stage="visualize",
            source_stage="visualize",
            diagnostic=str(exc),
        )
        raise OperationalCheckpoint(
            "visualize", "deterministic visualization gate failed: " + str(exc)
        ) from exc


def validate_visualization(
    run_dir: Path, source_hash: str, decision: dict[str, Any]
) -> dict[str, Any]:
    required = (
        run_dir / "visualization" / "system-overview.svg",
        run_dir / "visualization" / "system-overview.png",
        run_dir / "visualization" / "system-overview.svg.json",
        run_dir / "visualization" / "visualization-review.md",
        run_dir / "model" / ".sysmlviz" / "views.json",
    )
    missing = [str(path) for path in required if not path.is_file()]
    if missing:
        raise HarnessError(f"missing visualization artifacts: {missing}")
    metadata = read_json(required[2])
    health = metadata.get("diagramHealth")
    if not isinstance(health, dict):
        raise HarnessError("visualization sidecar lacks diagramHealth")
    hard_keys = (
        "unresolvedEndpointCount",
        "overlapCount",
        "crossingCount",
        "truncatedTextCount",
        "outOfBoundsCount",
    )
    for key in hard_keys:
        if int(health.get(key, 0)) != 0:
            raise HarnessError(f"visualization hard gate {key}={health.get(key)}")
    session = metadata.get("session")
    validation = session.get("validation") if isinstance(session, dict) else None
    if not isinstance(validation, dict) or validation.get("status") != "valid":
        raise HarnessError(
            "visualization sidecar session.validation.status must be exactly valid"
        )
    traceability = metadata.get("traceability")
    if not isinstance(traceability, dict) or traceability.get("available") is not True:
        raise HarnessError("visualization sidecar lacks an available System Abstract")
    referenced = traceability.get("referencedTraceIds")
    if not isinstance(referenced, list) or not referenced or not all(
        isinstance(item, str) for item in referenced
    ):
        raise HarnessError("visualization sidecar lacks referenced trace IDs")
    for key in ("unresolvedTraceIds", "duplicateAnchorIds"):
        if traceability.get(key) != []:
            raise HarnessError(f"visualization traceability gate {key} is not empty")
    for key in ("taggedElementCount", "traceAssociationCount"):
        value = traceability.get(key)
        if not isinstance(value, int) or isinstance(value, bool) or value <= 0:
            raise HarnessError(f"visualization traceability gate {key} must be positive")

    if decision.get("traceability_review") != "passed":
        raise HarnessError("Visualization Agent did not pass semantic traceability review")
    reviewed_ids = decision.get("reviewed_trace_ids")
    if (
        not isinstance(reviewed_ids, list)
        or not all(isinstance(item, str) for item in reviewed_ids)
        or sorted(reviewed_ids) != sorted(referenced)
    ):
        raise HarnessError("Visualization Agent did not review the complete trace-ID set")
    for decision_key, metadata_key in (
        ("reviewed_tagged_element_count", "taggedElementCount"),
        ("reviewed_trace_association_count", "traceAssociationCount"),
    ):
        if decision.get(decision_key) != traceability[metadata_key]:
            raise HarnessError(
                f"Visualization Agent {decision_key} does not match exported traceability"
            )
    for key in (
        "unresolved_trace_ids",
        "duplicate_anchor_ids",
        "irrelevant_trace_associations",
    ):
        if decision.get(key) != []:
            raise HarnessError(f"Visualization Agent reported nonempty {key}")
    append_jsonl(
        run_dir / "journal.jsonl",
        {
            "event": "visualization-checks-passed",
            "completed_at": utc_now(),
            "source_sha256": source_hash,
            "health": {key: health.get(key, 0) for key in hard_keys},
            "label_contacts": health.get("labelCollisionCount", 0),
            "traceability": {
                "referenced_trace_ids": referenced,
                "tagged_element_count": traceability["taggedElementCount"],
                "trace_association_count": traceability["traceAssociationCount"],
            },
        },
    )
    return metadata


def usage_matrix(usage: dict[str, int]) -> dict[str, Any]:
    input_tokens = usage["input_tokens"]
    cached = usage["cached_input_tokens"]
    output = usage["output_tokens"]
    return {
        "cached": {"input": cached, "output": 0},
        "non_cached": {"input": input_tokens - cached, "output": output},
        "totals": {
            "input": input_tokens,
            "output": output,
            "overall": input_tokens + output,
        },
    }


def build_usage_report(
    run_id: str, stage_usage: dict[str, dict[str, int]], model: str
) -> dict[str, Any]:
    role_records: dict[str, list[dict[str, int]]] = {
        "seed": [],
        "designer": [],
        "model": [],
        "visualization": [],
    }
    stage_lookup = {stage.name: stage.role for stage in STAGES}
    stage_lookup[SEED_STAGE.name] = SEED_STAGE.role
    for invocation_name, usage in stage_usage.items():
        stage_name = base_stage_name(invocation_name)
        role = stage_lookup.get(stage_name)
        if role is None:
            raise HarnessError(f"unknown stage in usage report: {stage_name}")
        role_records[role].append(usage)
    displayed_roles = ["designer", "model", "visualization"]
    if role_records["seed"]:
        displayed_roles.insert(0, "seed")
    agents = []
    for role in displayed_roles:
        usage = aggregate_usage(role_records[role])
        agents.append(
            {
                "role": role,
                "model": model,
                "stages": [
                    name
                    for name in stage_usage
                    if stage_lookup[base_stage_name(name)] == role
                ],
                "token_matrix": usage_matrix(usage),
                "reasoning_output_tokens": usage["reasoning_output_tokens"],
                "cache_write_input_tokens": usage["cache_write_input_tokens"],
            }
        )
    total = aggregate_usage(aggregate_usage(records) for records in role_records.values())
    return {
        "schema_version": 1,
        "run_id": run_id,
        "recorded_at": utc_now(),
        "scope": "Usage reported by the run's stateless Codex stage invocations.",
        "cache_semantics": "Cache attribution applies to input only; reasoning output is a subset of output.",
        "agents": agents,
        "aggregate": {
            "agent_count": len(agents),
            "token_matrix": usage_matrix(total),
            "reasoning_output_tokens": total["reasoning_output_tokens"],
            "cache_write_input_tokens": total["cache_write_input_tokens"],
        },
    }


def fmt_tokens(value: int) -> str:
    return f"{value:,}"


def create_usage_svg(report: dict[str, Any], path: Path) -> None:
    agents = report["agents"]
    aggregate = report["aggregate"]["token_matrix"]
    max_total = max(agent["token_matrix"]["totals"]["overall"] for agent in agents) or 1
    max_detail = max(
        agent["token_matrix"]["non_cached"]["input"]
        + agent["token_matrix"]["non_cached"]["output"]
        for agent in agents
    ) or 1
    colors = {"cached": "#6d5dfb", "input": "#21a67a", "output": "#f5a623"}
    rows = []
    for index, agent in enumerate(agents):
        y = 330 + index * 125
        matrix = agent["token_matrix"]
        cached_w = 520 * matrix["cached"]["input"] / max_total
        input_w = 520 * matrix["non_cached"]["input"] / max_total
        output_w = 520 * matrix["non_cached"]["output"] / max_total
        detail_input = 460 * matrix["non_cached"]["input"] / max_detail
        detail_output = 460 * matrix["non_cached"]["output"] / max_detail
        role = agent["role"].title()
        rows.append(
            f'<text class="label" x="72" y="{y + 22}">{role}</text>'
            f'<rect x="170" y="{y}" width="{cached_w:.2f}" height="32" rx="5" fill="{colors["cached"]}"/>'
            f'<rect x="{170 + cached_w:.2f}" y="{y}" width="{input_w:.2f}" height="32" fill="{colors["input"]}"/>'
            f'<rect x="{170 + cached_w + input_w:.2f}" y="{y}" width="{output_w:.2f}" height="32" fill="{colors["output"]}"/>'
            f'<text class="value" x="170" y="{y + 52}">{fmt_tokens(matrix["totals"]["overall"])} total</text>'
            f'<rect x="840" y="{y}" width="{detail_input:.2f}" height="32" rx="5" fill="{colors["input"]}"/>'
            f'<rect x="{840 + detail_input:.2f}" y="{y}" width="{detail_output:.2f}" height="32" rx="3" fill="{colors["output"]}"/>'
            f'<text class="value" x="840" y="{y + 52}">{fmt_tokens(matrix["non_cached"]["input"])} input + {fmt_tokens(matrix["non_cached"]["output"])} output</text>'
        )
    total = aggregate["totals"]["overall"]
    cached = aggregate["cached"]["input"]
    non_cached = aggregate["non_cached"]["input"]
    output = aggregate["totals"]["output"]
    cache_pct = 100.0 * cached / aggregate["totals"]["input"] if aggregate["totals"]["input"] else 0
    svg = f'''<svg xmlns="http://www.w3.org/2000/svg" width="1400" height="880" viewBox="0 0 1400 880" role="img">
<style>text{{font-family:Inter,ui-sans-serif,system-ui,sans-serif;fill:#18212f}}.title{{font-size:30px;font-weight:700}}.subtitle,.value,.note{{font-size:13px;fill:#68758a}}.label{{font-size:14px;font-weight:650}}.card{{font-size:22px;font-weight:750}}.panel{{font-size:18px;font-weight:700}}</style>
<rect width="1400" height="820" fill="#f6f7fb"/><text class="title" x="54" y="58">Token usage by agent</text><text class="subtitle" x="54" y="84">{report["run_id"]} · stateless Codex stages</text>
<g transform="translate(54 110)"><rect width="300" height="82" rx="12" fill="#fff" stroke="#e4e7ee"/><text class="card" x="18" y="37">{fmt_tokens(total)}</text><text class="note" x="18" y="62">TOTAL TOKENS</text></g>
<g transform="translate(372 110)"><rect width="300" height="82" rx="12" fill="#fff" stroke="#e4e7ee"/><text class="card" x="18" y="37">{fmt_tokens(cached)}</text><text class="note" x="18" y="62">CACHED INPUT · {cache_pct:.2f}%</text></g>
<g transform="translate(690 110)"><rect width="300" height="82" rx="12" fill="#fff" stroke="#e4e7ee"/><text class="card" x="18" y="37">{fmt_tokens(non_cached)}</text><text class="note" x="18" y="62">NON-CACHED INPUT</text></g>
<g transform="translate(1008 110)"><rect width="338" height="82" rx="12" fill="#fff" stroke="#e4e7ee"/><text class="card" x="18" y="37">{fmt_tokens(output)}</text><text class="note" x="18" y="62">OUTPUT</text></g>
<rect x="54" y="230" width="650" height="510" rx="14" fill="#fff" stroke="#e4e7ee"/><rect x="724" y="230" width="622" height="510" rx="14" fill="#fff" stroke="#e4e7ee"/>
<text class="panel" x="76" y="270">Total usage</text><text class="note" x="76" y="293">Cached input + non-cached input + output</text><text class="panel" x="746" y="270">Non-cached detail</text><text class="note" x="746" y="293">Cached input omitted for readability</text>
{''.join(rows)}
<g transform="translate(54 766)"><rect width="1292" height="82" rx="14" fill="#18212f"/><text x="22" y="32" font-size="14" font-weight="700" fill="#fff">Aggregate non-cached work</text><text x="22" y="61" font-size="21" font-weight="750" fill="#fff">{fmt_tokens(non_cached)} input + {fmt_tokens(output)} output = {fmt_tokens(non_cached + output)} tokens</text></g>
</svg>'''
    path.write_text(svg, encoding="utf-8")


def stage_role(stage_name: str) -> str:
    lookup = {stage.name: stage.role for stage in STAGES}
    lookup[SEED_STAGE.name] = SEED_STAGE.role
    return lookup.get(stage_name, "unknown")


def accepted_run_timing(run_dir: Path, completed_at: str) -> dict[str, Any]:
    """Summarize real run and agent-invocation time before journal compaction."""
    config = read_json(run_dir / "run-config.json")
    started_at = str(config.get("created_at", ""))
    stages: list[dict[str, Any]] = []
    role_seconds: dict[str, float] = {}
    journal = run_dir / "journal.jsonl"
    if journal.is_file():
        for line in journal.read_text(encoding="utf-8").splitlines():
            try:
                event = json.loads(line)
            except json.JSONDecodeError:
                continue
            if not isinstance(event, dict) or "stage" not in event:
                continue
            try:
                duration = round(float(event["duration_seconds"]), 3)
            except (KeyError, TypeError, ValueError):
                continue
            name = str(event["stage"])
            role = str(event.get("role") or stage_role(name))
            stages.append(
                {
                    "stage": name,
                    "role": role,
                    "completed_at": event.get("completed_at", event.get("at")),
                    "duration_seconds": duration,
                }
            )
            role_seconds[role] = role_seconds.get(role, 0.0) + duration

    run_elapsed = 0.0
    try:
        start = datetime.fromisoformat(started_at.replace("Z", "+00:00"))
        end = datetime.fromisoformat(completed_at.replace("Z", "+00:00"))
        run_elapsed = max(0.0, round((end - start).total_seconds(), 3))
    except ValueError:
        pass
    return {
        "started_at": started_at or None,
        "completed_at": completed_at,
        "run_elapsed_seconds": run_elapsed,
        "summed_agent_stage_seconds": round(
            sum(item["duration_seconds"] for item in stages), 3
        ),
        "stages": stages,
        "role_seconds": {
            role: round(seconds, 3) for role, seconds in role_seconds.items()
        },
        "semantics": (
            "run_elapsed_seconds is real elapsed time from run creation through acceptance; "
            "summed_agent_stage_seconds excludes harness-only checks and inter-stage gaps."
        ),
    }


def retained_decisions(decisions: dict[str, dict[str, Any]]) -> dict[str, dict[str, Any]]:
    names = {
        "seed-generate": "seed-generation",
        "model-generate": "model-generation",
        "visualize": "visualization",
    }
    return {
        names.get(name, name): decision
        for name, decision in decisions.items()
    }


def retained_evaluations(run_dir: Path) -> dict[str, dict[str, Any]]:
    root = run_dir / "evaluation"
    if not root.is_dir():
        return {}
    results: dict[str, dict[str, Any]] = {}
    for path in sorted(root.rglob("*.json")):
        key = path.relative_to(root).with_suffix("").as_posix()
        results[key] = read_json(path)
    return results


def accepted_verification_report(
    run_dir: Path,
    run_id: str,
    source: Path,
    source_hash: str,
    decisions: dict[str, dict[str, Any]],
    metadata: dict[str, Any],
    reason: str,
) -> dict[str, Any]:
    health = metadata.get("diagramHealth", {})
    traceability = metadata.get("traceability", {})
    if not isinstance(health, dict) or not isinstance(traceability, dict):
        raise HarnessError("accepted visualization metadata is incomplete")
    trace_passed = (
        traceability.get("available") is True
        and traceability.get("unresolvedTraceIds") == []
        and traceability.get("duplicateAnchorIds") == []
    )
    if not trace_passed:
        raise HarnessError("accepted retention requires a passing traceability audit")
    return {
        "schema_version": 2,
        "run_id": run_id,
        "terminal_status": "accepted",
        "source": source.relative_to(run_dir).as_posix(),
        "source_sha256": source_hash,
        "checks": {
            "architecture_tipe": "passed",
            "final_tipe": "passed",
            "bounded_analysis": "passed",
            "traceability": "passed",
            "visualization": decisions.get("visualize", {}).get(
                "disposition", "not-run"
            ),
            "designer_validation": decisions.get("designer-final", {}).get(
                "disposition", "not-run"
            ),
        },
        "diagram_health_summary": {
            key: health.get(key, 0)
            for key in (
                "nodeCount",
                "edgeCount",
                "unresolvedEndpointCount",
                "overlapCount",
                "crossingCount",
                "routeObjectCollisionCount",
                "truncatedTextCount",
                "outOfBoundsCount",
            )
        },
        "traceability_audit": traceability,
        "agent_decisions": retained_decisions(decisions),
        "evaluations": retained_evaluations(run_dir),
        "reason": reason,
        "retention": {
            "profile": ACCEPTED_RETENTION_PROFILE,
            "decisions_consolidated_here": True,
            "evaluation_results_consolidated_here": True,
            "raw_prompts_responses_events_retained": False,
        },
        "claim_boundary": (
            "Acceptance is limited to retained source/tool, bounded finite-analysis, "
            "trace, rendered-review, and Designer evidence. Deferred claims remain deferred."
        ),
    }


def write_accepted_provenance(
    run_dir: Path,
    source: Path,
    config: dict[str, Any],
    accepted_at: str,
    upstream_seed_path: str,
    upstream_seed_hash: str,
) -> None:
    artifacts = {
        "seed": "seed.md",
        "system_abstract": "system-abstract.md",
        "design_selection": "design-selection.md",
        "canonical_source": source.relative_to(run_dir).as_posix(),
        "metrics": "metrics.json",
        "bounded_analyzer": "validation/bounded-analysis.mjs",
        "bounded_result": "validation/contract-coverage.json",
        "visualization_svg": "visualization/system-overview.svg",
        "visualization_sidecar": "visualization/system-overview.svg.json",
    }
    missing = [relative for relative in artifacts.values() if not (run_dir / relative).is_file()]
    if missing:
        raise HarnessError(f"accepted retention is missing required artifacts: {missing}")
    write_json(
        run_dir / "provenance.json",
        {
            "schema_version": 2,
            "run_id": config.get("run_id"),
            "accepted_at": accepted_at,
            "generator": {
                key: config.get(key)
                for key in (
                    "campaign_id",
                    "family_id",
                    "complexity",
                    "replicate",
                    "attempt",
                    "model",
                    "reasoning_effort",
                )
            },
            "upstream_seed_source": {
                "path": upstream_seed_path,
                "sha256": upstream_seed_hash,
            },
            "artifacts": {
                name: {
                    "path": relative,
                    "sha256": sha256_file(run_dir / relative),
                }
                for name, relative in artifacts.items()
            },
            "presentation_state": {
                "path": "model/.sysmlviz/views.json",
                "mutable": True,
                "role": (
                    "Reproduction input; the accepted immutable rendering is "
                    "visualization/system-overview.svg"
                ),
            },
            "claim_boundary": (
                "Acceptance is limited to retained source/tool, bounded finite-analysis, "
                "trace, rendered-review, and Designer evidence. Deferred claims remain deferred."
            ),
        },
    )


def accepted_retention_preflight(
    run_dir: Path, source_name: str, *, require_status: bool = True
) -> set[str]:
    source = (run_dir / source_name).resolve()
    model_root = (run_dir / "model").resolve()
    if not source.is_file() or source.parent != model_root:
        raise HarnessError("accepted status names an invalid canonical source")
    keep = set(ACCEPTED_RETENTION_FILES)
    keep.add(source.relative_to(run_dir.resolve()).as_posix())
    required = keep if require_status else keep - {"status.json"}
    missing = sorted(
        relative for relative in required if not (run_dir / relative).is_file()
    )
    if missing:
        raise HarnessError(f"accepted retention preflight failed; missing: {missing}")
    return keep


def compact_accepted_run(run_dir: Path) -> bool:
    """Prune a closed accepted run to accepted-run-minimal-v1."""
    status = read_json(run_dir / "status.json")
    if status.get("status") != "accepted" or status.get("terminal") is not True:
        return False
    source_name = status.get("source")
    if not isinstance(source_name, str):
        raise HarnessError("accepted status lacks a canonical source path")
    keep = accepted_retention_preflight(run_dir, source_name)

    for path in sorted(run_dir.rglob("*"), key=lambda item: len(item.parts), reverse=True):
        relative = path.relative_to(run_dir).as_posix()
        if path.is_symlink() or path.is_file():
            if relative not in keep:
                path.unlink()
        elif path.is_dir():
            try:
                path.rmdir()
            except OSError:
                pass
    return True


def write_closure(
    run_dir: Path,
    run_id: str,
    seed: Path,
    source: Path | None,
    source_hash: str | None,
    final_status: str,
    decisions: dict[str, dict[str, Any]],
    stage_usage: dict[str, dict[str, int]],
    model: str,
    metadata: dict[str, Any] | None,
    reason: str,
    checkpoint_stage: str | None = None,
) -> None:
    config = read_json(run_dir / "run-config.json")
    minimal_acceptance = final_status == "accepted"
    terminal = final_status not in RESUMABLE_STATUSES
    completed_at = utc_now() if terminal else None
    checkpointed_at = utc_now() if not terminal else None

    upstream_seed_path_value = str(
        config.get("seed_source") if config.get("seed_generated") else config.get("seed")
    )
    upstream_seed_path = relative_path(
        resolve_relative_path(upstream_seed_path_value, Path.cwd())
    )
    upstream_seed_hash = str(
        config.get("seed_source_sha256")
        if config.get("seed_generated")
        else config.get("seed_sha256")
    )
    if minimal_acceptance:
        if source is None or source_hash is None or completed_at is None:
            raise HarnessError("accepted retention requires a validated canonical source")
        sidecar = run_dir / "visualization" / "system-overview.svg.json"
        if metadata is None and sidecar.is_file():
            metadata = read_json(sidecar)
        if metadata is None:
            raise HarnessError("accepted retention requires visualization metadata")
        local_seed = run_dir / "seed.md"
        if seed.resolve() != local_seed.resolve():
            shutil.copy2(seed, local_seed)
        seed = local_seed
        config["seed"] = relative_path(local_seed)
        config["seed_sha256"] = sha256_file(local_seed)
        write_json(run_dir / "run-config.json", config)

    usage = build_usage_report(run_id, stage_usage, model)
    if minimal_acceptance and completed_at is not None:
        timing = accepted_run_timing(run_dir, completed_at)
        role_seconds = timing.pop("role_seconds")
        usage["timing"] = timing
        for agent in usage["agents"]:
            agent["wall_clock_seconds"] = role_seconds.get(agent["role"], 0.0)
    write_json(run_dir / "agent-token-usage.json", usage)
    if not minimal_acceptance:
        create_usage_svg(usage, run_dir / "agent-token-usage.svg")
        convert = shutil.which("convert")
        if convert:
            subprocess.run(
                [convert, "-background", "white", str(run_dir / "agent-token-usage.svg"), str(run_dir / "agent-token-usage.png")],
                stdout=subprocess.DEVNULL,
                stderr=subprocess.DEVNULL,
                check=False,
            )

        sequence = []
        if "seed-generate" in decisions:
            sequence.append({"step": 1, "role": "seed", "artifact": "seed.md", "decision": decisions.get("seed-generate")})
        sequence.extend(
            [
                {"step": len(sequence) + 1, "role": "designer", "artifact": "system-abstract.initial.md", "decision": decisions.get("designer-initial")},
                {"step": len(sequence) + 2, "role": "model", "artifact": "interactions/01-model-review.md", "decision": decisions.get("model-review")},
                {"step": len(sequence) + 3, "role": "designer", "artifact": "interactions/02-designer-resolution.md", "decision": decisions.get("designer-resolution")},
            ]
        )
        sequence.append({"step": len(sequence) + 1, "role": "model", "artifact": "interactions/03-model-report.md", "decision": decisions.get("model-generate")})
        sequence.append({"step": len(sequence) + 1, "role": "designer", "artifact": "interactions/04-designer-final.md", "decision": decisions.get("designer-final")})
        write_json(
            run_dir / "designer-model-interaction.json",
            {"schema_version": 1, "run_id": run_id, "sequence": sequence},
        )

    health = metadata.get("diagramHealth", {}) if metadata else {}
    if minimal_acceptance:
        assert source is not None and source_hash is not None and metadata is not None
        verification = accepted_verification_report(
            run_dir, run_id, source, source_hash, decisions, metadata, reason
        )
    else:
        verification = {
            "run_id": run_id,
            "terminal_status": final_status,
            "source": source.relative_to(run_dir).as_posix() if source else None,
            "source_sha256": source_hash,
            "checks": {
                "architecture_tipe": "passed" if source else "not-run",
                "final_tipe": "passed" if source else "not-run",
                "bounded_analysis": "passed" if (run_dir / "validation" / "contract-coverage.json").is_file() else "not-run",
                "traceability": "passed" if (run_dir / "traceability.json").is_file() else "not-run",
                "visualization": decisions.get("visualize", {}).get("disposition", "not-run"),
                "designer_validation": decisions.get("designer-final", {}).get("disposition", "not-run"),
            },
            "diagram_health": health,
            "reason": reason,
            "claim_boundary": "Acceptance is limited to retained source/tool, bounded finite-analysis, trace, rendered-review, and Designer evidence. Deferred claims remain deferred.",
        }
    write_json(run_dir / "verification-report.json", verification)

    model_link = source.relative_to(run_dir).as_posix() if source else "not produced"
    designer_disposition = decisions.get("designer-final", {}).get("disposition")
    semantic_status = (
        "passed"
        if source is not None and designer_disposition == "accepted"
        else "failed"
        if designer_disposition == "designer-rejected"
        else "validated-pending-adjudication"
        if source is not None
        else "not-run"
    )
    visualization_status = (
        "passed"
        if decisions.get("visualize", {}).get("disposition") == "accepted"
        and metadata is not None
        else "failed"
        if decisions.get("visualize", {}).get("disposition") == "semantic-defect"
        else "pending"
        if decisions.get("visualize")
        else "not-run"
    )
    if not minimal_acceptance:
        summary = f"""# LLM-first run summary

Run: `{run_id}`  
Seed: `{seed.name}`  
Status: **`{final_status}`**

Terminal: **`{str(terminal).lower()}`**

## Review first

Canonical model: [`{model_link}`]({model_link})  
Source SHA-256: `{source_hash or 'not available'}`

Reason: {reason}

The complete Designer–Model exchange is summarized in
[`designer-model-interaction.json`](designer-model-interaction.json). Mechanical
closure evidence is in [`verification-report.json`](verification-report.json),
and token usage is in [`agent-token-usage.json`](agent-token-usage.json).

This run does not infer code-generation, execution, physical-performance,
production-suitability, solver-proof, or safety-certification claims unless an
artifact explicitly and validly establishes one.
"""
        (run_dir / "RUN_SUMMARY.md").write_text(summary, encoding="utf-8")

    if minimal_acceptance:
        assert source is not None and completed_at is not None
        write_accepted_provenance(
            run_dir,
            source,
            config,
            completed_at,
            upstream_seed_path,
            upstream_seed_hash,
        )
        # Validate the complete retained package before publishing accepted status.
        accepted_retention_preflight(
            run_dir,
            source.relative_to(run_dir).as_posix(),
            require_status=False,
        )

    status = {
        "run_id": run_id,
        "status": final_status,
        "terminal": terminal,
        "completed_at": completed_at,
        "checkpointed_at": checkpointed_at,
        "checkpoint_stage": checkpoint_stage,
        "semantic_status": semantic_status,
        "visualization_status": visualization_status,
        "dataset_ready": final_status == "accepted",
        "source": model_link if source else None,
        "source_sha256": source_hash,
        "reason": reason,
    }
    if not terminal:
        status["repair_progress_fingerprint"] = repair_progress_fingerprint(run_dir)
    write_json(run_dir / "status.json", status)
    if minimal_acceptance:
        compact_accepted_run(run_dir)


def markdown_h2_section(text: str, title: str) -> str:
    headings = list(
        re.finditer(rf"(?im)^##[ \t]+{re.escape(title)}[ \t]*$", text)
    )
    if len(headings) != 1:
        raise HarnessError(
            f"generated seed must contain exactly one '## {title}' section"
        )
    start = headings[0].end()
    following = re.search(r"(?m)^##[ \t]+", text[start:])
    end = start + following.start() if following else len(text)
    return text[start:end]


def validate_seed_realizability_audit(
    text: str, complexity: str
) -> dict[str, Any]:
    """Check the machine-readable shell of the Seed Agent's semantic audit."""
    if complexity not in COMPLEXITY_PROFILES:
        raise HarnessError(
            "generated seed must declare a recognized small, medium, or hard complexity"
        )

    audit = markdown_h2_section(text, "Pre-freeze realizability audit")
    for audit_id in ("AUDIT-OWNERS", "AUDIT-PARTITIONS"):
        records = re.findall(
            rf"(?im)^{audit_id}:[ \t]*passed[ \t]+-[ \t]+\S.*$", audit
        )
        if len(records) != 1:
            raise HarnessError(
                f"generated seed must contain one substantive '{audit_id}: passed - ...' record"
            )

    interaction_audits = re.findall(
        r"(?im)^AUDIT-INTERACTIONS:[ \t]*passed[ \t]+-[ \t]+recounted[ \t]+(\d+)(?:[ \t]+.*)?$",
        audit,
    )
    if len(interaction_audits) != 1:
        raise HarnessError(
            "generated seed must contain one 'AUDIT-INTERACTIONS: passed - recounted N' record"
        )

    inventory = markdown_h2_section(text, "Exact interaction inventory")
    interaction_lines = [
        line.strip() for line in inventory.splitlines() if line.strip().startswith("INT-")
    ]
    inventory_id_mentions = re.findall(r"(?i)\bINT-\d{2}:", inventory)
    if len(inventory_id_mentions) != len(interaction_lines):
        raise HarnessError(
            "every INT entry in the exact interaction inventory must begin its own unbulleted line"
        )
    parsed: list[tuple[int, str]] = []
    syntax = re.compile(
        r"^INT-(\d{2}):[ \t]*"
        r"[A-Za-z][A-Za-z0-9_-]*\.[A-Za-z][A-Za-z0-9_-]*[ \t]*"
        r"->[ \t]*"
        r"[A-Za-z][A-Za-z0-9_-]*\.[A-Za-z][A-Za-z0-9_-]*[ \t]*"
        r":[ \t]*\S.*$"
    )
    for line in interaction_lines:
        match = syntax.fullmatch(line)
        if match is None:
            raise HarnessError(
                "interaction inventory entries must use 'INT-01: owner.value -> owner.value : FiniteDomain'"
            )
        parsed.append((int(match.group(1)), line))

    numbers = [number for number, _ in parsed]
    if numbers != list(range(1, len(numbers) + 1)):
        raise HarnessError(
            "interaction inventory IDs must be unique and consecutive from INT-01"
        )
    low, high = COMPLEXITY_PROFILES[complexity]["semantic_interactions"]
    if not low <= len(parsed) <= high:
        raise HarnessError(
            f"exact interaction inventory has {len(parsed)} entries; {complexity} requires {low}..{high}"
        )
    recounted = int(interaction_audits[0])
    if recounted != len(parsed):
        raise HarnessError(
            f"interaction audit recount says {recounted}, but the exact inventory has {len(parsed)} entries"
        )
    return {
        "status": "passed",
        "semantic_interactions": len(parsed),
        "bounds": [low, high],
        "interaction_ids": [f"INT-{number:02d}" for number in numbers],
        "semantic_review_owner": "seed-agent",
    }


def validate_generated_seed(
    seed: Path, source: Path, expected_complexity: str | None = None
) -> dict[str, Any]:
    try:
        text = seed.read_text(encoding="utf-8")
    except (OSError, UnicodeError) as exc:
        raise HarnessError(f"generated seed is missing or unreadable: {seed}: {exc}") from exc
    try:
        metadata = parse_front_matter(text)
    except HarnessError as exc:
        raise HarnessError(f"generated seed has invalid YAML front matter: {exc}") from exc
    if metadata.get("status") != "frozen" or metadata.get("version") != "1":
        raise HarnessError("generated seed must declare version: 1 and status: frozen")
    if not metadata.get("seed_id"):
        raise HarnessError("generated seed must declare a seed_id")
    complexity = expected_complexity or metadata.get("complexity")
    if complexity not in COMPLEXITY_PROFILES:
        raise HarnessError(
            "generated seed must declare a recognized small, medium, or hard complexity"
        )
    if expected_complexity is not None and metadata.get("complexity") != expected_complexity:
        raise HarnessError(
            f"generated seed complexity must be {expected_complexity!r}, got {metadata.get('complexity')!r}"
        )
    advisories: list[str] = []
    if not 1200 <= len(text) <= 12000:
        advisories.append(
            f"seed length {len(text)} is outside the advisory 1200..12000 character range"
        )
    prefixes = ("NEED", "PURPOSE", "STAKE", "CTX", "MON", "CTRL", "REQ", "SCN", "ASM", "EXCL")
    missing = [prefix for prefix in prefixes if not re.search(rf"(?m)^{prefix}-\d+:\s*\S", text)]
    if missing:
        raise HarnessError(f"generated seed is missing identifier classes: {missing}")
    headings = "\n".join(re.findall(r"(?im)^#{1,3}\s+(.+)$", text)).lower()
    heading_concepts = {
        "source basis": ("source basis", "source provenance"),
        "design consideration": (
            "design consideration",
            "design alternative",
            "architecture and composition",
        ),
        "structural bounds": (
            "structural",
            "calibration",
            "architecture and composition",
        ),
        "claim boundary": ("claim boundary", "exclusions"),
    }
    missing_concepts = [
        concept
        for concept, aliases in heading_concepts.items()
        if not any(alias in headings for alias in aliases)
    ]
    if missing_concepts:
        advisories.append(
            "noncanonical or missing seed headings: " + ", ".join(missing_concepts)
        )
    if re.search(r'(?im)^\s*(?:package\s+\w+|part\s+def\b|language\s+"GUMBO")', text):
        raise HarnessError("generated seed contains forbidden SysML/GUMBO source")
    realizability_audit = validate_seed_realizability_audit(text, complexity)
    report = {
        "schema_version": 1,
        "status": "passed",
        "seed": relative_path(seed),
        "seed_sha256": sha256_file(seed),
        "source": relative_path(source),
        "source_sha256": sha256_file(source),
        "identifier_classes": list(prefixes),
        "complexity": complexity,
        "realizability_audit": realizability_audit,
        "advisories": advisories,
    }
    return report


def validate_reusable_seed(seed: Path, source: Path) -> dict[str, Any]:
    """Validate a tier-neutral seed generated once for reuse by campaign cells."""
    try:
        text = seed.read_text(encoding="utf-8")
    except (OSError, UnicodeError) as exc:
        raise HarnessError(f"generated seed is missing or unreadable: {seed}: {exc}") from exc
    try:
        metadata = parse_front_matter(text)
    except HarnessError as exc:
        raise HarnessError(f"generated seed has invalid YAML front matter: {exc}") from exc
    if metadata.get("status") != "frozen" or metadata.get("version") != "1":
        raise HarnessError("reusable seed must declare version: 1 and status: frozen")
    if not metadata.get("seed_id"):
        raise HarnessError("reusable seed must declare a seed_id")
    if metadata.get("scope") != "reusable":
        raise HarnessError("reusable seed must declare scope: reusable")
    if "complexity" in metadata:
        raise HarnessError("reusable seed must not declare a complexity tier")
    allowed_metadata = {"seed_id", "version", "status", "scope"}
    unexpected_metadata = sorted(set(metadata) - allowed_metadata)
    if unexpected_metadata:
        raise HarnessError(
            f"reusable seed has unsupported front-matter keys: {unexpected_metadata}"
        )
    if re.search(r"(?im)^\s*(?:package\s+\w+|part\s+def\b|language\s+\"GUMBO)", text):
        raise HarnessError("generated seed contains forbidden SysML/GUMBO source")
    if re.search(r"(?im)^\s*INT-\d+\s*:", text) or "## Exact interaction inventory" in text:
        raise HarnessError("reusable seed must leave exact interactions to the Designer")
    if re.search(r"(?im)^\s*AUDIT-(?:OWNERS|PARTITIONS|INTERACTIONS)\s*:", text):
        raise HarnessError("reusable seed must leave owner/partition audits to the Designer")
    if re.search(
        r"(?im)^\s*(?:NEED|PURPOSE|STAKE|CTX|MON|CTRL|REQ|SCN|ASM|EXCL)-\d+\s*:",
        text,
    ):
        raise HarnessError("minimal reusable seed must not create a trace-ID taxonomy")
    required_headings = [
        "Source basis",
        "Domain and purpose",
        "Available design vocabulary",
        "Candidate system scopes",
        "Source limitations and claim boundary",
    ]
    actual_headings = re.findall(r"(?m)^##\s+(.+?)\s*$", text)
    if actual_headings != required_headings:
        raise HarnessError(
            "minimal reusable seed must contain exactly the five canonical headings in order"
        )
    if not re.search(r"(?i)\b[0-9a-f]{40}\b", text) or ".sysml" not in text:
        raise HarnessError("reusable seed source basis must name a pinned revision and SysML file")
    scopes = re.search(
        r"(?ms)^## Candidate system scopes\s*$\n(.*?)^## Source limitations and claim boundary\s*$",
        text,
    )
    if scopes is None or len(re.findall(r"(?m)^-\s+\S", scopes.group(1))) < 3:
        raise HarnessError("reusable seed must offer at least three alternative system scopes")
    advisories: list[str] = []
    if not 800 <= len(text) <= 6000:
        advisories.append(
            f"seed length {len(text)} is outside the advisory 800..6000 character range"
        )
    return {
        "schema_version": 1,
        "status": "passed",
        "scope": "reusable",
        "seed": relative_path(seed),
        "seed_sha256": sha256_file(seed),
        "source": relative_path(source),
        "source_sha256": sha256_file(source),
        "advisories": advisories,
    }


def new_seeded_run(args: argparse.Namespace, paths: Paths) -> tuple[Path, str, Path, Path]:
    source = Path(args.seed_source).resolve()
    source_root = paths.experiment / "seeds" / "sources"
    if not source.is_file() or source_root not in source.parents:
        raise HarnessError("--seed-source must be a file under cps48/seeds/sources")
    if paths.corpus is None or not paths.corpus.is_dir():
        raise HarnessError("external/sysml-v2-models corpus is unavailable")
    run_id = f"{run_stamp()}-{slug(args.label or source.stem)}"
    configured_parent = getattr(args, "run_parent", None)
    run_parent = (
        Path(configured_parent).expanduser()
        if configured_parent
        else paths.runs / "seed-generations"
    )
    if not run_parent.is_absolute():
        run_parent = paths.workspace / run_parent
    run_parent = run_parent.resolve()
    run_parent.mkdir(parents=True, exist_ok=True)
    run_dir = run_parent / run_id
    run_dir.mkdir(parents=False, exist_ok=False)
    for name in (
        "prompts",
        "responses",
        "events",
        "decisions",
        "interactions",
        "model",
        "validation",
        "visualization",
        "evaluation",
        "iterations",
    ):
        (run_dir / name).mkdir()
    seed = run_dir / "seed.md"
    publish_seed = getattr(args, "publish_seed", None)
    publish_seed_target = (
        relative_path(
            resolve_relative_path(str(publish_seed), paths.workspace),
            paths.workspace,
        )
        if publish_seed
        else None
    )
    write_json(run_dir / "status.json", {"run_id": run_id, "status": "in-progress", "terminal": False})
    write_json(
        run_dir / "run-config.json",
        {
            "run_id": run_id,
            "seed": relative_path(seed, paths.workspace),
            "seed_sha256": None,
            "seed_generated": True,
            "seed_source": relative_path(source, paths.workspace),
            "seed_source_sha256": sha256_file(source),
            "model": args.model,
            "reasoning_effort": args.reasoning_effort,
            "campaign_id": args.campaign_id,
            "family_id": args.family_id,
            "complexity": None,
            "seed_scope": "reusable",
            "publish_seed_target": publish_seed_target,
            "replicate": args.replicate,
            "attempt": args.attempt,
            "sysml_viz_port": args.sysml_viz_port,
            "run_parent": relative_path(run_parent, paths.workspace),
            "created_at": utc_now(),
        },
    )
    tier_policy = (
        "Seed-only generation: no complexity tier is selected and no synthesis stages run."
        if args.seed_source
        else f"Declared complexity is `{args.complexity}` with these calibrated bounds:\n\n{complexity_spec(args.complexity)}"
    )
    policy = f"""# Reusable seed preparation policy

- Seed source brief: `{relative_path(source, paths.workspace)}` (`{sha256_file(source)}`)
- The Seed Agent writes and freezes one reusable `seed.md`.
- No Designer, Model, or Visualization stage runs in this job.
- {tier_policy}
- Campaign cell: `{args.campaign_id or 'standalone'}` / `{args.family_id or source.stem}` /
  replicate `{args.replicate}` / attempt `{args.attempt}`.
- Visualization server port: `{args.sysml_viz_port}`.
- Downstream stages and gates are unchanged from the standard three-agent
  synthesis workflow.
- Agents may write only their stage-owned run artifacts.
- Upstream corpus: `{relative_path(paths.corpus, paths.workspace)}` at pinned submodule state.
"""
    (run_dir / "run-policy.md").write_text(policy, encoding="utf-8")
    append_jsonl(run_dir / "journal.jsonl", {"event": "seeded-run-created", "run_id": run_id, "at": utc_now()})
    return run_dir, run_id, source, seed


def freeze_generated_seed(run_dir: Path, seed: Path, source: Path) -> None:
    config = read_json(run_dir / "run-config.json")
    reusable = config.get("seed_scope") == "reusable"
    complexity = str(config.get("complexity", "medium"))
    report = (
        validate_reusable_seed(seed, source)
        if reusable
        else validate_generated_seed(seed, source, complexity)
    )
    write_json(run_dir / "evaluation" / "seed-validation.json", report)
    config["seed_sha256"] = report["seed_sha256"]
    config["seed_frozen_at"] = utc_now()
    write_json(run_dir / "run-config.json", config)
    policy = f"""# Reusable seed preparation policy

- Frozen seed: `{relative_path(seed)}` (`{report['seed_sha256']}`)
- Stateless role: Seed only. This is not a synthesis run.
- Later three-agent synthesis runs use the published frozen seed and do not
  inspect upstream corpus or seed-generation prompts/events.
- Seed scope: `{'reusable and complexity-neutral' if reusable else complexity}`.
{'' if reusable else complexity_spec(complexity)}
- Similarity to prior experiments is complexity only,
  not topology, requirements, or policy.
- Visualization server port: `{config.get('sysml_viz_port', 4782)}`.
- Repair and presentation cycles are evidence-driven, not budget-limited;
  repeated no-progress diagnostics create a resumable checkpoint.
- Canonical source must pass retained architecture/final gates and an
  independent harness Sireum gate.
- Model Agent retains a deterministic bounded analyzer; the harness executes it.
- Exactly one named `system-overview` is reviewed at native resolution.
- Agents may write only their stage-owned run artifacts.
"""
    (run_dir / "run-policy.md").write_text(policy, encoding="utf-8")
    append_jsonl(
        run_dir / "journal.jsonl",
        {"event": "generated-seed-frozen", "at": utc_now(), "seed_sha256": report["seed_sha256"]},
    )


def new_run(args: argparse.Namespace, paths: Paths) -> tuple[Path, str, Path]:
    seed = Path(args.seed).resolve()
    seed_root = (paths.experiment / "seeds").resolve()
    if not seed.is_file():
        raise HarnessError(f"seed does not exist: {seed}")
    if seed_root not in seed.parents:
        raise HarnessError("seed must be inside cps48/seeds")
    diversity_card_text = ""
    diversity_card_source = None
    if args.diversity_card:
        diversity_card_path = Path(args.diversity_card).resolve()
        if not diversity_card_path.is_file():
            raise HarnessError(f"diversity card does not exist: {diversity_card_path}")
        if paths.experiment not in diversity_card_path.parents:
            raise HarnessError("diversity card must be inside cps48")
        diversity_card_text = diversity_card_path.read_text(encoding="utf-8")
        diversity_card_source = relative_path(diversity_card_path, paths.workspace)
    run_id = f"{run_stamp()}-{slug(args.label or seed.stem)}"
    configured_parent = getattr(args, "run_parent", None)
    run_parent = Path(configured_parent).expanduser() if configured_parent else paths.runs
    if not run_parent.is_absolute():
        run_parent = paths.workspace / run_parent
    run_parent = run_parent.resolve()
    run_parent.mkdir(parents=True, exist_ok=True)
    run_dir = run_parent / run_id
    run_dir.mkdir(parents=False, exist_ok=False)
    for name in (
        "prompts",
        "responses",
        "events",
        "decisions",
        "interactions",
        "model",
        "validation",
        "visualization",
        "evaluation",
        "iterations",
    ):
        (run_dir / name).mkdir()
    write_json(run_dir / "status.json", {"run_id": run_id, "status": "in-progress", "terminal": False})
    config = {
        "run_id": run_id,
        "seed": relative_path(seed, paths.workspace),
        "seed_sha256": sha256_file(seed),
        "model": args.model,
        "reasoning_effort": args.reasoning_effort,
        "seed_generated": False,
        "campaign_id": args.campaign_id,
        "family_id": args.family_id,
        "complexity": args.complexity,
        "replicate": args.replicate,
        "attempt": args.attempt,
        "sysml_viz_port": args.sysml_viz_port,
        "run_parent": relative_path(run_parent, paths.workspace),
        "created_at": utc_now(),
        "diversity_card": diversity_card_text or None,
        "diversity_card_source": diversity_card_source,
        "diversity_card_sha256": (
            hashlib.sha256(diversity_card_text.encode("utf-8")).hexdigest()
            if diversity_card_text else None
        ),
    }
    write_json(run_dir / "run-config.json", config)
    policy = f"""# Automated three-agent synthesis run policy

- Frozen seed: `{relative_path(seed, paths.workspace)}` (`{config['seed_sha256']}`)
- Core roles: Designer, Model, Visualization.
- Stateless role stages: Designer initial; Model review; Designer resolution; Model generation; Visualization; Designer final.
- Seed generation is complete outside this run and its cost is not duplicated
  in this run's usage accounting.
- Repair and presentation cycles are evidence-driven, not budget-limited;
  repeated no-progress diagnostics create a resumable checkpoint.
- Canonical source must pass retained architecture/final gates and an
  independent harness Sireum gate.
- Model Agent retains a deterministic bounded analyzer; the harness executes it.
- Exactly one named `system-overview` is reviewed at native resolution.
- Agents may write only their stage-owned run artifacts.
- A terminal run is never resumed or modified.
- Trusted syntax: `{relative_path(paths.trusted, paths.workspace)}`
- SysML-AADL library: `{relative_path(paths.library, paths.workspace)}`
- Visualization tooling: `{relative_path(paths.sysml_viz, paths.workspace)}`
"""
    (run_dir / "run-policy.md").write_text(policy, encoding="utf-8")
    append_jsonl(run_dir / "journal.jsonl", {"event": "run-created", "run_id": run_id, "at": utc_now()})
    return run_dir, run_id, seed


def resume_run(
    args: argparse.Namespace, paths: Paths
) -> tuple[Path, str, Path, dict[str, dict[str, Any]], dict[str, dict[str, int]], int]:
    run_dir = Path(args.resume_run).resolve()
    if not run_dir.is_dir():
        raise HarnessError("--resume-run must name an existing run directory")
    config = read_json(run_dir / "run-config.json")
    recorded_parent = config.get("run_parent")
    legacy_parents = {
        paths.runs.resolve(),
        (paths.runs / "seed-generations").resolve(),
    }
    if recorded_parent:
        if resolve_relative_path(str(recorded_parent), paths.workspace) != run_dir.parent:
            raise HarnessError("resumed run is not under its recorded run parent")
    elif run_dir.parent not in legacy_parents:
        raise HarnessError(
            "legacy --resume-run must be under synthesizer/runs or synthesizer/runs/seed-generations"
        )
    requested_parent = getattr(args, "run_parent", None)
    if requested_parent:
        parent = Path(requested_parent).expanduser()
        if not parent.is_absolute():
            parent = paths.workspace / parent
        if parent.resolve() != run_dir.parent:
            raise HarnessError("--run-parent does not match the resumed run")
    status = read_json(run_dir / "status.json")
    if status.get("terminal") or status.get("status") not in RESUMABLE_STATUSES:
        raise HarnessError("only a nonterminal in-progress or checkpointed run may be resumed")
    run_id = str(config.get("run_id", ""))
    seed = resolve_relative_path(str(config.get("seed", "")), paths.workspace)
    seed_unfrozen = bool(config.get("seed_generated")) and not config.get(
        "seed_sha256"
    )
    if not run_id or (
        not seed_unfrozen
        and (not seed.is_file() or sha256_file(seed) != config.get("seed_sha256"))
    ):
        raise HarnessError("resumed run has an invalid or changed seed/configuration")
    if args.model != config.get("model") or args.reasoning_effort != config.get("reasoning_effort"):
        raise HarnessError("resume model and reasoning effort must match the frozen run configuration")

    usage_path = run_dir / "stage-usage.json"
    stage_usage = read_json(usage_path) if usage_path.is_file() else {}
    decisions: dict[str, dict[str, Any]] = {}
    if seed_unfrozen:
        append_jsonl(
            run_dir / "journal.jsonl",
            {"event": "run-resumed", "at": utc_now(), "next_stage": SEED_STAGE.name},
        )
        return run_dir, run_id, seed, decisions, stage_usage, -1
    seed_decision_path = run_dir / SEED_STAGE.decision
    if config.get("seed_generated") and seed_decision_path.is_file():
        decisions[SEED_STAGE.name] = validate_decision(seed_decision_path, SEED_STAGE.dispositions)
    stages = STAGES
    checkpoint_stage = status.get("checkpoint_stage")
    completed = 0
    for stage in stages:
        if stage.name == checkpoint_stage:
            break
        decision_path = run_dir / stage.decision
        if not decision_path.is_file() or stage.name not in stage_usage:
            break
        decision = validate_decision(decision_path, stage.dispositions)
        if terminal_status_for_failure(stage.name, decision):
            raise HarnessError("a rejected stage cannot be resumed")
        decisions[stage.name] = decision
        completed += 1
    if completed == len(stages):
        raise HarnessError("all stages are already complete; close or inspect the run instead")
    append_jsonl(
        run_dir / "journal.jsonl",
        {"event": "run-resumed", "at": utc_now(), "next_stage": stages[completed].name},
    )
    return run_dir, run_id, seed, decisions, stage_usage, completed


def generate_seed_until_valid(
    args: argparse.Namespace,
    paths: Paths,
    run_dir: Path,
    run_id: str,
    seed_source: Path,
    seed: Path,
    decisions: dict[str, dict[str, Any]],
    stage_usage: dict[str, dict[str, int]],
) -> None:
    feedback_path = run_dir / "evaluation" / "seed-validation-feedback.md"
    last_seed_diagnostic: str | None = None
    if feedback_path.is_file():
        feedback = feedback_path.read_text(encoding="utf-8")
        marker = "Repair this mechanical defect in place:\n\n"
        if marker in feedback:
            last_seed_diagnostic = feedback.split(marker, 1)[1].strip()
    while True:
        print(f"[{run_id}] {SEED_STAGE.name}: starting", flush=True)
        decision, usage = run_agent_stage(
            args, paths, run_dir, run_id, seed_source, SEED_STAGE
        )
        decisions[SEED_STAGE.name] = decision
        record_stage_usage(stage_usage, SEED_STAGE.name, usage)
        write_json(run_dir / "stage-usage.json", stage_usage)
        disposition = decision.get("disposition", decision.get("status"))
        print(
            f"[{run_id}] {SEED_STAGE.name}: {disposition} "
            f"({usage['total_tokens']} tokens)",
            flush=True,
        )
        repair_stage = repair_stage_for_failure(SEED_STAGE.name, decision)
        if repair_stage:
            raise OperationalCheckpoint(
                repair_stage,
                "Seed Agent requested repair: "
                + str(decision.get("summary", "seed generation needs revision")),
            )
        try:
            freeze_generated_seed(run_dir, seed, seed_source)
            feedback_path.unlink(missing_ok=True)
            return
        except HarnessError as exc:
            diagnostic = str(exc)
            feedback_path.write_text(
                "# Seed validation feedback\n\n"
                f"Repair this mechanical defect in place:\n\n{diagnostic}\n",
                encoding="utf-8",
            )
            if diagnostic == last_seed_diagnostic:
                raise OperationalCheckpoint(
                    SEED_STAGE.name,
                    "seed repair repeated the same validation diagnostic",
                ) from exc
            last_seed_diagnostic = diagnostic


def publish_reusable_seed(
    args: argparse.Namespace,
    paths: Paths,
    run_dir: Path,
    run_id: str,
    seed: Path,
    stage_usage: dict[str, dict[str, int]],
) -> None:
    config = read_json(run_dir / "run-config.json")
    publish_target = getattr(args, "publish_seed", None) or config.get(
        "publish_seed_target"
    )
    if not publish_target:
        raise HarnessError("--seed-only requires --publish-seed")
    target = resolve_relative_path(str(publish_target), paths.workspace)
    seed_root = (paths.experiment / "seeds").resolve()
    if target.parent != seed_root or target.suffix.lower() != ".md":
        raise HarnessError("--publish-seed must be a Markdown file directly under cps48/seeds")
    if target.exists() and target.read_bytes() != seed.read_bytes():
        raise HarnessError(f"refusing to overwrite different published seed: {target}")
    target.parent.mkdir(parents=True, exist_ok=True)
    if not target.exists():
        temporary = target.with_suffix(target.suffix + ".tmp")
        shutil.copy2(seed, temporary)
        temporary.replace(target)
    published_hash = sha256_file(target)
    config["published_seed"] = relative_path(target, paths.workspace)
    config["published_seed_sha256"] = published_hash
    write_json(run_dir / "run-config.json", config)
    completed_at = utc_now()
    usage_report = build_usage_report(run_id, stage_usage, args.model)
    usage_report["agents"] = [
        agent for agent in usage_report["agents"] if agent.get("stages")
    ]
    usage_report["aggregate"]["agent_count"] = len(usage_report["agents"])
    timing = accepted_run_timing(run_dir, completed_at)
    role_seconds = timing.pop("role_seconds")
    usage_report["timing"] = timing
    for agent in usage_report["agents"]:
        agent["wall_clock_seconds"] = role_seconds.get(agent["role"], 0.0)
    write_json(run_dir / "agent-token-usage.json", usage_report)
    write_json(
        run_dir / "status.json",
        {
            "run_id": run_id,
            "status": "seed-ready",
            "terminal": True,
            "completed_at": completed_at,
            "dataset_ready": False,
            "published_seed": relative_path(target, paths.workspace),
            "published_seed_sha256": published_hash,
            "reason": "Reusable complexity-neutral seed generated, validated, and published; no synthesis stages ran.",
        },
    )
    append_jsonl(
        run_dir / "journal.jsonl",
        {
            "event": "reusable-seed-published",
            "at": utc_now(),
            "path": relative_path(target, paths.workspace),
            "sha256": published_hash,
        },
    )
    compact_seed_generation(run_dir)


def compact_seed_generation(run_dir: Path) -> None:
    """Retain only the evidence needed to review and account for a seed-only run."""
    retained = {
        "agent-token-usage.json",
        "decisions/seed-generation.json",
        "evaluation/seed-validation.json",
        "run-config.json",
        "seed.md",
        "status.json",
    }
    for path in sorted(run_dir.rglob("*"), reverse=True):
        relative = path.relative_to(run_dir).as_posix()
        if path.is_file() and relative not in retained:
            path.unlink()
        elif path.is_dir():
            try:
                path.rmdir()
            except OSError:
                pass


def execute(args: argparse.Namespace) -> Path:
    paths = discover_paths()
    # A seed source always selects the separate preparation workflow. Synthesis
    # is selected only by supplying an already-frozen --seed.
    seed_only = bool(args.seed_source)
    publish_seed = getattr(args, "publish_seed", None)
    if getattr(args, "seed_only", False) and not args.seed_source:
        raise HarnessError("--seed-only is valid only with --seed-source")
    if args.seed_source and not publish_seed:
        raise HarnessError("--seed-source requires the reusable seed destination --publish-seed")
    if publish_seed and not args.seed_source:
        raise HarnessError("--publish-seed is valid only with --seed-source")
    if args.seed_source:
        run_dir, run_id, seed_source, seed = new_seeded_run(args, paths)
        decisions = {}
        stage_usage = {}
        start_index = 0
        try:
            generate_seed_until_valid(
                args,
                paths,
                run_dir,
                run_id,
                seed_source,
                seed,
                decisions,
                stage_usage,
            )
            if seed_only:
                publish_reusable_seed(
                    args, paths, run_dir, run_id, seed, stage_usage
                )
                print(f"[{run_id}] status: seed-ready", flush=True)
                print(run_dir)
                return run_dir
        except OperationalCheckpoint as exc:
            if exc.usage:
                record_stage_usage(
                    stage_usage, SEED_STAGE.name, exc.usage, completed=False
                )
                write_json(run_dir / "stage-usage.json", stage_usage)
            reason = f"{type(exc).__name__}: {exc}"
            write_closure(
                run_dir,
                run_id,
                seed if seed.is_file() else seed_source,
                None,
                None,
                "incomplete",
                decisions,
                stage_usage,
                args.model,
                None,
                reason,
                checkpoint_stage=SEED_STAGE.name,
            )
            print(f"[{run_id}] checkpointed: {reason}", flush=True)
            print(run_dir)
            return run_dir
        except (GateRejected, HarnessError) as exc:
            reason = f"OperationalCheckpoint: {type(exc).__name__}: {exc}"
            append_jsonl(
                run_dir / "journal.jsonl",
                {"event": "seed-stage-checkpoint", "at": utc_now(), "status": "incomplete", "reason": reason},
            )
            write_closure(
                run_dir,
                run_id,
                seed if seed.is_file() else seed_source,
                None,
                None,
                "incomplete",
                decisions,
                stage_usage,
                args.model,
                None,
                reason,
                checkpoint_stage=SEED_STAGE.name,
            )
            print(f"[{run_id}] checkpointed: {reason}", flush=True)
            print(run_dir)
            return run_dir
    elif args.resume_run:
        run_dir, run_id, seed, decisions, stage_usage, start_index = resume_run(args, paths)
        if start_index == -1:
            config = read_json(run_dir / "run-config.json")
            seed_source = resolve_relative_path(
                str(config.get("seed_source", "")), paths.workspace
            )
            if not seed_source.is_file():
                raise HarnessError("checkpointed generated seed has no valid seed source")
            try:
                generate_seed_until_valid(
                    args,
                    paths,
                    run_dir,
                    run_id,
                    seed_source,
                    seed,
                    decisions,
                    stage_usage,
                )
                start_index = 0
                config = read_json(run_dir / "run-config.json")
                if config.get("seed_scope") == "reusable":
                    publish_reusable_seed(
                        args, paths, run_dir, run_id, seed, stage_usage
                    )
                    print(f"[{run_id}] status: seed-ready", flush=True)
                    print(run_dir)
                    return run_dir
            except OperationalCheckpoint as exc:
                if exc.usage:
                    record_stage_usage(
                        stage_usage, SEED_STAGE.name, exc.usage, completed=False
                    )
                    write_json(run_dir / "stage-usage.json", stage_usage)
                reason = f"{type(exc).__name__}: {exc}"
                write_closure(
                    run_dir,
                    run_id,
                    seed if seed.is_file() else seed_source,
                    None,
                    None,
                    "incomplete",
                    decisions,
                    stage_usage,
                    args.model,
                    None,
                    reason,
                    checkpoint_stage=SEED_STAGE.name,
                )
                print(f"[{run_id}] checkpointed: {reason}", flush=True)
                print(run_dir)
                return run_dir
            except (GateRejected, HarnessError) as exc:
                reason = f"OperationalCheckpoint: {type(exc).__name__}: {exc}"
                write_closure(
                    run_dir,
                    run_id,
                    seed if seed.is_file() else seed_source,
                    None,
                    None,
                    "incomplete",
                    decisions,
                    stage_usage,
                    args.model,
                    None,
                    reason,
                    checkpoint_stage=SEED_STAGE.name,
                )
                print(f"[{run_id}] checkpointed: {reason}", flush=True)
                print(run_dir)
                return run_dir
    else:
        run_dir, run_id, seed = new_run(args, paths)
        decisions = {}
        stage_usage = {}
        start_index = 0
    stages = STAGES
    source: Path | None = None
    source_hash: str | None = None
    metadata: dict[str, Any] | None = None
    final_status = "infrastructure-failed"
    reason = "Harness did not reach a terminal decision."
    checkpoint_stage: str | None = None

    if "model-generate" in decisions:
        source = find_canonical_source(run_dir, decisions["model-generate"])
        source_hash = sha256_file(source)

    current_stage: str | None = None
    try:
        for stage in stages[start_index:]:
            current_stage = stage.name
            if stage.name == "designer-final":
                source, source_hash, metadata = run_pre_final_gates(
                    args,
                    paths,
                    run_dir,
                    decisions,
                    source_hash,
                    metadata,
                )
            print(f"[{run_id}] {stage.name}: starting", flush=True)
            decision, usage = run_agent_stage(args, paths, run_dir, run_id, seed, stage)
            decisions[stage.name] = decision
            record_stage_usage(stage_usage, stage.name, usage)
            write_json(run_dir / "stage-usage.json", stage_usage)
            disposition = decision.get("disposition", decision.get("status"))
            print(
                f"[{run_id}] {stage.name}: {disposition} "
                f"({usage['total_tokens']} tokens)",
                flush=True,
            )
            repair_stage = repair_stage_for_failure(stage.name, decision)
            if repair_stage:
                diagnostic = str(
                    decision.get("summary", "candidate needs revision")
                )
                write_repair_request(
                    run_dir,
                    target_stage=repair_stage,
                    source_stage=stage.name,
                    diagnostic=diagnostic,
                    actions=decision.get("repair_actions", ()),
                )
                raise OperationalCheckpoint(
                    repair_stage,
                    f"{stage.name} requested repair: {diagnostic}",
                )
            clear_owned_repair_request(run_dir, stage.name)
            if stage.name == "designer-initial":
                validate_designer_diversity(
                    decision, read_json(run_dir / "run-config.json")
                )
            if stage.name == "model-generate":
                source, source_hash = run_mechanical_model_checks(args, paths, run_dir, decision)
                config = read_json(run_dir / "run-config.json")
                if config.get("seed_generated") or config.get("campaign_id"):
                    validate_complexity_metrics(
                        run_dir, str(config.get("complexity", "medium"))
                    )
            elif stage.name == "visualize":
                if source_hash is None:
                    raise HarnessError("visualization reached before canonical source validation")
                if disposition == "semantic-defect":
                    diagnostic = str(
                        decision.get("summary", "traceability review failed")
                    )
                    write_repair_request(
                        run_dir,
                        target_stage="designer-resolution",
                        source_stage="visualize",
                        diagnostic=diagnostic,
                        actions=decision.get("repair_actions", ()),
                    )
                    raise OperationalCheckpoint(
                        "designer-resolution",
                        "Visualization Agent found repairable semantic trace defects: "
                        + diagnostic,
                    )
                metadata = validate_or_checkpoint_visualization(
                    run_dir, source_hash, decision
                )
            elif stage.name == "designer-final":
                designer_visualization_issue = designer_visualization_checkpoint_reason(
                    decision
                )
                if designer_visualization_issue:
                    write_repair_request(
                        run_dir,
                        target_stage="visualize",
                        source_stage="designer-final",
                        diagnostic=designer_visualization_issue,
                        actions=decision.get("repair_actions", ()),
                    )
                    raise OperationalCheckpoint(
                        "visualize", designer_visualization_issue
                    )
                final_status = "accepted"
                reason = str(decision.get("summary", "All retained acceptance evidence passed."))
        else:
            final_status = "accepted"
            reason = str(decisions["designer-final"].get("summary", "All retained acceptance evidence passed."))
    except OperationalCheckpoint as exc:
        checkpoint_stage = exc.stage
        ensure_repair_request(
            run_dir,
            target_stage=exc.stage,
            source_stage=current_stage or exc.stage,
            diagnostic=str(exc),
        )
        if exc.usage:
            record_stage_usage(
                stage_usage, exc.stage, exc.usage, completed=False
            )
            write_json(run_dir / "stage-usage.json", stage_usage)
        final_status = (
            "awaiting-visualization" if exc.stage == "visualize" else "incomplete"
        )
        reason = f"{type(exc).__name__}: {exc}"
        append_jsonl(
            run_dir / "journal.jsonl",
            {
                "event": "operational-checkpoint",
                "at": utc_now(),
                "stage": exc.stage,
                "status": final_status,
                "reason": reason,
            },
        )
        print(reason, file=sys.stderr)
    except subprocess.TimeoutExpired:
        checkpoint_stage = current_stage
        final_status = "incomplete"
        reason = (
            f"OperationalCheckpoint: mechanical check in {current_stage or 'unknown stage'} "
            "reached its operational watchdog"
        )
        ensure_repair_request(
            run_dir,
            target_stage=current_stage or "designer-initial",
            source_stage=current_stage or "harness",
            diagnostic=reason,
        )
        append_jsonl(
            run_dir / "journal.jsonl",
            {
                "event": "operational-checkpoint",
                "at": utc_now(),
                "stage": current_stage,
                "status": final_status,
                "reason": reason,
            },
        )
        print(reason, file=sys.stderr)
    except GateRejected as exc:
        checkpoint_stage = current_stage
        final_status = "incomplete"
        reason = f"OperationalCheckpoint: repairable gate finding ({exc.status}): {exc}"
        ensure_repair_request(
            run_dir,
            target_stage=current_stage or "designer-initial",
            source_stage=current_stage or "harness",
            diagnostic=reason,
        )
        append_jsonl(
            run_dir / "journal.jsonl",
            {
                "event": "acceptance-gate-checkpoint",
                "at": utc_now(),
                "stage": current_stage,
                "original_status": exc.status,
                "status": final_status,
                "reason": reason,
            },
        )
        print(reason, file=sys.stderr)
    except HarnessError as exc:
        checkpoint_stage = current_stage
        final_status = "incomplete"
        reason = f"OperationalCheckpoint: {exc}"
        ensure_repair_request(
            run_dir,
            target_stage=current_stage or "designer-initial",
            source_stage=current_stage or "harness",
            diagnostic=reason,
        )
        append_jsonl(
            run_dir / "journal.jsonl",
            {
                "event": "operational-checkpoint",
                "at": utc_now(),
                "stage": current_stage,
                "status": final_status,
                "reason": reason,
            },
        )
        print(reason, file=sys.stderr)
    except Exception as exc:
        checkpoint_stage = current_stage
        final_status = "incomplete"
        reason = f"OperationalCheckpoint: unexpected {type(exc).__name__}: {exc}"
        ensure_repair_request(
            run_dir,
            target_stage=current_stage or "designer-initial",
            source_stage=current_stage or "harness",
            diagnostic=reason,
        )
        append_jsonl(
            run_dir / "journal.jsonl",
            {
                "event": "unexpected-error-checkpoint",
                "at": utc_now(),
                "stage": current_stage,
                "reason": reason,
            },
        )
        print(reason, file=sys.stderr)
    finally:
        write_closure(
            run_dir,
            run_id,
            seed,
            source,
            source_hash,
            final_status,
            decisions,
            stage_usage,
            args.model,
            metadata,
            reason,
            checkpoint_stage=checkpoint_stage,
        )
    print(f"[{run_id}] status: {final_status}", flush=True)
    print(run_dir)
    return run_dir


def parse_args(argv: list[str] | None = None) -> argparse.Namespace:
    parser = argparse.ArgumentParser(description=__doc__)
    source = parser.add_mutually_exclusive_group(required=True)
    source.add_argument("--seed", help="Frozen Domain Seed Markdown path")
    source.add_argument(
        "--seed-source",
        help="Source brief for a separate reusable seed-preparation job (requires --publish-seed)",
    )
    source.add_argument("--resume-run", help="Resume a nonterminal run directory")
    parser.add_argument("--label", help="Short run label; defaults to seed filename")
    parser.add_argument(
        "--seed-only",
        action="store_true",
        help="Deprecated compatibility spelling; --seed-source already selects seed preparation",
    )
    parser.add_argument(
        "--publish-seed",
        help="Destination Markdown file directly under cps48/seeds for --seed-source",
    )
    parser.add_argument("--campaign-id")
    parser.add_argument("--family-id")
    parser.add_argument(
        "--diversity-card",
        help="Reviewed replicate-diversity constraints, frozen into the run configuration",
    )
    parser.add_argument(
        "--run-parent",
        help=(
            "Directory in which to create the timestamped immutable run; "
            "defaults to the cps48/runs"
        ),
    )
    parser.add_argument(
        "--complexity", default="medium", choices=tuple(COMPLEXITY_PROFILES)
    )
    parser.add_argument("--replicate", type=int, default=1)
    parser.add_argument("--attempt", type=int, default=1)
    parser.add_argument("--sysml-viz-port", type=int, default=4782)
    parser.add_argument("--model", default="gpt-5.6-sol")
    parser.add_argument("--reasoning-effort", default="high", choices=("low", "medium", "high", "xhigh", "max", "ultra"))
    parser.add_argument("--codex-bin", default=shutil.which("codex") or "codex")
    parser.add_argument(
        "--sireum-bin",
        default=os.environ.get("SIREUM_BIN") or shutil.which("sireum") or "sireum",
    )
    parser.add_argument("--node-bin", default=shutil.which("node") or "node")
    parser.add_argument(
        "--timeout",
        type=int,
        default=0,
        help="Optional per-agent operational watchdog in seconds; 0 disables it",
    )
    parser.add_argument(
        "--tool-timeout",
        type=int,
        default=180,
        help="Mechanical-tool watchdog in seconds; expiry checkpoints rather than rejects",
    )
    return parser.parse_args(argv)


def main(argv: list[str] | None = None) -> int:
    try:
        run_dir = execute(parse_args(argv))
    except HarnessError as exc:
        print(f"harness error: {exc}", file=sys.stderr)
        return 2
    status = read_json(run_dir / "status.json").get("status")
    return 1 if status == "infrastructure-failed" else 0


if __name__ == "__main__":
    raise SystemExit(main())
