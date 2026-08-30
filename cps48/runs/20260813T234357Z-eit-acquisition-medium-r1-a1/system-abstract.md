---
abstract_id: SA-EIT-01
run_id: 20260813T234357Z-eit-acquisition-medium-r1-a1
domain_seed: eit-acquisition-seed-20260813t233941z
campaign_complexity: medium
semantic_usage_count: [8, 8]
semantic_interaction_count: [21, 21]
nontrivial_contract_case_count: [20, 20]
scenario_family_count: [7, 7]
reachable_non_root_usage_count: [9, 9]
generated_support_usage_count: [1, 1]
generated_support_route_count: [9, 9]
raw_source_port_connection_count: [30, 30]
containment_depth_beneath_root: [2, 2]
root_system_usage_count: [1, 1]
weakly_connected_semantic_region_count: [1, 1]
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# EIT Acquisition Session Coordinator — Approved System Abstract

## Need, purpose, and operational context

NEED-01: A bounded logical system is needed to qualify electrode-belt preparation before starting monitoring, coordinate impedance-data collection, suppress unusable collection outcomes, and expose deterministic recovery and request dispositions to the participating people.

PURPOSE-01: The EIT Acquisition Session Coordinator shall coordinate preparation-qualified monitoring and impedance acquisition; it shall not perform EIT image generation, image analysis, diagnosis, treatment, or physical belt application.

CAP-01: The principal capabilities are belt-observation qualification, calibration qualification, acquisition eligibility and recovery assessment, request arbitration, preparation-state control, monitoring-state control, acquisition-command policy, and impedance/public-status publication.

MISSION-01: The modeled purpose is logical acquisition-session coordination around a patient wearing an electrode belt. The purpose is not evidence that acquired impedance data or any later image is clinically useful, safe, accurate, or effective.

SEM-01: One logical evaluation shall observe the six current boundary inputs and the two committed pre-evaluation states, derive qualifications and one effective intent, and commit at most one next value for each state owner before deriving outputs. This is a deterministic pilot abstraction, not a physical sampling-period, latency, scheduler, or simultaneity claim.

## Evidence and claim strata

PROV-HBK-01: Handbook-derived methodology requires an explicit boundary, cohesive responsibility allocation, unique trace identifiers, complete finite behavior partitions, alternatives, assumptions, objective verification criteria, and separate verification and validation. These are engineering-method constraints, not EIT domain facts.

PROV-SEED-01: The frozen seed grounds the actors `Doctor`, `EngineerTechnician`, `Patient`, and `EITSystem`; the use-case vocabulary for applying the electrode belt, calibrating the system, starting monitoring, collecting impedance data, generating EIT images, and analyzing images; and the stated actor/use-case associations.

PROV-SEED-02: The seed establishes no sequence, interface, representation, value, timestamp, validity, readiness, authorization, priority, recovery, safety, diagnostic, or success semantics. It also leaves the relationship between the `EITSystem` actor and `EITSystemBoundary` ambiguous and gives the Patient no use-case association.

PROV-PILOT-01: This abstract introduces all finite enums, logical evaluation ordering, request meanings, qualification rules, two state spaces, validity treatment, priorities, recovery, symbolic impedance-frame values, and output meanings as pilot assumptions. None is attributed to the corpus source.

PROV-ARCH-01: This approved baseline selects exactly eight semantic responsibility usages and exactly the 21 typed directed semantic interactions in `INT-01` through `INT-21`. Realization requires one behavior-free generated-support Process and nine root/Process support routes; none earns semantic usage, interaction, case, or owner credit.

PROV-DEFER-01: Electrode excitation, current or voltage, physical sensing, belt geometry, contact quality, signal processing, image reconstruction, image quality, clinical analysis, diagnosis, treatment, electrical safety, patient outcome, real-time performance, regulatory compliance, certification, code generation, execution, formal proof, and production readiness are deferred and shall not be reported as realized.

## Scope and system boundary

SCOPE-IN-01: Inside the modeled boundary are only the eight logical responsibilities in `PART-01` through `PART-08`, the preparation and monitoring states, the finite policy decisions, the three controlled outputs, and the one behavior-free Process selected in `BOUND-06` solely for legal containment.

SCOPE-OUT-01: The Doctor, EngineerTechnician, Patient, electrode belt and its observation source, calibration activity and observation source, physical impedance-acquisition equipment, downstream impedance-data consumer, image generator, image analyst, user interfaces, clinical workflow, and physical environment are outside the modeled boundary.

CTX-01: The Doctor is an external requester and status recipient, consistent with the seed association to starting monitoring; this abstract does not infer exclusive command authority or clinical responsibility.

CTX-02: The EngineerTechnician is an external preparation requester and status recipient, consistent with the seed associations to belt application and calibration; physical work and acceptance criteria remain outside the boundary.

CTX-03: The Patient is retained as declared external context only. The seed supplies no patient interaction, consent, sensing, or control association, so this abstract assigns none.

CTX-04: The Belt Observation Source reports one finite current belt observation. It may be associated with physical equipment or human workflow, but this abstract does not select an implementation.

CTX-05: The Calibration Observation Source reports one finite current calibration observation; it does not establish how calibration is performed or whether it is physically adequate.

CTX-06: The Acquisition Interface reports acquisition availability, receives the logical acquisition command, and supplies at most one symbolic impedance-frame observation per evaluation. It is external because this scope coordinates rather than implements collection hardware.

CTX-07: The Impedance Data Consumer receives only admitted symbolic frame deliveries. It may support later image generation, but image generation is outside this system.

CTX-08: The source-named `EITSystem` actor is treated as unresolved source vocabulary, not silently equated to this coordinator or to `CTX-06`; this model chooses a narrower system boundary and preserves the ambiguity as deferred.

## Exact finite boundary inputs

MON-01: `doctorRequest : DoctorRequest` is supplied by `CTX-01` and has exactly `{NO_DOCTOR_REQUEST, START_MONITORING, STOP_MONITORING}`.

MON-02: `technicianRequest : TechnicianRequest` is supplied by `CTX-02` and has exactly `{NO_TECHNICIAN_REQUEST, CONFIRM_BELT, RECORD_CALIBRATION, RESET_PREPARATION}`.

MON-03: `beltObservation : BeltObservation` is supplied by `CTX-04` and has exactly `{BELT_OBSERVATION_INVALID, BELT_NOT_APPLIED, BELT_APPLIED}`; the labels are logical reports, not physical contact-quality claims.

MON-04: `calibrationObservation : CalibrationObservation` is supplied by `CTX-05` and has exactly `{CALIBRATION_OBSERVATION_INVALID, CALIBRATION_NOT_AVAILABLE, CALIBRATION_FAILED, CALIBRATION_PASSED}`; `PASSED` is a pilot token and not a safety, accuracy, or efficacy conclusion.

MON-05: `acquisitionObservation : AcquisitionObservation` is supplied by `CTX-06` and has exactly `{ACQUISITION_AVAILABLE, ACQUISITION_FAULT}`; no fault cause, severity, or probability is assumed.

MON-06: `impedanceFrame : ImpedanceFrameObservation` is supplied by `CTX-06` and has exactly `{NO_FRAME, INVALID_FRAME, FRAME_A, FRAME_B}`. `FRAME_A` and `FRAME_B` are distinct opaque bounded-analysis tokens with no unit, waveform, clinical meaning, or representation claim.

## Exact finite controlled outputs

CTRL-01: `acquisitionCommand : AcquisitionCommand` is delivered to `CTX-06` and has exactly `{DO_NOT_COLLECT, COLLECT}`. It is a logical request and does not demonstrate physical cessation, excitation control, or safe actuation.

CTRL-02: `frameDelivery : FrameDelivery` is delivered to `CTX-07` and has exactly `{NO_DELIVERY, DELIVER_FRAME_A, DELIVER_FRAME_B}`; no value is delivered for `NO_FRAME` or `INVALID_FRAME`.

CTRL-03: `sessionStatus : SessionStatus` is delivered to `CTX-01` and `CTX-02` as one shared logical status product containing `PreparationState`, `MonitoringState`, `RequestDisposition`, and `SessionNotice`. Shared delivery does not imply identical presentation or human responsibility.

## Finite internal concepts

TYPE-01: `BeltQualification` has exactly `{BELT_UNAVAILABLE, BELT_ABSENT, BELT_PRESENT}`; in `BeltAssessment` it is a reason/category projection and receives no independent owner credit.

TYPE-01A: `BeltAssessment` is a Data record with `category : BeltQualification` and `qualified : Boolean`. Its legal producer relation contains exactly `BELT_UNAVAILABLE/false`, `BELT_ABSENT/false`, and `BELT_PRESENT/true`; cases 01–03 constrain both attributes, and the many-to-one Boolean is `PART-01`'s credited owner-local fact.

TYPE-02: `CalibrationQualification` has exactly `{CALIBRATION_BLOCKED, NOT_CALIBRATED, CALIBRATED}`.

TYPE-03: `PreparationState` has exactly `{UNPREPARED, BELT_CONFIRMED, PREPARATION_CALIBRATED}`.

TYPE-04: `MonitoringState` has exactly `{MONITORING_INACTIVE, MONITORING_ACTIVE, MONITORING_HELD}`.

TYPE-05: `EligibilityCondition` has exactly `{BELT_UNAVAILABLE_CONDITION, BELT_ABSENT_CONDITION, CALIBRATION_NOT_READY_CONDITION, ACQUISITION_FAULT_CONDITION, ACQUISITION_READY}`.

TYPE-06: `RecoveryProposal` has exactly `{NO_RECOVERY, RESET_PREPARATION_RECOVERY, HOLD_MONITORING_RECOVERY}`.

TYPE-07: `EffectiveIntent` has exactly `{NO_INTENT, STOP_INTENT, RESET_PREPARATION_INTENT, HOLD_MONITORING_INTENT, CONFIRM_BELT_INTENT, RECORD_CALIBRATION_INTENT, START_MONITORING_INTENT}`.

TYPE-08: `RequestDisposition` has exactly `{NO_REQUEST_DISPOSITION, ACCEPTED, REJECTED, RECOVERY_APPLIED, PREEMPTED}`.

TYPE-09: `SessionNotice` has exactly `{NONE, BELT_OBSERVATION_UNAVAILABLE, BELT_NOT_CONFIRMED, CALIBRATION_NOT_READY, ACQUISITION_UNAVAILABLE, MONITORING_HELD_NOTICE, INAPPLICABLE_REQUEST, WAITING_FOR_FRAME, FRAME_REJECTED}`.

TYPE-10: `EligibilityEnvelope` is a Data record whose inspected members are attributes: `condition : EligibilityEnvelopeCondition`, `recovery : EligibilityEnvelopeRecovery`, `beltQualified : Boolean`, `calibrationQualified : Boolean`, `preparationState : EligibilityEnvelopePreparationState`, and `monitoringState : EligibilityEnvelopeMonitoringState`. Its four field-specific enum classifiers are extensionally identical to `EligibilityCondition`, `RecoveryProposal`, `PreparationState`, and `MonitoringState`, respectively; cases 08–12 define every legal record rather than permitting an unconstrained Cartesian product.

TYPE-11: `ArbitrationDecision` is a Data record with attributes `effectiveIntent : ArbitrationDecisionEffectiveIntent` and `disposition : ArbitrationDecisionDisposition`; the two field-specific classifiers are extensionally identical to `EffectiveIntent` and `RequestDisposition`, and cases 13–16 constrain every legal pair, including `NO_INTENT/REJECTED`.

TYPE-12: `PreparationDecisionSnapshot` is a Data record with attributes `preState : PreparationDecisionPreState`, `nextState : PreparationDecisionNextState`, `effectiveIntent : PreparationDecisionIntent`, and `disposition : PreparationDecisionDisposition`. Those field-specific classifiers are extensionally identical to `PreparationState`, `PreparationState`, `EffectiveIntent`, and `RequestDisposition`, respectively; cases 07 and 17 constrain every field.

TYPE-13: `MonitoringDecisionSnapshot` is a Data record with attributes `preState : MonitoringDecisionPreState`, `nextState : MonitoringDecisionNextState`, `effectiveIntent : MonitoringDecisionIntent`, `disposition : MonitoringDecisionDisposition`, `notice : MonitoringDecisionNotice`, and `preparationState : MonitoringDecisionPreparationState`. Those six field-specific classifiers are extensionally identical to `MonitoringState`, `MonitoringState`, `EffectiveIntent`, `RequestDisposition`, `SessionNotice`, and `PreparationState`, respectively; case 18 constrains every field.

TYPE-14: `SessionStatus` is a Data record with attributes `preparationState : SessionStatusPreparationState`, `monitoringState : SessionStatusMonitoringState`, `disposition : SessionStatusDisposition`, and `notice : SessionStatusNotice`. Those field-specific classifiers are extensionally identical to `PreparationState`, `MonitoringState`, `RequestDisposition`, and `SessionNotice`, respectively; the publisher may copy state and disposition projections but earns ownership only from frame admission and notice precedence.

TYPE-14A: Every canonical-to-field enum projection required by `TYPE-10` through `TYPE-14` is a representation-only one-to-one mapping with zero semantic-usage, interaction, owner, or contract-case credit. A GUMBO-inspected record member shall be a Data `attribute`, and no two such enum attributes shall reuse the same field classifier.

## Selected semantic usages and distinct responsibilities

PART-01: `BeltQualificationOwner` shall derive one `BeltAssessment` from the current belt observation. It owns the many-to-one `qualified` predicate—false for invalid and not-applied, true only for applied—while the three-valued category projection preserves reason distinctions without receiving owner credit.

PART-02: `CalibrationQualificationOwner` shall derive calibration qualification jointly from `BeltAssessment.qualified` and the calibration observation. It owns the rule that calibration is blocked when the supplied Boolean is false and shall not rederive that Boolean from the category or raw belt observation.

PART-03: `AcquisitionEligibilityOwner` shall combine the supplied `BeltAssessment` Boolean and category, calibration qualification, acquisition availability, and committed preparation and monitoring states to derive one eligibility condition and at most one recovery proposal under `PRI-02`; it shall not rederive belt qualification.

PART-04: `RequestArbiter` shall select exactly one applicable effective intent from the Doctor request, EngineerTechnician request, recovery proposal, and eligibility envelope under `PRI-01`; its credited facts are conflict resolution, applicability, and preemption, not enum translation.

PART-05: `PreparationStateGovernor` shall be the sole owner of initialized preparation state and shall decide its next state from the arbitrated applicable intent; it shall never infer or recompute physical belt application, calibration success, or request applicability.

PART-06: `MonitoringStateGovernor` shall be the sole owner of initialized monitoring state and the final session-transition decision owner; it shall admit start only when eligible and shall derive request disposition and monitoring notice.

PART-07: `AcquisitionCommandPolicy` shall derive whether collection is logically requested from the committed monitoring decision, requesting collection only in `MONITORING_ACTIVE`.

PART-08: `SessionPublicationPolicy` shall decide symbolic frame admission and final notice precedence from the monitoring decision and the current frame observation, then publish `frameDelivery` and `sessionStatus`.

## Decision and state ownership audit

OWNER-01: `BeltQualificationOwner` is a qualification owner because cases 01–03 derive the nonidentity `qualified` Boolean used by two downstream owners across all three raw values; its category projection is explicitly uncredited.

OWNER-02: `CalibrationQualificationOwner` is a cooperating qualification owner because cases 04–06 derive one fact from two independently varying inputs, including belt-dependent blocking.

OWNER-03: `AcquisitionEligibilityOwner` is a cooperating decision owner because cases 08–12 combine two qualification-owner outputs with acquisition availability and both committed states to select eligibility, reason, and recovery.

OWNER-04: `RequestArbiter` is a cooperating priority owner because cases 13–16 resolve simultaneous stop, recovery, technician, and start facts with explicit preemption.

OWNER-05: `PreparationStateGovernor` alone owns `PreparationState`; `INIT-01` and cases 07 and 17 are its local state evidence.

OWNER-06: `MonitoringStateGovernor` alone owns `MonitoringState` and final session transition; `INIT-01` and case 18 are its local state evidence.

OWNER-07: `AcquisitionCommandPolicy` owns the active-versus-nonactive command classification in case 19, while `SessionPublicationPolicy` owns frame admission and notice precedence in case 20. Copied state/status fields do not receive owner credit.

OWNER-08: No root, containment support, port, connection, delegation route, record constructor, identity conversion, copy, bundle, rename, or fan-out is a semantic usage or owner. Verification shall reject any central recomputation of cases 01–20 as an ownership defect.

## Complete typed directed semantic interaction inventory

INT-01: The root boundary sends `doctorRequest : DoctorRequest` to `RequestArbiter` for Doctor-request arbitration.

INT-02: The root boundary sends `technicianRequest : TechnicianRequest` to `RequestArbiter` for preparation-request arbitration.

INT-03: The root boundary sends `beltObservation : BeltObservation` to `BeltQualificationOwner`.

INT-04: The root boundary sends `calibrationObservation : CalibrationObservation` to `CalibrationQualificationOwner`.

INT-05: The root boundary sends `acquisitionObservation : AcquisitionObservation` to `AcquisitionEligibilityOwner`.

INT-06: The root boundary sends `impedanceFrame : ImpedanceFrameObservation` to `SessionPublicationPolicy`.

INT-07: `BeltQualificationOwner` sends `beltAssessment : BeltAssessment` to `CalibrationQualificationOwner` for Boolean-driven calibration blocking.

INT-08: `BeltQualificationOwner` sends `beltAssessment : BeltAssessment` to `AcquisitionEligibilityOwner` for distinct unavailable/absent conditions using the supplied category and Boolean.

INT-09: `CalibrationQualificationOwner` sends `calibrationQualification : CalibrationQualification` to `AcquisitionEligibilityOwner`.

INT-10: `PreparationStateGovernor` sends committed pre-evaluation `preparationState : PreparationState` to `AcquisitionEligibilityOwner`.

INT-11: `MonitoringStateGovernor` sends committed pre-evaluation `monitoringState : MonitoringState` to `AcquisitionEligibilityOwner`.

INT-12: `AcquisitionEligibilityOwner` sends `eligibilityEnvelope : EligibilityEnvelope` to `RequestArbiter` for recovery-versus-fresh-request arbitration.

INT-13: `RequestArbiter` sends `arbitrationDecision : ArbitrationDecision` to `PreparationStateGovernor`.

INT-14: `PreparationStateGovernor` sends `preparationDecision : PreparationDecisionSnapshot` to `MonitoringStateGovernor` so the final session decision and status use the committed next preparation state.

INT-15: `RequestArbiter` sends `arbitrationDecision : ArbitrationDecision` to `MonitoringStateGovernor`.

INT-16: `AcquisitionEligibilityOwner` sends `eligibilityEnvelope : EligibilityEnvelope` to `MonitoringStateGovernor` for guarded start and hold behavior.

INT-17: `MonitoringStateGovernor` sends `monitoringDecision : MonitoringDecisionSnapshot` to `AcquisitionCommandPolicy`.

INT-18: `MonitoringStateGovernor` sends `monitoringDecision : MonitoringDecisionSnapshot` to `SessionPublicationPolicy`.

INT-19: `AcquisitionCommandPolicy` sends `acquisitionCommand : AcquisitionCommand` to the root boundary.

INT-20: `SessionPublicationPolicy` sends `frameDelivery : FrameDelivery` to the root boundary.

INT-21: `SessionPublicationPolicy` sends `sessionStatus : SessionStatus` to the root boundary.

## Structural bounds and realization constraints

BOUND-01: The realized model shall contain exactly one explicit root System usage and exactly eight credited semantic usages realizing `PART-01` through `PART-08` in one weakly connected semantic region.

BOUND-02: The realized model shall contain exactly 21 credited semantic directed interactions, one for each and only each `INT-*`; fan-out entries are distinct because they have different receiving responsibilities, while support delegations shall be counted separately.

BOUND-03: The realized architecture shall have exactly nine reachable non-root usages—one Process and eight semantic Threads—and exact containment depth two beneath the root System. The Process is behavior-free generated support and cannot own state, decisions, contracts, or domain behavior.

BOUND-04: Every semantic usage shall derive its named owner-local fact, participate in at least one incoming and one outgoing semantic interaction, and trace to its `PART-*`, `OWNER-*`, and applicable `CASE-*`; no count padding is permitted.

BOUND-05: Exactly one semantic weakly connected region is required. All root inputs and outputs shall participate in a path through credited semantic behavior; disconnected or boundary-only support is prohibited.

BOUND-06: SysML-AADL realization shall place all eight semantic Threads inside exactly one behavior-free Process beneath the root System. Exactly nine root/Process support routes—six inputs and three outputs—are allowed, and the Process plus every support route shall carry `@generated-support` rationale and receive zero behavior, owner, interaction, or case credit.

BOUND-07: Exact raw metrics shall be one root System usage, one generated-support Process usage, nine reachable non-root usages, containment depth two, nine uncredited generated-support routes, 21 Process-local semantic connections, 30 raw source `PortConnection` declarations, eight semantic usages, 21 semantic interactions, and one semantic weakly connected region.

## State, mode, transition, priority, and recovery policy

MODE-01: `MONITORING_INACTIVE` is externally distinguishable by `DO_NOT_COLLECT` and `NO_DELIVERY`; it admits a fresh start only when eligibility is `ACQUISITION_READY`.

MODE-02: `MONITORING_ACTIVE` is externally distinguishable by `COLLECT`; only valid opaque frame tokens may be delivered, and a recovery proposal or accepted stop leaves active monitoring.

MODE-03: `MONITORING_HELD` is externally distinguishable by `DO_NOT_COLLECT`, `NO_DELIVERY`, and `MONITORING_HELD_NOTICE`; restored observations alone do not reactivate monitoring.

TRANS-01: `{UNPREPARED, BELT_CONFIRMED} --CONFIRM_BELT_INTENT--> BELT_CONFIRMED`; confirmation is accepted idempotently when already confirmed, the arbiter emits this intent only when belt is qualified and preparation is not calibrated, and every other confirmation becomes `NO_INTENT/REJECTED` before reaching the state owner.

TRANS-02: `{BELT_CONFIRMED, PREPARATION_CALIBRATED} --RECORD_CALIBRATION_INTENT--> PREPARATION_CALIBRATED`; calibration recording is accepted idempotently when already calibrated, and the arbiter emits this intent only when both qualifications are true and preparation is not unprepared.

TRANS-03: `{BELT_CONFIRMED, PREPARATION_CALIBRATED} --RESET_PREPARATION_INTENT--> UNPREPARED`; a reset in `UNPREPARED` is accepted idempotently.

TRANS-04: `{MONITORING_INACTIVE, MONITORING_HELD} --START_MONITORING_INTENT [ACQUISITION_READY]--> MONITORING_ACTIVE`.

TRANS-05: `MONITORING_ACTIVE --STOP_INTENT--> MONITORING_INACTIVE`; stop is accepted idempotently from the other monitoring states.

TRANS-06: `MONITORING_ACTIVE --{HOLD_MONITORING_INTENT, RESET_PREPARATION_INTENT}--> MONITORING_HELD`; the latter ensures preparation recovery cannot leave active monitoring asserted.

TRANS-07: Every unmatched or inapplicable non-`NO_INTENT` combination leaves the relevant state unchanged and reports `REJECTED`; `NO_INTENT` leaves both states unchanged and reports `NO_REQUEST_DISPOSITION`.

PRI-01: Intent priority shall be `STOP_MONITORING` over a non-`NO_RECOVERY` proposal over `RESET_PREPARATION` over `RECORD_CALIBRATION` over `CONFIRM_BELT` over `START_MONITORING` over no request. A lower-priority concurrent nonempty request is reported as `PREEMPTED` unless the selected intent is itself inapplicable, in which case the selected result is `REJECTED`.

PRI-02: Eligibility and recovery precedence shall be belt unavailable, belt absent, calibration not ready, acquisition fault, then ready. When preparation reset and monitoring hold are both indicated, `RESET_PREPARATION_RECOVERY` wins and `MonitoringStateGovernor` shall also move active monitoring to held.

PRI-03: Final notice precedence shall be a recovery/eligibility notice, then `INAPPLICABLE_REQUEST`, then `FRAME_REJECTED`, then `WAITING_FOR_FRAME`, then `NONE`; this is deterministic reporting policy, not a clinical severity ranking.

REC-01: A stop that coincides with preparation recovery takes effect first and leaves monitoring inactive; the still-applicable preparation recovery is selected on the next evaluation if the condition persists. This bounded two-evaluation behavior is intentional and shall be exercised by `SCN-04`.

REC-02: `MONITORING_HELD` shall persist after all observations become acceptable until a fresh `START_MONITORING` is received; restored readiness alone shall not resume collection.

REC-03: After preparation resets, recovery requires fresh `CONFIRM_BELT` and `RECORD_CALIBRATION` requests under qualifying observations before a later fresh start can be accepted. No observation automatically advances either state.

INIT-01: Preparation state shall initialize to `UNPREPARED`, monitoring state to `MONITORING_INACTIVE`, and outputs to `DO_NOT_COLLECT`, `NO_DELIVERY`, and `UNPREPARED/MONITORING_INACTIVE/NO_REQUEST_DISPOSITION/NONE`. Initialization is required but is not one of the 20 nontrivial contract cases.

## Exact owner-local nontrivial contract-case partition

BEH-01 / CASE-01: If `beltObservation = BELT_OBSERVATION_INVALID`, `BeltQualificationOwner` shall output `BeltAssessment(category = BELT_UNAVAILABLE, qualified = false)`. Owner-local contract inspection and exhaustive finite analysis shall show this unique record.

BEH-02 / CASE-02: If `beltObservation = BELT_NOT_APPLIED`, `BeltQualificationOwner` shall output `BeltAssessment(category = BELT_ABSENT, qualified = false)`. Owner-local inspection shall preserve the category distinction while proving the same qualified result as case 01.

BEH-03 / CASE-03: If `beltObservation = BELT_APPLIED`, `BeltQualificationOwner` shall output `BeltAssessment(category = BELT_PRESENT, qualified = true)`. Cases 01–03 shall cover all three raw values exactly once and constrain both attributes.

BEH-04 / CASE-04: If `beltAssessment.qualified = false`, `CalibrationQualificationOwner` shall output `CALIBRATION_BLOCKED` for every calibration observation without examining the category to recompute qualification. Producer-reachable analysis shall cover the eight combinations from the two legal false assessments and four calibration observations.

BEH-05 / CASE-05: If `beltAssessment.qualified = true` and `calibrationObservation != CALIBRATION_PASSED`, `CalibrationQualificationOwner` shall output `NOT_CALIBRATED`. Producer-reachable analysis shall cover the three applicable observation values without inventing a stronger invalidity claim.

BEH-06 / CASE-06: If `beltAssessment.qualified = true` and `calibrationObservation = CALIBRATION_PASSED`, `CalibrationQualificationOwner` shall output `CALIBRATED`. Cases 04–06 shall cover all 12 producer-reachable local input combinations.

BEH-07 / CASE-07: If arbitration selects `RESET_PREPARATION_INTENT`, `PreparationStateGovernor` shall set next preparation state to `UNPREPARED`; for `STOP_INTENT`, `HOLD_MONITORING_INTENT`, `START_MONITORING_INTENT`, or `NO_INTENT`, it shall retain pre-state. Contract/state inspection shall prove no other owner can write preparation state and shall cover these five disjoint intent classes across all three pre-states.

BEH-08 / CASE-08: If the supplied belt assessment is `BELT_UNAVAILABLE/false`, `AcquisitionEligibilityOwner` shall select `BELT_UNAVAILABLE_CONDITION`, carry both qualification Booleans false, copy both committed pre-states, and select reset recovery when preparation is not `UNPREPARED`, otherwise hold recovery when monitoring is active, otherwise no recovery.

BEH-09 / CASE-09: If the supplied belt assessment is `BELT_ABSENT/false`, `AcquisitionEligibilityOwner` shall select `BELT_ABSENT_CONDITION`, carry both qualification Booleans false, copy both committed pre-states, and apply the same state-dependent reset-before-hold recovery rule as case 08.

BEH-10 / CASE-10: If the supplied belt assessment is `BELT_PRESENT/true` and either committed preparation is not `PREPARATION_CALIBRATED` or calibration qualification is not `CALIBRATED`, `AcquisitionEligibilityOwner` shall select `CALIBRATION_NOT_READY_CONDITION`, carry `beltQualified = true`, set `calibrationQualified` exactly when calibration qualification is `CALIBRATED`, copy both committed pre-states, and request reset when stale calibrated preparation has lost calibration, otherwise hold when monitoring is active, otherwise no recovery.

BEH-11 / CASE-11: If the supplied belt assessment has `qualified = true`, calibration is qualified, committed preparation is `PREPARATION_CALIBRATED`, and acquisition observation is `ACQUISITION_FAULT`, `AcquisitionEligibilityOwner` shall select `ACQUISITION_FAULT_CONDITION`, carry both qualification Booleans true, copy both committed pre-states, and request hold only when monitoring is active.

BEH-12 / CASE-12: If the supplied belt assessment has `qualified = true`, calibration is qualified, committed preparation is `PREPARATION_CALIBRATED`, and acquisition observation is `ACQUISITION_AVAILABLE`, `AcquisitionEligibilityOwner` shall select `ACQUISITION_READY`, carry both qualification Booleans true, copy both committed pre-states, and select `NO_RECOVERY`. Cases 08–12 shall be disjoint and cover all 162 producer-reachable local input combinations while constraining every envelope attribute.

BEH-13 / CASE-13: If `doctorRequest = STOP_MONITORING`, `RequestArbiter` shall select `STOP_INTENT` regardless of recovery or technician request; disposition shall be `PREEMPTED` when any lower-priority fact is concurrent and `ACCEPTED` otherwise.

BEH-14 / CASE-14: If there is no stop and recovery is nonempty, `RequestArbiter` shall select the corresponding reset or hold intent; disposition shall be `PREEMPTED` when any fresh request is concurrent and `RECOVERY_APPLIED` otherwise.

BEH-15 / CASE-15: If there is no stop or recovery and technician request is nonempty, `RequestArbiter` shall treat reset as always applicable, confirmation as applicable exactly when belt is qualified and preparation is not calibrated, and calibration recording as applicable exactly when both qualifications are true and preparation is not unprepared; it shall select the corresponding intent only when applicable and otherwise output `NO_INTENT/REJECTED`. An applicable technician request preempts simultaneous Doctor start, while an inapplicable selected request does not fall through to start; the label mapping alone earns no owner credit.

BEH-16 / CASE-16: If there is no stop, recovery, or technician request, `RequestArbiter` shall select `START_MONITORING_INTENT/ACCEPTED` for a Doctor start only when the envelope condition is `ACQUISITION_READY`, output `NO_INTENT/REJECTED` for an unready start, and output `NO_INTENT/NO_REQUEST_DISPOSITION` otherwise. Cases 13–16 shall cover all 36 Doctor/technician/recovery combinations for every legal envelope.

BEH-17 / CASE-17: If arbitration selects already-qualified `CONFIRM_BELT_INTENT`, `PreparationStateGovernor` shall set next state to `BELT_CONFIRMED`; if it selects already-qualified `RECORD_CALIBRATION_INTENT`, it shall set next state to `PREPARATION_CALIBRATED`. Together with case 07, its decision snapshot shall carry the sole committed next preparation state and arbitration disposition; exhaustive local analysis shall cover all three pre-states and every legal arbitration decision exactly once.

BEH-18 / CASE-18: `MonitoringStateGovernor` shall implement exactly transitions 04–07 with priority stop, then reset-or-hold from active, then the arbiter-qualified fresh start, otherwise retain state; it shall copy the committed next preparation state from `PreparationDecisionSnapshot`, preserve arbitration disposition, and derive notices as follows: selected recovery uses the envelope reason, rejected start or preparation request uses the applicable eligibility or inapplicability notice, a retained held state uses `MONITORING_HELD_NOTICE`, and other accepted/no-request results use `NONE`. Exhaustive analysis shall cover all three monitoring pre-states, every legal arbitration decision, preparation decision, and eligibility envelope.

BEH-19 / CASE-19: `AcquisitionCommandPolicy` shall output `COLLECT` if and only if `monitoringDecision.nextState = MONITORING_ACTIVE`; it shall output `DO_NOT_COLLECT` for both other states. Contract inspection shall show no direct boundary or qualification input bypasses the monitoring decision owner.

BEH-20 / CASE-20: `SessionPublicationPolicy` shall output `NO_DELIVERY` whenever next monitoring state is not active or the frame is `NO_FRAME` or `INVALID_FRAME`; only `FRAME_A` and `FRAME_B` during active monitoring map to their corresponding delivery values. It shall derive final notice with `PRI-03`, using `FRAME_REJECTED` for an active invalid frame and `WAITING_FOR_FRAME` for an active `NO_FRAME`; inspection and finite analysis shall cover all 12 monitoring-state/frame classes and constrain every `SessionStatus` field.

## Scenario families and bounded public traces

SCN-01: Preparation progression shall start from initialization, apply `BELT_APPLIED + CONFIRM_BELT`, then `CALIBRATION_PASSED + RECORD_CALIBRATION`; the observable status sequence shall end at `PREPARATION_CALIBRATED/MONITORING_INACTIVE` with `DO_NOT_COLLECT`. A fresh start before the final step shall be rejected.

SCN-02: Nominal acquisition shall begin from calibrated/inactive state with available acquisition and a fresh Doctor start, enter active monitoring, command `COLLECT`, suppress `NO_FRAME`, deliver `FRAME_A` and `FRAME_B` on separate evaluations, and stop on a fresh Doctor stop.

SCN-03: Fresh-request priority shall present Doctor start concurrently with technician reset under otherwise ready conditions; reset shall win, preparation shall become unprepared, monitoring shall not become active, and status shall report preemption.

SCN-04: Stop-versus-recovery shall begin active and calibrated, then present Doctor stop together with `BELT_NOT_APPLIED`; stop shall first make monitoring inactive, and the next unchanged-observation/no-request evaluation shall reset preparation to unprepared without restarting monitoring.

SCN-05: Acquisition-fault recovery shall begin active, then present `ACQUISITION_FAULT` with `INVALID_FRAME`; monitoring shall enter held, command `DO_NOT_COLLECT`, deliver nothing, and report the acquisition recovery notice before any frame notice.

SCN-06: Fresh recovery re-entry shall begin held with preparation still calibrated after a transient acquisition fault, restore all qualifying observations with no request and remain held, then accept a fresh Doctor start and return to active; this shall demonstrate that observation recovery alone cannot resume collection.

SCN-07: Invalid and inapplicable inputs shall cover invalid belt observation, failed calibration observation, start from unprepared, calibration record before belt confirmation, and an invalid frame while active; each shall leave states within the declared transitions, suppress delivery where required, and produce the specified qualification or rejection notice.

## Risks, mitigations, assumptions, and constraints

RISK-01: If monitoring starts before selected preparation qualifications are established, the system could request impedance collection under an unqualified pilot state, making later data use unsupported.

FAULT-01: The coordinator shall mitigate `RISK-01` by admitting start only in case 18 when case 12 reports ready; cases 08–11 shall prevent `COLLECT`. Verification shall combine owner-local contract inspection with exhaustive end-to-end analysis, and pass only if no unready combination produces active monitoring.

RISK-02: If a belt, calibration, or acquisition fault occurs during active monitoring and collection or frame publication continues, a downstream consumer could receive data outside this abstract's admitted state.

FAULT-02: The coordinator shall mitigate `RISK-02` by selecting reset or hold recovery, leaving active monitoring, commanding `DO_NOT_COLLECT`, and suppressing frame delivery. Verification shall pass only if all active-to-unready combinations reach inactive or held and produce no delivery in the same logical evaluation.

ASM-01: `CTX-01` is responsible for supplying exactly one `DoctorRequest` value per logical evaluation; `NO_DOCTOR_REQUEST` explicitly represents no fresh Doctor action. Rationale: the finite arbitration partition requires a single current value but makes no human-interface claim.

ASM-02: `CTX-02` is responsible for supplying exactly one `TechnicianRequest` value per evaluation; `NO_TECHNICIAN_REQUEST` explicitly represents no fresh technician action. Rationale: concurrent technician actions are outside this bounded abstraction.

ASM-03: `CTX-04`, `CTX-05`, and `CTX-06` are responsible only for values within their finite declared types. The coordinator does not assume accuracy, freshness, independence, timing, or physical causality beyond the current logical evaluation.

ASM-04: `CTX-06` supplies at most one symbolic frame value per evaluation, and `NO_FRAME` represents its absence. Rationale: this makes delivery total without asserting a sampling rate, buffer, stream, or loss model.

ASM-05: The external recipients shall not interpret `COLLECT`, `CALIBRATION_PASSED`, delivered opaque frames, or status notices as medical, electrical-safety, diagnostic, or certification evidence. This claim boundary is necessary because the source provides only use-case names and associations.

CON-01: Exact finite domains are experiment constraints selected for analyzability. The Model Agent shall not add enum values, numeric ranges, timestamps, counters, timers, retries, histories, or hidden state without a Designer revision.

CON-02: The state and priority rules are selected architecture, not source-grounded workflow. They shall remain visibly labeled as pilot policy in model comments and summary evidence.

## Verification, validation, and objective pass criteria

VERIFY-01: Source/type verification shall pass only when the canonical project typechecks, has exactly one explicit root, resolves all endpoints, and uses directionally and type-compatible ports for all 21 semantic interactions.

VERIFY-02: Structural verification shall pass only when the model reports exactly eight credited semantic usages, 21 credited semantic interactions, nine reachable non-root usages, depth two, one semantic weakly connected region, one generated-support Process, nine generated-support routes, and 30 raw source connections.

VERIFY-03: Ownership verification shall pass only when each `PART-*` contains its named owner-local state or derivation, `PART-01` derives `qualified` rather than receiving credit for its category projection, `PART-02` and `PART-03` consume that Boolean without recomputation, cases 01–20 reside on the named owners, and no routing, copying, bundling, renaming, or canonical-to-field projection receives owner credit.

VERIFY-04: Partition verification shall pass only when one owner-local `compute_cases` partition per semantic Thread realizes exactly `3/3/5/4/2/1/1/1` nontrivial branches for `PART-01` through `PART-08`, totaling 20; guards shall be disjoint, initialization and `In(...)` pre-state use explicit, producer guarantees shall constrain every record attribute, and no legal relation shall be weakened into an environmental assumption.

VERIFY-05: The retained bounded analyzer shall enumerate all `3 × 4 × 3 × 4 × 2 × 4 × 3 × 3 = 10,368` combinations of the six raw inputs and two pre-states. It shall separately enumerate each producer-local type product and each producer-reachable consumer product—including exactly three `PART-01` inputs, 12 reachable `PART-02` input pairs, and 162 reachable `PART-03` input tuples—compare the same owner-local relations recorded in `metrics.json`, assert record/state/output closure, and fail on any unhandled combination, illegal producer record, multiple selected intents, unauthorized state write, unready active result, collection outside active state, or inadmissible frame delivery.

VERIFY-06: Scenario verification shall pass only when each of the seven `SCN-*` families has one bounded trace using exact declared values and its final/intermediate state, command, delivery, disposition, and notice outcomes match this abstract.

VERIFY-07: Trace verification shall pass only when every actionable abstract ID is covered or explicitly deferred/informational and every significant model usage, port, connection, state, initialization, contract clause, analyzer branch, and scenario maps to an abstract ID or justified generated support.

VALID-01: Designer validation shall separately judge whether the realized model preserves the narrow acquisition-coordination purpose, actor treatment, state/recovery semantics, priority conflict, and claim boundary; mechanical verification alone does not establish domain fitness.

PASS-01: This revised Designer baseline authorizes Model generation with the exact semantic tuple `8/21/20/7`, the exact physical mapping in `BOUND-07`, the corrected nonidentity `PART-01` ownership fact, closed finite partitions, retained alternatives in `design-selection.md`, and no source limitation presented as a fact.

PASS-02: Final acceptance additionally requires all `VERIFY-*` criteria green, all seven scenarios realized, no unexplained additions, a source-bound healthy overview, and Designer validation. Code generation, execution, formal proof, physical validation, clinical validation, and safety certification remain `not-run`, not passed.

## Resolved Model-realization obligations

MODEL-RES-01: Place the eight semantic owners as Threads inside the single generated-support Process selected by `BOUND-06`; preserve committed pre-state feedback with Thread-local state, explicit initialization, and `In(state)` references.

MODEL-RES-02: `EligibilityEnvelope` is carried only on `INT-12` and `INT-16`; `INT-14` carries `PreparationDecisionSnapshot`. This trace correction shall not change the 21-interaction topology.

MODEL-RES-03: Cases 17 and 18 shall use state variables, initialization, pre-state references, field-by-field record guarantees, and their owner-local branch partitions. Producer guarantees define legal envelope and snapshot relations; consumers and the analyzer shall not assume legality as an environmental premise.

MODEL-RES-04: The representation allowances in `TYPE-10` through `TYPE-14A` and the generated support in `BOUND-06` are the only approved compatibility mappings. They shall not alter domain behavior, add semantic credit, or weaken the frozen policy.
