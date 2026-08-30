---
decision_id: DS-MTR-R2-S-01
domain_seed: mining-threat-retreat-20260813T195454Z-v1
status: approved-final
selected_alternative: ALT-01
baseline_revision: 2
model_generation_authorized: true
---

# Final responsibility-allocation decision

## Decision basis and revision disposition

DS-BASIS-01: The frozen seed permits several coherent scopes but establishes no exact boundary, finite policy, priority, recovery rule, or architecture. The campaign constraint additionally requires a Small design with one principal decision owner and nominal, boundary, invalid/fault, and recovery behavior.

DS-BASIS-02: Handbook-derived guidance requires an implementation-independent need, explicit boundary, cohesive responsibilities, alternative comparison, measurable criteria, traceability, and separate verification and validation. It does not select a mining-domain scope or favor an allocation.

DS-BASIS-03: The exact finite evidence types, response commitment, fresh-request rule, priority, twelve-case partition, and five scenarios are pilot choices recorded in System Abstract revision 2. Physical, executable, safety, mission, and proof claims remain deferred.

DS-REV-01: The Model's cardinality finding is accepted. MON-03 has four defense/drone value pairs when both statuses are valid; therefore CONS-03 and CONTRACT-LOCAL-02 now say exactly that `Available` plus `Ready` yields `Ready`, all three other valid value pairs yield `Unavailable`, and any invalid field status yields `Unknown`.

DS-REV-02: The revision is narrow and semantic-preserving: it resolves one textually omitted tuple without changing any PART, INT, CASE, SCN, boundary value, output, state, priority, recovery rule, claim boundary, or selected count.

## Primary scope selection

DS-SCOPE-01: The selected primary controlled purpose is threat evidence, reporting, defense activation, and retreat-oriented navigation, with mining, cargo, docking, offload, resupply, and whole-mission phase governance external.

DS-SCOPE-02: The closest baseline is the accepted replicate-1 Small combined mining-threat-retreat supervisor. That baseline arbitrates mining, defense, retreat, hold, and service from threat, cargo, capacitor, availability, and service progress and publishes mission phase plus commands; this selected system controls only threat-response outputs and publishes no mission phase.

DS-DIV-01: The boundary differs by replacing the baseline's cargo, capacitor, mining availability, service progress, mining command, service command, and mission-phase report with two-source threat evidence, drone readiness, route evidence, and acknowledgment-aware threat reporting.

DS-DIV-02: State ownership and recovery differ because one response coordinator owns only response commitment and fresh-request arming, and recovery is route-unavailable to route-available to retreat-complete. It has no operational phase, docking, offload, resupply, return-to-idle, or stale mining-demand topology.

DS-DIV-03: Interaction topology and priority differ because three assessor facts converge on the response coordinator and a downstream composer derives reporting priority, while policy orders invalid response evidence, established retreat response, fresh retreat trigger, confirmed ready defense, and observation.

## Candidate scope alternatives compared

SCOPE-ALT-01: Threat-response coordination controls threat reporting, defense activation, and retreat-oriented navigation from qualified evidence and readiness, while leaving mining, cargo, and station service external. It supports evidence conflict, command-fault separation, acknowledgment handling, blocked-route recovery, and fresh-response behavior within the Small tier.

SCOPE-ALT-02: Mining and cargo control would control target selection, extraction acceptance, depletion/capacity stopping, and seeking offload while leaving threat response and defense external. It is source-grounded and diverse, but emphasizes resource-flow boundaries rather than the seed's two-source threat interpretation and response-report acknowledgment opportunity.

SCOPE-ALT-03: Navigation and turnaround control would control destination acceptance, travel, docking, cargo transfer, and resupply verification while leaving mining and threat response external. It is source-grounded, but retains more of the closest baseline's service-recovery vocabulary than SCOPE-ALT-01.

DS-SCOPE-COMP-01: SCOPE-ALT-01 remains selected because it yields the clearest Small-sized closed partition with independently meaningful evidence, readiness, response, and reporting owners and is furthest from the closest baseline's mining/service lifecycle. This is an architectural selection criterion, not a claim that threat response is more important in the fictional domain.

## Responsibility-allocation alternatives

ALT-01: Use three separate stateless fact owners for threat interpretation, defense readiness, and retreat readiness; one principal stateful response coordinator; and one stateless report composer. This allocation has five responsibility-bearing semantic usages and thirteen end-to-end semantic interactions.

ALT-02: Use one combined evidence assessor for threat, defense, and route inputs; one principal stateful response coordinator; one defense-command owner; one navigation-command owner; and one report composer. This risks making the command owners padded pass-through usages or competing decision owners while coupling unrelated evidence validity.

ALT-03: Use a single response-and-report governor with four surrounding input/output adapters. This fails owner integrity because the adapters would only forward, bundle, or rename values and would reproduce a centralized-governor shape.

DS-CRIT-01: Scope fidelity requires no reconstruction of mining, cargo, capacitor, station service, mission phase, or five-way mission/action arbitration.

DS-CRIT-02: Ownership integrity requires exactly one principal owner of response disposition, defense versus retreat versus hold, response commitment, request arming, and the eight command-policy cases, while every other credited usage derives a distinct owner-local fact.

DS-CRIT-03: Boundary and trace reviewability require each of six root inputs and three root outputs to have an unambiguous typed path and each of thirteen semantic interactions to carry one distinct domain meaning.

DS-CRIT-04: Fault localization requires threat contradiction, defense unavailability, route blockage, decision-input invalidity, and report-acknowledgment invalidity to remain distinguishable without allowing a reporting fault to suppress valid commands.

DS-CRIT-05: Recovery completeness requires an established retreat commitment to survive route blockage, close only on completion, and prevent a consumed persistent pilot request from retriggering until rearmed.

DS-COMP-01: ALT-01 satisfies all five criteria: its three assessors derive reviewable many-field facts, the principal owner retains all response authority, and the composer derives reporting priority from response disposition and acknowledgment without gaining command authority.

DS-COMP-02: ALT-02 is rejected because it weakens local fault review without reducing the exact interaction inventory and risks violating principal-owner and no-padding constraints.

DS-COMP-03: ALT-03 is rejected because four adapters have no owner-local behavioral derivation and do not earn semantic-usage credit.

## Final selection and exact architecture metrics

DS-DEC-01: ALT-01 is finally selected and Model generation is authorized against System Abstract revision 2.

DS-DEC-02: The exact final architecture is one explicit root system usage; PART-01 through PART-05 as five responsibility-bearing semantic usages; INT-01 through INT-13 as thirteen end-to-end semantic interactions; CASE-01 through CASE-12 as twelve nontrivial contract cases; SCN-01 through SCN-05 as five scenario families; containment depth `1..2` beneath the root; and one weakly connected semantic region.

DS-DEC-03: The exact `5/13/12/5` point satisfies the Small bounds `5..8` semantic usages, `7..14` semantic interactions, `6..12` nontrivial cases, and `4..6` scenario families. Context actors, the root, routing helpers, wrappers, forwarding hops, and local formulas receive no metric credit.

DS-RATIONALE-01: ALT-01 best separates evidence interpretation, response selection, and report-priority composition while retaining one principal response owner and a topology distinct from the combined-governor baseline.

## Ownership and realization constraints

DS-OWNER-01: PART-04 alone shall own response commitment, request-arm state, fresh-retreat triggering, both command decisions, response disposition, and CASE-01 through CASE-08. A second command veto, competing response case, or duplicated state violates the selected design.

DS-OWNER-02: PART-01, PART-02, and PART-03 shall respectively derive qualified threat, defense condition, and retreat condition from their multiple independently status-bearing inputs. PART-05 shall derive report priority using both disposition and acknowledgment under CASE-09 through CASE-12; copied or preserved fields receive no owner credit.

DS-OWNER-03: For campaign ownership evidence, PART-01 through PART-03 may be recorded as `applicability` owners and PART-04 and PART-05 as `decision` owners only when each record names its exact assigned inputs, nonidentity local fact, local contract, and executed analyzer check. The labels alone establish nothing.

DS-REALIZE-01: The Model may use one behavior-free generated-support Process to contain the five semantic usages at depth 2 and route the nine boundary interactions. Those boundary routes may refine into two hops, permitting up to twenty-two concrete connection declarations, while INT-06 through INT-08 and INT-11 remain direct internal meanings and the semantic inventory remains exactly thirteen.

DS-REALIZE-02: Generated support is limited to behavior-free containment or routing elements, routing-only ports, connection hops, and typed wrappers with a specific trace or `@generated-support` rationale. It may not derive a fact, hold state, select a case, change a command, choose priority, create a fourteenth semantic interaction, or receive semantic credit.

## Local-contract expectations

DS-CONTRACT-01: PART-01 shall realize the total sixteen-combination CONS-02 relation; PART-02 shall realize the corrected total sixteen-combination CONS-03 relation; and PART-03 shall realize the total thirty-two-combination CONS-04 relation. Each relation shall be executed and checked at its owner rather than centrally recomputed.

DS-CONTRACT-02: PART-02 shall produce `Ready` exactly when both statuses are valid, defense is `Available`, and drones are `Ready`; it shall produce `Unavailable` for all three other valid value pairs and `Unknown` whenever either status is invalid.

DS-CONTRACT-03: PART-04 shall initialize two state items and express eight pairwise-disjoint, exhaustive command-policy cases with complete assignment of both commands, the response record, and both next-state values. Explicit guard exclusions are required; textual first-match order is not a policy mechanism.

DS-CONTRACT-04: PART-05 shall express four pairwise-disjoint, exhaustive acknowledgment/disposition cases, preserve the record's threat and disposition without receiving credit for preservation, and derive exactly one report priority.

## Bounded end-to-end analysis obligations

DS-ANALYSIS-01: The analyzer shall enumerate exactly `4 * 4 * 16 * 32 * 6 * 4 = 196,608` raw boundary combinations and all six principal pre-state combinations for exactly `1,179,648` snapshots, without pruning environmental combinations.

DS-ANALYSIS-02: Each snapshot shall execute the three owner-local assessor relations, carry their results through INT-06 through INT-08, select exactly one PART-04 command case, carry INT-11, select exactly one PART-05 report case, account for INT-01 through INT-13, and fully assign controlled and next-state values.

DS-ANALYSIS-03: Evidence shall retain counts and first witnesses for gaps, overlaps, unassigned values, local-relation mismatches, unresolved endpoints, ownership overrides, report mismatches, and metric/evidence disagreement, plus bounded multi-step traces for all five scenario families.

DS-ANALYSIS-04: The five scenario families shall collectively demonstrate nominal defense, classification boundaries and competing priorities, invalid decision inputs versus reporting faults, blocked-retreat recovery and completion, and consumed-request rearming with a second fresh request. This evidence establishes bounded conformance only.

## Deferred claims

DS-DEFER-01: No executable profile is selected; application code generation, implementation, runtime execution, scheduling, deployment, and real-time behavior remain `not-run`.

DS-DEFER-02: Physical sensing correctness, threat defeat, navigation safety, docking, cargo service, mission success, safety, survivability, profitability, solver certification, compositional proof, unbounded proof, certification, and production readiness remain `deferred` or `out-of-scope`.
