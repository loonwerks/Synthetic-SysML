from __future__ import annotations

import json
import subprocess
import tempfile
import unittest
from pathlib import Path
from unittest import mock

from synthesizer import campaign


class CampaignTests(unittest.TestCase):
    def test_summary_reads_compacted_timing_and_complexity(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            run_dir = Path(temp) / "accepted"
            run_dir.mkdir()
            (run_dir / "run-config.json").write_text(
                json.dumps({"complexity": "small", "replicate": 1}),
                encoding="utf-8",
            )
            (run_dir / "agent-token-usage.json").write_text(
                json.dumps(
                    {
                        "aggregate": {
                            "token_matrix": {
                                "totals": {"overall": 12, "input": 10, "output": 2}
                            }
                        },
                        "timing": {"summed_agent_stage_seconds": 7.5},
                    }
                ),
                encoding="utf-8",
            )
            (run_dir / "metrics.json").write_text(
                json.dumps(
                    {
                        "campaign_complexity": {
                            "semantic_usages": 5,
                            "semantic_interactions": 7,
                            "nontrivial_contract_cases": 6,
                            "scenario_families": 4,
                        }
                    }
                ),
                encoding="utf-8",
            )
            result = {
                "cell_id": "family-small-r1",
                "attempt": 1,
                "run_dir": str(run_dir),
                "status": "accepted",
                "semantic_status": "passed",
                "visualization_status": "passed",
                "dataset_ready": True,
                "batch_elapsed_seconds": 9.0,
            }
            report, _, markdown = campaign.summarize_results(
                {"campaign_id": "test"},
                "batch",
                [result],
                {"family-small-r1"},
            )
            row = report["rows"][0]
            self.assertEqual(row["agent_seconds"], 7.5)
            self.assertEqual(row["semantic_usages"], 5)
            self.assertEqual(row["total_tokens"], 12)
            self.assertIn("7.5", markdown)

    def test_campaign_resumes_same_checkpointed_run(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            run_dir = workspace / "cps48/runs/run-1"
            run_dir.mkdir(parents=True)
            source = workspace / "source.md"
            source.write_text("brief\n", encoding="utf-8")
            seed = workspace / "seed.md"
            seed.write_text("frozen reusable seed\n", encoding="utf-8")
            cell = campaign.Cell(
                "batch", "drone", "small", 1, 1, 5000, source,
                seed, campaign.run.sha256_file(seed),
            )
            calls = 0

            def invoke(*args: object, **kwargs: object) -> subprocess.CompletedProcess[str]:
                nonlocal calls
                calls += 1
                if calls == 1:
                    status = {
                        "status": "awaiting-visualization",
                        "terminal": False,
                        "checkpoint_stage": "visualize",
                        "reason": "crossing remains",
                    }
                else:
                    status = {
                        "status": "accepted",
                        "terminal": True,
                        "reason": "passed",
                    }
                (run_dir / "status.json").write_text(
                    json.dumps(status), encoding="utf-8"
                )
                return subprocess.CompletedProcess(
                    args=[], returncode=0, stdout=f"{run_dir}\n", stderr=""
                )

            manifest = {
                "campaign_id": "test",
                "model": "test-model",
                "reasoning_effort": "high",
                "stage_watchdogs": {"small": 0},
            }
            with mock.patch.object(campaign.subprocess, "run", side_effect=invoke):
                _, result = campaign.run_command(workspace, manifest, cell, None)
            self.assertEqual(calls, 2)
            self.assertEqual(result["status"], "accepted")
            self.assertEqual(result["run_dir"], "cps48/runs/run-1")

    def test_run_command_uses_shared_seed_not_seed_source(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            run_dir = workspace / "cps48/runs/run-1"
            run_dir.mkdir(parents=True)
            source = workspace / "source.md"
            source.write_text("brief\n", encoding="utf-8")
            seed = workspace / "seed.md"
            seed.write_text("frozen reusable seed\n", encoding="utf-8")
            cell = campaign.Cell(
                "batch", "drone", "hard", 1, 1, 5000, source,
                seed, campaign.run.sha256_file(seed),
            )
            (run_dir / "status.json").write_text(
                json.dumps({"status": "accepted", "terminal": True}),
                encoding="utf-8",
            )
            captured: list[str] = []

            def invoke(command: list[str], **kwargs: object) -> subprocess.CompletedProcess[str]:
                captured.extend(command)
                return subprocess.CompletedProcess(
                    args=command, returncode=0, stdout=f"{run_dir}\n", stderr=""
                )

            manifest = {"campaign_id": "test", "model": "m", "reasoning_effort": "high"}
            with mock.patch.object(campaign.subprocess, "run", side_effect=invoke):
                campaign.run_command(workspace, manifest, cell, None)
            self.assertIn("--seed", captured)
            self.assertNotIn("--seed-source", captured)
            self.assertEqual(captured[captured.index("--seed") + 1], str(seed))

    def test_campaign_continues_when_same_diagnostic_has_candidate_progress(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            workspace = Path(temp)
            run_dir = workspace / "cps48/runs/run-1"
            run_dir.mkdir(parents=True)
            seed = workspace / "seed.md"
            seed.write_text("seed\n", encoding="utf-8")
            cell = campaign.Cell(
                "batch", "family", "small", 1, 1, 5000, None,
                seed, campaign.run.sha256_file(seed),
            )
            calls = 0

            def invoke(*args: object, **kwargs: object) -> subprocess.CompletedProcess[str]:
                nonlocal calls
                calls += 1
                status = (
                    {
                        "status": "incomplete",
                        "terminal": False,
                        "checkpoint_stage": "model-generate",
                        "reason": "same type error",
                        "repair_progress_fingerprint": f"revision-{calls}",
                    }
                    if calls < 3
                    else {"status": "accepted", "terminal": True}
                )
                (run_dir / "status.json").write_text(
                    json.dumps(status), encoding="utf-8"
                )
                return subprocess.CompletedProcess(
                    args=[], returncode=0, stdout=f"{run_dir}\n", stderr=""
                )

            manifest = {"campaign_id": "test", "model": "m", "reasoning_effort": "high"}
            with mock.patch.object(campaign.subprocess, "run", side_effect=invoke):
                _, result = campaign.run_command(workspace, manifest, cell, None)
            self.assertEqual(calls, 3)
            self.assertEqual(result["status"], "accepted")

    def test_expand_batch_assigns_one_isolated_port_per_worker_wave(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "source.md"
            source.write_text("brief\n", encoding="utf-8")
            manifest_path = root / "manifest.json"
            manifest = {
                "schema_version": 1,
                "campaign_id": "test",
                "max_workers": 3,
                "families": {"drone": {"seed_source": "source.md"}},
                "batches": [
                    {
                        "batch_id": "review",
                        "family_id": "drone",
                        "complexities": ["small", "medium", "hard"],
                        "replicates": [1],
                        "base_port": 5000,
                    }
                ],
            }
            manifest_path.write_text(json.dumps(manifest), encoding="utf-8")
            cells = campaign.expand_batch(manifest, manifest_path, "review")
            self.assertEqual([cell.cell_id for cell in cells], [
                "drone-small-r1", "drone-medium-r1", "drone-hard-r1"
            ])
            self.assertEqual([cell.port for cell in cells], [5000, 5001, 5002])

    def test_full_manifest_plans_48_cells(self) -> None:
        root = Path(__file__).resolve().parents[2]
        manifest_path = (
            root / "cps48/manifest.json"
        )
        manifest = campaign.read_manifest(manifest_path)
        count = sum(
            len(campaign.expand_batch(manifest, manifest_path, batch["batch_id"]))
            for batch in manifest["batches"]
        )
        self.assertEqual(count, 48)
        self.assertEqual(
            manifest["stage_watchdogs"],
            {"small": 0, "medium": 0, "hard": 0},
        )
        self.assertNotIn("stage_timeouts", manifest)
        drone_r2 = campaign.expand_batch(
            manifest, manifest_path, "batch-01-drone-replicate-2"
        )
        self.assertTrue(all(cell.diversity_card is not None for cell in drone_r2))
        self.assertEqual(len({cell.diversity_card for cell in drone_r2}), 1)


if __name__ == "__main__":
    unittest.main()
