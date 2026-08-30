# Docking and Service-Access Supervisor

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A pilot and station need one bounded
supervisor to govern logical docking approach authorization, docked-service access, and
undocking release so that access is not opened before concordant vessel and station
evidence and departure is not authorized while docked services remain active.

PURPOSE-01: [Pilot abstraction] For each evaluation, the system shall classify a pilot
access request, vessel lifecycle status, station berth report, docked-service activity,
and supervisory control event; update request, lifecycle, berth, access-gate, and
recovery state; select at most one logical action; and publish one coherent
docking-access result.

GOAL-01: [Pilot abstraction] The system shall deterministically cover every finite
boundary snapshot and every admitted prior-state tuple with no unconstrained next owner
state or public output field.

GOAL-02: [Pilot abstraction] A newly detected emergency, invalid or contradictory
evidence, phase or token fault, or closed recovery shall dominate all ordinary actions
and shall revoke logical service access in the same evaluation.

GOAL-03: [Pilot abstraction] In healthy operation, a fresh dock request may lead to
clearance and approach authorization; concordant docked and secured evidence may lead to
service access; an undock request shall wait for quiescent services and a closed access
gate before release and departure authorization.

GOAL-04: [Pilot abstraction] Fault recovery shall abandon the active authorization in
quarantine, require a fresh reset, and then require a later evidence-concordant
`VERIFY_CLEAR` or `VERIFY_DOCKED` anchor; it shall never resume an old authorization
token.

GOAL-05: [Selected architecture] The selected action, cause, public mode, correlation,
request disposition, access status, and outcome shall be composed into one indivisible
flat `DockingAccessResult` solely from transmitted owner-local decisions.

### Operational context and finite system boundary

CTX-SYS-01: [Selected boundary] The modeled system is a logical docking and
service-access supervisor. Physical docking and undocking, vessel motion, berth
hardware, station service execution, cargo transfer, warehouse storage, mining, repair,
resupply, travel, combat, and whole-vessel lifecycle governance remain outside it.

CTX-PILOT-01: [Seed-grounded entity with pilot responsibility] The external pilot
supplies at most one `AccessRequest` event per evaluation and consumes the public result
through `CTX-PUB-01`; the pilot is responsible for resubmitting a deferred request and
following the bounded token rule in `ASM-TAG-01`.

CTX-VESSEL-01: [Seed-grounded context with pilot responsibility] An external
vessel-lifecycle authority supplies one `VesselStatus` snapshot. It is responsible for
the declared status and token association, not for proving physical position or docking
effectiveness.

CTX-STATION-01: [Seed-grounded entity with pilot responsibility] An external station
docking authority consumes logical clearance, approach, release, and departure requests
and supplies a later `StationReport`; it is responsible for freshness and token
association, not for berth hardware effectiveness.

CTX-SERVICE-01: [Seed-grounded capability with pilot responsibility] An external
docked-service aggregator supplies `ServiceActivity` across repair, resupply, or other
station services. It is responsible for reporting `QUIESCENT` only when no docked
service requires continued logical access; individual service semantics and completion
remain outside the system.

CTX-CTRL-01: [Pilot external authority] A station supervisory authority supplies
emergency and recovery events after external diagnosis. It is responsible for separating
reset from later anchor verification and for issuing an anchor event only with the
concordant boundary evidence required by `CASE-24`.

CTX-PUB-01: [Selected boundary] A pilot-and-station integration recipient consumes one
`DockingAccessResult` and conveys its logical action to the appropriate external
authority without changing its meaning. The supervisor controls authorization requests
and an access indication, not external acceptance or physical motion.

MON-REQ-01: [Pilot abstraction] Root input `accessRequest` has finite type
`AccessRequest={NONE,INVALID,DOCK_A,DOCK_B,ACCESS_A,ACCESS_B,UNDOCK_A,UNDOCK_B}` and
comes from `CTX-PILOT-01`; `A` and `B` are bounded authorization tokens, not berth or
cargo identities.

MON-VES-01: [Pilot abstraction] Root input `vesselStatus` has finite type
`VesselStatus={INVALID,ON_WARP,IN_GRID,DOCKED_A,DOCKED_B,DEPARTED_A,DEPARTED_B}` and
comes from `CTX-VESSEL-01`.

MON-STA-01: [Pilot abstraction] Root input `stationReport` has finite type
`StationReport={NONE,INVALID,AVAILABLE,CLEAR_A,CLEAR_B,SECURED_A,SECURED_B,DENIED,RELEASED_A,RELEASED_B}`
and comes from `CTX-STATION-01`; every value other than `NONE` is fresh evidence for one
evaluation.

MON-SVC-01: [Pilot abstraction] Root input `serviceActivity` has finite type
`ServiceActivity={INVALID,QUIESCENT,ACTIVE}` and comes from `CTX-SERVICE-01`; it is a
current logical level, not a service count or completion certificate.

MON-CTL-01: [Pilot abstraction] Root input `controlEvent` has finite type
`ControlEvent={NONE,EMERGENCY_STOP,RESET,VERIFY_CLEAR,VERIFY_DOCKED}` and comes from
`CTX-CTRL-01`; every value other than `NONE` is a fresh single-evaluation event.

CTRL-RES-01: [Selected architecture] The sole root output is the flat record
`DockingAccessResult=(action,cause,mode,correlation,requestDisposition,accessStatus,outcome)`,
delivered to `CTX-PUB-01`.

ASM-FRESH-01: [Pilot abstraction] `CTX-PILOT-01`, `CTX-STATION-01`, and `CTX-CTRL-01`
are responsible for event freshness. Rationale: replayed requests, station reports, or
recovery events could otherwise advance a retained owner more than once.

ASM-TAG-01: [Pilot abstraction] `CTX-PILOT-01` shall alternate `A` and `B` between
accepted authorization starts. `ACCESS_*` and `UNDOCK_*` shall use the active token
except that `ACCESS_*` after `DOCKED_REBASE` shall use the token opposite the last
accepted ledger value. Rationale: two tokens bound analysis while distinguishing
duplicate and stale requests.

ASM-CAP-01: [Pilot abstraction] The supervisor retains at most one authorization and one
berth commitment and stores no cargo, service manifest, or physical geometry.
`CTX-PILOT-01` shall retry a valid request reported `DEFERRED`. Rationale: these are
finite experiment bounds, not station-capacity claims.

ASM-CONC-01: [Pilot abstraction] `CTX-STATION-01` and `CTX-VESSEL-01` may provide
station and vessel evidence in either order. If both are progress-bearing in one
evaluation, they shall carry the same active token; contradiction, mistagging, or phase
inconsistency is a fault rather than an assumed ordering.

ASM-LEVEL-01: [Pilot abstraction] Controlled actions are desired logical levels, not
transaction counts. `CTX-STATION-01` and `CTX-SERVICE-01` shall not interpret a repeated
identical action as a second docking, access, or departure transaction while its
prerequisite state remains unchanged.

ASM-STEP-01: [Pilot abstraction] One evaluation is an ordered logical reaction with no
physical duration: prior owner states and current boundary facts determine admission and
coherence; state owners determine their own next state; proposal owners derive
candidates; arbitration selects one; composition publishes one result.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, request history is
`NO_HISTORY`, lifecycle is `CLEAR_IDLE`, berth is `AVAILABLE`, gate is `CLOSED`,
recovery is `HEALTHY`, and the result is
`(HOLD,NO_ELIGIBLE_ACTION,HOLDING,NONE,NO_REQUEST,CLOSED,NONE)`.

### Risks, faults, and mitigations

RISK-01: [Pilot risk] Opening service access without concordant docked-vessel and
secured-berth evidence could expose station services during an unconfirmed lifecycle
phase; `FAULT-01` requires phase and token inconsistencies to revoke access and
quarantine the authorization.

RISK-02: [Pilot risk] Authorizing undocking while service activity is `ACTIVE` or the
access gate remains logically open could conflict with docked-service use; `FAULT-02`
requires admission inhibition and dominant gate closure before release progression.

RISK-03: [Pilot risk] Resuming the pre-fault authorization after ambiguous vessel or
berth evidence could reuse a stale clearance; `FAULT-03` requires token abandonment and
an independently verified clear or docked recovery anchor.

## Supporting contract definitions

### State `Docking_Access_Supervisor::BerthCommitment::berthState`

State `berthState` has type `Docking_Access_Supervisor::BerthState`.

### State `Docking_Access_Supervisor::DockingLifecycle::lifecycleState`

State `lifecycleState` has type `Docking_Access_Supervisor::LifecycleState`.

### State `Docking_Access_Supervisor::RecoverySupervisor::recoveryState`

State `recoveryState` has type `Docking_Access_Supervisor::RecoveryState`.

### State `Docking_Access_Supervisor::RequestAdmission::requestLedger`

State `requestLedger` has type `Docking_Access_Supervisor::RequestLedger`.

### State `Docking_Access_Supervisor::ServiceAccessGate::gateState`

State `gateState` has type `Docking_Access_Supervisor::GateState`.

## Detailed behavioral requirements

### Requirements for AccessActionEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ACCESS_PROPOSAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AccessActionEligibility shall set access proposal applicable to true exactly when F is true, access proposal proposedAction to HOLD, access proposal cause to NO ELIGIBLE ACTION, access proposal correlation to NONE, and access proposal decisionContext to CLEAR.

#### Contract clauses evaluated in the compute phase

##### `PROPOSE_ACCESS_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, if admission decision accepted is true, admission decision operation is ACCESS, and access frame qualified is true, AccessActionEligibility shall produce a result for which access proposal applicable is true, access proposal proposedAction is OPEN SERVICE ACCESS, access proposal cause is ACCESS REQUEST, access proposal correlation is admission decision correlation, and access proposal decisionContext is ACCESS OPEN.

##### `PROPOSE_ACCESS_CLOSE` — Conditional behavior

> During contract evaluation for the compute phase, if admission decision accepted is true and admission decision operation is UNDOCK, AccessActionEligibility shall produce a result for which access proposal applicable is true, access proposal proposedAction is CLOSE SERVICE ACCESS, access proposal cause is UNDOCK SEQUENCE, access proposal correlation is admission decision correlation, and access proposal decisionContext is UNDOCKING.

##### `NO_ACCESS_PROPOSAL` — Conditional behavior

> During contract evaluation for the compute phase, case NO ACCESS PROPOSAL applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - admission decision accepted is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - admission decision operation is not ACCESS
>       - admission decision operation is not UNDOCK
>   - All of the following conditions hold:
>     
>       - admission decision operation is ACCESS
>       - access frame qualified is true exactly when F is true.

> When all applicability conditions are met, AccessActionEligibility shall produce a result for which all of the following conditions hold:
>
> access proposal applicable is true exactly when F is true, access proposal proposedAction is HOLD, access proposal cause is NO ELIGIBLE ACTION, access proposal correlation is access frame correlation, and access proposal decisionContext is access frame decisionContext.

### Requirements for AccessCoherence

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_COHERENCE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AccessCoherence shall produce a result for which recovery transition intent is RETAIN, recovery transition fault is true exactly when F is true, recovery transition verifiedAnchor is true exactly when F is true, admission guard open is true exactly when F is true, admission guard lifecycle is CLEAR IDLE, admission guard correlation is NONE, admission guard berthAvailable is true, admission guard gateClosed is true, admission guard recoveryHealthy is true, lifecycle frame directive is RETAIN, lifecycle frame correlation is NONE, lifecycle frame qualified is true exactly when F is true, lifecycle frame decisionContext is CLEAR, berth transition evidence eventKind is NO EVENT, berth transition evidence correlation is NONE, berth transition evidence qualified is true exactly when F is true, gate safety frame directive is RETAIN, gate safety frame safeToOpen is true exactly when F is true, gate safety frame decisionContext is CLEAR, docking frame directive is RETAIN, docking frame correlation is NONE, docking frame qualified is true exactly when F is true, docking frame decisionContext is CLEAR, access frame directive is RETAIN, access frame correlation is NONE, access frame qualified is true exactly when F is true, access frame decisionContext is CLEAR, undocking frame directive is RETAIN, undocking frame correlation is NONE, undocking frame qualified is true exactly when F is true, undocking frame decisionContext is CLEAR, priority directive priority is ORDINARY, priority directive correlation is NONE, and priority directive decisionContext is CLEAR.

#### Contract clauses evaluated in the compute phase

##### `COHERENCE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case COHERENCE FAULT applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - control event is EMERGENCY STOP
>   - vessel facts usable is true exactly when F is true
>   - station facts usable is true exactly when F is true
>   - service facts usable is true exactly when F is true
>   - station facts denied is true
>   - All of the following conditions hold:
>     
>       - service facts active is true
>       - prior gate state is CLOSED
>   - All of the following conditions hold:
>     
>       - prior recovery state is HEALTHY
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - vessel facts correlation is not NONE
>               - vessel facts correlation is not prior lifecycle view correlation
>           - All of the following conditions hold:
>             
>               - station facts correlation is not NONE
>               - station facts correlation is not prior lifecycle view correlation
>   - All of the following conditions hold:
>     
>       - prior recovery state is HEALTHY
>       - prior lifecycle view lifecycle is QUARANTINED
>   - All of the following conditions hold:
>     
>       - prior recovery state is not HEALTHY
>       - prior lifecycle view lifecycle is not QUARANTINED
>       - prior lifecycle view lifecycle is not DOCKED REBASE
>   - All of the following conditions hold:
>     
>       - prior gate state is OPEN
>       - At least one of the following conditions holds:
>         
>           - prior berth state is not SECURED
>           - All of the following conditions hold:
>             
>               - prior lifecycle view lifecycle is not ACCESS OPEN A
>               - prior lifecycle view lifecycle is not ACCESS OPEN B
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - prior lifecycle view lifecycle is ACCESS OPEN A
>           - prior lifecycle view lifecycle is ACCESS OPEN B
>       - prior gate state is not OPEN
>   - All of the following conditions hold:
>     
>       - station facts progress is CLEAR
>       - prior lifecycle view lifecycle is not AWAIT CLEAR A
>       - prior lifecycle view lifecycle is not AWAIT CLEAR B
>   - All of the following conditions hold:
>     
>       - station facts progress is SECURED
>       - prior lifecycle view lifecycle is not AWAIT DOCK A
>       - prior lifecycle view lifecycle is not AWAIT DOCK B
>       - prior lifecycle view lifecycle is not AWAIT SECURE A
>       - prior lifecycle view lifecycle is not AWAIT SECURE B
>       - prior lifecycle view lifecycle is not DOCKED CLOSED A
>       - prior lifecycle view lifecycle is not DOCKED CLOSED B
>       - prior lifecycle view lifecycle is not ACCESS OPEN A
>       - prior lifecycle view lifecycle is not ACCESS OPEN B
>   - All of the following conditions hold:
>     
>       - station facts progress is RELEASED
>       - prior lifecycle view lifecycle is not AWAIT RELEASE A
>       - prior lifecycle view lifecycle is not AWAIT RELEASE B
>       - prior lifecycle view lifecycle is not AWAIT DEPART A
>       - prior lifecycle view lifecycle is not AWAIT DEPART B
>   - All of the following conditions hold:
>     
>       - vessel facts departed is true
>       - prior lifecycle view lifecycle is not AWAIT DEPART A
>       - prior lifecycle view lifecycle is not AWAIT DEPART B
>   - All of the following conditions hold:
>     
>       - vessel facts docked is true
>       - prior lifecycle view lifecycle is not AWAIT DOCK A
>       - prior lifecycle view lifecycle is not AWAIT DOCK B
>       - prior lifecycle view lifecycle is not AWAIT SECURE A
>       - prior lifecycle view lifecycle is not AWAIT SECURE B
>       - prior lifecycle view lifecycle is not DOCKED CLOSED A
>       - prior lifecycle view lifecycle is not DOCKED CLOSED B
>       - prior lifecycle view lifecycle is not ACCESS OPEN A
>       - prior lifecycle view lifecycle is not ACCESS OPEN B
>       - prior lifecycle view lifecycle is not AWAIT RELEASE A
>       - prior lifecycle view lifecycle is not AWAIT RELEASE B
>       - prior lifecycle view lifecycle is not AWAIT DEPART A
>       - prior lifecycle view lifecycle is not AWAIT DEPART B
>       - prior lifecycle view lifecycle is not DOCKED REBASE
>   - All of the following conditions hold:
>     
>       - vessel facts docked is true
>       - station facts progress is CLEAR.

> When all applicability conditions are met, AccessCoherence shall produce a result for which all of the following conditions hold:
>
> recovery transition intent is LATCH, recovery transition fault is true, recovery transition verifiedAnchor is true exactly when F is true, admission guard open is true exactly when F is true, admission guard lifecycle is prior lifecycle view lifecycle, admission guard correlation is NONE, admission guard berthAvailable is true exactly when F is true, admission guard gateClosed is true, admission guard recoveryHealthy is true exactly when F is true, lifecycle frame directive is QUARANTINE, lifecycle frame correlation is NONE, lifecycle frame qualified is true, lifecycle frame decisionContext is QUARANTINED, berth transition evidence eventKind is DOMINANT FAULT, berth transition evidence correlation is NONE, berth transition evidence qualified is true, gate safety frame directive is FORCE CLOSE, gate safety frame safeToOpen is true exactly when F is true, gate safety frame decisionContext is QUARANTINED, docking frame directive is QUARANTINE, docking frame correlation is NONE, docking frame qualified is true exactly when F is true, docking frame decisionContext is QUARANTINED, access frame directive is QUARANTINE, access frame correlation is NONE, access frame qualified is true exactly when F is true, access frame decisionContext is QUARANTINED, undocking frame directive is QUARANTINE, undocking frame correlation is NONE, undocking frame qualified is true exactly when F is true, undocking frame decisionContext is QUARANTINED, priority directive priority is REVOKE, priority directive correlation is NONE, and priority directive decisionContext is QUARANTINED.

##### `RECOVERY_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if control event is not EMERGENCY STOP, vessel facts usable is true, station facts usable is true, service facts usable is true, station facts denied is true exactly when F is true, prior recovery state is LATCHED, and control event is RESET, AccessCoherence shall produce a result for which recovery transition intent is RECONCILE, recovery transition fault is true exactly when F is true, recovery transition verifiedAnchor is true exactly when F is true, admission guard open is true exactly when F is true, admission guard lifecycle is prior lifecycle view lifecycle, admission guard correlation is NONE, admission guard berthAvailable is true exactly when F is true, admission guard gateClosed is true, admission guard recoveryHealthy is true exactly when F is true, lifecycle frame directive is RETAIN, lifecycle frame correlation is NONE, lifecycle frame qualified is true exactly when F is true, lifecycle frame decisionContext is QUARANTINED, berth transition evidence eventKind is NO EVENT, berth transition evidence correlation is NONE, berth transition evidence qualified is true exactly when F is true, gate safety frame directive is FORCE CLOSE, gate safety frame safeToOpen is true exactly when F is true, gate safety frame decisionContext is QUARANTINED, docking frame directive is RETAIN, docking frame correlation is NONE, docking frame qualified is true exactly when F is true, docking frame decisionContext is QUARANTINED, access frame directive is RETAIN, access frame correlation is NONE, access frame qualified is true exactly when F is true, access frame decisionContext is QUARANTINED, undocking frame directive is RETAIN, undocking frame correlation is NONE, undocking frame qualified is true exactly when F is true, undocking frame decisionContext is QUARANTINED, priority directive priority is REVOKE, priority directive correlation is NONE, and priority directive decisionContext is QUARANTINED.

##### `RECOVERY_CLEAR_ANCHOR` — Conditional behavior

> During contract evaluation for the compute phase, if prior recovery state is RECONCILING, control event is VERIFY CLEAR, vessel facts lifecycleClass is IN GRID, station facts progress is AVAILABLE, and service facts quiescent is true, AccessCoherence shall produce a result for which recovery transition intent is OPEN CLEAR, recovery transition fault is true exactly when F is true, recovery transition verifiedAnchor is true, admission guard open is true exactly when F is true, admission guard lifecycle is prior lifecycle view lifecycle, admission guard correlation is NONE, admission guard berthAvailable is true exactly when F is true, admission guard gateClosed is true, admission guard recoveryHealthy is true exactly when F is true, lifecycle frame directive is ANCHOR CLEAR, lifecycle frame correlation is NONE, lifecycle frame qualified is true, lifecycle frame decisionContext is QUARANTINED, berth transition evidence eventKind is VERIFIED CLEAR ANCHOR, berth transition evidence correlation is NONE, berth transition evidence qualified is true, gate safety frame directive is FORCE CLOSE, gate safety frame safeToOpen is true exactly when F is true, gate safety frame decisionContext is QUARANTINED, docking frame directive is RETAIN, docking frame correlation is NONE, docking frame qualified is true exactly when F is true, docking frame decisionContext is QUARANTINED, access frame directive is RETAIN, access frame correlation is NONE, access frame qualified is true exactly when F is true, access frame decisionContext is QUARANTINED, undocking frame directive is RETAIN, undocking frame correlation is NONE, undocking frame qualified is true exactly when F is true, undocking frame decisionContext is QUARANTINED, priority directive priority is REVOKE, priority directive correlation is NONE, and priority directive decisionContext is QUARANTINED.

##### `RECOVERY_DOCKED_ANCHOR` — Conditional behavior

> During contract evaluation for the compute phase, if prior recovery state is RECONCILING, control event is VERIFY DOCKED, vessel facts docked is true, station facts progress is SECURED, vessel facts correlation is station facts correlation, vessel facts correlation is not NONE, and service facts quiescent is true, AccessCoherence shall produce a result for which recovery transition intent is OPEN DOCKED, recovery transition fault is true exactly when F is true, recovery transition verifiedAnchor is true, admission guard open is true exactly when F is true, admission guard lifecycle is prior lifecycle view lifecycle, admission guard correlation is NONE, admission guard berthAvailable is true exactly when F is true, admission guard gateClosed is true, admission guard recoveryHealthy is true exactly when F is true, lifecycle frame directive is ANCHOR DOCKED, lifecycle frame correlation is NONE, lifecycle frame qualified is true, lifecycle frame decisionContext is QUARANTINED, berth transition evidence eventKind is VERIFIED DOCKED ANCHOR, berth transition evidence correlation is NONE, berth transition evidence qualified is true, gate safety frame directive is FORCE CLOSE, gate safety frame safeToOpen is true exactly when F is true, gate safety frame decisionContext is QUARANTINED, docking frame directive is RETAIN, docking frame correlation is NONE, docking frame qualified is true exactly when F is true, docking frame decisionContext is QUARANTINED, access frame directive is RETAIN, access frame correlation is NONE, access frame qualified is true exactly when F is true, access frame decisionContext is QUARANTINED, undocking frame directive is RETAIN, undocking frame correlation is NONE, undocking frame qualified is true exactly when F is true, undocking frame decisionContext is QUARANTINED, priority directive priority is REVOKE, priority directive correlation is NONE, and priority directive decisionContext is QUARANTINED.

##### `RECOVERY_INHIBITED` — Conditional behavior

> During contract evaluation for the compute phase, case RECOVERY INHIBITED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - prior recovery state is not HEALTHY
>       - control event is not NONE
>   - At least one of the following conditions holds:
>     
>       - prior recovery state is not LATCHED
>       - control event is not RESET
>   - At least one of the following conditions holds:
>     
>       - prior recovery state is not RECONCILING
>       - control event is not VERIFY CLEAR
>       - vessel facts lifecycleClass is not IN GRID
>       - station facts progress is not AVAILABLE
>       - service facts quiescent is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - prior recovery state is not RECONCILING
>       - control event is not VERIFY DOCKED
>       - vessel facts docked is true exactly when F is true
>       - station facts progress is not SECURED
>       - vessel facts correlation is not station facts correlation
>       - vessel facts correlation is NONE
>       - service facts quiescent is true exactly when F is true
>   - control event is not EMERGENCY STOP
>   - vessel facts usable is true
>   - station facts usable is true
>   - service facts usable is true
>   - station facts denied is true exactly when F is true.

> When all applicability conditions are met, AccessCoherence shall produce a result for which all of the following conditions hold:
>
> recovery transition intent is RETAIN, recovery transition fault is true exactly when F is true, recovery transition verifiedAnchor is true exactly when F is true, admission guard open is true exactly when F is true, admission guard lifecycle is prior lifecycle view lifecycle, admission guard correlation is NONE, admission guard berthAvailable is true exactly when F is true, admission guard gateClosed is true, admission guard recoveryHealthy is true exactly when F is true, lifecycle frame directive is RETAIN, lifecycle frame correlation is NONE, lifecycle frame qualified is true exactly when F is true, lifecycle frame decisionContext is QUARANTINED, berth transition evidence eventKind is NO EVENT, berth transition evidence correlation is NONE, berth transition evidence qualified is true exactly when F is true, gate safety frame directive is FORCE CLOSE, gate safety frame safeToOpen is true exactly when F is true, gate safety frame decisionContext is QUARANTINED, docking frame directive is RETAIN, docking frame correlation is NONE, docking frame qualified is true exactly when F is true, docking frame decisionContext is QUARANTINED, access frame directive is RETAIN, access frame correlation is NONE, access frame qualified is true exactly when F is true, access frame decisionContext is QUARANTINED, undocking frame directive is RETAIN, undocking frame correlation is NONE, undocking frame qualified is true exactly when F is true, undocking frame decisionContext is QUARANTINED, priority directive priority is REVOKE, priority directive correlation is NONE, and priority directive decisionContext is QUARANTINED.

##### `ORDINARY_COHERENCE` — Conditional behavior

> During contract evaluation for the compute phase, case ORDINARY COHERENCE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - prior recovery state is HEALTHY
>   - control event is NONE
>   - vessel facts usable is true
>   - station facts usable is true
>   - service facts usable is true
>   - station facts denied is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - service facts active is true exactly when F is true
>       - prior gate state is OPEN
>   - At least one of the following conditions holds:
>     
>       - vessel facts correlation is NONE
>       - vessel facts correlation is prior lifecycle view correlation
>   - At least one of the following conditions holds:
>     
>       - station facts correlation is NONE
>       - station facts correlation is prior lifecycle view correlation
>   - prior lifecycle view lifecycle is not QUARANTINED
>   - At least one of the following conditions holds:
>     
>       - prior gate state is not OPEN
>       - All of the following conditions hold:
>         
>           - prior berth state is SECURED
>           - At least one of the following conditions holds:
>             
>               - prior lifecycle view lifecycle is ACCESS OPEN A
>               - prior lifecycle view lifecycle is ACCESS OPEN B
>   - At least one of the following conditions holds:
>     
>       - prior lifecycle view lifecycle is not ACCESS OPEN A
>       - prior gate state is OPEN
>   - At least one of the following conditions holds:
>     
>       - prior lifecycle view lifecycle is not ACCESS OPEN B
>       - prior gate state is OPEN
>   - At least one of the following conditions holds:
>     
>       - station facts progress is not CLEAR
>       - prior lifecycle view lifecycle is AWAIT CLEAR A
>       - prior lifecycle view lifecycle is AWAIT CLEAR B
>   - At least one of the following conditions holds:
>     
>       - station facts progress is not SECURED
>       - prior lifecycle view lifecycle is AWAIT DOCK A
>       - prior lifecycle view lifecycle is AWAIT DOCK B
>       - prior lifecycle view lifecycle is AWAIT SECURE A
>       - prior lifecycle view lifecycle is AWAIT SECURE B
>       - prior lifecycle view lifecycle is DOCKED CLOSED A
>       - prior lifecycle view lifecycle is DOCKED CLOSED B
>       - prior lifecycle view lifecycle is ACCESS OPEN A
>       - prior lifecycle view lifecycle is ACCESS OPEN B
>   - At least one of the following conditions holds:
>     
>       - station facts progress is not RELEASED
>       - prior lifecycle view lifecycle is AWAIT RELEASE A
>       - prior lifecycle view lifecycle is AWAIT RELEASE B
>       - prior lifecycle view lifecycle is AWAIT DEPART A
>       - prior lifecycle view lifecycle is AWAIT DEPART B
>   - At least one of the following conditions holds:
>     
>       - vessel facts departed is true exactly when F is true
>       - prior lifecycle view lifecycle is AWAIT DEPART A
>       - prior lifecycle view lifecycle is AWAIT DEPART B
>   - At least one of the following conditions holds:
>     
>       - vessel facts docked is true exactly when F is true
>       - prior lifecycle view lifecycle is AWAIT DOCK A
>       - prior lifecycle view lifecycle is AWAIT DOCK B
>       - prior lifecycle view lifecycle is AWAIT SECURE A
>       - prior lifecycle view lifecycle is AWAIT SECURE B
>       - prior lifecycle view lifecycle is DOCKED CLOSED A
>       - prior lifecycle view lifecycle is DOCKED CLOSED B
>       - prior lifecycle view lifecycle is ACCESS OPEN A
>       - prior lifecycle view lifecycle is ACCESS OPEN B
>       - prior lifecycle view lifecycle is AWAIT RELEASE A
>       - prior lifecycle view lifecycle is AWAIT RELEASE B
>       - prior lifecycle view lifecycle is AWAIT DEPART A
>       - prior lifecycle view lifecycle is AWAIT DEPART B
>       - prior lifecycle view lifecycle is DOCKED REBASE
>   - At least one of the following conditions holds:
>     
>       - vessel facts docked is true exactly when F is true
>       - station facts progress is not CLEAR.

> When all applicability conditions are met, AccessCoherence shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recovery transition intent is RETAIN
>   - recovery transition fault is true exactly when F is true
>   - recovery transition verifiedAnchor is true exactly when F is true
>   - admission guard open is true
>   - admission guard lifecycle is prior lifecycle view lifecycle
>   - admission guard correlation is prior lifecycle view correlation
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     admission guard berthAvailable is true
>     
>     **Second condition:**
>     
>     prior berth state is AVAILABLE
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     admission guard gateClosed is true
>     
>     **Second condition:**
>     
>     prior gate state is CLOSED
>   - admission guard recoveryHealthy is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - station facts progress is CLEAR
>           - lifecycle frame directive is CLEARANCE
>           - lifecycle frame correlation is station facts correlation
>           - lifecycle frame qualified is true
>       - All of the following conditions hold:
>         
>           - vessel facts docked is true
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - prior berth state is SECURED
>                   - lifecycle frame directive is SECURED
>               - All of the following conditions hold:
>                 
>                   - prior berth state is not SECURED
>                   - lifecycle frame directive is DOCKED
>           - lifecycle frame correlation is vessel facts correlation
>           - lifecycle frame qualified is true
>       - All of the following conditions hold:
>         
>           - station facts progress is SECURED
>           - vessel facts docked is true exactly when F is true
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - At least one of the following conditions holds:
>                     
>                       - prior lifecycle view lifecycle is AWAIT SECURE A
>                       - prior lifecycle view lifecycle is AWAIT SECURE B
>                   - lifecycle frame directive is SECURED
>                   - lifecycle frame qualified is true
>               - All of the following conditions hold:
>                 
>                   - prior lifecycle view lifecycle is not AWAIT SECURE A
>                   - prior lifecycle view lifecycle is not AWAIT SECURE B
>                   - lifecycle frame directive is RETAIN
>                   - lifecycle frame qualified is true exactly when F is true
>           - lifecycle frame correlation is station facts correlation
>           - lifecycle frame decisionContext is DOCKING
>       - All of the following conditions hold:
>         
>           - station facts progress is RELEASED
>           - vessel facts docked is true exactly when F is true
>           - lifecycle frame directive is RELEASED
>           - lifecycle frame correlation is station facts correlation
>           - lifecycle frame qualified is true
>       - All of the following conditions hold:
>         
>           - vessel facts departed is true
>           - lifecycle frame directive is DEPARTED
>           - lifecycle frame correlation is vessel facts correlation
>           - lifecycle frame qualified is true
>       - All of the following conditions hold:
>         
>           - station facts progress is not CLEAR
>           - vessel facts docked is true exactly when F is true
>           - station facts progress is not SECURED
>           - station facts progress is not RELEASED
>           - vessel facts departed is true exactly when F is true
>           - lifecycle frame directive is RETAIN
>           - lifecycle frame correlation is prior lifecycle view correlation
>           - lifecycle frame qualified is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - prior lifecycle view lifecycle is CLEAR IDLE
>           - lifecycle frame decisionContext is CLEAR
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior lifecycle view lifecycle is AWAIT CLEAR A
>               - prior lifecycle view lifecycle is AWAIT CLEAR B
>               - prior lifecycle view lifecycle is AWAIT DOCK A
>               - prior lifecycle view lifecycle is AWAIT DOCK B
>               - prior lifecycle view lifecycle is AWAIT SECURE A
>               - prior lifecycle view lifecycle is AWAIT SECURE B
>           - lifecycle frame decisionContext is DOCKING
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior lifecycle view lifecycle is DOCKED CLOSED A
>               - prior lifecycle view lifecycle is DOCKED CLOSED B
>               - prior lifecycle view lifecycle is DOCKED REBASE
>           - lifecycle frame decisionContext is DOCKED CLOSED
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior lifecycle view lifecycle is ACCESS OPEN A
>               - prior lifecycle view lifecycle is ACCESS OPEN B
>           - lifecycle frame decisionContext is ACCESS OPEN
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior lifecycle view lifecycle is AWAIT RELEASE A
>               - prior lifecycle view lifecycle is AWAIT RELEASE B
>               - prior lifecycle view lifecycle is AWAIT DEPART A
>               - prior lifecycle view lifecycle is AWAIT DEPART B
>           - lifecycle frame decisionContext is UNDOCKING
>       - All of the following conditions hold:
>         
>           - prior lifecycle view lifecycle is QUARANTINED
>           - lifecycle frame decisionContext is QUARANTINED
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - station facts progress is CLEAR
>           - berth transition evidence eventKind is STATION CLEARANCE
>           - berth transition evidence correlation is station facts correlation
>           - berth transition evidence qualified is true
>       - All of the following conditions hold:
>         
>           - station facts progress is SECURED
>           - berth transition evidence eventKind is STATION SECURED
>           - berth transition evidence correlation is station facts correlation
>           - berth transition evidence qualified is true
>       - All of the following conditions hold:
>         
>           - station facts progress is RELEASED
>           - berth transition evidence eventKind is STATION RELEASED
>           - berth transition evidence correlation is station facts correlation
>           - berth transition evidence qualified is true
>       - All of the following conditions hold:
>         
>           - vessel facts departed is true
>           - berth transition evidence eventKind is DEPARTURE COMPLETION
>           - berth transition evidence correlation is vessel facts correlation
>           - berth transition evidence qualified is true
>       - All of the following conditions hold:
>         
>           - station facts progress is AVAILABLE
>           - berth transition evidence eventKind is STATION AVAILABLE
>           - berth transition evidence correlation is NONE
>           - berth transition evidence qualified is true
>       - All of the following conditions hold:
>         
>           - station facts progress is not CLEAR
>           - station facts progress is not SECURED
>           - station facts progress is not RELEASED
>           - station facts progress is not AVAILABLE
>           - vessel facts departed is true exactly when F is true
>           - berth transition evidence eventKind is NO EVENT
>           - berth transition evidence correlation is NONE
>           - berth transition evidence qualified is true exactly when F is true
>   - gate safety frame directive is RETAIN
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     gate safety frame safeToOpen is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - prior lifecycle view lifecycle is DOCKED CLOSED A
>           - prior lifecycle view lifecycle is DOCKED CLOSED B
>           - prior lifecycle view lifecycle is DOCKED REBASE
>       - prior berth state is SECURED
>       - service facts quiescent is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - prior gate state is OPEN
>           - gate safety frame decisionContext is ACCESS OPEN
>       - All of the following conditions hold:
>         
>           - prior gate state is CLOSED
>           - gate safety frame decisionContext is DOCKED CLOSED
>   - docking frame directive is lifecycle frame directive
>   - docking frame correlation is lifecycle frame correlation
>   - docking frame qualified is true exactly when lifecycle frame qualified is true
>   - docking frame decisionContext is lifecycle frame decisionContext
>   - access frame directive is lifecycle frame directive
>   - access frame correlation is lifecycle frame correlation
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     access frame qualified is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - prior lifecycle view lifecycle is DOCKED CLOSED A
>           - prior lifecycle view lifecycle is DOCKED CLOSED B
>           - prior lifecycle view lifecycle is DOCKED REBASE
>       - prior berth state is SECURED
>       - service facts quiescent is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - prior gate state is OPEN
>           - access frame decisionContext is ACCESS OPEN
>       - All of the following conditions hold:
>         
>           - prior gate state is CLOSED
>           - access frame decisionContext is DOCKED CLOSED
>   - undocking frame directive is lifecycle frame directive
>   - undocking frame correlation is lifecycle frame correlation
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     undocking frame qualified is true
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - prior lifecycle view lifecycle is AWAIT RELEASE A
>               - prior lifecycle view lifecycle is AWAIT RELEASE B
>           - prior gate state is CLOSED
>       - lifecycle frame directive is RELEASED
>   - undocking frame decisionContext is UNDOCKING
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - vessel facts departed is true
>           - priority directive priority is DEPARTURE COMPLETE
>           - priority directive correlation is vessel facts correlation
>       - All of the following conditions hold:
>         
>           - vessel facts departed is true exactly when F is true
>           - priority directive priority is ORDINARY
>           - priority directive correlation is prior lifecycle view correlation
>   - priority directive decisionContext is lifecycle frame decisionContext.

### Requirements for BerthCommitment

#### Contract clauses evaluated in the initialization phase

May modify: berthState

##### `INITIAL_BERTH_SAFE` — Required behavior

> During contract evaluation for the initialization phase, BerthCommitment shall set berthState to AVAILABLE and prior berth state to AVAILABLE.

#### Contract clauses evaluated in the compute phase

May modify: berthState

##### `PRIOR_BERTH_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, BerthCommitment shall set prior berth state to the value of berthState on entry.

##### `BERTH_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if berth transition evidence eventKind is DOMINANT FAULT, BerthCommitment shall set berthState to UNKNOWN.

##### `BERTH_CLEAR_ANCHOR` — Conditional behavior

> During contract evaluation for the compute phase, if berth transition evidence eventKind is VERIFIED CLEAR ANCHOR, BerthCommitment shall set berthState to AVAILABLE.

##### `BERTH_DOCKED_ANCHOR` — Conditional behavior

> During contract evaluation for the compute phase, if berth transition evidence eventKind is VERIFIED DOCKED ANCHOR, BerthCommitment shall set berthState to SECURED.

##### `BERTH_CLEARANCE` — Conditional behavior

> During contract evaluation for the compute phase, if berth transition evidence eventKind is STATION CLEARANCE, berth transition evidence qualified is true, and the value of berthState on entry is AVAILABLE, BerthCommitment shall set berthState to RESERVED.

##### `BERTH_SECURED` — Conditional behavior

> During contract evaluation for the compute phase, case BERTH SECURED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - berth transition evidence eventKind is STATION SECURED
>   - berth transition evidence qualified is true
>   - At least one of the following conditions holds:
>     
>       - the value of berthState on entry is RESERVED
>       - the value of berthState on entry is SECURED.

> When all applicability conditions are met, BerthCommitment shall produce a result for which all of the following conditions hold:
>
> berthState is SECURED.

##### `BERTH_RELEASED` — Conditional behavior

> During contract evaluation for the compute phase, if berth transition evidence eventKind is STATION RELEASED, berth transition evidence qualified is true, and the value of berthState on entry is SECURED, BerthCommitment shall set berthState to RELEASED.

##### `BERTH_DEPARTED` — Conditional behavior

> During contract evaluation for the compute phase, if berth transition evidence eventKind is DEPARTURE COMPLETION, berth transition evidence qualified is true, and the value of berthState on entry is RELEASED, BerthCommitment shall set berthState to AVAILABLE.

##### `BERTH_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, case BERTH RETAIN applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - berth transition evidence eventKind is NO EVENT
>   - berth transition evidence qualified is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - berth transition evidence eventKind is STATION CLEARANCE
>       - the value of berthState on entry is not AVAILABLE
>   - All of the following conditions hold:
>     
>       - berth transition evidence eventKind is STATION SECURED
>       - the value of berthState on entry is not RESERVED
>       - the value of berthState on entry is not SECURED
>   - All of the following conditions hold:
>     
>       - berth transition evidence eventKind is STATION RELEASED
>       - the value of berthState on entry is not SECURED
>   - All of the following conditions hold:
>     
>       - berth transition evidence eventKind is DEPARTURE COMPLETION
>       - the value of berthState on entry is not RELEASED
>   - berth transition evidence eventKind is STATION AVAILABLE.

> When all applicability conditions are met, BerthCommitment shall produce a result for which all of the following conditions hold:
>
> berthState is the value of berthState on entry.

### Requirements for DockingActionArbitration

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DECISION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, DockingActionArbitration shall set docking decision proposedAction to HOLD, docking decision cause to NO ELIGIBLE ACTION, docking decision correlation to NONE, and docking decision decisionContext to CLEAR.

#### Contract clauses evaluated in the compute phase

##### `SELECT_REVOCATION` — Conditional behavior

> During contract evaluation for the compute phase, if priority directive priority is REVOKE, DockingActionArbitration shall set docking decision proposedAction to REVOKE SERVICE ACCESS, docking decision cause to FAULT OR RECOVERY, docking decision correlation to NONE, and docking decision decisionContext to QUARANTINED.

##### `SELECT_DEPARTURE_COMPLETION` — Conditional behavior

> During contract evaluation for the compute phase, if priority directive priority is DEPARTURE COMPLETE, DockingActionArbitration shall set docking decision proposedAction to HOLD, docking decision cause to DEPARTURE CONFIRMATION, docking decision correlation to priority directive correlation, and docking decision decisionContext to CLEAR.

##### `SELECT_ACCESS_CLOSURE` — Conditional behavior

> During contract evaluation for the compute phase, if priority directive priority is ORDINARY, access proposal applicable is true, and access proposal proposedAction is CLOSE SERVICE ACCESS, DockingActionArbitration shall set docking decision proposedAction to access proposal proposedAction, docking decision cause to access proposal cause, docking decision correlation to access proposal correlation, and docking decision decisionContext to access proposal decisionContext.

##### `SELECT_UNDOCK_ACTION` — Conditional behavior

> During contract evaluation for the compute phase, case SELECT UNDOCK ACTION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - priority directive priority is ORDINARY
>   - At least one of the following conditions holds:
>     
>       - access proposal applicable is true exactly when F is true
>       - access proposal proposedAction is not CLOSE SERVICE ACCESS
>   - undocking proposal applicable is true.

> When all applicability conditions are met, DockingActionArbitration shall produce a result for which all of the following conditions hold:
>
> docking decision proposedAction is undocking proposal proposedAction, docking decision cause is undocking proposal cause, docking decision correlation is undocking proposal correlation, and docking decision decisionContext is undocking proposal decisionContext.

##### `SELECT_DOCK_APPROACH` — Conditional behavior

> During contract evaluation for the compute phase, case SELECT DOCK APPROACH applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - priority directive priority is ORDINARY
>   - At least one of the following conditions holds:
>     
>       - access proposal applicable is true exactly when F is true
>       - access proposal proposedAction is not CLOSE SERVICE ACCESS
>   - undocking proposal applicable is true exactly when F is true
>   - docking proposal applicable is true
>   - docking proposal proposedAction is AUTHORIZE DOCK APPROACH.

> When all applicability conditions are met, DockingActionArbitration shall produce a result for which all of the following conditions hold:
>
> docking decision proposedAction is docking proposal proposedAction, docking decision cause is docking proposal cause, docking decision correlation is docking proposal correlation, and docking decision decisionContext is docking proposal decisionContext.

##### `SELECT_ACCESS_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, case SELECT ACCESS OPEN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - priority directive priority is ORDINARY
>   - At least one of the following conditions holds:
>     
>       - access proposal applicable is true exactly when F is true
>       - access proposal proposedAction is not CLOSE SERVICE ACCESS
>   - undocking proposal applicable is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - docking proposal applicable is true exactly when F is true
>       - docking proposal proposedAction is not AUTHORIZE DOCK APPROACH
>   - access proposal applicable is true
>   - access proposal proposedAction is OPEN SERVICE ACCESS.

> When all applicability conditions are met, DockingActionArbitration shall produce a result for which all of the following conditions hold:
>
> docking decision proposedAction is access proposal proposedAction, docking decision cause is access proposal cause, docking decision correlation is access proposal correlation, and docking decision decisionContext is access proposal decisionContext.

##### `SELECT_DOCK_CLEARANCE` — Conditional behavior

> During contract evaluation for the compute phase, case SELECT DOCK CLEARANCE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - priority directive priority is ORDINARY
>   - undocking proposal applicable is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - access proposal applicable is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - access proposal proposedAction is not CLOSE SERVICE ACCESS
>           - access proposal proposedAction is not OPEN SERVICE ACCESS
>   - docking proposal applicable is true
>   - docking proposal proposedAction is REQUEST DOCK CLEARANCE.

> When all applicability conditions are met, DockingActionArbitration shall produce a result for which all of the following conditions hold:
>
> docking decision proposedAction is docking proposal proposedAction, docking decision cause is docking proposal cause, docking decision correlation is docking proposal correlation, and docking decision decisionContext is docking proposal decisionContext.

##### `SELECT_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if priority directive priority is ORDINARY, docking proposal applicable is true exactly when F is true, access proposal applicable is true exactly when F is true, and undocking proposal applicable is true exactly when F is true, DockingActionArbitration shall set docking decision proposedAction to HOLD, docking decision cause to NO ELIGIBLE ACTION, docking decision correlation to priority directive correlation, and docking decision decisionContext to priority directive decisionContext.

### Requirements for DockingActionEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DOCKING_PROPOSAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, DockingActionEligibility shall set docking proposal applicable to true exactly when F is true, docking proposal proposedAction to HOLD, docking proposal cause to NO ELIGIBLE ACTION, docking proposal correlation to NONE, and docking proposal decisionContext to CLEAR.

#### Contract clauses evaluated in the compute phase

##### `PROPOSE_DOCK_CLEARANCE` — Conditional behavior

> During contract evaluation for the compute phase, if admission decision accepted is true and admission decision operation is DOCK, DockingActionEligibility shall produce a result for which docking proposal applicable is true, docking proposal proposedAction is REQUEST DOCK CLEARANCE, docking proposal cause is NEW DOCK REQUEST, docking proposal correlation is admission decision correlation, and docking proposal decisionContext is DOCKING.

##### `PROPOSE_DOCK_APPROACH` — Conditional behavior

> During contract evaluation for the compute phase, case PROPOSE DOCK APPROACH applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - admission decision accepted is true exactly when F is true
>       - admission decision operation is not DOCK
>   - docking frame qualified is true
>   - docking frame directive is CLEARANCE.

> When all applicability conditions are met, DockingActionEligibility shall produce a result for which all of the following conditions hold:
>
> docking proposal applicable is true, docking proposal proposedAction is AUTHORIZE DOCK APPROACH, docking proposal cause is DOCKING PROGRESS, docking proposal correlation is docking frame correlation, and docking proposal decisionContext is DOCKING.

##### `NO_DOCKING_PROPOSAL` — Conditional behavior

> During contract evaluation for the compute phase, case NO DOCKING PROPOSAL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - admission decision accepted is true exactly when F is true
>       - admission decision operation is not DOCK
>   - At least one of the following conditions holds:
>     
>       - docking frame qualified is true exactly when F is true
>       - docking frame directive is not CLEARANCE.

> When all applicability conditions are met, DockingActionEligibility shall produce a result for which all of the following conditions hold:
>
> docking proposal applicable is true exactly when F is true, docking proposal proposedAction is HOLD, docking proposal cause is NO ELIGIBLE ACTION, docking proposal correlation is docking frame correlation, and docking proposal decisionContext is docking frame decisionContext.

### Requirements for DockingLifecycle

#### Contract clauses evaluated in the initialization phase

May modify: lifecycleState

##### `INITIAL_LIFECYCLE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, DockingLifecycle shall set lifecycleState to CLEAR IDLE, prior lifecycle view lifecycle to CLEAR IDLE, and prior lifecycle view correlation to NONE.

#### Contract clauses evaluated in the compute phase

May modify: lifecycleState

##### `PRIOR_LIFECYCLE_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, DockingLifecycle shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - prior lifecycle view lifecycle is the value of lifecycleState on entry
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - the value of lifecycleState on entry is AWAIT CLEAR A
>               - the value of lifecycleState on entry is AWAIT DOCK A
>               - the value of lifecycleState on entry is AWAIT SECURE A
>               - the value of lifecycleState on entry is DOCKED CLOSED A
>               - the value of lifecycleState on entry is ACCESS OPEN A
>               - the value of lifecycleState on entry is AWAIT RELEASE A
>               - the value of lifecycleState on entry is AWAIT DEPART A
>           - prior lifecycle view correlation is A
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - the value of lifecycleState on entry is AWAIT CLEAR B
>               - the value of lifecycleState on entry is AWAIT DOCK B
>               - the value of lifecycleState on entry is AWAIT SECURE B
>               - the value of lifecycleState on entry is DOCKED CLOSED B
>               - the value of lifecycleState on entry is ACCESS OPEN B
>               - the value of lifecycleState on entry is AWAIT RELEASE B
>               - the value of lifecycleState on entry is AWAIT DEPART B
>           - prior lifecycle view correlation is B
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - the value of lifecycleState on entry is CLEAR IDLE
>               - the value of lifecycleState on entry is DOCKED REBASE
>               - the value of lifecycleState on entry is QUARANTINED
>           - prior lifecycle view correlation is NONE.

##### `LIFECYCLE_TRANSITION_PARTITION` — Required behavior

> During contract evaluation for the compute phase, DockingLifecycle shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     lifecycle frame directive is QUARANTINE
>     
>     **Then:**
>     
>     lifecycleState is QUARANTINED
>   - **If:**
>     
>     lifecycle frame directive is ANCHOR CLEAR
>     
>     **Then:**
>     
>     lifecycleState is CLEAR IDLE
>   - **If:**
>     
>     lifecycle frame directive is ANCHOR DOCKED
>     
>     **Then:**
>     
>     lifecycleState is DOCKED REBASE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - lifecycle frame directive is not QUARANTINE
>       - lifecycle frame directive is not ANCHOR CLEAR
>       - lifecycle frame directive is not ANCHOR DOCKED
>       - admission decision accepted is true
>       - admission decision operation is DOCK
>       - admission decision correlation is A
>     
>     **Then:**
>     
>     lifecycleState is AWAIT CLEAR A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - lifecycle frame directive is not QUARANTINE
>       - lifecycle frame directive is not ANCHOR CLEAR
>       - lifecycle frame directive is not ANCHOR DOCKED
>       - admission decision accepted is true
>       - admission decision operation is DOCK
>       - admission decision correlation is B
>     
>     **Then:**
>     
>     lifecycleState is AWAIT CLEAR B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true
>       - admission decision operation is ACCESS
>       - admission decision correlation is A
>     
>     **Then:**
>     
>     lifecycleState is ACCESS OPEN A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true
>       - admission decision operation is ACCESS
>       - admission decision correlation is B
>     
>     **Then:**
>     
>     lifecycleState is ACCESS OPEN B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true
>       - admission decision operation is UNDOCK
>       - admission decision correlation is A
>     
>     **Then:**
>     
>     lifecycleState is AWAIT RELEASE A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true
>       - admission decision operation is UNDOCK
>       - admission decision correlation is B
>     
>     **Then:**
>     
>     lifecycleState is AWAIT RELEASE B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true exactly when F is true
>       - lifecycle frame directive is CLEARANCE
>       - lifecycle frame correlation is A
>     
>     **Then:**
>     
>     lifecycleState is AWAIT DOCK A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true exactly when F is true
>       - lifecycle frame directive is CLEARANCE
>       - lifecycle frame correlation is B
>     
>     **Then:**
>     
>     lifecycleState is AWAIT DOCK B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true exactly when F is true
>       - lifecycle frame directive is DOCKED
>       - lifecycle frame correlation is A
>       - the value of lifecycleState on entry is AWAIT DOCK A
>     
>     **Then:**
>     
>     lifecycleState is AWAIT SECURE A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true exactly when F is true
>       - lifecycle frame directive is DOCKED
>       - lifecycle frame correlation is B
>       - the value of lifecycleState on entry is AWAIT DOCK B
>     
>     **Then:**
>     
>     lifecycleState is AWAIT SECURE B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true exactly when F is true
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - lifecycle frame directive is DOCKED
>               - the value of lifecycleState on entry is AWAIT SECURE A
>           - All of the following conditions hold:
>             
>               - lifecycle frame directive is SECURED
>               - At least one of the following conditions holds:
>                 
>                   - the value of lifecycleState on entry is AWAIT DOCK A
>                   - the value of lifecycleState on entry is AWAIT SECURE A
>       - lifecycle frame correlation is A
>       - lifecycle frame directive is not RETAIN
>     
>     **Then:**
>     
>     lifecycleState is DOCKED CLOSED A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - admission decision accepted is true exactly when F is true
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - lifecycle frame directive is DOCKED
>               - the value of lifecycleState on entry is AWAIT SECURE B
>           - All of the following conditions hold:
>             
>               - lifecycle frame directive is SECURED
>               - At least one of the following conditions holds:
>                 
>                   - the value of lifecycleState on entry is AWAIT DOCK B
>                   - the value of lifecycleState on entry is AWAIT SECURE B
>       - lifecycle frame correlation is B
>       - lifecycle frame directive is not RETAIN
>     
>     **Then:**
>     
>     lifecycleState is DOCKED CLOSED B
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - lifecycle frame directive is RELEASED
>       - lifecycle frame correlation is A
>     
>     **Then:**
>     
>     lifecycleState is AWAIT DEPART A
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - lifecycle frame directive is RELEASED
>       - lifecycle frame correlation is B
>     
>     **Then:**
>     
>     lifecycleState is AWAIT DEPART B
>   - **If:**
>     
>     lifecycle frame directive is DEPARTED
>     
>     **Then:**
>     
>     lifecycleState is CLEAR IDLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - lifecycle frame directive is RETAIN
>       - admission decision accepted is true exactly when F is true
>     
>     **Then:**
>     
>     lifecycleState is the value of lifecycleState on entry.

### Requirements for RecoverySupervisor

#### Contract clauses evaluated in the initialization phase

May modify: recoveryState

##### `INITIAL_RECOVERY_SAFE` — Required behavior

> During contract evaluation for the initialization phase, RecoverySupervisor shall set recoveryState to HEALTHY and prior recovery state to HEALTHY.

#### Contract clauses evaluated in the compute phase

May modify: recoveryState

##### `PRIOR_RECOVERY_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, RecoverySupervisor shall set prior recovery state to the value of recoveryState on entry.

##### `RECOVERY_LATCH` — Conditional behavior

> During contract evaluation for the compute phase, if recovery transition intent is LATCH, RecoverySupervisor shall set recoveryState to LATCHED.

##### `RECOVERY_RECONCILE` — Conditional behavior

> During contract evaluation for the compute phase, if recovery transition intent is RECONCILE, RecoverySupervisor shall set recoveryState to RECONCILING.

##### `RECOVERY_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, if recovery transition intent is OPEN CLEAR or recovery transition intent is OPEN DOCKED, RecoverySupervisor shall set recoveryState to HEALTHY.

##### `RECOVERY_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, if recovery transition intent is RETAIN, RecoverySupervisor shall preserve the value of recoveryState on entry.

### Requirements for RequestAdmission

#### Contract clauses evaluated in the initialization phase

May modify: requestLedger

##### `INITIAL_REQUEST_LEDGER` — Required behavior

> During contract evaluation for the initialization phase, RequestAdmission shall set requestLedger to NO HISTORY, lifecycle admission disposition to NO REQUEST, lifecycle admission operation to NONE, lifecycle admission correlation to NONE, lifecycle admission accepted to true exactly when F is true, lifecycle admission startsAuthorization to true exactly when F is true, gate admission disposition to lifecycle admission disposition, gate admission operation to lifecycle admission operation, gate admission correlation to lifecycle admission correlation, gate admission accepted to true exactly when lifecycle admission accepted is true, gate admission startsAuthorization to true exactly when lifecycle admission startsAuthorization is true, docking admission disposition to lifecycle admission disposition, docking admission operation to lifecycle admission operation, docking admission correlation to lifecycle admission correlation, docking admission accepted to true exactly when lifecycle admission accepted is true, docking admission startsAuthorization to true exactly when lifecycle admission startsAuthorization is true, access admission disposition to lifecycle admission disposition, access admission operation to lifecycle admission operation, access admission correlation to lifecycle admission correlation, access admission accepted to true exactly when lifecycle admission accepted is true, access admission startsAuthorization to true exactly when lifecycle admission startsAuthorization is true, undocking admission disposition to lifecycle admission disposition, undocking admission operation to lifecycle admission operation, undocking admission correlation to lifecycle admission correlation, undocking admission accepted to true exactly when lifecycle admission accepted is true, undocking admission startsAuthorization to true exactly when lifecycle admission startsAuthorization is true, and request disposition to lifecycle admission disposition.

#### Contract clauses evaluated in the compute phase

May modify: requestLedger

##### `ADMISSION_DECISION_DELIVERY` — Required behavior

> During contract evaluation for the compute phase, RequestAdmission shall set gate admission disposition to lifecycle admission disposition, gate admission operation to lifecycle admission operation, gate admission correlation to lifecycle admission correlation, gate admission accepted to true exactly when lifecycle admission accepted is true, gate admission startsAuthorization to true exactly when lifecycle admission startsAuthorization is true, docking admission disposition to lifecycle admission disposition, docking admission operation to lifecycle admission operation, docking admission correlation to lifecycle admission correlation, docking admission accepted to true exactly when lifecycle admission accepted is true, docking admission startsAuthorization to true exactly when lifecycle admission startsAuthorization is true, access admission disposition to lifecycle admission disposition, access admission operation to lifecycle admission operation, access admission correlation to lifecycle admission correlation, access admission accepted to true exactly when lifecycle admission accepted is true, access admission startsAuthorization to true exactly when lifecycle admission startsAuthorization is true, undocking admission disposition to lifecycle admission disposition, undocking admission operation to lifecycle admission operation, undocking admission correlation to lifecycle admission correlation, undocking admission accepted to true exactly when lifecycle admission accepted is true, undocking admission startsAuthorization to true exactly when lifecycle admission startsAuthorization is true, and request disposition to lifecycle admission disposition.

##### `NO_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if request facts present is true exactly when F is true, RequestAdmission shall set lifecycle admission disposition to NO REQUEST, set lifecycle admission operation to NONE, set lifecycle admission correlation to NONE, set lifecycle admission accepted to true exactly when F is true, set lifecycle admission startsAuthorization to true exactly when F is true, and preserve the value of requestLedger on entry.

##### `INVALID_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if request facts present is true and request facts usable is true exactly when F is true, RequestAdmission shall set lifecycle admission disposition to REJECTED, set lifecycle admission operation to NONE, set lifecycle admission correlation to NONE, set lifecycle admission accepted to true exactly when F is true, set lifecycle admission startsAuthorization to true exactly when F is true, and preserve the value of requestLedger on entry.

##### `FRESH_DOCK_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, case FRESH DOCK ACCEPTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts usable is true
>   - request facts operation is DOCK
>   - admission guard open is true
>   - admission guard lifecycle is CLEAR IDLE
>   - admission guard berthAvailable is true
>   - vessel readiness approachReady is true
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
> All of the following conditions hold:
>
>   - lifecycle admission disposition is ACCEPTED
>   - lifecycle admission operation is DOCK
>   - lifecycle admission correlation is request facts correlation
>   - lifecycle admission accepted is true
>   - lifecycle admission startsAuthorization is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request facts correlation is A
>           - requestLedger is A LAST
>       - All of the following conditions hold:
>         
>           - request facts correlation is B
>           - requestLedger is B LAST.

##### `DUPLICATE_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, case DUPLICATE DOCK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts usable is true
>   - request facts operation is DOCK
>   - admission guard open is true
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
> lifecycle admission disposition is DUPLICATE, lifecycle admission operation is NONE, lifecycle admission correlation is request facts correlation, lifecycle admission accepted is true exactly when F is true, lifecycle admission startsAuthorization is true exactly when F is true, and requestLedger is the value of requestLedger on entry.

##### `DOCK_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case DOCK NOT READY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts usable is true
>   - request facts operation is DOCK
>   - admission guard open is true
>   - admission guard lifecycle is CLEAR IDLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request facts correlation is A
>           - the value of requestLedger on entry is not A LAST
>       - All of the following conditions hold:
>         
>           - request facts correlation is B
>           - the value of requestLedger on entry is not B LAST
>   - At least one of the following conditions holds:
>     
>       - vessel readiness approachReady is true exactly when F is true
>       - admission guard berthAvailable is true exactly when F is true.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> lifecycle admission disposition is REJECTED, lifecycle admission operation is NONE, lifecycle admission correlation is request facts correlation, lifecycle admission accepted is true exactly when F is true, lifecycle admission startsAuthorization is true exactly when F is true, and requestLedger is the value of requestLedger on entry.

##### `DOCK_DEFERRED` — Conditional behavior

> During contract evaluation for the compute phase, case DOCK DEFERRED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts usable is true
>   - request facts operation is DOCK
>   - At least one of the following conditions holds:
>     
>       - admission guard open is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - admission guard lifecycle is not CLEAR IDLE
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
> lifecycle admission disposition is DEFERRED, lifecycle admission operation is NONE, lifecycle admission correlation is request facts correlation, lifecycle admission accepted is true exactly when F is true, lifecycle admission startsAuthorization is true exactly when F is true, and requestLedger is the value of requestLedger on entry.

##### `ACCESS_PARTITION` — Conditional behavior

> During contract evaluation for the compute phase, case ACCESS PARTITION applies under all of the following conditions:
>
> request facts usable is true and request facts operation is ACCESS.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - admission guard open is true
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is DOCKED CLOSED A
>               - request facts correlation is A
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is DOCKED CLOSED B
>               - request facts correlation is B
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is DOCKED REBASE
>               - At least one of the following conditions holds:
>                 
>                   - All of the following conditions hold:
>                     
>                       - request facts correlation is A
>                       - the value of requestLedger on entry is not A LAST
>                   - All of the following conditions hold:
>                     
>                       - request facts correlation is B
>                       - the value of requestLedger on entry is not B LAST
>       - service readiness quiescent is true
>       - lifecycle admission disposition is ACCEPTED
>       - lifecycle admission operation is ACCESS
>       - lifecycle admission correlation is request facts correlation
>       - lifecycle admission accepted is true
>       - The first condition holds exactly when the second condition holds:
>         
>         **First condition:**
>         
>         lifecycle admission startsAuthorization is true
>         
>         **Second condition:**
>         
>         admission guard lifecycle is DOCKED REBASE
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is DOCKED REBASE
>               - request facts correlation is A
>               - requestLedger is A LAST
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is DOCKED REBASE
>               - request facts correlation is B
>               - requestLedger is B LAST
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is not DOCKED REBASE
>               - requestLedger is the value of requestLedger on entry
>   - All of the following conditions hold:
>     
>       - admission guard open is true exactly when F is true
>       - lifecycle admission disposition is DEFERRED
>       - lifecycle admission operation is NONE
>       - lifecycle admission correlation is request facts correlation
>       - lifecycle admission accepted is true exactly when F is true
>       - lifecycle admission startsAuthorization is true exactly when F is true
>       - requestLedger is the value of requestLedger on entry
>   - All of the following conditions hold:
>     
>       - admission guard open is true
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - At least one of the following conditions holds:
>                 
>                   - admission guard lifecycle is not DOCKED CLOSED A
>                   - request facts correlation is not A
>               - At least one of the following conditions holds:
>                 
>                   - admission guard lifecycle is not DOCKED CLOSED B
>                   - request facts correlation is not B
>               - admission guard lifecycle is not DOCKED REBASE
>           - service readiness quiescent is true exactly when F is true
>       - lifecycle admission disposition is REJECTED
>       - lifecycle admission operation is NONE
>       - lifecycle admission correlation is request facts correlation
>       - lifecycle admission accepted is true exactly when F is true
>       - lifecycle admission startsAuthorization is true exactly when F is true
>       - requestLedger is the value of requestLedger on entry.

##### `UNDOCK_PARTITION` — Conditional behavior

> During contract evaluation for the compute phase, case UNDOCK PARTITION applies under all of the following conditions:
>
> request facts usable is true and request facts operation is UNDOCK.

> When all applicability conditions are met, RequestAdmission shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - admission guard open is true
>       - service readiness quiescent is true
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is ACCESS OPEN A
>               - request facts correlation is A
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is ACCESS OPEN B
>               - request facts correlation is B
>       - lifecycle admission disposition is ACCEPTED
>       - lifecycle admission operation is UNDOCK
>       - lifecycle admission correlation is request facts correlation
>       - lifecycle admission accepted is true
>       - lifecycle admission startsAuthorization is true exactly when F is true
>       - requestLedger is the value of requestLedger on entry
>   - admission guard open is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - service readiness active is true
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is ACCESS OPEN A
>               - request facts correlation is A
>           - All of the following conditions hold:
>             
>               - admission guard lifecycle is ACCESS OPEN B
>               - request facts correlation is B
>       - lifecycle admission disposition is DEFERRED
>       - lifecycle admission operation is NONE
>       - lifecycle admission correlation is request facts correlation
>       - lifecycle admission accepted is true exactly when F is true
>       - lifecycle admission startsAuthorization is true exactly when F is true
>       - requestLedger is the value of requestLedger on entry
>   - All of the following conditions hold:
>     
>       - admission guard open is true
>       - service readiness active is true exactly when F is true
>       - At least one of the following conditions holds:
>         
>           - admission guard lifecycle is not ACCESS OPEN A
>           - request facts correlation is not A
>       - At least one of the following conditions holds:
>         
>           - admission guard lifecycle is not ACCESS OPEN B
>           - request facts correlation is not B
>       - lifecycle admission disposition is REJECTED
>       - lifecycle admission operation is NONE
>       - lifecycle admission correlation is request facts correlation
>       - lifecycle admission accepted is true exactly when F is true
>       - lifecycle admission startsAuthorization is true exactly when F is true
>       - requestLedger is the value of requestLedger on entry.

### Requirements for RequestClassification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REQUEST_FACTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, RequestClassification shall produce a result for which request facts present is true exactly when F is true, request facts usable is true, request facts operation is NONE, request facts correlation is NONE, and request facts startsAuthorization is true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `REQUEST_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if access request is NONE, RequestClassification shall produce a result for which request facts present is true exactly when F is true, request facts usable is true, request facts operation is NONE, request facts correlation is NONE, and request facts startsAuthorization is true exactly when F is true.

##### `REQUEST_USABLE` — Conditional behavior

> During contract evaluation for the compute phase, case REQUEST USABLE applies under all of the following conditions:
>
> access request is not NONE and access request is not INVALID.

> When all applicability conditions are met, RequestClassification shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - request facts present is true
>   - request facts usable is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - access request is DOCK A
>               - access request is DOCK B
>           - request facts operation is DOCK
>           - request facts startsAuthorization is true
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - access request is ACCESS A
>               - access request is ACCESS B
>           - request facts operation is ACCESS
>           - request facts startsAuthorization is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - access request is UNDOCK A
>               - access request is UNDOCK B
>           - request facts operation is UNDOCK
>           - request facts startsAuthorization is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - access request is DOCK A
>               - access request is ACCESS A
>               - access request is UNDOCK A
>           - request facts correlation is A
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - access request is DOCK B
>               - access request is ACCESS B
>               - access request is UNDOCK B
>           - request facts correlation is B.

##### `REQUEST_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if access request is INVALID, RequestClassification shall produce a result for which request facts present is true, request facts usable is true exactly when F is true, request facts operation is NONE, request facts correlation is NONE, and request facts startsAuthorization is true exactly when F is true.

### Requirements for ResultComposition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RESULT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ResultComposition shall set docking access result proposedAction to HOLD, docking access result cause to NO ELIGIBLE ACTION, docking access result mode to HOLDING, docking access result correlation to NONE, docking access result disposition to NO REQUEST, docking access result status to CLOSED, and docking access result outcome to NONE.

#### Contract clauses evaluated in the compute phase

##### `RESULT_OWNER_FIELDS` — Required behavior

> During contract evaluation for the compute phase, ResultComposition shall set docking access result proposedAction to docking decision proposedAction, docking access result cause to docking decision cause, docking access result correlation to docking decision correlation, and docking access result disposition to request disposition.

##### `COMPOSE_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision cause is FAULT OR RECOVERY or docking decision proposedAction is REVOKE SERVICE ACCESS, ResultComposition shall set docking access result mode to QUARANTINED, docking access result status to REVOKED, and docking access result outcome to RECOVERY REQUIRED.

##### `COMPOSE_DEPARTURE_COMPLETE` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision cause is DEPARTURE CONFIRMATION, ResultComposition shall set docking access result mode to HOLDING, docking access result status to CLOSED, and docking access result outcome to DEPARTURE COMPLETE.

##### `COMPOSE_DOCKING` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is REQUEST DOCK CLEARANCE or docking decision proposedAction is AUTHORIZE DOCK APPROACH, ResultComposition shall set docking access result mode to DOCKING, docking access result status to CLOSED, and docking access result outcome to DOCKING ACTIVE.

##### `COMPOSE_ACCESS_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is OPEN SERVICE ACCESS, ResultComposition shall set docking access result mode to ACCESSIBLE, docking access result status to OPEN, and docking access result outcome to ACCESS ACTIVE.

##### `COMPOSE_UNDOCKING` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is CLOSE SERVICE ACCESS, docking decision proposedAction is REQUEST UNDOCK RELEASE, or docking decision proposedAction is AUTHORIZE UNDOCK, ResultComposition shall set docking access result mode to UNDOCKING, docking access result status to CLOSED, and docking access result outcome to UNDOCKING ACTIVE.

##### `COMPOSE_HOLD_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is HOLD, docking decision cause is not DEPARTURE CONFIRMATION, and docking decision decisionContext is CLEAR, ResultComposition shall set docking access result mode to HOLDING, docking access result status to CLOSED, and docking access result outcome to NONE.

##### `COMPOSE_HOLD_DOCKING` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is HOLD and docking decision decisionContext is DOCKING, ResultComposition shall set docking access result mode to DOCKING, docking access result status to CLOSED, and docking access result outcome to DOCKING ACTIVE.

##### `COMPOSE_HOLD_DOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is HOLD and docking decision decisionContext is DOCKED CLOSED, ResultComposition shall set docking access result mode to HOLDING, docking access result status to CLOSED, and docking access result outcome to DOCKED ACCESS READY.

##### `COMPOSE_HOLD_ACCESS` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is HOLD and docking decision decisionContext is ACCESS OPEN, ResultComposition shall set docking access result mode to ACCESSIBLE, docking access result status to OPEN, and docking access result outcome to ACCESS ACTIVE.

##### `COMPOSE_HOLD_UNDOCKING` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is HOLD and docking decision decisionContext is UNDOCKING, ResultComposition shall set docking access result mode to UNDOCKING, docking access result status to CLOSED, and docking access result outcome to UNDOCKING ACTIVE.

##### `COMPOSE_HOLD_QUARANTINED` — Conditional behavior

> During contract evaluation for the compute phase, if docking decision proposedAction is HOLD and docking decision decisionContext is QUARANTINED, ResultComposition shall set docking access result mode to QUARANTINED, docking access result status to REVOKED, and docking access result outcome to RECOVERY REQUIRED.

### Requirements for ServiceAccessGate

#### Contract clauses evaluated in the initialization phase

May modify: gateState

##### `INITIAL_GATE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ServiceAccessGate shall set gateState to CLOSED and prior gate state to CLOSED.

#### Contract clauses evaluated in the compute phase

May modify: gateState

##### `PRIOR_GATE_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, ServiceAccessGate shall set prior gate state to the value of gateState on entry.

##### `GATE_FORCED_CLOSE` — Conditional behavior

> During contract evaluation for the compute phase, if gate safety frame directive is FORCE CLOSE, ServiceAccessGate shall set gateState to CLOSED.

##### `GATE_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, if gate safety frame directive is not FORCE CLOSE, admission decision accepted is true, admission decision operation is ACCESS, and gate safety frame safeToOpen is true, ServiceAccessGate shall set gateState to OPEN.

##### `GATE_ORDERED_CLOSE` — Conditional behavior

> During contract evaluation for the compute phase, if gate safety frame directive is not FORCE CLOSE, admission decision accepted is true, and admission decision operation is UNDOCK, ServiceAccessGate shall set gateState to CLOSED.

##### `GATE_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, case GATE RETAIN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - gate safety frame directive is not FORCE CLOSE
>   - At least one of the following conditions holds:
>     
>       - admission decision accepted is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - admission decision operation is not ACCESS
>           - admission decision operation is not UNDOCK
>       - All of the following conditions hold:
>         
>           - admission decision operation is ACCESS
>           - gate safety frame safeToOpen is true exactly when F is true.

> When all applicability conditions are met, ServiceAccessGate shall produce a result for which all of the following conditions hold:
>
> gateState is the value of gateState on entry.

### Requirements for ServiceActivityAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SERVICE_FACTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ServiceActivityAssessment shall set service readiness usable to true exactly when F is true, service readiness serviceClass to INVALID, service readiness quiescent to true exactly when F is true, service readiness active to true exactly when F is true, service readiness requestPermitted to true exactly when F is true, service facts usable to true exactly when service readiness usable is true, service facts serviceClass to service readiness serviceClass, service facts quiescent to true exactly when service readiness quiescent is true, service facts active to true exactly when service readiness active is true, and service facts requestPermitted to true exactly when service readiness requestPermitted is true.

#### Contract clauses evaluated in the compute phase

##### `SERVICE_FACT_DELIVERY` — Required behavior

> During contract evaluation for the compute phase, ServiceActivityAssessment shall set service facts usable to true exactly when service readiness usable is true, service facts serviceClass to service readiness serviceClass, service facts quiescent to true exactly when service readiness quiescent is true, service facts active to true exactly when service readiness active is true, and service facts requestPermitted to true exactly when service readiness requestPermitted is true.

##### `SERVICE_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if service activity is INVALID, ServiceActivityAssessment shall set service readiness usable to true exactly when F is true, service readiness serviceClass to INVALID, service readiness quiescent to true exactly when F is true, service readiness active to true exactly when F is true, and service readiness requestPermitted to true exactly when F is true.

##### `SERVICE_QUIESCENT` — Conditional behavior

> During contract evaluation for the compute phase, if service activity is QUIESCENT, ServiceActivityAssessment shall produce a result for which service readiness usable is true, service readiness serviceClass is QUIESCENT, service readiness quiescent is true, service readiness active is true exactly when F is true, and service readiness requestPermitted is true.

##### `SERVICE_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if service activity is ACTIVE, ServiceActivityAssessment shall produce a result for which service readiness usable is true, service readiness serviceClass is ACTIVE, service readiness quiescent is true exactly when F is true, service readiness active is true, and service readiness requestPermitted is true exactly when F is true.

### Requirements for StationReportAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_STATION_FACTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, StationReportAssessment shall produce a result for which station facts present is true exactly when F is true, station facts usable is true, station facts progress is NONE, station facts available is true exactly when F is true, station facts denied is true exactly when F is true, and station facts correlation is NONE.

#### Contract clauses evaluated in the compute phase

##### `STATION_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if station report is NONE, StationReportAssessment shall produce a result for which station facts present is true exactly when F is true, station facts usable is true, station facts progress is NONE, station facts available is true exactly when F is true, station facts denied is true exactly when F is true, and station facts correlation is NONE.

##### `STATION_AVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if station report is AVAILABLE, StationReportAssessment shall produce a result for which station facts present is true, station facts usable is true, station facts progress is AVAILABLE, station facts available is true, station facts denied is true exactly when F is true, and station facts correlation is NONE.

##### `STATION_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, case STATION PROGRESS applies under all of the following conditions:
>
> station report is CLEAR A, station report is CLEAR B, station report is SECURED A, station report is SECURED B, station report is RELEASED A, or station report is RELEASED B.

> When all applicability conditions are met, StationReportAssessment shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - station facts present is true
>   - station facts usable is true
>   - station facts available is true exactly when F is true
>   - station facts denied is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - station report is CLEAR A
>               - station report is CLEAR B
>           - station facts progress is CLEAR
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - station report is SECURED A
>               - station report is SECURED B
>           - station facts progress is SECURED
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - station report is RELEASED A
>               - station report is RELEASED B
>           - station facts progress is RELEASED
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - station report is CLEAR A
>               - station report is SECURED A
>               - station report is RELEASED A
>           - station facts correlation is A
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - station report is CLEAR B
>               - station report is SECURED B
>               - station report is RELEASED B
>           - station facts correlation is B.

##### `STATION_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case STATION FAULT applies under all of the following conditions:
>
> station report is INVALID or station report is DENIED.

> When all applicability conditions are met, StationReportAssessment shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - station facts present is true
>   - station facts usable is true exactly when F is true
>   - station facts available is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - station report is INVALID
>           - station facts progress is INVALID
>           - station facts denied is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - station report is DENIED
>           - station facts progress is DENIED
>           - station facts denied is true
>   - station facts correlation is NONE.

### Requirements for UndockingActionEligibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_UNDOCKING_PROPOSAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, UndockingActionEligibility shall set undocking proposal applicable to true exactly when F is true, undocking proposal proposedAction to HOLD, undocking proposal cause to NO ELIGIBLE ACTION, undocking proposal correlation to NONE, and undocking proposal decisionContext to CLEAR.

#### Contract clauses evaluated in the compute phase

##### `PROPOSE_RELEASE_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if undocking frame qualified is true and undocking frame directive is RETAIN, UndockingActionEligibility shall produce a result for which undocking proposal applicable is true, undocking proposal proposedAction is REQUEST UNDOCK RELEASE, undocking proposal cause is UNDOCK SEQUENCE, undocking proposal correlation is undocking frame correlation, and undocking proposal decisionContext is UNDOCKING.

##### `PROPOSE_UNDOCK_AUTHORIZATION` — Conditional behavior

> During contract evaluation for the compute phase, if undocking frame qualified is true and undocking frame directive is RELEASED, UndockingActionEligibility shall produce a result for which undocking proposal applicable is true, undocking proposal proposedAction is AUTHORIZE UNDOCK, undocking proposal cause is UNDOCK SEQUENCE, undocking proposal correlation is undocking frame correlation, and undocking proposal decisionContext is UNDOCKING.

##### `NO_UNDOCKING_PROPOSAL` — Conditional behavior

> During contract evaluation for the compute phase, case NO UNDOCKING PROPOSAL applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - undocking frame qualified is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - undocking frame directive is not RETAIN
>       - undocking frame directive is not RELEASED.

> When all applicability conditions are met, UndockingActionEligibility shall produce a result for which all of the following conditions hold:
>
> undocking proposal applicable is true exactly when F is true, undocking proposal proposedAction is HOLD, undocking proposal cause is NO ELIGIBLE ACTION, undocking proposal correlation is undocking frame correlation, and undocking proposal decisionContext is undocking frame decisionContext.

### Requirements for VesselStatusAssessment

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_VESSEL_FACTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, VesselStatusAssessment shall set vessel readiness usable to true exactly when F is true, vessel readiness lifecycleClass to INVALID, vessel readiness approachReady to true exactly when F is true, vessel readiness docked to true exactly when F is true, vessel readiness departed to true exactly when F is true, vessel readiness correlation to NONE, vessel facts usable to true exactly when vessel readiness usable is true, vessel facts lifecycleClass to vessel readiness lifecycleClass, vessel facts approachReady to true exactly when vessel readiness approachReady is true, vessel facts docked to true exactly when vessel readiness docked is true, vessel facts departed to true exactly when vessel readiness departed is true, and vessel facts correlation to vessel readiness correlation.

#### Contract clauses evaluated in the compute phase

##### `VESSEL_FACT_DELIVERY` — Required behavior

> During contract evaluation for the compute phase, VesselStatusAssessment shall set vessel facts usable to true exactly when vessel readiness usable is true, vessel facts lifecycleClass to vessel readiness lifecycleClass, vessel facts approachReady to true exactly when vessel readiness approachReady is true, vessel facts docked to true exactly when vessel readiness docked is true, vessel facts departed to true exactly when vessel readiness departed is true, and vessel facts correlation to vessel readiness correlation.

##### `VESSEL_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if vessel status is INVALID, VesselStatusAssessment shall set vessel readiness usable to true exactly when F is true, vessel readiness lifecycleClass to INVALID, vessel readiness approachReady to true exactly when F is true, vessel readiness docked to true exactly when F is true, vessel readiness departed to true exactly when F is true, and vessel readiness correlation to NONE.

##### `VESSEL_UNTAGGED` — Conditional behavior

> During contract evaluation for the compute phase, case VESSEL UNTAGGED applies under all of the following conditions:
>
> vessel status is ON WARP or vessel status is IN GRID.

> When all applicability conditions are met, VesselStatusAssessment shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - vessel readiness usable is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - vessel status is ON WARP
>           - vessel readiness lifecycleClass is ON WARP
>           - vessel readiness approachReady is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - vessel status is IN GRID
>           - vessel readiness lifecycleClass is IN GRID
>           - vessel readiness approachReady is true
>   - vessel readiness docked is true exactly when F is true
>   - vessel readiness departed is true exactly when F is true
>   - vessel readiness correlation is NONE.

##### `VESSEL_TAGGED` — Conditional behavior

> During contract evaluation for the compute phase, case VESSEL TAGGED applies under all of the following conditions:
>
> vessel status is DOCKED A, vessel status is DOCKED B, vessel status is DEPARTED A, or vessel status is DEPARTED B.

> When all applicability conditions are met, VesselStatusAssessment shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - vessel readiness usable is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - vessel status is DOCKED A
>               - vessel status is DOCKED B
>           - vessel readiness lifecycleClass is DOCKED
>           - vessel readiness docked is true
>           - vessel readiness departed is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - vessel status is DEPARTED A
>               - vessel status is DEPARTED B
>           - vessel readiness lifecycleClass is DEPARTED
>           - vessel readiness docked is true exactly when F is true
>           - vessel readiness departed is true
>   - vessel readiness approachReady is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - vessel status is DOCKED A
>               - vessel status is DEPARTED A
>           - vessel readiness correlation is A
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - vessel status is DOCKED B
>               - vessel status is DEPARTED B
>           - vessel readiness correlation is B.
