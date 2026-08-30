# Resolved GUMBO to structured natural language

This is a deterministic, one-way renderer. It sends complete SysML and the AADL
libraries through Sireum `FrontEnd.typeCheck`, walks resolved `GclAnnexClauseInfo`,
`GclAnnexLibInfo`, and Slang AST values, then emits structured English. It does
not parse GUMBO text, introduce a project-owned IR, or use an LLM.

The renderer keeps exact identifiers and formal structure while presenting
common formulas as ordinary English sentences. For example, a state-guarded
compute case is written as “During contract evaluation for the compute phase,
if ..., OWNER shall set ...”; this exposes formal evaluation scope without
presenting it as an externally distinguishable system mode. An event handler
retains “when” for the event context. Assignment-shaped
conjunctions share one active `shall`, matching bounds become inclusive range
phrases, and comparisons use terms such as “exceeds,” “is at least,” and “is at
most.” Complex formulas retain explicit grouping when inlining them would
obscure the resolved Boolean structure.

Semantic findings such as tautology, contradiction, unreachable guards, and
short-circuit evaluation order are emitted as explicit metadata beside the
clause, rather than being disguised as normative prose. The renderer only
introduces assignment verbs when the resolved AST proves the left-hand target;
otherwise it preserves the formula as a constraint.
When one source clause coordinates multiple proven assignments, a quality note
flags the one-thought review question without splitting the clause or changing
its formal identifier.

The emitted `SNL_STYLE_VERSION` field is a compatibility boundary. Downstream
publication requires the expected style version, semantic-authority header,
owner/function/phase/clause envelope, and inventory correspondence.

## Repository layout

- [`SnlRules.scala`](SnlRules.scala) is the renderer and command-line entry point.
- [`GUMBO_GRAMMAR_COVERAGE.tsv`](GUMBO_GRAMMAR_COVERAGE.tsv) records the
  implemented and upstream-limited grammar families.
- [`examples/Greenhouse_Ventilation.sysml`](examples/Greenhouse_Ventilation.sysml)
  is the self-contained greenhouse source model used by the example.
- [`examples/snl.md`](examples/snl.md) is the corresponding golden output.
- [`examples/resolved-publication-inventory.json`](examples/resolved-publication-inventory.json)
  is its mechanically generated publication inventory. Open these three files
  side by side to compare the formal contracts with their rendered prose and
  source mapping.
- [`../../tests/snl_parser`](../../tests/snl_parser) contains the integration
  tests and focused SysML/GUMBO fixtures.

Pinned toolchain:

- Sireum `4.20260630.386eac9f`
- `hamr-sysml-parser` `4.20260626.332fb27`

Run it from the repository root:

```bash
sireum slang run \
  src/snl_parser/SnlRules.scala \
  --model src/snl_parser/examples/Greenhouse_Ventilation.sysml \
  --library external/sysml-aadl-libraries \
  --output build/greenhouse-snl.md \
  --inventory-output build/greenhouse-publication-inventory.json
```

`--model` accepts a `.sysml` file or directory. The library can instead come
from `SYSML_AADL_LIBRARIES`; the repository's `external/sysml-aadl-libraries` is the
default when invoked here.

`--inventory-output` is optional for existing display-only calls and required by
the downstream [`N` publisher](../publisher/README.md). It writes deterministic JSON from the same
resolved `GclAnnexClauseInfo` walk. Before either artifact is written, the
renderer checks that every inventoried invariant, assumption, guarantee, and
case has exactly one corresponding SNL heading and that formal identifiers are
globally unique. Each source coordinate includes a stable `workspace:` URI.
The sidecar records the mechanically checked prose rules and an explicit
`not_assessed` boundary for cross-clause engineering questions. It is evaluator
evidence and is never an agent input.

## Reading numeric literals

The renderer writes a resolved numeric literal as `value [family]`, for example
`-20 [S32]`. This keeps repeated requirements readable without discarding the
numeric semantics retained by Sireum:

| Family | Meaning |
| --- | --- |
| `S8`, `S16`, `S32`, `S64` | signed bit vector of the stated width |
| `U1` through `U64` | unsigned bit vector of the stated width |
| `Z8`, `Z16`, `Z32`, `Z64` | bounded mathematical integer |
| `N`, `N8`, `N16`, `N32`, `N64` | natural number, bounded when a width is present |
| `F32`, `F64` | floating-point value of the stated width |
| `R` | real value |

Untyped mathematical integers remain bare numbers. Strings and characters keep
their quoted literal spelling.

## What is covered

The boundary is: every language family for which we have executable evidence
that the pinned FrontEnd successfully produces a resolved GCL/Slang shape. This
now includes the retained corpus oracles, functions and contracts, handlers,
compositions, casts, range quantifiers, nested Boolean arguments, value
conditionals, resolved port-Option operations, and the pinned numeric literal
families. Unknown resolved nodes fail the whole command before an output file
is written.

[GUMBO_GRAMMAR_COVERAGE.tsv](GUMBO_GRAMMAR_COVERAGE.tsv) is the claim ledger.
It is tab-separated: open it in a spreadsheet, or inspect aligned columns with
`column -ts $'\t' src/snl_parser/GUMBO_GRAMMAR_COVERAGE.tsv`. Its statuses mean:

- `RESOLVED_IMPLEMENTED`: pinned FrontEnd success plus an executable renderer fixture.
- `FRONTEND_REJECTED`: the pinned front end reports a source error.
- `FRONTEND_RESOLUTION_GAP`: accepted syntax is lost, conflated, or crashes before a usable resolved node reaches this renderer.
- `DEFENSIVE_ONLY`: an explicit rule or fail-closed boundary exists, but the shape is not proven reachable from accepted pinned GUMBO.
- `UNREACHABLE_GRAMMAR`: a grammar production has no path from the pinned GUMBO entry rules.

Important upstream limits are not hidden: outgoing-port `modifies` targets are
dropped for initialize, compute, and handlers; `infoflow` currently crashes the
pinned SysML AST visitor before resolution; one-argument `HasEvent` and
`MustSend` both resolve to `Option.nonEmpty`; and composition inheritance keeps
the effective conjoined formula but loses later contributors' source metadata.
No source-text workaround is used for any of these.

Because the resolved tree cannot distinguish one-argument `HasEvent` from
`MustSend`, the renderer deliberately states only the retained presence
semantics: “a value or event is present on port …,” “no value or event is
present on port …,” or “the value present on port ….” It does not infer the
lost authored modality.

`@trace` remains metadata only. For a resolved node position, the renderer scans
the immediately preceding contiguous `//` block and records tokens after an
exact `@trace` marker. It does not reparse the annex.

## Requirements-language audit boundary

The renderer reports only findings proven by one resolved AST: literal and
Boolean self-comparison statuses, false-guard reachability, short-circuit
semantics, and coordinated assignment count. It also rejects generated
publication prose that lacks terminal punctuation, contains other than one
normative `shall`, uses a competing normative modal, contains `and/or`, uses an
indefinite demonstrative, or contains a NASA-listed unverifiable modifier. It
does not claim general
cross-clause satisfiability, overlap, conflict, coverage, missing-output, unit,
tolerance, or latency analysis. Those checks require an adjacent solver-backed
quality audit and/or authored engineering metadata. The inventory's
`quality_audit.engineering_review` object names these open checks rather than
inventing results or presenting guesses as requirements.

Run the executable fail-closed audit and tests with:

```bash
sireum slang run \
  src/snl_parser/SnlRules.scala --audit-fail-closed
python3 -m unittest discover -s tests/snl_parser -v
```

The audit intentionally exits nonzero after proving an unknown Slang AST node
is rejected.
