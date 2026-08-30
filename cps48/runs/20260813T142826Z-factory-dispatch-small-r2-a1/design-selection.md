# Approved Design Selection — Bounded Finished-Product Dispatch Coordinator

## Decision scope and constraints

DS-BASIS-01: This final record retains the frozen seed, initial alternatives, and Model review as evidence. The selected system remains a narrow logical finished-product dispatch coordinator.

DS-BOUND-01: The final design must remain inside the small campaign bounds: 5..8 semantic usages, 7..14 semantic interactions, 6..12 nontrivial contract cases, and 4..6 scenario families, with exactly one principal decision owner and nominal, boundary, invalid/fault, and recovery behavior.

DS-FACT-01: The seed supports Customer, Manufacturer, storage, dispatch, availability, shipment, and confirmation vocabulary but does not support a dispatch policy, finite queue, validity model, priority, fault response, recovery semantics, or physical/executable claims.

## Scope alternatives

DS-SCOPE-01: Customer-order intake remains unselected because meaningful acceptance and commercial response would require unsupported pricing and validity policy.

DS-SCOPE-02: Procurement/material availability remains unselected because the seed's Supplier boundary has direction and type ambiguity and no authoritative purchase-order semantics.

DS-SCOPE-03: Production scheduling/release remains unselected because capacity, readiness, sequencing, and completion semantics are absent.

DS-SCOPE-04: Fixed-line production supervision remains unselected because the source sequence does not establish dynamic routing, readiness, fault, or quality behavior.

DS-SCOPE-05: Storage-to-production handoff remains unselected because inventory is disconnected and no handoff consumer or acknowledgement is established.

DS-SCOPE-06: Finished-product dispatch coordination remains selected because the seed supplies coherent product-availability, dispatch, shipment, confirmation, Customer, and Storage vocabulary while downstream bounded readiness, availability, fault, and recovery abstractions are permitted when labeled.

DS-SCOPE-07: Manufacturer-wide order-to-dispatch remains unselected because it would combine unresolved commercial, procurement, production, storage, and dispatch policies beyond a credible small boundary.

## Responsibility-allocation alternatives

DS-ALT-01: Selected Alternative A uses Request Qualification, stateful Request Registry, Inventory Assessment, one Dispatch Arbiter, and Customer Notice Synthesis. Registry owns all persistent state and event cases; Arbiter exclusively owns release authorization and dispatch cases.

DS-ALT-02: Alternative B centralizes state, event classification, inventory interpretation, and release in one manager and would require copy/publish wrappers to appear as five usages; it remains rejected under the no-owner-padding rule.

DS-ALT-03: Alternative C uses product-specific deciders plus a coordinator; it remains rejected because identical product policies would duplicate proposal owners and make the principal decision locus ambiguous.

DS-ALT-04: Alternative D uses priority queues, reservations, scheduling, and preemption; it remains rejected because those unsupported inventions add unnecessary cross-products at small scale.

DS-DEC-01: Alternative A and finished-product dispatch scope are retained. The responsibility inventory is PART-01 through PART-05, and the resolved semantic interaction inventory is INT-01 through INT-13 in `system-abstract.md`.

## Independent disposition of Model findings

DS-MODEL-01: Finding 1 is accepted. The initial PART-01-to-PART-05 `ArrivalFact` edge is redundant because every invalid present arrival is already transformed by QUAL-01 and CASE-01 into `RegistryOutcome.InvalidEvent` before NOTICE-01. The edge is deleted, PART-05 now consumes only registry outcome and dispatch disposition, and no behavior changes.

DS-MODEL-02: Finding 2 is accepted. The final baseline distinguishes one semantic responsibility layer from physical containment depth two below the System root and authorizes one behavior-free generated-support Process containing the five semantic Threads.

DS-MODEL-03: Finding 3, no owner-padding concern, is accepted without narrowing. All five usages retain semantic credit because each has a distinct nonidentity owner-local derivation; Registry remains the only state owner and Arbiter the sole principal decision owner.

DS-MODEL-04: Finding 4 is accepted with a strict allowance: exactly thirteen semantic interactions may lower to exactly nineteen raw `PortConnection` declarations—twelve generated-support boundary delegations and seven internal semantic declarations. Support receives no semantic or owner credit and may not alter endpoint, direction, type, or meaning.

DS-MODEL-05: Finding 5, bounded-analysis realizability, is accepted with the stated evidence boundary. The analyzer must keep an independent abstract evaluator separate from owner-local evaluators and provides bounded consistency evidence only, not execution of GUMBO clauses or formal proof.

## Final ownership and behavior audit

DS-OWNER-01: PART-01 owns a 17-value many-to-one arrival qualification; PART-02 owns state-dependent event classification and transition under CASE-01..09; PART-03 owns product/amount stock-threshold classification; PART-04 owns prioritized multi-input authorization under CASE-10..12; PART-05 owns ordered multi-input notice composition.

DS-LOCAL-01: Every semantic usage must expose its owner-local relation in retained contracts. No component or analyzer may centrally recompute another owner's assigned policy, and the registry instruction must correspond to the same request as the release and committed submitted state.

DS-SCENARIO-01: The five retained scenario families are nominal release/completion, inventory threshold boundary, active-capacity and identifier boundary, invalid/fault suppression, and failed-result recovery/retry.

DS-ANALYSIS-01: End-to-end analysis must enumerate exactly 89 valid states times 11,016 boundary combinations, totaling 980,424 snapshots, compare independent and owner-local state/output tuples with zero diagnostics, witness all twelve cases, and execute all five scenario traces.

DS-SUPPORT-01: Generated support is limited to one behavior-free Process, twelve tagged boundary delegation declarations, root/support containers, finite type declarations, initialization/invariants, analyzer fixtures, and visualization-only elements. None counts semantically.

DS-DEFER-01: Commercial, procurement, production, physical shipment/delivery, timing, performance, safety, certification, deployment, code-generation, execution, and formal-proof claims remain deferred and must be reported `not-run` where applicable.

DS-COUNT-01: The exact approved campaign tuple is `5` semantic usages, `13` semantic interactions, `12` nontrivial contract cases, and `5` scenario families. Additional exact metrics are one System root, one semantic layer, physical depth two, one generated-support Process, one weak semantic region, one state owner, one principal decision owner, and nineteen raw connection declarations.

DS-PASS-01: The revised baseline is approved because it resolves both required Model corrections without changing the frozen policy, boundary, state, cases, priority, faults, recovery, or scenarios, and every final count remains within the declared small campaign bounds.

DS-AUTH-01: Model regeneration is authorized only against `system-abstract.md` and this final selection. Any further semantic interaction, support mechanism, policy change, or weakened obligation requires renewed Designer review in this same retained run.
