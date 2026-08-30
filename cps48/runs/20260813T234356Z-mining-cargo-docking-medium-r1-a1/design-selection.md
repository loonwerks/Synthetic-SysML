# Approved design selection — Station Cargo-Transfer Verification Supervisor

## Decision frame

DS-NEED-01: Select one coherent medium-sized scope from the reusable mining-cargo-docking seed without treating source vocabulary as a predefined interface, topology, or policy.

DS-CRIT-01: Selection criteria are boundary coherence, distinct owner-local derivations, explicit priority and recovery behavior, two-source verification value, finite analyzability, traceable medium-tier complexity, and avoidance of claims the seed does not support.

DS-CRIT-02: Campaign compliance requires 8..12 semantic usages, 15..21 semantic interactions, 12..20 nontrivial contract cases, 6..9 scenario families, at least two cooperating decision or qualification owners, and at least one explicit priority conflict; counts without distinct responsibility or trace value are rejected.

DS-DIV-01: The frozen diversity card is empty, so no baseline-difference constraint applies and no diversity evidence is asserted for this run.

## Candidate seed scopes

DS-SCOPE-01: Ore-hold supervision would control mining continuation and hold readiness from hold and extraction observations, but it offers less direct two-party evidence reconciliation and would require new mining-flow policy unrelated to the selected station transaction.

DS-SCOPE-02: Station cargo-transfer verification supervises admission, offload commands, independent ship and warehouse evidence, public outcome reports, priority preemption, and explicit recovery while leaving physical cargo movement outside the boundary.

DS-SCOPE-03: Docking-service supervision would center dock/undock readiness and service access, but physical docking is excluded and the source does not supply a complete docking/undocking state machine, making a medium policy more dependent on invented docking semantics.

DS-SCOPE-04: Capacitor and support-system resupply verification would reconcile recharge or support evidence, but it would not use the seed's cargo-transfer ambiguity and would require a selected resupply adequacy policy unsupported by the source.

DS-SCOPE-DEC-01: DS-SCOPE-02 is selected because it provides a coherent single-system boundary, preserves the source's distinction between ship transfer status and warehouse evidence, supports meaningful cooperating qualification owners, and allows a bounded recovery policy without asserting physical success.

## Responsibility-allocation alternatives

DS-ALT-01: A session-centric allocation would place request qualification, service arbitration, evidence reconciliation, state, commands, and reports in one principal supervisor with thin input adapters; it is compact but centralizes most derivation, weakens compositional ownership evidence, and makes the adapters likely to be uncreditable forwarding wrappers.

DS-ALT-02: An evidence-and-session-centered allocation separates request and service qualification, priority arbitration, session state, ship and warehouse qualification, completion reconciliation, command gating, and outcome reporting into nine collaborating responsibilities connected by 21 typed semantic interactions.

DS-ALT-03: A two-sided allocation would give a ship-side owner the request, cargo, command, and transfer status and a station-side owner the service, warehouse, and station report, with one cross-boundary consensus owner; it makes the logical system boundary resemble a deployment split and couples responsibility to physical location the seed does not establish.

DS-ALLOC-DEC-01: DS-ALT-02 is selected. Each of its nine usages derives a distinct local fact, state remains uniquely owned, the completion claim requires cooperation between independent evidence owners, and the command gate independently suppresses a begin if service eligibility changes.

DS-ALLOC-RAT-01: DS-ALT-01 is rejected because a centralized supervisor plus forwarding adapters would fail the owner-padding standard even if it met node count; DS-ALT-03 is rejected because location-driven ownership and cross-side consensus add unsupported deployment semantics without improving this abstract's logical verification purpose.

## Selected boundary and policy

DS-BOUND-01: The exact boundary has five inputs—transfer request, cargo state, dock-service condition, ship transfer evidence, and warehouse receipt evidence—and four outputs—ship command, warehouse query, pilot report, and station report.

DS-STATE-01: SessionController is the sole persistent state owner over eight finite states; PriorityArbiter consumes the published pre-state but shall neither copy nor own it.

DS-OWNER-01: Cooperating decision or qualification owners are RequestQualifier, ServiceReadinessQualifier, PriorityArbiter, both EvidenceQualifiers, CompletionReconciler, CommandSafetyGate, and OutcomeReporter; SessionController owns both state transition and state-derived proposals.

DS-PRIOR-01: The selected ordered policy is fault recovery, dock-service preemption, fresh cancel, two-source completion, qualified reset, eligible fresh start, progress, then hold. The explicit conflict is UNDOCK_PRIORITY against start or continuation, with an additional cancel-versus-completion tie resolved in favor of cancel.

DS-REC-01: Recovery is latched, has no automatic retry, and clears only on FRESH_RESET with READY service, ship IDLE, and NO_RECEIPT; the reset evaluation cannot begin transfer, so later re-entry needs a distinct FRESH_START.

## Count and topology audit

DS-COUNT-01: The selected exact tuple is `9 / 21 / 20 / 7`: nine responsibility-bearing usages, 21 end-to-end semantic interactions, 20 nontrivial cases, and seven scenario families, all within medium bounds.

DS-COUNT-02: The interaction recount is five boundary-input deliveries, twelve owner-to-owner fact flows, and four boundary-output deliveries. Distinct fan-outs of SessionExpectation and ServiceEligibility are retained because their consumers derive different facts; no route or delegation receives interaction credit.

DS-TOPO-01: The nine semantic usages form one weakly connected region beneath exactly one root, with semantic depth bounded to 1..2. At most one behavior-free support container and minimum trusted-form delegations may be generated without semantic credit.

DS-CASE-01: The twenty cases cover idle hold, eligible start, empty and ineligible rejection, five fault sources including unexpected evidence, three stop/preemption outcomes, active waiting and partial evidence, verified completion, terminal persistence, blocked recovery, successful recovery, and terminal reset; a direct 19,200-snapshot Designer audit found every case reachable and closed the ordered partition.

DS-SCN-01: The seven families cover nominal completion, freshness/cargo boundaries, dock-service conflict, cancel-versus-completion conflict, partial evidence, invalid/unexpected evidence, and complete recovery plus later fresh re-entry.

DS-PADDING-01: The selected design gives no semantic credit to the root, context actors, support containment, routing declarations, data wrappers, analyzers, initialization, direct enum mappings, or duplicated output guarantees; every credited usage and interaction is needed by a named behavioral trace.

## Assumptions and source boundary

DS-ASM-01: Freshness is supplied by the pilot, evidence pertains to the sole logical session, dock service supplies one current mutually exclusive condition, and logical evaluations have no wall-clock meaning; each assumption is a pilot choice beyond source-grounded facts.

DS-CLAIM-01: The design verifies only consistency of selected finite evidence and never claims physical cargo transfer, physical docking success, safety, certification, production readiness, or fidelity to a real or game spacecraft.

DS-DEFER-01: Cargo identity and quantity, timestamps, transaction IDs, timeouts, retry limits, concurrent sessions, repair, resupply, mining control, physical mechanisms, executable application logic, and formal proof remain deferred rather than silently approximated.

## Realizability questions retained for Model review

DS-QUESTION-01: Can the trusted SysML-AADL/GUMBO forms publish SessionController pre-state on INT-08 for PriorityArbiter while consuming the returned directive on INT-09 without an algebraic cycle, duplicated state, or an extra semantic interaction?

DS-QUESTION-02: Can one finite SessionSnapshot carry next state and result to OutcomeReporter so it derives both public reports locally, while preserving exactly 21 end-to-end interactions and avoiding a forwarding-only reporter?

DS-QUESTION-03: Can the retained dependency-free analyzer enumerate all 19,200 snapshots and the seven ordered scenario traces under the harness watchdog while independently checking owner locality, the 20-case partition, priority, and recovery?

## Initial disposition

DS-DISP-01: Passed for Model review. The selected design is implementation-independent at the semantic level, meets the exact medium tuple without padding, closes owners and finite paths, and retains concrete realizability questions instead of assuming tool behavior.

## Designer resolution of Model review

DS-RES-01: All six Model findings are accepted as no-concern or narrowed localized realization guidance; none changes the boundary, responsibilities, interactions, local policies, priority, lifecycle, recovery, cases, scenarios, metrics, or claim boundary, so the approved System Abstract is an explicit unchanged copy of the initial baseline.

DS-METRIC-FINAL-01: The final architecture metrics are exactly nine credited semantic usages, 21 end-to-end semantic interactions, 20 credited nontrivial contract cases, and seven scenario families, with one explicit root, semantic containment depth 1..2, one weakly connected semantic region, cooperating qualification or decision owners PART-01, PART-02, PART-03, and PART-05 through PART-09, PART-04 as the sole persistent state owner and a state-dependent decision owner, and the explicit UNDOCK_PRIORITY conflict in DS-PRIOR-01.

DS-LOCAL-FINAL-01: Generation shall realize the owner-local total relations LOCAL-01 through LOCAL-09 without central recomputation or forwarding credit and shall enumerate their complete direct products of `24, 5, 192, 360, 15, 12, 25, 16, 64` valuations for PART-01 through PART-09; PART-07's ten producer-inconsistent cross-expectation pairs and PART-09's producer-inconsistent snapshots shall be identified as unreachable or covered only by an explicitly uncredited fail-closed robustness clause.

DS-ANALYSIS-FINAL-01: The retained dependency-free analyzer shall enumerate all 19,200 boundary/pre-state snapshots, reproduce the CASE-01 through CASE-20 vector `[40, 1, 1, 12, 8000, 2240, 896, 672, 6384, 168, 336, 24, 2, 24, 96, 24, 264, 6, 2, 8]`, check gaps, overlaps, outputs, owner locality, priority, reachability, and exhaustiveness, compose the nine local relations against an independently structured raw-input oracle, and execute all seven state-carrying scenario families.

DS-SUPPORT-FINAL-01: The authorized generated-support mapping is one explicit root System, at most one behavior-free uncredited Process, nine credited contract-bearing Thread usages, and the minimum typed boundary delegations and sibling connections; the reviewed mapping has 30 raw connection declarations while still realizing exactly 21 semantic INTs, and all support containment, ports, delegation hops, record construction, equal-value fan-out, and routing shall be specifically traced without receiving usage, interaction, owner, or case credit.

DS-CLAIM-FINAL-01: The local-contract and analyzer evidence is bounded conformance evidence only; physical cargo movement, docking effectiveness, safety, certification, production readiness, game fidelity, application execution, code generation, and formal or unbounded temporal proof remain unclaimed together with every item in DEFER-01 through DEFER-03.

DS-DISP-FINAL-01: Approved without semantic revision. Model generation is authorized only against the explicit final System Abstract and this approved selection, preserving the exact 9/21/20/7 tuple, owner locality, priority exclusions, generated-support limits, bounded-analysis obligations, and deferred claims.
