# Approved Design Selection — EIT Monitoring-Start and Impedance-Acquisition Coordinator

## Decision scope and evidence boundary

DS-BASIS-01: This decision selects one coherent `small` system from the reusable EIT seed before SysML realization. Source facts, handbook-derived method, pilot abstractions, the selected architecture, and deferred claims remain separately classified in `system-abstract.md`.

DS-BOUNDS-01: A viable selection must contain `5..8` responsibility-bearing semantic usages, `7..14` typed directed semantic interactions, `6..12` nontrivial contract cases, and `4..6` distinct scenario families; retain exactly one principal decision owner; and cover nominal, boundary, invalid/fault, and recovery behavior without count padding.

DS-FACT-01: The seed supplies six use-case names and associations involving Doctor, EngineerTechnician, EITSystem, and an unassociated Patient, but it leaves boundaries, ordering, interfaces, values, validity, authority, policy, state, faults, and recovery open. No option may treat a selected policy as source fact.

## Comparison of seed candidate scopes

DS-SCOPE-01: The monitoring-start and impedance-acquisition scope is selected. Doctor monitoring-start, EngineerTechnician calibration, and EITSystem impedance-collection vocabulary support one closed finite coordination question: whether monitoring and collection are logically admitted now and whether an opaque observed token may be delivered onward.

DS-SCOPE-02: The electrode-belt preparation and calibration support scope is plausible but not selected. The source associates the technician with both activities, yet supplies no belt-placement state, contact evidence, calibration result, retry criterion, or completion rule; a recovery-bearing small policy would therefore depend almost entirely on invented preparation semantics.

DS-SCOPE-03: The impedance-to-EIT-image generation scope is plausible but not selected. The source names collection and image generation, but supplies no impedance representation, frame completeness, reconstruction input, image representation, or quality rule. A meaningful fault boundary would require more invented data semantics than the selected coordination scope.

DS-SCOPE-04: The image-analysis support scope is plausible but not selected. Doctor analysis is source-associated, but the source does not define annotations, analysis requests, display state, findings, review completion, or diagnostic outcomes; automated diagnosis is explicitly unsupported.

DS-SCOPE-05: A six-use-case lifecycle system is rejected because the source does not establish their order or one encompassing system identity. Combining belt application, calibration, monitoring, collection, generation, and analysis would silently resolve both EITSystem boundary ambiguity and Patient participation while exceeding a coherent small purpose.

## Selection criteria

DS-CRIT-01: Purpose fidelity favors the smallest boundary that directly uses the three relevant source associations without asserting image correctness, clinical analysis, patient behavior, or physical acquisition success.

DS-CRIT-02: Owner integrity requires exactly one usage to own session state, recovery state, invalidity priority, calibration applicability, command selection, and all counted cases. Other usages must derive distinct owner-local facts without becoming competing policy owners.

DS-CRIT-03: Partition closure favors finite inputs with explicit validity, a safe invalid response, a neutral observation, and a later fresh request so nominal, boundary, fault, and recovery traces can be stated without timing assumptions.

DS-CRIT-04: Responsibility cohesion favors joint calibration-and-token evidence because validity, calibration absence, and token availability together define acquisition evidence, while Doctor reporting and image-consumer delivery change for different recipients and should remain separate.

DS-CRIT-05: Realizability favors finite domains, one ordered owner-local partition, exact semantic counts, semantic depth `1..2`, one weak region, and exhaustive analysis, while preserving concrete implementation questions for final generation.

## Responsibility-allocation alternatives

DS-ALT-01: Alternative A, selected, uses Request Qualification, joint Acquisition Evidence Qualification, one stateful Monitoring Decision Owner, Impedance Delivery Derivation, and Doctor Status Derivation. It has exactly five semantic usages and twelve typed directed interactions, and all twelve policy cases remain local to the one principal owner.

DS-ALT-02: Alternative B separates Calibration Qualification and Impedance Observation Qualification, sending both facts plus qualified request to one stateful owner, followed by the same two output derivations. It is coherent at six usages and can fit within the interaction bound.

DS-ALT-03: Alternative B is rejected because calibration and token validity would be independently classified even though the selected fault response and every monitoring case consume their joint applicability. The split adds an interface and forces repeated cross-product exclusions at the owner without creating a distinct external responsibility or policy benefit at this scale.

DS-ALT-04: Alternative C places request qualification, acquisition-evidence qualification, stateful monitoring selection, token delivery, and Doctor status in one central coordinator, with thin boundary adapters added only to reach the minimum usage count.

DS-ALT-05: Alternative C is rejected because its added adapters would only copy, rename, or route values and would fail semantic-usage credit. Without those adapters it also couples validity intake, session policy, two recipient-specific outputs, and state in one change-uncoupled owner.

DS-ALT-06: Alternative D gives a stateless Readiness Arbiter the calibration-and-validity applicability decision before a separate stateful Session Owner applies request and recovery policy.

DS-ALT-07: Alternative D is rejected because the arbiter would own the decisive predicate that separates accepted and denied starts, creating a competing applicability decision location. The selected joint qualifier reports evidence categories while PART-03 alone owns their decision significance.

## Selected direction and consequences

DS-DEC-01: Alternative A is selected for Model review. Its exact usages are PART-01 through PART-05, its exact flows are INT-01 through INT-12, and its exact policy partition is CASE-01 through CASE-12 in `system-abstract.initial.md`.

DS-RATIONALE-01: PART-01 earns semantic credit by collapsing all invalid request values into one qualified fact; PART-02 earns credit through a joint `18/3/1/1/1` evidence partition; PART-03 owns state and policy; PART-04 gates token delivery using both decision and evidence; and PART-05 derives a prioritized Doctor status using both decision and evidence.

DS-RATIONALE-02: Joint evidence qualification keeps all raw status semantics outside the stateful owner without pre-deciding whether monitoring is allowed. PART-03 still sees every category needed to own invalidity, calibration readiness, recovery, start, stop, and continuation.

DS-RATIONALE-03: Separate delivery and status usages are justified by different external recipients and different total output partitions. Neither can recover the other's output from a one-to-one rename, and neither stores or recomputes the session decision.

DS-CONSEQ-01: The selected policy requires valid current calibration for start and continued monitoring, treats any invalid input as a same-evaluation fault, and requires neutral-then-fresh request recovery. These are conservative finite pilot decisions, not clinical, electrical, or source-derived rules.

DS-CONSEQ-02: The source's EITSystem actor is treated as an external acquisition context for this boundary, while the selected coordinator is a new pilot abstraction. The Patient remains context-only, and image generation consumes only a gated opaque token rather than being modeled inside the system.

## Final ownership, coverage, and count audit

DS-OWNER-01: PART-03 is the sole principal decision owner and sole state owner. It owns both state variables, readiness applicability, priority, command relation, and all twelve cases; PART-01, PART-02, PART-04, and PART-05 own only their stated nonidentity local derivations.

DS-OWNER-02: No case, state, controlled output, or semantic interaction is unowned. Root and support routing are not owners, the bounded analyzer is not an architectural owner, and no stateless usage may duplicate PART-03's ordered selection.

DS-COVER-01: The ordered partition covers every finite owner snapshot: invalid request or evidence; retained nonneutral recovery; first and repeated neutral recovery; fresh stop; fresh calibrated or uncalibrated start; normal stop; normal calibrated or uncalibrated start; active neutral continuation; and all remaining valid neutral stopped or calibration-loss combinations.

DS-COUNT-01: The selected exact campaign tuple is `5` semantic usages, `12` typed directed semantic interactions, `12` nontrivial owner-local contract cases, and `5` scenario families. Each lies within the inclusive small-tier bounds and excludes root, contexts, types, ports, support, initialization, equations, invariants, analysis, and scenario variants.

DS-INT-01: The recounted complete interaction inventory consists of three root-to-qualification inputs, two qualification-to-owner facts, one owner-to-root command, two inputs to delivery derivation plus its root output, and two inputs to status derivation plus its root output: exactly twelve flows with no count-only edge.

DS-SCENARIO-01: The five families are distinct: nominal monitoring/token delivery/stop; calibration and token boundaries; invalid status combinations; recovery ending in a qualifying fresh start; and recovery ending without authorization. Together they witness all twelve cases.

## Model-review questions and resolution

DS-QUESTION-01: Can the trusted SysML-AADL/GUMBO subset express PART-03's two owner-local state variables, initialization, explicit pre-state references, twelve ordered effective guards, and same-evaluation next-state/command relation without duplicating the principal decision or leaving state unconstrained?

DS-QUESTION-02: What one-root concrete containment and delegation mapping preserves exactly five semantic usages, semantic depth `1..2`, one weak semantic region, and INT-01 through INT-12 while reporting every required support usage and raw connection separately as uncounted generated support?

DS-QUESTION-03: Can PART-02's joint twenty-four-value evidence relation, PART-04's producer-total delivery relation, and PART-05's prioritized status relation each be represented as owner-local nonidentity contracts without central recomputation that would invalidate usage credit?

DS-QUESTION-04: Can a deterministic analyzer exhaust all 864 raw input/state snapshots, report the induced 120 qualified snapshots, witness all twelve effective cases and five scenarios, and check unreachable anomalous delivery pairings without becoming a second architectural decision owner?

DS-PASS-01: The approved design passes to generation because its purpose and boundary are coherent, every added policy is labeled as a pilot abstraction, all finite partitions including fresh-request recovery are closed, every responsibility and flow is meaningful, and the exact `5/12/12/5` tuple satisfies the frozen small tier.

DS-AUTH-01: Model generation is authorized from the two approved Markdown artifacts. Any realizability concern shall identify the exact clause and smallest correction in this same immutable run; it shall not silently narrow the purpose, remove a case or scenario, add count-only structure, reinterpret opaque tokens, or attribute pilot policy to the seed.

## Final Model-finding dispositions and generation baseline

DS-MODEL-01: The owner-integrity finding is accepted. PART-01's `3/1/1/1` request-qualification fibers, PART-02's `18/3/1/1/1` evidence-qualification fibers, PART-03's stateful twelve-case relation, PART-04's `7/1/1/1` delivery fibers, and PART-05's `10/10/12/19/19` status fibers establish five nonidentity owner-local derivations without creating another principal decision owner.

DS-MODEL-02: The concrete containment finding is accepted only as a generated realization allowance. One explicit root System, one behavior-free uncredited support Process at depth one, and the five semantic Thread usages at depth two may realize the approved allocation; this mapping does not add a semantic usage, alter an INT endpoint, or become an EIT domain claim.

DS-MODEL-03: The connection and GUMBO mapping finding is accepted with the existing priority constraint controlling generation. Twelve raw System/Process delegation connections may realize the six boundary interactions, and six direct inter-Thread connections may realize INT-04, INT-05, INT-07, INT-08, INT-10, and INT-11, for eighteen raw connections realizing exactly twelve semantic interactions. Every CASE guard shall encode explicit exclusion of earlier priorities because conjunctive `compute_cases` do not provide first-match semantics.

DS-MODEL-04: The bounded-enumeration finding is accepted. Retained evidence shall enumerate exactly 864 raw snapshots and 120 qualified owner snapshots, report the reviewed case-count vectors `756/24/12/12/12/6/6/12/6/6/3/9` and `48/16/8/8/8/6/2/8/6/2/3/5`, and meet ANALYSIS-01 through ANALYSIS-03 without treating the analyzer as an architectural owner or formal proof.

DS-MODEL-05: The executable-profile and claim-boundary finding is accepted. `executable_profile: false` remains unchanged, and DEFER-01 remains controlling: physical, timing, clinical, safety, regulatory, executable, proof, deployment, and production claims stay deferred and shall be reported `not-run` where applicable.

DS-FINAL-01: The exact approved architecture is five semantic usages, twelve typed directed semantic interactions, twelve nontrivial owner-local cases, five scenario families, one root, semantic depth `1..2`, one weak semantic region, and exactly one principal decision and state owner, PART-03.

DS-LOCAL-01: Generation shall retain the complete local contracts: PART-01 total request qualification over six raw samples; PART-02 total joint evidence qualification over twenty-four raw pairs; PART-03 initialization, two pre-state fields, explicit-priority CASE-01 through CASE-12, complete next state, disposition, and command; PART-04 producer-total delivery gating including safe anomalous-pair handling; and PART-05 total prioritized Doctor-status derivation. Wiring, root declarations, support, and analysis shall not duplicate these derivations.

DS-END-TO-END-01: End-to-end evidence shall check all qualification results, effective case exclusivity and coverage, state transitions, commands, deliveries, statuses, every individual and combined invalid-status input, all five scenario families, every case witness, anomalous delivery-pair unreachability, and reachable owner states. This obligation is finite conformance analysis, not execution, proof, safety assessment, or clinical validation.

DS-SUPPORT-FINAL-01: Generated support is limited to the behavior-free Process, containment, boundary delegation, typed ports, library-mandated declarations, and routing required for the accepted mapping. Every support element and each nonsemantic delegation hop shall carry a specific uncounted `@generated-support` rationale and may not derive, store, select, qualify, or alter a domain fact.

DS-DEFER-FINAL-01: Deferred claims remain electrode placement and contact quality; stimulation, sensing, and impedance physics; numeric values, units, and timing; image reconstruction and quality; automated analysis, diagnosis, treatment, consent, and patient control; achieved acquisition and hardware feedback; electrical safety and medical efficacy; regulatory compliance and certification; code generation and execution; formal proof; deployment; and production readiness.

DS-AUTH-FINAL-01: No substantive Designer revision is used. The final Markdown files explicitly approve the initial policy unchanged, resolve all Model findings, and authorize Model generation only against this exact baseline.
