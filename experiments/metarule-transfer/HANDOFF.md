# HPC handoff: Meta-Rule transfer

## Objective

This experiment tests whether cumulative Meta-Rules learned from three SCP
training tasks improve contract reconstruction on 15 held-out tasks. Each
held-out task is run at four checkpoints (`M0`, `M-E`, `M-EM`, and `M-EMH`),
giving 60 held-out cells. The two original SCP Markdown inputs and the DASC SCP
methodology paper are candidate-visible. `M0` removes the upstream learned
Meta-Rule sections; each later checkpoint adds the approved rules learned at
that training stage.

Training, review, distillation, applicability selection, checkpoint sealing,
and held-out candidate generation are finished. The remaining work is
independent evaluator scoring, especially hidden semantic equivalence.

## Portable state

Everything needed from the completed runs is under this directory:

```text
experiments/metarule-transfer/
├── checkpoints/       # sealed M0, M-E, M-EM, and M-EMH plans + evidence
├── runs/              # 3 training and 60 held-out portable workspaces
├── summary/           # pre-scoring inventory (intentionally incomplete)
├── HANDOFF.md
├── manifest.json      # sealed experimental definition
├── runner.py
└── prompt-*.md and sireum_verification_plan.md
```

The archive deliberately omits credentials, Codex homes, temporary files,
sockets, copied Sireum libraries, and other caches. It contains 63 run
directories. All local equivalence attempts were discarded before archival:
all 60 held-out `result.json` files have `score_status: not_run`, and there are
no `evaluation/verification*` directories or scoring ledgers in the handoff.

Generation status is:

- 58 `completed`;
- 2 `timed_out` after the fixed one-hour SCP session budget, although each has
  a candidate artifact:
  `battery-evidence-and-charge-qualification-supervisor--M-EM` and
  `small-drone-battery-charge-qualification-supervisor--M-E`.

The scorer treats those two generation timeouts as terminal timed-out outcomes
and runs the evaluator gates on the other 58 cells. Do not silently relabel or
rerun them; changing that policy is an experimental-design decision.

## Cluster prerequisites

Use a checkout of this repository that includes:

- `external/sysml-aadl-libraries/`;
- the datasets pinned by `manifest.json`;
- the repository `scripts/` and `src/` trees;
- a working Sireum installation discoverable through `SIREUM_HOME` or the
  repository's normal tool resolution.

Scoring does not call OpenAI and does not need the embeddings API key or Codex
credentials. The key is only needed if the final `archive` command is used,
because that command scans outputs for accidental key leakage.

On a fresh checkout, hydrate the portable evidence into the ignored build tree
and validate it:

```bash
python3 experiments/metarule-transfer/runner.py hydrate
python3 experiments/metarule-transfer/runner.py validate
python3 experiments/metarule-transfer/runner.py status
```

`hydrate` is resumable and refuses conflicting files. The expected initial
status is 60 observed, generation `completed=58 timed_out=2`, scoring
`not_run=60`, and verdicts `not_run=60`.

## Run the evaluator

The required hidden-equivalence timeout is one hour per cell:

```bash
python3 experiments/metarule-transfer/runner.py score \
  --equivalence-timeout-seconds 3600 \
  --maximum-parallelism N \
  --memory-reserve-fraction 0.10 \
  --ramp-observation-seconds 120
```

Replace `N` after inspecting the CPU allocation and a calibration worker. The
sealed manifest records the older 300-second default; the explicit 3600-second
override is intentional and is written to `evaluator-policy.jsonl`. The hidden
checker receives `EQUIV_TIMEOUT_SECONDS=3600`; its outer process allowance is
3720 seconds so it can report and clean up after the checker timeout.

The runner starts with one worker, measures its memory high-water estimate,
then ramps toward `N`. It never exceeds CPUs visible in the job's affinity
mask. Memory was the limiting resource on the workstation, but this cluster is
expected to have roughly 760 GB and may instead be CPU-bound: each worker can
launch Java, Sireum, HAMR, and Logika processes and can consume more than one
core. Do not derive `N` from RAM alone. Start with one or two workers, observe
CPU utilization, load, memory, and run time, then choose a cap appropriate for
the scheduler allocation. The flags above are policy controls, not claims
about the cluster. Keep a reserve suitable for the node and other jobs.

For Slurm, request one node and let this runner manage node-local concurrency.
A site-specific script can follow this shape:

```bash
#SBATCH --nodes=1
#SBATCH --cpus-per-task=32
#SBATCH --mem=0
#SBATCH --time=2-00:00:00

export SIREUM_HOME=/path/to/sireum
python3 experiments/metarule-transfer/runner.py hydrate
python3 experiments/metarule-transfer/runner.py score \
  --equivalence-timeout-seconds 3600 \
  --maximum-parallelism 8 \
  --memory-reserve-fraction 0.10 \
  --ramp-observation-seconds 120
```

Treat the resource values as placeholders. In particular, confirm the site's
meaning of `--mem=0`, the actual CPU affinity, Java thread behavior, wall-time
policy, and whether compute-node local scratch is preferable. A single runner
avoids independent array jobs oversubscribing one node or concurrently writing
the shared scheduler ledger.

## Monitoring and recovery

These commands are safe while scoring is active:

```bash
python3 experiments/metarule-transfer/runner.py status
tail -n 30 build/metarule-transfer/score-scheduler.jsonl
tail -n 5 build/metarule-transfer/evaluator-policy.jsonl
```

`status` reports completed scoring and semantic verdict counts, including
`equivalent`, `candidate_weaker`, `candidate_stronger`, `incomparable`,
`inconclusive`, `timed_out`, and infrastructure failures when present. Use the
cluster's normal tools (`sstat`, `seff`, `htop`, or equivalents) to monitor
allocated CPU, resident memory, and task count. Reduce `N` on the next launch
if CPU is saturated inefficiently, Java processes contend, or scheduler limits
are approached.

Results are written atomically. If the job is interrupted, rerun the same
command. Completed cells are skipped; an interrupted cell writes into a new
`verification-attempt-NN` directory, preserving prior evidence. Do not pass
`--rescore-semantic-timeouts` for this clean handoff. That option is only for
retrying an already completed attempt whose recorded semantic timeout was
shorter than the new policy.

## Completion and review

After the scorer exits:

```bash
python3 experiments/metarule-transfer/runner.py status
python3 experiments/metarule-transfer/runner.py summarize
python3 -m unittest discover -s tests/metarule_transfer -v
git diff --check
```

Review `build/metarule-transfer/summary/summary.json` and `README.md`. A clean
completion should have all 60 `score_status` values completed: 58 evaluator
outcomes plus the two terminal generation timeouts. For every scored candidate,
inspect the five proof gates as well as `semantic_status`/`semantic_verdict`;
semantic equivalence alone is not a full SCP pass.

The source-of-truth outputs produced on the cluster are:

```text
build/metarule-transfer/runs/*/result.json
build/metarule-transfer/runs/*/evaluation/verification*/
build/metarule-transfer/score-scheduler.jsonl
build/metarule-transfer/evaluator-policy.jsonl
build/metarule-transfer/summary/
```

Preserve that tree when returning the job. The checked-in `runs/` directory is
the immutable, unscored handoff input; do not delete it or mix partial cluster
outputs into it without an explicit archival review.
