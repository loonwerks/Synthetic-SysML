from pathlib import Path
from dataclasses import replace
import hashlib
import json
import shutil
import tempfile
from types import SimpleNamespace
import unittest
from unittest import mock

from equiv_checker.proof import (
    ATOMIC_VCS,
    LogikaRun,
    Obligation,
    ResidentLogikaBackend,
    ToolOutcome,
    atomic_status,
    classify_unit,
    execute_atomic_obligations,
    execute_unit_proof,
    EvidenceVerificationError,
    execute_many,
    interpret_logika,
    verify_unit_evidence,
)
from equiv_checker.schema import (
    ComparisonUnit,
    NormalizedType,
    Observation,
    ObservationRole,
    PredicateBinding,
    UnitClassification,
    UnitKind,
    VCStatus,
)
from equiv_checker.slang_proof import generate_unit_proof


class _Backend:
    def __init__(self, outcomes):
        self.outcomes = iter(outcomes)
        self.calls = []

    def run(self, *, project, source, mode, timeout):
        self.calls.append((source.name, mode))
        outcome = next(self.outcomes)
        command = ["sireum", "proyek", "logika", "--verbose"]
        if mode == "sat":
            command.append("--sat")
        command.extend((str(project), str(source)))
        output = {
            ToolOutcome.VERIFIED: f"Verifying files:\n* {source}\n\nLogika verified!",
            ToolOutcome.SAT: f"Verifying files:\n* {source}\n\nLogika verified!",
            ToolOutcome.REJECTED: (
                f"Verifying files:\n* {source}\n\n"
                "Could not deduce that the postcondition holds"
            ),
            ToolOutcome.UNSAT: "Could not deduce that the assumption is satisfiable",
            ToolOutcome.TIMEOUT: "Timed out",
            ToolOutcome.TOOL_ERROR: "internal error",
        }.get(outcome, outcome.value)
        exit_code = 0 if outcome in {ToolOutcome.VERIFIED, ToolOutcome.SAT} else 1
        return LogikaRun(tuple(command), mode, outcome, exit_code, output)


class ProofTest(unittest.TestCase):
    def test_resident_backend_stops_worker_before_ram_floor(self):
        backend = ResidentLogikaBackend(
            Path("/bin/true"), minimum_available_memory_fraction=0.25
        )
        process = mock.Mock()
        process.poll.return_value = None
        backend._process = process
        with (
            mock.patch(
                "equiv_checker.proof._available_memory_fraction",
                return_value=0.20,
            ),
            mock.patch.object(backend, "_signal_process_group") as stop_group,
            self.assertRaisesRegex(RuntimeError, "stopped to preserve RAM"),
        ):
            backend._next_line(1)
        stop_group.assert_called_once_with(process, mock.ANY)
        backend._process = None

    def test_resident_backend_removes_descendants_after_graceful_quit(self):
        backend = ResidentLogikaBackend(Path("/bin/true"))
        process = mock.Mock()
        process.poll.return_value = None
        backend._process = process
        with mock.patch.object(backend, "_signal_process_group") as stop_group:
            backend._stop()
        stop_group.assert_called_once_with(process, mock.ANY)
        process.stdin.write.assert_called_once_with("QUIT\n")

    def test_resident_backend_can_release_memory_after_each_request(self):
        class _Input:
            def write(self, _value):
                return None

            def flush(self):
                return None

        with tempfile.TemporaryDirectory() as temporary:
            project = Path(temporary)
            source = project / "src/main/Proof.scala"
            source.parent.mkdir(parents=True)
            source.write_text("// proof\n", encoding="utf-8")
            source_hash = hashlib.sha256(source.read_bytes()).hexdigest()
            backend = ResidentLogikaBackend(
                Path("/bin/true"), restart_after_run=True
            )
            backend._process = SimpleNamespace(stdin=_Input())
            result_line = (
                "GUMBO_LOGIKA_RESULT\tproof-0001\t0\t1\t1\t0\t0\t"
                + source_hash
            )
            with (
                mock.patch.object(backend, "_start"),
                mock.patch.object(backend, "_next_line", return_value=result_line),
                mock.patch.object(backend, "_stop") as stop,
            ):
                backend.run(
                    project=project, source=source, mode="valid", timeout=1
                )
            stop.assert_called_once_with()
            backend._process = None

    def test_rejection_requires_confirmed_sat_complement(self):
        self.assertEqual(
            VCStatus.COUNTEREXAMPLE,
            atomic_status(ToolOutcome.REJECTED, ToolOutcome.SAT),
        )
        self.assertEqual(
            VCStatus.UNKNOWN,
            atomic_status(ToolOutcome.REJECTED, ToolOutcome.UNSAT),
        )
        self.assertEqual(
            VCStatus.TOOL_ERROR,
            atomic_status(ToolOutcome.REJECTED, ToolOutcome.TOOL_ERROR),
        )

    def test_four_way_classification_is_independent_of_health(self):
        def classified(values):
            return classify_unit(atomic_vcs=dict(zip(ATOMIC_VCS, values)))

        v = VCStatus.VERIFIED
        c = VCStatus.COUNTEREXAMPLE
        self.assertEqual(UnitClassification.EQUIVALENT, classified((v, v, v, v)))
        self.assertEqual(UnitClassification.CANDIDATE_STRONGER, classified((v, v, c, v)))
        self.assertEqual(UnitClassification.CANDIDATE_WEAKER, classified((c, v, v, v)))
        self.assertEqual(UnitClassification.INCOMPARABLE, classified((c, v, v, c)))
        self.assertEqual(
            UnitClassification.INCONCLUSIVE,
            classified((v, v, v, VCStatus.TIMEOUT)),
        )

    def test_complement_runs_only_when_validity_does_not_verify(self):
        backend = _Backend((ToolOutcome.VERIFIED, ToolOutcome.REJECTED, ToolOutcome.SAT))
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            for name in ("v1.scala", "s1.scala", "v2.scala", "s2.scala"):
                (root / name).write_text(name, encoding="utf-8")
            first = Obligation("u", ATOMIC_VCS[0], "f1", root / "v1.scala", root / "s1.scala")
            second = Obligation("u", ATOMIC_VCS[1], "f2", root / "v2.scala", root / "s2.scala")
            results = execute_atomic_obligations(
                backend=backend,
                project=root,
                obligations=(first, second),
                timeout=1,
                evidence_dir=root / "evidence",
            )
        self.assertEqual(VCStatus.VERIFIED, results[0].status)
        self.assertEqual(VCStatus.COUNTEREXAMPLE, results[1].status)
        self.assertEqual(
            [("v1.scala", "valid"), ("v2.scala", "valid"), ("s2.scala", "sat")],
            backend.calls,
        )

    def test_generated_complement_is_materialized_only_after_rejection(self):
        backend = _Backend((ToolOutcome.REJECTED, ToolOutcome.SAT))
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            validity = root / "valid.scala"
            complement = root / "complement.scala"
            validity.write_text("valid", encoding="utf-8")
            obligation = Obligation(
                "u",
                ATOMIC_VCS[0],
                "f",
                validity,
                complement,
                "lazy complement",
            )
            self.assertFalse(complement.exists())
            result = execute_atomic_obligations(
                backend=backend,
                project=root,
                obligations=(obligation,),
                timeout=1,
                evidence_dir=root / "evidence",
            )[0]
            self.assertEqual("lazy complement", complement.read_text(encoding="utf-8"))
        self.assertEqual(VCStatus.COUNTEREXAMPLE, result.status)

    def test_timeout_does_not_trigger_a_complement_search(self):
        backend = _Backend((ToolOutcome.TIMEOUT,))
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            (root / "v.scala").write_text("valid", encoding="utf-8")
            (root / "s.scala").write_text("sat", encoding="utf-8")
            obligation = Obligation(
                "u", ATOMIC_VCS[0], "f", root / "v.scala", root / "s.scala"
            )
            result = execute_atomic_obligations(
                backend=backend,
                project=root,
                obligations=(obligation,),
                timeout=1,
                evidence_dir=root / "evidence",
            )[0]
        self.assertEqual(VCStatus.TIMEOUT, result.status)
        self.assertEqual([("v.scala", "valid")], backend.calls)

    def test_execute_unit_requires_both_health_checks_and_records_evidence(self):
        enum = NormalizedType(
            "mode", "enum", "mode", literals=("On", "Off"),
            oracle_type="p.Mode.Type", candidate_type="p.Mode.Type",
            oracle_enum_owner="p.Mode", candidate_enum_owner="p.Mode",
        )
        oracle = PredicateBinding(
            "oracle", None, "p.G.g", synthetic_true_assumption=True,
            assumption_observations=(), guarantee_observations=("out",),
        )
        candidate = PredicateBinding(
            "candidate", None, "p.G.g", synthetic_true_assumption=True,
            assumption_observations=(), guarantee_observations=("out",),
        )
        unit = ComparisonUnit(
            "u", UnitKind.COMPUTE, "R", "c", "C", "compute",
            (Observation("out", ObservationRole.OUTPUT, "mode", "p.Mode.Type", "p.Mode.Type"),),
            oracle, candidate,
        )
        outcomes = (
            *(ToolOutcome.VERIFIED for _ in range(6)),
            *(ToolOutcome.SAT for _ in range(2)),
        )
        backend = _Backend(outcomes)
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            generated = generate_unit_proof(unit, {"mode": enum}, root / "proofs")
            result = execute_unit_proof(
                backend=backend,
                project=root,
                proof=generated,
                timeout=1,
                evidence_dir=root / "evidence" / "unit",
                evidence_base=root,
            )
            verified = verify_unit_evidence(
                project=root,
                proof=generated,
                result=result,
                evidence_base=root,
            )
            self.assertEqual("u", verified.unit_key)
        self.assertEqual(UnitClassification.EQUIVALENT, result.classification)
        self.assertEqual(2, len(result.oracle_health_evidence))
        self.assertEqual(2, len(result.candidate_health_evidence))
        self.assertFalse(Path(result.oracle_health_evidence[0]).is_absolute())

    def test_execute_unit_can_defer_health_without_losing_generated_sources(self):
        enum = NormalizedType(
            "mode", "enum", "mode", literals=("On", "Off"),
            oracle_type="p.Mode.Type", candidate_type="p.Mode.Type",
            oracle_enum_owner="p.Mode", candidate_enum_owner="p.Mode",
        )
        binding = PredicateBinding(
            "oracle", None, "p.G.g", synthetic_true_assumption=True,
            assumption_observations=(), guarantee_observations=("out",),
        )
        candidate = replace(binding, side="candidate")
        unit = ComparisonUnit(
            "u", UnitKind.COMPUTE, "R", "c", "C", "compute",
            (Observation("out", ObservationRole.OUTPUT, "mode", "p.Mode.Type", "p.Mode.Type"),),
            binding, candidate,
        )
        backend = _Backend((ToolOutcome.VERIFIED,) * 4)
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            generated = generate_unit_proof(unit, {"mode": enum}, root / "proofs")
            self.assertEqual(4, len(generated.health))
            self.assertTrue(any(item.source is not None for item in generated.health))
            result = execute_unit_proof(
                backend=backend,
                project=root,
                proof=generated,
                timeout=1,
                evidence_dir=root / "evidence" / "unit",
                evidence_base=root,
                run_health_checks=False,
            )
            verify_unit_evidence(
                project=root,
                proof=generated,
                result=result,
                evidence_base=root,
                health_deferred=True,
            )
        self.assertEqual(UnitClassification.EQUIVALENT, result.classification)
        self.assertEqual(VCStatus.NOT_RUN, result.oracle_health)
        self.assertEqual(VCStatus.NOT_RUN, result.candidate_health)
        self.assertEqual((), result.oracle_health_evidence)
        self.assertEqual((), result.candidate_health_evidence)
        self.assertEqual(4, len(backend.calls))

    def test_execute_many_never_uses_multi_source_backend(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            sources = tuple(root / f"v{index}.scala" for index in range(2))
            for source in sources:
                source.write_text("proof", encoding="utf-8")

            class NoBatchBackend(_Backend):
                def run_many(self, *, project, sources, mode, timeout):
                    raise AssertionError("execute_many must not invoke run_many")

            backend = NoBatchBackend(
                (ToolOutcome.VERIFIED, ToolOutcome.REJECTED)
            )
            runs = execute_many(
                backend=backend, project=root, sources=sources, mode="valid", timeout=1
            )
            self.assertEqual(2, len(runs))
            self.assertEqual(
                [("v0.scala", "valid"), ("v1.scala", "valid")],
                backend.calls,
            )
            self.assertEqual(ToolOutcome.VERIFIED, runs[sources[0]].outcome)
            self.assertEqual(ToolOutcome.REJECTED, runs[sources[1]].outcome)

    def test_verbose_attestation_rejects_silently_skipped_batch_source(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            first = root / "first.scala"
            second = root / "second.scala"
            first.write_text("proof", encoding="utf-8")
            second.write_text("false proof", encoding="utf-8")
            output = (
                "Parsing and type outlining files:\n"
                f"* {first}\n* {second}\n"
                "Verifying files:\n"
                f"* {first}\n\n"
                "Logika verified!"
            )
            self.assertEqual(
                ToolOutcome.TOOL_ERROR,
                interpret_logika(
                    mode="valid",
                    exit_code=0,
                    output=output,
                    requested_sources=(second,),
                ),
            )

    def test_current_invalid_postcondition_message_is_a_rejected_proof(self):
        with tempfile.TemporaryDirectory() as temporary:
            source = Path(temporary) / "proof.scala"
            source.write_text("proof", encoding="utf-8")
            output = (
                "Verifying files:\n"
                f"* {source}\n\n"
                f"* file://{source}\n"
                "  - [11, 20] Invalid postcondition\n"
            )
            self.assertEqual(
                ToolOutcome.REJECTED,
                interpret_logika(
                    mode="valid",
                    exit_code=1,
                    output=output,
                    requested_sources=(source,),
                ),
            )
            self.assertEqual(
                ToolOutcome.TOOL_ERROR,
                interpret_logika(
                    mode="sat",
                    exit_code=1,
                    output=output,
                    requested_sources=(source,),
                ),
            )

    def test_invalid_postcondition_requires_the_requested_source(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            requested = root / "requested.scala"
            other = root / "other.scala"
            requested.write_text("proof", encoding="utf-8")
            other.write_text("other", encoding="utf-8")
            output = (
                "Verifying files:\n"
                f"* {other}\n\n"
                "Invalid postcondition\n"
            )
            self.assertEqual(
                ToolOutcome.TOOL_ERROR,
                interpret_logika(
                    mode="valid",
                    exit_code=1,
                    output=output,
                    requested_sources=(requested,),
                ),
            )

    def test_type_error_wins_over_invalid_postcondition_text(self):
        with tempfile.TemporaryDirectory() as temporary:
            source = Path(temporary) / "proof.scala"
            source.write_text("proof", encoding="utf-8")
            output = (
                "Verifying files:\n"
                f"* {source}\n\n"
                "'missing' is not a member of type 'PostState'\n"
                "Invalid postcondition\n"
            )
            self.assertEqual(
                ToolOutcome.TOOL_ERROR,
                interpret_logika(
                    mode="valid",
                    exit_code=1,
                    output=output,
                    requested_sources=(source,),
                ),
            )

    def test_resident_timeout_message_round_trips_as_timeout(self):
        self.assertEqual(
            ToolOutcome.TIMEOUT,
            interpret_logika(
                mode="valid",
                exit_code=None,
                output="resident Logika worker timed out waiting for a response\n",
                requested_sources=(Path("proof.scala"),),
            ),
        )

    def test_attested_silent_validity_failure_runs_the_counterexample_check(self):
        with tempfile.TemporaryDirectory() as temporary:
            source = Path(temporary) / "proof.scala"
            source.write_text("proof", encoding="utf-8")
            output = f"Verifying files:\n* {source}\n\n"
            self.assertEqual(
                ToolOutcome.REJECTED,
                interpret_logika(
                    mode="valid",
                    exit_code=1,
                    output=output,
                    requested_sources=(source,),
                ),
            )
            self.assertEqual(
                ToolOutcome.TOOL_ERROR,
                interpret_logika(
                    mode="valid",
                    exit_code=1,
                    output="",
                    requested_sources=(source,),
                ),
            )

    def test_evidence_verifier_rejects_fabricated_and_swapped_logs(self):
        enum = NormalizedType(
            "mode", "enum", "mode", literals=("On", "Off"),
            oracle_type="p.Mode.Type", candidate_type="p.Mode.Type",
            oracle_enum_owner="p.Mode", candidate_enum_owner="p.Mode",
        )
        binding = PredicateBinding(
            "oracle", None, None,
            synthetic_true_assumption=True, synthetic_true_guarantee=True,
            assumption_observations=(), guarantee_observations=(),
        )
        unit = ComparisonUnit(
            "u", UnitKind.COMPUTE, "R", "c", "C", "compute", (),
            binding,
            PredicateBinding(
                "candidate", None, None,
                synthetic_true_assumption=True, synthetic_true_guarantee=True,
                assumption_observations=(), guarantee_observations=(),
            ),
        )
        backend = _Backend(
            (*(ToolOutcome.VERIFIED for _ in range(6)), *(ToolOutcome.SAT for _ in range(2)))
        )
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            generated = generate_unit_proof(unit, {"mode": enum}, root / "proofs")
            result = execute_unit_proof(
                backend=backend, project=root, proof=generated, timeout=1,
                evidence_dir=root / "evidence", evidence_base=root,
            )
            first = root / str(result.atomic_vcs[0].validity_evidence)
            second = root / str(result.atomic_vcs[1].validity_evidence)
            first_text, second_text = first.read_text(), second.read_text()
            first.write_text(second_text, encoding="utf-8")
            with self.assertRaisesRegex(EvidenceVerificationError, "source mismatch"):
                verify_unit_evidence(
                    project=root, proof=generated, result=result, evidence_base=root
                )
            first.write_text(first_text, encoding="utf-8")
            document = json.loads(first_text)
            document["command"].append(json.loads(second_text)["command"][-1])
            first.write_text(json.dumps(document), encoding="utf-8")
            with self.assertRaisesRegex(
                EvidenceVerificationError, "exactly one proof source"
            ):
                verify_unit_evidence(
                    project=root, proof=generated, result=result, evidence_base=root
                )
            document = json.loads(first_text)
            document["outcome"] = ToolOutcome.REJECTED.value
            first.write_text(json.dumps(document), encoding="utf-8")
            with self.assertRaisesRegex(EvidenceVerificationError, "disagrees with output"):
                verify_unit_evidence(
                    project=root, proof=generated, result=result, evidence_base=root
                )

    def test_evidence_records_reverify_after_bundle_relocation_and_reject_escape(self):
        oracle = PredicateBinding(
            "oracle", None, None,
            synthetic_true_assumption=True, synthetic_true_guarantee=True,
            assumption_observations=(), guarantee_observations=(),
        )
        candidate = PredicateBinding(
            "candidate", None, None,
            synthetic_true_assumption=True, synthetic_true_guarantee=True,
            assumption_observations=(), guarantee_observations=(),
        )
        unit = ComparisonUnit(
            "portable", UnitKind.COMPUTE, "R", "c", "C", "compute", (),
            oracle, candidate,
        )
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            bundle = root / "bundle"
            project = bundle / "generated/project"
            proof = generate_unit_proof(
                unit, {}, project / "src/main/bridge/equiv_checker/proofs/portable"
            )
            backend = _Backend(
                (
                    *(ToolOutcome.VERIFIED for _ in range(6)),
                    *(ToolOutcome.SAT for _ in range(2)),
                )
            )
            result = execute_unit_proof(
                backend=backend,
                project=project,
                proof=proof,
                timeout=1,
                evidence_dir=bundle / "logs/portable",
                evidence_base=bundle,
            )
            record_path = bundle / str(result.atomic_vcs[0].validity_evidence)
            record = json.loads(record_path.read_text(encoding="utf-8"))
            self.assertFalse(Path(record["project"]).is_absolute())
            self.assertFalse(Path(record["source"]).is_absolute())

            moved = root / "moved-bundle"
            shutil.copytree(bundle, moved)
            verified = verify_unit_evidence(
                project=moved / "generated/project",
                proof=proof,
                result=result,
                evidence_base=moved,
            )
            self.assertEqual("portable", verified.unit_key)

            moved_record = moved / str(result.atomic_vcs[0].validity_evidence)
            escaped = json.loads(moved_record.read_text(encoding="utf-8"))
            escaped["source"] = "../outside.scala"
            moved_record.write_text(json.dumps(escaped), encoding="utf-8")
            with self.assertRaisesRegex(EvidenceVerificationError, "escapes evidence bundle"):
                verify_unit_evidence(
                    project=moved / "generated/project",
                    proof=proof,
                    result=result,
                    evidence_base=moved,
                )


if __name__ == "__main__":
    unittest.main()
