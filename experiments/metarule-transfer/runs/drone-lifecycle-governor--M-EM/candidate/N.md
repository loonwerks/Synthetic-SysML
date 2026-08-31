# Drone Lifecycle Governor

## Selected system context

### Need, purpose, and operational context

NEED-01: A logical drone needs one supervisory boundary that responds deterministically
to lifecycle requests while qualifying battery, navigation, radio, and charger
observations before changing source-named lifecycle status or authorizing related
outcomes.

PURPOSE-01: The Drone Lifecycle Governor shall coordinate the logical lifecycle states
`OFF`, `STANDBY`, `CHARGING`, `READY`, and `FLYING`; arbitrate fresh requests against
recovery needs; and publish logical power, charging, flight-authorization, and
pilot-status outcomes.

### Scope and boundary

CTX-01: The Ground Operator issues at most one value of `LifecycleRequest` per logical
evaluation and receives `PilotStatus`; this command role is a pilot abstraction because
the seed identifies a pilot only as a battery observer.

CTX-02: The Battery-Management Source provides a qualitative capacity band and an
independent status-check result; no physical state-of-charge percentage, discharge rate,
or endurance is assumed.

CTX-03: The Charger Interface reports whether a charger is logically connected and
receives no physical charging-control detail beyond the governor's enable/disable
outcome.

CTX-04: The Navigation Source reports a finite navigation condition without exposing
GPS, inertial, or barometric implementation details.

CTX-05: The Radio Source reports a finite communication condition without identifying an
external radio peer or protocol.

CTX-06: The Logical Power/Charging Recipient consumes power and charging commands; these
are permissions or logical outcomes, not evidence of physical actuation.

CTX-07: The Flight-Control Recipient consumes flight authorization; authorization does
not command takeoff, landing, maneuvering, or return-to-home.

### Exact finite boundary inputs

MON-01: `pilotRequest : LifecycleRequest` is supplied by `CTX-01` and has exactly
`{NO_REQUEST, SWITCH_ON, SWITCH_OFF, BEGIN_CHARGE, END_CHARGE, ACTIVATE, DEACTIVATE,
BEGIN_FLIGHT, END_FLIGHT}`.

MON-02: `chargerState : ChargerState` is supplied by `CTX-03` and has exactly
`{DISCONNECTED, CONNECTED}`.

MON-03: `batteryCapacity : BatteryCapacityBand` is supplied by `CTX-02` and has exactly
`{LOW, USABLE}`; it is qualitative and unitless.

MON-04: `batteryCheck : BatteryCheck` is supplied by `CTX-02` and has exactly `{INVALID,
VALID}`; `INVALID` overrides the capacity band.

MON-05: `navigationCondition : NavigationCondition` is supplied by `CTX-04` and has
exactly `{INVALID, NOT_READY, READY}`.

MON-06: `radioCondition : RadioCondition` is supplied by `CTX-05` and has exactly
`{INVALID, NOT_READY, READY}`.

### Exact finite controlled outputs

CTRL-01: `powerCommand : PowerCommand` is delivered to `CTX-06` and has exactly
`{POWER_OFF, SUPPORT_POWER, FLIGHT_POWER}`; it is a logical authorization category.

CTRL-02: `chargeCommand : ChargeCommand` is delivered to `CTX-06` and has exactly
`{CHARGE_DISABLED, CHARGE_ENABLED}`.

CTRL-03: `flightAuthorization : FlightAuthorization` is delivered to `CTX-07` and has
exactly `{DENIED, PERMITTED}`.

CTRL-04: `pilotStatus : PilotStatus` is delivered to `CTX-01` and is the finite product
of `LifecycleState`, `RequestDisposition`, and `PilotNotice`; its fields are semantic
results, not a user-interface layout.

### Lifecycle modes and transitions

MODE-01: `OFF` is externally distinguishable by `POWER_OFF`, `CHARGE_DISABLED`, and
`DENIED`; `NO_REQUEST` holds with no change, `SWITCH_ON` and idempotent `SWITCH_OFF` are
accepted, and every other fresh request is rejected.

MODE-02: `STANDBY` is externally distinguishable by `SUPPORT_POWER`, `CHARGE_DISABLED`,
and `DENIED`; it is the neutral point for activation, beginning charge, shutdown, and
recovery completion.

MODE-03: `CHARGING` is externally distinguishable by `POWER_OFF`, `CHARGE_ENABLED`, and
`DENIED`; charger disconnection or unavailable battery creates a recovery proposal to
`STANDBY`.

MODE-04: `READY` is externally distinguishable by `SUPPORT_POWER`, `CHARGE_DISABLED`,
and `DENIED`; loss of battery sufficiency or combined flight readiness creates a
recovery proposal to `STANDBY`.

MODE-05: `FLYING` is externally distinguishable by `FLIGHT_POWER`, `CHARGE_DISABLED`,
and `PERMITTED`; loss of battery sufficiency or combined readiness creates a recovery
proposal to `STANDBY`, without claiming physical landing.

### Risks and mitigations within the claim boundary

RISK-01: Invalid or low battery treated as sufficient could retain logical `READY` or
`FLYING` authorization contrary to policy; `FAULT-01` and request guards mitigate this
logical inconsistency without asserting physical safety.

RISK-02: Ignored navigation or radio degradation could retain flight authorization while
the selected readiness premise is false; `FAULT-02` mitigates this without asserting
communication or navigation performance.

RISK-03: Ignored charger loss in `CHARGING` could leave charge enablement asserted
despite the selected premise; `FAULT-03` and case 18 remove that logical inconsistency
without claiming electrical isolation.

RISK-04: Honoring fresh progression and recovery together could create contradictory
outcomes; `PRI-01`, cases 11–17, and the single state owner prevent that ambiguity.

### Essential assumptions and constraints

ASM-01: `CTX-01` supplies exactly one finite request per evaluation; the abstract does
not authenticate or authorize the human source. This makes conflict with internally
derived recovery finite and analyzable.

ASM-02: `CTX-02` supplies both battery fields; `INVALID` makes capacity untrusted.
Independent validity prevents capacity from silently implying trustworthiness.

ASM-03: `CTX-03`, `CTX-04`, and `CTX-05` supply domain-valid finite values without
promises of physical accuracy, latency, availability, or fault independence.

ASM-04: `currentLifecycleState` on interaction 11 is the previous committed state for
the current evaluation. The state-owner contract shall publish it from
`In(lifecycleState)` while updating only post-state, breaking same-evaluation feedback
ambiguity.

## Supporting contract definitions

### State `Drone_Lifecycle_Governor::LifecycleStateGovernor::committedLifecycleState`

State `committedLifecycleState` has type `Drone_Lifecycle_Governor::LifecycleState`.

## Detailed behavioral requirements

### Requirements for BatteryQualificationOwner

#### Contract clauses evaluated in the compute phase

##### `CASE_01` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is Drone Lifecycle Governor BatteryCheck INVALID, BatteryQualificationOwner shall set batteryQualification to Drone Lifecycle Governor BatteryQualification UNAVAILABLE.

##### `CASE_02` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is Drone Lifecycle Governor BatteryCheck VALID and batteryCapacity is Drone Lifecycle Governor BatteryCapacityBand LOW, BatteryQualificationOwner shall set batteryQualification to Drone Lifecycle Governor BatteryQualification INSUFFICIENT.

##### `CASE_03` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is Drone Lifecycle Governor BatteryCheck VALID and batteryCapacity is Drone Lifecycle Governor BatteryCapacityBand USABLE, BatteryQualificationOwner shall set batteryQualification to Drone Lifecycle Governor BatteryQualification SUFFICIENT.

### Requirements for FlightAuthorizationPolicy

#### Contract clauses evaluated in the initialization phase

##### `InitialFlightAuthorization` — Required behavior

> During contract evaluation for the initialization phase, FlightAuthorizationPolicy shall set flightAuthorization to Drone Lifecycle Governor FlightAuthorization DENIED.

#### Contract clauses evaluated in the compute phase

##### `CASE_19` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 applies under all of the following conditions:
>
> decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState OFF, decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY, decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState CHARGING, decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState READY, or decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState FLYING.

> When all applicability conditions are met, FlightAuthorizationPolicy shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState FLYING
>       - flightAuthorization is Drone Lifecycle Governor FlightAuthorization PERMITTED
>   - All of the following conditions hold:
>     
>       - decisionSnapshot nextState is not Drone Lifecycle Governor DecisionNextState FLYING
>       - flightAuthorization is Drone Lifecycle Governor FlightAuthorization DENIED.

### Requirements for FlightReadinessOwner

#### Contract clauses evaluated in the compute phase

##### `CASE_04` — Conditional behavior

> During contract evaluation for the compute phase, if navigationCondition is Drone Lifecycle Governor NavigationCondition INVALID or radioCondition is Drone Lifecycle Governor RadioCondition INVALID, FlightReadinessOwner shall set flightQualification to Drone Lifecycle Governor FlightQualification UNAVAILABLE.

##### `CASE_05` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - navigationCondition is not Drone Lifecycle Governor NavigationCondition INVALID
>   - radioCondition is not Drone Lifecycle Governor RadioCondition INVALID
>   - At least one of the following conditions holds:
>     
>       - navigationCondition is Drone Lifecycle Governor NavigationCondition NOT READY
>       - radioCondition is Drone Lifecycle Governor RadioCondition NOT READY.

> When all applicability conditions are met, FlightReadinessOwner shall produce a result for which all of the following conditions hold:
>
> flightQualification is Drone Lifecycle Governor FlightQualification NOT READY.

##### `CASE_06` — Conditional behavior

> During contract evaluation for the compute phase, if navigationCondition is Drone Lifecycle Governor NavigationCondition READY and radioCondition is Drone Lifecycle Governor RadioCondition READY, FlightReadinessOwner shall set flightQualification to Drone Lifecycle Governor FlightQualification READY.

### Requirements for LifecycleStateGovernor

#### Contract clauses evaluated in the initialization phase

##### `InitialLifecycleState` — Required behavior

> During contract evaluation for the initialization phase, LifecycleStateGovernor shall set committedLifecycleState to Drone Lifecycle Governor LifecycleState OFF.

##### `InitialCurrentState` — Required behavior

> During contract evaluation for the initialization phase, LifecycleStateGovernor shall set currentLifecycleState to Drone Lifecycle Governor LifecycleState OFF.

##### `InitialDecisionSnapshot` — Required behavior

> During contract evaluation for the initialization phase, LifecycleStateGovernor shall set decisionSnapshot preState to Drone Lifecycle Governor DecisionPreState OFF, decisionSnapshot nextState to Drone Lifecycle Governor DecisionNextState OFF, decisionSnapshot effectiveIntent to Drone Lifecycle Governor EffectiveIntent NO INTENT, decisionSnapshot transitionResult to Drone Lifecycle Governor TransitionResult NO CHANGE, and decisionSnapshot decisionReason to Drone Lifecycle Governor EligibilityReason NONE.

#### Contract clauses evaluated in the compute phase

##### `PublishCommittedPreState` — Required behavior

> During contract evaluation for the compute phase, LifecycleStateGovernor shall set currentLifecycleState to the value of committedLifecycleState on entry.

##### `PreserveDecisionInputsAndCommitNextState` — Required behavior

> During contract evaluation for the compute phase, LifecycleStateGovernor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - decisionSnapshot effectiveIntent is arbitratedIntent effectiveIntent
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState OFF
>           - decisionSnapshot preState is Drone Lifecycle Governor DecisionPreState OFF
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>           - decisionSnapshot preState is Drone Lifecycle Governor DecisionPreState STANDBY
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState CHARGING
>           - decisionSnapshot preState is Drone Lifecycle Governor DecisionPreState CHARGING
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>           - decisionSnapshot preState is Drone Lifecycle Governor DecisionPreState READY
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState FLYING
>           - decisionSnapshot preState is Drone Lifecycle Governor DecisionPreState FLYING
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState OFF
>           - committedLifecycleState is Drone Lifecycle Governor LifecycleState OFF
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY
>           - committedLifecycleState is Drone Lifecycle Governor LifecycleState STANDBY
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState CHARGING
>           - committedLifecycleState is Drone Lifecycle Governor LifecycleState CHARGING
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState READY
>           - committedLifecycleState is Drone Lifecycle Governor LifecycleState READY
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState FLYING
>           - committedLifecycleState is Drone Lifecycle Governor LifecycleState FLYING.

##### `CASE_14` — Conditional behavior

> During contract evaluation for the compute phase, if arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent SWITCH OFF, LifecycleStateGovernor shall set decisionSnapshot nextState to Drone Lifecycle Governor DecisionNextState OFF, decisionSnapshot transitionResult to Drone Lifecycle Governor TransitionResult ACCEPTED, and decisionSnapshot decisionReason to Drone Lifecycle Governor EligibilityReason NONE.

##### `CASE_15` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState OFF
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent SWITCH ON
>   - All of the following conditions hold:
>     
>       - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN CHARGE
>       - eligibilityEnvelope chargeEligible is true exactly when T is true
>   - All of the following conditions hold:
>     
>       - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent ACTIVATE
>       - eligibilityEnvelope flightEligible is true exactly when T is true
>   - All of the following conditions hold:
>     
>       - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN FLIGHT
>       - eligibilityEnvelope flightEligible is true exactly when T is true.

> When all applicability conditions are met, LifecycleStateGovernor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult ACCEPTED
>   - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason NONE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState OFF
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN CHARGE
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState CHARGING
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent ACTIVATE
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState READY
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState FLYING.

##### `CASE_16` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 16 applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState CHARGING
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent END CHARGE
>   - All of the following conditions hold:
>     
>       - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent DEACTIVATE
>   - All of the following conditions hold:
>     
>       - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState FLYING
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent END FLIGHT
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState FLYING
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState CHARGING
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent RECOVER TO STANDBY.

> When all applicability conditions are met, LifecycleStateGovernor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState CHARGING
>               - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent END CHARGE
>           - All of the following conditions hold:
>             
>               - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>               - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent DEACTIVATE
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY
>       - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult ACCEPTED
>       - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason NONE
>   - All of the following conditions hold:
>     
>       - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState FLYING
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent END FLIGHT
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState READY
>       - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult ACCEPTED
>       - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason NONE
>   - All of the following conditions hold:
>     
>       - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent RECOVER TO STANDBY
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY
>       - decisionSnapshot decisionReason is eligibilityEnvelope decisionReason
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - arbitratedIntent preemption is Drone Lifecycle Governor FreshRequestPreemption PREEMPTED
>               - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult FRESH REQUEST PREEMPTED
>           - All of the following conditions hold:
>             
>               - arbitratedIntent preemption is Drone Lifecycle Governor FreshRequestPreemption NOT PREEMPTED
>               - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult RECOVERY APPLIED.

##### `CASE_17` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 17 applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - arbitratedIntent effectiveIntent is not Drone Lifecycle Governor EffectiveIntent SWITCH OFF
>   - It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState OFF
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent SWITCH ON
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN CHARGE
>           - eligibilityEnvelope chargeEligible is true exactly when T is true
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent ACTIVATE
>           - eligibilityEnvelope flightEligible is true exactly when T is true
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN FLIGHT
>           - eligibilityEnvelope flightEligible is true exactly when T is true
>   - It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState CHARGING
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent END CHARGE
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent DEACTIVATE
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState FLYING
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent END FLIGHT
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>               - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState FLYING
>               - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState CHARGING
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent RECOVER TO STANDBY.

> When all applicability conditions are met, LifecycleStateGovernor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState OFF
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState OFF
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState CHARGING
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState CHARGING
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState READY
>       - All of the following conditions hold:
>         
>           - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState FLYING
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState FLYING
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent NO INTENT
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult NO CHANGE
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason NONE
>       - All of the following conditions hold:
>         
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent REJECT BEGIN CHARGE
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult REJECTED
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason CHARGER DISCONNECTED
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>                   - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN CHARGE
>                   - eligibilityEnvelope chargeEligible is true exactly when F is true
>               - All of the following conditions hold:
>                 
>                   - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>                   - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent ACTIVATE
>                   - eligibilityEnvelope flightEligible is true exactly when F is true
>               - All of the following conditions hold:
>                 
>                   - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>                   - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN FLIGHT
>                   - eligibilityEnvelope flightEligible is true exactly when F is true
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult REJECTED
>           - decisionSnapshot decisionReason is eligibilityEnvelope decisionReason
>       - All of the following conditions hold:
>         
>           - arbitratedIntent effectiveIntent is not Drone Lifecycle Governor EffectiveIntent NO INTENT
>           - arbitratedIntent effectiveIntent is not Drone Lifecycle Governor EffectiveIntent REJECT BEGIN CHARGE
>           - It is not the case that:
>             
>             At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>                   - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN CHARGE
>                   - eligibilityEnvelope chargeEligible is true exactly when F is true
>               - All of the following conditions hold:
>                 
>                   - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState STANDBY
>                   - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent ACTIVATE
>                   - eligibilityEnvelope flightEligible is true exactly when F is true
>               - All of the following conditions hold:
>                 
>                   - the value of committedLifecycleState on entry is Drone Lifecycle Governor LifecycleState READY
>                   - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN FLIGHT
>                   - eligibilityEnvelope flightEligible is true exactly when F is true
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult REJECTED
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason NONE.

### Requirements for OperationalEligibilityOwner

#### Contract clauses evaluated in the compute phase

##### `CASE_07` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - currentLifecycleState is Drone Lifecycle Governor LifecycleState READY
>       - currentLifecycleState is Drone Lifecycle Governor LifecycleState FLYING
>   - batteryQualification is not Drone Lifecycle Governor BatteryQualification SUFFICIENT.

> When all applicability conditions are met, OperationalEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - eligibilityEnvelope flightEligible is true exactly when F is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     eligibilityEnvelope chargeEligible is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - chargerState is Drone Lifecycle Governor ChargerState CONNECTED
>       - batteryQualification is not Drone Lifecycle Governor BatteryQualification UNAVAILABLE
>   - recoveryProposal is Drone Lifecycle Governor RecoveryProposal TO STANDBY BATTERY
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification UNAVAILABLE
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason BATTERY UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification INSUFFICIENT
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason BATTERY LOW.

##### `CASE_08` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - currentLifecycleState is Drone Lifecycle Governor LifecycleState READY
>       - currentLifecycleState is Drone Lifecycle Governor LifecycleState FLYING
>   - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>   - flightQualification is not Drone Lifecycle Governor FlightQualification READY.

> When all applicability conditions are met, OperationalEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - eligibilityEnvelope flightEligible is true exactly when F is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     eligibilityEnvelope chargeEligible is true
>     
>     **Second condition:**
>     
>     chargerState is Drone Lifecycle Governor ChargerState CONNECTED
>   - recoveryProposal is Drone Lifecycle Governor RecoveryProposal TO STANDBY READINESS
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - flightQualification is Drone Lifecycle Governor FlightQualification UNAVAILABLE
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason FLIGHT UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - flightQualification is Drone Lifecycle Governor FlightQualification NOT READY
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason FLIGHT NOT READY.

##### `CASE_09` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - currentLifecycleState is Drone Lifecycle Governor LifecycleState CHARGING
>   - At least one of the following conditions holds:
>     
>       - chargerState is Drone Lifecycle Governor ChargerState DISCONNECTED
>       - batteryQualification is Drone Lifecycle Governor BatteryQualification UNAVAILABLE.

> When all applicability conditions are met, OperationalEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     eligibilityEnvelope flightEligible is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>       - flightQualification is Drone Lifecycle Governor FlightQualification READY
>   - eligibilityEnvelope chargeEligible is true exactly when F is true
>   - recoveryProposal is Drone Lifecycle Governor RecoveryProposal TO STANDBY CHARGE PATH
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - chargerState is Drone Lifecycle Governor ChargerState DISCONNECTED
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason CHARGER DISCONNECTED
>       - All of the following conditions hold:
>         
>           - chargerState is Drone Lifecycle Governor ChargerState CONNECTED
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification UNAVAILABLE
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason BATTERY UNAVAILABLE.

##### `CASE_10` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - currentLifecycleState is Drone Lifecycle Governor LifecycleState READY
>           - currentLifecycleState is Drone Lifecycle Governor LifecycleState FLYING
>       - batteryQualification is not Drone Lifecycle Governor BatteryQualification SUFFICIENT
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - currentLifecycleState is Drone Lifecycle Governor LifecycleState READY
>           - currentLifecycleState is Drone Lifecycle Governor LifecycleState FLYING
>       - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>       - flightQualification is not Drone Lifecycle Governor FlightQualification READY
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - currentLifecycleState is Drone Lifecycle Governor LifecycleState CHARGING
>       - At least one of the following conditions holds:
>         
>           - chargerState is Drone Lifecycle Governor ChargerState DISCONNECTED
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification UNAVAILABLE.

> When all applicability conditions are met, OperationalEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recoveryProposal is Drone Lifecycle Governor RecoveryProposal NO RECOVERY
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     eligibilityEnvelope flightEligible is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>       - flightQualification is Drone Lifecycle Governor FlightQualification READY
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     eligibilityEnvelope chargeEligible is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - chargerState is Drone Lifecycle Governor ChargerState CONNECTED
>       - batteryQualification is not Drone Lifecycle Governor BatteryQualification UNAVAILABLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification UNAVAILABLE
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason BATTERY UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification INSUFFICIENT
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason BATTERY LOW
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - flightQualification is Drone Lifecycle Governor FlightQualification UNAVAILABLE
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason FLIGHT UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - flightQualification is Drone Lifecycle Governor FlightQualification NOT READY
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason FLIGHT NOT READY
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - flightQualification is Drone Lifecycle Governor FlightQualification READY
>           - eligibilityEnvelope decisionReason is Drone Lifecycle Governor EligibilityReason NONE.

### Requirements for PowerChargeCommandPolicy

#### Contract clauses evaluated in the initialization phase

##### `InitialPowerCommand` — Required behavior

> During contract evaluation for the initialization phase, PowerChargeCommandPolicy shall set powerCommand to Drone Lifecycle Governor PowerCommand POWER OFF.

##### `InitialChargeCommand` — Required behavior

> During contract evaluation for the initialization phase, PowerChargeCommandPolicy shall set chargeCommand to Drone Lifecycle Governor ChargeCommand CHARGE DISABLED.

#### Contract clauses evaluated in the compute phase

##### `CASE_18` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 applies under all of the following conditions:
>
> decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState OFF, decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY, decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState CHARGING, decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState READY, or decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState FLYING.

> When all applicability conditions are met, PowerChargeCommandPolicy shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState OFF
>       - powerCommand is Drone Lifecycle Governor PowerCommand POWER OFF
>       - chargeCommand is Drone Lifecycle Governor ChargeCommand CHARGE DISABLED
>   - All of the following conditions hold:
>     
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY
>       - powerCommand is Drone Lifecycle Governor PowerCommand SUPPORT POWER
>       - chargeCommand is Drone Lifecycle Governor ChargeCommand CHARGE DISABLED
>   - All of the following conditions hold:
>     
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState CHARGING
>       - powerCommand is Drone Lifecycle Governor PowerCommand POWER OFF
>       - chargeCommand is Drone Lifecycle Governor ChargeCommand CHARGE ENABLED
>   - All of the following conditions hold:
>     
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState READY
>       - powerCommand is Drone Lifecycle Governor PowerCommand SUPPORT POWER
>       - chargeCommand is Drone Lifecycle Governor ChargeCommand CHARGE DISABLED
>   - All of the following conditions hold:
>     
>       - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState FLYING
>       - powerCommand is Drone Lifecycle Governor PowerCommand FLIGHT POWER
>       - chargeCommand is Drone Lifecycle Governor ChargeCommand CHARGE DISABLED.

### Requirements for RequestArbiter

#### Contract clauses evaluated in the compute phase

##### `CASE_11` — Conditional behavior

> During contract evaluation for the compute phase, if pilotRequest is Drone Lifecycle Governor LifecycleRequest SWITCH OFF, RequestArbiter shall set arbitratedIntent effectiveIntent to Drone Lifecycle Governor EffectiveIntent SWITCH OFF and arbitratedIntent preemption to Drone Lifecycle Governor FreshRequestPreemption NOT PREEMPTED.

##### `CASE_12` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 applies under all of the following conditions:
>
> pilotRequest is not Drone Lifecycle Governor LifecycleRequest SWITCH OFF and recoveryProposal is not Drone Lifecycle Governor RecoveryProposal NO RECOVERY.

> When all applicability conditions are met, RequestArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent RECOVER TO STANDBY
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest NO REQUEST
>           - arbitratedIntent preemption is Drone Lifecycle Governor FreshRequestPreemption NOT PREEMPTED
>       - All of the following conditions hold:
>         
>           - pilotRequest is not Drone Lifecycle Governor LifecycleRequest NO REQUEST
>           - arbitratedIntent preemption is Drone Lifecycle Governor FreshRequestPreemption PREEMPTED.

##### `CASE_13` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 13 applies under all of the following conditions:
>
> pilotRequest is not Drone Lifecycle Governor LifecycleRequest SWITCH OFF and recoveryProposal is Drone Lifecycle Governor RecoveryProposal NO RECOVERY.

> When all applicability conditions are met, RequestArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - arbitratedIntent preemption is Drone Lifecycle Governor FreshRequestPreemption NOT PREEMPTED
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest NO REQUEST
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent NO INTENT
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest SWITCH ON
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent SWITCH ON
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest BEGIN CHARGE
>           - chargerState is Drone Lifecycle Governor ChargerState DISCONNECTED
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent REJECT BEGIN CHARGE
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest BEGIN CHARGE
>           - chargerState is Drone Lifecycle Governor ChargerState CONNECTED
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN CHARGE
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest END CHARGE
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent END CHARGE
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest ACTIVATE
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent ACTIVATE
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest DEACTIVATE
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent DEACTIVATE
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest BEGIN FLIGHT
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent BEGIN FLIGHT
>       - All of the following conditions hold:
>         
>           - pilotRequest is Drone Lifecycle Governor LifecycleRequest END FLIGHT
>           - arbitratedIntent effectiveIntent is Drone Lifecycle Governor EffectiveIntent END FLIGHT.

### Requirements for SupervisoryStatusAssessment

#### Contract clauses evaluated in the initialization phase

##### `InitialPilotStatus` — Required behavior

> During contract evaluation for the initialization phase, SupervisoryStatusAssessment shall set pilotStatus lifecycleState to Drone Lifecycle Governor PilotLifecycleState OFF, pilotStatus requestDisposition to Drone Lifecycle Governor RequestDisposition NO CHANGE, and pilotStatus pilotNotice to Drone Lifecycle Governor PilotNotice NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_20` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 applies under all of the following conditions:
>
> decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult NO CHANGE, decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult ACCEPTED, decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult REJECTED, decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult RECOVERY APPLIED, or decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult FRESH REQUEST PREEMPTED.

> When all applicability conditions are met, SupervisoryStatusAssessment shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState OFF
>           - pilotStatus lifecycleState is Drone Lifecycle Governor PilotLifecycleState OFF
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState STANDBY
>           - pilotStatus lifecycleState is Drone Lifecycle Governor PilotLifecycleState STANDBY
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState CHARGING
>           - pilotStatus lifecycleState is Drone Lifecycle Governor PilotLifecycleState CHARGING
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState READY
>           - pilotStatus lifecycleState is Drone Lifecycle Governor PilotLifecycleState READY
>       - All of the following conditions hold:
>         
>           - decisionSnapshot nextState is Drone Lifecycle Governor DecisionNextState FLYING
>           - pilotStatus lifecycleState is Drone Lifecycle Governor PilotLifecycleState FLYING
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult NO CHANGE
>           - pilotStatus requestDisposition is Drone Lifecycle Governor RequestDisposition NO CHANGE
>       - All of the following conditions hold:
>         
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult ACCEPTED
>           - pilotStatus requestDisposition is Drone Lifecycle Governor RequestDisposition ACCEPTED
>       - All of the following conditions hold:
>         
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult REJECTED
>           - pilotStatus requestDisposition is Drone Lifecycle Governor RequestDisposition REJECTED
>       - All of the following conditions hold:
>         
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult RECOVERY APPLIED
>           - pilotStatus requestDisposition is Drone Lifecycle Governor RequestDisposition RECOVERY APPLIED
>       - All of the following conditions hold:
>         
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult FRESH REQUEST PREEMPTED
>           - pilotStatus requestDisposition is Drone Lifecycle Governor RequestDisposition PREEMPTED
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification UNAVAILABLE
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice BATTERY UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification INSUFFICIENT
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice BATTERY LOW
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason BATTERY UNAVAILABLE
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice BATTERY UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason BATTERY LOW
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice BATTERY LOW
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason FLIGHT UNAVAILABLE
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice FLIGHT UNAVAILABLE
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason FLIGHT NOT READY
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice FLIGHT NOT READY
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason CHARGER DISCONNECTED
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice CHARGER DISCONNECTED
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason NONE
>           - decisionSnapshot transitionResult is Drone Lifecycle Governor TransitionResult REJECTED
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice INAPPLICABLE REQUEST
>       - All of the following conditions hold:
>         
>           - batteryQualification is Drone Lifecycle Governor BatteryQualification SUFFICIENT
>           - decisionSnapshot decisionReason is Drone Lifecycle Governor EligibilityReason NONE
>           - decisionSnapshot transitionResult is not Drone Lifecycle Governor TransitionResult REJECTED
>           - pilotStatus pilotNotice is Drone Lifecycle Governor PilotNotice NONE.
