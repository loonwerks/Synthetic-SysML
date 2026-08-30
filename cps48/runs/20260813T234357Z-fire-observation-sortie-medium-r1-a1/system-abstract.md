---
abstract_id: SA-FIRE-OBS-01
run_id: 20260813T234357Z-fire-observation-sortie-medium-r1-a1
domain_seed: 20260813T233942Z-fire-observation-sortie-seed-v1
campaign_complexity: medium
semantic_usage_count: 8
semantic_interaction_count: 21
nontrivial_contract_case_count: 20
scenario_family_count: 8
root_system_usage_count: 1
semantic_containment_depth_beneath_root: [2, 2]
non_root_architecture_node_count: [9, 9]
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Observation Acquisition and Radio-Delivery Coordinator — Approved System Abstract

## Need, purpose, goals, and operating context

NEED-01: A single forest-fire observation drone needs a bounded logical function that coordinates one requested camera observation with radio delivery while making qualification failures and recovery visible, without taking ownership of flight, navigation, energy management, or physical sensing.

PURPOSE-01: The Observation Acquisition and Radio-Delivery Coordinator shall qualify current energy, observation-position, camera, and radio evidence; arbitrate cancellation, recovery, automatic progress, and fresh starts; retain one logical observation-session state; command acquisition and delivery; and publish coordination outcomes.

GOAL-01: The system shall issue camera acquisition only for a qualified fresh observation request and shall issue radio delivery only after a capture has been accepted into the current logical session.

GOAL-02: The system shall suspend an active session when a required qualification becomes unavailable and shall require a later qualified fresh request before restarting after suspension.

GOAL-03: The system shall produce one deterministic result when the current operator intent conflicts with a simultaneous recovery or automatic-progress proposal, while making no fire-detection, flight-safety, observation-quality, or communications-performance claim.

CAP-01: Principal capabilities are battery-evidence qualification, observation-position applicability, camera-evidence qualification, radio-evidence qualification, session-proposal derivation, intent arbitration, session-state control, command generation, and recipient-specific outcome assessment.

SEM-01: One logical evaluation observes the eight current boundary inputs and the pre-evaluation session state, derives exactly one effective decision, and commits at most one next session state. This is a deterministic pilot abstraction, not a timing, scheduling, or physical simultaneity claim.

## Evidence and claim strata

PROV-HBK-01: Handbook-derived methodology requires an explicit boundary, cohesive responsibility allocation, finite and complete partitions, unique trace identifiers, considered alternatives, stated assumptions, objective verification criteria, and distinct verification and validation evidence; these are process constraints rather than drone-domain facts.

PROV-SEED-01: The frozen seed grounds a forest-fire observation drone label; a long-distance battery selection; qualitative battery-status acquisition, analysis, and availability to drone control; and named camera, radio, navigation, obstacle-sensing, landing, propulsion, charger, and power-management equipment.

PROV-SEED-02: The seed supplies no observation request, observation-session lifecycle, camera or radio data flow, validity or freshness semantics, authority, priority, recovery, successful observation, communications performance, or fire-related outcome.

PROV-PILOT-01: This abstract introduces an observation operator, observation recipient, flight-context source, finite evidence domains, one logical acquisition-and-delivery session, exact priority and recovery rules, and deterministic evaluation as explicit pilot abstractions.

PROV-ARCH-01: The approved architecture has exactly eight credited semantic usages with distinct local derivations and exactly 21 typed directed semantic interactions. One behavior-free support Process realizes the trusted System-to-Process-to-Thread containment form required by `CONSTR-02`; it and its transparent delegations receive no semantic, owner, interaction, or case credit.

PROV-DEFER-01: Flight dynamics, navigation accuracy, obstacle avoidance, camera content and quality, fire detection or localization, radio range and latency, physical battery behavior, endurance, propulsion sufficiency, landing, charging, mission authority, safety, certification, code generation, execution, and formal proof are deferred and shall not be reported as realized.

## Scope and system boundary

SCOPE-IN-01: Inside the modeled boundary are the eight responsibilities in `PART-01` through `PART-08`, the five-valued observation-session state, the finite qualifications, proposal and decision relations, and four controlled logical outputs.

SCOPE-OUT-01: The operator, battery-management source, flight-context source, camera equipment, radio equipment, observation recipient, drone-control recipient, air vehicle, navigation system, propulsion, fire environment, and all physical effects are outside the modeled boundary.

CTX-01: The Observation Operator supplies at most one current observation intent and receives coordination status. This contextual role is inferred for the pilot and is not a seed-defined command authority.

CTX-02: The Battery-Management Source supplies the qualitative capacity indication and battery-check validity. It retains all physical energy-management responsibility.

CTX-03: The Flight-Context Source indicates only whether the external vehicle is presently in the selected observation-position context. It owns flight and navigation state and receives no command from this system.

CTX-04: The Camera Equipment supplies availability and the current capture result and receives a logical acquisition command. The command and result do not establish image content, quality, timing, or fire detection.

CTX-05: The Radio Equipment supplies availability and the current delivery result and receives a logical delivery command. The command and result do not establish radio range, latency, bandwidth, or physical reception.

CTX-06: The Observation Recipient is represented only through `deliveryResult` supplied via `CTX-05`; `ACCEPTED` means the pilot fixture acknowledges the offered observation, not that a useful fire observation was obtained.

CTX-07: The Drone-Control Recipient receives a coordination notice for awareness and retains all flight, propulsion, and mission authority.

## Exact finite boundary inputs

MON-01: `observationIntent : ObservationIntent` is supplied by `CTX-01` and has exactly `{NO_REQUEST, START_OBSERVATION, CANCEL_OBSERVATION}`.

MON-02: `batteryCapacity : BatteryCapacityBand` is supplied by `CTX-02` and has exactly `{LOW, USABLE}`; it is qualitative and unitless.

MON-03: `batteryCheck : BatteryCheck` is supplied by `CTX-02` and has exactly `{INVALID, VALID}`; `INVALID` removes the simultaneous capacity band from qualification evidence.

MON-04: `sortieContext : SortieContext` is supplied by `CTX-03` and has exactly `{OUTSIDE_OBSERVATION_POSITION, AT_OBSERVATION_POSITION}`; these are policy labels, not navigation claims.

MON-05: `cameraCondition : CameraCondition` is supplied by `CTX-04` and has exactly `{UNAVAILABLE, READY}`.

MON-06: `captureResult : CaptureResult` is supplied by `CTX-04` and has exactly `{NONE, CAPTURED, FAILED}`; it is interpreted only in the current session phase.

MON-07: `radioCondition : RadioCondition` is supplied by `CTX-05` and has exactly `{UNAVAILABLE, READY}`.

MON-08: `deliveryResult : DeliveryResult` is supplied through `CTX-05` for `CTX-06` and has exactly `{NONE, ACCEPTED, REJECTED}`; it is interpreted only while delivery is active.

## Exact finite controlled outputs

CTRL-01: `cameraAcquisitionCommand : CameraAcquisitionCommand` is delivered to `CTX-04` and has exactly `{HOLD, ACQUIRE}`; it controls only logical acquisition intent.

CTRL-02: `radioDeliveryCommand : RadioDeliveryCommand` is delivered to `CTX-05` and has exactly `{HOLD, SEND_OBSERVATION}`; it controls only logical delivery intent.

CTRL-03: `operatorCoordinationStatus : OperatorCoordinationStatus` is delivered to `CTX-01` and contains the next session state, current battery assessment, disposition, reason, and one precedence-selected operator advisory. Copied fields receive no independent owner credit.

CTRL-04: `droneControlObservationNotice : DroneControlObservationNotice` is delivered to `CTX-07` and has exactly `{IDLE, OBSERVATION_ACTIVE, OBSERVATION_BLOCKED, DELIVERY_REPORTED}`; it neither authorizes nor commands flight.

## Exact finite internal concepts

TYPE-01: `BatteryAssessment` has exactly `{UNAVAILABLE, LOW, ADEQUATE}`.

TYPE-02: `SortieQualification` has exactly `{BLOCKED_EVIDENCE, BLOCKED_ENERGY, BLOCKED_CONTEXT, ELIGIBLE}`.

TYPE-03: `CameraEvidence` has exactly `{UNAVAILABLE, READY, CAPTURED, FAILED}`.

TYPE-04: `RadioEvidence` has exactly `{UNAVAILABLE, READY, ACCEPTED, REJECTED}`.

TYPE-05: `ObservationSessionState` has exactly `{IDLE, ACQUIRING, QUEUED, SENDING, SUSPENDED}`. It is the system's only principal state and is unrelated to flight, battery, camera, or radio equipment state.

TYPE-06: `SessionProposal` has exactly `{BLOCK_EVIDENCE, BLOCK_ENERGY, BLOCK_CONTEXT, BLOCK_CAMERA, BLOCK_RADIO, RECOVER_EVIDENCE, RECOVER_ENERGY, RECOVER_CONTEXT, RECOVER_CAMERA, RECOVER_RADIO, STARTABLE, HOLD, CAPTURE_COMPLETE, BEGIN_DELIVERY, DELIVERY_COMPLETE, DELIVERY_REJECTED}`.

TYPE-07: `SessionDecision` has exactly `{NO_CHANGE, BEGIN_ACQUISITION, CANCEL_TO_IDLE, SUSPEND_EVIDENCE, SUSPEND_ENERGY, SUSPEND_CONTEXT, SUSPEND_CAMERA, SUSPEND_RADIO, QUEUE_CAPTURE, BEGIN_TRANSMISSION, COMPLETE_TO_IDLE, RETRY_QUEUE, REJECT_EVIDENCE, REJECT_ENERGY, REJECT_CONTEXT, REJECT_CAMERA, REJECT_RADIO}`.

TYPE-08: `CoordinationDisposition` has exactly `{NO_CHANGE, STARTED, CANCELLED, PROGRESSED, COMPLETED, RECOVERY_APPLIED, REJECTED}` and `CoordinationReason` has exactly `{NONE, CANCELLED, EVIDENCE_UNAVAILABLE, ENERGY_LOW, CONTEXT_INELIGIBLE, CAMERA_UNUSABLE, RADIO_UNAVAILABLE}`.

TYPE-09: `SessionSnapshot` contains `preSession`, `nextSession`, `disposition`, and `reason`; all four finite fields shall be assigned on every `SessionDecision` path. Any field-specific representation types required by the modeling language shall preserve the domains above and receive no owner, usage, interaction, or case credit.

TYPE-10: `OperatorAdvisory` has exactly `{NONE, EVIDENCE_UNAVAILABLE, ENERGY_LOW, CONTEXT_INELIGIBLE, CAMERA_UNUSABLE, RADIO_UNAVAILABLE, REQUEST_REJECTED, DELIVERY_COMPLETED}`.

## Selected semantic usages and distinct responsibilities

PART-01: `BatteryEvidenceQualifier` shall derive a three-valued `BatteryAssessment` from independently varying capacity and check validity, with invalidity precedence; it shall not copy or rename either input.

PART-02: `SortieApplicabilityQualifier` shall jointly derive observation applicability from `BatteryAssessment` and the external sortie context, distinguishing invalid evidence, valid low energy, and contextual inapplicability without owning either source state.

PART-03: `CameraEvidenceQualifier` shall combine camera condition and capture result into one phase-neutral camera evidence fact with unavailability precedence; it shall not treat a result as proof of camera availability.

PART-04: `RadioEvidenceQualifier` shall combine radio condition and delivery result into one phase-neutral radio evidence fact with unavailability precedence; it shall not treat an acknowledgment as proof of current path availability.

PART-05: `SessionProposalOwner` shall combine sortie qualification, camera evidence, radio evidence, and pre-evaluation session state to derive exactly one blocker, recovery, startability, hold, or automatic-progress proposal using the phase and reason precedence in `PRI-02`.

PART-06: `ObservationIntentArbiter` shall combine the current operator intent and session proposal to select exactly one effective decision under the explicit conflict priority in `PRI-01`; it owns no state.

PART-07: `ObservationSessionController` shall be the sole owner of initialized `ObservationSessionState`, commit the next state from the effective decision, derive both controlled commands, and publish a fully assigned `SessionSnapshot`.

PART-08: `CoordinationOutcomePolicy` shall combine the controller snapshot and battery assessment to derive a precedence-selected operator advisory and a recipient-specific drone-control notice; record-field projection alone receives no owner credit.

## Decision, state, and ownership audit

OWNER-01: `BatteryEvidenceQualifier`, `SortieApplicabilityQualifier`, `CameraEvidenceQualifier`, and `RadioEvidenceQualifier` are qualification owners because each derives a many-input fact with explicit precedence and a complete local partition.

OWNER-02: `SessionProposalOwner` is a cooperating phase and recovery decision owner because it uses three independent qualifications plus pre-session state to distinguish blocking, recovery, automatic progress, and startability.

OWNER-03: `ObservationIntentArbiter` is a cooperating priority decision owner because it resolves cancellation, recovery, progress, fresh request, rejection, and no-request outcomes; it does not restate the proposal relation.

OWNER-04: `ObservationSessionController` alone owns and writes `ObservationSessionState`; command values and the snapshot are derived from its selected next state and decision, not independently stateful outputs.

OWNER-05: `CoordinationOutcomePolicy` owns the combined advisory and notice classifications because they depend on snapshot state, disposition, reason, and battery assessment. Copied snapshot or assessment fields do not earn credit.

OWNER-06: The root, an optional support container, ports, delegations, field projections, and one-to-one enum conversions shall perform no qualification, decision, state transition, or case logic and receive no semantic-usage or owner credit.

## Complete typed directed semantic interaction inventory

INT-01: The root boundary sends `batteryCapacity : BatteryCapacityBand` to `BatteryEvidenceQualifier`.

INT-02: The root boundary sends `batteryCheck : BatteryCheck` to `BatteryEvidenceQualifier`.

INT-03: The root boundary sends `sortieContext : SortieContext` to `SortieApplicabilityQualifier`.

INT-04: The root boundary sends `cameraCondition : CameraCondition` to `CameraEvidenceQualifier`.

INT-05: The root boundary sends `captureResult : CaptureResult` to `CameraEvidenceQualifier`.

INT-06: The root boundary sends `radioCondition : RadioCondition` to `RadioEvidenceQualifier`.

INT-07: The root boundary sends `deliveryResult : DeliveryResult` to `RadioEvidenceQualifier`.

INT-08: The root boundary sends `observationIntent : ObservationIntent` to `ObservationIntentArbiter`.

INT-09: `BatteryEvidenceQualifier` sends `batteryAssessment : BatteryAssessment` to `SortieApplicabilityQualifier`.

INT-10: `BatteryEvidenceQualifier` independently sends `batteryAssessment : BatteryAssessment` to `CoordinationOutcomePolicy`.

INT-11: `SortieApplicabilityQualifier` sends `sortieQualification : SortieQualification` to `SessionProposalOwner`.

INT-12: `CameraEvidenceQualifier` sends `cameraEvidence : CameraEvidence` to `SessionProposalOwner`.

INT-13: `RadioEvidenceQualifier` sends `radioEvidence : RadioEvidence` to `SessionProposalOwner`.

INT-14: `ObservationSessionController` sends `currentSession : ObservationSessionState` to `SessionProposalOwner`; it denotes the committed pre-evaluation state, not the concurrently selected next state.

INT-15: `SessionProposalOwner` sends `sessionProposal : SessionProposal` to `ObservationIntentArbiter`.

INT-16: `ObservationIntentArbiter` sends `sessionDecision : SessionDecision` to `ObservationSessionController`.

INT-17: `ObservationSessionController` sends `sessionSnapshot : SessionSnapshot` to `CoordinationOutcomePolicy`.

INT-18: `ObservationSessionController` sends `cameraAcquisitionCommand : CameraAcquisitionCommand` to the root boundary.

INT-19: `ObservationSessionController` sends `radioDeliveryCommand : RadioDeliveryCommand` to the root boundary.

INT-20: `CoordinationOutcomePolicy` sends `operatorCoordinationStatus : OperatorCoordinationStatus` to the root boundary.

INT-21: `CoordinationOutcomePolicy` sends `droneControlObservationNotice : DroneControlObservationNotice` to the root boundary.

## Structural bounds and generated-support allowance

CONSTR-01: The model shall contain exactly one root system usage and exactly eight credited semantic usages corresponding one-for-one to `PART-01` through `PART-08`; no additional usage may receive semantic credit.

CONSTR-02: The eight semantic usages shall be Thread parts beneath exactly one behavior-free support Process beneath the root System, so every semantic usage is at containment depth two. The approved realization has exactly nine non-root architecture nodes and 33 raw `PortConnection` declarations: each of the 21 semantic interactions is declared exactly once inside the Process, and exactly 12 transparent one-for-one root/Process boundary delegations realize `MON-01` through `MON-08` and `CTRL-01` through `CTRL-04`. The Process, its ports, and its delegations are `@generated-support` and uncredited; no flat mapping, other support topology, or other count is authorized without Designer revision.

CONSTR-03: The eight semantic usages shall form one weakly connected semantic region through exactly the 21 directed semantic interactions in `INT-01` through `INT-21`; support delegations are excluded from the semantic count, and no semantic interaction may be omitted, merged, or added.

CONSTR-04: Every semantic usage shall own at least one canonical local relation stated in `CASE-01` through `CASE-20`. Routing, bundling, renaming, one-to-one projection, and central recomputation are prohibited as usage or ownership justification.

## Initialization, priority, phase, and recovery policy

INIT-01: `ObservationSessionState` shall initialize to `IDLE`; both controlled commands shall initialize to `HOLD`; the initial snapshot shall use pre-state and next-state `IDLE`, disposition `NO_CHANGE`, and reason `NONE`; the two status outputs shall follow this snapshot and current battery assessment. Initialization is required but is not one of the 20 counted cases.

PRI-01: Arbitration priority shall be `CANCEL_OBSERVATION` over a `RECOVER_*` proposal over an automatic-progress proposal over a qualified fresh `START_OBSERVATION` over `NO_REQUEST`. Thus cancellation wins a simultaneous recovery conflict, recovery wins a simultaneous fresh request, and automatic completion or retry wins a simultaneous fresh request.

PRI-02: Proposal reason precedence shall be invalid battery evidence before low battery before ineligible sortie context before camera unavailability or failure before radio unavailability. This deterministic policy is a pilot choice and not a severity or safety ranking.

PHASE-01: `IDLE` and `SUSPENDED` are nonactive states. When all qualifications are acceptable they yield `STARTABLE`; only a fresh `START_OBSERVATION` may enter `ACQUIRING`. Stale capture or delivery results in either nonactive state shall not cause progress.

PHASE-02: Camera evidence is a start premise in `IDLE` and `SUSPENDED` and an active premise in `ACQUIRING`, but ceases to be a session premise after capture is queued. In `ACQUIRING`, `CAPTURED` yields `CAPTURE_COMPLETE`, `READY` with no result yields `HOLD`, and camera `UNAVAILABLE` or `FAILED` yields `RECOVER_CAMERA`; radio availability remains a continuing premise from start through delivery.

PHASE-03: In `QUEUED`, any available radio evidence yields `BEGIN_DELIVERY`. In `SENDING`, `ACCEPTED` yields `DELIVERY_COMPLETE`, `REJECTED` yields `DELIVERY_REJECTED`, and no result yields `HOLD`.

REC-01: Any `RECOVER_*` decision from `ACQUIRING`, `QUEUED`, or `SENDING` shall move the session to `SUSPENDED` and set both commands to `HOLD` in the same logical evaluation.

REC-02: Clearing the initiating condition while `SUSPENDED` shall not restart the session: `NO_REQUEST` holds `SUSPENDED`, an ineligible fresh start is rejected while holding `SUSPENDED`, and only a later fully qualified `START_OBSERVATION` enters `ACQUIRING`.

REC-03: `CANCEL_OBSERVATION` shall move any pre-session state to `IDLE` with both commands `HOLD`; it makes no claim that physical camera or radio activity stops immediately.

REC-04: A rejected delivery while `SENDING` shall return the logical session to `QUEUED`, not `SUSPENDED`, so a still-qualified radio path can begin a new send attempt without a fresh operator request. This retry policy is distinct from qualification-loss recovery.

## Exact owner-local nontrivial contract-case partition

BEH-BAT-01 / CASE-01: If `batteryCheck = INVALID`, `BatteryEvidenceQualifier` shall output `UNAVAILABLE` for either capacity band, establishing validity precedence.

BEH-BAT-02 / CASE-02: If `batteryCheck = VALID` and `batteryCapacity = LOW`, `BatteryEvidenceQualifier` shall output `LOW`.

BEH-BAT-03 / CASE-03: If `batteryCheck = VALID` and `batteryCapacity = USABLE`, `BatteryEvidenceQualifier` shall output `ADEQUATE`; cases 01–03 shall be disjoint and cover all four local input combinations.

FAULT-SORT-01 / CASE-04: If battery assessment is `UNAVAILABLE`, `SortieApplicabilityQualifier` shall output `BLOCKED_EVIDENCE` for either sortie context.

BEH-SORT-01 / CASE-05: If battery assessment is `LOW`, `SortieApplicabilityQualifier` shall output `BLOCKED_ENERGY` for either sortie context.

BEH-SORT-02 / CASE-06: If battery assessment is `ADEQUATE`, `SortieApplicabilityQualifier` shall output `ELIGIBLE` exactly at `AT_OBSERVATION_POSITION`, otherwise `BLOCKED_CONTEXT`; cases 04–06 shall be disjoint and total over all six local combinations.

FAULT-CAM-01 / CASE-07: If camera condition is `UNAVAILABLE`, `CameraEvidenceQualifier` shall output `UNAVAILABLE` for every capture result.

BEH-CAM-01 / CASE-08: If camera condition is `READY` and capture result is `NONE`, `CameraEvidenceQualifier` shall output `READY`.

BEH-CAM-02 / CASE-09: If camera condition is `READY`, capture results `CAPTURED` and `FAILED` shall respectively yield camera evidence `CAPTURED` and `FAILED`; cases 07–09 shall be disjoint and total over all six local combinations.

FAULT-RAD-01 / CASE-10: If radio condition is `UNAVAILABLE`, `RadioEvidenceQualifier` shall output `UNAVAILABLE` for every delivery result.

BEH-RAD-01 / CASE-11: If radio condition is `READY` and delivery result is `NONE`, `RadioEvidenceQualifier` shall output `READY`.

BEH-RAD-02 / CASE-12: If radio condition is `READY`, delivery results `ACCEPTED` and `REJECTED` shall respectively yield radio evidence `ACCEPTED` and `REJECTED`; cases 10–12 shall be disjoint and total over all six local combinations.

FAULT-PROP-01 / CASE-13: `SessionProposalOwner` shall first select exactly one phase-applicable blocker using `PRI-02`: any noneligible sortie qualification applies in every state; radio `UNAVAILABLE` applies in every state; camera `UNAVAILABLE` applies in `IDLE`, `SUSPENDED`, and `ACQUIRING`; and camera `FAILED` applies only in `ACQUIRING`. It shall output the corresponding `RECOVER_*` proposal for pre-session `ACQUIRING`, `QUEUED`, or `SENDING`, and the corresponding `BLOCK_*` proposal for pre-session `IDLE` or `SUSPENDED`.

BEH-PROP-01 / CASE-14: With no blocker in an active state, `SessionProposalOwner` shall apply `PHASE-02` and `PHASE-03`: `ACQUIRING` yields `CAPTURE_COMPLETE` only for captured evidence and otherwise `HOLD`; `QUEUED` yields `BEGIN_DELIVERY`; and `SENDING` yields `DELIVERY_COMPLETE`, `DELIVERY_REJECTED`, or `HOLD` according to radio evidence.

BEH-PROP-02 / CASE-15: With no blocker in `IDLE` or `SUSPENDED`, `SessionProposalOwner` shall output `STARTABLE` and shall ignore stale capture and delivery results; cases 13–15 shall be priority-ordered, disjoint, single-valued, and total over all 320 combinations of four sortie qualifications, four camera evidence values, four radio evidence values, and five pre-session states.

BEH-ARB-01 / CASE-16: If intent is `CANCEL_OBSERVATION`, `ObservationIntentArbiter` shall output `CANCEL_TO_IDLE` for every proposal, establishing the highest-priority conflict result.

FAULT-ARB-01 / CASE-17: If intent is not cancellation, the arbiter shall map each `RECOVER_*` proposal to its corresponding `SUSPEND_*` decision before mapping automatic progress: `CAPTURE_COMPLETE` to `QUEUE_CAPTURE`, `BEGIN_DELIVERY` to `BEGIN_TRANSMISSION`, `DELIVERY_COMPLETE` to `COMPLETE_TO_IDLE`, and `DELIVERY_REJECTED` to `RETRY_QUEUE`.

BEH-ARB-02 / CASE-18: Otherwise, `START_OBSERVATION` with `STARTABLE` shall yield `BEGIN_ACQUISITION`, `START_OBSERVATION` with a `BLOCK_*` proposal shall yield the corresponding `REJECT_*`, and every remaining combination shall yield `NO_CHANGE`; cases 16–18 shall be priority-ordered, disjoint, single-valued, and total over all 48 intent/proposal combinations.

BEH-STATE-01 / CASE-19: For all 85 pre-session/decision combinations, `ObservationSessionController` shall assign next state, disposition, reason, snapshot, and both commands by the following total relation: `NO_CHANGE` holds state; `BEGIN_ACQUISITION` selects `ACQUIRING`; `CANCEL_TO_IDLE` and `COMPLETE_TO_IDLE` select `IDLE`; each `SUSPEND_*` selects `SUSPENDED`; `QUEUE_CAPTURE` and `RETRY_QUEUE` select `QUEUED`; `BEGIN_TRANSMISSION` selects `SENDING`; and each `REJECT_*` holds state. Disposition and reason shall correspond to the decision; camera command shall be `ACQUIRE` exactly when next state is `ACQUIRING`, otherwise `HOLD`; and radio command shall be `SEND_OBSERVATION` exactly when next state is `SENDING`, otherwise `HOLD`.

BEH-OUT-01 / CASE-20: For every structurally valid battery-assessment/snapshot combination, `CoordinationOutcomePolicy` shall assign exactly one advisory by precedence: current assessment `UNAVAILABLE` maps to `EVIDENCE_UNAVAILABLE`; current assessment `LOW` maps to `ENERGY_LOW`; disposition `RECOVERY_APPLIED` paired with one of the five qualification reasons maps to its corresponding advisory; disposition `REJECTED` maps to `REQUEST_REJECTED`; disposition `COMPLETED` maps to `DELIVERY_COMPLETED`; and every remaining combination maps to `NONE`. Structurally valid `RECOVERY_APPLIED` pairings with `NONE` or `CANCELLED` shall fall through the remaining branches. The policy shall assign `DELIVERY_REPORTED` for disposition `COMPLETED`, otherwise `OBSERVATION_ACTIVE` for next state `ACQUIRING`, `QUEUED`, or `SENDING`, otherwise `OBSERVATION_BLOCKED` for next state `SUSPENDED` or disposition `REJECTED`, otherwise `IDLE`. Copied status fields receive no case credit.

## Nominal and off-nominal scenario families

SCN-01: Nominal acquisition-and-delivery family — from `IDLE`, adequate valid energy, observation position, ready camera and radio, and a fresh start enter `ACQUIRING`; a later capture queues the observation; the next evaluation begins delivery; and a later accepted result returns to `IDLE` with `DELIVERY_COMPLETED` and `DELIVERY_REPORTED`.

SCN-02: Invalid-evidence rejection family — invalid battery evidence and a fresh start yield `REJECT_EVIDENCE`, hold a nonactive state, issue neither command, and report evidence unavailable.

SCN-03: Low-energy rejection family — valid low battery and a fresh start yield `REJECT_ENERGY`, issue neither command, and report the selected low-energy advisory without claiming endurance or flight safety.

SCN-04: Cancellation-priority conflict family — from any active state, simultaneous cancellation and a qualification loss select `CANCEL_TO_IDLE`, not suspension, and both commands become `HOLD`.

SCN-05: Camera-loss recovery family — camera unavailability or capture failure during `ACQUIRING` suspends the active session, with camera acquisition held and the camera reason reported.

SCN-06: Context-loss recovery family — leaving the observation-position context during `ACQUIRING`, `QUEUED`, or `SENDING` suspends the session without commanding any flight response.

SCN-07: Delivery-retry family — a rejected delivery while `SENDING` returns to `QUEUED`; if qualifications remain acceptable, the next evaluation begins a new send attempt without a fresh request, and a later acceptance completes the session.

SCN-08: Recovery-clear-and-fresh-reentry family — after any recovery reaches `SUSPENDED`, clearing the cause with `NO_REQUEST` holds suspension, an ineligible fresh request is rejected, and only a later fully qualified fresh start enters `ACQUIRING`.

## Risks and logical mitigations within the claim boundary

RISK-01: Treating invalid or low battery evidence as acceptable could start a logical observation session contrary to the selected policy; cases 01–06, 13, and 18 reject or recover without asserting a physical safety consequence.

RISK-02: Treating stale capture or delivery results as current could skip acquisition or delivery phases; cases 14–15 and the phase rules interpret results only in their relevant active state.

RISK-03: Honoring an operator intent and a conflicting simultaneous recovery or progress proposal could create contradictory state and commands; the single proposal owner, single arbiter, `PRI-01`, and single state owner select one result.

RISK-04: Treating a delivery acknowledgment as proof of useful fire observation could exceed the source evidence; `CTX-06`, `CTRL-02`, and the deferred-claim boundary restrict it to a logical pilot-fixture acknowledgment.

## Essential assumptions and constraints

ASM-01: `CTX-01` is responsible only for supplying one domain-valid intent each logical evaluation. The abstract does not authenticate the operator or establish real mission authority.

ASM-02: `CTX-02` supplies both battery fields and is responsible only for domain-valid enum values; no independence, accuracy, latency, physical-fault, or endurance guarantee is assumed.

ASM-03: `CTX-03` supplies one domain-valid context value. The selected requirement that acquisition and delivery occur only at `AT_OBSERVATION_POSITION` is a pilot policy, not a source fact or navigation guarantee.

ASM-04: `CTX-04` supplies camera condition and result independently and `CTX-05` supplies radio condition and result independently. Unavailability takes precedence over a simultaneous positive result, and no freshness or physical-performance claim is assumed.

ASM-05: `currentSession` in `INT-14` is the committed pre-evaluation state. The state owner shall initialize state, publish pre-state using retained-state semantics, compute from pre-state, and commit only the selected next state; no other usage may reconstruct or write that state.

CONSTR-05: The model shall contain exactly one observation-session state owner, at least the cooperating proposal and arbitration owners in `OWNER-02` and `OWNER-03`, and no flight, navigation, battery, camera, radio, recipient, or fire-environment state variable owned by this system.

CONSTR-06: Owner-local contracts shall implement exactly 20 nontrivial cases one-for-one with `CASE-01` through `CASE-20`; initialization, type well-formedness, support routing, record projection, and representation conversion are separate and do not change the count.

CONSTR-07: Bounded end-to-end analysis shall enumerate all 4,320 one-evaluation combinations of the 864 boundary-input valuations and five pre-session states (`3 * 2 * 2 * 2 * 2 * 3 * 2 * 3 * 5`), compose all eight owner-local relations through `INT-01` through `INT-21`, and compare every derived fact, proposal, decision, state, snapshot field, command, and status output with a separately stated abstract reference relation.

CONSTR-08: Owner-local finite analysis shall enumerate and report the complete products: battery qualifier 4, sortie qualifier 6, camera qualifier 6, radio qualifier 6, proposal owner 320, arbiter 48, state controller 85, and outcome policy 3,675 structurally valid combinations (`3 * 5 * 5 * 7 * 7`). It shall report gaps, overlaps, producer-reachable subsets, and structurally valid but producer-unreachable inputs separately.

CONSTR-09: Bounded sequence analysis shall exercise all eight scenario families, including stale-result isolation, cancellation conflict, qualification recovery, delivery retry, cause clearing, no-request suspension hold, ineligible fresh rejection, and eligible fresh reentry. This is bounded logical analysis, not executable application or temporal proof evidence.

## Trace, verification, and objective pass criteria

TRACE-01: Every significant model package, type, component definition and usage, port, semantic connection, state variable, initialization clause, integration clause, and contract clause shall cite one or more identifiers here or carry explicit `@generated-support <reason>` rationale.

TRACE-02: Every canonical identifier here shall be classified in the trace report as realized, informational, or explicitly deferred; missing actionable coverage and significant unexplained additions fail the stage.

PASS-01: Structural conformance requires exactly one root System, exactly one uncredited support Process, exactly eight credited semantic Thread usages, exactly 21 semantic interactions in one weak semantic region, semantic containment depth two, exactly nine non-root architecture nodes, and exactly 33 raw `PortConnection` declarations as partitioned by `CONSTR-02`, with no padding.

PASS-02: Ownership conformance requires canonical owner-local relations for all eight semantic usages; only `ObservationSessionController` may write session state; no downstream recomputation may receive upstream owner credit; and routing, copied fields, and one-to-one projections shall be excluded from credit.

PASS-03: Behavioral conformance requires exactly 20 nontrivial cases with complete, disjoint, priority-ordered finite partitions; all state, snapshot, command, and status outputs initialized or constrained; cancellation, recovery, progress, retry, rejection, no-request hold, stale-result isolation, and fresh-request reentry matching this abstract.

PASS-04: Mechanical verification requires architecture-stage and final `hamr sysml tipe` success, resolved directionally and type-compatible endpoints, independent harness success, and a source-hash-bound analyzer with zero gaps, overlaps, or mismatches for every product and scenario in `CONSTR-07` through `CONSTR-09`.

PASS-05: Trace conformance requires complete bidirectional coverage, generated-support accounting separate from semantic metrics, no omitted or extra semantic interaction, and no significant unexplained model element.

PASS-06: Validation requires Designer review of the retained source, summary, trace report, analyzer evidence, and overview for fitness to the bounded acquisition-and-delivery purpose; typechecking, parsing, bounded enumeration, and rendering alone are insufficient.

PASS-07: Evidence shall report code generation, application execution, physical validation, unbounded temporal proof, formal semantic correctness beyond executed checks, fire observation success, communications performance, navigation, flight, endurance, safety, and certification as deferred or `not-run`, never passed.

## Model-review resolution and generation authorization

MODEL-01: The localized containment finding is accepted for this baseline: generation shall use the exact support Process mapping in `CONSTR-02`. The cited trusted forms establish feasibility for this non-executable logical profile, not a general claim about all SysML-AADL containment forms.

MODEL-02: The locality and data-record finding is accepted: `SessionSnapshot` and `OperatorCoordinationStatus` may use GUMBO-inspectable `attribute` fields and repeated fields may reuse the same enum classifiers. Any representation-only classifier and extensional projection introduced by generation shall remain `@generated-support`, and PART-08 shall retain all advisory and notice policy.

MODEL-03: The ownership finding is accepted: every PART has the inputs required by its canonical local relation, `currentSession = In(sessionState)` may expose pre-evaluation state without creating another owner, and no copied field, command encoding, routing element, or one-to-one conversion earns owner credit.

MODEL-04: The bounded-analysis feasibility finding is accepted as an obligation, not as completed evidence. The retained analyzer shall separately encode the eight owner-local relations and a raw-boundary abstract reference relation, perform the full enumerations and scenario traces in `CONSTR-07` through `CONSTR-09`, bind results to the generated source hash, and report actual outcomes before any verification or validation claim.

AUTH-01: This approved baseline authorizes Model generation only for the selected primary purpose, exact `8/21/20/8` semantic tuple, exact `9 nodes/33 declarations/depth two` support realization, finite boundary, single state owner, cooperating decision owners, explicit priority conflict, recovery and retry distinctions, complete partitions, generated-support accounting, bounded evidence obligations, and deferred-claim boundary stated here. Any later incompatibility shall return a specific same-run Designer repair request rather than weaken policy or replace the seed.
