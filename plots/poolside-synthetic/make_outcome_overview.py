#!/usr/bin/env python3
"""Render a dependency-free Poolside outcome overview as SVG."""

from __future__ import annotations

import html
import json
import math
from pathlib import Path


HERE = Path(__file__).resolve().parent
ROOT = HERE.parent.parent
DATA = ROOT / "plots" / "analysis-data.json"
OUT = HERE / "outcome-overview.svg"

VERDICTS = (
    ("EQUIVALENT", "Equivalent", "#1f77b4"),
    ("CANDIDATE_WEAKER", "Weaker", "#d95f02"),
    ("CANDIDATE_STRONGER", "Stronger", "#2ca02c"),
    ("INCOMPARABLE", "Incomparable", "#9467bd"),
    ("INCONCLUSIVE", "Inconclusive", "#7f7f7f"),
    ("INVALID_INPUT", "Invalid input", "#8c564b"),
)


def donut(parts: list[str], rows: list[dict], *, cx: int, heading: str, heading_color: str) -> None:
    cy, outer_radius, inner_radius = 300, 182.5, 77.5
    counts = [sum(row["comparison_verdict"] == key for row in rows) for key, _, _ in VERDICTS]
    angle = -math.pi / 2
    parts.append(f'<text class="heading" x="{cx}" y="105" text-anchor="middle" fill="{heading_color}">{html.escape(heading)}</text>')
    for count, (_, _, color) in zip(counts, VERDICTS):
        if count == 0:
            continue
        next_angle = angle + 2 * math.pi * count / len(rows)
        large_arc = 1 if next_angle - angle > math.pi else 0
        outer_start = (cx + outer_radius * math.cos(angle), cy + outer_radius * math.sin(angle))
        outer_end = (cx + outer_radius * math.cos(next_angle), cy + outer_radius * math.sin(next_angle))
        inner_end = (cx + inner_radius * math.cos(next_angle), cy + inner_radius * math.sin(next_angle))
        inner_start = (cx + inner_radius * math.cos(angle), cy + inner_radius * math.sin(angle))
        parts.append(
            f'<path fill="{color}" stroke="white" stroke-width="2" d="'
            f'M {outer_start[0]:.3f} {outer_start[1]:.3f} '
            f'A {outer_radius} {outer_radius} 0 {large_arc} 1 {outer_end[0]:.3f} {outer_end[1]:.3f} '
            f'L {inner_end[0]:.3f} {inner_end[1]:.3f} '
            f'A {inner_radius} {inner_radius} 0 {large_arc} 0 {inner_start[0]:.3f} {inner_start[1]:.3f} Z"/>'
        )
        angle = next_angle
    parts.append(f'<circle cx="{cx}" cy="{cy}" r="70" fill="white"/>')
    parts.append(f'<text class="total" x="{cx}" y="294" text-anchor="middle">{len(rows)}</text>')
    parts.append(f'<text class="instances" x="{cx}" y="320" text-anchor="middle">instances</text>')

    legend_x = cx - 245
    for index, (count, (_, label, color)) in enumerate(zip(counts, VERDICTS)):
        column, row = index % 2, index // 2
        x, y = legend_x + column * 260, 510 + row * 48
        percent = count / len(rows)
        parts.append(f'<rect x="{x}" y="{y - 15}" width="22" height="22" rx="3" fill="{color}"/>')
        parts.append(f'<text class="legend" x="{x + 32}" y="{y + 2}">{html.escape(label)}: {count} ({percent:.1%})</text>')


def main() -> None:
    rows = json.loads(DATA.read_text(encoding="utf-8"))["poolside"]
    passed = [row for row in rows if row["gate_qualified"]]
    failed = [row for row in rows if not row["gate_qualified"]]
    parts = [
        '<svg xmlns="http://www.w3.org/2000/svg" width="1500" height="700" viewBox="0 0 1500 700" role="img">',
        '<rect width="1500" height="700" fill="white"/>',
        '<style>text{font-family:Inter,Segoe UI,Arial,sans-serif;fill:#243044}.title{font-size:29px;font-weight:700}.heading{font-size:22px;font-weight:700}.total{font-size:42px;font-weight:700}.instances{font-size:16px;fill:#667085}.legend{font-size:16px}</style>',
        '<text class="title" x="750" y="48" text-anchor="middle">Poolside Formal-Ground-Truth Relation by Candidate Gate Status</text>',
    ]
    donut(parts, passed, cx=380, heading=f"Candidate cleared all gates — {len(passed)}", heading_color="#2b7b3f")
    donut(parts, failed, cx=1120, heading=f"Candidate did not clear all gates — {len(failed)}", heading_color="#b22222")
    parts.append('</svg>')
    OUT.write_text("\n".join(parts) + "\n", encoding="utf-8")
    print(f"wrote {OUT}")


if __name__ == "__main__":
    main()
