# Final Design Selection — Factory Material Continuity Coordinator

## Decision scope and evidence

DS-BASIS-01: [Seed-grounded fact] The seed presents a Manufacturer with sales, procurement, production scheduling, production, storage, and dispatch capabilities plus Customer and Supplier context, but explicitly leaves interface correctness, operational policy, scale, priority, faults, and recovery unresolved.

DS-METHOD-01: [Handbook-derived control] The selection compares plausible scopes and responsibility allocations before freezing architecture. Criteria are purpose coherence, source-vocabulary grounding, finite total behavior, owner-local responsibility, fault and recovery clarity, hard-tier realizability, and diversity from accepted dispatch systems.

DS-BOUND-01: [Campaign constraint] The retained choice must contain 13..16 semantic usages, 22..35 semantic interactions, 21..30 nontrivial cases, and 9..12 scenario families, with multiple state or decision owners plus explicit priority, fault propagation, recovery, and composition.

DS-DIVERSE-01: [Diversity constraint] Finished-product dispatch, order-to-dispatch orchestration, shipment registry, and renamed or elaborated versions of those systems are prohibited. Dispatch may be external context only and is excluded from this selected boundary.

## Comparison of seed-supported primary scopes

DS-SCOPE-01: [Unselected alternative] Commercial inquiry and quotation response is coherent seed vocabulary, but a hard design would need invented price, quote-validity, customer-identity, and commercial-approval policies. It is feasible only with a larger unsupported assumption burden than the selected scope.

DS-SCOPE-02: [Selected alternative] Procurement and material-availability coordination uses the seed's procurement, Supplier, Storage inventory, material order/provision, and production-scheduling vocabulary. The seed expressly permits downstream readiness, availability, priority, fault, and recovery abstractions when labeled, allowing a finite hard system without claiming physical production semantics.

DS-SCOPE-03: [Unselected alternative] Production scheduling and release is credible but would require capacity, work sequencing, product-order admission, and completion semantics not supplied by the seed. It also risks turning hard-tier size into arbitrary scheduler policy.

DS-SCOPE-04: [Unselected alternative] Fixed-line production-flow supervision has a source-grounded heating-to-polishing sequence, but the source explicitly does not establish dynamic routing, alternate paths, readiness, or exception handling. Adding those behaviors would exceed the source evidence boundary.

DS-SCOPE-05: [Unselected alternative] Storage-to-production handoff is narrower and coherent, but by itself does not naturally support the required hard-tier supplier-order lifecycle and priority composition without becoming the selected procurement/material-continuity scope.

DS-SCOPE-06: [Prohibited baseline] Finished-product dispatch coordination is excluded by the frozen diversity card and would repeat the accepted stateful shipment-request/retry baseline.

DS-SCOPE-07: [Prohibited baseline] Manufacturer-wide order-to-dispatch coordination is excluded by the frozen diversity card and would repeat the accepted replicate-1 organizing lifecycle even if internal parts were renamed or repartitioned.

DS-SELECT-01: [Decision] The selected primary controlled purpose is continuity of production material: admit one material demand, assess aggregate availability, coordinate one Supplier-order lifecycle, prioritize material release versus reserve-restoring replenishment, inhibit on fault, and recover through external reset and verification.

## Responsibility-allocation alternatives within the selected scope

DS-ALT-01: [Selected architecture] A distributed dual-lifecycle design separates boundary acquisition, demand and inventory qualification, event coherence, Demand/Supply/Recovery state ownership, three eligibility decisions, one strict arbiter, and one public composer. Each semantic usage derives an owner-local fact and the interaction graph exposes composition.

DS-ALT-02: [Rejected architecture] A centralized material manager could hold all state and decide release and ordering internally. It is compact, but wrappers needed to reach hard-tier size would be identity padding, owner-local fault propagation would be unobservable, and composition evidence would collapse into one opaque decision owner.

DS-ALT-03: [Rejected architecture] Parallel A-material and B-material lanes with a shared arbiter would support multiple demands, but it would duplicate identical policies, create synchronization and capacity claims unsupported by the seed, and inflate the bounded state space without distinct responsibilities.

DS-ALT-04: [Rejected architecture] A production-pull design could let each line step request material and let procurement react to downstream demand. That changes the primary purpose toward physical flow supervision and invents per-step material and readiness semantics that the source sequence does not supply.

DS-ALT-05: [Rejected architecture] A Supplier-centric purchase-order state machine could make procurement the only retained owner and treat demand and inventory parts as pass-through evidence. It fails the required distributed-ownership and composition objective and underrepresents material release responsibility.

DS-DEC-01: [Selection rationale] `DS-ALT-01` is retained because three genuine lifecycle owners separate demand occupancy, acknowledged Supplier-order progress, and recovery authority; independent proposals create reachable priority conflicts; and the arbiter and composer can be checked without allowing any one component or analyzer to reproduce the whole policy.

## Diversity determination

DS-CLOSE-01: [Closest named baseline] The closest frozen-card baseline is the accepted replicate-2 Small stateful request registry plus dispatch arbiter for releasing and retrying finished-product shipments.

DS-DIFF-01: [Boundary difference] The selected boundary monitors production-material demand, aggregate raw-material inventory, Supplier and production acceptance, material-order/receipt/handoff events, and recovery events; it controls material release or purchase-order requests. It has no shipment request, product-availability dispatch input, dispatch command, or shipping confirmation.

DS-DIFF-02: [State-ownership difference] State is independently owned by a material-demand registry, a Supplier-order lifecycle, and a recovery supervisor. The closest baseline centers one shipment-request registry with retry state; no selected state represents shipment, dispatch submission, or completion cache.

DS-DIFF-03: [Interaction-topology difference] The selected graph qualifies a shared lifecycle event against two prior state owners, fans a recovery gate to two lifecycle owners and three proposal owners, then composes three current states after arbitration. The baseline routes request/inventory/readiness into a dispatch registry/arbiter path.

DS-DIFF-04: [Priority-policy difference] The selected ordinary priority is urgent material release over reserve-restoring replenishment over routine material release. This resolves competing production-continuity and reserve policies rather than prioritizing dispatch release or retry.

DS-DIFF-05: [Recovery-policy difference] Reported or phase-inconsistent material events latch a separate recovery owner; `RESET` moves to recovering and only a later `VERIFY_OK` reopens all state and proposal gates. Failed shipment retry and Customer resubmission are absent.

DS-NOT-RENAME-01: [Diversity conclusion] This is not an extension, repartition, or renaming of the dispatch baselines because its controlled object is raw-material continuity, its external counterpart is primarily Supplier/Storage/Production Scheduler rather than Customer/Dispatch, its three state machines encode demand/order/recovery rather than shipment registry state, and its principal conflicts govern material reserve versus production release. Dispatch is wholly excluded, not moved behind a different component name.

## Frozen approved target and resolved review questions

DS-COUNT-01: [Selected target] The exact campaign tuple is 14 semantic usages, 35 semantic interactions, 29 nontrivial contract cases, and ten scenario families. The physical target adds one System root, one behavior-free Process, seven root-to-Process boundary delegations, depth two, one weak region, and 42 raw connections.

DS-OWNER-01: [Ownership decision] Demand, Supplier-order, and recovery state remain separately owned by `PART-07`, `PART-08`, and `PART-09`; event coherence, three eligibility relations, strict arbitration, and public composition remain separately owned decisions. No support element or identity behavior earns credit.

DS-POLICY-01: [Policy decision] Fault is dominant; otherwise urgent release outranks replenishment, replenishment outranks routine release, and hold is last. The `LOW` band makes both priority conflicts reachable without inventing numeric inventory.

DS-REC-01: [Recovery decision] Any explicit failure or phase-inconsistent success latches recovery in the same evaluation and freezes both ordinary state owners. Release requires distinct fresh reset and verification evaluations.

DS-EVID-01: [Evidence decision] Acceptance requires exact structure, typechecking, trace coverage, owner-local contract inspection, exhaustive 97,200-snapshot comparison, all case and scenario witnesses, and separate Designer validation. Execution and formal proof remain deferred.

DS-QUESTION-01: [Resolved Model review question] Accepted. Distinct prior-state outputs constrained from `In(state)` and post-transition current-state outputs are supported for both `PART-07` and `PART-08`; keeping those ports and consumers distinct preserves the state-broken dependency required by `REL-STATE-01`.

DS-QUESTION-02: [Resolved Model review question] Accepted as a localized mapping. The seven logical boundary interactions may lower through exactly seven uncredited transparent root-to-Process delegations, preserving exactly 35 semantic interactions and 42 raw connections without changing any endpoint, direction, type, or meaning.

DS-QUESTION-03: [Resolved Model review question] Accepted with the frozen independence condition. The bounded analyzer shall execute separate candidate evaluators for all 14 owners using only transmitted `INT-*` values and compare them with a separately written abstract reference relation; candidate and reference paths shall not call or supply expected values to one another.

DS-AUTH-01: [Final authorization] The Model findings are accepted without an architectural or policy revision. Generation is authorized against `system-abstract.md` and this final decision record, preserving the exact `14/35/29/10` tuple, all owner-local relations, the 97,200-evaluation analysis, seven generated-support delegations, and every deferred claim.
