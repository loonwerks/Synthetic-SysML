from dataclasses import replace
from pathlib import Path
import tempfile
import unittest

from equiv_checker.evidence import EvidenceBundle, EvidenceError, sha256_file
from equiv_checker.reporting import aggregate_report, exit_code
from equiv_checker.schema import (
    AtomicVCResult,
    ClauseProvenance,
    ComparisonVerdict,
    ComparisonPlan,
    ComparisonUnit,
    HealthStatus,
    ModelFingerprint,
    NormalizedType,
    PredicateBinding,
    RunStatus,
    SemanticResult,
    SourceLocation,
    UnitClassification,
    UnitKind,
    UnitResult,
    VCStatus,
)


VC_NAMES = ("A* -> A", "A* & G -> G*", "A -> A*", "A & G* -> G")


def plan(*keys: str, coverage_complete: bool = True) -> ComparisonPlan:
    fingerprint = ModelFingerprint("input", "model.ast", "canonical", "test-parser")
    units = tuple(
        ComparisonUnit(
            key=key,
            kind=UnitKind.COMPUTE,
            root="Example::Root",
            instance_path=f"root.controller{i}",
            classifier="Example::Controller",
            phase="compute",
            observations=(),
            oracle=PredicateBinding(
                "oracle",
                "A",
                "G",
                assumption_observations=(),
                guarantee_observations=(),
            ),
            candidate=PredicateBinding(
                "candidate",
                "A",
                "G",
                assumption_observations=(),
                guarantee_observations=(),
            ),
            oracle_clauses=(
                ClauseProvenance(
                    f"o{i}",
                    "guarantee",
                    (f"ORACLE-{i}",),
                    SourceLocation("oracle.sysml", i + 1, 3),
                ),
            ),
            candidate_clauses=(
                ClauseProvenance(
                    f"c{i}",
                    "guarantee",
                    (f"CANDIDATE-{i}",),
                    SourceLocation("candidate.sysml", i + 2, 4),
                ),
            ),
        )
        for i, key in enumerate(keys)
    )
    return ComparisonPlan(
        oracle_input="oracle.sysml",
        candidate_input="candidate.sysml",
        oracle_fingerprint=fingerprint,
        candidate_fingerprint=fingerprint,
        roots=("Example::Root",),
        types=(NormalizedType("Z", "scalar", "org.sireum.Z"),),
        units=units,
        coverage_complete=coverage_complete,
        coverage_gaps=() if coverage_complete else ("unsupported state",),
    )


def result(
    key: str,
    classification: UnitClassification,
    statuses: tuple[VCStatus, ...] | None = None,
    *,
    oracle_health: VCStatus = VCStatus.VERIFIED,
    candidate_health: VCStatus = VCStatus.VERIFIED,
) -> UnitResult:
    statuses = statuses or (VCStatus.VERIFIED,) * 4
    vcs = tuple(
        AtomicVCResult(
            name=name,
            formula=name,
            status=status,
            validity_evidence=f"proofs/{key}-{index}.scala",
            witness_evidence=(
                f"proofs/{key}-{index}-witness.log"
                if status is VCStatus.COUNTEREXAMPLE
                else None
            ),
        )
        for index, (name, status) in enumerate(zip(VC_NAMES, statuses, strict=True))
    )
    return UnitResult(
        unit_key=key,
        classification=classification,
        atomic_vcs=vcs,
        oracle_health=oracle_health,
        candidate_health=candidate_health,
        oracle_health_evidence=(f"proofs/{key}-oracle-health.log",),
        candidate_health_evidence=(f"proofs/{key}-candidate-health.log",),
    )


class ReportingTest(unittest.TestCase):
    def test_equivalent_and_model_mismatch_are_completed_results(self):
        equivalent = aggregate_report(
            plan=plan("u"),
            unit_results=(result("u", UnitClassification.EQUIVALENT),),
            model_equivalent=True,
        )
        self.assertEqual(RunStatus.COMPLETED, equivalent.run_status)
        self.assertEqual(SemanticResult.EQUIVALENT, equivalent.result)
        self.assertEqual(ComparisonVerdict.EQUIVALENT, equivalent.comparison_verdict)
        self.assertTrue(equivalent.breakdown_complete)
        self.assertEqual(0, exit_code(equivalent))

        mismatch_plan = plan()
        mismatch_plan = replace(
            mismatch_plan,
            candidate_fingerprint=replace(
                mismatch_plan.candidate_fingerprint,
                canonical_ast_sha256="different-canonical-model",
            ),
        )
        mismatch = aggregate_report(
            plan=mismatch_plan, unit_results=(), model_equivalent=False
        )
        self.assertEqual(SemanticResult.MODEL_MISMATCH, mismatch.result)
        self.assertEqual(ComparisonVerdict.INVALID_INPUT, mismatch.comparison_verdict)
        self.assertEqual(2, exit_code(mismatch))
        self.assertEqual((), mismatch.unit_results)

        invalid_mismatch = aggregate_report(
            plan=plan("u"),
            unit_results=(result("u", UnitClassification.EQUIVALENT),),
            model_equivalent=False,
        )
        self.assertEqual(RunStatus.ERROR, invalid_mismatch.run_status)
        self.assertIsNone(invalid_mismatch.result)

        identical_mismatch = aggregate_report(
            plan=plan(), unit_results=(), model_equivalent=False
        )
        self.assertEqual(RunStatus.ERROR, identical_mismatch.run_status)
        self.assertIsNone(identical_mismatch.result)

    def test_directional_combinations_are_not_equivalent(self):
        cases = {
            UnitClassification.CANDIDATE_STRONGER: (
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
                VCStatus.COUNTEREXAMPLE,
                VCStatus.VERIFIED,
            ),
            UnitClassification.CANDIDATE_WEAKER: (
                VCStatus.COUNTEREXAMPLE,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
            ),
            UnitClassification.INCOMPARABLE: (
                VCStatus.COUNTEREXAMPLE,
                VCStatus.VERIFIED,
                VCStatus.COUNTEREXAMPLE,
                VCStatus.VERIFIED,
            ),
        }
        for classification, statuses in cases.items():
            with self.subTest(classification=classification):
                report = aggregate_report(
                    plan=plan("u"),
                    unit_results=(result("u", classification, statuses),),
                    model_equivalent=True,
                )
                self.assertEqual(SemanticResult.NOT_EQUIVALENT, report.result)
                self.assertEqual(
                    ComparisonVerdict(classification.value),
                    report.comparison_verdict,
                )
                self.assertEqual(classification, report.affected_units[0].classification)
                self.assertEqual("root.controller0", report.affected_units[0].owner_instance)
                self.assertEqual(("o0",), report.affected_units[0].oracle_clause_ids)
                self.assertEqual(("ORACLE-0",), report.affected_units[0].oracle_trace_ids)

    def test_proved_mismatch_survives_other_inconclusive_unit(self):
        mismatch = result(
            "bad",
            UnitClassification.CANDIDATE_WEAKER,
            (
                VCStatus.COUNTEREXAMPLE,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
            ),
        )
        unknown = result(
            "unknown",
            UnitClassification.INCONCLUSIVE,
            (
                VCStatus.TIMEOUT,
                VCStatus.NOT_RUN,
                VCStatus.NOT_RUN,
                VCStatus.NOT_RUN,
            ),
        )
        report = aggregate_report(
            plan=plan("bad", "unknown"),
            unit_results=(unknown, mismatch),
            model_equivalent=True,
        )
        self.assertEqual(RunStatus.INCONCLUSIVE, report.run_status)
        self.assertEqual(ComparisonVerdict.INCONCLUSIVE, report.comparison_verdict)
        self.assertFalse(report.breakdown_complete)
        self.assertEqual((), report.affected_units)

    def test_counterexample_decides_direction_despite_another_timeout(self):
        weaker = result(
            "weaker",
            UnitClassification.CANDIDATE_WEAKER,
            (
                VCStatus.COUNTEREXAMPLE,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
            ),
        )
        timeout_same_direction = result(
            "timeout",
            UnitClassification.INCONCLUSIVE,
            (
                VCStatus.TIMEOUT,
                VCStatus.NOT_RUN,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
            ),
        )
        report = aggregate_report(
            plan=plan("weaker", "timeout"),
            unit_results=(timeout_same_direction, weaker),
            model_equivalent=True,
        )
        self.assertEqual(RunStatus.COMPLETED, report.run_status)
        self.assertEqual(ComparisonVerdict.CANDIDATE_WEAKER, report.comparison_verdict)
        self.assertFalse(report.breakdown_complete)

    def test_uncertainty_and_coverage_cannot_become_equivalent(self):
        timeout = result(
            "u",
            UnitClassification.INCONCLUSIVE,
            (VCStatus.TIMEOUT, VCStatus.NOT_RUN, VCStatus.NOT_RUN, VCStatus.NOT_RUN),
        )
        report = aggregate_report(
            plan=plan("u"), unit_results=(timeout,), model_equivalent=True
        )
        self.assertEqual(RunStatus.INCONCLUSIVE, report.run_status)
        self.assertIsNone(report.result)
        self.assertEqual(2, exit_code(report))

        uncovered = aggregate_report(
            plan=plan("u", coverage_complete=False),
            unit_results=(result("u", UnitClassification.EQUIVALENT),),
            model_equivalent=True,
        )
        self.assertEqual(RunStatus.INCONCLUSIVE, uncovered.run_status)
        self.assertIsNone(uncovered.result)

    def test_health_failure_is_reported_without_changing_comparison(self):
        oracle_bad = aggregate_report(
            plan=plan("u"),
            unit_results=(
                result(
                    "u",
                    UnitClassification.EQUIVALENT,
                    oracle_health=VCStatus.COUNTEREXAMPLE,
                    candidate_health=VCStatus.COUNTEREXAMPLE,
                ),
            ),
            model_equivalent=True,
        )
        self.assertEqual(RunStatus.COMPLETED, oracle_bad.run_status)
        self.assertEqual(ComparisonVerdict.EQUIVALENT, oracle_bad.comparison_verdict)
        self.assertEqual(HealthStatus.FAILED, oracle_bad.oracle_health)
        self.assertEqual(HealthStatus.FAILED, oracle_bad.candidate_health)

        candidate_bad = aggregate_report(
            plan=plan("u"),
            unit_results=(
                result(
                    "u",
                    UnitClassification.EQUIVALENT,
                    candidate_health=VCStatus.COUNTEREXAMPLE,
                ),
            ),
            model_equivalent=True,
        )
        self.assertEqual(ComparisonVerdict.EQUIVALENT, candidate_bad.comparison_verdict)
        self.assertEqual(HealthStatus.PASSED, candidate_bad.oracle_health)
        self.assertEqual(HealthStatus.FAILED, candidate_bad.candidate_health)

    def test_missing_results_and_unwitnessed_rejection_fail_closed(self):
        missing = aggregate_report(
            plan=plan("u"), unit_results=(), model_equivalent=True
        )
        self.assertEqual(RunStatus.ERROR, missing.run_status)

        unwitnessed = result(
            "u",
            UnitClassification.CANDIDATE_WEAKER,
            (
                VCStatus.COUNTEREXAMPLE,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
            ),
        )
        first = unwitnessed.atomic_vcs[0]
        bad_vc = AtomicVCResult(first.name, first.formula, first.status)
        unwitnessed = UnitResult(
            unwitnessed.unit_key,
            unwitnessed.classification,
            (bad_vc,) + unwitnessed.atomic_vcs[1:],
            unwitnessed.oracle_health,
            unwitnessed.candidate_health,
        )
        report = aggregate_report(
            plan=plan("u"), unit_results=(unwitnessed,), model_equivalent=True
        )
        self.assertEqual(RunStatus.INCONCLUSIVE, report.run_status)
        self.assertIsNone(report.result)

    def test_inconsistent_classification_fails_but_missing_health_is_separate(self):
        inconsistent = result(
            "u",
            UnitClassification.EQUIVALENT,
            (
                VCStatus.COUNTEREXAMPLE,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
                VCStatus.VERIFIED,
            ),
        )
        report = aggregate_report(
            plan=plan("u"), unit_results=(inconsistent,), model_equivalent=True
        )
        self.assertEqual(RunStatus.ERROR, report.run_status)
        self.assertIsNone(report.result)

        complete = result("u", UnitClassification.EQUIVALENT)
        no_health_evidence = UnitResult(
            unit_key=complete.unit_key,
            classification=complete.classification,
            atomic_vcs=complete.atomic_vcs,
            oracle_health=complete.oracle_health,
            candidate_health=complete.candidate_health,
        )
        report = aggregate_report(
            plan=plan("u"),
            unit_results=(no_health_evidence,),
            model_equivalent=True,
        )
        self.assertEqual(RunStatus.COMPLETED, report.run_status)
        self.assertEqual(ComparisonVerdict.EQUIVALENT, report.comparison_verdict)
        self.assertEqual(HealthStatus.UNKNOWN, report.oracle_health)
        self.assertEqual(HealthStatus.UNKNOWN, report.candidate_health)

    def test_evidence_bundle_is_write_once_and_records_hashes(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            source = root / "source.sysml"
            source.write_text("package P;\n", encoding="utf-8")
            bundle = EvidenceBundle(root / "results")
            relative = bundle.archive_copy(source, "inputs/oracle.sysml", kind="input")
            self.assertEqual(sha256_file(source), bundle.entries[0].sha256)
            self.assertEqual(
                bundle.entries[0].pre_execution_sha256,
                bundle.entries[0].post_execution_sha256,
            )
            with self.assertRaises(EvidenceError):
                bundle.archive_copy(source, relative, kind="input")
            bundle.write_hash_index()
            bundle.seal(metadata={"run_status": "COMPLETED"})
            with self.assertRaises(EvidenceError):
                bundle.write_text("late.txt", "late", kind="bad")

    def test_evidence_seal_rejects_hidden_or_mutated_files(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            bundle = EvidenceBundle(root / "hidden")
            bundle.path_for("logs/unregistered.log").write_text(
                "hidden\n", encoding="utf-8"
            )
            with self.assertRaises(EvidenceError):
                bundle.seal()

            changed = EvidenceBundle(root / "changed")
            relative = changed.write_text("logs/tool.log", "first\n", kind="log")
            (changed.root / relative).write_text("second\n", encoding="utf-8")
            with self.assertRaises(EvidenceError):
                changed.seal()


if __name__ == "__main__":
    unittest.main()
    HealthStatus,
