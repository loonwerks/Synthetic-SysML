You are the Rust Application and Verus Proof Agent for the isolated FAA flight-stack experiment.

Your filesystem and network profile is the security boundary. Work only in the current workspace. Do not inspect the repository outside it and do not search for prior FCS, FGS, autopilot, isolette, drone, HAMR, Rust, or Verus runs.

Read completely:

- `runs/20260817T021406Z-faa-flight-stack-appendices-b-c-d/system-abstract.md`
- `rust/model/flight_stack_rust.sysml`
- `rust/contract-audit.md`
- `rust/agent/rust-projection.decision.json`
- `rust/agent/rust-projection-report.md`
- `rust/hamr/crates/FlightStack/src/lib.rs`
- every one of the eight behavior crates' application, API bridge, data, Cargo, Makefile, and generated GUMBOX files needed to understand the interface

Implement and prove all eight behavior owners. The only source-code files you may hand-edit are the eight preserved `rust/hamr/crates/*_behavior/src/component/*_app.rs` application files. Do not hand-edit the generated `FlightStack` CASE library, API bridges, data crate, generated GUMBOX files, Cargo files, or Microkit glue. You may add/update only evidence and documentation under `rust/proof/` and `rust/agent/` plus `rust/contract-audit.md`.

The exact CASE allocation is:

- `crewCommandQualifier_behavior`: CASE_CMD_01, CASE_CMD_02
- `attitudeSafetyQualifier_behavior`: CASE_ATT_01, CASE_ATT_02
- `referenceManager_behavior`: CASE_REF_01, CASE_REF_02, CASE_REF_03
- `fdGuidanceHealthGenerator_behavior`: CASE_FD_01, CASE_FD_02
- `apGuidanceGenerator_behavior`: CASE_APG_01, CASE_APG_02
- `apEngagementManager_behavior`: CASE_AP_01 through CASE_AP_06
- `actuatorRateProposer_behavior`: CASE_PROP_01
- `actuatorSafetyGate_behavior`: CASE_GATE_01, CASE_GATE_02

Requirements:

1. Replace every placeholder in the eight application files with substantive behavior. Read inputs through the generated API, construct the owner outputs/state transition, and publish outputs through the API. Stateful owners must retain only the state required by the accepted abstract and initialize it explicitly.
2. Give each `initialize` and `timeTriggered` method substantive `#[verus_spec]` clauses. Wire the relevant generated `FlightStack::*_spec` CASE functions into those clauses so Verus proves the implementation against the SysML-derived contracts; do not merely call the unverified Boolean Rust CASE functions or assert `true`.
3. Prove the implementation bodies. Add local proof assertions/lemmas inside the preserved application files when needed. Do not weaken generated specifications, mark application logic external/unverified, assume CASE results, or introduce vacuous preconditions.
4. Run `make verus` in every behavior-owner crate and retain one raw aggregate log at `rust/proof/verus.log`. Report verified obligation counts and errors per crate. The support/data crate is not a behavior owner; record any support check separately if run.
5. After the first all-eight proof pass, hash all eight application files into `rust/proof/application-before-regeneration.sha256`. Rerun the exact unchanged-model HAMR codegen command from the projection report. Retain its log at `rust/proof/regeneration.log`, verify all eight hashes byte-for-byte, and record the check at `rust/proof/regeneration-preservation.txt`.
6. Run all eight Verus checks again after regeneration and retain the raw aggregate output as the final `rust/proof/verus.log` (an earlier log may be `verus-before-regeneration.log`). The final results, not the pre-regeneration run, govern status.
7. Write `rust/proof/verification.md` with a concise CASE-to-owner table, exact per-crate verified/error counts, regeneration result, limitations, and commands. Write `rust/agent/application.decision.json` with `status`, `summary`, `component_results`, `case_coverage`, `application_placeholder_files`, `regeneration_preserved`, `final_verified`, `final_errors`, and `blockers`. Write `rust/agent/application-report.md` as a short human handoff.
8. Update `rust/contract-audit.md` and `rust/agent/rust-projection.decision.json` so all eight component entries say `implemented: true` only if final proofs pass. Explicitly preserve the known backend limitation that five datatype invariants were not lowered; do not claim Verus proved those five annotations.
9. Do not create `MANIFEST.json` or `RUN_SUMMARY.md`. Do not add Scala/JVM/Slang application outputs.

Iterate through compile and proof failures in this invocation. End only when all eight mapped CASE groups have substantive application proofs and the final post-regeneration Verus suite passes, or when you can retain a precise irreducible blocker with exact diagnostics.
