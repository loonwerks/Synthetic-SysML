# Factory Material Continuity Coordinator

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A Manufacturer needs a bounded
coordinator that keeps one current production-material demand coherent with aggregate
Storage evidence and one Supplier-order lifecycle, so that material release and
replenishment requests do not proceed through invalid or failed lifecycle evidence.

PURPOSE-01: [Pilot abstraction] For each evaluation, the system shall classify a fresh
material demand, inventory evidence, and a material-lifecycle event; update demand,
supplier-order, and recovery state; derive independent urgent-release, routine-release,
and replenishment eligibility; select at most one controlled action; and publish one
atomic result.

GOAL-01: [Pilot abstraction] The system shall deterministically cover every admitted
boundary snapshot and every prior-state tuple.

GOAL-02: [Pilot abstraction] A fault or incomplete recovery shall dominate every
ordinary action; otherwise an urgent material release shall dominate replenishment, and
replenishment shall dominate a routine material release when both are eligible.

GOAL-03: [Pilot abstraction] A reported failure or lifecycle-inconsistent success shall
propagate in the same evaluation through event qualification, recovery latching, state
inhibition, eligibility, action selection, and the public result.

GOAL-04: [Pilot abstraction] Recovery shall require a fresh `RESET` followed in a later
evaluation by a distinct fresh `VERIFY_OK`; neither event alone shall release a latched
fault.

GOAL-05: [Selected architecture] The selected action, cause, mode, three current
lifecycle states, and current-demand disposition shall be composed by one owner into one
indivisible flat `MaterialCoordinationResult`.

### Operational context and finite system boundary

CTX-MAN-01: [Selected boundary] The modeled system is a logical material-continuity
supervisor within the Manufacturer. Supplier transaction execution, Storage measurement,
production scheduling, production material handling, dispatch, customer communication,
and physical production steps remain outside it.

CTX-SCHED-01: [Seed-grounded capability with pilot responsibility] The external
Production Scheduler supplies at most one fresh `DemandSignal` per evaluation and
receives demand disposition through `CTX-PUB-01`; it is responsible for retrying a valid
demand reported as deferred.

CTX-STOR-01: [Seed-grounded capability with pilot responsibility] The external Storage
observer supplies one aggregate `InventoryBand`; it is responsible for the declared
validity status and band meaning, but not for any quantity, unit, reservation, or
conservation claim.

CTX-SUP-01: [Seed-grounded entity with pilot responsibility] The external
Supplier-facing channel supplies `supplierAvailability`, consumes
`ISSUE_MATERIAL_ORDER`, and reports fresh order or receipt events. Availability means
only willingness to accept the command request.

CTX-PROD-01: [Seed-grounded capability with pilot responsibility] The external
Production material handler supplies `productionAvailability`, consumes a
material-release action, and later reports a fresh handoff result. Production execution
and the named physical line steps are outside the boundary.

CTX-EVENT-01: [Pilot abstraction] The material-event channel presents either no event or
exactly one fresh event in an evaluation and is responsible for correlating that event
to this bounded coordinator's sole active demand or supplier order.

CTX-REC-01: [Pilot abstraction] A Manufacturer recovery authority supplies fresh
recovery events after external diagnosis and is responsible for separating `RESET` from
a later `VERIFY_OK`.

CTX-PUB-01: [Selected boundary] A Manufacturer material-control integration recipient
consumes one `MaterialCoordinationResult` and is responsible for conveying its demand
disposition to `CTX-SCHED-01`, material-order action to `CTX-SUP-01`, and release action
to `CTX-PROD-01` without changing field meaning. This system controls issuance of the
logical request, not its external acceptance or physical completion.

MON-DEM-01: [Pilot abstraction] Root input `demandSignal` has finite type
`DemandSignal={NONE,INVALID,A_ROUTINE,A_URGENT,B_ROUTINE,B_URGENT}` and comes from
`CTX-SCHED-01`. `A` and `B` are bounded correlation classes only, not source-defined
material identities.

MON-INV-01: [Pilot abstraction] Root input `inventoryBand` has finite type
`InventoryBand={INVALID,EMPTY,LOW,READY}` and comes from `CTX-STOR-01`. `LOW` means
material is available for one modeled handoff while replenishment is desired; `READY`
means material is available without that reserve concern.

MON-SUP-01: [Pilot abstraction] Root input `supplierAvailability` has finite type
`Availability={INVALID,UNAVAILABLE,AVAILABLE}` and comes from `CTX-SUP-01`.

MON-PROD-01: [Pilot abstraction] Root input `productionAvailability` has finite type
`Availability` and comes from `CTX-PROD-01`; `AVAILABLE` means only that a
material-release request can currently be accepted, and its qualification belongs to
`PART-05`.

MON-EVT-01: [Pilot abstraction] Root input `materialEvent` has finite type
`MaterialEvent={NONE,ORDER_ACCEPTED,RECEIPT_OK,HANDOFF_OK,FAILED}` and comes from
`CTX-EVENT-01`; every non-`NONE` value is a fresh single-evaluation event.

MON-REC-01: [Pilot abstraction] Root input `recoveryEvent` has finite type
`RecoveryEvent={NONE,RESET,VERIFY_OK}` and comes from `CTX-REC-01`; every non-`NONE`
value is a fresh single-evaluation event.

CTRL-RES-01: [Selected architecture] The sole root output is the flat record
`MaterialCoordinationResult=(action,cause,mode,demandState,supplyState,recoveryState,demandDisposition)`,
delivered to `CTX-PUB-01`.

ASM-FRESH-01: [Pilot abstraction] `CTX-SCHED-01`, `CTX-EVENT-01`, and `CTX-REC-01` are
responsible for freshness; replayed demands, material events, resets, or verifications
are outside the admitted environment. Rationale: retained-state evidence otherwise could
advance twice.

ASM-CAP-01: [Pilot abstraction] The coordinator retains at most one production-material
demand and at most one acknowledged Supplier order. `CTX-SCHED-01` shall retry a
deferred valid demand. Rationale: these are finite analysis bounds, not factory capacity
claims.

ASM-LEVEL-01: [Pilot abstraction] Controlled actions are desired logical levels, not
counted transaction pulses; `CTX-SUP-01` and `CTX-PROD-01` shall not interpret a
repeated identical output as a second correlated transaction while the first response
remains outstanding. Rationale: issuance acknowledgement is externally reported on a
later evaluation.

ASM-STOCK-01: [Pilot abstraction] Inventory is independently re-observed on every
evaluation. `RECEIPT_OK` does not itself change `inventoryBand`, and `HANDOFF_OK` does
not decrement it. Rationale: the seed supplies no conservation or quantity semantics.

ASM-STEP-01: [Pilot abstraction] One evaluation is an ordered logical reaction with no
physical duration: prior states qualify the fresh event; event qualification determines
next recovery and lifecycle states; those results gate proposals; arbitration selects;
composition publishes.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, demand is `IDLE`, supply
is `CLEAR`, recovery is `HEALTHY`, and the public result is
`(HOLD,NO_ELIGIBLE_WORK,HOLDING,IDLE,CLEAR,HEALTHY,NO_REQUEST)`.

### Risks, faults, and mitigations

RISK-01: [Pilot risk] Accepting a failed or phase-inconsistent material event as
progress could clear a demand or supplier order and authorize unrelated work from
untrustworthy state; `FAULT-01` requires immediate fault propagation and inhibition.

RISK-02: [Pilot risk] Treating `RESET` as recovery completion could resume material
actions without independent verification; `FAULT-02` requires a distinct two-event
recovery history.

RISK-03: [Pilot risk] Inconsistent resolution at `LOW` inventory could either starve an
urgent production demand or consume reserve for routine work while replenishment is
possible; `BEH-06` fixes a single priority relation.

## Supporting contract definitions

### State `Factory_Material_Continuity_Coordinator::DemandRegistry::demandPhaseMemory`

State `demandPhaseMemory` has type `Factory_Material_Continuity_Coordinator::DemandState`.

### State `Factory_Material_Continuity_Coordinator::RecoverySupervisor::recoveryPhaseMemory`

State `recoveryPhaseMemory` has type `Factory_Material_Continuity_Coordinator::RecoveryState`.

### State `Factory_Material_Continuity_Coordinator::SupplyLifecycle::supplyPhaseMemory`

State `supplyPhaseMemory` has type `Factory_Material_Continuity_Coordinator::SupplyState`.

## Detailed behavioral requirements

### Requirements for DemandAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NO_DEMAND` — Required behavior

> During contract evaluation for the initialization phase, DemandAcquisition shall set demand boundary facts present to true exactly when F is true and demand boundary facts demandValue to NONE.

#### Contract clauses evaluated in the compute phase

##### `DEMAND_PRESENCE_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, DemandAcquisition shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     demand boundary facts present is true
>     
>     **Second condition:**
>     
>     demand signal is not NONE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - demand signal is NONE
>           - demand boundary facts demandValue is NONE
>       - All of the following conditions hold:
>         
>           - demand signal is INVALID
>           - demand boundary facts demandValue is INVALID
>       - All of the following conditions hold:
>         
>           - demand signal is ARoutine
>           - demand boundary facts demandValue is ARoutine
>       - All of the following conditions hold:
>         
>           - demand signal is AUrgent
>           - demand boundary facts demandValue is AUrgent
>       - All of the following conditions hold:
>         
>           - demand signal is BRoutine
>           - demand boundary facts demandValue is BRoutine
>       - All of the following conditions hold:
>         
>           - demand signal is BUrgent
>           - demand boundary facts demandValue is BUrgent.

### Requirements for DemandQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DEMAND_FACTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, DemandQualification shall set demand facts demandValue to NONE, demand facts present to true exactly when F is true, demand facts valid to true exactly when F is true, demand facts urgent to true exactly when F is true, and demand facts materialClass to NONE.

#### Contract clauses evaluated in the compute phase

##### `QUALIFIED_DEMAND_FACTS` — Required behavior

> During contract evaluation for the compute phase, DemandQualification shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - demand facts demandValue is demand boundary facts demandValue
>   - demand facts present is true exactly when demand boundary facts present is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     demand facts valid is true
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - demand boundary facts demandValue is ARoutine
>       - demand boundary facts demandValue is AUrgent
>       - demand boundary facts demandValue is BRoutine
>       - demand boundary facts demandValue is BUrgent
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     demand facts urgent is true
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - demand boundary facts demandValue is AUrgent
>       - demand boundary facts demandValue is BUrgent
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - demand boundary facts demandValue is ARoutine
>               - demand boundary facts demandValue is AUrgent
>           - demand facts materialClass is A
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - demand boundary facts demandValue is BRoutine
>               - demand boundary facts demandValue is BUrgent
>           - demand facts materialClass is B
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - demand boundary facts demandValue is NONE
>               - demand boundary facts demandValue is INVALID
>           - demand facts materialClass is NONE.

### Requirements for DemandRegistry

#### Contract clauses evaluated in the initialization phase

May modify: demandPhaseMemory

##### `INITIAL_DEMAND_STATE` — Required behavior

> During contract evaluation for the initialization phase, DemandRegistry shall set demandPhaseMemory to IDLE, prior demand state to IDLE, current state to urgent to IDLE, current state to routine to IDLE, demand transition demandPhase to IDLE, demand transition demandUpdate to NoChange, and demand transition demandDisposition to NoRequest.

#### Contract clauses evaluated in the compute phase

May modify: demandPhaseMemory

##### `DEMAND_PRIOR_AND_CURRENT_VIEWS` — Required behavior

> During contract evaluation for the compute phase, DemandRegistry shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - prior demand state is the value of demandPhaseMemory on entry
>   - current state to urgent is current state to routine
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - demandPhaseMemory is IDLE
>           - current state to urgent is IDLE
>           - demand transition demandPhase is IDLE
>       - All of the following conditions hold:
>         
>           - demandPhaseMemory is ARoutineOpen
>           - current state to urgent is ARoutineOpen
>           - demand transition demandPhase is ARoutineOpen
>       - All of the following conditions hold:
>         
>           - demandPhaseMemory is AUrgentOpen
>           - current state to urgent is AUrgentOpen
>           - demand transition demandPhase is AUrgentOpen
>       - All of the following conditions hold:
>         
>           - demandPhaseMemory is BRoutineOpen
>           - current state to urgent is BRoutineOpen
>           - demand transition demandPhase is BRoutineOpen
>       - All of the following conditions hold:
>         
>           - demandPhaseMemory is BUrgentOpen
>           - current state to urgent is BUrgentOpen
>           - demand transition demandPhase is BUrgentOpen.

##### `CURRENT_DEMAND_DISPOSITION` — Required behavior

> During contract evaluation for the compute phase, DemandRegistry shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - demand facts demandValue is NONE
>       - demand transition demandDisposition is NoRequest
>   - All of the following conditions hold:
>     
>       - demand facts demandValue is INVALID
>       - demand transition demandDisposition is REJECTED
>   - All of the following conditions hold:
>     
>       - demand facts valid is true
>       - demand transition demandUpdate is ACCEPTED
>       - demand transition demandDisposition is ACCEPTED
>   - All of the following conditions hold:
>     
>       - demand facts valid is true
>       - demand transition demandUpdate is DUPLICATE
>       - demand transition demandDisposition is RetainedDuplicate
>   - All of the following conditions hold:
>     
>       - demand facts valid is true
>       - demand transition demandUpdate is not ACCEPTED
>       - demand transition demandUpdate is not DUPLICATE
>       - demand transition demandDisposition is DEFERRED.

##### `CASE_13_CLOSED_GATE_FREEZE` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is CLOSED, DemandRegistry shall preserve the value of demandPhaseMemory on entry and set demand transition demandUpdate to NoChange.

##### `CASE_14_HANDOFF_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN and qualified event is HandoffConfirmed, DemandRegistry shall set demandPhaseMemory to IDLE and demand transition demandUpdate to CLEARED.

##### `CASE_15_ACCEPT_IDLE_DEMAND` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 ACCEPT IDLE DEMAND applies under all of the following conditions:
>
> recovery gate is OPEN, qualified event is not HandoffConfirmed, the value of demandPhaseMemory on entry is IDLE, and demand facts valid is true.

> When all applicability conditions are met, DemandRegistry shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - demand transition demandUpdate is ACCEPTED
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - demand facts demandValue is ARoutine
>           - demandPhaseMemory is ARoutineOpen
>       - All of the following conditions hold:
>         
>           - demand facts demandValue is AUrgent
>           - demandPhaseMemory is AUrgentOpen
>       - All of the following conditions hold:
>         
>           - demand facts demandValue is BRoutine
>           - demandPhaseMemory is BRoutineOpen
>       - All of the following conditions hold:
>         
>           - demand facts demandValue is BUrgent
>           - demandPhaseMemory is BUrgentOpen.

##### `CASE_16_RETAIN_OR_CLASSIFY_BUSY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 16 RETAIN OR CLASSIFY BUSY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recovery gate is OPEN
>   - qualified event is not HandoffConfirmed
>   - At least one of the following conditions holds:
>     
>       - the value of demandPhaseMemory on entry is not IDLE
>       - demand facts valid is true exactly when F is true.

> When all applicability conditions are met, DemandRegistry shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - demandPhaseMemory is the value of demandPhaseMemory on entry
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - demand facts demandValue is NONE
>               - demand facts demandValue is INVALID
>           - demand transition demandUpdate is NoChange
>       - All of the following conditions hold:
>         
>           - demand facts valid is true
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - demand facts demandValue is ARoutine
>                   - the value of demandPhaseMemory on entry is ARoutineOpen
>               - All of the following conditions hold:
>                 
>                   - demand facts demandValue is AUrgent
>                   - the value of demandPhaseMemory on entry is AUrgentOpen
>               - All of the following conditions hold:
>                 
>                   - demand facts demandValue is BRoutine
>                   - the value of demandPhaseMemory on entry is BRoutineOpen
>               - All of the following conditions hold:
>                 
>                   - demand facts demandValue is BUrgent
>                   - the value of demandPhaseMemory on entry is BUrgentOpen
>           - demand transition demandUpdate is DUPLICATE
>       - All of the following conditions hold:
>         
>           - demand facts valid is true
>           - It is not the case that:
>             
>             At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - demand facts demandValue is ARoutine
>                   - the value of demandPhaseMemory on entry is ARoutineOpen
>               - All of the following conditions hold:
>                 
>                   - demand facts demandValue is AUrgent
>                   - the value of demandPhaseMemory on entry is AUrgentOpen
>               - All of the following conditions hold:
>                 
>                   - demand facts demandValue is BRoutine
>                   - the value of demandPhaseMemory on entry is BRoutineOpen
>               - All of the following conditions hold:
>                 
>                   - demand facts demandValue is BUrgent
>                   - the value of demandPhaseMemory on entry is BUrgentOpen
>           - demand transition demandUpdate is BUSY.

### Requirements for EventAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NO_EVENT` — Required behavior

> During contract evaluation for the initialization phase, EventAcquisition shall set event boundary facts materialEvent to NONE and event boundary facts eventClass to NoEvent.

#### Contract clauses evaluated in the compute phase

##### `EVENT_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, EventAcquisition shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - material event is NONE
>       - event boundary facts materialEvent is NONE
>       - event boundary facts eventClass is NoEvent
>   - All of the following conditions hold:
>     
>       - material event is FAILED
>       - event boundary facts materialEvent is FAILED
>       - event boundary facts eventClass is FAILURE
>   - All of the following conditions hold:
>     
>       - material event is OrderAccepted
>       - event boundary facts materialEvent is OrderAccepted
>       - event boundary facts eventClass is SUCCESS
>   - All of the following conditions hold:
>     
>       - material event is ReceiptOk
>       - event boundary facts materialEvent is ReceiptOk
>       - event boundary facts eventClass is SUCCESS
>   - All of the following conditions hold:
>     
>       - material event is HandoffOk
>       - event boundary facts materialEvent is HandoffOk
>       - event boundary facts eventClass is SUCCESS.

### Requirements for EventCoherence

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_EVENT_COHERENCE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, EventCoherence shall set qualified event to demand to NoProgress, qualified event to supply to NoProgress, and fault trigger to INACTIVE.

#### Contract clauses evaluated in the compute phase

##### `IDENTICAL_QUALIFIED_EVENT_DELIVERY` — Required behavior

> During contract evaluation for the compute phase, EventCoherence shall set qualified event to demand to qualified event to supply.

##### `CASE_01_NO_EVENT` — Conditional behavior

> During contract evaluation for the compute phase, if event boundary facts eventClass is NoEvent and event boundary facts materialEvent is NONE, EventCoherence shall set qualified event to demand to NoProgress and fault trigger to INACTIVE.

##### `CASE_02_REPORTED_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, if event boundary facts eventClass is FAILURE and event boundary facts materialEvent is FAILED, EventCoherence shall set qualified event to demand to FAULT and fault trigger to ACTIVE.

##### `CASE_03_ORDER_REGISTERED` — Conditional behavior

> During contract evaluation for the compute phase, if event boundary facts eventClass is SUCCESS, event boundary facts materialEvent is OrderAccepted, and prior supply state is CLEAR, EventCoherence shall set qualified event to demand to OrderRegistered and fault trigger to INACTIVE.

##### `CASE_04_RECEIPT_CONFIRMED` — Conditional behavior

> During contract evaluation for the compute phase, if event boundary facts eventClass is SUCCESS, event boundary facts materialEvent is ReceiptOk, and prior supply state is ORDERED, EventCoherence shall set qualified event to demand to ReceiptConfirmed and fault trigger to INACTIVE.

##### `CASE_05_HANDOFF_CONFIRMED` — Conditional behavior

> During contract evaluation for the compute phase, if event boundary facts eventClass is SUCCESS, event boundary facts materialEvent is HandoffOk, and prior demand state is not IDLE, EventCoherence shall set qualified event to demand to HandoffConfirmed and fault trigger to INACTIVE.

##### `CASE_06_INCOHERENT_EVENT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 INCOHERENT EVENT applies under all of the following conditions:
>
> It is not the case that:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - event boundary facts eventClass is NoEvent
>       - event boundary facts materialEvent is NONE
>   - All of the following conditions hold:
>     
>       - event boundary facts eventClass is FAILURE
>       - event boundary facts materialEvent is FAILED
>   - All of the following conditions hold:
>     
>       - event boundary facts eventClass is SUCCESS
>       - event boundary facts materialEvent is OrderAccepted
>       - prior supply state is CLEAR
>   - All of the following conditions hold:
>     
>       - event boundary facts eventClass is SUCCESS
>       - event boundary facts materialEvent is ReceiptOk
>       - prior supply state is ORDERED
>   - All of the following conditions hold:
>     
>       - event boundary facts eventClass is SUCCESS
>       - event boundary facts materialEvent is HandoffOk
>       - prior demand state is not IDLE.

> When all applicability conditions are met, EventCoherence shall produce a result for which all of the following conditions hold:
>
> qualified event to demand is FAULT and fault trigger is ACTIVE.

### Requirements for InventoryAcquisition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_INVENTORY_UNUSABLE` — Required behavior

> During contract evaluation for the initialization phase, InventoryAcquisition shall set inventory boundary facts band to INVALID and inventory boundary facts usable to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `INVENTORY_USABILITY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, InventoryAcquisition shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - inventory band is INVALID
>           - inventory boundary facts band is INVALID
>       - All of the following conditions hold:
>         
>           - inventory band is EMPTY
>           - inventory boundary facts band is EMPTY
>       - All of the following conditions hold:
>         
>           - inventory band is LOW
>           - inventory boundary facts band is LOW
>       - All of the following conditions hold:
>         
>           - inventory band is READY
>           - inventory boundary facts band is READY
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     inventory boundary facts usable is true
>     
>     **Second condition:**
>     
>     inventory band is not INVALID.

### Requirements for MaterialActionArbitration

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HOLD_DECISION` — Required behavior

> During contract evaluation for the initialization phase, MaterialActionArbitration shall set decision actionValue to HOLD and decision cause to NoEligibleWork.

#### Contract clauses evaluated in the compute phase

##### `CASE_25_EMERGENCY_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is ACTIVE, MaterialActionArbitration shall set decision actionValue to HOLD and decision cause to FaultOrRecovery.

##### `CASE_26_URGENT_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE and urgent proposal is PROPOSED, MaterialActionArbitration shall set decision actionValue to ReleaseUrgentMaterial and decision cause to UrgentDemand.

##### `CASE_27_REPLENISHMENT_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE, urgent proposal is NotProposed, and replenishment proposal is PROPOSED, MaterialActionArbitration shall set decision actionValue to IssueMaterialOrder and decision cause to ReserveReplenishment.

##### `CASE_28_ROUTINE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE, urgent proposal is NotProposed, replenishment proposal is NotProposed, and routine proposal is PROPOSED, MaterialActionArbitration shall set decision actionValue to ReleaseRoutineMaterial and decision cause to RoutineDemand.

##### `CASE_29_NO_ELIGIBLE_WORK` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state is INACTIVE, urgent proposal is NotProposed, replenishment proposal is NotProposed, and routine proposal is NotProposed, MaterialActionArbitration shall set decision actionValue to HOLD and decision cause to NoEligibleWork.

### Requirements for MaterialReadinessAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_READINESS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, MaterialReadinessAssessment shall set readiness to urgent band to INVALID, readiness to urgent usable to true exactly when F is true, readiness to urgent materialAvailable to true exactly when F is true, readiness to urgent reserveLow to true exactly when F is true, readiness to urgent replenishmentNeeded to true exactly when F is true, readiness to urgent productionEvidenceUsable to true exactly when F is true, readiness to urgent productionAccepting to true exactly when F is true, readiness to routine band to readiness to urgent band, readiness to routine usable to true exactly when readiness to urgent usable is true, readiness to routine materialAvailable to true exactly when readiness to urgent materialAvailable is true, readiness to routine reserveLow to true exactly when readiness to urgent reserveLow is true, readiness to routine replenishmentNeeded to true exactly when readiness to urgent replenishmentNeeded is true, readiness to routine productionEvidenceUsable to true exactly when readiness to urgent productionEvidenceUsable is true, readiness to routine productionAccepting to true exactly when readiness to urgent productionAccepting is true, readiness to replenishment band to readiness to urgent band, readiness to replenishment usable to true exactly when readiness to urgent usable is true, readiness to replenishment materialAvailable to true exactly when readiness to urgent materialAvailable is true, readiness to replenishment reserveLow to true exactly when readiness to urgent reserveLow is true, readiness to replenishment replenishmentNeeded to true exactly when readiness to urgent replenishmentNeeded is true, readiness to replenishment productionEvidenceUsable to true exactly when readiness to urgent productionEvidenceUsable is true, and readiness to replenishment productionAccepting to true exactly when readiness to urgent productionAccepting is true.

#### Contract clauses evaluated in the compute phase

##### `MATERIAL_READINESS_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, MaterialReadinessAssessment shall set readiness to urgent band to inventory boundary facts band, readiness to urgent usable to true exactly when inventory boundary facts usable is true, readiness to urgent materialAvailable to true exactly when All of the following conditions hold:
>
>   - inventory boundary facts usable is true
>   - At least one of the following conditions holds:
>     
>       - inventory boundary facts band is LOW
>       - inventory boundary facts band is READY, readiness to urgent reserveLow to true exactly when inventory boundary facts usable is true and inventory boundary facts band is LOW, readiness to urgent replenishmentNeeded to true exactly when All of the following conditions hold:
>
>   - inventory boundary facts usable is true
>   - At least one of the following conditions holds:
>     
>       - inventory boundary facts band is EMPTY
>       - inventory boundary facts band is LOW, readiness to urgent productionEvidenceUsable to true exactly when production availability is not INVALID, readiness to urgent productionAccepting to true exactly when production availability is AVAILABLE, readiness to routine band to readiness to urgent band, readiness to routine usable to true exactly when readiness to urgent usable is true, readiness to routine materialAvailable to true exactly when readiness to urgent materialAvailable is true, readiness to routine reserveLow to true exactly when readiness to urgent reserveLow is true, readiness to routine replenishmentNeeded to true exactly when readiness to urgent replenishmentNeeded is true, readiness to routine productionEvidenceUsable to true exactly when readiness to urgent productionEvidenceUsable is true, readiness to routine productionAccepting to true exactly when readiness to urgent productionAccepting is true, readiness to replenishment band to readiness to urgent band, readiness to replenishment usable to true exactly when readiness to urgent usable is true, readiness to replenishment materialAvailable to true exactly when readiness to urgent materialAvailable is true, readiness to replenishment reserveLow to true exactly when readiness to urgent reserveLow is true, readiness to replenishment replenishmentNeeded to true exactly when readiness to urgent replenishmentNeeded is true, readiness to replenishment productionEvidenceUsable to true exactly when readiness to urgent productionEvidenceUsable is true, and readiness to replenishment productionAccepting to true exactly when readiness to urgent productionAccepting is true.

### Requirements for RecoverySupervisor

#### Contract clauses evaluated in the initialization phase

May modify: recoveryPhaseMemory

##### `INITIAL_RECOVERY_HEALTHY` — Required behavior

> During contract evaluation for the initialization phase, RecoverySupervisor shall set recoveryPhaseMemory to HEALTHY, gate to demand to OPEN, gate to supply to OPEN, gate to urgent to OPEN, gate to routine to OPEN, gate to replenishment to OPEN, emergency state to INACTIVE, and recovery state to HEALTHY.

#### Contract clauses evaluated in the compute phase

May modify: recoveryPhaseMemory

##### `RECOVERY_DERIVED_OUTPUTS` — Required behavior

> During contract evaluation for the compute phase, RecoverySupervisor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recovery state is recoveryPhaseMemory
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recoveryPhaseMemory is HEALTHY
>           - gate to demand is OPEN
>       - All of the following conditions hold:
>         
>           - recoveryPhaseMemory is not HEALTHY
>           - gate to demand is CLOSED
>   - gate to supply is gate to demand
>   - gate to urgent is gate to demand
>   - gate to routine is gate to demand
>   - gate to replenishment is gate to demand
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recoveryPhaseMemory is HEALTHY
>           - emergency state is INACTIVE
>       - All of the following conditions hold:
>         
>           - recoveryPhaseMemory is not HEALTHY
>           - emergency state is ACTIVE.

##### `CASE_07_FAULT_DOMINATES` — Conditional behavior

> During contract evaluation for the compute phase, if fault trigger is ACTIVE, RecoverySupervisor shall set recoveryPhaseMemory to LATCHED.

##### `CASE_08_HEALTHY_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, if fault trigger is INACTIVE and the value of recoveryPhaseMemory on entry is HEALTHY, RecoverySupervisor shall set recoveryPhaseMemory to HEALTHY.

##### `CASE_09_RESET_TO_RECOVERING` — Conditional behavior

> During contract evaluation for the compute phase, if fault trigger is INACTIVE, the value of recoveryPhaseMemory on entry is LATCHED, and recovery event is RESET, RecoverySupervisor shall set recoveryPhaseMemory to RECOVERING.

##### `CASE_10_LATCHED_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if fault trigger is INACTIVE, the value of recoveryPhaseMemory on entry is LATCHED, and recovery event is not RESET, RecoverySupervisor shall set recoveryPhaseMemory to LATCHED.

##### `CASE_11_VERIFICATION_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if fault trigger is INACTIVE, the value of recoveryPhaseMemory on entry is RECOVERING, and recovery event is VerifyOk, RecoverySupervisor shall set recoveryPhaseMemory to HEALTHY.

##### `CASE_12_RECOVERING_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if fault trigger is INACTIVE, the value of recoveryPhaseMemory on entry is RECOVERING, and recovery event is not VerifyOk, RecoverySupervisor shall set recoveryPhaseMemory to RECOVERING.

### Requirements for ReplenishmentEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REPLENISHMENT_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, ReplenishmentEligibility shall set proposal to NotProposed.

#### Contract clauses evaluated in the compute phase

##### `CASE_23_REPLENISHMENT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate is OPEN, material readiness facts replenishmentNeeded is true, supply state is CLEAR, and supplier availability is AVAILABLE, ReplenishmentEligibility shall set proposal to PROPOSED.

##### `CASE_24_REPLENISHMENT_NOT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recovery gate is OPEN, material readiness facts replenishmentNeeded is true, supply state is CLEAR, and supplier availability is AVAILABLE, ReplenishmentEligibility shall set proposal to NotProposed.

### Requirements for ResultComposition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PUBLIC_RESULT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ResultComposition shall set material coordination result actionValue to HOLD, material coordination result cause to NoEligibleWork, material coordination result mode to HOLDING, material coordination result demandPhase to IDLE, material coordination result supplyPhase to CLEAR, material coordination result recoveryPhase to HEALTHY, and material coordination result demandDisposition to NoRequest.

#### Contract clauses evaluated in the compute phase

##### `ATOMIC_RECEIVED_RESULT_COMPOSITION` — Required behavior

> During contract evaluation for the compute phase, ResultComposition shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - material coordination result actionValue is decision actionValue
>   - material coordination result cause is decision cause
>   - material coordination result demandPhase is demand transition demandPhase
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - supply state is CLEAR
>           - material coordination result supplyPhase is CLEAR
>       - All of the following conditions hold:
>         
>           - supply state is ORDERED
>           - material coordination result supplyPhase is ORDERED
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recovery state is HEALTHY
>           - material coordination result recoveryPhase is HEALTHY
>       - All of the following conditions hold:
>         
>           - recovery state is LATCHED
>           - material coordination result recoveryPhase is LATCHED
>       - All of the following conditions hold:
>         
>           - recovery state is RECOVERING
>           - material coordination result recoveryPhase is RECOVERING
>   - material coordination result demandDisposition is demand transition demandDisposition
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recovery state is not HEALTHY
>           - material coordination result mode is FAULT
>       - All of the following conditions hold:
>         
>           - recovery state is HEALTHY
>           - decision actionValue is IssueMaterialOrder
>           - material coordination result mode is ORDERING
>       - All of the following conditions hold:
>         
>           - recovery state is HEALTHY
>           - At least one of the following conditions holds:
>             
>               - decision actionValue is ReleaseUrgentMaterial
>               - decision actionValue is ReleaseRoutineMaterial
>           - material coordination result mode is RELEASING
>       - All of the following conditions hold:
>         
>           - recovery state is HEALTHY
>           - decision actionValue is HOLD
>           - material coordination result mode is HOLDING.

### Requirements for RoutineReleaseEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ROUTINE_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, RoutineReleaseEligibility shall set proposal to NotProposed.

#### Contract clauses evaluated in the compute phase

##### `CASE_21_ROUTINE_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 21 ROUTINE PROPOSED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recovery gate is OPEN
>   - At least one of the following conditions holds:
>     
>       - demand state is ARoutineOpen
>       - demand state is BRoutineOpen
>   - material readiness facts materialAvailable is true
>   - material readiness facts productionEvidenceUsable is true
>   - material readiness facts productionAccepting is true.

> When all applicability conditions are met, RoutineReleaseEligibility shall produce a result for which all of the following conditions hold:
>
> proposal is PROPOSED.

##### `CASE_22_ROUTINE_NOT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 22 ROUTINE NOT PROPOSED applies under all of the following conditions:
>
> It is not the case that:
>
> All of the following conditions hold:
>
>   - recovery gate is OPEN
>   - At least one of the following conditions holds:
>     
>       - demand state is ARoutineOpen
>       - demand state is BRoutineOpen
>   - material readiness facts materialAvailable is true
>   - material readiness facts productionEvidenceUsable is true
>   - material readiness facts productionAccepting is true.

> When all applicability conditions are met, RoutineReleaseEligibility shall produce a result for which all of the following conditions hold:
>
> proposal is NotProposed.

### Requirements for SupplyLifecycle

#### Contract clauses evaluated in the initialization phase

May modify: supplyPhaseMemory

##### `INITIAL_SUPPLY_STATE` — Required behavior

> During contract evaluation for the initialization phase, SupplyLifecycle shall set supplyPhaseMemory to CLEAR, prior supply state to CLEAR, current state to replenishment to CLEAR, and current state to composition to CLEAR.

#### Contract clauses evaluated in the compute phase

May modify: supplyPhaseMemory

##### `SUPPLY_PRIOR_AND_CURRENT_VIEWS` — Required behavior

> During contract evaluation for the compute phase, SupplyLifecycle shall set prior supply state to the value of supplyPhaseMemory on entry, current state to replenishment to supplyPhaseMemory, and current state to composition to supplyPhaseMemory.

##### `CASE_17_SUPPLY_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 17 SUPPLY PROGRESS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recovery gate is OPEN
>   - At least one of the following conditions holds:
>     
>       - qualified event is OrderRegistered
>       - qualified event is ReceiptConfirmed.

> When all applicability conditions are met, SupplyLifecycle shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - qualified event is OrderRegistered
>       - supplyPhaseMemory is ORDERED
>   - All of the following conditions hold:
>     
>       - qualified event is ReceiptConfirmed
>       - supplyPhaseMemory is CLEAR.

##### `CASE_18_SUPPLY_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 SUPPLY STUTTER applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - recovery gate is CLOSED
>   - All of the following conditions hold:
>     
>       - qualified event is not OrderRegistered
>       - qualified event is not ReceiptConfirmed.

> When all applicability conditions are met, SupplyLifecycle shall produce a result for which all of the following conditions hold:
>
> supplyPhaseMemory is the value of supplyPhaseMemory on entry.

### Requirements for UrgentReleaseEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_URGENT_NOT_PROPOSED` — Required behavior

> During contract evaluation for the initialization phase, UrgentReleaseEligibility shall set proposal to NotProposed.

#### Contract clauses evaluated in the compute phase

##### `CASE_19_URGENT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 URGENT PROPOSED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recovery gate is OPEN
>   - At least one of the following conditions holds:
>     
>       - demand state is AUrgentOpen
>       - demand state is BUrgentOpen
>   - material readiness facts materialAvailable is true
>   - material readiness facts productionEvidenceUsable is true
>   - material readiness facts productionAccepting is true.

> When all applicability conditions are met, UrgentReleaseEligibility shall produce a result for which all of the following conditions hold:
>
> proposal is PROPOSED.

##### `CASE_20_URGENT_NOT_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 URGENT NOT PROPOSED applies under all of the following conditions:
>
> It is not the case that:
>
> All of the following conditions hold:
>
>   - recovery gate is OPEN
>   - At least one of the following conditions holds:
>     
>       - demand state is AUrgentOpen
>       - demand state is BUrgentOpen
>   - material readiness facts materialAvailable is true
>   - material readiness facts productionEvidenceUsable is true
>   - material readiness facts productionAccepting is true.

> When all applicability conditions are met, UrgentReleaseEligibility shall produce a result for which all of the following conditions hold:
>
> proposal is NotProposed.
