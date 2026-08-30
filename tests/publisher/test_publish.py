from __future__ import annotations

import json
import tempfile
import unittest
from pathlib import Path

from publisher import publish


ROOT = Path(__file__).resolve().parents[2]
GREENHOUSE_MODEL = ROOT / "src/snl_parser/examples/Greenhouse_Ventilation.sysml"
SNL = ROOT / "src/snl_parser/examples/snl.md"
INVENTORY = ROOT / "src/snl_parser/examples/resolved-publication-inventory.json"


def snl_document(body: str) -> str:
    return f"""# Structured natural-language view of resolved GUMBO

- `SNL_STYLE_VERSION`: `2`
- `SEMANTIC_INPUT`: `FrontEnd.typeCheck` → `GclAnnexClauseInfo` / Slang AST

{body.strip()}
"""


def concrete_function(
    name: str,
    *,
    trace: str | None = None,
    inputs: tuple[tuple[str, str], ...] = (),
    extra: str = "",
    body: str = "> The function returns true.",
) -> str:
    lines = [f"### Function `{name}`"]
    if trace:
        lines.append(f"- Trace IDs: `{trace}`")
    lines.extend(("- Source: line 2, column 3", "- Function category: Strictly pure"))
    lines.extend(f"- Input `{name}` has type `{kind}`." for name, kind in inputs)
    lines.append("- Result type: `Base_Types::Boolean`.")
    if extra:
        lines.extend(("", extra.strip()))
    lines.extend(("", body))
    return "\n".join(lines)


def one_clause(identifier: str = "KEEP_VALUE") -> str:
    return f"""### Compute phase

#### Guarantee `{identifier}`
- Source: line 8, column 5

> During contract evaluation for the compute phase, `Worker` shall set `value` to true.
"""


class SnlPublicationTest(unittest.TestCase):
    def test_generic_functions_cover_zero_one_and_multiple_inputs(self) -> None:
        body = "\n\n".join(
            (
                "## Contract library `Demo::Library`",
                "- Source: line 1, column 1",
                concrete_function("zero"),
                concrete_function(
                    "one", inputs=(("value", "Base_Types::Boolean"),)
                ),
                concrete_function(
                    "many",
                    inputs=(
                        ("left", "Base_Types::Boolean"),
                        ("right", "Base_Types::Integer_32"),
                    ),
                ),
            )
        )
        publication = publish.publish_snl_document(snl_document(body))

        self.assertEqual([0, 1, 2], [len(item.inputs) for item in publication.functions])
        self.assertEqual(
            ["Demo::Library::zero", "Demo::Library::one", "Demo::Library::many"],
            [item.identity for item in publication.functions],
        )
        self.assertEqual(3, publication.text.count("- Function category:"))

    def test_function_traces_are_optional_and_never_published(self) -> None:
        body = "\n\n".join(
            (
                "## Contract library `Demo::Library`",
                "- Source: line 1, column 1",
                concrete_function("traced", trace="FN-01"),
                concrete_function("untraced"),
            )
        )
        publication = publish.publish_snl_document(snl_document(body))

        self.assertEqual(("FN-01",), publication.functions[0].trace_ids)
        self.assertEqual((), publication.functions[1].trace_ids)
        self.assertNotIn("Trace IDs", publication.text)
        self.assertNotIn("Source: line", publication.text)

    def test_same_function_name_under_distinct_owners_is_unambiguous(self) -> None:
        body = "\n\n".join(
            (
                "## Contract library `Demo::First`",
                "- Source: line 1, column 1",
                concrete_function("enabled"),
                "## Contract library `Demo::Second`",
                "- Source: line 5, column 1",
                concrete_function("enabled"),
            )
        )
        publication = publish.publish_snl_document(snl_document(body))

        self.assertEqual(
            ["Demo::First::enabled", "Demo::Second::enabled"],
            [item.identity for item in publication.functions],
        )

    def test_duplicate_owner_qualified_function_fails(self) -> None:
        body = "\n\n".join(
            (
                "## Contract library `Demo::Library`",
                "- Source: line 1, column 1",
                concrete_function("enabled"),
                concrete_function("enabled"),
            )
        )
        with self.assertRaisesRegex(publish.BuildError, "duplicate owner-qualified"):
            publish.publish_snl_document(snl_document(body))

    def test_function_preserves_reads_contracts_and_conditional_return(self) -> None:
        extra = """- Reads: `flag`, `limit`

**Preconditions:**

- `limit` is at least 0 [S32]

**Postconditions:**

- **If:**

  `flag` is true

  **Then:**

  the result is true"""
        return_body = """> The function returns true exactly when **If:**
>
> `flag` is true
>
> **Then:**
>
> true
>
> **Otherwise:**
>
> false."""
        body = "\n\n".join(
            (
                "## Contract library `Demo::Library`",
                "- Source: line 1, column 1",
                concrete_function(
                    "conditional",
                    inputs=(("flag", "Base_Types::Boolean"),),
                    extra=extra,
                    body=return_body,
                ),
            )
        )
        publication = publish.publish_snl_document(snl_document(body))
        record = publication.functions[0]

        self.assertEqual(("flag", "limit"), record.reads)
        self.assertTrue(record.has_preconditions)
        self.assertTrue(record.has_postconditions)
        for fragment in ("- Reads:", "**Preconditions:**", "**Postconditions:**", "**Otherwise:**"):
            self.assertIn(fragment, publication.text)

    def test_unknown_or_malformed_function_metadata_fails_closed(self) -> None:
        malformed = concrete_function("bad").replace(
            "- Result type:", "- Unsupported metadata: x\n- Result type:"
        )
        body = "\n\n".join(
            ("## Contract library `Demo::Library`", "- Source: line 1, column 1", malformed)
        )
        with self.assertRaisesRegex(publish.BuildError, "unsupported function metadata"):
            publish.publish_snl_document(snl_document(body))

        missing_result = concrete_function("bad").replace(
            "- Result type: `Base_Types::Boolean`.\n", ""
        )
        with self.assertRaisesRegex(
            publish.BuildError, "missing required metadata|return body precedes signature"
        ):
            publish.publish_snl_document(
                snl_document(
                    "\n\n".join(
                        (
                            "## Contract library `Demo::Library`",
                            "- Source: line 1, column 1",
                            missing_result,
                        )
                    )
                )
            )

    def test_function_and_clause_accounting_is_exact(self) -> None:
        body = "\n\n".join(
            (
                "## Contract owner `Demo::Worker`",
                "- Source: line 1, column 1",
                concrete_function("first"),
                concrete_function("second"),
                one_clause("FIRST"),
                "#### Guarantee `SECOND`\n- Source: line 12, column 5\n\n"
                "> During contract evaluation for the compute phase, `Worker` shall set `other` to false.",
            )
        )
        publication = publish.publish_snl_document(snl_document(body))

        self.assertEqual(2, len(publication.functions))
        self.assertEqual(2, len(publication.clauses))
        self.assertEqual(2, publication.text.count("- Function category:"))
        self.assertEqual(1, publication.text.count("`FIRST` —"))
        self.assertEqual(1, publication.text.count("`SECOND` —"))

    def test_state_and_phase_modifies_are_published(self) -> None:
        body = """## Contract owner `Demo::Worker`
- Source: line 1, column 1

State `memory` has type `Base_Types::Boolean`.

### Compute phase
May modify: `memory`

#### Guarantee `UPDATE`
- Source: line 5, column 3

> During contract evaluation for the compute phase, `Worker` shall set `memory` to true.
"""
        publication = publish.publish_snl_document(snl_document(body))

        self.assertEqual(["Demo::Worker::memory"], [item.identity for item in publication.states])
        self.assertIn("### State `Demo::Worker::memory`", publication.text)
        self.assertIn("May modify: memory", publication.text)

    def test_unsupported_formal_structures_fail_closed(self) -> None:
        for heading in (
            "### Composition `schedule`",
            "### Information flow `telemetry`",
            "#### Handler for `port`",
        ):
            with self.subTest(heading=heading):
                body = "\n\n".join(
                    (
                        "## Contract owner `Demo::Worker`",
                        "- Source: line 1, column 1",
                        heading,
                    )
                )
                with self.assertRaisesRegex(publish.BuildError, "does not support|unsupported"):
                    publish.publish_snl_document(snl_document(body))

    def test_header_version_and_semantic_authority_are_required(self) -> None:
        valid = snl_document(
            "\n\n".join(
                (
                    "## Contract owner `Demo::Worker`",
                    "- Source: line 1, column 1",
                    one_clause(),
                )
            )
        )
        for changed in (
            valid.replace("`2`", "`999`", 1),
            valid.replace("FrontEnd.typeCheck", "CustomParser", 1),
            valid.replace("# Structured natural-language view of resolved GUMBO", "# SNL", 1),
        ):
            with self.assertRaises(publish.BuildError):
                publish.publish_snl_document(changed)


class ContextPolicyTest(unittest.TestCase):
    def test_context_policy_selects_prefixes_and_sanitizes_sentences(self) -> None:
        abstract = """# Revised Example System Abstract

## Mission

NEED-01: Retain this operational need. The generation tool produced a draft.

GOAL-01: Preserve this goal.

DESIGN-01: Exclude this implementation paragraph.

## Risks

RISK-01: Loss of the input can prevent service.
"""
        title, context, decisions = publish.publish_context(abstract)

        self.assertEqual("Example", title)
        self.assertIn("NEED-01", context)
        self.assertIn("GOAL-01", context)
        self.assertIn("RISK-01", context)
        self.assertNotIn("DESIGN-01", context)
        self.assertNotIn("generation tool", context)
        self.assertEqual(3, len(decisions))

    def test_context_policy_fails_when_sanitation_empties_selection(self) -> None:
        abstract = """# Example

## Context

CTX-01: The model-review process generated this model.
"""
        with self.assertRaisesRegex(publish.BuildError, "emptied selected paragraph"):
            publish.publish_context(abstract)

    def test_title_cleanup_and_slug_source_words(self) -> None:
        self.assertEqual(
            "Cabin Air Supervisor",
            publish.clean_abstract_title(
                "Approved Revised Cabin Air Supervisor System Abstract"
            ),
        )


class BuildIntegrationTest(unittest.TestCase):
    @classmethod
    def setUpClass(cls) -> None:
        cls.temporary = tempfile.TemporaryDirectory()
        cls.abstract = Path(cls.temporary.name) / "system-abstract.md"
        cls.abstract.write_text(
            "# Greenhouse Ventilation\n\n"
            "## Mission\n\n"
            "NEED-01: Maintain safe greenhouse temperature and humidity.\n",
            encoding="utf-8",
        )
        try:
            from sysml_tools.gumbo import resolve_sireum_toolchain

            cls.toolchain = resolve_sireum_toolchain()
        except FileNotFoundError:
            cls.toolchain = None

    @classmethod
    def tearDownClass(cls) -> None:
        cls.temporary.cleanup()

    def test_greenhouse_build_is_deterministic_and_nonleaking(self) -> None:
        if self.toolchain is None:
            self.skipTest("Sireum parser toolchain is not installed")
        first = publish.build(
            GREENHOUSE_MODEL,
            self.abstract,
            SNL,
            INVENTORY,
            sireum_home=self.toolchain.home,
            verify_projection=False,
        )
        second = publish.build(
            GREENHOUSE_MODEL,
            self.abstract,
            SNL,
            INVENTORY,
            sireum_home=self.toolchain.home,
            verify_projection=False,
        )
        self.assertEqual(first, second)
        visible_n, m_star, manifest = first
        self.assertEqual(5, len(manifest["requirements"]))
        self.assertEqual("passed", manifest["leakage_audit"]["status"])
        for token in (
            "@trace",
            "@generated-support",
            "@gumbo-anchor",
            'language "GUMBO"',
        ):
            self.assertNotIn(token, m_star)
        for token in ("Source: line", "Trace IDs", "SNL_STYLE_VERSION", "GUMBO"):
            self.assertNotIn(token, visible_n)

    def test_output_manifest_verification_detects_mutation(self) -> None:
        if self.toolchain is None:
            self.skipTest("Sireum parser toolchain is not installed")
        visible_n, m_star, manifest = publish.build(
            GREENHOUSE_MODEL,
            self.abstract,
            SNL,
            INVENTORY,
            sireum_home=self.toolchain.home,
            verify_projection=False,
        )
        with tempfile.TemporaryDirectory() as temporary:
            output = Path(temporary)
            publish.write_outputs(output, visible_n, m_star, manifest, force=False)
            publish.verify(output)
            (output / "N.md").write_text(visible_n + "changed\n", encoding="utf-8")
            with self.assertRaisesRegex(publish.BuildError, "does not match"):
                publish.verify(output)

    def test_inventory_mismatch_fails_closed(self) -> None:
        inventory = json.loads(INVENTORY.read_text(encoding="utf-8"))
        inventory["records"] = inventory["records"][:-1]
        with tempfile.TemporaryDirectory() as temporary:
            changed = Path(temporary) / "inventory.json"
            changed.write_text(json.dumps(inventory), encoding="utf-8")
            with self.assertRaises(publish.BuildError):
                publish.load_publication_inventory(changed)


if __name__ == "__main__":
    unittest.main()
