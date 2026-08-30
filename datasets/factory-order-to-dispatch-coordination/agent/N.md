# Factory order-to-dispatch coordination

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A Manufacturer-level coordinator is
needed to turn one bounded stream of customer requests, inventory observations,
capability availability, and execution outcomes into an unambiguous next commercial or
fulfillment action without allowing a fault or recovery condition to be hidden by
ordinary work.

PURPOSE-01: [Pilot abstraction] For each evaluation, the system shall classify the
boundary snapshot, progress at most one retained order lifecycle, maintain a separate
recovery lifecycle, decide eligible quotation, procurement, production, and dispatch
work, choose at most one action by strict priority, and publish one atomic result.

GOAL-01: [Pilot abstraction] The system shall deterministically cover every admitted
finite snapshot and prior-state pair.

GOAL-02: [Pilot abstraction] Dispatch of an available product shall take priority over
simultaneous production, procurement, or quotation proposals, while fault or recovery
inhibition shall take priority over every ordinary action.

GOAL-03: [Pilot abstraction] A failed or phase-inconsistent execution outcome shall
propagate in the same evaluation through recovery, eligibility inhibition, action
selection, status, and the public result.

GOAL-04: [Pilot abstraction] Recovery shall require two distinct fresh events: `RESET`
to enter recovery and a later `VERIFY_OK` to release it.

GOAL-05: [Selected architecture] Action, selected cause, public mode, order lifecycle,
recovery lifecycle, and current-request disposition shall be composed into one
indivisible flat `PublicResult` value.

### Operational context and selected boundary

CTX-01: [Selected boundary] The modeled system is a supervisory coordinator inside the
Manufacturer. Customer communication, Supplier response, Storage observation, production
execution, dispatch execution, and recovery authorization are outside this system.

CTX-CUST-01: [Seed-grounded entity with pilot responsibility] The Customer channel
supplies at most one `FreshRequest` per evaluation, consumes the request disposition in
`PublicResult`, and is responsible for retrying a valid request reported as deferred.

CTX-STOR-01: [Seed-grounded capability with pilot responsibility] The external Storage
observer supplies one `InventorySnapshot` and is responsible only for the declared
finite material and product bands, not continuous quantity accuracy.

CTX-SUP-01: [Seed-grounded entity with pilot responsibility] The Supplier-facing source
supplies `supplierAvailable`; `true` means only that a material-order action can
currently be accepted.

CTX-PROD-01: [Seed-grounded capability with pilot responsibility] The production
executor supplies `productionAvailable`, accepts `RELEASE_PRODUCTION`, and later reports
a fresh tagged outcome; angle-production steps and physical completion are outside the
model.

CTX-DISP-01: [Seed-grounded capability with pilot responsibility] The dispatch executor
supplies `dispatchAvailable`, accepts `RELEASE_DISPATCH`, and later reports a fresh
tagged outcome; shipment execution and customer receipt remain outside the model.

CTX-EXEC-01: [Pilot abstraction] The execution-outcome channel supplies either no event
or exactly one fresh tagged `ExecutionOutcome` per evaluation and is responsible for
non-replay.

CTX-REC-01: [Pilot abstraction] A Manufacturer recovery authority supplies
`RecoveryEvent` and is responsible for issuing `RESET` and `VERIFY_OK` as distinct fresh
events only after its external diagnosis.

CTX-PUB-01: [Selected boundary] Manufacturer command/status recipients consume one
`PublicResult`; acceptance or execution of its command is not guaranteed.

MON-REQ-01: [Pilot abstraction] Root input `freshRequest` has type
`FreshRequest={NONE,INVALID,VALID_STANDARD,VALID_EXPEDITE}` and comes from
`CTX-CUST-01`. The valid values distinguish reported service class only.

MON-INV-01: [Pilot abstraction] Root input
`inventorySnapshot=(materialBand,productBand)` comes from `CTX-STOR-01`, where
`MaterialBand={INVALID,SHORT,READY}` and `ProductBand={INVALID,ABSENT,AVAILABLE}`; the
bands carry no unit, numeric threshold, precision, or persistence claim.

MON-CAP-01: [Pilot abstraction] Root input
`capabilitySnapshot=(supplierAvailable,productionAvailable,dispatchAvailable)` carries
independent Booleans from `CTX-SUP-01`, `CTX-PROD-01`, and `CTX-DISP-01`. Availability
means command acceptance only, never successful execution.

MON-OUT-01: [Pilot abstraction] Root input
`executionOutcome={NONE,QUOTE_OK,MATERIAL_OK,PRODUCTION_OK,DISPATCH_OK,FAILED}` comes
from `CTX-EXEC-01`; every non-`NONE` value is a fresh single-evaluation event.

MON-REC-01: [Pilot abstraction] Root input `recoveryEvent={NONE,RESET,VERIFY_OK}` comes
from `CTX-REC-01`; every non-`NONE` value is a fresh single-evaluation event.

CTRL-PUB-01: [Selected architecture] The sole controlled root output is the atomic flat
record
`PublicResult=(action,selectedCause,mode,orderState,recoveryState,requestDisposition)`,
delivered to `CTX-PUB-01`.

ASM-FRESH-01: [Pilot abstraction] `CTX-CUST-01`, `CTX-EXEC-01`, and `CTX-REC-01` are
responsible for freshness, preventing replayed requests, outcomes, resets, or
verifications from changing state twice.

ASM-ORDER-01: [Pilot abstraction] At most one accepted order is represented. Quote
success opens it and dispatch success closes it; a concurrently presented valid request
is deferred unless `ISSUE_QUOTE` wins, and the Customer must retry it.

ASM-STOCK-01: [Pilot abstraction] Material and product bands are independent aggregate
predicates, so product may be available while material is short or ready; no quantity
conservation is claimed.

ASM-STEP-01: [Pilot abstraction] One evaluation is a deterministic logical step with no
claimed duration. A fresh outcome refers to an earlier accepted action, and the newly
selected action is only a command request.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, `OrderState=IDLE`,
`RecoveryState=HEALTHY`, and the public value is
`(HOLD,NO_ELIGIBLE_WORK,HOLDING,IDLE,HEALTHY,NO_REQUEST)`; this is deterministic
initialization, not a production safe-start claim.

### Hazards and required mitigations

RISK-01: [Pilot risk] A failed or lifecycle-inconsistent success accepted as progress
could permit new work after order-state trust is lost; `FAULT-01` requires immediate
latch and inhibition.

RISK-02: [Pilot risk] Ordinary eligibility bypassing recovery could issue work during
incomplete recovery; `FAULT-02` requires one closed gate and emergency dominance.

RISK-03: [Pilot risk] Inconsistent resolution of simultaneous dispatch and upstream
proposals could leave available product undispatched while more work starts; `BEH-05`
requires one strict priority order.

RISK-04: [Pilot risk] Releasing on `RESET` alone could report healthy without separate
verification; `BEH-02` requires a later fresh `VERIFY_OK`.

## Supporting contract definitions

### State `Factory_Dispatch_Coordinator::OrderLifecycle::retained_order`

State `retained_order` has type `Factory_Dispatch_Coordinator::OrderState`.

### State `Factory_Dispatch_Coordinator::RecoveryControl::retained_recovery`

State `retained_recovery` has type `Factory_Dispatch_Coordinator::RecoveryState`.

## Detailed behavioral requirements

### Requirements for ActionArbitration

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ACTION_HOLD` — Required behavior

> During contract evaluation for the initialization phase, ActionArbitration shall set selected action to HOLD.

#### Contract clauses evaluated in the compute phase

##### `CASE_21_EMERGENCY_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is ACTIVE, ActionArbitration shall set selected action to HOLD.

##### `CASE_22_DISPATCH_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE and dispatch proposal is PROPOSED, ActionArbitration shall set selected action to RELEASE DISPATCH.

##### `CASE_23_PRODUCTION_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE, dispatch proposal is NOT PROPOSED, and production proposal is PROPOSED, ActionArbitration shall set selected action to RELEASE PRODUCTION.

##### `CASE_24_PROCUREMENT_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE, dispatch proposal is NOT PROPOSED, production proposal is NOT PROPOSED, and procurement proposal is PROPOSED, ActionArbitration shall set selected action to ORDER MATERIAL.

##### `CASE_25_QUOTATION_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE, dispatch proposal is NOT PROPOSED, production proposal is NOT PROPOSED, procurement proposal is NOT PROPOSED, and quotation proposal is PROPOSED, ActionArbitration shall set selected action to ISSUE QUOTE.

##### `CASE_26_NO_ELIGIBLE_WORK` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE, dispatch proposal is NOT PROPOSED, production proposal is NOT PROPOSED, procurement proposal is NOT PROPOSED, and quotation proposal is NOT PROPOSED, ActionArbitration shall set selected action to HOLD.

### Requirements for CustomerRequestAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REQUEST_BOUNDARY` — Required behavior

> During contract evaluation for the initialization phase, CustomerRequestAcquisition shall set request boundary facts fresh request to NONE and request boundary facts request present to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_REQUEST_VALUE` — Required behavior

> During contract evaluation for the compute phase, CustomerRequestAcquisition shall set request boundary facts fresh request to fresh request.

##### `CLASSIFY_REQUEST_PRESENCE` — Required behavior

> During contract evaluation for the compute phase, CustomerRequestAcquisition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - request boundary facts request present is true exactly when T is true
>       - fresh request is not NONE
>   - All of the following conditions hold:
>     
>       - request boundary facts request present is true exactly when F is true
>       - fresh request is NONE.

### Requirements for DispatchEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DISPATCH_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, DispatchEligibility shall set proposal to NOT PROPOSED.

#### Contract clauses evaluated in the compute phase

##### `CASE_19_DISPATCH_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN, order state is OPEN, stock facts product usable is true exactly when T is true, stock facts product available is true exactly when T is true, and dispatch available is T, DispatchEligibility shall set proposal to PROPOSED.

##### `CASE_20_DISPATCH_NOT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is not OPEN, order state is not OPEN, stock facts product usable is true exactly when F is true, stock facts product available is true exactly when F is true, or dispatch available is F, DispatchEligibility shall set proposal to NOT PROPOSED.

### Requirements for ExecutionOutcomeAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OUTCOME_BOUNDARY` — Required behavior

> During contract evaluation for the initialization phase, ExecutionOutcomeAcquisition shall set outcome boundary facts execution outcome to NONE and outcome boundary facts event class to NO EVENT.

#### Contract clauses evaluated in the compute phase

##### `CLASSIFY_NO_EVENT` — Conditional behavior

> During contract evaluation for the compute phase, if execution outcome is NONE, ExecutionOutcomeAcquisition shall set outcome boundary facts execution outcome to execution outcome and outcome boundary facts event class to NO EVENT.

##### `CLASSIFY_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, if execution outcome is FAILED, ExecutionOutcomeAcquisition shall set outcome boundary facts execution outcome to execution outcome and outcome boundary facts event class to FAILURE.

##### `CLASSIFY_SUCCESS` — Conditional behavior

> During contract evaluation for the compute phase, if execution outcome is not NONE and execution outcome is not FAILED, ExecutionOutcomeAcquisition shall set outcome boundary facts execution outcome to execution outcome and outcome boundary facts event class to SUCCESS.

### Requirements for InventoryAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_INVENTORY_BOUNDARY` — Required behavior

> During contract evaluation for the initialization phase, InventoryAcquisition shall set material boundary facts material band to INVALID, material boundary facts material usable to true exactly when F is true, product boundary facts product band to INVALID, and product boundary facts product usable to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_INVENTORY_BANDS` — Required behavior

> During contract evaluation for the compute phase, InventoryAcquisition shall set material boundary facts material band to inventory snapshot material band and product boundary facts product band to inventory snapshot product band.

##### `CLASSIFY_MATERIAL_USABILITY` — Required behavior

> During contract evaluation for the compute phase, InventoryAcquisition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - material boundary facts material usable is true exactly when T is true
>       - inventory snapshot material band is not INVALID
>   - All of the following conditions hold:
>     
>       - material boundary facts material usable is true exactly when F is true
>       - inventory snapshot material band is INVALID.

##### `CLASSIFY_PRODUCT_USABILITY` — Required behavior

> During contract evaluation for the compute phase, InventoryAcquisition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - product boundary facts product usable is true exactly when T is true
>       - inventory snapshot product band is not INVALID
>   - All of the following conditions hold:
>     
>       - product boundary facts product usable is true exactly when F is true
>       - inventory snapshot product band is INVALID.

### Requirements for OrderLifecycle

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ORDER_IDLE` — Required behavior

> During contract evaluation for the initialization phase, OrderLifecycle shall set retained order to IDLE, prior order state to IDLE, and order state to IDLE.

#### Contract clauses evaluated in the compute phase

##### `DISTINCT_PRIOR_AND_CURRENT_PORTS` — Required behavior

> During contract evaluation for the compute phase, OrderLifecycle shall set prior order state to the value of retained order on entry and order state to retained order.

##### `CASE_01_OPEN_GATE_NO_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN and qualified outcome is NO PROGRESS, OrderLifecycle shall preserve the value of retained order on entry and set order state to the value of retained order on entry.

##### `CASE_02_CLOSED_GATE_FREEZE` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is CLOSED, OrderLifecycle shall preserve the value of retained order on entry and set order state to the value of retained order on entry.

##### `CASE_03_QUOTE_OPENS_ORDER` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN and qualified outcome is QUOTE ACCEPTED, OrderLifecycle shall set retained order to OPEN and order state to OPEN.

##### `CASE_04_MATERIAL_RETAINS_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN and qualified outcome is MATERIAL CONFIRMED, OrderLifecycle shall set retained order to OPEN and order state to OPEN.

##### `CASE_05_PRODUCTION_RETAINS_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN and qualified outcome is PRODUCTION COMPLETED, OrderLifecycle shall set retained order to OPEN and order state to OPEN.

##### `CASE_06_DISPATCH_CLOSES_ORDER` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN and qualified outcome is DISPATCH COMPLETED, OrderLifecycle shall set retained order to IDLE and order state to IDLE.

### Requirements for OutcomeQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_QUALIFIED_OUTCOME` — Required behavior

> During contract evaluation for the initialization phase, OutcomeQualification shall set qualified outcome to NO PROGRESS.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_NO_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, if outcome boundary facts event class is NO EVENT and outcome boundary facts execution outcome is NONE, OutcomeQualification shall set qualified outcome to NO PROGRESS.

##### `CASE_02_FAILURE_OR_PHASE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 FAILURE OR PHASE FAULT applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - outcome boundary facts event class is FAILURE
>   - All of the following conditions hold:
>     
>       - outcome boundary facts event class is SUCCESS
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - outcome boundary facts execution outcome is QUOTE OK
>               - prior order state is not IDLE
>           - All of the following conditions hold:
>             
>               - At least one of the following conditions holds:
>                 
>                   - outcome boundary facts execution outcome is MATERIAL OK
>                   - outcome boundary facts execution outcome is PRODUCTION OK
>                   - outcome boundary facts execution outcome is DISPATCH OK
>               - prior order state is not OPEN.

> When all applicability conditions are met, OutcomeQualification shall produce a result for which all of the following conditions hold:
>
> qualified outcome is FAULT.

##### `CASE_03_QUOTE_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if outcome boundary facts event class is SUCCESS, outcome boundary facts execution outcome is QUOTE OK, and prior order state is IDLE, OutcomeQualification shall set qualified outcome to QUOTE ACCEPTED.

##### `CASE_04_MATERIAL_CONFIRMED` — Conditional behavior

> During contract evaluation for the compute phase, if outcome boundary facts event class is SUCCESS, outcome boundary facts execution outcome is MATERIAL OK, and prior order state is OPEN, OutcomeQualification shall set qualified outcome to MATERIAL CONFIRMED.

##### `CASE_05_PRODUCTION_COMPLETED` — Conditional behavior

> During contract evaluation for the compute phase, if outcome boundary facts event class is SUCCESS, outcome boundary facts execution outcome is PRODUCTION OK, and prior order state is OPEN, OutcomeQualification shall set qualified outcome to PRODUCTION COMPLETED.

##### `CASE_06_DISPATCH_COMPLETED` — Conditional behavior

> During contract evaluation for the compute phase, if outcome boundary facts event class is SUCCESS, outcome boundary facts execution outcome is DISPATCH OK, and prior order state is OPEN, OutcomeQualification shall set qualified outcome to DISPATCH COMPLETED.

### Requirements for ProcurementEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PROCUREMENT_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, ProcurementEligibility shall set proposal to NOT PROPOSED.

#### Contract clauses evaluated in the compute phase

##### `CASE_15_PROCUREMENT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN, order state is OPEN, stock facts material usable is true exactly when T is true, stock facts material shortage is true exactly when T is true, and supplier available is T, ProcurementEligibility shall set proposal to PROPOSED.

##### `CASE_16_PROCUREMENT_NOT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is not OPEN, order state is not OPEN, stock facts material usable is true exactly when F is true, stock facts material shortage is true exactly when F is true, or supplier available is F, ProcurementEligibility shall set proposal to NOT PROPOSED.

### Requirements for ProductionEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PRODUCTION_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, ProductionEligibility shall set proposal to NOT PROPOSED.

#### Contract clauses evaluated in the compute phase

##### `CASE_17_PRODUCTION_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN, order state is OPEN, stock facts material usable is true exactly when T is true, stock facts material ready is true exactly when T is true, and production available is T, ProductionEligibility shall set proposal to PROPOSED.

##### `CASE_18_PRODUCTION_NOT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is not OPEN, order state is not OPEN, stock facts material usable is true exactly when F is true, stock facts material ready is true exactly when F is true, or production available is F, ProductionEligibility shall set proposal to NOT PROPOSED.

### Requirements for PublicComposition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PUBLIC_ACTION` — Required behavior

> During contract evaluation for the initialization phase, PublicComposition shall set public result published action to HOLD.

##### `INITIAL_PUBLIC_CAUSE` — Required behavior

> During contract evaluation for the initialization phase, PublicComposition shall set public result selected cause to NO ELIGIBLE WORK.

##### `INITIAL_PUBLIC_MODE` — Required behavior

> During contract evaluation for the initialization phase, PublicComposition shall set public result mode to HOLDING.

##### `INITIAL_PUBLIC_ORDER` — Required behavior

> During contract evaluation for the initialization phase, PublicComposition shall set public result published order to IDLE.

##### `INITIAL_PUBLIC_RECOVERY` — Required behavior

> During contract evaluation for the initialization phase, PublicComposition shall set public result published recovery to HEALTHY.

##### `INITIAL_PUBLIC_DISPOSITION` — Required behavior

> During contract evaluation for the initialization phase, PublicComposition shall set public result request disposition to NO REQUEST.

#### Contract clauses evaluated in the compute phase

##### `COMPOSE_PUBLIC_ACTION` — Required behavior

> During contract evaluation for the compute phase, PublicComposition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - public result published action is HOLD
>       - selected action is HOLD
>   - All of the following conditions hold:
>     
>       - public result published action is ISSUE QUOTE
>       - selected action is ISSUE QUOTE
>   - All of the following conditions hold:
>     
>       - public result published action is ORDER MATERIAL
>       - selected action is ORDER MATERIAL
>   - All of the following conditions hold:
>     
>       - public result published action is RELEASE PRODUCTION
>       - selected action is RELEASE PRODUCTION
>   - All of the following conditions hold:
>     
>       - public result published action is RELEASE DISPATCH
>       - selected action is RELEASE DISPATCH.

##### `COMPOSE_PUBLIC_CAUSE` — Required behavior

> During contract evaluation for the compute phase, PublicComposition shall set public result selected cause to status record selected cause.

##### `COMPOSE_PUBLIC_MODE` — Required behavior

> During contract evaluation for the compute phase, PublicComposition shall set public result mode to status record mode.

##### `COMPOSE_PUBLIC_ORDER` — Required behavior

> During contract evaluation for the compute phase, PublicComposition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - public result published order is IDLE
>       - status record order phase is IDLE
>   - All of the following conditions hold:
>     
>       - public result published order is OPEN
>       - status record order phase is OPEN.

##### `COMPOSE_PUBLIC_RECOVERY` — Required behavior

> During contract evaluation for the compute phase, PublicComposition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - public result published recovery is HEALTHY
>       - status record recovery phase is HEALTHY
>   - All of the following conditions hold:
>     
>       - public result published recovery is LATCHED
>       - status record recovery phase is LATCHED
>   - All of the following conditions hold:
>     
>       - public result published recovery is RECOVERING
>       - status record recovery phase is RECOVERING.

##### `CASE_27_NO_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if request facts fresh request is NONE, PublicComposition shall set public result request disposition to NO REQUEST.

##### `CASE_28_INVALID_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if request facts fresh request is INVALID, PublicComposition shall set public result request disposition to REJECTED.

##### `CASE_29_QUOTED` — Conditional behavior

> During contract evaluation for the compute phase, if request facts request valid is true exactly when T is true and selected action is ISSUE QUOTE, PublicComposition shall set public result request disposition to QUOTED.

##### `CASE_30_DEFERRED` — Conditional behavior

> During contract evaluation for the compute phase, if request facts request valid is true exactly when T is true and selected action is not ISSUE QUOTE, PublicComposition shall set public result request disposition to DEFERRED.

### Requirements for QuotationEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_QUOTATION_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, QuotationEligibility shall set proposal to NOT PROPOSED.

#### Contract clauses evaluated in the compute phase

##### `CASE_13_QUOTATION_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN, order state is IDLE, and request facts request valid is true exactly when T is true, QuotationEligibility shall set proposal to PROPOSED.

##### `CASE_14_QUOTATION_NOT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is not OPEN, order state is not IDLE, or request facts request valid is true exactly when F is true, QuotationEligibility shall set proposal to NOT PROPOSED.

### Requirements for RecoveryControl

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RECOVERY_HEALTHY` — Required behavior

> During contract evaluation for the initialization phase, RecoveryControl shall set retained recovery to HEALTHY, recovery state to HEALTHY, recovery gate to OPEN, and emergency state to INACTIVE.

#### Contract clauses evaluated in the compute phase

##### `RECOVERY_OUTPUTS_AGREE` — Required behavior

> During contract evaluation for the compute phase, RecoveryControl shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recovery state is retained recovery
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - retained recovery is HEALTHY
>           - recovery gate is OPEN
>           - emergency state is INACTIVE
>       - All of the following conditions hold:
>         
>           - retained recovery is not HEALTHY
>           - recovery gate is CLOSED
>           - emergency state is ACTIVE.

##### `CASE_07_FAULT_LATCHES` — Conditional behavior

> During contract evaluation for the compute phase, if qualified outcome is FAULT, RecoveryControl shall set retained recovery to LATCHED, recovery state to LATCHED, recovery gate to CLOSED, and emergency state to ACTIVE.

##### `CASE_08_HEALTHY_REMAINS_HEALTHY` — Conditional behavior

> During contract evaluation for the compute phase, if qualified outcome is not FAULT and the value of retained recovery on entry is HEALTHY, RecoveryControl shall set retained recovery to HEALTHY, recovery state to HEALTHY, recovery gate to OPEN, and emergency state to INACTIVE.

##### `CASE_09_RESET_ENTERS_RECOVERING` — Conditional behavior

> During contract evaluation for the compute phase, if qualified outcome is not FAULT, the value of retained recovery on entry is LATCHED, and recovery event is RESET, RecoveryControl shall set retained recovery to RECOVERING, recovery state to RECOVERING, recovery gate to CLOSED, and emergency state to ACTIVE.

##### `CASE_10_LATCHED_STUTTERS` — Conditional behavior

> During contract evaluation for the compute phase, if qualified outcome is not FAULT, the value of retained recovery on entry is LATCHED, and recovery event is not RESET, RecoveryControl shall set retained recovery to LATCHED, recovery state to LATCHED, recovery gate to CLOSED, and emergency state to ACTIVE.

##### `CASE_11_VERIFY_RELEASES` — Conditional behavior

> During contract evaluation for the compute phase, if qualified outcome is not FAULT, the value of retained recovery on entry is RECOVERING, and recovery event is VERIFY OK, RecoveryControl shall set retained recovery to HEALTHY, recovery state to HEALTHY, recovery gate to OPEN, and emergency state to INACTIVE.

##### `CASE_12_RECOVERING_STUTTERS` — Conditional behavior

> During contract evaluation for the compute phase, if qualified outcome is not FAULT, the value of retained recovery on entry is RECOVERING, and recovery event is not VERIFY OK, RecoveryControl shall set retained recovery to RECOVERING, recovery state to RECOVERING, recovery gate to CLOSED, and emergency state to ACTIVE.

### Requirements for RequestQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REQUEST_FACTS` — Required behavior

> During contract evaluation for the initialization phase, RequestQualification shall set request facts fresh request to NONE, request facts request present to true exactly when F is true, request facts request valid to true exactly when F is true, and request facts request expedited to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_RECEIVED_REQUEST_FACTS` — Required behavior

> During contract evaluation for the compute phase, RequestQualification shall set request facts fresh request to request boundary facts fresh request and request facts request present to true exactly when request boundary facts request present is true.

##### `CLASSIFY_VALID_REQUEST` — Required behavior

> During contract evaluation for the compute phase, RequestQualification shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - request facts request valid is true exactly when T is true
>       - At least one of the following conditions holds:
>         
>           - request boundary facts fresh request is VALID STANDARD
>           - request boundary facts fresh request is VALID EXPEDITE
>   - All of the following conditions hold:
>     
>       - request facts request valid is true exactly when F is true
>       - request boundary facts fresh request is not VALID STANDARD
>       - request boundary facts fresh request is not VALID EXPEDITE.

##### `CLASSIFY_EXPEDITED_REQUEST` — Required behavior

> During contract evaluation for the compute phase, RequestQualification shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - request facts request expedited is true exactly when T is true
>       - request boundary facts fresh request is VALID EXPEDITE
>   - All of the following conditions hold:
>     
>       - request facts request expedited is true exactly when F is true
>       - request boundary facts fresh request is not VALID EXPEDITE.

### Requirements for StatusDerivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_STATUS_MODE` — Required behavior

> During contract evaluation for the initialization phase, StatusDerivation shall set status record mode to HOLDING.

##### `INITIAL_STATUS_CAUSE` — Required behavior

> During contract evaluation for the initialization phase, StatusDerivation shall set status record selected cause to NO ELIGIBLE WORK.

##### `INITIAL_STATUS_ORDER` — Required behavior

> During contract evaluation for the initialization phase, StatusDerivation shall set status record order phase to IDLE.

##### `INITIAL_STATUS_RECOVERY` — Required behavior

> During contract evaluation for the initialization phase, StatusDerivation shall set status record recovery phase to HEALTHY.

#### Contract clauses evaluated in the compute phase

##### `MAP_STATUS_ORDER` — Required behavior

> During contract evaluation for the compute phase, StatusDerivation shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - status record order phase is IDLE
>       - order state is IDLE
>   - All of the following conditions hold:
>     
>       - status record order phase is OPEN
>       - order state is OPEN.

##### `MAP_STATUS_RECOVERY` — Required behavior

> During contract evaluation for the compute phase, StatusDerivation shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - status record recovery phase is HEALTHY
>       - recovery state is HEALTHY
>   - All of the following conditions hold:
>     
>       - status record recovery phase is LATCHED
>       - recovery state is LATCHED
>   - All of the following conditions hold:
>     
>       - status record recovery phase is RECOVERING
>       - recovery state is RECOVERING.

##### `STATUS_FAULT_OR_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if recovery state is not HEALTHY, StatusDerivation shall set status record mode to FAULT and status record selected cause to FAULT OR RECOVERY.

##### `STATUS_QUOTING` — Conditional behavior

> During contract evaluation for the compute phase, if recovery state is HEALTHY and selected action is ISSUE QUOTE, StatusDerivation shall set status record mode to QUOTING and status record selected cause to QUOTE AVAILABLE.

##### `STATUS_PROCURING` — Conditional behavior

> During contract evaluation for the compute phase, if recovery state is HEALTHY and selected action is ORDER MATERIAL, StatusDerivation shall set status record mode to PROCURING and status record selected cause to PROCUREMENT PRIORITY.

##### `STATUS_PRODUCING` — Conditional behavior

> During contract evaluation for the compute phase, if recovery state is HEALTHY and selected action is RELEASE PRODUCTION, StatusDerivation shall set status record mode to PRODUCING and status record selected cause to PRODUCTION PRIORITY.

##### `STATUS_DISPATCHING` — Conditional behavior

> During contract evaluation for the compute phase, if recovery state is HEALTHY and selected action is RELEASE DISPATCH, StatusDerivation shall set status record mode to DISPATCHING and status record selected cause to DISPATCH PRIORITY.

##### `STATUS_HOLDING` — Conditional behavior

> During contract evaluation for the compute phase, if recovery state is HEALTHY and selected action is HOLD, StatusDerivation shall set status record mode to HOLDING and status record selected cause to NO ELIGIBLE WORK.

### Requirements for StockAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_STOCK_FACTS` — Required behavior

> During contract evaluation for the initialization phase, StockAssessment shall set stock facts material band to INVALID, stock facts material usable to true exactly when F is true, stock facts material shortage to true exactly when F is true, stock facts material ready to true exactly when F is true, stock facts product band to INVALID, stock facts product usable to true exactly when F is true, and stock facts product available to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_RECEIVED_STOCK_FACTS` — Required behavior

> During contract evaluation for the compute phase, StockAssessment shall set stock facts material band to material boundary facts material band, stock facts material usable to true exactly when material boundary facts material usable is true, stock facts product band to product boundary facts product band, and stock facts product usable to true exactly when product boundary facts product usable is true.

##### `DERIVE_MATERIAL_SHORTAGE` — Required behavior

> During contract evaluation for the compute phase, StockAssessment shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - stock facts material shortage is true exactly when T is true
>       - material boundary facts material usable is true exactly when T is true
>       - material boundary facts material band is SHORT
>   - All of the following conditions hold:
>     
>       - stock facts material shortage is true exactly when F is true
>       - At least one of the following conditions holds:
>         
>           - material boundary facts material usable is true exactly when F is true
>           - material boundary facts material band is not SHORT.

##### `DERIVE_MATERIAL_READINESS` — Required behavior

> During contract evaluation for the compute phase, StockAssessment shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - stock facts material ready is true exactly when T is true
>       - material boundary facts material usable is true exactly when T is true
>       - material boundary facts material band is READY
>   - All of the following conditions hold:
>     
>       - stock facts material ready is true exactly when F is true
>       - At least one of the following conditions holds:
>         
>           - material boundary facts material usable is true exactly when F is true
>           - material boundary facts material band is not READY.

##### `DERIVE_PRODUCT_AVAILABILITY` — Required behavior

> During contract evaluation for the compute phase, StockAssessment shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - stock facts product available is true exactly when T is true
>       - product boundary facts product usable is true exactly when T is true
>       - product boundary facts product band is AVAILABLE
>   - All of the following conditions hold:
>     
>       - stock facts product available is true exactly when F is true
>       - At least one of the following conditions holds:
>         
>           - product boundary facts product usable is true exactly when F is true
>           - product boundary facts product band is not AVAILABLE.
