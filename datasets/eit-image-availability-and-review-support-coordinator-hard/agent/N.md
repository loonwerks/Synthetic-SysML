# EIT image availability and review-support coordinator

## Selected system context

### Need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A bounded coordinator is needed to
decide when an externally generated EIT image may be made available for Doctor analysis,
when it must remain quarantined or be withdrawn, and how review availability is safely
re-enabled after invalid or failed supporting evidence.

PURPOSE-01: [Pilot abstraction] For each logical evaluation, the system shall qualify
upstream image, Doctor review, preparation-context, and availability-service
observations; propagate faults into an independent recovery lifecycle; retain separate
evidence, artifact, and review lifecycles; arbitrate competing admission, withdrawal,
rejection, closure, opening, and offer proposals; and publish one upstream disposition
plus one Doctor-facing availability frame.

GOAL-01: [Pilot abstraction] Every finite input and pre-state combination shall match
exactly one ordered case at each case-bearing owner and shall yield exactly one selected
action.

GOAL-02: [Pilot abstraction] A generated-image event shall be admitted only when
externally reported preparation context is complete, the availability service is ready,
and recovery is open; admission means catalog acceptance only, not image correctness.

GOAL-03: [Pilot abstraction] Invalid evidence or a reported upstream,
preparation-context, or availability-service failure shall close review availability in
the same evaluation and shall dominate ordinary work.

GOAL-04: [Pilot abstraction] Recovery shall require three distinct fresh events—`RESET`,
then `VERIFY_OK`, then `RESUME`—and all operational owners shall return to neutral on
reopening so that later fresh image and Doctor events are required.

GOAL-05: [Selected architecture] Fault recovery, evidence state, artifact state, and
review state shall have different owners; admission, current availability, presentation
intent, selected action, and public composition shall each have one nonduplicated
decision owner.

GOAL-06: [Pilot abstraction] Ordinary simultaneous proposals shall follow an observable
priority: withdrawal, rejection, Doctor closure, new-image acceptance, Doctor opening or
offer, then hold, all below fault or closed-recovery withholding.

### Operational context and selected system boundary

CTX-01: [Selected boundary] The modeled system begins when an external viewpoint reports
an EIT image-generation event. It manages catalog admission and Doctor-facing analysis
availability; it does not initiate monitoring, authorize acquisition, collect impedance
data, or generate an image.

CTX-DOC-01: [Seed-grounded entity with pilot responsibility] The Doctor supplies a
status-bearing review event and consumes an availability frame. The assigned event
semantics are a pilot responsibility and do not imply automated analysis or exclusive
clinical authority.

CTX-TECH-01: [Seed-grounded entity with pilot responsibility] The EngineerTechnician
supplies a finite preparation-context observation and recovery events. These
responsibilities are assumptions chosen from the seed vocabulary, not facts implied by
actor association.

CTX-PAT-01: [Seed-grounded entity; informational] The Patient remains external context
and has no modeled input or output because the source declares no Patient association
and supplies no patient sensing, consent, control, or outcome semantics.

CTX-EIT-01: [Resolution of seed ambiguity] The source's `EITSystem` actor is treated as
an external image-producing and catalog-enabling viewpoint distinct from this
coordinator. It supplies image-generation and service observations and consumes catalog
dispositions; this viewpoint is selected rather than source-mandated.

CTX-RECIP-01: [Selected boundary] The Doctor is the sole modeled recipient of analysis
availability. Availability means that the abstract image item may be presented for human
analysis, not that analysis occurred or that the image is clinically usable.

MON-IMG-01: [Pilot abstraction] Root input `imageSignal` is
`ImageSignal={NONE,GENERATED,REVOKED,UPSTREAM_FAILURE,INVALID_A,INVALID_B}` supplied by
`CTX-EIT-01`; each non-`NONE` value is a fresh event for one evaluation.

MON-DOC-01: [Pilot abstraction] Root input `doctorSignal` is
`DoctorSignal={NONE,REQUEST_VIEW,ACK_VIEW,DISMISS_VIEW,INVALID_A,INVALID_B}` supplied by
`CTX-DOC-01`; acknowledgement records only receipt, and dismissal records only a request
to close presentation.

MON-CTX-01: [Pilot abstraction] Root input `preparationContext` is
`PreparationContext={NO_REPORT,BELT_REPORTED,CALIBRATION_REPORTED,BELT_AND_CALIBRATION_REPORTED,REPORTED_FAILURE,INVALID_A,INVALID_B}`
supplied by `CTX-TECH-01`. Reports are administrative context and do not certify belt
placement or calibration correctness.

MON-SVC-01: [Pilot abstraction] Root input `availabilityService` is
`ServiceObservation={READY,DEGRADED,FAILED,INVALID_A,INVALID_B}` supplied by
`CTX-EIT-01`; it describes the abstract catalog/presentation path, not physical
performance or uptime.

MON-REC-01: [Pilot abstraction] Root input `recoveryEvent` is
`RecoveryEvent={NONE,RESET,VERIFY_OK,RESUME,INVALID_A,INVALID_B}` supplied by
`CTX-TECH-01`; each non-`NONE` value is fresh and has meaning only in its matching
recovery phase.

CTRL-UP-01: [Pilot abstraction] Root output `upstreamDisposition` is
`UpstreamDisposition={NO_ACTION,ACCEPT_IMAGE,REJECT_IMAGE,ACK_WITHDRAWN,PAUSE_DELIVERY}`
consumed by `CTX-EIT-01`. It controls only this coordinator's catalog treatment and
never commands image generation or acquisition.

CTRL-DOC-01: [Pilot abstraction] Root output `analysisAvailability` is a flat
`AvailabilityFrame=(publicMode,visibility,reason,recoveryState,evidenceState,artifactState,reviewState,faultPresent,dominantFault,multipleFaults)`
consumed by `CTX-DOC-01`; `visibility` is `Visibility={HIDDEN,OFFERED,VISIBLE,CLOSED}`.

### Finite types, assumptions, and constraints

ASM-STEP-01: [Pilot abstraction] An evaluation is a deterministic ordered logical step
with no duration claim. Owners consume one coherent boundary snapshot plus their
declared pre-state, and acyclic downstream owners consume the resulting upstream facts
or frames within that evaluation.

ASM-FRESH-01: [Pilot abstraction] `CTX-DOC-01`, `CTX-TECH-01`, and `CTX-EIT-01` are
responsible for presenting non-`NONE` events for exactly one evaluation and not
replaying them as fresh events.

ASM-CONTEXT-01: [Pilot abstraction] `CTX-TECH-01` is responsible only for truthfully
supplying its declared administrative report. The coordinator neither performs nor
verifies belt application or calibration.

ASM-SERVICE-01: [Pilot abstraction] `CTX-EIT-01` is responsible for service and
generated-image observations and for acting on catalog dispositions. Issuing
`ACCEPT_IMAGE`, `REJECT_IMAGE`, or `ACK_WITHDRAWN` does not establish that an external
action succeeded.

ASM-SINGLE-01: [Pilot abstraction] The finite model represents at most one abstract
image item and one Doctor review presentation. It has no identifiers, queues,
timestamps, image pixels, measurements, multiple patients, or concurrent image
collection.

ASM-REC-01: [Pilot abstraction] `RESET`, `VERIFY_OK`, and `RESUME` must occur on three
later evaluations in that order after a latch. On the reopening `RESUME` evaluation,
evidence, artifact, and review owners return to neutral and ignore concurrent
operational events; later fresh `GENERATED` and `REQUEST_VIEW` events are required.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, retained state is exactly
`HEALTHY/EMPTY/EMPTY/IDLE`, `upstreamDisposition=NO_ACTION`, and
`analysisAvailability=(publicMode=IDLE,visibility=HIDDEN,reason=NO_ELIGIBLE_WORK,recoveryState=HEALTHY,evidenceState=EMPTY,artifactState=EMPTY,reviewState=IDLE,faultPresent=false,dominantFault=NONE,multipleFaults=false)`.
This is deterministic experiment initialization, not a physical safe-start or
safety-certification claim.

### Risks, fault propagation, recovery, priority, and composition

RISK-01: [Pilot risk] Invalid or failed support evidence could otherwise make an
external image appear available for Doctor analysis; the consequence is false
availability within this abstract coordination system, not a claimed clinical harm.

RISK-02: [Pilot risk] A one-event recovery could restore a previously staged artifact or
replay work accepted on the reopening evaluation; the consequence is availability
without fresh post-recovery evidence.

RISK-03: [Pilot risk] Simultaneous withdrawal, rejection, closure, acceptance, and
presentation proposals could otherwise yield inconsistent upstream and Doctor-facing
outputs.

### Modes and transitions

MODE-01: [Externally distinguishable public modes] `FAULT` and `RECOVERY` hide
availability and pause upstream delivery; `QUARANTINED` hides a rejected artifact;
`STAGED` or `OFFERED` may expose an offer; `VIEWING` exposes visible availability;
`CLOSED` records a just-processed closure; and `IDLE` exposes no item.

## Supporting contract definitions

### State `EIT_Image_Availability_Coordinator::ArtifactLifecycle::artifact`

State `artifact` has type `EIT_Image_Availability_Coordinator::ArtifactState`.

### State `EIT_Image_Availability_Coordinator::EvidenceLifecycle::evidence`

State `evidence` has type `EIT_Image_Availability_Coordinator::EvidenceState`.

### State `EIT_Image_Availability_Coordinator::RecoveryControl::recovery`

State `recovery` has type `EIT_Image_Availability_Coordinator::RecoveryState`.

### State `EIT_Image_Availability_Coordinator::ReviewLifecycle::review`

State `review` has type `EIT_Image_Availability_Coordinator::ReviewState`.

## Detailed behavioral requirements

### Requirements for AdmissionDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_ADMISSION` — Required behavior

> During contract evaluation for the initialization phase, AdmissionDecisionOwner shall set admissionFrame outcome to NONE and admissionFrame admissionReason to NO CANDIDATE.

#### Contract clauses evaluated in the compute phase

##### `ADMISSION_POLICY` — Required behavior

> During contract evaluation for the compute phase, AdmissionDecisionOwner shall produce a result for which if it is not the case that recoveryFrame recoveryOpen is true, then admissionFrame outcome is NONE and admissionFrame admissionReason is RECOVERY CLOSED, if recoveryFrame recoveryOpen is true and imageFacts is not NEW IMAGE, then admissionFrame outcome is NONE and admissionFrame admissionReason is NO CANDIDATE, if recoveryFrame recoveryOpen is true, imageFacts is NEW IMAGE, and evidenceFrame evidenceState is REJECTED, then admissionFrame outcome is REJECT and admissionFrame admissionReason is EVIDENCE INCOMPLETE, if recoveryFrame recoveryOpen is true, imageFacts is NEW IMAGE, evidenceFrame evidenceState is ACCEPTED, contextFacts is COMPLETE CONTEXT, and serviceFacts is READY, then admissionFrame outcome is ADMIT and admissionFrame admissionReason is ELIGIBLE, if recoveryFrame recoveryOpen is true, imageFacts is NEW IMAGE, evidenceFrame evidenceState is not REJECTED, it is not the case that evidenceFrame evidenceState is ACCEPTED, contextFacts is COMPLETE CONTEXT, and serviceFacts is READY, and serviceFacts is DEGRADED, then admissionFrame outcome is QUARANTINE and admissionFrame admissionReason is SERVICE DEGRADED, and if recoveryFrame recoveryOpen is true, imageFacts is NEW IMAGE, evidenceFrame evidenceState is not REJECTED, it is not the case that evidenceFrame evidenceState is ACCEPTED, contextFacts is COMPLETE CONTEXT, and serviceFacts is READY, and serviceFacts is not DEGRADED, then admissionFrame outcome is NONE and admissionFrame admissionReason is NO CANDIDATE.

### Requirements for ArtifactLifecycle

#### Contract clauses evaluated in the initialization phase

##### `INIT_ARTIFACT` — Required behavior

> During contract evaluation for the initialization phase, ArtifactLifecycle shall set artifact to EMPTY, artifactFrame artifactState to EMPTY, artifactFrame withdrawProposal to false, artifactFrame rejectProposal to false, artifactFrame acceptProposal to false, and artifactFrame closureWindow to false.

#### Contract clauses evaluated in the compute phase

##### `CASE_12_RECOVERY_CLOSED` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recoveryFrame recoveryOpen is true, ArtifactLifecycle shall set artifact to RECOVERY, artifactFrame artifactState to RECOVERY, artifactFrame withdrawProposal to false, artifactFrame rejectProposal to false, artifactFrame acceptProposal to false, and artifactFrame closureWindow to false.

##### `CASE_13_RECOVERY_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true and the value of artifact on entry is RECOVERY, ArtifactLifecycle shall set artifact to EMPTY, artifactFrame artifactState to EMPTY, artifactFrame withdrawProposal to false, artifactFrame rejectProposal to false, artifactFrame acceptProposal to false, and artifactFrame closureWindow to false.

##### `CASE_14_WITHDRAWAL` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true, the value of artifact on entry is not RECOVERY, and imageFacts is WITHDRAWAL, ArtifactLifecycle shall set artifact to WITHDRAWN, artifactFrame artifactState to WITHDRAWN, artifactFrame withdrawProposal to true, artifactFrame rejectProposal to false, artifactFrame acceptProposal to false, and artifactFrame closureWindow to false.

##### `CASE_15_REJECT_OR_QUARANTINE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 REJECT OR QUARANTINE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryFrame recoveryOpen is true
>   - the value of artifact on entry is not RECOVERY
>   - imageFacts is not WITHDRAWAL
>   - At least one of the following conditions holds:
>     
>       - admissionFrame outcome is REJECT
>       - admissionFrame outcome is QUARANTINE.

> When all applicability conditions are met, ArtifactLifecycle shall produce a result for which all of the following conditions hold:
>
> artifact is QUARANTINED, artifactFrame artifactState is QUARANTINED, it is not the case that artifactFrame withdrawProposal is true, artifactFrame rejectProposal is true, it is not the case that artifactFrame acceptProposal is true, and it is not the case that artifactFrame closureWindow is true.

##### `CASE_16_ADMISSION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 16 ADMISSION applies under all of the following conditions:
>
> recoveryFrame recoveryOpen is true, the value of artifact on entry is not RECOVERY, imageFacts is not WITHDRAWAL, and admissionFrame outcome is ADMIT.

> When all applicability conditions are met, ArtifactLifecycle shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - it is not the case that artifactFrame withdrawProposal is true
>   - it is not the case that artifactFrame rejectProposal is true
>   - artifactFrame acceptProposal is true
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - the value of artifact on entry is STAGED
>       - At least one of the following conditions holds:
>         
>           - reviewFacts is VIEW ACK
>           - reviewFacts is VIEW DISMISS
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - artifact is EMPTY
>       - artifactFrame artifactState is EMPTY
>       - artifactFrame closureWindow is true
>   - **If:**
>     
>     It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - the value of artifact on entry is STAGED
>       - At least one of the following conditions holds:
>         
>           - reviewFacts is VIEW ACK
>           - reviewFacts is VIEW DISMISS
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - artifact is STAGED
>       - artifactFrame artifactState is STAGED
>       - it is not the case that artifactFrame closureWindow is true.

##### `CASE_17_ARTIFACT_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true, the value of artifact on entry is not RECOVERY, imageFacts is not WITHDRAWAL, and admissionFrame outcome is NONE, ArtifactLifecycle shall preserve the value of artifact on entry, set artifactFrame artifactState to the value of artifact on entry, set artifactFrame withdrawProposal to false, set artifactFrame rejectProposal to false, set artifactFrame acceptProposal to false, and set artifactFrame closureWindow to false.

### Requirements for AvailabilityArbitration

#### Contract clauses evaluated in the initialization phase

##### `INIT_DECISION` — Required behavior

> During contract evaluation for the initialization phase, AvailabilityArbitration shall set decisionFrame selectedAction to HOLD, decisionFrame selectedReason to NO ELIGIBLE WORK, decisionFrame recoveryState to HEALTHY, decisionFrame recoveryOpen to true, decisionFrame recoveryReleased to false, decisionFrame effectiveFaultPresent to false, decisionFrame dominantFault to NONE, decisionFrame effectiveMultipleFaults to false, decisionFrame evidenceState to EMPTY, decisionFrame artifactState to EMPTY, decisionFrame reviewState to IDLE, and decisionFrame availabilityAllowed to false.

#### Contract clauses evaluated in the compute phase

##### `OWNER_SOURCED_FRAME` — Required behavior

> During contract evaluation for the compute phase, AvailabilityArbitration shall set decisionFrame recoveryState to recoveryFrame recoveryState, decisionFrame recoveryOpen to true exactly when recoveryFrame recoveryOpen is true, decisionFrame recoveryReleased to true exactly when recoveryFrame recoveryReleased is true, decisionFrame effectiveFaultPresent to true exactly when recoveryFrame effectiveFaultPresent is true, decisionFrame dominantFault to recoveryFrame dominantFault, decisionFrame effectiveMultipleFaults to true exactly when recoveryFrame effectiveMultipleFaults is true, decisionFrame evidenceState to evidenceFrame evidenceState, decisionFrame artifactState to artifactFrame artifactState, decisionFrame reviewState to reviewFrame reviewState, and decisionFrame availabilityAllowed to true exactly when availabilityFrame decision is ALLOWED.

##### `CASE_24_SAFE_WITHHOLD` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame effectiveFaultPresent is true or it is not the case that recoveryFrame recoveryOpen is true, AvailabilityArbitration shall set decisionFrame selectedAction to SAFE WITHHOLD and decisionFrame selectedReason to FAULT OR RECOVERY.

##### `CASE_25_WITHDRAW` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recoveryFrame effectiveFaultPresent is true, recoveryFrame recoveryOpen is true, and artifactFrame withdrawProposal is true, AvailabilityArbitration shall set decisionFrame selectedAction to WITHDRAW and decisionFrame selectedReason to UPSTREAM WITHDRAWAL.

##### `CASE_26_REJECT` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recoveryFrame effectiveFaultPresent is true, recoveryFrame recoveryOpen is true, it is not the case that artifactFrame withdrawProposal is true, and artifactFrame rejectProposal is true, AvailabilityArbitration shall produce a result for which decisionFrame selectedAction is REJECT, if admissionFrame outcome is QUARANTINE, then decisionFrame selectedReason is SERVICE QUARANTINE, and if admissionFrame outcome is REJECT, then decisionFrame selectedReason is EVIDENCE REJECTION.

##### `CASE_27_CLOSE` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recoveryFrame effectiveFaultPresent is true, recoveryFrame recoveryOpen is true, it is not the case that artifactFrame withdrawProposal is true, it is not the case that artifactFrame rejectProposal is true, and presentationFrame proposal is CLOSE, AvailabilityArbitration shall set decisionFrame selectedAction to CLOSE and decisionFrame selectedReason to DOCTOR CLOSURE.

##### `CASE_28_ACCEPT` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recoveryFrame effectiveFaultPresent is true, recoveryFrame recoveryOpen is true, it is not the case that artifactFrame withdrawProposal is true, it is not the case that artifactFrame rejectProposal is true, presentationFrame proposal is not CLOSE, and artifactFrame acceptProposal is true, AvailabilityArbitration shall set decisionFrame selectedAction to ACCEPT and decisionFrame selectedReason to NEW IMAGE ACCEPTANCE.

##### `CASE_29_PRESENT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 29 PRESENT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - it is not the case that recoveryFrame effectiveFaultPresent is true
>   - recoveryFrame recoveryOpen is true
>   - it is not the case that artifactFrame withdrawProposal is true
>   - it is not the case that artifactFrame rejectProposal is true
>   - it is not the case that artifactFrame acceptProposal is true
>   - At least one of the following conditions holds:
>     
>       - presentationFrame proposal is OPEN
>       - presentationFrame proposal is OFFER.

> When all applicability conditions are met, AvailabilityArbitration shall produce a result for which all of the following conditions hold:
>
> if presentationFrame proposal is OPEN, then decisionFrame selectedAction is OPEN and decisionFrame selectedReason is DOCTOR OPENING and if presentationFrame proposal is OFFER, then decisionFrame selectedAction is OFFER and decisionFrame selectedReason is IMAGE OFFER.

##### `CASE_30_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recoveryFrame effectiveFaultPresent is true, recoveryFrame recoveryOpen is true, it is not the case that artifactFrame withdrawProposal is true, it is not the case that artifactFrame rejectProposal is true, it is not the case that artifactFrame acceptProposal is true, presentationFrame proposal is not CLOSE, presentationFrame proposal is not OPEN, and presentationFrame proposal is not OFFER, AvailabilityArbitration shall set decisionFrame selectedAction to HOLD and decisionFrame selectedReason to NO ELIGIBLE WORK.

### Requirements for AvailabilityDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_AVAILABILITY_DECISION` — Required behavior

> During contract evaluation for the initialization phase, AvailabilityDecisionOwner shall set availabilityFrame decision to BLOCKED and availabilityFrame blockReason to RECOVERY BLOCK.

#### Contract clauses evaluated in the compute phase

##### `AVAILABILITY_POLICY` — Required behavior

> During contract evaluation for the compute phase, AvailabilityDecisionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     it is not the case that recoveryFrame recoveryOpen is true
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is BLOCKED
>       - availabilityFrame blockReason is RECOVERY BLOCK
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - recoveryFrame recoveryOpen is true
>       - artifactFrame artifactState is not STAGED
>       - it is not the case that artifactFrame closureWindow is true
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is BLOCKED
>       - availabilityFrame blockReason is ARTIFACT NOT STAGED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - recoveryFrame recoveryOpen is true
>       - At least one of the following conditions holds:
>         
>           - artifactFrame artifactState is STAGED
>           - artifactFrame closureWindow is true
>       - evidenceFrame evidenceState is not ACCEPTED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is BLOCKED
>       - availabilityFrame blockReason is EVIDENCE NOT ACCEPTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - recoveryFrame recoveryOpen is true
>       - At least one of the following conditions holds:
>         
>           - artifactFrame artifactState is STAGED
>           - artifactFrame closureWindow is true
>       - evidenceFrame evidenceState is ACCEPTED
>       - serviceFacts is not READY
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is BLOCKED
>       - availabilityFrame blockReason is SERVICE NOT READY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - recoveryFrame recoveryOpen is true
>       - At least one of the following conditions holds:
>         
>           - artifactFrame artifactState is STAGED
>           - artifactFrame closureWindow is true
>       - evidenceFrame evidenceState is ACCEPTED
>       - serviceFacts is READY
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is ALLOWED
>       - availabilityFrame blockReason is NONE.

### Requirements for AvailabilityServiceAssessment

#### Contract clauses evaluated in the initialization phase

##### `INIT_SERVICE_FACTS` — Required behavior

> During contract evaluation for the initialization phase, AvailabilityServiceAssessment shall set serviceFacts to READY.

#### Contract clauses evaluated in the compute phase

##### `SERVICE_ASSESSMENT` — Required behavior

> During contract evaluation for the compute phase, AvailabilityServiceAssessment shall produce a result for which if availabilityService is READY, then serviceFacts is READY, if availabilityService is DEGRADED, then serviceFacts is DEGRADED, if availabilityService is FAILED, then serviceFacts is REPORTED FAILURE, and if availabilityService is INVALID A or availabilityService is INVALID B, then serviceFacts is INVALID.

### Requirements for DoctorEventQualification

#### Contract clauses evaluated in the initialization phase

##### `INIT_REVIEW_FACTS` — Required behavior

> During contract evaluation for the initialization phase, DoctorEventQualification shall set reviewFacts to NO REVIEW EVENT.

#### Contract clauses evaluated in the compute phase

##### `DOCTOR_QUALIFICATION` — Required behavior

> During contract evaluation for the compute phase, DoctorEventQualification shall produce a result for which if doctorSignal is NONE, then reviewFacts is NO REVIEW EVENT, if doctorSignal is REQUEST VIEW, then reviewFacts is VIEW REQUEST, if doctorSignal is ACK VIEW, then reviewFacts is VIEW ACK, if doctorSignal is DISMISS VIEW, then reviewFacts is VIEW DISMISS, and if doctorSignal is INVALID A or doctorSignal is INVALID B, then reviewFacts is INVALID.

### Requirements for EvidenceLifecycle

#### Contract clauses evaluated in the initialization phase

##### `INIT_EVIDENCE` — Required behavior

> During contract evaluation for the initialization phase, EvidenceLifecycle shall set evidence to EMPTY, evidenceFrame evidenceState to EMPTY, and evidenceFrame contextAccepted to false.

#### Contract clauses evaluated in the compute phase

##### `CASE_07_RECOVERY_CLOSED` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recoveryFrame recoveryOpen is true, EvidenceLifecycle shall set evidence to RECOVERY, evidenceFrame evidenceState to RECOVERY, and evidenceFrame contextAccepted to false.

##### `CASE_08_RECOVERY_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true and the value of evidence on entry is RECOVERY, EvidenceLifecycle shall set evidence to EMPTY, evidenceFrame evidenceState to EMPTY, and evidenceFrame contextAccepted to false.

##### `CASE_09_WITHDRAWAL` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true, the value of evidence on entry is not RECOVERY, and imageFacts is WITHDRAWAL, EvidenceLifecycle shall set evidence to EMPTY, evidenceFrame evidenceState to EMPTY, and evidenceFrame contextAccepted to false.

##### `CASE_10_NEW_IMAGE_CONTEXT` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true, the value of evidence on entry is not RECOVERY, and imageFacts is NEW IMAGE, EvidenceLifecycle shall produce a result for which if contextFacts is COMPLETE CONTEXT, then evidence is ACCEPTED, evidenceFrame evidenceState is ACCEPTED, and evidenceFrame contextAccepted is true and if contextFacts is not COMPLETE CONTEXT, then evidence is REJECTED, evidenceFrame evidenceState is REJECTED, and it is not the case that evidenceFrame contextAccepted is true.

##### `CASE_11_EVIDENCE_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true, the value of evidence on entry is not RECOVERY, imageFacts is not WITHDRAWAL, and imageFacts is not NEW IMAGE, EvidenceLifecycle shall preserve the value of evidence on entry, set evidenceFrame evidenceState to the value of evidence on entry, and set evidenceFrame contextAccepted to true exactly when the value of evidence on entry is ACCEPTED.

### Requirements for FaultComposition

#### Contract clauses evaluated in the initialization phase

##### `INIT_FAULT_SUMMARY` — Required behavior

> During contract evaluation for the initialization phase, FaultComposition shall set faultSummary faultPresent to false, faultSummary dominantFault to NONE, and faultSummary multipleFaults to false.

#### Contract clauses evaluated in the compute phase

##### `FAULT_PRESENCE_AND_MULTIPLICITY` — Required behavior

> During contract evaluation for the compute phase, FaultComposition shall set faultSummary faultPresent to true exactly when imageFacts is INVALID, reviewFacts is INVALID, contextFacts is INVALID, serviceFacts is INVALID, imageFacts is REPORTED FAILURE, contextFacts is REPORTED FAILURE, or serviceFacts is REPORTED FAILURE and faultSummary multipleFaults to true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - imageFacts is INVALID
>       - At least one of the following conditions holds:
>         
>           - reviewFacts is INVALID
>           - contextFacts is INVALID
>           - serviceFacts is INVALID
>           - imageFacts is REPORTED FAILURE
>           - contextFacts is REPORTED FAILURE
>           - serviceFacts is REPORTED FAILURE
>   - All of the following conditions hold:
>     
>       - reviewFacts is INVALID
>       - At least one of the following conditions holds:
>         
>           - contextFacts is INVALID
>           - serviceFacts is INVALID
>           - imageFacts is REPORTED FAILURE
>           - contextFacts is REPORTED FAILURE
>           - serviceFacts is REPORTED FAILURE
>   - All of the following conditions hold:
>     
>       - contextFacts is INVALID
>       - At least one of the following conditions holds:
>         
>           - serviceFacts is INVALID
>           - imageFacts is REPORTED FAILURE
>           - contextFacts is REPORTED FAILURE
>           - serviceFacts is REPORTED FAILURE
>   - All of the following conditions hold:
>     
>       - serviceFacts is INVALID
>       - At least one of the following conditions holds:
>         
>           - imageFacts is REPORTED FAILURE
>           - contextFacts is REPORTED FAILURE
>           - serviceFacts is REPORTED FAILURE
>   - All of the following conditions hold:
>     
>       - imageFacts is REPORTED FAILURE
>       - At least one of the following conditions holds:
>         
>           - contextFacts is REPORTED FAILURE
>           - serviceFacts is REPORTED FAILURE
>   - All of the following conditions hold:
>     
>       - contextFacts is REPORTED FAILURE
>       - serviceFacts is REPORTED FAILURE.

##### `FAULT_DOMINANCE` — Required behavior

> During contract evaluation for the compute phase, FaultComposition shall produce a result for which if imageFacts is INVALID, then faultSummary dominantFault is IMAGE INPUT, if imageFacts is not INVALID and reviewFacts is INVALID, then faultSummary dominantFault is DOCTOR INPUT, if imageFacts is not INVALID, reviewFacts is not INVALID, and contextFacts is INVALID, then faultSummary dominantFault is CONTEXT INPUT, if imageFacts is not INVALID, reviewFacts is not INVALID, contextFacts is not INVALID, and serviceFacts is INVALID, then faultSummary dominantFault is SERVICE INPUT, if imageFacts is not INVALID, reviewFacts is not INVALID, contextFacts is not INVALID, serviceFacts is not INVALID, and imageFacts is REPORTED FAILURE, then faultSummary dominantFault is UPSTREAM REPORTED, if imageFacts is not INVALID, reviewFacts is not INVALID, contextFacts is not INVALID, serviceFacts is not INVALID, imageFacts is not REPORTED FAILURE, and contextFacts is REPORTED FAILURE, then faultSummary dominantFault is CONTEXT REPORTED, if imageFacts is not INVALID, reviewFacts is not INVALID, contextFacts is not INVALID, serviceFacts is not INVALID, imageFacts is not REPORTED FAILURE, contextFacts is not REPORTED FAILURE, and serviceFacts is REPORTED FAILURE, then faultSummary dominantFault is SERVICE REPORTED, and if it is not the case that faultSummary faultPresent is true, then faultSummary dominantFault is NONE.

### Requirements for ImageEventQualification

#### Contract clauses evaluated in the initialization phase

##### `INIT_IMAGE_FACTS` — Required behavior

> During contract evaluation for the initialization phase, ImageEventQualification shall set imageFacts to NO IMAGE.

#### Contract clauses evaluated in the compute phase

##### `IMAGE_QUALIFICATION` — Required behavior

> During contract evaluation for the compute phase, ImageEventQualification shall produce a result for which if imageSignal is NONE, then imageFacts is NO IMAGE, if imageSignal is GENERATED, then imageFacts is NEW IMAGE, if imageSignal is REVOKED, then imageFacts is WITHDRAWAL, if imageSignal is UPSTREAM FAILURE, then imageFacts is REPORTED FAILURE, and if imageSignal is INVALID A or imageSignal is INVALID B, then imageFacts is INVALID.

### Requirements for PreparationContextAssessment

#### Contract clauses evaluated in the initialization phase

##### `INIT_CONTEXT_FACTS` — Required behavior

> During contract evaluation for the initialization phase, PreparationContextAssessment shall set contextFacts to NO CONTEXT.

#### Contract clauses evaluated in the compute phase

##### `CONTEXT_ASSESSMENT` — Required behavior

> During contract evaluation for the compute phase, PreparationContextAssessment shall produce a result for which if preparationContext is NO REPORT, then contextFacts is NO CONTEXT, if preparationContext is BELT REPORTED or preparationContext is CALIBRATION REPORTED, then contextFacts is PARTIAL CONTEXT, if preparationContext is BELT AND CALIBRATION REPORTED, then contextFacts is COMPLETE CONTEXT, if preparationContext is REPORTED FAILURE, then contextFacts is REPORTED FAILURE, and if preparationContext is INVALID A or preparationContext is INVALID B, then contextFacts is INVALID.

### Requirements for PresentationDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_PRESENTATION` — Required behavior

> During contract evaluation for the initialization phase, PresentationDecisionOwner shall set presentationFrame proposal to NONE.

#### Contract clauses evaluated in the compute phase

##### `PRESENTATION_POLICY` — Required behavior

> During contract evaluation for the compute phase, PresentationDecisionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     availabilityFrame decision is BLOCKED
>     
>     **Then:**
>     
>     presentationFrame proposal is NONE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is ALLOWED
>       - reviewFrame reviewState is ACKNOWLEDGED
>     
>     **Then:**
>     
>     presentationFrame proposal is CLOSE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is ALLOWED
>       - reviewFrame reviewState is VIEWING
>     
>     **Then:**
>     
>     presentationFrame proposal is OPEN
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is ALLOWED
>       - reviewFrame reviewState is OFFERED
>     
>     **Then:**
>     
>     presentationFrame proposal is OFFER
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - availabilityFrame decision is ALLOWED
>       - At least one of the following conditions holds:
>         
>           - reviewFrame reviewState is IDLE
>           - reviewFrame reviewState is RECOVERY
>     
>     **Then:**
>     
>     presentationFrame proposal is NONE.

### Requirements for PublicationComposition

#### Contract clauses evaluated in the initialization phase

##### `INIT_PUBLIC_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, PublicationComposition shall set upstreamDisposition to NO ACTION, analysisAvailability publicMode to IDLE, analysisAvailability visibility to HIDDEN, analysisAvailability selectedReason to NO ELIGIBLE WORK, analysisAvailability recoveryState to HEALTHY, analysisAvailability evidenceState to EMPTY, analysisAvailability artifactState to EMPTY, analysisAvailability reviewState to IDLE, analysisAvailability faultPresent to false, analysisAvailability dominantFault to NONE, and analysisAvailability multipleFaults to false.

#### Contract clauses evaluated in the compute phase

##### `ACTION_OUTPUT_COMPOSITION` — Required behavior

> During contract evaluation for the compute phase, PublicationComposition shall produce a result for which if decisionFrame selectedAction is SAFE WITHHOLD, then upstreamDisposition is PAUSE DELIVERY and analysisAvailability visibility is HIDDEN, if decisionFrame selectedAction is WITHDRAW, then upstreamDisposition is ACK WITHDRAWN and analysisAvailability visibility is HIDDEN, if decisionFrame selectedAction is REJECT, then upstreamDisposition is REJECT IMAGE and analysisAvailability visibility is HIDDEN, if decisionFrame selectedAction is ACCEPT, then upstreamDisposition is ACCEPT IMAGE and analysisAvailability visibility is OFFERED, if decisionFrame selectedAction is CLOSE, then upstreamDisposition is NO ACTION and analysisAvailability visibility is CLOSED, if decisionFrame selectedAction is OPEN, then upstreamDisposition is NO ACTION and analysisAvailability visibility is VISIBLE, if decisionFrame selectedAction is OFFER, then upstreamDisposition is NO ACTION and analysisAvailability visibility is OFFERED, and if decisionFrame selectedAction is HOLD, then upstreamDisposition is NO ACTION and analysisAvailability visibility is HIDDEN.

##### `PUBLIC_FIELD_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, PublicationComposition shall set analysisAvailability selectedReason to decisionFrame selectedReason, analysisAvailability recoveryState to decisionFrame recoveryState, analysisAvailability evidenceState to decisionFrame evidenceState, analysisAvailability artifactState to decisionFrame artifactState, analysisAvailability reviewState to decisionFrame reviewState, analysisAvailability faultPresent to true exactly when decisionFrame effectiveFaultPresent is true, analysisAvailability dominantFault to decisionFrame dominantFault, and analysisAvailability multipleFaults to true exactly when decisionFrame effectiveMultipleFaults is true.

##### `TOTAL_PUBLIC_MODE` — Required behavior

> During contract evaluation for the compute phase, PublicationComposition shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     decisionFrame effectiveFaultPresent is true
>     
>     **Then:**
>     
>     analysisAvailability publicMode is FAULT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - it is not the case that decisionFrame effectiveFaultPresent is true
>       - it is not the case that decisionFrame recoveryOpen is true
>     
>     **Then:**
>     
>     analysisAvailability publicMode is RECOVERY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - it is not the case that decisionFrame effectiveFaultPresent is true
>       - decisionFrame recoveryOpen is true
>       - decisionFrame artifactState is QUARANTINED
>     
>     **Then:**
>     
>     analysisAvailability publicMode is QUARANTINED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - it is not the case that decisionFrame effectiveFaultPresent is true
>       - decisionFrame recoveryOpen is true
>       - decisionFrame artifactState is not QUARANTINED
>       - decisionFrame selectedAction is CLOSE
>     
>     **Then:**
>     
>     analysisAvailability publicMode is CLOSED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - it is not the case that decisionFrame effectiveFaultPresent is true
>       - decisionFrame recoveryOpen is true
>       - decisionFrame artifactState is not QUARANTINED
>       - decisionFrame selectedAction is not CLOSE
>       - At least one of the following conditions holds:
>         
>           - decisionFrame reviewState is VIEWING
>           - decisionFrame selectedAction is OPEN
>     
>     **Then:**
>     
>     analysisAvailability publicMode is VIEWING
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - it is not the case that decisionFrame effectiveFaultPresent is true
>       - decisionFrame recoveryOpen is true
>       - decisionFrame artifactState is not QUARANTINED
>       - decisionFrame selectedAction is not CLOSE
>       - decisionFrame reviewState is not VIEWING
>       - decisionFrame selectedAction is not OPEN
>       - At least one of the following conditions holds:
>         
>           - decisionFrame reviewState is OFFERED
>           - decisionFrame selectedAction is OFFER
>           - decisionFrame selectedAction is ACCEPT
>     
>     **Then:**
>     
>     analysisAvailability publicMode is OFFERED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - it is not the case that decisionFrame effectiveFaultPresent is true
>       - decisionFrame recoveryOpen is true
>       - decisionFrame artifactState is STAGED
>       - decisionFrame selectedAction is not CLOSE
>       - decisionFrame reviewState is not VIEWING
>       - decisionFrame selectedAction is not OPEN
>       - decisionFrame reviewState is not OFFERED
>       - decisionFrame selectedAction is not OFFER
>       - decisionFrame selectedAction is not ACCEPT
>     
>     **Then:**
>     
>     analysisAvailability publicMode is STAGED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - it is not the case that decisionFrame effectiveFaultPresent is true
>       - decisionFrame recoveryOpen is true
>       - decisionFrame artifactState is not QUARANTINED
>       - decisionFrame artifactState is not STAGED
>       - decisionFrame selectedAction is not CLOSE
>       - decisionFrame reviewState is not VIEWING
>       - decisionFrame selectedAction is not OPEN
>       - decisionFrame reviewState is not OFFERED
>       - decisionFrame selectedAction is not OFFER
>       - decisionFrame selectedAction is not ACCEPT
>     
>     **Then:**
>     
>     analysisAvailability publicMode is IDLE.

### Requirements for RecoveryControl

#### Contract clauses evaluated in the initialization phase

##### `INIT_RECOVERY` — Required behavior

> During contract evaluation for the initialization phase, RecoveryControl shall set recovery to HEALTHY, recoveryFrame recoveryState to HEALTHY, recoveryFrame recoveryOpen to true, recoveryFrame recoveryReleased to false, recoveryFrame effectiveFaultPresent to false, recoveryFrame dominantFault to NONE, and recoveryFrame effectiveMultipleFaults to false.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_FAULT_LATCH` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 01 FAULT LATCH applies under all of the following conditions:
>
> faultSummary faultPresent is true, recoveryEvent is INVALID A, or recoveryEvent is INVALID B.

> When all applicability conditions are met, RecoveryControl shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recovery is LATCHED
>   - recoveryFrame recoveryState is LATCHED
>   - it is not the case that recoveryFrame recoveryOpen is true
>   - it is not the case that recoveryFrame recoveryReleased is true
>   - recoveryFrame effectiveFaultPresent is true
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - recoveryEvent is INVALID A
>       - recoveryEvent is INVALID B
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - recoveryFrame dominantFault is RECOVERY INPUT
>       - The first condition holds exactly when the second condition holds:
>         
>         **First condition:**
>         
>         recoveryFrame effectiveMultipleFaults is true
>         
>         **Second condition:**
>         
>         At least one of the following conditions holds:
>         
>           - faultSummary faultPresent is true
>           - faultSummary multipleFaults is true
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - recoveryEvent is not INVALID A
>       - recoveryEvent is not INVALID B
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - recoveryFrame dominantFault is faultSummary dominantFault
>       - recoveryFrame effectiveMultipleFaults is true exactly when faultSummary multipleFaults is true.

##### `CASE_02_HEALTHY_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that faultSummary faultPresent is true, recoveryEvent is not INVALID A, recoveryEvent is not INVALID B, and the value of recovery on entry is HEALTHY, RecoveryControl shall set recovery to HEALTHY, recoveryFrame recoveryState to HEALTHY, recoveryFrame recoveryOpen to true, recoveryFrame recoveryReleased to false, recoveryFrame effectiveFaultPresent to false, recoveryFrame dominantFault to NONE, and recoveryFrame effectiveMultipleFaults to false.

##### `CASE_03_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that faultSummary faultPresent is true, the value of recovery on entry is LATCHED, and recoveryEvent is RESET, RecoveryControl shall set recovery to VERIFYING, recoveryFrame recoveryState to VERIFYING, recoveryFrame recoveryOpen to false, recoveryFrame recoveryReleased to false, recoveryFrame effectiveFaultPresent to false, recoveryFrame dominantFault to NONE, and recoveryFrame effectiveMultipleFaults to false.

##### `CASE_04_VERIFY` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that faultSummary faultPresent is true, the value of recovery on entry is VERIFYING, and recoveryEvent is VERIFY OK, RecoveryControl shall set recovery to ARMED, recoveryFrame recoveryState to ARMED, recoveryFrame recoveryOpen to false, recoveryFrame recoveryReleased to false, recoveryFrame effectiveFaultPresent to false, recoveryFrame dominantFault to NONE, and recoveryFrame effectiveMultipleFaults to false.

##### `CASE_05_RESUME` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that faultSummary faultPresent is true, the value of recovery on entry is ARMED, and recoveryEvent is RESUME, RecoveryControl shall set recovery to HEALTHY, recoveryFrame recoveryState to HEALTHY, recoveryFrame recoveryOpen to true, recoveryFrame recoveryReleased to true, recoveryFrame effectiveFaultPresent to false, recoveryFrame dominantFault to NONE, and recoveryFrame effectiveMultipleFaults to false.

##### `CASE_06_CLOSED_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 CLOSED STUTTER applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - it is not the case that faultSummary faultPresent is true
>   - recoveryEvent is not INVALID A
>   - recoveryEvent is not INVALID B
>   - the value of recovery on entry is not HEALTHY
>   - It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of recovery on entry is LATCHED
>           - recoveryEvent is RESET
>       - All of the following conditions hold:
>         
>           - the value of recovery on entry is VERIFYING
>           - recoveryEvent is VERIFY OK
>       - All of the following conditions hold:
>         
>           - the value of recovery on entry is ARMED
>           - recoveryEvent is RESUME.

> When all applicability conditions are met, RecoveryControl shall produce a result for which all of the following conditions hold:
>
> recovery is the value of recovery on entry, recoveryFrame recoveryState is the value of recovery on entry, it is not the case that recoveryFrame recoveryOpen is true, it is not the case that recoveryFrame recoveryReleased is true, it is not the case that recoveryFrame effectiveFaultPresent is true, recoveryFrame dominantFault is NONE, and it is not the case that recoveryFrame effectiveMultipleFaults is true.

### Requirements for ReviewLifecycle

#### Contract clauses evaluated in the initialization phase

##### `INIT_REVIEW` — Required behavior

> During contract evaluation for the initialization phase, ReviewLifecycle shall set review to IDLE and reviewFrame reviewState to IDLE.

#### Contract clauses evaluated in the compute phase

##### `CASE_18_RECOVERY_CLOSED` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recoveryFrame recoveryOpen is true, ReviewLifecycle shall set review to RECOVERY and reviewFrame reviewState to RECOVERY.

##### `CASE_19_RECOVERY_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true and the value of review on entry is RECOVERY, ReviewLifecycle shall set review to IDLE and reviewFrame reviewState to IDLE.

##### `CASE_20_AVAILABILITY_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true, the value of review on entry is not RECOVERY, and availabilityFrame decision is BLOCKED, ReviewLifecycle shall set review to IDLE and reviewFrame reviewState to IDLE.

##### `CASE_21_VIEW_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true, the value of review on entry is not RECOVERY, availabilityFrame decision is ALLOWED, and reviewFacts is VIEW REQUEST, ReviewLifecycle shall set review to VIEWING and reviewFrame reviewState to VIEWING.

##### `CASE_22_ACK_OR_DISMISS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 22 ACK OR DISMISS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryFrame recoveryOpen is true
>   - the value of review on entry is not RECOVERY
>   - availabilityFrame decision is ALLOWED
>   - At least one of the following conditions holds:
>     
>       - reviewFacts is VIEW ACK
>       - reviewFacts is VIEW DISMISS.

> When all applicability conditions are met, ReviewLifecycle shall produce a result for which all of the following conditions hold:
>
> review is ACKNOWLEDGED and reviewFrame reviewState is ACKNOWLEDGED.

##### `CASE_23_AVAILABLE_DEFAULT` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryFrame recoveryOpen is true, the value of review on entry is not RECOVERY, availabilityFrame decision is ALLOWED, and reviewFacts is NO REVIEW EVENT, ReviewLifecycle shall produce a result for which if the value of review on entry is VIEWING, then review is VIEWING and reviewFrame reviewState is VIEWING and if the value of review on entry is not VIEWING, then review is OFFERED and reviewFrame reviewState is OFFERED.
