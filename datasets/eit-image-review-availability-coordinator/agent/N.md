# EIT Image Review Availability Coordinator

## Selected system context

### Need, purpose, and operational context

NEED-01: A bounded logical system is needed to accept opaque upstream impedance-batch
events, coordinate an external EIT-image generation service, and expose only a matched
generated-image token for a Doctor's requested review session while making faults,
conflicts, and recovery observable.

PURPOSE-01: The EIT Image Review Availability Coordinator shall govern image-generation
work availability and Doctor review exposure; it shall not authorize monitoring,
supervise impedance acquisition, reconstruct image content, analyze an image, diagnose,
treat, or control physical patient equipment.

### Scope and system boundary

CTX-01: The Doctor is an external review requester and receives logical review
availability and workflow status, consistent only with the seed association to image
analysis; the coordinator neither performs analysis nor assigns exclusive clinical
authority.

CTX-02: The EngineerTechnician remains external nonparticipating context because the
selected scope excludes belt application and calibration. No image-generation or review
authority is inferred from the seed's preparation associations.

CTX-03: The Patient remains declared external context with no modeled input, output,
consent, sensing, or control interaction because the seed supplies no Patient/use-case
association.

CTX-04: The Upstream Impedance Batch Source emits at most one opaque batch event per
logical evaluation. It represents completed external acquisition only as an upstream
event and receives no command from this system.

CTX-05: The External EIT Image Generation Service receives a logical generation command,
reports at most one generation feedback event, and may issue a workflow-reset event. It
owns actual reconstruction and all content semantics, which remain outside this
abstract.

CTX-06: The Review Access Surface reports whether logical access is available and
receives the review-availability token for the Doctor. Presentation, storage, security,
and usability are outside the modeled boundary.

CTX-07: The source-named `EITSystem` actor is treated as unresolved vocabulary that may
encompass viewpoints represented by `CTX-04` or `CTX-05`; it is not silently equated to
this narrower coordinator or to the source's system boundary.

### Exact finite boundary inputs

MON-01: `batchEvent : BatchEvent` is supplied by `CTX-04` and has exactly
`{NO_BATCH_EVENT, INVALID_BATCH_EVENT, BATCH_A_AVAILABLE, BATCH_B_AVAILABLE}`. `A` and
`B` are opaque correlation tokens and carry no impedance value or quality meaning.

MON-02: `generatorFeedback : GeneratorFeedback` is supplied by `CTX-05` and has exactly
`{NO_GENERATOR_FEEDBACK, GENERATION_FAILED, IMAGE_A_GENERATED, IMAGE_B_GENERATED}`. A
generated label is an external event claim subject to matching policy, not evidence of
image correctness.

MON-03: `viewerObservation : ViewerObservation` is supplied by `CTX-06` and has exactly
`{VIEWER_OBSERVATION_INVALID, VIEWER_UNAVAILABLE, VIEWER_AVAILABLE}`.

MON-04: `doctorRequest : DoctorRequest` is supplied by `CTX-01` and has exactly
`{NO_DOCTOR_REQUEST, OPEN_AVAILABLE_IMAGE, CLOSE_REVIEW}`.

MON-05: `recoveryRequest : RecoveryRequest` is supplied by `CTX-05` and has exactly
`{NO_RECOVERY_REQUEST, RESET_GENERATION_WORKFLOW}`.

### Exact finite controlled outputs

CTRL-01: `generationCommand : GenerationCommand` is delivered to `CTX-05` and has
exactly `{NO_GENERATION_COMMAND, GENERATE_FROM_BATCH_A, GENERATE_FROM_BATCH_B}`. It is a
logical request and does not implement reconstruction or prove service response.

CTRL-02: `reviewAvailability : ReviewAvailability` is delivered to `CTX-06` for `CTX-01`
and has exactly `{NO_IMAGE_AVAILABLE, IMAGE_A_AVAILABLE_FOR_REVIEW,
IMAGE_B_AVAILABLE_FOR_REVIEW}`. No image content crosses this finite boundary.

CTRL-03: `workflowStatus : WorkflowStatus` is delivered to `CTX-01` and `CTX-05` as one
logical record containing the committed generation state, committed review state,
request disposition, and public notice. Shared status does not imply identical
presentation or responsibility.

### State, transition, priority, and recovery policy

MODE-01: `GENERATION_EMPTY` is externally distinguishable by no command, no
availability, and an idle status; it admits a usable fresh batch.

MODE-02: `GENERATING_A` and `GENERATING_B` are externally distinguishable by their
corresponding generation command and waiting status; Doctor open is inapplicable until a
matching result is committed.

MODE-03: `IMAGE_READY_A` and `IMAGE_READY_B` retain a matched opaque token with no
public availability until a fresh applicable Doctor open; a newer usable batch may
replace a closed ready slot only when no Doctor open wins that evaluation.

MODE-04: `GENERATION_BLOCKED` emits no generation command or availability and admits
only the selected fresh reset path; ordinary batch and Doctor-open work remains
rejected.

MODE-05: `REVIEWING_A` and `REVIEWING_B` are externally distinguishable by their
corresponding review-availability output; closing consumes the represented ready token
and returns both owners to empty/closed.

### Risks, mitigations, assumptions, and constraints

RISK-01: If failed, mismatched, or unexpected feedback were accepted as a matched image,
the Doctor-facing boundary could expose the wrong opaque token as available.

RISK-02: If a newer batch replaced an already ready token while the Doctor
simultaneously requested it, the requested token could become unavailable despite an
applicable review action.

RISK-03: If recovery automatically restarted generation or consumed a concurrent batch
on the clear evaluation, work could resume without a distinct post-recovery event.

ASM-01: `CTX-04` is responsible for presenting a non-`NO_BATCH_EVENT` value for one
logical evaluation and returning to `NO_BATCH_EVENT` before any later event. Rationale:
this defines freshness without adding hidden counters or identifiers.

ASM-02: `CTX-01` is responsible for presenting open or close as a one-evaluation request
separated by `NO_DOCTOR_REQUEST`; an inapplicable or preempted request must be freshly
reissued. The seed association motivates participation but not these request semantics.

ASM-03: `CTX-05` is responsible for one generator-feedback value and one reset-request
value per evaluation, returning each event input to its `NO_*` value before reissue.
`A/B` feedback correlation is an abstract service assertion, not content verification.

ASM-04: `CTX-06` is responsible only for a value within `ViewerObservation`; the
coordinator assumes no physical availability, security, display behavior, or usability
beyond that logical report.

ASM-05: External recipients shall not interpret batch usability, matched feedback,
generation command, image readiness, review availability, or status as evidence of
impedance accuracy, image quality, completed analysis, diagnosis, treatment, safety, or
certification.

## Supporting contract definitions

### State `EIT_Image_Review_Availability_Coordinator::GenerationSlotStateGovernor::committedGenerationState`

State `committedGenerationState` has type `EIT_Image_Review_Availability_Coordinator::GenerationState`.

### State `EIT_Image_Review_Availability_Coordinator::ReviewSessionStateGovernor::committedReviewState`

State `committedReviewState` has type `EIT_Image_Review_Availability_Coordinator::ReviewState`.

## Detailed behavioral requirements

### Requirements for AvailabilityPublicationPolicy

#### Contract clauses evaluated in the initialization phase

##### `INIT_PUBLICATION` — Required behavior

> During contract evaluation for the initialization phase, AvailabilityPublicationPolicy shall set reviewAvailability to NO IMAGE AVAILABLE, workflowStatus generationState to GENERATION EMPTY, workflowStatus reviewState to REVIEW CLOSED, workflowStatus disposition to NO REQUEST DISPOSITION, and workflowStatus notice to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_20_COORDINATED_PUBLICATION` — Conditional behavior

> During contract evaluation for the compute phase, AvailabilityPublicationPolicy shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - generationDecision nextState is IMAGE READY A
>       - reviewDecision nextState is REVIEWING A
>     
>     **Then:**
>     
>     reviewAvailability is IMAGE A AVAILABLE FOR REVIEW
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - generationDecision nextState is IMAGE READY B
>       - reviewDecision nextState is REVIEWING B
>     
>     **Then:**
>     
>     reviewAvailability is IMAGE B AVAILABLE FOR REVIEW
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - generationDecision nextState is IMAGE READY A
>           - reviewDecision nextState is REVIEWING A
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - generationDecision nextState is IMAGE READY B
>           - reviewDecision nextState is REVIEWING B
>     
>     **Then:**
>     
>     reviewAvailability is NO IMAGE AVAILABLE
>   - **If:**
>     
>     generationDecision nextState is GENERATION EMPTY
>     
>     **Then:**
>     
>     workflowStatus generationState is GENERATION EMPTY
>   - **If:**
>     
>     generationDecision nextState is GENERATING A
>     
>     **Then:**
>     
>     workflowStatus generationState is GENERATING A
>   - **If:**
>     
>     generationDecision nextState is GENERATING B
>     
>     **Then:**
>     
>     workflowStatus generationState is GENERATING B
>   - **If:**
>     
>     generationDecision nextState is IMAGE READY A
>     
>     **Then:**
>     
>     workflowStatus generationState is IMAGE READY A
>   - **If:**
>     
>     generationDecision nextState is IMAGE READY B
>     
>     **Then:**
>     
>     workflowStatus generationState is IMAGE READY B
>   - **If:**
>     
>     generationDecision nextState is GENERATION BLOCKED
>     
>     **Then:**
>     
>     workflowStatus generationState is GENERATION BLOCKED
>   - **If:**
>     
>     reviewDecision nextState is REVIEW CLOSED
>     
>     **Then:**
>     
>     workflowStatus reviewState is REVIEW CLOSED
>   - **If:**
>     
>     reviewDecision nextState is REVIEWING A
>     
>     **Then:**
>     
>     workflowStatus reviewState is REVIEWING A
>   - **If:**
>     
>     reviewDecision nextState is REVIEWING B
>     
>     **Then:**
>     
>     workflowStatus reviewState is REVIEWING B
>   - **If:**
>     
>     generationDecision disposition is NO REQUEST DISPOSITION
>     
>     **Then:**
>     
>     workflowStatus disposition is NO REQUEST DISPOSITION
>   - **If:**
>     
>     generationDecision disposition is ACCEPTED
>     
>     **Then:**
>     
>     workflowStatus disposition is ACCEPTED
>   - **If:**
>     
>     generationDecision disposition is REJECTED
>     
>     **Then:**
>     
>     workflowStatus disposition is REJECTED
>   - **If:**
>     
>     generationDecision disposition is PREEMPTED
>     
>     **Then:**
>     
>     workflowStatus disposition is PREEMPTED
>   - **If:**
>     
>     generationDecision disposition is RECOVERY APPLIED
>     
>     **Then:**
>     
>     workflowStatus disposition is RECOVERY APPLIED
>   - **If:**
>     
>     generationDecision notice is INVALID BATCH NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is INVALID BATCH
>   - **If:**
>     
>     generationDecision notice is GENERATOR BUSY NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is GENERATOR BUSY
>   - **If:**
>     
>     generationDecision notice is FEEDBACK FAULT NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is FEEDBACK FAULT
>   - **If:**
>     
>     generationDecision notice is RESET REJECTED NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is RESET REJECTED
>   - **If:**
>     
>     generationDecision notice is RESET CLEARED NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is RESET CLEARED
>   - **If:**
>     
>     generationDecision notice is VIEWER UNAVAILABLE NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is VIEWER UNAVAILABLE
>   - **If:**
>     
>     generationDecision notice is NO IMAGE READY NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is NO IMAGE READY
>   - **If:**
>     
>     generationDecision notice is IMAGE REPLACED NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is IMAGE REPLACED
>   - **If:**
>     
>     generationDecision notice is REQUEST PREEMPTED NOTICE
>     
>     **Then:**
>     
>     workflowStatus notice is REQUEST PREEMPTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - generationDecision notice is NO DECISION NOTICE
>           - generationDecision notice is IMAGE OPENED NOTICE
>           - generationDecision notice is IMAGE CLOSED NOTICE
>       - generationDecision nextState is GENERATION BLOCKED
>     
>     **Then:**
>     
>     workflowStatus notice is RECOVERY REQUIRED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - generationDecision notice is NO DECISION NOTICE
>           - generationDecision notice is IMAGE OPENED NOTICE
>           - generationDecision notice is IMAGE CLOSED NOTICE
>       - At least one of the following conditions holds:
>         
>           - generationDecision nextState is GENERATING A
>           - generationDecision nextState is GENERATING B
>     
>     **Then:**
>     
>     workflowStatus notice is WAITING FOR GENERATOR
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - generationDecision notice is NO DECISION NOTICE
>           - generationDecision notice is IMAGE OPENED NOTICE
>           - generationDecision notice is IMAGE CLOSED NOTICE
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - generationDecision nextState is IMAGE READY A
>               - reviewDecision nextState is REVIEWING A
>           - All of the following conditions hold:
>             
>               - generationDecision nextState is IMAGE READY B
>               - reviewDecision nextState is REVIEWING B
>     
>     **Then:**
>     
>     workflowStatus notice is IMAGE AVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - generationDecision notice is NO DECISION NOTICE
>           - generationDecision notice is IMAGE OPENED NOTICE
>           - generationDecision notice is IMAGE CLOSED NOTICE
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - generationDecision nextState is IMAGE READY A
>               - reviewDecision nextState is REVIEW CLOSED
>           - All of the following conditions hold:
>             
>               - generationDecision nextState is IMAGE READY B
>               - reviewDecision nextState is REVIEW CLOSED
>     
>     **Then:**
>     
>     workflowStatus notice is IMAGE READY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - generationDecision notice is NO DECISION NOTICE
>           - generationDecision notice is IMAGE OPENED NOTICE
>           - generationDecision notice is IMAGE CLOSED NOTICE
>       - generationDecision nextState is not GENERATION BLOCKED
>       - generationDecision nextState is not GENERATING A
>       - generationDecision nextState is not GENERATING B
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - generationDecision nextState is IMAGE READY A
>           - At least one of the following conditions holds:
>             
>               - reviewDecision nextState is REVIEW CLOSED
>               - reviewDecision nextState is REVIEWING A
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - generationDecision nextState is IMAGE READY B
>           - At least one of the following conditions holds:
>             
>               - reviewDecision nextState is REVIEW CLOSED
>               - reviewDecision nextState is REVIEWING B
>     
>     **Then:**
>     
>     workflowStatus notice is NONE.

### Requirements for AvailabilityWorkflowArbiter

#### Contract clauses evaluated in the initialization phase

##### `INIT_WORKFLOW_DECISION` — Required behavior

> During contract evaluation for the initialization phase, AvailabilityWorkflowArbiter shall set workflowDecision selectedAction to NO WORKFLOW ACTION, workflowDecision disposition to NO REQUEST DISPOSITION, and workflowDecision notice to NO DECISION NOTICE.

#### Contract clauses evaluated in the compute phase

##### `CASE_11_GENERATOR_AND_RECOVERY_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if generatorProposal proposal is not NO GENERATOR PROPOSAL or generatorProposal condition is RESET INAPPLICABLE, AvailabilityWorkflowArbiter shall produce a result for which if generatorProposal proposal is BLOCK GENERATION, then workflowDecision selectedAction is BLOCK ACTION, workflowDecision notice is FEEDBACK FAULT NOTICE, if doctorRequest is not NO DOCTOR REQUEST or batchAssessment usable is true exactly when T is true, then workflowDecision disposition is PREEMPTED, and if doctorRequest is NO DOCTOR REQUEST and batchAssessment usable is true exactly when F is true, then workflowDecision disposition is RECOVERY APPLIED, if generatorProposal proposal is ACCEPT IMAGE A, then workflowDecision selectedAction is ACCEPT IMAGE A ACTION, if doctorRequest is not NO DOCTOR REQUEST or batchAssessment usable is true exactly when T is true, then workflowDecision disposition is PREEMPTED and workflowDecision notice is REQUEST PREEMPTED NOTICE, and if doctorRequest is NO DOCTOR REQUEST and batchAssessment usable is true exactly when F is true, then workflowDecision disposition is ACCEPTED and workflowDecision notice is NO DECISION NOTICE, if generatorProposal proposal is ACCEPT IMAGE B, then workflowDecision selectedAction is ACCEPT IMAGE B ACTION, if doctorRequest is not NO DOCTOR REQUEST or batchAssessment usable is true exactly when T is true, then workflowDecision disposition is PREEMPTED and workflowDecision notice is REQUEST PREEMPTED NOTICE, and if doctorRequest is NO DOCTOR REQUEST and batchAssessment usable is true exactly when F is true, then workflowDecision disposition is ACCEPTED and workflowDecision notice is NO DECISION NOTICE, if generatorProposal proposal is CLEAR GENERATION BLOCK, then workflowDecision selectedAction is CLEAR BLOCK ACTION, workflowDecision notice is RESET CLEARED NOTICE, if doctorRequest is not NO DOCTOR REQUEST or batchAssessment usable is true exactly when T is true, then workflowDecision disposition is PREEMPTED, and if doctorRequest is NO DOCTOR REQUEST and batchAssessment usable is true exactly when F is true, then workflowDecision disposition is RECOVERY APPLIED, and if generatorProposal proposal is NO GENERATOR PROPOSAL and generatorProposal condition is RESET INAPPLICABLE, then workflowDecision selectedAction is NO WORKFLOW ACTION, workflowDecision disposition is REJECTED, and workflowDecision notice is RESET REJECTED NOTICE.

##### `CASE_12_DOCTOR_CLOSE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 DOCTOR CLOSE PRIORITY applies under all of the following conditions:
>
> generatorProposal proposal is NO GENERATOR PROPOSAL, generatorProposal condition is not RESET INAPPLICABLE, and doctorRequest is CLOSE REVIEW.

> When all applicability conditions are met, AvailabilityWorkflowArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - reviewPreState is REVIEWING A
>           - reviewPreState is REVIEWING B
>       - batchAssessment usable is true exactly when T is true
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is CLOSE REVIEW ACTION
>       - workflowDecision disposition is PREEMPTED
>       - workflowDecision notice is REQUEST PREEMPTED NOTICE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - reviewPreState is REVIEWING A
>           - reviewPreState is REVIEWING B
>       - batchAssessment usable is true exactly when F is true
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is CLOSE REVIEW ACTION
>       - workflowDecision disposition is ACCEPTED
>       - workflowDecision notice is IMAGE CLOSED NOTICE
>   - **If:**
>     
>     reviewPreState is REVIEW CLOSED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is NO WORKFLOW ACTION
>       - workflowDecision disposition is REJECTED
>       - workflowDecision notice is NO IMAGE READY NOTICE.

##### `CASE_13_DOCTOR_OPEN_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if generatorProposal proposal is NO GENERATOR PROPOSAL, generatorProposal condition is not RESET INAPPLICABLE, and doctorRequest is OPEN AVAILABLE IMAGE, AvailabilityWorkflowArbiter shall produce a result for which if generationPreState is IMAGE READY A, reviewPreState is REVIEW CLOSED, viewerAssessment accessible is true exactly when T is true, and batchAssessment usable is true exactly when T is true, then workflowDecision selectedAction is OPEN IMAGE A ACTION, workflowDecision disposition is PREEMPTED, and workflowDecision notice is REQUEST PREEMPTED NOTICE, if generationPreState is IMAGE READY B, reviewPreState is REVIEW CLOSED, viewerAssessment accessible is true exactly when T is true, and batchAssessment usable is true exactly when T is true, then workflowDecision selectedAction is OPEN IMAGE B ACTION, workflowDecision disposition is PREEMPTED, and workflowDecision notice is REQUEST PREEMPTED NOTICE, if generationPreState is IMAGE READY A, reviewPreState is REVIEW CLOSED, viewerAssessment accessible is true exactly when T is true, and batchAssessment usable is true exactly when F is true, then workflowDecision selectedAction is OPEN IMAGE A ACTION, workflowDecision disposition is ACCEPTED, and workflowDecision notice is IMAGE OPENED NOTICE, if generationPreState is IMAGE READY B, reviewPreState is REVIEW CLOSED, viewerAssessment accessible is true exactly when T is true, and batchAssessment usable is true exactly when F is true, then workflowDecision selectedAction is OPEN IMAGE B ACTION, workflowDecision disposition is ACCEPTED, and workflowDecision notice is IMAGE OPENED NOTICE, if viewerAssessment accessible is true exactly when F is true, then workflowDecision selectedAction is NO WORKFLOW ACTION, workflowDecision disposition is REJECTED, and workflowDecision notice is VIEWER UNAVAILABLE NOTICE, and if viewerAssessment accessible is true exactly when T is true, it is not the case that generationPreState is IMAGE READY A and reviewPreState is REVIEW CLOSED, and it is not the case that generationPreState is IMAGE READY B and reviewPreState is REVIEW CLOSED, then workflowDecision selectedAction is NO WORKFLOW ACTION, workflowDecision disposition is REJECTED, and workflowDecision notice is NO IMAGE READY NOTICE.

##### `CASE_14_BATCH_OR_IDLE_POLICY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 14 BATCH OR IDLE POLICY applies under all of the following conditions:
>
> generatorProposal proposal is NO GENERATOR PROPOSAL, generatorProposal condition is not RESET INAPPLICABLE, and doctorRequest is NO DOCTOR REQUEST.

> When all applicability conditions are met, AvailabilityWorkflowArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     batchAssessment batchCategory is NO BATCH
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is NO WORKFLOW ACTION
>       - workflowDecision disposition is NO REQUEST DISPOSITION
>       - workflowDecision notice is NO DECISION NOTICE
>   - **If:**
>     
>     batchAssessment batchCategory is INVALID BATCH
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is NO WORKFLOW ACTION
>       - workflowDecision disposition is REJECTED
>       - workflowDecision notice is INVALID BATCH NOTICE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batchAssessment usable is true exactly when T is true
>       - reviewPreState is REVIEW CLOSED
>       - generationPreState is GENERATION EMPTY
>       - batchAssessment batchCategory is USABLE BATCH A
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is START BATCH A ACTION
>       - workflowDecision disposition is ACCEPTED
>       - workflowDecision notice is NO DECISION NOTICE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batchAssessment usable is true exactly when T is true
>       - reviewPreState is REVIEW CLOSED
>       - generationPreState is GENERATION EMPTY
>       - batchAssessment batchCategory is USABLE BATCH B
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is START BATCH B ACTION
>       - workflowDecision disposition is ACCEPTED
>       - workflowDecision notice is NO DECISION NOTICE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batchAssessment usable is true exactly when T is true
>       - reviewPreState is REVIEW CLOSED
>       - At least one of the following conditions holds:
>         
>           - generationPreState is IMAGE READY A
>           - generationPreState is IMAGE READY B
>       - batchAssessment batchCategory is USABLE BATCH A
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is START BATCH A ACTION
>       - workflowDecision disposition is ACCEPTED
>       - workflowDecision notice is IMAGE REPLACED NOTICE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batchAssessment usable is true exactly when T is true
>       - reviewPreState is REVIEW CLOSED
>       - At least one of the following conditions holds:
>         
>           - generationPreState is IMAGE READY A
>           - generationPreState is IMAGE READY B
>       - batchAssessment batchCategory is USABLE BATCH B
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is START BATCH B ACTION
>       - workflowDecision disposition is ACCEPTED
>       - workflowDecision notice is IMAGE REPLACED NOTICE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batchAssessment usable is true exactly when T is true
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - reviewPreState is REVIEW CLOSED
>           - At least one of the following conditions holds:
>             
>               - generationPreState is GENERATION EMPTY
>               - generationPreState is IMAGE READY A
>               - generationPreState is IMAGE READY B
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - workflowDecision selectedAction is NO WORKFLOW ACTION
>       - workflowDecision disposition is REJECTED
>       - workflowDecision notice is GENERATOR BUSY NOTICE.

### Requirements for BatchQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_BATCH_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, BatchQualificationOwner shall set batchAssessment batchCategory to NO BATCH and batchAssessment usable to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_NO_OR_INVALID_BATCH` — Conditional behavior

> During contract evaluation for the compute phase, if batchEvent is NO BATCH EVENT or batchEvent is INVALID BATCH EVENT, BatchQualificationOwner shall produce a result for which if batchEvent is NO BATCH EVENT, then batchAssessment batchCategory is NO BATCH and batchAssessment usable is true exactly when F is true and if batchEvent is INVALID BATCH EVENT, then batchAssessment batchCategory is INVALID BATCH and batchAssessment usable is true exactly when F is true.

##### `CASE_02_BATCH_A_USABLE` — Conditional behavior

> During contract evaluation for the compute phase, if batchEvent is BATCH A AVAILABLE, BatchQualificationOwner shall set batchAssessment batchCategory to USABLE BATCH A and batchAssessment usable to true exactly when T is true.

##### `CASE_03_BATCH_B_USABLE` — Conditional behavior

> During contract evaluation for the compute phase, if batchEvent is BATCH B AVAILABLE, BatchQualificationOwner shall set batchAssessment batchCategory to USABLE BATCH B and batchAssessment usable to true exactly when T is true.

### Requirements for GenerationCommandPolicy

#### Contract clauses evaluated in the initialization phase

##### `INIT_GENERATION_COMMAND` — Required behavior

> During contract evaluation for the initialization phase, GenerationCommandPolicy shall set generationCommand to NO GENERATION COMMAND.

#### Contract clauses evaluated in the compute phase

##### `CASE_19_COMMITTED_STATE_COMMAND` — Conditional behavior

> During contract evaluation for the compute phase, GenerationCommandPolicy shall produce a result for which if generationDecision nextState is GENERATING A, then generationCommand is GENERATE FROM BATCH A, if generationDecision nextState is GENERATING B, then generationCommand is GENERATE FROM BATCH B, and if generationDecision nextState is not GENERATING A and generationDecision nextState is not GENERATING B, then generationCommand is NO GENERATION COMMAND.

### Requirements for GenerationSlotStateGovernor

#### Contract clauses evaluated in the initialization phase

##### `INIT_GENERATION_SLOT` — Required behavior

> During contract evaluation for the initialization phase, GenerationSlotStateGovernor shall set committedGenerationState to GENERATION EMPTY, generationPreState to GENERATION EMPTY, generationDecision preState to GENERATION EMPTY, generationDecision nextState to GENERATION EMPTY, generationDecision selectedAction to NO WORKFLOW ACTION, generationDecision disposition to NO REQUEST DISPOSITION, and generationDecision notice to NO DECISION NOTICE.

#### Contract clauses evaluated in the compute phase

##### `PUBLISH_GENERATION_PRE_STATE` — Required behavior

> During contract evaluation for the compute phase, GenerationSlotStateGovernor shall set generationPreState to the value of committedGenerationState on entry.

##### `PROJECT_GENERATION_SNAPSHOT` — Required behavior

> During contract evaluation for the compute phase, GenerationSlotStateGovernor shall produce a result for which if the value of committedGenerationState on entry is GENERATION EMPTY, then generationDecision preState is GENERATION EMPTY, if the value of committedGenerationState on entry is GENERATING A, then generationDecision preState is GENERATING A, if the value of committedGenerationState on entry is GENERATING B, then generationDecision preState is GENERATING B, if the value of committedGenerationState on entry is IMAGE READY A, then generationDecision preState is IMAGE READY A, if the value of committedGenerationState on entry is IMAGE READY B, then generationDecision preState is IMAGE READY B, if the value of committedGenerationState on entry is GENERATION BLOCKED, then generationDecision preState is GENERATION BLOCKED, if committedGenerationState is GENERATION EMPTY, then generationDecision nextState is GENERATION EMPTY, if committedGenerationState is GENERATING A, then generationDecision nextState is GENERATING A, if committedGenerationState is GENERATING B, then generationDecision nextState is GENERATING B, if committedGenerationState is IMAGE READY A, then generationDecision nextState is IMAGE READY A, if committedGenerationState is IMAGE READY B, then generationDecision nextState is IMAGE READY B, if committedGenerationState is GENERATION BLOCKED, then generationDecision nextState is GENERATION BLOCKED, generationDecision selectedAction is workflowDecision selectedAction, generationDecision disposition is workflowDecision disposition, and generationDecision notice is workflowDecision notice.

##### `CASE_15_GENERATION_MUTATION` — Conditional behavior

> During contract evaluation for the compute phase, if workflowDecision selectedAction is START BATCH A ACTION, workflowDecision selectedAction is START BATCH B ACTION, workflowDecision selectedAction is ACCEPT IMAGE A ACTION, workflowDecision selectedAction is ACCEPT IMAGE B ACTION, workflowDecision selectedAction is BLOCK ACTION, workflowDecision selectedAction is CLEAR BLOCK ACTION, or workflowDecision selectedAction is CLOSE REVIEW ACTION, GenerationSlotStateGovernor shall produce a result for which if workflowDecision selectedAction is START BATCH A ACTION, then committedGenerationState is GENERATING A, if workflowDecision selectedAction is START BATCH B ACTION, then committedGenerationState is GENERATING B, if workflowDecision selectedAction is ACCEPT IMAGE A ACTION, then committedGenerationState is IMAGE READY A, if workflowDecision selectedAction is ACCEPT IMAGE B ACTION, then committedGenerationState is IMAGE READY B, if workflowDecision selectedAction is BLOCK ACTION, then committedGenerationState is GENERATION BLOCKED, if workflowDecision selectedAction is CLEAR BLOCK ACTION, then committedGenerationState is GENERATION EMPTY, and if workflowDecision selectedAction is CLOSE REVIEW ACTION, then committedGenerationState is GENERATION EMPTY.

##### `CASE_16_GENERATION_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if workflowDecision selectedAction is NO WORKFLOW ACTION, workflowDecision selectedAction is OPEN IMAGE A ACTION, or workflowDecision selectedAction is OPEN IMAGE B ACTION, GenerationSlotStateGovernor shall preserve the value of committedGenerationState on entry.

### Requirements for GeneratorFeedbackQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_FEEDBACK_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, GeneratorFeedbackQualificationOwner shall set feedbackAssessment condition to NO RESULT and feedbackAssessment matched to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `CASE_04_NO_GENERATOR_RESULT` — Conditional behavior

> During contract evaluation for the compute phase, if generatorFeedback is NO GENERATOR FEEDBACK, GeneratorFeedbackQualificationOwner shall set feedbackAssessment condition to NO RESULT and feedbackAssessment matched to true exactly when F is true.

##### `CASE_05_EXACT_MATCHED_RESULT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 EXACT MATCHED RESULT applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - generatorFeedback is IMAGE A GENERATED
>       - generationPreState is GENERATING A
>   - All of the following conditions hold:
>     
>       - generatorFeedback is IMAGE B GENERATED
>       - generationPreState is GENERATING B.

> When all applicability conditions are met, GeneratorFeedbackQualificationOwner shall produce a result for which all of the following conditions hold:
>
> if generatorFeedback is IMAGE A GENERATED, then feedbackAssessment condition is MATCHED IMAGE A and feedbackAssessment matched is true exactly when T is true and if generatorFeedback is IMAGE B GENERATED, then feedbackAssessment condition is MATCHED IMAGE B and feedbackAssessment matched is true exactly when T is true.

##### `CASE_06_FAILED_MISMATCHED_OR_UNEXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, if generatorFeedback is not NO GENERATOR FEEDBACK, it is not the case that generatorFeedback is IMAGE A GENERATED and generationPreState is GENERATING A, and it is not the case that generatorFeedback is IMAGE B GENERATED and generationPreState is GENERATING B, GeneratorFeedbackQualificationOwner shall set feedbackAssessment condition to FEEDBACK FAULT and feedbackAssessment matched to true exactly when F is true.

### Requirements for GeneratorOutcomeRecoveryOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_GENERATOR_PROPOSAL` — Required behavior

> During contract evaluation for the initialization phase, GeneratorOutcomeRecoveryOwner shall set generatorProposal proposal to NO GENERATOR PROPOSAL and generatorProposal condition to NO PROPOSAL CONDITION.

#### Contract clauses evaluated in the compute phase

##### `CASE_09_CURRENT_FEEDBACK_PROPOSAL` — Conditional behavior

> During contract evaluation for the compute phase, if feedbackAssessment condition is not NO RESULT, GeneratorOutcomeRecoveryOwner shall produce a result for which if feedbackAssessment condition is MATCHED IMAGE A, then generatorProposal proposal is ACCEPT IMAGE A and generatorProposal condition is MATCHED COMPLETION, if feedbackAssessment condition is MATCHED IMAGE B, then generatorProposal proposal is ACCEPT IMAGE B and generatorProposal condition is MATCHED COMPLETION, and if feedbackAssessment condition is FEEDBACK FAULT, then generatorProposal proposal is BLOCK GENERATION and generatorProposal condition is FEEDBACK REJECTED.

##### `CASE_10_NO_RESULT_RESET_POLICY` — Conditional behavior

> During contract evaluation for the compute phase, if feedbackAssessment condition is NO RESULT, GeneratorOutcomeRecoveryOwner shall produce a result for which if recoveryRequest is RESET GENERATION WORKFLOW and generationPreState is GENERATION BLOCKED, then generatorProposal proposal is CLEAR GENERATION BLOCK and generatorProposal condition is RESET APPLICABLE, if recoveryRequest is RESET GENERATION WORKFLOW and generationPreState is not GENERATION BLOCKED, then generatorProposal proposal is NO GENERATOR PROPOSAL and generatorProposal condition is RESET INAPPLICABLE, and if recoveryRequest is NO RECOVERY REQUEST, then generatorProposal proposal is NO GENERATOR PROPOSAL and generatorProposal condition is NO PROPOSAL CONDITION.

### Requirements for ReviewAccessQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_VIEWER_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, ReviewAccessQualificationOwner shall set viewerAssessment condition to REVIEW ACCESS UNAVAILABLE and viewerAssessment accessible to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `CASE_07_VIEWER_AVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if viewerObservation is VIEWER AVAILABLE, ReviewAccessQualificationOwner shall set viewerAssessment condition to REVIEW ACCESS AVAILABLE and viewerAssessment accessible to true exactly when T is true.

##### `CASE_08_VIEWER_NOT_ACCESSIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if viewerObservation is VIEWER OBSERVATION INVALID or viewerObservation is VIEWER UNAVAILABLE, ReviewAccessQualificationOwner shall set viewerAssessment condition to REVIEW ACCESS UNAVAILABLE and viewerAssessment accessible to true exactly when F is true.

### Requirements for ReviewSessionStateGovernor

#### Contract clauses evaluated in the initialization phase

##### `INIT_REVIEW_SESSION` — Required behavior

> During contract evaluation for the initialization phase, ReviewSessionStateGovernor shall set committedReviewState to REVIEW CLOSED, reviewPreState to REVIEW CLOSED, reviewDecision preState to REVIEW CLOSED, and reviewDecision nextState to REVIEW CLOSED.

#### Contract clauses evaluated in the compute phase

##### `PUBLISH_REVIEW_PRE_STATE` — Required behavior

> During contract evaluation for the compute phase, ReviewSessionStateGovernor shall set reviewPreState to the value of committedReviewState on entry.

##### `PROJECT_REVIEW_SNAPSHOT` — Required behavior

> During contract evaluation for the compute phase, ReviewSessionStateGovernor shall produce a result for which if the value of committedReviewState on entry is REVIEW CLOSED, then reviewDecision preState is REVIEW CLOSED, if the value of committedReviewState on entry is REVIEWING A, then reviewDecision preState is REVIEWING A, if the value of committedReviewState on entry is REVIEWING B, then reviewDecision preState is REVIEWING B, if committedReviewState is REVIEW CLOSED, then reviewDecision nextState is REVIEW CLOSED, if committedReviewState is REVIEWING A, then reviewDecision nextState is REVIEWING A, and if committedReviewState is REVIEWING B, then reviewDecision nextState is REVIEWING B.

##### `CASE_17_REVIEW_MUTATION` — Conditional behavior

> During contract evaluation for the compute phase, if workflowDecision selectedAction is OPEN IMAGE A ACTION, workflowDecision selectedAction is OPEN IMAGE B ACTION, workflowDecision selectedAction is CLOSE REVIEW ACTION, workflowDecision selectedAction is BLOCK ACTION, workflowDecision selectedAction is CLEAR BLOCK ACTION, workflowDecision selectedAction is START BATCH A ACTION, or workflowDecision selectedAction is START BATCH B ACTION, ReviewSessionStateGovernor shall produce a result for which if workflowDecision selectedAction is OPEN IMAGE A ACTION, then committedReviewState is REVIEWING A, if workflowDecision selectedAction is OPEN IMAGE B ACTION, then committedReviewState is REVIEWING B, and if workflowDecision selectedAction is CLOSE REVIEW ACTION, workflowDecision selectedAction is BLOCK ACTION, workflowDecision selectedAction is CLEAR BLOCK ACTION, workflowDecision selectedAction is START BATCH A ACTION, or workflowDecision selectedAction is START BATCH B ACTION, then committedReviewState is REVIEW CLOSED.

##### `CASE_18_REVIEW_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if workflowDecision selectedAction is NO WORKFLOW ACTION, workflowDecision selectedAction is ACCEPT IMAGE A ACTION, or workflowDecision selectedAction is ACCEPT IMAGE B ACTION, ReviewSessionStateGovernor shall preserve the value of committedReviewState on entry.
