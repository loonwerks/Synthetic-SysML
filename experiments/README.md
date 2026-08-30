# Experiments

This directory contains the three experiment families retained from the
development repository. Older exploratory model comparisons and the earlier
greenhouse, HVAC, Isolette, and generic SCP harnesses were intentionally left
behind.

## Start here

| Experiment family | Scope | Runs | Primary entry point |
| --- | --- | ---: | --- |
| Rust/Verus | SysML-to-HAMR-to-Rust/Verus case studies | 5 | [`rust-verus/`](rust-verus/README.md) |
| Terra high | `gpt-5.6-terra`, high-reasoning SCP campaign | 52 | [`scp-terra-high/`](scp-terra-high/README.md) |
| Poolside synthetic | Poolside synthetic model and application campaign | 52 | [`poolside-synthetic/`](poolside-synthetic/README.md) |

The campaign directories use a common navigation rule:

```text
campaign -> runs -> dataset ID -> candidate/application -> result
```

The 48 current benchmark inputs live in [`../datasets/`](../datasets/README.md).
Four historical runs exist only in the 52-run campaigns; those runs contain a
local `input/` directory.

## Evidence policy

Two generated structures are primary evidence and are retained in full:

- `hamr/` is the complete HAMR-generated application or Rust project.
- `result/proofs/` is the exact minimal Slang project containing the Logika
  refinement and health VCs submitted by the equivalence checker.

Generated trees retain their original internal paths and content. Build
caches, AIR `.slang` caches outside those retained projects, copied tool
repositories, synthetic home directories, controller logs, and obsolete
infrastructure snapshots are not included.

Historical result JSON and logs document completed runs. To execute a current
equivalence comparison, use a run's `result/replay.sh`; it writes to a sibling
`.replay` directory and does not overwrite retained evidence.
