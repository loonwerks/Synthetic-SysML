# Approved design selection for the EIT image availability and review-support coordinator

## Evidence and selection criteria

SEL-BASIS-01: The seed grounds only named actors, use cases, selected actor/use-case associations, and the ambiguous `EITSystem` boundary viewpoint. It does not ground the finite boundary, validity semantics, admission rules, availability service, state, priority, fault handling, or recovery; every such choice is labeled as a pilot abstraction in the System Abstract.

SEL-CRIT-01: Diversity requires a primary controlled purpose other than monitoring-start gating or impedance-acquisition supervision. Acquisition may appear only as an external upstream event for the selected image-availability scope.

SEL-CRIT-02: Boundary coherence requires controlled outcomes that can be observed without claiming physical image generation, image quality, diagnosis, treatment, calibration correctness, or patient benefit.

SEL-CRIT-03: Hard-tier conformance requires 13..16 semantic usages, 22..35 semantic interactions, 21..30 nontrivial contract cases, 9..12 scenario families, multiple genuine state or decision owners, and explicit priority, fault propagation, recovery, and composition.

SEL-CRIT-04: Ownership credibility requires every credited usage to derive a many-to-one fact, multi-input decision, retained transition, strict-priority result, or coordinated public relation. Forwarding, renaming, bundling, and routing receive no credit.

SEL-CRIT-05: Fault observability requires each invalid or reported-failure source to propagate through one visible composition/recovery chain to both outputs in the same logical evaluation.

SEL-CRIT-06: Recovery testability requires distinct phases, fresh ordered events, fault dominance, neutralization on reopening, and later fresh image and Doctor events.

SEL-CRIT-07: Priority testability requires reachable ordinary conflicts over the selected purpose, including withdrawal versus opening and closure versus replacement acceptance.

SEL-CRIT-08: Bounded analyzability favors one abstract image, one Doctor presentation, finite enums/flat records, an acyclic interaction graph, and an exact enumerable product.

## Required scope alternatives from the reusable seed

SEL-SCOPE-01: Alternative scope A is electrode-belt preparation and calibration support centered on the EngineerTechnician. It satisfies the diversity card, but the source supplies no placement steps, calibration parameters, acceptance measurements, or calibration correctness semantics; a hard-size controller would therefore require a larger invented procedure and risk suggesting unsupported physical or electrical assurance.

SEL-SCOPE-02: Alternative scope B is EIT-image generation/analysis availability with acquisition treated as an external upstream event. It permits a clear nonclinical boundary—catalog admission, quarantine/withdrawal, and Doctor-facing availability—while preserving the source's image generation/analysis vocabulary without inventing a reconstruction algorithm or diagnosis.

SEL-SCOPE-03: Alternative scope C is image-analysis support organized as an automated classification or diagnosis service. It is rejected because diagnosis and image-quality conclusions are explicitly unsupported; changing labels would not cure that claim-boundary defect.

SEL-SCOPE-04: Scope B is selected. The system begins at a status-bearing externally generated-image event, manages availability for human Doctor analysis, and ends at catalog disposition plus availability status. It has no monitoring-start, acquisition-cycle, impedance-batch, collection, or generation-command behavior.

## Responsibility-allocation alternatives within the selected scope

SEL-ALT-01: Allocation 1 places qualification, evidence checks, artifact state, Doctor review state, recovery, priority, and publication in one image-availability governor with thin adapters.

SEL-ALT-02: Allocation 1 minimizes interactions, but it creates one dominant state/decision owner and cannot reach the hard tier without wrappers that fail the no-padding rule. Local fault propagation and lifecycle independence would be hidden inside one contract.

SEL-ALT-03: Allocation 2 mirrors source use cases with peer components for image generation and image analysis plus helper components for preparation and calibration.

SEL-ALT-04: Allocation 2 is rejected because use-case containment does not prescribe component allocation, image generation is external in the chosen boundary, and automated analysis would overclaim the seed. It would also drift toward a renamed end-to-end acquisition pipeline.

SEL-ALT-05: Allocation 3 uses four local qualifiers, one fault composer, an independent three-event recovery owner, separate evidence/artifact/review lifecycle owners, separate admission/availability/presentation decisions, one priority arbiter, and one stateless public composer.

SEL-ALT-06: Allocation 3 is selected because each of its 14 usages owns a distinct nonidentity relation, its 34 semantic flows form one acyclic region, four state owners retain noninterchangeable histories, ordinary conflicts are reachable, and the public writer cannot become a duplicate policy owner.

## Exact selected boundary and policy

SEL-BOUND-01: The exact inputs are `ImageSignal`, `DoctorSignal`, `PreparationContext`, `ServiceObservation`, and `RecoveryEvent`; the exact outputs are `UpstreamDisposition` and `AvailabilityFrame`.

SEL-BOUND-02: Physical belt application, calibration execution, monitoring authorization, impedance collection, image generation/reconstruction, image-quality assessment, diagnosis, treatment, and patient outcome are outside. The external `EITSystem` viewpoint reports image/service events and consumes catalog disposition.

SEL-STATE-01: Only `RecoveryState`, `EvidenceState`, `ArtifactState`, and `ReviewState` persist, owned respectively by `PART-06`, `PART-07`, `PART-09`, and `PART-11`. No qualifier, decision owner, arbiter, publisher, analyzer, or support element may mirror them.

SEL-DEC-01: Admission, current availability, presentation proposal, selected action, and public output mapping are owned only by `PART-08`, `PART-10`, `PART-12`, `PART-13`, and `PART-14`. Local qualified facts and local fault composition remain with `PART-01` through `PART-05`.

SEL-FAULT-01: Four local fault sources compose in `PART-05`; `PART-06` adds recovery-input invalidity, latches effective fault state, and propagates one `RecoveryFrame` to all lifecycle/decision consumers. The same-evaluation path terminates in `PART-13` safe withholding and `PART-14` coordinated boundary outputs.

SEL-PRIO-01: Effective priority is fault/closed recovery, upstream withdrawal, rejection/quarantine, Doctor closure, new-image acceptance, Doctor opening or offer, then hold. Required reachable witnesses include withdrawal over opening, rejection over opening, closure over replacement acceptance, acceptance over simultaneous opening, and fault over every ordinary proposal.

SEL-REC-01: Any fault latches recovery. Fresh `RESET` moves only `LATCHED` to `VERIFYING`; later fresh `VERIFY_OK` moves only `VERIFYING` to `ARMED`; later fresh `RESUME` reopens. Operational lifecycle owners neutralize and ignore same-evaluation work on reopening, so later fresh `GENERATED` and `REQUEST_VIEW` events are mandatory.

SEL-COMP-01: `PART-13` composes one complete `DecisionFrame` without upstream recomputation. `PART-14` alone maps it to both outputs and constrains every field; it neither retains state nor arbitrates again.

## Exact counts and audits

SEL-COUNT-01: The selected architecture contains exactly 14 semantic usages, `PART-01` through `PART-14`, satisfying 13..16. No support-only usage appears in the credited inventory.

SEL-COUNT-02: The complete cross-usage semantic inventory contains exactly 34 directed typed interactions, `INT-01` through `INT-34`, satisfying 22..35. Boundary delegations and containment plumbing are separately nonsemantic support.

SEL-COUNT-03: Five ordered owner-local partitions contain exactly 30 nontrivial cases: 6 recovery, 5 evidence, 6 artifact, 6 review, and 7 arbitration cases. Equational qualifier, fault, admission, availability, presentation, mapping, initialization, invariant, and analyzer clauses add no case credit.

SEL-COUNT-04: Exactly ten scenario families cover admission, Doctor review, incomplete context, degraded service, withdrawal conflict, closure/replacement conflict, single faults, simultaneous faults, three-event recovery/fresh work, and benign persistence.

SEL-OWN-01: The state/case audit covers every pre-state and priority outcome. All four state owners derive next state from prior state plus independently received facts, and all decision owners combine at least two independently owned meanings or a complete priority/public relation.

SEL-OWN-02: No one-to-one enum translation receives semantic credit. Invalid collapse is many-to-one, preparation context combines separate report meanings, fault composition derives multiplicity/dominance, lifecycle owners retain history, decisions combine independent facts, arbitration suppresses reachable competitors, and publication coordinates two outputs.

SEL-INT-AUD-01: The final interaction recount is `13 qualifier fan-out + 1 fault composition + 6 recovery fan-out + 3 evidence + 2 admission + 2 artifact + 3 availability + 2 review + 1 presentation + 1 publication = 34`.

SEL-PART-AUD-01: Recovery cases cover all recovery states/events after fault priority; evidence covers closed/release/withdrawal/new/stutter; artifact covers closed/release/withdrawal/reject-or-quarantine/admit/stutter; review covers closed/release/blocked/request/ack-or-dismiss/default; arbitration covers every action branch.

## Bounded realization and evidence

SEL-ANA-01: The exact raw input product is `7,560`, the four-state product is `400`, and the one-step product is `3,024,000`. The retained analyzer must execute owner-local relations in interaction order and ten multi-step traces, including post-arbitration `SCN-06` artifact state plus the following no-event evaluation and the post-recovery fresh-work sequence; it must not use a duplicated central oracle.

SEL-SUPPORT-01: Permitted noncredited support is finite enum/flat-record types, one root and behavior-free process shell if required, seven boundary delegations, containment plumbing, deterministic initialization, tuple consistency, trace annotations, and deterministic analyzer mechanics.

SEL-DEFER-01: Code generation, application execution, formal proof beyond retained checks, physical timing, reconstruction, quality assessment, diagnosis, treatment, patient outcome, electrical safety, regulatory compliance, certification, and production readiness remain excluded or `not-run`.

## Diversity decision

SEL-DIV-01: The selected primary scope is EIT-image catalog admission and Doctor review availability, with acquisition only an external upstream event.

SEL-DIV-02: The closest baseline is the replicate-1 hard `EIT monitoring and acquisition supervisor`.

SEL-DIV-03: Boundary differs because this system consumes an already-generated-image event and controls catalog disposition/Doctor visibility; it has no monitoring request, readiness gate, impedance batch, or acquisition/generation command.

SEL-DIV-04: State ownership and interaction topology differ because the retained histories are evidence, artifact, review, and three-event recovery, arranged as intake-to-admission-to-availability-to-review rather than session/cycle/image-generation coordination.

SEL-DIV-05: Priority and recovery differ because policy resolves withdrawal/rejection/closure/admission/presentation and uses `RESET -> VERIFY_OK -> RESUME` before neutralized owners accept later fresh work, rather than governing stop/start/generation/collection around an acquisition session.

SEL-DIV-06: This is not an extension or rename: none of the closest baseline's session-control, acquisition-cycle, collection-feasibility, generation-proposal, or release-feasibility responsibilities remains, and the system can fulfill its selected purpose without modeling monitoring or impedance acquisition at all.

## Designer resolution and final authorization

SEL-RES-01: The missing-field finding is accepted. `INT-31` through `INT-33` deliver evidence, availability, and review frames directly from their owners to `PART-13`; field carrying is uncredited and recomputation remains forbidden.

SEL-RES-02: The closure/replacement finding is accepted with a narrow guard. `INT-34` supplies qualified Doctor facts to `PART-09`; existing `CASE-16` raises `closureWindow` and stores `EMPTY` only for an admitted replacement against prior `STAGED` state with `VIEW_ACK` or `VIEW_DISMISS`. `PART-10` uses that one-cycle fact only to allow the same-evaluation closure, so the suppressed replacement cannot be offered later without a fresh `GENERATED` event.

SEL-RES-03: The publication-totality finding is accepted. Initialization now fixes every public field, every computation binds `reason=selectedReason`, and `PART-14` owns a total ordered public-mode plus coordinated action/output relation while copies remain uncredited.

SEL-PASS-01: The revised design passes Designer audit at exactly `14/34/30/10`, with `node_count=[14,14]` and `edge_count=[34,34]`. All hard bounds, ownership partitions, priority witnesses, fault/recovery/fresh-work behavior, composition obligations, support allowances, deferred claims, and diversity constraints remain satisfied.

SEL-AUTH-01: Model regeneration is authorized against `system-abstract.md` and this approved selection record. The Model shall not simplify state ownership, the three-event recovery protocol, the 30-case partitions, the 10 scenario families, the ordered priority, the complete publication relation, or the claim boundary.
