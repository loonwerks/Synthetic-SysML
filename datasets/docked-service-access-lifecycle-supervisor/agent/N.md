# Docked-Service Access Lifecycle Supervisor

## Selected system context

### Synopsis

NEED-01: A pilot and station need one bounded supervisory system that coordinates
logical docking and undocking clearance with mutually exclusive access to repair or
support-system resupply, prevents departure clearance while a docked service occupies
access, makes inconsistent observations visible, and requires explicit recovery before a
later docking cycle.

PURPOSE-01: The system will supervise the logical lifecycle from outside-station
readiness through docking clearance, docked-service access, undocking clearance, and
confirmed release; it does not actuate a physical docking mechanism, perform repair or
resupply, move cargo, verify cargo transfer, or prove that any reported physical
condition is true.

### Goals

GOAL-01: The supervisor shall issue a docking or undocking permit only when a fresh
corresponding pilot intent is compatible with the current lifecycle, qualified
berth-and-ship readiness, and quiescent docked-service access.

GOAL-02: The supervisor shall enable docked-service access only after docking has been
observed as secure and shall never enable repair and resupply access as concurrent
logical users.

GOAL-03: The supervisor shall block or defer undocking while a service is requested,
granted, active, or completing, with service completion taking priority over a
simultaneous fresh undock intent.

GOAL-04: The supervisor shall detect invalid or lifecycle-inconsistent boundary
combinations, latch recovery, lock service access, and withhold movement permits.

GOAL-05: The supervisor shall clear recovery only on a fresh reset with confirmed berth
release and quiescent services, and shall require a later distinct fresh dock intent to
start another lifecycle.

### Operational context and exact system boundary

CTX-01: Pilot is outside the system, supplies logical docking, undocking, and reset
intent, and receives the pilot-oriented lifecycle report.

CTX-02: StationBerthInterface is outside the system, supplies an abstract berth
observation, receives the station-oriented access report, and remains responsible for
physical berth and docking mechanisms.

CTX-03: FrigateStatusInterface is outside the system, supplies the frigate condition
used in readiness qualification, and remains responsible for the truth of ship condition
and any physical response.

CTX-04: RepairService is outside the system, supplies its logical access demand or
activity status, and performs any repair work.

CTX-05: ResupplyService is outside the system, supplies its logical access demand or
activity status, and performs any capacitor or support-system resupply.

CTX-06: DockingControlInterface is outside the system, receives supervisory movement
permits and service-access state, and is not assumed to obey or physically realize them.

MON-01: `pilotIntent` from CTX-01 has exact finite type `PilotIntent = {NONE,
FRESH_DOCK, REPEATED_DOCK, FRESH_UNDOCK, REPEATED_UNDOCK, FRESH_RESET, REPEATED_RESET,
INVALID}`; freshness and repetition are supplied boundary facts, not inferred timing.

MON-02: `berthObservation` from CTX-02 has exact finite type `BerthObservation =
{APPROACH_CLEAR, DOCKED_SECURE, DEPARTURE_CLEAR, RELEASED, BLOCKED, INVALID}`.

MON-03: `shipCondition` from CTX-03 has exact finite type `ShipCondition =
{APPROACH_READY, SERVICE_READY, DEPARTURE_READY, TRANSIT, NOT_READY, INVALID}`.

MON-04: `repairSignal` from CTX-04 has exact finite type `ServiceSignal = {QUIESCENT,
REQUEST, ACTIVE, COMPLETE, FAULT, INVALID}`.

MON-05: `resupplySignal` from CTX-05 has the same exact finite `ServiceSignal` type but
remains a distinct input because simultaneous repair and resupply use is an explicit
interlock concern.

CTRL-01: `movementDirective` to CTX-06 has exact finite type `MovementDirective = {HOLD,
PERMIT_DOCK, PERMIT_UNDOCK}` and is a supervisory permission, not an actuator-success
claim.

CTRL-02: `serviceAccess` to CTX-06 has exact finite type `ServiceAccess = {LOCKED,
ENABLED}` and expresses generic docked-service access rather than performing or
verifying a service.

CTRL-03: `pilotReport` to CTX-01 has exact finite type `PilotLifecycleReport =
{OUTSIDE_IDLE, DOCK_PERMITTED, DOCKED_READY, SERVICE_GRANTED, SERVICE_ACTIVE,
SERVICE_FINISHED, UNDOCK_DEFERRED, UNDOCK_PERMITTED, RELEASE_CONFIRMED, INHIBITED,
RECOVERY_REQUIRED, RESET_COMPLETE}`.

CTRL-04: `stationReport` to CTX-02 has exact finite type `StationAccessReport =
{NO_ACCESS, DOCK_EXPECTED, ACCESS_AVAILABLE, ACCESS_RESERVED, ACCESS_OCCUPIED,
DEPARTURE_EXPECTED, ACCESS_INHIBITED, RECOVERY_REQUIRED}`.

### Pilot assumptions and constraints

ASM-01: CTX-01 is responsible for labeling an intent fresh or repeated and shall not
relabel an unchanged intent as fresh; this assumption is needed because the finite
boundary has no clock, sequence number, or request identifier.

ASM-02: CTX-02 and CTX-03 are responsible for supplying one current berth observation
and one current ship condition for the same logical evaluation; the system qualifies
their combination but cannot establish physical truth.

ASM-03: CTX-04 and CTX-05 are responsible for reporting their current logical demand or
activity independently, and only one may validly be nonquiescent; simultaneous
nonquiescent reports are deliberately treated as conflict rather than assumed
impossible.

ASM-04: A `COMPLETE` service signal means only that the external service relinquishes
logical access; the supervisor neither verifies repair quality nor verifies resupply
adequacy.

ASM-05: Behavior advances in deterministic logical evaluations with one value for each
monitored quantity and one retained lifecycle pre-state; no wall-clock duration,
physical latency, or scheduler semantics are claimed.

ASM-06: The run supervises one frigate, one station berth context, and one
dock/service-access lifecycle at a time; concurrency across vessels, berths, or
overlapping lifecycles is excluded.

## Supporting contract definitions

### State `Docked_Service_Access_Lifecycle_Supervisor::LifecycleController::lifecycleMemory`

State `lifecycleMemory` has type `Docked_Service_Access_Lifecycle_Supervisor::LifecycleState`.

## Detailed behavioral requirements

### Requirements for DockReadinessQualifier

#### Contract clauses evaluated in the initialization phase

##### `READINESS_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, DockReadinessQualifier shall set monitorReadiness to READINESS FAULT and gateReadiness to READINESS FAULT.

#### Contract clauses evaluated in the compute phase

##### `READINESS_CONSUMER_AGREEMENT` — Required behavior

> During contract evaluation for the compute phase, DockReadinessQualifier shall set gateReadiness to monitorReadiness.

##### `READINESS_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if berthObservation is INVALID or shipCondition is INVALID, DockReadinessQualifier shall set monitorReadiness to READINESS FAULT.

##### `READINESS_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, if berthObservation is not INVALID, shipCondition is not INVALID, berthObservation is APPROACH CLEAR, and shipCondition is APPROACH READY, DockReadinessQualifier shall set monitorReadiness to DOCK READY.

##### `READINESS_SERVICE` — Conditional behavior

> During contract evaluation for the compute phase, if berthObservation is not INVALID, shipCondition is not INVALID, berthObservation is DOCKED SECURE, and shipCondition is SERVICE READY, DockReadinessQualifier shall set monitorReadiness to SERVICE READY.

##### `READINESS_UNDOCK` — Conditional behavior

> During contract evaluation for the compute phase, if berthObservation is not INVALID, shipCondition is not INVALID, berthObservation is DEPARTURE CLEAR, and shipCondition is DEPARTURE READY, DockReadinessQualifier shall set monitorReadiness to UNDOCK READY.

##### `READINESS_RELEASED` — Conditional behavior

> During contract evaluation for the compute phase, if berthObservation is not INVALID, shipCondition is not INVALID, berthObservation is RELEASED, and shipCondition is TRANSIT, DockReadinessQualifier shall set monitorReadiness to RELEASE CONFIRMED.

##### `READINESS_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, case READINESS BLOCKED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - berthObservation is not INVALID
>   - shipCondition is not INVALID
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - berthObservation is APPROACH CLEAR
>       - shipCondition is APPROACH READY
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - berthObservation is DOCKED SECURE
>       - shipCondition is SERVICE READY
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - berthObservation is DEPARTURE CLEAR
>       - shipCondition is DEPARTURE READY
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - berthObservation is RELEASED
>       - shipCondition is TRANSIT
>   - At least one of the following conditions holds:
>     
>       - berthObservation is BLOCKED
>       - shipCondition is NOT READY.

> When all applicability conditions are met, DockReadinessQualifier shall produce a result for which all of the following conditions hold:
>
> monitorReadiness is TEMPORARILY BLOCKED.

##### `READINESS_CONTRADICTION` — Conditional behavior

> During contract evaluation for the compute phase, if berthObservation is not INVALID, shipCondition is not INVALID, it is not the case that berthObservation is APPROACH CLEAR and shipCondition is APPROACH READY, it is not the case that berthObservation is DOCKED SECURE and shipCondition is SERVICE READY, it is not the case that berthObservation is DEPARTURE CLEAR and shipCondition is DEPARTURE READY, it is not the case that berthObservation is RELEASED and shipCondition is TRANSIT, berthObservation is not BLOCKED, and shipCondition is not NOT READY, DockReadinessQualifier shall set monitorReadiness to READINESS CONFLICT.

### Requirements for IntentQualifier

#### Contract clauses evaluated in the initialization phase

##### `INTENT_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, IntentQualifier shall set qualifiedIntent to NO ACTION.

#### Contract clauses evaluated in the compute phase

##### `INTENT_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if pilotIntent is INVALID, IntentQualifier shall set qualifiedIntent to INTENT FAULT.

##### `INTENT_FRESH_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, if pilotIntent is FRESH DOCK, IntentQualifier shall set qualifiedIntent to DOCK REQUEST.

##### `INTENT_FRESH_UNDOCK` — Conditional behavior

> During contract evaluation for the compute phase, if pilotIntent is FRESH UNDOCK, IntentQualifier shall set qualifiedIntent to UNDOCK REQUEST.

##### `INTENT_FRESH_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if pilotIntent is FRESH RESET, IntentQualifier shall set qualifiedIntent to RESET REQUEST.

##### `INTENT_NO_ACTION` — Conditional behavior

> During contract evaluation for the compute phase, if pilotIntent is NONE, pilotIntent is REPEATED DOCK, pilotIntent is REPEATED UNDOCK, or pilotIntent is REPEATED RESET, IntentQualifier shall set qualifiedIntent to NO ACTION.

### Requirements for LifecycleConsistencyMonitor

#### Contract clauses evaluated in the initialization phase

##### `ASSESSMENT_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, LifecycleConsistencyMonitor shall set operationalAssessment to ASSESSMENT FAULT.

#### Contract clauses evaluated in the compute phase

##### `ASSESSMENT_TOTAL_RELATION` — Required behavior

> During contract evaluation for the compute phase, LifecycleConsistencyMonitor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - dockReadiness is READINESS FAULT
>           - serviceInterlock is SERVICE FAULT
>       - operationalAssessment is ASSESSMENT FAULT
>   - All of the following conditions hold:
>     
>       - dockReadiness is not READINESS FAULT
>       - serviceInterlock is not SERVICE FAULT
>       - At least one of the following conditions holds:
>         
>           - dockReadiness is READINESS CONFLICT
>           - serviceInterlock is SERVICE CONFLICT
>       - operationalAssessment is ASSESSMENT CONFLICT
>   - All of the following conditions hold:
>     
>       - dockReadiness is not READINESS FAULT
>       - serviceInterlock is not SERVICE FAULT
>       - dockReadiness is not READINESS CONFLICT
>       - serviceInterlock is not SERVICE CONFLICT
>       - dockReadiness is TEMPORARILY BLOCKED
>       - operationalAssessment is TEMPORARILY BLOCKED
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is IDLE OUTSIDE
>       - dockReadiness is RELEASE CONFIRMED
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is OUTSIDE STABLE
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is IDLE OUTSIDE
>       - dockReadiness is DOCK READY
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is DOCK ELIGIBLE
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is DOCK CLEARANCE LATCHED
>       - dockReadiness is DOCK READY
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is DOCK WAITING
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is DOCK CLEARANCE LATCHED
>       - dockReadiness is SERVICE READY
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is DOCK CONFIRMED
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is DOCKED ACCESS LOCKED
>       - dockReadiness is SERVICE READY
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is DOCKED QUIESCENT
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is DOCKED ACCESS LOCKED
>       - dockReadiness is SERVICE READY
>       - serviceInterlock is SINGLE DEMAND
>       - operationalAssessment is SERVICE DEMAND READY
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is DOCKED ACCESS LOCKED
>       - dockReadiness is UNDOCK READY
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is UNDOCK ELIGIBLE
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE ACCESS GRANTED
>       - dockReadiness is SERVICE READY
>       - serviceInterlock is SINGLE DEMAND
>       - operationalAssessment is SERVICE GRANT PENDING
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE ACCESS GRANTED
>       - dockReadiness is SERVICE READY
>       - serviceInterlock is SINGLE ACTIVE
>       - operationalAssessment is SERVICE OCCUPIED
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE ACCESS GRANTED
>       - dockReadiness is SERVICE READY
>       - At least one of the following conditions holds:
>         
>           - serviceInterlock is QUIESCENT
>           - serviceInterlock is SINGLE COMPLETION
>       - operationalAssessment is SERVICE WITHDRAWN
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE IN PROGRESS
>       - dockReadiness is SERVICE READY
>       - serviceInterlock is SINGLE ACTIVE
>       - operationalAssessment is SERVICE OCCUPIED
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE IN PROGRESS
>       - dockReadiness is SERVICE READY
>       - serviceInterlock is SINGLE COMPLETION
>       - operationalAssessment is SERVICE RELEASED
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is UNDOCK CLEARANCE LATCHED
>       - dockReadiness is UNDOCK READY
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is UNDOCK WAITING
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is UNDOCK CLEARANCE LATCHED
>       - dockReadiness is RELEASE CONFIRMED
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is RELEASE CONFIRMED
>   - All of the following conditions hold:
>     
>       - lifecyclePrestate is RECOVERY REQUIRED
>       - dockReadiness is RELEASE CONFIRMED
>       - serviceInterlock is QUIESCENT
>       - operationalAssessment is RECOVERY CLEARABLE
>   - All of the following conditions hold:
>     
>       - dockReadiness is not READINESS FAULT
>       - serviceInterlock is not SERVICE FAULT
>       - dockReadiness is not READINESS CONFLICT
>       - serviceInterlock is not SERVICE CONFLICT
>       - dockReadiness is not TEMPORARILY BLOCKED
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is IDLE OUTSIDE
>           - dockReadiness is RELEASE CONFIRMED
>           - serviceInterlock is QUIESCENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is IDLE OUTSIDE
>           - dockReadiness is DOCK READY
>           - serviceInterlock is QUIESCENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is DOCK CLEARANCE LATCHED
>           - dockReadiness is DOCK READY
>           - serviceInterlock is QUIESCENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is DOCK CLEARANCE LATCHED
>           - dockReadiness is SERVICE READY
>           - serviceInterlock is QUIESCENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is DOCKED ACCESS LOCKED
>           - dockReadiness is SERVICE READY
>           - serviceInterlock is QUIESCENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is DOCKED ACCESS LOCKED
>           - dockReadiness is SERVICE READY
>           - serviceInterlock is SINGLE DEMAND
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is DOCKED ACCESS LOCKED
>           - dockReadiness is UNDOCK READY
>           - serviceInterlock is QUIESCENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is SERVICE ACCESS GRANTED
>           - dockReadiness is SERVICE READY
>           - At least one of the following conditions holds:
>             
>               - serviceInterlock is SINGLE DEMAND
>               - serviceInterlock is SINGLE ACTIVE
>               - serviceInterlock is QUIESCENT
>               - serviceInterlock is SINGLE COMPLETION
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is SERVICE IN PROGRESS
>           - dockReadiness is SERVICE READY
>           - At least one of the following conditions holds:
>             
>               - serviceInterlock is SINGLE ACTIVE
>               - serviceInterlock is SINGLE COMPLETION
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is UNDOCK CLEARANCE LATCHED
>           - At least one of the following conditions holds:
>             
>               - dockReadiness is UNDOCK READY
>               - dockReadiness is RELEASE CONFIRMED
>           - serviceInterlock is QUIESCENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - lifecyclePrestate is RECOVERY REQUIRED
>           - dockReadiness is RELEASE CONFIRMED
>           - serviceInterlock is QUIESCENT
>       - operationalAssessment is ASSESSMENT CONFLICT.

### Requirements for LifecycleController

#### Contract clauses evaluated in the initialization phase

May modify: lifecycleMemory

##### `LIFECYCLE_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, LifecycleController shall set lifecycleMemory to IDLE OUTSIDE, monitorPrestate to IDLE OUTSIDE, arbiterPrestate to IDLE OUTSIDE, controlProposal movement to HOLD MOVEMENT, controlProposal access to LOCK ACCESS, lifecycleSnapshot next state to IDLE OUTSIDE, and lifecycleSnapshot result to NONE.

#### Contract clauses evaluated in the compute phase

May modify: lifecycleMemory

##### `PRESTATE_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, LifecycleController shall set monitorPrestate to the value of lifecycleMemory on entry and arbiterPrestate to the value of lifecycleMemory on entry.

##### `SNAPSHOT_AND_PROPOSAL_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, LifecycleController shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is IDLE OUTSIDE
>           - lifecycleSnapshot next state is IDLE OUTSIDE
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is DOCK CLEARANCE LATCHED
>           - lifecycleSnapshot next state is DOCK CLEARANCE LATCHED
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is DOCKED ACCESS LOCKED
>           - lifecycleSnapshot next state is DOCKED ACCESS LOCKED
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is SERVICE ACCESS GRANTED
>           - lifecycleSnapshot next state is SERVICE ACCESS GRANTED
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is SERVICE IN PROGRESS
>           - lifecycleSnapshot next state is SERVICE IN PROGRESS
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is UNDOCK CLEARANCE LATCHED
>           - lifecycleSnapshot next state is UNDOCK CLEARANCE LATCHED
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is RECOVERY REQUIRED
>           - lifecycleSnapshot next state is RECOVERY REQUIRED
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is DOCK CLEARANCE LATCHED
>           - controlProposal movement is AUTHORIZE DOCK
>           - controlProposal access is LOCK ACCESS
>       - All of the following conditions hold:
>         
>           - lifecycleMemory is UNDOCK CLEARANCE LATCHED
>           - controlProposal movement is AUTHORIZE UNDOCK
>           - controlProposal access is LOCK ACCESS
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - lifecycleMemory is SERVICE ACCESS GRANTED
>               - lifecycleMemory is SERVICE IN PROGRESS
>           - controlProposal movement is HOLD MOVEMENT
>           - controlProposal access is ENABLE ACCESS
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - lifecycleMemory is IDLE OUTSIDE
>               - lifecycleMemory is DOCKED ACCESS LOCKED
>               - lifecycleMemory is RECOVERY REQUIRED
>           - controlProposal movement is HOLD MOVEMENT
>           - controlProposal access is LOCK ACCESS.

##### `APPLY_CASE_01` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is ENTER RECOVERY FAULT, LifecycleController shall set lifecycleMemory to RECOVERY REQUIRED and lifecycleSnapshot result to RECOVERY LATCHED.

##### `APPLY_CASE_02` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is ENTER RECOVERY CONFLICT, LifecycleController shall set lifecycleMemory to RECOVERY REQUIRED and lifecycleSnapshot result to RECOVERY LATCHED.

##### `APPLY_CASE_03` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is RESET RECOVERY, LifecycleController shall set lifecycleMemory to IDLE OUTSIDE and lifecycleSnapshot result to RESET COMPLETE.

##### `APPLY_CASE_04` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is HOLD RECOVERY, LifecycleController shall set lifecycleMemory to RECOVERY REQUIRED and lifecycleSnapshot result to RECOVERY LATCHED.

##### `APPLY_CASE_05` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is FINISH SERVICE DEFER UNDOCK, LifecycleController shall set lifecycleMemory to DOCKED ACCESS LOCKED and lifecycleSnapshot result to UNDOCK DEFERRED.

##### `APPLY_CASE_06` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is FINISH SERVICE, LifecycleController shall set lifecycleMemory to DOCKED ACCESS LOCKED and lifecycleSnapshot result to SERVICE FINISHED.

##### `APPLY_CASE_07` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is DEFER UNDOCK, LifecycleController shall set lifecycleMemory to SERVICE IN PROGRESS and lifecycleSnapshot result to UNDOCK DEFERRED.

##### `APPLY_CASE_08` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is HOLD ACTIVE SERVICE, LifecycleController shall set lifecycleMemory to SERVICE IN PROGRESS and lifecycleSnapshot result to NONE.

##### `APPLY_CASE_09` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is START SERVICE, LifecycleController shall set lifecycleMemory to SERVICE IN PROGRESS and lifecycleSnapshot result to SERVICE RUNNING.

##### `APPLY_CASE_10` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is HOLD SERVICE GRANT, LifecycleController shall set lifecycleMemory to SERVICE ACCESS GRANTED and lifecycleSnapshot result to SERVICE GRANTED.

##### `APPLY_CASE_11` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is WITHDRAW SERVICE GRANT, LifecycleController shall set lifecycleMemory to DOCKED ACCESS LOCKED and lifecycleSnapshot result to INHIBITED.

##### `APPLY_CASE_12` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is CONFIRM RELEASE, LifecycleController shall set lifecycleMemory to IDLE OUTSIDE and lifecycleSnapshot result to RELEASED.

##### `APPLY_CASE_13` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is HOLD UNDOCK CLEARANCE, LifecycleController shall set lifecycleMemory to UNDOCK CLEARANCE LATCHED and lifecycleSnapshot result to NONE.

##### `APPLY_CASE_14` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is CONFIRM DOCK, LifecycleController shall set lifecycleMemory to DOCKED ACCESS LOCKED and lifecycleSnapshot result to DOCK CONFIRMED.

##### `APPLY_CASE_15` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is HOLD DOCK CLEARANCE, LifecycleController shall set lifecycleMemory to DOCK CLEARANCE LATCHED and lifecycleSnapshot result to NONE.

##### `APPLY_CASE_16` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is AUTHORIZE UNDOCK, LifecycleController shall set lifecycleMemory to UNDOCK CLEARANCE LATCHED and lifecycleSnapshot result to UNDOCK ACCEPTED.

##### `APPLY_CASE_17` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is GRANT SERVICE ACCESS, LifecycleController shall set lifecycleMemory to SERVICE ACCESS GRANTED and lifecycleSnapshot result to SERVICE GRANTED.

##### `APPLY_CASE_18` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is AUTHORIZE DOCK, LifecycleController shall set lifecycleMemory to DOCK CLEARANCE LATCHED and lifecycleSnapshot result to DOCK ACCEPTED.

##### `APPLY_CASE_19` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is INHIBIT ACTION, LifecycleController shall preserve the value of lifecycleMemory on entry and set lifecycleSnapshot result to INHIBITED.

##### `APPLY_CASE_20` — Conditional behavior

> During contract evaluation for the compute phase, if admittedDirective is HOLD STABLE, LifecycleController shall preserve the value of lifecycleMemory on entry and set lifecycleSnapshot result to NONE.

### Requirements for LifecycleReporter

#### Contract clauses evaluated in the initialization phase

##### `REPORT_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, LifecycleReporter shall set pilotReport to OUTSIDE IDLE and stationReport to NO ACCESS.

#### Contract clauses evaluated in the compute phase

##### `REPORT_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is RECOVERY LATCHED, LifecycleReporter shall set pilotReport to RECOVERY REQUIRED and stationReport to RECOVERY REQUIRED.

##### `REPORT_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is RESET COMPLETE, LifecycleReporter shall set pilotReport to RESET COMPLETE and stationReport to NO ACCESS.

##### `REPORT_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is RELEASED, LifecycleReporter shall set pilotReport to RELEASE CONFIRMED and stationReport to NO ACCESS.

##### `REPORT_DOCK_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is DOCK ACCEPTED and gatedControl movement is PERMIT DOCK, LifecycleReporter shall set pilotReport to DOCK PERMITTED and stationReport to DOCK EXPECTED.

##### `REPORT_DOCK_ACCEPTANCE_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is DOCK ACCEPTED and gatedControl movement is not PERMIT DOCK, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_DOCK_CONFIRMED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is DOCK CONFIRMED, LifecycleReporter shall set pilotReport to DOCKED READY and stationReport to ACCESS AVAILABLE.

##### `REPORT_SERVICE_GRANTED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is SERVICE GRANTED and gatedControl access is ENABLED, LifecycleReporter shall set pilotReport to SERVICE GRANTED and stationReport to ACCESS RESERVED.

##### `REPORT_SERVICE_GRANT_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is SERVICE GRANTED and gatedControl access is not ENABLED, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_SERVICE_RUNNING` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is SERVICE RUNNING and gatedControl access is ENABLED, LifecycleReporter shall set pilotReport to SERVICE ACTIVE and stationReport to ACCESS OCCUPIED.

##### `REPORT_SERVICE_RUNNING_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is SERVICE RUNNING and gatedControl access is not ENABLED, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_SERVICE_FINISHED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is SERVICE FINISHED, LifecycleReporter shall set pilotReport to SERVICE FINISHED and stationReport to ACCESS AVAILABLE.

##### `REPORT_UNDOCK_DEFERRED_OCCUPIED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is UNDOCK DEFERRED and gatedControl access is ENABLED, LifecycleReporter shall set pilotReport to UNDOCK DEFERRED and stationReport to ACCESS OCCUPIED.

##### `REPORT_UNDOCK_DEFERRED_RELEASED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is UNDOCK DEFERRED, gatedControl access is not ENABLED, and lifecycleSnapshot next state is DOCKED ACCESS LOCKED, LifecycleReporter shall set pilotReport to UNDOCK DEFERRED and stationReport to ACCESS AVAILABLE.

##### `REPORT_UNDOCK_DEFERRED_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is UNDOCK DEFERRED, gatedControl access is not ENABLED, and lifecycleSnapshot next state is not DOCKED ACCESS LOCKED, LifecycleReporter shall set pilotReport to UNDOCK DEFERRED and stationReport to ACCESS INHIBITED.

##### `REPORT_UNDOCK_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is UNDOCK ACCEPTED and gatedControl movement is PERMIT UNDOCK, LifecycleReporter shall set pilotReport to UNDOCK PERMITTED and stationReport to DEPARTURE EXPECTED.

##### `REPORT_UNDOCK_ACCEPTANCE_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is UNDOCK ACCEPTED and gatedControl movement is not PERMIT UNDOCK, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_INHIBITED_RESERVED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is INHIBITED, gatedControl access is ENABLED, and lifecycleSnapshot next state is SERVICE ACCESS GRANTED, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS RESERVED.

##### `REPORT_INHIBITED_OCCUPIED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is INHIBITED, gatedControl access is ENABLED, and lifecycleSnapshot next state is SERVICE IN PROGRESS, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS OCCUPIED.

##### `REPORT_INHIBITED_DOCK_EXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is INHIBITED and gatedControl movement is PERMIT DOCK, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to DOCK EXPECTED.

##### `REPORT_INHIBITED_DEPARTURE_EXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is INHIBITED and gatedControl movement is PERMIT UNDOCK, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to DEPARTURE EXPECTED.

##### `REPORT_INHIBITED_DOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is INHIBITED, gatedControl access is not ENABLED, gatedControl movement is HOLD, and lifecycleSnapshot next state is DOCKED ACCESS LOCKED, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS AVAILABLE.

##### `REPORT_INHIBITED_OTHER` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is INHIBITED, gatedControl access is not ENABLED, gatedControl movement is HOLD, and lifecycleSnapshot next state is not DOCKED ACCESS LOCKED, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_NONE_OUTSIDE` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE and lifecycleSnapshot next state is IDLE OUTSIDE, LifecycleReporter shall set pilotReport to OUTSIDE IDLE and stationReport to NO ACCESS.

##### `REPORT_NONE_DOCK_CLEARANCE` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE, lifecycleSnapshot next state is DOCK CLEARANCE LATCHED, and gatedControl movement is PERMIT DOCK, LifecycleReporter shall set pilotReport to DOCK PERMITTED and stationReport to DOCK EXPECTED.

##### `REPORT_NONE_DOCK_CLEARANCE_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE, lifecycleSnapshot next state is DOCK CLEARANCE LATCHED, and gatedControl movement is not PERMIT DOCK, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_NONE_DOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE and lifecycleSnapshot next state is DOCKED ACCESS LOCKED, LifecycleReporter shall set pilotReport to DOCKED READY and stationReport to ACCESS AVAILABLE.

##### `REPORT_NONE_GRANTED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE, lifecycleSnapshot next state is SERVICE ACCESS GRANTED, and gatedControl access is ENABLED, LifecycleReporter shall set pilotReport to SERVICE GRANTED and stationReport to ACCESS RESERVED.

##### `REPORT_NONE_GRANTED_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE, lifecycleSnapshot next state is SERVICE ACCESS GRANTED, and gatedControl access is not ENABLED, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_NONE_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE, lifecycleSnapshot next state is SERVICE IN PROGRESS, and gatedControl access is ENABLED, LifecycleReporter shall set pilotReport to SERVICE ACTIVE and stationReport to ACCESS OCCUPIED.

##### `REPORT_NONE_ACTIVE_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE, lifecycleSnapshot next state is SERVICE IN PROGRESS, and gatedControl access is not ENABLED, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_NONE_UNDOCK_CLEARANCE` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE, lifecycleSnapshot next state is UNDOCK CLEARANCE LATCHED, and gatedControl movement is PERMIT UNDOCK, LifecycleReporter shall set pilotReport to UNDOCK PERMITTED and stationReport to DEPARTURE EXPECTED.

##### `REPORT_NONE_UNDOCK_CLEARANCE_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE, lifecycleSnapshot next state is UNDOCK CLEARANCE LATCHED, and gatedControl movement is not PERMIT UNDOCK, LifecycleReporter shall set pilotReport to INHIBITED and stationReport to ACCESS INHIBITED.

##### `REPORT_NONE_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleSnapshot result is NONE and lifecycleSnapshot next state is RECOVERY REQUIRED, LifecycleReporter shall set pilotReport to RECOVERY REQUIRED and stationReport to RECOVERY REQUIRED.

### Requirements for MovementAndAccessSafetyGate

#### Contract clauses evaluated in the initialization phase

##### `GATE_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, MovementAndAccessSafetyGate shall set movementDirective to HOLD, serviceAccess to LOCKED, gatedControl movement to HOLD, and gatedControl access to LOCKED.

#### Contract clauses evaluated in the compute phase

##### `MOVEMENT_GATE` — Required behavior

> During contract evaluation for the compute phase, MovementAndAccessSafetyGate shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - controlProposal movement is AUTHORIZE DOCK
>       - dockReadiness is DOCK READY
>       - serviceInterlock is QUIESCENT
>       - movementDirective is PERMIT DOCK
>   - All of the following conditions hold:
>     
>       - controlProposal movement is AUTHORIZE UNDOCK
>       - dockReadiness is UNDOCK READY
>       - serviceInterlock is QUIESCENT
>       - movementDirective is PERMIT UNDOCK
>   - All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - controlProposal movement is AUTHORIZE DOCK
>           - dockReadiness is DOCK READY
>           - serviceInterlock is QUIESCENT
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - controlProposal movement is AUTHORIZE UNDOCK
>           - dockReadiness is UNDOCK READY
>           - serviceInterlock is QUIESCENT
>       - movementDirective is HOLD.

##### `ACCESS_GATE` — Required behavior

> During contract evaluation for the compute phase, MovementAndAccessSafetyGate shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - controlProposal access is ENABLE ACCESS
>       - dockReadiness is SERVICE READY
>       - At least one of the following conditions holds:
>         
>           - serviceInterlock is SINGLE DEMAND
>           - serviceInterlock is SINGLE ACTIVE
>       - serviceAccess is ENABLED
>   - All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - controlProposal access is ENABLE ACCESS
>           - dockReadiness is SERVICE READY
>           - At least one of the following conditions holds:
>             
>               - serviceInterlock is SINGLE DEMAND
>               - serviceInterlock is SINGLE ACTIVE
>       - serviceAccess is LOCKED.

##### `GATED_CONTROL_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, MovementAndAccessSafetyGate shall produce a result for which gatedControl movement is movementDirective, gatedControl access is serviceAccess, and it is not the case that movementDirective is not HOLD and serviceAccess is ENABLED.

### Requirements for PriorityArbiter

#### Contract clauses evaluated in the initialization phase

##### `ARBITER_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, PriorityArbiter shall set admittedDirective to HOLD STABLE.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_ENTER_RECOVERY_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is INTENT FAULT or operationalAssessment is ASSESSMENT FAULT, PriorityArbiter shall set admittedDirective to ENTER RECOVERY FAULT.

##### `CASE_02_ENTER_RECOVERY_CONFLICT` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, and operationalAssessment is ASSESSMENT CONFLICT, PriorityArbiter shall set admittedDirective to ENTER RECOVERY CONFLICT.

##### `CASE_03_RESET_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is RECOVERY REQUIRED, qualifiedIntent is RESET REQUEST, and operationalAssessment is RECOVERY CLEARABLE, PriorityArbiter shall set admittedDirective to RESET RECOVERY.

##### `CASE_04_HOLD_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is RECOVERY REQUIRED, and it is not the case that qualifiedIntent is RESET REQUEST and operationalAssessment is RECOVERY CLEARABLE, PriorityArbiter shall set admittedDirective to HOLD RECOVERY.

##### `CASE_05_FINISH_SERVICE_DEFER_UNDOCK` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is SERVICE IN PROGRESS, operationalAssessment is SERVICE RELEASED, and qualifiedIntent is UNDOCK REQUEST, PriorityArbiter shall set admittedDirective to FINISH SERVICE DEFER UNDOCK.

##### `CASE_06_FINISH_SERVICE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is SERVICE IN PROGRESS, operationalAssessment is SERVICE RELEASED, and qualifiedIntent is not UNDOCK REQUEST, PriorityArbiter shall set admittedDirective to FINISH SERVICE.

##### `CASE_07_DEFER_UNDOCK` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is SERVICE IN PROGRESS, operationalAssessment is SERVICE OCCUPIED, and qualifiedIntent is UNDOCK REQUEST, PriorityArbiter shall set admittedDirective to DEFER UNDOCK.

##### `CASE_08_HOLD_ACTIVE_SERVICE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is SERVICE IN PROGRESS, operationalAssessment is not SERVICE RELEASED, and qualifiedIntent is NO ACTION, PriorityArbiter shall set admittedDirective to HOLD ACTIVE SERVICE.

##### `CASE_09_START_SERVICE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is SERVICE ACCESS GRANTED, and operationalAssessment is SERVICE OCCUPIED, PriorityArbiter shall set admittedDirective to START SERVICE.

##### `CASE_10_HOLD_SERVICE_GRANT` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is SERVICE ACCESS GRANTED, operationalAssessment is SERVICE GRANT PENDING, and qualifiedIntent is NO ACTION, PriorityArbiter shall set admittedDirective to HOLD SERVICE GRANT.

##### `CASE_11_WITHDRAW_SERVICE_GRANT` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is SERVICE ACCESS GRANTED, and operationalAssessment is SERVICE WITHDRAWN, PriorityArbiter shall set admittedDirective to WITHDRAW SERVICE GRANT.

##### `CASE_12_CONFIRM_RELEASE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is UNDOCK CLEARANCE LATCHED, and operationalAssessment is RELEASE CONFIRMED, PriorityArbiter shall set admittedDirective to CONFIRM RELEASE.

##### `CASE_13_HOLD_UNDOCK_CLEARANCE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is UNDOCK CLEARANCE LATCHED, operationalAssessment is not RELEASE CONFIRMED, and qualifiedIntent is NO ACTION, PriorityArbiter shall set admittedDirective to HOLD UNDOCK CLEARANCE.

##### `CASE_14_CONFIRM_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is DOCK CLEARANCE LATCHED, and operationalAssessment is DOCK CONFIRMED, PriorityArbiter shall set admittedDirective to CONFIRM DOCK.

##### `CASE_15_HOLD_DOCK_CLEARANCE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is DOCK CLEARANCE LATCHED, operationalAssessment is not DOCK CONFIRMED, and qualifiedIntent is NO ACTION, PriorityArbiter shall set admittedDirective to HOLD DOCK CLEARANCE.

##### `CASE_16_AUTHORIZE_UNDOCK` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is DOCKED ACCESS LOCKED, qualifiedIntent is UNDOCK REQUEST, and operationalAssessment is UNDOCK ELIGIBLE, PriorityArbiter shall set admittedDirective to AUTHORIZE UNDOCK.

##### `CASE_17_GRANT_SERVICE_ACCESS` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is DOCKED ACCESS LOCKED, and operationalAssessment is SERVICE DEMAND READY, PriorityArbiter shall set admittedDirective to GRANT SERVICE ACCESS.

##### `CASE_18_AUTHORIZE_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is not INTENT FAULT, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is IDLE OUTSIDE, qualifiedIntent is DOCK REQUEST, and operationalAssessment is DOCK ELIGIBLE, PriorityArbiter shall set admittedDirective to AUTHORIZE DOCK.

##### `CASE_19_INHIBIT_ACTION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 INHIBIT ACTION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedIntent is not INTENT FAULT
>   - operationalAssessment is not ASSESSMENT FAULT
>   - operationalAssessment is not ASSESSMENT CONFLICT
>   - lifecyclePrestate is not RECOVERY REQUIRED
>   - At least one of the following conditions holds:
>     
>       - qualifiedIntent is DOCK REQUEST
>       - qualifiedIntent is UNDOCK REQUEST
>       - qualifiedIntent is RESET REQUEST
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE IN PROGRESS
>       - operationalAssessment is SERVICE RELEASED
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE IN PROGRESS
>       - operationalAssessment is SERVICE OCCUPIED
>       - qualifiedIntent is UNDOCK REQUEST
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE ACCESS GRANTED
>       - operationalAssessment is SERVICE OCCUPIED
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is SERVICE ACCESS GRANTED
>       - operationalAssessment is SERVICE WITHDRAWN
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is UNDOCK CLEARANCE LATCHED
>       - operationalAssessment is RELEASE CONFIRMED
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is DOCK CLEARANCE LATCHED
>       - operationalAssessment is DOCK CONFIRMED
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is DOCKED ACCESS LOCKED
>       - qualifiedIntent is UNDOCK REQUEST
>       - operationalAssessment is UNDOCK ELIGIBLE
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is DOCKED ACCESS LOCKED
>       - operationalAssessment is SERVICE DEMAND READY
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - lifecyclePrestate is IDLE OUTSIDE
>       - qualifiedIntent is DOCK REQUEST
>       - operationalAssessment is DOCK ELIGIBLE.

> When all applicability conditions are met, PriorityArbiter shall produce a result for which all of the following conditions hold:
>
> admittedDirective is INHIBIT ACTION.

##### `CASE_20_HOLD_STABLE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedIntent is NO ACTION, operationalAssessment is not ASSESSMENT FAULT, operationalAssessment is not ASSESSMENT CONFLICT, lifecyclePrestate is not RECOVERY REQUIRED, lifecyclePrestate is not SERVICE IN PROGRESS, it is not the case that lifecyclePrestate is SERVICE ACCESS GRANTED and operationalAssessment is SERVICE OCCUPIED, it is not the case that lifecyclePrestate is SERVICE ACCESS GRANTED and operationalAssessment is SERVICE GRANT PENDING, it is not the case that lifecyclePrestate is SERVICE ACCESS GRANTED and operationalAssessment is SERVICE WITHDRAWN, it is not the case that lifecyclePrestate is UNDOCK CLEARANCE LATCHED and operationalAssessment is RELEASE CONFIRMED, it is not the case that lifecyclePrestate is UNDOCK CLEARANCE LATCHED, it is not the case that lifecyclePrestate is DOCK CLEARANCE LATCHED and operationalAssessment is DOCK CONFIRMED, it is not the case that lifecyclePrestate is DOCK CLEARANCE LATCHED, and it is not the case that lifecyclePrestate is DOCKED ACCESS LOCKED and operationalAssessment is SERVICE DEMAND READY, PriorityArbiter shall set admittedDirective to HOLD STABLE.

### Requirements for ServiceInterlockQualifier

#### Contract clauses evaluated in the initialization phase

##### `INTERLOCK_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ServiceInterlockQualifier shall set monitorInterlock to SERVICE FAULT and gateInterlock to SERVICE FAULT.

#### Contract clauses evaluated in the compute phase

##### `INTERLOCK_CONSUMER_AGREEMENT` — Required behavior

> During contract evaluation for the compute phase, ServiceInterlockQualifier shall set gateInterlock to monitorInterlock.

##### `INTERLOCK_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if repairSignal is FAULT, repairSignal is INVALID, resupplySignal is FAULT, or resupplySignal is INVALID, ServiceInterlockQualifier shall set monitorInterlock to SERVICE FAULT.

##### `INTERLOCK_QUIESCENT` — Conditional behavior

> During contract evaluation for the compute phase, if repairSignal is QUIESCENT and resupplySignal is QUIESCENT, ServiceInterlockQualifier shall set monitorInterlock to QUIESCENT.

##### `INTERLOCK_SINGLE_DEMAND` — Conditional behavior

> During contract evaluation for the compute phase, case INTERLOCK SINGLE DEMAND applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - repairSignal is REQUEST
>       - resupplySignal is QUIESCENT
>   - All of the following conditions hold:
>     
>       - repairSignal is QUIESCENT
>       - resupplySignal is REQUEST.

> When all applicability conditions are met, ServiceInterlockQualifier shall produce a result for which all of the following conditions hold:
>
> monitorInterlock is SINGLE DEMAND.

##### `INTERLOCK_SINGLE_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, case INTERLOCK SINGLE ACTIVE applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - repairSignal is ACTIVE
>       - resupplySignal is QUIESCENT
>   - All of the following conditions hold:
>     
>       - repairSignal is QUIESCENT
>       - resupplySignal is ACTIVE.

> When all applicability conditions are met, ServiceInterlockQualifier shall produce a result for which all of the following conditions hold:
>
> monitorInterlock is SINGLE ACTIVE.

##### `INTERLOCK_SINGLE_COMPLETION` — Conditional behavior

> During contract evaluation for the compute phase, case INTERLOCK SINGLE COMPLETION applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - repairSignal is COMPLETE
>       - resupplySignal is QUIESCENT
>   - All of the following conditions hold:
>     
>       - repairSignal is QUIESCENT
>       - resupplySignal is COMPLETE.

> When all applicability conditions are met, ServiceInterlockQualifier shall produce a result for which all of the following conditions hold:
>
> monitorInterlock is SINGLE COMPLETION.

##### `INTERLOCK_CONFLICT` — Conditional behavior

> During contract evaluation for the compute phase, if repairSignal is not FAULT, repairSignal is not INVALID, resupplySignal is not FAULT, resupplySignal is not INVALID, it is not the case that repairSignal is QUIESCENT and resupplySignal is QUIESCENT, it is not the case that repairSignal is REQUEST and resupplySignal is QUIESCENT, it is not the case that repairSignal is QUIESCENT and resupplySignal is REQUEST, it is not the case that repairSignal is ACTIVE and resupplySignal is QUIESCENT, it is not the case that repairSignal is QUIESCENT and resupplySignal is ACTIVE, it is not the case that repairSignal is COMPLETE and resupplySignal is QUIESCENT, and it is not the case that repairSignal is QUIESCENT and resupplySignal is COMPLETE, ServiceInterlockQualifier shall set monitorInterlock to SERVICE CONFLICT.
