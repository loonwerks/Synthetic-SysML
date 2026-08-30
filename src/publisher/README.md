# Deterministic benchmark publisher

The publisher turns a contract-bearing SysML model and its System Abstract into
the two inputs used by a contract-reconstruction benchmark:

- `M-star.sysml`, the original model with parser-certified GUMBO regions and
  publication-only trace comments removed; and
- `N.md`, selected system context followed by deterministic structured English
  for every supported, inventory-backed contract definition and clause.

It does not paraphrase requirements with an LLM or introduce semantic
variation. Sireum's resolved GUMBO representation and the versioned SNL format
remain the semantic authority.

## Directory map

```text
src/publisher/
├── README.md
├── __init__.py
├── publish.py       single-model publication and verification
└── corpus.py        all-or-nothing CPS-48 corpus construction
```

Tests live in [`../../tests/publisher/`](../../tests/publisher/). The publisher
consumes SNL produced by [`../snl_parser/`](../snl_parser/README.md), uses shared
GUMBO utilities from [`../sysml_tools/`](../sysml_tools/README.md), and invokes
the model gate in [`../equiv_checker/`](../equiv_checker/README.md).

## Publication boundary

The System Abstract contributes paragraphs beginning with `NEED-`, `PURPOSE-`,
`GOAL-`, `CTX-`, `MON-`, `CTRL-`, `RISK-`, `HAZARD-`, `MODE-`, or `ASM-`.
Sentences about generation tools, seeds, visualization, token use, validation,
or review are removed. An emptied selected paragraph or remaining process
provenance fails the build.

Resolved SNL contributes state declarations, concrete functions, invariants,
assumptions, guarantees, and cases. Every published clause must correspond in
exact order to the renderer's resolved inventory. Unknown metadata, duplicate
identities, unsupported formal structures, incomplete inventory coverage, and
input/output accounting differences fail closed.

Before publication succeeds, `N.md` is checked for source coordinates, trace
metadata, GUMBO syntax, parser metadata, and generation provenance. The
contract-free model is checked against the oracle's resolved AIR when
single-model projection verification is enabled.

## Requirements

Run commands from the repository root with:

- Python 3.10 or newer;
- Sireum available as `sireum` on `PATH`, or through `SIREUM_HOME`; and
- the initialized `external/sysml-aadl-libraries` submodule.

## Publish one model

First render SNL and its resolved publication inventory:

```bash
sireum slang run src/snl_parser/SnlRules.scala \
  --model cps48/runs/RUN_ID/model/MODEL.sysml \
  --library external/sysml-aadl-libraries \
  --output build/publication/snl.md \
  --inventory-output build/publication/inventory.json
```

Then publish and verify the model:

```bash
PYTHONPATH=src python3 -m publisher.publish build \
  --model cps48/runs/RUN_ID/model/MODEL.sysml \
  --abstract cps48/runs/RUN_ID/system-abstract.md \
  --snl build/publication/snl.md \
  --inventory build/publication/inventory.json \
  --output-dir build/publication/result

PYTHONPATH=src python3 -m publisher.publish verify \
  build/publication/result
```

The development result contains `N.md`, `M-star.sysml`, and an internal
hash-bound `manifest.json`. Dataset payloads intentionally omit the manifest.

## Rebuild the corpus

[`corpus.py`](corpus.py) discovers the 48 canonical runs in `cps48/runs` whose
status declares `dataset_ready: true`. It renders SNL in parallel, publishes
each model, applies corpus-wide layout and resolved-AIR gates, checks that an
agent-only staging area exposes no oracle, and smoke-tests every oracle with
the canonical [`scripts/evaluate.sh`](../../scripts/evaluate.sh).

The output directory must not already exist:

```bash
PYTHONPATH=src python3 -m publisher.corpus \
  --output-dir build/datasets-stage \
  --workers 4
```

Each generated dataset contains exactly:

```text
DATASET_NAME/
├── agent/
│   ├── M-star.sysml
│   └── N.md
└── evaluator/
    └── oracle.sysml
```

The four earlier legacy datasets are outside the canonical CPS campaign and
are intentionally not copied or regenerated. Running the corpus publisher does
not rerun model-synthesis or LLM experiments.

## Tests

```bash
PYTHONPATH=src python3 -m unittest discover -s tests/publisher -v
```

The suite covers context selection, SNL parsing, functions and state,
clause/inventory correspondence, leakage prevention, deterministic output,
manifest verification, CPS-48 discovery, semantic naming, and canonical
evaluator integration.
