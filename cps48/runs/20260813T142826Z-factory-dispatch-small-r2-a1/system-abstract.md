---
abstract_id: FACTORY-DISPATCH-SMALL-R2-SA-02
run_id: 20260813T142826Z-factory-dispatch-small-r2-a1
domain_seed: 20260813T004233Z-factory-dispatch-seed-v1
campaign_complexity: small
semantic_usage_count: 5
semantic_interaction_count: 13
nontrivial_contract_case_count: 12
scenario_family_count: 5
root_system_usage_count: 1
semantic_responsibility_layer_count: 1
physical_containment_depth_below_root: 2
generated_support_process_count: 1
weakly_connected_semantic_regions: 1
persistent_state_owner_count: 1
principal_decision_owner_count: 1
raw_port_connection_count: 19
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
designer_resolution_status: approved
generation_authorized: true
---

# Approved System Abstract — Bounded Finished-Product Dispatch Coordinator

## Need, purpose, and goals

NEED-01: A Manufacturer needs one bounded logical coordinator that accepts finished-product shipment requests, checks supplied product availability and dispatch readiness, prevents ambiguous reuse of a recent request identifier, issues at most one shipment-release directive per evaluation, and reports the resulting dispatch status to the Customer. The modeled need is logical dispatch coordination, not physical shipment performance.

PURPOSE-01: The coordinator will govern one active finished-product request and one most-recently-completed request record. It will qualify arrivals, classify admission and shipment-result events, assess inventory sufficiency, authorize release through one principal decision owner, and synthesize one finite Customer notice.

GOAL-01: The system shall produce a total deterministic shipment-release directive and Customer notice for every finite boundary-input and valid owner-state combination.

GOAL-02: The system shall never issue a release for an invalid, conflicting, already submitted, insufficiently stocked, or dispatch-not-ready request.

GOAL-03: The system shall retain a failed matching shipment as pending, suppress same-evaluation re-release, and permit a later no-event evaluation to retry it when valid inventory and readiness evidence permit.

GOAL-04: The system should remain exhaustively analyzable at the declared small complexity without count-only usages, interactions, cases, or scenarios.

## Evidence and claim boundary

FACT-SRC-01: The frozen seed grounds Customer, Manufacturer, finished-product storage, dispatch, product availability, shipment, and shipping-confirmation vocabulary. It does not establish reliable connection directions, confirmation ownership, an inventory consumer, dispatch policy, finite types, priority, faults, recovery, physical shipment behavior, or executable semantics.

ABS-PILOT-01: This baseline selects only the finished-product dispatch-coordinator scope. Its finite types, one-active-request bound, one-record completion cache, status-bearing evidence, inventory bands, readiness meaning, priority rules, release policy, and recovery behavior are explicitly introduced pilot abstractions rather than source facts.

METHOD-01: The architecture shall keep qualification, registry state, inventory interpretation, final release authorization, and notice composition as distinct cohesive responsibilities with complete bidirectional traceability and objective evidence.

DEFER-01: Inquiry, quotation, sales-order creation, procurement, Supplier behavior, material handling, production scheduling or control, production-line execution, packaging, routing, carrier choice, inventory mutation or accuracy, achieved shipment, delivery, timing, throughput, process quality, industrial safety, certification, deployment, code generation, execution, and formal proof are deferred and shall not be reported as passed.

## Operational context and exact boundary

CTX-01: The Customer is external. It supplies shipment-request arrivals and receives finite dispatch notices; no pricing, payment, contractual acceptance, or delivery obligation is inferred.

CTX-02: Finished-Product Storage is external to the selected coordinator but within the broader Manufacturer context. It supplies a status-bearing inventory-band snapshot; the coordinator neither measures nor changes physical inventory.

CTX-03: Dispatch Execution is external to the selected coordinator but within the broader Manufacturer context. It supplies readiness and shipment-result evidence and receives logical release directives; a directive does not establish physical shipment.

MON-01: `RequestArrivalSample` is exactly `NoArrival` or `Arrival(requestId, productId, amount, status)`, where `RequestId = {R1, R2}`, `ProductId = {AngleA, AngleB}`, `Amount = {One, Two}`, and `InputStatus = {Valid, Invalid}`.

MON-02: `InventorySample` has `angleABand`, `angleBBand`, and `status`; each `StockBand` is exactly `{Zero, One, TwoOrMore}` and `status : InputStatus`. Bands are logical availability labels without units, timing, or accuracy claims.

MON-03: `DispatchReadinessSample` has `readiness : {Ready, NotReady}` and `status : InputStatus`. `Ready` is supplied permission evidence only.

MON-04: `ShipmentResultSample` is exactly `NoResult` or `Result(requestId, outcome, status)`, where `ShipmentOutcome = {Succeeded, Failed}`.

CTRL-01: `ShipmentReleaseDirective` is exactly `NoRelease` or `Release(requestId, productId, amount)` and commands only logical submission of the selected request.

CTRL-02: `CustomerDispatchNotice` is exactly `{None, InvalidEvent, RequestAccepted, DuplicateAcknowledged, IdentifierConflict, Busy, StaleResult, InventoryEvidenceInvalid, ReadinessEvidenceInvalid, WaitingForStock, WaitingForDispatch, ReleaseIssued, ShipmentConfirmed, ShipmentFailedRetryPending}`.

BOUND-01: MON-01 through MON-04 and CTRL-01 through CTRL-02 are the complete root boundary. Supplier, production, pricing, material, transport, delivery, physical actuation, and achieved-state interfaces are out of scope.

## Logical evaluation and persistent state

SEM-01: One logical evaluation consumes the four monitored samples and pre-state, applies exactly one event case from CASE-01 through CASE-09, applies exactly one dispatch case from CASE-10 through CASE-12 to the provisional state, atomically commits state, and publishes both outputs. This defines ordering but no scheduler, latency, or physical time.

STATE-01: PART-02 exclusively owns `active : ActiveSlot`, exactly `Empty`, `Pending(request)`, or `Submitted(request)`, where request carries a valid identifier, product, and amount.

STATE-02: PART-02 exclusively owns `lastCompleted : CompletionSlot`, exactly `NoCompletion` or `Completed(request)`. Only a matching successful result may replace the one-record cache.

INIT-01: Initial state shall be `active = Empty` and `lastCompleted = NoCompletion`; initial outputs shall be `NoRelease` and `None`.

INVAR-01: If both state slots contain requests, their identifiers shall differ; a request shall not be active and most-recently completed simultaneously.

FRESH-01: A valid arrival is fresh exactly when its identifier matches neither state record. An exact identifier/product/amount match is a duplicate, reuse of a retained identifier with a different product or amount is a conflict, and an identifier forgotten after cache replacement may become fresh again.

RECOVERY-01: A valid `Failed` result matching a `Submitted` request shall return that request to `Pending`, assert an evaluation-local `recoveryHold`, and prevent same-evaluation release. A later eligible evaluation may retry it without Customer resubmission.

## Semantic usages and owner-local expectations

PART-01: Request Qualification shall total-map all 17 MON-01 values to `ArrivalFact = {NoArrivalFact, InvalidArrival, ValidArrival(request)}` using arrival presence and status. This many-to-one applicability derivation owns no state, admission, or release decision.

PART-02: Request Registry shall be the sole persistent-state owner, own CASE-01 through CASE-09, combine qualified arrival, result correlation, pre-state, and same-request registry instruction, and derive provisional state, `RegistryOutcome`, `PendingRequestView`, `DispatchCandidate`, `eventBlocked`, and `recoveryHold`. It may commit `MarkSubmitted(request)` only when paired with CTRL-01 for that same request and shall not decide release eligibility.

PART-03: Inventory Assessment shall combine a pending-request view with MON-02 and total-map to `InventoryFinding = {NoDemand, InvalidInventory, Sufficient, Insufficient}` using the selected product band and amount threshold. It owns no state or release decision.

PART-04: Dispatch Arbiter shall be the sole principal decision owner, own CASE-10 through CASE-12, combine the dispatch candidate, inventory finding, and MON-03 under PRIORITY-02, and derive CTRL-01, `DispatchDisposition`, and the matching registry instruction. It owns no persistent state.

PART-05: Customer Notice Synthesis shall combine only `RegistryOutcome` and `DispatchDisposition` under NOTICE-01 to derive CTRL-02. Its ordered resolution of potentially competing nonneutral facts is not copying, renaming, or bijective translation; it owns no state, admission, or release decision.

OWNER-01: PART-02 is the only state owner and event-case owner; PART-04 is the one principal decision owner and dispatch-case owner; PART-01, PART-03, and PART-05 each own their stated total nonidentity local derivation. No support or analyzer element may receive semantic or owner credit.

## Exact semantic interaction inventory

INT-01: MON-01 shall provide `RequestArrivalSample` from the root boundary to PART-01.

INT-02: PART-01 shall provide `ArrivalFact` to PART-02.

INT-03: MON-04 shall provide `ShipmentResultSample` from the root boundary to PART-02.

INT-04: PART-02 shall provide `PendingRequestView` to PART-03 without exposing writable state.

INT-05: MON-02 shall provide `InventorySample` from the root boundary to PART-03.

INT-06: PART-02 shall provide `DispatchCandidate` to PART-04 containing the pending request and event/recovery blockers but no preselected release decision.

INT-07: PART-03 shall provide `InventoryFinding` to PART-04.

INT-08: MON-03 shall provide `DispatchReadinessSample` from the root boundary to PART-04.

INT-09: PART-04 shall provide `RegistryInstruction = {NoStateInstruction, MarkSubmitted(request)}` to PART-02 for atomic commitment.

INT-10: PART-04 shall provide `ShipmentReleaseDirective` to CTRL-01 at the root boundary.

INT-11: PART-02 shall provide `RegistryOutcome` to PART-05.

INT-12: PART-04 shall provide `DispatchDisposition` to PART-05.

INT-13: PART-05 shall provide `CustomerDispatchNotice` to CTRL-02 at the root boundary.

INT-AUDIT-01: INT-01 through INT-13 are exactly thirteen typed directed semantic interactions: four boundary-input flows, seven inter-usage flows, and two boundary-output flows. The deleted initial qualification-to-notice flow has no resolved counterpart because its invalid-arrival information is already represented by PART-02's `InvalidEvent` outcome.

## Total local equations and priority

QUAL-01: PART-01 shall emit `NoArrivalFact` for `NoArrival`, `InvalidArrival` for every present invalid-status arrival, and `ValidArrival(request)` for every present valid-status arrival.

STOCK-01: With a pending request and valid inventory, PART-03 shall select that product's band and derive `Sufficient` exactly for amount `One` with band `One` or `TwoOrMore`, or amount `Two` with band `TwoOrMore`; it shall otherwise derive `Insufficient`, derive `InvalidInventory` for relevant invalid status, and derive `NoDemand` without a pending request.

PRIORITY-01: PART-02 shall select the first true event guard in this order: invalid or simultaneous present events; matching successful result; matching failed result; stale result; no event; exact duplicate; conflicting retained identifier; fresh arrival with empty active slot; fresh arrival with occupied active slot.

PRIORITY-02: PART-04 shall select the first true dispatch guard in this order: no pending request or already submitted; event block; recovery hold; invalid inventory; invalid readiness; insufficient stock; valid `NotReady`; otherwise authorize.

NOTICE-01: PART-05 shall select the first available notice in this order: `InvalidEvent`, `IdentifierConflict`, `StaleResult`, `Busy`, `ShipmentFailedRetryPending`, `DuplicateAcknowledged`, `InventoryEvidenceInvalid`, `ReadinessEvidenceInvalid`, `WaitingForStock`, `WaitingForDispatch`, `ReleaseIssued`, `ShipmentConfirmed`, `RequestAccepted`, then `None`.

COHERENCE-01: CTRL-01 shall be `Release(request)` if and only if PART-04 emits `MarkSubmitted(request)`, and committed active state shall then be `Submitted(request)`; every other evaluation shall emit `NoRelease` and `NoStateInstruction`.

TYPE-01: `RegistryOutcome` is exactly `{NoRegistryNotice, InvalidEvent, ShipmentConfirmed, ShipmentFailedRetryPending, StaleResult, DuplicateAcknowledged, IdentifierConflict, RequestAccepted, Busy}`; event and recovery blockers remain separate Boolean facts.

TYPE-02: `DispatchDisposition` is exactly `{NoDispatchDemand, EventBlocked, RecoveryHeld, InventoryInvalid, ReadinessInvalid, WaitingStock, WaitingDispatch, ReleaseIssued}`.

## Exactly twelve nontrivial contract cases

CASE-01: If arrival and result are both present, or either present sample has invalid status, PART-02 shall preserve state, set `eventBlocked = true`, clear `recoveryHold`, and derive `InvalidEvent`.

CASE-02: Otherwise, a valid `Succeeded` result matching a `Submitted` request shall provisionally clear active, cache that request, clear both holds, and derive `ShipmentConfirmed`.

CASE-03: Otherwise, a valid `Failed` result matching a `Submitted` request shall provisionally return it to `Pending`, preserve completion history, set only `recoveryHold`, and derive `ShipmentFailedRetryPending`.

CASE-04: Otherwise, any valid present result shall preserve state, clear both holds, and derive `StaleResult`.

CASE-05: Otherwise, with no arrival and no result, PART-02 shall preserve state, clear both holds, and derive `NoRegistryNotice`.

CASE-06: Otherwise, a valid arrival exactly matching an active or cached request shall preserve state, clear both holds, and derive `DuplicateAcknowledged`.

CASE-07: Otherwise, a valid arrival reusing an active or cached identifier with different product or amount shall preserve state, set only `eventBlocked`, and derive `IdentifierConflict`.

CASE-08: Otherwise, a fresh valid arrival with `active = Empty` shall provisionally set it to `Pending`, preserve completion history, clear both holds, and derive `RequestAccepted`.

CASE-09: Otherwise, a fresh valid arrival while active is occupied shall preserve state, clear both holds, and derive `Busy`; existing active work is nonpreemptive.

CASE-10: After the event case, if active is `Empty` or `Submitted`, PART-04 shall emit `NoRelease`, `NoStateInstruction`, and `NoDispatchDemand`.

CASE-11: Otherwise active is `Pending` and a PRIORITY-02 blocker holds; PART-04 shall emit `NoRelease`, `NoStateInstruction`, and the first applicable disposition in `{EventBlocked, RecoveryHeld, InventoryInvalid, ReadinessInvalid, WaitingStock, WaitingDispatch}`.

CASE-12: Otherwise active is `Pending`, no event or recovery hold applies, stock is valid and sufficient, and readiness is valid and `Ready`; PART-04 shall emit the matching `Release(request)`, `MarkSubmitted(request)`, and `ReleaseIssued`.

CASE-AUDIT-01: CASE-01 through CASE-09 are a total mutually exclusive event partition after priority, and CASE-10 through CASE-12 are a total mutually exclusive dispatch partition over provisional state. Each evaluation selects one case from each partition; these twelve clauses are the complete counted nontrivial contract-case inventory.

## Required behavior, faults, and evidence

BEH-01: Totality verification shall use contract inspection and bounded analysis; passing requires one event case, one dispatch case, fully constrained next state and outputs, zero gaps, zero effective overlaps, zero state mismatches, zero output mismatches, and zero coherence violations.

BEH-02: A fresh request with empty active state, sufficient valid inventory, and valid `Ready` evidence shall select CASE-08 then CASE-12 and release the exact identifier/product/amount once; a submitted snapshot shall never release again.

BEH-03: STOCK-01 shall hold for both products, both amounts, and all three stock bands; amount `Two` shall release only at `TwoOrMore` when every other guard permits.

BEH-04: A fresh arrival while active is occupied shall not preempt existing work; an exact duplicate shall not create a second active record, and a conflicting retained identifier shall block release.

RISK-01: Invalid, simultaneous, or conflicting event evidence could otherwise admit ambiguous work or release a pending request in an untrustworthy evaluation; CASE-01 and CASE-07 shall preserve state, block release, and report `InvalidEvent` or `IdentifierConflict`.

RISK-02: Invalid inventory or readiness could otherwise authorize release without trustworthy evidence; with a pending request, CASE-11 shall issue `NoRelease`, and inventory-invalid notice priority shall dominate readiness-invalid when both are invalid.

RISK-03: Treating a failed result as completion or immediately resubmitting could lose or duplicate work; CASE-03 and `recoveryHold` shall preserve the request, prevent same-evaluation release, and permit a later eligible retry.

## Exactly five scenario families

SCN-01: Nominal release and confirmation shall admit and release valid fresh `R1/AngleA/One` with valid AngleA band `One` and valid `Ready`, commit `Submitted`, then consume a later matching valid success to clear active, cache the request, and report `ShipmentConfirmed`.

SCN-02: Inventory boundary shall admit `R1/AngleB/Two`, wait when AngleB band is `One`, then release that request on a later no-event evaluation when the band is `TwoOrMore` and readiness is valid `Ready`.

SCN-03: Capacity and identifier boundary shall independently witness an exact R1 duplicate, conflicting R1 payload, and fresh R2 while R1 is pending; no witness may add or preempt active state.

SCN-04: Invalid/fault behavior shall witness invalid arrival, simultaneous arrival/result, invalid inventory, and invalid readiness with a pending request; each applicable witness shall preserve recoverability and emit no release.

SCN-05: Failed-result recovery shall return submitted R1 to pending with no same-evaluation release, re-release R1 in a later eligible no-event evaluation, and complete it after a later matching success without Customer resubmission.

SCN-AUDIT-01: SCN-01 through SCN-05 are exactly five distinct families covering nominal, inventory boundary, capacity/identity boundary, invalid/fault, and recovery behavior.

## Assumptions and constraints

ASM-01: CTX-01 is responsible for present-request validity status and for treating R1 and R2 as bounded correlation tokens; the system neither authenticates the Customer nor guarantees global uniqueness.

ASM-02: CTX-02 is responsible for one internally coherent inventory snapshot and status per evaluation; the system does not reserve, decrement, reconcile, or verify stock.

ASM-03: CTX-03 is responsible for readiness and result status. `Succeeded` means only that Dispatch Execution reports completion for correlation and notice purposes, not that delivery occurred.

ASM-04: CTX-03 shall not send a valid result for a request it never received, but unmatched valid results remain total through CASE-04.

ASM-05: Independent external entities may present arrival and result simultaneously; the selected small policy classifies that combination as `InvalidEvent` for an unambiguous state transition.

CONSTRAINT-01: Model-visible behavioral domains shall remain finite and exactly preserve the declared boundary, state, and derived types. Numeric inventory, time, throughput, distance, price, and physical shipment quantity shall not become behavioral premises.

CONSTRAINT-02: Active capacity and completion-cache capacity are each exactly one as pilot analysis bounds, not real-Manufacturer scale claims.

## Architecture, generated support, trace, and analysis obligations

STRUCT-01: The final architecture metrics are exactly five responsibility-bearing semantic usages, thirteen typed directed semantic interactions, twelve nontrivial contract cases, five scenario families, one explicit System root, one semantic responsibility layer, physical containment depth two below the root, one weakly connected semantic region, one persistent-state owner, and one principal decision owner.

STRUCT-02: Physical containment shall be `System -> generated-support Process -> five semantic Threads`. The one behavior-free Process is required tool support, receives no semantic-usage or owner credit, introduces no domain behavior, and does not create a second semantic layer.

SUPPORT-01: The permitted realization has exactly nineteen raw `PortConnection` declarations with this exact semantic-to-raw multiplicity: `INT-01=2`, `INT-02=1`, `INT-03=2`, `INT-04=1`, `INT-05=2`, `INT-06=1`, `INT-07=1`, `INT-08=2`, `INT-09=1`, `INT-10=2`, `INT-11=1`, `INT-12=1`, and `INT-13=2`. Thus each of the six boundary interactions maps to two delegation declarations across System/Process and Process/Thread, and each of the seven inter-usage interactions maps to one declaration inside the Process. All twelve delegation declarations shall carry `@generated-support` and the resolved INT identifier; no other support connection is authorized without renewed Designer review.

SUPPORT-02: Root and support containers, context depictions, finite type declarations, initialization, invariants, analyzer fixtures, and visualization-only nodes do not count as semantic usages, interactions, cases, scenarios, or owners and shall not alter any semantic endpoint, direction, type, or meaning.

TRACE-01: Every actionable abstract identifier shall trace to retained source, an owner-local contract, a bounded check, or a scenario witness. Every significant model element shall trace back to one of these unique identifiers or carry a specific `@generated-support <reason>` justification; missing coverage and unexplained additions fail acceptance.

ANALYSIS-01: The bounded analyzer shall enumerate exactly 89 valid owner states and `17 * 18 * 4 * 9 = 11,016` boundary-input combinations for exactly 980,424 snapshots. The 89 states are nine empty-active/cache states plus eighty invariant-satisfying active/cache combinations.

ANALYSIS-02: A reference evaluator independent of production owner predicates shall be compared with separate owner-local Registry, Inventory, Arbiter, and Notice evaluators for every snapshot. Required results are zero partition gaps, effective overlaps, state mismatches, output mismatches, and coherence violations, with at least one witness for each CASE-01 through CASE-12.

ANALYSIS-03: The analyzer shall execute SCN-01 through SCN-05 and check INIT-01, INVAR-01, FRESH-01, RECOVERY-01, PRIORITY-01, PRIORITY-02, NOTICE-01, COHERENCE-01, and OWNER-01. It shall not reside in the semantic architecture, act as an oracle by calling retained owner predicates, reproduce a production decision owner, receive semantic credit, or be cited as formal proof.

## Acceptance baseline

PASS-01: Structural acceptance requires the exact `5/13/12/5` tuple and exact root, semantic-layer, physical-depth, weak-region, state-owner, principal-owner, support-process, and raw-connection metrics in STRUCT-01 through SUPPORT-01, with no padding or identity-only counted item.

PASS-02: Local-contract acceptance requires PART-01 through PART-05 to expose their distinct total owner-local derivations, the two case partitions to be total and exclusive after priority, all state and output fields to be constrained, and release/instruction/committed-state coherence to hold for the same request.

PASS-03: End-to-end behavioral acceptance requires successful bounded evidence for all 980,424 snapshots, every case witness, and all five ordered scenario families, including nominal, boundary, invalid/fault, and recovery behavior.

PASS-04: Verification acceptance requires architecture-stage and final `hamr sysml tipe` success, compatible connected endpoints, exact 13-to-19 semantic/raw reporting, complete trace coverage, ownership-audit agreement, source-hash binding, and successful analyzer status. Any check not run shall remain `not-run`.

PASS-05: Designer validation shall separately confirm fidelity to the selected dispatch purpose, finite boundary, assumptions, source limitations, and deferred claims; mechanical conformance alone is insufficient.

PASS-06: Visualization acceptance requires exactly one named `system-overview`, bound to the retained source revision, showing the root, all five semantic usages, all six boundary quantities, the sole state owner, the sole principal decision owner, and all thirteen directed semantic interactions while excluding support and context from semantic credit.

AUDIT-FINAL-01: The approved generation target is exactly `5/13/12/5`, one explicit System root, one behavior-free generated-support Process, one semantic responsibility layer, physical depth two, one weak semantic region, one state owner, one principal decision owner, and nineteen raw connection declarations.

AUDIT-FINAL-02: The initial direct `ArrivalFact` interaction from PART-01 to PART-05 is removed because QUAL-01 plus CASE-01 already makes every invalid present arrival reach PART-05 as `RegistryOutcome.InvalidEvent`; removing it changes no boundary, state, case, priority, output, or scenario behavior.
