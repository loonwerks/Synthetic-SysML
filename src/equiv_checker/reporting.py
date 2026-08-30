"""Fail-closed aggregation and public report construction."""

from __future__ import annotations

from collections import Counter
from typing import Iterable, Sequence

from .schema import (
    AffectedUnit,
    CheckerReport,
    ComparisonVerdict,
    ComparisonPlan,
    ComparisonUnit,
    HealthStatus,
    RunStatus,
    SemanticResult,
    UnitClassification,
    UnitResult,
    VCStatus,
    to_json,
)


_MISMATCH_CLASSIFICATIONS = {
    UnitClassification.CANDIDATE_STRONGER,
    UnitClassification.CANDIDATE_WEAKER,
    UnitClassification.INCOMPARABLE,
    UnitClassification.INVALID_CONTRACT,
}
_UNRESOLVED_VC = {VCStatus.UNKNOWN, VCStatus.TIMEOUT, VCStatus.NOT_RUN}
_CANDIDATE_REFINES = ("A* -> A", "A* & G -> G*")
_ORACLE_REFINES = ("A -> A*", "A & G* -> G")


def _unique(values: Iterable[str]) -> tuple[str, ...]:
    return tuple(dict.fromkeys(values))


def _affected(unit: ComparisonUnit, result: UnitResult) -> AffectedUnit:
    oracle_locations = tuple(
        clause.source for clause in unit.oracle_clauses if clause.source is not None
    )
    candidate_locations = tuple(
        clause.source for clause in unit.candidate_clauses if clause.source is not None
    )
    evidence = unit_evidence_paths(result)
    return AffectedUnit(
        unit_key=unit.key,
        owner_instance=unit.instance_path,
        classifier=unit.classifier,
        phase=unit.phase,
        classification=result.classification,
        failed_atomic_vcs=tuple(
            vc.name for vc in result.atomic_vcs if vc.status is VCStatus.COUNTEREXAMPLE
        ),
        oracle_clause_ids=tuple(clause.clause_id for clause in unit.oracle_clauses),
        oracle_trace_ids=_unique(
            trace for clause in unit.oracle_clauses for trace in clause.trace_ids
        ),
        candidate_clause_ids=tuple(clause.clause_id for clause in unit.candidate_clauses),
        candidate_trace_ids=_unique(
            trace for clause in unit.candidate_clauses for trace in clause.trace_ids
        ),
        oracle_locations=oracle_locations,
        candidate_locations=candidate_locations,
        evidence_paths=evidence,
    )


def unit_evidence_paths(result: UnitResult) -> tuple[str, ...]:
    """Return every bundle-relative artifact cited by a unit result."""

    atomic = tuple(
        path
        for vc in result.atomic_vcs
        for path in (vc.validity_evidence, vc.witness_evidence)
        if path is not None
    )
    return _unique(
        atomic
        + result.oracle_health_evidence
        + result.candidate_health_evidence
    )


def _status_report(
    status: RunStatus,
    diagnostics: Sequence[str],
    *,
    comparison_plan: str | None,
    manifest: str | None,
    unit_results: Sequence[UnitResult] = (),
    invalid_input: bool = False,
) -> CheckerReport:
    oracle_health, candidate_health = _aggregate_health(unit_results)
    report = CheckerReport(
        run_status=status,
        result=None,
        comparison_verdict=(
            ComparisonVerdict.INVALID_INPUT
            if invalid_input
            else ComparisonVerdict.INCONCLUSIVE
        ),
        oracle_health=oracle_health,
        candidate_health=candidate_health,
        breakdown_complete=False,
        affected_units=(),
        unit_results=tuple(unit_results),
        comparison_plan=comparison_plan,
        manifest=manifest,
        diagnostics=tuple(diagnostics),
    )
    report.validate()
    return report


def _direction(result: UnitResult, names: tuple[str, str]) -> VCStatus:
    by_name = {vc.name: vc.status for vc in result.atomic_vcs}
    statuses = tuple(by_name[name] for name in names)
    if all(status is VCStatus.VERIFIED for status in statuses):
        return VCStatus.VERIFIED
    if any(status is VCStatus.COUNTEREXAMPLE for status in statuses):
        return VCStatus.COUNTEREXAMPLE
    if any(status is VCStatus.TOOL_ERROR for status in statuses):
        return VCStatus.TOOL_ERROR
    if any(status is VCStatus.TIMEOUT for status in statuses):
        return VCStatus.TIMEOUT
    return VCStatus.UNKNOWN


def _expected_classification(result: UnitResult) -> UnitClassification:
    candidate = _direction(result, _CANDIDATE_REFINES)
    oracle = _direction(result, _ORACLE_REFINES)
    classifications = {
        (VCStatus.VERIFIED, VCStatus.VERIFIED): UnitClassification.EQUIVALENT,
        (
            VCStatus.VERIFIED,
            VCStatus.COUNTEREXAMPLE,
        ): UnitClassification.CANDIDATE_STRONGER,
        (
            VCStatus.COUNTEREXAMPLE,
            VCStatus.VERIFIED,
        ): UnitClassification.CANDIDATE_WEAKER,
        (
            VCStatus.COUNTEREXAMPLE,
            VCStatus.COUNTEREXAMPLE,
        ): UnitClassification.INCOMPARABLE,
    }
    return classifications.get((candidate, oracle), UnitClassification.INCONCLUSIVE)


def _aggregate_direction(
    results: Sequence[UnitResult], names: tuple[str, str]
) -> VCStatus:
    statuses = tuple(_direction(result, names) for result in results)
    if statuses and all(status is VCStatus.VERIFIED for status in statuses):
        return VCStatus.VERIFIED
    if any(status is VCStatus.COUNTEREXAMPLE for status in statuses):
        return VCStatus.COUNTEREXAMPLE
    if any(status is VCStatus.TOOL_ERROR for status in statuses):
        return VCStatus.TOOL_ERROR
    if any(status is VCStatus.TIMEOUT for status in statuses):
        return VCStatus.TIMEOUT
    return VCStatus.UNKNOWN


def comparison_verdict(results: Sequence[UnitResult]) -> ComparisonVerdict:
    """Aggregate the four comparison VCs without consulting contract health."""

    candidate = _aggregate_direction(results, _CANDIDATE_REFINES)
    oracle = _aggregate_direction(results, _ORACLE_REFINES)
    classifications = {
        (VCStatus.VERIFIED, VCStatus.VERIFIED): ComparisonVerdict.EQUIVALENT,
        (
            VCStatus.VERIFIED,
            VCStatus.COUNTEREXAMPLE,
        ): ComparisonVerdict.CANDIDATE_STRONGER,
        (
            VCStatus.COUNTEREXAMPLE,
            VCStatus.VERIFIED,
        ): ComparisonVerdict.CANDIDATE_WEAKER,
        (
            VCStatus.COUNTEREXAMPLE,
            VCStatus.COUNTEREXAMPLE,
        ): ComparisonVerdict.INCOMPARABLE,
    }
    return classifications.get(
        (candidate, oracle), ComparisonVerdict.INCONCLUSIVE
    )


def _side_health(results: Sequence[UnitResult], attribute: str) -> HealthStatus:
    statuses = tuple(getattr(result, attribute) for result in results)
    if statuses and all(status is VCStatus.NOT_RUN for status in statuses):
        return HealthStatus.NOT_CHECKED
    evidence_attribute = f"{attribute}_evidence"
    if any(
        status is not VCStatus.NOT_RUN
        and not getattr(result, evidence_attribute)
        for result, status in zip(results, statuses, strict=True)
    ):
        return HealthStatus.UNKNOWN
    if any(status is VCStatus.COUNTEREXAMPLE for status in statuses):
        return HealthStatus.FAILED
    if statuses and all(status is VCStatus.VERIFIED for status in statuses):
        return HealthStatus.PASSED
    return HealthStatus.UNKNOWN


def _aggregate_health(
    results: Sequence[UnitResult],
) -> tuple[HealthStatus, HealthStatus]:
    return (
        _side_health(results, "oracle_health"),
        _side_health(results, "candidate_health"),
    )


def aggregate_report(
    *,
    plan: ComparisonPlan | None,
    unit_results: Sequence[UnitResult],
    model_equivalent: bool | None,
    run_status: RunStatus = RunStatus.COMPLETED,
    diagnostics: Sequence[str] = (),
    comparison_plan_path: str | None = "comparison-plan.json",
    manifest_path: str | None = "manifest.json",
    invalid_input: bool = False,
) -> CheckerReport:
    """Aggregate backend-neutral unit results without inventing a verdict.

    ``model_equivalent=False`` is a complete ``MODEL_MISMATCH`` result and
    intentionally requires no proof units.  Unsupported coverage and solver
    uncertainty leave ``result`` unset.  A witnessed mismatch is enough for
    ``NOT_EQUIVALENT`` even when a different unit remains inconclusive; in that
    case ``breakdown_complete`` is false.
    """

    messages = list(diagnostics)
    results = tuple(unit_results)
    try:
        if plan is not None:
            plan.validate()
        for result in results:
            result.validate()
    except (AttributeError, TypeError, ValueError) as exc:
        messages.append(f"invalid backend comparison data: {exc}")
        return _status_report(
            RunStatus.ERROR,
            messages,
            comparison_plan=comparison_plan_path if plan is not None else None,
            manifest=manifest_path,
        )
    if run_status is not RunStatus.COMPLETED:
        return _status_report(
            run_status,
            messages,
            comparison_plan=comparison_plan_path if plan is not None else None,
            manifest=manifest_path,
            unit_results=results,
            invalid_input=invalid_input,
        )
    if model_equivalent is None:
        messages.append("backend did not produce a definitive model comparison")
        return _status_report(
            RunStatus.ERROR,
            messages,
            comparison_plan=comparison_plan_path if plan is not None else None,
            manifest=manifest_path,
            unit_results=results,
        )
    if not model_equivalent:
        if plan is None:
            messages.append("model mismatch has no comparison plan")
            return _status_report(
                RunStatus.ERROR,
                messages,
                comparison_plan=None,
                manifest=manifest_path,
                unit_results=results,
            )
        if plan.units:
            messages.append("model mismatch plan must not contain semantic proof units")
            return _status_report(
                RunStatus.ERROR,
                messages,
                comparison_plan=comparison_plan_path,
                manifest=manifest_path,
                unit_results=results,
            )
        if plan.oracle_fingerprint.parser != plan.candidate_fingerprint.parser:
            messages.append(
                "model mismatch fingerprints use different semantic authorities"
            )
            return _status_report(
                RunStatus.ERROR,
                messages,
                comparison_plan=comparison_plan_path,
                manifest=manifest_path,
                unit_results=results,
            )
        if (
            plan.oracle_fingerprint.canonical_ast_sha256
            == plan.candidate_fingerprint.canonical_ast_sha256
        ):
            messages.append("model mismatch fingerprints have identical canonical ASTs")
            return _status_report(
                RunStatus.ERROR,
                messages,
                comparison_plan=comparison_plan_path,
                manifest=manifest_path,
                unit_results=results,
            )
        if results:
            messages.append("model mismatch must short-circuit before unit proofs")
            return _status_report(
                RunStatus.ERROR,
                messages,
                comparison_plan=comparison_plan_path,
                manifest=manifest_path,
                unit_results=results,
            )
        report = CheckerReport(
            run_status=RunStatus.COMPLETED,
            result=SemanticResult.MODEL_MISMATCH,
            comparison_verdict=ComparisonVerdict.INVALID_INPUT,
            oracle_health=HealthStatus.UNKNOWN,
            candidate_health=HealthStatus.UNKNOWN,
            breakdown_complete=True,
            affected_units=(),
            unit_results=(),
            comparison_plan=comparison_plan_path if plan is not None else None,
            manifest=manifest_path,
            diagnostics=tuple(messages),
        )
        report.validate()
        return report
    if plan is None:
        messages.append("backend did not produce a comparison plan")
        return _status_report(
            RunStatus.ERROR,
            messages,
            comparison_plan=None,
            manifest=manifest_path,
            unit_results=results,
        )
    counts = Counter(result.unit_key for result in results)
    duplicates = sorted(key for key, count in counts.items() if count != 1)
    expected = {unit.key for unit in plan.units}
    actual = set(counts)
    extra = sorted(actual - expected)
    missing = sorted(expected - actual)
    if duplicates or extra or missing:
        if duplicates:
            messages.append(f"duplicate unit results: {duplicates}")
        if extra:
            messages.append(f"unexpected unit results: {extra}")
        if missing:
            messages.append(f"missing generated semantics/results: {missing}")
        return _status_report(
            RunStatus.ERROR,
            messages,
            comparison_plan=comparison_plan_path,
            manifest=manifest_path,
            unit_results=results,
        )

    by_key = {result.unit_key: result for result in results}
    ordered_results = tuple(by_key[unit.key] for unit in plan.units)
    tool_failure = False
    evaluator_error = False
    unresolved = (
        not plan.coverage_complete
        or bool(plan.coverage_gaps)
        or any(not item.supported for item in plan.types)
        or any(
            not unit.coverage_complete or bool(unit.unsupported_reasons)
            for unit in plan.units
        )
    )
    comparison_coverage_complete = not unresolved
    evidence_incomplete = False
    affected: list[AffectedUnit] = []

    if plan.coverage_gaps:
        messages.extend(f"coverage gap: {gap}" for gap in plan.coverage_gaps)
    for item in plan.types:
        if not item.supported:
            messages.append(
                f"unsupported normalized type: {item.key}: "
                f"{item.unsupported_reason or 'no reason supplied'}"
            )
    for unit in plan.units:
        if not unit.coverage_complete or unit.unsupported_reasons:
            reasons = unit.unsupported_reasons or ("coverage incomplete",)
            messages.extend(f"unsupported unit {unit.key}: {reason}" for reason in reasons)

    for unit in plan.units:
        result = by_key[unit.key]
        if len(result.atomic_vcs) != 4:
            evaluator_error = True
            messages.append(f"duplicate atomic VC results: {unit.key}")
            continue
        vc_statuses = {vc.status for vc in result.atomic_vcs}
        counterexamples = tuple(
            vc for vc in result.atomic_vcs if vc.status is VCStatus.COUNTEREXAMPLE
        )
        witnessed = tuple(
            vc
            for vc in counterexamples
            if vc.witness_evidence is not None
        )

        expected_classification = _expected_classification(result)
        if result.classification is not expected_classification:
            evaluator_error = True
            messages.append(
                "unit classification disagrees with comparison VC statuses: "
                f"{unit.key} (reported {result.classification.value}, "
                f"expected {expected_classification.value})"
            )

        for vc in result.atomic_vcs:
            if vc.status is VCStatus.VERIFIED and vc.validity_evidence is None:
                unresolved = True
                evidence_incomplete = True
                messages.append(
                    f"verified atomic VC lacks archived validity evidence: "
                    f"{unit.key}: {vc.name}"
                )

        if VCStatus.TOOL_ERROR in vc_statuses:
            tool_failure = True
            messages.append(f"proof tool failure: {unit.key}")
        if vc_statuses & _UNRESOLVED_VC:
            unresolved = True

        unit_mismatch = False
        if counterexamples and len(witnessed) != len(counterexamples):
            unresolved = True
            evidence_incomplete = True
            messages.append(f"counterexample lacks archived SAT evidence: {unit.key}")
        elif witnessed:
            unit_mismatch = True
        elif result.classification in _MISMATCH_CLASSIFICATIONS:
            unresolved = True
            messages.append(f"mismatch classification lacks a witnessed failed VC: {unit.key}")
        elif result.classification is UnitClassification.INCONCLUSIVE:
            unresolved = True

        if result.classification is UnitClassification.EQUIVALENT and any(
            vc.status is not VCStatus.VERIFIED for vc in result.atomic_vcs
        ):
            unresolved = True
            messages.append(f"equivalent classification has unresolved atomic VCs: {unit.key}")

        if unit_mismatch:
            affected.append(_affected(unit, result))

    verdict = (
        ComparisonVerdict.EQUIVALENT
        if not ordered_results
        else comparison_verdict(ordered_results)
    )
    if not comparison_coverage_complete or evidence_incomplete:
        verdict = ComparisonVerdict.INCONCLUSIVE
    if evaluator_error or (
        tool_failure and verdict is ComparisonVerdict.INCONCLUSIVE
    ):
        return _status_report(
            RunStatus.ERROR,
            messages,
            comparison_plan=comparison_plan_path,
            manifest=manifest_path,
            unit_results=ordered_results,
        )

    breakdown_complete = not unresolved
    if verdict is ComparisonVerdict.INCONCLUSIVE:
        return _status_report(
            RunStatus.INCONCLUSIVE,
            messages,
            comparison_plan=comparison_plan_path,
            manifest=manifest_path,
            unit_results=ordered_results,
        )
    semantic = (
        SemanticResult.EQUIVALENT
        if verdict is ComparisonVerdict.EQUIVALENT
        else SemanticResult.NOT_EQUIVALENT
    )
    oracle_health, candidate_health = _aggregate_health(ordered_results)

    report = CheckerReport(
        run_status=RunStatus.COMPLETED,
        result=semantic,
        comparison_verdict=verdict,
        oracle_health=oracle_health,
        candidate_health=candidate_health,
        breakdown_complete=breakdown_complete,
        affected_units=tuple(affected),
        unit_results=ordered_results,
        comparison_plan=comparison_plan_path,
        manifest=manifest_path,
        diagnostics=tuple(messages),
    )
    report.validate()
    return report


def summary_json(report: CheckerReport) -> dict[str, object]:
    """Return the deliberately short public summary document."""

    return {
        "schema_version": report.schema_version,
        "run_status": report.run_status.value,
        "result": report.result.value if report.result is not None else None,
        "comparison_verdict": report.comparison_verdict.value,
        "oracle_health": report.oracle_health.value,
        "candidate_health": report.candidate_health.value,
        "breakdown_complete": report.breakdown_complete,
        "affected_units": [to_json(unit) for unit in report.affected_units],
        "diagnostics": list(report.diagnostics),
        "report": "report.json",
        "manifest": report.manifest,
    }


def report_json(report: CheckerReport) -> dict[str, object]:
    return to_json(report)


def exit_code(report: CheckerReport) -> int:
    if report.run_status is RunStatus.ERROR:
        return 3
    if report.comparison_verdict in {
        ComparisonVerdict.INCONCLUSIVE,
        ComparisonVerdict.INVALID_INPUT,
    }:
        return 2
    if report.comparison_verdict is ComparisonVerdict.EQUIVALENT:
        return 0
    return 1
