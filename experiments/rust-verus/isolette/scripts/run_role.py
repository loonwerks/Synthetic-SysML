#!/usr/bin/env python3
"""Run one isolated Codex role with the appendix clean-room permissions."""

from __future__ import annotations

import argparse
import os
import shutil
import subprocess
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
SCRIPTS = Path(__file__).resolve().parent


def profile_table() -> str:
    entries = ['":minimal"="read"', '":workspace_roots"="write"', '":slash_tmp"="write"']
    runtime_reads: list[Path] = []
    for variable in ("SIREUM_HOME", "CARGO_HOME", "RUSTUP_HOME"):
        value = os.environ.get(variable)
        if value:
            runtime_reads.append(Path(value).resolve())
    codex = shutil.which("codex")
    if codex:
        runtime_reads.append(Path(codex).resolve().parent)
    entries.extend(f'"{path}"="read"' for path in runtime_reads)
    return "permissions.appendix_cleanroom.filesystem={" + ",".join(entries) + "}"


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("stage")
    args = parser.parse_args()
    evidence = ROOT / "evidence" / "agents"
    evidence.mkdir(parents=True, exist_ok=True)
    prompt = SCRIPTS / f"{args.stage}.prompt.md"
    events = evidence / f"{args.stage}.jsonl"
    stderr = evidence / f"{args.stage}.stderr.txt"
    result = evidence / f"{args.stage}.result.md"
    command = [
        "codex", "exec", "--json", "--ephemeral", "--color", "never",
        "--ignore-user-config", "--ignore-rules", "--strict-config",
        "-c", 'default_permissions="appendix_cleanroom"',
        "-c", 'approval_policy="never"',
        "-c", 'permissions.appendix_cleanroom.description="Appendix clean-room role agent"',
        "-c", profile_table(),
        "-c", "permissions.appendix_cleanroom.network.enabled=false",
        "-C", str(ROOT), "-m", "gpt-5.6-sol",
        "-c", 'model_reasoning_effort="high"',
        "-o", str(result), "-",
    ]
    with events.open("w", encoding="utf-8") as out, stderr.open("w", encoding="utf-8") as err:
        completed = subprocess.run(
            command,
            input=prompt.read_text(encoding="utf-8"),
            text=True,
            stdout=out,
            stderr=err,
            cwd=ROOT,
            check=False,
        )
    return completed.returncode


if __name__ == "__main__":
    raise SystemExit(main())
