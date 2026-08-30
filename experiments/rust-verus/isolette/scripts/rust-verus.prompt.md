# Role: Isolette Rust/Verus projection and implementation owner

Work only in this assigned clean-room workspace. Network is disabled and prior
Isolette, FCS, FGS, Autopilot models/runs are intentionally unreadable. Do not
attempt to discover or access them.

The accepted logical source is:
`runs/20260817T021418Z-faa-isolette-appendix-a/model/Isolette_Thermostat.sysml`.
Its handbook source is FAA Appendix A (not Appendix B). Read its system
abstract, model summary, traceability, validation, and repair evidence.

Own the remaining end-to-end work:

1. Create `rust/model/Isolette_Thermostat_Rust.sysml` as the deployment/codegen
   projection. Preserve the regulator/monitor semantics, substantive source
   traces, and GUMBO obligations. Make only explicit, audited formalization or
   HAMR deployment changes. Microkit supports one Thread per Process, so adapt
   the generated-support deployment structure accordingly without merging the
   eight behavior owners. Add the minimum processor, bindings, domains, and
   dispatch properties needed for HAMR Microkit Rust. Keep formal Boolean
   literals/tool-supported expressions compatible with generated Verus.
2. Typecheck the projection and generate a full HAMR Microkit Rust tree under
   `rust/hamr`. Retain AIR cache JSON if useful. Do not create or retain a
   Slang/JVM/Scala application project. Generated GumboX/Verus specification
   support is required.
3. Implement the preserved Rust application files for all eight owners. Do not
   weaken or edit generated contracts merely to make proof pass. Preserve the
   independent regulator and monitor failure/mode/state logic, heat safe-off
   and retain behavior, alarm failed-on and hysteresis behavior, rounding, and
   recovery priorities.
4. Run Verus on every application crate. Repair only application code or an
   explicitly documented semantics-preserving source compatibility issue.
5. Hash all application files, regenerate from the unchanged projection, prove
   every application hash is unchanged, and rerun every Verus proof.
6. Write concise evidence inside `rust/`: a colleague-facing `README.md`,
   `contract-source-audit.md`, `application-report.md`, raw logs in `proof/`,
   `proof/verification.md`, and a machine-readable decision in `agent/`.
   Record exact commands, counts, errors, and deferred physical/probabilistic
   claims. Preserve useful role transcript evidence.
7. Remove Cargo `target` directories and other rebuildable caches at the end.
   Do not create `MANIFEST.json` or `RUN_SUMMARY.md`.

Use installed Sireum/HAMR, cargo-verus, and Rust/Verus toolchains. Inspect their
local help rather than guessing command syntax. Fail closed: if a sound proof
cannot be obtained, retain the exact blocker and do not claim success. Do not
modify the accepted synthesis-run model.
