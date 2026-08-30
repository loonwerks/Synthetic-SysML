"""Shared presentation helpers for the repository visualization suite."""

from __future__ import annotations

import json
from pathlib import Path

import matplotlib.pyplot as plt
import numpy as np
from matplotlib.ticker import FuncFormatter


HERE = Path(__file__).resolve().parent
DATA = HERE / "analysis-data.json"
DIFFICULTIES = ("small", "medium", "hard")
DIFFICULTY_COLORS = {"small": "#4daf4a", "medium": "#377eb8", "hard": "#984ea3"}
VERDICT_ORDER = (
    "EQUIVALENT", "CANDIDATE_WEAKER", "INCOMPARABLE", "INCONCLUSIVE", "INVALID_INPUT"
)
VERDICT_LABELS = {
    "EQUIVALENT": "Equivalent",
    "CANDIDATE_WEAKER": "Candidate weaker",
    "CANDIDATE_STRONGER": "Candidate stronger",
    "INCOMPARABLE": "Incomparable",
    "INCONCLUSIVE": "Inconclusive",
    "INVALID_INPUT": "Invalid input",
}
VERDICT_COLORS = {
    "EQUIVALENT": "#1f77b4",
    "CANDIDATE_WEAKER": "#d95f02",
    "CANDIDATE_STRONGER": "#2ca02c",
    "INCOMPARABLE": "#9467bd",
    "INCONCLUSIVE": "#7f7f7f",
    "INVALID_INPUT": "#8c564b",
}


def load_data() -> tuple[list[dict], list[dict]]:
    payload = json.loads(DATA.read_text(encoding="utf-8"))
    generation = payload["generation"]
    scp_by_id = {row["dataset_id"]: row for row in payload["scp"]}
    joined = [{**row, "scp": scp_by_id[row["dataset_id"]]} for row in generation]
    return generation, joined


def new_figure(*, figsize=(12, 7.5), nrows=1, ncols=1, **kwargs):
    plt.style.use("classic")
    fig, axes = plt.subplots(nrows=nrows, ncols=ncols, figsize=figsize, **kwargs)
    fig.patch.set_facecolor("white")
    for ax in np.atleast_1d(axes).flat:
        ax.set_facecolor("white")
        ax.grid(True, color="0.85", linewidth=0.8)
        ax.set_axisbelow(True)
        ax.tick_params(axis="both", labelsize=12)
    return fig, axes


def finish(fig, path: Path, title: str, *, rect=(0, 0, 1, 0.93)) -> None:
    fig.suptitle(title, fontsize=20, y=0.985)
    fig.tight_layout(rect=rect)
    fig.savefig(path, dpi=180, bbox_inches="tight", facecolor="white")
    plt.close(fig)
    print(f"wrote {path}")


def compact_number(value: float, _: int | None = None) -> str:
    absolute = abs(value)
    if absolute >= 1_000_000:
        return f"{value / 1_000_000:g}M"
    if absolute >= 1_000:
        return f"{value / 1_000:g}k"
    return f"{value:g}"


def token_formatter(ax, axis="y") -> None:
    getattr(ax, f"{axis}axis").set_major_formatter(FuncFormatter(compact_number))


def box_and_points(ax, groups, labels, colors, *, ylabel: str) -> None:
    positions = np.arange(1, len(groups) + 1)
    boxes = ax.boxplot(groups, positions=positions, widths=0.55, patch_artist=True,
                       showfliers=False, medianprops={"color": "black", "linewidth": 2})
    for patch, color in zip(boxes["boxes"], colors):
        patch.set_facecolor(color)
        patch.set_alpha(0.35)
    for index, (values, color) in enumerate(zip(groups, colors), 1):
        if not values:
            continue
        jitter = np.linspace(-0.16, 0.16, len(values))
        ax.scatter(index + jitter, values, color=color, edgecolor="white", linewidth=0.5,
                   s=38, alpha=0.9, zorder=3)
    ax.set_xticks(positions, labels)
    ax.set_ylabel(ylabel, fontsize=14)


def annotate_bars(ax, bars, *, fmt=lambda value: f"{value:g}") -> None:
    for bar in bars:
        value = bar.get_height()
        ax.annotate(fmt(value), (bar.get_x() + bar.get_width() / 2, value),
                    xytext=(0, 4), textcoords="offset points", ha="center", va="bottom",
                    fontsize=11, fontweight="bold")
