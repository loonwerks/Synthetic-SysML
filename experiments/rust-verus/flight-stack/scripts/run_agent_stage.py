#!/usr/bin/env python3
"""Run one appendices clean-room Codex role and retain its wire evidence."""

from __future__ import annotations

import argparse
import json
import subprocess
import sys
from pathlib import Path


HERE = Path(__file__).resolve().parent
WORKSPACE = HERE.parent
PROFILE = "appendix_cleanroom"


def profile_overrides() -> list[str]:
    filesystem = {
        ":minimal": "read",
        ":workspace_roots": "write",
        ":slash_tmp": "write",
    }
    filesystem_toml = "{" + ",".join(
        f"{json.dumps(key)}={json.dumps(value)}"
        for key, value in filesystem.items()
    ) + "}"
    return [
        "-c", f'permissions.{PROFILE}.description="Appendix clean-room role agent"',
        "-c", f"permissions.{PROFILE}.filesystem={filesystem_toml}",
        "-c", f"permissions.{PROFILE}.network.enabled=false",
    ]


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("prompt", type=Path)
    parser.add_argument("evidence_name")
    parser.add_argument("--reasoning-effort", default="high")
    args = parser.parse_args()

    evidence = WORKSPACE / "evidence" / "agents"
    evidence.mkdir(parents=True, exist_ok=True)
    response = evidence / f"{args.evidence_name}.response.md"
    events = evidence / f"{args.evidence_name}.jsonl"
    stderr = evidence / f"{args.evidence_name}.stderr.txt"
    command = [
        "codex", "exec", "--json", "--ephemeral", "--color", "never",
        "--ignore-user-config", "--ignore-rules", "--strict-config",
        "-c", f'default_permissions="{PROFILE}"',
        "-c", 'approval_policy="never"',
        *profile_overrides(),
        "-C", str(WORKSPACE), "-m", "gpt-5.6-sol",
        "-c", f'model_reasoning_effort="{args.reasoning_effort}"',
        "-o", str(response), "-",
    ]
    completed = subprocess.run(
        command,
        cwd=WORKSPACE,
        input=args.prompt.read_text(),
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
        check=False,
    )
    events.write_text(completed.stdout)
    stderr.write_text(completed.stderr)
    sys.stdout.write(completed.stdout)
    sys.stderr.write(completed.stderr)
    return completed.returncode


if __name__ == "__main__":
    raise SystemExit(main())
