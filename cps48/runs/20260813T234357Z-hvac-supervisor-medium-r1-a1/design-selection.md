# Approved Design Selection — Energy- and Interface-Aware Cabin Climate Supervisor

## Decision frame and evidence boundary

DS-FRAME-01: This decision selects one coherent medium-sized system from the frozen HVAC seed. The seed's candidate scopes are alternatives, not a mandated combined feature list, and the source requirement catalog is evidence for vocabulary rather than architecture or policy.

DS-FRAME-02: Handbook guidance supplies the decision practice: compare alternatives before allocation, keep the need implementation-independent, assign cohesive responsibilities, state assumptions, and retain rationale. It supplies no HVAC priority, finite interface, state, or recovery fact.

DS-FRAME-03: No frozen diversity card applies. The selection therefore has no baseline-difference obligation, but it still must demonstrate substantive responsibility allocation rather than renaming or extending an existing model.

## Selection criteria

DS-CRIT-01: **Purpose coherence.** The boundary must control one reviewable outcome family rather than collect optional seed capabilities.

DS-CRIT-02: **Source fit and claim restraint.** The scope should use several source-grounded observations without requiring invented physical thresholds, safety claims, sensing algorithms, or performance guarantees.

DS-CRIT-03: **Medium-tier substance.** The scope must naturally support 8..12 responsibility-bearing usages, 15..21 typed directed interactions, 12..20 nontrivial cases, 6..9 scenario families, multiple cooperating decision or qualification owners, and an explicit priority conflict without padding.

DS-CRIT-04: **Finite behavioral closure.** The boundary, state, priority, fault, recovery, and controlled outputs must admit complete finite partitions and deterministic bounded analysis.

DS-CRIT-05: **Change cohesion.** Each owner must derive a distinct domain fact that could change independently; pass-through, one-to-one renaming, routing, and reporting-only duplication cannot earn owner credit.

DS-CRIT-06: **Reviewability and realizability.** The responsibility graph, state ownership, and end-to-end traces must remain understandable in one overview and realizable without assuming an unverified tool feature.

## Comparison of all seed candidate scopes

DS-SCOPE-01: **Cabin-temperature supervisor.** This is coherent and source-aligned, but temperature request versus observation alone offers a weak natural priority conflict. Reaching medium size would likely require invented hysteresis, multiple zones, or sensing structure that the seed deliberately leaves open. It is not selected.

DS-SCOPE-02: **Defrost supervisor.** This gives a clear activation path but lacks a source-grounded progress or validity protocol. A medium allocation would require invented glazing sensing, timing, or completion policy beyond the desired claim boundary. It is not selected.

DS-SCOPE-03: **Cabin air-quality supervisor.** Filtration and humidity could cooperate, but the seed supplies no pollutant observation and no validated humidity or filtration policy. Closing a meaningful finite contract partition would depend on more unsupported environmental assumptions than the selected scope. It is not selected.

DS-SCOPE-04: **User-facing HVAC command coordinator.** This gives a crisp interface boundary and user-preference arbitration, but without energy or observed context it risks becoming a forwarding and formatting architecture. It scores poorly on genuine qualification ownership. It is not selected.

DS-SCOPE-05: **Energy- and interface-aware HVAC supervisor.** This scope naturally combines user comfort, defrost, electrical state, qualitative power envelope, and possible engine heat while controlling only plant requests and status. It supports independent comfort, visibility, energy, recovery, priority, allocation, command, and reporting responsibilities; explicit defrost-versus-comfort priority; and stale-request recovery without physical-performance claims. It is selected.

DS-SCOPE-06: **Whole-cabin HVAC supervisor.** Temperature, defrost, filtration, humidity, user access, and energy would provide breadth but dilute the primary controlled purpose and strain the medium interaction limit. It would also import unsupported air-quality and physical-outcome policies. It is not selected.

DS-SCOPE-DEC-01: DS-SCOPE-05 best satisfies all six criteria. Its primary controlled purpose is coherent supervisory selection under interface and energy limitations, not implementation of cabin thermodynamics, defrost performance, or whole-cabin environmental control.

## Responsibility-allocation alternatives within the selected scope

DS-ALLOC-01: **Distributed qualification and two-stage decision allocation.** Independent owners derive comfort demand, visibility demand, and energy capability; a sole state owner controls recovery authority; a priority arbiter chooses service; a resource allocator grants or downgrades it; a command coordinator produces the plant tuple; and a status composer produces the public result. This allocation has eight genuine semantic usages and 21 typed interactions.

DS-ALLOC-02: **Central supervisor with interface adapters.** One stateful supervisor would receive all raw inputs and determine service, allocation, commands, and status, surrounded by input adapters and output publishers. Although compact computationally, most surrounding usages would only validate, forward, rename, or bundle fields, while the central owner could silently recompute all facts. It fails change cohesion and owner-count integrity and is rejected.

DS-ALLOC-03: **Capability-first monolithic arbiter with separate thermal and blower executors.** Three qualifiers would feed one stateful arbiter owning recovery, priority, and resource allocation, followed by separate thermal-command, air-path, blower, and reporting owners. The executor split mostly decomposes one coordinated tuple into projections and places unrelated policy changes in the monolithic arbiter. It is feasible but weaker on ownership independence and command coherence and is rejected.

DS-ALLOC-CMP-01: DS-ALLOC-01 uniquely keeps raw observations at named qualifiers, separates persistent recovery authority from functional priority, and separates functional priority from resource permission. Its downstream command coordinator derives a consistency-bearing tuple rather than forwarding an enum, and its status composer combines four owner facts rather than copying one result.

DS-ALLOC-DEC-01: DS-ALLOC-01 is approved. The allocation is implementation-independent: the Model Agent may choose legal model structure only if all eight responsibilities, owner-local contracts, exact interaction meanings, sole state ownership, and no-bypass topology remain evident.

## Selected boundary and policy rationale

DS-BOUND-01: The selected inputs are climate request, qualitative thermal relation, defrost request, glazing condition, one composite energy-context observation, one fresh-request event, and fan preference. The outputs are one atomic plant-command tuple and one supervisory status. These nine quantities close the boundary without inventing plant feedback, timing, acknowledgments, or physical outcome claims.

DS-BOUND-02: Temperature is represented as relation to an externally maintained request rather than a numeric setpoint. This retains the seed's requested-versus-actual concept while avoiding unsupported units, ranges, calibration, and control algorithms.

DS-BOUND-03: Electrical state, qualitative power envelope, and engine-heat availability are grouped in one stable EnergyContext interaction because they share one responsible external context and are jointly qualified. They remain three finite fields for behavior but do not create three count-only flows.

DS-POLICY-01: The explicit functional conflict is `Required defrost > Heat or Cool comfort`. Recovery block and invalid qualified demand precede that conflict, because command authority and coherent inputs are prerequisites rather than competing climate purposes.

DS-POLICY-02: Resource allocation follows priority selection. Full capability permits the selected thermal service; reduced capability can downgrade defrost, conditionally permit heating with available engine heat, and deny cooling; invalid or unavailable capability forces quiescence through recovery authority.

DS-RECOVERY-01: The supervisor initializes inhibited and returns to inhibited on invalid or unavailable capability. Restoration alone cannot reactivate a stale selection: usable capability must coincide with a later fresh user event, and a fresh event consumed during the outage does not carry forward.

DS-CLAIM-01: The selected rules concern only requested supervisory outcomes. They do not claim that priority is automotive-safety-correct, that defrost clears glazing, that heat or cooling changes cabin temperature, or that any allocation is physically efficient.

## Exact selected counts and anti-padding audit

DS-COUNT-01: The approved campaign tuple is exactly `8 semantic usages / 21 semantic interactions / 20 nontrivial contract cases / 8 scenario families`, satisfying the medium bounds `8..12 / 15..21 / 12..20 / 6..9`.

DS-COUNT-02: The eight semantic usages are the three qualification owners, one recovery state/decision owner, one priority decision owner, one resource decision owner, one coordinated-command owner, and one status-composition owner. Each derives a reviewable local fact; none receives credit for containment, routing, identity conversion, or publication alone.

DS-COUNT-03: The 21 interactions are exactly seven boundary-input deliveries, twelve inter-owner fact exchanges, and two boundary-output deliveries. The selection and grant fan-outs are credited separately only because priority, command, and public-status owners use them for distinct local derivations.

DS-COUNT-04: The twenty counted cases comprise five recovery cases, seven priority cases, four resource-allocation cases, and four command-coordination cases. Qualification truth relations, status composition, initialization, type invariants, and scenario witnesses are mandatory but are not double-counted.

DS-COUNT-05: The eight scenario families separately exercise initial activation, nominal thermal cycling, defrost priority and release, reduced allocation, energy-loss/stale suppression, fresh recovery, invalidity propagation, and user-off/fan boundaries. Variants within a family do not increase the count.

DS-STRUCT-01: The retained model shall have exactly one root, eight reachable semantic usages at depth `1..2`, and one weakly connected semantic region. A tool-required behavior-free support container or routing refinement remains generated support and cannot change semantic counts.

## Ownership, partition, and trace audit

DS-OWNER-01: ComfortDemand, VisibilityDemand, and EnergyCapability are independently derived by PART-01, PART-02, and PART-03. PART-04 alone persists state and derives recovery authority; PART-05 alone resolves functional priority; PART-06 alone grants resources; PART-07 alone coordinates CTRL-01; PART-08 alone composes CTRL-02.

DS-OWNER-02: No raw climate or glazing values reach the priority arbiter, no raw energy fields reach recovery or allocation, no raw boundary value reaches status composition, and no owner may recompute an upstream result. This topology makes owner-local contract evidence observable and blocks central recomputation disguised by wrappers.

DS-PARTITION-01: Recovery, priority, allocation, and command cases are each ordered, mutually exclusive, and exhaustive. Qualifier and status equations are independently total. Fresh request is covered at initialization, during outage, after usable restoration without freshness, on fresh recovery, and while already armed.

DS-ANALYSIS-01: The finite one-step domain including previous recovery state contains exactly 36,864 snapshots. A deterministic independent analyzer can exhaust it and retain witnesses for every counted case, boundary, invalid source, priority conflict, downgrade, quiescent response, and state transition.

DS-ANALYSIS-02: Multi-step traces remain necessary for initialization, stale-request suppression, event consumption during outage, later fresh recovery, defrost release, and repeated nominal operation. Snapshot enumeration alone shall not be presented as recovery validation.

DS-TRACE-01: The System Abstract's stable IDs, not this rationale, define required model trace parents. Every significant generated element must trace to those parents or carry a specific generated-support explanation; model convenience cannot silently revise the selected intent.

## Objective selection disposition

DS-PASS-01: The approved final baseline passes Designer selection because its chosen purpose is within the seed envelope, its boundary and finite policy are explicit pilot assumptions, every medium-tier count is within bounds and unpadded, multiple cooperating owners are real, priority and recovery are closed, and all deferred claims remain separated.

DS-MODEL-01: **Accepted without revision — ownership audit.** The Model's extensional audit confirms that PART-01 through PART-08 each derive a nonidentity owner-local fact. This supports the existing eight-usage credit and does not change any owner, boundary item, interaction, case, scenario, priority, recovery rule, metric, or claim.

DS-MODEL-02: **Accepted as a localized source mapping.** Generation may use one explicit root System, one behavior-free support Process, and eight sibling contract-bearing Threads at semantic depth 2. The nine boundary deliveries may require eighteen root-to-Process and Process-to-Thread delegation connections, while the twelve inter-owner deliveries require twelve direct Thread connections: exactly 30 raw PortConnection declarations realize, but do not replace or enlarge, the exact 21 semantic interactions.

DS-MODEL-03: **Accepted as a localized type closure.** EnergyContext, ServiceSelection, and PlantCommand may be Data records whose GUMBO-visible members are attributes. EnergyContext remains the single composite INT-05. ServiceSelection's reason member shall have exactly the nine equivalence classes already fixed by CASE-06 through CASE-12: BlockEnergyInvalid, BlockEnergyUnavailable, BlockAwaitFresh, InvalidDemand, SelectedDefrost, SelectedHeat, SelectedCool, TemperatureHold, and UserOff; source-local spelling may vary only with explicit trace equivalence.

DS-MODEL-04: **Accepted with evidentiary narrowing — tool and analyzer feasibility.** Trusted and retained models support the required containment, record, state, case, pre-state, and point-to-point fan-out forms. This is syntax and realizability evidence only; it is not HVAC-domain validation and is not a passing verification result for this immutable run. The generated source, analyzer, metrics, traces, and independent harness must still produce same-revision evidence.

DS-MODEL-05: **Accepted as coherence checks without added credit.** Separate point-to-point publications of EnergyCapability, RecoveryDecision, ServiceSelection, and ResourceGrant shall be equal at all consumers. These publication-equality obligations add no owner fact, contract case, semantic usage, or semantic interaction, and downstream consumers shall not reconstruct the publishing owner's relation.

DS-FINAL-01: No repair request or visualization repair exists, no Model finding requires a semantic revision, and the initial architecture is approved as the explicit final baseline. The exact final tuple remains 8 semantic usages, 21 semantic interactions, 20 nontrivial contract cases, and 8 scenario families; Model generation is authorized for this retained run.

