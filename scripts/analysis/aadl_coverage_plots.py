#!/usr/bin/env python3
"""Dependency-free SVG plots for the CPS-48 AADL coverage report."""

from __future__ import annotations

import argparse
from collections import Counter
from html import escape
import json
from pathlib import Path
from typing import Any, Iterable, Mapping, Sequence


SCHEMA_VERSION = "aadl-in-sysml-coverage-poc-1.0.0"
TIERS = ("small", "medium", "hard")
PLOT_FILENAMES = (
    "breadth-overview.svg",
    "tier-occurrence-distributions.svg",
    "richness-by-tier.svg",
    "property-gaps-by-group.svg",
)

INK = "#17212B"
MUTED = "#5F6B76"
GRID = "#D9E1E8"
GAP = "#E9EEF3"
WHITE = "#FFFFFF"
DIMENSION_COLORS = {
    "component": "#335C81",
    "feature": "#2A9D8F",
    "connection": "#E9A23B",
    "property": "#D95D68",
}
TIER_COLORS = {
    "small": "#4C78A8",
    "medium": "#2A9D8F",
    "hard": "#E76F51",
}


class PlotError(RuntimeError):
    """Coverage data cannot be rendered faithfully."""


def _number(value: Any, label: str) -> float:
    if isinstance(value, bool) or not isinstance(value, (int, float)):
        raise PlotError(f"{label} must be numeric")
    return float(value)


def _text(
    x: float, y: float, value: str, *, size: int = 14, anchor: str = "start",
    weight: int = 400, fill: str = INK, extra: str = "",
) -> str:
    return (
        f'<text x="{x:g}" y="{y:g}" text-anchor="{anchor}" '
        f'font-size="{size}" font-weight="{weight}" fill="{fill}" {extra}>'
        f"{escape(value)}</text>"
    )


def _line(
    x1: float, y1: float, x2: float, y2: float, *, stroke: str = GRID,
    width: float = 1, dash: str | None = None,
) -> str:
    dashed = f' stroke-dasharray="{dash}"' if dash else ""
    return (
        f'<line x1="{x1:g}" y1="{y1:g}" x2="{x2:g}" y2="{y2:g}" '
        f'stroke="{stroke}" stroke-width="{width:g}"{dashed}/>'
    )


def _rect(
    x: float, y: float, width: float, height: float, *, fill: str,
    radius: float = 0, stroke: str | None = None,
) -> str:
    border = f' stroke="{stroke}" stroke-width="1"' if stroke else ""
    return (
        f'<rect x="{x:g}" y="{y:g}" width="{width:g}" height="{height:g}" '
        f'rx="{radius:g}" fill="{fill}"{border}/>'
    )


def _circle(
    x: float, y: float, radius: float, *, fill: str, stroke: str = WHITE,
    stroke_width: float = 1.5,
) -> str:
    return (
        f'<circle cx="{x:g}" cy="{y:g}" r="{radius:g}" fill="{fill}" '
        f'stroke="{stroke}" stroke-width="{stroke_width:g}"/>'
    )


def _svg(
    width: int, height: int, title: str, description: str,
    body: Iterable[str],
) -> str:
    content = "\n  ".join(body)
    return (
        '<?xml version="1.0" encoding="UTF-8"?>\n'
        f'<svg xmlns="http://www.w3.org/2000/svg" width="{width}" height="{height}" '
        f'viewBox="0 0 {width} {height}" role="img" aria-labelledby="title desc">\n'
        f"  <title id=\"title\">{escape(title)}</title>\n"
        f"  <desc id=\"desc\">{escape(description)}</desc>\n"
        "  <style>text { font-family: Inter, ui-sans-serif, system-ui, -apple-system, "
        "BlinkMacSystemFont, 'Segoe UI', sans-serif; }</style>\n"
        f"  {_rect(0, 0, width, height, fill=WHITE)}\n"
        f"  {content}\n"
        "</svg>\n"
    )


def _validate_report(report: Mapping[str, Any]) -> None:
    if report.get("schema_version") != SCHEMA_VERSION:
        raise PlotError(f"unsupported coverage schema: {report.get('schema_version')}")
    campaign = report.get("campaign")
    if not isinstance(campaign, Mapping) or campaign.get("selected_models") != 48:
        raise PlotError("plots require the canonical 48-model report")
    entries = report.get("entries")
    models = report.get("models")
    breadth = report.get("breadth")
    if not isinstance(entries, Sequence) or isinstance(entries, (str, bytes)):
        raise PlotError("coverage entries must be an array")
    if not isinstance(models, Sequence) or len(models) != 48:
        raise PlotError("coverage models must contain exactly 48 rows")
    if not isinstance(breadth, Mapping):
        raise PlotError("coverage breadth must be an object")


def render_breadth(report: Mapping[str, Any]) -> str:
    width, height = 980, 470
    left, right, top = 210.0, 80.0, 130.0
    chart_width = width - left - right
    bar_height, row_gap = 46.0, 24.0
    dimensions = ("component", "feature", "connection", "property")
    body: list[str] = [
        _text(48, 48, "Catalog breadth by AADL dimension", size=26, weight=700),
        _text(48, 77, "Exercised resolved-effective entries versus the curated catalog", size=15, fill=MUTED),
    ]
    for tick in range(0, 101, 20):
        x = left + chart_width * tick / 100
        body.append(_line(x, top - 18, x, top + len(dimensions) * (bar_height + row_gap) - row_gap + 14))
        body.append(_text(x, top - 27, f"{tick}%", size=12, anchor="middle", fill=MUTED))
    for index, dimension in enumerate(dimensions):
        raw = report["breadth"].get(dimension)
        if not isinstance(raw, Mapping):
            raise PlotError(f"missing breadth for {dimension}")
        exercised = int(_number(raw.get("exercised"), f"{dimension} exercised"))
        total = int(_number(raw.get("catalog_size"), f"{dimension} catalog size"))
        if total <= 0 or exercised < 0 or exercised > total:
            raise PlotError(f"invalid breadth counts for {dimension}")
        percent = 100 * exercised / total
        y = top + index * (bar_height + row_gap)
        body.append(_text(left - 20, y + 29, dimension.title(), size=16, anchor="end", weight=600))
        body.append(_rect(left, y, chart_width, bar_height, fill=GAP, radius=6))
        body.append(_rect(left, y, chart_width * percent / 100, bar_height, fill=DIMENSION_COLORS[dimension], radius=6))
        body.append(_text(left + 12, y + 29, f"{exercised}/{total}", size=14, weight=700, fill=WHITE if percent >= 13 else INK))
        body.append(_text(left + chart_width + 14, y + 29, f"{percent:.1f}%", size=14, weight=700))
    legend_y = height - 34
    body.extend([
        _rect(left, legend_y - 13, 18, 18, fill="#335C81", radius=3),
        _text(left + 27, legend_y + 1, "exercised", size=13, fill=MUTED),
        _rect(left + 125, legend_y - 13, 18, 18, fill=GAP, radius=3, stroke=GRID),
        _text(left + 152, legend_y + 1, "catalog gap", size=13, fill=MUTED),
    ])
    return _svg(
        width, height, "Catalog breadth by AADL dimension",
        "Four normalized horizontal bars compare exercised entries with catalog gaps for components, features, connections, and properties.",
        body,
    )


def _entry_index(report: Mapping[str, Any]) -> dict[str, Mapping[str, Any]]:
    result: dict[str, Mapping[str, Any]] = {}
    for raw in report["entries"]:
        if not isinstance(raw, Mapping) or not isinstance(raw.get("entry"), str):
            raise PlotError("coverage entry is malformed")
        result[str(raw["entry"])] = raw
    return result


def render_occurrence_distributions(report: Mapping[str, Any]) -> str:
    width, height = 1120, 760
    left, right, top, bottom = 250.0, 80.0, 155.0, 82.0
    chart_width = width - left - right
    labels = (
        ("AADL::Data", "Data components"),
        ("AADL::Thread", "Threads"),
        ("AADL::DataPort", "Data ports"),
        ("AADL::PortConnection", "Port connections"),
        ("In", "Input directions"),
        ("Out", "Output directions"),
        ("Communication_Properties::Queue_Size", "Materialized Queue_Size"),
    )
    index = _entry_index(report)
    x_max = 110.0
    row_height = (height - top - bottom) / len(labels)
    body: list[str] = [
        _text(48, 48, "Per-model occurrence distributions by tier", size=26, weight=700),
        _text(48, 77, "Lines span Q1–Q3; circles mark the median across 16 models per tier", size=15, fill=MUTED),
    ]
    legend_x = left
    for tier in TIERS:
        body.append(_circle(legend_x, 111, 7, fill=TIER_COLORS[tier]))
        body.append(_text(legend_x + 13, 116, tier, size=13, fill=MUTED))
        legend_x += 105
    for tick in range(0, 111, 10):
        x = left + chart_width * tick / x_max
        body.append(_line(x, top - 16, x, height - bottom + 8))
        body.append(_text(x, height - bottom + 31, str(tick), size=12, anchor="middle", fill=MUTED))
    offsets = {"small": -14.0, "medium": 0.0, "hard": 14.0}
    for row, (symbol, label) in enumerate(labels):
        entry = index.get(symbol)
        if entry is None:
            raise PlotError(f"missing plotted entry: {symbol}")
        y_center = top + row * row_height + row_height / 2
        if row % 2 == 0:
            body.append(_rect(left, y_center - row_height / 2, chart_width, row_height, fill="#F8FAFC"))
        body.append(_text(left - 20, y_center + 5, label, size=14, anchor="end", weight=600))
        tiers = entry.get("tiers")
        if not isinstance(tiers, Mapping):
            raise PlotError(f"entry tiers are malformed: {symbol}")
        for tier in TIERS:
            stats = tiers.get(tier)
            if not isinstance(stats, Mapping):
                raise PlotError(f"missing {tier} statistics for {symbol}")
            q1 = _number(stats.get("per_model_q1"), f"{symbol} {tier} q1")
            median = _number(stats.get("per_model_median"), f"{symbol} {tier} median")
            q3 = _number(stats.get("per_model_q3"), f"{symbol} {tier} q3")
            if not 0 <= q1 <= median <= q3 <= x_max:
                raise PlotError(f"invalid quartiles for {symbol} / {tier}")
            y = y_center + offsets[tier]
            x1 = left + chart_width * q1 / x_max
            xm = left + chart_width * median / x_max
            x3 = left + chart_width * q3 / x_max
            body.append(_line(x1, y, x3, y, stroke=TIER_COLORS[tier], width=5))
            body.append(_line(x1, y - 5, x1, y + 5, stroke=TIER_COLORS[tier], width=2))
            body.append(_line(x3, y - 5, x3, y + 5, stroke=TIER_COLORS[tier], width=2))
            body.append(_circle(xm, y, 6, fill=TIER_COLORS[tier]))
    body.append(_text(left + chart_width / 2, height - 20, "Resolved occurrences per model", size=14, anchor="middle", weight=600))
    return _svg(
        width, height, "Per-model occurrence distributions by tier",
        "Tier-colored interquartile ranges and medians show how resolved component, feature, connection, direction, and default-property volumes increase with complexity.",
        body,
    )


def render_richness(report: Mapping[str, Any]) -> str:
    width, height = 940, 510
    left, right, top, bottom = 220.0, 80.0, 135.0, 82.0
    chart_width = width - left - right
    models = report["models"]
    counts: dict[str, Counter[int]] = {tier: Counter() for tier in TIERS}
    for raw in models:
        if not isinstance(raw, Mapping):
            raise PlotError("model richness row is malformed")
        tier = raw.get("complexity")
        richness = raw.get("richness")
        if tier not in TIERS or not isinstance(richness, Mapping):
            raise PlotError("model richness tier or payload is malformed")
        value = int(_number(richness.get("all_catalog_entries"), "model richness"))
        counts[str(tier)][value] += 1
    observed = sorted({value for values in counts.values() for value in values})
    if not observed:
        raise PlotError("model richness is empty")
    low, high = min(observed) - 1, max(observed) + 1
    span = max(1, high - low)
    x_of = lambda value: left + chart_width * (value - low) / span
    row_gap = 88.0
    body: list[str] = [
        _text(48, 48, "Distinct catalog richness per model", size=26, weight=700),
        _text(48, 77, "Bubble size and label show how many of the 16 tier models share each richness value", size=15, fill=MUTED),
    ]
    for tick in range(low, high + 1):
        x = x_of(tick)
        body.append(_line(x, top - 20, x, top + row_gap * (len(TIERS) - 1) + 32))
        body.append(_text(x, height - bottom + 29, str(tick), size=13, anchor="middle", fill=MUTED))
    for row, tier in enumerate(TIERS):
        y = top + row * row_gap
        body.append(_text(left - 22, y + 6, tier, size=16, anchor="end", weight=600, fill=TIER_COLORS[tier]))
        body.append(_line(left, y, left + chart_width, y, stroke="#BFCAD4", width=2))
        for value, count in sorted(counts[tier].items()):
            radius = 10 + 2.0 * count ** 0.5
            x = x_of(value)
            body.append(_circle(x, y, radius, fill=TIER_COLORS[tier], stroke=WHITE, stroke_width=2))
            body.append(_text(x, y + 5, str(count), size=13, anchor="middle", weight=700, fill=WHITE))
    summary = report.get("tier_richness")
    if not isinstance(summary, Mapping):
        raise PlotError("tier richness summary is missing")
    summary_y = top + row_gap * len(TIERS) + 18
    body.append(_text(left, summary_y, "Median [IQR]", size=13, weight=700, fill=MUTED))
    x = left + 115
    for tier in TIERS:
        tier_summary = summary.get(tier)
        all_summary = tier_summary.get("all_catalog_entries") if isinstance(tier_summary, Mapping) else None
        if not isinstance(all_summary, Mapping):
            raise PlotError(f"missing richness summary for {tier}")
        body.append(_text(x, summary_y, f"{tier}: {all_summary['median']} [{all_summary['iqr']}]", size=13, fill=TIER_COLORS[tier], weight=600))
        x += 150
    body.append(_text(left + chart_width / 2, height - 20, "Distinct component + feature + connection + property entries", size=14, anchor="middle", weight=600))
    return _svg(
        width, height, "Distinct catalog richness per model",
        "A bubble plot shows that nearly every model has seven distinct catalog entries and only one hard model has eight.",
        body,
    )


def render_property_gaps(report: Mapping[str, Any]) -> str:
    width, height = 1060, 650
    left, right, top, bottom = 320.0, 95.0, 125.0, 70.0
    chart_width = width - left - right
    property_entries = [
        raw for raw in report["entries"]
        if isinstance(raw, Mapping) and raw.get("dimension") == "property"
    ]
    groups: dict[str, list[Mapping[str, Any]]] = {}
    for entry in property_entries:
        group = str(entry.get("group", ""))
        groups.setdefault(group, []).append(entry)
    ordered_groups = (
        "communication queue/timing", "execution timing", "dispatch/priority policy",
        "processor scheduling", "CASE scheduling", "Microkit scheduling/passivity/SMC",
        "ROS", "HAMR code/data semantics",
    )
    if set(groups) != set(ordered_groups):
        raise PlotError(f"property groups differ from the curated plot order: {sorted(groups)}")
    max_total = max(len(groups[group]) for group in ordered_groups)
    row_height = (height - top - bottom) / len(ordered_groups)
    body: list[str] = [
        _text(48, 48, "Where the execution/deployment gaps are", size=26, weight=700),
        _text(48, 77, "Curated property entries grouped by capability area; counts are not weighted", size=15, fill=MUTED),
    ]
    for tick in range(0, max_total + 1, 5):
        x = left + chart_width * tick / max_total
        body.append(_line(x, top - 14, x, height - bottom + 8))
        body.append(_text(x, height - bottom + 29, str(tick), size=12, anchor="middle", fill=MUTED))
    for row, group in enumerate(ordered_groups):
        entries = groups[group]
        total = len(entries)
        exercised = sum(
            isinstance(entry.get("overall"), Mapping) and int(entry["overall"].get("models", 0)) > 0
            for entry in entries
        )
        y = top + row * row_height + 9
        bar_y = y - 16
        bar_height = 27.0
        body.append(_text(left - 20, y + 4, group, size=14, anchor="end", weight=600))
        body.append(_rect(left, bar_y, chart_width * total / max_total, bar_height, fill=GAP, radius=4))
        if exercised:
            body.append(_rect(left, bar_y, chart_width * exercised / max_total, bar_height, fill=DIMENSION_COLORS["property"], radius=4))
        body.append(_text(left + chart_width * total / max_total + 12, y + 4, f"{exercised}/{total}", size=13, weight=700))
    legend_y = height - 24
    body.extend([
        _rect(left, legend_y - 13, 18, 18, fill=DIMENSION_COLORS["property"], radius=3),
        _text(left + 27, legend_y + 1, "exercised", size=13, fill=MUTED),
        _rect(left + 125, legend_y - 13, 18, 18, fill=GAP, radius=3, stroke=GRID),
        _text(left + 152, legend_y + 1, "unexercised", size=13, fill=MUTED),
        _text(left + chart_width / 2, height - 24, "Curated property entries", size=14, anchor="middle", weight=600),
    ])
    return _svg(
        width, height, "Execution and deployment property gaps by group",
        "Horizontal count bars show that Queue Size is the only exercised property and all execution timing, scheduling, ROS, and HAMR semantics entries are gaps.",
        body,
    )


def render_plots(report: Mapping[str, Any]) -> dict[str, str]:
    _validate_report(report)
    return {
        "breadth-overview.svg": render_breadth(report),
        "tier-occurrence-distributions.svg": render_occurrence_distributions(report),
        "richness-by-tier.svg": render_richness(report),
        "property-gaps-by-group.svg": render_property_gaps(report),
    }


def write_plots(output_dir: Path, report: Mapping[str, Any]) -> tuple[Path, ...]:
    rendered = render_plots(report)
    if tuple(rendered) != PLOT_FILENAMES:
        raise PlotError("plot renderer order differs from the published plot manifest")
    output_dir.mkdir(parents=True, exist_ok=True)
    paths: list[Path] = []
    for name, content in rendered.items():
        path = output_dir / name
        path.write_text(content, encoding="utf-8")
        paths.append(path)
    return tuple(paths)


def _load_report(path: Path) -> Mapping[str, Any]:
    try:
        value = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError) as error:
        raise PlotError(f"could not read coverage report {path}: {error}") from error
    if not isinstance(value, Mapping):
        raise PlotError("coverage report is not a JSON object")
    return value


def build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("coverage_json", type=Path)
    parser.add_argument("--output-dir", type=Path)
    return parser


def main(argv: Sequence[str] | None = None) -> int:
    args = build_parser().parse_args(argv)
    try:
        report = _load_report(args.coverage_json)
        output_dir = args.output_dir or args.coverage_json.resolve().parent / "plots"
        paths = write_plots(output_dir, report)
    except PlotError as error:
        print(f"AADL_COVERAGE_PLOTS_RESULT=FAILED: {error}")
        return 2
    print(f"AADL_COVERAGE_PLOTS_RESULT=PASSED plots={len(paths)} output={output_dir}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
