---
abstract_id: SA-EIT-IMAGE-AVAIL-02
seed_id: eit-acquisition-seed-20260813t233941z
seed_version: 1
status: approved-final
complexity: hard
executable_profile: not-declared
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
selected_semantic_usages: 14
selected_semantic_interactions: 34
selected_nontrivial_contract_cases: 30
selected_scenario_families: 10
node_count: [14, 14]
edge_count: [34, 34]
containment_depth: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_multiple_state_or_decision_owners: true
requires_priority: true
requires_fault_propagation: true
requires_recovery: true
requires_composition: true
---

# EIT image availability and review-support coordinator

## Evidence classes and claim boundary

BASIS-01: [Seed-grounded fact] The frozen source supplies the actors `Doctor`, `EngineerTechnician`, `Patient`, and `EITSystem`; use-case names including EIT-image generation and image analysis; a Doctor association with image analysis; an `EITSystem` association with image generation; and an ambiguous `EITSystem`/`EITSystemBoundary` relationship. It supplies no sequence, data representation, validity semantics, invocation rights, policy, state, priority, fault behavior, or recovery behavior.

METHOD-01: [Handbook-derived engineering control] This abstract states need and boundary before architecture, records assumptions and alternatives, separates nominal and off-nominal behavior, assigns stable trace identifiers, and gives objective verification and validation criteria. These controls are methodology requirements, not EIT domain facts.

PILOT-01: [Pilot abstraction] One logical evaluation consumes one finite boundary snapshot and four retained pre-states, derives local facts and next states through an acyclic responsibility graph, selects one availability-management action, and publishes two mutually consistent boundary outputs. All finite values, logical-step semantics, evidence meanings, priorities, state machines, recovery events, and output meanings below are Designer-owned experiment assumptions.

ARCH-01: [Selected architecture] The retained direction uses four independent boundary qualifiers, one fault composer, four distinct retained-state owners, three stateless multi-input decision owners, one strict-priority arbiter, and one public composer. Exactly `PART-01` through `PART-14` receive semantic-usage credit; the root, context actors, type definitions, analyzer, and routing support do not.

DEFER-01: [Deferred claim] The run makes no diagnosis, treatment, image-quality, reconstruction-correctness, calibration-correctness, patient-outcome, electrical-safety, medical-device-efficacy, regulatory, certification, physical-timing, production-readiness, or clinical-correctness claim. Belt application, calibration execution, monitoring authorization, impedance acquisition, image reconstruction, and clinical interpretation remain outside the modeled behavior.

## Need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A bounded coordinator is needed to decide when an externally generated EIT image may be made available for Doctor analysis, when it must remain quarantined or be withdrawn, and how review availability is safely re-enabled after invalid or failed supporting evidence.

PURPOSE-01: [Pilot abstraction] For each logical evaluation, the system shall qualify upstream image, Doctor review, preparation-context, and availability-service observations; propagate faults into an independent recovery lifecycle; retain separate evidence, artifact, and review lifecycles; arbitrate competing admission, withdrawal, rejection, closure, opening, and offer proposals; and publish one upstream disposition plus one Doctor-facing availability frame.

GOAL-01: [Pilot abstraction] Every finite input and pre-state combination shall match exactly one ordered case at each case-bearing owner and shall yield exactly one selected action.

GOAL-02: [Pilot abstraction] A generated-image event shall be admitted only when externally reported preparation context is complete, the availability service is ready, and recovery is open; admission means catalog acceptance only, not image correctness.

GOAL-03: [Pilot abstraction] Invalid evidence or a reported upstream, preparation-context, or availability-service failure shall close review availability in the same evaluation and shall dominate ordinary work.

GOAL-04: [Pilot abstraction] Recovery shall require three distinct fresh events—`RESET`, then `VERIFY_OK`, then `RESUME`—and all operational owners shall return to neutral on reopening so that later fresh image and Doctor events are required.

GOAL-05: [Selected architecture] Fault recovery, evidence state, artifact state, and review state shall have different owners; admission, current availability, presentation intent, selected action, and public composition shall each have one nonduplicated decision owner.

GOAL-06: [Pilot abstraction] Ordinary simultaneous proposals shall follow an observable priority: withdrawal, rejection, Doctor closure, new-image acceptance, Doctor opening or offer, then hold, all below fault or closed-recovery withholding.

## Operational context and selected system boundary

CTX-01: [Selected boundary] The modeled system begins when an external viewpoint reports an EIT image-generation event. It manages catalog admission and Doctor-facing analysis availability; it does not initiate monitoring, authorize acquisition, collect impedance data, or generate an image.

CTX-DOC-01: [Seed-grounded entity with pilot responsibility] The Doctor supplies a status-bearing review event and consumes an availability frame. The assigned event semantics are a pilot responsibility and do not imply automated analysis or exclusive clinical authority.

CTX-TECH-01: [Seed-grounded entity with pilot responsibility] The EngineerTechnician supplies a finite preparation-context observation and recovery events. These responsibilities are assumptions chosen from the seed vocabulary, not facts implied by actor association.

CTX-PAT-01: [Seed-grounded entity; informational] The Patient remains external context and has no modeled input or output because the source declares no Patient association and supplies no patient sensing, consent, control, or outcome semantics.

CTX-EIT-01: [Resolution of seed ambiguity] The source's `EITSystem` actor is treated as an external image-producing and catalog-enabling viewpoint distinct from this coordinator. It supplies image-generation and service observations and consumes catalog dispositions; this viewpoint is selected rather than source-mandated.

CTX-RECIP-01: [Selected boundary] The Doctor is the sole modeled recipient of analysis availability. Availability means that the abstract image item may be presented for human analysis, not that analysis occurred or that the image is clinically usable.

MON-IMG-01: [Pilot abstraction] Root input `imageSignal` is `ImageSignal={NONE,GENERATED,REVOKED,UPSTREAM_FAILURE,INVALID_A,INVALID_B}` supplied by `CTX-EIT-01`; each non-`NONE` value is a fresh event for one evaluation.

MON-DOC-01: [Pilot abstraction] Root input `doctorSignal` is `DoctorSignal={NONE,REQUEST_VIEW,ACK_VIEW,DISMISS_VIEW,INVALID_A,INVALID_B}` supplied by `CTX-DOC-01`; acknowledgement records only receipt, and dismissal records only a request to close presentation.

MON-CTX-01: [Pilot abstraction] Root input `preparationContext` is `PreparationContext={NO_REPORT,BELT_REPORTED,CALIBRATION_REPORTED,BELT_AND_CALIBRATION_REPORTED,REPORTED_FAILURE,INVALID_A,INVALID_B}` supplied by `CTX-TECH-01`. Reports are administrative context and do not certify belt placement or calibration correctness.

MON-SVC-01: [Pilot abstraction] Root input `availabilityService` is `ServiceObservation={READY,DEGRADED,FAILED,INVALID_A,INVALID_B}` supplied by `CTX-EIT-01`; it describes the abstract catalog/presentation path, not physical performance or uptime.

MON-REC-01: [Pilot abstraction] Root input `recoveryEvent` is `RecoveryEvent={NONE,RESET,VERIFY_OK,RESUME,INVALID_A,INVALID_B}` supplied by `CTX-TECH-01`; each non-`NONE` value is fresh and has meaning only in its matching recovery phase.

CTRL-UP-01: [Pilot abstraction] Root output `upstreamDisposition` is `UpstreamDisposition={NO_ACTION,ACCEPT_IMAGE,REJECT_IMAGE,ACK_WITHDRAWN,PAUSE_DELIVERY}` consumed by `CTX-EIT-01`. It controls only this coordinator's catalog treatment and never commands image generation or acquisition.

CTRL-DOC-01: [Pilot abstraction] Root output `analysisAvailability` is a flat `AvailabilityFrame=(publicMode,visibility,reason,recoveryState,evidenceState,artifactState,reviewState,faultPresent,dominantFault,multipleFaults)` consumed by `CTX-DOC-01`; `visibility` is `Visibility={HIDDEN,OFFERED,VISIBLE,CLOSED}`.

BOUND-AUD-01: [Boundary audit] The complete finite boundary is exactly five root inputs `MON-IMG-01`, `MON-DOC-01`, `MON-CTX-01`, `MON-SVC-01`, and `MON-REC-01`, plus two root outputs `CTRL-UP-01` and `CTRL-DOC-01`. No acquisition request, monitoring-start request, impedance measurement, patient measurement, diagnosis, or treatment flow is present.

## Finite types, assumptions, and constraints

TYPE-FACT-01: [Pilot abstraction] Qualified facts are `ImageFacts={NO_IMAGE,NEW_IMAGE,WITHDRAWAL,REPORTED_FAILURE,INVALID}`, `ReviewFacts={NO_REVIEW_EVENT,VIEW_REQUEST,VIEW_ACK,VIEW_DISMISS,INVALID}`, `ContextFacts={NO_CONTEXT,PARTIAL_CONTEXT,COMPLETE_CONTEXT,REPORTED_FAILURE,INVALID}`, and `ServiceFacts={READY,DEGRADED,REPORTED_FAILURE,INVALID}`.

TYPE-FAULT-01: [Pilot abstraction] `DominantFault={RECOVERY_INPUT,IMAGE_INPUT,DOCTOR_INPUT,CONTEXT_INPUT,SERVICE_INPUT,UPSTREAM_REPORTED,CONTEXT_REPORTED,SERVICE_REPORTED,NONE}`. Recovery-input invalidity dominates the received local summary; otherwise local dominance follows the listed non-recovery order, and multiplicity records two or more simultaneous sources.

TYPE-STATE-01: [Pilot abstraction] Retained domains are `RecoveryState={HEALTHY,LATCHED,VERIFYING,ARMED}`, `EvidenceState={EMPTY,ACCEPTED,REJECTED,RECOVERY}`, `ArtifactState={EMPTY,STAGED,QUARANTINED,WITHDRAWN,RECOVERY}`, and `ReviewState={IDLE,OFFERED,VIEWING,ACKNOWLEDGED,RECOVERY}`.

TYPE-DEC-01: [Pilot abstraction] Stateless decision domains are `AdmissionOutcome={NONE,ADMIT,QUARANTINE,REJECT}`, `AdmissionReason={NO_CANDIDATE,ELIGIBLE,EVIDENCE_INCOMPLETE,SERVICE_DEGRADED,RECOVERY_CLOSED}`, `AvailabilityDecision={BLOCKED,ALLOWED}`, `BlockReason={RECOVERY_BLOCK,ARTIFACT_NOT_STAGED,EVIDENCE_NOT_ACCEPTED,SERVICE_NOT_READY,NONE}`, and `PresentationProposal={NONE,CLOSE,OPEN,OFFER}`.

TYPE-ACT-01: [Pilot abstraction] `SelectedAction={SAFE_WITHHOLD,WITHDRAW,REJECT,CLOSE,ACCEPT,OPEN,OFFER,HOLD}` and `SelectedReason={FAULT_OR_RECOVERY,UPSTREAM_WITHDRAWAL,EVIDENCE_REJECTION,SERVICE_QUARANTINE,DOCTOR_CLOSURE,NEW_IMAGE_ACCEPTANCE,DOCTOR_OPENING,IMAGE_OFFER,NO_ELIGIBLE_WORK}`.

TYPE-PUB-01: [Pilot abstraction] `PublicMode={RECOVERY,FAULT,QUARANTINED,STAGED,OFFERED,VIEWING,CLOSED,IDLE}`. These modes report coordination status only and do not describe patient or clinical state.

ASM-STEP-01: [Pilot abstraction] An evaluation is a deterministic ordered logical step with no duration claim. Owners consume one coherent boundary snapshot plus their declared pre-state, and acyclic downstream owners consume the resulting upstream facts or frames within that evaluation.

ASM-FRESH-01: [Pilot abstraction] `CTX-DOC-01`, `CTX-TECH-01`, and `CTX-EIT-01` are responsible for presenting non-`NONE` events for exactly one evaluation and not replaying them as fresh events.

ASM-CONTEXT-01: [Pilot abstraction] `CTX-TECH-01` is responsible only for truthfully supplying its declared administrative report. The coordinator neither performs nor verifies belt application or calibration.

ASM-SERVICE-01: [Pilot abstraction] `CTX-EIT-01` is responsible for service and generated-image observations and for acting on catalog dispositions. Issuing `ACCEPT_IMAGE`, `REJECT_IMAGE`, or `ACK_WITHDRAWN` does not establish that an external action succeeded.

ASM-SINGLE-01: [Pilot abstraction] The finite model represents at most one abstract image item and one Doctor review presentation. It has no identifiers, queues, timestamps, image pixels, measurements, multiple patients, or concurrent image collection.

ASM-REC-01: [Pilot abstraction] `RESET`, `VERIFY_OK`, and `RESUME` must occur on three later evaluations in that order after a latch. On the reopening `RESUME` evaluation, evidence, artifact, and review owners return to neutral and ignore concurrent operational events; later fresh `GENERATED` and `REQUEST_VIEW` events are required.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, retained state is exactly `HEALTHY/EMPTY/EMPTY/IDLE`, `upstreamDisposition=NO_ACTION`, and `analysisAvailability=(publicMode=IDLE,visibility=HIDDEN,reason=NO_ELIGIBLE_WORK,recoveryState=HEALTHY,evidenceState=EMPTY,artifactState=EMPTY,reviewState=IDLE,faultPresent=false,dominantFault=NONE,multipleFaults=false)`. This is deterministic experiment initialization, not a physical safe-start or safety-certification claim.

CONSTR-SEM-01: [Hard structural gate] Exactly 14 responsibility-bearing semantic usages, 34 typed directed cross-usage semantic interactions, 30 nontrivial ordered owner-local cases, and 10 scenario families shall be realized. A root, context node, type, process shell, router, analyzer, initializer, invariant, or mapping equation receives no campaign credit.

CONSTR-ROOT-01: [Hard structural gate] The model shall contain exactly one explicit root system usage, exactly one weakly connected semantic region, and semantic containment depth from one through two below the root. No extra responsibility-bearing usage or semantic connection is permitted.

CONSTR-OWN-01: [Ownership gate] No owner may mirror another owner's persistent state or recompute its local classification, transition, feasibility, priority, or public mapping. Every credited owner shall expose at least one many-to-one, multi-input, state-transition, priority, or coordinated-output relation.

## Parts, responsibilities, and ownership

PART-01: [Semantic usage; fact owner] `image_event_qualification` shall map both invalid raw values to one invalid fact, distinguish fresh generated and withdrawal events from reported failure, and own no admission, artifact state, or visibility decision.

PART-02: [Semantic usage; fact owner] `doctor_event_qualification` shall map both invalid raw values to one invalid fact, distinguish request, acknowledgement, and dismissal, and own no review state or presentation priority.

PART-03: [Semantic usage; fact owner] `preparation_context_assessment` shall derive one context fact by collapsing belt-only and calibration-only reports to `PARTIAL_CONTEXT`, both reports to `COMPLETE_CONTEXT`, and both invalid values to one invalid fact. It shall not assert preparation correctness.

PART-04: [Semantic usage; fact owner] `availability_service_assessment` shall derive one service fact, collapse two invalid raw values, preserve degraded versus ready service, and own no current availability decision.

PART-05: [Semantic usage; fault-composition owner] `fault_composition` shall combine the four local facts into `FaultSummary=(faultPresent,dominantFault,multipleFaults)`, detect simultaneous sources, and apply local dominance `IMAGE_INPUT`, `DOCTOR_INPUT`, `CONTEXT_INPUT`, `SERVICE_INPUT`, `UPSTREAM_REPORTED`, `CONTEXT_REPORTED`, `SERVICE_REPORTED`, then `NONE`.

PART-06: [Semantic usage; retained recovery-state owner] `recovery_control` shall be the sole owner of `RecoveryState`, qualify `MON-REC-01`, apply `CASE-01` through `CASE-06`, and produce `RecoveryFrame=(recoveryState,recoveryOpen,recoveryReleased,effectiveFaultPresent,effectiveDominantFault,effectiveMultipleFaults)`. Invalid recovery input latches, selects `RECOVERY_INPUT`, and combines multiplicity with any local fault.

PART-07: [Semantic usage; retained evidence-state owner] `evidence_lifecycle` shall be the sole owner of `EvidenceState`, apply `CASE-07` through `CASE-11`, and record whether the current single image's administrative preparation context was accepted or rejected without assessing image or calibration quality.

PART-08: [Semantic usage; admission-decision owner] `admission_decision` shall derive `AdmissionOutcome` and `AdmissionReason` from received image, current context, retained evidence, service, and recovery facts: `ADMIT/ELIGIBLE` exactly for a new image with current `COMPLETE_CONTEXT`, received `ACCEPTED` evidence, ready service, and open recovery; `REJECT/EVIDENCE_INCOMPLETE` for a new image with rejected evidence; `QUARANTINE/SERVICE_DEGRADED` for another nonfault new-image combination under degraded service; and `NONE` with the applicable no-candidate or recovery reason otherwise. The current-context guard prevents inherited acceptance from authorizing a replacement whose fresh context is absent.

PART-09: [Semantic usage; retained artifact-state owner] `artifact_lifecycle` shall be the sole owner of `ArtifactState`, apply `CASE-12` through `CASE-17`, and derive one-cycle `withdrawProposal`, `rejectProposal`, `acceptProposal`, and `closureWindow` facts from upstream withdrawal, received admission outcome, prior artifact state, and qualified Doctor facts. `closureWindow` shall be true exactly when an `ADMIT` arrives against prior `STAGED` state with `VIEW_ACK` or `VIEW_DISMISS`, and false otherwise. It shall preserve the acceptance proposal for arbitration while declining to retain that suppressed replacement; it shall not decide Doctor presentation.

PART-10: [Semantic usage; availability-decision owner] `availability_decision` shall derive `ALLOWED` exactly when recovery is open, evidence state is `ACCEPTED`, service is `READY`, and either artifact state is `STAGED` or the received one-cycle `closureWindow` is true; otherwise it shall derive `BLOCKED` plus one dominant block reason ordered recovery, artifact, evidence, then service. The `closureWindow` exception exists solely to process the same-evaluation Doctor closure while the competing replacement remains uncommitted.

PART-11: [Semantic usage; retained review-state owner] `review_lifecycle` shall be the sole owner of `ReviewState`, apply `CASE-18` through `CASE-23`, and retain offer/view/acknowledgement progress only while received availability is allowed.

PART-12: [Semantic usage; presentation-decision owner] `presentation_decision` shall combine received availability and review state into exactly one proposal: `CLOSE` for acknowledged review, `OPEN` for viewing, `OFFER` for offered, and `NONE` otherwise. It shall own no state and shall not reassess evidence or service.

PART-13: [Semantic usage; priority owner] `availability_arbitration` shall be the sole `SelectedAction` owner, apply `CASE-24` through `CASE-30`, and compose `DecisionFrame` from directly received recovery, evidence, admission, artifact, availability, review, and presentation frames without recomputing their relations. Carrying owner-supplied fields into the frame is required coherence and receives no owner or case credit.

PART-14: [Semantic usage; public-composition owner] `publication_composition` shall be the sole writer of both root outputs, map one `DecisionFrame` to every output field, and retain no state or alternate priority policy. Its credited local relation is only the total state/action-dependent `publicMode` classification plus coordinated action-to-disposition/visibility mapping; copied reason, state, and fault fields are uncredited coherence.

OWN-AUD-01: [State and decision audit] Persistent state is owned only by `PART-06`, `PART-07`, `PART-09`, and `PART-11`; local fact and fault decisions only by `PART-01` through `PART-05`; admission, availability, presentation, and arbitration only by `PART-08`, `PART-10`, `PART-12`, and `PART-13`; and root-output composition only by `PART-14`.

OWN-AUD-02: [No-padding audit] `PART-01`, `PART-02`, and `PART-04` perform many-to-one invalid collapse with domain distinctions; `PART-03` combines two independent report meanings; `PART-05` derives multiplicity and dominant source; four owners retain different lifecycle histories; three decision owners combine independently owned inputs; `PART-13` suppresses reachable competing proposals; and `PART-14` derives a total state/action-dependent mode and coordinated outputs. Direct field carrying at `PART-13` and copied fields at `PART-14` are explicitly uncredited. No credited usage is a copier, rename, bundle, splitter, router, or bijective translator.

## Complete typed directed semantic interaction inventory

INT-01: `image_event_qualification.imageFacts` shall provide `ImageFacts` to `fault_composition.imageFacts`.

INT-02: `image_event_qualification.imageFacts` shall provide `ImageFacts` to `evidence_lifecycle.imageFacts`.

INT-03: `image_event_qualification.imageFacts` shall provide `ImageFacts` to `admission_decision.imageFacts`.

INT-04: `image_event_qualification.imageFacts` shall provide `ImageFacts` to `artifact_lifecycle.imageFacts`.

INT-05: `doctor_event_qualification.reviewFacts` shall provide `ReviewFacts` to `fault_composition.reviewFacts`.

INT-06: `doctor_event_qualification.reviewFacts` shall provide `ReviewFacts` to `review_lifecycle.reviewFacts`.

INT-07: `preparation_context_assessment.contextFacts` shall provide `ContextFacts` to `fault_composition.contextFacts`.

INT-08: `preparation_context_assessment.contextFacts` shall provide `ContextFacts` to `evidence_lifecycle.contextFacts`.

INT-09: `preparation_context_assessment.contextFacts` shall provide `ContextFacts` to `admission_decision.contextFacts`.

INT-10: `availability_service_assessment.serviceFacts` shall provide `ServiceFacts` to `fault_composition.serviceFacts`.

INT-11: `availability_service_assessment.serviceFacts` shall provide `ServiceFacts` to `admission_decision.serviceFacts`.

INT-12: `availability_service_assessment.serviceFacts` shall provide `ServiceFacts` to `availability_decision.serviceFacts`.

INT-13: `fault_composition.faultSummary` shall provide `FaultSummary` to `recovery_control.faultSummary`.

INT-14: `recovery_control.recoveryFrame` shall provide `RecoveryFrame` to `evidence_lifecycle.recoveryFrame`.

INT-15: `recovery_control.recoveryFrame` shall provide `RecoveryFrame` to `admission_decision.recoveryFrame`.

INT-16: `recovery_control.recoveryFrame` shall provide `RecoveryFrame` to `artifact_lifecycle.recoveryFrame`.

INT-17: `recovery_control.recoveryFrame` shall provide `RecoveryFrame` to `availability_decision.recoveryFrame`.

INT-18: `recovery_control.recoveryFrame` shall provide `RecoveryFrame` to `review_lifecycle.recoveryFrame`.

INT-19: `recovery_control.recoveryFrame` shall provide `RecoveryFrame` to `availability_arbitration.recoveryFrame`.

INT-20: `evidence_lifecycle.evidenceFrame` shall provide `EvidenceFrame=(evidenceState,contextAccepted)` to `admission_decision.evidenceFrame`.

INT-21: `evidence_lifecycle.evidenceFrame` shall provide `EvidenceFrame` to `availability_decision.evidenceFrame`.

INT-22: `admission_decision.admissionFrame` shall provide `AdmissionFrame=(outcome,admissionReason)` to `artifact_lifecycle.admissionFrame`.

INT-23: `admission_decision.admissionFrame` shall provide `AdmissionFrame` to `availability_arbitration.admissionFrame` to preserve the selected rejection/quarantine or acceptance reason without re-derivation.

INT-24: `artifact_lifecycle.artifactFrame` shall provide `ArtifactFrame=(artifactState,withdrawProposal,rejectProposal,acceptProposal,closureWindow)` to `availability_decision.artifactFrame`.

INT-25: `artifact_lifecycle.artifactFrame` shall provide `ArtifactFrame` to `availability_arbitration.artifactFrame`.

INT-26: `availability_decision.availabilityFrame` shall provide `AvailabilityDecisionFrame=(decision,blockReason)` to `review_lifecycle.availabilityFrame`.

INT-27: `availability_decision.availabilityFrame` shall provide `AvailabilityDecisionFrame` to `presentation_decision.availabilityFrame`.

INT-28: `review_lifecycle.reviewFrame` shall provide `ReviewFrame=(reviewState)` to `presentation_decision.reviewFrame`.

INT-29: `presentation_decision.presentationFrame` shall provide `PresentationFrame=(proposal)` to `availability_arbitration.presentationFrame`.

INT-30: `availability_arbitration.decisionFrame` shall provide `DecisionFrame=(selectedAction,selectedReason,recoveryFrame,evidenceState,artifactState,reviewState,availabilityDecision)` to `publication_composition.decisionFrame`.

INT-31: `evidence_lifecycle.evidenceFrame` shall provide `EvidenceFrame` directly to `availability_arbitration.evidenceFrame` so `PART-13` can carry the owner-supplied `evidenceState` without recomputation.

INT-32: `availability_decision.availabilityFrame` shall provide `AvailabilityDecisionFrame` directly to `availability_arbitration.availabilityFrame` so `PART-13` can carry the owner-supplied availability decision without recomputation.

INT-33: `review_lifecycle.reviewFrame` shall provide `ReviewFrame` directly to `availability_arbitration.reviewFrame` so `PART-13` can carry the owner-supplied `reviewState` without recomputation.

INT-34: `doctor_event_qualification.reviewFacts` shall provide `ReviewFacts` to `artifact_lifecycle.reviewFacts` for the narrowly bounded same-evaluation closure/replacement rule.

INT-AUD-01: [Interaction recount] `INT-01` through `INT-34` are the complete semantic inventory: 13 qualifier fan-out flows, one fault-composition flow, six recovery fan-out flows, three evidence flows, two admission flows, two artifact flows, three availability flows, two review flows, one presentation flow, and one arbitration-to-publication flow. Root delegations and containment plumbing are support connections and receive no semantic credit.

## Risks, fault propagation, recovery, priority, and composition

RISK-01: [Pilot risk] Invalid or failed support evidence could otherwise make an external image appear available for Doctor analysis; the consequence is false availability within this abstract coordination system, not a claimed clinical harm.

RISK-02: [Pilot risk] A one-event recovery could restore a previously staged artifact or replay work accepted on the reopening evaluation; the consequence is availability without fresh post-recovery evidence.

RISK-03: [Pilot risk] Simultaneous withdrawal, rejection, closure, acceptance, and presentation proposals could otherwise yield inconsistent upstream and Doctor-facing outputs.

FAULT-01: [Required fault propagation] Any invalid image, Doctor, context, or service observation, or any reported upstream, context, or service failure, shall propagate in the same evaluation from its local qualifier through `PART-05`, `PART-06`, lifecycle and decision owners, `PART-13`, and `PART-14`; the result shall be `SAFE_WITHHOLD`, `PAUSE_DELIVERY`, hidden Doctor visibility, and an effective fault identity without downstream recomputation.

VER-FAULT-01: [Contract inspection and bounded analysis] Pass only if each single local source and selected simultaneous-source combinations traverse `INT-01/05/07/10`, `INT-13`, `INT-14..19`, downstream decision flows, and `INT-30`, while no ordinary action or nonhidden visibility survives.

FAULT-02: [Required recovery behavior] Invalid recovery input shall latch with dominant fault `RECOVERY_INPUT`. With no new fault, only fresh `RESET` from `LATCHED`, later fresh `VERIFY_OK` from `VERIFYING`, and later fresh `RESUME` from `ARMED` shall reopen recovery; any out-of-order event shall stutter, and any new fault shall dominate.

VER-FAULT-02: [Ordered trace analysis] Pass only if all three required events occur on distinct evaluations, out-of-order and same-phase wrong events do not progress, a fault interrupts every phase, reopening neutralizes the three operational lifecycle owners, and later fresh `GENERATED` plus `REQUEST_VIEW` are needed to regain visible availability.

PRIORITY-01: [Required priority] Effective priority shall be fault or closed recovery, upstream withdrawal, evidence/service rejection or quarantine, Doctor closure, new-image acceptance, Doctor open or offer, then hold. `OPEN` and `OFFER` are mutually exclusive variants inside one presentation-priority branch.

VER-PRIO-01: [Reachability and contract analysis] Pass only if witnesses demonstrate withdrawal over open, rejection over open, closure over simultaneous replacement acceptance with the replacement left unretained, acceptance over simultaneous open, and fault over every ordinary proposal.

COMP-01: [Required composition] `PART-14` shall map one received `DecisionFrame` to both root outputs: `SAFE_WITHHOLD` to `PAUSE_DELIVERY/HIDDEN`; `WITHDRAW` to `ACK_WITHDRAWN/HIDDEN`; `REJECT` to `REJECT_IMAGE/HIDDEN`; `ACCEPT` to `ACCEPT_IMAGE/OFFERED`; `CLOSE` to `NO_ACTION/CLOSED`; `OPEN` to `NO_ACTION/VISIBLE`; `OFFER` to `NO_ACTION/OFFERED`; and `HOLD` to `NO_ACTION/HIDDEN`. It shall set `reason=selectedReason` on every computation and copy all received recovery, evidence, artifact, review, and effective-fault fields. `publicMode` shall be total under this order: effective fault gives `FAULT`; otherwise closed recovery gives `RECOVERY`; otherwise a quarantined artifact gives `QUARANTINED`; otherwise selected closure gives `CLOSED`; otherwise viewing state or selected opening gives `VIEWING`; otherwise offered state or selected `OFFER`/`ACCEPT` gives `OFFERED`; otherwise a staged artifact gives `STAGED`; otherwise `IDLE`.

VER-COMP-01: [Contract and single-writer inspection] Pass only if every action maps to exactly one complete output tuple, both root outputs have only `PART-14` as writer, and neither the publisher nor analyzer recomputes qualification, lifecycle, availability, or priority policy.

## Exactly thirty nontrivial ordered contract cases

CASE-01: [Recovery owner; highest priority] If a received local fault exists or `recoveryEvent` is invalid, next recovery shall be `LATCHED` and closed. Invalid recovery input selects effective dominant fault `RECOVERY_INPUT`; effective multiplicity is true exactly when local multiplicity already exists or recovery invalidity coincides with a local fault.

CASE-02: [Recovery owner] With no fault and prior recovery `HEALTHY`, next recovery shall remain `HEALTHY` and open; recovery events presented without a preceding latch shall not create progress.

CASE-03: [Recovery owner] With no fault, prior recovery `LATCHED`, and fresh `RESET`, next recovery shall be `VERIFYING` and closed.

CASE-04: [Recovery owner] With no fault, prior recovery `VERIFYING`, and fresh `VERIFY_OK`, next recovery shall be `ARMED` and closed.

CASE-05: [Recovery owner] With no fault, prior recovery `ARMED`, and fresh `RESUME`, next recovery shall be `HEALTHY` and open with `recoveryReleased=true` for that evaluation.

CASE-06: [Recovery owner; closed-phase stutter] With no fault and none of `CASE-03` through `CASE-05` applicable, prior `LATCHED`, `VERIFYING`, or `ARMED` shall be preserved and closed.

CASE-07: [Evidence owner; highest priority] If recovery is closed, next evidence shall be `RECOVERY`.

CASE-08: [Evidence owner; recovery release] If recovery is open and prior evidence is `RECOVERY`, next evidence shall be `EMPTY`; concurrent image and context facts shall be ignored.

CASE-09: [Evidence owner] If recovery is open, prior evidence is not `RECOVERY`, and image facts indicate withdrawal, next evidence shall be `EMPTY`.

CASE-10: [Evidence owner] If recovery is open, prior evidence is not `RECOVERY`, and a new image is present, next evidence shall be `ACCEPTED` exactly for complete context and `REJECTED` otherwise.

CASE-11: [Evidence owner; ordinary stutter] If recovery is open and no new image or withdrawal applies, prior `EMPTY`, `ACCEPTED`, or `REJECTED` shall be preserved.

CASE-12: [Artifact owner; highest priority] If recovery is closed, next artifact shall be `RECOVERY` and all ordinary proposals shall be false.

CASE-13: [Artifact owner; recovery release] If recovery is open and prior artifact is `RECOVERY`, next artifact shall be `EMPTY`; concurrent image and admission facts shall be ignored.

CASE-14: [Artifact owner] If recovery is open, prior artifact is not `RECOVERY`, and image facts indicate withdrawal, next artifact shall be `WITHDRAWN` with only `withdrawProposal=true`.

CASE-15: [Artifact owner] If recovery is open, no withdrawal applies, and admission is `REJECT` or `QUARANTINE`, next artifact shall be `QUARANTINED` with only `rejectProposal=true`.

CASE-16: [Artifact owner] If recovery is open, no earlier artifact case applies, and admission is `ADMIT`, only `acceptProposal` shall be true. If prior artifact is `STAGED` and qualified Doctor facts are `VIEW_ACK` or `VIEW_DISMISS`, next artifact shall be `EMPTY` with `closureWindow=true`; otherwise next artifact shall be `STAGED` with `closureWindow=false`. This conditional refinement remains one admission case.

CASE-17: [Artifact owner; ordinary stutter] If recovery is open and no withdrawal or non-`NONE` admission applies, prior nonrecovery artifact state shall be preserved and all three proposals shall be false.

CASE-18: [Review owner; highest priority] If recovery is closed, next review shall be `RECOVERY`.

CASE-19: [Review owner; recovery release] If recovery is open and prior review is `RECOVERY`, next review shall be `IDLE`; concurrent Doctor and availability facts shall be ignored.

CASE-20: [Review owner] If recovery is open, prior review is not `RECOVERY`, and availability is `BLOCKED`, next review shall be `IDLE`.

CASE-21: [Review owner] If availability is `ALLOWED` and qualified Doctor facts are `VIEW_REQUEST`, next review shall be `VIEWING`.

CASE-22: [Review owner] If availability is `ALLOWED` and qualified Doctor facts are `VIEW_ACK` or `VIEW_DISMISS`, next review shall be `ACKNOWLEDGED`.

CASE-23: [Review owner; available stutter/default] If availability is `ALLOWED` with no qualified Doctor event, next review shall remain `VIEWING` when prior review is `VIEWING` and otherwise shall be `OFFERED`.

CASE-24: [Arbitration owner; highest priority] If effective fault is present or recovery is closed, selected action shall be `SAFE_WITHHOLD` with reason `FAULT_OR_RECOVERY`.

CASE-25: [Arbitration owner] With open recovery and a true withdrawal proposal, selected action shall be `WITHDRAW`.

CASE-26: [Arbitration owner] With open recovery, no withdrawal, and a true reject proposal, selected action shall be `REJECT`; selected reason shall be `SERVICE_QUARANTINE` for received admission `QUARANTINE` and `EVIDENCE_REJECTION` for received admission `REJECT`.

CASE-27: [Arbitration owner] With no earlier condition and presentation proposal `CLOSE`, selected action shall be `CLOSE`.

CASE-28: [Arbitration owner] With no earlier condition and a true accept proposal, selected action shall be `ACCEPT`.

CASE-29: [Arbitration owner] With no earlier condition and presentation proposal `OPEN` or `OFFER`, selected action shall equal the corresponding presentation action and reason.

CASE-30: [Arbitration owner; default] With no earlier condition, selected action shall be `HOLD` with reason `NO_ELIGIBLE_WORK`.

CASE-AUD-01: [Partition audit] Recovery cases cover every prior recovery state and event after fault priority; evidence cases cover closed recovery, release, withdrawal, new image, and stutter; artifact cases cover closed recovery, release, withdrawal, rejection/quarantine, admission, and stutter; review cases cover closed recovery, release, blocked availability, request, acknowledgement/dismissal, and available default; arbitration cases cover every effective priority outcome. The ordered total is exactly `6+5+6+6+7=30`.

## Required behaviors and objective pass criteria

BEH-01: [Nominal admission] A fresh generated-image event with complete reported preparation context, ready service, and healthy recovery shall produce accepted evidence, `ADMIT`, a staged artifact, `ACCEPT`, `ACCEPT_IMAGE`, and offered Doctor visibility in the same logical evaluation.

VER-BEH-01: [Source inspection and bounded analysis] Pass only if the named fact, decision, state, action, and both outputs occur without a monitoring-start or acquisition-authorization state.

BEH-02: [Nominal review] With staged accepted evidence and allowed availability, a fresh Doctor view request shall produce review state `VIEWING`, action `OPEN`, and visible availability; a later fresh acknowledgement or dismissal shall produce `CLOSE` and closed visibility.

VER-BEH-02: [Two-step trace analysis] Pass only if opening requires allowed availability, closure occurs on a later event, and neither output claims analysis completion or diagnostic result.

BEH-03: [Evidence rejection] A fresh generated-image event with missing or partial preparation context shall be rejected or quarantined and shall not become visible.

VER-BEH-03: [Contract and analyzer inspection] Pass only if all `NO_CONTEXT` and `PARTIAL_CONTEXT` variants lead to `REJECTED`, a rejection proposal, and hidden visibility while no fault is fabricated solely for incompleteness.

BEH-04: [Service degradation] A degraded but nonfailed availability service shall prevent admission or availability without latching recovery; later ready service alone shall not invent a new image event.

VER-BEH-04: [State trace analysis] Pass only if degradation yields quarantine/blocking, recovery remains healthy, and a later fresh generated-image event is necessary for admission.

BEH-05: [Withdrawal] A fresh upstream withdrawal shall empty evidence, move the artifact to withdrawn, and select withdrawal over any simultaneous presentation proposal.

VER-BEH-05: [Priority witness] Pass only if a reachable staged/viewing pre-state with simultaneous withdrawal and view request produces `ACK_WITHDRAWN/HIDDEN` and no open action.

BEH-06: [Benign persistence] With healthy recovery and no fresh image or Doctor event, accepted staged evidence and an active view may persist, but no new upstream disposition shall be fabricated.

VER-BEH-06: [Contract analysis] Pass only if state persistence follows `CASE-11`, `CASE-17`, and `CASE-23`, while arbitration/publication produce only the presentation action justified by retained review state or `NO_ACTION` as mapped.

## Modes and transitions

MODE-01: [Externally distinguishable public modes] `FAULT` and `RECOVERY` hide availability and pause upstream delivery; `QUARANTINED` hides a rejected artifact; `STAGED` or `OFFERED` may expose an offer; `VIEWING` exposes visible availability; `CLOSED` records a just-processed closure; and `IDLE` exposes no item.

TRANS-01: [Recovery transition] `HEALTHY -> LATCHED` is triggered by any effective fault; `LATCHED -> VERIFYING` by fresh `RESET`; `VERIFYING -> ARMED` by later fresh `VERIFY_OK`; and `ARMED -> HEALTHY` by later fresh `RESUME`. A fault from any phase returns to `LATCHED`.

TRANS-02: [Evidence transition] Open-recovery fresh generation moves evidence to `ACCEPTED` or `REJECTED` according to context; withdrawal moves it to `EMPTY`; closed recovery moves it to `RECOVERY`; release moves it from `RECOVERY` to `EMPTY`.

TRANS-03: [Artifact transition] Open-recovery admission moves the artifact to `STAGED` or `QUARANTINED`, except that a replacement admitted against prior `STAGED` state with simultaneous acknowledgement/dismissal emits the acceptance conflict proposal but stores `EMPTY` for the closure evaluation; withdrawal moves it to `WITHDRAWN`; closed recovery moves it to `RECOVERY`; release moves it from `RECOVERY` to `EMPTY`.

TRANS-04: [Review transition] Allowed availability plus request moves review to `VIEWING`; acknowledgement or dismissal moves it to `ACKNOWLEDGED`; blocked availability moves it to `IDLE`; closed recovery moves it to `RECOVERY`; release moves it from `RECOVERY` to `IDLE`.

## Exactly ten scenario families

SCN-01: [Nominal image admission family] From neutral state, `GENERATED + BELT_AND_CALIBRATION_REPORTED + READY` produces accepted evidence, staged artifact, upstream acceptance, and offered visibility; this covers `BEH-01`.

SCN-02: [Doctor review lifecycle family] A later `REQUEST_VIEW`, followed by a still-later `ACK_VIEW` or `DISMISS_VIEW`, produces visible then closed availability without claiming analysis content; this covers `BEH-02`.

SCN-03: [Incomplete-context rejection family] New images paired separately with no context, belt-only, and calibration-only reports are rejected or quarantined without latching a fault; this covers `BEH-03`.

SCN-04: [Degraded-service family] New image plus complete context under degraded service remains unavailable, and transition to ready service without a fresh generated event does not admit it; this covers `BEH-04`.

SCN-05: [Withdrawal-priority family] From a visible or offered artifact, simultaneous fresh withdrawal and Doctor request selects withdrawal and hides the item; this covers `BEH-05` and one ordinary conflict.

SCN-06: [Closure-versus-replacement family] From a visible staged artifact, simultaneous Doctor acknowledgement or dismissal and a fresh otherwise admissible replacement shall produce both close and acceptance proposals, select closure, publish closed visibility, store the artifact as `EMPTY`, and prevent automatic offering on the next no-event evaluation; only a later fresh `GENERATED` event may create another admission.

SCN-07: [Single-source fault propagation family] Each invalid input class and each reported-failure class independently causes same-evaluation safe withholding, upstream pause, hidden visibility, and a latched recovery state; this covers `FAULT-01`.

SCN-08: [Simultaneous-fault composition family] Selected pairs spanning image, Doctor, context, and service sources demonstrate effective multiplicity and local dominant-fault ordering; recovery-input invalidity then demonstrates dominance over a simultaneous local fault.

SCN-09: [Three-event recovery and fresh-work family] After a fault, separate `RESET`, `VERIFY_OK`, and `RESUME` evaluations progress `LATCHED -> VERIFYING -> ARMED -> HEALTHY`; operational states neutralize on resume, and only later fresh `GENERATED` and later fresh `REQUEST_VIEW` restore visible availability.

SCN-10: [Benign persistence family] With no fresh events and no fault, neutral state remains neutral, a staged accepted artifact remains staged, and a viewing review remains viewing with no fabricated admission or withdrawal; this covers `BEH-06`.

SCN-AUD-01: [Scenario audit] The ten families have distinct traces: admission, review, incomplete evidence, degraded service, withdrawal conflict, closure/replacement conflict, single faults, simultaneous faults, three-phase recovery/fresh work, and benign persistence. Variants inside a family do not receive additional family credit.

## Bounded analysis, traceability, and acceptance

ANA-01: [Finite analysis obligation] The raw boundary product is exactly `6*6*7*5*6=7,560` snapshots and the four pre-state product is exactly `4*4*5*5=400`, yielding `3,024,000` one-step combinations. The analyzer shall execute owner-local relations in interaction order and retain the ten multi-step scenario traces; it shall not use a centralized duplicate policy oracle.

ANA-02: [Coverage obligation] Enumeration shall confirm exactly one matching case per case-bearing owner, output-domain closure, complete initialization, action/output and total-public-mode consistency, fault dominance, closed-recovery inhibition, ordinary-priority witnesses, closure/replacement post-arbitration state and next-step non-offering, and post-recovery fresh-work behavior for all retained checks.

TRACE-01: [Bidirectional trace gate] Every actionable abstract ID shall map to one or more model elements, contracts, analyzer checks, or an explicit deferred/informational disposition. Every significant component, port, connection, state, contract, and analyzer rule shall trace to an abstract ID or carry an explicit generated-support justification.

SUPPORT-01: [Allowed generated support] The Model may add finite enum/flat-record definitions, one root and behavior-free process layer if needed, boundary delegations, containment plumbing, deterministic initialization, owner-local tuple-consistency clauses, trace declarations, and bounded-analyzer mechanics. None receives semantic usage, interaction, case, owner, or scenario credit.

PASS-STRUCT-01: [Objective structural pass] Pass only with exactly 14 credited usages, exactly 34 credited cross-usage interactions, exactly 30 credited ordered cases, exactly 10 scenario families, one root usage, one weakly connected semantic region, containment depth one through two, and no padding or unexplained addition.

PASS-CONTRACT-01: [Objective behavioral pass] Pass only if all owner partitions are total and mutually exclusive, initialization is deterministic, every output field is constrained, priority conflicts are reachable, every fault propagates to both outputs, and recovery plus later fresh-work paths pass bounded analysis.

PASS-VERIFY-01: [Verification gate] Pass only if canonical source typechecks, connections resolve with compatible direction/type, trace coverage is complete, the independent harness executes the retained analyzer successfully, and every required behavior/fault verification criterion above has objective evidence.

PASS-VALID-01: [Validation gate] Pass only if Designer review finds that the implementation manages availability of externally generated EIT images for Doctor analysis, keeps acquisition and diagnosis outside, preserves all exclusions and assumptions, and does not drift into the replicate-1 monitoring/acquisition purpose.

DEFER-VERIFY-01: [Not-run declaration] Code generation, application execution, formal semantic proof beyond retained contracts and analyzer checks, physical timing, image reconstruction, image-quality assessment, diagnosis, treatment, patient outcome, electrical safety, regulatory compliance, certification, and production readiness are explicitly excluded or deferred and shall never be reported as passed.

## Diversity compliance

DIV-01: [Frozen-card selection] The primary controlled purpose is EIT-image catalog admission and Doctor review availability, with acquisition represented only by the external `GENERATED`/failure/withdrawal event at `MON-IMG-01`.

DIV-02: [Closest baseline] The closest replicate-1 baseline is the hard `EIT monitoring and acquisition supervisor`, whose organizing state and priority coordinate monitoring start, acquisition cycle, image generation, and release.

DIV-03: [Boundary difference] This system has no Doctor monitoring-start input, equipment-readiness input, impedance-batch input, acquisition command, monitoring command, or image-generation command. Its controls are catalog disposition and Doctor-facing availability after an upstream generated-image event.

DIV-04: [State/topology difference] The state owners retain recovery phase, administrative evidence, one admitted artifact, and Doctor review presentation; the topology is an intake/evidence/admission/artifact/availability/review graph rather than start-feasibility/session/cycle/generation/release coordination.

DIV-05: [Priority/recovery difference] Ordinary priority resolves withdrawal, rejection/quarantine, Doctor closure, admission, and presentation, not stop/start/generate/collect. Recovery requires three fresh events ending in explicit `RESUME`, neutralizes image/review state on reopening, and requires later fresh image and review events.

DIV-06: [Not extension or rename] No replicate-1 session, acquisition-cycle, collection-feasibility, generation-proposal, or release-feasibility owner survives under another name. The system begins after external image generation, controls different outputs, owns different histories, and can operate without any modeled monitoring or impedance-acquisition authorization; therefore it is neither an extension nor a repartitioning of the replicate-1 pipeline.
