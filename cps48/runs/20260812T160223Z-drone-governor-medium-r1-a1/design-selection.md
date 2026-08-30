# Approved Design Selection — Drone Lifecycle Governor

DS-CONTEXT-01: This decision record compares every candidate system scope in the frozen seed, alternative responsibility allocations for the chosen scope, and the Model review's realizability findings. The approved change is local containment support; it does not revise domain behavior or policy.

## Selection criteria

DS-CRIT-01: Source fit — use only seed-grounded logical vocabulary while labeling every added actor and policy assumption.

DS-CRIT-02: Boundary coherence — expose one understandable supervisory purpose with finite observations and controlled outcomes.

DS-CRIT-03: Medium-tier substance — retain 8–12 semantic usages, 15–21 semantic interactions, 12–20 nontrivial cases, 6–9 scenario families, multiple cooperating decision or qualification owners, state, and explicit priority conflict.

DS-CRIT-04: Behavioral auditability — require complete finite partitions for nominal, invalid, rejected, conflict, recovery, and fresh re-entry behavior.

DS-CRIT-05: Claim discipline — exclude engine-count premises, forest-fire mission invention, physical flight behavior, timing, safety, and certification claims.

DS-CRIT-06: Responsibility integrity — reject identity, renaming, routing, and bundling wrappers as semantic usages or owners.

DS-CRIT-07: Tool-compatible realization — allow only behavior-free generated support that preserves the frozen semantic allocation and is reported separately from semantic metrics.

## Candidate scope comparison

DS-SCOPE-01: Alternative A, a drone lifecycle governor, uses all five source-named lifecycle values and source-named event vocabulary while disclosing exact guards, actors, outputs, and recovery as pilot abstractions. It offers a coherent stateful boundary and naturally exposes arbitration and recovery conflicts. It is selected.

DS-SCOPE-02: Alternative B, a battery-awareness supervisor, fits qualitative capacity, status checking, and low-battery notification, but a medium realization would need added charging/readiness consequences and would make the full lifecycle secondary. It remains credible for another run but is rejected here as too narrow.

DS-SCOPE-03: Alternative C, a flight-readiness coordinator, naturally combines battery, navigation, radio, and flight-control observations around `READY`/`FLYING`, but charging and the full off/standby lifecycle become peripheral. It is rejected because source-named charging events and recovery re-entry fit less coherently.

DS-SCOPE-04: Alternative D, the complete logical forest-fire observation drone, could include battery, engines, body, controller, camera, obstacle sensing, landing gear, and radio, but the seed defines no operational observation mission and has an inconsistent engine configuration. It is rejected because medium scope would omit much of the product or invent behavior.

DS-SCOPE-05: The lifecycle-governor scope best satisfies the criteria because lifecycle is the organizing state, battery/navigation/radio/charger observations have explicit qualification consequences, four controlled outcomes are observable, and the boundary remains purely logical.

## Responsibility-allocation alternatives

DS-ALLOC-01: Allocation 1, selected distributed qualification and arbitration, assigns battery qualification, combined flight readiness, operational eligibility/recovery, request arbitration, lifecycle state, command policy, flight authorization, and status assessment to eight cohesive owners. It makes cooperation and priority visible and retains exactly one state owner.

DS-ALLOC-02: Allocation 2, centralized governor, would send all inputs to one lifecycle component and leave other usages delivering outputs. It would concentrate meaningful policy in one owner and make the remaining usages likely pass-throughs, contrary to medium-tier owner substance.

DS-ALLOC-03: Allocation 3, mode-specific state owners, would split charging and flight state authority. It would complicate atomic priority and risk contradictory next states during shutdown/recovery conflicts.

DS-ALLOC-04: Allocation 4, distributed sensor adapters plus centralized decision, would place an adapter on each input. Validation or renaming of an already finite enum would pad usage and interaction counts without creating distinct behavioral responsibility.

## Model-review disposition

DS-REVIEW-01: The finding that behavioral Threads cannot be placed directly under the retained System form is accepted. Exactly one behavior-free `GovernorProcess` is approved as generated support at depth 1, with the eight semantic PART Threads at depth 2.

DS-REVIEW-02: The raw architecture metrics are revised to exactly nine non-root nodes and depth two. The support Process receives no PART identifier, semantic-usage credit, owner role, state, compute contract, or domain responsibility.

DS-REVIEW-03: The routing finding is accepted narrowly. The 21 approved semantic interactions remain unchanged; exactly ten System-to-Process boundary delegations are allowed as generated support, yielding exactly 31 source `PortConnection` declarations. The delegations receive no semantic-interaction or owner credit.

DS-REVIEW-04: The no-concern findings for PART-02 and PART-03 are accepted because their finite many-to-one qualification relations are substantive, not enum renames.

DS-REVIEW-05: The no-concern finding for PART-01, PART-04, and PART-05 is accepted. Their credited facts remain priority/classification, combined applicability/recovery, and sole state-dependent transition selection respectively.

DS-REVIEW-06: The no-concern finding for PART-06 and PART-07 is accepted because both derive substantive classifications. Their output relations shall still be established by owner-local cases rather than assumed from wiring.

DS-REVIEW-07: The PART-08 localized mapping finding is accepted and narrowed to the ownership consequence: only precedence-derived `PilotNotice` earns owner credit; copied next state and the one-to-one transition-result/disposition mapping remain required outputs but do not independently establish ownership.

DS-REVIEW-08: The structured-record and pre-state realizability finding is accepted as a generation allowance, not a domain revision. Flat typed Data records may carry structured semantic payloads on one DataPort, and `currentLifecycleState` shall denote `In(lifecycleState)`.

## Final selected architecture and behavior

DS-RESULT-01: Final architecture metrics are exactly nine non-root architecture nodes, depth two beneath one root, one generated-support Process, eight semantic usages, one semantic weakly connected region, 21 semantic directed interactions, ten generated-support delegation routes, and 31 source `PortConnection` declarations.

DS-RESULT-02: Final behavioral metrics are exactly 20 nontrivial owner-local contract cases and seven scenario families. The semantic campaign tuple is therefore `8/21/20/7`, within the declared medium bounds.

DS-RESULT-03: At least four cooperating qualification or decision owners are explicit: `BatteryQualificationOwner`, `FlightReadinessOwner`, `OperationalEligibilityOwner`, and `RequestArbiter`; `LifecycleStateGovernor` is the sole lifecycle-state and final transition owner.

DS-RESULT-04: The explicit priority conflict remains `SWITCH_OFF` over recovery over other fresh requests, with battery reason before flight-readiness reason under simultaneous recovery conditions. This chooses one transition without asserting safety severity.

DS-RESULT-05: Recovery remains to `STANDBY` from `READY`, `FLYING`, or `CHARGING`, clears at `STANDBY`, and requires a later fresh request for progression. This is logical supervision, not landing or physical hazard mitigation.

DS-RESULT-06: Local contracts shall place cases 01–20 on their named Thread owners, express precedence with disjoint guards, assign every structured output field, preserve the sole state variable on `LifecycleStateGovernor`, and prevent downstream recomputation from earning owner credit.

DS-RESULT-07: Bounded analysis shall enumerate all 3,240 raw input/pre-state combinations end to end, enumerate every owner-local legal input product with counts reported, and exercise all seven bounded scenario families including recovery clearing and fresh re-entry.

## Assumptions, support, and deferred claims

DS-ASM-01: A ground operator is assumed to initiate the finite lifecycle request even though the seed does not establish command authority.

DS-ASM-02: Qualitative capacity, validity, navigation, radio, and charger observations have no timing, accuracy, or independence promise.

DS-ASM-03: One logical evaluation observes previous committed state and commits at most one next state; no physical period, latency, or scheduler is claimed.

DS-SUPPORT-01: Generated support is limited to the one behavior-free Process, its boundary ports, and ten delegation routes needed for legal System-to-Process-to-Thread containment and routing. Each addition shall carry explicit `@generated-support` rationale.

DS-DEFER-01: Engine counts and configuration consistency are excluded because the source product example is internally inconsistent.

DS-DEFER-02: Fire detection, mapping, dispatch, suppression, autonomous navigation, return-to-home, landing, endurance, charging physics, flight dynamics, environmental performance, physical actuation, safety, and certification remain outside the selected boundary.

DS-DEFER-03: Code generation, application implementation, execution, formal proof, unbounded temporal proof, and physical validation remain `not-run` or deferred and are not acceptance evidence.

## Final disposition

DS-DISP-01: Approved for Model generation in this retained run. The accepted containment revision preserves the frozen purpose, exact finite domains, 8/21/20/7 semantic allocation, ownership, priority, recovery policy, case relations, scenario families, and deferred-claim boundary.
