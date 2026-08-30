# Small Finished-Product Dispatch Coordinator

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: A Manufacturer needs one bounded logical coordinator that accepts a shipment
request, observes finished-product availability, requests release when eligible, and
reports the disposition of the request. The modeled concern is dispatch coordination for
one logical shipment at a time, not physical transportation or delivery.

PURPOSE-01: The coordinator shall qualify finite request, availability, and
dispatch-outcome samples; retain whether one request is waiting for product or has a
release outstanding; select exactly one dispatch disposition per logical evaluation;
issue a release command only on a newly eligible transition; and issue a logical
shipping confirmation only after a valid expected acceptance report.

GOAL-01: The system shall produce one coherent next phase, recovery value, release
command, status, and shipping-confirmation indication for every finite input and owner
pre-state combination.

GOAL-02: The system shall retain an unavailable request until availability becomes
present, without repeatedly issuing a release command after release becomes outstanding.

GOAL-03: The system shall suppress dispatch after invalid input and shall require a
neutral valid observation followed by a later fresh request before dispatch can resume.

GOAL-04: The system should remain small enough for exhaustive bounded analysis,
responsibility audit, trace review, and human validation without identity wrappers or
count-only flows.

### Operational context and exact boundary

CTX-01: The Sales Request Context is outside the system and supplies the request event
and its validity status; the seed does not define this event authority or sampling
behavior.

CTX-02: The Finished-Product Storage Context is outside the system and supplies a
qualitative availability value and validity status; the coordinator neither measures
inventory nor controls storage.

CTX-03: The Dispatch Executor is outside the system, receives a logical shipment-release
command, and may later supply a shipment-acceptance report with validity status.
Acceptance means only logical acceptance of the release in this pilot and does not prove
movement, delivery, or customer receipt.

CTX-04: The Dispatch Information Recipient is outside the system and receives dispatch
status and logical shipping confirmation. It may represent sales or customer-facing
communication, resolving the seed's ambiguous confirmation ownership only for this
selected boundary.

MON-01: `DispatchRequestSample` is a finite root input from CTX-01 with `event :
DispatchRequestEvent` and `status : InputStatus`; `DispatchRequestEvent` is exactly
`{NoRequest, RequestShipment}` and `InputStatus` is exactly `{Valid, Invalid}`.

MON-02: `ProductAvailabilitySample` is a finite root input from CTX-02 with
`availability : ProductAvailability` and `status : InputStatus`; `ProductAvailability`
is exactly `{Unavailable, Available}` and makes no quantity, inventory-accuracy, or
production-readiness claim.

MON-03: `DispatchOutcomeSample` is a finite root input from CTX-03 with `outcome :
DispatchOutcome` and `status : InputStatus`; `DispatchOutcome` is exactly `{NoReport,
ShipmentAccepted}`, where acceptance is a logical acknowledgment rather than achieved
shipment.

CTRL-01: `ShipmentReleaseCommand` is a finite root output to CTX-03 with exactly `{Hold,
Release}`. `Release` is a one-evaluation logical command issued only when a request
first becomes eligible; `Hold` does not retract a previously accepted external action.

CTRL-02: `DispatchStatus` is a finite root output to CTX-04 with exactly `{Idle,
WaitingProduct, ReleaseIssued, ShipmentAcknowledged, UnexpectedOutcome, InputFault,
RecoveryAwaitingNeutral}` and reports the selected logical disposition for the
evaluation.

CTRL-03: `ShippingConfirmation` is a finite root output to CTX-04 with exactly
`{NotIssued, Issued}`. `Issued` is a one-evaluation logical confirmation following a
valid expected `ShipmentAccepted` report and is not proof of delivery.

### Nominal, boundary, invalid/fault, and recovery behavior

RISK-01: Treating invalid input or out-of-sequence acceptance as trustworthy could
produce an unjustified release or unsupported logical confirmation; the claimed
consequence is only an incoherent dispatch decision inside the abstract, with no
physical loss, safety classification, likelihood, or severity claim.

### Assumptions and constraints

ASM-01: CTX-01 is responsible for presenting at most one logical request at a time and
`NoRequest` when no fresh request exists; this makes one-job state sufficient without
assigning identity, quantity, timing, or customer authority.

ASM-02: CTX-02 is responsible for pairing qualitative availability with explicit
validity; `Available` means only external authorization for this logical request to
become release-eligible and does not prove inventory count, quality, production
completion, or physical readiness.

ASM-03: CTX-03 is responsible for pairing every outcome with validity and using
`ShipmentAccepted` only for logical acceptance of an outstanding release; CASE-05
handles violations without inferring physical diagnosis or recovery action.

ASM-04: CTX-03 is responsible only for accepting CTRL-01 as a logical command; because
achievement feedback is absent beyond MON-03's finite acknowledgment,
`ReleaseOutstanding` shall not be described as shipped, delivered, or physically moving.

ASM-05: CTX-04 is responsible only for receiving CTRL-02 and CTRL-03; assigning
confirmation issuance to this coordinator resolves a pilot ambiguity but does not assert
that Sales, Dispatch, or Customer owned it in the seed source.

## Supporting contract definitions

### State `Factory_Dispatch_Coordinator::Dispatch_Decision_Owner::current_phase`

State `current_phase` has type `Factory_Dispatch_Coordinator::Dispatch_Phase`.

### State `Factory_Dispatch_Coordinator::Dispatch_Decision_Owner::recovery_required`

State `recovery_required` has type `Base_Types::Boolean`.

## Detailed behavioral requirements

### Requirements for Availability Assessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_AVAILABILITY_INVALID` — Required behavior

> During contract evaluation for the initialization phase, Availability Assessment shall set availability assessment to Invalid Availability.

#### Contract clauses evaluated in the compute phase

##### `AVAILABILITY_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if raw availability status is Invalid, Availability Assessment shall set availability assessment to Invalid Availability.

##### `PRODUCT_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if raw availability status is Valid and raw availability availability is Unavailable, Availability Assessment shall set availability assessment to Product Unavailable.

##### `PRODUCT_AVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if raw availability status is Valid and raw availability availability is Available, Availability Assessment shall set availability assessment to Product Available.

### Requirements for Dispatch Decision Owner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OWNER_STATE_AND_RESOLUTION` — Required behavior

> During contract evaluation for the initialization phase, Dispatch Decision Owner shall set current phase to Idle, recovery required to true exactly when F is true, release resolution next phase to Idle, release resolution next recovery required to true exactly when F is true, release resolution disposition to Hold Position, notice resolution next phase to Idle, notice resolution next recovery required to true exactly when F is true, and notice resolution disposition to Hold Position.

#### Contract clauses evaluated in the compute phase

##### `OWNER_STATE_AND_RESOLUTIONS_AGREE` — Required behavior

> During contract evaluation for the compute phase, Dispatch Decision Owner shall produce a result for which if recovery required is true, then current phase is Idle, release resolution next phase is current phase, release resolution next recovery required is true exactly when recovery required is true, notice resolution next phase is current phase, notice resolution next recovery required is true exactly when recovery required is true, and release resolution disposition is notice resolution disposition.

##### `CASE_01_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is Invalid Request, availability assessment is Invalid Availability, or qualified outcome is Invalid Outcome, Dispatch Decision Owner shall set current phase to Idle, recovery required to true exactly when T is true, release resolution next phase to Idle, release resolution next recovery required to true exactly when T is true, release resolution disposition to Input Fault, notice resolution next phase to Idle, notice resolution next recovery required to true exactly when T is true, and notice resolution disposition to Input Fault.

##### `CASE_02_RECOVERY_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 RECOVERY BLOCKED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualified request is not Invalid Request
>   - availability assessment is not Invalid Availability
>   - qualified outcome is not Invalid Outcome
>   - the value of recovery required on entry is true exactly when T is true
>   - At least one of the following conditions holds:
>     
>       - qualified request is not No Qualified Request
>       - qualified outcome is not No Qualified Report.

> When all applicability conditions are met, Dispatch Decision Owner shall produce a result for which all of the following conditions hold:
>
> current phase is Idle, recovery required is true exactly when T is true, release resolution next phase is Idle, release resolution next recovery required is true exactly when T is true, release resolution disposition is Recovery Blocked, notice resolution next phase is Idle, notice resolution next recovery required is true exactly when T is true, and notice resolution disposition is Recovery Blocked.

##### `CASE_03_RECOVERY_CLEARED` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, availability assessment is not Invalid Availability, qualified outcome is not Invalid Outcome, the value of recovery required on entry is true exactly when T is true, qualified request is No Qualified Request, and qualified outcome is No Qualified Report, Dispatch Decision Owner shall set current phase to Idle, recovery required to true exactly when F is true, release resolution next phase to Idle, release resolution next recovery required to true exactly when F is true, release resolution disposition to Recovery Cleared, notice resolution next phase to Idle, notice resolution next recovery required to true exactly when F is true, and notice resolution disposition to Recovery Cleared.

##### `CASE_04_EXPECTED_ACCEPTANCE` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, availability assessment is not Invalid Availability, qualified outcome is not Invalid Outcome, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Release Outstanding, and qualified outcome is Qualified Shipment Accepted, Dispatch Decision Owner shall set current phase to Idle, recovery required to true exactly when F is true, release resolution next phase to Idle, release resolution next recovery required to true exactly when F is true, release resolution disposition to Shipment Acknowledged, notice resolution next phase to Idle, notice resolution next recovery required to true exactly when F is true, and notice resolution disposition to Shipment Acknowledged.

##### `CASE_05_UNEXPECTED_ACCEPTANCE` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, availability assessment is not Invalid Availability, qualified outcome is not Invalid Outcome, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is not Release Outstanding, and qualified outcome is Qualified Shipment Accepted, Dispatch Decision Owner shall preserve the value of current phase on entry, set recovery required to true exactly when F is true, set release resolution next phase to the value of current phase on entry, set release resolution next recovery required to true exactly when F is true, set release resolution disposition to Unexpected Outcome, set notice resolution next phase to the value of current phase on entry, set notice resolution next recovery required to true exactly when F is true, and set notice resolution disposition to Unexpected Outcome.

##### `CASE_06_RELEASE_FROM_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, availability assessment is not Invalid Availability, qualified outcome is No Qualified Report, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Idle, qualified request is Qualified Shipment Request, and availability assessment is Product Available, Dispatch Decision Owner shall set current phase to Release Outstanding, recovery required to true exactly when F is true, release resolution next phase to Release Outstanding, release resolution next recovery required to true exactly when F is true, release resolution disposition to Release From Idle, notice resolution next phase to Release Outstanding, notice resolution next recovery required to true exactly when F is true, and notice resolution disposition to Release From Idle.

##### `CASE_07_QUEUE_FOR_PRODUCT` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, availability assessment is not Invalid Availability, qualified outcome is No Qualified Report, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Idle, qualified request is Qualified Shipment Request, and availability assessment is Product Unavailable, Dispatch Decision Owner shall set current phase to Awaiting Product, recovery required to true exactly when F is true, release resolution next phase to Awaiting Product, release resolution next recovery required to true exactly when F is true, release resolution disposition to Queue For Product, notice resolution next phase to Awaiting Product, notice resolution next recovery required to true exactly when F is true, and notice resolution disposition to Queue For Product.

##### `CASE_08_RELEASE_FROM_QUEUE` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, availability assessment is Product Available, qualified outcome is No Qualified Report, the value of recovery required on entry is true exactly when F is true, and the value of current phase on entry is Awaiting Product, Dispatch Decision Owner shall set current phase to Release Outstanding, recovery required to true exactly when F is true, release resolution next phase to Release Outstanding, release resolution next recovery required to true exactly when F is true, release resolution disposition to Release From Queue, notice resolution next phase to Release Outstanding, notice resolution next recovery required to true exactly when F is true, and notice resolution disposition to Release From Queue.

##### `CASE_09_HOLD_POSITION` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, availability assessment is not Invalid Availability, qualified outcome is No Qualified Report, the value of recovery required on entry is true exactly when F is true, it is not the case that the value of current phase on entry is Idle, qualified request is Qualified Shipment Request, and availability assessment is Product Available, it is not the case that the value of current phase on entry is Idle, qualified request is Qualified Shipment Request, and availability assessment is Product Unavailable, and it is not the case that the value of current phase on entry is Awaiting Product and availability assessment is Product Available, Dispatch Decision Owner shall preserve the value of current phase on entry, set recovery required to true exactly when F is true, set release resolution next phase to the value of current phase on entry, set release resolution next recovery required to true exactly when F is true, set release resolution disposition to Hold Position, set notice resolution next phase to the value of current phase on entry, set notice resolution next recovery required to true exactly when F is true, and set notice resolution disposition to Hold Position.

### Requirements for Dispatch Notice Derivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NOTICE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Dispatch Notice Derivation shall set dispatch status to Idle and shipping confirmation to Not Issued.

#### Contract clauses evaluated in the compute phase

##### `NOTICE_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Input Fault, Dispatch Notice Derivation shall set dispatch status to Input Fault and shipping confirmation to Not Issued.

##### `NOTICE_RECOVERY_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Recovery Blocked, Dispatch Notice Derivation shall set dispatch status to Recovery Awaiting Neutral and shipping confirmation to Not Issued.

##### `NOTICE_RECOVERY_CLEARED` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Recovery Cleared, Dispatch Notice Derivation shall set dispatch status to Idle and shipping confirmation to Not Issued.

##### `NOTICE_ACKNOWLEDGED` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Shipment Acknowledged, Dispatch Notice Derivation shall set dispatch status to Shipment Acknowledged and shipping confirmation to Issued.

##### `NOTICE_UNEXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Unexpected Outcome, Dispatch Notice Derivation shall set dispatch status to Unexpected Outcome and shipping confirmation to Not Issued.

##### `NOTICE_RELEASE_ISSUED` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Release From Idle or dispatch resolution disposition is Release From Queue, Dispatch Notice Derivation shall set dispatch status to Release Issued and shipping confirmation to Not Issued.

##### `NOTICE_WAITING_PRODUCT` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Queue For Product, Dispatch Notice Derivation shall set dispatch status to Waiting Product and shipping confirmation to Not Issued.

##### `NOTICE_HOLD_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Hold Position and dispatch resolution next phase is Idle, Dispatch Notice Derivation shall set dispatch status to Idle and shipping confirmation to Not Issued.

##### `NOTICE_HOLD_AWAITING` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Hold Position and dispatch resolution next phase is Awaiting Product, Dispatch Notice Derivation shall set dispatch status to Waiting Product and shipping confirmation to Not Issued.

##### `NOTICE_HOLD_OUTSTANDING` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Hold Position and dispatch resolution next phase is Release Outstanding, Dispatch Notice Derivation shall set dispatch status to Release Issued and shipping confirmation to Not Issued.

### Requirements for Outcome Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OUTCOME_INVALID` — Required behavior

> During contract evaluation for the initialization phase, Outcome Qualification shall set qualified outcome to Invalid Outcome.

#### Contract clauses evaluated in the compute phase

##### `OUTCOME_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if raw outcome status is Invalid, Outcome Qualification shall set qualified outcome to Invalid Outcome.

##### `OUTCOME_NEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if raw outcome status is Valid and raw outcome outcome is No Report, Outcome Qualification shall set qualified outcome to No Qualified Report.

##### `OUTCOME_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if raw outcome status is Valid and raw outcome outcome is Shipment Accepted, Outcome Qualification shall set qualified outcome to Qualified Shipment Accepted.

### Requirements for Release Command Derivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RELEASE_HOLD` — Required behavior

> During contract evaluation for the initialization phase, Release Command Derivation shall set shipment release command to Hold.

#### Contract clauses evaluated in the compute phase

##### `RELEASE_COMMAND` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is Release From Idle or dispatch resolution disposition is Release From Queue, Release Command Derivation shall set shipment release command to Release.

##### `HOLD_COMMAND` — Conditional behavior

> During contract evaluation for the compute phase, if dispatch resolution disposition is not Release From Idle and dispatch resolution disposition is not Release From Queue, Release Command Derivation shall set shipment release command to Hold.

### Requirements for Request Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REQUEST_INVALID` — Required behavior

> During contract evaluation for the initialization phase, Request Qualification shall set qualified request to Invalid Request.

#### Contract clauses evaluated in the compute phase

##### `REQUEST_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Invalid, Request Qualification shall set qualified request to Invalid Request.

##### `REQUEST_NEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is No Request, Request Qualification shall set qualified request to No Qualified Request.

##### `REQUEST_SHIPMENT` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is Request Shipment, Request Qualification shall set qualified request to Qualified Shipment Request.
