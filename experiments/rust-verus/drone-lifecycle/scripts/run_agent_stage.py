#!/usr/bin/env python3
"""Run one retained Codex stage for the drone Rust/Verus POC."""

from __future__ import annotations

import argparse
import json
import subprocess
import sys
import time
from pathlib import Path


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--stage", required=True)
    parser.add_argument("--prompt", required=True, type=Path)
    parser.add_argument("--model", default="gpt-5.6-sol")
    parser.add_argument("--reasoning-effort", default="high")
    args = parser.parse_args()

    scripts = Path(__file__).resolve().parent
    run_root = scripts.parent
    repository = run_root.parents[2]
    agent_dir = run_root / "rust" / "agent"
    agent_dir.mkdir(parents=True, exist_ok=True)
    prompt = args.prompt.resolve().read_text(encoding="utf-8")
    event_path = agent_dir / f"{args.stage}.jsonl"
    stderr_path = agent_dir / f"{args.stage}.stderr.txt"
    result_path = agent_dir / f"{args.stage}.result.json"

    command = [
        "codex",
        "exec",
        "--json",
        "--sandbox",
        "workspace-write",
        "--cd",
        str(repository),
        "--model",
        args.model,
        "--config",
        f'model_reasoning_effort="{args.reasoning_effort}"',
        "-",
    ]
    started = time.time()
    with event_path.open("w", encoding="utf-8") as events, stderr_path.open(
        "w", encoding="utf-8"
    ) as errors:
        completed = subprocess.run(
            command,
            input=prompt,
            text=True,
            stdout=events,
            stderr=errors,
            cwd=repository,
            check=False,
        )
    result = {
        "stage": args.stage,
        "command": command[:-1] + ["<prompt on stdin>"],
        "prompt": str(args.prompt.resolve()),
        "exit_code": completed.returncode,
        "duration_seconds": round(time.time() - started, 3),
        "events": str(event_path),
        "stderr": str(stderr_path),
    }
    result_path.write_text(json.dumps(result, indent=2) + "\n", encoding="utf-8")
    print(json.dumps(result, indent=2))
    return completed.returncode


if __name__ == "__main__":
    raise SystemExit(main())
