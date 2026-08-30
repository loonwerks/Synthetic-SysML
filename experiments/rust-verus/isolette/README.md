# FAA Isolette Rust/Verus run

This clean-room run starts from the FAA Isolette thermostat requirements. Its
eight behavior owners pass unchanged-model regeneration and a final Verus
sweep with 78 owner obligations and zero errors.

Read in this order:

1. [`input/faa-appendix-a.txt`](input/faa-appendix-a.txt)
2. [`synthesis/system-abstract.md`](synthesis/system-abstract.md)
3. [`synthesis/model/Isolette_Thermostat.sysml`](synthesis/model/Isolette_Thermostat.sysml)
4. [`rust/contract-source-audit.md`](rust/contract-source-audit.md)
5. [`rust/model/Isolette_Thermostat_Rust.sysml`](rust/model/Isolette_Thermostat_Rust.sysml)
6. [`rust/application-report.md`](rust/application-report.md)
7. [`rust/proof/verification.md`](rust/proof/verification.md)

The complete HAMR Microkit/Rust generation is [`rust/hamr/`](rust/hamr/), and
the final architecture export is
[`synthesis/visualization/system-overview.svg`](synthesis/visualization/system-overview.svg).
