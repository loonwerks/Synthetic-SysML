"""Thread-safe monotonic timing records for equivalence-checker evidence."""

from __future__ import annotations

from contextlib import contextmanager
from dataclasses import dataclass
import json
from pathlib import Path
import threading
import time
from typing import Any, Iterator, Mapping


@dataclass(frozen=True)
class TimingEvent:
    stage: str
    elapsed_seconds: float
    detail: Mapping[str, Any]

    def to_json(self) -> dict[str, Any]:
        return {
            "stage": self.stage,
            "elapsed_seconds": round(self.elapsed_seconds, 6),
            "detail": dict(self.detail),
        }


class TimingRecorder:
    """Collect timing events without changing checker control flow."""

    def __init__(self, *, progress_path: Path | None = None) -> None:
        self._started = time.perf_counter()
        self._events: list[TimingEvent] = []
        self._lock = threading.Lock()
        self._progress_path = progress_path
        if progress_path is not None:
            # Never overwrite another run's diagnostic trail. This file is
            # progress only; completed, sealed evidence establishes verdicts.
            with progress_path.open("x", encoding="utf-8"):
                pass

    def record(
        self, stage: str, elapsed_seconds: float, **detail: Any
    ) -> TimingEvent:
        if elapsed_seconds < 0:
            raise ValueError("timing duration cannot be negative")
        event = TimingEvent(stage, elapsed_seconds, detail)
        with self._lock:
            self._events.append(event)
            if self._progress_path is not None:
                with self._progress_path.open("a", encoding="utf-8") as stream:
                    stream.write(json.dumps(event.to_json(), sort_keys=True) + "\n")
        return event

    @contextmanager
    def measure(self, stage: str, **detail: Any) -> Iterator[None]:
        started = time.perf_counter()
        try:
            yield
        finally:
            self.record(stage, time.perf_counter() - started, **detail)

    def document(self) -> dict[str, Any]:
        with self._lock:
            events = tuple(self._events)
        totals: dict[str, float] = {}
        for event in events:
            totals[event.stage] = totals.get(event.stage, 0.0) + event.elapsed_seconds
        return {
            "schema_version": "1.0.0",
            "overall_elapsed_seconds": round(time.perf_counter() - self._started, 6),
            "stage_totals_seconds": {
                key: round(value, 6) for key, value in sorted(totals.items())
            },
            "events": [event.to_json() for event in events],
        }


__all__ = ["TimingEvent", "TimingRecorder"]
