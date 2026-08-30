# CPS-48 corpus-derived campaign

```text
cps48/
├── README.md
├── COMPLETION.md
├── manifest.json
├── seeds/
├── diversity-cards/
└── runs/                 48 canonical accepted run directories
```

This manifest preregisters eight source families, three calibrated complexity
tiers, and two accepted replicates per family/tier: 48 accepted examples.
The migrated evidence tree retains exactly one accepted run for each cell.

Each family uses one Seed role to publish a reviewed, hash-pinned,
complexity-neutral seed. Every tier and replicate for that family reuses the
same seed bytes. Each synthesis run then uses Designer, Model, and Visualization
roles; the Designer is invoked at multiple adjudication points but remains one
logical role.

Generation is quality-gated, not cost-gated. Agent wall-clock watchdogs are
disabled in the manifest. An explicitly configured watchdog, a mechanical-tool
watchdog, or a repeated no-progress diagnostic produces a nonterminal,
resumable `incomplete` state. The campaign runner resumes the same run until it
finishes or repeats an unchanged checkpoint. Reusable seeds are validated and
costed once before campaign execution. Wire-equivalent analyzer and traceability status fields
are normalized mechanically and recorded. Every invocation, including
checkpointed and repair invocations, remains in aggregate token and elapsed-time
accounting.

Semantic contradictions, ownership padding, and out-of-tier results checkpoint
the same candidate for the responsible role rather than terminally rejecting
it. Visualization defects produce `awaiting-visualization`. Automatic retries
continue while substantive artifacts change and stop only at an unchanged
diagnostic plus unchanged candidate fingerprint; an operator decides whether a
no-progress checkpoint should be archived.

Preview the first batch:

```bash
python3 src/synthesizer/campaign.py \
  --manifest cps48/manifest.json \
  --batch batch-00-drone-review \
  --output build/cps48-batch-00
```

Add `--execute` to launch the three isolated runs. New run directories default
to `cps48/runs`; keep batch summaries outside the tracked tree
unless preparing a new release. Do not launch later batches
until the first review batch has been approved.
