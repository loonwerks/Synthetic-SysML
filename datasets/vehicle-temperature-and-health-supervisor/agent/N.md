# Vehicle Temperature and Health Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: A vehicle context needs a bounded logical supervisor that converts
temperature-relative, maintenance-time, and return-to-normal evidence into one
persistent health disposition while preventing power enablement from resuming merely
because an active condition or invalid sample disappeared.

PURPOSE-01: The Vehicle Temperature and Health Supervisor shall classify finite
temperature and maintenance evidence, qualify a fresh return-to-normal indication,
select one health mode, and control a logical electrical-power disposition plus recovery
guidance. It shall not sense physical temperature, schedule maintenance, originate
return requests, or control drivetrain physics.

GOAL-01: The system shall publish exactly one health mode, one electrical-power
disposition, and one recovery-guidance value for every logical evaluation from its
finite boundary samples and pre-evaluation state.

GOAL-02: The system shall withhold logical power whenever maintenance is due,
temperature is above the selected maximum, any input evidence is invalid, or recovery is
awaiting a qualifying fresh request.

GOAL-03: The system shall give invalid or internally malformed evidence strict priority
over maintenance, maintenance strict priority over over-temperature, and both active
conditions priority over a return-to-normal request.

GOAL-04: The system shall resume the operational disposition only from clear valid
evidence combined with a fresh return-to-normal request; clearing a condition alone or
reusing a request sampled while a condition remains active shall not recover.

### Operational context and finite boundary

CTX-01: The Vehicle Temperature Context is outside the system and supplies one
temperature-relative sample per logical evaluation. It is responsible for producing the
relation to the selected maximum and for its validity status; the supervisor does not
measure temperature or own the maximum.

CTX-02: The Vehicle Maintenance Context is outside the system and supplies one
maintenance-time sample per logical evaluation. It is responsible for deciding whether
maintenance is due and for the validity of that evidence.

CTX-03: The Return-Indication Source is outside the system and supplies fresh
return-to-normal indications. The seed does not identify this source as a driver,
operator, or command authority, and this abstract makes no such attribution.

CTX-04: The Vehicle Mode Consumer is outside the system and receives the selected health
mode as logical supervisory status.

CTX-05: The Electrical Power Manager is outside the system and receives a logical power
disposition. Physical switching, delivered power, and confirmation of effect remain its
responsibility and outside this boundary.

CTX-06: The Health Status Recipient is outside the system and receives recovery
guidance. The seed does not identify a display, operator, or maintenance interface, so
the recipient remains abstract.

MON-01: `TemperatureSample` is a finite root input from CTX-01 with fields `relation :
TemperatureRelation` and `status : InputStatus`, where `TemperatureRelation` is exactly
`{AtOrBelowMaximum, AboveMaximum}` and `InputStatus` is exactly `{Valid, Invalid}`. An
invalid status makes the relation payload irrelevant.

MON-02: `MaintenanceSample` is a finite root input from CTX-02 with fields `timing :
MaintenanceTiming` and `status : InputStatus`, where `MaintenanceTiming` is exactly
`{NotDue, Due}`. An invalid status makes the timing payload irrelevant.

MON-03: `ReturnSample` is a finite root input from CTX-03 with fields `indication :
ReturnIndication` and `status : InputStatus`, where `ReturnIndication` is exactly
`{NoRequest, FreshRequest}`. An invalid status makes the indication payload irrelevant.

CTRL-01: `VehicleHealthMode` is a finite root output to CTX-04 with exactly
`{Operational, TemperatureDegraded, MaintenanceHold, Unavailable}`. These are
supervisory dispositions, not claims about achieved physical vehicle states.

CTRL-02: `ElectricalPowerDisposition` is a finite root output to CTX-05 with exactly
`{Enable, Withhold}`. `Enable` is logical permission and does not establish that
electrical power is available, switched, or delivered.

CTRL-03: `RecoveryGuidance` is a finite root output to CTX-06 with exactly `{None,
ClearActiveCondition, SubmitFreshReturnRequest, RepairInputEvidence}`.

### Evaluation, state, modes, and assumptions

MODE-01: `Operational` observably publishes CTRL-01 as `Operational`, CTRL-02 as
`Enable`, and CTRL-03 as `None`.

MODE-02: `TemperatureDegraded` observably publishes CTRL-01 as `TemperatureDegraded`,
CTRL-02 as `Withhold`, and CTRL-03 as `ClearActiveCondition` while over-temperature
evidence remains active.

MODE-03: `MaintenanceHold` observably publishes CTRL-01 as `MaintenanceHold`, CTRL-02 as
`Withhold`, and CTRL-03 as `ClearActiveCondition` while maintenance evidence remains
active.

MODE-04: `Unavailable` observably publishes CTRL-01 as `Unavailable` and CTRL-02 as
`Withhold`; CTRL-03 distinguishes invalid evidence from valid evidence awaiting a fresh
request according to OUT-01.

ASM-01: CTX-01 is responsible for comparing temperature with one stable selected maximum
during an evaluation and for treating exact equality as `AtOrBelowMaximum`. This
relation and equality rule are Designer-supplied because the seed provides neither a
numeric threshold nor its interpretation.

ASM-02: CTX-02 is responsible for the meaning and validity of `Due`; the supervisor
treats it only as current finite evidence and makes no calendar, service-interval, or
maintenance-completion claim.

ASM-03: CTX-03 is responsible for emitting `FreshRequest` for exactly one evaluation and
then at least one valid `NoRequest` before another fresh event. This pulse discipline
closes the partition without assigning command authority unsupported by the seed.

ASM-04: CTX-01 through CTX-03 each provide exactly one complete finite sample per
logical evaluation. Cross-sample arrival timing, transport, and physical synchronization
are outside scope.

ASM-05: CTX-04 through CTX-06 consume the three controlled values as logical supervisory
outputs. Physical actuation, display, acknowledgment, and effect are outside scope and
provide no feedback to this system.

### Required behavior, fault response, and recovery

RISK-01: Ignoring invalid evidence or an active maintenance/temperature condition could
logically enable power contrary to the selected policy. The claimed consequence is only
unsupported logical enablement; no physical safety severity or likelihood is asserted.

## Supporting contract definitions

### State `Vehicle_Temperature_Health_Supervisor::HealthModeArbitration::healthState`

State `healthState` has type `Vehicle_Temperature_Health_Supervisor::VehicleHealthMode`.

### `Vehicle_Temperature_Health_Supervisor::BoundaryOutcomeDerivation::acceptedProducerPair`

- Function category: Strictly pure
- Input `decision` has type `Vehicle_Temperature_Health_Supervisor::HealthDecision`.
- Input `proposal` has type `Vehicle_Temperature_Health_Supervisor::RecoveryProposal`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - `decision.nextMode` is `VehicleHealthMode.Unavailable`
>       - `decision.reason` is `DecisionReason.InvalidEvidence`
>   - All of the following conditions hold:
>     
>       - `decision.nextMode` is `VehicleHealthMode.MaintenanceHold`
>       - `decision.reason` is `DecisionReason.MaintenanceActive`
>       - At least one of the following conditions holds:
>         
>           - `proposal` is `RecoveryProposal.NotRequested`
>           - `proposal` is `RecoveryProposal.BlockedByMaintenance`
>   - All of the following conditions hold:
>     
>       - `decision.nextMode` is `VehicleHealthMode.TemperatureDegraded`
>       - `decision.reason` is `DecisionReason.TemperatureActive`
>       - At least one of the following conditions holds:
>         
>           - `proposal` is `RecoveryProposal.NotRequested`
>           - `proposal` is `RecoveryProposal.BlockedByTemperature`
>   - All of the following conditions hold:
>     
>       - `decision.nextMode` is `VehicleHealthMode.Operational`
>       - `decision.reason` is `DecisionReason.NormalRetained`
>       - `proposal` is `RecoveryProposal.NotRequested`
>   - All of the following conditions hold:
>     
>       - `decision.nextMode` is `VehicleHealthMode.Operational`
>       - `decision.reason` is `DecisionReason.RecoveryNotRequired`
>       - `proposal` is `RecoveryProposal.EligibleRecovery`
>   - All of the following conditions hold:
>     
>       - `decision.nextMode` is `VehicleHealthMode.Operational`
>       - `decision.reason` is `DecisionReason.RecoveryAccepted`
>       - `proposal` is `RecoveryProposal.EligibleRecovery`
>   - All of the following conditions hold:
>     
>       - `decision.nextMode` is not `VehicleHealthMode.Operational`
>       - `decision.reason` is `DecisionReason.FreshRecoveryRequired`
>       - `proposal` is `RecoveryProposal.NotRequested`.

### `Vehicle_Temperature_Health_Supervisor::BoundaryOutcomeDerivation::selectedMode`

- Function category: Strictly pure
- Input `decision` has type `Vehicle_Temperature_Health_Supervisor::HealthDecision`.
- Input `proposal` has type `Vehicle_Temperature_Health_Supervisor::RecoveryProposal`.
- Result type: `Vehicle_Temperature_Health_Supervisor::VehicleHealthMode`.

> The function returns the value selected as follows:
>
> **If:**
>
> the result of `acceptedProducerPair` for (`decision`, `proposal`) is true
>
> **Use:**
>
> `decision.nextMode`
>
> **Otherwise use:**
>
> `VehicleHealthMode.Unavailable`.

### `Vehicle_Temperature_Health_Supervisor::BoundaryOutcomeDerivation::selectedPower`

- Function category: Strictly pure
- Input `decision` has type `Vehicle_Temperature_Health_Supervisor::HealthDecision`.
- Input `proposal` has type `Vehicle_Temperature_Health_Supervisor::RecoveryProposal`.
- Result type: `Vehicle_Temperature_Health_Supervisor::ElectricalPowerDisposition`.

> The function returns the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - the result of `acceptedProducerPair` for (`decision`, `proposal`) is true
>   - `decision.nextMode` is `VehicleHealthMode.Operational`
>
> **Use:**
>
> `ElectricalPowerDisposition.Enable`
>
> **Otherwise use:**
>
> `ElectricalPowerDisposition.Withhold`.

### `Vehicle_Temperature_Health_Supervisor::BoundaryOutcomeDerivation::selectedGuidance`

- Function category: Strictly pure
- Input `decision` has type `Vehicle_Temperature_Health_Supervisor::HealthDecision`.
- Input `proposal` has type `Vehicle_Temperature_Health_Supervisor::RecoveryProposal`.
- Result type: `Vehicle_Temperature_Health_Supervisor::RecoveryGuidance`.

> The function returns the value selected as follows:
>
> **If:**
>
> It is not the case that:
>
> the result of `acceptedProducerPair` for (`decision`, `proposal`) is true
>
> **Use:**
>
> `RecoveryGuidance.RepairInputEvidence`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `decision.reason` is `DecisionReason.InvalidEvidence`
>
> **Use:**
>
> `RecoveryGuidance.RepairInputEvidence`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `decision.reason` is `DecisionReason.MaintenanceActive`
>   - `decision.reason` is `DecisionReason.TemperatureActive`
>
> **Use:**
>
> `RecoveryGuidance.ClearActiveCondition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `decision.reason` is `DecisionReason.FreshRecoveryRequired`
>
> **Use:**
>
> `RecoveryGuidance.SubmitFreshReturnRequest`
>
> **Otherwise use:**
>
> `RecoveryGuidance.None`.

### `Vehicle_Temperature_Health_Supervisor::HealthModeArbitration::proposalConsistent`

- Function category: Strictly pure
- Input `temperature` has type `Vehicle_Temperature_Health_Supervisor::TemperatureAssessment`.
- Input `maintenance` has type `Vehicle_Temperature_Health_Supervisor::MaintenanceAssessment`.
- Input `proposal` has type `Vehicle_Temperature_Health_Supervisor::RecoveryProposal`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - `proposal` is `RecoveryProposal.InvalidRecoveryEvidence`
>   - All of the following conditions hold:
>     
>       - `proposal` is `RecoveryProposal.NotRequested`
>       - `temperature` is not `TemperatureAssessment.InvalidTemperature`
>       - `maintenance` is not `MaintenanceAssessment.InvalidMaintenance`
>   - All of the following conditions hold:
>     
>       - `proposal` is `RecoveryProposal.BlockedByMaintenance`
>       - `temperature` is not `TemperatureAssessment.InvalidTemperature`
>       - `maintenance` is `MaintenanceAssessment.MaintenanceDue`
>   - All of the following conditions hold:
>     
>       - `proposal` is `RecoveryProposal.BlockedByTemperature`
>       - `temperature` is `TemperatureAssessment.OverTemperature`
>       - `maintenance` is `MaintenanceAssessment.MaintenanceClear`
>   - All of the following conditions hold:
>     
>       - `proposal` is `RecoveryProposal.EligibleRecovery`
>       - `temperature` is `TemperatureAssessment.NominalTemperature`
>       - `maintenance` is `MaintenanceAssessment.MaintenanceClear`.

### `Vehicle_Temperature_Health_Supervisor::MaintenanceEvidenceQualification::qualifyMaintenance`

- Function category: Strictly pure
- Input `sample` has type `Vehicle_Temperature_Health_Supervisor::MaintenanceSample`.
- Result type: `Vehicle_Temperature_Health_Supervisor::MaintenanceAssessment`.

> The function returns the value selected as follows:
>
> **If:**
>
> `sample.status` is `InputStatus.Invalid`
>
> **Use:**
>
> `MaintenanceAssessment.InvalidMaintenance`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.timing` is `MaintenanceTiming.NotDue`
>
> **Use:**
>
> `MaintenanceAssessment.MaintenanceClear`
>
> **Otherwise use:**
>
> `MaintenanceAssessment.MaintenanceDue`.

### `Vehicle_Temperature_Health_Supervisor::RecoveryApplicability::classifyRecovery`

- Function category: Strictly pure
- Input `sample` has type `Vehicle_Temperature_Health_Supervisor::ReturnSample`.
- Input `temperature` has type `Vehicle_Temperature_Health_Supervisor::TemperatureAssessment`.
- Input `maintenance` has type `Vehicle_Temperature_Health_Supervisor::MaintenanceAssessment`.
- Result type: `Vehicle_Temperature_Health_Supervisor::RecoveryProposal`.

> The function returns the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `sample.status` is `InputStatus.Invalid`
>   - `temperature` is `TemperatureAssessment.InvalidTemperature`
>   - `maintenance` is `MaintenanceAssessment.InvalidMaintenance`
>
> **Use:**
>
> `RecoveryProposal.InvalidRecoveryEvidence`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.indication` is `ReturnIndication.NoRequest`
>
> **Use:**
>
> `RecoveryProposal.NotRequested`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `maintenance` is `MaintenanceAssessment.MaintenanceDue`
>
> **Use:**
>
> `RecoveryProposal.BlockedByMaintenance`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `temperature` is `TemperatureAssessment.OverTemperature`
>
> **Use:**
>
> `RecoveryProposal.BlockedByTemperature`
>
> **Otherwise use:**
>
> `RecoveryProposal.EligibleRecovery`.

### `Vehicle_Temperature_Health_Supervisor::TemperatureEvidenceQualification::qualifyTemperature`

- Function category: Strictly pure
- Input `sample` has type `Vehicle_Temperature_Health_Supervisor::TemperatureSample`.
- Result type: `Vehicle_Temperature_Health_Supervisor::TemperatureAssessment`.

> The function returns the value selected as follows:
>
> **If:**
>
> `sample.status` is `InputStatus.Invalid`
>
> **Use:**
>
> `TemperatureAssessment.InvalidTemperature`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.relation` is `TemperatureRelation.AtOrBelowMaximum`
>
> **Use:**
>
> `TemperatureAssessment.NominalTemperature`
>
> **Otherwise use:**
>
> `TemperatureAssessment.OverTemperature`.

## Detailed behavioral requirements

### Requirements for BoundaryOutcomeDerivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BOUNDARY_HOLD` — Required behavior

> During contract evaluation for the initialization phase, BoundaryOutcomeDerivation shall set vehicleHealthMode to Unavailable, powerDisposition to Withhold, and recoveryGuidance to SubmitFreshReturnRequest.

#### Contract clauses evaluated in the compute phase

##### `DEFENSIVE_OUTCOME_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, BoundaryOutcomeDerivation shall set vehicleHealthMode to the result of BoundaryOutcomeDerivation supervisionProcess boundaryOutcomeDerivation selectedMode for (healthDecision, recoveryProposal), powerDisposition to the result of BoundaryOutcomeDerivation supervisionProcess boundaryOutcomeDerivation selectedPower for (healthDecision, recoveryProposal), and recoveryGuidance to the result of BoundaryOutcomeDerivation supervisionProcess boundaryOutcomeDerivation selectedGuidance for (healthDecision, recoveryProposal).

### Requirements for HealthModeArbitration

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OWNER_HOLD` — Required behavior

> During contract evaluation for the initialization phase, HealthModeArbitration shall set healthState to Unavailable, healthDecision nextMode to Unavailable, and healthDecision reason to InvalidEvidence.

#### Contract clauses evaluated in the compute phase

##### `COMMITTED_DECISION_MATCHES_STATE` — Required behavior

> During contract evaluation for the compute phase, HealthModeArbitration shall set healthDecision nextMode to healthState.

##### `CASE_01_INVALID_OR_MALFORMED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 01 INVALID OR MALFORMED applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - temperatureAssessment is InvalidTemperature
>   - maintenanceAssessment is InvalidMaintenance
>   - recoveryProposal is InvalidRecoveryEvidence
>   - It is not the case that:
>     
>     the result of HealthModeArbitration supervisionProcess healthModeArbitration proposalConsistent for (temperatureAssessment, maintenanceAssessment, recoveryProposal) is true.

> When all applicability conditions are met, HealthModeArbitration shall produce a result for which all of the following conditions hold:
>
> healthState is Unavailable, healthDecision nextMode is Unavailable, and healthDecision reason is InvalidEvidence.

##### `CASE_02_MAINTENANCE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 MAINTENANCE PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - temperatureAssessment is not InvalidTemperature
>   - maintenanceAssessment is MaintenanceDue
>   - recoveryProposal is not InvalidRecoveryEvidence
>   - the result of HealthModeArbitration supervisionProcess healthModeArbitration proposalConsistent for (temperatureAssessment, maintenanceAssessment, recoveryProposal) is true.

> When all applicability conditions are met, HealthModeArbitration shall produce a result for which all of the following conditions hold:
>
> healthState is MaintenanceHold, healthDecision nextMode is MaintenanceHold, and healthDecision reason is MaintenanceActive.

##### `CASE_03_TEMPERATURE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 03 TEMPERATURE PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - temperatureAssessment is OverTemperature
>   - maintenanceAssessment is MaintenanceClear
>   - recoveryProposal is not InvalidRecoveryEvidence
>   - the result of HealthModeArbitration supervisionProcess healthModeArbitration proposalConsistent for (temperatureAssessment, maintenanceAssessment, recoveryProposal) is true.

> When all applicability conditions are met, HealthModeArbitration shall produce a result for which all of the following conditions hold:
>
> healthState is TemperatureDegraded, healthDecision nextMode is TemperatureDegraded, and healthDecision reason is TemperatureActive.

##### `CASE_04_OPERATIONAL_RETAINED` — Conditional behavior

> During contract evaluation for the compute phase, if temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, recoveryProposal is NotRequested, and the value of healthState on entry is Operational, HealthModeArbitration shall set healthState to Operational, healthDecision nextMode to Operational, and healthDecision reason to NormalRetained.

##### `CASE_05_RECOVERY_NOT_REQUIRED` — Conditional behavior

> During contract evaluation for the compute phase, if temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, recoveryProposal is EligibleRecovery, and the value of healthState on entry is Operational, HealthModeArbitration shall set healthState to Operational, healthDecision nextMode to Operational, and healthDecision reason to RecoveryNotRequired.

##### `CASE_06_UNAVAILABLE_RETAINS` — Conditional behavior

> During contract evaluation for the compute phase, if temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, recoveryProposal is NotRequested, and the value of healthState on entry is Unavailable, HealthModeArbitration shall set healthState to Unavailable, healthDecision nextMode to Unavailable, and healthDecision reason to FreshRecoveryRequired.

##### `CASE_07_UNAVAILABLE_RECOVERS` — Conditional behavior

> During contract evaluation for the compute phase, if temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, recoveryProposal is EligibleRecovery, and the value of healthState on entry is Unavailable, HealthModeArbitration shall set healthState to Operational, healthDecision nextMode to Operational, and healthDecision reason to RecoveryAccepted.

##### `CASE_08_MAINTENANCE_RETAINS` — Conditional behavior

> During contract evaluation for the compute phase, if temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, recoveryProposal is NotRequested, and the value of healthState on entry is MaintenanceHold, HealthModeArbitration shall set healthState to MaintenanceHold, healthDecision nextMode to MaintenanceHold, and healthDecision reason to FreshRecoveryRequired.

##### `CASE_09_MAINTENANCE_RECOVERS` — Conditional behavior

> During contract evaluation for the compute phase, if temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, recoveryProposal is EligibleRecovery, and the value of healthState on entry is MaintenanceHold, HealthModeArbitration shall set healthState to Operational, healthDecision nextMode to Operational, and healthDecision reason to RecoveryAccepted.

##### `CASE_10_TEMPERATURE_RETAINS` — Conditional behavior

> During contract evaluation for the compute phase, if temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, recoveryProposal is NotRequested, and the value of healthState on entry is TemperatureDegraded, HealthModeArbitration shall set healthState to TemperatureDegraded, healthDecision nextMode to TemperatureDegraded, and healthDecision reason to FreshRecoveryRequired.

##### `CASE_11_TEMPERATURE_RECOVERS` — Conditional behavior

> During contract evaluation for the compute phase, if temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, recoveryProposal is EligibleRecovery, and the value of healthState on entry is TemperatureDegraded, HealthModeArbitration shall set healthState to Operational, healthDecision nextMode to Operational, and healthDecision reason to RecoveryAccepted.

### Requirements for MaintenanceEvidenceQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_MAINTENANCE_UNTRUSTED` — Required behavior

> During contract evaluation for the initialization phase, MaintenanceEvidenceQualification shall set assessmentForRecovery to InvalidMaintenance and assessmentForArbitration to InvalidMaintenance.

#### Contract clauses evaluated in the compute phase

##### `MAINTENANCE_FANOUT_PRESERVES_FACT` — Required behavior

> During contract evaluation for the compute phase, MaintenanceEvidenceQualification shall set assessmentForRecovery to assessmentForArbitration.

##### `MAINTENANCE_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if rawMaintenance status is Invalid, MaintenanceEvidenceQualification shall set assessmentForRecovery to the result of MaintenanceEvidenceQualification supervisionProcess maintenanceQualification qualifyMaintenance for (rawMaintenance) and assessmentForArbitration to the result of MaintenanceEvidenceQualification supervisionProcess maintenanceQualification qualifyMaintenance for (rawMaintenance).

##### `MAINTENANCE_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if rawMaintenance status is Valid and rawMaintenance timing is NotDue, MaintenanceEvidenceQualification shall set assessmentForRecovery to the result of MaintenanceEvidenceQualification supervisionProcess maintenanceQualification qualifyMaintenance for (rawMaintenance) and assessmentForArbitration to the result of MaintenanceEvidenceQualification supervisionProcess maintenanceQualification qualifyMaintenance for (rawMaintenance).

##### `MAINTENANCE_DUE` — Conditional behavior

> During contract evaluation for the compute phase, if rawMaintenance status is Valid and rawMaintenance timing is Due, MaintenanceEvidenceQualification shall set assessmentForRecovery to the result of MaintenanceEvidenceQualification supervisionProcess maintenanceQualification qualifyMaintenance for (rawMaintenance) and assessmentForArbitration to the result of MaintenanceEvidenceQualification supervisionProcess maintenanceQualification qualifyMaintenance for (rawMaintenance).

### Requirements for RecoveryApplicability

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RECOVERY_UNTRUSTED` — Required behavior

> During contract evaluation for the initialization phase, RecoveryApplicability shall set proposalForArbitration to InvalidRecoveryEvidence and proposalForOutcomes to InvalidRecoveryEvidence.

#### Contract clauses evaluated in the compute phase

##### `RECOVERY_FANOUT_PRESERVES_FACT` — Required behavior

> During contract evaluation for the compute phase, RecoveryApplicability shall set proposalForArbitration to proposalForOutcomes.

##### `RECOVERY_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if rawReturn status is Invalid, temperatureAssessment is InvalidTemperature, or maintenanceAssessment is InvalidMaintenance, RecoveryApplicability shall set proposalForArbitration to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment) and proposalForOutcomes to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment).

##### `RECOVERY_NOT_REQUESTED` — Conditional behavior

> During contract evaluation for the compute phase, if rawReturn status is Valid, temperatureAssessment is not InvalidTemperature, maintenanceAssessment is not InvalidMaintenance, and rawReturn indication is NoRequest, RecoveryApplicability shall set proposalForArbitration to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment) and proposalForOutcomes to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment).

##### `RECOVERY_BLOCKED_MAINTENANCE` — Conditional behavior

> During contract evaluation for the compute phase, if rawReturn status is Valid, temperatureAssessment is not InvalidTemperature, maintenanceAssessment is MaintenanceDue, and rawReturn indication is FreshRequest, RecoveryApplicability shall set proposalForArbitration to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment) and proposalForOutcomes to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment).

##### `RECOVERY_BLOCKED_TEMPERATURE` — Conditional behavior

> During contract evaluation for the compute phase, if rawReturn status is Valid, temperatureAssessment is OverTemperature, maintenanceAssessment is MaintenanceClear, and rawReturn indication is FreshRequest, RecoveryApplicability shall set proposalForArbitration to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment) and proposalForOutcomes to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment).

##### `RECOVERY_ELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if rawReturn status is Valid, temperatureAssessment is NominalTemperature, maintenanceAssessment is MaintenanceClear, and rawReturn indication is FreshRequest, RecoveryApplicability shall set proposalForArbitration to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment) and proposalForOutcomes to the result of RecoveryApplicability supervisionProcess recoveryApplicability classifyRecovery for (rawReturn, temperatureAssessment, maintenanceAssessment).

### Requirements for TemperatureEvidenceQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_TEMPERATURE_UNTRUSTED` — Required behavior

> During contract evaluation for the initialization phase, TemperatureEvidenceQualification shall set assessmentForRecovery to InvalidTemperature and assessmentForArbitration to InvalidTemperature.

#### Contract clauses evaluated in the compute phase

##### `TEMPERATURE_FANOUT_PRESERVES_FACT` — Required behavior

> During contract evaluation for the compute phase, TemperatureEvidenceQualification shall set assessmentForRecovery to assessmentForArbitration.

##### `TEMPERATURE_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if rawTemperature status is Invalid, TemperatureEvidenceQualification shall set assessmentForRecovery to the result of TemperatureEvidenceQualification supervisionProcess temperatureQualification qualifyTemperature for (rawTemperature) and assessmentForArbitration to the result of TemperatureEvidenceQualification supervisionProcess temperatureQualification qualifyTemperature for (rawTemperature).

##### `TEMPERATURE_NOMINAL` — Conditional behavior

> During contract evaluation for the compute phase, if rawTemperature status is Valid and rawTemperature relation is AtOrBelowMaximum, TemperatureEvidenceQualification shall set assessmentForRecovery to the result of TemperatureEvidenceQualification supervisionProcess temperatureQualification qualifyTemperature for (rawTemperature) and assessmentForArbitration to the result of TemperatureEvidenceQualification supervisionProcess temperatureQualification qualifyTemperature for (rawTemperature).

##### `TEMPERATURE_OVER` — Conditional behavior

> During contract evaluation for the compute phase, if rawTemperature status is Valid and rawTemperature relation is AboveMaximum, TemperatureEvidenceQualification shall set assessmentForRecovery to the result of TemperatureEvidenceQualification supervisionProcess temperatureQualification qualifyTemperature for (rawTemperature) and assessmentForArbitration to the result of TemperatureEvidenceQualification supervisionProcess temperatureQualification qualifyTemperature for (rawTemperature).
