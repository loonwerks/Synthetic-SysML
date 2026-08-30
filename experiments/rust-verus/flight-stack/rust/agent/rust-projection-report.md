# Rust projection report

Status: **passed for accepted canonical SHA-256 `21424fafbfd58b33998929b314423608434264eee9b94f2327f51b06074ba657`**. The accepted model and Rust projection are well-formed, and HAMR Microkit Rust/Verus generation exited 0. The generated tree contains eight implemented behavior-owner application crates, two support crates, Microkit artifacts, and attestation artifacts. The temporary AIR cache was removed after verification. No Scala/JVM application project was generated.

Artifacts:

- Projected model: `rust/model/flight_stack_rust.sysml`
- Generated tree: `rust/hamr/`
- AIR cache: removed after the final unchanged-model regeneration
- Contract/architecture audit: `rust/contract-audit.md`
- Structured decision: `rust/agent/rust-projection.decision.json`
- Proof logs and read-only audit: `rust/proof/`

Exact accepted-source typecheck command (executed first):

```sh
SIREUM_HOME/bin/sireum hamr sysml tipe --sourcepath sysml-aadl-libraries/aadl.library runs/20260817T021406Z-faa-flight-stack-appendices-b-c-d/model/flight_stack.sysml
```

Exact projected-source typecheck command:

```sh
SIREUM_HOME/bin/sireum hamr sysml tipe --sourcepath sysml-aadl-libraries rust/model/flight_stack_rust.sysml
```

Exact final code-generation command:

```sh
SIREUM_HOME/bin/sireum hamr sysml codegen --sourcepath experiments/rust-verus/flight-stack/rust/proof/codegen-sourcepath --system-name FlightStack::FlightControlSystem --platform Microkit --output-dir experiments/rust-verus/flight-stack/rust/hamr --sel4-output-dir experiments/rust-verus/flight-stack/rust/hamr --workspace-root-dir experiments/rust-verus/flight-stack/rust --verus-attribute-syntax rust/model/flight_stack_rust.sysml
```

The only non-fatal backend limitation is HAMR's explicit TODO for lowering five datatype invariant annotations. Those GUMBO invariants remain unchanged in the projected model; all 20 CASE functions were generated into the `FlightStack` Rust crate. No generated bridge/specification file was edited.
