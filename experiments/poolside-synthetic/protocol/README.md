# Poolside protocol

These are the reusable inputs for the Poolside synthetic condition:

- `model-phase-prompt.txt` and `application-phase-prompt.txt` define the two
  agent stages.
- `application-recovery-prompt.txt` records the standard recovery instruction.
- `Gumbo_FSE_agent_Plan.txt` and `sireum_verification_plan.txt` define the
  expected work and gates.
- The YAML/TOML files record the original Poolside policy and its Codex
  permission analogue.
- `unaided-*.txt` contains the neutral continuation protocol.

Dataset-specific repair prompts were intentionally not migrated as reusable
protocol. Completed run outputs and exact evaluation VCs remain under
`../runs/`.
