# Poolside synthetic campaign

This directory contains the 52-run Poolside synthetic model and application
campaign. The retained equivalence sweep reports 6 equivalent candidates and
46 non-equivalent or unsuccessful comparisons.

## Navigate the campaign

- [`summary/`](summary/) contains campaign metrics and equivalence results.
- [`protocol/`](protocol/) contains the reusable model/application prompts,
  sandbox settings, verification plan, and continuation protocol.
- [`runs/`](runs/) contains one directory per dataset ID.

A completed application run has this shape:

```text
runs/<dataset-id>/
├── agent/M-star.sysml
├── application/
│   ├── staged/M-star.executable.sysml
│   ├── hamr/                 # complete HAMR-generated Slang project
│   ├── evidence/
│   ├── proof/
│   └── integrity manifests
└── result/
    ├── result.json
    ├── verification.json
    ├── comparison-breakdown.json
    ├── timings.json
    ├── replay.sh
    └── proofs/               # exact equivalence VCs when generated
```

Some unsuccessful runs never reached application generation, so their
`application/` directory is absent. Four historical datasets carry local
`input/` files because they are not part of the current 48-dataset corpus.

Replay an equivalence comparison from the repository root:

```sh
experiments/poolside-synthetic/runs/<dataset-id>/result/replay.sh
```

The command writes a new sibling `.replay` directory and leaves retained
evidence unchanged. Plotting artifacts are intentionally deferred to the
separate plots migration.

Forty-eight runs reached HAMR application generation and 46 reached
equivalence-proof generation; incomplete runs legitimately omit those trees.
