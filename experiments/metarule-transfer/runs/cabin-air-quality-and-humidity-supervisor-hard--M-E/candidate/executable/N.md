# Cabin Air-Quality and Humidity Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: [Source-grounded need.] A vehicle user needs cabin-air filtration and humidity
preferences to be accepted and turned into coherent cabin-air treatment outcomes while
the condition observations and shared treatment path may be unavailable.

PURPOSE-01: [Selected pilot purpose.] The system shall supervise cabin air quality and
humidity by qualifying finite observations, retaining accepted user preferences,
selecting at most one air-treatment purpose, containing observation faults by channel,
and issuing one coherent treatment request. It does not regulate temperature, authorize
defrost, allocate energy, or control physical treatment equipment.

GOAL-01: The system shall give demanded air filtration precedence over humidity
correction and routine air exchange without issuing concurrent conflicting requests.

GOAL-02: The system shall prevent an invalid air-quality observation from authorizing
filtration and prevent an invalid humidity observation from authorizing humidity
correction while preserving an eligible unaffected channel.

GOAL-03: The system shall retain each observation channel in quarantine until two
consecutive valid observations establish recovery, and a recurrence shall restart that
channel's recovery sequence.

GOAL-04: The system shall change retained user preference only on a fresh valid request;
invalid or held request values shall not overwrite the last accepted preference.

GOAL-05: The system shall compose every selected purpose with current shared-air-path
authority and treatment-equipment capability and shall report one deterministic mode and
cause.

### Operational context and exact finite boundary

CTX-01: The vehicle user supplies cabin-air preferences through an external interface.
The user does not directly command treatment equipment and is responsible only for the
request-event semantics in ASM-01.

CTX-02: The cabin-air environment supplies finite air-quality and humidity observations
and receives the consequences of accepted treatment requests. Actual pollutant and
moisture dynamics remain outside the model.

CTX-03: The air-treatment equipment layer supplies finite readiness and receives the
logical treatment plan. Blowers, filters, humidifying/dehumidifying devices, actuation,
and outcome feedback are outside the model.

CTX-04: The external cabin air-path coordinator supplies authority to use a shared path.
It may reserve that path for an unspecified external HVAC purpose, but no thermal,
defrost, or energy policy crosses this boundary.

CTX-05: The dashboard/status recipient receives supervisor mode and cause. Display
presentation and subjective usability remain outside scope.

MON-01: `UserAirPreference` from CTX-01 is the product of `validity={Valid,Invalid}`,
`arrival={New,Held}`, `enable={On,Off}`, `filterPolicy={Automatic,Continuous}`,
`humidityPolicy={Automatic,Disabled}`, and `routineAirflow={Off,Low,High}`. `New`
denotes a fresh request for one evaluation; `Held` denotes an unchanged boundary value.

MON-02: `AirQualityObservation` from CTX-02 is the product of `validity={Valid,Invalid}`
and `condition={Clean,Loaded}`. `Loaded` is only a finite demand label and does not
identify or quantify a pollutant.

MON-03: `HumidityObservation` from CTX-02 is the product of `validity={Valid,Invalid}`
and `condition={Dry,Acceptable,Damp}`. The labels are qualitative and have no units,
accuracy, or physical threshold claim.

MON-04: `AirTreatmentReadiness` from CTX-03 carries `validity={Valid,Invalid}` and
separate `blower`, `filter`, `humidifier`, and `dehumidifier` fields, each in
`{Ready,Failed,Unknown}`.

MON-05: `SharedAirPathAuthority` from CTX-04 is the product of
`validity={Valid,Invalid}` and `grant={Granted,Reserved}`. `Reserved` is a normal
external inhibit; `Invalid` is an untrusted authority value.

CTRL-01: `CabinAirTreatmentPlan` delivered to CTX-03 is one logical value with
`action={None,FilterAir,IncreaseHumidity,ReduceHumidity,ExchangeAir}`,
`flowClass={Off,Routine,Treatment}`, and `authorityUse={None,SharedAirPath}`.

CTRL-02: `CabinAirSupervisorStatus` delivered to CTX-05 is one logical value with
`mode={Idle,Active,Degraded,ObservationHold,Inhibited}` and
`cause={None,PreferenceDisabled,PreferenceRejected,AirTreatmentPriority,HumidityTreatmentPriority,AirObservationInvalid,HumidityObservationInvalid,AirRecovering,HumidityRecovering,AuthorityInvalid,AirPathReserved,EquipmentUnavailable,SelectedPathUnavailable}`.

### Essential environmental assumptions and selected constraints

ASM-01: CTX-01 is responsible for asserting `arrival=New` only when the user issues a
new preference. Rationale: fresh-request acceptance must be distinguishable without
prescribing an interface mechanism; a persistent `Held` value is never a new decision.

ASM-02: CTX-02 is responsible for pairing each current observation with its current
validity. Rationale: the seed establishes no sensor trust semantics, so invalidity is
explicit and is never inferred from a condition label.

ASM-03: CTX-03 is responsible for a simultaneous readiness snapshot. `Unknown` and any
field accompanying overall `validity=Invalid` are treated as not ready. Rationale: this
closes capability composition conservatively without claiming a physical
failure-detection mechanism.

ASM-04: CTX-04 is responsible for a current authority snapshot. The supervisor shall not
infer which external HVAC purpose caused `Reserved`. Rationale: shared-path coordination
is needed for coherent composition but the external service must not become this
system's controlled purpose.

ASM-05: One logical evaluation consumes one simultaneous boundary snapshot and publishes
both outputs for that snapshot. Evaluation order is used only to define state
transitions and consecutive-valid recovery; it is not a scheduler, sampling-rate, or
response-time claim.

ASM-06: `Continuous` filtration, humidify/dehumidify distinctions, and the exact
priority order are selected pilot policies grounded only in the seed's optional
preference, filtration, and humidity vocabulary. They are not asserted as production
HVAC policy.

### Required behavior, faults, and risks

RISK-01: If a stale valid condition survives an invalid observation, the supervisor
could issue filtration or humidity correction without current trusted evidence. FAULT-01
and COMP-04 mitigate this initiating sequence by channel quarantine and same-evaluation
suppression.

RISK-02: If filtration, humidity correction, and routine airflow directly issue
commands, simultaneous demands could create a conflicting treatment plan. POL-01 and
CASE-17 through CASE-22 mitigate this with one explicit priority owner.

RISK-03: If a selected purpose bypasses shared-path authority or equipment capability,
the supervisor could request an unavailable path. FAULT-03 and CASE-23 through CASE-29
mitigate this through fail-closed composition.

RISK-04: If an invalid or held request overwrites retained preference, user intent could
change without a fresh valid interaction. CASE-01 through CASE-04 mitigate this by one
preference-session owner and preserved state.

## Supporting contract definitions

### State `Cabin_Air_Quality_Humidity_Supervisor::AirEvidenceRecoveryOwner::airTrustMemory`

State `airTrustMemory` has type `Cabin_Air_Quality_Humidity_Supervisor::TrustState`.

### State `Cabin_Air_Quality_Humidity_Supervisor::HumidityEvidenceRecoveryOwner::humidityTrustMemory`

State `humidityTrustMemory` has type `Cabin_Air_Quality_Humidity_Supervisor::TrustState`.

### State `Cabin_Air_Quality_Humidity_Supervisor::PreferenceSessionOwner::acceptedEnableMemory`

State `acceptedEnableMemory` has type `Cabin_Air_Quality_Humidity_Supervisor::EnableChoice`.

### State `Cabin_Air_Quality_Humidity_Supervisor::PreferenceSessionOwner::acceptedFilterPolicyMemory`

State `acceptedFilterPolicyMemory` has type `Cabin_Air_Quality_Humidity_Supervisor::FilterPolicy`.

### State `Cabin_Air_Quality_Humidity_Supervisor::PreferenceSessionOwner::acceptedHumidityPolicyMemory`

State `acceptedHumidityPolicyMemory` has type `Cabin_Air_Quality_Humidity_Supervisor::HumidityPolicy`.

### State `Cabin_Air_Quality_Humidity_Supervisor::PreferenceSessionOwner::acceptedRoutineAirflowMemory`

State `acceptedRoutineAirflowMemory` has type `Cabin_Air_Quality_Humidity_Supervisor::RoutineAirflow`.

## Detailed behavioral requirements

### Requirements for AirEvidenceRecoveryOwner

#### Contract clauses evaluated in the initialization phase

May modify: airTrustMemory

##### `INITIAL_AIR_TRUST_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AirEvidenceRecoveryOwner shall set airTrustMemory to Trusted, report to filter trust to Trusted, report to filter transitionEvent to AirStable, report to filter evidence to Clean, report to filter gateOpen to true exactly when F is true, report to status trust to report to filter trust, report to status transitionEvent to report to filter transitionEvent, report to status evidence to report to filter evidence, and report to status gateOpen to true exactly when report to filter gateOpen is true.

#### Contract clauses evaluated in the compute phase

May modify: airTrustMemory

##### `AIR_REPORT_FANOUT` — Required behavior

> During contract evaluation for the compute phase, AirEvidenceRecoveryOwner shall set report to filter trust to airTrustMemory, report to filter evidence to evidence, report to status trust to report to filter trust, report to status transitionEvent to report to filter transitionEvent, report to status evidence to report to filter evidence, and report to status gateOpen to true exactly when report to filter gateOpen is true.

##### `CASE_05_AIR_FAULT_ENTERED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of airTrustMemory on entry is Trusted and evidence is Invalid, AirEvidenceRecoveryOwner shall set airTrustMemory to Quarantined, report to filter gateOpen to true exactly when F is true, and report to filter transitionEvent to AirFaultEntered.

##### `CASE_06_AIR_STABLE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of airTrustMemory on entry is Trusted and evidence is not Invalid, AirEvidenceRecoveryOwner shall set airTrustMemory to Trusted, report to filter gateOpen to true exactly when T is true, and report to filter transitionEvent to AirStable.

##### `CASE_07_AIR_FAULT_PERSISTS` — Conditional behavior

> During contract evaluation for the compute phase, if the value of airTrustMemory on entry is Quarantined and evidence is Invalid, AirEvidenceRecoveryOwner shall set airTrustMemory to Quarantined, report to filter gateOpen to true exactly when F is true, and report to filter transitionEvent to AirFaultPersists.

##### `CASE_08_AIR_RECOVERY_STARTED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of airTrustMemory on entry is Quarantined and evidence is not Invalid, AirEvidenceRecoveryOwner shall set airTrustMemory to Confirming, report to filter gateOpen to true exactly when F is true, and report to filter transitionEvent to AirRecoveryStarted.

##### `CASE_09_AIR_FAULT_RECURRED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of airTrustMemory on entry is Confirming and evidence is Invalid, AirEvidenceRecoveryOwner shall set airTrustMemory to Quarantined, report to filter gateOpen to true exactly when F is true, and report to filter transitionEvent to AirFaultRecurred.

##### `CASE_10_AIR_RECOVERED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of airTrustMemory on entry is Confirming and evidence is not Invalid, AirEvidenceRecoveryOwner shall set airTrustMemory to Trusted, report to filter gateOpen to true exactly when T is true, and report to filter transitionEvent to AirRecovered.

### Requirements for AirQualityNeedAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_AIR_EVIDENCE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AirQualityNeedAssessor shall set evidence to Invalid.

#### Contract clauses evaluated in the compute phase

##### `AIR_EVIDENCE_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, AirQualityNeedAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - observation validity is Invalid
>       - evidence is Invalid
>   - All of the following conditions hold:
>     
>       - observation validity is Valid
>       - observation condition is Clean
>       - evidence is Clean
>   - All of the following conditions hold:
>     
>       - observation validity is Valid
>       - observation condition is Loaded
>       - evidence is FilterDemand.

### Requirements for AuthoritySafePlanComposer

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PLAN_ALL_OFF` — Required behavior

> During contract evaluation for the initialization phase, AuthoritySafePlanComposer shall set composition to status treatmentAction to None, composition to status flowClass to Off, composition to status authorityUse to None, composition to status cause to PreferenceDisabled, treatment plan treatmentAction to None, treatment plan flowClass to Off, and treatment plan authorityUse to None.

#### Contract clauses evaluated in the compute phase

##### `PLAN_DELIVERY_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, AuthoritySafePlanComposer shall set treatment plan treatmentAction to composition to status treatmentAction, treatment plan flowClass to composition to status flowClass, and treatment plan authorityUse to composition to status authorityUse.

##### `PLAN_SHAPE_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, AuthoritySafePlanComposer shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - composition to status treatmentAction is None
>       - composition to status flowClass is Off
>       - composition to status authorityUse is None
>   - All of the following conditions hold:
>     
>       - composition to status treatmentAction is not None
>       - composition to status flowClass is not Off
>       - composition to status authorityUse is SharedAirPath.

##### `CASE_23_NONE_ALL_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if selection intent is None, AuthoritySafePlanComposer shall set composition to status treatmentAction to None, composition to status flowClass to Off, composition to status authorityUse to None, and composition to status cause to selection cause.

##### `CASE_24_UNTRUSTED_AUTHORITY` — Conditional behavior

> During contract evaluation for the compute phase, if selection intent is not None and path is Untrusted, AuthoritySafePlanComposer shall set composition to status treatmentAction to None, composition to status flowClass to Off, composition to status authorityUse to None, and composition to status cause to AuthorityInvalid.

##### `CASE_25_RESERVED_AUTHORITY` — Conditional behavior

> During contract evaluation for the compute phase, if selection intent is not None and path is Reserved, AuthoritySafePlanComposer shall set composition to status treatmentAction to None, composition to status flowClass to Off, composition to status authorityUse to None, and composition to status cause to AirPathReserved.

##### `CASE_26_BLOWER_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if selection intent is not None, path is Usable, and capabilities sharedBlowerDisposition is not Ready, AuthoritySafePlanComposer shall set composition to status treatmentAction to None, composition to status flowClass to Off, composition to status authorityUse to None, and composition to status cause to EquipmentUnavailable.

##### `CASE_27_FILTER_COMPOSITION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 27 FILTER COMPOSITION applies under all of the following conditions:
>
> selection intent is Filter, path is Usable, and capabilities sharedBlowerDisposition is Ready.

> When all applicability conditions are met, AuthoritySafePlanComposer shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - capabilities sharedFilterDisposition is Ready
>       - composition to status treatmentAction is FilterAir
>       - composition to status flowClass is Treatment
>       - composition to status authorityUse is SharedAirPath
>       - composition to status cause is selection cause
>   - All of the following conditions hold:
>     
>       - capabilities sharedFilterDisposition is not Ready
>       - composition to status treatmentAction is None
>       - composition to status flowClass is Off
>       - composition to status authorityUse is None
>       - composition to status cause is SelectedPathUnavailable.

##### `CASE_28_HUMIDITY_COMPOSITION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 28 HUMIDITY COMPOSITION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - selection intent is Increase
>       - selection intent is Reduce
>   - path is Usable
>   - capabilities sharedBlowerDisposition is Ready.

> When all applicability conditions are met, AuthoritySafePlanComposer shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - selection intent is Increase
>       - capabilities sharedHumidifierDisposition is Ready
>       - composition to status treatmentAction is IncreaseHumidity
>       - composition to status flowClass is Treatment
>       - composition to status authorityUse is SharedAirPath
>       - composition to status cause is selection cause
>   - All of the following conditions hold:
>     
>       - selection intent is Reduce
>       - capabilities sharedDehumidifierDisposition is Ready
>       - composition to status treatmentAction is ReduceHumidity
>       - composition to status flowClass is Treatment
>       - composition to status authorityUse is SharedAirPath
>       - composition to status cause is selection cause
>   - All of the following conditions hold:
>     
>       - selection intent is Increase
>       - capabilities sharedHumidifierDisposition is not Ready
>       - composition to status treatmentAction is None
>       - composition to status flowClass is Off
>       - composition to status authorityUse is None
>       - composition to status cause is SelectedPathUnavailable
>   - All of the following conditions hold:
>     
>       - selection intent is Reduce
>       - capabilities sharedDehumidifierDisposition is not Ready
>       - composition to status treatmentAction is None
>       - composition to status flowClass is Off
>       - composition to status authorityUse is None
>       - composition to status cause is SelectedPathUnavailable.

##### `CASE_29_ROUTINE_COMPOSITION` — Conditional behavior

> During contract evaluation for the compute phase, if selection intent is ExchangeAir, path is Usable, and capabilities sharedBlowerDisposition is Ready, AuthoritySafePlanComposer shall set composition to status treatmentAction to ExchangeAir, composition to status flowClass to selection flowClass, composition to status authorityUse to SharedAirPath, and composition to status cause to selection cause.

### Requirements for CabinAirPriorityArbiter

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SELECTION_NONE` — Required behavior

> During contract evaluation for the initialization phase, CabinAirPriorityArbiter shall set selection to composer intent to None, selection to composer flowClass to Off, selection to composer cause to PreferenceDisabled, selection to status intent to selection to composer intent, selection to status flowClass to selection to composer flowClass, and selection to status cause to selection to composer cause.

#### Contract clauses evaluated in the compute phase

##### `SELECTION_FANOUT` — Required behavior

> During contract evaluation for the compute phase, CabinAirPriorityArbiter shall set selection to status intent to selection to composer intent, selection to status flowClass to selection to composer flowClass, and selection to status cause to selection to composer cause.

##### `CASE_17_DISABLED_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if accepted enable is Off, CabinAirPriorityArbiter shall set selection to composer intent to None, selection to composer flowClass to Off, and selection to composer cause to PreferenceDisabled.

##### `CASE_18_FILTER_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 FILTER PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - accepted enable is On
>   - At least one of the following conditions holds:
>     
>       - filter proposal proposal is Environmental
>       - filter proposal proposal is Continuous.

> When all applicability conditions are met, CabinAirPriorityArbiter shall produce a result for which all of the following conditions hold:
>
> selection to composer intent is Filter, selection to composer flowClass is Treatment, and selection to composer cause is AirTreatmentPriority.

##### `CASE_19_REDUCE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 REDUCE PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - accepted enable is On
>   - At least one of the following conditions holds:
>     
>       - filter proposal proposal is None
>       - filter proposal proposal is Unavailable
>   - humidity proposal proposal is Reduce.

> When all applicability conditions are met, CabinAirPriorityArbiter shall produce a result for which all of the following conditions hold:
>
> selection to composer intent is Reduce, selection to composer flowClass is Treatment, and selection to composer cause is HumidityTreatmentPriority.

##### `CASE_20_INCREASE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 INCREASE PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - accepted enable is On
>   - At least one of the following conditions holds:
>     
>       - filter proposal proposal is None
>       - filter proposal proposal is Unavailable
>   - humidity proposal proposal is Increase.

> When all applicability conditions are met, CabinAirPriorityArbiter shall produce a result for which all of the following conditions hold:
>
> selection to composer intent is Increase, selection to composer flowClass is Treatment, and selection to composer cause is HumidityTreatmentPriority.

##### `CASE_21_ROUTINE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 21 ROUTINE PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - accepted enable is On
>   - At least one of the following conditions holds:
>     
>       - filter proposal proposal is None
>       - filter proposal proposal is Unavailable
>   - At least one of the following conditions holds:
>     
>       - humidity proposal proposal is None
>       - humidity proposal proposal is Unavailable
>   - At least one of the following conditions holds:
>     
>       - routine proposal proposal is Low
>       - routine proposal proposal is High.

> When all applicability conditions are met, CabinAirPriorityArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - selection to composer intent is ExchangeAir
>   - selection to composer cause is None
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - routine proposal proposal is Low
>           - selection to composer flowClass is Routine
>       - All of the following conditions hold:
>         
>           - routine proposal proposal is High
>           - selection to composer flowClass is Routine.

##### `CASE_22_NO_SELECTION_CAUSE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 22 NO SELECTION CAUSE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - accepted enable is On
>   - At least one of the following conditions holds:
>     
>       - filter proposal proposal is None
>       - filter proposal proposal is Unavailable
>   - At least one of the following conditions holds:
>     
>       - humidity proposal proposal is None
>       - humidity proposal proposal is Unavailable
>   - At least one of the following conditions holds:
>     
>       - routine proposal proposal is None
>       - routine proposal proposal is Unavailable.

> When all applicability conditions are met, CabinAirPriorityArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - selection to composer intent is None
>   - selection to composer flowClass is Off
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - filter proposal cause is AuthorityInvalid
>               - humidity proposal cause is AuthorityInvalid
>               - routine proposal cause is AuthorityInvalid
>           - selection to composer cause is AuthorityInvalid
>       - All of the following conditions hold:
>         
>           - filter proposal cause is not AuthorityInvalid
>           - humidity proposal cause is not AuthorityInvalid
>           - routine proposal cause is not AuthorityInvalid
>           - At least one of the following conditions holds:
>             
>               - filter proposal cause is AirPathReserved
>               - humidity proposal cause is AirPathReserved
>               - routine proposal cause is AirPathReserved
>           - selection to composer cause is AirPathReserved
>       - All of the following conditions hold:
>         
>           - filter proposal cause is not AuthorityInvalid
>           - humidity proposal cause is not AuthorityInvalid
>           - routine proposal cause is not AuthorityInvalid
>           - filter proposal cause is not AirPathReserved
>           - humidity proposal cause is not AirPathReserved
>           - routine proposal cause is not AirPathReserved
>           - At least one of the following conditions holds:
>             
>               - filter proposal cause is EquipmentUnavailable
>               - humidity proposal cause is EquipmentUnavailable
>               - routine proposal cause is EquipmentUnavailable
>           - selection to composer cause is EquipmentUnavailable
>       - All of the following conditions hold:
>         
>           - filter proposal cause is not AuthorityInvalid
>           - humidity proposal cause is not AuthorityInvalid
>           - routine proposal cause is not AuthorityInvalid
>           - filter proposal cause is not AirPathReserved
>           - humidity proposal cause is not AirPathReserved
>           - routine proposal cause is not AirPathReserved
>           - filter proposal cause is not EquipmentUnavailable
>           - humidity proposal cause is not EquipmentUnavailable
>           - routine proposal cause is not EquipmentUnavailable
>           - At least one of the following conditions holds:
>             
>               - filter proposal cause is SelectedPathUnavailable
>               - humidity proposal cause is SelectedPathUnavailable
>               - routine proposal cause is SelectedPathUnavailable
>           - selection to composer cause is SelectedPathUnavailable
>       - All of the following conditions hold:
>         
>           - filter proposal cause is None
>           - humidity proposal cause is None
>           - routine proposal cause is None
>           - selection to composer cause is None.

### Requirements for FiltrationProposalOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_FILTER_PROPOSAL_NONE` — Required behavior

> During contract evaluation for the initialization phase, FiltrationProposalOwner shall set proposal proposal to None and proposal cause to None.

#### Contract clauses evaluated in the compute phase

##### `FILTER_PROPOSAL_TOTAL_RELATION` — Required behavior

> During contract evaluation for the compute phase, FiltrationProposalOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - accepted enable is Off
>       - proposal proposal is None
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - At least one of the following conditions holds:
>         
>           - air report gateOpen is true exactly when F is true
>           - air report evidence is Invalid
>       - proposal proposal is None
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - air report gateOpen is true exactly when T is true
>       - air report evidence is Clean
>       - accepted filterPolicy is Automatic
>       - proposal proposal is None
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - air report gateOpen is true exactly when T is true
>       - air report evidence is not Invalid
>       - At least one of the following conditions holds:
>         
>           - accepted filterPolicy is Continuous
>           - air report evidence is FilterDemand
>       - capabilities filterBlowerDisposition is not Ready
>       - proposal proposal is Unavailable
>       - proposal cause is EquipmentUnavailable
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - air report gateOpen is true exactly when T is true
>       - air report evidence is not Invalid
>       - At least one of the following conditions holds:
>         
>           - accepted filterPolicy is Continuous
>           - air report evidence is FilterDemand
>       - capabilities filterBlowerDisposition is Ready
>       - capabilities filterDisposition is not Ready
>       - proposal proposal is Unavailable
>       - proposal cause is SelectedPathUnavailable
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - air report gateOpen is true exactly when T is true
>       - air report evidence is FilterDemand
>       - accepted filterPolicy is Automatic
>       - capabilities filterBlowerDisposition is Ready
>       - capabilities filterDisposition is Ready
>       - proposal proposal is Environmental
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - air report gateOpen is true exactly when T is true
>       - air report evidence is not Invalid
>       - accepted filterPolicy is Continuous
>       - capabilities filterBlowerDisposition is Ready
>       - capabilities filterDisposition is Ready
>       - proposal proposal is Continuous
>       - proposal cause is None.

### Requirements for HumidityEvidenceRecoveryOwner

#### Contract clauses evaluated in the initialization phase

May modify: humidityTrustMemory

##### `INITIAL_HUMIDITY_TRUST_SAFE` — Required behavior

> During contract evaluation for the initialization phase, HumidityEvidenceRecoveryOwner shall set humidityTrustMemory to Trusted, report to humidity trust to Trusted, report to humidity transitionEvent to HumidityStable, report to humidity evidence to None, report to humidity gateOpen to true exactly when F is true, report to status trust to report to humidity trust, report to status transitionEvent to report to humidity transitionEvent, report to status evidence to report to humidity evidence, and report to status gateOpen to true exactly when report to humidity gateOpen is true.

#### Contract clauses evaluated in the compute phase

May modify: humidityTrustMemory

##### `HUMIDITY_REPORT_FANOUT` — Required behavior

> During contract evaluation for the compute phase, HumidityEvidenceRecoveryOwner shall set report to humidity trust to humidityTrustMemory, report to humidity evidence to evidence, report to status trust to report to humidity trust, report to status transitionEvent to report to humidity transitionEvent, report to status evidence to report to humidity evidence, and report to status gateOpen to true exactly when report to humidity gateOpen is true.

##### `CASE_11_HUMIDITY_FAULT_ENTERED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of humidityTrustMemory on entry is Trusted and evidence is Invalid, HumidityEvidenceRecoveryOwner shall set humidityTrustMemory to Quarantined, report to humidity gateOpen to true exactly when F is true, and report to humidity transitionEvent to HumidityFaultEntered.

##### `CASE_12_HUMIDITY_STABLE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of humidityTrustMemory on entry is Trusted and evidence is not Invalid, HumidityEvidenceRecoveryOwner shall set humidityTrustMemory to Trusted, report to humidity gateOpen to true exactly when T is true, and report to humidity transitionEvent to HumidityStable.

##### `CASE_13_HUMIDITY_FAULT_PERSISTS` — Conditional behavior

> During contract evaluation for the compute phase, if the value of humidityTrustMemory on entry is Quarantined and evidence is Invalid, HumidityEvidenceRecoveryOwner shall set humidityTrustMemory to Quarantined, report to humidity gateOpen to true exactly when F is true, and report to humidity transitionEvent to HumidityFaultPersists.

##### `CASE_14_HUMIDITY_RECOVERY_STARTED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of humidityTrustMemory on entry is Quarantined and evidence is not Invalid, HumidityEvidenceRecoveryOwner shall set humidityTrustMemory to Confirming, report to humidity gateOpen to true exactly when F is true, and report to humidity transitionEvent to HumidityRecoveryStarted.

##### `CASE_15_HUMIDITY_FAULT_RECURRED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of humidityTrustMemory on entry is Confirming and evidence is Invalid, HumidityEvidenceRecoveryOwner shall set humidityTrustMemory to Quarantined, report to humidity gateOpen to true exactly when F is true, and report to humidity transitionEvent to HumidityFaultRecurred.

##### `CASE_16_HUMIDITY_RECOVERED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of humidityTrustMemory on entry is Confirming and evidence is not Invalid, HumidityEvidenceRecoveryOwner shall set humidityTrustMemory to Trusted, report to humidity gateOpen to true exactly when T is true, and report to humidity transitionEvent to HumidityRecovered.

### Requirements for HumidityNeedAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HUMIDITY_EVIDENCE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, HumidityNeedAssessor shall set evidence to Invalid.

#### Contract clauses evaluated in the compute phase

##### `HUMIDITY_EVIDENCE_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, HumidityNeedAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - observation validity is Invalid
>       - evidence is Invalid
>   - All of the following conditions hold:
>     
>       - observation validity is Valid
>       - observation condition is Dry
>       - evidence is Dry
>   - All of the following conditions hold:
>     
>       - observation validity is Valid
>       - observation condition is Acceptable
>       - evidence is None
>   - All of the following conditions hold:
>     
>       - observation validity is Valid
>       - observation condition is Damp
>       - evidence is Damp.

### Requirements for HumidityProposalOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HUMIDITY_PROPOSAL_NONE` — Required behavior

> During contract evaluation for the initialization phase, HumidityProposalOwner shall set proposal proposal to None and proposal cause to None.

#### Contract clauses evaluated in the compute phase

##### `HUMIDITY_PROPOSAL_TOTAL_RELATION` — Required behavior

> During contract evaluation for the compute phase, HumidityProposalOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - accepted enable is Off
>           - accepted humidityPolicy is Disabled
>       - proposal proposal is None
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted humidityPolicy is Automatic
>       - At least one of the following conditions holds:
>         
>           - humidity report gateOpen is true exactly when F is true
>           - humidity report evidence is Invalid
>       - proposal proposal is None
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted humidityPolicy is Automatic
>       - humidity report gateOpen is true exactly when T is true
>       - humidity report evidence is None
>       - proposal proposal is None
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted humidityPolicy is Automatic
>       - humidity report gateOpen is true exactly when T is true
>       - At least one of the following conditions holds:
>         
>           - humidity report evidence is Dry
>           - humidity report evidence is Damp
>       - capabilities humidityBlowerDisposition is not Ready
>       - proposal proposal is Unavailable
>       - proposal cause is EquipmentUnavailable
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted humidityPolicy is Automatic
>       - humidity report gateOpen is true exactly when T is true
>       - humidity report evidence is Dry
>       - capabilities humidityBlowerDisposition is Ready
>       - capabilities humidifierDisposition is not Ready
>       - proposal proposal is Unavailable
>       - proposal cause is SelectedPathUnavailable
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted humidityPolicy is Automatic
>       - humidity report gateOpen is true exactly when T is true
>       - humidity report evidence is Damp
>       - capabilities humidityBlowerDisposition is Ready
>       - capabilities dehumidifierDisposition is not Ready
>       - proposal proposal is Unavailable
>       - proposal cause is SelectedPathUnavailable
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted humidityPolicy is Automatic
>       - humidity report gateOpen is true exactly when T is true
>       - humidity report evidence is Dry
>       - capabilities humidityBlowerDisposition is Ready
>       - capabilities humidifierDisposition is Ready
>       - proposal proposal is Increase
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted humidityPolicy is Automatic
>       - humidity report gateOpen is true exactly when T is true
>       - humidity report evidence is Damp
>       - capabilities humidityBlowerDisposition is Ready
>       - capabilities dehumidifierDisposition is Ready
>       - proposal proposal is Reduce
>       - proposal cause is None.

### Requirements for PreferenceRequestQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CANDIDATE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, PreferenceRequestQualifier shall set candidate candidateClass to Invalid, candidate enable to Off, candidate filterPolicy to Automatic, candidate humidityPolicy to Disabled, and candidate routineAirflow to Off.

#### Contract clauses evaluated in the compute phase

##### `QUALIFIED_PREFERENCE_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, PreferenceRequestQualifier shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - candidate enable is preference enable
>   - candidate filterPolicy is preference filterPolicy
>   - candidate humidityPolicy is preference humidityPolicy
>   - candidate routineAirflow is preference routineAirflow
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - preference validity is Invalid
>           - candidate candidateClass is Invalid
>       - All of the following conditions hold:
>         
>           - preference validity is Valid
>           - preference arrival is Held
>           - candidate candidateClass is Held
>       - All of the following conditions hold:
>         
>           - preference validity is Valid
>           - preference arrival is New
>           - preference enable is Off
>           - candidate candidateClass is FreshDisabled
>       - All of the following conditions hold:
>         
>           - preference validity is Valid
>           - preference arrival is New
>           - preference enable is On
>           - candidate candidateClass is FreshEnabled.

### Requirements for PreferenceSessionOwner

#### Contract clauses evaluated in the initialization phase

May modify: acceptedEnableMemory, acceptedFilterPolicyMemory, acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory

##### `INITIAL_ACCEPTED_PREFERENCE_DISABLED` — Required behavior

> During contract evaluation for the initialization phase, PreferenceSessionOwner shall set acceptedEnableMemory to Off, acceptedFilterPolicyMemory to Automatic, acceptedHumidityPolicyMemory to Disabled, acceptedRoutineAirflowMemory to Off, accepted to filter enable to Off, accepted to filter filterPolicy to Automatic, accepted to filter humidityPolicy to Disabled, accepted to filter routineAirflow to Off, accepted to filter preferenceEvent to AcceptedDisabled, accepted to humidity enable to accepted to filter enable, accepted to humidity filterPolicy to accepted to filter filterPolicy, accepted to humidity humidityPolicy to accepted to filter humidityPolicy, accepted to humidity routineAirflow to accepted to filter routineAirflow, accepted to humidity preferenceEvent to accepted to filter preferenceEvent, accepted to routine enable to accepted to filter enable, accepted to routine filterPolicy to accepted to filter filterPolicy, accepted to routine humidityPolicy to accepted to filter humidityPolicy, accepted to routine routineAirflow to accepted to filter routineAirflow, accepted to routine preferenceEvent to accepted to filter preferenceEvent, accepted to arbiter enable to accepted to filter enable, accepted to arbiter filterPolicy to accepted to filter filterPolicy, accepted to arbiter humidityPolicy to accepted to filter humidityPolicy, accepted to arbiter routineAirflow to accepted to filter routineAirflow, accepted to arbiter preferenceEvent to accepted to filter preferenceEvent, accepted to status enable to accepted to filter enable, accepted to status filterPolicy to accepted to filter filterPolicy, accepted to status humidityPolicy to accepted to filter humidityPolicy, accepted to status routineAirflow to accepted to filter routineAirflow, and accepted to status preferenceEvent to accepted to filter preferenceEvent.

#### Contract clauses evaluated in the compute phase

May modify: acceptedEnableMemory, acceptedFilterPolicyMemory, acceptedHumidityPolicyMemory, acceptedRoutineAirflowMemory

##### `ACCEPTED_PREFERENCE_FANOUT` — Required behavior

> During contract evaluation for the compute phase, PreferenceSessionOwner shall set accepted to filter enable to acceptedEnableMemory, accepted to filter filterPolicy to acceptedFilterPolicyMemory, accepted to filter humidityPolicy to acceptedHumidityPolicyMemory, accepted to filter routineAirflow to acceptedRoutineAirflowMemory, accepted to humidity enable to accepted to filter enable, accepted to humidity filterPolicy to accepted to filter filterPolicy, accepted to humidity humidityPolicy to accepted to filter humidityPolicy, accepted to humidity routineAirflow to accepted to filter routineAirflow, accepted to humidity preferenceEvent to accepted to filter preferenceEvent, accepted to routine enable to accepted to filter enable, accepted to routine filterPolicy to accepted to filter filterPolicy, accepted to routine humidityPolicy to accepted to filter humidityPolicy, accepted to routine routineAirflow to accepted to filter routineAirflow, accepted to routine preferenceEvent to accepted to filter preferenceEvent, accepted to arbiter enable to accepted to filter enable, accepted to arbiter filterPolicy to accepted to filter filterPolicy, accepted to arbiter humidityPolicy to accepted to filter humidityPolicy, accepted to arbiter routineAirflow to accepted to filter routineAirflow, accepted to arbiter preferenceEvent to accepted to filter preferenceEvent, accepted to status enable to accepted to filter enable, accepted to status filterPolicy to accepted to filter filterPolicy, accepted to status humidityPolicy to accepted to filter humidityPolicy, accepted to status routineAirflow to accepted to filter routineAirflow, and accepted to status preferenceEvent to accepted to filter preferenceEvent.

##### `CASE_01_REJECT_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if candidate candidateClass is Invalid, PreferenceSessionOwner shall preserve the value of acceptedEnableMemory on entry, preserve the value of acceptedFilterPolicyMemory on entry, preserve the value of acceptedHumidityPolicyMemory on entry, preserve the value of acceptedRoutineAirflowMemory on entry, and set accepted to filter preferenceEvent to RejectedInvalid.

##### `CASE_02_RETAIN_HELD` — Conditional behavior

> During contract evaluation for the compute phase, if candidate candidateClass is Held, PreferenceSessionOwner shall preserve the value of acceptedEnableMemory on entry, preserve the value of acceptedFilterPolicyMemory on entry, preserve the value of acceptedHumidityPolicyMemory on entry, preserve the value of acceptedRoutineAirflowMemory on entry, and set accepted to filter preferenceEvent to NoNewPreference.

##### `CASE_03_ACCEPT_DISABLED` — Conditional behavior

> During contract evaluation for the compute phase, if candidate candidateClass is FreshDisabled, PreferenceSessionOwner shall set acceptedEnableMemory to candidate enable, acceptedFilterPolicyMemory to candidate filterPolicy, acceptedHumidityPolicyMemory to candidate humidityPolicy, acceptedRoutineAirflowMemory to candidate routineAirflow, and accepted to filter preferenceEvent to AcceptedDisabled.

##### `CASE_04_ACCEPT_ENABLED` — Conditional behavior

> During contract evaluation for the compute phase, if candidate candidateClass is FreshEnabled, PreferenceSessionOwner shall set acceptedEnableMemory to candidate enable, acceptedFilterPolicyMemory to candidate filterPolicy, acceptedHumidityPolicyMemory to candidate humidityPolicy, acceptedRoutineAirflowMemory to candidate routineAirflow, and accepted to filter preferenceEvent to AcceptedEnabled.

### Requirements for RoutineAirflowProposalOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ROUTINE_PROPOSAL_NONE` — Required behavior

> During contract evaluation for the initialization phase, RoutineAirflowProposalOwner shall set proposal proposal to None and proposal cause to None.

#### Contract clauses evaluated in the compute phase

##### `ROUTINE_PROPOSAL_TOTAL_RELATION` — Required behavior

> During contract evaluation for the compute phase, RoutineAirflowProposalOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - accepted enable is Off
>       - proposal proposal is None
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted routineAirflow is Off
>       - proposal proposal is None
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted routineAirflow is not Off
>       - path is Untrusted
>       - proposal proposal is Unavailable
>       - proposal cause is AuthorityInvalid
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted routineAirflow is not Off
>       - path is Reserved
>       - proposal proposal is Unavailable
>       - proposal cause is AirPathReserved
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted routineAirflow is not Off
>       - path is Usable
>       - capability routineBlowerDisposition is not Ready
>       - proposal proposal is Unavailable
>       - proposal cause is EquipmentUnavailable
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted routineAirflow is Low
>       - path is Usable
>       - capability routineBlowerDisposition is Ready
>       - proposal proposal is Low
>       - proposal cause is None
>   - All of the following conditions hold:
>     
>       - accepted enable is On
>       - accepted routineAirflow is High
>       - path is Usable
>       - capability routineBlowerDisposition is Ready
>       - proposal proposal is High
>       - proposal cause is None.

### Requirements for SharedPathAuthorityAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PATH_UNTRUSTED` — Required behavior

> During contract evaluation for the initialization phase, SharedPathAuthorityAssessor shall set disposition to routine to Untrusted and disposition to composer to Untrusted.

#### Contract clauses evaluated in the compute phase

##### `PATH_DISPOSITION_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, SharedPathAuthorityAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - disposition to routine is disposition to composer
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - authority validity is Invalid
>           - disposition to routine is Untrusted
>       - All of the following conditions hold:
>         
>           - authority validity is Valid
>           - authority grant is Reserved
>           - disposition to routine is Reserved
>       - All of the following conditions hold:
>         
>           - authority validity is Valid
>           - authority grant is Granted
>           - disposition to routine is Usable.

### Requirements for StatusOutcomeReconciler

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_STATUS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, StatusOutcomeReconciler shall set supervisor status mode to Idle and supervisor status cause to PreferenceDisabled.

#### Contract clauses evaluated in the compute phase

##### `STATUS_CAUSE_PRECEDENCE` — Required behavior

> During contract evaluation for the compute phase, StatusOutcomeReconciler shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - air report transitionEvent is AirFaultEntered
>           - air report transitionEvent is AirFaultPersists
>           - air report transitionEvent is AirFaultRecurred
>       - supervisor status cause is AirObservationInvalid
>   - All of the following conditions hold:
>     
>       - air report transitionEvent is not AirFaultEntered
>       - air report transitionEvent is not AirFaultPersists
>       - air report transitionEvent is not AirFaultRecurred
>       - At least one of the following conditions holds:
>         
>           - humidity report transitionEvent is HumidityFaultEntered
>           - humidity report transitionEvent is HumidityFaultPersists
>           - humidity report transitionEvent is HumidityFaultRecurred
>       - supervisor status cause is HumidityObservationInvalid
>   - All of the following conditions hold:
>     
>       - air report transitionEvent is not AirFaultEntered
>       - air report transitionEvent is not AirFaultPersists
>       - air report transitionEvent is not AirFaultRecurred
>       - humidity report transitionEvent is not HumidityFaultEntered
>       - humidity report transitionEvent is not HumidityFaultPersists
>       - humidity report transitionEvent is not HumidityFaultRecurred
>       - air report trust is not Trusted
>       - supervisor status cause is AirRecovering
>   - All of the following conditions hold:
>     
>       - air report transitionEvent is not AirFaultEntered
>       - air report transitionEvent is not AirFaultPersists
>       - air report transitionEvent is not AirFaultRecurred
>       - humidity report transitionEvent is not HumidityFaultEntered
>       - humidity report transitionEvent is not HumidityFaultPersists
>       - humidity report transitionEvent is not HumidityFaultRecurred
>       - air report trust is Trusted
>       - humidity report trust is not Trusted
>       - supervisor status cause is HumidityRecovering
>   - All of the following conditions hold:
>     
>       - air report trust is Trusted
>       - humidity report trust is Trusted
>       - At least one of the following conditions holds:
>         
>           - composed result cause is AuthorityInvalid
>           - composed result cause is AirPathReserved
>           - composed result cause is EquipmentUnavailable
>           - composed result cause is SelectedPathUnavailable
>       - supervisor status cause is composed result cause
>   - All of the following conditions hold:
>     
>       - air report trust is Trusted
>       - humidity report trust is Trusted
>       - composed result cause is not AuthorityInvalid
>       - composed result cause is not AirPathReserved
>       - composed result cause is not EquipmentUnavailable
>       - composed result cause is not SelectedPathUnavailable
>       - accepted preferenceEvent is RejectedInvalid
>       - supervisor status cause is PreferenceRejected
>   - All of the following conditions hold:
>     
>       - air report trust is Trusted
>       - humidity report trust is Trusted
>       - composed result cause is not AuthorityInvalid
>       - composed result cause is not AirPathReserved
>       - composed result cause is not EquipmentUnavailable
>       - composed result cause is not SelectedPathUnavailable
>       - accepted preferenceEvent is not RejectedInvalid
>       - At least one of the following conditions holds:
>         
>           - selection cause is AirTreatmentPriority
>           - selection cause is HumidityTreatmentPriority
>       - supervisor status cause is selection cause
>   - All of the following conditions hold:
>     
>       - air report trust is Trusted
>       - humidity report trust is Trusted
>       - composed result cause is not AuthorityInvalid
>       - composed result cause is not AirPathReserved
>       - composed result cause is not EquipmentUnavailable
>       - composed result cause is not SelectedPathUnavailable
>       - accepted preferenceEvent is not RejectedInvalid
>       - selection cause is not AirTreatmentPriority
>       - selection cause is not HumidityTreatmentPriority
>       - accepted enable is Off
>       - supervisor status cause is PreferenceDisabled
>   - All of the following conditions hold:
>     
>       - air report trust is Trusted
>       - humidity report trust is Trusted
>       - composed result cause is not AuthorityInvalid
>       - composed result cause is not AirPathReserved
>       - composed result cause is not EquipmentUnavailable
>       - composed result cause is not SelectedPathUnavailable
>       - accepted preferenceEvent is not RejectedInvalid
>       - selection cause is not AirTreatmentPriority
>       - selection cause is not HumidityTreatmentPriority
>       - accepted enable is On
>       - supervisor status cause is None.

##### `STATUS_MODE_TOTAL_PARTITION` — Required behavior

> During contract evaluation for the compute phase, StatusOutcomeReconciler shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - selection intent is not None
>       - composed result treatmentAction is None
>       - supervisor status mode is Inhibited
>   - All of the following conditions hold:
>     
>       - selection intent is None
>       - composed result treatmentAction is None
>       - At least one of the following conditions holds:
>         
>           - air report trust is not Trusted
>           - humidity report trust is not Trusted
>       - supervisor status mode is ObservationHold
>   - All of the following conditions hold:
>     
>       - composed result treatmentAction is not None
>       - At least one of the following conditions holds:
>         
>           - air report trust is not Trusted
>           - humidity report trust is not Trusted
>           - accepted preferenceEvent is RejectedInvalid
>       - supervisor status mode is Degraded
>   - All of the following conditions hold:
>     
>       - composed result treatmentAction is not None
>       - air report trust is Trusted
>       - humidity report trust is Trusted
>       - accepted preferenceEvent is not RejectedInvalid
>       - supervisor status mode is Active
>   - All of the following conditions hold:
>     
>       - selection intent is None
>       - composed result treatmentAction is None
>       - air report trust is Trusted
>       - humidity report trust is Trusted
>       - supervisor status mode is Idle.

### Requirements for TreatmentCapabilityAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CAPABILITIES_UNTRUSTED` — Required behavior

> During contract evaluation for the initialization phase, TreatmentCapabilityAssessor shall set capability set sharedBlowerDisposition to Untrusted, capability set sharedFilterDisposition to Untrusted, capability set sharedHumidifierDisposition to Untrusted, capability set sharedDehumidifierDisposition to Untrusted, filter facts filterBlowerDisposition to Untrusted, filter facts filterDisposition to Untrusted, humidity facts humidityBlowerDisposition to Untrusted, humidity facts humidifierDisposition to Untrusted, humidity facts dehumidifierDisposition to Untrusted, and blower fact routineBlowerDisposition to Untrusted.

#### Contract clauses evaluated in the compute phase

##### `CAPABILITY_FANOUT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, TreatmentCapabilityAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Ready
>           - filter facts filterBlowerDisposition is Ready
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Failed
>           - filter facts filterBlowerDisposition is Failed
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Unknown
>           - filter facts filterBlowerDisposition is Unknown
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Untrusted
>           - filter facts filterBlowerDisposition is Untrusted
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Ready
>           - humidity facts humidityBlowerDisposition is Ready
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Failed
>           - humidity facts humidityBlowerDisposition is Failed
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Unknown
>           - humidity facts humidityBlowerDisposition is Unknown
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Untrusted
>           - humidity facts humidityBlowerDisposition is Untrusted
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Ready
>           - blower fact routineBlowerDisposition is Ready
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Failed
>           - blower fact routineBlowerDisposition is Failed
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Unknown
>           - blower fact routineBlowerDisposition is Unknown
>       - All of the following conditions hold:
>         
>           - capability set sharedBlowerDisposition is Untrusted
>           - blower fact routineBlowerDisposition is Untrusted
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - capability set sharedFilterDisposition is Ready
>           - filter facts filterDisposition is Ready
>       - All of the following conditions hold:
>         
>           - capability set sharedFilterDisposition is Failed
>           - filter facts filterDisposition is Failed
>       - All of the following conditions hold:
>         
>           - capability set sharedFilterDisposition is Unknown
>           - filter facts filterDisposition is Unknown
>       - All of the following conditions hold:
>         
>           - capability set sharedFilterDisposition is Untrusted
>           - filter facts filterDisposition is Untrusted
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - capability set sharedHumidifierDisposition is Ready
>           - humidity facts humidifierDisposition is Ready
>       - All of the following conditions hold:
>         
>           - capability set sharedHumidifierDisposition is Failed
>           - humidity facts humidifierDisposition is Failed
>       - All of the following conditions hold:
>         
>           - capability set sharedHumidifierDisposition is Unknown
>           - humidity facts humidifierDisposition is Unknown
>       - All of the following conditions hold:
>         
>           - capability set sharedHumidifierDisposition is Untrusted
>           - humidity facts humidifierDisposition is Untrusted
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - capability set sharedDehumidifierDisposition is Ready
>           - humidity facts dehumidifierDisposition is Ready
>       - All of the following conditions hold:
>         
>           - capability set sharedDehumidifierDisposition is Failed
>           - humidity facts dehumidifierDisposition is Failed
>       - All of the following conditions hold:
>         
>           - capability set sharedDehumidifierDisposition is Unknown
>           - humidity facts dehumidifierDisposition is Unknown
>       - All of the following conditions hold:
>         
>           - capability set sharedDehumidifierDisposition is Untrusted
>           - humidity facts dehumidifierDisposition is Untrusted.

##### `BLOWER_CAPABILITY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, TreatmentCapabilityAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - readiness validity is Invalid
>       - capability set sharedBlowerDisposition is Untrusted
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness blowerReadiness is Ready
>       - capability set sharedBlowerDisposition is Ready
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness blowerReadiness is Failed
>       - capability set sharedBlowerDisposition is Failed
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness blowerReadiness is Unknown
>       - capability set sharedBlowerDisposition is Unknown.

##### `FILTER_CAPABILITY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, TreatmentCapabilityAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - readiness validity is Invalid
>       - capability set sharedFilterDisposition is Untrusted
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness filterUnit is Ready
>       - capability set sharedFilterDisposition is Ready
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness filterUnit is Failed
>       - capability set sharedFilterDisposition is Failed
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness filterUnit is Unknown
>       - capability set sharedFilterDisposition is Unknown.

##### `HUMIDIFIER_CAPABILITY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, TreatmentCapabilityAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - readiness validity is Invalid
>       - capability set sharedHumidifierDisposition is Untrusted
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness humidifier is Ready
>       - capability set sharedHumidifierDisposition is Ready
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness humidifier is Failed
>       - capability set sharedHumidifierDisposition is Failed
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness humidifier is Unknown
>       - capability set sharedHumidifierDisposition is Unknown.

##### `DEHUMIDIFIER_CAPABILITY_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, TreatmentCapabilityAssessor shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - readiness validity is Invalid
>       - capability set sharedDehumidifierDisposition is Untrusted
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness dehumidifier is Ready
>       - capability set sharedDehumidifierDisposition is Ready
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness dehumidifier is Failed
>       - capability set sharedDehumidifierDisposition is Failed
>   - All of the following conditions hold:
>     
>       - readiness validity is Valid
>       - readiness dehumidifier is Unknown
>       - capability set sharedDehumidifierDisposition is Unknown.
