# Approved Final Design Selection — EIT Image Availability and Review Support Coordinator

## Decision scope and evidence boundary

DS-BASIS-01: This record selects one coherent `small` system from the reusable EIT seed before SysML realization. Source facts, handbook-derived method, pilot abstractions, selected architecture, and deferred claims remain separately classified in the approved `system-abstract.md`.

DS-BOUNDS-01: A viable selection must contain `5..8` responsibility-bearing semantic usages, `7..14` typed directed semantic interactions, `6..12` nontrivial contract cases, and `4..6` distinct scenario families; retain exactly one principal decision owner; and cover nominal, boundary, invalid/fault, and recovery behavior without count padding.

DS-DIVERSITY-01: The replicate-2 diversity constraint excludes another monitoring-start gate, impedance-acquisition coordinator, or acquisition-session supervisor. The selected primary controlled purpose is Doctor-facing EIT-image availability, with acquisition represented only by an opaque external upstream event.

DS-FACT-01: The seed supplies six use-case names and associations involving Doctor, EngineerTechnician, EITSystem, and an unassociated Patient, but it leaves boundaries, ordering, interfaces, values, validity, authority, policy, state, faults, and recovery open. No option may treat a selected finite policy as source fact.

## Comparison of seed candidate scopes

DS-SCOPE-01: Electrode-belt preparation and calibration support is plausible and diversity-compliant but not selected. It could center technician preparation evidence, yet the source supplies no belt-placement observation, calibration result, retry rule, or acceptance semantics; at this scale its meaningful state would depend on a larger proportion of invented physical-preparation concepts.

DS-SCOPE-02: Monitoring start and impedance acquisition is not selected because it is the accepted replicate-1 controlled purpose and is explicitly excluded by the diversity card. Renaming its session, readiness, or acquisition states would not create a new system.

DS-SCOPE-03: Impedance-to-EIT-image generation is plausible and partially selected only as availability coordination. The chosen boundary admits an opaque acquisition event, requests external logical generation, correlates an opaque result, and controls image availability; it does not invent a reconstruction algorithm, impedance representation, or image-quality rule.

DS-SCOPE-04: Image-analysis support is plausible and contributes the Doctor-facing review boundary, but automated analysis is not selected. The system makes a generated token available for human analysis and reports availability without creating findings, diagnostic outcomes, annotations, or treatment recommendations.

DS-SCOPE-05: A six-use-case lifecycle system is rejected because the source does not establish their order or one encompassing system identity. Combining belt application, calibration, monitoring, collection, generation, and analysis would silently resolve the EITSystem ambiguity, manufacture Patient participation, and exceed a coherent small controlled purpose.

## Selection criteria

DS-CRIT-01: Diversity fidelity requires a primary controlled purpose other than monitoring or acquisition, at least two genuine architectural differences from the closest replicate-1 baseline, and no acquisition-authorization state machine hidden under new names.

DS-CRIT-02: Purpose fidelity favors a boundary that uses source-grounded generation and Doctor-analysis vocabulary while keeping acquisition external and avoiding reconstruction, quality, diagnosis, or clinical-performance claims.

DS-CRIT-03: Owner integrity requires exactly one usage to own image lifecycle, recovery, result correlation, request applicability, priority, and all counted cases. Other usages must derive distinct owner-local facts without becoming competing policy owners.

DS-CRIT-04: Partition closure favors finite inputs with explicit validity, A/B correlation witnesses, a neutral intent, a later fresh intent, explicit release, and a separately handled valid generation failure so nominal, boundary, fault, and recovery traces are finite and exhaustive.

DS-CRIT-05: Responsibility cohesion favors independent qualification of the three external samples, followed by one stateful governor and two recipient-specific downstream derivations: generation targeting and Doctor publication.

DS-CRIT-06: Realizability favors finite domains, one ordered owner-local partition, exact semantic counts, semantic depth `1..2`, one weak region, and exhaustive bounded analysis, while retaining concrete implementation questions for Model review.

## Responsibility-allocation alternatives

DS-ALT-01: Alternative A, selected, uses Upstream Acquisition Qualification, Doctor Intent Qualification, Generation Result Qualification, one stateful Image Availability Governor, Generation Directive Derivation, and Doctor Publication. It has exactly six semantic usages and twelve typed directed interactions, and all twelve policy cases remain local to the one principal owner.

DS-ALT-02: Alternative B places acquisition and generation-result qualification in one Image Evidence Qualification usage, followed by intent qualification, one governor, and the same two output derivations. It is coherent at five usages and can fit the interaction bound.

DS-ALT-03: Alternative B is rejected because acquisition validity and result validity come from different external responsibilities and participate at different lifecycle times. Combining them would make one usage own a cross-product whose acquisition fact must later be fanned out separately for directive targeting, obscuring boundary responsibility and result-correlation diagnostics.

DS-ALT-04: Alternative C gives a separate Result Correlation Arbiter the pre-state/result matching decision before a stateful Image Lifecycle Owner applies request and recovery policy.

DS-ALT-05: Alternative C is rejected because correlation mismatch is the highest-priority state-dependent case. Moving it outside the lifecycle owner either duplicates pre-state and fault priority or creates a competing principal decision owner.

DS-ALT-06: Alternative D centralizes qualification, state, directive, and publication in one coordinator and adds thin input/output adapters to satisfy the usage minimum.

DS-ALT-07: Alternative D is rejected because the added adapters would only copy, rename, bundle, or route values and fail semantic-usage credit. The central usage would also couple external validity, lifecycle policy, generator targeting, and Doctor publication despite their different responsibilities.

DS-ALT-08: Alternative E stores image lifecycle in the publication usage while a separate stateless request arbiter chooses generation work.

DS-ALT-09: Alternative E is rejected because release, generation completion, retained availability, and recovery jointly determine both state and publication. Splitting state from that principal decision would require duplicated applicability or an incomplete state owner.

## Selected direction and consequences

DS-DEC-01: Alternative A is selected as the final generation baseline. Its exact usages are PART-01 through PART-06, its exact flows are INT-01 through INT-12, and its exact policy partition is CASE-01 through CASE-12 in `system-abstract.md`.

DS-RATIONALE-01: PART-01 through PART-03 each earn semantic credit through status-dependent many-to-one qualification; PART-04 owns all lifecycle and recovery decisions; PART-05 derives a producer-total A/B generation directive from two inputs; and PART-06 derives delivery gating plus prioritized Doctor status from the committed resolution.

DS-RATIONALE-02: The governor receives qualified facts rather than raw sample representations, but it alone decides whether a valid result is expected, whether release preempts valid completion, when generation starts or waits, and how invalid recovery progresses.

DS-RATIONALE-03: Separate directive and publication usages are justified by different external recipients and different total output partitions. Neither usage stores or recomputes the governor's lifecycle decision, and neither is a one-to-one renaming wrapper.

DS-CONSEQ-01: The selected policy treats any invalid sample or unexpected result as a clearing fault, requires neutral-then-fresh intent recovery, gives valid release priority over valid pending or matching completion evidence, and handles a valid reported generation failure by returning to empty without fault recovery. These are finite pilot decisions, not clinical, electrical, or source-derived rules.

DS-CONSEQ-02: The source's ambiguous EITSystem actor is not assigned as the coordinator. External acquisition and generation roles are separately named pilot contexts, the Doctor is the review requester and recipient, and EngineerTechnician plus Patient remain context-only.

## Replicate-2 diversity determination

DS-BASELINE-01: The closest accepted baseline is the replicate-1 small `EIT Monitoring-Start and Impedance-Acquisition Coordinator`, because both are small finite EIT coordinators with qualification, one principal owner, explicit invalid recovery, and opaque A/B witnesses.

DS-DIFF-BOUNDARY-01: The boundary genuinely differs: the baseline monitors Doctor start/stop, calibration, and impedance-token samples and controls acquisition plus impedance delivery; this design monitors acquisition events, image-review intent, and generation results and controls generation work plus image availability. No monitoring-start or acquisition-control interface remains.

DS-DIFF-STATE-01: State ownership genuinely differs: the baseline owner stores monitoring-session and recovery state, whereas PART-04 stores requested/ready image identity and intent-recovery state. No session-active, calibration-ready, or acquisition-authorized state is present.

DS-DIFF-TOPOLOGY-01: Interaction topology genuinely differs: three independent boundary qualifiers converge on the image governor, then its resolution branches to a two-input generator-directive owner and a Doctor-publication owner. The baseline instead joins request and acquisition evidence around a monitoring owner and branches toward acquisition command, impedance delivery, and monitoring status.

DS-DIFF-PRIORITY-01: Priority genuinely differs: this design orders invalid or state-correlated unexpected result, recovery, release, failure, completion, pending work, fresh request, and neutral retention. The baseline orders invalidity, recovery, stop, calibration-gated start, monitoring continuation, and stopped behavior.

DS-DIFF-RECOVERY-01: Recovery policy also differs after non-invalid failure: a valid `GenerationFailed` result returns to `Empty/Normal` and requires an explicit later retry but no neutralization, while invalid or mismatched evidence clears image state and requires neutral-then-fresh review intent. The baseline has no generated-image failure result and uses its recovery only around monitoring/acquisition inputs.

DS-NOT-EXTENSION-01: The selected system is not an extension, repartition, or rename of the baseline because its primary controlled effect is the lifecycle and publication of an image for review, not permission to monitor or collect impedance. Adding this behavior to the baseline would require new external generator/result boundaries, replace the state subject, remove acquisition control as an output, and introduce result-correlation and release priorities; those are architectural substitutions, not elaborations of the baseline pipeline.

## Final ownership, coverage, and count audit

DS-OWNER-01: PART-04 is the sole principal decision owner and sole state owner. It owns both state variables, result-correlation applicability, priority, and all twelve cases; PART-01 through PART-03, PART-05, and PART-06 own only their stated nonidentity local derivations.

DS-OWNER-02: No case, state, controlled output, or semantic interaction is unowned. Root and support routing are not owners, the bounded analyzer is not an architectural owner, and no stateless usage may duplicate PART-04's ordered selection.

DS-COVER-01: The ordered partition covers every finite owner snapshot: invalid or unexpected evidence; retained nonneutral recovery; first and repeated neutral recovery; fresh release; fresh request with each acquisition fact; normal release; expected failure; matching A/B completion; pending requested work including concurrent requests; new requests from empty or ready state; and neutral empty or ready retention.

DS-COUNT-01: The selected exact campaign tuple is `6` semantic usages, `12` typed directed semantic interactions, `12` nontrivial owner-local contract cases, and `5` scenario families. Each lies within the inclusive small-tier bounds and excludes root, contexts, types, ports, support, initialization, equations, invariants, helpers, analysis, and scenario variants.

DS-INT-01: The recounted complete interaction inventory is three root-to-qualification inputs, three qualification-to-governor facts, one governor-to-directive resolution, one acquisition-qualifier-to-directive target fact, one directive root output, one governor-to-publication resolution, and two publication root outputs: exactly twelve meaningful flows.

DS-SCENARIO-01: The five families are distinct: nominal A availability and release; no-acquisition, token-identity, pending-request, and replacement boundaries; invalid and unexpected-result faults; recovery ending in a qualifying B request; and recovery ending in release followed by explicit generation-failure retry. Together they witness all twelve cases.

## Model-review resolution and final authorization

DS-MODEL-FINDING-01: The Model's `revision-recommended` bounded-analysis finding is accepted. End-to-end composition exercises every raw root snapshot and every governor snapshot but cannot exercise downstream assigned inputs that PART-04 deliberately never produces. The approved revision therefore adds direct extensional products for PART-05 and PART-06 without changing any PART, INT, case, scenario, boundary quantity, domain behavior, ownership allocation, or deferred claim.

DS-MODEL-FINDING-02: The Model's extensional ownership `no-concern` finding is accepted. PART-01 through PART-03 remain status-dependent many-to-one classifiers, PART-04 remains the sole stateful principal decision owner, PART-05 remains a producer-total two-input fail-closed gate, and PART-06 remains a joint delivery/status classifier. Copying, record construction, A/B label preservation, routing, and delegation receive no semantic or owner credit.

DS-MODEL-FINDING-03: The Model's localized realization mapping is accepted and limited to generated support. The source shall use one root System, one uncredited behavior-free support Process, and the six semantic PART Threads as siblings; exactly twelve boundary delegation declarations and six direct internal declarations yield eighteen raw `PortConnection` declarations at physical depth two. This mapping preserves the exact twelve semantic INTs and creates no new semantic usage, interaction, case, scenario, or owner.

DS-MODEL-FINDING-04: The Model's realizability `no-concern` finding is accepted. CASE-06 and CASE-11 each remain one counted top-level applicability region while their finite A/B/no-acquisition results may use helper functions or conditional expressions; PART-04 shall constrain both state fields and the complete resolution locally, and PART-05 plus PART-06 shall consume only committed facts without recomputing lifecycle policy.

DS-LOCAL-CONTRACT-01: The final local-contract expectations are exact: PART-01, PART-02, and PART-03 implement the total qualification relations with fibers `3/1/1/1`, `3/1/1/1`, and `4/1/1/1/1`; PART-04 implements the twelve-region ordered total partition over `1200` qualified/pre-state snapshots with vector `957/54/27/27/27/27/27/12/12/12/9/9`; PART-05 implements all `660` resolution/acquisition pairs with directive fibers `15/15/630`; and PART-06 implements all `165` resolutions with delivery fibers `33/33/99`, status fibers `15/15/30/45/15/15/30`, and exact joint output agreement.

DS-ANALYSIS-01: The bounded evidence shall enumerate all `4320` raw end-to-end snapshots, all `1200` qualified PART-04 snapshots, each direct PART-01 through PART-03 assigned-input product, all `660` PART-05 pairs, and all `165` PART-06 values; it shall separately establish end-to-end unreachability of anomalous `GenerationStarted` pairings, replay all five scenario families, and report zero specified mismatches, gaps, or effective overlaps. These checks are finite conformance analysis only and do not become model behavior or ownership.

DS-METRICS-FINAL-01: The final architecture remains exactly `6` responsibility-bearing semantic usages, `12` typed directed semantic interactions, `12` nontrivial owner-local contract cases, and `5` scenario families, with one explicit root, semantic depth `1..2`, one weakly connected semantic region, and exactly one principal decision owner. Every metric remains within the frozen small bounds.

DS-CLAIM-FINAL-01: Generated-support allowances are limited to the mapping in DS-MODEL-FINDING-03. Electrode placement, contact quality, calibration, monitoring authorization, physical acquisition, impedance representation, reconstruction, image quality, automated analysis, diagnosis, treatment, consent, electrical safety, medical efficacy, regulation, certification, deployment, code generation, execution, formal proof, and production readiness remain deferred and shall be reported `not-run`, never passed.

DS-PASS-01: The final design passes Model resolution because its original purpose, boundary, ownership, priority, A/B correlation, valid-failure behavior, neutral-then-fresh recovery, twelve cases, five scenarios, and `6/12/12/5` tuple are unchanged, while the accepted evidence gap is closed by exact direct downstream owner products.

DS-AUTH-01: Model generation is authorized only from `system-abstract.md` and this final `design-selection.md`. Generation shall preserve every clause and count, implement the approved support mapping, produce the exact local and end-to-end bounded evidence, and retain every deferred claim boundary; tool compatibility does not authorize weakening the frozen seed policy or the approved behavior.

