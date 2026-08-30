# Approved Design Selection — Finished-Product Dispatch Coordinator

## Decision frame

SEL-FRAME-01: This retained-run decision selects one coherent medium-tier boundary and responsibility allocation. Source facts, pilot assumptions, architecture policy, generated support, verification evidence, and deferred claims remain distinct; no tool accommodation changes the frozen domain policy.

SEL-CRIT-01: Selection criteria are boundary coherence, recognizable seed vocabulary, distinct owner-local derivations, explicit off-nominal and recovery behavior, tractable finite partitions, legal retained containment, one connected architecture, and low dependence on unsupported physical or timing semantics.

SEL-CRIT-02: The approved design must contain 8..12 semantic usages, 15..21 semantic interactions, 12..20 nontrivial contract cases, 6..9 scenario families, at least two cooperating decision or qualification owners, and at least one explicit priority conflict without padding.

## Scope alternatives

ALT-SCOPE-01: Customer-order intake and commercial response remains rejected. The seed supplies too little commercial response policy to form the required recovery and priority behavior without making most of the model a new business-policy invention.

ALT-SCOPE-02: Procurement and material availability remains rejected. The seed reports material-order/purchase-order direction and type ambiguities, so a medium design would spend much of its abstraction budget resolving uncertain procurement semantics.

ALT-SCOPE-03: Production scheduling and release remains rejected. The seed gives no readiness, capacity, due-date, or scheduling policy, so a useful finite partition would rely heavily on invented scheduling assumptions.

ALT-SCOPE-04: Fixed-line production-flow supervision remains rejected. The named heating-through-polishing sequence is source-grounded structure, but dynamic progression, process observability, quality thresholds, exceptions, and routing are not.

ALT-SCOPE-05: Storage-to-production material handoff remains rejected. It is coherent but narrower than the run's dispatch family and has less direct support for shipment confirmation and execution recovery.

ALT-SCOPE-06: Finished-product dispatch coordination remains selected. Product availability, storage, dispatch, shipment, and shipping-confirmation vocabulary occur in the source, while finite qualification, commitment, correlation, priority, and one-retry semantics can be isolated as explicit pilot assumptions.

ALT-SCOPE-07: Manufacturer-level order-to-dispatch coordination remains rejected. It combines sales, procurement, production, storage, and dispatch into an overly broad controller with many invented cross-lifecycle rules.

SEL-SCOPE-01: The chosen boundary begins with one candidate finished-product dispatch request and current inventory, dock, and outcome observations, and ends with shipment instruction, coordinator status, and terminal confirmation. Production, procurement, physical storage, Sales, Customer, Supplier, and execution remain external.

## Architecture alternatives and selection

ALT-ARCH-01: A centralized dispatch controller remains rejected because it concentrates qualification, priority, lifecycle, release, recovery, confirmation, and status policy in one owner and cannot demonstrate the required cooperating owner-local derivations.

ALT-ARCH-02: A pure lifecycle pipeline remains rejected because it would force unrelated observations through pass-through stages and obscure the simultaneous recovery-versus-fresh conflict.

ALT-ARCH-03: The federated qualification and decision architecture remains selected: request, inventory, and dock qualifiers cooperate with an execution-outcome/recovery classifier, priority resolver, release arbiter, commitment tracker, confirmation determiner, and status determiner.

SEL-ARCH-01: The selected semantic architecture contains exactly nine usages: Request Qualifier, Inventory Qualifier, Dock Qualifier, Execution Outcome and Recovery Classifier, Dispatch Priority Resolver, Release Arbiter, Commitment Tracker, Confirmation Determiner, and Dispatch Status Determiner.

SEL-ARCH-02: The selected semantic interaction budget is exactly 21 directed typed connections: four boundary-observation deliveries, fourteen inter-usage exchanges, and three boundary-output deliveries. Each carries a distinct responsibility-bearing fact or boundary value.

SEL-ARCH-03: Legal retained containment adds exactly one behavior-free `DispatchCoordinatorProcess` beneath the root System and places the nine semantic owners as Threads inside it. Raw node count is 10, containment depth is 2, root System usage count is 1, and weakly connected semantic region count is 1.

SEL-ARCH-04: The support Process mirrors four inputs and three outputs through exactly seven uncredited generated-support delegations. Thus the source target is exactly 28 `PortConnection` declarations: 21 semantic interactions plus seven support routes. The Process and routes receive no PART identifier, domain responsibility, state, contract, ownership, case, scenario, or semantic count credit.

SEL-ARCH-05: The final 21-interaction allocation redirects INT-14 from PART-07 to PART-02 with pre-state recovery qualification context and broadens INT-08 from PART-02 to PART-06 with separate fresh/recovery readiness plus uncredited stored context. INT-04, INT-10, INT-11, INT-12, and INT-17 retain the accepted Model-review corrections; all other INT endpoints remain unchanged.

## Model-finding dispositions

SEL-REV-01: The containment finding is accepted. The initial direct depth-1 placement is replaced by `System -> DispatchCoordinatorProcess -> nine Threads`; node count changes from 9 to 10 and depth from 1 to 2. This is a legal-containment correction, not a domain-policy change.

SEL-REV-02: The delegation-accounting finding is accepted with its semantic/raw distinction made explicit. Semantic edge and interaction counts remain exactly 21; generated source has seven additional support delegations and 28 total connection declarations.

SEL-REV-03: The PART-04 owner finding is accepted. PART-04 now combines raw execution outcome with PART-07 pre-state context to derive `Preserve | Completed | RetryEligible | Abort`; it owns correlation and classification rather than a one-for-one failed-attempt rename.

SEL-REV-04: The PART-07 narrowing is accepted. PART-07 owns lifecycle, stored payload and attempt, transition application, and shipment instruction; it publishes uncredited pre-state context using `In(...)` and neither correlates raw outcomes nor claims terminal-disposition classification.

SEL-REV-05: The PART-08 owner finding is accepted. PART-08 suppresses confirmation for both `Preserve` and `RetryEligible` and emits distinct terminal confirmation for `Completed` and `Abort`; active-identifier copying is explicitly uncredited.

SEL-REV-06: The Model's no-concern findings for PART-01, PART-03, PART-05, narrowed PART-07, and PART-09 are accepted. The PART-02 and PART-06 portions are accepted only for their nonidentity owner basis and narrowed by the authoritative resumed diagnostic: PART-02 must independently qualify the presented fresh payload and stored recovery payload, and PART-06 must select the matching readiness/payload source and derive a deterministic terminal-pre-state reset. Copied payload/context fields remain excluded from ownership evidence.

SEL-REV-07: The representation and bounded-analysis finding is accepted. Closed enums, a five-value amount enum with explicit numeric denotation, flat data records, Thread-local finite state, pre-state context, owner-factored exhaustive products, independent oracles, and bounded sequences preserve the policy without requiring an executable profile.

SEL-REPAIR-01: The authoritative resumed Designer diagnostic is accepted. The pre-repair allocation could qualify recovery against the currently presented request rather than the stored commitment, so it did not prove that the committed payload alone authorizes retry.

SEL-REPAIR-02: The recovery-allocation action is accepted without increasing complexity. INT-14 is redirected from PART-06 to PART-02 with PART-07's pre-state lifecycle capacity and stored payload; INT-08 carries both PART-02-owned candidate assessments plus uncredited recovery context to PART-06. INT-05 and INT-07 continue to carry the presented fresh payload. The architecture remains nine semantic usages and 21 semantic interactions.

SEL-REPAIR-03: The recovery-evidence action is accepted. SCN-07 and the bounded analysis require independent retry witnesses with no presented request and with a differently valued admissible competitor, plus a negative witness in which only the presented payload is ready. Only stored-payload readiness may authorize `ReleaseRetry`.

SEL-REPAIR-04: The terminal-reset action is accepted. For either terminal pre-state, PART-06 shall derive `ResetIdle` and `TerminalReset` for every other input valuation; PART-07 shall clear the commitment and apply `Idle`; PART-09 shall derive `Idle` owner-locally and suppress repeated terminal reporting.

SEL-VIS-01: The resumed `visualization.json` decision is accepted as no-defect evidence: it reports accepted native and traceability review, zero unresolved trace IDs, zero duplicate anchors, and zero irrelevant associations. It requests no baseline correction; the canonical paired anchors remain unique while the semantic repair above requires regenerated trace/source evidence.

## Policy trade decisions held fixed

SEL-POL-01: Capacity remains one active dispatch with no queue. Queue depth, fairness, withdrawal, starvation, and throughput are deferred.

SEL-POL-02: Protected active work outranks fresh work, and pending one-time recovery outranks a simultaneous fresh request. This explicit conflict preserves correlated active identity and avoids unsupported priority classes.

SEL-POL-03: Request, inventory, and dock qualification remain conservative owner-local facts; invalid or mismatched observations cannot authorize release. Presented-fresh and stored-recovery inventory readiness are distinct PART-02 facts, and recovery may consult only the latter.

SEL-POL-04: One later retry after a matching fresh-attempt failure remains selected over no recovery or unbounded retry. Same-evaluation retry and a second retry remain prohibited.

SEL-POL-05: Shipping confirmation remains delivered to the Sales Order Source rather than directly to Customer. This is a pilot boundary choice, not a correction of the seed.

SEL-POL-06: Public status remains separately derived because waiting, rejection, busy, recovery, terminal entry, and terminal-to-idle reset are meaningful even without instruction or confirmation. `TerminalReset` plus applied `Idle` deterministically yields `Idle`.

## Local ownership and analysis decision

SEL-OWN-01: PART-01, PART-02, PART-03, and revised PART-04 are cooperating qualification/classification owners; PART-02 applies its readiness relation independently to presented and stored candidates, PART-05 resolves the explicit recovery-versus-fresh conflict, and PART-06 selects the matching candidate facts without recomputation.

SEL-OWN-02: PART-07 is the sole state and instruction authority. Its contexts to PART-04 and PART-02 use pre-state values, so both the outcome-plan return and the PART-02/PART-06 decision return are state-broken feedback relations rather than combinational loops.

SEL-OWN-03: PART-08's two-to-one suppression relation and PART-09's multi-input precedence and terminal-reset relation are required in canonical local contracts. Boundary delegation, record construction, identifier copying, payload preservation/routing, and context publication do not earn owner credit.

SEL-EVID-01: The bounded analyzer shall execute each owner function against a separately written oracle, exhaust all declared local products—including both candidate-specific inventory products and every terminal-pre-state PART-06 product—retain witnesses for all 20 cases and eight scenarios, and report zero mismatches, gaps, and unintended local overlaps within a 180-second watchdog.

SEL-EVID-02: Bounded end-to-end sequences shall cover release, rejection, both waiting paths and their precedence, active-versus-fresh conflict with identity preservation, completion on either attempt, first failure to pending with no immediate retry, later stored-payload retry with no presented request, later stored-payload retry despite a differently valued competitor, denial when only that competitor is ready, completion and failure terminal-pre-state reset to `Idle`, and stale/progress/mismatched feedback invariance.

## Exact final metrics

SEL-COUNT-01: The approved design has exactly 9 semantic usages, within 8..12, plus one uncredited support Process for a raw node count of 10.

SEL-COUNT-02: The approved design has exactly 21 semantic interactions, within 15..21, plus seven support delegations for exactly 28 connection declarations.

SEL-COUNT-03: The approved design has exactly 20 nontrivial contract cases, within 12..20, and exactly 8 scenario families, within 6..9.

SEL-COUNT-04: The approved design has one root System usage, containment depth 2, one weakly connected semantic region, at least six cooperating decision/qualification owners, and one explicit recovery-versus-fresh priority conflict.

## Claim boundary and disposition

SEL-CLAIM-01: Seed-derived facts remain limited to the frozen vocabulary and reported source limitations. All finite identifiers, amounts, validity states, single-capacity policy, conflict priority, correlation, and one-retry recovery are pilot abstractions.

SEL-CLAIM-02: Quantitative time, throughput, capacity above one, queues, withdrawal, fairness, starvation bounds, inventory mutation, and acknowledgement timing remain deferred and may not be reported as passed.

SEL-CLAIM-03: Procurement, production scheduling/control, production-step execution, material handoff, customer quotation/order confirmation, Supplier interaction, dynamic routing, physical quality, delivery performance, industrial safety, certification, and direct Customer confirmation remain outside scope.

SEL-CLAIM-04: Code generation, application implementation, executable simulation, deployment bindings, formal proof beyond retained contract/analyzer evidence, and physical-actuator validation remain `not-run`; architecture/final typechecking, trace, ownership, bounded-case, sequence, and visualization gates remain required.

SEL-DISP-01: The revised federated design is approved and Model regeneration is authorized against `system-abstract.md`. Authorization requires regenerated source-bound evidence and a refreshed Model Summary hash; it does not permit weakening the frozen domain policy, changing the 9/21/20/8 semantic design, crediting generated support or routed context, qualifying recovery against a presented request, leaving terminal reset unconstrained, or replacing owner-local evidence with central recomputation.
