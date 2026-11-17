from __future__ import annotations

import importlib.util
import copy
import json
import sys
import tempfile
import unittest
from types import SimpleNamespace
from unittest import mock
from pathlib import Path


ROOT = Path(__file__).resolve().parents[2]
RUNNER_PATH = ROOT / "experiments" / "metarule-transfer" / "runner.py"
SPEC = importlib.util.spec_from_file_location("metarule_transfer_runner", RUNNER_PATH)
assert SPEC and SPEC.loader
runner = importlib.util.module_from_spec(SPEC)
sys.modules[SPEC.name] = runner
SPEC.loader.exec_module(runner)


class DefinitionTests(unittest.TestCase):
    def test_full_manifest_expands_exact_matrix(self) -> None:
        manifest = runner.load_manifest()
        train, user = runner.expand_cells(manifest)
        self.assertEqual(3, len(train))
        self.assertEqual(60, len(user))
        self.assertEqual(60, len({cell.cell_id for cell in user}))
        self.assertEqual(
            {"M0", "M-E", "M-EM", "M-EMH"},
            {cell.checkpoint for cell in user},
        )

    def test_heldout_schedule_is_complete_and_counterbalanced(self) -> None:
        manifest = runner.load_manifest()
        ordered = runner.counterbalanced_user_cells(manifest)
        self.assertEqual(60, len(ordered))
        self.assertEqual(60, len({cell.cell_id for cell in ordered}))
        self.assertEqual("cabin-air-quality-and-humidity-supervisor-small--M0", ordered[0].cell_id)
        first_wave = ordered[:15]
        counts = {
            checkpoint: sum(cell.checkpoint == checkpoint for cell in first_wave)
            for checkpoint in ("M0", "M-E", "M-EM", "M-EMH")
        }
        self.assertEqual({3, 4}, set(counts.values()))
        for dataset in {cell.dataset_id for cell in ordered}:
            positions = [index for index, cell in enumerate(ordered) if cell.dataset_id == dataset]
            self.assertEqual(4, len(positions))
            self.assertTrue(all(right - left == 15 for left, right in zip(positions, positions[1:])))

    def test_training_and_test_split_is_disjoint(self) -> None:
        manifest = runner.load_manifest()
        training = {item["id"] for item in manifest["datasets"] if item["role"] == "train"}
        held_out = {item["id"] for item in manifest["datasets"] if item["role"] == "test"}
        self.assertEqual(3, len(training))
        self.assertEqual(15, len(held_out))
        self.assertFalse(training & held_out)

    def test_baseline_removes_both_learned_sections(self) -> None:
        manifest = runner.load_manifest()
        source, _, _ = runner.assert_upstream(manifest)
        transformed = runner.baseline_gumbo_plan(source.read_text(encoding="utf-8"))
        self.assertNotIn("3) ENGLISH → GUMBO META-RULES", transformed)
        self.assertNotIn("4) FUNCTION-SPECIFIC RULES", transformed)
        self.assertEqual("", runner.validate_checkpoint_text(transformed, require_empty=True))
        self.assertIn("5) TRACEABILITY", transformed)

    def test_only_learned_region_may_vary_between_checkpoints(self) -> None:
        manifest = runner.load_manifest()
        source, _, _ = runner.assert_upstream(manifest)
        baseline = runner.baseline_gumbo_plan(source.read_text(encoding="utf-8"))
        proposed = baseline.replace(
            runner.LEARNED_BEGIN,
            runner.LEARNED_BEGIN + "\nMR-TEST-001: preserve boolean polarity",
            1,
        )
        base_before, base_rest = baseline.split(runner.LEARNED_BEGIN, 1)
        _, base_after = base_rest.split(runner.LEARNED_END, 1)
        new_before, new_rest = proposed.split(runner.LEARNED_BEGIN, 1)
        learned, new_after = new_rest.split(runner.LEARNED_END, 1)
        self.assertEqual(base_before, new_before)
        self.assertEqual(base_after, new_after)
        self.assertIn("MR-TEST-001", learned)

    def test_manifest_is_json_object_with_expected_schema(self) -> None:
        value = json.loads(runner.MANIFEST_PATH.read_text(encoding="utf-8"))
        self.assertEqual(runner.SCHEMA_VERSION, value["schema_version"])

    def test_private_key_requires_mode_0600_and_regular_file(self) -> None:
        with tempfile.TemporaryDirectory() as directory:
            path = Path(directory) / "key"
            path.write_text("sk-test-value", encoding="utf-8")
            path.chmod(0o600)
            self.assertEqual("sk-test-value", runner.read_private_key(path))
            path.chmod(0o640)
            with self.assertRaisesRegex(runner.ExperimentError, "exactly 0600"):
                runner.read_private_key(path)

    def test_private_key_refuses_symlinks(self) -> None:
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            target = root / "target"
            target.write_text("sk-test-value", encoding="utf-8")
            target.chmod(0o600)
            link = root / "link"
            link.symlink_to(target)
            with self.assertRaisesRegex(runner.ExperimentError, "securely open"):
                runner.read_private_key(link)

    def test_rule_selection_renders_only_applicable_rules(self) -> None:
        m0 = (runner.CHECKPOINTS / "M0.md").read_text(encoding="utf-8")
        source_a = "\n".join(
            (
                "### MR-A",
                "- Applicability: visibility defrost",
                "- Instruction: preserve visibility priority",
                "- Constraints: boolean inputs only",
                "- Evidence: training easy",
            )
        )
        source_b = "\n".join(
            (
                "### MR-B",
                "- Applicability: satellite eclipse",
                "- Instruction: preserve telemetry",
                "- Constraints: enum modes only",
                "- Evidence: training easy",
            )
        )
        checkpoint = runner.replace_learned_region(m0, [source_a, source_b])

        class FakeClient:
            def embed(self, inputs):
                self.inputs = inputs
                return [[1.0, 0.0], [1.0, 0.0], [0.0, 1.0]], {
                    "prompt_tokens": 3,
                    "total_tokens": 3,
                }

        client = FakeClient()
        rendered, decisions, usage = runner.select_applicable_rules(
            checkpoint, "visibility is impaired", client, 0.1
        )
        self.assertEqual([True, False], [item["selected"] for item in decisions])
        self.assertIn("MR-A", rendered)
        self.assertNotIn("MR-B", rendered)
        self.assertEqual(3, usage["total_tokens"])

    def test_memory_gate_preserves_reserve_and_observed_peak(self) -> None:
        snapshot = runner.memory_snapshot(
            "MemTotal:       100000 kB\nMemAvailable:    30000 kB\n"
        )
        self.assertTrue(runner.may_launch_worker(snapshot, 0.10, 10_000_000))
        self.assertFalse(runner.may_launch_worker(snapshot, 0.10, 25_000_000))
        self.assertFalse(runner.may_launch_worker(snapshot, 0.10, 8_000_000, 3))

    def test_codex_environment_does_not_inherit_embedding_credentials(self) -> None:
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            with mock.patch.dict(
                runner.os.environ,
                {
                    "OPENAI_API_KEY": "secret-value",
                    "SCP_KEY_FILE": "/secret/key",
                    "UNRELATED_SECRET": "also-secret",
                },
                clear=True,
            ):
                environment = runner.clean_codex_environment(root / "candidate", root / "codex")
            self.assertNotIn("OPENAI_API_KEY", environment)
            self.assertNotIn("SCP_KEY_FILE", environment)
            self.assertNotIn("UNRELATED_SECRET", environment)
            self.assertEqual(str(root / "codex"), environment["CODEX_HOME"])

    def test_embedding_client_does_not_put_key_in_payload(self) -> None:
        class Response:
            def __enter__(self):
                return self

            def __exit__(self, *args):
                return False

            def read(self):
                return json.dumps(
                    {"data": [{"index": 0, "embedding": [1.0, 0.0]}], "usage": {}}
                ).encode()

        captured = {}

        def fake_urlopen(request, timeout):
            captured["headers"] = dict(request.header_items())
            captured["body"] = request.data.decode()
            return Response()

        with mock.patch.object(runner.urllib.request, "urlopen", fake_urlopen):
            runner.EmbeddingClient("secret-value", "model", 2).embed(["text"])
        self.assertNotIn("secret-value", captured["body"])
        self.assertEqual("Bearer secret-value", captured["headers"]["Authorization"])

    def test_meta_rule_parser_uses_paper_informed_free_form_records(self) -> None:
        m0 = (runner.CHECKPOINTS / "M0.md").read_text(encoding="utf-8")
        paper_record = runner.replace_learned_region(
            m0,
            [
                "\n".join(
                    (
                        "### MR-PAPER-RECORD",
                        "Rule: introduce explicit state for memory.",
                        'Trigger: hysteresis, "hold previous".',
                        "Semantic choice: model memory as state plus initialization.",
                        "Structural target: owning SysML thread compute cases.",
                        "Repair gate: retain only after HAMR and Logika pass.",
                    )
                )
            ],
        )
        parsed = runner.parse_meta_rules(paper_record)
        self.assertEqual(["MR-PAPER-RECORD"], [rule.rule_id for rule in parsed])
        self.assertIn("Semantic choice", parsed[0].source)
        empty = runner.replace_learned_region(m0, ["### MR-EMPTY"])
        with self.assertRaisesRegex(runner.ExperimentError, "no rule-book content"):
            runner.parse_meta_rules(empty)

    def test_methodology_input_is_the_scp_paper_not_the_whitepaper(self) -> None:
        manifest = runner.load_manifest()
        _, _, paper = runner.assert_upstream(manifest)
        self.assertEqual("dacs-26-cam-ready-v0_revised_round21June_fixed.pdf", paper.name)
        self.assertNotIn("White_Paper", str(paper))
        self.assertEqual(
            "5f0f5ad54b1e70e2d7b889c773371125b585967444bba31bfd607cfd3bf0217f",
            runner.sha256_file(paper),
        )

    def test_candidate_prepare_script_changes_only_recursive_sourcepath(self) -> None:
        source = (ROOT / "scripts" / "prepare_executable_candidate.sh").read_text(
            encoding="utf-8"
        )
        transformed = runner.isolated_prepare_script(source)
        old = '--sourcepath "$(dirname "$model"):$library" \\\n  "$model"'
        new = '--sourcepath "$library" \\\n  "$model"'
        self.assertNotIn(old, transformed)
        self.assertIn(new, transformed)
        self.assertEqual(source, transformed.replace(new, old, 1))

    def test_staged_checkpoint_is_the_only_checkpoint_dependent_input(self) -> None:
        unsealed = copy.deepcopy(runner.load_manifest())
        unsealed["state"] = "initialized"
        m0 = runner.CHECKPOINTS / "M0.md"
        rule = "\n".join(
            (
                "### MR-TEST",
                "- Applicability: a finite classifier",
                "- Instruction: cover each input value",
                "- Constraints: use only finite enums",
                "- Evidence: unit test",
            )
        )
        with tempfile.TemporaryDirectory() as directory:
            build = Path(directory) / "build"
            plan = Path(directory) / "M-X.md"
            plan.write_text(
                runner.replace_learned_region(m0.read_text(encoding="utf-8"), [rule]),
                encoding="utf-8",
            )
            with (
                mock.patch.object(runner, "BUILD", build),
                mock.patch.object(runner, "load_manifest", return_value=unsealed),
            ):
                first = runner.stage_workspace(
                    runner.Cell("user", "cabin-air-quality-and-humidity-supervisor-small", "M0"),
                    m0,
                )
                second = runner.stage_workspace(
                    runner.Cell("user", "cabin-air-quality-and-humidity-supervisor-small", "M-X"),
                    plan,
                )
            left = first / "candidate"
            right = second / "candidate"
            left_files = {
                str(path.relative_to(left)): runner.sha256_file(path)
                for path in left.rglob("*")
                if path.is_file()
            }
            right_files = {
                str(path.relative_to(right)): runner.sha256_file(path)
                for path in right.rglob("*")
                if path.is_file()
            }
            self.assertEqual(left_files.keys(), right_files.keys())
            differences = {
                name for name in left_files if left_files[name] != right_files[name]
            }
            self.assertEqual({"Gumbo_FSE_agent_Plan.md"}, differences)
            self.assertFalse(any("oracle" in name.lower() for name in left_files))
            self.assertIn(runner.METHODOLOGY_FILENAME, left_files)

    def test_no_improvement_stage_freezes_parent_bytes(self) -> None:
        manifest = copy.deepcopy(runner.load_manifest())
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            build = root / "build"
            checkpoints = root / "checkpoints"
            stage = build / "runs" / "train--M-E" / "stage.json"
            runner.write_json_atomic(
                stage,
                {
                    "schema_version": "metarule-training-stage-1.0.0",
                    "checkpoint": "M-E",
                    "status": "proposals_complete",
                    "proposals": [],
                },
            )
            with (
                mock.patch.object(runner, "BUILD", build),
                mock.patch.object(runner, "CHECKPOINTS", checkpoints),
            ):
                runner.freeze_checkpoint(manifest, "M-E")
            frozen = checkpoints / "M-E.md"
            self.assertEqual(
                (runner.EXPERIMENT / "checkpoints" / "M0.md").read_bytes(),
                frozen.read_bytes(),
            )
            metadata = json.loads((checkpoints / "M-E.json").read_text(encoding="utf-8"))
            self.assertTrue(metadata["no_accepted_improvement"])
            self.assertIsNone(metadata["accepted_proposal"])
            self.assertEqual(
                runner.sha256_file(checkpoints / "M-E.json"),
                runner.checkpoint_by_id(manifest, "M-E")["metadata_sha256"],
            )
            metadata["no_accepted_improvement"] = False
            runner.write_json_atomic(checkpoints / "M-E.json", metadata)
            with (
                mock.patch.object(runner, "BUILD", build),
                mock.patch.object(runner, "CHECKPOINTS", checkpoints),
            ):
                with self.assertRaisesRegex(runner.ExperimentError, "checkpoint evidence"):
                    runner.freeze_checkpoint(manifest, "M-E")

    def test_review_is_write_once_and_cannot_approve_ineligible(self) -> None:
        manifest = runner.load_manifest()
        unsealed = copy.deepcopy(manifest)
        unsealed["state"] = "initialized"
        m0 = runner.CHECKPOINTS / "M0.md"
        rule = "\n".join(
            (
                "### MR-REVIEW",
                "- Applicability: finite mappings",
                "- Instruction: cover all values",
                "- Constraints: finite enums only",
                "- Evidence: test stage",
            )
        )
        with tempfile.TemporaryDirectory() as directory:
            build = Path(directory) / "build"
            proposal = build / "proposals" / "M-E" / "PTEST"
            proposal.mkdir(parents=True)
            plan = proposal / "plan.md"
            plan.write_text(
                runner.replace_learned_region(m0.read_text(encoding="utf-8"), [rule]),
                encoding="utf-8",
            )
            gates = {
                "relative_embedding_improvement": True,
                "structure_unchanged": True,
                "model_logika": True,
                "hamr_codegen": True,
                "generated_application": True,
                "component_logika": True,
            }
            embedding = proposal / "embedding-evidence.json"
            runner.write_json_atomic(
                embedding,
                {
                    "schema_version": "metarule-training-embedding-1.0.0",
                    "relative_improvement": 0.1,
                },
            )
            gate_directory = (
                build
                / "runs"
                / "train--M-E"
                / "evaluation"
                / "proposal-gates"
                / "PTEST"
            )
            gate_directory.mkdir(parents=True)
            (gate_directory / "gate.log").write_text("passed", encoding="utf-8")
            runner.write_json_atomic(
                proposal / "proposal.json",
                {
                    "schema_version": "metarule-proposal-1.0.0",
                    "proposal_id": "PTEST",
                    "checkpoint": "M-E",
                    "training_dataset": "windshield-defrost-request-supervisor",
                    "parent_content_sha256": manifest["checkpoints"][0]["content_sha256"],
                    "candidate_content_sha256": runner.sha256_file(plan),
                    "relative_embedding_improvement": 0.1,
                    "mechanically_eligible": True,
                    "gates": gates,
                    "gate_details": {
                        "evidence_directory": "evaluation/proposal-gates/PTEST"
                    },
                    "embedding_evidence_sha256": runner.sha256_file(embedding),
                    "gate_evidence_sha256": runner.artifact_tree_sha256(gate_directory),
                },
            )
            approve = SimpleNamespace(
                checkpoint="M-E", proposal="PTEST", decision="approve", reviewer="tester"
            )
            with (
                mock.patch.object(runner, "BUILD", build),
                mock.patch.object(runner, "load_manifest", return_value=unsealed),
            ):
                self.assertEqual(0, runner.command_review(approve))
                self.assertEqual(0, runner.command_review(approve))
                changed = SimpleNamespace(
                    checkpoint="M-E",
                    proposal="PTEST",
                    decision="reject",
                    reviewer="tester",
                )
                with self.assertRaisesRegex(runner.ExperimentError, "immutable"):
                    runner.command_review(changed)

                stage = build / "runs" / "train--M-E" / "stage.json"
                runner.write_json_atomic(
                    stage,
                    {
                        "schema_version": "metarule-training-stage-1.0.0",
                        "checkpoint": "M-E",
                        "status": "proposals_complete",
                        "proposals": ["PTEST"],
                    },
                )
                review_path = proposal / "review.json"
                review = json.loads(review_path.read_text(encoding="utf-8"))
                review["checkpoint"] = "M-EM"
                runner.write_json_atomic(review_path, review)
                checkpoints = Path(directory) / "checkpoints"
                with mock.patch.object(runner, "CHECKPOINTS", checkpoints):
                    with self.assertRaisesRegex(runner.ExperimentError, "valid immutable review"):
                        runner.freeze_checkpoint(manifest, "M-E")

    def test_manifest_seal_digest_detects_definition_changes(self) -> None:
        manifest = copy.deepcopy(runner.load_manifest())
        digest = runner.manifest_definition_sha256(manifest)
        manifest["sealed_definition_sha256"] = digest
        self.assertEqual(digest, runner.manifest_definition_sha256(manifest))
        manifest["model"]["reasoning_effort"] = "low"
        self.assertNotEqual(digest, runner.manifest_definition_sha256(manifest))

    def test_attempt_directories_are_append_only(self) -> None:
        with tempfile.TemporaryDirectory() as directory:
            base = Path(directory) / "attempt"
            self.assertEqual(base, runner.next_attempt_directory(base))
            base.mkdir()
            (base / "evidence").write_text("first", encoding="utf-8")
            self.assertEqual(base.with_name("attempt-attempt-02"), runner.next_attempt_directory(base))
            base.with_name("attempt-attempt-02").mkdir()
            self.assertEqual(base.with_name("attempt-attempt-03"), runner.next_attempt_directory(base))

    def test_failure_classification_keeps_outcomes_distinct(self) -> None:
        self.assertEqual(("failed", "not_run"), runner.classify_prepare_result(1, "ORIGINAL_MODEL_LOGIKA_FAILED"))
        self.assertEqual(("passed", "failed"), runner.classify_prepare_result(1, "EXECUTABLE_CODEGEN_FAILED"))
        self.assertEqual(("timed_out", "not_run"), runner.classify_prepare_result(124, ""))
        self.assertEqual("equivalent", runner.classify_semantic_result(0, "EQUIVALENT"))
        self.assertEqual("different", runner.classify_semantic_result(2, "INVALID_INPUT"))
        self.assertEqual("inconclusive", runner.classify_semantic_result(2, "INCONCLUSIVE"))
        self.assertEqual("timed_out", runner.classify_semantic_result(124, ""))
        self.assertEqual("infrastructure_failed", runner.classify_semantic_result(3, "ERROR"))
        self.assertEqual(
            "candidate_stronger",
            runner.detailed_semantic_verdict(1, "VERIFIED_DIFFERENCE CANDIDATE_STRONGER"),
        )
        self.assertEqual(
            "candidate_weaker",
            runner.detailed_semantic_verdict(1, "VERIFIED_DIFFERENCE CANDIDATE_WEAKER"),
        )
        self.assertEqual(
            "incomparable",
            runner.detailed_semantic_verdict(1, "VERIFIED_DIFFERENCE INCOMPARABLE"),
        )

    def test_hpc_score_controls_parse(self) -> None:
        args = runner.build_parser().parse_args(
            [
                "score",
                "--equivalence-timeout-seconds",
                "3600",
                "--maximum-parallelism",
                "16",
                "--memory-reserve-fraction",
                "0.05",
                "--ramp-observation-seconds",
                "120",
            ]
        )
        self.assertEqual(3600, args.equivalence_timeout_seconds)
        self.assertEqual(16, args.maximum_parallelism)
        self.assertEqual(0.05, args.memory_reserve_fraction)
        self.assertEqual(120, args.ramp_observation_seconds)

    def test_summary_metrics_report_raw_counts_and_rates(self) -> None:
        results = [
            {
                "final_status": "passed",
                "semantic_status": "equivalent",
                "proof_passed": True,
                "gates": {
                    "structure_unchanged": {"status": "passed"},
                    "model_logika": {"status": "passed"},
                },
            },
            {
                "final_status": "semantic_failed",
                "semantic_status": "different",
                "proof_passed": False,
                "gates": {
                    "structure_unchanged": {"status": "passed"},
                    "model_logika": {"status": "failed"},
                },
            },
        ]
        summary = runner.summarize_result_subset(results)
        self.assertEqual(2, summary["runs"])
        self.assertEqual({"passed": 1, "semantic_failed": 1}, summary["statuses"])
        self.assertEqual(0.5, summary["status_rates"]["passed"])
        self.assertEqual(1, summary["semantic_equivalent"])
        self.assertEqual(0.5, summary["semantic_equivalence_rate"])
        self.assertEqual(1.0, summary["gate_pass_rates"]["structure_unchanged"])
        self.assertEqual(0.5, summary["gate_pass_rates"]["model_logika"])

    def test_archive_is_resumable_excludes_runtime_and_refuses_links_or_changes(self) -> None:
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            source = root / "source"
            destination = root / "archive"
            (source / "nested").mkdir(parents=True)
            (source / "nested" / "evidence.json").write_text("one", encoding="utf-8")
            (source / ".runtime").mkdir()
            (source / ".runtime" / "auth.json").write_text("secret", encoding="utf-8")
            runner.archive_copy(source, destination)
            self.assertEqual("one", (destination / "nested" / "evidence.json").read_text())
            self.assertFalse((destination / ".runtime").exists())

            # A repeat and a partially missing destination are both safely resumable.
            runner.archive_copy(source, destination)
            (source / "nested" / "second.log").write_text("two", encoding="utf-8")
            runner.archive_copy(source, destination)
            self.assertEqual("two", (destination / "nested" / "second.log").read_text())

            (destination / "nested" / "evidence.json").write_text("changed", encoding="utf-8")
            with self.assertRaisesRegex(runner.ExperimentError, "overwrite archived evidence"):
                runner.archive_copy(source, destination)
            (destination / "nested" / "evidence.json").write_text("one", encoding="utf-8")

            (source / "outside-link").symlink_to(source / "nested" / "evidence.json")
            with self.assertRaisesRegex(runner.ExperimentError, "archive symlink"):
                runner.archive_copy(source, destination)

    def test_selection_set_digest_covers_complete_selection_evidence(self) -> None:
        manifest = runner.load_manifest()
        cell = runner.user_cells(manifest)[0]
        checkpoint = runner.checkpoint_by_id(manifest, cell.checkpoint)
        paths = runner.dataset_paths(cell.dataset_id)
        task_text = paths["requirements"].read_text(encoding="utf-8") + "\n\n" + paths[
            "model"
        ].read_text(encoding="utf-8")
        with tempfile.TemporaryDirectory() as directory:
            build = Path(directory) / "build"
            selection = build / "selections" / cell.cell_id
            selection.mkdir(parents=True)
            plan = selection / "Gumbo_FSE_agent_Plan.md"
            plan.write_bytes((runner.CHECKPOINTS / "M0.md").read_bytes())
            metadata = {
                "schema_version": "metarule-selection-1.0.0",
                "dataset": cell.dataset_id,
                "checkpoint": cell.checkpoint,
                "checkpoint_sha256": checkpoint["content_sha256"],
                "task_input_sha256": runner.hashlib.sha256(task_text.encode()).hexdigest(),
                "maximum_cosine_distance": manifest["embedding"][
                    "applicability_max_cosine_distance"
                ],
                "decisions": [],
                "usage": {"total_tokens": 1},
                "embedding_evidence": [{"vector": [1.0]}],
                "rendered_plan_sha256": runner.sha256_file(plan),
            }
            runner.write_json_atomic(selection / "selection.json", metadata)
            with (
                mock.patch.object(runner, "BUILD", build),
                mock.patch.object(runner, "user_cells", return_value=[cell]),
            ):
                original = runner.selection_set_sha256(manifest)
                metadata["embedding_evidence"][0]["vector"] = [0.0]
                runner.write_json_atomic(selection / "selection.json", metadata)
                changed = runner.selection_set_sha256(manifest)
            self.assertNotEqual(original, changed)


if __name__ == "__main__":
    unittest.main()
