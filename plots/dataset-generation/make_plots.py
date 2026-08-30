#!/usr/bin/env python3
"""Research-question-driven plots for the 48-instance seed-derived corpus."""

from __future__ import annotations

import sys
from collections import Counter, defaultdict
from pathlib import Path

import numpy as np
from matplotlib.lines import Line2D


HERE = Path(__file__).resolve().parent
sys.path.insert(0, str(HERE.parent))
from plot_style import (  # noqa: E402
    DIFFICULTIES, DIFFICULTY_COLORS, annotate_bars, box_and_points, finish,
    load_data, new_figure, token_formatter,
)


def campaign_rows(rows):
    return [row for row in rows if row["source_kind"] == "cps-48"]


def by_tier(rows, getter):
    return [[getter(row) for row in rows if row["difficulty"] == tier] for tier in DIFFICULTIES]


def tier_legend(ax):
    ax.legend(handles=[Line2D([0], [0], marker="o", linestyle="", markersize=9,
                              color=DIFFICULTY_COLORS[tier], label=tier.title())
                       for tier in DIFFICULTIES], loc="best", fontsize=11)


def corpus_design(rows):
    families = sorted({row["family"] for row in rows})
    matrix = np.array([[sum(row["family"] == family and row["difficulty"] == tier
                            for row in rows) for tier in DIFFICULTIES] for family in families])
    fig, ax = new_figure(figsize=(10, 8))
    im = ax.imshow(matrix, cmap="Blues", vmin=0, vmax=2, aspect="auto")
    ax.grid(False)
    ax.set_xticks(range(3), [tier.title() for tier in DIFFICULTIES])
    ax.set_yticks(range(len(families)), [family.replace("-", " ").title() for family in families])
    for y in range(len(families)):
        for x in range(3):
            ax.text(x, y, str(matrix[y, x]), ha="center", va="center", fontsize=13,
                    color="white" if matrix[y, x] == 2 else "black", fontweight="bold")
    ax.set_xlabel("Designed complexity tier", fontsize=14)
    ax.set_ylabel("Source family", fontsize=14)
    fig.colorbar(im, ax=ax, label="Distinct replicates")
    finish(fig, HERE / "corpus-design-grid.png",
           "CPS-48 Coverage Is Balanced Across Domain, Tier, and Replicate")


def complexity_by_tier(rows):
    fields = [
        ("semantic_usages", "Semantic usages"),
        ("semantic_interactions", "Semantic interactions"),
        ("nontrivial_contract_cases", "Nontrivial contract cases"),
        ("scenario_families", "Scenario families"),
    ]
    fig, axes = new_figure(figsize=(13, 10), nrows=2, ncols=2)
    for ax, (field, label) in zip(axes.flat, fields):
        groups = by_tier(rows, lambda row: row["complexity"][field])
        box_and_points(ax, groups, [tier.title() for tier in DIFFICULTIES],
                       [DIFFICULTY_COLORS[tier] for tier in DIFFICULTIES], ylabel=label)
    finish(fig, HERE / "complexity-by-tier.png",
           "Designed Tiers Increase Several Independent Forms of Model Complexity")


def complexity_correlations(rows):
    fields = ["semantic_usages", "semantic_interactions", "nontrivial_contract_cases",
              "scenario_families"]
    labels = ["Usages", "Interactions", "Contract cases", "Scenarios"]
    matrix = np.array([[row["complexity"][field] for field in fields] for row in rows])
    corr = np.corrcoef(matrix, rowvar=False)
    fig, ax = new_figure(figsize=(8.5, 7.5))
    image = ax.imshow(corr, cmap="RdBu_r", vmin=-1, vmax=1)
    ax.grid(False)
    ax.set_xticks(range(4), labels, rotation=25, ha="right")
    ax.set_yticks(range(4), labels)
    for y in range(4):
        for x in range(4):
            ax.text(x, y, f"{corr[y, x]:.2f}", ha="center", va="center",
                    fontsize=13, color="white" if abs(corr[y, x]) > 0.6 else "black")
    fig.colorbar(image, ax=ax, label="Pearson correlation")
    finish(fig, HERE / "complexity-metric-correlations.png",
           "The Campaign's Four Complexity Measures Move Together Strongly")


def topology_vs_contracts(rows):
    fig, ax = new_figure()
    for tier in DIFFICULTIES:
        subset = [row for row in rows if row["difficulty"] == tier]
        ax.scatter([row["complexity"]["semantic_interactions"] for row in subset],
                   [row["complexity"]["nontrivial_contract_cases"] for row in subset],
                   s=[35 + 6 * row["complexity"]["semantic_usages"] for row in subset],
                   color=DIFFICULTY_COLORS[tier], alpha=0.8, edgecolor="white", label=tier.title())
    ax.set_xlabel("Semantic interactions", fontsize=14)
    ax.set_ylabel("Nontrivial contract cases", fontsize=14)
    ax.legend(fontsize=11, title="Designed tier")
    finish(fig, HERE / "topology-vs-contract-cases.png",
           "Architectural Connectivity and Behavioral Case Burden Can Diverge")


def generation_time(rows):
    valid = [row for row in rows if row["generation"]["elapsed_seconds"] is not None]
    fig, ax = new_figure()
    groups = by_tier(valid, lambda row: row["generation"]["elapsed_seconds"] / 60)
    box_and_points(ax, groups, [tier.title() for tier in DIFFICULTIES],
                   [DIFFICULTY_COLORS[tier] for tier in DIFFICULTIES],
                   ylabel="End-to-end generation time (minutes)")
    ax.set_yscale("log")
    ax.set_ylim(50, 1500)
    finish(fig, HERE / "generation-time-by-tier.png",
           "Does Designed Difficulty Translate Into Longer Dataset Generation?")


def generation_role_time(rows):
    roles = ("designer", "model", "visualization")
    colors = ("#4c78a8", "#f58518", "#54a24b")
    medians = {role: [] for role in roles}
    for tier in DIFFICULTIES:
        subset = [row for row in rows if row["difficulty"] == tier]
        for role in roles:
            values = [row["generation"]["agents"].get(role, {}).get("wall_seconds")
                      for row in subset]
            medians[role].append(np.median([value for value in values if value is not None]) / 60)
    fig, ax = new_figure()
    bottom = np.zeros(3)
    x = np.arange(3)
    for role, color in zip(roles, colors):
        bars = ax.bar(x, medians[role], bottom=bottom, color=color, label=role.title())
        for index, bar in enumerate(bars):
            if medians[role][index] >= 4:
                ax.text(bar.get_x() + bar.get_width()/2, bottom[index] + medians[role][index]/2,
                        f"{medians[role][index]:.0f}", ha="center", va="center", fontsize=10,
                        color="white", fontweight="bold")
        bottom += medians[role]
    ax.set_xticks(x, [tier.title() for tier in DIFFICULTIES])
    ax.set_ylabel("Median agent-stage minutes", fontsize=14)
    ax.legend(fontsize=11)
    finish(fig, HERE / "generation-time-by-role.png",
           "Which Agent Role Dominates Dataset-Generation Time?")


def generation_tokens(rows):
    fig, ax = new_figure()
    groups = by_tier(rows, lambda row: row["generation"]["overall_tokens"])
    box_and_points(ax, groups, [tier.title() for tier in DIFFICULTIES],
                   [DIFFICULTY_COLORS[tier] for tier in DIFFICULTIES],
                   ylabel="Generation tokens per accepted dataset")
    token_formatter(ax)
    finish(fig, HERE / "generation-tokens-by-tier.png",
           "How Much Model Context Does Each Designed Tier Consume?")


def generation_role_tokens(rows):
    roles = ("designer", "model", "visualization")
    colors = ("#4c78a8", "#f58518", "#54a24b")
    fig, ax = new_figure()
    x = np.arange(3)
    bottom = np.zeros(3)
    for role, color in zip(roles, colors):
        values = []
        for tier in DIFFICULTIES:
            subset = [row for row in rows if row["difficulty"] == tier]
            values.append(np.median([
                row["generation"]["agents"][role]["input_tokens"]
                + row["generation"]["agents"][role]["output_tokens"]
                for row in subset
            ]))
        ax.bar(x, values, bottom=bottom, color=color, label=role.title())
        bottom += values
    ax.set_xticks(x, [tier.title() for tier in DIFFICULTIES])
    ax.set_ylabel("Median tokens, stacked by role", fontsize=14)
    token_formatter(ax)
    ax.legend(fontsize=11)
    finish(fig, HERE / "generation-tokens-by-role.png",
           "Visualization and Review Are Material Parts of Generation Cost")


def cache_utilization(rows):
    fig, ax = new_figure()
    for tier in DIFFICULTIES:
        subset = [row for row in rows if row["difficulty"] == tier]
        ax.scatter([row["generation"]["input_tokens"] for row in subset],
                   [100 * row["generation"]["cache_fraction"] for row in subset],
                   color=DIFFICULTY_COLORS[tier], s=65, edgecolor="white", alpha=0.85,
                   label=tier.title())
    ax.set_xlabel("Total input tokens", fontsize=14)
    ax.set_ylabel("Cached share of input (%)", fontsize=14)
    token_formatter(ax, "x")
    ax.legend(fontsize=11)
    finish(fig, HERE / "generation-cache-utilization.png",
           "Large Generation Runs Mostly Reuse Cached Context")


def retry_burden(rows):
    fig, ax = new_figure()
    def bucket(value):
        if value == 0: return "None"
        if value <= 2: return "1–2"
        if value <= 5: return "3–5"
        return "6+"
    buckets = ("None", "1–2", "3–5", "6+")
    counts = {tier: Counter(bucket(row["generation"]["repeat_stage_count"])
                            for row in rows if row["difficulty"] == tier)
              for tier in DIFFICULTIES}
    bottom = np.zeros(3)
    colors = ["#d9d9d9", "#9ecae1", "#4292c6", "#08519c"]
    x = np.arange(3)
    for index, repeat in enumerate(buckets):
        values = [counts[tier][repeat] for tier in DIFFICULTIES]
        ax.bar(x, values, bottom=bottom, color=colors[min(index, len(colors)-1)],
               label=f"{repeat} repeated stages")
        bottom += values
    ax.set_xticks(x, [tier.title() for tier in DIFFICULTIES])
    ax.set_ylabel("Accepted campaign runs", fontsize=14)
    ax.legend(fontsize=10)
    finish(fig, HERE / "generation-repeat-stage-burden.png",
           "How Often Did Accepted Datasets Require Repeated Agent Stages?")


def publication_size(rows):
    panels = [
        (lambda row: row["published"]["architectural_interfaces"],
         "Architectural Interfaces\n(Ports + Connections)"),
        (lambda row: row["published"]["natural_language"]["words"],
         "Word Count in SNL Spec"),
        (lambda row: row["published"]["gumbo_contract_clauses"],
         "Number of GUMBO Contracts"),
    ]
    fig, axes = new_figure(figsize=(14, 5), ncols=3)
    for ax, (getter, ylabel) in zip(axes, panels):
        groups = by_tier(rows, getter)
        box_and_points(ax, groups, ["Small", "Medium", "Hard"],
                       [DIFFICULTY_COLORS[tier] for tier in DIFFICULTIES],
                       ylabel=ylabel)
        ax.set_ylim(bottom=0)
    finish(fig, HERE / "published-benchmark-size.png",
           "Synthetic Model Statistics Across Difficulties")


def erasure_and_prompt(rows):
    fig, axes = new_figure(figsize=(13, 5.5), ncols=2)
    for tier in DIFFICULTIES:
        subset = [row for row in rows if row["difficulty"] == tier]
        color = DIFFICULTY_COLORS[tier]
        axes[0].scatter([row["published"]["formal_clauses"] for row in subset],
                        [row["published"]["erased_nonblank_lines"] for row in subset],
                        color=color, s=55, edgecolor="white", alpha=0.85, label=tier.title())
        axes[1].scatter([row["published"]["formal_clauses"] for row in subset],
                        [row["published"]["natural_language"]["words"] for row in subset],
                        color=color, s=55, edgecolor="white", alpha=0.85)
    axes[0].set(xlabel="Published formal clauses", ylabel="Oracle lines erased from M*")
    axes[1].set(xlabel="Published formal clauses", ylabel="Words in N")
    for ax in axes:
        ax.xaxis.label.set_size(13); ax.yaxis.label.set_size(13)
    axes[0].legend(fontsize=10)
    finish(fig, HERE / "publication-transformation.png",
           "Publication Removes Formal Behavior and Re-Expresses It as Natural Language")


def requirement_composition(rows):
    fields = ["context_statements", "functions", "states", "formal_clauses"]
    labels = ["Context statements", "Functions", "State declarations", "Formal clauses"]
    colors = ["#9ecae1", "#74c476", "#fd8d3c", "#756bb1"]
    fig, ax = new_figure()
    x = np.arange(3)
    bottom = np.zeros(3)
    for field, label, color in zip(fields, labels, colors):
        values = [np.mean([row["published"][field]
                          for row in rows if row["difficulty"] == tier])
                  for tier in DIFFICULTIES]
        ax.bar(x, values, bottom=bottom, color=color, label=label)
        bottom += values
    ax.set_xticks(x, [tier.title() for tier in DIFFICULTIES])
    ax.set_ylabel("Mean published items per instance", fontsize=14)
    ax.legend(fontsize=10)
    finish(fig, HERE / "published-requirement-composition.png",
           "Harder Instances Publish More Behavioral Obligations, Not Just More Prose")


def domain_clause_heatmap(rows):
    families = sorted({row["family"] for row in rows})
    matrix = np.array([[np.mean([row["published"]["formal_clauses"] for row in rows
                                if row["family"] == family and row["difficulty"] == tier])
                        for tier in DIFFICULTIES] for family in families])
    fig, ax = new_figure(figsize=(10, 8))
    image = ax.imshow(matrix, cmap="YlOrRd", aspect="auto")
    ax.grid(False)
    ax.set_xticks(range(3), [tier.title() for tier in DIFFICULTIES])
    ax.set_yticks(range(len(families)), [family.replace("-", " ").title() for family in families])
    for y in range(len(families)):
        for x in range(3):
            ax.text(x, y, f"{matrix[y, x]:.0f}", ha="center", va="center", fontsize=11)
    fig.colorbar(image, ax=ax, label="Mean formal clauses across two replicates")
    finish(fig, HERE / "formal-clauses-by-domain-tier.png",
           "Difficulty Labels Do Not Erase Domain-Specific Contract Burden")


def replicate_deltas(rows):
    fields = [
        ("semantic_usages", "Usages"), ("semantic_interactions", "Interactions"),
        ("nontrivial_contract_cases", "Contract cases"), ("scenario_families", "Scenarios"),
    ]
    pairs = defaultdict(dict)
    for row in rows:
        pairs[(row["family"], row["difficulty"])][row["replicate"]] = row
    fig, axes = new_figure(figsize=(13, 10), nrows=2, ncols=2)
    for ax, (field, label) in zip(axes.flat, fields):
        groups = []
        for tier in DIFFICULTIES:
            values = []
            for (family, difficulty), pair in pairs.items():
                if difficulty != tier or set(pair) != {1, 2}:
                    continue
                a, b = pair[1]["complexity"][field], pair[2]["complexity"][field]
                values.append(100 * abs(a - b) / ((a + b) / 2))
            groups.append(values)
        box_and_points(ax, groups, [tier.title() for tier in DIFFICULTIES],
                       [DIFFICULTY_COLORS[tier] for tier in DIFFICULTIES],
                       ylabel=f"Paired difference in {label} (%)")
    finish(fig, HERE / "replicate-complexity-diversity.png",
           "Diverse Replicates Differ Quantitatively Even Within the Same Campaign Cell")


def generation_efficiency(rows):
    fig, axes = new_figure(figsize=(13, 5.5), ncols=2)
    for tier in DIFFICULTIES:
        subset = [row for row in rows if row["difficulty"] == tier]
        color = DIFFICULTY_COLORS[tier]
        axes[0].scatter([row["published"]["formal_clauses"] for row in subset],
                        [row["generation"]["overall_tokens"] for row in subset],
                        color=color, s=60, edgecolor="white", alpha=0.85, label=tier.title())
        timed = [row for row in subset if row["generation"]["elapsed_seconds"] is not None]
        axes[1].scatter([row["generation"]["overall_tokens"] for row in timed],
                        [row["generation"]["elapsed_seconds"] / 60 for row in timed],
                        color=color, s=60, edgecolor="white", alpha=0.85)
    axes[0].set(xlabel="Published formal clauses", ylabel="Generation tokens")
    axes[1].set(xlabel="Generation tokens", ylabel="Generation time (minutes)")
    token_formatter(axes[0]); token_formatter(axes[1], "x")
    for ax in axes:
        ax.xaxis.label.set_size(13); ax.yaxis.label.set_size(13)
    axes[0].legend(fontsize=10)
    finish(fig, HERE / "generation-cost-relationships.png",
           "Generation Cost Reflects More Than the Final Number of Contract Clauses")


def main():
    rows, _ = load_data()
    if len(rows) != 48 or any(row["source_kind"] != "cps-48" for row in rows):
        raise RuntimeError("expected exactly 48 CPS-48 campaign datasets")
    corpus_design(rows)
    complexity_by_tier(rows)
    complexity_correlations(rows)
    topology_vs_contracts(rows)
    generation_time(rows)
    generation_role_time(rows)
    generation_tokens(rows)
    generation_role_tokens(rows)
    cache_utilization(rows)
    retry_burden(rows)
    publication_size(rows)
    erasure_and_prompt(rows)
    requirement_composition(rows)
    domain_clause_heatmap(rows)
    replicate_deltas(rows)
    generation_efficiency(rows)


if __name__ == "__main__":
    main()
