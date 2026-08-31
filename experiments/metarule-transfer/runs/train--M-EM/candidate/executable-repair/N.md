# Energy- and Interface-Aware Cabin Climate Supervisor

## Selected system context

### Need, purpose, scope, and goals

NEED-01: A vehicle climate plant may receive simultaneous comfort and defrost demands
while its electrical interface or available energy is limited or unavailable. A bounded
supervisor is needed to choose a coherent service request, suppress unsafe replay after
loss of service authority, and explain its disposition to the user interface.

PURPOSE-01: The system shall supervise one cabin zone by qualifying comfort, visibility,
and energy context; arbitrating defrost against comfort; allocating a qualitative
resource grant; issuing one coordinated plant-command tuple; and reporting one
supervisory status.

GOAL-01: The supervisor shall never request heating and cooling simultaneously and shall
emit exactly one complete command tuple on every evaluation.

GOAL-02: The supervisor shall resolve the explicit conflict `qualified defrost demand >
qualified comfort demand` whenever service is authorized.

GOAL-03: Invalid or unavailable decision context shall produce a quiescent plant
command, and a prior command shall not resume after energy recovery until a fresh user
request is observed.

GOAL-04: Full, reduced, denied, inhibited, and invalid dispositions shall be
distinguishable in the public supervisory status without claiming that a requested
physical outcome occurred.

### Operational context and system boundary

CTX-01: The vehicle user and dashboard or central-console interface are external. They
provide the current regulation selection, defrost selection, fan preference, and a
fresh-request event and receive the supervisory status.

CTX-02: The cabin and glazing observation service is external. It provides qualitative
cabin-temperature relation and glazing condition; this abstract does not prescribe
sensors or estimation algorithms.

CTX-03: The vehicle electrical and energy context is external. It provides
electrical-interface state, qualitative power envelope, and engine-heat availability; it
remains responsible for the truth of those observations.

CTX-04: The HVAC plant is external. It receives a coordinated thermal-service, air-path,
and blower command tuple; physical actuation and environmental effects remain outside
the modeled system.

### Exact finite monitored quantities

MON-01: `ClimateRequest = {Off, Regulate}` is supplied by CTX-01. `Regulate` means the
external interface has an active temperature setting; the numeric setting itself is not
represented.

MON-02: `ThermalRelation = {Below, Within, Above, Unknown}` is supplied by CTX-02 and
classifies observed cabin temperature relative to the active setting. `Unknown` is an
explicit invalidity value.

MON-03: `DefrostRequest = {Off, On}` is supplied by CTX-01 and denotes the user's
current request, not proof of glazing condition or clearance.

MON-04: `GlazingCondition = {Clear, Obscured, Unknown}` is supplied by CTX-02. `Unknown`
is an explicit invalidity value; `Obscured` is only a pilot trigger for a defrost
service request, not a safety or physical-performance claim.

MON-05: `EnergyContext` is supplied by CTX-03 and has exactly three fields:
`ElectricalState = {Ready, Constrained, Unavailable, Unknown}`, `PowerEnvelope =
{Normal, Reduced, None, Unknown}`, and `EngineHeat = {Available, Unavailable, Unknown}`.

MON-06: `FreshRequest = {Absent, Present}` is supplied by CTX-01. `Present` is a
one-evaluation event asserting that the current climate and fan values came from a user
submission not previously consumed; it is not a level that may remain asserted.

MON-07: `FanPreference = {Auto, Low, High, Unknown}` is supplied by CTX-01. `Unknown` is
invalid only when an active command would otherwise be issued; it cannot prevent an
already-required quiescent command.

### Exact finite controlled quantities

CTRL-01: `PlantCommand` is delivered to CTX-04 as one atomic tuple with `ThermalService
= {Off, Heat, Cool}`, `AirPath = {Off, Cabin, Glazing}`, and `Blower = {Off, Low,
High}`. The tuple requests plant behavior; it does not assert physical delivery or
effect.

CTRL-02: `SupervisorStatus = {Inactive, Holding, HeatingRequested, CoolingRequested,
DefrostRequested, Limited, Inhibited, InputFault}` is delivered to CTX-01. The value
reports supervisory intent or limitation and never reports comfort, temperature
convergence, or glazing clearance as achieved.

### Essential pilot assumptions

ASM-01: CTX-01, CTX-02, and CTX-03 provide one simultaneous observation snapshot per
logical evaluation. The logical ordering is a bounded-analysis convention and makes no
physical timing, latency, or scheduling claim.

ASM-02: CTX-02 is responsible for mapping the user setting and cabin observation to
MON-02 and for mapping glazing observation to MON-04. The supervisor does not
reconstruct either classification.

ASM-03: CTX-03 is responsible for the consistency and freshness of all fields in MON-05.
`Unknown` is used whenever a required field cannot be trusted.

ASM-04: CTX-01 is responsible for asserting MON-06 only once per genuine submission and
for presenting the associated current climate and fan values in the same snapshot. A
fresh event consumed while energy is invalid or unavailable does not remain pending.

ASM-05: CTX-04 accepts the complete CTRL-01 tuple atomically and treats the all-`Off`
tuple as quiescent. No assumption is made that a nonquiescent tuple attains a physical
temperature or glazing outcome.

ASM-06: The supervisor initializes in `Inhibited`. Initial activation therefore requires
usable energy context and MON-06=`Present`; this is a selected stale-command prevention
policy, not a source fact.

ASM-07: The qualitative priority and resource rules below are experiment policy. No
unsupported severity, likelihood, energy amount, safety classification, or real-world
optimality is attached to them.

### Risks, fault behavior, and recovery

RISK-01: Loss of usable energy authority after an active request could otherwise allow a
prior heating, cooling, or defrost command to resume automatically when energy returns,
producing an unrequested plant action. No likelihood or safety severity is asserted.

RISK-02: Invalid comfort, glazing, energy, or active fan context could otherwise lead
inconsistent owners to issue contradictory or unjustified commands. No likelihood or
safety severity is asserted.

## Supporting contract definitions

### State `HVAC_Energy_Interface_Supervisor::RecoveryAuthority::recoveryState`

State `recoveryState` has type `HVAC_Energy_Interface_Supervisor::RecoveryState`.

## Detailed behavioral requirements

### Requirements for ActuationCommandCoordinator

#### Contract clauses evaluated in the initialization phase

##### `INIT_COMMAND_QUIESCENT` — Required behavior

> During contract evaluation for the initialization phase, ActuationCommandCoordinator shall set plantCommand thermalService to Off, plantCommand airPath to Off, plantCommand blower to Off, and actuationDisposition to Quiescent.

#### Contract clauses evaluated in the compute phase

##### `CASE_17_QUIESCENT_DENIED_INCONSISTENT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 17 QUIESCENT DENIED INCONSISTENT applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - serviceSelection service is Off
>   - resourceGrant is Off
>   - resourceGrant is Denied
>   - All of the following conditions hold:
>     
>       - serviceSelection service is Heat
>       - resourceGrant is not FullThermal
>       - resourceGrant is not EconomyHeat
>   - All of the following conditions hold:
>     
>       - serviceSelection service is Cool
>       - resourceGrant is not FullThermal
>   - All of the following conditions hold:
>     
>       - serviceSelection service is Defrost
>       - resourceGrant is not FullThermal
>       - resourceGrant is not EconomyHeat
>       - resourceGrant is not VentOnly.

> When all applicability conditions are met, ActuationCommandCoordinator shall produce a result for which all of the following conditions hold:
>
> plantCommand thermalService is Off, plantCommand airPath is Off, plantCommand blower is Off, if serviceSelection service is Off, then actuationDisposition is Quiescent, if serviceSelection service is not Off and resourceGrant is Denied, then actuationDisposition is Denied, and if serviceSelection service is not Off and resourceGrant is not Denied, then actuationDisposition is Inconsistent.

##### `CASE_18_ACTIVE_FAN_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 ACTIVE FAN FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - serviceSelection service is not Off
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - serviceSelection service is Heat
>           - At least one of the following conditions holds:
>             
>               - resourceGrant is FullThermal
>               - resourceGrant is EconomyHeat
>       - All of the following conditions hold:
>         
>           - serviceSelection service is Cool
>           - resourceGrant is FullThermal
>       - All of the following conditions hold:
>         
>           - serviceSelection service is Defrost
>           - At least one of the following conditions holds:
>             
>               - resourceGrant is FullThermal
>               - resourceGrant is EconomyHeat
>               - resourceGrant is VentOnly
>   - fanPreference is Unknown.

> When all applicability conditions are met, ActuationCommandCoordinator shall produce a result for which all of the following conditions hold:
>
> plantCommand thermalService is Off, plantCommand airPath is Off, plantCommand blower is Off, and actuationDisposition is InputFault.

##### `CASE_19_ACTIVE_CABIN_COMMAND` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 ACTIVE CABIN COMMAND applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - serviceSelection service is Heat
>       - serviceSelection service is Cool
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - serviceSelection service is Heat
>           - At least one of the following conditions holds:
>             
>               - resourceGrant is FullThermal
>               - resourceGrant is EconomyHeat
>       - All of the following conditions hold:
>         
>           - serviceSelection service is Cool
>           - resourceGrant is FullThermal
>   - fanPreference is not Unknown.

> When all applicability conditions are met, ActuationCommandCoordinator shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - plantCommand airPath is Cabin
>   - **If:**
>     
>     serviceSelection service is Heat
>     
>     **Then:**
>     
>     plantCommand thermalService is Heat
>   - **If:**
>     
>     serviceSelection service is Cool
>     
>     **Then:**
>     
>     plantCommand thermalService is Cool
>   - **If:**
>     
>     resourceGrant is EconomyHeat
>     
>     **Then:**
>     
>     plantCommand blower is Low
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - resourceGrant is FullThermal
>       - At least one of the following conditions holds:
>         
>           - fanPreference is Auto
>           - fanPreference is Low
>     
>     **Then:**
>     
>     plantCommand blower is Low
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - resourceGrant is FullThermal
>       - fanPreference is High
>     
>     **Then:**
>     
>     plantCommand blower is High
>   - **If:**
>     
>     resourceGrant is FullThermal
>     
>     **Then:**
>     
>     actuationDisposition is Active
>   - **If:**
>     
>     resourceGrant is EconomyHeat
>     
>     **Then:**
>     
>     actuationDisposition is LimitedActive.

##### `CASE_20_ACTIVE_DEFROST_COMMAND` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 ACTIVE DEFROST COMMAND applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - serviceSelection service is Defrost
>   - At least one of the following conditions holds:
>     
>       - resourceGrant is FullThermal
>       - resourceGrant is EconomyHeat
>       - resourceGrant is VentOnly
>   - fanPreference is not Unknown.

> When all applicability conditions are met, ActuationCommandCoordinator shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - plantCommand airPath is Glazing
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - resourceGrant is FullThermal
>       - resourceGrant is EconomyHeat
>     
>     **Then:**
>     
>     plantCommand thermalService is Heat
>   - **If:**
>     
>     resourceGrant is VentOnly
>     
>     **Then:**
>     
>     plantCommand thermalService is Off
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - resourceGrant is FullThermal
>       - At least one of the following conditions holds:
>         
>           - fanPreference is Auto
>           - fanPreference is High
>     
>     **Then:**
>     
>     plantCommand blower is High
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - resourceGrant is not FullThermal
>       - fanPreference is Low
>     
>     **Then:**
>     
>     plantCommand blower is Low
>   - **If:**
>     
>     resourceGrant is FullThermal
>     
>     **Then:**
>     
>     actuationDisposition is Active
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - resourceGrant is EconomyHeat
>       - resourceGrant is VentOnly
>     
>     **Then:**
>     
>     actuationDisposition is LimitedActive.

### Requirements for ComfortDemandQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_COMFORT_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ComfortDemandQualifier shall set comfortDemand to None.

#### Contract clauses evaluated in the compute phase

##### `QUAL_01_COMFORT_DEMAND` — Required behavior

> During contract evaluation for the compute phase, ComfortDemandQualifier shall produce a result for which if climateRequest is Off, then comfortDemand is None, if climateRequest is Regulate and thermalRelation is Unknown, then comfortDemand is Invalid, if climateRequest is Regulate and thermalRelation is Below, then comfortDemand is Heat, if climateRequest is Regulate and thermalRelation is Within, then comfortDemand is Hold, and if climateRequest is Regulate and thermalRelation is Above, then comfortDemand is Cool.

### Requirements for EnergyCapabilityQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_ENERGY_SAFE` — Required behavior

> During contract evaluation for the initialization phase, EnergyCapabilityQualifier shall set energyCapability to Invalid.

#### Contract clauses evaluated in the compute phase

##### `QUAL_03_ENERGY_CAPABILITY` — Required behavior

> During contract evaluation for the compute phase, EnergyCapabilityQualifier shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - energyContext electricalState is Unknown
>       - energyContext powerEnvelope is Unknown
>       - energyContext engineHeat is Unknown
>     
>     **Then:**
>     
>     energyCapability is Invalid
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - energyContext electricalState is not Unknown
>       - energyContext powerEnvelope is not Unknown
>       - energyContext engineHeat is not Unknown
>       - At least one of the following conditions holds:
>         
>           - energyContext electricalState is Unavailable
>           - energyContext powerEnvelope is None
>     
>     **Then:**
>     
>     energyCapability is None
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - energyContext electricalState is not Unknown
>       - energyContext powerEnvelope is not Unknown
>       - energyContext engineHeat is not Unknown
>       - energyContext electricalState is not Unavailable
>       - energyContext powerEnvelope is not None
>       - energyContext electricalState is Ready
>       - energyContext powerEnvelope is Normal
>     
>     **Then:**
>     
>     energyCapability is Full
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - energyContext electricalState is not Unknown
>       - energyContext powerEnvelope is not Unknown
>       - energyContext engineHeat is not Unknown
>       - energyContext electricalState is not Unavailable
>       - energyContext powerEnvelope is not None
>       - At least one of the following conditions holds:
>         
>           - energyContext electricalState is not Ready
>           - energyContext powerEnvelope is not Normal
>       - energyContext engineHeat is Available
>     
>     **Then:**
>     
>     energyCapability is ReducedHeat
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - energyContext electricalState is not Unknown
>       - energyContext powerEnvelope is not Unknown
>       - energyContext engineHeat is not Unknown
>       - energyContext electricalState is not Unavailable
>       - energyContext powerEnvelope is not None
>       - At least one of the following conditions holds:
>         
>           - energyContext electricalState is not Ready
>           - energyContext powerEnvelope is not Normal
>       - energyContext engineHeat is Unavailable
>     
>     **Then:**
>     
>     energyCapability is ReducedElectric.

### Requirements for RecoveryAuthority

#### Contract clauses evaluated in the initialization phase

##### `INIT_RECOVERY_INHIBITED` — Required behavior

> During contract evaluation for the initialization phase, RecoveryAuthority shall set recoveryState to Inhibited and recoveryDecision to BlockAwaitFresh.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_RECOVERY_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if energyCapability is Invalid, RecoveryAuthority shall set recoveryState to Inhibited and recoveryDecision to BlockEnergyInvalid.

##### `CASE_02_RECOVERY_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if energyCapability is None, RecoveryAuthority shall set recoveryState to Inhibited and recoveryDecision to BlockEnergyUnavailable.

##### `CASE_03_USABLE_STALE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of recoveryState on entry is Inhibited, energyCapability is not Invalid, energyCapability is not None, and freshRequest is Absent, RecoveryAuthority shall set recoveryState to Inhibited and recoveryDecision to BlockAwaitFresh.

##### `CASE_04_FRESH_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if the value of recoveryState on entry is Inhibited, energyCapability is not Invalid, energyCapability is not None, and freshRequest is Present, RecoveryAuthority shall set recoveryState to Armed and recoveryDecision to PermitRecovered.

##### `CASE_05_REMAIN_ARMED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of recoveryState on entry is Armed, energyCapability is not Invalid, and energyCapability is not None, RecoveryAuthority shall set recoveryState to Armed and recoveryDecision to Permit.

### Requirements for ResourceAllocationDecision

#### Contract clauses evaluated in the initialization phase

##### `INIT_GRANT_OFF` — Required behavior

> During contract evaluation for the initialization phase, ResourceAllocationDecision shall set resourceGrant to Off.

#### Contract clauses evaluated in the compute phase

##### `CASE_13_QUIESCENT_ALLOCATION` — Conditional behavior

> During contract evaluation for the compute phase, if serviceSelection service is Off, ResourceAllocationDecision shall set resourceGrant to Off.

##### `CASE_14_DEFROST_ALLOCATION` — Conditional behavior

> During contract evaluation for the compute phase, if serviceSelection service is Defrost, ResourceAllocationDecision shall produce a result for which if energyCapability is Full, then resourceGrant is FullThermal, if energyCapability is ReducedHeat, then resourceGrant is EconomyHeat, if energyCapability is ReducedElectric, then resourceGrant is VentOnly, and if energyCapability is None or energyCapability is Invalid, then resourceGrant is Off.

##### `CASE_15_HEATING_ALLOCATION` — Conditional behavior

> During contract evaluation for the compute phase, if serviceSelection service is Heat, ResourceAllocationDecision shall produce a result for which if energyCapability is Full, then resourceGrant is FullThermal, if energyCapability is ReducedHeat, then resourceGrant is EconomyHeat, if energyCapability is ReducedElectric, then resourceGrant is Denied, and if energyCapability is None or energyCapability is Invalid, then resourceGrant is Off.

##### `CASE_16_COOLING_ALLOCATION` — Conditional behavior

> During contract evaluation for the compute phase, if serviceSelection service is Cool, ResourceAllocationDecision shall produce a result for which if energyCapability is Full, then resourceGrant is FullThermal, if energyCapability is ReducedHeat or energyCapability is ReducedElectric, then resourceGrant is Denied, and if energyCapability is None or energyCapability is Invalid, then resourceGrant is Off.

### Requirements for ServicePriorityArbiter

#### Contract clauses evaluated in the initialization phase

##### `INIT_SELECTION_OFF` — Required behavior

> During contract evaluation for the initialization phase, ServicePriorityArbiter shall set serviceSelection service to Off and serviceSelection reason to BlockAwaitFresh.

#### Contract clauses evaluated in the compute phase

##### `CASE_06_AUTHORITY_BLOCK` — Conditional behavior

> During contract evaluation for the compute phase, if recoveryDecision is BlockEnergyInvalid, recoveryDecision is BlockEnergyUnavailable, or recoveryDecision is BlockAwaitFresh, ServicePriorityArbiter shall produce a result for which serviceSelection service is Off, if recoveryDecision is BlockEnergyInvalid, then serviceSelection reason is BlockEnergyInvalid, if recoveryDecision is BlockEnergyUnavailable, then serviceSelection reason is BlockEnergyUnavailable, and if recoveryDecision is BlockAwaitFresh, then serviceSelection reason is BlockAwaitFresh.

##### `CASE_07_QUALIFIED_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 QUALIFIED INPUT FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - recoveryDecision is Permit
>       - recoveryDecision is PermitRecovered
>   - At least one of the following conditions holds:
>     
>       - comfortDemand is Invalid
>       - visibilityDemand is Invalid.

> When all applicability conditions are met, ServicePriorityArbiter shall produce a result for which all of the following conditions hold:
>
> serviceSelection service is Off and serviceSelection reason is InvalidDemand.

##### `CASE_08_DEFROST_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 DEFROST PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - recoveryDecision is Permit
>       - recoveryDecision is PermitRecovered
>   - comfortDemand is not Invalid
>   - visibilityDemand is Required.

> When all applicability conditions are met, ServicePriorityArbiter shall produce a result for which all of the following conditions hold:
>
> serviceSelection service is Defrost and serviceSelection reason is SelectedDefrost.

##### `CASE_09_COMFORT_HEATING` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 COMFORT HEATING applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - recoveryDecision is Permit
>       - recoveryDecision is PermitRecovered
>   - visibilityDemand is None
>   - comfortDemand is Heat.

> When all applicability conditions are met, ServicePriorityArbiter shall produce a result for which all of the following conditions hold:
>
> serviceSelection service is Heat and serviceSelection reason is SelectedHeat.

##### `CASE_10_COMFORT_COOLING` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 COMFORT COOLING applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - recoveryDecision is Permit
>       - recoveryDecision is PermitRecovered
>   - visibilityDemand is None
>   - comfortDemand is Cool.

> When all applicability conditions are met, ServicePriorityArbiter shall produce a result for which all of the following conditions hold:
>
> serviceSelection service is Cool and serviceSelection reason is SelectedCool.

##### `CASE_11_TEMPERATURE_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 11 TEMPERATURE HOLD applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - recoveryDecision is Permit
>       - recoveryDecision is PermitRecovered
>   - visibilityDemand is None
>   - comfortDemand is Hold.

> When all applicability conditions are met, ServicePriorityArbiter shall produce a result for which all of the following conditions hold:
>
> serviceSelection service is Off and serviceSelection reason is TemperatureHold.

##### `CASE_12_USER_OFF` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 USER OFF applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - recoveryDecision is Permit
>       - recoveryDecision is PermitRecovered
>   - visibilityDemand is None
>   - comfortDemand is None.

> When all applicability conditions are met, ServicePriorityArbiter shall produce a result for which all of the following conditions hold:
>
> serviceSelection service is Off and serviceSelection reason is UserOff.

### Requirements for SupervisoryStatusComposer

#### Contract clauses evaluated in the initialization phase

##### `INIT_STATUS_INHIBITED` — Required behavior

> During contract evaluation for the initialization phase, SupervisoryStatusComposer shall set supervisorStatus to Inhibited.

#### Contract clauses evaluated in the compute phase

##### `STAT_01_STATUS_PRECEDENCE` — Required behavior

> During contract evaluation for the compute phase, SupervisoryStatusComposer shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - actuationDisposition is InputFault
>       - actuationDisposition is Inconsistent
>       - serviceSelection reason is InvalidDemand
>       - recoveryDecision is BlockEnergyInvalid
>     
>     **Then:**
>     
>     supervisorStatus is InputFault
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - actuationDisposition is not InputFault
>       - actuationDisposition is not Inconsistent
>       - serviceSelection reason is not InvalidDemand
>       - recoveryDecision is not BlockEnergyInvalid
>       - At least one of the following conditions holds:
>         
>           - recoveryDecision is BlockEnergyUnavailable
>           - recoveryDecision is BlockAwaitFresh
>     
>     **Then:**
>     
>     supervisorStatus is Inhibited
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - actuationDisposition is not InputFault
>       - actuationDisposition is not Inconsistent
>       - serviceSelection reason is not InvalidDemand
>       - recoveryDecision is not BlockEnergyInvalid
>       - recoveryDecision is not BlockEnergyUnavailable
>       - recoveryDecision is not BlockAwaitFresh
>       - serviceSelection reason is UserOff
>     
>     **Then:**
>     
>     supervisorStatus is Inactive
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - actuationDisposition is not InputFault
>       - actuationDisposition is not Inconsistent
>       - serviceSelection reason is not InvalidDemand
>       - recoveryDecision is not BlockEnergyInvalid
>       - recoveryDecision is not BlockEnergyUnavailable
>       - recoveryDecision is not BlockAwaitFresh
>       - serviceSelection reason is TemperatureHold
>     
>     **Then:**
>     
>     supervisorStatus is Holding
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - actuationDisposition is not InputFault
>       - actuationDisposition is not Inconsistent
>       - serviceSelection reason is not InvalidDemand
>       - recoveryDecision is not BlockEnergyInvalid
>       - recoveryDecision is not BlockEnergyUnavailable
>       - recoveryDecision is not BlockAwaitFresh
>       - serviceSelection reason is not UserOff
>       - serviceSelection reason is not TemperatureHold
>       - At least one of the following conditions holds:
>         
>           - resourceGrant is Denied
>           - resourceGrant is EconomyHeat
>           - resourceGrant is VentOnly
>     
>     **Then:**
>     
>     supervisorStatus is Limited
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - actuationDisposition is Active
>       - resourceGrant is FullThermal
>       - serviceSelection service is Heat
>     
>     **Then:**
>     
>     supervisorStatus is HeatingRequested
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - actuationDisposition is Active
>       - resourceGrant is FullThermal
>       - serviceSelection service is Cool
>     
>     **Then:**
>     
>     supervisorStatus is CoolingRequested
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - actuationDisposition is Active
>       - resourceGrant is FullThermal
>       - serviceSelection service is Defrost
>     
>     **Then:**
>     
>     supervisorStatus is DefrostRequested.

### Requirements for VisibilityDemandQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_VISIBILITY_SAFE` — Required behavior

> During contract evaluation for the initialization phase, VisibilityDemandQualifier shall set visibilityDemand to Invalid.

#### Contract clauses evaluated in the compute phase

##### `QUAL_02_VISIBILITY_DEMAND` — Required behavior

> During contract evaluation for the compute phase, VisibilityDemandQualifier shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     glazingCondition is Unknown
>     
>     **Then:**
>     
>     visibilityDemand is Invalid
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - glazingCondition is not Unknown
>       - At least one of the following conditions holds:
>         
>           - defrostRequest is On
>           - glazingCondition is Obscured
>     
>     **Then:**
>     
>     visibilityDemand is Required
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - defrostRequest is Off
>       - glazingCondition is Clear
>     
>     **Then:**
>     
>     visibilityDemand is None.
