from __future__ import annotations

import unittest
from pathlib import Path

from publisher import corpus


ROOT = Path(__file__).resolve().parents[2]


class CorpusDiscoveryTest(unittest.TestCase):
    def test_corpus_is_exactly_the_48_ready_cps_runs(self) -> None:
        sources = corpus.discover_sources()

        self.assertEqual(48, len(sources))
        self.assertEqual(48, len({source.run_id for source in sources}))
        self.assertEqual(48, len({source.directory_name for source in sources}))
        self.assertTrue(
            all(
                source.run_dir.parent == ROOT / "cps48/runs"
                and source.model.is_file()
                and source.abstract.is_file()
                for source in sources
            )
        )

    def test_only_three_title_collision_groups_use_tier_suffixes(self) -> None:
        names = {source.directory_name for source in corpus.discover_sources()}
        expected = {
            "cabin-air-quality-and-humidity-supervisor-small",
            "cabin-air-quality-and-humidity-supervisor-hard",
            "eit-image-availability-and-review-support-coordinator-small",
            "eit-image-availability-and-review-support-coordinator-hard",
            "vehicle-controller-operating-mode-coordinator-small",
            "vehicle-controller-operating-mode-coordinator-medium",
        }
        self.assertTrue(expected.issubset(names))
        self.assertFalse(any(name.startswith("2026") for name in names))
        self.assertFalse(any("-r1-" in name or "-r2-" in name for name in names))

    def test_repository_evaluator_is_the_single_shared_implementation(self) -> None:
        self.assertEqual(ROOT / "scripts/evaluate.sh", corpus.EVALUATOR)
        script = corpus.EVALUATOR.read_text(encoding="utf-8")
        self.assertIn('DATASET_ROOT=${DATASET_ROOT:-"$SCRIPT_DIR/../datasets"}', script)
        self.assertIn("PYTHONPATH=", script)
        self.assertIn("python3 -m equiv_checker compare", script)
        self.assertFalse(hasattr(corpus, "_evaluator_script"))


if __name__ == "__main__":
    unittest.main()
