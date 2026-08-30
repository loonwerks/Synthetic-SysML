# EIT Acquisition Session Coordinator

## Selected system context

### Need, purpose, and operational context

NEED-01: A bounded logical system is needed to qualify electrode-belt preparation before
starting monitoring, coordinate impedance-data collection, suppress unusable collection
outcomes, and expose deterministic recovery and request dispositions to the
participating people.

PURPOSE-01: The EIT Acquisition Session Coordinator shall coordinate
preparation-qualified monitoring and impedance acquisition; it shall not perform EIT
image generation, image analysis, diagnosis, treatment, or physical belt application.

### Scope and system boundary

CTX-01: The Doctor is an external requester and status recipient, consistent with the
seed association to starting monitoring; this abstract does not infer exclusive command
authority or clinical responsibility.

CTX-02: The EngineerTechnician is an external preparation requester and status
recipient, consistent with the seed associations to belt application and calibration;
physical work and acceptance criteria remain outside the boundary.

CTX-03: The Patient is retained as declared external context only. The seed supplies no
patient interaction, consent, sensing, or control association, so this abstract assigns
none.

CTX-04: The Belt Observation Source reports one finite current belt observation. It may
be associated with physical equipment or human workflow, but this abstract does not
select an implementation.

CTX-05: The Calibration Observation Source reports one finite current calibration
observation; it does not establish how calibration is performed or whether it is
physically adequate.

CTX-06: The Acquisition Interface reports acquisition availability, receives the logical
acquisition command, and supplies at most one symbolic impedance-frame observation per
evaluation. It is external because this scope coordinates rather than implements
collection hardware.

CTX-07: The Impedance Data Consumer receives only admitted symbolic frame deliveries. It
may support later image generation, but image generation is outside this system.

CTX-08: The source-named `EITSystem` actor is treated as unresolved source vocabulary,
not silently equated to this coordinator or to `CTX-06`; this model chooses a narrower
system boundary and preserves the ambiguity as deferred.

### Exact finite boundary inputs

MON-01: `doctorRequest : DoctorRequest` is supplied by `CTX-01` and has exactly
`{NO_DOCTOR_REQUEST, START_MONITORING, STOP_MONITORING}`.

MON-02: `technicianRequest : TechnicianRequest` is supplied by `CTX-02` and has exactly
`{NO_TECHNICIAN_REQUEST, CONFIRM_BELT, RECORD_CALIBRATION, RESET_PREPARATION}`.

MON-03: `beltObservation : BeltObservation` is supplied by `CTX-04` and has exactly
`{BELT_OBSERVATION_INVALID, BELT_NOT_APPLIED, BELT_APPLIED}`; the labels are logical
reports, not physical contact-quality claims.

MON-04: `calibrationObservation : CalibrationObservation` is supplied by `CTX-05` and
has exactly `{CALIBRATION_OBSERVATION_INVALID, CALIBRATION_NOT_AVAILABLE,
CALIBRATION_FAILED, CALIBRATION_PASSED}`; `PASSED` is a pilot token and not a safety,
accuracy, or efficacy conclusion.

MON-05: `acquisitionObservation : AcquisitionObservation` is supplied by `CTX-06` and
has exactly `{ACQUISITION_AVAILABLE, ACQUISITION_FAULT}`; no fault cause, severity, or
probability is assumed.

MON-06: `impedanceFrame : ImpedanceFrameObservation` is supplied by `CTX-06` and has
exactly `{NO_FRAME, INVALID_FRAME, FRAME_A, FRAME_B}`. `FRAME_A` and `FRAME_B` are
distinct opaque bounded-analysis tokens with no unit, waveform, clinical meaning, or
representation claim.

### Exact finite controlled outputs

CTRL-01: `acquisitionCommand : AcquisitionCommand` is delivered to `CTX-06` and has
exactly `{DO_NOT_COLLECT, COLLECT}`. It is a logical request and does not demonstrate
physical cessation, excitation control, or safe actuation.

CTRL-02: `frameDelivery : FrameDelivery` is delivered to `CTX-07` and has exactly
`{NO_DELIVERY, DELIVER_FRAME_A, DELIVER_FRAME_B}`; no value is delivered for `NO_FRAME`
or `INVALID_FRAME`.

CTRL-03: `sessionStatus : SessionStatus` is delivered to `CTX-01` and `CTX-02` as one
shared logical status product containing `PreparationState`, `MonitoringState`,
`RequestDisposition`, and `SessionNotice`. Shared delivery does not imply identical
presentation or human responsibility.

### State, mode, transition, priority, and recovery policy

MODE-01: `MONITORING_INACTIVE` is externally distinguishable by `DO_NOT_COLLECT` and
`NO_DELIVERY`; it admits a fresh start only when eligibility is `ACQUISITION_READY`.

MODE-02: `MONITORING_ACTIVE` is externally distinguishable by `COLLECT`; only valid
opaque frame tokens may be delivered, and a recovery proposal or accepted stop leaves
active monitoring.

MODE-03: `MONITORING_HELD` is externally distinguishable by `DO_NOT_COLLECT`,
`NO_DELIVERY`, and `MONITORING_HELD_NOTICE`; restored observations alone do not
reactivate monitoring.

### Risks, mitigations, assumptions, and constraints

RISK-01: If monitoring starts before selected preparation qualifications are
established, the system could request impedance collection under an unqualified pilot
state, making later data use unsupported.

RISK-02: If a belt, calibration, or acquisition fault occurs during active monitoring
and collection or frame publication continues, a downstream consumer could receive data
outside this abstract's admitted state.

ASM-01: `CTX-01` is responsible for supplying exactly one `DoctorRequest` value per
logical evaluation; `NO_DOCTOR_REQUEST` explicitly represents no fresh Doctor action.
Rationale: the finite arbitration partition requires a single current value but makes no
human-interface claim.

ASM-02: `CTX-02` is responsible for supplying exactly one `TechnicianRequest` value per
evaluation; `NO_TECHNICIAN_REQUEST` explicitly represents no fresh technician action.
Rationale: concurrent technician actions are outside this bounded abstraction.

ASM-03: `CTX-04`, `CTX-05`, and `CTX-06` are responsible only for values within their
finite declared types. The coordinator does not assume accuracy, freshness,
independence, timing, or physical causality beyond the current logical evaluation.

ASM-04: `CTX-06` supplies at most one symbolic frame value per evaluation, and
`NO_FRAME` represents its absence. Rationale: this makes delivery total without
asserting a sampling rate, buffer, stream, or loss model.

ASM-05: The external recipients shall not interpret `COLLECT`, `CALIBRATION_PASSED`,
delivered opaque frames, or status notices as medical, electrical-safety, diagnostic, or
certification evidence. This claim boundary is necessary because the source provides
only use-case names and associations.

## Supporting contract definitions

### State `EIT_Acquisition_Session_Coordinator::MonitoringStateGovernor::committedMonitoringState`

State `committedMonitoringState` has type `EIT_Acquisition_Session_Coordinator::MonitoringState`.

### State `EIT_Acquisition_Session_Coordinator::PreparationStateGovernor::committedPreparationState`

State `committedPreparationState` has type `EIT_Acquisition_Session_Coordinator::PreparationState`.

## Detailed behavioral requirements

### Requirements for AcquisitionCommandPolicy

#### Contract clauses evaluated in the initialization phase

##### `INIT_ACQUISITION_COMMAND` — Required behavior

> During contract evaluation for the initialization phase, AcquisitionCommandPolicy shall set acquisitionCommand to DO NOT COLLECT.

#### Contract clauses evaluated in the compute phase

##### `CASE_19_ACTIVE_COLLECTION_CLASSIFICATION` — Conditional behavior

> During contract evaluation for the compute phase, AcquisitionCommandPolicy shall produce a result for which if monitoringDecision nextState is MONITORING ACTIVE, then acquisitionCommand is COLLECT and if monitoringDecision nextState is not MONITORING ACTIVE, then acquisitionCommand is DO NOT COLLECT.

### Requirements for AcquisitionEligibilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_ELIGIBILITY_ENVELOPE` — Required behavior

> During contract evaluation for the initialization phase, AcquisitionEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - beltAssessment beltCategory is BELT UNAVAILABLE
>       - beltAssessment qualified is true exactly when F is true
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - eligibilityEnvelope condition is BELT UNAVAILABLE CONDITION
>       - eligibilityEnvelope beltQualified is true exactly when F is true
>       - eligibilityEnvelope calibrationQualified is true exactly when F is true
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - beltAssessment beltCategory is BELT ABSENT
>       - beltAssessment qualified is true exactly when F is true
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - eligibilityEnvelope condition is BELT ABSENT CONDITION
>       - eligibilityEnvelope beltQualified is true exactly when F is true
>       - eligibilityEnvelope calibrationQualified is true exactly when F is true
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - beltAssessment qualified is true exactly when T is true
>       - At least one of the following conditions holds:
>         
>           - preparationState is not PREPARATION CALIBRATED
>           - calibrationQualification is not CALIBRATED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - eligibilityEnvelope condition is CALIBRATION NOT READY CONDITION
>       - eligibilityEnvelope beltQualified is true exactly when T is true
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - beltAssessment qualified is true exactly when T is true
>       - calibrationQualification is CALIBRATED
>       - preparationState is PREPARATION CALIBRATED
>       - acquisitionObservation is ACQUISITION FAULT
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - eligibilityEnvelope condition is ACQUISITION FAULT CONDITION
>       - eligibilityEnvelope beltQualified is true exactly when T is true
>       - eligibilityEnvelope calibrationQualified is true exactly when T is true
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - beltAssessment qualified is true exactly when T is true
>       - calibrationQualification is CALIBRATED
>       - preparationState is PREPARATION CALIBRATED
>       - acquisitionObservation is ACQUISITION AVAILABLE
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - eligibilityEnvelope condition is ACQUISITION READY
>       - eligibilityEnvelope recovery is NO RECOVERY
>       - eligibilityEnvelope beltQualified is true exactly when T is true
>       - eligibilityEnvelope calibrationQualified is true exactly when T is true.

#### Contract clauses evaluated in the compute phase

##### `PROJECT_ELIGIBILITY_STATES` — Required behavior

> During contract evaluation for the compute phase, AcquisitionEligibilityOwner shall produce a result for which if preparationState is UNPREPARED, then eligibilityEnvelope preparationState is UNPREPARED, if preparationState is BELT CONFIRMED, then eligibilityEnvelope preparationState is BELT CONFIRMED, if preparationState is PREPARATION CALIBRATED, then eligibilityEnvelope preparationState is PREPARATION CALIBRATED, if monitoringState is MONITORING INACTIVE, then eligibilityEnvelope monitoringState is MONITORING INACTIVE, if monitoringState is MONITORING ACTIVE, then eligibilityEnvelope monitoringState is MONITORING ACTIVE, and if monitoringState is MONITORING HELD, then eligibilityEnvelope monitoringState is MONITORING HELD.

##### `PROJECT_CALIBRATION_BOOLEAN` — Required behavior

> During contract evaluation for the compute phase, AcquisitionEligibilityOwner shall produce a result for which if calibrationQualification is CALIBRATED, then eligibilityEnvelope calibrationQualified is true exactly when T is true and if calibrationQualification is not CALIBRATED, then eligibilityEnvelope calibrationQualified is true exactly when F is true.

##### `CASE_08_BELT_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if beltAssessment beltCategory is BELT UNAVAILABLE and beltAssessment qualified is true exactly when F is true, AcquisitionEligibilityOwner shall produce a result for which eligibilityEnvelope condition is BELT UNAVAILABLE CONDITION, eligibilityEnvelope beltQualified is true exactly when F is true, eligibilityEnvelope calibrationQualified is true exactly when F is true, if preparationState is not UNPREPARED, then eligibilityEnvelope recovery is RESET PREPARATION RECOVERY, if preparationState is UNPREPARED and monitoringState is MONITORING ACTIVE, then eligibilityEnvelope recovery is HOLD MONITORING RECOVERY, and if preparationState is UNPREPARED and monitoringState is not MONITORING ACTIVE, then eligibilityEnvelope recovery is NO RECOVERY.

##### `CASE_09_BELT_ABSENT` — Conditional behavior

> During contract evaluation for the compute phase, if beltAssessment beltCategory is BELT ABSENT and beltAssessment qualified is true exactly when F is true, AcquisitionEligibilityOwner shall produce a result for which eligibilityEnvelope condition is BELT ABSENT CONDITION, eligibilityEnvelope beltQualified is true exactly when F is true, eligibilityEnvelope calibrationQualified is true exactly when F is true, if preparationState is not UNPREPARED, then eligibilityEnvelope recovery is RESET PREPARATION RECOVERY, if preparationState is UNPREPARED and monitoringState is MONITORING ACTIVE, then eligibilityEnvelope recovery is HOLD MONITORING RECOVERY, and if preparationState is UNPREPARED and monitoringState is not MONITORING ACTIVE, then eligibilityEnvelope recovery is NO RECOVERY.

##### `CASE_10_CALIBRATION_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 CALIBRATION NOT READY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - beltAssessment qualified is true exactly when T is true
>   - At least one of the following conditions holds:
>     
>       - preparationState is not PREPARATION CALIBRATED
>       - calibrationQualification is not CALIBRATED.

> When all applicability conditions are met, AcquisitionEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - eligibilityEnvelope condition is CALIBRATION NOT READY CONDITION
>   - eligibilityEnvelope beltQualified is true exactly when T is true
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - preparationState is PREPARATION CALIBRATED
>       - calibrationQualification is not CALIBRATED
>     
>     **Then:**
>     
>     eligibilityEnvelope recovery is RESET PREPARATION RECOVERY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - preparationState is not PREPARATION CALIBRATED
>           - calibrationQualification is CALIBRATED
>       - monitoringState is MONITORING ACTIVE
>     
>     **Then:**
>     
>     eligibilityEnvelope recovery is HOLD MONITORING RECOVERY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - preparationState is not PREPARATION CALIBRATED
>           - calibrationQualification is CALIBRATED
>       - monitoringState is not MONITORING ACTIVE
>     
>     **Then:**
>     
>     eligibilityEnvelope recovery is NO RECOVERY.

##### `CASE_11_ACQUISITION_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if beltAssessment qualified is true exactly when T is true, calibrationQualification is CALIBRATED, preparationState is PREPARATION CALIBRATED, and acquisitionObservation is ACQUISITION FAULT, AcquisitionEligibilityOwner shall produce a result for which eligibilityEnvelope condition is ACQUISITION FAULT CONDITION, eligibilityEnvelope beltQualified is true exactly when T is true, eligibilityEnvelope calibrationQualified is true exactly when T is true, if monitoringState is MONITORING ACTIVE, then eligibilityEnvelope recovery is HOLD MONITORING RECOVERY, and if monitoringState is not MONITORING ACTIVE, then eligibilityEnvelope recovery is NO RECOVERY.

##### `CASE_12_ACQUISITION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if beltAssessment qualified is true exactly when T is true, calibrationQualification is CALIBRATED, preparationState is PREPARATION CALIBRATED, and acquisitionObservation is ACQUISITION AVAILABLE, AcquisitionEligibilityOwner shall set eligibilityEnvelope condition to ACQUISITION READY, eligibilityEnvelope recovery to NO RECOVERY, eligibilityEnvelope beltQualified to true exactly when T is true, and eligibilityEnvelope calibrationQualified to true exactly when T is true.

### Requirements for BeltQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_BELT_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, BeltQualificationOwner shall produce a result for which if beltObservation is BELT OBSERVATION INVALID, then beltAssessment beltCategory is BELT UNAVAILABLE and beltAssessment qualified is true exactly when F is true, if beltObservation is BELT NOT APPLIED, then beltAssessment beltCategory is BELT ABSENT and beltAssessment qualified is true exactly when F is true, and if beltObservation is BELT APPLIED, then beltAssessment beltCategory is BELT PRESENT and beltAssessment qualified is true exactly when T is true.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_INVALID_BELT` — Conditional behavior

> During contract evaluation for the compute phase, if beltObservation is BELT OBSERVATION INVALID, BeltQualificationOwner shall set beltAssessment beltCategory to BELT UNAVAILABLE and beltAssessment qualified to true exactly when F is true.

##### `CASE_02_BELT_ABSENT` — Conditional behavior

> During contract evaluation for the compute phase, if beltObservation is BELT NOT APPLIED, BeltQualificationOwner shall set beltAssessment beltCategory to BELT ABSENT and beltAssessment qualified to true exactly when F is true.

##### `CASE_03_BELT_PRESENT` — Conditional behavior

> During contract evaluation for the compute phase, if beltObservation is BELT APPLIED, BeltQualificationOwner shall set beltAssessment beltCategory to BELT PRESENT and beltAssessment qualified to true exactly when T is true.

### Requirements for CalibrationQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_CALIBRATION_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, CalibrationQualificationOwner shall produce a result for which if beltAssessment qualified is true exactly when F is true, then calibrationQualification is CALIBRATION BLOCKED, if beltAssessment qualified is true exactly when T is true and calibrationObservation is not CALIBRATION PASSED, then calibrationQualification is NOT CALIBRATED, and if beltAssessment qualified is true exactly when T is true and calibrationObservation is CALIBRATION PASSED, then calibrationQualification is CALIBRATED.

#### Contract clauses evaluated in the compute phase

##### `CASE_04_BELT_BLOCKS_CALIBRATION` — Conditional behavior

> During contract evaluation for the compute phase, if beltAssessment qualified is true exactly when F is true, CalibrationQualificationOwner shall set calibrationQualification to CALIBRATION BLOCKED.

##### `CASE_05_CALIBRATION_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, if beltAssessment qualified is true exactly when T is true and calibrationObservation is not CALIBRATION PASSED, CalibrationQualificationOwner shall set calibrationQualification to NOT CALIBRATED.

##### `CASE_06_CALIBRATION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if beltAssessment qualified is true exactly when T is true and calibrationObservation is CALIBRATION PASSED, CalibrationQualificationOwner shall set calibrationQualification to CALIBRATED.

### Requirements for MonitoringStateGovernor

#### Contract clauses evaluated in the initialization phase

##### `INIT_MONITORING_STATE` — Required behavior

> During contract evaluation for the initialization phase, MonitoringStateGovernor shall set committedMonitoringState to MONITORING INACTIVE, monitoringState to MONITORING INACTIVE, monitoringDecision preState to MONITORING INACTIVE, monitoringDecision nextState to MONITORING INACTIVE, monitoringDecision effectiveIntent to NO INTENT, monitoringDecision disposition to NO REQUEST DISPOSITION, monitoringDecision notice to NONE, and monitoringDecision preparationState to UNPREPARED.

#### Contract clauses evaluated in the compute phase

##### `PUBLISH_MONITORING_PRE_STATE` — Required behavior

> During contract evaluation for the compute phase, MonitoringStateGovernor shall set monitoringState to the value of committedMonitoringState on entry.

##### `PROJECT_MONITORING_STATES` — Required behavior

> During contract evaluation for the compute phase, MonitoringStateGovernor shall produce a result for which if the value of committedMonitoringState on entry is MONITORING INACTIVE, then monitoringDecision preState is MONITORING INACTIVE, if the value of committedMonitoringState on entry is MONITORING ACTIVE, then monitoringDecision preState is MONITORING ACTIVE, if the value of committedMonitoringState on entry is MONITORING HELD, then monitoringDecision preState is MONITORING HELD, if committedMonitoringState is MONITORING INACTIVE, then monitoringDecision nextState is MONITORING INACTIVE, if committedMonitoringState is MONITORING ACTIVE, then monitoringDecision nextState is MONITORING ACTIVE, if committedMonitoringState is MONITORING HELD, then monitoringDecision nextState is MONITORING HELD, if preparationDecision nextState is UNPREPARED, then monitoringDecision preparationState is UNPREPARED, if preparationDecision nextState is BELT CONFIRMED, then monitoringDecision preparationState is BELT CONFIRMED, and if preparationDecision nextState is PREPARATION CALIBRATED, then monitoringDecision preparationState is PREPARATION CALIBRATED.

##### `PROJECT_MONITORING_DECISION` — Required behavior

> During contract evaluation for the compute phase, MonitoringStateGovernor shall produce a result for which if arbitrationDecision effectiveIntent is NO INTENT, then monitoringDecision effectiveIntent is NO INTENT, if arbitrationDecision effectiveIntent is STOP INTENT, then monitoringDecision effectiveIntent is STOP INTENT, if arbitrationDecision effectiveIntent is RESET PREPARATION INTENT, then monitoringDecision effectiveIntent is RESET PREPARATION INTENT, if arbitrationDecision effectiveIntent is HOLD MONITORING INTENT, then monitoringDecision effectiveIntent is HOLD MONITORING INTENT, if arbitrationDecision effectiveIntent is CONFIRM BELT INTENT, then monitoringDecision effectiveIntent is CONFIRM BELT INTENT, if arbitrationDecision effectiveIntent is RECORD CALIBRATION INTENT, then monitoringDecision effectiveIntent is RECORD CALIBRATION INTENT, if arbitrationDecision effectiveIntent is START MONITORING INTENT, then monitoringDecision effectiveIntent is START MONITORING INTENT, if arbitrationDecision disposition is NO REQUEST DISPOSITION, then monitoringDecision disposition is NO REQUEST DISPOSITION, if arbitrationDecision disposition is ACCEPTED, then monitoringDecision disposition is ACCEPTED, if arbitrationDecision disposition is REJECTED, then monitoringDecision disposition is REJECTED, if arbitrationDecision disposition is RECOVERY APPLIED, then monitoringDecision disposition is RECOVERY APPLIED, and if arbitrationDecision disposition is PREEMPTED, then monitoringDecision disposition is PREEMPTED.

##### `CASE_18_MONITORING_TRANSITION_AND_NOTICE` — Conditional behavior

> During contract evaluation for the compute phase, MonitoringStateGovernor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     arbitrationDecision effectiveIntent is STOP INTENT
>     
>     **Then:**
>     
>     committedMonitoringState is MONITORING INACTIVE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is not STOP INTENT
>       - the value of committedMonitoringState on entry is MONITORING ACTIVE
>       - At least one of the following conditions holds:
>         
>           - arbitrationDecision effectiveIntent is RESET PREPARATION INTENT
>           - arbitrationDecision effectiveIntent is HOLD MONITORING INTENT
>     
>     **Then:**
>     
>     committedMonitoringState is MONITORING HELD
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is not STOP INTENT
>       - arbitrationDecision effectiveIntent is START MONITORING INTENT
>       - eligibilityEnvelope condition is ACQUISITION READY
>     
>     **Then:**
>     
>     committedMonitoringState is MONITORING ACTIVE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is not STOP INTENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - the value of committedMonitoringState on entry is MONITORING ACTIVE
>           - At least one of the following conditions holds:
>             
>               - arbitrationDecision effectiveIntent is RESET PREPARATION INTENT
>               - arbitrationDecision effectiveIntent is HOLD MONITORING INTENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - arbitrationDecision effectiveIntent is START MONITORING INTENT
>           - eligibilityEnvelope condition is ACQUISITION READY
>     
>     **Then:**
>     
>     committedMonitoringState is the value of committedMonitoringState on entry
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - arbitrationDecision effectiveIntent is RESET PREPARATION INTENT
>           - arbitrationDecision effectiveIntent is HOLD MONITORING INTENT
>           - arbitrationDecision disposition is REJECTED
>       - eligibilityEnvelope condition is BELT UNAVAILABLE CONDITION
>     
>     **Then:**
>     
>     monitoringDecision notice is BELT OBSERVATION UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - arbitrationDecision effectiveIntent is RESET PREPARATION INTENT
>           - arbitrationDecision effectiveIntent is HOLD MONITORING INTENT
>           - arbitrationDecision disposition is REJECTED
>       - eligibilityEnvelope condition is BELT ABSENT CONDITION
>     
>     **Then:**
>     
>     monitoringDecision notice is BELT NOT CONFIRMED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - arbitrationDecision effectiveIntent is RESET PREPARATION INTENT
>           - arbitrationDecision effectiveIntent is HOLD MONITORING INTENT
>           - arbitrationDecision disposition is REJECTED
>       - eligibilityEnvelope condition is CALIBRATION NOT READY CONDITION
>     
>     **Then:**
>     
>     monitoringDecision notice is CALIBRATION NOT READY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - arbitrationDecision effectiveIntent is RESET PREPARATION INTENT
>           - arbitrationDecision effectiveIntent is HOLD MONITORING INTENT
>           - arbitrationDecision disposition is REJECTED
>       - eligibilityEnvelope condition is ACQUISITION FAULT CONDITION
>     
>     **Then:**
>     
>     monitoringDecision notice is ACQUISITION UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision disposition is REJECTED
>       - eligibilityEnvelope condition is ACQUISITION READY
>     
>     **Then:**
>     
>     monitoringDecision notice is INAPPLICABLE REQUEST
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is not RESET PREPARATION INTENT
>       - arbitrationDecision effectiveIntent is not HOLD MONITORING INTENT
>       - arbitrationDecision disposition is not REJECTED
>       - committedMonitoringState is MONITORING HELD
>     
>     **Then:**
>     
>     monitoringDecision notice is MONITORING HELD NOTICE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is not RESET PREPARATION INTENT
>       - arbitrationDecision effectiveIntent is not HOLD MONITORING INTENT
>       - arbitrationDecision disposition is not REJECTED
>       - committedMonitoringState is not MONITORING HELD
>     
>     **Then:**
>     
>     monitoringDecision notice is NONE.

### Requirements for PreparationStateGovernor

#### Contract clauses evaluated in the initialization phase

##### `INIT_PREPARATION_STATE` — Required behavior

> During contract evaluation for the initialization phase, PreparationStateGovernor shall set committedPreparationState to UNPREPARED, preparationState to UNPREPARED, preparationDecision preState to UNPREPARED, preparationDecision nextState to UNPREPARED, preparationDecision effectiveIntent to NO INTENT, and preparationDecision disposition to NO REQUEST DISPOSITION.

#### Contract clauses evaluated in the compute phase

##### `PUBLISH_PREPARATION_PRE_STATE` — Required behavior

> During contract evaluation for the compute phase, PreparationStateGovernor shall set preparationState to the value of committedPreparationState on entry.

##### `PROJECT_PREPARATION_SNAPSHOT` — Required behavior

> During contract evaluation for the compute phase, PreparationStateGovernor shall produce a result for which if the value of committedPreparationState on entry is UNPREPARED, then preparationDecision preState is UNPREPARED, if the value of committedPreparationState on entry is BELT CONFIRMED, then preparationDecision preState is BELT CONFIRMED, if the value of committedPreparationState on entry is PREPARATION CALIBRATED, then preparationDecision preState is PREPARATION CALIBRATED, if committedPreparationState is UNPREPARED, then preparationDecision nextState is UNPREPARED, if committedPreparationState is BELT CONFIRMED, then preparationDecision nextState is BELT CONFIRMED, if committedPreparationState is PREPARATION CALIBRATED, then preparationDecision nextState is PREPARATION CALIBRATED, if arbitrationDecision effectiveIntent is NO INTENT, then preparationDecision effectiveIntent is NO INTENT, if arbitrationDecision effectiveIntent is STOP INTENT, then preparationDecision effectiveIntent is STOP INTENT, if arbitrationDecision effectiveIntent is RESET PREPARATION INTENT, then preparationDecision effectiveIntent is RESET PREPARATION INTENT, if arbitrationDecision effectiveIntent is HOLD MONITORING INTENT, then preparationDecision effectiveIntent is HOLD MONITORING INTENT, if arbitrationDecision effectiveIntent is CONFIRM BELT INTENT, then preparationDecision effectiveIntent is CONFIRM BELT INTENT, if arbitrationDecision effectiveIntent is RECORD CALIBRATION INTENT, then preparationDecision effectiveIntent is RECORD CALIBRATION INTENT, if arbitrationDecision effectiveIntent is START MONITORING INTENT, then preparationDecision effectiveIntent is START MONITORING INTENT, if arbitrationDecision disposition is NO REQUEST DISPOSITION, then preparationDecision disposition is NO REQUEST DISPOSITION, if arbitrationDecision disposition is ACCEPTED, then preparationDecision disposition is ACCEPTED, if arbitrationDecision disposition is REJECTED, then preparationDecision disposition is REJECTED, if arbitrationDecision disposition is RECOVERY APPLIED, then preparationDecision disposition is RECOVERY APPLIED, and if arbitrationDecision disposition is PREEMPTED, then preparationDecision disposition is PREEMPTED.

##### `CASE_07_RESET_OR_RETAIN_PREPARATION` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationDecision effectiveIntent is RESET PREPARATION INTENT, arbitrationDecision effectiveIntent is STOP INTENT, arbitrationDecision effectiveIntent is HOLD MONITORING INTENT, arbitrationDecision effectiveIntent is START MONITORING INTENT, or arbitrationDecision effectiveIntent is NO INTENT, PreparationStateGovernor shall produce a result for which if arbitrationDecision effectiveIntent is RESET PREPARATION INTENT, then committedPreparationState is UNPREPARED and if arbitrationDecision effectiveIntent is not RESET PREPARATION INTENT, then committedPreparationState is the value of committedPreparationState on entry.

##### `CASE_17_ADVANCE_PREPARATION` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationDecision effectiveIntent is CONFIRM BELT INTENT or arbitrationDecision effectiveIntent is RECORD CALIBRATION INTENT, PreparationStateGovernor shall produce a result for which if arbitrationDecision effectiveIntent is CONFIRM BELT INTENT, then committedPreparationState is BELT CONFIRMED and if arbitrationDecision effectiveIntent is RECORD CALIBRATION INTENT, then committedPreparationState is PREPARATION CALIBRATED.

### Requirements for RequestArbiter

#### Contract clauses evaluated in the initialization phase

##### `INIT_ARBITRATION` — Required behavior

> During contract evaluation for the initialization phase, RequestArbiter shall produce a result for which if doctorRequest is STOP MONITORING, then arbitrationDecision effectiveIntent is STOP INTENT, if doctorRequest is not STOP MONITORING and eligibilityEnvelope recovery is RESET PREPARATION RECOVERY, then arbitrationDecision effectiveIntent is RESET PREPARATION INTENT, and if doctorRequest is not STOP MONITORING and eligibilityEnvelope recovery is HOLD MONITORING RECOVERY, then arbitrationDecision effectiveIntent is HOLD MONITORING INTENT.

#### Contract clauses evaluated in the compute phase

##### `CASE_13_STOP_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if doctorRequest is STOP MONITORING, RequestArbiter shall produce a result for which arbitrationDecision effectiveIntent is STOP INTENT, if eligibilityEnvelope recovery is not NO RECOVERY or technicianRequest is not NO TECHNICIAN REQUEST, then arbitrationDecision disposition is PREEMPTED, and if eligibilityEnvelope recovery is NO RECOVERY and technicianRequest is NO TECHNICIAN REQUEST, then arbitrationDecision disposition is ACCEPTED.

##### `CASE_14_RECOVERY_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if doctorRequest is not STOP MONITORING and eligibilityEnvelope recovery is not NO RECOVERY, RequestArbiter shall produce a result for which if eligibilityEnvelope recovery is RESET PREPARATION RECOVERY, then arbitrationDecision effectiveIntent is RESET PREPARATION INTENT, if eligibilityEnvelope recovery is HOLD MONITORING RECOVERY, then arbitrationDecision effectiveIntent is HOLD MONITORING INTENT, if doctorRequest is START MONITORING or technicianRequest is not NO TECHNICIAN REQUEST, then arbitrationDecision disposition is PREEMPTED, and if doctorRequest is not START MONITORING and technicianRequest is NO TECHNICIAN REQUEST, then arbitrationDecision disposition is RECOVERY APPLIED.

##### `CASE_15_TECHNICIAN_PRIORITY_AND_APPLICABILITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 TECHNICIAN PRIORITY AND APPLICABILITY applies under all of the following conditions:
>
> doctorRequest is not STOP MONITORING, eligibilityEnvelope recovery is NO RECOVERY, and technicianRequest is not NO TECHNICIAN REQUEST.

> When all applicability conditions are met, RequestArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     technicianRequest is RESET PREPARATION
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is RESET PREPARATION INTENT
>       - **If:**
>         
>         doctorRequest is START MONITORING
>         
>         **Then:**
>         
>         arbitrationDecision disposition is PREEMPTED
>       - **If:**
>         
>         doctorRequest is not START MONITORING
>         
>         **Then:**
>         
>         arbitrationDecision disposition is ACCEPTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - technicianRequest is CONFIRM BELT
>       - eligibilityEnvelope beltQualified is true exactly when T is true
>       - eligibilityEnvelope preparationState is not PREPARATION CALIBRATED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is CONFIRM BELT INTENT
>       - **If:**
>         
>         doctorRequest is START MONITORING
>         
>         **Then:**
>         
>         arbitrationDecision disposition is PREEMPTED
>       - **If:**
>         
>         doctorRequest is not START MONITORING
>         
>         **Then:**
>         
>         arbitrationDecision disposition is ACCEPTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - technicianRequest is RECORD CALIBRATION
>       - eligibilityEnvelope beltQualified is true exactly when T is true
>       - eligibilityEnvelope calibrationQualified is true exactly when T is true
>       - eligibilityEnvelope preparationState is not UNPREPARED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is RECORD CALIBRATION INTENT
>       - **If:**
>         
>         doctorRequest is START MONITORING
>         
>         **Then:**
>         
>         arbitrationDecision disposition is PREEMPTED
>       - **If:**
>         
>         doctorRequest is not START MONITORING
>         
>         **Then:**
>         
>         arbitrationDecision disposition is ACCEPTED
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - technicianRequest is CONFIRM BELT
>           - At least one of the following conditions holds:
>             
>               - eligibilityEnvelope beltQualified is true exactly when F is true
>               - eligibilityEnvelope preparationState is PREPARATION CALIBRATED
>       - All of the following conditions hold:
>         
>           - technicianRequest is RECORD CALIBRATION
>           - At least one of the following conditions holds:
>             
>               - eligibilityEnvelope beltQualified is true exactly when F is true
>               - eligibilityEnvelope calibrationQualified is true exactly when F is true
>               - eligibilityEnvelope preparationState is UNPREPARED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationDecision effectiveIntent is NO INTENT
>       - arbitrationDecision disposition is REJECTED.

##### `CASE_16_START_OR_NO_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if doctorRequest is not STOP MONITORING, eligibilityEnvelope recovery is NO RECOVERY, and technicianRequest is NO TECHNICIAN REQUEST, RequestArbiter shall produce a result for which if doctorRequest is START MONITORING and eligibilityEnvelope condition is ACQUISITION READY, then arbitrationDecision effectiveIntent is START MONITORING INTENT and arbitrationDecision disposition is ACCEPTED, if doctorRequest is START MONITORING and eligibilityEnvelope condition is not ACQUISITION READY, then arbitrationDecision effectiveIntent is NO INTENT and arbitrationDecision disposition is REJECTED, and if doctorRequest is NO DOCTOR REQUEST, then arbitrationDecision effectiveIntent is NO INTENT and arbitrationDecision disposition is NO REQUEST DISPOSITION.

### Requirements for SessionPublicationPolicy

#### Contract clauses evaluated in the initialization phase

##### `INIT_PUBLICATION` — Required behavior

> During contract evaluation for the initialization phase, SessionPublicationPolicy shall set frameDelivery to NO DELIVERY, sessionStatus preparationState to UNPREPARED, sessionStatus monitoringState to MONITORING INACTIVE, sessionStatus disposition to NO REQUEST DISPOSITION, and sessionStatus notice to NONE.

#### Contract clauses evaluated in the compute phase

##### `PROJECT_SESSION_STATUS` — Required behavior

> During contract evaluation for the compute phase, SessionPublicationPolicy shall produce a result for which if monitoringDecision preparationState is UNPREPARED, then sessionStatus preparationState is UNPREPARED, if monitoringDecision preparationState is BELT CONFIRMED, then sessionStatus preparationState is BELT CONFIRMED, if monitoringDecision preparationState is PREPARATION CALIBRATED, then sessionStatus preparationState is PREPARATION CALIBRATED, if monitoringDecision nextState is MONITORING INACTIVE, then sessionStatus monitoringState is MONITORING INACTIVE, if monitoringDecision nextState is MONITORING ACTIVE, then sessionStatus monitoringState is MONITORING ACTIVE, if monitoringDecision nextState is MONITORING HELD, then sessionStatus monitoringState is MONITORING HELD, if monitoringDecision disposition is NO REQUEST DISPOSITION, then sessionStatus disposition is NO REQUEST DISPOSITION, if monitoringDecision disposition is ACCEPTED, then sessionStatus disposition is ACCEPTED, if monitoringDecision disposition is REJECTED, then sessionStatus disposition is REJECTED, if monitoringDecision disposition is RECOVERY APPLIED, then sessionStatus disposition is RECOVERY APPLIED, and if monitoringDecision disposition is PREEMPTED, then sessionStatus disposition is PREEMPTED.

##### `CASE_20_FRAME_ADMISSION_AND_NOTICE` — Conditional behavior

> During contract evaluation for the compute phase, SessionPublicationPolicy shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - monitoringDecision nextState is MONITORING ACTIVE
>       - impedanceFrame is FRAME A
>     
>     **Then:**
>     
>     frameDelivery is DELIVER FRAME A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - monitoringDecision nextState is MONITORING ACTIVE
>       - impedanceFrame is FRAME B
>     
>     **Then:**
>     
>     frameDelivery is DELIVER FRAME B
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - monitoringDecision nextState is not MONITORING ACTIVE
>       - impedanceFrame is NO FRAME
>       - impedanceFrame is INVALID FRAME
>     
>     **Then:**
>     
>     frameDelivery is NO DELIVERY
>   - **If:**
>     
>     monitoringDecision notice is BELT OBSERVATION UNAVAILABLE
>     
>     **Then:**
>     
>     sessionStatus notice is BELT OBSERVATION UNAVAILABLE
>   - **If:**
>     
>     monitoringDecision notice is BELT NOT CONFIRMED
>     
>     **Then:**
>     
>     sessionStatus notice is BELT NOT CONFIRMED
>   - **If:**
>     
>     monitoringDecision notice is CALIBRATION NOT READY
>     
>     **Then:**
>     
>     sessionStatus notice is CALIBRATION NOT READY
>   - **If:**
>     
>     monitoringDecision notice is ACQUISITION UNAVAILABLE
>     
>     **Then:**
>     
>     sessionStatus notice is ACQUISITION UNAVAILABLE
>   - **If:**
>     
>     monitoringDecision notice is MONITORING HELD NOTICE
>     
>     **Then:**
>     
>     sessionStatus notice is MONITORING HELD NOTICE
>   - **If:**
>     
>     monitoringDecision notice is INAPPLICABLE REQUEST
>     
>     **Then:**
>     
>     sessionStatus notice is INAPPLICABLE REQUEST
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - monitoringDecision notice is NONE
>       - monitoringDecision nextState is MONITORING ACTIVE
>       - impedanceFrame is INVALID FRAME
>     
>     **Then:**
>     
>     sessionStatus notice is FRAME REJECTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - monitoringDecision notice is NONE
>       - monitoringDecision nextState is MONITORING ACTIVE
>       - impedanceFrame is NO FRAME
>     
>     **Then:**
>     
>     sessionStatus notice is WAITING FOR FRAME
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - monitoringDecision notice is NONE
>       - At least one of the following conditions holds:
>         
>           - monitoringDecision nextState is not MONITORING ACTIVE
>           - impedanceFrame is FRAME A
>           - impedanceFrame is FRAME B
>     
>     **Then:**
>     
>     sessionStatus notice is NONE.
