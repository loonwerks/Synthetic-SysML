"""Command-line entry point for two-file SysML/GUMBO equivalence checking."""

from __future__ import annotations

import argparse
from dataclasses import dataclass
import hashlib
import json
import math
import os
from pathlib import Path
import shlex
import sys
import tempfile
from typing import Any, Callable, Mapping, Protocol, Sequence

from .compact import write_compact_output
from .evidence import (
    EvidenceBundle,
    EvidenceError,
    InvalidOutputDirectoryError,
    sha256_file,
)
from .model_gate import MODEL_FINGERPRINT_POLICY
from .gumbox import catalog_slang_objects
from .reporting import (
    aggregate_report,
    exit_code,
    report_json,
    summary_json,
    unit_evidence_paths,
)
from .schema import ComparisonPlan, RunStatus, UnitKind, UnitResult, to_json
from .timing import TimingRecorder
from .type_alignment import catalog_type_file


@dataclass(frozen=True)
class CompareRequest:
    oracle: Path
    candidate: Path
    output_dir: Path
    archived_oracle: Path
    archived_candidate: Path
    timeout_seconds: float
    run_health_checks: bool = True
    timings: TimingRecorder | None = None


@dataclass(frozen=True)
class BackendOutcome:
    """The backend-neutral result consumed by reporting and evidence code."""

    run_status: RunStatus
    plan: ComparisonPlan | None = None
    unit_results: tuple[UnitResult, ...] = ()
    model_equivalent: bool | None = None
    diagnostics: tuple[str, ...] = ()
    oracle_inventory: Mapping[str, Any] | None = None
    candidate_inventory: Mapping[str, Any] | None = None
    invalid_input: bool = False


class ComparisonBackend(Protocol):
    def compare(
        self, request: CompareRequest, evidence: EvidenceBundle
    ) -> BackendOutcome: ...


class InconclusiveComparison(RuntimeError):
    """Expected unsupported, timeout, or invalid-input backend outcome."""


class BackendFailure(RuntimeError):
    """Unexpected checker or external-tool failure."""


BackendFactory = Callable[[], ComparisonBackend]
_backend_factory: BackendFactory | None = None

_CHECKER_SOURCE_NAMES = (
    "__init__.py",
    "__main__.py",
    "backend.py",
    "cli.py",
    "codegen.py",
    "compact.py",
    "evidence.py",
    "gumbox.py",
    "inventory.py",
    "model_gate.py",
    "proof.py",
    "reporting.py",
    "schema.py",
    "slang_proof.py",
    "type_alignment.py",
    "timing.py",
    "adapters/GumboInventory.scala",
    "adapters/GumboSemanticExport.scala",
    "adapters/LogikaWorker.scala",
)


def set_backend_factory(factory: BackendFactory | None) -> None:
    """Install the production backend factory without coupling the CLI to it."""

    global _backend_factory
    _backend_factory = factory


def _positive_timeout(value: str) -> float:
    try:
        timeout = float(value)
    except ValueError as exc:
        raise argparse.ArgumentTypeError("timeout must be a number") from exc
    if not math.isfinite(timeout) or timeout <= 0:
        raise argparse.ArgumentTypeError("timeout must be a positive finite number")
    return timeout


def build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(
        prog="python3 -m equiv_checker",
        description="Compare the resolved model and supported GUMBO semantics of two SysML files.",
    )
    subparsers = parser.add_subparsers(dest="command", required=True)
    compare = subparsers.add_parser("compare", help="compare an oracle and candidate")
    compare.add_argument("--oracle", type=Path, required=True)
    compare.add_argument("--candidate", type=Path, required=True)
    compare.add_argument(
        "--output-dir", type=Path, default=Path("build/equiv-results")
    )
    compare.add_argument("--timeout", type=_positive_timeout, default=60.0)
    compare.add_argument(
        "--defer-health",
        action="store_true",
        help="run only the four comparison checks; retain health proofs for a later pass",
    )
    return parser


def _load_backend(backend: ComparisonBackend | None) -> ComparisonBackend:
    if backend is not None:
        return backend
    if _backend_factory is not None:
        return _backend_factory()
    # Integration may provide this conventional module without changing the
    # stable CLI surface.  Only absence is translated into a controlled error;
    # an import failure inside the production backend remains a checker error.
    try:
        from .backend import create_backend  # type: ignore[import-not-found]
    except ModuleNotFoundError as exc:
        if exc.name not in {"equiv_checker.backend", f"{__package__}.backend"}:
            raise
        raise BackendFailure("no equivalence backend is installed") from exc
    return create_backend()


def _invoke_backend(
    backend: ComparisonBackend, request: CompareRequest, evidence: EvidenceBundle
) -> BackendOutcome:
    compare = getattr(backend, "compare", None)
    if not callable(compare):
        raise BackendFailure("backend does not provide compare(request, evidence)")
    outcome = compare(request, evidence)
    if not isinstance(outcome, BackendOutcome):
        raise BackendFailure("backend returned an invalid outcome")
    if not isinstance(outcome.run_status, RunStatus):
        raise BackendFailure("backend returned an invalid run status")
    if outcome.plan is not None and not isinstance(outcome.plan, ComparisonPlan):
        raise BackendFailure("backend returned an invalid comparison plan")
    if outcome.model_equivalent is not None and not isinstance(
        outcome.model_equivalent, bool
    ):
        raise BackendFailure("backend returned an invalid model-equivalence status")
    if any(not isinstance(result, UnitResult) for result in outcome.unit_results):
        raise BackendFailure("backend returned an invalid unit result")
    if not isinstance(outcome.diagnostics, tuple) or any(
        not isinstance(message, str) for message in outcome.diagnostics
    ):
        raise BackendFailure("backend returned invalid diagnostics")
    if outcome.oracle_inventory is not None and not isinstance(
        outcome.oracle_inventory, Mapping
    ):
        raise BackendFailure("backend returned an invalid oracle inventory")
    if outcome.candidate_inventory is not None and not isinstance(
        outcome.candidate_inventory, Mapping
    ):
        raise BackendFailure("backend returned an invalid candidate inventory")
    try:
        if outcome.plan is not None:
            outcome.plan.validate()
        for result in outcome.unit_results:
            result.validate()
    except ValueError as exc:
        raise BackendFailure(f"backend returned invalid comparison data: {exc}") from exc

    if outcome.run_status is RunStatus.COMPLETED:
        if outcome.model_equivalent is None:
            raise BackendFailure("completed backend outcome has no model result")
        if outcome.plan is None:
            raise BackendFailure("completed backend outcome has no comparison plan")
        if outcome.oracle_inventory is None or outcome.candidate_inventory is None:
            raise BackendFailure("completed backend outcome has no resolved inventories")
        if (
            outcome.model_equivalent is True
            and outcome.plan is not None
            and not outcome.plan.units
            and not all(
                _inventory_certifies_no_contracts(inventory)
                for inventory in (
                    outcome.oracle_inventory,
                    outcome.candidate_inventory,
                )
            )
        ):
            raise BackendFailure(
                "empty proof plan lacks an empty-contract inventory certificate"
            )
    elif outcome.model_equivalent is not None:
        raise BackendFailure("incomplete backend outcome contains a semantic model result")

    if outcome.model_equivalent is False:
        if outcome.unit_results:
            raise BackendFailure("model-mismatch outcome contains proof-unit results")
        proof_files = tuple(
            path
            for path in (evidence.root / "proofs").rglob("*")
            if path.is_file() or path.is_symlink()
        )
        proof_entries = tuple(
            entry.path
            for entry in evidence.entries
            if entry.kind.startswith("proof") or entry.path.startswith("proofs/")
        )
        if proof_files or proof_entries:
            raise BackendFailure("backend produced proof artifacts after a model mismatch")
    return outcome


def _inventory_certifies_no_contracts(inventory: Mapping[str, Any]) -> bool:
    """Validate the serialized certificate used by zero-unit equivalence."""

    clauses = inventory.get("clauses", inventory.get("records"))
    return (
        inventory.get("declared_clause_count") == 0
        and inventory.get("supported_clause_count") == 0
        and isinstance(clauses, (list, tuple))
        and not clauses
        and isinstance(inventory.get("contract_owners"), (list, tuple))
        and not inventory["contract_owners"]
        and isinstance(inventory.get("coverage_gaps"), (list, tuple))
        and not inventory["coverage_gaps"]
    )


def _invocation(args: argparse.Namespace) -> list[str]:
    base = Path.cwd().resolve()

    def relative(path: Path) -> str:
        return Path(os.path.relpath(path.resolve(), base)).as_posix()

    invocation = [
        "python3",
        "-m",
        "equiv_checker",
        "compare",
        "--oracle",
        relative(args.oracle),
        "--candidate",
        relative(args.candidate),
        "--output-dir",
        relative(args.output_dir),
        "--timeout",
        str(args.timeout),
    ]
    if args.defer_health:
        invocation.append("--defer-health")
    return invocation


def _archive_checker_sources(
    bundle: EvidenceBundle,
) -> tuple[tuple[Path, str, str], ...]:
    """Archive and hash the exact checker sources participating in a verdict."""

    repo_root = Path(__file__).resolve().parents[2]
    checker_root = Path(__file__).resolve().parent
    sources = [checker_root / name for name in _CHECKER_SOURCE_NAMES]
    sources.append(repo_root / "src" / "sysml_tools" / "gumbo.py")
    sources.append(
        repo_root / "src" / "sysml_tools" / "tools" / "SysmlGumboSpans.java"
    )
    records: list[tuple[Path, str, str]] = []
    manifest: list[dict[str, object]] = []
    for source in sources:
        if not source.is_file():
            raise EvidenceError(f"required checker source is missing: {source}")
        source_relative = source.relative_to(repo_root).as_posix()
        archived = bundle.archive_copy(
            source,
            f"checker-snapshot/{source_relative}",
            kind="checker-source",
        )
        digest = sha256_file(bundle.root / archived)
        records.append((source, archived, digest))
        manifest.append(
            {
                "source": source_relative,
                "snapshot": archived,
                "sha256": digest,
            }
        )
    bundle.write_json(
        "checker-snapshot/manifest.json",
        {"schema_version": "1.0.0", "files": manifest},
        kind="checker-source-manifest",
    )
    return tuple(records)


def _verify_checker_sources(
    bundle: EvidenceBundle, records: Sequence[tuple[Path, str, str]]
) -> None:
    """Fail if checker source changed after the run's snapshot was taken."""

    bundle.verify_links(
        ("checker-snapshot/manifest.json", *(archived for _, archived, _ in records))
    )
    changed = [
        str(source)
        for source, archived, digest in records
        if sha256_file(source) != digest
        or sha256_file(bundle.root / archived) != digest
    ]
    if changed:
        raise EvidenceError(f"checker source changed during evaluation: {changed}")


def _write_replay(
    bundle: EvidenceBundle,
    timeout: float,
    defer_health: bool,
) -> None:
    checker_root = Path(__file__).resolve().parents[2]
    replay = (
        "#!/usr/bin/env sh\n"
        "set -eu\n"
        'BUNDLE_DIR=$(CDPATH= cd "$(dirname "$0")" && pwd)\n'
        'if [ -n "${EQUIV_CHECKER_ROOT:-}" ]; then\n'
        '  CHECKER_ROOT=$EQUIV_CHECKER_ROOT\n'
        "else\n"
        f"  CHECKER_ROOT={shlex.quote(str(checker_root))}\n"
        "fi\n"
        'OUTPUT_DIR=${1:-"${BUNDLE_DIR}.replay-results"}\n'
        'cd "$CHECKER_ROOT"\n'
        'exec python3 -m equiv_checker compare \\\n'
        '  --oracle "$BUNDLE_DIR/inputs/oracle.sysml" \\\n'
        '  --candidate "$BUNDLE_DIR/inputs/candidate.sysml" \\\n'
        '  --output-dir "$OUTPUT_DIR" \\\n'
        f"  --timeout {shlex.quote(str(timeout))}"
        + (" --defer-health" if defer_health else "")
        + "\n"
    )
    relative = bundle.write_text("replay.sh", replay, kind="replay-script")
    (bundle.root / relative).chmod(0o755)


def _write_indexes(bundle: EvidenceBundle) -> None:
    for directory, kinds in (
        ("proofs", ("proof",)),
        ("generated", ("generated", "dependency")),
        ("logs", ("log",)),
        ("commands", ("command",)),
    ):
        files = [
            entry.path
            for entry in bundle.entries
            if entry.path.startswith(f"{directory}/")
            and entry.path != f"{directory}/index.json"
            and any(entry.kind.startswith(prefix) for prefix in kinds)
        ]
        if not files:
            continue
        bundle.write_json(
            f"{directory}/index.json",
            {"files": files},
            kind=f"{directory}-index",
        )


def _archive_backend_documents(bundle: EvidenceBundle, outcome: BackendOutcome) -> None:
    if outcome.plan is not None:
        bundle.write_json("comparison-plan.json", to_json(outcome.plan), kind="comparison-plan")
        bundle.write_json(
            "model/oracle-fingerprint.json",
            to_json(outcome.plan.oracle_fingerprint),
            kind="model-fingerprint",
        )
        bundle.write_json(
            "model/candidate-fingerprint.json",
            to_json(outcome.plan.candidate_fingerprint),
            kind="model-fingerprint",
        )
    if outcome.oracle_inventory is not None:
        bundle.write_json(
            "inventories/oracle.json", outcome.oracle_inventory, kind="resolved-inventory"
        )
    if outcome.candidate_inventory is not None:
        bundle.write_json(
            "inventories/candidate.json", outcome.candidate_inventory, kind="resolved-inventory"
        )


def _diagnostic_outcome(status: RunStatus, message: str) -> BackendOutcome:
    return BackendOutcome(run_status=status, diagnostics=(message,))


def _verify_plan_artifacts(bundle: EvidenceBundle, plan: ComparisonPlan) -> None:
    """Verify generated predicate and neutral-carrier artifacts cited by a plan."""

    for unit in plan.units:
        for binding in (unit.oracle, unit.candidate):
            if binding is None or binding.generated_source is None:
                continue
            bundle.verify_links((binding.generated_source,))
            source = bundle.root / binding.generated_source
            if binding.generated_sha256 is None or sha256_file(source) != binding.generated_sha256:
                raise EvidenceError(
                    f"generated predicate hash does not match comparison plan: {unit.key}"
                )

    replacements: dict[tuple[str, str], Mapping[str, Any]] = {}
    for relative in plan.neutralization_evidence:
        bundle.verify_links((relative,))
        try:
            document = json.loads((bundle.root / relative).read_text(encoding="utf-8"))
        except (OSError, UnicodeDecodeError, json.JSONDecodeError) as error:
            raise EvidenceError(
                f"invalid neutral-carrier attestation {relative}: {error}"
            ) from error
        values = document.get("replacements") if isinstance(document, Mapping) else None
        if not isinstance(values, list):
            raise EvidenceError(
                f"neutral-carrier attestation has no replacement inventory: {relative}"
            )
        for value in values:
            if not isinstance(value, Mapping):
                raise EvidenceError(f"malformed neutral-carrier replacement: {relative}")
            side = value.get("side")
            staged = value.get("staged_source")
            original = value.get("original_source")
            neutral = value.get("neutral_source")
            if side not in {"oracle", "candidate"} or not all(
                isinstance(path, str) and path
                for path in (staged, original, neutral)
            ):
                raise EvidenceError(f"malformed neutral-carrier paths: {relative}")
            bundle.verify_links((staged, original, neutral))
            hashes = (
                (original, value.get("source_sha256")),
                (neutral, value.get("neutral_sha256")),
                (staged, value.get("staged_sha256")),
            )
            for path, expected in hashes:
                if not isinstance(expected, str) or sha256_file(bundle.root / path) != expected:
                    raise EvidenceError(
                        f"neutral-carrier hash mismatch for {path}"
                    )
            if value.get("neutral_sha256") != value.get("staged_sha256"):
                raise EvidenceError(
                    f"staged datatype carrier is not the attested neutral source: {staged}"
                )
            preserved = value.get("preserved_predicate_sha256")
            if not isinstance(preserved, Mapping) or not preserved:
                raise EvidenceError(
                    f"neutral-carrier attestation has no preserved predicates: {staged}"
                )
            key = (side, staged)
            if key in replacements:
                raise EvidenceError(f"duplicate neutral-carrier replacement: {key}")
            replacements[key] = value

    for unit in plan.units:
        if (
            unit.kind is not UnitKind.DATATYPE_INVARIANT
            or not plan.coverage_complete
            or not unit.coverage_complete
        ):
            continue
        for binding in (unit.oracle, unit.candidate):
            if binding is None or binding.synthetic_true_guarantee:
                continue
            if binding.generated_source is None or binding.guarantee is None:
                raise EvidenceError(
                    f"datatype invariant lacks generated binding evidence: {unit.key}"
                )
            replacement = replacements.get((binding.side, binding.generated_source))
            method = binding.guarantee.rsplit(".", 1)[-1]
            if binding.side == "candidate" and replacement is None:
                # Candidate invariant semantics are extracted as a proof-only
                # companion object over the oracle's neutral shared carrier.
                # It must declare no datatype of its own and must still expose
                # the exact hash-bound method cited by the comparison plan.
                source = bundle.root / binding.generated_source
                if catalog_type_file(source):
                    raise EvidenceError(
                        f"candidate invariant source declares a duplicate carrier: {unit.key}"
                    )
                owners = {
                    owner.qualified_name: owner
                    for owner in catalog_slang_objects(
                        source.read_text(encoding="utf-8"), source
                    )
                }
                owner_name = binding.guarantee.rsplit(".", 1)[0]
                owner = owners.get(owner_name)
                if owner is None or len(
                    [item for item in owner.methods if item.name == method]
                ) != 1:
                    raise EvidenceError(
                        f"candidate invariant source lacks its exact predicate: {unit.key}"
                    )
                continue
            preserved = (
                replacement.get("preserved_predicate_sha256")
                if replacement is not None
                else None
            )
            if not isinstance(preserved, Mapping) or method not in preserved:
                raise EvidenceError(
                    f"datatype invariant lacks an exact neutral-carrier attestation: "
                    f"{unit.key} {binding.side}"
                )


def _verify_model_artifact(
    bundle: EvidenceBundle,
    fingerprint: object,
    archived_input: Path,
) -> str:
    """Verify a canonical-model envelope and return its semantic digest."""

    canonical_path = getattr(fingerprint, "canonical_ast_path", None)
    if not isinstance(canonical_path, str):
        raise EvidenceError("model fingerprint has no canonical artifact path")
    bundle.verify_links((canonical_path,))
    canonical = bundle.root / canonical_path
    if sha256_file(archived_input) != getattr(fingerprint, "sha256", None):
        raise EvidenceError(
            f"model fingerprint does not match archived input: {canonical_path}"
        )
    if sha256_file(canonical) != getattr(fingerprint, "canonical_ast_sha256", None):
        raise EvidenceError(
            f"canonical AST hash does not match archived evidence: {canonical_path}"
        )
    try:
        document = json.loads(canonical.read_text(encoding="utf-8"))
    except (OSError, UnicodeDecodeError, json.JSONDecodeError) as error:
        raise EvidenceError(
            f"invalid canonical model artifact {canonical_path}: {error}"
        ) from error
    if not isinstance(document, Mapping):
        raise EvidenceError(f"canonical model artifact is not an object: {canonical_path}")
    if document.get("schema_version") != "1.0.0":
        raise EvidenceError(
            f"canonical model artifact has unsupported schema: {canonical_path}"
        )
    if document.get("policy") != MODEL_FINGERPRINT_POLICY:
        raise EvidenceError(f"canonical model artifact has wrong policy: {canonical_path}")
    authority = document.get("parser")
    expected_authority = getattr(fingerprint, "parser", None)
    if (
        not isinstance(authority, str)
        or expected_authority != f"{authority}; {MODEL_FINGERPRINT_POLICY}"
    ):
        raise EvidenceError(
            f"canonical model authority does not match fingerprint: {canonical_path}"
        )
    projection = document.get("canonical_ast")
    if not isinstance(projection, Mapping):
        raise EvidenceError(
            f"canonical model artifact has no resolved AST object: {canonical_path}"
        )
    projection_bytes = (
        json.dumps(
            projection,
            sort_keys=True,
            separators=(",", ":"),
            ensure_ascii=False,
        )
        + "\n"
    ).encode("utf-8")
    digest = hashlib.sha256(projection_bytes).hexdigest()
    if document.get("semantic_projection_sha256") != digest:
        raise EvidenceError(
            f"canonical model semantic digest is invalid: {canonical_path}"
        )
    return digest


def _run_compare(
    args: argparse.Namespace, backend: ComparisonBackend | None
) -> tuple[int, str, tuple[str, ...]]:
    args.oracle = args.oracle.expanduser().absolute()
    args.candidate = args.candidate.expanduser().absolute()
    args.output_dir = args.output_dir.expanduser().absolute()
    for label, path in (("oracle", args.oracle), ("candidate", args.candidate)):
        if not path.is_file():
            message = f"{label} input is not a regular file: {path}"
            return 2, RunStatus.INCONCLUSIVE.value, (message,)

    try:
        if args.output_dir.is_symlink():
            raise InvalidOutputDirectoryError(
                f"output directory must not be a symlink: {args.output_dir}"
            )
        if args.output_dir.exists():
            if not args.output_dir.is_dir():
                raise InvalidOutputDirectoryError(
                    f"output path is not a directory: {args.output_dir}"
                )
            if any(args.output_dir.iterdir()):
                raise InvalidOutputDirectoryError(
                    f"refusing to overwrite nonempty result directory: {args.output_dir}"
                )
        else:
            args.output_dir.parent.mkdir(parents=True, exist_ok=True)
            args.output_dir.mkdir()
        staging_context = tempfile.TemporaryDirectory(prefix="equiv-result-staging-")
        bundle = EvidenceBundle(Path(staging_context.name) / "bundle")
        timings = TimingRecorder(progress_path=args.output_dir / "progress.jsonl")
    except InvalidOutputDirectoryError as exc:
        return 2, RunStatus.INCONCLUSIVE.value, (str(exc),)
    except EvidenceError as exc:
        return 3, RunStatus.ERROR.value, (str(exc),)
    except OSError as exc:
        return 3, RunStatus.ERROR.value, (
            f"cannot create output directory {args.output_dir}: {exc}",
        )

    try:
        oracle_copy = bundle.archive_copy(
            args.oracle, "inputs/oracle.sysml", kind="input-oracle"
        )
        candidate_copy = bundle.archive_copy(
            args.candidate, "inputs/candidate.sysml", kind="input-candidate"
        )
        checker_sources = _archive_checker_sources(bundle)
        invocation = _invocation(args)
        bundle.write_json(
            "commands/compare.json",
            {"argv": invocation, "cwd": "."},
            kind="command-cli",
        )
        request = CompareRequest(
            oracle=args.oracle.absolute(),
            candidate=args.candidate.absolute(),
            output_dir=bundle.root,
            archived_oracle=bundle.root / oracle_copy,
            archived_candidate=bundle.root / candidate_copy,
            timeout_seconds=args.timeout,
            run_health_checks=not args.defer_health,
            timings=timings,
        )
        try:
            with timings.measure("backend-total"):
                outcome = _invoke_backend(_load_backend(backend), request, bundle)
        except InconclusiveComparison as exc:
            outcome = _diagnostic_outcome(RunStatus.INCONCLUSIVE, str(exc))
        except Exception as exc:  # checker/tool failures must never look semantic
            message = f"{type(exc).__name__}: {exc}"
            bundle.write_text("logs/checker-error.txt", message + "\n", kind="log-error")
            outcome = _diagnostic_outcome(RunStatus.ERROR, message)

        try:
            _archive_backend_documents(bundle, outcome)
        except Exception as exc:
            message = f"evidence archival failed: {type(exc).__name__}: {exc}"
            if not bundle.contains("logs/evidence-error.txt"):
                bundle.write_text(
                    "logs/evidence-error.txt", message + "\n", kind="log-error"
                )
            outcome = BackendOutcome(
                run_status=RunStatus.ERROR,
                plan=outcome.plan if bundle.contains("comparison-plan.json") else None,
                diagnostics=outcome.diagnostics + (message,),
            )
        # A backend may only contribute through the write-once EvidenceBundle
        # API.  Hidden or mutated files make the run unauditable, so stop
        # before writing a semantic summary.
        bundle.verify_integrity()

        required_links = [
            path for result in outcome.unit_results for path in unit_evidence_paths(result)
        ]
        if outcome.plan is not None:
            required_links.append("comparison-plan.json")
            required_links.extend(
                (
                    outcome.plan.oracle_fingerprint.canonical_ast_path,
                    outcome.plan.candidate_fingerprint.canonical_ast_path,
                )
            )
        if outcome.oracle_inventory is not None:
            required_links.append("inventories/oracle.json")
        if outcome.candidate_inventory is not None:
            required_links.append("inventories/candidate.json")
        try:
            bundle.verify_links(required_links)
            _verify_checker_sources(bundle, checker_sources)
            if outcome.plan is not None:
                fingerprints = (
                    (outcome.plan.oracle_fingerprint, bundle.root / oracle_copy),
                    (outcome.plan.candidate_fingerprint, bundle.root / candidate_copy),
                )
                semantic_digests: list[str] = []
                for fingerprint, archived_input in fingerprints:
                    semantic_digests.append(
                        _verify_model_artifact(bundle, fingerprint, archived_input)
                    )
                if outcome.model_equivalent is True and len(set(semantic_digests)) != 1:
                    raise EvidenceError(
                        "model-equivalent outcome has different canonical semantics"
                    )
                if outcome.model_equivalent is False and len(set(semantic_digests)) != 2:
                    raise EvidenceError(
                        "model-mismatch outcome has identical canonical semantics"
                    )
                _verify_plan_artifacts(bundle, outcome.plan)
        except (EvidenceError, OSError) as exc:
            outcome = BackendOutcome(
                run_status=RunStatus.ERROR,
                diagnostics=outcome.diagnostics + (str(exc),),
                plan=(
                    outcome.plan if bundle.contains("comparison-plan.json") else None
                ),
                unit_results=outcome.unit_results,
                oracle_inventory=outcome.oracle_inventory,
                candidate_inventory=outcome.candidate_inventory,
            )

        report = aggregate_report(
            plan=outcome.plan,
            unit_results=outcome.unit_results,
            model_equivalent=outcome.model_equivalent,
            run_status=outcome.run_status,
            diagnostics=outcome.diagnostics,
            comparison_plan_path=(
                "comparison-plan.json" if bundle.contains("comparison-plan.json") else None
            ),
            manifest_path="manifest.json",
            invalid_input=outcome.invalid_input,
        )

        bundle.write_json("timings.json", timings.document(), kind="timing-evidence")
        bundle.write_json("report.json", report_json(report), kind="public-report")
        bundle.write_json("summary.json", summary_json(report), kind="public-summary")
        _write_replay(bundle, args.timeout, args.defer_health)
        _write_indexes(bundle)
        bundle.write_hash_index()
        bundle.seal(
            metadata={
                "run_status": report.run_status.value,
                "result": report.result.value if report.result is not None else None,
                "comparison_verdict": report.comparison_verdict.value,
                "entrypoint": invocation,
            }
        )
        write_compact_output(
            staging=bundle.root,
            destination=args.output_dir,
            oracle=args.oracle,
            candidate=args.candidate,
            invocation=invocation,
            cwd=Path.cwd(),
            timeout=args.timeout,
            checker_root=Path(__file__).resolve().parents[2],
        )
        staging_context.cleanup()
        token = (
            RunStatus.ERROR.value
            if report.run_status is RunStatus.ERROR
            else report.comparison_verdict.value
        )
        return exit_code(report), token, report.diagnostics
    except Exception as exc:
        # Temporary staging is discarded; any compact files already written are
        # left in place so the failure is visible and never silently overwritten.
        staging_context.cleanup()
        return 3, RunStatus.ERROR.value, (f"{type(exc).__name__}: {exc}",)


def main(
    argv: Sequence[str] | None = None, *, backend: ComparisonBackend | None = None
) -> int:
    args = build_parser().parse_args(argv)
    if args.command != "compare":  # guarded by argparse, retained for typed callers
        raise AssertionError(f"unhandled command: {args.command}")
    code, token, diagnostics = _run_compare(args, backend)
    print(token)
    for diagnostic in diagnostics:
        print(diagnostic, file=sys.stderr)
    return code
