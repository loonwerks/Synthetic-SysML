# Cabin Air-Quality and Humidity Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: Vehicle occupants need cabin air-quality and humidity supervision that requests
no treatment when user preference is unusable or environmental observations are
untrusted, yet resumes bounded service only after observation trust has been
re-established.

PURPOSE-01: The Cabin Air-Quality and Humidity Supervisor will interpret an air-care
preference, classify air-quality and humidity need, guard recovery from invalid
environmental observations, issue one coordinated air-treatment directive, and report
the supervisory outcome.

GOAL-01: When automatic air care is validly selected and environmental observations are
trusted, the system shall request filtration for polluted air at target humidity and
shall request the selected combined humidity-and-filtration treatment for low or high
humidity.

GOAL-02: The system shall request standby for a valid `Off` preference, an invalid
preference, either invalid environmental observation, the first fully valid confirmation
after an observation fault or startup, or an internally inconsistent trusted-assessment
combination.

GOAL-03: After either environmental observation is invalid, the system shall require one
complete logical observation in which both environmental observations are valid before a
following complete valid observation may resume treatment; no user release or fresh
preference edge is required.

GOAL-04: The system shall distinguish user-off, standby, filtering, humidifying,
dehumidifying, preference-fault, input-fault, and recovery-confirmation outcomes without
asserting physical treatment success.

### Operational context and exact system boundary

CTX-01: **Vehicle user and dashboard/central-console interface.** This entity supplies
the air-care preference and its validity and receives the supervisory status. The
interface owns presentation and encoding; the modeled system does not assess
intuitiveness or interaction count.

CTX-02: **Cabin air-quality observation source.** This entity supplies an
acceptable-or-polluted classification and independent validity. It is responsible for
the truthfulness and freshness represented by `Valid`; the abstract does not prescribe
sensing or pollutant thresholds.

CTX-03: **Cabin humidity observation source.** This entity supplies a low-target-high
classification and independent validity. It is responsible for the truthfulness and
freshness represented by `Valid`; the abstract does not prescribe a humidity sensor or
numeric bands.

CTX-04: **Downstream cabin air-treatment equipment.** This entity receives the finite
treatment directive. It owns implementation, resource use, actuation, and physical
outcome; no delivery feedback crosses this selected boundary.

MON-01: **AirCarePreference**, supplied by CTX-01, has the exhaustive values `{Off,
Auto}` and no unit. It is level-sensitive rather than an event request.

MON-02: **PreferenceValidity**, supplied by CTX-01, has the exhaustive values `{Valid,
Invalid}` and independently qualifies MON-01.

MON-03: **CabinAirQuality**, supplied by CTX-02, has the exhaustive values `{Acceptable,
Polluted}` and no numeric concentration implication.

MON-04: **AirQualityValidity**, supplied by CTX-02, has the exhaustive values `{Valid,
Invalid}` and independently qualifies MON-03.

MON-05: **CabinHumidityBand**, supplied by CTX-03, has the exhaustive values `{Low,
Target, High}` and no unit or numeric threshold implication.

MON-06: **HumidityValidity**, supplied by CTX-03, has the exhaustive values `{Valid,
Invalid}` and independently qualifies MON-05.

CTRL-01: **AirTreatmentDirective**, received by CTX-04, has the exhaustive values
`{Standby, Filter, HumidifyWithFilter, DehumidifyWithFilter}`. It is a supervisory
request, not evidence of physical treatment.

CTRL-02: **AirCareStatus**, received by CTX-01, has the exhaustive values `{Off,
Standby, Filtering, Humidifying, Dehumidifying, PreferenceFault, InputFault,
Recovering}`.

### Required behavior and objective verification criteria

RISK-01: If treatment were requested from an encoded air-quality or humidity class whose
validity is invalid, downstream equipment could act on untrusted supervisory evidence;
repeated alternation between invalid and valid evidence could also cause immediate
restart without demonstrated clean continuity. FAULT-01 provides the fail-standby
mitigation and REC-01 through REC-02 provide the continuity-preserving recovery
mitigation.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for supplying exactly one MON-01 and MON-02 value per
logical observation and using `Invalid` whenever it cannot stand behind the encoded
preference. **Rationale:** separate validity prevents an unusable interface value from
being interpreted as either `Off` or `Auto`.

ASM-02: CTX-02 is responsible for supplying exactly one MON-03 and MON-04 value per
logical observation and using `Invalid` whenever its acceptable-or-polluted
classification is untrustworthy or stale. **Rationale:** the source provides no
pollutant observation or validity semantics; this finite classification is a pilot
assumption required for exhaustive supervision.

ASM-03: CTX-03 is responsible for supplying exactly one MON-05 and MON-06 value per
logical observation and using `Invalid` whenever its low-target-high classification is
untrustworthy or stale. **Rationale:** the source supplies humidity vocabulary but no
numeric thresholds or validity semantics.

ASM-04: CTX-04 is responsible for interpreting exactly one CTRL-01 value as a
supervisory request. No assumption that it executes the request or achieves a physical
outcome is needed for model acceptance. **Rationale:** execution and cabin physics are
outside the boundary.

ASM-05: Successive logical observations are coherent enough that one complete known
observation can serve as confirmation, while no duration or physical sampling-rate claim
is made. **Rationale:** this is the selected bounded recovery abstraction, not a
production timing requirement.

ASM-06: `HumidifyWithFilter` and `DehumidifyWithFilter` are available abstract
downstream request categories. **Rationale:** combining humidity treatment with
filtration is a pilot coordination choice grounded only by the seed's separate
air-filtration and humidity-control capabilities.

## Supporting contract definitions

### State `Cabin_Air_Care_Supervisor::ObservationConfidenceGuardian::confidenceMode`

State `confidenceMode` has type `Cabin_Air_Care_Supervisor::ConfidenceMode`.

## Detailed behavioral requirements

### Requirements for AirCarePolicySupervisor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_POLICY_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, AirCarePolicySupervisor shall set airTreatmentDirective to Standby and airCareStatus to Recovering.

#### Contract clauses evaluated in the compute phase

##### `CC_08_DISABLED` — Conditional behavior

> During contract evaluation for the compute phase, if airCareIntent is Disabled, AirCarePolicySupervisor shall set airTreatmentDirective to Standby and airCareStatus to Off.

##### `CC_09_INVALID_PREFERENCE` — Conditional behavior

> During contract evaluation for the compute phase, if airCareIntent is Invalid, AirCarePolicySupervisor shall set airTreatmentDirective to Standby and airCareStatus to PreferenceFault.

##### `CC_10_CONFIDENCE_MASK` — Conditional behavior

> During contract evaluation for the compute phase, if airCareIntent is Enabled and measurementConfidence is not Trusted, AirCarePolicySupervisor shall produce a result for which if measurementConfidence is BlockedInvalid, then airTreatmentDirective is Standby and airCareStatus is InputFault and if measurementConfidence is Confirming, then airTreatmentDirective is Standby and airCareStatus is Recovering.

##### `CC_11_DEFENSIVE_INCONSISTENCY` — Conditional behavior

> During contract evaluation for the compute phase, case CC 11 DEFENSIVE INCONSISTENCY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - airCareIntent is Enabled
>   - measurementConfidence is Trusted
>   - At least one of the following conditions holds:
>     
>       - airAssessment is Unknown
>       - humidityAssessment is Unknown.

> When all applicability conditions are met, AirCarePolicySupervisor shall produce a result for which all of the following conditions hold:
>
> airTreatmentDirective is Standby and airCareStatus is InputFault.

##### `CC_12_TRUSTED_TREATMENT` — Conditional behavior

> During contract evaluation for the compute phase, if airCareIntent is Enabled, measurementConfidence is Trusted, airAssessment is not Unknown, and humidityAssessment is not Unknown, AirCarePolicySupervisor shall produce a result for which if humidityAssessment is AddMoisture, then airTreatmentDirective is HumidifyWithFilter and airCareStatus is Humidifying, if humidityAssessment is RemoveMoisture, then airTreatmentDirective is DehumidifyWithFilter and airCareStatus is Dehumidifying, if humidityAssessment is AtTarget and airAssessment is FilterNeeded, then airTreatmentDirective is Filter and airCareStatus is Filtering, and if humidityAssessment is AtTarget and airAssessment is Acceptable, then airTreatmentDirective is Standby and airCareStatus is Standby.

### Requirements for AirQualityAssessor

#### Contract clauses evaluated in the compute phase

##### `CC_03_AIR_ASSESSMENT` — Conditional behavior

> During contract evaluation for the compute phase, AirQualityAssessor shall produce a result for which if airQualityValidity is Invalid, then airAssessment is Unknown, if airQualityValidity is Valid and cabinAirQuality is Acceptable, then airAssessment is Acceptable, and if airQualityValidity is Valid and cabinAirQuality is Polluted, then airAssessment is FilterNeeded.

### Requirements for HumidityAssessor

#### Contract clauses evaluated in the compute phase

##### `CC_04_HUMIDITY_ASSESSMENT` — Conditional behavior

> During contract evaluation for the compute phase, HumidityAssessor shall produce a result for which if humidityValidity is Invalid, then humidityAssessment is Unknown, if humidityValidity is Valid and cabinHumidityBand is Low, then humidityAssessment is AddMoisture, if humidityValidity is Valid and cabinHumidityBand is Target, then humidityAssessment is AtTarget, and if humidityValidity is Valid and cabinHumidityBand is High, then humidityAssessment is RemoveMoisture.

### Requirements for ObservationConfidenceGuardian

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CONFIDENCE` — Required behavior

> During contract evaluation for the initialization phase, ObservationConfidenceGuardian shall set confidenceMode to ConfirmationNeeded and measurementConfidence to Confirming.

#### Contract clauses evaluated in the compute phase

##### `CC_05_INVALID_OBSERVATION` — Conditional behavior

> During contract evaluation for the compute phase, if airAssessment is Unknown or humidityAssessment is Unknown, ObservationConfidenceGuardian shall set measurementConfidence to BlockedInvalid and confidenceMode to ConfirmationNeeded.

##### `CC_06_CLEAN_CONFIRMATION` — Conditional behavior

> During contract evaluation for the compute phase, if airAssessment is not Unknown, humidityAssessment is not Unknown, and the value of confidenceMode on entry is ConfirmationNeeded, ObservationConfidenceGuardian shall set measurementConfidence to Confirming and confidenceMode to Trusted.

##### `CC_07_TRUSTED_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if airAssessment is not Unknown, humidityAssessment is not Unknown, and the value of confidenceMode on entry is Trusted, ObservationConfidenceGuardian shall set measurementConfidence to Trusted and confidenceMode to Trusted.

### Requirements for PreferenceInterpreter

#### Contract clauses evaluated in the compute phase

##### `CC_01_INVALID_PREFERENCE` — Conditional behavior

> During contract evaluation for the compute phase, if preferenceValidity is Invalid, PreferenceInterpreter shall set airCareIntent to Invalid.

##### `CC_02_VALID_PREFERENCE` — Conditional behavior

> During contract evaluation for the compute phase, if preferenceValidity is Valid, PreferenceInterpreter shall produce a result for which if airCarePreference is Off, then airCareIntent is Disabled and if airCarePreference is Auto, then airCareIntent is Enabled.
