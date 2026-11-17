# SysML/GUMBO equivalence checker

This package compares the resolved model and supported GUMBO semantics of an
oracle SysML file and a candidate SysML file. It reports whether the candidate
is equivalent, stronger, weaker, incomparable, invalid, or inconclusive.

## Directory map

```text
src/equiv_checker/
├── README.md
├── __main__.py              package entry point
├── cli.py                   command-line and result publication
├── backend.py               end-to-end comparison orchestration
├── model_gate.py            contract-erased resolved-model comparison
├── inventory.py             resolved contract/type/instance inventory
├── codegen.py               native GumboX export and replay-project assembly
├── gumbox.py                generated Slang/GumboX structural inspection
├── type_alignment.py        shared type-carrier validation and construction
├── slang_proof.py           refinement and health VC generation
├── proof.py                 isolated Logika execution and attestation
├── reporting.py             verdict and health aggregation
├── schema.py                shared result and plan types
├── evidence.py              write-once temporary evidence bundles
├── compact.py               portable retained-result construction
├── timing.py                stage and VC timing records
├── docs/
│   └── proof-obligations.md   comparison and health VC definitions
├── adapters/
│   ├── GumboInventory.scala
│   ├── GumboSemanticExport.scala
│   └── LogikaWorker.scala
└── isabelle/
    ├── ROOT                 Isabelle session definition
    └── Refinement.thy       formal refinement-policy specification
```

The checker also uses [`../sysml_tools/`](../sysml_tools/README.md) for
Sireum-certified GUMBO span discovery. Tests live in
[`../../tests/equiv_checker/`](../../tests/equiv_checker/).

## Comparison pipeline

```text
two contract-bearing SysML files
  -> Sireum parses and type-checks both
  -> compare contract-erased resolved models
  -> inventory contract-bearing owner/phase units
  -> lower each side through native GumboX generation
  -> align generated type shapes in a shared carrier namespace
  -> generate bidirectional refinement and independent health VCs
  -> run each submitted VC through an isolated Logika request
  -> publish a compact, hash-checked, portable result
```

Contracts are paired by resolved model instance and semantic phase, not clause
name. Supported units are datatype invariants, initialization contracts, and
component compute contracts. Unsupported syntax or incomplete semantic
coverage fails closed instead of producing a false comparison verdict.

For oracle `(A*, G*)` and candidate `(A, G)`, candidate refinement requires:

```text
A*      -> A
A* & G  -> G*
```

The reverse obligations exchange oracle and candidate. Both directions yield
`EQUIVALENT`; one yields `CANDIDATE_STRONGER` or `CANDIDATE_WEAKER`; neither
yields `INCOMPARABLE`. The generic rule and its relationship to saturated
contract refinement are recorded in
[`isabelle/Refinement.thy`](isabelle/Refinement.thy). The eight generated
comparison and health obligations are described in
[`docs/proof-obligations.md`](docs/proof-obligations.md).

Health checks separately assess assumption satisfiability and pointwise
guarantee realizability. Health never silently changes the comparison verdict.
A failed validity VC is classified as a semantic counterexample only after its
SAT complement is also verified.

## Proof-worker performance and memory

Proofs run one source at a time with exact-source attestation. The native worker
uses fresh reporters and fresh SMT/transition caches for each request; only
parsed-input and type-hierarchy caches are reused. Multi-source proof batching
is intentionally disabled because retained regressions exposed false batch
successes.

Pure-function derivation uses merged conditional states (`dontSplitPfq = T`)
rather than forced path splitting. This retains both branches and the same
refinement/health obligations, while avoiding the combinatorial exploration
caused by long short-circuit Boolean contracts. Six formerly timed-out
self-refinement VCs verified unchanged in native testing; separate controls
rejected a false implication and verified its SAT complement. Native
under-approximation warnings fail closed, including a run with a success token.

The generalized backend recycles a worker after at most eight requests or on a
project change. It also recycles early between requests when available RAM falls
within ten percentage points of its 25% hard floor. The hard floor still stops
an active request, reporting an unresolved/tool outcome rather than a proof.
This bounds cache lifetime while avoiding a full JVM/Scala/project reload for
every obligation. Process groups are removed during recycling as before.

Each comparison now writes `progress.jsonl` in its output directory as timing
events complete, including worker starts and individual proof outcomes. This
unsealed diagnostic survives a whole-comparison timeout; final `result.json`
and verification evidence remain the authority for semantic verdicts.

## Requirements

Run commands from the repository root. The checker expects:

- Python 3.10 or newer;
- Sireum/HAMR available as `sireum` on `PATH`, or through `SIREUM_HOME`;
- the initialized `external/sysml-aadl-libraries` submodule.

Initialize dependencies if needed:

```bash
git submodule update --init --recursive
```

## Run a comparison

```bash
PYTHONPATH=src python3 -m equiv_checker compare \
  --oracle datasets/DATASET/evaluator/oracle.sysml \
  --candidate candidate.sysml \
  --output-dir build/equiv-results \
  --timeout 300
```

Use `--defer-health` to run only the four comparison obligations. The process
exits `0` for `EQUIVALENT`, `1` for a definitive non-equivalent relationship,
`2` for `INCONCLUSIVE` or `INVALID_INPUT`, and `3` for a checker/tool error.

For a named benchmark dataset, [`../../scripts/evaluate.sh`](../../scripts/evaluate.sh)
provides the shorter interface:

```bash
scripts/evaluate.sh DATASET_NAME candidate.sysml
```

## Retained result

The output directory is new or empty and contains:

| Path | Purpose |
|---|---|
| `result.json` | Overall comparison, health, affected units, and portable invocation |
| `comparison-breakdown.json` | Paired units, clauses, observations, and types |
| `verification.json` | Semantic-export and per-VC outcomes |
| `proofs/` | Submitted Slang proof sources and minimal replay project files |
| `timings.json` | Whole-run, stage, and per-VC timings |
| `inputs/` | Hash-identical oracle and candidate copies used by the comparison |
| `replay.sh` | Replays from the retained inputs without embedding a checkout path |
| `errors.log` | Tool diagnostics, present only for errors or timeouts |

The full source snapshot and intermediate generated projects are checked in a
temporary sealed bundle during execution but are not copied into the compact
result. Retained files use relative paths and do not record the local checkout,
username, or a sibling tool installation.

## Tests

```bash
PYTHONPATH=src python3 -m unittest discover -s tests/equiv_checker -v
```

The suite covers model gating, inventory pairing, native export validation,
GumboX cataloging, type alignment, proof generation and interpretation,
reporting, CLI behavior, compact evidence, and the pinned Sireum inventory
adapter. Four minimized Logika symbolic-branch failures from the campaign are
retained separately in
[`../../tests/regressions/logika-symbolic-branches/`](../../tests/regressions/logika-symbolic-branches/README.md).

Build the standalone refinement theory with:

```bash
isabelle build -D src/equiv_checker/isabelle
```
