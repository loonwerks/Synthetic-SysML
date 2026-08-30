# Repository scripts

- [`evaluate.sh`](evaluate.sh) evaluates a candidate against one named dataset.
- [`../src/publisher/corpus.py`](../src/publisher/corpus.py) rebuilds the
  canonical 48-dataset corpus consumed by `evaluate.sh`.
- [`analysis/aadl_coverage.py`](analysis/aadl_coverage.py) computes resolved
  AADL-in-SysML coverage for CPS-48.
- [`analysis/aadl_coverage_plots.py`](analysis/aadl_coverage_plots.py) renders
  the coverage report as dependency-free SVG plots.
- [`analysis/GumboInventory.scala`](analysis/GumboInventory.scala) extracts the
  resolved Sireum AIR consumed by the coverage analysis.
- `prepare_executable_candidate.sh`, `prepare_poolside_application.sh`,
  `run_poolside_confined.sh`, `stage_executable_model.py`, and `run-logika.sh`
  implement the executable-candidate validation workflow described below.

Run every command from the repository root. Repository inputs are addressed by
relative paths; tool executables are discovered through `PATH` or explicit
environment variables.

## Dataset evaluation

```bash
scripts/evaluate.sh DATASET_NAME CANDIDATE.sysml
```

The default corpus root is [`datasets/`](../datasets/README.md). Set
`DATASET_ROOT` only when evaluating an alternate corpus.
Byte-identical candidates pass immediately; other candidates are passed to the
generalized checker documented in
[`src/equiv_checker/`](../src/equiv_checker/README.md).

## CPS-48 coverage analysis

```bash
PYTHONPATH=src python3 scripts/analysis/aadl_coverage.py \
  --output-dir build/aadl-coverage

python3 scripts/analysis/aadl_coverage_plots.py \
  build/aadl-coverage/coverage.json \
  --output-dir build/aadl-coverage/plots
```

## Executable candidate validation

These scripts add an executable acceptance phase without reading an evaluator
directory or changing a candidate model.  The original `agent/M-star.sysml`
first has to pass `sireum hamr sysml logika` with the repository's
`external/sysml-aadl-libraries` (exit status 0, with no reported compilation or
resolution error). Some Sireum builds emit only warnings on a successful run,
so the harness does not require a particular success banner. A staged copy then receives non-normative periodic
dispatch attributes on every Thread and is used for JVM/runtime-monitoring
code generation.  That projection also removes GUMBO `initialize` sections:
HAMR initialization APIs have no input members, so otherwise valid model-level
initialization requirements that mention inputs generate uncompilable Slang.
The untouched original-model gate remains authoritative for those clauses;
the executable application gate exercises the preserved compute contracts.

From the repository root, prepare a fresh work directory:

```bash
scripts/prepare_executable_candidate.sh \
  experiments/my-run/agent/M-star.sysml \
  experiments/my-run/executable
```

The command stops at the application phase boundary and prints
`APPLICATION_ROOT`.  Poolside may implement only the generated `.scala` files
under that directory; it must not edit the staged model or any generated
bridge/API/data/runtime/project file.  The scaffold makes those files
read-only, hashes the complete protected work surface, and records the exact
generated component allowlist.  The mutable `hamr/slang/out` cache and proof
output are excluded so failed proof attempts can be repaired and rerun.
Generated `initialise` bodies must use state and output setters only; HAMR does
not make input getters available until the operational `timeTriggered` phase.

After the application phase, run the printed `NEXT` command (equivalently):

```bash
experiments/my-run/executable/run-logika.sh \
  experiments/my-run/executable/hamr/slang \
  experiments/my-run/executable/proof
```

`run-logika.sh` fails if a protected generated file changed, the component set
changed, any component lacks exactly one `initialise` or `timeTriggered`, or
any individual `sireum proyek logika` proof fails.  These two gates establish
candidate integration and self-consistency with its application code; they do
not establish equivalence to an oracle.
