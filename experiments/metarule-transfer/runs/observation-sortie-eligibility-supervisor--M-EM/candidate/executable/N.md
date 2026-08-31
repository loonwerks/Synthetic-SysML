# Observation-Sortie Eligibility Supervisor

## Selected system context

### Synopsis

NEED-01: A single forest-fire observation drone has named energy, navigation, radio,
camera, obstacle-sensing, and propulsion equipment, but the seed supplies no policy for
deciding when observation service may proceed. The modeled system will provide a
bounded, implementation-independent eligibility decision from finite evidence without
controlling flight or interpreting fire imagery.

PURPOSE-01: The system shall accept one operator request stream and six
equipment-evidence groups, derive owner-local readiness facts, withhold
observation-sortie permission whenever the selected policy is unsatisfied, expose a
deterministic limiting cause, and require explicit acknowledgment before recovery from
an equipment-evidence fault.

### Evidence and claim classes

ASM-01: Evaluation occurs in discrete logical steps supplied by the surrounding
integration environment. The integration environment is responsible for presenting one
complete input snapshot per step. This is a deterministic experiment abstraction, not a
physical timing or latency claim.

ASM-02: The drone-equipment evidence source is responsible for tagging each evidence
item with finite validity and freshness values. `VALID` and `CURRENT` mean only that the
item is admitted by this pilot policy; they do not establish sensor truth or
performance.

ASM-03: The observation operator is responsible for issuing at most one event from
`NONE`, `SUBMIT`, `CANCEL`, or `ACKNOWLEDGE_RECOVERY` in each evaluation step. Mutual
exclusion is a selected finite interface convention, not a seed fact.

ASM-04: The pilot introduces finite evidence alphabets and exact readiness rules so
exhaustive bounded analysis is possible. The alphabets are abstractions of named
equipment availability, not source-defined equipment semantics.

ASM-05: The observation operator is responsible for acknowledging recovery only after
reviewing the reported limiting cause. The system checks receipt of acknowledgment, not
the quality of that review.

ASM-06: The external drone-control recipient is responsible for treating `WITHHOLD` as
no observation-sortie permission and for not interpreting `PERMIT` as a flight-safety,
navigation-performance, or mission-authorization guarantee.

ASM-07: Missing evidence is represented by the corresponding finite `UNAVAILABLE` or
`UNKNOWN` value rather than by absence of a boundary interaction. This closes every
input partition without prescribing transport mechanisms.

### Goals

GOAL-01: The system shall fail closed: initialization, incomplete readiness, an active
fault, a closed recovery gate, or the absence of a pending request shall result in
`WITHHOLD`. Pass criterion: contract inspection and bounded analysis show no valuation
of those conditions that produces `PERMIT`.

GOAL-02: The system shall grant eligibility only for a pending fresh request when all
six owner-local readiness results are ready and the recovery gate is open. Pass
criterion: the system-level composition guarantee is equivalent to that conjunction.

GOAL-03: The system shall make priority, fault propagation, request state, recovery
state, eligibility, and the reported limiting cause deterministic for every finite input
and prior-state valuation. Pass criterion: all 30 named cases are total, mutually
exclusive within their partitions, and have a single result.

GOAL-04: The system shall retain separate state or decision ownership rather than
centrally recomputing local evidence. Pass criterion: the ownership audit, owner-local
contracts, connection inventory, and bounded analyzer agree that each of the 13 semantic
usages derives its assigned fact.

### Operational context and exact system boundary

CTX-01: The observation operator is outside the system. This role submits, cancels, and
acknowledges requests and receives the eligibility-status report; it is introduced by
the Designer because the seed defines no human actor.

CTX-02: The drone-equipment evidence sources are outside the system. This contextual
grouping supplies battery/power, navigation, radio, camera, obstacle-sensor, and
four-engine evidence; the grouping does not assert that the evidence is correct.

CTX-03: The drone-control recipient is outside the system. It receives the controlled
eligibility directive and is responsible for any downstream flight or observation
action.

CTX-04: The forest-fire environment is contextual but has no direct modeled interaction.
It explains the observation domain only and supplies no fire-detection, localization, or
response input.

MON-01: `energyEvidence` is supplied by CTX-02 and has finite type `EnergyEvidence =
{quality: NOMINAL | LIMITED | UNAVAILABLE | UNKNOWN, validity: VALID | INVALID,
freshness: CURRENT | STALE}`.

MON-02: `navigationEvidence` is supplied by CTX-02 and has finite type
`NavigationEvidence = {gps, inertial, barometric: NOMINAL | NON_NOMINAL | UNAVAILABLE |
UNKNOWN; validity: VALID | INVALID; freshness: CURRENT | STALE}`.

MON-03: `communicationEvidence` is supplied by CTX-02 and has finite type
`EquipmentEvidence = {condition: NOMINAL | NON_NOMINAL | UNAVAILABLE | UNKNOWN,
validity: VALID | INVALID, freshness: CURRENT | STALE}`.

MON-04: `observationEvidence` is supplied by CTX-02 and has the finite
`EquipmentEvidence` type and represents camera availability only, not image quality or
successful observation.

MON-05: `obstacleEvidence` is supplied by CTX-02 and has the finite `EquipmentEvidence`
type and represents obstacle-sensor availability only, not collision avoidance.

MON-06: `propulsionEvidence` is supplied by CTX-02 and has finite type
`PropulsionEvidence = {engine1, engine2, engine3, engine4: NOMINAL | NON_NOMINAL |
UNAVAILABLE | UNKNOWN; validity: VALID | INVALID; freshness: CURRENT | STALE;
alternatingKindsConfirmed: TRUE | FALSE}`. Confirmation is structural concordance only,
not a flight-dynamics claim.

MON-07: `operatorEvent` is supplied by CTX-01 and has finite type `OperatorEvent = NONE
| SUBMIT | CANCEL | ACKNOWLEDGE_RECOVERY`.

CTRL-01: `sortieEligibilityDirective` is received by CTX-03 and has finite type
`SortieDirective = WITHHOLD | PERMIT`. It controls permission from this supervisor only.

CTRL-02: `eligibilityStatus` is received by CTX-01 and has finite type
`EligibilityStatus = {request: IDLE | PENDING | RELEASED; fault: CLEAR | ACTIVE;
recovery: NORMAL | QUARANTINED | AWAITING_ACK; decision: WITHHOLD | PERMIT;
limitingCause: NONE | ENERGY | PROPULSION | NAVIGATION | OBSTACLE | OBSERVATION |
COMMUNICATION | RECOVERY | NO_REQUEST}`.

### Risks, faults, degraded behavior, and recovery

RISK-01: If invalid, stale, unknown, non-nominal, or structurally discordant equipment
evidence were treated as ready, the supervisor could issue permission outside its
selected evidence policy. No likelihood or physical severity is asserted.

RISK-02: If a cleared fault automatically reopened eligibility, transient evidence could
restore permission without an explicit operational recovery decision. No claim is made
that acknowledgment provides physical safety.

RISK-03: If a held or repeated submit created repeated releases, CTX-03 could observe
duplicate authorization cycles for one operator action.

## Supporting contract definitions

### State `Observation_Sortie_Eligibility_Supervisor::PermissionReleaseLedger::releaseMemory`

State `releaseMemory` has type `Observation_Sortie_Eligibility_Supervisor::ReleaseFeedback`.

### State `Observation_Sortie_Eligibility_Supervisor::RecoveryQualificationOwner::recoveryMemory`

State `recoveryMemory` has type `Observation_Sortie_Eligibility_Supervisor::RecoveryPhase`.

### State `Observation_Sortie_Eligibility_Supervisor::RequestLifecycleOwner::requestMemory`

State `requestMemory` has type `Observation_Sortie_Eligibility_Supervisor::RequestPhase`.

## Detailed behavioral requirements

### Requirements for CommunicationEvidenceAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_COMMUNICATION_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, CommunicationEvidenceAssessor shall set communication assessment ready to true exactly when F is true and communication assessment localCause to Invalid.

#### Contract clauses evaluated in the compute phase

##### `COMMUNICATION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if communication evidence validity is Valid, communication evidence freshness is Current, and communication evidence condition is Nominal, CommunicationEvidenceAssessor shall set communication assessment ready to true exactly when T is true and communication assessment localCause to None.

##### `COMMUNICATION_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case COMMUNICATION NOT READY applies under all of the following conditions:
>
> communication evidence validity is Invalid, communication evidence freshness is Stale, or communication evidence condition is not Nominal.

> When all applicability conditions are met, CommunicationEvidenceAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - communication assessment ready is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - communication evidence validity is Invalid
>           - communication assessment localCause is Invalid
>       - All of the following conditions hold:
>         
>           - communication evidence validity is Valid
>           - communication evidence freshness is Stale
>           - communication assessment localCause is Stale
>       - All of the following conditions hold:
>         
>           - communication evidence validity is Valid
>           - communication evidence freshness is Current
>           - communication evidence condition is not Nominal
>           - communication assessment localCause is Condition.

### Requirements for EligibilityDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ELIGIBILITY_WITHHELD` — Required behavior

> During contract evaluation for the initialization phase, EligibilityDecisionOwner shall set eligibility decision directive to Withhold and eligibility decision reason to Recovery.

#### Contract clauses evaluated in the compute phase

##### `ELIGIBILITY_BLOCKED_CONTEXT` — Conditional behavior

> During contract evaluation for the compute phase, case ELIGIBILITY BLOCKED CONTEXT applies under all of the following conditions:
>
> request phase is not Pending, recovery facts gate is Closed, or recovery facts carriedPriority is Cancel.

> When all applicability conditions are met, EligibilityDecisionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - eligibility decision directive is Withhold
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - energy assessment ready is true exactly when F is true
>               - navigation assessment ready is true exactly when F is true
>               - communication assessment ready is true exactly when F is true
>               - observation assessment ready is true exactly when F is true
>               - obstacle assessment ready is true exactly when F is true
>               - propulsion assessment ready is true exactly when F is true
>               - recovery facts carriedPriority is Inhibit
>           - eligibility decision reason is Equipment
>       - All of the following conditions hold:
>         
>           - energy assessment ready is true
>           - navigation assessment ready is true
>           - communication assessment ready is true
>           - observation assessment ready is true
>           - obstacle assessment ready is true
>           - propulsion assessment ready is true
>           - recovery facts carriedPriority is not Inhibit
>           - recovery facts gate is Closed
>           - eligibility decision reason is Recovery
>       - All of the following conditions hold:
>         
>           - energy assessment ready is true
>           - navigation assessment ready is true
>           - communication assessment ready is true
>           - observation assessment ready is true
>           - obstacle assessment ready is true
>           - propulsion assessment ready is true
>           - recovery facts carriedPriority is not Inhibit
>           - recovery facts gate is Open
>           - At least one of the following conditions holds:
>             
>               - request phase is not Pending
>               - recovery facts carriedPriority is Cancel
>           - eligibility decision reason is NoRequest.

##### `ELIGIBILITY_PERMIT` — Conditional behavior

> During contract evaluation for the compute phase, case ELIGIBILITY PERMIT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request phase is Pending
>   - recovery facts gate is Open
>   - energy assessment ready is true
>   - navigation assessment ready is true
>   - communication assessment ready is true
>   - observation assessment ready is true
>   - obstacle assessment ready is true
>   - propulsion assessment ready is true
>   - At least one of the following conditions holds:
>     
>       - recovery facts carriedPriority is Hold
>       - recovery facts carriedPriority is Submit
>       - recovery facts carriedPriority is Recover.

> When all applicability conditions are met, EligibilityDecisionOwner shall produce a result for which all of the following conditions hold:
>
> eligibility decision directive is Permit and eligibility decision reason is None.

##### `ELIGIBILITY_EQUIPMENT_WITHHOLD` — Conditional behavior

> During contract evaluation for the compute phase, case ELIGIBILITY EQUIPMENT WITHHOLD applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request phase is Pending
>   - recovery facts gate is Open
>   - recovery facts carriedPriority is not Cancel
>   - At least one of the following conditions holds:
>     
>       - energy assessment ready is true exactly when F is true
>       - navigation assessment ready is true exactly when F is true
>       - communication assessment ready is true exactly when F is true
>       - observation assessment ready is true exactly when F is true
>       - obstacle assessment ready is true exactly when F is true
>       - propulsion assessment ready is true exactly when F is true
>       - recovery facts carriedPriority is Inhibit.

> When all applicability conditions are met, EligibilityDecisionOwner shall produce a result for which all of the following conditions hold:
>
> eligibility decision directive is Withhold and eligibility decision reason is Equipment.

### Requirements for EnergyEvidenceAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ENERGY_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, EnergyEvidenceAssessor shall set energy assessment ready to true exactly when F is true and energy assessment localCause to Invalid.

#### Contract clauses evaluated in the compute phase

##### `ENERGY_READY` — Conditional behavior

> During contract evaluation for the compute phase, if energy evidence validity is Valid, energy evidence freshness is Current, and energy evidence quality is Nominal, EnergyEvidenceAssessor shall set energy assessment ready to true exactly when T is true and energy assessment localCause to None.

##### `ENERGY_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case ENERGY NOT READY applies under all of the following conditions:
>
> energy evidence validity is Invalid, energy evidence freshness is Stale, or energy evidence quality is not Nominal.

> When all applicability conditions are met, EnergyEvidenceAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - energy assessment ready is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - energy evidence validity is Invalid
>           - energy assessment localCause is Invalid
>       - All of the following conditions hold:
>         
>           - energy evidence validity is Valid
>           - energy evidence freshness is Stale
>           - energy assessment localCause is Stale
>       - All of the following conditions hold:
>         
>           - energy evidence validity is Valid
>           - energy evidence freshness is Current
>           - At least one of the following conditions holds:
>             
>               - energy evidence quality is Unavailable
>               - energy evidence quality is Unknown
>           - energy assessment localCause is UnavailableOrUnknown
>       - All of the following conditions hold:
>         
>           - energy evidence validity is Valid
>           - energy evidence freshness is Current
>           - energy evidence quality is Limited
>           - energy assessment localCause is Limited.

### Requirements for FaultRegistry

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_FAULT_CLEAR` — Required behavior

> During contract evaluation for the initialization phase, FaultRegistry shall set fault summary faultState to Clear and fault summary primaryCause to None.

#### Contract clauses evaluated in the compute phase

##### `FAULT_ACTIVE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case FAULT ACTIVE PRIORITY applies under all of the following conditions:
>
> energy assessment ready is true exactly when F is true, propulsion assessment ready is true exactly when F is true, navigation assessment ready is true exactly when F is true, obstacle assessment ready is true exactly when F is true, observation assessment ready is true exactly when F is true, or communication assessment ready is true exactly when F is true.

> When all applicability conditions are met, FaultRegistry shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - fault summary faultState is Active
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - energy assessment ready is true exactly when F is true
>           - fault summary primaryCause is Energy
>       - All of the following conditions hold:
>         
>           - energy assessment ready is true
>           - propulsion assessment ready is true exactly when F is true
>           - fault summary primaryCause is Propulsion
>       - All of the following conditions hold:
>         
>           - energy assessment ready is true
>           - propulsion assessment ready is true
>           - navigation assessment ready is true exactly when F is true
>           - fault summary primaryCause is Navigation
>       - All of the following conditions hold:
>         
>           - energy assessment ready is true
>           - propulsion assessment ready is true
>           - navigation assessment ready is true
>           - obstacle assessment ready is true exactly when F is true
>           - fault summary primaryCause is Obstacle
>       - All of the following conditions hold:
>         
>           - energy assessment ready is true
>           - propulsion assessment ready is true
>           - navigation assessment ready is true
>           - obstacle assessment ready is true
>           - observation assessment ready is true exactly when F is true
>           - fault summary primaryCause is Observation
>       - All of the following conditions hold:
>         
>           - energy assessment ready is true
>           - propulsion assessment ready is true
>           - navigation assessment ready is true
>           - obstacle assessment ready is true
>           - observation assessment ready is true
>           - communication assessment ready is true exactly when F is true
>           - fault summary primaryCause is Communication.

##### `FAULT_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if energy assessment ready is true, propulsion assessment ready is true, navigation assessment ready is true, obstacle assessment ready is true, observation assessment ready is true, and communication assessment ready is true, FaultRegistry shall set fault summary faultState to Clear and fault summary primaryCause to None.

### Requirements for NavigationEvidenceAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NAVIGATION_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, NavigationEvidenceAssessor shall set navigation assessment ready to true exactly when F is true and navigation assessment localCause to Invalid.

#### Contract clauses evaluated in the compute phase

##### `NAVIGATION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if navigation evidence validity is Valid, navigation evidence freshness is Current, navigation evidence gpsCondition is Nominal, navigation evidence inertial is Nominal, and navigation evidence barometric is Nominal, NavigationEvidenceAssessor shall set navigation assessment ready to true exactly when T is true and navigation assessment localCause to None.

##### `NAVIGATION_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case NAVIGATION NOT READY applies under all of the following conditions:
>
> navigation evidence validity is Invalid, navigation evidence freshness is Stale, navigation evidence gpsCondition is not Nominal, navigation evidence inertial is not Nominal, or navigation evidence barometric is not Nominal.

> When all applicability conditions are met, NavigationEvidenceAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - navigation assessment ready is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - navigation evidence validity is Invalid
>           - navigation assessment localCause is Invalid
>       - All of the following conditions hold:
>         
>           - navigation evidence validity is Valid
>           - navigation evidence freshness is Stale
>           - navigation assessment localCause is Stale
>       - All of the following conditions hold:
>         
>           - navigation evidence validity is Valid
>           - navigation evidence freshness is Current
>           - navigation evidence gpsCondition is not Nominal
>           - navigation assessment localCause is Gps
>       - All of the following conditions hold:
>         
>           - navigation evidence validity is Valid
>           - navigation evidence freshness is Current
>           - navigation evidence gpsCondition is Nominal
>           - navigation evidence inertial is not Nominal
>           - navigation assessment localCause is Inertial
>       - All of the following conditions hold:
>         
>           - navigation evidence validity is Valid
>           - navigation evidence freshness is Current
>           - navigation evidence gpsCondition is Nominal
>           - navigation evidence inertial is Nominal
>           - navigation evidence barometric is not Nominal
>           - navigation assessment localCause is Barometric.

### Requirements for ObservationEvidenceAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OBSERVATION_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, ObservationEvidenceAssessor shall set observation assessment ready to true exactly when F is true and observation assessment localCause to Invalid.

#### Contract clauses evaluated in the compute phase

##### `OBSERVATION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if observation evidence validity is Valid, observation evidence freshness is Current, and observation evidence condition is Nominal, ObservationEvidenceAssessor shall set observation assessment ready to true exactly when T is true and observation assessment localCause to None.

##### `OBSERVATION_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case OBSERVATION NOT READY applies under all of the following conditions:
>
> observation evidence validity is Invalid, observation evidence freshness is Stale, or observation evidence condition is not Nominal.

> When all applicability conditions are met, ObservationEvidenceAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - observation assessment ready is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - observation evidence validity is Invalid
>           - observation assessment localCause is Invalid
>       - All of the following conditions hold:
>         
>           - observation evidence validity is Valid
>           - observation evidence freshness is Stale
>           - observation assessment localCause is Stale
>       - All of the following conditions hold:
>         
>           - observation evidence validity is Valid
>           - observation evidence freshness is Current
>           - observation evidence condition is not Nominal
>           - observation assessment localCause is Condition.

### Requirements for ObstacleEvidenceAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OBSTACLE_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, ObstacleEvidenceAssessor shall set obstacle assessment ready to true exactly when F is true and obstacle assessment localCause to Invalid.

#### Contract clauses evaluated in the compute phase

##### `OBSTACLE_READY` — Conditional behavior

> During contract evaluation for the compute phase, if obstacle evidence validity is Valid, obstacle evidence freshness is Current, and obstacle evidence condition is Nominal, ObstacleEvidenceAssessor shall set obstacle assessment ready to true exactly when T is true and obstacle assessment localCause to None.

##### `OBSTACLE_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case OBSTACLE NOT READY applies under all of the following conditions:
>
> obstacle evidence validity is Invalid, obstacle evidence freshness is Stale, or obstacle evidence condition is not Nominal.

> When all applicability conditions are met, ObstacleEvidenceAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - obstacle assessment ready is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - obstacle evidence validity is Invalid
>           - obstacle assessment localCause is Invalid
>       - All of the following conditions hold:
>         
>           - obstacle evidence validity is Valid
>           - obstacle evidence freshness is Stale
>           - obstacle assessment localCause is Stale
>       - All of the following conditions hold:
>         
>           - obstacle evidence validity is Valid
>           - obstacle evidence freshness is Current
>           - obstacle evidence condition is not Nominal
>           - obstacle assessment localCause is Condition.

### Requirements for PermissionReleaseLedger

#### Contract clauses evaluated in the initialization phase

May modify: releaseMemory

##### `INITIAL_RELEASE_WITHHELD` — Required behavior

> During contract evaluation for the initialization phase, PermissionReleaseLedger shall set releaseMemory to NotReleased, release feedback to NotReleased, and sortie directive to Withhold.

#### Contract clauses evaluated in the compute phase

May modify: releaseMemory

##### `ONE_SHOT_RELEASE_OUTPUT` — Required behavior

> During contract evaluation for the compute phase, PermissionReleaseLedger shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - request phase is Pending
>       - eligibility decision directive is Permit
>       - the value of releaseMemory on entry is NotReleased
>       - sortie directive is Permit
>       - release feedback is Released
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - request phase is not Pending
>           - eligibility decision directive is not Permit
>           - the value of releaseMemory on entry is Released
>       - sortie directive is Withhold
>       - release feedback is NotReleased.

##### `RELEASE_LEDGER_TRANSITION` — Required behavior

> During contract evaluation for the compute phase, PermissionReleaseLedger shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - request phase is Idle
>       - releaseMemory is NotReleased
>   - All of the following conditions hold:
>     
>       - request phase is not Idle
>       - request phase is Pending
>       - eligibility decision directive is Permit
>       - the value of releaseMemory on entry is NotReleased
>       - releaseMemory is Released
>   - All of the following conditions hold:
>     
>       - request phase is not Idle
>       - At least one of the following conditions holds:
>         
>           - request phase is not Pending
>           - eligibility decision directive is not Permit
>           - the value of releaseMemory on entry is Released
>       - releaseMemory is the value of releaseMemory on entry.

### Requirements for PriorityArbiter

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PRIORITY_INHIBIT` — Required behavior

> During contract evaluation for the initialization phase, PriorityArbiter shall set accepted directive to Inhibit.

#### Contract clauses evaluated in the compute phase

##### `PRIORITY_ACTIVE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultState is Active, PriorityArbiter shall set accepted directive to Inhibit.

##### `PRIORITY_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultState is Clear and candidate event is Cancel, PriorityArbiter shall set accepted directive to Cancel.

##### `PRIORITY_RECOVER` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultState is Clear and candidate event is AcknowledgeRecovery, PriorityArbiter shall set accepted directive to Recover.

##### `PRIORITY_SUBMIT` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultState is Clear and candidate event is Submit, PriorityArbiter shall set accepted directive to Submit.

##### `PRIORITY_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultState is Clear and candidate event is None, PriorityArbiter shall set accepted directive to Hold.

### Requirements for PropulsionEvidenceAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PROPULSION_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, PropulsionEvidenceAssessor shall set propulsion assessment ready to true exactly when F is true and propulsion assessment localCause to Invalid.

#### Contract clauses evaluated in the compute phase

##### `PROPULSION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if propulsion evidence validity is Valid, propulsion evidence freshness is Current, propulsion evidence alternatingKindsConfirmed is Confirmed, propulsion evidence engine1 is Nominal, propulsion evidence engine2 is Nominal, propulsion evidence engine3 is Nominal, and propulsion evidence engine4 is Nominal, PropulsionEvidenceAssessor shall set propulsion assessment ready to true exactly when T is true and propulsion assessment localCause to None.

##### `PROPULSION_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case PROPULSION NOT READY applies under all of the following conditions:
>
> propulsion evidence validity is Invalid, propulsion evidence freshness is Stale, propulsion evidence alternatingKindsConfirmed is NotConfirmed, propulsion evidence engine1 is not Nominal, propulsion evidence engine2 is not Nominal, propulsion evidence engine3 is not Nominal, or propulsion evidence engine4 is not Nominal.

> When all applicability conditions are met, PropulsionEvidenceAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - propulsion assessment ready is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - propulsion evidence validity is Invalid
>           - propulsion assessment localCause is Invalid
>       - All of the following conditions hold:
>         
>           - propulsion evidence validity is Valid
>           - propulsion evidence freshness is Stale
>           - propulsion assessment localCause is Stale
>       - All of the following conditions hold:
>         
>           - propulsion evidence validity is Valid
>           - propulsion evidence freshness is Current
>           - propulsion evidence alternatingKindsConfirmed is NotConfirmed
>           - propulsion assessment localCause is Configuration
>       - All of the following conditions hold:
>         
>           - propulsion evidence validity is Valid
>           - propulsion evidence freshness is Current
>           - propulsion evidence alternatingKindsConfirmed is Confirmed
>           - propulsion evidence engine1 is not Nominal
>           - propulsion assessment localCause is Engine1
>       - All of the following conditions hold:
>         
>           - propulsion evidence validity is Valid
>           - propulsion evidence freshness is Current
>           - propulsion evidence alternatingKindsConfirmed is Confirmed
>           - propulsion evidence engine1 is Nominal
>           - propulsion evidence engine2 is not Nominal
>           - propulsion assessment localCause is Engine2
>       - All of the following conditions hold:
>         
>           - propulsion evidence validity is Valid
>           - propulsion evidence freshness is Current
>           - propulsion evidence alternatingKindsConfirmed is Confirmed
>           - propulsion evidence engine1 is Nominal
>           - propulsion evidence engine2 is Nominal
>           - propulsion evidence engine3 is not Nominal
>           - propulsion assessment localCause is Engine3
>       - All of the following conditions hold:
>         
>           - propulsion evidence validity is Valid
>           - propulsion evidence freshness is Current
>           - propulsion evidence alternatingKindsConfirmed is Confirmed
>           - propulsion evidence engine1 is Nominal
>           - propulsion evidence engine2 is Nominal
>           - propulsion evidence engine3 is Nominal
>           - propulsion evidence engine4 is not Nominal
>           - propulsion assessment localCause is Engine4.

### Requirements for RecoveryQualificationOwner

#### Contract clauses evaluated in the initialization phase

May modify: recoveryMemory

##### `INITIAL_RECOVERY_QUARANTINED` — Required behavior

> During contract evaluation for the initialization phase, RecoveryQualificationOwner shall set recoveryMemory to Quarantined, recovery facts phase to Quarantined, recovery facts gate to Closed, recovery facts carriedPriority to Inhibit, and recovery phase to Quarantined.

#### Contract clauses evaluated in the compute phase

May modify: recoveryMemory

##### `RECOVERY_FACTS_COHERENT` — Required behavior

> During contract evaluation for the compute phase, RecoveryQualificationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recovery facts phase is recoveryMemory
>   - recovery phase is recoveryMemory
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - accepted directive is Inhibit
>           - recovery facts carriedPriority is Inhibit
>       - All of the following conditions hold:
>         
>           - accepted directive is Cancel
>           - recovery facts carriedPriority is Cancel
>       - All of the following conditions hold:
>         
>           - accepted directive is Recover
>           - recovery facts carriedPriority is Recover
>       - All of the following conditions hold:
>         
>           - accepted directive is Submit
>           - recovery facts carriedPriority is Submit
>       - All of the following conditions hold:
>         
>           - accepted directive is Hold
>           - recovery facts carriedPriority is Hold.

##### `RECOVERY_CURRENT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultState is Active, RecoveryQualificationOwner shall set recoveryMemory to Quarantined and recovery facts gate to Closed.

##### `RECOVERY_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, case RECOVERY OPEN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - fault summary faultState is Clear
>   - At least one of the following conditions holds:
>     
>       - the value of recoveryMemory on entry is Normal
>       - accepted directive is Recover.

> When all applicability conditions are met, RecoveryQualificationOwner shall produce a result for which all of the following conditions hold:
>
> recoveryMemory is Normal and recovery facts gate is Open.

##### `RECOVERY_AWAITING_ACK` — Conditional behavior

> During contract evaluation for the compute phase, if fault summary faultState is Clear, the value of recoveryMemory on entry is not Normal, and accepted directive is not Recover, RecoveryQualificationOwner shall set recoveryMemory to AwaitingAck and recovery facts gate to Closed.

### Requirements for RequestLifecycleOwner

#### Contract clauses evaluated in the initialization phase

May modify: requestMemory

##### `INITIAL_REQUEST_IDLE` — Required behavior

> During contract evaluation for the initialization phase, RequestLifecycleOwner shall set requestMemory to Idle, request phase to Idle, and candidate event to None.

#### Contract clauses evaluated in the compute phase

May modify: requestMemory

##### `CANDIDATE_EVENT_PUBLISHED` — Required behavior

> During contract evaluation for the compute phase, RequestLifecycleOwner shall set candidate event to operator event.

##### `PRE_EVALUATION_REQUEST_PUBLISHED` — Required behavior

> During contract evaluation for the compute phase, RequestLifecycleOwner shall set request phase to the value of requestMemory on entry.

##### `REQUEST_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, if accepted directive is Cancel, RequestLifecycleOwner shall set requestMemory to Idle.

##### `REQUEST_FRESH_SUBMIT` — Conditional behavior

> During contract evaluation for the compute phase, if accepted directive is Submit and the value of requestMemory on entry is Idle, RequestLifecycleOwner shall set requestMemory to Pending.

##### `REQUEST_DUPLICATE_SUBMIT` — Conditional behavior

> During contract evaluation for the compute phase, if accepted directive is Submit, the value of requestMemory on entry is not Idle, and release feedback is NotReleased, RequestLifecycleOwner shall preserve the value of requestMemory on entry.

##### `REQUEST_RELEASE_FEEDBACK` — Conditional behavior

> During contract evaluation for the compute phase, if accepted directive is not Cancel, the value of requestMemory on entry is Pending, and release feedback is Released, RequestLifecycleOwner shall set requestMemory to Released.

##### `REQUEST_REARM_OR_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, case REQUEST REARM OR RETAIN applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the value of requestMemory on entry is Released
>       - accepted directive is Hold
>   - All of the following conditions hold:
>     
>       - the value of requestMemory on entry is Idle
>       - accepted directive is not Cancel
>       - accepted directive is not Submit
>   - All of the following conditions hold:
>     
>       - the value of requestMemory on entry is Pending
>       - release feedback is NotReleased
>       - accepted directive is not Cancel
>       - accepted directive is not Submit
>   - All of the following conditions hold:
>     
>       - the value of requestMemory on entry is Released
>       - accepted directive is not Cancel
>       - accepted directive is not Hold
>       - At least one of the following conditions holds:
>         
>           - accepted directive is not Submit
>           - release feedback is Released.

> When all applicability conditions are met, RequestLifecycleOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the value of requestMemory on entry is Released
>       - accepted directive is Hold
>       - requestMemory is Idle
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - the value of requestMemory on entry is not Released
>           - accepted directive is not Hold
>       - requestMemory is the value of requestMemory on entry.

### Requirements for StatusComposer

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_STATUS_RECOVERY_REQUIRED` — Required behavior

> During contract evaluation for the initialization phase, StatusComposer shall set eligibility status requestPhase to Idle, eligibility status faultState to Clear, eligibility status recoveryPhase to Quarantined, eligibility status decisionDirective to Withhold, and eligibility status limitingCause to Recovery.

#### Contract clauses evaluated in the compute phase

##### `STATUS_PRESERVES_OWNER_FACTS` — Required behavior

> During contract evaluation for the compute phase, StatusComposer shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request phase is Idle
>           - eligibility status requestPhase is Idle
>       - All of the following conditions hold:
>         
>           - request phase is Pending
>           - eligibility status requestPhase is Pending
>       - All of the following conditions hold:
>         
>           - request phase is Released
>           - eligibility status requestPhase is Released
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - fault summary faultState is Clear
>           - eligibility status faultState is Clear
>       - All of the following conditions hold:
>         
>           - fault summary faultState is Active
>           - eligibility status faultState is Active
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recovery phase is Normal
>           - eligibility status recoveryPhase is Normal
>       - All of the following conditions hold:
>         
>           - recovery phase is Quarantined
>           - eligibility status recoveryPhase is Quarantined
>       - All of the following conditions hold:
>         
>           - recovery phase is AwaitingAck
>           - eligibility status recoveryPhase is AwaitingAck
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - eligibility decision directive is Withhold
>           - eligibility status decisionDirective is Withhold
>       - All of the following conditions hold:
>         
>           - eligibility decision directive is Permit
>           - eligibility status decisionDirective is Permit.

##### `STATUS_REFINES_LIMITING_CAUSE` — Required behavior

> During contract evaluation for the compute phase, StatusComposer shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - eligibility decision reason is None
>       - eligibility status limitingCause is None
>   - All of the following conditions hold:
>     
>       - eligibility decision reason is Recovery
>       - eligibility status limitingCause is Recovery
>   - All of the following conditions hold:
>     
>       - eligibility decision reason is NoRequest
>       - eligibility status limitingCause is NoRequest
>   - All of the following conditions hold:
>     
>       - eligibility decision reason is Equipment
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - fault summary primaryCause is Energy
>               - eligibility status limitingCause is Energy
>           - All of the following conditions hold:
>             
>               - fault summary primaryCause is Propulsion
>               - eligibility status limitingCause is Propulsion
>           - All of the following conditions hold:
>             
>               - fault summary primaryCause is Navigation
>               - eligibility status limitingCause is Navigation
>           - All of the following conditions hold:
>             
>               - fault summary primaryCause is Obstacle
>               - eligibility status limitingCause is Obstacle
>           - All of the following conditions hold:
>             
>               - fault summary primaryCause is Observation
>               - eligibility status limitingCause is Observation
>           - All of the following conditions hold:
>             
>               - fault summary primaryCause is Communication
>               - eligibility status limitingCause is Communication.
