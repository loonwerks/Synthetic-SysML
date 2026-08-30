---
abstract_id: SA-FD-01
seed_id: 20260813T004233Z-factory-dispatch-seed-v1
seed_version: 1
status: approved-final
baseline_revision: 2
complexity: hard
executable_profile: not-declared
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
selected_semantic_usages: 15
selected_semantic_interactions: 31
selected_nontrivial_contract_cases: 30
selected_scenario_families: 11
node_count: [15, 15]
edge_count: [31, 31]
containment_depth: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_multiple_state_or_decision_owners: true
requires_priority: true
requires_fault_propagation: true
requires_recovery: true
requires_composition: true
---

# Factory order-to-dispatch coordination

## Evidence classes and claim boundary

BASIS-01: [Seed-grounded fact] The frozen source basis supplies only the recognizable Customer, Manufacturer, Supplier, sales, procurement, production scheduling, production, storage, dispatch, inquiry, quotation, order, material, product, shipment, and confirmation vocabulary. It supplies neither an executable policy nor validated connection directions.

METHOD-01: [Handbook-derived engineering control] This abstract defines the need, boundary, external responsibility, alternatives, finite behavior, faults, recovery, traceability, verification, and validation limits before SysML realization; these controls are methodology, not facts about an actual factory.

PILOT-01: [Pilot abstraction] One evaluation consumes one finite snapshot and produces one deterministic supervisory result. Finite bands, retained states, owner-local classifications, proposal relations, strict priority, event freshness, and recovery rules are introduced assumptions, not seed claims.

ARCH-01: [Selected architecture] The final baseline contains three semantic boundary-classification usages, one behavior-free generated-support capability splitter, three further qualification or assessment usages, two retained-state usages, four eligibility usages, one strict-priority arbiter, one status derivation usage, and one atomic public composer. Exactly 15 usages receive semantic credit: `PART-01`, `PART-02`, and `PART-04` through `PART-16`; `PART-03` receives generated-support credit only.

DEFER-01: [Deferred claim] This run does not claim throughput, delivery performance, inventory accuracy, physical process quality, industrial safety, commercial correctness, executable behavior, deployment fitness, certification, or production readiness.

## Synopsis, need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A Manufacturer-level coordinator is needed to turn one bounded stream of customer requests, inventory observations, capability availability, and execution outcomes into an unambiguous next commercial or fulfillment action without allowing a fault or recovery condition to be hidden by ordinary work.

PURPOSE-01: [Pilot abstraction] For each evaluation, the system shall classify the boundary snapshot, progress at most one retained order lifecycle, maintain a separate recovery lifecycle, decide eligible quotation, procurement, production, and dispatch work, choose at most one action by strict priority, and publish one atomic result.

GOAL-01: [Pilot abstraction] The system shall deterministically cover every admitted finite snapshot and prior-state pair.

GOAL-02: [Pilot abstraction] Dispatch of an available product shall take priority over simultaneous production, procurement, or quotation proposals, while fault or recovery inhibition shall take priority over every ordinary action.

GOAL-03: [Pilot abstraction] A failed or phase-inconsistent execution outcome shall propagate in the same evaluation through recovery, eligibility inhibition, action selection, status, and the public result.

GOAL-04: [Pilot abstraction] Recovery shall require two distinct fresh events: `RESET` to enter recovery and a later `VERIFY_OK` to release it.

GOAL-05: [Selected architecture] Action, selected cause, public mode, order lifecycle, recovery lifecycle, and current-request disposition shall be composed into one indivisible flat `PublicResult` value.

## Operational context and selected boundary

CTX-01: [Selected boundary] The modeled system is a supervisory coordinator inside the Manufacturer. Customer communication, Supplier response, Storage observation, production execution, dispatch execution, and recovery authorization are outside this system.

CTX-CUST-01: [Seed-grounded entity with pilot responsibility] The Customer channel supplies at most one `FreshRequest` per evaluation, consumes the request disposition in `PublicResult`, and is responsible for retrying a valid request reported as deferred.

CTX-STOR-01: [Seed-grounded capability with pilot responsibility] The external Storage observer supplies one `InventorySnapshot` and is responsible only for the declared finite material and product bands, not continuous quantity accuracy.

CTX-SUP-01: [Seed-grounded entity with pilot responsibility] The Supplier-facing source supplies `supplierAvailable`; `true` means only that a material-order action can currently be accepted.

CTX-PROD-01: [Seed-grounded capability with pilot responsibility] The production executor supplies `productionAvailable`, accepts `RELEASE_PRODUCTION`, and later reports a fresh tagged outcome; angle-production steps and physical completion are outside the model.

CTX-DISP-01: [Seed-grounded capability with pilot responsibility] The dispatch executor supplies `dispatchAvailable`, accepts `RELEASE_DISPATCH`, and later reports a fresh tagged outcome; shipment execution and customer receipt remain outside the model.

CTX-EXEC-01: [Pilot abstraction] The execution-outcome channel supplies either no event or exactly one fresh tagged `ExecutionOutcome` per evaluation and is responsible for non-replay.

CTX-REC-01: [Pilot abstraction] A Manufacturer recovery authority supplies `RecoveryEvent` and is responsible for issuing `RESET` and `VERIFY_OK` as distinct fresh events only after its external diagnosis.

CTX-PUB-01: [Selected boundary] Manufacturer command/status recipients consume one `PublicResult`; acceptance or execution of its command is not guaranteed.

MON-REQ-01: [Pilot abstraction] Root input `freshRequest` has type `FreshRequest={NONE,INVALID,VALID_STANDARD,VALID_EXPEDITE}` and comes from `CTX-CUST-01`. The valid values distinguish reported service class only.

MON-INV-01: [Pilot abstraction] Root input `inventorySnapshot=(materialBand,productBand)` comes from `CTX-STOR-01`, where `MaterialBand={INVALID,SHORT,READY}` and `ProductBand={INVALID,ABSENT,AVAILABLE}`; the bands carry no unit, numeric threshold, precision, or persistence claim.

MON-CAP-01: [Pilot abstraction] Root input `capabilitySnapshot=(supplierAvailable,productionAvailable,dispatchAvailable)` carries independent Booleans from `CTX-SUP-01`, `CTX-PROD-01`, and `CTX-DISP-01`. Availability means command acceptance only, never successful execution.

MON-OUT-01: [Pilot abstraction] Root input `executionOutcome={NONE,QUOTE_OK,MATERIAL_OK,PRODUCTION_OK,DISPATCH_OK,FAILED}` comes from `CTX-EXEC-01`; every non-`NONE` value is a fresh single-evaluation event.

MON-REC-01: [Pilot abstraction] Root input `recoveryEvent={NONE,RESET,VERIFY_OK}` comes from `CTX-REC-01`; every non-`NONE` value is a fresh single-evaluation event.

CTRL-PUB-01: [Selected architecture] The sole controlled root output is the atomic flat record `PublicResult=(action,selectedCause,mode,orderState,recoveryState,requestDisposition)`, delivered to `CTX-PUB-01`.

TYPE-ACT-01: [Pilot abstraction] `Action={HOLD,ISSUE_QUOTE,ORDER_MATERIAL,RELEASE_PRODUCTION,RELEASE_DISPATCH}`.

TYPE-CAUSE-01: [Pilot abstraction] `SelectedCause={FAULT_OR_RECOVERY,DISPATCH_PRIORITY,PRODUCTION_PRIORITY,PROCUREMENT_PRIORITY,QUOTE_AVAILABLE,NO_ELIGIBLE_WORK}`.

TYPE-MODE-01: [Pilot abstraction] `Mode={HOLDING,QUOTING,PROCURING,PRODUCING,DISPATCHING,FAULT}`.

TYPE-STATE-01: [Pilot abstraction] `OrderState={IDLE,OPEN}` is retained by the order-lifecycle owner, and `RecoveryState={HEALTHY,LATCHED,RECOVERING}` is retained independently by the recovery owner.

TYPE-DISP-01: [Pilot abstraction] `RequestDisposition={NO_REQUEST,REJECTED,QUOTED,DEFERRED}` describes only the current `FreshRequest`.

TYPE-BOUND-01: [Pilot abstraction] `RequestBoundaryFacts=(freshRequest,requestPresent)`, `MaterialBoundaryFacts=(materialBand,materialUsable)`, `ProductBoundaryFacts=(productBand,productUsable)`, and `OutcomeBoundaryFacts=(executionOutcome,eventClass)` are flat finite records. `OutcomeEventClass={NO_EVENT,FAILURE,SUCCESS}` preserves the exact success tag through `executionOutcome` for phase checking.

TYPE-LOCAL-01: [Selected mapping] `StatusRecord` is a flat `Data` record with attribute fields `mode`, `selectedCause`, `orderState`, and `recoveryState`. `PublicResult` is a separate flat `Data` record with attribute fields `action`, `selectedCause`, `mode`, `orderState`, `recoveryState`, and `requestDisposition`; it shall not contain an inspected nested `StatusRecord` part.

ASM-FRESH-01: [Pilot abstraction] `CTX-CUST-01`, `CTX-EXEC-01`, and `CTX-REC-01` are responsible for freshness, preventing replayed requests, outcomes, resets, or verifications from changing state twice.

ASM-ORDER-01: [Pilot abstraction] At most one accepted order is represented. Quote success opens it and dispatch success closes it; a concurrently presented valid request is deferred unless `ISSUE_QUOTE` wins, and the Customer must retry it.

ASM-STOCK-01: [Pilot abstraction] Material and product bands are independent aggregate predicates, so product may be available while material is short or ready; no quantity conservation is claimed.

ASM-STEP-01: [Pilot abstraction] One evaluation is a deterministic logical step with no claimed duration. A fresh outcome refers to an earlier accepted action, and the newly selected action is only a command request.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, `OrderState=IDLE`, `RecoveryState=HEALTHY`, and the public value is `(HOLD,NO_ELIGIBLE_WORK,HOLDING,IDLE,HEALTHY,NO_REQUEST)`; this is deterministic initialization, not a production safe-start claim.

## Hazards and required mitigations

RISK-01: [Pilot risk] A failed or lifecycle-inconsistent success accepted as progress could permit new work after order-state trust is lost; `FAULT-01` requires immediate latch and inhibition.

RISK-02: [Pilot risk] Ordinary eligibility bypassing recovery could issue work during incomplete recovery; `FAULT-02` requires one closed gate and emergency dominance.

RISK-03: [Pilot risk] Inconsistent resolution of simultaneous dispatch and upstream proposals could leave available product undispatched while more work starts; `BEH-05` requires one strict priority order.

RISK-04: [Pilot risk] Releasing on `RESET` alone could report healthy without separate verification; `BEH-02` requires a later fresh `VERIFY_OK`.

FAULT-01: [Pilot requirement] `FAILED` or any phase-inconsistent success shall produce, in the same evaluation, a fault-qualified outcome, next recovery `LATCHED`, closed recovery gate, no ordinary proposal, action `HOLD`, mode `FAULT`, cause `FAULT_OR_RECOVERY`, and a matching atomic result. Local-contract inspection and exhaustive one-step analysis pass only if the chain holds from both prior order states and all three prior recovery states with no stale public field.

FAULT-02: [Pilot requirement] While next recovery is `LATCHED` or `RECOVERING`, all four eligibility owners shall derive `NOT_PROPOSED` and arbitration shall derive `HOLD` regardless of request, inventory, capability, or ordinary success inputs. Exhaustive analysis passes only if every blocked-state combination is insensitive to all non-recovery inputs.

## Selected usages and ownership audit

PART-01: [Selected architecture; semantic usage] `customer_request_acquisition` owns the many-to-one presence classification: `NONE` versus present. It outputs `RequestBoundaryFacts`, shall not decide validity or expedited service, and receives semantic credit for this owner-local classification rather than forwarding.

PART-02: [Selected architecture; semantic usage] `inventory_acquisition` owns invalid-versus-usable classification independently for the material and product bands. It outputs `MaterialBoundaryFacts` and `ProductBoundaryFacts`, shall not infer shortage, readiness, or availability, and receives semantic credit for these owner-local classifications rather than field splitting.

PART-03: [Generated support usage; no semantic credit] `capability_acquisition` is a behavior-free splitter for the root capability record. It routes the three independent Booleans unchanged, owns no fact or decision, and shall carry an `@generated-support` rationale.

PART-04: [Selected architecture; semantic usage] `execution_outcome_acquisition` owns the many-to-one `NO_EVENT`/`FAILURE`/`SUCCESS` classification and retains the exact outcome tag in `OutcomeBoundaryFacts`. It shall not determine phase consistency.

PART-05: [Selected architecture; semantic usage] `request_qualification` consumes `RequestBoundaryFacts`, preserves the received `requestPresent`, and derives `requestValid` and `requestExpedited`; it shall not recompute presence from `FreshRequest`.

PART-06: [Selected architecture; semantic usage] `stock_assessment` consumes the two boundary records, preserves received usability, and derives `materialShortage`, `materialReady`, and `productAvailable`; it shall not recompute usability from either band.

PART-07: [Selected architecture; semantic usage] `outcome_qualification` combines prior `OrderState`, received event class, and exact outcome tag to derive `QualifiedOutcome={NO_PROGRESS,QUOTE_ACCEPTED,MATERIAL_CONFIRMED,PRODUCTION_COMPLETED,DISPATCH_COMPLETED,FAULT}`. It shall not reclassify `NONE` or `FAILED` independently of the received event class.

PART-08: [Selected architecture; semantic usage] `recovery_control` is the sole retained `RecoveryState` owner and derives next recovery, `RecoveryGate={OPEN,CLOSED}`, and `EmergencyState={INACTIVE,ACTIVE}`, with fault trigger priority over recovery events.

PART-09: [Selected architecture; semantic usage] `order_lifecycle` is the sole retained `OrderState` owner. Its `prior_order_state` output exposes `In(orderState)` solely to `PART-07`; its `order_state` output exposes the current derived state after the selected transition to downstream same-evaluation consumers.

PART-10: [Selected architecture; semantic usage] `quotation_eligibility` derives one owner-local `ProposalState={PROPOSED,NOT_PROPOSED}` from request facts, derived order state, and recovery gate.

PART-11: [Selected architecture; semantic usage] `procurement_eligibility` derives one owner-local proposal from open order state, usable material shortage, Supplier availability, and recovery gate.

PART-12: [Selected architecture; semantic usage] `production_eligibility` derives one owner-local proposal from open order state, usable material readiness, production availability, and recovery gate.

PART-13: [Selected architecture; semantic usage] `dispatch_eligibility` derives one owner-local proposal from open order state, usable product availability, dispatch availability, and recovery gate.

PART-14: [Selected architecture; semantic usage] `action_arbitration` is the sole action owner and selects exactly one action by emergency, dispatch, production, procurement, quotation, then hold priority without recomputing upstream facts.

PART-15: [Selected architecture; semantic usage] `status_derivation` combines selected action and derived recovery state to derive `Mode`, `SelectedCause`, and one flat `StatusRecord`; it has no retained or mirror status state.

PART-16: [Selected architecture; semantic usage] `public_composition` combines request class, selected action, and received status fields to derive current-request disposition and one flat atomic `PublicResult`; it shall not recompute arbitration or either retained state.

OWN-AUD-01: [Ownership audit] Retained state is split only between `PART-08` and `PART-09`; action belongs only to `PART-14`; acquisition classifications belong to `PART-01`, `PART-02`, and `PART-04`; remaining request, stock, outcome, eligibility, status/cause, and disposition facts belong respectively to `PART-05`, `PART-06`, `PART-07`, `PART-10` through `PART-13`, `PART-15`, and `PART-16`.

OWN-AUD-02: [Ownership audit] Every semantic usage derives at least one behaviorally meaningful owner-local fact from assigned inputs. `PART-03` and unchanged capability routes receive generated-support credit only; no copier, renamer, bundler, splitter, or router receives owner or semantic-usage credit.

## Complete typed directed interaction inventory

INT-01: [Semantic interaction] `customer_request_acquisition.request_boundary_facts` shall provide `RequestBoundaryFacts` to `request_qualification.request_boundary_facts`.

INT-02: [Semantic interaction] `inventory_acquisition.material_boundary_facts` shall provide `MaterialBoundaryFacts` to `stock_assessment.material_boundary_facts`.

INT-03: [Semantic interaction] `inventory_acquisition.product_boundary_facts` shall provide `ProductBoundaryFacts` to `stock_assessment.product_boundary_facts`.

INT-04: [Generated support route; no semantic credit] `capability_acquisition.supplier_available` shall route `Boolean` unchanged to `procurement_eligibility.supplier_available`.

INT-05: [Generated support route; no semantic credit] `capability_acquisition.production_available` shall route `Boolean` unchanged to `production_eligibility.production_available`.

INT-06: [Generated support route; no semantic credit] `capability_acquisition.dispatch_available` shall route `Boolean` unchanged to `dispatch_eligibility.dispatch_available`.

INT-07: [Semantic interaction] `execution_outcome_acquisition.outcome_boundary_facts` shall provide `OutcomeBoundaryFacts` to `outcome_qualification.outcome_boundary_facts`.

INT-08: [Semantic interaction] `request_qualification.request_facts` shall provide `RequestFacts` to `quotation_eligibility.request_facts`.

INT-09: [Semantic interaction] `request_qualification.request_facts` shall provide `RequestFacts` to `public_composition.request_facts`.

INT-10: [Semantic interaction] `stock_assessment.stock_facts` shall provide `StockFacts` to `procurement_eligibility.stock_facts`.

INT-11: [Semantic interaction] `stock_assessment.stock_facts` shall provide `StockFacts` to `production_eligibility.stock_facts`.

INT-12: [Semantic interaction] `stock_assessment.stock_facts` shall provide `StockFacts` to `dispatch_eligibility.stock_facts`.

INT-13: [Semantic interaction] `outcome_qualification.qualified_outcome` shall provide `QualifiedOutcome` to `recovery_control.qualified_outcome`.

INT-14: [Semantic interaction] `outcome_qualification.qualified_outcome` shall provide `QualifiedOutcome` to `order_lifecycle.qualified_outcome`.

INT-15: [Semantic interaction] `recovery_control.recovery_gate` shall provide `RecoveryGate` to `order_lifecycle.recovery_gate`.

INT-16: [Semantic interaction] `recovery_control.recovery_gate` shall provide `RecoveryGate` to `quotation_eligibility.recovery_gate`.

INT-17: [Semantic interaction] `recovery_control.recovery_gate` shall provide `RecoveryGate` to `procurement_eligibility.recovery_gate`.

INT-18: [Semantic interaction] `recovery_control.recovery_gate` shall provide `RecoveryGate` to `production_eligibility.recovery_gate`.

INT-19: [Semantic interaction] `recovery_control.recovery_gate` shall provide `RecoveryGate` to `dispatch_eligibility.recovery_gate`.

INT-20: [Semantic interaction] `recovery_control.emergency_state` shall provide `EmergencyState` to `action_arbitration.emergency_state`.

INT-21: [Semantic interaction] `recovery_control.recovery_state` shall provide derived `RecoveryState` to `status_derivation.recovery_state`.

INT-22: [Semantic interaction] `order_lifecycle.prior_order_state` shall provide retained prior `OrderState` to `outcome_qualification.prior_order_state`; the local state contract shall constrain this port to `In(orderState)`.

INT-23: [Semantic interaction] `order_lifecycle.order_state` shall provide derived next `OrderState` to `quotation_eligibility.order_state`.

INT-24: [Semantic interaction] `order_lifecycle.order_state` shall provide derived next `OrderState` to `procurement_eligibility.order_state`.

INT-25: [Semantic interaction] `order_lifecycle.order_state` shall provide derived next `OrderState` to `production_eligibility.order_state`.

INT-26: [Semantic interaction] `order_lifecycle.order_state` shall provide derived next `OrderState` to `dispatch_eligibility.order_state`.

INT-27: [Semantic interaction] `order_lifecycle.order_state` shall provide derived next `OrderState` to `status_derivation.order_state`.

INT-28: [Semantic interaction] `quotation_eligibility.proposal` shall provide `ProposalState` to `action_arbitration.quotation_proposal`.

INT-29: [Semantic interaction] `procurement_eligibility.proposal` shall provide `ProposalState` to `action_arbitration.procurement_proposal`.

INT-30: [Semantic interaction] `production_eligibility.proposal` shall provide `ProposalState` to `action_arbitration.production_proposal`.

INT-31: [Semantic interaction] `dispatch_eligibility.proposal` shall provide `ProposalState` to `action_arbitration.dispatch_proposal`.

INT-32: [Semantic interaction] `action_arbitration.selected_action` shall provide `Action` to `status_derivation.selected_action`.

INT-33: [Semantic interaction] `status_derivation.status_record` shall provide flat `StatusRecord` to `public_composition.status_record`.

INT-34: [Semantic interaction] `action_arbitration.selected_action` shall provide `Action` to `public_composition.selected_action`.

INT-AUD-01: [Inventory audit] The semantic interaction set is exactly `INT-01` through `INT-03` and `INT-07` through `INT-34`, totaling 31. `INT-04` through `INT-06` are exactly three generated-support routes and are excluded from semantic credit.

BND-INT-01: [Generated support allowance] Exactly six root delegations are required: root `freshRequest` to `PART-01`, root `inventorySnapshot` to `PART-02`, root `capabilitySnapshot` to `PART-03`, root `executionOutcome` to `PART-04`, root `recoveryEvent` to `PART-08`, and `PART-16.public_result` to root `publicResult`.

BND-INT-02: [Raw connection audit] Raw source connections total exactly 40: 31 semantic interactions, three generated-support capability routes, and six root delegations. No support connection receives semantic credit.

## Canonical owner-local contracts and support relations

REL-REQ-01: [Required local relation] `PART-01` shall set `requestPresent` false exactly for `NONE`; `PART-05` shall preserve that received fact, set `requestValid` true exactly for the two valid request values, and set `requestExpedited` true exactly for `VALID_EXPEDITE`. Analysis passes only if neither `PART-05` nor a downstream owner recomputes presence.

REL-STOCK-01: [Required local relation] `PART-02` shall set `materialUsable` false exactly for `MaterialBand.INVALID` and `productUsable` false exactly for `ProductBand.INVALID`. `PART-06` shall preserve usability, derive shortage exactly for usable `SHORT`, readiness exactly for usable `READY`, and availability exactly for usable `AVAILABLE`; it shall not reclassify usability.

REL-OUT-01: [Required local relation] `PART-04` shall map `NONE` to `NO_EVENT`, `FAILED` to `FAILURE`, and every success tag to `SUCCESS` while preserving the exact tag. `PART-07` shall consume both received fields, treat received no-event as no progress, received failure as fault, and phase-check only received success; it shall not independently reclassify `NONE` or `FAILED`.

REL-LIFE-01: [Required state-boundary relation] `PART-09` shall constrain `prior_order_state == In(orderState)`, update its retained `orderState` only by `CASE-01` through `CASE-06` under the received recovery gate, and constrain current output `order_state == orderState` after that selected transition. Only `prior_order_state` may feed `PART-07`; only current `order_state` may feed `PART-10` through `PART-13` and `PART-15`.

REL-STAT-01: [Required local relation] `PART-15` shall derive `FAULT/FAULT_OR_RECOVERY` whenever recovery is nonhealthy; otherwise the four non-hold actions map to `QUOTING/QUOTE_AVAILABLE`, `PROCURING/PROCUREMENT_PRIORITY`, `PRODUCING/PRODUCTION_PRIORITY`, and `DISPATCHING/DISPATCH_PRIORITY`, while `HOLD` maps to `HOLDING/NO_ELIGIBLE_WORK`.

REL-COMP-01: [Composition obligation] `PART-16` shall emit one flat `PublicResult` whose `action` equals `INT-34`, whose four status attributes equal the corresponding attributes received in flat `StatusRecord` on `INT-33`, and whose `requestDisposition` is derived by `CASE-27` through `CASE-30`. One writer and tuple consistency shall prevent cross-evaluation field mixing; no nested inspected status part is authorized.

REL-COUNT-01: [Case-count rule] Acquisition classifications, initialization, type constraints, support routing, state-port equations, status mapping, and tuple consistency are required canonical contracts but do not add campaign cases. The exact nontrivial case inventory is `CASE-01` through `CASE-30`.

## Required behavior and finite contract partitions

REQ-01 / BEH-01: Outcome qualification and order lifecycle shall implement `CASE-01` through `CASE-06` across both prior order states and all six exact outcome tags. A closed derived recovery gate freezes order state; an open gate applies the stated transition. Local-contract inspection and exhaustive analysis pass only if the cases are exclusive, exhaustive, and yield one qualified outcome and one next state for each gate value.

CASE-01: Received `NO_EVENT` with exact `NONE` shall derive `NO_PROGRESS`; with an open gate, order state remains unchanged.

CASE-02: Received `FAILURE`, `QUOTE_OK` outside prior `IDLE`, or `MATERIAL_OK`, `PRODUCTION_OK`, or `DISPATCH_OK` outside prior `OPEN` shall derive `FAULT`; recovery priority closes the gate and order state remains unchanged.

CASE-03: Prior `IDLE` with received `SUCCESS/QUOTE_OK` shall derive `QUOTE_ACCEPTED` and, with an open gate, next order state `OPEN`.

CASE-04: Prior `OPEN` with received `SUCCESS/MATERIAL_OK` shall derive `MATERIAL_CONFIRMED` and, with an open gate, retain `OPEN`.

CASE-05: Prior `OPEN` with received `SUCCESS/PRODUCTION_OK` shall derive `PRODUCTION_COMPLETED` and, with an open gate, retain `OPEN`; product availability remains externally observed.

CASE-06: Prior `OPEN` with received `SUCCESS/DISPATCH_OK` shall derive `DISPATCH_COMPLETED` and, with an open gate, next order state `IDLE`.

REQ-02 / BEH-02: Recovery shall apply fault trigger priority before reset or verification and implement `CASE-07` through `CASE-12`. Retained-state inspection plus exhaustive one-step and bounded-sequence analysis pass only if the cases are exclusive and exhaustive, with `OPEN/INACTIVE` exactly when next recovery is `HEALTHY`.

CASE-07: From any prior recovery state, a fault-qualified outcome shall derive next `LATCHED`, gate `CLOSED`, and emergency `ACTIVE`, regardless of `RecoveryEvent`.

CASE-08: From prior `HEALTHY` without fault, next recovery remains `HEALTHY`, gate `OPEN`, and emergency `INACTIVE`; reset or verification has no releasing effect there.

CASE-09: From prior `LATCHED` without fault, fresh `RESET` shall derive next `RECOVERING`, gate `CLOSED`, and emergency `ACTIVE`.

CASE-10: Every other nonfault input from prior `LATCHED` shall retain `LATCHED`, gate `CLOSED`, and emergency `ACTIVE`.

CASE-11: From prior `RECOVERING` without fault, fresh `VERIFY_OK` shall derive next `HEALTHY`, gate `OPEN`, and emergency `INACTIVE`.

CASE-12: Every other nonfault input from prior `RECOVERING` shall retain `RECOVERING`, gate `CLOSED`, and emergency `ACTIVE`.

REQ-03 / BEH-03: Each eligibility owner shall derive exactly one proposal without arbitration. Four local-contract inspections plus exhaustive analysis pass only if each paired partition below is exclusive and exhaustive and a closed gate falsifies all proposals.

CASE-13: Quotation shall be `PROPOSED` exactly when the gate is open, derived order state is `IDLE`, and the current request is valid.

CASE-14: Every other quotation input shall derive `NOT_PROPOSED`.

CASE-15: Procurement shall be `PROPOSED` exactly when the gate is open, derived order state is `OPEN`, material is usable and short, and Supplier acceptance is available.

CASE-16: Every other procurement input shall derive `NOT_PROPOSED`.

CASE-17: Production shall be `PROPOSED` exactly when the gate is open, derived order state is `OPEN`, material is usable and ready, and production acceptance is available.

CASE-18: Every other production input shall derive `NOT_PROPOSED`.

CASE-19: Dispatch shall be `PROPOSED` exactly when the gate is open, derived order state is `OPEN`, product is usable and available, and dispatch acceptance is available.

CASE-20: Every other dispatch input shall derive `NOT_PROPOSED`.

REQ-04 / BEH-04: Dispatch eligibility shall not suppress upstream proposals. With an open order, available product, and ready material, dispatch and production may both be proposed; with available product and short material, dispatch and procurement may both be proposed. Exhaustive composition analysis passes only if both conflicts are reachable before arbitration.

REQ-05 / BEH-05: Arbitration shall implement `CASE-21` through `CASE-26` and derive exactly one action. Arbiter-contract inspection plus exhaustive proposal analysis pass only if the cases are exclusive and exhaustive and every winning higher branch is insensitive to lower proposals.

CASE-21: Active emergency shall derive `HOLD` regardless of ordinary proposals.

CASE-22: Without emergency, a dispatch proposal shall derive `RELEASE_DISPATCH` regardless of production, procurement, or quotation proposals.

CASE-23: Without emergency or dispatch proposal, a production proposal shall derive `RELEASE_PRODUCTION` regardless of procurement or quotation proposals.

CASE-24: Without emergency, dispatch, or production proposal, a procurement proposal shall derive `ORDER_MATERIAL` regardless of quotation proposal.

CASE-25: Without a higher-priority condition, a quotation proposal shall derive `ISSUE_QUOTE`.

CASE-26: With no emergency and no proposal, arbitration shall derive `HOLD`.

REQ-06 / BEH-06: Public request disposition shall implement `CASE-27` through `CASE-30` without changing the selected action. Composer-contract inspection and exhaustive request/action analysis pass only if the cases are exclusive, exhaustive, and present in the same flat public record as action and status.

CASE-27: A `NONE` request shall derive `NO_REQUEST`.

CASE-28: An `INVALID` request shall derive `REJECTED` regardless of selected action.

CASE-29: A valid current request with selected `ISSUE_QUOTE` shall derive `QUOTED`.

CASE-30: A valid current request with any non-quotation action shall derive `DEFERRED`.

REQ-07 / BEH-07: Lifecycle progress shall be driven only by a fresh qualified execution outcome, never selected action, inventory, availability, or replay. Dependency inspection and paired-step analysis pass only if `NONE` stutters and each admitted progress event transitions exactly once.

REQ-08 / BEH-08: Same-evaluation composition shall preserve this order: prior order state qualifies the received fresh outcome; qualification determines next recovery and next order state; those results gate proposals; arbitration selects action; status and disposition are composed last. Trace and analyzer inspection pass only if owner-local contracts and transmitted values are executed rather than replaced by a centralized oracle.

## Bounded public scenario families

SCN-01: [Nominal standard request] Starting `IDLE/HEALTHY`, `VALID_STANDARD` with no outcome and no competing work shall publish `ISSUE_QUOTE`, healthy quoting status, and `QUOTED`; later `QUOTE_OK` moves order state to `OPEN`.

SCN-02: [Nominal expedited request] Starting `IDLE/HEALTHY`, `VALID_EXPEDITE` follows the standard action policy while exercising the distinct expedited fact and publishes `QUOTED`; no delivery-priority claim follows.

SCN-03: [Material shortage] Starting `OPEN/HEALTHY`, usable short material, Supplier availability, absent product, and no outcome shall publish `ORDER_MATERIAL` with procuring status.

SCN-04: [Production release] Starting `OPEN/HEALTHY`, usable ready material, production availability, absent product, and no outcome shall publish `RELEASE_PRODUCTION` with producing status.

SCN-05: [Dispatch release] Starting `OPEN/HEALTHY`, available product, dispatch availability, and no outcome shall publish `RELEASE_DISPATCH` with dispatching status.

SCN-06: [Dispatch over production] Starting `OPEN/HEALTHY` with available product, ready material, and production and dispatch availability, both proposals shall be present and dispatch shall win.

SCN-07: [Dispatch over procurement] Starting `OPEN/HEALTHY` with available product, short material, and Supplier and dispatch availability, both proposals shall be present and dispatch shall win.

SCN-08: [Failed outcome] From each prior order state and prior `HEALTHY`, fresh `FAILED` shall publish `HOLD/FAULT_OR_RECOVERY/FAULT/LATCHED` in the same evaluation, unaffected by ordinary proposals.

SCN-09: [Unexpected success] Starting `IDLE/HEALTHY`, `DISPATCH_OK` shall be phase-inconsistent and produce the same latch-and-hold response as failure.

SCN-10: [Two-event recovery] Starting `LATCHED`, fresh `RESET` shall publish blocked `RECOVERING/HOLD`; a later fresh `VERIFY_OK` without intervening fault shall publish `HEALTHY` and permit otherwise eligible work in that evaluation.

SCN-11: [Fresh request while busy] Starting `OPEN/HEALTHY` with a valid fresh request and eligible fulfillment, fulfillment shall win and the same result shall report `DEFERRED`; the Customer must retry.

SCN-AUD-01: [Scenario audit] `SCN-01` through `SCN-11` are exactly 11 families: two request classes, three fulfillment stages, two priority conflicts, two fault initiators, one recovery history, and one busy-request path. Parameter variations do not increase the count.

## Structural, trace, analysis, and evidence obligations

BOUND-01: [Hard gate] The model shall contain exactly one explicit root system usage, exactly 15 reachable semantic usages (`PART-01`, `PART-02`, and `PART-04` through `PART-16`), and exactly one behavior-free generated-support usage (`PART-03`) in one weakly connected raw graph. Root and support usages receive no semantic credit.

BOUND-02: [Hard gate] The cross-usage graph shall realize exactly 31 semantic interactions (`INT-01` through `INT-03` and `INT-07` through `INT-34`), exactly three generated-support routes (`INT-04` through `INT-06`), and exactly six root delegations, at containment depth one or two. The raw connection total is 40.

BOUND-03: [Hard gate] The model shall realize exactly 30 nontrivial contract cases (`CASE-01` through `CASE-30`) and exactly 11 scenario families (`SCN-01` through `SCN-11`); support relations shall not inflate either count.

BOUND-04: [Hard gate] `PART-08` and `PART-09` shall be distinct retained-state owners, and every decision owner named in `OWN-AUD-01` shall derive its canonical fact locally. Identity forwarding, central recomputation, mirror state, analyzer-only policy, or semantic credit for `PART-03` fails this gate.

TRACE-01: [Coverage gate] Every abstract ID shall trace to model elements, contract clauses, analyzer assertions, scenario witnesses, or an explicit informational/deferred disposition. Every significant model element shall trace back to an abstract ID or carry a narrow `@generated-support` rationale.

TRACE-02: [Grammar gate] Trace declarations shall use the canonical adjacent-ID grammar, including paired declarations such as `REQ-05 / BEH-05:`; a source trace may reference either declared ID, and no declaration ID may be reused.

ANA-01: [Bounded-analysis gate] The finite root snapshot has `4*3*3*8*6*3=5,184` combinations. Crossing two prior order states and three prior recovery states yields exactly 31,104 exhaustive one-step evaluations.

ANA-02: [Bounded-analysis gate] The deterministic analyzer shall execute the moved `PART-01`, `PART-02`, and `PART-04` classifications, every downstream owner-local relation, and the values transmitted over all 31 semantic interactions; it shall not recompute support routes or substitute a centralized oracle.

ANA-03: [End-to-end analysis gate] Pass requires coverage of all 30 cases and all 11 scenario families, both simultaneous-priority conflicts, same-evaluation failure and unexpected-success propagation from all six prior order/recovery pairs, state stutter and admitted progress, closed-gate noninterference, and the distinct-step `RESET` then `VERIFY_OK` recovery history.

VERIFY-01: [Verification gate] Mechanical verification shall include source/library conformance, exactly one root, endpoint and type compatibility, exact structural and raw inventories, canonical local-contract ownership, exact case and scenario inventories, bidirectional trace coverage, bounded analysis, and Sireum typechecking. Each check shall pass or be reported `not-run`; omission is not a pass.

VALID-01: [Validation gate] Designer validation shall separately inspect preservation of the selected boundary, seed-claim limits, public scenarios, strict priority, fault propagation, recovery, and flat atomic composition. Mechanical success alone does not establish domain fitness.

SUPPORT-01: [Generated-support allowance] The Model may add finite enum and flat `Data` record definitions with attribute fields, named-field access, safe initialization, one cohesive process grouping level, exactly one behavior-free capability splitter, six root delegations, the splitter's three unchanged routes, tuple-consistency clauses, and static semantic/support inventories. Each addition shall trace narrowly and receive no campaign credit unless explicitly identified as one of the 15 semantic usages or 31 semantic interactions.

EXCL-01: [Explicit exclusion] No queues, numeric quantities, timing deadlines, physical station behavior, alternate routing, order cancellation, multiple retained orders, shipping-confirmation truth, automatic retry, nested inspected status payload, or invented aggregate-capability policy is required or authorized.

DEFER-02: [Evidence status] Code generation, application execution, formal proof, real-time performance, probabilistic safety analysis, physical validation, and certification remain deferred and shall be reported `not-run` rather than inferred from typechecking or bounded finite analysis.

## Model regeneration authorization

AUTH-MODEL-01: [Designer decision] Model regeneration is authorized against this revision-2 final baseline. The Model shall preserve the exact 15/31/30/11 campaign metrics, 40 raw connections, owner-local classifications, split prior/current order-state interface, flat public-record mapping, domain behavior, exclusions, and deferred claims.
