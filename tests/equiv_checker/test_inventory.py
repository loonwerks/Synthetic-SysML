from dataclasses import replace
import unittest

from equiv_checker.inventory import (
    ContractOwner,
    Inventory,
    InventoryError,
    InventoryModelMismatch,
    InventoryState,
    InventoryType,
    InventoryWriteFootprint,
    clause_accounting,
    pair_inventories,
    select_codegen_roots,
)


def inventory(*, include_contract=True, clause_id="G", second_instance=True, gap=False):
    instances = [
        {
            "root": "P::Root",
            "root_instance_path": "P::root",
            "instance_path": "P::root::controller_a",
            "classifier": "P::Controller",
            "category": "Thread",
            "gumbox_object": "P.Controller_controller_a_GumboX",
            "gumbox_naming_authority": "NameUtil.getAirNameProvider",
            "supported": True,
            "unsupported_reasons": [],
            "observations": [
                {"name": "x", "role": "input", "qualified_type": "Base_Types::Integer_32"},
                {"name": "y", "role": "output", "qualified_type": "Base_Types::Integer_32"},
            ],
        }
    ]
    if second_instance:
        instances.append(
            {
                **instances[0],
                "instance_path": "P::root::controller_b",
                "gumbox_object": "P.Controller_controller_b_GumboX",
            }
        )
    records = []
    owners = []
    if include_contract:
        records.append(
            {
                "owner": "P::Controller",
                "phase": "compute",
                "kind": "guarantee",
                "clause_id": clause_id,
                "trace_ids": ["REQ-1"],
                "source": {"uri": "model.sysml", "line": 7, "column": 4, "offset": 60},
                "supported": not gap,
                "unsupported_reason": "compute-handler" if gap else None,
            }
        )
        owners.append(
            {
                "classifier": "P::Controller",
                "phase": "compute",
                "source_object": "P.Controller::GumboX::compute",
                "assumption_count": 0,
                "guarantee_count": 1,
                "case_count": 0,
                "contributor_count": 0,
                "supported": not gap,
                "unsupported_reasons": ["compute-handler"] if gap else [],
            }
        )
    value = {
        "schema_version": "0.1.0",
        "inventory_schema_version": "1.0.0",
        "semantic_authority": "Sireum FrontEnd.typeCheck",
        "sireum_version": "test",
        "roots": [
            {
                "instance_path": "P::root",
                "classifier": "P::Root",
                "category": "System",
                "type_names": ["Base_Types::Integer_32"],
            }
        ],
        "instances": instances,
        "types": [
            {
                "qualified_name": "Base_Types::Integer_32",
                "kind": "scalar",
                "fields": [],
                "literals": [],
                "dimensions": [],
                "supported": True,
            }
        ],
        "contract_owners": owners,
        "records": records,
        "declared_clause_count": len(records),
        "supported_clause_count": sum(bool(item["supported"]) for item in records),
        "coverage_gaps": ["P::Controller:compute-handler"] if gap else [],
        "resolved_models": [],
    }
    return Inventory.from_json(value)


class InventoryPairingTest(unittest.TestCase):
    def test_repeated_classifier_instances_are_distinct_units(self):
        value = inventory()
        units = pair_inventories(value, value)
        self.assertEqual(2, len(units))
        self.assertEqual(2, len({unit.key for unit in units}))
        self.assertTrue(all(unit.classifier == "P::Controller" for unit in units))
        self.assertIn("controller_a::compute", units[0].key)
        self.assertIn("controller_b::compute", units[1].key)
        self.assertEqual("P.Controller_controller_a_GumboX", units[0].oracle.source_object)
        self.assertIsNone(units[0].oracle.guarantee_observations)

    def test_union_pairs_missing_contract_with_explicit_true(self):
        oracle = inventory()
        candidate = inventory(include_contract=False)
        units = pair_inventories(oracle, candidate)
        self.assertEqual(2, len(units))
        for unit in units:
            self.assertIsNotNone(unit.candidate)
            self.assertTrue(unit.candidate.synthetic_true_assumption)
            self.assertTrue(unit.candidate.synthetic_true_guarantee)
            self.assertEqual((), unit.candidate.assumption_observations)
            self.assertEqual((), unit.candidate.guarantee_observations)
            self.assertEqual(("G",), tuple(item.clause_id for item in unit.oracle_clauses))

    def test_contract_only_type_reachability_does_not_create_model_mismatch(self):
        oracle = inventory()
        candidate = inventory(include_contract=False)
        pulled_by_contract = InventoryType.from_json(
            {
                "qualified_name": "Library::Contract_Helper",
                "kind": "scalar",
                "fields": [],
                "literals": [],
                "dimensions": [],
                "supported": True,
            }
        )
        oracle = replace(
            oracle,
            types=oracle.types + (pulled_by_contract,),
            instances=oracle.instances
            + (
                replace(
                    oracle.instances[0],
                    instance_path="Library::Contract_Helper",
                    classifier="Library::Contract_Helper",
                    category="Data",
                    observations=(),
                    gumbox_object="Library.Contract_Helper_GumboX",
                ),
            ),
            roots=(
                replace(
                    oracle.roots[0],
                    type_names=oracle.roots[0].type_names
                    + (pulled_by_contract.qualified_name,),
                ),
            ),
        )
        units = pair_inventories(oracle, candidate)
        self.assertEqual(2, len(units))
        self.assertTrue(
            all(unit.candidate.synthetic_true_guarantee for unit in units)
        )
        self.assertEqual(
            ("P::Root",), select_codegen_roots(oracle, candidate, units)
        )

    def test_clause_names_do_not_control_unit_pairing(self):
        oracle = inventory(clause_id="ORACLE_NAME", second_instance=False)
        candidate = inventory(clause_id="CANDIDATE_NAME", second_instance=False)
        unit = pair_inventories(oracle, candidate)[0]
        self.assertEqual(
            "root::P::Root/root-instance::P::root/component::P::root::controller_a::compute",
            unit.key,
        )
        self.assertEqual("ORACLE_NAME", unit.oracle_clauses[0].clause_id)
        self.assertEqual("CANDIDATE_NAME", unit.candidate_clauses[0].clause_id)

    def test_unsupported_coverage_fails_closed_and_is_auditable(self):
        value = inventory(gap=True, second_instance=False)
        unit = pair_inventories(value, value)[0]
        self.assertFalse(unit.coverage_complete)
        self.assertIn("compute-handler", unit.unsupported_reasons)
        accounting = clause_accounting(value, (unit,))
        self.assertFalse(accounting["complete"])
        self.assertEqual(["G"], accounting["explicitly_unsupported_clause_ids"])

    def test_architecture_drift_is_model_mismatch_not_coverage_gap(self):
        oracle = inventory(second_instance=False)
        changed = inventory(second_instance=False)
        changed = replace(
            changed,
            instances=(replace(changed.instances[0], category="Device"),),
        )
        with self.assertRaises(InventoryModelMismatch):
            pair_inventories(oracle, changed)

    def test_missing_authoritative_gumbox_identity_fails_closed(self):
        value = inventory(second_instance=False)
        raw = {
            "root": value.instances[0].root,
            "root_instance_path": value.instances[0].root_instance_path,
            "instance_path": value.instances[0].instance_path,
            "classifier": value.instances[0].classifier,
            "category": value.instances[0].category,
            "observations": [],
        }
        with self.assertRaisesRegex(InventoryError, "gumbox_object"):
            type(value.instances[0]).from_json(raw)

    def test_unsupported_instance_feature_marks_its_unit_incomplete(self):
        value = inventory(second_instance=False)
        unsupported = replace(
            value.instances[0],
            supported=False,
            unsupported_reasons=("event-port",),
        )
        value = replace(value, instances=(unsupported,))
        unit = pair_inventories(value, value)[0]
        self.assertFalse(unit.coverage_complete)
        self.assertEqual(("event-port",), unit.unsupported_reasons)
        self.assertFalse(value.coverage_complete)

    def test_duplicate_authoritative_gumbox_identity_is_ambiguous(self):
        value = inventory()
        duplicate = replace(
            value.instances[1], gumbox_object=value.instances[0].gumbox_object
        )
        value = replace(value, instances=(value.instances[0], duplicate))
        with self.assertRaisesRegex(InventoryError, "GumboX object identity is ambiguous"):
            pair_inventories(value, value)

    def test_codegen_root_selection_uses_classifier_not_instance_name(self):
        value = inventory(second_instance=False)
        units = pair_inventories(value, value)
        self.assertEqual(("P::Root",), select_codegen_roots(value, value, units))

    def test_state_is_paired_as_old_and_new_values_with_write_limits(self):
        value = inventory(second_instance=False)
        state = InventoryState(
            classifier="P::Controller",
            name="mode",
            qualified_type="Base_Types::Integer_32",
        )
        footprint = InventoryWriteFootprint(
            classifier="P::Controller",
            phase="compute",
            restricted=True,
            targets=("mode",),
        )
        value = replace(
            value,
            states=(state,),
            write_footprints=(footprint,),
        )
        unit = pair_inventories(value, value)[0]
        self.assertEqual(
            ("x", "y", "In_mode", "mode"),
            tuple(item.name for item in unit.observations),
        )
        self.assertTrue(unit.oracle_writes.restricted)
        self.assertEqual(("mode",), unit.oracle_writes.targets)

    def test_state_missing_on_one_side_is_explicitly_unconstrained(self):
        oracle = inventory(second_instance=False)
        candidate = inventory(second_instance=False)
        state = InventoryState(
            classifier="P::Controller",
            name="mode",
            qualified_type="Base_Types::Integer_32",
        )
        oracle = replace(oracle, states=(state,))
        unit = pair_inventories(oracle, candidate)[0]
        old, new = unit.observations[-2:]
        self.assertEqual(("In_mode", "mode"), (old.name, new.name))
        self.assertTrue(old.oracle_declared)
        self.assertFalse(old.candidate_declared)
        self.assertEqual(old.oracle_type, old.candidate_type)

    def test_datatype_only_units_get_a_deterministic_resolved_host(self):
        value = inventory(include_contract=False, second_instance=False)
        datatype_owner = {
            "classifier": "Base_Types::Integer_32",
            "phase": "datatype-invariant",
            "source_object": "Base_Types::Integer_32::GUMBO::datatype-invariant",
            "assumption_count": 0,
            "guarantee_count": 0,
            "case_count": 0,
            "contributor_count": 0,
            "supported": True,
            "unsupported_reasons": [],
        }
        value = replace(
            value,
            contract_owners=(ContractOwner.from_json(datatype_owner),),
        )
        units = pair_inventories(value, value)
        self.assertEqual(("P::Root",), select_codegen_roots(value, value, units))
        missing_candidate_host = replace(
            value, roots=(replace(value.roots[0], type_names=()),)
        )
        units = pair_inventories(value, missing_candidate_host)
        with self.assertRaisesRegex(
            InventoryError, "no resolved codegen root hosts datatype-only units"
        ):
            select_codegen_roots(value, missing_candidate_host, units)

    def test_unselected_duplicate_root_classifier_is_still_ambiguous(self):
        value = inventory(second_instance=False)
        duplicate = replace(value.roots[0], instance_path="P::other_root")
        value = replace(value, roots=(value.roots[0], duplicate))
        units = pair_inventories(value, value)
        with self.assertRaisesRegex(
            InventoryError, "selector is ambiguous across root instances"
        ):
            select_codegen_roots(value, value, units)


if __name__ == "__main__":
    unittest.main()
