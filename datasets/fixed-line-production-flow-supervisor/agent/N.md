# Fixed-Line Production Flow Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: A Manufacturer operating the seed's fixed angle-production sequence needs a
bounded logical supervisor that admits one work item, preserves its identity while it
progresses through heating, bending, cutting, drilling, grinding, and polishing, and
makes blocked, failed, recovered, and completed progress observable without controlling
finished-product dispatch.

PURPOSE-01: The system will coordinate logical production flow from a scheduling request
and material handoff through step release, step-to-step transfer, one bounded same-step
retry, and production completion reporting. It does not execute a physical process,
schedule multiple jobs, manage shipment, or certify product quality.

GOAL-01: The system shall start a well-formed work item only when its correlated
material and the heating step are qualified ready.

GOAL-02: The system shall preserve one active work identity and advance it only in the
source-grounded step order.

GOAL-03: The system shall make fresh-admission, material-wait, station-wait, active,
recovery, completion, and failure outcomes externally distinguishable.

GOAL-04: The system shall prevent a fresh request from displacing active,
transfer-pending, or recovery-pending work; a pending retry shall outrank simultaneous
fresh admission.

GOAL-05: The system shall correlate process results to the active work item and step,
permit at most one later retry of a failed step, and terminate rather than retry a
second failure.

### Operational context and boundary

CTX-01: Production Scheduling is external. It supplies at most one presented
production-work request per evaluation and receives logical flow status and terminal
production outcome.

CTX-02: Storage Material Handoff is external. It reports whether material correlated to
the presented fresh work identifier is ready, unavailable, or of unknown validity; it is
not controlled by this system.

CTX-03: Fixed Angle-Production Line is external. It reports the readiness of one
relevant target step and process progress for one work item and step, and receives
logical start, advance, retry, or abort commands. Physical station behavior and product
conformance remain outside the boundary.

CTX-04: Downstream Storage or Dispatch is context only. A successful production outcome
may later become product availability, but no shipment request, shipment state, dispatch
release, or shipping confirmation crosses this system boundary.

MON-01: `PresentedWorkRequest` from CTX-01 is a finite record `{presence, validity,
workId, product}` where `presence = None | Present`, `validity = Valid | Invalid`,
`workId = NoWork | W1 | W2`, and `product = AngleProduct | UnsupportedProduct`. A fresh
request is eligible exactly when it is present, valid, has `W1` or `W2`, and names
`AngleProduct`.

MON-02: `MaterialHandoffObservation` from CTX-02 is a finite record `{validity, workId,
disposition}` where `validity = Valid | Invalid`, `workId = NoWork | W1 | W2`, and
`disposition = Ready | Unavailable`. It qualifies as ready only when valid and
correlated to the eligible presented work identifier; invalid or mismatched observations
are `Unknown`.

MON-03: `StepReadinessObservation` from CTX-03 is a finite record `{validity, step,
disposition}` where `validity = Valid | Invalid`, `step = Heating | Bending | Cutting |
Drilling | Grinding | Polishing`, and `disposition = Ready | Blocked`. The relevant
target is heating in idle/fresh context, the successor of the active non-polishing step
during progress, polishing as an ignored readiness target while active at polishing, the
held successor for transfer, and the failed current step for recovery.

MON-04: `ProcessResultObservation` from CTX-03 is a finite record `{validity, workId,
step, event}` where `validity = Valid | Invalid`, `workId = NoWork | W1 | W2`, `step`
uses the six-value sequence, and `event = NoEvent | InProgress | Completed | Failed`.
Only a valid observation correlated to both active work identifier and active step can
complete or fail that step.

CTRL-01: `LineFlowCommand` to CTX-03 is a finite record `{action, workId, step}` where
`action = NoCommand | Start | Advance | Retry | Abort`. Every non-`NoCommand` output
shall carry the retained active or newly admitted identifier and the exact commanded
step; `Abort` terminates logical supervision and does not claim physical stoppage.

CTRL-02: `ProductionOutcome` to CTX-01 is a finite record `{result, workId}` where
`result = None | ProductionComplete | ProductionFailed`. It is emitted once on entry to
the corresponding terminal state and is suppressed during the following deterministic
reset.

CTRL-03: `ProductionFlowStatus` to CTX-01 is one of `Idle | Rejected | WaitingMaterial |
WaitingStation | Started | Processing | Busy | Recovering | Advanced | Completed |
Failed`. It reports the current logical disposition and does not promise a duration or
delivery date.

### Nominal, boundary, fault, and recovery behavior

RISK-01: Accepting stale or mismatched progress could advance or complete the wrong work
item; FAULT-01 and PART-04 correlation mitigate this logical consequence. Likelihood and
severity are not asserted.

RISK-02: Letting a fresh request displace a held transfer or recovery could lose the
original work identity or apply a retry to the wrong step; POL-02, POL-03, BEH-03, and
stored-context ownership mitigate this consequence.

RISK-03: Retrying repeatedly after a step fault could prevent terminal disposition;
POL-04 and FAULT-03 bound recovery to one same-step retry. No physical safety or
recovery-time claim is made.

### Essential environmental assumptions

ASM-01: CTX-01 is responsible for presenting at most one request record per evaluation,
treating repeated presentation as a new candidate rather than an acknowledgement
protocol, and re-presenting a request on an idle evaluation if it was intentionally
ignored during terminal reset. Rationale: the pilot has no queue, latch for boundary
arrivals, or request-withdrawal interface.

ASM-02: CTX-02 is responsible for associating a valid material observation with the
stated work identifier. Rationale: correlation is necessary to prevent one work item's
material report from authorizing another; the model does not reserve or consume
material.

ASM-03: CTX-03 is responsible for reporting only the finite readiness and process-result
values defined by MON-03 and MON-04. Rationale: the logical supervisor cannot infer
physical completion, quality, or station availability beyond those reports.

ASM-04: CTX-03 is responsible for interpreting repeated logical commands idempotently at
the boundary; the supervisor itself emits a command only on a transition authorized by
the cases. Rationale: command acknowledgement and physical actuation are outside scope.

ASM-05: The six-step successor relation is treated as a fixed pilot constraint, and a
completed step does not need to be repeated after entering `TransferPending`. Rationale:
the seed provides structural order but not transfer semantics.

ASM-06: Evaluation order is a logical discrete sequence sufficient to distinguish
failure entry from later retry and terminal entry from later reset. It is not a physical
clock, deadline, latency, or throughput claim; CTX-01 through CTX-03 are responsible for
supplying one coherent snapshot per evaluation.

## Supporting contract definitions

### State `Factory_Flow::FlowLedger::phase`

State `phase` has type `Factory_Flow::LedgerPhase`.

### State `Factory_Flow::FlowLedger::activeWork`

State `activeWork` has type `Factory_Flow::WorkId`.

### State `Factory_Flow::FlowLedger::activeStep`

State `activeStep` has type `Factory_Flow::FlowStep`.

### State `Factory_Flow::FlowLedger::attempt`

State `attempt` has type `Factory_Flow::AttemptKind`.

### `Factory_Flow::FlowAuthorizationOwner::targetReady`

- Function category: Strictly pure
- Input `value` has type `Factory_Flow::TargetQualification`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Factory_Flow.TargetQualification.HeatingReady`, `value` is `Factory_Flow.TargetQualification.BendingReady`, `value` is `Factory_Flow.TargetQualification.CuttingReady`, `value` is `Factory_Flow.TargetQualification.DrillingReady`, `value` is `Factory_Flow.TargetQualification.GrindingReady`, or `value` is `Factory_Flow.TargetQualification.PolishingReady`.

### `Factory_Flow::FlowAuthorizationOwner::targetBlocked`

- Function category: Strictly pure
- Input `value` has type `Factory_Flow::TargetQualification`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Factory_Flow.TargetQualification.HeatingBlocked`, `value` is `Factory_Flow.TargetQualification.BendingBlocked`, `value` is `Factory_Flow.TargetQualification.CuttingBlocked`, `value` is `Factory_Flow.TargetQualification.DrillingBlocked`, `value` is `Factory_Flow.TargetQualification.GrindingBlocked`, or `value` is `Factory_Flow.TargetQualification.PolishingBlocked`.

### `Factory_Flow::FlowAuthorizationOwner::targetUnknown`

- Function category: Strictly pure
- Input `value` has type `Factory_Flow::TargetQualification`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `value` is `Factory_Flow.TargetQualification.HeatingUnknown`, `value` is `Factory_Flow.TargetQualification.BendingUnknown`, `value` is `Factory_Flow.TargetQualification.CuttingUnknown`, `value` is `Factory_Flow.TargetQualification.DrillingUnknown`, `value` is `Factory_Flow.TargetQualification.GrindingUnknown`, or `value` is `Factory_Flow.TargetQualification.PolishingUnknown`.

### `Factory_Flow::FlowLedger::successor`

- Function category: Strictly pure
- Input `step` has type `Factory_Flow::FlowStep`.
- Result type: `Factory_Flow::FlowStep`.

> The function returns the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Heating`
>
> **Use:**
>
> `Factory_Flow.FlowStep.Bending`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Bending`
>
> **Use:**
>
> `Factory_Flow.FlowStep.Cutting`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Cutting`
>
> **Use:**
>
> `Factory_Flow.FlowStep.Drilling`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Drilling`
>
> **Use:**
>
> `Factory_Flow.FlowStep.Grinding`
>
> **Otherwise use:**
>
> `Factory_Flow.FlowStep.Polishing`.

### `Factory_Flow::FlowLedger::stepCode`

- Function category: Strictly pure
- Input `step` has type `Factory_Flow::FlowStep`.
- Result type: `Base_Types::Integer_32`.

> The function returns the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Heating`
>
> **Use:**
>
> 0 [S32]
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Bending`
>
> **Use:**
>
> 1 [S32]
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Cutting`
>
> **Use:**
>
> 2 [S32]
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Drilling`
>
> **Use:**
>
> 3 [S32]
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is `Factory_Flow.FlowStep.Grinding`
>
> **Use:**
>
> 4 [S32]
>
> **Otherwise use:**
>
> 5 [S32].

### `Factory_Flow::TargetStepReadinessQualifier::successorCode`

- Function category: Strictly pure
- Input `step` has type `Base_Types::Integer_32`.
- Result type: `Base_Types::Integer_32`.

> The function returns the value selected as follows:
>
> **If:**
>
> `step` is 0 [S32]
>
> **Use:**
>
> 1 [S32]
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is 1 [S32]
>
> **Use:**
>
> 2 [S32]
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is 2 [S32]
>
> **Use:**
>
> 3 [S32]
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `step` is 3 [S32]
>
> **Use:**
>
> 4 [S32]
>
> **Otherwise use:**
>
> 5 [S32].

### `Factory_Flow::TargetStepReadinessQualifier::relevantTarget`

- Function category: Strictly pure
- Input `phaseValue` has type `Factory_Flow::LedgerPhase`.
- Input `stepValue` has type `Base_Types::Integer_32`.
- Result type: `Base_Types::Integer_32`.

> The function returns the value selected as follows:
>
> **If:**
>
> `phaseValue` is `Factory_Flow.LedgerPhase.Idle`
>
> **Use:**
>
> 0 [S32]
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `phaseValue` is `Factory_Flow.LedgerPhase.Active`
>
> **Use:**
>
> the result of `successorCode` for (`stepValue`)
>
> **Otherwise use:**
>
> `stepValue`.

### `Factory_Flow::TargetStepReadinessQualifier::readyTarget`

- Function category: Strictly pure
- Input `stepValue` has type `Base_Types::Integer_32`.
- Result type: `Factory_Flow::TargetQualification`.

> The function returns the value selected as follows:
>
> **If:**
>
> `stepValue` is 0 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.HeatingReady`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 1 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.BendingReady`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 2 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.CuttingReady`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 3 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.DrillingReady`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 4 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.GrindingReady`
>
> **Otherwise use:**
>
> `Factory_Flow.TargetQualification.PolishingReady`.

### `Factory_Flow::TargetStepReadinessQualifier::blockedTarget`

- Function category: Strictly pure
- Input `stepValue` has type `Base_Types::Integer_32`.
- Result type: `Factory_Flow::TargetQualification`.

> The function returns the value selected as follows:
>
> **If:**
>
> `stepValue` is 0 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.HeatingBlocked`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 1 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.BendingBlocked`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 2 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.CuttingBlocked`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 3 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.DrillingBlocked`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 4 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.GrindingBlocked`
>
> **Otherwise use:**
>
> `Factory_Flow.TargetQualification.PolishingBlocked`.

### `Factory_Flow::TargetStepReadinessQualifier::unknownTarget`

- Function category: Strictly pure
- Input `stepValue` has type `Base_Types::Integer_32`.
- Result type: `Factory_Flow::TargetQualification`.

> The function returns the value selected as follows:
>
> **If:**
>
> `stepValue` is 0 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.HeatingUnknown`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 1 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.BendingUnknown`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 2 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.CuttingUnknown`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 3 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.DrillingUnknown`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `stepValue` is 4 [S32]
>
> **Use:**
>
> `Factory_Flow.TargetQualification.GrindingUnknown`
>
> **Otherwise use:**
>
> `Factory_Flow.TargetQualification.PolishingUnknown`.

## Detailed behavioral requirements

### Requirements for FlowAuthorizationOwner

#### Contract clauses evaluated in the initialization phase

##### `SafeAuthorizationInitialization` — Required behavior

> During contract evaluation for the initialization phase, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision IdleNoRequest, authorization reason to Factory Flow DecisionReason NoRequest, authorization work id to Factory Flow WorkId NoWork, authorization step to 0 [S32], and reasonToStatus to Factory Flow DecisionReason NoRequest.

#### Contract clauses evaluated in the compute phase

##### `C01ResetComplete` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind ResetIntent and intentFact phase is Factory Flow LedgerPhase TerminalComplete, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision ResetComplete, authorization reason to Factory Flow DecisionReason ResetComplete, authorization work id to intentFact work id, authorization step to intentFact step, and reasonToStatus to Factory Flow DecisionReason ResetComplete.

##### `C02ResetFailed` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind ResetIntent and intentFact phase is Factory Flow LedgerPhase TerminalFailed, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision ResetFailed, authorization reason to Factory Flow DecisionReason ResetFailed, authorization work id to intentFact work id, authorization step to intentFact step, and reasonToStatus to Factory Flow DecisionReason ResetFailed.

##### `C03ActivePreserve` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind ActiveIntent, outcomeFact plan is Factory Flow CorrelatedOutcomePlan Preserve, and intentFact competitor is Factory Flow CompetitorPresence Absent, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision HoldActive, authorization reason to Factory Flow DecisionReason Processing, authorization work id to intentFact work id, authorization step to intentFact step, and reasonToStatus to Factory Flow DecisionReason Processing.

##### `C04ActiveBusy` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind ActiveIntent, outcomeFact plan is Factory Flow CorrelatedOutcomePlan Preserve, and intentFact competitor is Factory Flow CompetitorPresence Present, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision BusyActive, authorization reason to Factory Flow DecisionReason ProtectedBusy, authorization work id to intentFact work id, authorization step to intentFact step, and reasonToStatus to Factory Flow DecisionReason ProtectedBusy.

##### `C05Complete` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind ActiveIntent and outcomeFact plan is Factory Flow CorrelatedOutcomePlan FinalCompleted, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision CompleteProduction, authorization reason to Factory Flow DecisionReason Completed, authorization work id to intentFact work id, authorization step to intentFact step, and reasonToStatus to Factory Flow DecisionReason Completed.

##### `C06Advance` — Conditional behavior

> During contract evaluation for the compute phase, case C06Advance applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind ActiveIntent
>   - outcomeFact plan is Factory Flow CorrelatedOutcomePlan IntermediateCompleted
>   - the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetReady for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision AdvanceNow, authorization reason is Factory Flow DecisionReason Advanced, authorization work id is intentFact work id, authorization step is intentFact step, and reasonToStatus is Factory Flow DecisionReason Advanced.

##### `C07HoldSuccessor` — Conditional behavior

> During contract evaluation for the compute phase, case C07HoldSuccessor applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind ActiveIntent
>   - outcomeFact plan is Factory Flow CorrelatedOutcomePlan IntermediateCompleted
>   - It is not the case that:
>     
>     the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetReady for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision HoldTransfer, authorization reason is Factory Flow DecisionReason TransferWaiting, authorization work id is intentFact work id, authorization step is intentFact step, and reasonToStatus is Factory Flow DecisionReason TransferWaiting.

##### `C08EnterRecovery` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind ActiveIntent and outcomeFact plan is Factory Flow CorrelatedOutcomePlan FirstFailure, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision EnterRecovery, authorization reason to Factory Flow DecisionReason RecoveryEntered, authorization work id to intentFact work id, authorization step to intentFact step, and reasonToStatus to Factory Flow DecisionReason RecoveryEntered.

##### `C09FailAfterRetry` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind ActiveIntent and outcomeFact plan is Factory Flow CorrelatedOutcomePlan RetryFailure, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision FailTerminal, authorization reason to Factory Flow DecisionReason Failed, authorization work id to intentFact work id, authorization step to intentFact step, and reasonToStatus to Factory Flow DecisionReason Failed.

##### `C10ReleaseTransfer` — Conditional behavior

> During contract evaluation for the compute phase, case C10ReleaseTransfer applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind TransferIntent
>   - the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetReady for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision ReleaseTransfer, authorization reason is Factory Flow DecisionReason TransferReleased, authorization work id is intentFact work id, authorization step is intentFact step, and reasonToStatus is Factory Flow DecisionReason TransferReleased.

##### `C11WaitTransfer` — Conditional behavior

> During contract evaluation for the compute phase, case C11WaitTransfer applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind TransferIntent
>   - It is not the case that:
>     
>     the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetReady for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision WaitTransfer, authorization reason is Factory Flow DecisionReason TransferWaiting, authorization work id is intentFact work id, authorization step is intentFact step, and reasonToStatus is Factory Flow DecisionReason TransferWaiting.

##### `C12RetryStoredWork` — Conditional behavior

> During contract evaluation for the compute phase, case C12RetryStoredWork applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind RecoveryIntent
>   - the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetReady for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision RetryNow, authorization reason is Factory Flow DecisionReason RecoveryReleased, authorization work id is intentFact work id, authorization step is intentFact step, and reasonToStatus is Factory Flow DecisionReason RecoveryReleased.

##### `C13WaitRecovery` — Conditional behavior

> During contract evaluation for the compute phase, case C13WaitRecovery applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind RecoveryIntent
>   - It is not the case that:
>     
>     the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetReady for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision WaitRecovery, authorization reason is Factory Flow DecisionReason RecoveryWaiting, authorization work id is intentFact work id, authorization step is intentFact step, and reasonToStatus is Factory Flow DecisionReason RecoveryWaiting.

##### `C14IdleNoRequest` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind NoIntent and intentFact assessment is Factory Flow AdmissionAssessment NoRequest, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision IdleNoRequest, authorization reason to Factory Flow DecisionReason NoRequest, authorization work id to Factory Flow WorkId NoWork, authorization step to 0 [S32], and reasonToStatus to Factory Flow DecisionReason NoRequest.

##### `C15RejectMalformed` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind NoIntent and intentFact assessment is Factory Flow AdmissionAssessment Malformed, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision RejectMalformed, authorization reason to Factory Flow DecisionReason MalformedRequest, authorization work id to Factory Flow WorkId NoWork, authorization step to 0 [S32], and reasonToStatus to Factory Flow DecisionReason MalformedRequest.

##### `C16WaitMaterialUnavailable` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind FreshIntent and materialFact assessment is Factory Flow MaterialAssessment MaterialUnavailable, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision WaitMaterialUnavailable, authorization reason to Factory Flow DecisionReason MaterialUnavailable, authorization work id to intentFact work id, authorization step to 0 [S32], and reasonToStatus to Factory Flow DecisionReason MaterialUnavailable.

##### `C17WaitMaterialUnknown` — Conditional behavior

> During contract evaluation for the compute phase, if intentFact kind is Factory Flow IntentKind FreshIntent and materialFact assessment is Factory Flow MaterialAssessment MaterialUnknown, FlowAuthorizationOwner shall set authorization decision to Factory Flow FlowDecision WaitMaterialUnknown, authorization reason to Factory Flow DecisionReason MaterialUnknown, authorization work id to intentFact work id, authorization step to 0 [S32], and reasonToStatus to Factory Flow DecisionReason MaterialUnknown.

##### `C18WaitHeatingBlocked` — Conditional behavior

> During contract evaluation for the compute phase, case C18WaitHeatingBlocked applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind FreshIntent
>   - materialFact assessment is Factory Flow MaterialAssessment MaterialReady
>   - the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetBlocked for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision WaitHeatingBlocked, authorization reason is Factory Flow DecisionReason HeatingBlocked, authorization work id is intentFact work id, authorization step is 0 [S32], and reasonToStatus is Factory Flow DecisionReason HeatingBlocked.

##### `C19WaitHeatingUnknown` — Conditional behavior

> During contract evaluation for the compute phase, case C19WaitHeatingUnknown applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind FreshIntent
>   - materialFact assessment is Factory Flow MaterialAssessment MaterialReady
>   - the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetUnknown for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision WaitHeatingUnknown, authorization reason is Factory Flow DecisionReason HeatingUnknown, authorization work id is intentFact work id, authorization step is 0 [S32], and reasonToStatus is Factory Flow DecisionReason HeatingUnknown.

##### `C20StartWork` — Conditional behavior

> During contract evaluation for the compute phase, case C20StartWork applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - intentFact kind is Factory Flow IntentKind FreshIntent
>   - materialFact assessment is Factory Flow MaterialAssessment MaterialReady
>   - the result of FlowAuthorizationOwner supervisorProcess flowAuthorizationOwner targetReady for (targetFact) is true.

> When all applicability conditions are met, FlowAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization decision is Factory Flow FlowDecision StartWork, authorization reason is Factory Flow DecisionReason Started, authorization work id is intentFact work id, authorization step is 0 [S32], and reasonToStatus is Factory Flow DecisionReason Started.

### Requirements for FlowLedger

#### Contract clauses evaluated in the initialization phase

##### `SafeLedgerInitialization` — Required behavior

> During contract evaluation for the initialization phase, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, contextToReadiness phase to Factory Flow LedgerPhase Idle, contextToReadiness work id to Factory Flow WorkId NoWork, contextToReadiness step value to 0 [S32], contextToReadiness attempt to Factory Flow AttemptKind First, contextToOutcome phase to Factory Flow LedgerPhase Idle, contextToOutcome work id to Factory Flow WorkId NoWork, contextToOutcome step value to 0 [S32], contextToOutcome attempt to Factory Flow AttemptKind First, protectionContext phase to Factory Flow LedgerPhase Idle, protectionContext work id to Factory Flow WorkId NoWork, protectionContext step value to 0 [S32], protectionContext attempt to Factory Flow AttemptKind First, snapshotToOutcome phase to Factory Flow LedgerPhase Idle, snapshotToOutcome work id to Factory Flow WorkId NoWork, snapshotToOutcome step value to 0 [S32], snapshotToOutcome attempt to Factory Flow AttemptKind First, snapshotToStatus phase to Factory Flow LedgerPhase Idle, snapshotToStatus work id to Factory Flow WorkId NoWork, snapshotToStatus step value to 0 [S32], snapshotToStatus attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `PublishPreStateContexts` — Required behavior

> During contract evaluation for the compute phase, FlowLedger shall set contextToReadiness phase to the value of phase on entry, contextToReadiness work id to the value of activeWork on entry, contextToReadiness step value to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry), contextToReadiness attempt to the value of attempt on entry, contextToOutcome phase to the value of phase on entry, contextToOutcome work id to the value of activeWork on entry, contextToOutcome step value to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry), contextToOutcome attempt to the value of attempt on entry, protectionContext phase to the value of phase on entry, protectionContext work id to the value of activeWork on entry, protectionContext step value to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry), and protectionContext attempt to the value of attempt on entry.

##### `PublishAppliedSnapshots` — Required behavior

> During contract evaluation for the compute phase, FlowLedger shall set snapshotToOutcome phase to phase, snapshotToOutcome work id to activeWork, snapshotToOutcome step value to the result of FlowLedger supervisorProcess flowLedger stepCode for (activeStep), snapshotToOutcome attempt to attempt, snapshotToStatus phase to phase, snapshotToStatus work id to activeWork, snapshotToStatus step value to the result of FlowLedger supervisorProcess flowLedger stepCode for (activeStep), and snapshotToStatus attempt to attempt.

##### `C01ApplyResetComplete` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision ResetComplete, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

##### `C02ApplyResetFailed` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision ResetFailed, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

##### `C03ApplyHoldActive` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision HoldActive, FlowLedger shall preserve the value of phase on entry, preserve the value of activeWork on entry, preserve the value of activeStep on entry, preserve the value of attempt on entry, set lineCommand action kind to Factory Flow CommandAction NoCommand, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C04ApplyBusyActive` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision BusyActive, FlowLedger shall preserve the value of phase on entry, preserve the value of activeWork on entry, preserve the value of activeStep on entry, preserve the value of attempt on entry, set lineCommand action kind to Factory Flow CommandAction NoCommand, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C05ApplyComplete` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision CompleteProduction, FlowLedger shall set phase to Factory Flow LedgerPhase TerminalComplete, preserve the value of activeWork on entry, preserve the value of activeStep on entry, preserve the value of attempt on entry, set lineCommand action kind to Factory Flow CommandAction NoCommand, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C06ApplyAdvance` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision AdvanceNow, FlowLedger shall set phase to Factory Flow LedgerPhase Active, preserve the value of activeWork on entry, set activeStep to the result of FlowLedger supervisorProcess flowLedger successor for (the value of activeStep on entry), set attempt to Factory Flow AttemptKind First, set lineCommand action kind to Factory Flow CommandAction Advance, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the result of FlowLedger supervisorProcess flowLedger successor for (the value of activeStep on entry)).

##### `C07ApplyHoldTransfer` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision HoldTransfer, FlowLedger shall set phase to Factory Flow LedgerPhase TransferPending, preserve the value of activeWork on entry, set activeStep to the result of FlowLedger supervisorProcess flowLedger successor for (the value of activeStep on entry), set attempt to Factory Flow AttemptKind First, set lineCommand action kind to Factory Flow CommandAction NoCommand, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the result of FlowLedger supervisorProcess flowLedger successor for (the value of activeStep on entry)).

##### `C08ApplyEnterRecovery` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision EnterRecovery, FlowLedger shall set phase to Factory Flow LedgerPhase RecoveryPending, preserve the value of activeWork on entry, preserve the value of activeStep on entry, set attempt to Factory Flow AttemptKind First, set lineCommand action kind to Factory Flow CommandAction NoCommand, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C09ApplyFailure` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision FailTerminal, FlowLedger shall set phase to Factory Flow LedgerPhase TerminalFailed, preserve the value of activeWork on entry, preserve the value of activeStep on entry, set attempt to Factory Flow AttemptKind Retry, set lineCommand action kind to Factory Flow CommandAction Abort, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C10ApplyReleaseTransfer` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision ReleaseTransfer, FlowLedger shall set phase to Factory Flow LedgerPhase Active, preserve the value of activeWork on entry, preserve the value of activeStep on entry, set attempt to Factory Flow AttemptKind First, set lineCommand action kind to Factory Flow CommandAction Advance, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C11ApplyWaitTransfer` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision WaitTransfer, FlowLedger shall preserve the value of phase on entry, preserve the value of activeWork on entry, preserve the value of activeStep on entry, preserve the value of attempt on entry, set lineCommand action kind to Factory Flow CommandAction NoCommand, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C12ApplyRetry` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision RetryNow, FlowLedger shall set phase to Factory Flow LedgerPhase Active, preserve the value of activeWork on entry, preserve the value of activeStep on entry, set attempt to Factory Flow AttemptKind Retry, set lineCommand action kind to Factory Flow CommandAction Retry, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C13ApplyWaitRecovery` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision WaitRecovery, FlowLedger shall preserve the value of phase on entry, preserve the value of activeWork on entry, preserve the value of activeStep on entry, preserve the value of attempt on entry, set lineCommand action kind to Factory Flow CommandAction NoCommand, set lineCommand work id to the value of activeWork on entry, and set lineCommand step to the result of FlowLedger supervisorProcess flowLedger stepCode for (the value of activeStep on entry).

##### `C14ApplyIdle` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision IdleNoRequest, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

##### `C15ApplyReject` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision RejectMalformed, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

##### `C16ApplyMaterialUnavailableWait` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision WaitMaterialUnavailable, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

##### `C17ApplyMaterialUnknownWait` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision WaitMaterialUnknown, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

##### `C18ApplyHeatingBlockedWait` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision WaitHeatingBlocked, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

##### `C19ApplyHeatingUnknownWait` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision WaitHeatingUnknown, FlowLedger shall set phase to Factory Flow LedgerPhase Idle, activeWork to Factory Flow WorkId NoWork, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction NoCommand, lineCommand work id to Factory Flow WorkId NoWork, and lineCommand step to 0 [S32].

##### `C20ApplyStart` — Conditional behavior

> During contract evaluation for the compute phase, if authorization decision is Factory Flow FlowDecision StartWork, FlowLedger shall set phase to Factory Flow LedgerPhase Active, activeWork to authorization work id, activeStep to Factory Flow FlowStep Heating, attempt to Factory Flow AttemptKind First, lineCommand action kind to Factory Flow CommandAction Start, lineCommand work id to authorization work id, and lineCommand step to 0 [S32].

### Requirements for FlowStatusDeterminer

#### Contract clauses evaluated in the initialization phase

##### `SafeStatusInitialization` — Required behavior

> During contract evaluation for the initialization phase, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Idle.

#### Contract clauses evaluated in the compute phase

##### `TerminalCompleteStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase TerminalComplete, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Completed.

##### `TerminalFailedStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase TerminalFailed, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Failed.

##### `RecoveryPendingStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase RecoveryPending, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Recovering.

##### `RetryReleasedStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase Active and decisionReason is Factory Flow DecisionReason RecoveryReleased, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Recovering.

##### `TransferPendingStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase TransferPending, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus WaitingStation.

##### `RejectedStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase Idle and decisionReason is Factory Flow DecisionReason MalformedRequest, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Rejected.

##### `MaterialWaitStatus` — Conditional behavior

> During contract evaluation for the compute phase, case MaterialWaitStatus applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - appliedSnapshot phase is Factory Flow LedgerPhase Idle
>   - At least one of the following conditions holds:
>     
>       - decisionReason is Factory Flow DecisionReason MaterialUnavailable
>       - decisionReason is Factory Flow DecisionReason MaterialUnknown.

> When all applicability conditions are met, FlowStatusDeterminer shall produce a result for which all of the following conditions hold:
>
> flowStatus is Factory Flow ProductionFlowStatus WaitingMaterial.

##### `HeatingWaitStatus` — Conditional behavior

> During contract evaluation for the compute phase, case HeatingWaitStatus applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - appliedSnapshot phase is Factory Flow LedgerPhase Idle
>   - At least one of the following conditions holds:
>     
>       - decisionReason is Factory Flow DecisionReason HeatingBlocked
>       - decisionReason is Factory Flow DecisionReason HeatingUnknown.

> When all applicability conditions are met, FlowStatusDeterminer shall produce a result for which all of the following conditions hold:
>
> flowStatus is Factory Flow ProductionFlowStatus WaitingStation.

##### `StartedStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase Active and decisionReason is Factory Flow DecisionReason Started, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Started.

##### `AdvancedStatus` — Conditional behavior

> During contract evaluation for the compute phase, case AdvancedStatus applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - appliedSnapshot phase is Factory Flow LedgerPhase Active
>   - At least one of the following conditions holds:
>     
>       - decisionReason is Factory Flow DecisionReason Advanced
>       - decisionReason is Factory Flow DecisionReason TransferReleased.

> When all applicability conditions are met, FlowStatusDeterminer shall produce a result for which all of the following conditions hold:
>
> flowStatus is Factory Flow ProductionFlowStatus Advanced.

##### `BusyStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase Active and decisionReason is Factory Flow DecisionReason ProtectedBusy, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Busy.

##### `ProcessingStatus` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase Active and decisionReason is Factory Flow DecisionReason Processing, FlowStatusDeterminer shall set flowStatus to Factory Flow ProductionFlowStatus Processing.

##### `IdleStatus` — Conditional behavior

> During contract evaluation for the compute phase, case IdleStatus applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - appliedSnapshot phase is Factory Flow LedgerPhase Idle
>   - At least one of the following conditions holds:
>     
>       - decisionReason is Factory Flow DecisionReason NoRequest
>       - decisionReason is Factory Flow DecisionReason ResetComplete
>       - decisionReason is Factory Flow DecisionReason ResetFailed.

> When all applicability conditions are met, FlowStatusDeterminer shall produce a result for which all of the following conditions hold:
>
> flowStatus is Factory Flow ProductionFlowStatus Idle.

### Requirements for MaterialCorrelationQualifier

#### Contract clauses evaluated in the initialization phase

##### `SafeMaterialInitialization` — Required behavior

> During contract evaluation for the initialization phase, MaterialCorrelationQualifier shall set materialFact assessment to Factory Flow MaterialAssessment MaterialUnknown.

#### Contract clauses evaluated in the compute phase

##### `MaterialReadyCorrelated` — Conditional behavior

> During contract evaluation for the compute phase, if admission assessment is Factory Flow AdmissionAssessment Eligible, materialObservation validity is Factory Flow Validity Valid, materialObservation work id is admission work id, and materialObservation disposition is Factory Flow MaterialDisposition Ready, MaterialCorrelationQualifier shall set materialFact assessment to Factory Flow MaterialAssessment MaterialReady.

##### `MaterialUnavailableCorrelated` — Conditional behavior

> During contract evaluation for the compute phase, if admission assessment is Factory Flow AdmissionAssessment Eligible, materialObservation validity is Factory Flow Validity Valid, materialObservation work id is admission work id, and materialObservation disposition is Factory Flow MaterialDisposition Unavailable, MaterialCorrelationQualifier shall set materialFact assessment to Factory Flow MaterialAssessment MaterialUnavailable.

##### `MaterialUnknownOrInapplicable` — Conditional behavior

> During contract evaluation for the compute phase, if admission assessment is not Factory Flow AdmissionAssessment Eligible, materialObservation validity is Factory Flow Validity Invalid, or materialObservation work id is not admission work id, MaterialCorrelationQualifier shall set materialFact assessment to Factory Flow MaterialAssessment MaterialUnknown.

### Requirements for ProcessOutcomeCorrelator

#### Contract clauses evaluated in the initialization phase

##### `SafeOutcomeInitialization` — Required behavior

> During contract evaluation for the initialization phase, ProcessOutcomeCorrelator shall set outcomeToAuthorization plan to Factory Flow CorrelatedOutcomePlan Preserve and outcomeToDeterminer plan to Factory Flow CorrelatedOutcomePlan Preserve.

#### Contract clauses evaluated in the compute phase

##### `IntermediateCompletion` — Conditional behavior

> During contract evaluation for the compute phase, if flowContext phase is Factory Flow LedgerPhase Active, processResult validity is Factory Flow Validity Valid, processResult work id is flowContext work id, processResult step is flowContext step value, processResult event kind is Factory Flow ProcessEvent Completed, and flowContext step value is not 5 [S32], ProcessOutcomeCorrelator shall set outcomeToAuthorization plan to Factory Flow CorrelatedOutcomePlan IntermediateCompleted and outcomeToDeterminer plan to Factory Flow CorrelatedOutcomePlan IntermediateCompleted.

##### `FinalCompletion` — Conditional behavior

> During contract evaluation for the compute phase, if flowContext phase is Factory Flow LedgerPhase Active, processResult validity is Factory Flow Validity Valid, processResult work id is flowContext work id, processResult step is flowContext step value, processResult event kind is Factory Flow ProcessEvent Completed, and flowContext step value is 5 [S32], ProcessOutcomeCorrelator shall set outcomeToAuthorization plan to Factory Flow CorrelatedOutcomePlan FinalCompleted and outcomeToDeterminer plan to Factory Flow CorrelatedOutcomePlan FinalCompleted.

##### `FirstAttemptFailure` — Conditional behavior

> During contract evaluation for the compute phase, if flowContext phase is Factory Flow LedgerPhase Active, processResult validity is Factory Flow Validity Valid, processResult work id is flowContext work id, processResult step is flowContext step value, processResult event kind is Factory Flow ProcessEvent Failed, and flowContext attempt is Factory Flow AttemptKind First, ProcessOutcomeCorrelator shall set outcomeToAuthorization plan to Factory Flow CorrelatedOutcomePlan FirstFailure and outcomeToDeterminer plan to Factory Flow CorrelatedOutcomePlan FirstFailure.

##### `RetryAttemptFailure` — Conditional behavior

> During contract evaluation for the compute phase, if flowContext phase is Factory Flow LedgerPhase Active, processResult validity is Factory Flow Validity Valid, processResult work id is flowContext work id, processResult step is flowContext step value, processResult event kind is Factory Flow ProcessEvent Failed, and flowContext attempt is Factory Flow AttemptKind Retry, ProcessOutcomeCorrelator shall set outcomeToAuthorization plan to Factory Flow CorrelatedOutcomePlan RetryFailure and outcomeToDeterminer plan to Factory Flow CorrelatedOutcomePlan RetryFailure.

##### `PreserveUncorrelated` — Conditional behavior

> During contract evaluation for the compute phase, if flowContext phase is not Factory Flow LedgerPhase Active, processResult validity is Factory Flow Validity Invalid, processResult work id is not flowContext work id, processResult step is not flowContext step value, processResult event kind is Factory Flow ProcessEvent NoEvent, or processResult event kind is Factory Flow ProcessEvent InProgress, ProcessOutcomeCorrelator shall set outcomeToAuthorization plan to Factory Flow CorrelatedOutcomePlan Preserve and outcomeToDeterminer plan to Factory Flow CorrelatedOutcomePlan Preserve.

### Requirements for ProductionOutcomeDeterminer

#### Contract clauses evaluated in the initialization phase

##### `SafeOutcomeOutputInitialization` — Required behavior

> During contract evaluation for the initialization phase, ProductionOutcomeDeterminer shall set productionOutcome result to Factory Flow ProductionResult None and productionOutcome work id to Factory Flow WorkId NoWork.

#### Contract clauses evaluated in the compute phase

##### `CompletionEntry` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase TerminalComplete and outcomeFact plan is Factory Flow CorrelatedOutcomePlan FinalCompleted, ProductionOutcomeDeterminer shall set productionOutcome result to Factory Flow ProductionResult ProductionComplete and productionOutcome work id to appliedSnapshot work id.

##### `FailureEntry` — Conditional behavior

> During contract evaluation for the compute phase, if appliedSnapshot phase is Factory Flow LedgerPhase TerminalFailed and outcomeFact plan is Factory Flow CorrelatedOutcomePlan RetryFailure, ProductionOutcomeDeterminer shall set productionOutcome result to Factory Flow ProductionResult ProductionFailed and productionOutcome work id to appliedSnapshot work id.

##### `SuppressNonterminalAndReset` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that appliedSnapshot phase is Factory Flow LedgerPhase TerminalComplete and outcomeFact plan is Factory Flow CorrelatedOutcomePlan FinalCompleted and it is not the case that appliedSnapshot phase is Factory Flow LedgerPhase TerminalFailed and outcomeFact plan is Factory Flow CorrelatedOutcomePlan RetryFailure, ProductionOutcomeDeterminer shall set productionOutcome result to Factory Flow ProductionResult None and productionOutcome work id to Factory Flow WorkId NoWork.

### Requirements for ProtectedWorkPriorityResolver

#### Contract clauses evaluated in the initialization phase

##### `SafeIntentInitialization` — Required behavior

> During contract evaluation for the initialization phase, ProtectedWorkPriorityResolver shall set intentFact kind to Factory Flow IntentKind NoIntent, intentFact competitor to Factory Flow CompetitorPresence Absent, intentFact assessment to Factory Flow AdmissionAssessment NoRequest, intentFact phase to Factory Flow LedgerPhase Idle, intentFact work id to Factory Flow WorkId NoWork, and intentFact step to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `CompetitorClassification` — Required behavior

> During contract evaluation for the compute phase, ProtectedWorkPriorityResolver shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - admission assessment is Factory Flow AdmissionAssessment Eligible
>       - intentFact competitor is Factory Flow CompetitorPresence Present
>   - All of the following conditions hold:
>     
>       - admission assessment is not Factory Flow AdmissionAssessment Eligible
>       - intentFact competitor is Factory Flow CompetitorPresence Absent.

##### `PriorityContextPublication` — Required behavior

> During contract evaluation for the compute phase, ProtectedWorkPriorityResolver shall set intentFact assessment to admission assessment and intentFact phase to protectionContext phase.

##### `IdleWithoutEligibleWork` — Conditional behavior

> During contract evaluation for the compute phase, if protectionContext phase is Factory Flow LedgerPhase Idle and admission assessment is not Factory Flow AdmissionAssessment Eligible, ProtectedWorkPriorityResolver shall set intentFact kind to Factory Flow IntentKind NoIntent, intentFact work id to Factory Flow WorkId NoWork, and intentFact step to 0 [S32].

##### `FreshWorkIntent` — Conditional behavior

> During contract evaluation for the compute phase, if protectionContext phase is Factory Flow LedgerPhase Idle and admission assessment is Factory Flow AdmissionAssessment Eligible, ProtectedWorkPriorityResolver shall set intentFact kind to Factory Flow IntentKind FreshIntent, intentFact work id to admission work id, and intentFact step to 0 [S32].

##### `ActiveWorkProtected` — Conditional behavior

> During contract evaluation for the compute phase, if protectionContext phase is Factory Flow LedgerPhase Active, ProtectedWorkPriorityResolver shall set intentFact kind to Factory Flow IntentKind ActiveIntent, intentFact work id to protectionContext work id, and intentFact step to protectionContext step value.

##### `TransferWorkProtected` — Conditional behavior

> During contract evaluation for the compute phase, if protectionContext phase is Factory Flow LedgerPhase TransferPending, ProtectedWorkPriorityResolver shall set intentFact kind to Factory Flow IntentKind TransferIntent, intentFact work id to protectionContext work id, and intentFact step to protectionContext step value.

##### `RecoveryWorkProtected` — Conditional behavior

> During contract evaluation for the compute phase, if protectionContext phase is Factory Flow LedgerPhase RecoveryPending, ProtectedWorkPriorityResolver shall set intentFact kind to Factory Flow IntentKind RecoveryIntent, intentFact work id to protectionContext work id, and intentFact step to protectionContext step value.

##### `TerminalResetIntent` — Conditional behavior

> During contract evaluation for the compute phase, if protectionContext phase is Factory Flow LedgerPhase TerminalComplete or protectionContext phase is Factory Flow LedgerPhase TerminalFailed, ProtectedWorkPriorityResolver shall set intentFact kind to Factory Flow IntentKind ResetIntent, intentFact work id to protectionContext work id, and intentFact step to protectionContext step value.

### Requirements for TargetStepReadinessQualifier

#### Contract clauses evaluated in the initialization phase

##### `SafeTargetInitialization` — Required behavior

> During contract evaluation for the initialization phase, TargetStepReadinessQualifier shall set targetFact to Factory Flow TargetQualification HeatingUnknown.

#### Contract clauses evaluated in the compute phase

##### `TargetReadyCorrelated` — Conditional behavior

> During contract evaluation for the compute phase, if readinessObservation validity is Factory Flow Validity Valid, readinessObservation step is the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier relevantTarget for (flowContext phase, flowContext step value), and readinessObservation disposition is Factory Flow StepDisposition Ready, TargetStepReadinessQualifier shall set targetFact to the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier readyTarget for (the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier relevantTarget for (flowContext phase, flowContext step value)).

##### `TargetBlockedCorrelated` — Conditional behavior

> During contract evaluation for the compute phase, if readinessObservation validity is Factory Flow Validity Valid, readinessObservation step is the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier relevantTarget for (flowContext phase, flowContext step value), and readinessObservation disposition is Factory Flow StepDisposition Blocked, TargetStepReadinessQualifier shall set targetFact to the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier blockedTarget for (the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier relevantTarget for (flowContext phase, flowContext step value)).

##### `TargetUnknownOrMismatched` — Conditional behavior

> During contract evaluation for the compute phase, if readinessObservation validity is Factory Flow Validity Invalid or readinessObservation step is not the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier relevantTarget for (flowContext phase, flowContext step value), TargetStepReadinessQualifier shall set targetFact to the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier unknownTarget for (the result of TargetStepReadinessQualifier supervisorProcess targetStepReadinessQualifier relevantTarget for (flowContext phase, flowContext step value)).

### Requirements for WorkRequestQualifier

#### Contract clauses evaluated in the initialization phase

##### `SafeAdmissionInitialization` — Required behavior

> During contract evaluation for the initialization phase, WorkRequestQualifier shall set admissionToMaterial assessment to Factory Flow AdmissionAssessment NoRequest, admissionToMaterial work id to Factory Flow WorkId NoWork, admissionToPriority assessment to Factory Flow AdmissionAssessment NoRequest, and admissionToPriority work id to Factory Flow WorkId NoWork.

#### Contract clauses evaluated in the compute phase

##### `RequestAbsent` — Conditional behavior

> During contract evaluation for the compute phase, if presentedWork presence is Factory Flow RequestPresence None, WorkRequestQualifier shall set admissionToMaterial assessment to Factory Flow AdmissionAssessment NoRequest, admissionToMaterial work id to Factory Flow WorkId NoWork, admissionToPriority assessment to Factory Flow AdmissionAssessment NoRequest, and admissionToPriority work id to Factory Flow WorkId NoWork.

##### `RequestEligible` — Conditional behavior

> During contract evaluation for the compute phase, case RequestEligible applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - presentedWork presence is Factory Flow RequestPresence Present
>   - presentedWork validity is Factory Flow Validity Valid
>   - At least one of the following conditions holds:
>     
>       - presentedWork work id is Factory Flow WorkId W1
>       - presentedWork work id is Factory Flow WorkId W2
>   - presentedWork product is Factory Flow ProductKind AngleProduct.

> When all applicability conditions are met, WorkRequestQualifier shall produce a result for which all of the following conditions hold:
>
> admissionToMaterial assessment is Factory Flow AdmissionAssessment Eligible, admissionToMaterial work id is presentedWork work id, admissionToPriority assessment is Factory Flow AdmissionAssessment Eligible, and admissionToPriority work id is presentedWork work id.

##### `RequestMalformed` — Conditional behavior

> During contract evaluation for the compute phase, case RequestMalformed applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - presentedWork presence is Factory Flow RequestPresence Present
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - presentedWork validity is Factory Flow Validity Valid
>       - At least one of the following conditions holds:
>         
>           - presentedWork work id is Factory Flow WorkId W1
>           - presentedWork work id is Factory Flow WorkId W2
>       - presentedWork product is Factory Flow ProductKind AngleProduct.

> When all applicability conditions are met, WorkRequestQualifier shall produce a result for which all of the following conditions hold:
>
> admissionToMaterial assessment is Factory Flow AdmissionAssessment Malformed, admissionToMaterial work id is Factory Flow WorkId NoWork, admissionToPriority assessment is Factory Flow AdmissionAssessment Malformed, and admissionToPriority work id is Factory Flow WorkId NoWork.
