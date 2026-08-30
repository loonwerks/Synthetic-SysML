# Vehicle Controller Operating-Mode Coordinator

## Selected system context

### Need, purpose, goals, and operational context

NEED-01: A vehicle control environment needs one bounded coordinator to turn potentially
simultaneous start, on, off, maintenance, degraded, and return-to-normal indications
into an unambiguous controller operating-mode disposition without allowing held
indications or inapplicable transitions to masquerade as new commands.

GOAL-01: The system shall publish exactly one of `Off`, `Starting`, `On`, `Maintenance`,
or `Degraded` on every abstract evaluation and shall admit `Off -> Starting -> On` only
through distinct fresh start and fresh on indications.

GOAL-02: The system shall resolve every simultaneous-intent conflict with the declared
priority `OFF > invalid condition > degraded condition > MAINTENANCE > RETURN > ON >
START > HOLD` and shall expose either suppression of a lower-priority intent or an
incompatible persistent source-level combination.

GOAL-03: The system shall enter `Degraded` on current invalid or degraded condition
evidence unless level-sensitive off wins, remember the interrupted logical mode, and
resume that stored mode only after condition evidence is current-normal and a fresh
return-to-normal indication is selected.

GOAL-04: The system shall reject state-inapplicable start, on, maintenance, and return
intents without silently changing the controlled mode and shall publish an observable
rejection status.

CTX-01: The Vehicle Indication Source is an abstract external originator of start, on,
and off levels. The seed does not identify the human or automated authority, so this
actor and its responsibility for deliberate levels are pilot assumptions.

CTX-02: The Service Indication Source is an abstract external originator of maintenance
and return-to-normal levels. It does not perform maintenance or prove restoration; it
supplies requests only.

CTX-03: The Controller Condition Source is external and reports a finite condition plus
whether that report is current. The system does not sense temperature, execute
self-test, locate a fault, or establish physical health.

CTX-04: The VehicleController Mode Consumer receives the selected logical mode
disposition and may use it outside this boundary. No downstream implementation or
acknowledgement is modeled.

CTX-05: The Parking-Brake and Status Consumers receive the coordination outcome. `Apply`
and `Release` are supervisory dispositions only; physical brake motion, effectiveness,
and feedback remain outside the boundary.

CTX-06: The Road, drivetrain, electrical-power network, fuel system, temperature
sensing, and maintenance execution remain external context and exchange no modeled
quantity with this selected boundary.

### Exact finite monitored and controlled boundary

MON-01: The system shall monitor `lifecycle_levels: LifecycleLevels` from CTX-01 on each
evaluation; PART-01 is the sole owner of lifecycle rising-edge recognition and
lifecycle-level conflict classification.

MON-02: The system shall monitor `service_levels: ServiceLevels` from CTX-02 on each
evaluation; PART-02 is the sole owner of service rising-edge recognition and
service-level conflict classification.

MON-03: The system shall monitor `condition_evidence: ConditionEvidence` from CTX-03 on
each evaluation; PART-03 is the sole owner of the currency-sensitive condition
assessment.

CTRL-01: The system shall control exactly one `controller_mode: ControllerMode`
delivered to CTX-04. It is PART-07's applied next mode for the current abstract
evaluation, not a claim about physical vehicle state.

CTRL-02: The system shall control exactly one `coordination_outcome:
CoordinationOutcome` delivered to CTX-05. Its parking-brake and status fields are
derived together from the selected intent and applied transition result.

### Observable modes and allowed transitions

MODE-01: `Off` publishes controller mode `Off`, commands parking-brake `Apply`, and
accepts only a selected fresh start as progress toward operation; it is externally
distinct as `IdleOff` unless a higher diagnostic status applies.

MODE-02: `Starting` publishes controller mode `Starting`, commands parking-brake
`Apply`, and accepts only a selected fresh on indication as progress to `On`; it is
externally distinct as `StartingSequence` unless a higher diagnostic status applies.

MODE-03: `On` publishes controller mode `On`, uniquely commands parking-brake `Release`,
and remains operating on hold; it is externally distinct as `Operating` unless a higher
diagnostic status applies.

MODE-04: `Maintenance` publishes controller mode `Maintenance`, commands parking-brake
`Apply`, rejects start and on as inapplicable, and uses a selected fresh return to leave
for `Off`; it is externally distinct as `MaintenanceHandoff` unless a higher diagnostic
status applies.

MODE-05: `Degraded` publishes controller mode `Degraded`, commands parking-brake
`Apply`, rejects maintenance, start, and on as inapplicable, and uses only a selected
fresh return under current-normal evidence to resume the stored target; invalid or
degraded evidence prevents return from being selected.

### Required behavior, risks, faults, and objective evidence

RISK-01: If stale or invalid condition evidence is treated as current-normal, the
coordinator can retain or resume an operating mode without usable evidence under this
pilot policy.

RISK-02: If simultaneous requests are resolved inconsistently, a lower-priority
transition can replace shutdown, service handoff, or recovery intent.

RISK-03: If a held start, on, maintenance, or return level is repeatedly treated as
fresh, the mode can transition without a new indication episode.

RISK-04: If state applicability or directive application is omitted, fresh on, start,
maintenance, or return indications can jump to an unsupported mode or bypass degraded
recovery.

### Assumptions, source limitations, and resolved Model questions

ASM-01: CTX-01 is responsible for stable Boolean lifecycle levels during each abstract
evaluation and for lowering a level before expecting another fresh event. Rationale: the
source does not define event encoding, so level plus rising-edge semantics make
freshness finite and reviewable.

ASM-02: CTX-02 is responsible for stable Boolean service levels during each evaluation
and for lowering them before a new service event. Rationale: this prevents a held return
or maintenance request from acting as an implicit repeated command.

ASM-03: CTX-03 is responsible for the truth of the reported finite condition and its
currency flag for the current evaluation. Rationale: the selected coordinator consumes
an abstraction and does not own sensing, diagnosis, thresholding, or maintenance proof.

ASM-04: CTX-04 and CTX-05 interpret outputs from one abstract evaluation coherently; no
physical latency or scheduling bound is claimed. Rationale: atomic logical evaluation is
a pilot abstraction needed for contract and scenario review.

ASM-05: Direct resume from `Degraded` restores only the coordinator's remembered logical
mode; it does not restart machinery, re-enable power, clear health, or prove readiness.
Rationale: this recovery distinguishes logical mode coordination from replicate-1 start
authorization and avoids importing physical causal claims.

## Supporting contract definitions

### State `Vehicle_Mode_Coordinator::LifecycleEventOwner::previousStart`

State `previousStart` has type `Base_Types::Boolean`.

### State `Vehicle_Mode_Coordinator::LifecycleEventOwner::previousOn`

State `previousOn` has type `Base_Types::Boolean`.

### State `Vehicle_Mode_Coordinator::LifecycleEventOwner::previousOff`

State `previousOff` has type `Base_Types::Boolean`.

### State `Vehicle_Mode_Coordinator::ModeTransitionApplicationOwner::controllerMode`

State `controllerMode` has type `Vehicle_Mode_Coordinator::ControllerMode`.

### State `Vehicle_Mode_Coordinator::RecoveryTargetOwner::recoveryTarget`

State `recoveryTarget` has type `Vehicle_Mode_Coordinator::RecoveryTarget`.

### State `Vehicle_Mode_Coordinator::ServiceEventOwner::previousMaintenance`

State `previousMaintenance` has type `Base_Types::Boolean`.

### State `Vehicle_Mode_Coordinator::ServiceEventOwner::previousReturn`

State `previousReturn` has type `Base_Types::Boolean`.

### `Vehicle_Mode_Coordinator::IntentArbitrationOwner::atLeastTwoCandidates`

- Function category: Strictly pure
- Input `a` has type `Base_Types::Boolean`.
- Input `b` has type `Base_Types::Boolean`.
- Input `c` has type `Base_Types::Boolean`.
- Input `d` has type `Base_Types::Boolean`.
- Input `e` has type `Base_Types::Boolean`.
- Input `f` has type `Base_Types::Boolean`.
- Input `g` has type `Base_Types::Boolean`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `a` is true
>       - At least one of the following conditions holds:
>         
>           - `b` is true
>           - `c` is true
>           - `d` is true
>           - `e` is true
>           - `f` is true
>           - `g` is true
>   - All of the following conditions hold:
>     
>       - `b` is true
>       - At least one of the following conditions holds:
>         
>           - `c` is true
>           - `d` is true
>           - `e` is true
>           - `f` is true
>           - `g` is true
>   - All of the following conditions hold:
>     
>       - `c` is true
>       - At least one of the following conditions holds:
>         
>           - `d` is true
>           - `e` is true
>           - `f` is true
>           - `g` is true
>   - All of the following conditions hold:
>     
>       - `d` is true
>       - At least one of the following conditions holds:
>         
>           - `e` is true
>           - `f` is true
>           - `g` is true
>   - All of the following conditions hold:
>     
>       - `e` is true
>       - At least one of the following conditions holds:
>         
>           - `f` is true
>           - `g` is true
>   - All of the following conditions hold:
>     
>       - `f` is true
>       - `g` is true.

## Detailed behavioral requirements

### Requirements for ConditionAssessmentOwner

#### Contract clauses evaluated in the compute phase

##### `CONDITION_QUALIFICATION` — Required behavior

> During contract evaluation for the compute phase, ConditionAssessmentOwner shall produce a result for which if conditionEvidence reportCurrency is Stale, then conditionAssessment is Unusable, if conditionEvidence reportCurrency is Current and conditionEvidence reportedCondition is Invalid, then conditionAssessment is Unusable, if conditionEvidence reportCurrency is Current and conditionEvidence reportedCondition is Degraded, then conditionAssessment is CurrentDegraded, and if conditionEvidence reportCurrency is Current and conditionEvidence reportedCondition is Normal, then conditionAssessment is CurrentNormal.

### Requirements for CoordinationPublicationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_COORDINATION_OUTCOME` — Required behavior

> During contract evaluation for the initialization phase, CoordinationPublicationOwner shall set coordinationOutcome parkingBrake to Apply and coordinationOutcome status to IdleOff.

#### Contract clauses evaluated in the compute phase

##### `PARKING_BRAKE_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, CoordinationPublicationOwner shall set coordinationOutcome parkingBrake to Release exactly when appliedResolution nextMode is On.

##### `STATUS_PRECEDENCE` — Required behavior

> During contract evaluation for the compute phase, CoordinationPublicationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is ShutdownDominant
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationResult selectedIntent is SelectOff
>       - arbitrationResult priorityConflict is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is RequestInapplicable
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - arbitrationResult selectedIntent is SelectOff
>           - arbitrationResult priorityConflict is true
>       - appliedResolution kind is Reject
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is RecoveryResumed
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - arbitrationResult selectedIntent is SelectOff
>           - arbitrationResult priorityConflict is true
>       - appliedResolution kind is not Reject
>       - appliedResolution kind is ResumeStored
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is DegradedInvalid
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - arbitrationResult selectedIntent is SelectOff
>           - arbitrationResult priorityConflict is true
>       - appliedResolution kind is not Reject
>       - appliedResolution kind is not ResumeStored
>       - arbitrationResult selectedIntent is SelectInvalidDegraded
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is DegradedCondition
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - It is not the case that:
>             
>             All of the following conditions hold:
>             
>               - arbitrationResult selectedIntent is SelectOff
>               - arbitrationResult priorityConflict is true
>           - appliedResolution kind is not Reject
>           - appliedResolution kind is not ResumeStored
>           - arbitrationResult selectedIntent is SelectConditionDegraded
>       - All of the following conditions hold:
>         
>           - It is not the case that:
>             
>             All of the following conditions hold:
>             
>               - arbitrationResult selectedIntent is SelectOff
>               - arbitrationResult priorityConflict is true
>           - appliedResolution kind is not Reject
>           - appliedResolution kind is not ResumeStored
>           - arbitrationResult selectedIntent is not SelectInvalidDegraded
>           - arbitrationResult selectedIntent is not SelectConditionDegraded
>           - arbitrationResult priorityConflict is false
>           - appliedResolution nextMode is Degraded
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is RequestConflict
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - arbitrationResult selectedIntent is SelectOff
>           - arbitrationResult priorityConflict is true
>       - appliedResolution kind is not Reject
>       - appliedResolution kind is not ResumeStored
>       - arbitrationResult selectedIntent is not SelectInvalidDegraded
>       - arbitrationResult selectedIntent is not SelectConditionDegraded
>       - arbitrationResult priorityConflict is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is IdleOff
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationResult priorityConflict is false
>       - appliedResolution kind is not Reject
>       - appliedResolution kind is not ResumeStored
>       - arbitrationResult selectedIntent is not SelectInvalidDegraded
>       - arbitrationResult selectedIntent is not SelectConditionDegraded
>       - appliedResolution nextMode is Off
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is StartingSequence
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationResult priorityConflict is false
>       - appliedResolution kind is not Reject
>       - appliedResolution kind is not ResumeStored
>       - arbitrationResult selectedIntent is not SelectInvalidDegraded
>       - arbitrationResult selectedIntent is not SelectConditionDegraded
>       - appliedResolution nextMode is Starting
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is Operating
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationResult priorityConflict is false
>       - appliedResolution kind is not Reject
>       - appliedResolution kind is not ResumeStored
>       - arbitrationResult selectedIntent is not SelectInvalidDegraded
>       - arbitrationResult selectedIntent is not SelectConditionDegraded
>       - appliedResolution nextMode is On
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     coordinationOutcome status is MaintenanceHandoff
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - arbitrationResult priorityConflict is false
>       - appliedResolution kind is not Reject
>       - appliedResolution kind is not ResumeStored
>       - arbitrationResult selectedIntent is not SelectInvalidDegraded
>       - arbitrationResult selectedIntent is not SelectConditionDegraded
>       - appliedResolution nextMode is Maintenance.

### Requirements for IntentArbitrationOwner

#### Contract clauses evaluated in the compute phase

##### `PRIORITY_CONFLICT` — Required behavior

> During contract evaluation for the compute phase, IntentArbitrationOwner shall set arbitrationForQualification priorityConflict to true exactly when At least one of the following conditions holds:
>
>   - lifecycleFacts lifecycleConflict is true
>   - serviceFacts serviceConflict is true
>   - the result of IntentArbitrationOwner vehicleModeCoordinationProcess intentArbitrationOwner atLeastTwoCandidates for (lifecycleFacts offActive is true, conditionAssessment is Unusable, conditionAssessment is CurrentDegraded, serviceFacts freshMaintenance is true, serviceFacts freshReturn is true, lifecycleFacts freshOn is true, lifecycleFacts freshStart is true) is true and arbitrationForPublication priorityConflict to true exactly when arbitrationForQualification priorityConflict is true.

##### `PUBLISH_ARBITRATION` — Required behavior

> During contract evaluation for the compute phase, IntentArbitrationOwner shall set arbitrationForPublication selectedIntent to arbitrationForQualification selectedIntent.

##### `CASE_01_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleFacts offActive is true, IntentArbitrationOwner shall set arbitrationForQualification selectedIntent to SelectOff.

##### `CASE_02_UNUSABLE` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleFacts offActive is false and conditionAssessment is Unusable, IntentArbitrationOwner shall set arbitrationForQualification selectedIntent to SelectInvalidDegraded.

##### `CASE_03_DEGRADED` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleFacts offActive is false and conditionAssessment is CurrentDegraded, IntentArbitrationOwner shall set arbitrationForQualification selectedIntent to SelectConditionDegraded.

##### `CASE_04_MAINTENANCE` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleFacts offActive is false, conditionAssessment is CurrentNormal, and serviceFacts freshMaintenance is true, IntentArbitrationOwner shall set arbitrationForQualification selectedIntent to SelectMaintenance.

##### `CASE_05_RETURN` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleFacts offActive is false, conditionAssessment is CurrentNormal, serviceFacts freshMaintenance is false, and serviceFacts freshReturn is true, IntentArbitrationOwner shall set arbitrationForQualification selectedIntent to SelectReturn.

##### `CASE_06_ON` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleFacts offActive is false, conditionAssessment is CurrentNormal, serviceFacts freshMaintenance is false, serviceFacts freshReturn is false, and lifecycleFacts freshOn is true, IntentArbitrationOwner shall set arbitrationForQualification selectedIntent to SelectOn.

##### `CASE_07_START` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleFacts offActive is false, conditionAssessment is CurrentNormal, serviceFacts freshMaintenance is false, serviceFacts freshReturn is false, lifecycleFacts freshOn is false, and lifecycleFacts freshStart is true, IntentArbitrationOwner shall set arbitrationForQualification selectedIntent to SelectStart.

##### `CASE_08_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if lifecycleFacts offActive is false, conditionAssessment is CurrentNormal, serviceFacts freshMaintenance is false, serviceFacts freshReturn is false, lifecycleFacts freshOn is false, and lifecycleFacts freshStart is false, IntentArbitrationOwner shall set arbitrationForQualification selectedIntent to SelectHold.

### Requirements for LifecycleEventOwner

#### Contract clauses evaluated in the initialization phase

May modify: previousStart, previousOn, previousOff

##### `INITIAL_LIFECYCLE_HISTORY` — Required behavior

> During contract evaluation for the initialization phase, LifecycleEventOwner shall set previousStart to true exactly when F is true, previousOn to true exactly when F is true, previousOff to true exactly when F is true, lifecycleFacts freshStart to true exactly when F is true, lifecycleFacts freshOn to true exactly when F is true, lifecycleFacts offActive to true exactly when F is true, and lifecycleFacts lifecycleConflict to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: previousStart, previousOn, previousOff

##### `LIFECYCLE_RISING_EDGES` — Required behavior

> During contract evaluation for the compute phase, LifecycleEventOwner shall set lifecycleFacts freshStart to true exactly when lifecycleLevels startLevel is true and it is not the case that the value of previousStart on entry is true, lifecycleFacts freshOn to true exactly when lifecycleLevels onLevel is true and it is not the case that the value of previousOn on entry is true, and lifecycleFacts offActive to true exactly when lifecycleLevels offLevel is true.

##### `LIFECYCLE_CONFLICT` — Required behavior

> During contract evaluation for the compute phase, LifecycleEventOwner shall set lifecycleFacts lifecycleConflict to true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - lifecycleLevels startLevel is true
>       - lifecycleLevels onLevel is true
>   - All of the following conditions hold:
>     
>       - lifecycleLevels startLevel is true
>       - lifecycleLevels offLevel is true
>   - All of the following conditions hold:
>     
>       - lifecycleLevels onLevel is true
>       - lifecycleLevels offLevel is true.

##### `STORE_LIFECYCLE_LEVELS` — Required behavior

> During contract evaluation for the compute phase, LifecycleEventOwner shall set previousStart to true exactly when lifecycleLevels startLevel is true, previousOn to true exactly when lifecycleLevels onLevel is true, and previousOff to true exactly when lifecycleLevels offLevel is true.

### Requirements for ModeTransitionApplicationOwner

#### Contract clauses evaluated in the initialization phase

May modify: controllerMode

##### `INITIAL_CONTROLLER_MODE` — Required behavior

> During contract evaluation for the initialization phase, ModeTransitionApplicationOwner shall produce a result for which controllerMode is Off, modeForQualification is Off, modeForRecovery is Off, resolutionForRecovery nextMode is Off, resolutionForRecovery kind is Stay, resolutionForRecovery accepted is true, resolutionForPublication nextMode is Off, resolutionForPublication kind is Stay, resolutionForPublication accepted is true, and appliedNextMode is Off.

#### Contract clauses evaluated in the compute phase

May modify: controllerMode

##### `PUBLISH_PRE_MODE` — Required behavior

> During contract evaluation for the compute phase, ModeTransitionApplicationOwner shall set modeForQualification to the value of controllerMode on entry and modeForRecovery to the value of controllerMode on entry.

##### `APPLY_STAY_OR_REJECT` — Required behavior

> During contract evaluation for the compute phase, ModeTransitionApplicationOwner shall produce a result for which if qualifiedTransition is QualifiedStay, then resolutionForRecovery nextMode is the value of controllerMode on entry, resolutionForRecovery kind is Stay, and resolutionForRecovery accepted is true and if qualifiedTransition is QualifiedReject, then resolutionForRecovery nextMode is the value of controllerMode on entry, resolutionForRecovery kind is Reject, and resolutionForRecovery accepted is false.

##### `APPLY_GO_DIRECTIVES` — Required behavior

> During contract evaluation for the compute phase, ModeTransitionApplicationOwner shall produce a result for which if qualifiedTransition is QualifiedGoOff, then resolutionForRecovery nextMode is Off, resolutionForRecovery kind is GoOff, and resolutionForRecovery accepted is true, if qualifiedTransition is QualifiedGoStarting, then resolutionForRecovery nextMode is Starting, resolutionForRecovery kind is GoStarting, and resolutionForRecovery accepted is true, if qualifiedTransition is QualifiedGoOn, then resolutionForRecovery nextMode is On, resolutionForRecovery kind is GoOn, and resolutionForRecovery accepted is true, if qualifiedTransition is QualifiedGoMaintenance, then resolutionForRecovery nextMode is Maintenance, resolutionForRecovery kind is GoMaintenance, and resolutionForRecovery accepted is true, and if qualifiedTransition is QualifiedGoDegraded, then resolutionForRecovery nextMode is Degraded, resolutionForRecovery kind is GoDegraded, and resolutionForRecovery accepted is true.

##### `APPLY_STORED_RESUME` — Required behavior

> During contract evaluation for the compute phase, ModeTransitionApplicationOwner shall produce a result for which if qualifiedTransition is QualifiedResumeStored, then if storedRecoveryTarget is Off, then resolutionForRecovery nextMode is Off, if storedRecoveryTarget is Starting, then resolutionForRecovery nextMode is Starting, if storedRecoveryTarget is On, then resolutionForRecovery nextMode is On, resolutionForRecovery kind is ResumeStored, and resolutionForRecovery accepted is true.

##### `PUBLISH_APPLIED_RESOLUTION` — Required behavior

> During contract evaluation for the compute phase, ModeTransitionApplicationOwner shall set resolutionForPublication nextMode to resolutionForRecovery nextMode, resolutionForPublication kind to resolutionForRecovery kind, and resolutionForPublication accepted to true exactly when resolutionForRecovery accepted is true.

##### `COMMIT_AND_DELIVER_MODE` — Required behavior

> During contract evaluation for the compute phase, ModeTransitionApplicationOwner shall set controllerMode to resolutionForRecovery nextMode and appliedNextMode to resolutionForRecovery nextMode.

### Requirements for RecoveryTargetOwner

#### Contract clauses evaluated in the initialization phase

May modify: recoveryTarget

##### `INITIAL_RECOVERY_TARGET` — Required behavior

> During contract evaluation for the initialization phase, RecoveryTargetOwner shall set recoveryTarget to Off and storedRecoveryTarget to Off.

#### Contract clauses evaluated in the compute phase

May modify: recoveryTarget

##### `PUBLISH_PRE_UPDATE_TARGET` — Required behavior

> During contract evaluation for the compute phase, RecoveryTargetOwner shall set storedRecoveryTarget to the value of recoveryTarget on entry.

##### `UPDATE_RECOVERY_TARGET` — Required behavior

> During contract evaluation for the compute phase, RecoveryTargetOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - currentMode is Starting
>       - appliedResolution nextMode is Degraded
>     
>     **Then:**
>     
>     recoveryTarget is Starting
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - currentMode is On
>       - appliedResolution nextMode is Degraded
>     
>     **Then:**
>     
>     recoveryTarget is On
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - currentMode is Off
>           - currentMode is Maintenance
>       - appliedResolution nextMode is Degraded
>     
>     **Then:**
>     
>     recoveryTarget is Off
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - currentMode is Degraded
>       - appliedResolution nextMode is Degraded
>     
>     **Then:**
>     
>     recoveryTarget is the value of recoveryTarget on entry
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - currentMode is Degraded
>       - appliedResolution nextMode is not Degraded
>     
>     **Then:**
>     
>     recoveryTarget is Off
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - currentMode is not Degraded
>       - appliedResolution nextMode is not Degraded
>     
>     **Then:**
>     
>     recoveryTarget is the value of recoveryTarget on entry.

### Requirements for ServiceEventOwner

#### Contract clauses evaluated in the initialization phase

May modify: previousMaintenance, previousReturn

##### `INITIAL_SERVICE_HISTORY` — Required behavior

> During contract evaluation for the initialization phase, ServiceEventOwner shall set previousMaintenance to true exactly when F is true, previousReturn to true exactly when F is true, serviceFacts freshMaintenance to true exactly when F is true, serviceFacts freshReturn to true exactly when F is true, and serviceFacts serviceConflict to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: previousMaintenance, previousReturn

##### `SERVICE_RISING_EDGES` — Required behavior

> During contract evaluation for the compute phase, ServiceEventOwner shall set serviceFacts freshMaintenance to true exactly when serviceLevels maintenanceLevel is true and it is not the case that the value of previousMaintenance on entry is true and serviceFacts freshReturn to true exactly when serviceLevels returnNormalLevel is true and it is not the case that the value of previousReturn on entry is true.

##### `SERVICE_CONFLICT` — Required behavior

> During contract evaluation for the compute phase, ServiceEventOwner shall set serviceFacts serviceConflict to true exactly when serviceLevels maintenanceLevel is true and serviceLevels returnNormalLevel is true.

##### `STORE_SERVICE_LEVELS` — Required behavior

> During contract evaluation for the compute phase, ServiceEventOwner shall set previousMaintenance to true exactly when serviceLevels maintenanceLevel is true and previousReturn to true exactly when serviceLevels returnNormalLevel is true.

### Requirements for TransitionQualificationOwner

#### Contract clauses evaluated in the compute phase

##### `CASE_09_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectOff, TransitionQualificationOwner shall set qualifiedTransition to QualifiedGoOff.

##### `CASE_10_FORCED_DEGRADED` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectInvalidDegraded or arbitrationResult selectedIntent is SelectConditionDegraded, TransitionQualificationOwner shall set qualifiedTransition to QualifiedGoDegraded.

##### `CASE_11_MAINTENANCE_APPLICABLE` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectMaintenance and currentMode is not Degraded, TransitionQualificationOwner shall set qualifiedTransition to QualifiedGoMaintenance.

##### `CASE_12_MAINTENANCE_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectMaintenance and currentMode is Degraded, TransitionQualificationOwner shall set qualifiedTransition to QualifiedReject.

##### `CASE_13_RESUME` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectReturn and currentMode is Degraded, TransitionQualificationOwner shall set qualifiedTransition to QualifiedResumeStored.

##### `CASE_14_LEAVE_MAINTENANCE` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectReturn and currentMode is Maintenance, TransitionQualificationOwner shall set qualifiedTransition to QualifiedGoOff.

##### `CASE_15_RETURN_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 RETURN REJECTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - arbitrationResult selectedIntent is SelectReturn
>   - At least one of the following conditions holds:
>     
>       - currentMode is Off
>       - currentMode is Starting
>       - currentMode is On.

> When all applicability conditions are met, TransitionQualificationOwner shall produce a result for which all of the following conditions hold:
>
> qualifiedTransition is QualifiedReject.

##### `CASE_16_ON_APPLICABLE` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectOn and currentMode is Starting, TransitionQualificationOwner shall set qualifiedTransition to QualifiedGoOn.

##### `CASE_17_ON_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectOn and currentMode is not Starting, TransitionQualificationOwner shall set qualifiedTransition to QualifiedReject.

##### `CASE_18_START_APPLICABLE` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectStart and currentMode is Off, TransitionQualificationOwner shall set qualifiedTransition to QualifiedGoStarting.

##### `CASE_19_START_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectStart and currentMode is not Off, TransitionQualificationOwner shall set qualifiedTransition to QualifiedReject.

##### `CASE_20_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if arbitrationResult selectedIntent is SelectHold, TransitionQualificationOwner shall set qualifiedTransition to QualifiedStay.
