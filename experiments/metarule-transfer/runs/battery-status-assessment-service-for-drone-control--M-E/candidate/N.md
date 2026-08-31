# Battery Status Assessment Service for Drone Control

## Selected system context

### Need, purpose, goals, and operating context

NEED-01: Drone control needs a bounded, inspectable qualitative battery assessment whose
trustworthiness is explicit, whose result cannot be confused with a replay or another
check, and whose stale publication is removed after consumption, cancellation, or
interface fault.

PURPOSE-01: The system will accept at most one logical battery check at a time, request
and qualify one report, derive one assessment for the admitted token, make that result
available to drone control, and recover from acquisition or publication faults only
through explicit reset followed by a fresh alternate-token check.

GOAL-01: The system shall publish a trusted level-derived assessment only from a
current, structurally coherent report tagged for the admitted check; stale, invalid,
incomplete, or malformed present reports shall produce `Untrusted`.

GOAL-02: The system shall never publish an assessment for a replay, busy request,
unmatched response, acquisition failure, inactive context, or mismatched decision token.

GOAL-03: The system shall clear an offered assessment upon matching consumption,
cancellation, rejected use, inconsistent feedback, or reset, and shall fail closed into
recovery hold after acquisition or publication faults.

GOAL-04: The system shall not leave recovery hold because inputs become favorable; one
applicable reset shall clear both component fault latches, and only a subsequent
alternate-token fresh `Start` shall reopen work.

CTX-01: [inferred external role] The Check Requester is part of the drone-control
environment. It supplies check commands and alternating tokens and receives diagnostic
check status; the source does not define this protocol.

CTX-02: [inferred external role from named power management] The Power Management
Reporter receives a logical read request and supplies a qualitative battery report. It
is responsible for intended token association and qualitative meanings, while the system
classifies all violations.

CTX-03: [inferred external role from named drone control] The Drone Control Consumer
receives the tagged battery assessment and reports whether the offer remains pending,
was consumed, or was rejected. Consumption means only acceptance at this logical
interface; the source defines no human or organizational actor.

CTX-04: [external context only] The battery, charger, aircraft, forest environment,
observation payload, navigation, communications, landing gear, and propulsion equipment
are outside the boundary and exchange no other modeled quantity with it.

### Exact finite boundary and internal vocabulary

MON-01: Root input `check_request: CheckRequest` comes from `CTX-01`; `PART-01` alone
owns freshness, single-check admission, cancellation applicability, and reset
applicability.

MON-02: Root input `battery_report: BatteryReport` comes from `CTX-02`; it is evaluated
only against a real acquisition directive and otherwise is inapplicable.

MON-03: Root input `control_use_feedback: ControlUseFeedback` comes from `CTX-03`; it
applies only to the token already offered by `PART-05`, while mismatched, malformed, or
unexpected meaningful feedback is a publication fault.

CTRL-01: Root output `status_read_request: StatusReadRequest = {NoRead, ReadTokenA,
ReadTokenB}` goes to `CTX-02`; it requests one logical report and makes no physical
sampling or timing claim.

CTRL-02: Root output `battery_assessment: TaggedAssessment` goes to `CTX-03`. It is
exactly `(offered token, retained assessment)` while `PART-05` is offered and
`(NoTicket, NoAssessment)` otherwise.

CTRL-03: Root output `check_status: CheckStatus` goes to `CTX-01`. It initializes to
`Idle`, reports the lifecycle owner's latest committed outcome, and cannot authorize
drone behavior.

### Environmental assumptions and logical ordering

ASM-01: `CTX-01` shall alternate tokens for genuinely new checks and retain the token
for retries or replays. Violation fails closed as `DuplicateIgnored` and never creates a
read.

ASM-02: `CTX-02` is responsible for intended report association and qualitative
meanings. The system makes no quantitative accuracy claim and classifies every
unmatched, unavailable, absent, or malformed response.

ASM-03: `CTX-03` shall use a meaningful disposition only with the offered token.
Mismatch is analyzed rather than assumed impossible and causes fail-closed publication
recovery.

ASM-04: One logical evaluation observes prior committed acquisition and publication
outcome registers, evaluates the current request, performs the current acyclic
acquisition/qualification/assessment/custody path, and commits new owner outcomes for
the next evaluation. This is an experiment ordering assumption, not a scheduler, period,
deadline, or latency claim.

ASM-05: Feedback in the same evaluation as a newly opened assessment applies only to a
previously committed offer; `CTX-03` is expected to supply the inactive pair when no
prior offer exists. All violations remain in the bounded input product and shall cause
publication fault.

ASM-06: `Reset` clears only this abstraction's acquisition and publication latches. It
claims no repair of physical equipment or software, and recurring external faults are
detected again on a later fresh check.

### State ownership, initialization, and consistency

MODE-01: No separate SysML mode is required. Observable conditions are idle, checking,
offered, consumption recognition, fault recognition, and recovery hold. During
consumption recognition `CTRL-02` is already inactive while lifecycle remains
`AwaitingUse`; `CTRL-03 = Completed` appears only when committed `INT-11 = Consumed` is
evaluated one logical step later. Fault outputs likewise fail closed before lifecycle
diagnosis can catch up.

### Risks, fault behavior, and recovery

RISK-01: Stale, invalid, incomplete, or malformed content could otherwise be interpreted
as favorable capacity and mislead logical drone-control use; no quantitative likelihood,
severity, or physical consequence is asserted.

RISK-02: Unavailable or mismatched acquisition and inconsistent feedback could otherwise
leave stale assessment available or associate it with the wrong check; the source
supplies no physical fail-safe claim.

## Supporting contract definitions

### State `Battery_Status_Assessment_Service::CheckLifecycle::lifecycleState`

State `lifecycleState` has type `Battery_Status_Assessment_Service::LifecycleState`.

### State `Battery_Status_Assessment_Service::CheckLifecycle::lastAdmittedToken`

State `lastAdmittedToken` has type `Battery_Status_Assessment_Service::LastAdmittedToken`.

### State `Battery_Status_Assessment_Service::ReportAcquisition::acquisitionState`

State `acquisitionState` has type `Battery_Status_Assessment_Service::AcquisitionState`.

### State `Battery_Status_Assessment_Service::ReportAcquisition::committedAcquisitionOutcome`

State `committedAcquisitionOutcome` has type `Battery_Status_Assessment_Service::AcquisitionOutcome`.

### State `Battery_Status_Assessment_Service::ResultCustody::publicationState`

State `publicationState` has type `Battery_Status_Assessment_Service::PublicationState`.

### State `Battery_Status_Assessment_Service::ResultCustody::retainedAssessment`

State `retainedAssessment` has type `Battery_Status_Assessment_Service::AssessmentResult`.

### State `Battery_Status_Assessment_Service::ResultCustody::committedPublicationOutcome`

State `committedPublicationOutcome` has type `Battery_Status_Assessment_Service::PublicationOutcome`.

## Detailed behavioral requirements

### Requirements for AssessmentDecision

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DECISION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, AssessmentDecision shall set decision assessment ticket to NoTicket and decision assessment result to NoAssessment.

#### Contract clauses evaluated in the compute phase

##### `DECIDE_HIGH` — Conditional behavior

> During contract evaluation for the compute phase, case DECIDE HIGH applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenA
>           - qualified evidence ticket is TokenA
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenB
>           - qualified evidence ticket is TokenB
>   - qualified evidence evidence is TrustedHigh.

> When all applicability conditions are met, AssessmentDecision shall produce a result for which all of the following conditions hold:
>
> decision assessment ticket is qualified evidence ticket and decision assessment result is NormalUse.

##### `DECIDE_MODERATE` — Conditional behavior

> During contract evaluation for the compute phase, case DECIDE MODERATE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenA
>           - qualified evidence ticket is TokenA
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenB
>           - qualified evidence ticket is TokenB
>   - qualified evidence evidence is TrustedModerate.

> When all applicability conditions are met, AssessmentDecision shall produce a result for which all of the following conditions hold:
>
> decision assessment ticket is qualified evidence ticket and decision assessment result is CautionUse.

##### `DECIDE_LOW_OR_CRITICAL` — Conditional behavior

> During contract evaluation for the compute phase, case DECIDE LOW OR CRITICAL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenA
>           - qualified evidence ticket is TokenA
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenB
>           - qualified evidence ticket is TokenB
>   - At least one of the following conditions holds:
>     
>       - qualified evidence evidence is TrustedLow
>       - qualified evidence evidence is TrustedCritical.

> When all applicability conditions are met, AssessmentDecision shall produce a result for which all of the following conditions hold:
>
> decision assessment ticket is qualified evidence ticket and decision assessment result is RestrictUse.

##### `DECIDE_UNTRUSTED` — Conditional behavior

> During contract evaluation for the compute phase, case DECIDE UNTRUSTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenA
>           - qualified evidence ticket is TokenA
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenB
>           - qualified evidence ticket is TokenB
>   - qualified evidence evidence is Untrusted.

> When all applicability conditions are met, AssessmentDecision shall produce a result for which all of the following conditions hold:
>
> decision assessment ticket is qualified evidence ticket and decision assessment result is Untrusted.

##### `DECISION_INAPPLICABLE` — Conditional behavior

> During contract evaluation for the compute phase, case DECISION INAPPLICABLE applies under all of the following conditions:
>
> It is not the case that:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenA
>           - qualified evidence ticket is TokenA
>       - All of the following conditions hold:
>         
>           - assessment context is AssessTokenB
>           - qualified evidence ticket is TokenB
>   - qualified evidence evidence is not NoEvidence.

> When all applicability conditions are met, AssessmentDecision shall produce a result for which all of the following conditions hold:
>
> decision assessment ticket is NoTicket and decision assessment result is NoAssessment.

### Requirements for CheckLifecycle

#### Contract clauses evaluated in the initialization phase

May modify: lifecycleState, lastAdmittedToken

##### `INITIAL_LIFECYCLE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, CheckLifecycle shall set lifecycleState to Idle, lastAdmittedToken to None, acquisition directive to NoAcquisition, assessment context to NoContext, publication directive to NoPublicationDirective, and check status to Idle.

#### Contract clauses evaluated in the compute phase

May modify: lifecycleState, lastAdmittedToken

##### `PRIOR_PUBLICATION_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is not RecoveryHold and publication outcome is PublicationFault, CheckLifecycle shall set lifecycleState to RecoveryHold, preserve the value of lastAdmittedToken on entry, set acquisition directive to NoAcquisition, set assessment context to NoContext, set publication directive to NoPublicationDirective, and set check status to PublicationFailed.

##### `PRIOR_ACQUISITION_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is not RecoveryHold, publication outcome is not PublicationFault, and acquisition outcome is AcquisitionFault, CheckLifecycle shall set lifecycleState to RecoveryHold, preserve the value of lastAdmittedToken on entry, set acquisition directive to NoAcquisition, set assessment context to NoContext, set publication directive to NoPublicationDirective, and set check status to AcquisitionFailed.

##### `RESET_CONFIRMATIONS` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is RecoveryHold, acquisition outcome is AcquisitionReset, and publication outcome is PublicationReset, CheckLifecycle shall set lifecycleState to Idle, preserve the value of lastAdmittedToken on entry, set acquisition directive to NoAcquisition, set assessment context to NoContext, set publication directive to NoPublicationDirective, and set check status to ResetCompleted.

##### `RESET_IN_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is RecoveryHold, it is not the case that acquisition outcome is AcquisitionReset and publication outcome is PublicationReset, and check request command is Reset, CheckLifecycle shall set lifecycleState to RecoveryHold, preserve the value of lastAdmittedToken on entry, set acquisition directive to ResetAcquisition, set assessment context to NoContext, set publication directive to ResetPublication, and set check status to RecoveryRequired.

##### `RECOVERY_BLOCKS_NONRESET` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is RecoveryHold, it is not the case that acquisition outcome is AcquisitionReset and publication outcome is PublicationReset, and check request command is not Reset, CheckLifecycle shall set lifecycleState to RecoveryHold, preserve the value of lastAdmittedToken on entry, set acquisition directive to NoAcquisition, set assessment context to NoContext, set publication directive to NoPublicationDirective, and set check status to RecoveryRequired.

##### `PRIOR_CONSUMPTION_COMPLETES` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is not RecoveryHold, publication outcome is not PublicationFault, acquisition outcome is not AcquisitionFault, and publication outcome is Consumed, CheckLifecycle shall set lifecycleState to Idle, preserve the value of lastAdmittedToken on entry, set acquisition directive to NoAcquisition, set assessment context to NoContext, set publication directive to NoPublicationDirective, and set check status to Completed.

##### `ACTIVE_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE CANCEL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of lifecycleState on entry is not RecoveryHold
>   - publication outcome is not PublicationFault
>   - acquisition outcome is not AcquisitionFault
>   - publication outcome is not Consumed
>   - check request command is Cancel
>   - At least one of the following conditions holds:
>     
>       - the value of lifecycleState on entry is Checking
>       - the value of lifecycleState on entry is AwaitingUse.

> When all applicability conditions are met, CheckLifecycle shall produce a result for which all of the following conditions hold:
>
> lifecycleState is Idle, lastAdmittedToken is the value of lastAdmittedToken on entry, acquisition directive is NoAcquisition, assessment context is NoContext, publication directive is Withdraw, and check status is Cancelled.

##### `IDLE_DUPLICATE_TOKEN_A` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is Idle, publication outcome is not PublicationFault, acquisition outcome is not AcquisitionFault, publication outcome is not Consumed, check request command is Start, check request token is TokenA, and the value of lastAdmittedToken on entry is TokenA, CheckLifecycle shall set lifecycleState to Idle, preserve the value of lastAdmittedToken on entry, set acquisition directive to NoAcquisition, set assessment context to NoContext, set publication directive to NoPublicationDirective, and set check status to DuplicateIgnored.

##### `IDLE_DUPLICATE_TOKEN_B` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is Idle, publication outcome is not PublicationFault, acquisition outcome is not AcquisitionFault, publication outcome is not Consumed, check request command is Start, check request token is TokenB, and the value of lastAdmittedToken on entry is TokenB, CheckLifecycle shall set lifecycleState to Idle, preserve the value of lastAdmittedToken on entry, set acquisition directive to NoAcquisition, set assessment context to NoContext, set publication directive to NoPublicationDirective, and set check status to DuplicateIgnored.

##### `FRESH_TOKEN_A_START` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is Idle, publication outcome is not PublicationFault, acquisition outcome is not AcquisitionFault, publication outcome is not Consumed, check request command is Start, check request token is TokenA, and the value of lastAdmittedToken on entry is not TokenA, CheckLifecycle shall set lifecycleState to Checking, lastAdmittedToken to TokenA, acquisition directive to AcquireTokenA, assessment context to AssessTokenA, publication directive to OpenTokenA, and check status to Checking.

##### `FRESH_TOKEN_B_START` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleState on entry is Idle, publication outcome is not PublicationFault, acquisition outcome is not AcquisitionFault, publication outcome is not Consumed, check request command is Start, check request token is TokenB, and the value of lastAdmittedToken on entry is not TokenB, CheckLifecycle shall set lifecycleState to Checking, lastAdmittedToken to TokenB, acquisition directive to AcquireTokenB, assessment context to AssessTokenB, publication directive to OpenTokenB, and check status to Checking.

##### `ACTIVE_START_BUSY` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE START BUSY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of lifecycleState on entry is Checking
>       - the value of lifecycleState on entry is AwaitingUse
>   - publication outcome is not PublicationFault
>   - acquisition outcome is not AcquisitionFault
>   - publication outcome is not Consumed
>   - check request command is Start.

> When all applicability conditions are met, CheckLifecycle shall produce a result for which all of the following conditions hold:
>
> lifecycleState is the value of lifecycleState on entry, lastAdmittedToken is the value of lastAdmittedToken on entry, acquisition directive is NoAcquisition, assessment context is NoContext, publication directive is NoPublicationDirective, and check status is Busy.

##### `CHECK_BECOMES_AVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, case CHECK BECOMES AVAILABLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of lifecycleState on entry is Checking
>   - publication outcome is not PublicationFault
>   - acquisition outcome is not AcquisitionFault
>   - publication outcome is not Consumed
>   - check request command is not Start
>   - check request command is not Cancel
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of lastAdmittedToken on entry is TokenA
>           - acquisition outcome is CapturedTokenA
>           - publication outcome is OfferedTokenA
>       - All of the following conditions hold:
>         
>           - the value of lastAdmittedToken on entry is TokenB
>           - acquisition outcome is CapturedTokenB
>           - publication outcome is OfferedTokenB.

> When all applicability conditions are met, CheckLifecycle shall produce a result for which all of the following conditions hold:
>
> lifecycleState is AwaitingUse, lastAdmittedToken is the value of lastAdmittedToken on entry, acquisition directive is NoAcquisition, assessment context is NoContext, publication directive is NoPublicationDirective, and check status is Available.

##### `ORDINARY_NONHOLD` — Conditional behavior

> During contract evaluation for the compute phase, case ORDINARY NONHOLD applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of lifecycleState on entry is not RecoveryHold
>   - publication outcome is not PublicationFault
>   - acquisition outcome is not AcquisitionFault
>   - publication outcome is not Consumed
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - check request command is Cancel
>       - At least one of the following conditions holds:
>         
>           - the value of lifecycleState on entry is Checking
>           - the value of lifecycleState on entry is AwaitingUse
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - the value of lifecycleState on entry is Idle
>       - check request command is Start
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - the value of lifecycleState on entry is Checking
>           - the value of lifecycleState on entry is AwaitingUse
>       - check request command is Start
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - the value of lifecycleState on entry is Checking
>       - check request command is not Start
>       - check request command is not Cancel
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - the value of lastAdmittedToken on entry is TokenA
>               - acquisition outcome is CapturedTokenA
>               - publication outcome is OfferedTokenA
>           - All of the following conditions hold:
>             
>               - the value of lastAdmittedToken on entry is TokenB
>               - acquisition outcome is CapturedTokenB
>               - publication outcome is OfferedTokenB.

> When all applicability conditions are met, CheckLifecycle shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - lifecycleState is the value of lifecycleState on entry
>   - lastAdmittedToken is the value of lastAdmittedToken on entry
>   - acquisition directive is NoAcquisition
>   - assessment context is NoContext
>   - publication directive is NoPublicationDirective
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of lifecycleState on entry is AwaitingUse
>           - check status is Available
>       - All of the following conditions hold:
>         
>           - the value of lifecycleState on entry is Checking
>           - check status is Checking
>       - All of the following conditions hold:
>         
>           - the value of lifecycleState on entry is Idle
>           - check status is Idle.

### Requirements for ReportAcquisition

#### Contract clauses evaluated in the initialization phase

May modify: acquisitionState, committedAcquisitionOutcome

##### `INITIAL_ACQUISITION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ReportAcquisition shall set acquisitionState to Ready, committedAcquisitionOutcome to NoAcquisitionOutcome, acquisition outcome to NoAcquisitionOutcome, status read request to NoRead, captured report ticket to NoTicket, captured report availability to Absent, captured report level to NoLevel, and captured report quality to NoQuality.

#### Contract clauses evaluated in the compute phase

May modify: acquisitionState, committedAcquisitionOutcome

##### `PRIOR_ACQUISITION_OUTCOME` — Required behavior

> During contract evaluation for the compute phase, ReportAcquisition shall set acquisition outcome to the value of committedAcquisitionOutcome on entry.

##### `ACQUISITION_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if acquisition directive is ResetAcquisition, ReportAcquisition shall set acquisitionState to Ready, committedAcquisitionOutcome to AcquisitionReset, status read request to NoRead, captured report ticket to NoTicket, captured report availability to Absent, captured report level to NoLevel, and captured report quality to NoQuality.

##### `ACQUISITION_HELD` — Conditional behavior

> During contract evaluation for the compute phase, if acquisition directive is not ResetAcquisition and the value of acquisitionState on entry is FailureHold, ReportAcquisition shall set acquisitionState to FailureHold, committedAcquisitionOutcome to NoAcquisitionOutcome, status read request to NoRead, captured report ticket to NoTicket, captured report availability to Absent, captured report level to NoLevel, and captured report quality to NoQuality.

##### `CAPTURE_TOKEN_A` — Conditional behavior

> During contract evaluation for the compute phase, if the value of acquisitionState on entry is Ready, acquisition directive is AcquireTokenA, battery report ticket is TokenA, and battery report availability is Present, ReportAcquisition shall set acquisitionState to Ready, committedAcquisitionOutcome to CapturedTokenA, status read request to ReadTokenA, captured report ticket to battery report ticket, captured report availability to battery report availability, captured report level to battery report level, and captured report quality to battery report quality.

##### `CAPTURE_TOKEN_B` — Conditional behavior

> During contract evaluation for the compute phase, if the value of acquisitionState on entry is Ready, acquisition directive is AcquireTokenB, battery report ticket is TokenB, and battery report availability is Present, ReportAcquisition shall set acquisitionState to Ready, committedAcquisitionOutcome to CapturedTokenB, status read request to ReadTokenB, captured report ticket to battery report ticket, captured report availability to battery report availability, captured report level to battery report level, and captured report quality to battery report quality.

##### `REQUESTED_ACQUISITION_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case REQUESTED ACQUISITION FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of acquisitionState on entry is Ready
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - acquisition directive is AcquireTokenA
>           - It is not the case that:
>             
>             All of the following conditions hold:
>             
>               - battery report ticket is TokenA
>               - battery report availability is Present
>       - All of the following conditions hold:
>         
>           - acquisition directive is AcquireTokenB
>           - It is not the case that:
>             
>             All of the following conditions hold:
>             
>               - battery report ticket is TokenB
>               - battery report availability is Present.

> When all applicability conditions are met, ReportAcquisition shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - acquisitionState is FailureHold
>   - committedAcquisitionOutcome is AcquisitionFault
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - acquisition directive is AcquireTokenA
>           - status read request is ReadTokenA
>       - All of the following conditions hold:
>         
>           - acquisition directive is AcquireTokenB
>           - status read request is ReadTokenB
>   - captured report ticket is NoTicket
>   - captured report availability is Absent
>   - captured report level is NoLevel
>   - captured report quality is NoQuality.

##### `ACQUISITION_INACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of acquisitionState on entry is Ready and acquisition directive is NoAcquisition, ReportAcquisition shall set acquisitionState to Ready, committedAcquisitionOutcome to NoAcquisitionOutcome, status read request to NoRead, captured report ticket to NoTicket, captured report availability to Absent, captured report level to NoLevel, and captured report quality to NoQuality.

### Requirements for ReportQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_QUALIFICATION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ReportQualification shall set qualified evidence ticket to NoTicket and qualified evidence evidence to NoEvidence.

#### Contract clauses evaluated in the compute phase

##### `QUALIFY_CURRENT_HIGH` — Conditional behavior

> During contract evaluation for the compute phase, if captured report ticket is not NoTicket, captured report availability is Present, captured report level is High, and captured report quality is Current, ReportQualification shall set qualified evidence ticket to captured report ticket and qualified evidence evidence to TrustedHigh.

##### `QUALIFY_CURRENT_MODERATE` — Conditional behavior

> During contract evaluation for the compute phase, if captured report ticket is not NoTicket, captured report availability is Present, captured report level is Moderate, and captured report quality is Current, ReportQualification shall set qualified evidence ticket to captured report ticket and qualified evidence evidence to TrustedModerate.

##### `QUALIFY_CURRENT_LOW` — Conditional behavior

> During contract evaluation for the compute phase, if captured report ticket is not NoTicket, captured report availability is Present, captured report level is Low, and captured report quality is Current, ReportQualification shall set qualified evidence ticket to captured report ticket and qualified evidence evidence to TrustedLow.

##### `QUALIFY_CURRENT_CRITICAL` — Conditional behavior

> During contract evaluation for the compute phase, if captured report ticket is not NoTicket, captured report availability is Present, captured report level is Critical, and captured report quality is Current, ReportQualification shall set qualified evidence ticket to captured report ticket and qualified evidence evidence to TrustedCritical.

##### `QUALIFY_UNTRUSTED_PRESENT` — Conditional behavior

> During contract evaluation for the compute phase, if captured report ticket is not NoTicket and it is not the case that captured report availability is Present, captured report level is not NoLevel, and captured report quality is Current, ReportQualification shall set qualified evidence ticket to captured report ticket and qualified evidence evidence to Untrusted.

##### `QUALIFICATION_INACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if captured report ticket is NoTicket, ReportQualification shall set qualified evidence ticket to NoTicket and qualified evidence evidence to NoEvidence.

### Requirements for ResultCustody

#### Contract clauses evaluated in the initialization phase

May modify: publicationState, retainedAssessment, committedPublicationOutcome

##### `INITIAL_CUSTODY_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ResultCustody shall set publicationState to Empty, retainedAssessment to NoAssessment, committedPublicationOutcome to NoPublicationOutcome, publication outcome to NoPublicationOutcome, battery assessment ticket to NoTicket, and battery assessment result to NoAssessment.

#### Contract clauses evaluated in the compute phase

May modify: publicationState, retainedAssessment, committedPublicationOutcome

##### `PRIOR_PUBLICATION_OUTCOME` — Required behavior

> During contract evaluation for the compute phase, ResultCustody shall set publication outcome to the value of committedPublicationOutcome on entry.

##### `PUBLICATION_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if publication directive is ResetPublication, ResultCustody shall set publicationState to Empty, retainedAssessment to NoAssessment, committedPublicationOutcome to PublicationReset, battery assessment ticket to NoTicket, and battery assessment result to NoAssessment.

##### `PUBLICATION_HELD` — Conditional behavior

> During contract evaluation for the compute phase, if publication directive is not ResetPublication and the value of publicationState on entry is FaultHold, ResultCustody shall set publicationState to FaultHold, retainedAssessment to NoAssessment, committedPublicationOutcome to NoPublicationOutcome, battery assessment ticket to NoTicket, and battery assessment result to NoAssessment.

##### `UNEXPECTED_OPEN_WHILE_OFFERED` — Conditional behavior

> During contract evaluation for the compute phase, case UNEXPECTED OPEN WHILE OFFERED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of publicationState on entry is OfferedTokenA
>       - the value of publicationState on entry is OfferedTokenB
>   - At least one of the following conditions holds:
>     
>       - publication directive is OpenTokenA
>       - publication directive is OpenTokenB
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - control use feedback ticket is NoTicket
>           - control use feedback disposition is NoFeedback
>       - All of the following conditions hold:
>         
>           - the value of publicationState on entry is OfferedTokenA
>           - control use feedback ticket is TokenA
>           - control use feedback disposition is Pending
>       - All of the following conditions hold:
>         
>           - the value of publicationState on entry is OfferedTokenB
>           - control use feedback ticket is TokenB
>           - control use feedback disposition is Pending.

> When all applicability conditions are met, ResultCustody shall produce a result for which all of the following conditions hold:
>
> publicationState is FaultHold, retainedAssessment is NoAssessment, committedPublicationOutcome is PublicationFault, battery assessment ticket is NoTicket, and battery assessment result is NoAssessment.

##### `FEEDBACK_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case FEEDBACK FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - publication directive is not ResetPublication
>   - the value of publicationState on entry is not FaultHold
>   - It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - control use feedback ticket is NoTicket
>           - control use feedback disposition is NoFeedback
>       - All of the following conditions hold:
>         
>           - the value of publicationState on entry is OfferedTokenA
>           - control use feedback ticket is TokenA
>           - At least one of the following conditions holds:
>             
>               - control use feedback disposition is Pending
>               - control use feedback disposition is Consumed
>       - All of the following conditions hold:
>         
>           - the value of publicationState on entry is OfferedTokenB
>           - control use feedback ticket is TokenB
>           - At least one of the following conditions holds:
>             
>               - control use feedback disposition is Pending
>               - control use feedback disposition is Consumed.

> When all applicability conditions are met, ResultCustody shall produce a result for which all of the following conditions hold:
>
> publicationState is FaultHold, retainedAssessment is NoAssessment, committedPublicationOutcome is PublicationFault, battery assessment ticket is NoTicket, and battery assessment result is NoAssessment.

##### `CONSUME_TOKEN_A` — Conditional behavior

> During contract evaluation for the compute phase, if the value of publicationState on entry is OfferedTokenA, control use feedback ticket is TokenA, control use feedback disposition is Consumed, and publication directive is not ResetPublication, ResultCustody shall set publicationState to Empty, retainedAssessment to NoAssessment, committedPublicationOutcome to Consumed, battery assessment ticket to NoTicket, and battery assessment result to NoAssessment.

##### `CONSUME_TOKEN_B` — Conditional behavior

> During contract evaluation for the compute phase, if the value of publicationState on entry is OfferedTokenB, control use feedback ticket is TokenB, control use feedback disposition is Consumed, and publication directive is not ResetPublication, ResultCustody shall set publicationState to Empty, retainedAssessment to NoAssessment, committedPublicationOutcome to Consumed, battery assessment ticket to NoTicket, and battery assessment result to NoAssessment.

##### `WITHDRAW_COHERENT_OFFER` — Conditional behavior

> During contract evaluation for the compute phase, case WITHDRAW COHERENT OFFER applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of publicationState on entry is OfferedTokenA
>       - the value of publicationState on entry is OfferedTokenB
>   - publication directive is Withdraw
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - control use feedback ticket is NoTicket
>           - control use feedback disposition is NoFeedback
>       - All of the following conditions hold:
>         
>           - the value of publicationState on entry is OfferedTokenA
>           - control use feedback ticket is TokenA
>           - control use feedback disposition is Pending
>       - All of the following conditions hold:
>         
>           - the value of publicationState on entry is OfferedTokenB
>           - control use feedback ticket is TokenB
>           - control use feedback disposition is Pending.

> When all applicability conditions are met, ResultCustody shall produce a result for which all of the following conditions hold:
>
> publicationState is Empty, retainedAssessment is NoAssessment, committedPublicationOutcome is Cancelled, battery assessment ticket is NoTicket, and battery assessment result is NoAssessment.

##### `PRESERVE_TOKEN_A` — Conditional behavior

> During contract evaluation for the compute phase, case PRESERVE TOKEN A applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of publicationState on entry is OfferedTokenA
>   - publication directive is NoPublicationDirective
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - control use feedback ticket is NoTicket
>           - control use feedback disposition is NoFeedback
>       - All of the following conditions hold:
>         
>           - control use feedback ticket is TokenA
>           - control use feedback disposition is Pending.

> When all applicability conditions are met, ResultCustody shall produce a result for which all of the following conditions hold:
>
> publicationState is OfferedTokenA, retainedAssessment is the value of retainedAssessment on entry, committedPublicationOutcome is OfferedTokenA, battery assessment ticket is TokenA, and battery assessment result is the value of retainedAssessment on entry.

##### `PRESERVE_TOKEN_B` — Conditional behavior

> During contract evaluation for the compute phase, case PRESERVE TOKEN B applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of publicationState on entry is OfferedTokenB
>   - publication directive is NoPublicationDirective
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - control use feedback ticket is NoTicket
>           - control use feedback disposition is NoFeedback
>       - All of the following conditions hold:
>         
>           - control use feedback ticket is TokenB
>           - control use feedback disposition is Pending.

> When all applicability conditions are met, ResultCustody shall produce a result for which all of the following conditions hold:
>
> publicationState is OfferedTokenB, retainedAssessment is the value of retainedAssessment on entry, committedPublicationOutcome is OfferedTokenB, battery assessment ticket is TokenB, and battery assessment result is the value of retainedAssessment on entry.

##### `OPEN_TOKEN_A` — Conditional behavior

> During contract evaluation for the compute phase, if the value of publicationState on entry is Empty, control use feedback ticket is NoTicket, control use feedback disposition is NoFeedback, publication directive is OpenTokenA, decision assessment ticket is TokenA, and decision assessment result is not NoAssessment, ResultCustody shall set publicationState to OfferedTokenA, retainedAssessment to decision assessment result, committedPublicationOutcome to OfferedTokenA, battery assessment ticket to TokenA, and battery assessment result to decision assessment result.

##### `OPEN_TOKEN_B` — Conditional behavior

> During contract evaluation for the compute phase, if the value of publicationState on entry is Empty, control use feedback ticket is NoTicket, control use feedback disposition is NoFeedback, publication directive is OpenTokenB, decision assessment ticket is TokenB, and decision assessment result is not NoAssessment, ResultCustody shall set publicationState to OfferedTokenB, retainedAssessment to decision assessment result, committedPublicationOutcome to OfferedTokenB, battery assessment ticket to TokenB, and battery assessment result to decision assessment result.

##### `CUSTODY_INACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of publicationState on entry is Empty, control use feedback ticket is NoTicket, control use feedback disposition is NoFeedback, publication directive is not ResetPublication, it is not the case that publication directive is OpenTokenA, decision assessment ticket is TokenA, and decision assessment result is not NoAssessment, and it is not the case that publication directive is OpenTokenB, decision assessment ticket is TokenB, and decision assessment result is not NoAssessment, ResultCustody shall set publicationState to Empty, retainedAssessment to NoAssessment, committedPublicationOutcome to NoPublicationOutcome, battery assessment ticket to NoTicket, and battery assessment result to NoAssessment.
