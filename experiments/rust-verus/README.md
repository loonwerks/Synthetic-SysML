# Rust/Verus experiments

These five case studies project accepted SysML/GUMBO models to HAMR Microkit
Rust, implement the generated application boundary, and verify the resulting
contracts with Verus.

| Run | Source | Retained result |
| --- | --- | --- |
| [`flight-stack/`](flight-stack/README.md) | FAA Appendices B-D | 8 crates; 78 owner obligations |
| [`isolette/`](isolette/README.md) | FAA Appendix A | 8 crates; 78 owner obligations |
| [`flight-guidance/`](flight-guidance/README.md) | Flight-guidance system abstract | 15 application obligations |
| [`drone-lifecycle/`](drone-lifecycle/README.md) | Synthesized drone lifecycle model | 5 targets; 46 obligations |
| [`vehicle-start-readiness/`](vehicle-start-readiness/README.md) | Canonical benchmark dataset | 8 crates; 80 owner obligations |

Each run keeps its complete `hamr/` output. The surrounding directories expose
the logical model, deployment projection, proof evidence, and visualization
without embedding copies of the synthesizer, viewer, or SysML libraries.

Verus commands require an installed `cargo-verus` and its matching Rust/Verus
toolchain. HAMR regeneration additionally requires `SIREUM_HOME` to name a
local Sireum installation.
