# Station Cargo-Transfer Evidence Coordinator

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A pilot and station need one bounded
coordinator to supervise a single frigate-to-warehouse cargo-transfer attempt so that
logical transfer commands and completion reports are based on dock-ready context,
matching ship and warehouse evidence, and an explicitly recoverable evidence history.

PURPOSE-01: [Pilot abstraction] For each evaluation, the system shall classify a
transfer request, dock context, ship report, warehouse report, and supervisory control
event; update request, session, evidence, and recovery state; select at most one logical
action; and publish one coherent transfer result.

GOAL-01: [Pilot abstraction] The system shall deterministically cover every finite
boundary snapshot and every admitted prior-state tuple with no unconstrained next state
or output field.

GOAL-02: [Pilot abstraction] A newly detected fault, emergency stop, or incomplete
recovery shall dominate cancellation and ordinary transfer progress; otherwise a
matching cancellation shall dominate warehouse verification, ship progress, and a fresh
start.

GOAL-03: [Pilot abstraction] Invalid, failed, rejected, conflicting, mistagged, or
phase-inconsistent evidence shall propagate in the same evaluation through coherence
classification, recovery latching, state inhibition, priority selection, and the public
result.

GOAL-04: [Pilot abstraction] Recovery shall require a fresh `RESET` while latched
followed in a later evaluation by a distinct fresh `VERIFY_OK`; neither event alone nor
an out-of-order event shall reopen ordinary action selection.

GOAL-05: [Selected architecture] The selected action, cause, mode, correlation token,
request disposition, and transfer outcome shall be composed into one indivisible flat
`TransferCoordinationResult` from transmitted owner-local decisions.

### Operational context and finite system boundary

CTX-SYS-01: [Selected boundary] The modeled system is a logical station cargo-transfer
evidence coordinator. Physical docking, undocking, cargo motion, frigate actuation,
warehouse storage, pilot display, station service execution, repair, resupply, mining,
travel, combat, and whole-vessel lifecycle governance remain outside it.

CTX-PILOT-01: [Seed-grounded entity with pilot responsibility] The external pilot
supplies at most one `TransferRequest` per evaluation and consumes the public result
through `CTX-PUB-01`; the pilot is responsible for resubmitting a deferred request and
alternating bounded correlation tokens as specified by `ASM-TAG-01`.

CTX-DOCK-01: [Seed-grounded context with pilot responsibility] An external dock-context
authority supplies one `DockContext` that summarizes the frigate lifecycle and station
permission relevant to logical cargo transfer. It is responsible for the declared
validity and meaning, not for physical docking effectiveness.

CTX-SHIP-01: [Seed-grounded capability with pilot responsibility] The external ship
transfer controller consumes `BEGIN_TRANSFER`, `CONTINUE_TRANSFER`, or `CANCEL_TRANSFER`
actions and supplies a later correlated `ShipReport`; it is responsible for report
freshness and correlation, not for proving physical cargo movement.

CTX-WARE-01: [Seed-grounded entity with pilot responsibility] The external warehouse
interface consumes `REQUEST_WAREHOUSE_VERIFY` and supplies a later correlated
`WarehouseReport`; it is responsible for report freshness and correlation, not for the
truth of physical inventory.

CTX-CTRL-01: [Pilot external authority] A station supervisory authority supplies fresh
emergency and recovery events after external diagnosis and is responsible for separating
`RESET` from a later `VERIFY_OK`.

CTX-PUB-01: [Selected boundary] A pilot-and-station integration recipient consumes one
`TransferCoordinationResult` and conveys the contained logical action to `CTX-SHIP-01`
or `CTX-WARE-01` without changing its meaning. The coordinator controls issuance of a
logical request, not external acceptance or physical completion.

MON-REQ-01: [Pilot abstraction] Root input `transferRequest` has finite type
`TransferRequest={NONE,INVALID,START_A,START_B,CANCEL_A,CANCEL_B}` and comes from
`CTX-PILOT-01`; `A` and `B` are correlation tokens, not cargo identities.

MON-DOCK-01: [Pilot abstraction] Root input `dockContext` has finite type
`DockContext={INVALID,IN_GRID,ON_WARP,DOCKED_WITHHELD,DOCKED_READY}` and comes from
`CTX-DOCK-01`. Only `DOCKED_READY` permits a new logical transfer attempt.

MON-SHIP-01: [Pilot abstraction] Root input `shipReport` has finite type
`ShipReport={NONE,INVALID,ACCEPTED_A,ACCEPTED_B,MOVING_A,MOVING_B,COMPLETE_A,COMPLETE_B,FAILED_A,FAILED_B}`
and comes from `CTX-SHIP-01`; every non-`NONE` value is a fresh single-evaluation
report.

MON-WARE-01: [Pilot abstraction] Root input `warehouseReport` has finite type
`WarehouseReport={NONE,INVALID,PENDING_A,PENDING_B,STORED_A,STORED_B,REJECTED_A,REJECTED_B}`
and comes from `CTX-WARE-01`; every non-`NONE` value is a fresh single-evaluation
report.

MON-CTRL-01: [Pilot abstraction] Root input `controlEvent` has finite type
`ControlEvent={NONE,EMERGENCY_STOP,RESET,VERIFY_OK}` and comes from `CTX-CTRL-01`; every
non-`NONE` value is a fresh single-evaluation event.

CTRL-RES-01: [Selected architecture] The sole root output is the flat record
`TransferCoordinationResult=(action,cause,mode,correlation,requestDisposition,outcome)`,
delivered to `CTX-PUB-01`.

ASM-FRESH-01: [Pilot abstraction] `CTX-PILOT-01`, `CTX-SHIP-01`, `CTX-WARE-01`, and
`CTX-CTRL-01` are responsible for event freshness. Rationale: replayed reports or
recovery events could otherwise advance retained state more than once.

ASM-TAG-01: [Pilot abstraction] `CTX-PILOT-01` shall alternate `A` and `B` between
accepted new attempts and shall retain the active token on cancellation. Rationale: two
tokens bound the analyzer while letting the coordinator distinguish a duplicate from the
next fresh request.

ASM-CAP-01: [Pilot abstraction] The coordinator retains at most one active transfer
session and no cargo quantity or manifest. `CTX-PILOT-01` shall retry a valid request
reported `DEFERRED`. Rationale: these are finite scope bounds, not frigate or warehouse
capacity claims.

ASM-EVENT-01: [Pilot abstraction] At most one of `shipReport` and `warehouseReport`
should be non-`NONE` in a valid environment; if both are non-`NONE`, the coordinator
shall treat the snapshot as conflicting evidence rather than assume an ordering.
`CTX-SHIP-01` and `CTX-WARE-01` share this responsibility.

ASM-LEVEL-01: [Pilot abstraction] Controlled actions are desired logical levels, not
transaction counts. `CTX-SHIP-01` and `CTX-WARE-01` shall not interpret a repeated
identical action as a second transaction while the correlated response remains
outstanding.

ASM-STEP-01: [Pilot abstraction] One evaluation is an ordered logical reaction with no
physical duration: prior owner states and current boundary facts determine a
coordination frame and admission; state owners determine next state; proposals are
selected by priority; composition publishes the result.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, request history is
`NO_HISTORY`, session is `IDLE`, ship and warehouse evidence are `CLEAR`, recovery is
`HEALTHY`, and the public result is
`(HOLD,NO_ELIGIBLE_ACTION,HOLDING,NONE,NO_REQUEST,NONE)`.

### Risks, faults, and mitigations

RISK-01: [Pilot risk] Accepting mistagged or phase-inconsistent ship or warehouse
evidence could report completion for the wrong attempt; `FAULT-01` requires correlation
and phase faults to latch recovery and inhibit progress.

RISK-02: [Pilot risk] Acting on an emergency, explicit failure, invalid report,
rejection, or simultaneous ship and warehouse report as if it were ordinary progress
could leave controlled actions inconsistent with retained state; `FAULT-02` requires
same-evaluation propagation to a fault result.

RISK-03: [Pilot risk] Treating reset as completed recovery could resume a transfer
without an independent post-reset verification event; `FAULT-03` requires a distinct
ordered recovery sequence.

## Supporting contract definitions

### State `Mining_Cargo_Transfer_Evidence_Coordinator::RecoverySupervisor::recoveryState`

State `recoveryState` has type `Mining_Cargo_Transfer_Evidence_Coordinator::RecoveryState`.

### State `Mining_Cargo_Transfer_Evidence_Coordinator::RequestAdmission::requestLedger`

State `requestLedger` has type `Mining_Cargo_Transfer_Evidence_Coordinator::RequestLedger`.

### State `Mining_Cargo_Transfer_Evidence_Coordinator::ShipEvidenceLifecycle::shipEvidenceState`

State `shipEvidenceState` has type `Mining_Cargo_Transfer_Evidence_Coordinator::ShipEvidenceState`.

### State `Mining_Cargo_Transfer_Evidence_Coordinator::TransferSession::sessionState`

State `sessionState` has type `Mining_Cargo_Transfer_Evidence_Coordinator::SessionState`.

### State `Mining_Cargo_Transfer_Evidence_Coordinator::WarehouseEvidenceLifecycle::warehouseEvidenceState`

State `warehouseEvidenceState` has type `Mining_Cargo_Transfer_Evidence_Coordinator::WarehouseEvidenceState`.

## Detailed behavioral requirements

### Requirements for DockContextAssessment

#### Contract clauses evaluated in the initialization phase

##### `INIT_DOCK_FACTS` — Required behavior

> During contract evaluation for the initialization phase, DockContextAssessment shall set dock facts usable to true exactly when F is true, dock facts docked to true exactly when F is true, dock facts permissionGranted to true exactly when F is true, dock facts startReady to true exactly when F is true, and dock facts reason to INVALID CONTEXT.

#### Contract clauses evaluated in the compute phase

##### `CASE_04_DOCK_READY` — Conditional behavior

> During contract evaluation for the compute phase, if dock context is DOCKED READY, DockContextAssessment shall set dock facts usable to true exactly when T is true, dock facts docked to true exactly when T is true, dock facts permissionGranted to true exactly when T is true, dock facts startReady to true exactly when T is true, and dock facts reason to READY.

##### `CASE_05_DOCK_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, if dock context is IN GRID, dock context is ON WARP, or dock context is DOCKED WITHHELD, DockContextAssessment shall produce a result for which dock facts usable is true exactly when T is true, dock facts startReady is true exactly when F is true, if dock context is DOCKED WITHHELD, then dock facts docked is true exactly when T is true, dock facts permissionGranted is true exactly when F is true, and dock facts reason is PERMISSION WITHHELD, and if dock context is IN GRID or dock context is ON WARP, then dock facts docked is true exactly when F is true, dock facts permissionGranted is true exactly when F is true, and dock facts reason is NOT DOCKED.

##### `CASE_06_DOCK_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if dock context is INVALID, DockContextAssessment shall set dock facts usable to true exactly when F is true, dock facts docked to true exactly when F is true, dock facts permissionGranted to true exactly when F is true, dock facts startReady to true exactly when F is true, and dock facts reason to INVALID CONTEXT.

### Requirements for EvidenceCoherence

#### Contract clauses evaluated in the initialization phase

##### `INIT_COHERENCE` — Required behavior

> During contract evaluation for the initialization phase, EvidenceCoherence shall set recovery transition faultTrigger to CLEAR, recovery transition recoveryIntent to RETAIN, coordination guard faultTrigger to CLEAR, coordination guard inhibitOrdinary to OPEN, coordination frame progress to NONE, coordination frame correlation to NONE, coordination frame faultTrigger to CLEAR, coordination frame recoveryIntent to RETAIN, coordination frame inhibitOrdinary to OPEN, coordination frame outcomePulse to NONE, ship update to RETAIN, warehouse update to RETAIN, priority directive kind to ORDINARY, and priority directive correlation to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_21_COHERENCE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 21 COHERENCE FAULT applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - control event is EMERGENCY STOP
>   - ship report facts usable is true exactly when F is true
>   - warehouse report facts usable is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - ship report facts reportClass is not NO EVENT
>       - warehouse report facts reportClass is not NO EVENT
>   - All of the following conditions hold:
>     
>       - prior session view session is IDLE
>       - At least one of the following conditions holds:
>         
>           - prior ship evidence is not CLEAR
>           - prior warehouse evidence is not CLEAR
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - prior session view session is AWAIT SHIP A
>           - prior session view session is AWAIT SHIP B
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - prior ship evidence is not CLEAR
>               - prior ship evidence is not ACKNOWLEDGED
>           - prior warehouse evidence is not CLEAR
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - prior session view session is TRANSFERRING A
>           - prior session view session is TRANSFERRING B
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - prior ship evidence is not ACKNOWLEDGED
>               - prior ship evidence is not MOVING
>           - prior warehouse evidence is not CLEAR
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - prior session view session is AWAIT WAREHOUSE A
>           - prior session view session is AWAIT WAREHOUSE B
>       - prior ship evidence is not COMPLETE
>   - All of the following conditions hold:
>     
>       - ship report facts reportClass is not NO EVENT
>       - At least one of the following conditions holds:
>         
>           - ship report facts correlation is not prior session view correlation
>           - prior session view session is IDLE
>           - prior session view session is AWAIT WAREHOUSE A
>           - prior session view session is AWAIT WAREHOUSE B
>   - All of the following conditions hold:
>     
>       - warehouse report facts reportClass is not NO EVENT
>       - At least one of the following conditions holds:
>         
>           - warehouse report facts correlation is not prior session view correlation
>           - All of the following conditions hold:
>             
>               - prior session view session is not AWAIT WAREHOUSE A
>               - prior session view session is not AWAIT WAREHOUSE B.

> When all applicability conditions are met, EvidenceCoherence shall produce a result for which all of the following conditions hold:
>
> recovery transition faultTrigger is TRIGGERED, recovery transition recoveryIntent is LATCH, coordination guard faultTrigger is TRIGGERED, coordination guard inhibitOrdinary is INHIBITED, coordination frame progress is NONE, coordination frame correlation is prior session view correlation, coordination frame faultTrigger is TRIGGERED, coordination frame recoveryIntent is LATCH, coordination frame inhibitOrdinary is INHIBITED, coordination frame outcomePulse is RECOVERY REQUIRED, ship update is FREEZE, warehouse update is FREEZE, priority directive kind is FAULT OR RECOVERY, and priority directive correlation is prior session view correlation.

##### `CASE_22_RECOVERY_CONTROL` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 22 RECOVERY CONTROL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - control event is not EMERGENCY STOP
>   - ship report facts usable is true exactly when T is true
>   - warehouse report facts usable is true exactly when T is true
>   - At least one of the following conditions holds:
>     
>       - ship report facts reportClass is NO EVENT
>       - warehouse report facts reportClass is NO EVENT
>   - It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - prior session view session is IDLE
>           - At least one of the following conditions holds:
>             
>               - prior ship evidence is not CLEAR
>               - prior warehouse evidence is not CLEAR
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT SHIP A
>               - prior session view session is AWAIT SHIP B
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - prior ship evidence is not CLEAR
>                   - prior ship evidence is not ACKNOWLEDGED
>               - prior warehouse evidence is not CLEAR
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior session view session is TRANSFERRING A
>               - prior session view session is TRANSFERRING B
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - prior ship evidence is not ACKNOWLEDGED
>                   - prior ship evidence is not MOVING
>               - prior warehouse evidence is not CLEAR
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT WAREHOUSE A
>               - prior session view session is AWAIT WAREHOUSE B
>           - prior ship evidence is not COMPLETE
>       - All of the following conditions hold:
>         
>           - ship report facts reportClass is not NO EVENT
>           - At least one of the following conditions holds:
>             
>               - ship report facts correlation is not prior session view correlation
>               - prior session view session is IDLE
>               - prior session view session is AWAIT WAREHOUSE A
>               - prior session view session is AWAIT WAREHOUSE B
>       - All of the following conditions hold:
>         
>           - warehouse report facts reportClass is not NO EVENT
>           - At least one of the following conditions holds:
>             
>               - warehouse report facts correlation is not prior session view correlation
>               - All of the following conditions hold:
>                 
>                   - prior session view session is not AWAIT WAREHOUSE A
>                   - prior session view session is not AWAIT WAREHOUSE B
>   - At least one of the following conditions holds:
>     
>       - prior recovery state is not HEALTHY
>       - control event is not NONE.

> When all applicability conditions are met, EvidenceCoherence shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recovery transition faultTrigger is CLEAR
>   - coordination guard faultTrigger is CLEAR
>   - coordination guard inhibitOrdinary is INHIBITED
>   - coordination frame progress is NONE
>   - coordination frame correlation is prior session view correlation
>   - coordination frame faultTrigger is CLEAR
>   - coordination frame inhibitOrdinary is INHIBITED
>   - coordination frame outcomePulse is RECOVERY REQUIRED
>   - ship update is FREEZE
>   - warehouse update is FREEZE
>   - priority directive kind is FAULT OR RECOVERY
>   - priority directive correlation is prior session view correlation
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - prior recovery state is LATCHED
>       - control event is RESET
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - recovery transition recoveryIntent is BEGIN RECOVERY
>       - coordination frame recoveryIntent is BEGIN RECOVERY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - prior recovery state is RECOVERING
>       - control event is VERIFY OK
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - recovery transition recoveryIntent is OPEN RECOVERY
>       - coordination frame recoveryIntent is OPEN RECOVERY
>   - **If:**
>     
>     It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - prior recovery state is LATCHED
>           - control event is RESET
>       - All of the following conditions hold:
>         
>           - prior recovery state is RECOVERING
>           - control event is VERIFY OK
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - recovery transition recoveryIntent is RETAIN
>       - coordination frame recoveryIntent is RETAIN.

##### `CASE_23_SHIP_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 23 SHIP PROGRESS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - prior recovery state is HEALTHY
>   - control event is NONE
>   - warehouse report facts reportClass is NO EVENT
>   - ship report facts usable is true exactly when T is true
>   - ship report facts reportClass is not NO EVENT
>   - ship report facts correlation is prior session view correlation
>   - At least one of the following conditions holds:
>     
>       - prior session view session is AWAIT SHIP A
>       - prior session view session is AWAIT SHIP B
>       - prior session view session is TRANSFERRING A
>       - prior session view session is TRANSFERRING B
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - prior session view session is AWAIT SHIP A
>       - prior session view session is AWAIT SHIP B
>     
>     **Then:**
>     
>     At least one of the following conditions holds:
>     
>       - prior ship evidence is CLEAR
>       - prior ship evidence is ACKNOWLEDGED
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - prior session view session is TRANSFERRING A
>       - prior session view session is TRANSFERRING B
>     
>     **Then:**
>     
>     At least one of the following conditions holds:
>     
>       - prior ship evidence is ACKNOWLEDGED
>       - prior ship evidence is MOVING
>   - prior warehouse evidence is CLEAR.

> When all applicability conditions are met, EvidenceCoherence shall produce a result for which all of the following conditions hold:
>
> recovery transition faultTrigger is CLEAR, recovery transition recoveryIntent is RETAIN, coordination guard faultTrigger is CLEAR, coordination guard inhibitOrdinary is OPEN, coordination frame correlation is ship report facts correlation, coordination frame faultTrigger is CLEAR, coordination frame recoveryIntent is RETAIN, coordination frame inhibitOrdinary is OPEN, coordination frame outcomePulse is NONE, warehouse update is RETAIN, priority directive kind is ORDINARY, priority directive correlation is ship report facts correlation, if ship report facts reportClass is ACCEPTED, then coordination frame progress is SHIP ACCEPTED and ship update is ACKNOWLEDGE, if ship report facts reportClass is MOVING, then coordination frame progress is SHIP MOVING and ship update is MARK MOVING, and if ship report facts reportClass is COMPLETE, then coordination frame progress is SHIP COMPLETE and ship update is MARK COMPLETE.

##### `CASE_24_WAREHOUSE_OR_NO_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 24 WAREHOUSE OR NO PROGRESS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - prior recovery state is HEALTHY
>   - control event is NONE
>   - ship report facts reportClass is NO EVENT
>   - warehouse report facts usable is true exactly when T is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - warehouse report facts reportClass is NO EVENT
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - prior session view session is IDLE
>                   - prior ship evidence is CLEAR
>                   - prior warehouse evidence is CLEAR
>               - All of the following conditions hold:
>                 
>                   - At least one of the following conditions holds:
>                     
>                       - prior session view session is AWAIT SHIP A
>                       - prior session view session is AWAIT SHIP B
>                   - At least one of the following conditions holds:
>                     
>                       - prior ship evidence is CLEAR
>                       - prior ship evidence is ACKNOWLEDGED
>                   - prior warehouse evidence is CLEAR
>               - All of the following conditions hold:
>                 
>                   - At least one of the following conditions holds:
>                     
>                       - prior session view session is TRANSFERRING A
>                       - prior session view session is TRANSFERRING B
>                   - At least one of the following conditions holds:
>                     
>                       - prior ship evidence is ACKNOWLEDGED
>                       - prior ship evidence is MOVING
>                   - prior warehouse evidence is CLEAR
>               - All of the following conditions hold:
>                 
>                   - At least one of the following conditions holds:
>                     
>                       - prior session view session is AWAIT WAREHOUSE A
>                       - prior session view session is AWAIT WAREHOUSE B
>                   - prior ship evidence is COMPLETE
>       - All of the following conditions hold:
>         
>           - warehouse report facts reportClass is not NO EVENT
>           - warehouse report facts correlation is prior session view correlation
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT WAREHOUSE A
>               - prior session view session is AWAIT WAREHOUSE B
>           - prior ship evidence is COMPLETE.

> When all applicability conditions are met, EvidenceCoherence shall produce a result for which all of the following conditions hold:
>
> recovery transition faultTrigger is CLEAR, recovery transition recoveryIntent is RETAIN, coordination guard faultTrigger is CLEAR, coordination guard inhibitOrdinary is OPEN, coordination frame faultTrigger is CLEAR, coordination frame recoveryIntent is RETAIN, coordination frame inhibitOrdinary is OPEN, if warehouse report facts reportClass is NO EVENT, then coordination frame progress is NONE, coordination frame correlation is prior session view correlation, coordination frame outcomePulse is NONE, ship update is RETAIN, warehouse update is RETAIN, priority directive kind is ORDINARY, and priority directive correlation is prior session view correlation, if warehouse report facts reportClass is PENDING, then coordination frame progress is WAREHOUSE PENDING, coordination frame correlation is warehouse report facts correlation, coordination frame outcomePulse is NONE, ship update is RETAIN, warehouse update is MARK PENDING, priority directive kind is ORDINARY, and priority directive correlation is warehouse report facts correlation, and if warehouse report facts reportClass is STORED, then coordination frame progress is WAREHOUSE STORED, coordination frame correlation is warehouse report facts correlation, coordination frame outcomePulse is COMPLETED, ship update is CLEAR, warehouse update is CLEAR, priority directive kind is COMPLETION, and priority directive correlation is warehouse report facts correlation.

### Requirements for RecoverySupervisor

#### Contract clauses evaluated in the initialization phase

##### `INIT_RECOVERY` — Required behavior

> During contract evaluation for the initialization phase, RecoverySupervisor shall set recoveryState to HEALTHY and prior recovery state to HEALTHY.

#### Contract clauses evaluated in the compute phase

##### `CASE_22_RECOVERY_TRANSITION` — Required behavior

> During contract evaluation for the compute phase, RecoverySupervisor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - prior recovery state is the value of recoveryState on entry
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - recovery transition faultTrigger is TRIGGERED
>       - recovery transition recoveryIntent is LATCH
>     
>     **Then:**
>     
>     recoveryState is LATCHED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - recovery transition faultTrigger is CLEAR
>       - recovery transition recoveryIntent is BEGIN RECOVERY
>       - the value of recoveryState on entry is LATCHED
>     
>     **Then:**
>     
>     recoveryState is RECOVERING
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - recovery transition faultTrigger is CLEAR
>       - recovery transition recoveryIntent is OPEN RECOVERY
>       - the value of recoveryState on entry is RECOVERING
>     
>     **Then:**
>     
>     recoveryState is HEALTHY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - recovery transition faultTrigger is CLEAR
>       - It is not the case that:
>         
>         At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - recovery transition recoveryIntent is BEGIN RECOVERY
>               - the value of recoveryState on entry is LATCHED
>           - All of the following conditions hold:
>             
>               - recovery transition recoveryIntent is OPEN RECOVERY
>               - the value of recoveryState on entry is RECOVERING
>     
>     **Then:**
>     
>     recoveryState is the value of recoveryState on entry.

### Requirements for RequestAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INIT_REQUEST_FACTS` — Required behavior

> During contract evaluation for the initialization phase, RequestAcquisition shall set request facts kind to NONE, request facts correlation to NONE, request facts requestValidity to true exactly when T is true, and request facts present to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_REQUEST_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if transfer request is NONE, RequestAcquisition shall set request facts kind to NONE, request facts correlation to NONE, request facts requestValidity to true exactly when T is true, and request facts present to true exactly when F is true.

##### `CASE_02_REQUEST_COMMAND` — Conditional behavior

> During contract evaluation for the compute phase, if transfer request is START A, transfer request is START B, transfer request is CANCEL A, or transfer request is CANCEL B, RequestAcquisition shall produce a result for which request facts present is true exactly when T is true, request facts requestValidity is true exactly when T is true, if transfer request is START A or transfer request is START B, then request facts kind is START, if transfer request is CANCEL A or transfer request is CANCEL B, then request facts kind is CANCEL, if transfer request is START A or transfer request is CANCEL A, then request facts correlation is A, and if transfer request is START B or transfer request is CANCEL B, then request facts correlation is B.

##### `CASE_03_REQUEST_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if transfer request is INVALID, RequestAcquisition shall set request facts kind to INVALID, request facts correlation to NONE, request facts requestValidity to true exactly when F is true, and request facts present to true exactly when T is true.

### Requirements for RequestActionEligibility

#### Contract clauses evaluated in the initialization phase

##### `INIT_REQUEST_PROPOSAL` — Required behavior

> During contract evaluation for the initialization phase, RequestActionEligibility shall set request proposal kind to NONE, request proposal actionValue to HOLD, and request proposal correlation to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_26_REQUEST_PROPOSAL` — Required behavior

> During contract evaluation for the compute phase, RequestActionEligibility shall produce a result for which if admission decision disposition is ACCEPTED, then request proposal kind is START, request proposal actionValue is BEGIN TRANSFER, and request proposal correlation is admission decision correlation, if admission decision disposition is CANCEL ACCEPTED, then request proposal kind is CANCEL, request proposal actionValue is CANCEL TRANSFER, and request proposal correlation is admission decision correlation, and if admission decision disposition is not ACCEPTED and admission decision disposition is not CANCEL ACCEPTED, then request proposal kind is NONE, request proposal actionValue is HOLD, and request proposal correlation is NONE.

### Requirements for RequestAdmission

#### Contract clauses evaluated in the initialization phase

##### `INIT_ADMISSION` — Required behavior

> During contract evaluation for the initialization phase, RequestAdmission shall set requestLedger to NO HISTORY, admission decision kind to NONE, admission decision correlation to NONE, admission decision disposition to NO REQUEST, admission decision updateLedger to NO HISTORY, and request disposition to NO REQUEST.

#### Contract clauses evaluated in the compute phase

##### `CASE_13_NO_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if request facts present is true exactly when F is true, RequestAdmission shall preserve the value of requestLedger on entry, set admission decision kind to NONE, set admission decision correlation to NONE, set admission decision disposition to NO REQUEST, set admission decision updateLedger to the value of requestLedger on entry, and set request disposition to NO REQUEST.

##### `CASE_14_INVALID_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if request facts present is true exactly when T is true and request facts requestValidity is true exactly when F is true, RequestAdmission shall preserve the value of requestLedger on entry, set admission decision kind to INVALID, set admission decision correlation to NONE, set admission decision disposition to REJECTED, set admission decision updateLedger to the value of requestLedger on entry, and set request disposition to REJECTED.

##### `CASE_15_ACCEPT_FRESH_START` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 ACCEPT FRESH START applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts requestValidity is true exactly when T is true
>   - request facts kind is START
>   - coordination guard inhibitOrdinary is OPEN
>   - prior session view session is IDLE
>   - dock facts startReady is true exactly when T is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request facts correlation is A
>           - the value of requestLedger on entry is not A LAST
>       - All of the following conditions hold:
>         
>           - request facts correlation is B
>           - the value of requestLedger on entry is not B LAST.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> admission decision kind is START, admission decision correlation is request facts correlation, admission decision disposition is ACCEPTED, request disposition is ACCEPTED, if request facts correlation is A, then requestLedger is A LAST and admission decision updateLedger is A LAST, and if request facts correlation is B, then requestLedger is B LAST and admission decision updateLedger is B LAST.

##### `CASE_16_DUPLICATE_START` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 16 DUPLICATE START applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts requestValidity is true exactly when T is true
>   - request facts kind is START
>   - coordination guard inhibitOrdinary is OPEN
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request facts correlation is A
>           - the value of requestLedger on entry is A LAST
>       - All of the following conditions hold:
>         
>           - request facts correlation is B
>           - the value of requestLedger on entry is B LAST.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> requestLedger is the value of requestLedger on entry, admission decision kind is START, admission decision correlation is request facts correlation, admission decision disposition is DUPLICATE, admission decision updateLedger is the value of requestLedger on entry, and request disposition is DUPLICATE.

##### `CASE_17_START_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 17 START NOT READY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts requestValidity is true exactly when T is true
>   - request facts kind is START
>   - coordination guard inhibitOrdinary is OPEN
>   - prior session view session is IDLE
>   - dock facts startReady is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request facts correlation is A
>           - the value of requestLedger on entry is not A LAST
>       - All of the following conditions hold:
>         
>           - request facts correlation is B
>           - the value of requestLedger on entry is not B LAST.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> requestLedger is the value of requestLedger on entry, admission decision kind is START, admission decision correlation is request facts correlation, admission decision disposition is REJECTED, admission decision updateLedger is the value of requestLedger on entry, and request disposition is REJECTED.

##### `CASE_18_DEFER_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 DEFER REQUEST applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts requestValidity is true exactly when T is true
>   - request facts present is true exactly when T is true
>   - At least one of the following conditions holds:
>     
>       - coordination guard inhibitOrdinary is INHIBITED
>       - All of the following conditions hold:
>         
>           - coordination guard inhibitOrdinary is OPEN
>           - request facts kind is START
>           - prior session view session is not IDLE
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - request facts correlation is A
>                   - the value of requestLedger on entry is not A LAST
>               - All of the following conditions hold:
>                 
>                   - request facts correlation is B
>                   - the value of requestLedger on entry is not B LAST.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> requestLedger is the value of requestLedger on entry, admission decision kind is request facts kind, admission decision correlation is request facts correlation, admission decision disposition is DEFERRED, admission decision updateLedger is the value of requestLedger on entry, and request disposition is DEFERRED.

##### `CASE_19_ACCEPT_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 ACCEPT CANCEL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts requestValidity is true exactly when T is true
>   - request facts kind is CANCEL
>   - coordination guard inhibitOrdinary is OPEN
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request facts correlation is A
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT SHIP A
>               - prior session view session is TRANSFERRING A
>               - prior session view session is AWAIT WAREHOUSE A
>       - All of the following conditions hold:
>         
>           - request facts correlation is B
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT SHIP B
>               - prior session view session is TRANSFERRING B
>               - prior session view session is AWAIT WAREHOUSE B.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> requestLedger is the value of requestLedger on entry, admission decision kind is CANCEL, admission decision correlation is request facts correlation, admission decision disposition is CANCEL ACCEPTED, admission decision updateLedger is the value of requestLedger on entry, and request disposition is CANCEL ACCEPTED.

##### `CASE_20_REJECT_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 REJECT CANCEL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts requestValidity is true exactly when T is true
>   - request facts kind is CANCEL
>   - coordination guard inhibitOrdinary is OPEN
>   - At least one of the following conditions holds:
>     
>       - prior session view session is IDLE
>       - All of the following conditions hold:
>         
>           - request facts correlation is A
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT SHIP B
>               - prior session view session is TRANSFERRING B
>               - prior session view session is AWAIT WAREHOUSE B
>       - All of the following conditions hold:
>         
>           - request facts correlation is B
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT SHIP A
>               - prior session view session is TRANSFERRING A
>               - prior session view session is AWAIT WAREHOUSE A.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> requestLedger is the value of requestLedger on entry, admission decision kind is CANCEL, admission decision correlation is request facts correlation, admission decision disposition is REJECTED, admission decision updateLedger is the value of requestLedger on entry, and request disposition is REJECTED.

### Requirements for ResultComposition

#### Contract clauses evaluated in the initialization phase

##### `INIT_PUBLIC_RESULT` — Required behavior

> During contract evaluation for the initialization phase, ResultComposition shall set transfer result actionValue to HOLD, transfer result cause to NO ELIGIBLE ACTION, transfer result mode to HOLDING, transfer result correlation to NONE, transfer result requestDisposition to NO REQUEST, and transfer result outcomeValue to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_28_ATOMIC_COMPOSITION` — Required behavior

> During contract evaluation for the compute phase, ResultComposition shall produce a result for which transfer result actionValue is transfer decision actionValue, transfer result cause is transfer decision cause, transfer result correlation is transfer decision correlation, if request disposition is NO REQUEST, then transfer result requestDisposition is NO REQUEST, if request disposition is ACCEPTED, then transfer result requestDisposition is ACCEPTED, if request disposition is DUPLICATE, then transfer result requestDisposition is DUPLICATE, if request disposition is REJECTED, then transfer result requestDisposition is REJECTED, if request disposition is DEFERRED, then transfer result requestDisposition is DEFERRED, if request disposition is CANCEL ACCEPTED, then transfer result requestDisposition is CANCEL ACCEPTED, if transfer decision outcomeValue is NONE, then transfer result outcomeValue is NONE, if transfer decision outcomeValue is ACTIVE, then transfer result outcomeValue is ACTIVE, if transfer decision outcomeValue is COMPLETED, then transfer result outcomeValue is COMPLETED, if transfer decision outcomeValue is CANCELLED, then transfer result outcomeValue is CANCELLED, if transfer decision outcomeValue is RECOVERY REQUIRED, then transfer result outcomeValue is RECOVERY REQUIRED, if transfer decision cause is FAULT OR RECOVERY, then transfer result mode is FAULT, if transfer decision cause is not FAULT OR RECOVERY and transfer decision actionValue is HOLD, then transfer result mode is HOLDING, if transfer decision actionValue is BEGIN TRANSFER, transfer decision actionValue is CONTINUE TRANSFER, or transfer decision actionValue is CANCEL TRANSFER, then transfer result mode is COMMANDING SHIP, and if transfer decision actionValue is REQUEST WAREHOUSE VERIFY, then transfer result mode is VERIFYING WAREHOUSE.

### Requirements for ShipEvidenceLifecycle

#### Contract clauses evaluated in the initialization phase

##### `INIT_SHIP_EVIDENCE` — Required behavior

> During contract evaluation for the initialization phase, ShipEvidenceLifecycle shall set shipEvidenceState to CLEAR and prior ship evidence to CLEAR.

#### Contract clauses evaluated in the compute phase

##### `CASE_25_SHIP_EVIDENCE_TRANSITION` — Required behavior

> During contract evaluation for the compute phase, ShipEvidenceLifecycle shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - prior ship evidence is the value of shipEvidenceState on entry
>   - **If:**
>     
>     ship update is FREEZE
>     
>     **Then:**
>     
>     shipEvidenceState is the value of shipEvidenceState on entry
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - ship update is not FREEZE
>       - At least one of the following conditions holds:
>         
>           - admission decision disposition is CANCEL ACCEPTED
>           - admission decision disposition is ACCEPTED
>     
>     **Then:**
>     
>     shipEvidenceState is CLEAR
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - ship update is not FREEZE
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - ship update is ACKNOWLEDGE
>     
>     **Then:**
>     
>     shipEvidenceState is ACKNOWLEDGED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - ship update is not FREEZE
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - ship update is MARK MOVING
>     
>     **Then:**
>     
>     shipEvidenceState is MOVING
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - ship update is not FREEZE
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - ship update is MARK COMPLETE
>     
>     **Then:**
>     
>     shipEvidenceState is COMPLETE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - ship update is not FREEZE
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - ship update is CLEAR
>     
>     **Then:**
>     
>     shipEvidenceState is CLEAR
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - ship update is RETAIN
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>     
>     **Then:**
>     
>     shipEvidenceState is the value of shipEvidenceState on entry.

### Requirements for ShipProgressEligibility

#### Contract clauses evaluated in the initialization phase

##### `INIT_SHIP_PROPOSAL` — Required behavior

> During contract evaluation for the initialization phase, ShipProgressEligibility shall set ship proposal kind to NONE, ship proposal actionValue to HOLD, and ship proposal correlation to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_26_SHIP_PROPOSAL` — Required behavior

> During contract evaluation for the compute phase, ShipProgressEligibility shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT SHIP A
>               - prior session view session is AWAIT SHIP B
>           - At least one of the following conditions holds:
>             
>               - prior ship evidence is CLEAR
>               - prior ship evidence is ACKNOWLEDGED
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior session view session is TRANSFERRING A
>               - prior session view session is TRANSFERRING B
>           - At least one of the following conditions holds:
>             
>               - prior ship evidence is ACKNOWLEDGED
>               - prior ship evidence is MOVING
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - ship proposal kind is SHIP PROGRESS
>       - ship proposal actionValue is CONTINUE TRANSFER
>       - ship proposal correlation is prior session view correlation
>   - **If:**
>     
>     It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior session view session is AWAIT SHIP A
>               - prior session view session is AWAIT SHIP B
>           - At least one of the following conditions holds:
>             
>               - prior ship evidence is CLEAR
>               - prior ship evidence is ACKNOWLEDGED
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior session view session is TRANSFERRING A
>               - prior session view session is TRANSFERRING B
>           - At least one of the following conditions holds:
>             
>               - prior ship evidence is ACKNOWLEDGED
>               - prior ship evidence is MOVING
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - ship proposal kind is NONE
>       - ship proposal actionValue is HOLD
>       - ship proposal correlation is NONE.

### Requirements for ShipReportAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INIT_SHIP_FACTS` — Required behavior

> During contract evaluation for the initialization phase, ShipReportAcquisition shall set ship report facts reportClass to NO EVENT, ship report facts correlation to NONE, ship report facts usable to true exactly when T is true, and ship report facts shipValue to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_07_SHIP_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if ship report is NONE, ShipReportAcquisition shall set ship report facts reportClass to NO EVENT, ship report facts correlation to NONE, ship report facts usable to true exactly when T is true, and ship report facts shipValue to NONE.

##### `CASE_08_SHIP_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, if ship report is ACCEPTED A, ship report is ACCEPTED B, ship report is MOVING A, ship report is MOVING B, ship report is COMPLETE A, or ship report is COMPLETE B, ShipReportAcquisition shall produce a result for which ship report facts usable is true exactly when T is true, if ship report is ACCEPTED A, then ship report facts shipValue is ACCEPTED A, if ship report is ACCEPTED B, then ship report facts shipValue is ACCEPTED B, if ship report is MOVING A, then ship report facts shipValue is MOVING A, if ship report is MOVING B, then ship report facts shipValue is MOVING B, if ship report is COMPLETE A, then ship report facts shipValue is COMPLETE A, if ship report is COMPLETE B, then ship report facts shipValue is COMPLETE B, if ship report is ACCEPTED A or ship report is ACCEPTED B, then ship report facts reportClass is ACCEPTED, if ship report is MOVING A or ship report is MOVING B, then ship report facts reportClass is MOVING, if ship report is COMPLETE A or ship report is COMPLETE B, then ship report facts reportClass is COMPLETE, if ship report is ACCEPTED A, ship report is MOVING A, or ship report is COMPLETE A, then ship report facts correlation is A, and if ship report is ACCEPTED B, ship report is MOVING B, or ship report is COMPLETE B, then ship report facts correlation is B.

##### `CASE_09_SHIP_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if ship report is INVALID, ship report is FAILED A, or ship report is FAILED B, ShipReportAcquisition shall produce a result for which ship report facts usable is true exactly when F is true, if ship report is INVALID, then ship report facts shipValue is INVALID, if ship report is FAILED A, then ship report facts shipValue is FAILED A, if ship report is FAILED B, then ship report facts shipValue is FAILED B, if ship report is INVALID, then ship report facts reportClass is INVALID and ship report facts correlation is NONE, if ship report is FAILED A, then ship report facts reportClass is FAILED and ship report facts correlation is A, and if ship report is FAILED B, then ship report facts reportClass is FAILED and ship report facts correlation is B.

### Requirements for TransferActionArbitration

#### Contract clauses evaluated in the initialization phase

##### `INIT_ARBITRATION` — Required behavior

> During contract evaluation for the initialization phase, TransferActionArbitration shall set transfer decision actionValue to HOLD, transfer decision cause to NO ELIGIBLE ACTION, transfer decision correlation to NONE, and transfer decision outcomeValue to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_27_STRICT_PRIORITY` — Required behavior

> During contract evaluation for the compute phase, TransferActionArbitration shall produce a result for which if priority directive kind is FAULT OR RECOVERY, then transfer decision actionValue is HOLD, transfer decision cause is FAULT OR RECOVERY, transfer decision correlation is priority directive correlation, and transfer decision outcomeValue is RECOVERY REQUIRED, if priority directive kind is COMPLETION, then transfer decision actionValue is HOLD, transfer decision cause is WAREHOUSE CONFIRMATION, transfer decision correlation is priority directive correlation, and transfer decision outcomeValue is COMPLETED, if priority directive kind is ORDINARY and request proposal kind is CANCEL, then transfer decision actionValue is CANCEL TRANSFER, transfer decision cause is CANCEL REQUEST, transfer decision correlation is request proposal correlation, and transfer decision outcomeValue is CANCELLED, if priority directive kind is ORDINARY, request proposal kind is not CANCEL, and warehouse proposal kind is WAREHOUSE VERIFY, then transfer decision actionValue is REQUEST WAREHOUSE VERIFY, transfer decision cause is WAREHOUSE CONFIRMATION, transfer decision correlation is warehouse proposal correlation, and transfer decision outcomeValue is ACTIVE, if priority directive kind is ORDINARY, request proposal kind is not CANCEL, warehouse proposal kind is not WAREHOUSE VERIFY, and ship proposal kind is SHIP PROGRESS, then transfer decision actionValue is CONTINUE TRANSFER, transfer decision cause is SHIP PROGRESS, transfer decision correlation is ship proposal correlation, and transfer decision outcomeValue is ACTIVE, if priority directive kind is ORDINARY, request proposal kind is not CANCEL, warehouse proposal kind is not WAREHOUSE VERIFY, ship proposal kind is not SHIP PROGRESS, and request proposal kind is START, then transfer decision actionValue is BEGIN TRANSFER, transfer decision cause is NEW TRANSFER, transfer decision correlation is request proposal correlation, and transfer decision outcomeValue is ACTIVE, and if priority directive kind is ORDINARY, request proposal kind is not CANCEL, warehouse proposal kind is not WAREHOUSE VERIFY, ship proposal kind is not SHIP PROGRESS, and request proposal kind is not START, then transfer decision actionValue is HOLD, transfer decision cause is NO ELIGIBLE ACTION, transfer decision correlation is NONE, and transfer decision outcomeValue is NONE.

### Requirements for TransferSession

#### Contract clauses evaluated in the initialization phase

##### `INIT_SESSION` — Required behavior

> During contract evaluation for the initialization phase, TransferSession shall set sessionState to IDLE, prior session view session to IDLE, and prior session view correlation to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_25_SESSION_TRANSITION` — Required behavior

> During contract evaluation for the compute phase, TransferSession shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - prior session view session is the value of sessionState on entry
>   - **If:**
>     
>     the value of sessionState on entry is IDLE
>     
>     **Then:**
>     
>     prior session view correlation is NONE
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is AWAIT SHIP A
>       - the value of sessionState on entry is TRANSFERRING A
>       - the value of sessionState on entry is AWAIT WAREHOUSE A
>     
>     **Then:**
>     
>     prior session view correlation is A
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is AWAIT SHIP B
>       - the value of sessionState on entry is TRANSFERRING B
>       - the value of sessionState on entry is AWAIT WAREHOUSE B
>     
>     **Then:**
>     
>     prior session view correlation is B
>   - **If:**
>     
>     coordination frame inhibitOrdinary is INHIBITED
>     
>     **Then:**
>     
>     sessionState is the value of sessionState on entry
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is CANCEL ACCEPTED
>     
>     **Then:**
>     
>     sessionState is IDLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is ACCEPTED
>       - admission decision correlation is A
>     
>     **Then:**
>     
>     sessionState is AWAIT SHIP A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is ACCEPTED
>       - admission decision correlation is B
>     
>     **Then:**
>     
>     sessionState is AWAIT SHIP B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - At least one of the following conditions holds:
>         
>           - coordination frame progress is SHIP ACCEPTED
>           - coordination frame progress is SHIP MOVING
>       - coordination frame correlation is A
>     
>     **Then:**
>     
>     sessionState is TRANSFERRING A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - At least one of the following conditions holds:
>         
>           - coordination frame progress is SHIP ACCEPTED
>           - coordination frame progress is SHIP MOVING
>       - coordination frame correlation is B
>     
>     **Then:**
>     
>     sessionState is TRANSFERRING B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - coordination frame progress is SHIP COMPLETE
>       - coordination frame correlation is A
>     
>     **Then:**
>     
>     sessionState is AWAIT WAREHOUSE A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - coordination frame progress is SHIP COMPLETE
>       - coordination frame correlation is B
>     
>     **Then:**
>     
>     sessionState is AWAIT WAREHOUSE B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - coordination frame progress is WAREHOUSE STORED
>     
>     **Then:**
>     
>     sessionState is IDLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - coordination frame inhibitOrdinary is OPEN
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - coordination frame progress is not SHIP ACCEPTED
>       - coordination frame progress is not SHIP MOVING
>       - coordination frame progress is not SHIP COMPLETE
>       - coordination frame progress is not WAREHOUSE STORED
>     
>     **Then:**
>     
>     sessionState is the value of sessionState on entry.

### Requirements for WarehouseEvidenceLifecycle

#### Contract clauses evaluated in the initialization phase

##### `INIT_WAREHOUSE_EVIDENCE` — Required behavior

> During contract evaluation for the initialization phase, WarehouseEvidenceLifecycle shall set warehouseEvidenceState to CLEAR and prior warehouse evidence to CLEAR.

#### Contract clauses evaluated in the compute phase

##### `CASE_25_WAREHOUSE_EVIDENCE_TRANSITION` — Required behavior

> During contract evaluation for the compute phase, WarehouseEvidenceLifecycle shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - prior warehouse evidence is the value of warehouseEvidenceState on entry
>   - **If:**
>     
>     warehouse update is FREEZE
>     
>     **Then:**
>     
>     warehouseEvidenceState is the value of warehouseEvidenceState on entry
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - warehouse update is not FREEZE
>       - At least one of the following conditions holds:
>         
>           - admission decision disposition is CANCEL ACCEPTED
>           - admission decision disposition is ACCEPTED
>     
>     **Then:**
>     
>     warehouseEvidenceState is CLEAR
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - warehouse update is not FREEZE
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - warehouse update is MARK PENDING
>     
>     **Then:**
>     
>     warehouseEvidenceState is PENDING
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - warehouse update is not FREEZE
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>       - warehouse update is CLEAR
>     
>     **Then:**
>     
>     warehouseEvidenceState is CLEAR
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - warehouse update is RETAIN
>       - admission decision disposition is not CANCEL ACCEPTED
>       - admission decision disposition is not ACCEPTED
>     
>     **Then:**
>     
>     warehouseEvidenceState is the value of warehouseEvidenceState on entry.

### Requirements for WarehouseReportAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INIT_WAREHOUSE_FACTS` — Required behavior

> During contract evaluation for the initialization phase, WarehouseReportAcquisition shall set warehouse report facts reportClass to NO EVENT, warehouse report facts correlation to NONE, warehouse report facts usable to true exactly when T is true, and warehouse report facts warehouseValue to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_10_WAREHOUSE_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if warehouse report is NONE, WarehouseReportAcquisition shall set warehouse report facts reportClass to NO EVENT, warehouse report facts correlation to NONE, warehouse report facts usable to true exactly when T is true, and warehouse report facts warehouseValue to NONE.

##### `CASE_11_WAREHOUSE_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, if warehouse report is PENDING A, warehouse report is PENDING B, warehouse report is STORED A, or warehouse report is STORED B, WarehouseReportAcquisition shall produce a result for which warehouse report facts usable is true exactly when T is true, if warehouse report is PENDING A, then warehouse report facts warehouseValue is PENDING A, if warehouse report is PENDING B, then warehouse report facts warehouseValue is PENDING B, if warehouse report is STORED A, then warehouse report facts warehouseValue is STORED A, if warehouse report is STORED B, then warehouse report facts warehouseValue is STORED B, if warehouse report is PENDING A or warehouse report is PENDING B, then warehouse report facts reportClass is PENDING, if warehouse report is STORED A or warehouse report is STORED B, then warehouse report facts reportClass is STORED, if warehouse report is PENDING A or warehouse report is STORED A, then warehouse report facts correlation is A, and if warehouse report is PENDING B or warehouse report is STORED B, then warehouse report facts correlation is B.

##### `CASE_12_WAREHOUSE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if warehouse report is INVALID, warehouse report is REJECTED A, or warehouse report is REJECTED B, WarehouseReportAcquisition shall produce a result for which warehouse report facts usable is true exactly when F is true, if warehouse report is INVALID, then warehouse report facts warehouseValue is INVALID, if warehouse report is REJECTED A, then warehouse report facts warehouseValue is REJECTED A, if warehouse report is REJECTED B, then warehouse report facts warehouseValue is REJECTED B, if warehouse report is INVALID, then warehouse report facts reportClass is INVALID and warehouse report facts correlation is NONE, if warehouse report is REJECTED A, then warehouse report facts reportClass is REJECTED and warehouse report facts correlation is A, and if warehouse report is REJECTED B, then warehouse report facts reportClass is REJECTED and warehouse report facts correlation is B.

### Requirements for WarehouseVerificationEligibility

#### Contract clauses evaluated in the initialization phase

##### `INIT_WAREHOUSE_PROPOSAL` — Required behavior

> During contract evaluation for the initialization phase, WarehouseVerificationEligibility shall set warehouse proposal kind to NONE, warehouse proposal actionValue to HOLD, and warehouse proposal correlation to NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_26_WAREHOUSE_PROPOSAL` — Required behavior

> During contract evaluation for the compute phase, WarehouseVerificationEligibility shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - prior session view session is AWAIT WAREHOUSE A
>           - prior session view session is AWAIT WAREHOUSE B
>       - prior ship evidence is COMPLETE
>       - At least one of the following conditions holds:
>         
>           - prior warehouse evidence is CLEAR
>           - prior warehouse evidence is PENDING
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - warehouse proposal kind is WAREHOUSE VERIFY
>       - warehouse proposal actionValue is REQUEST WAREHOUSE VERIFY
>       - warehouse proposal correlation is prior session view correlation
>   - **If:**
>     
>     It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - prior session view session is AWAIT WAREHOUSE A
>           - prior session view session is AWAIT WAREHOUSE B
>       - prior ship evidence is COMPLETE
>       - At least one of the following conditions holds:
>         
>           - prior warehouse evidence is CLEAR
>           - prior warehouse evidence is PENDING
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - warehouse proposal kind is NONE
>       - warehouse proposal actionValue is HOLD
>       - warehouse proposal correlation is NONE.
