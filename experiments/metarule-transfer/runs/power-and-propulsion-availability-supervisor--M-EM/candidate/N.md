# Power-and-Propulsion Availability Supervisor

## Selected system context

### Synopsis

NEED-01: A single forest-fire observation drone has a selected battery, power-management
equipment, a charger, and an explicit four-engine configuration, but the seed provides
no policy for deciding whether a propulsion-power enable command may be issued from
qualitative equipment evidence.

PURPOSE-01: The system shall obtain and analyze a finite qualitative battery
observation, assess selected power, charging, engine-group, and configuration evidence,
manage a drone-control enable demand, and issue only a fail-closed propulsion-power
command and an explanatory availability report.

### Evidence and claim classes

ASM-01: The surrounding integration environment, represented by CTX-01 through CTX-05,
is responsible for presenting one complete finite input snapshot per discrete logical
evaluation. Logical evaluations support deterministic model analysis and make no
physical timing, scheduling, or latency claim.

ASM-02: CTX-02 through CTX-04 are responsible for the declared validity and freshness
tags. `VALID` and `CURRENT` mean only admitted by this pilot policy; they do not
establish measurement truth or hardware performance.

ASM-03: CTX-01 is responsible for issuing exactly one `ControlEvent` value per
evaluation. Event mutual exclusion is a selected interface convention because the seed
defines no human actor or control protocol.

ASM-04: CTX-05 is responsible for reporting one `ActuationFeedback` value per
evaluation. `ENABLED_CONFIRMED` and `DISABLED_CONFIRMED` are abstract acknowledgments,
not proof that engines generate thrust or that physical power changed.

ASM-05: The finite evidence alphabets and exact acceptance, priority, initialization,
and recovery rules below are Designer-selected abstractions needed for exhaustive
analysis; none is a source-defined hardware policy.

ASM-06: Missing or unusable information is represented by `UNKNOWN`, `UNAVAILABLE`,
`INVALID`, or `STALE`, as applicable, rather than by an absent interaction. This closes
the finite boundary partitions without prescribing transport.

ASM-07: CTX-01 must interpret `AVAILABLE_FOR_ENABLE` and every enable command only as
results of this abstract policy and must not treat them as observation permission,
mission authority, safety approval, or physical performance assurance.

### Goals

GOAL-01: The system shall initialize and fail closed: an unqualified battery
observation, any rejected power/propulsion/charging evidence, an active fault, a closed
recovery gate, no active demand, an accepted disable or recovery event, or an
unconfirmed initial state shall prevent `ENABLE_NEW` and `ENABLE_HOLD`. Pass criterion:
bounded analysis finds no counterexample over the complete admitted partitions.

GOAL-02: The system shall issue an enable command only after a fresh post-recovery
enable request, admitted evidence from every assessment owner, an open recovery gate,
and a fault-free priority result. Pass criterion: the system composition relation is
equivalent to that conjunction on every producer-reachable valuation.

GOAL-03: The system shall deterministically expose one limiting cause using the fixed
cause and action priorities. Pass criterion: every unavailable producer-reachable
valuation has exactly one cause and no available valuation has a non-`NONE` cause.

GOAL-04: The system shall distribute retained state across demand, recovery, and
command-interlock owners and distribute current decisions across the ten other owners.
Pass criterion: owner-local contracts and analyzer results demonstrate a nonidentity
derivation for every PART-01 through PART-13.

GOAL-05: A fault shall invalidate the pre-fault demand; fault clearance and
acknowledgment shall reopen recovery but shall not restore enablement until CTX-01
issues a new request. Pass criterion: all recovery scenarios show `DISABLE` from the
initiating fault through acknowledgment and until a fresh request completes the
request-to-command pipeline.

### Operational context and exact boundary

CTX-01: The drone-control client is outside the system. It supplies enable, disable, and
recovery-acknowledgment events and receives the availability report. This contextual
role is inferred from the seed's drone-control equipment and battery-status flow.

CTX-02: The battery and power-status source is outside the system. It supplies the
qualitative battery observation and power-management evidence; the system neither
measures electrochemical state nor controls charging physics.

CTX-03: The engine and configuration evidence source is outside the system. It supplies
two engine-group snapshots and a structural configuration snapshot without asserting
their truth or any flight consequence.

CTX-04: The charging context source is outside the system. It reports whether the named
charger is disconnected, connected idle, charging, or unknown; charging control remains
external.

CTX-05: The power-and-propulsion actuation recipient is outside the system. It receives
the abstract power command and supplies acknowledgment feedback; downstream electrical
switching and engine actuation are not modeled.

CTX-06: The forest-fire environment provides domain context only and has no direct
modeled interaction. No fire property, observation state, or sortie state organizes this
system's policy.

MON-01: `batteryObservation`, supplied by CTX-02, has type `BatteryObservation =
{quality: ADEQUATE | LIMITED | DEPLETED | UNKNOWN, validity: VALID | INVALID, freshness:
CURRENT | STALE}`. The four quality values are a downstream finite abstraction of the
seed's unenumerated qualitative status.

MON-02: `powerManagementEvidence`, supplied by CTX-02, has type `PowerEvidence =
{condition: NOMINAL | DEGRADED | UNAVAILABLE | UNKNOWN, validity: VALID | INVALID,
freshness: CURRENT | STALE}`.

MON-03: `oddEngineGroupEvidence`, supplied by CTX-03, has type `EnginePairEvidence =
{first, second: NOMINAL | NON_NOMINAL | UNAVAILABLE | UNKNOWN, validity: VALID |
INVALID, freshness: CURRENT | STALE}` and represents engines 1 and 3 only as distinct
named positions.

MON-04: `evenEngineGroupEvidence`, supplied by CTX-03, has the same `EnginePairEvidence`
type and represents engines 2 and 4 only as distinct named positions.

MON-05: `configurationEvidence`, supplied by CTX-03, has type `ConfigurationEvidence =
{engineCount: FOUR | OTHER | UNKNOWN, alternatingKinds: MATCHES_SOURCE | DOES_NOT_MATCH
| UNKNOWN, validity: VALID | INVALID, freshness: CURRENT | STALE}`. `MATCHES_SOURCE`
means structural concordance only.

MON-06: `chargerEvidence`, supplied by CTX-04, has type `ChargerEvidence = {coupling:
DISCONNECTED | CONNECTED_IDLE | CHARGING | UNKNOWN, validity: VALID | INVALID,
freshness: CURRENT | STALE}`.

MON-07: `controlEvent`, supplied by CTX-01, has type `ControlEvent = NONE |
REQUEST_ENABLE | REQUEST_DISABLE | ACKNOWLEDGE_RECOVERY`.

MON-08: `actuationFeedback`, supplied by CTX-05, has type `ActuationFeedback =
DISABLED_CONFIRMED | ENABLED_CONFIRMED | UNKNOWN` and contains no physical-performance
claim.

CTRL-01: `propulsionPowerCommand`, received by CTX-05, has type `PowerCommand = DISABLE
| ENABLE_NEW | ENABLE_HOLD`. `ENABLE_NEW` marks the first enable command of one admitted
demand; `ENABLE_HOLD` maintains that admitted demand without creating another fresh
command cycle.

CTRL-02: `availabilityReport`, received by CTX-01, has type `AvailabilityReport =
{decision: UNAVAILABLE | AVAILABLE_FOR_ENABLE, cause: NONE | BATTERY | POWER_MANAGEMENT
| ODD_ENGINE_GROUP | EVEN_ENGINE_GROUP | CONFIGURATION | CHARGER | RECOVERY | NO_DEMAND
| OPERATOR_DISABLE, demand: IDLE | REQUESTED | ACTIVE, recovery: NORMAL | QUARANTINED |
AWAITING_ACK}`. Copied demand/recovery fields are observable context but earn PART-12 no
owner credit.

### Risks, faults, degraded behavior, and recovery

RISK-01: If invalid, stale, limited, unavailable, non-nominal, structurally discordant,
connected-charger, or unknown evidence were admitted, an enable command could be issued
outside the selected policy. No likelihood or physical severity is asserted.

RISK-02: If fault clearance restored a pre-fault demand, the system could resume
enablement without a new drone-control request.

RISK-03: If retained availability or command state outranked a current disable, fault,
or recovery condition, the system could continue an enable command for one stale
evaluation.

RISK-04: Repeated enable events or delayed acknowledgments could create repeated
`ENABLE_NEW` commands for one continuous demand.

## Supporting contract definitions

### State `Power_Propulsion_Availability_Supervisor::EnableDemandLifecycleOwner::demandMemory`

State `demandMemory` has type `Power_Propulsion_Availability_Supervisor::DemandPhase`.

### State `Power_Propulsion_Availability_Supervisor::PowerCommandInterlockOwner::commandMemory`

State `commandMemory` has type `Power_Propulsion_Availability_Supervisor::CommandPhase`.

### State `Power_Propulsion_Availability_Supervisor::RecoveryQualificationOwner::recoveryMemory`

State `recoveryMemory` has type `Power_Propulsion_Availability_Supervisor::RecoveryPhase`.

## Detailed behavioral requirements

### Requirements for AvailabilityDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_AVAILABILITY_UNAVAILABLE` — Required behavior

> During contract evaluation for the initialization phase, AvailabilityDecisionOwner shall set availability decision decision to UNAVAILABLE, availability decision cause to RECOVERY, availability report decision to UNAVAILABLE, availability report cause to RECOVERY, availability report demand to IDLE, and availability report recovery to AWAITING ACK.

#### Contract clauses evaluated in the compute phase

##### `REPORT_PRESERVATION` — Required behavior

> During contract evaluation for the compute phase, AvailabilityDecisionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - availability decision decision is UNAVAILABLE
>           - availability report decision is UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - availability decision decision is AVAILABLE FOR ENABLE
>           - availability report decision is AVAILABLE FOR ENABLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - availability decision cause is NONE
>           - availability report cause is NONE
>       - All of the following conditions hold:
>         
>           - availability decision cause is BATTERY
>           - availability report cause is BATTERY
>       - All of the following conditions hold:
>         
>           - availability decision cause is POWER MANAGEMENT
>           - availability report cause is POWER MANAGEMENT
>       - All of the following conditions hold:
>         
>           - availability decision cause is ODD ENGINE GROUP
>           - availability report cause is ODD ENGINE GROUP
>       - All of the following conditions hold:
>         
>           - availability decision cause is EVEN ENGINE GROUP
>           - availability report cause is EVEN ENGINE GROUP
>       - All of the following conditions hold:
>         
>           - availability decision cause is CONFIGURATION
>           - availability report cause is CONFIGURATION
>       - All of the following conditions hold:
>         
>           - availability decision cause is CHARGER
>           - availability report cause is CHARGER
>       - All of the following conditions hold:
>         
>           - availability decision cause is RECOVERY
>           - availability report cause is RECOVERY
>       - All of the following conditions hold:
>         
>           - availability decision cause is NO DEMAND
>           - availability report cause is NO DEMAND
>       - All of the following conditions hold:
>         
>           - availability decision cause is OPERATOR DISABLE
>           - availability report cause is OPERATOR DISABLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - demand view is IDLE
>           - availability report demand is IDLE
>       - All of the following conditions hold:
>         
>           - demand view is REQUESTED
>           - availability report demand is REQUESTED
>       - All of the following conditions hold:
>         
>           - demand view is ACTIVE
>           - availability report demand is ACTIVE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recovery frame phase is NORMAL
>           - availability report recovery is NORMAL
>       - All of the following conditions hold:
>         
>           - recovery frame phase is QUARANTINED
>           - availability report recovery is QUARANTINED
>       - All of the following conditions hold:
>         
>           - recovery frame phase is AWAITING ACK
>           - availability report recovery is AWAITING ACK.

##### `CASE_28_AVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 28 AVAILABLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - battery assessment is READY NONE
>   - power assessment is READY NONE
>   - propulsion assessment is READY NONE
>   - charging assessment is READY NONE
>   - demand view is not IDLE
>   - fault action summary fault is CLEAR
>   - recovery frame phase is NORMAL
>   - recovery frame gate is OPEN
>   - At least one of the following conditions holds:
>     
>       - fault action summary directive is ENABLE
>       - fault action summary directive is HOLD.

> When all applicability conditions are met, AvailabilityDecisionOwner shall produce a result for which all of the following conditions hold:
>
> availability decision decision is AVAILABLE FOR ENABLE and availability decision cause is NONE.

##### `CASE_29_UNAVAILABLE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 29 UNAVAILABLE PRIORITY applies under all of the following conditions:
>
> battery assessment is not READY NONE, power assessment is not READY NONE, propulsion assessment is not READY NONE, charging assessment is not READY NONE, demand view is IDLE, fault action summary fault is ACTIVE, recovery frame phase is not NORMAL, recovery frame gate is CLOSED, fault action summary directive is INHIBIT, fault action summary directive is DISABLE, or fault action summary directive is RECOVER.

> When all applicability conditions are met, AvailabilityDecisionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - availability decision decision is UNAVAILABLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - charging assessment is not READY NONE
>           - availability decision cause is CHARGER
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is not READY NONE
>           - availability decision cause is POWER MANAGEMENT
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is not READY NONE
>           - availability decision cause is BATTERY
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is NOT READY ODD ENGINE GROUP
>           - availability decision cause is ODD ENGINE GROUP
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is NOT READY EVEN ENGINE GROUP
>           - availability decision cause is EVEN ENGINE GROUP
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is NOT READY CONFIGURATION
>           - availability decision cause is CONFIGURATION
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is READY NONE
>           - fault action summary fault is ACTIVE
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - fault action summary cause is CHARGER
>                   - availability decision cause is CHARGER
>               - All of the following conditions hold:
>                 
>                   - fault action summary cause is POWER MANAGEMENT
>                   - availability decision cause is POWER MANAGEMENT
>               - All of the following conditions hold:
>                 
>                   - fault action summary cause is BATTERY
>                   - availability decision cause is BATTERY
>               - All of the following conditions hold:
>                 
>                   - fault action summary cause is ODD ENGINE GROUP
>                   - availability decision cause is ODD ENGINE GROUP
>               - All of the following conditions hold:
>                 
>                   - fault action summary cause is EVEN ENGINE GROUP
>                   - availability decision cause is EVEN ENGINE GROUP
>               - All of the following conditions hold:
>                 
>                   - fault action summary cause is CONFIGURATION
>                   - availability decision cause is CONFIGURATION
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is READY NONE
>           - fault action summary fault is CLEAR
>           - fault action summary directive is DISABLE
>           - availability decision cause is OPERATOR DISABLE
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is READY NONE
>           - fault action summary fault is CLEAR
>           - fault action summary directive is not DISABLE
>           - At least one of the following conditions holds:
>             
>               - recovery frame gate is CLOSED
>               - fault action summary directive is RECOVER
>           - availability decision cause is RECOVERY
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is READY NONE
>           - fault action summary fault is CLEAR
>           - fault action summary directive is not DISABLE
>           - recovery frame gate is OPEN
>           - fault action summary directive is not RECOVER
>           - demand view is IDLE
>           - availability decision cause is NO DEMAND.

### Requirements for BatteryCapacityAssessmentOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BATTERY_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, BatteryCapacityAssessmentOwner shall set battery assessment to NOT READY INVALID.

#### Contract clauses evaluated in the compute phase

##### `CASE_03_BATTERY_READY` — Conditional behavior

> During contract evaluation for the compute phase, if qualified battery admission is ADMITTED NONE and qualified battery quality is ADEQUATE, BatteryCapacityAssessmentOwner shall set battery assessment to READY NONE.

##### `CASE_04_BATTERY_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 04 BATTERY NOT READY applies under all of the following conditions:
>
> qualified battery admission is not ADMITTED NONE or qualified battery quality is not ADEQUATE.

> When all applicability conditions are met, BatteryCapacityAssessmentOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - qualified battery admission is REJECTED INVALID
>       - battery assessment is NOT READY INVALID
>   - All of the following conditions hold:
>     
>       - qualified battery admission is REJECTED STALE
>       - battery assessment is NOT READY STALE
>   - All of the following conditions hold:
>     
>       - qualified battery admission is ADMITTED NONE
>       - qualified battery quality is LIMITED
>       - battery assessment is NOT READY LIMITED
>   - All of the following conditions hold:
>     
>       - qualified battery admission is ADMITTED NONE
>       - At least one of the following conditions holds:
>         
>           - qualified battery quality is DEPLETED
>           - qualified battery quality is UNKNOWN
>       - battery assessment is NOT READY DEPLETED OR UNKNOWN.

### Requirements for BatteryObservationAdmissionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ADMISSION_REJECTED` — Required behavior

> During contract evaluation for the initialization phase, BatteryObservationAdmissionOwner shall set qualified battery admission to REJECTED INVALID and qualified battery quality to UNKNOWN.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_ADMITTED` — Conditional behavior

> During contract evaluation for the compute phase, if battery observation validity is VALID and battery observation freshness is CURRENT, BatteryObservationAdmissionOwner shall set qualified battery admission to ADMITTED NONE and qualified battery quality to battery observation quality.

##### `CASE_02_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 REJECTED applies under all of the following conditions:
>
> battery observation validity is INVALID or battery observation freshness is STALE.

> When all applicability conditions are met, BatteryObservationAdmissionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - qualified battery quality is battery observation quality
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - battery observation validity is INVALID
>           - qualified battery admission is REJECTED INVALID
>       - All of the following conditions hold:
>         
>           - battery observation validity is VALID
>           - qualified battery admission is REJECTED STALE.

### Requirements for ChargingInterlockAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CHARGING_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, ChargingInterlockAssessor shall set charging assessment to NOT READY INVALID.

#### Contract clauses evaluated in the compute phase

##### `CASE_15_CHARGING_READY` — Conditional behavior

> During contract evaluation for the compute phase, if charger evidence validity is VALID, charger evidence freshness is CURRENT, and charger evidence coupling is DISCONNECTED, ChargingInterlockAssessor shall set charging assessment to READY NONE.

##### `CASE_16_CHARGING_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 16 CHARGING NOT READY applies under all of the following conditions:
>
> charger evidence validity is INVALID, charger evidence freshness is STALE, or charger evidence coupling is not DISCONNECTED.

> When all applicability conditions are met, ChargingInterlockAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - charger evidence validity is INVALID
>       - charging assessment is NOT READY INVALID
>   - All of the following conditions hold:
>     
>       - charger evidence validity is VALID
>       - charger evidence freshness is STALE
>       - charging assessment is NOT READY STALE
>   - All of the following conditions hold:
>     
>       - charger evidence validity is VALID
>       - charger evidence freshness is CURRENT
>       - charger evidence coupling is CONNECTED IDLE
>       - charging assessment is NOT READY CONNECTED IDLE
>   - All of the following conditions hold:
>     
>       - charger evidence validity is VALID
>       - charger evidence freshness is CURRENT
>       - At least one of the following conditions holds:
>         
>           - charger evidence coupling is CHARGING
>           - charger evidence coupling is UNKNOWN
>       - charging assessment is NOT READY CHARGING OR UNKNOWN.

### Requirements for EnableDemandLifecycleOwner

#### Contract clauses evaluated in the initialization phase

May modify: demandMemory

##### `INITIAL_DEMAND_IDLE` — Required behavior

> During contract evaluation for the initialization phase, EnableDemandLifecycleOwner shall set demandMemory to IDLE, request context demand to IDLE, request context candidateEvent to NONE, and demand view to IDLE.

#### Contract clauses evaluated in the compute phase

May modify: demandMemory

##### `PUBLISH_PRE_STATE_DEMAND` — Required behavior

> During contract evaluation for the compute phase, EnableDemandLifecycleOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - request context demand is the value of demandMemory on entry
>   - demand view is the value of demandMemory on entry
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - control event is NONE
>           - request context candidateEvent is NONE
>       - All of the following conditions hold:
>         
>           - control event is REQUEST ENABLE
>           - request context candidateEvent is REQUEST ENABLE
>       - All of the following conditions hold:
>         
>           - control event is REQUEST DISABLE
>           - request context candidateEvent is REQUEST DISABLE
>       - All of the following conditions hold:
>         
>           - control event is ACKNOWLEDGE RECOVERY
>           - request context candidateEvent is ACKNOWLEDGE RECOVERY.

##### `CASE_17_DEMAND_INVALIDATED` — Conditional behavior

> During contract evaluation for the compute phase, if accepted directive is INHIBIT, accepted directive is DISABLE, or accepted directive is RECOVER, EnableDemandLifecycleOwner shall set demandMemory to IDLE.

##### `CASE_18_DEMAND_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 DEMAND ACTIVE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - accepted directive is ENABLE
>       - accepted directive is HOLD
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - the value of demandMemory on entry is REQUESTED
>               - the value of demandMemory on entry is ACTIVE
>           - actuation feedback is ENABLED CONFIRMED
>       - All of the following conditions hold:
>         
>           - the value of demandMemory on entry is ACTIVE
>           - actuation feedback is not DISABLED CONFIRMED.

> When all applicability conditions are met, EnableDemandLifecycleOwner shall produce a result for which all of the following conditions hold:
>
> demandMemory is ACTIVE.

##### `CASE_19_DEMAND_REQUESTED_OR_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 DEMAND REQUESTED OR IDLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - accepted directive is ENABLE
>       - accepted directive is HOLD
>   - At least one of the following conditions holds:
>     
>       - the value of demandMemory on entry is IDLE
>       - All of the following conditions hold:
>         
>           - the value of demandMemory on entry is REQUESTED
>           - actuation feedback is not ENABLED CONFIRMED
>       - All of the following conditions hold:
>         
>           - the value of demandMemory on entry is ACTIVE
>           - actuation feedback is DISABLED CONFIRMED.

> When all applicability conditions are met, EnableDemandLifecycleOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - the value of demandMemory on entry is not IDLE
>           - accepted directive is ENABLE
>       - demandMemory is REQUESTED
>   - All of the following conditions hold:
>     
>       - the value of demandMemory on entry is IDLE
>       - accepted directive is HOLD
>       - demandMemory is IDLE.

### Requirements for EvenEngineGroupAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_EVEN_GROUP_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, EvenEngineGroupAssessor shall set even engine assessment to NOT READY INVALID.

#### Contract clauses evaluated in the compute phase

##### `CASE_09_EVEN_GROUP_READY` — Conditional behavior

> During contract evaluation for the compute phase, if even engine evidence validity is VALID, even engine evidence freshness is CURRENT, even engine evidence positionOneState is NOMINAL, and even engine evidence positionTwoState is NOMINAL, EvenEngineGroupAssessor shall set even engine assessment to READY NONE.

##### `CASE_10_EVEN_GROUP_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 EVEN GROUP NOT READY applies under all of the following conditions:
>
> even engine evidence validity is INVALID, even engine evidence freshness is STALE, even engine evidence positionOneState is not NOMINAL, or even engine evidence positionTwoState is not NOMINAL.

> When all applicability conditions are met, EvenEngineGroupAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - even engine evidence validity is INVALID
>       - even engine assessment is NOT READY INVALID
>   - All of the following conditions hold:
>     
>       - even engine evidence validity is VALID
>       - even engine evidence freshness is STALE
>       - even engine assessment is NOT READY STALE
>   - All of the following conditions hold:
>     
>       - even engine evidence validity is VALID
>       - even engine evidence freshness is CURRENT
>       - even engine evidence positionOneState is not NOMINAL
>       - even engine assessment is NOT READY FIRST POSITION
>   - All of the following conditions hold:
>     
>       - even engine evidence validity is VALID
>       - even engine evidence freshness is CURRENT
>       - even engine evidence positionOneState is NOMINAL
>       - even engine evidence positionTwoState is not NOMINAL
>       - even engine assessment is NOT READY SECOND POSITION.

### Requirements for FaultActionPriorityResolver

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PRIORITY_INHIBIT` — Required behavior

> During contract evaluation for the initialization phase, FaultActionPriorityResolver shall set accepted directive to INHIBIT, fault action summary fault to ACTIVE, fault action summary cause to CHARGER, and fault action summary directive to INHIBIT.

#### Contract clauses evaluated in the compute phase

##### `DIRECTIVE_PRESERVATION` — Required behavior

> During contract evaluation for the compute phase, FaultActionPriorityResolver shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - accepted directive is INHIBIT
>       - fault action summary directive is INHIBIT
>   - All of the following conditions hold:
>     
>       - accepted directive is DISABLE
>       - fault action summary directive is DISABLE
>   - All of the following conditions hold:
>     
>       - accepted directive is RECOVER
>       - fault action summary directive is RECOVER
>   - All of the following conditions hold:
>     
>       - accepted directive is ENABLE
>       - fault action summary directive is ENABLE
>   - All of the following conditions hold:
>     
>       - accepted directive is HOLD
>       - fault action summary directive is HOLD.

##### `CASE_20_ACTIVE_FAULT_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 ACTIVE FAULT PRIORITY applies under all of the following conditions:
>
> battery assessment is not READY NONE, power assessment is not READY NONE, propulsion assessment is not READY NONE, or charging assessment is not READY NONE.

> When all applicability conditions are met, FaultActionPriorityResolver shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - accepted directive is INHIBIT
>   - fault action summary fault is ACTIVE
>   - fault action summary directive is INHIBIT
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - charging assessment is not READY NONE
>           - fault action summary cause is CHARGER
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is not READY NONE
>           - fault action summary cause is POWER MANAGEMENT
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is not READY NONE
>           - fault action summary cause is BATTERY
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is NOT READY ODD ENGINE GROUP
>           - fault action summary cause is ODD ENGINE GROUP
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is NOT READY EVEN ENGINE GROUP
>           - fault action summary cause is EVEN ENGINE GROUP
>       - All of the following conditions hold:
>         
>           - charging assessment is READY NONE
>           - power assessment is READY NONE
>           - battery assessment is READY NONE
>           - propulsion assessment is NOT READY CONFIGURATION
>           - fault action summary cause is CONFIGURATION.

##### `CASE_21_DISABLE_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if battery assessment is READY NONE, power assessment is READY NONE, propulsion assessment is READY NONE, charging assessment is READY NONE, and request context candidateEvent is REQUEST DISABLE, FaultActionPriorityResolver shall set accepted directive to DISABLE, fault action summary fault to CLEAR, fault action summary cause to NONE, and fault action summary directive to DISABLE.

##### `CASE_22_RECOVERY_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if battery assessment is READY NONE, power assessment is READY NONE, propulsion assessment is READY NONE, charging assessment is READY NONE, and request context candidateEvent is ACKNOWLEDGE RECOVERY, FaultActionPriorityResolver shall set accepted directive to RECOVER, fault action summary fault to CLEAR, fault action summary cause to NONE, and fault action summary directive to RECOVER.

##### `CASE_23_ENABLE_OR_REPEAT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 23 ENABLE OR REPEAT applies under all of the following conditions:
>
> battery assessment is READY NONE, power assessment is READY NONE, propulsion assessment is READY NONE, charging assessment is READY NONE, and request context candidateEvent is REQUEST ENABLE.

> When all applicability conditions are met, FaultActionPriorityResolver shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - fault action summary fault is CLEAR
>   - fault action summary cause is NONE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request context demand is IDLE
>           - accepted directive is ENABLE
>           - fault action summary directive is ENABLE
>       - All of the following conditions hold:
>         
>           - request context demand is not IDLE
>           - accepted directive is HOLD
>           - fault action summary directive is HOLD.

##### `CASE_24_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if battery assessment is READY NONE, power assessment is READY NONE, propulsion assessment is READY NONE, charging assessment is READY NONE, and request context candidateEvent is NONE, FaultActionPriorityResolver shall set accepted directive to HOLD, fault action summary fault to CLEAR, fault action summary cause to NONE, and fault action summary directive to HOLD.

### Requirements for FourEngineConfigurationAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CONFIGURATION_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, FourEngineConfigurationAssessor shall set configuration assessment to NOT READY INVALID.

#### Contract clauses evaluated in the compute phase

##### `CASE_11_CONFIGURATION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if configuration evidence validity is VALID, configuration evidence freshness is CURRENT, configuration evidence engineCount is FOUR, and configuration evidence alternatingKinds is MATCHES SOURCE, FourEngineConfigurationAssessor shall set configuration assessment to READY NONE.

##### `CASE_12_CONFIGURATION_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 CONFIGURATION NOT READY applies under all of the following conditions:
>
> configuration evidence validity is INVALID, configuration evidence freshness is STALE, configuration evidence engineCount is not FOUR, or configuration evidence alternatingKinds is not MATCHES SOURCE.

> When all applicability conditions are met, FourEngineConfigurationAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - configuration evidence validity is INVALID
>       - configuration assessment is NOT READY INVALID
>   - All of the following conditions hold:
>     
>       - configuration evidence validity is VALID
>       - configuration evidence freshness is STALE
>       - configuration assessment is NOT READY STALE
>   - All of the following conditions hold:
>     
>       - configuration evidence validity is VALID
>       - configuration evidence freshness is CURRENT
>       - configuration evidence engineCount is not FOUR
>       - configuration assessment is NOT READY ENGINE COUNT
>   - All of the following conditions hold:
>     
>       - configuration evidence validity is VALID
>       - configuration evidence freshness is CURRENT
>       - configuration evidence engineCount is FOUR
>       - configuration evidence alternatingKinds is not MATCHES SOURCE
>       - configuration assessment is NOT READY ALTERNATION.

### Requirements for OddEngineGroupAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ODD_GROUP_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, OddEngineGroupAssessor shall set odd engine assessment to NOT READY INVALID.

#### Contract clauses evaluated in the compute phase

##### `CASE_07_ODD_GROUP_READY` — Conditional behavior

> During contract evaluation for the compute phase, if odd engine evidence validity is VALID, odd engine evidence freshness is CURRENT, odd engine evidence positionOneState is NOMINAL, and odd engine evidence positionTwoState is NOMINAL, OddEngineGroupAssessor shall set odd engine assessment to READY NONE.

##### `CASE_08_ODD_GROUP_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 ODD GROUP NOT READY applies under all of the following conditions:
>
> odd engine evidence validity is INVALID, odd engine evidence freshness is STALE, odd engine evidence positionOneState is not NOMINAL, or odd engine evidence positionTwoState is not NOMINAL.

> When all applicability conditions are met, OddEngineGroupAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - odd engine evidence validity is INVALID
>       - odd engine assessment is NOT READY INVALID
>   - All of the following conditions hold:
>     
>       - odd engine evidence validity is VALID
>       - odd engine evidence freshness is STALE
>       - odd engine assessment is NOT READY STALE
>   - All of the following conditions hold:
>     
>       - odd engine evidence validity is VALID
>       - odd engine evidence freshness is CURRENT
>       - odd engine evidence positionOneState is not NOMINAL
>       - odd engine assessment is NOT READY FIRST POSITION
>   - All of the following conditions hold:
>     
>       - odd engine evidence validity is VALID
>       - odd engine evidence freshness is CURRENT
>       - odd engine evidence positionOneState is NOMINAL
>       - odd engine evidence positionTwoState is not NOMINAL
>       - odd engine assessment is NOT READY SECOND POSITION.

### Requirements for PowerCommandInterlockOwner

#### Contract clauses evaluated in the initialization phase

May modify: commandMemory

##### `INITIAL_COMMAND_DISABLED` — Required behavior

> During contract evaluation for the initialization phase, PowerCommandInterlockOwner shall set commandMemory to DISABLED and power command to DISABLE.

#### Contract clauses evaluated in the compute phase

May modify: commandMemory

##### `COMPLETE_COMMAND_INTERLOCK` — Required behavior

> During contract evaluation for the compute phase, PowerCommandInterlockOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - availability decision decision is not AVAILABLE FOR ENABLE
>           - demand view is IDLE
>           - recovery gate is not OPEN
>           - All of the following conditions hold:
>             
>               - accepted directive is not ENABLE
>               - accepted directive is not HOLD
>       - commandMemory is DISABLED
>       - power command is DISABLE
>   - All of the following conditions hold:
>     
>       - availability decision decision is AVAILABLE FOR ENABLE
>       - demand view is not IDLE
>       - recovery gate is OPEN
>       - At least one of the following conditions holds:
>         
>           - accepted directive is ENABLE
>           - accepted directive is HOLD
>       - the value of commandMemory on entry is DISABLED
>       - commandMemory is ENABLE PENDING
>       - power command is ENABLE NEW
>   - All of the following conditions hold:
>     
>       - availability decision decision is AVAILABLE FOR ENABLE
>       - demand view is not IDLE
>       - recovery gate is OPEN
>       - At least one of the following conditions holds:
>         
>           - accepted directive is ENABLE
>           - accepted directive is HOLD
>       - the value of commandMemory on entry is not DISABLED
>       - power command is ENABLE HOLD
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - actuation feedback is ENABLED CONFIRMED
>               - commandMemory is ENABLED
>           - All of the following conditions hold:
>             
>               - actuation feedback is DISABLED CONFIRMED
>               - commandMemory is ENABLE PENDING
>           - All of the following conditions hold:
>             
>               - actuation feedback is UNKNOWN
>               - commandMemory is the value of commandMemory on entry.

### Requirements for PowerManagementAssessmentOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_POWER_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, PowerManagementAssessmentOwner shall set power assessment to NOT READY INVALID.

#### Contract clauses evaluated in the compute phase

##### `CASE_05_POWER_READY` — Conditional behavior

> During contract evaluation for the compute phase, if power evidence validity is VALID, power evidence freshness is CURRENT, and power evidence condition is NOMINAL, PowerManagementAssessmentOwner shall set power assessment to READY NONE.

##### `CASE_06_POWER_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 POWER NOT READY applies under all of the following conditions:
>
> power evidence validity is INVALID, power evidence freshness is STALE, or power evidence condition is not NOMINAL.

> When all applicability conditions are met, PowerManagementAssessmentOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - power evidence validity is INVALID
>       - power assessment is NOT READY INVALID
>   - All of the following conditions hold:
>     
>       - power evidence validity is VALID
>       - power evidence freshness is STALE
>       - power assessment is NOT READY STALE
>   - All of the following conditions hold:
>     
>       - power evidence validity is VALID
>       - power evidence freshness is CURRENT
>       - power evidence condition is not NOMINAL
>       - power assessment is NOT READY CONDITION.

### Requirements for PropulsionEvidenceComposer

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PROPULSION_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, PropulsionEvidenceComposer shall set propulsion assessment to NOT READY ODD ENGINE GROUP.

#### Contract clauses evaluated in the compute phase

##### `CASE_13_PROPULSION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if odd engine assessment is READY NONE, even engine assessment is READY NONE, and configuration assessment is READY NONE, PropulsionEvidenceComposer shall set propulsion assessment to READY NONE.

##### `CASE_14_PROPULSION_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 14 PROPULSION NOT READY applies under all of the following conditions:
>
> odd engine assessment is not READY NONE, even engine assessment is not READY NONE, or configuration assessment is not READY NONE.

> When all applicability conditions are met, PropulsionEvidenceComposer shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - odd engine assessment is not READY NONE
>       - propulsion assessment is NOT READY ODD ENGINE GROUP
>   - All of the following conditions hold:
>     
>       - odd engine assessment is READY NONE
>       - even engine assessment is not READY NONE
>       - propulsion assessment is NOT READY EVEN ENGINE GROUP
>   - All of the following conditions hold:
>     
>       - odd engine assessment is READY NONE
>       - even engine assessment is READY NONE
>       - configuration assessment is not READY NONE
>       - propulsion assessment is NOT READY CONFIGURATION.

### Requirements for RecoveryQualificationOwner

#### Contract clauses evaluated in the initialization phase

May modify: recoveryMemory

##### `INITIAL_RECOVERY_CLOSED` — Required behavior

> During contract evaluation for the initialization phase, RecoveryQualificationOwner shall set recoveryMemory to AWAITING ACK, recovery frame phase to AWAITING ACK, recovery frame gate to CLOSED, and recovery gate to CLOSED.

#### Contract clauses evaluated in the compute phase

May modify: recoveryMemory

##### `RECOVERY_FRAME_PRESERVATION` — Required behavior

> During contract evaluation for the compute phase, RecoveryQualificationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recovery frame phase is recoveryMemory
>   - recovery frame gate is recovery gate
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recoveryMemory is NORMAL
>           - recovery gate is OPEN
>       - All of the following conditions hold:
>         
>           - recoveryMemory is not NORMAL
>           - recovery gate is CLOSED.

##### `CASE_25_FAULT_QUARANTINE` — Conditional behavior

> During contract evaluation for the compute phase, if fault action summary fault is ACTIVE, RecoveryQualificationOwner shall set recoveryMemory to QUARANTINED.

##### `CASE_26_AWAITING_ACK` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 26 AWAITING ACK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - fault action summary fault is CLEAR
>   - At least one of the following conditions holds:
>     
>       - the value of recoveryMemory on entry is QUARANTINED
>       - All of the following conditions hold:
>         
>           - the value of recoveryMemory on entry is AWAITING ACK
>           - fault action summary directive is not RECOVER.

> When all applicability conditions are met, RecoveryQualificationOwner shall produce a result for which all of the following conditions hold:
>
> recoveryMemory is AWAITING ACK.

##### `CASE_27_RECOVERY_OPEN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 27 RECOVERY OPEN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - fault action summary fault is CLEAR
>   - At least one of the following conditions holds:
>     
>       - the value of recoveryMemory on entry is NORMAL
>       - All of the following conditions hold:
>         
>           - the value of recoveryMemory on entry is AWAITING ACK
>           - fault action summary directive is RECOVER.

> When all applicability conditions are met, RecoveryQualificationOwner shall produce a result for which all of the following conditions hold:
>
> recoveryMemory is NORMAL.
