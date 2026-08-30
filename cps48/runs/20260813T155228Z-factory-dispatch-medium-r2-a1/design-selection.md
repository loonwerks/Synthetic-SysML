# Designer-Approved Design Selection — Fixed-Line Production Flow Supervisor

## Decision frame

SEL-FRAME-01: This record approves one implementation-independent medium-tier scope from the frozen factory seed. Source facts, handbook-derived methodology, pilot abstractions, selected architecture, and deferred claims remain distinct in `system-abstract.md`.

SEL-CRIT-01: Selection criteria are a coherent non-dispatch boundary, direct grounding in available seed vocabulary, distinct owner-local responsibilities, a closed finite state/decision partition, meaningful fault and recovery behavior, one explicit priority conflict, tractable bounded analysis, and no reliance on unsupported physical or timing claims.

SEL-CRIT-02: Campaign conformance requires 8..12 semantic usages, 15..21 semantic interactions, 12..20 nontrivial contract cases, 6..9 scenario families, at least two cooperating decision or qualification owners, and no usage, interaction, case, or scenario introduced merely to reach a count.

## Scope alternatives

ALT-SCOPE-01: Procurement/material-availability coordination was considered. It offers a distinct Supplier-facing purpose, but the seed explicitly reports material-order/purchase-order type and direction ambiguities and supplies no authoritative purchase lifecycle, so a medium recovery policy would depend heavily on invented supplier transaction semantics.

ALT-SCOPE-02: Production scheduling/release coordination was considered. It is diversity-compliant, but the seed supplies no capacity, due date, readiness, or scheduling policy; credible prioritization among multiple planned jobs would require broader queue and fairness inventions than this run needs.

ALT-SCOPE-03: Commercial inquiry/quotation response was considered. It is diversity-compliant, but price, quotation validity, acceptance, expiry, and commercial fault semantics are absent, making most medium-tier behavior newly invented business policy.

ALT-SCOPE-04: Fixed-line production-flow supervision was selected. The six named ordered production steps are the strongest source-grounded structure outside dispatch, and a single-work logical progression boundary permits bounded readiness, correlation, priority, transfer, and one-retry policies to be isolated and labeled as pilot abstractions.

ALT-SCOPE-05: Storage-to-production material handoff was considered but rejected as the primary scope because it is narrower and would not use the seed's six-step production structure; material handoff remains only one external qualification input to the selected supervisor.

ALT-SCOPE-06: Finished-product dispatch coordination was rejected by the frozen diversity card and independently rejected for this design because shipment release and shipping-confirmation state would replace the selected production-step purpose with the organizing behavior of the accepted baselines.

ALT-SCOPE-07: Manufacturer-level order-to-dispatch coordination was rejected because it combines commercial, procurement, production, storage, and shipment policy into a broad orchestrator and is explicitly too close to the accepted order-to-dispatch baseline family.

SEL-SCOPE-01: The retained boundary begins with a presented production-work request, correlated material observation, target-step readiness, and process result. It ends with a logical line-flow command, production outcome, and scheduling status. Procurement, physical processing, storage mutation, and dispatch remain external.

## Responsibility-allocation alternatives

ALT-ARCH-01: A centralized production-flow manager was rejected because it would own request/material/station qualification, outcome correlation, priority, authorization, state, and reporting in one usage; remaining usages would be routing wrappers and would violate the no-owner-padding rule.

ALT-ARCH-02: A six-station component chain was rejected because identical per-step components would largely duplicate one progression rule, inflate usages, and misleadingly imply physical station control or dynamic routing. The step sequence is instead explicit finite policy owned by one ledger.

ALT-ARCH-03: A federated qualification-and-flow architecture was selected: separate owners qualify work, material, target-step readiness, and results; a priority owner protects held work; an authorization owner combines those facts; a ledger owns progression state and commands; distinct outcome and status owners derive externally meaningful results.

SEL-ARCH-01: The selected architecture has exactly nine semantic usages: Work Request Qualifier, Material Correlation Qualifier, Target-Step Readiness Qualifier, Process Outcome Correlator, Protected-Work Priority Resolver, Flow Authorization Owner, Flow Ledger, Production Outcome Determiner, and Flow Status Determiner.

SEL-ARCH-02: Exactly 21 semantic interactions comprise four boundary-input deliveries, fourteen responsibility-bearing inter-usage exchanges, and three boundary-output deliveries. Each exists because a downstream owner needs the fact or because the value crosses the selected system boundary.

SEL-ARCH-03: Legal retained containment may add one behavior-free generated-support Process under the root System and place the nine semantic Threads beneath it. This yields ten non-root raw usages at depth two and one weakly connected semantic region; root and Process receive no semantic credit.

SEL-ARCH-04: Seven unchanged root/Process delegations are generated support, producing 28 total connection declarations while leaving the semantic count at 21. The Process, delegations, type wrappers, context records, and copied payload fields receive no owner or campaign credit.

## Policy trade decisions

SEL-POL-01: One active work item and no queue were selected to keep the system about fixed-line progression rather than job-shop scheduling. Queueing, fairness, withdrawal, and throughput remain deferred.

SEL-POL-02: Existing active, transfer-pending, and recovery-pending work outranks fresh admission. The required explicit conflict is pending same-step retry versus simultaneous fresh work; retry wins and retains the stored work identifier and step.

SEL-POL-03: A one-later-retry policy was selected over no retry and unbounded retry. It creates observable recovery while preserving a finite partition: first failure holds the same step, a later ready evaluation retries once, and retry failure terminates.

SEL-POL-04: A transfer-pending state was selected rather than assuming every successor is ready in the same evaluation. This preserves the source order while making blocked and invalid successor readiness explicit without inventing alternate routes.

SEL-POL-05: Production completion is reported to Production Scheduling, with downstream Storage/Dispatch only contextual. The system neither owns finished-product availability nor initiates shipment.

## Diversity decision against frozen baselines

DIV-BASE-01: The closest named baseline is the accepted replicate-2 Small finished-product dispatch system with a stateful request registry plus dispatch arbiter that releases and retries shipments; the accepted replicate-1 family also coordinates finished-product/order-to-dispatch work.

DIV-PURPOSE-01: The selected primary controlled purpose is fixed-line production-flow progression. It authorizes start, ordered step advance, held transfer, same-step retry, abort, and production outcome; shipment release and shipping confirmation are absent from its state machine and outputs.

DIV-BOUND-01: The boundary genuinely differs: this system consumes production-work, material-handoff, station-readiness, and correlated step-result observations and emits line-flow commands plus production status/outcome. The baselines consume dispatch/shipment requests and availability/execution context and emit shipment release/confirmation behavior.

DIV-STATE-01: State ownership genuinely differs: the Flow Ledger retains production phase, current one of six steps, attempt, and transfer/recovery context. It is not a shipment/request registry and has no dispatch commitment, shipment attempt, or confirmation lifecycle.

DIV-TOPO-01: Interaction topology genuinely differs: readiness and result qualifiers use ledger pre-state to qualify the relevant production target, priority protects in-process work, authorization feeds an ordered progression ledger, and completion/status owners observe applied production state. This is not a reordered registry-to-dispatch-arbiter pipeline.

DIV-REC-01: Recovery policy genuinely differs: failure holds and retries the same production step, transfer can wait at a specific successor, successful work continues through the remaining ordered steps, and exhausted retry produces a production failure then reset. It does not re-release a failed shipment or wait for shipping confirmation.

DIV-NOT-EXT-01: The design is not an extension, repartitioning, or rename of the dispatch baselines because removing every dispatch concept leaves the complete controlled purpose, boundary, state, interactions, cases, and scenarios intact. Adding dispatch after production completion would require a separate downstream system and new state machine rather than elaborating this one.

## Model-finding dispositions

SEL-REVIEW-01: **Accepted.** The containment and feedback finding authorizes exactly one behavior-free generated-support Process containing the nine sibling Threads, seven unchanged root/Process delegations, and canonical pre-state publication for INT-12 through INT-14 only from PART-07 `In(...)` values. This preserves 21 semantic interactions, breaks the same-evaluation feedback cycle through state, and adds no semantic owner or interaction.

SEL-REVIEW-02: **Accepted.** The extensional ownership audit confirms a substantive owner-local relation for every PART-01 through PART-09. Generation must preserve the complete classification, correlation, state-dependent targeting and priority, multi-input authorization, persistent transition, terminal gating, and status-precedence relations; copied payloads, identifiers, context publication, record construction, routing, and labels remain uncredited.

SEL-REVIEW-03: **Accepted and narrowed to feasibility.** The explicit six-step successor and entry-only production outcome are expressible with finite enum/record and Thread-local forms, but that precedent is not verification of this run. The generated source must use an explicit nonordinal successor helper and PART-08 must combine correlated outcome with the applied PART-07 snapshot to suppress reset repetition.

SEL-REVIEW-04: **Accepted and narrowed to required executed evidence.** Owner-local enumeration and eight bounded traces are plausibly within the 180-second watchdog, but harness schema checks and ownership descriptions are not semantic proof. Generation must retain independently written oracles, enumerate every required owner-local product, report all case/scenario witnesses and zero gaps, overlaps, or mismatches, and fail closed on timeout or omission.

SEL-REV-01: This Designer revision records accepted feasibility findings and final authorization without changing the selected boundary, architecture, policy, owner allocation, interaction inventory, `9/21/20/8` tuple, scenarios, frozen source claims, or deferred claims.

## Ownership, partition, and count audit

SEL-OWN-01: PART-01 through PART-06 are cooperating qualification/decision owners with nonidentity local relations. PART-07 alone owns persistent state and line command; PART-08 and PART-09 independently derive terminal outcome and multi-source public status.

SEL-OWN-02: Copied eligible payloads, stored contexts, boundary delegations, record construction, and root/Process routing are uncredited. No usage is credited solely for preservation, bundling, renaming, or a bijective translation.

SEL-CASE-01: The exact 20-case partition closes terminal reset, all active outcome/conflict branches, transfer readiness, recovery readiness and exhaustion, and all fresh no-request/invalid/material/station/start branches. Terminal precedence and owner-local classifications make each phase exhaustive and non-overlapping.

SEL-SCN-01: The exact eight scenario families cover fresh start, rejection boundary, material qualification, station/transfer wait, six-step nominal completion, protected-work conflict, successful one-retry recovery, and stale-result plus exhausted-retry termination.

SEL-COUNT-01: The final approved campaign tuple is exactly `9 semantic usages / 21 semantic interactions / 20 nontrivial contract cases / 8 scenario families`, within medium bounds. There is one explicit root, one uncredited support Process, ten non-root raw nodes, depth two, one weak semantic region, and 28 total connection declarations.

SEL-COUNT-02: Recount after the ownership and recovery audit found no padding: all nine PART items have distinct local behavior, all 21 INT items support a unique endpoint need or boundary flow, all 20 CASE items have a distinct condition/result trace, and all eight SCN items exercise a distinct concern.

## Evidence and disposition

SEL-EVID-01: Required mechanical evidence is architecture-stage and final Sireum/HAMR typechecking, compatible resolved endpoints, complete bidirectional trace coverage, canonical owner-local contracts, independent-oracle bounded analysis with witnesses for all cases/scenarios, and a source-bound `system-overview`.

SEL-EVID-02: Required Designer validation is separate and asks whether the model preserves the fixed-line production purpose, ordered-step semantics, boundary, ownership, priority, recovery, scenarios, source/assumption distinction, and deferred-claim boundary.

SEL-QUESTION-01: Model review resolved pre-state feedback as realizable through canonical PART-07 `In(...)` publications without algebraic cycles or extra semantic interactions; generated-source typechecking and retained analyzer evidence remain required.

SEL-QUESTION-02: Model review resolved the explicit successor, entry-only outcome, and unconditional next-evaluation reset as realizable with finite records/enums and Thread-local contracts; generation shall not use enum-order assumptions.

SEL-QUESTION-03: Model review found the exhaustive owner-local products and eight bounded scenario sequences tractable under the 180-second watchdog; the retained run must still execute them with independent oracles and satisfy every zero-defect criterion.

SEL-DISP-01: Final Designer disposition is `approved`. Model generation is authorized only against `system-abstract.md` and this selection. Any incompatibility shall return a precise diagnostic to this retained run and may not silently centralize ownership, weaken the finite partition, change the `9/21/20/8` tuple, introduce dispatch as controlled purpose, credit generated support, discard the frozen seed, or start a replacement attempt.
