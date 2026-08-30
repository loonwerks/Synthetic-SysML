#!/usr/bin/env python3
"""Exploratory plots for the 48 seed-derived Terra High candidates."""

from __future__ import annotations

import sys
from collections import Counter, defaultdict
from pathlib import Path

import numpy as np
from matplotlib.lines import Line2D
from matplotlib.patches import Patch


HERE = Path(__file__).resolve().parent
sys.path.insert(0, str(HERE.parent))
from plot_style import (  # noqa: E402
    DIFFICULTIES, DIFFICULTY_COLORS, VERDICT_COLORS, VERDICT_LABELS, VERDICT_ORDER,
    annotate_bars, box_and_points, finish, load_data, new_figure, token_formatter,
)


def campaign(rows):
    return [row for row in rows if row["source_kind"] == "cps-48"]


def verdict(row):
    return row["scp"]["comparison_verdict"]


def short_verdicts():
    return [value for value in VERDICT_ORDER if value != "INVALID_INPUT"]


def outcome_overview(rows):
    fig, axes = new_figure(figsize=(15, 7), ncols=2)
    labels = [VERDICT_LABELS[value].replace("Candidate ", "") for value in VERDICT_ORDER]
    colors = [VERDICT_COLORS[value] for value in VERDICT_ORDER]

    for ax, passed, heading in zip(
        axes,
        (True, False),
        ("Candidate cleared all gates — 38", "Candidate did not clear all gates — 10"),
    ):
        values = [sum(row["scp"]["acceptance_passed"] == passed
                      and verdict(row) == value for row in rows)
                  for value in VERDICT_ORDER]
        wedges, _ = ax.pie(
            values,
            colors=colors,
            startangle=90,
            counterclock=False,
            wedgeprops={"edgecolor": "white", "linewidth": 1.5},
        )
        ax.set_title(heading, fontsize=18, fontweight="bold", pad=14,
                     color="#2b7b3f" if passed else "#b22222")
        total = sum(values)
        detailed_labels = [
            f"{label}: {count} ({count / total:.1%})"
            for label, count in zip(labels, values)
        ]
        ax.legend(wedges, detailed_labels, loc="lower center",
                  bbox_to_anchor=(0.5, -0.22), ncol=2, fontsize=11, frameon=False)
    finish(fig, HERE / "outcome-overview.png",
           "Formal-Ground-Truth Relation by Candidate Gate Status")


def acceptance_verdict_matrix(rows):
    matrix = np.array([[sum(row["scp"]["acceptance_passed"] == passed
                            and verdict(row) == value for row in rows)
                        for value in VERDICT_ORDER] for passed in (True, False)])
    fig, ax = new_figure(figsize=(11, 5))
    image = ax.imshow(matrix, cmap="Blues", aspect="auto")
    ax.grid(False)
    ax.set_xticks(range(len(VERDICT_ORDER)), [VERDICT_LABELS[v] for v in VERDICT_ORDER],
                  rotation=25, ha="right")
    ax.set_yticks([0, 1], ["Candidate cleared all gates", "Candidate did not clear all gates"])
    for y in range(2):
        for x in range(len(VERDICT_ORDER)):
            ax.text(x, y, str(matrix[y, x]), ha="center", va="center", fontsize=14,
                    color="white" if matrix[y, x] > matrix.max()/2 else "black",
                    fontweight="bold")
    fig.colorbar(image, ax=ax, label="Instances")
    finish(fig, HERE / "acceptance-vs-equivalence.png",
           "How Do Candidate Gate Qualification and Formal Equivalence Intersect?")


def verdict_by_tier(rows):
    fig, ax = new_figure()
    x = np.arange(3)
    bottom = np.zeros(3)
    for value in VERDICT_ORDER:
        counts = [sum(row["difficulty"] == tier and verdict(row) == value for row in rows)
                  for tier in DIFFICULTIES]
        ax.bar(x, counts, bottom=bottom, color=VERDICT_COLORS[value],
               label=VERDICT_LABELS[value])
        bottom += counts
    ax.set_xticks(x, [tier.title() for tier in DIFFICULTIES])
    ax.set_ylabel("Campaign instances (16 per tier)", fontsize=14)
    ax.legend(fontsize=10, ncol=2)
    finish(fig, HERE / "verdict-by-designed-tier.png",
           "Does Designed Dataset Difficulty Shift Formal Reconstruction Outcomes?")


def acceptance_by_tier(rows):
    fig, ax = new_figure()
    passed = [sum(row["difficulty"] == tier and row["scp"]["acceptance_passed"] for row in rows)
              for tier in DIFFICULTIES]
    failed = [16 - value for value in passed]
    x = np.arange(3)
    ax.bar(x, passed, color="#4daf4a", label="Cleared all gates")
    ax.bar(x, failed, bottom=passed, color="#e41a1c", label="Did not clear all gates")
    for i, value in enumerate(passed):
        ax.text(i, value / 2, f"{value}/16", ha="center", va="center",
                color="white", fontweight="bold", fontsize=12)
    ax.set_xticks(x, [tier.title() for tier in DIFFICULTIES])
    ax.set_ylabel("Campaign instances", fontsize=14)
    ax.legend(fontsize=11)
    finish(fig, HERE / "acceptance-by-designed-tier.png",
           "Are Harder Benchmarks Less Likely to Produce Gate-Qualified Candidates?")


def domain_outcome_map(rows):
    families = sorted({row["family"] for row in rows})
    columns = [(tier, replicate) for tier in DIFFICULTIES for replicate in (1, 2)]
    value_index = {value: index for index, value in enumerate(VERDICT_ORDER)}
    matrix = np.zeros((len(families), len(columns)))
    records = {(row["family"], row["difficulty"], row["replicate"]): row for row in rows}
    for y, family in enumerate(families):
        for x, (tier, replicate) in enumerate(columns):
            matrix[y, x] = value_index[verdict(records[(family, tier, replicate)])]
    from matplotlib.colors import BoundaryNorm, ListedColormap
    cmap = ListedColormap([VERDICT_COLORS[value] for value in VERDICT_ORDER])
    norm = BoundaryNorm(np.arange(-0.5, len(VERDICT_ORDER)+0.5), cmap.N)
    fig, ax = new_figure(figsize=(12, 8))
    ax.imshow(matrix, cmap=cmap, norm=norm, aspect="auto", interpolation="nearest")
    ax.grid(False)
    ax.set_xticks(range(6), [f"{tier.title()} R{rep}" for tier, rep in columns], rotation=20)
    ax.set_yticks(range(len(families)), [f.replace("-", " ").title() for f in families])
    for y, family in enumerate(families):
        for x, (tier, replicate) in enumerate(columns):
            row = records[(family, tier, replicate)]
            if not row["scp"]["acceptance_passed"]:
                ax.text(x, y, "×", ha="center", va="center", fontsize=18,
                        color="white", fontweight="bold")
    ax.legend(handles=[Patch(color=VERDICT_COLORS[v], label=VERDICT_LABELS[v])
                       for v in VERDICT_ORDER]
              + [Line2D([0], [0], marker="$×$", linestyle="", color="black",
                        label="Candidate did not clear all gates", markersize=12)],
              bbox_to_anchor=(1.01, 1), loc="upper left", fontsize=10)
    finish(fig, HERE / "domain-tier-replicate-outcomes.png",
           "Where Are Outcomes Stable—or Different—Across Diverse Replicates?",
           rect=(0, 0, 0.83, 0.93))


def metric_by_verdict(rows, field, ylabel, filename, title, *, tokens=False, nonnegative=True):
    present = [value for value in VERDICT_ORDER if any(verdict(row) == value for row in rows)]
    groups = [[field(row) for row in rows if verdict(row) == value] for value in present]
    fig, ax = new_figure(figsize=(12, 7.5))
    box_and_points(ax, groups, [VERDICT_LABELS[value].replace("Candidate ", "") for value in present],
                   [VERDICT_COLORS[value] for value in present], ylabel=ylabel)
    ax.tick_params(axis="x", rotation=20)
    if tokens:
        token_formatter(ax)
    if nonnegative:
        ax.set_ylim(bottom=0)
    finish(fig, HERE / filename, title)


def resource_distributions(rows):
    metric_by_verdict(rows, lambda row: row["scp"]["active_seconds"] / 60,
                      "Active elapsed time (minutes)", "elapsed-time-by-verdict.png",
                      "Do Formal Outcomes Separate by SCP Runtime?")
    metric_by_verdict(rows, lambda row: row["scp"]["tokens"]["total_tokens"],
                      "Total plotted tokens", "total-tokens-by-verdict.png",
                      "Do Formal Outcomes Separate by Token Consumption?", tokens=True)
    for field, ylabel, filename, title, tokens in [
        (lambda row: row["scp"]["active_seconds"] / 60, "Active elapsed time (minutes)",
         "elapsed-time-by-tier.png", "Does Designed Tier Predict SCP Runtime?", False),
        (lambda row: row["scp"]["tokens"]["total_tokens"], "Total plotted tokens",
         "total-tokens-by-tier.png", "Does Designed Tier Predict SCP Token Demand?", True),
    ]:
        fig, ax = new_figure()
        groups = [[field(row) for row in rows if row["difficulty"] == tier]
                  for tier in DIFFICULTIES]
        box_and_points(ax, groups, [tier.title() for tier in DIFFICULTIES],
                       [DIFFICULTY_COLORS[tier] for tier in DIFFICULTIES], ylabel=ylabel)
        if tokens: token_formatter(ax)
        ax.set_ylim(bottom=0)
        finish(fig, HERE / filename, title)


def token_time_scatter(rows):
    fig, ax = new_figure()
    for value in VERDICT_ORDER:
        subset = [row for row in rows if verdict(row) == value]
        ax.scatter([row["scp"]["active_seconds"] / 60 for row in subset],
                   [row["scp"]["tokens"]["total_tokens"] for row in subset],
                   s=75, marker="o", color=VERDICT_COLORS[value],
                   edgecolor=["black" if row["scp"]["acceptance_passed"] else "white"
                              for row in subset], linewidth=1.5, alpha=0.85,
                   label=VERDICT_LABELS[value])
    ax.axvline(60, color="black", linestyle=":", linewidth=1.3)
    ax.set_xlabel("Active elapsed time (minutes)", fontsize=14)
    ax.set_ylabel("Total plotted tokens", fontsize=14)
    token_formatter(ax)
    ax.set_xlim(left=0); ax.set_ylim(bottom=0)
    ax.legend(fontsize=9, ncol=2)
    finish(fig, HERE / "tokens-vs-elapsed-time.png",
           "Token Demand and Wall-Clock Demand Reveal Different Resource Bottlenecks")


def token_composition(rows):
    fields = ["input_tokens", "cached_input_tokens", "output_tokens", "reasoning_output_tokens"]
    labels = ["Input", "Cached input", "Output", "Reasoning output"]
    colors = ["#4c78a8", "#72b7b2", "#f58518", "#e45756"]
    present = [value for value in VERDICT_ORDER if any(verdict(row) == value for row in rows)]
    fig, ax = new_figure(figsize=(12, 7.5))
    x = np.arange(len(present)); bottom = np.zeros(len(present))
    for field, label, color in zip(fields, labels, colors):
        medians = [np.median([row["scp"]["tokens"][field] for row in rows
                              if verdict(row) == value]) for value in present]
        ax.bar(x, medians, bottom=bottom, color=color, label=label)
        bottom += medians
    ax.set_xticks(x, [VERDICT_LABELS[value].replace("Candidate ", "") for value in present],
                  rotation=20)
    ax.set_ylabel("Median tokens, arithmetic stack", fontsize=14)
    token_formatter(ax)
    ax.legend(fontsize=10)
    finish(fig, HERE / "token-composition-by-verdict.png",
           "Which Token Channels Drive Resource Use for Each Outcome?")


def cache_and_reasoning(rows):
    fig, axes = new_figure(figsize=(13, 5.5), ncols=2)
    for value in VERDICT_ORDER:
        subset = [row for row in rows if verdict(row) == value]
        color = VERDICT_COLORS[value]
        axes[0].scatter([row["scp"]["tokens"]["input_tokens"] for row in subset],
                        [100 * row["scp"]["tokens"]["cached_input_tokens"] /
                         row["scp"]["tokens"]["input_tokens"] for row in subset],
                        color=color, s=55, edgecolor="white", alpha=0.85,
                        label=VERDICT_LABELS[value])
        axes[1].scatter([row["scp"]["tokens"]["output_tokens"] for row in subset],
                        [row["scp"]["tokens"]["reasoning_output_tokens"] for row in subset],
                        color=color, s=55, edgecolor="white", alpha=0.85)
    axes[0].set(xlabel="Input tokens", ylabel="Cached / input tokens (%)")
    axes[1].set(xlabel="Output tokens", ylabel="Reasoning output tokens")
    token_formatter(axes[0], "x"); token_formatter(axes[1], "x"); token_formatter(axes[1])
    axes[0].set_xlim(left=0); axes[1].set_xlim(left=0); axes[1].set_ylim(bottom=0)
    for ax in axes:
        ax.xaxis.label.set_size(13); ax.yaxis.label.set_size(13)
    axes[0].legend(fontsize=8)
    finish(fig, HERE / "cache-and-reasoning-relationships.png",
           "Caching Is Consistent, While Reasoning Share Varies Across Runs")


def timeout_outcomes(rows):
    categories = ["Controller completed", "Controller timeout"]
    fig, ax = new_figure()
    bottom = np.zeros(2); x = np.arange(2)
    for value in VERDICT_ORDER:
        counts = [sum((not row["scp"]["timed_out"]) and verdict(row) == value for row in rows),
                  sum(row["scp"]["timed_out"] and verdict(row) == value for row in rows)]
        ax.bar(x, counts, bottom=bottom, color=VERDICT_COLORS[value], label=VERDICT_LABELS[value])
        bottom += counts
    ax.set_xticks(x, categories)
    ax.set_ylabel("Instances", fontsize=14)
    ax.legend(fontsize=10, ncol=2)
    finish(fig, HERE / "controller-timeout-outcomes.png",
           "A Controller Timeout Does Not Mean the Run Produced No Checkable Candidate")


def gate_failure_profile(rows):
    gates = ["tipe", "codegen", "component_logika", "integration_logika"]
    failures = [sum(not row["scp"]["gate_passes"].get(gate, False) for row in rows)
                for gate in gates]
    fig, ax = new_figure()
    bars = ax.bar(["Typecheck", "Codegen", "Component\nLogika", "Integration\nLogika"],
                  failures, color=["#4c78a8", "#f58518", "#e45756", "#72b7b2"])
    annotate_bars(ax, bars)
    ax.set_ylabel("Runs failing gate", fontsize=14)
    finish(fig, HERE / "accept-gate-failure-profile.png",
           "Which Independent Accept Gate Rejects the Most Candidates?")


def candidate_edit_size(rows):
    metric_by_verdict(rows, lambda row: row["scp"]["candidate"]["added_nonblank_lines"],
                      "Net nonblank lines added to M*", "candidate-edit-size-by-verdict.png",
                      "Does a Larger Reconstruction Edit Produce a Better Formal Match?",
                      nonnegative=False)


def complexity_vs_outcome(rows):
    fields = [("semantic_usages", "Semantic usages"),
              ("semantic_interactions", "Semantic interactions"),
              ("nontrivial_contract_cases", "Contract cases"),
              ("scenario_families", "Scenario families")]
    categories = ["EQUIVALENT", "CANDIDATE_WEAKER", "OTHER"]
    labels = ["Equivalent", "Weaker", "Other"]
    colors = [VERDICT_COLORS["EQUIVALENT"], VERDICT_COLORS["CANDIDATE_WEAKER"], "#777777"]
    fig, axes = new_figure(figsize=(13, 10), nrows=2, ncols=2)
    for ax, (field, ylabel) in zip(axes.flat, fields):
        groups = []
        for category in categories:
            groups.append([row["complexity"][field] for row in rows
                           if (verdict(row) == category if category != "OTHER"
                               else verdict(row) not in categories[:2])])
        box_and_points(ax, groups, labels, colors, ylabel=ylabel)
    finish(fig, HERE / "generation-complexity-vs-scp-outcome.png",
           "Which Generation-Time Complexity Measures Distinguish SCP Outcomes?")


def published_size_vs_resources(rows):
    fig, axes = new_figure(figsize=(13, 5.5), ncols=2)
    for value in VERDICT_ORDER:
        subset = [row for row in rows if verdict(row) == value]
        color = VERDICT_COLORS[value]
        x = [row["published"]["formal_clauses"] for row in subset]
        axes[0].scatter(x, [row["scp"]["active_seconds"] / 60 for row in subset],
                        color=color, s=55, edgecolor="white", alpha=0.85,
                        label=VERDICT_LABELS[value])
        axes[1].scatter(x, [row["scp"]["tokens"]["total_tokens"] for row in subset],
                        color=color, s=55, edgecolor="white", alpha=0.85)
    axes[0].set(xlabel="Published formal clauses", ylabel="Active elapsed time (minutes)")
    axes[1].set(xlabel="Published formal clauses", ylabel="Total plotted tokens")
    token_formatter(axes[1])
    axes[0].set_xlim(left=0); axes[0].set_ylim(bottom=0)
    axes[1].set_xlim(left=0); axes[1].set_ylim(bottom=0)
    for ax in axes:
        ax.xaxis.label.set_size(13); ax.yaxis.label.set_size(13)
    axes[0].legend(fontsize=8)
    finish(fig, HERE / "benchmark-size-vs-scp-resources.png",
           "Does Published Contract Volume Explain SCP Resource Use?")


def proof_burden(rows):
    metric_by_verdict(rows, lambda row: row["scp"]["proofs"]["proof_count"],
                      "Generated proof obligations", "proof-count-by-verdict.png",
                      "How Much Proof Work Does Each Formal Outcome Require?")
    fig, ax = new_figure()
    for value in VERDICT_ORDER:
        subset = [row for row in rows if verdict(row) == value]
        ax.scatter([row["scp"]["proofs"]["proof_count"] for row in subset],
                   [row["scp"]["proofs"]["verification_seconds"] for row in subset],
                   color=VERDICT_COLORS[value], s=60, edgecolor="white", alpha=0.85,
                   label=VERDICT_LABELS[value])
    ax.set_xlabel("Generated proof obligations", fontsize=14)
    ax.set_ylabel("Sum of verifier-reported seconds", fontsize=14)
    ax.set_xlim(left=0); ax.set_ylim(bottom=0)
    ax.legend(fontsize=9)
    finish(fig, HERE / "proof-count-vs-verifier-time.png",
           "Proof Count Alone Does Not Determine Checker Cost")


def proof_outcomes(rows):
    present = [value for value in VERDICT_ORDER if any(verdict(row) == value for row in rows)]
    fields = ["verified_count", "rejected_count", "sat_count", "unsat_count",
              "timeout_count", "error_count"]
    labels = ["Verified", "Rejected", "SAT", "UNSAT", "Timeout", "Error/other"]
    colors = ["#4daf4a", "#e41a1c", "#377eb8", "#984ea3", "#ff7f00", "#777777"]
    totals = np.array([sum(row["scp"]["proofs"]["proof_count"] for row in rows
                           if verdict(row) == value) for value in present])
    fig, ax = new_figure(figsize=(12, 7.5))
    bottom = np.zeros(len(present)); x = np.arange(len(present))
    for field, label, color in zip(fields, labels, colors):
        counts = np.array([sum(row["scp"]["proofs"][field] for row in rows
                               if verdict(row) == value) for value in present])
        shares = np.divide(100 * counts, totals, out=np.zeros_like(counts, dtype=float), where=totals > 0)
        ax.bar(x, shares, bottom=bottom, color=color, label=label)
        bottom += shares
    ax.set_xticks(x, [VERDICT_LABELS[value].replace("Candidate ", "") for value in present],
                  rotation=20)
    ax.set_ylabel("Share of generated proof outcomes (%)", fontsize=14)
    ax.legend(fontsize=9, ncol=2)
    finish(fig, HERE / "proof-outcome-composition.png",
           "Formal Verdicts Arise from Distinct Mixtures of Proof Outcomes")


def checker_stage_cost(rows):
    stages = ["inventory", "model gate", "semantic export", "proof startup", "proof requests"]
    colors = ["#4c78a8", "#f58518", "#72b7b2", "#b279a2", "#e45756"]
    present = [value for value in VERDICT_ORDER if any(verdict(row) == value for row in rows)]
    fig, ax = new_figure(figsize=(12, 7.5))
    x = np.arange(len(present)); bottom = np.zeros(len(present))
    for stage, color in zip(stages, colors):
        medians = [np.median([row["scp"]["checker"]["seconds_by_stage"].get(stage, 0)
                              for row in rows if verdict(row) == value]) for value in present]
        ax.bar(x, medians, bottom=bottom, color=color, label=stage.title())
        bottom += medians
    ax.set_xticks(x, [VERDICT_LABELS[value].replace("Candidate ", "") for value in present],
                  rotation=20)
    ax.set_ylabel("Median summed checker-event seconds", fontsize=14)
    ax.legend(fontsize=9, ncol=2)
    finish(fig, HERE / "checker-stage-cost-by-verdict.png",
           "Where Does Equivalence Checking Spend Its Time?")


def unit_burden(rows):
    metric_by_verdict(rows, lambda row: row["scp"]["unit_count"],
                      "Compared contract units", "compared-units-by-verdict.png",
                      "Do Non-Equivalent Results Involve More Compared Contract Units?")


def resource_outliers(rows):
    fig, axes = new_figure(figsize=(14, 9), ncols=2)
    panels = [
        (sorted(rows, key=lambda row: row["scp"]["tokens"]["total_tokens"], reverse=True)[:12],
         lambda row: row["scp"]["tokens"]["total_tokens"], "Total plotted tokens"),
        (sorted(rows, key=lambda row: row["scp"]["active_seconds"], reverse=True)[:12],
         lambda row: row["scp"]["active_seconds"] / 60, "Active elapsed minutes"),
    ]
    for ax, (subset, getter, xlabel) in zip(axes, panels):
        subset = list(reversed(subset))
        y = np.arange(len(subset))
        ax.barh(y, [getter(row) for row in subset],
                color=[VERDICT_COLORS[verdict(row)] for row in subset])
        ax.set_yticks(y, [row["dataset_id"].replace("-", " ")[:34] for row in subset], fontsize=9)
        ax.set_xlabel(xlabel, fontsize=13)
        if "tokens" in xlabel.lower(): token_formatter(ax, "x")
    fig.legend(handles=[Patch(color=VERDICT_COLORS[v], label=VERDICT_LABELS[v])
                        for v in VERDICT_ORDER], loc="lower center", ncol=5, fontsize=9)
    finish(fig, HERE / "highest-resource-runs.png",
           "Which Individual Runs Dominate Resource Consumption?", rect=(0, 0.06, 1, 0.93))


def generation_vs_scp(rows):
    fig, axes = new_figure(figsize=(13, 5.5), ncols=2)
    for value in VERDICT_ORDER:
        subset = [row for row in rows if verdict(row) == value]
        color = VERDICT_COLORS[value]
        axes[0].scatter([row["generation"]["overall_tokens"] for row in subset],
                        [row["scp"]["tokens"]["total_tokens"] for row in subset],
                        color=color, s=55, edgecolor="white", alpha=0.85,
                        label=VERDICT_LABELS[value])
        timed = [row for row in subset if row["generation"]["elapsed_seconds"] is not None]
        axes[1].scatter([row["generation"]["elapsed_seconds"] / 60 for row in timed],
                        [row["scp"]["active_seconds"] / 60 for row in timed],
                        color=color, s=55, edgecolor="white", alpha=0.85)
    axes[0].set(xlabel="Generation tokens", ylabel="SCP total plotted tokens")
    axes[1].set(xlabel="Generation time (minutes)", ylabel="SCP active time (minutes)")
    token_formatter(axes[0], "x"); token_formatter(axes[0])
    axes[0].set_xlim(left=0); axes[0].set_ylim(bottom=0)
    axes[1].set_xscale("log"); axes[1].set_xlim(40, 1500); axes[1].set_ylim(bottom=0)
    for ax in axes:
        ax.xaxis.label.set_size(13); ax.yaxis.label.set_size(13)
    axes[0].legend(fontsize=8)
    finish(fig, HERE / "generation-cost-vs-scp-cost.png",
           "Are Expensive-to-Generate Benchmarks Also Expensive to Reconstruct?")


def replicate_stability(rows):
    pairs = defaultdict(dict)
    for row in rows:
        pairs[(row["family"], row["difficulty"])][row["replicate"]] = row
    values = ["EQUIVALENT", "CANDIDATE_WEAKER", "OTHER"]
    labels = ["Equivalent", "Weaker", "Other"]
    matrix = np.zeros((3, 3), dtype=int)
    for pair in pairs.values():
        def category(row):
            return verdict(row) if verdict(row) in values[:2] else "OTHER"
        matrix[values.index(category(pair[1])), values.index(category(pair[2]))] += 1
    fig, ax = new_figure(figsize=(7.5, 6.5))
    image = ax.imshow(matrix, cmap="Purples")
    ax.grid(False)
    ax.set_xticks(range(3), labels); ax.set_yticks(range(3), labels)
    ax.set_xlabel("Replicate 2 outcome", fontsize=14)
    ax.set_ylabel("Replicate 1 outcome", fontsize=14)
    for y in range(3):
        for x in range(3):
            ax.text(x, y, str(matrix[y, x]), ha="center", va="center", fontsize=15,
                    color="white" if matrix[y, x] > matrix.max()/2 else "black",
                    fontweight="bold")
    fig.colorbar(image, ax=ax, label="Domain × tier pairs")
    finish(fig, HERE / "replicate-outcome-stability.png",
           "Formal Outcome Is Not Fully Stable Across Diverse Same-Cell Replicates")


def main():
    _, rows = load_data()
    campaign_rows = campaign(rows)
    if len(rows) != 48 or len(campaign_rows) != 48:
        raise RuntimeError("expected exactly 48 CPS-48 SCP runs")
    outcome_overview(rows)
    acceptance_verdict_matrix(rows)
    verdict_by_tier(campaign_rows)
    acceptance_by_tier(campaign_rows)
    domain_outcome_map(campaign_rows)
    resource_distributions(campaign_rows)
    token_time_scatter(rows)
    token_composition(rows)
    cache_and_reasoning(rows)
    timeout_outcomes(rows)
    gate_failure_profile(rows)
    candidate_edit_size(rows)
    complexity_vs_outcome(campaign_rows)
    published_size_vs_resources(rows)
    proof_burden(rows)
    proof_outcomes(rows)
    checker_stage_cost(rows)
    unit_burden(rows)
    resource_outliers(rows)
    generation_vs_scp(rows)
    replicate_stability(campaign_rows)


if __name__ == "__main__":
    main()
