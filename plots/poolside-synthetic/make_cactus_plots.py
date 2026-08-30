#!/usr/bin/env python3
"""Render the Poolside success cactus plots as dependency-free SVG files."""

from __future__ import annotations

import html
import json
import math
from pathlib import Path


HERE = Path(__file__).resolve().parent
METADATA = HERE / "restored_run_metadata.json"


def nice_number(value: float) -> str:
    if value >= 1_000_000:
        return f"{value / 1_000_000:g}M"
    if value >= 1_000:
        return f"{value / 1_000:g}k"
    return f"{value:g}"


def render_svg(path: Path, series: list[tuple[str, list[float], str]], *, xmax: float, xticks: list[float],
               title: str, subtitle: str, xlabel: str, xformat):
    width, height = 1000, 650
    left, right, top, bottom = 100, 45, 92, 100
    plot_w, plot_h = width - left - right, height - top - bottom
    ymax = max(len(values) for _, values, _ in series)

    def x(value):
        return left + plot_w * value / xmax

    def y(value):
        return top + plot_h * (1 - value / ymax)

    parts = [
        '<svg xmlns="http://www.w3.org/2000/svg" width="1000" height="650" viewBox="0 0 1000 650" role="img">',
        f"<title>{html.escape(title)}</title>",
        '<rect width="1000" height="650" fill="#fbfcfe"/>',
        '<style>text{font-family:Inter,Segoe UI,Arial,sans-serif;fill:#243044}.title{font-size:27px;font-weight:700}.sub{font-size:15px;fill:#5c697d}.tick{font-size:13px;fill:#5c697d}.axis{font-size:15px;font-weight:600}.note{font-size:12px;fill:#69768a}.grid{stroke:#dce2ea;stroke-width:1}.frame{stroke:#8995a7;stroke-width:1.2}.curve{stroke:#1769aa;stroke-width:3.2;fill:none;stroke-linejoin:round}.dot{fill:#1769aa;stroke:#fbfcfe;stroke-width:1.5}</style>',
        f'<text class="title" x="{left}" y="42">{html.escape(title)}</text>',
        f'<text class="sub" x="{left}" y="68">{html.escape(subtitle)}</text>',
    ]

    ystep = 1 if ymax <= 12 else 5 if ymax <= 30 else 10
    for tick in range(0, ymax + 1, ystep):
        yy = y(tick)
        parts.append(f'<line class="grid" x1="{left}" y1="{yy:.2f}" x2="{left + plot_w}" y2="{yy:.2f}"/>')
        parts.append(f'<text class="tick" x="{left - 15}" y="{yy + 5:.2f}" text-anchor="end">{tick}</text>')
    for tick in xticks:
        xx = x(tick)
        parts.append(f'<line class="grid" x1="{xx:.2f}" y1="{top}" x2="{xx:.2f}" y2="{top + plot_h}"/>')
        parts.append(f'<text class="tick" x="{xx:.2f}" y="{top + plot_h + 28}" text-anchor="middle">{html.escape(xformat(tick))}</text>')

    parts.extend([
        f'<line class="frame" x1="{left}" y1="{top + plot_h}" x2="{left + plot_w}" y2="{top + plot_h}"/>',
        f'<line class="frame" x1="{left}" y1="{top}" x2="{left}" y2="{top + plot_h}"/>',
    ])

    # Right-continuous empirical success-count step curves.
    for label, values, color in series:
        commands = [f"M {x(0):.2f} {y(0):.2f}"]
        previous = 0
        for count, value in enumerate(values, 1):
            commands.append(f"L {x(value):.2f} {y(previous):.2f}")
            commands.append(f"L {x(value):.2f} {y(count):.2f}")
            previous = count
        parts.append(f'<path class="curve" style="stroke:{color}" d="{" ".join(commands)}"/>')
        for count, value in enumerate(values, 1):
            parts.append(f'<circle class="dot" style="fill:{color}" cx="{x(value):.2f}" cy="{y(count):.2f}" r="5"/>')

    legend_x = left + plot_w - 175
    for index, (label, _, color) in enumerate(series):
        legend_y = top + 18 + index * 25
        parts.append(f'<line x1="{legend_x}" y1="{legend_y}" x2="{legend_x + 28}" y2="{legend_y}" stroke="{color}" stroke-width="3.2"/>')
        parts.append(f'<text class="tick" x="{legend_x + 37}" y="{legend_y + 5}">{html.escape(label)}</text>')

    parts.extend([
        f'<text class="axis" x="{left + plot_w / 2:.2f}" y="{height - 46}" text-anchor="middle">{html.escape(xlabel)}</text>',
        f'<text class="axis" transform="translate(30 {top + plot_h / 2:.2f}) rotate(-90)" text-anchor="middle">Cumulative successful instances</text>',
        '</svg>',
    ])
    path.write_text("\n".join(parts) + "\n")


def main():
    payload = json.loads(METADATA.read_text())
    two_hour_successes = [run for run in payload["runs"] if run["two_hour_success"]]
    three_hour_successes = [run for run in payload["runs"] if run["success"]]
    two_hour_times = sorted(run["two_hour_active_seconds"] / 60 for run in two_hour_successes)
    three_hour_times = sorted(run["active_seconds"] / 60 for run in three_hour_successes)
    two_hour_tokens = sorted(run["two_hour_output_tokens"] for run in two_hour_successes)
    three_hour_tokens = sorted(run["output_tokens"] for run in three_hour_successes)
    if len(three_hour_successes) != payload["summary"]["success_count"]:
        raise RuntimeError("metadata success count is inconsistent")
    subtitle = (f"2-hour cutoff: {len(two_hour_successes)}/52 succeeded · "
                f"3-hour cutoff: {len(three_hour_successes)}/52 succeeded")
    colors = ("#8793a5", "#1769aa")

    render_svg(
        HERE / "cactus-wallclock.svg",
        [("2-hour cutoff", two_hour_times, colors[0]),
         ("3-hour cutoff", three_hour_times, colors[1])],
        xmax=180,
        xticks=[0, 30, 60, 90, 120, 150, 180],
        title="Poolside synthetic-dataset success cactus",
        subtitle=subtitle,
        xlabel="Active wall-clock time per experiment (minutes)",
        xformat=lambda value: f"{value:g}",
    )
    token_max = max(three_hour_tokens + two_hour_tokens + [1])
    token_step = max(50_000, math.ceil(token_max / 5 / 50_000) * 50_000)
    token_xmax = math.ceil(token_max / token_step) * token_step
    render_svg(
        HERE / "cactus-output-tokens.svg",
        [("2-hour cutoff", two_hour_tokens, colors[0]),
         ("3-hour cutoff", three_hour_tokens, colors[1])],
        xmax=token_xmax,
        xticks=list(range(0, token_xmax + 1, token_step)),
        title="Poolside synthetic-dataset success cactus by output tokens",
        subtitle=subtitle,
        xlabel="Poolside output tokens per experiment",
        xformat=nice_number,
    )
    print(f"wrote {HERE / 'cactus-wallclock.svg'}")
    print(f"wrote {HERE / 'cactus-output-tokens.svg'}")


if __name__ == "__main__":
    main()
