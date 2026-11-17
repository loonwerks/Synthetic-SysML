# Logical drone lifecycle and energy governor

## Selected system context

### Synopsis, need, purpose, and scope

NEED-01: A pilot needs one coherent logical disposition of charge, readiness,
flight-lifecycle, energy-confidence, and fault evidence instead of independent
source-named events whose authority and priority are unspecified.

PURPOSE-01: The system shall accept one finite observation/request snapshot per logical
evaluation step and issue one complete, mutually consistent supervision tuple governing
charge permission, launch permission, flight intent, propulsion permission, public
lifecycle phase, request disposition, battery notice, and fault indications.

### Goals

GOAL-01: The system shall produce exactly one value for every controlled quantity for
every reachable state pair and every admitted finite input snapshot.

GOAL-02: The system shall resolve simultaneously applicable lifecycle, request, energy,
and fault conditions according to the explicit first-match priority partition
`CASE-L-01` through `CASE-L-26`.

GOAL-03: The system shall expose each declared local fault, propagate their exact
disjunction, apply the assigned mitigation, and recover only with the specified
correction evidence and fresh-request behavior.

GOAL-04: Multiple state and decision owners shall compose to the same result as the
direct thirty-case policy oracle, with no hidden state, central recomputation of
owner-local decisions, or identity-wrapper ownership credit.

GOAL-05: The system should expose logical readiness and lifecycle status useful to a
pilot without claiming physical flight, endurance, observation, or safety performance.

### Operational context and exact boundary

CTX-01: The pilot supplies one lifecycle request and receives phase, request
disposition, battery notice, and fault status. The pilot is responsible for supplying
the intended current request; the governor neither authenticates the pilot nor stores a
rejected or preempted request.

CTX-02: The battery-reporting context supplies one qualitative band with an independent
validity status. It is responsible for the admitted encoding, not for physical accuracy
proven by this model.

CTX-03: The charger context supplies connection/health state and receives charge
permission. Physical charging and charge completion are outside.

CTX-04: The navigation-support context supplies abstract usability. Position,
trajectory, GPS, inertial, barometric, and obstacle computations are outside.

CTX-05: The flight-control context supplies abstract availability and receives flight
intent plus launch permission. Vehicle-control laws are outside.

CTX-06: The home-evidence context supplies value and validity for arrival at an abstract
home condition. Return-to-home control is not modeled or claimed.

CTX-07: The touchdown-evidence context supplies value and validity for an abstract
completed-touchdown condition. Landing gear does not itself satisfy this evidence.

CTX-08: The propulsion/vehicle context receives propulsion permission. Engine count,
motor control, thrust, and physical motion are outside.

CTX-09: The logical evaluation context presents a simultaneous snapshot and retains no
state on behalf of the system. An evaluation step defines ordering only and has no
duration or real-time guarantee.

MON-01: `request`, from CTX-01, is exactly one of `None`, `SwitchOn`, `SwitchOff`,
`StartCharge`, `StopCharge`, `Activate`, `Deactivate`, `Launch`, `Return`, or `Land`.

MON-02: `batteryReport`, from CTX-02, is the product of band `Full`, `Medium`, `Low`, or
`Critical` and status `Valid` or `Invalid`.

MON-03: `chargerReport`, from CTX-03, is exactly `Disconnected`, `ConnectedHealthy`, or
`ConnectedFaulted`.

MON-04: `navigationReport`, from CTX-04, is exactly `Usable` or `Unusable`.

MON-05: `flightControlReport`, from CTX-05, is exactly `Available` or `Faulted`.

MON-06: `homeReport`, from CTX-06, is the product of value `Away` or `Reached` and
status `Valid` or `Invalid`.

MON-07: `touchdownReport`, from CTX-07, is the product of value `NotConfirmed` or
`Confirmed` and status `Valid` or `Invalid`.

CTRL-01: `phase`, to CTX-01, is exactly `Off`, `Standby`, `Charging`, `Ready`, `Flying`,
`Returning`, or `Landing`.

CTRL-02: `requestResult`, to CTX-01, is exactly `None`, `Accepted`, `Rejected`, or
`Preempted`.

CTRL-03: `batteryNotice`, to CTX-01, is exactly `Untrusted`, `Clear`, `Low`, or
`Critical`.

CTRL-04: `faultStatus`, to CTX-01, contains battery, charger, navigation,
flight-control, home-evidence, touchdown-evidence, and aggregate fields, each exactly
`Clear` or `Asserted`.

CTRL-05: `chargePermission`, to CTX-03, is exactly `Denied` or `Permitted`.

CTRL-06: `flightIntent`, to CTX-05, is exactly `Hold`, `Launch`, `Continue`, `Return`,
or `Land`.

CTRL-07: `launchPermission`, to CTX-05, is exactly `Denied` or `Permitted`.

CTRL-08: `propulsionPermission`, to CTX-08, is exactly `Disabled` or `Enabled`.

### Essential assumptions and constraints

ASM-01: CTX-09 is responsible for presenting exactly one coherent value for each `MON-*`
per logical step. Rationale: atomic snapshot semantics are needed to make priority and
composition finite and unambiguous.

ASM-02: CTX-01 through CTX-07 are responsible for using only the closed values declared
above. Rationale: the bounded analyzer and exhaustive partitions apply only to this
finite domain.

ASM-03: CTX-02, CTX-06, and CTX-07 are responsible for pairing status with value.
`Invalid` is authoritative, while `Valid` is admitted rather than independently
diagnosed. Rationale: the governor must not silently trust a value explicitly marked
invalid.

ASM-04: CTX-02 is responsible for mapping any physical battery condition to a
qualitative band. The system assumes no unit, threshold, precision, discharge rate,
capacity, or endurance. Rationale: none is source-grounded.

ASM-05: Initial system state is phase `Off` and battery confidence `Untrusted`.
Rationale: safe logical initialization is required for deterministic analysis, but is a
pilot choice rather than an enum-order inference.

ASM-06: A request exists only in the current snapshot. Rejected, preempted, or completed
requests are not latched; after fault correction or confidence recovery, the requested
action occurs only if a fresh applicable request is present. Rationale: stale intent
must not become an uncommanded transition.

### Fault propagation, risks, and recovery

RISK-01: Invalid battery evidence, trusted `Critical`, or flight-control fault while
airborne could otherwise permit continued flight contrary to the pilot policy.

RISK-02: Navigation loss could otherwise leave an airborne phase without a deterministic
mitigation sequence.

RISK-03: Invalid home or touchdown evidence could otherwise falsely complete return or
landing.

RISK-04: Charger disconnect or fault could otherwise permit entry to or retention of
logical charging.

RISK-05: Independently derived fault and command paths could otherwise publish an
inconsistent tuple or stale aggregate fault.

### Observable modes and transitions

MODE-01: `Off` holds all permissions disabled and accepts only current `SwitchOn`
through `CASE-L-11`.

MODE-02: `Standby` may accept eligible charge or activation and otherwise holds;
`SwitchOff` is observable through transition to `Off`.

MODE-03: `Charging` permits charge only while current retention eligibility holds and
exits on stop, switch-off, full band, disconnect, or charger fault.

MODE-04: `Ready` may accept eligible launch or deactivate and otherwise holds; loss of
usable/sufficient battery selects `Standby`.

MODE-05: `Flying` distinguishes launch entry from continued flight and can be preempted
by emergency landing, forced/requested return, or requested land.

MODE-06: `Returning` commands `Return` until emergency landing, navigation loss,
requested land, or valid arrival selects `Landing`.

MODE-07: `Landing` commands `Land` until valid touchdown selects `Ready` when currently
ready-eligible, otherwise `Standby`.

## Supporting contract definitions

### State `Drone_Lifecycle_Energy_Governor::BatteryConfidenceOwner::confidenceState`

State `confidenceState` has type `Drone_Lifecycle_Energy_Governor::BatteryConfidence`.

### State `Drone_Lifecycle_Energy_Governor::LifecyclePriorityOwner::phaseState`

State `phaseState` has type `Drone_Lifecycle_Energy_Governor::LifecyclePhase`.

## Detailed behavioral requirements

### Requirements for AirborneHazardProposalOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HAZARD_PROPOSAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AirborneHazardProposalOwner shall set proposalOut emergencyLand to true exactly when T is true, proposalOut forcedReturn to true exactly when F is true, proposalOut batteryUnusable to true exactly when T is true, proposalOut lowOrCritical to true exactly when F is true, and proposalOut navigationUnusable to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `AIRBORNE_HAZARD_PROPOSALS` — Required behavior

> During contract evaluation for the compute phase, AirborneHazardProposalOwner shall set proposalOut batteryUnusable to true exactly when batteryIn usable is true exactly when F is true, proposalOut lowOrCritical to true exactly when All of the following conditions hold:
>
>   - batteryIn usable is true
>   - At least one of the following conditions holds:
>     
>       - batteryIn band is LOW
>       - batteryIn band is CRITICAL, proposalOut navigationUnusable to true exactly when navigationIn is UNUSABLE, proposalOut emergencyLand to true exactly when At least one of the following conditions holds:
>
>   - batteryIn usable is true exactly when F is true
>   - All of the following conditions hold:
>     
>       - batteryIn confidence is TRUSTED
>       - batteryIn band is CRITICAL
>   - flightControlIn is FAULTED, and proposalOut forcedReturn to true exactly when At least one of the following conditions holds:
>
>   - navigationIn is UNUSABLE
>   - All of the following conditions hold:
>     
>       - batteryIn confidence is TRUSTED
>       - batteryIn band is LOW.

### Requirements for AirborneRequestProposalOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NO_AIRBORNE_REQUEST` — Required behavior

> During contract evaluation for the initialization phase, AirborneRequestProposalOwner shall set proposalOut to NO AIRBORNE REQUEST.

#### Contract clauses evaluated in the compute phase

##### `AIRBORNE_REQUEST_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, AirborneRequestProposalOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - semanticsIn intentCode is RETURN
>       - proposalOut is RETURN REQUESTED
>   - All of the following conditions hold:
>     
>       - semanticsIn intentCode is LAND
>       - proposalOut is LAND REQUESTED
>   - All of the following conditions hold:
>     
>       - semanticsIn intentCode is not RETURN
>       - semanticsIn intentCode is not LAND
>       - proposalOut is NO AIRBORNE REQUEST.

### Requirements for BatteryConfidenceOwner

#### Contract clauses evaluated in the initialization phase

May modify: confidenceState

##### `INITIAL_CONFIDENCE_AND_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, BatteryConfidenceOwner shall set confidenceState to UNTRUSTED, stateToCharge band to CRITICAL, stateToCharge confidence to UNTRUSTED, stateToCharge usable to true exactly when F is true, stateToReadiness band to CRITICAL, stateToReadiness confidence to UNTRUSTED, stateToReadiness usable to true exactly when F is true, confidenceToFault to UNTRUSTED, stateToComposition band to CRITICAL, stateToComposition confidence to UNTRUSTED, stateToComposition usable to true exactly when F is true, stateToHazard band to CRITICAL, stateToHazard confidence to UNTRUSTED, and stateToHazard usable to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: confidenceState

##### `SAME_STEP_CONFIDENCE_PRESERVATION` — Required behavior

> During contract evaluation for the compute phase, BatteryConfidenceOwner shall set stateToCharge band to evidenceIn band, stateToReadiness band to evidenceIn band, stateToComposition band to evidenceIn band, stateToHazard band to evidenceIn band, stateToCharge confidence to confidenceState, stateToReadiness confidence to confidenceState, confidenceToFault to confidenceState, stateToComposition confidence to confidenceState, stateToHazard confidence to confidenceState, stateToCharge usable to true exactly when confidenceState is TRUSTED, stateToReadiness usable to true exactly when stateToCharge usable is true, stateToComposition usable to true exactly when stateToCharge usable is true, and stateToHazard usable to true exactly when stateToCharge usable is true.

##### `CASE_A_01_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceIn validBand is true exactly when F is true, BatteryConfidenceOwner shall set confidenceState to UNTRUSTED.

##### `CASE_A_02_FIRST_VALID` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceIn validBand is true exactly when T is true and the value of confidenceState on entry is UNTRUSTED, BatteryConfidenceOwner shall set confidenceState to CONFIRMING.

##### `CASE_A_03_SECOND_VALID` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceIn validBand is true exactly when T is true and the value of confidenceState on entry is CONFIRMING, BatteryConfidenceOwner shall set confidenceState to TRUSTED.

##### `CASE_A_04_TRUSTED_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceIn validBand is true exactly when T is true and the value of confidenceState on entry is TRUSTED, BatteryConfidenceOwner shall set confidenceState to TRUSTED.

### Requirements for BatteryEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BATTERY_EVIDENCE_UNTRUSTED` — Required behavior

> During contract evaluation for the initialization phase, BatteryEvidenceQualifier shall set evidenceOut band to CRITICAL and evidenceOut validBand to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `VALID_BAND_SUPPRESSION` — Required behavior

> During contract evaluation for the compute phase, BatteryEvidenceQualifier shall set evidenceOut band to reportIn band and evidenceOut validBand to true exactly when reportIn validity is VALID.

### Requirements for ChargeEligibilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CHARGE_DENIED` — Required behavior

> During contract evaluation for the initialization phase, ChargeEligibilityOwner shall set eligibilityOut entryEligible to true exactly when F is true, eligibilityOut retentionEligible to true exactly when F is true, and eligibilityOut exitRequired to true exactly when T is true.

#### Contract clauses evaluated in the compute phase

##### `CHARGE_ELIGIBILITY_COMBINATION` — Required behavior

> During contract evaluation for the compute phase, ChargeEligibilityOwner shall set eligibilityOut entryEligible to true exactly when batteryIn usable is true, batteryIn band is not FULL, and chargerIn healthyConnected is true, eligibilityOut retentionEligible to true exactly when batteryIn usable is true, batteryIn band is not FULL, and chargerIn healthyConnected is true, and eligibilityOut exitRequired to true exactly when it is not the case that batteryIn usable is true, batteryIn band is not FULL, and chargerIn healthyConnected is true.

### Requirements for ChargerEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CHARGER_FACTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ChargerEvidenceQualifier shall set factsToCharge connected to true exactly when F is true, factsToCharge healthyConnected to true exactly when F is true, factsToCharge chargerFault to true exactly when F is true, and faultToAggregation to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `CHARGER_POLICY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, ChargerEvidenceQualifier shall set factsToCharge connected to true exactly when reportIn is not DISCONNECTED, factsToCharge healthyConnected to true exactly when reportIn is CONNECTED HEALTHY, factsToCharge chargerFault to true exactly when reportIn is CONNECTED FAULTED, and faultToAggregation to true exactly when factsToCharge chargerFault is true.

### Requirements for FaultAggregationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BATTERY_FAULT_ONLY` — Required behavior

> During contract evaluation for the initialization phase, FaultAggregationOwner shall set faultsOut batteryFault to true exactly when T is true, faultsOut chargerFault to true exactly when F is true, faultsOut navigationFault to true exactly when F is true, faultsOut flightControlFault to true exactly when F is true, faultsOut homeFault to true exactly when F is true, faultsOut touchdownFault to true exactly when F is true, and faultsOut aggregateFault to true exactly when T is true.

#### Contract clauses evaluated in the compute phase

##### `CURRENT_FAULT_VECTOR_AND_DISJUNCTION` — Required behavior

> During contract evaluation for the compute phase, FaultAggregationOwner shall set faultsOut batteryFault to true exactly when confidenceIn is not TRUSTED, faultsOut chargerFault to true exactly when chargerFaultIn is true, faultsOut navigationFault to true exactly when navigationIn is UNUSABLE, faultsOut flightControlFault to true exactly when flightControlIn is FAULTED, faultsOut homeFault to true exactly when homeFaultIn is true, faultsOut touchdownFault to true exactly when touchdownFaultIn is true, and faultsOut aggregateFault to true exactly when faultsOut batteryFault is true, faultsOut chargerFault is true, faultsOut navigationFault is true, faultsOut flightControlFault is true, faultsOut homeFault is true, or faultsOut touchdownFault is true.

### Requirements for FlightReadinessOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_FLIGHT_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, FlightReadinessOwner shall set readinessOut to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `COMBINED_FLIGHT_READINESS` — Required behavior

> During contract evaluation for the compute phase, FlightReadinessOwner shall set readinessOut to true exactly when All of the following conditions hold:
>
>   - batteryIn usable is true
>   - At least one of the following conditions holds:
>     
>       - batteryIn band is MEDIUM
>       - batteryIn band is FULL
>   - navigationIn is USABLE
>   - flightControlIn is AVAILABLE.

### Requirements for HomeEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HOME_NOT_ESTABLISHED` — Required behavior

> During contract evaluation for the initialization phase, HomeEvidenceQualifier shall set factsToLifecycle arrivalEstablished to true exactly when F is true, factsToLifecycle evidenceValid to true exactly when F is true, factsToLifecycle homeFault to true exactly when T is true, and faultToAggregation to true exactly when T is true.

#### Contract clauses evaluated in the compute phase

##### `QUALIFIED_HOME_COMPLETION` — Required behavior

> During contract evaluation for the compute phase, HomeEvidenceQualifier shall set factsToLifecycle arrivalEstablished to true exactly when reportIn validity is VALID and reportIn homeValue is REACHED, factsToLifecycle evidenceValid to true exactly when reportIn validity is VALID, factsToLifecycle homeFault to true exactly when reportIn validity is INVALID, and faultToAggregation to true exactly when factsToLifecycle homeFault is true.

### Requirements for LifecyclePriorityOwner

#### Contract clauses evaluated in the initialization phase

May modify: phaseState

##### `INITIAL_PHASE_AND_RESOLUTION` — Required behavior

> During contract evaluation for the initialization phase, LifecyclePriorityOwner shall set phaseState to OFF, resolutionOut winningCase to L12, resolutionOut sourceLifecycleState to OFF, resolutionOut nextPhase to OFF, resolutionOut requestPresent to true exactly when F is true, resolutionOut requestApplicable to true exactly when F is true, resolutionOut requestCausedTransition to true exactly when F is true, resolutionOut requestDefeatedByPriority to true exactly when F is true, resolutionOut chargeRetentionEligible to true exactly when F is true, and resolutionOut launchReady to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: phaseState

##### `REQUEST_EFFECT_EVIDENCE` — Required behavior

> During contract evaluation for the compute phase, LifecyclePriorityOwner shall set resolutionOut requestPresent to true exactly when semanticsIn requestFamily is not ABSENT, resolutionOut requestApplicable to true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is OFF
>       - semanticsIn requestFamily is POWER
>       - semanticsIn intentCode is SWITCH ON
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is STANDBY
>       - semanticsIn requestFamily is POWER
>       - semanticsIn intentCode is SWITCH OFF
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is STANDBY
>       - semanticsIn requestFamily is CHARGE
>       - semanticsIn intentCode is START CHARGE
>       - chargeEligibilityIn entryEligible is true
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is STANDBY
>       - semanticsIn requestFamily is READINESS
>       - semanticsIn intentCode is ACTIVATE
>       - readinessIn is true
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is CHARGING
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - semanticsIn requestFamily is POWER
>               - semanticsIn intentCode is SWITCH OFF
>           - All of the following conditions hold:
>             
>               - semanticsIn requestFamily is CHARGE
>               - semanticsIn intentCode is STOP CHARGE
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is READY
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - semanticsIn requestFamily is POWER
>               - semanticsIn intentCode is SWITCH OFF
>           - All of the following conditions hold:
>             
>               - semanticsIn requestFamily is READINESS
>               - semanticsIn intentCode is DEACTIVATE
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is READY
>       - semanticsIn requestFamily is READINESS
>       - semanticsIn intentCode is LAUNCH
>       - readinessIn is true
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is FLYING
>       - semanticsIn requestFamily is AIRBORNE
>       - At least one of the following conditions holds:
>         
>           - airborneRequestIn is RETURN REQUESTED
>           - airborneRequestIn is LAND REQUESTED
>   - All of the following conditions hold:
>     
>       - the value of phaseState on entry is RETURNING
>       - semanticsIn requestFamily is AIRBORNE
>       - airborneRequestIn is LAND REQUESTED, resolutionOut requestCausedTransition to true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L04
>       - semanticsIn intentCode is LAND
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L05
>       - semanticsIn intentCode is RETURN
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L11
>       - semanticsIn intentCode is SWITCH ON
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L13
>       - semanticsIn intentCode is SWITCH OFF
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L14
>       - semanticsIn intentCode is START CHARGE
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L15
>       - semanticsIn intentCode is ACTIVATE
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L17
>       - semanticsIn intentCode is SWITCH OFF
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L18
>       - semanticsIn intentCode is STOP CHARGE
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L20
>       - semanticsIn intentCode is SWITCH OFF
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L21
>       - semanticsIn intentCode is DEACTIVATE
>   - All of the following conditions hold:
>     
>       - resolutionOut winningCase is L22
>       - semanticsIn intentCode is LAUNCH, and resolutionOut requestDefeatedByPriority to true exactly when resolutionOut requestApplicable is true and resolutionOut requestCausedTransition is false.

##### `RESOLUTION_PRESERVATION` — Required behavior

> During contract evaluation for the compute phase, LifecyclePriorityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is OFF
>           - resolutionOut sourceLifecycleState is OFF
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is STANDBY
>           - resolutionOut sourceLifecycleState is STANDBY
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is CHARGING
>           - resolutionOut sourceLifecycleState is CHARGING
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is READY
>           - resolutionOut sourceLifecycleState is READY
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is FLYING
>           - resolutionOut sourceLifecycleState is FLYING
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is RETURNING
>           - resolutionOut sourceLifecycleState is RETURNING
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is LANDING
>           - resolutionOut sourceLifecycleState is LANDING
>   - resolutionOut nextPhase is phaseState
>   - resolutionOut chargeRetentionEligible is true exactly when chargeEligibilityIn retentionEligible is true
>   - resolutionOut launchReady is readinessIn.

##### `CASE_L_01_AIRBORNE_EMERGENCY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE L 01 AIRBORNE EMERGENCY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of phaseState on entry is FLYING
>       - the value of phaseState on entry is RETURNING
>       - the value of phaseState on entry is LANDING
>   - hazardProposalIn emergencyLand is true.

> When all applicability conditions are met, LifecyclePriorityOwner shall produce a result for which all of the following conditions hold:
>
> phaseState is LANDING and resolutionOut winningCase is L01.

##### `CASE_L_02_RETURNING_NAVIGATION_LOSS` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is RETURNING, hazardProposalIn emergencyLand is false, and hazardProposalIn navigationUnusable is true, LifecyclePriorityOwner shall set phaseState to LANDING and resolutionOut winningCase to L02.

##### `CASE_L_03_FLYING_FORCED_RETURN` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is FLYING, hazardProposalIn emergencyLand is false, and hazardProposalIn forcedReturn is true, LifecyclePriorityOwner shall set phaseState to RETURNING and resolutionOut winningCase to L03.

##### `CASE_L_04_AIRBORNE_LAND_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, case CASE L 04 AIRBORNE LAND REQUEST applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is FLYING
>           - hazardProposalIn emergencyLand is false
>           - hazardProposalIn forcedReturn is false
>       - All of the following conditions hold:
>         
>           - the value of phaseState on entry is RETURNING
>           - hazardProposalIn emergencyLand is false
>           - hazardProposalIn navigationUnusable is false
>   - airborneRequestIn is LAND REQUESTED.

> When all applicability conditions are met, LifecyclePriorityOwner shall produce a result for which all of the following conditions hold:
>
> phaseState is LANDING and resolutionOut winningCase is L04.

##### `CASE_L_05_FLYING_RETURN_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is FLYING, hazardProposalIn emergencyLand is false, hazardProposalIn forcedReturn is false, airborneRequestIn is not LAND REQUESTED, and airborneRequestIn is RETURN REQUESTED, LifecyclePriorityOwner shall set phaseState to RETURNING and resolutionOut winningCase to L05.

##### `CASE_L_06_QUALIFIED_ARRIVAL` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is RETURNING, hazardProposalIn emergencyLand is false, hazardProposalIn navigationUnusable is false, airborneRequestIn is not LAND REQUESTED, and homeFactsIn arrivalEstablished is true, LifecyclePriorityOwner shall set phaseState to LANDING and resolutionOut winningCase to L06.

##### `CASE_L_07_TOUCHDOWN_READY` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is LANDING, hazardProposalIn emergencyLand is false, touchdownFactsIn touchdownEstablished is true, and readinessIn is true, LifecyclePriorityOwner shall set phaseState to READY and resolutionOut winningCase to L07.

##### `CASE_L_08_TOUCHDOWN_STANDBY` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is LANDING, hazardProposalIn emergencyLand is false, touchdownFactsIn touchdownEstablished is true, and readinessIn is false, LifecyclePriorityOwner shall set phaseState to STANDBY and resolutionOut winningCase to L08.

##### `CASE_L_09_GROUND_BATTERY_FALLBACK` — Conditional behavior

> During contract evaluation for the compute phase, case CASE L 09 GROUND BATTERY FALLBACK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of phaseState on entry is STANDBY
>       - the value of phaseState on entry is CHARGING
>       - the value of phaseState on entry is READY
>   - hazardProposalIn batteryUnusable is true.

> When all applicability conditions are met, LifecyclePriorityOwner shall produce a result for which all of the following conditions hold:
>
> phaseState is STANDBY and resolutionOut winningCase is L09.

##### `CASE_L_10_READY_LOW_FALLBACK` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is READY, hazardProposalIn batteryUnusable is false, and hazardProposalIn lowOrCritical is true, LifecyclePriorityOwner shall set phaseState to STANDBY and resolutionOut winningCase to L10.

##### `CASE_L_11_SWITCH_ON` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is OFF and semanticsIn intentCode is SWITCH ON, LifecyclePriorityOwner shall set phaseState to STANDBY and resolutionOut winningCase to L11.

##### `CASE_L_12_OFF_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is OFF and semanticsIn intentCode is not SWITCH ON, LifecyclePriorityOwner shall set phaseState to OFF and resolutionOut winningCase to L12.

##### `CASE_L_13_STANDBY_SWITCH_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is STANDBY, hazardProposalIn batteryUnusable is false, and semanticsIn intentCode is SWITCH OFF, LifecyclePriorityOwner shall set phaseState to OFF and resolutionOut winningCase to L13.

##### `CASE_L_14_START_CHARGE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is STANDBY, hazardProposalIn batteryUnusable is false, semanticsIn intentCode is not SWITCH OFF, semanticsIn intentCode is START CHARGE, and chargeEligibilityIn entryEligible is true, LifecyclePriorityOwner shall set phaseState to CHARGING and resolutionOut winningCase to L14.

##### `CASE_L_15_ACTIVATE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is STANDBY, hazardProposalIn batteryUnusable is false, semanticsIn intentCode is not SWITCH OFF, it is not the case that semanticsIn intentCode is START CHARGE and chargeEligibilityIn entryEligible is true, semanticsIn intentCode is ACTIVATE, and readinessIn is true, LifecyclePriorityOwner shall set phaseState to READY and resolutionOut winningCase to L15.

##### `CASE_L_16_STANDBY_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is STANDBY, hazardProposalIn batteryUnusable is false, semanticsIn intentCode is not SWITCH OFF, it is not the case that semanticsIn intentCode is START CHARGE and chargeEligibilityIn entryEligible is true, and it is not the case that semanticsIn intentCode is ACTIVATE and readinessIn is true, LifecyclePriorityOwner shall set phaseState to STANDBY and resolutionOut winningCase to L16.

##### `CASE_L_17_CHARGING_SWITCH_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is CHARGING, hazardProposalIn batteryUnusable is false, and semanticsIn intentCode is SWITCH OFF, LifecyclePriorityOwner shall set phaseState to OFF and resolutionOut winningCase to L17.

##### `CASE_L_18_CHARGE_EXIT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE L 18 CHARGE EXIT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of phaseState on entry is CHARGING
>   - hazardProposalIn batteryUnusable is false
>   - semanticsIn intentCode is not SWITCH OFF
>   - At least one of the following conditions holds:
>     
>       - semanticsIn intentCode is STOP CHARGE
>       - chargeEligibilityIn exitRequired is true.

> When all applicability conditions are met, LifecyclePriorityOwner shall produce a result for which all of the following conditions hold:
>
> phaseState is STANDBY and resolutionOut winningCase is L18.

##### `CASE_L_19_CHARGING_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is CHARGING, hazardProposalIn batteryUnusable is false, semanticsIn intentCode is not SWITCH OFF, semanticsIn intentCode is not STOP CHARGE, and chargeEligibilityIn exitRequired is false, LifecyclePriorityOwner shall set phaseState to CHARGING and resolutionOut winningCase to L19.

##### `CASE_L_20_READY_SWITCH_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is READY, hazardProposalIn batteryUnusable is false, hazardProposalIn lowOrCritical is false, and semanticsIn intentCode is SWITCH OFF, LifecyclePriorityOwner shall set phaseState to OFF and resolutionOut winningCase to L20.

##### `CASE_L_21_DEACTIVATE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is READY, hazardProposalIn batteryUnusable is false, hazardProposalIn lowOrCritical is false, semanticsIn intentCode is not SWITCH OFF, and semanticsIn intentCode is DEACTIVATE, LifecyclePriorityOwner shall set phaseState to STANDBY and resolutionOut winningCase to L21.

##### `CASE_L_22_LAUNCH` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is READY, hazardProposalIn batteryUnusable is false, hazardProposalIn lowOrCritical is false, semanticsIn intentCode is not SWITCH OFF, semanticsIn intentCode is not DEACTIVATE, semanticsIn intentCode is LAUNCH, and readinessIn is true, LifecyclePriorityOwner shall set phaseState to FLYING and resolutionOut winningCase to L22.

##### `CASE_L_23_READY_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is READY, hazardProposalIn batteryUnusable is false, hazardProposalIn lowOrCritical is false, semanticsIn intentCode is not SWITCH OFF, semanticsIn intentCode is not DEACTIVATE, and it is not the case that semanticsIn intentCode is LAUNCH and readinessIn is true, LifecyclePriorityOwner shall set phaseState to READY and resolutionOut winningCase to L23.

##### `CASE_L_24_FLYING_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is FLYING, hazardProposalIn emergencyLand is false, hazardProposalIn forcedReturn is false, airborneRequestIn is not LAND REQUESTED, and airborneRequestIn is not RETURN REQUESTED, LifecyclePriorityOwner shall set phaseState to FLYING and resolutionOut winningCase to L24.

##### `CASE_L_25_RETURNING_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is RETURNING, hazardProposalIn emergencyLand is false, hazardProposalIn navigationUnusable is false, airborneRequestIn is not LAND REQUESTED, and homeFactsIn arrivalEstablished is false, LifecyclePriorityOwner shall set phaseState to RETURNING and resolutionOut winningCase to L25.

##### `CASE_L_26_LANDING_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if the value of phaseState on entry is LANDING, hazardProposalIn emergencyLand is false, and touchdownFactsIn touchdownEstablished is false, LifecyclePriorityOwner shall set phaseState to LANDING and resolutionOut winningCase to L26.

### Requirements for OutcomeCompositionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PUBLIC_TUPLE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, OutcomeCompositionOwner shall set pilotStatusOut phase to OFF, pilotStatusOut requestResult to NONE, pilotStatusOut batteryNotice to UNTRUSTED, pilotStatusOut batteryFault to true exactly when T is true, pilotStatusOut chargerFault to true exactly when F is true, pilotStatusOut navigationFault to true exactly when F is true, pilotStatusOut flightControlFault to true exactly when F is true, pilotStatusOut homeFault to true exactly when F is true, pilotStatusOut touchdownFault to true exactly when F is true, pilotStatusOut aggregateFault to true exactly when T is true, chargePermissionOut to DENIED, flightControlOut intent to HOLD, flightControlOut launchPermission to DENIED, and propulsionPermissionOut to DISABLED.

#### Contract clauses evaluated in the compute phase

##### `REQUEST_RESULT_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, OutcomeCompositionOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - resolutionIn requestPresent is true exactly when F is true
>       - pilotStatusOut requestResult is NONE
>   - All of the following conditions hold:
>     
>       - resolutionIn requestPresent is true
>       - resolutionIn requestCausedTransition is true
>       - pilotStatusOut requestResult is ACCEPTED
>   - All of the following conditions hold:
>     
>       - resolutionIn requestPresent is true
>       - resolutionIn requestCausedTransition is false
>       - resolutionIn requestDefeatedByPriority is true
>       - pilotStatusOut requestResult is PREEMPTED
>   - All of the following conditions hold:
>     
>       - resolutionIn requestPresent is true
>       - resolutionIn requestCausedTransition is false
>       - resolutionIn requestDefeatedByPriority is false
>       - pilotStatusOut requestResult is REJECTED.

##### `BATTERY_NOTICE_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, OutcomeCompositionOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - batteryIn confidence is not TRUSTED
>       - pilotStatusOut batteryNotice is UNTRUSTED
>   - All of the following conditions hold:
>     
>       - batteryIn confidence is TRUSTED
>       - At least one of the following conditions holds:
>         
>           - batteryIn band is MEDIUM
>           - batteryIn band is FULL
>       - pilotStatusOut batteryNotice is CLEAR
>   - All of the following conditions hold:
>     
>       - batteryIn confidence is TRUSTED
>       - batteryIn band is LOW
>       - pilotStatusOut batteryNotice is LOW
>   - All of the following conditions hold:
>     
>       - batteryIn confidence is TRUSTED
>       - batteryIn band is CRITICAL
>       - pilotStatusOut batteryNotice is CRITICAL.

##### `FLIGHT_INTENT_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, OutcomeCompositionOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - resolutionIn nextPhase is FLYING
>       - resolutionIn sourceLifecycleState is not FLYING
>       - flightControlOut intent is LAUNCH
>   - All of the following conditions hold:
>     
>       - resolutionIn nextPhase is FLYING
>       - resolutionIn sourceLifecycleState is FLYING
>       - flightControlOut intent is CONTINUE
>   - All of the following conditions hold:
>     
>       - resolutionIn nextPhase is RETURNING
>       - flightControlOut intent is RETURN
>   - All of the following conditions hold:
>     
>       - resolutionIn nextPhase is LANDING
>       - flightControlOut intent is LAND
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - resolutionIn nextPhase is OFF
>           - resolutionIn nextPhase is STANDBY
>           - resolutionIn nextPhase is CHARGING
>           - resolutionIn nextPhase is READY
>       - flightControlOut intent is HOLD.

##### `PERMISSION_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, OutcomeCompositionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     chargePermissionOut is PERMITTED
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - resolutionIn nextPhase is CHARGING
>       - resolutionIn chargeRetentionEligible is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     flightControlOut launchPermission is PERMITTED
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - resolutionIn nextPhase is READY
>       - resolutionIn launchReady is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     propulsionPermissionOut is ENABLED
>     
>     **Second condition:**
>     
>     flightControlOut intent is not HOLD.

##### `ATOMIC_PHASE_AND_FAULT_COPY` — Required behavior

> During contract evaluation for the compute phase, OutcomeCompositionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - resolutionIn nextPhase is OFF
>           - pilotStatusOut phase is OFF
>       - All of the following conditions hold:
>         
>           - resolutionIn nextPhase is STANDBY
>           - pilotStatusOut phase is STANDBY
>       - All of the following conditions hold:
>         
>           - resolutionIn nextPhase is CHARGING
>           - pilotStatusOut phase is CHARGING
>       - All of the following conditions hold:
>         
>           - resolutionIn nextPhase is READY
>           - pilotStatusOut phase is READY
>       - All of the following conditions hold:
>         
>           - resolutionIn nextPhase is FLYING
>           - pilotStatusOut phase is FLYING
>       - All of the following conditions hold:
>         
>           - resolutionIn nextPhase is RETURNING
>           - pilotStatusOut phase is RETURNING
>       - All of the following conditions hold:
>         
>           - resolutionIn nextPhase is LANDING
>           - pilotStatusOut phase is LANDING
>   - pilotStatusOut batteryFault is true exactly when faultsIn batteryFault is true
>   - pilotStatusOut chargerFault is true exactly when faultsIn chargerFault is true
>   - pilotStatusOut navigationFault is true exactly when faultsIn navigationFault is true
>   - pilotStatusOut flightControlFault is true exactly when faultsIn flightControlFault is true
>   - pilotStatusOut homeFault is true exactly when faultsIn homeFault is true
>   - pilotStatusOut touchdownFault is true exactly when faultsIn touchdownFault is true
>   - pilotStatusOut aggregateFault is true exactly when faultsIn aggregateFault is true.

### Requirements for RequestApplicabilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REQUEST_ABSENT` — Required behavior

> During contract evaluation for the initialization phase, RequestApplicabilityOwner shall set semanticsToAirborne intentCode to NONE, semanticsToAirborne requestFamily to ABSENT, semanticsToLifecycle intentCode to NONE, and semanticsToLifecycle requestFamily to ABSENT.

#### Contract clauses evaluated in the compute phase

##### `REQUEST_FAMILY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, RequestApplicabilityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - semanticsToAirborne intentCode is semanticsToLifecycle intentCode
>   - semanticsToAirborne requestFamily is semanticsToLifecycle requestFamily
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - requestIn is NONE
>           - semanticsToLifecycle intentCode is NONE
>           - semanticsToLifecycle requestFamily is ABSENT
>       - All of the following conditions hold:
>         
>           - requestIn is SWITCH ON
>           - semanticsToLifecycle intentCode is SWITCH ON
>           - semanticsToLifecycle requestFamily is POWER
>       - All of the following conditions hold:
>         
>           - requestIn is SWITCH OFF
>           - semanticsToLifecycle intentCode is SWITCH OFF
>           - semanticsToLifecycle requestFamily is POWER
>       - All of the following conditions hold:
>         
>           - requestIn is START CHARGE
>           - semanticsToLifecycle intentCode is START CHARGE
>           - semanticsToLifecycle requestFamily is CHARGE
>       - All of the following conditions hold:
>         
>           - requestIn is STOP CHARGE
>           - semanticsToLifecycle intentCode is STOP CHARGE
>           - semanticsToLifecycle requestFamily is CHARGE
>       - All of the following conditions hold:
>         
>           - requestIn is ACTIVATE
>           - semanticsToLifecycle intentCode is ACTIVATE
>           - semanticsToLifecycle requestFamily is READINESS
>       - All of the following conditions hold:
>         
>           - requestIn is DEACTIVATE
>           - semanticsToLifecycle intentCode is DEACTIVATE
>           - semanticsToLifecycle requestFamily is READINESS
>       - All of the following conditions hold:
>         
>           - requestIn is LAUNCH
>           - semanticsToLifecycle intentCode is LAUNCH
>           - semanticsToLifecycle requestFamily is READINESS
>       - All of the following conditions hold:
>         
>           - requestIn is RETURN
>           - semanticsToLifecycle intentCode is RETURN
>           - semanticsToLifecycle requestFamily is AIRBORNE
>       - All of the following conditions hold:
>         
>           - requestIn is LAND
>           - semanticsToLifecycle intentCode is LAND
>           - semanticsToLifecycle requestFamily is AIRBORNE.

### Requirements for TouchdownEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_TOUCHDOWN_NOT_ESTABLISHED` — Required behavior

> During contract evaluation for the initialization phase, TouchdownEvidenceQualifier shall set factsToLifecycle touchdownEstablished to true exactly when F is true, factsToLifecycle evidenceValid to true exactly when F is true, factsToLifecycle touchdownFault to true exactly when T is true, and faultToAggregation to true exactly when T is true.

#### Contract clauses evaluated in the compute phase

##### `QUALIFIED_TOUCHDOWN_COMPLETION` — Required behavior

> During contract evaluation for the compute phase, TouchdownEvidenceQualifier shall set factsToLifecycle touchdownEstablished to true exactly when reportIn validity is VALID and reportIn touchdownValue is CONFIRMED, factsToLifecycle evidenceValid to true exactly when reportIn validity is VALID, factsToLifecycle touchdownFault to true exactly when reportIn validity is INVALID, and faultToAggregation to true exactly when factsToLifecycle touchdownFault is true.
