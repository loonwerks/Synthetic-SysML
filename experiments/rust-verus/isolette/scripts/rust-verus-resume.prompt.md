# Role: resume Isolette Rust/Verus projection after an operational checkpoint

Continue only inside this assigned clean-room workspace. Network remains
disabled; the updated profile now permits read-only access to the real local
Cargo Git cache at `CARGO_HOME/git`. Prior Isolette/FCS/FGS/
Autopilot models and runs remain inaccessible and must not be sought.

Read `overseer/rust-verus.jsonl` for the retained transcript and inspect the
current `rust/` tree. The previous role completed the deployable eight-Process
projection, a clean typecheck, HAMR Microkit generation, a model-side generated
contract compatibility repair, and the first application implementation. It
checkpointed while working around previously unreadable optional seL4 Git
dependencies.

Resume with these constraints:

1. Do not use placeholder seL4 packages. Remove only the known temporary
   `/tmp/isolette-verus-offline-stubs` directory if it exists.
2. Before relying on proofs, regenerate from the current unchanged projection
   to restore every generated `Cargo.toml` and generated bridge exactly. HAMR
   must preserve the existing application file. Never hand-edit generated
   GUMBOX or manifests to obtain proof success.
3. Use the real local Cargo Git cache in offline mode. Invocation-scoped
   `profile.dev.panic="abort"` is acceptable and must be recorded.
4. Implement all eight preserved application files, prove all eight crates,
   repair only application code or an explicitly audited semantics-preserving
   model-source compatibility issue, then perform the unchanged-model
   regeneration hash-preservation check and rerun all eight proofs.
5. Finish the concise `rust/README.md`, `contract-source-audit.md`,
   `application-report.md`, `proof/verification.md`, raw proof/codegen logs,
   and `agent/` machine-readable decision. Accurately distinguish source
   contracts, generated bridges, verified application obligations, and
   deferred physical timing/probability claims.
6. Remove all Cargo `target` directories, Cargo lockfiles that are merely local
   proof byproducts, the workspace-level `.slang` cache, disposable probes,
   and noisy duplicate logs at final compaction. Retain only concise diagnostic
   evidence that explains material repairs. Do not create `MANIFEST.json` or
   `RUN_SUMMARY.md`.

Fail closed. If a sound proof cannot be completed, retain and report the exact
blocker rather than weakening contracts.
