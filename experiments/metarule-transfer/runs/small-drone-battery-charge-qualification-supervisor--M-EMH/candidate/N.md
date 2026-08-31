# Small Drone Battery Charge Qualification Supervisor

## Selected system context

### Synopsis, need, purpose, and goals

NEED-01: A configurable unmanned drone needs a bounded logical service that qualifies
qualitative battery evidence and the immediate charging context before permitting charge
delivery, while exposing battery-related attention and flight-readiness evidence. The
need is evidence and charging qualification, not governance of the drone lifecycle.

PURPOSE-01: The Small Drone Battery Charge Qualification Supervisor will accept finite
battery, charger-availability, flight-activity, and charge-intent samples; issue a
logical charge authorization; report battery attention to the pilot; and provide
battery-readiness evidence to a flight-control context. It will inhibit authorization on
invalid evidence and require a valid neutral sample followed by a fresh intent before
authorization can resume.

GOAL-01: The system shall issue exactly one charge authorization for every finite input
and owner-state combination, permitting charge only when a fresh or retained charging
intent is supported by valid low-battery evidence, charger availability, and inactive
flight context.

GOAL-02: The system shall distinguish valid low-battery evidence from invalid evidence
and recovery gating in its pilot-visible attention output.

GOAL-03: The system shall prevent a nonneutral charge intent sampled during
invalid-input recovery from being replayed as a later authorization.

GOAL-04: The system shall publish battery-readiness evidence without commanding or
deriving any lifecycle phase, flight maneuver, or achieved charging condition.

### Operational context and exact system boundary

CTX-01: The Battery Management Context is outside the system and supplies one
qualitative battery sample per logical evaluation. It remains responsible for the sample
and status; the supervisor does not measure physical charge.

CTX-02: The Charger Interface Context is outside the system and supplies charger
availability and receives logical charge authorization. Authorization receipt is
observable at the boundary; connection, energization, and physical charging success
remain outside scope.

CTX-03: The Flight Activity Reporter is outside the system and states whether flight is
logically active for the present evaluation. This contextual observation may correspond
to the source lifecycle vocabulary, but the supervisor neither owns nor changes
lifecycle state.

CTX-04: The Charge Intent Source is outside the system and supplies begin, end, or
neutral intent. The seed does not name this initiator; this abstraction does not assign
command authority to the pilot.

CTX-05: The Pilot is outside the system and receives battery-attention status only for
monitoring.

CTX-06: The Flight-Control Evidence Consumer is outside the system and receives
battery-readiness evidence. It decides neither charge authorization nor lifecycle state
inside this boundary.

MON-01: `BatterySample` is a finite root input from CTX-01 with fields `indication :
BatteryIndication` and `status : InputStatus`, where `BatteryIndication` is exactly
`{Low, Adequate}` and `InputStatus` is exactly `{Valid, Invalid}`. The indication is
qualitative and carries no unit or numeric threshold.

MON-02: `ChargerSample` is a finite root input from CTX-02 with fields `availability :
ChargerAvailability` and `status : InputStatus`, where `ChargerAvailability` is exactly
`{Available, Unavailable}`.

MON-03: `FlightActivitySample` is a finite root input from CTX-03 with fields `activity
: FlightActivity` and `status : InputStatus`, where `FlightActivity` is exactly
`{Inactive, Active}`. It is contextual evidence, not an owned lifecycle state.

MON-04: `ChargeIntentSample` is a finite root input from CTX-04 with fields `intent :
ChargeIntent` and `status : InputStatus`, where `ChargeIntent` is exactly `{NoIntent,
BeginCharge, EndCharge}`.

CTRL-01: `ChargeAuthorization` is a finite root output to CTX-02 with exactly
`{InhibitCharge, PermitCharge}`. It is permission from this logical supervisor, not
evidence that power flowed or a battery charged.

CTRL-02: `BatteryAttention` is a finite root output to CTX-05 with exactly `{None,
LowBattery, InputFault, RecoveryPending}`.

CTRL-03: `BatteryReadinessEvidence` is a finite root output to CTX-06 with exactly
`{BatteryReady, BatteryNotReady, EvidenceUnavailable}`. It is one input to an external
flight-control decision and is not a commanded `Ready` lifecycle phase.

### Nominal, boundary, fault, and recovery behavior

RISK-01: If invalid battery, charger, flight-activity, or charge-intent evidence were
treated as trustworthy, the supervisor could issue an unjustified logical charging
permission or readiness indication. The modeled consequence is an incoherent boundary
decision, not an asserted physical accident, likelihood, or severity.

MODE-01: No external lifecycle or operational modes are declared. `recoveryPhase` is
private decision state whose effect is already observable through CTRL-01 through
CTRL-03; it shall not be modeled or counted as a drone lifecycle phase.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for providing one `BatterySample` value and explicit
validity status per logical evaluation. The selected `Low/Adequate` partition is a pilot
abstraction needed for finite review and is not a source-grounded numeric threshold.

ASM-02: CTX-02 is responsible for the truth of charger availability and its status at
the boundary. `Available` means only logically available for qualification and does not
guarantee connection or energy transfer.

ASM-03: CTX-03 is responsible for flight-activity evidence and status. `Inactive` is a
selected prerequisite for charging permission; this is pilot policy, not a claim derived
from flight physics or the source lifecycle transition rules.

ASM-04: CTX-04 is responsible for presenting `NoIntent` between a previously sampled
nonneutral intent and a fresh post-fault intent. The source supplies charging-event
vocabulary but neither this external entity nor freshness semantics.

ASM-05: All external contexts are responsible for keeping their finite values stable for
one logical evaluation. This assumption supports deterministic snapshot semantics and
makes no real-time duration claim.

## Supporting contract definitions

### State `Drone_Battery_Charge_Supervisor::Charge_Qualification_Owner::authorizationState`

State `authorizationState` has type `Drone_Battery_Charge_Supervisor::ChargeAuthorization`.

### State `Drone_Battery_Charge_Supervisor::Charge_Qualification_Owner::recoveryPhase`

State `recoveryPhase` has type `Drone_Battery_Charge_Supervisor::RecoveryPhase`.

## Detailed behavioral requirements

### Requirements for Battery Evidence Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BATTERY_EVIDENCE` — Required behavior

> During contract evaluation for the initialization phase, Battery Evidence Qualification shall set evidence to owner to InvalidBattery, evidence to attention to InvalidBattery, and evidence to readiness to InvalidBattery.

#### Contract clauses evaluated in the compute phase

##### `BATTERY_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if battery sample status is Invalid, Battery Evidence Qualification shall set evidence to owner to InvalidBattery, evidence to attention to InvalidBattery, and evidence to readiness to InvalidBattery.

##### `BATTERY_LOW` — Conditional behavior

> During contract evaluation for the compute phase, if battery sample status is Valid and battery sample indication is Low, Battery Evidence Qualification shall set evidence to owner to LowBatteryEvidence, evidence to attention to LowBatteryEvidence, and evidence to readiness to LowBatteryEvidence.

##### `BATTERY_ADEQUATE` — Conditional behavior

> During contract evaluation for the compute phase, if battery sample status is Valid and battery sample indication is Adequate, Battery Evidence Qualification shall set evidence to owner to AdequateBatteryEvidence, evidence to attention to AdequateBatteryEvidence, and evidence to readiness to AdequateBatteryEvidence.

### Requirements for Charge Context Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CHARGE_CONTEXT` — Required behavior

> During contract evaluation for the initialization phase, Charge Context Qualification shall set charge context to InvalidChargeContext.

#### Contract clauses evaluated in the compute phase

##### `CONTEXT_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if charger sample status is Invalid or flight sample status is Invalid, Charge Context Qualification shall set charge context to InvalidChargeContext.

##### `CONTEXT_FLIGHT_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if charger sample status is Valid, flight sample status is Valid, and flight sample activity is Active, Charge Context Qualification shall set charge context to FlightActiveContext.

##### `CONTEXT_AVAILABLE_INACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if charger sample status is Valid, flight sample status is Valid, flight sample activity is Inactive, and charger sample availability is Available, Charge Context Qualification shall set charge context to AvailableInactiveContext.

##### `CONTEXT_UNAVAILABLE_INACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if charger sample status is Valid, flight sample status is Valid, flight sample activity is Inactive, and charger sample availability is Unavailable, Charge Context Qualification shall set charge context to UnavailableInactiveContext.

### Requirements for Charge Intent Qualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_QUALIFIED_INTENT` — Required behavior

> During contract evaluation for the initialization phase, Charge Intent Qualification shall set qualified intent to InvalidChargeIntent.

#### Contract clauses evaluated in the compute phase

##### `INTENT_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if intent sample status is Invalid, Charge Intent Qualification shall set qualified intent to InvalidChargeIntent.

##### `INTENT_NEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if intent sample status is Valid and intent sample intent is NoIntent, Charge Intent Qualification shall set qualified intent to NoIntent.

##### `INTENT_BEGIN` — Conditional behavior

> During contract evaluation for the compute phase, if intent sample status is Valid and intent sample intent is BeginCharge, Charge Intent Qualification shall set qualified intent to BeginCharge.

##### `INTENT_END` — Conditional behavior

> During contract evaluation for the compute phase, if intent sample status is Valid and intent sample intent is EndCharge, Charge Intent Qualification shall set qualified intent to EndCharge.

### Requirements for Charge Qualification Owner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OWNER_STATE_AND_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to Normal, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to Inactive, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to Inactive.

#### Contract clauses evaluated in the compute phase

##### `RECOVERY_INHIBITS` — Required behavior

> During contract evaluation for the compute phase, Charge Qualification Owner shall produce a result for which if recoveryPhase is not Normal, then authorizationState is InhibitCharge.

##### `OWNER_PUBLICATIONS_AGREE` — Required behavior

> During contract evaluation for the compute phase, Charge Qualification Owner shall set authorization to authorizationState, decision to attention authorization to authorizationState, decision to readiness authorization to authorizationState, and decision to attention disposition to decision to readiness disposition.

##### `CASE_01_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is InvalidBattery, charge context is InvalidChargeContext, or qualified intent is InvalidChargeIntent, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to AwaitNeutral, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to InputFault, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to InputFault.

##### `CASE_02_RETAINED_NONNEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is not InvalidBattery, charge context is not InvalidChargeContext, qualified intent is not InvalidChargeIntent, the value of recoveryPhase on entry is AwaitNeutral, and qualified intent is not NoIntent, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to AwaitNeutral, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to RecoveryPending, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to RecoveryPending.

##### `CASE_03_NEUTRAL_ADVANCES_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is not InvalidBattery, charge context is not InvalidChargeContext, qualified intent is NoIntent, and the value of recoveryPhase on entry is AwaitNeutral, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to AwaitFreshIntent, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to RecoveryPending, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to RecoveryPending.

##### `CASE_04_WAIT_FOR_FRESH_INTENT` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is not InvalidBattery, charge context is not InvalidChargeContext, qualified intent is NoIntent, and the value of recoveryPhase on entry is AwaitFreshIntent, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to AwaitFreshIntent, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to RecoveryPending, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to RecoveryPending.

##### `CASE_05_FRESH_END` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is not InvalidBattery, charge context is not InvalidChargeContext, qualified intent is EndCharge, and the value of recoveryPhase on entry is AwaitFreshIntent, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to Normal, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to Inactive, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to Inactive.

##### `CASE_06_FRESH_ELIGIBLE_BEGIN` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is LowBatteryEvidence, charge context is AvailableInactiveContext, qualified intent is BeginCharge, and the value of recoveryPhase on entry is AwaitFreshIntent, Charge Qualification Owner shall set authorizationState to PermitCharge, recoveryPhase to Normal, authorization to PermitCharge, decision to attention authorization to PermitCharge, decision to attention disposition to BeginAccepted, decision to readiness authorization to PermitCharge, and decision to readiness disposition to BeginAccepted.

##### `CASE_07_FRESH_INELIGIBLE_BEGIN` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is not InvalidBattery, charge context is not InvalidChargeContext, qualified intent is BeginCharge, the value of recoveryPhase on entry is AwaitFreshIntent, and it is not the case that battery evidence is LowBatteryEvidence and charge context is AvailableInactiveContext, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to Normal, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to BeginDenied, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to BeginDenied.

##### `CASE_08_NORMAL_END` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is not InvalidBattery, charge context is not InvalidChargeContext, qualified intent is EndCharge, and the value of recoveryPhase on entry is Normal, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to Normal, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to Inactive, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to Inactive.

##### `CASE_09_NORMAL_ELIGIBLE_BEGIN` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is LowBatteryEvidence, charge context is AvailableInactiveContext, qualified intent is BeginCharge, and the value of recoveryPhase on entry is Normal, Charge Qualification Owner shall set authorizationState to PermitCharge, recoveryPhase to Normal, authorization to PermitCharge, decision to attention authorization to PermitCharge, decision to attention disposition to BeginAccepted, decision to readiness authorization to PermitCharge, and decision to readiness disposition to BeginAccepted.

##### `CASE_10_NORMAL_INELIGIBLE_BEGIN` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is not InvalidBattery, charge context is not InvalidChargeContext, qualified intent is BeginCharge, the value of recoveryPhase on entry is Normal, and it is not the case that battery evidence is LowBatteryEvidence and charge context is AvailableInactiveContext, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to Normal, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to BeginDenied, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to BeginDenied.

##### `CASE_11_RETAIN_ELIGIBLE_PERMISSION` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is LowBatteryEvidence, charge context is AvailableInactiveContext, qualified intent is NoIntent, the value of recoveryPhase on entry is Normal, and the value of authorizationState on entry is PermitCharge, Charge Qualification Owner shall set authorizationState to PermitCharge, recoveryPhase to Normal, authorization to PermitCharge, decision to attention authorization to PermitCharge, decision to attention disposition to Continued, decision to readiness authorization to PermitCharge, and decision to readiness disposition to Continued.

##### `CASE_12_REMAIN_OR_REVOKE` — Conditional behavior

> During contract evaluation for the compute phase, if battery evidence is not InvalidBattery, charge context is not InvalidChargeContext, qualified intent is NoIntent, the value of recoveryPhase on entry is Normal, and it is not the case that the value of authorizationState on entry is PermitCharge, battery evidence is LowBatteryEvidence, and charge context is AvailableInactiveContext, Charge Qualification Owner shall set authorizationState to InhibitCharge, recoveryPhase to Normal, authorization to InhibitCharge, decision to attention authorization to InhibitCharge, decision to attention disposition to Inactive, decision to readiness authorization to InhibitCharge, and decision to readiness disposition to Inactive.

### Requirements for Pilot Attention Derivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ATTENTION` — Required behavior

> During contract evaluation for the initialization phase, Pilot Attention Derivation shall set battery attention to None.

#### Contract clauses evaluated in the compute phase

##### `ATTENTION_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if charge decision disposition is InputFault, Pilot Attention Derivation shall set battery attention to InputFault.

##### `ATTENTION_RECOVERY_PENDING` — Conditional behavior

> During contract evaluation for the compute phase, if charge decision disposition is RecoveryPending, Pilot Attention Derivation shall set battery attention to RecoveryPending.

##### `ATTENTION_LOW_BATTERY` — Conditional behavior

> During contract evaluation for the compute phase, if charge decision disposition is not InputFault, charge decision disposition is not RecoveryPending, and battery evidence is LowBatteryEvidence, Pilot Attention Derivation shall set battery attention to LowBattery.

##### `ATTENTION_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if charge decision disposition is not InputFault, charge decision disposition is not RecoveryPending, and battery evidence is not LowBatteryEvidence, Pilot Attention Derivation shall set battery attention to None.

### Requirements for Readiness Evidence Derivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_READINESS` — Required behavior

> During contract evaluation for the initialization phase, Readiness Evidence Derivation shall set readiness evidence to EvidenceUnavailable.

#### Contract clauses evaluated in the compute phase

##### `READINESS_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if charge decision disposition is InputFault or charge decision disposition is RecoveryPending, Readiness Evidence Derivation shall set readiness evidence to EvidenceUnavailable.

##### `READINESS_LOW` — Conditional behavior

> During contract evaluation for the compute phase, if charge decision disposition is not InputFault, charge decision disposition is not RecoveryPending, and battery evidence is LowBatteryEvidence, Readiness Evidence Derivation shall set readiness evidence to BatteryNotReady.

##### `READINESS_ADEQUATE` — Conditional behavior

> During contract evaluation for the compute phase, if charge decision disposition is not InputFault, charge decision disposition is not RecoveryPending, and battery evidence is AdequateBatteryEvidence, Readiness Evidence Derivation shall set readiness evidence to BatteryReady.
