# Drone lifecycle governor — compact system abstract

## Source and boundary

- Source example: `SysML-v2-Models/models/SE_Models/DroneModelLogical.sysml`.
- System of interest: a logical governor for the source-named drone phases
  `Off`, `Standby`, `Charging`, `Ready`, and `Flying`.
- The governor accepts lifecycle requests plus qualitative battery and charger
  evidence. It publishes the selected phase, a commanded-phase report, a
  decision disposition, derived enablement commands, and a pilot notice.
- Exact request authority, validity flags, transition policy, and recovery
  behavior are explicit POC abstractions, not claims extracted from the source.

## Inputs and outputs

- `Lifecycle_Request_Sample`: validity plus one of no request, switch on/off,
  begin/end charge, activate, or begin/end flight.
- `Battery_Capacity_Sample`: validity plus adequate/low qualitative capacity.
- `Charge_Connection_Sample`: validity plus connected/disconnected evidence.
- Outputs: selected and commanded lifecycle phase, decision disposition,
  power/charging/flight enablement, and prioritized pilot notice.

## Responsibilities

1. Request Qualification converts every request sample into one total
   validity-aware qualified request.
2. Battery Evidence Assessment converts every capacity sample into invalid,
   adequate, or low evidence and supplies both the governor and notice logic.
3. Lifecycle Governor alone owns current phase, recovery state, charge
   qualification, strict decision priority, phase commitment, and disposition.
4. Enablement Derivation maps each selected phase into independent power,
   charging, and flight commands.
5. Pilot Notice Derivation maps disposition and battery evidence into one
   priority-ordered notice.

## Governor policy

1. Any invalid qualified input commands `Off` and latches recovery.
2. While recovering, a present request is rejected as recovery pending.
3. A neutral valid request clears recovery while holding `Off`.
4. Outside recovery, valid `Switch_Off` has global priority and commands `Off`.
5. `Off + Switch_On -> Standby`.
6. `Standby + Begin_Charge + connected -> Charging`.
7. `Charging + End_Charge -> Standby`.
8. `Standby + Activate + adequate battery -> Ready`.
9. `Ready + Begin_Flight + adequate battery -> Flying`.
10. `Flying + End_Flight -> Ready`.
11. Every remaining combination holds phase with an exact disposition:
    no rejection, charger unavailable, battery insufficient, or inapplicable.

## Derived outputs

- `Off`: power disabled; charging disabled; flight disabled.
- `Standby`: power enabled; charging disabled; flight disabled.
- `Charging`: power enabled; charging enabled; flight disabled.
- `Ready`: power enabled; charging disabled; flight disabled.
- `Flying`: power enabled; charging disabled; flight enabled.
- Pilot-notice priority is input fault, recovery pending, charger unavailable,
  low battery, other rejection, then no notice.

## Required evidence

- GUMBO owns total initialization and compute relations at each responsibility.
- The governor's eleven ordered cases form a complete, mutually effective
  finite partition and preserve its recovery invariant.
- HAMR lowers those contracts into Verus attributes on generated Rust
  `initialize` and `timeTriggered` entrypoints.
- Rust application bodies implement, rather than assume, the contracted maps
  and state transition policy.
- Verus must report zero errors for all five application crates after an
  unchanged-model regeneration preserves handwritten application files.

## Claim boundary

The POC excludes flight dynamics, achieved charging or flight, numeric battery
behavior, real timing, navigation, communications, sensing, engine count,
landing, return-to-home, forest-fire mission behavior, hazard mitigation,
safety, certification, deployment execution, and production readiness.
