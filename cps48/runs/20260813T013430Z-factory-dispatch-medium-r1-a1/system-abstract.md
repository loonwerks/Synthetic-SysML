---
abstract_id: SA-20260813-R2
domain_seed: 20260813T004233Z-factory-dispatch-seed-v1
campaign_complexity: medium
node_count: [10, 10]
edge_count: [21, 21]
semantic_usage_count: [9, 9]
semantic_interaction_count: [21, 21]
nontrivial_contract_case_count: [20, 20]
scenario_family_count: [8, 8]
containment_depth: [2, 2]
root_system_usage_count: 1
generated_support_usage_count: 1
generated_support_delegation_count: 7
port_connection_declaration_count: [28, 28]
weakly_connected_region_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
requires_priority_conflict: true
executable_profile: false
---

# Finished-Product Dispatch Coordinator — Approved System Abstract

## Synopsis

SYN-01: The Finished-Product Dispatch Coordinator will coordinate one bounded finished-product dispatch at a time between a Manufacturer's sales/order source, storage inventory source, and dispatch execution facility. It shall qualify a presented request, qualify product and dock readiness, choose between fresh release and pending recovery, preserve an active commitment, issue shipment instructions, and report dispatch status and terminal shipping confirmation.

SYN-02: The modeled system is a coordination specification, not a physical warehouse, production line, carrier, sales system, or customer system. It controls only its discrete instruction and reporting outputs; it does not claim that a product physically ships merely because a release instruction is issued.

## Evidence and claim classes

FACT-SRC-01: The frozen seed supplies the source-grounded vocabulary of Manufacturer, Customer, Supplier, sales, storage, dispatch, product availability, shipment, and shipping confirmation. This clause is informational context, not behavior allocated to the generated model.

FACT-SRC-02: The frozen seed reports ambiguous shipping-confirmation ownership, disconnected inventory, apparent source connection inconsistencies, and no established dynamic dispatch, priority, readiness, fault, or recovery semantics. This clause is informational and prohibits treating those semantics as source facts.

FACT-SRC-03: The source fixes a production-step sequence but supplies no evidence for dispatch routing, throughput, physical quality, delivery performance, industrial safety, or executable behavior. Those topics are outside the selected scope.

FACT-METH-01: The handbook-derived facts used here concern engineering method: define need and boundary before architecture, separate assumptions and rationale, compare alternatives, allocate cohesive ownership, cover nominal and off-nominal partitions, define objective evidence, and preserve traceability. This clause is informational and supplies no factory-domain behavior.

SCOPE-01: The selected pilot abstraction is the seed's finished-product dispatch coordinator scope, extended only by the explicitly labeled finite assumptions and policies below. The exact boundary begins when a sales/order source presents one dispatch request and ends at instruction, status, and terminal confirmation outputs; production and procurement are not coordinated by this system.

## Goals

GOAL-01: The system shall release a fresh dispatch only when the request is admissible, matching inventory is sufficient, the dock observation is usable and ready, and no protected active or recovery commitment has precedence.

GOAL-02: The system shall preserve one active dispatch identity through execution feedback, terminal confirmation, and at most one recovery attempt so that a competing fresh request cannot displace committed work.

GOAL-03: The system shall expose deterministic rejection, waiting, active, recovery, completion, and failure outcomes for every finite input/state partition without claiming physical shipment success before matching completion feedback.

## Operational context and boundary

CTX-01: The Sales Order Source is outside the system. It presents a candidate finished-product dispatch request and receives coordinator status and terminal shipping confirmation; direct communication to the seed's Customer is outside this boundary.

CTX-02: Storage is outside the system. It supplies a bounded inventory snapshot for one product but retains all responsibility for physical inventory and material movement.

CTX-03: Dispatch Execution is outside the system. It supplies dock observations and shipment execution outcomes, and receives shipment instruction events; it includes the unmodeled facility/carrier activity needed to act on those instructions.

CTX-04: The Customer and Supplier remain seed context but have no direct port or controlled quantity in this selected system. Customer interaction is mediated by CTX-01, and Supplier/procurement behavior is excluded.

MON-01: `request` is supplied by CTX-01 and has the exact finite product type `RawDispatchRequest(requestId, productId, amount, freshness)`: `requestId` is `None | R1 | R2 | R3 | R4 | R5 | R6 | R7 | R8`; `productId` is `None | P1 | P2 | P3 | P4`; `amount` denotes `0..4`; and `freshness` is `Fresh | Repeated`.

MON-02: `inventorySnapshot` is supplied by CTX-02 and has the exact finite type `InventorySnapshot(status, productId, availableAmount)`: `status` is `Valid | Invalid`; `productId` uses the MON-01 product domain; and `availableAmount` denotes `0..4`.

MON-03: `dockSnapshot` is supplied by CTX-03 and has the exact finite type `DockSnapshot(status, disposition)`: `status` is `Valid | Invalid`; and `disposition` is `Ready | Occupied | Unavailable`.

MON-04: `executionOutcome` is supplied by CTX-03 and has the exact finite type `ExecutionOutcome(requestId, attempt, result)`: `requestId` uses the MON-01 request domain; `attempt` is `FreshAttempt | RetryAttempt`; and `result` is `NoReport | InProgress | Completed | Failed`.

CTRL-01: `shipmentInstruction` is received by CTX-03 and has the exact finite type `ShipmentInstruction(kind, requestId, productId, amount)`: `kind` is `NoInstruction | ReleaseFresh | ReleaseRetry | Cancel`; identifiers and amount use the MON-01 domains. `ReleaseFresh` and `ReleaseRetry` shall carry the active non-`None` identifiers and amount `1..4`; `Cancel` shall carry the aborted active request; `NoInstruction` shall carry `None`, `None`, and `0`.

CTRL-02: `shippingConfirmation` is received by CTX-01 and has the exact finite type `ShippingConfirmation(kind, requestId)`: `kind` is `None | Shipped | DispatchFailed`; a terminal kind shall carry the corresponding non-`None` active request identifier, and `None` shall carry `None`.

CTRL-03: `dispatchStatus` is received by CTX-01 and has the exact finite enumeration `Idle | Rejected | WaitingInventory | WaitingDock | Busy | Released | Recovering | Completed | Failed`.

BOUND-01: Exactly MON-01 through MON-04 are root inputs and exactly CTRL-01 through CTRL-03 are root outputs. Context actors are not semantic component usages, and no hidden clock, queue, withdrawal, production-completion, carrier-capacity, or physical-actuator input is permitted.

## Selected finite policy and state

POL-01: A request is `NoRequest` exactly when request identifier and product identifier are both `None` and amount is `0`, regardless of freshness. Every other request is well formed exactly when both identifiers are non-`None` and amount is in `1..4`; a non-sentinel request that is not well formed is malformed. `Fresh` and `Repeated` are exhaustive freshness values.

POL-02: Inventory readiness is candidate-specific. For an applicable candidate payload, inventory is `Sufficient` exactly when the snapshot is `Valid`, its non-`None` product identifier equals that candidate's product identifier, and `availableAmount >= candidate.amount`; it is `Insufficient` when the valid matching snapshot has fewer units, and `Unknown` when the snapshot is invalid or does not match. PART-02 shall evaluate the presented admissible payload for fresh intent and the stored active payload for recovery intent as independent applications of this rule; a missing candidate yields `NotApplicable` and may not authorize release.

POL-03: Dock readiness is `Ready` exactly for a valid `Ready` snapshot, `Blocked` exactly for a valid `Occupied` or `Unavailable` snapshot, and `Unknown` for every invalid snapshot.

POL-04: The coordinator owns exactly one lifecycle value: `Idle | ActiveFresh | RecoveryPending | ActiveRetry | TerminalCompleted | TerminalFailed`, plus the active request payload when non-idle. A transition into a terminal lifecycle produces its terminal output and status in that evaluation. On the next evaluation, terminal pre-state shall make PART-06 derive deterministic `ResetIdle`/`TerminalReset` results regardless of presented request or readiness inputs; PART-07 shall clear the commitment and publish the applied `Idle` snapshot, and PART-09 shall derive `Idle`. No candidate is accepted during that reset evaluation, and no queue or durable terminal history is required.

POL-05: Raw execution feedback is correlated only by PART-04 against PART-07's pre-state lifecycle, active request identifier, and active attempt. A matching terminal result requires an active lifecycle, equal non-`None` identifier, and equal attempt. `NoReport`, `InProgress`, every mismatch, and every result outside an active lifecycle classify as `Preserve` and shall not mutate the commitment.

POL-06: The explicit priority order is protected active attempt over any fresh request, then pending recovery over any simultaneous fresh request, then an admissible fresh request, then no candidate. This resolves the deliberate conflict in which recovery continuity competes with accepting new work; even a fresh request may not preempt protected or recovery work.

POL-07: A matching first-attempt failure classifies as `RetryEligible` and creates one recovery opportunity. Recovery shall be released only in a later evaluation after current inventory and dock qualifications again pass, never combinationally in the failure evaluation. A matching retry failure classifies as `Abort` and terminates the request with `Cancel`, `DispatchFailed`, and `Failed`; there is no second retry.

POL-08: When a selected candidate lacks multiple prerequisites, `WaitingInventory` has reporting precedence over `WaitingDock`. A newly applied terminal lifecycle has precedence over recovery, active/busy, waiting, rejection, and idle status; recovery has precedence over fresh-request reporting while `RecoveryPending`. On a terminal-pre-state reset evaluation, `TerminalReset` together with the applied `Idle` lifecycle shall yield `Idle`, not a repeated terminal status.

POL-09: Initialization shall set lifecycle to `Idle`, clear the active payload, set attempt to its fresh sentinel representation, and produce `NoInstruction`, `None` confirmation, and `Idle` status. Initialization is required but is not counted among the 20 nontrivial contract cases.

## Essential pilot assumptions

ASM-01: CTX-01 is responsible for presenting at most one request value at a time and for holding a fresh well-formed request stable while it accepts `WaitingInventory` or `WaitingDock`; after `Busy` or `Rejected`, any later attempt is a newly presented request. Rationale: the selected system has no request queue or withdrawal protocol.

ASM-02: CTX-01 is responsible for setting `freshness` consistently with its own business history. The system checks well-formedness and treats `Repeated` conservatively but does not reconstruct global sales history. Rationale: the seed supplies identifiers but no authoritative order-history store.

ASM-03: CTX-02 is responsible only for the stated snapshot fields and validity status; a valid snapshot need not remain unchanged after a release. Rationale: the coordinator uses a decision observation and does not reserve or decrement physical stock.

ASM-04: CTX-03 is responsible for reporting an outcome with the request and attempt it concerns. PART-04 still handles mismatched feedback by deriving `Preserve`. Rationale: explicit correlation prevents unrelated feedback from completing the active dispatch.

ASM-05: CTX-03 is responsible for interpreting each non-`NoInstruction` value as an event and not as evidence that physical execution succeeded. Rationale: no acknowledgement timing or actuator feedback is source-grounded.

ASM-06: All four monitored values are available together for an abstract evaluation step, and output/state changes from one step are observed before the next. No period, deadline, latency, or throughput is assumed. Rationale: this supplies ordering semantics without fabricating quantitative timing.

## Semantic usages and owned responsibilities

PART-01: Request Qualifier owns `AdmissionAssessment = NoRequest | Malformed | Repeated | AdmissibleFresh` and derives it jointly from request identifier, product identifier, amount, and freshness. It does not own release or lifecycle state.

PART-02: Inventory Qualifier owns two candidate-specific applications of `InventoryAssessment = NotApplicable | Sufficient | Insufficient | Unknown`. It derives `freshInventory` from MON-02 and PART-01's presented payload only when admission is `AdmissibleFresh`, and derives `recoveryInventory` from the same MON-02 and PART-07's stored payload only when pre-state lifecycle is `RecoveryPending`. It also routes the recovery payload and lifecycle-capacity context to PART-06 without ownership credit. It shall never qualify the presented payload as recovery readiness.

PART-03: Dock Qualifier owns `DockAssessment = Ready | Blocked | Unknown` and derives it jointly from MON-03 validity and disposition.

PART-04: Execution Outcome and Recovery Classifier owns `OutcomePlan = Preserve | Completed | RetryEligible | Abort`. It combines raw MON-04 with PART-07's pre-state `ActiveExecutionContext(lifecycle, activeRequestId, activeAttempt)`: `RecoveryPending` yields `RetryEligible`; a matching completion in either active state yields `Completed`; a matching failure in `ActiveFresh` yields `RetryEligible`; a matching failure in `ActiveRetry` yields `Abort`; and no report, progress, mismatch, or any other non-active context yields `Preserve`. It owns correlation and classification but no lifecycle state or output.

PART-05: Dispatch Priority Resolver owns `SelectedIntent = None | FreshIntent | RecoveryIntent` and derives it by comparing the admission assessment and PART-04's recovery-relevant plan under POL-06. Its recovery selection is a real conflict decision, not a renamed input.

PART-06: Release Arbiter owns `DispatchDecision` and `DecisionReason`. It combines selected intent, the corresponding fresh or stored payload, the corresponding candidate-specific inventory assessment, dock assessment, and lifecycle capacity to derive release, wait, reject, busy, recovery, or terminal-reset decisions. `FreshIntent` shall select only `freshInventory` and the presented payload; `RecoveryIntent` shall select only `recoveryInventory` and the stored payload. Terminal pre-state shall derive `ResetIdle` and `TerminalReset` regardless of all other inputs. PART-06 shall not recompute another owner's qualification.

PART-07: Commitment Tracker alone owns lifecycle, active request payload, active attempt, shipment-instruction generation, and transition application. It publishes pre-state execution context and recovery-qualification context using `In(...)`, consumes PART-04's `OutcomePlan` and PART-06's decision, and derives the applied lifecycle snapshot and CTRL-01. On `ResetIdle` it shall clear every active payload field, apply `Idle`, and emit `NoInstruction`. It shall not correlate raw outcomes, derive outcome classes, or recompute qualification, priority, inventory readiness, or public status.

PART-08: Confirmation Determiner owns CTRL-02. From PART-04's correlated outcome assessment and active identifier it derives `(None, None)` for both `Preserve` and `RetryEligible`, `(Shipped, activeId)` for `Completed`, and `(DispatchFailed, activeId)` for `Abort`; suppression of two distinct nonterminal/recovery classes is its owned fact, while identifier copying is uncredited.

PART-09: Dispatch Status Determiner owns CTRL-03 and derives it from both PART-06's decision reason and PART-07's applied lifecycle snapshot under POL-08. In particular, `TerminalReset` plus applied `Idle` shall derive `Idle` owner-locally, while a newly applied `TerminalCompleted` or `TerminalFailed` shall derive `Completed` or `Failed`. It shall not duplicate the release decision or commitment transition.

## Complete typed directed semantic interaction inventory

INT-01: Root MON-01 provides `RawDispatchRequest` to PART-01.

INT-02: Root MON-02 provides `InventorySnapshot` to PART-02.

INT-03: Root MON-03 provides `DockSnapshot` to PART-03.

INT-04: Root MON-04 provides raw `ExecutionOutcome` to PART-04.

INT-05: PART-01 provides `AdmissionAssessment` plus the qualified request payload to PART-02.

INT-06: PART-01 provides `AdmissionAssessment` to PART-05.

INT-07: PART-01 provides `AdmissionAssessment` plus the qualified request payload to PART-06.

INT-08: PART-02 provides `CandidateInventoryReadiness(freshInventory, recoveryInventory, recoveryPayload, lifecycleCapacity)` to PART-06. The two assessments are owned PART-02 facts; the stored payload and capacity fields are required uncredited routing from INT-14.

INT-09: PART-03 provides `DockAssessment` to PART-06.

INT-10: PART-07 provides pre-state `ActiveExecutionContext(lifecycle, activeRequestId, activeAttempt)` to PART-04.

INT-11: PART-04 provides the recovery-relevant `OutcomePlan` to PART-05; PART-05 may select recovery only for `RetryEligible`.

INT-12: PART-04 provides the complete `OutcomePlan` to PART-07 for state and terminal-transition application.

INT-13: PART-05 provides `SelectedIntent` to PART-06.

INT-14: PART-07 provides pre-state `RecoveryQualificationContext(lifecycleCapacity, storedRequestPayload)` to PART-02. PART-02 shall use the stored payload only for recovery qualification and route this context onward on INT-08 without owner credit.

INT-15: PART-06 provides `DispatchDecision` to PART-07.

INT-16: PART-07 provides CTRL-01 `ShipmentInstruction` to the root boundary for CTX-03.

INT-17: PART-04 provides the correlated `OutcomePlan` plus active request identifier to PART-08.

INT-18: PART-08 provides CTRL-02 `ShippingConfirmation` to the root boundary for CTX-01.

INT-19: PART-06 provides `DecisionReason`, including deterministic `TerminalReset` for terminal pre-state, to PART-09.

INT-20: PART-07 provides the applied `LifecycleSnapshot` to PART-09, including `Idle` after a consumed `ResetIdle` decision.

INT-21: PART-09 provides CTRL-03 `DispatchStatus` to the root boundary for CTX-01.

## Generated-support containment and delegation

SUPPORT-01: One behavior-free `DispatchCoordinatorProcess` is the only generated-support usage at depth 1 beneath the root System; PART-01 through PART-09 are contract-bearing Threads at depth 2 inside that Process. The Process has no PART identifier, domain responsibility, state, GUMBO contract, owner claim, semantic-usage credit, contract-case credit, or scenario credit.

SUPPORT-02: Seven generated-support delegation routes mirror MON-01 through MON-04 from the root System to the Process and CTRL-01 through CTRL-03 from the Process to the root. They are not INT interactions and carry no owner-local fact.

SUPPORT-03: The generated source shall therefore contain exactly 28 `PortConnection` declarations: 21 semantic connections realizing INT-01 through INT-21 and seven support delegations realizing SUPPORT-02. Raw node count is 10, comprising nine semantic Threads plus one support Process; the explicit root System usage is reported separately.

## Complete nontrivial contract partition

PARTITION-01: The 20 global cases are realized as layered owner-local partitions rather than one flat mutually exclusive predicate list. Request cases are CCASE-01, CCASE-02, CCASE-03, and CCASE-20; inventory cases are the independently applied CCASE-04 through CCASE-06 partitions; dock cases are CCASE-07 through CCASE-09; arbiter families are CCASE-10 through CCASE-14, CCASE-17, CCASE-20, and the terminal-reset subrelations allocated within CCASE-15 and CCASE-18; outcome/state families are CCASE-15, CCASE-16, CCASE-18, and CCASE-19. Each owner-local application shall be disjoint and exhaustive, and POL-08 defines observable status and later-state precedence when different owners' cases coincide. The terminal-reset subrelations do not add a twenty-first global case.

BEH-01 / CCASE-01: If a non-`NoRequest` request has either identifier `None` or amount `0`, PART-01 shall derive `Malformed`; PART-06 shall reject it, state shall not be allocated, instruction and confirmation shall be absent, and status shall be `Rejected`. Verification: bounded analysis shall enumerate every partially populated malformed field combination and observe exactly these results.

BEH-02 / CCASE-02: If a request is well formed and `Repeated`, PART-01 shall derive `Repeated`; PART-06 shall reject it without state allocation, instruction, or confirmation, and status shall be `Rejected`. Verification: bounded analysis shall cover all finite well-formed repeated requests and find no release.

BEH-03 / CCASE-03: If a request is well formed and `Fresh`, PART-01 shall derive `AdmissibleFresh` and preserve its exact payload to qualification and decision owners. Verification: local contract inspection shall show a four-field conjunction and payload equality, not an enum rename or central recomputation.

BEH-04 / CCASE-04: For each applicable candidate independently, a valid matching inventory snapshot with `availableAmount >= candidate.amount` shall yield `Sufficient` for that candidate. Fresh applicability requires `AdmissibleFresh` and the presented payload; recovery applicability requires `RecoveryPending` and the stored payload. Verification: bounded analysis shall pass every finite matching pair at and above the requested amount for both candidate sources and shall never substitute one source for the other.

BEH-05 / CCASE-05: For each applicable candidate independently, a valid matching inventory snapshot with `availableAmount < candidate.amount` shall yield `Insufficient` for that candidate. Verification: bounded analysis shall cover every finite lower-amount pair for both candidate sources and distinguish it from `Unknown` and `NotApplicable`.

BEH-06 / CCASE-06: For each applicable candidate independently, every invalid inventory snapshot and every snapshot with a nonmatching/`None` product shall yield `Unknown`, regardless of amount; an absent fresh or recovery candidate shall yield `NotApplicable`. Verification: bounded analysis shall cover invalid, mismatch, and absent-candidate branches for both sources and show none authorizes release.

BEH-07 / CCASE-07: A valid dock snapshot with disposition `Ready` shall yield dock `Ready`. Verification: local contract analysis shall require both validity and readiness.

BEH-08 / CCASE-08: A valid dock snapshot with disposition `Occupied` or `Unavailable` shall yield `Blocked`. Verification: bounded analysis shall cover both dispositions and show neither authorizes release.

BEH-09 / CCASE-09: Every invalid dock snapshot shall yield `Unknown` regardless of disposition. Verification: bounded analysis shall cover all three invalid-disposition combinations and show none authorizes release.

BEH-10 / CCASE-10: In `Idle`, an admissible fresh intent with `Sufficient` inventory and `Ready` dock shall produce `ReleaseFresh` with the exact request payload, enter `ActiveFresh`, emit no confirmation, and report `Released`. Verification: end-to-end analysis shall require all three owned qualifications and exact payload preservation.

BEH-11 / CCASE-11: In `Idle` or `RecoveryPending`, if the highest-priority selected intent exists but its corresponding candidate-specific inventory result is `Insufficient`, `Unknown`, or `NotApplicable`, no instruction or confirmation shall be issued, lifecycle shall be preserved, and status shall be `WaitingInventory`. Verification: bounded analysis shall cover all three non-authorizing results for both candidate sources, enforce POL-08 precedence, and prove that recovery never consults `freshInventory`.

BEH-12 / CCASE-12: In `Idle` or `RecoveryPending`, if the highest-priority selected intent has `Sufficient` inventory for its own payload but dock is `Blocked` or `Unknown`, no instruction or confirmation shall be issued, lifecycle shall be preserved, and status shall be `WaitingDock`. Verification: bounded analysis shall cover both dock results for fresh and recovery candidates and prove candidate-source consistency.

FAULT-04 / CCASE-13: In `ActiveFresh` or `ActiveRetry`, any concurrently presented request—including a well-formed fresh request—shall not replace the active payload or produce another release. When PART-04 derives `Preserve`, the active commitment is preserved, instruction and confirmation are absent, and status shall be `Busy`; when it derives `Completed`, `RetryEligible`, or `Abort`, CCASE-15, CCASE-16, or CCASE-18 determines the higher-precedence status while the competing request remains unaccepted. Verification: transition analysis shall prove active identity invariance for every request value and each outcome-plan branch.

BEH-14 / CCASE-14: In `RecoveryPending`, PART-04 shall derive `RetryEligible`, and PART-05 shall select `RecoveryIntent` for every admission assessment. This includes both no presented request and an admissible fresh request whose identifier, product, and amount differ from the stored commitment; readiness and CCASE-17 shall apply only to the stored active payload. Verification: owner-local priority analysis shall enumerate all four admission classes, show `RecoveryIntent` in every branch, and retain independent no-request and differently valued competitor witnesses with exact active identity retention.

BEH-15 / CCASE-15: In either active state, a raw matching `Completed` outcome shall make PART-04 derive `Completed`; PART-07 shall apply `TerminalCompleted` and issue no further shipment instruction; PART-08 shall produce `Shipped` with the active request identifier; and PART-09 shall report `Completed`. On the following terminal-pre-state evaluation, PART-06 shall derive `ResetIdle`/`TerminalReset` for every boundary valuation, PART-07 shall clear the commitment and apply `Idle`, and PART-09 shall report `Idle` without repeating confirmation. Verification: correlation and transition analysis shall cover both attempts and exhaust the terminal-pre-state reset product.

FAULT-01 / CCASE-16: In `ActiveFresh`, a raw matching `Failed` outcome shall make PART-04 derive `RetryEligible`; PART-07 shall enter `RecoveryPending` without a retry instruction in that evaluation; PART-08 shall suppress confirmation; and PART-09 shall report `Recovering`. Verification: transition analysis shall show exactly one later recovery opportunity and no `DispatchFailed` at this branch.

BEH-16 / CCASE-17: In `RecoveryPending`, after CCASE-14 resolves any fresh conflict, `RetryEligible` with `recoveryInventory = Sufficient` for the stored payload and `Ready` dock shall issue `ReleaseRetry` carrying that exact stored payload, enter `ActiveRetry`, emit no confirmation, and report `Released`. Verification: end-to-end analysis shall retain separate later-evaluation witnesses with no presented request and with a differently valued admissible fresh request; in both, only stored-payload readiness may authorize retry and fresh-payload substitution shall fail.

FAULT-02 / CCASE-18: In `ActiveRetry`, a raw matching `Failed` outcome shall make PART-04 derive `Abort`; PART-07 shall issue `Cancel` for the active request and apply `TerminalFailed`; PART-08 shall produce `DispatchFailed` with that request identifier; and PART-09 shall report `Failed`. On the following terminal-pre-state evaluation, PART-06 shall derive `ResetIdle`/`TerminalReset` for every boundary valuation, PART-07 shall clear the commitment and apply `Idle`, and PART-09 shall report `Idle` without a second retry or repeated confirmation. Verification: bounded transition analysis shall prove terminal failure, deterministic reset, and absence of every path to a second retry.

FAULT-03 / CCASE-19: In either active state, `NoReport`, `InProgress`, a mismatched request identifier, or a mismatched attempt shall make PART-04 derive `Preserve`; PART-07 shall preserve lifecycle, active payload, and attempt and produce `NoInstruction`; PART-08 shall suppress confirmation; and status shall be `Released` unless CCASE-13's competing-request `Busy` applies. Verification: bounded analysis shall enumerate all four nonterminal/mismatch classes, both request-presence branches, and prove state invariance.

BEH-18 / CCASE-20: In `Idle` with the exact `NoRequest` sentinel and no recovery plan, PART-01 shall derive `NoRequest` and the outputs shall be `NoInstruction`, `None` confirmation, and `Idle`. Verification: completeness analysis shall show this residual branch closes the finite no-candidate partition without overlapping malformed or repeated rejection.

## Risks and mitigations

RISK-01: If an unrelated or stale execution report were accepted as completion, the coordinator could falsely confirm shipment and release its commitment. PART-04's POL-05 correlation and FAULT-03 mitigate this consequence; likelihood and severity are not asserted.

RISK-02: If a new request displaced failed committed work, the original dispatch could lose identity or be retried with the wrong payload. FAULT-04, POL-06, CCASE-14, and CCASE-17 mitigate this consequence; likelihood and severity are not asserted.

RISK-03: If a first execution failure caused unbounded retry, the coordinator could monopolize dispatch indefinitely. CCASE-16 and CCASE-18 bound recovery to one retry and make terminal failure observable; no time-to-recovery claim is made.

## Scenario families

SCN-01: Fresh eligible release traces a well-formed fresh request through CCASE-03, CCASE-04, CCASE-07, and CCASE-10 to `ReleaseFresh` and `Released`, exercising PART-01, PART-02, PART-03, PART-05, PART-06, PART-07, and PART-09.

SCN-02: Request rejection traces malformed and repeated requests through CCASE-01 and CCASE-02 to `Rejected` without commitment, exercising PART-01 and the negative PART-06 path.

SCN-03: Inventory waiting traces a fresh candidate against presented-payload readiness or a recovery candidate against stored-payload readiness through CCASE-05 or CCASE-06 and CCASE-11, including simultaneous dock failure precedence, to `WaitingInventory` without release.

SCN-04: Dock waiting traces sufficient inventory through CCASE-08 or CCASE-09 and CCASE-12 to `WaitingDock` without release.

SCN-05: Protected-work conflict traces an active dispatch plus a competing fresh request through CCASE-13, preserving the active identity and reporting `Busy`.

SCN-06: Successful completion traces a raw matching completed fresh or retry outcome through PART-04 and CCASE-15 to one PART-08 `Shipped` confirmation and `Completed` status, followed by a terminal-pre-state evaluation that deterministically clears to `Idle` and emits no repeated confirmation.

SCN-07: Recoverable failure traces a raw matching first-attempt failure through PART-04 and CCASE-16, then uses two independent later-evaluation branches through CCASE-14 and CCASE-17: one with no presented request and one with a differently valued admissible fresh competitor. Both branches qualify only the stored payload, preserve its identity, and release exactly one retry when its own inventory and dock readiness pass.

SCN-08: Recovery termination and stale feedback traces nonmatching/progress feedback through PART-04 and CCASE-19 without mutation, then a raw matching retry failure through CCASE-18 to `Cancel`, `DispatchFailed`, and `Failed`, followed by deterministic terminal-pre-state reset to `Idle` with no second retry or repeated confirmation.

## Ownership and completeness audit

OWN-01: PART-01 earns semantic credit by collapsing 450 request valuations into four admission classes using identifier, product, amount, and freshness; exact payload preservation is uncredited. Inspection shall reject freshness forwarding or admission recomputation in PART-06.

OWN-02: PART-02 earns semantic credit by combining validity, product equality, and ordered amount comparison into candidate-specific fresh and recovery assessments. The same local rule shall be applied independently to the presented admissible payload and the stored recovery payload; lifecycle/payload routing is uncredited, and inspection shall reject a renamed status, a shared assessment, or recovery qualification against the presented request.

OWN-03: PART-03 earns semantic credit by collapsing six validity/disposition inputs into ready, blocked, or unknown, including two blocked dispositions and all invalid dispositions; inspection shall reject direct disposition forwarding.

OWN-04: PART-04 earns semantic credit by combining raw outcome with pre-state lifecycle, active identity, and attempt to derive preserve, completion, first-failure recovery, or retry abort. Context and identifier copying are uncredited; inspection shall reject an already-correlated two-code rename.

OWN-05: PART-05 earns semantic credit by resolving the explicit recovery-versus-fresh conflict; inspection shall reject a fixed selector or reproduction of its ranking in PART-06.

OWN-06: PART-06 earns semantic credit by combining independently owned admission, candidate-specific inventory, dock, priority, and capacity facts into a decision and reason, including the state-dependent terminal-pre-state `ResetIdle`/`TerminalReset` result. It must consume, not recompute, upstream facts and must select readiness and payload from the same intent source.

OWN-07: PART-07 earns semantic credit through state-dependent preservation, release, retry, terminal, reset, clearing, and instruction effects over prior lifecycle/payload/attempt and consumed decisions. Pre-state execution/recovery context publication and payload copying are uncredited.

OWN-08: PART-08 earns semantic credit because both `Preserve` and `RetryEligible` suppress confirmation while `Completed` and `Abort` produce distinct terminal outputs. Identifier copying is uncredited; inspection shall reject a terminal-code rename relation.

OWN-09: PART-09 earns semantic credit by combining decision reason and applied lifecycle under terminal/recovery/wait/busy precedence and by deriving `Idle` from `TerminalReset` plus the applied `Idle` snapshot. Direct forwarding of either input or an unconstrained terminal-reset status does not satisfy this allocation.

AUDIT-01: Decision/state ownership is closed: admission PART-01; fresh and recovery inventory qualification PART-02; dock PART-03; outcome correlation/recovery classification PART-04; conflict priority PART-05; release/wait/reject/reset decision PART-06; lifecycle, active payload/attempt, transition application, clearing, and instruction PART-07; confirmation PART-08; public status including terminal-reset `Idle` PART-09. No decision or state may be silently duplicated.

AUDIT-02: Output ownership is closed: PART-07 alone owns CTRL-01, PART-08 alone owns CTRL-02, and PART-09 alone owns CTRL-03. CCASE-01 through CCASE-20 cover malformed, repeated, fresh, candidate-specific readiness, waiting, release, active conflict, recovery conflict, completion/reset, first failure, stored-payload retry, terminal failure/reset, stale/progress feedback, and the residual idle path.

AUDIT-03: The semantic interaction inventory is exactly INT-01 through INT-21: four root-observation deliveries after support delegation, fourteen inter-usage connections, and three root-output deliveries before support delegation. All nine semantic usages participate in a boundary-relevant path and form one weakly connected semantic region.

AUDIT-04: The final campaign recount is exactly 9 semantic usages, 21 semantic interactions, 20 nontrivial contract cases, and 8 scenario families. The required cooperating owners include PART-01, PART-02, PART-03, PART-04, PART-05, and PART-06; the explicit recovery-versus-fresh priority conflict is owned by PART-05.

## Representation and local-contract expectations

LOCAL-01: All identifiers, product identifiers, freshness, validity, dispositions, lifecycle values, attempts, outcome results, assessments, plans, decisions, reasons, instructions, confirmations, statuses, and the five amount values shall use closed enums. `DispatchAmount = A0 | A1 | A2 | A3 | A4` shall have an explicit numeric denotation, and PART-02 shall enumerate the finite greater-than-or-equal relation rather than depend on enum ordering or an unsupported constrained integer subtype.

LOCAL-02: Port payloads shall be flat `Data` records with GUMBO-visible `attribute` fields. PART-07 shall store lifecycle, active request identifier, product identifier, amount, and attempt as separate finite state variables and initialize every sentinel explicitly.

LOCAL-03: Canonical owner-local contracts shall state OWN-01 through OWN-09 directly on their contract-bearing Threads. PART-07 shall expose only `In(...)` pre-state values on INT-10 and INT-14, making both the PART-07/PART-04 outcome path and PART-07/PART-02/PART-06 decision path state-broken rather than same-evaluation algebraic loops. PART-02 contracts shall constrain both candidate assessments; PART-06 contracts shall constrain `ResetIdle`/`TerminalReset` for every terminal pre-state; PART-09 contracts shall constrain the corresponding status to `Idle`.

LOCAL-04: Owner credit shall come only from the substantive relations in OWN-01 through OWN-09. Copied request or recovery payloads, active identifiers, lifecycle/capacity context, context records, boundary delegations, Process ports, and support routes shall not appear as owner-local facts in campaign metadata or analyzer ownership records.

## Bounded analysis and objective pass criteria

ANALYSIS-01: The independent bounded analyzer shall execute each owner relation against a separately written oracle, not a centralized reproduction of the architecture. It shall exhaust the exact finite local products, including 450 raw request valuations, the 6,400 payload/inventory pairs separately for presented-fresh and stored-recovery contexts, six dock valuations, the complete finite raw-outcome/pre-state-context product, and every terminal-pre-state combination across PART-06's other finite inputs.

ANALYSIS-02: The analyzer shall retain at least one witness for every CCASE-01 through CCASE-20 and SCN-01 through SCN-08, report zero oracle mismatches, zero local gaps, zero unintended local overlaps, and matching substantive ownership-audit records. Its watchdog is 180 seconds; timeout is failure, not deferred success.

ANALYSIS-03: Bounded end-to-end sequence checks shall cover fresh eligible release; malformed and repeated rejection; inventory and dock waiting precedence; active work plus a competing fresh request with identity preservation; matching completion on both attempts; first failure to `RecoveryPending` with no same-evaluation retry; independent stored-payload retry witnesses with no presented request and with a differently valued admissible competitor; rejection of retry whenever only the presented payload is ready; retry failure to terminal failure; deterministic completed and failed terminal-pre-state resets to `Idle` for all boundary valuations; and stale/progress/mismatched feedback with state invariance.

PASS-01: Architecture shall contain exactly one explicit root System usage, exactly one behavior-free support Process, exactly nine reachable semantic Threads realizing PART-01 through PART-09, containment depth exactly 2 beneath the root, exactly one weakly connected semantic region, exactly 21 semantic interactions, seven support delegations, and 28 total `PortConnection` declarations.

PASS-02: Every root input shall trace to MON-01 through MON-04 and every root output shall trace to CTRL-01 through CTRL-03. Context actors may appear only as non-semantic visualization context and shall not be counted as usages.

PASS-03: Canonical local contracts and the independent bounded analyzer shall agree on all OWN-01 through OWN-09 derivations and CCASE-01 through CCASE-20 results. Central recomputation, identity wrappers, pass-through padding, recovery qualification against a presented payload, missing independent recovery witnesses, unconstrained terminal reset/status, same-evaluation retry, or a second retry shall fail review.

PASS-04: Architecture-stage and final Sireum/HAMR typechecking shall pass; every endpoint shall resolve with compatible direction, port kind, and type; all required outputs shall be constrained in initialization and every applicable case.

PASS-05: Bidirectional trace coverage shall include every actionable identifier in this abstract and every significant model component, port, connection, state value, and contract clause. FACT-SRC-01 through FACT-SRC-03, FACT-METH-01, CTX-04, SUPPORT-01 through SUPPORT-03, and deferred clauses below are informational/generated/deferred rather than semantic owner obligations; every unexplained addition shall fail review.

PASS-06: Verification is satisfied only by the structural, type, trace, ownership, bounded-case, sequence, and visualization gates stated here. Validation remains the later Designer judgment that the model preserves this dispatch purpose, context, priority conflict, scenarios, and claim boundary.

## Explicitly deferred and prohibited claims

DEFER-01: Quantitative time, throughput, capacity above one active dispatch, queues, request withdrawal, fairness, starvation bounds, inventory reservation/decrement, and shipment acknowledgement timing are not specified and shall not be reported as passed.

DEFER-02: Procurement, production scheduling/control, production-step execution, material handoff, customer quotation/order confirmation, Supplier interaction, dynamic routing, physical process quality, delivery performance, industrial safety, and certification are outside scope.

DEFER-03: Code generation, application implementation, executable simulation, deployment bindings, formal proof beyond retained contract/analyzer evidence, and physical-actuator validation are not required and shall remain `not-run`.

DEFER-04: Direct Customer shipping-confirmation ownership is intentionally unresolved at the seed level; this pilot selects CTX-01 as the only confirmation recipient and makes no claim about subsequent Customer communication.

## Model-generation authorization

GEN-01: Model regeneration is authorized only against this approved revision. It shall implement the exact 10-node raw architecture, 9 semantic usages, 21 semantic interactions, 20 nontrivial contract cases, 8 scenario families, 2-level containment, 7 generated-support delegations, and 28 total connection declarations without weakening the frozen domain policy. INT-14 shall terminate at PART-02 and INT-08 shall carry the two candidate-specific readiness facts plus uncredited recovery context to PART-06.

GEN-02: The three initial realizability questions and the resumed Designer diagnostic are resolved by LOCAL-01 through LOCAL-04 and ANALYSIS-01 through ANALYSIS-03: use closed finite enums and flat records, Thread-local state with `In(...)` pre-state contexts, independently qualified presented/stored candidates, deterministic terminal reset, owner-factored exhaustive analysis, separately written oracles, complete case/scenario witnesses, and bounded sequence checks. Regenerated source-bound evidence and any Model Summary shall be produced from this revision rather than reused from the stale pre-repair baseline.
