# Contract source audit

## Contract provenance

`model/Isolette_Thermostat_Rust.sysml` is the retained Rust/Microkit projection.
Its GUMBO clauses are the source contracts. HAMR copies those clauses into each
preserved `*_app.rs` as Verus entrypoint specifications and emits executable
GUMBOX predicates plus ghost-mirrored application APIs under `src/bridge`.
Generated manifests and bridges were restored exclusively by regeneration and
were not hand-edited.

The eight owner-local contract groups are:

| Owner | Source obligations |
| --- | --- |
| ManageRegulatorInterface | CASE-01..03: desired-setting qualification, range conversion, feedback/status, control-basis preservation |
| DetectRegulatorFailure | CASE-04..05: epoch reset and sticky internal-failure latch |
| ManageRegulatorMode | CASE-06..07: health decision and INIT/NORMAL/FAILED transition priority |
| ManageHeatSource | CASE-08..10: safe-off priority, numeric hysteresis, owner output |
| ManageMonitorInterface | CASE-11..13: alarm-setting qualification, range conversion, monitor basis/status |
| DetectMonitorFailure | CASE-14..15: epoch reset and sticky internal-failure latch |
| ManageMonitorMode | CASE-16..17: health decision and INIT/NORMAL/FAILED transition priority |
| ManageAlarm | CASE-18..19: mode priority, alarm hysteresis, owner output |

The source data invariants admit one shared Current Temperature sample of
680..1050 tenths of a degree, desired settings of lower 97..99 and upper
98..100 degrees, alarm settings of lower 93..98 and upper 99..103 degrees, and
a Display Temperature of 68..105 degrees. Setting lower bounds remain strictly
below their upper bounds. The root connects the same Current Temperature port
to both independent interface owners.

## Audited compatibility repairs

The deployable projection uses `Base_Types::Integer_32` for finite temperature
fields. This is representation-preserving for every source-admitted value and
is required because Microkit rejects unbounded integers.

The installed generator serializes an explicit SysML `Integer_32` cast in an
entrypoint contract as an invalid Rust `.asInstanceOf` selection. The repair is
model-side and mechanical: affected entrypoint expressions call typed GUMBO
spec functions. Their application-owned Verus definitions retain the exact
operations:

| Function | Defined semantics |
| --- | --- |
| `nominal_display_temperature`, `maximum_display_temperature` | 68 and 105 |
| `regulator_to_tenths`, `monitor_to_tenths` | input × 10 |
| `rounded_display_temperature` | truncation toward zero of (input + 5) / 10, implemented without `i32` overflow |
| `add_alarm_margin`, `subtract_alarm_margin` | input ± 5 |

The generated bridges now contain zero `.asInstanceOf` tokens. For runtime
GUMBOX evaluation, scaling and margin helpers use saturating Rust operations;
they are identical to the source arithmetic throughout the admitted setting
and derived control-basis ranges. The Verus entrypoint proofs use the exact
open specification definitions, not the saturating runtime helpers.

The current generator does not lift data-type invariants into application API
preconditions. The two interface applications therefore repeat the shared
Current Temperature bound and their source setting invariants as visible Verus
`requires` clauses. Heat and alarm repeat the
ordered/separated derived-range facts guaranteed compositionally by those
interface owners. These assumptions are visible in application source and in
`application-report.md`; they are not hidden axioms or weakened postconditions.

## Generated and trusted boundaries

- Generated API getters return executable C-bridge data while their Verus
  specifications relate the return to a ghost port mirror.
- Generated putters update the ghost output mirror after an external C call.
- The C/FFI bodies and logging functions are marked external; Cargo/Verus does
  not prove the external environment or generated transport implementation.
- Generated GUMBOX functions are executable runtime predicates. Passing the
  eight crate proofs establishes the application entrypoint obligations, not
  a separate proof of the C deployment or the seL4 kernel.

## Deferred claims

The model records periods, processor/domain bindings, response/latency values,
and a Microkit schedule. This work does not prove physical execution time,
deadline satisfaction, scheduler WCET, sensor physics, fault probabilities,
reliability probabilities, or independence assumptions. Those remain system,
platform, test, and quantitative-analysis obligations.
