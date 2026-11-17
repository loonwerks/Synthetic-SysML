# Observation Acquisition and Radio-Delivery Coordinator

## Selected system context

### Need, purpose, goals, and operating context

NEED-01: A single forest-fire observation drone needs a bounded logical function that
coordinates one requested camera observation with radio delivery while making
qualification failures and recovery visible, without taking ownership of flight,
navigation, energy management, or physical sensing.

PURPOSE-01: The Observation Acquisition and Radio-Delivery Coordinator shall qualify
current energy, observation-position, camera, and radio evidence; arbitrate
cancellation, recovery, automatic progress, and fresh starts; retain one logical
observation-session state; command acquisition and delivery; and publish coordination
outcomes.

GOAL-01: The system shall issue camera acquisition only for a qualified fresh
observation request and shall issue radio delivery only after a capture has been
accepted into the current logical session.

GOAL-02: The system shall suspend an active session when a required qualification
becomes unavailable and shall require a later qualified fresh request before restarting
after suspension.

GOAL-03: The system shall produce one deterministic result when the current operator
intent conflicts with a simultaneous recovery or automatic-progress proposal, while
making no fire-detection, flight-safety, observation-quality, or
communications-performance claim.

### Scope and system boundary

CTX-01: The Observation Operator supplies at most one current observation intent and
receives coordination status. This contextual role is inferred for the pilot and is not
a seed-defined command authority.

CTX-02: The Battery-Management Source supplies the qualitative capacity indication and
battery-check validity. It retains all physical energy-management responsibility.

CTX-03: The Flight-Context Source indicates only whether the external vehicle is
presently in the selected observation-position context. It owns flight and navigation
state and receives no command from this system.

CTX-04: The Camera Equipment supplies availability and the current capture result and
receives a logical acquisition command. The command and result do not establish image
content, quality, timing, or fire detection.

CTX-05: The Radio Equipment supplies availability and the current delivery result and
receives a logical delivery command. The command and result do not establish radio
range, latency, bandwidth, or physical reception.

CTX-06: The Observation Recipient is represented only through `deliveryResult` supplied
via `CTX-05`; `ACCEPTED` means the pilot fixture acknowledges the offered observation,
not that a useful fire observation was obtained.

CTX-07: The Drone-Control Recipient receives a coordination notice for awareness and
retains all flight, propulsion, and mission authority.

### Exact finite boundary inputs

MON-01: `observationIntent : ObservationIntent` is supplied by `CTX-01` and has exactly
`{NO_REQUEST, START_OBSERVATION, CANCEL_OBSERVATION}`.

MON-02: `batteryCapacity : BatteryCapacityBand` is supplied by `CTX-02` and has exactly
`{LOW, USABLE}`; it is qualitative and unitless.

MON-03: `batteryCheck : BatteryCheck` is supplied by `CTX-02` and has exactly `{INVALID,
VALID}`; `INVALID` removes the simultaneous capacity band from qualification evidence.

MON-04: `sortieContext : SortieContext` is supplied by `CTX-03` and has exactly
`{OUTSIDE_OBSERVATION_POSITION, AT_OBSERVATION_POSITION}`; these are policy labels, not
navigation claims.

MON-05: `cameraCondition : CameraCondition` is supplied by `CTX-04` and has exactly
`{UNAVAILABLE, READY}`.

MON-06: `captureResult : CaptureResult` is supplied by `CTX-04` and has exactly `{NONE,
CAPTURED, FAILED}`; it is interpreted only in the current session phase.

MON-07: `radioCondition : RadioCondition` is supplied by `CTX-05` and has exactly
`{UNAVAILABLE, READY}`.

MON-08: `deliveryResult : DeliveryResult` is supplied through `CTX-05` for `CTX-06` and
has exactly `{NONE, ACCEPTED, REJECTED}`; it is interpreted only while delivery is
active.

### Exact finite controlled outputs

CTRL-01: `cameraAcquisitionCommand : CameraAcquisitionCommand` is delivered to `CTX-04`
and has exactly `{HOLD, ACQUIRE}`; it controls only logical acquisition intent.

CTRL-02: `radioDeliveryCommand : RadioDeliveryCommand` is delivered to `CTX-05` and has
exactly `{HOLD, SEND_OBSERVATION}`; it controls only logical delivery intent.

CTRL-03: `operatorCoordinationStatus : OperatorCoordinationStatus` is delivered to
`CTX-01` and contains the next session state, current battery assessment, disposition,
reason, and one precedence-selected operator advisory. Copied fields receive no
independent owner credit.

CTRL-04: `droneControlObservationNotice : DroneControlObservationNotice` is delivered to
`CTX-07` and has exactly `{IDLE, OBSERVATION_ACTIVE, OBSERVATION_BLOCKED,
DELIVERY_REPORTED}`; it neither authorizes nor commands flight.

### Risks and logical mitigations within the claim boundary

RISK-01: Treating invalid or low battery evidence as acceptable could start a logical
observation session contrary to the selected policy; cases 01–06, 13, and 18 reject or
recover without asserting a physical safety consequence.

RISK-02: Treating stale capture or delivery results as current could skip acquisition or
delivery phases; cases 14–15 and the phase rules interpret results only in their
relevant active state.

RISK-03: Honoring an operator intent and a conflicting simultaneous recovery or progress
proposal could create contradictory state and commands; the single proposal owner,
single arbiter, `PRI-01`, and single state owner select one result.

RISK-04: Treating a delivery acknowledgment as proof of useful fire observation could
exceed the source evidence; `CTX-06`, `CTRL-02`, and the deferred-claim boundary
restrict it to a logical pilot-fixture acknowledgment.

### Essential assumptions and constraints

ASM-01: `CTX-01` is responsible only for supplying one domain-valid intent each logical
evaluation. The abstract does not authenticate the operator or establish real mission
authority.

ASM-02: `CTX-02` supplies both battery fields and is responsible only for domain-valid
enum values; no independence, accuracy, latency, physical-fault, or endurance guarantee
is assumed.

ASM-03: `CTX-03` supplies one domain-valid context value. The selected requirement that
acquisition and delivery occur only at `AT_OBSERVATION_POSITION` is a pilot policy, not
a source fact or navigation guarantee.

ASM-04: `CTX-04` supplies camera condition and result independently and `CTX-05`
supplies radio condition and result independently. Unavailability takes precedence over
a simultaneous positive result, and no freshness or physical-performance claim is
assumed.

ASM-05: `currentSession` in `INT-14` is the committed pre-evaluation state. The state
owner shall initialize state, publish pre-state using retained-state semantics, compute
from pre-state, and commit only the selected next state; no other usage may reconstruct
or write that state.

## Supporting contract definitions

### State `Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionController::committedSession`

State `committedSession` has type `Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState`.

## Detailed behavioral requirements

### Requirements for BatteryEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_BATTERY_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, BatteryEvidenceQualifier shall produce a result for which if batteryCheck is INVALID, then batteryAssessment is UNAVAILABLE, if batteryCheck is VALID and batteryCapacity is LOW, then batteryAssessment is LOW, and if batteryCheck is VALID and batteryCapacity is USABLE, then batteryAssessment is ADEQUATE.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_INVALID_EVIDENCE` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is INVALID, BatteryEvidenceQualifier shall set batteryAssessment to UNAVAILABLE.

##### `CASE_02_VALID_LOW` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is VALID and batteryCapacity is LOW, BatteryEvidenceQualifier shall set batteryAssessment to LOW.

##### `CASE_03_VALID_USABLE` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is VALID and batteryCapacity is USABLE, BatteryEvidenceQualifier shall set batteryAssessment to ADEQUATE.

### Requirements for CameraEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_CAMERA_EVIDENCE` — Required behavior

> During contract evaluation for the initialization phase, CameraEvidenceQualifier shall produce a result for which if cameraCondition is UNAVAILABLE, then cameraEvidence is UNAVAILABLE, if cameraCondition is READY and captureResult is NONE, then cameraEvidence is READY, if cameraCondition is READY and captureResult is CAPTURED, then cameraEvidence is CAPTURED, and if cameraCondition is READY and captureResult is FAILED, then cameraEvidence is FAILED.

#### Contract clauses evaluated in the compute phase

##### `CASE_07_CAMERA_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if cameraCondition is UNAVAILABLE, CameraEvidenceQualifier shall set cameraEvidence to UNAVAILABLE.

##### `CASE_08_CAMERA_READY` — Conditional behavior

> During contract evaluation for the compute phase, if cameraCondition is READY and captureResult is NONE, CameraEvidenceQualifier shall set cameraEvidence to READY.

##### `CASE_09_CAMERA_RESULT` — Conditional behavior

> During contract evaluation for the compute phase, if cameraCondition is READY and captureResult is not NONE, CameraEvidenceQualifier shall produce a result for which if captureResult is CAPTURED, then cameraEvidence is CAPTURED and if captureResult is FAILED, then cameraEvidence is FAILED.

### Requirements for CoordinationOutcomePolicy

#### Contract clauses evaluated in the initialization phase

##### `INIT_COORDINATION_OUTCOMES` — Required behavior

> During contract evaluation for the initialization phase, CoordinationOutcomePolicy shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - operatorCoordinationStatus batteryAssessment is batteryAssessment
>   - **If:**
>     
>     sessionSnapshot nextSession is IDLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is IDLE
>   - **If:**
>     
>     sessionSnapshot nextSession is ACQUIRING
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is ACQUIRING
>   - **If:**
>     
>     sessionSnapshot nextSession is QUEUED
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is QUEUED
>   - **If:**
>     
>     sessionSnapshot nextSession is SENDING
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is SENDING
>   - **If:**
>     
>     sessionSnapshot nextSession is SUSPENDED
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is SUSPENDED
>   - **If:**
>     
>     sessionSnapshot disposition is NO CHANGE
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is NO CHANGE
>   - **If:**
>     
>     sessionSnapshot disposition is STARTED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is STARTED
>   - **If:**
>     
>     sessionSnapshot disposition is CANCELLED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is CANCELLED
>   - **If:**
>     
>     sessionSnapshot disposition is PROGRESSED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is PROGRESSED
>   - **If:**
>     
>     sessionSnapshot disposition is COMPLETED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is COMPLETED
>   - **If:**
>     
>     sessionSnapshot disposition is RECOVERY APPLIED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is RECOVERY APPLIED
>   - **If:**
>     
>     sessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is REJECTED
>   - **If:**
>     
>     sessionSnapshot reason is NONE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is NONE
>   - **If:**
>     
>     sessionSnapshot reason is CANCELLED
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is CANCELLED
>   - **If:**
>     
>     sessionSnapshot reason is EVIDENCE UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     sessionSnapshot reason is ENERGY LOW
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is ENERGY LOW
>   - **If:**
>     
>     sessionSnapshot reason is CONTEXT INELIGIBLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is CONTEXT INELIGIBLE
>   - **If:**
>     
>     sessionSnapshot reason is CAMERA UNUSABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is CAMERA UNUSABLE
>   - **If:**
>     
>     sessionSnapshot reason is RADIO UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is RADIO UNAVAILABLE
>   - **If:**
>     
>     batteryAssessment is UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     batteryAssessment is LOW
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is ENERGY LOW
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is EVIDENCE UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is ENERGY LOW
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is ENERGY LOW
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is CONTEXT INELIGIBLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is CONTEXT INELIGIBLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is CAMERA UNUSABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is CAMERA UNUSABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is RADIO UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is RADIO UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is REQUEST REJECTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is COMPLETED
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is DELIVERY COMPLETED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - sessionSnapshot disposition is RECOVERY APPLIED
>               - At least one of the following conditions holds:
>                 
>                   - sessionSnapshot reason is NONE
>                   - sessionSnapshot reason is CANCELLED
>           - All of the following conditions hold:
>             
>               - sessionSnapshot disposition is not RECOVERY APPLIED
>               - sessionSnapshot disposition is not REJECTED
>               - sessionSnapshot disposition is not COMPLETED
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is NONE
>   - **If:**
>     
>     sessionSnapshot disposition is COMPLETED
>     
>     **Then:**
>     
>     droneControlObservationNotice is DELIVERY REPORTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sessionSnapshot disposition is not COMPLETED
>       - At least one of the following conditions holds:
>         
>           - sessionSnapshot nextSession is ACQUIRING
>           - sessionSnapshot nextSession is QUEUED
>           - sessionSnapshot nextSession is SENDING
>     
>     **Then:**
>     
>     droneControlObservationNotice is OBSERVATION ACTIVE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sessionSnapshot disposition is not COMPLETED
>       - sessionSnapshot nextSession is not ACQUIRING
>       - sessionSnapshot nextSession is not QUEUED
>       - sessionSnapshot nextSession is not SENDING
>       - At least one of the following conditions holds:
>         
>           - sessionSnapshot nextSession is SUSPENDED
>           - sessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     droneControlObservationNotice is OBSERVATION BLOCKED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sessionSnapshot disposition is not COMPLETED
>       - sessionSnapshot nextSession is IDLE
>       - sessionSnapshot disposition is not REJECTED
>     
>     **Then:**
>     
>     droneControlObservationNotice is IDLE.

#### Contract clauses evaluated in the compute phase

##### `CASE_20_RECIPIENT_SPECIFIC_OUTCOMES` — Conditional behavior

> During contract evaluation for the compute phase, CoordinationOutcomePolicy shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - operatorCoordinationStatus batteryAssessment is batteryAssessment
>   - **If:**
>     
>     sessionSnapshot nextSession is IDLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is IDLE
>   - **If:**
>     
>     sessionSnapshot nextSession is ACQUIRING
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is ACQUIRING
>   - **If:**
>     
>     sessionSnapshot nextSession is QUEUED
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is QUEUED
>   - **If:**
>     
>     sessionSnapshot nextSession is SENDING
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is SENDING
>   - **If:**
>     
>     sessionSnapshot nextSession is SUSPENDED
>     
>     **Then:**
>     
>     operatorCoordinationStatus nextSession is SUSPENDED
>   - **If:**
>     
>     sessionSnapshot disposition is NO CHANGE
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is NO CHANGE
>   - **If:**
>     
>     sessionSnapshot disposition is STARTED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is STARTED
>   - **If:**
>     
>     sessionSnapshot disposition is CANCELLED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is CANCELLED
>   - **If:**
>     
>     sessionSnapshot disposition is PROGRESSED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is PROGRESSED
>   - **If:**
>     
>     sessionSnapshot disposition is COMPLETED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is COMPLETED
>   - **If:**
>     
>     sessionSnapshot disposition is RECOVERY APPLIED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is RECOVERY APPLIED
>   - **If:**
>     
>     sessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     operatorCoordinationStatus disposition is REJECTED
>   - **If:**
>     
>     sessionSnapshot reason is NONE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is NONE
>   - **If:**
>     
>     sessionSnapshot reason is CANCELLED
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is CANCELLED
>   - **If:**
>     
>     sessionSnapshot reason is EVIDENCE UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     sessionSnapshot reason is ENERGY LOW
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is ENERGY LOW
>   - **If:**
>     
>     sessionSnapshot reason is CONTEXT INELIGIBLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is CONTEXT INELIGIBLE
>   - **If:**
>     
>     sessionSnapshot reason is CAMERA UNUSABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is CAMERA UNUSABLE
>   - **If:**
>     
>     sessionSnapshot reason is RADIO UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus reason is RADIO UNAVAILABLE
>   - **If:**
>     
>     batteryAssessment is UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     batteryAssessment is LOW
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is ENERGY LOW
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is EVIDENCE UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is ENERGY LOW
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is ENERGY LOW
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is CONTEXT INELIGIBLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is CONTEXT INELIGIBLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is CAMERA UNUSABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is CAMERA UNUSABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is RECOVERY APPLIED
>       - sessionSnapshot reason is RADIO UNAVAILABLE
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is RADIO UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is REQUEST REJECTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - sessionSnapshot disposition is COMPLETED
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is DELIVERY COMPLETED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - sessionSnapshot disposition is RECOVERY APPLIED
>               - At least one of the following conditions holds:
>                 
>                   - sessionSnapshot reason is NONE
>                   - sessionSnapshot reason is CANCELLED
>           - All of the following conditions hold:
>             
>               - sessionSnapshot disposition is not RECOVERY APPLIED
>               - sessionSnapshot disposition is not REJECTED
>               - sessionSnapshot disposition is not COMPLETED
>     
>     **Then:**
>     
>     operatorCoordinationStatus advisory is NONE
>   - **If:**
>     
>     sessionSnapshot disposition is COMPLETED
>     
>     **Then:**
>     
>     droneControlObservationNotice is DELIVERY REPORTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sessionSnapshot disposition is not COMPLETED
>       - At least one of the following conditions holds:
>         
>           - sessionSnapshot nextSession is ACQUIRING
>           - sessionSnapshot nextSession is QUEUED
>           - sessionSnapshot nextSession is SENDING
>     
>     **Then:**
>     
>     droneControlObservationNotice is OBSERVATION ACTIVE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sessionSnapshot disposition is not COMPLETED
>       - sessionSnapshot nextSession is not ACQUIRING
>       - sessionSnapshot nextSession is not QUEUED
>       - sessionSnapshot nextSession is not SENDING
>       - At least one of the following conditions holds:
>         
>           - sessionSnapshot nextSession is SUSPENDED
>           - sessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     droneControlObservationNotice is OBSERVATION BLOCKED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sessionSnapshot disposition is not COMPLETED
>       - sessionSnapshot nextSession is IDLE
>       - sessionSnapshot disposition is not REJECTED
>     
>     **Then:**
>     
>     droneControlObservationNotice is IDLE.

### Requirements for ObservationIntentArbiter

#### Contract clauses evaluated in the initialization phase

##### `INIT_ARBITRATION` — Required behavior

> During contract evaluation for the initialization phase, ObservationIntentArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     observationIntent is CANCEL OBSERVATION
>     
>     **Then:**
>     
>     sessionDecision is CANCEL TO IDLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is RECOVER EVIDENCE
>     
>     **Then:**
>     
>     sessionDecision is SUSPEND EVIDENCE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is RECOVER ENERGY
>     
>     **Then:**
>     
>     sessionDecision is SUSPEND ENERGY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is RECOVER CONTEXT
>     
>     **Then:**
>     
>     sessionDecision is SUSPEND CONTEXT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is RECOVER CAMERA
>     
>     **Then:**
>     
>     sessionDecision is SUSPEND CAMERA
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is RECOVER RADIO
>     
>     **Then:**
>     
>     sessionDecision is SUSPEND RADIO
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is CAPTURE COMPLETE
>     
>     **Then:**
>     
>     sessionDecision is QUEUE CAPTURE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is BEGIN DELIVERY
>     
>     **Then:**
>     
>     sessionDecision is BEGIN TRANSMISSION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is DELIVERY COMPLETE
>     
>     **Then:**
>     
>     sessionDecision is COMPLETE TO IDLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is DELIVERY REJECTED
>     
>     **Then:**
>     
>     sessionDecision is RETRY QUEUE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is START OBSERVATION
>       - sessionProposal is STARTABLE
>     
>     **Then:**
>     
>     sessionDecision is BEGIN ACQUISITION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is START OBSERVATION
>       - sessionProposal is BLOCK EVIDENCE
>     
>     **Then:**
>     
>     sessionDecision is REJECT EVIDENCE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is START OBSERVATION
>       - sessionProposal is BLOCK ENERGY
>     
>     **Then:**
>     
>     sessionDecision is REJECT ENERGY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is START OBSERVATION
>       - sessionProposal is BLOCK CONTEXT
>     
>     **Then:**
>     
>     sessionDecision is REJECT CONTEXT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is START OBSERVATION
>       - sessionProposal is BLOCK CAMERA
>     
>     **Then:**
>     
>     sessionDecision is REJECT CAMERA
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is START OBSERVATION
>       - sessionProposal is BLOCK RADIO
>     
>     **Then:**
>     
>     sessionDecision is REJECT RADIO
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - observationIntent is not CANCEL OBSERVATION
>       - sessionProposal is not RECOVER EVIDENCE
>       - sessionProposal is not RECOVER ENERGY
>       - sessionProposal is not RECOVER CONTEXT
>       - sessionProposal is not RECOVER CAMERA
>       - sessionProposal is not RECOVER RADIO
>       - sessionProposal is not CAPTURE COMPLETE
>       - sessionProposal is not BEGIN DELIVERY
>       - sessionProposal is not DELIVERY COMPLETE
>       - sessionProposal is not DELIVERY REJECTED
>       - At least one of the following conditions holds:
>         
>           - observationIntent is NO REQUEST
>           - sessionProposal is HOLD
>     
>     **Then:**
>     
>     sessionDecision is NO CHANGE.

#### Contract clauses evaluated in the compute phase

##### `CASE_16_CANCEL_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if observationIntent is CANCEL OBSERVATION, ObservationIntentArbiter shall set sessionDecision to CANCEL TO IDLE.

##### `CASE_17_RECOVERY_OR_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 17 RECOVERY OR PROGRESS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - observationIntent is not CANCEL OBSERVATION
>   - At least one of the following conditions holds:
>     
>       - sessionProposal is RECOVER EVIDENCE
>       - sessionProposal is RECOVER ENERGY
>       - sessionProposal is RECOVER CONTEXT
>       - sessionProposal is RECOVER CAMERA
>       - sessionProposal is RECOVER RADIO
>       - sessionProposal is CAPTURE COMPLETE
>       - sessionProposal is BEGIN DELIVERY
>       - sessionProposal is DELIVERY COMPLETE
>       - sessionProposal is DELIVERY REJECTED.

> When all applicability conditions are met, ObservationIntentArbiter shall produce a result for which all of the following conditions hold:
>
> if sessionProposal is RECOVER EVIDENCE, then sessionDecision is SUSPEND EVIDENCE, if sessionProposal is RECOVER ENERGY, then sessionDecision is SUSPEND ENERGY, if sessionProposal is RECOVER CONTEXT, then sessionDecision is SUSPEND CONTEXT, if sessionProposal is RECOVER CAMERA, then sessionDecision is SUSPEND CAMERA, if sessionProposal is RECOVER RADIO, then sessionDecision is SUSPEND RADIO, if sessionProposal is CAPTURE COMPLETE, then sessionDecision is QUEUE CAPTURE, if sessionProposal is BEGIN DELIVERY, then sessionDecision is BEGIN TRANSMISSION, if sessionProposal is DELIVERY COMPLETE, then sessionDecision is COMPLETE TO IDLE, and if sessionProposal is DELIVERY REJECTED, then sessionDecision is RETRY QUEUE.

##### `CASE_18_FRESH_START_REJECTION_OR_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if observationIntent is not CANCEL OBSERVATION, sessionProposal is not RECOVER EVIDENCE, sessionProposal is not RECOVER ENERGY, sessionProposal is not RECOVER CONTEXT, sessionProposal is not RECOVER CAMERA, sessionProposal is not RECOVER RADIO, sessionProposal is not CAPTURE COMPLETE, sessionProposal is not BEGIN DELIVERY, sessionProposal is not DELIVERY COMPLETE, and sessionProposal is not DELIVERY REJECTED, ObservationIntentArbiter shall produce a result for which if observationIntent is START OBSERVATION and sessionProposal is STARTABLE, then sessionDecision is BEGIN ACQUISITION, if observationIntent is START OBSERVATION and sessionProposal is BLOCK EVIDENCE, then sessionDecision is REJECT EVIDENCE, if observationIntent is START OBSERVATION and sessionProposal is BLOCK ENERGY, then sessionDecision is REJECT ENERGY, if observationIntent is START OBSERVATION and sessionProposal is BLOCK CONTEXT, then sessionDecision is REJECT CONTEXT, if observationIntent is START OBSERVATION and sessionProposal is BLOCK CAMERA, then sessionDecision is REJECT CAMERA, if observationIntent is START OBSERVATION and sessionProposal is BLOCK RADIO, then sessionDecision is REJECT RADIO, and if observationIntent is NO REQUEST or sessionProposal is HOLD, then sessionDecision is NO CHANGE.

### Requirements for ObservationSessionController

#### Contract clauses evaluated in the initialization phase

##### `INIT_SESSION_COMMANDS_AND_SNAPSHOT` — Required behavior

> During contract evaluation for the initialization phase, ObservationSessionController shall set committedSession to IDLE, sessionPhaseOutput to IDLE, sessionSnapshot preSession to IDLE, sessionSnapshot nextSession to IDLE, sessionSnapshot disposition to NO CHANGE, sessionSnapshot reason to NONE, cameraAcquisitionCommand to HOLD, and radioDeliveryCommand to HOLD.

#### Contract clauses evaluated in the compute phase

##### `PUBLISH_PRE_SESSION` — Required behavior

> During contract evaluation for the compute phase, ObservationSessionController shall set sessionPhaseOutput to the value of committedSession on entry.

##### `COMPLETE_SNAPSHOT` — Required behavior

> During contract evaluation for the compute phase, ObservationSessionController shall produce a result for which if the value of committedSession on entry is IDLE, then sessionSnapshot preSession is IDLE, if the value of committedSession on entry is ACQUIRING, then sessionSnapshot preSession is ACQUIRING, if the value of committedSession on entry is QUEUED, then sessionSnapshot preSession is QUEUED, if the value of committedSession on entry is SENDING, then sessionSnapshot preSession is SENDING, if the value of committedSession on entry is SUSPENDED, then sessionSnapshot preSession is SUSPENDED, if committedSession is IDLE, then sessionSnapshot nextSession is IDLE, if committedSession is ACQUIRING, then sessionSnapshot nextSession is ACQUIRING, if committedSession is QUEUED, then sessionSnapshot nextSession is QUEUED, if committedSession is SENDING, then sessionSnapshot nextSession is SENDING, and if committedSession is SUSPENDED, then sessionSnapshot nextSession is SUSPENDED.

##### `CAMERA_COMMAND_FROM_NEXT_STATE` — Required behavior

> During contract evaluation for the compute phase, ObservationSessionController shall produce a result for which if committedSession is ACQUIRING, then cameraAcquisitionCommand is ACQUIRE and if committedSession is not ACQUIRING, then cameraAcquisitionCommand is HOLD.

##### `RADIO_COMMAND_FROM_NEXT_STATE` — Required behavior

> During contract evaluation for the compute phase, ObservationSessionController shall produce a result for which if committedSession is SENDING, then radioDeliveryCommand is SEND OBSERVATION and if committedSession is not SENDING, then radioDeliveryCommand is HOLD.

##### `RECOVERY_REASON_PRESERVATION` — Required behavior

> During contract evaluation for the compute phase, ObservationSessionController shall produce a result for which if sessionSnapshot disposition is RECOVERY APPLIED, then sessionSnapshot reason is EVIDENCE UNAVAILABLE, sessionSnapshot reason is ENERGY LOW, sessionSnapshot reason is CONTEXT INELIGIBLE, sessionSnapshot reason is CAMERA UNUSABLE, or sessionSnapshot reason is RADIO UNAVAILABLE.

##### `CASE_19_TOTAL_STATE_COMMAND_RESULT` — Conditional behavior

> During contract evaluation for the compute phase, ObservationSessionController shall produce a result for which if sessionDecision is NO CHANGE, then committedSession is the value of committedSession on entry, sessionSnapshot disposition is NO CHANGE, and sessionSnapshot reason is NONE, if sessionDecision is BEGIN ACQUISITION, then committedSession is ACQUIRING, sessionSnapshot disposition is STARTED, and sessionSnapshot reason is NONE, if sessionDecision is CANCEL TO IDLE, then committedSession is IDLE, sessionSnapshot disposition is CANCELLED, and sessionSnapshot reason is CANCELLED, if sessionDecision is SUSPEND EVIDENCE, then committedSession is SUSPENDED, sessionSnapshot disposition is RECOVERY APPLIED, and sessionSnapshot reason is EVIDENCE UNAVAILABLE, if sessionDecision is SUSPEND ENERGY, then committedSession is SUSPENDED, sessionSnapshot disposition is RECOVERY APPLIED, and sessionSnapshot reason is ENERGY LOW, if sessionDecision is SUSPEND CONTEXT, then committedSession is SUSPENDED, sessionSnapshot disposition is RECOVERY APPLIED, and sessionSnapshot reason is CONTEXT INELIGIBLE, if sessionDecision is SUSPEND CAMERA, then committedSession is SUSPENDED, sessionSnapshot disposition is RECOVERY APPLIED, and sessionSnapshot reason is CAMERA UNUSABLE, if sessionDecision is SUSPEND RADIO, then committedSession is SUSPENDED, sessionSnapshot disposition is RECOVERY APPLIED, and sessionSnapshot reason is RADIO UNAVAILABLE, if sessionDecision is QUEUE CAPTURE, then committedSession is QUEUED, sessionSnapshot disposition is PROGRESSED, and sessionSnapshot reason is NONE, if sessionDecision is BEGIN TRANSMISSION, then committedSession is SENDING, sessionSnapshot disposition is PROGRESSED, and sessionSnapshot reason is NONE, if sessionDecision is COMPLETE TO IDLE, then committedSession is IDLE, sessionSnapshot disposition is COMPLETED, and sessionSnapshot reason is NONE, if sessionDecision is RETRY QUEUE, then committedSession is QUEUED, sessionSnapshot disposition is PROGRESSED, and sessionSnapshot reason is NONE, if sessionDecision is REJECT EVIDENCE, then committedSession is the value of committedSession on entry, sessionSnapshot disposition is REJECTED, and sessionSnapshot reason is EVIDENCE UNAVAILABLE, if sessionDecision is REJECT ENERGY, then committedSession is the value of committedSession on entry, sessionSnapshot disposition is REJECTED, and sessionSnapshot reason is ENERGY LOW, if sessionDecision is REJECT CONTEXT, then committedSession is the value of committedSession on entry, sessionSnapshot disposition is REJECTED, and sessionSnapshot reason is CONTEXT INELIGIBLE, if sessionDecision is REJECT CAMERA, then committedSession is the value of committedSession on entry, sessionSnapshot disposition is REJECTED, and sessionSnapshot reason is CAMERA UNUSABLE, and if sessionDecision is REJECT RADIO, then committedSession is the value of committedSession on entry, sessionSnapshot disposition is REJECTED, and sessionSnapshot reason is RADIO UNAVAILABLE.

### Requirements for RadioEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_RADIO_EVIDENCE` — Required behavior

> During contract evaluation for the initialization phase, RadioEvidenceQualifier shall produce a result for which if radioCondition is UNAVAILABLE, then radioEvidence is UNAVAILABLE, if radioCondition is READY and deliveryResult is NONE, then radioEvidence is READY, if radioCondition is READY and deliveryResult is ACCEPTED, then radioEvidence is ACCEPTED, and if radioCondition is READY and deliveryResult is REJECTED, then radioEvidence is REJECTED.

#### Contract clauses evaluated in the compute phase

##### `CASE_10_RADIO_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if radioCondition is UNAVAILABLE, RadioEvidenceQualifier shall set radioEvidence to UNAVAILABLE.

##### `CASE_11_RADIO_READY` — Conditional behavior

> During contract evaluation for the compute phase, if radioCondition is READY and deliveryResult is NONE, RadioEvidenceQualifier shall set radioEvidence to READY.

##### `CASE_12_RADIO_RESULT` — Conditional behavior

> During contract evaluation for the compute phase, if radioCondition is READY and deliveryResult is not NONE, RadioEvidenceQualifier shall produce a result for which if deliveryResult is ACCEPTED, then radioEvidence is ACCEPTED and if deliveryResult is REJECTED, then radioEvidence is REJECTED.

### Requirements for SessionProposalOwner

#### Contract clauses evaluated in the compute phase

##### `CASE_13_PHASE_APPLICABLE_BLOCKER` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 13 PHASE APPLICABLE BLOCKER applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - sortieQualification is not ELIGIBLE
>   - All of the following conditions hold:
>     
>       - sortieQualification is ELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is IDLE
>           - sessionPhaseInput is SUSPENDED
>       - At least one of the following conditions holds:
>         
>           - cameraEvidence is UNAVAILABLE
>           - All of the following conditions hold:
>             
>               - cameraEvidence is not UNAVAILABLE
>               - radioEvidence is UNAVAILABLE
>   - All of the following conditions hold:
>     
>       - sortieQualification is ELIGIBLE
>       - sessionPhaseInput is ACQUIRING
>       - At least one of the following conditions holds:
>         
>           - cameraEvidence is UNAVAILABLE
>           - cameraEvidence is FAILED
>           - All of the following conditions hold:
>             
>               - cameraEvidence is not UNAVAILABLE
>               - cameraEvidence is not FAILED
>               - radioEvidence is UNAVAILABLE
>   - All of the following conditions hold:
>     
>       - sortieQualification is ELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is QUEUED
>           - sessionPhaseInput is SENDING
>       - radioEvidence is UNAVAILABLE.

> When all applicability conditions are met, SessionProposalOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is BLOCKED EVIDENCE
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is IDLE
>           - sessionPhaseInput is SUSPENDED
>     
>     **Then:**
>     
>     sessionProposal is BLOCK EVIDENCE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is BLOCKED EVIDENCE
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is ACQUIRING
>           - sessionPhaseInput is QUEUED
>           - sessionPhaseInput is SENDING
>     
>     **Then:**
>     
>     sessionProposal is RECOVER EVIDENCE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is BLOCKED ENERGY
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is IDLE
>           - sessionPhaseInput is SUSPENDED
>     
>     **Then:**
>     
>     sessionProposal is BLOCK ENERGY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is BLOCKED ENERGY
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is ACQUIRING
>           - sessionPhaseInput is QUEUED
>           - sessionPhaseInput is SENDING
>     
>     **Then:**
>     
>     sessionProposal is RECOVER ENERGY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is BLOCKED CONTEXT
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is IDLE
>           - sessionPhaseInput is SUSPENDED
>     
>     **Then:**
>     
>     sessionProposal is BLOCK CONTEXT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is BLOCKED CONTEXT
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is ACQUIRING
>           - sessionPhaseInput is QUEUED
>           - sessionPhaseInput is SENDING
>     
>     **Then:**
>     
>     sessionProposal is RECOVER CONTEXT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is ELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is IDLE
>           - sessionPhaseInput is SUSPENDED
>       - cameraEvidence is UNAVAILABLE
>     
>     **Then:**
>     
>     sessionProposal is BLOCK CAMERA
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is ELIGIBLE
>       - sessionPhaseInput is ACQUIRING
>       - At least one of the following conditions holds:
>         
>           - cameraEvidence is UNAVAILABLE
>           - cameraEvidence is FAILED
>     
>     **Then:**
>     
>     sessionProposal is RECOVER CAMERA
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is ELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - sessionPhaseInput is IDLE
>           - sessionPhaseInput is SUSPENDED
>       - cameraEvidence is not UNAVAILABLE
>       - radioEvidence is UNAVAILABLE
>     
>     **Then:**
>     
>     sessionProposal is BLOCK RADIO
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - sortieQualification is ELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - sessionPhaseInput is ACQUIRING
>               - cameraEvidence is not UNAVAILABLE
>               - cameraEvidence is not FAILED
>           - sessionPhaseInput is QUEUED
>           - sessionPhaseInput is SENDING
>       - radioEvidence is UNAVAILABLE
>     
>     **Then:**
>     
>     sessionProposal is RECOVER RADIO.

##### `CASE_14_AUTOMATIC_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 14 AUTOMATIC PROGRESS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sortieQualification is ELIGIBLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - sessionPhaseInput is ACQUIRING
>           - cameraEvidence is not UNAVAILABLE
>           - cameraEvidence is not FAILED
>           - radioEvidence is not UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - sessionPhaseInput is QUEUED
>           - radioEvidence is not UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - sessionPhaseInput is SENDING
>           - radioEvidence is not UNAVAILABLE.

> When all applicability conditions are met, SessionProposalOwner shall produce a result for which all of the following conditions hold:
>
> if sessionPhaseInput is ACQUIRING and cameraEvidence is CAPTURED, then sessionProposal is CAPTURE COMPLETE, if sessionPhaseInput is ACQUIRING and cameraEvidence is READY, then sessionProposal is HOLD, if sessionPhaseInput is QUEUED, then sessionProposal is BEGIN DELIVERY, if sessionPhaseInput is SENDING and radioEvidence is ACCEPTED, then sessionProposal is DELIVERY COMPLETE, if sessionPhaseInput is SENDING and radioEvidence is REJECTED, then sessionProposal is DELIVERY REJECTED, and if sessionPhaseInput is SENDING and radioEvidence is READY, then sessionProposal is HOLD.

##### `CASE_15_NONACTIVE_STARTABLE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 NONACTIVE STARTABLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sortieQualification is ELIGIBLE
>   - At least one of the following conditions holds:
>     
>       - sessionPhaseInput is IDLE
>       - sessionPhaseInput is SUSPENDED
>   - cameraEvidence is not UNAVAILABLE
>   - radioEvidence is not UNAVAILABLE.

> When all applicability conditions are met, SessionProposalOwner shall produce a result for which all of the following conditions hold:
>
> sessionProposal is STARTABLE.

### Requirements for SortieApplicabilityQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_SORTIE_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, SortieApplicabilityQualifier shall produce a result for which if batteryAssessment is UNAVAILABLE, then sortieQualification is BLOCKED EVIDENCE, if batteryAssessment is LOW, then sortieQualification is BLOCKED ENERGY, if batteryAssessment is ADEQUATE and sortieContext is OUTSIDE OBSERVATION POSITION, then sortieQualification is BLOCKED CONTEXT, and if batteryAssessment is ADEQUATE and sortieContext is AT OBSERVATION POSITION, then sortieQualification is ELIGIBLE.

#### Contract clauses evaluated in the compute phase

##### `CASE_04_EVIDENCE_BLOCK` — Conditional behavior

> During contract evaluation for the compute phase, if batteryAssessment is UNAVAILABLE, SortieApplicabilityQualifier shall set sortieQualification to BLOCKED EVIDENCE.

##### `CASE_05_ENERGY_BLOCK` — Conditional behavior

> During contract evaluation for the compute phase, if batteryAssessment is LOW, SortieApplicabilityQualifier shall set sortieQualification to BLOCKED ENERGY.

##### `CASE_06_CONTEXT_APPLICABILITY` — Conditional behavior

> During contract evaluation for the compute phase, if batteryAssessment is ADEQUATE, SortieApplicabilityQualifier shall produce a result for which if sortieContext is AT OBSERVATION POSITION, then sortieQualification is ELIGIBLE and if sortieContext is OUTSIDE OBSERVATION POSITION, then sortieQualification is BLOCKED CONTEXT.
