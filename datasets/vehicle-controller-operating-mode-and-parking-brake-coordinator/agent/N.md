# Vehicle Controller Operating-Mode and Parking-Brake Coordinator

## Selected system context

### Need, purpose, goals, and operational context

NEED-01: A VehicleController environment needs one bounded coordinator that turns a
partial and potentially conflicting set of lifecycle, maintenance, degraded, and return
indications into an unambiguous operating mode and a mode-consistent parking-brake
command without silently accepting stale recovery indications.

GOAL-01: The system shall progress nominally from `Off` to `Standby` on a fresh start
indication and from `Standby` to `Operating` on a later fresh on indication, while held
or out-of-order indications cannot replay those transitions.

GOAL-02: The system shall apply one explicit indication priority, propagate any invalid
or degraded indication into the owned degraded episode and externally visible `Degraded`
mode, and prevent maintenance or lower-priority indications from masking that condition.

GOAL-03: The system shall leave `Degraded` only after the degraded indication is clear,
a fresh uncontested return indication arms recovery, and a later quiet confirmation
evaluation completes recovery into `Standby`.

GOAL-04: The system shall publish an atomic mode/brake frame in which parking-brake
release is possible only for `Operating` when an independent brake-demand decision also
permits release; every other reachable frame shall command apply.

CTX-01: The Vehicle is the external source and consumer context named by the seed. For
this pilot it presents abstract controller indications and consumes the coordinated
frame; this responsibility assignment is an assumption because the source does not
identify the indication originator.

CTX-02: The Parking-Brake Actuation Context consumes the parking-brake command. It is
outside the boundary and provides no modeled achievement feedback, so `Apply` and
`Release` are requests rather than claims of physical effect.

CTX-03: The Road, drivetrain, starter, electrical-power network, self-test mechanism,
temperature source, and maintenance process remain external context and exchange no
modeled quantity with this selected boundary.

### Exact finite monitored and controlled boundary

MON-01: The system shall monitor `lifecycle_indications: LifecycleIndications` from
CTX-01; PART-01 alone owns lifecycle freshness and invalidity facts.

MON-02: The system shall monitor `maintenance_indication: MaintenanceIndication` from
CTX-01; PART-02 alone owns maintenance active, fresh, clear-edge, and invalidity facts.

MON-03: The system shall monitor `degraded_indication: DegradedIndication` from CTX-01;
PART-03 alone owns degraded active, fresh, clear-edge, and invalidity facts.

MON-04: The system shall monitor `return_indication: ReturnIndication` from CTX-01;
PART-04 alone owns return fresh, held, clear, and invalidity facts.

CTRL-01: The system shall control exactly one `coordination_frame: CoordinationFrame`
delivered atomically to CTX-01 and CTX-02. It directly controls only the published
controller-mode disposition and requested parking-brake disposition.

### Hazards, fault propagation, and recovery

RISK-01: If competing indications are resolved inconsistently, lower-priority
maintenance, return, on, or start behavior can mask a degraded or off condition and
publish an unintended mode.

RISK-02: If an invalid or degraded indication is not propagated through episode, mode,
brake demand, and composition, the system can retain an operating frame using
untrustworthy context.

RISK-03: If a held, stale, conflicted, or same-evaluation return indication clears
degradation, the controller can leave its degraded disposition without an observable
recovery sequence.

RISK-04: If controller mode and parking-brake decisions are published independently
without conservative composition, consumers can observe brake release in a nonoperating
or fault-dominated mode.

### Modes and allowed transitions

MODE-01: `Off` is externally distinguishable by published mode `Off` and parking-brake
`Apply`; nominal demand is dormant and no operating disposition exists.

MODE-02: `Standby` is externally distinguishable by published mode `Standby` and
parking-brake `Apply`; it records a staged lifecycle episode awaiting a later fresh on
indication.

MODE-03: `Operating` is externally distinguishable by published mode `Operating`; it is
the only mode in which parking-brake release may be published, subject to independent
brake demand.

MODE-04: `Maintenance` is externally distinguishable by published mode `Maintenance` and
parking-brake `Apply`; it overrides but may preserve nominal demand while the
maintenance session is active.

MODE-05: `Degraded` is externally distinguishable by published mode `Degraded` and
parking-brake `Apply`; it remains dominant while the degraded episode is latched or
return-armed.

### Essential environmental assumptions and constraints

ASM-01: CTX-01 is responsible for supplying one stable `IndicationLevel` value per field
per abstract evaluation and for presenting `Clear` before expecting a later assertion to
count as fresh. Rationale: the seed provides no request identifiers, pulse protocol,
originator, or sampling semantics.

ASM-02: CTX-01 is responsible for marking an indication `Invalid` whenever its current
level is untrustworthy. Rationale: explicit validity is a pilot abstraction required to
make fault propagation finite and reviewable; it is not source evidence that a
production signal uses this status set.

ASM-03: CTX-01 and CTX-02 are responsible for consuming the two-field frame atomically
at the abstract evaluation boundary. Rationale: atomic observation defines composition
without selecting transport, thread scheduling, or physical timing.

ASM-04: CTX-02 is responsible for acting on the parking-brake request and for any
physical achievement monitoring outside this boundary. Rationale: the seed names
application but defines neither actuator effects nor completion feedback.

ASM-05: A quiet recovery confirmation is an ordering abstraction, not a time-duration
claim. CTX-01 must present valid clear degraded and return indications and no actionable
lifecycle/maintenance indication on an evaluation after arming; no milliseconds,
deadlines, debounce, or reliability claim is implied.

## Supporting contract definitions

### State `Vehicle_Controller_Operating_Mode_Coordinator::ControllerModeTransitionOwner::modeMemory`

State `modeMemory` has type `Vehicle_Controller_Operating_Mode_Coordinator::ControllerMode`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::DegradationEpochOwner::previousDegraded`

State `previousDegraded` has type `Vehicle_Controller_Operating_Mode_Coordinator::IndicationLevel`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::DegradedEpisodeOwner::episodeMemory`

State `episodeMemory` has type `Vehicle_Controller_Operating_Mode_Coordinator::DegradedEpisode`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::LifecycleEpochOwner::previousStart`

State `previousStart` has type `Vehicle_Controller_Operating_Mode_Coordinator::StartIndicationLevel`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::LifecycleEpochOwner::previousOn`

State `previousOn` has type `Vehicle_Controller_Operating_Mode_Coordinator::OnIndicationLevel`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::LifecycleEpochOwner::previousOff`

State `previousOff` has type `Vehicle_Controller_Operating_Mode_Coordinator::OffIndicationLevel`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::MaintenanceEpochOwner::previousMaintenance`

State `previousMaintenance` has type `Vehicle_Controller_Operating_Mode_Coordinator::IndicationLevel`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::MaintenanceSessionOwner::sessionMemory`

State `sessionMemory` has type `Vehicle_Controller_Operating_Mode_Coordinator::MaintenanceSession`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::OperatingDemandOwner::demandMemory`

State `demandMemory` has type `Vehicle_Controller_Operating_Mode_Coordinator::OperatingDemand`.

### State `Vehicle_Controller_Operating_Mode_Coordinator::ReturnEpochOwner::previousReturn`

State `previousReturn` has type `Vehicle_Controller_Operating_Mode_Coordinator::IndicationLevel`.

## Detailed behavioral requirements

### Requirements for ConflictClassificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CONFLICT_FAIL_CLOSED` — Required behavior

> During contract evaluation for the initialization phase, ConflictClassificationOwner shall set conflictToPriority to InputInvalid and conflictToRecovery to conflictToPriority.

#### Contract clauses evaluated in the compute phase

##### `CONFLICT_CARDINALITY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, ConflictClassificationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - lifecycleFacts anyInvalid is true
>               - maintenanceFacts invalid is true
>               - degradationFacts invalid is true
>               - returnFacts invalid is true
>           - conflictToPriority is InputInvalid
>       - All of the following conditions hold:
>         
>           - The first condition holds exactly when the second condition holds:
>             
>             **First condition:**
>             
>             At least one of the following conditions holds:
>             
>               - lifecycleFacts anyInvalid is true
>               - maintenanceFacts invalid is true
>               - degradationFacts invalid is true
>               - returnFacts invalid is true
>             
>             **Second condition:**
>             
>             F is true
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - lifecycleFacts offActive is true
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - maintenanceFacts active is true
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - returnFacts fresh is true
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - lifecycleFacts freshOn is true
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - lifecycleFacts freshStart is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts offActive is true
>                   - maintenanceFacts active is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts offActive is true
>                   - returnFacts fresh is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts offActive is true
>                   - lifecycleFacts freshOn is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts offActive is true
>                   - lifecycleFacts freshStart is true
>               - All of the following conditions hold:
>                 
>                   - maintenanceFacts active is true
>                   - returnFacts fresh is true
>               - All of the following conditions hold:
>                 
>                   - maintenanceFacts active is true
>                   - lifecycleFacts freshOn is true
>               - All of the following conditions hold:
>                 
>                   - maintenanceFacts active is true
>                   - lifecycleFacts freshStart is true
>               - All of the following conditions hold:
>                 
>                   - returnFacts fresh is true
>                   - lifecycleFacts freshOn is true
>               - All of the following conditions hold:
>                 
>                   - returnFacts fresh is true
>                   - lifecycleFacts freshStart is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts freshOn is true
>                   - lifecycleFacts freshStart is true
>           - conflictToPriority is MultipleActionable
>       - All of the following conditions hold:
>         
>           - The first condition holds exactly when the second condition holds:
>             
>             **First condition:**
>             
>             At least one of the following conditions holds:
>             
>               - lifecycleFacts anyInvalid is true
>               - maintenanceFacts invalid is true
>               - degradationFacts invalid is true
>               - returnFacts invalid is true
>             
>             **Second condition:**
>             
>             F is true
>           - The first condition holds exactly when the second condition holds:
>             
>             **First condition:**
>             
>             At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - lifecycleFacts offActive is true
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - maintenanceFacts active is true
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - returnFacts fresh is true
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - lifecycleFacts freshOn is true
>               - All of the following conditions hold:
>                 
>                   - degradationFacts active is true
>                   - lifecycleFacts freshStart is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts offActive is true
>                   - maintenanceFacts active is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts offActive is true
>                   - returnFacts fresh is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts offActive is true
>                   - lifecycleFacts freshOn is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts offActive is true
>                   - lifecycleFacts freshStart is true
>               - All of the following conditions hold:
>                 
>                   - maintenanceFacts active is true
>                   - returnFacts fresh is true
>               - All of the following conditions hold:
>                 
>                   - maintenanceFacts active is true
>                   - lifecycleFacts freshOn is true
>               - All of the following conditions hold:
>                 
>                   - maintenanceFacts active is true
>                   - lifecycleFacts freshStart is true
>               - All of the following conditions hold:
>                 
>                   - returnFacts fresh is true
>                   - lifecycleFacts freshOn is true
>               - All of the following conditions hold:
>                 
>                   - returnFacts fresh is true
>                   - lifecycleFacts freshStart is true
>               - All of the following conditions hold:
>                 
>                   - lifecycleFacts freshOn is true
>                   - lifecycleFacts freshStart is true
>             
>             **Second condition:**
>             
>             F is true
>           - conflictToPriority is SingleOrNone
>   - conflictToRecovery is conflictToPriority.

### Requirements for ControllerModeTransitionOwner

#### Contract clauses evaluated in the initialization phase

May modify: modeMemory

##### `INITIAL_MODE_OFF` — Required behavior

> During contract evaluation for the initialization phase, ControllerModeTransitionOwner shall set modeMemory to Off, modeDecision nextMode to Off, and modeDecision reason to DormantDemand.

#### Contract clauses evaluated in the compute phase

May modify: modeMemory

##### `MODE_OUTPUT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, ControllerModeTransitionOwner shall set modeDecision nextMode to modeMemory.

##### `CASE_26_MODE_DEGRADED` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot nextEpisode is not ClearEpisode, ControllerModeTransitionOwner shall set modeMemory to Degraded and modeDecision reason to FaultDominant.

##### `CASE_27_MODE_MAINTENANCE` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot nextEpisode is ClearEpisode and maintenanceSnapshot nextSession is Active, ControllerModeTransitionOwner shall set modeMemory to Maintenance and modeDecision reason to MaintenanceDominant.

##### `CASE_28_MODE_STANDBY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 28 MODE STANDBY applies under all of the following conditions:
>
> episodeSnapshot nextEpisode is ClearEpisode, maintenanceSnapshot nextSession is Inactive, and demandSnapshot nextDemand is Staged.

> When all applicability conditions are met, ControllerModeTransitionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - modeMemory is Standby
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recoveryDecision is Confirm
>           - modeDecision reason is RecoveryConfirmed
>       - All of the following conditions hold:
>         
>           - recoveryDecision is not Confirm
>           - modeDecision reason is StartStaged.

##### `CASE_29_MODE_OPERATING` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot nextEpisode is ClearEpisode, maintenanceSnapshot nextSession is Inactive, and demandSnapshot nextDemand is RunRequested, ControllerModeTransitionOwner shall set modeMemory to Operating and modeDecision reason to RunRequested.

##### `CASE_30_MODE_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot nextEpisode is ClearEpisode, maintenanceSnapshot nextSession is Inactive, and demandSnapshot nextDemand is Dormant, ControllerModeTransitionOwner shall set modeMemory to Off and modeDecision reason to DormantDemand.

### Requirements for DegradationEpochOwner

#### Contract clauses evaluated in the initialization phase

May modify: previousDegraded

##### `INITIAL_DEGRADATION_HISTORY_INVALID` — Required behavior

> During contract evaluation for the initialization phase, DegradationEpochOwner shall set previousDegraded to Invalid, factsToConflict active to true exactly when F is true, factsToConflict fresh to true exactly when F is true, factsToConflict cleared to true exactly when F is true, factsToConflict held to true exactly when F is true, factsToConflict invalid to true exactly when T is true, factsToPriority to factsToConflict, factsToEpisode to factsToConflict, and factsToRecovery to factsToConflict.

#### Contract clauses evaluated in the compute phase

May modify: previousDegraded

##### `DEGRADATION_EPOCH_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, DegradationEpochOwner shall set factsToConflict active to true exactly when degradedIndication level is Asserted, factsToConflict fresh to true exactly when the value of previousDegraded on entry is Clear and degradedIndication level is Asserted, factsToConflict cleared to true exactly when the value of previousDegraded on entry is Asserted and degradedIndication level is Clear, factsToConflict held to true exactly when the value of previousDegraded on entry is Asserted and degradedIndication level is Asserted, factsToConflict invalid to true exactly when degradedIndication level is Invalid, factsToPriority to factsToConflict, factsToEpisode to factsToConflict, factsToRecovery to factsToConflict, and previousDegraded to degradedIndication level.

### Requirements for DegradedEpisodeOwner

#### Contract clauses evaluated in the initialization phase

May modify: episodeMemory

##### `INITIAL_EPISODE_CLEAR` — Required behavior

> During contract evaluation for the initialization phase, DegradedEpisodeOwner shall set episodeMemory to ClearEpisode, snapshotToRecovery currentEpisode to ClearEpisode, snapshotToRecovery nextEpisode to ClearEpisode, snapshotToMode to snapshotToRecovery, and snapshotToBrake to snapshotToRecovery.

#### Contract clauses evaluated in the compute phase

May modify: episodeMemory

##### `EPISODE_SNAPSHOT_PRE_POST_SPLIT` — Required behavior

> During contract evaluation for the compute phase, DegradedEpisodeOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of episodeMemory on entry is ClearEpisode
>           - snapshotToRecovery currentEpisode is ClearEpisode
>       - All of the following conditions hold:
>         
>           - the value of episodeMemory on entry is Latched
>           - snapshotToRecovery currentEpisode is Latched
>       - All of the following conditions hold:
>         
>           - the value of episodeMemory on entry is ReturnArmed
>           - snapshotToRecovery currentEpisode is ReturnArmed
>   - snapshotToRecovery nextEpisode is episodeMemory
>   - snapshotToMode is snapshotToRecovery
>   - snapshotToBrake is snapshotToRecovery.

##### `CASE_16_EPISODE_LATCH` — Conditional behavior

> During contract evaluation for the compute phase, if degradationFacts active is true, degradationFacts invalid is true, selectedIndication is InvalidSelected, or selectedIndication is DegradedSelected, DegradedEpisodeOwner shall set episodeMemory to Latched.

##### `CASE_17_EPISODE_ARM` — Conditional behavior

> During contract evaluation for the compute phase, if degradationFacts active is true exactly when F is true, degradationFacts invalid is true exactly when F is true, selectedIndication is not InvalidSelected, selectedIndication is not DegradedSelected, the value of episodeMemory on entry is Latched, and recoveryDecision is Arm, DegradedEpisodeOwner shall set episodeMemory to ReturnArmed.

##### `CASE_18_EPISODE_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if degradationFacts active is true exactly when F is true, degradationFacts invalid is true exactly when F is true, selectedIndication is not InvalidSelected, selectedIndication is not DegradedSelected, the value of episodeMemory on entry is ReturnArmed, and recoveryDecision is Confirm, DegradedEpisodeOwner shall set episodeMemory to ClearEpisode.

##### `CASE_19_EPISODE_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, if degradationFacts active is true exactly when F is true, degradationFacts invalid is true exactly when F is true, selectedIndication is not InvalidSelected, selectedIndication is not DegradedSelected, the value of episodeMemory on entry is ReturnArmed, and recoveryDecision is Cancel, DegradedEpisodeOwner shall set episodeMemory to Latched.

##### `CASE_20_EPISODE_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 EPISODE RETAIN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - degradationFacts active is true exactly when F is true
>   - degradationFacts invalid is true exactly when F is true
>   - selectedIndication is not InvalidSelected
>   - selectedIndication is not DegradedSelected
>   - At least one of the following conditions holds:
>     
>       - the value of episodeMemory on entry is not Latched
>       - recoveryDecision is not Arm
>   - At least one of the following conditions holds:
>     
>       - the value of episodeMemory on entry is not ReturnArmed
>       - recoveryDecision is not Confirm
>   - At least one of the following conditions holds:
>     
>       - the value of episodeMemory on entry is not ReturnArmed
>       - recoveryDecision is not Cancel.

> When all applicability conditions are met, DegradedEpisodeOwner shall produce a result for which all of the following conditions hold:
>
> episodeMemory is the value of episodeMemory on entry.

### Requirements for IndicationPriorityOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SELECTION_FAIL_CLOSED` — Required behavior

> During contract evaluation for the initialization phase, IndicationPriorityOwner shall set selectionToDemand to InvalidSelected, selectionToSession to selectionToDemand, selectionToRecovery to selectionToDemand, selectionToEpisode to selectionToDemand, and selectionToBrake to selectionToDemand.

#### Contract clauses evaluated in the compute phase

##### `SELECTION_FANOUT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, IndicationPriorityOwner shall set selectionToSession to selectionToDemand, selectionToRecovery to selectionToDemand, selectionToEpisode to selectionToDemand, and selectionToBrake to selectionToDemand.

##### `CASE_01_INPUT_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if conflictClass is InputInvalid, IndicationPriorityOwner shall set selectionToDemand to InvalidSelected.

##### `CASE_02_DEGRADED` — Conditional behavior

> During contract evaluation for the compute phase, if conflictClass is not InputInvalid and degradationFacts active is true, IndicationPriorityOwner shall set selectionToDemand to DegradedSelected.

##### `CASE_03_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if conflictClass is not InputInvalid, degradationFacts active is true exactly when F is true, and lifecycleFacts offActive is true, IndicationPriorityOwner shall set selectionToDemand to OffSelected.

##### `CASE_04_MAINTENANCE` — Conditional behavior

> During contract evaluation for the compute phase, if conflictClass is not InputInvalid, degradationFacts active is true exactly when F is true, lifecycleFacts offActive is true exactly when F is true, and maintenanceFacts active is true, IndicationPriorityOwner shall set selectionToDemand to MaintenanceSelected.

##### `CASE_05_RETURN` — Conditional behavior

> During contract evaluation for the compute phase, if conflictClass is not InputInvalid, degradationFacts active is true exactly when F is true, lifecycleFacts offActive is true exactly when F is true, maintenanceFacts active is true exactly when F is true, and returnFacts fresh is true, IndicationPriorityOwner shall set selectionToDemand to ReturnSelected.

##### `CASE_06_ON` — Conditional behavior

> During contract evaluation for the compute phase, if conflictClass is not InputInvalid, degradationFacts active is true exactly when F is true, lifecycleFacts offActive is true exactly when F is true, maintenanceFacts active is true exactly when F is true, returnFacts fresh is true exactly when F is true, and lifecycleFacts freshOn is true, IndicationPriorityOwner shall set selectionToDemand to OnSelected.

##### `CASE_07_START` — Conditional behavior

> During contract evaluation for the compute phase, if conflictClass is not InputInvalid, degradationFacts active is true exactly when F is true, lifecycleFacts offActive is true exactly when F is true, maintenanceFacts active is true exactly when F is true, returnFacts fresh is true exactly when F is true, lifecycleFacts freshOn is true exactly when F is true, and lifecycleFacts freshStart is true, IndicationPriorityOwner shall set selectionToDemand to StartSelected.

##### `CASE_08_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if conflictClass is not InputInvalid, degradationFacts active is true exactly when F is true, lifecycleFacts offActive is true exactly when F is true, maintenanceFacts active is true exactly when F is true, returnFacts fresh is true exactly when F is true, lifecycleFacts freshOn is true exactly when F is true, and lifecycleFacts freshStart is true exactly when F is true, IndicationPriorityOwner shall set selectionToDemand to NoneSelected.

### Requirements for LifecycleEpochOwner

#### Contract clauses evaluated in the initialization phase

May modify: previousStart, previousOn, previousOff

##### `INITIAL_LIFECYCLE_HISTORY_INVALID` — Required behavior

> During contract evaluation for the initialization phase, LifecycleEpochOwner shall set previousStart to Invalid, previousOn to Invalid, previousOff to Invalid, factsToConflict freshStart to true exactly when F is true, factsToConflict freshOn to true exactly when F is true, factsToConflict offActive to true exactly when F is true, factsToConflict heldStart to true exactly when F is true, factsToConflict heldOn to true exactly when F is true, factsToConflict heldOff to true exactly when F is true, factsToConflict anyInvalid to true exactly when T is true, and factsToPriority to factsToConflict.

#### Contract clauses evaluated in the compute phase

May modify: previousStart, previousOn, previousOff

##### `LIFECYCLE_EPOCH_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, LifecycleEpochOwner shall set factsToConflict freshStart to true exactly when the value of previousStart on entry is Clear and lifecycleIndications startLevel is Asserted, factsToConflict freshOn to true exactly when the value of previousOn on entry is Clear and lifecycleIndications onLevel is Asserted, factsToConflict offActive to true exactly when lifecycleIndications offLevel is Asserted, factsToConflict heldStart to true exactly when the value of previousStart on entry is Asserted and lifecycleIndications startLevel is Asserted, factsToConflict heldOn to true exactly when the value of previousOn on entry is Asserted and lifecycleIndications onLevel is Asserted, factsToConflict heldOff to true exactly when the value of previousOff on entry is Asserted and lifecycleIndications offLevel is Asserted, factsToConflict anyInvalid to true exactly when lifecycleIndications startLevel is Invalid, lifecycleIndications onLevel is Invalid, or lifecycleIndications offLevel is Invalid, factsToPriority to factsToConflict, previousStart to lifecycleIndications startLevel, previousOn to lifecycleIndications onLevel, and previousOff to lifecycleIndications offLevel.

### Requirements for MaintenanceEpochOwner

#### Contract clauses evaluated in the initialization phase

May modify: previousMaintenance

##### `INITIAL_MAINTENANCE_HISTORY_INVALID` — Required behavior

> During contract evaluation for the initialization phase, MaintenanceEpochOwner shall set previousMaintenance to Invalid, factsToConflict active to true exactly when F is true, factsToConflict fresh to true exactly when F is true, factsToConflict cleared to true exactly when F is true, factsToConflict held to true exactly when F is true, factsToConflict invalid to true exactly when T is true, factsToPriority to factsToConflict, and factsToSession to factsToConflict.

#### Contract clauses evaluated in the compute phase

May modify: previousMaintenance

##### `MAINTENANCE_EPOCH_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, MaintenanceEpochOwner shall set factsToConflict active to true exactly when maintenanceIndication level is Asserted, factsToConflict fresh to true exactly when the value of previousMaintenance on entry is Clear and maintenanceIndication level is Asserted, factsToConflict cleared to true exactly when the value of previousMaintenance on entry is Asserted and maintenanceIndication level is Clear, factsToConflict held to true exactly when the value of previousMaintenance on entry is Asserted and maintenanceIndication level is Asserted, factsToConflict invalid to true exactly when maintenanceIndication level is Invalid, factsToPriority to factsToConflict, factsToSession to factsToConflict, and previousMaintenance to maintenanceIndication level.

### Requirements for MaintenanceSessionOwner

#### Contract clauses evaluated in the initialization phase

May modify: sessionMemory

##### `INITIAL_SESSION_INACTIVE` — Required behavior

> During contract evaluation for the initialization phase, MaintenanceSessionOwner shall set sessionMemory to Inactive, maintenanceSnapshot currentSession to Inactive, maintenanceSnapshot nextSession to Inactive, and snapshotToBrake to maintenanceSnapshot.

#### Contract clauses evaluated in the compute phase

May modify: sessionMemory

##### `MAINTENANCE_SNAPSHOT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, MaintenanceSessionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of sessionMemory on entry is Inactive
>           - maintenanceSnapshot currentSession is Inactive
>       - All of the following conditions hold:
>         
>           - the value of sessionMemory on entry is Active
>           - maintenanceSnapshot currentSession is Active
>   - maintenanceSnapshot nextSession is sessionMemory
>   - snapshotToBrake is maintenanceSnapshot.

##### `CASE_13_MAINTENANCE_ENTER` — Conditional behavior

> During contract evaluation for the compute phase, if selectedIndication is MaintenanceSelected, MaintenanceSessionOwner shall set sessionMemory to Active.

##### `CASE_14_MAINTENANCE_EXIT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 14 MAINTENANCE EXIT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - selectedIndication is not MaintenanceSelected
>   - At least one of the following conditions holds:
>     
>       - selectedIndication is InvalidSelected
>       - selectedIndication is DegradedSelected
>       - selectedIndication is OffSelected
>       - All of the following conditions hold:
>         
>           - the value of sessionMemory on entry is Active
>           - maintenanceFacts active is true exactly when F is true
>           - maintenanceFacts invalid is true exactly when F is true
>           - selectedIndication is OnSelected.

> When all applicability conditions are met, MaintenanceSessionOwner shall produce a result for which all of the following conditions hold:
>
> sessionMemory is Inactive.

##### `CASE_15_MAINTENANCE_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 MAINTENANCE RETAIN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - selectedIndication is not MaintenanceSelected
>   - selectedIndication is not InvalidSelected
>   - selectedIndication is not DegradedSelected
>   - selectedIndication is not OffSelected
>   - At least one of the following conditions holds:
>     
>       - the value of sessionMemory on entry is not Active
>       - maintenanceFacts active is true
>       - maintenanceFacts invalid is true
>       - selectedIndication is not OnSelected.

> When all applicability conditions are met, MaintenanceSessionOwner shall produce a result for which all of the following conditions hold:
>
> sessionMemory is the value of sessionMemory on entry.

### Requirements for OperatingDemandOwner

#### Contract clauses evaluated in the initialization phase

May modify: demandMemory

##### `INITIAL_DEMAND_DORMANT` — Required behavior

> During contract evaluation for the initialization phase, OperatingDemandOwner shall set demandMemory to Dormant, demandSnapshot currentDemand to Dormant, and demandSnapshot nextDemand to Dormant.

#### Contract clauses evaluated in the compute phase

May modify: demandMemory

##### `DEMAND_SNAPSHOT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, OperatingDemandOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of demandMemory on entry is Dormant
>           - demandSnapshot currentDemand is Dormant
>       - All of the following conditions hold:
>         
>           - the value of demandMemory on entry is Staged
>           - demandSnapshot currentDemand is Staged
>       - All of the following conditions hold:
>         
>           - the value of demandMemory on entry is RunRequested
>           - demandSnapshot currentDemand is RunRequested
>   - demandSnapshot nextDemand is demandMemory.

##### `CASE_09_DEMAND_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if selectedIndication is InvalidSelected, selectedIndication is DegradedSelected, or selectedIndication is OffSelected, OperatingDemandOwner shall set demandMemory to Dormant.

##### `CASE_10_DEMAND_STAGE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 DEMAND STAGE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - selectedIndication is not InvalidSelected
>   - selectedIndication is not DegradedSelected
>   - selectedIndication is not OffSelected
>   - At least one of the following conditions holds:
>     
>       - recoveryDecision is Confirm
>       - All of the following conditions hold:
>         
>           - selectedIndication is StartSelected
>           - the value of demandMemory on entry is Dormant.

> When all applicability conditions are met, OperatingDemandOwner shall produce a result for which all of the following conditions hold:
>
> demandMemory is Staged.

##### `CASE_11_DEMAND_RUN` — Conditional behavior

> During contract evaluation for the compute phase, if selectedIndication is OnSelected, recoveryDecision is not Confirm, and the value of demandMemory on entry is Staged, OperatingDemandOwner shall set demandMemory to RunRequested.

##### `CASE_12_DEMAND_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 DEMAND RETAIN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - selectedIndication is not InvalidSelected
>   - selectedIndication is not DegradedSelected
>   - selectedIndication is not OffSelected
>   - recoveryDecision is not Confirm
>   - At least one of the following conditions holds:
>     
>       - selectedIndication is not StartSelected
>       - the value of demandMemory on entry is not Dormant
>   - At least one of the following conditions holds:
>     
>       - selectedIndication is not OnSelected
>       - the value of demandMemory on entry is not Staged.

> When all applicability conditions are met, OperatingDemandOwner shall produce a result for which all of the following conditions hold:
>
> demandMemory is the value of demandMemory on entry.

### Requirements for OutcomeCoherenceOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_FRAME_SAFE` — Required behavior

> During contract evaluation for the initialization phase, OutcomeCoherenceOwner shall set coordinationFrame mode to Off and coordinationFrame parkingBrake to Apply.

#### Contract clauses evaluated in the compute phase

##### `CONSERVATIVE_TWO_INPUT_COMPOSITION` — Required behavior

> During contract evaluation for the compute phase, OutcomeCoherenceOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - modeDecision nextMode is Off
>           - coordinationFrame mode is Off
>       - All of the following conditions hold:
>         
>           - modeDecision nextMode is Standby
>           - coordinationFrame mode is Standby
>       - All of the following conditions hold:
>         
>           - modeDecision nextMode is Operating
>           - coordinationFrame mode is Operating
>       - All of the following conditions hold:
>         
>           - modeDecision nextMode is Maintenance
>           - coordinationFrame mode is Maintenance
>       - All of the following conditions hold:
>         
>           - modeDecision nextMode is Degraded
>           - coordinationFrame mode is Degraded
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - modeDecision nextMode is Operating
>           - brakeDemand is AllowRelease
>           - coordinationFrame parkingBrake is Release
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - modeDecision nextMode is not Operating
>               - brakeDemand is RequireApply
>           - coordinationFrame parkingBrake is Apply.

##### `NONOPERATING_RELEASE_EXCLUDED` — Required behavior

> During contract evaluation for the compute phase, OutcomeCoherenceOwner shall set coordinationFrame parkingBrake to Release exactly when coordinationFrame mode is Operating and brakeDemand is AllowRelease.

### Requirements for ParkingBrakeDemandOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BRAKE_DEMAND_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ParkingBrakeDemandOwner shall set brakeDemand to RequireApply.

#### Contract clauses evaluated in the compute phase

##### `INDEPENDENT_BRAKE_DEMAND` — Required behavior

> During contract evaluation for the compute phase, ParkingBrakeDemandOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - maintenanceSnapshot nextSession is Active
>           - episodeSnapshot nextEpisode is not ClearEpisode
>           - selectedIndication is InvalidSelected
>           - selectedIndication is DegradedSelected
>           - selectedIndication is OffSelected
>           - selectedIndication is MaintenanceSelected
>       - brakeDemand is RequireApply
>   - All of the following conditions hold:
>     
>       - maintenanceSnapshot nextSession is not Active
>       - episodeSnapshot nextEpisode is ClearEpisode
>       - selectedIndication is not InvalidSelected
>       - selectedIndication is not DegradedSelected
>       - selectedIndication is not OffSelected
>       - selectedIndication is not MaintenanceSelected
>       - brakeDemand is AllowRelease.

### Requirements for RecoveryEligibilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RECOVERY_NOT_APPLICABLE` — Required behavior

> During contract evaluation for the initialization phase, RecoveryEligibilityOwner shall set decisionToEpisode to NotApplicable, decisionToDemand to decisionToEpisode, and decisionToMode to decisionToEpisode.

#### Contract clauses evaluated in the compute phase

##### `RECOVERY_DECISION_FANOUT` — Required behavior

> During contract evaluation for the compute phase, RecoveryEligibilityOwner shall set decisionToDemand to decisionToEpisode and decisionToMode to decisionToEpisode.

##### `CASE_21_RECOVERY_NOT_APPLICABLE` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot currentEpisode is ClearEpisode, RecoveryEligibilityOwner shall set decisionToEpisode to NotApplicable.

##### `CASE_22_RECOVERY_ARM` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot currentEpisode is Latched, degradationFacts active is true exactly when F is true, degradationFacts invalid is true exactly when F is true, returnFacts invalid is true exactly when F is true, returnFacts fresh is true, selectedIndication is ReturnSelected, and conflictClass is SingleOrNone, RecoveryEligibilityOwner shall set decisionToEpisode to Arm.

##### `CASE_23_RECOVERY_CONFIRM` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot currentEpisode is ReturnArmed, degradationFacts active is true exactly when F is true, degradationFacts invalid is true exactly when F is true, returnFacts invalid is true exactly when F is true, returnFacts clear is true, selectedIndication is NoneSelected, and conflictClass is SingleOrNone, RecoveryEligibilityOwner shall set decisionToEpisode to Confirm.

##### `CASE_24_RECOVERY_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 24 RECOVERY CANCEL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - episodeSnapshot currentEpisode is ReturnArmed
>   - At least one of the following conditions holds:
>     
>       - degradationFacts active is true
>       - degradationFacts invalid is true
>       - returnFacts invalid is true
>       - conflictClass is MultipleActionable
>       - selectedIndication is InvalidSelected
>       - selectedIndication is DegradedSelected
>       - selectedIndication is OffSelected
>       - selectedIndication is MaintenanceSelected
>       - selectedIndication is OnSelected
>       - selectedIndication is StartSelected.

> When all applicability conditions are met, RecoveryEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> decisionToEpisode is Cancel.

##### `CASE_25_RECOVERY_WAIT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 25 RECOVERY WAIT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - episodeSnapshot currentEpisode is not ClearEpisode
>   - At least one of the following conditions holds:
>     
>       - episodeSnapshot currentEpisode is not Latched
>       - degradationFacts active is true
>       - degradationFacts invalid is true
>       - returnFacts invalid is true
>       - returnFacts fresh is true exactly when F is true
>       - selectedIndication is not ReturnSelected
>       - conflictClass is not SingleOrNone
>   - At least one of the following conditions holds:
>     
>       - episodeSnapshot currentEpisode is not ReturnArmed
>       - degradationFacts active is true
>       - degradationFacts invalid is true
>       - returnFacts invalid is true
>       - returnFacts clear is true exactly when F is true
>       - selectedIndication is not NoneSelected
>       - conflictClass is not SingleOrNone
>   - At least one of the following conditions holds:
>     
>       - episodeSnapshot currentEpisode is not ReturnArmed
>       - The first condition holds exactly when the second condition holds:
>         
>         **First condition:**
>         
>         At least one of the following conditions holds:
>         
>           - degradationFacts active is true
>           - degradationFacts invalid is true
>           - returnFacts invalid is true
>           - conflictClass is MultipleActionable
>           - selectedIndication is InvalidSelected
>           - selectedIndication is DegradedSelected
>           - selectedIndication is OffSelected
>           - selectedIndication is MaintenanceSelected
>           - selectedIndication is OnSelected
>           - selectedIndication is StartSelected
>         
>         **Second condition:**
>         
>         F is true.

> When all applicability conditions are met, RecoveryEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> decisionToEpisode is Wait.

### Requirements for ReturnEpochOwner

#### Contract clauses evaluated in the initialization phase

May modify: previousReturn

##### `INITIAL_RETURN_HISTORY_INVALID` — Required behavior

> During contract evaluation for the initialization phase, ReturnEpochOwner shall set previousReturn to Invalid, factsToConflict fresh to true exactly when F is true, factsToConflict held to true exactly when F is true, factsToConflict clear to true exactly when F is true, factsToConflict invalid to true exactly when T is true, factsToPriority to factsToConflict, and factsToRecovery to factsToConflict.

#### Contract clauses evaluated in the compute phase

May modify: previousReturn

##### `RETURN_EPOCH_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, ReturnEpochOwner shall set factsToConflict fresh to true exactly when the value of previousReturn on entry is Clear and returnIndication level is Asserted, factsToConflict held to true exactly when the value of previousReturn on entry is Asserted and returnIndication level is Asserted, factsToConflict clear to true exactly when returnIndication level is Clear, factsToConflict invalid to true exactly when returnIndication level is Invalid, factsToPriority to factsToConflict, factsToRecovery to factsToConflict, and previousReturn to returnIndication level.
