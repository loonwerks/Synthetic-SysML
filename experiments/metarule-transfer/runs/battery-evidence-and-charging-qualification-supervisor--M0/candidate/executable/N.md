# Battery Evidence and Charging Qualification Supervisor

## Selected system context

### Synopsis, need, purpose, and scope

NEED-01: A configurable logical drone needs a bounded supervisory function that turns
qualitative battery, charger, charging-interface, and read-only lifecycle reports into
trustworthy battery awareness, charging qualification, and audience-specific notices
without assuming physical battery or flight behavior.

PURPOSE-01: The system will qualify battery evidence, remember whether that evidence has
recovered enough to be trusted, decide whether charging is currently eligible, control a
logical charge-authorization outcome, retain attention until explicit acknowledgement is
valid, and publish a battery-only readiness advisory. It shall not command or own drone
lifecycle transitions.

### Goals

GOAL-01: The system shall prevent logical charge authorization unless current battery,
charger, charging-interface, and contextual evidence jointly satisfy the selected
charge-eligibility policy.

GOAL-02: The system shall make invalid battery evidence immediately untrusted and shall
require two consecutive valid reports before battery evidence becomes trusted again.

GOAL-03: The system shall propagate distinct evidence and session conflicts to an exact
public fault vector and conservative notices without conflating a disconnected charger
with a charger fault.

GOAL-04: The system shall retain charge suspension and battery attention across evidence
recovery until the applicable fresh request is present in the current snapshot.

GOAL-05: The system shall publish mutually consistent authorization, request result,
notice, advisory, session, and fault outcomes from one winning composition of
owner-local facts.

### Operational context and exact system boundary

CTX-01: The Pilot/Status Consumer is the seed-mentioned human abstraction. It supplies
one current service request and receives notices and supervisory status; this does not
assert a physical control station or command protocol.

CTX-02: The Battery Management Source supplies qualitative capacity and report validity.
It remains responsible for the report; the supervisor does not model measurement
physics.

CTX-03: The Charger Context supplies a finite availability report and receives logical
authorization. `Permitted` is permission, not evidence that energy is flowing.

CTX-04: The Charging Interface Context supplies a finite report about the preceding
observation interval. `Active` means only that activity was reported, not that
electrical charging is proved.

CTX-05: The External Lifecycle Context Owner supplies the current named drone phase and
its validity. It alone owns that phase; no output from this system can change it.

CTX-06: The Flight-Control Notice Recipient receives battery attention only. It supplies
no input and this abstract assigns it no flight-control behavior.

MON-01: `serviceRequest`, from CTX-01, is exactly one of `None`, `Assess`,
`BeginCharge`, `EndCharge`, or `AcknowledgeNotice`. A request has effect only in the
snapshot in which that value is present.

MON-02: `batteryReport`, from CTX-02, is the product of band `Full`, `Nominal`, `Low`,
or `Critical` and status `Valid` or `Invalid`. Units and physical thresholds are
intentionally unspecified because the seed grounds only a qualitative indication.

MON-03: `chargerReport`, from CTX-03, is exactly `Disconnected`, `Ready`, `Faulted`, or
`Unknown`. `Disconnected` blocks charging but is not itself a fault; `Faulted` and
`Unknown` assert the charger-evidence fault.

MON-04: `chargeInterfaceReport`, from CTX-04, is exactly `Idle`, `Active`, `Faulted`, or
`Unknown`. `Faulted` and `Unknown` assert an interface-evidence fault; `Active` is
compared with the prior charge-session authorization.

MON-05: `lifecycleReport`, from CTX-05, is the product of phase `Off`, `Standby`,
`Charging`, `Ready`, or `Flying` and status `Valid` or `Invalid`. Charging context is
allowed only for valid `Off`, `Standby`, or `Charging`; this policy reads but never
transitions the phase.

CTRL-01: `chargeAuthorization`, to CTX-03, is exactly `Denied` or `Permitted`. It shall
be `Permitted` exactly when the new charge-session state is `Authorized` and the current
aggregate fault is false.

CTRL-02: `pilotNotice`, to CTX-01, is exactly `EvidenceUntrusted`, `Critical`, `Low`,
`ChargeAttention`, `RecoveryPending`, or `Clear`, selected by the notification priority
in `POL-NOTICE-01`.

CTRL-03: `flightControlNotice`, to CTX-06, is exactly `EvidenceUntrusted`, `Critical`,
`Low`, `RecoveryPending`, or `Clear`. Charger, interface, context, and session faults
alone do not create a flight-control battery notice.

CTRL-04: `pilotStatus`, to CTX-01, is the finite product of battery advisory
`Unknown/BatteryReady/ChargeQualified/ChargeBlocked/AirborneAttention`, charge session
`Idle/Eligible/Authorized/Suspended`, request result
`None/Accepted/Rejected/Deferred/NoEffect`, the five-bit fault vector, and aggregate
fault.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for providing exactly one `MON-01` value per logical
snapshot. The single enum makes concurrent pilot requests impossible; this is a
deterministic pilot abstraction, not a claim about a real operator.

ASM-02: CTX-02 is responsible for pairing every qualitative band with explicit validity.
On `Invalid`, the band is present for type completeness but shall have no behavioral
authority.

ASM-03: CTX-03 is responsible for the four-valued `MON-03` report. The selected policy
treats `Ready` as usable, `Disconnected` as unavailable without fault, and
`Faulted/Unknown` as unavailable with fault.

ASM-04: CTX-04 is responsible for the four-valued `MON-04` report about the preceding
observation interval. Comparing `Active` with the prior session state avoids assuming
instantaneous physical response to the current output.

ASM-05: CTX-05 is responsible for a phase/status pair. Valid `Ready` and `Flying` block
charging but are not lifecycle faults; only invalid status asserts the context-evidence
fault.

ASM-06: The selected charge-need abstraction is `Full -> NotNeeded` and
`Nominal/Low/Critical -> needed` once battery evidence is trusted. This is a finite
policy choice without physical threshold or safety significance.

ASM-07: Two consecutive valid battery reports restore trust regardless of whether their
qualitative bands match. The purpose is to exercise bounded recovery ownership, not to
claim sensor-validation adequacy.

ASM-08: Every contract evaluation uses one atomic logical snapshot and the three owners'
prior states. No real period, latency, concurrency, or scheduling claim follows from
this assumption.

ASM-09: The logical initial states are battery confidence `Untrusted`, attention
`Attention`, and charge session `Idle`; all public authorization is safely `Denied`
before the first complete evaluation.

### Fault propagation, risks, and recovery

RISK-01: Invalid battery evidence accepted as trustworthy could permit charging or clear
attention from an ungrounded band; mitigation is immediate confidence loss, blocking,
notices, and two-valid-snapshot recovery.

RISK-02: Reported interface activity without prior authorization could remain unreported
or be mistaken for authorized operation; mitigation is highest- priority session
conflict, suspension, fault propagation, and denial.

RISK-03: Clearing local evidence faults could silently restore a prior charge
authorization or clear attention; mitigation is independent state retention and
fresh-request recovery.

## Supporting contract definitions

### State `Drone_Battery_Charge_Qualification_Supervisor::AttentionLatchStateOwner::attentionState`

State `attentionState` has type `Drone_Battery_Charge_Qualification_Supervisor::AttentionState`.

### State `Drone_Battery_Charge_Qualification_Supervisor::BatteryConfidenceStateOwner::confidenceState`

State `confidenceState` has type `Drone_Battery_Charge_Qualification_Supervisor::BatteryConfidence`.

### State `Drone_Battery_Charge_Qualification_Supervisor::ChargeSessionPriorityStateOwner::sessionState`

State `sessionState` has type `Drone_Battery_Charge_Qualification_Supervisor::SourceChargeSession`.

## Detailed behavioral requirements

### Requirements for AttentionLatchStateOwner

#### Contract clauses evaluated in the initialization phase

May modify: attentionState

##### `INITIAL_ATTENTION` — Required behavior

> During contract evaluation for the initialization phase, AttentionLatchStateOwner shall produce a result for which attentionState is Attention, resolutionToNotification newAttention is Attention, resolutionToNotification cause is Untrusted, resolutionToNotification attentionClearedNow is false, resolutionToNotification winningCase is ATTN 01, and clearedToRequestResult is false.

#### Contract clauses evaluated in the compute phase

May modify: attentionState

##### `ATTENTION_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, AttentionLatchStateOwner shall set resolutionToNotification newAttention to attentionState and clearedToRequestResult to true exactly when resolutionToNotification attentionClearedNow is true.

##### `ATTN_01_UNTRUSTED` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is not Trusted, AttentionLatchStateOwner shall produce a result for which attentionState is Attention, resolutionToNotification cause is Untrusted, resolutionToNotification attentionClearedNow is false, and resolutionToNotification winningCase is ATTN 01.

##### `ATTN_02_CRITICAL` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is Trusted and batteryIn band is Critical, AttentionLatchStateOwner shall produce a result for which attentionState is Attention, resolutionToNotification cause is Critical, resolutionToNotification attentionClearedNow is false, and resolutionToNotification winningCase is ATTN 02.

##### `ATTN_03_LOW` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is Trusted and batteryIn band is Low, AttentionLatchStateOwner shall produce a result for which attentionState is Attention, resolutionToNotification cause is Low, resolutionToNotification attentionClearedNow is false, and resolutionToNotification winningCase is ATTN 03.

##### `ATTN_04_FRESH_ACKNOWLEDGEMENT` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is Trusted, batteryIn band is not Critical, batteryIn band is not Low, the value of attentionState on entry is Attention, and requestIn is AcknowledgeNotice, AttentionLatchStateOwner shall produce a result for which attentionState is Clear, resolutionToNotification cause is Clear, resolutionToNotification attentionClearedNow is true, and resolutionToNotification winningCase is ATTN 04.

##### `ATTN_05_RECOVERY_PENDING` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is Trusted, batteryIn band is not Critical, batteryIn band is not Low, the value of attentionState on entry is Attention, and requestIn is not AcknowledgeNotice, AttentionLatchStateOwner shall produce a result for which attentionState is Attention, resolutionToNotification cause is RecoveryPending, resolutionToNotification attentionClearedNow is false, and resolutionToNotification winningCase is ATTN 05.

##### `ATTN_06_RETAIN_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is Trusted, batteryIn band is not Critical, batteryIn band is not Low, and the value of attentionState on entry is Clear, AttentionLatchStateOwner shall produce a result for which attentionState is Clear, resolutionToNotification cause is Clear, resolutionToNotification attentionClearedNow is false, and resolutionToNotification winningCase is ATTN 06.

### Requirements for AuthorizationStatusCompositionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PUBLIC_OUTCOMES` — Required behavior

> During contract evaluation for the initialization phase, AuthorizationStatusCompositionOwner shall produce a result for which chargeAuthorizationOut is Denied, pilotStatusOut statusAdvisory advisoryValue is ADVISORY UNKNOWN, pilotStatusOut statusSession sessionValue is Idle, pilotStatusOut statusRequestResult requestResultValue is None, pilotStatusOut faults batteryFault is true, pilotStatusOut faults chargerFault is true, pilotStatusOut faults interfaceFault is true, pilotStatusOut faults contextFault is true, pilotStatusOut faults sessionConflict is false, and pilotStatusOut aggregateFault is true.

#### Contract clauses evaluated in the compute phase

##### `STATUS_PRESERVES_OWNER_FACTS` — Required behavior

> During contract evaluation for the compute phase, AuthorizationStatusCompositionOwner shall set pilotStatusOut statusAdvisory advisoryValue to publicFactsIn advisory advisoryValue, pilotStatusOut statusSession sessionValue to publicFactsIn newSession sessionValue, pilotStatusOut statusRequestResult requestResultValue to publicFactsIn requestResult requestResultValue, pilotStatusOut faults batteryFault to true exactly when faultsIn vector batteryFault is true, pilotStatusOut faults chargerFault to true exactly when faultsIn vector chargerFault is true, pilotStatusOut faults interfaceFault to true exactly when faultsIn vector interfaceFault is true, pilotStatusOut faults contextFault to true exactly when faultsIn vector contextFault is true, pilotStatusOut faults sessionConflict to true exactly when faultsIn vector sessionConflict is true, and pilotStatusOut aggregateFault to true exactly when faultsIn aggregateFault is true.

##### `AUTHORIZATION_PERMITTED` — Conditional behavior

> During contract evaluation for the compute phase, if publicFactsIn newSession sessionValue is Authorized and faultsIn aggregateFault is false, AuthorizationStatusCompositionOwner shall set chargeAuthorizationOut to Permitted.

##### `AUTHORIZATION_DENIED` — Conditional behavior

> During contract evaluation for the compute phase, if publicFactsIn newSession sessionValue is not Authorized or faultsIn aggregateFault is true, AuthorizationStatusCompositionOwner shall set chargeAuthorizationOut to Denied.

### Requirements for BatteryAdvisoryDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ADVISORY` — Required behavior

> During contract evaluation for the initialization phase, BatteryAdvisoryDecisionOwner shall set advisoryToRequestResult advisoryValue to ADVISORY UNKNOWN.

#### Contract clauses evaluated in the compute phase

##### `ADVISORY_UNKNOWN` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is not Trusted or lifecycleIn contextValid is false, BatteryAdvisoryDecisionOwner shall set advisoryToRequestResult advisoryValue to ADVISORY UNKNOWN.

##### `ADVISORY_AIRBORNE_ATTENTION` — Conditional behavior

> During contract evaluation for the compute phase, case ADVISORY AIRBORNE ATTENTION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - batteryIn confidence is Trusted
>   - lifecycleIn contextValid is true
>   - lifecycleIn airborneContext is true
>   - At least one of the following conditions holds:
>     
>       - batteryIn band is Low
>       - batteryIn band is Critical.

> When all applicability conditions are met, BatteryAdvisoryDecisionOwner shall produce a result for which all of the following conditions hold:
>
> advisoryToRequestResult advisoryValue is AIRBORNE ATTENTION.

##### `ADVISORY_BATTERY_READY` — Conditional behavior

> During contract evaluation for the compute phase, case ADVISORY BATTERY READY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - batteryIn confidence is Trusted
>   - lifecycleIn contextValid is true
>   - At least one of the following conditions holds:
>     
>       - batteryIn band is Full
>       - batteryIn band is Nominal.

> When all applicability conditions are met, BatteryAdvisoryDecisionOwner shall produce a result for which all of the following conditions hold:
>
> advisoryToRequestResult advisoryValue is BATTERY READY.

##### `ADVISORY_CHARGE_QUALIFIED` — Conditional behavior

> During contract evaluation for the compute phase, case ADVISORY CHARGE QUALIFIED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - batteryIn confidence is Trusted
>   - lifecycleIn contextValid is true
>   - lifecycleIn airborneContext is false
>   - At least one of the following conditions holds:
>     
>       - batteryIn band is Low
>       - batteryIn band is Critical
>   - eligibilityIn is Permitted.

> When all applicability conditions are met, BatteryAdvisoryDecisionOwner shall produce a result for which all of the following conditions hold:
>
> advisoryToRequestResult advisoryValue is CHARGE QUALIFIED.

##### `ADVISORY_CHARGE_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, case ADVISORY CHARGE BLOCKED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - batteryIn confidence is Trusted
>   - lifecycleIn contextValid is true
>   - lifecycleIn airborneContext is false
>   - At least one of the following conditions holds:
>     
>       - batteryIn band is Low
>       - batteryIn band is Critical
>   - eligibilityIn is not Permitted.

> When all applicability conditions are met, BatteryAdvisoryDecisionOwner shall produce a result for which all of the following conditions hold:
>
> advisoryToRequestResult advisoryValue is CHARGE BLOCKED.

### Requirements for BatteryConfidenceStateOwner

#### Contract clauses evaluated in the initialization phase

May modify: confidenceState

##### `INITIAL_CONFIDENCE` — Required behavior

> During contract evaluation for the initialization phase, BatteryConfidenceStateOwner shall produce a result for which confidenceState is Untrusted, stateToEligibility confidence is Untrusted, stateToEligibility band is Suppressed, stateToEligibility chargeNeeded is false, stateToEligibility batteryUsable is false, stateToEligibility batteryFault is true, stateToEligibility winningCase is CONF 01, stateToAttention confidence is Untrusted, stateToAttention band is Suppressed, stateToAttention chargeNeeded is false, stateToAttention batteryUsable is false, stateToAttention batteryFault is true, stateToAttention winningCase is CONF 01, stateToAdvisory confidence is Untrusted, stateToAdvisory band is Suppressed, stateToAdvisory chargeNeeded is false, stateToAdvisory batteryUsable is false, stateToAdvisory batteryFault is true, stateToAdvisory winningCase is CONF 01, and faultToAggregation is true.

#### Contract clauses evaluated in the compute phase

May modify: confidenceState

##### `CONFIDENCE_PUBLICATIONS_AGREE` — Required behavior

> During contract evaluation for the compute phase, BatteryConfidenceStateOwner shall set stateToEligibility confidence to confidenceState, stateToAttention confidence to stateToEligibility confidence, stateToAttention band to stateToEligibility band, stateToAttention chargeNeeded to true exactly when stateToEligibility chargeNeeded is true, stateToAttention batteryUsable to true exactly when stateToEligibility batteryUsable is true, stateToAttention batteryFault to true exactly when stateToEligibility batteryFault is true, stateToAttention winningCase to stateToEligibility winningCase, stateToAdvisory confidence to stateToEligibility confidence, stateToAdvisory band to stateToEligibility band, stateToAdvisory chargeNeeded to true exactly when stateToEligibility chargeNeeded is true, stateToAdvisory batteryUsable to true exactly when stateToEligibility batteryUsable is true, stateToAdvisory batteryFault to true exactly when stateToEligibility batteryFault is true, stateToAdvisory winningCase to stateToEligibility winningCase, and faultToAggregation to true exactly when stateToEligibility batteryFault is true.

##### `CONFIDENCE_DERIVED_FACTS` — Required behavior

> During contract evaluation for the compute phase, BatteryConfidenceStateOwner shall set stateToEligibility band to qualificationIn band, stateToEligibility batteryUsable to true exactly when confidenceState is Trusted, stateToEligibility batteryFault to true exactly when qualificationIn validEvidence is false, and stateToEligibility chargeNeeded to true exactly when confidenceState is Trusted and qualificationIn band is not Full.

##### `CONF_01_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if qualificationIn validEvidence is false, BatteryConfidenceStateOwner shall set confidenceState to Untrusted and stateToEligibility winningCase to CONF 01.

##### `CONF_02_FIRST_VALID` — Conditional behavior

> During contract evaluation for the compute phase, if qualificationIn validEvidence is true and the value of confidenceState on entry is Untrusted, BatteryConfidenceStateOwner shall set confidenceState to Confirming and stateToEligibility winningCase to CONF 02.

##### `CONF_03_SECOND_VALID` — Conditional behavior

> During contract evaluation for the compute phase, if qualificationIn validEvidence is true and the value of confidenceState on entry is Confirming, BatteryConfidenceStateOwner shall set confidenceState to Trusted and stateToEligibility winningCase to CONF 03.

##### `CONF_04_RETAIN_TRUST` — Conditional behavior

> During contract evaluation for the compute phase, if qualificationIn validEvidence is true and the value of confidenceState on entry is Trusted, BatteryConfidenceStateOwner shall set confidenceState to Trusted and stateToEligibility winningCase to CONF 04.

### Requirements for BatteryEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BATTERY_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, BatteryEvidenceQualifier shall produce a result for which qualificationOut validEvidence is false and qualificationOut band is Suppressed.

#### Contract clauses evaluated in the compute phase

##### `INVALID_BATTERY_REPORT` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn validity is Invalid, BatteryEvidenceQualifier shall produce a result for which qualificationOut validEvidence is false and qualificationOut band is Suppressed.

##### `VALID_FULL_REPORT` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn validity is Valid and reportIn band is Full, BatteryEvidenceQualifier shall produce a result for which qualificationOut validEvidence is true and qualificationOut band is Full.

##### `VALID_NOMINAL_REPORT` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn validity is Valid and reportIn band is Nominal, BatteryEvidenceQualifier shall produce a result for which qualificationOut validEvidence is true and qualificationOut band is Nominal.

##### `VALID_LOW_REPORT` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn validity is Valid and reportIn band is Low, BatteryEvidenceQualifier shall produce a result for which qualificationOut validEvidence is true and qualificationOut band is Low.

##### `VALID_CRITICAL_REPORT` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn validity is Valid and reportIn band is Critical, BatteryEvidenceQualifier shall produce a result for which qualificationOut validEvidence is true and qualificationOut band is Critical.

### Requirements for ChargeEligibilityDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ELIGIBILITY` — Required behavior

> During contract evaluation for the initialization phase, ChargeEligibilityDecisionOwner shall set eligibilityToAdvisory to Blocked and eligibilityToSession to Blocked.

#### Contract clauses evaluated in the compute phase

##### `ELIGIBILITY_PUBLICATIONS_AGREE` — Required behavior

> During contract evaluation for the compute phase, ChargeEligibilityDecisionOwner shall set eligibilityToAdvisory to eligibilityToSession.

##### `ELIGIBILITY_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is not Trusted, chargerIn chargerUsable is false, interfaceIn interfaceHealthy is false, or lifecycleIn chargeContextAllowed is false, ChargeEligibilityDecisionOwner shall set eligibilityToAdvisory to Blocked.

##### `ELIGIBILITY_NOT_NEEDED` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is Trusted, chargerIn chargerUsable is true, interfaceIn interfaceHealthy is true, lifecycleIn chargeContextAllowed is true, and batteryIn band is Full, ChargeEligibilityDecisionOwner shall set eligibilityToAdvisory to NotNeeded.

##### `ELIGIBILITY_PERMITTED` — Conditional behavior

> During contract evaluation for the compute phase, if batteryIn confidence is Trusted, chargerIn chargerUsable is true, interfaceIn interfaceHealthy is true, lifecycleIn chargeContextAllowed is true, and batteryIn band is not Full, ChargeEligibilityDecisionOwner shall set eligibilityToAdvisory to Permitted.

### Requirements for ChargeSessionPriorityStateOwner

#### Contract clauses evaluated in the initialization phase

May modify: sessionState

##### `INITIAL_SESSION` — Required behavior

> During contract evaluation for the initialization phase, ChargeSessionPriorityStateOwner shall produce a result for which sessionState is Idle, conflictToAggregation is false, resolutionToNotification sourceSession is Idle, resolutionToNotification newSession sessionValue is Idle, resolutionToNotification sessionConflict is false, and resolutionToNotification winningCase is SESS 13.

#### Contract clauses evaluated in the compute phase

May modify: sessionState

##### `SESSION_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, ChargeSessionPriorityStateOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - sessionState is Idle
>           - resolutionToNotification newSession sessionValue is Idle
>       - All of the following conditions hold:
>         
>           - sessionState is Eligible
>           - resolutionToNotification newSession sessionValue is Eligible
>       - All of the following conditions hold:
>         
>           - sessionState is Authorized
>           - resolutionToNotification newSession sessionValue is Authorized
>       - All of the following conditions hold:
>         
>           - sessionState is Suspended
>           - resolutionToNotification newSession sessionValue is Suspended
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     resolutionToNotification sessionConflict is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - interfaceIn activityObserved is true
>       - the value of sessionState on entry is not Authorized
>   - conflictToAggregation is resolutionToNotification sessionConflict.

##### `SOURCE_SESSION_MAPPING` — Required behavior

> During contract evaluation for the compute phase, ChargeSessionPriorityStateOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the value of sessionState on entry is Idle
>       - resolutionToNotification sourceSession is Idle
>   - All of the following conditions hold:
>     
>       - the value of sessionState on entry is Eligible
>       - resolutionToNotification sourceSession is Eligible
>   - All of the following conditions hold:
>     
>       - the value of sessionState on entry is Authorized
>       - resolutionToNotification sourceSession is Authorized
>   - All of the following conditions hold:
>     
>       - the value of sessionState on entry is Suspended
>       - resolutionToNotification sourceSession is Suspended.

##### `SESS_01_UNEXPECTED_ACTIVITY` — Conditional behavior

> During contract evaluation for the compute phase, if interfaceIn activityObserved is true and the value of sessionState on entry is not Authorized, ChargeSessionPriorityStateOwner shall set sessionState to Suspended and resolutionToNotification winningCase to SESS 01.

##### `SESS_02_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that interfaceIn activityObserved is true and the value of sessionState on entry is not Authorized and eligibilityIn is Blocked, ChargeSessionPriorityStateOwner shall set sessionState to Suspended and resolutionToNotification winningCase to SESS 02.

##### `SESS_03_END_TO_ELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, case SESS 03 END TO ELIGIBLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - interfaceIn activityObserved is true
>       - the value of sessionState on entry is not Authorized
>   - eligibilityIn is Permitted
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Authorized
>       - the value of sessionState on entry is Suspended
>   - requestIn is EndCharge.

> When all applicability conditions are met, ChargeSessionPriorityStateOwner shall produce a result for which all of the following conditions hold:
>
> sessionState is Eligible and resolutionToNotification winningCase is SESS 03.

##### `SESS_04_END_TO_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, case SESS 04 END TO IDLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - interfaceIn activityObserved is true
>       - the value of sessionState on entry is not Authorized
>   - eligibilityIn is NotNeeded
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Authorized
>       - the value of sessionState on entry is Suspended
>   - requestIn is EndCharge.

> When all applicability conditions are met, ChargeSessionPriorityStateOwner shall produce a result for which all of the following conditions hold:
>
> sessionState is Idle and resolutionToNotification winningCase is SESS 04.

##### `SESS_05_AUTOMATIC_WITHDRAWAL` — Conditional behavior

> During contract evaluation for the compute phase, if the value of sessionState on entry is Authorized, eligibilityIn is NotNeeded, and requestIn is not EndCharge, ChargeSessionPriorityStateOwner shall set sessionState to Idle and resolutionToNotification winningCase to SESS 05.

##### `SESS_06_RETAIN_AUTHORIZED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of sessionState on entry is Authorized, eligibilityIn is Permitted, and requestIn is not EndCharge, ChargeSessionPriorityStateOwner shall set sessionState to Authorized and resolutionToNotification winningCase to SESS 06.

##### `SESS_07_FRESH_SUSPENDED_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if interfaceIn activityObserved is false, the value of sessionState on entry is Suspended, eligibilityIn is Permitted, and requestIn is BeginCharge, ChargeSessionPriorityStateOwner shall set sessionState to Authorized and resolutionToNotification winningCase to SESS 07.

##### `SESS_08_RETAIN_SUSPENDED` — Conditional behavior

> During contract evaluation for the compute phase, case SESS 08 RETAIN SUSPENDED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - interfaceIn activityObserved is false
>   - the value of sessionState on entry is Suspended
>   - eligibilityIn is not Blocked
>   - It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - requestIn is EndCharge
>           - eligibilityIn is Permitted
>       - All of the following conditions hold:
>         
>           - requestIn is EndCharge
>           - eligibilityIn is NotNeeded
>       - All of the following conditions hold:
>         
>           - requestIn is BeginCharge
>           - eligibilityIn is Permitted.

> When all applicability conditions are met, ChargeSessionPriorityStateOwner shall produce a result for which all of the following conditions hold:
>
> sessionState is Suspended and resolutionToNotification winningCase is SESS 08.

##### `SESS_09_FRESH_ELIGIBLE_BEGIN` — Conditional behavior

> During contract evaluation for the compute phase, if interfaceIn activityObserved is false, the value of sessionState on entry is Eligible, eligibilityIn is Permitted, and requestIn is BeginCharge, ChargeSessionPriorityStateOwner shall set sessionState to Authorized and resolutionToNotification winningCase to SESS 09.

##### `SESS_10_ELIGIBLE_NOT_NEEDED` — Conditional behavior

> During contract evaluation for the compute phase, if interfaceIn activityObserved is false, the value of sessionState on entry is Eligible, and eligibilityIn is NotNeeded, ChargeSessionPriorityStateOwner shall set sessionState to Idle and resolutionToNotification winningCase to SESS 10.

##### `SESS_11_RETAIN_ELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if interfaceIn activityObserved is false, the value of sessionState on entry is Eligible, eligibilityIn is Permitted, and requestIn is not BeginCharge, ChargeSessionPriorityStateOwner shall set sessionState to Eligible and resolutionToNotification winningCase to SESS 11.

##### `SESS_12_IDLE_TO_ELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if interfaceIn activityObserved is false, the value of sessionState on entry is Idle, and eligibilityIn is Permitted, ChargeSessionPriorityStateOwner shall set sessionState to Eligible and resolutionToNotification winningCase to SESS 12.

##### `SESS_13_RETAIN_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, if interfaceIn activityObserved is false, the value of sessionState on entry is Idle, and eligibilityIn is NotNeeded, ChargeSessionPriorityStateOwner shall set sessionState to Idle and resolutionToNotification winningCase to SESS 13.

### Requirements for ChargerEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CHARGER_FACTS` — Required behavior

> During contract evaluation for the initialization phase, ChargerEvidenceQualifier shall produce a result for which factsToEligibility chargerUsable is false, factsToEligibility chargerConnected is false, factsToEligibility chargerFault is true, and faultToAggregation is true.

#### Contract clauses evaluated in the compute phase

##### `CHARGER_FAULT_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, ChargerEvidenceQualifier shall set faultToAggregation to true exactly when factsToEligibility chargerFault is true.

##### `CHARGER_DISCONNECTED` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn is Disconnected, ChargerEvidenceQualifier shall produce a result for which factsToEligibility chargerUsable is false, factsToEligibility chargerConnected is false, and factsToEligibility chargerFault is false.

##### `CHARGER_READY` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn is Ready, ChargerEvidenceQualifier shall produce a result for which factsToEligibility chargerUsable is true, factsToEligibility chargerConnected is true, and factsToEligibility chargerFault is false.

##### `CHARGER_FAULTED` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn is Faulted, ChargerEvidenceQualifier shall produce a result for which factsToEligibility chargerUsable is false, factsToEligibility chargerConnected is true, and factsToEligibility chargerFault is true.

##### `CHARGER_UNKNOWN` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn is Unknown, ChargerEvidenceQualifier shall produce a result for which factsToEligibility chargerUsable is false, factsToEligibility chargerConnected is false, and factsToEligibility chargerFault is true.

### Requirements for ChargingInterfaceEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_INTERFACE_FACTS` — Required behavior

> During contract evaluation for the initialization phase, ChargingInterfaceEvidenceQualifier shall produce a result for which factsToEligibility interfaceHealthy is false, factsToEligibility activityObserved is false, factsToEligibility interfaceFault is true, factsToSession interfaceHealthy is false, factsToSession activityObserved is false, factsToSession interfaceFault is true, and faultToAggregation is true.

#### Contract clauses evaluated in the compute phase

##### `INTERFACE_PUBLICATIONS_AGREE` — Required behavior

> During contract evaluation for the compute phase, ChargingInterfaceEvidenceQualifier shall set factsToEligibility interfaceHealthy to true exactly when factsToSession interfaceHealthy is true, factsToEligibility activityObserved to true exactly when factsToSession activityObserved is true, factsToEligibility interfaceFault to true exactly when factsToSession interfaceFault is true, and faultToAggregation to true exactly when factsToEligibility interfaceFault is true.

##### `INTERFACE_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn is Idle, ChargingInterfaceEvidenceQualifier shall produce a result for which factsToEligibility interfaceHealthy is true, factsToEligibility activityObserved is false, and factsToEligibility interfaceFault is false.

##### `INTERFACE_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn is Active, ChargingInterfaceEvidenceQualifier shall produce a result for which factsToEligibility interfaceHealthy is true, factsToEligibility activityObserved is true, and factsToEligibility interfaceFault is false.

##### `INTERFACE_FAULTED` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn is Faulted, ChargingInterfaceEvidenceQualifier shall produce a result for which factsToEligibility interfaceHealthy is false, factsToEligibility activityObserved is false, and factsToEligibility interfaceFault is true.

##### `INTERFACE_UNKNOWN` — Conditional behavior

> During contract evaluation for the compute phase, if reportIn is Unknown, ChargingInterfaceEvidenceQualifier shall produce a result for which factsToEligibility interfaceHealthy is false, factsToEligibility activityObserved is false, and factsToEligibility interfaceFault is true.

### Requirements for CurrentRequestResultDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PUBLIC_REQUEST_RESULT` — Required behavior

> During contract evaluation for the initialization phase, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to None.

##### `INITIAL_PUBLIC_ADVISORY` — Required behavior

> During contract evaluation for the initialization phase, CurrentRequestResultDecisionOwner shall set publicFactsOut advisory advisoryValue to ADVISORY UNKNOWN.

##### `INITIAL_PUBLIC_SESSION` — Required behavior

> During contract evaluation for the initialization phase, CurrentRequestResultDecisionOwner shall set publicFactsOut newSession sessionValue to Idle.

#### Contract clauses evaluated in the compute phase

##### `PUBLIC_DECISION_COPIES` — Required behavior

> During contract evaluation for the compute phase, CurrentRequestResultDecisionOwner shall set publicFactsOut advisory advisoryValue to advisoryIn advisoryValue and publicFactsOut newSession sessionValue to sessionIn newSession sessionValue.

##### `REQUEST_NONE` — Conditional behavior

> During contract evaluation for the compute phase, if requestIn is None, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to None.

##### `ASSESS_DEFERRED` — Conditional behavior

> During contract evaluation for the compute phase, if requestIn is Assess and advisoryIn advisoryValue is ADVISORY UNKNOWN, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to Deferred.

##### `ASSESS_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if requestIn is Assess and advisoryIn advisoryValue is not ADVISORY UNKNOWN, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to Accepted.

##### `BEGIN_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, case BEGIN ACCEPTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - requestIn is BeginCharge
>   - At least one of the following conditions holds:
>     
>       - sessionIn winningCase is SESS 07
>       - sessionIn winningCase is SESS 09.

> When all applicability conditions are met, CurrentRequestResultDecisionOwner shall produce a result for which all of the following conditions hold:
>
> publicFactsOut requestResult requestResultValue is Accepted.

##### `BEGIN_DEFERRED` — Conditional behavior

> During contract evaluation for the compute phase, case BEGIN DEFERRED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - requestIn is BeginCharge
>   - At least one of the following conditions holds:
>     
>       - sessionIn winningCase is SESS 01
>       - sessionIn winningCase is SESS 02
>       - sessionIn winningCase is SESS 08.

> When all applicability conditions are met, CurrentRequestResultDecisionOwner shall produce a result for which all of the following conditions hold:
>
> publicFactsOut requestResult requestResultValue is Deferred.

##### `BEGIN_NO_EFFECT` — Conditional behavior

> During contract evaluation for the compute phase, if requestIn is BeginCharge and sessionIn winningCase is SESS 06, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to NoEffect.

##### `BEGIN_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, if requestIn is BeginCharge, sessionIn winningCase is not SESS 01, sessionIn winningCase is not SESS 02, sessionIn winningCase is not SESS 06, sessionIn winningCase is not SESS 07, sessionIn winningCase is not SESS 08, and sessionIn winningCase is not SESS 09, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to Rejected.

##### `END_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, case END ACCEPTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - requestIn is EndCharge
>   - At least one of the following conditions holds:
>     
>       - sessionIn winningCase is SESS 03
>       - sessionIn winningCase is SESS 04.

> When all applicability conditions are met, CurrentRequestResultDecisionOwner shall produce a result for which all of the following conditions hold:
>
> publicFactsOut requestResult requestResultValue is Accepted.

##### `END_NO_EFFECT` — Conditional behavior

> During contract evaluation for the compute phase, if requestIn is EndCharge, sessionIn winningCase is not SESS 03, and sessionIn winningCase is not SESS 04, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to NoEffect.

##### `ACKNOWLEDGEMENT_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if requestIn is AcknowledgeNotice and attentionClearedIn is true, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to Accepted.

##### `ACKNOWLEDGEMENT_NO_EFFECT` — Conditional behavior

> During contract evaluation for the compute phase, if requestIn is AcknowledgeNotice and attentionClearedIn is false, CurrentRequestResultDecisionOwner shall set publicFactsOut requestResult requestResultValue to NoEffect.

### Requirements for FaultAggregationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_FAULT_FACTS` — Required behavior

> During contract evaluation for the initialization phase, FaultAggregationOwner shall produce a result for which faultsToNotification vector batteryFault is true, faultsToNotification vector chargerFault is true, faultsToNotification vector interfaceFault is true, faultsToNotification vector contextFault is true, faultsToNotification vector sessionConflict is false, faultsToNotification aggregateFault is true, faultsToComposition vector batteryFault is true, faultsToComposition vector chargerFault is true, faultsToComposition vector interfaceFault is true, faultsToComposition vector contextFault is true, faultsToComposition vector sessionConflict is false, and faultsToComposition aggregateFault is true.

#### Contract clauses evaluated in the compute phase

##### `EXACT_FAULT_VECTOR` — Required behavior

> During contract evaluation for the compute phase, FaultAggregationOwner shall set faultsToNotification vector batteryFault to true exactly when batteryFaultIn is true, faultsToNotification vector chargerFault to true exactly when chargerFaultIn is true, faultsToNotification vector interfaceFault to true exactly when interfaceFaultIn is true, faultsToNotification vector contextFault to true exactly when contextFaultIn is true, and faultsToNotification vector sessionConflict to true exactly when sessionConflictIn is true.

##### `EXACT_FAULT_DISJUNCTION` — Required behavior

> During contract evaluation for the compute phase, FaultAggregationOwner shall set faultsToNotification aggregateFault to true exactly when batteryFaultIn is true, chargerFaultIn is true, interfaceFaultIn is true, contextFaultIn is true, or sessionConflictIn is true.

##### `FAULT_PUBLICATIONS_AGREE` — Required behavior

> During contract evaluation for the compute phase, FaultAggregationOwner shall set faultsToComposition vector batteryFault to true exactly when faultsToNotification vector batteryFault is true, faultsToComposition vector chargerFault to true exactly when faultsToNotification vector chargerFault is true, faultsToComposition vector interfaceFault to true exactly when faultsToNotification vector interfaceFault is true, faultsToComposition vector contextFault to true exactly when faultsToNotification vector contextFault is true, faultsToComposition vector sessionConflict to true exactly when faultsToNotification vector sessionConflict is true, and faultsToComposition aggregateFault to true exactly when faultsToNotification aggregateFault is true.

### Requirements for LifecycleContextApplicabilityOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_LIFECYCLE_FACTS` — Required behavior

> During contract evaluation for the initialization phase, LifecycleContextApplicabilityOwner shall produce a result for which factsToEligibility chargeContextAllowed is false, factsToEligibility airborneContext is false, factsToEligibility contextValid is false, factsToEligibility contextFault is true, factsToAdvisory chargeContextAllowed is false, factsToAdvisory airborneContext is false, factsToAdvisory contextValid is false, factsToAdvisory contextFault is true, and faultToAggregation is true.

#### Contract clauses evaluated in the compute phase

##### `LIFECYCLE_PUBLICATIONS_AGREE` — Required behavior

> During contract evaluation for the compute phase, LifecycleContextApplicabilityOwner shall set factsToEligibility chargeContextAllowed to true exactly when factsToAdvisory chargeContextAllowed is true, factsToEligibility airborneContext to true exactly when factsToAdvisory airborneContext is true, factsToEligibility contextValid to true exactly when factsToAdvisory contextValid is true, factsToEligibility contextFault to true exactly when factsToAdvisory contextFault is true, and faultToAggregation to true exactly when factsToEligibility contextFault is true.

##### `LIFECYCLE_VALIDITY` — Required behavior

> During contract evaluation for the compute phase, LifecycleContextApplicabilityOwner shall set factsToEligibility contextValid to true exactly when reportIn validity is Valid and factsToEligibility contextFault to true exactly when reportIn validity is Invalid.

##### `CHARGING_CONTEXT_APPLICABILITY` — Required behavior

> During contract evaluation for the compute phase, LifecycleContextApplicabilityOwner shall set factsToEligibility chargeContextAllowed to true exactly when All of the following conditions hold:
>
>   - reportIn validity is Valid
>   - At least one of the following conditions holds:
>     
>       - reportIn phase is Off
>       - reportIn phase is Standby
>       - reportIn phase is Charging.

##### `AIRBORNE_CONTEXT_APPLICABILITY` — Required behavior

> During contract evaluation for the compute phase, LifecycleContextApplicabilityOwner shall set factsToEligibility airborneContext to true exactly when reportIn validity is Valid and reportIn phase is Flying.

### Requirements for NotificationCompositionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NOTICES` — Required behavior

> During contract evaluation for the initialization phase, NotificationCompositionOwner shall set pilotNoticeOut to EvidenceUntrusted and flightControlNoticeOut to EvidenceUntrusted.

#### Contract clauses evaluated in the compute phase

##### `PILOT_EVIDENCE_UNTRUSTED` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is true, then pilotNoticeOut is EvidenceUntrusted.

##### `PILOT_CRITICAL` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is false and attentionIn cause is Critical, then pilotNoticeOut is Critical.

##### `PILOT_LOW` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is false and attentionIn cause is Low, then pilotNoticeOut is Low.

##### `PILOT_CHARGE_ATTENTION` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which all of the following conditions hold:
>
> **If:**
>
> All of the following conditions hold:
>
>   - faultsIn vector batteryFault is false
>   - attentionIn cause is not Critical
>   - attentionIn cause is not Low
>   - At least one of the following conditions holds:
>     
>       - faultsIn aggregateFault is true
>       - sessionIn newSession sessionValue is Suspended
>
> **Then:**
>
> pilotNoticeOut is ChargeAttention.

##### `PILOT_RECOVERY_PENDING` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is false, attentionIn cause is not Critical, attentionIn cause is not Low, faultsIn aggregateFault is false, sessionIn newSession sessionValue is not Suspended, and attentionIn newAttention is Attention, then pilotNoticeOut is RecoveryPending.

##### `PILOT_CLEAR` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is false, attentionIn cause is not Critical, attentionIn cause is not Low, faultsIn aggregateFault is false, sessionIn newSession sessionValue is not Suspended, and attentionIn newAttention is Clear, then pilotNoticeOut is Clear.

##### `FLIGHT_EVIDENCE_UNTRUSTED` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is true, then flightControlNoticeOut is EvidenceUntrusted.

##### `FLIGHT_CRITICAL` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is false and attentionIn cause is Critical, then flightControlNoticeOut is Critical.

##### `FLIGHT_LOW` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is false and attentionIn cause is Low, then flightControlNoticeOut is Low.

##### `FLIGHT_RECOVERY_PENDING` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is false, attentionIn cause is not Critical, attentionIn cause is not Low, and attentionIn newAttention is Attention, then flightControlNoticeOut is RecoveryPending.

##### `FLIGHT_CLEAR` — Required behavior

> During contract evaluation for the compute phase, NotificationCompositionOwner shall produce a result for which if faultsIn vector batteryFault is false, attentionIn cause is not Critical, attentionIn cause is not Low, and attentionIn newAttention is Clear, then flightControlNoticeOut is Clear.
