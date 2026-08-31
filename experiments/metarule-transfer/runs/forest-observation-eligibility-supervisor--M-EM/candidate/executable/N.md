# Forest Observation Eligibility Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: An observation requester needs a bounded, inspectable answer to whether one
requested camera-and-radio observation service may proceed using the currently supplied
energy and observation-support evidence. The need is permission control only; it is not
control of flight, navigation, propulsion, fire response, or physical observation
performance.

PURPOSE-01: The system will accept one logical observation request at a time, qualify
the request and supplied evidence, issue or withhold observation-service authorization,
publish the request outcome, withdraw authorization on completion, cancellation, or
service fault, and require a fresh request after denial or recovery.

GOAL-01: The system shall never issue `Permit` unless a fresh request is pending and
both energy evidence and camera/radio support evidence are currently trusted and ready.
Rationale: permission must be based on all selected prerequisites, without claiming that
the prerequisites make flight or observation physically safe.

GOAL-02: The system shall deterministically withhold authorization and publish one
bounded reason for every non-permit request outcome. Rationale: a single reason makes
the policy reviewable; the reason priority is a selected pilot policy, not a handbook or
source fact.

GOAL-03: The system shall remove authorization on cancellation, completion, reported
service failure, or inconsistent service-progress feedback, and shall not authorize
again merely because evidence or service feedback later improves.

GOAL-04: The system shall distinguish a fresh request from a replay and shall prevent a
second logical observation service while a request is pending or engaged.

### Operational context and boundary

CTX-01: [inferred external role] The Observation Requester supplies request commands and
alternating request tokens and receives the published request outcome. It does not
receive mission authority from this system.

CTX-02: [inferred external role from named equipment] The Power Evidence Source supplies
one qualitative battery evidence value and is responsible for the declared meaning,
validity, and freshness of that value.

CTX-03: [inferred external role from named camera] The Camera Evidence Source supplies
camera-support evidence and is responsible for the declared meaning, validity, and
freshness of that value.

CTX-04: [inferred external role from named radio equipment] The Radio Evidence Source
supplies radio-support evidence and is responsible for the declared meaning, validity,
and freshness of that value.

CTX-05: [inferred external role] The Observation Service consumes logical authorization
and reports its progress. The service, its payload behavior, and any flight or
communications implementation remain outside the boundary.

MON-01: `RequestInput` from `CTX-01` is the finite pair `RequestCommand = {NoCommand,
Begin, Cancel}` and `RequestToken = {TokenA, TokenB}`. `Begin` is fresh exactly when its
token differs from the last accepted token; `Cancel` applies to the outstanding request
and does not require a new token.

MON-02: `EnergyEvidence` from `CTX-02` is exactly `{AdequateCurrent, LowCurrent,
UnknownCurrent, Invalid, Stale}`. Units and numeric thresholds are intentionally absent
because the source establishes only a qualitative status.

MON-03: `CameraEvidence` from `CTX-03` is exactly `{AvailableCurrent,
UnavailableCurrent, UnknownCurrent, Invalid, Stale}`.

MON-04: `RadioEvidence` from `CTX-04` is exactly `{AvailableCurrent, UnavailableCurrent,
UnknownCurrent, Invalid, Stale}`.

MON-05: `ObservationProgress` from `CTX-05` is exactly `{Idle, Active, Completed,
Failed}`. `Active` while the authorization gate is closed and regression from gate phase
`Active` to reported progress `Idle` without `Completed` are inconsistent feedback and
are treated as service faults; the value does not prove physical cessation or success.

CTRL-01: `ObservationAuthorization` to `CTX-05` is exactly `{Withhold, Permit}`.
`Withhold` is the initialized and fail-closed value. The directly controlled effect is
only whether this system grants logical permission to the external observation service.

CTRL-02: `EligibilityStatus` to `CTX-01` is exactly `{Idle, Evaluating, Authorized,
Active, DeniedPower, DeniedSupport, DuplicateIgnored, Busy, Cancelled, Completed,
ServiceFailed, AwaitingRecovery}`. It reports the current transition outcome and does
not assert physical mission success.

### Environmental assumptions and selected logical ordering

ASM-01: `CTX-01` shall alternate `TokenA` and `TokenB` on successive genuinely new
`Begin` commands and shall retain the current token for a retry of the same request.
Rationale: a two-value finite token lets the model distinguish freshness without
unbounded identifiers; violation fails closed as `DuplicateIgnored`.

ASM-02: `CTX-02`, `CTX-03`, and `CTX-04` are responsible for using `Current`, `Stale`,
`Invalid`, and `Unknown` consistently with their own evidence. The supervisor does not
independently measure age or diagnose a source.

ASM-03: The evidence values presented for an accepted evaluation ticket shall remain
stable until the corresponding verdict is consumed. Rationale: this logical snapshot
assumption avoids inventing physical time bounds and gives one request one coherent
evidence set.

ASM-04: `CTX-05` shall honor `Withhold` as removal of logical permission and shall
eventually report `Completed`, `Failed`, or `Idle` according to its own behavior. This
is an environmental contract assumption, not evidence that a physical payload or
aircraft stops safely.

ASM-05: A logical step processes previously committed gate feedback before a new request
command, and a new permit decision takes effect after both verdicts for the same
evaluation ticket exist. Rationale: deterministic abstract ordering closes simultaneous
completion, failure, cancellation, and fresh-request cases without asserting a schedule
or latency.

### State and decision ownership

MODE-01: The externally distinguishable system conditions are quiescent (`Withhold`,
`Idle`), evaluating (`Withhold`, `Evaluating`), engaged (`Permit`, `Authorized|Active`),
denied (`Withhold`, one denial status), and recovery hold (`Withhold`,
`ServiceFailed|AwaitingRecovery`). These are observable combinations of owned state and
outputs, not an additional state owner.

### Risks and fault mitigations

RISK-01: If stale, invalid, unknown, absent, or mismatched energy/camera/radio
evaluation data were treated as ready, the supervisor could authorize service without
its selected logical prerequisites being established. Likelihood and physical severity
are unknown and intentionally unclassified.

RISK-02: If authorization remained asserted after cancellation, completion, service
failure, or inconsistent progress, the external service could retain this system's
logical permission after the request ended or became inconsistent.

## Supporting contract definitions

### State `Forest_Observation_Eligibility_Supervisor::AuthorizationGate::gatePhase`

State `gatePhase` has type `Forest_Observation_Eligibility_Supervisor::GatePhase`.

### State `Forest_Observation_Eligibility_Supervisor::RequestLifecycle::requestState`

State `requestState` has type `Forest_Observation_Eligibility_Supervisor::RequestState`.

### State `Forest_Observation_Eligibility_Supervisor::RequestLifecycle::lastAcceptedToken`

State `lastAcceptedToken` has type `Forest_Observation_Eligibility_Supervisor::LastAcceptedToken`.

## Detailed behavioral requirements

### Requirements for AuthorizationGate

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_GATE` — Required behavior

> During contract evaluation for the initialization phase, AuthorizationGate shall set gatePhase to Closed, observationAuthorization to Withhold, and gateOutcome to None.

#### Contract clauses evaluated in the compute phase

##### `FAILURE_HOLD_WITHHOLDS` — Required behavior

> During contract evaluation for the compute phase, AuthorizationGate shall produce a result for which if gatePhase is FailureHold, then observationAuthorization is Withhold.

##### `GATE_RECOVERED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of gatePhase on entry is FailureHold and observationProgress is Idle, AuthorizationGate shall set gatePhase to Closed, observationAuthorization to Withhold, and gateOutcome to Recovered.

##### `GATE_RECOVERY_RETAINED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of gatePhase on entry is FailureHold and observationProgress is not Idle, AuthorizationGate shall set gatePhase to FailureHold, observationAuthorization to Withhold, and gateOutcome to None.

##### `GATE_REPORTED_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of gatePhase on entry is not FailureHold and observationProgress is Failed, AuthorizationGate shall set gatePhase to FailureHold, observationAuthorization to Withhold, and gateOutcome to Failed.

##### `GATE_ACTIVE_WHILE_CLOSED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of gatePhase on entry is Closed and observationProgress is Active, AuthorizationGate shall set gatePhase to FailureHold, observationAuthorization to Withhold, and gateOutcome to Failed.

##### `GATE_ACTIVE_TO_IDLE_REGRESSION` — Conditional behavior

> During contract evaluation for the compute phase, if the value of gatePhase on entry is Active and observationProgress is Idle, AuthorizationGate shall set gatePhase to FailureHold, observationAuthorization to Withhold, and gateOutcome to Failed.

##### `GATE_WITHDRAWAL` — Conditional behavior

> During contract evaluation for the compute phase, if the value of gatePhase on entry is not FailureHold, observationProgress is not Failed, it is not the case that the value of gatePhase on entry is Closed and observationProgress is Active, it is not the case that the value of gatePhase on entry is Active and observationProgress is Idle, and eligibilityDecision is Withdraw, AuthorizationGate shall set gatePhase to Closed, observationAuthorization to Withhold, and gateOutcome to Cancelled.

##### `GATE_COMPLETION` — Conditional behavior

> During contract evaluation for the compute phase, case GATE COMPLETION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of gatePhase on entry is Authorized
>       - the value of gatePhase on entry is Active
>   - observationProgress is Completed
>   - eligibilityDecision is not Withdraw.

> When all applicability conditions are met, AuthorizationGate shall produce a result for which all of the following conditions hold:
>
> gatePhase is Closed, observationAuthorization is Withhold, and gateOutcome is Completed.

##### `GATE_DENIED_POWER` — Conditional behavior

> During contract evaluation for the compute phase, case GATE DENIED POWER applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of gatePhase on entry is not FailureHold
>   - observationProgress is not Failed
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - the value of gatePhase on entry is Closed
>       - observationProgress is Active
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - the value of gatePhase on entry is Active
>       - observationProgress is Idle
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - the value of gatePhase on entry is Authorized
>           - the value of gatePhase on entry is Active
>       - observationProgress is Completed
>   - eligibilityDecision is DenyPower.

> When all applicability conditions are met, AuthorizationGate shall produce a result for which all of the following conditions hold:
>
> gatePhase is Closed, observationAuthorization is Withhold, and gateOutcome is DeniedPower.

##### `GATE_DENIED_SUPPORT` — Conditional behavior

> During contract evaluation for the compute phase, case GATE DENIED SUPPORT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of gatePhase on entry is not FailureHold
>   - observationProgress is not Failed
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - the value of gatePhase on entry is Closed
>       - observationProgress is Active
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - the value of gatePhase on entry is Active
>       - observationProgress is Idle
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - the value of gatePhase on entry is Authorized
>           - the value of gatePhase on entry is Active
>       - observationProgress is Completed
>   - eligibilityDecision is DenySupport.

> When all applicability conditions are met, AuthorizationGate shall produce a result for which all of the following conditions hold:
>
> gatePhase is Closed, observationAuthorization is Withhold, and gateOutcome is DeniedSupport.

##### `GATE_PERMIT_FROM_CLOSED` — Conditional behavior

> During contract evaluation for the compute phase, if the value of gatePhase on entry is Closed, observationProgress is Idle, and eligibilityDecision is Permit, AuthorizationGate shall set gatePhase to Authorized, observationAuthorization to Permit, and gateOutcome to Authorized.

##### `GATE_PROGRESS_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, case GATE PROGRESS ACTIVE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of gatePhase on entry is Authorized
>       - the value of gatePhase on entry is Active
>   - observationProgress is Active
>   - eligibilityDecision is not Withdraw
>   - eligibilityDecision is not DenyPower
>   - eligibilityDecision is not DenySupport.

> When all applicability conditions are met, AuthorizationGate shall produce a result for which all of the following conditions hold:
>
> gatePhase is Active, observationAuthorization is Permit, and gateOutcome is Active.

##### `GATE_AUTHORIZED_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, case GATE AUTHORIZED IDLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of gatePhase on entry is Authorized
>   - observationProgress is Idle
>   - At least one of the following conditions holds:
>     
>       - eligibilityDecision is NoDecision
>       - eligibilityDecision is Permit.

> When all applicability conditions are met, AuthorizationGate shall produce a result for which all of the following conditions hold:
>
> gatePhase is Authorized, observationAuthorization is Permit, and gateOutcome is Authorized.

##### `GATE_CLOSED_QUIESCENT` — Conditional behavior

> During contract evaluation for the compute phase, if the value of gatePhase on entry is Closed, observationProgress is not Failed, observationProgress is not Active, eligibilityDecision is not Withdraw, eligibilityDecision is not DenyPower, eligibilityDecision is not DenySupport, and it is not the case that observationProgress is Idle and eligibilityDecision is Permit, AuthorizationGate shall set gatePhase to Closed, observationAuthorization to Withhold, and gateOutcome to None.

### Requirements for EligibilityArbiter

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DECISION` — Required behavior

> During contract evaluation for the initialization phase, EligibilityArbiter shall set eligibilityDecision to NoDecision.

#### Contract clauses evaluated in the compute phase

##### `ARBITER_WITHDRAW` — Conditional behavior

> During contract evaluation for the compute phase, if requestContext is CancelOutstanding, EligibilityArbiter shall set eligibilityDecision to Withdraw.

##### `ARBITER_POWER_INSUFFICIENT` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER POWER INSUFFICIENT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenA
>           - energyVerdictIn ticket is TokenA
>           - supportVerdictIn ticket is TokenA
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenB
>           - energyVerdictIn ticket is TokenB
>           - supportVerdictIn ticket is TokenB
>   - energyVerdictIn verdict is EnergyInsufficient
>   - supportVerdictIn verdict is not NoSupportVerdict.

> When all applicability conditions are met, EligibilityArbiter shall produce a result for which all of the following conditions hold:
>
> eligibilityDecision is DenyPower.

##### `ARBITER_POWER_UNTRUSTED` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER POWER UNTRUSTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenA
>           - energyVerdictIn ticket is TokenA
>           - supportVerdictIn ticket is TokenA
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenB
>           - energyVerdictIn ticket is TokenB
>           - supportVerdictIn ticket is TokenB
>   - energyVerdictIn verdict is EnergyUntrusted
>   - supportVerdictIn verdict is not NoSupportVerdict.

> When all applicability conditions are met, EligibilityArbiter shall produce a result for which all of the following conditions hold:
>
> eligibilityDecision is DenyPower.

##### `ARBITER_SUPPORT_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER SUPPORT UNAVAILABLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenA
>           - energyVerdictIn ticket is TokenA
>           - supportVerdictIn ticket is TokenA
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenB
>           - energyVerdictIn ticket is TokenB
>           - supportVerdictIn ticket is TokenB
>   - energyVerdictIn verdict is EnergyReady
>   - supportVerdictIn verdict is SupportUnavailable.

> When all applicability conditions are met, EligibilityArbiter shall produce a result for which all of the following conditions hold:
>
> eligibilityDecision is DenySupport.

##### `ARBITER_SUPPORT_UNTRUSTED` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER SUPPORT UNTRUSTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenA
>           - energyVerdictIn ticket is TokenA
>           - supportVerdictIn ticket is TokenA
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenB
>           - energyVerdictIn ticket is TokenB
>           - supportVerdictIn ticket is TokenB
>   - energyVerdictIn verdict is EnergyReady
>   - supportVerdictIn verdict is SupportUntrusted.

> When all applicability conditions are met, EligibilityArbiter shall produce a result for which all of the following conditions hold:
>
> eligibilityDecision is DenySupport.

##### `ARBITER_PERMIT` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER PERMIT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenA
>           - energyVerdictIn ticket is TokenA
>           - supportVerdictIn ticket is TokenA
>       - All of the following conditions hold:
>         
>           - requestContext is EvaluateTokenB
>           - energyVerdictIn ticket is TokenB
>           - supportVerdictIn ticket is TokenB
>   - energyVerdictIn verdict is EnergyReady
>   - supportVerdictIn verdict is SupportReady.

> When all applicability conditions are met, EligibilityArbiter shall produce a result for which all of the following conditions hold:
>
> eligibilityDecision is Permit.

##### `ARBITER_INACTIVE_OR_MISMATCH` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER INACTIVE OR MISMATCH applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - requestContext is not CancelOutstanding
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - requestContext is EvaluateTokenA
>               - energyVerdictIn ticket is TokenA
>               - supportVerdictIn ticket is TokenA
>           - All of the following conditions hold:
>             
>               - requestContext is EvaluateTokenB
>               - energyVerdictIn ticket is TokenB
>               - supportVerdictIn ticket is TokenB
>       - energyVerdictIn verdict is not NoEnergyVerdict
>       - supportVerdictIn verdict is not NoSupportVerdict.

> When all applicability conditions are met, EligibilityArbiter shall produce a result for which all of the following conditions hold:
>
> eligibilityDecision is NoDecision.

### Requirements for EnergyAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ENERGY_VERDICT` — Required behavior

> During contract evaluation for the initialization phase, EnergyAssessor shall set energyVerdictOut verdict to NoEnergyVerdict and energyVerdictOut ticket to NoTicket.

#### Contract clauses evaluated in the compute phase

##### `ENERGY_INACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if evaluationTicket is NoTicket, EnergyAssessor shall set energyVerdictOut ticket to NoTicket and energyVerdictOut verdict to NoEnergyVerdict.

##### `ENERGY_READY` — Conditional behavior

> During contract evaluation for the compute phase, if evaluationTicket is not NoTicket and energyEvidence is AdequateCurrent, EnergyAssessor shall produce a result for which if evaluationTicket is TokenA, then energyVerdictOut ticket is TokenA, if evaluationTicket is TokenB, then energyVerdictOut ticket is TokenB, and energyVerdictOut verdict is EnergyReady.

##### `ENERGY_INSUFFICIENT` — Conditional behavior

> During contract evaluation for the compute phase, if evaluationTicket is not NoTicket and energyEvidence is LowCurrent, EnergyAssessor shall produce a result for which if evaluationTicket is TokenA, then energyVerdictOut ticket is TokenA, if evaluationTicket is TokenB, then energyVerdictOut ticket is TokenB, and energyVerdictOut verdict is EnergyInsufficient.

##### `ENERGY_UNTRUSTED` — Conditional behavior

> During contract evaluation for the compute phase, case ENERGY UNTRUSTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - evaluationTicket is not NoTicket
>   - At least one of the following conditions holds:
>     
>       - energyEvidence is UnknownCurrent
>       - energyEvidence is Invalid
>       - energyEvidence is Stale.

> When all applicability conditions are met, EnergyAssessor shall produce a result for which all of the following conditions hold:
>
> if evaluationTicket is TokenA, then energyVerdictOut ticket is TokenA, if evaluationTicket is TokenB, then energyVerdictOut ticket is TokenB, and energyVerdictOut verdict is EnergyUntrusted.

### Requirements for ObservationSupportAssessor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SUPPORT_VERDICT` — Required behavior

> During contract evaluation for the initialization phase, ObservationSupportAssessor shall set supportVerdictOut ticket to NoTicket and supportVerdictOut verdict to NoSupportVerdict.

#### Contract clauses evaluated in the compute phase

##### `SUPPORT_INACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if evaluationTicket is NoTicket, ObservationSupportAssessor shall set supportVerdictOut ticket to NoTicket and supportVerdictOut verdict to NoSupportVerdict.

##### `SUPPORT_READY` — Conditional behavior

> During contract evaluation for the compute phase, if evaluationTicket is not NoTicket, cameraEvidence is AvailableCurrent, and radioEvidence is AvailableCurrent, ObservationSupportAssessor shall produce a result for which if evaluationTicket is TokenA, then supportVerdictOut ticket is TokenA, if evaluationTicket is TokenB, then supportVerdictOut ticket is TokenB, and supportVerdictOut verdict is SupportReady.

##### `SUPPORT_UNTRUSTED` — Conditional behavior

> During contract evaluation for the compute phase, case SUPPORT UNTRUSTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - evaluationTicket is not NoTicket
>   - At least one of the following conditions holds:
>     
>       - cameraEvidence is UnknownCurrent
>       - cameraEvidence is Invalid
>       - cameraEvidence is Stale
>       - radioEvidence is UnknownCurrent
>       - radioEvidence is Invalid
>       - radioEvidence is Stale.

> When all applicability conditions are met, ObservationSupportAssessor shall produce a result for which all of the following conditions hold:
>
> if evaluationTicket is TokenA, then supportVerdictOut ticket is TokenA, if evaluationTicket is TokenB, then supportVerdictOut ticket is TokenB, and supportVerdictOut verdict is SupportUntrusted.

##### `SUPPORT_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, case SUPPORT UNAVAILABLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - evaluationTicket is not NoTicket
>   - cameraEvidence is not UnknownCurrent
>   - cameraEvidence is not Invalid
>   - cameraEvidence is not Stale
>   - radioEvidence is not UnknownCurrent
>   - radioEvidence is not Invalid
>   - radioEvidence is not Stale
>   - At least one of the following conditions holds:
>     
>       - cameraEvidence is UnavailableCurrent
>       - radioEvidence is UnavailableCurrent.

> When all applicability conditions are met, ObservationSupportAssessor shall produce a result for which all of the following conditions hold:
>
> if evaluationTicket is TokenA, then supportVerdictOut ticket is TokenA, if evaluationTicket is TokenB, then supportVerdictOut ticket is TokenB, and supportVerdictOut verdict is SupportUnavailable.

### Requirements for RequestLifecycle

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_LIFECYCLE` — Required behavior

> During contract evaluation for the initialization phase, RequestLifecycle shall set requestState to Idle, lastAcceptedToken to None, energyTicket to NoTicket, supportTicket to NoTicket, requestContext to NoContext, and eligibilityStatus to Idle.

#### Contract clauses evaluated in the compute phase

##### `INACTIVE_PIPELINE_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, RequestLifecycle shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     energyTicket is NoTicket
>     
>     **Second condition:**
>     
>     supportTicket is NoTicket
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     energyTicket is TokenA
>     
>     **Second condition:**
>     
>     supportTicket is TokenA
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     energyTicket is TokenB
>     
>     **Second condition:**
>     
>     supportTicket is TokenB.

##### `LIFECYCLE_FAILED_FEEDBACK` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is Failed, RequestLifecycle shall set requestState to RecoveryHold, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to ServiceFailed.

##### `LIFECYCLE_RECOVERED_FEEDBACK` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is Recovered, RequestLifecycle shall set requestState to Idle, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to Idle.

##### `LIFECYCLE_DENIED_POWER` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is DeniedPower, RequestLifecycle shall set requestState to Idle, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to DeniedPower.

##### `LIFECYCLE_DENIED_SUPPORT` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is DeniedSupport, RequestLifecycle shall set requestState to Idle, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to DeniedSupport.

##### `LIFECYCLE_CANCELLED` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is Cancelled, RequestLifecycle shall set requestState to Idle, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to Cancelled.

##### `LIFECYCLE_COMPLETED` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is Completed, RequestLifecycle shall set requestState to Idle, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to Completed.

##### `LIFECYCLE_AUTHORIZED` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is Authorized, RequestLifecycle shall set requestState to Engaged, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to Authorized.

##### `LIFECYCLE_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is Active, RequestLifecycle shall set requestState to Engaged, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to Active.

##### `LIFECYCLE_NO_COMMAND` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is None and requestInput command is NoCommand, RequestLifecycle shall produce a result for which requestState is the value of requestState on entry, lastAcceptedToken is the value of lastAcceptedToken on entry, energyTicket is NoTicket, supportTicket is NoTicket, requestContext is NoContext, if the value of requestState on entry is Idle, then eligibilityStatus is Idle, if the value of requestState on entry is Pending, then eligibilityStatus is Evaluating, if the value of requestState on entry is Engaged, then eligibilityStatus is Active, and if the value of requestState on entry is RecoveryHold, then eligibilityStatus is AwaitingRecovery.

##### `LIFECYCLE_CANCEL_OUTSTANDING` — Conditional behavior

> During contract evaluation for the compute phase, case LIFECYCLE CANCEL OUTSTANDING applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - gateOutcome is None
>   - requestInput command is Cancel
>   - At least one of the following conditions holds:
>     
>       - the value of requestState on entry is Pending
>       - the value of requestState on entry is Engaged.

> When all applicability conditions are met, RequestLifecycle shall produce a result for which all of the following conditions hold:
>
> requestState is the value of requestState on entry, lastAcceptedToken is the value of lastAcceptedToken on entry, energyTicket is NoTicket, supportTicket is NoTicket, requestContext is CancelOutstanding, and eligibilityStatus is Evaluating.

##### `LIFECYCLE_CANCEL_NOOP` — Conditional behavior

> During contract evaluation for the compute phase, case LIFECYCLE CANCEL NOOP applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - gateOutcome is None
>   - requestInput command is Cancel
>   - At least one of the following conditions holds:
>     
>       - the value of requestState on entry is Idle
>       - the value of requestState on entry is RecoveryHold.

> When all applicability conditions are met, RequestLifecycle shall produce a result for which all of the following conditions hold:
>
> requestState is the value of requestState on entry, lastAcceptedToken is the value of lastAcceptedToken on entry, energyTicket is NoTicket, supportTicket is NoTicket, requestContext is NoContext, if the value of requestState on entry is Idle, then eligibilityStatus is Idle, and if the value of requestState on entry is RecoveryHold, then eligibilityStatus is AwaitingRecovery.

##### `LIFECYCLE_BEGIN_DURING_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is None, requestInput command is Begin, and the value of requestState on entry is RecoveryHold, RequestLifecycle shall set requestState to RecoveryHold, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to AwaitingRecovery.

##### `LIFECYCLE_REPLAY_TOKEN_A` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is None, requestInput command is Begin, requestInput token is TokenA, the value of lastAcceptedToken on entry is TokenA, and the value of requestState on entry is not RecoveryHold, RequestLifecycle shall preserve the value of requestState on entry, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to DuplicateIgnored.

##### `LIFECYCLE_REPLAY_TOKEN_B` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is None, requestInput command is Begin, requestInput token is TokenB, the value of lastAcceptedToken on entry is TokenB, and the value of requestState on entry is not RecoveryHold, RequestLifecycle shall preserve the value of requestState on entry, preserve the value of lastAcceptedToken on entry, set energyTicket to NoTicket, set supportTicket to NoTicket, set requestContext to NoContext, and set eligibilityStatus to DuplicateIgnored.

##### `LIFECYCLE_FRESH_TOKEN_A` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is None, requestInput command is Begin, requestInput token is TokenA, the value of lastAcceptedToken on entry is not TokenA, and the value of requestState on entry is Idle, RequestLifecycle shall set requestState to Pending, lastAcceptedToken to TokenA, energyTicket to TokenA, supportTicket to TokenA, requestContext to EvaluateTokenA, and eligibilityStatus to Evaluating.

##### `LIFECYCLE_FRESH_TOKEN_B` — Conditional behavior

> During contract evaluation for the compute phase, if gateOutcome is None, requestInput command is Begin, requestInput token is TokenB, the value of lastAcceptedToken on entry is not TokenB, and the value of requestState on entry is Idle, RequestLifecycle shall set requestState to Pending, lastAcceptedToken to TokenB, energyTicket to TokenB, supportTicket to TokenB, requestContext to EvaluateTokenB, and eligibilityStatus to Evaluating.

##### `LIFECYCLE_BUSY_TOKEN_A` — Conditional behavior

> During contract evaluation for the compute phase, case LIFECYCLE BUSY TOKEN A applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - gateOutcome is None
>   - requestInput command is Begin
>   - requestInput token is TokenA
>   - the value of lastAcceptedToken on entry is not TokenA
>   - At least one of the following conditions holds:
>     
>       - the value of requestState on entry is Pending
>       - the value of requestState on entry is Engaged.

> When all applicability conditions are met, RequestLifecycle shall produce a result for which all of the following conditions hold:
>
> requestState is the value of requestState on entry, lastAcceptedToken is the value of lastAcceptedToken on entry, energyTicket is NoTicket, supportTicket is NoTicket, requestContext is NoContext, and eligibilityStatus is Busy.

##### `LIFECYCLE_BUSY_TOKEN_B` — Conditional behavior

> During contract evaluation for the compute phase, case LIFECYCLE BUSY TOKEN B applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - gateOutcome is None
>   - requestInput command is Begin
>   - requestInput token is TokenB
>   - the value of lastAcceptedToken on entry is not TokenB
>   - At least one of the following conditions holds:
>     
>       - the value of requestState on entry is Pending
>       - the value of requestState on entry is Engaged.

> When all applicability conditions are met, RequestLifecycle shall produce a result for which all of the following conditions hold:
>
> requestState is the value of requestState on entry, lastAcceptedToken is the value of lastAcceptedToken on entry, energyTicket is NoTicket, supportTicket is NoTicket, requestContext is NoContext, and eligibilityStatus is Busy.
