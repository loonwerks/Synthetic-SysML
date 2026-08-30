from __future__ import annotations

import json
import tempfile
import unittest
from argparse import Namespace
from pathlib import Path
from unittest import mock

from synthesizer import run


def realizability_sections(interaction_count: int) -> str:
    inventory = "\n".join(
        f"INT-{index:02d}: owner_{index}.output -> owner_{index + 1}.input : Value{index}"
        for index in range(1, interaction_count + 1)
    )
    return (
        "## Pre-freeze realizability audit\n\n"
        "AUDIT-OWNERS: passed - Every case owner maps finite guard inputs and results.\n"
        "AUDIT-PARTITIONS: passed - Closed partitions cover fresh request and recovery.\n"
        f"AUDIT-INTERACTIONS: passed - recounted {interaction_count} after repair.\n\n"
        "## Exact interaction inventory\n\n"
        f"{inventory}\n\n"
    )


def ownership_record(usage: str, *, analyzer: bool = False) -> dict[str, object]:
    record: dict[str, object] = {
        "usage": usage,
        "assigned_inputs": [f"{usage}.input"],
        "owner_local_facts": [f"{usage}.decision"],
        "contract_cases": [f"{usage.upper()}_CASE"],
        "analyzer_checks": [f"check_{usage}"],
    }
    if analyzer:
        record["passed"] = True
    else:
        record["claimed_roles"] = ["decision"]
    return record


class UsageTests(unittest.TestCase):
    def test_extract_usage_selects_largest_cumulative_record(self) -> None:
        events = "\n".join(
            [
                json.dumps(
                    {
                        "payload": {
                            "last_token_usage": {
                                "input_tokens": 20,
                                "cached_input_tokens": 10,
                                "output_tokens": 3,
                                "total_tokens": 23,
                            },
                            "total_token_usage": {
                                "input_tokens": 100,
                                "cached_input_tokens": 80,
                                "output_tokens": 12,
                                "reasoning_output_tokens": 4,
                                "total_tokens": 112,
                            },
                        }
                    }
                ),
                "not json",
            ]
        )
        usage = run.extract_usage(events)
        self.assertEqual(usage["input_tokens"], 100)
        self.assertEqual(usage["cached_input_tokens"], 80)
        self.assertEqual(usage["output_tokens"], 12)
        self.assertEqual(usage["reasoning_output_tokens"], 4)

    def test_usage_report_aggregates_stateless_stages_by_role(self) -> None:
        def record(value: int) -> dict[str, int]:
            return {
                "input_tokens": value,
                "cached_input_tokens": value // 2,
                "cache_write_input_tokens": 0,
                "output_tokens": 10,
                "reasoning_output_tokens": 2,
                "total_tokens": value + 10,
            }

        stage_usage = {
            "seed-generate": record(50),
            "designer-initial": record(100),
            "model-review": record(200),
            "designer-resolution": record(300),
            "model-generate": record(400),
            "visualize": record(500),
            "designer-final": record(600),
        }
        report = run.build_usage_report("run-1", stage_usage, "test-model")
        roles = {item["role"]: item for item in report["agents"]}
        self.assertEqual(roles["seed"]["token_matrix"]["totals"]["input"], 50)
        self.assertEqual(roles["designer"]["token_matrix"]["totals"]["input"], 1000)
        self.assertEqual(roles["model"]["token_matrix"]["totals"]["input"], 600)
        self.assertEqual(roles["visualization"]["token_matrix"]["totals"]["input"], 500)
        self.assertEqual(report["aggregate"]["token_matrix"]["totals"]["input"], 2150)
        self.assertEqual(report["aggregate"]["token_matrix"]["totals"]["output"], 70)

    def test_usage_report_retains_checkpoint_and_retry_cost(self) -> None:
        stage_usage: dict[str, dict[str, int]] = {}
        first = {
            "input_tokens": 10,
            "cached_input_tokens": 0,
            "cache_write_input_tokens": 0,
            "output_tokens": 2,
            "reasoning_output_tokens": 0,
            "total_tokens": 12,
        }
        second = {**first, "input_tokens": 20, "total_tokens": 22}
        run.record_stage_usage(
            stage_usage, "visualize", first, completed=False
        )
        run.record_stage_usage(stage_usage, "visualize", second)
        report = run.build_usage_report("run-1", stage_usage, "test-model")
        visual = next(
            item for item in report["agents"] if item["role"] == "visualization"
        )
        self.assertEqual(visual["token_matrix"]["totals"]["overall"], 34)
        self.assertEqual(len(visual["stages"]), 2)

    def test_reused_seed_synthesis_report_has_exactly_three_core_agents(self) -> None:
        usage = {
            "input_tokens": 10,
            "cached_input_tokens": 0,
            "cache_write_input_tokens": 0,
            "output_tokens": 2,
            "reasoning_output_tokens": 0,
            "total_tokens": 12,
        }
        report = run.build_usage_report(
            "run-1",
            {
                "designer-initial": usage,
                "model-review": usage,
                "model-generate": usage,
                "visualize": usage,
                "designer-final": usage,
            },
            "test-model",
        )
        self.assertEqual(report["aggregate"]["agent_count"], 3)
        self.assertEqual(
            [agent["role"] for agent in report["agents"]],
            ["designer", "model", "visualization"],
        )


class EvidenceTests(unittest.TestCase):
    def test_reusable_seed_is_tier_neutral_and_has_no_interaction_inventory(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "source.md"
            source.write_text("source brief\n", encoding="utf-8")
            seed = root / "seed.md"
            base = (
                "---\nseed_id: reusable-test-v1\nversion: 1\nstatus: frozen\n"
                "scope: reusable\n---\n# Reusable seed\n\n"
                "## Source basis\n\nDerived from `Example.sysml` at revision "
                "0123456789abcdef0123456789abcdef01234567.\n\n"
                "## Domain and purpose\n\nA controller assists an operator in a bounded domain.\n\n"
                "## Available design vocabulary\n\nAvailable concepts include status, intent, capability, and authorization; none is a mandatory interface.\n\n"
                "## Candidate system scopes\n\n- Status mediation and alerting.\n- Readiness coordination.\n- Degraded-operation supervision.\n\n"
                "## Source limitations and claim boundary\n\nThe source omits policy and physical performance; downstream models make no safety claim.\n"
            )
            seed.write_text(base, encoding="utf-8")
            report = run.validate_reusable_seed(seed, source)
            self.assertEqual(report["scope"], "reusable")

            seed.write_text(base.replace("scope: reusable", "scope: reusable\ncomplexity: small"), encoding="utf-8")
            with self.assertRaisesRegex(run.HarnessError, "must not declare a complexity"):
                run.validate_reusable_seed(seed, source)

            seed.write_text(base + "INT-01: a.x -> b.y : Value\n", encoding="utf-8")
            with self.assertRaisesRegex(run.HarnessError, "leave exact interactions"):
                run.validate_reusable_seed(seed, source)

            seed.write_text(base + "REQ-01: detailed seed requirement\n", encoding="utf-8")
            with self.assertRaisesRegex(run.HarnessError, "trace-ID taxonomy"):
                run.validate_reusable_seed(seed, source)

    def test_seed_generation_compaction_retains_six_review_artifacts(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            retained = (
                "agent-token-usage.json",
                "decisions/seed-generation.json",
                "evaluation/seed-validation.json",
                "run-config.json",
                "seed.md",
                "status.json",
            )
            for relative in retained + ("events/seed-generate.jsonl", "prompts/seed-generate.md"):
                path = run_dir / relative
                path.parent.mkdir(parents=True, exist_ok=True)
                path.write_text("evidence\n", encoding="utf-8")
            run.compact_seed_generation(run_dir)
            actual = sorted(
                path.relative_to(run_dir).as_posix()
                for path in run_dir.rglob("*")
                if path.is_file()
            )
            self.assertEqual(actual, sorted(retained))

    def test_agent_runtime_watchdog_is_disabled_by_default(self) -> None:
        args = run.parse_args(["--seed", "/tmp/example-seed.md"])
        self.assertEqual(args.timeout, 0)

    def test_seed_source_defaults_to_preparation_and_requires_destination(self) -> None:
        args = run.parse_args(["--seed-source", "/tmp/source.md"])
        with self.assertRaisesRegex(run.HarnessError, "requires.*--publish-seed"):
            with mock.patch.object(run, "discover_paths"):
                run.execute(args)

    def test_visualization_requires_complete_semantic_trace_review(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            (run_dir / "visualization").mkdir()
            (run_dir / "model" / ".sysmlviz").mkdir(parents=True)
            for relative in (
                "visualization/system-overview.svg",
                "visualization/system-overview.png",
                "visualization/visualization-review.md",
                "model/.sysmlviz/views.json",
            ):
                (run_dir / relative).write_text("retained\n", encoding="utf-8")
            run.write_json(
                run_dir / "visualization/system-overview.svg.json",
                {
                    "diagramHealth": {},
                    "session": {"validation": {"status": "valid"}},
                    "traceability": {
                        "available": True,
                        "referencedTraceIds": ["PART-01", "BEH-02"],
                        "unresolvedTraceIds": [],
                        "duplicateAnchorIds": [],
                        "taggedElementCount": 3,
                        "traceAssociationCount": 4,
                    },
                },
            )
            decision = {
                "traceability_review": "passed",
                "reviewed_trace_ids": ["BEH-02", "PART-01"],
                "reviewed_tagged_element_count": 3,
                "reviewed_trace_association_count": 4,
                "unresolved_trace_ids": [],
                "duplicate_anchor_ids": [],
                "irrelevant_trace_associations": [],
            }
            metadata = run.validate_visualization(run_dir, "abc123", decision)
            self.assertEqual(metadata["traceability"]["traceAssociationCount"], 4)

            incomplete = {**decision, "reviewed_trace_association_count": 3}
            with self.assertRaisesRegex(run.HarnessError, "does not match"):
                run.validate_visualization(run_dir, "abc123", incomplete)

            sidecar = run_dir / "visualization/system-overview.svg.json"
            original = run.read_json(sidecar)
            invalid_sessions = (
                None,
                {},
                {"validation": None},
                {"validation": {}},
                {"validation": {"status": None}},
                {"validation": {"status": "not-run"}},
            )
            for session in invalid_sessions:
                with self.subTest(session=session):
                    candidate = {**original}
                    if session is None:
                        candidate.pop("session", None)
                    else:
                        candidate["session"] = session
                    run.write_json(sidecar, candidate)
                    with self.assertRaisesRegex(
                        run.HarnessError,
                        "session.validation.status must be exactly valid",
                    ):
                        run.validate_visualization(run_dir, "abc123", decision)

    def test_semantic_visualization_defect_is_resumable_not_terminal(self) -> None:
        self.assertIsNone(
            run.terminal_status_for_failure(
                "visualize", {"disposition": "semantic-defect"}
            )
        )

    def test_negative_agent_decisions_route_to_same_run_repairs(self) -> None:
        cases = (
            ("seed-generate", {"disposition": "failed"}, "seed-generate"),
            ("designer-initial", {"status": "failed"}, "designer-initial"),
            ("model-review", {"disposition": "blocker"}, None),
            ("designer-resolution", {"disposition": "rejected"}, "designer-resolution"),
            ("model-generate", {"disposition": "failed"}, "model-generate"),
            (
                "designer-final",
                {
                    "disposition": "designer-rejected",
                    "repair_owner": "model",
                    "source_fitness": "failed",
                    "visualization_fitness": "passed",
                },
                "model-generate",
            ),
            (
                "designer-final",
                {
                    "disposition": "designer-rejected",
                    "repair_owner": "designer",
                },
                "designer-resolution",
            ),
            (
                "designer-final",
                {
                    "disposition": "designer-rejected",
                    "repair_owner": "visualization",
                },
                "visualize",
            ),
        )
        for stage, decision, expected in cases:
            with self.subTest(stage=stage, decision=decision):
                self.assertIsNone(run.terminal_status_for_failure(stage, decision))
                self.assertEqual(
                    run.repair_stage_for_failure(stage, decision), expected
                )

    def test_repair_progress_fingerprint_ignores_logs_but_tracks_candidate(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            model = run_dir / "model/Candidate.sysml"
            event = run_dir / "events/model-generate.jsonl"
            model.parent.mkdir()
            event.parent.mkdir()
            model.write_text("package A {}\n", encoding="utf-8")
            event.write_text("first log\n", encoding="utf-8")
            views = run_dir / "model/.sysmlviz/views.json"
            views.parent.mkdir(parents=True)
            views.write_text(
                '{"updatedAt": "first", "layout": {"x": 1}}\n', encoding="utf-8"
            )
            first = run.repair_progress_fingerprint(run_dir)
            event.write_text("different log\n", encoding="utf-8")
            self.assertEqual(first, run.repair_progress_fingerprint(run_dir))
            views.write_text(
                '{"updatedAt": "second", "layout": {"x": 1}}\n', encoding="utf-8"
            )
            self.assertEqual(first, run.repair_progress_fingerprint(run_dir))
            views.write_text(
                '{"updatedAt": "third", "layout": {"x": 2}}\n', encoding="utf-8"
            )
            layout_changed = run.repair_progress_fingerprint(run_dir)
            self.assertNotEqual(first, layout_changed)
            sidecar = run_dir / "visualization/system-overview.svg.json"
            sidecar.parent.mkdir(parents=True)
            sidecar.write_text('{"completedAt": "new timestamp"}\n', encoding="utf-8")
            self.assertEqual(layout_changed, run.repair_progress_fingerprint(run_dir))
            model.write_text("package B {}\n", encoding="utf-8")
            self.assertNotEqual(layout_changed, run.repair_progress_fingerprint(run_dir))

    def test_repair_request_is_single_owned_handoff(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            run.write_repair_request(
                run_dir,
                target_stage="model-generate",
                source_stage="designer-final",
                diagnostic="contract case is incomplete",
                actions=("repair CASE-04",),
            )
            request = run.read_json(run_dir / "evaluation/repair-request.json")
            self.assertEqual(request["target_stage"], "model-generate")
            self.assertEqual(request["repair_actions"], ["repair CASE-04"])
            self.assertEqual(request["schema_version"], 2)
            self.assertIn("model/*.sysml", request["context_files"])
            self.assertNotIn("seed.md", request["context_files"])
            self.assertEqual(
                run.prompt_template_for_stage(run_dir, run.STAGES[3]),
                "model-repair.md",
            )
            self.assertEqual(
                run.prompt_template_for_stage(run_dir, run.STAGES[4]),
                "visualize.md",
            )
            run.clear_owned_repair_request(run_dir, "visualize")
            self.assertTrue((run_dir / "evaluation/repair-request.json").is_file())
            run.clear_owned_repair_request(run_dir, "model-generate")
            self.assertFalse((run_dir / "evaluation/repair-request.json").exists())

    def test_pre_final_gate_rechecks_retained_evidence_on_resume(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            source = run_dir / "model" / "Example.sysml"
            source.parent.mkdir()
            source.write_text("package Example {}\n", encoding="utf-8")
            run.write_json(run_dir / "run-config.json", {"seed_generated": False})
            decisions = {
                "model-generate": {"canonical_source": "model/Example.sysml"},
                "visualize": {"disposition": "accepted"},
            }
            expected_metadata = {"traceability": {"available": True}}
            with mock.patch.object(
                run,
                "run_mechanical_model_checks",
                return_value=(source, run.sha256_file(source)),
            ) as mechanical, mock.patch.object(
                run, "validate_visualization", return_value=expected_metadata
            ) as visual:
                _, _, metadata = run.run_pre_final_gates(
                    Namespace(), mock.sentinel.paths, run_dir, decisions,
                    run.sha256_file(source), None,
                )
            mechanical.assert_called_once()
            visual.assert_called_once()
            self.assertIs(metadata, expected_metadata)

    def test_pre_final_gate_does_not_repeat_green_checks_in_same_process(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            source = run_dir / "model" / "Example.sysml"
            source.parent.mkdir()
            source.write_text("package Example {}\n", encoding="utf-8")
            source_hash = run.sha256_file(source)
            metadata = {"traceability": {"available": True}}
            decisions = {
                "model-generate": {"canonical_source": "model/Example.sysml"},
                "visualize": {"disposition": "accepted"},
            }
            with mock.patch.object(run, "run_mechanical_model_checks") as mechanical, \
                 mock.patch.object(run, "validate_visualization") as visual:
                _, _, result = run.run_pre_final_gates(
                    Namespace(), mock.sentinel.paths, run_dir, decisions,
                    source_hash, metadata,
                )
            mechanical.assert_not_called()
            visual.assert_not_called()
            self.assertIs(result, metadata)

    def test_failed_visualization_gate_checkpoints_before_designer_review(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            with mock.patch.object(
                run, "validate_visualization", side_effect=run.HarnessError("stale source")
            ):
                with self.assertRaises(run.OperationalCheckpoint) as raised:
                    run.validate_or_checkpoint_visualization(
                        run_dir, "source-hash", {"disposition": "accepted"}
                    )
            self.assertEqual(raised.exception.stage, "visualize")
            request = run.read_json(run_dir / "evaluation/repair-request.json")
            self.assertEqual(request["target_stage"], "visualize")
            self.assertIn("stale source", request["diagnostic"])

    def test_designer_visualization_failure_checkpoints_instead_of_accepting(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            experiment = workspace / "cps48"
            run_dir = experiment / "runs" / "run-1"
            run_dir.mkdir(parents=True)
            seed = experiment / "seeds" / "seed.md"
            seed.parent.mkdir()
            seed.write_text("seed\n", encoding="utf-8")
            source = run_dir / "model" / "Example.sysml"
            source.parent.mkdir()
            source.write_text("package Example {}\n", encoding="utf-8")
            run.write_json(
                run_dir / "run-config.json",
                {"seed_generated": False, "complexity": "hard"},
            )
            paths = run.Paths(
                workspace=workspace,
                synthesizer=workspace / "src" / "synthesizer",
                harness=workspace / "src" / "synthesizer",
                experiment=experiment,
                runs=experiment / "runs",
                docs=workspace / "docs",
                sysml_viz=workspace / "sysml-viz",
                library=workspace / "library",
                trusted=workspace / "trusted",
            )
            usage = {
                "input_tokens": 1,
                "cached_input_tokens": 0,
                "cache_write_input_tokens": 0,
                "output_tokens": 1,
                "reasoning_output_tokens": 0,
                "total_tokens": 2,
            }
            decisions = [
                {"status": "passed"},
                {"disposition": "approved"},
                {"disposition": "approved"},
                {"disposition": "passed", "canonical_source": "model/Example.sysml"},
                {"disposition": "accepted"},
                {
                    "disposition": "accepted",
                    "source_fitness": "passed",
                    "visualization_fitness": "failed",
                    "summary": "two distinct interactions have coincident routes",
                },
            ]
            args = Namespace(
                seed=str(seed),
                seed_source=None,
                resume_run=None,
                model="test-model",
            )
            with (
                mock.patch.object(run, "discover_paths", return_value=paths),
                mock.patch.object(
                    run, "new_run", return_value=(run_dir, "run-1", seed)
                ),
                mock.patch.object(
                    run,
                    "run_agent_stage",
                    side_effect=[(decision, usage) for decision in decisions],
                ),
                mock.patch.object(
                    run,
                    "run_mechanical_model_checks",
                    return_value=(source, run.sha256_file(source)),
                ),
                mock.patch.object(
                    run,
                    "validate_visualization",
                    return_value={"diagramHealth": {}, "traceability": {}},
                ),
                mock.patch.object(run, "write_closure") as closure,
            ):
                result = run.execute(args)

            self.assertEqual(result, run_dir)
            self.assertEqual(closure.call_args.args[5], "awaiting-visualization")
            self.assertEqual(closure.call_args.kwargs["checkpoint_stage"], "visualize")
            self.assertIn(
                "coincident routes", closure.call_args.args[10]
            )

    def test_accepted_closure_compacts_and_consolidates_evidence(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            run_dir = root / "run"
            run_dir.mkdir()
            source = run_dir / "model" / "Example.sysml"
            seed = root / "input-seed.md"
            seed.write_text("frozen seed\n", encoding="utf-8")
            for relative, content in {
                "system-abstract.md": "PART-01: controller\n",
                "design-selection.md": "selected\n",
                "model/Example.sysml": "package Example {}\n",
                "model/.sysmlviz/views.json": "{}\n",
                "metrics.json": json.dumps(
                    {
                        "campaign_complexity": {
                            "tier": "small",
                            "counting_rules": "campaign-v1",
                            "semantic_usages": 5,
                            "semantic_interactions": 7,
                            "nontrivial_contract_cases": 6,
                            "scenario_families": 4,
                        }
                    }
                ),
                "validation/bounded-analysis.mjs": "console.log('{}');\n",
                "validation/contract-coverage.json": '{"status":"passed"}\n',
                "visualization/system-overview.svg": "<svg/>\n",
                "prompts/designer-initial.md": "discard me\n",
                "events/designer-initial.jsonl": "discard me\n",
            }.items():
                path = run_dir / relative
                path.parent.mkdir(parents=True, exist_ok=True)
                path.write_text(content, encoding="utf-8")
            traceability = {
                "available": True,
                "anchorCount": 1,
                "referencedTraceIds": ["PART-01"],
                "unresolvedTraceIds": [],
                "duplicateAnchorIds": [],
                "taggedElementCount": 1,
                "traceAssociationCount": 1,
            }
            metadata = {
                "diagramHealth": {
                    "nodeCount": 1,
                    "edgeCount": 0,
                    "crossingCount": 0,
                },
                "traceability": traceability,
            }
            run.write_json(
                run_dir / "visualization/system-overview.svg.json", metadata
            )
            run.write_json(
                run_dir / "run-config.json",
                {
                    "run_id": "run-1",
                    "seed": str(seed),
                    "seed_sha256": run.sha256_file(seed),
                    "model": "test-model",
                    "reasoning_effort": "high",
                    "profile": None,
                    "campaign_id": "campaign",
                    "family_id": "family",
                    "complexity": "small",
                    "replicate": 1,
                    "attempt": 1,
                    "created_at": "2026-08-11T10:00:00Z",
                },
            )
            run.write_json(
                run_dir / "evaluation/seed-validation.json",
                {"status": "passed"},
            )
            run.write_json(
                run_dir / "evaluation/complexity-validation.json",
                {"status": "passed", "observed": {"semantic_usages": 5}},
            )
            run.append_jsonl(
                run_dir / "journal.jsonl",
                {
                    "event": "stage-completed",
                    "stage": "designer-initial",
                    "role": "designer",
                    "completed_at": "2026-08-11T10:00:05Z",
                    "duration_seconds": 5.0,
                },
            )
            token_record = {
                "input_tokens": 10,
                "cached_input_tokens": 5,
                "cache_write_input_tokens": 0,
                "output_tokens": 2,
                "reasoning_output_tokens": 1,
                "total_tokens": 12,
            }
            decisions = {
                "designer-initial": {"status": "passed"},
                "model-generate": {
                    "disposition": "passed",
                    "canonical_source": "model/Example.sysml",
                },
                "visualize": {
                    "disposition": "accepted",
                    "traceability_review": "passed",
                },
                "designer-final": {"disposition": "accepted"},
            }
            run.write_closure(
                run_dir,
                "run-1",
                seed,
                source,
                run.sha256_file(source),
                "accepted",
                decisions,
                {"designer-initial": token_record},
                "test-model",
                metadata,
                "accepted",
            )

            retained = {
                path.relative_to(run_dir).as_posix()
                for path in run_dir.rglob("*")
                if path.is_file()
            }
            self.assertEqual(
                retained,
                set(run.ACCEPTED_RETENTION_FILES) | {"model/Example.sysml"},
            )
            verification = run.read_json(run_dir / "verification-report.json")
            self.assertEqual(
                verification["retention"]["profile"],
                run.ACCEPTED_RETENTION_PROFILE,
            )
            self.assertEqual(
                verification["agent_decisions"]["visualization"]["disposition"],
                "accepted",
            )
            self.assertEqual(
                verification["evaluations"]["complexity-validation"]["status"],
                "passed",
            )
            self.assertEqual(verification["traceability_audit"], traceability)
            usage = run.read_json(run_dir / "agent-token-usage.json")
            self.assertEqual(usage["timing"]["summed_agent_stage_seconds"], 5.0)
            self.assertEqual(
                next(item for item in usage["agents"] if item["role"] == "designer")[
                    "wall_clock_seconds"
                ],
                5.0,
            )
            provenance = run.read_json(run_dir / "provenance.json")
            self.assertEqual(
                provenance["artifacts"]["canonical_source"]["sha256"],
                run.sha256_file(source),
            )
            self.assertEqual(
                provenance["upstream_seed_source"]["path"],
                run.relative_path(seed),
            )
            self.assertEqual(
                run.read_json(run_dir / "run-config.json")["seed"],
                run.relative_path(run_dir / "seed.md"),
            )

    def test_compaction_ignores_nonaccepted_run(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            run.write_json(
                run_dir / "status.json",
                {"status": "incomplete", "terminal": False},
            )
            raw = run_dir / "events/raw.jsonl"
            raw.parent.mkdir()
            raw.write_text("retained for diagnosis\n", encoding="utf-8")
            self.assertFalse(run.compact_accepted_run(run_dir))
            self.assertTrue(raw.is_file())

    def test_complexity_metrics_are_fail_closed(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            (run_dir / "evaluation").mkdir()
            (run_dir / "validation").mkdir()
            run.write_json(
                run_dir / "metrics.json",
                {
                    "campaign_complexity": {
                        "tier": "medium",
                        "counting_rules": "campaign-v1",
                        "semantic_usages": 9,
                        "semantic_interactions": 18,
                        "nontrivial_contract_cases": 16,
                        "scenario_families": 7,
                        "ownership_audit": [
                            ownership_record("qualifier"),
                            ownership_record("arbiter"),
                        ],
                        "features": {
                            "multiple_decision_owners": True,
                            "priority_conflict": True,
                            "fault_propagation": False,
                            "recovery": True,
                            "composition": False,
                        },
                    }
                },
            )
            run.write_json(
                run_dir / "validation/contract-coverage.json",
                {
                    "status": "passed",
                    "ownership_audit": [
                        ownership_record("qualifier", analyzer=True),
                        ownership_record("arbiter", analyzer=True),
                    ],
                },
            )
            report = run.validate_complexity_metrics(run_dir, "medium")
            self.assertEqual(report["status"], "passed")
            metrics = run.read_json(run_dir / "metrics.json")
            metrics["campaign_complexity"]["semantic_interactions"] = 14
            run.write_json(run_dir / "metrics.json", metrics)
            with self.assertRaises(run.HarnessError) as caught:
                run.validate_complexity_metrics(run_dir, "medium")
            self.assertNotIsInstance(caught.exception, run.GateRejected)

            metrics["campaign_complexity"]["semantic_interactions"] = 18
            run.write_json(run_dir / "metrics.json", metrics)
            coverage = run.read_json(
                run_dir / "validation/contract-coverage.json"
            )
            coverage["ownership_audit"][0]["owner_local_facts"] = [
                "different.fact"
            ]
            run.write_json(
                run_dir / "validation/contract-coverage.json", coverage
            )
            with self.assertRaisesRegex(run.HarnessError, "do not match"):
                run.validate_complexity_metrics(run_dir, "medium")

    def test_complexity_metrics_require_true_json_integers(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            (run_dir / "evaluation").mkdir()
            (run_dir / "validation").mkdir()
            metric_owners = [ownership_record("qualifier"), ownership_record("arbiter")]
            analyzer_owners = [
                ownership_record("qualifier", analyzer=True),
                ownership_record("arbiter", analyzer=True),
            ]
            base = {
                "tier": "medium",
                "counting_rules": "campaign-v1",
                "semantic_usages": 9,
                "semantic_interactions": 18,
                "nontrivial_contract_cases": 16,
                "scenario_families": 7,
                "ownership_audit": metric_owners,
                "features": {
                    "multiple_decision_owners": True,
                    "priority_conflict": True,
                },
            }
            run.write_json(
                run_dir / "validation/contract-coverage.json",
                {"status": "passed", "ownership_audit": analyzer_owners},
            )
            for invalid in ("9", 9.75, True, None):
                with self.subTest(invalid=invalid):
                    run.write_json(
                        run_dir / "metrics.json",
                        {"campaign_complexity": {**base, "semantic_usages": invalid}},
                    )
                    with self.assertRaisesRegex(
                        run.HarnessError,
                        "campaign_complexity.semantic_usages must be an integer",
                    ):
                        run.validate_complexity_metrics(run_dir, "medium")

            run.write_json(
                run_dir / "metrics.json", {"campaign_complexity": base}
            )
            self.assertEqual(
                run.validate_complexity_metrics(run_dir, "medium")["observed"][
                    "semantic_usages"
                ],
                9,
            )

    def test_ownership_audit_is_structural_and_fail_closed(self) -> None:
        valid = ownership_record("owner")
        records = run.validate_ownership_audit([valid])
        self.assertEqual(set(records), {"owner"})

        missing_fact = {**valid, "owner_local_facts": []}
        with self.assertRaisesRegex(run.HarnessError, "owner_local_facts"):
            run.validate_ownership_audit([missing_fact])

        unsupported_role = {**valid, "claimed_roles": ["forwarder"]}
        with self.assertRaisesRegex(run.HarnessError, "unsupported roles"):
            run.validate_ownership_audit([unsupported_role])

        analyzer_record = ownership_record("owner", analyzer=True)
        analyzer_record["passed"] = False
        with self.assertRaisesRegex(run.HarnessError, "did not pass ownership audit"):
            run.validate_ownership_audit([analyzer_record], analyzer=True)

    def test_seed_length_and_heading_spelling_are_advisory(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "source.md"
            source.write_text("source brief\n", encoding="utf-8")
            seed = root / "seed.md"
            items = "\n".join(
                f"{prefix}-01: Bounded evidence."
                for prefix in (
                    "NEED", "PURPOSE", "STAKE", "CTX", "MON",
                    "CTRL", "REQ", "SCN", "ASM", "EXCL",
                )
            )
            seed.write_text(
                "---\nseed_id: advisory-v1\nversion: 1\nstatus: frozen\ncomplexity: medium\n---\n"
                "# Advisory seed\n\n## Source provenance\nPinned source.\n\n"
                f"{items}\n\n## Architecture choices\nCompare allocations.\n\n"
                "## Size targets\nMedium.\n\n## Evidence limits\nBounded only.\n\n"
                + realizability_sections(15)
                + ("Additional source-grounded detail. " * 400),
                encoding="utf-8",
            )
            report = run.validate_generated_seed(seed, source, "medium")
            self.assertEqual(report["status"], "passed")
            self.assertGreaterEqual(len(report["advisories"]), 2)

    def test_wire_equivalent_model_protocols_are_normalized(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp)
            (run_dir / "validation").mkdir()
            run.write_json(run_dir / "traceability.json", {"coverage_status": "complete"})
            coverage, trace, changes = run.normalize_model_protocols(
                run_dir, {"passed": True}, {"coverage_status": "complete"}
            )
            self.assertEqual(coverage["status"], "passed")
            self.assertEqual(trace["status"], "complete")
            self.assertEqual(trace["missing_ids"], [])
            self.assertTrue(changes)
            self.assertTrue(
                (run_dir / "validation/protocol-normalization.json").is_file()
            )

    def test_model_ownership_wire_schema_is_campaign_only(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            run_dir = workspace / "run"
            source = run_dir / "model/Example.sysml"
            source.parent.mkdir(parents=True)
            source.write_text("package Example {}\n", encoding="utf-8")
            analyzer = run_dir / "validation/bounded-analysis.mjs"
            analyzer.parent.mkdir(parents=True)
            analyzer.write_text("console.log('{}');\n", encoding="utf-8")
            for relative in (
                "validation/architecture-stage/tipe.txt",
                "validation/final-tipe.txt",
            ):
                path = run_dir / relative
                path.parent.mkdir(parents=True, exist_ok=True)
                path.write_text("Well-formed!\n", encoding="utf-8")
            run.write_json(
                run_dir / "traceability.json",
                {
                    "status": "complete",
                    "missing_ids": [],
                    "unexplained_trace_ids": [],
                    "unannotated_significant_elements": [],
                },
            )
            paths = run.Paths(
                workspace=workspace,
                synthesizer=workspace / "src/synthesizer",
                harness=workspace / "src/synthesizer",
                experiment=workspace / "cps48",
                runs=workspace / "cps48/runs",
                docs=workspace / "docs",
                sysml_viz=workspace / "sysml-viz",
                library=workspace / "library",
                trusted=workspace / "trusted",
            )
            args = Namespace(
                sireum_bin="sireum",
                node_bin="node",
                tool_timeout=30,
            )
            coverage = {
                "status": "passed",
                "source_sha256": run.sha256_file(source),
                "observations": {},
                "checks": {},
            }

            def completed(command: list[str], **_: object) -> Namespace:
                if command[0] == "node":
                    return Namespace(
                        returncode=0, stdout=json.dumps(coverage), stderr=""
                    )
                return Namespace(returncode=0, stdout="Well-formed!\n", stderr="")

            run.write_json(run_dir / "run-config.json", {"profile": None})
            with mock.patch.object(run.subprocess, "run", side_effect=completed):
                checked, _ = run.run_mechanical_model_checks(
                    args,
                    paths,
                    run_dir,
                    {"canonical_source": "model/Example.sysml"},
                )
            self.assertEqual(checked, source)

            run.write_json(
                run_dir / "run-config.json",
                {"profile": None, "seed_generated": True, "complexity": "small"},
            )
            with (
                mock.patch.object(run.subprocess, "run", side_effect=completed),
                self.assertRaisesRegex(run.HarnessError, "ownership_audit"),
            ):
                run.run_mechanical_model_checks(
                    args,
                    paths,
                    run_dir,
                    {"canonical_source": "model/Example.sysml"},
                )

    def test_generated_seed_complexity_must_match_campaign(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "source.md"
            source.write_text("source brief\n", encoding="utf-8")
            seed = root / "seed.md"
            items = "\n".join(
                f"{prefix}-01: Bounded evidence." for prefix in
                ("NEED", "PURPOSE", "STAKE", "CTX", "MON", "CTRL", "REQ", "SCN", "ASM", "EXCL")
            )
            seed.write_text(
                "---\nseed_id: tier-test-v1\nversion: 1\nstatus: frozen\ncomplexity: small\n---\n"
                "# Tier test\n\n## Source basis\nPinned source.\n\n"
                f"{items}\n\n## Required design consideration\nCompare alternatives.\n\n"
                "## Structural bounds\nFive to eight usages.\n\n## Claim boundary\nBounded only.\n\n"
                + realizability_sections(7)
                + ("Implementation-independent finite behavior. " * 30),
                encoding="utf-8",
            )
            self.assertEqual(
                run.validate_generated_seed(seed, source, "small")["complexity"], "small"
            )
            with self.assertRaises(run.HarnessError):
                run.validate_generated_seed(seed, source, "hard")

    def test_generated_seed_validation_is_minimal_and_fail_closed(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "source.md"
            source.write_text("source brief\n", encoding="utf-8")
            seed = root / "seed.md"
            items = "\n".join(
                [
                    "NEED-01: Need a bounded controller.",
                    "PURPOSE-01: Select an observable response.",
                    "STAKE-01: An operator observes the response.",
                    "CTX-01: A finite environment provides inputs.",
                    "MON-01: A monitored input is available.",
                    "CTRL-01: A controlled output is produced.",
                    "REQ-01: Invalid input produces a conservative output.",
                    "SCN-01: Exercise nominal and invalid input.",
                    "ASM-01: Inputs are stable for one logical decision.",
                    "EXCL-01: No physical-performance claim is made.",
                ]
            )
            seed.write_text(
                "---\nseed_id: test-v1\nversion: 1\nstatus: frozen\ncomplexity: small\n---\n"
                "# Test seed\n\n## Source basis\nPinned source.\n\n"
                f"{items}\n\n## Required design consideration\nCompare two allocations.\n\n"
                "## Structural bounds\nUse five to eight meaningful usages.\n\n"
                "## Claim boundary\nThis is bounded model evidence only.\n\n"
                + realizability_sections(7)
                + ("The finite policy remains implementation independent. " * 24),
                encoding="utf-8",
            )
            report = run.validate_generated_seed(seed, source)
            self.assertEqual(report["status"], "passed")
            seed.write_text(seed.read_text(encoding="utf-8") + '\npart def Forbidden {}\n', encoding="utf-8")
            with self.assertRaises(run.HarnessError):
                run.validate_generated_seed(seed, source)

    def test_generated_seed_read_and_front_matter_failures_are_harness_errors(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "source.md"
            source.write_text("source brief\n", encoding="utf-8")
            missing = root / "missing-seed.md"
            with self.assertRaisesRegex(run.HarnessError, "missing or unreadable"):
                run.validate_generated_seed(missing, source, "small")

            malformed = root / "malformed-seed.md"
            malformed.write_text("---\nseed_id: malformed\n", encoding="utf-8")
            with self.assertRaisesRegex(run.HarnessError, "invalid YAML front matter"):
                run.validate_generated_seed(malformed, source, "small")

    def test_repeated_missing_generated_seed_checkpoints_with_closed_status(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            experiment = workspace / "cps48"
            run_dir = experiment / "runs/run-1"
            source = experiment / "seeds/sources/source.md"
            seed = run_dir / "seed.md"
            source.parent.mkdir(parents=True)
            source.write_text("source brief\n", encoding="utf-8")
            (run_dir / "evaluation").mkdir(parents=True)
            run.write_json(
                run_dir / "run-config.json",
                {
                    "run_id": "run-1",
                    "seed": str(seed),
                    "seed_sha256": None,
                    "seed_generated": True,
                    "seed_source": str(source),
                    "seed_source_sha256": run.sha256_file(source),
                    "model": "test-model",
                    "reasoning_effort": "high",
                    "profile": None,
                    "complexity": "small",
                    "created_at": "2026-08-11T10:00:00Z",
                },
            )
            run.write_json(
                run_dir / "status.json",
                {"run_id": "run-1", "status": "in-progress", "terminal": False},
            )
            paths = run.Paths(
                workspace=workspace,
                synthesizer=workspace / "src/synthesizer",
                harness=workspace / "src/synthesizer",
                experiment=experiment,
                runs=experiment / "runs",
                docs=workspace / "docs",
                sysml_viz=workspace / "sysml-viz",
                library=workspace / "library",
                trusted=workspace / "trusted",
                corpus=workspace / "corpus",
            )
            usage = {
                "input_tokens": 1,
                "cached_input_tokens": 0,
                "cache_write_input_tokens": 0,
                "output_tokens": 1,
                "reasoning_output_tokens": 0,
                "total_tokens": 2,
            }
            args = Namespace(
                seed_source=str(source),
                resume_run=None,
                model="test-model",
                seed_only=True,
                publish_seed=str(experiment / "seeds/test.md"),
            )
            with (
                mock.patch.object(run, "discover_paths", return_value=paths),
                mock.patch.object(
                    run,
                    "new_seeded_run",
                    return_value=(run_dir, "run-1", source, seed),
                ),
                mock.patch.object(
                    run,
                    "run_agent_stage",
                    return_value=({"disposition": "passed"}, usage),
                ) as stage,
                mock.patch.object(run.shutil, "which", return_value=None),
            ):
                result = run.execute(args)

            self.assertEqual(result, run_dir)
            self.assertEqual(stage.call_count, 2)
            status = run.read_json(run_dir / "status.json")
            self.assertEqual(status["status"], "incomplete")
            self.assertFalse(status["terminal"])
            self.assertEqual(status["checkpoint_stage"], "seed-generate")
            self.assertIn("repeated the same validation diagnostic", status["reason"])
            self.assertTrue(
                (run_dir / "evaluation/seed-validation-feedback.md").is_file()
            )

    def test_generated_seed_requires_a_recounted_realizability_audit(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "source.md"
            source.write_text("source brief\n", encoding="utf-8")
            seed = root / "seed.md"
            identifiers = "\n".join(
                f"{prefix}-01: Finite source-grounded behavior."
                for prefix in (
                    "NEED", "PURPOSE", "STAKE", "CTX", "MON",
                    "CTRL", "REQ", "SCN", "ASM", "EXCL",
                )
            )
            base = (
                "---\nseed_id: audit-v1\nversion: 1\nstatus: frozen\ncomplexity: small\n---\n"
                "# Audit seed\n\n## Source basis\nPinned source.\n\n"
                f"{identifiers}\n\n## Required design consideration\nCompare allocations.\n\n"
                "## Structural bounds\nSmall bounds.\n\n## Claim boundary\nBounded only.\n\n"
            )

            seed.write_text(base + realizability_sections(7), encoding="utf-8")
            report = run.validate_generated_seed(seed, source, "small")
            self.assertEqual(
                report["realizability_audit"]["semantic_interactions"], 7
            )

            seed.write_text(
                (base + realizability_sections(7)).replace(
                    "AUDIT-OWNERS: passed", "AUDIT-OWNERS: pending"
                ),
                encoding="utf-8",
            )
            with self.assertRaisesRegex(run.HarnessError, "AUDIT-OWNERS"):
                run.validate_generated_seed(seed, source, "small")

            seed.write_text(
                (base + realizability_sections(7)).replace(
                    "recounted 7", "recounted 8"
                ),
                encoding="utf-8",
            )
            with self.assertRaisesRegex(run.HarnessError, "recount says 8"):
                run.validate_generated_seed(seed, source, "small")

            seed.write_text(base + realizability_sections(15), encoding="utf-8")
            with self.assertRaisesRegex(run.HarnessError, r"small requires 7\.\.14"):
                run.validate_generated_seed(seed, source, "small")

            seed.write_text(
                (base + realizability_sections(7)).replace(
                    "INT-07:", "INT-08:"
                ),
                encoding="utf-8",
            )
            with self.assertRaisesRegex(run.HarnessError, "consecutive from INT-01"):
                run.validate_generated_seed(seed, source, "small")

            seed.write_text(
                (base + realizability_sections(7)).replace(
                    "INT-07:", "- INT-07:"
                ),
                encoding="utf-8",
            )
            with self.assertRaisesRegex(run.HarnessError, "unbulleted line"):
                run.validate_generated_seed(seed, source, "small")

    def test_seed_instructions_move_exact_realizability_to_designer(self) -> None:
        repository = Path(run.__file__).resolve().parents[2]
        prompt = (
            Path(run.__file__).resolve().parent / "prompts" / "seed-generate.md"
        ).read_text(encoding="utf-8").lower()
        guidelines = (
            repository / "src" / "synthesizer" / "guidelines" / "SEED_GUIDELINES.md"
        ).read_text(encoding="utf-8").lower()
        designer = (
            Path(run.__file__).resolve().parent / "prompts" / "designer-initial.md"
        ).read_text(encoding="utf-8").lower()
        for text in (prompt, guidelines):
            self.assertIn("reusable", text)
            self.assertIn("tier", text)
            self.assertIn("exact", text)
        self.assertIn("audit every decision/state/case owner", designer)
        self.assertIn("recount the complete", designer)
        self.assertIn("tier-specific specification", designer)

    def test_diversity_gate_requires_new_purpose_and_two_dimensions(self) -> None:
        config = {"diversity_card": "frozen baseline constraints"}
        valid = {
            "diversity": {
                "selected_primary_scope": "battery evidence coordinator",
                "closest_baseline": "lifecycle governor",
                "primary_scope_differs": True,
                "controlled_purpose_differs": True,
                "differing_dimensions": ["boundary", "state_ownership"],
                "why_not_extension_or_rename": "It owns evidence, not lifecycle state.",
            }
        }
        run.validate_designer_diversity(valid, config)
        run.validate_designer_diversity({}, {"diversity_card": None})
        with self.assertRaisesRegex(run.GateRejected, "lacks diversity evidence"):
            run.validate_designer_diversity({}, config)
        one_dimension = json.loads(json.dumps(valid))
        one_dimension["diversity"]["differing_dimensions"] = ["boundary"]
        with self.assertRaisesRegex(run.GateRejected, "fewer than two"):
            run.validate_designer_diversity(one_dimension, config)
        same_purpose = json.loads(json.dumps(valid))
        same_purpose["diversity"]["controlled_purpose_differs"] = False
        with self.assertRaisesRegex(run.GateRejected, "controlled purpose"):
            run.validate_designer_diversity(same_purpose, config)

    def test_owner_padding_guardrails_span_generation_and_review_prompts(self) -> None:
        prompt_dir = Path(run.__file__).resolve().parent / "prompts"
        model_generate = (prompt_dir / "model-generate.md").read_text(
            encoding="utf-8"
        ).lower()
        model_review = (prompt_dir / "model-review.md").read_text(
            encoding="utf-8"
        ).lower()
        designer_final = (prompt_dir / "designer-final.md").read_text(
            encoding="utf-8"
        ).lower()

        self.assertIn("ownership_audit", model_generate)
        self.assertIn("owner_local_facts", model_generate)
        self.assertIn("identity wrappers, not ownership", model_generate)
        self.assertIn("recomputes the final result centrally", model_generate)
        self.assertIn("identity wrapper", model_review)
        self.assertIn("behavior owner", model_review)
        self.assertIn("owner-local derivation", model_review)
        self.assertIn("one-to-one enum or code mapping", model_review)
        self.assertIn("outputcode == inputcode", model_review)
        self.assertIn("you must reject", designer_final)
        self.assertIn("campaign_complexity.ownership_audit", designer_final)
        self.assertIn("reproduces that identity wrapper", designer_final)

    def test_seed_prompt_matches_advisory_length_and_heading_policy(self) -> None:
        prompt = (
            Path(run.__file__).resolve().parent / "prompts" / "seed-generate.md"
        ).read_text(encoding="utf-8")
        self.assertIn("800 to 6,000 characters", prompt)
        self.assertIn("exact source provenance", prompt)
        self.assertIn("scope: reusable", prompt)
        self.assertIn("Use exactly these content headings", prompt)

    def test_owner_padding_policy_is_normative_in_role_guidelines(self) -> None:
        repository = Path(run.__file__).resolve().parents[2]
        model_guidelines = (
            repository / "src/synthesizer/guidelines/MODEL_AGENT_GUIDELINES.md"
        ).read_text(encoding="utf-8").lower()
        designer_guidelines = (
            repository / "src/synthesizer/guidelines/DESIGNER_AGENT_GUIDELINES.md"
        ).read_text(encoding="utf-8").lower()
        plan = (
            repository / "src/synthesizer/guidelines/LLM_FIRST_GENERATOR_PLAN.md"
        ).read_text(encoding="utf-8").lower()

        self.assertIn("m-17 — do not count identity wrappers", model_guidelines)
        self.assertIn("identity wrappers", model_guidelines)
        self.assertIn(
            "neither owner credit nor semantic-usage credit", model_guidelines
        )
        self.assertIn("bijective enum or integer-code translation", model_guidelines)
        self.assertIn("`outputcode == inputcode`", model_guidelines)
        self.assertIn("d-17 — reject owner-count padding", designer_guidelines)
        self.assertIn("one-to-one finite mapping", designer_guidelines)
        self.assertIn("`designer-rejected`", designer_guidelines)
        self.assertIn("reduced confidence note", designer_guidelines)
        self.assertIn("responsibility ownership is behavioral", plan)

    def test_repair_owner_prompts_consume_authoritative_handoff(self) -> None:
        prompt_dir = Path(run.__file__).resolve().parent / "prompts"
        for name, stage in (
            ("designer-initial.md", "designer-initial"),
            ("designer-resolution.md", "designer-resolution"),
            ("model-generate.md", "model-generate"),
            ("visualize.md", "visualize"),
        ):
            with self.subTest(prompt=name):
                text = (prompt_dir / name).read_text(encoding="utf-8")
                self.assertIn("$REPAIR_REQUEST", text)
                self.assertIn(stage, text)

    def test_model_data_record_representation_guardrail_is_explicit(self) -> None:
        repository = Path(run.__file__).resolve().parents[2]
        prompt = (
            Path(run.__file__).resolve().parent / "prompts" / "model-generate.md"
        ).read_text(encoding="utf-8").lower()
        guidelines = (
            repository / "src/synthesizer/guidelines/MODEL_AGENT_GUIDELINES.md"
        ).read_text(encoding="utf-8").lower()

        for text in (prompt, guidelines):
            self.assertIn("data` record type", text)
            self.assertIn("`attribute`", text)
            self.assertIn("nested `part`", text)
            self.assertIn("member-not-found", text)
            self.assertIn("type declaration", text)
            self.assertIn("merely renaming", text)
            self.assertIn("semantic interaction", text)
            self.assertIn("owner-local facts", text)

    def test_resume_continues_after_last_complete_stage(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            experiment = workspace / "cps48"
            run_dir = experiment / "runs" / "run-1"
            (run_dir / "decisions").mkdir(parents=True)
            seed = experiment / "seeds" / "seed.md"
            seed.parent.mkdir()
            seed.write_text("seed\n", encoding="utf-8")
            (run_dir / "status.json").write_text(
                '{"status":"in-progress","terminal":false}\n', encoding="utf-8"
            )
            run.write_json(
                run_dir / "run-config.json",
                {
                    "run_id": "run-1",
                    "seed": str(seed),
                    "seed_sha256": run.sha256_file(seed),
                    "model": "test-model",
                    "reasoning_effort": "high",
                },
            )
            run.write_json(run_dir / "decisions" / "designer-initial.json", {"status": "passed"})
            run.write_json(
                run_dir / "stage-usage.json",
                {"designer-initial": {"input_tokens": 1, "output_tokens": 1}},
            )
            paths = run.Paths(
                workspace=workspace,
                synthesizer=workspace / "src" / "synthesizer",
                harness=workspace / "src" / "synthesizer",
                experiment=experiment,
                runs=experiment / "runs",
                docs=workspace / "docs",
                sysml_viz=workspace / "sysml-viz",
                library=workspace / "library",
                trusted=workspace / "trusted",
            )
            result = run.resume_run(
                Namespace(resume_run=str(run_dir), model="test-model", reasoning_effort="high"),
                paths,
            )
            self.assertEqual(result[1], "run-1")
            self.assertEqual(result[5], 1)
            self.assertEqual(run.STAGES[result[5]].name, "model-review")

    def test_resume_retries_checkpointed_visualization_stage(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            experiment = workspace / "cps48"
            run_dir = experiment / "runs" / "run-1"
            (run_dir / "decisions").mkdir(parents=True)
            seed = experiment / "seeds" / "seed.md"
            seed.parent.mkdir()
            seed.write_text("seed\n", encoding="utf-8")
            run.write_json(
                run_dir / "status.json",
                {
                    "status": "awaiting-visualization",
                    "terminal": False,
                    "checkpoint_stage": "visualize",
                },
            )
            run.write_json(
                run_dir / "run-config.json",
                {
                    "run_id": "run-1",
                    "seed": str(seed),
                    "seed_sha256": run.sha256_file(seed),
                    "model": "test-model",
                    "reasoning_effort": "high",
                },
            )
            usage: dict[str, dict[str, int]] = {}
            for stage in run.STAGES[:4]:
                run.write_json(
                    run_dir / stage.decision,
                    {"disposition": stage.dispositions[0]},
                )
                usage[stage.name] = {"input_tokens": 1, "output_tokens": 1}
            run.write_json(
                run_dir / run.STAGES[4].decision,
                {"disposition": "visualization-rejected"},
            )
            usage["visualize"] = {"input_tokens": 1, "output_tokens": 1}
            run.write_json(run_dir / "stage-usage.json", usage)
            paths = run.Paths(
                workspace=workspace,
                synthesizer=workspace / "src" / "synthesizer",
                harness=workspace / "src" / "synthesizer",
                experiment=experiment,
                runs=experiment / "runs",
                docs=workspace / "docs",
                sysml_viz=workspace / "sysml-viz",
                library=workspace / "library",
                trusted=workspace / "trusted",
            )
            result = run.resume_run(
                Namespace(
                    resume_run=str(run_dir),
                    model="test-model",
                    reasoning_effort="high",
                ),
                paths,
            )
            self.assertEqual(run.STAGES[result[5]].name, "visualize")

    def test_resume_can_retry_an_unfrozen_seed_stage(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            experiment = workspace / "cps48"
            run_dir = experiment / "runs/run-1"
            run_dir.mkdir(parents=True)
            seed = run_dir / "seed.md"
            run.write_json(
                run_dir / "status.json",
                {
                    "status": "incomplete",
                    "terminal": False,
                    "checkpoint_stage": "seed-generate",
                },
            )
            run.write_json(
                run_dir / "run-config.json",
                {
                    "run_id": "run-1",
                    "seed": str(seed),
                    "seed_sha256": None,
                    "seed_generated": True,
                    "model": "test-model",
                    "reasoning_effort": "high",
                },
            )
            paths = run.Paths(
                workspace=workspace,
                synthesizer=workspace / "src/synthesizer",
                harness=workspace / "src/synthesizer",
                experiment=experiment,
                runs=experiment / "runs",
                docs=workspace / "docs",
                sysml_viz=workspace / "sysml-viz",
                library=workspace / "library",
                trusted=workspace / "trusted",
            )
            result = run.resume_run(
                Namespace(
                    resume_run=str(run_dir),
                    model="test-model",
                    reasoning_effort="high",
                ),
                paths,
            )
            self.assertEqual(result[5], -1)

    def test_parse_args_accepts_custom_run_parent(self) -> None:
        args = run.parse_args(
            ["--seed", "/tmp/example-seed.md", "--run-parent", "agent_experiments/poc"]
        )
        self.assertEqual(args.run_parent, "agent_experiments/poc")

    def test_resume_accepts_recorded_custom_run_parent(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            experiment = workspace / "cps48"
            custom_parent = workspace / "agent_experiments/poc/synthesis"
            run_dir = custom_parent / "run-1"
            run_dir.mkdir(parents=True)
            seed = experiment / "seeds/seed.md"
            seed.parent.mkdir(parents=True)
            seed.write_text("seed\n", encoding="utf-8")
            run.write_json(
                run_dir / "status.json",
                {"status": "in-progress", "terminal": False},
            )
            run.write_json(
                run_dir / "run-config.json",
                {
                    "run_id": "run-1",
                    "run_parent": str(custom_parent),
                    "seed": str(seed),
                    "seed_sha256": run.sha256_file(seed),
                    "model": "test-model",
                    "reasoning_effort": "high",
                },
            )
            paths = run.Paths(
                workspace=workspace,
                synthesizer=workspace / "src/synthesizer",
                harness=workspace / "src/synthesizer",
                experiment=experiment,
                runs=experiment / "runs",
                docs=workspace / "docs",
                sysml_viz=workspace / "sysml-viz",
                library=workspace / "library",
                trusted=workspace / "trusted",
            )
            result = run.resume_run(
                Namespace(
                    resume_run=str(run_dir),
                    run_parent=None,
                    model="test-model",
                    reasoning_effort="high",
                ),
                paths,
            )
            self.assertEqual(result[0], run_dir)
            self.assertEqual(result[5], 0)

    def test_mutation_allowlist_reports_only_violations(self) -> None:
        before = {"status.json": "a", "model/old.sysml": "x"}
        after = {
            "status.json": "b",
            "model/old.sysml": "y",
            "validation/final-tipe.txt": "z",
        }
        violations = run.validate_agent_mutations(
            before,
            after,
            ("model/**", "validation/**"),
        )
        self.assertEqual(violations, ["status.json"])

    def test_well_formed_allows_disclosed_no_error_summary(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            path = Path(temp) / "tipe.txt"
            path.write_text(
                "warning: Dispatch Protocol unspecified\nWell-formed!\n"
                "assessment: passed (no error diagnostic)\n",
                encoding="utf-8",
            )
            run.require_well_formed(path)

    def test_well_formed_rejects_actual_error_diagnostic(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            path = Path(temp) / "tipe.txt"
            path.write_text(
                "/tmp/model.sysml:12:4: error: incompatible port\nWell-formed!\n",
                encoding="utf-8",
            )
            with self.assertRaises(run.HarnessError):
                run.require_well_formed(path)

    def test_decision_validation_is_fail_closed(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            path = Path(temp) / "decision.json"
            path.write_text('{"disposition":"surprise"}\n', encoding="utf-8")
            with self.assertRaises(run.HarnessError):
                run.validate_decision(path, ("accepted", "rejected"))

    def test_visualization_prompt_requires_current_validation_and_resume_feedback(self) -> None:
        prompt = (
            Path(run.__file__).parent / "prompts" / "visualize.md"
        ).read_text(encoding="utf-8")
        self.assertIn("$RUN_DIR/designer-validation.md", prompt)
        self.assertIn("model validate", prompt)
        self.assertIn("session inspect", prompt)
        self.assertIn("session.validation.status` is exactly `valid`", prompt)

    def test_usage_svg_is_generated_without_plot_dependency(self) -> None:
        report = {
            "run_id": "example",
            "agents": [
                {
                    "role": role,
                    "token_matrix": {
                        "cached": {"input": 100, "output": 0},
                        "non_cached": {"input": 20, "output": 5},
                        "totals": {"input": 120, "output": 5, "overall": 125},
                    },
                }
                for role in ("designer", "model", "visualization")
            ],
            "aggregate": {
                "token_matrix": {
                    "cached": {"input": 300, "output": 0},
                    "non_cached": {"input": 60, "output": 15},
                    "totals": {"input": 360, "output": 15, "overall": 375},
                }
            },
        }
        with tempfile.TemporaryDirectory() as temp:
            path = Path(temp) / "usage.svg"
            run.create_usage_svg(report, path)
            text = path.read_text(encoding="utf-8")
            self.assertIn("Token usage by agent", text)
            self.assertIn("Designer", text)
            self.assertIn("375", text)


if __name__ == "__main__":
    unittest.main()
