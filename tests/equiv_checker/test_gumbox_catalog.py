from pathlib import Path
import tempfile
import unittest

from equiv_checker.gumbox import (
    GeneratedSemanticGap,
    SlangSyntaxError,
    bind_phase,
    bind_resolved_unit,
    catalog_gumbox_text,
    contributor_names,
    _type_matches,
)
from equiv_checker.schema import (
    ComparisonUnit,
    Observation,
    ObservationRole,
    PredicateBinding,
    UnitKind,
)


GUMBOX = r'''// #Sireum
package oracle.generated
import org.sireum._

object Controller_GumboX {
  // def compute_CEP_Pre(fake: B): B = F { ignored }
  val decoy = "def compute_CEP_Post(x: Z): B = { F }"

  @strictpure def inititialize_IEP_Post(
      api_out: Option[oracle.generated.Payload]): B =
    init_domain(api_out)

  @strictpure def inititialize_IEP_Post_Container(
      post: Controller_Post): B =
    inititialize_IEP_Post(post.api_out)

  @strictpure def init_domain(value: Option[oracle.generated.Payload]): B =
    value.nonEmpty ___>: D_Inv(value.get)

  @strictpure def compute_CEP_Pre(
      api_in: Option[oracle.generated.Payload]): B = {
    val braceInString = "}"
    integration_assumption(api_in) & helper_pre(api_in)
  }

  @strictpure def compute_CEP_Pre_Container(
      pre: Controller_Pre): B = compute_CEP_Pre(pre.api_in)

  @strictpure def integration_assumption(
      value: Option[oracle.generated.Payload]): B = helper_pre(value)

  @strictpure def helper_pre(value: Option[oracle.generated.Payload]): B = T

  @strictpure def compute_CEP_Post(
      api_in: Option[oracle.generated.Payload],
      api_out: Option[oracle.generated.Payload]): B =
    compute_CEP_T_Guar(api_in, api_out) & output_domain(api_out)

  @strictpure def compute_CEP_Post_Container(
      pre: Controller_Pre,
      post: Controller_Post): B =
    compute_CEP_Post(pre.api_in, post.api_out)

  @strictpure def compute_CEP_T_Guar(
      api_in: Option[oracle.generated.Payload],
      api_out: Option[oracle.generated.Payload]): B =
    named_clause(api_in, api_out)

  @strictpure def named_clause(
      api_in: Option[oracle.generated.Payload],
      api_out: Option[oracle.generated.Payload]): B = T

  @strictpure def output_domain(value: Option[oracle.generated.Payload]): B = T

  @strictpure def D_Inv(value: oracle.generated.Payload): B = T
}
'''


class GumboXCatalogTest(unittest.TestCase):
    def test_exact_base_type_aliases_match_sireum_primitives(self):
        self.assertTrue(_type_matches("Base_Types.Integer_32", "S32"))
        self.assertTrue(
            _type_matches("equiv_shared_0.Base_Types.Boolean", "org.sireum.B")
        )
        self.assertFalse(_type_matches("P.Integer_32", "S32"))

    def test_balanced_catalog_finds_phases_containers_and_all_contributors(self) -> None:
        owner = catalog_gumbox_text(GUMBOX, Path("Controller_GumboX.scala"))[0]
        self.assertEqual("oracle.generated.Controller_GumboX", owner.qualified_name)
        self.assertEqual("inititialize_IEP_Post", owner.initialize.guarantee.name)
        self.assertIsNone(owner.initialize.assumption)
        self.assertEqual("compute_CEP_Pre", owner.compute.assumption.name)
        self.assertEqual("compute_CEP_Post", owner.compute.guarantee.name)
        self.assertEqual(
            ("compute_CEP_Pre", "integration_assumption", "helper_pre"),
            owner.compute.assumption_contributors,
        )
        self.assertEqual(
            (
                "compute_CEP_Post",
                "compute_CEP_T_Guar",
                "named_clause",
                "output_domain",
            ),
            owner.compute.guarantee_contributors,
        )
        self.assertEqual(
            owner.compute.assumption_contributors + owner.compute.guarantee_contributors,
            contributor_names(owner, "compute"),
        )
        method_names = {method.name for method in owner.methods}
        self.assertNotIn("fake", method_names)
        self.assertNotIn("x", method_names)

    def test_binding_uses_true_only_for_inventory_certified_absence(self) -> None:
        owner = catalog_gumbox_text(GUMBOX)[0]
        initialize = bind_phase(
            side="oracle",
            owner=owner,
            phase="initialize",
            source_assumption_present=False,
            source_guarantee_present=True,
        )
        self.assertIsNone(initialize.assumption)
        self.assertTrue(initialize.synthetic_true_assumption)
        self.assertFalse(initialize.synthetic_true_guarantee)
        self.assertTrue(initialize.guarantee.endswith(".inititialize_IEP_Post"))
        self.assertTrue(initialize.container_guarantee.endswith("_Post_Container"))

        empty = catalog_gumbox_text(
            "package p\nobject Empty_GumboX { @strictpure def helper(x: Z): B = T }"
        )[0]
        binding = bind_phase(
            side="candidate",
            owner=empty,
            phase="compute",
            source_assumption_present=False,
            source_guarantee_present=False,
        )
        self.assertTrue(binding.synthetic_true_assumption)
        self.assertTrue(binding.synthetic_true_guarantee)
        with self.assertRaises(GeneratedSemanticGap):
            bind_phase(
                side="candidate",
                owner=empty,
                phase="compute",
                source_assumption_present=None,
                source_guarantee_present=False,
            )
        with self.assertRaises(GeneratedSemanticGap):
            bind_phase(
                side="candidate",
                owner=empty,
                phase="compute",
                source_assumption_present=False,
                source_guarantee_present=True,
            )

    def test_container_without_native_predicate_is_rejected(self) -> None:
        malformed = '''package p
object Broken_GumboX {
  @strictpure def compute_CEP_Post_Container(post: Post): B = T
}
'''
        with self.assertRaisesRegex(SlangSyntaxError, "post-container"):
            catalog_gumbox_text(malformed)

    def test_file_hash_and_source_are_stable_catalog_metadata(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            path = Path(temp) / "Controller_GumboX.scala"
            path.write_text(GUMBOX, encoding="utf-8")
            owner = catalog_gumbox_text(path.read_text(encoding="utf-8"), path)[0]
            self.assertEqual(path, owner.source)
            self.assertEqual(64, len(owner.sha256))

    def test_resolved_binding_uses_native_parameter_order_and_role_aliases(self) -> None:
        owner = catalog_gumbox_text(GUMBOX)[0]
        unit = ComparisonUnit(
            key="root::R/component::controller::compute",
            kind=UnitKind.COMPUTE,
            root="R",
            instance_path="controller",
            classifier="Controller",
            phase="compute",
            # Inventory order intentionally differs from generated post order.
            observations=(
                Observation(
                    "out", ObservationRole.OUTPUT, "payload",
                    "Option[oracle.generated.Payload]",
                    "Option[oracle.generated.Payload]",
                ),
                Observation(
                    "in", ObservationRole.INPUT, "payload",
                    "Option[oracle.generated.Payload]",
                    "Option[oracle.generated.Payload]",
                ),
            ),
            oracle=PredicateBinding(
                "oracle", None, None, source_object="generated.Controller_GumboX"
            ),
            candidate=PredicateBinding(
                "candidate", None, None, source_object="generated.Controller_GumboX"
            ),
        )
        resolved = bind_resolved_unit(
            unit=unit,
            oracle_owner=owner,
            candidate_owner=owner,
            oracle_assumption_present=True,
            oracle_guarantee_present=True,
            candidate_assumption_present=True,
            candidate_guarantee_present=True,
        )
        self.assertEqual(("in",), resolved.oracle.binding.assumption_observations)
        self.assertEqual(
            ("in", "out"), resolved.oracle.binding.guarantee_observations
        )
        self.assertEqual((1, 0), resolved.oracle.guarantee.observation_indices)

    def test_missing_union_side_is_true_only_for_certified_phase_absence(self) -> None:
        owner = catalog_gumbox_text("package p\nobject Empty_GumboX {}")[0]
        unit = ComparisonUnit(
            "u",
            UnitKind.COMPUTE,
            "R",
            "c",
            "C",
            "compute",
            (),
            PredicateBinding(
                "oracle",
                None,
                None,
                source_object="p.Empty_GumboX",
                synthetic_true_assumption=True,
                synthetic_true_guarantee=True,
            ),
            PredicateBinding(
                "candidate",
                None,
                None,
                synthetic_true_assumption=True,
                synthetic_true_guarantee=True,
            ),
        )
        resolved = bind_resolved_unit(
            unit=unit,
            oracle_owner=owner,
            candidate_owner=None,
            oracle_assumption_present=False,
            oracle_guarantee_present=False,
            candidate_assumption_present=False,
            candidate_guarantee_present=False,
        )
        self.assertTrue(resolved.candidate.binding.synthetic_true_assumption)
        self.assertTrue(resolved.candidate.binding.synthetic_true_guarantee)

    def test_resolved_binding_rejects_wrong_same_signature_owner(self) -> None:
        owner = catalog_gumbox_text(GUMBOX)[0]
        wrong = catalog_gumbox_text(
            GUMBOX.replace("Controller_GumboX", "Other_GumboX")
        )[0]
        unit = ComparisonUnit(
            "u",
            UnitKind.COMPUTE,
            "R",
            "c",
            "Controller",
            "compute",
            (
                Observation(
                    "in",
                    ObservationRole.INPUT,
                    "payload",
                    "Option[oracle.generated.Payload]",
                    "Option[oracle.generated.Payload]",
                ),
                Observation(
                    "out",
                    ObservationRole.OUTPUT,
                    "payload",
                    "Option[oracle.generated.Payload]",
                    "Option[oracle.generated.Payload]",
                ),
            ),
            PredicateBinding(
                "oracle", None, None, source_object="generated.Controller_GumboX"
            ),
            PredicateBinding(
                "candidate", None, None, source_object="generated.Controller_GumboX"
            ),
        )
        with self.assertRaisesRegex(GeneratedSemanticGap, "does not match"):
            bind_resolved_unit(
                unit=unit,
                oracle_owner=wrong,
                candidate_owner=owner,
                oracle_assumption_present=True,
                oracle_guarantee_present=True,
                candidate_assumption_present=True,
                candidate_guarantee_present=True,
            )

    def test_resolved_binding_rejects_falsified_source_presence(self) -> None:
        owner = catalog_gumbox_text(GUMBOX)[0]
        frozen = PredicateBinding(
            "oracle", None, None, source_object="generated.Controller_GumboX"
        )
        unit = ComparisonUnit(
            "u",
            UnitKind.COMPUTE,
            "R",
            "c",
            "Controller",
            "compute",
            (
                Observation(
                    "in",
                    ObservationRole.INPUT,
                    "payload",
                    "Option[oracle.generated.Payload]",
                    "Option[oracle.generated.Payload]",
                ),
                Observation(
                    "out",
                    ObservationRole.OUTPUT,
                    "payload",
                    "Option[oracle.generated.Payload]",
                    "Option[oracle.generated.Payload]",
                ),
            ),
            frozen,
            PredicateBinding(
                "candidate", None, None, source_object="generated.Controller_GumboX"
            ),
        )
        with self.assertRaisesRegex(GeneratedSemanticGap, "presence assertion"):
            bind_resolved_unit(
                unit=unit,
                oracle_owner=owner,
                candidate_owner=owner,
                oracle_assumption_present=False,
                oracle_guarantee_present=True,
                candidate_assumption_present=True,
                candidate_guarantee_present=True,
            )
        with self.assertRaises(GeneratedSemanticGap):
            bind_resolved_unit(
                unit=unit,
                oracle_owner=owner,
                candidate_owner=None,
                oracle_assumption_present=False,
                oracle_guarantee_present=False,
                candidate_assumption_present=None,
                candidate_guarantee_present=False,
            )


if __name__ == "__main__":
    unittest.main()
