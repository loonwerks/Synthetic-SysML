# Terra-high campaign protocol

This directory centralizes files that were identical across the 52 original
evaluator workspaces:

- `run-codex.py` is the historical pinned-Codex launcher.
- `sandbox-probe.py` performs the adversarial isolation probe.
- `Gumbo_FSE_agent_Plan.txt` is the candidate work plan.
- `sireum_verification_plan.txt` is the model verification plan.

The launcher now selects its migrated run through `SCP_RUN_ID`:

```sh
SCP_RUN_ID=<dataset-id> \
  python3 experiments/scp-terra-high/protocol/run-codex.py --help
```

Reproducing candidate generation still requires the recorded Codex version,
model access, Sireum installation, and sandbox environment. The supported
repository-local operation is result replay through each run's
`result/replay.sh`.
