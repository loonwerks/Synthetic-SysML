# Cabin Air-Care Preference and Condition Supervisor

## Selected system context

### Need, purpose, scope, and goals

NEED-01: A vehicle user needs a bounded way to request automatic cabin air care or
explicit intensive filtration while invalid observations, unavailable treatment paths,
and simultaneous air-quality and humidity demands produce deterministic, explainable
results instead of stale or conflicting commands.

PURPOSE-01: The Cabin Air-Care Preference and Condition Supervisor will accept a finite
air-care preference, qualify whether it is fresh or held, assess air-quality and
excess-humidity needs, assess treatment readiness, arbitrate filtration against drying,
issue one air-treatment command, and report the result.

GOAL-01: The system shall select normal or intensive filtration when an actionable
preference and a qualified air-quality demand require it and the filter path is ready.

GOAL-02: The system shall select drying when an actionable automatic preference and
qualified excess humidity require it, the drying path is ready, and no actionable
filtration proposal has priority.

GOAL-03: The system shall emit exactly one command from `{Off, FilterNormal,
FilterIntensive, Dry}` and one mutually consistent status on every logical evaluation;
filtration and drying shall never be commanded together.

GOAL-04: Unknown treatment readiness shall force `Off` and enter a recovery hold. A
recovered active preference shall remain inhibited until the interface supplies a valid
`Off` and then a new valid active preference.

GOAL-05: Invalid requests, invalid observations, unavailable treatment paths, priority
conflicts, recovery holds, and no-treatment results shall be distinguishable in the
status without asserting that filtration or humidity control physically occurred.

### Operational context and exact system boundary

CTX-01: **Vehicle user and dashboard or central-console interface.** This entity
supplies the air-care selection and request validity and receives supervisory status. It
is responsible for presenting and encoding the finite categories, not for choosing
treatment policy.

CTX-02: **Cabin air-quality observation service.** This entity supplies a qualitative
air-quality category and independent validity. It is responsible for the asserted truth
and freshness of `Valid`; no sensor or pollutant metric is prescribed.

CTX-03: **Cabin humidity observation service.** This entity supplies a qualitative
humidity category and independent validity. It is responsible for the asserted truth and
freshness of `Valid`; no percentage or comfort threshold is prescribed.

CTX-04: **Air-treatment plant and readiness service.** This entity supplies one
readiness record and receives the selected command. It remains responsible for equipment
diagnosis, command execution, filtration, moisture removal, and physical effects.

MON-01: `AirCareSelection`, supplied by CTX-01, has the exhaustive values `{Off, Auto,
Purge}`. `Purge` is a pilot name for a user preference requesting intensive filtration,
not a claim about physical outside-air exchange.

MON-02: `RequestValidity`, supplied by CTX-01, has the exhaustive values `{Valid,
Invalid}` and qualifies MON-01 independently of the encoded selection.

MON-03: `CabinAirQuality`, supplied by CTX-02, has the exhaustive values `{Clean,
Elevated, Poor}`. These categories contain no pollutant, concentration, or health
semantics beyond the pilot mapping in CASE-AIR-01.

MON-04: `AirQualityValidity`, supplied by CTX-02, has the exhaustive values `{Valid,
Invalid}` and qualifies MON-03 independently.

MON-05: `CabinHumidity`, supplied by CTX-03, has the exhaustive values `{Dry,
Comfortable, Damp}`. Only `Damp` requests the selected drying capability; humidification
is outside the boundary.

MON-06: `HumidityValidity`, supplied by CTX-03, has the exhaustive values `{Valid,
Invalid}` and qualifies MON-05 independently.

MON-07: `TreatmentEquipmentStatus`, supplied by CTX-04, is one finite record containing
`StatusValidity={Valid,Invalid}`, `FilterPath={Ready,Unavailable}`, and
`DryingPath={Ready,Unavailable}`. Path fields are not trusted when status validity is
`Invalid`.

CTRL-01: `AirTreatmentCommand`, received by CTX-04, has the exhaustive values `{Off,
FilterNormal, FilterIntensive, Dry}`. It is a supervisory request and never evidence of
plant execution or environmental effect.

CTRL-02: `AirCareSupervisorStatus`, received by CTX-01, is one finite record containing
`StatusMode={Idle,Active,Attention,Recovery}` and
`StatusReason={None,NoTreatmentNeeded,Filtering,Drying,AirPriority,RequestInvalid,RearmRequired,AirObservationInvalid,HumidityObservationInvalid,FilterUnavailable,DryerUnavailable,ReadinessInvalid,AwaitFresh}`.

### Required behavior, risks, and fault response

RISK-01: If unknown treatment readiness were interpreted using stale path fields, the
supervisor could issue a command whose required path is unavailable or untrusted;
physical severity and likelihood are unspecified.

RISK-02: If an invalid or continuously held active preference were treated as fresh
after a request error or readiness recovery, an old user preference could replay without
re-arming; physical severity and likelihood are unspecified.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for supplying one coherent selection/validity pair per
logical evaluation. The selected valid `Off` then active sequence is a pilot re-arm
protocol, not a source-grounded interface requirement. Rationale: it makes stale-request
rejection finite and observable without adding a clock or acknowledgment input.

ASM-02: CTX-02 and CTX-03 are responsible for the asserted validity and freshness of
their classifications. Rationale: the system has no raw measurements, redundant
observations, or age value with which to verify them.

ASM-03: CTX-04 is responsible for the atomic consistency of MON-07 and for not claiming
`Valid` when either path field is stale or unknown. Rationale: `StatusValidity=Invalid`
is the only critical readiness fault modeled.

ASM-04: `Clean`, `Elevated`, `Poor`, `Dry`, `Comfortable`, and `Damp` are ordered labels
only where CASE-AIR-01 and CASE-HUM-01 say so. They have no units, numerical thresholds,
medical meaning, comfort guarantee, or universal automotive interpretation.

ASM-05: Filtration outranks drying when both proposals are actionable, while observation
invalidity and a single path unavailability remain local degradation unless MON-07
validity is invalid. Rationale: this is the selected finite policy needed to resolve one
explicit conflict; the seed provides no priority or fault classification.

ASM-06: One logical evaluation sees a coherent snapshot and same-evaluation derived
facts in the order of POLICY-03. Rationale: this closes contract semantics while
deliberately making no period, latency, scheduling, or execution claim.

## Supporting contract definitions

### State `Cabin_Air_Treatment_Supervisor::AirCareRequestLifecycleOwner::requestMemory`

State `requestMemory` has type `Cabin_Air_Treatment_Supervisor::RequestMemory`.

### State `Cabin_Air_Treatment_Supervisor::ReadinessRecoveryOwner::recoveryMemory`

State `recoveryMemory` has type `Cabin_Air_Treatment_Supervisor::RecoveryMemory`.

## Detailed behavioral requirements

### Requirements for AirCarePriorityResultArbiter

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RESULT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AirCarePriorityResultArbiter shall set airTreatmentCommand to Off, airCareSupervisorStatus mode to Idle, and airCareSupervisorStatus reason to None.

#### Contract clauses evaluated in the compute phase

##### `CASE_ARB_01_RECOVERY_DOMINATES` — Conditional behavior

> During contract evaluation for the compute phase, case CASE ARB 01 RECOVERY DOMINATES applies under all of the following conditions:
>
> recoveryGate is not Ready.

> When all applicability conditions are met, AirCarePriorityResultArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - airTreatmentCommand is Off
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recoveryGate is FaultHeld
>           - airCareSupervisorStatus mode is Recovery
>           - airCareSupervisorStatus reason is ReadinessInvalid
>       - All of the following conditions hold:
>         
>           - recoveryGate is AwaitFresh
>           - airCareSupervisorStatus mode is Recovery
>           - airCareSupervisorStatus reason is AwaitFresh.

##### `CASE_ARB_02_NONACTIONABLE_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, case CASE ARB 02 NONACTIONABLE REQUEST applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryGate is Ready
>   - At least one of the following conditions holds:
>     
>       - requestIntent is None
>       - requestIntent is BlockedInvalid
>       - requestIntent is BlockedRearm.

> When all applicability conditions are met, AirCarePriorityResultArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - airTreatmentCommand is Off
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - requestIntent is None
>           - airCareSupervisorStatus mode is Idle
>           - airCareSupervisorStatus reason is None
>       - All of the following conditions hold:
>         
>           - requestIntent is BlockedInvalid
>           - airCareSupervisorStatus mode is Attention
>           - airCareSupervisorStatus reason is RequestInvalid
>       - All of the following conditions hold:
>         
>           - requestIntent is BlockedRearm
>           - airCareSupervisorStatus mode is Attention
>           - airCareSupervisorStatus reason is RearmRequired.

##### `CASE_ARB_03_FILTRATION_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE ARB 03 FILTRATION PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryGate is Ready
>   - At least one of the following conditions holds:
>     
>       - requestIntent is FreshAuto
>       - requestIntent is HeldAuto
>       - requestIntent is FreshPurge
>       - requestIntent is HeldPurge
>   - At least one of the following conditions holds:
>     
>       - airProposal is FilterNormal
>       - airProposal is FilterIntensive.

> When all applicability conditions are met, AirCarePriorityResultArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - airCareSupervisorStatus mode is Active
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - airProposal is FilterNormal
>           - airTreatmentCommand is FilterNormal
>       - All of the following conditions hold:
>         
>           - airProposal is FilterIntensive
>           - airTreatmentCommand is FilterIntensive
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - humidityProposal is Dry
>           - airCareSupervisorStatus reason is AirPriority
>       - All of the following conditions hold:
>         
>           - humidityProposal is InvalidHumidityObservation
>           - airCareSupervisorStatus reason is HumidityObservationInvalid
>       - All of the following conditions hold:
>         
>           - humidityProposal is DryerUnavailable
>           - airCareSupervisorStatus reason is DryerUnavailable
>       - All of the following conditions hold:
>         
>           - humidityProposal is None
>           - airCareSupervisorStatus reason is Filtering.

##### `CASE_ARB_04_DRY_OR_OFF_RESIDUAL` — Conditional behavior

> During contract evaluation for the compute phase, case CASE ARB 04 DRY OR OFF RESIDUAL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recoveryGate is Ready
>   - At least one of the following conditions holds:
>     
>       - requestIntent is FreshAuto
>       - requestIntent is HeldAuto
>       - requestIntent is FreshPurge
>       - requestIntent is HeldPurge
>   - At least one of the following conditions holds:
>     
>       - airProposal is None
>       - airProposal is InvalidAirObservation
>       - airProposal is FilterUnavailable.

> When all applicability conditions are met, AirCarePriorityResultArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - airCareSupervisorStatus mode is Active
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - humidityProposal is Dry
>           - airTreatmentCommand is Dry
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - airProposal is InvalidAirObservation
>                   - airCareSupervisorStatus reason is AirObservationInvalid
>               - All of the following conditions hold:
>                 
>                   - airProposal is FilterUnavailable
>                   - airCareSupervisorStatus reason is FilterUnavailable
>               - All of the following conditions hold:
>                 
>                   - airProposal is None
>                   - airCareSupervisorStatus reason is Drying
>       - All of the following conditions hold:
>         
>           - humidityProposal is not Dry
>           - airTreatmentCommand is Off
>           - At least one of the following conditions holds:
>             
>               - All of the following conditions hold:
>                 
>                   - airProposal is InvalidAirObservation
>                   - airCareSupervisorStatus reason is AirObservationInvalid
>               - All of the following conditions hold:
>                 
>                   - airProposal is FilterUnavailable
>                   - airCareSupervisorStatus reason is FilterUnavailable
>               - All of the following conditions hold:
>                 
>                   - airProposal is None
>                   - humidityProposal is InvalidHumidityObservation
>                   - airCareSupervisorStatus reason is HumidityObservationInvalid
>               - All of the following conditions hold:
>                 
>                   - airProposal is None
>                   - humidityProposal is DryerUnavailable
>                   - airCareSupervisorStatus reason is DryerUnavailable
>               - All of the following conditions hold:
>                 
>                   - airProposal is None
>                   - humidityProposal is None
>                   - airCareSupervisorStatus reason is NoTreatmentNeeded.

### Requirements for AirCareRequestLifecycleOwner

#### Contract clauses evaluated in the initialization phase

May modify: requestMemory

##### `INITIAL_REQUEST_LIFECYCLE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AirCareRequestLifecycleOwner shall set requestMemory to Released and requestIntent to None.

#### Contract clauses evaluated in the compute phase

May modify: requestMemory

##### `CASE_RQ_01_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if requestValidity is Invalid, AirCareRequestLifecycleOwner shall set requestIntent to BlockedInvalid and requestMemory to RearmRequired.

##### `CASE_RQ_02_VALID_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if requestValidity is Valid and airCareSelection is Off, AirCareRequestLifecycleOwner shall set requestIntent to None and requestMemory to Released.

##### `CASE_RQ_03_FRESH_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE RQ 03 FRESH ACTIVE applies under all of the following conditions:
>
> requestValidity is Valid, airCareSelection is not Off, and the value of requestMemory on entry is Released.

> When all applicability conditions are met, AirCareRequestLifecycleOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - requestMemory is AcceptedActive
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - airCareSelection is Auto
>           - requestIntent is FreshAuto
>       - All of the following conditions hold:
>         
>           - airCareSelection is Purge
>           - requestIntent is FreshPurge.

##### `CASE_RQ_04_HELD_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE RQ 04 HELD ACTIVE applies under all of the following conditions:
>
> requestValidity is Valid, airCareSelection is not Off, and the value of requestMemory on entry is AcceptedActive.

> When all applicability conditions are met, AirCareRequestLifecycleOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - requestMemory is AcceptedActive
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - airCareSelection is Auto
>           - requestIntent is HeldAuto
>       - All of the following conditions hold:
>         
>           - airCareSelection is Purge
>           - requestIntent is HeldPurge.

##### `CASE_RQ_05_REARM_BLOCK` — Conditional behavior

> During contract evaluation for the compute phase, if requestValidity is Valid, airCareSelection is not Off, and the value of requestMemory on entry is RearmRequired, AirCareRequestLifecycleOwner shall set requestIntent to BlockedRearm and requestMemory to RearmRequired.

### Requirements for AirQualityQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_AIR_ASSESSMENT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AirQualityQualificationOwner shall set airAssessment to Unknown.

#### Contract clauses evaluated in the compute phase

##### `CASE_AIR_01_QUALIFICATION` — Required behavior

> During contract evaluation for the compute phase, AirQualityQualificationOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - airQualityValidity is Invalid
>       - airAssessment is Unknown
>   - All of the following conditions hold:
>     
>       - airQualityValidity is Valid
>       - cabinAirQuality is Clean
>       - airAssessment is Clear
>   - All of the following conditions hold:
>     
>       - airQualityValidity is Valid
>       - cabinAirQuality is Elevated
>       - airAssessment is FilterNormalNeeded
>   - All of the following conditions hold:
>     
>       - airQualityValidity is Valid
>       - cabinAirQuality is Poor
>       - airAssessment is FilterIntensiveNeeded.

### Requirements for FiltrationProposalOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_AIR_PROPOSAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, FiltrationProposalOwner shall set airProposal to None.

#### Contract clauses evaluated in the compute phase

##### `CASE_AIR_02_PROPOSAL_PARTITION` — Required behavior

> During contract evaluation for the compute phase, FiltrationProposalOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is None
>           - requestIntent is BlockedInvalid
>           - requestIntent is BlockedRearm
>       - airProposal is None
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshPurge
>           - requestIntent is HeldPurge
>       - At least one of the following conditions holds:
>         
>           - treatmentReadiness is FilterOnly
>           - treatmentReadiness is BothReady
>       - airProposal is FilterIntensive
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshPurge
>           - requestIntent is HeldPurge
>       - treatmentReadiness is not FilterOnly
>       - treatmentReadiness is not BothReady
>       - airProposal is FilterUnavailable
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - airAssessment is Unknown
>       - airProposal is InvalidAirObservation
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - airAssessment is Clear
>       - airProposal is None
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - airAssessment is FilterNormalNeeded
>       - At least one of the following conditions holds:
>         
>           - treatmentReadiness is FilterOnly
>           - treatmentReadiness is BothReady
>       - airProposal is FilterNormal
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - airAssessment is FilterIntensiveNeeded
>       - At least one of the following conditions holds:
>         
>           - treatmentReadiness is FilterOnly
>           - treatmentReadiness is BothReady
>       - airProposal is FilterIntensive
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - At least one of the following conditions holds:
>         
>           - airAssessment is FilterNormalNeeded
>           - airAssessment is FilterIntensiveNeeded
>       - treatmentReadiness is not FilterOnly
>       - treatmentReadiness is not BothReady
>       - airProposal is FilterUnavailable.

### Requirements for HumidityProposalOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HUMIDITY_PROPOSAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, HumidityProposalOwner shall set humidityProposal to None.

#### Contract clauses evaluated in the compute phase

##### `CASE_HUM_02_PROPOSAL_PARTITION` — Required behavior

> During contract evaluation for the compute phase, HumidityProposalOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is None
>           - requestIntent is BlockedInvalid
>           - requestIntent is BlockedRearm
>           - requestIntent is FreshPurge
>           - requestIntent is HeldPurge
>       - humidityProposal is None
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - humidityAssessment is Unknown
>       - humidityProposal is InvalidHumidityObservation
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - humidityAssessment is NoExcessHumidity
>       - humidityProposal is None
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - humidityAssessment is DryingNeeded
>       - At least one of the following conditions holds:
>         
>           - treatmentReadiness is DryerOnly
>           - treatmentReadiness is BothReady
>       - humidityProposal is Dry
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is FreshAuto
>           - requestIntent is HeldAuto
>       - humidityAssessment is DryingNeeded
>       - treatmentReadiness is not DryerOnly
>       - treatmentReadiness is not BothReady
>       - humidityProposal is DryerUnavailable.

### Requirements for HumidityQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HUMIDITY_ASSESSMENT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, HumidityQualificationOwner shall set humidityAssessment to Unknown.

#### Contract clauses evaluated in the compute phase

##### `CASE_HUM_01_QUALIFICATION` — Required behavior

> During contract evaluation for the compute phase, HumidityQualificationOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - humidityValidity is Invalid
>       - humidityAssessment is Unknown
>   - All of the following conditions hold:
>     
>       - humidityValidity is Valid
>       - cabinHumidity is Damp
>       - humidityAssessment is DryingNeeded
>   - All of the following conditions hold:
>     
>       - humidityValidity is Valid
>       - At least one of the following conditions holds:
>         
>           - cabinHumidity is Dry
>           - cabinHumidity is Comfortable
>       - humidityAssessment is NoExcessHumidity.

### Requirements for ReadinessRecoveryOwner

#### Contract clauses evaluated in the initialization phase

May modify: recoveryMemory

##### `INITIAL_RECOVERY_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ReadinessRecoveryOwner shall set recoveryMemory to Ready and recoveryGate to Ready.

#### Contract clauses evaluated in the compute phase

May modify: recoveryMemory

##### `RECOVERY_GATE_PUBLISHES_POST_STATE` — Required behavior

> During contract evaluation for the compute phase, ReadinessRecoveryOwner shall set recoveryGate to recoveryMemory.

##### `CASE_REC_01_CRITICAL_UNKNOWN` — Conditional behavior

> During contract evaluation for the compute phase, if readinessContext is CriticalUnknown, ReadinessRecoveryOwner shall set recoveryMemory to FaultHeld and recoveryGate to FaultHeld.

##### `CASE_REC_02_RECOVER_TO_AWAIT_FRESH` — Conditional behavior

> During contract evaluation for the compute phase, if readinessContext is Clear and the value of recoveryMemory on entry is FaultHeld, ReadinessRecoveryOwner shall set recoveryMemory to AwaitFresh and recoveryGate to AwaitFresh.

##### `CASE_REC_03_FRESH_REAUTHORIZATION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE REC 03 FRESH REAUTHORIZATION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - readinessContext is Clear
>   - the value of recoveryMemory on entry is AwaitFresh
>   - At least one of the following conditions holds:
>     
>       - requestIntent is FreshAuto
>       - requestIntent is FreshPurge.

> When all applicability conditions are met, ReadinessRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> recoveryMemory is Ready and recoveryGate is Ready.

##### `CASE_REC_04_RETAIN_AWAIT_FRESH` — Conditional behavior

> During contract evaluation for the compute phase, if readinessContext is Clear, the value of recoveryMemory on entry is AwaitFresh, requestIntent is not FreshAuto, and requestIntent is not FreshPurge, ReadinessRecoveryOwner shall set recoveryMemory to AwaitFresh and recoveryGate to AwaitFresh.

##### `CASE_REC_05_RETAIN_READY` — Conditional behavior

> During contract evaluation for the compute phase, if readinessContext is Clear and the value of recoveryMemory on entry is Ready, ReadinessRecoveryOwner shall set recoveryMemory to Ready and recoveryGate to Ready.

### Requirements for TreatmentReadinessQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_READINESS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, TreatmentReadinessQualificationOwner shall set treatmentReadiness to Unknown and readinessContext to CriticalUnknown.

#### Contract clauses evaluated in the compute phase

##### `CASE_EQP_01_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if treatmentEquipmentStatus statusValidity is Invalid, TreatmentReadinessQualificationOwner shall set treatmentReadiness to Unknown and readinessContext to CriticalUnknown.

##### `CASE_EQP_02_VALID_CROSS_PRODUCT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE EQP 02 VALID CROSS PRODUCT applies under all of the following conditions:
>
> treatmentEquipmentStatus statusValidity is Valid.

> When all applicability conditions are met, TreatmentReadinessQualificationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - readinessContext is Clear
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - treatmentEquipmentStatus filtrationChannel is Unavailable
>           - treatmentEquipmentStatus dryingChannel is Unavailable
>           - treatmentReadiness is NeitherReady
>       - All of the following conditions hold:
>         
>           - treatmentEquipmentStatus filtrationChannel is Ready
>           - treatmentEquipmentStatus dryingChannel is Unavailable
>           - treatmentReadiness is FilterOnly
>       - All of the following conditions hold:
>         
>           - treatmentEquipmentStatus filtrationChannel is Unavailable
>           - treatmentEquipmentStatus dryingChannel is Ready
>           - treatmentReadiness is DryerOnly
>       - All of the following conditions hold:
>         
>           - treatmentEquipmentStatus filtrationChannel is Ready
>           - treatmentEquipmentStatus dryingChannel is Ready
>           - treatmentReadiness is BothReady.
