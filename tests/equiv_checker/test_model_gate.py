import json
from pathlib import Path
import tempfile
import unittest

from sysml_tools.gumbo import ParserSpan
from equiv_checker.model_gate import (
    ModelGateError,
    canonicalize_resolved_models,
    canonicalize_source_for_tests,
    compare_model_fingerprints,
    erase_gumbo_spans,
)
from equiv_checker.schema import ModelFingerprint


class ModelGatePureTest(unittest.TestCase):
    def test_parser_certified_gumbo_erasure_preserves_lines(self):
        gumbo = 'language "GUMBO" /*{ compute guarantee G: true; }*/'
        source = f"package P {{\n  {gumbo}\n  part p : T;\n}}\n"
        start = source.index(gumbo)
        erased = erase_gumbo_spans(
            source, (ParserSpan(start, start + len(gumbo), "subclause"),)
        )
        self.assertNotIn("GUMBO", erased)
        self.assertEqual(source.count("\n"), erased.count("\n"))
        self.assertIn("part p : T", erased)

    def test_pure_projection_ignores_comments_formatting_and_gumbo(self):
        gumbo_a = 'language "GUMBO" /*{ compute guarantee G: true; }*/'
        gumbo_b = 'language "GUMBO" /*{ compute guarantee RENAMED: false; }*/'
        first = f"package P {{ // comment\n {gumbo_a}\n part p:T; }}"
        second = f"package   P{{\n{gumbo_b}\n// other\npart p : T ;}}"
        a = first.index(gumbo_a)
        b = second.index(gumbo_b)
        self.assertEqual(
            canonicalize_source_for_tests(
                first, (ParserSpan(a, a + len(gumbo_a), "subclause"),)
            ),
            canonicalize_source_for_tests(
                second, (ParserSpan(b, b + len(gumbo_b), "subclause"),)
            ),
        )

    def test_resolved_air_projection_removes_only_positions_and_gumbo_annex(self):
        base = {
            "type": "Aadl",
            "components": [
                {
                    "identifier": {"name": ["P", "root"], "pos": {"line": 2}},
                    "features": [{"identifier": {"name": ["in"]}}],
                    "properties": [{"name": {"name": ["Period"]}, "value": 10}],
                    "annexes": [
                        {"name": "GUMBO", "clause": {"type": "GclSubclause", "value": 1}},
                        {"name": "EMV2", "clause": {"type": "OtherAnnex", "value": 2}},
                    ],
                    "uriFrag": "file-a#1",
                }
            ],
        }
        moved = json.loads(json.dumps(base))
        moved["components"][0]["identifier"]["pos"] = {"line": 99}
        moved["components"][0]["annexes"][0]["clause"]["value"] = 99
        moved["components"][0]["uriFrag"] = "file-b#8"
        self.assertEqual(
            canonicalize_resolved_models((base,)),
            canonicalize_resolved_models((moved,)),
        )
        changed = json.loads(json.dumps(base))
        changed["components"][0]["properties"][0]["value"] = 11
        self.assertNotEqual(
            canonicalize_resolved_models((base,)),
            canonicalize_resolved_models((changed,)),
        )

    def test_fingerprint_comparison_carries_mismatch_evidence(self):
        left = ModelFingerprint("a", "/a.json", "a", "parser")
        right = ModelFingerprint("b", "/b.json", "b", "parser")
        result = compare_model_fingerprints(left, right)
        self.assertFalse(result.matches)
        self.assertEqual("a", result.oracle_sha256)
        self.assertEqual("b", result.candidate_sha256)
        self.assertIn("differ", result.reason or "")

    def test_incompatible_semantic_authority_has_no_mismatch_verdict(self):
        left = ModelFingerprint("a", "/a.json", "a", "Sireum v1")
        right = ModelFingerprint("a", "/b.json", "a", "Sireum v2")
        with self.assertRaisesRegex(ModelGateError, "different semantic authorities"):
            compare_model_fingerprints(left, right)

    def test_input_byte_hash_does_not_control_semantic_match(self):
        left = ModelFingerprint("source-a", "/a.json", "artifact", "Sireum")
        right = ModelFingerprint("source-b", "/b.json", "artifact", "Sireum")
        self.assertTrue(compare_model_fingerprints(left, right).matches)


if __name__ == "__main__":
    unittest.main()
