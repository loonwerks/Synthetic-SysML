# SysML Synthesizer

This directory contains the active three-agent SysML/GUMBO generator. The
frozen CPS-48 inputs, campaign definition, and 48 canonical accepted runs live
at the repository root in [`cps48/`](../../cps48/README.md).

## Directory map

```text
src/synthesizer/
├── README.md                 this guide
├── __init__.py               Python package marker
├── run.py                    one-run orchestration CLI
├── campaign.py               CPS-48 batch orchestration CLI
├── prompts/                  stage-specific agent prompts
└── guidelines/               operating contracts consumed by the prompts
```

- [`run.py`](run.py) runs one seed through
  the sequential Designer, Model, and Visualization workflow. It also owns
  resume/checkpoint behavior, repair routing, mechanical acceptance gates,
  evidence capture, and accepted-run compaction.
- [`campaign.py`](campaign.py) expands one
  CPS-48 manifest batch into run cells, launches cells concurrently when
  requested, resumes progressing checkpoints, and writes batch summaries.
- [`../../cps48/seeds/`](../../cps48/seeds/README.md) contains the eight reviewed,
  complexity-neutral domain inputs. `cps48/seeds/sources/` contains the
  corresponding pinned source briefs used to construct them.
- [`../../cps48/manifest.json`](../../cps48/manifest.json) defines the eight families,
  three complexity tiers, two replicates, model settings, seed hashes,
  diversity cards, ports, and batches. See [`cps48/README.md`](../../cps48/README.md)
  for campaign-specific commands and [`cps48/COMPLETION.md`](../../cps48/COMPLETION.md)
  for the completed benchmark record.
- [`../../cps48/runs/`](../../cps48/runs/) is immutable evidence from the canonical 48 accepted cells.
  It is reference material, not scratch space to edit by hand.
- [`guidelines/`](guidelines/) contains the normative instructions injected
  into the agent prompts.
- [`../../scripts/analysis/aadl_coverage.py`](../../scripts/analysis/aadl_coverage.py)
  and
  [`../../scripts/analysis/aadl_coverage_plots.py`](../../scripts/analysis/aadl_coverage_plots.py)
  analyze AADL-library usage after generation; they are not part of the
  generator loop. [`GumboInventory.scala`](../../scripts/analysis/GumboInventory.scala) is their local
  Sireum AIR adapter.

## How the three-agent loop works

One synthesis run has six principal stages:

1. `designer-initial`: Designer chooses a bounded system purpose, architecture,
   responsibilities, interactions, and policy from the reusable seed.
2. `model-review`: Model checks whether that design can be represented and
   verified before source generation.
3. `designer-resolution`: Designer resolves the review and freezes the system
   abstract used for generation.
4. `model-generate`: Model writes the SysML/GUMBO source, traceability,
   metrics, and a deterministic bounded analyzer.
5. `visualize`: Visualization creates and reviews the `system-overview`
   diagram using `sysml-viz`.
6. `designer-final`: Designer compares the source and retained evidence with
   the approved abstract and accepts the result or assigns a repair owner.

The roles are stateless between invocations. Coordination happens through
files retained in the run directory. Negative findings normally checkpoint the
same run for a targeted repair instead of discarding the candidate. The harness
independently reruns type checking and bounded analysis, validates complexity,
traceability, and visualization evidence, and compacts accepted runs to their
durable evidence set.

## Prompt inventory

All active orchestration prompts live in [`prompts/`](prompts/):

- `designer-initial.md`: selects the initial system boundary and architecture.
- `model-review.md`: checks pre-generation realizability.
- `designer-resolution.md`: resolves Model concerns and freezes the design.
- `model-generate.md`: creates the canonical SysML/GUMBO model and evidence.
- `model-repair.md`: performs a localized source/evidence repair.
- `visualize.md`: creates and validates the reviewed overview diagram.
- `visualize-repair.md`: repairs a presentation or traceability defect.
- `designer-final.md`: performs final semantic acceptance.
- `seed-generate.md`: creates a reusable domain seed from a pinned source
  brief; this is a separate preparation job, not one of the six synthesis
  stages.

The prompt variables point to the five files in `guidelines/`. Change a prompt
when adjusting one stage's immediate task; change a guideline when adjusting a
role-wide or workflow-wide contract.

## Requirements

Run commands from the repository root. The harness expects:

- Python 3.10 or newer;
- an installed and authenticated `codex` CLI;
- Node.js for each retained `validation/bounded-analysis.mjs`;
- Sireum/HAMR with `hamr sysml tipe` available;
- built `sysml-viz` packages;
- initialized `external/sysml-aadl-libraries`, `external/sysml-v2-models`, and
  `external/inspecta-scp` repository dependencies.

The canonical runs and coverage analysis pin `external/sysml-aadl-libraries` at
`9016cbcceefa92f0068e1811923704dd261d15f1`; the repository submodule must stay
at that revision for reproducible checks.

Initialize repository dependencies and build the visualizer before the first
experiment:

```bash
git submodule update --init --recursive
npm --prefix sysml-viz ci
npm --prefix sysml-viz run build
```

By default the harness finds `codex`, `node`, and `sireum` on `PATH`. Set
`SIREUM_BIN` when Sireum is installed under a different command name:

```bash
export SIREUM_BIN=sireum
```

Check both command-line interfaces without starting an experiment:

```bash
PYTHONPATH=src python3 src/synthesizer/run.py --help
PYTHONPATH=src python3 src/synthesizer/campaign.py --help
```

## Run one synthesis experiment

Choose one file directly under `cps48/seeds/` and give the run a short label:

```bash
PYTHONPATH=src python3 src/synthesizer/run.py \
  --seed cps48/seeds/drone-logical-domain-v1.md \
  --label drone-governor-ad-hoc \
  --complexity medium
```

The runner prints the newly created directory under `cps48/runs/`.
During a run, inspect `status.json` first. After acceptance, the durable files
include:

- `seed.md`, `system-abstract.md`, and `design-selection.md`;
- the canonical `model/*.sysml` source;
- `metrics.json`, `provenance.json`, and `verification-report.json`;
- `validation/bounded-analysis.mjs` and `contract-coverage.json`;
- `visualization/system-overview.svg` and its JSON sidecar;
- `model/.sysmlviz/views.json`;
- `agent-token-usage.json`, `run-config.json`, and `status.json`.

An interrupted or repairable run remains nonterminal. Resume that same
directory using the model and reasoning effort recorded in its
`run-config.json`:

```bash
PYTHONPATH=src python3 src/synthesizer/run.py \
  --resume-run cps48/runs/TIMESTAMP-LABEL \
  --model gpt-5.6-sol \
  --reasoning-effort high
```

Use `--run-parent` to place new experimental output outside the retained
benchmark, for example `--run-parent build/sysml-synth-runs`.

## Generate or refresh a reusable seed

Seed preparation reads one brief under `cps48/seeds/sources/`, runs only the
Seed role, validates the result, and publishes the frozen Markdown destination
you name:

```bash
PYTHONPATH=src python3 src/synthesizer/run.py \
  --seed-source cps48/seeds/sources/drone-governor-v1.md \
  --publish-seed cps48/seeds/drone-logical-domain-v2.md \
  --label drone-seed-v2
```

The preparation journal defaults to `cps48/runs/seed-generations/`.
Publishing a replacement campaign seed also requires reviewing it, updating
the manifest path/hash deliberately, and rerunning the campaign checks.

## Preview or run CPS-48

The manifest is divided into batches. Previewing expands and validates a batch
without launching Codex agents:

```bash
PYTHONPATH=src python3 src/synthesizer/campaign.py \
  --manifest cps48/manifest.json \
  --batch batch-00-drone-review \
  --output build/cps48-batch-00
```

Add `--execute` to launch the cells. `--only` accepts a comma-separated set of
cell IDs for a smaller restart, and `--attempt` overrides the manifest attempt
number. Keep batch summaries outside the tracked canonical evidence unless a
new campaign release is intentionally being prepared.

The current checked-in benchmark is already complete. Do not rerun or modify
the 48 retained directories merely to inspect them.

## Important runner arguments

`run.py` accepts one mutually exclusive source mode:

- `--seed PATH`: start synthesis from a frozen domain seed.
- `--seed-source PATH`: start reusable-seed preparation; requires
  `--publish-seed`.
- `--resume-run DIRECTORY`: continue a nonterminal run.

Experiment identity and layout options are `--label`, `--campaign-id`,
`--family-id`, `--complexity {small,medium,hard}`, `--replicate`, `--attempt`,
`--diversity-card`, and `--run-parent`.

Runtime options are `--model`, `--reasoning-effort`, `--codex-bin`,
`--sireum-bin`, `--node-bin`, `--sysml-viz-port`, `--timeout` for an optional
per-agent watchdog, and `--tool-timeout` for mechanical checks. The authoritative
defaults and complete help text are always available through `run.py --help`.

## Analyze AADL coverage

Coverage analysis defaults to the flattened manifest and canonical run paths:

```bash
PYTHONPATH=src python3 scripts/analysis/aadl_coverage.py \
  --output-dir build/aadl-coverage

PYTHONPATH=src python3 scripts/analysis/aadl_coverage_plots.py \
  build/aadl-coverage/coverage.json \
  --output-dir build/aadl-coverage/plots
```

These scripts are post-hoc reporting tools. They do not generate or alter
SysML models.

## Tests

Run the migrated Python test suites from the repository root:

```bash
PYTHONPATH=src python3 -m unittest discover -s tests/synthesizer -v
PYTHONPATH=src python3 -m unittest discover -s tests/scripts/analysis -v
```

The campaign test verifies that `cps48/manifest.json` still expands to exactly
48 cells and that every referenced seed matches its pinned hash.
