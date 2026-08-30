from __future__ import annotations

from collections import Counter
import hashlib
import json
import os
from pathlib import Path
import tempfile
import unittest
import xml.etree.ElementTree as ET

from scripts.analysis import aadl_coverage as coverage
from scripts.analysis import aadl_coverage_plots as plots


def _option(value: object) -> dict[str, object]:
    return {"type": "Some", "value": value}


def _position(path: Path) -> dict[str, object]:
    return _option({"type": "Position", "uriOpt": _option(path.as_uri())})


def _classifier(name: str) -> dict[str, object]:
    return _option({"type": "Classifier", "name": name})


def _property(name: str, value: str = "1") -> dict[str, object]:
    return {
        "type": "Property",
        "name": {"type": "Name", "name": [name]},
        "propertyValues": [{"type": "UnitProp", "value": value, "unit": {"type": "None"}}],
        "appliesTo": [],
    }


def _feature(
    name: str, category: str, direction: str, classifier: str | None = None,
    properties: list[dict[str, object]] | None = None,
) -> dict[str, object]:
    return {
        "type": "FeatureEnd",
        "identifier": {"type": "Name", "name": [name]},
        "direction": {"type": "Direction", "value": direction},
        "category": {"type": "FeatureCategory", "value": category},
        "classifier": _classifier(classifier) if classifier else {"type": "None"},
        "properties": properties or [],
    }


def _component(
    name: str, category: str, classifier: str, source: Path,
    *, features: list[dict[str, object]] | None = None,
    children: list[dict[str, object]] | None = None,
    connections: list[dict[str, object]] | None = None,
    properties: list[dict[str, object]] | None = None,
) -> dict[str, object]:
    return {
        "type": "Component",
        "identifier": {"type": "Name", "name": [name], "pos": _position(source)},
        "category": {"type": "ComponentCategory", "value": category},
        "classifier": _classifier(classifier),
        "features": features or [],
        "subComponents": children or [],
        "connections": connections or [],
        "connectionInstances": [],
        "properties": properties or [],
    }


class CoverageTests(unittest.TestCase):
    def _campaign(self, root: Path) -> tuple[Path, Path]:
        manifest = {
            "schema_version": 1,
            "campaign_id": "cps-48-v1",
            "target_accepted": 48,
            "families": {f"family-{index}": {} for index in range(8)},
            "batches": [
                {"batch_id": f"batch-{index}", "family_id": f"family-{index}"}
                for index in range(8)
            ],
        }
        manifest_path = root / "manifest.json"
        manifest_path.write_text(json.dumps(manifest), encoding="utf-8")
        runs = root / "runs"
        runs.mkdir()
        for family in manifest["families"]:
            for tier in coverage.TIERS:
                for replicate in coverage.REPLICATES:
                    run_id = f"20260801T000000Z-{family}-{tier}-r{replicate}-a1"
                    self._accepted_run(runs / run_id, family, tier, replicate, run_id, "2026-08-01T00:00:00Z")
        return manifest_path, runs

    def _accepted_run(
        self, run_dir: Path, family: str, tier: str, replicate: int,
        run_id: str, completed_at: str,
    ) -> None:
        (run_dir / "model").mkdir(parents=True)
        source = run_dir / "model/model.sysml"
        source.write_text(f"package {run_id.replace('-', '_')} {{}}\n", encoding="utf-8")
        digest = hashlib.sha256(source.read_bytes()).hexdigest()
        (run_dir / "run-config.json").write_text(
            json.dumps({
                "run_id": run_id, "campaign_id": "cps-48-v1", "family_id": family,
                "complexity": tier, "replicate": replicate,
            }), encoding="utf-8",
        )
        (run_dir / "status.json").write_text(
            json.dumps({
                "run_id": run_id, "status": "accepted", "terminal": True,
                "dataset_ready": True, "semantic_status": "passed",
                "visualization_status": "passed",
                "completed_at": completed_at, "source": "model/model.sysml",
                "source_sha256": digest,
            }), encoding="utf-8",
        )

    def test_canonical_selection_uses_latest_completion_for_three_duplicates(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            manifest, runs = self._campaign(Path(temp))
            for tier in coverage.TIERS:
                run_id = f"20260802T000000Z-family-0-{tier}-r1-a2"
                self._accepted_run(
                    runs / run_id, "family-0", tier, 1, run_id, "2026-08-02T00:00:00Z"
                )
            selected = coverage.select_canonical_runs(manifest, runs)
            self.assertEqual(len(selected), 48)
            self.assertEqual(Counter(item.complexity for item in selected), Counter({tier: 16 for tier in coverage.TIERS}))
            duplicates = [item for item in selected if item.family_id == "family-0" and item.replicate == 1]
            self.assertEqual(len(duplicates), 3)
            self.assertTrue(all(item.run_id.startswith("20260802") for item in duplicates))
            self.assertTrue(all(item.accepted_candidates == 2 for item in duplicates))

    def test_selection_fails_for_missing_or_nonaccepted_cell(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            manifest, runs = self._campaign(Path(temp))
            target = runs / "20260801T000000Z-family-0-small-r1-a1/status.json"
            status = json.loads(target.read_text(encoding="utf-8"))
            status["status"] = "incomplete"
            target.write_text(json.dumps(status), encoding="utf-8")
            with self.assertRaisesRegex(coverage.CoverageError, "no accepted run"):
                coverage.select_canonical_runs(manifest, runs)

    def test_selection_fails_for_source_hash_mismatch(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            manifest, runs = self._campaign(Path(temp))
            source = runs / "20260801T000000Z-family-0-small-r1-a1/model/model.sysml"
            source.write_text("changed\n", encoding="utf-8")
            with self.assertRaisesRegex(coverage.CoverageError, "source hash mismatch"):
                coverage.select_canonical_runs(manifest, runs)

    def test_recursive_air_counts_defaults_and_excludes_import_only_data(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            source = Path(temp) / "model.sysml"
            source.write_text("package Model {}\n", encoding="utf-8")
            library_source = Path(temp) / "library.sysml"
            library_source.write_text("package Library {}\n", encoding="utf-8")
            queue = _property("Communication_Properties::Queue_Size")
            thread = _component(
                "thread", "Thread", "Model::DerivedThread", source,
                features=[
                    _feature("input", "DataPort", "In", "Model::Payload", [queue]),
                    _feature("event", "EventPort", "InOut"),
                ],
                connections=[{
                    "type": "Connection", "kind": {"type": "ConnectionKind", "value": "Port"},
                    "properties": [],
                }],
            )
            process = _component("process", "Process", "Model::Process", source, children=[thread])
            root = _component(
                "root", "System", "Model::Root", source,
                features=[_feature("output", "EventDataPort", "Out", "Model::Payload", [queue])],
                children=[process],
            )
            library_root = _component("library", "System", "Library::Imported", library_source)
            payload_field = _component("field", "Data", "Base_Types::Integer_32", source)
            payload = _component("Payload", "Data", "Model::Payload", source, children=[payload_field])
            integer = _component("Integer_32", "Data", "Base_Types::Integer_32", library_source)
            unused = _component("Unused", "Data", "Library::Unused", library_source)
            raw = [
                {"components": [library_root], "dataComponents": []},
                {"components": [root], "dataComponents": [payload, integer, unused]},
            ]
            selected_models = coverage.source_resolved_models(raw, source)
            metrics = coverage.collect_model_metrics(selected_models)
            self.assertEqual(metrics.resolved_root_count, 1)
            self.assertEqual(metrics.counts["component"]["AADL::System"], 1)
            self.assertEqual(metrics.counts["component"]["AADL::Process"], 1)
            self.assertEqual(metrics.counts["component"]["AADL::Thread"], 1)
            self.assertEqual(metrics.counts["component"]["AADL::Data"], 3)
            self.assertEqual(metrics.counts["feature"]["AADL::DataPort"], 1)
            self.assertEqual(metrics.counts["feature"]["AADL::EventPort"], 1)
            self.assertEqual(metrics.counts["feature"]["AADL::EventDataPort"], 1)
            self.assertEqual(metrics.directions, Counter({"In": 1, "Out": 1, "InOut": 1}))
            self.assertEqual(metrics.counts["connection"]["AADL::PortConnection"], 1)
            self.assertEqual(metrics.counts["property"]["Communication_Properties::Queue_Size"], 2)
            self.assertEqual(metrics.values[("Communication_Properties::Queue_Size", "1")], 2)

    def test_unknown_resolved_kind_and_catalog_symbol_fail_closed(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            source = Path(temp) / "model.sysml"
            source.write_text("package Model {}\n", encoding="utf-8")
            root = _component("root", "Alien", "Model::Root", source)
            with self.assertRaisesRegex(coverage.CoverageError, "unknown component category"):
                coverage.collect_model_metrics([{"components": [root], "dataComponents": []}])
            unknown = coverage.CatalogEntry(
                "AADL::DoesNotExist", "test", "AADL.sysml", "part"
            )
            (Path(temp) / "AADL.sysml").write_text("package AADL {}\n", encoding="utf-8")
            with self.assertRaisesRegex(coverage.CoverageError, "unknown catalog symbol"):
                coverage.validate_catalog_entries(Path(temp), [unknown])

    def test_sireum_error_is_wrapped_fail_closed(self) -> None:
        def resolver(*_args: object) -> tuple[()]:
            raise ValueError("synthetic Sireum failure")

        with tempfile.TemporaryDirectory() as temp:
            with self.assertRaisesRegex(coverage.CoverageError, "Sireum resolver failed"):
                coverage.analyze(output_dir=Path(temp), resolver=resolver)

    def test_rendering_is_deterministic(self) -> None:
        runs = tuple(
            coverage.SelectedRun(
                cell_id=f"family-{index // 6}-{coverage.TIERS[(index // 2) % 3]}-r{index % 2 + 1}",
                family_id=f"family-{index // 6}", complexity=coverage.TIERS[(index // 2) % 3],
                replicate=index % 2 + 1, run_id=f"run-{index:02d}",
                run_dir=coverage.REPO_ROOT / f"run-{index:02d}",
                completed_at="2026-08-01T00:00:00Z",
                source=coverage.REPO_ROOT / f"run-{index:02d}/model.sysml",
                source_sha256="0" * 64, accepted_candidates=1,
            )
            for index in range(48)
        )
        metrics = []
        for index in range(48):
            item = coverage.ModelMetrics(resolved_root_count=1)
            item.counts["component"]["AADL::System"] = 1
            if index % 2:
                item.counts["property"]["Communication_Properties::Queue_Size"] = 2
                item.values[("Communication_Properties::Queue_Size", "1")] = 2
            metrics.append(item)
        library = {
            "commit": coverage.EXPECTED_LIBRARY_COMMIT, "content_sha256": "1" * 64,
            "sysml_file_count": 17, "catalog_entries_validated": 80,
        }
        first = coverage.build_report(runs, metrics, library, "test")
        second = coverage.build_report(runs, metrics, library, "test")
        self.assertEqual(json.dumps(first, sort_keys=True), json.dumps(second, sort_keys=True))
        self.assertEqual(coverage.render_csv(first), coverage.render_csv(second))
        self.assertEqual(coverage.render_markdown(first), coverage.render_markdown(second))
        self.assertEqual(plots.render_plots(first), plots.render_plots(second))
        with tempfile.TemporaryDirectory() as temp:
            output = Path(temp)
            coverage.write_outputs(output, first)
            self.assertEqual((output / "README.md").read_text(), coverage.render_markdown(first))
            self.assertEqual((output / "coverage.csv").read_text(), coverage.render_csv(first))
            for name, expected in plots.render_plots(first).items():
                self.assertEqual((output / "plots" / name).read_text(), expected)
        self.assertLess(
            [entry["entry"] for entry in first["entries"]].index("AADL::Abstract"),
            [entry["entry"] for entry in first["entries"]].index("AADL::System"),
        )

    def test_plot_renderer_rejects_unknown_schema(self) -> None:
        with self.assertRaisesRegex(plots.PlotError, "unsupported coverage schema"):
            plots.render_plots({"schema_version": "future"})

    @unittest.skipUnless(os.environ.get("AADL_COVERAGE_INTEGRATION"), "set AADL_COVERAGE_INTEGRATION=1 for a full Sireum rerun")
    def test_full_analysis_reproduces_analytical_content(self) -> None:
        with tempfile.TemporaryDirectory() as first_temp, tempfile.TemporaryDirectory() as second_temp:
            first = coverage.analyze(output_dir=Path(first_temp))
            second = coverage.analyze(output_dir=Path(second_temp))
            self.assertEqual(first["analytical_content_sha256"], second["analytical_content_sha256"])
            for name in ("coverage.json", "coverage.csv", "README.md"):
                self.assertEqual((Path(first_temp) / name).read_bytes(), (Path(second_temp) / name).read_bytes())
            for name in plots.PLOT_FILENAMES:
                self.assertEqual(
                    (Path(first_temp) / "plots" / name).read_bytes(),
                    (Path(second_temp) / "plots" / name).read_bytes(),
                )


if __name__ == "__main__":
    unittest.main()
