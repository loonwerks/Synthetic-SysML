import json
import os
import re
import shutil
import subprocess
import tempfile
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parents[2]
SOURCE = ROOT / "src" / "snl_parser" / "SnlRules.scala"
LIBRARY = ROOT / "external/sysml-aadl-libraries"
GOLDEN = ROOT / "src" / "snl_parser" / "examples" / "snl.md"
GOLDEN_INVENTORY = (
    ROOT
    / "src"
    / "snl_parser"
    / "examples"
    / "resolved-publication-inventory.json"
)
FIXTURES = ROOT / "tests" / "snl_parser" / "fixtures"
EXPRESSION_FUNCTION = FIXTURES / "ExpressionAndFunctionCoverage.sysml"
COMPOSITION = FIXTURES / "CompositionCoverage.sysml"
HANDLER = FIXTURES / "HandlerCoverage.sysml"
EMPTY_PHASE = FIXTURES / "EmptyPhaseCoverage.sysml"
DUPLICATE_ID = FIXTURES / "DuplicateIdCoverage.sysml"
NUMERIC_LITERALS = FIXTURES / "NumericLiteralCoverage.sysml"
NESTED_BOOLEAN_ASSIGNMENTS = FIXTURES / "NestedBooleanAssignmentCoverage.sysml"

ORACLES = {
    "greenhouse": (
        ROOT
        / "src/snl_parser/examples/Greenhouse_Ventilation.sysml",
        5,
    ),
    "battery-qualification": (
        ROOT
        / "datasets/battery-evidence-and-charging-qualification-supervisor/evaluator/oracle.sysml",
        100,
    ),
}


def sireum() -> Path:
    home = os.environ.get("SIREUM_HOME")
    if home:
        candidate = Path(home) / "bin" / "sireum"
        if candidate.is_file():
            return candidate
    discovered = shutil.which("sireum")
    return Path(discovered) if discovered else Path("sireum")


class SnlRendererTest(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        cls.sireum = sireum()
        if not cls.sireum.is_file():
            raise unittest.SkipTest("pinned Sireum installation is unavailable")
        if not LIBRARY.is_dir():
            raise unittest.SkipTest("external/sysml-aadl-libraries is unavailable")
        cls.render_cache = {}
        cls.inventory_cache = {}
        cls.upstream = cls.sireum.parent.parent / "hamr"

    def render(self, model: Path) -> str:
        if model in self.render_cache:
            return self.render_cache[model]
        with tempfile.TemporaryDirectory() as temporary:
            output = Path(temporary) / "snl.md"
            inventory = Path(temporary) / "inventory.json"
            completed = subprocess.run(
                [
                    str(self.sireum),
                    "slang",
                    "run",
                    str(SOURCE),
                    "--model",
                    str(model),
                    "--library",
                    str(LIBRARY),
                    "--output",
                    str(output),
                    "--inventory-output",
                    str(inventory),
                ],
                cwd=ROOT,
                text=True,
                stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT,
                timeout=180,
                check=False,
            )
            self.assertEqual(0, completed.returncode, completed.stdout)
            rendered = output.read_text(encoding="utf-8")
            self.render_cache[model] = rendered
            self.inventory_cache[model] = json.loads(
                inventory.read_text(encoding="utf-8")
            )
            return rendered

    def markdown_section(self, rendered: str, heading: str) -> str:
        """Return one Markdown section without coupling tests to source metadata."""
        match = re.search(rf"^(?P<marks>#+) {re.escape(heading)}\s*$", rendered, re.MULTILINE)
        self.assertIsNotNone(match, f"missing Markdown section: {heading}")
        depth = len(match.group("marks"))
        following = re.search(
            rf"^#{{1,{depth}}} ", rendered[match.end() :], re.MULTILINE
        )
        end = match.end() + following.start() if following else len(rendered)
        return rendered[match.start() : end]

    @staticmethod
    def normative_prose(rendered: str) -> str:
        return "\n".join(
            line[1:].lstrip() for line in rendered.splitlines() if line.startswith(">")
        )

    def test_greenhouse_matches_retained_golden(self):
        actual = self.render(ORACLES["greenhouse"][0])
        self.assertEqual(GOLDEN.read_text(encoding="utf-8"), actual)
        self.assertIn("Trace IDs: `BEH-01`, `CTRL-01`, `CTRL-02`", actual)
        self.assertNotIn("`api.", actual)
        self.assertIn("## Contract owner `Greenhouse_Ventilation::Ventilation_Decision_i`", actual)
        self.assertIn("### Compute phase", actual)
        self.assertIn("- `SNL_STYLE_VERSION`: `2`", actual)
        case = self.markdown_section(actual, "Case `BEH_01_VALID_ABOVE`")
        self.assertRegex(
            case,
            re.compile(
                r"^> During contract evaluation for the compute phase, if ",
                re.MULTILINE,
            ),
        )
        self.assertEqual(1, case.count(" shall "))
        self.assertIn("shall set `fan_command` to `Fan_Command.On`", case)
        self.assertIn("and `sensor_fault` to `Sensor_Fault_Indication.Clear`", case)
        self.assertIn("Quality note: The source clause coordinates 2 assignments", case)
        self.assertNotIn("shall ensure", case)
        self.assertNotIn("The contract owner shall", actual)
        self.assertNotIn("**Applicability.**", actual)
        self.assertNotIn("**Required result.**", actual)
        self.assertNotRegex(
            actual,
            re.compile(r"^END (?:CASE|INVARIANT|GUARANTEE|PHASE)", re.MULTILINE),
        )
    def test_requirements_language_uses_direct_active_standalone_prose(self):
        rendered = self.render(ORACLES["greenhouse"][0])

        lower = self.markdown_section(
            rendered, "Invariant `REPRESENTABLE_TEMPERATURE_RANGE`"
        )
        upper = self.markdown_section(
            rendered, "Invariant `SELECTABLE_UPPER_LIMIT_RANGE`"
        )
        self.assertIn("between -20 [S32] and 60 [S32], inclusive", lower)
        self.assertIn("between 10 [S32] and 35 [S32], inclusive", upper)
        for invariant in (lower, upper):
            self.assertEqual(1, invariant.count(" shall "))
            self.assertNotIn("shall satisfy the condition", invariant)

        prose = self.normative_prose(rendered)
        self.assertNotRegex(prose, re.compile(r"\b(?:this|its|those)\b", re.IGNORECASE))

    def test_publication_inventory_has_definitive_sources_and_audit_boundary(self):
        with tempfile.TemporaryDirectory() as temporary:
            output = Path(temporary) / "snl.md"
            inventory_path = Path(temporary) / "inventory.json"
            completed = subprocess.run(
                [
                    str(self.sireum), "slang", "run", str(SOURCE),
                    "--model", str(ORACLES["greenhouse"][0]),
                    "--library", str(LIBRARY), "--output", str(output),
                    "--inventory-output", str(inventory_path),
                ],
                cwd=ROOT,
                text=True,
                stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT,
                timeout=180,
                check=False,
            )
            self.assertEqual(0, completed.returncode, completed.stdout)
            self.assertEqual(
                GOLDEN_INVENTORY.read_text(encoding="utf-8"),
                inventory_path.read_text(encoding="utf-8"),
            )
            inventory = json.loads(inventory_path.read_text(encoding="utf-8"))
            self.assertTrue(
                all(
                    record["source"]["uri"].startswith("workspace:")
                    for record in inventory["records"]
                )
            )
            self.assertEqual(
                "passed",
                inventory["quality_audit"]["automated_checks"][
                    "generated_prose_style"
                ],
            )
            self.assertTrue(
                all(
                    status == "not_assessed"
                    for status in inventory["quality_audit"][
                        "engineering_review"
                    ].values()
                )
            )

    def test_boolean_equivalence_uses_exactly_when(self):
        rendered = self.render(ORACLES["battery-qualification"][0])
        guarantee = self.markdown_section(
            rendered, "Guarantee `ATTENTION_PUBLICATION`"
        )
        self.assertIn(" exactly when ", guarantee)
        self.assertNotIn("same truth value", guarantee)

    def test_all_oracles_have_expected_unique_contracts_and_traces(self):
        for name, (model, expected) in ORACLES.items():
            with self.subTest(name=name):
                rendered = self.render(model)
                ids = re.findall(
                    r"^#{3,5} (?:Invariant|Assumption|Guarantee|Case) `([^`]+)`",
                    rendered,
                    re.MULTILINE,
                )
                traces = re.findall(r"^- Trace IDs: `", rendered, re.MULTILINE)
                oracle_ids = {
                    record["formal_id"]
                    for record in self.inventory_cache[model]["records"]
                }
                self.assertEqual(expected, len(ids))
                self.assertEqual(len(ids), len(set(ids)))
                self.assertEqual(oracle_ids, set(ids))
                self.assertEqual(expected, len(traces))
                self.assertNotIn("`api.", rendered)
        self.assertIn(
            "exactly when", self.render(ORACLES["battery-qualification"][0])
        )

    def test_functions_casts_quantifiers_and_nested_values(self):
        rendered = self.render(EXPRESSION_FUNCTION)
        self.assertIn("### Function `arbitrary`", rendered)
        self.assertIn("Function category: Specification only", rendered)
        self.assertIn("### Function `nonnegative`", rendered)
        self.assertIn("Reads: `flag`", rendered)
        self.assertIn("Preconditions:", rendered)
        self.assertIn("Postconditions:", rendered)
        self.assertIn("- **If:**", rendered)
        self.assertNotIn("\n- then:", rendered)
        self.assertIn("`value` cast to `Base_Types::Integer_32`", rendered)
        self.assertIn("For every `i` from 0 through 3", rendered)
        self.assertIn("There exists `i` from 0 through 3", rendered)
        self.assertIn("the result of `boolean_identity` for (`value` is at least", rendered)
        self.assertIn("the result of `boolean_identity` for (For every", rendered)
        self.assertIn("**Use:**", rendered)
        self.assertIn("**Otherwise use:**", rendered)
        self.assertIn("Trace IDs: `SNL-VALUE-CONDITIONAL`", rendered)
        self.assertIn("Trace IDs: `SNL-BOOLEAN-CONDITIONAL`", rendered)
        self.assertIn("the unary-plus value of `value`", rendered)
        self.assertIn("the arithmetic negation of `value`", rendered)
        self.assertIn("the bitwise complement of `value`", rendered)
        self.assertIn("the remainder of `value`", rendered)
        self.assertIn("it is not the case that `flag` is true", rendered)
        self.assertNotIn("different truth value", rendered)
        self.assertNotIn("evaluated left to right", self.normative_prose(rendered))
        for phrase in ("the sum of", "the difference of", "the product of", "the quotient of"):
            self.assertIn(phrase, rendered)
        self.assertIn("### Function `global_type`", rendered)
        self.assertNotIn("$::Base_Types", rendered)
        self.assertIn("the result of `zero_argument_value` is 1 [S32]", rendered)
        self.assertNotIn("`zero_argument_value` for ()", rendered)
        self.assertIn(
            "the result of `SNL_Expression_Function_Coverage.GUMBO__Library.boolean_identity` for (`value` is true)",
            rendered,
        )
        self.assertNotRegex(rendered, re.compile(r"`[^`]+`\.[A-Za-z_]"))
        self.assertIn("### Function `negated_boolean`", rendered)
        self.assertIn(
            "> The function returns true exactly when `value` is false.", rendered
        )
        self.assertIn("the element at index 0 of `values`", rendered)
        self.assertNotIn("BD5E4F", rendered)
        self.assertNotIn("SNL_INDEX_DEBUG", rendered)

    def test_nested_boolean_predicates_are_assignment_values(self):
        rendered = self.render(NESTED_BOOLEAN_ASSIGNMENTS)
        for formal_id in (
            "BOOLEAN_DISJUNCTION_VALUE",
            "BOOLEAN_CONJUNCTION_VALUE",
            "BOOLEAN_EQUALITY_VALUE",
        ):
            section = self.markdown_section(rendered, f"Guarantee `{formal_id}`")
            self.assertIn("shall set `result` to true exactly when", section)
            self.assertEqual(1, section.count(" shall "))
        self.assertIn("`facts.mode` is `Mode.First` or `facts.mode` is `Mode.Second`", rendered)
        self.assertIn("`facts.enabled` is true, `facts.healthy` is true, and", rendered)

    def test_composition_and_direct_input(self):
        rendered = self.render(COMPOSITION)
        for heading in (
            "Component aliases:",
            "Port aliases:",
            "State-variable aliases:",
            "Parallel split/join:",
        ):
            self.assertIn(heading, rendered)
        self.assertIn("Label `branches_joined`", rendered)
        self.assertIn("as occurrence `left_first`", rendered)
        self.assertIn("at cycle start", rendered)
        self.assertIn("at cycle end", rendered)
        self.assertIn("at label `branches_joined`", rendered)
        self.assertIn("before occurrence `left_first`", rendered)
        self.assertIn("after occurrence `left_first`", rendered)
        self.assertIn("Specializes: `base_obligations`, `extra_obligations`", rendered)
        self.assertIn("#### Property `colon_specialization`", rendered)
        self.assertIn("Specializes: `extra_obligations`", rendered)
        self.assertIn("#### Property `empty_property`", rendered)
        self.assertGreaterEqual(rendered.count("##### Effective binding at cycle start"), 2)
        self.assertIn("the value of `memory` on entry is true", rendered)
        self.assertIn("Trace IDs: `SNL-DIRECT-INPUT`", rendered)
        preserved = self.markdown_section(
            rendered, "Guarantee `memory_is_preserved`"
        )
        self.assertIn("shall preserve the value of `memory` on entry", preserved)
        self.assertEqual(1, preserved.count(" shall "))
        self.assertIn("Trace IDs: `SNL-PRESERVE-ENTRY`", preserved)
        mixed = self.markdown_section(rendered, "Guarantee `preserve_and_set`")
        self.assertIn(
            "shall preserve the value of `memory` on entry and set `output_value` to true",
            mixed,
        )
        self.assertEqual(1, mixed.count(" shall "))
        self.assertIn("Trace IDs: `SNL-MIXED-ACTIONS`", mixed)

    def test_handler_nested_clauses_and_one_argument_port_operations(self):
        rendered = self.render(HANDLER)
        self.assertIn("#### Handler for `trigger`", rendered)
        self.assertIn("##### Assumption `dispatched`", rendered)
        self.assertIn("##### Case `handler_case`", rendered)
        self.assertIn(
            "Authored description: A dispatched trigger is accepted, and no additional result is constrained",
            rendered,
        )
        self.assertNotRegex(rendered, re.compile(r"^\s*\|", re.MULTILINE))
        handler_case = self.markdown_section(rendered, "Case `handler_case`")
        self.assertIn("Semantic status:", handler_case)
        self.assertNotIn(" shall ", self.normative_prose(handler_case))
        self.assertIn("##### Case `unguarded_handler_case`", rendered)
        unguarded = self.markdown_section(rendered, "Case `unguarded_handler_case`")
        self.assertIn("Semantic status:", unguarded)
        self.assertNotIn(" shall ", self.normative_prose(unguarded))
        self.assertIn("##### Case `unguarded_conditional_obligation`", rendered)
        conditional = self.markdown_section(
            rendered, "Case `unguarded_conditional_obligation`"
        )
        self.assertIn("Semantic status: tautology", conditional)
        self.assertNotIn(" shall ", self.normative_prose(conditional))
        self.assertRegex(
            conditional,
            re.compile(
                r"^> During contract evaluation for the compute phase, when handling an event on `trigger`, ",
                re.MULTILINE,
            ),
        )
        self.assertNotIn("shall ensure", conditional)
        unreachable = self.markdown_section(
            rendered, "Case `unreachable_handler_case`"
        )
        self.assertIn("Semantic status: unreachable", unreachable)
        self.assertIn("Trace IDs: `SNL-UNREACHABLE-CASE`", unreachable)
        self.assertNotIn(" shall ", self.normative_prose(unreachable))
        self.assertIn("Trace IDs: `SNL-HANDLER-ASSUME`", rendered)
        self.assertIn("Trace IDs: `SNL-HANDLER-CASE`", rendered)
        self.assertIn("a value or event is present on port `trigger`", rendered)
        self.assertIn("a value or event is present on port `signal`", rendered)
        self.assertIn("#### Guarantee `trigger_present_matches_true`", rendered)
        self.assertIn(
            "shall produce a result for which a value or event is present on port `trigger`",
            rendered,
        )
        self.assertNotIn("present on port `trigger` has the same truth value", rendered)
        self.assertNotIn("resolved port option", rendered.lower())
        unrestricted = self.markdown_section(
            rendered, "Guarantee `unrestricted_name`"
        )
        self.assertIn("Semantic status: tautology", unrestricted)
        self.assertIn("imposes no behavioral restriction", unrestricted)
        self.assertNotIn(" shall ", self.normative_prose(unrestricted))
        self.assertIn("Trace IDs: `SNL-UNRESTRICTED-NAME`", rendered)
        self.assertIn("#### Handler for `empty_trigger`", rendered)
        self.assertNotIn("is non-empty is true", rendered)
        handler = self.markdown_section(rendered, "Handler for `trigger`")
        self.assertRegex(
            handler,
            re.compile(
                r"^> During contract evaluation for the compute phase, when handling an event on ",
                re.MULTILINE,
            ),
        )
        self.assertNotRegex(
            self.normative_prose(handler),
            re.compile(r"\b(?:this|its|those)\b", re.IGNORECASE),
        )
        complex_case = self.markdown_section(
            rendered, "Case `complex_applicability`"
        )
        self.assertIn("case `complex_applicability` applies under", complex_case)
        self.assertIn("When all applicability conditions are met", complex_case)
        self.assertNotIn("applicability conditions shall hold", complex_case)
        self.assertEqual(1, complex_case.count(" shall "))

    def test_explicit_empty_initialize_and_compute_phases(self):
        rendered = self.render(EMPTY_PHASE)
        self.assertIn(
            "### Initialization phase\nNo contract clauses are defined.",
            rendered,
        )
        self.assertIn(
            "### Compute phase\nNo contract clauses are defined.",
            rendered,
        )

    def test_pinned_tempcontrol_functions_handlers_and_port_options(self):
        fixture = (
            self.upstream
            / "codegen/jvm/src/test/resources/models/Ros2/sysml-temp-control-mixed-microros"
        )
        if not fixture.is_dir():
            self.skipTest("pinned TempControl fixture is unavailable")
        with tempfile.TemporaryDirectory() as temporary:
            output = Path(temporary) / "snl.md"
            completed = subprocess.run(
                [
                    str(self.sireum), "slang", "run", str(SOURCE),
                    "--model", str(fixture), "--library", str(LIBRARY),
                    "--output", str(output),
                ],
                cwd=ROOT,
                text=True,
                stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT,
                timeout=180,
                check=False,
            )
            self.assertNotEqual(0, completed.returncode, completed.stdout)
            self.assertIn("not globally unique", completed.stdout)
            self.assertFalse(output.exists())

    def test_pinned_numeric_literal_families(self):
        rendered = self.render(NUMERIC_LITERALS)
        for phrase in (
            "9 [S8]",
            "64 [Z64]",
            "64 [N64]",
            "1 [U1]",
            "1 [U64]",
            "1.0 [F32]",
            "1.0 [F64]",
            "1.0 [R]",
            "string \"astring\"",
            "character 'c'",
        ):
            self.assertIn(phrase, rendered)

    def test_frontend_boundary_and_fail_closed_audit(self):
        source = SOURCE.read_text(encoding="utf-8")
        self.assertIn("FrontEnd.typeCheck", source)
        self.assertIn("GclAnnexClauseInfo", source)
        self.assertIn("annexLibInfos", source)
        self.assertNotIn("fromSysmlAstTopUnit", source)
        self.assertIn("unsupported resolved Slang predicate", source)
        self.assertIn("unresolved 'this' receiver cannot be named unambiguously", source)
        completed = subprocess.run(
            [str(self.sireum), "slang", "run", str(SOURCE), "--audit-fail-closed"],
            cwd=ROOT,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            timeout=180,
            check=False,
        )
        self.assertNotEqual(0, completed.returncode, completed.stdout)
        self.assertIn("SNL fail-closed audit: unsupported resolved Slang predicate", completed.stdout)

        coverage = (ROOT / "src/snl_parser/GUMBO_GRAMMAR_COVERAGE.tsv").read_text(
            encoding="utf-8"
        )
        self.assertIn("RESOLVED_IMPLEMENTED", coverage)
        self.assertIn("FRONTEND_REJECTED", coverage)
        self.assertIn("FRONTEND_RESOLUTION_GAP", coverage)
        self.assertIn("DEFENSIVE_ONLY", coverage)
        self.assertNotIn("RESOLVED_RENDERER_UNSUPPORTED", coverage)
        self.assertIn("infoflow", coverage)
        self.assertIn("initialize, compute, and handlers", coverage)

    def test_duplicate_formal_ids_fail_before_publication(self):
        with tempfile.TemporaryDirectory() as temporary:
            output = Path(temporary) / "snl.md"
            completed = subprocess.run(
                [
                    str(self.sireum),
                    "slang",
                    "run",
                    str(SOURCE),
                    "--model",
                    str(DUPLICATE_ID),
                    "--library",
                    str(LIBRARY),
                    "--output",
                    str(output),
                ],
                cwd=ROOT,
                text=True,
                stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT,
                timeout=180,
                check=False,
            )
            self.assertNotEqual(0, completed.returncode, completed.stdout)
            self.assertIn("not globally unique", completed.stdout)
            self.assertFalse(output.exists())


if __name__ == "__main__":
    unittest.main()
