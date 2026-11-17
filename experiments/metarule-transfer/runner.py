#!/usr/bin/env python3
"""Lean orchestration for the cumulative Meta-Rule transfer experiment."""

from __future__ import annotations

import argparse
import concurrent.futures
import hashlib
import json
import math
import os
import re
import selectors
import signal
import shutil
import stat
import subprocess
import sys
import tempfile
import time
import urllib.error
import urllib.request
from dataclasses import dataclass
from datetime import datetime, timezone
from pathlib import Path
from typing import Any, Iterable


SCRIPT = Path(__file__).resolve()
EXPERIMENT = SCRIPT.parent
REPO = EXPERIMENT.parents[1]
MANIFEST_PATH = EXPERIMENT / "manifest.json"
CHECKPOINTS = EXPERIMENT / "checkpoints"
BUILD = REPO / "build" / "metarule-transfer"
SCHEMA_VERSION = "metarule-transfer-2.0.0"
LEARNED_BEGIN = "<!-- BEGIN LEARNED META-RULES -->"
LEARNED_END = "<!-- END LEARNED META-RULES -->"
UPSTREAM_RULE_START = "3) ENGLISH → GUMBO META-RULES\n"
UPSTREAM_RULE_END = "5) TRACEABILITY\n"
METHODOLOGY_FILENAME = "SCP_Methodology_Paper.pdf"
EMBEDDINGS_ENDPOINT = "https://api.openai.com/v1/embeddings"
RULE_HEADER = "### "


class ExperimentError(RuntimeError):
    pass


@dataclass(frozen=True)
class Cell:
    kind: str
    dataset_id: str
    checkpoint: str

    @property
    def cell_id(self) -> str:
        if self.kind == "train":
            return f"train--{self.checkpoint}"
        return f"{self.dataset_id}--{self.checkpoint}"


@dataclass(frozen=True)
class MetaRule:
    rule_id: str
    source: str


def read_private_key(path: Path) -> str:
    """Read a same-user 0600 regular file without following symlinks."""

    flags = os.O_RDONLY | os.O_CLOEXEC
    if hasattr(os, "O_NOFOLLOW"):
        flags |= os.O_NOFOLLOW
    try:
        descriptor = os.open(path, flags)
    except OSError as exc:
        raise ExperimentError(f"cannot securely open embedding key file {path}: {exc}") from exc
    try:
        metadata = os.fstat(descriptor)
        if not stat.S_ISREG(metadata.st_mode):
            raise ExperimentError("embedding key path must be a regular file")
        if metadata.st_uid != os.getuid():
            raise ExperimentError("embedding key file must be owned by the current user")
        if stat.S_IMODE(metadata.st_mode) != 0o600:
            raise ExperimentError("embedding key file permissions must be exactly 0600")
        with os.fdopen(descriptor, "r", encoding="utf-8", closefd=True) as stream:
            descriptor = -1
            key = stream.read().strip()
    finally:
        if descriptor >= 0:
            os.close(descriptor)
    if not key:
        raise ExperimentError("embedding key file is empty")
    if any(character.isspace() for character in key):
        raise ExperimentError("embedding key contains whitespace")
    return key


class EmbeddingClient:
    """Minimal evaluator-side OpenAI embeddings client with no SDK dependency."""

    def __init__(self, key: str, model: str, dimensions: int, timeout: float = 30.0):
        self._key = key
        self.model = model
        self.dimensions = dimensions
        self.timeout = timeout

    def embed(self, inputs: list[str]) -> tuple[list[list[float]], dict[str, int]]:
        if not inputs or any(not isinstance(item, str) or not item for item in inputs):
            raise ExperimentError("embedding inputs must be non-empty strings")
        body = json.dumps(
            {"model": self.model, "input": inputs, "encoding_format": "float"}
        ).encode("utf-8")
        request = urllib.request.Request(
            EMBEDDINGS_ENDPOINT,
            data=body,
            method="POST",
            headers={
                "Authorization": f"Bearer {self._key}",
                "Content-Type": "application/json",
                "User-Agent": "synthetic-sysml-metarule-transfer/1.0",
            },
        )
        try:
            with urllib.request.urlopen(request, timeout=self.timeout) as response:
                payload = response.read().decode("utf-8")
        except urllib.error.HTTPError as exc:
            detail = exc.read().decode("utf-8", errors="replace").replace(
                self._key, "[REDACTED]"
            )
            raise ExperimentError(
                f"OpenAI embeddings API returned HTTP {exc.code}: {detail}"
            ) from exc
        except urllib.error.URLError as exc:
            raise ExperimentError(f"cannot reach OpenAI embeddings API: {exc.reason}") from exc
        try:
            result = json.loads(payload)
        except json.JSONDecodeError as exc:
            raise ExperimentError("OpenAI embeddings API returned non-JSON output") from exc
        if not isinstance(result, dict) or not isinstance(result.get("data"), list):
            raise ExperimentError("OpenAI embeddings API returned an unexpected JSON shape")
        records = sorted(result["data"], key=lambda item: item.get("index", -1))
        if len(records) != len(inputs):
            raise ExperimentError("OpenAI embeddings API returned the wrong vector count")
        vectors: list[list[float]] = []
        for index, record in enumerate(records):
            if not isinstance(record, dict) or record.get("index") != index:
                raise ExperimentError("embedding indices are missing or out of order")
            raw = record.get("embedding")
            if not isinstance(raw, list) or len(raw) != self.dimensions:
                raise ExperimentError(
                    f"embedding {index} dimensions differ from pinned value {self.dimensions}"
                )
            vector = [float(value) for value in raw]
            if not all(math.isfinite(value) for value in vector):
                raise ExperimentError(f"embedding {index} contains a non-finite value")
            vectors.append(vector)
        usage_value = result.get("usage")
        usage = usage_value if isinstance(usage_value, dict) else {}
        return vectors, {
            "prompt_tokens": int(usage.get("prompt_tokens", 0)),
            "total_tokens": int(usage.get("total_tokens", 0)),
        }


def cosine_similarity(left: list[float], right: list[float]) -> float:
    if len(left) != len(right) or not left:
        raise ExperimentError("embedding vectors have incompatible dimensions")
    dot = sum(a * b for a, b in zip(left, right))
    left_norm = math.sqrt(sum(value * value for value in left))
    right_norm = math.sqrt(sum(value * value for value in right))
    if left_norm == 0.0 or right_norm == 0.0:
        raise ExperimentError("embedding vector has zero norm")
    return dot / (left_norm * right_norm)


def cosine_distance(left: list[float], right: list[float]) -> float:
    return 1.0 - cosine_similarity(left, right)


def text_chunks(text: str, maximum_characters: int = 8000) -> list[str]:
    """Split text reproducibly at line boundaries below the embedding limit."""

    if maximum_characters <= 0:
        raise ExperimentError("chunk size must be positive")
    normalized = text.replace("\r\n", "\n").replace("\r", "\n").strip()
    if not normalized:
        return ["<EMPTY>"]
    chunks: list[str] = []
    current: list[str] = []
    current_size = 0
    for line in normalized.splitlines(keepends=True):
        while len(line) > maximum_characters:
            if current:
                chunks.append("".join(current))
                current = []
                current_size = 0
            chunks.append(line[:maximum_characters])
            line = line[maximum_characters:]
        if current and current_size + len(line) > maximum_characters:
            chunks.append("".join(current))
            current = []
            current_size = 0
        current.append(line)
        current_size += len(line)
    if current:
        chunks.append("".join(current))
    return [chunk.rstrip("\n") or "<EMPTY>" for chunk in chunks]


def parse_meta_rules(checkpoint_text: str) -> list[MetaRule]:
    learned = validate_checkpoint_text(checkpoint_text)
    if not learned:
        return []
    if not learned.startswith(RULE_HEADER):
        raise ExperimentError("learned-rule content must start with a level-three heading")
    blocks = [block for block in learned.split("\n### ") if block.strip()]
    rules: list[MetaRule] = []
    seen: set[str] = set()
    for index, block in enumerate(blocks):
        source = block if index == 0 and block.startswith(RULE_HEADER) else RULE_HEADER + block
        lines = source.splitlines()
        if not lines or not lines[0].startswith(RULE_HEADER):
            raise ExperimentError("learned-rule content must start with a level-three heading")
        rule_id = lines[0][len(RULE_HEADER) :].strip()
        if not rule_id.startswith("MR-") or rule_id in seen:
            raise ExperimentError(f"invalid or duplicate Meta-Rule id: {rule_id!r}")
        seen.add(rule_id)
        if not any(line.strip() for line in lines[1:]):
            raise ExperimentError(f"Meta-Rule {rule_id} has no rule-book content")
        rules.append(MetaRule(rule_id=rule_id, source=source.strip()))
    return rules


def replace_learned_region(checkpoint_text: str, rule_sources: list[str]) -> str:
    validate_checkpoint_text(checkpoint_text)
    before, remainder = checkpoint_text.split(LEARNED_BEGIN, 1)
    _, after = remainder.split(LEARNED_END, 1)
    body = ""
    if rule_sources:
        body = "\n\n" + "\n\n".join(source.strip() for source in rule_sources) + "\n"
    result = before + LEARNED_BEGIN + body + LEARNED_END + after
    validate_checkpoint_text(result)
    return result


def select_applicable_rules(
    checkpoint_text: str,
    task_text: str,
    client: EmbeddingClient,
    maximum_distance: float,
) -> tuple[str, list[dict[str, Any]], dict[str, int]]:
    rendered, decisions, usage, _ = select_applicable_rules_with_evidence(
        checkpoint_text, task_text, client, maximum_distance
    )
    return rendered, decisions, usage


def select_applicable_rules_with_evidence(
    checkpoint_text: str,
    task_text: str,
    client: EmbeddingClient,
    maximum_distance: float,
) -> tuple[str, list[dict[str, Any]], dict[str, int], dict[str, Any]]:
    rules = parse_meta_rules(checkpoint_text)
    if not rules:
        return checkpoint_text, [], {"prompt_tokens": 0, "total_tokens": 0}, {
            "inputs": [],
            "vectors": [],
        }
    chunks = text_chunks(task_text)
    inputs = [*chunks, *(rule.source for rule in rules)]
    vectors, usage = client.embed(inputs)
    chunk_vectors = vectors[: len(chunks)]
    selected_sources: list[str] = []
    decisions: list[dict[str, Any]] = []
    for rule, vector in zip(rules, vectors[len(chunks) :]):
        distance = min(cosine_distance(vector, chunk) for chunk in chunk_vectors)
        selected = distance <= maximum_distance
        if selected:
            selected_sources.append(rule.source)
        decisions.append(
            {
                "rule_id": rule.rule_id,
                "minimum_cosine_distance": distance,
                "selected": selected,
            }
        )
    evidence_inputs = [
        {"kind": "task_chunk", "index": index, "sha256": hashlib.sha256(text.encode()).hexdigest()}
        for index, text in enumerate(chunks)
    ]
    evidence_inputs.extend(
        {
            "kind": "rule_applicability",
            "rule_id": rule.rule_id,
            "sha256": hashlib.sha256(rule.source.encode()).hexdigest(),
        }
        for rule in rules
    )
    evidence = {"inputs": evidence_inputs, "vectors": vectors}
    return replace_learned_region(checkpoint_text, selected_sources), decisions, usage, evidence


def utc_now() -> str:
    return datetime.now(timezone.utc).isoformat().replace("+00:00", "Z")


def memory_snapshot(meminfo: str | None = None) -> dict[str, int | float]:
    """Return Linux available-memory evidence using the kernel's MemAvailable."""

    if meminfo is None:
        try:
            meminfo = Path("/proc/meminfo").read_text(encoding="ascii")
        except OSError as exc:
            raise ExperimentError(f"cannot read /proc/meminfo: {exc}") from exc
    values: dict[str, int] = {}
    for line in meminfo.splitlines():
        fields = line.split()
        if len(fields) >= 2 and fields[0] in ("MemTotal:", "MemAvailable:"):
            try:
                values[fields[0][:-1]] = int(fields[1]) * 1024
            except ValueError as exc:
                raise ExperimentError("invalid numeric value in /proc/meminfo") from exc
    total = values.get("MemTotal", 0)
    available = values.get("MemAvailable", 0)
    if total <= 0 or available < 0 or available > total:
        raise ExperimentError("/proc/meminfo lacks valid MemTotal/MemAvailable values")
    return {
        "total_bytes": total,
        "available_bytes": available,
        "available_fraction": available / total,
    }


def may_launch_worker(
    snapshot: dict[str, int | float],
    reserve_fraction: float,
    observed_peak_bytes: int,
    peak_count: int = 1,
) -> bool:
    """Conservatively reserve both the user margin and one observed worker peak."""

    total = int(snapshot["total_bytes"])
    available = int(snapshot["available_bytes"])
    if not 0.0 < reserve_fraction < 1.0:
        raise ExperimentError("memory reserve fraction must be between zero and one")
    reserve = math.ceil(total * reserve_fraction)
    return available - max(0, observed_peak_bytes) * max(1, peak_count) >= reserve


def command_embedding_poc(args: argparse.Namespace) -> int:
    manifest = load_manifest()
    settings = manifest["embedding"]
    key = read_private_key(args.embedding_key_file)
    client = EmbeddingClient(
        key,
        str(settings["model"]),
        int(settings["dimensions"]),
    )
    inputs = [
        "A controller shall enable defrost when windshield visibility is impaired.",
        "A controller shall enable defrost when windshield visibility is impaired.",
        "Turn on windshield clearing whenever forward visibility is obstructed.",
        "The satellite enters a low-power telemetry mode during an eclipse.",
    ]
    vectors, usage = client.embed(inputs)
    identical = cosine_similarity(vectors[0], vectors[1])
    paraphrase = cosine_similarity(vectors[0], vectors[2])
    unrelated = cosine_similarity(vectors[0], vectors[3])
    if identical < 0.999 or paraphrase <= unrelated:
        raise ExperimentError("embedding proof-of-concept similarity sanity check failed")
    print("EMBEDDING_POC_PASSED")
    print(f"model={settings['model']} vectors={len(vectors)} dimensions={len(vectors[0])}")
    print(
        f"identical_similarity={identical:.6f} "
        f"paraphrase_similarity={paraphrase:.6f} unrelated_similarity={unrelated:.6f}"
    )
    print(f"prompt_tokens={usage['prompt_tokens']} total_tokens={usage['total_tokens']}")
    return 0


def sha256_file(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def artifact_tree_sha256(root: Path) -> str:
    if not root.is_dir() or root.is_symlink():
        raise ExperimentError(f"artifact tree is not a real directory: {root}")
    inventory: list[dict[str, str]] = []
    for path in sorted(root.rglob("*")):
        if path.is_symlink():
            raise ExperimentError(f"artifact tree contains a symlink: {path}")
        if path.is_file():
            inventory.append(
                {
                    "path": str(path.relative_to(root)),
                    "sha256": sha256_file(path),
                }
            )
        elif not path.is_dir():
            raise ExperimentError(f"artifact tree contains a special file: {path}")
    canonical = json.dumps(inventory, sort_keys=True, separators=(",", ":")).encode()
    return hashlib.sha256(canonical).hexdigest()


def read_json(path: Path) -> dict[str, Any]:
    try:
        value = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError) as exc:
        raise ExperimentError(f"cannot read JSON {path}: {exc}") from exc
    if not isinstance(value, dict):
        raise ExperimentError(f"JSON root must be an object: {path}")
    return value


def write_json_atomic(path: Path, value: dict[str, Any]) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    content = json.dumps(value, indent=2, sort_keys=True) + "\n"
    descriptor, temporary_name = tempfile.mkstemp(
        prefix=f".{path.name}.", suffix=".tmp", dir=path.parent
    )
    temporary = Path(temporary_name)
    try:
        with os.fdopen(descriptor, "w", encoding="utf-8") as stream:
            stream.write(content)
            stream.flush()
            os.fsync(stream.fileno())
        temporary.replace(path)
    finally:
        temporary.unlink(missing_ok=True)


def write_json_immutable(path: Path, value: dict[str, Any]) -> None:
    if path.exists():
        if read_json(path) != value:
            raise ExperimentError(f"refusing to overwrite changed JSON evidence: {path}")
        return
    write_json_atomic(path, value)


def load_manifest() -> dict[str, Any]:
    manifest = read_json(MANIFEST_PATH)
    if manifest.get("schema_version") != SCHEMA_VERSION:
        raise ExperimentError("unsupported experiment manifest schema")
    validate_checkpoint_artifacts(manifest)
    if manifest.get("state") == "sealed":
        recorded = manifest.get("sealed_definition_sha256")
        if not isinstance(recorded, str) or recorded != manifest_definition_sha256(manifest):
            raise ExperimentError("sealed experiment manifest integrity check failed")
        selections = manifest.get("selection_set_sha256")
        if not isinstance(selections, str) or selections != selection_set_sha256(manifest):
            raise ExperimentError("sealed applicability selection integrity check failed")
    return manifest


def manifest_definition_sha256(manifest: dict[str, Any]) -> str:
    value = dict(manifest)
    value.pop("sealed_definition_sha256", None)
    canonical = json.dumps(
        value, sort_keys=True, separators=(",", ":"), ensure_ascii=False
    ).encode("utf-8")
    return hashlib.sha256(canonical).hexdigest()


def resolve_manifest_path(value: str) -> Path:
    return (EXPERIMENT / value).resolve()


def checkpoint_by_id(manifest: dict[str, Any], checkpoint_id: str) -> dict[str, Any]:
    for entry in checkpoint_entries(manifest):
        if entry["id"] == checkpoint_id:
            return entry
    raise ExperimentError(f"unknown checkpoint: {checkpoint_id}")


def proposal_directory(checkpoint_id: str, proposal_id: str) -> Path:
    if not proposal_id or any(character not in "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_" for character in proposal_id):
        raise ExperimentError("proposal id may contain only letters, numbers, dash, and underscore")
    return BUILD / "proposals" / checkpoint_id / proposal_id


def validate_proposal(
    manifest: dict[str, Any], checkpoint_id: str, proposal_id: str, *,
    allow_stale_gate_evidence: bool = False,
) -> tuple[dict[str, Any], Path]:
    checkpoint = checkpoint_by_id(manifest, checkpoint_id)
    if checkpoint_id == "M0":
        raise ExperimentError("M0 cannot receive learned-rule proposals")
    directory = proposal_directory(checkpoint_id, proposal_id)
    metadata_path = directory / "proposal.json"
    plan_path = directory / "plan.md"
    metadata = read_json(metadata_path)
    required = {
        "schema_version": "metarule-proposal-1.0.0",
        "proposal_id": proposal_id,
        "checkpoint": checkpoint_id,
        "training_dataset": checkpoint["training_dataset"],
    }
    for key, wanted in required.items():
        if metadata.get(key) != wanted:
            raise ExperimentError(f"proposal {proposal_id} has invalid {key}")
    parent = checkpoint_by_id(manifest, str(checkpoint["parent"]))
    parent_path = resolve_manifest_path(str(parent["path"]))
    parent_hash = sha256_file(parent_path)
    if metadata.get("parent_content_sha256") != parent_hash:
        raise ExperimentError("proposal parent hash is stale")
    if not plan_path.is_file() or metadata.get("candidate_content_sha256") != sha256_file(plan_path):
        raise ExperimentError("proposal candidate hash is missing or stale")
    parent_text = parent_path.read_text(encoding="utf-8")
    proposed_text = plan_path.read_text(encoding="utf-8")
    parent_before, parent_rest = parent_text.split(LEARNED_BEGIN, 1)
    _, parent_after = parent_rest.split(LEARNED_END, 1)
    proposed_before, proposed_rest = proposed_text.split(LEARNED_BEGIN, 1)
    _, proposed_after = proposed_rest.split(LEARNED_END, 1)
    if parent_before != proposed_before or parent_after != proposed_after:
        raise ExperimentError("proposal changes bytes outside the learned-rule region")
    parse_meta_rules(proposed_text)
    gates = metadata.get("gates")
    required_gates = (
        "relative_embedding_improvement",
        "structure_unchanged",
        "model_logika",
        "hamr_codegen",
        "generated_application",
        "component_logika",
    )
    if not isinstance(gates, dict) or any(gate not in gates for gate in required_gates):
        raise ExperimentError("proposal lacks required mechanical gate evidence")
    eligible = all(gates[gate] is True for gate in required_gates)
    relative = metadata.get("relative_embedding_improvement")
    if not isinstance(relative, (int, float)) or not math.isfinite(float(relative)):
        raise ExperimentError("proposal lacks a finite relative embedding improvement")
    threshold_met = float(relative) >= float(manifest["embedding"]["relative_improvement"])
    if gates["relative_embedding_improvement"] is not threshold_met:
        raise ExperimentError("proposal embedding gate disagrees with the pinned threshold")
    if metadata.get("mechanically_eligible") is not eligible:
        raise ExperimentError("proposal mechanical eligibility disagrees with its gates")
    embedding_path = directory / "embedding-evidence.json"
    if (
        not embedding_path.is_file()
        or metadata.get("embedding_evidence_sha256") != sha256_file(embedding_path)
    ):
        raise ExperimentError("proposal embedding evidence hash is missing or stale")
    gate_details = metadata.get("gate_details")
    if not isinstance(gate_details, dict) or not isinstance(
        gate_details.get("evidence_directory"), str
    ):
        raise ExperimentError("proposal gate evidence directory is missing")
    gate_directory = BUILD / "runs" / f"train--{checkpoint_id}" / gate_details[
        "evidence_directory"
    ]
    if (
        not allow_stale_gate_evidence
        and metadata.get("gate_evidence_sha256") != artifact_tree_sha256(gate_directory)
    ):
        raise ExperimentError("proposal gate evidence hash is missing or stale")
    supersedes = metadata.get("supersedes")
    if supersedes is not None:
        if not isinstance(supersedes, str) or supersedes == proposal_id:
            raise ExperimentError("proposal has an invalid superseded proposal id")
        source, source_plan = validate_proposal(manifest, checkpoint_id, supersedes)
        evidence_path = directory / "rule-distillation-evidence.json"
        if (
            not evidence_path.is_file()
            or metadata.get("rule_distillation_evidence_sha256")
            != sha256_file(evidence_path)
        ):
            raise ExperimentError("proposal distillation evidence hash is missing or stale")
        evidence = read_json(evidence_path)
        epsilon = float(manifest["embedding"]["applicability_max_cosine_distance"])
        if (
            evidence.get("schema_version") != "metarule-distillation-1.0.0"
            or evidence.get("source_proposal") != supersedes
            or evidence.get("distilled_proposal") != proposal_id
            or evidence.get("model") != manifest["embedding"]["model"]
            or evidence.get("dimensions") != manifest["embedding"]["dimensions"]
            or evidence.get("epsilon") != epsilon
        ):
            raise ExperimentError("proposal distillation evidence metadata is invalid")
        source_rules = parse_meta_rules(source_plan.read_text(encoding="utf-8"))
        distilled_rules = parse_meta_rules(proposed_text)
        comparisons = evidence.get("comparisons")
        if not isinstance(comparisons, list) or len(comparisons) != len(source_rules):
            raise ExperimentError("proposal distillation comparisons are incomplete")
        observed_distances: list[float] = []
        for source_rule, distilled_rule, comparison in zip(
            source_rules, distilled_rules, comparisons
        ):
            if not isinstance(comparison, dict):
                raise ExperimentError("proposal distillation comparison is invalid")
            source_vector = comparison.get("source_vector")
            distilled_vector = comparison.get("distilled_vector")
            if (
                source_rule.rule_id != distilled_rule.rule_id
                or comparison.get("rule_id") != source_rule.rule_id
                or comparison.get("source_sha256")
                != hashlib.sha256(source_rule.source.encode()).hexdigest()
                or comparison.get("distilled_sha256")
                != hashlib.sha256(distilled_rule.source.encode()).hexdigest()
                or not isinstance(source_vector, list)
                or not isinstance(distilled_vector, list)
            ):
                raise ExperimentError("proposal distillation comparison is stale")
            distance = cosine_distance(source_vector, distilled_vector)
            if (
                not math.isclose(
                    distance,
                    float(comparison.get("cosine_distance", math.inf)),
                    rel_tol=0.0,
                    abs_tol=1e-12,
                )
                or distance > epsilon
            ):
                raise ExperimentError("proposal distillation exceeds semantic epsilon")
            observed_distances.append(distance)
        maximum = max(observed_distances, default=0.0)
        if (
            not math.isclose(
                maximum,
                float(evidence.get("maximum_cosine_distance", math.inf)),
                rel_tol=0.0,
                abs_tol=1e-12,
            )
            or not math.isclose(
                maximum,
                float(metadata.get("maximum_rule_cosine_distance", math.inf)),
                rel_tol=0.0,
                abs_tol=1e-12,
            )
        ):
            raise ExperimentError("proposal distillation maximum is stale")
        if source["parent_content_sha256"] != metadata["parent_content_sha256"]:
            raise ExperimentError("distilled proposal and source have different parents")
    return metadata, plan_path


def command_distill(args: argparse.Namespace) -> int:
    """Create a simpler proposal while retaining per-rule semantic evidence."""

    manifest = load_manifest()
    if manifest.get("state") == "sealed":
        raise ExperimentError("sealed experiment cannot accept distilled proposals")
    source, source_plan = validate_proposal(manifest, args.checkpoint, args.source)
    stage = completed_training_stage(args.checkpoint)
    if args.source not in stage["proposals"]:
        raise ExperimentError("source proposal is not active in its training stage")
    if not args.rules_file.is_file():
        raise ExperimentError(f"distilled rule book is missing: {args.rules_file}")
    parent = checkpoint_by_id(manifest, str(checkpoint_by_id(manifest, args.checkpoint)["parent"]))
    parent_path = resolve_manifest_path(str(parent["path"]))
    parent_text = parent_path.read_text(encoding="utf-8")
    parent_rules = parse_meta_rules(parent_text)
    distilled_text = replace_learned_region(
        parent_text,
        [rule.source for rule in parent_rules]
        + [args.rules_file.read_text(encoding="utf-8").strip()],
    )
    source_rules = parse_meta_rules(source_plan.read_text(encoding="utf-8"))
    distilled_rules = parse_meta_rules(distilled_text)
    if [rule.rule_id for rule in source_rules] != [rule.rule_id for rule in distilled_rules]:
        raise ExperimentError("distilled rule ids/order must exactly match the source proposal")
    existing = BUILD / "proposals" / args.checkpoint
    numbers = [
        int(path.name[1:])
        for path in existing.glob("P[0-9][0-9][0-9][0-9]")
        if path.is_dir()
    ]
    proposal_id = f"P{max(numbers, default=0) + 1:04d}"
    directory = proposal_directory(args.checkpoint, proposal_id)
    settings = manifest["embedding"]
    key = read_private_key(args.embedding_key_file)
    client = EmbeddingClient(key, str(settings["model"]), int(settings["dimensions"]))
    inputs = [rule.source for pair in zip(source_rules, distilled_rules) for rule in pair]
    vectors, usage = client.embed(inputs)
    comparisons: list[dict[str, Any]] = []
    for index, (source_rule, distilled_rule) in enumerate(
        zip(source_rules, distilled_rules)
    ):
        distance = cosine_distance(vectors[index * 2], vectors[index * 2 + 1])
        comparisons.append(
            {
                "rule_id": source_rule.rule_id,
                "source_sha256": hashlib.sha256(source_rule.source.encode()).hexdigest(),
                "distilled_sha256": hashlib.sha256(distilled_rule.source.encode()).hexdigest(),
                "cosine_distance": distance,
                "source_vector": vectors[index * 2],
                "distilled_vector": vectors[index * 2 + 1],
            }
        )
    maximum = max((item["cosine_distance"] for item in comparisons), default=0.0)
    epsilon = float(settings["applicability_max_cosine_distance"])
    if maximum > epsilon:
        raise ExperimentError(
            f"distilled rule distance {maximum:.12f} exceeds epsilon {epsilon:.12f}"
        )
    directory.mkdir(parents=True, exist_ok=False)
    plan_path = directory / "plan.md"
    plan_path.write_text(distilled_text, encoding="utf-8")
    copy_exact(
        proposal_directory(args.checkpoint, args.source) / "embedding-evidence.json",
        directory / "embedding-evidence.json",
    )
    distillation_path = directory / "rule-distillation-evidence.json"
    write_json_immutable(
        distillation_path,
        {
            "schema_version": "metarule-distillation-1.0.0",
            "source_proposal": args.source,
            "distilled_proposal": proposal_id,
            "model": settings["model"],
            "dimensions": settings["dimensions"],
            "epsilon": epsilon,
            "maximum_cosine_distance": maximum,
            "comparisons": comparisons,
            "usage": usage,
        },
    )
    metadata = dict(source)
    metadata.update(
        {
            "proposal_id": proposal_id,
            "candidate_content_sha256": sha256_file(plan_path),
            "embedding_evidence_sha256": sha256_file(
                directory / "embedding-evidence.json"
            ),
            "supersedes": args.source,
            "rule_distillation_evidence_sha256": sha256_file(distillation_path),
            "maximum_rule_cosine_distance": maximum,
        }
    )
    write_json_immutable(directory / "proposal.json", metadata)
    validate_proposal(manifest, args.checkpoint, proposal_id)
    stage["proposals"] = [proposal_id]
    stage["superseded_proposals"] = [*stage.get("superseded_proposals", []), args.source]
    write_json_atomic(
        BUILD / "runs" / f"train--{args.checkpoint}" / "stage.json", stage
    )
    secret_leak_scan(directory, key)
    print(
        f"DISTILLED_PROPOSAL_READY checkpoint={args.checkpoint} "
        f"proposal={proposal_id} source={args.source} "
        f"maximum_cosine_distance={maximum:.12f} epsilon={epsilon:.12f}"
    )
    return 0


def command_recertify(args: argparse.Namespace) -> int:
    """Append a fresh mechanical gate attempt without changing proposal content."""

    manifest = load_manifest()
    if manifest.get("state") == "sealed":
        raise ExperimentError("sealed experiment cannot recertify proposals")
    source, source_plan = validate_proposal(
        manifest,
        args.checkpoint,
        args.source,
        allow_stale_gate_evidence=True,
    )
    stage = completed_training_stage(args.checkpoint)
    if args.source not in stage["proposals"]:
        raise ExperimentError("source proposal is not active in its training stage")
    existing = BUILD / "proposals" / args.checkpoint
    numbers = [
        int(path.name[1:])
        for path in existing.glob("P[0-9][0-9][0-9][0-9]")
        if path.is_dir()
    ]
    proposal_id = f"P{max(numbers, default=0) + 1:04d}"
    run_root = BUILD / "runs" / f"train--{args.checkpoint}"
    cell = training_cell(manifest, args.checkpoint)
    paths = dataset_paths(cell.dataset_id)
    gate_output = run_root / "evaluation" / "proposal-gates" / proposal_id
    gates, gate_details = evaluator_mechanical_gates(
        run_root / "candidate", paths["model"], gate_output
    )
    gates["relative_embedding_improvement"] = source["gates"][
        "relative_embedding_improvement"
    ]
    gate_details["evidence_directory"] = str(gate_output.relative_to(run_root))
    directory = proposal_directory(args.checkpoint, proposal_id)
    directory.mkdir(parents=True, exist_ok=False)
    plan_path = directory / "plan.md"
    copy_exact(source_plan, plan_path)
    embedding_path = directory / "embedding-evidence.json"
    copy_exact(
        proposal_directory(args.checkpoint, args.source) / "embedding-evidence.json",
        embedding_path,
    )
    metadata = dict(source)
    metadata.update(
        {
            "proposal_id": proposal_id,
            "candidate_content_sha256": sha256_file(plan_path),
            "mechanically_eligible": all(gates.values()),
            "gates": gates,
            "gate_details": gate_details,
            "embedding_evidence_sha256": sha256_file(embedding_path),
            "gate_evidence_sha256": artifact_tree_sha256(gate_output),
            "recertifies": args.source,
        }
    )
    write_json_immutable(directory / "proposal.json", metadata)
    validate_proposal(manifest, args.checkpoint, proposal_id)
    stage["proposals"] = [proposal_id]
    stage["superseded_proposals"] = [*stage.get("superseded_proposals", []), args.source]
    write_json_atomic(
        BUILD / "runs" / f"train--{args.checkpoint}" / "stage.json", stage
    )
    print(
        f"RECERTIFIED_PROPOSAL_READY checkpoint={args.checkpoint} "
        f"proposal={proposal_id} source={args.source} "
        f"mechanically_eligible={str(all(gates.values())).lower()}"
    )
    return 0


def command_review(args: argparse.Namespace) -> int:
    manifest = load_manifest()
    if manifest.get("state") == "sealed":
        raise ExperimentError("sealed experiment cannot accept new reviews")
    metadata, _ = validate_proposal(manifest, args.checkpoint, args.proposal)
    if args.decision == "approve" and not metadata["mechanically_eligible"]:
        raise ExperimentError("a mechanically ineligible proposal cannot be approved")
    if not args.reviewer.strip():
        raise ExperimentError("reviewer must not be empty")
    destination = proposal_directory(args.checkpoint, args.proposal) / "review.json"
    record = {
        "schema_version": "metarule-review-1.0.0",
        "checkpoint": args.checkpoint,
        "proposal_id": args.proposal,
        "proposal_content_sha256": metadata["candidate_content_sha256"],
        "proposal_metadata_sha256": sha256_file(
            proposal_directory(args.checkpoint, args.proposal) / "proposal.json"
        ),
        "decision": args.decision,
        "reviewer": args.reviewer.strip(),
        "reviewed_at": utc_now(),
    }
    if destination.exists():
        existing = read_json(destination)
        comparable = {key: value for key, value in record.items() if key != "reviewed_at"}
        old = {key: existing.get(key) for key in comparable}
        if old != comparable:
            raise ExperimentError("review is immutable and already differs")
        print(f"REVIEW_ALREADY_RECORDED checkpoint={args.checkpoint} proposal={args.proposal}")
        return 0
    write_json_atomic(destination, record)
    print(
        f"REVIEW_RECORDED checkpoint={args.checkpoint} proposal={args.proposal} "
        f"decision={args.decision}"
    )
    return 0


def completed_training_stage(checkpoint_id: str) -> dict[str, Any]:
    path = BUILD / "runs" / f"train--{checkpoint_id}" / "stage.json"
    stage = read_json(path)
    expected = {
        "schema_version": "metarule-training-stage-1.0.0",
        "checkpoint": checkpoint_id,
        "status": "proposals_complete",
    }
    for key, wanted in expected.items():
        if stage.get(key) != wanted:
            raise ExperimentError(f"training stage {checkpoint_id} has invalid {key}")
    proposals = stage.get("proposals")
    if not isinstance(proposals, list) or any(not isinstance(item, str) for item in proposals):
        raise ExperimentError(f"training stage {checkpoint_id} has invalid proposal order")
    if len(proposals) != len(set(proposals)):
        raise ExperimentError(f"training stage {checkpoint_id} repeats a proposal")
    return stage


def freeze_checkpoint(manifest: dict[str, Any], checkpoint_id: str) -> None:
    checkpoint = checkpoint_by_id(manifest, checkpoint_id)
    parent = checkpoint_by_id(manifest, str(checkpoint["parent"]))
    parent_path = resolve_manifest_path(str(parent["path"]))
    stage = completed_training_stage(checkpoint_id)
    accepted: list[tuple[str, Path, dict[str, Any]]] = []
    decisions: list[dict[str, Any]] = []
    for proposal_id in stage["proposals"]:
        proposal, plan_path = validate_proposal(manifest, checkpoint_id, proposal_id)
        review_path = proposal_directory(checkpoint_id, proposal_id) / "review.json"
        review = read_json(review_path)
        if (
            review.get("schema_version") != "metarule-review-1.0.0"
            or review.get("checkpoint") != checkpoint_id
            or review.get("proposal_id") != proposal_id
            or review.get("proposal_content_sha256") != proposal["candidate_content_sha256"]
            or review.get("proposal_metadata_sha256")
            != sha256_file(proposal_directory(checkpoint_id, proposal_id) / "proposal.json")
            or review.get("decision") not in ("approve", "reject")
            or not isinstance(review.get("reviewer"), str)
            or not review["reviewer"].strip()
            or not isinstance(review.get("reviewed_at"), str)
            or not review["reviewed_at"].strip()
        ):
            raise ExperimentError(f"proposal {proposal_id} lacks a valid immutable review")
        decisions.append(
            {
                "proposal_id": proposal_id,
                "candidate_content_sha256": proposal["candidate_content_sha256"],
                "proposal_metadata_sha256": review["proposal_metadata_sha256"],
                "mechanically_eligible": proposal["mechanically_eligible"],
                "decision": review["decision"],
                "reviewer": review["reviewer"],
                "reviewed_at": review["reviewed_at"],
                "review_sha256": sha256_file(review_path),
            }
        )
        if review["decision"] == "approve":
            accepted.append((proposal_id, plan_path, proposal))
    selected_id: str | None = None
    selected_path = parent_path
    if accepted:
        selected_id, selected_path, _ = accepted[-1]
    content = selected_path.read_text(encoding="utf-8")
    parse_meta_rules(content)
    destination = CHECKPOINTS / f"{checkpoint_id}.md"
    destination.parent.mkdir(parents=True, exist_ok=True)
    if destination.exists() and destination.read_text(encoding="utf-8") != content:
        raise ExperimentError(f"refusing to overwrite changed checkpoint: {destination}")
    destination.write_text(content, encoding="utf-8")
    content_hash = sha256_file(destination)
    checkpoint["path"] = f"checkpoints/{checkpoint_id}.md"
    checkpoint["content_sha256"] = content_hash
    metadata_path = CHECKPOINTS / f"{checkpoint_id}.json"
    metadata = {
        "schema_version": "metarule-checkpoint-1.0.0",
        "checkpoint": checkpoint_id,
        "parent": checkpoint["parent"],
        "parent_content_sha256": parent["content_sha256"],
        "training_dataset": checkpoint["training_dataset"],
        "content_sha256": content_hash,
        "learned_rule_count": len(parse_meta_rules(content)),
        "accepted_proposal": selected_id,
        "no_accepted_improvement": selected_id is None,
        "decisions": decisions,
    }
    if metadata_path.exists() and read_json(metadata_path) != metadata:
        raise ExperimentError(f"refusing to overwrite changed checkpoint evidence: {metadata_path}")
    write_json_atomic(metadata_path, metadata)
    checkpoint["metadata_sha256"] = sha256_file(metadata_path)


def command_seal(args: argparse.Namespace) -> int:
    manifest = load_manifest()
    if manifest.get("state") == "sealed":
        raise ExperimentError("experiment is already sealed")
    assert_upstream(manifest)
    validate_dataset_entries(manifest, add_hashes=False)
    if args.checkpoint:
        checkpoint = checkpoint_by_id(manifest, args.checkpoint)
        parent = checkpoint_by_id(manifest, str(checkpoint["parent"]))
        if not parent.get("content_sha256") or not parent.get("path"):
            raise ExperimentError("parent checkpoint must be frozen first")
        freeze_checkpoint(manifest, args.checkpoint)
        write_json_atomic(MANIFEST_PATH, manifest)
        print(
            f"CHECKPOINT_SEALED checkpoint={args.checkpoint} "
            f"sha256={checkpoint['content_sha256']}"
        )
        return 0
    for checkpoint_id in ("M-E", "M-EM", "M-EMH"):
        freeze_checkpoint(manifest, checkpoint_id)
    if args.embedding_key_file is None:
        raise ExperimentError("final sealing requires --embedding-key-file")
    key = read_private_key(args.embedding_key_file)
    settings = manifest["embedding"]
    client = EmbeddingClient(key, str(settings["model"]), int(settings["dimensions"]))
    selections = BUILD / "selections"
    for dataset in (entry for entry in manifest["datasets"] if entry["role"] == "test"):
        paths = dataset_paths(str(dataset["id"]))
        task_text = paths["requirements"].read_text(encoding="utf-8") + "\n\n" + paths[
            "model"
        ].read_text(encoding="utf-8")
        for checkpoint in checkpoint_entries(manifest):
            checkpoint_path = resolve_manifest_path(str(checkpoint["path"]))
            checkpoint_text = checkpoint_path.read_text(encoding="utf-8")
            directory = selections / f"{dataset['id']}--{checkpoint['id']}"
            plan_path = directory / "Gumbo_FSE_agent_Plan.md"
            selection_path = directory / "selection.json"
            task_hash = hashlib.sha256(task_text.encode()).hexdigest()
            if selection_path.is_file() and plan_path.is_file():
                existing = read_json(selection_path)
                if (
                    existing.get("schema_version") == "metarule-selection-1.0.0"
                    and existing.get("dataset") == dataset["id"]
                    and existing.get("checkpoint") == checkpoint["id"]
                    and existing.get("checkpoint_sha256") == checkpoint["content_sha256"]
                    and existing.get("task_input_sha256") == task_hash
                    and existing.get("maximum_cosine_distance")
                    == settings["applicability_max_cosine_distance"]
                    and existing.get("rendered_plan_sha256") == sha256_file(plan_path)
                ):
                    continue
                raise ExperimentError(
                    f"incompatible partial applicability evidence: {selection_path}"
                )
            rendered, decisions, usage, vectors = select_applicable_rules_with_evidence(
                checkpoint_text,
                task_text,
                client,
                float(settings["applicability_max_cosine_distance"]),
            )
            directory.mkdir(parents=True, exist_ok=True)
            if plan_path.exists() and plan_path.read_text(encoding="utf-8") != rendered:
                raise ExperimentError(f"refusing to overwrite changed applicability plan: {plan_path}")
            plan_path.write_text(rendered, encoding="utf-8")
            selection_value = {
                "schema_version": "metarule-selection-1.0.0",
                "dataset": dataset["id"],
                "checkpoint": checkpoint["id"],
                "checkpoint_sha256": checkpoint["content_sha256"],
                "task_input_sha256": task_hash,
                "maximum_cosine_distance": settings["applicability_max_cosine_distance"],
                "decisions": decisions,
                "usage": usage,
                "embedding_evidence": vectors,
                "rendered_plan_sha256": sha256_file(plan_path),
            }
            if selection_path.exists() and read_json(selection_path) != selection_value:
                raise ExperimentError(
                    f"refusing to overwrite changed applicability evidence: {selection_path}"
                )
            write_json_atomic(selection_path, selection_value)
    manifest["selection_count"] = 60
    manifest["selection_set_sha256"] = selection_set_sha256(manifest)
    manifest["state"] = "sealed"
    manifest["sealed_at"] = utc_now()
    manifest["sealed_definition_sha256"] = manifest_definition_sha256(manifest)
    write_json_atomic(MANIFEST_PATH, manifest)
    print("EXPERIMENT_SEALED checkpoints=4 selections=60")
    return 0


def assert_upstream(manifest: dict[str, Any]) -> tuple[Path, Path, Path]:
    upstream = manifest.get("upstream")
    if not isinstance(upstream, dict):
        raise ExperimentError("manifest upstream must be an object")
    gumbo = resolve_manifest_path(str(upstream["gumbo_plan"]))
    verification = resolve_manifest_path(str(upstream["verification_plan"]))
    methodology = resolve_manifest_path(str(upstream["methodology_paper"]))
    expected = {
        gumbo: str(upstream["gumbo_plan_sha256"]),
        verification: str(upstream["verification_plan_sha256"]),
        methodology: str(upstream["methodology_paper_sha256"]),
    }
    for path, wanted in expected.items():
        if not path.is_file():
            raise ExperimentError(f"upstream input is missing: {path}")
        actual = sha256_file(path)
        if actual != wanted:
            raise ExperimentError(
                f"upstream input hash mismatch for {path}: expected {wanted}, got {actual}"
            )
    return gumbo, verification, methodology


def baseline_gumbo_plan(source: str) -> str:
    if source.count(UPSTREAM_RULE_START) != 1 or source.count(UPSTREAM_RULE_END) != 1:
        raise ExperimentError("cannot uniquely locate upstream learned sections 3 and 4")
    start = source.index(UPSTREAM_RULE_START)
    end = source.index(UPSTREAM_RULE_END, start)
    learned_region = (
        "3) LEARNED META-RULES\n"
        "---------------------\n"
        "Only rules accepted by this experiment may appear between the markers.\n\n"
        f"{LEARNED_BEGIN}\n"
        f"{LEARNED_END}\n\n"
        "---\n"
    )
    result = source[:start] + learned_region + source[end:]
    old_commands = (
        "- After embedding:\n"
        "  1) sireum hamr sysml parse --input <SysML file(s)>\n"
        "  2) sireum hamr codegen --sysml <model> --platform <jvm|rust>\n"
        "  3) sireum logika project --input <generated_slang_project_dir>   (for Slang)\n"
        "     or run Verus flow for Rust targets, as configured in your pipeline."
    )
    new_commands = (
        "- After embedding, follow `sireum_verification_plan.md`; its staged commands "
        "are authoritative for this repository."
    )
    if old_commands not in result:
        raise ExperimentError("cannot locate obsolete integration command block")
    result = result.replace(old_commands, new_commands, 1)
    old_path = "/home/amertahat/SPEC_CODE_PROOF/isolette/sysml/sireum_verification_plan.txt"
    if result.count(old_path) != 1:
        raise ExperimentError("cannot uniquely locate obsolete verification-plan path")
    result = result.replace(old_path, "sireum_verification_plan.md", 1)
    validate_checkpoint_text(result, require_empty=True)
    return result


def adapted_verification_plan(source: str) -> str:
    start = source.find("Step 1-")
    end_marker = "- VERY IMPORTANT:"
    end = source.find(end_marker)
    if start < 0 or end < 0 or end <= start:
        raise ExperimentError("cannot locate upstream verification command section")
    commands = """Step 1- Validate the untouched semantic model and prepare a fresh executable projection:

    ./tools/prepare_executable_candidate.sh M-star.sysml executable

Expected behavior:

- The untouched `M-star.sysml` passes model-level Logika.
- A non-normative periodic projection is generated under `executable/`.
- HAMR JVM/Slang artifacts are generated under `executable/hamr/slang`.
- The command prints the generated application allowlist and exact next command.

Step 2- Implement only generated application components under the printed application root.
Do not edit the semantic candidate, staged projection, generated bridge/API/data/runtime/project
files, or validation manifests.

Step 3- Verify every generated component entrypoint:

    ./executable/run-logika.sh ./executable/hamr/slang ./executable/proof

The semantic candidate remains `M-star.sysml`; never substitute the executable projection for
hidden semantic scoring.

"""
    result = source[:start] + commands + source[end:]
    result = result.replace("Gumbo_FSE_agent_plan.txt", "Gumbo_FSE_agent_Plan.md")
    result = result.replace("sireum_verification_plan.txt", "sireum_verification_plan.md")
    forbidden = ("isolette/", "/home/amertahat/", "run-hamr.cmd")
    remaining = [token for token in forbidden if token in result]
    if remaining:
        raise ExperimentError(f"adapted verification plan retains obsolete paths: {remaining}")
    return result


def validate_checkpoint_text(text: str, *, require_empty: bool = False) -> str:
    if text.count(LEARNED_BEGIN) != 1 or text.count(LEARNED_END) != 1:
        raise ExperimentError("checkpoint must contain exactly one learned-rule region")
    before, remainder = text.split(LEARNED_BEGIN, 1)
    learned, after = remainder.split(LEARNED_END, 1)
    if require_empty and learned.strip():
        raise ExperimentError("M0 learned-rule region is not empty")
    if UPSTREAM_RULE_START in before + after or "4) FUNCTION-SPECIFIC RULES" in before + after:
        raise ExperimentError("checkpoint retains removed upstream learned sections")
    return learned.strip()


def dataset_paths(dataset_id: str) -> dict[str, Path]:
    root = REPO / "datasets" / dataset_id
    return {
        "model": root / "agent" / "M-star.sysml",
        "requirements": root / "agent" / "N.md",
        "oracle": root / "evaluator" / "oracle.sysml",
    }


def executable_on_path(name: str) -> Path:
    value = shutil.which(name)
    if not value:
        raise ExperimentError(f"required executable is not on PATH: {name}")
    return Path(value).resolve()


def sireum_home() -> Path:
    configured = os.environ.get("SIREUM_HOME")
    if configured:
        home = Path(configured).resolve()
    else:
        binary = executable_on_path("sireum")
        home = binary.parent.parent
    if not (home / "bin" / "sireum").is_file():
        raise ExperimentError(f"invalid Sireum home: {home}")
    return home


def copy_exact(source: Path, destination: Path) -> None:
    if destination.exists():
        if not destination.is_file() or sha256_file(destination) != sha256_file(source):
            raise ExperimentError(f"refusing to overwrite changed staged input: {destination}")
        return
    destination.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(source, destination)


def isolated_prepare_script(source: str) -> str:
    old = '--sourcepath "$(dirname "$model"):$library" \\\n  "$model"'
    new = '--sourcepath "$library" \\\n  "$model"'
    if source.count(old) != 1:
        raise ExperimentError("cannot locate generic model sourcepath in prepare script")
    return source.replace(old, new, 1)


def stage_workspace(cell: Cell, plan_path: Path) -> Path:
    """Stage only candidate-visible inputs; evaluator state stays in a denied sibling."""

    run_root = BUILD / "runs" / cell.cell_id
    candidate = run_root / "candidate"
    evaluation = run_root / "evaluation"
    candidate.mkdir(parents=True, exist_ok=True)
    evaluation.mkdir(parents=True, exist_ok=True)
    paths = dataset_paths(cell.dataset_id)
    copy_exact(paths["model"], candidate / "M-star.sysml")
    copy_exact(paths["requirements"], candidate / "N.md")
    copy_exact(plan_path, candidate / "Gumbo_FSE_agent_Plan.md")
    copy_exact(
        EXPERIMENT / "sireum_verification_plan.md",
        candidate / "sireum_verification_plan.md",
    )
    _, _, methodology = assert_upstream(load_manifest())
    copy_exact(methodology, candidate / METHODOLOGY_FILENAME)
    tool_sources = (
        REPO / "scripts" / "prepare_executable_candidate.sh",
        REPO / "scripts" / "run-logika.sh",
        REPO / "scripts" / "stage_executable_model.py",
    )
    for source in tool_sources:
        destination = candidate / "tools" / source.name
        if source.name == "prepare_executable_candidate.sh":
            content = isolated_prepare_script(source.read_text(encoding="utf-8"))
            if destination.exists() and destination.read_text(encoding="utf-8") != content:
                raise ExperimentError(f"refusing to overwrite changed staged tool: {destination}")
            destination.parent.mkdir(parents=True, exist_ok=True)
            destination.write_text(content, encoding="utf-8")
            destination.chmod(stat.S_IMODE(source.stat().st_mode))
        else:
            copy_exact(source, destination)
    library_source = REPO / "external" / "sysml-aadl-libraries"
    library_target = candidate / "external" / "sysml-aadl-libraries"
    if not library_target.exists():
        shutil.copytree(
            library_source,
            library_target,
            symlinks=False,
            ignore=shutil.ignore_patterns(".git"),
        )
    for directory in (candidate / ".home", candidate / ".tmp"):
        directory.mkdir(mode=0o700, exist_ok=True)
    inventory = {
        "schema_version": "metarule-candidate-input-1.0.0",
        "cell": cell.cell_id,
        "kind": cell.kind,
        "dataset": cell.dataset_id,
        "checkpoint": cell.checkpoint,
        "files": {
            str(path.relative_to(candidate)): sha256_file(path)
            for path in sorted(candidate.rglob("*"))
            if path.is_file() and not path.is_relative_to(candidate / ".home")
        },
    }
    write_json_atomic(evaluation / "input-inventory.json", inventory)
    return run_root


def clean_codex_environment(candidate: Path, codex_home: Path) -> dict[str, str]:
    """Allow only non-secret runtime variables; never inherit embedding credentials."""

    values = {
        "PATH": os.environ.get("PATH", "/usr/local/bin:/usr/bin:/bin"),
        "HOME": str(candidate / ".home"),
        "CODEX_HOME": str(codex_home),
        "LANG": "C.UTF-8",
        "LC_ALL": "C.UTF-8",
    }
    for name in (
        "HTTP_PROXY",
        "HTTPS_PROXY",
        "ALL_PROXY",
        "NO_PROXY",
        "SSL_CERT_FILE",
        "SSL_CERT_DIR",
    ):
        if name in os.environ:
            values[name] = os.environ[name]
    return values


def toml_string(value: str) -> str:
    return json.dumps(value)


def inline_table(values: dict[str, str]) -> str:
    return "{" + ",".join(f"{toml_string(k)}={toml_string(v)}" for k, v in values.items()) + "}"


def direct_model_catalog(codex_binary: Path, runtime: Path, model: str) -> Path:
    destination = runtime / "model-catalog.json"
    if destination.is_file():
        return destination
    completed = subprocess.run(
        [str(codex_binary), "debug", "models", "--bundled"],
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        check=False,
    )
    if completed.returncode != 0:
        raise ExperimentError(f"cannot inspect Codex model catalog: {completed.stderr.strip()}")
    try:
        catalog = json.loads(completed.stdout)
        entry = next(item for item in catalog["models"] if item.get("slug") == model)
    except (json.JSONDecodeError, KeyError, StopIteration, TypeError) as exc:
        raise ExperimentError(f"Codex catalog does not contain {model}") from exc
    entry["tool_mode"] = "direct"
    runtime.mkdir(parents=True, exist_ok=True)
    write_json_atomic(destination, {"models": [entry]})
    return destination


def codex_permission_overrides(
    candidate: Path, run_root: Path, codex_binary: Path, runtime: Path, model: str
) -> list[str]:
    home = sireum_home()
    profile = "metarule_candidate"
    shell = {
        "HOME": str(candidate / ".home"),
        "TMPDIR": str(candidate / ".tmp"),
        "JAVA_TOOL_OPTIONS": f"-Djava.io.tmpdir={candidate / '.tmp'}",
        "SIREUM_HOME": str(home),
        "PATH": f"{home / 'bin'}:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin",
        "LANG": "C.UTF-8",
        "LC_ALL": "C.UTF-8",
    }
    filesystem = {
        ":root": "deny",
        ":minimal": "read",
        ":workspace_roots": "write",
        ":slash_tmp": "deny",
        "/proc": "deny",
        str(Path("/run/user") / str(os.getuid())): "deny",
        str(run_root): "deny",
        str(home / "bin"): "read",
        str(home / "lib"): "read",
        str(codex_binary.parent): "read",
    }
    values = {
        "approval_policy": '"never"',
        "allow_login_shell": "false",
        "web_search": '"disabled"',
        "history.persistence": '"none"',
        "agents.enabled": "false",
        "apps._default.enabled": "false",
        "apps._default.open_world_enabled": "false",
        "feedback.enabled": "false",
        "memories.generate_memories": "false",
        "model_catalog_json": toml_string(
            str(direct_model_catalog(codex_binary, runtime, model))
        ),
        "shell_environment_policy.inherit": '"none"',
        "shell_environment_policy.set": inline_table(shell),
        "default_permissions": toml_string(profile),
        f"permissions.{profile}.description": toml_string("Isolated Meta-Rule candidate"),
        f"permissions.{profile}.extends": '":workspace"',
        f"permissions.{profile}.filesystem": inline_table(filesystem),
        f"permissions.{profile}.network.enabled": "false",
    }
    result: list[str] = []
    for key, value in values.items():
        result.extend(("-c", f"{key}={value}"))
    return result


def prepare_codex_home(runtime: Path, auth_source: Path | None) -> Path:
    codex_home = runtime / "codex-home"
    codex_home.mkdir(mode=0o700, parents=True, exist_ok=True)
    source = auth_source or Path(os.environ.get("CODEX_HOME", Path.home() / ".codex")) / "auth.json"
    destination = codex_home / "auth.json"
    if not source.is_file():
        raise ExperimentError("Codex authentication is missing; use --auth-source")
    if not destination.exists():
        destination.symlink_to(source.resolve())
    return codex_home


def codex_command(
    manifest: dict[str, Any], run_root: Path, auth_source: Path | None
) -> tuple[list[str], dict[str, str]]:
    candidate = run_root / "candidate"
    evaluation = run_root / "evaluation"
    runtime = evaluation / ".runtime"
    codex_binary = executable_on_path("codex")
    codex_home = prepare_codex_home(runtime, auth_source)
    model = str(manifest["model"]["codex_model"])
    command = [
        str(codex_binary),
        "exec",
        "--json",
        "--ignore-user-config",
        "--ignore-rules",
        "--strict-config",
        "--skip-git-repo-check",
        "--cd",
        str(candidate),
        "--model",
        model,
        "-c",
        f"model_reasoning_effort={toml_string(str(manifest['model']['reasoning_effort']))}",
        "-c",
        f"service_tier={toml_string(str(manifest['model']['service_tier']))}",
        *codex_permission_overrides(candidate, run_root, codex_binary, runtime, model),
    ]
    return command, clean_codex_environment(candidate, codex_home)


def stream_codex(
    manifest: dict[str, Any],
    run_root: Path,
    prompt: str,
    auth_source: Path | None,
    *,
    resume_session: str | None = None,
    timeout_seconds: int | None = None,
) -> tuple[int, str | None, float]:
    command, environment = codex_command(manifest, run_root, auth_source)
    if resume_session:
        base = command
        command = [base[0], "exec", "resume", *base[2:]]
        cd_index = command.index("--cd")
        del command[cd_index : cd_index + 2]
        command.extend((resume_session, "-"))
    else:
        command.append("-")
    evaluation = run_root / "evaluation"
    transcripts = evaluation / "transcripts"
    transcripts.mkdir(parents=True, exist_ok=True)
    prefix = "resume" if resume_session else "turn"
    index = 1
    while (transcripts / f"{prefix}-{index:02d}.jsonl").exists():
        index += 1
    transcript = transcripts / f"{prefix}-{index:02d}.jsonl"
    prompt_path = transcripts / f"{prefix}-{index:02d}.prompt.txt"
    prompt_path.write_text(prompt, encoding="utf-8")
    started = time.monotonic()
    session_id: str | None = None
    with transcript.open("x", encoding="utf-8") as output:
        process = subprocess.Popen(
            command,
            cwd=run_root / "candidate",
            env=environment,
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            text=True,
            bufsize=1,
        )
        assert process.stdin and process.stdout
        process.stdin.write(prompt)
        process.stdin.close()
        deadline = started + timeout_seconds if timeout_seconds else None
        selector = selectors.DefaultSelector()
        selector.register(process.stdout, selectors.EVENT_READ)
        try:
            while True:
                if deadline is not None and time.monotonic() >= deadline:
                    process.terminate()
                    try:
                        process.wait(timeout=10)
                    except subprocess.TimeoutExpired:
                        process.kill()
                    return 124, session_id, time.monotonic() - started
                if selector.select(timeout=0.25):
                    line = process.stdout.readline()
                    if line:
                        output.write(line)
                        output.flush()
                        try:
                            event = json.loads(line)
                        except json.JSONDecodeError:
                            continue
                        if event.get("type") == "thread.started" and isinstance(
                            event.get("thread_id"), str
                        ):
                            session_id = event["thread_id"]
                        continue
                if process.poll() is not None:
                    for line in process.stdout:
                        output.write(line)
                    break
                time.sleep(0.1)
        finally:
            selector.close()
            if process.poll() is None:
                process.kill()
                process.wait()
    return process.returncode, session_id, time.monotonic() - started


def secret_leak_scan(root: Path, secret: str) -> None:
    encoded = secret.encode()
    for path in root.rglob("*"):
        if not path.is_file() or path.is_symlink():
            continue
        try:
            content = path.read_bytes()
        except OSError as exc:
            raise ExperimentError(f"cannot scan retained artifact {path}: {exc}") from exc
        if encoded in content:
            raise ExperimentError(f"embedding credential leaked into retained artifact: {path}")


def sandbox_probe(
    manifest: dict[str, Any],
    run_root: Path,
    auth_source: Path | None,
    embedding_key_path: Path,
) -> dict[str, Any]:
    candidate = run_root / "candidate"
    evaluation = run_root / "evaluation"
    runtime = evaluation / ".runtime"
    codex_binary = executable_on_path("codex")
    codex_home = prepare_codex_home(runtime, auth_source)
    model = str(manifest["model"]["codex_model"])
    overrides = codex_permission_overrides(candidate, run_root, codex_binary, runtime, model)
    forbidden = (
        evaluation,
        dataset_paths(str(manifest["datasets"][3]["id"]))["oracle"],
        REPO / "datasets",
        REPO / ".git",
        Path(os.environ.get("CODEX_HOME", Path.home() / ".codex")) / "config.toml",
        embedding_key_path,
    )
    probe = candidate / ".tmp" / "isolation-probe.py"
    report = candidate / ".tmp" / "isolation-probe.json"
    script = "\n".join(
        (
            "import json, os, socket, sys",
            f"allowed={json.dumps(str(candidate / 'N.md'))}",
            f"write_target={json.dumps(str(candidate / '.tmp' / 'probe-write'))}",
            f"forbidden={json.dumps([str(path.resolve()) for path in forbidden])}",
            "failures=[]",
            "open(allowed, encoding='utf-8').read(1)",
            "open(write_target, 'w', encoding='utf-8').write('ok')",
            "for path in forbidden:",
            "  try:",
            "    if os.path.isdir(path): os.listdir(path)",
            "    else: open(path, 'rb').read(1)",
            "    failures.append('readable:'+path)",
            "  except (PermissionError, FileNotFoundError, NotADirectoryError): pass",
            f"proc_markers={[str(evaluation).encode().decode(), str(embedding_key_path).encode().decode(), 'OPENAI_API_KEY', 'auth.json', 'history.jsonl', 'memories_1.sqlite']!r}",
            "for process in [p for p in __import__('pathlib').Path('/proc').iterdir() if p.name.isdigit()]:",
            "  visible=b''",
            "  for leaf in ('environ','cmdline'):",
            "    try: visible += (process / leaf).read_bytes()",
            "    except OSError: pass",
            "  try: descriptors=list((process / 'fd').iterdir())",
            "  except OSError: descriptors=[]",
            "  for descriptor in descriptors:",
            "    try: visible += os.readlink(descriptor).encode(errors='replace')",
            "    except OSError: pass",
            "  if any(marker.encode() in visible for marker in proc_markers): failures.append('process-contamination')",
            "try:",
            "  socket.create_connection(('127.0.0.1', 9), timeout=0.2)",
            "  failures.append('network-open')",
            "except OSError: pass",
            "print(json.dumps({'status':'passed' if not failures else 'failed','failures':failures}))",
            "sys.exit(0 if not failures else 1)",
            "",
        )
    )
    probe.write_text(script, encoding="utf-8")
    command = [
        str(codex_binary),
        "sandbox",
        "-C",
        str(candidate),
        "-P",
        "metarule_candidate",
        *overrides,
        "/usr/bin/env",
        "-i",
        f"HOME={candidate / '.home'}",
        f"TMPDIR={candidate / '.tmp'}",
        f"SIREUM_HOME={sireum_home()}",
        f"PATH={sireum_home() / 'bin'}:/usr/local/bin:/usr/bin:/bin",
        "LANG=C.UTF-8",
        "LC_ALL=C.UTF-8",
        sys.executable,
        str(probe),
    ]
    try:
        completed = subprocess.run(
            command,
            cwd=candidate,
            env=clean_codex_environment(candidate, codex_home),
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            check=False,
            timeout=60,
        )
        toolchain = subprocess.run(
            [
                str(codex_binary),
                "sandbox",
                "-C",
                str(candidate),
                "-P",
                "metarule_candidate",
                *overrides,
                "/usr/bin/env",
                "-i",
                f"HOME={candidate / '.home'}",
                f"TMPDIR={candidate / '.tmp'}",
                f"JAVA_TOOL_OPTIONS=-Djava.io.tmpdir={candidate / '.tmp'}",
                f"SIREUM_HOME={sireum_home()}",
                f"PATH={sireum_home() / 'bin'}:/usr/local/bin:/usr/bin:/bin",
                "LANG=C.UTF-8",
                "LC_ALL=C.UTF-8",
                "sireum",
                "hamr",
                "sysml",
                "tipe",
                "--sourcepath",
                ".:external/sysml-aadl-libraries",
                "M-star.sysml",
            ],
            cwd=candidate,
            env=clean_codex_environment(candidate, codex_home),
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            check=False,
            timeout=180,
        )
        pdftext = subprocess.run(
            [
                str(codex_binary),
                "sandbox",
                "-C",
                str(candidate),
                "-P",
                "metarule_candidate",
                *overrides,
                "/usr/bin/env",
                "-i",
                f"HOME={candidate / '.home'}",
                f"TMPDIR={candidate / '.tmp'}",
                f"PATH={sireum_home() / 'bin'}:/usr/local/bin:/usr/bin:/bin",
                "LANG=C.UTF-8",
                "LC_ALL=C.UTF-8",
                "pdftotext",
                METHODOLOGY_FILENAME,
                "-",
            ],
            cwd=candidate,
            env=clean_codex_environment(candidate, codex_home),
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            check=False,
            timeout=60,
        )
        pdf_markers = (
            "Bridging Natural Language to Verified" in pdftext.stdout
            and "Meta-Rule" in pdftext.stdout
        )
        passed = (
            completed.returncode == 0
            and toolchain.returncode == 0
            and pdftext.returncode == 0
            and pdf_markers
        )
        evidence = {
            "schema_version": "metarule-isolation-probe-1.0.0",
            "status": "passed" if passed else "failed",
            "exit_code": completed.returncode,
            "output": completed.stdout,
            "toolchain_exit_code": toolchain.returncode,
            "toolchain_output": toolchain.stdout,
            "methodology_pdf_exit_code": pdftext.returncode,
            "methodology_pdf_markers_found": pdf_markers,
            "methodology_text_sha256": hashlib.sha256(pdftext.stdout.encode()).hexdigest(),
            "forbidden_labels": [
                "evaluation",
                "oracle",
                "datasets",
                "git",
                "global-config",
                "process-contamination",
                "embedding-key",
            ],
        }
        write_json_atomic(evaluation / "isolation-probe.json", evidence)
        if not passed:
            raise ExperimentError("candidate isolation probe failed")
        return evidence
    finally:
        for path in (probe, report, candidate / ".tmp" / "probe-write"):
            path.unlink(missing_ok=True)


def command_preflight(args: argparse.Namespace) -> int:
    manifest = load_manifest()
    assert_upstream(manifest)
    validate_dataset_entries(manifest, add_hashes=False)
    m0 = CHECKPOINTS / "M0.md"
    if sha256_file(m0) != checkpoint_entries(manifest)[0]["content_sha256"]:
        raise ExperimentError("M0 differs from its pinned hash")
    key = read_private_key(args.embedding_key_file)
    codex_binary = executable_on_path("codex")
    executable_on_path("pdftotext")
    sireum = sireum_home()
    cell = Cell(
        "preflight",
        next(entry["id"] for entry in manifest["datasets"] if entry["role"] == "test"),
        "M0",
    )
    run_root = stage_workspace(cell, m0)
    sandbox_probe(manifest, run_root, args.auth_source, args.embedding_key_file)
    environment = clean_codex_environment(
        run_root / "candidate", prepare_codex_home(run_root / "evaluation" / ".runtime", args.auth_source)
    )
    if any("OPENAI" in name.upper() or key == value for name, value in environment.items()):
        raise ExperimentError("embedding credential entered the Codex child environment")
    previous_preflight = (
        read_json(BUILD / "preflight.json")
        if (BUILD / "preflight.json").is_file()
        else {}
    )
    oracle_checks: list[dict[str, Any]] = []
    if not args.deep and previous_preflight.get("depth") == "deep":
        prior_checks = previous_preflight.get("oracle_checks")
        if isinstance(prior_checks, list) and len(prior_checks) == 18:
            oracle_checks = prior_checks
    if args.deep:
        if str(REPO / "src") not in sys.path:
            sys.path.insert(0, str(REPO / "src"))
        checks_root = BUILD / "oracle-preflight"
        for dataset in manifest["datasets"]:
            dataset_id = str(dataset["id"])
            oracle = dataset_paths(dataset_id)["oracle"]
            directory = checks_root / dataset_id
            directory.mkdir(parents=True, exist_ok=True)
            self_code, self_output = logged_process(
                [str(REPO / "scripts" / "evaluate.sh"), dataset_id, str(oracle)],
                directory / "self.log",
                cwd=REPO,
                environment={
                    "PATH": os.environ.get("PATH", "/usr/local/bin:/usr/bin:/bin"),
                    "PYTHONPATH": str(REPO / "src"),
                    "EQUIV_CHECKER_ROOT": str(REPO),
                },
                timeout=60,
            )
            if self_code != 0 or self_output.strip() != "EQUIVALENT":
                raise ExperimentError(f"oracle self-comparison failed: {dataset_id}")
            source = oracle.read_text(encoding="utf-8")
            enum_pattern = re.compile(
                r"(?P<prefix>enum\s+def\s+[^\{]+\{\s*)"
                r"(?P<first>enum\s+[A-Za-z_][A-Za-z0-9_]*\s*;)\s*"
                r"(?P<second>enum\s+[A-Za-z_][A-Za-z0-9_]*\s*;)",
                re.MULTILINE,
            )
            match = enum_pattern.search(source)
            if match is None:
                raise ExperimentError(f"cannot create deterministic enum-order mutation: {dataset_id}")
            replacement = (
                match.group("prefix")
                + match.group("second")
                + "\n    "
                + match.group("first")
            )
            mutated = source[: match.start()] + replacement + source[match.end() :]
            mutation = directory / "known-wrong.sysml"
            mutation.write_text(mutated, encoding="utf-8")
            mutation_code, mutation_output = logged_process(
                [str(REPO / "scripts" / "evaluate.sh"), dataset_id, str(mutation)],
                directory / "mutation.log",
                cwd=REPO,
                environment={
                    "PATH": os.environ.get("PATH", "/usr/local/bin:/usr/bin:/bin"),
                    "PYTHONPATH": str(REPO / "src"),
                    "EQUIV_CHECKER_ROOT": str(REPO),
                    "EQUIV_TIMEOUT_SECONDS": str(
                        manifest["model"]["equivalence_timeout_seconds"]
                    ),
                },
                timeout=int(manifest["model"]["equivalence_timeout_seconds"]) + 120,
            )
            rejection = next(
                (
                    token
                    for token in ("VERIFIED_DIFFERENCE", "INVALID_INPUT")
                    if token in mutation_output
                ),
                None,
            )
            if rejection is None:
                raise ExperimentError(
                    f"known-wrong mutation was not decisively rejected: {dataset_id} "
                    f"(exit {mutation_code})"
                )
            oracle_checks.append(
                {
                    "dataset": dataset_id,
                    "oracle_sha256": sha256_file(oracle),
                    "self_result": "EQUIVALENT",
                    "mutation_sha256": sha256_file(mutation),
                    "mutation_kind": "resolved-enum-order-swap",
                    "mutation_offset": match.start(),
                    "mutation_result": rejection,
                }
            )
            print(f"ORACLE_PREFLIGHT_PASSED dataset={dataset_id}", flush=True)
    secret_leak_scan(EXPERIMENT, key)
    secret_leak_scan(run_root, key)
    snapshot = memory_snapshot()
    write_json_atomic(
        BUILD / "preflight.json",
        {
            "schema_version": "metarule-preflight-1.0.0",
            "status": "passed",
            "timestamp": utc_now(),
            "codex_binary": str(codex_binary),
            "codex_version": subprocess.run(
                [str(codex_binary), "--version"], text=True, capture_output=True, check=True
            ).stdout.strip(),
            "sireum_home": str(sireum),
            "memory": snapshot,
            "memory_reserve_fraction": manifest["execution"]["memory_reserve_fraction"],
            "isolation_probe": "passed",
            "depth": "deep" if len(oracle_checks) == 18 else "basic",
            "oracle_checks": oracle_checks,
            "embedding_key_policy": "same-user-0600-no-follow; value not retained",
        },
    )
    print(
        f"PREFLIGHT_PASSED codex={codex_binary.name} sireum={sireum} "
        f"available_ram={float(snapshot['available_fraction']):.1%}"
    )
    return 0


def user_cells(manifest: dict[str, Any]) -> list[Cell]:
    return expand_cells(manifest)[1]


def counterbalanced_user_cells(manifest: dict[str, Any]) -> list[Cell]:
    """Distribute checkpoint conditions across time while retaining M0 first."""

    cells = user_cells(manifest)
    by_key = {(cell.dataset_id, cell.checkpoint): cell for cell in cells}
    datasets = [entry["id"] for entry in manifest["datasets"] if entry["role"] == "test"]
    checkpoints = [entry["id"] for entry in checkpoint_entries(manifest)]
    ordered: list[Cell] = []
    for wave in range(len(checkpoints)):
        for dataset_index, dataset_id in enumerate(datasets):
            checkpoint = checkpoints[(wave + dataset_index) % len(checkpoints)]
            ordered.append(by_key[(str(dataset_id), str(checkpoint))])
    if len(ordered) != 60 or len({cell.cell_id for cell in ordered}) != 60:
        raise ExperimentError("counterbalanced held-out schedule is incomplete")
    return ordered


def run_result_path(cell: Cell) -> Path:
    return BUILD / "runs" / cell.cell_id / "result.json"


def validate_selection(manifest: dict[str, Any], cell: Cell) -> tuple[dict[str, Any], Path]:
    directory = BUILD / "selections" / cell.cell_id
    plan_path = directory / "Gumbo_FSE_agent_Plan.md"
    metadata = read_json(directory / "selection.json")
    checkpoint = checkpoint_by_id(manifest, cell.checkpoint)
    paths = dataset_paths(cell.dataset_id)
    task_text = paths["requirements"].read_text(encoding="utf-8") + "\n\n" + paths[
        "model"
    ].read_text(encoding="utf-8")
    required = {
        "schema_version": "metarule-selection-1.0.0",
        "dataset": cell.dataset_id,
        "checkpoint": cell.checkpoint,
        "checkpoint_sha256": checkpoint["content_sha256"],
        "task_input_sha256": hashlib.sha256(task_text.encode()).hexdigest(),
        "maximum_cosine_distance": manifest["embedding"][
            "applicability_max_cosine_distance"
        ],
    }
    for name, expected in required.items():
        if metadata.get(name) != expected:
            raise ExperimentError(f"sealed selection has incompatible {name}: {cell.cell_id}")
    if not plan_path.is_file() or metadata.get("rendered_plan_sha256") != sha256_file(plan_path):
        raise ExperimentError(f"sealed selection plan hash differs: {cell.cell_id}")
    return metadata, plan_path


def selection_set_sha256(manifest: dict[str, Any]) -> str:
    inventory = []
    for cell in user_cells(manifest):
        metadata, plan_path = validate_selection(manifest, cell)
        selection_path = BUILD / "selections" / cell.cell_id / "selection.json"
        inventory.append(
            {
                "cell": cell.cell_id,
                "selection_sha256": sha256_file(selection_path),
                "rendered_plan_sha256": sha256_file(plan_path),
                "checkpoint_sha256": metadata["checkpoint_sha256"],
            }
        )
    canonical = json.dumps(inventory, sort_keys=True, separators=(",", ":")).encode()
    return hashlib.sha256(canonical).hexdigest()


def validate_generation_result(
    manifest: dict[str, Any], cell: Cell, result: dict[str, Any]
) -> None:
    checkpoint = checkpoint_by_id(manifest, cell.checkpoint)
    selection, _ = validate_selection(manifest, cell)
    required = {
        "schema_version": "metarule-run-result-1.0.0",
        "cell": cell.cell_id,
        "kind": "user",
        "dataset": cell.dataset_id,
        "checkpoint": cell.checkpoint,
        "checkpoint_sha256": checkpoint["content_sha256"],
        "rendered_plan_sha256": selection.get("rendered_plan_sha256"),
    }
    for name, expected in required.items():
        if result.get(name) != expected:
            raise ExperimentError(f"held-out result has incompatible {name}: {cell.cell_id}")
    generation_status = result.get("generation_status")
    if generation_status not in {"completed", "model_failed", "timed_out"}:
        raise ExperimentError(f"held-out result has invalid generation status: {cell.cell_id}")
    candidate_hash = result.get("candidate_sha256")
    candidate = BUILD / "runs" / cell.cell_id / "candidate" / "M-star.sysml"
    if candidate_hash is not None and (
        not candidate.is_file() or sha256_file(candidate) != candidate_hash
    ):
        raise ExperimentError(f"held-out result candidate hash differs: {cell.cell_id}")
    if generation_status == "completed" and candidate_hash is None:
        raise ExperimentError(f"completed held-out result lacks a candidate: {cell.cell_id}")
    inventory = BUILD / "runs" / cell.cell_id / "evaluation" / "input-inventory.json"
    if not inventory.is_file():
        raise ExperimentError(f"held-out result lacks its input inventory: {cell.cell_id}")
    inventory_hash = hashlib.sha256(
        json.dumps(read_json(inventory), sort_keys=True).encode()
    ).hexdigest()
    if result.get("input_inventory_sha256") != inventory_hash:
        raise ExperimentError(f"held-out result input inventory differs: {cell.cell_id}")
    if result.get("score_status") not in (None, "not_run", "completed"):
        raise ExperimentError(f"held-out result has invalid score status: {cell.cell_id}")


def terminal_generation_result(manifest: dict[str, Any], cell: Cell) -> bool:
    path = run_result_path(cell)
    if not path.is_file():
        return False
    value = read_json(path)
    validate_generation_result(manifest, cell, value)
    return True


def run_user_cell(
    manifest: dict[str, Any], cell: Cell, auth_source: Path | None
) -> dict[str, Any]:
    if cell.kind != "user":
        raise ExperimentError("run_user_cell accepts only held-out user cells")
    result_path = run_result_path(cell)
    if terminal_generation_result(manifest, cell):
        return read_json(result_path)
    metadata, plan_path = validate_selection(manifest, cell)
    checkpoint = checkpoint_by_id(manifest, cell.checkpoint)
    run_root = stage_workspace(cell, plan_path)
    inventory_before = read_json(run_root / "evaluation" / "input-inventory.json")
    prompt = (EXPERIMENT / "prompt-user.md").read_text(encoding="utf-8")
    started_at = utc_now()
    code, session_id, elapsed = stream_codex(
        manifest,
        run_root,
        prompt,
        auth_source,
        timeout_seconds=int(manifest["model"]["session_active_timeout_seconds"]),
    )
    candidate = run_root / "candidate" / "M-star.sysml"
    generation_status = (
        "completed"
        if code == 0 and candidate.is_file()
        else "timed_out"
        if code == 124
        else "model_failed"
    )
    result = {
        "schema_version": "metarule-run-result-1.0.0",
        "cell": cell.cell_id,
        "kind": "user",
        "dataset": cell.dataset_id,
        "checkpoint": cell.checkpoint,
        "checkpoint_sha256": checkpoint["content_sha256"],
        "rendered_plan_sha256": metadata["rendered_plan_sha256"],
        "started_at": started_at,
        "finished_at": utc_now(),
        "active_seconds": elapsed,
        "codex_exit_code": code,
        "session_id": session_id,
        "generation_status": generation_status,
        "candidate_sha256": sha256_file(candidate) if candidate.is_file() else None,
        "input_inventory_sha256": hashlib.sha256(
            json.dumps(inventory_before, sort_keys=True).encode()
        ).hexdigest(),
        "score_status": "not_run",
    }
    write_json_atomic(result_path, result)
    return result


def append_json_line(path: Path, value: dict[str, Any]) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("a", encoding="utf-8") as stream:
        stream.write(json.dumps(value, sort_keys=True) + "\n")
        stream.flush()
        os.fsync(stream.fileno())


def command_run(args: argparse.Namespace) -> int:
    manifest = load_manifest()
    if manifest.get("state") != "sealed":
        raise ExperimentError("held-out execution requires a sealed experiment")
    cells = counterbalanced_user_cells(manifest)
    if args.cell:
        cells = [cell for cell in cells if cell.cell_id == args.cell]
        if not cells:
            raise ExperimentError(f"unknown held-out cell: {args.cell}")
    pending = [cell for cell in cells if not terminal_generation_result(manifest, cell)]
    if not pending:
        print("RUNS_ALREADY_COMPLETE")
        return 0
    settings = manifest["execution"]
    reserve = float(settings["memory_reserve_fraction"])
    sample_seconds = float(settings["memory_sample_seconds"])
    ramp_seconds = float(settings["ramp_observation_seconds"])
    maximum = int(settings["maximum_parallelism"])
    uncalibrated_minimum = float(
        settings["uncalibrated_minimum_available_fraction"]
    )
    ledger = BUILD / "scheduler.jsonl"
    observed_peak = 0
    if ledger.is_file():
        for line in ledger.read_text(encoding="utf-8").splitlines():
            try:
                record = json.loads(line)
            except json.JSONDecodeError:
                continue
            normalized = record.get("normalized_worker_peak_bytes")
            if isinstance(normalized, int) and normalized > 0:
                observed_peak = max(observed_peak, normalized)
            elif observed_peak == 0 and record.get("event") == "completed":
                legacy = record.get("observed_available_drop_bytes")
                if isinstance(legacy, int) and legacy > 0:
                    # The first legacy completion was the required serial calibration.
                    observed_peak = legacy
    target = 1
    calibrated = observed_peak > 0
    active: dict[concurrent.futures.Future[dict[str, Any]], dict[str, Any]] = {}
    completed_count = 0
    last_ramp = time.monotonic() - ramp_seconds if calibrated else time.monotonic()
    with concurrent.futures.ThreadPoolExecutor(max_workers=maximum) as executor:
        while pending or active:
            snapshot = memory_snapshot()
            now = time.monotonic()
            for state in active.values():
                state["minimum_available_bytes"] = min(
                    state["minimum_available_bytes"], int(snapshot["available_bytes"])
                )
                state["maximum_concurrent_workers"] = max(
                    state["maximum_concurrent_workers"], len(active)
                )
            finished = [future for future in active if future.done()]
            for future in finished:
                state = active.pop(future)
                drop = max(
                    0,
                    state["launch_available_bytes"] - state["minimum_available_bytes"],
                )
                normalized_drop = math.ceil(
                    drop / max(1, int(state["maximum_concurrent_workers"]))
                )
                observed_peak = max(observed_peak, normalized_drop)
                result = future.result()
                completed_count += 1
                if not calibrated:
                    calibrated = True
                    last_ramp = now
                append_json_line(
                    ledger,
                    {
                        "timestamp": utc_now(),
                        "event": "completed",
                        "cell": state["cell"],
                        "generation_status": result["generation_status"],
                        "observed_available_drop_bytes": drop,
                        "maximum_concurrent_workers": state[
                            "maximum_concurrent_workers"
                        ],
                        "normalized_worker_peak_bytes": normalized_drop,
                        "conservative_peak_bytes": observed_peak,
                    },
                )
            if (
                calibrated
                and target < maximum
                and now - last_ramp >= ramp_seconds
                and len(active) >= target
                and may_launch_worker(snapshot, reserve, observed_peak, len(active) + 1)
            ):
                target += int(settings["ramp_step"])
                target = min(target, maximum)
                last_ramp = now
                append_json_line(
                    ledger,
                    {
                        "timestamp": utc_now(),
                        "event": "ramp",
                        "target_parallelism": target,
                        "available_fraction": snapshot["available_fraction"],
                        "conservative_peak_bytes": observed_peak,
                    },
                )
            while (
                pending
                and len(active) < target
                and (not active or calibrated)
                and (
                    calibrated
                    or float(snapshot["available_fraction"]) >= uncalibrated_minimum
                )
                and may_launch_worker(snapshot, reserve, observed_peak, len(active) + 1)
            ):
                cell = pending.pop(0)
                future = executor.submit(run_user_cell, manifest, cell, args.auth_source)
                active[future] = {
                    "cell": cell.cell_id,
                    "launch_available_bytes": int(snapshot["available_bytes"]),
                    "minimum_available_bytes": int(snapshot["available_bytes"]),
                    "maximum_concurrent_workers": len(active) + 1,
                }
                append_json_line(
                    ledger,
                    {
                        "timestamp": utc_now(),
                        "event": "launch",
                        "cell": cell.cell_id,
                        "active_workers": len(active),
                        "target_parallelism": target,
                        "available_fraction": snapshot["available_fraction"],
                        "reserve_fraction": reserve,
                        "conservative_peak_bytes": observed_peak,
                    },
                )
                if not calibrated:
                    break
                snapshot = memory_snapshot()
            append_json_line(
                ledger,
                {
                    "timestamp": utc_now(),
                    "event": "sample",
                    "active_workers": len(active),
                    "pending_workers": len(pending),
                    "target_parallelism": target,
                    **snapshot,
                },
            )
            if pending or active:
                time.sleep(sample_seconds)
    print(f"RUN_COMPLETE requested={len(cells)} newly_completed={completed_count}")
    return 0


def logged_process(
    command: list[str], log: Path, *, cwd: Path, environment: dict[str, str], timeout: int
) -> tuple[int, str]:
    log.parent.mkdir(parents=True, exist_ok=True)
    process = subprocess.Popen(
        command,
        cwd=cwd,
        env=environment,
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        start_new_session=True,
    )
    try:
        output, _ = process.communicate(timeout=timeout)
        output = output or ""
        code = process.returncode
    except subprocess.TimeoutExpired as exc:
        os.killpg(process.pid, signal.SIGTERM)
        try:
            terminated, _ = process.communicate(timeout=5)
        except subprocess.TimeoutExpired:
            os.killpg(process.pid, signal.SIGKILL)
            terminated, _ = process.communicate()
        partial = terminated if terminated is not None else exc.stdout or b""
        output = (
            partial.decode("utf-8", errors="replace")
            if isinstance(partial, bytes)
            else partial
        ) + "\nEVALUATOR_TIMEOUT\n"
        code = 124
    log.write_text(output, encoding="utf-8")
    return code, output


def classify_prepare_result(code: int, output: str) -> tuple[str, str]:
    if code == 0:
        return "passed", "passed"
    if code == 124:
        return "timed_out", "not_run"
    if "ORIGINAL_MODEL_LOGIKA_FAILED" in output:
        return "failed", "not_run"
    if "EXECUTABLE_CODEGEN_FAILED" in output:
        return "passed", "failed"
    return "infrastructure_failed", "not_run"


def classify_semantic_result(code: int, output: str) -> str:
    if code == 0 and "EQUIVALENT" in output:
        return "equivalent"
    if code == 124:
        return "timed_out"
    if "INCONCLUSIVE" in output:
        return "inconclusive"
    if "INVALID_INPUT" in output or "VERIFIED_DIFFERENCE" in output or code == 1:
        return "different"
    return "infrastructure_failed"


def detailed_semantic_verdict(code: int, output: str) -> str:
    if code == 124:
        return "timed_out"
    for token, verdict in (
        ("CANDIDATE_STRONGER", "candidate_stronger"),
        ("CANDIDATE_WEAKER", "candidate_weaker"),
        ("INCOMPARABLE", "incomparable"),
        ("EQUIVALENT", "equivalent"),
        ("INCONCLUSIVE", "inconclusive"),
        ("INVALID_INPUT", "invalid_input"),
    ):
        if token in output:
            return verdict
    if "VERIFIED_DIFFERENCE" in output or code == 1:
        return "different_unspecified"
    return "infrastructure_failed"


def score_user_cell(
    manifest: dict[str, Any],
    cell: Cell,
    *,
    retry_semantic_timeout: bool = False,
) -> dict[str, Any]:
    result_path = run_result_path(cell)
    result = read_json(result_path)
    validate_generation_result(manifest, cell, result)
    equivalence_timeout = int(manifest["model"]["equivalence_timeout_seconds"])
    retrying = (
        retry_semantic_timeout
        and result.get("score_status") == "completed"
        and result.get("generation_status") == "completed"
        and result.get("semantic_status") == "timed_out"
        and int(result.get("equivalence_timeout_seconds", 0)) < equivalence_timeout
    )
    if result.get("score_status") not in (None, "not_run") and not retrying:
        return result
    if retrying:
        attempts = result.setdefault("score_attempts", [])
        attempts.append(
            {
                key: result.get(key)
                for key in (
                    "scored_at",
                    "gates",
                    "semantic_status",
                    "semantic_verdict",
                    "proof_passed",
                    "final_status",
                    "verification_attempt",
                    "equivalence_timeout_seconds",
                )
            }
        )
    if result.get("generation_status") != "completed":
        result["score_status"] = "completed"
        result["final_status"] = result["generation_status"]
        write_json_atomic(result_path, result)
        return result
    run_root = BUILD / "runs" / cell.cell_id
    candidate_root = run_root / "candidate"
    candidate = candidate_root / "M-star.sysml"
    if not candidate.is_file() or sha256_file(candidate) != result.get("candidate_sha256"):
        raise ExperimentError(f"candidate changed after generation: {cell.cell_id}")
    evaluation = run_root / "evaluation"
    verification = next_attempt_directory(evaluation / "verification")
    verification.mkdir(parents=True, exist_ok=True)
    library = candidate_root / "external" / "sysml-aadl-libraries"
    if not library.is_dir():
        library = REPO / "external" / "sysml-aadl-libraries"
    if not library.is_dir():
        raise ExperimentError(
            "SysML/AADL library is missing from both the run and repository"
        )
    environment = {
        "PATH": os.environ.get("PATH", "/usr/local/bin:/usr/bin:/bin"),
        "HOME": str(evaluation / ".home"),
        "TMPDIR": str(evaluation / ".tmp"),
        "SIREUM_HOME": str(sireum_home()),
        "LANG": "C.UTF-8",
        "LC_ALL": "C.UTF-8",
        "PYTHONPATH": str(REPO / "src"),
        "EQUIV_CHECKER_ROOT": str(REPO),
        "EQUIV_TIMEOUT_SECONDS": str(manifest["model"]["equivalence_timeout_seconds"]),
    }
    Path(environment["HOME"]).mkdir(parents=True, exist_ok=True)
    Path(environment["TMPDIR"]).mkdir(parents=True, exist_ok=True)
    gates: dict[str, dict[str, Any]] = {}
    try:
        if str(REPO / "src") not in sys.path:
            sys.path.insert(0, str(REPO / "src"))
        from equiv_checker.model_gate import compare_model_fingerprints, fingerprint_model

        seed_fingerprint = fingerprint_model(
            dataset_paths(cell.dataset_id)["model"],
            sireum_home=sireum_home(),
            library_dir=library,
            output_path=verification / "seed-structure.json",
        )
        candidate_fingerprint = fingerprint_model(
            candidate,
            sireum_home=sireum_home(),
            library_dir=library,
            output_path=verification / "candidate-structure.json",
        )
        comparison = compare_model_fingerprints(seed_fingerprint, candidate_fingerprint)
        gates["structure_unchanged"] = {
            "status": "passed" if comparison.matches else "failed",
            "seed_fingerprint": seed_fingerprint.canonical_ast_sha256,
            "candidate_fingerprint": candidate_fingerprint.canonical_ast_sha256,
            "reason": comparison.reason,
        }
    except Exception as exc:
        gates["structure_unchanged"] = {
            "status": "infrastructure_failed",
            "detail": str(exc),
        }
    prepared = verification / "prepared"
    isolated_input = verification / "input"
    isolated_input.mkdir(exist_ok=True)
    copy_exact(candidate, isolated_input / "M-star.sysml")
    copy_exact(candidate_root / "N.md", isolated_input / "N.md")
    prepare_code, prepare_output = logged_process(
        [
            str(REPO / "scripts" / "prepare_executable_candidate.sh"),
            str(isolated_input / "M-star.sysml"),
            str(prepared),
            str(library),
        ],
        verification / "prepare.log",
        cwd=REPO,
        environment=environment,
        timeout=900,
    )
    model_logika_status, hamr_status = classify_prepare_result(
        prepare_code, prepare_output
    )
    gates["model_logika"] = {"status": model_logika_status}
    gates["hamr_codegen"] = {"status": hamr_status}
    application_status = "not_run"
    component_status = "not_run"
    if prepare_code == 0:
        generated_root = prepared / "hamr" / "slang" / "src" / "main" / "component"
        candidate_generated = candidate_root / "executable" / "hamr" / "slang" / "src" / "main" / "component"
        allowlist = prepared / "generated-component-files.txt"
        expected = [line.strip() for line in allowlist.read_text(encoding="utf-8").splitlines() if line.strip()]
        candidate_files = (
            sorted(
                str(path.relative_to(candidate_root / "executable" / "hamr" / "slang"))
                for path in candidate_generated.rglob("*.scala")
            )
            if candidate_generated.is_dir()
            else []
        )
        if candidate_files == expected:
            for relative in expected:
                shutil.copy2(
                    candidate_root / "executable" / "hamr" / "slang" / relative,
                    prepared / "hamr" / "slang" / relative,
                )
            application_status = "passed"
            proof_code, _ = logged_process(
                [
                    str(prepared / "run-logika.sh"),
                    str(prepared / "hamr" / "slang"),
                    str(prepared / "proof"),
                ],
                verification / "component-logika.log",
                cwd=REPO,
                environment=environment,
                timeout=max(900, 240 * len(expected)),
            )
            component_status = "passed" if proof_code == 0 else "timed_out" if proof_code == 124 else "failed"
        else:
            application_status = "failed"
            (verification / "application-inventory.json").write_text(
                json.dumps({"expected": expected, "observed": candidate_files}, indent=2) + "\n",
                encoding="utf-8",
            )
    gates["generated_application"] = {"status": application_status}
    gates["component_logika"] = {"status": component_status}
    semantic_code, semantic_output = logged_process(
        [str(REPO / "scripts" / "evaluate.sh"), cell.dataset_id, str(candidate)],
        verification / "semantic.log",
        cwd=REPO,
        environment=environment,
        timeout=int(manifest["model"]["equivalence_timeout_seconds"]) + 120,
    )
    semantic_status = classify_semantic_result(semantic_code, semantic_output)
    semantic_verdict = detailed_semantic_verdict(semantic_code, semantic_output)
    gates["hidden_semantics"] = {
        "status": semantic_status,
        "verdict": semantic_verdict,
        "exit_code": semantic_code,
    }
    proof_passed = all(
        gates[name]["status"] == "passed"
        for name in (
            "structure_unchanged",
            "model_logika",
            "hamr_codegen",
            "generated_application",
            "component_logika",
        )
    )
    if semantic_status == "equivalent" and proof_passed:
        final_status = "passed"
    elif semantic_status in ("timed_out", "inconclusive", "infrastructure_failed"):
        final_status = semantic_status
    elif semantic_status != "equivalent":
        final_status = "semantic_failed"
    else:
        final_status = "proof_failed"
    if sha256_file(candidate) != result["candidate_sha256"]:
        raise ExperimentError(f"scoring changed the semantic candidate: {cell.cell_id}")
    result.update(
        {
            "score_status": "completed",
            "scored_at": utc_now(),
            "gates": gates,
            "semantic_status": semantic_status,
            "semantic_verdict": semantic_verdict,
            "proof_passed": proof_passed,
            "final_status": final_status,
            "verification_attempt": str(verification.relative_to(evaluation)),
            "equivalence_timeout_seconds": equivalence_timeout,
        }
    )
    write_json_atomic(result_path, result)
    return result


def symmetric_embedding_distance(
    client: EmbeddingClient, left: str | list[str], right: str | list[str]
) -> tuple[float, dict[str, Any]]:
    left_chunks = text_chunks(left) if isinstance(left, str) else left
    right_chunks = text_chunks(right) if isinstance(right, str) else right
    if not left_chunks or not right_chunks:
        raise ExperimentError("embedding distance requires non-empty unit sets")
    inputs = [*left_chunks, *right_chunks]
    vectors, usage = client.embed(inputs)
    left_vectors = vectors[: len(left_chunks)]
    right_vectors = vectors[len(left_chunks) :]
    left_distances = [
        min(cosine_distance(vector, other) for other in right_vectors)
        for vector in left_vectors
    ]
    right_distances = [
        min(cosine_distance(vector, other) for other in left_vectors)
        for vector in right_vectors
    ]
    distance = (sum(left_distances) + sum(right_distances)) / (
        len(left_distances) + len(right_distances)
    )
    return distance, {
        "aggregation": "symmetric-mean-nearest-chunk-cosine-distance",
        "left_chunk_sha256": [hashlib.sha256(item.encode()).hexdigest() for item in left_chunks],
        "right_chunk_sha256": [hashlib.sha256(item.encode()).hexdigest() for item in right_chunks],
        "vectors": vectors,
        "usage": usage,
    }


def sireum_contract_units(model: Path, library: Path, evidence: Path) -> list[str]:
    """Bind parser-certified GUMBO text to Sireum-resolved owner/phase records."""

    if str(REPO / "src") not in sys.path:
        sys.path.insert(0, str(REPO / "src"))
    from equiv_checker.inventory import run_inventory
    from sysml_tools.gumbo import parser_spans, resolve_sireum_toolchain

    evidence.parent.mkdir(parents=True, exist_ok=True)
    inventory = run_inventory(
        model,
        sireum_home=sireum_home(),
        library_dir=library,
        output_path=evidence,
    )
    source = model.read_text(encoding="utf-8")
    spans = parser_spans(model, resolve_sireum_toolchain(sireum_home()))
    units: list[str] = []
    for span in spans:
        owners = sorted(
            (
                owner
                for owner in inventory.contract_owners
                if owner.source is not None
                and owner.source.offset is not None
                and span.start <= owner.source.offset < span.end
            ),
            key=lambda owner: (owner.classifier, owner.phase),
        )
        if not owners:
            raise ExperimentError(
                f"Sireum GUMBO span at {span.start}:{span.end} has no resolved owner/phase"
            )
        gumbo = source[span.start : span.end]
        for owner in owners:
            units.append(
                f"Resolved owner: {owner.classifier}\nResolved phase: {owner.phase}\n{gumbo}"
            )
    if not units:
        units.append("Resolved owner: <NONE>\nResolved phase: <NONE>\n<NO RESOLVED GUMBO CONTRACTS>")
    return units


def evaluator_mechanical_gates(
    candidate_root: Path, seed: Path, output: Path
) -> tuple[dict[str, bool], dict[str, Any]]:
    output.mkdir(parents=True, exist_ok=True)
    candidate = candidate_root / "M-star.sysml"
    library = candidate_root / "external" / "sysml-aadl-libraries"
    details: dict[str, Any] = {}
    structure = False
    try:
        if str(REPO / "src") not in sys.path:
            sys.path.insert(0, str(REPO / "src"))
        from equiv_checker.model_gate import compare_model_fingerprints, fingerprint_model

        left = fingerprint_model(
            seed,
            sireum_home=sireum_home(),
            library_dir=library,
            output_path=output / "seed-structure.json",
        )
        right = fingerprint_model(
            candidate,
            sireum_home=sireum_home(),
            library_dir=library,
            output_path=output / "candidate-structure.json",
        )
        comparison = compare_model_fingerprints(left, right)
        structure = comparison.matches
        details["structure"] = {
            "seed": left.canonical_ast_sha256,
            "candidate": right.canonical_ast_sha256,
            "reason": comparison.reason,
        }
    except Exception as exc:
        details["structure"] = {"error": str(exc)}
    environment = {
        "PATH": os.environ.get("PATH", "/usr/local/bin:/usr/bin:/bin"),
        "HOME": str(output / ".home"),
        "TMPDIR": str(output / ".tmp"),
        "SIREUM_HOME": str(sireum_home()),
        "LANG": "C.UTF-8",
        "LC_ALL": "C.UTF-8",
    }
    Path(environment["HOME"]).mkdir(exist_ok=True)
    Path(environment["TMPDIR"]).mkdir(exist_ok=True)
    prepared = output / "prepared"
    isolated_input = output / "input"
    isolated_input.mkdir(exist_ok=True)
    copy_exact(candidate, isolated_input / "M-star.sysml")
    copy_exact(candidate_root / "N.md", isolated_input / "N.md")
    code, prepare_output = logged_process(
        [
            str(REPO / "scripts" / "prepare_executable_candidate.sh"),
            str(isolated_input / "M-star.sysml"),
            str(prepared),
            str(library),
        ],
        output / "prepare.log",
        cwd=REPO,
        environment=environment,
        timeout=900,
    )
    model_logika = code == 0 or "EXECUTABLE_CODEGEN_FAILED" in prepare_output
    hamr = code == 0
    application = False
    component_logika = False
    if code == 0:
        expected = [
            line.strip()
            for line in (prepared / "generated-component-files.txt")
            .read_text(encoding="utf-8")
            .splitlines()
            if line.strip()
        ]
        application_roots = sorted(
            (
                slang
                for path in candidate_root.iterdir()
                if path.is_dir() and "executable" in path.name
                for slang in (path / "hamr" / "slang",)
                if slang.is_dir()
            ),
            key=lambda path: path.stat().st_mtime,
            reverse=True,
        )
        source_root = candidate_root / "executable" / "hamr" / "slang"
        observed: list[str] = []
        for possible in application_roots:
            components = possible / "src" / "main" / "component"
            files = (
                sorted(str(path.relative_to(possible)) for path in components.rglob("*.scala"))
                if components.is_dir()
                else []
            )
            if files == expected:
                source_root = possible
                observed = files
                break
        application = observed == expected
        details["application_inventory"] = {
            "expected": expected,
            "observed": observed,
            "selected_root": str(source_root.relative_to(candidate_root)),
        }
        if application:
            for relative in expected:
                shutil.copy2(source_root / relative, prepared / "hamr" / "slang" / relative)
            proof_code, _ = logged_process(
                [
                    str(prepared / "run-logika.sh"),
                    str(prepared / "hamr" / "slang"),
                    str(prepared / "proof"),
                ],
                output / "component-logika.log",
                cwd=REPO,
                environment=environment,
                timeout=max(900, 240 * len(expected)),
            )
            component_logika = proof_code == 0
    return {
        "structure_unchanged": structure,
        "model_logika": model_logika,
        "hamr_codegen": hamr,
        "generated_application": application,
        "component_logika": component_logika,
    }, details


def training_cell(manifest: dict[str, Any], checkpoint_id: str) -> Cell:
    checkpoint = checkpoint_by_id(manifest, checkpoint_id)
    if checkpoint_id == "M0":
        raise ExperimentError("M0 is not a training output")
    return Cell("train", str(checkpoint["training_dataset"]), checkpoint_id)


def next_attempt_directory(base: Path) -> Path:
    if not base.exists() or not any(base.iterdir()):
        return base
    index = 2
    while base.with_name(f"{base.name}-attempt-{index:02d}").exists():
        index += 1
    return base.with_name(f"{base.name}-attempt-{index:02d}")


def command_train(args: argparse.Namespace) -> int:
    manifest = load_manifest()
    if manifest.get("state") == "sealed":
        raise ExperimentError("sealed experiment cannot be trained")
    preflight_path = BUILD / "preflight.json"
    if not preflight_path.is_file() or read_json(preflight_path).get("depth") != "deep":
        raise ExperimentError("training requires a passing `preflight --deep`")
    checkpoint = checkpoint_by_id(manifest, args.checkpoint)
    parent = checkpoint_by_id(manifest, str(checkpoint["parent"]))
    if not parent.get("path") or not parent.get("content_sha256"):
        raise ExperimentError("incoming parent checkpoint is not frozen")
    parent_path = resolve_manifest_path(str(parent["path"]))
    if sha256_file(parent_path) != parent["content_sha256"]:
        raise ExperimentError("incoming parent checkpoint hash differs")
    key = read_private_key(args.embedding_key_file)
    cell = training_cell(manifest, args.checkpoint)
    run_root = BUILD / "runs" / cell.cell_id
    stage_path = run_root / "stage.json"
    existing_stage = read_json(stage_path) if stage_path.exists() else None
    if existing_stage and existing_stage.get("status") == "proposals_complete":
        stage = completed_training_stage(args.checkpoint)
        for proposal_id in stage["proposals"]:
            validate_proposal(manifest, args.checkpoint, proposal_id)
        print(f"TRAINING_ALREADY_COMPLETE checkpoint={args.checkpoint}")
        return 0
    snapshot = memory_snapshot()
    minimum = float(
        manifest["execution"]["uncalibrated_minimum_available_fraction"]
    )
    if float(snapshot["available_fraction"]) < minimum:
        raise ExperimentError(
            f"training launch deferred: available RAM {float(snapshot['available_fraction']):.1%} "
            f"is below the uncalibrated safety floor {minimum:.1%}"
        )
    if existing_stage and existing_stage.get("status") == "blind_failed":
        raise ExperimentError(
            f"blind phase is terminal for {args.checkpoint}; preserve it and start a replacement only by explicit cleanup"
        )
    if not run_root.exists():
        run_root = stage_workspace(cell, parent_path)
    prompt = (EXPERIMENT / "prompt-train.md").read_text(encoding="utf-8")
    blind_prompt = prompt + "\n\nThe oracle is not available yet. Complete and validate the blind baseline, then stop. Do not propose Meta-Rules in this phase.\n"
    total_budget = int(manifest["model"]["session_active_timeout_seconds"])
    candidate = run_root / "candidate" / "M-star.sysml"
    evaluation = run_root / "evaluation"
    blind_candidate = evaluation / "blind-candidate.sysml"
    if existing_stage and existing_stage.get("status") in (
        "blind_complete",
        "supervised_failed",
        "supervised_complete",
    ):
        session_id = str(existing_stage["session_id"])
        blind_seconds = float(existing_stage["blind_seconds"])
        prior_supervised_seconds = float(existing_stage.get("supervised_seconds", 0.0))
        if existing_stage.get("status") == "supervised_complete":
            prior_supervised_seconds = 0.0
        if not blind_candidate.is_file():
            raise ExperimentError("resumable training stage lacks its frozen blind candidate")
    else:
        code, session_id, blind_seconds = stream_codex(
            manifest,
            run_root,
            blind_prompt,
            args.auth_source,
            timeout_seconds=total_budget,
        )
        prior_supervised_seconds = 0.0
        if code != 0 or not session_id or not candidate.is_file():
            write_json_atomic(
                stage_path,
                {
                    "schema_version": "metarule-training-stage-1.0.0",
                    "checkpoint": args.checkpoint,
                    "status": "blind_failed",
                    "codex_exit_code": code,
                    "active_seconds": blind_seconds,
                },
            )
            raise ExperimentError(f"blind training phase failed for {args.checkpoint}")
        shutil.copy2(candidate, blind_candidate)
        write_json_atomic(
            stage_path,
            {
                "schema_version": "metarule-training-stage-1.0.0",
                "checkpoint": args.checkpoint,
                "training_dataset": cell.dataset_id,
                "status": "blind_complete",
                "session_id": session_id,
                "blind_seconds": blind_seconds,
                "blind_candidate_sha256": sha256_file(blind_candidate),
            },
        )
    paths = dataset_paths(cell.dataset_id)
    supervision = run_root / "candidate" / "supervision"
    supervision.mkdir(exist_ok=True)
    copy_exact(paths["oracle"], supervision / "oracle.txt")
    copy_exact(blind_candidate, supervision / "blind-candidate.txt")
    remaining = total_budget - math.ceil(blind_seconds + prior_supervised_seconds)
    if remaining <= 0:
        raise ExperimentError(f"blind phase exhausted the active training budget for {args.checkpoint}")
    supervised_prompt = f"""The evaluator has opened the supervised phase. You may now inspect
`supervision/oracle.txt` and `supervision/blind-candidate.txt`; they contain SysML but deliberately
use non-source suffixes so Sireum will not load them beside the candidate. Correct `M-star.sysml`, rerun every
available validation gate, then use the developer-mode methodology in `{METHODOLOGY_FILENAME}` to
extract reusable proposed rules into `proposed-rules.md`.

### MR-<UNIQUE-ID>
<paper-informed, auditable Meta-Rule record>

The heading is only a machine envelope so rules can be selected and audited. Do not conform to an
evaluator-invented field schema. Let the paper's Meta-Rule definition, toy rule, ExtractRule
template, verifier feedback, and solved requirement-to-GUMBO episode determine the record's form
and content. Preserve the paper's distinctions among linguistic triggers, formalization choices,
structural placement, naming/toolchain expectations, and repair knowledge where they are supported
by this episode. Do not edit `Gumbo_FSE_agent_Plan.md`. Generalize beyond task-specific names and
oracle clauses. Finish within the remaining active budget and then stop.
"""
    rules_path = run_root / "candidate" / "proposed-rules.md"
    recovered_completed_turn = False
    resume_transcript = evaluation / "transcripts" / "resume-01.jsonl"
    if existing_stage and existing_stage.get("status") == "blind_complete" and rules_path.is_file() and resume_transcript.is_file():
        recovered_completed_turn = '"type":"turn.completed"' in resume_transcript.read_text(
            encoding="utf-8", errors="replace"
        )
    if existing_stage and existing_stage.get("status") == "supervised_complete":
        supervised_seconds = float(existing_stage["supervised_seconds"])
        code = 0
        resumed_session = session_id
    elif recovered_completed_turn:
        prompt_marker = evaluation / "transcripts" / "resume-01.prompt.txt"
        supervised_seconds = max(
            0.0, resume_transcript.stat().st_mtime - prompt_marker.stat().st_mtime
        )
        code = 0
        resumed_session = session_id
    else:
        code, resumed_session, supervised_seconds = stream_codex(
            manifest,
            run_root,
            supervised_prompt,
            args.auth_source,
            resume_session=session_id,
            timeout_seconds=remaining,
        )
    if code != 0 or (resumed_session and resumed_session != session_id) or not rules_path.is_file():
        write_json_atomic(
            stage_path,
            {
                "schema_version": "metarule-training-stage-1.0.0",
                "checkpoint": args.checkpoint,
                "training_dataset": cell.dataset_id,
                "status": "supervised_failed",
                "session_id": session_id,
                "blind_seconds": blind_seconds,
                "supervised_seconds": prior_supervised_seconds + supervised_seconds,
                "codex_exit_code": code,
            },
        )
        raise ExperimentError(f"supervised training phase failed for {args.checkpoint}")
    write_json_atomic(
        stage_path,
        {
            "schema_version": "metarule-training-stage-1.0.0",
            "checkpoint": args.checkpoint,
            "training_dataset": cell.dataset_id,
            "status": "supervised_complete",
            "session_id": session_id,
            "blind_seconds": blind_seconds,
            "supervised_seconds": prior_supervised_seconds + supervised_seconds,
            "blind_candidate_sha256": sha256_file(blind_candidate),
            "improved_candidate_sha256": sha256_file(candidate),
        },
    )
    proposed_text = rules_path.read_text(encoding="utf-8").strip()
    temporary_plan = replace_learned_region(
        parent_path.read_text(encoding="utf-8"),
        [rule.source for rule in parse_meta_rules(parent_path.read_text(encoding="utf-8"))]
        + ([proposed_text] if proposed_text else []),
    )
    proposed_rules = parse_meta_rules(temporary_plan)
    if len(proposed_rules) == len(parse_meta_rules(parent_path.read_text(encoding="utf-8"))):
        proposals: list[str] = []
    else:
        proposal_id = "P0001"
        directory = proposal_directory(args.checkpoint, proposal_id)
        directory.mkdir(parents=True, exist_ok=True)
        plan_path = directory / "plan.md"
        if plan_path.exists() and plan_path.read_text(encoding="utf-8") != temporary_plan:
            raise ExperimentError(f"refusing to overwrite changed proposal plan: {plan_path}")
        plan_path.write_text(temporary_plan, encoding="utf-8")
        proposal_path = directory / "proposal.json"
        if proposal_path.is_file():
            validate_proposal(manifest, args.checkpoint, proposal_id)
            proposals = [proposal_id]
            secret_leak_scan(run_root, key)
            write_json_atomic(
                stage_path,
                {
                    "schema_version": "metarule-training-stage-1.0.0",
                    "checkpoint": args.checkpoint,
                    "training_dataset": cell.dataset_id,
                    "status": "proposals_complete",
                    "proposals": proposals,
                    "active_seconds": blind_seconds
                    + prior_supervised_seconds
                    + supervised_seconds,
                    "session_id": session_id,
                },
            )
            print(
                f"TRAINING_PROPOSALS_READY checkpoint={args.checkpoint} proposals=1 "
                f"active_seconds={blind_seconds + prior_supervised_seconds + supervised_seconds:.1f}"
            )
            return 0
        settings = manifest["embedding"]
        client = EmbeddingClient(key, str(settings["model"]), int(settings["dimensions"]))
        library = run_root / "candidate" / "external" / "sysml-aadl-libraries"
        inventory_evidence = evaluation / "training-inventories"
        oracle_units = sireum_contract_units(
            paths["oracle"], library, inventory_evidence / "oracle.json"
        )
        blind_units = sireum_contract_units(
            blind_candidate, library, inventory_evidence / "blind.json"
        )
        candidate_units = sireum_contract_units(
            candidate, library, inventory_evidence / "candidate.json"
        )
        baseline_distance, baseline_evidence = symmetric_embedding_distance(
            client, blind_units, oracle_units
        )
        candidate_distance, candidate_evidence = symmetric_embedding_distance(
            client, candidate_units, oracle_units
        )
        relative = (
            (baseline_distance - candidate_distance) / baseline_distance
            if baseline_distance > 0.0
            else 0.0
        )
        gate_output = next_attempt_directory(
            evaluation / "proposal-gates" / proposal_id
        )
        gates, gate_details = evaluator_mechanical_gates(
            run_root / "candidate", paths["model"], gate_output
        )
        gate_details["evidence_directory"] = str(gate_output.relative_to(run_root))
        gates["relative_embedding_improvement"] = relative >= float(
            settings["relative_improvement"]
        )
        embedding_path = directory / "embedding-evidence.json"
        write_json_immutable(
            embedding_path,
            {
                "schema_version": "metarule-training-embedding-1.0.0",
                "model": settings["model"],
                "dimensions": settings["dimensions"],
                "baseline_distance": baseline_distance,
                "candidate_distance": candidate_distance,
                "relative_improvement": relative,
                "required_relative_improvement": settings["relative_improvement"],
                "baseline": baseline_evidence,
                "candidate": candidate_evidence,
            },
        )
        write_json_immutable(
            proposal_path,
            {
                "schema_version": "metarule-proposal-1.0.0",
                "proposal_id": proposal_id,
                "checkpoint": args.checkpoint,
                "training_dataset": cell.dataset_id,
                "parent_content_sha256": parent["content_sha256"],
                "candidate_content_sha256": sha256_file(plan_path),
                "mechanically_eligible": all(gates.values()),
                "gates": gates,
                "gate_details": gate_details,
                "embedding_evidence_sha256": sha256_file(embedding_path),
                "gate_evidence_sha256": artifact_tree_sha256(gate_output),
                "relative_embedding_improvement": relative,
                "blind_candidate_sha256": sha256_file(blind_candidate),
                "improved_candidate_sha256": sha256_file(candidate),
            },
        )
        proposals = [proposal_id]
    secret_leak_scan(run_root, key)
    write_json_atomic(
        stage_path,
        {
            "schema_version": "metarule-training-stage-1.0.0",
            "checkpoint": args.checkpoint,
            "training_dataset": cell.dataset_id,
            "status": "proposals_complete",
            "proposals": proposals,
            "active_seconds": blind_seconds + prior_supervised_seconds + supervised_seconds,
            "session_id": session_id,
        },
    )
    print(
        f"TRAINING_PROPOSALS_READY checkpoint={args.checkpoint} proposals={len(proposals)} "
        f"active_seconds={blind_seconds + prior_supervised_seconds + supervised_seconds:.1f}"
    )
    return 0


def command_score(args: argparse.Namespace) -> int:
    manifest = load_manifest()
    if manifest.get("state") != "sealed":
        raise ExperimentError("scoring requires a sealed experiment")
    configured_timeout = int(manifest["model"]["equivalence_timeout_seconds"])
    requested_timeout = (
        int(args.equivalence_timeout_seconds)
        if args.equivalence_timeout_seconds is not None
        else configured_timeout
    )
    if requested_timeout < configured_timeout:
        raise ExperimentError(
            "evaluator timeout override may not be lower than the sealed definition"
        )
    if requested_timeout <= 0:
        raise ExperimentError("evaluator timeout must be positive")
    if requested_timeout != configured_timeout:
        manifest = {
            **manifest,
            "model": {
                **manifest["model"],
                "equivalence_timeout_seconds": requested_timeout,
            },
        }
    settings = manifest["execution"]
    reserve = (
        float(args.memory_reserve_fraction)
        if args.memory_reserve_fraction is not None
        else float(settings["memory_reserve_fraction"])
    )
    maximum = (
        int(args.maximum_parallelism)
        if args.maximum_parallelism is not None
        else int(settings["maximum_parallelism"])
    )
    ramp_seconds = (
        float(args.ramp_observation_seconds)
        if args.ramp_observation_seconds is not None
        else float(settings["ramp_observation_seconds"])
    )
    if not 0.0 <= reserve < 1.0:
        raise ExperimentError("memory reserve fraction must be in [0, 1)")
    if maximum <= 0:
        raise ExperimentError("maximum parallelism must be positive")
    if ramp_seconds < 0:
        raise ExperimentError("ramp observation seconds cannot be negative")
    allocated_cpus = (
        len(os.sched_getaffinity(0))
        if hasattr(os, "sched_getaffinity")
        else (os.cpu_count() or 1)
    )
    if maximum > allocated_cpus:
        raise ExperimentError(
            f"maximum parallelism {maximum} exceeds the {allocated_cpus} CPUs visible to this job"
        )
    policy_ledger = BUILD / "evaluator-policy.jsonl"
    policy = {
        "event": "score-policy",
        "sealed_equivalence_timeout_seconds": configured_timeout,
        "effective_equivalence_timeout_seconds": requested_timeout,
        "retry_semantic_timeouts": bool(args.rescore_semantic_timeouts),
        "maximum_parallelism": maximum,
        "memory_reserve_fraction": reserve,
        "ramp_observation_seconds": ramp_seconds,
        "allocated_cpus": allocated_cpus,
    }
    prior_policy = None
    if policy_ledger.is_file():
        for line in reversed(policy_ledger.read_text(encoding="utf-8").splitlines()):
            try:
                prior_policy = json.loads(line)
                break
            except json.JSONDecodeError:
                continue
    if prior_policy is None or any(prior_policy.get(key) != value for key, value in policy.items()):
        append_json_line(policy_ledger, {"timestamp": utc_now(), **policy})
    cells = user_cells(manifest)
    if args.cell:
        cells = [cell for cell in cells if cell.cell_id == args.cell]
        if not cells:
            raise ExperimentError(f"unknown held-out cell: {args.cell}")
    available_cells = [cell for cell in cells if run_result_path(cell).is_file()]
    pending = []
    for cell in available_cells:
        result = read_json(run_result_path(cell))
        needs_initial_score = result.get("score_status") != "completed"
        needs_timeout_retry = (
            args.rescore_semantic_timeouts
            and result.get("generation_status") == "completed"
            and result.get("semantic_status") == "timed_out"
            and int(result.get("equivalence_timeout_seconds", 0)) < requested_timeout
        )
        if needs_initial_score or needs_timeout_retry:
            pending.append(cell)
    sample_seconds = float(settings["memory_sample_seconds"])
    uncalibrated_minimum = float(
        settings["uncalibrated_minimum_available_fraction"]
    )
    ledger = BUILD / "score-scheduler.jsonl"
    print(
        f"SCORE_RESOURCES allocated_cpus={allocated_cpus} maximum_parallelism={maximum} "
        f"memory_reserve_fraction={reserve:g} ramp_observation_seconds={ramp_seconds:g} "
        f"equivalence_timeout_seconds={requested_timeout}",
        flush=True,
    )
    observed_peak = 0
    if ledger.is_file():
        for line in ledger.read_text(encoding="utf-8").splitlines():
            try:
                record = json.loads(line)
            except json.JSONDecodeError:
                continue
            normalized = record.get("normalized_worker_peak_bytes")
            if isinstance(normalized, int) and normalized > 0:
                observed_peak = max(observed_peak, normalized)
    target = 1
    calibrated = observed_peak > 0
    active: dict[concurrent.futures.Future[dict[str, Any]], dict[str, Any]] = {}
    last_ramp = time.monotonic() - ramp_seconds if calibrated else time.monotonic()
    with concurrent.futures.ThreadPoolExecutor(max_workers=maximum) as executor:
        while pending or active:
            snapshot = memory_snapshot()
            now = time.monotonic()
            for state in active.values():
                state["minimum_available_bytes"] = min(
                    state["minimum_available_bytes"], int(snapshot["available_bytes"])
                )
                state["maximum_concurrent_workers"] = max(
                    state["maximum_concurrent_workers"], len(active)
                )
            finished = [future for future in active if future.done()]
            for future in finished:
                state = active.pop(future)
                drop = max(
                    0,
                    state["launch_available_bytes"] - state["minimum_available_bytes"],
                )
                normalized_drop = math.ceil(
                    drop / max(1, int(state["maximum_concurrent_workers"]))
                )
                observed_peak = max(observed_peak, normalized_drop)
                result = future.result()
                status = str(
                    result.get("final_status", result.get("generation_status"))
                )
                print(f"SCORED cell={state['cell']} status={status}", flush=True)
                if not calibrated:
                    calibrated = True
                    last_ramp = now
                append_json_line(
                    ledger,
                    {
                        "timestamp": utc_now(),
                        "event": "completed",
                        "cell": state["cell"],
                        "status": status,
                        "observed_available_drop_bytes": drop,
                        "maximum_concurrent_workers": state[
                            "maximum_concurrent_workers"
                        ],
                        "normalized_worker_peak_bytes": normalized_drop,
                        "conservative_peak_bytes": observed_peak,
                    },
                )
            if (
                calibrated
                and target < maximum
                and now - last_ramp >= ramp_seconds
                and len(active) >= target
                and may_launch_worker(snapshot, reserve, observed_peak, len(active) + 1)
            ):
                target = min(target + int(settings["ramp_step"]), maximum)
                last_ramp = now
                append_json_line(
                    ledger,
                    {
                        "timestamp": utc_now(),
                        "event": "ramp",
                        "target_parallelism": target,
                        "available_fraction": snapshot["available_fraction"],
                        "conservative_peak_bytes": observed_peak,
                    },
                )
            while (
                pending
                and len(active) < target
                and (not active or calibrated)
                and (
                    calibrated
                    or float(snapshot["available_fraction"]) >= uncalibrated_minimum
                )
                and may_launch_worker(snapshot, reserve, observed_peak, len(active) + 1)
            ):
                cell = pending.pop(0)
                future = executor.submit(
                    score_user_cell,
                    manifest,
                    cell,
                    retry_semantic_timeout=bool(args.rescore_semantic_timeouts),
                )
                active[future] = {
                    "cell": cell.cell_id,
                    "launch_available_bytes": int(snapshot["available_bytes"]),
                    "minimum_available_bytes": int(snapshot["available_bytes"]),
                    "maximum_concurrent_workers": len(active) + 1,
                }
                append_json_line(
                    ledger,
                    {
                        "timestamp": utc_now(),
                        "event": "launch",
                        "cell": cell.cell_id,
                        "active_workers": len(active),
                        "target_parallelism": target,
                        "available_fraction": snapshot["available_fraction"],
                        "reserve_fraction": reserve,
                        "conservative_peak_bytes": observed_peak,
                    },
                )
                if not calibrated:
                    break
                snapshot = memory_snapshot()
            append_json_line(
                ledger,
                {
                    "timestamp": utc_now(),
                    "event": "sample",
                    "active_workers": len(active),
                    "pending_workers": len(pending),
                    "target_parallelism": target,
                    **snapshot,
                },
            )
            if pending or active:
                time.sleep(sample_seconds)
    counts: dict[str, int] = {}
    for cell in available_cells:
        result = read_json(run_result_path(cell))
        status = str(result.get("final_status", result.get("generation_status")))
        counts[status] = counts.get(status, 0) + 1
    print("SCORE_COMPLETE " + " ".join(f"{key}={counts[key]}" for key in sorted(counts)))
    return 0


def summarize_result_subset(results: list[dict[str, Any]]) -> dict[str, Any]:
    statuses: dict[str, int] = {}
    semantic_verdicts: dict[str, int] = {}
    semantic_equivalent = 0
    proof_passed = 0
    gate_passes = {
        name: 0
        for name in (
            "structure_unchanged",
            "model_logika",
            "hamr_codegen",
            "generated_application",
            "component_logika",
        )
    }
    for result in results:
        status = str(result.get("final_status", result.get("generation_status", "unknown")))
        statuses[status] = statuses.get(status, 0) + 1
        verdict = result.get("semantic_verdict")
        if not isinstance(verdict, str):
            semantic_status = result.get("semantic_status")
            if semantic_status == "different":
                attempt = result.get("verification_attempt")
                cell = result.get("cell")
                if isinstance(attempt, str) and isinstance(cell, str):
                    semantic_log = BUILD / "runs" / cell / "evaluation" / attempt / "semantic.log"
                    if semantic_log.is_file():
                        gates = result.get("gates", {})
                        hidden = gates.get("hidden_semantics", {}) if isinstance(gates, dict) else {}
                        verdict = detailed_semantic_verdict(
                            int(hidden.get("exit_code", 1)),
                            semantic_log.read_text(encoding="utf-8", errors="replace"),
                        )
            elif isinstance(semantic_status, str):
                verdict = semantic_status
        if not isinstance(verdict, str):
            verdict = "not_run"
        semantic_verdicts[verdict] = semantic_verdicts.get(verdict, 0) + 1
        semantic_equivalent += result.get("semantic_status") == "equivalent"
        proof_passed += result.get("proof_passed") is True
        gates = result.get("gates")
        if isinstance(gates, dict):
            for name in gate_passes:
                gate = gates.get(name)
                gate_passes[name] += isinstance(gate, dict) and gate.get("status") == "passed"
    runs = len(results)
    return {
        "runs": runs,
        "statuses": statuses,
        "semantic_verdicts": semantic_verdicts,
        "status_rates": {
            name: count / runs if runs else None for name, count in statuses.items()
        },
        "semantic_equivalent": semantic_equivalent,
        "semantic_equivalence_rate": semantic_equivalent / runs if runs else None,
        "proof_passed": proof_passed,
        "proof_pass_rate": proof_passed / runs if runs else None,
        "gate_passes": gate_passes,
        "gate_pass_rates": {
            name: count / runs if runs else None for name, count in gate_passes.items()
        },
    }


def command_summarize(_: argparse.Namespace) -> int:
    manifest = load_manifest()
    cells = user_cells(manifest)
    results: list[dict[str, Any]] = []
    for cell in cells:
        if not run_result_path(cell).is_file():
            continue
        result = read_json(run_result_path(cell))
        validate_generation_result(manifest, cell, result)
        results.append(result)
    if not results:
        raise ExperimentError("no held-out results are available to summarize")
    checkpoints = [entry["id"] for entry in checkpoint_entries(manifest)]
    by_checkpoint: dict[str, dict[str, Any]] = {}
    for checkpoint in checkpoints:
        subset = [result for result in results if result["checkpoint"] == checkpoint]
        by_checkpoint[checkpoint] = summarize_result_subset(subset)
    lookup = {(result["dataset"], result["checkpoint"]): result for result in results}
    paired: list[dict[str, Any]] = []
    for dataset in (entry for entry in manifest["datasets"] if entry["role"] == "test"):
        for previous, current in zip(checkpoints, checkpoints[1:]):
            left = lookup.get((dataset["id"], previous))
            right = lookup.get((dataset["id"], current))
            if not left or not right:
                continue
            left_equivalent = left.get("semantic_status") == "equivalent"
            right_equivalent = right.get("semantic_status") == "equivalent"
            paired.append(
                {
                    "dataset": dataset["id"],
                    "domain": dataset["domain"],
                    "family": dataset["family"],
                    "difficulty": dataset["difficulty"],
                    "from": previous,
                    "to": current,
                    "change": (
                        "improved"
                        if not left_equivalent and right_equivalent
                        else "negative_transfer"
                        if left_equivalent and not right_equivalent
                        else "unchanged_equivalent"
                        if left_equivalent
                        else "unchanged_not_equivalent"
                    ),
                }
            )
    split_results: dict[str, dict[str, dict[str, Any]]] = {}
    dataset_metadata = {entry["id"]: entry for entry in manifest["datasets"]}
    for dimension in ("domain", "family", "replicate", "difficulty"):
        values = sorted(
            {str(dataset_metadata[result["dataset"]][dimension]) for result in results}
        )
        for value in values:
            subset = [
                result
                for result in results
                if str(dataset_metadata[result["dataset"]][dimension]) == value
            ]
            split_results.setdefault(dimension, {})[value] = summarize_result_subset(subset)
    training: list[dict[str, Any]] = []
    for checkpoint in checkpoint_entries(manifest)[1:]:
        metadata_path = CHECKPOINTS / f"{checkpoint['id']}.json"
        if metadata_path.is_file():
            metadata = read_json(metadata_path)
            accepted = metadata.get("accepted_proposal")
            relative = None
            if accepted:
                proposal = read_json(
                    proposal_directory(str(checkpoint["id"]), str(accepted)) / "proposal.json"
                )
                relative = proposal.get("relative_embedding_improvement")
            training.append(
                {
                    "checkpoint": checkpoint["id"],
                    "accepted_proposal": accepted,
                    "relative_embedding_improvement": relative,
                    "heldout_semantic_equivalent": by_checkpoint[checkpoint["id"]][
                        "semantic_equivalent"
                    ],
                    "heldout_runs": by_checkpoint[checkpoint["id"]]["runs"],
                    "heldout_semantic_equivalence_rate": by_checkpoint[checkpoint["id"]][
                        "semantic_equivalence_rate"
                    ],
                }
            )
    paired_change_counts: dict[str, int] = {}
    for item in paired:
        change = str(item["change"])
        paired_change_counts[change] = paired_change_counts.get(change, 0) + 1
    summary = {
        "schema_version": "metarule-summary-1.0.0",
        "generated_at": utc_now(),
        "expected_runs": 60,
        "observed_runs": len(results),
        "complete": len(results) == 60 and all(
            result.get("score_status") == "completed" for result in results
        ),
        "by_checkpoint": by_checkpoint,
        "paired_changes": paired,
        "paired_change_counts": paired_change_counts,
        "paired_change_rates": {
            name: count / len(paired) if paired else None
            for name, count in paired_change_counts.items()
        },
        "negative_transfer_count": sum(item["change"] == "negative_transfer" for item in paired),
        "negative_transfer_rate": (
            sum(item["change"] == "negative_transfer" for item in paired) / len(paired)
            if paired
            else None
        ),
        "split_results": split_results,
        "training_vs_heldout": training,
    }
    destination = BUILD / "summary"
    write_json_atomic(destination / "summary.json", summary)
    lines = [
        "# Meta-Rule transfer results",
        "",
        f"Observed {len(results)} of 60 held-out cells; complete: {str(summary['complete']).lower()}.",
        "",
        "| Checkpoint | Runs | Semantic equivalent | Proof passed | Final statuses |",
        "|---|---:|---:|---:|---|",
    ]
    for checkpoint in checkpoints:
        value = by_checkpoint[checkpoint]
        status_text = ", ".join(
            f"{key}: {count}" for key, count in sorted(value["statuses"].items())
        )
        lines.append(
            f"| {checkpoint} | {value['runs']} | {value['semantic_equivalent']} | "
            f"{value['proof_passed']} | {status_text} |"
        )
    lines.extend(
        (
            "",
            f"Adjacent-checkpoint negative-transfer observations: {summary['negative_transfer_count']}.",
            "",
            "See `summary.json` for paired task changes and domain/family/difficulty splits.",
        )
    )
    (destination / "README.md").write_text("\n".join(lines) + "\n", encoding="utf-8")
    print(
        f"SUMMARY_WRITTEN observed={len(results)} complete={str(summary['complete']).lower()} "
        f"negative_transfer={summary['negative_transfer_count']}"
    )
    return 0


ARCHIVE_IGNORED_NAMES = {
    ".runtime",
    ".home",
    ".tmp",
    "auth.json",
    "sysml-aadl-libraries",
    "__pycache__",
}


def archive_ignored(relative: Path) -> bool:
    return any(part in ARCHIVE_IGNORED_NAMES for part in relative.parts) or relative.name.endswith(
        ".sock"
    )


def ensure_archive_directory(root: Path, relative: Path = Path()) -> Path:
    if root.is_symlink() or (root.exists() and not root.is_dir()):
        raise ExperimentError(f"archive destination is not a real directory: {root}")
    root.mkdir(parents=True, exist_ok=True)
    current = root
    for part in relative.parts:
        current = current / part
        if current.is_symlink() or (current.exists() and not current.is_dir()):
            raise ExperimentError(f"archive destination is not a real directory: {current}")
        current.mkdir(exist_ok=True)
    return current


def archive_copy(source: Path, destination: Path) -> None:
    if not source.is_dir() or source.is_symlink():
        raise ExperimentError(f"archive source is not a real directory: {source}")
    ensure_archive_directory(destination)
    for path in sorted(source.rglob("*")):
        relative = path.relative_to(source)
        if archive_ignored(relative):
            continue
        if path.is_symlink():
            raise ExperimentError(f"refusing to archive symlink: {path}")
        target = destination / relative
        if path.is_dir():
            ensure_archive_directory(destination, relative)
            continue
        if not path.is_file():
            raise ExperimentError(f"refusing to archive special file: {path}")
        ensure_archive_directory(destination, relative.parent)
        if target.exists() or target.is_symlink():
            if target.is_symlink() or not target.is_file() or sha256_file(target) != sha256_file(path):
                raise ExperimentError(f"refusing to overwrite archived evidence: {target}")
            continue
        shutil.copy2(path, target)
        if sha256_file(target) != sha256_file(path):
            raise ExperimentError(f"archived evidence failed hash verification: {target}")


def archive_file(source: Path, destination: Path) -> None:
    if not source.is_file() or source.is_symlink():
        raise ExperimentError(f"archive source is not a regular file: {source}")
    ensure_archive_directory(destination.parent)
    if destination.exists() or destination.is_symlink():
        if (
            destination.is_symlink()
            or not destination.is_file()
            or sha256_file(destination) != sha256_file(source)
        ):
            raise ExperimentError(f"refusing to overwrite archived evidence: {destination}")
        return
    shutil.copy2(source, destination)
    if sha256_file(destination) != sha256_file(source):
        raise ExperimentError(f"archived evidence failed hash verification: {destination}")


SCORING_RESULT_FIELDS = {
    "scored_at",
    "gates",
    "semantic_status",
    "semantic_verdict",
    "proof_passed",
    "final_status",
    "verification_attempt",
    "equivalence_timeout_seconds",
    "score_attempts",
}


def command_reset_scoring(_: argparse.Namespace) -> int:
    """Discard evaluator attempts while retaining generation evidence."""

    manifest = load_manifest()
    reset = 0
    removed = 0
    for cell in user_cells(manifest):
        result_path = run_result_path(cell)
        if not result_path.is_file():
            continue
        result = read_json(result_path)
        validate_generation_result(manifest, cell, result)
        for name in SCORING_RESULT_FIELDS:
            result.pop(name, None)
        result["score_status"] = "not_run"
        write_json_atomic(result_path, result)
        evaluation = result_path.parent / "evaluation"
        if evaluation.is_dir():
            for path in sorted(evaluation.glob("verification*")):
                if not path.is_dir() or path.is_symlink():
                    raise ExperimentError(f"refusing unsafe scoring reset target: {path}")
                shutil.rmtree(path)
                removed += 1
        reset += 1
    for path in (
        BUILD / "score-scheduler.jsonl",
        BUILD / "evaluator-policy.jsonl",
    ):
        if path.is_file() and not path.is_symlink():
            path.unlink()
    summary = BUILD / "summary"
    if summary.is_dir() and not summary.is_symlink():
        shutil.rmtree(summary)
    print(f"SCORING_RESET results={reset} verification_directories={removed}")
    return 0


def command_hydrate(_: argparse.Namespace) -> int:
    """Restore the portable archive into the build layout used by the scorer."""

    manifest = load_manifest()
    source = EXPERIMENT / "runs"
    if not source.is_dir():
        raise ExperimentError("archived runs are missing")
    archive_copy(source, BUILD / "runs")
    for checkpoint_id in ("M-E", "M-EM", "M-EMH"):
        proposals = source / f"train--{checkpoint_id}" / "proposals"
        if proposals.is_dir():
            archive_copy(proposals, BUILD / "proposals" / checkpoint_id)
    restored_selections = 0
    for cell in user_cells(manifest):
        selection = source / cell.cell_id / "evaluation" / "selection"
        if not selection.is_dir():
            raise ExperimentError(f"archived selection is missing: {cell.cell_id}")
        archive_copy(selection, BUILD / "selections" / cell.cell_id)
        restored_selections += 1
    print(f"HYDRATED runs={len(list(source.iterdir()))} selections={restored_selections}")
    return 0


def command_status(_: argparse.Namespace) -> int:
    manifest = load_manifest()
    generation: dict[str, int] = {}
    scoring: dict[str, int] = {}
    verdicts: dict[str, int] = {}
    observed = 0
    for cell in user_cells(manifest):
        path = run_result_path(cell)
        if not path.is_file():
            generation["missing"] = generation.get("missing", 0) + 1
            continue
        observed += 1
        result = read_json(path)
        validate_generation_result(manifest, cell, result)
        generation_status = str(result.get("generation_status", "unknown"))
        generation[generation_status] = generation.get(generation_status, 0) + 1
        score_status = str(result.get("score_status", "not_run"))
        scoring[score_status] = scoring.get(score_status, 0) + 1
        verdict = str(result.get("semantic_verdict", "not_run"))
        verdicts[verdict] = verdicts.get(verdict, 0) + 1
    print(f"STATUS observed={observed} expected=60")
    print("GENERATION " + " ".join(f"{k}={generation[k]}" for k in sorted(generation)))
    print("SCORING " + " ".join(f"{k}={scoring[k]}" for k in sorted(scoring)))
    print("VERDICTS " + " ".join(f"{k}={verdicts[k]}" for k in sorted(verdicts)))
    return 0


def command_archive(args: argparse.Namespace) -> int:
    manifest = load_manifest()
    if manifest.get("state") != "sealed":
        raise ExperimentError("archive requires a sealed experiment")
    summary = read_json(BUILD / "summary" / "summary.json")
    if not summary.get("complete") and not args.allow_incomplete:
        raise ExperimentError("summary is incomplete; pass --allow-incomplete to archive explicitly")
    key = read_private_key(args.embedding_key_file)
    secret_leak_scan(BUILD, key)
    runs_destination = EXPERIMENT / "runs"
    summary_destination = EXPERIMENT / "summary"
    archive_copy(BUILD / "runs", runs_destination)
    archive_copy(BUILD / "summary", summary_destination)
    for checkpoint_id in ("M-E", "M-EM", "M-EMH"):
        source = BUILD / "proposals" / checkpoint_id
        if source.is_dir():
            archive_copy(source, runs_destination / f"train--{checkpoint_id}" / "proposals")
    for cell in user_cells(manifest):
        selection = BUILD / "selections" / cell.cell_id
        destination = runs_destination / cell.cell_id / "evaluation" / "selection"
        if selection.is_dir():
            archive_copy(selection, destination)
    for source in (
        BUILD / "scheduler.jsonl",
        BUILD / "score-scheduler.jsonl",
        BUILD / "evaluator-policy.jsonl",
        BUILD / "preflight.json",
    ):
        if source.is_file():
            archive_file(source, summary_destination / source.name)
    oracle_preflight = BUILD / "oracle-preflight"
    if oracle_preflight.is_dir():
        archive_copy(
            oracle_preflight,
            summary_destination / "oracle-preflight",
        )
    secret_leak_scan(runs_destination, key)
    secret_leak_scan(summary_destination, key)
    print(f"ARCHIVED runs={runs_destination.relative_to(REPO)} summary={summary_destination.relative_to(REPO)}")
    return 0


def validate_dataset_entries(manifest: dict[str, Any], *, add_hashes: bool) -> None:
    datasets = manifest.get("datasets")
    if not isinstance(datasets, list):
        raise ExperimentError("manifest datasets must be an array")
    seen: set[str] = set()
    for entry in datasets:
        if not isinstance(entry, dict):
            raise ExperimentError("dataset entry must be an object")
        dataset_id = str(entry.get("id", ""))
        if not dataset_id or dataset_id in seen:
            raise ExperimentError(f"invalid or duplicate dataset id: {dataset_id!r}")
        seen.add(dataset_id)
        paths = dataset_paths(dataset_id)
        missing = [str(path) for path in paths.values() if not path.is_file()]
        if missing:
            raise ExperimentError(f"dataset {dataset_id} is incomplete: {missing}")
        actual = {name: sha256_file(path) for name, path in paths.items()}
        recorded = entry.get("sha256")
        if recorded is not None and recorded != actual:
            raise ExperimentError(f"dataset input hash drift: {dataset_id}")
        if add_hashes:
            entry["sha256"] = actual
    if len(seen) != 18:
        raise ExperimentError(f"expected 18 selected datasets, found {len(seen)}")


def checkpoint_entries(manifest: dict[str, Any]) -> list[dict[str, Any]]:
    values = manifest.get("checkpoints")
    if not isinstance(values, list) or [item.get("id") for item in values] != [
        "M0", "M-E", "M-EM", "M-EMH"
    ]:
        raise ExperimentError("manifest checkpoint lineage is invalid")
    return values


def validate_checkpoint_artifacts(manifest: dict[str, Any]) -> None:
    for checkpoint in checkpoint_entries(manifest):
        content_hash = checkpoint.get("content_sha256")
        if content_hash is None:
            continue
        path_value = checkpoint.get("path")
        if not isinstance(path_value, str):
            raise ExperimentError(f"checkpoint {checkpoint['id']} lacks its plan path")
        plan_path = resolve_manifest_path(path_value)
        if not plan_path.is_file() or sha256_file(plan_path) != content_hash:
            raise ExperimentError(f"checkpoint {checkpoint['id']} plan integrity check failed")
        metadata_path = CHECKPOINTS / f"{checkpoint['id']}.json"
        metadata_hash = checkpoint.get("metadata_sha256")
        if (
            not isinstance(metadata_hash, str)
            or not metadata_path.is_file()
            or sha256_file(metadata_path) != metadata_hash
        ):
            raise ExperimentError(
                f"checkpoint {checkpoint['id']} evidence integrity check failed"
            )


def expand_cells(manifest: dict[str, Any]) -> tuple[list[Cell], list[Cell]]:
    entries = checkpoint_entries(manifest)
    train = [
        Cell("train", str(entry["training_dataset"]), str(entry["id"]))
        for entry in entries
        if entry["id"] != "M0"
    ]
    tests = [entry for entry in manifest["datasets"] if entry.get("role") == "test"]
    user = [
        Cell("user", str(dataset["id"]), str(checkpoint["id"]))
        for dataset in tests
        for checkpoint in entries
    ]
    if len(train) != 3 or len(user) != 60:
        raise ExperimentError(
            f"full design must expand to 3 training and 60 user cells; got {len(train)} and {len(user)}"
        )
    return train, user


def command_init(_: argparse.Namespace) -> int:
    manifest = load_manifest()
    if manifest.get("state") == "sealed":
        raise ExperimentError("sealed manifest cannot be initialized")
    gumbo_source, verification_source, methodology_source = assert_upstream(manifest)
    m0 = baseline_gumbo_plan(gumbo_source.read_text(encoding="utf-8"))
    verification = adapted_verification_plan(
        verification_source.read_text(encoding="utf-8")
    )
    CHECKPOINTS.mkdir(parents=True, exist_ok=True)
    m0_path = CHECKPOINTS / "M0.md"
    m0_metadata_path = CHECKPOINTS / "M0.json"
    verification_path = EXPERIMENT / "sireum_verification_plan.md"
    generated = {m0_path: m0, verification_path: verification}
    for path, content in generated.items():
        if path.exists() and path.read_text(encoding="utf-8") != content:
            raise ExperimentError(f"refusing to overwrite changed generated input: {path}")
        path.write_text(content, encoding="utf-8")
    m0_hash = sha256_file(m0_path)
    checkpoint = checkpoint_entries(manifest)[0]
    if checkpoint.get("content_sha256") not in (None, m0_hash):
        raise ExperimentError("manifest M0 hash conflicts with deterministic baseline")
    checkpoint["content_sha256"] = m0_hash
    checkpoint["path"] = "checkpoints/M0.md"
    validate_dataset_entries(manifest, add_hashes=True)
    manifest["state"] = "initialized"
    write_json_atomic(
        m0_metadata_path,
        {
            "schema_version": "metarule-checkpoint-1.0.0",
            "checkpoint": "M0",
            "parent": None,
            "training_dataset": None,
            "content_sha256": m0_hash,
            "learned_rule_count": 0,
            "transformation": {
                "removed_sections": [3, 4],
                "path_policy": "adapt-paths-and-commands-only",
                "upstream_sha256": manifest["upstream"]["gumbo_plan_sha256"],
                "methodology_paper": str(manifest["upstream"]["methodology_paper"]),
                "methodology_paper_sha256": sha256_file(methodology_source),
                "meta_rule_format_policy": "paper-informed-free-form-record-with-MR-id-envelope",
            },
        },
    )
    checkpoint["metadata_sha256"] = sha256_file(m0_metadata_path)
    write_json_atomic(MANIFEST_PATH, manifest)
    print(f"INITIALIZED manifest={MANIFEST_PATH.relative_to(REPO)}")
    print(f"M0_SHA256={m0_hash}")
    return 0


def command_plan(_: argparse.Namespace) -> int:
    manifest = load_manifest()
    assert_upstream(manifest)
    validate_dataset_entries(manifest, add_hashes=False)
    train, user = expand_cells(manifest)
    semantic_checks = len(user)
    active_hours = len(train) + len(user)
    comparison_hours = semantic_checks * int(
        manifest["model"]["equivalence_timeout_seconds"]
    ) / 3600
    print(f"experiment={manifest['experiment_id']} state={manifest['state']}")
    print(f"training_runs={len(train)}")
    print(f"user_runs={len(user)}")
    print(f"hidden_comparisons={semantic_checks}")
    print(f"scp_active_hours_worst_case={active_hours}")
    print(f"serial_hours_worst_case={active_hours + comparison_hours:g}")
    for checkpoint in checkpoint_entries(manifest):
        print(
            "checkpoint="
            f"{checkpoint['id']} parent={checkpoint['parent'] or '-'} "
            f"sha256={checkpoint.get('content_sha256') or 'PENDING'}"
        )
    for cell in [*train, *user]:
        print(
            f"cell={cell.cell_id} kind={cell.kind} dataset={cell.dataset_id} "
            f"checkpoint={cell.checkpoint} output=build/metarule-transfer/runs/{cell.cell_id}"
        )
    return 0


def command_validate(_: argparse.Namespace) -> int:
    manifest = load_manifest()
    assert_upstream(manifest)
    validate_dataset_entries(manifest, add_hashes=False)
    expand_cells(manifest)
    m0 = CHECKPOINTS / "M0.md"
    if not m0.is_file():
        raise ExperimentError("M0 is missing; run init")
    validate_checkpoint_text(m0.read_text(encoding="utf-8"), require_empty=True)
    expected = checkpoint_entries(manifest)[0].get("content_sha256")
    if sha256_file(m0) != expected:
        raise ExperimentError("M0 hash differs from manifest")
    print("DEFINITION_VALID")
    return 0


def build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(description=__doc__)
    subparsers = parser.add_subparsers(dest="command", required=True)
    subparsers.add_parser("init", help="derive M0 and pin current input hashes")
    subparsers.add_parser("plan", help="print the complete matrix without model calls")
    subparsers.add_parser("validate", help="validate the initialized definition")
    embedding = subparsers.add_parser(
        "embedding-poc", help="make one credential-safe embeddings API sanity call"
    )
    embedding.add_argument("--embedding-key-file", required=True, type=Path)
    review = subparsers.add_parser("review", help="immutably approve or reject one proposal")
    review.add_argument("checkpoint", choices=("M-E", "M-EM", "M-EMH"))
    review.add_argument("proposal")
    review.add_argument("--decision", choices=("approve", "reject"), required=True)
    review.add_argument("--reviewer", required=True)
    seal = subparsers.add_parser("seal", help="freeze reviewed checkpoints and applicability")
    seal.add_argument("--checkpoint", choices=("M-E", "M-EM", "M-EMH"))
    seal.add_argument("--embedding-key-file", type=Path)
    preflight = subparsers.add_parser("preflight", help="prove tooling and sandbox isolation")
    preflight.add_argument("--embedding-key-file", required=True, type=Path)
    preflight.add_argument("--auth-source", type=Path)
    preflight.add_argument("--deep", action="store_true")
    run = subparsers.add_parser("run", help="run sealed held-out cells with adaptive RAM limits")
    run.add_argument("--cell")
    run.add_argument("--auth-source", type=Path)
    score = subparsers.add_parser("score", help="run evaluator gates and hidden comparison")
    score.add_argument("--cell")
    score.add_argument("--equivalence-timeout-seconds", type=int)
    score.add_argument("--maximum-parallelism", type=int)
    score.add_argument("--memory-reserve-fraction", type=float)
    score.add_argument("--ramp-observation-seconds", type=float)
    score.add_argument(
        "--rescore-semantic-timeouts",
        action="store_true",
        help="append a new scoring attempt for shorter semantic timeouts",
    )
    train = subparsers.add_parser("train", help="run one serial blind/supervised training stage")
    train.add_argument("checkpoint", choices=("M-E", "M-EM", "M-EMH"))
    train.add_argument("--embedding-key-file", required=True, type=Path)
    train.add_argument("--auth-source", type=Path)
    distill = subparsers.add_parser(
        "distill", help="create a simpler proposal with per-rule semantic evidence"
    )
    distill.add_argument("checkpoint", choices=("M-E", "M-EM", "M-EMH"))
    distill.add_argument("source")
    distill.add_argument("--rules-file", required=True, type=Path)
    distill.add_argument("--embedding-key-file", required=True, type=Path)
    recertify = subparsers.add_parser(
        "recertify", help="append a fresh mechanical gate attempt for one proposal"
    )
    recertify.add_argument("checkpoint", choices=("M-E", "M-EM", "M-EMH"))
    recertify.add_argument("source")
    subparsers.add_parser("summarize", help="write raw, paired, and split result summaries")
    subparsers.add_parser("status", help="report generation, scoring, and semantic counts")
    subparsers.add_parser("reset-scoring", help="discard all evaluator attempts")
    subparsers.add_parser("hydrate", help="restore archived runs into build for scoring")
    archive = subparsers.add_parser("archive", help="publish complete evidence without secrets/caches")
    archive.add_argument("--embedding-key-file", required=True, type=Path)
    archive.add_argument("--allow-incomplete", action="store_true")
    return parser


def main(argv: Iterable[str] | None = None) -> int:
    args = build_parser().parse_args(argv)
    commands = {
        "init": command_init,
        "plan": command_plan,
        "validate": command_validate,
        "embedding-poc": command_embedding_poc,
        "review": command_review,
        "seal": command_seal,
        "preflight": command_preflight,
        "run": command_run,
        "score": command_score,
        "train": command_train,
        "distill": command_distill,
        "recertify": command_recertify,
        "summarize": command_summarize,
        "status": command_status,
        "reset-scoring": command_reset_scoring,
        "hydrate": command_hydrate,
        "archive": command_archive,
    }
    try:
        return commands[args.command](args)
    except (ExperimentError, OSError, KeyError, ValueError) as exc:
        print(f"metarule-transfer: {exc}", file=sys.stderr)
        return 2


if __name__ == "__main__":
    raise SystemExit(main())
