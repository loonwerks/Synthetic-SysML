---
abstract_id: SA-01
run_id: 20260812T160223Z-drone-governor-medium-r1-a1
domain_seed: drone-logical-domain-20260812t143051z
campaign_complexity: medium
node_count: [9, 9]
edge_count: [21, 21]
containment_depth: [2, 2]
semantic_usage_count: [8, 8]
semantic_interaction_count: [21, 21]
nontrivial_contract_case_count: [20, 20]
scenario_family_count: [7, 7]
containment_depth_beneath_root: [2, 2]
root_system_usage_count: [1, 1]
generated_support_usage_count: [1, 1]
generated_support_route_count: [10, 10]
source_port_connection_declaration_count: [31, 31]
weakly_connected_region_count: [1, 1]
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Drone Lifecycle Governor — Approved System Abstract

## Need, purpose, and operational context

NEED-01: A logical drone needs one supervisory boundary that responds deterministically to lifecycle requests while qualifying battery, navigation, radio, and charger observations before changing source-named lifecycle status or authorizing related outcomes.

PURPOSE-01: The Drone Lifecycle Governor shall coordinate the logical lifecycle states `OFF`, `STANDBY`, `CHARGING`, `READY`, and `FLYING`; arbitrate fresh requests against recovery needs; and publish logical power, charging, flight-authorization, and pilot-status outcomes.

CAP-01: The principal capabilities are battery qualification, combined flight-readiness qualification, recovery qualification, request arbitration, lifecycle-state decision, logical command policy, flight authorization, and supervisory status assessment.

MISSION-01: This abstract supports a bounded supervisory lifecycle model for a configurable forest-fire-observation drone product context; it does not define fire observation behavior or a physical flight mission.

SEM-01: One logical evaluation observes current boundary values and the pre-evaluation lifecycle state, derives qualifications and one effective intent, and commits at most one next lifecycle state. This ordering is a deterministic pilot abstraction, not a physical timing or scheduler claim.

## Evidence and claim strata

PROV-HBK-01: Handbook-derived methodology requires an explicit boundary, cohesive responsibilities, finite and complete behavior partitions, unique trace identifiers, alternatives, assumptions, objective verification criteria, and separate verification and validation; these are process constraints, not drone-domain facts.

PROV-SEED-01: The frozen seed grounds the five lifecycle names and event vocabulary for switching, charging, activation, and flight, plus battery-status checking, qualitative capacity indication, low-battery notification, charging context, navigation-related elements, radio communication, and logical power/flight-control capabilities.

PROV-SEED-02: The seed does not ground event initiators, command authority, transition guards, priority, recovery targets, flight dynamics, return-to-home, landing control, timing, safety, or forest-fire mission behavior; the inconsistent engine counts are excluded.

PROV-PILOT-01: This run introduces a ground operator as the lifecycle-request source, finite qualitative status domains, deterministic evaluation semantics, transition guards, priority, and recovery-to-`STANDBY` rules. Each is an explicit experiment assumption rather than a corpus claim.

PROV-ARCH-01: This run selects eight cooperating semantic usages beneath one uncredited generated-support Process and requires exactly the 21 typed directed semantic interactions listed below.

PROV-DEFER-01: Physical actuation, flight dynamics, autonomous navigation, landing, return-to-home, fire detection or mapping, endurance, charging physics, real-time performance, hazard severity, certification, deployment, code generation, execution, and formal proof are deferred and shall not be reported as realized.

## Scope and boundary

SCOPE-IN-01: Inside the modeled boundary are only the eight logical supervisory responsibilities in `PART-01` through `PART-08`, their logical state and decisions, four controlled outputs, and the behavior-free generated support allowed by `SUP-01` through `SUP-03`.

SCOPE-OUT-01: The ground operator, battery-management source, charger interface, navigation source, radio source, logical power/charging recipient, flight-control recipient, aircraft plant, payload, and physical environment are outside the modeled boundary.

CTX-01: The Ground Operator issues at most one value of `LifecycleRequest` per logical evaluation and receives `PilotStatus`; this command role is a pilot abstraction because the seed identifies a pilot only as a battery observer.

CTX-02: The Battery-Management Source provides a qualitative capacity band and an independent status-check result; no physical state-of-charge percentage, discharge rate, or endurance is assumed.

CTX-03: The Charger Interface reports whether a charger is logically connected and receives no physical charging-control detail beyond the governor's enable/disable outcome.

CTX-04: The Navigation Source reports a finite navigation condition without exposing GPS, inertial, or barometric implementation details.

CTX-05: The Radio Source reports a finite communication condition without identifying an external radio peer or protocol.

CTX-06: The Logical Power/Charging Recipient consumes power and charging commands; these are permissions or logical outcomes, not evidence of physical actuation.

CTX-07: The Flight-Control Recipient consumes flight authorization; authorization does not command takeoff, landing, maneuvering, or return-to-home.

## Exact finite boundary inputs

MON-01: `pilotRequest : LifecycleRequest` is supplied by `CTX-01` and has exactly `{NO_REQUEST, SWITCH_ON, SWITCH_OFF, BEGIN_CHARGE, END_CHARGE, ACTIVATE, DEACTIVATE, BEGIN_FLIGHT, END_FLIGHT}`.

MON-02: `chargerState : ChargerState` is supplied by `CTX-03` and has exactly `{DISCONNECTED, CONNECTED}`.

MON-03: `batteryCapacity : BatteryCapacityBand` is supplied by `CTX-02` and has exactly `{LOW, USABLE}`; it is qualitative and unitless.

MON-04: `batteryCheck : BatteryCheck` is supplied by `CTX-02` and has exactly `{INVALID, VALID}`; `INVALID` overrides the capacity band.

MON-05: `navigationCondition : NavigationCondition` is supplied by `CTX-04` and has exactly `{INVALID, NOT_READY, READY}`.

MON-06: `radioCondition : RadioCondition` is supplied by `CTX-05` and has exactly `{INVALID, NOT_READY, READY}`.

## Exact finite controlled outputs

CTRL-01: `powerCommand : PowerCommand` is delivered to `CTX-06` and has exactly `{POWER_OFF, SUPPORT_POWER, FLIGHT_POWER}`; it is a logical authorization category.

CTRL-02: `chargeCommand : ChargeCommand` is delivered to `CTX-06` and has exactly `{CHARGE_DISABLED, CHARGE_ENABLED}`.

CTRL-03: `flightAuthorization : FlightAuthorization` is delivered to `CTX-07` and has exactly `{DENIED, PERMITTED}`.

CTRL-04: `pilotStatus : PilotStatus` is delivered to `CTX-01` and is the finite product of `LifecycleState`, `RequestDisposition`, and `PilotNotice`; its fields are semantic results, not a user-interface layout.

## Finite domain and internal concepts

TYPE-01: `LifecycleState` has exactly `{OFF, STANDBY, CHARGING, READY, FLYING}`.

TYPE-02: `BatteryQualification` has exactly `{UNAVAILABLE, INSUFFICIENT, SUFFICIENT}`.

TYPE-03: `FlightQualification` has exactly `{UNAVAILABLE, NOT_READY, READY}`.

TYPE-04: `RecoveryProposal` has exactly `{NO_RECOVERY, TO_STANDBY_BATTERY, TO_STANDBY_READINESS, TO_STANDBY_CHARGE_PATH}`.

TYPE-05: `EffectiveIntent` has exactly `{NO_INTENT, SWITCH_ON, SWITCH_OFF, BEGIN_CHARGE, END_CHARGE, ACTIVATE, DEACTIVATE, BEGIN_FLIGHT, END_FLIGHT, RECOVER_TO_STANDBY, REJECT_BEGIN_CHARGE}`.

TYPE-06: `EligibilityEnvelope` contains Booleans `flightEligible` and `chargeEligible` plus exactly one `EligibilityReason` from `{NONE, BATTERY_UNAVAILABLE, BATTERY_LOW, FLIGHT_UNAVAILABLE, FLIGHT_NOT_READY, CHARGER_DISCONNECTED}`.

TYPE-07: `DecisionSnapshot` contains `preState : LifecycleState`, `nextState : LifecycleState`, `effectiveIntent : EffectiveIntent`, `transitionResult : TransitionResult`, and `decisionReason : EligibilityReason`; every field has an exact finite domain defined here.

TYPE-08: `TransitionResult` has exactly `{NO_CHANGE, ACCEPTED, REJECTED, RECOVERY_APPLIED, FRESH_REQUEST_PREEMPTED}`.

TYPE-09: `PilotStatus` contains `LifecycleState`, `RequestDisposition` exactly `{NO_CHANGE, ACCEPTED, REJECTED, RECOVERY_APPLIED, PREEMPTED}`, and `PilotNotice` exactly `{NONE, BATTERY_UNAVAILABLE, BATTERY_LOW, FLIGHT_UNAVAILABLE, FLIGHT_NOT_READY, CHARGER_DISCONNECTED, INAPPLICABLE_REQUEST}`.

TYPE-10: `ArbitratedIntent` is the finite product of `EffectiveIntent` and `FreshRequestPreemption` exactly `{NOT_PREEMPTED, PREEMPTED}`; `PREEMPTED` is permitted only with `RECOVER_TO_STANDBY` when recovery wins over a non-`NO_REQUEST` fresh request.

## Selected parts and distinct responsibilities

PART-01: `RequestArbiter` shall select one effective intent from a fresh request, any recovery proposal, and charger connection according to `PRI-01`; its credited derivations are priority selection, preemption, and disconnected-charge classification, not ordinary label correspondence.

PART-02: `BatteryQualificationOwner` shall derive battery availability and sufficiency from independent capacity and validity observations; it owns `BatteryQualification` and does not copy either input encoding.

PART-03: `FlightReadinessOwner` shall derive one flight qualification jointly from navigation and radio conditions; it owns combined readiness and invalid-before-not-ready precedence.

PART-04: `OperationalEligibilityOwner` shall combine both qualifications, charger state, and current lifecycle state to derive flight/charge applicability and any recovery proposal; it owns neither lifecycle state nor final transition selection.

PART-05: `LifecycleStateGovernor` shall be the sole owner of initialized lifecycle state and shall decide next state and transition outcome from effective intent and eligibility envelope.

PART-06: `PowerChargeCommandPolicy` shall derive two controlled outcomes from the accepted next lifecycle state: logical power level and charge enablement.

PART-07: `FlightAuthorizationPolicy` shall derive whether flight is permitted from the lifecycle decision, denying flight in every state other than `FLYING`.

PART-08: `SupervisoryStatusAssessment` shall derive `PilotNotice` from lifecycle decision and battery qualification using `PRI-03`; copied next state and the one-to-one result/disposition mapping do not earn owner credit.

## Decision and state ownership audit

OWNER-01: `BatteryQualificationOwner` is a qualification owner because cases 01–03 derive a three-valued fact from two independently varying inputs.

OWNER-02: `FlightReadinessOwner` is a qualification owner because cases 04–06 reduce two three-valued observations with explicit precedence.

OWNER-03: `OperationalEligibilityOwner` is a cooperating applicability and recovery owner because cases 07–10 combine both owner outputs with mode and charger state.

OWNER-04: `RequestArbiter` is a cooperating priority decision owner because cases 11–13 resolve simultaneous shutdown, recovery, fresh-request, and charger facts.

OWNER-05: `LifecycleStateGovernor` is the only lifecycle-state owner and final transition decision owner; `INIT-01` and cases 14–17 are its local evidence.

OWNER-06: `PowerChargeCommandPolicy` and `FlightAuthorizationPolicy` own the classifications in cases 18 and 19; `SupervisoryStatusAssessment` owns only precedence-derived `PilotNotice` in case 20. No copied, bundled, renamed, or routed submapping receives owner credit.

## Complete typed directed semantic interaction inventory

INT-01: The root boundary sends `pilotRequest : LifecycleRequest` through the Process boundary to `RequestArbiter`.

INT-02: The root boundary sends `chargerState : ChargerState` through the Process boundary to `RequestArbiter` for disconnected-charge rejection.

INT-03: The root boundary sends `chargerState : ChargerState` through the Process boundary to `OperationalEligibilityOwner` for charge eligibility and charging recovery.

INT-04: The root boundary sends `batteryCapacity : BatteryCapacityBand` through the Process boundary to `BatteryQualificationOwner`.

INT-05: The root boundary sends `batteryCheck : BatteryCheck` through the Process boundary to `BatteryQualificationOwner`.

INT-06: The root boundary sends `navigationCondition : NavigationCondition` through the Process boundary to `FlightReadinessOwner`.

INT-07: The root boundary sends `radioCondition : RadioCondition` through the Process boundary to `FlightReadinessOwner`.

INT-08: `BatteryQualificationOwner` sends `batteryQualification : BatteryQualification` to `OperationalEligibilityOwner`.

INT-09: `BatteryQualificationOwner` sends `batteryQualification : BatteryQualification` to `SupervisoryStatusAssessment` for notice precedence.

INT-10: `FlightReadinessOwner` sends `flightQualification : FlightQualification` to `OperationalEligibilityOwner`.

INT-11: `LifecycleStateGovernor` sends `currentLifecycleState : LifecycleState` to `OperationalEligibilityOwner`; this is committed pre-evaluation state, not the concurrently computed next state.

INT-12: `OperationalEligibilityOwner` sends `recoveryProposal : RecoveryProposal` to `RequestArbiter`.

INT-13: `OperationalEligibilityOwner` sends `eligibilityEnvelope : EligibilityEnvelope` to `LifecycleStateGovernor`.

INT-14: `RequestArbiter` sends `arbitratedIntent : ArbitratedIntent` to `LifecycleStateGovernor`.

INT-15: `LifecycleStateGovernor` sends `decisionSnapshot : DecisionSnapshot` to `PowerChargeCommandPolicy`.

INT-16: `LifecycleStateGovernor` sends `decisionSnapshot : DecisionSnapshot` to `FlightAuthorizationPolicy`.

INT-17: `LifecycleStateGovernor` sends `decisionSnapshot : DecisionSnapshot` to `SupervisoryStatusAssessment`.

INT-18: `PowerChargeCommandPolicy` sends `powerCommand : PowerCommand` through the Process boundary to the root boundary.

INT-19: `PowerChargeCommandPolicy` sends `chargeCommand : ChargeCommand` through the Process boundary to the root boundary.

INT-20: `FlightAuthorizationPolicy` sends `flightAuthorization : FlightAuthorization` through the Process boundary to the root boundary.

INT-21: `SupervisoryStatusAssessment` sends `pilotStatus : PilotStatus` through the Process boundary to the root boundary.

## Generated-support allowance

SUP-01: Exactly one behavior-free, uncredited `GovernorProcess` usage shall exist at depth 1 beneath the root System; all eight `PART-*` usages shall be behavioral Threads inside it at depth 2. The Process has no PART identifier, owner role, state, GUMBO compute contract, domain responsibility, or semantic-usage credit and shall carry `@generated-support` rationale.

SUP-02: Exactly ten root-System-to-Process delegation routes shall carry the six root inputs and four root outputs. They are source-level routing declarations only, carry `@generated-support` rationale, and receive no semantic-interaction or owner credit.

SUP-03: The minimal realization shall therefore contain exactly 31 source `PortConnection` declarations: 21 declarations realizing `INT-01` through `INT-21` plus the ten support delegations. `edge_count = 21` and `semantic_interaction_count = 21` count only the approved semantic directed interactions.

SUP-ROUTE-01: One generated-support delegation shall carry root `pilotRequest` to the `GovernorProcess` boundary.

SUP-ROUTE-02: One generated-support delegation shall carry root `chargerState` to the `GovernorProcess` boundary; its Process-side fan-out into `INT-02` and `INT-03` does not create another root delegation.

SUP-ROUTE-03: One generated-support delegation shall carry root `batteryCapacity` to the `GovernorProcess` boundary.

SUP-ROUTE-04: One generated-support delegation shall carry root `batteryCheck` to the `GovernorProcess` boundary.

SUP-ROUTE-05: One generated-support delegation shall carry root `navigationCondition` to the `GovernorProcess` boundary.

SUP-ROUTE-06: One generated-support delegation shall carry root `radioCondition` to the `GovernorProcess` boundary.

SUP-ROUTE-07: One generated-support delegation shall carry Process-boundary `powerCommand` to the root output.

SUP-ROUTE-08: One generated-support delegation shall carry Process-boundary `chargeCommand` to the root output.

SUP-ROUTE-09: One generated-support delegation shall carry Process-boundary `flightAuthorization` to the root output.

SUP-ROUTE-10: One generated-support delegation shall carry Process-boundary `pilotStatus` to the root output.

## Lifecycle modes and transitions

MODE-01: `OFF` is externally distinguishable by `POWER_OFF`, `CHARGE_DISABLED`, and `DENIED`; `NO_REQUEST` holds with no change, `SWITCH_ON` and idempotent `SWITCH_OFF` are accepted, and every other fresh request is rejected.

MODE-02: `STANDBY` is externally distinguishable by `SUPPORT_POWER`, `CHARGE_DISABLED`, and `DENIED`; it is the neutral point for activation, beginning charge, shutdown, and recovery completion.

MODE-03: `CHARGING` is externally distinguishable by `POWER_OFF`, `CHARGE_ENABLED`, and `DENIED`; charger disconnection or unavailable battery creates a recovery proposal to `STANDBY`.

MODE-04: `READY` is externally distinguishable by `SUPPORT_POWER`, `CHARGE_DISABLED`, and `DENIED`; loss of battery sufficiency or combined flight readiness creates a recovery proposal to `STANDBY`.

MODE-05: `FLYING` is externally distinguishable by `FLIGHT_POWER`, `CHARGE_DISABLED`, and `PERMITTED`; loss of battery sufficiency or combined readiness creates a recovery proposal to `STANDBY`, without claiming physical landing.

TRANS-01: `OFF --SWITCH_ON--> STANDBY` is the only normal departure from `OFF`.

TRANS-02: `STANDBY --BEGIN_CHARGE [chargeEligible]--> CHARGING` begins a logical charging interval.

TRANS-03: `CHARGING --END_CHARGE--> STANDBY` ends a logical charging interval.

TRANS-04: `STANDBY --ACTIVATE [flightEligible]--> READY` establishes logical readiness.

TRANS-05: `READY --BEGIN_FLIGHT [flightEligible]--> FLYING` gives begin-flight the declared meaning of entering `FLYING`.

TRANS-06: `FLYING --END_FLIGHT--> READY` gives end-flight the declared meaning of leaving `FLYING` when qualifications remain satisfied.

TRANS-07: `READY --DEACTIVATE--> STANDBY` removes logical readiness.

TRANS-08: `{READY, FLYING, CHARGING} --RECOVER_TO_STANDBY--> STANDBY` is the selected supervisory recovery, not a physical maneuver or safety claim.

TRANS-09: `AnyState --SWITCH_OFF--> OFF` is globally applicable and has highest request priority.

TRANS-10: Every combination not admitted by transitions 01–09 leaves state unchanged; `NO_REQUEST` produces `NO_CHANGE`, and every other unmatched fresh intent produces `REJECTED`.

INIT-01: Lifecycle state shall initialize to `OFF`; initial outputs shall be `POWER_OFF`, `CHARGE_DISABLED`, `DENIED`, and `OFF/NO_CHANGE/NONE`. Initialization is required but is not one of the 20 nontrivial contract cases.

## Priority and recovery policy

PRI-01: Effective-intent priority shall be `SWITCH_OFF` over a non-`NO_RECOVERY` proposal over every other fresh request; recovery reports a lower-priority non-`NO_REQUEST` fresh request as preempted.

PRI-02: For recovery qualification in `READY` or `FLYING`, battery other than `SUFFICIENT` shall select the battery reason before simultaneous flight qualification other than `READY`; this is deterministic policy, not a hazard-severity claim.

PRI-03: Pilot notice precedence shall be `BATTERY_UNAVAILABLE`, then `BATTERY_LOW`, then decision recovery or eligibility reason, then `INAPPLICABLE_REQUEST`, then `NONE`.

REC-01: Recovery is complete at `STANDBY`; the proposal then becomes `NO_RECOVERY` unless a new state-dependent condition applies, and later `ACTIVATE` or `BEGIN_CHARGE` is evaluated as a new request.

REC-02: A qualification becoming acceptable in `OFF` or `STANDBY` shall not cause automatic progression; progression requires a fresh applicable request.

## Exact owner-local nontrivial contract-case partition

BEH-01 / CASE-01: If `batteryCheck = INVALID`, `BatteryQualificationOwner` shall output `UNAVAILABLE` for either capacity band. Owner-local contract inspection and exhaustive finite analysis shall show both combinations yield only `UNAVAILABLE`.

BEH-02 / CASE-02: If `batteryCheck = VALID` and `batteryCapacity = LOW`, `BatteryQualificationOwner` shall output `INSUFFICIENT`; contract and analyzer shall agree on this unique result.

BEH-03 / CASE-03: If `batteryCheck = VALID` and `batteryCapacity = USABLE`, `BatteryQualificationOwner` shall output `SUFFICIENT`; cases 01–03 shall cover all four raw input combinations.

BEH-04 / CASE-04: If either navigation or radio condition is `INVALID`, `FlightReadinessOwner` shall output `UNAVAILABLE`; exhaustive analysis shall cover all five applicable combinations.

BEH-05 / CASE-05: If neither flight input is `INVALID` and at least one is `NOT_READY`, `FlightReadinessOwner` shall output `NOT_READY`; exhaustive analysis shall cover the three applicable combinations.

BEH-06 / CASE-06: If both flight inputs are `READY`, `FlightReadinessOwner` shall output `READY`; cases 04–06 shall cover all nine raw input combinations.

FAULT-01 / CASE-07: In `READY` or `FLYING` with battery qualification not `SUFFICIENT`, `OperationalEligibilityOwner` shall set `flightEligible = false`, set `chargeEligible` exactly when charger is `CONNECTED` and battery is not `UNAVAILABLE`, propose `TO_STANDBY_BATTERY`, and choose the battery reason. Exhaustive owner-local analysis shall cover both states, both disqualifying battery values, every flight qualification, and both charger values with every output assigned.

FAULT-02 / CASE-08: In `READY` or `FLYING` with sufficient battery and flight qualification not `READY`, `OperationalEligibilityOwner` shall set `flightEligible = false`, set `chargeEligible` exactly when charger is `CONNECTED`, propose `TO_STANDBY_READINESS`, and choose the flight reason. Analysis shall cover both states, both disqualifying flight values, and both charger values without overlap with case 07.

FAULT-03 / CASE-09: In `CHARGING` with charger `DISCONNECTED` or battery `UNAVAILABLE`, `OperationalEligibilityOwner` shall set `chargeEligible = false`, set `flightEligible` exactly when battery is `SUFFICIENT` and flight qualification is `READY`, propose `TO_STANDBY_CHARGE_PATH`, and choose charger-disconnected when disconnected, battery-unavailable otherwise. Analysis shall cover the union, overlap, and secondary flight fact.

BEH-07 / CASE-10: Otherwise `OperationalEligibilityOwner` shall propose `NO_RECOVERY`, set `flightEligible` exactly for sufficient battery and ready flight qualification, set `chargeEligible` exactly for connected charger and non-unavailable battery, and choose reason by battery-unavailable, battery-low, flight-unavailable, flight-not-ready, then `NONE`. Cases 07–10 shall be disjoint, total, and fully assigned.

BEH-08 / CASE-11: If fresh request is `SWITCH_OFF`, `RequestArbiter` shall select `SWITCH_OFF/NOT_PREEMPTED` regardless of recovery or charger; exhaustive analysis shall demonstrate highest-priority selection.

BEH-09 / CASE-12: If fresh request is not `SWITCH_OFF` and recovery is proposed, `RequestArbiter` shall select `RECOVER_TO_STANDBY` and set `PREEMPTED` exactly when fresh request is not `NO_REQUEST`; exhaustive analysis shall show recovery wins every such combination.

BEH-10 / CASE-13: If neither shutdown nor recovery wins, `RequestArbiter` shall set `NOT_PREEMPTED` and select the fresh intent, except disconnected `BEGIN_CHARGE` becomes `REJECT_BEGIN_CHARGE` and `NO_REQUEST` becomes `NO_INTENT`; exhaustive analysis shall assign both fields for every remaining combination.

BEH-11 / CASE-14: For any state with effective `SWITCH_OFF`, `LifecycleStateGovernor` shall set next state `OFF`, result `ACCEPTED`, and reason `NONE`; analysis shall cover all five pre-states and every snapshot field.

BEH-12 / CASE-15: The governor shall accept exactly these guarded progressions with reason `NONE`: `OFF/SWITCH_ON -> STANDBY`, `STANDBY/BEGIN_CHARGE [chargeEligible] -> CHARGING`, `STANDBY/ACTIVATE [flightEligible] -> READY`, and `READY/BEGIN_FLIGHT [flightEligible] -> FLYING`. Analysis shall exercise every relation, each false guard, and every snapshot field.

BEH-13 / CASE-16: The governor shall accept `CHARGING/END_CHARGE -> STANDBY`, `READY/DEACTIVATE -> STANDBY`, and `FLYING/END_FLIGHT -> READY` with reason `NONE`; it shall apply recovery only from `READY`, `FLYING`, or `CHARGING`, copy the envelope reason, and return `FRESH_REQUEST_PREEMPTED` exactly for a `PREEMPTED` marker, otherwise `RECOVERY_APPLIED`. Analysis shall exercise every admitted retreat and recovery pre-state.

BEH-14 / CASE-17: Every governor combination not selected by cases 14–16 shall hold state; `NO_INTENT` yields `NO_CHANGE/NONE`, `REJECT_BEGIN_CHARGE` yields `REJECTED/CHARGER_DISCONNECTED`, a failed guard yields `REJECTED` with envelope reason, and other unmatched intent yields `REJECTED/NONE`. Cases 14–17 shall be priority-ordered, total, deterministic, and fully assigned over the finite owner-local product.

BEH-15 / CASE-18: `PowerChargeCommandPolicy` shall output `POWER_OFF` in `OFF` and `CHARGING`, `SUPPORT_POWER` in `STANDBY` and `READY`, and `FLIGHT_POWER` in `FLYING`; `CHARGE_ENABLED` occurs only in `CHARGING`. Owner-local analysis shall check all five next states and both outputs.

BEH-16 / CASE-19: `FlightAuthorizationPolicy` shall output `PERMITTED` exactly for decided next state `FLYING`, otherwise `DENIED`; owner-local analysis shall check all five states.

BEH-17 / CASE-20: `SupervisoryStatusAssessment` shall copy decided next state, map transition results one-to-one to their corresponding dispositions, and derive exactly one `PilotNotice` using `PRI-03`. Owner credit attaches only to notice derivation. Finite analysis shall enumerate every `DecisionSnapshot`/battery-qualification pair, prove total deterministic output, and reach each disposition and notice that is reachable under the approved upstream relations.

## Nominal and off-nominal scenario families

SCN-01: Power-up family — from `OFF` with acceptable qualifications and no recovery, fresh `SWITCH_ON` reaches `STANDBY` with `SUPPORT_POWER/CHARGE_DISABLED/DENIED` and accepted disposition.

SCN-02: Charging-cycle family — from `STANDBY`, connected charger and available battery permit `BEGIN_CHARGE` to reach `CHARGING`; later `END_CHARGE` returns to `STANDBY`, with charging enabled only in `CHARGING`.

SCN-03: Qualified-flight-entry family — sufficient battery plus ready navigation and radio permit `ACTIVATE` from `STANDBY` to `READY`, then fresh `BEGIN_FLIGHT` to `FLYING` with `FLIGHT_POWER/PERMITTED`.

SCN-04: Nominal-flight-exit family — qualified `FLYING` accepts `END_FLIGHT` to `READY`, `DEACTIVATE` to `STANDBY`, and later `SWITCH_OFF` to `OFF` with permissions inactive.

SCN-05: Fresh-request rejection family — disconnected `BEGIN_CHARGE`, unqualified `ACTIVATE`, inapplicable state/request pairs, and guarded `BEGIN_FLIGHT` hold state and report rejection without creating recovery.

SCN-06: Flight/ready degradation and conflict family — degradation in `READY` or `FLYING` proposes recovery; battery reason wins simultaneous qualification conflict, recovery preempts an ordinary request, and simultaneous `SWITCH_OFF` preempts recovery.

SCN-07: Charging-recovery and re-entry family — charger disconnection or unavailable battery in `CHARGING` returns to `STANDBY`; after clearing, state remains `STANDBY` until a new `BEGIN_CHARGE` is accepted.

## Risks and mitigations within the claim boundary

RISK-01: Invalid or low battery treated as sufficient could retain logical `READY` or `FLYING` authorization contrary to policy; `FAULT-01` and request guards mitigate this logical inconsistency without asserting physical safety.

RISK-02: Ignored navigation or radio degradation could retain flight authorization while the selected readiness premise is false; `FAULT-02` mitigates this without asserting communication or navigation performance.

RISK-03: Ignored charger loss in `CHARGING` could leave charge enablement asserted despite the selected premise; `FAULT-03` and case 18 remove that logical inconsistency without claiming electrical isolation.

RISK-04: Honoring fresh progression and recovery together could create contradictory outcomes; `PRI-01`, cases 11–17, and the single state owner prevent that ambiguity.

## Essential assumptions and constraints

ASM-01: `CTX-01` supplies exactly one finite request per evaluation; the abstract does not authenticate or authorize the human source. This makes conflict with internally derived recovery finite and analyzable.

ASM-02: `CTX-02` supplies both battery fields; `INVALID` makes capacity untrusted. Independent validity prevents capacity from silently implying trustworthiness.

ASM-03: `CTX-03`, `CTX-04`, and `CTX-05` supply domain-valid finite values without promises of physical accuracy, latency, availability, or fault independence.

ASM-04: `currentLifecycleState` on interaction 11 is the previous committed state for the current evaluation. The state-owner contract shall publish it from `In(lifecycleState)` while updating only post-state, breaking same-evaluation feedback ambiguity.

CONSTR-01: Exactly one root System usage shall contain exactly one generated-support `GovernorProcess` at depth 1, which shall contain exactly eight reachable semantic Thread usages at depth 2, one for each `PART-*`; root and Process are not semantic usages.

CONSTR-02: The architecture shall realize exactly the 21 `INT-*` semantic interactions and exactly the ten `SUP-ROUTE-*` delegations, with no extra semantic connection and no omitted or merged approved interaction.

CONSTR-03: Containment depth beneath root shall be exactly two; no semantic usage shall contain another semantic usage; all eight semantic usages shall form exactly one weakly connected region through the listed semantic interactions.

CONSTR-04: The model shall contain exactly one lifecycle state owner, at least the four cooperating qualification/decision owners in owners 01–04, and no identity wrapper shall receive semantic-usage or owner credit.

CONSTR-05: Retained owner-local contracts shall implement exactly 20 nontrivial cases one-for-one with cases 01–20; initialization and well-formedness assumptions are separate and do not change the count.

CONSTR-06: Bounded end-to-end analysis shall enumerate all 3,240 one-evaluation combinations of the six boundary inputs and five pre-states (`9 * 2 * 2 * 2 * 3 * 3 * 5`) and compare every derived qualification, proposal, intent, state, snapshot, and controlled output against cases 01–20.

CONSTR-07: Owner-local finite analysis shall separately establish totality, disjointness, determinism, full output assignment, priority, preemption, rejection, state hold, recovery, and owner-credit facts for each named owner's complete legal input product; the retained report shall state the enumerated product and count for each owner.

CONSTR-08: Bounded sequence analysis shall exercise all seven scenario families, including recovery clearing and fresh-request re-entry; it proves only those bounded logical sequences and shall not be reported as unbounded temporal proof, execution, or physical validation.

## Trace, verification, and objective pass criteria

TRACE-01: Every significant model package, type, component definition and usage, port, semantic connection, state variable, initialization clause, integration clause, and contract clause shall cite one or more identifiers here or carry explicit `@generated-support <reason>` rationale.

TRACE-02: Every identifier here shall be classified in the trace report as realized, informational, or explicitly deferred; missing actionable coverage and unexplained model additions fail the stage.

PASS-01: Structural conformance requires one root, one uncredited support Process, exactly eight semantic usages, exactly nine non-root architecture nodes, exactly 21 semantic interactions, exactly ten support delegations, exactly 31 source `PortConnection` declarations, depth two, one semantic weakly connected region, and no padded usage.

PASS-02: Ownership conformance requires owner-local contracts and bounded evidence for owners 01–06, only `LifecycleStateGovernor` writing lifecycle state, no downstream recomputation of an upstream credited fact, PART-01 credit tied to priority/classification, and PART-08 credit tied only to `PilotNotice` precedence.

PASS-03: Behavioral conformance requires exactly 20 nontrivial cases with disjoint complete partitions, all outputs initialized and constrained, and correct fresh request, rejection, priority conflict, recovery, clearing, and no-request hold paths.

PASS-04: Mechanical verification requires architecture-stage and final `hamr sysml tipe` success, resolved compatible endpoints, independent harness success, and a retained bounded analyzer with no mismatch against all cases and obligations in constraints 06–08.

PASS-05: Validation requires Designer review of source, summary, trace, bounded evidence, and overview for fidelity to this lifecycle-governor purpose and claim boundary; parser, renderer, and typechecking success alone are insufficient.

PASS-06: Evidence shall report code generation, application execution, formal proof, physical performance, safety, certification, and every other deferred claim as `not-run` or deferred, never passed.

## Model-generation authorization

AUTH-01: Model generation is authorized against this approved baseline only. The Model shall preserve the 8/21/20/7 semantic allocation, use exactly the generated-support allowance in `SUP-01` through `SUP-03`, and shall not weaken domain policy or claim deferred evidence.
