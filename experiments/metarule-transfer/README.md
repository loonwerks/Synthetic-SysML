# Meta-Rule transfer experiment

This experiment tests whether cumulative English-to-GUMBO Meta-Rules learned
from HVAC replicate 1 improve held-out HVAC replicate 2 and drone contract
reconstruction tasks.

The experiment definition is intentionally flat. `manifest.json` defines the
split, fixed model/settings, checkpoint lineage, and run matrix. `runner.py`
owns deterministic setup, planning, credential-safe embedding calls, isolated
runs, scoring, summaries, and archival. Active work belongs under the ignored
`build/metarule-transfer/` tree; reviewed evidence is archived here only by an
explicit command.

The two candidate-visible SCP documents derive from the original upstream
demo artifacts:

- `Gumbo_FSE_agent_Plan.txt`, transformed into a checkpoint-specific Markdown
  plan whose original learned sections 3 and 4 are replaced by one delimited
  cumulative learned-rule region;
- `sireum_verification_plan.txt`, adapted only from obsolete Isolette commands
  to the repository's generic validation scripts.

Every candidate also receives the pinned DASC SCP methodology paper as
`SCP_Methodology_Paper.pdf`. This is the ten-page paper titled *Bridging
Natural Language to Verified Implementation: A Neuro-Symbolic High-Assurance
MBSE Pipeline in SysML v2*, not the enterprise SCP extension whitepaper. The
paper is the authority for Meta-Rule extraction and rule-book content.

Learned rules use only a minimal machine envelope: a unique level-three
`MR-...` heading and nonempty Markdown content. The experiment deliberately
does not impose an `Applicability`/`Instruction`/`Constraints`/`Evidence`
schema. The training agent instead derives the record form from the paper's
Meta-Rule definition, toy example, and `ExtractRule` template. Applicability
screening embeds the complete retained rule record.

Initialize and inspect the experiment without launching a model:

```bash
python3 experiments/metarule-transfer/runner.py init
python3 experiments/metarule-transfer/runner.py plan
```

No training or held-out run is launched by `init`, `plan`, or unit tests.

The lifecycle is explicit and resumable:

```bash
python3 experiments/metarule-transfer/runner.py preflight \
  --embedding-key-file /run/user/1000/scp-embedding.key

# Repeat for M-E, M-EM, then M-EMH. Review every reported proposal before
# freezing that checkpoint and beginning the next stage.
python3 experiments/metarule-transfer/runner.py train M-E \
  --embedding-key-file /run/user/1000/scp-embedding.key
# Optional: simplify a proposal before review. The rule IDs/order must stay
# fixed and every original-to-distilled rule distance must be <= epsilon.
python3 experiments/metarule-transfer/runner.py distill M-E P0001 \
  --rules-file build/metarule-transfer/refinements/M-E-P0001-distilled.md \
  --embedding-key-file /run/user/1000/scp-embedding.key
python3 experiments/metarule-transfer/runner.py review M-E P0002 \
  --decision approve --reviewer NAME
python3 experiments/metarule-transfer/runner.py seal --checkpoint M-E

# After all three training checkpoints are frozen, precompute all 60 fixed
# applicability selections and seal the experimental manifest.
python3 experiments/metarule-transfer/runner.py seal \
  --embedding-key-file /run/user/1000/scp-embedding.key

python3 experiments/metarule-transfer/runner.py run
python3 experiments/metarule-transfer/runner.py score
python3 experiments/metarule-transfer/runner.py summarize
python3 experiments/metarule-transfer/runner.py archive \
  --embedding-key-file /run/user/1000/scp-embedding.key
```

For the portable HPC scoring handoff, including hydration, the required
one-hour equivalence timeout, resource controls, and recovery instructions, see
[`HANDOFF.md`](HANDOFF.md).

If a stage reports no proposals, omit `review` and seal the checkpoint; its
bytes remain identical to its parent. Reviews are write-once and can approve or
reject but cannot edit a proposal. The training command records the blind phase
before opening the stage oracle and resumes the same Codex session within one
shared one-hour active budget. Distillation preserves the source proposal,
stores both embedding vectors per rule, and makes only the passing successor
active for review.

Active files live under ignored `build/metarule-transfer/`. The final archive
creates the otherwise-absent `runs/` and `summary/` directories here. It omits
authentication, run-local Codex homes, caches, temporary files, sockets, and
copied tool installations.

Held-out execution begins at one worker after the three serial training stages.
The scheduler samples Linux `MemAvailable`, observes actual Logika peaks, and
ramps upward one worker at a time only while one additional observed peak still
leaves at least 10% of total RAM available. It records samples and launch/ramp
decisions; it never kills an in-flight run merely to satisfy the reserve. The
first held-out run completes serially to establish a conservative peak before
parallelism can increase, and concurrent peak headroom is reserved for every
active worker. An uncalibrated run is not launched below 25% available RAM.
Checkpoint order is deterministically counterbalanced across tasks so no one
condition is systematically early or late. Parallelism is capped at eight even
when memory permits more.
