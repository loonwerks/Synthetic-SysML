# Station Cargo-Transfer Verification Supervisor

## Selected system context

### Synopsis

NEED-01: A pilot and dock service need one bounded supervisory system that admits at
most one station offload at a time, commands ship-side offload and warehouse-evidence
requests, reconciles independent ship and warehouse observations, reports a verified or
inhibited outcome, and latches contradictory or invalid evidence for explicit recovery.

PURPOSE-01: The system will supervise logical authorization and verification of a cargo
offload while the frigate is docked; it does not move cargo, perform physical docking,
repair the frigate, resupply support systems, or establish that any physical transfer
actually occurred.

### Goals

GOAL-01: The supervisor shall issue a begin-offload command only for a fresh start with
cargo present, transfer service available, and an idle session.

GOAL-02: The supervisor shall report transfer verification only when an active session
has both qualified ship-complete evidence and qualified matching warehouse-receipt
evidence.

GOAL-03: The supervisor shall make invalid, failed, conflicting, stale, and
priority-preempted conditions observable without treating them as successful transfer
evidence.

GOAL-04: The supervisor shall preserve one deterministic priority order when service
preemption, cancellation, completion, reset, and start conditions coincide.

GOAL-05: The supervisor shall require an explicit fresh-reset recovery handshake and a
later fresh start before a new offload can begin after a terminal or recovery latch.

### Operational context and boundary

CTX-01: Pilot is outside the system, supplies transfer requests, and receives the
pilot-oriented transfer report.

CTX-02: FrigateCargo is outside the system, supplies the abstract cargo-availability
observation, and remains responsible for actual cargo and ore-hold behavior.

CTX-03: DockService is outside the system, supplies the mutually exclusive dock-service
condition, receives the station-oriented report, and applies any physical docking or
service policy not modeled here.

CTX-04: ShipTransferInterface is outside the system, supplies ship-side transfer
evidence and receives the ship command; the interface does not make its evidence
physically true merely by reporting it.

CTX-05: WarehouseInterface is outside the system, supplies receipt evidence and receives
the receipt query; storage, warehouse bookkeeping, and cargo custody remain outside the
boundary.

MON-01: transferRequest from CTX-01 has exact finite type `TransferRequest = {NONE,
FRESH_START, REPEATED_START, FRESH_CANCEL, REPEATED_CANCEL, FRESH_RESET, REPEATED_RESET,
INVALID}`; freshness and invalidity are explicit boundary facts rather than inferred
timing.

MON-02: cargoState from CTX-02 has exact finite type `CargoState = {PRESENT, EMPTY,
INVALID}` and describes only whether the proposed offload has cargo available.

MON-03: serviceCondition from CTX-03 has exact finite type `DockServiceCondition =
{TRANSFER_AVAILABLE, UNDOCK_PRIORITY, SERVICE_HOLD, UNDOCKED, INVALID}`.

MON-04: transferEvidence from CTX-04 has exact finite type `ShipTransferEvidence =
{IDLE, ACTIVE, COMPLETE, FAILED, INVALID}`.

MON-05: receiptEvidence from CTX-05 has exact finite type `WarehouseReceiptEvidence =
{NO_RECEIPT, MATCHING_RECEIPT, CONFLICTING_RECEIPT, INVALID}`.

CTRL-01: shipCommand to CTX-04 has exact finite type `ShipCommand = {HOLD,
BEGIN_OFFLOAD, STOP_OFFLOAD}` and is a supervisory request, not a claim of actuator
response.

CTRL-02: receiptQuery to CTX-05 has exact finite type `WarehouseQuery = {NO_QUERY,
REQUEST_RECEIPT}`.

CTRL-03: pilotReport to CTX-01 has exact finite type `PilotTransferReport = {IDLE,
STARTED, IN_PROGRESS, VERIFIED, CANCELLED, INHIBITED, RECOVERY_REQUIRED,
RESET_COMPLETE}`.

CTRL-04: stationReport to CTX-03 has exact finite type `StationTransferReport = {IDLE,
OFFLOAD_ACTIVE, VERIFICATION_PENDING, VERIFIED, STOPPED, RECOVERY_REQUIRED,
RESET_COMPLETE}`.

### Pilot assumptions and constraints

ASM-01: CTX-01 is responsible for classifying a request as fresh or repeated and never
relabels an unchanged request as fresh; this assumption is necessary because the
boundary intentionally has no time or request identifier.

ASM-02: CTX-02 is responsible for making cargoState pertain to the one proposed offload,
and CTX-04 and CTX-05 are responsible for making their evidence pertain to the sole
logical session; overlapping sessions are excluded.

ASM-03: CTX-03 is responsible for supplying exactly one current DockServiceCondition
value per evaluation; `TRANSFER_AVAILABLE` is the only value that permits a begin
command.

ASM-04: CTX-04 and CTX-05 may disagree or be invalid, so neither evidence source is
trusted alone; disagreement is handled by policy rather than assumed away.

ASM-05: The modeled behavior advances in discrete logical evaluations with one value for
each monitored quantity and one pre-state; no wall-clock bound or physical response
latency is assumed.

ASM-06: A later fresh request is distinguishable from the fresh reset that cleared a
latch; reset and start cannot be collapsed into one boundary event.

### Required behavior and fault response

RISK-01: If a begin or verified outcome were derived from stale, invalid, single-source,
or service-preempted evidence, the supervisor could report an offload that its selected
logical evidence does not justify.

### Observable modes and transitions

MODE-01: Idle mode corresponds to SessionState IDLE and observably permits a qualified
fresh start while producing idle outputs otherwise.

MODE-02: Active mode corresponds to COMMANDING or AWAITING_EVIDENCE and observably
permits receipt queries, progress, completion, cancellation, or preemption.

MODE-03: Terminal mode corresponds to VERIFIED or any stopped state and observably
blocks new starts until a qualified fresh reset.

MODE-04: Recovery mode corresponds to RECOVERY_REQUIRED and observably suppresses
begin/query and requires the stricter recovery-clear evidence in POL-REC-01.

## Supporting contract definitions

### State `Station_Cargo_Transfer_Verification_Supervisor::SessionController::sessionState`

State `sessionState` has type `Station_Cargo_Transfer_Verification_Supervisor::SessionState`.

### `Station_Cargo_Transfer_Verification_Supervisor::SessionController::snapshot_state`

- Function category: Strictly pure
- Input `value` has type `Station_Cargo_Transfer_Verification_Supervisor::SessionState`.
- Result type: `Station_Cargo_Transfer_Verification_Supervisor::SnapshotSessionState`.

> The function returns the value selected as follows:
>
> **If:**
>
> `value` is `SessionState.Commanding`
>
> **Use:**
>
> `SnapshotSessionState.Commanding`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `SessionState.AwaitingEvidence`
>
> **Use:**
>
> `SnapshotSessionState.AwaitingEvidence`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `SessionState.Verified`
>
> **Use:**
>
> `SnapshotSessionState.Verified`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `SessionState.StoppedByCancel`
>
> **Use:**
>
> `SnapshotSessionState.StoppedByCancel`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `SessionState.StoppedByUndock`
>
> **Use:**
>
> `SnapshotSessionState.StoppedByUndock`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `SessionState.StoppedByService`
>
> **Use:**
>
> `SnapshotSessionState.StoppedByService`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `value` is `SessionState.RecoveryRequired`
>
> **Use:**
>
> `SnapshotSessionState.RecoveryRequired`
>
> **Otherwise use:**
>
> `SnapshotSessionState.Idle`.

## Detailed behavioral requirements

### Requirements for CommandSafetyGate

#### Contract clauses evaluated in the initialization phase

##### `COMMAND_GATE_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, CommandSafetyGate shall set shipCommand to Hold and receiptQuery to NoQuery.

#### Contract clauses evaluated in the compute phase

##### `COMMAND_STOP_PRESERVED` — Conditional behavior

> During contract evaluation for the compute phase, if commandProposal is StopNoQuery, CommandSafetyGate shall set shipCommand to StopOffload and receiptQuery to NoQuery.

##### `COMMAND_BEGIN_READY` — Conditional behavior

> During contract evaluation for the compute phase, if commandProposal is BeginWithQuery and serviceEligibility is Ready, CommandSafetyGate shall set shipCommand to BeginOffload and receiptQuery to RequestReceipt.

##### `COMMAND_QUERY_READY` — Conditional behavior

> During contract evaluation for the compute phase, if commandProposal is HoldWithQuery and serviceEligibility is Ready, CommandSafetyGate shall set shipCommand to Hold and receiptQuery to RequestReceipt.

##### `COMMAND_SUPPRESSED` — Conditional behavior

> During contract evaluation for the compute phase, case COMMAND SUPPRESSED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - commandProposal is not StopNoQuery
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - commandProposal is BeginWithQuery
>           - commandProposal is HoldWithQuery
>       - serviceEligibility is Ready.

> When all applicability conditions are met, CommandSafetyGate shall produce a result for which all of the following conditions hold:
>
> shipCommand is Hold and receiptQuery is NoQuery.

### Requirements for CompletionReconciler

#### Contract clauses evaluated in the initialization phase

##### `RECONCILER_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, CompletionReconciler shall set verificationDisposition to Neutral.

#### Contract clauses evaluated in the compute phase

##### `RECONCILE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if shipFinding is Fault or warehouseFinding is Fault, CompletionReconciler shall set verificationDisposition to RecoveryRequired.

##### `RECONCILE_RECOVERY_CLEARABLE` — Conditional behavior

> During contract evaluation for the compute phase, if shipFinding is RecoveryNeutral and warehouseFinding is RecoveryNeutral, CompletionReconciler shall set verificationDisposition to RecoveryClearable.

##### `RECONCILE_VERIFIED` — Conditional behavior

> During contract evaluation for the compute phase, if shipFinding is Complete and warehouseFinding is Match, CompletionReconciler shall set verificationDisposition to Verified.

##### `RECONCILE_MISSING` — Conditional behavior

> During contract evaluation for the compute phase, if shipFinding is NotComplete and warehouseFinding is Missing, CompletionReconciler shall set verificationDisposition to Awaiting.

##### `RECONCILE_OTHER_PARTIAL` — Conditional behavior

> During contract evaluation for the compute phase, case RECONCILE OTHER PARTIAL applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - shipFinding is Complete
>       - warehouseFinding is Missing
>   - All of the following conditions hold:
>     
>       - shipFinding is NotComplete
>       - warehouseFinding is Match.

> When all applicability conditions are met, CompletionReconciler shall produce a result for which all of the following conditions hold:
>
> verificationDisposition is Awaiting.

##### `RECONCILE_NEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if shipFinding is Neutral and warehouseFinding is Neutral, CompletionReconciler shall set verificationDisposition to Neutral.

##### `RECONCILE_INCONSISTENT` — Conditional behavior

> During contract evaluation for the compute phase, if shipFinding is not Fault, warehouseFinding is not Fault, it is not the case that shipFinding is RecoveryNeutral and warehouseFinding is RecoveryNeutral, it is not the case that shipFinding is Complete and warehouseFinding is Match, it is not the case that shipFinding is NotComplete and warehouseFinding is Missing, it is not the case that shipFinding is Complete and warehouseFinding is Missing, it is not the case that shipFinding is NotComplete and warehouseFinding is Match, and it is not the case that shipFinding is Neutral and warehouseFinding is Neutral, CompletionReconciler shall set verificationDisposition to RecoveryRequired.

### Requirements for OutcomeReporter

#### Contract clauses evaluated in the initialization phase

##### `REPORT_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, OutcomeReporter shall set pilotReport to Idle and stationReport to Idle.

#### Contract clauses evaluated in the compute phase

##### `REPORT_RESET_COMPLETE` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is Idle and sessionSnapshot session result is ResetComplete, OutcomeReporter shall set pilotReport to ResetComplete and stationReport to ResetComplete.

##### `REPORT_IDLE_CANCELLED` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is Idle and sessionSnapshot session result is Cancelled, OutcomeReporter shall set pilotReport to Cancelled and stationReport to Idle.

##### `REPORT_IDLE_INHIBITED` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is Idle and sessionSnapshot session result is Inhibited, OutcomeReporter shall set pilotReport to Inhibited and stationReport to Idle.

##### `REPORT_IDLE` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is Idle, sessionSnapshot session result is not ResetComplete, sessionSnapshot session result is not Cancelled, and sessionSnapshot session result is not Inhibited, OutcomeReporter shall set pilotReport to Idle and stationReport to Idle.

##### `REPORT_STARTED` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is Commanding and sessionSnapshot session result is Started, OutcomeReporter shall set pilotReport to Started and stationReport to OffloadActive.

##### `REPORT_COMMANDING_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is Commanding and sessionSnapshot session result is not Started, OutcomeReporter shall set pilotReport to InProgress and stationReport to OffloadActive.

##### `REPORT_AWAITING` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is AwaitingEvidence, OutcomeReporter shall set pilotReport to InProgress and stationReport to VerificationPending.

##### `REPORT_VERIFIED` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is Verified, OutcomeReporter shall set pilotReport to Verified and stationReport to Verified.

##### `REPORT_CANCEL_STOP` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is StoppedByCancel, OutcomeReporter shall set pilotReport to Cancelled and stationReport to Stopped.

##### `REPORT_SERVICE_STOP` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is StoppedByUndock or sessionSnapshot next state is StoppedByService, OutcomeReporter shall set pilotReport to Inhibited and stationReport to Stopped.

##### `REPORT_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if sessionSnapshot next state is RecoveryRequired, OutcomeReporter shall set pilotReport to RecoveryRequired and stationReport to RecoveryRequired.

### Requirements for PriorityArbiter

#### Contract clauses evaluated in the initialization phase

##### `ARBITER_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, PriorityArbiter shall set admittedDirective to Hold.

#### Contract clauses evaluated in the compute phase

##### `ARBITER_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is InputFault or serviceEligibility is ServiceFault, PriorityArbiter shall set admittedDirective to EnterRecovery.

##### `ARBITER_ACTIVE_UNDOCK` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER ACTIVE UNDOCK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedRequest is not InputFault
>   - serviceEligibility is PreemptUndock
>   - At least one of the following conditions holds:
>     
>       - sessionPrestate is Commanding
>       - sessionPrestate is AwaitingEvidence.

> When all applicability conditions are met, PriorityArbiter shall produce a result for which all of the following conditions hold:
>
> admittedDirective is PreemptUndock.

##### `ARBITER_ACTIVE_SERVICE_STOP` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER ACTIVE SERVICE STOP applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedRequest is not InputFault
>   - serviceEligibility is Ineligible
>   - At least one of the following conditions holds:
>     
>       - sessionPrestate is Commanding
>       - sessionPrestate is AwaitingEvidence.

> When all applicability conditions are met, PriorityArbiter shall produce a result for which all of the following conditions hold:
>
> admittedDirective is PreemptService.

##### `ARBITER_ACTIVE_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER ACTIVE CANCEL applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedRequest is CancelCandidate
>   - serviceEligibility is Ready
>   - At least one of the following conditions holds:
>     
>       - sessionPrestate is Commanding
>       - sessionPrestate is AwaitingEvidence.

> When all applicability conditions are met, PriorityArbiter shall produce a result for which all of the following conditions hold:
>
> admittedDirective is Cancel.

##### `ARBITER_ACTIVE_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER ACTIVE HOLD applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedRequest is not InputFault
>   - serviceEligibility is Ready
>   - qualifiedRequest is not CancelCandidate
>   - At least one of the following conditions holds:
>     
>       - sessionPrestate is Commanding
>       - sessionPrestate is AwaitingEvidence.

> When all applicability conditions are met, PriorityArbiter shall produce a result for which all of the following conditions hold:
>
> admittedDirective is Hold.

##### `ARBITER_IDLE_UNDOCK` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER IDLE UNDOCK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedRequest is not InputFault
>   - serviceEligibility is PreemptUndock
>   - sessionPrestate is Idle
>   - At least one of the following conditions holds:
>     
>       - qualifiedRequest is StartCandidate
>       - qualifiedRequest is RejectEmpty
>       - qualifiedRequest is CancelCandidate.

> When all applicability conditions are met, PriorityArbiter shall produce a result for which all of the following conditions hold:
>
> admittedDirective is PreemptUndock.

##### `ARBITER_IDLE_INELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, case ARBITER IDLE INELIGIBLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedRequest is not InputFault
>   - serviceEligibility is Ineligible
>   - sessionPrestate is Idle
>   - At least one of the following conditions holds:
>     
>       - qualifiedRequest is StartCandidate
>       - qualifiedRequest is RejectEmpty
>       - qualifiedRequest is CancelCandidate.

> When all applicability conditions are met, PriorityArbiter shall produce a result for which all of the following conditions hold:
>
> admittedDirective is RejectIneligible.

##### `ARBITER_IDLE_NONACTIONABLE_SERVICE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InputFault, serviceEligibility is not Ready, serviceEligibility is not ServiceFault, sessionPrestate is Idle, qualifiedRequest is not StartCandidate, qualifiedRequest is not RejectEmpty, and qualifiedRequest is not CancelCandidate, PriorityArbiter shall set admittedDirective to Hold.

##### `ARBITER_IDLE_BEGIN` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is StartCandidate, serviceEligibility is Ready, and sessionPrestate is Idle, PriorityArbiter shall set admittedDirective to Begin.

##### `ARBITER_IDLE_EMPTY` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is RejectEmpty, serviceEligibility is Ready, and sessionPrestate is Idle, PriorityArbiter shall set admittedDirective to RejectEmpty.

##### `ARBITER_IDLE_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is CancelCandidate, serviceEligibility is Ready, and sessionPrestate is Idle, PriorityArbiter shall set admittedDirective to Cancel.

##### `ARBITER_IDLE_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if serviceEligibility is Ready, sessionPrestate is Idle, qualifiedRequest is not InputFault, qualifiedRequest is not StartCandidate, qualifiedRequest is not RejectEmpty, and qualifiedRequest is not CancelCandidate, PriorityArbiter shall set admittedDirective to Hold.

##### `ARBITER_LATCH_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is ResetCandidate, serviceEligibility is Ready, sessionPrestate is not Idle, sessionPrestate is not Commanding, and sessionPrestate is not AwaitingEvidence, PriorityArbiter shall set admittedDirective to Reset.

##### `ARBITER_LATCH_BLOCKED_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is ResetCandidate, serviceEligibility is not Ready, serviceEligibility is not ServiceFault, sessionPrestate is not Idle, sessionPrestate is not Commanding, and sessionPrestate is not AwaitingEvidence, PriorityArbiter shall set admittedDirective to RejectIneligible.

##### `ARBITER_LATCH_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedRequest is not InputFault, serviceEligibility is not ServiceFault, sessionPrestate is not Idle, sessionPrestate is not Commanding, sessionPrestate is not AwaitingEvidence, and qualifiedRequest is not ResetCandidate, PriorityArbiter shall set admittedDirective to Hold.

### Requirements for RequestQualifier

#### Contract clauses evaluated in the initialization phase

##### `REQUEST_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, RequestQualifier shall set qualifiedRequest to NoNewRequest.

#### Contract clauses evaluated in the compute phase

##### `REQUEST_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if transferRequest is Invalid or cargoState is Invalid, RequestQualifier shall set qualifiedRequest to InputFault.

##### `REQUEST_START_CANDIDATE` — Conditional behavior

> During contract evaluation for the compute phase, if transferRequest is FreshStart and cargoState is Present, RequestQualifier shall set qualifiedRequest to StartCandidate.

##### `REQUEST_EMPTY_REJECTION` — Conditional behavior

> During contract evaluation for the compute phase, if transferRequest is FreshStart and cargoState is Empty, RequestQualifier shall set qualifiedRequest to RejectEmpty.

##### `REQUEST_CANCEL_CANDIDATE` — Conditional behavior

> During contract evaluation for the compute phase, if transferRequest is FreshCancel and cargoState is not Invalid, RequestQualifier shall set qualifiedRequest to CancelCandidate.

##### `REQUEST_RESET_CANDIDATE` — Conditional behavior

> During contract evaluation for the compute phase, if transferRequest is FreshReset and cargoState is not Invalid, RequestQualifier shall set qualifiedRequest to ResetCandidate.

##### `REQUEST_NO_NEW` — Conditional behavior

> During contract evaluation for the compute phase, if cargoState is not Invalid, transferRequest is not Invalid, transferRequest is not FreshStart, transferRequest is not FreshCancel, and transferRequest is not FreshReset, RequestQualifier shall set qualifiedRequest to NoNewRequest.

### Requirements for ServiceReadinessQualifier

#### Contract clauses evaluated in the initialization phase

##### `SERVICE_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, ServiceReadinessQualifier shall set serviceEligibility to Ineligible and gateEligibility to Ineligible.

#### Contract clauses evaluated in the compute phase

##### `SERVICE_READY` — Conditional behavior

> During contract evaluation for the compute phase, if serviceCondition is TransferAvailable, ServiceReadinessQualifier shall set serviceEligibility to Ready and gateEligibility to Ready.

##### `SERVICE_UNDOCK_PREEMPTION` — Conditional behavior

> During contract evaluation for the compute phase, if serviceCondition is UndockPriority, ServiceReadinessQualifier shall set serviceEligibility to PreemptUndock and gateEligibility to PreemptUndock.

##### `SERVICE_INELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if serviceCondition is ServiceHold or serviceCondition is Undocked, ServiceReadinessQualifier shall set serviceEligibility to Ineligible and gateEligibility to Ineligible.

##### `SERVICE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if serviceCondition is Invalid, ServiceReadinessQualifier shall set serviceEligibility to ServiceFault and gateEligibility to ServiceFault.

### Requirements for SessionController

#### Contract clauses evaluated in the initialization phase

##### `SESSION_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, SessionController shall set sessionState to Idle, sessionPrestate to Idle, shipExpectation to None, warehouseExpectation to None, commandProposal to HoldNoQuery, sessionSnapshot next state to Idle, and sessionSnapshot session result to None.

#### Contract clauses evaluated in the compute phase

##### `PUBLISH_PRESTATE` — Required behavior

> During contract evaluation for the compute phase, SessionController shall set sessionPrestate to the value of sessionState on entry.

##### `EXPECTATION_FROM_PRESTATE` — Required behavior

> During contract evaluation for the compute phase, SessionController shall produce a result for which if the value of sessionState on entry is Commanding or the value of sessionState on entry is AwaitingEvidence, then shipExpectation is ActiveTransfer and warehouseExpectation is ActiveTransfer, if the value of sessionState on entry is RecoveryRequired, then shipExpectation is RecoveryCheck and warehouseExpectation is RecoveryCheck, and if the value of sessionState on entry is not Commanding, the value of sessionState on entry is not AwaitingEvidence, and the value of sessionState on entry is not RecoveryRequired, then shipExpectation is None and warehouseExpectation is None.

##### `SNAPSHOT_STATE` — Required behavior

> During contract evaluation for the compute phase, SessionController shall set sessionSnapshot next state to the result of SessionController supervisorProcess sessionController snapshot state for (sessionState).

##### `ACTIVE_FAULT_TRANSITION` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE FAULT TRANSITION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Commanding
>       - the value of sessionState on entry is AwaitingEvidence
>   - At least one of the following conditions holds:
>     
>       - admittedDirective is EnterRecovery
>       - verificationDisposition is RecoveryRequired.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is RecoveryRequired, commandProposal is StopNoQuery, and sessionSnapshot session result is RecoveryRequired.

##### `INACTIVE_FAULT_TRANSITION` — Conditional behavior

> During contract evaluation for the compute phase, case INACTIVE FAULT TRANSITION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of sessionState on entry is not Commanding
>   - the value of sessionState on entry is not AwaitingEvidence
>   - At least one of the following conditions holds:
>     
>       - admittedDirective is EnterRecovery
>       - verificationDisposition is RecoveryRequired.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is RecoveryRequired, commandProposal is HoldNoQuery, and sessionSnapshot session result is RecoveryRequired.

##### `ACTIVE_INCONSISTENT_DISPOSITION` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE INCONSISTENT DISPOSITION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Commanding
>       - the value of sessionState on entry is AwaitingEvidence
>   - admittedDirective is not EnterRecovery
>   - verificationDisposition is not RecoveryRequired
>   - At least one of the following conditions holds:
>     
>       - verificationDisposition is Neutral
>       - verificationDisposition is RecoveryClearable.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is RecoveryRequired, commandProposal is StopNoQuery, and sessionSnapshot session result is RecoveryRequired.

##### `INACTIVE_INCONSISTENT_DISPOSITION` — Conditional behavior

> During contract evaluation for the compute phase, case INACTIVE INCONSISTENT DISPOSITION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of sessionState on entry is not Commanding
>   - the value of sessionState on entry is not AwaitingEvidence
>   - admittedDirective is not EnterRecovery
>   - verificationDisposition is not RecoveryRequired
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of sessionState on entry is RecoveryRequired
>           - At least one of the following conditions holds:
>             
>               - verificationDisposition is Neutral
>               - verificationDisposition is Awaiting
>               - verificationDisposition is Verified
>       - All of the following conditions hold:
>         
>           - the value of sessionState on entry is not RecoveryRequired
>           - At least one of the following conditions holds:
>             
>               - verificationDisposition is Awaiting
>               - verificationDisposition is Verified
>               - verificationDisposition is RecoveryClearable.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is RecoveryRequired, commandProposal is HoldNoQuery, and sessionSnapshot session result is RecoveryRequired.

##### `ACTIVE_UNDOCK_STOP` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE UNDOCK STOP applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Commanding
>       - the value of sessionState on entry is AwaitingEvidence
>   - admittedDirective is PreemptUndock
>   - verificationDisposition is not RecoveryRequired
>   - verificationDisposition is not Neutral
>   - verificationDisposition is not RecoveryClearable.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is StoppedByUndock, commandProposal is StopNoQuery, and sessionSnapshot session result is Inhibited.

##### `ACTIVE_SERVICE_STOP` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE SERVICE STOP applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Commanding
>       - the value of sessionState on entry is AwaitingEvidence
>   - admittedDirective is PreemptService
>   - verificationDisposition is not RecoveryRequired
>   - verificationDisposition is not Neutral
>   - verificationDisposition is not RecoveryClearable.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is StoppedByService, commandProposal is StopNoQuery, and sessionSnapshot session result is Inhibited.

##### `ACTIVE_CANCEL_STOP` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE CANCEL STOP applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Commanding
>       - the value of sessionState on entry is AwaitingEvidence
>   - admittedDirective is Cancel
>   - verificationDisposition is not RecoveryRequired
>   - verificationDisposition is not Neutral
>   - verificationDisposition is not RecoveryClearable.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is StoppedByCancel, commandProposal is StopNoQuery, and sessionSnapshot session result is Cancelled.

##### `ACTIVE_VERIFIED` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE VERIFIED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Commanding
>       - the value of sessionState on entry is AwaitingEvidence
>   - admittedDirective is not EnterRecovery
>   - admittedDirective is not PreemptUndock
>   - admittedDirective is not PreemptService
>   - admittedDirective is not Cancel
>   - verificationDisposition is Verified.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is Verified, commandProposal is HoldNoQuery, and sessionSnapshot session result is Verified.

##### `ACTIVE_PROGRESS` — Conditional behavior

> During contract evaluation for the compute phase, case ACTIVE PROGRESS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Commanding
>       - the value of sessionState on entry is AwaitingEvidence
>   - admittedDirective is not EnterRecovery
>   - admittedDirective is not PreemptUndock
>   - admittedDirective is not PreemptService
>   - admittedDirective is not Cancel
>   - verificationDisposition is Awaiting.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is AwaitingEvidence, commandProposal is HoldWithQuery, and sessionSnapshot session result is Waiting.

##### `RECOVERY_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if the value of sessionState on entry is RecoveryRequired, admittedDirective is Reset, and verificationDisposition is RecoveryClearable, SessionController shall set sessionState to Idle, commandProposal to HoldNoQuery, and sessionSnapshot session result to ResetComplete.

##### `RECOVERY_BLOCKED_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if the value of sessionState on entry is RecoveryRequired, admittedDirective is RejectIneligible, and verificationDisposition is RecoveryClearable, SessionController shall set sessionState to RecoveryRequired, commandProposal to HoldNoQuery, and sessionSnapshot session result to None.

##### `RECOVERY_LATCH` — Conditional behavior

> During contract evaluation for the compute phase, if the value of sessionState on entry is RecoveryRequired, admittedDirective is not EnterRecovery, admittedDirective is not Reset, admittedDirective is not RejectIneligible, and verificationDisposition is RecoveryClearable, SessionController shall set sessionState to RecoveryRequired, commandProposal to HoldNoQuery, and sessionSnapshot session result to None.

##### `TERMINAL_RESET` — Conditional behavior

> During contract evaluation for the compute phase, case TERMINAL RESET applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Verified
>       - the value of sessionState on entry is StoppedByCancel
>       - the value of sessionState on entry is StoppedByUndock
>       - the value of sessionState on entry is StoppedByService
>   - admittedDirective is Reset
>   - verificationDisposition is Neutral.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is Idle, commandProposal is HoldNoQuery, and sessionSnapshot session result is ResetComplete.

##### `TERMINAL_LATCH` — Conditional behavior

> During contract evaluation for the compute phase, case TERMINAL LATCH applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - the value of sessionState on entry is Verified
>       - the value of sessionState on entry is StoppedByCancel
>       - the value of sessionState on entry is StoppedByUndock
>       - the value of sessionState on entry is StoppedByService
>   - admittedDirective is not EnterRecovery
>   - admittedDirective is not Reset
>   - verificationDisposition is Neutral.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is the value of sessionState on entry, commandProposal is HoldNoQuery, and sessionSnapshot session result is None.

##### `IDLE_BEGIN` — Conditional behavior

> During contract evaluation for the compute phase, if the value of sessionState on entry is Idle, admittedDirective is Begin, and verificationDisposition is Neutral, SessionController shall set sessionState to Commanding, commandProposal to BeginWithQuery, and sessionSnapshot session result to Started.

##### `IDLE_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, if the value of sessionState on entry is Idle, admittedDirective is Cancel, and verificationDisposition is Neutral, SessionController shall set sessionState to Idle, commandProposal to HoldNoQuery, and sessionSnapshot session result to Cancelled.

##### `IDLE_INHIBITION` — Conditional behavior

> During contract evaluation for the compute phase, case IDLE INHIBITION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of sessionState on entry is Idle
>   - At least one of the following conditions holds:
>     
>       - admittedDirective is RejectEmpty
>       - admittedDirective is RejectIneligible
>       - admittedDirective is PreemptUndock
>       - admittedDirective is PreemptService
>   - verificationDisposition is Neutral.

> When all applicability conditions are met, SessionController shall produce a result for which all of the following conditions hold:
>
> sessionState is Idle, commandProposal is HoldNoQuery, and sessionSnapshot session result is Inhibited.

##### `IDLE_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if the value of sessionState on entry is Idle, admittedDirective is not EnterRecovery, admittedDirective is not Begin, admittedDirective is not Cancel, admittedDirective is not RejectEmpty, admittedDirective is not RejectIneligible, admittedDirective is not PreemptUndock, admittedDirective is not PreemptService, and verificationDisposition is Neutral, SessionController shall set sessionState to Idle, commandProposal to HoldNoQuery, and sessionSnapshot session result to None.

### Requirements for ShipEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `SHIP_FINDING_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, ShipEvidenceQualifier shall set shipFinding to Neutral.

#### Contract clauses evaluated in the compute phase

##### `SHIP_ACTIVE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case SHIP ACTIVE FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sessionExpectation is ActiveTransfer
>   - At least one of the following conditions holds:
>     
>       - transferEvidence is Failed
>       - transferEvidence is Invalid.

> When all applicability conditions are met, ShipEvidenceQualifier shall produce a result for which all of the following conditions hold:
>
> shipFinding is Fault.

##### `SHIP_OTHER_EXPLICIT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case SHIP OTHER EXPLICIT FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sessionExpectation is not ActiveTransfer
>   - At least one of the following conditions holds:
>     
>       - transferEvidence is Failed
>       - transferEvidence is Invalid.

> When all applicability conditions are met, ShipEvidenceQualifier shall produce a result for which all of the following conditions hold:
>
> shipFinding is Fault.

##### `SHIP_ACTIVE_NOT_COMPLETE` — Conditional behavior

> During contract evaluation for the compute phase, case SHIP ACTIVE NOT COMPLETE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sessionExpectation is ActiveTransfer
>   - At least one of the following conditions holds:
>     
>       - transferEvidence is Idle
>       - transferEvidence is Active.

> When all applicability conditions are met, ShipEvidenceQualifier shall produce a result for which all of the following conditions hold:
>
> shipFinding is NotComplete.

##### `SHIP_ACTIVE_COMPLETE` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is ActiveTransfer and transferEvidence is Complete, ShipEvidenceQualifier shall set shipFinding to Complete.

##### `SHIP_NONE_NEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is None and transferEvidence is Idle, ShipEvidenceQualifier shall set shipFinding to Neutral.

##### `SHIP_NONE_UNEXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, case SHIP NONE UNEXPECTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sessionExpectation is None
>   - At least one of the following conditions holds:
>     
>       - transferEvidence is Active
>       - transferEvidence is Complete.

> When all applicability conditions are met, ShipEvidenceQualifier shall produce a result for which all of the following conditions hold:
>
> shipFinding is Fault.

##### `SHIP_RECOVERY_NEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is RecoveryCheck and transferEvidence is Idle, ShipEvidenceQualifier shall set shipFinding to RecoveryNeutral.

##### `SHIP_RECOVERY_UNEXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, case SHIP RECOVERY UNEXPECTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sessionExpectation is RecoveryCheck
>   - At least one of the following conditions holds:
>     
>       - transferEvidence is Active
>       - transferEvidence is Complete.

> When all applicability conditions are met, ShipEvidenceQualifier shall produce a result for which all of the following conditions hold:
>
> shipFinding is Fault.

### Requirements for WarehouseEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `WAREHOUSE_FINDING_INITIAL` — Required behavior

> During contract evaluation for the initialization phase, WarehouseEvidenceQualifier shall set warehouseFinding to Neutral.

#### Contract clauses evaluated in the compute phase

##### `WAREHOUSE_ACTIVE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case WAREHOUSE ACTIVE FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sessionExpectation is ActiveTransfer
>   - At least one of the following conditions holds:
>     
>       - receiptEvidence is ConflictingReceipt
>       - receiptEvidence is Invalid.

> When all applicability conditions are met, WarehouseEvidenceQualifier shall produce a result for which all of the following conditions hold:
>
> warehouseFinding is Fault.

##### `WAREHOUSE_OTHER_EXPLICIT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case WAREHOUSE OTHER EXPLICIT FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - sessionExpectation is not ActiveTransfer
>   - At least one of the following conditions holds:
>     
>       - receiptEvidence is ConflictingReceipt
>       - receiptEvidence is Invalid.

> When all applicability conditions are met, WarehouseEvidenceQualifier shall produce a result for which all of the following conditions hold:
>
> warehouseFinding is Fault.

##### `WAREHOUSE_ACTIVE_MISSING` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is ActiveTransfer and receiptEvidence is NoReceipt, WarehouseEvidenceQualifier shall set warehouseFinding to Missing.

##### `WAREHOUSE_ACTIVE_MATCH` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is ActiveTransfer and receiptEvidence is MatchingReceipt, WarehouseEvidenceQualifier shall set warehouseFinding to Match.

##### `WAREHOUSE_NONE_NEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is None and receiptEvidence is NoReceipt, WarehouseEvidenceQualifier shall set warehouseFinding to Neutral.

##### `WAREHOUSE_NONE_UNEXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is None and receiptEvidence is MatchingReceipt, WarehouseEvidenceQualifier shall set warehouseFinding to Fault.

##### `WAREHOUSE_RECOVERY_NEUTRAL` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is RecoveryCheck and receiptEvidence is NoReceipt, WarehouseEvidenceQualifier shall set warehouseFinding to RecoveryNeutral.

##### `WAREHOUSE_RECOVERY_UNEXPECTED` — Conditional behavior

> During contract evaluation for the compute phase, if sessionExpectation is RecoveryCheck and receiptEvidence is MatchingReceipt, WarehouseEvidenceQualifier shall set warehouseFinding to Fault.
