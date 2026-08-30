---
abstract_id: SA-FOS-HARD-01
domain_seed: 20260813T233942Z-fire-observation-sortie-seed-v1
status: approved-final
campaign_complexity: hard
semantic_usage_count: [13, 13]
semantic_interaction_count: [35, 35]
nontrivial_contract_case_count: [30, 30]
scenario_family_count: [10, 10]
semantic_thread_usage_count: [13, 13]
generated_support_process_count: 1
reachable_architecture_usage_count_excluding_root: [14, 14]
resolved_directed_connection_count: [35, 35]
resolved_directed_semantic_connection_count: [35, 35]
generated_support_boundary_delegation_count: 18
raw_port_connection_count: [53, 53]
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

# Observation-Sortie Eligibility Supervisor

## Synopsis

NEED-01: A single forest-fire observation drone has named energy, navigation, radio, camera, obstacle-sensing, and propulsion equipment, but the seed supplies no policy for deciding when observation service may proceed. The modeled system will provide a bounded, implementation-independent eligibility decision from finite evidence without controlling flight or interpreting fire imagery.

PURPOSE-01: The system shall accept one operator request stream and six equipment-evidence groups, derive owner-local readiness facts, withhold observation-sortie permission whenever the selected policy is unsatisfied, expose a deterministic limiting cause, and require explicit acknowledgment before recovery from an equipment-evidence fault.

SCOPE-01: The selected primary controlled purpose is observation-sortie eligibility supervision. Observation acquisition, radio transport, navigation, obstacle avoidance, propulsion actuation, charging, landing control, and fire detection or response remain outside the controlled purpose.

## Evidence and claim classes

### Handbook-derived design controls

HB-01: The FAA/NASA-derived methodology requires an explicit need, boundary, responsibility allocation, alternatives, traceability, nominal and off-nominal behavior, assumptions, objective verification criteria, and separate validation. These are process controls for this abstract; they are not facts about drones or forest fires.

HB-02: The methodology requires each credited owner to derive a reviewable local fact, every required behavior to have a pass criterion, and every significant model element to trace to this abstract or carry an explicit generated-support rationale. These controls determine acceptance evidence but do not assert physical performance.

### Seed-grounded facts

SRC-FACT-01: The frozen seed identifies one forest-fire observation drone and explicitly describes obtaining and analyzing qualitative battery status and making that status available to drone control.

SRC-FACT-02: The frozen seed names a long-distance battery variant, charger, power-management module, drone-control unit, GPS, inertial-measurement and barometric navigation equipment, radio communication equipment and antenna, camera, obstacle sensor, landing gear, frame elements, and four engines.

SRC-FACT-03: The frozen seed identifies four rotors, four arms, and four engines with alternating clockwise and counterclockwise propeller kinds; it does not establish propulsion sufficiency, redundancy, controllability, or flight dynamics.

SRC-FACT-04: The frozen seed does not define operators, sortie lifecycle, request semantics, finite evidence values other than an unenumerated qualitative battery status, freshness, validity, priority, fault handling, recovery, observation flow, or mission authority.

### Pilot abstractions and assumptions

ASM-01: Evaluation occurs in discrete logical steps supplied by the surrounding integration environment. The integration environment is responsible for presenting one complete input snapshot per step. This is a deterministic experiment abstraction, not a physical timing or latency claim.

ASM-02: The drone-equipment evidence source is responsible for tagging each evidence item with finite validity and freshness values. `VALID` and `CURRENT` mean only that the item is admitted by this pilot policy; they do not establish sensor truth or performance.

ASM-03: The observation operator is responsible for issuing at most one event from `NONE`, `SUBMIT`, `CANCEL`, or `ACKNOWLEDGE_RECOVERY` in each evaluation step. Mutual exclusion is a selected finite interface convention, not a seed fact.

ASM-04: The pilot introduces finite evidence alphabets and exact readiness rules so exhaustive bounded analysis is possible. The alphabets are abstractions of named equipment availability, not source-defined equipment semantics.

ASM-05: The observation operator is responsible for acknowledging recovery only after reviewing the reported limiting cause. The system checks receipt of acknowledgment, not the quality of that review.

ASM-06: The external drone-control recipient is responsible for treating `WITHHOLD` as no observation-sortie permission and for not interpreting `PERMIT` as a flight-safety, navigation-performance, or mission-authorization guarantee.

ASM-07: Missing evidence is represented by the corresponding finite `UNAVAILABLE` or `UNKNOWN` value rather than by absence of a boundary interaction. This closes every input partition without prescribing transport mechanisms.

## Goals

GOAL-01: The system shall fail closed: initialization, incomplete readiness, an active fault, a closed recovery gate, or the absence of a pending request shall result in `WITHHOLD`. Pass criterion: contract inspection and bounded analysis show no valuation of those conditions that produces `PERMIT`.

GOAL-02: The system shall grant eligibility only for a pending fresh request when all six owner-local readiness results are ready and the recovery gate is open. Pass criterion: the system-level composition guarantee is equivalent to that conjunction.

GOAL-03: The system shall make priority, fault propagation, request state, recovery state, eligibility, and the reported limiting cause deterministic for every finite input and prior-state valuation. Pass criterion: all 30 named cases are total, mutually exclusive within their partitions, and have a single result.

GOAL-04: The system shall retain separate state or decision ownership rather than centrally recomputing local evidence. Pass criterion: the ownership audit, owner-local contracts, connection inventory, and bounded analyzer agree that each of the 13 semantic usages derives its assigned fact.

## Operational context and exact system boundary

CTX-01: The observation operator is outside the system. This role submits, cancels, and acknowledges requests and receives the eligibility-status report; it is introduced by the Designer because the seed defines no human actor.

CTX-02: The drone-equipment evidence sources are outside the system. This contextual grouping supplies battery/power, navigation, radio, camera, obstacle-sensor, and four-engine evidence; the grouping does not assert that the evidence is correct.

CTX-03: The drone-control recipient is outside the system. It receives the controlled eligibility directive and is responsible for any downstream flight or observation action.

CTX-04: The forest-fire environment is contextual but has no direct modeled interaction. It explains the observation domain only and supplies no fire-detection, localization, or response input.

BOUND-01: The system boundary contains only evidence assessment, request lifecycle, fault registration, priority arbitration, recovery qualification, eligibility decision, permission release, and status composition. It contains no equipment, operator, flight controller, camera control, radio link, engine controller, charger, or fire-analysis function.

MON-01: `energyEvidence` is supplied by CTX-02 and has finite type `EnergyEvidence = {quality: NOMINAL | LIMITED | UNAVAILABLE | UNKNOWN, validity: VALID | INVALID, freshness: CURRENT | STALE}`.

MON-02: `navigationEvidence` is supplied by CTX-02 and has finite type `NavigationEvidence = {gps, inertial, barometric: NOMINAL | NON_NOMINAL | UNAVAILABLE | UNKNOWN; validity: VALID | INVALID; freshness: CURRENT | STALE}`.

MON-03: `communicationEvidence` is supplied by CTX-02 and has finite type `EquipmentEvidence = {condition: NOMINAL | NON_NOMINAL | UNAVAILABLE | UNKNOWN, validity: VALID | INVALID, freshness: CURRENT | STALE}`.

MON-04: `observationEvidence` is supplied by CTX-02 and has the finite `EquipmentEvidence` type and represents camera availability only, not image quality or successful observation.

MON-05: `obstacleEvidence` is supplied by CTX-02 and has the finite `EquipmentEvidence` type and represents obstacle-sensor availability only, not collision avoidance.

MON-06: `propulsionEvidence` is supplied by CTX-02 and has finite type `PropulsionEvidence = {engine1, engine2, engine3, engine4: NOMINAL | NON_NOMINAL | UNAVAILABLE | UNKNOWN; validity: VALID | INVALID; freshness: CURRENT | STALE; alternatingKindsConfirmed: TRUE | FALSE}`. Confirmation is structural concordance only, not a flight-dynamics claim.

MON-07: `operatorEvent` is supplied by CTX-01 and has finite type `OperatorEvent = NONE | SUBMIT | CANCEL | ACKNOWLEDGE_RECOVERY`.

CTRL-01: `sortieEligibilityDirective` is received by CTX-03 and has finite type `SortieDirective = WITHHOLD | PERMIT`. It controls permission from this supervisor only.

CTRL-02: `eligibilityStatus` is received by CTX-01 and has finite type `EligibilityStatus = {request: IDLE | PENDING | RELEASED; fault: CLEAR | ACTIVE; recovery: NORMAL | QUARANTINED | AWAITING_ACK; decision: WITHHOLD | PERMIT; limitingCause: NONE | ENERGY | PROPULSION | NAVIGATION | OBSTACLE | OBSERVATION | COMMUNICATION | RECOVERY | NO_REQUEST}`.

TYPE-01: Every assessment output has finite type `ReadinessAssessment = {ready: TRUE | FALSE; localCause: owner-specific finite cause}`. A ready value is not an assurance claim; it means only that the selected local acceptance predicate is true.

TYPE-02: `FaultSummary = {active: TRUE | FALSE; primaryCause: NONE | ENERGY | PROPULSION | NAVIGATION | OBSTACLE | OBSERVATION | COMMUNICATION}` and uses the stated cause order solely for deterministic reporting. Its seven admissible tuples are exactly `CLEAR/NONE` and `ACTIVE` paired with one of the six equipment causes.

TYPE-03: `RequestPhase = IDLE | PENDING | RELEASED`, `RecoveryPhase = NORMAL | QUARANTINED | AWAITING_ACK`, `PriorityDirective = INHIBIT | CANCEL | RECOVER | SUBMIT | HOLD`, `RecoveryGate = OPEN | CLOSED`, `EligibilityReason = NONE | EQUIPMENT | RECOVERY | NO_REQUEST`, `EligibilityDecision = {directive: WITHHOLD | PERMIT; reason: EligibilityReason}`, and `ReleaseFeedback = NOT_RELEASED | RELEASED` are finite internal domain concepts. Admissible eligibility tuples are `PERMIT/NONE` and `WITHHOLD/EQUIPMENT|RECOVERY|NO_REQUEST`; admissible recovery pairs are `NORMAL/OPEN`, `QUARANTINED/CLOSED`, and `AWAITING_ACK/CLOSED`.

TYPE-04: The exact finite local-cause types are `EnergyCause = NONE | INVALID | STALE | UNAVAILABLE_OR_UNKNOWN | LIMITED`, `NavigationCause = NONE | INVALID | STALE | GPS | INERTIAL | BAROMETRIC`, `SingleEquipmentCause = NONE | INVALID | STALE | CONDITION`, and `PropulsionCause = NONE | INVALID | STALE | CONFIGURATION | ENGINE1 | ENGINE2 | ENGINE3 | ENGINE4`; each `ReadinessAssessment` is tagged with its owner's applicable cause type.

## Selected architecture: semantic usages and ownership

PART-01: Energy Evidence Assessor owns the derivation of energy readiness and an energy-local cause from MON-01. It does not decide sortie eligibility or infer battery endurance.

PART-02: Navigation Evidence Assessor owns the joint derivation that all three named navigation evidence members are admitted by policy. It does not estimate position or navigation accuracy.

PART-03: Communication Evidence Assessor owns radio-availability readiness from MON-03. It does not transmit messages or assert link performance.

PART-04: Observation Evidence Assessor owns camera-availability readiness from MON-04. It does not acquire or interpret imagery.

PART-05: Obstacle Evidence Assessor owns obstacle-sensor-availability readiness from MON-05. It does not perform avoidance or claim detection range.

PART-06: Propulsion Evidence Assessor owns joint four-engine evidence readiness, including structural confirmation of the alternating propeller-kind pattern. It does not claim thrust or controllability.

PART-07: Request Lifecycle Owner owns `IDLE`, `PENDING`, and `RELEASED`, recognizes a fresh submit only from `IDLE`, suppresses a repeated submit while non-idle, and incorporates release feedback. It publishes `In(requestState)`, the pre-evaluation phase, on every outgoing phase flow and commits the post-evaluation phase locally from the accepted directive and release feedback.

PART-08: Fault Registry owns the current `CLEAR/NONE` or `ACTIVE(primaryCause)` classification, derives whether any assessor is not ready, and selects one primary cause by the fixed reporting priority. It is a stateless decision owner; no prior registry value affects its output.

PART-09: Priority Arbiter owns the accepted directive for the current step. It resolves active equipment fault over every operator event and otherwise maps the mutually exclusive event to cancel, recover, submit, or hold.

PART-10: Recovery Qualification Owner owns `NORMAL`, `QUARANTINED`, or `AWAITING_ACK` and derives the recovery gate. It closes immediately for an active fault and reopens only through the defined acknowledgment path. It may carry the already accepted priority directive with its output to preserve same-evaluation cancellation semantics, but that copied field earns no owner credit.

PART-11: Eligibility Decision Owner owns the current permit/withhold result and generic reason by composing the six readiness results, PART-07's published pre-evaluation request phase, the recovery gate, and the accepted directive carried by PART-10. It shall not read raw evidence or `FaultSummary`, identify an equipment source, or reselect the Fault Registry's primary cause.

PART-12: Permission Release Ledger owns the one-shot release state for the current request. It combines PART-07's published pre-evaluation request phase, PART-11's eligibility directive, and prior ledger state; preserves an unreleased pending request across `WITHHOLD`; emits one release only for `PENDING + PERMIT + NOT_RELEASED`; and rearms only after the published lifecycle phase reaches `IDLE`.

PART-13: Status Composer owns only the refinement from PART-11's generic reason and PART-08's `primaryCause` to CTRL-02's detailed `limitingCause`. It copies request, fault, recovery, and directive fields as required but receives no owner credit for those copies and shall not recompute any readiness or eligibility predicate.

OWN-01: Retained-state ownership is distributed across PART-07, PART-10, and PART-12. Stateless decision ownership is distributed across PART-01 through PART-06, PART-08, PART-09, PART-11, and PART-13. Each of all 13 semantic usages derives at least one owner-local fact; copied or carried fields receive no credit.

## Complete typed directed interaction inventory

INT-01: CTX-02 sends `EnergyEvidence` through MON-01 to PART-01; this is the only raw-energy input to the system.

INT-02: CTX-02 sends `NavigationEvidence` through MON-02 to PART-02; the three navigation members remain one atomic snapshot.

INT-03: CTX-02 sends communication `EquipmentEvidence` through MON-03 to PART-03.

INT-04: CTX-02 sends observation `EquipmentEvidence` through MON-04 to PART-04.

INT-05: CTX-02 sends obstacle `EquipmentEvidence` through MON-05 to PART-05.

INT-06: CTX-02 sends `PropulsionEvidence` through MON-06 to PART-06; the four engine members and configuration confirmation remain one atomic snapshot.

INT-07: CTX-01 sends `OperatorEvent` through MON-07 to PART-07 as the candidate request event.

INT-08: PART-01 sends its energy `ReadinessAssessment` to PART-08 for fault aggregation.

INT-09: PART-02 sends its navigation `ReadinessAssessment` to PART-08 for fault aggregation.

INT-10: PART-03 sends its communication `ReadinessAssessment` to PART-08 for fault aggregation.

INT-11: PART-04 sends its observation `ReadinessAssessment` to PART-08 for fault aggregation.

INT-12: PART-05 sends its obstacle `ReadinessAssessment` to PART-08 for fault aggregation.

INT-13: PART-06 sends its propulsion `ReadinessAssessment` to PART-08 for fault aggregation.

INT-14: PART-01 sends its energy `ReadinessAssessment` to PART-11 for composition without raw-evidence recomputation.

INT-15: PART-02 sends its navigation `ReadinessAssessment` to PART-11 for composition without raw-evidence recomputation.

INT-16: PART-03 sends its communication `ReadinessAssessment` to PART-11 for composition without raw-evidence recomputation.

INT-17: PART-04 sends its observation `ReadinessAssessment` to PART-11 for composition without raw-evidence recomputation.

INT-18: PART-05 sends its obstacle `ReadinessAssessment` to PART-11 for composition without raw-evidence recomputation.

INT-19: PART-06 sends its propulsion `ReadinessAssessment` to PART-11 for composition without raw-evidence recomputation.

INT-20: PART-07 sends only the candidate `OperatorEvent` to PART-09 for priority resolution; PART-09 does not inspect request phase.

INT-21: PART-08 sends `FaultSummary` to PART-09 so an active fault can dominate the operator event.

INT-22: PART-09 sends the accepted `PriorityDirective` to PART-07 for its state transition.

INT-23: PART-09 sends the accepted `PriorityDirective` to PART-10 so only an accepted recovery acknowledgment can reopen recovery.

INT-24: PART-08 sends `FaultSummary` to PART-10 so a current fault immediately closes recovery.

INT-25: PART-10 sends its current `RecoveryGate`, recovery phase, and the already accepted `PriorityDirective` to PART-11. Carrying the directive is uncredited and lets PART-11 withhold on a same-evaluation accepted cancellation without adding a connection.

INT-26: PART-07 sends its published pre-evaluation request phase, `In(requestState)`, to PART-11.

INT-27: PART-11 sends the generic `EligibilityDecision {directive, reason}` to PART-12; PART-12 uses the directive and gives the carried reason no credit.

INT-28: PART-12 sends `ReleaseFeedback` to PART-07 as a post-evaluation update input so PART-07 can commit `RELEASED` after the current published `PENDING` snapshot and suppress duplicate release.

INT-29: PART-11 sends the generic `EligibilityDecision {directive, reason}` to PART-13 for detailed limiting-cause refinement.

INT-30: PART-08 sends `FaultSummary` to PART-13.

INT-31: PART-10 sends recovery phase to PART-13 for the external status field.

INT-32: PART-07 sends its published pre-evaluation request phase, `In(requestState)`, to PART-13 for the external status field.

INT-33: PART-12 sends `SortieDirective` through CTRL-01 to CTX-03.

INT-34: PART-13 sends `EligibilityStatus` through CTRL-02 to CTX-01.

INT-35: PART-07 sends its published pre-evaluation request phase, `In(requestState)`, to PART-12 so the ledger can distinguish pending, completed, and rearmed request lifecycles.

METRIC-01: The Model shall realize exactly 13 credited semantic Thread usages for PART-01 through PART-13, exactly 35 directed semantic interactions for INT-01 through INT-35, exactly 30 named nontrivial cases, exactly 10 scenario families, one semantic responsibility layer, one explicit root System, physical containment depth two, and one weakly connected semantic region.

SUPPORT-01: The approved physical mapping shall add exactly one behavior-free `@generated-support` Process containing the 13 sibling semantic Threads and exactly 18 unchanged boundary-delegation support connections for the seven root inputs and two root outputs. The raw source therefore contains 14 reachable non-root usages and exactly 53 PortConnection declarations: 35 semantic connections plus 18 support delegations. Root, Process, delegation, type, trace, overview, and analyzer support receive no semantic usage, interaction, owner, case, or scenario credit and shall add no domain behavior.

## Policy partitions and priority rules

POL-01: An assessment is ready only under its owner-local accepted pattern: energy requires valid, current, nominal quality; each single-equipment group requires valid, current, nominal condition; navigation requires valid, current, and all three members nominal; propulsion requires valid, current, all four engines nominal, and alternating-kind confirmation true. The complement is not ready.

POL-02: When several assessments are not ready, PART-08 shall select the first cause in the fixed order `ENERGY > PROPULSION > NAVIGATION > OBSTACLE > OBSERVATION > COMMUNICATION`. This is a reporting and diagnosis order, not a quantitative safety or severity ranking.

POL-03: PART-09 shall apply `active fault > operator event`. With no active fault, the mutually exclusive event maps `CANCEL -> CANCEL`, `ACKNOWLEDGE_RECOVERY -> RECOVER`, `SUBMIT -> SUBMIT`, and `NONE -> HOLD`.

POL-04: A cancel clears the committed request state regardless of release feedback, and the accepted cancellation shall inhibit release in that same evaluation. A submit is fresh only while the published pre-evaluation request state is `IDLE`; a submit while `PENDING` or `RELEASED` is a duplicate and cannot create another permission release. A `RELEASED` request rearms to `IDLE` only after a subsequent `NONE` or `CANCEL` step.

POL-05: Any active fault sends recovery to `QUARANTINED` with a closed gate. When evidence becomes ready, recovery becomes `AWAITING_ACK` and remains closed. A fault-free accepted `RECOVER` directive opens the gate and returns recovery to `NORMAL`; a new fault coincident with acknowledgment wins and keeps the gate closed.

POL-06: PART-11 eligibility is `PERMIT/NONE` if and only if the published pre-evaluation request phase is `PENDING`, recovery gate is `OPEN`, all six assessments are ready, and the accepted directive is neither `CANCEL` nor `INHIBIT`. Every other admitted valuation is `WITHHOLD` with generic reason priority `EQUIPMENT > RECOVERY > NO_REQUEST`: non-ready evidence or `INHIBIT` yields `EQUIPMENT`, otherwise a closed gate yields `RECOVERY`, and otherwise a non-pending request or `CANCEL` yields `NO_REQUEST`. PART-13 alone refines `EQUIPMENT` with PART-08's already selected primary cause.

POL-07: Initialization shall set request to `IDLE`, Fault Registry to `CLEAR`, recovery to `QUARANTINED`, release ledger to not released, CTRL-01 to `WITHHOLD`, and status to a non-permit value that reports recovery required. Thus startup requires fault-free evidence, acknowledgment, and a fresh submit before permission.

## Thirty required nontrivial contract cases

CASE-01: Owner PART-01; valid, current, nominal energy evidence shall produce ready with no local cause.

CASE-02: Owner PART-01; the complement of CASE-01 shall produce not ready and the first applicable energy-local cause in `INVALID > STALE > UNAVAILABLE_OR_UNKNOWN > LIMITED` order.

CASE-03: Owner PART-02; valid, current navigation evidence with GPS, inertial, and barometric members all nominal shall produce ready with no local cause.

CASE-04: Owner PART-02; the complement of CASE-03 shall produce not ready and a deterministic navigation-local cause ordered `INVALID > STALE > GPS > INERTIAL > BAROMETRIC`.

CASE-05: Owner PART-03; valid, current, nominal communication evidence shall produce ready with no local cause.

CASE-06: Owner PART-03; the complement of CASE-05 shall produce not ready and a deterministic communication-local cause ordered `INVALID > STALE > CONDITION`.

CASE-07: Owner PART-04; valid, current, nominal observation evidence shall produce ready with no local cause.

CASE-08: Owner PART-04; the complement of CASE-07 shall produce not ready and a deterministic observation-local cause ordered `INVALID > STALE > CONDITION`.

CASE-09: Owner PART-05; valid, current, nominal obstacle evidence shall produce ready with no local cause.

CASE-10: Owner PART-05; the complement of CASE-09 shall produce not ready and a deterministic obstacle-local cause ordered `INVALID > STALE > CONDITION`.

CASE-11: Owner PART-06; valid, current propulsion evidence with all four engines nominal and alternating-kind confirmation true shall produce ready with no local cause.

CASE-12: Owner PART-06; the complement of CASE-11 shall produce not ready and a deterministic propulsion-local cause ordered `INVALID > STALE > CONFIGURATION > ENGINE1 > ENGINE2 > ENGINE3 > ENGINE4`.

CASE-13: Owner PART-09; an active fault with any operator event shall produce `INHIBIT`.

CASE-14: Owner PART-09; no active fault and candidate `CANCEL` shall produce `CANCEL`.

CASE-15: Owner PART-09; no active fault and candidate `ACKNOWLEDGE_RECOVERY` shall produce `RECOVER`.

CASE-16: Owner PART-09; no active fault and candidate `SUBMIT` shall produce `SUBMIT`.

CASE-17: Owner PART-09; no active fault and candidate `NONE` shall produce `HOLD`.

CASE-18: Owner PART-07; accepted `CANCEL` shall set request state to `IDLE` and dominate simultaneous release feedback.

CASE-19: Owner PART-07; accepted `SUBMIT` from `IDLE` shall set request state to `PENDING` and constitute a fresh request.

CASE-20: Owner PART-07; accepted `SUBMIT` from `PENDING` or `RELEASED` with `NOT_RELEASED` feedback shall retain state and shall not constitute a fresh request.

CASE-21: Owner PART-07; with no accepted `CANCEL`, `RELEASED` feedback while prior request state is `PENDING` shall set request state to `RELEASED` and dominate a duplicate submit.

CASE-22: Owner PART-07; all remaining combinations shall be total: `RELEASED` plus accepted `HOLD` rearms to `IDLE`, while `INHIBIT`, `RECOVER`, or `HOLD` in other phases retains the prior request phase.

CASE-23: Owner PART-08; if any assessor is not ready, fault state shall be `ACTIVE` and primary cause shall follow POL-02.

CASE-24: Owner PART-08; if all assessors are ready, fault state shall be `CLEAR` with primary cause `NONE`.

CASE-25: Owner PART-10; an active fault shall set recovery to `QUARANTINED` and gate to `CLOSED`, regardless of accepted directive or prior recovery phase.

CASE-26: Owner PART-10; with no active fault, prior `NORMAL` or accepted `RECOVER` shall set recovery to `NORMAL` and gate to `OPEN`.

CASE-27: Owner PART-10; with no active fault, prior `QUARANTINED` or `AWAITING_ACK` and no accepted `RECOVER` shall set recovery to `AWAITING_ACK` and gate to `CLOSED`.

CASE-28: Owner PART-11; if the published request phase is not `PENDING`, the recovery gate is `CLOSED`, or the accepted directive is `CANCEL`, the decision shall be `WITHHOLD`. Its generic reason is `EQUIPMENT` if any assessment is not ready or the directive is `INHIBIT`, otherwise `RECOVERY` if the gate is closed, and otherwise `NO_REQUEST`.

CASE-29: Owner PART-11; a published `PENDING` request, `OPEN` recovery gate, six ready assessments, and accepted `HOLD`, `SUBMIT`, or `RECOVER` shall produce `PERMIT` with generic reason `NONE`.

CASE-30: Owner PART-11; a published `PENDING` request, `OPEN` recovery gate, an accepted directive other than `CANCEL`, and either at least one non-ready assessment or accepted `INHIBIT` shall produce `WITHHOLD` with generic reason `EQUIPMENT`. This current-evidence guard remains required even if a state-update realization presents the gate's prior value; PART-11 shall not receive or select the detailed primary cause.

PARTITION-01: CASE-01 through CASE-12 form six disjoint ready/complement partitions; CASE-13 through CASE-17 cover every fault/event valuation; CASE-18 through CASE-22 cover request transitions in the disjoint priority `cancel > valid release feedback > fresh or duplicate submit > rearm or retain`; CASE-23 and CASE-24 cover every assessment vector; CASE-25 through CASE-27 cover every fault, recovery-state, and accepted-recovery valuation; CASE-28 through CASE-30 cover every published request phase, gate, readiness, and accepted-directive valuation under their explicit exclusions.

## Required invariants and composition obligations

BEH-01: PART-12 shall initialize its ledger to `NOT_RELEASED` and CTRL-01 to `WITHHOLD`. For each admitted request/decision/prior-ledger valuation it shall emit CTRL-01 `PERMIT`, return a one-step `RELEASED` feedback pulse, and commit `RELEASED` if and only if the published phase is `PENDING`, PART-11's directive is `PERMIT`, and prior ledger state is `NOT_RELEASED`; otherwise it emits `WITHHOLD`. It shall retain prior `NOT_RELEASED` across `PENDING/WITHHOLD`, retain prior `RELEASED` while the published phase is `PENDING` or `RELEASED`, and reset to `NOT_RELEASED` only when the published phase is `IDLE`. Verification: inspect initialization and local guarantees and enumerate all request/decision/prior-ledger valuations. Pass criterion: exactly the stated transition emits permission or release feedback, and no cancellation, withhold decision, non-pending request, or already released ledger yields CTRL-01 `PERMIT`.

BEH-02: PART-13 shall copy the published request phase from PART-07, fault state and primary cause from PART-08, recovery phase from PART-10, and directive from PART-11 without credit. Its credited local relation shall map generic `RECOVERY`, `NO_REQUEST`, and `NONE` to the corresponding external limiting cause and shall combine generic `EQUIPMENT` with PART-08's non-`NONE` primary cause to select the detailed external equipment cause. `EQUIPMENT + CLEAR/NONE` and every other tuple that violates producer guarantees are inadmissible and shall be recorded as producer-unreachable rather than silently assigned semantic credit. Verification: inspect the status contract and bounded output oracle. Pass criterion: every admitted report field equals its owning input or this refinement, all producer-reachable tuples have exactly one result, and no raw evidence reaches PART-13.

BEH-03: A fresh request submitted during `QUARANTINED` or `AWAITING_ACK` may become `PENDING` but shall not produce permission until fault-free recovery acknowledgment opens the gate. Verification: analyze the request/recovery/eligibility composition over consecutive states. Pass criterion: pre-ack output is `WITHHOLD` and the same pending request becomes eligible only after accepted acknowledgment and ready evidence.

BEH-04: A cancellation accepted without an active fault shall clear the request and cause `WITHHOLD`; an active fault coincident with cancellation shall still cause `WITHHOLD` through `INHIBIT`, with cancellation deferred because fault priority wins. Verification: inspect CASE-13, CASE-14, CASE-18, and CASE-28 composition. Pass criterion: neither path can yield permission and the state consequence matches the stated priority.

BEH-05: Owner-local assessment guarantees shall be the only source of the six readiness facts consumed by PART-08 and PART-11. Verification: architecture and contract trace analysis. Pass criterion: no central contract or analyzer expression reads MON-01 through MON-06 except the assigned assessor, and no assessor is a forwarding or bijective-renaming wrapper.

COMP-01: The system-level permit guarantee shall be compositionally supported by the six assessor guarantees, request-state guarantee, priority guarantee, fault/recovery guarantees, eligibility guarantee, and release guarantee. Verification: contract dependency inspection plus bounded analyzer comparison. Pass criterion: the system guarantee and composed owner outputs agree on every bounded valuation; a separate formal semantic proof is not claimed unless actually run.

COMP-02: Fault propagation shall follow assessor -> Fault Registry -> Priority Arbiter and Recovery Qualification -> Eligibility Decision -> Permission Release, while the detailed diagnosis path follows Fault Registry -> Status Composer and the current readiness guard follows assessor -> Eligibility Decision. Verification: connection and trace inspection. Pass criterion: each path resolves with compatible direction/type and removal of any path would make at least one CASE, BEH, or FAULT clause unrealizable.

## Risks, faults, degraded behavior, and recovery

RISK-01: If invalid, stale, unknown, non-nominal, or structurally discordant equipment evidence were treated as ready, the supervisor could issue permission outside its selected evidence policy. No likelihood or physical severity is asserted.

FAULT-01: The assigned assessor shall convert each such evidence condition to not ready under its complement case, PART-08 shall propagate an active primary cause, PART-11/PART-12 shall withhold permission, and PART-13 shall refine the generic equipment reason to that owned primary cause. Verification: contract and bounded fault-injection analysis. Pass criterion: each non-ready evidence class independently reaches CTRL-01 as `WITHHOLD` and CTRL-02 as the correct detailed cause class.

RISK-02: If a cleared fault automatically reopened eligibility, transient evidence could restore permission without an explicit operational recovery decision. No claim is made that acknowledgment provides physical safety.

FAULT-02: PART-10 shall keep recovery closed after fault clearance until a fault-free accepted acknowledgment; a coincident new fault dominates acknowledgment. Verification: consecutive-step state analysis of CASE-25 through CASE-27. Pass criterion: every unacknowledged or coincident-fault recovery trace remains `WITHHOLD`, and only the fault-free acknowledgment path opens the gate.

RISK-03: If a held or repeated submit created repeated releases, CTX-03 could observe duplicate authorization cycles for one operator action.

FAULT-03: PART-07 and PART-12 shall suppress duplicate submit/release through `PENDING` and `RELEASED` state and rearm only after `NONE` or cancellation. Verification: consecutive-step bounded analysis. Pass criterion: a held sequence of `SUBMIT` events produces at most one transition into released permission before rearm.

## Ten bounded scenario families

SCN-01: Startup recovery and nominal fresh request. Starting from POL-07, present six ready evidence values and issue `ACKNOWLEDGE_RECOVERY`, then `NONE`, then `SUBMIT`, then `NONE`, then a final `NONE`. Expected trace: the gate opens; the request becomes pending; one evaluation exposes `PENDING/PERMIT` and exactly one permission release; release feedback commits request state to `RELEASED`; and the final evaluation publishes `RELEASED/WITHHOLD` before rearming. Verification/pass: the retained five-step scenario witness observes CTRL-01 and CTRL-02 in that order without a second permit.

SCN-02: No-request readiness. From `NORMAL` with all evidence ready and repeated `NONE`, expected outcome is `WITHHOLD` with `NO_REQUEST`. Verification/pass: all steps retain no pending request and no permit appears.

SCN-03: Duplicate submit suppression. After one request is released, continue `SUBMIT` for at least two steps without an intervening `NONE` or cancel. Expected outcome: the repeated submits remain non-fresh, CTRL-01 is `WITHHOLD`, and no second release transition occurs. Verification/pass: release-ledger state and CTRL-01 show no new permit or release-feedback cycle.

SCN-04: Operator cancellation. Establish a pending request, then issue `CANCEL` with ready evidence and no fault. Expected outcome: request becomes `IDLE`, output is `WITHHOLD`, and status reports `NO_REQUEST`. Verification/pass: the next observable snapshot has all three results.

SCN-05: Energy fault propagation. From a permitted or pending condition, change only energy quality to `LIMITED`, `UNAVAILABLE`, or `UNKNOWN`, or its validity/freshness to rejected. Expected outcome: energy not-ready, primary cause `ENERGY`, recovery `QUARANTINED`, and immediate `WITHHOLD`. Verification/pass: each listed variant reaches the same external class without changing another evidence input.

SCN-06: Navigation, obstacle, and propulsion fault propagation. In separate bounded variants, reject one navigation member, obstacle condition, engine condition, or alternating-kind confirmation. Expected outcome: the owning assessor becomes not ready, the corresponding primary cause propagates, and permission is withheld. Verification/pass: each owner-local variant has a witness and no other assessor is credited with deriving it.

SCN-07: Observation or communication unavailability. In separate variants, reject only camera or radio evidence. Expected outcome: `OBSERVATION` or `COMMUNICATION` becomes the limiting cause and permission is withheld; no claim about image or link quality is made. Verification/pass: the external cause matches the changed evidence class.

SCN-08: Concurrent-fault priority. Reject energy, navigation, and communication evidence in the same snapshot. Expected outcome: all three local assessments are not ready, but the reported primary cause is `ENERGY` under POL-02 and output is `WITHHOLD`. Verification/pass: the analyzer retains all three local failures while producing the single deterministic primary cause.

SCN-09: Unacknowledged recovery. After any fault, restore all evidence to ready and present `NONE` for at least two steps. Expected outcome: fault becomes clear, recovery remains `AWAITING_ACK`, a pending request remains blocked, and output remains `WITHHOLD`. Verification/pass: no recovery gate opening occurs in the witness.

SCN-10: Recovery acknowledgment versus recurrent fault. Variant A restores all evidence, presents acknowledgment, and expects `NORMAL/OPEN` followed by permission only if a request is pending. Variant B presents acknowledgment while a new fault is active and expects `QUARANTINED/CLOSED/WITHHOLD`. Verification/pass: both variants demonstrate the declared fault-over-recovery priority and the pending-request condition.

## Ownership, case, and coverage audit

AUD-01A: PART-01 is a decision owner because it derives the energy conjunction and prioritized `EnergyCause`; CASE-01, CASE-02, and SCN-05 expose that owner-local fact.

AUD-01B: PART-02 is a decision owner because it jointly evaluates three navigation members and selects a `NavigationCause`; CASE-03, CASE-04, and SCN-06 expose that owner-local fact.

AUD-01C: PART-03 is a decision owner because it derives communication readiness and a communication-local `SingleEquipmentCause`; CASE-05, CASE-06, and SCN-07 expose that owner-local fact.

AUD-01D: PART-04 is a decision owner because it derives observation readiness and an observation-local `SingleEquipmentCause`; CASE-07, CASE-08, and SCN-07 expose that owner-local fact.

AUD-01E: PART-05 is a decision owner because it derives obstacle-evidence readiness and an obstacle-local `SingleEquipmentCause`; CASE-09, CASE-10, and SCN-06 expose that owner-local fact.

AUD-01F: PART-06 is a decision owner because it jointly evaluates four engine members and configuration concordance and selects a `PropulsionCause`; CASE-11, CASE-12, and SCN-06 expose that owner-local fact.

AUD-02: PART-07 owns request history and fresh/duplicate/released distinctions; CASE-18 through CASE-22 and SCN-01 through SCN-04 prevent it from being a forwarding usage.

AUD-03: PART-08 is a stateless decision owner: it maps the 15,360 combinations of six assessment results to exactly seven admissible current Fault Summaries under POL-02. CASE-23, CASE-24, and SCN-08 require a many-to-one derived classification unavailable from any one input; no prior fault value is credited.

AUD-04: PART-09 owns cross-domain event priority; CASE-13 through CASE-17 and SCN-10 require a decision rather than renaming.

AUD-05: PART-10 owns persistent recovery phase and gate; CASE-25 through CASE-27, SCN-09, and SCN-10 require history-sensitive behavior.

AUD-06: PART-11 owns a many-to-one classification over six assessment results, published request phase, recovery gate, and accepted directive. CASE-28 through CASE-30 require permit or one of three generic withhold reasons; PART-11 never receives the detailed primary cause.

AUD-07: PART-12 owns a request- and prior-state-dependent one-shot release relation. BEH-01, FAULT-03, and SCN-03 require preservation of an unreleased pending request, exactly one release transition, completed-request retention, and lifecycle-based rearm rather than directive copying.

AUD-08: PART-13 owns only generic-to-detailed limiting-cause refinement. BEH-02 requires `EQUIPMENT` to combine with PART-08's independently selected cause while the three other generic reasons map to their external causes; copied status fields and enum labels are explicitly uncredited.

AUD-09: All seven boundary inputs MON-01 through MON-07 reach a responsible owner, both controlled outputs CTRL-01 and CTRL-02 have one controlling owner, all 13 usages participate in a boundary-connected behavioral path, and all 35 interactions have distinct source, destination, type, and purpose.

AUD-10: The 30 CASE clauses are owned by PART-01 through PART-11 as stated. PART-12 and PART-13 have required invariants rather than additional named cases, so the campaign count remains exactly 30 without omitting their behavior.

## Objective final-baseline pass criteria

PASS-01: Structural pass requires exactly 13 credited semantic Thread usages, 35 resolved directed semantic interactions corresponding one-to-one with INT-01 through INT-35, one root System, one behavior-free generated-support Process, 14 reachable non-root usages, physical depth two, 18 uncredited boundary delegations, exactly 53 raw PortConnection declarations, one semantic responsibility layer, and one weakly connected semantic region.

PASS-02: Behavioral pass requires exactly 30 nontrivial named contract cases, safe initialization, all BEH and FAULT guarantees, multiple state and decision owners, and explicit priority, propagation, recovery, and composition obligations.

PASS-03: Partition pass requires the Model summary and bounded analyzer to show each partition in PARTITION-01 total and pairwise disjoint, including initialization, no event, fresh submit, duplicate submit, same-evaluation cancel inhibition, release feedback, rearm, active-fault, cleared-fault, acknowledgment, recurrent-fault, permit, and all withhold paths.

PASS-04: Trace pass requires every abstract ID to be covered, informational, assumed, or deferred; every significant generated element must trace to one or more IDs or carry a specific generated-support justification. Missing abstract coverage or unexplained model additions fail.

PASS-05: Verification pass requires architecture-stage and final Sireum/HAMR typechecking, compatible resolved endpoints, retained factorized analyzer agreement with all 30 cases and 10 scenario families, exact semantic and raw structural counts, source-hash binding, and no trivially unconstrained controlled output. These checks verify conformance, not physical validity.

PASS-06: Validation pass requires Designer review to find the resulting model faithful to the selected eligibility-supervisor purpose, boundary, assumptions, scenarios, and claim limits. Mechanical success alone does not satisfy this criterion.

## Deferred and prohibited claims

DEF-01: Flight dynamics, thrust sufficiency, controllability, redundancy, navigation accuracy, endurance, battery physics, charging behavior, physical timing, sensor truth, obstacle-detection performance, observation quality, radio performance, landing control, and return-to-home behavior are deferred and shall not be claimed.

DEF-02: Fire detection, classification, localization, coverage, emergency response, mission authority, operational safety, certification, and production readiness are outside scope and shall not be inferred from `PERMIT`.

DEF-03: Code generation, application implementation, executable simulation, scheduling, deployment bindings, and physical integration evidence are not required because the seed does not declare `profile: executable-slang-jvm-v1` and the run policy does not add that profile.

DEF-04: Formal semantic proof, probabilistic reliability, quantitative severity/likelihood, performance validation, and environmental validation remain not-run. Contract/typechecking and bounded analysis evidence shall not be relabeled as any of these claims.


## Approved Model mapping and bounded-analysis obligations

ANALYSIS-01: The retained analyzer shall exhaustively enumerate the six assessor input domains of exactly 16, 256, 16, 16, 16, and 2,048 valuations and prove each local partition total, disjoint, deterministic, and many-to-one with the stated owner-local cause priority. It shall then enumerate the complete 15,360-value transmitted assessment product rather than the infeasible raw end-to-end Cartesian product.

ANALYSIS-02: Downstream local enumeration shall cover PART-07's 30 prior-phase/directive/feedback combinations, PART-08's 15,360 assessment combinations, PART-09's 28 fault/event combinations, PART-10's 105 prior-recovery/fault/directive combinations, PART-11's 460,800 assessment/request/gate/directive combinations, all 24 producer-admissible request/eligibility/prior-ledger combinations at PART-12 plus structurally expressible inadmissible eligibility tuples, and PART-13's 252 individually admissible request/fault/recovery/eligibility combinations. Every owner report shall record gaps, overlaps, outputs, witnesses, and producer-reachable versus producer-unreachable tuples; no central reimplementation may substitute for executing the owner relations.

ANALYSIS-03: End-to-end analysis shall materialize the 35 semantic INT flows in dependency order, compose the exact owner functions, compare CTRL-01 and CTRL-02 with a separately structured raw-policy reference over representative raw-evidence equivalence classes, and execute all ten multi-step scenario families. It shall specifically witness same-evaluation non-ready withholding, same-evaluation accepted-cancel withholding, fault-over-acknowledgment priority, unacknowledged recovery blocking, one-shot release, feedback-delayed publication of `RELEASED`, and rearm.

ANALYSIS-04: Acceptance requires zero unexpected gaps, overlaps, mismatches, and invariant violations; all 30 CASE clauses reached; all required producer-unreachable tuples identified rather than counted as owner behavior; all ten scenario families passed; analyzer exit success; and analyzer evidence bound to the final source hash. Harness checks alone and a centrally recomputed CTRL oracle are insufficient ownership evidence.

MODEL-RES-01: The Model finding that PART-13 was an identity wrapper is accepted and resolved by the generic-reason/detailed-cause split. The finding that PART-12 lacked request-local state inputs is accepted and resolved by revised INT-35. The PART-08 state-owner claim is withdrawn, while its 15,360-to-seven current decision remains credited.

MODEL-RES-02: The pre-evaluation publication finding is accepted for INT-26, INT-28, INT-32, and INT-35, and unused request phase is removed from INT-20. Designer resolution additionally carries the already accepted directive on INT-25 so the frozen cancellation policy cannot emit a same-evaluation permit; this is an uncredited payload refinement, not a new interaction or policy.

MODEL-RES-03: The trusted SysML-AADL/GUMBO evidence supports flat finite record-valued DataPorts, direct attribute members, owner-local state, initialization, compute cases, and `In(localState)` against the cited tool/library versions. This is realizability evidence only; the generated source must independently typecheck and pass every structural, trace, local-contract, and analyzer criterion.

AUTH-GEN-01: Model generation is authorized against this approved final abstract and `design-selection.md`. Generation shall preserve the exact `13/35/30/10` semantic inventories, `14/18/53` support and raw-source metrics, three retained-state owners, the current Fault Registry decision owner, the generic/detail reason split, pre-state/update ordering, same-evaluation cancellation inhibition, readiness/fault/recovery/priority/composition policy, ten scenarios, generated-support boundary, and deferred claims.
