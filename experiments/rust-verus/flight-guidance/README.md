# Flight-guidance Rust/Verus run

This compact run projects a flight-guidance model to one HAMR Microkit Rust
behavior crate. Its retained Verus log reports 15 application obligations and
zero errors.

- Logical model: [`model/flight_guidance.sysml`](model/flight_guidance.sysml)
- Rust projection: [`rust/model/flight_guidance_rust.sysml`](rust/model/flight_guidance_rust.sysml)
- Complete HAMR output: [`rust/hamr/`](rust/hamr/)
- Verification evidence: [`proof/`](proof/)
- Reproduction commands: [`bin/`](bin/)
- Architecture export: [`visualization/flight_guidance.svg`](visualization/flight_guidance.svg)

Set `SIREUM_HOME` before using the HAMR or Logika commands. `cargo-verus` must
be available on `PATH` for the Verus command.
