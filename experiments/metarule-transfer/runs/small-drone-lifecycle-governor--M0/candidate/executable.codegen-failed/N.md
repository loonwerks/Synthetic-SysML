# Small Drone Lifecycle Governor

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: A configurable unmanned drone needs one bounded logical authority that turns
finite lifecycle requests and a qualitative battery report into a coherent commanded
lifecycle phase, lifecycle-enablement outcome, and pilot-visible attention status. The
modeled concern is command governance, not proof that the drone physically achieves a
requested condition.

PURPOSE-01: The Small Drone Lifecycle Governor will govern the source-named `Off`,
`Standby`, `Charging`, `Ready`, and `Flying` lifecycle vocabulary for one logical drone
boundary. It will admit only explicitly permitted transitions, use qualitative battery
awareness when charging or flight readiness is requested, place the commanded lifecycle
in `Off` after invalid input, and require neutral observation followed by a fresh
request before operation resumes.

GOAL-01: The system shall publish one unambiguous commanded phase and mutually coherent
power, charging, and flight permissions for every finite input and state combination.

GOAL-02: The system shall distinguish valid low-battery awareness from invalid input and
shall expose the distinction to the monitoring pilot without claiming physical battery
performance.

GOAL-03: The system shall prevent an invalid or previously sampled request from being
replayed as an operational transition during recovery.

GOAL-04: The system should remain small enough for complete case enumeration,
responsibility audit, trace review, and human review without count-only usages or
interactions.

### Operational context and exact system boundary

CTX-01: The Lifecycle Request Source is outside the system and supplies one request
event plus its validity status per logical evaluation. The corpus does not name this
source; introducing it is an explicit pilot abstraction and does not assign command
authority to the pilot.

CTX-02: The Battery Management Context is outside the system and supplies a qualitative
capacity indication plus validity status. The abstract neither measures charge nor
infers physical endurance.

CTX-03: The Drone Lifecycle Enactor is outside the system and receives a logical
enablement outcome. Receipt is observable at the boundary; physical execution or success
is outside scope.

CTX-04: The Pilot is outside the system and receives commanded-phase and attention
reports for monitoring. The source supports the pilot's monitoring role only; no pilot
command role is inferred.

MON-01: `LifecycleRequestSample` is a finite root input from CTX-01 with fields `event :
LifecycleEvent` and `status : InputStatus`. `LifecycleEvent` is exactly `{NoRequest,
SwitchOn, SwitchOff, BeginCharge, EndCharge, Activate, Deactivate, BeginFlight,
EndFlight}` and `InputStatus` is exactly `{Valid, Invalid}`.

MON-02: `BatterySample` is a finite root input from CTX-02 with fields `indication :
BatteryIndication` and `status : InputStatus`. `BatteryIndication` is exactly
`{Adequate, Low}`; these labels are qualitative pilot abstractions with no numeric
charge, endurance, or unit claim.

CTRL-01: `LifecycleActuation` is a finite root output to CTX-03 with fields `power :
PowerPermission`, `chargingPermitted : Boolean`, and `flightPermitted : Boolean`.
`PowerPermission` is exactly `{Disabled, StandbyEnabled, OperationalEnabled}`. These are
commanded logical permissions, not achieved physical states.

CTRL-02: `CommandedPhaseReport` is a root output to CTX-04 with exactly the
`LifecyclePhase` values `{Off, Standby, Charging, Ready, Flying}` and reports the phase
selected for the completed evaluation.

CTRL-03: `AttentionStatus` is a root output to CTX-04 with exactly `{None, LowBattery,
InputFault, RecoveryAwaitingNeutral}`. It reports the highest-priority current attention
condition and does not assert a physical hazard classification.

### Nominal, boundary, fault, and recovery behavior

RISK-01: If an invalid request or battery report were treated as trustworthy, the
governor could publish an unintended lifecycle permission. The consequence within this
logical model is an incoherent or unjustified command, not an asserted physical accident
or severity classification.

### Essential environmental assumptions and constraints

ASM-01: CTX-01 is responsible for presenting exactly one event/status pair per logical
evaluation and for presenting `NoRequest` when no event is requested. This assumption is
needed to define neutral recovery; it does not claim how an external sender detects
edges or schedules samples.

ASM-02: CTX-02 is responsible for pairing every qualitative indication with an explicit
validity status. `Adequate` and `Low` are mutually exclusive finite labels supplied to
the governor; the abstract does not define a numeric boundary or guarantee their
physical accuracy.

ASM-03: CTX-03 is responsible only for accepting CTRL-01 as a logical command interface.
The governor receives no achievement feedback, so commanded phase shall never be
described as achieved flight, completed charging, landing, or physical power state.

ASM-04: CTX-04 is responsible only for receiving CTRL-02 and CTRL-03. Monitoring does
not imply that the pilot originated requests or that any external actor acted on the
report.

## Supporting contract definitions

### State `Drone_Lifecycle_Governor::Lifecycle_Decision_Owner::current_phase`

State `current_phase` has type `Drone_Lifecycle_Governor::Lifecycle_Phase`.

### State `Drone_Lifecycle_Governor::Lifecycle_Decision_Owner::recovery_required`

State `recovery_required` has type `Base_Types::Boolean`.

## Detailed behavioral requirements

### Requirements for Attention Derivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ATTENTION_NONE` — Required behavior

> During contract evaluation for the initialization phase, Attention Derivation shall set attention status to None.

#### Contract clauses evaluated in the compute phase

##### `ATTENTION_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if decision disposition input fault detected is true exactly when T is true, Attention Derivation shall set attention status to Input Fault.

##### `ATTENTION_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if decision disposition input fault detected is true exactly when F is true and decision disposition recovery pending is true exactly when T is true, Attention Derivation shall set attention status to Recovery Awaiting Neutral.

##### `ATTENTION_LOW_BATTERY` — Conditional behavior

> During contract evaluation for the compute phase, if decision disposition input fault detected is true exactly when F is true, decision disposition recovery pending is true exactly when F is true, and battery assessment is Low Battery, Attention Derivation shall set attention status to Low Battery.

##### `ATTENTION_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if decision disposition input fault detected is true exactly when F is true, decision disposition recovery pending is true exactly when F is true, and battery assessment is not Low Battery, Attention Derivation shall set attention status to None.

### Requirements for Battery Assessment

#### Contract clauses evaluated in the initialization phase

##### `SAFE_INITIAL_BATTERY_FACT` — Required behavior

> During contract evaluation for the initialization phase, Battery Assessment shall set battery assessment to Invalid Battery.

#### Contract clauses evaluated in the compute phase

##### `BATTERY_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if raw battery status is Invalid, Battery Assessment shall set battery assessment to Invalid Battery.

##### `BATTERY_ADEQUATE` — Conditional behavior

> During contract evaluation for the compute phase, if raw battery status is Valid and raw battery indication is Adequate, Battery Assessment shall set battery assessment to Adequate Battery.

##### `BATTERY_LOW` — Conditional behavior

> During contract evaluation for the compute phase, if raw battery status is Valid and raw battery indication is Low, Battery Assessment shall set battery assessment to Low Battery.

### Requirements for Controlled Outcome Derivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ACTUATION_DISABLED` — Required behavior

> During contract evaluation for the initialization phase, Controlled Outcome Derivation shall set lifecycle actuation power to Disabled, lifecycle actuation charging permitted to true exactly when F is true, and lifecycle actuation flight permitted to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `ACTUATION_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if selected phase is Off, Controlled Outcome Derivation shall set lifecycle actuation power to Disabled, lifecycle actuation charging permitted to true exactly when F is true, and lifecycle actuation flight permitted to true exactly when F is true.

##### `ACTUATION_STANDBY` — Conditional behavior

> During contract evaluation for the compute phase, if selected phase is Standby, Controlled Outcome Derivation shall set lifecycle actuation power to Standby Enabled, lifecycle actuation charging permitted to true exactly when F is true, and lifecycle actuation flight permitted to true exactly when F is true.

##### `ACTUATION_CHARGING` — Conditional behavior

> During contract evaluation for the compute phase, if selected phase is Charging, Controlled Outcome Derivation shall set lifecycle actuation power to Operational Enabled, lifecycle actuation charging permitted to true exactly when T is true, and lifecycle actuation flight permitted to true exactly when F is true.

##### `ACTUATION_READY` — Conditional behavior

> During contract evaluation for the compute phase, if selected phase is Ready, Controlled Outcome Derivation shall set lifecycle actuation power to Operational Enabled, lifecycle actuation charging permitted to true exactly when F is true, and lifecycle actuation flight permitted to true exactly when F is true.

##### `ACTUATION_FLYING` — Conditional behavior

> During contract evaluation for the compute phase, if selected phase is Flying, Controlled Outcome Derivation shall set lifecycle actuation power to Operational Enabled, lifecycle actuation charging permitted to true exactly when F is true, and lifecycle actuation flight permitted to true exactly when T is true.

### Requirements for Lifecycle Decision Owner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OWNER_STATE_AND_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, Lifecycle Decision Owner shall set current phase to Off, recovery required to true exactly when F is true, selected phase to Off, phase report to Off, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `RECOVERY_IMPLIES_OFF` — Required behavior

> During contract evaluation for the compute phase, Lifecycle Decision Owner shall produce a result for which if recovery required is true, then current phase is Off, selected phase is current phase, and phase report is selected phase.

##### `CASE_01_INVALID_INPUT` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is Invalid Request or battery assessment is Invalid Battery, Lifecycle Decision Owner shall set current phase to Off, recovery required to true exactly when T is true, selected phase to Off, phase report to Off, decision disposition input fault detected to true exactly when T is true, and decision disposition recovery pending to true exactly when T is true.

##### `CASE_02_RECOVERY_BLOCKS_REPLAY` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when T is true, and qualified request is not No Request, Lifecycle Decision Owner shall set current phase to Off, recovery required to true exactly when T is true, selected phase to Off, phase report to Off, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when T is true.

##### `CASE_03_NEUTRAL_CLEARS_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when T is true, and qualified request is No Request, Lifecycle Decision Owner shall set current phase to Off, recovery required to true exactly when F is true, selected phase to Off, phase report to Off, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_04_SWITCH_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, and qualified request is Switch Off, Lifecycle Decision Owner shall set current phase to Off, recovery required to true exactly when F is true, selected phase to Off, phase report to Off, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_05_SWITCH_ON` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Off, and qualified request is Switch On, Lifecycle Decision Owner shall set current phase to Standby, recovery required to true exactly when F is true, selected phase to Standby, phase report to Standby, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_06_BEGIN_CHARGE` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Standby, qualified request is Begin Charge, and battery assessment is Low Battery, Lifecycle Decision Owner shall set current phase to Charging, recovery required to true exactly when F is true, selected phase to Charging, phase report to Charging, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_07_END_CHARGE` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Charging, qualified request is End Charge, and battery assessment is Adequate Battery, Lifecycle Decision Owner shall set current phase to Standby, recovery required to true exactly when F is true, selected phase to Standby, phase report to Standby, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_08_ACTIVATE` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Standby, qualified request is Activate, and battery assessment is Adequate Battery, Lifecycle Decision Owner shall set current phase to Ready, recovery required to true exactly when F is true, selected phase to Ready, phase report to Ready, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_09_BEGIN_FLIGHT` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Ready, qualified request is Begin Flight, and battery assessment is Adequate Battery, Lifecycle Decision Owner shall set current phase to Flying, recovery required to true exactly when F is true, selected phase to Flying, phase report to Flying, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_10_END_FLIGHT` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Flying, and qualified request is End Flight, Lifecycle Decision Owner shall set current phase to Ready, recovery required to true exactly when F is true, selected phase to Ready, phase report to Ready, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_11_DEACTIVATE` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, the value of current phase on entry is Ready, and qualified request is Deactivate, Lifecycle Decision Owner shall set current phase to Standby, recovery required to true exactly when F is true, selected phase to Standby, phase report to Standby, decision disposition input fault detected to true exactly when F is true, and decision disposition recovery pending to true exactly when F is true.

##### `CASE_12_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if qualified request is not Invalid Request, battery assessment is not Invalid Battery, the value of recovery required on entry is true exactly when F is true, qualified request is not Switch Off, it is not the case that the value of current phase on entry is Off and qualified request is Switch On, it is not the case that the value of current phase on entry is Standby, qualified request is Begin Charge, and battery assessment is Low Battery, it is not the case that the value of current phase on entry is Charging, qualified request is End Charge, and battery assessment is Adequate Battery, it is not the case that the value of current phase on entry is Standby, qualified request is Activate, and battery assessment is Adequate Battery, it is not the case that the value of current phase on entry is Ready, qualified request is Begin Flight, and battery assessment is Adequate Battery, it is not the case that the value of current phase on entry is Flying and qualified request is End Flight, and it is not the case that the value of current phase on entry is Ready and qualified request is Deactivate, Lifecycle Decision Owner shall preserve the value of current phase on entry, set recovery required to true exactly when F is true, set selected phase to the value of current phase on entry, set phase report to the value of current phase on entry, set decision disposition input fault detected to true exactly when F is true, and set decision disposition recovery pending to true exactly when F is true.

### Requirements for Request Qualification

#### Contract clauses evaluated in the initialization phase

##### `SAFE_INITIAL_REQUEST_FACT` — Required behavior

> During contract evaluation for the initialization phase, Request Qualification shall set qualified request to Invalid Request.

#### Contract clauses evaluated in the compute phase

##### `REQUEST_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Invalid, Request Qualification shall set qualified request to Invalid Request.

##### `REQUEST_NO_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is No Request, Request Qualification shall set qualified request to No Request.

##### `REQUEST_SWITCH_ON` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is Switch On, Request Qualification shall set qualified request to Switch On.

##### `REQUEST_SWITCH_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is Switch Off, Request Qualification shall set qualified request to Switch Off.

##### `REQUEST_BEGIN_CHARGE` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is Begin Charge, Request Qualification shall set qualified request to Begin Charge.

##### `REQUEST_END_CHARGE` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is End Charge, Request Qualification shall set qualified request to End Charge.

##### `REQUEST_ACTIVATE` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is Activate, Request Qualification shall set qualified request to Activate.

##### `REQUEST_DEACTIVATE` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is Deactivate, Request Qualification shall set qualified request to Deactivate.

##### `REQUEST_BEGIN_FLIGHT` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is Begin Flight, Request Qualification shall set qualified request to Begin Flight.

##### `REQUEST_END_FLIGHT` — Conditional behavior

> During contract evaluation for the compute phase, if raw request status is Valid and raw request 'event' is End Flight, Request Qualification shall set qualified request to End Flight.
