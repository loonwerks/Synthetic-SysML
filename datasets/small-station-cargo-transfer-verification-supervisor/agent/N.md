# Small Station Cargo-Transfer Verification Supervisor

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: A mining-frigate pilot and station need a bounded logical supervisor that
admits one offload request only while docking is reported established, observes
ship-side transfer progress and station warehouse receipt evidence, and reports whether
that one transfer has been verified. The modeled concern is evidence coordination, not
physical docking, cargo motion, or warehouse control.

PURPOSE-01: The system shall qualify four finite boundary observations, retain the
logical phase and rearm obligation of one transfer at a time, choose exactly one
disposition for each logical evaluation, issue a one-evaluation begin command only for
an admitted fresh request, and establish verification only from applicable ship and
warehouse evidence.

GOAL-01: The system shall produce one fully constrained next state, cargo-transfer
command, supervisory status, and verification finding for every admissible finite
pre-state and boundary-input combination.

GOAL-02: The system shall distinguish a newly admitted request, active ship-side
transfer, completed ship-side transfer awaiting warehouse receipt, and logically
verified completion without treating any report as physical proof.

GOAL-03: The system shall inhibit a begin command and verification after invalid or
inconsistent evidence until a valid neutral observation has occurred and any subsequent
transfer uses a later fresh request.

GOAL-04: The system should remain small enough for exhaustive finite analysis, ownership
review, complete trace audit, and human validation without identity wrappers, duplicate
decision owners, or count-only interactions.

### Operational context and exact system boundary

CTX-01: The Pilot Request Context is outside the system and supplies an offload-request
sample and its validity. It is responsible for presenting a fresh logical request event
only when one transfer is intended.

CTX-02: The Docking Status Context is outside the system and supplies a finite docking
observation and its validity. It may represent station or frigate reporting, but the
supervisor neither performs nor proves physical docking.

CTX-03: The Ship Cargo Context is outside the system, supplies ship-side transfer
progress and validity, and receives the logical begin-transfer command. It owns any
unmodeled transfer mechanism and physical cargo effect.

CTX-04: The Station Warehouse Context is outside the system and supplies warehouse
receipt evidence and validity. The supervisor neither changes warehouse contents nor
establishes cargo identity, quantity, or inventory accuracy.

CTX-05: The Transfer Information Recipient is outside the system and receives
supervisory status and a verification finding. It may be the pilot or station operator
and shall not interpret a logical finding as physical certification.

MON-01: `OffloadRequestSample` is a finite root input from CTX-01 with `event :
OffloadRequestEvent` and `status : InputStatus`; `OffloadRequestEvent` is exactly
`{NoRequest, OffloadRequested}` and `InputStatus` is exactly `{Valid, Invalid}`.

MON-02: `DockingSample` is a finite root input from CTX-02 with `docking :
DockingObservation` and `status : InputStatus`; `DockingObservation` is exactly
`{NotDocked, Docked}` and makes no mechanical-latch or safety claim.

MON-03: `ShipTransferSample` is a finite root input from CTX-03 with `progress :
ShipTransferProgress` and `status : InputStatus`; `ShipTransferProgress` is exactly
`{Idle, InProgress, Complete, Failed}`.

MON-04: `WarehouseReceiptSample` is a finite root input from CTX-04 with `receipt :
WarehouseReceiptEvidence` and `status : InputStatus`; `WarehouseReceiptEvidence` is
exactly `{NoReceipt, ReceiptConfirmed, ReceiptRejected}`.

CTRL-01: `CargoTransferCommand` is a finite root output to CTX-03 with exactly `{Hold,
BeginOffload}`. `BeginOffload` is a one-evaluation logical command and `Hold` neither
cancels nor reverses an action already accepted outside the boundary.

CTRL-02: `TransferSupervisorStatus` is a finite root output to CTX-05 with exactly
`{Ready, NotDocked, TransferStarted, TransferActive, AwaitingReceipt, TransferVerified,
EvidenceFault, UnexpectedEvidence, InputFault, AwaitingNeutral}`.

CTRL-03: `TransferVerificationFinding` is a finite root output to CTX-05 with exactly
`{NotEstablished, Verified, Rejected}`. `Verified` means only that the selected finite
evidence rule was satisfied; `Rejected` means evidence was inapplicable or inconsistent,
not that physical cargo was lost.

### Required nominal, boundary, invalid/fault, and recovery behavior

RISK-01: Invalid, premature, contradictory, or phase-inapplicable evidence could
otherwise cause an unjustified begin command or false logical verification. The
consequence claimed here is only incoherent supervisory output; no likelihood, severity,
physical loss, or safety classification is asserted.

### Essential environmental assumptions and constraints

ASM-01: CTX-01 is responsible for presenting at most one logical offload request at a
time and returning to `NoRequest` before a later fresh request. This makes a two-valued
request event and one-transfer state sufficient without inventing cargo identity,
quantity, queueing, or concurrency.

ASM-02: CTX-02 is responsible for pairing each docking observation with explicit
validity. Valid `Docked` means only that the external context permits logical admission
and continued supervision; it is not proof of latch condition, physical safety, or
docking effectiveness.

ASM-03: CTX-03 is responsible for pairing progress with explicit validity and using
`Complete` or `Failed` only for the one currently active logical transfer. The
supervisor treats valid samples according to policy but does not independently measure
physical cargo movement.

ASM-04: CTX-04 is responsible for pairing warehouse evidence with explicit validity and
using confirmation or rejection only for the one active logical transfer. Because
identity and quantity are absent, this is an experiment assumption necessary for bounded
evidence applicability, not a source fact.

ASM-05: CTX-03 is responsible for interpreting `BeginOffload` as a one-evaluation
logical request and for not treating later `Hold` as cancellation. No delivery
guarantee, retry protocol, acknowledgment timing, or physical effect is implied.

ASM-06: CTX-05 is responsible for treating CTRL-02 and CTRL-03 as supervisory
information. `Verified` is a finite-policy result relative to assumed input meaning and
shall not be represented as independent warehouse truth, game fidelity, or
certification.

## Supporting contract definitions

### State `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::transferPhase`

State `transferPhase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.

### State `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::rearmRequired`

State `rearmRequired` has type `Base_Types::Boolean`.

### `Mining_Cargo_Transfer_Supervisor::DockingAssessmentOwner::assessDocking`

- Function category: Strictly pure
- Input `sample` has type `Mining_Cargo_Transfer_Supervisor::DockingSample`.
- Result type: `Mining_Cargo_Transfer_Supervisor::DockingAssessment`.

> The function returns the value selected as follows:
>
> **If:**
>
> `sample.status` is `InputStatus.Invalid`
>
> **Use:**
>
> `DockingAssessment.InvalidDocking`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.docking` is `DockingObservation.Docked`
>
> **Use:**
>
> `DockingAssessment.DockedAssessment`
>
> **Otherwise use:**
>
> `DockingAssessment.NotDockedAssessment`.

### `Mining_Cargo_Transfer_Supervisor::RequestQualification::qualifyRequest`

- Function category: Strictly pure
- Input `sample` has type `Mining_Cargo_Transfer_Supervisor::OffloadRequestSample`.
- Result type: `Mining_Cargo_Transfer_Supervisor::QualifiedRequest`.

> The function returns the value selected as follows:
>
> **If:**
>
> `sample.status` is `InputStatus.Invalid`
>
> **Use:**
>
> `QualifiedRequest.InvalidRequest`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.requestEvent` is `OffloadRequestEvent.OffloadRequested`
>
> **Use:**
>
> `QualifiedRequest.QualifiedOffloadRequest`
>
> **Otherwise use:**
>
> `QualifiedRequest.NoQualifiedRequest`.

### `Mining_Cargo_Transfer_Supervisor::ShipProgressQualification::qualifyShip`

- Function category: Strictly pure
- Input `sample` has type `Mining_Cargo_Transfer_Supervisor::ShipTransferSample`.
- Result type: `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.

> The function returns the value selected as follows:
>
> **If:**
>
> `sample.status` is `InputStatus.Invalid`
>
> **Use:**
>
> `QualifiedShipProgress.InvalidShipProgress`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.progress` is `ShipTransferProgress.InProgress`
>
> **Use:**
>
> `QualifiedShipProgress.ShipInProgress`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.progress` is `ShipTransferProgress.Complete`
>
> **Use:**
>
> `QualifiedShipProgress.ShipComplete`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.progress` is `ShipTransferProgress.Failed`
>
> **Use:**
>
> `QualifiedShipProgress.ShipFailed`
>
> **Otherwise use:**
>
> `QualifiedShipProgress.ShipIdle`.

### `Mining_Cargo_Transfer_Supervisor::TransferCommandDerivation::commandFor`

- Function category: Strictly pure
- Input `value` has type `Mining_Cargo_Transfer_Supervisor::TransferResolution`.
- Result type: `Mining_Cargo_Transfer_Supervisor::CargoTransferCommand`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value.disposition` is `TransferDisposition.BeginAccepted`
>
> **Use:**
>
> `CargoTransferCommand.BeginOffload`
>
> **Otherwise use:**
>
> `CargoTransferCommand.Hold`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g01Invalid`

- Function category: Strictly pure
- Input `request` has type `Mining_Cargo_Transfer_Supervisor::QualifiedRequest`.
- Input `docking` has type `Mining_Cargo_Transfer_Supervisor::DockingAssessment`.
- Input `ship` has type `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `request` is `QualifiedRequest.InvalidRequest`, `docking` is `DockingAssessment.InvalidDocking`, `ship` is `QualifiedShipProgress.InvalidShipProgress`, or `warehouse` is `QualifiedWarehouseEvidence.InvalidWarehouseEvidence`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::neutral`

- Function category: Strictly pure
- Input `request` has type `Mining_Cargo_Transfer_Supervisor::QualifiedRequest`.
- Input `ship` has type `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `request` is `QualifiedRequest.NoQualifiedRequest`, `ship` is `QualifiedShipProgress.ShipIdle`, and `warehouse` is `QualifiedWarehouseEvidence.NoQualifiedReceipt`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g02RearmBlocked`

- Function category: Strictly pure
- Input `rearm` has type `Base_Types::Boolean`.
- Input `request` has type `Mining_Cargo_Transfer_Supervisor::QualifiedRequest`.
- Input `ship` has type `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - `rearm` is true
>   - It is not the case that:
>     
>     the result of `neutral` for (`request`, `ship`, `warehouse`) is true.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g03RearmCleared`

- Function category: Strictly pure
- Input `rearm` has type `Base_Types::Boolean`.
- Input `request` has type `Mining_Cargo_Transfer_Supervisor::QualifiedRequest`.
- Input `docking` has type `Mining_Cargo_Transfer_Supervisor::DockingAssessment`.
- Input `ship` has type `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - `rearm` is true
>   - It is not the case that:
>     
>     the result of `g01Invalid` for (`request`, `docking`, `ship`, `warehouse`) is true
>   - the result of `neutral` for (`request`, `ship`, `warehouse`) is true.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g04ActiveFault`

- Function category: Strictly pure
- Input `phase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.
- Input `docking` has type `Mining_Cargo_Transfer_Supervisor::DockingAssessment`.
- Input `ship` has type `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - `phase` is `TransferPhase.TransferOutstanding`
>       - `phase` is `TransferPhase.AwaitingReceipt`
>   - At least one of the following conditions holds:
>     
>       - `docking` is `DockingAssessment.NotDockedAssessment`
>       - `ship` is `QualifiedShipProgress.ShipFailed`
>       - `warehouse` is `QualifiedWarehouseEvidence.QualifiedReceiptRejected`
>       - All of the following conditions hold:
>         
>           - `phase` is `TransferPhase.TransferOutstanding`
>           - `warehouse` is `QualifiedWarehouseEvidence.QualifiedReceiptConfirmed`
>           - `ship` is not `QualifiedShipProgress.ShipComplete`
>       - All of the following conditions hold:
>         
>           - `phase` is `TransferPhase.AwaitingReceipt`
>           - `ship` is `QualifiedShipProgress.ShipInProgress`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g05UnexpectedIdle`

- Function category: Strictly pure
- Input `phase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.
- Input `ship` has type `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - `phase` is `TransferPhase.Idle`
>   - At least one of the following conditions holds:
>     
>       - `ship` is not `QualifiedShipProgress.ShipIdle`
>       - `warehouse` is not `QualifiedWarehouseEvidence.NoQualifiedReceipt`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g06BeginAccepted`

- Function category: Strictly pure
- Input `phase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.
- Input `request` has type `Mining_Cargo_Transfer_Supervisor::QualifiedRequest`.
- Input `docking` has type `Mining_Cargo_Transfer_Supervisor::DockingAssessment`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `phase` is `TransferPhase.Idle`, `request` is `QualifiedRequest.QualifiedOffloadRequest`, and `docking` is `DockingAssessment.DockedAssessment`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g07BeginDenied`

- Function category: Strictly pure
- Input `phase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.
- Input `request` has type `Mining_Cargo_Transfer_Supervisor::QualifiedRequest`.
- Input `docking` has type `Mining_Cargo_Transfer_Supervisor::DockingAssessment`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `phase` is `TransferPhase.Idle`, `request` is `QualifiedRequest.QualifiedOffloadRequest`, and `docking` is `DockingAssessment.NotDockedAssessment`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g08VerifiedImmediate`

- Function category: Strictly pure
- Input `phase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.
- Input `ship` has type `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `phase` is `TransferPhase.TransferOutstanding`, `ship` is `QualifiedShipProgress.ShipComplete`, and `warehouse` is `QualifiedWarehouseEvidence.QualifiedReceiptConfirmed`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g09ReceiptPending`

- Function category: Strictly pure
- Input `phase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.
- Input `ship` has type `Mining_Cargo_Transfer_Supervisor::QualifiedShipProgress`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `phase` is `TransferPhase.TransferOutstanding`, `ship` is `QualifiedShipProgress.ShipComplete`, and `warehouse` is `QualifiedWarehouseEvidence.NoQualifiedReceipt`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g10VerifiedDelayed`

- Function category: Strictly pure
- Input `phase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.
- Input `warehouse` has type `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `phase` is `TransferPhase.AwaitingReceipt` and `warehouse` is `QualifiedWarehouseEvidence.QualifiedReceiptConfirmed`.

### `Mining_Cargo_Transfer_Supervisor::TransferDecisionOwner::g11ActiveHolding`

- Function category: Strictly pure
- Input `phase` has type `Mining_Cargo_Transfer_Supervisor::TransferPhase`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `phase` is `TransferPhase.TransferOutstanding` or `phase` is `TransferPhase.AwaitingReceipt`.

### `Mining_Cargo_Transfer_Supervisor::TransferReportDerivation::statusFor`

- Function category: Strictly pure
- Input `value` has type `Mining_Cargo_Transfer_Supervisor::TransferResolution`.
- Result type: `Mining_Cargo_Transfer_Supervisor::TransferSupervisorStatus`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value.disposition` is `TransferDisposition.InputFault`
>
> **Use:**
>
> `TransferSupervisorStatus.InputFault`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.disposition` is `TransferDisposition.RearmBlocked`
>
> **Use:**
>
> `TransferSupervisorStatus.AwaitingNeutral`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value.disposition` is `TransferDisposition.RearmCleared`
>   - `value.disposition` is `TransferDisposition.IdleHolding`
>
> **Use:**
>
> `TransferSupervisorStatus.Ready`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.disposition` is `TransferDisposition.ActiveEvidenceFault`
>
> **Use:**
>
> `TransferSupervisorStatus.EvidenceFault`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.disposition` is `TransferDisposition.UnexpectedIdleEvidence`
>
> **Use:**
>
> `TransferSupervisorStatus.UnexpectedEvidence`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.disposition` is `TransferDisposition.BeginAccepted`
>
> **Use:**
>
> `TransferSupervisorStatus.TransferStarted`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.disposition` is `TransferDisposition.BeginDenied`
>
> **Use:**
>
> `TransferSupervisorStatus.NotDocked`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value.disposition` is `TransferDisposition.VerifiedImmediate`
>   - `value.disposition` is `TransferDisposition.VerifiedDelayed`
>
> **Use:**
>
> `TransferSupervisorStatus.TransferVerified`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.disposition` is `TransferDisposition.ReceiptPending`
>
> **Use:**
>
> `TransferSupervisorStatus.AwaitingReceipt`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value.nextPhase` is `TransferPhase.TransferOutstanding`
>
> **Use:**
>
> `TransferSupervisorStatus.TransferActive`
>
> **Otherwise use:**
>
> `TransferSupervisorStatus.AwaitingReceipt`.

### `Mining_Cargo_Transfer_Supervisor::TransferReportDerivation::findingFor`

- Function category: Strictly pure
- Input `value` has type `Mining_Cargo_Transfer_Supervisor::TransferResolution`.
- Result type: `Mining_Cargo_Transfer_Supervisor::TransferVerificationFinding`.

> The function returns the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value.disposition` is `TransferDisposition.ActiveEvidenceFault`
>   - `value.disposition` is `TransferDisposition.UnexpectedIdleEvidence`
>
> **Use:**
>
> `TransferVerificationFinding.Rejected`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `value.disposition` is `TransferDisposition.VerifiedImmediate`
>   - `value.disposition` is `TransferDisposition.VerifiedDelayed`
>
> **Use:**
>
> `TransferVerificationFinding.Verified`
>
> **Otherwise use:**
>
> `TransferVerificationFinding.NotEstablished`.

### `Mining_Cargo_Transfer_Supervisor::WarehouseEvidenceQualification::qualifyWarehouse`

- Function category: Strictly pure
- Input `sample` has type `Mining_Cargo_Transfer_Supervisor::WarehouseReceiptSample`.
- Result type: `Mining_Cargo_Transfer_Supervisor::QualifiedWarehouseEvidence`.

> The function returns the value selected as follows:
>
> **If:**
>
> `sample.status` is `InputStatus.Invalid`
>
> **Use:**
>
> `QualifiedWarehouseEvidence.InvalidWarehouseEvidence`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.receipt` is `WarehouseReceiptEvidence.ReceiptConfirmed`
>
> **Use:**
>
> `QualifiedWarehouseEvidence.QualifiedReceiptConfirmed`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.receipt` is `WarehouseReceiptEvidence.ReceiptRejected`
>
> **Use:**
>
> `QualifiedWarehouseEvidence.QualifiedReceiptRejected`
>
> **Otherwise use:**
>
> `QualifiedWarehouseEvidence.NoQualifiedReceipt`.

## Detailed behavioral requirements

### Requirements for DockingAssessmentOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_DOCKING_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, DockingAssessmentOwner shall set dockingAssessment to InvalidDocking.

#### Contract clauses evaluated in the compute phase

##### `QUAL_DOCK_TOTAL` — Required behavior

> During contract evaluation for the compute phase, DockingAssessmentOwner shall set dockingAssessment to the result of DockingAssessmentOwner supervisionProcess dockingAssessmentOwner assessDocking for (dockingSample).

### Requirements for RequestQualification

#### Contract clauses evaluated in the initialization phase

##### `INIT_REQUEST_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, RequestQualification shall set qualifiedRequest to NoQualifiedRequest.

#### Contract clauses evaluated in the compute phase

##### `QUAL_REQ_TOTAL` — Required behavior

> During contract evaluation for the compute phase, RequestQualification shall set qualifiedRequest to the result of RequestQualification supervisionProcess requestQualification qualifyRequest for (requestSample).

### Requirements for ShipProgressQualification

#### Contract clauses evaluated in the initialization phase

##### `INIT_SHIP_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, ShipProgressQualification shall set qualifiedShipProgress to ShipIdle.

#### Contract clauses evaluated in the compute phase

##### `QUAL_SHIP_TOTAL` — Required behavior

> During contract evaluation for the compute phase, ShipProgressQualification shall set qualifiedShipProgress to the result of ShipProgressQualification supervisionProcess shipProgressQualification qualifyShip for (shipSample).

### Requirements for TransferCommandDerivation

#### Contract clauses evaluated in the initialization phase

##### `INIT_COMMAND_SAFE` — Required behavior

> During contract evaluation for the initialization phase, TransferCommandDerivation shall set command to Hold.

#### Contract clauses evaluated in the compute phase

##### `COMMAND_TOTAL` — Required behavior

> During contract evaluation for the compute phase, TransferCommandDerivation shall set command to the result of TransferCommandDerivation supervisionProcess transferCommandDerivation commandFor for (resolution).

### Requirements for TransferDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_DECISION_OWNER` — Required behavior

> During contract evaluation for the initialization phase, TransferDecisionOwner shall set transferPhase to Idle, rearmRequired to true exactly when F is true, commandResolution nextPhase to Idle, commandResolution nextRearmRequired to true exactly when F is true, commandResolution disposition to IdleHolding, reportResolution nextPhase to Idle, reportResolution nextRearmRequired to true exactly when F is true, and reportResolution disposition to IdleHolding.

#### Contract clauses evaluated in the compute phase

##### `STATE_INVARIANT` — Required behavior

> During contract evaluation for the compute phase, TransferDecisionOwner shall produce a result for which if rearmRequired is true, then transferPhase is Idle.

##### `RESOLUTION_DELIVERIES_AGREE` — Required behavior

> During contract evaluation for the compute phase, TransferDecisionOwner shall set commandResolution nextPhase to reportResolution nextPhase, commandResolution nextRearmRequired to true exactly when reportResolution nextRearmRequired is true, and commandResolution disposition to reportResolution disposition.

##### `CASE_01_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 01 INPUT FAULT applies under all of the following conditions:
>
> the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when T is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when T is true, commandResolution disposition is InputFault, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when T is true, and reportResolution disposition is InputFault.

##### `CASE_02_REARM_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 REARM BLOCKED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when T is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when T is true, commandResolution disposition is RearmBlocked, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when T is true, and reportResolution disposition is RearmBlocked.

##### `CASE_03_REARM_CLEARED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 03 REARM CLEARED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when F is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when F is true, commandResolution disposition is RearmCleared, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when F is true, and reportResolution disposition is RearmCleared.

##### `CASE_04_ACTIVE_EVIDENCE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 04 ACTIVE EVIDENCE FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when T is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when T is true, commandResolution disposition is ActiveEvidenceFault, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when T is true, and reportResolution disposition is ActiveEvidenceFault.

##### `CASE_05_UNEXPECTED_IDLE_EVIDENCE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 UNEXPECTED IDLE EVIDENCE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g05UnexpectedIdle for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when T is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when T is true, commandResolution disposition is UnexpectedIdleEvidence, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when T is true, and reportResolution disposition is UnexpectedIdleEvidence.

##### `CASE_06_BEGIN_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 BEGIN ACCEPTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g05UnexpectedIdle for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g06BeginAccepted for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is TransferOutstanding, rearmRequired is true exactly when F is true, commandResolution nextPhase is TransferOutstanding, commandResolution nextRearmRequired is true exactly when F is true, commandResolution disposition is BeginAccepted, reportResolution nextPhase is TransferOutstanding, reportResolution nextRearmRequired is true exactly when F is true, and reportResolution disposition is BeginAccepted.

##### `CASE_07_BEGIN_DENIED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 BEGIN DENIED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g05UnexpectedIdle for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g06BeginAccepted for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g07BeginDenied for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when T is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when T is true, commandResolution disposition is BeginDenied, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when T is true, and reportResolution disposition is BeginDenied.

##### `CASE_08_VERIFIED_IMMEDIATE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 VERIFIED IMMEDIATE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g05UnexpectedIdle for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g06BeginAccepted for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g07BeginDenied for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g08VerifiedImmediate for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when T is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when T is true, commandResolution disposition is VerifiedImmediate, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when T is true, and reportResolution disposition is VerifiedImmediate.

##### `CASE_09_RECEIPT_PENDING` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 RECEIPT PENDING applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g05UnexpectedIdle for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g06BeginAccepted for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g07BeginDenied for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g08VerifiedImmediate for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g09ReceiptPending for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is AwaitingReceipt, rearmRequired is true exactly when F is true, commandResolution nextPhase is AwaitingReceipt, commandResolution nextRearmRequired is true exactly when F is true, commandResolution disposition is ReceiptPending, reportResolution nextPhase is AwaitingReceipt, reportResolution nextRearmRequired is true exactly when F is true, and reportResolution disposition is ReceiptPending.

##### `CASE_10_VERIFIED_DELAYED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 VERIFIED DELAYED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g05UnexpectedIdle for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g06BeginAccepted for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g07BeginDenied for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g08VerifiedImmediate for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g09ReceiptPending for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g10VerifiedDelayed for (the value of transferPhase on entry, qualifiedWarehouseEvidence) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when T is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when T is true, commandResolution disposition is VerifiedDelayed, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when T is true, and reportResolution disposition is VerifiedDelayed.

##### `CASE_11_ACTIVE_HOLDING` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 11 ACTIVE HOLDING applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g05UnexpectedIdle for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g06BeginAccepted for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g07BeginDenied for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g08VerifiedImmediate for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g09ReceiptPending for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g10VerifiedDelayed for (the value of transferPhase on entry, qualifiedWarehouseEvidence) is true
>   - the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g11ActiveHolding for (the value of transferPhase on entry) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is the value of transferPhase on entry, rearmRequired is true exactly when F is true, commandResolution nextPhase is the value of transferPhase on entry, commandResolution nextRearmRequired is true exactly when F is true, commandResolution disposition is ActiveHolding, reportResolution nextPhase is the value of transferPhase on entry, reportResolution nextRearmRequired is true exactly when F is true, and reportResolution disposition is ActiveHolding.

##### `CASE_12_IDLE_HOLDING` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 IDLE HOLDING applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g01Invalid for (qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g02RearmBlocked for (the value of rearmRequired on entry is true, qualifiedRequest, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g03RearmCleared for (the value of rearmRequired on entry is true, qualifiedRequest, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g04ActiveFault for (the value of transferPhase on entry, dockingAssessment, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g05UnexpectedIdle for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g06BeginAccepted for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g07BeginDenied for (the value of transferPhase on entry, qualifiedRequest, dockingAssessment) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g08VerifiedImmediate for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g09ReceiptPending for (the value of transferPhase on entry, qualifiedShipProgress, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g10VerifiedDelayed for (the value of transferPhase on entry, qualifiedWarehouseEvidence) is true
>   - It is not the case that:
>     
>     the result of TransferDecisionOwner supervisionProcess transferDecisionOwner g11ActiveHolding for (the value of transferPhase on entry) is true.

> When all applicability conditions are met, TransferDecisionOwner shall produce a result for which all of the following conditions hold:
>
> transferPhase is Idle, rearmRequired is true exactly when F is true, commandResolution nextPhase is Idle, commandResolution nextRearmRequired is true exactly when F is true, commandResolution disposition is IdleHolding, reportResolution nextPhase is Idle, reportResolution nextRearmRequired is true exactly when F is true, and reportResolution disposition is IdleHolding.

### Requirements for TransferReportDerivation

#### Contract clauses evaluated in the initialization phase

##### `INIT_REPORT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, TransferReportDerivation shall set supervisorStatus to Ready and verificationFinding to NotEstablished.

#### Contract clauses evaluated in the compute phase

##### `REPORT_TOTAL` — Required behavior

> During contract evaluation for the compute phase, TransferReportDerivation shall set supervisorStatus to the result of TransferReportDerivation supervisionProcess transferReportDerivation statusFor for (resolution) and verificationFinding to the result of TransferReportDerivation supervisionProcess transferReportDerivation findingFor for (resolution).

### Requirements for WarehouseEvidenceQualification

#### Contract clauses evaluated in the initialization phase

##### `INIT_WAREHOUSE_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, WarehouseEvidenceQualification shall set qualifiedWarehouseEvidence to NoQualifiedReceipt.

#### Contract clauses evaluated in the compute phase

##### `QUAL_WAREHOUSE_TOTAL` — Required behavior

> During contract evaluation for the compute phase, WarehouseEvidenceQualification shall set qualifiedWarehouseEvidence to the result of WarehouseEvidenceQualification supervisionProcess warehouseEvidenceQualification qualifyWarehouse for (warehouseSample).
