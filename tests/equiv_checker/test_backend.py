from types import SimpleNamespace
import unittest

from equiv_checker.backend import (
    UnsupportedComparison,
    _assign_units_to_roots,
    _certifies_empty_contract_semantics,
)
from equiv_checker.inventory import InventoryRoot
from equiv_checker.schema import ComparisonUnit, UnitKind


def _unit(key: str, kind: UnitKind, *, root: str | None, classifier: str):
    return ComparisonUnit(
        key=key,
        kind=kind,
        root=root,
        instance_path=None if root is None else f"{root}::component",
        classifier=classifier,
        phase="invariant" if kind is UnitKind.DATATYPE_INVARIANT else kind.value,
        observations=(),
        oracle=None,
        candidate=None,
    )


class BackendRootAssignmentTest(unittest.TestCase):
    def test_component_and_datatype_units_are_assigned_exactly_once(self):
        inventory = SimpleNamespace(
            roots=(
                InventoryRoot("R1_Instance", "P::R1", "System", ("P::D1",)),
                InventoryRoot(
                    "R2_Instance", "P::R2", "System", ("P::D1", "P::D2")
                ),
            )
        )
        units = (
            _unit("c1", UnitKind.COMPUTE, root="P::R1", classifier="P::C"),
            _unit(
                "d2",
                UnitKind.DATATYPE_INVARIANT,
                root=None,
                classifier="P::D2",
            ),
        )
        assigned = _assign_units_to_roots(
            inventory, ("P::R1", "P::R2"), units
        )
        self.assertEqual(("c1",), tuple(unit.key for unit in assigned["P::R1"]))
        self.assertEqual(("d2",), tuple(unit.key for unit in assigned["P::R2"]))

    def test_missing_datatype_host_fails_closed(self):
        inventory = SimpleNamespace(
            roots=(InventoryRoot("R_Instance", "P::R", "System", ("P::D1",)),)
        )
        unit = _unit(
            "missing",
            UnitKind.DATATYPE_INVARIANT,
            root=None,
            classifier="P::D2",
        )
        with self.assertRaisesRegex(UnsupportedComparison, "no generated root"):
            _assign_units_to_roots(inventory, ("P::R",), (unit,))

    def test_duplicate_classifier_descriptor_fails_closed(self):
        inventory = SimpleNamespace(
            roots=(
                InventoryRoot("R1", "P::R", "System", ("P::D",)),
                InventoryRoot("R2", "P::R", "System", ("P::D",)),
            )
        )
        unit = _unit("c", UnitKind.COMPUTE, root="P::R", classifier="P::C")
        with self.assertRaisesRegex(UnsupportedComparison, "ambiguous"):
            _assign_units_to_roots(inventory, ("P::R",), (unit,))

    def test_empty_units_require_an_independent_empty_contract_certificate(self):
        empty = SimpleNamespace(
            coverage_complete=True,
            declared_clause_count=0,
            supported_clause_count=0,
            clauses=(),
            contract_owners=(),
        )
        self.assertTrue(_certifies_empty_contract_semantics(empty))
        for changed in (
            {"coverage_complete": False},
            {"declared_clause_count": 1},
            {"supported_clause_count": 1},
            {"clauses": (object(),)},
            {"contract_owners": (object(),)},
        ):
            values = vars(empty) | changed
            self.assertFalse(
                _certifies_empty_contract_semantics(SimpleNamespace(**values)),
                changed,
            )


if __name__ == "__main__":
    unittest.main()
