# Approved Design Selection — EIT Acquisition Session Coordinator

DS-CONTEXT-01: This record compares every candidate scope named by the frozen seed and five responsibility allocations for the selected scope. The comparison uses the seed as evidence, not as a fixed interface, sequence, or architecture.

## Selection criteria

DS-CRIT-01: Source fit favors a purpose built from source-named preparation, monitoring, impedance-collection, image-generation, or image-analysis vocabulary without inventing clinical outcomes.

DS-CRIT-02: Boundary coherence favors one understandable controlled purpose with finite monitored and controlled quantities and a defensible treatment of the ambiguous `EITSystem` actor.

DS-CRIT-03: Medium-tier substance requires 8–12 non-padded semantic usages, 15–21 distinct semantic interactions, 12–20 nontrivial cases, 6–9 scenario families, at least two cooperating decision or qualification owners, state, fault/recovery behavior, and an explicit priority conflict.

DS-CRIT-04: Behavioral auditability favors exact finite domains, sole state owners, complete owner-local partitions, deterministic conflict resolution, bounded recovery clearing, and fresh-request re-entry.

DS-CRIT-05: Claim discipline rejects automated diagnosis, image-quality conclusions, patient outcome, electrical safety, clinical efficacy, regulatory compliance, and production claims unsupported by the seed.

DS-CRIT-06: Responsibility integrity rejects input adapters, identity enum translators, bundlers, routers, and output fan-out usages introduced only to hit campaign counts.

DS-CRIT-07: Realizability permits narrow behavior-free containment support only when the Model review names a SysML-AADL need and reports raw metrics separately from the frozen semantic topology.

## Candidate system-scope comparison

DS-SCOPE-01: Alternative A is electrode-belt preparation and calibration support centered on the EngineerTechnician. It is strongly source-aligned and can expose qualification and recovery, but medium-scale monitoring and impedance behavior would become downstream invention rather than the primary purpose. It is credible for another run but not selected.

DS-SCOPE-02: Alternative B is monitoring-start and impedance-acquisition coordination centered on preparation-qualified collection and Doctor start/stop requests. It uses four source-named lifecycle capabilities coherently, provides observable command/data/status outcomes, supports two distinct states and multiple cooperating qualification owners, and can remain agnostic about physical sensing and later images. It is selected.

DS-SCOPE-03: Alternative C is impedance-to-EIT-image generation. It is a coherent technical pipeline and uses the two source-associated `EITSystem` use cases, but the seed supplies no image or impedance representation, transformation semantics, quality rule, or failure behavior; a medium contract partition would depend heavily on invented reconstruction policy. It is rejected for this run.

DS-SCOPE-04: Alternative D is image-analysis support for the Doctor. It can expose image availability and analysis-session workflow without automated diagnosis, but the seed supplies no analysis outputs, criteria, decisions, or controlled outcomes. It is rejected because a substantive medium design would be mostly assumption-derived.

DS-SCOPE-05: A combined end-to-end EIT system spanning all six use cases was also considered because the source boundary includes all six. It is rejected: it would blur human physical work, acquisition, image generation, and clinical analysis and would falsely resolve the source's `EITSystem` actor/boundary ambiguity.

DS-RESULT-01: The selected primary scope is a logical EIT Acquisition Session Coordinator. It treats the source-named `EITSystem` as unresolved vocabulary, places physical acquisition equipment and humans outside the new boundary, and makes preparation-qualified monitoring and admitted impedance delivery its primary controlled purpose.

## Responsibility-allocation alternatives

DS-ALLOC-01: Allocation 1, selected distributed qualification and dual-state governance, assigns belt assessment, belt-dependent calibration qualification, acquisition eligibility/recovery, request arbitration, preparation state, monitoring state, acquisition command, and session publication to eight cohesive owners. `BeltQualificationOwner` derives the many-to-one `qualified` Boolean while retaining an uncredited three-way reason category; the allocation exposes cooperation and conflict while keeping each state singly owned.

DS-ALLOC-02: Allocation 2, centralized session controller, would send all six inputs to one stateful controller and leave separate command and publication usages as output mappers. It would make medium size depend on pass-through components and would obscure owner-local qualification evidence.

DS-ALLOC-03: Allocation 3, phase-specific controllers, would allocate application, calibration, monitoring, and collection phases to separate state owners. It mirrors the use-case list but creates competing lifecycle authorities and makes simultaneous stop, setup loss, and acquisition fault harder to resolve atomically.

DS-ALLOC-04: Allocation 4, acquisition pipeline with one adapter per input, would validate Doctor, technician, belt, calibration, acquisition, and frame inputs separately before a central decision. Most adapters would merely preserve or rename already finite values and would violate the owner-count rule.

DS-ALLOC-05: Allocation 5, one combined preparation governor plus monitoring governor, would reduce interactions, but it would hide the distinction between raw belt qualification, belt-dependent calibration qualification, and state transition. It is rejected because independent owner-local partitions are useful evidence and not padding.

DS-RESULT-02: Allocation 1 is approved because its eight usages each derive a distinct reviewable fact, `PART-01` now has nonidentity Boolean evidence, its qualification chain is acyclic apart from explicit state feedback, its two states have sole owners, and the arbiter resolves rather than duplicates downstream decisions.

## Selected boundary and topology rationale

DS-BOUND-01: The six finite inputs are Doctor request, EngineerTechnician request, belt observation, calibration observation, acquisition availability, and one opaque frame observation. The three outputs are logical collection command, admitted opaque frame delivery, and shared session status.

DS-BOUND-02: Patient remains context-only because the seed gives no association; no consent, control, sensing, or physiological variable is invented. Physical equipment is external because the chosen boundary coordinates acquisition rather than implementing sensing.

DS-TOPO-01: The semantic topology contains two upstream qualification owners, one combined eligibility/recovery owner, one arbiter, two state owners, and two controlled-output policy owners. Exactly 21 typed directed interactions connect every boundary value to a behavioral path and every output to its owner; physical realization places all eight as Threads in one uncredited Process.

DS-TOPO-02: `EligibilityEnvelope` carries qualified facts and pre-states to arbitration and monitoring only on `INT-12` and `INT-16`; `INT-14` carries `PreparationDecisionSnapshot`. `BeltAssessment` travels on `INT-07` and `INT-08`, allowing both consumers to use the owner-local Boolean without recomputation.

DS-TOPO-03: Pre-evaluation preparation and monitoring states feed eligibility, the arbiter qualifies request applicability, and the preparation decision feeds the monitoring decision so final status contains committed next states. The two governors retain exclusive write authority; the approved realization uses Thread-local state, explicit initialization, and `In(...)` pre-state references inside the selected Process containment.

## Policy and recovery rationale

DS-PRI-01: Stop has highest priority because it gives deterministic effect to an explicit Doctor stop even during a simultaneous recovery condition; this is policy, not a safety ranking or an exclusive-authority claim.

DS-PRI-02: Mandatory preparation reset precedes monitoring hold because loss of belt or stale calibration invalidates the preparation state and active monitoring must also leave active. Technician reset/calibration/confirmation then precede Doctor start, making simultaneous reset-versus-start the required fresh-request conflict.

DS-REC-01: Active loss of eligibility yields held monitoring or preparation reset with held monitoring. Held state prevents automatic restart when observations recover and requires a fresh start, making the recovery exit finite and observable.

DS-REC-02: A simultaneous stop and preparation fault takes two logical evaluations: stop first, then persistent setup recovery. This preserves the single-intent rule and gives the analyzer a concrete priority trace without claiming timing.

DS-REC-03: Preparation never auto-advances from observations. After reset, explicit confirm and calibration-record requests are required before a later start, separating observation qualification from human workflow intent.

## Metric and ownership audit

DS-METRIC-01: The frozen semantic campaign tuple is exactly `8 semantic usages / 21 semantic interactions / 20 nontrivial owner-local cases / 7 scenario families`, within all medium-tier bounds and not selected by padding.

DS-METRIC-02: Final raw architecture metrics are exactly one root System, one uncredited generated-support Process, nine reachable non-root usages, depth two, nine uncredited root/Process routes, 21 Process-local semantic connections, 30 raw source `PortConnection` declarations, and one semantic weakly connected region.

DS-OWNER-01: `BeltQualificationOwner` owns the many-to-one `qualified` predicate and `CalibrationQualificationOwner` owns belt-dependent blocking, satisfying the cooperating-qualification requirement without counting the three-way category projection. `AcquisitionEligibilityOwner` and `RequestArbiter` add combined recovery and priority decisions.

DS-OWNER-02: `PreparationStateGovernor` alone writes preparation state and `MonitoringStateGovernor` alone writes monitoring state. Eligibility and arbitration may propose facts but shall not duplicate state transition relations.

DS-OWNER-03: `AcquisitionCommandPolicy` receives credit for a many-to-one active-state classification; `SessionPublicationPolicy` receives credit for frame admission and notice precedence. State copies in status, port fan-out, record construction, and route delegation receive no credit.

DS-CASE-01: Cases 01–20 partition the owner-local relations exactly `3/3/5/4/2/1/1/1` across `PART-01` through `PART-08`: three belt-assessment cases constrain both record attributes, three calibration cases consume the supplied Boolean, five eligibility/recovery cases consume the supplied Boolean and category, four arbitration cases, two preparation-transition cases, and one each for monitoring transition, command, and publication.

DS-AUDIT-01: The end-to-end raw product is exactly `3 × 4 × 3 × 4 × 2 × 4 × 3 × 3 = 10,368` input/pre-state combinations. The bounded analyzer must enumerate the full product, every producer-local type product, and every producer-reachable consumer product, compare the owner-local relations in `metrics.json`, and never convert a producer legality guarantee into an environmental assumption.

DS-AUDIT-02: Every raw input has an absent/invalid or explicit no-request value where needed, every controlled output is total, initialization is explicit, stop/recovery conflict is resolved, held recovery has a fresh-request exit, preparation recovery has a fresh confirm/calibrate/start path, and unmatched requests are rejected without hidden transition.

## Assumptions and deferred claims

DS-ASM-01: Finite request, observation, frame, state, reason, and disposition values are pilot abstractions selected for exhaustive analysis, not source facts or physical EIT representations.

DS-ASM-02: A Doctor supplies logical start/stop requests and an EngineerTechnician supplies logical preparation requests. The source associations motivate participation but do not establish exclusive authority, ordering, or interface semantics.

DS-ASM-03: One logical evaluation uses pre-state and commits at most one next value per state owner. No sampling rate, latency, throughput, concurrency implementation, or physical chronology is claimed.

DS-DEFER-01: Belt geometry/contact quality, excitation, physical collection, impedance units and values, calibration criteria, image reconstruction, image quality, image analysis, diagnosis, treatment, patient outcome, safety, regulatory compliance, certification, and production readiness remain outside the selected design.

DS-DEFER-02: Code generation, application implementation, execution, formal proof, physical validation, and clinical validation are not required by this run profile and remain `not-run`; bounded analysis and typechecking shall not be described as those stronger forms of evidence.

## Final disposition and Model-realization selection

DS-REVIEW-01: The resumed visualization traceability finding is accepted and localized to declaration syntax: every counted contract clause now begins with the canonical two-anchor form `BEH-* / CASE-*:`. `CASE-01` through `CASE-20` are therefore exact, unique System Abstract anchors; no behavior, allocation, metric, policy, or claim boundary changes for this repair.

DS-DISP-01: Approved for Model generation after accepting the `PART-01` owner-integrity correction and the localized containment, record-classifier, and trace mappings. The exact semantic tuple remains `8/21/20/7`; the boundary, priority conflicts, recovery exits, state policies, and seven scenarios are unchanged.

DS-MODEL-01: The selected legal containment is one behavior-free Process beneath the root System, eight semantic Threads beneath that Process, and exactly nine tagged root/Process support routes. No other generated support is authorized.

DS-MODEL-02: Every GUMBO-inspected record member shall be a Data `attribute`; each enum projection field in `EligibilityEnvelope`, `ArbitrationDecision`, `PreparationDecisionSnapshot`, `MonitoringDecisionSnapshot`, and `SessionStatus` shall use its own extensionally identical classifier. These representation mappings earn zero semantic, owner, interaction, or case credit.

DS-MODEL-03: Cases 17 and 18 shall use explicit initialization, state variables, `In(...)` pre-state references, field-by-field guarantees, and one owner-local partition per semantic Thread. Producer guarantees define legal records, while bounded analysis covers producer-local and reachable consumer products without environmental-assumption weakening.

DS-MODEL-04: Deferred claims remain exactly those in `DS-DEFER-01` and `DS-DEFER-02`. Model generation is authorized, but final acceptance still requires typechecking, structural and trace checks, exhaustive bounded analysis, all seven scenario traces, and separate Designer validation.
