"""Proof-obligation execution and fail-closed unit classification.

This module is intentionally independent of SysML discovery.  It consumes
obligation sources selected from a :class:`ComparisonPlan` by the orchestration
layer and returns only backend-neutral :class:`UnitResult` values.
"""

from __future__ import annotations

from dataclasses import dataclass
from enum import Enum
import atexit
import hashlib
import json
import os
from pathlib import Path
import queue
import re
import signal
import subprocess
import threading
import time
from typing import Iterable, Mapping, Protocol

from .schema import (
    AtomicVCResult,
    UnitClassification,
    UnitResult,
    VCStatus,
)
from .timing import TimingRecorder


ATOMIC_VCS = (
    "A* -> A",
    "A* & G -> G*",
    "A -> A*",
    "A & G* -> G",
)


class ToolOutcome(str, Enum):
    VERIFIED = "VERIFIED"
    SAT = "SAT"
    UNSAT = "UNSAT"
    REJECTED = "REJECTED"
    UNKNOWN = "UNKNOWN"
    TIMEOUT = "TIMEOUT"
    TOOL_ERROR = "TOOL_ERROR"
    NOT_RUN = "NOT_RUN"


@dataclass(frozen=True)
class LogikaRun:
    command: tuple[str, ...]
    mode: str
    outcome: ToolOutcome
    exit_code: int | None
    output: str
    wall_seconds: float | None = None
    verification_seconds: float | None = None
    engine: str = "subprocess"
    request: tuple[str, ...] = ()


@dataclass(frozen=True)
class Obligation:
    unit_key: str
    vc_name: str
    formula: str
    validity_source: Path
    complement_source: Path
    complement_content: str | None = None


def materialize_complement(obligation: object) -> Path:
    """Create a generated SAT complement only when its validity VC rejects."""

    raw = getattr(obligation, "complement_source", None)
    if raw is None:
        raise ValueError("rejected validity obligation has no complement source")
    source = Path(raw)
    content = getattr(obligation, "complement_content", None)
    if source.exists():
        if not source.is_file() or source.is_symlink():
            raise ValueError(f"complement source is not a regular file: {source}")
        if content is not None and source.read_text(encoding="utf-8") != content:
            raise ValueError(f"existing complement source content differs: {source}")
        return source
    if content is None:
        raise ValueError(f"complement source was not generated: {source}")
    source.parent.mkdir(parents=True, exist_ok=True)
    source.write_text(content, encoding="utf-8")
    return source


class EvidenceVerificationError(ValueError):
    """Raised when replay evidence is missing, swapped, or self-inconsistent."""


@dataclass(frozen=True)
class VerifiedUnitEvidence:
    unit_key: str
    records: tuple[str, ...]
    record_sha256: tuple[tuple[str, str], ...]


class LogikaBackend(Protocol):
    def run(self, *, project: Path, source: Path, mode: str, timeout: int) -> LogikaRun:
        ...


def _available_memory_fraction() -> float | None:
    """Return Linux MemAvailable / MemTotal, or None when unavailable."""

    try:
        values: dict[str, int] = {}
        for line in Path("/proc/meminfo").read_text(encoding="utf-8").splitlines():
            name, value = line.split(":", 1)
            if name in {"MemTotal", "MemAvailable"}:
                values[name] = int(value.strip().split()[0])
        total = values["MemTotal"]
        return values["MemAvailable"] / total if total > 0 else None
    except (OSError, KeyError, ValueError):
        return None


def interpret_logika(
    *,
    mode: str,
    exit_code: int | None,
    output: str,
    requested_sources: Iterable[Path],
) -> ToolOutcome:
    """Interpret Proyek/Logika conservatively.

    A nonzero validity run can mean either a rejected VC or a tool/type error.
    Only the specific postcondition diagnostic is admitted as ``REJECTED``;
    even then, callers must verify the complementary SAT source before
    reporting a counterexample.
    """

    lower = output.lower()
    if "timed out" in lower or "timeout" in lower:
        return ToolOutcome.TIMEOUT
    if exit_code is None:
        return ToolOutcome.TOOL_ERROR
    if any(
        marker in lower
        for marker in (
            "could not type check",
            "does not include",
            "is not a member of type",
            "parser error",
            "token recognition error",
            "internal error",
            "exception",
        )
    ):
        return ToolOutcome.TOOL_ERROR
    if exit_code == 0 and "logika verified!" in lower:
        if not verifying_files_attest(output, requested_sources):
            return ToolOutcome.TOOL_ERROR
        return ToolOutcome.SAT if mode == "sat" else ToolOutcome.VERIFIED
    if mode == "sat" and (
        "could not deduce that the assumption is satisfiable" in lower
        or "assumption is unsatisfiable" in lower
        or "infeasible" in lower
    ):
        return ToolOutcome.UNSAT
    if mode == "valid" and any(
        marker in lower
        for marker in (
            "could not deduce that the postcondition holds",
            "invalid postcondition",
        )
    ):
        return (
            ToolOutcome.REJECTED
            if verifying_files_attest(output, requested_sources)
            else ToolOutcome.TOOL_ERROR
        )
    if (
        mode == "valid"
        and exit_code != 0
        and verifying_files_attest(output, requested_sources)
    ):
        # Some Logika runs return a failed status after naming the exact proof
        # file but omit the usual postcondition diagnostic. Treat this only as
        # a request to run the independently checked SAT complement. It cannot
        # become a counterexample unless that second check succeeds.
        return ToolOutcome.REJECTED
    if exit_code != 0:
        return ToolOutcome.TOOL_ERROR
    return ToolOutcome.UNKNOWN


_ANSI_ESCAPE = re.compile(r"\x1b\[[0-?]*[ -/]*[@-~]")


def verifying_files(output: str) -> tuple[Path, ...]:
    """Parse only paths listed directly in verbose ``Verifying files:`` sections."""

    lines = _ANSI_ESCAPE.sub("", output).splitlines()
    result: list[Path] = []
    index = 0
    while index < len(lines):
        if lines[index].strip() != "Verifying files:":
            index += 1
            continue
        index += 1
        while index < len(lines):
            stripped = lines[index].strip()
            if not stripped:
                break
            if not stripped.startswith("* "):
                break
            value = stripped[2:].strip()
            if value:
                result.append(Path(value))
            index += 1
        index += 1
    return tuple(result)


def verifying_files_attest(output: str, requested_sources: Iterable[Path]) -> bool:
    requested = tuple(Path(source).resolve() for source in requested_sources)
    if len(requested) != 1:
        return False
    attested = tuple(path.resolve() for path in verifying_files(output))
    return attested == requested


class ResidentLogikaBackend:
    """Long-lived Sireum worker with one source per Analysis.run request."""

    PROTOCOL_VERSION = "1.0.0"
    def __init__(
        self,
        sireum: Path,
        *,
        worker: Path | None = None,
        timings: TimingRecorder | None = None,
        restart_after_run: bool = False,
        minimum_available_memory_fraction: float | None = None,
    ) -> None:
        self.sireum = sireum.resolve()
        self.worker = (
            worker or Path(__file__).parent / "adapters" / "LogikaWorker.scala"
        ).resolve()
        self.timings = timings
        self.restart_after_run = restart_after_run
        self.minimum_available_memory_fraction = minimum_available_memory_fraction
        self._project: Path | None = None
        self._process: subprocess.Popen[str] | None = None
        self._lines: queue.Queue[str | None] = queue.Queue()
        self._reader: threading.Thread | None = None
        self._counter = 0
        self._closed = False
        atexit.register(self.close)

    def _command(self, project: Path) -> tuple[str, ...]:
        return (
            str(self.sireum),
            "slang",
            "run",
            str(self.worker),
            str(project.resolve()),
        )

    def _read_output(self) -> None:
        process = self._process
        if process is None or process.stdout is None:
            self._lines.put(None)
            return
        try:
            for line in process.stdout:
                self._lines.put(line.rstrip("\n"))
        finally:
            self._lines.put(None)

    def _next_line(self, timeout: float) -> str:
        deadline = time.monotonic() + timeout
        while True:
            minimum = self.minimum_available_memory_fraction
            available = _available_memory_fraction() if minimum is not None else None
            if available is not None and available < minimum:
                process = self._process
                if process is not None and process.poll() is None:
                    self._signal_process_group(process, signal.SIGTERM)
                raise RuntimeError(
                    "resident Logika worker stopped to preserve RAM "
                    f"({available:.1%} available; {minimum:.1%} required)"
                )
            remaining = deadline - time.monotonic()
            if remaining <= 0:
                raise TimeoutError("resident Logika worker timed out waiting for a response")
            try:
                line = self._lines.get(timeout=min(0.25, remaining))
            except queue.Empty:
                continue
            if line is None:
                raise RuntimeError("resident Logika worker exited unexpectedly")
            return line

    def _start(self, project: Path, timeout: int) -> None:
        project = project.resolve()
        if self._closed:
            raise RuntimeError("resident Logika backend is closed")
        if self._process is not None and self._project == project:
            return
        self._stop()
        self._project = project
        command = self._command(project)
        started = time.perf_counter()
        self._process = subprocess.Popen(
            command,
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            text=True,
            bufsize=1,
            start_new_session=True,
        )
        self._lines = queue.Queue()
        self._reader = threading.Thread(
            target=self._read_output,
            name="equiv-logika-worker-output",
            daemon=True,
        )
        self._reader.start()
        startup: list[str] = []
        deadline = time.monotonic() + timeout + 30
        while True:
            line = self._next_line(max(0.1, deadline - time.monotonic()))
            startup.append(line)
            prefix = "GUMBO_LOGIKA_WORKER_READY\t"
            if line.startswith(prefix):
                version = line[len(prefix) :]
                if version != self.PROTOCOL_VERSION:
                    self._stop()
                    raise RuntimeError(
                        f"unsupported resident worker protocol {version!r}"
                    )
                break
        if self.timings is not None:
            self.timings.record(
                "logika-worker-startup",
                time.perf_counter() - started,
                project=str(project),
                command=list(command),
            )

    def _stop(self) -> None:
        process = self._process
        self._process = None
        self._project = None
        if process is None:
            return
        try:
            if process.poll() is None and process.stdin is not None:
                process.stdin.write("QUIT\n")
                process.stdin.flush()
                process.wait(timeout=10)
        except (BrokenPipeError, OSError, subprocess.TimeoutExpired):
            self._signal_process_group(process, signal.SIGTERM)
            try:
                process.wait(timeout=5)
            except subprocess.TimeoutExpired:
                self._signal_process_group(process, signal.SIGKILL)
                process.wait(timeout=5)
        finally:
            # The Sireum launcher can exit before its Java/solver descendants.
            # The worker is disposable, so fail closed and remove the complete
            # process group before another singleton proof is started.
            self._signal_process_group(process, signal.SIGKILL)
            if process.stdin is not None:
                process.stdin.close()
            if process.stdout is not None:
                process.stdout.close()

    @staticmethod
    def _signal_process_group(
        process: subprocess.Popen[str], requested_signal: signal.Signals
    ) -> None:
        """Signal the launcher and every Sireum child created for this worker."""

        try:
            os.killpg(process.pid, requested_signal)
        except ProcessLookupError:
            return
        except OSError:
            if requested_signal == signal.SIGKILL:
                process.kill()
            else:
                process.terminate()

    def close(self) -> None:
        if self._closed:
            return
        self._closed = True
        self._stop()

    def run(self, *, project: Path, source: Path, mode: str, timeout: int) -> LogikaRun:
        started = time.perf_counter()
        project = project.resolve()
        source = source.resolve()
        command = self._command(project)
        if mode not in {"valid", "sat"}:
            return LogikaRun(
                command, mode, ToolOutcome.TOOL_ERROR, None,
                f"unsupported resident Logika mode: {mode}",
                engine="resident",
            )
        try:
            source.relative_to(project / "src" / "main")
        except ValueError:
            return LogikaRun(
                command, mode, ToolOutcome.TOOL_ERROR, None,
                "proof source is outside the replay project's src/main source path",
                engine="resident",
            )
        source_hash = _sha256(source)
        self._counter += 1
        request_id = f"proof-{self._counter:04d}"
        request = (
            "RUN",
            request_id,
            mode,
            str(timeout),
            str(source),
            source_hash,
        )
        output_lines: list[str] = []
        try:
            self._start(project, timeout)
            # Startup has its own timing event.  Per-request evidence measures
            # only the singleton Analysis.run round trip so the two costs are
            # not accidentally reported twice.
            started = time.perf_counter()
            process = self._process
            if process is None or process.stdin is None:
                raise RuntimeError("resident Logika worker has no input stream")
            process.stdin.write("\t".join(request) + "\n")
            process.stdin.flush()
            deadline = time.monotonic() + timeout + 45
            result_fields: tuple[str, ...] | None = None
            while True:
                line = self._next_line(max(0.1, deadline - time.monotonic()))
                if line.startswith("GUMBO_LOGIKA_PROTOCOL_ERROR\t"):
                    raise RuntimeError(line)
                if line.startswith("GUMBO_LOGIKA_RESULT\t"):
                    result_fields = tuple(line.split("\t"))
                    break
                if line.startswith("GUMBO_LOGIKA_BEGIN\t"):
                    output_lines = []
                else:
                    output_lines.append(line)
            if result_fields is None or len(result_fields) != 8:
                raise RuntimeError("malformed resident Logika result")
            _, result_id, code_text, verify_ms, worker_ms, _, _, echoed_hash = result_fields
            if result_id != request_id or echoed_hash != source_hash:
                raise RuntimeError("resident Logika result/request binding mismatch")
            if _sha256(source) != source_hash:
                raise RuntimeError("proof source changed during resident verification")
            worker_code = int(code_text)
            exit_code = 0 if worker_code == 0 else 1
            verification = int(verify_ms) / 1000.0
            worker_elapsed = int(worker_ms) / 1000.0
            output = "\n".join(output_lines) + "\n"
            outcome = interpret_logika(
                mode=mode,
                exit_code=exit_code,
                output=output,
                requested_sources=(source,),
            )
        except TimeoutError as error:
            self._stop()
            output = "\n".join((*output_lines, str(error))) + "\n"
            exit_code = None
            outcome = ToolOutcome.TIMEOUT
            verification = None
            worker_elapsed = None
        except (BrokenPipeError, OSError, RuntimeError, ValueError) as error:
            self._stop()
            output = "\n".join((*output_lines, str(error))) + "\n"
            exit_code = None
            outcome = ToolOutcome.TOOL_ERROR
            verification = None
            worker_elapsed = None
        wall = time.perf_counter() - started
        if self.timings is not None:
            self.timings.record(
                "logika-resident-request",
                wall,
                source=str(source),
                mode=mode,
                outcome=outcome.value,
                verification_seconds=verification,
                worker_elapsed_seconds=worker_elapsed,
                request_id=request_id,
            )
        if self.restart_after_run:
            # Logika retains substantial analysis state in a long-lived worker.
            # Releasing it after each singleton proof keeps campaign memory bounded
            # without changing the source, mode, timeout, or result interpretation.
            self._stop()
        return LogikaRun(
            command,
            mode,
            outcome,
            exit_code,
            output,
            wall,
            verification,
            "resident",
            request,
        )


def execute_many(
    *,
    backend: LogikaBackend,
    project: Path,
    sources: Iterable[Path],
    mode: str,
    timeout: int,
) -> dict[Path, LogikaRun]:
    """Run exactly one verbose Logika analysis request per proof source.

    Multi-source Logika requests are intentionally forbidden: live Sireum
    runs have reported success for a batch containing a VC that is rejected
    when checked individually, even while listing every file as verified.
    """

    ordered = tuple(Path(source) for source in sources)
    if len({source.resolve() for source in ordered}) != len(ordered):
        raise ValueError("Logika source list contains duplicate sources")
    if not ordered:
        return {}
    expected = ToolOutcome.VERIFIED if mode == "valid" else ToolOutcome.SAT
    result: dict[Path, LogikaRun] = {}
    for source in ordered:
        run = backend.run(
            project=project, source=source, mode=mode, timeout=timeout
        )
        if run.outcome is expected and not verifying_files_attest(run.output, (source,)):
            run = LogikaRun(
                run.command,
                run.mode,
                ToolOutcome.TOOL_ERROR,
                run.exit_code,
                run.output,
                run.wall_seconds,
                run.verification_seconds,
            )
        result[source] = run
    return result


def atomic_status(validity: ToolOutcome, complement: ToolOutcome) -> VCStatus:
    """Combine a validity attempt and its independently checked negation."""

    if validity is ToolOutcome.VERIFIED:
        return VCStatus.VERIFIED
    if validity is ToolOutcome.REJECTED and complement is ToolOutcome.SAT:
        return VCStatus.COUNTEREXAMPLE
    outcomes = {validity, complement}
    if ToolOutcome.TIMEOUT in outcomes:
        return VCStatus.TIMEOUT
    if ToolOutcome.TOOL_ERROR in outcomes:
        return VCStatus.TOOL_ERROR
    return VCStatus.UNKNOWN


def _direction(vcs: Mapping[str, VCStatus], names: tuple[str, str]) -> VCStatus:
    statuses = tuple(vcs[name] for name in names)
    if all(status is VCStatus.VERIFIED for status in statuses):
        return VCStatus.VERIFIED
    if any(status is VCStatus.COUNTEREXAMPLE for status in statuses):
        return VCStatus.COUNTEREXAMPLE
    if any(status is VCStatus.TIMEOUT for status in statuses):
        return VCStatus.TIMEOUT
    if any(status is VCStatus.TOOL_ERROR for status in statuses):
        return VCStatus.TOOL_ERROR
    return VCStatus.UNKNOWN


def classify_unit(
    *,
    atomic_vcs: Mapping[str, VCStatus],
) -> UnitClassification:
    """Classify one owner/phase relation using only its four comparison VCs."""

    if set(atomic_vcs) != set(ATOMIC_VCS):
        raise ValueError("classification requires exactly the four atomic VCs")
    candidate_refines = _direction(
        atomic_vcs, ("A* -> A", "A* & G -> G*")
    )
    oracle_refines = _direction(
        atomic_vcs, ("A -> A*", "A & G* -> G")
    )
    if candidate_refines is VCStatus.VERIFIED and oracle_refines is VCStatus.VERIFIED:
        return UnitClassification.EQUIVALENT
    if (
        candidate_refines is VCStatus.VERIFIED
        and oracle_refines is VCStatus.COUNTEREXAMPLE
    ):
        return UnitClassification.CANDIDATE_STRONGER
    if (
        candidate_refines is VCStatus.COUNTEREXAMPLE
        and oracle_refines is VCStatus.VERIFIED
    ):
        return UnitClassification.CANDIDATE_WEAKER
    if (
        candidate_refines is VCStatus.COUNTEREXAMPLE
        and oracle_refines is VCStatus.COUNTEREXAMPLE
    ):
        return UnitClassification.INCOMPARABLE
    return UnitClassification.INCONCLUSIVE


def execute_atomic_obligations(
    *,
    backend: LogikaBackend,
    project: Path,
    obligations: Iterable[Obligation],
    timeout: int,
    evidence_dir: Path,
    evidence_base: Path | None = None,
    precomputed: Mapping[tuple[str, Path], LogikaRun] | None = None,
) -> tuple[AtomicVCResult, ...]:
    """Execute validity first and SAT complements only for rejected VCs."""

    obligation_list = tuple(obligations)
    results: list[AtomicVCResult] = []
    evidence_dir.mkdir(parents=True, exist_ok=True)
    if precomputed is None:
        valid_runs = execute_many(
            backend=backend,
            project=project,
            sources=(item.validity_source for item in obligation_list),
            mode="valid",
            timeout=timeout,
        )
        rejected = tuple(
            materialize_complement(item)
            for item in obligation_list
            if valid_runs[item.validity_source].outcome is ToolOutcome.REJECTED
        )
        complement_runs = execute_many(
            backend=backend,
            project=project,
            sources=rejected,
            mode="sat",
            timeout=timeout,
        )
    else:
        valid_runs = {
            item.validity_source: precomputed[("valid", item.validity_source.resolve())]
            for item in obligation_list
        }
        complement_runs = {
            item.complement_source: precomputed[("sat", item.complement_source.resolve())]
            for item in obligation_list
            if valid_runs[item.validity_source].outcome is ToolOutcome.REJECTED
        }
    for index, obligation in enumerate(obligation_list, 1):
        valid = valid_runs[obligation.validity_source]
        complement = LogikaRun((), "sat", ToolOutcome.NOT_RUN, None, "")
        if valid.outcome is ToolOutcome.REJECTED:
            complement = complement_runs[obligation.complement_source]
        stem = f"{index:02d}-{_safe_name(obligation.vc_name)}"
        validity_path = evidence_dir / f"{stem}-validity.json"
        witness_path = evidence_dir / f"{stem}-complement.json"
        _write_run_record(
            validity_path,
            valid,
            project=project,
            source=obligation.validity_source,
            evidence_base=evidence_base,
        )
        witness_evidence: str | None = None
        if complement.outcome is not ToolOutcome.NOT_RUN:
            _write_run_record(
                witness_path,
                complement,
                project=project,
                source=obligation.complement_source,
                evidence_base=evidence_base,
            )
            witness_evidence = str(witness_path)
        results.append(
            AtomicVCResult(
                name=obligation.vc_name,
                formula=obligation.formula,
                status=atomic_status(valid.outcome, complement.outcome),
                validity_evidence=_reported_path(validity_path, evidence_base),
                witness_evidence=(
                    _reported_path(witness_path, evidence_base)
                    if witness_evidence is not None
                    else None
                ),
            )
        )
    return tuple(results)


def make_unit_result(
    *,
    unit_key: str,
    atomic_vcs: tuple[AtomicVCResult, ...],
    oracle_health: VCStatus,
    candidate_health: VCStatus,
    warnings: tuple[str, ...] = (),
    oracle_health_evidence: tuple[str, ...] = (),
    candidate_health_evidence: tuple[str, ...] = (),
) -> UnitResult:
    status_map = {item.name: item.status for item in atomic_vcs}
    result = UnitResult(
        unit_key=unit_key,
        classification=classify_unit(
            atomic_vcs=status_map,
        ),
        atomic_vcs=atomic_vcs,
        oracle_health=oracle_health,
        candidate_health=candidate_health,
        warnings=warnings,
        oracle_health_evidence=oracle_health_evidence,
        candidate_health_evidence=candidate_health_evidence,
    )
    result.validate()
    return result


def execute_unit_proof(
    *,
    backend: LogikaBackend,
    project: Path,
    proof: object,
    timeout: int,
    evidence_dir: Path,
    evidence_base: Path | None = None,
    run_health_checks: bool = True,
) -> UnitResult:
    """Execute every obligation for one generated unit and classify it.

    Health is the conjunction of assumption satisfiability and pointwise
    realizability.  A rejected validity claim becomes unhealthy only when its
    separately emitted complement is SAT.  Unsupported realizability, timeout,
    and tool failures remain inconclusive.
    """

    atomic = tuple(getattr(proof, "atomic"))
    health = tuple(getattr(proof, "health"))
    unit_key = str(getattr(proof, "unit_key"))
    evidence_dir.mkdir(parents=True, exist_ok=True)

    supported_health = tuple(
        item
        for item in health
        if bool(getattr(item, "supported")) and getattr(item, "source") is not None
    ) if run_health_checks else ()
    validity_sources = tuple(item.validity_source for item in atomic) + tuple(
        Path(getattr(item, "source"))
        for item in supported_health
        if str(getattr(item, "mode")) == "valid"
    )
    sat_sources = tuple(
        Path(getattr(item, "source"))
        for item in supported_health
        if str(getattr(item, "mode")) == "sat"
    )
    cache: dict[tuple[str, Path], LogikaRun] = {}
    for mode, sources in (("valid", validity_sources), ("sat", sat_sources)):
        for source, run in execute_many(
            backend=backend,
            project=project,
            sources=sources,
            mode=mode,
            timeout=timeout,
        ).items():
            cache[(mode, source.resolve())] = run

    conditional_complements = [
        materialize_complement(item)
        for item in atomic
        if cache[("valid", item.validity_source.resolve())].outcome
        is ToolOutcome.REJECTED
    ]
    conditional_complements.extend(
        materialize_complement(item)
        for item in supported_health
        if str(getattr(item, "mode")) == "valid"
        and cache[("valid", Path(getattr(item, "source")).resolve())].outcome
        is ToolOutcome.REJECTED
        and getattr(item, "complement_source") is not None
    )
    for source, run in execute_many(
        backend=backend,
        project=project,
        sources=conditional_complements,
        mode="sat",
        timeout=timeout,
    ).items():
        cache[("sat", source.resolve())] = run

    atomic_results = execute_atomic_obligations(
        backend=backend,
        project=project,
        obligations=atomic,
        timeout=timeout,
        evidence_dir=evidence_dir / "atomic",
        evidence_base=evidence_base,
        precomputed=cache,
    )

    health_statuses: dict[str, list[VCStatus]] = {"oracle": [], "candidate": []}
    health_evidence: dict[str, list[str]] = {"oracle": [], "candidate": []}
    warnings: list[str] = []
    for index, obligation in enumerate(health if run_health_checks else (), 1):
        side = str(getattr(obligation, "side"))
        kind = str(getattr(obligation, "kind"))
        if side not in health_statuses:
            raise ValueError(f"unknown health side {side!r}")
        if not bool(getattr(obligation, "supported")):
            health_statuses[side].append(VCStatus.UNKNOWN)
            warnings.append(
                str(getattr(obligation, "unsupported_reason"))
                or f"unsupported {side} {kind} health obligation"
            )
            continue
        source = getattr(obligation, "source")
        if source is None:
            raise ValueError(f"supported health obligation has no source: {side} {kind}")
        mode = str(getattr(obligation, "mode"))
        run = cache[(mode, Path(source).resolve())]
        stem = f"{index:02d}-{side}-{_safe_name(kind)}"
        run_path = evidence_dir / "health" / f"{stem}.json"
        run_path.parent.mkdir(parents=True, exist_ok=True)
        _write_run_record(
            run_path,
            run,
            project=project,
            source=Path(source),
            evidence_base=evidence_base,
        )
        health_evidence[side].append(_reported_path(run_path, evidence_base))
        if mode == "sat":
            status = _sat_status(run.outcome)
        elif mode == "valid":
            complement = LogikaRun((), "sat", ToolOutcome.NOT_RUN, None, "")
            complement_source = getattr(obligation, "complement_source")
            if run.outcome is ToolOutcome.REJECTED:
                if complement_source is None:
                    raise ValueError(
                        f"validity health obligation has no complement: {side} {kind}"
                    )
                complement = cache[("sat", Path(complement_source).resolve())]
                complement_path = evidence_dir / "health" / f"{stem}-complement.json"
                _write_run_record(
                    complement_path,
                    complement,
                    project=project,
                    source=Path(complement_source),
                    evidence_base=evidence_base,
                )
                health_evidence[side].append(
                    _reported_path(complement_path, evidence_base)
                )
            status = atomic_status(run.outcome, complement.outcome)
        else:
            raise ValueError(f"unknown health mode {mode!r}")
        health_statuses[side].append(status)

    oracle_health = (
        _health_status(health_statuses["oracle"])
        if run_health_checks
        else VCStatus.NOT_RUN
    )
    candidate_health = (
        _health_status(health_statuses["candidate"])
        if run_health_checks
        else VCStatus.NOT_RUN
    )
    result = make_unit_result(
        unit_key=unit_key,
        atomic_vcs=atomic_results,
        oracle_health=oracle_health,
        candidate_health=candidate_health,
        warnings=tuple(dict.fromkeys(warnings)),
        oracle_health_evidence=tuple(health_evidence["oracle"]),
        candidate_health_evidence=tuple(health_evidence["candidate"]),
    )
    verify_unit_evidence(
        project=project,
        proof=proof,
        result=result,
        evidence_base=evidence_base or evidence_dir.parent,
        health_deferred=not run_health_checks,
    )
    proof_directory = Path(getattr(proof, "directory"))
    actual_complements = {
        path.resolve() for path in proof_directory.rglob("*complement.scala")
    }
    expected_complements = {
        Path(path).resolve() for path in conditional_complements
    }
    if actual_complements != expected_complements:
        raise EvidenceVerificationError(
            "proof project contains a complement that was not required by a "
            "rejected validity obligation"
        )
    return result


def _sat_status(outcome: ToolOutcome) -> VCStatus:
    if outcome is ToolOutcome.SAT:
        return VCStatus.VERIFIED
    if outcome is ToolOutcome.UNSAT:
        return VCStatus.COUNTEREXAMPLE
    if outcome is ToolOutcome.TIMEOUT:
        return VCStatus.TIMEOUT
    if outcome is ToolOutcome.TOOL_ERROR:
        return VCStatus.TOOL_ERROR
    return VCStatus.UNKNOWN


def _health_status(statuses: Iterable[VCStatus]) -> VCStatus:
    values = tuple(statuses)
    if len(values) != 2:
        return VCStatus.UNKNOWN
    if any(status is VCStatus.COUNTEREXAMPLE for status in values):
        return VCStatus.COUNTEREXAMPLE
    if all(status is VCStatus.VERIFIED for status in values):
        return VCStatus.VERIFIED
    if any(status is VCStatus.TIMEOUT for status in values):
        return VCStatus.TIMEOUT
    if any(status is VCStatus.TOOL_ERROR for status in values):
        return VCStatus.TOOL_ERROR
    return VCStatus.UNKNOWN


def _reported_path(path: Path, base: Path | None) -> str:
    if base is None:
        return str(path)
    try:
        return str(path.resolve().relative_to(base.resolve()))
    except ValueError:
        return str(path)


def verify_unit_evidence(
    *,
    project: Path,
    proof: object,
    result: UnitResult,
    evidence_base: Path,
    health_deferred: bool = False,
) -> VerifiedUnitEvidence:
    """Recompute one UnitResult solely from source-bound JSON run records."""

    project = project.resolve()
    evidence_base = evidence_base.resolve()
    unit_key = str(getattr(proof, "unit_key"))
    if result.unit_key != unit_key:
        raise EvidenceVerificationError("UnitResult key does not match generated proof")
    atomic = tuple(getattr(proof, "atomic"))
    if len(atomic) != len(ATOMIC_VCS) or {item.vc_name for item in atomic} != set(
        ATOMIC_VCS
    ):
        raise EvidenceVerificationError("generated proof atomic VC inventory is invalid")
    by_name = {item.name: item for item in result.atomic_vcs}
    if len(result.atomic_vcs) != len(ATOMIC_VCS) or set(by_name) != set(ATOMIC_VCS):
        raise EvidenceVerificationError("UnitResult atomic VC inventory is incomplete")
    verified_paths: list[Path] = []
    recomputed_atomic: dict[str, VCStatus] = {}
    for obligation in atomic:
        recorded = by_name.get(obligation.vc_name)
        if recorded is None or recorded.formula != obligation.formula:
            raise EvidenceVerificationError(
                f"atomic VC formula mismatch: {obligation.vc_name}"
            )
        validity_path = _evidence_link(
            recorded.validity_evidence, evidence_base, f"{obligation.vc_name} validity"
        )
        validity = _verify_run_record(
            validity_path,
            mode="valid",
            source=obligation.validity_source,
            project=project,
            evidence_base=evidence_base,
        )
        verified_paths.append(validity_path)
        complement = LogikaRun((), "sat", ToolOutcome.NOT_RUN, None, "")
        if validity.outcome is ToolOutcome.REJECTED:
            witness_path = _evidence_link(
                recorded.witness_evidence,
                evidence_base,
                f"{obligation.vc_name} complement",
            )
            complement = _verify_run_record(
                witness_path,
                mode="sat",
                source=obligation.complement_source,
                project=project,
                evidence_base=evidence_base,
            )
            verified_paths.append(witness_path)
        elif recorded.witness_evidence is not None:
            raise EvidenceVerificationError(
                f"unexpected complement evidence for {obligation.vc_name}"
            )
        status = atomic_status(validity.outcome, complement.outcome)
        if recorded.status is not status:
            raise EvidenceVerificationError(
                f"atomic VC status disagrees with evidence: {obligation.vc_name}"
            )
        recomputed_atomic[obligation.vc_name] = status

    health_statuses: dict[str, list[VCStatus]] = {"oracle": [], "candidate": []}
    links = {
        "oracle": iter(result.oracle_health_evidence),
        "candidate": iter(result.candidate_health_evidence),
    }
    health_obligations = tuple(getattr(proof, "health"))
    health_inventory = {
        side: [
            str(getattr(item, "kind"))
            for item in health_obligations
            if str(getattr(item, "side")) == side
        ]
        for side in ("oracle", "candidate")
    }
    if any(
        kinds != ["assumption-satisfiable", "pointwise-realizable"]
        for kinds in health_inventory.values()
    ):
        raise EvidenceVerificationError("generated proof health inventory is invalid")
    for obligation in (() if health_deferred else health_obligations):
        side = str(getattr(obligation, "side"))
        if side not in links:
            raise EvidenceVerificationError(f"unknown health evidence side {side!r}")
        if not bool(getattr(obligation, "supported")):
            health_statuses[side].append(VCStatus.UNKNOWN)
            continue
        source = getattr(obligation, "source")
        if source is None:
            raise EvidenceVerificationError("supported health obligation has no source")
        path = _next_link(links[side], evidence_base, f"{side} health")
        mode = str(getattr(obligation, "mode"))
        run = _verify_run_record(
            path,
            mode=mode,
            source=Path(source),
            project=project,
            evidence_base=evidence_base,
        )
        verified_paths.append(path)
        if mode == "sat":
            status = _sat_status(run.outcome)
        elif mode == "valid":
            complement = LogikaRun((), "sat", ToolOutcome.NOT_RUN, None, "")
            if run.outcome is ToolOutcome.REJECTED:
                complement_source = getattr(obligation, "complement_source")
                if complement_source is None:
                    raise EvidenceVerificationError(
                        f"rejected {side} health check has no complement source"
                    )
                complement_path = _next_link(
                    links[side], evidence_base, f"{side} health complement"
                )
                complement = _verify_run_record(
                    complement_path,
                    mode="sat",
                    source=Path(complement_source),
                    project=project,
                    evidence_base=evidence_base,
                )
                verified_paths.append(complement_path)
            status = atomic_status(run.outcome, complement.outcome)
        else:
            raise EvidenceVerificationError(f"unknown health mode {mode!r}")
        health_statuses[side].append(status)
    for side, iterator in links.items():
        try:
            extra = next(iterator)
        except StopIteration:
            continue
        raise EvidenceVerificationError(f"unexpected extra {side} health evidence: {extra}")
    oracle_health = (
        VCStatus.NOT_RUN
        if health_deferred
        else _health_status(health_statuses["oracle"])
    )
    candidate_health = (
        VCStatus.NOT_RUN
        if health_deferred
        else _health_status(health_statuses["candidate"])
    )
    if result.oracle_health is not oracle_health or result.candidate_health is not candidate_health:
        raise EvidenceVerificationError("UnitResult health status disagrees with evidence")

    classification = classify_unit(
        atomic_vcs=recomputed_atomic,
    )
    if result.classification is not classification:
        raise EvidenceVerificationError("UnitResult classification disagrees with evidence")
    unique_paths = tuple(dict.fromkeys(path.resolve() for path in verified_paths))
    return VerifiedUnitEvidence(
        unit_key,
        tuple(str(path.relative_to(evidence_base)) for path in unique_paths),
        tuple(
            (str(path.relative_to(evidence_base)), _sha256(path))
            for path in unique_paths
        ),
    )


def _next_link(iterator: object, base: Path, label: str) -> Path:
    try:
        value = next(iterator)  # type: ignore[arg-type]
    except StopIteration as error:
        raise EvidenceVerificationError(f"missing {label} evidence") from error
    return _evidence_link(str(value), base, label)


def _evidence_link(value: str | None, base: Path, label: str) -> Path:
    if not value:
        raise EvidenceVerificationError(f"missing {label} evidence link")
    raw = Path(value)
    path = raw.resolve() if raw.is_absolute() else (base / raw).resolve()
    try:
        path.relative_to(base)
    except ValueError as error:
        raise EvidenceVerificationError(f"{label} evidence escapes bundle: {value}") from error
    if not path.is_file():
        raise EvidenceVerificationError(f"{label} evidence is not a file: {value}")
    return path


def _verify_run_record(
    path: Path,
    *,
    mode: str,
    source: Path,
    project: Path,
    evidence_base: Path,
) -> LogikaRun:
    try:
        document = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, UnicodeDecodeError, json.JSONDecodeError) as error:
        raise EvidenceVerificationError(f"invalid run record {path}: {error}") from error
    if not isinstance(document, dict):
        raise EvidenceVerificationError(f"run record is not an object: {path}")
    if document.get("mode") != mode:
        raise EvidenceVerificationError(f"run mode mismatch in {path}")
    expected_source = _relocated_proof_source(source, project)
    expected_project = project.resolve()
    recorded_source = _record_path(
        document.get("source"), evidence_base, f"run source in {path}"
    )
    recorded_project = _record_path(
        document.get("project"), evidence_base, f"run project in {path}"
    )
    if recorded_source != expected_source:
        raise EvidenceVerificationError(f"run source mismatch in {path}")
    if document.get("source_sha256") != _sha256(expected_source):
        raise EvidenceVerificationError(f"run source hash mismatch in {path}")
    if recorded_project != expected_project:
        raise EvidenceVerificationError(f"run project mismatch in {path}")
    command_value = document.get("command")
    if not isinstance(command_value, list) or not all(
        isinstance(item, str) for item in command_value
    ):
        raise EvidenceVerificationError(f"run argv is malformed in {path}")
    command = tuple(command_value)
    engine = document.get("engine", "subprocess")
    if engine not in {"subprocess", "resident"}:
        raise EvidenceVerificationError(f"run engine is malformed in {path}")
    try:
        source_in_project = expected_source.relative_to(expected_project)
    except ValueError as error:
        raise EvidenceVerificationError(
            f"recorded proof source is outside recorded project in {path}"
        ) from error
    request_value = document.get("request", [])
    if not isinstance(request_value, list) or not all(
        isinstance(item, str) for item in request_value
    ):
        raise EvidenceVerificationError(f"resident request is malformed in {path}")
    request = tuple(request_value)
    if engine == "resident":
        if len(request) != 6 or request[0] != "RUN":
            raise EvidenceVerificationError(
                f"resident request is not singleton-source in {path}"
            )
        if request[2] != mode or Path(request[4]).resolve() != expected_source:
            raise EvidenceVerificationError(f"resident request/source mismatch in {path}")
        if request[5] != _sha256(expected_source):
            raise EvidenceVerificationError(f"resident request hash mismatch in {path}")
        if "slang" not in command or "run" not in command:
            raise EvidenceVerificationError(f"resident worker argv is malformed in {path}")
        runtime_project = expected_project
        runtime_source = expected_source
    else:
        if "logika" not in command:
            raise EvidenceVerificationError(f"run argv is not a Logika invocation in {path}")
        if request:
            raise EvidenceVerificationError(f"subprocess run has a resident request in {path}")
        path_arguments = [
            Path(item).resolve()
            for item in command
            if item and not item.startswith("-")
        ]
        argv_source_pairs = [
            (project_arg, source_arg)
            for project_arg in path_arguments
            for source_arg in path_arguments
            if _relative_to_or_none(source_arg, project_arg) == source_in_project
        ]
        if len(argv_source_pairs) != 1:
            raise EvidenceVerificationError(
                f"run argv source/project mismatch in {path}"
            )
        runtime_project, runtime_source = argv_source_pairs[0]
        runtime_proof_sources = tuple(
            argument
            for argument in path_arguments
            if argument.suffix == expected_source.suffix
            and _relative_to_or_none(argument, runtime_project) not in {None, Path(".")}
        )
        if runtime_proof_sources != (runtime_source,):
            raise EvidenceVerificationError(
                f"run argv must identify exactly one proof source in {path}"
            )
        if "--verbose" not in command:
            raise EvidenceVerificationError(f"run argv omitted verbose source attestation in {path}")
        if (mode == "sat") != ("--sat" in command):
            raise EvidenceVerificationError(f"run argv mode mismatch in {path}")
    try:
        outcome = ToolOutcome(str(document["outcome"]))
    except (KeyError, ValueError) as error:
        raise EvidenceVerificationError(f"run outcome is malformed in {path}") from error
    exit_code = document.get("exit_code")
    if exit_code is not None and not isinstance(exit_code, int):
        raise EvidenceVerificationError(f"run exit code is malformed in {path}")
    output = document.get("output")
    if not isinstance(output, str):
        raise EvidenceVerificationError(f"run output is malformed in {path}")
    interpreted = interpret_logika(
        mode=mode,
        exit_code=exit_code,
        output=output,
        requested_sources=(runtime_source,),
    )
    if interpreted is not outcome:
        raise EvidenceVerificationError(f"run outcome disagrees with output in {path}")
    if outcome in {ToolOutcome.VERIFIED, ToolOutcome.SAT} and not verifying_files_attest(
        output, (runtime_source,)
    ):
        raise EvidenceVerificationError(
            f"run output does not attest its single proof source in {path}"
        )
    wall_seconds = document.get("wall_seconds")
    verification_seconds = document.get("verification_seconds")
    if wall_seconds is not None and not isinstance(wall_seconds, (int, float)):
        raise EvidenceVerificationError(f"run wall timing is malformed in {path}")
    if verification_seconds is not None and not isinstance(
        verification_seconds, (int, float)
    ):
        raise EvidenceVerificationError(f"run verification timing is malformed in {path}")
    return LogikaRun(
        command,
        mode,
        outcome,
        exit_code,
        output,
        float(wall_seconds) if wall_seconds is not None else None,
        float(verification_seconds) if verification_seconds is not None else None,
        str(engine),
        request,
    )


def _record_path(value: object, base: Path, label: str) -> Path:
    if not isinstance(value, str) or not value:
        raise EvidenceVerificationError(f"{label} is missing or malformed")
    raw = Path(value)
    path = raw.resolve() if raw.is_absolute() else (base / raw).resolve()
    try:
        path.relative_to(base)
    except ValueError as error:
        raise EvidenceVerificationError(f"{label} escapes evidence bundle") from error
    return path


def _relocated_proof_source(source: Path, project: Path) -> Path:
    resolved = source.resolve()
    project = project.resolve()
    try:
        resolved.relative_to(project)
    except ValueError:
        parts = resolved.parts
        candidates = [
            index
            for index in range(len(parts) - 1)
            if parts[index : index + 2] == ("src", "main")
        ]
        if not candidates:
            return resolved
        suffix = Path(*parts[candidates[-1] + 2 :])
        return (project / "src" / "main" / suffix).resolve()
    return resolved


def _relative_to_or_none(path: Path, parent: Path) -> Path | None:
    try:
        return path.relative_to(parent)
    except ValueError:
        return None


def _write_run_record(
    path: Path,
    run: LogikaRun,
    *,
    project: Path,
    source: Path,
    evidence_base: Path | None,
) -> None:
    path.write_text(
        json.dumps(
            _run_json(
                run,
                project=project,
                source=source,
                evidence_base=evidence_base,
            ),
            indent=2,
            sort_keys=True,
        )
        + "\n",
        encoding="utf-8",
    )


def _sha256(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest()


def _run_json(
    run: LogikaRun,
    *,
    project: Path | None = None,
    source: Path | None = None,
    evidence_base: Path | None = None,
) -> dict[str, object]:
    result: dict[str, object] = {
        "command": list(run.command),
        "mode": run.mode,
        "outcome": run.outcome.value,
        "exit_code": run.exit_code,
        "output": run.output,
        "engine": run.engine,
        "request": list(run.request),
        "wall_seconds": run.wall_seconds,
        "verification_seconds": run.verification_seconds,
    }
    if project is not None and source is not None:
        project_value = _portable_record_path(project, evidence_base)
        source_value = _portable_record_path(source, evidence_base)
        result.update(
            {
                "project": project_value,
                "source": source_value,
                "source_sha256": _sha256(source.resolve()),
            }
        )
    return result


def _portable_record_path(path: Path, base: Path | None) -> str:
    resolved = path.resolve()
    if base is None:
        return str(resolved)
    try:
        return str(resolved.relative_to(base.resolve()))
    except ValueError as error:
        raise EvidenceVerificationError(
            f"run path is outside the supplied evidence base: {resolved}"
        ) from error


def _safe_name(value: str) -> str:
    return "".join(character.lower() if character.isalnum() else "-" for character in value).strip("-")
