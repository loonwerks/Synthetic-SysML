# Bounded Finished-Product Dispatch Coordinator

## Selected system context

### Need, purpose, and goals

NEED-01: A Manufacturer needs one bounded logical coordinator that accepts
finished-product shipment requests, checks supplied product availability and dispatch
readiness, prevents ambiguous reuse of a recent request identifier, issues at most one
shipment-release directive per evaluation, and reports the resulting dispatch status to
the Customer. The modeled need is logical dispatch coordination, not physical shipment
performance.

PURPOSE-01: The coordinator will govern one active finished-product request and one
most-recently-completed request record. It will qualify arrivals, classify admission and
shipment-result events, assess inventory sufficiency, authorize release through one
principal decision owner, and synthesize one finite Customer notice.

GOAL-01: The system shall produce a total deterministic shipment-release directive and
Customer notice for every finite boundary-input and valid owner-state combination.

GOAL-02: The system shall never issue a release for an invalid, conflicting, already
submitted, insufficiently stocked, or dispatch-not-ready request.

GOAL-03: The system shall retain a failed matching shipment as pending, suppress
same-evaluation re-release, and permit a later no-event evaluation to retry it when
valid inventory and readiness evidence permit.

GOAL-04: The system should remain exhaustively analyzable at the declared small
complexity without count-only usages, interactions, cases, or scenarios.

### Operational context and exact boundary

CTX-01: The Customer is external. It supplies shipment-request arrivals and receives
finite dispatch notices; no pricing, payment, contractual acceptance, or delivery
obligation is inferred.

CTX-02: Finished-Product Storage is external to the selected coordinator but within the
broader Manufacturer context. It supplies a status-bearing inventory-band snapshot; the
coordinator neither measures nor changes physical inventory.

CTX-03: Dispatch Execution is external to the selected coordinator but within the
broader Manufacturer context. It supplies readiness and shipment-result evidence and
receives logical release directives; a directive does not establish physical shipment.

MON-01: `RequestArrivalSample` is exactly `NoArrival` or `Arrival(requestId, productId,
amount, status)`, where `RequestId = {R1, R2}`, `ProductId = {AngleA, AngleB}`, `Amount
= {One, Two}`, and `InputStatus = {Valid, Invalid}`.

MON-02: `InventorySample` has `angleABand`, `angleBBand`, and `status`; each `StockBand`
is exactly `{Zero, One, TwoOrMore}` and `status : InputStatus`. Bands are logical
availability labels without units, timing, or accuracy claims.

MON-03: `DispatchReadinessSample` has `readiness : {Ready, NotReady}` and `status :
InputStatus`. `Ready` is supplied permission evidence only.

MON-04: `ShipmentResultSample` is exactly `NoResult` or `Result(requestId, outcome,
status)`, where `ShipmentOutcome = {Succeeded, Failed}`.

CTRL-01: `ShipmentReleaseDirective` is exactly `NoRelease` or `Release(requestId,
productId, amount)` and commands only logical submission of the selected request.

CTRL-02: `CustomerDispatchNotice` is exactly `{None, InvalidEvent, RequestAccepted,
DuplicateAcknowledged, IdentifierConflict, Busy, StaleResult, InventoryEvidenceInvalid,
ReadinessEvidenceInvalid, WaitingForStock, WaitingForDispatch, ReleaseIssued,
ShipmentConfirmed, ShipmentFailedRetryPending}`.

### Required behavior, faults, and evidence

RISK-01: Invalid, simultaneous, or conflicting event evidence could otherwise admit
ambiguous work or release a pending request in an untrustworthy evaluation; CASE-01 and
CASE-07 shall preserve state, block release, and report `InvalidEvent` or
`IdentifierConflict`.

RISK-02: Invalid inventory or readiness could otherwise authorize release without
trustworthy evidence; with a pending request, CASE-11 shall issue `NoRelease`, and
inventory-invalid notice priority shall dominate readiness-invalid when both are
invalid.

RISK-03: Treating a failed result as completion or immediately resubmitting could lose
or duplicate work; CASE-03 and `recoveryHold` shall preserve the request, prevent
same-evaluation release, and permit a later eligible retry.

### Assumptions and constraints

ASM-01: CTX-01 is responsible for present-request validity status and for treating R1
and R2 as bounded correlation tokens; the system neither authenticates the Customer nor
guarantees global uniqueness.

ASM-02: CTX-02 is responsible for one internally coherent inventory snapshot and status
per evaluation; the system does not reserve, decrement, reconcile, or verify stock.

ASM-03: CTX-03 is responsible for readiness and result status. `Succeeded` means only
that Dispatch Execution reports completion for correlation and notice purposes, not that
delivery occurred.

ASM-04: CTX-03 shall not send a valid result for a request it never received, but
unmatched valid results remain total through CASE-04.

ASM-05: Independent external entities may present arrival and result simultaneously; the
selected small policy classifies that combination as `InvalidEvent` for an unambiguous
state transition.

## Supporting contract definitions

### State `Factory_Dispatch_Coordinator::Request_Registry::active`

State `active` has type `Factory_Dispatch_Coordinator::Active_Slot`.

### State `Factory_Dispatch_Coordinator::Request_Registry::last_completed`

State `last_completed` has type `Factory_Dispatch_Coordinator::Completion_Slot`.

### `Factory_Dispatch_Coordinator::Customer_Notice_Synthesis::notice_for`

- Function category: Strictly pure
- Input `registry` has type `Factory_Dispatch_Coordinator::Registry_Outcome`.
- Input `dispatch` has type `Factory_Dispatch_Coordinator::Dispatch_Disposition`.
- Result type: `Factory_Dispatch_Coordinator::Customer_Dispatch_Notice`.

> The function returns the value selected as follows:
>
> **If:**
>
> `registry` is `Registry_Outcome.Invalid_Event`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Invalid_Event`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `registry` is `Registry_Outcome.Identifier_Conflict`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Identifier_Conflict`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `registry` is `Registry_Outcome.Stale_Result`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Stale_Result`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `registry` is `Registry_Outcome.Busy`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Busy`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `registry` is `Registry_Outcome.Shipment_Failed_Retry_Pending`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Shipment_Failed_Retry_Pending`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `registry` is `Registry_Outcome.Duplicate_Acknowledged`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Duplicate_Acknowledged`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `dispatch` is `Dispatch_Disposition.Inventory_Invalid`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Inventory_Evidence_Invalid`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `dispatch` is `Dispatch_Disposition.Readiness_Invalid`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Readiness_Evidence_Invalid`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `dispatch` is `Dispatch_Disposition.Waiting_Stock`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Waiting_For_Stock`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `dispatch` is `Dispatch_Disposition.Waiting_Dispatch`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Waiting_For_Dispatch`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `dispatch` is `Dispatch_Disposition.Release_Issued`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Release_Issued`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `registry` is `Registry_Outcome.Shipment_Confirmed`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Shipment_Confirmed`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `registry` is `Registry_Outcome.Request_Accepted`
>
> **Use:**
>
> `Customer_Dispatch_Notice.Request_Accepted`
>
> **Otherwise use:**
>
> `Customer_Dispatch_Notice.None`.

### `Factory_Dispatch_Coordinator::Dispatch_Arbiter::release_for`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Request_Value`.
- Result type: `Factory_Dispatch_Coordinator::Shipment_Release_Directive`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleA_One`
>
> **Use:**
>
> `Shipment_Release_Directive.Release_R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleA_Two`
>
> **Use:**
>
> `Shipment_Release_Directive.Release_R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleB_One`
>
> **Use:**
>
> `Shipment_Release_Directive.Release_R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleB_Two`
>
> **Use:**
>
> `Shipment_Release_Directive.Release_R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleA_One`
>
> **Use:**
>
> `Shipment_Release_Directive.Release_R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleA_Two`
>
> **Use:**
>
> `Shipment_Release_Directive.Release_R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleB_One`
>
> **Use:**
>
> `Shipment_Release_Directive.Release_R2_AngleB_One`
>
> **Otherwise use:**
>
> `Shipment_Release_Directive.Release_R2_AngleB_Two`.

### `Factory_Dispatch_Coordinator::Dispatch_Arbiter::instruction_for`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Request_Value`.
- Result type: `Factory_Dispatch_Coordinator::Registry_Instruction`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleA_One`
>
> **Use:**
>
> `Registry_Instruction.Mark_Submitted_R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleA_Two`
>
> **Use:**
>
> `Registry_Instruction.Mark_Submitted_R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleB_One`
>
> **Use:**
>
> `Registry_Instruction.Mark_Submitted_R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleB_Two`
>
> **Use:**
>
> `Registry_Instruction.Mark_Submitted_R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleA_One`
>
> **Use:**
>
> `Registry_Instruction.Mark_Submitted_R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleA_Two`
>
> **Use:**
>
> `Registry_Instruction.Mark_Submitted_R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleB_One`
>
> **Use:**
>
> `Registry_Instruction.Mark_Submitted_R2_AngleB_One`
>
> **Otherwise use:**
>
> `Registry_Instruction.Mark_Submitted_R2_AngleB_Two`.

### `Factory_Dispatch_Coordinator::Dispatch_Arbiter::release_eligible`

- Function category: Strictly pure
- Input `candidate` has type `Factory_Dispatch_Coordinator::Dispatch_Candidate`.
- Input `finding` has type `Factory_Dispatch_Coordinator::Inventory_Finding`.
- Input `readiness` has type `Factory_Dispatch_Coordinator::Dispatch_Readiness_Sample`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `candidate.request` is not `Request_Value.No_Request`, `candidate.event_blocked` is true exactly when `F` is true, `candidate.recovery_hold` is true exactly when `F` is true, `finding` is `Inventory_Finding.Sufficient`, `readiness.status` is `Input_Status.Valid`, and `readiness.readiness` is `Dispatch_Readiness.Ready`.

### `Factory_Dispatch_Coordinator::Dispatch_Arbiter::blocker_disposition`

- Function category: Strictly pure
- Input `candidate` has type `Factory_Dispatch_Coordinator::Dispatch_Candidate`.
- Input `finding` has type `Factory_Dispatch_Coordinator::Inventory_Finding`.
- Input `readiness` has type `Factory_Dispatch_Coordinator::Dispatch_Readiness_Sample`.
- Result type: `Factory_Dispatch_Coordinator::Dispatch_Disposition`.

> The function returns the value selected as follows:
>
> **If:**
>
> `candidate.event_blocked` is true exactly when `T` is true
>
> **Use:**
>
> `Dispatch_Disposition.Event_Blocked`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `candidate.recovery_hold` is true exactly when `T` is true
>
> **Use:**
>
> `Dispatch_Disposition.Recovery_Held`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `finding` is `Inventory_Finding.Invalid_Inventory`
>
> **Use:**
>
> `Dispatch_Disposition.Inventory_Invalid`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `readiness.status` is `Input_Status.Invalid`
>
> **Use:**
>
> `Dispatch_Disposition.Readiness_Invalid`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `finding` is `Inventory_Finding.Insufficient`
>
> **Use:**
>
> `Dispatch_Disposition.Waiting_Stock`
>
> **Otherwise use:**
>
> `Dispatch_Disposition.Waiting_Dispatch`.

### `Factory_Dispatch_Coordinator::Inventory_Assessment::is_angle_a`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Pending_Request_View`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Pending_Request_View.Pending_R1_AngleA_One`, `value` is `Pending_Request_View.Pending_R1_AngleA_Two`, `value` is `Pending_Request_View.Pending_R2_AngleA_One`, or `value` is `Pending_Request_View.Pending_R2_AngleA_Two`.

### `Factory_Dispatch_Coordinator::Inventory_Assessment::amount_is_one`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Pending_Request_View`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Pending_Request_View.Pending_R1_AngleA_One`, `value` is `Pending_Request_View.Pending_R1_AngleB_One`, `value` is `Pending_Request_View.Pending_R2_AngleA_One`, or `value` is `Pending_Request_View.Pending_R2_AngleB_One`.

### `Factory_Dispatch_Coordinator::Inventory_Assessment::stock_is_sufficient`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Pending_Request_View`.
- Input `angle_a` has type `Factory_Dispatch_Coordinator::Angle_A_Stock_Band`.
- Input `angle_b` has type `Factory_Dispatch_Coordinator::Angle_B_Stock_Band`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the result of `is_angle_a` for (`value`) is true
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - the result of `amount_is_one` for (`value`) is true
>               - `angle_a` is not `Angle_A_Stock_Band.Zero`
>           - All of the following conditions hold:
>             
>               - It is not the case that:
>                 
>                 the result of `amount_is_one` for (`value`) is true
>               - `angle_a` is `Angle_A_Stock_Band.Two_Or_More`
>   - All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         the result of `is_angle_a` for (`value`) is true
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - the result of `amount_is_one` for (`value`) is true
>               - `angle_b` is not `Angle_B_Stock_Band.Zero`
>           - All of the following conditions hold:
>             
>               - It is not the case that:
>                 
>                 the result of `amount_is_one` for (`value`) is true
>               - `angle_b` is `Angle_B_Stock_Band.Two_Or_More`.

### `Factory_Dispatch_Coordinator::Request_Qualification::qualify`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Request_Arrival_Sample`.
- Result type: `Factory_Dispatch_Coordinator::Arrival_Fact`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Request_Arrival_Sample.No_Arrival`
>
> **Use:**
>
> `Arrival_Fact.No_Arrival_Fact`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Request_Arrival_Sample.Invalid_R1_AngleA_One`
>   - `value` is `Request_Arrival_Sample.Invalid_R1_AngleA_Two`
>   - `value` is `Request_Arrival_Sample.Invalid_R1_AngleB_One`
>   - `value` is `Request_Arrival_Sample.Invalid_R1_AngleB_Two`
>   - `value` is `Request_Arrival_Sample.Invalid_R2_AngleA_One`
>   - `value` is `Request_Arrival_Sample.Invalid_R2_AngleA_Two`
>   - `value` is `Request_Arrival_Sample.Invalid_R2_AngleB_One`
>   - `value` is `Request_Arrival_Sample.Invalid_R2_AngleB_Two`
>
> **Use:**
>
> `Arrival_Fact.Invalid_Arrival`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Arrival_Sample.Valid_R1_AngleA_One`
>
> **Use:**
>
> `Arrival_Fact.Valid_R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Arrival_Sample.Valid_R1_AngleA_Two`
>
> **Use:**
>
> `Arrival_Fact.Valid_R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Arrival_Sample.Valid_R1_AngleB_One`
>
> **Use:**
>
> `Arrival_Fact.Valid_R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Arrival_Sample.Valid_R1_AngleB_Two`
>
> **Use:**
>
> `Arrival_Fact.Valid_R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Arrival_Sample.Valid_R2_AngleA_One`
>
> **Use:**
>
> `Arrival_Fact.Valid_R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Arrival_Sample.Valid_R2_AngleA_Two`
>
> **Use:**
>
> `Arrival_Fact.Valid_R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Arrival_Sample.Valid_R2_AngleB_One`
>
> **Use:**
>
> `Arrival_Fact.Valid_R2_AngleB_One`
>
> **Otherwise use:**
>
> `Arrival_Fact.Valid_R2_AngleB_Two`.

### `Factory_Dispatch_Coordinator::Request_Registry::arrival_request`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Result type: `Factory_Dispatch_Coordinator::Request_Value`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Arrival_Fact.Valid_R1_AngleA_One`
>
> **Use:**
>
> `Request_Value.R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Arrival_Fact.Valid_R1_AngleA_Two`
>
> **Use:**
>
> `Request_Value.R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Arrival_Fact.Valid_R1_AngleB_One`
>
> **Use:**
>
> `Request_Value.R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Arrival_Fact.Valid_R1_AngleB_Two`
>
> **Use:**
>
> `Request_Value.R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Arrival_Fact.Valid_R2_AngleA_One`
>
> **Use:**
>
> `Request_Value.R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Arrival_Fact.Valid_R2_AngleA_Two`
>
> **Use:**
>
> `Request_Value.R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Arrival_Fact.Valid_R2_AngleB_One`
>
> **Use:**
>
> `Request_Value.R2_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Arrival_Fact.Valid_R2_AngleB_Two`
>
> **Use:**
>
> `Request_Value.R2_AngleB_Two`
>
> **Otherwise use:**
>
> `Request_Value.No_Request`.

### `Factory_Dispatch_Coordinator::Request_Registry::arrival_is_valid`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is not `Arrival_Fact.No_Arrival_Fact` and `value` is not `Arrival_Fact.Invalid_Arrival`.

### `Factory_Dispatch_Coordinator::Request_Registry::result_request`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Result type: `Factory_Dispatch_Coordinator::Request_Value`.

> The function returns the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Shipment_Result_Sample.Valid_R1_Succeeded`
>   - `value` is `Shipment_Result_Sample.Valid_R1_Failed`
>   - `value` is `Shipment_Result_Sample.Invalid_R1_Succeeded`
>   - `value` is `Shipment_Result_Sample.Invalid_R1_Failed`
>
> **Use:**
>
> `Request_Value.R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Shipment_Result_Sample.Valid_R2_Succeeded`
>   - `value` is `Shipment_Result_Sample.Valid_R2_Failed`
>   - `value` is `Shipment_Result_Sample.Invalid_R2_Succeeded`
>   - `value` is `Shipment_Result_Sample.Invalid_R2_Failed`
>
> **Use:**
>
> `Request_Value.R2_AngleA_One`
>
> **Otherwise use:**
>
> `Request_Value.No_Request`.

### `Factory_Dispatch_Coordinator::Request_Registry::result_is_invalid`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Shipment_Result_Sample.Invalid_R1_Succeeded`, `value` is `Shipment_Result_Sample.Invalid_R1_Failed`, `value` is `Shipment_Result_Sample.Invalid_R2_Succeeded`, or `value` is `Shipment_Result_Sample.Invalid_R2_Failed`.

### `Factory_Dispatch_Coordinator::Request_Registry::result_is_valid_success`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Shipment_Result_Sample.Valid_R1_Succeeded` or `value` is `Shipment_Result_Sample.Valid_R2_Succeeded`.

### `Factory_Dispatch_Coordinator::Request_Registry::result_is_valid_failure`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Shipment_Result_Sample.Valid_R1_Failed` or `value` is `Shipment_Result_Sample.Valid_R2_Failed`.

### `Factory_Dispatch_Coordinator::Request_Registry::result_is_valid_present`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - the result of `result_is_valid_success` for (`value`) is true
>   - the result of `result_is_valid_failure` for (`value`) is true.

### `Factory_Dispatch_Coordinator::Request_Registry::active_request_of`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Result type: `Factory_Dispatch_Coordinator::Request_Value`.

> The function returns the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Active_Slot.Pending_R1_AngleA_One`
>   - `value` is `Active_Slot.Submitted_R1_AngleA_One`
>
> **Use:**
>
> `Request_Value.R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Active_Slot.Pending_R1_AngleA_Two`
>   - `value` is `Active_Slot.Submitted_R1_AngleA_Two`
>
> **Use:**
>
> `Request_Value.R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Active_Slot.Pending_R1_AngleB_One`
>   - `value` is `Active_Slot.Submitted_R1_AngleB_One`
>
> **Use:**
>
> `Request_Value.R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Active_Slot.Pending_R1_AngleB_Two`
>   - `value` is `Active_Slot.Submitted_R1_AngleB_Two`
>
> **Use:**
>
> `Request_Value.R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Active_Slot.Pending_R2_AngleA_One`
>   - `value` is `Active_Slot.Submitted_R2_AngleA_One`
>
> **Use:**
>
> `Request_Value.R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Active_Slot.Pending_R2_AngleA_Two`
>   - `value` is `Active_Slot.Submitted_R2_AngleA_Two`
>
> **Use:**
>
> `Request_Value.R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Active_Slot.Pending_R2_AngleB_One`
>   - `value` is `Active_Slot.Submitted_R2_AngleB_One`
>
> **Use:**
>
> `Request_Value.R2_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value` is `Active_Slot.Pending_R2_AngleB_Two`
>   - `value` is `Active_Slot.Submitted_R2_AngleB_Two`
>
> **Use:**
>
> `Request_Value.R2_AngleB_Two`
>
> **Otherwise use:**
>
> `Request_Value.No_Request`.

### `Factory_Dispatch_Coordinator::Request_Registry::completed_request_of`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Completion_Slot`.
- Result type: `Factory_Dispatch_Coordinator::Request_Value`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Completion_Slot.Completed_R1_AngleA_One`
>
> **Use:**
>
> `Request_Value.R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Completion_Slot.Completed_R1_AngleA_Two`
>
> **Use:**
>
> `Request_Value.R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Completion_Slot.Completed_R1_AngleB_One`
>
> **Use:**
>
> `Request_Value.R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Completion_Slot.Completed_R1_AngleB_Two`
>
> **Use:**
>
> `Request_Value.R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Completion_Slot.Completed_R2_AngleA_One`
>
> **Use:**
>
> `Request_Value.R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Completion_Slot.Completed_R2_AngleA_Two`
>
> **Use:**
>
> `Request_Value.R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Completion_Slot.Completed_R2_AngleB_One`
>
> **Use:**
>
> `Request_Value.R2_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Completion_Slot.Completed_R2_AngleB_Two`
>
> **Use:**
>
> `Request_Value.R2_AngleB_Two`
>
> **Otherwise use:**
>
> `Request_Value.No_Request`.

### `Factory_Dispatch_Coordinator::Request_Registry::active_is_submitted`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Active_Slot.Submitted_R1_AngleA_One`, `value` is `Active_Slot.Submitted_R1_AngleA_Two`, `value` is `Active_Slot.Submitted_R1_AngleB_One`, `value` is `Active_Slot.Submitted_R1_AngleB_Two`, `value` is `Active_Slot.Submitted_R2_AngleA_One`, `value` is `Active_Slot.Submitted_R2_AngleA_Two`, `value` is `Active_Slot.Submitted_R2_AngleB_One`, or `value` is `Active_Slot.Submitted_R2_AngleB_Two`.

### `Factory_Dispatch_Coordinator::Request_Registry::active_is_pending`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - `value` is not `Active_Slot.Empty`
>   - It is not the case that:
>     
>     the result of `active_is_submitted` for (`value`) is true.

### `Factory_Dispatch_Coordinator::Request_Registry::same_id`

- Function category: Strictly pure
- Input `left` has type `Factory_Dispatch_Coordinator::Request_Value`.
- Input `right` has type `Factory_Dispatch_Coordinator::Request_Value`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - `left` is not `Request_Value.No_Request`
>   - `right` is not `Request_Value.No_Request`
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - `left` is `Request_Value.R1_AngleA_One`
>               - `left` is `Request_Value.R1_AngleA_Two`
>               - `left` is `Request_Value.R1_AngleB_One`
>               - `left` is `Request_Value.R1_AngleB_Two`
>           - At least one of the following conditions holds:
>             
>               - `right` is `Request_Value.R1_AngleA_One`
>               - `right` is `Request_Value.R1_AngleA_Two`
>               - `right` is `Request_Value.R1_AngleB_One`
>               - `right` is `Request_Value.R1_AngleB_Two`
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - `left` is `Request_Value.R2_AngleA_One`
>               - `left` is `Request_Value.R2_AngleA_Two`
>               - `left` is `Request_Value.R2_AngleB_One`
>               - `left` is `Request_Value.R2_AngleB_Two`
>           - At least one of the following conditions holds:
>             
>               - `right` is `Request_Value.R2_AngleA_One`
>               - `right` is `Request_Value.R2_AngleA_Two`
>               - `right` is `Request_Value.R2_AngleB_One`
>               - `right` is `Request_Value.R2_AngleB_Two`.

### `Factory_Dispatch_Coordinator::Request_Registry::invariant_holds`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Input `c` has type `Factory_Dispatch_Coordinator::Completion_Slot`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - `a` is `Active_Slot.Empty`
>   - It is not the case that:
>     
>     the result of `same_id` for (the result of `active_request_of` for (`a`), the result of `completed_request_of` for (`c`)) is true.

### `Factory_Dispatch_Coordinator::Request_Registry::pending_slot`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Request_Value`.
- Result type: `Factory_Dispatch_Coordinator::Active_Slot`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleA_One`
>
> **Use:**
>
> `Active_Slot.Pending_R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleA_Two`
>
> **Use:**
>
> `Active_Slot.Pending_R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleB_One`
>
> **Use:**
>
> `Active_Slot.Pending_R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleB_Two`
>
> **Use:**
>
> `Active_Slot.Pending_R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleA_One`
>
> **Use:**
>
> `Active_Slot.Pending_R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleA_Two`
>
> **Use:**
>
> `Active_Slot.Pending_R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleB_One`
>
> **Use:**
>
> `Active_Slot.Pending_R2_AngleB_One`
>
> **Otherwise use:**
>
> `Active_Slot.Pending_R2_AngleB_Two`.

### `Factory_Dispatch_Coordinator::Request_Registry::completed_slot`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Request_Value`.
- Result type: `Factory_Dispatch_Coordinator::Completion_Slot`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleA_One`
>
> **Use:**
>
> `Completion_Slot.Completed_R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleA_Two`
>
> **Use:**
>
> `Completion_Slot.Completed_R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleB_One`
>
> **Use:**
>
> `Completion_Slot.Completed_R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R1_AngleB_Two`
>
> **Use:**
>
> `Completion_Slot.Completed_R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleA_One`
>
> **Use:**
>
> `Completion_Slot.Completed_R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleA_Two`
>
> **Use:**
>
> `Completion_Slot.Completed_R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Value.R2_AngleB_One`
>
> **Use:**
>
> `Completion_Slot.Completed_R2_AngleB_One`
>
> **Otherwise use:**
>
> `Completion_Slot.Completed_R2_AngleB_Two`.

### `Factory_Dispatch_Coordinator::Request_Registry::invalid_event`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Input `r` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - `a` is `Arrival_Fact.Invalid_Arrival`
>   - the result of `result_is_invalid` for (`r`) is true
>   - All of the following conditions hold:
>     
>       - the result of `arrival_is_valid` for (`a`) is true
>       - the result of `result_is_valid_present` for (`r`) is true.

### `Factory_Dispatch_Coordinator::Request_Registry::exact_duplicate`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Input `active_pre` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Input `completed_pre` has type `Factory_Dispatch_Coordinator::Completion_Slot`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - the result of `arrival_is_valid` for (`a`) is true
>   - At least one of the following conditions holds:
>     
>       - the result of `arrival_request` for (`a`) is the result of `active_request_of` for (`active_pre`)
>       - the result of `arrival_request` for (`a`) is the result of `completed_request_of` for (`completed_pre`).

### `Factory_Dispatch_Coordinator::Request_Registry::identifier_conflict`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Input `active_pre` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Input `completed_pre` has type `Factory_Dispatch_Coordinator::Completion_Slot`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - the result of `arrival_is_valid` for (`a`) is true
>   - It is not the case that:
>     
>     the result of `exact_duplicate` for (`a`, `active_pre`, `completed_pre`) is true
>   - At least one of the following conditions holds:
>     
>       - the result of `same_id` for (the result of `arrival_request` for (`a`), the result of `active_request_of` for (`active_pre`)) is true
>       - the result of `same_id` for (the result of `arrival_request` for (`a`), the result of `completed_request_of` for (`completed_pre`)) is true.

### `Factory_Dispatch_Coordinator::Request_Registry::event_active`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Input `r` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Input `active_pre` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Input `completed_pre` has type `Factory_Dispatch_Coordinator::Completion_Slot`.
- Result type: `Factory_Dispatch_Coordinator::Active_Slot`.

> The function returns the value selected as follows:
>
> **If:**
>
> the result of `invalid_event` for (`a`, `r`) is true
>
> **Use:**
>
> `active_pre`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - the result of `result_is_valid_success` for (`r`) is true
>   - the result of `active_is_submitted` for (`active_pre`) is true
>   - the result of `same_id` for (the result of `result_request` for (`r`), the result of `active_request_of` for (`active_pre`)) is true
>
> **Use:**
>
> `Active_Slot.Empty`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - the result of `result_is_valid_failure` for (`r`) is true
>   - the result of `active_is_submitted` for (`active_pre`) is true
>   - the result of `same_id` for (the result of `result_request` for (`r`), the result of `active_request_of` for (`active_pre`)) is true
>
> **Use:**
>
> the result of `pending_slot` for (the result of `active_request_of` for (`active_pre`))
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `result_is_valid_present` for (`r`) is true
>
> **Use:**
>
> `active_pre`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `a` is `Arrival_Fact.No_Arrival_Fact`
>
> **Use:**
>
> `active_pre`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `exact_duplicate` for (`a`, `active_pre`, `completed_pre`) is true
>
> **Use:**
>
> `active_pre`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `identifier_conflict` for (`a`, `active_pre`, `completed_pre`) is true
>
> **Use:**
>
> `active_pre`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `active_pre` is `Active_Slot.Empty`
>
> **Use:**
>
> the result of `pending_slot` for (the result of `arrival_request` for (`a`))
>
> **Otherwise use:**
>
> `active_pre`.

### `Factory_Dispatch_Coordinator::Request_Registry::event_completion`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Input `r` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Input `active_pre` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Input `completed_pre` has type `Factory_Dispatch_Coordinator::Completion_Slot`.
- Result type: `Factory_Dispatch_Coordinator::Completion_Slot`.

> The function returns the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `invalid_event` for (`a`, `r`) is true
>   - the result of `result_is_valid_success` for (`r`) is true
>   - the result of `active_is_submitted` for (`active_pre`) is true
>   - the result of `same_id` for (the result of `result_request` for (`r`), the result of `active_request_of` for (`active_pre`)) is true
>
> **Use:**
>
> the result of `completed_slot` for (the result of `active_request_of` for (`active_pre`))
>
> **Otherwise use:**
>
> `completed_pre`.

### `Factory_Dispatch_Coordinator::Request_Registry::event_outcome`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Input `r` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Input `active_pre` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Input `completed_pre` has type `Factory_Dispatch_Coordinator::Completion_Slot`.
- Result type: `Factory_Dispatch_Coordinator::Registry_Outcome`.

> The function returns the value selected as follows:
>
> **If:**
>
> the result of `invalid_event` for (`a`, `r`) is true
>
> **Use:**
>
> `Registry_Outcome.Invalid_Event`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - the result of `result_is_valid_success` for (`r`) is true
>   - the result of `active_is_submitted` for (`active_pre`) is true
>   - the result of `same_id` for (the result of `result_request` for (`r`), the result of `active_request_of` for (`active_pre`)) is true
>
> **Use:**
>
> `Registry_Outcome.Shipment_Confirmed`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - the result of `result_is_valid_failure` for (`r`) is true
>   - the result of `active_is_submitted` for (`active_pre`) is true
>   - the result of `same_id` for (the result of `result_request` for (`r`), the result of `active_request_of` for (`active_pre`)) is true
>
> **Use:**
>
> `Registry_Outcome.Shipment_Failed_Retry_Pending`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `result_is_valid_present` for (`r`) is true
>
> **Use:**
>
> `Registry_Outcome.Stale_Result`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `a` is `Arrival_Fact.No_Arrival_Fact`
>
> **Use:**
>
> `Registry_Outcome.No_Registry_Notice`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `exact_duplicate` for (`a`, `active_pre`, `completed_pre`) is true
>
> **Use:**
>
> `Registry_Outcome.Duplicate_Acknowledged`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `identifier_conflict` for (`a`, `active_pre`, `completed_pre`) is true
>
> **Use:**
>
> `Registry_Outcome.Identifier_Conflict`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `active_pre` is `Active_Slot.Empty`
>
> **Use:**
>
> `Registry_Outcome.Request_Accepted`
>
> **Otherwise use:**
>
> `Registry_Outcome.Busy`.

### `Factory_Dispatch_Coordinator::Request_Registry::event_recovery_hold`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Input `r` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Input `active_pre` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `invalid_event` for (`a`, `r`) is true
>   - the result of `result_is_valid_failure` for (`r`) is true
>   - the result of `active_is_submitted` for (`active_pre`) is true
>   - the result of `same_id` for (the result of `result_request` for (`r`), the result of `active_request_of` for (`active_pre`)) is true.

### `Factory_Dispatch_Coordinator::Request_Registry::event_blocked`

- Function category: Strictly pure
- Input `a` has type `Factory_Dispatch_Coordinator::Arrival_Fact`.
- Input `r` has type `Factory_Dispatch_Coordinator::Shipment_Result_Sample`.
- Input `active_pre` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Input `completed_pre` has type `Factory_Dispatch_Coordinator::Completion_Slot`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - the result of `invalid_event` for (`a`, `r`) is true
>   - All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         the result of `result_is_valid_present` for (`r`) is true
>       - the result of `identifier_conflict` for (`a`, `active_pre`, `completed_pre`) is true.

### `Factory_Dispatch_Coordinator::Request_Registry::pending_view`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Result type: `Factory_Dispatch_Coordinator::Pending_Request_View`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Active_Slot.Pending_R1_AngleA_One`
>
> **Use:**
>
> `Pending_Request_View.Pending_R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Active_Slot.Pending_R1_AngleA_Two`
>
> **Use:**
>
> `Pending_Request_View.Pending_R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Active_Slot.Pending_R1_AngleB_One`
>
> **Use:**
>
> `Pending_Request_View.Pending_R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Active_Slot.Pending_R1_AngleB_Two`
>
> **Use:**
>
> `Pending_Request_View.Pending_R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Active_Slot.Pending_R2_AngleA_One`
>
> **Use:**
>
> `Pending_Request_View.Pending_R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Active_Slot.Pending_R2_AngleA_Two`
>
> **Use:**
>
> `Pending_Request_View.Pending_R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Active_Slot.Pending_R2_AngleB_One`
>
> **Use:**
>
> `Pending_Request_View.Pending_R2_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Active_Slot.Pending_R2_AngleB_Two`
>
> **Use:**
>
> `Pending_Request_View.Pending_R2_AngleB_Two`
>
> **Otherwise use:**
>
> `Pending_Request_View.No_Pending_Request`.

### `Factory_Dispatch_Coordinator::Request_Registry::candidate_request`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Result type: `Factory_Dispatch_Coordinator::Request_Value`.

> The function returns the value selected as follows:
>
> **If:**
>
> the result of `active_is_pending` for (`value`) is true
>
> **Use:**
>
> the result of `active_request_of` for (`value`)
>
> **Otherwise use:**
>
> `Request_Value.No_Request`.

### `Factory_Dispatch_Coordinator::Request_Registry::committed_active`

- Function category: Strictly pure
- Input `provisional` has type `Factory_Dispatch_Coordinator::Active_Slot`.
- Input `instruction` has type `Factory_Dispatch_Coordinator::Registry_Instruction`.
- Result type: `Factory_Dispatch_Coordinator::Active_Slot`.

> The function returns the value selected as follows:
>
> **If:**
>
> `instruction` is `Registry_Instruction.Mark_Submitted_R1_AngleA_One`
>
> **Use:**
>
> `Active_Slot.Submitted_R1_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `instruction` is `Registry_Instruction.Mark_Submitted_R1_AngleA_Two`
>
> **Use:**
>
> `Active_Slot.Submitted_R1_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `instruction` is `Registry_Instruction.Mark_Submitted_R1_AngleB_One`
>
> **Use:**
>
> `Active_Slot.Submitted_R1_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `instruction` is `Registry_Instruction.Mark_Submitted_R1_AngleB_Two`
>
> **Use:**
>
> `Active_Slot.Submitted_R1_AngleB_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `instruction` is `Registry_Instruction.Mark_Submitted_R2_AngleA_One`
>
> **Use:**
>
> `Active_Slot.Submitted_R2_AngleA_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `instruction` is `Registry_Instruction.Mark_Submitted_R2_AngleA_Two`
>
> **Use:**
>
> `Active_Slot.Submitted_R2_AngleA_Two`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `instruction` is `Registry_Instruction.Mark_Submitted_R2_AngleB_One`
>
> **Use:**
>
> `Active_Slot.Submitted_R2_AngleB_One`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `instruction` is `Registry_Instruction.Mark_Submitted_R2_AngleB_Two`
>
> **Use:**
>
> `Active_Slot.Submitted_R2_AngleB_Two`
>
> **Otherwise use:**
>
> `provisional`.

## Detailed behavioral requirements

### Requirements for Customer Notice Synthesis

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NOTICE_NONE` — Required behavior

> During contract evaluation for the initialization phase, Customer Notice Synthesis shall set customer notice to None.

#### Contract clauses evaluated in the compute phase

##### `NOTICE_PRIORITY_RESOLUTION` — Required behavior

> During contract evaluation for the compute phase, Customer Notice Synthesis shall set customer notice to the result of Customer Notice Synthesis dispatch coordination process customer notice synthesis notice for for (registry outcome, dispatch disposition).

### Requirements for Dispatch Arbiter

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ARBITER_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Dispatch Arbiter shall set registry instruction to No State Instruction, shipment release to No Release, and dispatch disposition to No Dispatch Demand.

#### Contract clauses evaluated in the compute phase

##### `CASE_10_NO_DISPATCH_DEMAND` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch candidate request is No Request, Dispatch Arbiter shall set shipment release to No Release, registry instruction to No State Instruction, and dispatch disposition to No Dispatch Demand.

##### `CASE_11_FIRST_BLOCKER` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 11 FIRST BLOCKER applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - dispatch candidate request is not No Request
>   - It is not the case that:
>     
>     the result of Dispatch Arbiter dispatch coordination process dispatch arbiter release eligible for (dispatch candidate, inventory finding, readiness sample) is true.

> When all applicability conditions are met, Dispatch Arbiter shall produce a result for which all of the following conditions hold:
>
> shipment release is No Release, registry instruction is No State Instruction, and dispatch disposition is the result of Dispatch Arbiter dispatch coordination process dispatch arbiter blocker disposition for (dispatch candidate, inventory finding, readiness sample).

##### `CASE_12_AUTHORIZE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 AUTHORIZE applies under all of the following conditions:
>
> the result of Dispatch Arbiter dispatch coordination process dispatch arbiter release eligible for (dispatch candidate, inventory finding, readiness sample) is true.

> When all applicability conditions are met, Dispatch Arbiter shall produce a result for which all of the following conditions hold:
>
> shipment release is the result of Dispatch Arbiter dispatch coordination process dispatch arbiter release for for (dispatch candidate request), registry instruction is the result of Dispatch Arbiter dispatch coordination process dispatch arbiter instruction for for (dispatch candidate request), and dispatch disposition is Release Issued.

### Requirements for Inventory Assessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_INVENTORY_NO_DEMAND` — Required behavior

> During contract evaluation for the initialization phase, Inventory Assessment shall set inventory finding to No Demand.

#### Contract clauses evaluated in the compute phase

##### `STOCK_NO_DEMAND` — Conditional behavior

> During contract evaluation for the compute phase, if pending request is No Pending Request, Inventory Assessment shall set inventory finding to No Demand.

##### `STOCK_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if pending request is not No Pending Request and inventory evidence status is Invalid, Inventory Assessment shall set inventory finding to Invalid Inventory.

##### `STOCK_SUFFICIENT` — Conditional behavior

> During contract evaluation for the compute phase, case STOCK SUFFICIENT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - pending request is not No Pending Request
>   - inventory evidence status is Valid
>   - the result of Inventory Assessment dispatch coordination process inventory assessment stock is sufficient for (pending request, inventory evidence stock band angle a, inventory evidence stock band angle b) is true.

> When all applicability conditions are met, Inventory Assessment shall produce a result for which all of the following conditions hold:
>
> inventory finding is Sufficient.

##### `STOCK_INSUFFICIENT` — Conditional behavior

> During contract evaluation for the compute phase, case STOCK INSUFFICIENT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - pending request is not No Pending Request
>   - inventory evidence status is Valid
>   - It is not the case that:
>     
>     the result of Inventory Assessment dispatch coordination process inventory assessment stock is sufficient for (pending request, inventory evidence stock band angle a, inventory evidence stock band angle b) is true.

> When all applicability conditions are met, Inventory Assessment shall produce a result for which all of the following conditions hold:
>
> inventory finding is Insufficient.

### Requirements for Request Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_QUALIFICATION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Request Qualification shall set arrival fact to No Arrival Fact.

#### Contract clauses evaluated in the compute phase

##### `QUAL_NO_ARRIVAL` — Conditional behavior

> During contract evaluation for the compute phase, if request arrival is No Arrival, Request Qualification shall set arrival fact to the result of Request Qualification dispatch coordination process request qualification qualify for (request arrival).

##### `QUAL_INVALID_ARRIVAL` — Conditional behavior

> During contract evaluation for the compute phase, if request arrival is Invalid R1 AngleA One, request arrival is Invalid R1 AngleA Two, request arrival is Invalid R1 AngleB One, request arrival is Invalid R1 AngleB Two, request arrival is Invalid R2 AngleA One, request arrival is Invalid R2 AngleA Two, request arrival is Invalid R2 AngleB One, or request arrival is Invalid R2 AngleB Two, Request Qualification shall set arrival fact to the result of Request Qualification dispatch coordination process request qualification qualify for (request arrival).

##### `QUAL_VALID_ARRIVAL` — Conditional behavior

> During contract evaluation for the compute phase, if request arrival is Valid R1 AngleA One, request arrival is Valid R1 AngleA Two, request arrival is Valid R1 AngleB One, request arrival is Valid R1 AngleB Two, request arrival is Valid R2 AngleA One, request arrival is Valid R2 AngleA Two, request arrival is Valid R2 AngleB One, or request arrival is Valid R2 AngleB Two, Request Qualification shall set arrival fact to the result of Request Qualification dispatch coordination process request qualification qualify for (request arrival).

### Requirements for Request Registry

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REGISTRY_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Request Registry shall set active to Empty, last completed to No Completion, pending request to No Pending Request, dispatch candidate request to No Request, dispatch candidate event blocked to true exactly when F is true, dispatch candidate recovery hold to true exactly when F is true, and registry outcome to No Registry Notice.

#### Contract clauses evaluated in the compute phase

##### `REGISTRY_LOCAL_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, Request Registry shall set registry outcome to the result of Request Registry dispatch coordination process request registry event outcome for (arrival fact, shipment result, the value of active on entry, the value of last completed on entry), pending request to the result of Request Registry dispatch coordination process request registry pending view for (the result of Request Registry dispatch coordination process request registry event active for (arrival fact, shipment result, the value of active on entry, the value of last completed on entry)), dispatch candidate request to the result of Request Registry dispatch coordination process request registry candidate request for (the result of Request Registry dispatch coordination process request registry event active for (arrival fact, shipment result, the value of active on entry, the value of last completed on entry)), dispatch candidate event blocked to true exactly when the result of Request Registry dispatch coordination process request registry event blocked for (arrival fact, shipment result, the value of active on entry, the value of last completed on entry) is true, dispatch candidate recovery hold to true exactly when the result of Request Registry dispatch coordination process request registry event recovery hold for (arrival fact, shipment result, the value of active on entry) is true, active to the result of Request Registry dispatch coordination process request registry committed active for (the result of Request Registry dispatch coordination process request registry event active for (arrival fact, shipment result, the value of active on entry, the value of last completed on entry), registry instruction), and last completed to the result of Request Registry dispatch coordination process request registry event completion for (arrival fact, shipment result, the value of active on entry, the value of last completed on entry).

##### `REGISTRY_STATE_INVARIANT` — Required behavior

> During contract evaluation for the compute phase, Request Registry shall produce a result for which all of the following conditions hold:
>
> the result of Request Registry dispatch coordination process request registry invariant holds for (active, last completed) is true.

##### `CASE_01_INVALID_OR_SIMULTANEOUS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 01 INVALID OR SIMULTANEOUS applies under all of the following conditions:
>
> the result of Request Registry dispatch coordination process request registry invalid event for (arrival fact, shipment result) is true.

> When all applicability conditions are met, Request Registry shall produce a result for which all of the following conditions hold:
>
> registry outcome is Invalid Event, dispatch candidate event blocked is true exactly when T is true, dispatch candidate recovery hold is true exactly when F is true, and pending request is the result of Request Registry dispatch coordination process request registry pending view for (the value of active on entry).

##### `CASE_02_MATCHING_SUCCESS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 MATCHING SUCCESS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of Request Registry dispatch coordination process request registry invalid event for (arrival fact, shipment result) is true
>   - the result of Request Registry dispatch coordination process request registry result is valid success for (shipment result) is true
>   - the result of Request Registry dispatch coordination process request registry active is submitted for (the value of active on entry) is true
>   - the result of Request Registry dispatch coordination process request registry same id for (the result of Request Registry dispatch coordination process request registry result request for (shipment result), the result of Request Registry dispatch coordination process request registry active request of for (the value of active on entry)) is true.

> When all applicability conditions are met, Request Registry shall produce a result for which all of the following conditions hold:
>
> registry outcome is Shipment Confirmed, active is Empty, last completed is the result of Request Registry dispatch coordination process request registry completed slot for (the result of Request Registry dispatch coordination process request registry active request of for (the value of active on entry)), and dispatch candidate request is No Request.

##### `CASE_03_MATCHING_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 03 MATCHING FAILURE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of Request Registry dispatch coordination process request registry invalid event for (arrival fact, shipment result) is true
>   - the result of Request Registry dispatch coordination process request registry result is valid failure for (shipment result) is true
>   - the result of Request Registry dispatch coordination process request registry active is submitted for (the value of active on entry) is true
>   - the result of Request Registry dispatch coordination process request registry same id for (the result of Request Registry dispatch coordination process request registry result request for (shipment result), the result of Request Registry dispatch coordination process request registry active request of for (the value of active on entry)) is true.

> When all applicability conditions are met, Request Registry shall produce a result for which all of the following conditions hold:
>
> registry outcome is Shipment Failed Retry Pending, active is the result of Request Registry dispatch coordination process request registry pending slot for (the result of Request Registry dispatch coordination process request registry active request of for (the value of active on entry)), last completed is the value of last completed on entry, and dispatch candidate recovery hold is true exactly when T is true.

##### `CASE_04_STALE_RESULT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 04 STALE RESULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of Request Registry dispatch coordination process request registry invalid event for (arrival fact, shipment result) is true
>   - the result of Request Registry dispatch coordination process request registry result is valid present for (shipment result) is true
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - the result of Request Registry dispatch coordination process request registry active is submitted for (the value of active on entry) is true
>       - the result of Request Registry dispatch coordination process request registry same id for (the result of Request Registry dispatch coordination process request registry result request for (shipment result), the result of Request Registry dispatch coordination process request registry active request of for (the value of active on entry)) is true.

> When all applicability conditions are met, Request Registry shall produce a result for which all of the following conditions hold:
>
> registry outcome is Stale Result, active is the value of active on entry, and last completed is the value of last completed on entry.

##### `CASE_05_NO_EVENT` — Conditional behavior

> During contract evaluation for the compute phase, if arrival fact is No Arrival Fact and shipment result is No Result, Request Registry shall set registry outcome to No Registry Notice, pending request to the result of Request Registry dispatch coordination process request registry pending view for (the value of active on entry), dispatch candidate event blocked to true exactly when F is true, and dispatch candidate recovery hold to true exactly when F is true.

##### `CASE_06_EXACT_DUPLICATE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 EXACT DUPLICATE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - shipment result is No Result
>   - the result of Request Registry dispatch coordination process request registry exact duplicate for (arrival fact, the value of active on entry, the value of last completed on entry) is true.

> When all applicability conditions are met, Request Registry shall produce a result for which all of the following conditions hold:
>
> registry outcome is Duplicate Acknowledged, pending request is the result of Request Registry dispatch coordination process request registry pending view for (the value of active on entry), and dispatch candidate event blocked is true exactly when F is true.

##### `CASE_07_IDENTIFIER_CONFLICT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 IDENTIFIER CONFLICT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - shipment result is No Result
>   - the result of Request Registry dispatch coordination process request registry identifier conflict for (arrival fact, the value of active on entry, the value of last completed on entry) is true.

> When all applicability conditions are met, Request Registry shall produce a result for which all of the following conditions hold:
>
> registry outcome is Identifier Conflict, active is the value of active on entry, last completed is the value of last completed on entry, dispatch candidate event blocked is true exactly when T is true, and dispatch candidate recovery hold is true exactly when F is true.

##### `CASE_08_ACCEPT_FRESH` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 ACCEPT FRESH applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - shipment result is No Result
>   - the result of Request Registry dispatch coordination process request registry arrival is valid for (arrival fact) is true
>   - It is not the case that:
>     
>     the result of Request Registry dispatch coordination process request registry exact duplicate for (arrival fact, the value of active on entry, the value of last completed on entry) is true
>   - It is not the case that:
>     
>     the result of Request Registry dispatch coordination process request registry identifier conflict for (arrival fact, the value of active on entry, the value of last completed on entry) is true
>   - the value of active on entry is Empty.

> When all applicability conditions are met, Request Registry shall produce a result for which all of the following conditions hold:
>
> registry outcome is Request Accepted, pending request is the result of Request Registry dispatch coordination process request registry pending view for (the result of Request Registry dispatch coordination process request registry pending slot for (the result of Request Registry dispatch coordination process request registry arrival request for (arrival fact))), and dispatch candidate request is the result of Request Registry dispatch coordination process request registry arrival request for (arrival fact).

##### `CASE_09_BUSY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 BUSY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - shipment result is No Result
>   - the result of Request Registry dispatch coordination process request registry arrival is valid for (arrival fact) is true
>   - It is not the case that:
>     
>     the result of Request Registry dispatch coordination process request registry exact duplicate for (arrival fact, the value of active on entry, the value of last completed on entry) is true
>   - It is not the case that:
>     
>     the result of Request Registry dispatch coordination process request registry identifier conflict for (arrival fact, the value of active on entry, the value of last completed on entry) is true
>   - the value of active on entry is not Empty.

> When all applicability conditions are met, Request Registry shall produce a result for which all of the following conditions hold:
>
> registry outcome is Busy, pending request is the result of Request Registry dispatch coordination process request registry pending view for (the value of active on entry), and dispatch candidate request is the result of Request Registry dispatch coordination process request registry candidate request for (the value of active on entry).
