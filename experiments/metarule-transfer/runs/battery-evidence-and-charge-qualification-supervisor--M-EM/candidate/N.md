# Battery Evidence and Charge Qualification Supervisor

## Selected system context

### Need, purpose, goals, and operating context

NEED-01: A logical drone needs a bounded supervisory function that turns qualitative
battery evidence, charger-path observations, charge requests, and contextual lifecycle
information into explicit battery-readiness evidence, low-battery notification, and
qualified logical charging permission without controlling drone lifecycle.

PURPOSE-01: The Battery Evidence and Charge Qualification Supervisor shall qualify
battery evidence, determine whether a charge request is presently applicable, arbitrate
cancellation and revocation against fresh requests, retain a logical charge-permission
session, and publish battery-awareness outcomes to a pilot and flight-control recipient.

GOAL-01: The system shall never report battery readiness as ready when the battery
status check is invalid or the qualitative capacity indication is low.

GOAL-02: The system shall enable logical charge permission only after an eligible fresh
request and shall revoke it when battery evidence, charger availability, or lifecycle
context ceases to satisfy the selected qualification policy.

GOAL-03: The system shall provide distinct pilot and flight-control battery-awareness
results while making no physical charging, endurance, flight-dynamics, or safety claim.

### Scope and system boundary

CTX-01: The Pilot supplies at most one charge request per logical evaluation and
receives a consolidated battery status. The pilot is source-grounded as a battery
observer; assigning this actor a charge-request role is a pilot abstraction and does not
establish real command authority.

CTX-02: The Battery-Management Source supplies a qualitative capacity indication and an
independent status-check result; it does not expose a percentage, rate, endurance
estimate, or physical fault diagnosis.

CTX-03: The Charger Interface supplies connection and observed-activity indications and
receives logical charge permission. The permission is an authorization category, not
proof that electrical charging starts or stops.

CTX-04: The Lifecycle-Status Source supplies the source-named lifecycle value only as
context for charging applicability and notices; this system neither owns nor changes
that lifecycle value.

CTX-05: The Flight-Control Recipient receives battery-readiness advice and a battery
notice; neither output authorizes flight or commands a maneuver.

### Exact finite boundary inputs

MON-01: `batteryCapacity : BatteryCapacityBand` is supplied by `CTX-02` and has exactly
`{LOW, USABLE}`; it is qualitative and unitless.

MON-02: `batteryCheck : BatteryCheck` is supplied by `CTX-02` and has exactly `{INVALID,
VALID}`; `INVALID` makes the simultaneous capacity band unavailable as evidence.

MON-03: `chargerConnection : ChargerConnection` is supplied by `CTX-03` and has exactly
`{DISCONNECTED, CONNECTED}`.

MON-04: `chargeActivity : ChargeActivity` is supplied by `CTX-03` and has exactly
`{INACTIVE, ACTIVE}`; it is a logical observation and carries no electrical magnitude.

MON-05: `lifecycleContext : LifecycleContext` is supplied by `CTX-04` and has exactly
`{OFF, STANDBY, CHARGING, READY, FLYING}`; it is contextual input, never principal
state.

MON-06: `chargeRequest : ChargeRequest` is supplied by `CTX-01` and has exactly
`{NO_REQUEST, REQUEST_CHARGE, CANCEL_CHARGE}`.

### Exact finite controlled outputs

CTRL-01: `chargePermission : ChargePermission` is delivered to `CTX-03` and has exactly
`{DISABLED, ENABLED}`; only the logical permission is controlled.

CTRL-02: `batteryReadinessAdvice : BatteryReadinessAdvice` is delivered to `CTX-05` and
has exactly `{UNAVAILABLE, NOT_READY, READY}`; it is battery evidence only, not total
flight readiness or flight authorization.

CTRL-03: `flightControlBatteryNotice : FlightControlBatteryNotice` is delivered to
`CTX-05` and has exactly `{CLEAR, LOW_BATTERY, LOW_IN_FLIGHT_CONTEXT,
EVIDENCE_UNAVAILABLE}`; the contextual distinction is not a hazard-severity
classification.

The pilot-session and pilot-disposition fields use the distinct classifiers in
`TYPE-10`; their literals and meanings remain extensionally identical to `TYPE-06` and
the disposition domain in `TYPE-07`. This is semantic status, not a display layout.

### Risks and logical mitigations within the claim boundary

RISK-01: Treating invalid battery evidence as adequate could publish ready evidence or
retain charge permission contrary to selected policy; cases 01, 07, 10, 15, and 19
mitigate this logical inconsistency without asserting physical safety.

RISK-02: Ignoring charger loss or contextual inapplicability could retain logical
permission after a qualification premise disappears; cases 11–12 and 15–18 revoke
permission and require fresh re-entry.

RISK-03: Honoring cancellation, recovery, and a fresh request simultaneously could
produce contradictory outcomes; `PRI-01`, the single arbiter, and the single state owner
select exactly one result.

RISK-04: Treating an `ACTIVE` observation as proof of authorized charging could conflate
external behavior with controlled permission; case 20 reports activity without
permission while case 18 determines permission only from session state.

### Essential assumptions and constraints

ASM-01: `CTX-01` supplies exactly one finite request per evaluation and is responsible
for choosing its value; the abstract does not authenticate the pilot or establish actual
command authority.

ASM-02: `CTX-02` supplies both battery fields and is responsible only for domain-valid
enum values; no accuracy, independence, latency, or physical-fault guarantee is assumed.

ASM-03: `CTX-03` supplies connection and activity independently and is responsible only
for valid enum values; disconnection overrides activity for path qualification, and
neither observation proves electrical behavior.

ASM-04: `CTX-04` supplies a current lifecycle label but retains all lifecycle-state
authority. The selected policy permits charge requests only in `STANDBY` or `CHARGING`;
this is a pilot abstraction, not a seed fact.

ASM-05: `currentChargeSession` in `INT-14` denotes the pre-evaluation committed state.
The state owner publishes `currentChargeSession == In(committedChargeSession)`,
initializes state and outputs, computes from pre-state, and commits only post-state; the
root and support Process shall not duplicate this relation.

## Supporting contract definitions

### State `Battery_Evidence_Charge_Qualification_Supervisor::ChargeSessionController::committedChargeSession`

State `committedChargeSession` has type `Battery_Evidence_Charge_Qualification_Supervisor::ChargeSessionState`.

## Detailed behavioral requirements

### Requirements for BatteryEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_BATTERY_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, BatteryEvidenceQualifier shall produce a result for which if batteryCheck is INVALID, then batteryAssessment is UNAVAILABLE, if batteryCheck is VALID and batteryCapacity is LOW, then batteryAssessment is LOW, and if batteryCheck is VALID and batteryCapacity is USABLE, then batteryAssessment is ADEQUATE.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_INVALID_EVIDENCE` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is INVALID, BatteryEvidenceQualifier shall set batteryAssessment to UNAVAILABLE.

##### `CASE_02_VALID_LOW` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is VALID and batteryCapacity is LOW, BatteryEvidenceQualifier shall set batteryAssessment to LOW.

##### `CASE_03_VALID_USABLE` — Conditional behavior

> During contract evaluation for the compute phase, if batteryCheck is VALID and batteryCapacity is USABLE, BatteryEvidenceQualifier shall set batteryAssessment to ADEQUATE.

### Requirements for ChargeContextQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_CONTEXT_AND_READINESS` — Required behavior

> During contract evaluation for the initialization phase, ChargeContextQualifier shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     batteryAssessment is UNAVAILABLE
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - chargeContextQualification is BLOCKED EVIDENCE
>       - batteryReadinessAdvice is UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - At least one of the following conditions holds:
>         
>           - lifecycleContext is STANDBY
>           - lifecycleContext is CHARGING
>     
>     **Then:**
>     
>     chargeContextQualification is ELIGIBLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - At least one of the following conditions holds:
>         
>           - lifecycleContext is OFF
>           - lifecycleContext is READY
>           - lifecycleContext is FLYING
>     
>     **Then:**
>     
>     chargeContextQualification is BLOCKED CONTEXT
>   - **If:**
>     
>     batteryAssessment is LOW
>     
>     **Then:**
>     
>     batteryReadinessAdvice is NOT READY
>   - **If:**
>     
>     batteryAssessment is ADEQUATE
>     
>     **Then:**
>     
>     batteryReadinessAdvice is READY.

#### Contract clauses evaluated in the compute phase

##### `CASE_07_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if batteryAssessment is UNAVAILABLE, ChargeContextQualifier shall set chargeContextQualification to BLOCKED EVIDENCE and batteryReadinessAdvice to UNAVAILABLE.

##### `CASE_08_ELIGIBLE_CONTEXT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 ELIGIBLE CONTEXT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - batteryAssessment is not UNAVAILABLE
>   - At least one of the following conditions holds:
>     
>       - lifecycleContext is STANDBY
>       - lifecycleContext is CHARGING.

> When all applicability conditions are met, ChargeContextQualifier shall produce a result for which all of the following conditions hold:
>
> chargeContextQualification is ELIGIBLE, if batteryAssessment is LOW, then batteryReadinessAdvice is NOT READY, and if batteryAssessment is ADEQUATE, then batteryReadinessAdvice is READY.

##### `CASE_09_BLOCKED_CONTEXT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 BLOCKED CONTEXT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - batteryAssessment is not UNAVAILABLE
>   - At least one of the following conditions holds:
>     
>       - lifecycleContext is OFF
>       - lifecycleContext is READY
>       - lifecycleContext is FLYING.

> When all applicability conditions are met, ChargeContextQualifier shall produce a result for which all of the following conditions hold:
>
> chargeContextQualification is BLOCKED CONTEXT, if batteryAssessment is LOW, then batteryReadinessAdvice is NOT READY, and if batteryAssessment is ADEQUATE, then batteryReadinessAdvice is READY.

### Requirements for ChargeEligibilityRecoveryOwner

#### Contract clauses evaluated in the initialization phase

##### `INIT_ELIGIBILITY` — Required behavior

> During contract evaluation for the initialization phase, ChargeEligibilityRecoveryOwner shall produce a result for which if chargeContextQualification is BLOCKED EVIDENCE and currentChargeSession is ENABLED, then chargeEligibilityEnvelope is RECOVER EVIDENCE, if chargeContextQualification is BLOCKED EVIDENCE and currentChargeSession is not ENABLED, then chargeEligibilityEnvelope is BLOCKED EVIDENCE, if chargeContextQualification is not BLOCKED EVIDENCE, chargerPathQualification is UNAVAILABLE, and currentChargeSession is ENABLED, then chargeEligibilityEnvelope is RECOVER CHARGER, if chargeContextQualification is not BLOCKED EVIDENCE, chargerPathQualification is UNAVAILABLE, and currentChargeSession is not ENABLED, then chargeEligibilityEnvelope is BLOCKED CHARGER, if chargeContextQualification is BLOCKED CONTEXT, chargerPathQualification is not UNAVAILABLE, and currentChargeSession is ENABLED, then chargeEligibilityEnvelope is RECOVER CONTEXT, if chargeContextQualification is BLOCKED CONTEXT, chargerPathQualification is not UNAVAILABLE, and currentChargeSession is not ENABLED, then chargeEligibilityEnvelope is BLOCKED CONTEXT, and if chargeContextQualification is ELIGIBLE and chargerPathQualification is not UNAVAILABLE, then chargeEligibilityEnvelope is ELIGIBLE.

#### Contract clauses evaluated in the compute phase

##### `CASE_10_EVIDENCE_PRECEDENCE` — Conditional behavior

> During contract evaluation for the compute phase, if chargeContextQualification is BLOCKED EVIDENCE, ChargeEligibilityRecoveryOwner shall produce a result for which if currentChargeSession is ENABLED, then chargeEligibilityEnvelope is RECOVER EVIDENCE and if currentChargeSession is not ENABLED, then chargeEligibilityEnvelope is BLOCKED EVIDENCE.

##### `CASE_11_CHARGER_PRECEDENCE` — Conditional behavior

> During contract evaluation for the compute phase, if chargeContextQualification is not BLOCKED EVIDENCE and chargerPathQualification is UNAVAILABLE, ChargeEligibilityRecoveryOwner shall produce a result for which if currentChargeSession is ENABLED, then chargeEligibilityEnvelope is RECOVER CHARGER and if currentChargeSession is not ENABLED, then chargeEligibilityEnvelope is BLOCKED CHARGER.

##### `CASE_12_CONTEXT_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if chargeContextQualification is BLOCKED CONTEXT and chargerPathQualification is not UNAVAILABLE, ChargeEligibilityRecoveryOwner shall produce a result for which if currentChargeSession is ENABLED, then chargeEligibilityEnvelope is RECOVER CONTEXT and if currentChargeSession is not ENABLED, then chargeEligibilityEnvelope is BLOCKED CONTEXT.

##### `CASE_13_ELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if chargeContextQualification is ELIGIBLE and chargerPathQualification is not UNAVAILABLE, ChargeEligibilityRecoveryOwner shall set chargeEligibilityEnvelope to ELIGIBLE.

### Requirements for ChargeIntentArbiter

#### Contract clauses evaluated in the initialization phase

##### `INIT_ARBITRATION` — Required behavior

> During contract evaluation for the initialization phase, ChargeIntentArbiter shall produce a result for which if chargeRequest is CANCEL CHARGE, then chargeDecision is TERMINATE, if chargeRequest is not CANCEL CHARGE and chargeEligibilityEnvelope is RECOVER EVIDENCE, then chargeDecision is RECOVER EVIDENCE, if chargeRequest is not CANCEL CHARGE and chargeEligibilityEnvelope is RECOVER CHARGER, then chargeDecision is RECOVER CHARGER, if chargeRequest is not CANCEL CHARGE and chargeEligibilityEnvelope is RECOVER CONTEXT, then chargeDecision is RECOVER CONTEXT, if chargeRequest is REQUEST CHARGE and chargeEligibilityEnvelope is ELIGIBLE, then chargeDecision is AUTHORIZE, if chargeRequest is REQUEST CHARGE and chargeEligibilityEnvelope is BLOCKED EVIDENCE, then chargeDecision is REJECT EVIDENCE, if chargeRequest is REQUEST CHARGE and chargeEligibilityEnvelope is BLOCKED CHARGER, then chargeDecision is REJECT CHARGER, if chargeRequest is REQUEST CHARGE and chargeEligibilityEnvelope is BLOCKED CONTEXT, then chargeDecision is REJECT CONTEXT, and if chargeRequest is NO REQUEST, chargeEligibilityEnvelope is not RECOVER EVIDENCE, chargeEligibilityEnvelope is not RECOVER CHARGER, and chargeEligibilityEnvelope is not RECOVER CONTEXT, then chargeDecision is NO CHANGE.

#### Contract clauses evaluated in the compute phase

##### `CASE_14_CANCEL_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if chargeRequest is CANCEL CHARGE, ChargeIntentArbiter shall set chargeDecision to TERMINATE.

##### `CASE_15_RECOVERY_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 RECOVERY PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - chargeRequest is not CANCEL CHARGE
>   - At least one of the following conditions holds:
>     
>       - chargeEligibilityEnvelope is RECOVER EVIDENCE
>       - chargeEligibilityEnvelope is RECOVER CHARGER
>       - chargeEligibilityEnvelope is RECOVER CONTEXT.

> When all applicability conditions are met, ChargeIntentArbiter shall produce a result for which all of the following conditions hold:
>
> if chargeEligibilityEnvelope is RECOVER EVIDENCE, then chargeDecision is RECOVER EVIDENCE, if chargeEligibilityEnvelope is RECOVER CHARGER, then chargeDecision is RECOVER CHARGER, and if chargeEligibilityEnvelope is RECOVER CONTEXT, then chargeDecision is RECOVER CONTEXT.

##### `CASE_16_REQUEST_OR_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if chargeRequest is not CANCEL CHARGE, chargeEligibilityEnvelope is not RECOVER EVIDENCE, chargeEligibilityEnvelope is not RECOVER CHARGER, and chargeEligibilityEnvelope is not RECOVER CONTEXT, ChargeIntentArbiter shall produce a result for which if chargeRequest is REQUEST CHARGE and chargeEligibilityEnvelope is ELIGIBLE, then chargeDecision is AUTHORIZE, if chargeRequest is REQUEST CHARGE and chargeEligibilityEnvelope is BLOCKED EVIDENCE, then chargeDecision is REJECT EVIDENCE, if chargeRequest is REQUEST CHARGE and chargeEligibilityEnvelope is BLOCKED CHARGER, then chargeDecision is REJECT CHARGER, if chargeRequest is REQUEST CHARGE and chargeEligibilityEnvelope is BLOCKED CONTEXT, then chargeDecision is REJECT CONTEXT, and if chargeRequest is NO REQUEST, then chargeDecision is NO CHANGE.

### Requirements for ChargeSessionController

#### Contract clauses evaluated in the initialization phase

##### `INIT_SESSION_AND_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, ChargeSessionController shall set committedChargeSession to IDLE, currentChargeSession to IDLE, chargePermission to DISABLED, chargeSessionSnapshot preSession to IDLE, chargeSessionSnapshot nextSession to IDLE, chargeSessionSnapshot disposition to NO CHANGE, and chargeSessionSnapshot reason to NONE.

#### Contract clauses evaluated in the compute phase

##### `PUBLISH_COMMITTED_PRE_STATE` — Required behavior

> During contract evaluation for the compute phase, ChargeSessionController shall set currentChargeSession to the value of committedChargeSession on entry.

##### `PROJECT_PRE_SESSION` — Required behavior

> During contract evaluation for the compute phase, ChargeSessionController shall produce a result for which if the value of committedChargeSession on entry is IDLE, then chargeSessionSnapshot preSession is IDLE, if the value of committedChargeSession on entry is ENABLED, then chargeSessionSnapshot preSession is ENABLED, and if the value of committedChargeSession on entry is SUSPENDED, then chargeSessionSnapshot preSession is SUSPENDED.

##### `PROJECT_NEXT_SESSION` — Required behavior

> During contract evaluation for the compute phase, ChargeSessionController shall produce a result for which if committedChargeSession is IDLE, then chargeSessionSnapshot nextSession is IDLE and chargePermission is DISABLED, if committedChargeSession is ENABLED, then chargeSessionSnapshot nextSession is ENABLED and chargePermission is ENABLED, and if committedChargeSession is SUSPENDED, then chargeSessionSnapshot nextSession is SUSPENDED and chargePermission is DISABLED.

##### `RECOVERY_REASON_INVARIANT` — Required behavior

> During contract evaluation for the compute phase, ChargeSessionController shall produce a result for which if chargeSessionSnapshot disposition is RECOVERY APPLIED, then chargeSessionSnapshot reason is EVIDENCE UNAVAILABLE, chargeSessionSnapshot reason is CHARGER UNAVAILABLE, or chargeSessionSnapshot reason is CONTEXT INELIGIBLE.

##### `CASE_17_TRANSITIONING_DECISIONS` — Conditional behavior

> During contract evaluation for the compute phase, if chargeDecision is AUTHORIZE, chargeDecision is TERMINATE, chargeDecision is RECOVER EVIDENCE, chargeDecision is RECOVER CHARGER, or chargeDecision is RECOVER CONTEXT, ChargeSessionController shall produce a result for which if chargeDecision is AUTHORIZE, then committedChargeSession is ENABLED, chargeSessionSnapshot disposition is ACCEPTED, and chargeSessionSnapshot reason is NONE, if chargeDecision is TERMINATE, then committedChargeSession is IDLE, chargeSessionSnapshot disposition is ACCEPTED, and chargeSessionSnapshot reason is CANCELLED, if chargeDecision is RECOVER EVIDENCE, then committedChargeSession is SUSPENDED, chargeSessionSnapshot disposition is RECOVERY APPLIED, and chargeSessionSnapshot reason is EVIDENCE UNAVAILABLE, if chargeDecision is RECOVER CHARGER, then committedChargeSession is SUSPENDED, chargeSessionSnapshot disposition is RECOVERY APPLIED, and chargeSessionSnapshot reason is CHARGER UNAVAILABLE, and if chargeDecision is RECOVER CONTEXT, then committedChargeSession is SUSPENDED, chargeSessionSnapshot disposition is RECOVERY APPLIED, and chargeSessionSnapshot reason is CONTEXT INELIGIBLE.

##### `CASE_18_HOLDING_DECISIONS` — Conditional behavior

> During contract evaluation for the compute phase, if chargeDecision is NO CHANGE, chargeDecision is REJECT EVIDENCE, chargeDecision is REJECT CHARGER, or chargeDecision is REJECT CONTEXT, ChargeSessionController shall produce a result for which committedChargeSession is the value of committedChargeSession on entry, if chargeDecision is NO CHANGE, then chargeSessionSnapshot disposition is NO CHANGE and chargeSessionSnapshot reason is NONE, if chargeDecision is REJECT EVIDENCE, then chargeSessionSnapshot disposition is REJECTED and chargeSessionSnapshot reason is EVIDENCE UNAVAILABLE, if chargeDecision is REJECT CHARGER, then chargeSessionSnapshot disposition is REJECTED and chargeSessionSnapshot reason is CHARGER UNAVAILABLE, and if chargeDecision is REJECT CONTEXT, then chargeSessionSnapshot disposition is REJECTED and chargeSessionSnapshot reason is CONTEXT INELIGIBLE.

### Requirements for ChargerPathQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_CHARGER_PATH` — Required behavior

> During contract evaluation for the initialization phase, ChargerPathQualifier shall produce a result for which if chargerConnection is DISCONNECTED, then chargerPathQualification is UNAVAILABLE, if chargerConnection is CONNECTED and chargeActivity is INACTIVE, then chargerPathQualification is READY, and if chargerConnection is CONNECTED and chargeActivity is ACTIVE, then chargerPathQualification is ACTIVE.

#### Contract clauses evaluated in the compute phase

##### `CASE_04_DISCONNECTED` — Conditional behavior

> During contract evaluation for the compute phase, if chargerConnection is DISCONNECTED, ChargerPathQualifier shall set chargerPathQualification to UNAVAILABLE.

##### `CASE_05_CONNECTED_INACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if chargerConnection is CONNECTED and chargeActivity is INACTIVE, ChargerPathQualifier shall set chargerPathQualification to READY.

##### `CASE_06_CONNECTED_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if chargerConnection is CONNECTED and chargeActivity is ACTIVE, ChargerPathQualifier shall set chargerPathQualification to ACTIVE.

### Requirements for FlightControlBatteryNoticePolicy

#### Contract clauses evaluated in the initialization phase

##### `INIT_NOTICE` — Required behavior

> During contract evaluation for the initialization phase, FlightControlBatteryNoticePolicy shall produce a result for which if batteryAssessment is UNAVAILABLE, then flightControlBatteryNotice is EVIDENCE UNAVAILABLE, if batteryAssessment is LOW and lifecycleContext is FLYING, then flightControlBatteryNotice is LOW IN FLIGHT CONTEXT, if batteryAssessment is LOW and lifecycleContext is not FLYING, then flightControlBatteryNotice is LOW BATTERY, and if batteryAssessment is ADEQUATE, then flightControlBatteryNotice is CLEAR.

#### Contract clauses evaluated in the compute phase

##### `CASE_19_CONTEXTUAL_NOTICE` — Conditional behavior

> During contract evaluation for the compute phase, FlightControlBatteryNoticePolicy shall produce a result for which if batteryAssessment is UNAVAILABLE, then flightControlBatteryNotice is EVIDENCE UNAVAILABLE, if batteryAssessment is LOW and lifecycleContext is FLYING, then flightControlBatteryNotice is LOW IN FLIGHT CONTEXT, if batteryAssessment is LOW and lifecycleContext is not FLYING, then flightControlBatteryNotice is LOW BATTERY, and if batteryAssessment is ADEQUATE, then flightControlBatteryNotice is CLEAR.

### Requirements for PilotBatteryStatusPolicy

#### Contract clauses evaluated in the initialization phase

##### `INIT_PILOT_STATUS` — Required behavior

> During contract evaluation for the initialization phase, PilotBatteryStatusPolicy shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - pilotBatteryStatus batteryAssessment is batteryAssessment
>   - pilotBatteryStatus chargerPathQualification is chargerPathQualification
>   - **If:**
>     
>     chargeSessionSnapshot nextSession is IDLE
>     
>     **Then:**
>     
>     pilotBatteryStatus session is IDLE
>   - **If:**
>     
>     chargeSessionSnapshot nextSession is ENABLED
>     
>     **Then:**
>     
>     pilotBatteryStatus session is ENABLED
>   - **If:**
>     
>     chargeSessionSnapshot nextSession is SUSPENDED
>     
>     **Then:**
>     
>     pilotBatteryStatus session is SUSPENDED
>   - **If:**
>     
>     chargeSessionSnapshot disposition is NO CHANGE
>     
>     **Then:**
>     
>     pilotBatteryStatus disposition is NO CHANGE
>   - **If:**
>     
>     chargeSessionSnapshot disposition is ACCEPTED
>     
>     **Then:**
>     
>     pilotBatteryStatus disposition is ACCEPTED
>   - **If:**
>     
>     chargeSessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     pilotBatteryStatus disposition is REJECTED
>   - **If:**
>     
>     chargeSessionSnapshot disposition is RECOVERY APPLIED
>     
>     **Then:**
>     
>     pilotBatteryStatus disposition is RECOVERY APPLIED
>   - **If:**
>     
>     batteryAssessment is UNAVAILABLE
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - chargeSessionSnapshot disposition is RECOVERY APPLIED
>       - chargeSessionSnapshot reason is EVIDENCE UNAVAILABLE
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - chargeSessionSnapshot disposition is RECOVERY APPLIED
>       - chargeSessionSnapshot reason is CHARGER UNAVAILABLE
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is CHARGER UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - chargeSessionSnapshot disposition is RECOVERY APPLIED
>       - chargeSessionSnapshot reason is CONTEXT INELIGIBLE
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is CONTEXT INELIGIBLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - At least one of the following conditions holds:
>         
>           - chargeSessionSnapshot disposition is not RECOVERY APPLIED
>           - All of the following conditions hold:
>             
>               - chargeSessionSnapshot reason is not EVIDENCE UNAVAILABLE
>               - chargeSessionSnapshot reason is not CHARGER UNAVAILABLE
>               - chargeSessionSnapshot reason is not CONTEXT INELIGIBLE
>       - chargerPathQualification is ACTIVE
>       - chargeSessionSnapshot nextSession is not ENABLED
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is ACTIVITY WITHOUT PERMISSION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is LOW
>       - At least one of the following conditions holds:
>         
>           - chargeSessionSnapshot disposition is not RECOVERY APPLIED
>           - All of the following conditions hold:
>             
>               - chargeSessionSnapshot reason is not EVIDENCE UNAVAILABLE
>               - chargeSessionSnapshot reason is not CHARGER UNAVAILABLE
>               - chargeSessionSnapshot reason is not CONTEXT INELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - chargerPathQualification is not ACTIVE
>           - chargeSessionSnapshot nextSession is ENABLED
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is CHARGE RECOMMENDED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - At least one of the following conditions holds:
>         
>           - chargeSessionSnapshot disposition is not RECOVERY APPLIED
>           - All of the following conditions hold:
>             
>               - chargeSessionSnapshot reason is not EVIDENCE UNAVAILABLE
>               - chargeSessionSnapshot reason is not CHARGER UNAVAILABLE
>               - chargeSessionSnapshot reason is not CONTEXT INELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - chargerPathQualification is not ACTIVE
>           - chargeSessionSnapshot nextSession is ENABLED
>       - chargeSessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is REQUEST REJECTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - At least one of the following conditions holds:
>         
>           - chargeSessionSnapshot disposition is not RECOVERY APPLIED
>           - All of the following conditions hold:
>             
>               - chargeSessionSnapshot reason is not EVIDENCE UNAVAILABLE
>               - chargeSessionSnapshot reason is not CHARGER UNAVAILABLE
>               - chargeSessionSnapshot reason is not CONTEXT INELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - chargerPathQualification is not ACTIVE
>           - chargeSessionSnapshot nextSession is ENABLED
>       - chargeSessionSnapshot disposition is not REJECTED
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is NONE.

#### Contract clauses evaluated in the compute phase

##### `CASE_20_PILOT_ADVISORY` — Conditional behavior

> During contract evaluation for the compute phase, PilotBatteryStatusPolicy shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - pilotBatteryStatus batteryAssessment is batteryAssessment
>   - pilotBatteryStatus chargerPathQualification is chargerPathQualification
>   - **If:**
>     
>     chargeSessionSnapshot nextSession is IDLE
>     
>     **Then:**
>     
>     pilotBatteryStatus session is IDLE
>   - **If:**
>     
>     chargeSessionSnapshot nextSession is ENABLED
>     
>     **Then:**
>     
>     pilotBatteryStatus session is ENABLED
>   - **If:**
>     
>     chargeSessionSnapshot nextSession is SUSPENDED
>     
>     **Then:**
>     
>     pilotBatteryStatus session is SUSPENDED
>   - **If:**
>     
>     chargeSessionSnapshot disposition is NO CHANGE
>     
>     **Then:**
>     
>     pilotBatteryStatus disposition is NO CHANGE
>   - **If:**
>     
>     chargeSessionSnapshot disposition is ACCEPTED
>     
>     **Then:**
>     
>     pilotBatteryStatus disposition is ACCEPTED
>   - **If:**
>     
>     chargeSessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     pilotBatteryStatus disposition is REJECTED
>   - **If:**
>     
>     chargeSessionSnapshot disposition is RECOVERY APPLIED
>     
>     **Then:**
>     
>     pilotBatteryStatus disposition is RECOVERY APPLIED
>   - **If:**
>     
>     batteryAssessment is UNAVAILABLE
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - chargeSessionSnapshot disposition is RECOVERY APPLIED
>       - chargeSessionSnapshot reason is EVIDENCE UNAVAILABLE
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is EVIDENCE UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - chargeSessionSnapshot disposition is RECOVERY APPLIED
>       - chargeSessionSnapshot reason is CHARGER UNAVAILABLE
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is CHARGER UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - chargeSessionSnapshot disposition is RECOVERY APPLIED
>       - chargeSessionSnapshot reason is CONTEXT INELIGIBLE
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is CONTEXT INELIGIBLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is not UNAVAILABLE
>       - At least one of the following conditions holds:
>         
>           - chargeSessionSnapshot disposition is not RECOVERY APPLIED
>           - All of the following conditions hold:
>             
>               - chargeSessionSnapshot reason is not EVIDENCE UNAVAILABLE
>               - chargeSessionSnapshot reason is not CHARGER UNAVAILABLE
>               - chargeSessionSnapshot reason is not CONTEXT INELIGIBLE
>       - chargerPathQualification is ACTIVE
>       - chargeSessionSnapshot nextSession is not ENABLED
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is ACTIVITY WITHOUT PERMISSION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is LOW
>       - At least one of the following conditions holds:
>         
>           - chargeSessionSnapshot disposition is not RECOVERY APPLIED
>           - All of the following conditions hold:
>             
>               - chargeSessionSnapshot reason is not EVIDENCE UNAVAILABLE
>               - chargeSessionSnapshot reason is not CHARGER UNAVAILABLE
>               - chargeSessionSnapshot reason is not CONTEXT INELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - chargerPathQualification is not ACTIVE
>           - chargeSessionSnapshot nextSession is ENABLED
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is CHARGE RECOMMENDED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - At least one of the following conditions holds:
>         
>           - chargeSessionSnapshot disposition is not RECOVERY APPLIED
>           - All of the following conditions hold:
>             
>               - chargeSessionSnapshot reason is not EVIDENCE UNAVAILABLE
>               - chargeSessionSnapshot reason is not CHARGER UNAVAILABLE
>               - chargeSessionSnapshot reason is not CONTEXT INELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - chargerPathQualification is not ACTIVE
>           - chargeSessionSnapshot nextSession is ENABLED
>       - chargeSessionSnapshot disposition is REJECTED
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is REQUEST REJECTED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - batteryAssessment is ADEQUATE
>       - At least one of the following conditions holds:
>         
>           - chargeSessionSnapshot disposition is not RECOVERY APPLIED
>           - All of the following conditions hold:
>             
>               - chargeSessionSnapshot reason is not EVIDENCE UNAVAILABLE
>               - chargeSessionSnapshot reason is not CHARGER UNAVAILABLE
>               - chargeSessionSnapshot reason is not CONTEXT INELIGIBLE
>       - At least one of the following conditions holds:
>         
>           - chargerPathQualification is not ACTIVE
>           - chargeSessionSnapshot nextSession is ENABLED
>       - chargeSessionSnapshot disposition is not REJECTED
>     
>     **Then:**
>     
>     pilotBatteryStatus advisory is NONE.
