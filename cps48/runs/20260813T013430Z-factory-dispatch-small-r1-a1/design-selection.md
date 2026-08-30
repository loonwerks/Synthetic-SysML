# Approved Design Selection — Small Finished-Product Dispatch Coordinator

## Decision scope and evidence boundary

DS-BASIS-01: This final record preserves the initial selection from the frozen factory-dispatch seed and resolves the Model review without changing the selected scope, responsibility allocation, policy, metrics, scenarios, or claim boundary.

DS-BOUND-01: The retained campaign requires `5..8` responsibility-bearing semantic usages, `7..14` typed directed semantic interactions, `6..12` nontrivial contract cases, `4..6` scenario families, exactly one principal decision owner, and nominal, boundary, invalid/fault, and recovery behavior without count-only wrappers or flows.

DS-FACT-01: Source support is limited to Customer, Manufacturer, Supplier, named factory capabilities, product availability, shipment, and shipping-confirmation vocabulary. Finite policy, queueing, priority, faults, recovery, readiness, timing, throughput, physical success, and executable semantics remain unsupported by the source.

## Scope alternatives

DS-SCOPE-01: The finished-product dispatch coordinator remains selected because it forms a narrow logical lifecycle around availability, release, acknowledgment applicability, status, and confirmation while keeping physical shipment success outside the boundary.

DS-SCOPE-02: Customer-order intake was rejected because pricing, acceptance, expiry, and commercial authority would be almost wholly invented.

DS-SCOPE-03: Procurement and material availability was rejected because material-order versus purchase-order vocabulary and opposite-direction source connections leave its boundary unusually ambiguous.

DS-SCOPE-04: Production scheduling and release was rejected because readiness, capacity, priority, and completion semantics would broaden the pilot beyond the selected concern.

DS-SCOPE-05: Fixed-line production supervision was rejected because the source's structural step sequence supplies no dynamic progress, routing, exception, or completion semantics.

DS-SCOPE-06: Storage-to-production handoff was rejected because disconnected inventory and absent quantity, consumer, and validity semantics provide a weaker observable loop.

DS-SCOPE-07: Manufacturer-level order-to-dispatch was rejected because it would exceed a disciplined small boundary or reduce distinct lifecycle responsibilities to shallow labels.

DS-SCOPE-08: Product identity, quantity, concurrency, production, inventory control, transport, delivery, timing, and physical performance remain excluded.

## Responsibility-allocation alternatives and selection

DS-ALT-01: Selected Alternative A uses three validity-aware qualifiers, one stateful Dispatch Decision Owner, one release-command derivation, and one status-and-confirmation derivation, totaling six meaningful usages and eleven semantic interactions.

DS-ALT-02: Alternative B used a combined validity assessor plus request-eligibility and outcome-applicability proposal owners; it was plausible but rejected because the principal owner would still need overlapping facts for invalidity and recovery, increasing dependencies and consistency obligations.

DS-ALT-03: Alternative C consolidated qualification and decision in one governor with release and notice derivations; it was rejected because it naturally produced only three semantic usages, and adding routers or forwarders would be padding.

DS-CRIT-01: Selection criteria remain semantic fidelity, sole-owner integrity, total finite behavioral closure, interface economy, bounded verification feasibility, and disciplined exclusion of physical-success claims.

DS-DEC-01: Alternative A is finally approved unchanged: PART-01 through PART-03 qualify the three input samples, PART-04 solely owns both state variables and all nine cases, PART-05 derives the release command, and PART-06 derives status and confirmation.

DS-RATIONALE-01: Each nonprincipal usage has a nonidentity local contract: every qualifier is a four-raw-pair to three-fact validity classification, PART-05 is a nine-to-two command policy, and PART-06 combines disposition and next phase into two controlled outputs.

DS-RATIONALE-02: Centralizing ordered case selection in PART-04 is coherent because phase, recovery, acceptance applicability, request freshness, and availability must be reconciled atomically by one principal owner.

## Independent Model-finding dispositions

DS-MODEL-01: Finding 1 is accepted. The extensional owner audit supports semantic credit for all six usages and reveals no copy, bijective rename, bundling, or routing wrapper.

DS-MODEL-02: Finding 2 is accepted with evidentiary narrowing. The cited library and checker result demonstrate feasibility of the trusted containment, structured-data, port, and local-state patterns; they do not verify the future generated source, which must independently pass PASS-05.

DS-MODEL-03: Finding 3 is accepted as a localized mapping. One uncounted behavior-free Process, twelve uncounted boundary-delegation routes, and five direct inter-Thread connections may realize eleven end-to-end semantic interactions with seventeen physical connection declarations at depth 2.

DS-MODEL-04: Finding 4 is accepted as a generation constraint. PART-04 shall use local state, explicit initialization, pre-state references, complete post-state and resolution constraints, and explicit earlier-priority exclusions because compute cases are conjunctive rather than first-match.

DS-MODEL-05: Finding 5 is accepted. The 384-snapshot domain is finite and all nine cases have feasibility witnesses; retained final evidence must still independently report gaps, overlaps, state/output mismatches, case witnesses, invariants, and all five scenario traces.

DS-MODEL-06: Finding 6 is accepted. The profile remains non-executable, and no executable-agent obligation or deferred timing, scheduling, code-generation, physical-readiness, movement, delivery, throughput, safety, certification, or formal-proof claim is activated.

## Exact approved handoff

DS-COUNT-01: Final metrics are exactly `6/11/9/5`, one root, depth `2`, one weak semantic region, and one principal decision owner, all within the frozen `small` campaign bounds.

DS-LOCAL-01: Generation shall place nonidentity contracts locally on all six semantic usages; PART-04 alone shall own state and cases, and every case shall constrain complete resolution and post-state while PART-05 and PART-06 constrain all controlled outputs.

DS-SUPPORT-01: The only preauthorized generated support is one behavior-free Process plus twelve boundary-delegation routes, each specifically marked `@generated-support`; these contribute no semantic count or owner credit and may not change any INT endpoint or meaning.

DS-ANALYSIS-01: Bounded end-to-end analysis shall enumerate all 384 raw snapshots, independently evaluate qualification and priority, compare owner-local next state and all outputs, require zero gaps, effective overlaps, and mismatches, witness every case, and execute SCN-01 through SCN-05. It is not formal, compositional, or unbounded proof.

DS-DEFER-01: Procurement, production, storage control, identifiers, quantities, concurrency, capacity, timing, throughput, routing, physical achievement, delivery, feedback, safety, certification, deployment, code generation, execution, and formal or compositional proof remain deferred and may not be reported as passed.

DS-AUTH-01: Model source generation is authorized against `system-abstract.md`. The authorization does not waive architecture-stage or final typechecking, trace coverage, bounded analysis, visualization, ownership audit, or later Designer validation.
