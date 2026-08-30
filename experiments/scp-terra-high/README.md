# Terra-high SCP campaign

This campaign contains 52 Spec-Code-Proof reconstruction runs using
`gpt-5.6-terra` with high reasoning effort. All workspaces initialized and
passed their isolation probes. The retained equivalence sweep reports 2
equivalent candidates and 50 non-equivalent or unsuccessful comparisons.

## Navigate the campaign

- [`summary/`](summary/) contains batch, retry, and equivalence-level results.
- [`protocol/`](protocol/) contains one copy of the repeated campaign launcher,
  sandbox probe, and verification plan.
- [`runs/`](runs/) contains one directory per dataset ID.

A run has this shape:

```text
runs/<dataset-id>/
├── trial.json
├── candidate/
│   ├── M-star.sysml
│   ├── run-config.json
│   └── hamr/                 # complete HAMR output when generated
├── prompts/
├── evaluation/
└── result/
    ├── result.json
    ├── verification.json
    ├── comparison-breakdown.json
    ├── timings.json
    ├── replay.sh
    └── proofs/               # exact submitted VC project when generated
```

The oracle for a current dataset is
`datasets/<dataset-id>/evaluator/oracle.sysml`. Four historical runs instead
carry an `input/` directory: autopilot engagement, dual-zone greenhouse,
flight-guidance/autopilot snapshot coordination, and single-zone greenhouse.

Run a current comparison from the repository root:

```sh
experiments/scp-terra-high/runs/<dataset-id>/result/replay.sh
```

This creates `result.replay` beside the retained `result/`; it does not alter
the archived evidence. Candidate-generation launch metadata is historical and
depends on the original pinned model/runtime environment.

All 52 runs retain HAMR output. Fifty-one runs reached equivalence-proof
generation and therefore contain `result/proofs/`.
