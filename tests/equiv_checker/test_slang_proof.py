from pathlib import Path
import tempfile
import unittest

from equiv_checker.schema import (
    ComparisonUnit,
    NormalizedType,
    Observation,
    ObservationRole,
    PredicateBinding,
    UnitKind,
    WriteFootprint,
)
from equiv_checker.slang_proof import generate_unit_proof


class SlangProofTest(unittest.TestCase):
    def test_emits_primary_vcs_and_defers_independent_complements(self):
        enum = NormalizedType(
            key="P::Mode", kind="enum", qualified_name="P::Mode", literals=("On", "Off"),
            oracle_type="shared.P.Mode.Type", candidate_type="shared.P.Mode.Type",
            oracle_enum_owner="shared.P.Mode", candidate_enum_owner="shared.P.Mode",
        )
        unit = ComparisonUnit(
            key="root::P::Root/component::p/controller::compute",
            kind=UnitKind.COMPUTE,
            root="P::Root",
            instance_path="p/controller",
            classifier="P::Controller",
            phase="compute",
            observations=(
                Observation("in", ObservationRole.INPUT, enum.key, "shared.P.Mode.Type", "shared.P.Mode.Type"),
                Observation("out", ObservationRole.OUTPUT, enum.key, "shared.P.Mode.Type", "shared.P.Mode.Type"),
            ),
            oracle=PredicateBinding(
                "oracle", None, "op.P.C_GumboX.compute_CEP_Post",
                synthetic_true_assumption=True,
                assumption_observations=(),
                guarantee_observations=("in", "out"),
            ),
            candidate=PredicateBinding(
                "candidate", None, "cp.P.C_GumboX.compute_CEP_Post",
                synthetic_true_assumption=True,
                assumption_observations=(),
                guarantee_observations=("in", "out"),
            ),
        )
        with tempfile.TemporaryDirectory() as temporary:
            generated = generate_unit_proof(unit, {enum.key: enum}, Path(temporary))
            self.assertEqual(4, len(generated.atomic))
            self.assertEqual(4 + 4, len(generated.sources))
            text = generated.atomic[1].validity_source.read_text(encoding="utf-8")
            self.assertFalse(generated.atomic[0].complement_source.exists())
            complement = generated.atomic[0].complement_content
        self.assertEqual(1, text.count("in: shared.P.Mode.Type"))
        self.assertEqual(1, text.count("out: shared.P.Mode.Type"))
        self.assertIn("cp.P.C_GumboX.compute_CEP_Post(in, out)", text)
        self.assertIn("op.P.C_GumboX.compute_CEP_Post(in, out)", text)
        self.assertIn("Contract(Requires(T)", text)
        self.assertIsNotNone(complement)
        self.assertIn("!(T)", complement)

    def test_simplifies_only_exact_boolean_identities(self):
        scalar = NormalizedType("Z", "scalar", "Z")
        unit = ComparisonUnit(
            key="boolean-identities",
            kind=UnitKind.COMPUTE,
            root="R",
            instance_path="p",
            classifier="C",
            phase="compute",
            observations=(Observation("x", ObservationRole.INPUT, "Z", "Z", "Z"),),
            oracle=PredicateBinding(
                "oracle", None, "o.g",
                synthetic_true_assumption=True,
                assumption_observations=(),
                guarantee_observations=("x",),
            ),
            candidate=PredicateBinding(
                "candidate", None, None,
                synthetic_true_assumption=True,
                synthetic_true_guarantee=True,
                assumption_observations=(),
                guarantee_observations=(),
            ),
        )
        with tempfile.TemporaryDirectory() as temporary:
            generated = generate_unit_proof(unit, {"Z": scalar}, Path(temporary))

        self.assertEqual("o.g(x)", generated.atomic[1].formula)
        self.assertEqual("T", generated.atomic[3].formula)

    def test_missing_non_synthetic_predicate_fails_closed(self):
        scalar = NormalizedType("Z", "scalar", "Z")
        unit = ComparisonUnit(
            key="u",
            kind=UnitKind.COMPUTE,
            root="R",
            instance_path="p",
            classifier="C",
            phase="compute",
            observations=(Observation("x", ObservationRole.INPUT, "Z", "Z", "Z"),),
            oracle=PredicateBinding("oracle", None, "o.g"),
            candidate=PredicateBinding("candidate", None, "c.g", synthetic_true_assumption=True),
        )
        with tempfile.TemporaryDirectory() as temporary:
            with self.assertRaisesRegex(ValueError, "missing generated assumption"):
                generate_unit_proof(unit, {"Z": scalar}, Path(temporary))

    def test_compute_write_limits_add_frames_and_compare_allowed_writes(self):
        scalar = NormalizedType("Z", "scalar", "Z")
        observations = (
            Observation("In_x", ObservationRole.PRE_STATE, "Z", "Z", "Z"),
            Observation("x", ObservationRole.POST_STATE, "Z", "Z", "Z"),
            Observation("In_y", ObservationRole.PRE_STATE, "Z", "Z", "Z"),
            Observation("y", ObservationRole.POST_STATE, "Z", "Z", "Z"),
        )
        binding = lambda side: PredicateBinding(
            side,
            None,
            None,
            synthetic_true_assumption=True,
            synthetic_true_guarantee=True,
            assumption_observations=(),
            guarantee_observations=(),
        )
        unit = ComparisonUnit(
            key="stateful",
            kind=UnitKind.COMPUTE,
            root="R",
            instance_path="p",
            classifier="C",
            phase="compute",
            observations=observations,
            oracle=binding("oracle"),
            candidate=binding("candidate"),
            oracle_writes=WriteFootprint(True, ("x", "y")),
            candidate_writes=WriteFootprint(True, ("x",)),
        )
        with tempfile.TemporaryDirectory() as temporary:
            generated = generate_unit_proof(unit, {"Z": scalar}, Path(temporary))
            candidate_to_oracle = generated.atomic[1].formula
            oracle_to_candidate = generated.atomic[3].formula
        self.assertEqual("T", candidate_to_oracle)
        self.assertEqual("F", oracle_to_candidate)


if __name__ == "__main__":
    unittest.main()
