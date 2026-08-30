# Finished-Product Dispatch Coordinator

## Selected system context

### Goals

GOAL-01: The system shall release a fresh dispatch only when the request is admissible,
matching inventory is sufficient, the dock observation is usable and ready, and no
protected active or recovery commitment has precedence.

GOAL-02: The system shall preserve one active dispatch identity through execution
feedback, terminal confirmation, and at most one recovery attempt so that a competing
fresh request cannot displace committed work.

GOAL-03: The system shall expose deterministic rejection, waiting, active, recovery,
completion, and failure outcomes for every finite input/state partition without claiming
physical shipment success before matching completion feedback.

### Operational context and boundary

CTX-01: The Sales Order Source is outside the system. It presents a candidate
finished-product dispatch request and receives coordinator status and terminal shipping
confirmation; direct communication to the seed's Customer is outside this boundary.

CTX-02: Storage is outside the system. It supplies a bounded inventory snapshot for one
product but retains all responsibility for physical inventory and material movement.

CTX-03: Dispatch Execution is outside the system. It supplies dock observations and
shipment execution outcomes, and receives shipment instruction events; it includes the
unmodeled facility/carrier activity needed to act on those instructions.

CTX-04: The Customer and Supplier remain seed context but have no direct port or
controlled quantity in this selected system. Customer interaction is mediated by CTX-01,
and Supplier/procurement behavior is excluded.

MON-01: `request` is supplied by CTX-01 and has the exact finite product type
`RawDispatchRequest(requestId, productId, amount, freshness)`: `requestId` is `None | R1
| R2 | R3 | R4 | R5 | R6 | R7 | R8`; `productId` is `None | P1 | P2 | P3 | P4`; `amount`
denotes `0..4`; and `freshness` is `Fresh | Repeated`.

MON-02: `inventorySnapshot` is supplied by CTX-02 and has the exact finite type
`InventorySnapshot(status, productId, availableAmount)`: `status` is `Valid | Invalid`;
`productId` uses the MON-01 product domain; and `availableAmount` denotes `0..4`.

MON-03: `dockSnapshot` is supplied by CTX-03 and has the exact finite type
`DockSnapshot(status, disposition)`: `status` is `Valid | Invalid`; and `disposition` is
`Ready | Occupied | Unavailable`.

MON-04: `executionOutcome` is supplied by CTX-03 and has the exact finite type
`ExecutionOutcome(requestId, attempt, result)`: `requestId` uses the MON-01 request
domain; `attempt` is `FreshAttempt | RetryAttempt`; and `result` is `NoReport |
InProgress | Completed | Failed`.

CTRL-01: `shipmentInstruction` is received by CTX-03 and has the exact finite type
`ShipmentInstruction(kind, requestId, productId, amount)`: `kind` is `NoInstruction |
ReleaseFresh | ReleaseRetry | Cancel`; identifiers and amount use the MON-01 domains.
`ReleaseFresh` and `ReleaseRetry` shall carry the active non-`None` identifiers and
amount `1..4`; `Cancel` shall carry the aborted active request; `NoInstruction` shall
carry `None`, `None`, and `0`.

CTRL-02: `shippingConfirmation` is received by CTX-01 and has the exact finite type
`ShippingConfirmation(kind, requestId)`: `kind` is `None | Shipped | DispatchFailed`; a
terminal kind shall carry the corresponding non-`None` active request identifier, and
`None` shall carry `None`.

CTRL-03: `dispatchStatus` is received by CTX-01 and has the exact finite enumeration
`Idle | Rejected | WaitingInventory | WaitingDock | Busy | Released | Recovering |
Completed | Failed`.

### Essential pilot assumptions

ASM-01: CTX-01 is responsible for presenting at most one request value at a time and for
holding a fresh well-formed request stable while it accepts `WaitingInventory` or
`WaitingDock`; after `Busy` or `Rejected`, any later attempt is a newly presented
request. Rationale: the selected system has no request queue or withdrawal protocol.

ASM-02: CTX-01 is responsible for setting `freshness` consistently with its own business
history. The system checks well-formedness and treats `Repeated` conservatively but does
not reconstruct global sales history. Rationale: the seed supplies identifiers but no
authoritative order-history store.

ASM-03: CTX-02 is responsible only for the stated snapshot fields and validity status; a
valid snapshot need not remain unchanged after a release. Rationale: the coordinator
uses a decision observation and does not reserve or decrement physical stock.

ASM-04: CTX-03 is responsible for reporting an outcome with the request and attempt it
concerns. PART-04 still handles mismatched feedback by deriving `Preserve`. Rationale:
explicit correlation prevents unrelated feedback from completing the active dispatch.

ASM-05: CTX-03 is responsible for interpreting each non-`NoInstruction` value as an
event and not as evidence that physical execution succeeded. Rationale: no
acknowledgement timing or actuator feedback is source-grounded.

ASM-06: All four monitored values are available together for an abstract evaluation
step, and output/state changes from one step are observed before the next. No period,
deadline, latency, or throughput is assumed. Rationale: this supplies ordering semantics
without fabricating quantitative timing.

### Risks and mitigations

RISK-01: If an unrelated or stale execution report were accepted as completion, the
coordinator could falsely confirm shipment and release its commitment. PART-04's POL-05
correlation and FAULT-03 mitigate this consequence; likelihood and severity are not
asserted.

RISK-02: If a new request displaced failed committed work, the original dispatch could
lose identity or be retried with the wrong payload. FAULT-04, POL-06, CCASE-14, and
CCASE-17 mitigate this consequence; likelihood and severity are not asserted.

RISK-03: If a first execution failure caused unbounded retry, the coordinator could
monopolize dispatch indefinitely. CCASE-16 and CCASE-18 bound recovery to one retry and
make terminal failure observable; no time-to-recovery claim is made.

## Supporting contract definitions

### State `Factory_Dispatch_Coordinator::Commitment_Tracker::lifecycle`

State `lifecycle` has type `Factory_Dispatch_Coordinator::Dispatch_Lifecycle`.

### State `Factory_Dispatch_Coordinator::Commitment_Tracker::active_request_id`

State `active_request_id` has type `Factory_Dispatch_Coordinator::Request_Id`.

### State `Factory_Dispatch_Coordinator::Commitment_Tracker::active_product_id`

State `active_product_id` has type `Factory_Dispatch_Coordinator::Product_Id`.

### State `Factory_Dispatch_Coordinator::Commitment_Tracker::active_amount`

State `active_amount` has type `Factory_Dispatch_Coordinator::Dispatch_Amount`.

### State `Factory_Dispatch_Coordinator::Commitment_Tracker::active_attempt`

State `active_attempt` has type `Factory_Dispatch_Coordinator::Dispatch_Attempt`.

### `Factory_Dispatch_Coordinator::Commitment_Tracker::context_id`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Request_Id`.
- Result type: `Factory_Dispatch_Coordinator::Context_Request_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R1`
>
> **Use:**
>
> `Context_Request_Id.R1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R2`
>
> **Use:**
>
> `Context_Request_Id.R2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R3`
>
> **Use:**
>
> `Context_Request_Id.R3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R4`
>
> **Use:**
>
> `Context_Request_Id.R4`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R5`
>
> **Use:**
>
> `Context_Request_Id.R5`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R6`
>
> **Use:**
>
> `Context_Request_Id.R6`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R7`
>
> **Use:**
>
> `Context_Request_Id.R7`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R8`
>
> **Use:**
>
> `Context_Request_Id.R8`
>
> **Otherwise use:**
>
> `Context_Request_Id.None`.

### `Factory_Dispatch_Coordinator::Commitment_Tracker::context_attempt`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Dispatch_Attempt`.
- Result type: `Factory_Dispatch_Coordinator::Context_Attempt`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Attempt.RetryAttempt`
>
> **Use:**
>
> `Context_Attempt.RetryAttempt`
>
> **Otherwise use:**
>
> `Context_Attempt.FreshAttempt`.

### `Factory_Dispatch_Coordinator::Commitment_Tracker::capacity_id`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Request_Id`.
- Result type: `Factory_Dispatch_Coordinator::Capacity_Request_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R1`
>
> **Use:**
>
> `Capacity_Request_Id.R1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R2`
>
> **Use:**
>
> `Capacity_Request_Id.R2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R3`
>
> **Use:**
>
> `Capacity_Request_Id.R3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R4`
>
> **Use:**
>
> `Capacity_Request_Id.R4`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R5`
>
> **Use:**
>
> `Capacity_Request_Id.R5`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R6`
>
> **Use:**
>
> `Capacity_Request_Id.R6`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R7`
>
> **Use:**
>
> `Capacity_Request_Id.R7`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Request_Id.R8`
>
> **Use:**
>
> `Capacity_Request_Id.R8`
>
> **Otherwise use:**
>
> `Capacity_Request_Id.None`.

### `Factory_Dispatch_Coordinator::Commitment_Tracker::capacity_product_id`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Product_Id`.
- Result type: `Factory_Dispatch_Coordinator::Capacity_Product_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Product_Id.P1`
>
> **Use:**
>
> `Capacity_Product_Id.P1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Product_Id.P2`
>
> **Use:**
>
> `Capacity_Product_Id.P2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Product_Id.P3`
>
> **Use:**
>
> `Capacity_Product_Id.P3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Product_Id.P4`
>
> **Use:**
>
> `Capacity_Product_Id.P4`
>
> **Otherwise use:**
>
> `Capacity_Product_Id.None`.

### `Factory_Dispatch_Coordinator::Commitment_Tracker::capacity_quantity`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Dispatch_Amount`.
- Result type: `Factory_Dispatch_Coordinator::Capacity_Amount`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Amount.A1`
>
> **Use:**
>
> `Capacity_Amount.A1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Amount.A2`
>
> **Use:**
>
> `Capacity_Amount.A2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Amount.A3`
>
> **Use:**
>
> `Capacity_Amount.A3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Amount.A4`
>
> **Use:**
>
> `Capacity_Amount.A4`
>
> **Otherwise use:**
>
> `Capacity_Amount.A0`.

### `Factory_Dispatch_Coordinator::Confirmation_Determiner::request_id`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Confirmation_Request_Id`.
- Result type: `Factory_Dispatch_Coordinator::Request_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Confirmation_Request_Id.R1`
>
> **Use:**
>
> `Request_Id.R1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Confirmation_Request_Id.R2`
>
> **Use:**
>
> `Request_Id.R2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Confirmation_Request_Id.R3`
>
> **Use:**
>
> `Request_Id.R3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Confirmation_Request_Id.R4`
>
> **Use:**
>
> `Request_Id.R4`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Confirmation_Request_Id.R5`
>
> **Use:**
>
> `Request_Id.R5`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Confirmation_Request_Id.R6`
>
> **Use:**
>
> `Request_Id.R6`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Confirmation_Request_Id.R7`
>
> **Use:**
>
> `Request_Id.R7`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Confirmation_Request_Id.R8`
>
> **Use:**
>
> `Request_Id.R8`
>
> **Otherwise use:**
>
> `Request_Id.None`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::amount_at_least`

- Function category: Strictly pure
- Input `available` has type `Factory_Dispatch_Coordinator::Inventory_Amount`.
- Input `required` has type `Factory_Dispatch_Coordinator::Dispatch_Amount`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - `required` is `Dispatch_Amount.A0`
>   - All of the following conditions hold:
>     
>       - `required` is `Dispatch_Amount.A1`
>       - `available` is not `Inventory_Amount.A0`
>   - All of the following conditions hold:
>     
>       - `required` is `Dispatch_Amount.A2`
>       - At least one of the following conditions holds:
>         
>           - `available` is `Inventory_Amount.A2`
>           - `available` is `Inventory_Amount.A3`
>           - `available` is `Inventory_Amount.A4`
>   - All of the following conditions hold:
>     
>       - `required` is `Dispatch_Amount.A3`
>       - At least one of the following conditions holds:
>         
>           - `available` is `Inventory_Amount.A3`
>           - `available` is `Inventory_Amount.A4`
>   - All of the following conditions hold:
>     
>       - `required` is `Dispatch_Amount.A4`
>       - `available` is `Inventory_Amount.A4`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::amount_below`

- Function category: Strictly pure
- Input `available` has type `Factory_Dispatch_Coordinator::Inventory_Amount`.
- Input `required` has type `Factory_Dispatch_Coordinator::Dispatch_Amount`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `required` is `Dispatch_Amount.A1`
>       - `available` is `Inventory_Amount.A0`
>   - All of the following conditions hold:
>     
>       - `required` is `Dispatch_Amount.A2`
>       - At least one of the following conditions holds:
>         
>           - `available` is `Inventory_Amount.A0`
>           - `available` is `Inventory_Amount.A1`
>   - All of the following conditions hold:
>     
>       - `required` is `Dispatch_Amount.A3`
>       - At least one of the following conditions holds:
>         
>           - `available` is `Inventory_Amount.A0`
>           - `available` is `Inventory_Amount.A1`
>           - `available` is `Inventory_Amount.A2`
>   - All of the following conditions hold:
>     
>       - `required` is `Dispatch_Amount.A4`
>       - `available` is not `Inventory_Amount.A4`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::same_product`

- Function category: Strictly pure
- Input `inventory_product` has type `Factory_Dispatch_Coordinator::Inventory_Product_Id`.
- Input `requested_product` has type `Factory_Dispatch_Coordinator::Product_Id`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `inventory_product` is `Inventory_Product_Id.P1`
>       - `requested_product` is `Product_Id.P1`
>   - All of the following conditions hold:
>     
>       - `inventory_product` is `Inventory_Product_Id.P2`
>       - `requested_product` is `Product_Id.P2`
>   - All of the following conditions hold:
>     
>       - `inventory_product` is `Inventory_Product_Id.P3`
>       - `requested_product` is `Product_Id.P3`
>   - All of the following conditions hold:
>     
>       - `inventory_product` is `Inventory_Product_Id.P4`
>       - `requested_product` is `Product_Id.P4`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::recovery_amount_at_least`

- Function category: Strictly pure
- Input `available` has type `Factory_Dispatch_Coordinator::Inventory_Amount`.
- Input `required` has type `Factory_Dispatch_Coordinator::Capacity_Amount`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - `required` is `Capacity_Amount.A0`
>   - All of the following conditions hold:
>     
>       - `required` is `Capacity_Amount.A1`
>       - `available` is not `Inventory_Amount.A0`
>   - All of the following conditions hold:
>     
>       - `required` is `Capacity_Amount.A2`
>       - At least one of the following conditions holds:
>         
>           - `available` is `Inventory_Amount.A2`
>           - `available` is `Inventory_Amount.A3`
>           - `available` is `Inventory_Amount.A4`
>   - All of the following conditions hold:
>     
>       - `required` is `Capacity_Amount.A3`
>       - At least one of the following conditions holds:
>         
>           - `available` is `Inventory_Amount.A3`
>           - `available` is `Inventory_Amount.A4`
>   - All of the following conditions hold:
>     
>       - `required` is `Capacity_Amount.A4`
>       - `available` is `Inventory_Amount.A4`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::recovery_amount_below`

- Function category: Strictly pure
- Input `available` has type `Factory_Dispatch_Coordinator::Inventory_Amount`.
- Input `required` has type `Factory_Dispatch_Coordinator::Capacity_Amount`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `required` is `Capacity_Amount.A1`
>       - `available` is `Inventory_Amount.A0`
>   - All of the following conditions hold:
>     
>       - `required` is `Capacity_Amount.A2`
>       - At least one of the following conditions holds:
>         
>           - `available` is `Inventory_Amount.A0`
>           - `available` is `Inventory_Amount.A1`
>   - All of the following conditions hold:
>     
>       - `required` is `Capacity_Amount.A3`
>       - At least one of the following conditions holds:
>         
>           - `available` is `Inventory_Amount.A0`
>           - `available` is `Inventory_Amount.A1`
>           - `available` is `Inventory_Amount.A2`
>   - All of the following conditions hold:
>     
>       - `required` is `Capacity_Amount.A4`
>       - `available` is not `Inventory_Amount.A4`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::same_recovery_product`

- Function category: Strictly pure
- Input `inventory_product` has type `Factory_Dispatch_Coordinator::Inventory_Product_Id`.
- Input `stored_product` has type `Factory_Dispatch_Coordinator::Capacity_Product_Id`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `inventory_product` is `Inventory_Product_Id.P1`
>       - `stored_product` is `Capacity_Product_Id.P1`
>   - All of the following conditions hold:
>     
>       - `inventory_product` is `Inventory_Product_Id.P2`
>       - `stored_product` is `Capacity_Product_Id.P2`
>   - All of the following conditions hold:
>     
>       - `inventory_product` is `Inventory_Product_Id.P3`
>       - `stored_product` is `Capacity_Product_Id.P3`
>   - All of the following conditions hold:
>     
>       - `inventory_product` is `Inventory_Product_Id.P4`
>       - `stored_product` is `Capacity_Product_Id.P4`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::inventory_is_sufficient`

- Function category: Strictly pure
- Input `snap` has type `Factory_Dispatch_Coordinator::Dispatch_Inventory_Snapshot`.
- Input `fact` has type `Factory_Dispatch_Coordinator::Qualified_Request_Fact`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - `snap.validity` is `Observation_Validity.Valid`
>   - `fact.product_id` is not `Product_Id.None`
>   - the result of `same_product` for (`snap.pid`, `fact.product_id`) is true
>   - the result of `amount_at_least` for (`snap.qty`, `fact.amount`) is true.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::inventory_is_insufficient`

- Function category: Strictly pure
- Input `snap` has type `Factory_Dispatch_Coordinator::Dispatch_Inventory_Snapshot`.
- Input `fact` has type `Factory_Dispatch_Coordinator::Qualified_Request_Fact`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - `snap.validity` is `Observation_Validity.Valid`
>   - `fact.product_id` is not `Product_Id.None`
>   - the result of `same_product` for (`snap.pid`, `fact.product_id`) is true
>   - the result of `amount_below` for (`snap.qty`, `fact.amount`) is true.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::inventory_is_unknown`

- Function category: Strictly pure
- Input `snap` has type `Factory_Dispatch_Coordinator::Dispatch_Inventory_Snapshot`.
- Input `fact` has type `Factory_Dispatch_Coordinator::Qualified_Request_Fact`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - `snap.validity` is `Observation_Validity.Invalid`
>   - `fact.product_id` is `Product_Id.None`
>   - It is not the case that:
>     
>     the result of `same_product` for (`snap.pid`, `fact.product_id`) is true.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::fresh_inventory_class`

- Function category: Strictly pure
- Input `snap` has type `Factory_Dispatch_Coordinator::Dispatch_Inventory_Snapshot`.
- Input `fact` has type `Factory_Dispatch_Coordinator::Qualified_Request_Fact`.
- Result type: `Factory_Dispatch_Coordinator::Fresh_Inventory_Assessment`.

> The function returns the value selected as follows:
>
> **If:**
>
> `fact.assessment` is not `Admission_Assessment.AdmissibleFresh`
>
> **Use:**
>
> `Fresh_Inventory_Assessment.NotApplicable`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `inventory_is_sufficient` for (`snap`, `fact`) is true
>
> **Use:**
>
> `Fresh_Inventory_Assessment.Sufficient`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> the result of `inventory_is_insufficient` for (`snap`, `fact`) is true
>
> **Use:**
>
> `Fresh_Inventory_Assessment.Insufficient`
>
> **Otherwise use:**
>
> `Fresh_Inventory_Assessment.Unknown`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::recovery_inventory_class`

- Function category: Strictly pure
- Input `snap` has type `Factory_Dispatch_Coordinator::Dispatch_Inventory_Snapshot`.
- Input `context` has type `Factory_Dispatch_Coordinator::Recovery_Qualification_Context`.
- Result type: `Factory_Dispatch_Coordinator::Recovery_Inventory_Assessment`.

> The function returns the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `context.lifecycle` is not `Dispatch_Lifecycle.RecoveryPending`
>   - `context.stored_request_id` is `Capacity_Request_Id.None`
>   - `context.stored_product_id` is `Capacity_Product_Id.None`
>   - `context.stored_amount` is `Capacity_Amount.A0`
>
> **Use:**
>
> `Recovery_Inventory_Assessment.NotApplicable`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `snap.validity` is `Observation_Validity.Valid`
>   - the result of `same_recovery_product` for (`snap.pid`, `context.stored_product_id`) is true
>   - the result of `recovery_amount_at_least` for (`snap.qty`, `context.stored_amount`) is true
>
> **Use:**
>
> `Recovery_Inventory_Assessment.Sufficient`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `snap.validity` is `Observation_Validity.Valid`
>   - the result of `same_recovery_product` for (`snap.pid`, `context.stored_product_id`) is true
>   - the result of `recovery_amount_below` for (`snap.qty`, `context.stored_amount`) is true
>
> **Use:**
>
> `Recovery_Inventory_Assessment.Insufficient`
>
> **Otherwise use:**
>
> `Recovery_Inventory_Assessment.Unknown`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::candidate_request`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Capacity_Request_Id`.
- Result type: `Factory_Dispatch_Coordinator::Candidate_Request_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Request_Id.R1`
>
> **Use:**
>
> `Candidate_Request_Id.R1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Request_Id.R2`
>
> **Use:**
>
> `Candidate_Request_Id.R2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Request_Id.R3`
>
> **Use:**
>
> `Candidate_Request_Id.R3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Request_Id.R4`
>
> **Use:**
>
> `Candidate_Request_Id.R4`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Request_Id.R5`
>
> **Use:**
>
> `Candidate_Request_Id.R5`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Request_Id.R6`
>
> **Use:**
>
> `Candidate_Request_Id.R6`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Request_Id.R7`
>
> **Use:**
>
> `Candidate_Request_Id.R7`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Request_Id.R8`
>
> **Use:**
>
> `Candidate_Request_Id.R8`
>
> **Otherwise use:**
>
> `Candidate_Request_Id.None`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::candidate_product`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Capacity_Product_Id`.
- Result type: `Factory_Dispatch_Coordinator::Candidate_Product_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Product_Id.P1`
>
> **Use:**
>
> `Candidate_Product_Id.P1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Product_Id.P2`
>
> **Use:**
>
> `Candidate_Product_Id.P2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Product_Id.P3`
>
> **Use:**
>
> `Candidate_Product_Id.P3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Product_Id.P4`
>
> **Use:**
>
> `Candidate_Product_Id.P4`
>
> **Otherwise use:**
>
> `Candidate_Product_Id.None`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::candidate_amount`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Capacity_Amount`.
- Result type: `Factory_Dispatch_Coordinator::Candidate_Amount`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Amount.A1`
>
> **Use:**
>
> `Candidate_Amount.A1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Amount.A2`
>
> **Use:**
>
> `Candidate_Amount.A2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Amount.A3`
>
> **Use:**
>
> `Candidate_Amount.A3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Capacity_Amount.A4`
>
> **Use:**
>
> `Candidate_Amount.A4`
>
> **Otherwise use:**
>
> `Candidate_Amount.A0`.

### `Factory_Dispatch_Coordinator::Inventory_Qualifier::candidate_lifecycle`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Dispatch_Lifecycle`.
- Result type: `Factory_Dispatch_Coordinator::Candidate_Lifecycle`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Lifecycle.ActiveFresh`
>
> **Use:**
>
> `Candidate_Lifecycle.ActiveFresh`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Lifecycle.RecoveryPending`
>
> **Use:**
>
> `Candidate_Lifecycle.RecoveryPending`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Lifecycle.ActiveRetry`
>
> **Use:**
>
> `Candidate_Lifecycle.ActiveRetry`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Lifecycle.TerminalCompleted`
>
> **Use:**
>
> `Candidate_Lifecycle.TerminalCompleted`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Dispatch_Lifecycle.TerminalFailed`
>
> **Use:**
>
> `Candidate_Lifecycle.TerminalFailed`
>
> **Otherwise use:**
>
> `Candidate_Lifecycle.Idle`.

### `Factory_Dispatch_Coordinator::Outcome_Recovery_Classifier::confirmation_class`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Outcome_Plan`.
- Result type: `Factory_Dispatch_Coordinator::Confirmation_Outcome_Class`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Outcome_Plan.Preserve`
>
> **Use:**
>
> `Confirmation_Outcome_Class.Preserve`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Outcome_Plan.Completed`
>
> **Use:**
>
> `Confirmation_Outcome_Class.Completed`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Outcome_Plan.RetryEligible`
>
> **Use:**
>
> `Confirmation_Outcome_Class.RetryEligible`
>
> **Otherwise use:**
>
> `Confirmation_Outcome_Class.Abort`.

### `Factory_Dispatch_Coordinator::Outcome_Recovery_Classifier::confirmation_id`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Context_Request_Id`.
- Result type: `Factory_Dispatch_Coordinator::Confirmation_Request_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Context_Request_Id.R1`
>
> **Use:**
>
> `Confirmation_Request_Id.R1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Context_Request_Id.R2`
>
> **Use:**
>
> `Confirmation_Request_Id.R2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Context_Request_Id.R3`
>
> **Use:**
>
> `Confirmation_Request_Id.R3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Context_Request_Id.R4`
>
> **Use:**
>
> `Confirmation_Request_Id.R4`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Context_Request_Id.R5`
>
> **Use:**
>
> `Confirmation_Request_Id.R5`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Context_Request_Id.R6`
>
> **Use:**
>
> `Confirmation_Request_Id.R6`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Context_Request_Id.R7`
>
> **Use:**
>
> `Confirmation_Request_Id.R7`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Context_Request_Id.R8`
>
> **Use:**
>
> `Confirmation_Request_Id.R8`
>
> **Otherwise use:**
>
> `Confirmation_Request_Id.None`.

### `Factory_Dispatch_Coordinator::Outcome_Recovery_Classifier::same_request`

- Function category: Strictly pure
- Input `raw` has type `Factory_Dispatch_Coordinator::Request_Id`.
- Input `active` has type `Factory_Dispatch_Coordinator::Context_Request_Id`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `raw` is `Request_Id.R1`
>       - `active` is `Context_Request_Id.R1`
>   - All of the following conditions hold:
>     
>       - `raw` is `Request_Id.R2`
>       - `active` is `Context_Request_Id.R2`
>   - All of the following conditions hold:
>     
>       - `raw` is `Request_Id.R3`
>       - `active` is `Context_Request_Id.R3`
>   - All of the following conditions hold:
>     
>       - `raw` is `Request_Id.R4`
>       - `active` is `Context_Request_Id.R4`
>   - All of the following conditions hold:
>     
>       - `raw` is `Request_Id.R5`
>       - `active` is `Context_Request_Id.R5`
>   - All of the following conditions hold:
>     
>       - `raw` is `Request_Id.R6`
>       - `active` is `Context_Request_Id.R6`
>   - All of the following conditions hold:
>     
>       - `raw` is `Request_Id.R7`
>       - `active` is `Context_Request_Id.R7`
>   - All of the following conditions hold:
>     
>       - `raw` is `Request_Id.R8`
>       - `active` is `Context_Request_Id.R8`.

### `Factory_Dispatch_Coordinator::Outcome_Recovery_Classifier::same_attempt`

- Function category: Strictly pure
- Input `raw` has type `Factory_Dispatch_Coordinator::Dispatch_Attempt`.
- Input `active` has type `Factory_Dispatch_Coordinator::Context_Attempt`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `raw` is `Dispatch_Attempt.FreshAttempt`
>       - `active` is `Context_Attempt.FreshAttempt`
>   - All of the following conditions hold:
>     
>       - `raw` is `Dispatch_Attempt.RetryAttempt`
>       - `active` is `Context_Attempt.RetryAttempt`.

### `Factory_Dispatch_Coordinator::Release_Arbiter::capacity_request`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Candidate_Request_Id`.
- Result type: `Factory_Dispatch_Coordinator::Request_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Request_Id.R1`
>
> **Use:**
>
> `Request_Id.R1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Request_Id.R2`
>
> **Use:**
>
> `Request_Id.R2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Request_Id.R3`
>
> **Use:**
>
> `Request_Id.R3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Request_Id.R4`
>
> **Use:**
>
> `Request_Id.R4`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Request_Id.R5`
>
> **Use:**
>
> `Request_Id.R5`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Request_Id.R6`
>
> **Use:**
>
> `Request_Id.R6`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Request_Id.R7`
>
> **Use:**
>
> `Request_Id.R7`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Request_Id.R8`
>
> **Use:**
>
> `Request_Id.R8`
>
> **Otherwise use:**
>
> `Request_Id.None`.

### `Factory_Dispatch_Coordinator::Release_Arbiter::capacity_product`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Candidate_Product_Id`.
- Result type: `Factory_Dispatch_Coordinator::Product_Id`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Product_Id.P1`
>
> **Use:**
>
> `Product_Id.P1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Product_Id.P2`
>
> **Use:**
>
> `Product_Id.P2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Product_Id.P3`
>
> **Use:**
>
> `Product_Id.P3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Product_Id.P4`
>
> **Use:**
>
> `Product_Id.P4`
>
> **Otherwise use:**
>
> `Product_Id.None`.

### `Factory_Dispatch_Coordinator::Release_Arbiter::capacity_amount`

- Function category: Strictly pure
- Input `value` has type `Factory_Dispatch_Coordinator::Candidate_Amount`.
- Result type: `Factory_Dispatch_Coordinator::Dispatch_Amount`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Amount.A1`
>
> **Use:**
>
> `Dispatch_Amount.A1`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Amount.A2`
>
> **Use:**
>
> `Dispatch_Amount.A2`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Amount.A3`
>
> **Use:**
>
> `Dispatch_Amount.A3`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `Candidate_Amount.A4`
>
> **Use:**
>
> `Dispatch_Amount.A4`
>
> **Otherwise use:**
>
> `Dispatch_Amount.A0`.

## Detailed behavioral requirements

### Requirements for Commitment Tracker

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_TRACKER_STATE` — Required behavior

> During contract evaluation for the initialization phase, Commitment Tracker shall set lifecycle to Idle, active request id to None, active product id to None, active amount to A0, active attempt to FreshAttempt, execution context lifecycle to Idle, execution context active request id to None, execution context active attempt to FreshAttempt, recovery context lifecycle to Idle, recovery context stored request id to None, recovery context stored product id to None, recovery context stored amount to A0, shipment instruction kind to NoInstruction, shipment instruction request id to None, shipment instruction product id to None, shipment instruction amount to A0, and lifecycle snapshot to Idle.

#### Contract clauses evaluated in the compute phase

##### `PRESTATE_EXECUTION_CONTEXT` — Required behavior

> During contract evaluation for the compute phase, Commitment Tracker shall set execution context lifecycle to the value of lifecycle on entry, execution context active request id to the result of Commitment Tracker dispatch coordinator process commitment tracker context id for (the value of active request id on entry), and execution context active attempt to the result of Commitment Tracker dispatch coordinator process commitment tracker context attempt for (the value of active attempt on entry).

##### `PRESTATE_RECOVERY_CONTEXT` — Required behavior

> During contract evaluation for the compute phase, Commitment Tracker shall set recovery context lifecycle to the value of lifecycle on entry, recovery context stored request id to the result of Commitment Tracker dispatch coordinator process commitment tracker capacity id for (the value of active request id on entry), recovery context stored product id to the result of Commitment Tracker dispatch coordinator process commitment tracker capacity product id for (the value of active product id on entry), and recovery context stored amount to the result of Commitment Tracker dispatch coordinator process commitment tracker capacity quantity for (the value of active amount on entry).

##### `POSTSTATE_LIFECYCLE_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, Commitment Tracker shall set lifecycle snapshot to lifecycle.

##### `TRACK_FRESH_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycle on entry is Idle and dispatch decision kind is ReleaseFresh, Commitment Tracker shall set lifecycle to ActiveFresh, active request id to dispatch decision request id, active product id to dispatch decision product id, active amount to dispatch decision amount, active attempt to FreshAttempt, shipment instruction kind to ReleaseFresh, shipment instruction request id to dispatch decision request id, shipment instruction product id to dispatch decision product id, and shipment instruction amount to dispatch decision amount.

##### `TRACK_COMPLETION` — Conditional behavior

> During contract evaluation for the compute phase, case TRACK COMPLETION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of lifecycle on entry is ActiveFresh
>       - the value of lifecycle on entry is ActiveRetry
>   - outcome plan is Completed.

> When all applicability conditions are met, Commitment Tracker shall produce a result for which all of the following conditions hold:
>
> lifecycle is TerminalCompleted, active request id is the value of active request id on entry, active product id is the value of active product id on entry, active amount is the value of active amount on entry, active attempt is the value of active attempt on entry, shipment instruction kind is NoInstruction, shipment instruction request id is None, shipment instruction product id is None, and shipment instruction amount is A0.

##### `TRACK_FIRST_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycle on entry is ActiveFresh and outcome plan is RetryEligible, Commitment Tracker shall set lifecycle to RecoveryPending, preserve the value of active request id on entry, preserve the value of active product id on entry, preserve the value of active amount on entry, set active attempt to FreshAttempt, set shipment instruction kind to NoInstruction, set shipment instruction request id to None, set shipment instruction product id to None, and set shipment instruction amount to A0.

##### `TRACK_RETRY_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycle on entry is RecoveryPending and dispatch decision kind is ReleaseRetry, Commitment Tracker shall set lifecycle to ActiveRetry, preserve the value of active request id on entry, preserve the value of active product id on entry, preserve the value of active amount on entry, set active attempt to RetryAttempt, set shipment instruction kind to ReleaseRetry, set shipment instruction request id to the value of active request id on entry, set shipment instruction product id to the value of active product id on entry, and set shipment instruction amount to the value of active amount on entry.

##### `TRACK_RETRY_ABORT` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycle on entry is ActiveRetry and outcome plan is Abort, Commitment Tracker shall set lifecycle to TerminalFailed, preserve the value of active request id on entry, preserve the value of active product id on entry, preserve the value of active amount on entry, set active attempt to RetryAttempt, set shipment instruction kind to Cancel, set shipment instruction request id to the value of active request id on entry, set shipment instruction product id to the value of active product id on entry, and set shipment instruction amount to the value of active amount on entry.

##### `TRACK_ACTIVE_PRESERVATION` — Conditional behavior

> During contract evaluation for the compute phase, case TRACK ACTIVE PRESERVATION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of lifecycle on entry is ActiveFresh
>       - the value of lifecycle on entry is ActiveRetry
>   - outcome plan is Preserve.

> When all applicability conditions are met, Commitment Tracker shall produce a result for which all of the following conditions hold:
>
> lifecycle is the value of lifecycle on entry, active request id is the value of active request id on entry, active product id is the value of active product id on entry, active amount is the value of active amount on entry, active attempt is the value of active attempt on entry, shipment instruction kind is NoInstruction, shipment instruction request id is None, shipment instruction product id is None, and shipment instruction amount is A0.

##### `TRACK_WAIT_INVENTORY` — Conditional behavior

> During contract evaluation for the compute phase, case TRACK WAIT INVENTORY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of lifecycle on entry is Idle
>       - the value of lifecycle on entry is RecoveryPending
>   - dispatch decision kind is WaitInventory.

> When all applicability conditions are met, Commitment Tracker shall produce a result for which all of the following conditions hold:
>
> lifecycle is the value of lifecycle on entry, active request id is the value of active request id on entry, active product id is the value of active product id on entry, active amount is the value of active amount on entry, active attempt is the value of active attempt on entry, shipment instruction kind is NoInstruction, shipment instruction request id is None, shipment instruction product id is None, and shipment instruction amount is A0.

##### `TRACK_WAIT_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, case TRACK WAIT DOCK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of lifecycle on entry is Idle
>       - the value of lifecycle on entry is RecoveryPending
>   - dispatch decision kind is WaitDock.

> When all applicability conditions are met, Commitment Tracker shall produce a result for which all of the following conditions hold:
>
> lifecycle is the value of lifecycle on entry, active request id is the value of active request id on entry, active product id is the value of active product id on entry, active amount is the value of active amount on entry, active attempt is the value of active attempt on entry, shipment instruction kind is NoInstruction, shipment instruction request id is None, shipment instruction product id is None, and shipment instruction amount is A0.

##### `TRACK_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycle on entry is Idle, dispatch decision kind is not ReleaseFresh, dispatch decision kind is not WaitInventory, and dispatch decision kind is not WaitDock, Commitment Tracker shall set lifecycle to Idle, active request id to None, active product id to None, active amount to A0, active attempt to FreshAttempt, shipment instruction kind to NoInstruction, shipment instruction request id to None, shipment instruction product id to None, and shipment instruction amount to A0.

##### `TRACK_TERMINAL_RESET` — Conditional behavior

> During contract evaluation for the compute phase, case TRACK TERMINAL RESET applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of lifecycle on entry is TerminalCompleted
>       - the value of lifecycle on entry is TerminalFailed
>   - dispatch decision kind is ResetIdle.

> When all applicability conditions are met, Commitment Tracker shall produce a result for which all of the following conditions hold:
>
> lifecycle is Idle, active request id is None, active product id is None, active amount is A0, active attempt is FreshAttempt, shipment instruction kind is NoInstruction, shipment instruction request id is None, shipment instruction product id is None, and shipment instruction amount is A0.

### Requirements for Confirmation Determiner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CONFIRMATION` — Required behavior

> During contract evaluation for the initialization phase, Confirmation Determiner shall set shipping confirmation kind to None and shipping confirmation request id to None.

#### Contract clauses evaluated in the compute phase

##### `CONFIRMATION_SUPPRESS_PRESERVE` — Conditional behavior

> During contract evaluation for the compute phase, if confirmation context classification is Preserve, Confirmation Determiner shall set shipping confirmation kind to None and shipping confirmation request id to None.

##### `CONFIRMATION_SUPPRESS_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if confirmation context classification is RetryEligible, Confirmation Determiner shall set shipping confirmation kind to None and shipping confirmation request id to None.

##### `CONFIRMATION_SHIPPED` — Conditional behavior

> During contract evaluation for the compute phase, if confirmation context classification is Completed, Confirmation Determiner shall set shipping confirmation kind to Shipped and shipping confirmation request id to the result of Confirmation Determiner dispatch coordinator process confirmation determiner request id for (confirmation context confirmation request id).

##### `CONFIRMATION_FAILED` — Conditional behavior

> During contract evaluation for the compute phase, if confirmation context classification is Abort, Confirmation Determiner shall set shipping confirmation kind to DispatchFailed and shipping confirmation request id to the result of Confirmation Determiner dispatch coordinator process confirmation determiner request id for (confirmation context confirmation request id).

### Requirements for Dispatch Priority Resolver

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SELECTED_INTENT` — Required behavior

> During contract evaluation for the initialization phase, Dispatch Priority Resolver shall set selected intent to None.

#### Contract clauses evaluated in the compute phase

##### `RECOVERY_OUTRANKS_FRESH` — Conditional behavior

> During contract evaluation for the compute phase, if recovery plan is RetryEligible, Dispatch Priority Resolver shall set selected intent to RecoveryIntent.

##### `FRESH_SELECTED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery plan is not RetryEligible and admission is AdmissibleFresh, Dispatch Priority Resolver shall set selected intent to FreshIntent.

##### `NO_INTENT_SELECTED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery plan is not RetryEligible and admission is not AdmissibleFresh, Dispatch Priority Resolver shall set selected intent to None.

### Requirements for Dock Qualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DOCK_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, Dock Qualifier shall set assessment to Unknown.

#### Contract clauses evaluated in the compute phase

##### `DOCK_READY` — Conditional behavior

> During contract evaluation for the compute phase, if dock snapshot validity is Valid and dock snapshot disposition is Ready, Dock Qualifier shall set assessment to Ready.

##### `DOCK_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if dock snapshot validity is Valid and dock snapshot disposition is not Ready, Dock Qualifier shall set assessment to Blocked.

##### `DOCK_UNKNOWN` — Conditional behavior

> During contract evaluation for the compute phase, if dock snapshot validity is Invalid, Dock Qualifier shall set assessment to Unknown.

### Requirements for Inventory Qualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_INVENTORY_ASSESSMENTS` — Required behavior

> During contract evaluation for the initialization phase, Inventory Qualifier shall set candidate readiness fresh assessment to NotApplicable, candidate readiness recovery assessment to NotApplicable, candidate readiness recovery request id to None, candidate readiness recovery product id to None, candidate readiness recovery amount to A0, and candidate readiness lifecycle capacity to Idle.

#### Contract clauses evaluated in the compute phase

##### `FRESH_INVENTORY_CLASSIFIED` — Required behavior

> During contract evaluation for the compute phase, Inventory Qualifier shall set candidate readiness fresh assessment to the result of Inventory Qualifier dispatch coordinator process inventory qualifier fresh inventory class for (inventory snapshot, request fact).

##### `RECOVERY_INVENTORY_CLASSIFIED` — Required behavior

> During contract evaluation for the compute phase, Inventory Qualifier shall set candidate readiness recovery assessment to the result of Inventory Qualifier dispatch coordinator process inventory qualifier recovery inventory class for (inventory snapshot, recovery context).

##### `RECOVERY_CONTEXT_ROUTED` — Required behavior

> During contract evaluation for the compute phase, Inventory Qualifier shall set candidate readiness recovery request id to the result of Inventory Qualifier dispatch coordinator process inventory qualifier candidate request for (recovery context stored request id), candidate readiness recovery product id to the result of Inventory Qualifier dispatch coordinator process inventory qualifier candidate product for (recovery context stored product id), candidate readiness recovery amount to the result of Inventory Qualifier dispatch coordinator process inventory qualifier candidate amount for (recovery context stored amount), and candidate readiness lifecycle capacity to the result of Inventory Qualifier dispatch coordinator process inventory qualifier candidate lifecycle for (recovery context lifecycle).

### Requirements for Outcome Recovery Classifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OUTCOME_PLAN` — Required behavior

> During contract evaluation for the initialization phase, Outcome Recovery Classifier shall set recovery plan to Preserve, transition plan to Preserve, confirmation context classification to Preserve, and confirmation context confirmation request id to None.

#### Contract clauses evaluated in the compute phase

##### `CLASSIFIER_PUBLICATIONS_AGREE` — Required behavior

> During contract evaluation for the compute phase, Outcome Recovery Classifier shall set recovery plan to transition plan, confirmation context classification to the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier confirmation class for (transition plan), and confirmation context confirmation request id to the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier confirmation id for (execution context active request id).

##### `RECOVERY_REMAINS_ELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if execution context lifecycle is RecoveryPending, Outcome Recovery Classifier shall set transition plan to RetryEligible.

##### `MATCHING_COMPLETION` — Conditional behavior

> During contract evaluation for the compute phase, case MATCHING COMPLETION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - execution context lifecycle is ActiveFresh
>       - execution context lifecycle is ActiveRetry
>   - execution context active request id is not None
>   - the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier same request for (execution outcome request id, execution context active request id) is true
>   - the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier same attempt for (execution outcome attempt, execution context active attempt) is true
>   - execution outcome result is Completed.

> When all applicability conditions are met, Outcome Recovery Classifier shall produce a result for which all of the following conditions hold:
>
> transition plan is Completed.

##### `MATCHING_FRESH_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, case MATCHING FRESH FAILURE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - execution context lifecycle is ActiveFresh
>   - execution context active request id is not None
>   - the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier same request for (execution outcome request id, execution context active request id) is true
>   - execution outcome attempt is FreshAttempt
>   - execution outcome result is Failed.

> When all applicability conditions are met, Outcome Recovery Classifier shall produce a result for which all of the following conditions hold:
>
> transition plan is RetryEligible.

##### `MATCHING_RETRY_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, case MATCHING RETRY FAILURE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - execution context lifecycle is ActiveRetry
>   - execution context active request id is not None
>   - the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier same request for (execution outcome request id, execution context active request id) is true
>   - execution outcome attempt is RetryAttempt
>   - execution outcome result is Failed.

> When all applicability conditions are met, Outcome Recovery Classifier shall produce a result for which all of the following conditions hold:
>
> transition plan is Abort.

##### `OUTCOME_PRESERVED` — Conditional behavior

> During contract evaluation for the compute phase, case OUTCOME PRESERVED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - execution context lifecycle is not RecoveryPending
>   - It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - execution context lifecycle is ActiveFresh
>               - execution context lifecycle is ActiveRetry
>           - execution context active request id is not None
>           - the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier same request for (execution outcome request id, execution context active request id) is true
>           - the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier same attempt for (execution outcome attempt, execution context active attempt) is true
>           - execution outcome result is Completed
>       - All of the following conditions hold:
>         
>           - execution context lifecycle is ActiveFresh
>           - execution context active request id is not None
>           - the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier same request for (execution outcome request id, execution context active request id) is true
>           - execution outcome attempt is FreshAttempt
>           - execution outcome result is Failed
>       - All of the following conditions hold:
>         
>           - execution context lifecycle is ActiveRetry
>           - execution context active request id is not None
>           - the result of Outcome Recovery Classifier dispatch coordinator process outcome recovery classifier same request for (execution outcome request id, execution context active request id) is true
>           - execution outcome attempt is RetryAttempt
>           - execution outcome result is Failed.

> When all applicability conditions are met, Outcome Recovery Classifier shall produce a result for which all of the following conditions hold:
>
> transition plan is Preserve.

### Requirements for Release Arbiter

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DISPATCH_DECISION` — Required behavior

> During contract evaluation for the initialization phase, Release Arbiter shall set dispatch decision kind to None, dispatch decision request id to None, dispatch decision product id to None, dispatch decision amount to A0, and decision reason to Idle.

#### Contract clauses evaluated in the compute phase

##### `RESET_COMPLETED` — Conditional behavior

> During contract evaluation for the compute phase, if candidate readiness lifecycle capacity is TerminalCompleted, Release Arbiter shall set dispatch decision kind to ResetIdle, dispatch decision request id to None, dispatch decision product id to None, dispatch decision amount to A0, and decision reason to TerminalReset.

##### `RESET_FAILED` — Conditional behavior

> During contract evaluation for the compute phase, if candidate readiness lifecycle capacity is TerminalFailed, Release Arbiter shall set dispatch decision kind to ResetIdle, dispatch decision request id to None, dispatch decision product id to None, dispatch decision amount to A0, and decision reason to TerminalReset.

##### `PROTECTED_ACTIVE_BUSY` — Conditional behavior

> During contract evaluation for the compute phase, case PROTECTED ACTIVE BUSY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - candidate readiness lifecycle capacity is ActiveFresh
>       - candidate readiness lifecycle capacity is ActiveRetry
>   - request fact assessment is not NoRequest.

> When all applicability conditions are met, Release Arbiter shall produce a result for which all of the following conditions hold:
>
> dispatch decision kind is Busy, dispatch decision request id is the result of Release Arbiter dispatch coordinator process release arbiter capacity request for (candidate readiness recovery request id), dispatch decision product id is the result of Release Arbiter dispatch coordinator process release arbiter capacity product for (candidate readiness recovery product id), dispatch decision amount is the result of Release Arbiter dispatch coordinator process release arbiter capacity amount for (candidate readiness recovery amount), and decision reason is Busy.

##### `ACTIVE_NO_REQUEST_PRESERVED` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE NO REQUEST PRESERVED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - candidate readiness lifecycle capacity is ActiveFresh
>       - candidate readiness lifecycle capacity is ActiveRetry
>   - request fact assessment is NoRequest.

> When all applicability conditions are met, Release Arbiter shall produce a result for which all of the following conditions hold:
>
> dispatch decision kind is None, dispatch decision request id is None, dispatch decision product id is None, dispatch decision amount is A0, and decision reason is Released.

##### `REJECT_MALFORMED` — Conditional behavior

> During contract evaluation for the compute phase, if candidate readiness lifecycle capacity is Idle and request fact assessment is Malformed, Release Arbiter shall set dispatch decision kind to Reject, dispatch decision request id to None, dispatch decision product id to None, dispatch decision amount to A0, and decision reason to Rejected.

##### `REJECT_REPEATED` — Conditional behavior

> During contract evaluation for the compute phase, if candidate readiness lifecycle capacity is Idle and request fact assessment is Repeated, Release Arbiter shall set dispatch decision kind to Reject, dispatch decision request id to None, dispatch decision product id to None, dispatch decision amount to A0, and decision reason to Rejected.

##### `WAIT_FOR_INVENTORY` — Conditional behavior

> During contract evaluation for the compute phase, case WAIT FOR INVENTORY applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - candidate readiness lifecycle capacity is Idle
>       - selected intent is FreshIntent
>       - candidate readiness fresh assessment is not Sufficient
>   - All of the following conditions hold:
>     
>       - candidate readiness lifecycle capacity is RecoveryPending
>       - selected intent is RecoveryIntent
>       - candidate readiness recovery assessment is not Sufficient.

> When all applicability conditions are met, Release Arbiter shall produce a result for which all of the following conditions hold:
>
> dispatch decision kind is WaitInventory and decision reason is WaitingInventory.

##### `WAIT_FOR_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, case WAIT FOR DOCK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - candidate readiness lifecycle capacity is Idle
>           - selected intent is FreshIntent
>           - candidate readiness fresh assessment is Sufficient
>       - All of the following conditions hold:
>         
>           - candidate readiness lifecycle capacity is RecoveryPending
>           - selected intent is RecoveryIntent
>           - candidate readiness recovery assessment is Sufficient
>   - dock assessment is not Ready.

> When all applicability conditions are met, Release Arbiter shall produce a result for which all of the following conditions hold:
>
> dispatch decision kind is WaitDock and decision reason is WaitingDock.

##### `RELEASE_FRESH` — Conditional behavior

> During contract evaluation for the compute phase, if candidate readiness lifecycle capacity is Idle, selected intent is FreshIntent, candidate readiness fresh assessment is Sufficient, and dock assessment is Ready, Release Arbiter shall set dispatch decision kind to ReleaseFresh, dispatch decision request id to request fact request id, dispatch decision product id to request fact product id, dispatch decision amount to request fact amount, and decision reason to Released.

##### `RELEASE_RETRY` — Conditional behavior

> During contract evaluation for the compute phase, if candidate readiness lifecycle capacity is RecoveryPending, selected intent is RecoveryIntent, candidate readiness recovery assessment is Sufficient, and dock assessment is Ready, Release Arbiter shall set dispatch decision kind to ReleaseRetry, dispatch decision request id to the result of Release Arbiter dispatch coordinator process release arbiter capacity request for (candidate readiness recovery request id), dispatch decision product id to the result of Release Arbiter dispatch coordinator process release arbiter capacity product for (candidate readiness recovery product id), dispatch decision amount to the result of Release Arbiter dispatch coordinator process release arbiter capacity amount for (candidate readiness recovery amount), and decision reason to Released.

##### `ARBITER_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, if candidate readiness lifecycle capacity is Idle, selected intent is None, request fact assessment is not Malformed, and request fact assessment is not Repeated, Release Arbiter shall set dispatch decision kind to None, dispatch decision request id to None, dispatch decision product id to None, dispatch decision amount to A0, and decision reason to Idle.

### Requirements for Request Qualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REQUEST_FACTS` — Required behavior

> During contract evaluation for the initialization phase, Request Qualifier shall set inventory request fact assessment to NoRequest, inventory request fact request id to None, inventory request fact product id to None, inventory request fact amount to A0, inventory request fact freshness to Fresh, priority admission to NoRequest, arbiter request fact assessment to NoRequest, arbiter request fact request id to None, arbiter request fact product id to None, arbiter request fact amount to A0, and arbiter request fact freshness to Fresh.

#### Contract clauses evaluated in the compute phase

##### `REQUEST_FACT_AGREEMENT` — Required behavior

> During contract evaluation for the compute phase, Request Qualifier shall set inventory request fact assessment to priority admission, arbiter request fact assessment to priority admission, inventory request fact request id to request request id, inventory request fact product id to request product id, inventory request fact amount to request amount, inventory request fact freshness to request freshness, arbiter request fact request id to request request id, arbiter request fact product id to request product id, arbiter request fact amount to request amount, and arbiter request fact freshness to request freshness.

##### `REQUEST_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if request request id is None, request product id is None, and request amount is A0, Request Qualifier shall set priority admission to NoRequest.

##### `REQUEST_MALFORMED` — Conditional behavior

> During contract evaluation for the compute phase, case REQUEST MALFORMED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - request request id is None
>       - request product id is None
>       - request amount is A0
>   - At least one of the following conditions holds:
>     
>       - request request id is None
>       - request product id is None
>       - request amount is A0.

> When all applicability conditions are met, Request Qualifier shall produce a result for which all of the following conditions hold:
>
> priority admission is Malformed.

##### `REQUEST_REPEATED` — Conditional behavior

> During contract evaluation for the compute phase, if request request id is not None, request product id is not None, request amount is not A0, and request freshness is Repeated, Request Qualifier shall set priority admission to Repeated.

##### `REQUEST_ADMISSIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if request request id is not None, request product id is not None, request amount is not A0, and request freshness is Fresh, Request Qualifier shall set priority admission to AdmissibleFresh.

### Requirements for Status Determiner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_STATUS` — Required behavior

> During contract evaluation for the initialization phase, Status Determiner shall set dispatch status to Idle.

#### Contract clauses evaluated in the compute phase

##### `STATUS_COMPLETED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycle snapshot is TerminalCompleted, Status Determiner shall set dispatch status to Completed.

##### `STATUS_FAILED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycle snapshot is TerminalFailed, Status Determiner shall set dispatch status to Failed.

##### `STATUS_RECOVERING` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycle snapshot is RecoveryPending, Status Determiner shall set dispatch status to Recovering.

##### `STATUS_BUSY` — Conditional behavior

> During contract evaluation for the compute phase, case STATUS BUSY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - lifecycle snapshot is ActiveFresh
>       - lifecycle snapshot is ActiveRetry
>   - decision reason is Busy.

> When all applicability conditions are met, Status Determiner shall produce a result for which all of the following conditions hold:
>
> dispatch status is Busy.

##### `STATUS_RELEASED` — Conditional behavior

> During contract evaluation for the compute phase, case STATUS RELEASED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - lifecycle snapshot is ActiveFresh
>       - lifecycle snapshot is ActiveRetry
>   - decision reason is not Busy.

> When all applicability conditions are met, Status Determiner shall produce a result for which all of the following conditions hold:
>
> dispatch status is Released.

##### `STATUS_TERMINAL_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycle snapshot is Idle and decision reason is TerminalReset, Status Determiner shall set dispatch status to Idle.

##### `STATUS_WAIT_INVENTORY` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycle snapshot is Idle and decision reason is WaitingInventory, Status Determiner shall set dispatch status to WaitingInventory.

##### `STATUS_WAIT_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycle snapshot is Idle and decision reason is WaitingDock, Status Determiner shall set dispatch status to WaitingDock.

##### `STATUS_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycle snapshot is Idle and decision reason is Rejected, Status Determiner shall set dispatch status to Rejected.

##### `STATUS_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycle snapshot is Idle, decision reason is not WaitingInventory, decision reason is not WaitingDock, decision reason is not Rejected, and decision reason is not TerminalReset, Status Determiner shall set dispatch status to Idle.
