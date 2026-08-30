# EIT Monitoring-Start and Impedance-Acquisition Coordinator

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: A Doctor needs a bounded logical service that starts and stops one monitoring
session using current calibration evidence, requests impedance acquisition while the
session is active, and makes admitted opaque impedance tokens available for later image
generation. The need is coordination of monitoring and acquisition, not patient
diagnosis or physical electrical control.

PURPOSE-01: The EIT Monitoring-Start and Impedance-Acquisition Coordinator will qualify
a monitoring request, calibration evidence, and an impedance-token observation; maintain
one logical session and recovery phase; issue one acquisition command; gate token
delivery; and report monitoring status to the Doctor.

GOAL-01: The system shall produce exactly one coherent next session state, recovery
state, acquisition command, impedance delivery, and Doctor status for every finite input
and owner pre-state combination.

GOAL-02: The system shall permit acquisition only while a valid fresh or retained
monitoring session is supported by valid current-calibration evidence.

GOAL-03: The system shall inhibit acquisition and token delivery on any invalid input,
then require a valid neutral request followed by a later fresh request before monitoring
may resume.

GOAL-04: The system shall preserve the distinction between two opaque admitted impedance
tokens without assigning either token clinical, physical, or image-quality meaning.

### Operational context and exact system boundary

CTX-01: The Doctor is outside the system, supplies the monitoring-request sample, and
receives monitoring status. The source association grounds Doctor participation in
monitoring start but does not establish exclusive request authority or the finite
request protocol used here.

CTX-02: The EngineerTechnician is outside the system and supplies calibration evidence.
`Current` is a selected logical premise for this coordinator; it is not a
source-grounded calibration acceptance criterion.

CTX-03: The External EIT Acquisition Context is outside this selected boundary, receives
the logical acquisition command, and supplies an opaque impedance-token observation. It
is this abstract's explicit treatment of the source's ambiguous `EITSystem` actor; it is
not assumed identical to the selected coordinator or to the source's
`EITSystemBoundary`.

CTX-04: The EIT Image-Generation Consumer is outside this selected boundary and receives
gated impedance delivery. The source grounds image-generation vocabulary but does not
define this interface or assert that delivered tokens are sufficient for an image.

CTX-05: The Patient remains an external declared context actor with no modeled input,
output, control, or scenario step because the source provides no Patient association.
The electrode belt, clinical reviewer, and image-analysis activity are also outside the
selected boundary.

MON-01: `MonitoringRequestSample` is a finite root input from CTX-01 with `request :
MonitoringRequest` and `status : InputStatus`, where `MonitoringRequest` is exactly
`{NoRequest, StartMonitoring, StopMonitoring}` and `InputStatus` is exactly `{Valid,
Invalid}`.

MON-02: `CalibrationSample` is a finite root input from CTX-02 with `calibration :
CalibrationState` and `status : InputStatus`, where `CalibrationState` is exactly
`{NotCurrent, Current}`. `Current` means only that the external technician context
presents calibration as usable for this logical evaluation.

MON-03: `ImpedanceSample` is a finite root input from CTX-03 with `token :
ImpedanceToken` and `status : InputStatus`, where `ImpedanceToken` is exactly `{NoToken,
TokenOne, TokenTwo}`. `TokenOne` and `TokenTwo` are distinct uninterpreted finite
witnesses and carry no numeric, physical, patient, or quality semantics.

CTRL-01: `AcquisitionCommand` is a finite root output to CTX-03 with exactly
`{HoldAcquisition, CollectImpedance}`. It is a logical request and does not prove
stimulation, sensing, collection, storage, or hardware response.

CTRL-02: `ImpedanceDelivery` is a finite root output to CTX-04 with exactly `{Withheld,
NoTokenAvailable, DeliverTokenOne, DeliverTokenTwo}`. A delivered token is an admitted
opaque witness, not validated impedance or image input quality.

CTRL-03: `MonitoringStatus` is a finite root output to CTX-01 with exactly `{Stopped,
Monitoring, CalibrationRequired, InputFault, RecoveryPending}`.

### Required behavior, risk, fault response, and recovery

RISK-01: If an invalid request, calibration sample, or impedance sample were trusted, or
if a pre-fault start request were replayed after validity returned, the coordinator
could command an acquisition session without admitted evidence. The bounded consequence
is an incoherent logical acquisition decision; no physical harm, likelihood, severity,
or safety classification is asserted.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for providing exactly one finite request value and
explicit status per logical evaluation and for presenting `NoRequest` before a
post-fault request can be considered fresh. The three-value protocol and freshness rule
are pilot assumptions, not source-defined Doctor authority or workflow.

ASM-02: CTX-02 is responsible for the calibration value and status. `Current` is treated
as sufficient logical calibration evidence for monitoring authorization only within this
abstract; no method, tolerance, duration, or physical correctness is implied.

ASM-03: CTX-03 is responsible for accepting CTRL-01 only as a logical request and for
supplying one token/status pair per evaluation. A valid token does not prove that a
commanded physical acquisition occurred, and an invalid token status triggers the
conservative pilot fault policy.

ASM-04: CTX-04 is responsible only for receiving CTRL-02. It shall not infer image
availability, reconstructability, quality, or clinical meaning from `NoTokenAvailable`,
`DeliverTokenOne`, or `DeliverTokenTwo`.

ASM-05: All supplying contexts are responsible for holding their finite sample values
stable for one logical evaluation. This assumption supports deterministic snapshot
semantics and makes no real-time duration or synchronization claim.

## Supporting contract definitions

### State `EIT_Acquisition_Coordinator::MonitoringDecisionOwner::sessionMode`

State `sessionMode` has type `EIT_Acquisition_Coordinator::SessionMode`.

### State `EIT_Acquisition_Coordinator::MonitoringDecisionOwner::recoveryPhase`

State `recoveryPhase` has type `EIT_Acquisition_Coordinator::RecoveryPhase`.

## Detailed behavioral requirements

### Requirements for AcquisitionEvidenceQualification

#### Contract clauses evaluated in the compute phase

##### `QUAL_EVID_Invalid` — Conditional behavior

> During contract evaluation for the compute phase, if calibrationSample status is Invalid or impedanceSample status is Invalid, AcquisitionEvidenceQualification shall set acquisitionEvidence to InvalidAcquisitionEvidence.

##### `QUAL_EVID_NotCurrent` — Conditional behavior

> During contract evaluation for the compute phase, if calibrationSample status is Valid, impedanceSample status is Valid, and calibrationSample calibration is NotCurrent, AcquisitionEvidenceQualification shall set acquisitionEvidence to CalibrationAbsent.

##### `QUAL_EVID_NoToken` — Conditional behavior

> During contract evaluation for the compute phase, if calibrationSample status is Valid, impedanceSample status is Valid, calibrationSample calibration is Current, and impedanceSample token is NoToken, AcquisitionEvidenceQualification shall set acquisitionEvidence to ReadyNoToken.

##### `QUAL_EVID_TokenOne` — Conditional behavior

> During contract evaluation for the compute phase, if calibrationSample status is Valid, impedanceSample status is Valid, calibrationSample calibration is Current, and impedanceSample token is TokenOne, AcquisitionEvidenceQualification shall set acquisitionEvidence to ReadyTokenOne.

##### `QUAL_EVID_TokenTwo` — Conditional behavior

> During contract evaluation for the compute phase, if calibrationSample status is Valid, impedanceSample status is Valid, calibrationSample calibration is Current, and impedanceSample token is TokenTwo, AcquisitionEvidenceQualification shall set acquisitionEvidence to ReadyTokenTwo.

### Requirements for DoctorStatusDerivation

#### Contract clauses evaluated in the initialization phase

##### `initStatus` — Required behavior

> During contract evaluation for the initialization phase, DoctorStatusDerivation shall set monitoringStatus to Stopped.

#### Contract clauses evaluated in the compute phase

##### `STATUS_Fault` — Conditional behavior

> During contract evaluation for the compute phase, if monitoringResolution disposition is InputFaultDisposition, DoctorStatusDerivation shall set monitoringStatus to InputFault.

##### `STATUS_Recovery` — Conditional behavior

> During contract evaluation for the compute phase, if monitoringResolution disposition is not InputFaultDisposition and monitoringResolution disposition is RecoveryDisposition, DoctorStatusDerivation shall set monitoringStatus to RecoveryPending.

##### `STATUS_Calibration` — Conditional behavior

> During contract evaluation for the compute phase, case STATUS Calibration applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - monitoringResolution disposition is not InputFaultDisposition
>   - monitoringResolution disposition is not RecoveryDisposition
>   - At least one of the following conditions holds:
>     
>       - monitoringResolution disposition is StartDenied
>       - All of the following conditions hold:
>         
>           - monitoringResolution disposition is StoppedDisposition
>           - acquisitionEvidence is CalibrationAbsent.

> When all applicability conditions are met, DoctorStatusDerivation shall produce a result for which all of the following conditions hold:
>
> monitoringStatus is CalibrationRequired.

##### `STATUS_Monitoring` — Conditional behavior

> During contract evaluation for the compute phase, case STATUS Monitoring applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - monitoringResolution disposition is not InputFaultDisposition
>   - monitoringResolution disposition is not RecoveryDisposition
>   - monitoringResolution disposition is not StartDenied
>   - At least one of the following conditions holds:
>     
>       - monitoringResolution disposition is not StoppedDisposition
>       - acquisitionEvidence is not CalibrationAbsent
>   - monitoringResolution acquisitionCommand is CollectImpedance.

> When all applicability conditions are met, DoctorStatusDerivation shall produce a result for which all of the following conditions hold:
>
> monitoringStatus is Monitoring.

##### `STATUS_Stopped` — Conditional behavior

> During contract evaluation for the compute phase, case STATUS Stopped applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - monitoringResolution disposition is not InputFaultDisposition
>   - monitoringResolution disposition is not RecoveryDisposition
>   - monitoringResolution disposition is not StartDenied
>   - At least one of the following conditions holds:
>     
>       - monitoringResolution disposition is not StoppedDisposition
>       - acquisitionEvidence is not CalibrationAbsent
>   - monitoringResolution acquisitionCommand is HoldAcquisition.

> When all applicability conditions are met, DoctorStatusDerivation shall produce a result for which all of the following conditions hold:
>
> monitoringStatus is Stopped.

### Requirements for ImpedanceDeliveryDerivation

#### Contract clauses evaluated in the initialization phase

##### `initDelivery` — Required behavior

> During contract evaluation for the initialization phase, ImpedanceDeliveryDerivation shall set impedanceDelivery to Withheld.

#### Contract clauses evaluated in the compute phase

##### `DELIVERY_Hold` — Conditional behavior

> During contract evaluation for the compute phase, if monitoringResolution acquisitionCommand is HoldAcquisition, ImpedanceDeliveryDerivation shall set impedanceDelivery to Withheld.

##### `DELIVERY_Anomalous` — Conditional behavior

> During contract evaluation for the compute phase, case DELIVERY Anomalous applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - monitoringResolution acquisitionCommand is CollectImpedance
>   - At least one of the following conditions holds:
>     
>       - acquisitionEvidence is InvalidAcquisitionEvidence
>       - acquisitionEvidence is CalibrationAbsent.

> When all applicability conditions are met, ImpedanceDeliveryDerivation shall produce a result for which all of the following conditions hold:
>
> impedanceDelivery is Withheld.

##### `DELIVERY_None` — Conditional behavior

> During contract evaluation for the compute phase, if monitoringResolution acquisitionCommand is CollectImpedance and acquisitionEvidence is ReadyNoToken, ImpedanceDeliveryDerivation shall set impedanceDelivery to NoTokenAvailable.

##### `DELIVERY_One` — Conditional behavior

> During contract evaluation for the compute phase, if monitoringResolution acquisitionCommand is CollectImpedance and acquisitionEvidence is ReadyTokenOne, ImpedanceDeliveryDerivation shall set impedanceDelivery to DeliverTokenOne.

##### `DELIVERY_Two` — Conditional behavior

> During contract evaluation for the compute phase, if monitoringResolution acquisitionCommand is CollectImpedance and acquisitionEvidence is ReadyTokenTwo, ImpedanceDeliveryDerivation shall set impedanceDelivery to DeliverTokenTwo.

### Requirements for MonitoringDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `initSessionMode` — Required behavior

> During contract evaluation for the initialization phase, MonitoringDecisionOwner shall set sessionMode to SessionStopped.

##### `initRecoveryPhase` — Required behavior

> During contract evaluation for the initialization phase, MonitoringDecisionOwner shall set recoveryPhase to Normal.

##### `initCommand` — Required behavior

> During contract evaluation for the initialization phase, MonitoringDecisionOwner shall set acquisitionCommand to HoldAcquisition.

##### `initResolution` — Required behavior

> During contract evaluation for the initialization phase, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to Normal, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to StoppedDisposition.

#### Contract clauses evaluated in the compute phase

##### `commitSessionMode` — Required behavior

> During contract evaluation for the compute phase, MonitoringDecisionOwner shall set sessionMode to monitoringResolution nextSessionMode.

##### `commitRecoveryPhase` — Required behavior

> During contract evaluation for the compute phase, MonitoringDecisionOwner shall set recoveryPhase to monitoringResolution nextRecoveryPhase.

##### `publishCommittedCommand` — Required behavior

> During contract evaluation for the compute phase, MonitoringDecisionOwner shall set acquisitionCommand to monitoringResolution acquisitionCommand.

##### `safeRecoveryInvariant` — Required behavior

> During contract evaluation for the compute phase, MonitoringDecisionOwner shall produce a result for which if recoveryPhase is not Normal, then sessionMode is SessionStopped.

##### `CASE_01` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is InvalidRequest or acquisitionEvidence is InvalidAcquisitionEvidence, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to AwaitNeutral, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to InputFaultDisposition.

##### `CASE_02` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is AwaitNeutral, and qualifiedRequest is not NoQualifiedRequest, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to AwaitNeutral, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to RecoveryDisposition.

##### `CASE_03` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is AwaitNeutral, and qualifiedRequest is NoQualifiedRequest, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to AwaitFreshRequest, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to RecoveryDisposition.

##### `CASE_04` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is AwaitFreshRequest, and qualifiedRequest is NoQualifiedRequest, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to AwaitFreshRequest, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to RecoveryDisposition.

##### `CASE_05` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is AwaitFreshRequest, and qualifiedRequest is QualifiedStop, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to Normal, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to StopAccepted.

##### `CASE_06` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is AwaitFreshRequest, qualifiedRequest is QualifiedStart, and acquisitionEvidence is not CalibrationAbsent, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionMonitoring, monitoringResolution nextRecoveryPhase to Normal, monitoringResolution acquisitionCommand to CollectImpedance, and monitoringResolution disposition to StartAccepted.

##### `CASE_07` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is AwaitFreshRequest, qualifiedRequest is QualifiedStart, and acquisitionEvidence is CalibrationAbsent, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to Normal, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to StartDenied.

##### `CASE_08` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is Normal, and qualifiedRequest is QualifiedStop, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to Normal, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to StopAccepted.

##### `CASE_09` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is Normal, qualifiedRequest is QualifiedStart, and acquisitionEvidence is not CalibrationAbsent, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionMonitoring, monitoringResolution nextRecoveryPhase to Normal, monitoringResolution acquisitionCommand to CollectImpedance, and monitoringResolution disposition to StartAccepted.

##### `CASE_10` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is Normal, qualifiedRequest is QualifiedStart, and acquisitionEvidence is CalibrationAbsent, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionStopped, monitoringResolution nextRecoveryPhase to Normal, monitoringResolution acquisitionCommand to HoldAcquisition, and monitoringResolution disposition to StartDenied.

##### `CASE_11` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InvalidRequest, acquisitionEvidence is not InvalidAcquisitionEvidence, the value of recoveryPhase on entry is Normal, qualifiedRequest is NoQualifiedRequest, the value of sessionMode on entry is SessionMonitoring, and acquisitionEvidence is not CalibrationAbsent, MonitoringDecisionOwner shall set monitoringResolution nextSessionMode to SessionMonitoring, monitoringResolution nextRecoveryPhase to Normal, monitoringResolution acquisitionCommand to CollectImpedance, and monitoringResolution disposition to MonitoringContinued.

##### `CASE_12` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedRequest is not InvalidRequest
>   - acquisitionEvidence is not InvalidAcquisitionEvidence
>   - the value of recoveryPhase on entry is Normal
>   - qualifiedRequest is NoQualifiedRequest
>   - At least one of the following conditions holds:
>     
>       - the value of sessionMode on entry is SessionStopped
>       - acquisitionEvidence is CalibrationAbsent.

> When all applicability conditions are met, MonitoringDecisionOwner shall produce a result for which all of the following conditions hold:
>
> monitoringResolution nextSessionMode is SessionStopped, monitoringResolution nextRecoveryPhase is Normal, monitoringResolution acquisitionCommand is HoldAcquisition, and monitoringResolution disposition is StoppedDisposition.

### Requirements for RequestQualification

#### Contract clauses evaluated in the compute phase

##### `QUAL_REQ_Invalid` — Conditional behavior

> During contract evaluation for the compute phase, if requestSample status is Invalid, RequestQualification shall set qualifiedRequest to InvalidRequest.

##### `QUAL_REQ_None` — Conditional behavior

> During contract evaluation for the compute phase, if requestSample status is Valid and requestSample request is NoRequest, RequestQualification shall set qualifiedRequest to NoQualifiedRequest.

##### `QUAL_REQ_Start` — Conditional behavior

> During contract evaluation for the compute phase, if requestSample status is Valid and requestSample request is StartMonitoring, RequestQualification shall set qualifiedRequest to QualifiedStart.

##### `QUAL_REQ_Stop` — Conditional behavior

> During contract evaluation for the compute phase, if requestSample status is Valid and requestSample request is StopMonitoring, RequestQualification shall set qualifiedRequest to QualifiedStop.
