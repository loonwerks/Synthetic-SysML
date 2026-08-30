# Visibility-Priority Whole-Cabin HVAC Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: [Source-grounded need.] A vehicle user needs one cabin-environment supervisor
that accepts finite preferences and coordinates temperature regulation, defrosting,
filtration, and humidity outcomes while respecting the available vehicle energy context.

PURPOSE-01: [Selected pilot purpose.] The system shall preserve a usable
glazing-clearing response as its primary controlled purpose, then coordinate cabin
air-quality, humidity, and thermal services according to an explicit priority policy.
This is a logical supervisory purpose, not a claim of physical defrost performance or
automotive safety.

GOAL-01: The system shall issue one coherent actuation plan rather than independently
commanding conflicting cabin services.

GOAL-02: The system shall give observed urgent glazing clearing precedence over
user-off, environmental-conditioning, and thermal-comfort demands whenever the required
clearing equipment is available.

GOAL-03: The system shall restrict selected services to the finite electrical and
waste-heat eligibility reported at its boundary.

GOAL-04: The system shall propagate critical observation or equipment faults into a
latched hold, require an explicit ordered recovery, and reject stale pre-fault requests
after recovery.

GOAL-05: The system shall degrade only the affected noncritical service when a thermal,
humidity, or air-quality observation is invalid and shall report the resulting status
cause.

### Operational context and exact boundary

CTX-01: The vehicle user supplies preferences and a recovery acknowledgment; the user
does not directly command physical actuators.

CTX-02: The cabin environment supplies a finite cabin thermal observation and receives
the consequences of the actuation plan; real thermal dynamics remain outside the model.

CTX-03: The windshield/window environment supplies a finite glazing condition and
receives the consequences of a selected clearing service; actual clearing success
remains outside the model.

CTX-04: The cabin-air environment supplies finite humidity and air-quality conditions
and receives conditioning consequences; pollutant sensing and moisture physics remain
outside the model.

CTX-05: The vehicle electrical manager supplies interface and budget availability and
receives a requested logical energy tier through the actuation plan.

CTX-06: The engine heat interface supplies only finite waste-heat availability; it is
neither modeled as an engine controller nor credited with guaranteed heating efficiency.

CTX-07: The HVAC equipment layer supplies finite readiness for blower, thermal,
clearing, and air-treatment paths and receives the atomic actuation plan.

CTX-08: The dashboard/status recipient receives supervisor mode and cause; display
layout and subjective intuitiveness are outside scope.

MON-01: `UserClimateRequest` from CTX-01 is the product of `validity={Valid,Invalid}`,
`arrival={New,Held}`, `enabled={On,Off}`, `defrost={Requested,NotRequested}`,
`target={Cool,Neutral,Warm}`, and `fan={Low,High}`. `New` is a fresh boundary event;
`Held` is an unchanged value and cannot reauthorize service after recovery.

MON-02: `CabinThermalObservation` from CTX-02 is `validity={Valid,Invalid}` and
`band={Cool,Neutral,Warm}`. The labels are qualitative pilot bands without degrees or
accuracy claims.

MON-03: `GlazingObservation` from CTX-03 is `validity={Valid,Invalid}` and
`condition={Clear,Misting,Obscured}`. `Obscured` is the logical urgent-clearing
condition; it is not a safety classification.

MON-04: `HumidityObservation` from CTX-04 is `validity={Valid,Invalid}` and
`condition={Dry,Acceptable,Damp}`.

MON-05: `AirQualityObservation` from CTX-04 is `validity={Valid,Invalid}` and
`condition={Clean,Loaded}`; `Loaded` is an abstract treatment demand and identifies no
pollutant.

MON-06: `ElectricalAvailability` from CTX-05 is `validity={Valid,Invalid}`,
`interface={Available,Unavailable}`, and `budget={Denied,Limited,Full}`.

MON-07: `WasteHeatAvailability` from CTX-06 is `validity={Valid,Invalid}` and
`availability={Available,Unavailable}`.

MON-08: `EquipmentReadiness` from CTX-07 gives each of `blower`, `thermal`, `clearing`,
and `airTreatment` the value `{Ready,Failed,Unknown}` and carries an overall
`validity={Valid,Invalid}`.

MON-09: `RecoveryAcknowledgment` from CTX-01 is `{Absent,Fresh}`. `Fresh` applies to one
evaluation only and cannot be stored by the environment as a continuing authorization.

CTRL-01: `CabinActuationPlan` delivered to CTX-07 is one atomic logical value with
`service={None,Ventilate,Heat,Cool,Defrost,Filter,Dry}`,
`intensity={Off,Reduced,Normal}`, `heatSource={None,Electrical,WasteHeat}`, and
`energyTier={None,Limited,Full}`. Coherence constraints below prohibit meaningless field
combinations.

CTRL-02: `SupervisorStatus` delivered to CTX-08 is one atomic value with
`mode={Idle,Active,Degraded,FaultHold,AwaitFresh}` and
`cause={None,VisibilityPriority,ElectricalUnavailable,ElectricalDenied,EquipmentFault,InvalidVisibility,InvalidThermal,InvalidHumidity,InvalidAirQuality,AwaitingRecovery,AwaitingFreshRequest}`.

### Essential environmental assumptions and selected constraints

ASM-01: CTX-01 is responsible for asserting `arrival=New` only for a newly issued
request and for pulsing `RecoveryAcknowledgment=Fresh` for one evaluation. Rationale:
the fresh-request and recovery policies require distinguishable events without
prescribing an interface mechanism.

ASM-02: CTX-02, CTX-03, and CTX-04 are each responsible for pairing every observation
with its current validity. Rationale: the seed defines no sensor trust semantics, so
invalidity must be explicit rather than inferred from a value.

ASM-03: CTX-05 is responsible for a self-consistent electrical value: an unavailable
interface cannot carry an effective Limited or Full budget. Any inconsistent combination
is treated as electrically ineligible. Rationale: this closes the finite electrical
partition conservatively.

ASM-04: CTX-06 is responsible only for reporting availability; PART-10 may prefer waste
heat for heating but shall not infer efficiency or physical heat delivery. Rationale:
the seed mentions waste heat but does not define its interface.

ASM-05: CTX-07 is responsible for current equipment readiness. `Unknown` and invalid
feedback are critical because the supervisor cannot establish that its selected
visibility-clearing path is available. Rationale: this is a pilot fault policy, not a
source fact.

ASM-06: One logical evaluation consumes a simultaneous snapshot of all nine inputs and
atomically publishes both outputs. Ordering across evaluations is used only for state
and recovery semantics, not as a physical timing guarantee.

### Required behavior and evidence

RISK-01: If a stale comfort or air-treatment request reactivates immediately after a
critical fault clears, equipment may resume without renewed user authorization. FAULT-03
mitigates this scenario with AwaitFresh and event priority.

RISK-02: If invalid visibility or unavailable clearing equipment is treated only as a
local degraded condition, an apparent clearing command could be published without
established clearing-path availability. FAULT-01 mitigates this by latching and forcing
all-off/status reporting.

RISK-03: If independent proposals directly command equipment, simultaneous defrost,
filtration, humidity, and comfort demands can produce an incoherent plan. GOAL-01,
POL-01, and COMP-01 through COMP-04 mitigate this through single-winner arbitration and
atomic composition.

## Supporting contract definitions

### State `HVAC_Visibility_Priority_Supervisor::CriticalFaultRecoveryOwner::recovery`

State `recovery` has type `HVAC_Visibility_Priority_Supervisor::RecoveryState`.

### State `HVAC_Visibility_Priority_Supervisor::PriorityAuthorizationArbiter::authorization`

State `authorization` has type `HVAC_Visibility_Priority_Supervisor::Authorization`.

## Detailed behavioral requirements

### Requirements for AirQualityNeedAssessor

#### Contract clauses evaluated in the initialization phase

##### `INIT_AIR_UNAVAILABLE` — Required behavior

> During contract evaluation for the initialization phase, AirQualityNeedAssessor shall set airNeed to Unavailable.

#### Contract clauses evaluated in the compute phase

##### `AIR_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, AirQualityNeedAssessor shall produce a result for which if airObservation validity is Invalid, then airNeed is Unavailable, if airObservation validity is Valid and airObservation condition is Clean, then airNeed is None, and if airObservation validity is Valid and airObservation condition is Loaded, then airNeed is Filter.

### Requirements for AtomicResultPublisher

#### Contract clauses evaluated in the initialization phase

##### `INIT_PUBLIC_OUTPUTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AtomicResultPublisher shall set actuationPlan service to None, actuationPlan intensity to Off, actuationPlan heatSource to None, actuationPlan energyTier to None, supervisorStatus mode to Idle, and supervisorStatus statusCause to None.

#### Contract clauses evaluated in the compute phase

##### `PUBLICATION_MODE_AND_SUPPRESSION` — Required behavior

> During contract evaluation for the compute phase, AtomicResultPublisher shall produce a result for which if recoveryReport recoveryState is Latched, recoveryReport recoveryState is Pending, or arbitrationStatus controlMode is FaultHold, then actuationPlan service is None, actuationPlan intensity is Off, actuationPlan heatSource is None, actuationPlan energyTier is None, and supervisorStatus mode is FaultHold, if recoveryReport recoveryState is Clear and arbitrationStatus controlMode is AwaitFresh, then actuationPlan service is None, actuationPlan intensity is Off, actuationPlan heatSource is None, actuationPlan energyTier is None, and supervisorStatus mode is AwaitFresh, if recoveryReport recoveryState is Clear, arbitrationStatus controlMode is not FaultHold, and arbitrationStatus controlMode is not AwaitFresh, then actuationPlan service is candidatePlan plan service, actuationPlan intensity is candidatePlan plan intensity, actuationPlan heatSource is candidatePlan plan heatSource, and actuationPlan energyTier is candidatePlan plan energyTier, if recoveryReport recoveryState is Clear, arbitrationStatus controlMode is not FaultHold, arbitrationStatus controlMode is not AwaitFresh, and candidatePlan candidateCause is ElectricalDenied, then supervisorStatus mode is Degraded, if recoveryReport recoveryState is Clear, arbitrationStatus controlMode is not FaultHold, arbitrationStatus controlMode is not AwaitFresh, candidatePlan candidateCause is not ElectricalDenied, and arbitrationStatus noncriticalCause is not None, then supervisorStatus mode is Degraded, and if recoveryReport recoveryState is Clear, arbitrationStatus controlMode is not FaultHold, arbitrationStatus controlMode is not AwaitFresh, candidatePlan candidateCause is not ElectricalDenied, and arbitrationStatus noncriticalCause is None, then if arbitrationStatus controlMode is Idle, then supervisorStatus mode is Idle, if arbitrationStatus controlMode is Active, then supervisorStatus mode is Active, and if arbitrationStatus controlMode is Degraded, then supervisorStatus mode is Degraded.

##### `PUBLICATION_CAUSE_PRECEDENCE` — Required behavior

> During contract evaluation for the compute phase, AtomicResultPublisher shall produce a result for which if recoveryReport recoveryState is not Clear and recoveryReport faultAttribution is InvalidVisibility, then supervisorStatus statusCause is InvalidVisibility, if recoveryReport recoveryState is not Clear and recoveryReport faultAttribution is EquipmentFault, then supervisorStatus statusCause is EquipmentFault, if recoveryReport recoveryState is not Clear and recoveryReport faultAttribution is ElectricalUnavailable, then supervisorStatus statusCause is ElectricalUnavailable, if recoveryReport recoveryState is not Clear and recoveryReport faultAttribution is AwaitingRecovery, then supervisorStatus statusCause is AwaitingRecovery, if recoveryReport recoveryState is Clear and arbitrationStatus controlMode is AwaitFresh, then supervisorStatus statusCause is AwaitingFreshRequest, if recoveryReport recoveryState is Clear, arbitrationStatus controlMode is not AwaitFresh, and candidatePlan candidateCause is ElectricalDenied, then supervisorStatus statusCause is ElectricalDenied, if recoveryReport recoveryState is Clear, arbitrationStatus controlMode is not AwaitFresh, candidatePlan candidateCause is not ElectricalDenied, and arbitrationStatus arbitrationCause is VisibilityPriority, then supervisorStatus statusCause is VisibilityPriority, if recoveryReport recoveryState is Clear, arbitrationStatus controlMode is not AwaitFresh, candidatePlan candidateCause is not ElectricalDenied, arbitrationStatus arbitrationCause is not VisibilityPriority, and arbitrationStatus noncriticalCause is not None, then if arbitrationStatus noncriticalCause is InvalidAirQuality, then supervisorStatus statusCause is InvalidAirQuality, if arbitrationStatus noncriticalCause is InvalidHumidity, then supervisorStatus statusCause is InvalidHumidity, and if arbitrationStatus noncriticalCause is InvalidThermal, then supervisorStatus statusCause is InvalidThermal, and if recoveryReport recoveryState is Clear, arbitrationStatus controlMode is not AwaitFresh, candidatePlan candidateCause is not ElectricalDenied, arbitrationStatus arbitrationCause is not VisibilityPriority, and arbitrationStatus noncriticalCause is None, then supervisorStatus statusCause is None.

##### `PUBLIC_PLAN_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, AtomicResultPublisher shall produce a result for which if actuationPlan service is None, then actuationPlan intensity is Off, actuationPlan heatSource is None, and actuationPlan energyTier is None and if actuationPlan service is not None, then actuationPlan intensity is not Off and actuationPlan energyTier is not None.

##### `PUBLIC_HEAT_SOURCE_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, AtomicResultPublisher shall produce a result for which if actuationPlan service is not Heat, then actuationPlan heatSource is None and if actuationPlan heatSource is Electrical or actuationPlan heatSource is WasteHeat, then actuationPlan service is Heat.

### Requirements for CabinAirServiceProposer

#### Contract clauses evaluated in the initialization phase

##### `INIT_CABIN_AIR_NONE` — Required behavior

> During contract evaluation for the initialization phase, CabinAirServiceProposer shall set cabinAirProposal service to None, cabinAirProposal cabinAirApplicability to Unavailable, cabinAirProposal humidityDegradation to InvalidHumidity, and cabinAirProposal airDegradation to InvalidAirQuality.

#### Contract clauses evaluated in the compute phase

##### `CABIN_AIR_LOCAL_PRIORITY` — Required behavior

> During contract evaluation for the compute phase, CabinAirServiceProposer shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     humidityNeed is Unavailable
>     
>     **Then:**
>     
>     cabinAirProposal humidityDegradation is InvalidHumidity
>   - **If:**
>     
>     humidityNeed is not Unavailable
>     
>     **Then:**
>     
>     cabinAirProposal humidityDegradation is None
>   - **If:**
>     
>     airNeed is Unavailable
>     
>     **Then:**
>     
>     cabinAirProposal airDegradation is InvalidAirQuality
>   - **If:**
>     
>     airNeed is not Unavailable
>     
>     **Then:**
>     
>     cabinAirProposal airDegradation is None
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - airPath airReady is Available
>       - airNeed is Filter
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - cabinAirProposal service is Filter
>       - cabinAirProposal cabinAirApplicability is Available
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - airPath airReady is Available
>       - airNeed is not Filter
>       - humidityNeed is Dry
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - cabinAirProposal service is Dry
>       - cabinAirProposal cabinAirApplicability is Available
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - airPath airReady is Unavailable
>       - All of the following conditions hold:
>         
>           - airNeed is not Filter
>           - humidityNeed is not Dry
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - cabinAirProposal service is None
>       - cabinAirProposal cabinAirApplicability is Unavailable.

### Requirements for CriticalFaultRecoveryOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_RECOVERY_CLEAR` — Required behavior

> During contract evaluation for the initialization phase, CriticalFaultRecoveryOwner shall set recovery to Clear, recoveryReport recoveryState to Clear, recoveryReport recoveryEvent to NoRecoveryEvent, and recoveryReport faultAttribution to None.

#### Contract clauses evaluated in the compute phase

##### `CASE_10_ENTER_CRITICAL_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 ENTER CRITICAL HOLD applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of recovery on entry is Clear
>   - At least one of the following conditions holds:
>     
>       - visibilityFault is Present
>       - criticalEquipment is Present
>       - criticalElectrical is Present.

> When all applicability conditions are met, CriticalFaultRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> recovery is Latched, recoveryReport recoveryState is Latched, recoveryReport recoveryEvent is FaultEntered, if visibilityFault is Present, then recoveryReport faultAttribution is InvalidVisibility, if visibilityFault is Absent and criticalEquipment is Present, then recoveryReport faultAttribution is EquipmentFault, and if visibilityFault is Absent, criticalEquipment is Absent, and criticalElectrical is Present, then recoveryReport faultAttribution is ElectricalUnavailable.

##### `CASE_11_CLEAR_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, if the value of recovery on entry is Clear, visibilityFault is Absent, criticalEquipment is Absent, and criticalElectrical is Absent, CriticalFaultRecoveryOwner shall set recovery to Clear, recoveryReport recoveryState to Clear, recoveryReport recoveryEvent to NoRecoveryEvent, and recoveryReport faultAttribution to None.

##### `CASE_12_LATCHED_WAIT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 LATCHED WAIT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of recovery on entry is Latched
>   - At least one of the following conditions holds:
>     
>       - visibilityFault is Present
>       - criticalEquipment is Present
>       - criticalElectrical is Present
>       - recoveryAcknowledgment is Absent.

> When all applicability conditions are met, CriticalFaultRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> recovery is Latched, recoveryReport recoveryState is Latched, recoveryReport recoveryEvent is AwaitingRecovery, if visibilityFault is Present, then recoveryReport faultAttribution is InvalidVisibility, if visibilityFault is Absent and criticalEquipment is Present, then recoveryReport faultAttribution is EquipmentFault, if visibilityFault is Absent, criticalEquipment is Absent, and criticalElectrical is Present, then recoveryReport faultAttribution is ElectricalUnavailable, and if visibilityFault is Absent, criticalEquipment is Absent, and criticalElectrical is Absent, then recoveryReport faultAttribution is AwaitingRecovery.

##### `CASE_13_START_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if the value of recovery on entry is Latched, visibilityFault is Absent, criticalEquipment is Absent, criticalElectrical is Absent, and recoveryAcknowledgment is Fresh, CriticalFaultRecoveryOwner shall set recovery to Pending, recoveryReport recoveryState to Pending, recoveryReport recoveryEvent to RecoveryStarted, and recoveryReport faultAttribution to AwaitingRecovery.

##### `CASE_14_PENDING_RECURRENCE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 14 PENDING RECURRENCE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of recovery on entry is Pending
>   - At least one of the following conditions holds:
>     
>       - visibilityFault is Present
>       - criticalEquipment is Present
>       - criticalElectrical is Present.

> When all applicability conditions are met, CriticalFaultRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> recovery is Latched, recoveryReport recoveryState is Latched, recoveryReport recoveryEvent is FaultRecurred, if visibilityFault is Present, then recoveryReport faultAttribution is InvalidVisibility, if visibilityFault is Absent and criticalEquipment is Present, then recoveryReport faultAttribution is EquipmentFault, and if visibilityFault is Absent, criticalEquipment is Absent, and criticalElectrical is Present, then recoveryReport faultAttribution is ElectricalUnavailable.

##### `CASE_15_PENDING_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if the value of recovery on entry is Pending, visibilityFault is Absent, criticalEquipment is Absent, and criticalElectrical is Absent, CriticalFaultRecoveryOwner shall set recovery to Clear, recoveryReport recoveryState to Clear, recoveryReport recoveryEvent to JustCleared, and recoveryReport faultAttribution to None.

### Requirements for ElectricalEligibilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_ELECTRICAL_INELIGIBLE` — Required behavior

> During contract evaluation for the initialization phase, ElectricalEligibilityOwner shall set electricalEligibility tier to Ineligible, electricalEligibility eligibilityCause to InvalidInterface, and criticalElectrical to Present.

#### Contract clauses evaluated in the compute phase

##### `CASE_05_INVALID_OR_INCONSISTENT_ELECTRICAL` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 INVALID OR INCONSISTENT ELECTRICAL applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - electricalAvailability validity is Invalid
>   - All of the following conditions hold:
>     
>       - electricalAvailability interfaceState is Unavailable
>       - electricalAvailability budget is not Denied.

> When all applicability conditions are met, ElectricalEligibilityOwner shall produce a result for which all of the following conditions hold:
>
> electricalEligibility tier is Ineligible, electricalEligibility eligibilityCause is InvalidInterface, and criticalElectrical is Present.

##### `CASE_06_INTERFACE_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if electricalAvailability validity is Valid, electricalAvailability interfaceState is Unavailable, and electricalAvailability budget is Denied, ElectricalEligibilityOwner shall set electricalEligibility tier to Ineligible, electricalEligibility eligibilityCause to ElectricalUnavailable, and criticalElectrical to Present.

##### `CASE_07_BUDGET_DENIED` — Conditional behavior

> During contract evaluation for the compute phase, if electricalAvailability validity is Valid, electricalAvailability interfaceState is Available, and electricalAvailability budget is Denied, ElectricalEligibilityOwner shall set electricalEligibility tier to Denied, electricalEligibility eligibilityCause to ElectricalDenied, and criticalElectrical to Absent.

##### `CASE_08_LIMITED_BUDGET` — Conditional behavior

> During contract evaluation for the compute phase, if electricalAvailability validity is Valid, electricalAvailability interfaceState is Available, and electricalAvailability budget is Limited, ElectricalEligibilityOwner shall set electricalEligibility tier to Limited, electricalEligibility eligibilityCause to None, and criticalElectrical to Absent.

##### `CASE_09_FULL_BUDGET` — Conditional behavior

> During contract evaluation for the compute phase, if electricalAvailability validity is Valid, electricalAvailability interfaceState is Available, and electricalAvailability budget is Full, ElectricalEligibilityOwner shall set electricalEligibility tier to Full, electricalEligibility eligibilityCause to None, and criticalElectrical to Absent.

### Requirements for EnergySafePlanComposer

#### Contract clauses evaluated in the initialization phase

##### `INIT_CANDIDATE_ALL_OFF` — Required behavior

> During contract evaluation for the initialization phase, EnergySafePlanComposer shall set candidatePlan plan service to None, candidatePlan plan intensity to Off, candidatePlan plan heatSource to None, candidatePlan plan energyTier to None, and candidatePlan candidateCause to None.

#### Contract clauses evaluated in the compute phase

##### `CASE_26_INELIGIBLE_ALL_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if electricalEligibility tier is Ineligible, EnergySafePlanComposer shall set candidatePlan plan service to None, candidatePlan plan intensity to Off, candidatePlan plan heatSource to None, candidatePlan plan energyTier to None, and candidatePlan candidateCause to ElectricalUnavailable.

##### `CASE_27_DENIED_OR_NO_SELECTION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 27 DENIED OR NO SELECTION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - electricalEligibility tier is not Ineligible
>   - At least one of the following conditions holds:
>     
>       - electricalEligibility tier is Denied
>       - selectedIntent service is None.

> When all applicability conditions are met, EnergySafePlanComposer shall produce a result for which all of the following conditions hold:
>
> candidatePlan plan service is None, candidatePlan plan intensity is Off, candidatePlan plan heatSource is None, candidatePlan plan energyTier is None, if electricalEligibility tier is Denied, then candidatePlan candidateCause is ElectricalDenied, if electricalEligibility tier is not Denied and selectedIntent selectedCause is None, then candidatePlan candidateCause is None, if electricalEligibility tier is not Denied and selectedIntent selectedCause is AwaitingRecovery, then candidatePlan candidateCause is AwaitingRecovery, if electricalEligibility tier is not Denied and selectedIntent selectedCause is AwaitingFreshRequest, then candidatePlan candidateCause is AwaitingFreshRequest, and if electricalEligibility tier is not Denied and selectedIntent selectedCause is VisibilityPriority, then candidatePlan candidateCause is VisibilityPriority.

##### `CASE_28_DEFROST_PLAN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 28 DEFROST PLAN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - electricalEligibility tier is Limited
>       - electricalEligibility tier is Full
>   - selectedIntent service is Defrost.

> When all applicability conditions are met, EnergySafePlanComposer shall produce a result for which all of the following conditions hold:
>
> candidatePlan plan service is Defrost, candidatePlan plan heatSource is None, if selectedIntent selectedCause is None, then candidatePlan candidateCause is None, if selectedIntent selectedCause is VisibilityPriority, then candidatePlan candidateCause is VisibilityPriority, if electricalEligibility tier is Limited, then candidatePlan plan intensity is Reduced and candidatePlan plan energyTier is Limited, and if electricalEligibility tier is Full, then candidatePlan plan intensity is Normal and candidatePlan plan energyTier is Full.

##### `CASE_29_THERMAL_PLAN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 29 THERMAL PLAN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - electricalEligibility tier is Limited
>       - electricalEligibility tier is Full
>   - At least one of the following conditions holds:
>     
>       - selectedIntent service is Heat
>       - selectedIntent service is Cool.

> When all applicability conditions are met, EnergySafePlanComposer shall produce a result for which all of the following conditions hold:
>
> candidatePlan plan service is selectedIntent service, if selectedIntent selectedCause is None, then candidatePlan candidateCause is None, if selectedIntent selectedCause is VisibilityPriority, then candidatePlan candidateCause is VisibilityPriority, if selectedIntent service is Heat, then candidatePlan plan heatSource is selectedIntent heatSource, if selectedIntent service is Cool, then candidatePlan plan heatSource is None, if electricalEligibility tier is Limited, then candidatePlan plan intensity is Reduced and candidatePlan plan energyTier is Limited, and if electricalEligibility tier is Full, then candidatePlan plan intensity is Normal and candidatePlan plan energyTier is Full.

##### `CASE_30_ENVIRONMENTAL_OR_VENT_PLAN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 30 ENVIRONMENTAL OR VENT PLAN applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - electricalEligibility tier is Limited
>       - electricalEligibility tier is Full
>   - At least one of the following conditions holds:
>     
>       - selectedIntent service is Filter
>       - selectedIntent service is Dry
>       - selectedIntent service is Ventilate.

> When all applicability conditions are met, EnergySafePlanComposer shall produce a result for which all of the following conditions hold:
>
> candidatePlan plan service is selectedIntent service, candidatePlan plan heatSource is None, if selectedIntent selectedCause is None, then candidatePlan candidateCause is None, if selectedIntent selectedCause is VisibilityPriority, then candidatePlan candidateCause is VisibilityPriority, if electricalEligibility tier is Limited, then candidatePlan plan intensity is Reduced and candidatePlan plan energyTier is Limited, and if electricalEligibility tier is Full, then candidatePlan plan intensity is Normal and candidatePlan plan energyTier is Full.

### Requirements for EquipmentFaultAssessor

#### Contract clauses evaluated in the initialization phase

##### `INIT_EQUIPMENT_CRITICAL` — Required behavior

> During contract evaluation for the initialization phase, EquipmentFaultAssessor shall set criticalEquipment to Present, thermalPath thermalBlowerReady to Unavailable, thermalPath thermalReady to Unavailable, visibilityPath visibilityBlowerReady to Unavailable, visibilityPath clearingReady to Unavailable, and airPath airReady to Unavailable.

#### Contract clauses evaluated in the compute phase

##### `EQUIPMENT_AFFECTED_SET` — Required behavior

> During contract evaluation for the compute phase, EquipmentFaultAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     All of the following conditions hold:
>     
>       - thermalPath thermalBlowerReady is Available
>       - visibilityPath visibilityBlowerReady is Available
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - equipmentReadiness validity is Valid
>       - equipmentReadiness circulationState is Ready
>   - visibilityPath visibilityBlowerReady is thermalPath thermalBlowerReady
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     criticalEquipment is Present
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - equipmentReadiness validity is Invalid
>       - thermalPath thermalBlowerReady is Unavailable
>       - equipmentReadiness clearing is not Ready
>       - equipmentReadiness thermal is Unknown
>       - equipmentReadiness airTreatment is Unknown
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - equipmentReadiness validity is Valid
>       - equipmentReadiness thermal is Ready
>     
>     **Then:**
>     
>     thermalPath thermalReady is Available
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - equipmentReadiness validity is Invalid
>       - equipmentReadiness thermal is not Ready
>     
>     **Then:**
>     
>     thermalPath thermalReady is Unavailable
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - equipmentReadiness validity is Valid
>       - equipmentReadiness clearing is Ready
>     
>     **Then:**
>     
>     visibilityPath clearingReady is Available
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - equipmentReadiness validity is Invalid
>       - equipmentReadiness clearing is not Ready
>     
>     **Then:**
>     
>     visibilityPath clearingReady is Unavailable
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - equipmentReadiness validity is Valid
>       - equipmentReadiness airTreatment is Ready
>     
>     **Then:**
>     
>     airPath airReady is Available
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - equipmentReadiness validity is Invalid
>       - equipmentReadiness airTreatment is not Ready
>     
>     **Then:**
>     
>     airPath airReady is Unavailable.

### Requirements for HumidityNeedAssessor

#### Contract clauses evaluated in the initialization phase

##### `INIT_HUMIDITY_UNAVAILABLE` — Required behavior

> During contract evaluation for the initialization phase, HumidityNeedAssessor shall set humidityNeed to Unavailable.

#### Contract clauses evaluated in the compute phase

##### `HUMIDITY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, HumidityNeedAssessor shall produce a result for which if humidityObservation validity is Invalid, then humidityNeed is Unavailable, if humidityObservation validity is Valid and humidityObservation condition is not Damp, then humidityNeed is None, and if humidityObservation validity is Valid and humidityObservation condition is Damp, then humidityNeed is Dry.

### Requirements for PriorityAuthorizationArbiter

#### Contract clauses evaluated in the initialization phase

##### `INIT_AUTHORIZATION_NORMAL` — Required behavior

> During contract evaluation for the initialization phase, PriorityAuthorizationArbiter shall set authorization to Normal, selectedIntent service to None, selectedIntent heatSource to None, selectedIntent fan to Low, selectedIntent selectedCause to None, selectedIntent controlMode to Idle, arbitrationStatus authorization to Normal, arbitrationStatus controlMode to Idle, arbitrationStatus arbitrationCause to None, and arbitrationStatus noncriticalCause to None.

#### Contract clauses evaluated in the compute phase

##### `CASE_16_RECOVERY_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryReport recoveryState is Latched or recoveryReport recoveryState is Pending, PriorityAuthorizationArbiter shall produce a result for which authorization is AwaitFresh, selectedIntent service is None, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is AwaitingRecovery, selectedIntent controlMode is FaultHold, arbitrationStatus authorization is AwaitFresh, arbitrationStatus controlMode is FaultHold, arbitrationStatus arbitrationCause is AwaitingRecovery, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_17_JUST_CLEARED_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryReport recoveryState is Clear and recoveryReport recoveryEvent is JustCleared, PriorityAuthorizationArbiter shall produce a result for which authorization is AwaitFresh, selectedIntent service is None, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is AwaitingFreshRequest, selectedIntent controlMode is AwaitFresh, arbitrationStatus authorization is AwaitFresh, arbitrationStatus controlMode is AwaitFresh, arbitrationStatus arbitrationCause is AwaitingFreshRequest, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_18_AWAIT_FRESH_STUTTER` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 AWAIT FRESH STUTTER applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryReport recoveryState is Clear
>   - recoveryReport recoveryEvent is not JustCleared
>   - the value of authorization on entry is AwaitFresh
>   - At least one of the following conditions holds:
>     
>       - visibilityProposal visibilityApplicability is Unavailable
>       - visibilityProposal urgency is not Urgent
>   - At least one of the following conditions holds:
>     
>       - qualifiedRequest arrival is not New
>       - qualifiedRequest requestClass is Invalid.

> When all applicability conditions are met, PriorityAuthorizationArbiter shall produce a result for which all of the following conditions hold:
>
> authorization is AwaitFresh, selectedIntent service is None, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is AwaitingFreshRequest, selectedIntent controlMode is AwaitFresh, arbitrationStatus authorization is AwaitFresh, arbitrationStatus controlMode is AwaitFresh, arbitrationStatus arbitrationCause is AwaitingFreshRequest, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_19_URGENT_VISIBILITY` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryReport recoveryState is Clear, recoveryReport recoveryEvent is not JustCleared, visibilityProposal visibilityApplicability is Available, and visibilityProposal urgency is Urgent, PriorityAuthorizationArbiter shall produce a result for which authorization is Normal, selectedIntent service is Defrost, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is VisibilityPriority, selectedIntent controlMode is Active, arbitrationStatus authorization is Normal, arbitrationStatus controlMode is Active, arbitrationStatus arbitrationCause is VisibilityPriority, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_20_EXPLICIT_DEFROST` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 EXPLICIT DEFROST applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryReport recoveryState is Clear
>   - recoveryReport recoveryEvent is not JustCleared
>   - At least one of the following conditions holds:
>     
>       - visibilityProposal visibilityApplicability is Unavailable
>       - visibilityProposal urgency is not Urgent
>   - At least one of the following conditions holds:
>     
>       - the value of authorization on entry is Normal
>       - All of the following conditions hold:
>         
>           - qualifiedRequest arrival is New
>           - qualifiedRequest requestClass is not Invalid
>   - qualifiedRequest requestClass is Defrost
>   - visibilityProposal visibilityApplicability is Available.

> When all applicability conditions are met, PriorityAuthorizationArbiter shall produce a result for which all of the following conditions hold:
>
> authorization is Normal, selectedIntent service is Defrost, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is None, selectedIntent controlMode is Active, arbitrationStatus authorization is Normal, arbitrationStatus controlMode is Active, arbitrationStatus arbitrationCause is None, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_21_OFF_OR_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 21 OFF OR INVALID applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryReport recoveryState is Clear
>   - recoveryReport recoveryEvent is not JustCleared
>   - At least one of the following conditions holds:
>     
>       - visibilityProposal visibilityApplicability is Unavailable
>       - visibilityProposal urgency is not Urgent
>   - At least one of the following conditions holds:
>     
>       - the value of authorization on entry is Normal
>       - All of the following conditions hold:
>         
>           - qualifiedRequest arrival is New
>           - qualifiedRequest requestClass is not Invalid
>   - At least one of the following conditions holds:
>     
>       - qualifiedRequest requestClass is Off
>       - qualifiedRequest requestClass is Invalid.

> When all applicability conditions are met, PriorityAuthorizationArbiter shall produce a result for which all of the following conditions hold:
>
> authorization is Normal, selectedIntent service is None, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is None, selectedIntent controlMode is Idle, arbitrationStatus authorization is Normal, arbitrationStatus controlMode is Idle, arbitrationStatus arbitrationCause is None, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_22_FILTER_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 22 FILTER PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryReport recoveryState is Clear
>   - recoveryReport recoveryEvent is not JustCleared
>   - At least one of the following conditions holds:
>     
>       - visibilityProposal visibilityApplicability is Unavailable
>       - visibilityProposal urgency is not Urgent
>   - At least one of the following conditions holds:
>     
>       - the value of authorization on entry is Normal
>       - All of the following conditions hold:
>         
>           - qualifiedRequest arrival is New
>           - qualifiedRequest requestClass is not Invalid
>   - qualifiedRequest requestClass is not Off
>   - qualifiedRequest requestClass is not Invalid
>   - At least one of the following conditions holds:
>     
>       - qualifiedRequest requestClass is not Defrost
>       - visibilityProposal visibilityApplicability is Unavailable
>   - cabinAirProposal cabinAirApplicability is Available
>   - cabinAirProposal service is Filter.

> When all applicability conditions are met, PriorityAuthorizationArbiter shall produce a result for which all of the following conditions hold:
>
> authorization is Normal, selectedIntent service is Filter, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is None, selectedIntent controlMode is Active, arbitrationStatus authorization is Normal, arbitrationStatus controlMode is Active, arbitrationStatus arbitrationCause is None, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_23_DRY_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 23 DRY PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryReport recoveryState is Clear
>   - recoveryReport recoveryEvent is not JustCleared
>   - At least one of the following conditions holds:
>     
>       - visibilityProposal visibilityApplicability is Unavailable
>       - visibilityProposal urgency is not Urgent
>   - At least one of the following conditions holds:
>     
>       - the value of authorization on entry is Normal
>       - All of the following conditions hold:
>         
>           - qualifiedRequest arrival is New
>           - qualifiedRequest requestClass is not Invalid
>   - qualifiedRequest requestClass is not Off
>   - qualifiedRequest requestClass is not Invalid
>   - At least one of the following conditions holds:
>     
>       - qualifiedRequest requestClass is not Defrost
>       - visibilityProposal visibilityApplicability is Unavailable
>   - At least one of the following conditions holds:
>     
>       - cabinAirProposal cabinAirApplicability is Unavailable
>       - cabinAirProposal service is not Filter
>   - cabinAirProposal cabinAirApplicability is Available
>   - cabinAirProposal service is Dry.

> When all applicability conditions are met, PriorityAuthorizationArbiter shall produce a result for which all of the following conditions hold:
>
> authorization is Normal, selectedIntent service is Dry, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is None, selectedIntent controlMode is Active, arbitrationStatus authorization is Normal, arbitrationStatus controlMode is Active, arbitrationStatus arbitrationCause is None, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_24_THERMAL_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 24 THERMAL PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryReport recoveryState is Clear
>   - recoveryReport recoveryEvent is not JustCleared
>   - At least one of the following conditions holds:
>     
>       - visibilityProposal visibilityApplicability is Unavailable
>       - visibilityProposal urgency is not Urgent
>   - At least one of the following conditions holds:
>     
>       - the value of authorization on entry is Normal
>       - All of the following conditions hold:
>         
>           - qualifiedRequest arrival is New
>           - qualifiedRequest requestClass is not Invalid
>   - qualifiedRequest requestClass is not Off
>   - qualifiedRequest requestClass is not Invalid
>   - At least one of the following conditions holds:
>     
>       - qualifiedRequest requestClass is not Defrost
>       - visibilityProposal visibilityApplicability is Unavailable
>   - At least one of the following conditions holds:
>     
>       - cabinAirProposal cabinAirApplicability is Unavailable
>       - All of the following conditions hold:
>         
>           - cabinAirProposal service is not Filter
>           - cabinAirProposal service is not Dry
>   - thermalProposal thermalApplicability is Available
>   - At least one of the following conditions holds:
>     
>       - thermalProposal service is Heat
>       - thermalProposal service is Cool.

> When all applicability conditions are met, PriorityAuthorizationArbiter shall produce a result for which all of the following conditions hold:
>
> authorization is Normal, selectedIntent service is thermalProposal service, selectedIntent heatSource is thermalProposal heatSource, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is None, selectedIntent controlMode is Active, arbitrationStatus authorization is Normal, arbitrationStatus controlMode is Active, arbitrationStatus arbitrationCause is None, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

##### `CASE_25_VENTILATE_OR_NONE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 25 VENTILATE OR NONE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryReport recoveryState is Clear
>   - recoveryReport recoveryEvent is not JustCleared
>   - At least one of the following conditions holds:
>     
>       - visibilityProposal visibilityApplicability is Unavailable
>       - visibilityProposal urgency is not Urgent
>   - At least one of the following conditions holds:
>     
>       - the value of authorization on entry is Normal
>       - All of the following conditions hold:
>         
>           - qualifiedRequest arrival is New
>           - qualifiedRequest requestClass is not Invalid
>   - qualifiedRequest requestClass is not Off
>   - qualifiedRequest requestClass is not Invalid
>   - At least one of the following conditions holds:
>     
>       - qualifiedRequest requestClass is not Defrost
>       - visibilityProposal visibilityApplicability is Unavailable
>   - At least one of the following conditions holds:
>     
>       - cabinAirProposal cabinAirApplicability is Unavailable
>       - All of the following conditions hold:
>         
>           - cabinAirProposal service is not Filter
>           - cabinAirProposal service is not Dry
>   - At least one of the following conditions holds:
>     
>       - thermalProposal thermalApplicability is Unavailable
>       - All of the following conditions hold:
>         
>           - thermalProposal service is not Heat
>           - thermalProposal service is not Cool.

> When all applicability conditions are met, PriorityAuthorizationArbiter shall produce a result for which all of the following conditions hold:
>
> authorization is Normal, selectedIntent heatSource is None, selectedIntent fan is qualifiedRequest fan, selectedIntent selectedCause is None, arbitrationStatus authorization is Normal, arbitrationStatus arbitrationCause is None, if thermalProposal thermalApplicability is Available and thermalProposal service is Ventilate, then selectedIntent service is Ventilate, selectedIntent controlMode is Active, and arbitrationStatus controlMode is Active, if thermalProposal thermalApplicability is Unavailable or thermalProposal service is not Ventilate, then selectedIntent service is None, selectedIntent controlMode is Idle, and arbitrationStatus controlMode is Idle, if cabinAirProposal airDegradation is InvalidAirQuality, then arbitrationStatus noncriticalCause is InvalidAirQuality, if cabinAirProposal airDegradation is not InvalidAirQuality and cabinAirProposal humidityDegradation is InvalidHumidity, then arbitrationStatus noncriticalCause is InvalidHumidity, if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is InvalidThermal, then arbitrationStatus noncriticalCause is InvalidThermal, and if cabinAirProposal airDegradation is not InvalidAirQuality, cabinAirProposal humidityDegradation is not InvalidHumidity, and thermalProposal degradation is not InvalidThermal, then arbitrationStatus noncriticalCause is None.

### Requirements for RequestQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_REQUEST_SAFE` — Required behavior

> During contract evaluation for the initialization phase, RequestQualifier shall set qualifiedTarget requestClass to Invalid, qualifiedTarget target to Neutral, qualifiedRequest requestClass to Invalid, qualifiedRequest arrival to Held, qualifiedRequest enabled to Off, and qualifiedRequest fan to Low.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_INVALID_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if userRequest validity is Invalid, RequestQualifier shall set qualifiedTarget requestClass to Invalid, qualifiedRequest requestClass to Invalid, qualifiedTarget target to userRequest target, qualifiedRequest arrival to userRequest arrival, qualifiedRequest enabled to userRequest enabled, and qualifiedRequest fan to userRequest fan.

##### `CASE_02_DEFROST_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if userRequest validity is Valid and userRequest defrost is Requested, RequestQualifier shall set qualifiedTarget requestClass to Defrost, qualifiedRequest requestClass to Defrost, qualifiedTarget target to userRequest target, qualifiedRequest arrival to userRequest arrival, qualifiedRequest enabled to userRequest enabled, and qualifiedRequest fan to userRequest fan.

##### `CASE_03_USER_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if userRequest validity is Valid, userRequest defrost is NotRequested, and userRequest enabled is Off, RequestQualifier shall set qualifiedTarget requestClass to Off, qualifiedRequest requestClass to Off, qualifiedTarget target to userRequest target, qualifiedRequest arrival to userRequest arrival, qualifiedRequest enabled to userRequest enabled, and qualifiedRequest fan to userRequest fan.

##### `CASE_04_COMFORT_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if userRequest validity is Valid, userRequest defrost is NotRequested, and userRequest enabled is On, RequestQualifier shall set qualifiedTarget requestClass to Comfort, qualifiedRequest requestClass to Comfort, qualifiedTarget target to userRequest target, qualifiedRequest arrival to userRequest arrival, qualifiedRequest enabled to userRequest enabled, and qualifiedRequest fan to userRequest fan.

### Requirements for ThermalNeedAssessor

#### Contract clauses evaluated in the initialization phase

##### `INIT_THERMAL_UNAVAILABLE` — Required behavior

> During contract evaluation for the initialization phase, ThermalNeedAssessor shall set thermalAssessment need to Unavailable and thermalAssessment observationInvalid to Invalid.

#### Contract clauses evaluated in the compute phase

##### `THERMAL_COMPARISON` — Required behavior

> During contract evaluation for the compute phase, ThermalNeedAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     cabinObservation validity is Invalid
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment need is Unavailable
>       - thermalAssessment observationInvalid is Invalid
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - cabinObservation validity is Valid
>       - qualifiedTarget requestClass is not Comfort
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment need is Unavailable
>       - thermalAssessment observationInvalid is Valid
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - cabinObservation validity is Valid
>       - qualifiedTarget requestClass is Comfort
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - qualifiedTarget target is Cool
>               - cabinObservation band is Cool
>           - All of the following conditions hold:
>             
>               - qualifiedTarget target is Neutral
>               - cabinObservation band is Neutral
>           - All of the following conditions hold:
>             
>               - qualifiedTarget target is Warm
>               - cabinObservation band is Warm
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment need is None
>       - thermalAssessment observationInvalid is Valid
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - cabinObservation validity is Valid
>       - qualifiedTarget requestClass is Comfort
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - qualifiedTarget target is Warm
>               - cabinObservation band is not Warm
>           - All of the following conditions hold:
>             
>               - qualifiedTarget target is Neutral
>               - cabinObservation band is Cool
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment need is Heat
>       - thermalAssessment observationInvalid is Valid
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - cabinObservation validity is Valid
>       - qualifiedTarget requestClass is Comfort
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - qualifiedTarget target is Cool
>               - cabinObservation band is not Cool
>           - All of the following conditions hold:
>             
>               - qualifiedTarget target is Neutral
>               - cabinObservation band is Warm
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment need is Cool
>       - thermalAssessment observationInvalid is Valid.

### Requirements for ThermalServiceProposer

#### Contract clauses evaluated in the initialization phase

##### `INIT_THERMAL_PROPOSAL_NONE` — Required behavior

> During contract evaluation for the initialization phase, ThermalServiceProposer shall set thermalProposal service to None, thermalProposal heatSource to None, thermalProposal thermalApplicability to Unavailable, and thermalProposal degradation to InvalidThermal.

#### Contract clauses evaluated in the compute phase

##### `THERMAL_PROPOSAL_APPLICABILITY` — Required behavior

> During contract evaluation for the compute phase, ThermalServiceProposer shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     thermalAssessment observationInvalid is Invalid
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalProposal service is None
>       - thermalProposal heatSource is None
>       - thermalProposal thermalApplicability is Unavailable
>       - thermalProposal degradation is InvalidThermal
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment observationInvalid is Valid
>       - At least one of the following conditions holds:
>         
>           - thermalAssessment need is Unavailable
>           - All of the following conditions hold:
>             
>               - thermalAssessment need is None
>               - thermalPath thermalBlowerReady is Unavailable
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalProposal service is None
>       - thermalProposal heatSource is None
>       - thermalProposal thermalApplicability is Unavailable
>       - thermalProposal degradation is None
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment observationInvalid is Valid
>       - thermalAssessment need is None
>       - thermalPath thermalBlowerReady is Available
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalProposal service is Ventilate
>       - thermalProposal heatSource is None
>       - thermalProposal thermalApplicability is Available
>       - thermalProposal degradation is None
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment observationInvalid is Valid
>       - At least one of the following conditions holds:
>         
>           - thermalAssessment need is Heat
>           - thermalAssessment need is Cool
>       - At least one of the following conditions holds:
>         
>           - thermalPath thermalBlowerReady is Unavailable
>           - thermalPath thermalReady is Unavailable
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalProposal service is None
>       - thermalProposal heatSource is None
>       - thermalProposal thermalApplicability is Unavailable
>       - thermalProposal degradation is None
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment observationInvalid is Valid
>       - thermalAssessment need is Heat
>       - thermalPath thermalBlowerReady is Available
>       - thermalPath thermalReady is Available
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalProposal service is Heat
>       - thermalProposal thermalApplicability is Available
>       - thermalProposal degradation is None
>       - **If:**
>         
>         wasteHeatEligibility is Eligible
>         
>         **Then:**
>         
>         thermalProposal heatSource is WasteHeat
>       - **If:**
>         
>         wasteHeatEligibility is Ineligible
>         
>         **Then:**
>         
>         thermalProposal heatSource is Electrical
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - thermalAssessment observationInvalid is Valid
>       - thermalAssessment need is Cool
>       - thermalPath thermalBlowerReady is Available
>       - thermalPath thermalReady is Available
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - thermalProposal service is Cool
>       - thermalProposal heatSource is None
>       - thermalProposal thermalApplicability is Available
>       - thermalProposal degradation is None.

### Requirements for VisibilityNeedAssessor

#### Contract clauses evaluated in the initialization phase

##### `INIT_VISIBILITY_CRITICAL` — Required behavior

> During contract evaluation for the initialization phase, VisibilityNeedAssessor shall set visibilityNeed to Unavailable and visibilityFault to Present.

#### Contract clauses evaluated in the compute phase

##### `VISIBILITY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, VisibilityNeedAssessor shall produce a result for which if glazingObservation validity is Invalid, then visibilityNeed is Unavailable, if glazingObservation validity is Valid and glazingObservation condition is Clear, then visibilityNeed is None, if glazingObservation validity is Valid and glazingObservation condition is Misting, then visibilityNeed is Preventive, and if glazingObservation validity is Valid and glazingObservation condition is Obscured, then visibilityNeed is Urgent.

##### `VISIBILITY_CRITICAL_FACT` — Required behavior

> During contract evaluation for the compute phase, VisibilityNeedAssessor shall set visibilityFault to Present exactly when glazingObservation validity is Invalid.

### Requirements for VisibilityServiceProposer

#### Contract clauses evaluated in the initialization phase

##### `INIT_VISIBILITY_PROPOSAL_UNAVAILABLE` — Required behavior

> During contract evaluation for the initialization phase, VisibilityServiceProposer shall set visibilityProposal visibilityApplicability to Unavailable and visibilityProposal urgency to Unavailable.

#### Contract clauses evaluated in the compute phase

##### `VISIBILITY_PROPOSAL_APPLICABILITY` — Required behavior

> During contract evaluation for the compute phase, VisibilityServiceProposer shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     visibilityNeed is Unavailable
>     
>     **Then:**
>     
>     visibilityProposal visibilityApplicability is Unavailable
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - visibilityNeed is not Unavailable
>       - visibilityPath visibilityBlowerReady is Available
>       - visibilityPath clearingReady is Available
>     
>     **Then:**
>     
>     visibilityProposal visibilityApplicability is Available
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - visibilityNeed is not Unavailable
>       - At least one of the following conditions holds:
>         
>           - visibilityPath visibilityBlowerReady is Unavailable
>           - visibilityPath clearingReady is Unavailable
>     
>     **Then:**
>     
>     visibilityProposal visibilityApplicability is Unavailable.

##### `VISIBILITY_URGENCY_MAPPING` — Required behavior

> During contract evaluation for the compute phase, VisibilityServiceProposer shall produce a result for which if visibilityNeed is Unavailable, then visibilityProposal urgency is Unavailable, if visibilityNeed is None, then visibilityProposal urgency is None, if visibilityNeed is Preventive, then visibilityProposal urgency is Preventive, and if visibilityNeed is Urgent, then visibilityProposal urgency is Urgent.

### Requirements for WasteHeatEligibilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_WASTE_HEAT_INELIGIBLE` — Required behavior

> During contract evaluation for the initialization phase, WasteHeatEligibilityOwner shall set wasteHeatEligibility to Ineligible.

#### Contract clauses evaluated in the compute phase

##### `WASTE_HEAT_ELIGIBILITY` — Required behavior

> During contract evaluation for the compute phase, WasteHeatEligibilityOwner shall produce a result for which if wasteHeatAvailability validity is Valid and wasteHeatAvailability availability is Available, then wasteHeatEligibility is Eligible and if wasteHeatAvailability validity is Invalid or wasteHeatAvailability availability is Unavailable, then wasteHeatEligibility is Ineligible.
