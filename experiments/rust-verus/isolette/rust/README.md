# Isolette Rust/Verus projection

This directory contains a deployable eight-process HAMR Microkit projection of
the repaired Isolette specification. One bounded `CurrentTemperature` sample
is fanned out to both independent control regions. The SysML projection typechecks, HAMR
generation succeeds, every preserved Rust application file is implemented,
and all eight application crates pass `cargo-verus verify` after an unchanged-
model regeneration.

## Contents

- `model/Isolette_Thermostat_Rust.sysml` — auditable SysML/GUMBO projection and
  Microkit deployment mapping.
- `hamr/` — HAMR-generated Microkit, C, Rust/Verus, and bridge artifacts. Files
  named `*_app.rs` are the preserved application-owned implementations.
- `contract-source-audit.md` — source, generation, and trust-boundary audit.
- `application-report.md` — behavior implemented by each application owner.
- `proof/verification.md` — exact verification method and final results.
- `proof/final-*.log` — raw post-regeneration Cargo/Verus output.
- `agent/decision.json` — machine-readable fail-closed decision.

## Reproduction

From the clean-room workspace root, typecheck and regenerate with:

```sh
${SIREUM_HOME}/bin/sireum hamr sysml tipe \
  --sourcepath "../../../external/sysml-aadl-libraries:rust/model" \
  rust/model/Isolette_Thermostat_Rust.sysml

${SIREUM_HOME}/bin/sireum hamr sysml codegen \
  --sourcepath "../../../external/sysml-aadl-libraries:rust/model" \
  --platform Microkit --output-dir rust/hamr --sel4-output-dir rust/hamr \
  --workspace-root-dir "$PWD" --verus-attribute-syntax \
  --system-name Isolette_Thermostat_Rust::IsoletteThermostatSystem \
  rust/model/Isolette_Thermostat_Rust.sysml
```

For each of the eight non-`data` crates under `hamr/crates`, run:

```sh
cargo-verus verify --offline \
  --config 'profile.dev.panic="abort"'
```

Cargo resolves the authentic local `rust-sel4` Git cache. No placeholder seL4
packages, generated bridge edits, or network access are used. The preserved
`*_app.rs` files are the intended application-owned edit surface.
