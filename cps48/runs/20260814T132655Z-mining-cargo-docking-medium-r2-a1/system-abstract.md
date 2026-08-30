---
abstract_id: SA-MCD-MED-R2-APPROVED-01
run_id: 20260814T132655Z-mining-cargo-docking-medium-r2-a1
domain_seed: 20260813T233942Z-mining-cargo-docking-seed-v1
campaign_complexity: medium
semantic_usage_count: 8
semantic_interaction_count: 21
nontrivial_contract_case_count: 20
scenario_family_count: 7
containment_depth: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_executable_profile: false
---

# Docked-Service Access Lifecycle Supervisor

## Synopsis

NEED-01: A pilot and station need one bounded supervisory system that coordinates logical docking and undocking clearance with mutually exclusive access to repair or support-system resupply, prevents departure clearance while a docked service occupies access, makes inconsistent observations visible, and requires explicit recovery before a later docking cycle.

PURPOSE-01: The system will supervise the logical lifecycle from outside-station readiness through docking clearance, docked-service access, undocking clearance, and confirmed release; it does not actuate a physical docking mechanism, perform repair or resupply, move cargo, verify cargo transfer, or prove that any reported physical condition is true.

CAP-01: Principal capabilities are fresh-intent qualification, combined berth-and-ship readiness qualification, repair/resupply mutual exclusion, lifecycle-relative consistency assessment, deterministic priority arbitration, single-owner lifecycle state, last-chance output gating, stakeholder-specific reporting, and latched recovery.

## Evidence and claim classes

EVID-HDBK-01: The Designer methodology supplies the requirements-engineering obligations used here: implementation-independent need and boundary, explicit assumptions, cohesive ownership, alternatives, nominal and off-nominal scenarios, measurable bounds, traceability, and separate verification and validation; it supplies no mining-frigate docking policy.

EVID-SEED-01: Source-grounded seed facts are limited to a pilot-operated mining frigate, station context, docking and undocking vocabulary, docked access to repair and capacitor or support-system resupply, lifecycle names, and generic ship or station observations, commands, and reports.

ABS-PILOT-01: The exact finite types, logical evaluation semantics, freshness convention, one-lifecycle boundary, access-exclusion rule, state machine, priority order, fault interpretation, reset condition, responsibility allocation, contract cases, and scenarios below are pilot abstractions selected for this run because the seed leaves them open.

SEL-ARCH-01: The selected architecture is lifecycle-and-interlock centered: separate owners qualify intent, combined docking readiness, and dual-service occupancy; a lifecycle-relative monitor derives operational assessments; an arbiter owns ordered decisions; one controller owns persistent lifecycle state; and separate gate and reporter owners derive public outputs.

CLAIM-01: Typechecking, contracts, bounded enumeration, and scenario traces may establish conformance only to this finite System Abstract; they shall not be described as evidence of physical docking effectiveness, service completion, safety, certification, production readiness, or fidelity to a game or real spacecraft.

## Goals

GOAL-01: The supervisor shall issue a docking or undocking permit only when a fresh corresponding pilot intent is compatible with the current lifecycle, qualified berth-and-ship readiness, and quiescent docked-service access.

GOAL-02: The supervisor shall enable docked-service access only after docking has been observed as secure and shall never enable repair and resupply access as concurrent logical users.

GOAL-03: The supervisor shall block or defer undocking while a service is requested, granted, active, or completing, with service completion taking priority over a simultaneous fresh undock intent.

GOAL-04: The supervisor shall detect invalid or lifecycle-inconsistent boundary combinations, latch recovery, lock service access, and withhold movement permits.

GOAL-05: The supervisor shall clear recovery only on a fresh reset with confirmed berth release and quiescent services, and shall require a later distinct fresh dock intent to start another lifecycle.

## Operational context and exact system boundary

CTX-01: Pilot is outside the system, supplies logical docking, undocking, and reset intent, and receives the pilot-oriented lifecycle report.

CTX-02: StationBerthInterface is outside the system, supplies an abstract berth observation, receives the station-oriented access report, and remains responsible for physical berth and docking mechanisms.

CTX-03: FrigateStatusInterface is outside the system, supplies the frigate condition used in readiness qualification, and remains responsible for the truth of ship condition and any physical response.

CTX-04: RepairService is outside the system, supplies its logical access demand or activity status, and performs any repair work.

CTX-05: ResupplyService is outside the system, supplies its logical access demand or activity status, and performs any capacitor or support-system resupply.

CTX-06: DockingControlInterface is outside the system, receives supervisory movement permits and service-access state, and is not assumed to obey or physically realize them.

MON-01: `pilotIntent` from CTX-01 has exact finite type `PilotIntent = {NONE, FRESH_DOCK, REPEATED_DOCK, FRESH_UNDOCK, REPEATED_UNDOCK, FRESH_RESET, REPEATED_RESET, INVALID}`; freshness and repetition are supplied boundary facts, not inferred timing.

MON-02: `berthObservation` from CTX-02 has exact finite type `BerthObservation = {APPROACH_CLEAR, DOCKED_SECURE, DEPARTURE_CLEAR, RELEASED, BLOCKED, INVALID}`.

MON-03: `shipCondition` from CTX-03 has exact finite type `ShipCondition = {APPROACH_READY, SERVICE_READY, DEPARTURE_READY, TRANSIT, NOT_READY, INVALID}`.

MON-04: `repairSignal` from CTX-04 has exact finite type `ServiceSignal = {QUIESCENT, REQUEST, ACTIVE, COMPLETE, FAULT, INVALID}`.

MON-05: `resupplySignal` from CTX-05 has the same exact finite `ServiceSignal` type but remains a distinct input because simultaneous repair and resupply use is an explicit interlock concern.

CTRL-01: `movementDirective` to CTX-06 has exact finite type `MovementDirective = {HOLD, PERMIT_DOCK, PERMIT_UNDOCK}` and is a supervisory permission, not an actuator-success claim.

CTRL-02: `serviceAccess` to CTX-06 has exact finite type `ServiceAccess = {LOCKED, ENABLED}` and expresses generic docked-service access rather than performing or verifying a service.

CTRL-03: `pilotReport` to CTX-01 has exact finite type `PilotLifecycleReport = {OUTSIDE_IDLE, DOCK_PERMITTED, DOCKED_READY, SERVICE_GRANTED, SERVICE_ACTIVE, SERVICE_FINISHED, UNDOCK_DEFERRED, UNDOCK_PERMITTED, RELEASE_CONFIRMED, INHIBITED, RECOVERY_REQUIRED, RESET_COMPLETE}`.

CTRL-04: `stationReport` to CTX-02 has exact finite type `StationAccessReport = {NO_ACCESS, DOCK_EXPECTED, ACCESS_AVAILABLE, ACCESS_RESERVED, ACCESS_OCCUPIED, DEPARTURE_EXPECTED, ACCESS_INHIBITED, RECOVERY_REQUIRED}`.

BOUND-01: The operational boundary is exactly MON-01 through MON-05 and CTRL-01 through CTRL-04; cargo state, cargo requests, ship-transfer evidence, warehouse evidence, offload commands, cargo completion claims, clocks, distances, and physical actuator feedback are absent.

## Pilot assumptions and constraints

ASM-01: CTX-01 is responsible for labeling an intent fresh or repeated and shall not relabel an unchanged intent as fresh; this assumption is needed because the finite boundary has no clock, sequence number, or request identifier.

ASM-02: CTX-02 and CTX-03 are responsible for supplying one current berth observation and one current ship condition for the same logical evaluation; the system qualifies their combination but cannot establish physical truth.

ASM-03: CTX-04 and CTX-05 are responsible for reporting their current logical demand or activity independently, and only one may validly be nonquiescent; simultaneous nonquiescent reports are deliberately treated as conflict rather than assumed impossible.

ASM-04: A `COMPLETE` service signal means only that the external service relinquishes logical access; the supervisor neither verifies repair quality nor verifies resupply adequacy.

ASM-05: Behavior advances in deterministic logical evaluations with one value for each monitored quantity and one retained lifecycle pre-state; no wall-clock duration, physical latency, or scheduler semantics are claimed.

ASM-06: The run supervises one frigate, one station berth context, and one dock/service-access lifecycle at a time; concurrency across vessels, berths, or overlapping lifecycles is excluded.

CONSTR-01: At most one generic docked-service access grant shall exist, and no movement permit and enabled service access shall be asserted together.

CONSTR-02: Initialization shall set lifecycle state to `IDLE_OUTSIDE` and outputs to `HOLD`, `LOCKED`, `OUTSIDE_IDLE`, and `NO_ACCESS`; initialization is mandatory but earns no nontrivial contract-case credit.

## Exact internal finite concepts

TYPE-01: `QualifiedIntent = {NO_ACTION, DOCK_REQUEST, UNDOCK_REQUEST, RESET_REQUEST, INTENT_FAULT}`.

TYPE-02: `DockReadiness = {DOCK_READY, SERVICE_READY, UNDOCK_READY, RELEASE_CONFIRMED, TEMPORARILY_BLOCKED, READINESS_CONFLICT, READINESS_FAULT}`.

TYPE-03: `ServiceInterlock = {QUIESCENT, SINGLE_DEMAND, SINGLE_ACTIVE, SINGLE_COMPLETION, SERVICE_CONFLICT, SERVICE_FAULT}`.

TYPE-04: `LifecycleState = {IDLE_OUTSIDE, DOCK_CLEARANCE_LATCHED, DOCKED_ACCESS_LOCKED, SERVICE_ACCESS_GRANTED, SERVICE_IN_PROGRESS, UNDOCK_CLEARANCE_LATCHED, RECOVERY_REQUIRED}`.

TYPE-05: `OperationalAssessment = {OUTSIDE_STABLE, DOCK_ELIGIBLE, DOCK_WAITING, DOCK_CONFIRMED, DOCKED_QUIESCENT, SERVICE_DEMAND_READY, SERVICE_GRANT_PENDING, SERVICE_OCCUPIED, SERVICE_RELEASED, SERVICE_WITHDRAWN, UNDOCK_ELIGIBLE, UNDOCK_WAITING, RELEASE_CONFIRMED, RECOVERY_CLEARABLE, TEMPORARILY_BLOCKED, ASSESSMENT_CONFLICT, ASSESSMENT_FAULT}`.

TYPE-06: `AdmittedDirective = {ENTER_RECOVERY_FAULT, ENTER_RECOVERY_CONFLICT, RESET_RECOVERY, HOLD_RECOVERY, FINISH_SERVICE_DEFER_UNDOCK, FINISH_SERVICE, DEFER_UNDOCK, HOLD_ACTIVE_SERVICE, START_SERVICE, HOLD_SERVICE_GRANT, WITHDRAW_SERVICE_GRANT, CONFIRM_RELEASE, HOLD_UNDOCK_CLEARANCE, CONFIRM_DOCK, HOLD_DOCK_CLEARANCE, AUTHORIZE_UNDOCK, GRANT_SERVICE_ACCESS, AUTHORIZE_DOCK, INHIBIT_ACTION, HOLD_STABLE}`.

TYPE-07: `ControlProposal` is the finite pair of `MovementProposal = {HOLD_MOVEMENT, AUTHORIZE_DOCK, AUTHORIZE_UNDOCK}` and `AccessProposal = {LOCK_ACCESS, ENABLE_ACCESS}`.

TYPE-08: `LifecycleSnapshot` is the finite pair of next `LifecycleState` and `LifecycleResult = {NONE, DOCK_ACCEPTED, DOCK_CONFIRMED, SERVICE_GRANTED, SERVICE_RUNNING, SERVICE_FINISHED, UNDOCK_DEFERRED, UNDOCK_ACCEPTED, RELEASED, INHIBITED, RECOVERY_LATCHED, RESET_COMPLETE}`; producer-inconsistent pairs need not be reachable.

TYPE-09: `GatedControl` is the finite pair of the actual `MovementDirective` and `ServiceAccess` derived by PART-07; it lets PART-08 distinguish a retained lifecycle latch from a currently suppressed permission without recomputing gate policy.

## Selected semantic usages and responsibility ownership

PART-01: IntentQualifier owns `QualifiedIntent` and derives actionability by collapsing NONE and all repeated intents to NO_ACTION, preserving each fresh action class, and detecting INVALID; it is not a bijective rename.

PART-02: DockReadinessQualifier owns `DockReadiness` and derives phase-relevant readiness from the joint berth and ship observations, including exact compatible pairs, temporary blockage, mismatched-condition conflict, and invalidity.

PART-03: ServiceInterlockQualifier owns `ServiceInterlock` and combines independent repair and resupply signals to derive single demand, activity, completion, quiescence, mutual-exclusion conflict, or fault; it never forwards a service signal.

PART-04: LifecycleConsistencyMonitor owns `OperationalAssessment` and combines the lifecycle pre-state with qualified readiness and service interlock to distinguish eligible progress, waiting, service occupancy, release, temporary blockage, contradiction, and recoverability.

PART-05: PriorityArbiter owns `AdmittedDirective` and combines qualified intent, lifecycle pre-state, and operational assessment under the exact ordered partition CASE-01 through CASE-20; it owns neither lifecycle state nor public outputs.

PART-06: LifecycleController is the sole persistent state owner and derives next `LifecycleState`, `ControlProposal`, and `LifecycleSnapshot` from its pre-state and the admitted directive; no other usage may retain or reconstruct lifecycle state.

PART-07: MovementAndAccessSafetyGate owns both `movementDirective` and `serviceAccess` and derives them jointly from the controller proposal plus current readiness and service interlock, suppressing a stale or unsafe proposal rather than forwarding it.

PART-08: LifecycleReporter owns both public reports and derives different pilot and station views from `LifecycleSnapshot` and `GatedControl`; it shall preserve recovery and access occupancy, expose current suppression of a latched permission, and avoid recomputing gate policy.

OWN-AUDIT-01: Qualification and decision owners PART-01 through PART-05 cooperate before PART-06 changes state; PART-07 independently owns final output safety decisions and PART-08 owns stakeholder interpretation. Every credited usage derives a distinct owner-local fact, PART-06 alone owns persistent state, and no root, container, route, record wrapper, context actor, or analyzer receives semantic-usage or owner credit.

## Complete typed directed interaction inventory

INT-01: Pilot.pilotIntent -> IntentQualifier.pilotIntent : PilotIntent.

INT-02: StationBerthInterface.berthObservation -> DockReadinessQualifier.berthObservation : BerthObservation.

INT-03: FrigateStatusInterface.shipCondition -> DockReadinessQualifier.shipCondition : ShipCondition.

INT-04: RepairService.repairSignal -> ServiceInterlockQualifier.repairSignal : ServiceSignal.

INT-05: ResupplyService.resupplySignal -> ServiceInterlockQualifier.resupplySignal : ServiceSignal.

INT-06: IntentQualifier.qualifiedIntent -> PriorityArbiter.qualifiedIntent : QualifiedIntent.

INT-07: DockReadinessQualifier.monitorReadiness -> LifecycleConsistencyMonitor.dockReadiness : DockReadiness.

INT-08: ServiceInterlockQualifier.monitorInterlock -> LifecycleConsistencyMonitor.serviceInterlock : ServiceInterlock.

INT-09: LifecycleController.monitorPrestate -> LifecycleConsistencyMonitor.lifecyclePrestate : LifecycleState.

INT-10: LifecycleConsistencyMonitor.operationalAssessment -> PriorityArbiter.operationalAssessment : OperationalAssessment.

INT-11: LifecycleController.arbiterPrestate -> PriorityArbiter.lifecyclePrestate : LifecycleState.

INT-12: PriorityArbiter.admittedDirective -> LifecycleController.admittedDirective : AdmittedDirective.

INT-13: LifecycleController.controlProposal -> MovementAndAccessSafetyGate.controlProposal : ControlProposal.

INT-14: DockReadinessQualifier.gateReadiness -> MovementAndAccessSafetyGate.dockReadiness : DockReadiness.

INT-15: ServiceInterlockQualifier.gateInterlock -> MovementAndAccessSafetyGate.serviceInterlock : ServiceInterlock.

INT-16: LifecycleController.lifecycleSnapshot -> LifecycleReporter.lifecycleSnapshot : LifecycleSnapshot.

INT-17: MovementAndAccessSafetyGate.gatedControl -> LifecycleReporter.gatedControl : GatedControl.

INT-18: MovementAndAccessSafetyGate.movementDirective -> DockingControlInterface.movementDirective : MovementDirective.

INT-19: MovementAndAccessSafetyGate.serviceAccess -> DockingControlInterface.serviceAccess : ServiceAccess.

INT-20: LifecycleReporter.pilotReport -> Pilot.pilotReport : PilotLifecycleReport.

INT-21: LifecycleReporter.stationReport -> StationBerthInterface.stationReport : StationAccessReport.

INT-AUDIT-01: The complete post-selection recount is exactly 21 semantic interactions: five boundary-input deliveries, twelve owner-to-owner fact flows, and four boundary-output deliveries. The two lifecycle-prestate deliveries, qualifier fan-outs, and gated-control delivery are distinct consumer relationships; physical delegation or routing hops shall refine one listed INT and earn no new semantic-interaction credit.

## Owner-local total relations

LOCAL-01: PART-01 shall map INVALID to INTENT_FAULT; FRESH_DOCK, FRESH_UNDOCK, and FRESH_RESET to their corresponding request values; and NONE or any repeated intent to NO_ACTION.

LOCAL-02: PART-02 shall first map either invalid input to READINESS_FAULT; otherwise the exact pairs APPROACH_CLEAR/APPROACH_READY, DOCKED_SECURE/SERVICE_READY, DEPARTURE_CLEAR/DEPARTURE_READY, and RELEASED/TRANSIT map respectively to DOCK_READY, SERVICE_READY, UNDOCK_READY, and RELEASE_CONFIRMED; any noninvalid pair containing BLOCKED or NOT_READY maps to TEMPORARILY_BLOCKED; all remaining pairs map to READINESS_CONFLICT.

LOCAL-03: PART-03 shall first map either FAULT or INVALID signal to SERVICE_FAULT; two QUIESCENT signals to QUIESCENT; exactly one REQUEST with the other QUIESCENT to SINGLE_DEMAND; exactly one ACTIVE with the other QUIESCENT to SINGLE_ACTIVE; exactly one COMPLETE with the other QUIESCENT to SINGLE_COMPLETION; and every remaining pair to SERVICE_CONFLICT.

LOCAL-04: PART-04 shall first map a readiness or service fault to ASSESSMENT_FAULT and a readiness or service conflict to ASSESSMENT_CONFLICT. For remaining values it shall map TEMPORARILY_BLOCKED readiness to TEMPORARILY_BLOCKED; map each lifecycle-compatible combination named by TYPE-05 to its corresponding assessment; and map every unlisted nonfault combination to ASSESSMENT_CONFLICT.

LOCAL-05: PART-04's lifecycle-compatible combinations are: IDLE_OUTSIDE with RELEASE_CONFIRMED/QUIESCENT or DOCK_READY/QUIESCENT; DOCK_CLEARANCE_LATCHED with DOCK_READY/QUIESCENT or SERVICE_READY/QUIESCENT; DOCKED_ACCESS_LOCKED with SERVICE_READY/QUIESCENT, SERVICE_READY/SINGLE_DEMAND, or UNDOCK_READY/QUIESCENT; SERVICE_ACCESS_GRANTED with SERVICE_READY and SINGLE_DEMAND, SINGLE_ACTIVE, QUIESCENT, or SINGLE_COMPLETION; SERVICE_IN_PROGRESS with SERVICE_READY and SINGLE_ACTIVE or SINGLE_COMPLETION; UNDOCK_CLEARANCE_LATCHED with UNDOCK_READY/QUIESCENT or RELEASE_CONFIRMED/QUIESCENT; and RECOVERY_REQUIRED with RELEASE_CONFIRMED/QUIESCENT. These map respectively to the matching OUTSIDE_STABLE, DOCK_ELIGIBLE, DOCK_WAITING, DOCK_CONFIRMED, DOCKED_QUIESCENT, SERVICE_DEMAND_READY, UNDOCK_ELIGIBLE, SERVICE_GRANT_PENDING, SERVICE_OCCUPIED, SERVICE_WITHDRAWN, SERVICE_WITHDRAWN, SERVICE_OCCUPIED, SERVICE_RELEASED, UNDOCK_WAITING, RELEASE_CONFIRMED, and RECOVERY_CLEARABLE values.

LOCAL-06: PART-05 shall implement the first-applicable ordered partition CASE-01 through CASE-20 exactly once, so every `QualifiedIntent × LifecycleState × OperationalAssessment` valuation selects one and only one `AdmittedDirective` without recomputing PART-01 through PART-04.

LOCAL-07: PART-06 shall map each admitted directive and pre-state to the next state and result named in its CASE clause. It shall propose AUTHORIZE_DOCK only while next state is DOCK_CLEARANCE_LATCHED, AUTHORIZE_UNDOCK only while next state is UNDOCK_CLEARANCE_LATCHED, ENABLE_ACCESS only while next state is SERVICE_ACCESS_GRANTED or SERVICE_IN_PROGRESS, and HOLD_MOVEMENT/LOCK_ACCESS otherwise.

LOCAL-08: PART-07 shall output PERMIT_DOCK only for an AUTHORIZE_DOCK proposal with DOCK_READY and QUIESCENT, PERMIT_UNDOCK only for AUTHORIZE_UNDOCK with UNDOCK_READY and QUIESCENT, and HOLD otherwise; it shall output ENABLED only for ENABLE_ACCESS with SERVICE_READY and SINGLE_DEMAND or SINGLE_ACTIVE, and LOCKED otherwise. Therefore movement permission and enabled service access are mutually exclusive even for producer-inconsistent proposals.

LOCAL-09: PART-08 shall map recovery, reset, release, and explicit non-NONE results first; for a NONE result it shall combine next state with GatedControl, reporting INHIBITED/ACCESS_INHIBITED when a clearance or service state has its corresponding permit or access suppressed, and otherwise map outside to OUTSIDE_IDLE/NO_ACCESS, docking clearance to DOCK_PERMITTED/DOCK_EXPECTED, docked locked to DOCKED_READY/ACCESS_AVAILABLE, granted access to SERVICE_GRANTED/ACCESS_RESERVED, active service to SERVICE_ACTIVE/ACCESS_OCCUPIED, and undock clearance to UNDOCK_PERMITTED/DEPARTURE_EXPECTED.

LOCAL-10: PART-08's non-NONE mapping shall send recovery to RECOVERY_REQUIRED/RECOVERY_REQUIRED, reset to RESET_COMPLETE/NO_ACCESS, and release to RELEASE_CONFIRMED/NO_ACCESS. An INHIBITED result shall map the pilot report to INHIBITED while the station report preserves an enabled granted/active access as ACCESS_RESERVED/ACCESS_OCCUPIED, a still-issued movement permit as its corresponding expectation, a docked-locked state as ACCESS_AVAILABLE, and otherwise reports ACCESS_INHIBITED. Dock or undock acceptance shall produce its named pilot permission and station expectation only when GatedControl contains the corresponding permit and otherwise inhibited reports; dock confirmation maps to DOCKED_READY/ACCESS_AVAILABLE; service grant or running maps to its named pilot report and ACCESS_RESERVED/ACCESS_OCCUPIED only when access is ENABLED and otherwise inhibited reports; service finish maps to SERVICE_FINISHED/ACCESS_AVAILABLE; and undock deferral maps to UNDOCK_DEFERRED with station ACCESS_OCCUPIED when access remains enabled or ACCESS_AVAILABLE when next state is docked locked.

## Priority, state, and recovery policy

POL-PRIOR-01: The first applicable case wins in this order: invalid/fault input; lifecycle contradiction or dual-service conflict; recovery reset or recovery hold; service completion; active-service undock deferral; active-service continuation; granted-service activation, hold, or withdrawal; release confirmation; undock-clearance hold; dock confirmation; dock-clearance hold; new undock; new service demand; new dock; fresh-action inhibition; then stable hold.

POL-CONFLICT-01: The required explicit priority conflict occurs when FRESH_UNDOCK coincides with SINGLE_ACTIVE or SINGLE_COMPLETION in SERVICE_IN_PROGRESS: service occupancy or completion wins, no undock permit is issued, the report is UNDOCK_DEFERRED, and the pilot must later supply another FRESH_UNDOCK after the lifecycle returns to DOCKED_ACCESS_LOCKED.

POL-STATE-01: IDLE_OUTSIDE may enter DOCK_CLEARANCE_LATCHED only after eligible dock authorization; docking confirmation enters DOCKED_ACCESS_LOCKED; that state may enter SERVICE_ACCESS_GRANTED or UNDOCK_CLEARANCE_LATCHED; granted access may enter SERVICE_IN_PROGRESS or withdraw to docked locked; service completion returns to docked locked; release confirmation returns undock clearance to idle; any nonrecovery state may enter RECOVERY_REQUIRED on CASE-01 or CASE-02.

POL-REC-01: RECOVERY_REQUIRED shall persist for no action, repeated intent, fresh dock, fresh undock, a blocked or conflicting environment, or any reset other than CASE-03; it shall clear only for FRESH_RESET with RELEASE_CONFIRMED/QUIESCENT producing RECOVERY_CLEARABLE.

POL-FRESH-01: Successful reset produces IDLE_OUTSIDE, HOLD, LOCKED, and RESET_COMPLETE and shall not also authorize docking; only a later logical evaluation containing FRESH_DOCK with DOCK_ELIGIBLE may begin another lifecycle.

## Exact nontrivial contract partition

CASE-01: Owner PART-05 with PART-06 result ownership; when QualifiedIntent is INTENT_FAULT or OperationalAssessment is ASSESSMENT_FAULT, select ENTER_RECOVERY_FAULT, next state RECOVERY_REQUIRED, result RECOVERY_LATCHED, and locked/hold proposal.

CASE-02: Owner PART-05 with PART-06 result ownership; otherwise when OperationalAssessment is ASSESSMENT_CONFLICT, select ENTER_RECOVERY_CONFLICT with the same safe next state and proposal while retaining a distinct contradiction trace.

CASE-03: Owner PART-05 with PART-06 result ownership; otherwise in RECOVERY_REQUIRED with RESET_REQUEST and RECOVERY_CLEARABLE, select RESET_RECOVERY, next state IDLE_OUTSIDE, result RESET_COMPLETE, and no movement or access authorization.

CASE-04: Owner PART-05 with PART-06 result ownership; otherwise in RECOVERY_REQUIRED, select HOLD_RECOVERY and preserve the recovery latch for fresh, repeated, absent, blocked, or ineligible requests.

CASE-05: Owner PART-05 with PART-06 result ownership; otherwise in SERVICE_IN_PROGRESS with SINGLE_COMPLETION-derived SERVICE_RELEASED and UNDOCK_REQUEST, select FINISH_SERVICE_DEFER_UNDOCK, return to DOCKED_ACCESS_LOCKED, report UNDOCK_DEFERRED, and require a later fresh undock intent.

CASE-06: Owner PART-05 with PART-06 result ownership; otherwise in SERVICE_IN_PROGRESS with SERVICE_RELEASED, select FINISH_SERVICE, return to DOCKED_ACCESS_LOCKED, and report SERVICE_FINISHED.

CASE-07: Owner PART-05 with PART-06 result ownership; otherwise in SERVICE_IN_PROGRESS with UNDOCK_REQUEST and SERVICE_OCCUPIED, select DEFER_UNDOCK, retain SERVICE_IN_PROGRESS, and report UNDOCK_DEFERRED while access remains proposed enabled.

CASE-08: Owner PART-05 with PART-06 result ownership; otherwise in SERVICE_IN_PROGRESS with NO_ACTION, select HOLD_ACTIVE_SERVICE, retain that state with result NONE, and let PART-07/PART-08 distinguish qualified continuing access from temporarily suppressed access without silently completing service.

CASE-09: Owner PART-05 with PART-06 result ownership; otherwise in SERVICE_ACCESS_GRANTED with SERVICE_OCCUPIED, select START_SERVICE, enter SERVICE_IN_PROGRESS, and report SERVICE_RUNNING.

CASE-10: Owner PART-05 with PART-06 result ownership; otherwise in SERVICE_ACCESS_GRANTED with SERVICE_GRANT_PENDING and NO_ACTION, select HOLD_SERVICE_GRANT, retain granted state, and report SERVICE_GRANTED.

CASE-11: Owner PART-05 with PART-06 result ownership; otherwise in SERVICE_ACCESS_GRANTED with SERVICE_WITHDRAWN, select WITHDRAW_SERVICE_GRANT, return to DOCKED_ACCESS_LOCKED, report INHIBITED, and lock access.

CASE-12: Owner PART-05 with PART-06 result ownership; otherwise in UNDOCK_CLEARANCE_LATCHED with RELEASE_CONFIRMED, select CONFIRM_RELEASE, enter IDLE_OUTSIDE, and report RELEASED.

CASE-13: Owner PART-05 with PART-06 result ownership; otherwise in UNDOCK_CLEARANCE_LATCHED with NO_ACTION, select HOLD_UNDOCK_CLEARANCE, retain the state with result NONE, and let PART-07/PART-08 continue or visibly suppress the current permit according to current readiness and service quiescence.

CASE-14: Owner PART-05 with PART-06 result ownership; otherwise in DOCK_CLEARANCE_LATCHED with DOCK_CONFIRMED, select CONFIRM_DOCK, enter DOCKED_ACCESS_LOCKED, and report DOCK_CONFIRMED.

CASE-15: Owner PART-05 with PART-06 result ownership; otherwise in DOCK_CLEARANCE_LATCHED with NO_ACTION, select HOLD_DOCK_CLEARANCE, retain the state with result NONE, and let PART-07/PART-08 continue or visibly suppress the current permit according to current readiness and service quiescence.

CASE-16: Owner PART-05 with PART-06 result ownership; otherwise in DOCKED_ACCESS_LOCKED with UNDOCK_REQUEST and UNDOCK_ELIGIBLE, select AUTHORIZE_UNDOCK, enter UNDOCK_CLEARANCE_LATCHED, and report UNDOCK_ACCEPTED.

CASE-17: Owner PART-05 with PART-06 result ownership; otherwise in DOCKED_ACCESS_LOCKED with SERVICE_DEMAND_READY, select GRANT_SERVICE_ACCESS, enter SERVICE_ACCESS_GRANTED, and report SERVICE_GRANTED; a simultaneous undock intent is inhibited because the assessment is not UNDOCK_ELIGIBLE.

CASE-18: Owner PART-05 with PART-06 result ownership; otherwise in IDLE_OUTSIDE with DOCK_REQUEST and DOCK_ELIGIBLE, select AUTHORIZE_DOCK, enter DOCK_CLEARANCE_LATCHED, and report DOCK_ACCEPTED.

CASE-19: Owner PART-05 with PART-06 result ownership; otherwise any remaining DOCK_REQUEST, UNDOCK_REQUEST, or RESET_REQUEST selects INHIBIT_ACTION, preserves its pre-state, reports INHIBITED, and proposes state-consistent safe outputs without retaining the fresh intent.

CASE-20: Owner PART-05 with PART-06 result ownership; every remaining valuation necessarily has NO_ACTION and selects HOLD_STABLE, preserves its pre-state with result NONE, and proposes state-consistent outputs subject to PART-07's current-condition gate.

CASE-AUDIT-01: CASE-01 through CASE-20 are ordered, mutually exclusive by first-applicable semantics, and exhaustive because CASE-19 consumes every remaining fresh action and CASE-20 is the typed NO_ACTION remainder. Each case owns a distinct initiating class, state transition, priority trace, safety response, or recovery behavior; initialization, output restatements, and unreachable producer-inconsistent records receive no case credit.

## Required scenario families

SCN-01: Nominal dock-service-undock traces FRESH_DOCK with DOCK_ELIGIBLE to a dock permit, DOCK_CONFIRMED to docked locked, one repair REQUEST to enabled access, ACTIVE to service in progress, COMPLETE to docked locked, a later FRESH_UNDOCK with UNDOCK_ELIGIBLE to an undock permit, and RELEASE_CONFIRMED to idle outside.

SCN-02: Resupply and mutual exclusion traces a sole resupply REQUEST to the same generic access grant, then simultaneous nonquiescent repair and resupply signals to SERVICE_CONFLICT and RECOVERY_REQUIRED without asserting a movement permit or enabled access.

SCN-03: Readiness inhibition traces a fresh dock with blocked readiness to no permit and INHIBITED, a repeated dock after readiness becomes eligible to no state advance, and a later distinct FRESH_DOCK to authorization.

SCN-04: Undock priority conflict traces FRESH_UNDOCK during SINGLE_ACTIVE to UNDOCK_DEFERRED with service retained, then FRESH_UNDOCK simultaneous with SINGLE_COMPLETION to service closure but no undock authorization, followed by a later fresh undock that is eligible.

SCN-05: Clearance persistence and gating traces loss of DOCK_READY after docking authorization and loss of UNDOCK_READY after undocking authorization; the lifecycle latch persists in each case while PART-07 withdraws the current permit, and the permit returns only when compatible readiness returns.

SCN-06: Contradiction containment traces an invalid ship condition, mismatched berth/ship condition, and unexpected service activity outside docked access into fault or conflict assessment and the same safe recovery latch, with no claim that the physical cause is known.

SCN-07: Recovery and fresh re-entry traces repeated reset and fresh reset with nonreleased or nonquiescent context failing to clear, then FRESH_RESET with RELEASE_CONFIRMED/QUIESCENT clearing to idle with RESET_COMPLETE, and a later distinct eligible FRESH_DOCK starting a new lifecycle.

SCN-AUDIT-01: The exact seven families cover end-to-end nominal lifecycle, repair/resupply exclusion, fresh-request inhibition, explicit undock/service priority, clearance gating, invalid and contradictory evidence, and complete recovery/re-entry; no family is a renamed valuation of another.

## Structural and realization bounds

STRUCT-01: The accepted semantic architecture shall contain exactly one explicit root system usage, exactly eight reachable responsibility-bearing usages realizing PART-01 through PART-08, exactly 21 end-to-end semantic interactions realizing INT-01 through INT-21, semantic containment depth 1..2 beneath the root, and one weakly connected semantic region.

STRUCT-02: A realization may introduce at most one behavior-free support container and the minimum delegation routes required by trusted SysML-AADL containment; each shall carry a generated-support justification and receive no semantic usage, owner, interaction, case, or scenario credit.

STRUCT-03: All eight usages shall participate in a boundary-relevant behavioral path, duplicated value delivery to different consumers shall remain distinct, and concrete routing hops shall refine exactly one INT identifier rather than alter the semantic recount.

STRUCT-04: PART-06 shall remain the only persistent state owner; INT-09 and INT-11 publish retained pre-state and shall not be realized as same-evaluation algebraic feedback, copied state in PART-04 or PART-05, or extra semantic interactions.

## Analysis, trace, and evidence obligations

ANALYSIS-01: A retained deterministic dependency-free bounded analyzer shall enumerate exactly `8 * 6 * 6 * 6 * 6 * 7 = 72,576` boundary-input/pre-state snapshots and independently check LOCAL-01 through LOCAL-10, the CASE-01 through CASE-20 selection, next state, all four outputs, mutual exclusions, gaps, overlaps, and reachability of every credited case.

ANALYSIS-02: The analyzer shall retain ordered state-carrying traces for SCN-01 through SCN-07, including fresh-versus-repeated behavior, permit withdrawal and restoration, simultaneous service/undock priority, recovery persistence, reset separation, and later fresh re-entry; this is finite conformance evidence, not temporal or physical proof.

TRACE-01: Every actionable identifier in this abstract shall trace to one or more model elements or be explicitly deferred, and every significant model component, port, connection, state, contract clause, and analyzer relation shall trace back or carry a specific generated-support justification.

TRACE-02: Local contracts shall preserve owner locality: each PART may consume only its inventoried inputs and PART-06's owned pre-state where listed, and neither the root nor analyzer may conceal centralized recomputation or forwarding-only credit.

VER-01: Source and contract inspection shall verify every BEH-equivalent CASE and FAULT-equivalent CASE-01 through CASE-04 obligation by finding an owner-local clause with the stated condition and result; the objective criterion is one covered clause set per CASE-01 through CASE-20 with no conflicting guarantee.

VER-02: Structural analysis and independent Sireum typechecking shall verify the exact root, usage, connection, type-direction, containment, and trace obligations; the objective criterion is all structural PASS clauses satisfied and both retained source gates green.

VER-03: Designer validation shall separately compare the generated model and scenario evidence with NEED-01, PURPOSE-01, the source claim boundary, all seven scenario families, and the diversity obligations; mechanical success alone shall not establish fitness.

## Objective pass criteria and final audit

PASS-01: Structural inspection shall report exactly one root, eight credited semantic usages, 21 semantic interactions, containment depth 1..2, one weak semantic region, no padded owner, and no unexplained usage or interaction.

PASS-02: Boundary/type inspection shall find exactly MON-01 through MON-05 and CTRL-01 through CTRL-04 with their stated finite domains and no cargo-transfer or physical-mechanism quantity.

PASS-03: Interaction inspection shall match INT-01 through INT-21 one-for-one end to end and preserve the exact recount of five boundary inputs, twelve inter-usage flows, and four boundary outputs after routing refinements.

PASS-04: Ownership inspection shall find a reviewable local derivation for all eight PART usages, PART-06 as sole persistent state owner, at least PART-02/PART-03/PART-04/PART-05 as cooperating qualification or decision owners, and no forwarding-only credited usage or central recomputation.

PASS-05: Contract analysis shall show exactly 20 credited nontrivial cases, first-applicable exclusivity, exhaustive coverage of all 72,576 snapshots, reachability of every credited case, complete outputs, the CASE-05/CASE-07 priority behavior, and no initialization or duplicated guarantee used as padding.

PASS-06: Scenario evidence shall contain all seven distinct SCN families with required states and boundary outcomes, including fresh request, mutual exclusion, priority conflict, permission gating, recovery, reset, and later re-entry traces.

PASS-07: Architecture-stage, final, and independent-harness Sireum typechecking shall pass with resolved, direction-compatible, type-compatible endpoints and well-typed owner-local contracts.

PASS-08: Bidirectional trace analysis shall report no missing actionable abstract identifier and no unexplained significant model element; generated support shall have specific rationale and no semantic credit.

PASS-09: The retained analyzer shall deterministically complete the 72,576-snapshot enumeration and seven ordered traces within the harness watchdog with zero local-relation, partition, priority, transition, output, or reachability mismatch.

PASS-10: The sole `system-overview` shall bind to the accepted source revision and visibly preserve the five-input/four-output boundary, eight responsibilities, sole state owner, dual-service interlock, lifecycle topology, priority conflict, and recovery path without presenting context or routing support as semantic usages.

PASS-11: Final Designer review shall confirm that cargo transfer remains external context at most, the organizing state and completion claim concern docking/service access, the system is not a replicate-1 extension or rename, and all assumptions and excluded claims remain explicit.

AUDIT-FINAL-01: The retained initial tuple is exactly `8 semantic usages / 21 semantic interactions / 20 nontrivial contract cases / 7 scenario families`, within the declared medium bounds `8..12 / 15..21 / 12..20 / 6..9`, and every credited item has a distinct responsibility, directed fact flow, behavioral partition, or state-carrying trace.

AUDIT-FINAL-02: Owner closure is complete: PART-01 owns fresh intent qualification, PART-02 readiness, PART-03 service exclusion, PART-04 lifecycle-relative assessment, PART-05 ordered directives, PART-06 persistent state and proposals, PART-07 public control gating, and PART-08 stakeholder reports; every CASE names PART-05/PART-06 result ownership and no support element is credited.

AUDIT-FINAL-03: Finite closure includes initialization, no and repeated intent, eligible and inhibited fresh dock, docking confirmation and permit withdrawal, sole-service grant/activation/completion, repair-resupply conflict, eligible and deferred fresh undock, release confirmation, invalid and contradictory evidence, recovery persistence, blocked and successful fresh reset, and later fresh re-entry; INT-01 through INT-21 remain the complete recounted inventory after all revisions.

## Diversity, deferred work, and exclusions

DIV-01: The closest replicate-1 baseline is the Station Cargo-Transfer Verification Supervisor, but this system has no offload request, cargo availability, ship-transfer evidence, warehouse receipt evidence, offload command, receipt query, transfer session, or verified-transfer terminal outcome.

DIV-02: Genuine differences span boundary, state ownership, interaction topology, priority policy, and recovery policy: the boundary observes berth/ship readiness and two docked services; PART-06 owns a reusable docking/service lifecycle rather than a transfer session; PART-03 and PART-04 converge dual-service and phase evidence rather than reconcile ship/warehouse completion; active service outranks undock rather than undock preempting transfer; and recovery requires released/quiescent context before a later dock request rather than neutral transfer evidence before a later offload.

DIV-03: Cargo transfer may occur externally after generic service access is enabled, but no cargo fact enters the boundary and no cargo outcome changes lifecycle state; therefore adding or deleting an external cargo activity would not alter the supervisor's controlled purpose or completion claim.

DEFER-01: Physical docking and undocking, docking duration, berth mechanics, travel, mining, ore-hold supervision, cargo transfer and verification, repair execution or quality, resupply execution or adequacy, capacitor physics, and combat are outside the boundary.

DEFER-02: Timeouts, retries, multiple frigates or berths, concurrent services, service identity continuity, transaction identifiers, probabilities, severity classifications, safety, certification, production readiness, and game fidelity are not claimed.

DEFER-03: The seed does not declare an executable profile, so code generation, application execution, concrete scenario manifests, scheduler behavior, Logika proof, formal proof, and unbounded temporal verification remain explicitly not run.
