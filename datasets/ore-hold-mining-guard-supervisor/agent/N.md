# Ore-Hold Mining Guard Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: A mining-frigate operating context needs a bounded supervisor that prevents
continued logical mining authorization when the ore hold is reported nearly full or when
selected mining-support evidence is unacceptable, while avoiding automatic restart from
stale pilot levels after the inhibiting condition clears.

PURPOSE-01: The system will supervise whether further mining may logically continue
before offload. It will own one mining-guard mode, issue a stop-or-continue disposition,
indicate a nearly-full hold as ready for a later offload, and coordinate recovery; it
will not perform mining, move cargo, control docking, admit offload, reconcile ship and
warehouse evidence, or claim transfer completion.

GOAL-01: The system shall issue `ContinueMining` only when its owned next mode is
`Mining` and the current hold and mining-support assessments are valid and acceptable.

GOAL-02: The system shall issue `StopMining` and enter a protected mode on a valid
`NearlyFull` observation, an invalid boundary sample, or a valid unavailable
mining-support condition according to the ordered cases below.

GOAL-03: The system shall indicate `ReadyForLaterOffload` exactly while the current
evaluation resolves to `CapacityHold`; this is a nearly-full supervisory indication and
not an offload request, permission, physical readiness proof, or completion finding.

GOAL-04: The system shall prevent a held or same-evaluation start or resume level from
restarting mining after protection; recovery shall require an acceptable clearing
evaluation and a later fresh `resume` rising edge.

### Operational context

CTX-01: The Pilot Command Authority is outside the system and supplies start, halt, and
resume levels with one validity status. It is responsible for deasserting and later
reasserting a level when a new fresh request is intended.

CTX-02: The Ore-Hold Observation Source is outside the system and supplies the finite
room-available or nearly-full observation and its validity. It owns any sensing,
threshold comparison, calibration, and physical association with the ore hold.

CTX-03: The Mining Support Observation Source is outside the system and supplies finite
asteroid, mining-laser, and target-lock observations with one validity status. It owns
the underlying observations and does not delegate physical mining control to this
supervisor.

CTX-04: The Mining Control Consumer is outside the system and receives the logical
stop-or-continue disposition. Whether mining equipment obeys the disposition and whether
ore enters the hold are outside the boundary.

CTX-05: The Pilot Status Recipient is outside the system and receives supervisory status
and the later-offload readiness indication. It shall not interpret either output as a
cargo-transfer or physical-capacity certification.

CTX-06: The station, warehouse, docking service, and any cargo-transfer mechanism remain
external context with no modeled interaction. An external activity may cause a later
valid `RoomAvailable` observation, but its request, progress, evidence, and completion
are neither observed nor decided here.

### Exact finite monitored and controlled boundary

MON-01: The root shall monitor `pilot_request: PilotRequestSample` from CTX-01. PART-01
is the only usage allowed to retain prior request levels or derive validity, conflict,
priority, and fresh rising-edge facts.

MON-02: The root shall monitor `hold_sample: HoldSample` from CTX-02. PART-02 is the
only usage allowed to derive the qualitative hold assessment.

MON-03: The root shall monitor `mining_support: MiningSupportSample` from CTX-03.
PART-03 is the only usage allowed to combine asteroid, laser, target, and validity
observations into a support assessment.

CTRL-01: The root shall control `mining_command: MiningCommand` delivered to CTX-04.
This is a logical supervisory disposition with no physical-effect claim.

CTRL-02: The root shall control `guard_status: GuardStatus` delivered to CTX-05. It
reports the selected current resolution without reporting cargo-transfer progress or
completion.

CTRL-03: The root shall control `offload_readiness: OffloadReadiness` delivered to
CTX-05. `ReadyForLaterOffload` means only that the selected nearly-full guard is active.

### Required behaviors, risks, faults, and recovery

RISK-01: If a nearly-full or invalid hold observation permits mining to continue,
additional logical mining can be authorized after the selected capacity protection basis
is reached or lost.

RISK-02: If asteroid depletion, laser overheat, or target interference is ignored, the
supervisor can continue mining when its selected support applicability basis is absent.

RISK-03: If clearing or restoration accepts a retained request, the system can restart
mining without a deliberate post-protection resume action.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for the truth of request status and for lowering then
reasserting a level when a new request is intended. Storing invalid raw levels to
prevent replay is a conservative pilot choice, not a source fact.

ASM-02: CTX-02 is responsible for the validity and meaning of `RoomAvailable` and
`NearlyFull`. The system assumes only that the two values are mutually exclusive per
sample; it makes no claim about threshold magnitude, sensor accuracy, or physical
remaining capacity.

ASM-03: CTX-03 is responsible for each support field and their shared validity. The
selected rule that all three positive values are required for `SupportReady` is a pilot
policy and not a source-established mining requirement.

ASM-04: CTX-04 is responsible for consuming the latest logical mining command. The
abstract assumes no command acknowledgement and therefore claims neither physical
stopping nor cargo retention effectiveness.

ASM-05: One logical evaluation observes one coherent sample from each input and
publishes one coherent next-state outcome. No physical simultaneity, latency,
periodicity, scheduler order, or execution rate is claimed.

ASM-06: The supervisor covers one ore hold and one logical mining episode at a time.
Cargo removal may be one environmental cause of a later `RoomAvailable` observation, but
concurrency, transfer identity, warehouse evidence, and offload completion remain
outside the boundary.

## Supporting contract definitions

### State `Ore_Hold_Mining_Guard_Supervisor::OreHoldDecisionOwner::guardMode`

State `guardMode` has type `Ore_Hold_Mining_Guard_Supervisor::GuardMode`.

### State `Ore_Hold_Mining_Guard_Supervisor::RequestFreshnessPriorityOwner::previousStart`

State `previousStart` has type `Base_Types::Boolean`.

### State `Ore_Hold_Mining_Guard_Supervisor::RequestFreshnessPriorityOwner::previousHalt`

State `previousHalt` has type `Base_Types::Boolean`.

### State `Ore_Hold_Mining_Guard_Supervisor::RequestFreshnessPriorityOwner::previousResume`

State `previousResume` has type `Base_Types::Boolean`.

## Detailed behavioral requirements

### Requirements for GuardReportingDerivationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REPORTING_SAFE` — Required behavior

> During contract evaluation for the initialization phase, GuardReportingDerivationOwner shall set guard status to Idle and offload readiness to NotReadyForOffload.

#### Contract clauses evaluated in the compute phase

##### `GUARD_STATUS_EXACT_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, GuardReportingDerivationOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - guard resolution reason is InvalidEvidence
>       - guard status is InputFault
>   - All of the following conditions hold:
>     
>       - guard resolution reason is HaltSelected
>       - guard status is HaltedByPilot
>   - All of the following conditions hold:
>     
>       - guard resolution reason is HoldGuardReached
>       - guard status is GuardedNearlyFull
>   - All of the following conditions hold:
>     
>       - guard resolution reason is SupportUnavailable
>       - guard status is HeldForSupport
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - guard resolution reason is StartAdmitted
>           - guard resolution reason is MiningMaintained
>           - guard resolution reason is ResumeAdmitted
>       - guard status is MiningAuthorized
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - guard resolution reason is GuardCleared
>           - guard resolution reason is EvidenceRestored
>           - guard resolution reason is RecoveryWaiting
>       - guard status is AwaitingFreshResume
>   - All of the following conditions hold:
>     
>       - guard resolution reason is IdleWaiting
>       - guard resolution requestConflict is true
>       - guard status is RequestConflict
>   - All of the following conditions hold:
>     
>       - guard resolution reason is IdleWaiting
>       - guard resolution requestConflict is false
>       - guard status is Idle.

##### `OFFLOAD_READINESS_EXACT_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, GuardReportingDerivationOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - guard resolution nextMode is CapacityHold
>       - offload readiness is ReadyForLaterOffload
>   - All of the following conditions hold:
>     
>       - guard resolution nextMode is not CapacityHold
>       - offload readiness is NotReadyForOffload.

### Requirements for HoldGuardQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HOLD_ASSESSMENT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, HoldGuardQualificationOwner shall set hold assessment to InvalidHold.

#### Contract clauses evaluated in the compute phase

##### `HOLD_GUARD_QUALIFICATION` — Required behavior

> During contract evaluation for the compute phase, HoldGuardQualificationOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - hold sample status is Invalid
>       - hold assessment is InvalidHold
>   - All of the following conditions hold:
>     
>       - hold sample status is Valid
>       - hold sample observation is RoomAvailable
>       - hold assessment is SpaceAvailable
>   - All of the following conditions hold:
>     
>       - hold sample status is Valid
>       - hold sample observation is NearlyFull
>       - hold assessment is GuardReached.

### Requirements for MiningCommandDerivationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_MINING_COMMAND_SAFE` — Required behavior

> During contract evaluation for the initialization phase, MiningCommandDerivationOwner shall set mining command to StopMining.

#### Contract clauses evaluated in the compute phase

##### `MINING_COMMAND_EXACT_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, MiningCommandDerivationOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - guard resolution nextMode is Mining
>       - mining command is ContinueMining
>   - All of the following conditions hold:
>     
>       - guard resolution nextMode is not Mining
>       - mining command is StopMining.

### Requirements for MiningSupportQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SUPPORT_ASSESSMENT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, MiningSupportQualificationOwner shall set support assessment to InvalidSupport.

#### Contract clauses evaluated in the compute phase

##### `MINING_SUPPORT_QUALIFICATION` — Required behavior

> During contract evaluation for the compute phase, MiningSupportQualificationOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - mining support status is Invalid
>       - support assessment is InvalidSupport
>   - All of the following conditions hold:
>     
>       - mining support status is Valid
>       - mining support asteroid is OreAvailable
>       - mining support laser is Ready
>       - mining support target is Locked
>       - support assessment is SupportReady
>   - All of the following conditions hold:
>     
>       - mining support status is Valid
>       - At least one of the following conditions holds:
>         
>           - mining support asteroid is not OreAvailable
>           - mining support laser is not Ready
>           - mining support target is not Locked
>       - support assessment is SupportBlocked.

### Requirements for OreHoldDecisionOwner

#### Contract clauses evaluated in the initialization phase

May modify: guardMode

##### `INITIAL_DECISION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, OreHoldDecisionOwner shall set guardMode to Idle, resolution to command nextMode to Idle, resolution to command reason to IdleWaiting, resolution to command requestConflict to true exactly when F is true, resolution to reporting nextMode to Idle, resolution to reporting reason to IdleWaiting, and resolution to reporting requestConflict to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: guardMode

##### `INVALID_ASSESSMENT` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is InvalidRequest, hold assessment is InvalidHold, or support assessment is InvalidSupport, OreHoldDecisionOwner shall set guardMode to ConditionHold, resolution to command nextMode to ConditionHold, resolution to command reason to InvalidEvidence, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to ConditionHold, resolution to reporting reason to InvalidEvidence, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `HALT_DOMINANT` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is not InvalidRequest, hold assessment is not InvalidHold, support assessment is not InvalidSupport, and request assessment disposition is HaltDominant, OreHoldDecisionOwner shall set guardMode to Idle, resolution to command nextMode to Idle, resolution to command reason to HaltSelected, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to Idle, resolution to reporting reason to HaltSelected, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `HOLD_GUARD_REACHED` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is not InvalidRequest, hold assessment is not InvalidHold, support assessment is not InvalidSupport, request assessment disposition is not HaltDominant, and hold assessment is GuardReached, OreHoldDecisionOwner shall set guardMode to CapacityHold, resolution to command nextMode to CapacityHold, resolution to command reason to HoldGuardReached, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to CapacityHold, resolution to reporting reason to HoldGuardReached, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `SUPPORT_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is not InvalidRequest, hold assessment is SpaceAvailable, support assessment is SupportBlocked, and request assessment disposition is not HaltDominant, OreHoldDecisionOwner shall set guardMode to ConditionHold, resolution to command nextMode to ConditionHold, resolution to command reason to SupportUnavailable, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to ConditionHold, resolution to reporting reason to SupportUnavailable, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `FRESH_START_ADMITTED` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is FreshStart, hold assessment is SpaceAvailable, support assessment is SupportReady, and the value of guardMode on entry is Idle, OreHoldDecisionOwner shall set guardMode to Mining, resolution to command nextMode to Mining, resolution to command reason to StartAdmitted, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to Mining, resolution to reporting reason to StartAdmitted, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `IDLE_WAITING` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is not InvalidRequest, request assessment disposition is not HaltDominant, request assessment disposition is not FreshStart, hold assessment is SpaceAvailable, support assessment is SupportReady, and the value of guardMode on entry is Idle, OreHoldDecisionOwner shall set guardMode to Idle, resolution to command nextMode to Idle, resolution to command reason to IdleWaiting, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to Idle, resolution to reporting reason to IdleWaiting, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `MINING_MAINTAINED` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is not InvalidRequest, request assessment disposition is not HaltDominant, hold assessment is SpaceAvailable, support assessment is SupportReady, and the value of guardMode on entry is Mining, OreHoldDecisionOwner shall set guardMode to Mining, resolution to command nextMode to Mining, resolution to command reason to MiningMaintained, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to Mining, resolution to reporting reason to MiningMaintained, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `CAPACITY_GUARD_CLEARED` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is not InvalidRequest, request assessment disposition is not HaltDominant, hold assessment is SpaceAvailable, support assessment is SupportReady, and the value of guardMode on entry is CapacityHold, OreHoldDecisionOwner shall set guardMode to RecoveryReady, resolution to command nextMode to RecoveryReady, resolution to command reason to GuardCleared, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to RecoveryReady, resolution to reporting reason to GuardCleared, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `CONDITION_EVIDENCE_RESTORED` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is not InvalidRequest, request assessment disposition is not HaltDominant, hold assessment is SpaceAvailable, support assessment is SupportReady, and the value of guardMode on entry is ConditionHold, OreHoldDecisionOwner shall set guardMode to RecoveryReady, resolution to command nextMode to RecoveryReady, resolution to command reason to EvidenceRestored, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to RecoveryReady, resolution to reporting reason to EvidenceRestored, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `FRESH_RESUME_ADMITTED` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is FreshResume, hold assessment is SpaceAvailable, support assessment is SupportReady, and the value of guardMode on entry is RecoveryReady, OreHoldDecisionOwner shall set guardMode to Mining, resolution to command nextMode to Mining, resolution to command reason to ResumeAdmitted, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to Mining, resolution to reporting reason to ResumeAdmitted, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

##### `RECOVERY_WAITING` — Conditional behavior

> During contract evaluation for the compute phase, if request assessment disposition is not InvalidRequest, request assessment disposition is not HaltDominant, request assessment disposition is not FreshResume, hold assessment is SpaceAvailable, support assessment is SupportReady, and the value of guardMode on entry is RecoveryReady, OreHoldDecisionOwner shall set guardMode to RecoveryReady, resolution to command nextMode to RecoveryReady, resolution to command reason to RecoveryWaiting, resolution to command requestConflict to true exactly when request assessment conflict is true, resolution to reporting nextMode to RecoveryReady, resolution to reporting reason to RecoveryWaiting, and resolution to reporting requestConflict to true exactly when request assessment conflict is true.

### Requirements for RequestFreshnessPriorityOwner

#### Contract clauses evaluated in the initialization phase

May modify: previousStart, previousHalt, previousResume

##### `INITIAL_REQUEST_OWNER_SAFE` — Required behavior

> During contract evaluation for the initialization phase, RequestFreshnessPriorityOwner shall set previousStart to true exactly when F is true, previousHalt to true exactly when F is true, previousResume to true exactly when F is true, request assessment disposition to InvalidRequest, and request assessment conflict to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: previousStart, previousHalt, previousResume

##### `REQUEST_QUALIFICATION_PRIORITY_AND_FRESHNESS` — Required behavior

> During contract evaluation for the compute phase, RequestFreshnessPriorityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - pilot request status is Invalid
>           - request assessment disposition is InvalidRequest
>           - request assessment conflict is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - pilot request status is Valid
>           - The first condition holds exactly when the second condition holds:
>             
>             **First condition:**
>             
>             request assessment conflict is true
>             
>             **Second condition:**
>             
>             At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - pilot request start is true
>                   - pilot request halt is true
>               - All of the following conditions hold:
>                 
>                   - pilot request start is true
>                   - pilot request resume is true
>               - All of the following conditions hold:
>                 
>                   - pilot request halt is true
>                   - pilot request resume is true
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - pilot request halt is true
>                   - request assessment disposition is HaltDominant
>               - All of the following conditions hold:
>                 
>                   - pilot request halt is false
>                   - pilot request resume is true
>                   - It is not the case that:
>                     
>                     the value of previousResume on entry is true
>                   - request assessment disposition is FreshResume
>               - All of the following conditions hold:
>                 
>                   - pilot request halt is false
>                   - At least one of the following conditions holds:
>                     
>                       - pilot request resume is false
>                       - the value of previousResume on entry is true
>                   - pilot request start is true
>                   - It is not the case that:
>                     
>                     the value of previousStart on entry is true
>                   - request assessment disposition is FreshStart
>               - All of the following conditions hold:
>                 
>                   - pilot request halt is false
>                   - At least one of the following conditions holds:
>                     
>                       - pilot request resume is false
>                       - the value of previousResume on entry is true
>                   - At least one of the following conditions holds:
>                     
>                       - pilot request start is false
>                       - the value of previousStart on entry is true
>                   - request assessment disposition is NoFreshRequest
>   - previousStart is true exactly when pilot request start is true
>   - previousHalt is true exactly when pilot request halt is true
>   - previousResume is true exactly when pilot request resume is true.
