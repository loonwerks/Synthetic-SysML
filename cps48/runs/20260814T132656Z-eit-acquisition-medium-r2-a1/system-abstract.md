---
abstract_id: SA-EIT-02
run_id: 20260814T132656Z-eit-acquisition-medium-r2-a1
domain_seed: eit-acquisition-seed-20260813t233941z
campaign_complexity: medium
semantic_usage_count: [9, 9]
semantic_interaction_count: [21, 21]
nontrivial_contract_case_count: [20, 20]
scenario_family_count: [7, 7]
reachable_non_root_usage_count: [10, 10]
generated_support_usage_count: [1, 1]
generated_support_route_count: [8, 8]
raw_source_port_connection_count: [29, 29]
containment_depth_beneath_root: [2, 2]
root_system_usage_count: [1, 1]
weakly_connected_semantic_region_count: [1, 1]
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# EIT Image Review Availability Coordinator — Approved System Abstract

## Need, purpose, and operational context

NEED-01: A bounded logical system is needed to accept opaque upstream impedance-batch events, coordinate an external EIT-image generation service, and expose only a matched generated-image token for a Doctor's requested review session while making faults, conflicts, and recovery observable.

PURPOSE-01: The EIT Image Review Availability Coordinator shall govern image-generation work availability and Doctor review exposure; it shall not authorize monitoring, supervise impedance acquisition, reconstruct image content, analyze an image, diagnose, treat, or control physical patient equipment.

CAP-01: The principal capabilities are upstream-batch qualification, generator-feedback qualification, review-access qualification, generator outcome and recovery assessment, workflow arbitration, generation-slot state control, review-session state control, generation-command policy, and coordinated availability/status publication.

MISSION-01: The controlled purpose is to make one opaque, externally generated EIT-image token available for Doctor analysis only after a matching generation result and a fresh applicable open request. `AVAILABLE_FOR_REVIEW` means logical access in this pilot, not image quality, diagnostic utility, clinical correctness, or completion of analysis.

SEM-01: One logical evaluation shall observe five current boundary inputs and one of eight legal committed pre-state pairs, derive qualifications and exactly one effective workflow action, commit at most one next value for each of two state owners, and then derive all outputs. This ordering is a deterministic pilot abstraction, not a physical sampling, latency, concurrency, or scheduler claim.

## Evidence and claim strata

PROV-HBK-01: Handbook-derived methodology requires an explicit boundary, implementation-independent purpose, cohesive allocation, unique trace identifiers, complete finite partitions, alternatives, assumptions, verification criteria, and validation distinct from verification. These are engineering-method constraints rather than EIT facts.

PROV-SEED-01: The frozen seed grounds the actors `Doctor`, `EngineerTechnician`, `Patient`, and `EITSystem`; the vocabulary of applying an electrode belt, calibration, monitoring start, impedance-data collection, EIT-image generation, and EIT-image analysis; and the stated actor/use-case associations.

PROV-SEED-02: The seed establishes no sequence, interface, representation, identifier, validity, matching, availability, authorization, priority, state, fault, recovery, or success semantics. It leaves `EITSystem` versus `EITSystemBoundary` ambiguous and gives the Patient no associated use case.

PROV-PILOT-01: This abstract introduces the finite `A` and `B` correlation tokens, event meanings, qualification relations, two state spaces, one-slot replacement policy, action priority, fault blocking, reset behavior, review-access policy, and output meanings as pilot assumptions. None is attributed to the source corpus.

PROV-ARCH-01: The selected architecture contains exactly nine semantic responsibility usages and the 21 typed directed semantic interactions in `INT-01` through `INT-21`. One behavior-free containment Process and eight boundary-delegation routes are generated support and receive no semantic usage, interaction, owner, case, or scenario credit.

PROV-DEFER-01: Electrode preparation and calibration execution, monitoring authorization, physical acquisition, impedance values, image reconstruction algorithms, image pixels, image quality, automated analysis, diagnosis, treatment, electrical safety, patient outcome, timing performance, regulatory compliance, certification, code generation, execution, formal proof, and production readiness are deferred or excluded and shall not be reported as realized.

## Scope and system boundary

SCOPE-IN-01: Inside the modeled boundary are only the nine responsibilities in `PART-01` through `PART-09`, the generation-slot and review-session states, the finite qualification and priority policies, and the three controlled outputs.

SCOPE-OUT-01: The Doctor, EngineerTechnician, Patient, electrode belt, preparation and calibration work, monitoring, impedance acquisition, upstream batch producer, physical or software image reconstruction service, review display, user interface, Doctor analysis, clinical workflow, storage, and physical environment are outside the modeled boundary.

CTX-01: The Doctor is an external review requester and receives logical review availability and workflow status, consistent only with the seed association to image analysis; the coordinator neither performs analysis nor assigns exclusive clinical authority.

CTX-02: The EngineerTechnician remains external nonparticipating context because the selected scope excludes belt application and calibration. No image-generation or review authority is inferred from the seed's preparation associations.

CTX-03: The Patient remains declared external context with no modeled input, output, consent, sensing, or control interaction because the seed supplies no Patient/use-case association.

CTX-04: The Upstream Impedance Batch Source emits at most one opaque batch event per logical evaluation. It represents completed external acquisition only as an upstream event and receives no command from this system.

CTX-05: The External EIT Image Generation Service receives a logical generation command, reports at most one generation feedback event, and may issue a workflow-reset event. It owns actual reconstruction and all content semantics, which remain outside this abstract.

CTX-06: The Review Access Surface reports whether logical access is available and receives the review-availability token for the Doctor. Presentation, storage, security, and usability are outside the modeled boundary.

CTX-07: The source-named `EITSystem` actor is treated as unresolved vocabulary that may encompass viewpoints represented by `CTX-04` or `CTX-05`; it is not silently equated to this narrower coordinator or to the source's system boundary.

## Exact finite boundary inputs

MON-01: `batchEvent : BatchEvent` is supplied by `CTX-04` and has exactly `{NO_BATCH_EVENT, INVALID_BATCH_EVENT, BATCH_A_AVAILABLE, BATCH_B_AVAILABLE}`. `A` and `B` are opaque correlation tokens and carry no impedance value or quality meaning.

MON-02: `generatorFeedback : GeneratorFeedback` is supplied by `CTX-05` and has exactly `{NO_GENERATOR_FEEDBACK, GENERATION_FAILED, IMAGE_A_GENERATED, IMAGE_B_GENERATED}`. A generated label is an external event claim subject to matching policy, not evidence of image correctness.

MON-03: `viewerObservation : ViewerObservation` is supplied by `CTX-06` and has exactly `{VIEWER_OBSERVATION_INVALID, VIEWER_UNAVAILABLE, VIEWER_AVAILABLE}`.

MON-04: `doctorRequest : DoctorRequest` is supplied by `CTX-01` and has exactly `{NO_DOCTOR_REQUEST, OPEN_AVAILABLE_IMAGE, CLOSE_REVIEW}`.

MON-05: `recoveryRequest : RecoveryRequest` is supplied by `CTX-05` and has exactly `{NO_RECOVERY_REQUEST, RESET_GENERATION_WORKFLOW}`.

## Exact finite controlled outputs

CTRL-01: `generationCommand : GenerationCommand` is delivered to `CTX-05` and has exactly `{NO_GENERATION_COMMAND, GENERATE_FROM_BATCH_A, GENERATE_FROM_BATCH_B}`. It is a logical request and does not implement reconstruction or prove service response.

CTRL-02: `reviewAvailability : ReviewAvailability` is delivered to `CTX-06` for `CTX-01` and has exactly `{NO_IMAGE_AVAILABLE, IMAGE_A_AVAILABLE_FOR_REVIEW, IMAGE_B_AVAILABLE_FOR_REVIEW}`. No image content crosses this finite boundary.

CTRL-03: `workflowStatus : WorkflowStatus` is delivered to `CTX-01` and `CTX-05` as one logical record containing the committed generation state, committed review state, request disposition, and public notice. Shared status does not imply identical presentation or responsibility.

## Finite internal concepts

TYPE-01: `BatchCategory` has exactly `{NO_BATCH, INVALID_BATCH, USABLE_BATCH_A, USABLE_BATCH_B}`; its category projection preserves reason or identity but earns no owner credit by itself.

TYPE-02: `BatchAssessment` is a flat record with `category : BatchCategory` and `usable : Boolean`. Its legal relation contains `NO_BATCH/false`, `INVALID_BATCH/false`, `USABLE_BATCH_A/true`, and `USABLE_BATCH_B/true`; the many-to-one Boolean is `PART-01`'s credited fact.

TYPE-03: `GenerationState` has exactly `{GENERATION_EMPTY, GENERATING_A, GENERATING_B, IMAGE_READY_A, IMAGE_READY_B, GENERATION_BLOCKED}`.

TYPE-04: `ReviewState` has exactly `{REVIEW_CLOSED, REVIEWING_A, REVIEWING_B}`. The only legal cross-state pairs are `EMPTY/CLOSED`, `GENERATING_A/CLOSED`, `GENERATING_B/CLOSED`, `READY_A/CLOSED`, `READY_B/CLOSED`, `READY_A/REVIEWING_A`, `READY_B/REVIEWING_B`, and `BLOCKED/CLOSED`.

TYPE-05: `FeedbackCondition` has exactly `{NO_RESULT, MATCHED_IMAGE_A, MATCHED_IMAGE_B, FEEDBACK_FAULT}`; `FeedbackAssessment` contains `condition` and `matched : Boolean`, true only for either matched-image value.

TYPE-06: `ViewerCondition` has exactly `{REVIEW_ACCESS_UNAVAILABLE, REVIEW_ACCESS_AVAILABLE}`; `ViewerAssessment` contains `condition` and `accessible : Boolean`, false for invalid or unavailable raw observation and true only for available.

TYPE-07: `GeneratorProposal` has exactly `{NO_GENERATOR_PROPOSAL, BLOCK_GENERATION, ACCEPT_IMAGE_A, ACCEPT_IMAGE_B, CLEAR_GENERATION_BLOCK}`; `ProposalCondition` has exactly `{NO_PROPOSAL_CONDITION, MATCHED_COMPLETION, FEEDBACK_REJECTED, RESET_APPLICABLE, RESET_INAPPLICABLE}`; `GeneratorProposalRecord` is a flat record containing one value of each, fully constrained by cases 09–10.

TYPE-08: `WorkflowAction` has exactly `{NO_WORKFLOW_ACTION, BLOCK_ACTION, ACCEPT_IMAGE_A_ACTION, ACCEPT_IMAGE_B_ACTION, CLEAR_BLOCK_ACTION, START_BATCH_A_ACTION, START_BATCH_B_ACTION, OPEN_IMAGE_A_ACTION, OPEN_IMAGE_B_ACTION, CLOSE_REVIEW_ACTION}`.

TYPE-09: `RequestDisposition` has exactly `{NO_REQUEST_DISPOSITION, ACCEPTED, REJECTED, PREEMPTED, RECOVERY_APPLIED}`.

TYPE-10: `DecisionNotice` has exactly `{NO_DECISION_NOTICE, INVALID_BATCH_NOTICE, GENERATOR_BUSY_NOTICE, FEEDBACK_FAULT_NOTICE, RESET_REJECTED_NOTICE, RESET_CLEARED_NOTICE, VIEWER_UNAVAILABLE_NOTICE, NO_IMAGE_READY_NOTICE, IMAGE_REPLACED_NOTICE, IMAGE_OPENED_NOTICE, IMAGE_CLOSED_NOTICE, REQUEST_PREEMPTED_NOTICE}`.

TYPE-11: `WorkflowDecision` is a flat record containing `action : WorkflowAction`, `disposition : RequestDisposition`, and `notice : DecisionNotice`; cases 11–14 constrain every field for every producer input.

TYPE-12: `GenerationDecisionSnapshot` is a flat record containing generation pre-state, generation next-state, selected action, disposition, and decision notice. `ReviewDecisionSnapshot` contains review pre-state and next-state. Record projections and copied decision fields earn no independent semantic or owner credit.

TYPE-13: `PublicNotice` has exactly `{NONE, WAITING_FOR_GENERATOR, IMAGE_READY, IMAGE_AVAILABLE, INVALID_BATCH, GENERATOR_BUSY, FEEDBACK_FAULT, RECOVERY_REQUIRED, RESET_REJECTED, RESET_CLEARED, VIEWER_UNAVAILABLE, NO_IMAGE_READY, IMAGE_REPLACED, REQUEST_PREEMPTED}`; `WorkflowStatus` is a flat record containing committed generation state, committed review state, request disposition, and public notice.

TYPE-14: Every enum-valued field inspected by GUMBO shall use a field-specific classifier extensionally identical to its canonical enum when required by the trusted SysML subset. Such one-to-one representation mappings receive zero semantic usage, interaction, owner, or case credit.

## Selected semantic usages and distinct responsibilities

PART-01: `BatchQualificationOwner` shall derive `BatchAssessment` from the current upstream event, including the many-to-one `usable` fact that rejects both absence and invalidity while preserving `A` versus `B` for applicable work.

PART-02: `GeneratorFeedbackQualificationOwner` shall compare current generator feedback with the supplied committed generation pre-state and derive whether it is absent, a matching completion, or a fault caused by failure, mismatch, or unexpected feedback. It shall not infer batch content.

PART-03: `ReviewAccessQualificationOwner` shall collapse invalid and unavailable viewer observations into one unavailable qualification and distinguish only a currently available access surface.

PART-04: `GeneratorOutcomeRecoveryOwner` shall combine the feedback assessment, generation pre-state, and recovery request to derive exactly one completion, block, clear, or no-generator proposal, with fresh feedback dominating a simultaneous reset.

PART-05: `AvailabilityWorkflowArbiter` shall determine applicability and select exactly one workflow action under `PRI-01`, including the explicit Doctor-open versus newer-batch conflict, and derive its disposition and notice without writing either state.

PART-06: `GenerationSlotStateGovernor` shall be the sole owner of initialized `GenerationState` and shall derive its next state only from its pre-state and the selected workflow decision.

PART-07: `ReviewSessionStateGovernor` shall be the sole owner of initialized `ReviewState` and shall derive its next state only from its pre-state and the selected workflow decision while preserving the legal cross-state invariant.

PART-08: `GenerationCommandPolicy` shall classify the committed next generation state into exactly one logical generation command, requesting the corresponding batch only while that batch is in a generating state.

PART-09: `AvailabilityPublicationPolicy` shall combine the two committed decision snapshots to derive review availability and every `WorkflowStatus` field, including public-notice precedence and suppression of unmatched or blocked images.

## Decision and state ownership audit

OWNER-01: `PART-01` is a genuine qualification owner because two distinct raw values collapse to `usable = false` while two accepted values remain correlated; its category projection alone is uncredited.

OWNER-02: `PART-02` is a cooperating qualification owner because its result depends jointly on independently varying generator feedback and `PART-06`'s supplied pre-state, and it detects matching rather than renaming feedback.

OWNER-03: `PART-03` is a genuine qualification owner because invalid and unavailable observations collapse to the same inaccessible result used by the arbiter.

OWNER-04: `PART-04` is a cooperating decision and recovery owner because it combines qualified feedback, prior generation state, and reset request, gives fresh faults priority, and rejects reset outside the blocked state.

OWNER-05: `PART-05` is the sole applicability and priority owner because it combines four independently owned facts plus both supplied pre-states; it neither recomputes qualifications nor owns state.

OWNER-06: `PART-06` alone writes `GenerationState`, and `PART-07` alone writes `ReviewState`; initialization and cases 15–18 are their owner-local evidence.

OWNER-07: `PART-08` owns the many-to-one state-to-command relation, while `PART-09` owns the coordinated availability and public-notice relation. Copied state and disposition fields receive no credit.

OWNER-08: No root, containment Process, port, connection, route, flat-record constructor, identity conversion, enum-field projection, bundle, fan-out, or bounded analyzer is a semantic usage or owner. Central recomputation of cases 01–20 is prohibited.

## Complete typed directed semantic interaction inventory

INT-01: The root boundary sends `batchEvent : BatchEvent` to `BatchQualificationOwner`.

INT-02: The root boundary sends `generatorFeedback : GeneratorFeedback` to `GeneratorFeedbackQualificationOwner`.

INT-03: The root boundary sends `viewerObservation : ViewerObservation` to `ReviewAccessQualificationOwner`.

INT-04: The root boundary sends `doctorRequest : DoctorRequest` to `AvailabilityWorkflowArbiter`.

INT-05: The root boundary sends `recoveryRequest : RecoveryRequest` to `GeneratorOutcomeRecoveryOwner`.

INT-06: `GenerationSlotStateGovernor` sends committed `generationPreState : GenerationState` to `GeneratorFeedbackQualificationOwner` for feedback matching.

INT-07: `GenerationSlotStateGovernor` sends committed `generationPreState : GenerationState` to `GeneratorOutcomeRecoveryOwner` for reset applicability.

INT-08: `GenerationSlotStateGovernor` sends committed `generationPreState : GenerationState` to `AvailabilityWorkflowArbiter` for action applicability.

INT-09: `ReviewSessionStateGovernor` sends committed `reviewPreState : ReviewState` to `AvailabilityWorkflowArbiter` for open, close, and batch-replacement applicability.

INT-10: `BatchQualificationOwner` sends `batchAssessment : BatchAssessment` to `AvailabilityWorkflowArbiter`.

INT-11: `GeneratorFeedbackQualificationOwner` sends `feedbackAssessment : FeedbackAssessment` to `GeneratorOutcomeRecoveryOwner`.

INT-12: `ReviewAccessQualificationOwner` sends `viewerAssessment : ViewerAssessment` to `AvailabilityWorkflowArbiter`.

INT-13: `GeneratorOutcomeRecoveryOwner` sends `generatorProposal : GeneratorProposalRecord` to `AvailabilityWorkflowArbiter`.

INT-14: `AvailabilityWorkflowArbiter` sends `workflowDecision : WorkflowDecision` to `GenerationSlotStateGovernor`.

INT-15: `AvailabilityWorkflowArbiter` sends `workflowDecision : WorkflowDecision` to `ReviewSessionStateGovernor`.

INT-16: `GenerationSlotStateGovernor` sends `generationDecision : GenerationDecisionSnapshot` to `GenerationCommandPolicy`.

INT-17: `GenerationSlotStateGovernor` sends `generationDecision : GenerationDecisionSnapshot` to `AvailabilityPublicationPolicy`.

INT-18: `ReviewSessionStateGovernor` sends `reviewDecision : ReviewDecisionSnapshot` to `AvailabilityPublicationPolicy`.

INT-19: `GenerationCommandPolicy` sends `generationCommand : GenerationCommand` to the root boundary.

INT-20: `AvailabilityPublicationPolicy` sends `reviewAvailability : ReviewAvailability` to the root boundary.

INT-21: `AvailabilityPublicationPolicy` sends `workflowStatus : WorkflowStatus` to the root boundary.

## Structural bounds and realization constraints

BOUND-01: The realized model shall contain exactly one explicit root System usage and exactly nine credited semantic usages realizing `PART-01` through `PART-09` in one weakly connected semantic region.

BOUND-02: The realized model shall contain exactly 21 credited semantic directed interactions, one for each and only each `INT-*`. Fan-out interactions are distinct only where a receiving owner uses the supplied fact for a different responsibility.

BOUND-03: The realized architecture shall contain exactly ten reachable non-root usages: one behavior-free generated-support Process and nine semantic Threads, at exact containment depth two beneath the root.

BOUND-04: Exactly eight uncredited root/Process support routes—five root inputs and three root outputs—are authorized. Together with the 21 Process-local semantic connections, the raw source shall contain exactly 29 `PortConnection` declarations.

BOUND-05: Every semantic usage shall derive its named local fact, participate in at least one incoming and one outgoing semantic interaction, and trace to its `PART-*`, `OWNER-*`, and applicable `CASE-*`; no count padding or behavior in generated support is permitted.

BOUND-06: The exact campaign tuple is `9 semantic usages / 21 semantic interactions / 20 nontrivial contract cases / 7 scenario families`, within the declared medium ranges. Revisions shall trigger a complete inventory recount rather than silently preserving these numbers.

## State, transition, priority, and recovery policy

INIT-01: Generation state shall initialize to `GENERATION_EMPTY`, review state to `REVIEW_CLOSED`, generation command to `NO_GENERATION_COMMAND`, review availability to `NO_IMAGE_AVAILABLE`, and status to the corresponding states with no disposition and `NONE`. Initialization is required but is not one of the 20 nontrivial cases.

MODE-01: `GENERATION_EMPTY` is externally distinguishable by no command, no availability, and an idle status; it admits a usable fresh batch.

MODE-02: `GENERATING_A` and `GENERATING_B` are externally distinguishable by their corresponding generation command and waiting status; Doctor open is inapplicable until a matching result is committed.

MODE-03: `IMAGE_READY_A` and `IMAGE_READY_B` retain a matched opaque token with no public availability until a fresh applicable Doctor open; a newer usable batch may replace a closed ready slot only when no Doctor open wins that evaluation.

MODE-04: `GENERATION_BLOCKED` emits no generation command or availability and admits only the selected fresh reset path; ordinary batch and Doctor-open work remains rejected.

MODE-05: `REVIEWING_A` and `REVIEWING_B` are externally distinguishable by their corresponding review-availability output; closing consumes the represented ready token and returns both owners to empty/closed.

TRANS-01: `EMPTY --START_BATCH_A_ACTION--> GENERATING_A` and `EMPTY --START_BATCH_B_ACTION--> GENERATING_B`; the same starts are also permitted from `READY_A/CLOSED` or `READY_B/CLOSED` as the explicitly selected replacement policy.

TRANS-02: `GENERATING_A --ACCEPT_IMAGE_A_ACTION--> READY_A` and `GENERATING_B --ACCEPT_IMAGE_B_ACTION--> READY_B`; mismatched completion never takes either transition.

TRANS-03: Any generation state `--BLOCK_ACTION--> BLOCKED`, and the review owner simultaneously transitions to `REVIEW_CLOSED`.

TRANS-04: `BLOCKED --CLEAR_BLOCK_ACTION--> EMPTY`; the clear evaluation admits no lower-priority batch or Doctor work.

TRANS-05: `READY_A/CLOSED --OPEN_IMAGE_A_ACTION--> READY_A/REVIEWING_A` and the analogous `B` transition require accessible viewer qualification.

TRANS-06: `READY_A/REVIEWING_A --CLOSE_REVIEW_ACTION--> EMPTY/CLOSED` and the analogous `B` transition consume the finite ready token without claiming deletion of external image content.

TRANS-07: Every rejected or no-action evaluation retains both states, and every transition shall preserve one of the eight legal state pairs in `TYPE-04`.

PRI-01: Effective decision priority shall be the generator outcome/recovery assessment, including an inapplicable-reset rejection, then applicable Doctor close, then applicable Doctor open, then applicable usable fresh batch, then no action. A selected higher-priority action or rejection suppresses all lower-priority facts for that evaluation.

PRI-02: The required ordinary priority conflict occurs in `READY_A/CLOSED` or `READY_B/CLOSED` with accessible viewer, a fresh `OPEN_AVAILABLE_IMAGE`, and a simultaneous usable newer batch: Doctor open wins, the ready image becomes available, the batch is not started, and disposition is `PREEMPTED` with `REQUEST_PREEMPTED_NOTICE`.

PRI-03: Within `PART-04`, any nonempty feedback result dominates simultaneous reset: matching feedback proposes acceptance, while failed, mismatched, or unexpected feedback proposes blocking. Reset clears only a previously blocked state on a later evaluation with `NO_GENERATOR_FEEDBACK`.

REC-01: Failed, mismatched, or unexpected nonempty feedback shall block generation, close review, suppress both controlled content outputs, and publish the fault/recovery condition in the same logical evaluation.

REC-02: Recovery requires a fresh `RESET_GENERATION_WORKFLOW` while blocked and no nonempty feedback. Clearing returns to empty/closed but shall not start a concurrent batch; a later fresh batch event is required.

REC-03: Restored viewer availability alone shall not open review, and clearing generator recovery alone shall not restart generation. Both paths require their separately declared fresh request or event.

## Exact owner-local nontrivial contract-case partition

BEH-01 / CASE-01: For `NO_BATCH_EVENT` or `INVALID_BATCH_EVENT`, `BatchQualificationOwner` shall set `usable = false` while preserving `NO_BATCH` versus `INVALID_BATCH` category. Inspection and exhaustive local analysis shall show both inputs covered and both record fields constrained.

BEH-02 / CASE-02: For `BATCH_A_AVAILABLE`, `BatchQualificationOwner` shall output `USABLE_BATCH_A/true`.

BEH-03 / CASE-03: For `BATCH_B_AVAILABLE`, `BatchQualificationOwner` shall output `USABLE_BATCH_B/true`; cases 01–03 shall cover all four raw values exactly once.

BEH-04 / CASE-04: For `NO_GENERATOR_FEEDBACK`, `GeneratorFeedbackQualificationOwner` shall output `NO_RESULT/false` for every generation pre-state.

BEH-05 / CASE-05: For `IMAGE_A_GENERATED` while pre-state is `GENERATING_A`, or `IMAGE_B_GENERATED` while pre-state is `GENERATING_B`, `GeneratorFeedbackQualificationOwner` shall output the corresponding matched condition with `matched = true`.

BEH-06 / CASE-06: Every other nonempty feedback/pre-state pair—including `GENERATION_FAILED`, a mismatched `A/B` result, or any image result outside its matching generating state—shall output `FEEDBACK_FAULT/false`; cases 04–06 shall cover all 24 local pairs exactly once.

BEH-07 / CASE-07: For `VIEWER_AVAILABLE`, `ReviewAccessQualificationOwner` shall output `REVIEW_ACCESS_AVAILABLE/true`.

BEH-08 / CASE-08: For `VIEWER_OBSERVATION_INVALID` or `VIEWER_UNAVAILABLE`, `ReviewAccessQualificationOwner` shall output `REVIEW_ACCESS_UNAVAILABLE/false`; cases 07–08 shall cover all three raw values exactly once.

BEH-09 / CASE-09: If feedback condition is a matched image, `GeneratorOutcomeRecoveryOwner` shall propose the corresponding accept action; if it is `FEEDBACK_FAULT`, it shall propose `BLOCK_GENERATION`. Either result shall dominate simultaneous reset and fully constrain the proposal condition.

BEH-10 / CASE-10: If feedback condition is `NO_RESULT`, `GeneratorOutcomeRecoveryOwner` shall propose `CLEAR_GENERATION_BLOCK` exactly for blocked pre-state plus reset, record `RESET_INAPPLICABLE` for reset in every other state, and otherwise propose none. Cases 09–10 shall cover every reachable feedback/pre-state/reset combination.

BEH-11 / CASE-11: For a nonempty generator proposal, `AvailabilityWorkflowArbiter` shall select its corresponding workflow action before Doctor or batch facts; a block or clear shall use `RECOVERY_APPLIED`, a matching completion shall use `ACCEPTED`, and any suppressed lower fact shall change disposition to `PREEMPTED` without changing the action. `RESET_INAPPLICABLE` shall instead yield no action and `REJECTED` without falling through.

BEH-12 / CASE-12: With no generator proposal and `doctorRequest = CLOSE_REVIEW`, `AvailabilityWorkflowArbiter` shall select close exactly when review pre-state is `REVIEWING_A` or `REVIEWING_B`; otherwise it shall reject. A selected close precedes any batch fact.

BEH-13 / CASE-13: With no generator proposal or close request and `doctorRequest = OPEN_AVAILABLE_IMAGE`, `AvailabilityWorkflowArbiter` shall select the token-matching open action exactly for `READY_A/CLOSED` or `READY_B/CLOSED` plus accessible viewer. An applicable open preempts a simultaneous batch; an inapplicable open is rejected without falling through to batch.

BEH-14 / CASE-14: With no generator proposal or Doctor request, `AvailabilityWorkflowArbiter` shall select a usable batch start exactly when review is closed and generation is empty or ready; a ready replacement shall be explicitly noticed, while invalid input, generating, blocked, or reviewing conditions reject a nonempty batch. `NO_BATCH` yields no action and no disposition. Cases 11–14 shall be disjoint and total.

BEH-15 / CASE-15: For `START_BATCH_A/B`, `ACCEPT_IMAGE_A/B`, `BLOCK`, `CLEAR_BLOCK`, or `CLOSE_REVIEW`, `GenerationSlotStateGovernor` shall commit the exact next state in transitions 01–06 and constrain every `GenerationDecisionSnapshot` field.

BEH-16 / CASE-16: For `OPEN_IMAGE_A/B`, rejected/no action, or any other state-preserving action, `GenerationSlotStateGovernor` shall retain its pre-state. Cases 15–16 shall cover every legal generation pre-state and workflow decision without another writer.

BEH-17 / CASE-17: `ReviewSessionStateGovernor` shall set `REVIEWING_A/B` for the matching open action and shall set `REVIEW_CLOSED` for close, block, clear, or batch-start actions.

BEH-18 / CASE-18: For matching completion, rejected/no action, or every other review-preserving action, `ReviewSessionStateGovernor` shall retain its pre-state; cases 17–18 shall cover every legal review pre-state and workflow decision and preserve the cross-state invariant jointly with cases 15–16.

BEH-19 / CASE-19: `GenerationCommandPolicy` shall output `GENERATE_FROM_BATCH_A` exactly when committed next generation state is `GENERATING_A`, `GENERATE_FROM_BATCH_B` exactly when it is `GENERATING_B`, and `NO_GENERATION_COMMAND` for all other states. Contract inspection shall show no raw batch or feedback bypass.

BEH-20 / CASE-20: `AvailabilityPublicationPolicy` shall output `IMAGE_A_AVAILABLE_FOR_REVIEW` exactly for committed `READY_A/REVIEWING_A`, the analogous `B` value for `READY_B/REVIEWING_B`, and no availability otherwise. It shall constrain every status field and choose public notice in the order feedback/recovery or rejection/preemption/replacement decision notice, then blocked recovery-required, generating waiting, open availability, closed ready image, then none.

## Scenario families and bounded public traces

SCN-01: Nominal image-A generation shall start at initialized empty/closed, accept one fresh `BATCH_A_AVAILABLE`, emit `GENERATE_FROM_BATCH_A`, retain generating on `NO_GENERATOR_FEEDBACK`, accept later `IMAGE_A_GENERATED`, enter ready-A/closed, emit no generation command, and still expose no review availability before a Doctor open.

SCN-02: Nominal Doctor review shall begin ready-A/closed with viewer available, accept a fresh `OPEN_AVAILABLE_IMAGE`, expose `IMAGE_A_AVAILABLE_FOR_REVIEW`, then accept a later fresh `CLOSE_REVIEW` and end empty/closed with no availability.

SCN-03: Feedback fault blocking shall cover `GENERATING_B + IMAGE_A_GENERATED` and a separate `GENERATION_FAILED` witness; each shall enter blocked/closed in the same evaluation, emit no command or availability, and report feedback fault before any waiting or ready notice.

SCN-04: Recovery and fresh work shall begin blocked, present reset concurrently with `BATCH_B_AVAILABLE`, clear to empty/closed while preempting the batch, remain empty on a following no-event evaluation, and start B only on a still-later fresh batch event.

SCN-05: The required ordinary conflict shall begin ready-A/closed with viewer available and present Doctor open concurrently with `BATCH_B_AVAILABLE`; open shall win, A shall become available, B shall not start, and status shall report preemption.

SCN-06: Viewer denial and fresh retry shall begin ready-B/closed, reject Doctor open for invalid and unavailable viewer observations while retaining ready B, then accept a later fresh open after `VIEWER_AVAILABLE`; restored access without a fresh Doctor request shall not open review.

SCN-07: Invalid, unexpected, busy, and inapplicable inputs shall cover invalid batch while empty, a second batch while already generating, image feedback while empty, reset while not blocked, and Doctor close while review is closed. Each shall select its declared rejection or block path, keep outputs within the finite domains, and preserve or recover the legal state-pair invariant.

## Risks, mitigations, assumptions, and constraints

RISK-01: If failed, mismatched, or unexpected feedback were accepted as a matched image, the Doctor-facing boundary could expose the wrong opaque token as available.

FAULT-01: The system shall mitigate `RISK-01` through cases 04–10, 15–20: only exact state/token matches become ready; every other nonempty feedback blocks, closes review, and suppresses availability in the same evaluation. Contract inspection and exhaustive analysis pass only if no fault combination exposes an image.

RISK-02: If a newer batch replaced an already ready token while the Doctor simultaneously requested it, the requested token could become unavailable despite an applicable review action.

FAULT-02: The system shall mitigate `RISK-02` through `PRI-02` and cases 13–14: the applicable Doctor open wins over the simultaneous batch, and the batch must be presented later as a fresh event. Scenario and bounded-analysis evidence pass only if both `A` and `B` conflict variants preserve the opened token.

RISK-03: If recovery automatically restarted generation or consumed a concurrent batch on the clear evaluation, work could resume without a distinct post-recovery event.

FAULT-03: The system shall mitigate `RISK-03` through cases 09–11 and 15–18: reset only clears blocked state, suppresses lower work, and requires a later fresh batch. Verification passes only if every clear transition ends empty/closed with no generation command.

ASM-01: `CTX-04` is responsible for presenting a non-`NO_BATCH_EVENT` value for one logical evaluation and returning to `NO_BATCH_EVENT` before any later event. Rationale: this defines freshness without adding hidden counters or identifiers.

ASM-02: `CTX-01` is responsible for presenting open or close as a one-evaluation request separated by `NO_DOCTOR_REQUEST`; an inapplicable or preempted request must be freshly reissued. The seed association motivates participation but not these request semantics.

ASM-03: `CTX-05` is responsible for one generator-feedback value and one reset-request value per evaluation, returning each event input to its `NO_*` value before reissue. `A/B` feedback correlation is an abstract service assertion, not content verification.

ASM-04: `CTX-06` is responsible only for a value within `ViewerObservation`; the coordinator assumes no physical availability, security, display behavior, or usability beyond that logical report.

ASM-05: External recipients shall not interpret batch usability, matched feedback, generation command, image readiness, review availability, or status as evidence of impedance accuracy, image quality, completed analysis, diagnosis, treatment, safety, or certification.

CON-01: Exact finite domains, a single represented generation slot, at most one ready token, and the eight legal pre-state pairs are experiment constraints selected for exhaustive analysis. The Model Agent shall not add queues, histories, timestamps, counters, retries, storage, numeric content, hidden state, or additional slots without Designer revision.

CON-02: The state transitions, replacement permission, conflict priority, blocking, reset, and event-pulse semantics are selected pilot architecture and policy, not source-grounded workflow facts. Model comments and summary evidence shall preserve that distinction.

## Diversity determination

DIV-01: The selected primary scope is EIT-image generation and Doctor-review availability, with acquisition represented only by `MON-01` as an external upstream event and with no acquisition command, authorization, session, monitoring, preparation, or impedance-delivery state inside the system.

DIV-02: The closest replicate-1 baseline is the accepted medium `EIT Acquisition Session Coordinator` from run `20260813T234357Z-eit-acquisition-medium-r1-a1`, whose controlled purpose is preparation-qualified monitoring and impedance collection.

DIV-03: The boundary differs because this system receives batch, generator-feedback, viewer, Doctor-review, and generator-reset events and emits generation command, review availability, and workflow status; the baseline receives preparation/monitoring/acquisition observations and emits collection command and impedance delivery.

DIV-04: State ownership and topology differ because this system has generation-slot and review-session governors in a feedback-driven image-service loop, whereas the baseline has preparation and monitoring governors in a qualification-to-acquisition pipeline.

DIV-05: Priority and recovery differ because this system protects an applicable Doctor open from a newer batch and recovers a blocked generator through reset followed by a later fresh batch; the baseline prioritizes stop/preparation recovery and recovers held monitoring through preparation and fresh start. These are different controlled effects, not renamed states.

DIV-06: The design is not an extension or repartitioning of replicate 1: it removes monitoring start, acquisition command, preparation qualification, impedance frame admission, and acquisition-session governance from the boundary, then introduces external generator feedback correlation and Doctor review exposure as the organizing state machine. Adding this design to replicate 1 would require composing two separate systems across `batchEvent`, not merely splitting or renaming replicate-1 owners.

## Verification, validation, and objective pass criteria

VERIFY-01: Source verification shall pass only when the canonical project typechecks, has exactly one explicit root, resolves every endpoint, and uses directionally and type-compatible ports for all 21 semantic interactions and eight support routes.

VERIFY-02: Structural verification shall pass only at exactly nine credited semantic usages, 21 credited semantic interactions, ten reachable non-root usages, one generated-support Process, depth two, eight support routes, 29 raw source connections, and one weakly connected semantic region.

VERIFY-03: Ownership verification shall pass only when `PART-01` through `PART-05` contain their named nonidentity relations, `PART-06` and `PART-07` alone write their respective states, cases 01–20 reside on their declared owners, and no adapter, route, projection, record bundle, or analyzer receives semantic credit or centrally recomputes the policy.

VERIFY-04: Partition verification shall pass only when owner-local partitions contain exactly `3/3/2/2/4/2/2/1/1` nontrivial cases for `PART-01` through `PART-09`, totaling 20; guards are disjoint and total, initialization and pre-state references are explicit, all record fields are constrained, and producer guarantees are not weakened into environmental assumptions.

VERIFY-05: The bounded analyzer shall enumerate the exact 288-value raw input product `4 × 4 × 3 × 3 × 2` across exactly eight legal pre-state pairs for 2,304 exhaustive one-step evaluations, plus every producer-local and producer-reachable consumer product. It shall fail on uncovered or multiply effective cases, an illegal state pair, unmatched availability, command outside generating state, unauthorized state write, priority inversion, automatic post-reset work, or any output outside its finite domain.

VERIFY-06: Scenario verification shall retain one exact bounded trace for each of the seven `SCN-*` families and check every stated intermediate/final state, command, availability, disposition, and notice. All 20 cases and both `A/B` correlations shall be reachable across the retained one-step and multi-step evidence.

VERIFY-07: Trace verification shall pass only when every actionable abstract ID is covered or explicitly deferred/informational and every significant model usage, port, connection, state, initialization, contract clause, analyzer branch, and scenario maps to an abstract ID or a justified generated-support annotation.

VALID-01: Designer validation shall separately judge whether the realization preserves the image-availability purpose, upstream-only acquisition treatment, source ambiguity, Doctor and Patient treatment, conflict and recovery semantics, and claim boundary. Typechecking and bounded analysis alone do not establish domain or clinical fitness.

PASS-01: The final baseline is approved at the exact `9/21/20/7` semantic tuple, with two sole state owners, at least the cooperating owners in `OWNER-02`, `OWNER-04`, and `OWNER-05`, the reachable conflict in `PRI-02`, closed no-event/invalid/fault/reset/fresh-request partitions, and no padding.

PASS-02: Model-stage acceptance additionally requires all `VERIFY-*` criteria green, all seven scenarios realized, no unexplained additions, one source-bound healthy `system-overview`, and later Designer validation. Code generation, execution, formal proof, physical validation, clinical validation, safety certification, and production readiness remain `not-run`.

## Model-review determinations and authorized support

QUERY-01: Model review confirmed that the trusted SysML-AADL/GUMBO subset can realize separate pre-state outputs from `PART-06` and `PART-07` for interactions 06–09 and post-decision snapshots for interactions 16–18 without a combinational contract cycle or duplicated state; this is a source-level mapping, not a scheduling claim.

QUERY-02: Model review confirmed that all decision and snapshot records can be implemented as flat Data records with direct attributes and field-specific enum classifiers while retaining one owner-local `compute_cases` partition per semantic Thread and exact case trace anchors; bijective mappings and copied projections remain uncredited.

QUERY-03: Model review confirmed that the deterministic bounded analyzer can enumerate the exact 2,304 legal one-step evaluations, independently exercise every owner-local and producer-reachable consumer product and all seven multi-step traces, and report owner-local evidence without substituting a centralized oracle.

SUPPORT-01: Model realization is authorized to use one root System, one behavior-free support Process, nine sibling semantic Threads, 21 typed semantic sibling connections, exactly eight root/Process delegation routes, finite enum and flat-record definitions, explicit state initialization, owner-local tuple consistency, trace annotations, one source-bound overview, and deterministic analyzer code. None receives credit beyond the frozen `9/21/20/7` inventory.

AUTH-01: Designer resolution approves this final abstract and authorizes Model generation against it and `design-selection.md`; any proposed change to boundary, cases, state ownership, priority, recovery, counts, or claim strata requires explicit Designer resolution rather than silent realization drift.
