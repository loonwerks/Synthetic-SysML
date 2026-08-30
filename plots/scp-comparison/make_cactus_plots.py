#!/usr/bin/env python3
"""Paired cactus plots for Poolside and GPT-5.6 Terra High on CPS-48."""

from __future__ import annotations

import json
import statistics
from collections import Counter
from pathlib import Path

import matplotlib.pyplot as plt
from matplotlib.lines import Line2D
from matplotlib.ticker import FixedLocator, FuncFormatter, MaxNLocator, MultipleLocator


HERE = Path(__file__).resolve().parent
PLOTS = HERE.parent
DATA = PLOTS / "analysis-data.json"
TITLE = "SCP Autoformalization on 48 Seed-Derived Synthetic Systems"
DATASET_N = 48
OUTCOMES = (
    ("qualified", "Gate-qualified candidates", "#555555"),
    ("CANDIDATE_WEAKER", "Candidate weaker", "#d95f02"),
    ("EQUIVALENT", "Equivalent", "#1f77b4"),
    ("INCOMPARABLE", "Incomparable", "#7570b3"),
)
SYSTEMS = (
    ("Terra", "-", 2.2),
    ("Poolside", "--", 2.2),
)


def load_runs() -> dict[str, list[dict]]:
    payload = json.loads(DATA.read_text(encoding="utf-8"))
    if payload["record_count"] != 48:
        raise RuntimeError("comparison cactus plots require exactly 48 campaign records")
    terra = []
    for row in payload["scp"]:
        terra.append({
            "dataset_id": row["dataset_id"],
            "gate_qualified": row["acceptance_passed"],
            "comparison_verdict": row["comparison_verdict"],
            "active_seconds": row["active_seconds"],
            "tokens": row["tokens"],
        })
    poolside = payload["poolside"]
    ids = {row["dataset_id"] for row in terra}
    if ids != {row["dataset_id"] for row in poolside} or len(ids) != DATASET_N:
        raise RuntimeError("Terra and Poolside campaign IDs do not match exactly")
    return {"Terra": terra, "Poolside": poolside}


def outcome_rows(rows: list[dict], outcome: str) -> list[dict]:
    qualified = [row for row in rows if row["gate_qualified"]]
    if outcome == "qualified":
        return qualified
    return [row for row in qualified if row["comparison_verdict"] == outcome]


def cactus_xy(values: list[float]) -> tuple[list[float], list[int]]:
    ordered = sorted(values)
    return [0, *ordered], list(range(len(ordered) + 1))


def format_tokens(value: float, _: int | None = None) -> str:
    if value == 0:
        return "0"
    if value >= 1_000_000:
        return f"{value / 1_000_000:.3g}M"
    if value >= 1_000:
        return f"{value / 1_000:.3g}k"
    return f"{value:g}"


def token_ticks(cutoff: float) -> list[float]:
    ticks = [tick for tick in MaxNLocator(nbins=8, steps=[1, 2, 2.5, 5, 10]).tick_values(0, cutoff)
             if 0 <= tick < cutoff]
    if len(ticks) > 1 and cutoff - ticks[-1] < 0.35 * (ticks[-1] - ticks[-2]):
        ticks.pop()
    return [*ticks, cutoff]


def render(path: Path, runs: dict[str, list[dict]], getter, *, xlabel: str,
           xmax: float, token_axis: bool) -> None:
    plt.style.use("classic")
    fig, ax = plt.subplots(figsize=(13, 8))
    fig.patch.set_facecolor("white")
    ax.set_facecolor("white")

    for system, linestyle, linewidth in SYSTEMS:
        for outcome, _, color in OUTCOMES:
            subset = outcome_rows(runs[system], outcome)
            values = [getter(row) for row in subset]
            xs, ys = cactus_xy(values)
            ax.plot(xs, ys, color=color, linestyle=linestyle, linewidth=linewidth)
            if values:
                offset = 8 if system == "Terra" else -13
                ax.annotate(
                    f"{system} {len(values)}",
                    xy=(xs[-1], ys[-1]), xytext=(-7, offset), textcoords="offset points",
                    ha="right", va="center", fontsize=11, fontweight="bold", color=color,
                    bbox={"facecolor": "white", "edgecolor": "none", "alpha": 0.82, "pad": 1},
                )

    ax.set_xlim(0, xmax)
    if token_axis:
        ax.xaxis.set_major_locator(FixedLocator(token_ticks(xmax)))
        ax.xaxis.set_major_formatter(FuncFormatter(format_tokens))
    else:
        ax.xaxis.set_major_locator(MultipleLocator(30))
        ax.axvline(60, color="#1f77b4", linestyle=":", linewidth=1.3)
        ax.text(60, 46.2, "Terra cutoff", rotation=90, ha="right", va="top",
                color="#1f77b4", fontsize=10)
        ax.text(179, 46.2, "Poolside cutoff", rotation=90, ha="right", va="top",
                color="#555555", fontsize=10)
    ax.set_ylim(0, 51.5)
    ax.yaxis.set_major_locator(MaxNLocator(integer=True))
    ax.axhline(DATASET_N, color="black", linestyle=":", linewidth=1.4)
    ax.annotate("Campaign N=48", xy=(1, DATASET_N), xycoords=("axes fraction", "data"),
                xytext=(-6, 5), textcoords="offset points", ha="right", va="bottom",
                fontsize=14, fontweight="bold")
    ax.grid(True, color="0.84", linewidth=0.8)
    ax.set_axisbelow(True)
    ax.tick_params(axis="both", labelsize=13)
    ax.set_xlabel(xlabel, fontsize=16)
    ax.set_ylabel("Number of Candidates", fontsize=16)
    fig.suptitle(TITLE, fontsize=21, y=0.975)

    outcome_legend = ax.legend(
        handles=[Line2D([0], [0], color=color, linewidth=2.4,
                        label=("Incomparable (Poolside: 0)"
                               if outcome == "INCOMPARABLE" else label))
                 for outcome, label, color in OUTCOMES],
        loc="upper left", bbox_to_anchor=(0.48, 0.87), fontsize=12,
        frameon=True, fancybox=False, facecolor="white", edgecolor="black",
    )
    ax.add_artist(outcome_legend)
    ax.legend(
        handles=[Line2D([0], [0], color="black", linestyle=style, linewidth=2.2, label=system)
                 for system, style, _ in SYSTEMS],
        loc="upper left", bbox_to_anchor=(0.80, 0.87), fontsize=12,
        frameon=True, fancybox=False, facecolor="white", edgecolor="black",
    )
    fig.tight_layout(rect=(0, 0, 1, 0.92))
    fig.savefig(path, bbox_inches="tight")
    plt.close(fig)
    if path.suffix == ".svg":
        path.write_text(
            "\n".join(line.rstrip() for line in path.read_text(encoding="utf-8").splitlines())
            + "\n", encoding="utf-8")
    print(f"wrote {path}")


def write_stats(runs: dict[str, list[dict]], metrics: tuple[tuple[str, str, str], ...]) -> None:
    lines = [
        "# Poolside–Terra cactus statistics", "",
        "All values use the 48 seed-derived campaign instances; four legacy systems are excluded.", "",
        "| System | Configured cutoff | Gate-qualified | Equivalent | Weaker | Incomparable | Inconclusive | Invalid input |",
        "|---|---:|---:|---:|---:|---:|---:|---:|",
    ]
    for system in ("Terra", "Poolside"):
        qualified = outcome_rows(runs[system], "qualified")
        counts = Counter(row["comparison_verdict"] for row in qualified)
        cutoff = "60 min" if system == "Terra" else "180 min"
        lines.append(
            f"| {system} | {cutoff} | {len(qualified)} | {counts['EQUIVALENT']} | "
            f"{counts['CANDIDATE_WEAKER']} | {counts['INCOMPARABLE']} | "
            f"{counts['INCONCLUSIVE']} | {counts['INVALID_INPUT']} |"
        )
    lines += [
        "", "The resolved verdict curves are restricted to gate-qualified candidates. "
        "Inconclusive and invalid-input candidates remain in the gray qualified-total curve.", "",
        "## Shared token definitions", "",
        "- Input and output are provider-reported counters aggregated over each candidate's attempts/trajectories.",
        "- Terra cached input and Poolside cache-read input are treated as corresponding cache telemetry.",
        "- Comparable total tokens are input plus output. Cached input is already a subset of input, and Terra reasoning output is already a subset of output.",
        "- There is no paired reasoning-output plot because Poolside does not expose a corresponding field.", "",
        "| Metric | Terra qualified max | Poolside qualified max | Shared x-axis cutoff |",
        "|---|---:|---:|---:|",
    ]
    for field, _, label in metrics:
        maxima = {}
        for system in ("Terra", "Poolside"):
            values = [row["tokens"][field] for row in outcome_rows(runs[system], "qualified")]
            maxima[system] = max(values)
        cutoff = max(maxima.values())
        lines.append(f"| {label} | {maxima['Terra']:,} | {maxima['Poolside']:,} | {cutoff:,} |")
    pool_precision = Counter(row["active_seconds_precision"] for row in runs["Poolside"])
    lines += ["", "## Timing caveat", "",
              "Poolside uses cumulative active subprocess time with a three-hour cutoff; Terra uses a one-hour cutoff. "
              "Poolside timings marked as conservative upper bounds are plotted at that upper bound.", "",
              *[f"- Poolside timing precision `{key}`: {value} runs"
                for key, value in sorted(pool_precision.items())], ""]
    (HERE / "STATS.md").write_text("\n".join(lines), encoding="utf-8")
    print(f"wrote {HERE / 'STATS.md'}")


def main() -> None:
    runs = load_runs()
    assert len(outcome_rows(runs["Terra"], "qualified")) == 38
    assert len(outcome_rows(runs["Poolside"], "qualified")) == 11
    render(HERE / "cactus-elapsed-time.svg", runs, lambda row: row["active_seconds"] / 60,
           xlabel="Active elapsed time per candidate (minutes)", xmax=180, token_axis=False)
    metrics = (
        ("input_tokens", "cactus-input-tokens.svg", "Input tokens"),
        ("cached_input_tokens", "cactus-cached-input-tokens.svg", "Cached/cache-read input tokens"),
        ("output_tokens", "cactus-output-tokens.svg", "Output tokens"),
        ("total_tokens", "cactus-total-tokens.svg", "Comparable total tokens (input + output)"),
    )
    for field, filename, label in metrics:
        cutoff = max(row["tokens"][field]
                     for system in runs.values()
                     for row in outcome_rows(system, "qualified"))
        render(HERE / filename, runs, lambda row, key=field: row["tokens"][key],
               xlabel=f"{label} per candidate", xmax=cutoff, token_axis=True)
    write_stats(runs, metrics)


if __name__ == "__main__":
    main()
