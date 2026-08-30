# Final design selection after Model review

SEL-BASIS-01: This record supersedes the initial selection record for the retained run. It preserves the selected Manufacturer-level behavior while resolving the Model's owner-credit, prior/current state-port, and record-mapping findings.

## Selection criteria

SEL-CRIT-01: Campaign conformance remains a hard gate: 13..16 semantic usages, 22..35 semantic interactions, 21..30 nontrivial contract cases, 9..12 scenario families, multiple state or decision owners, and explicit priority, fault propagation, recovery, and composition. Padding is disqualifying.

SEL-CRIT-02: Boundary coherence favors one finite supervisor without claims about physical manufacturing, shipping success, or seed-provided execution semantics.

SEL-CRIT-03: Responsibility cohesion requires every credited usage to derive a behaviorally meaningful owner-local fact. Copying, renaming, record splitting, unchanged routing, or freshness prose alone earns no semantic credit.

SEL-CRIT-04: Fault containment requires one recovery owner whose gate and emergency result propagate in the same evaluation through lifecycle, all eligibility owners, arbitration, status, and publication.

SEL-CRIT-05: State minimality permits only retained order and recovery state; proposal, action, mode, cause, and public composition remain current-evaluation derivations.

SEL-CRIT-06: Priority evidence requires reachable simultaneous dispatch/production and dispatch/procurement proposals.

SEL-CRIT-07: Interaction credit requires a typed semantic dependency. Root delegations and unchanged capability routes are inventoried separately.

SEL-CRIT-08: Tool-compatible representation may narrow data layout without weakening behavior, ownership, one-writer atomicity, or claim boundaries.

## Scope alternatives

SEL-SCOPE-01: A dispatch-only coordinator is coherent but too small for the hard tier without unrelated wrappers.

SEL-SCOPE-02: A fixed-line production-flow supervisor would need unsupported dynamic routing, readiness, and exception semantics beyond the seed's structural sequence.

SEL-SCOPE-03: A Manufacturer-level order-to-dispatch coordinator coherently uses quotation, material order, production release, product availability, and dispatch vocabulary while leaving physical work outside the boundary.

SEL-SCOPE-04: The Manufacturer-level scope remains selected; all added behavior is labeled as pilot abstraction, and exclusions prevent delivery-performance or physical-factory claims.

## Responsibility-allocation alternatives

SEL-ALT-01: Alternative A centralizes qualification, state, eligibility, arbitration, and publication in one fulfillment governor surrounded by boundary wrappers.

SEL-ALT-02: Alternative A is compact but obscures independent fault inhibition and eligibility ownership, and it cannot honestly meet the hard usage tier without padding.

SEL-ALT-03: Alternative B mirrors Sales, Procurement, Production Scheduling, Production, Storage, and Dispatch and gives each local phase state.

SEL-ALT-04: Alternative B inherits ambiguous confirmation ownership and port directions and would require an invented distributed consistency protocol.

SEL-ALT-05: Alternative C allocates meaningful request-presence, inventory-usability, and outcome-event classifications to three boundary owners; uses one behavior-free capability splitter; retains separate request/stock/outcome qualification, recovery and order state, four eligibility owners, strict arbitration, status derivation, and atomic publication.

SEL-ALT-06: Alternative C makes both required dispatch conflicts reachable, contains failures through one qualification/recovery path, retains only two necessary state variables, and uses one public writer.

SEL-DEC-01: Alternative C remains selected because, after removing support-only credit, it still satisfies every hard-tier bound with cohesive owners, reachable priority conflicts, visible fault propagation, two-event recovery, and atomic composition.

## Independent disposition of Model findings

SEL-REV-01: Accept the identity-owner finding for `PART-01`. Presence is a required many-to-one classification owned locally by `PART-01`; `PART-05` receives it and may derive validity and expedited service but may not recompute presence.

SEL-REV-02: Accept the identity-owner finding for `PART-02`. Invalid-versus-usable material and product classifications move to `PART-02`; `PART-06` consumes them and derives shortage, readiness, and availability without recomputing usability.

SEL-REV-03: Accept the identity-owner finding for `PART-04`. It owns `NO_EVENT`/`FAILURE`/`SUCCESS` classification and preserves the exact tag; `PART-07` consumes both for phase qualification and may not reclassify absence or failure.

SEL-REV-04: Accept the support-only finding for `PART-03`. It is one generated-support splitter with no semantic or owner credit, and `INT-04` through `INT-06` are unchanged generated-support routes. No aggregate-capability policy is invented.

SEL-REV-05: Accept the prior/current state finding. `PART-09.prior_order_state == In(orderState)` supplies only `INT-22`; `PART-09.order_state` supplies the current derived state only to `INT-23` through `INT-27`, removing the conflicting temporal meaning without changing either state owner or any behavior case.

SEL-REV-06: Accept the localized mapping. `StatusRecord` and `PublicResult` are separate flat finite `Data` records with attribute fields. `PART-16` copies the four received status attributes and combines them with action and locally derived disposition on one atomic output; a nested inspected status part is prohibited.

SEL-REV-07: Accept the Model's no-concern owner/checker audit after the stated moves. `PART-05` through `PART-16` retain genuine classification, combination, state-dependent, priority, or composition behavior, and the separate semantic/support/raw inventories are compatible with the harness; no further allocation change is justified.

## Exact final architecture and ownership

SEL-METRIC-01: The final architecture has exactly 15 reachable semantic usages: `PART-01`, `PART-02`, and `PART-04` through `PART-16`. `PART-03` is exactly one generated-support usage, and the explicit root receives no campaign credit.

SEL-METRIC-02: The final semantic graph has exactly 31 interactions: `INT-01` through `INT-03` and `INT-07` through `INT-34`. `INT-04` through `INT-06` are three generated-support routes, and six root delegations are separate support connections; raw source connections total exactly 40.

SEL-METRIC-03: The behavioral inventory remains exactly 30 nontrivial cases, `CASE-01` through `CASE-30`, and exactly 11 scenario families, `SCN-01` through `SCN-11`.

SEL-METRIC-04: The final campaign tuple is `15 semantic usages / 31 semantic interactions / 30 nontrivial contract cases / 11 scenario families`, within the hard bounds `13..16 / 22..35 / 21..30 / 9..12`.

SEL-OWNER-01: Canonical local contracts shall show acquisition classifications at `PART-01`, `PART-02`, and `PART-04`; request facts at `PART-05`; stock facts at `PART-06`; phase-aware outcome at `PART-07`; recovery transition/gate/emergency at `PART-08`; prior/current state boundary and order transition at `PART-09`; proposals at `PART-10` through `PART-13`; action priority at `PART-14`; status/cause at `PART-15`; and request disposition plus flat atomic tuple at `PART-16`.

SEL-OWNER-02: The analyzer shall execute these local relations through transmitted values. It may not restore central recomputation, grant credit to `PART-03`, or count support routes as semantic interactions.

SEL-PRIO-01: Required priority remains fault or recovery inhibition, dispatch, production, procurement, quotation, then hold; dispatch shall demonstrably preempt simultaneous production or procurement proposals.

SEL-FAULT-01: Required same-evaluation fault propagation remains failed or inconsistent outcome to qualified fault, latched recovery, closed gate, inhibited proposals, emergency hold, fault mode/cause, and one matching public value.

SEL-REC-01: Required recovery remains fresh `RESET` from `LATCHED` to blocked `RECOVERING`, then a later fresh `VERIFY_OK` to `HEALTHY`; a new fault dominates either event.

SEL-COMP-01: Required composition is one flat `PublicResult` carrying action, four received status attributes, and locally derived current-request disposition, with one writer and evaluation-consistent fields.

## Local contracts and bounded end-to-end evidence

SEL-CONTRACT-01: Acquisition contracts shall implement presence, two usability, and three-way event classification; qualification contracts shall consume those results without recomputation; state contracts shall distinguish `In(orderState)` from the updated `orderState`; and composer contracts shall constrain each flat public attribute.

SEL-CONTRACT-02: The 30 cases remain the only nontrivial campaign cases. Acquisition equations, state-port equations, status mapping, initialization, type constraints, routing, and tuple consistency are mandatory support relations and do not inflate the count.

SEL-ANA-01: One root snapshot has `4*3*3*8*6*3=5,184` combinations; crossing two prior order states and three prior recovery states yields exactly 31,104 exhaustive one-step evaluations.

SEL-ANA-02: End-to-end analysis shall cover all 30 cases and 11 scenario families, both simultaneous dispatch conflicts, all six prior order/recovery pairs for same-evaluation fault propagation, closed-gate noninterference, admitted progress and stutter, and the later-step `RESET`/`VERIFY_OK` recovery history.

SEL-ANA-03: The analyzer shall execute every owner-local relation, including moved classifications, and transmit values across the 31 semantic interactions. A centralized oracle, hidden recomputation, or analyzer reproduction of unchanged support routing is not ownership evidence.

## Support allowances, assumptions, and deferred claims

SEL-SUPPORT-01: Generated support is limited to finite enum and flat record definitions, named attribute access, safe initialization, one cohesive process grouping level, the one capability splitter, its three unchanged routes, six root delegations, tuple-consistency clauses, and static semantic/support inventories. These receive no campaign credit.

SEL-ASM-01: Finite bands, one retained order, logical evaluations, event freshness, command-acceptance availability, classifications, proposal rules, priority, and recovery remain Designer-owned pilot assumptions rather than seed facts.

SEL-ASM-02: Customer retry after `DEFERRED`, Storage responsibility for bands, outcome non-replay, and recovery-event discipline remain environmental assumptions assigned to named contexts.

SEL-DEFER-01: Physical station behavior, throughput, quantities, timing, cancellation, multiple retained orders, shipment truth, delivery performance, industrial safety, commercial correctness, deployment fitness, and certification remain excluded or deferred.

SEL-DEFER-02: Code generation, application execution, formal proof, real-time performance evidence, physical validation, and certification remain `not-run`; neither typechecking nor bounded finite analysis may imply them.

## Final authorization

SEL-PASS-01: The revised design passes Designer review because every semantic usage has meaningful local behavior, the state interface has one temporal meaning per port, the flat mapping preserves atomic publication, and the exact final metrics satisfy the hard tier without changing domain policy.

SEL-AUTH-01: Model regeneration is authorized only against `system-abstract.md` revision 2 and this final selection. It shall preserve the exact `15/31/30/11` tuple, 40 raw connections, local ownership, priority, fault propagation, recovery, flat composition, exclusions, and deferred claims.
