from pathlib import Path
import tempfile
import unittest

from equiv_checker.gumbox import GeneratedSemanticGap
from equiv_checker.schema import (
    ComparisonPlan,
    ComparisonUnit,
    ModelFingerprint,
    Observation,
    ObservationRole,
    PredicateBinding,
    UnitKind,
)
from equiv_checker.type_alignment import (
    TypeCatalogError,
    align_type_pair,
    bind_resolved_datatype_unit,
    catalog_types,
    discover_datatype_invariants,
    neutralize_datatype_source,
)


def generated_types(package: str, *, enum_tail: str = '"OFF"') -> str:
    return f'''// #Sireum
package {package}
import org.sireum._

object Base_Types {{
  type Integer_32 = S32
}}

@enum object Mode {{
  "ON"
  {enum_tail}
}}

object Samples {{
  @range(min = 0, max = 2, index = T) class I
}}

@datatype class Reading(
  val mode: Mode.Type,
  val samples: IS[Samples.I, Base_Types.Integer_32])

@datatype class Envelope(
  val reading: Option[Reading])

@datatype class Recursive(
  val next: Option[Recursive])

@datatype class Stream(
  val values: ISZ[S32])
'''


INVARIANT_SOURCE = '''// #Sireum
package oracle.generated
import org.sireum._

object Temperature {
  @strictpure def lower(value: Temperature): B = value.degrees >= s32"-20"
  @strictpure def D_Inv_Temperature(value: Temperature): B =
    lower(value)
  @strictpure def D_Inv_Guard_Temperature(value: Option[Temperature]): B =
    value.nonEmpty ___>: D_Inv_Temperature(value.get)
}

@datatype class Temperature(val degrees: S32) {
  // Invariant(fake) and a closing brace in text: "}"
  @spec def source_range = Invariant(
    degrees >= s32"-20" & degrees <= s32"60"
  )
  @strictpure def ordinary: B = T
}

object Unrelated {
  @spec def port_contract = Invariant(T)
}
'''


class TypeAlignmentTest(unittest.TestCase):
    def _catalog_pair(self, root: Path):
        oracle_file = root / "oracle.scala"
        candidate_file = root / "candidate.scala"
        oracle_file.write_text(generated_types("oracle.generated"), encoding="utf-8")
        candidate_file.write_text(generated_types("candidate.generated"), encoding="utf-8")
        return catalog_types([oracle_file]), catalog_types([candidate_file])

    def test_scalar_enum_record_option_and_bounded_sequence_are_self_contained(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            oracle, candidate = self._catalog_pair(Path(temp))
            alignment = align_type_pair(
                key="model::Envelope",
                oracle_catalog=oracle,
                candidate_catalog=candidate,
                oracle_type="oracle.generated.Envelope",
                candidate_type="candidate.generated.Envelope",
            )
        self.assertTrue(alignment.supported, alignment.unsupported_reasons)
        kinds = {node.normalized.kind for node in alignment.nodes}
        self.assertEqual(
            {"scalar", "enum", "record", "option", "bounded-sequence"}, kinds
        )
        root = alignment.node("model::Envelope").normalized
        self.assertEqual("oracle.generated.Envelope", root.oracle_type)
        self.assertEqual("candidate.generated.Envelope", root.candidate_type)
        sequence = next(
            node.normalized
            for node in alignment.nodes
            if node.normalized.kind == "bounded-sequence"
        )
        self.assertEqual(3, sequence.bound)
        self.assertEqual("oracle.generated.Samples.I", sequence.oracle_index_type)
        self.assertEqual("candidate.generated.Samples.I", sequence.candidate_index_type)
        enum = next(
            node.normalized for node in alignment.nodes if node.normalized.kind == "enum"
        )
        self.assertEqual(("ON", "OFF"), enum.literals)
        self.assertEqual("oracle.generated.Mode", enum.oracle_enum_owner)

    def test_alignment_nodes_validate_as_frozen_comparison_plan_types(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            oracle, candidate = self._catalog_pair(Path(temp))
            alignment = align_type_pair(
                key="observation::payload",
                oracle_catalog=oracle,
                candidate_catalog=candidate,
                oracle_type="oracle.generated.Envelope",
                candidate_type="candidate.generated.Envelope",
            )
        root = alignment.node(alignment.root_key).normalized
        fingerprint = ModelFingerprint("0" * 64, "ast.json", "1" * 64, "test")
        binding = PredicateBinding("oracle", None, None, synthetic_true_assumption=True,
                                   synthetic_true_guarantee=True)
        plan = ComparisonPlan(
            oracle_input="oracle.sysml",
            candidate_input="candidate.sysml",
            oracle_fingerprint=fingerprint,
            candidate_fingerprint=fingerprint,
            roots=("Root",),
            types=alignment.normalized_types,
            units=(
                ComparisonUnit(
                    key="root::Root/component::c::compute",
                    kind=UnitKind.COMPUTE,
                    root="Root",
                    instance_path="c",
                    classifier="Controller",
                    phase="compute",
                    observations=(
                        Observation(
                            "payload",
                            ObservationRole.INPUT,
                            root.key,
                            root.oracle_type,
                            root.candidate_type,
                        ),
                    ),
                    oracle=binding,
                    candidate=PredicateBinding(
                        "candidate", None, None, synthetic_true_assumption=True,
                        synthetic_true_guarantee=True,
                    ),
                ),
            ),
            coverage_complete=True,
        )
        plan.validate()

    def test_recursive_unbounded_and_drifted_shapes_fail_closed(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            oracle_file = root / "oracle.scala"
            candidate_file = root / "candidate.scala"
            drift_file = root / "drift.scala"
            oracle_file.write_text(generated_types("oracle.generated"), encoding="utf-8")
            candidate_file.write_text(generated_types("candidate.generated"), encoding="utf-8")
            drift_file.write_text(
                generated_types("candidate.drift", enum_tail='"STANDBY"'), encoding="utf-8"
            )
            oracle = catalog_types([oracle_file])
            candidate = catalog_types([candidate_file])
            drift = catalog_types([drift_file])
            recursive = align_type_pair(
                key="recursive",
                oracle_catalog=oracle,
                candidate_catalog=candidate,
                oracle_type="oracle.generated.Recursive",
                candidate_type="candidate.generated.Recursive",
            )
            stream = align_type_pair(
                key="stream",
                oracle_catalog=oracle,
                candidate_catalog=candidate,
                oracle_type="oracle.generated.Stream",
                candidate_type="candidate.generated.Stream",
            )
            enum_drift = align_type_pair(
                key="mode",
                oracle_catalog=oracle,
                candidate_catalog=drift,
                oracle_type="oracle.generated.Mode.Type",
                candidate_type="candidate.drift.Mode.Type",
            )
        self.assertFalse(recursive.supported)
        self.assertTrue(any(node.normalized.recursive for node in recursive.nodes))
        self.assertFalse(stream.supported)
        self.assertIn("unbounded sequence", " ".join(stream.unsupported_reasons))
        self.assertFalse(enum_drift.supported)
        self.assertIn("enum literals differ", " ".join(enum_drift.unsupported_reasons))
    def test_neutral_carrier_is_narrow_hashed_and_never_mutates_generated_input(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "generated" / "Temperature.scala"
            destination = root / "proof" / "Temperature.scala"
            source.parent.mkdir()
            source.write_text(INVARIANT_SOURCE, encoding="utf-8")
            original = source.read_bytes()
            record = neutralize_datatype_source(
                source, destination, class_names=("Temperature",)
            )
            neutral = destination.read_text(encoding="utf-8")
            self.assertEqual(original, source.read_bytes())
            self.assertTrue(record.structural_verified)
            self.assertNotEqual(record.source_sha256, record.neutral_sha256)
            self.assertEqual(1, len(record.edits))
            self.assertIn("D_Inv_Temperature", neutral)
            self.assertIn("@strictpure def ordinary", neutral)
            self.assertIn("@spec def port_contract = Invariant(T)", neutral)
            self.assertNotIn("@spec def source_range", neutral)
            self.assertEqual(64, len(record.preserved_predicate_sha256["D_Inv_Temperature"]))
            with self.assertRaises(FileExistsError):
                neutralize_datatype_source(source, destination)
            with self.assertRaises(ValueError):
                neutralize_datatype_source(source, source)

    def test_neutralization_requires_preserved_explicit_datatype_predicate(self) -> None:
        missing_predicate = '''package p
import org.sireum._
@datatype class D(value: Z) { @spec def inv = Invariant(value >= 0) }
'''
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            source = root / "D.scala"
            source.write_text(missing_predicate, encoding="utf-8")
            with self.assertRaisesRegex(TypeCatalogError, "D_Inv_D"):
                neutralize_datatype_source(source, root / "neutral.scala")

    def test_datatype_invariant_discovery_binding_and_absent_union_side(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            source = Path(temp) / "Temperature.scala"
            source.write_text(INVARIANT_SOURCE, encoding="utf-8")
            predicate = discover_datatype_invariants([source])[0]
            unit = ComparisonUnit(
                key="datatype::Temperature::invariant",
                kind=UnitKind.DATATYPE_INVARIANT,
                root=None,
                instance_path=None,
                classifier="Temperature",
                phase="invariant",
                observations=(
                    Observation(
                        "value",
                        ObservationRole.VALUE,
                        "temperature",
                        "oracle.generated.Temperature",
                        "oracle.generated.Temperature",
                    ),
                ),
                oracle=PredicateBinding(
                    "oracle",
                    None,
                    None,
                    source_object="Temperature::GUMBO::datatype-invariant",
                    synthetic_true_assumption=True,
                ),
                candidate=PredicateBinding(
                    "candidate",
                    None,
                    None,
                    synthetic_true_assumption=True,
                    synthetic_true_guarantee=True,
                ),
            )
            resolved = bind_resolved_datatype_unit(
                unit=unit,
                oracle_predicate=predicate,
                candidate_predicate=None,
                oracle_invariant_present=True,
                candidate_invariant_present=False,
            )
        self.assertEqual(
            ("value",), resolved.oracle.binding.guarantee_observations
        )
        self.assertTrue(resolved.candidate.binding.synthetic_true_guarantee)
        self.assertEqual(
            ("value",), resolved.candidate.binding.guarantee_observations
        )

    def test_datatype_binding_rejects_wrong_predicate_and_falsified_presence(self) -> None:
        wrong_source = '''package oracle.generated
import org.sireum._
object Other {
  @strictpure def D_Inv_Other(value: oracle.generated.Temperature): B = T
}
'''
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            temperature_source = root / "Temperature.scala"
            wrong_path = root / "Other.scala"
            temperature_source.write_text(INVARIANT_SOURCE, encoding="utf-8")
            wrong_path.write_text(wrong_source, encoding="utf-8")
            predicate = discover_datatype_invariants([temperature_source])[0]
            wrong = discover_datatype_invariants([wrong_path])[0]
            unit = ComparisonUnit(
                key="datatype::Temperature::invariant",
                kind=UnitKind.DATATYPE_INVARIANT,
                root=None,
                instance_path=None,
                classifier="Temperature",
                phase="invariant",
                observations=(
                    Observation(
                        "value",
                        ObservationRole.VALUE,
                        "temperature",
                        "oracle.generated.Temperature",
                        "oracle.generated.Temperature",
                    ),
                ),
                oracle=PredicateBinding(
                    "oracle",
                    None,
                    None,
                    source_object="Temperature::GUMBO::datatype-invariant",
                    synthetic_true_assumption=True,
                ),
                candidate=PredicateBinding(
                    "candidate",
                    None,
                    None,
                    source_object="Temperature::GUMBO::datatype-invariant",
                    synthetic_true_assumption=True,
                ),
            )
            with self.assertRaisesRegex(GeneratedSemanticGap, "does not match"):
                bind_resolved_datatype_unit(
                    unit=unit,
                    oracle_predicate=wrong,
                    candidate_predicate=predicate,
                    oracle_invariant_present=True,
                    candidate_invariant_present=True,
                )
            with self.assertRaisesRegex(GeneratedSemanticGap, "presence assertion"):
                bind_resolved_datatype_unit(
                    unit=unit,
                    oracle_predicate=predicate,
                    candidate_predicate=predicate,
                    oracle_invariant_present=False,
                    candidate_invariant_present=True,
                )


if __name__ == "__main__":
    unittest.main()
