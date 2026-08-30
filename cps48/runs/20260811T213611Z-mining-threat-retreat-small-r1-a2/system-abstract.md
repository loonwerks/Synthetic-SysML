---
abstract_id: SA-MTR-01
domain_seed: mining-threat-retreat-supervisor-small-r1-a2-v1
status: approved
revision: 1
campaign_complexity: small
semantic_usage_bounds: [5, 8]
selected_semantic_usage_count: 7
semantic_interaction_bounds: [7, 14]
selected_semantic_interaction_count: 13
nontrivial_contract_case_bounds: [6, 12]
selected_nontrivial_contract_case_count: 11
scenario_family_bounds: [4, 6]
selected_scenario_family_count: 5
containment_depth_beneath_root: [1, 2]
root_system_usage_count: 1
weakly_connected_semantic_regions: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Mining-frigate threat, defense, and retreat supervisor

## Synopsis

SYN-01: A pilot and fleet commander need one consistent supervisory decision over mining, defense, retreat, docking, offload, and resupply when threat, resource bands, operator intent, service progress, or command availability changes or becomes invalid.

PURPOSE-01: The system will own a finite operational phase and issue one complete set of commands, phase report, and input-fault indication for each logical input snapshot. It will supervise command intent and command acceptance only; physical execution and mission outcome remain outside the boundary.

## Evidence and claim classes

EVID-HB-01: Handbook-derived facts govern method only: define need and boundary before parts, make assumptions and validity explicit, compare allocations, require traceability, distinguish verification from validation, and state objective pass criteria. The handbooks do not establish mining-domain behavior for this abstract.

EVID-SEED-01: Frozen seed facts establish the fictional context, finite value sets, priority, eleven-case behavioral partition, five scenario families, exclusions, and campaign bounds. These facts are requirements for this run and are not treated as verified physical truths.

EVID-PILOT-01: Logical ticks, finite bands, independent validity statuses, admissible phase/progress pairings, priority, availability meaning, and recovery order are bounded pilot abstractions. They support finite analysis but make no claim about production spacecraft behavior.

EVID-ARCH-01: The selected architecture is an implementation-independent allocation of seven semantic responsibilities. The approved realization allowance does not prescribe algorithms, encodings, deployment, scheduling, or executable behavior.

DEFER-CLAIM-01: Executability, code generation, physical correctness, mission success, safety, certification, production readiness, and formal semantic proof are deferred and shall not be reported as passed by this run.

## Goals and scope

GOAL-01: The supervisor shall make exactly one deterministic disposition per admissible logical snapshot and shall completely determine all five controlled values.

GOAL-02: The supervisor shall preserve the priority order invalid input, established retreat or service progression, new retreat trigger, hostile defense, mining, then idle inhibition.

GOAL-03: The supervisor shall expose invalid input separately from valid capability loss and shall provide a deterministic recovery path through retreat and service to availability.

GOAL-04: The responsibility allocation should localize input qualification and command-delivery obligations while preserving one principal owner for phase, priority, case selection, and every controlled decision.

SCOPE-01: The system boundary contains supervisory qualification, disposition selection, phase ownership, and command-delivery duties for one fictional frigate. Sensing, pilot and fleet interfaces, availability reporting, service-progress reporting, command acceptance and physical execution, displays, economics, navigation, timing, and later redeployment are outside it.

## Operational context and system boundary

CTX-01: The pilot and fleet-command interface supplies the operator request and receives the phase and input-fault reports. It does not choose the supervisor's disposition.

CTX-02: Frigate monitoring and availability providers supply threat, cargo band, capacitor band, three command-acceptance availabilities, and service progress, each with an independent validity status.

CTX-03: The frigate command-acceptance and execution environment receives mining, defense, and movement/service commands. Acceptance availability does not predict successful physical execution, and no physical result is controlled or observed by this abstract.

BOUND-01: Every monitored quantity crosses into the supervisory boundary through a typed directed semantic interaction, and every controlled quantity crosses toward its stated recipient. No excluded physical or economic quantity is an implicit input or output.

MON-01: `threat`, supplied by CTX-02, is exactly `Clear`, `Suspect`, or `Hostile` and has independent status `Valid` or `Invalid`.

MON-02: `cargo_band`, supplied by CTX-02, is exactly `Partial`, `Near_Full`, or `Full` and has independent status `Valid` or `Invalid`.

MON-03: `capacitor_band`, supplied by CTX-02, is exactly `Critical`, `Reserve`, or `Ready` and has independent status `Valid` or `Invalid`.

MON-04: `operator_request`, supplied by CTX-01, is exactly `Idle`, `Mine`, or `Retreat` and has independent status `Valid` or `Invalid`.

MON-05: `mining_available`, supplied by CTX-02, is `Available` or `Unavailable` and has independent status `Valid` or `Invalid`; availability means command acceptance only.

MON-06: `defense_available`, supplied by CTX-02, is `Available` or `Unavailable` and has independent status `Valid` or `Invalid`; availability means command acceptance only.

MON-07: `retreat_available`, supplied by CTX-02, is `Available` or `Unavailable` and has independent status `Valid` or `Invalid`; availability means command acceptance only.

MON-08: `service_progress`, supplied by CTX-02, is exactly `Away`, `At_Station`, `Docked_Loaded`, `Offload_Confirmed`, or `Resupply_Confirmed` and has independent status `Valid` or `Invalid`.

CTRL-01: `mining_command`, delivered to CTX-03, is exactly `Stop` or `Mine` and controls requested mining activity only.

CTRL-02: `defense_command`, delivered to CTX-03, is exactly `Stand_Down` or `Engage` and controls requested defense activity only.

CTRL-03: `movement_service_command`, delivered to CTX-03, is exactly `Hold`, `Retreat`, `Dock`, `Offload`, `Resupply`, or `Acknowledge_Ready` and controls requested movement or service activity only.

CTRL-04: `phase_report`, delivered to CTX-01, is exactly `Idle`, `Mining`, `Defending`, `Retreating`, `Servicing`, or `Fault_Hold` and reports the selected next operational phase.

CTRL-05: `input_fault`, delivered to CTX-01, is exactly `Clear` or `Asserted` and reports monitored-input validity, not command availability or physical success.

## Frozen pilot constraints and assumptions

ASM-01: CTX-01 is responsible for pairing the operator request with its status, and CTX-02 is responsible for pairing each of the other seven monitored values with its status in one stable logical snapshot. The abstraction assumes no value/status tearing within a tick because real timing is excluded.

CONS-01: Logical evaluation is synchronous and untimed. The initial current phase is `Idle`; one complete snapshot and the current phase determine every output and the next phase.

CONS-02: Any invalid status has highest priority, followed by an established retreat/service sequence, a new retreat trigger, hostile defense, mining, and idle inhibition. Qualification duties may report validity and normalized domain values but shall not choose among these dispositions.

CONS-03: `Partial` cargo permits mining, `Near_Full` inhibits mining, and `Full` triggers retreat. `Critical` capacitor triggers retreat; `Reserve` and `Ready` permit mining or defense. These are experiment-policy categories, not physical limits.

CONS-04: Retreat is required by a valid `Retreat` request, `Full` cargo, `Critical` capacitor, or `Hostile` threat with defense unavailable. Otherwise, `Hostile` engages available defense and `Suspect` inhibits mining without itself forcing retreat.

CONS-05: The admissible current-phase/service-progress relation is exact and applies independently of every monitored value's validity: `Away` permits current phase `Idle`, `Mining`, `Defending`, `Retreating`, or `Fault_Hold`; `At_Station` permits `Retreating` or `Fault_Hold`; `Docked_Loaded` permits `Retreating`, `Servicing`, or `Fault_Hold`; and `Offload_Confirmed` or `Resupply_Confirmed` permits `Servicing` or `Fault_Hold`. No other phase/progress pair is admissible. Later redeployment after completed service is context behavior and requires a fresh request for new mining.

## Selected parts and responsibilities

PART-01: The principal decision owner shall exclusively own current and next phase, priority evaluation, selection of exactly one behavioral case, all three command decisions, the phase report, and the input-fault indication. No other semantic usage may select or override the disposition.

PART-02: The threat-qualification duty shall preserve the finite threat value and its independent validity for the principal owner without selecting defense, retreat, or inhibition.

PART-03: The resource-qualification duty shall preserve cargo and capacitor bands and both validity statuses for the principal owner without selecting mining, defense, or retreat.

PART-04: The request-and-availability qualification duty shall preserve operator request, all three command-acceptance availabilities, and their independent validity statuses for the principal owner without selecting a disposition.

PART-05: The mining-execution duty shall deliver the selected mining command to CTX-03 and shall not infer mining success or change the selected command.

PART-06: The defense-execution duty shall deliver the selected defense command to CTX-03 and shall not infer threat neutralization or change the selected command.

PART-07: The movement-and-service execution duty shall deliver the selected movement/service command to CTX-03 and shall not infer retreat, docking, offload, or resupply completion or change the selected command.

## Typed directed semantic interactions

INT-01: CTX-02 provides the typed threat value/status interaction through PART-02 toward PART-01.

INT-02: CTX-02 provides the typed cargo-band value/status interaction through PART-03 toward PART-01.

INT-03: CTX-02 provides the typed capacitor-band value/status interaction through PART-03 toward PART-01.

INT-04: CTX-01 provides the typed operator-request value/status interaction through PART-04 toward PART-01.

INT-05: CTX-02 provides the typed mining-availability value/status interaction through PART-04 toward PART-01.

INT-06: CTX-02 provides the typed defense-availability value/status interaction through PART-04 toward PART-01.

INT-07: CTX-02 provides the typed retreat-availability value/status interaction through PART-04 toward PART-01.

INT-08: CTX-02 provides the typed service-progress value/status interaction directly toward PART-01.

INT-09: PART-01 provides the typed mining-command interaction through PART-05 toward CTX-03.

INT-10: PART-01 provides the typed defense-command interaction through PART-06 toward CTX-03.

INT-11: PART-01 provides the typed movement/service-command interaction through PART-07 toward CTX-03.

INT-12: PART-01 provides the typed phase-report interaction toward CTX-01.

INT-13: PART-01 provides the typed input-fault interaction toward CTX-01.

## Exact architecture metrics and generated support

STRUCT-01: The final architecture shall contain exactly one explicit root system usage, exactly seven responsibility-bearing semantic usages corresponding to PART-01 through PART-07, containment depth exactly `2` beneath the root for those semantic usages, one weakly connected semantic region, exactly thirteen end-to-end semantic interactions corresponding to INT-01 through INT-13, exactly eleven nontrivial decision cases, and exactly five scenario families. These values remain within the `small` campaign bounds of `5..8`, `7..14`, `6..12`, and `4..6`, respectively.

STRUCT-02: The approved concrete allocation is one root system containing one behavior-free support container, with the seven PART usages contained beneath that support container. The support container, context actors, root, routing-only ports and connections, and value/status data wrappers are not responsibility-bearing semantic usages.

GEN-SUPPORT-01: A behavior-free support container and routing-only forwarding ports, connections, and typed value/status wrappers are allowed only with a specific `@generated-support` rationale or trace to the refined INT clause. They may refine one end-to-end interaction into multiple routing hops, but shall not add a semantic duty, a fourteenth domain interaction, decision state, case selection, priority, output authority, transformation, filtering, or command override.

## Local-contract expectations

CONTRACT-LOCAL-01: PART-02 shall guarantee exact identity of threat value and status; PART-03 shall guarantee exact identity of cargo value/status and capacitor value/status; and PART-04 shall guarantee exact identity of operator-request value/status and each of the three availability value/status pairs. Each status remains independent, and no qualifier may merge statuses into a substitute validity concept before PART-01 evaluates `all_valid`.

CONTRACT-LOCAL-02: PART-05, PART-06, and PART-07 shall respectively guarantee exact identity of the mining, defense, and movement/service command selected by PART-01 through delivery. These duties shall neither infer acceptance or physical success nor alter the selected command.

CONTRACT-LOCAL-03: PART-01 alone shall hold current-phase state, initialize it to `Idle`, evaluate explicit mutually exclusive guards from pre-state and current inputs, assign all five controlled values in every case, and update current phase consistently with `phase_report`. Textual case order and first-match semantics are not evidence of priority; every phrase `no earlier case applies` shall be lowered to explicit exclusions.

CONTRACT-LOCAL-04: Qualification and command-preservation guarantees are local non-case obligations and do not increase the count of eleven nontrivial decision cases. Contracts on pure generated-support forwarding elements are allowed but not required; if present, they may state identity only and shall not introduce domain policy.

## Behavioral vocabulary and state

DEF-01: `all_valid` means that the statuses of all eight monitored values are `Valid`; `any_invalid` is its exact complement. `input_fault` shall be `Asserted` exactly for `any_invalid` and `Clear` exactly for `all_valid`.

DEF-02: An operational current phase is `Idle`, `Mining`, or `Defending`. A retreat/recovery current phase is `Retreating` or `Fault_Hold`; a service/recovery current phase is `Servicing` or `Fault_Hold`.

DEF-03: A valid snapshot has a new retreat trigger exactly when the operator requests `Retreat`, cargo is `Full`, capacitor is `Critical`, or threat is `Hostile` while defense is unavailable.

DEF-04: Every behavioral case shall assign `mining_command`, `defense_command`, `movement_service_command`, next `phase_report`, and `input_fault`; unmentioned, retained, or nondeterministic controlled values are prohibited.

## Complete ordered contract partition

FAULT-01 / CASE-01: If `any_invalid`, the current phase is `Mining`, `Defending`, or `Retreating`, and retreat availability itself is valid and `Available`, the supervisor shall issue `Stop`, `Stand_Down`, and `Retreat`, report next phase `Retreating`, and assert `input_fault`. Verification and pass criterion: contract inspection plus finite bounded enumeration shall show this guard selects only this case and fixes all five controlled values exactly as stated.

FAULT-02 / CASE-02: Every other `any_invalid` snapshot shall issue `Stop`, `Stand_Down`, and `Hold`, report next phase `Fault_Hold`, and assert `input_fault`, including invalid or unavailable retreat. Verification and pass criterion: finite bounded enumeration shall show every invalid snapshot not matched by CASE-01 selects this case and fixes all five controlled values exactly as stated.

BEH-01 / CASE-03: If `all_valid`, service progress is `Away`, retreat is `Available`, and either the current phase is `Retreating` or `Fault_Hold` or DEF-03 is true, the supervisor shall issue `Stop`, `Stand_Down`, and `Retreat`, report next phase `Retreating`, and clear `input_fault`. Verification and pass criterion: finite bounded enumeration shall show retreat persistence, away-from-station recovery, and every new retreat trigger with available retreat select this case and its five stated results.

FAULT-03 / CASE-04: Under the otherwise identical valid `Away` retreat-persistence or retreat-trigger guard of CASE-03, but with retreat `Unavailable`, the supervisor shall issue `Stop`, `Stand_Down`, and `Hold`, report next phase `Fault_Hold`, and clear `input_fault`. Verification and pass criterion: finite bounded enumeration shall show valid retreat capability loss selects this case, never asserts input invalidity, and fixes all five results as stated.

BEH-02 / CASE-05: If `all_valid`, service progress is `At_Station`, and the current phase is `Retreating` or `Fault_Hold`, the supervisor shall issue `Stop`, `Stand_Down`, and `Dock`, report next phase `Retreating`, and clear `input_fault`. Verification and pass criterion: bounded scenario analysis shall show retreat/recovery at station cannot skip docking and that all five results equal the stated values.

BEH-03 / CASE-06: If `all_valid`, service progress is `Docked_Loaded`, and the current phase is `Retreating`, `Servicing`, or `Fault_Hold`, the supervisor shall issue `Stop`, `Stand_Down`, and `Offload`, report next phase `Servicing`, and clear `input_fault`. Verification and pass criterion: bounded scenario analysis shall show docked loaded retreat/service/recovery selects offload and all five stated results.

BEH-04 / CASE-07: If `all_valid`, service progress is `Offload_Confirmed`, and the current phase is `Servicing` or `Fault_Hold`, the supervisor shall issue `Stop`, `Stand_Down`, and `Resupply`, report next phase `Servicing`, and clear `input_fault`. Verification and pass criterion: bounded scenario analysis shall show confirmed offload selects resupply and all five stated results.

BEH-05 / CASE-08: If `all_valid`, service progress is `Resupply_Confirmed`, and the current phase is `Servicing` or `Fault_Hold`, the supervisor shall issue `Stop`, `Stand_Down`, and `Acknowledge_Ready`, report next phase `Idle`, and clear `input_fault`. This is the only completed-service recovery. Verification and pass criterion: bounded scenario analysis shall show no earlier service state reaches `Idle` through completed-service recovery and that all five results equal the stated values.

BEH-06 / CASE-09: If `all_valid`, the current phase is operational, service progress is `Away`, no earlier case applies, and threat is `Hostile`, the supervisor shall issue `Stop`, `Engage`, and `Hold`, report next phase `Defending`, and clear `input_fault`. Verification and pass criterion: finite bounded enumeration shall show this case occurs only after retreat conditions and capability loss have been excluded, therefore defense is available and capacitor is noncritical, and shall show all five stated results.

BEH-07 / CASE-10: If `all_valid`, the current phase is operational, service progress is `Away`, no earlier case applies, threat is `Clear`, the operator requests `Mine`, cargo is `Partial`, capacitor is `Reserve` or `Ready`, and mining is `Available`, the supervisor shall issue `Mine`, `Stand_Down`, and `Hold`, report next phase `Mining`, and clear `input_fault`. Verification and pass criterion: finite bounded enumeration shall show mining occurs exactly under this guard and that every controlled value has the stated result.

BEH-08 / CASE-11: Every remaining admissible `all_valid` operational snapshot shall issue `Stop`, `Stand_Down`, and `Hold`, report next phase `Idle`, and clear `input_fault`. Verification and pass criterion: finite bounded enumeration shall show this residual is disjoint from CASE-01 through CASE-10, covers every remaining admissible valid operational snapshot, and includes `Near_Full`, `Suspect`, idle demand, and unavailable-mining inhibition without forcing retreat.

PARTITION-01: CASE-01 through CASE-11 shall be encoded with explicit mutually exclusive guards and shall be collectively exhaustive over all admissible snapshots. Their presentation order records policy priority but shall not be used as first-match semantics. Verification and pass criterion: the retained deterministic bounded analyzer shall report exactly one selected case for every enumerated admissible combination and zero overlaps, gaps, or incomplete output assignments.

## Risks and mitigations

RISK-01: If an invalid monitored value were used as trustworthy, the supervisor could issue mining, defense, retreat, or service intent without a valid decision basis; FAULT-01 and FAULT-02 mitigate this consequence by inhibiting mining and defense, asserting the fault, and permitting retreat only under their explicit valid-availability condition. No likelihood or severity is claimed.

RISK-02: If required or persistent retreat were reported as progressing while retreat command acceptance was unavailable, observers could mistake capability loss for successful retreat; FAULT-03 mitigates this consequence by holding and reporting `Fault_Hold` while leaving `input_fault` clear. No physical safety outcome is claimed.

## Observable modes and transitions

MODE-01: `Idle` observably reports no active mining, defense, retreat, or service phase and is the initial phase.

MODE-02: `Mining` observably reports the selected mining phase; continuation still requires CASE-10 on each tick.

MODE-03: `Defending` observably reports the selected hostile-defense phase; continuation still requires CASE-09 on each tick.

MODE-04: `Retreating` observably reports retreat or docking progression governed by CASE-01, CASE-03, and CASE-05.

MODE-05: `Servicing` observably reports offload or resupply progression governed by CASE-06 and CASE-07.

MODE-06: `Fault_Hold` observably distinguishes inhibited progress caused by invalid input or valid retreat-capability loss from ordinary `Idle` inhibition.

TRANS-01: A valid mining guard triggers transition from any operational phase to `Mining`; removal of that guard triggers another higher-priority case or residual `Idle` inhibition.

TRANS-02: A valid hostile-defense guard triggers transition from any operational phase to `Defending`; threat clearance triggers another applicable operational case or residual `Idle` inhibition.

TRANS-03: CASE-01, CASE-03, or CASE-05 triggers or preserves `Retreating`; docking progress then permits transition to `Servicing` only through CASE-06.

TRANS-04: CASE-02 or CASE-04 triggers `Fault_Hold`; restored validity and retreat availability permit CASE-03, while valid dock/service progress permits the corresponding recovery case.

TRANS-05: CASE-06 or CASE-07 triggers or preserves `Servicing`; only CASE-08 completes service recovery to `Idle`.

## Required scenario families

SCN-01: The nominal family shall cover idle-to-mining, continued mining, hostile defense and persistence, threat clearance, and fresh-request mining resumption. Objective pass criterion: retained scenario evidence exercises CASE-09, CASE-10, and CASE-11 with every step's five outputs and next phase matching the partition.

SCN-02: The boundary-and-priority family shall vary all cargo bands, the `Critical`/`Reserve` capacitor boundary, all threat values, and competing requests. Objective pass criterion: evidence demonstrates exact resource boundaries and retreat over defense over mining without any snapshot matching multiple cases.

SCN-03: The availability family shall independently remove mining, defense, and retreat command acceptance, including hostile-without-defense retreat and valid `Fault_Hold` until recovery. Objective pass criterion: evidence distinguishes ordinary inhibition, retreat escalation, and CASE-04 capability loss while `input_fault` remains correct.

SCN-04: The invalid-input family shall invalidate each of the eight monitors alone and selected combinations from every phase. Objective pass criterion: every trace selects CASE-01 or CASE-02 only, asserts `input_fault`, and assigns all three commands and next phase exactly.

SCN-05: The recovery family shall restore validity, persist retreat through `Away` and `At_Station`, require dock, offload, resupply, and acknowledgment, remove and restore retreat availability mid-path, and require a fresh mining request afterward. Objective pass criterion: evidence follows CASE-01 or CASE-02 through CASE-03 and CASE-05 through CASE-08 without skipping a service step or resuming mining from stale demand.

## Bounded end-to-end analysis obligations

ANALYSIS-01: The retained dependency-free deterministic analyzer shall define the raw finite product independently of the contract cases as `3^4 * 2^3 * 5 * 2^8 * 6 = 4,976,640` value/status/progress/prior-phase snapshots, apply only CONS-05's fourteen admissible phase/progress pairs independently of validity, and enumerate exactly `3^4 * 2^3 * 2^8 * 14 = 2,322,432` admissible snapshots under the harness's 180-second watchdog.

ANALYSIS-02: For every admissible snapshot, the analyzer shall compose the three qualifier identity relations, PART-01's stateful eleven-case relation, the three command-preservation relations, and an explicit INT-01 through INT-13 end-to-end map. It shall retain counts and failure witnesses for zero or multiple selected cases, any unassigned or unequal controlled value, any local identity violation, any unresolved interaction endpoint, and any mismatch between `input_fault` and the exact complement of `all_valid`.

ANALYSIS-03: The analyzer shall separately retain bounded traces for all five scenario families, including the ordered recovery sequence, retreat-availability removal and restoration, all eight single-invalid inputs plus selected invalid combinations, operational phase persistence, and the fresh-request requirement. Enumeration and scenario results are bounded conformance evidence only; they are not compositional or formal proof.

## Traceability and objective acceptance criteria

TRACE-01: Every actionable abstract identifier shall trace to one or more model elements or be explicitly marked deferred or informational; every significant generated component, port, connection, state item, and contract clause shall trace back to this abstract or carry a specific generated-support rationale.

TRACE-02: Trace coverage is many-to-many and coverage-based. Missing abstract coverage, an unexplained generated element, a second decision owner, or silent weakening of a case, fault response, priority, or recovery step blocks acceptance.

PASS-01: Structural analysis shall report one root, seven semantic usages, thirteen semantic domain interactions, containment depth exactly `2` beneath the root for PART-01 through PART-07, one weakly connected semantic region, and no usage or interaction lacking a distinct traced responsibility.

PASS-02: Boundary inspection shall account for exactly eight independently status-bearing monitored values and exactly five controlled values with compatible types and directions and no unresolved endpoint.

PASS-03: Architecture and contract inspection shall identify PART-01 as the sole phase, priority, output, and case-selection owner; qualification and execution duties shall not contain competing disposition logic.

PASS-04: Contract inspection and retained bounded analysis shall report exactly eleven nontrivial cases, exactly one matching case per each of 2,322,432 admissible snapshots, complete assignment of all five controlled values, exact local preservation, and exact `input_fault` equivalence to any invalid status.

PASS-05: Scenario evidence shall cover all five scenario families and explicitly include nominal, boundary/priority, availability, invalid/fault, and recovery traces with no missing required step.

PASS-06: Architecture-stage and final Sireum/HAMR typechecking plus the independent harness gate shall pass; this verifies source conformance but does not validate domain fitness or prove the behavioral semantics.

PASS-07: Bidirectional trace analysis shall report no missing required identifier and no unexplained significant model element. Any routing refinement of an INT clause shall retain its end-to-end trace.

PASS-08: Designer validation shall separately find the resulting model faithful to the need, boundary, priority, partition, fault observability, recovery composition, and exclusions; tool success alone is insufficient.

PASS-09: The reviewed `system-overview` shall correspond to the accepted source revision and visibly preserve the boundary, seven responsibilities, principal flows, and sole decision owner without presenting context actors or generated-support routing as semantic usages.

PASS-10: Reports shall mark code generation, execution, physical validation, solver certification, formal proof, safety, mission outcome, and production claims `not-run`, `deferred`, or `out-of-scope`, never `passed`.

## Deferred checks and claims

DEFER-CHECK-01: No executable profile is selected, so executable application logic, generated code, runtime assertions, simulation evidence, scheduling, deployment, and real-time behavior are not required and shall remain `not-run`.

DEFER-CHECK-02: Compositional proof, solver certification, unbounded or formal semantic proof, physical docking/offload/resupply confirmation, hostile neutralization, safety, profitability, survivability, mission outcome, later redeployment, certification, and production readiness remain `deferred` or `out-of-scope` and are not acceptance evidence.
