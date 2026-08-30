---
decision_id: DS-MTR-FINAL-01
domain_seed: mining-threat-retreat-supervision-20260812-r1-a4
stage: designer-resolution
status: selected
selected_alternative: signal-centered-qualification-with-fault-assessment
rejected_alternative: phase-centered-qualification
revision_used: true
---

# Approved responsibility-allocation decision

## Scope and fixed policy

DS-SCOPE-01: This decision compares responsibility allocations only. It does not select an algorithm, executable profile, source construct, scheduling order, deployment, implementation technology, or detailed connection topology.

DS-FIXED-01: The finite phases, validity rules, readiness meanings, proposal domains, all C01 through C20 guards/order/commands/destinations/reasons, state initializations, C05 priority, scenarios, and claim exclusions are frozen by the seed and were not trade variables during Model-review resolution.

DS-REVISION-01: The revision changes only owner allocation and the semantic interaction inventory: identity-only Observation Intake loses semantic credit, Fault Assessment becomes PART-01, boundary admission becomes generated support, PQ retains independent validity qualification, and FA applies phase relevance for faulting.

DS-TRACE-REPAIR-01: The resumed visualization traceability review found that the combined `MON-01 STATE-01` clause did not provide independently resolvable exact anchors. The approved System Abstract therefore retains the same state semantics in two separately declared clauses, `MON-01` and `STATE-01`; no architecture, policy, metric, contract, scenario, or claim boundary changes.

## Alternatives considered

DS-ALT-A-01: **Selected Alternative A — signal-centered qualification with separate fault assessment.** TQ, RQ, and PQ each derive authoritative domain facts from their direct boundary families. MR and TR derive finite proposals, FA derives the phase-relevant fault from qualifier invalidity and AS current phase, AS owns phase and resolves proposal priority, and AP derives actuator posture and publishes one result.

DS-ALT-A-02: Alternative A keeps threat streak, phase, readiness, mission validity, fault relevance, proposal applicability, arbitration, and actuator mapping with distinct owners whose local contracts can be audited without raw-input recomputation by AS.

DS-ALT-B-01: **Rejected Alternative B — phase-centered qualification with shared arbitration.** Docked, Mining, Defending, Retreating, and Recovery decision responsibilities would qualify phase-relevant observations and send local results to shared arbitration.

DS-ALT-B-02: Alternative B remains plausible in general, but here it would repeat cross-phase invalidity/readiness rules or move them back into shared support, make state/qualification ownership less stable, and obscure cooperation at the required C05 conflict. No speculative metric is credited to it.

## Selection criteria and comparison

DS-CRIT-01: **Meaningful ownership.** Every credited usage must derive at least one behaviorally meaningful fact; copying, bundling, renaming, routing, or restating field equality is insufficient.

DS-CMP-OWNER-01: Original OI fails this criterion because ASM-01 already supplies a coherent current-tick snapshot and OI receives no timestamp, sequence, freshness, or provenance evidence. Its three outputs could only separate and forward inputs. FA passes because it derives the phase-sensitive FAULT-01 predicate from qualified invalidity facts and current phase.

DS-CRIT-02: **State and invalidity fidelity.** Streak and phase require one owner each, domain validity must be interpreted once by the responsible qualifier, and phase relevance must be applied without forcing PQ to consume phase or AS to requalify raw data.

DS-CMP-INVALID-01: TQ remains sole streak owner and AS sole phase owner. TQ/RQ/PQ derive domain invalidity; PQ specifically preserves independent intent, arrival, and resupply invalidity without phase context; FA alone applies Retreating and Docked/Recovery relevance. This is narrower and more local than the initial PQ/AS wording.

DS-CRIT-03: **Priority visibility and contract locality.** MR and TR must produce inspectable finite proposals, and AS must resolve C05 before simultaneous C07/C08 applicability through mutually exclusive effective guards rather than first-match text or central policy reconstruction.

DS-CMP-PRIORITY-01: The selected allocation preserves simultaneous MR and TR proposals and the published winning reason. Defending C14 can likewise precede TR fallback C15 without AS recomputing raw policy guards.

DS-CRIT-04: **Evidence clarity and bounded realizability.** Contracts, traces, the ownership audit, and the deterministic analyzer must use the same named local relations and accepted harness roles.

DS-CMP-EVIDENCE-01: Current retained forms support composite typed data, ports/connections, nested fields, local state, initialization, and compute cases. The harness role vocabulary is limited to `applicability`, `proposal`, and `decision`; qualification/state details therefore belong in evidence fields rather than invented role labels. This mapping does not change the domain policy.

## Approved allocation and interfaces

DS-PARTS-01: The exactly eight semantic usages are FA, TQ, RQ, PQ, MR, TR, AS, and AP. MR and TR are cooperating proposal owners; AS is their priority/phase decision owner. TQ owns streak, AS owns phase, FA owns fault, and AP owns command-to-actuator mapping.

DS-INTS-01: The exactly 18 semantic interactions are two AS phase-to-policy flows, two TQ qualified-threat fan-outs, two RQ policy-fact flows, two PQ policy-fact flows, two policy proposals, TQ and RQ publication flows to AS, PQ/TQ/RQ invalidity flows to FA, AS phase to FA, FA fault to AS, and AS atomic result to AP.

DS-SUPPORT-01: Root input ports and direct raw-family routes to TQ/RQ/PQ, root output binding, types/payload fields, connections/containment, and at most one behavior-free Process/container may be generated support with specific trace justification. They receive no semantic owner or interaction credit and may not introduce policy, state, or decisions.

## Contract and analysis decision

DS-CONTRACT-01: Owner-local contracts are required for TQ threat/streak mapping, RQ readiness/advisories/invalidity, PQ mission facts/independent invalidity, MR/TR proposal closure, FA exact fault mapping, AS mutually exclusive effective priority resolution, and AP actuator/atomic publication mapping.

DS-CONTRACT-02: CASE-01 through CASE-20 remain the exactly 20 counted nontrivial contract cases. Local qualification partitions, initialization, state ownership, fault mapping, and atomicity support those cases and shall not be duplicated or relabeled to alter the metric.

DS-ANALYSIS-01: The bounded analyzer shall stream all 47,185,920 finite state/input tuples through named TQ/RQ/PQ/MR/TR/FA/AS/AP relations, retain counters and witnesses, bind results to the source hash, and report zero gaps, effective overlaps, and mismatches plus ownership-audit agreement within the 180-second harness allowance.

DS-ANALYSIS-02: The analyzer may not centrally reproduce local qualification, readiness, proposal, fault, arbitration, or actuator behavior. Its finite exhaustive result is bounded evidence only; it does not independently infer source semantics and is not formal proof or physical validation.

## Decision

DS-DECISION-01: Select Alternative A with Fault Assessment and approve the revised System Abstract as the final baseline. Accept the Model's owner-padding finding and its phase-relevance narrowing; accept the no-concern conclusion for proposal/arbitration sufficiency; accept the tool/harness observations only as local realization constraints, not as authority to weaken policy.

DS-METRIC-01: Final architecture metrics are exactly 8 semantic usages, 18 semantic interactions, 20 counted nontrivial contract cases, 7 scenario families, 1 weakly connected semantic region, and containment depth 1 through 2. These satisfy every inclusive medium campaign bound and retain at least two cooperating owners plus explicit C05-over-C07/C08 priority.

DS-AUTH-01: Model regeneration is authorized against the trace-repaired `system-abstract.md` and this decision only. The Model shall preserve distinct exact trace anchors for `MON-01` and `STATE-01`, shall not restore Observation Intake as a credited usage, add synthetic freshness sensing, change any frozen case, or claim execution order, physical success, safety, proof, readiness, or certification.

DS-DEFER-01: Algorithms, implementation components, source encodings, scheduling/deployment, physical validity, mission success, profitability, survivability, safety, readiness, certification, code generation/execution, and formal proof remain deferred or excluded exactly as stated in the approved System Abstract.
