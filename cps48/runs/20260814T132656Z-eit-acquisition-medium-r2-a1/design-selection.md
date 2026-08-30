# Approved Design Selection — EIT Image Review Availability Coordinator

## Evidence and selection criteria

DS-BASIS-01: The frozen seed provides actors, use-case vocabulary, actor associations, and an ambiguous `EITSystem`/`EITSystemBoundary` relationship; it does not select this run's boundary, ordering, representations, states, validity, priority, fault, or recovery rules.

DS-CRIT-01: Diversity compliance requires a primary controlled purpose other than monitoring start, impedance acquisition, or acquisition-session supervision and at least two genuine differences from the closest accepted replicate-1 baseline.

DS-CRIT-02: Boundary coherence favors a single controlled effect that can use image-generation and analysis vocabulary without implementing reconstruction, automated analysis, diagnosis, treatment, or clinical quality judgment.

DS-CRIT-03: Medium-tier substance requires 8–12 non-padded semantic usages, 15–21 distinct directed semantic interactions, 12–20 nontrivial owner-local cases, 6–9 scenario families, at least two cooperating decision or qualification owners, and a reachable priority conflict.

DS-CRIT-04: Responsibility integrity requires each credited usage to derive a many-to-one qualification, multi-input decision, sole retained-state transition, command classification, or coordinated public relation. Routing, copying, bundling, identity mapping, and enum renaming receive no credit.

DS-CRIT-05: Auditability favors finite event domains, one represented generation slot, exact correlation tokens, sole state owners, disjoint and total local partitions, a bounded recovery exit, a later fresh-work path, and exhaustive analysis over legal pre-state pairs.

DS-CRIT-06: Claim discipline excludes any assertion that batch acceptance, matching feedback, image readiness, or review availability establishes impedance accuracy, reconstruction correctness, image quality, completed analysis, diagnosis, treatment, safety, or certification.

## Required candidate-scope comparison

DS-SCOPE-01: Alternative A is electrode-belt preparation and calibration support centered on the EngineerTechnician. It is source-aligned and diversity-compliant, but the seed supplies no placement, contact, calibration criterion, calibration artifact, or acceptance semantics; a medium controller would depend on a larger invented preparation policy.

DS-SCOPE-02: Alternative B is monitoring-start and impedance-acquisition coordination. It is coherent but forbidden by the replicate-2 card because it recreates the accepted baseline's organizing purpose even if its owners or state names change.

DS-SCOPE-03: Alternative C is an impedance-to-image generation system that would transform represented impedance values into images. It is not selected because the seed supplies no data representation, reconstruction relation, image structure, or correctness rule, and inventing those would overstate source evidence.

DS-SCOPE-04: Alternative D is EIT-image generation and Doctor-analysis availability with acquisition only as an opaque upstream event. It can control generation work, match external results, and expose finite review availability without implementing reconstruction or analysis. This scope is selected.

DS-SCOPE-05: Alternative E is a Doctor analysis-session manager with annotations or diagnostic conclusions. It is rejected because the seed provides no analysis criteria, output vocabulary, diagnosis semantics, or review record, so its substantive behavior would be mostly unsupported clinical invention.

DS-SCOPE-06: Alternative F combines all six seed use cases inside one end-to-end EIT system. It is rejected because it would blur human preparation, acquisition, generation, and clinical analysis and silently resolve the source's actor/boundary ambiguity.

DS-RESULT-01: The selected primary scope is an EIT Image Review Availability Coordinator. It receives only an opaque completed-batch event from acquisition, controls a logical request to an external image generator, and exposes a matched image token only during an applicable Doctor review session.

## Responsibility-allocation alternatives

DS-ALLOC-01: Allocation 1 centralizes batch handling, generator feedback, recovery, both states, Doctor request policy, command, and publication in one controller with thin input/output adapters. It is compact but cannot meet medium substance without padding and would hide qualification and state ownership.

DS-ALLOC-02: Allocation 2 mirrors the seed use cases as peer components for collection, generation, and analysis. It mistakes use-case naming for architecture, pulls acquisition and analysis inside the boundary, and would need unspecified image and clinical semantics.

DS-ALLOC-03: Allocation 3 separates three nonidentity qualification owners, a generator outcome/recovery owner, one workflow arbiter, two sole state governors, one command policy, and one coordinated publisher. It makes feedback matching, access qualification, recovery, conflict, and state transitions independently reviewable and is selected.

DS-ALLOC-04: Allocation 4 gives each raw input an adapter and then sends normalized enums to one workflow governor. Recovery and Doctor policy remain centralized, while most adapters would be one-to-one renamers that violate the owner-count rule.

DS-ALLOC-05: Allocation 5 combines generator outcome, arbitration, and both state spaces in one supervisor but leaves qualification and publication distributed. It reduces interactions but creates one dominant decision/state owner and weakens the campaign's cooperating-owner evidence.

DS-RESULT-02: Allocation 3 is selected because all nine usages derive distinct facts, the five upstream decision/qualification owners form an acyclic current-evaluation chain, the two retained states have exclusive writers, and the output policies do not reproduce upstream decisions.

## Selected boundary, topology, and ownership rationale

DS-BOUND-01: The exact five inputs are opaque batch event, generator feedback, viewer observation, Doctor request, and generator-workflow reset. The exact three outputs are generation command, review availability, and workflow status.

DS-BOUND-02: Acquisition is wholly external and appears only as a one-evaluation `BatchEvent`; there is no monitoring request, acquisition authorization, collection command, impedance frame, preparation evidence, or acquisition-session state in this boundary.

DS-BOUND-03: Doctor participates as review requester and availability recipient, EngineerTechnician is nonparticipating context, Patient is context-only, and `EITSystem` remains ambiguous external vocabulary that may encompass upstream acquisition or generation viewpoints.

DS-TOPO-01: The semantic topology contains three parallel qualification owners feeding a generator outcome/recovery decision and a workflow arbiter, followed by two state governors and two controlled-output policies. Exact feedback from the generation state to matching, recovery, and arbitration supports coordination without central recomputation.

DS-TOPO-02: Exactly 21 semantic interactions connect every input to an owner-local path and every output to its deriving policy. One uncredited Process provides legal containment; five input and three output delegations make exactly 29 raw source connections.

DS-OWN-01: `BatchQualificationOwner`, `GeneratorFeedbackQualificationOwner`, and `ReviewAccessQualificationOwner` each own a nonidentity qualification; the feedback owner cooperates with the generation-state owner rather than inferring state locally.

DS-OWN-02: `GeneratorOutcomeRecoveryOwner` owns completion/fault/reset proposals, while `AvailabilityWorkflowArbiter` owns applicability and priority across those proposals, Doctor request, batch qualification, viewer qualification, and both pre-states.

DS-OWN-03: `GenerationSlotStateGovernor` alone writes generation state and `ReviewSessionStateGovernor` alone writes review state. Shared decisions preserve a cross-state invariant but do not merge ownership.

DS-OWN-04: `GenerationCommandPolicy` owns only the state-to-command classification, and `AvailabilityPublicationPolicy` owns matched review exposure and public-notice precedence. Neither may re-evaluate batch, feedback, access, or arbitration rules.

## Policy, recovery, and finite coverage rationale

DS-PRI-01: Generator completion, fault, or applicable clear has highest priority because a current external result or recovery transition must be resolved before unrelated work. Doctor close then protects an active review, Doctor open protects an already ready token, and only then may a fresh batch start or replace a closed ready token.

DS-PRI-02: The required reachable conflict is ready/closed plus available viewer, fresh Doctor open, and a simultaneous usable new batch. Both proposals are applicable under the selected one-slot replacement policy; Doctor open wins and the batch must be freshly presented later.

DS-REC-01: Failed, mismatched, or unexpected generator feedback blocks generation and closes review in the same evaluation. No image token or command remains exposed.

DS-REC-02: A reset is applicable only while blocked and with no nonempty feedback. It clears to empty/closed, suppresses concurrent lower work, and requires a later fresh batch event; reset outside blocked state is explicitly rejected.

DS-REC-03: Viewer restoration does not open review, and generator reset does not start generation. These separate fresh-event rules close both recovery paths without hidden retry state.

DS-CASE-01: The exact owner-local partition is `3/3/2/2/4/2/2/1/1` cases for the nine usages, totaling 20. It covers no-event, invalid, matching, mismatch, failure, unexpected feedback, inaccessible viewer, reset applicable/inapplicable, action priority, state mutation/retention, commands, and publication.

DS-SCN-01: Exactly seven scenario families cover nominal generation, nominal review, mismatch/failure blocking, reset plus later fresh work, the ordinary priority conflict, viewer denial plus fresh retry, and invalid/unexpected/busy/inapplicable behavior.

DS-ANA-01: Five raw finite inputs produce `4 × 4 × 3 × 3 × 2 = 288` snapshots. Crossing the eight legal generation/review pre-state pairs yields exactly 2,304 exhaustive one-step evaluations; producer-local products and seven multi-step traces provide additional ownership and reachability evidence.

## Diversity comparison with replicate 1

DS-DIV-01: The closest baseline is the accepted medium replicate-1 `EIT Acquisition Session Coordinator` in run `20260813T234357Z-eit-acquisition-medium-r1-a1` because it shares the same seed and tier while organizing preparation-qualified monitoring and impedance collection.

DS-DIV-02: The primary controlled purpose differs: this system governs image generation and Doctor review availability, while the baseline governs monitoring start, collection, and impedance delivery.

DS-DIV-03: The boundary differs: this system has upstream batch, generator feedback/reset, viewer, and Doctor-review interactions with generation and availability outputs; the baseline has belt/calibration/acquisition/frame observations and collection/frame outputs.

DS-DIV-04: State ownership differs: generation-slot and review-session states replace—not elaborate—preparation and monitoring states. No owner in this design can authorize monitoring or request impedance collection.

DS-DIV-05: Interaction topology differs: an external image-service feedback matcher and recovery owner feed a review-availability arbiter, rather than a preparation qualification chain feeding acquisition eligibility and monitoring governance.

DS-DIV-06: Priority and recovery differ: Doctor open defeats a newer replaceable batch, and generator faults require reset then a fresh batch; the baseline prioritizes stop and preparation recovery and holds monitoring until a fresh start.

DS-DIV-07: This system is not an extension, rename, or repartition of the baseline because the baseline's primary controlled outputs and organizing states are absent. The two systems could be composed only through an external batch event after acquisition; that interface separates purposes rather than dividing one state machine.

## Exact counts, assumptions, and evidence status

DS-METRIC-01: The selected semantic point is exactly `9 usages / 21 interactions / 20 cases / 7 scenarios`, satisfying every medium bound without targeting unused capacity through wrappers or aliases.

DS-METRIC-02: The selected physical mapping is exactly one root System, one behavior-free Process, nine semantic Threads, ten reachable non-root usages, depth two, 21 semantic sibling connections, eight support delegations, 29 raw connections, and one semantic weakly connected region.

DS-AUDIT-01: Every state and decision has one named owner; every input and output has a total finite relation; all eight legal state pairs have defined mutation and retention behavior; invalid, no-event, fault, preemption, reset, and fresh-event paths are closed.

DS-AUDIT-02: The final interaction recount is 21: five root inputs, four state-prevalue feedbacks, four qualified/proposed facts into downstream decision owners, two arbiter-to-state decisions, three committed-state outputs to command/publication policies, and three semantic boundary outputs.

DS-ASM-01: Event pulse semantics, finite `A/B` tokens, one slot, matching rules, replacement permission, viewer qualification, action priority, reset behavior, and logical evaluation ordering are explicit pilot assumptions rather than seed facts.

DS-DEFER-01: Physical acquisition, impedance representation, reconstruction, image data, quality, analysis results, diagnosis, treatment, safety, regulatory compliance, certification, timing, storage, and production operation remain outside the selected design.

DS-DEFER-02: Code generation, application implementation, execution, compositional proof, solver certification, physical validation, and clinical validation are not required by this non-executable profile and remain `not-run`; typechecking and bounded analysis shall not be described as stronger evidence.

## Final disposition and Model-generation handoff

DS-PASS-01: The final design is approved because the purpose and boundary are coherent and diversity-compliant, every credited owner has a distinct local relation, exact tier counts are within bounds, all partitions and recovery/fresh-event paths are finite and closed, and the explicit priority conflict is reachable.

DS-QUERY-01: Model review confirmed that separate pre-state outputs constrained to each governor's `In(state)` and post-decision snapshots are realizable in the trusted subset without a combinational contract cycle or mirrored state.

DS-QUERY-02: Model review confirmed that flat Data records with direct attributes and field-specific enum classifiers can preserve all 20 owner-local case anchors and constrain every field; bijective classifier mappings and copied projections remain uncredited representation support.

DS-QUERY-03: Model review confirmed that the dependency-free bounded analyzer can exhaust all 2,304 legal one-step points, every complete owner-local and producer-reachable consumer product, and seven multi-step traces while calling each local relation rather than centralizing policy.

DS-AUTH-01: Designer resolution accepts the Model review, approves `system-abstract.md` and this final selection record without semantic revision, and authorizes Model generation. No change to purpose, boundary, exact counts, state ownership, priority, recovery, or deferred claims is authorized without a subsequent Designer resolution.
