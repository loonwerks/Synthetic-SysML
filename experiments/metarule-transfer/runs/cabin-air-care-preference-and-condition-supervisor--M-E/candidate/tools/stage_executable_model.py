#!/usr/bin/env python3
"""Create a codegen-only periodic projection of one candidate SysML model.

This helper deliberately accepts one explicit model path.  It never searches a
dataset tree and rejects evaluator/oracle paths, so staging cannot expose an
answer model to an application agent.
"""

from __future__ import annotations

import argparse
import hashlib
import json
import os
import re
from pathlib import Path


THREAD = re.compile(
    r"(?m)^(?P<indent>[ \t]*)part\s+def\s+[A-Za-z_][A-Za-z0-9_]*\s+:>\s+(?:AADL::)?Thread\s*\{[ \t]*$"
)
GUMBO_BLOCK = re.compile(
    r'(?P<open>language\s+"GUMBO"\s*/\*\{)(?P<body>.*?)(?P<close>\}\*/)',
    re.DOTALL,
)
GUMBO_INITIALIZE = re.compile(
    r"(?ms)^(?P<indent>[ \t]*)initialize[ \t]*(?:\r?\n)"
    r".*?(?=^(?P=indent)(?:compute|functions|invariants|integration|state)\b|\Z)"
)
PACKAGE = re.compile(r"(?m)^\s*package\s+([A-Za-z_][A-Za-z0-9_]*)\s*\{")
SYSTEM_DEF = re.compile(
    r"(?m)^\s*part\s+def\s+([A-Za-z_][A-Za-z0-9_]*)\s+:>\s+(?:AADL::)?System\s*\{"
)
PART_USE = re.compile(
    r"(?m)^(?P<indent>[ \t]*)part\s+[A-Za-z_][A-Za-z0-9_]*\s*:\s*"
    r"(?P<target>[A-Za-z_][A-Za-z0-9_]*)\s*;"
)


def sha256(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def portable_path(path: Path) -> str:
    return Path(os.path.relpath(path.resolve(), Path.cwd().resolve())).as_posix()


def reject_contaminating_path(path: Path) -> None:
    lowered = {part.lower() for part in path.parts}
    if "evaluator" in lowered or path.name.lower() == "oracle.sysml":
        raise SystemExit("refusing evaluator/oracle model path")


def _blank_preserving_lines(value: str) -> str:
    """Erase source text while retaining exact line and column positions."""
    return "".join(character if character in "\r\n" else " " for character in value)


def strip_gumbo_initialization_sections(text: str) -> tuple[str, int]:
    """Remove initialization contracts from the non-normative codegen view.

    HAMR initialization APIs do not expose input ports.  Consequently, an
    otherwise valid model-level ``initialize`` guarantee that refers to an
    input generates uncompilable Slang (both Initialization_Api and PostState
    containers lack that member).  Selectively rewriting expressions would
    invent semantics, so the executable projection consistently removes the
    complete initialization section from every GUMBO block.  The original
    candidate is checked by model Logika before this projection is created.

    Whitespace replacement preserves line numbers for diagnostics and leaves
    state, functions, invariants, integration, and compute sections verbatim.
    """
    removed = 0

    def project_block(block_match: re.Match[str]) -> str:
        nonlocal removed
        body = block_match.group("body")

        def remove_section(section_match: re.Match[str]) -> str:
            nonlocal removed
            removed += 1
            return _blank_preserving_lines(section_match.group(0))

        projected_body = GUMBO_INITIALIZE.sub(remove_section, body)
        return block_match.group("open") + projected_body + block_match.group("close")

    return GUMBO_BLOCK.sub(project_block, text), removed


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("source", type=Path)
    parser.add_argument("destination", type=Path)
    parser.add_argument("metadata", type=Path)
    parser.add_argument("--period-ms", type=int, default=1000)
    args = parser.parse_args()

    source = args.source.resolve()
    destination = args.destination.resolve()
    metadata = args.metadata.resolve()
    reject_contaminating_path(source)
    if args.period_ms <= 0:
        raise SystemExit("--period-ms must be positive")

    original = source.read_bytes()
    text = original.decode("utf-8")
    packages = PACKAGE.findall(text)
    if len(packages) != 1:
        raise SystemExit(f"expected exactly one package, found {packages}")
    system_defs = set(SYSTEM_DEF.findall(text))
    system_uses = [
        (len(match.group("indent").expandtabs()), match.group("target"))
        for match in PART_USE.finditer(text)
        if match.group("target") in system_defs
    ]
    shallowest = min((depth for depth, _ in system_uses), default=-1)
    roots = [target for depth, target in system_uses if depth == shallowest]
    if len(roots) != 1:
        raise SystemExit(
            "expected exactly one root part usage targeting a System definition, "
            f"found {roots}"
        )
    if re.search(r"\bDispatch_Protocol\b|attribute\s+:>>\s+Period\b", text):
        raise SystemExit(
            "candidate already contains dispatch/period refinements; refusing to "
            "guess how to normalize them"
        )

    count = 0

    def add_periodic(match: re.Match[str]) -> str:
        nonlocal count
        count += 1
        indent = match.group("indent") + "  "
        return (
            match.group(0)
            + "\n"
            + indent
            + "attribute :>> Dispatch_Protocol = Periodic;\n"
            + indent
            + f"attribute :>> Period = {args.period_ms} [ms];"
        )

    projected = THREAD.sub(add_periodic, text)
    if count == 0:
        raise SystemExit("candidate contains no Thread definitions")
    if projected.count("attribute :>> Dispatch_Protocol = Periodic;") != count:
        raise SystemExit("internal projection error: dispatch count does not match Threads")
    if projected.count(f"attribute :>> Period = {args.period_ms} [ms];") != count:
        raise SystemExit("internal projection error: period count does not match Threads")
    periodic_projection = projected
    projected, initialization_sections_removed = strip_gumbo_initialization_sections(
        periodic_projection
    )
    if projected.count("\n") != periodic_projection.count("\n"):
        raise SystemExit("internal projection error: initialization removal changed line count")
    remaining_initialization_headers = sum(
        len(re.findall(r"(?m)^[ \t]*initialize[ \t]*$", match.group("body")))
        for match in GUMBO_BLOCK.finditer(projected)
    )
    if remaining_initialization_headers:
        raise SystemExit(
            "unsupported GUMBO initialization layout remained after codegen projection"
        )

    destination.parent.mkdir(parents=True, exist_ok=True)
    metadata.parent.mkdir(parents=True, exist_ok=True)
    destination.write_text(projected, encoding="utf-8")
    result = {
        "schema_version": 1,
        "source": portable_path(source),
        "source_sha256": sha256(original),
        "projection": portable_path(destination),
        "projection_sha256": sha256(projected.encode("utf-8")),
        "package": packages[0],
        "system_definition": roots[0],
        "system_name": f"{packages[0]}::{roots[0]}",
        "thread_count": count,
        "period_ms": args.period_ms,
        "initialization_projection": "removed_from_codegen_view",
        "initialization_sections_removed": initialization_sections_removed,
    }
    metadata.write_text(json.dumps(result, indent=2) + "\n", encoding="utf-8")
    print(json.dumps(result))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
