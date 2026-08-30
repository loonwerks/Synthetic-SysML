#!/usr/bin/env python3
"""Regenerate the complete repository-root visualization suite."""

from __future__ import annotations

import os
import subprocess
import sys
from pathlib import Path
from tempfile import TemporaryDirectory


HERE = Path(__file__).resolve().parent
ROOT = HERE.parent


def run(script: Path, matplotlib_cache: str) -> None:
    environment = os.environ.copy()
    environment.setdefault("MPLCONFIGDIR", matplotlib_cache)
    environment.setdefault("PYTHONDONTWRITEBYTECODE", "1")
    subprocess.run([sys.executable, str(script)], cwd=ROOT, env=environment, check=True)


def main() -> None:
    with TemporaryDirectory(prefix="synthetic-sysml-matplotlib-") as matplotlib_cache:
        run(HERE / "build_analysis_data.py", matplotlib_cache)
        run(HERE / "dataset-generation" / "make_plots.py", matplotlib_cache)
        run(HERE / "scp-terra-high" / "make_exploratory_plots.py", matplotlib_cache)
        run(HERE / "poolside-synthetic" / "make_cactus_plots.py", matplotlib_cache)
        run(HERE / "poolside-synthetic" / "make_outcome_overview.py", matplotlib_cache)
        run(HERE / "scp-comparison" / "make_cactus_plots.py", matplotlib_cache)
        run(HERE / "write_report_stats.py", matplotlib_cache)


if __name__ == "__main__":
    main()
