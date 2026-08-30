# EIT monitoring and acquisition supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A bounded supervisor is needed to
coordinate a Doctor's monitoring intent with externally supplied belt, calibration,
equipment, impedance-batch, and image-generation evidence so that ordinary acquisition
work cannot hide invalid evidence, a reported failure, or incomplete recovery.

PURPOSE-01: [Pilot abstraction] For each logical evaluation, the system shall qualify
the six boundary observations, propagate any local fault into one recovery gate,
progress four independently owned supervisory states, choose at most one monitoring,
collection, generation, release, stop, or hold action by strict priority, and publish
mutually consistent control and status frames.

GOAL-01: [Pilot abstraction] The system shall cover every finite qualified-input and
retained-state combination with exactly one case at each state owner and exactly one
effective arbitration case.

GOAL-02: [Pilot abstraction] Invalid evidence or a reported preparation, equipment,
batch, or image failure shall close the recovery gate in the same evaluation and inhibit
ordinary monitoring, collection, generation, and release actions.

GOAL-03: [Pilot abstraction] Recovery shall require a fresh `RESET` event followed on a
later evaluation by a fresh `VERIFY_OK` event, with any new fault dominating either
event.

GOAL-04: [Pilot abstraction] When ordinary proposals coincide, explicit Doctor stop
shall dominate start and all acquisition work, image release shall dominate new
generation and collection, and image generation shall dominate collection.

GOAL-05: [Selected architecture] Separate session, acquisition-cycle,
image-availability, and recovery owners shall retain only their own state, while the
arbiter and publisher remain stateless and do not reproduce their transition relations.

### Operational context and selected system boundary

CTX-01: [Selected boundary] The modeled system is a supervisory coordinator between the
named people and an external acquisition/imaging facility. It does not apply the belt,
perform calibration, acquire physical signals, reconstruct an actual image, or analyze
an image.

CTX-DOC-01: [Seed-grounded entity with pilot responsibility] The Doctor supplies one
status-bearing monitoring event per evaluation and consumes the finite supervisory
status. Under the pilot assumption, a valid non-`NONE` event is fresh and a request
ignored during recovery release must be presented again later.

CTX-TECH-01: [Seed-grounded entity with pilot responsibility] The EngineerTechnician
supplies one finite preparation observation and one status-bearing recovery event. This
assigned observation and recovery authority are pilot responsibilities, not exclusivity
claims inferred from the seed association.

CTX-PAT-01: [Seed-grounded entity; informational] The Patient remains external context
associated with wearing the electrode belt, but supplies no modeled input and receives
no modeled control because the source assigns no Patient use case and does not establish
sensing, consent, or control semantics.

CTX-EIT-01: [Resolution of seed ambiguity] The source's `EITSystem` actor is treated
here as an external acquisition/imaging facility distinct from this supervisory
boundary. It supplies equipment, impedance-batch, and image-result observations and
consumes requests; this is a selected viewpoint, not a source-grounded identity claim.

CTX-STATUS-01: [Selected boundary] The Doctor and EngineerTechnician consume
`StatusFrame`; no field certifies image correctness, patient condition, calibration
quality, or successful execution of a requested command.

MON-DOC-01: [Pilot abstraction] Root input `doctorSignal` has finite type
`DoctorSignal={NONE,START,STOP,ACK_IMAGE,INVALID_INTENT,INVALID_STATUS}` and comes from
`CTX-DOC-01`. The two invalid variants are explicit status concepts and intentionally
collapse to one request-input fault during qualification.

MON-PREP-01: [Pilot abstraction] Root input `preparationObservation` has type
`PreparationObservation={READY,NOT_APPLIED,CALIBRATION_NOT_PERFORMED,CALIBRATION_FAILED,INVALID_BELT_STATUS,INVALID_CALIBRATION_STATUS}`
and comes from `CTX-TECH-01`. `READY` means only that belt-applied and
calibration-performed evidence is currently asserted.

MON-EQUIP-01: [Pilot abstraction] Root input `equipmentObservation` has type
`EquipmentObservation={READY,NOT_READY,BUSY,FAULTED,INVALID_HEALTH_STATUS,INVALID_AVAILABILITY_STATUS}`
and comes from `CTX-EIT-01`. `READY` means command acceptance is reported possible, not
that physical acquisition will succeed.

MON-BATCH-01: [Pilot abstraction] Root input `batchSignal` has type
`BatchSignal={NONE,COMPLETE,INCOMPLETE,CORRUPT,INVALID_BATCH_KIND,INVALID_BATCH_STATUS}`
and comes from `CTX-EIT-01`. Every non-`NONE` valid variant is a fresh abstract event
and carries no samples, units, timestamps, quality score, or patient information.

MON-IMAGE-01: [Pilot abstraction] Root input `imageFeedback` has type
`ImageFeedback={NONE,GENERATED,FAILED,INVALID_RESULT,INVALID_STATUS}` and comes from
`CTX-EIT-01`. `GENERATED` means only that an abstract image result became available; it
does not mean diagnostically usable or correct.

MON-REC-01: [Pilot abstraction] Root input `recoveryEvent` has type
`RecoveryEvent={NONE,RESET,VERIFY_OK,INVALID_RESET,INVALID_STATUS}` and comes from
`CTX-TECH-01`. Every valid non-`NONE` event is fresh for one evaluation; `RESET` and
`VERIFY_OK` cannot be the same event.

CTRL-CONTROL-01: [Selected architecture] Root output
`controlFrame=(acquisitionCommand,imageCommand)` goes to `CTX-EIT-01`, where
`AcquisitionCommand={NO_COMMAND,REQUEST_START,REQUEST_COLLECTION,REQUEST_STOP}` and
`ImageCommand={NO_COMMAND,REQUEST_GENERATION}`. A request is not an assertion of
physical execution.

CTRL-STATUS-01: [Selected architecture] Root output
`statusFrame=(publicMode,selectedCause,sessionState,cycleState,imageState,recoveryState,imageDisposition,dominantFault,multipleFaults)`
goes to `CTX-STATUS-01` as one flat evaluation-consistent record.

### Essential assumptions and constraints

ASM-STEP-01: [Pilot abstraction] An evaluation is an ordered logical step with no
duration claim. All owners consume one coherent snapshot and their declared pre-state;
next-state values and outputs become the result of that step.

ASM-FRESH-01: [Pilot abstraction] `CTX-DOC-01`, `CTX-EIT-01`, and `CTX-TECH-01` are
responsible for presenting non-`NONE` Doctor, batch, image, and recovery events for
exactly one evaluation and for not replaying them as fresh events.

ASM-PREP-01: [Pilot abstraction] `CTX-TECH-01` is responsible for the declared finite
preparation observation. The supervisor does not verify belt placement or calibration
performance and must not relabel `READY` as clinically or physically correct.

ASM-CMD-01: [Pilot abstraction] `CTX-EIT-01` is responsible for accepting or rejecting
requests and for later reporting observations. The supervisor does not infer success
from issuance of `REQUEST_START`, `REQUEST_COLLECTION`, `REQUEST_STOP`, or
`REQUEST_GENERATION`.

ASM-ONE-01: [Pilot abstraction] At most one monitoring session, one acquisition cycle,
and one abstract image result are represented. There are no queues, identifiers,
timestamps, multiple patients, multiple belts, or simultaneous image generations.

ASM-REC-01: [Pilot abstraction] A request supplied on the evaluation that reopens
recovery is deliberately ignored; the responsible external entity must present a later
fresh request. This prevents a recovery event and ordinary work from being accepted as
one event.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, state is
`IDLE/DORMANT/EMPTY/HEALTHY`, `controlFrame` contains two `NO_COMMAND` values, and
`statusFrame` reports `IDLE/NO_ELIGIBLE_WORK` with no image or fault. Initialization is
deterministic experiment behavior, not a physical safe-start claim.

### Faults, risks, priority, recovery, and composition

RISK-01: [Pilot risk] An invalid or failed local observation could otherwise be accepted
as readiness and permit ordinary acquisition work; `FAULT-01` requires same-evaluation
propagation to a closed recovery gate and emergency hold.

RISK-02: [Pilot risk] A reset treated as complete recovery could reopen work before a
distinct verification event; `FAULT-02` requires latched and verifying recovery states
with fresh-event separation.

RISK-03: [Pilot risk] Independently true stop, release, generation, or collection
proposals could otherwise yield inconsistent commands and status; `PRIORITY-01` and
`COMP-01` require one effective selection and one public composer.

## Supporting contract definitions

### State `EIT_Acquisition_Supervisor::AcquisitionCycleControl::cycleMemory`

State `cycleMemory` has type `EIT_Acquisition_Supervisor::CycleState`.

### State `EIT_Acquisition_Supervisor::ImageAvailabilityControl::imageMemory`

State `imageMemory` has type `EIT_Acquisition_Supervisor::ImageState`.

### State `EIT_Acquisition_Supervisor::RecoveryControl::recoveryMemory`

State `recoveryMemory` has type `EIT_Acquisition_Supervisor::RecoveryState`.

### State `EIT_Acquisition_Supervisor::SessionControl::sessionMemory`

State `sessionMemory` has type `EIT_Acquisition_Supervisor::SessionState`.

## Detailed behavioral requirements

### Requirements for AcquisitionCycleControl

#### Contract clauses evaluated in the initialization phase

May modify: cycleMemory

##### `INITIAL_CYCLE` — Required behavior

> During contract evaluation for the initialization phase, AcquisitionCycleControl shall set cycleMemory to DORMANT, cycle frame cycleState to DORMANT, and cycle frame batchReady to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: cycleMemory

##### `CYCLE_FRAME_STATE` — Required behavior

> During contract evaluation for the compute phase, AcquisitionCycleControl shall set cycle frame cycleState to cycleMemory.

##### `CASE_12_CLOSED_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is CLOSED, AcquisitionCycleControl shall set cycleMemory to RECOVERY and cycle frame batchReady to true exactly when F is true.

##### `CASE_13_RECOVERY_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN and the value of cycleMemory on entry is RECOVERY, AcquisitionCycleControl shall set cycleMemory to DORMANT and cycle frame batchReady to true exactly when F is true.

##### `CASE_14_USABLE_BATCH` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of cycleMemory on entry is not RECOVERY, and batch facts is USABLE, AcquisitionCycleControl shall produce a result for which cycleMemory is BATCH READY and cycle frame batchReady is true.

##### `CASE_15_EQUIPMENT_BUSY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of cycleMemory on entry is not RECOVERY, batch facts is not USABLE, and equipment facts is BUSY, AcquisitionCycleControl shall set cycleMemory to COLLECTING and cycle frame batchReady to true exactly when F is true.

##### `CASE_16_EQUIPMENT_READY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of cycleMemory on entry is not RECOVERY, batch facts is not USABLE, and equipment facts is READY, AcquisitionCycleControl shall set cycleMemory to READY and cycle frame batchReady to true exactly when F is true.

##### `CASE_17_CYCLE_FALLTHROUGH` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of cycleMemory on entry is not RECOVERY, batch facts is not USABLE, equipment facts is not BUSY, and equipment facts is not READY, AcquisitionCycleControl shall set cycleMemory to DORMANT and cycle frame batchReady to true exactly when F is true.

### Requirements for BatchAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BATCH_FACTS` — Required behavior

> During contract evaluation for the initialization phase, BatchAssessment shall set batch facts to NO BATCH.

#### Contract clauses evaluated in the compute phase

##### `TOTAL_BATCH_ASSESSMENT` — Required behavior

> During contract evaluation for the compute phase, BatchAssessment shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - batch signal is NONE
>       - batch facts is NO BATCH
>   - All of the following conditions hold:
>     
>       - batch signal is COMPLETE
>       - batch facts is USABLE
>   - All of the following conditions hold:
>     
>       - batch signal is INCOMPLETE
>       - batch facts is INCOMPLETE
>   - All of the following conditions hold:
>     
>       - batch signal is CORRUPT
>       - batch facts is FAILED
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - batch signal is INVALID BATCH KIND
>           - batch signal is INVALID BATCH STATUS
>       - batch facts is INPUT FAULT.

### Requirements for CollectionFeasibilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_COLLECTION_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, CollectionFeasibilityOwner shall set collection proposal to NOT PROPOSED.

#### Contract clauses evaluated in the compute phase

##### `COLLECTION_FEASIBILITY_RELATION` — Required behavior

> During contract evaluation for the compute phase, CollectionFeasibilityOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - recovery frame recoveryGate is OPEN
>       - session frame sessionState is MONITORING
>       - cycle frame cycleState is READY
>       - collection proposal is PROPOSED
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - recovery frame recoveryGate is not OPEN
>           - session frame sessionState is not MONITORING
>           - cycle frame cycleState is not READY
>       - collection proposal is NOT PROPOSED.

### Requirements for DoctorRequestQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REQUEST_FACTS` — Required behavior

> During contract evaluation for the initialization phase, DoctorRequestQualification shall set request facts requestClass to NO REQUEST and request facts requestFault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `TOTAL_REQUEST_QUALIFICATION` — Required behavior

> During contract evaluation for the compute phase, DoctorRequestQualification shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - doctor signal is NONE
>       - request facts requestClass is NO REQUEST
>       - request facts requestFault is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - doctor signal is START
>       - request facts requestClass is START REQUEST
>       - request facts requestFault is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - doctor signal is STOP
>       - request facts requestClass is STOP REQUEST
>       - request facts requestFault is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - doctor signal is ACK IMAGE
>       - request facts requestClass is IMAGE ACK
>       - request facts requestFault is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - doctor signal is INVALID INTENT
>           - doctor signal is INVALID STATUS
>       - request facts requestClass is NO REQUEST
>       - request facts requestFault is true.

### Requirements for EquipmentAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_EQUIPMENT_FACTS` — Required behavior

> During contract evaluation for the initialization phase, EquipmentAssessment shall set equipment facts to INPUT FAULT.

#### Contract clauses evaluated in the compute phase

##### `TOTAL_EQUIPMENT_ASSESSMENT` — Required behavior

> During contract evaluation for the compute phase, EquipmentAssessment shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - equipment observation is READY
>       - equipment facts is READY
>   - All of the following conditions hold:
>     
>       - equipment observation is NOT READY
>       - equipment facts is NOT READY
>   - All of the following conditions hold:
>     
>       - equipment observation is BUSY
>       - equipment facts is BUSY
>   - All of the following conditions hold:
>     
>       - equipment observation is FAULTED
>       - equipment facts is FAILED
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - equipment observation is INVALID HEALTH STATUS
>           - equipment observation is INVALID AVAILABILITY STATUS
>       - equipment facts is INPUT FAULT.

### Requirements for FaultComposition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_FAULT_SUMMARY` — Required behavior

> During contract evaluation for the initialization phase, FaultComposition shall set fault summary faultPresent to true exactly when F is true, fault summary dominantFault to NONE, and fault summary multipleFaults to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `LOCAL_FAULT_PRESENCE` — Required behavior

> During contract evaluation for the compute phase, FaultComposition shall set fault summary faultPresent to true exactly when request facts requestFault is true, preparation facts is INPUT FAULT, equipment facts is INPUT FAULT, batch facts is INPUT FAULT, image result facts is INPUT FAULT, preparation facts is FAILED, equipment facts is FAILED, batch facts is FAILED, or image result facts is FAILED.

##### `LOCAL_FAULT_MULTIPLICITY` — Required behavior

> During contract evaluation for the compute phase, FaultComposition shall set fault summary multipleFaults to true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true
>       - At least one of the following conditions holds:
>         
>           - preparation facts is INPUT FAULT
>           - equipment facts is INPUT FAULT
>           - batch facts is INPUT FAULT
>           - image result facts is INPUT FAULT
>           - preparation facts is FAILED
>           - equipment facts is FAILED
>           - batch facts is FAILED
>           - image result facts is FAILED
>   - All of the following conditions hold:
>     
>       - preparation facts is INPUT FAULT
>       - At least one of the following conditions holds:
>         
>           - equipment facts is INPUT FAULT
>           - batch facts is INPUT FAULT
>           - image result facts is INPUT FAULT
>           - preparation facts is FAILED
>           - equipment facts is FAILED
>           - batch facts is FAILED
>           - image result facts is FAILED
>   - All of the following conditions hold:
>     
>       - equipment facts is INPUT FAULT
>       - At least one of the following conditions holds:
>         
>           - batch facts is INPUT FAULT
>           - image result facts is INPUT FAULT
>           - preparation facts is FAILED
>           - equipment facts is FAILED
>           - batch facts is FAILED
>           - image result facts is FAILED
>   - All of the following conditions hold:
>     
>       - batch facts is INPUT FAULT
>       - At least one of the following conditions holds:
>         
>           - image result facts is INPUT FAULT
>           - preparation facts is FAILED
>           - equipment facts is FAILED
>           - batch facts is FAILED
>           - image result facts is FAILED
>   - All of the following conditions hold:
>     
>       - image result facts is INPUT FAULT
>       - At least one of the following conditions holds:
>         
>           - preparation facts is FAILED
>           - equipment facts is FAILED
>           - batch facts is FAILED
>           - image result facts is FAILED
>   - All of the following conditions hold:
>     
>       - preparation facts is FAILED
>       - At least one of the following conditions holds:
>         
>           - equipment facts is FAILED
>           - batch facts is FAILED
>           - image result facts is FAILED
>   - All of the following conditions hold:
>     
>       - equipment facts is FAILED
>       - At least one of the following conditions holds:
>         
>           - batch facts is FAILED
>           - image result facts is FAILED
>   - All of the following conditions hold:
>     
>       - batch facts is FAILED
>       - image result facts is FAILED.

##### `LOCAL_DOMINANT_FAULT_PRIORITY` — Required behavior

> During contract evaluation for the compute phase, FaultComposition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true
>       - fault summary dominantFault is REQUEST INPUT
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true exactly when F is true
>       - preparation facts is INPUT FAULT
>       - fault summary dominantFault is PREPARATION INPUT
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true exactly when F is true
>       - preparation facts is not INPUT FAULT
>       - equipment facts is INPUT FAULT
>       - fault summary dominantFault is EQUIPMENT INPUT
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true exactly when F is true
>       - preparation facts is not INPUT FAULT
>       - equipment facts is not INPUT FAULT
>       - batch facts is INPUT FAULT
>       - fault summary dominantFault is BATCH INPUT
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true exactly when F is true
>       - preparation facts is not INPUT FAULT
>       - equipment facts is not INPUT FAULT
>       - batch facts is not INPUT FAULT
>       - image result facts is INPUT FAULT
>       - fault summary dominantFault is IMAGE INPUT
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true exactly when F is true
>       - preparation facts is not INPUT FAULT
>       - equipment facts is not INPUT FAULT
>       - batch facts is not INPUT FAULT
>       - image result facts is not INPUT FAULT
>       - preparation facts is FAILED
>       - fault summary dominantFault is PREPARATION FAILURE
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true exactly when F is true
>       - preparation facts is not INPUT FAULT
>       - equipment facts is not INPUT FAULT
>       - batch facts is not INPUT FAULT
>       - image result facts is not INPUT FAULT
>       - preparation facts is not FAILED
>       - equipment facts is FAILED
>       - fault summary dominantFault is EQUIPMENT FAILURE
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true exactly when F is true
>       - preparation facts is not INPUT FAULT
>       - equipment facts is not INPUT FAULT
>       - batch facts is not INPUT FAULT
>       - image result facts is not INPUT FAULT
>       - preparation facts is not FAILED
>       - equipment facts is not FAILED
>       - batch facts is FAILED
>       - fault summary dominantFault is BATCH FAILURE
>   - All of the following conditions hold:
>     
>       - request facts requestFault is true exactly when F is true
>       - preparation facts is not INPUT FAULT
>       - equipment facts is not INPUT FAULT
>       - batch facts is not INPUT FAULT
>       - image result facts is not INPUT FAULT
>       - preparation facts is not FAILED
>       - equipment facts is not FAILED
>       - batch facts is not FAILED
>       - image result facts is FAILED
>       - fault summary dominantFault is IMAGE FAILURE
>   - All of the following conditions hold:
>     
>       - fault summary faultPresent is true exactly when F is true
>       - fault summary dominantFault is NONE.

### Requirements for ImageAvailabilityControl

#### Contract clauses evaluated in the initialization phase

May modify: imageMemory

##### `INITIAL_IMAGE` — Required behavior

> During contract evaluation for the initialization phase, ImageAvailabilityControl shall set imageMemory to EMPTY, image frame imageState to EMPTY, and image frame generateProposal to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: imageMemory

##### `IMAGE_FRAME_STATE` — Required behavior

> During contract evaluation for the compute phase, ImageAvailabilityControl shall set image frame imageState to imageMemory.

##### `CASE_18_CLOSED_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is CLOSED, ImageAvailabilityControl shall set imageMemory to RECOVERY and image frame generateProposal to true exactly when F is true.

##### `CASE_19_RECOVERY_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN and the value of imageMemory on entry is RECOVERY, ImageAvailabilityControl shall set imageMemory to EMPTY and image frame generateProposal to true exactly when F is true.

##### `CASE_20_RESULT_AVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of imageMemory on entry is not RECOVERY, and image result facts is AVAILABLE, ImageAvailabilityControl shall set imageMemory to AVAILABLE and image frame generateProposal to true exactly when F is true.

##### `CASE_21_IMAGE_ACK` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of imageMemory on entry is not RECOVERY, image result facts is not AVAILABLE, and request facts requestClass is IMAGE ACK, ImageAvailabilityControl shall set imageMemory to EMPTY and image frame generateProposal to true exactly when F is true.

##### `CASE_22_USABLE_BATCH` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of imageMemory on entry is not RECOVERY, image result facts is not AVAILABLE, request facts requestClass is not IMAGE ACK, and batch facts is USABLE, ImageAvailabilityControl shall produce a result for which imageMemory is AWAITING IMAGE and image frame generateProposal is true.

##### `CASE_23_IMAGE_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of imageMemory on entry is not RECOVERY, image result facts is not AVAILABLE, request facts requestClass is not IMAGE ACK, and batch facts is not USABLE, ImageAvailabilityControl shall preserve the value of imageMemory on entry and set image frame generateProposal to true exactly when the value of imageMemory on entry is AWAITING IMAGE.

### Requirements for ImageReleaseFeasibilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RELEASE_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, ImageReleaseFeasibilityOwner shall set release proposal to NOT PROPOSED.

#### Contract clauses evaluated in the compute phase

##### `IMAGE_RELEASE_FEASIBILITY_RELATION` — Required behavior

> During contract evaluation for the compute phase, ImageReleaseFeasibilityOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - recovery frame recoveryGate is OPEN
>       - session frame sessionState is MONITORING
>       - image frame imageState is AVAILABLE
>       - release proposal is PROPOSED
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - recovery frame recoveryGate is not OPEN
>           - session frame sessionState is not MONITORING
>           - image frame imageState is not AVAILABLE
>       - release proposal is NOT PROPOSED.

### Requirements for ImageResultAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_IMAGE_FACTS` — Required behavior

> During contract evaluation for the initialization phase, ImageResultAssessment shall set image result facts to NO RESULT.

#### Contract clauses evaluated in the compute phase

##### `TOTAL_IMAGE_RESULT_ASSESSMENT` — Required behavior

> During contract evaluation for the compute phase, ImageResultAssessment shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - image feedback is NONE
>       - image result facts is NO RESULT
>   - All of the following conditions hold:
>     
>       - image feedback is GENERATED
>       - image result facts is AVAILABLE
>   - All of the following conditions hold:
>     
>       - image feedback is FAILED
>       - image result facts is FAILED
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - image feedback is INVALID RESULT
>           - image feedback is INVALID STATUS
>       - image result facts is INPUT FAULT.

### Requirements for PreparationAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PREPARATION_FACTS` — Required behavior

> During contract evaluation for the initialization phase, PreparationAssessment shall set preparation facts to INPUT FAULT.

#### Contract clauses evaluated in the compute phase

##### `TOTAL_PREPARATION_ASSESSMENT` — Required behavior

> During contract evaluation for the compute phase, PreparationAssessment shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - preparation observation is READY
>       - preparation facts is READY
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - preparation observation is NOT APPLIED
>           - preparation observation is CALIBRATION NOT PERFORMED
>       - preparation facts is NOT READY
>   - All of the following conditions hold:
>     
>       - preparation observation is CALIBRATION FAILED
>       - preparation facts is FAILED
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - preparation observation is INVALID BELT STATUS
>           - preparation observation is INVALID CALIBRATION STATUS
>       - preparation facts is INPUT FAULT.

### Requirements for PublicationComposition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PUBLIC_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, PublicationComposition shall set control frame acquisitionCommand to NO COMMAND, control frame imageCommand to NO COMMAND, status frame publicMode to IDLE, status frame selectedCause to NO ELIGIBLE WORK, status frame sessionState to IDLE, status frame cycleState to DORMANT, status frame imageState to EMPTY, status frame recoveryState to HEALTHY, status frame imageDisposition to WITHHELD, status frame dominantFault to NONE, and status frame multipleFaults to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `COMPLETE_COMMAND_MAPPING` — Required behavior

> During contract evaluation for the compute phase, PublicationComposition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - decision frame selectedAction is EMERGENCY HOLD
>           - decision frame selectedAction is STOP
>       - control frame acquisitionCommand is REQUEST STOP
>       - control frame imageCommand is NO COMMAND
>   - All of the following conditions hold:
>     
>       - decision frame selectedAction is START
>       - control frame acquisitionCommand is REQUEST START
>       - control frame imageCommand is NO COMMAND
>   - All of the following conditions hold:
>     
>       - decision frame selectedAction is COLLECT
>       - control frame acquisitionCommand is REQUEST COLLECTION
>       - control frame imageCommand is NO COMMAND
>   - All of the following conditions hold:
>     
>       - decision frame selectedAction is GENERATE IMAGE
>       - control frame acquisitionCommand is NO COMMAND
>       - control frame imageCommand is REQUEST GENERATION
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - decision frame selectedAction is RELEASE IMAGE
>           - decision frame selectedAction is HOLD
>       - control frame acquisitionCommand is NO COMMAND
>       - control frame imageCommand is NO COMMAND.

##### `COMPLETE_STATUS_MAPPING` — Required behavior

> During contract evaluation for the compute phase, PublicationComposition shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - status frame selectedCause is decision frame selectedCause
>   - status frame sessionState is decision frame sessionState
>   - status frame cycleState is decision frame cycleState
>   - status frame imageState is decision frame imageState
>   - status frame recoveryState is decision frame recoveryState
>   - status frame dominantFault is decision frame dominantFault
>   - status frame multipleFaults is true exactly when decision frame multipleFaults is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is RELEASE IMAGE
>           - status frame imageDisposition is AVAILABLE FOR ANALYSIS
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is not RELEASE IMAGE
>           - status frame imageDisposition is WITHHELD
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is EMERGENCY HOLD
>           - decision frame effectiveFaultPresent is true
>           - status frame publicMode is FAULT
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is EMERGENCY HOLD
>           - decision frame effectiveFaultPresent is true exactly when F is true
>           - status frame publicMode is RECOVERY
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is STOP
>           - status frame publicMode is IDLE
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is START
>           - status frame publicMode is STARTING
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is RELEASE IMAGE
>           - status frame publicMode is IMAGE AVAILABLE
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is GENERATE IMAGE
>           - status frame publicMode is IMAGING
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is COLLECT
>           - status frame publicMode is COLLECTING
>       - All of the following conditions hold:
>         
>           - decision frame selectedAction is HOLD
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - decision frame sessionState is MONITORING
>                   - status frame publicMode is MONITORING
>               - All of the following conditions hold:
>                 
>                   - decision frame sessionState is not MONITORING
>                   - status frame publicMode is IDLE.

### Requirements for RecoveryControl

#### Contract clauses evaluated in the initialization phase

May modify: recoveryMemory

##### `INITIAL_RECOVERY` — Required behavior

> During contract evaluation for the initialization phase, RecoveryControl shall set recoveryMemory to HEALTHY, recovery frame recoveryState to HEALTHY, recovery frame recoveryGate to OPEN, recovery frame recoveryCause to NONE, recovery frame effectiveFaultPresent to true exactly when F is true, recovery frame dominantFault to NONE, and recovery frame effectiveMultipleFaults to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: recoveryMemory

##### `RECOVERY_FRAME_STATE_AND_GATE` — Required behavior

> During contract evaluation for the compute phase, RecoveryControl shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recovery frame recoveryState is recoveryMemory
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recoveryMemory is HEALTHY
>           - recovery frame recoveryGate is OPEN
>       - All of the following conditions hold:
>         
>           - recoveryMemory is not HEALTHY
>           - recovery frame recoveryGate is CLOSED.

##### `EFFECTIVE_FAULT_COMPOSITION` — Required behavior

> During contract evaluation for the compute phase, RecoveryControl shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     recovery frame effectiveFaultPresent is true
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - fault summary faultPresent is true
>       - recovery event is INVALID RESET
>       - recovery event is INVALID STATUS
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     recovery frame effectiveMultipleFaults is true
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - fault summary multipleFaults is true
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - recovery event is INVALID RESET
>               - recovery event is INVALID STATUS
>           - fault summary faultPresent is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - recovery event is INVALID RESET
>               - recovery event is INVALID STATUS
>           - recovery frame dominantFault is RECOVERY INPUT
>       - All of the following conditions hold:
>         
>           - recovery event is not INVALID RESET
>           - recovery event is not INVALID STATUS
>           - recovery frame dominantFault is fault summary dominantFault.

##### `RECOVERY_CAUSE_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, RecoveryControl shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - recovery event is INVALID RESET
>           - recovery event is INVALID STATUS
>       - recovery frame recoveryCause is RECOVERY INPUT FAULT
>   - All of the following conditions hold:
>     
>       - recovery event is not INVALID RESET
>       - recovery event is not INVALID STATUS
>       - fault summary faultPresent is true
>       - recovery frame recoveryCause is LOCAL FAULT
>   - All of the following conditions hold:
>     
>       - recovery frame effectiveFaultPresent is true exactly when F is true
>       - recoveryMemory is LATCHED
>       - recovery frame recoveryCause is LATCHED
>   - All of the following conditions hold:
>     
>       - recovery frame effectiveFaultPresent is true exactly when F is true
>       - recoveryMemory is VERIFYING
>       - recovery frame recoveryCause is VERIFYING
>   - All of the following conditions hold:
>     
>       - recovery frame effectiveFaultPresent is true exactly when F is true
>       - recoveryMemory is HEALTHY
>       - recovery frame recoveryCause is NONE.

##### `CASE_01_FAULT_DOMINATES` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultPresent is true, recovery event is INVALID RESET, or recovery event is INVALID STATUS, RecoveryControl shall set recoveryMemory to LATCHED.

##### `CASE_02_HEALTHY_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultPresent is true exactly when F is true, recovery event is not INVALID RESET, recovery event is not INVALID STATUS, and the value of recoveryMemory on entry is HEALTHY, RecoveryControl shall set recoveryMemory to HEALTHY.

##### `CASE_03_RESET_TO_VERIFYING` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultPresent is true exactly when F is true, recovery event is not INVALID RESET, recovery event is not INVALID STATUS, the value of recoveryMemory on entry is LATCHED, and recovery event is RESET, RecoveryControl shall set recoveryMemory to VERIFYING.

##### `CASE_04_VERIFICATION_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultPresent is true exactly when F is true, recovery event is not INVALID RESET, recovery event is not INVALID STATUS, the value of recoveryMemory on entry is VERIFYING, and recovery event is VERIFY OK, RecoveryControl shall set recoveryMemory to HEALTHY.

##### `CASE_05_CLOSED_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 CLOSED STUTTER applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - fault summary faultPresent is true exactly when F is true
>   - recovery event is not INVALID RESET
>   - recovery event is not INVALID STATUS
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of recoveryMemory on entry is LATCHED
>           - recovery event is not RESET
>       - All of the following conditions hold:
>         
>           - the value of recoveryMemory on entry is VERIFYING
>           - recovery event is not VERIFY OK.

> When all applicability conditions are met, RecoveryControl shall produce a result for which all of the following conditions hold:
>
> recoveryMemory is the value of recoveryMemory on entry.

### Requirements for SessionControl

#### Contract clauses evaluated in the initialization phase

May modify: sessionMemory

##### `INITIAL_SESSION` — Required behavior

> During contract evaluation for the initialization phase, SessionControl shall set sessionMemory to IDLE, session frame sessionState to IDLE, session frame startAdmitted to true exactly when F is true, and session frame stopAdmitted to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: sessionMemory

##### `SESSION_FRAME_STATE` — Required behavior

> During contract evaluation for the compute phase, SessionControl shall set session frame sessionState to sessionMemory.

##### `CASE_06_CLOSED_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is CLOSED, SessionControl shall set sessionMemory to RECOVERY, session frame startAdmitted to true exactly when F is true, and session frame stopAdmitted to true exactly when F is true.

##### `CASE_07_RECOVERY_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN and the value of sessionMemory on entry is RECOVERY, SessionControl shall set sessionMemory to IDLE, session frame startAdmitted to true exactly when F is true, and session frame stopAdmitted to true exactly when F is true.

##### `CASE_08_IDLE_START` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of sessionMemory on entry is IDLE, and start feasibility is FEASIBLE, SessionControl shall produce a result for which sessionMemory is MONITORING, session frame startAdmitted is true, and session frame stopAdmitted is true exactly when F is true.

##### `CASE_09_IDLE_NO_START` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of sessionMemory on entry is IDLE, and start feasibility is not FEASIBLE, SessionControl shall set sessionMemory to IDLE, session frame startAdmitted to true exactly when F is true, and session frame stopAdmitted to true exactly when F is true.

##### `CASE_10_MONITORING_STOP` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of sessionMemory on entry is MONITORING, and request facts requestClass is STOP REQUEST, SessionControl shall produce a result for which sessionMemory is IDLE, session frame startAdmitted is true exactly when F is true, and session frame stopAdmitted is true.

##### `CASE_11_MONITORING_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, the value of sessionMemory on entry is MONITORING, and request facts requestClass is not STOP REQUEST, SessionControl shall set sessionMemory to MONITORING, session frame startAdmitted to true exactly when F is true, and session frame stopAdmitted to true exactly when F is true.

### Requirements for StartFeasibilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_START_NOT_FEASIBLE` — Required behavior

> During contract evaluation for the initialization phase, StartFeasibilityOwner shall set start feasibility to NOT FEASIBLE.

#### Contract clauses evaluated in the compute phase

##### `START_FEASIBILITY_RELATION` — Required behavior

> During contract evaluation for the compute phase, StartFeasibilityOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - request facts requestClass is START REQUEST
>       - preparation facts is READY
>       - equipment facts is READY
>       - recovery frame recoveryGate is OPEN
>       - start feasibility is FEASIBLE
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - request facts requestClass is not START REQUEST
>           - preparation facts is not READY
>           - equipment facts is not READY
>           - recovery frame recoveryGate is not OPEN
>       - start feasibility is NOT FEASIBLE.

### Requirements for SupervisoryArbitration

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DECISION_FRAME` — Required behavior

> During contract evaluation for the initialization phase, SupervisoryArbitration shall set decision frame selectedAction to HOLD, decision frame selectedCause to NO ELIGIBLE WORK, decision frame sessionState to IDLE, decision frame cycleState to DORMANT, decision frame imageState to EMPTY, decision frame recoveryState to HEALTHY, decision frame imageAvailable to true exactly when F is true, decision frame effectiveFaultPresent to true exactly when F is true, decision frame dominantFault to NONE, decision frame multipleFaults to true exactly when F is true, and decision frame recoveryGate to OPEN.

#### Contract clauses evaluated in the compute phase

##### `RECEIVED_DECISION_CONTEXT` — Required behavior

> During contract evaluation for the compute phase, SupervisoryArbitration shall set decision frame sessionState to session frame sessionState, decision frame cycleState to cycle frame cycleState, decision frame imageState to image frame imageState, decision frame recoveryState to recovery frame recoveryState, decision frame imageAvailable to true exactly when image frame imageState is AVAILABLE, decision frame effectiveFaultPresent to true exactly when recovery frame effectiveFaultPresent is true, decision frame dominantFault to recovery frame dominantFault, decision frame multipleFaults to true exactly when recovery frame effectiveMultipleFaults is true, and decision frame recoveryGate to recovery frame recoveryGate.

##### `CASE_24_EMERGENCY_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is CLOSED, SupervisoryArbitration shall set decision frame selectedAction to EMERGENCY HOLD and decision frame selectedCause to FAULT OR RECOVERY.

##### `CASE_25_STOP_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN and session frame stopAdmitted is true, SupervisoryArbitration shall set decision frame selectedAction to STOP and decision frame selectedCause to DOCTOR STOP.

##### `CASE_26_START_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, session frame stopAdmitted is true exactly when F is true, and session frame startAdmitted is true, SupervisoryArbitration shall set decision frame selectedAction to START and decision frame selectedCause to DOCTOR START.

##### `CASE_27_RELEASE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, session frame stopAdmitted is true exactly when F is true, session frame startAdmitted is true exactly when F is true, and release proposal is PROPOSED, SupervisoryArbitration shall set decision frame selectedAction to RELEASE IMAGE and decision frame selectedCause to IMAGE AVAILABLE.

##### `CASE_28_GENERATION_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, session frame stopAdmitted is true exactly when F is true, session frame startAdmitted is true exactly when F is true, release proposal is NOT PROPOSED, and image frame generateProposal is true, SupervisoryArbitration shall set decision frame selectedAction to GENERATE IMAGE and decision frame selectedCause to USABLE BATCH.

##### `CASE_29_COLLECTION_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, session frame stopAdmitted is true exactly when F is true, session frame startAdmitted is true exactly when F is true, release proposal is NOT PROPOSED, image frame generateProposal is true exactly when F is true, and collection proposal is PROPOSED, SupervisoryArbitration shall set decision frame selectedAction to COLLECT and decision frame selectedCause to READY TO COLLECT.

##### `CASE_30_HOLD_FALLTHROUGH` — Conditional behavior

> During contract evaluation for the compute phase, if recovery frame recoveryGate is OPEN, session frame stopAdmitted is true exactly when F is true, session frame startAdmitted is true exactly when F is true, release proposal is NOT PROPOSED, image frame generateProposal is true exactly when F is true, and collection proposal is NOT PROPOSED, SupervisoryArbitration shall set decision frame selectedAction to HOLD and decision frame selectedCause to NO ELIGIBLE WORK.
