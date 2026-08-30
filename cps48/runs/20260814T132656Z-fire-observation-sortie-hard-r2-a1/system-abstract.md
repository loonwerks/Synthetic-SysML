---
abstract_id: SA-FOS-HARD-R2-01
domain_seed: 20260813T233942Z-fire-observation-sortie-seed-v1
status: approved
campaign_complexity: hard
semantic_usage_count: [13, 13]
semantic_interaction_count: [33, 33]
nontrivial_contract_case_count: [29, 29]
scenario_family_count: [10, 10]
semantic_thread_usage_count: [13, 13]
generated_support_process_count: 1
reachable_architecture_usage_count_excluding_root: [14, 14]
resolved_directed_semantic_connection_count: [33, 33]
generated_support_boundary_delegation_count: 21
raw_port_connection_count: [43, 43]
containment_depth_beneath_root: [2, 2]
semantic_responsibility_layer_count: 1
root_system_usage_count: 1
weakly_connected_region_count: 1
requires_stateful_behavior: true
requires_multiple_state_or_decision_owners: true
requires_fault_behavior: true
requires_priority_behavior: true
requires_recovery_behavior: true
requires_composition_obligations: true
executable_profile: false
---

# Power-and-Propulsion Availability Supervisor

## Synopsis

NEED-01: A single forest-fire observation drone has a selected battery, power-management equipment, a charger, and an explicit four-engine configuration, but the seed provides no policy for deciding whether a propulsion-power enable command may be issued from qualitative equipment evidence.

PURPOSE-01: The system shall obtain and analyze a finite qualitative battery observation, assess selected power, charging, engine-group, and configuration evidence, manage a drone-control enable demand, and issue only a fail-closed propulsion-power command and an explanatory availability report.

SCOPE-01: The primary controlled purpose is power-and-propulsion availability for enablement, not sortie eligibility, observation acquisition, data delivery, navigation, obstacle avoidance, or mission authorization. `AVAILABLE_FOR_ENABLE` means only that the selected finite pilot policy is satisfied; it is not a claim of thrust sufficiency, controllability, endurance, or safe flight.

## Evidence and claim classes

### Handbook-derived design controls

HB-01: FAA/NASA-derived methodology requires the need and boundary before internal allocation, explicit assumptions and responsibility, implementation-independent behavior, alternatives, traceability, nominal and off-nominal scenarios, objective pass criteria, and separate verification and validation. These are design-process controls, not drone facts.

HB-02: A credited semantic usage must derive an owner-local fact rather than copy, bundle, rename, or route data. Every significant model element must trace to this abstract or carry a specific generated-support justification.

### Seed-grounded facts

SRC-FACT-01: The frozen seed identifies one forest-fire observation drone, selects a long-distance battery variant, and explicitly describes obtaining and analyzing qualitative battery status and making that status available to drone control.

SRC-FACT-02: The seed names a charger, power-management module, drone-control unit, landing gear, navigation equipment, radio equipment, sensors, frame elements, four arms, four rotors, and four engines with alternating clockwise and counterclockwise propeller kinds.

SRC-FACT-03: The four-engine and alternating-kind configuration is structural evidence only. The seed establishes no engine health flow, power sufficiency, redundancy, controllability, flight dynamics, or performance.

SRC-FACT-04: The seed does not enumerate battery-status values or define validity, freshness, charging interlocks, demand events, engine availability, priority, initialization, fault propagation, command acknowledgment, or recovery policy.

### Pilot abstractions and assumptions

ASM-01: The surrounding integration environment, represented by CTX-01 through CTX-05, is responsible for presenting one complete finite input snapshot per discrete logical evaluation. Logical evaluations support deterministic model analysis and make no physical timing, scheduling, or latency claim.

ASM-02: CTX-02 through CTX-04 are responsible for the declared validity and freshness tags. `VALID` and `CURRENT` mean only admitted by this pilot policy; they do not establish measurement truth or hardware performance.

ASM-03: CTX-01 is responsible for issuing exactly one `ControlEvent` value per evaluation. Event mutual exclusion is a selected interface convention because the seed defines no human actor or control protocol.

ASM-04: CTX-05 is responsible for reporting one `ActuationFeedback` value per evaluation. `ENABLED_CONFIRMED` and `DISABLED_CONFIRMED` are abstract acknowledgments, not proof that engines generate thrust or that physical power changed.

ASM-05: The finite evidence alphabets and exact acceptance, priority, initialization, and recovery rules below are Designer-selected abstractions needed for exhaustive analysis; none is a source-defined hardware policy.

ASM-06: Missing or unusable information is represented by `UNKNOWN`, `UNAVAILABLE`, `INVALID`, or `STALE`, as applicable, rather than by an absent interaction. This closes the finite boundary partitions without prescribing transport.

ASM-07: CTX-01 must interpret `AVAILABLE_FOR_ENABLE` and every enable command only as results of this abstract policy and must not treat them as observation permission, mission authority, safety approval, or physical performance assurance.

## Goals

GOAL-01: The system shall initialize and fail closed: an unqualified battery observation, any rejected power/propulsion/charging evidence, an active fault, a closed recovery gate, no active demand, an accepted disable or recovery event, or an unconfirmed initial state shall prevent `ENABLE_NEW` and `ENABLE_HOLD`. Pass criterion: bounded analysis finds no counterexample over the complete admitted partitions.

GOAL-02: The system shall issue an enable command only after a fresh post-recovery enable request, admitted evidence from every assessment owner, an open recovery gate, and a fault-free priority result. Pass criterion: the system composition relation is equivalent to that conjunction on every producer-reachable valuation.

GOAL-03: The system shall deterministically expose one limiting cause using the fixed cause and action priorities. Pass criterion: every unavailable producer-reachable valuation has exactly one cause and no available valuation has a non-`NONE` cause.

GOAL-04: The system shall distribute retained state across demand, recovery, and command-interlock owners and distribute current decisions across the ten other owners. Pass criterion: owner-local contracts and analyzer results demonstrate a nonidentity derivation for every PART-01 through PART-13.

GOAL-05: A fault shall invalidate the pre-fault demand; fault clearance and acknowledgment shall reopen recovery but shall not restore enablement until CTX-01 issues a new request. Pass criterion: all recovery scenarios show `DISABLE` from the initiating fault through acknowledgment and until a fresh request completes the request-to-command pipeline.

## Operational context and exact boundary

CTX-01: The drone-control client is outside the system. It supplies enable, disable, and recovery-acknowledgment events and receives the availability report. This contextual role is inferred from the seed's drone-control equipment and battery-status flow.

CTX-02: The battery and power-status source is outside the system. It supplies the qualitative battery observation and power-management evidence; the system neither measures electrochemical state nor controls charging physics.

CTX-03: The engine and configuration evidence source is outside the system. It supplies two engine-group snapshots and a structural configuration snapshot without asserting their truth or any flight consequence.

CTX-04: The charging context source is outside the system. It reports whether the named charger is disconnected, connected idle, charging, or unknown; charging control remains external.

CTX-05: The power-and-propulsion actuation recipient is outside the system. It receives the abstract power command and supplies acknowledgment feedback; downstream electrical switching and engine actuation are not modeled.

CTX-06: The forest-fire environment provides domain context only and has no direct modeled interaction. No fire property, observation state, or sortie state organizes this system's policy.

BOUND-01: Inside the boundary are qualitative battery admission and analysis, power-management assessment, two engine-group assessments, four-engine configuration assessment, propulsion-evidence composition, charging interlock assessment, enable-demand lifecycle, fault/action priority, recovery qualification, availability decision, and power-command interlock.

BOUND-02: Outside the boundary are the battery, charger, power-management hardware, engines, rotors, arms, drone-control implementation, physical actuation, observation payload, communications, navigation, obstacle response, landing control, flight dynamics, and all fire-analysis or mission functions.

MON-01: `batteryObservation`, supplied by CTX-02, has type `BatteryObservation = {quality: ADEQUATE | LIMITED | DEPLETED | UNKNOWN, validity: VALID | INVALID, freshness: CURRENT | STALE}`. The four quality values are a downstream finite abstraction of the seed's unenumerated qualitative status.

MON-02: `powerManagementEvidence`, supplied by CTX-02, has type `PowerEvidence = {condition: NOMINAL | DEGRADED | UNAVAILABLE | UNKNOWN, validity: VALID | INVALID, freshness: CURRENT | STALE}`.

MON-03: `oddEngineGroupEvidence`, supplied by CTX-03, has type `EnginePairEvidence = {first, second: NOMINAL | NON_NOMINAL | UNAVAILABLE | UNKNOWN, validity: VALID | INVALID, freshness: CURRENT | STALE}` and represents engines 1 and 3 only as distinct named positions.

MON-04: `evenEngineGroupEvidence`, supplied by CTX-03, has the same `EnginePairEvidence` type and represents engines 2 and 4 only as distinct named positions.

MON-05: `configurationEvidence`, supplied by CTX-03, has type `ConfigurationEvidence = {engineCount: FOUR | OTHER | UNKNOWN, alternatingKinds: MATCHES_SOURCE | DOES_NOT_MATCH | UNKNOWN, validity: VALID | INVALID, freshness: CURRENT | STALE}`. `MATCHES_SOURCE` means structural concordance only.

MON-06: `chargerEvidence`, supplied by CTX-04, has type `ChargerEvidence = {coupling: DISCONNECTED | CONNECTED_IDLE | CHARGING | UNKNOWN, validity: VALID | INVALID, freshness: CURRENT | STALE}`.

MON-07: `controlEvent`, supplied by CTX-01, has type `ControlEvent = NONE | REQUEST_ENABLE | REQUEST_DISABLE | ACKNOWLEDGE_RECOVERY`.

MON-08: `actuationFeedback`, supplied by CTX-05, has type `ActuationFeedback = DISABLED_CONFIRMED | ENABLED_CONFIRMED | UNKNOWN` and contains no physical-performance claim.

CTRL-01: `propulsionPowerCommand`, received by CTX-05, has type `PowerCommand = DISABLE | ENABLE_NEW | ENABLE_HOLD`. `ENABLE_NEW` marks the first enable command of one admitted demand; `ENABLE_HOLD` maintains that admitted demand without creating another fresh command cycle.

CTRL-02: `availabilityReport`, received by CTX-01, has type `AvailabilityReport = {decision: UNAVAILABLE | AVAILABLE_FOR_ENABLE, cause: NONE | BATTERY | POWER_MANAGEMENT | ODD_ENGINE_GROUP | EVEN_ENGINE_GROUP | CONFIGURATION | CHARGER | RECOVERY | NO_DEMAND | OPERATOR_DISABLE, demand: IDLE | REQUESTED | ACTIVE, recovery: NORMAL | QUARANTINED | AWAITING_ACK}`. Copied demand/recovery fields are observable context but earn PART-12 no owner credit.

TYPE-01: `AdmissionAssessment` has exactly three admissible values: `ADMITTED/NONE`, `REJECTED/INVALID`, and `REJECTED/STALE`. A `QualifiedBatteryObservation` pairs one of those values with the unchanged qualitative status; carrying quality earns PART-01 no credit.

TYPE-02: `BatteryAssessment` has admissible values `READY/NONE` and `NOT_READY` paired with `INVALID`, `STALE`, `LIMITED`, or `DEPLETED_OR_UNKNOWN`. `PowerAssessment`, each `EnginePairAssessment`, `ConfigurationAssessment`, and `ChargingAssessment` similarly pair a readiness Boolean with one owner-local prioritized cause.

TYPE-03: The power-management cause alphabet is `NONE | INVALID | STALE | CONDITION`; the two engine-pair cause alphabets are `NONE | INVALID | STALE | FIRST_POSITION | SECOND_POSITION`; the configuration alphabet is `NONE | INVALID | STALE | ENGINE_COUNT | ALTERNATION`; and the charging alphabet is `NONE | INVALID | STALE | CONNECTED_IDLE | CHARGING_OR_UNKNOWN`.

TYPE-04: `PropulsionAssessment` has admissible values `READY/NONE` and `NOT_READY` paired with `ODD_ENGINE_GROUP`, `EVEN_ENGINE_GROUP`, or `CONFIGURATION`. It is a policy composition over evidence, not a conclusion about propulsion sufficiency.

TYPE-05: `DemandPhase = IDLE | REQUESTED | ACTIVE`, `PriorityDirective = INHIBIT | DISABLE | RECOVER | ENABLE | HOLD`, `RecoveryPhase = NORMAL | QUARANTINED | AWAITING_ACK`, `RecoveryGate = OPEN | CLOSED`, and `CommandPhase = DISABLED | ENABLE_PENDING | ENABLED` are finite internal state or decision concepts.

TYPE-06: `RequestContext` contains PART-09's pre-evaluation demand phase and the current candidate event. `FaultActionSummary` contains `fault: CLEAR | ACTIVE`, one cause from `NONE | BATTERY | POWER_MANAGEMENT | ODD_ENGINE_GROUP | EVEN_ENGINE_GROUP | CONFIGURATION | CHARGER`, and one priority directive. Only `CLEAR/NONE` and `ACTIVE/non-NONE` fault/cause pairs are admissible.

TYPE-07: `AvailabilityDecision` contains `UNAVAILABLE | AVAILABLE_FOR_ENABLE` and the CTRL-02 cause alphabet. Its admissible pairs are `AVAILABLE_FOR_ENABLE/NONE` and `UNAVAILABLE` paired with any non-`NONE` cause.

## Selected semantic architecture and ownership

PART-01: Battery Observation Admission Owner derives whether MON-01 is admitted from validity and freshness and selects `INVALID` before `STALE` when both are rejected. It carries qualitative status to PART-02 without receiving credit for that carried field.

PART-02: Battery Capacity Assessment Owner combines PART-01's admission result with qualitative status to derive battery readiness and one local cause. It neither estimates energy, endurance, voltage, nor charging need.

PART-03: Power-Management Assessment Owner derives power-management readiness and a local cause from MON-02 using the finite policy; it does not control or diagnose physical power hardware.

PART-04: Odd-Position Engine-Group Assessor jointly evaluates the engine-1 and engine-3 evidence positions and derives one group result with first-position cause priority. It does not assert redundancy or thrust.

PART-05: Even-Position Engine-Group Assessor jointly evaluates the engine-2 and engine-4 evidence positions and derives one group result with first-position cause priority local to that group.

PART-06: Four-Engine Configuration Assessor derives structural concordance from count, alternating-kind indication, validity, and freshness. It does not consume engine-condition evidence or infer flight behavior.

PART-07: Propulsion Evidence Composer combines PART-04 through PART-06 results into one propulsion-policy assessment and selects odd group before even group before configuration when multiple local results reject.

PART-08: Charging Interlock Assessor derives whether charging context admits enablement and selects a local invalid, stale, connected-idle, or charging/unknown cause. Only valid, current `DISCONNECTED` is locally ready.

PART-09: Enable-Demand Lifecycle Owner retains `IDLE`, `REQUESTED`, or `ACTIVE`; distinguishes a fresh request from a repeated request; consumes the accepted priority directive and actuation acknowledgment; and clears demand on every fault inhibit or accepted disable.

PART-10: Fault and Action Priority Resolver derives the current fault summary and accepted directive from the four assessment domains and PART-09's request context. It owns both cross-domain fault-cause priority and action priority but no retained state.

PART-11: Recovery Qualification Owner retains `NORMAL`, `QUARANTINED`, or `AWAITING_ACK`, closes immediately on a fault, and reopens only on a fault-free accepted acknowledgment. Reopening does not restore demand.

PART-12: Availability Decision Owner composes the four assessments, pre-evaluation demand phase, current fault/action summary, and recovery qualification into a current availability decision and detailed cause. It also publishes CTRL-02, with copied state fields explicitly uncredited.

PART-13: Power Command Interlock Owner retains `DISABLED`, `ENABLE_PENDING`, or `ENABLED`; emits `ENABLE_NEW` exactly once when a newly available demand enters its enable sequence; emits `ENABLE_HOLD` while that demand remains admitted; and returns to `DISABLE` immediately when any independent interlock input rejects.

OWN-01: Retained state is distributed across PART-09, PART-11, and PART-13. Current decision ownership is distributed across PART-01 through PART-08, PART-10, and PART-12. No usage receives semantic credit for copied report fields, carried qualitative status, carried candidate events, or routing.

## Complete typed directed semantic interaction inventory

INT-01: CTX-02 sends `BatteryObservation` through MON-01 to PART-01 for admission assessment.

INT-02: PART-01 sends `QualifiedBatteryObservation` to PART-02 for qualitative capacity assessment; the admission result is derived and the qualitative field is carried uncredited.

INT-03: CTX-02 sends `PowerEvidence` through MON-02 to PART-03.

INT-04: CTX-03 sends the engine-1/engine-3 `EnginePairEvidence` through MON-03 to PART-04.

INT-05: CTX-03 sends the engine-2/engine-4 `EnginePairEvidence` through MON-04 to PART-05.

INT-06: CTX-03 sends `ConfigurationEvidence` through MON-05 to PART-06.

INT-07: PART-04 sends its odd-position `EnginePairAssessment` to PART-07.

INT-08: PART-05 sends its even-position `EnginePairAssessment` to PART-07.

INT-09: PART-06 sends `ConfigurationAssessment` to PART-07.

INT-10: CTX-04 sends `ChargerEvidence` through MON-06 to PART-08.

INT-11: CTX-01 sends `ControlEvent` through MON-07 to PART-09 as the candidate lifecycle event.

INT-12: CTX-05 sends `ActuationFeedback` through MON-08 to PART-09 for the `REQUESTED` versus `ACTIVE` distinction.

INT-13: PART-09 sends `RequestContext`, containing its pre-evaluation phase and current candidate event, to PART-10; carrying the candidate event earns no owner credit.

INT-14: PART-02 sends `BatteryAssessment` to PART-10 for fault and priority resolution.

INT-15: PART-03 sends `PowerAssessment` to PART-10 for fault and priority resolution.

INT-16: PART-07 sends `PropulsionAssessment` to PART-10 for fault and priority resolution.

INT-17: PART-08 sends `ChargingAssessment` to PART-10 for fault and priority resolution.

INT-18: PART-10 sends the accepted `PriorityDirective` to PART-09 for its state transition.

INT-19: CTX-05 sends the same MON-08 `ActuationFeedback` snapshot to PART-13 for command-phase ownership; this distinct consumer does not add a boundary quantity.

INT-20: PART-10 sends `FaultActionSummary` to PART-11 for immediate fault closure and acknowledgment qualification.

INT-21: PART-02 sends `BatteryAssessment` directly to PART-12 so the composition guarantee depends on the local owner rather than a central raw-evidence recomputation.

INT-22: PART-03 sends `PowerAssessment` directly to PART-12 for the same composition purpose.

INT-23: PART-07 sends `PropulsionAssessment` directly to PART-12 for the same composition purpose.

INT-24: PART-08 sends `ChargingAssessment` directly to PART-12 for the same composition purpose.

INT-25: PART-09 sends its pre-evaluation `DemandPhase` to PART-12 so no request, requested, and active paths remain distinct.

INT-26: PART-10 sends `FaultActionSummary` to PART-12 so same-evaluation fault, disable, and recovery priority can force unavailable.

INT-27: PART-11 sends `{RecoveryPhase, RecoveryGate}` to PART-12.

INT-28: PART-12 sends `AvailabilityDecision` to PART-13 as the principal command precondition.

INT-29: PART-09 sends pre-evaluation `DemandPhase` to PART-13 as an independent no-demand interlock.

INT-30: PART-11 sends `RecoveryGate` to PART-13 as an independent recovery interlock.

INT-31: PART-10 sends `PriorityDirective` to PART-13 so current `INHIBIT`, `DISABLE`, or `RECOVER` cannot be masked by stale availability state.

INT-32: PART-13 sends `PowerCommand` through CTRL-01 to CTX-05.

INT-33: PART-12 sends `AvailabilityReport` through CTRL-02 to CTX-01.

METRIC-01: The Model shall realize exactly 13 credited semantic Thread usages for PART-01 through PART-13, exactly 33 directed semantic connections corresponding one-to-one with INT-01 through INT-33, exactly 29 named nontrivial contract cases, exactly 10 scenario families, one semantic responsibility layer, one root System, and one weakly connected semantic region.

SUPPORT-01: The authorized physical mapping adds exactly one behavior-free generated-support Process containing the 13 sibling semantic Threads at depth two, for 14 reachable non-root usages. The ten unique root quantities require ten System-to-Process boundary segments, and their eleven owner endpoints require eleven Process-to-Thread boundary segments because MON-08 fans out to PART-09 and PART-13. Together with the 22 sibling-Thread segments for non-boundary INT paths, the complete source shall contain exactly 21 uncredited generated-support boundary segments and exactly 43 raw `PortConnection` declarations. INT-01 through INT-33 remain the logical semantic inventory and shall not be declared again as duplicate physical endpoint pairs.

SUPPORT-02: Root, Process, the 21 boundary segments, finite Data definitions, trace comments, analyzer scaffolding, and the overview view earn no semantic usage or interaction credit and may introduce no additional behavior owner, route, or controlled output.

SUPPORT-03: Generated records inspected by GUMBO may use direct `attribute` fields, and owner-local state may use trusted `state`, `initialize`, `compute_cases`, and `In(state)` forms. Such representation and state-publication support earns no additional owner, interaction, or case credit and establishes no scheduler or execution semantics.

## Selected policy and initialization

POL-01: Admission and local-cause priority is `INVALID` before `STALE`, followed by the owner's ordered content causes. A local result is ready only when validity is `VALID`, freshness is `CURRENT`, and every owner-specific content predicate is satisfied.

POL-02: Battery readiness requires admitted `ADEQUATE`; power-management readiness requires admitted `NOMINAL`; each engine-group readiness requires both admitted engine positions `NOMINAL`; configuration readiness requires admitted `FOUR` and `MATCHES_SOURCE`; and charging readiness requires admitted `DISCONNECTED`.

POL-03: PART-07's propulsion cause priority is odd engine group before even engine group before configuration. PART-10's global fault cause priority is charger before power management before battery before odd engine group before even engine group before configuration. These are deterministic reporting policies, not severity rankings.

POL-04: PART-10's action priority is any active fault `INHIBIT`, then `REQUEST_DISABLE`, then fault-free `ACKNOWLEDGE_RECOVERY`, then `REQUEST_ENABLE`, then `NONE/HOLD`. Fault priority therefore dominates a coincident disable or acknowledgment; disable dominates recovery and enable only because MON-07 is finite and mutually exclusive.

POL-05: A fresh enable event is accepted only from demand `IDLE`. A repeated enable event while `REQUESTED` or `ACTIVE` does not create a new enable cycle. `INHIBIT`, `DISABLE`, and `RECOVER` clear demand to `IDLE`; consequently neither a pre-fault demand nor a demand interrupted by a recovery action is restored automatically.

POL-06: PART-11 closes on the same evaluation as an active fault, advances from `QUARANTINED` to `AWAITING_ACK` only after the fault clears, and advances to `NORMAL/OPEN` only on a fault-free accepted `RECOVER`. A recurrent fault at either recovery phase returns to `QUARANTINED/CLOSED`.

POL-07: PART-12 returns `AVAILABLE_FOR_ENABLE/NONE` if and only if all four assessments are ready, the pre-evaluation demand is `REQUESTED` or `ACTIVE`, the fault summary is `CLEAR/NONE`, recovery is `NORMAL/OPEN`, and directive is `ENABLE` or `HOLD`. Every complement is `UNAVAILABLE` with the prioritized cause from POL-03, then `OPERATOR_DISABLE`, `RECOVERY`, or `NO_DEMAND` as applicable.

POL-08: PART-13 may emit an enable command only when PART-12 is available, demand is non-idle, recovery is open, and directive is `ENABLE` or `HOLD`. Every rejected interlock emits `DISABLE` and enters `DISABLED`. Under an admitted interlock, prior `DISABLED` emits `ENABLE_NEW` and enters `ENABLE_PENDING` regardless of same-snapshot feedback; prior `ENABLE_PENDING` or `ENABLED` emits `ENABLE_HOLD`, enters `ENABLED` on `ENABLED_CONFIRMED`, enters `ENABLE_PENDING` on `DISABLED_CONFIRMED`, and otherwise retains its prior phase.

INIT-01: PART-09 initializes to `IDLE`, PART-11 to `AWAITING_ACK/CLOSED`, PART-13 to `DISABLED`, CTRL-01 to `DISABLE`, and CTRL-02 to `UNAVAILABLE/RECOVERY/IDLE/AWAITING_ACK`. Startup therefore requires a fault-free acknowledgment followed by a fresh enable request.

## Exact nontrivial contract-case inventory and finite partition closure

CASE-01: PART-01 returns `ADMITTED/NONE` exactly when MON-01 is `VALID` and `CURRENT`.

CASE-02: PART-01 returns rejected on the complement of CASE-01, selecting `INVALID` whenever validity is invalid and otherwise `STALE`. CASE-01 and CASE-02 are total, disjoint, and deterministic over all 16 MON-01 values.

CASE-03: PART-02 returns `READY/NONE` exactly for `ADMITTED` plus `ADEQUATE`.

CASE-04: PART-02 returns not ready on the complement of CASE-03, preserving PART-01's invalid/stale cause before selecting `LIMITED` or `DEPLETED_OR_UNKNOWN`. CASE-03 and CASE-04 cover all 12 admissible qualified-battery tuples.

CASE-05: PART-03 returns `READY/NONE` exactly for valid, current, nominal MON-02.

CASE-06: PART-03 returns not ready on the complement of CASE-05 with priority `INVALID`, `STALE`, then `CONDITION`. CASE-05 and CASE-06 cover all 16 MON-02 values.

CASE-07: PART-04 returns `READY/NONE` exactly for valid, current MON-03 with both engine positions nominal.

CASE-08: PART-04 returns not ready on the complement of CASE-07 with priority `INVALID`, `STALE`, `FIRST_POSITION`, then `SECOND_POSITION`. CASE-07 and CASE-08 cover all 64 MON-03 values.

CASE-09: PART-05 returns `READY/NONE` exactly for valid, current MON-04 with both engine positions nominal.

CASE-10: PART-05 returns not ready on the complement of CASE-09 with priority `INVALID`, `STALE`, `FIRST_POSITION`, then `SECOND_POSITION`. CASE-09 and CASE-10 cover all 64 MON-04 values.

CASE-11: PART-06 returns `READY/NONE` exactly for valid, current `FOUR/MATCHES_SOURCE` MON-05.

CASE-12: PART-06 returns not ready on the complement of CASE-11 with priority `INVALID`, `STALE`, `ENGINE_COUNT`, then `ALTERNATION`. CASE-11 and CASE-12 cover all 36 MON-05 values.

CASE-13: PART-07 returns `READY/NONE` exactly when PART-04, PART-05, and PART-06 are all ready.

CASE-14: PART-07 returns not ready on the complement of CASE-13 and selects odd group, then even group, then configuration. CASE-13 and CASE-14 cover all 125 producer-reachable combinations of the five admissible outputs from each of PART-04, PART-05, and PART-06.

CASE-15: PART-08 returns `READY/NONE` exactly for valid, current, disconnected MON-06.

CASE-16: PART-08 returns not ready on the complement of CASE-15 with priority `INVALID`, `STALE`, `CONNECTED_IDLE`, then `CHARGING_OR_UNKNOWN`. CASE-15 and CASE-16 cover all 16 MON-06 values.

CASE-17: PART-09 commits `IDLE` when directive is `INHIBIT`, `DISABLE`, or `RECOVER`, regardless of prior demand or feedback; this is the demand-invalidation branch.

CASE-18: In the complement of CASE-17, PART-09 commits `ACTIVE` when a non-idle demand receives `ENABLED_CONFIRMED`, or retains `ACTIVE` while feedback does not confirm disable.

CASE-19: In the complement of CASE-17 and CASE-18, PART-09 commits `REQUESTED` exactly when prior demand is non-idle or directive is `ENABLE`; otherwise it commits `IDLE`. CASE-17 through CASE-19 are total, pairwise disjoint, and deterministic over all 45 prior-phase/directive/feedback tuples; candidate event carriage adds no state branch.

CASE-20: PART-10 returns `ACTIVE/<highest-priority fault cause>/INHIBIT` whenever any of the four input assessments is not ready.

CASE-21: With all assessments ready, candidate `REQUEST_DISABLE` returns `CLEAR/NONE/DISABLE`.

CASE-22: With all assessments ready, candidate `ACKNOWLEDGE_RECOVERY` returns `CLEAR/NONE/RECOVER`.

CASE-23: With all assessments ready, candidate `REQUEST_ENABLE` returns `CLEAR/NONE/ENABLE` only when the published demand is `IDLE`; a repeated request maps to `CLEAR/NONE/HOLD` and creates no fresh cycle.

CASE-24: With all assessments ready and candidate `NONE`, PART-10 returns `CLEAR/NONE/HOLD`. CASE-20 through CASE-24 cover every producer-admissible assessment/request tuple and make fault-over-event priority explicit.

CASE-25: PART-11 returns `QUARANTINED/CLOSED` on any active fault, independent of prior recovery state or candidate recovery action.

CASE-26: With a clear fault, PART-11 returns `AWAITING_ACK/CLOSED` from prior `QUARANTINED`, or from prior `AWAITING_ACK` without directive `RECOVER`.

CASE-27: With a clear fault, PART-11 returns `NORMAL/OPEN` from prior `NORMAL`, or from prior `AWAITING_ACK` with directive `RECOVER`. CASE-25 through CASE-27 cover all 105 combinations of three prior recovery phases, seven admissible fault/cause pairs, and five directive values, and flag inconsistent fault/cause/directive combinations as producer-unreachable.

CASE-28: PART-12 returns `AVAILABLE_FOR_ENABLE/NONE` exactly under the conjunction in POL-07.

CASE-29: PART-12 returns `UNAVAILABLE` on the complement of CASE-28 and selects exactly one cause in this order: active fault cause, `OPERATOR_DISABLE` for directive `DISABLE`, `RECOVERY` for closed gate or directive `RECOVER`, then `NO_DEMAND` for `IDLE`. Any remaining complement contradicts upstream producer guarantees and shall be reported as producer-unreachable. CASE-28 and CASE-29 close fresh-request, repeated-request, same-evaluation disable, fault, recovery, and no-demand paths.

PARTITION-01: The complete named case count is exactly 29: two cases for each PART-01 through PART-08, three for PART-09, five for PART-10, three for PART-11, and two for PART-12. PART-13's three-state command relation is specified by BEH-01 and earns no additional CASE count.

## Required behavior and composition obligations

BEH-01: PART-13 shall implement the complete three-state relation in POL-08. Verification: enumerate every prior `CommandPhase`, admitted availability decision, demand phase, recovery gate, priority directive, and actuation-feedback tuple. Pass criterion: exactly one `ENABLE_NEW` occurs per uninterrupted admitted demand, only admitted continuations produce `ENABLE_HOLD`, every rejected interlock produces `DISABLE`, and all next states are unique.

BEH-02: A fresh request shall require two observable logical stages: the event is accepted while the published phase is `IDLE`, then a later evaluation publishes `REQUESTED` and may become available. Verification: multi-step trace analysis. Pass criterion: the request-evaluation output remains `DISABLE`, and no command precedes the published requested phase.

BEH-03: An active fault or accepted disable shall force same-evaluation `UNAVAILABLE` and `DISABLE` even if prior demand, recovery, availability, or command state was enabling. Verification: inspect INT-26, INT-30, INT-31 and analyze every prior-state combination. Pass criterion: no stale state masks a current inhibit.

BEH-04: Fault recovery shall discard prior demand, require a clear-fault transition to `AWAITING_ACK`, require a later fault-free acknowledgment to open recovery, and require a still later fresh request before enablement. Verification: consecutive-state analysis. Pass criterion: no pre-fault request or acknowledgment evaluation emits an enable command.

BEH-05: CTRL-02 shall report PART-12's decision and selected cause, plus the published demand and recovery phases received from their owners. Verification: output-contract inspection. Pass criterion: decision/cause equals PART-12's derived result, carried fields equal their owning inputs, and no copied field is claimed as an additional derivation.

COMP-01: The system-level enable guarantee shall be compositionally supported by PART-01-to-PART-08 assessment guarantees, PART-09 demand guarantees, PART-10 priority guarantees, PART-11 recovery guarantees, PART-12 availability guarantees, and PART-13 command guarantees. Verification: dependency inspection and factorized bounded analysis. Pass criterion: composed owner outputs and an independently structured boundary-policy oracle agree for CTRL-01 and CTRL-02 on all analyzed producer-reachable valuations.

COMP-02: Fault propagation shall follow local assessor to PART-10 to PART-11/PART-12/PART-13 to CTRL-01/CTRL-02, while direct assessment flows to PART-12 prevent PART-10 from becoming a substitute owner. Verification: trace and connection inspection. Pass criterion: every path resolves with compatible direction/type and each path is necessary to at least one CASE, BEH, FAULT, or report obligation.

COMP-03: Priority composition shall preserve both levels: owner-local content-cause ordering, PART-07 propulsion ordering, PART-10 global fault and action ordering, and PART-12 report-cause ordering. Verification: bounded multi-fault analysis. Pass criterion: every declared priority pair has a witness and all losing faults remain visible in their owner-local outputs even though one cause is reported.

## Risks, faults, degraded behavior, and recovery

RISK-01: If invalid, stale, limited, unavailable, non-nominal, structurally discordant, connected-charger, or unknown evidence were admitted, an enable command could be issued outside the selected policy. No likelihood or physical severity is asserted.

FAULT-01: PART-01 through PART-08 shall reject their assigned complement cases; PART-10 shall propagate the prioritized fault; and PART-11 through PART-13 shall close recovery, report unavailable, and command disable on the same evaluation. Verification: inject each local rejected class independently. Pass criterion: each injection reaches CTRL-01 as `DISABLE` and CTRL-02 with the owning external cause class.

RISK-02: If fault clearance restored a pre-fault demand, the system could resume enablement without a new drone-control request.

FAULT-02: PART-09 shall clear demand on `INHIBIT`, and PART-11 shall require fault-free acknowledgment before reopening; acknowledgment shall not recreate demand. Verification: multi-step recovery analysis. Pass criterion: CTRL-01 remains `DISABLE` until a post-acknowledgment `REQUEST_ENABLE` advances to a published requested phase.

RISK-03: If retained availability or command state outranked a current disable, fault, or recovery condition, the system could continue an enable command for one stale evaluation.

FAULT-03: PART-12 and PART-13 shall independently receive the current priority and recovery information needed to force unavailable and disable. Verification: enumerate all prior availability and command states against current `INHIBIT`, `DISABLE`, `RECOVER`, and closed-gate inputs. Pass criterion: every such valuation emits `DISABLE` with no `ENABLE_HOLD` leak.

RISK-04: Repeated enable events or delayed acknowledgments could create repeated `ENABLE_NEW` commands for one continuous demand.

FAULT-04: PART-09 shall suppress non-fresh requests, and PART-13 shall retain command phase so only the first admitted transition from `DISABLED` emits `ENABLE_NEW`. Verification: consecutive-state analysis. Pass criterion: an uninterrupted request/acknowledgment trace contains at most one `ENABLE_NEW` before disable or fault rearm.

## Ten bounded scenario families

SCN-01: Startup remains fail closed. From INIT-01 with all evidence ready and events `NONE`, then `ACKNOWLEDGE_RECOVERY`, then `NONE`, the expected reports are initially unavailable for recovery, then recovery opens, but command stays disabled because demand is idle. Verification/pass: no enable command occurs in any startup step.

SCN-02: Nominal fresh enable handshake. After startup recovery is open, issue `REQUEST_ENABLE`, then `NONE` with disabled feedback, then `NONE` with enabled feedback. The request step remains disabled, the published requested step emits exactly one `ENABLE_NEW`, and acknowledgment advances demand/command to active/enabled with `ENABLE_HOLD`. Verification/pass: the ordered three-step outputs and states match exactly.

SCN-03: No-demand readiness. With recovery open and all evidence ready, hold `NONE` and disabled feedback for at least two steps. Verification/pass: CTRL-02 reports `UNAVAILABLE/NO_DEMAND` and CTRL-01 stays `DISABLE`.

SCN-04: Duplicate request and command-cycle suppression. After a demand is requested or active, issue `REQUEST_ENABLE` for at least two additional steps. Verification/pass: PART-10 maps repeats to `HOLD`, PART-09 does not create a fresh lifecycle, and PART-13 emits no second `ENABLE_NEW`.

SCN-05: Operator disable priority. From active enablement with all evidence ready, issue `REQUEST_DISABLE`. Verification/pass: the same evaluation reports `UNAVAILABLE/OPERATOR_DISABLE`, emits `DISABLE`, and commits demand and command state to idle/disabled.

SCN-06: Battery and power-management faults. In separate variants change only battery validity, freshness, or quality, or power-management validity, freshness, or condition. Verification/pass: the assigned owner rejects, PART-10 selects the applicable cause under POL-03, recovery closes, demand clears, and command disables.

SCN-07: Engine-group and configuration faults. In separate variants reject engine 1, engine 3, engine 2, engine 4, engine count, or alternating-kind concordance. Verification/pass: the correct local owner and PART-07 cause are observed, command disables, and no thrust, redundancy, or controllability conclusion appears.

SCN-08: Charging interlock and concurrent-fault priority. Variant A presents valid/current `CONNECTED_IDLE`; variant B presents `CHARGING`; variant C combines charging rejection with power, battery, and engine rejection. Verification/pass: all variants disable and variant C reports `CHARGER` while retaining each losing local fault output.

SCN-09: Fault clearance without acknowledgment. Start active, inject any fault, restore all evidence, and hold `NONE` for two steps. Verification/pass: demand remains `IDLE`, recovery progresses only to `AWAITING_ACK/CLOSED`, and every command remains `DISABLE`.

SCN-10: Recovery acknowledgment, recurrent fault, and fresh-request requirement. Variant A clears the fault, acknowledges, then submits a new enable request and completes the nominal pipeline; variant B acknowledges while a fault recurs. Verification/pass: variant A enables only after the post-ack fresh request, while variant B returns to `QUARANTINED/CLOSED/IDLE` and never enables.

## Ownership, coverage, and bounded-analysis audit

AUD-01: PART-01 is a decision owner because 16 battery snapshots collapse into three prioritized admission values; CASE-01, CASE-02, and SCN-06 expose the derived fact.

AUD-02: PART-02 is a decision owner because it composes admission and qualitative status into five admissible battery results; CASE-03 and CASE-04 prevent it from being a carried-status wrapper.

AUD-03: PART-03 derives a prioritized power-management assessment over 16 inputs; PART-04 and PART-05 each jointly derive a two-position group fact over 64 inputs; PART-06 derives count/pattern concordance over 36 inputs. CASE-05 through CASE-12 and SCN-06/SCN-07 expose their separate responsibility traces.

AUD-04: PART-07 maps the complete 125-tuple assessment product to four admissible propulsion results under a distinct group priority, and PART-08 maps 16 charging inputs to its local results. CASE-13 through CASE-16 and SCN-07/SCN-08 provide witnesses.

AUD-05: PART-09 owns history-dependent fresh, requested, active, invalidated, and repeated-request behavior over 45 state/directive/feedback tuples. PART-11 independently owns 105 recovery/fault/directive tuples, and PART-13 owns command-cycle history. These are three distinct state domains, not replicated state.

AUD-06: PART-10 owns a many-input fault/action priority that no assessor or state owner derives; PART-12 owns the cross-domain availability/cause decision; PART-13 owns first-versus-held command sequencing. Priority, availability, and command sequencing are nonoverlapping outputs.

AUD-07: Every MON-01 through MON-08 reaches an assigned owner, CTRL-01 and CTRL-02 each have one controlling owner, all 13 usages lie on a boundary-connected behavioral path, and all 33 interactions have a distinct source, destination, type, and behavioral purpose.

AUD-08: Every fresh-request, repeated-request, no-event, same-evaluation disable, active-fault, cleared-fault, acknowledgment, recurrent-fault, no-demand, available, unavailable, command-new, command-hold, and command-disable path is explicitly covered by CASE-17 through CASE-29 or BEH-01.

ANALYSIS-01: The bounded analyzer shall exhaustively enumerate local raw domains of 16, 16, 64, 64, 36, and 16 for MON-01 through MON-06; the 12 admissible PART-02 inputs; the 125 PART-07 producer-product tuples; PART-09's 45 prior-phase/directive/feedback tuples; PART-10's 4,800 producer-admissible assessment/request-context tuples; and PART-11's 105 structurally expressible prior-recovery/fault/directive tuples with producer inconsistencies identified.

ANALYSIS-02: Downstream enumeration shall factor through owner outputs, cover PART-12's 36,000 structurally expressible assessment/demand/fault-action/recovery tuples and PART-13's 2,700 structurally expressible decision/demand/gate/directive/feedback/prior-state tuples, and separately list producer-unreachable inconsistencies. Each owner report shall include gaps, overlaps, output counts, priority witnesses, and nonidentity witnesses.

ANALYSIS-03: End-to-end analysis shall execute the 33 semantic interactions in dependency order, compose the actual owner relations, compare both controlled outputs against an independently structured boundary-policy oracle, and execute all ten multi-step scenario families. A centrally recomputed output predicate is comparison evidence, not owner-credit evidence.

## Objective pass criteria

PASS-01: Structural pass requires exactly 13 semantic Thread usages, 33 resolved directed semantic interactions matching INT-01 through INT-33, one root System, one behavior-free generated-support Process, 14 reachable non-root usages, depth two, 21 uncredited generated-support boundary segments, exactly 43 raw `PortConnection` declarations, one semantic responsibility layer, and one weakly connected semantic region. The 43 declarations shall decompose as ten System-to-Process boundary segments, eleven Process-to-Thread boundary segments, and 22 sibling-Thread segments, with no duplicate endpoint pair or behavior-free route padding.

PASS-02: Behavioral pass requires exactly 29 nontrivial named CASE clauses, the PART-13 BEH-01 relation, safe initialization, all BEH and FAULT obligations, three retained-state owners, multiple decision owners, and explicit priority, fault propagation, recovery, and composition obligations.

PASS-03: Partition pass requires every declared finite relation to be total, pairwise disjoint, deterministic, and nonidentity on its admitted domain, with all producer-unreachable values identified. There shall be zero unexpected gaps, overlaps, mismatches, or invariant violations.

PASS-04: Scenario pass requires all ten families to pass with bounded witnesses, including startup, fresh request, repeated request, same-evaluation disable, each owner-local fault class, concurrent-fault priority, fault clearance, acknowledgment, recurrent fault, demand invalidation, and post-recovery fresh request.

PASS-05: Trace pass requires every abstract ID to be covered, explicitly informational, assumed, or deferred, and every significant generated component, port, connection, state, contract, and analyzer relation to trace to an ID or carry a specific generated-support justification. Missing coverage and unexplained additions fail.

PASS-06: Verification pass requires architecture-stage and final Sireum/HAMR typechecking, compatible resolved endpoints, exact structural and case counts, successful source-bound analyzer execution, all cases and scenarios reached, and no uncontrolled root output. These checks prove conformance only to the retained abstract and tool semantics.

PASS-07: Validation pass requires Designer review to find the model faithful to the power-and-propulsion availability purpose, exact boundary, selected policy, recovery behavior, scenarios, and claim limits. Mechanical success alone does not establish fitness.

## Diversity determination

DIV-01: The closest baseline is the accepted replicate-1 Hard `Observation-Sortie Eligibility Supervisor`, whose controlled result is `WITHHOLD | PERMIT` for an observation request and whose boundary includes navigation, observation, communication, and obstacle evidence.

DIV-02: This system is not an extension, rename, or repartition of that baseline: it removes observation/sortie, navigation, radio, camera, and obstacle evidence from the policy boundary and instead controls a sequenced propulsion-power command from battery admission, power-management, charger, engine-group, configuration, demand, and actuation-feedback inputs.

DIV-03: The genuine differing dimensions are boundary, state ownership, interaction topology, priority policy, and recovery policy. State belongs to enable-demand, recovery, and command-cycle owners rather than request/recovery/release owners; topology centers on a battery admission chain, engine-pair/configuration composition, charging interlock, and feedback-aware command sink; charger-first/fault-before-disable priority replaces equipment-cause/observation-request priority; and every fault discards demand so acknowledgment must be followed by a fresh request rather than releasing a retained pending request.

## Deferred and prohibited claims

DEF-01: Battery voltage, state of charge, energy, endurance, charging physics, electrical switching, engine health truth, thrust, torque, controllability, redundancy, flight dynamics, and physical timing or latency are deferred and shall not be inferred.

DEF-02: Navigation accuracy, obstacle detection or avoidance, observation acquisition or quality, radio delivery, landing control, return-to-home, sortie eligibility, fire detection/classification/localization/response, mission authority, operational safety, certification, and production readiness are outside scope.

DEF-03: Code generation, application implementation, executable simulation, scheduling, deployment binding, and physical integration are not required because the run has no executable profile.

DEF-04: Formal semantic proof, probabilistic reliability, quantitative likelihood/severity, environmental validation, hardware validation, and performance validation remain not-run. Typechecking, contracts, bounded analysis, scenarios, and visualization shall not be relabeled as evidence for these claims.

## Resolved Model-realization constraints

QMODEL-01: Model review established that MON-08 may be one root and one Process input fanned out through two distinct Process-to-Thread declarations to PART-09 and PART-13. Generation shall preserve the two semantic consumers INT-12 and INT-19 while realizing the exact physical inventory `13 semantic Threads / 33 semantic interactions / 21 generated-support boundary segments / 43 raw PortConnections` without duplicate endpoint pairs.

QMODEL-02: Model review established that PART-09 shall publish request context and demand from `In(demandPhase)`, while PART-11 and PART-13 shall use `In(recoveryPhase)` and `In(commandPhase)` for guards and constrain only their owner-local post-state. This owner-local pre-state mapping shall provide same-evaluation fail closure without a scheduler assumption or a fourth state owner.

QMODEL-03: Model review established that direct-attribute finite records and a factorized source-bound analyzer are realizable. The analyzer shall execute separately named PART-01 through PART-13 owner functions in INT dependency order, retain domain, fiber, case, priority, nonidentity, producer-unreachable, and executed-function evidence, and use an independently structured boundary oracle only to compare CTRL-01 and CTRL-02; it shall not substitute centrally for any owner relation or relabel bounded enumeration as formal proof.
