# FAA flight-stack Rust/Verus run

This clean-room run derives a flight-control stack from FAA Appendices B-D.
The final projection contains eight behavior owners and passes two complete
Verus sweeps with 78 owner obligations and zero errors.

Read in this order:

1. [`input/faa-appendices-b-c-d.txt`](input/faa-appendices-b-c-d.txt)
2. [`synthesis/system-abstract.md`](synthesis/system-abstract.md)
3. [`synthesis/model/flight_stack.sysml`](synthesis/model/flight_stack.sysml)
4. [`rust/contract-audit.md`](rust/contract-audit.md)
5. [`rust/model/flight_stack_rust.sysml`](rust/model/flight_stack_rust.sysml)
6. [`rust/agent/application-report.md`](rust/agent/application-report.md)
7. [`rust/proof/verification.md`](rust/proof/verification.md)

The complete generated Rust project is [`rust/hamr/`](rust/hamr/). The final
architecture export is
[`synthesis/visualization/system-overview.svg`](synthesis/visualization/system-overview.svg).
Isolation records are under [`evidence/`](evidence/), and retained role prompts
and the launcher are under [`scripts/`](scripts/).
