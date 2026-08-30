---
abstract_id: SA-DRONE-BAT-02R
run_id: 20260813T155231Z-drone-governor-medium-r2-a1
domain_seed: drone-logical-domain-20260812t143051z
campaign_complexity: medium
architecture_node_count: 9
non_root_architecture_node_count: 9
semantic_usage_count: 8
semantic_interaction_count: 21
nontrivial_contract_case_count: 20
scenario_family_count: 7
containment_depth_beneath_root: 2
root_system_usage_count: 1
generated_support_usage_count: 1
generated_support_route_count: 10
source_port_connection_declaration_count: 31
weakly_connected_semantic_region_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Battery Evidence and Charge Qualification Supervisor — Approved System Abstract

## Need, purpose, goals, and operating context

NEED-01: A logical drone needs a bounded supervisory function that turns qualitative battery evidence, charger-path observations, charge requests, and contextual lifecycle information into explicit battery-readiness evidence, low-battery notification, and qualified logical charging permission without controlling drone lifecycle.

PURPOSE-01: The Battery Evidence and Charge Qualification Supervisor shall qualify battery evidence, determine whether a charge request is presently applicable, arbitrate cancellation and revocation against fresh requests, retain a logical charge-permission session, and publish battery-awareness outcomes to a pilot and flight-control recipient.

GOAL-01: The system shall never report battery readiness as ready when the battery status check is invalid or the qualitative capacity indication is low.

GOAL-02: The system shall enable logical charge permission only after an eligible fresh request and shall revoke it when battery evidence, charger availability, or lifecycle context ceases to satisfy the selected qualification policy.

GOAL-03: The system shall provide distinct pilot and flight-control battery-awareness results while making no physical charging, endurance, flight-dynamics, or safety claim.

CAP-01: Principal capabilities are battery-evidence qualification, contextual charge applicability, charger-path qualification, eligibility and recovery assessment, charge-intent arbitration, charge-session state control, flight-control battery notice classification, and pilot-status assessment.

SEM-01: One logical evaluation observes the six current boundary inputs and the pre-evaluation charge-session state, derives qualifications and one effective charge decision, and commits at most one next charge-session state. This is deterministic pilot semantics, not a timing or scheduler claim.

## Evidence and claim strata

PROV-HBK-01: Handbook-derived methodology requires an explicit system boundary, cohesive responsibilities, finite and complete behavior partitions, unique trace identifiers, considered alternatives, explicit assumptions, objective verification criteria, and separate verification and validation; these are process constraints rather than drone facts.

PROV-SEED-01: The frozen seed grounds qualitative battery-capacity indication, battery-status checking, a low-battery notification toward flight control, battery and charging support, a charger and charging interface, the five lifecycle names, and beginning/ending charging vocabulary.

PROV-SEED-02: The seed does not establish command authority, charge-request initiators, charger observations, battery thresholds, transition guards, priority, recovery, timing, physical charging response, flight-readiness policy, or operational consequences of low charge; inconsistent engine counts are excluded.

PROV-PILOT-01: This abstract introduces a pilot charge-request role, finite validity and observation domains, logical charge-session state, lifecycle-context applicability, deterministic evaluation, priority, revocation, suspension, and re-entry rules as explicit experiment assumptions.

PROV-ARCH-01: The approved architecture contains exactly eight cooperating semantic usages and the 21 typed directed semantic interactions enumerated here, plus exactly one behavior-free generated-support Process and ten support delegations required by the selected physical containment mapping; support earns no semantic credit.

PROV-DEFER-01: Physical current flow, battery chemistry, charge rate, state-of-charge percentage, endurance, timing, engine behavior, flight dynamics, takeoff, landing, return-to-home, navigation, fire observation, hazard severity, certification, code generation, execution, and formal proof are deferred and shall not be reported as realized.

## Scope and system boundary

SCOPE-IN-01: Inside the modeled boundary are the eight logical responsibilities in `PART-01` through `PART-08`, the three-valued charge-session state, the listed qualifications and decisions, and four controlled logical outputs.

SCOPE-OUT-01: The pilot, battery-management source, charger interface, lifecycle-status source, flight-control recipient, aircraft plant, power electronics, physical battery, payload, and environment are outside the modeled boundary.

CTX-01: The Pilot supplies at most one charge request per logical evaluation and receives a consolidated battery status. The pilot is source-grounded as a battery observer; assigning this actor a charge-request role is a pilot abstraction and does not establish real command authority.

CTX-02: The Battery-Management Source supplies a qualitative capacity indication and an independent status-check result; it does not expose a percentage, rate, endurance estimate, or physical fault diagnosis.

CTX-03: The Charger Interface supplies connection and observed-activity indications and receives logical charge permission. The permission is an authorization category, not proof that electrical charging starts or stops.

CTX-04: The Lifecycle-Status Source supplies the source-named lifecycle value only as context for charging applicability and notices; this system neither owns nor changes that lifecycle value.

CTX-05: The Flight-Control Recipient receives battery-readiness advice and a battery notice; neither output authorizes flight or commands a maneuver.

## Exact finite boundary inputs

MON-01: `batteryCapacity : BatteryCapacityBand` is supplied by `CTX-02` and has exactly `{LOW, USABLE}`; it is qualitative and unitless.

MON-02: `batteryCheck : BatteryCheck` is supplied by `CTX-02` and has exactly `{INVALID, VALID}`; `INVALID` makes the simultaneous capacity band unavailable as evidence.

MON-03: `chargerConnection : ChargerConnection` is supplied by `CTX-03` and has exactly `{DISCONNECTED, CONNECTED}`.

MON-04: `chargeActivity : ChargeActivity` is supplied by `CTX-03` and has exactly `{INACTIVE, ACTIVE}`; it is a logical observation and carries no electrical magnitude.

MON-05: `lifecycleContext : LifecycleContext` is supplied by `CTX-04` and has exactly `{OFF, STANDBY, CHARGING, READY, FLYING}`; it is contextual input, never principal state.

MON-06: `chargeRequest : ChargeRequest` is supplied by `CTX-01` and has exactly `{NO_REQUEST, REQUEST_CHARGE, CANCEL_CHARGE}`.

## Exact finite controlled outputs

CTRL-01: `chargePermission : ChargePermission` is delivered to `CTX-03` and has exactly `{DISABLED, ENABLED}`; only the logical permission is controlled.

CTRL-02: `batteryReadinessAdvice : BatteryReadinessAdvice` is delivered to `CTX-05` and has exactly `{UNAVAILABLE, NOT_READY, READY}`; it is battery evidence only, not total flight readiness or flight authorization.

CTRL-03: `flightControlBatteryNotice : FlightControlBatteryNotice` is delivered to `CTX-05` and has exactly `{CLEAR, LOW_BATTERY, LOW_IN_FLIGHT_CONTEXT, EVIDENCE_UNAVAILABLE}`; the contextual distinction is not a hazard-severity classification.

CTRL-04: `pilotBatteryStatus : PilotBatteryStatus` is delivered to `CTX-01` and contains five GUMBO-inspected `attribute` fields: one battery assessment, one charger-path qualification, one pilot-session projection, one pilot-disposition projection, and one `PilotAdvisory`. The pilot-session and pilot-disposition fields use the distinct classifiers in `TYPE-10`; their literals and meanings remain extensionally identical to `TYPE-06` and the disposition domain in `TYPE-07`. This is semantic status, not a display layout.

## Exact finite internal and representation concepts

TYPE-01: `BatteryAssessment` has exactly `{UNAVAILABLE, LOW, ADEQUATE}`.

TYPE-02: `ChargerPathQualification` has exactly `{UNAVAILABLE, READY, ACTIVE}`.

TYPE-03: `ChargeContextQualification` has exactly `{BLOCKED_EVIDENCE, BLOCKED_CONTEXT, ELIGIBLE}`.

TYPE-04: `ChargeEligibilityEnvelope` has exactly `{ELIGIBLE, BLOCKED_EVIDENCE, RECOVER_EVIDENCE, BLOCKED_CHARGER, RECOVER_CHARGER, BLOCKED_CONTEXT, RECOVER_CONTEXT}`; a `RECOVER_*` value is emitted only when pre-session state is `ENABLED`.

TYPE-05: `ChargeDecision` has exactly `{NO_CHANGE, AUTHORIZE, TERMINATE, RECOVER_EVIDENCE, RECOVER_CHARGER, RECOVER_CONTEXT, REJECT_EVIDENCE, REJECT_CHARGER, REJECT_CONTEXT}`.

TYPE-06: `ChargeSessionState` has exactly `{IDLE, ENABLED, SUSPENDED}` and is unrelated to the five-valued drone lifecycle. `ENABLED` means logical charge permission is active; `SUSPENDED` records completed revocation and requires a later fresh eligible request for re-entry.

TYPE-07: `ChargeDisposition` has exactly `{NO_CHANGE, ACCEPTED, REJECTED, RECOVERY_APPLIED}` and `ChargeReason` has exactly `{NONE, CANCELLED, EVIDENCE_UNAVAILABLE, CHARGER_UNAVAILABLE, CONTEXT_INELIGIBLE}`.

TYPE-08: `ChargeSessionSnapshot` contains four GUMBO-inspected `attribute` fields: `preSession : SnapshotPreSessionState`, `nextSession : SnapshotNextSessionState`, `disposition : SnapshotChargeDisposition`, and `reason : ChargeReason`; every field shall be assigned on every decision path. The first three classifiers are field-specific representations defined by `TYPE-10`.

TYPE-09: `PilotAdvisory` has exactly `{NONE, EVIDENCE_UNAVAILABLE, CHARGER_UNAVAILABLE, CONTEXT_INELIGIBLE, ACTIVITY_WITHOUT_PERMISSION, CHARGE_RECOMMENDED, REQUEST_REJECTED}`.

TYPE-10: `SnapshotPreSessionState`, `SnapshotNextSessionState`, and `PilotSessionState` each have exactly `{IDLE, ENABLED, SUSPENDED}`; `SnapshotChargeDisposition` and `PilotChargeDisposition` each have exactly `{NO_CHANGE, ACCEPTED, REJECTED, RECOVERY_APPLIED}`. These five field-specific enum classifiers are representation projections only, preserve the meanings of `TYPE-06` and `TYPE-07`, and receive no owner, semantic-usage, interaction, or nontrivial-case credit.

## Selected semantic usages and distinct responsibilities

PART-01: `BatteryEvidenceQualifier` shall derive `BatteryAssessment` from the independently varying capacity band and status check, with invalidity precedence; it shall not copy or rename either input.

PART-02: `ChargeContextQualifier` shall jointly derive charge-context applicability and battery-readiness advice from `BatteryAssessment` and contextual lifecycle value; it does not own lifecycle state.

PART-03: `ChargerPathQualifier` shall derive whether the charger path is unavailable, connected-and-ready, or connected-and-active from connection and activity observations, with disconnection precedence.

PART-04: `ChargeEligibilityRecoveryOwner` shall combine charge-context qualification, charger-path qualification, and pre-evaluation charge-session state to derive one eligibility/recovery envelope with explicit reason precedence.

PART-05: `ChargeIntentArbiter` shall derive one charge decision from a fresh request and the eligibility/recovery envelope, resolving the explicit `CANCEL_CHARGE` versus recovery versus fresh-request priority conflict.

PART-06: `ChargeSessionController` shall be the sole owner of initialized `ChargeSessionState`, commit its next value from the arbitrated decision, derive `chargePermission`, and publish a fully assigned decision snapshot.

PART-07: `FlightControlBatteryNoticePolicy` shall derive the flight-control battery notice jointly from battery assessment and raw lifecycle context, distinguishing low battery in `FLYING` context without changing lifecycle or authorizing flight.

PART-08: `PilotBatteryStatusPolicy` shall combine battery assessment, charger-path qualification, and the charge-session snapshot to derive a precedence-selected pilot advisory and consolidate status; copied status fields and projection mappings do not independently earn owner credit.

## Decision, state, and ownership audit

OWNER-01: `BatteryEvidenceQualifier` is a qualification owner because cases 01–03 derive a three-valued fact from four raw combinations with validity precedence.

OWNER-02: `ChargeContextQualifier` is a cooperating qualification owner because cases 07–09 combine a three-valued assessment with five lifecycle contexts into applicability and readiness facts; it neither owns nor transitions lifecycle.

OWNER-03: `ChargerPathQualifier` is a qualification owner because cases 04–06 combine connection and activity observations with disconnection precedence and preserve the ready-versus-active distinction.

OWNER-04: `ChargeEligibilityRecoveryOwner` is a cooperating decision owner because cases 10–13 combine upstream qualifications with pre-session state, choose eligibility versus one recovery proposal, and resolve competing evidence, charger, and context reasons.

OWNER-05: `ChargeIntentArbiter` is a priority decision owner because cases 14–16 resolve cancellation, recovery, request, rejection, and no-request results; `ChargeSessionController` is the only state owner because cases 17–18 and initialization alone write charge-session state.

OWNER-06: `FlightControlBatteryNoticePolicy` owns the contextual notice classification in case 19, and `PilotBatteryStatusPolicy` owns only the advisory precedence in case 20. Routing, copied fields, and one-to-one field projections receive no usage or owner credit.

## Complete typed directed semantic interaction inventory

INT-01: The root boundary sends `batteryCapacity : BatteryCapacityBand` to `BatteryEvidenceQualifier`.

INT-02: The root boundary sends `batteryCheck : BatteryCheck` to `BatteryEvidenceQualifier`.

INT-03: The root boundary sends `chargerConnection : ChargerConnection` to `ChargerPathQualifier`.

INT-04: The root boundary sends `chargeActivity : ChargeActivity` to `ChargerPathQualifier`.

INT-05: The root boundary sends `lifecycleContext : LifecycleContext` to `ChargeContextQualifier`.

INT-06: The root boundary independently sends `lifecycleContext : LifecycleContext` to `FlightControlBatteryNoticePolicy`.

INT-07: The root boundary sends `chargeRequest : ChargeRequest` to `ChargeIntentArbiter`.

INT-08: `BatteryEvidenceQualifier` sends `batteryAssessment : BatteryAssessment` to `ChargeContextQualifier`.

INT-09: `BatteryEvidenceQualifier` sends `batteryAssessment : BatteryAssessment` to `FlightControlBatteryNoticePolicy`.

INT-10: `BatteryEvidenceQualifier` sends `batteryAssessment : BatteryAssessment` to `PilotBatteryStatusPolicy`.

INT-11: `ChargerPathQualifier` sends `chargerPathQualification : ChargerPathQualification` to `ChargeEligibilityRecoveryOwner`.

INT-12: `ChargerPathQualifier` sends `chargerPathQualification : ChargerPathQualification` to `PilotBatteryStatusPolicy`.

INT-13: `ChargeContextQualifier` sends `chargeContextQualification : ChargeContextQualification` to `ChargeEligibilityRecoveryOwner`.

INT-14: `ChargeSessionController` sends `currentChargeSession : ChargeSessionState` to `ChargeEligibilityRecoveryOwner`; this is the committed pre-evaluation state, not the concurrently computed next state.

INT-15: `ChargeEligibilityRecoveryOwner` sends `chargeEligibilityEnvelope : ChargeEligibilityEnvelope` to `ChargeIntentArbiter`.

INT-16: `ChargeIntentArbiter` sends `chargeDecision : ChargeDecision` to `ChargeSessionController`.

INT-17: `ChargeSessionController` sends `chargeSessionSnapshot : ChargeSessionSnapshot` to `PilotBatteryStatusPolicy`.

INT-18: `ChargeSessionController` sends `chargePermission : ChargePermission` to the root boundary.

INT-19: `ChargeContextQualifier` sends `batteryReadinessAdvice : BatteryReadinessAdvice` to the root boundary.

INT-20: `FlightControlBatteryNoticePolicy` sends `flightControlBatteryNotice : FlightControlBatteryNotice` to the root boundary.

INT-21: `PilotBatteryStatusPolicy` sends `pilotBatteryStatus : PilotBatteryStatus` to the root boundary.

## Exact architecture metrics and generated-support allowance

CONSTR-01: The physical containment shall be exactly one root `System` containing exactly one behavior-free generated-support `Process`, which contains exactly eight semantic `Thread` usages corresponding one-for-one to `PART-01` through `PART-08`. The exact non-root architecture-node count and exact `architecture_node_count` are both nine; including the root, the physical usage tree contains ten usages; containment depth beneath root is exactly two.

CONSTR-02: The eight semantic Threads shall form exactly one weakly connected semantic region through exactly 21 typed directed semantic interactions, with no omitted, merged, or extra semantic interaction. The lifecycle input intentionally fans out inside the Process to `INT-05` and `INT-06`.

CONSTR-03: The support Process, its boundary ports, and exactly ten root-to-Process delegations shall carry `@generated-support` rationale and no state, decision, domain behavior, local case, `PART-*`, `INT-*`, owner, or semantic-usage credit. The ten routes correspond one-for-one to the six distinct root inputs and four distinct root outputs.

CONSTR-04: Source shall contain exactly 31 `PortConnection` declarations: the 21 semantic `INT-*` connections inside the Process plus ten root/Process support delegations. The root and Process shall only route and shall not restate Thread-local relations; the single supported lifecycle input route may fan out inside the Process to `INT-05` and `INT-06`.

## Initialization, priority, and recovery policy

INIT-01: `ChargeSessionState` shall initialize to `IDLE`; initial `chargePermission` shall be `DISABLED`; initial readiness and notice outputs shall follow current inputs; and initial pilot status shall project current battery and charger qualifications, session `IDLE`, disposition `NO_CHANGE`, and the `PRI-03` advisory. Initialization is required but is not one of the 20 nontrivial cases.

PRI-01: Charge-intent priority shall be `CANCEL_CHARGE` over an applicable `RECOVER_*` envelope over `REQUEST_CHARGE` over `NO_REQUEST`. Cancellation wins even when revocation is simultaneously required, and recovery preempts a simultaneous request.

PRI-02: Eligibility/recovery reason precedence shall be invalid battery evidence before unavailable charger path before blocked lifecycle context. This deterministic ordering is not a safety-severity claim.

PRI-03: Pilot-advisory priority shall be: unavailable battery assessment; then `RECOVERY_APPLIED` paired with exactly one of `EVIDENCE_UNAVAILABLE`, `CHARGER_UNAVAILABLE`, or `CONTEXT_INELIGIBLE`; then charger activity observed while next-session permission is not enabled; then low battery; then rejected request; then `NONE`. A structurally valid `RECOVERY_APPLIED` paired with `NONE` or `CANCELLED` does not enter the recovery branch and continues through the remaining priorities.

REC-01: If pre-session state is `ENABLED` and any qualification becomes ineligible, the recovery owner shall propose exactly one reason-selected recovery; applying it moves the session to `SUSPENDED` and disables permission in the same logical evaluation.

REC-02: `SUSPENDED` is the completed logical recovery state. Clearing the initiating condition does not automatically enable permission; `NO_REQUEST` holds `SUSPENDED`, an ineligible `REQUEST_CHARGE` is rejected, and a later eligible fresh `REQUEST_CHARGE` returns the session to `ENABLED`.

REC-03: `CANCEL_CHARGE` moves any pre-session state to `IDLE` with permission disabled. This is logical session termination and makes no claim that observed physical charge activity immediately stops.

## Exact owner-local nontrivial contract-case partition

BEH-BAT-01 / CASE-01: If `batteryCheck = INVALID`, `BatteryEvidenceQualifier` shall output `UNAVAILABLE` for either capacity band; exhaustive local analysis shall show both applicable combinations yield only `UNAVAILABLE`.

BEH-BAT-02 / CASE-02: If `batteryCheck = VALID` and `batteryCapacity = LOW`, `BatteryEvidenceQualifier` shall output `LOW`.

BEH-BAT-03 / CASE-03: If `batteryCheck = VALID` and `batteryCapacity = USABLE`, `BatteryEvidenceQualifier` shall output `ADEQUATE`; cases 01–03 shall be disjoint and cover all four raw combinations.

BEH-CHG-01 / CASE-04: If `chargerConnection = DISCONNECTED`, `ChargerPathQualifier` shall output `UNAVAILABLE` for either activity observation, establishing disconnection precedence.

BEH-CHG-02 / CASE-05: If `chargerConnection = CONNECTED` and `chargeActivity = INACTIVE`, `ChargerPathQualifier` shall output `READY`.

BEH-CHG-03 / CASE-06: If `chargerConnection = CONNECTED` and `chargeActivity = ACTIVE`, `ChargerPathQualifier` shall output `ACTIVE`; cases 04–06 shall be disjoint and cover all four charger combinations.

FAULT-CTX-01 / CASE-07: If battery assessment is `UNAVAILABLE`, `ChargeContextQualifier` shall output `BLOCKED_EVIDENCE` and readiness `UNAVAILABLE` for every lifecycle context.

BEH-CTX-01 / CASE-08: If assessment is `LOW` or `ADEQUATE` and lifecycle context is `STANDBY` or `CHARGING`, `ChargeContextQualifier` shall output `ELIGIBLE` and readiness `NOT_READY` for `LOW`, otherwise `READY`.

BEH-CTX-02 / CASE-09: If assessment is `LOW` or `ADEQUATE` and lifecycle context is `OFF`, `READY`, or `FLYING`, `ChargeContextQualifier` shall output `BLOCKED_CONTEXT` and readiness `NOT_READY` for `LOW`, otherwise `READY`; cases 07–09 shall be disjoint and total over all 15 local combinations.

FAULT-ELIG-01 / CASE-10: If charge-context qualification is `BLOCKED_EVIDENCE`, `ChargeEligibilityRecoveryOwner` shall output `RECOVER_EVIDENCE` exactly when pre-session state is `ENABLED`, otherwise `BLOCKED_EVIDENCE`, regardless of charger-path qualification.

FAULT-ELIG-02 / CASE-11: If evidence is not blocked and charger-path qualification is `UNAVAILABLE`, `ChargeEligibilityRecoveryOwner` shall output `RECOVER_CHARGER` exactly when pre-session state is `ENABLED`, otherwise `BLOCKED_CHARGER`.

FAULT-ELIG-03 / CASE-12: If evidence and charger path are acceptable but charge-context qualification is `BLOCKED_CONTEXT`, `ChargeEligibilityRecoveryOwner` shall output `RECOVER_CONTEXT` exactly when pre-session state is `ENABLED`, otherwise `BLOCKED_CONTEXT`.

BEH-ELIG-01 / CASE-13: If charge-context qualification is `ELIGIBLE` and charger-path qualification is `READY` or `ACTIVE`, `ChargeEligibilityRecoveryOwner` shall output `ELIGIBLE` for every pre-session state; cases 10–13 shall apply `PRI-02`, be disjoint and total over all 27 local combinations.

BEH-ARB-01 / CASE-14: If the fresh request is `CANCEL_CHARGE`, `ChargeIntentArbiter` shall output `TERMINATE` for every envelope, establishing the highest-priority side of `PRI-01` over all seven envelope values.

FAULT-ARB-01 / CASE-15: If the request is not cancellation and the envelope is one of the three `RECOVER_*` values, `ChargeIntentArbiter` shall output the corresponding `RECOVER_*` decision; a simultaneous `REQUEST_CHARGE` is preempted.

BEH-ARB-02 / CASE-16: Otherwise, `REQUEST_CHARGE` with `ELIGIBLE` shall output `AUTHORIZE`, `REQUEST_CHARGE` with a `BLOCKED_*` envelope shall output the corresponding `REJECT_*`, and `NO_REQUEST` shall output `NO_CHANGE`; cases 14–16 shall be priority-ordered, disjoint and total over all 21 arbiter combinations.

BEH-STATE-01 / CASE-17: For `AUTHORIZE`, `TERMINATE`, and the three `RECOVER_*` decisions, `ChargeSessionController` shall respectively select next state `ENABLED`, `IDLE`, or `SUSPENDED`; set disposition to `ACCEPTED`, `ACCEPTED`, or `RECOVERY_APPLIED`; assign reason `NONE`, `CANCELLED`, or the corresponding one of `EVIDENCE_UNAVAILABLE`, `CHARGER_UNAVAILABLE`, and `CONTEXT_INELIGIBLE`; and enable permission exactly for next state `ENABLED`. The producer invariant is that `RECOVERY_APPLIED` is emitted only with those three recovery reasons, never `NONE` or `CANCELLED`.

BEH-STATE-02 / CASE-18: For `NO_CHANGE` or any `REJECT_*` decision, `ChargeSessionController` shall hold pre-session state, set disposition to `NO_CHANGE` or `REJECTED`, assign reason `NONE` or the corresponding rejection reason, and enable permission exactly when the held state is `ENABLED`; cases 17–18 shall cover all 27 state/decision combinations and assign every snapshot field.

BEH-NOTICE-01 / CASE-19: `FlightControlBatteryNoticePolicy` shall output `EVIDENCE_UNAVAILABLE` for unavailable assessment, otherwise `LOW_IN_FLIGHT_CONTEXT` for low assessment with `FLYING`, otherwise `LOW_BATTERY` for low assessment, otherwise `CLEAR`; analysis shall cover all 15 combinations.

BEH-STATUS-01 / CASE-20: `PilotBatteryStatusPolicy` shall project the four required status facts and derive exactly one advisory using `PRI-03`: unavailable assessment first; `RECOVERY_APPLIED` with one of the three explicit recovery reasons second and mapped to the corresponding advisory; charger `ACTIVE` with next session other than `ENABLED` third; low assessment fourth; rejected disposition fifth; otherwise `NONE`. `RECOVERY_APPLIED` with `NONE` or `CANCELLED` shall fall through those remaining branches. Owner credit attaches only to the combined advisory derivation. The case remains one counted case and shall be total and single-valued over all 1,620 structurally type-valid assessment, charger, and snapshot combinations.

## Nominal and off-nominal scenario families

SCN-01: Nominal permission-and-observation family — from `IDLE`, adequate evidence, connected charger, `STANDBY`, and fresh `REQUEST_CHARGE` yield `ENABLED/ACCEPTED`; subsequent connected `ACTIVE` observation retains permission under `NO_REQUEST` and is visible in pilot status.

SCN-02: Low-battery charge-qualification family — low valid evidence in `STANDBY` yields `NOT_READY` and `LOW_BATTERY`, yet a connected charger and fresh request may enable charging permission and issue `CHARGE_RECOMMENDED` to the pilot.

SCN-03: Cancellation-priority family — simultaneous `CANCEL_CHARGE` and any invalidating condition select termination to `IDLE`, not recovery to `SUSPENDED`, proving the explicit cancellation-over-recovery conflict.

SCN-04: Charger-loss conflict family — from `ENABLED`, disconnection produces charger recovery; a simultaneous `REQUEST_CHARGE` is preempted, next state is `SUSPENDED`, and permission is disabled.

SCN-05: Evidence-invalid family — invalid battery evidence produces unavailable readiness and notices; from `ENABLED` it triggers evidence recovery, while from `IDLE` a fresh request is rejected without a state transition.

SCN-06: Context-block family — while permission is enabled, a contextual change to `READY`, `FLYING`, or `OFF` suspends the charge session; low evidence in `FLYING` produces `LOW_IN_FLIGHT_CONTEXT` but the system does not change lifecycle or command flight.

SCN-07: Recovery-clear-and-fresh-re-entry family — after recovery reaches `SUSPENDED`, restored evidence, connected charger, and `STANDBY` with `NO_REQUEST` hold suspension; only a later eligible `REQUEST_CHARGE` returns to `ENABLED`.

## Risks and logical mitigations within the claim boundary

RISK-01: Treating invalid battery evidence as adequate could publish ready evidence or retain charge permission contrary to selected policy; cases 01, 07, 10, 15, and 19 mitigate this logical inconsistency without asserting physical safety.

RISK-02: Ignoring charger loss or contextual inapplicability could retain logical permission after a qualification premise disappears; cases 11–12 and 15–18 revoke permission and require fresh re-entry.

RISK-03: Honoring cancellation, recovery, and a fresh request simultaneously could produce contradictory outcomes; `PRI-01`, the single arbiter, and the single state owner select exactly one result.

RISK-04: Treating an `ACTIVE` observation as proof of authorized charging could conflate external behavior with controlled permission; case 20 reports activity without permission while case 18 determines permission only from session state.

## Essential assumptions and constraints

ASM-01: `CTX-01` supplies exactly one finite request per evaluation and is responsible for choosing its value; the abstract does not authenticate the pilot or establish actual command authority.

ASM-02: `CTX-02` supplies both battery fields and is responsible only for domain-valid enum values; no accuracy, independence, latency, or physical-fault guarantee is assumed.

ASM-03: `CTX-03` supplies connection and activity independently and is responsible only for valid enum values; disconnection overrides activity for path qualification, and neither observation proves electrical behavior.

ASM-04: `CTX-04` supplies a current lifecycle label but retains all lifecycle-state authority. The selected policy permits charge requests only in `STANDBY` or `CHARGING`; this is a pilot abstraction, not a seed fact.

ASM-05: `currentChargeSession` in `INT-14` denotes the pre-evaluation committed state. The state owner publishes `currentChargeSession == In(committedChargeSession)`, initializes state and outputs, computes from pre-state, and commits only post-state; the root and support Process shall not duplicate this relation.

CONSTR-05: The model shall contain exactly one charge-session state owner, at least the cooperating qualification/decision owners in `OWNER-01` through `OWNER-05`, and no lifecycle state variable, lifecycle transition output, power command, flight authorization, or identity-wrapper credit.

CONSTR-06: Owner-local contracts shall implement exactly 20 nontrivial cases one-for-one with `CASE-01` through `CASE-20`; initialization, type well-formedness, and field-projection clauses are separate and do not change the count.

CONSTR-07: Bounded end-to-end analysis shall enumerate all 720 one-evaluation combinations of six boundary inputs and three pre-session states (`2 * 2 * 2 * 2 * 5 * 3 * 3`), compose all eight named owner-local relations through the explicit `INT-*` map, and compare every qualification, decision, state, snapshot field, and controlled output with a separately expressed abstract reference relation.

CONSTR-08: Owner-local finite analysis shall enumerate and report the complete products: battery qualifier 4, charger-path qualifier 4, context qualifier 15, eligibility/recovery owner 27, arbiter 21, state controller 27, notice policy 15, and status policy 1,620 structurally type-valid combinations. For the status policy it shall report exactly one advisory for every input, separately report the producer-reachable subset, verify the case-17 recovery-reason invariant, and retain the 108 structurally valid but producer-unreachable `RECOVERY_APPLIED` plus `NONE/CANCELLED` combinations as fall-through totality checks.

CONSTR-09: Bounded sequence analysis shall exercise all seven scenario families, including conflict, recovery clearing, no-request hold, ineligible fresh request, and eligible fresh re-entry; it proves only bounded logical traces and is not execution or unbounded temporal proof.

## Trace, verification, and objective pass criteria

TRACE-01: Every significant model package, type, component definition and usage, port, semantic connection, state variable, initialization clause, integration clause, and contract clause shall cite one or more identifiers here or carry explicit `@generated-support <reason>` rationale.

TRACE-02: Every canonical identifier here shall be classified in the trace report as realized, informational, or explicitly deferred; missing actionable coverage and unexplained model additions fail the stage.

PASS-01: Structural conformance requires exactly one root System usage, one uncredited support Process, eight credited semantic Threads, nine non-root architecture nodes, depth two, exactly 21 semantic interactions in one weak semantic region, exactly ten support routes, exactly 31 source connection declarations, and no padded owner or usage.

PASS-02: Ownership conformance requires owner-local contracts and bounded evidence for all eight `PART-*` usages, only `ChargeSessionController` writing charge-session state, no component owning lifecycle, no downstream recomputation receiving upstream owner credit, and copied or projected status fields excluded from owner justification.

PASS-03: Behavioral conformance requires exactly 20 nontrivial cases with complete, disjoint, priority-ordered partitions; every controlled output and snapshot field initialized or constrained; the case-17 recovery-reason invariant; exactly one case-20 advisory for all 1,620 structural inputs; separate producer-reachability reporting; and correct cancellation, recovery, rejection, no-request hold, suspension clearing, and fresh-request re-entry behavior.

PASS-04: Mechanical verification requires architecture-stage and final `hamr sysml tipe` success, resolved compatible endpoints, independent harness success, and a retained bounded analyzer tied to the canonical source hash with zero gaps, overlaps, or mismatches for all products and scenarios in `CONSTR-07` through `CONSTR-09`.

PASS-04A: Analyzer evidence shall report end-to-end mismatches, owner-local gaps and overlaps, all eight owner checks, status totality, producer-reachable witnesses, structurally unreachable totality witnesses, scenario results, and source-hash binding separately; the analyzer shall not reproduce owner logic merely as forwarding and shall compare the composition with an independently stated abstract relation.

PASS-05: Trace conformance requires complete bidirectional coverage, explicit generated-support accounting separate from semantic metrics, no extra semantic connection, and no significant unexplained model element.

PASS-06: Validation requires Designer review of source, summary, trace report, bounded evidence, and overview for fitness to this battery-awareness and charge-qualification purpose; typechecking, parser, and renderer success alone are insufficient.

PASS-07: Evidence shall report code generation, application execution, formal proof, physical charging, timing, endurance, flight behavior, safety, certification, and every other deferred claim as `not-run` or deferred, never passed.

## Diversity obligation and authorization

DIV-01: The closest baseline is the accepted replicate-1 Medium Drone Lifecycle Governor, whose principal state and partition govern `OFF/STANDBY/CHARGING/READY/FLYING` transitions and publish lifecycle, power, charging, and flight-authorization outcomes.

DIV-02: This system instead accepts battery/charger evidence, a charge-specific request, and read-only lifecycle context, and controls battery evidence, notices, status, and charge permission; it has no lifecycle request input, lifecycle output, power command, or flight authorization.

DIV-03: Its sole state is `IDLE/ENABLED/SUSPENDED` charge permission; its topology uses parallel battery/charger qualification feeding eligibility and status consumers; cancellation outranks revocation and request; and recovery suspends only charging permission until a fresh eligible re-entry request without changing lifecycle.

DIV-04: The design is not an extension, repartition, or rename of the lifecycle baseline: deleting the read-only lifecycle-context input would leave its primary battery/charger qualification and charge-session purpose recognizable, whereas deleting lifecycle-transition ownership removes the baseline's organizing purpose.

AUTH-01: Model generation is authorized against this approved final baseline. Generation shall preserve the exact semantic `8/21/20/7` tuple, six-input/four-output boundary, exact `9/10/31/depth-2` support metrics, state and decision ownership, field-specific representation classifiers, priorities, complete partitions, seven scenarios, bounded-analysis obligations, generated-support restrictions, and deferred-claim boundary.
