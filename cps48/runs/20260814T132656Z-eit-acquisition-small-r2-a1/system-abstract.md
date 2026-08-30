---
abstract_id: EIT-IMAGE-AVAIL-SMALL-R2-SA-02
run_id: 20260814T132656Z-eit-acquisition-small-r2-a1
domain_seed: eit-acquisition-seed-20260813t233941z
campaign_complexity: small
semantic_usage_bounds: [5, 8]
semantic_interaction_bounds: [7, 14]
nontrivial_contract_case_bounds: [6, 12]
scenario_family_bounds: [4, 6]
selected_semantic_usage_count: 6
selected_semantic_interaction_count: 12
selected_nontrivial_contract_case_count: 12
selected_scenario_family_count: 5
root_system_usage_count: 1
semantic_containment_depth: [1, 2]
weakly_connected_semantic_regions: 1
principal_decision_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
status: designer-approved
---

# EIT Image Availability and Review Support Coordinator

## Synopsis, need, purpose, and goals

NEED-01: A Doctor needs a bounded logical service that turns admitted upstream acquisition events into requested EIT-image-generation work, retains the availability of one opaque generated image, and makes that image available for human analysis without automating diagnosis. Acquisition, monitoring, and physical image reconstruction are outside this system boundary.

PURPOSE-01: The EIT Image Availability and Review Support Coordinator will qualify one upstream acquisition sample, one Doctor review intent, and one external generation result; govern one image-availability lifecycle and its recovery phase; issue a finite generation directive; and publish an opaque image token plus availability status for Doctor review.

GOAL-01: The system shall produce exactly one coherent next image state, next recovery state, generation directive, image delivery, and availability status for every finite input and owner pre-state combination.

GOAL-02: The system shall make an image available only after a result matches the acquisition token previously selected for generation, and it shall preserve the distinction between the two opaque tokens without asserting image quality or clinical meaning.

GOAL-03: The system shall clear availability and enter recovery on invalid or unexpected generation evidence, block a retained nonneutral intent, observe a neutral intent, and require a later fresh intent before new generation may begin.

GOAL-04: The system shall give release intent priority over valid pending or matching completion evidence, while invalid or mismatched evidence remains the highest-priority fault condition.

## Evidence and claim classification

METHOD-01: Handbook-derived method requires an implementation-independent need and boundary before allocation, explicit assumptions and owners, nominal and off-nominal scenarios, comparison of alternatives, stable traceability, measurable bounds, and separate verification from validation. These are methodology obligations, not facts about EIT operation.

FACT-SRC-01: The frozen source grounds actors named Doctor, EngineerTechnician, Patient, and EITSystem; it associates the EITSystem actor with collecting impedance data and generating EIT images and associates the Doctor with analyzing EIT images.

FACT-SRC-02: The source also names belt application, calibration, and monitoring start, but supplies no ordering, interface, representation, value, timestamp, validity, authority, state, readiness, priority, completion, fault, recovery, correctness, or exclusivity semantics. The Patient has no use-case association, and the relationship between the EITSystem actor and EITSystemBoundary is ambiguous.

ABS-PILOT-01: This abstract introduces the exact finite samples, opaque A/B correlation, logical evaluation boundary, request and release meanings, image lifecycle, ordered priority, invalidity policy, neutral-then-fresh recovery, output meanings, bounded scenarios, and acceptance checks as pilot abstractions. None is attributed to the source.

ARCH-SEL-01: The selected architecture separates upstream acquisition qualification, Doctor-intent qualification, generation-result qualification, one stateful image-availability governor, generation-directive derivation, and Doctor publication. This is the Designer-selected allocation confirmed in `design-selection.md` after Model review, not a handbook prescription or source fact.

DEFER-01: Electrode placement, contact quality, calibration, monitoring authorization, stimulation or sensing, acquisition control or success, impedance representation, numeric values and units, timestamps and timing, reconstruction algorithms, image pixels or quality, automated analysis, diagnosis, treatment, patient consent or control, electrical safety, medical efficacy, regulatory compliance, certification, deployment, code generation, execution, formal proof, and production readiness are deferred and shall never be reported as passed by this run.

## Operational context and exact system boundary

CTX-01: The Doctor is outside the system, supplies a finite image-review intent, and receives an availability status and at most one opaque image delivery. The source association grounds Doctor participation in analysis, but it does not establish the request protocol, exclusive authority, or any diagnostic result used here.

CTX-02: The External Upstream Acquisition Context is outside the system and supplies one opaque acquisition sample. It represents acquisition only as a completed upstream observation; this system cannot start, stop, authorize, supervise, or assess acquisition.

CTX-03: The External Image Generation Context is outside the system, receives one finite generation directive, and supplies one finite generation-result sample. The directive is a logical work request and the result is a bounded token, not evidence of a reconstruction algorithm or image quality.

CTX-04: The source-named `EITSystem` actor is not silently equated with the selected coordinator. CTX-02 and CTX-03 are pilot boundary roles chosen to preserve the source ambiguity, and neither is claimed to be the source actor's exclusive or literal realization.

CTX-05: The EngineerTechnician and Patient remain external declared context with no modeled input, output, state, control, or scenario step because this selected scope does not include belt preparation or calibration and the source assigns no Patient use-case association.

MON-01: `AcquisitionSample` is a finite root input from CTX-02 with `token : AcquisitionToken` and `status : InputStatus`, where `AcquisitionToken` is exactly `{NoAcquisition, AcquisitionA, AcquisitionB}` and `InputStatus` is exactly `{Valid, Invalid}`. A/B are distinct uninterpreted witnesses with no patient, physical, or quality semantics.

MON-02: `ReviewIntentSample` is a finite root input from CTX-01 with `intent : ReviewIntent` and `status : InputStatus`, where `ReviewIntent` is exactly `{NoIntent, RequestImage, ReleaseImage}`. `NoIntent` is the neutral recovery observation, `RequestImage` requests availability for later human analysis, and `ReleaseImage` discards retained logical availability.

MON-03: `GenerationResultSample` is a finite root input from CTX-03 with `result : GenerationResult` and `status : InputStatus`, where `GenerationResult` is exactly `{NoResult, GenerationFailed, ImageA, ImageB}`. `ImageA` is correlated only with `AcquisitionA`, and `ImageB` only with `AcquisitionB`, as a pilot token rule.

CTRL-01: `GenerationDirective` is a finite root output to CTX-03 with exactly `{HoldGeneration, GenerateFromA, GenerateFromB}`. It is a one-evaluation logical request and does not prove acceptance, execution, completion, or physical image generation.

CTRL-02: `ImageDelivery` is a finite root output to CTX-01 with exactly `{Withheld, DeliverImageA, DeliverImageB}`. A delivered token indicates only retained logical availability for review, not correct reconstruction, display, analysis, diagnosis, or treatment.

CTRL-03: `AvailabilityStatus` is a finite root output to CTX-01 with exactly `{NoImageAvailable, GenerationPending, ImageAvailable, UpstreamAcquisitionRequired, GenerationFailedStatus, InputFault, RecoveryPending}`.

BOUND-01: The root boundary consists exactly of MON-01 through MON-03 and CTRL-01 through CTRL-03. It has no monitoring request, calibration evidence, impedance-delivery output, acquisition command, patient observation, clinical finding, diagnosis, treatment, timing, or hardware-control interface.

## Logical evaluation, state, and finite helper semantics

SEM-01: One logical evaluation consumes current MON-01 through MON-03 and the pre-evaluation owner state, selects exactly one ordered CASE-01 through CASE-12, atomically updates the owner state, and publishes all three controlled outputs from that resolution. This defines deterministic snapshot semantics without claiming a scheduler, period, latency, physical simultaneity, or executable profile.

STATE-01: `imageState : ImageState` and `recoveryPhase : RecoveryPhase` are the only persistent domain state, where `ImageState` is exactly `{Empty, RequestedA, RequestedB, ReadyA, ReadyB}` and `RecoveryPhase` is exactly `{Normal, AwaitNeutral, AwaitFreshIntent}`. PART-04 exclusively owns both variables.

INIT-01: Initial owner state shall be `imageState = Empty` and `recoveryPhase = Normal`; initial CTRL-01 shall be `HoldGeneration`, initial CTRL-02 shall be `Withheld`, and initial CTRL-03 shall be `NoImageAvailable`.

INVAR-01: Every reachable owner state shall satisfy `recoveryPhase != Normal implies imageState = Empty`. CASE-01 establishes the invariant, CASE-02 through CASE-05 preserve it, and CASE-06 returns to `Normal` with either `Empty`, `RequestedA`, or `RequestedB`.

FRESH-01: After CASE-01, an intent is fresh only if a later all-valid evaluation with `NoResult` and `NoIntent` first selects CASE-03, any number of later all-valid `NoResult`/`NoIntent` evaluations select CASE-04, and then a later all-valid `NoResult` evaluation with `RequestImage` or `ReleaseImage` selects CASE-05 or CASE-06. Restored validity with `NoResult` while the earlier nonneutral intent remains shall select CASE-02 and cannot start generation; any invalid or unexpected result instead restarts CASE-01.

TYPE-01: `QualifiedAcquisition` is exactly `{InvalidAcquisition, NoAdmittedAcquisition, AdmittedA, AdmittedB}`; `QualifiedIntent` is exactly `{InvalidIntent, NeutralIntent, FreshImageRequest, ReleaseIntent}`; and `QualifiedGenerationResult` is exactly `{InvalidGenerationResult, PendingResult, FailedResult, ReadyResultA, ReadyResultB}`.

TYPE-02: `ImageResolution` contains `nextImageState`, `nextRecoveryPhase`, and `disposition`, where disposition is exactly `{InputFaultDisposition, RecoveryDisposition, ReleasedDisposition, GenerationStarted, GenerationWaiting, GenerationCompleted, AcquisitionRequired, GenerationFailure, ExistingImageRetained, AvailableRetained, IdleDisposition}`. It contains no generation directive or delivered-image value, so PART-05 and PART-06 retain distinct derivations.

MATCH-01: A nonpending valid generation result is expected exactly when `FailedResult` occurs in pre-state `{RequestedA, RequestedB}`, `ReadyResultA` occurs in `RequestedA`, or `ReadyResultB` occurs in `RequestedB`. `ReadyResultB` in `RequestedA`, `ReadyResultA` in `RequestedB`, and any nonpending result in `{Empty, ReadyA, ReadyB}` are unexpected; `PendingResult` is never unexpected.

REQUEST-MAP-01: For a generation-starting resolution, `AdmittedA` maps the next image state to `RequestedA` and `AdmittedB` maps it to `RequestedB`. `NoAdmittedAcquisition` cannot start generation. This parameterized A/B mapping remains inside the applicable CASE and does not create extra counted policy cases.

## Exact six semantic usages and responsibility ownership

PART-01: Upstream Acquisition Qualification shall derive one `QualifiedAcquisition` from both MON-01 fields, collapsing every invalid-status value to `InvalidAcquisition` and otherwise preserving `NoAdmittedAcquisition`, `AdmittedA`, or `AdmittedB`. It owns no image state, intent, result correlation, generation decision, or output.

PART-02: Doctor Intent Qualification shall derive one `QualifiedIntent` from both MON-02 fields, collapsing every invalid-status value to `InvalidIntent` and otherwise producing `NeutralIntent`, `FreshImageRequest`, or `ReleaseIntent`. It owns no request priority, freshness state, image state, or output.

PART-03: Generation Result Qualification shall derive one `QualifiedGenerationResult` from both MON-03 fields, collapsing every invalid-status value to `InvalidGenerationResult` and otherwise producing `PendingResult`, `FailedResult`, `ReadyResultA`, or `ReadyResultB`. It does not decide whether a valid result is expected for the owner pre-state.

PART-04: Image Availability Governor is the one and only principal decision owner and sole state owner. It shall own STATE-01, MATCH-01 applicability, PRIORITY-01, select exactly one CASE-01 through CASE-12, and derive one complete `ImageResolution`.

PART-05: Generation Directive Derivation shall derive CTRL-01 jointly from PART-04's committed resolution and PART-01's qualified acquisition under DIRECTIVE-01. It owns no state, result correlation, recovery, request applicability, or case selection and earns semantic credit through a producer-total two-input gate rather than copying a resolution field.

PART-06: Doctor Publication shall jointly derive CTRL-02 and CTRL-03 from PART-04's committed resolution under PUBLICATION-01. It owns delivery gating and status precedence; it owns no persistent state, input qualification, request applicability, correlation fault, or policy case, and copying an A/B identity receives no independent owner credit.

OWNER-01: The ownership audit shall report PART-04 as the sole principal decision and state owner; PART-01 through PART-03 as stateless qualification owners; PART-05 as generation-directive owner; and PART-06 as Doctor-publication owner. No root, context actor, type, port, router, analyzer, helper mapping, or generated-support element receives semantic-usage or owner credit.

OWNER-02: Every CASE, both state variables, MATCH-01, and request/recovery applicability belong only to PART-04. PART-05 and PART-06 shall consume the committed resolution and shall not recompute input validity, unexpected-result detection, priority, recovery, case applicability, or next state.

## Complete qualification, priority, and output partitions

QUAL-ACQ-01: PART-01's total relation covers all six `AcquisitionSample` values: the three invalid-status values collapse to `InvalidAcquisition`, and the three valid tokens map respectively to `NoAdmittedAcquisition`, `AdmittedA`, and `AdmittedB`. Its result-fiber sizes are `3/1/1/1`, establishing a status-dependent nonidentity derivation.

QUAL-INTENT-01: PART-02's total relation covers all six `ReviewIntentSample` values: the three invalid-status values collapse to `InvalidIntent`, and the three valid intents map respectively to `NeutralIntent`, `FreshImageRequest`, and `ReleaseIntent`. Its result-fiber sizes are `3/1/1/1`.

QUAL-RESULT-01: PART-03's total relation covers all eight `GenerationResultSample` values: the four invalid-status values collapse to `InvalidGenerationResult`, and the four valid results map respectively to `PendingResult`, `FailedResult`, `ReadyResultA`, and `ReadyResultB`. Its result-fiber sizes are `4/1/1/1/1`.

PRIORITY-01: PART-04 shall apply strict descending priority: any invalid qualified input or unexpected valid result; recovery gating; valid release; expected generation failure; matching generation completion; generation waiting; a fresh image request; otherwise neutral retention. Every generated case guard shall explicitly exclude all earlier priorities so exactly one effective case applies.

DIRECTIVE-01: PART-05 shall output `GenerateFromA` exactly for a `GenerationStarted` resolution paired with `AdmittedA`, and `GenerateFromB` exactly for `GenerationStarted` paired with `AdmittedB`; every other producer-possible or anomalous pair shall output `HoldGeneration`. End-to-end evidence shall require anomalous generation-started pairs to be unreachable.

PUBLICATION-01: PART-06 shall output `DeliverImageA` exactly when the committed next image state is `ReadyA`, `DeliverImageB` exactly when it is `ReadyB`, and `Withheld` otherwise. It shall output `InputFault` for `InputFaultDisposition`; otherwise `RecoveryPending` for `RecoveryDisposition`; otherwise `GenerationPending` for `{GenerationStarted, GenerationWaiting}`; otherwise `ImageAvailable` for `{GenerationCompleted, ExistingImageRetained, AvailableRetained}`; otherwise `UpstreamAcquisitionRequired` for `AcquisitionRequired`; otherwise `GenerationFailedStatus` for `GenerationFailure`; otherwise `NoImageAvailable` for `{ReleasedDisposition, IdleDisposition}`.

OUTPUT-01: For every selected CASE, post-state shall equal the resolution's two next-state fields, CTRL-01 shall equal DIRECTIVE-01, and CTRL-02 plus CTRL-03 shall equal PUBLICATION-01 for that same committed resolution. No state field or controlled output may retain an unrelated old value or remain unconstrained.

## Exact twelve typed directed semantic interactions

INT-01: The root MON-01 shall provide `AcquisitionSample` to PART-01.

INT-02: The root MON-02 shall provide `ReviewIntentSample` to PART-02.

INT-03: The root MON-03 shall provide `GenerationResultSample` to PART-03.

INT-04: PART-01 shall provide `QualifiedAcquisition` to PART-04.

INT-05: PART-02 shall provide `QualifiedIntent` to PART-04.

INT-06: PART-03 shall provide `QualifiedGenerationResult` to PART-04.

INT-07: PART-04 shall provide `ImageResolution` to PART-05 for generation-directive derivation.

INT-08: PART-01 shall independently provide `QualifiedAcquisition` to PART-05 so the directive owner selects the A/B target without copying a command from PART-04.

INT-09: PART-05 shall provide `GenerationDirective` to root CTRL-01.

INT-10: PART-04 shall provide `ImageResolution` to PART-06 for Doctor publication.

INT-11: PART-06 shall provide `ImageDelivery` to root CTRL-02.

INT-12: PART-06 shall provide `AvailabilityStatus` to root CTRL-03.

INT-AUDIT-01: The complete post-selection inventory is exactly INT-01 through INT-12: three boundary inputs, six inter-usage flows, and three boundary outputs. The six internal flows include the independent PART-01-to-PART-05 targeting fact; fan-out entries are distinct because their consumers derive different owner-local facts, and no interaction is credited for routing, duplication, containment, visualization, or count attainment.

## Exactly twelve ordered nontrivial owner-local contract cases

CASE-01: If any qualified input is invalid or MATCH-01 classifies the valid generation result as unexpected for the pre-state, then the resolution shall be `Empty`, `AwaitNeutral`, and `InputFaultDisposition`, regardless of every other current value or prior recovery phase.

CASE-02: Otherwise, if pre-state recovery is `AwaitNeutral` and the valid intent is not `NeutralIntent`, then the resolution shall be `Empty`, `AwaitNeutral`, and `RecoveryDisposition`. The sampled nonneutral intent shall not be replayed or acted upon.

CASE-03: Otherwise, if pre-state recovery is `AwaitNeutral` and the valid intent is `NeutralIntent`, then the resolution shall be `Empty`, `AwaitFreshIntent`, and `RecoveryDisposition`. This neutral observation advances recovery but starts nothing.

CASE-04: Otherwise, if pre-state recovery is `AwaitFreshIntent` and the valid intent is `NeutralIntent`, then the resolution shall remain `Empty`, `AwaitFreshIntent`, and `RecoveryDisposition`.

CASE-05: Otherwise, if pre-state recovery is `AwaitFreshIntent` and the valid intent is `ReleaseIntent`, then the resolution shall be `Empty`, `Normal`, and `ReleasedDisposition`. A fresh release completes recovery without generation.

CASE-06: Otherwise, if pre-state recovery is `AwaitFreshIntent` and the valid intent is `FreshImageRequest`, then the resolution shall return to `Normal`; with `AdmittedA` or `AdmittedB` it shall use REQUEST-MAP-01 and `GenerationStarted`, while with `NoAdmittedAcquisition` it shall use `Empty` and `AcquisitionRequired`. The fresh request is consumed in all three mappings.

CASE-07: Otherwise, if recovery is `Normal` and the valid intent is `ReleaseIntent`, then the resolution shall be `Empty`, `Normal`, and `ReleasedDisposition`, regardless of pending or matching valid result evidence. Invalid or unexpected evidence has already taken CASE-01.

CASE-08: Otherwise, if recovery is `Normal`, pre-state image state is `{RequestedA, RequestedB}`, and result is `FailedResult`, then the resolution shall be `Empty`, `Normal`, and `GenerationFailure`. A later explicit request is required to retry, but fault recovery is not entered for a valid reported generation failure.

CASE-09: Otherwise, if recovery is `Normal` and the pre-state/result pair is `RequestedA/ReadyResultA` or `RequestedB/ReadyResultB`, then the resolution shall be respectively `ReadyA` or `ReadyB`, `Normal`, and `GenerationCompleted`.

CASE-10: Otherwise, if recovery is `Normal`, pre-state image state is `{RequestedA, RequestedB}`, and result is `PendingResult`, then the resolution shall retain the requested state, remain `Normal`, and use `GenerationWaiting`. A concurrent fresh image request does not supersede the outstanding target; release remains available through higher-priority CASE-07.

CASE-11: Otherwise, if recovery is `Normal` and intent is `FreshImageRequest`, then pre-state is necessarily `{Empty, ReadyA, ReadyB}` and result is `PendingResult`; with `AdmittedA` or `AdmittedB` the resolution shall use REQUEST-MAP-01 and `GenerationStarted`, while with `NoAdmittedAcquisition` it shall retain a ready pre-state with `ExistingImageRetained` or retain `Empty` with `AcquisitionRequired`.

CASE-12: Otherwise, every remaining combination has `Normal` recovery, `NeutralIntent`, `PendingResult`, and pre-state `{Empty, ReadyA, ReadyB}`; the resolution shall retain the image state and use `AvailableRetained` for a ready pre-state or `IdleDisposition` for `Empty`.

CASE-AUDIT-01: CASE-01 through CASE-12 are exactly twelve counted top-level priority regions and form an ordered, total, effectively mutually exclusive partition over all qualified inputs and owner pre-states. A/B parameterization, qualification relations, MATCH-01, initialization, output mappings, scenario variants, and analyzer checks are mandatory but shall not be relabeled as extra cases.

## Required behavior, risk, fault response, and recovery

BEH-01: From INIT-01 with all inputs valid, `RequestImage`, `AcquisitionA`, and `NoResult` shall select CASE-11, enter `RequestedA`, and issue `GenerateFromA`; later neutral pending evidence shall select CASE-10; matching `ImageA` shall select CASE-09, enter `ReadyA`, and publish `DeliverImageA` with `ImageAvailable`; a later release shall select CASE-07 and clear availability.

VER-BEH-01: Verify BEH-01 by owner-contract inspection plus bounded scenario replay. Pass requires the exact image-state sequence `Empty -> RequestedA -> RequestedA -> ReadyA -> Empty`, directives `GenerateFromA -> HoldGeneration -> HoldGeneration -> HoldGeneration`, delivery only in `ReadyA`, and no recovery phase.

BEH-02: A valid request with `NoAcquisition` shall not start generation; a valid A or B acquisition shall select only the matching generation target; a matching result shall make only its corresponding image token available; and a request made while another target is pending shall not supersede that target.

VER-BEH-02: Verify BEH-02 by case and output analysis. Pass requires witnesses for the no-acquisition branches of CASE-06 and CASE-11, both A and B branches of generation start and completion, no cross-token directive or delivery, and CASE-10 retention under a concurrent fresh request.

BEH-03: While a ready image is retained, neutral evaluations shall preserve it through CASE-12; a fresh request with no new admitted acquisition shall preserve it through CASE-11; a fresh request with a new admitted acquisition shall withhold the old image and enter the matching requested state.

VER-BEH-03: Verify BEH-03 by enumerating `{ReadyA, ReadyB}` against neutral and fresh request inputs with all three valid acquisition facts. Pass requires existing delivery only when the committed next state remains ready and no delivery after a new generation starts.

RISK-01: If invalid acquisition, intent, or result evidence, an unsolicited completion, or an A/B-mismatched completion were trusted, the system could present an image token as related to the wrong upstream event. The bounded consequence is an incoherent logical review artifact; no physical harm, likelihood, severity, image-quality, or safety classification is asserted.

FAULT-01: If any one, any pair, or all three root input statuses are invalid, or if MATCH-01 identifies unexpected valid result evidence, CASE-01 shall apply in the same evaluation, clear image availability, enter `AwaitNeutral`, output `HoldGeneration`, output `Withheld`, and report `InputFault`.

VER-FAULT-01: Verify FAULT-01 by enumerating every raw input combination containing at least one invalid status from every owner pre-state and every unexpected valid result/state pair. Pass requires CASE-01 exclusively, post-state `{Empty, AwaitNeutral}`, and exact outputs `{HoldGeneration, Withheld, InputFault}` for every witness.

RECOVERY-01: After FAULT-01, restored-valid samples with `NoResult` and a retained `RequestImage` or `ReleaseImage` shall remain blocked by CASE-02; a valid `NoResult`/`NoIntent` evaluation shall advance through CASE-03; repeated valid `NoResult`/`NoIntent` evaluations shall wait through CASE-04; only a later all-valid `NoResult` evaluation with fresh release or image request may complete recovery through CASE-05 or CASE-06. Invalid or unexpected generation evidence at any recovery step shall reselect CASE-01.

VER-RECOVERY-01: Verify RECOVERY-01 by bounded trace replay. Pass requires no generation directive or image delivery before the fresh-intent step, no replay of the retained nonneutral intent, and exact final state/output for fresh release, fresh A/B request, and fresh request without an acquisition.

## Exactly five distinct scenario families

SCN-01: Nominal A-image availability shall start from INIT-01, request image generation with `AcquisitionA`, wait with `NoResult`, complete with matching `ImageA`, retain availability under a neutral evaluation, and release it. Pass requires CASE-11, CASE-10, CASE-09, CASE-12, and CASE-07 in that order and delivery only while `ReadyA` is committed.

SCN-02: Acquisition and identity boundaries shall request with `NoAcquisition`, then request with `AcquisitionB`, hold an additional concurrent request while B is pending, complete with `ImageB`, preserve B when a later request has no acquisition, and replace it only after a request with `AcquisitionA`. Pass requires no generation without an admitted token, no pending-target supersession, and no A/B cross-delivery.

SCN-03: Invalid and unexpected-result behavior shall independently invalidate acquisition, intent, and result status; exercise each invalid-status pair and all three invalid together; supply unsolicited `ImageA`, unsolicited `GenerationFailed`, `ImageB` while `RequestedA`, and `ImageA` while `RequestedB`. Pass requires FAULT-01 from stopped, requested, ready, and recovery pre-states.

SCN-04: Qualifying recovery shall enter CASE-01 with a retained `RequestImage`, restore validity without changing that intent to witness CASE-02, supply `NoIntent` to witness CASE-03 and again CASE-04, then supply a fresh `RequestImage` with `AcquisitionB` to witness CASE-06, wait through CASE-10, and complete through CASE-09. Pass requires `GenerateFromB` only on the fresh-request step and `DeliverImageB` only after completion.

SCN-05: Nonauthorizing recovery and explicit retry shall reach `AwaitFreshIntent`, use fresh `ReleaseImage` to witness CASE-05, then from normal state request A, receive valid `GenerationFailed` through CASE-08, remain empty without entering fault recovery, and issue a later explicit request to retry. Pass requires recovery completion without generation on release and no automatic retry after generation failure.

SCN-AUDIT-01: SCN-01 through SCN-05 are exactly five scenario families with distinct traces: nominal availability lifecycle, acquisition/identity boundaries, invalid and correlation faults, qualifying fresh-intent recovery, and nonauthorizing recovery plus explicit failure retry. Together they witness CASE-01 through CASE-12 and the required nominal, boundary, invalid/fault, and recovery categories.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for providing exactly one finite intent value and explicit status per logical evaluation and for presenting `NoIntent` before a post-fault intent can be considered fresh. This protocol is a pilot assumption, not source-defined Doctor authority or clinical workflow.

ASM-02: CTX-02 is responsible for providing exactly one acquisition token and status per logical evaluation. An admitted token means only that an external upstream event is logically available; it does not prove acquisition authorization, calibration, physical collection, impedance validity, or patient association.

ASM-03: CTX-03 is responsible for accepting CTRL-01 only as a logical one-evaluation work request, retaining any accepted target outside this boundary, and returning `ImageA` only for a prior A target and `ImageB` only for a prior B target. The correlation rule is a pilot interface assumption, and the system still detects bounded violations.

ASM-04: All supplying contexts are responsible for holding their finite sample values stable for one logical evaluation. This supports deterministic snapshot semantics and makes no real-time duration, synchronization, throughput, or physical simultaneity claim.

ASM-05: CTX-01 is responsible for treating CTRL-02 as an opaque review-availability token and CTRL-03 as logical status only. Neither output establishes display correctness, automated analysis, diagnosis, treatment, patient outcome, or regulatory acceptability.

CONSTR-01: All modeled behavioral domains shall remain finite and exactly match MON-01 through MON-03, CTRL-01 through CTRL-03, STATE-01, TYPE-01, and TYPE-02. Numeric impedance, timestamps, patient identifiers, image pixels, physical units, quality measures, monitoring state, and calibration state shall not be introduced as behavioral premises.

CONSTR-02: The model shall contain exactly one explicit root system usage, exactly six reachable responsibility-bearing semantic usages, exactly twelve typed directed semantic interactions, exactly twelve nontrivial owner-local contract cases, exactly five scenario families, semantic containment depth from one through two beneath the root, exactly one weakly connected semantic region, and exactly one principal decision owner.

CONSTR-03: Root, context actors, types, ports, containment, routing, library-mandated declarations, initialization, equations, invariants, helper mappings, analyzers, and scenario witnesses are excluded from semantic usage, interaction, case, scenario, and owner counts. No excluded artifact may receive count credit.

SUPPORT-01: Generated source shall use one explicit root `System` containing exactly one behavior-free uncounted generated-support `Process`, with PART-01 through PART-06 realized as six sibling semantic `Thread` usages beneath that Process. The three root inputs and three root outputs shall each use one root-to-Process and one Process-to-Thread delegation, for exactly twelve uncounted boundary-hop `PortConnection` declarations; INT-04 through INT-08 and INT-10 shall use exactly six direct sibling-Thread connections. The approved physical mapping therefore has six credited semantic Threads, one uncredited support Process, physical depth two, and exactly eighteen raw `PortConnection` declarations. Every support element and delegation shall be separately reported as `@generated-support`, preserve the exact INT endpoint and type semantics, and derive, store, select, qualify, or alter no domain fact.

## Trace, bounded analysis, and objective acceptance

TRACE-01: Every actionable identifier in this abstract shall trace to at least one retained model element, owner-local contract, bounded-analyzer check, or scenario witness; every significant generated element shall trace back to an abstract identifier or carry a specific `@generated-support <reason>` justification. Pass requires zero missing actionable IDs and zero unexplained generated elements.

TRACE-DISP-01: METHOD-01, FACT-SRC-01, FACT-SRC-02, CTX-04, CTX-05, and DEFER-01 are informational or deferred claim-boundary records; they require explicit retained disposition but no invented behavioral element. All other clauses are actionable design or acceptance obligations unless their text explicitly says they are uncounted evidence.

ANALYSIS-01: A deterministic bounded analyzer shall enumerate all `6 * 6 * 8 * 5 * 3 = 4320` raw end-to-end snapshots formed by acquisition sample, intent sample, result sample, image state, and recovery phase. It shall independently qualify raw inputs, apply MATCH-01 and ordered priority, compute both next-state fields and all controlled outputs, and compare them with the retained owner-local contracts. It shall also directly enumerate PART-01 over all six `AcquisitionSample` values with `QualifiedAcquisition` fibers `3/1/1/1`, PART-02 over all six `ReviewIntentSample` values with `QualifiedIntent` fibers `3/1/1/1`, and PART-03 over all eight `GenerationResultSample` values with `QualifiedGenerationResult` fibers `4/1/1/1/1`, requiring exact agreement with QUAL-ACQ-01, QUAL-INTENT-01, and QUAL-RESULT-01 for every assigned input.

ANALYSIS-02: The same evidence shall directly enumerate PART-04 over all `4 * 4 * 5 * 5 * 3 = 1200` qualified-input/pre-state snapshots and report the ordered CASE-01-through-CASE-12 population vector `957/54/27/27/27/27/27/12/12/12/9/9`, zero effective case gaps, zero effective overlaps after priority exclusion, zero qualification mismatches, zero next-state mismatches, zero directive, delivery, or status mismatches, and at least one reachable witness for every case.

ANALYSIS-03: The analyzer shall directly enumerate PART-05 over all `5 * 3 * 11 * 4 = 660` `ImageResolution × QualifiedAcquisition` pairs, require `GenerateFromA/GenerateFromB/HoldGeneration` fibers `15/15/630`, and require the exact DIRECTIVE-01 result for every pair. It shall separately enumerate PART-06 over all `5 * 3 * 11 = 165` `ImageResolution` values, require `DeliverImageA/DeliverImageB/Withheld` fibers `33/33/99`, require availability-status fibers `15/15/30/45/15/15/30` in PUBLICATION-01 order (`InputFault`, `RecoveryPending`, `GenerationPending`, `ImageAvailable`, `UpstreamAcquisitionRequired`, `GenerationFailedStatus`, `NoImageAvailable`), and require exact agreement of the joint delivery/status tuple for every value. Separately from those local products, end-to-end analysis shall require every anomalous `GenerationStarted` pairing with `InvalidAcquisition` or `NoAdmittedAcquisition` to be unreachable. The analyzer shall also replay SCN-01 through SCN-05; check INIT-01, INVAR-01, FRESH-01, MATCH-01, REQUEST-MAP-01, PRIORITY-01, DIRECTIVE-01, PUBLICATION-01, OUTPUT-01, and OWNER-01; enumerate every individual and combined invalid status and every unexpected valid result/state pair; and report reachable owner states. This is revision-bound finite conformance evidence, not an architectural owner, executable system run, reconstruction validation, formal proof, safety proof, or clinical validation.

PASS-01: Structural acceptance requires the exact semantic tuple `6/12/12/5`, one root, semantic depth `1..2`, one weak semantic region, one principal owner, and separate reporting of all generated support, with no padded, identity-only, or untraced usage or interaction.

PASS-02: Behavioral acceptance requires CASE-01 through CASE-12 to remain owner-local to PART-04, total and effectively exclusive under PRIORITY-01, reachable by scenario or analyzer witness, and constraining complete resolution, post-state, and all three controlled outputs through OUTPUT-01.

PASS-03: Fault and recovery acceptance requires every individual and combined invalid-status snapshot and every unexpected result/state pair to select CASE-01; restored stale nonneutral intents to remain blocked by CASE-02; neutral progression to require CASE-03 and permit CASE-04; and no generation before a later fresh request selects the generating branch of CASE-06.

PASS-04: Ownership acceptance requires PART-04 as sole decision and state owner, each other PART to retain its specified nonidentity owner-local derivation, no competing case or state owner, and no support element or analyzer to manufacture owner credit through forwarding or central recomputation. The retained `metrics.json` ownership audit shall name each PART's assigned input ports, its exact local relation, its canonical local contract clauses, and its direct analyzer checks: PART-01 `6` inputs with fibers `3/1/1/1`; PART-02 `6` with `3/1/1/1`; PART-03 `8` with `4/1/1/1/1`; PART-04 `1200` snapshots with CASE vector `957/54/27/27/27/27/27/12/12/12/9/9`; PART-05 `660` pairs with directive fibers `15/15/630`; and PART-06 `165` values with delivery fibers `33/33/99`, status fibers `15/15/30/45/15/15/30`, and exact joint tuples. Record construction, A/B label preservation, connections, and delegation receive no ownership credit.

PASS-05: Verification acceptance requires architecture-stage and final `hamr sysml tipe` success, directionally and type-compatible endpoints, complete trace coverage, exact counts, and successful bounded analysis. Code generation, execution, formal proof, reconstruction assessment, safety assessment, and all other deferred checks shall be reported `not-run`, never passed.

PASS-06: Designer validation separately requires fidelity to NEED-01, the exact finite boundary, the selected image-availability purpose, all five scenarios, source limitations, pilot assumptions, and DEFER-01. Mechanical source conformance alone is insufficient.

PASS-07: Visualization acceptance requires exactly one `system-overview` bound to the accepted source revision and showing the root, six semantic usages, six boundary quantities, sole principal owner, and twelve directed semantic interactions without presenting context or generated support as semantic usages or implying monitoring, acquisition control, reconstruction quality, or clinical success.

PASS-08: Campaign acceptance fails outside usages `5..8`, interactions `7..14`, cases `6..12`, or scenarios `4..6`; numeric compliance never compensates for a missing owner, finite branch, fresh-intent recovery, trace, boundary responsibility, or meaningful behavioral path.

## Final Designer audit

AUDIT-FINAL-01: The approved final design has exactly six semantic usages, twelve semantic interactions, twelve nontrivial contract cases, five scenario families, one root, semantic depth `1..2`, one weak semantic region, and one principal decision owner; every selected value lies within the frozen `small` bounds without padding.

AUDIT-FINAL-02: PART-04 owns both state variables, MATCH-01, PRIORITY-01, and all twelve cases; PART-01 through PART-03 own their complete qualification relations; PART-05 owns directive gating; and PART-06 owns publication gating and status precedence. No state, decision, case, controlled output, or semantic interaction lacks an owner or has a competing owner.

AUDIT-FINAL-03: The complete partition covers invalid or unexpected evidence, retained nonneutral recovery, neutral recovery entry and waiting, fresh release, fresh request with or without upstream acquisition, normal release, valid generation failure, matching completion, pending generation with concurrent requests, normal new requests from empty or ready states, and neutral retention. INT-01 through INT-12 remain the complete post-revision interaction inventory.

AUDIT-FINAL-04: This system is not an extension or repartitioning of the replicate-1 EIT Monitoring-Start and Impedance-Acquisition Coordinator: it has no monitoring session, calibration gate, acquisition command, or impedance delivery; it owns an image-request/result lifecycle, receives acquisition only as an upstream token, directs external generation, and publishes Doctor-facing image availability. Its boundary, state ownership subject, interaction topology, priority cases, and generation-failure recovery all differ materially.

