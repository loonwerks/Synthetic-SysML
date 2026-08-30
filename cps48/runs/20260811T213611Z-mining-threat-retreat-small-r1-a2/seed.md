---
seed_id: mining-threat-retreat-supervisor-small-r1-a2-v1
version: 1
status: frozen
complexity: small
---

# Mining-frigate threat, defense, and retreat supervisor

NEED-01: A pilot and fleet commander need one consistent mining-frigate
decision over mining, defense, retreat, docking, offload, and resupply when
threat, resource bands, or action availability change or become invalid.

PURPOSE-01: Define a finite supervisor that owns operational phase and issues
one complete decision per logical tick without claiming physical results.

STAKE-01: The pilot requests mining or retreat and needs observable inhibition
and a deterministic return to availability after service.

STAKE-02: The fleet commander needs hostile-threat priority consistent with
defense availability and asset preservation.

STAKE-03: Engineers need complete nominal, boundary, fault, priority, and
recovery partitions for bounded analysis.

CTX-01: The boundary supervises one fictional mining frigate. Sensing,
measurement, pilot input, availability reporting, command execution, service,
and displays are context; economics and physical execution are outside it.

## Finite boundary

MON-01: `threat` is exactly `Clear`, `Suspect`, or `Hostile`, with independent
status `Valid` or `Invalid`.

MON-02: `cargo_band` is `Partial`, `Near_Full`, or `Full`;
`capacitor_band` is `Critical`, `Reserve`, or `Ready`. Each has independent
status `Valid` or `Invalid`.

MON-03: `operator_request` is exactly `Idle`, `Mine`, or `Retreat`, with status
`Valid` or `Invalid`.

MON-04: `mining_available`, `defense_available`, and `retreat_available` are
each `Available` or `Unavailable`, each with independent validity. Availability
means command acceptance only, not predicted success.

MON-05: `service_progress` is `Away`, `At_Station`, `Docked_Loaded`,
`Offload_Confirmed`, or `Resupply_Confirmed`, with status `Valid` or `Invalid`.

CTRL-01: `mining_command` is `Stop` or `Mine`; `defense_command` is
`Stand_Down` or `Engage`.

CTRL-02: `movement_service_command` is `Hold`, `Retreat`, `Dock`,
`Offload`, `Resupply`, or `Acknowledge_Ready`.

CTRL-03: `phase_report` is exactly `Idle`, `Mining`, `Defending`,
`Retreating`, `Servicing`, or `Fault_Hold`. `input_fault` is independently
`Clear` or `Asserted`.

## Assumptions and priority

ASM-01: Logical ticks are synchronous; initial phase is `Idle`. One snapshot
and current phase determine all outputs and next phase without real timing.

ASM-02: All eight monitored values in MON-01 through MON-05 participate in
validity. Invalidity has highest priority, followed by an established
retreat/service sequence, a new retreat trigger, hostile defense, mining, and
idle inhibition.

ASM-03: `Partial` permits mining, `Near_Full` inhibits it, and `Full` triggers
retreat. `Critical` triggers retreat; `Reserve` and `Ready` permit mining or
defense. These source-consistent categories are experiment policy, not
physical limits.

ASM-04: Retreat is required by a valid `Retreat` request, `Full` cargo,
`Critical` capacitor, or `Hostile` threat with unavailable defense. Otherwise
`Hostile` engages available defense; `Suspect` only inhibits mining.

ASM-05: Operational phases are `Idle`, `Mining`, and `Defending`. Admissible
snapshots pair `Mining`/`Defending` with `Away`, `At_Station` with retreat, and
docked progress with retreat, service, or `Fault_Hold` recovery. Later
redeployment is context behavior.

## Complete behavioral partition

REQ-01: Exactly one principal decision owner shall own phase, priority, all
five outputs, and case selection; no other usage may choose the disposition.

REQ-02: `input_fault` is `Asserted` exactly when any status is invalid and
`Clear` otherwise. Every case fixes all three commands, next phase, and fault.

REQ-03: With invalid input in `Mining`, `Defending`, or `Retreating`, and valid
available retreat, issue `Stop`/`Stand_Down`/`Retreat`, next `Retreating`,
fault `Asserted`.

REQ-04: Every other invalid case issues `Stop`/`Stand_Down`/`Hold`, next
`Fault_Hold`, fault `Asserted`, including invalid or unavailable retreat.

REQ-05: With all valid, progress `Away`, and retreat available, issue
`Stop`/`Stand_Down`/`Retreat`, next `Retreating`, fault `Clear` when phase is
`Retreating` or `Fault_Hold`, or ASM-04 triggers retreat. This provides
retreat persistence and away-from-station recovery.

REQ-06: The REQ-05 guard with retreat unavailable issues
`Stop`/`Stand_Down`/`Hold`, next `Fault_Hold`, fault `Clear`; phase exposes
capability loss without misreporting input invalidity.

REQ-07: With all valid and `At_Station` during retreat/recovery, issue
`Stop`/`Stand_Down`/`Dock`, next `Retreating`, fault `Clear` until docked.

REQ-08: With all valid and `Docked_Loaded` during retreat/service/recovery,
issue `Stop`/`Stand_Down`/`Offload`, next `Servicing`, fault `Clear`.

REQ-09: With all valid and `Offload_Confirmed` during service/recovery, issue
`Stop`/`Stand_Down`/`Resupply`, next `Servicing`, fault `Clear`.

REQ-10: With all valid and `Resupply_Confirmed` during service/recovery, issue
`Stop`/`Stand_Down`/`Acknowledge_Ready`, next `Idle`, fault `Clear`. This is the
only completed-service recovery.

REQ-11: With all valid in an operational phase at `Away`, no retreat case, and
`Hostile`, issue `Stop`/`Engage`/`Hold`, next `Defending`, fault `Clear`.
Earlier cases ensure available defense and noncritical capacitor.

REQ-12: With all valid in an operational phase at `Away`, no earlier case,
`Clear`, request `Mine`, cargo `Partial`, capacitor `Reserve` or `Ready`, and
mining available, issue `Mine`/`Stand_Down`/`Hold`, next `Mining`, fault
`Clear`.

REQ-13: Every remaining valid operational case issues
`Stop`/`Stand_Down`/`Hold`, next `Idle`, fault `Clear`. Thus `Near_Full`,
`Suspect`, idle demand, or unavailable mining inhibits without forcing retreat;
the mining cargo boundary is `Partial`/`Near_Full`.

REQ-03..13 are ordered, exclusive, exhaustive over admissible snapshots, and
are exactly 11 behavioral output/next-state partitions.

## Required scenario families

SCN-01: Nominal families cover idle-to-mining, continued mining, hostile
defense and persistence, threat clearance, and fresh-request resumption.

SCN-02: Boundary/priority families vary every cargo band, the
`Critical`/`Reserve` boundary, every threat, and competing requests, showing
retreat over defense over mining and exact resource boundaries.

SCN-03: Availability families independently remove all three capabilities,
including hostile-without-defense retreat and `Fault_Hold` until recovery.

SCN-04: Fault families invalidate every monitor alone and in selected
combinations from every phase, checking complete outputs and retreat/hold.

SCN-05: Recovery families restore validity, persist retreat through `Away` and
`At_Station`, require dock/offload/resupply/acknowledgment and a fresh mining
request, and remove then restore retreat availability mid-path.

## Required design consideration

The Designer shall compare at least two implementation-independent
responsibility allocations: (1) distinct qualification duties for threat,
resource bands, and availability feeding the principal owner and distinct
mining, defense, and movement/service execution duties; and (2) consolidated
input qualification around the same owner while retaining separate execution
duties. Compare semantic interaction count, state ownership, local-contract
expressibility, end-to-end preservation, fault observability, and recovery
composition. Neither alternative is preselected, and both must preserve one
principal decision owner and the finite partition above.

## Structural bounds

Exact inclusive small bounds are `5..8` responsibility-bearing semantic
usages, `7..14` typed directed domain interactions, `6..12` nontrivial
contract cases, and `4..6` scenario families. The calibrated point is exactly
7 usages, 13 interactions, 11 cases, and 5 families, with containment depth
`1..2` beneath one root system usage and one weakly connected semantic region.

The seven calibrated responsibilities are: principal decision ownership;
threat qualification; cargo/capacitor qualification; request and availability
qualification; mining execution; defense execution; and combined
movement/service execution. These are semantic duties, not prescribed
components. The 13 typed directed interactions are the eight monitored domain
values (threat, cargo, capacitor, request, three availabilities, and service
progress) toward their responsible consumer and the five controlled values
(mining, defense, movement/service, phase, and fault) toward their context.
Routing may differ between alternatives without duplicating semantic duties.
No executable profile is selected.

## Source basis

The upstream basis is `GfSE/SysML-v2-Models` commit
`ebbb0c39f4813b059e0bf14270ec58618aa012ca`, files
`models/example_EveOnlineMiningFrigate/DomainModel/BusinessCaseOpsCon.sysml`,
`DomainModel/Concerns.sysml`, `DomainModel/Domain.sysml`,
`DomainModel/MiningFrigate.sysml`,
`DomainModel/MiningFrigateRequirementsDef.sysml`, and
`UseCases/OperationalUseCaseActions.sysml` under that model directory. They
supply the fictional mining context; pilot command/report exchanges; cargo,
capacitor, sensor, drone/turret, propulsion, docking, offload, and resupply
responsibilities; threat scanning/prioritization; mining near-full, depleted,
lock, overheat, and insufficient-energy exceptions; defensive engagement;
retreat/warp; and docked/in-grid/warp state context. The finite bands,
validity, priority, availability, logical-tick, and recovery rules are bounded
experiment completions, not quoted source behavior.

EXCL-01: Exclude profitability, ore valuation or yield optimization, fleet
scaling, market behavior, extraction rate, cargo volume, threat range, damage,
survivability, and equipment sizing.

EXCL-02: Exclude navigation and spacecraft physics, real timing, physical
docking/offload/resupply success, hostile intent or neutralization, human
performance, safety, scheduling, deployment, and production interfaces.

## Claim boundary

EXCL-03: The fictional setting is context only. This seed may support
downstream SysML-AADL synthesis, finite GUMBO contract analysis, bounded
scenario exploration, and visualization. It establishes no proof,
correctness, physical validity, mission success, profitability, survivability,
safety, certification, or production readiness and inherits none of those
claims from the upstream corpus.
