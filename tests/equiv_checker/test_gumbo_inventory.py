import json
from pathlib import Path
import shutil
import subprocess
import tempfile
import unittest


ROOT = Path(__file__).resolve().parents[2]
ADAPTER = ROOT / "src/equiv_checker/adapters/GumboInventory.scala"
MODEL = ROOT / "src/snl_parser/examples/Greenhouse_Ventilation.sysml"
DUPLICATE_ROOT_MODEL = (
    ROOT
    / "cps48/runs/20260813T155231Z-drone-governor-hard-r2-a1/model/Drone_Battery_Charge_Qualification_Supervisor.sysml"
)
LIBRARY = ROOT / "external/sysml-aadl-libraries"
SIREUM = shutil.which("sireum")


class GumboInventoryTest(unittest.TestCase):
    def test_greenhouse_resolved_owner_phase_source_and_trace_inventory(self):
        if SIREUM is None:
            self.skipTest("Sireum is not installed")
        with tempfile.TemporaryDirectory() as temp:
            output = Path(temp) / "inventory.json"
            duplicate = Path(temp) / "inventory-duplicate.json"
            duplicate_root = Path(temp) / "duplicate-root-inventory.json"
            completed = subprocess.run(
                [
                    str(SIREUM), "slang", "run", str(ADAPTER),
                    "--batch", str(LIBRARY),
                    str(MODEL), str(output),
                    str(MODEL), str(duplicate),
                    str(DUPLICATE_ROOT_MODEL), str(duplicate_root),
                ],
                cwd=ROOT,
                text=True,
                stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT,
                timeout=180,
                check=False,
            )
            self.assertEqual(0, completed.returncode, completed.stdout)
            inventory = json.loads(output.read_text(encoding="utf-8"))
            self.assertEqual(
                inventory,
                json.loads(duplicate.read_text(encoding="utf-8")),
            )
            duplicate_root_inventory = json.loads(
                duplicate_root.read_text(encoding="utf-8")
            )
            instance_keys = [
                (item["root"], item["root_instance_path"], item["instance_path"])
                for item in duplicate_root_inventory["instances"]
            ]
            self.assertEqual(len(instance_keys), len(set(instance_keys)))
        self.assertEqual("0.1.0", inventory["schema_version"])
        self.assertEqual("2.0.0", inventory["inventory_schema_version"])
        self.assertIn("FrontEnd.typeCheck", inventory["semantic_authority"])
        records = inventory["records"]
        self.assertEqual(5, len(records))
        by_id = {record["id"]: record for record in records}
        self.assertEqual("datatype-invariant", by_id["REPRESENTABLE_TEMPERATURE_RANGE"]["phase"])
        self.assertEqual("compute", by_id["BEH_01_VALID_ABOVE"]["phase"])
        self.assertEqual(
            "Greenhouse_Ventilation::Ventilation_Decision_i",
            by_id["FAULT_01_INVALID"]["owner"],
        )
        self.assertEqual(
            ["FAULT-01", "CTRL-01", "CTRL-02", "RISK-01"],
            by_id["FAULT_01_INVALID"]["trace_ids"],
        )
        self.assertEqual(106, by_id["FAULT_01_INVALID"]["source"]["line"])
        decision = next(
            item
            for item in inventory["instances"]
            if item["instance_path"].endswith("control_process::ventilation_decision")
        )
        self.assertEqual(
            "Greenhouse_Ventilation.Ventilation_Decision_i_control_process_ventilation_decision_GumboX",
            decision["gumbox_object"],
        )
        self.assertIn("NameUtil.getAirNameProvider", decision["gumbox_naming_authority"])
        self.assertEqual(
            "Greenhouse_Ventilation::Greenhouse_Ventilation_Root",
            decision["root"],
        )
        self.assertEqual(
            "Greenhouse_Ventilation_Root_Instance",
            decision["root_instance_path"],
        )
        root = next(
            item
            for item in inventory["roots"]
            if item["instance_path"] == "Greenhouse_Ventilation_Root_Instance"
        )
        self.assertEqual(decision["root"], root["classifier"])


if __name__ == "__main__":
    unittest.main()
