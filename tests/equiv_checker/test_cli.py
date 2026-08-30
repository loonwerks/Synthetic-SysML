import contextlib
from dataclasses import replace
import hashlib
import io
import json
from pathlib import Path
import subprocess
import tempfile
import unittest

from equiv_checker.cli import (
    BackendOutcome,
    _archive_checker_sources,
    _inventory_certifies_no_contracts,
    _verify_checker_sources,
    _verify_model_artifact,
    _verify_plan_artifacts,
    main,
)
from equiv_checker.evidence import EvidenceBundle, EvidenceError
from equiv_checker.model_gate import MODEL_FINGERPRINT_POLICY
from equiv_checker.schema import (
    AtomicVCResult,
    ComparisonPlan,
    ComparisonUnit,
    ModelFingerprint,
    NormalizedType,
    Observation,
    ObservationRole,
    PredicateBinding,
    RunStatus,
    UnitClassification,
    UnitKind,
    UnitResult,
    VCStatus,
)


VC_NAMES = ("A* -> A", "A* & G -> G*", "A -> A*", "A & G* -> G")


def _sha256(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest()


class MockBackend:
    def __init__(self, classification: UnitClassification = UnitClassification.EQUIVALENT):
        self.classification = classification

    def compare(self, request, evidence):
        plan, unit = self._model(request, evidence)
        statuses = [VCStatus.VERIFIED] * 4
        if self.classification is UnitClassification.CANDIDATE_WEAKER:
            statuses[0] = VCStatus.COUNTEREXAMPLE
        elif self.classification is UnitClassification.CANDIDATE_STRONGER:
            statuses[2] = VCStatus.COUNTEREXAMPLE
        elif self.classification is UnitClassification.INCOMPARABLE:
            statuses[0] = VCStatus.COUNTEREXAMPLE
            statuses[2] = VCStatus.COUNTEREXAMPLE
        vcs = []
        for index, (name, status) in enumerate(zip(VC_NAMES, statuses, strict=True)):
            validity = evidence.write_text(
                f"proofs/vc-{index}.scala", name + "\n", kind="proof-source"
            )
            witness = None
            if status is VCStatus.COUNTEREXAMPLE:
                witness = evidence.write_text(
                    f"proofs/vc-{index}-witness.log",
                    "SAT\n",
                    kind="proof-witness",
                )
            vcs.append(AtomicVCResult(name, name, status, validity, witness))
        health_paths = tuple(
            evidence.write_text(
                f"proofs/{name}.log", "VERIFIED\n", kind="proof-health"
            )
            for name in ("oracle-health", "candidate-health")
        )
        unit_result = UnitResult(
            unit_key=unit.key,
            classification=self.classification,
            atomic_vcs=tuple(vcs),
            oracle_health=VCStatus.VERIFIED,
            candidate_health=VCStatus.VERIFIED,
            oracle_health_evidence=(health_paths[0],),
            candidate_health_evidence=(health_paths[1],),
        )
        evidence.write_text("logs/backend.log", "ok\n", kind="log-tool")
        return BackendOutcome(
            run_status=RunStatus.COMPLETED,
            plan=plan,
            unit_results=(unit_result,),
            model_equivalent=True,
            oracle_inventory={"units": [unit.key]},
            candidate_inventory={"units": [unit.key]},
        )

    @staticmethod
    def _model(request, evidence, *, model_mismatch=False):
        def archive(label, projection):
            canonical = (
                json.dumps(
                    projection,
                    sort_keys=True,
                    separators=(",", ":"),
                    ensure_ascii=False,
                )
                + "\n"
            ).encode("utf-8")
            envelope = {
                "schema_version": "1.0.0",
                "policy": MODEL_FINGERPRINT_POLICY,
                "semantic_projection_sha256": hashlib.sha256(canonical).hexdigest(),
                "parser": "mock",
                "canonical_ast": projection,
            }
            return evidence.write_json(
                f"model/{label}.ast", envelope, kind="model-canonical-ast"
            )

        oracle_ast = archive("oracle", {"resolved_models": [{"package": "P"}]})
        candidate_ast = archive(
            "candidate",
            {
                "resolved_models": [
                    {"package": "Different" if model_mismatch else "P"}
                ]
            },
        )
        canonical_sha256 = _sha256(evidence.root / oracle_ast)
        fingerprint = ModelFingerprint(
            _sha256(request.archived_oracle),
            oracle_ast,
            canonical_sha256,
            f"mock; {MODEL_FINGERPRINT_POLICY}",
        )
        candidate_fingerprint = ModelFingerprint(
            _sha256(request.archived_candidate),
            candidate_ast,
            _sha256(evidence.root / candidate_ast),
            f"mock; {MODEL_FINGERPRINT_POLICY}",
        )
        unit = ComparisonUnit(
            key="root::P::Root/component::controller.compute",
            kind=UnitKind.COMPUTE,
            root="P::Root",
            instance_path="root.controller",
            classifier="P::Controller",
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
        )
        plan = ComparisonPlan(
            oracle_input=str(request.oracle),
            candidate_input=str(request.candidate),
            oracle_fingerprint=fingerprint,
            candidate_fingerprint=candidate_fingerprint,
            roots=("P::Root",),
            types=(),
            units=(unit,),
            coverage_complete=True,
        )
        return plan, unit


class ModelMismatchBackend(MockBackend):
    def compare(self, request, evidence):
        plan, unit = self._model(request, evidence, model_mismatch=True)
        plan = replace(
            plan,
            units=(),
            coverage_complete=False,
            coverage_gaps=("resolved model mismatch",),
        )
        return BackendOutcome(
            run_status=RunStatus.COMPLETED,
            plan=plan,
            model_equivalent=False,
            oracle_inventory={"units": [unit.key]},
            candidate_inventory={"units": []},
        )


class InconclusiveBackend:
    def compare(self, request, evidence):
        evidence.write_text("logs/unsupported.log", "stateful\n", kind="log-coverage")
        return BackendOutcome(
            run_status=RunStatus.INCONCLUSIVE,
            diagnostics=("stateful contracts are unsupported",),
        )


class BrokenBackend:
    def compare(self, request, evidence):
        raise RuntimeError("injected tool failure")


class ProofAfterMismatchBackend(MockBackend):
    def compare(self, request, evidence):
        plan, unit = self._model(request, evidence, model_mismatch=True)
        plan = replace(
            plan,
            units=(),
            coverage_complete=False,
            coverage_gaps=("resolved model mismatch",),
        )
        evidence.write_text(
            "proofs/should-not-exist.scala", "proof\n", kind="proof-source"
        )
        return BackendOutcome(
            run_status=RunStatus.COMPLETED,
            plan=plan,
            model_equivalent=False,
            oracle_inventory={"units": [unit.key]},
            candidate_inventory={"units": []},
        )


class CliTest(unittest.TestCase):
    def _invoke(self, root: Path, backend, *extra_args: str):
        oracle = root / "oracle.sysml"
        candidate = root / "candidate.sysml"
        output = root / "results"
        oracle.write_text("package P;\n", encoding="utf-8")
        candidate.write_text("package P;\n", encoding="utf-8")
        stdout = io.StringIO()
        stderr = io.StringIO()
        with contextlib.redirect_stdout(stdout), contextlib.redirect_stderr(stderr):
            code = main(
                [
                    "compare",
                    "--oracle",
                    str(oracle),
                    "--candidate",
                    str(candidate),
                    "--output-dir",
                    str(output),
                    "--timeout",
                    "7",
                    *extra_args,
                ],
                backend=backend,
            )
        return code, stdout.getvalue(), stderr.getvalue(), output

    def test_defer_health_reaches_backend_and_replay(self):
        class InspectBackend(MockBackend):
            deferred = False

            def compare(self, request, evidence):
                self.deferred = not request.run_health_checks
                return super().compare(request, evidence)

        backend = InspectBackend()
        with tempfile.TemporaryDirectory() as temporary:
            code, _, _, output = self._invoke(
                Path(temporary), backend, "--defer-health"
            )
            self.assertEqual(0, code)
            self.assertTrue(backend.deferred)
            self.assertIn(
                "--defer-health",
                (output / "replay.sh").read_text(encoding="utf-8"),
            )

    def test_equivalent_stdout_exit_and_replayable_bundle(self):
        with tempfile.TemporaryDirectory() as temporary:
            code, stdout, stderr, output = self._invoke(
                Path(temporary), MockBackend()
            )
            self.assertEqual(0, code)
            self.assertEqual("EQUIVALENT\n", stdout)
            self.assertEqual("", stderr)
            for relative in (
                "result.json",
                "comparison-breakdown.json",
                "verification.json",
                "timings.json",
                "replay.sh",
            ):
                self.assertTrue((output / relative).is_file(), relative)
            result = json.loads((output / "result.json").read_text(encoding="utf-8"))
            self.assertEqual("COMPLETED", result["run_status"])
            self.assertEqual("EQUIVALENT", result["result"])
            self.assertEqual("EQUIVALENT", result["comparison_verdict"])
            self.assertEqual("PASSED", result["oracle_health"])
            self.assertEqual("PASSED", result["candidate_health"])
            self.assertEqual("inputs/oracle.sysml", result["inputs"]["oracle"])
            self.assertEqual("comparison-breakdown.json", result["comparison_breakdown"])
            self.assertFalse((output / "manifest.json").exists())
            self.assertTrue((output / "inputs/oracle.sysml").is_file())
            self.assertTrue((output / "inputs/candidate.sysml").is_file())
            self.assertFalse((output / "inventories").exists())
            self.assertFalse((output / "checker-snapshot").exists())
            replay = (output / "replay.sh").read_text(encoding="utf-8")
            self.assertIn('${RESULT_DIR}.replay', replay)
            self.assertIn('$RESULT_DIR/inputs/oracle.sysml', replay)
            self.assertNotIn(str(Path(temporary)), replay)
            self.assertNotIn("--proof-engine", replay)
            self.assertNotIn("--proof-jobs", replay)
            retained_text = "\n".join(
                path.read_text(encoding="utf-8", errors="replace")
                for path in output.rglob("*")
                if path.is_file() and path.suffix in {".json", ".log", ".sh"}
            )
            self.assertNotIn(str(Path(temporary)), retained_text)
            repository = Path(__file__).resolve().parents[2]
            self.assertNotIn(str(repository), retained_text)
            self.assertNotIn("/home/", retained_text)
            timings = json.loads((output / "timings.json").read_text(encoding="utf-8"))
            self.assertGreaterEqual(timings["overall_elapsed_seconds"], 0)
            self.assertIn("backend-total", timings["stage_totals_seconds"])
            syntax = subprocess.run(
                ["sh", "-n", str(output / "replay.sh")],
                text=True,
                stdout=subprocess.PIPE,
                stderr=subprocess.PIPE,
                check=False,
            )
            self.assertEqual(0, syntax.returncode, syntax.stderr)

    def test_verified_difference_is_the_only_other_semantic_stdout(self):
        with tempfile.TemporaryDirectory() as temporary:
            code, stdout, _, output = self._invoke(
                Path(temporary), MockBackend(UnitClassification.CANDIDATE_WEAKER)
            )
            self.assertEqual(1, code)
            self.assertEqual("CANDIDATE_WEAKER\n", stdout)
            result = json.loads((output / "result.json").read_text(encoding="utf-8"))
            self.assertEqual("CANDIDATE_WEAKER", result["comparison_verdict"])
            affected = result["affected_units"][0]
            self.assertEqual("root.controller", affected["owner_instance"])
            self.assertEqual("CANDIDATE_WEAKER", affected["classification"])

        for classification in (
            UnitClassification.CANDIDATE_STRONGER,
            UnitClassification.INCOMPARABLE,
        ):
            with tempfile.TemporaryDirectory() as temporary:
                code, stdout, _, output = self._invoke(
                    Path(temporary), MockBackend(classification)
                )
                self.assertEqual(1, code)
                self.assertEqual(classification.value + "\n", stdout)
                result = json.loads(
                    (output / "result.json").read_text(encoding="utf-8")
                )
                self.assertEqual(classification.value, result["comparison_verdict"])

    def test_model_mismatch_finishes_without_unit_proofs(self):
        with tempfile.TemporaryDirectory() as temporary:
            code, stdout, _, output = self._invoke(Path(temporary), ModelMismatchBackend())
            self.assertEqual(2, code)
            self.assertEqual("INVALID_INPUT\n", stdout)
            result = json.loads((output / "result.json").read_text(encoding="utf-8"))
            self.assertEqual([], result["unit_results"])
            self.assertEqual("INVALID_INPUT", result["comparison_verdict"])
            self.assertFalse((output / "proofs").exists())

    def test_model_mismatch_backend_must_short_circuit_before_proof(self):
        with tempfile.TemporaryDirectory() as temporary:
            code, stdout, stderr, output = self._invoke(
                Path(temporary), ProofAfterMismatchBackend()
            )
            self.assertEqual(3, code)
            self.assertEqual("ERROR\n", stdout)
            self.assertIn("proof artifacts after a model mismatch", stderr)
            result = json.loads((output / "result.json").read_text(encoding="utf-8"))
            self.assertEqual("ERROR", result["run_status"])
            self.assertIsNone(result["result"])

    def test_inconclusive_and_tool_failure_have_no_semantic_result(self):
        with tempfile.TemporaryDirectory() as temporary:
            code, stdout, stderr, output = self._invoke(
                Path(temporary), InconclusiveBackend()
            )
            self.assertEqual(2, code)
            self.assertEqual("INCONCLUSIVE\n", stdout)
            self.assertIn("stateful", stderr)
            result = json.loads((output / "result.json").read_text(encoding="utf-8"))
            self.assertIsNone(result["result"])

        with tempfile.TemporaryDirectory() as temporary:
            code, stdout, stderr, output = self._invoke(Path(temporary), BrokenBackend())
            self.assertEqual(3, code)
            self.assertEqual("ERROR\n", stdout)
            self.assertIn("injected tool failure", stderr)
            result = json.loads((output / "result.json").read_text(encoding="utf-8"))
            self.assertIsNone(result["result"])
            self.assertTrue((output / "errors.log").is_file())

    def test_nonempty_output_is_never_modified(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            output = root / "results"
            output.mkdir()
            marker = output / "keep.txt"
            marker.write_text("keep", encoding="utf-8")
            oracle = root / "oracle.sysml"
            candidate = root / "candidate.sysml"
            oracle.write_text("package P;\n", encoding="utf-8")
            candidate.write_text("package P;\n", encoding="utf-8")
            stdout = io.StringIO()
            stderr = io.StringIO()
            with contextlib.redirect_stdout(stdout), contextlib.redirect_stderr(stderr):
                code = main(
                    [
                        "compare",
                        "--oracle",
                        str(oracle),
                        "--candidate",
                        str(candidate),
                        "--output-dir",
                        str(output),
                    ],
                    backend=MockBackend(),
                )
            self.assertEqual(2, code)
            self.assertEqual("INCONCLUSIVE\n", stdout.getvalue())
            self.assertEqual("keep", marker.read_text(encoding="utf-8"))
            self.assertEqual([marker], list(output.iterdir()))

    def test_symlink_output_is_rejected_as_invalid_input(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            target = root / "target"
            target.mkdir()
            output = root / "results"
            output.symlink_to(target, target_is_directory=True)
            oracle = root / "oracle.sysml"
            candidate = root / "candidate.sysml"
            oracle.write_text("package P;\n", encoding="utf-8")
            candidate.write_text("package P;\n", encoding="utf-8")
            stdout = io.StringIO()
            stderr = io.StringIO()
            with contextlib.redirect_stdout(stdout), contextlib.redirect_stderr(stderr):
                code = main(
                    [
                        "compare",
                        "--oracle",
                        str(oracle),
                        "--candidate",
                        str(candidate),
                        "--output-dir",
                        str(output),
                    ],
                    backend=MockBackend(),
                )
            self.assertEqual(2, code)
            self.assertEqual("INCONCLUSIVE\n", stdout.getvalue())
            self.assertIn("must not be a symlink", stderr.getvalue())
            self.assertEqual([], list(target.iterdir()))

    def test_missing_input_does_not_create_output_directory(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            candidate = root / "candidate.sysml"
            candidate.write_text("package P;\n", encoding="utf-8")
            output = root / "results"
            stdout = io.StringIO()
            stderr = io.StringIO()
            with contextlib.redirect_stdout(stdout), contextlib.redirect_stderr(stderr):
                code = main(
                    [
                        "compare",
                        "--oracle",
                        str(root / "missing.sysml"),
                        "--candidate",
                        str(candidate),
                        "--output-dir",
                        str(output),
                    ],
                    backend=MockBackend(),
                )
            self.assertEqual(2, code)
            self.assertEqual("INCONCLUSIVE\n", stdout.getvalue())
            self.assertIn("not a regular file", stderr.getvalue())
            self.assertFalse(output.exists())

    def test_plan_artifact_check_binds_datatype_predicate_to_neutral_carrier(self):
        with tempfile.TemporaryDirectory() as temporary:
            bundle = EvidenceBundle(Path(temporary) / "bundle")
            original = bundle.write_text(
                "generated/original.scala", "original\n", kind="generated-original"
            )
            neutral = bundle.write_text(
                "generated/neutral.scala", "neutral\n", kind="generated-neutral"
            )
            staged = bundle.write_text(
                "generated/staged.scala", "neutral\n", kind="generated-staged"
            )
            attestation = bundle.write_json(
                "generated/neutralization.json",
                {
                    "replacements": [
                        {
                            "side": "oracle",
                            "original_source": original,
                            "neutral_source": neutral,
                            "staged_source": staged,
                            "source_sha256": _sha256(bundle.root / original),
                            "neutral_sha256": _sha256(bundle.root / neutral),
                            "staged_sha256": _sha256(bundle.root / staged),
                            "preserved_predicate_sha256": {"D_Inv_D": "1" * 64},
                        }
                    ]
                },
                kind="generated-neutralization-attestation",
            )
            unit = ComparisonUnit(
                key="datatype::P::D::invariant",
                kind=UnitKind.DATATYPE_INVARIANT,
                root=None,
                instance_path=None,
                classifier="P::D",
                phase="invariant",
                observations=(
                    Observation("value", ObservationRole.VALUE, "D", "p.D", "p.D"),
                ),
                oracle=PredicateBinding(
                    "oracle",
                    None,
                    "p.D.D_Inv_D",
                    generated_source=staged,
                    generated_sha256=_sha256(bundle.root / staged),
                    synthetic_true_assumption=True,
                    assumption_observations=(),
                    guarantee_observations=("value",),
                ),
                candidate=PredicateBinding(
                    "candidate",
                    None,
                    None,
                    synthetic_true_assumption=True,
                    synthetic_true_guarantee=True,
                    assumption_observations=(),
                    guarantee_observations=("value",),
                ),
            )
            fingerprint = ModelFingerprint("0" * 64, "ast", "1" * 64, "test")
            plan = ComparisonPlan(
                "oracle.sysml",
                "candidate.sysml",
                fingerprint,
                fingerprint,
                ("P::Root",),
                (NormalizedType("D", "record", "D"),),
                (unit,),
                True,
                neutralization_evidence=(attestation,),
            )
            plan.validate()
            _verify_plan_artifacts(bundle, plan)
            bad = ComparisonPlan(
                **{
                    **plan.__dict__,
                    "units": (
                        ComparisonUnit(
                            **{
                                **unit.__dict__,
                                "oracle": PredicateBinding(
                                    **{
                                        **unit.oracle.__dict__,
                                        "generated_sha256": "f" * 64,
                                    }
                                ),
                            }
                        ),
                    ),
                }
            )
            with self.assertRaisesRegex(EvidenceError, "generated predicate hash"):
                _verify_plan_artifacts(bundle, bad)

    def test_model_artifact_check_recomputes_native_semantic_digest(self):
        with tempfile.TemporaryDirectory() as temporary:
            bundle = EvidenceBundle(Path(temporary) / "bundle")
            archived_input = bundle.root / bundle.write_text(
                "inputs/oracle.sysml", "package P;\n", kind="input-oracle"
            )
            artifact = bundle.write_json(
                "model/oracle.ast",
                {
                    "schema_version": "1.0.0",
                    "policy": MODEL_FINGERPRINT_POLICY,
                    "semantic_projection_sha256": "0" * 64,
                    "parser": "mock",
                    "canonical_ast": {"resolved_models": [{"package": "P"}]},
                },
                kind="model-canonical-ast",
            )
            fingerprint = ModelFingerprint(
                _sha256(archived_input),
                artifact,
                _sha256(bundle.root / artifact),
                f"mock; {MODEL_FINGERPRINT_POLICY}",
            )
            with self.assertRaisesRegex(EvidenceError, "semantic digest"):
                _verify_model_artifact(bundle, fingerprint, archived_input)

    def test_empty_plan_inventory_certificate_rejects_hidden_contracts(self):
        empty = {
            "declared_clause_count": 0,
            "supported_clause_count": 0,
            "clauses": [],
            "contract_owners": [],
            "coverage_gaps": [],
        }
        self.assertTrue(_inventory_certifies_no_contracts(empty))
        for changed in (
            {"declared_clause_count": 1},
            {"supported_clause_count": 1},
            {"clauses": [{"id": "G"}]},
            {"contract_owners": [{"classifier": "C"}]},
            {"coverage_gaps": ["unrepresented contract"]},
        ):
            self.assertFalse(_inventory_certifies_no_contracts(empty | changed))

    def test_bundle_pins_checker_source_snapshot(self):
        with tempfile.TemporaryDirectory() as temporary:
            bundle = EvidenceBundle(Path(temporary) / "bundle")
            records = _archive_checker_sources(bundle)
            _verify_checker_sources(bundle, records)
            manifest = json.loads(
                (bundle.root / "checker-snapshot/manifest.json").read_text(
                    encoding="utf-8"
                )
            )
            sources = {item["source"] for item in manifest["files"]}
            self.assertIn("src/equiv_checker/proof.py", sources)
            self.assertIn("src/equiv_checker/adapters/GumboInventory.scala", sources)
            self.assertIn("src/sysml_tools/gumbo.py", sources)
            self.assertIn("src/sysml_tools/tools/SysmlGumboSpans.java", sources)


if __name__ == "__main__":
    unittest.main()
