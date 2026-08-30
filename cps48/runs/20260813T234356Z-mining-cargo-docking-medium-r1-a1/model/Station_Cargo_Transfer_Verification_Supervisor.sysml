package Station_Cargo_Transfer_Verification_Supervisor {

  private import HAMR::*;

  // Boundary value domains.
  // @trace MON-01
  enum def TransferRequest {
    enum None; enum FreshStart; enum RepeatedStart; enum FreshCancel;
    enum RepeatedCancel; enum FreshReset; enum RepeatedReset; enum Invalid;
  }
  // @trace MON-02
  enum def CargoState { enum Present; enum Empty; enum Invalid; }
  // @trace MON-03
  enum def DockServiceCondition {
    enum TransferAvailable; enum UndockPriority; enum ServiceHold;
    enum Undocked; enum Invalid;
  }
  // @trace MON-04
  enum def ShipTransferEvidence { enum Idle; enum Active; enum Complete; enum Failed; enum Invalid; }
  // @trace MON-05
  enum def WarehouseReceiptEvidence {
    enum NoReceipt; enum MatchingReceipt; enum ConflictingReceipt; enum Invalid;
  }
  // @trace CTRL-01
  enum def ShipCommand { enum Hold; enum BeginOffload; enum StopOffload; }
  // @trace CTRL-02
  enum def WarehouseQuery { enum NoQuery; enum RequestReceipt; }
  // @trace CTRL-03
  enum def PilotTransferReport {
    enum Idle; enum Started; enum InProgress; enum Verified; enum Cancelled;
    enum Inhibited; enum RecoveryRequired; enum ResetComplete;
  }
  // @trace CTRL-04
  enum def StationTransferReport {
    enum Idle; enum OffloadActive; enum VerificationPending; enum Verified;
    enum Stopped; enum RecoveryRequired; enum ResetComplete;
  }

  // Owner-local finite facts.
  // @trace TYPE-01
  enum def QualifiedRequest {
    enum NoNewRequest; enum StartCandidate; enum RejectEmpty;
    enum CancelCandidate; enum ResetCandidate; enum InputFault;
  }
  // @trace TYPE-02
  enum def ServiceEligibility { enum Ready; enum PreemptUndock; enum Ineligible; enum ServiceFault; }
  // @trace TYPE-03
  enum def SessionState {
    enum Idle; enum Commanding; enum AwaitingEvidence; enum Verified;
    enum StoppedByCancel; enum StoppedByUndock; enum StoppedByService;
    enum RecoveryRequired;
  }
  // @trace TYPE-04
  enum def AdmittedDirective {
    enum Hold; enum Begin; enum Cancel; enum PreemptUndock; enum PreemptService;
    enum EnterRecovery; enum Reset; enum RejectEmpty; enum RejectIneligible;
  }
  // @trace TYPE-05
  enum def SessionExpectation { enum None; enum ActiveTransfer; enum RecoveryCheck; }
  // @trace TYPE-06
  enum def ShipFinding { enum Neutral; enum RecoveryNeutral; enum NotComplete; enum Complete; enum Fault; }
  // @trace TYPE-06
  enum def WarehouseFinding { enum Neutral; enum RecoveryNeutral; enum Missing; enum Match; enum Fault; }
  // @trace TYPE-07
  enum def VerificationDisposition {
    enum Neutral; enum Awaiting; enum Verified; enum RecoveryRequired; enum RecoveryClearable;
  }
  // @trace TYPE-08
  enum def CommandProposal { enum HoldNoQuery; enum BeginWithQuery; enum HoldWithQuery; enum StopNoQuery; }
  // @trace TYPE-09
  enum def SessionResult {
    enum None; enum Started; enum Waiting; enum Verified; enum Cancelled;
    enum Inhibited; enum RecoveryRequired; enum ResetComplete;
  }
  // Generated wire encodings are bijective support and receive no owner credit.
  // @trace TYPE-09
  enum def SnapshotSessionState {
    enum Idle; enum Commanding; enum AwaitingEvidence; enum Verified;
    enum StoppedByCancel; enum StoppedByUndock; enum StoppedByService;
    enum RecoveryRequired;
  }
  // @trace TYPE-09
  enum def SnapshotSessionResult {
    enum None; enum Started; enum Waiting; enum Verified; enum Cancelled;
    enum Inhibited; enum RecoveryRequired; enum ResetComplete;
  }

  // Both members are GUMBO-visible attributes in the final refinement.
  // @trace TYPE-09
  part def SessionSnapshot :> Data {
    // @trace TYPE-09
    attribute next_state : SnapshotSessionState;
    // @trace TYPE-09
    attribute session_result : SnapshotSessionResult;
  }

  // @trace PART-01
  part def RequestQualifier :> Thread {
    // @trace INT-01
    port transferRequest : DataPort { in :>> type : TransferRequest; }
    // @trace INT-02
    port cargoState : DataPort { in :>> type : CargoState; }
    // @trace INT-06
    port qualifiedRequest : DataPort { out :>> type : QualifiedRequest; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee REQUEST_INITIAL "Request qualification initializes with no new request":
          qualifiedRequest == QualifiedRequest.NoNewRequest;

      compute
        compute_cases
          // @trace CASE-05
          case REQUEST_INPUT_FAULT "Invalid request or cargo has first local precedence":
            assume transferRequest == TransferRequest.Invalid |
                   cargoState == CargoState.Invalid;
            guarantee qualifiedRequest == QualifiedRequest.InputFault;
          // @trace CASE-02
          case REQUEST_START_CANDIDATE "A fresh start with cargo present is actionable":
            assume transferRequest == TransferRequest.FreshStart &
                   cargoState == CargoState.Present;
            guarantee qualifiedRequest == QualifiedRequest.StartCandidate;
          // @trace CASE-03
          case REQUEST_EMPTY_REJECTION "A fresh start with empty cargo is rejected":
            assume transferRequest == TransferRequest.FreshStart &
                   cargoState == CargoState.Empty;
            guarantee qualifiedRequest == QualifiedRequest.RejectEmpty;
          // @trace LOCAL-01
          case REQUEST_CANCEL_CANDIDATE "A fresh cancel is independently actionable":
            assume transferRequest == TransferRequest.FreshCancel &
                   cargoState != CargoState.Invalid;
            guarantee qualifiedRequest == QualifiedRequest.CancelCandidate;
          // @trace LOCAL-01
          case REQUEST_RESET_CANDIDATE "A fresh reset is independently actionable":
            assume transferRequest == TransferRequest.FreshReset &
                   cargoState != CargoState.Invalid;
            guarantee qualifiedRequest == QualifiedRequest.ResetCandidate;
          // @trace CASE-01
          case REQUEST_NO_NEW "None and repeated requests create no new action":
            assume cargoState != CargoState.Invalid &
                   transferRequest != TransferRequest.Invalid &
                   transferRequest != TransferRequest.FreshStart &
                   transferRequest != TransferRequest.FreshCancel &
                   transferRequest != TransferRequest.FreshReset;
            guarantee qualifiedRequest == QualifiedRequest.NoNewRequest;
    }*/
  }

  // @trace PART-02
  part def ServiceReadinessQualifier :> Thread {
    // @trace INT-03
    port serviceCondition : DataPort { in :>> type : DockServiceCondition; }
    // @trace INT-07
    port serviceEligibility : DataPort { out :>> type : ServiceEligibility; }
    // @trace INT-16
    port gateEligibility : DataPort { out :>> type : ServiceEligibility; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee SERVICE_INITIAL "Service qualification initializes unavailable":
          serviceEligibility == ServiceEligibility.Ineligible &
          gateEligibility == ServiceEligibility.Ineligible;

      compute
        compute_cases
          // @trace LOCAL-02
          case SERVICE_READY "Transfer availability derives readiness for both consumers":
            assume serviceCondition == DockServiceCondition.TransferAvailable;
            guarantee serviceEligibility == ServiceEligibility.Ready &
                      gateEligibility == ServiceEligibility.Ready;
          // @trace POL-CONFLICT-01
          case SERVICE_UNDOCK_PREEMPTION "Undock priority derives the explicit preemption fact":
            assume serviceCondition == DockServiceCondition.UndockPriority;
            guarantee serviceEligibility == ServiceEligibility.PreemptUndock &
                      gateEligibility == ServiceEligibility.PreemptUndock;
          // @trace LOCAL-02
          case SERVICE_INELIGIBLE "Held or undocked service collapses to ineligible":
            assume serviceCondition == DockServiceCondition.ServiceHold |
                   serviceCondition == DockServiceCondition.Undocked;
            guarantee serviceEligibility == ServiceEligibility.Ineligible &
                      gateEligibility == ServiceEligibility.Ineligible;
          // @trace CASE-06
          case SERVICE_FAULT "Invalid service input derives a service fault":
            assume serviceCondition == DockServiceCondition.Invalid;
            guarantee serviceEligibility == ServiceEligibility.ServiceFault &
                      gateEligibility == ServiceEligibility.ServiceFault;
    }*/
  }

  // @trace PART-03
  part def PriorityArbiter :> Thread {
    // @trace INT-06
    port qualifiedRequest : DataPort { in :>> type : QualifiedRequest; }
    // @trace INT-07
    port serviceEligibility : DataPort { in :>> type : ServiceEligibility; }
    // @trace INT-08
    port sessionPrestate : DataPort { in :>> type : SessionState; }
    // @trace INT-09
    port admittedDirective : DataPort { out :>> type : AdmittedDirective; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee ARBITER_INITIAL "The priority arbiter initializes to hold":
          admittedDirective == AdmittedDirective.Hold;

      compute
        compute_cases
          // @trace POL-PRIOR-01
          case ARBITER_FAULT "Input and service faults outrank every lower-priority directive":
            assume qualifiedRequest == QualifiedRequest.InputFault |
                   serviceEligibility == ServiceEligibility.ServiceFault;
            guarantee admittedDirective == AdmittedDirective.EnterRecovery;
          // @trace CASE-10
          case ARBITER_ACTIVE_UNDOCK "Undock priority preempts an active session":
            assume qualifiedRequest != QualifiedRequest.InputFault &
                   serviceEligibility == ServiceEligibility.PreemptUndock &
                   (sessionPrestate == SessionState.Commanding |
                    sessionPrestate == SessionState.AwaitingEvidence);
            guarantee admittedDirective == AdmittedDirective.PreemptUndock;
          // @trace CASE-11
          case ARBITER_ACTIVE_SERVICE_STOP "Other service loss stops an active session":
            assume qualifiedRequest != QualifiedRequest.InputFault &
                   serviceEligibility == ServiceEligibility.Ineligible &
                   (sessionPrestate == SessionState.Commanding |
                    sessionPrestate == SessionState.AwaitingEvidence);
            guarantee admittedDirective == AdmittedDirective.PreemptService;
          // @trace CASE-12
          case ARBITER_ACTIVE_CANCEL "Fresh cancel outranks completion while service remains ready":
            assume qualifiedRequest == QualifiedRequest.CancelCandidate &
                   serviceEligibility == ServiceEligibility.Ready &
                   (sessionPrestate == SessionState.Commanding |
                    sessionPrestate == SessionState.AwaitingEvidence);
            guarantee admittedDirective == AdmittedDirective.Cancel;
          // @trace LOCAL-03
          case ARBITER_ACTIVE_HOLD "Residual active conditions preserve evidence processing":
            assume qualifiedRequest != QualifiedRequest.InputFault &
                   serviceEligibility == ServiceEligibility.Ready &
                   qualifiedRequest != QualifiedRequest.CancelCandidate &
                   (sessionPrestate == SessionState.Commanding |
                    sessionPrestate == SessionState.AwaitingEvidence);
            guarantee admittedDirective == AdmittedDirective.Hold;
          // @trace CASE-04
          case ARBITER_IDLE_UNDOCK "Undock priority inhibits an actionable idle request":
            assume qualifiedRequest != QualifiedRequest.InputFault &
                   serviceEligibility == ServiceEligibility.PreemptUndock &
                   sessionPrestate == SessionState.Idle &
                   (qualifiedRequest == QualifiedRequest.StartCandidate |
                    qualifiedRequest == QualifiedRequest.RejectEmpty |
                    qualifiedRequest == QualifiedRequest.CancelCandidate);
            guarantee admittedDirective == AdmittedDirective.PreemptUndock;
          // @trace CASE-04
          case ARBITER_IDLE_INELIGIBLE "Ordinary service loss rejects an actionable idle request":
            assume qualifiedRequest != QualifiedRequest.InputFault &
                   serviceEligibility == ServiceEligibility.Ineligible &
                   sessionPrestate == SessionState.Idle &
                   (qualifiedRequest == QualifiedRequest.StartCandidate |
                    qualifiedRequest == QualifiedRequest.RejectEmpty |
                    qualifiedRequest == QualifiedRequest.CancelCandidate);
            guarantee admittedDirective == AdmittedDirective.RejectIneligible;
          // @trace LOCAL-03
          case ARBITER_IDLE_NONACTIONABLE_SERVICE "Service preemption without an actionable idle request holds":
            assume qualifiedRequest != QualifiedRequest.InputFault &
                   serviceEligibility != ServiceEligibility.Ready &
                   serviceEligibility != ServiceEligibility.ServiceFault &
                   sessionPrestate == SessionState.Idle &
                   qualifiedRequest != QualifiedRequest.StartCandidate &
                   qualifiedRequest != QualifiedRequest.RejectEmpty &
                   qualifiedRequest != QualifiedRequest.CancelCandidate;
            guarantee admittedDirective == AdmittedDirective.Hold;
          // @trace CASE-02
          case ARBITER_IDLE_BEGIN "Only ready idle start qualification admits begin":
            assume qualifiedRequest == QualifiedRequest.StartCandidate &
                   serviceEligibility == ServiceEligibility.Ready &
                   sessionPrestate == SessionState.Idle;
            guarantee admittedDirective == AdmittedDirective.Begin;
          // @trace LOCAL-03
          case ARBITER_IDLE_EMPTY "Empty cargo retains a distinct rejection directive":
            assume qualifiedRequest == QualifiedRequest.RejectEmpty &
                   serviceEligibility == ServiceEligibility.Ready &
                   sessionPrestate == SessionState.Idle;
            guarantee admittedDirective == AdmittedDirective.RejectEmpty;
          // @trace CASE-13
          case ARBITER_IDLE_CANCEL "Fresh cancel while idle is observable but starts nothing":
            assume qualifiedRequest == QualifiedRequest.CancelCandidate &
                   serviceEligibility == ServiceEligibility.Ready &
                   sessionPrestate == SessionState.Idle;
            guarantee admittedDirective == AdmittedDirective.Cancel;
          // @trace CASE-01
          case ARBITER_IDLE_HOLD "Residual ready idle qualification holds":
            assume serviceEligibility == ServiceEligibility.Ready &
                   sessionPrestate == SessionState.Idle &
                   qualifiedRequest != QualifiedRequest.InputFault &
                   qualifiedRequest != QualifiedRequest.StartCandidate &
                   qualifiedRequest != QualifiedRequest.RejectEmpty &
                   qualifiedRequest != QualifiedRequest.CancelCandidate;
            guarantee admittedDirective == AdmittedDirective.Hold;
          // @trace LOCAL-03
          case ARBITER_LATCH_RESET "A ready fresh reset is admitted only from a latch":
            assume qualifiedRequest == QualifiedRequest.ResetCandidate &
                   serviceEligibility == ServiceEligibility.Ready &
                   sessionPrestate != SessionState.Idle &
                   sessionPrestate != SessionState.Commanding &
                   sessionPrestate != SessionState.AwaitingEvidence;
            guarantee admittedDirective == AdmittedDirective.Reset;
          // @trace CASE-18
          case ARBITER_LATCH_BLOCKED_RESET "A reset without ready service is explicitly ineligible":
            assume qualifiedRequest == QualifiedRequest.ResetCandidate &
                   serviceEligibility != ServiceEligibility.Ready &
                   serviceEligibility != ServiceEligibility.ServiceFault &
                   sessionPrestate != SessionState.Idle &
                   sessionPrestate != SessionState.Commanding &
                   sessionPrestate != SessionState.AwaitingEvidence;
            guarantee admittedDirective == AdmittedDirective.RejectIneligible;
          // @trace CASE-17
          case ARBITER_LATCH_HOLD "All other nonfault terminal and recovery requests remain latched":
            assume qualifiedRequest != QualifiedRequest.InputFault &
                   serviceEligibility != ServiceEligibility.ServiceFault &
                   sessionPrestate != SessionState.Idle &
                   sessionPrestate != SessionState.Commanding &
                   sessionPrestate != SessionState.AwaitingEvidence &
                   qualifiedRequest != QualifiedRequest.ResetCandidate;
            guarantee admittedDirective == AdmittedDirective.Hold;
    }*/
  }

  // @trace PART-04
  part def SessionController :> Thread {
    // @trace INT-09
    port admittedDirective : DataPort { in :>> type : AdmittedDirective; }
    // @trace INT-14
    port verificationDisposition : DataPort { in :>> type : VerificationDisposition; }
    // @trace INT-08
    port sessionPrestate : DataPort { out :>> type : SessionState; }
    // @trace INT-10
    port shipExpectation : DataPort { out :>> type : SessionExpectation; }
    // @trace INT-11
    port warehouseExpectation : DataPort { out :>> type : SessionExpectation; }
    // @trace INT-15
    port commandProposal : DataPort { out :>> type : CommandProposal; }
    // @trace INT-17
    port sessionSnapshot : DataPort { out :>> type : SessionSnapshot; }

    language "GUMBO" /*{
      state
        // @trace POL-STATE-01
        sessionState : SessionState;

      functions
        // @trace TYPE-09
        def snapshot_state(value: SessionState): SnapshotSessionState :=
          if (value == SessionState.Commanding)? SnapshotSessionState.Commanding
          else if (value == SessionState.AwaitingEvidence)? SnapshotSessionState.AwaitingEvidence
          else if (value == SessionState.Verified)? SnapshotSessionState.Verified
          else if (value == SessionState.StoppedByCancel)? SnapshotSessionState.StoppedByCancel
          else if (value == SessionState.StoppedByUndock)? SnapshotSessionState.StoppedByUndock
          else if (value == SessionState.StoppedByService)? SnapshotSessionState.StoppedByService
          else if (value == SessionState.RecoveryRequired)? SnapshotSessionState.RecoveryRequired
          else SnapshotSessionState.Idle;

      initialize
        // @trace CONSTR-02
        guarantee SESSION_INITIAL "The sole session state and all controller outputs initialize safely":
          sessionState == SessionState.Idle &
          sessionPrestate == SessionState.Idle &
          shipExpectation == SessionExpectation.None &
          warehouseExpectation == SessionExpectation.None &
          commandProposal == CommandProposal.HoldNoQuery &
          sessionSnapshot.next_state == SnapshotSessionState.Idle &
          sessionSnapshot.session_result == SnapshotSessionResult.None;

      compute
        // @trace INT-08
        guarantee PUBLISH_PRESTATE "The arbiter receives the carried pre-state, never a shadow state":
          sessionPrestate == In(sessionState);
        // @trace LOCAL-04
        guarantee EXPECTATION_FROM_PRESTATE "Both evidence owners receive the expectation derived from the carried pre-state":
          (((In(sessionState) == SessionState.Commanding |
             In(sessionState) == SessionState.AwaitingEvidence) implies
              (shipExpectation == SessionExpectation.ActiveTransfer &
               warehouseExpectation == SessionExpectation.ActiveTransfer)) &
           ((In(sessionState) == SessionState.RecoveryRequired) implies
              (shipExpectation == SessionExpectation.RecoveryCheck &
               warehouseExpectation == SessionExpectation.RecoveryCheck)) &
           ((In(sessionState) != SessionState.Commanding &
             In(sessionState) != SessionState.AwaitingEvidence &
             In(sessionState) != SessionState.RecoveryRequired) implies
              (shipExpectation == SessionExpectation.None &
               warehouseExpectation == SessionExpectation.None)));
        // @trace TYPE-09
        guarantee SNAPSHOT_STATE "The snapshot exposes the owner-selected post-state":
          sessionSnapshot.next_state == snapshot_state(sessionState);

        compute_cases
          // @trace LOCAL-04
          case ACTIVE_FAULT_TRANSITION "Fault precedence stops an active command and enters recovery":
            assume (In(sessionState) == SessionState.Commanding |
                    In(sessionState) == SessionState.AwaitingEvidence) &
                   (admittedDirective == AdmittedDirective.EnterRecovery |
                    verificationDisposition == VerificationDisposition.RecoveryRequired);
            guarantee sessionState == SessionState.RecoveryRequired &
                      commandProposal == CommandProposal.StopNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.RecoveryRequired;
          // @trace LOCAL-04
          case INACTIVE_FAULT_TRANSITION "Fault precedence enters or preserves recovery from an inactive state":
            assume In(sessionState) != SessionState.Commanding &
                   In(sessionState) != SessionState.AwaitingEvidence &
                   (admittedDirective == AdmittedDirective.EnterRecovery |
                    verificationDisposition == VerificationDisposition.RecoveryRequired);
            guarantee sessionState == SessionState.RecoveryRequired &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.RecoveryRequired;
          // @trace LOCAL-04
          case ACTIVE_INCONSISTENT_DISPOSITION "Producer-inconsistent active dispositions fail closed without case credit":
            assume (In(sessionState) == SessionState.Commanding |
                    In(sessionState) == SessionState.AwaitingEvidence) &
                   admittedDirective != AdmittedDirective.EnterRecovery &
                   verificationDisposition != VerificationDisposition.RecoveryRequired &
                   (verificationDisposition == VerificationDisposition.Neutral |
                    verificationDisposition == VerificationDisposition.RecoveryClearable);
            guarantee sessionState == SessionState.RecoveryRequired &
                      commandProposal == CommandProposal.StopNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.RecoveryRequired;
          // @trace LOCAL-04
          case INACTIVE_INCONSISTENT_DISPOSITION "Producer-inconsistent inactive dispositions fail closed without case credit":
            assume In(sessionState) != SessionState.Commanding &
                   In(sessionState) != SessionState.AwaitingEvidence &
                   admittedDirective != AdmittedDirective.EnterRecovery &
                   verificationDisposition != VerificationDisposition.RecoveryRequired &
                   (((In(sessionState) == SessionState.RecoveryRequired) &
                     (verificationDisposition == VerificationDisposition.Neutral |
                      verificationDisposition == VerificationDisposition.Awaiting |
                      verificationDisposition == VerificationDisposition.Verified)) |
                    ((In(sessionState) != SessionState.RecoveryRequired) &
                     (verificationDisposition == VerificationDisposition.Awaiting |
                      verificationDisposition == VerificationDisposition.Verified |
                      verificationDisposition == VerificationDisposition.RecoveryClearable)));
            guarantee sessionState == SessionState.RecoveryRequired &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.RecoveryRequired;
          // @trace CASE-10
          case ACTIVE_UNDOCK_STOP "Undock preemption outranks cancellation and completion":
            assume (In(sessionState) == SessionState.Commanding |
                    In(sessionState) == SessionState.AwaitingEvidence) &
                   admittedDirective == AdmittedDirective.PreemptUndock &
                   verificationDisposition != VerificationDisposition.RecoveryRequired &
                   verificationDisposition != VerificationDisposition.Neutral &
                   verificationDisposition != VerificationDisposition.RecoveryClearable;
            guarantee sessionState == SessionState.StoppedByUndock &
                      commandProposal == CommandProposal.StopNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.Inhibited;
          // @trace CASE-11
          case ACTIVE_SERVICE_STOP "Other service preemption stops an active session":
            assume (In(sessionState) == SessionState.Commanding |
                    In(sessionState) == SessionState.AwaitingEvidence) &
                   admittedDirective == AdmittedDirective.PreemptService &
                   verificationDisposition != VerificationDisposition.RecoveryRequired &
                   verificationDisposition != VerificationDisposition.Neutral &
                   verificationDisposition != VerificationDisposition.RecoveryClearable;
            guarantee sessionState == SessionState.StoppedByService &
                      commandProposal == CommandProposal.StopNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.Inhibited;
          // @trace CASE-12
          case ACTIVE_CANCEL_STOP "Cancellation outranks a coincident verified disposition":
            assume (In(sessionState) == SessionState.Commanding |
                    In(sessionState) == SessionState.AwaitingEvidence) &
                   admittedDirective == AdmittedDirective.Cancel &
                   verificationDisposition != VerificationDisposition.RecoveryRequired &
                   verificationDisposition != VerificationDisposition.Neutral &
                   verificationDisposition != VerificationDisposition.RecoveryClearable;
            guarantee sessionState == SessionState.StoppedByCancel &
                      commandProposal == CommandProposal.StopNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.Cancelled;
          // @trace CASE-16
          case ACTIVE_VERIFIED "Two-source verification closes the active session after higher priorities are excluded":
            assume (In(sessionState) == SessionState.Commanding |
                    In(sessionState) == SessionState.AwaitingEvidence) &
                   admittedDirective != AdmittedDirective.EnterRecovery &
                   admittedDirective != AdmittedDirective.PreemptUndock &
                   admittedDirective != AdmittedDirective.PreemptService &
                   admittedDirective != AdmittedDirective.Cancel &
                   verificationDisposition == VerificationDisposition.Verified;
            guarantee sessionState == SessionState.Verified &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.Verified;
          // @trace CASE-14
          case ACTIVE_PROGRESS "Every remaining producer-consistent active disposition waits for evidence":
            assume (In(sessionState) == SessionState.Commanding |
                    In(sessionState) == SessionState.AwaitingEvidence) &
                   admittedDirective != AdmittedDirective.EnterRecovery &
                   admittedDirective != AdmittedDirective.PreemptUndock &
                   admittedDirective != AdmittedDirective.PreemptService &
                   admittedDirective != AdmittedDirective.Cancel &
                   verificationDisposition == VerificationDisposition.Awaiting;
            guarantee sessionState == SessionState.AwaitingEvidence &
                      commandProposal == CommandProposal.HoldWithQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.Waiting;
          // @trace CASE-19
          case RECOVERY_CLEAR "Only an admitted reset plus clearable evidence clears recovery":
            assume In(sessionState) == SessionState.RecoveryRequired &
                   admittedDirective == AdmittedDirective.Reset &
                   verificationDisposition == VerificationDisposition.RecoveryClearable;
            guarantee sessionState == SessionState.Idle &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.ResetComplete;
          // @trace CASE-18
          case RECOVERY_BLOCKED_RESET "A reset rejected by service eligibility preserves recovery":
            assume In(sessionState) == SessionState.RecoveryRequired &
                   admittedDirective == AdmittedDirective.RejectIneligible &
                   verificationDisposition == VerificationDisposition.RecoveryClearable;
            guarantee sessionState == SessionState.RecoveryRequired &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.None;
          // @trace CASE-17
          case RECOVERY_LATCH "All other producer-consistent recovery inputs remain latched":
            assume In(sessionState) == SessionState.RecoveryRequired &
                   admittedDirective != AdmittedDirective.EnterRecovery &
                   admittedDirective != AdmittedDirective.Reset &
                   admittedDirective != AdmittedDirective.RejectIneligible &
                   verificationDisposition == VerificationDisposition.RecoveryClearable;
            guarantee sessionState == SessionState.RecoveryRequired &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.None;
          // @trace CASE-20
          case TERMINAL_RESET "An admitted reset clears any verified or stopped terminal latch":
            assume (In(sessionState) == SessionState.Verified |
                    In(sessionState) == SessionState.StoppedByCancel |
                    In(sessionState) == SessionState.StoppedByUndock |
                    In(sessionState) == SessionState.StoppedByService) &
                   admittedDirective == AdmittedDirective.Reset &
                   verificationDisposition == VerificationDisposition.Neutral;
            guarantee sessionState == SessionState.Idle &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.ResetComplete;
          // @trace CASE-17
          case TERMINAL_LATCH "Without an admitted reset a terminal state persists":
            assume (In(sessionState) == SessionState.Verified |
                    In(sessionState) == SessionState.StoppedByCancel |
                    In(sessionState) == SessionState.StoppedByUndock |
                    In(sessionState) == SessionState.StoppedByService) &
                   admittedDirective != AdmittedDirective.EnterRecovery &
                   admittedDirective != AdmittedDirective.Reset &
                   verificationDisposition == VerificationDisposition.Neutral;
            guarantee sessionState == In(sessionState) &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.None;
          // @trace CASE-02
          case IDLE_BEGIN "A qualified begin is the only transition from idle to commanding":
            assume In(sessionState) == SessionState.Idle &
                   admittedDirective == AdmittedDirective.Begin &
                   verificationDisposition == VerificationDisposition.Neutral;
            guarantee sessionState == SessionState.Commanding &
                      commandProposal == CommandProposal.BeginWithQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.Started;
          // @trace CASE-13
          case IDLE_CANCEL "An idle cancellation is observable without inventing active work":
            assume In(sessionState) == SessionState.Idle &
                   admittedDirective == AdmittedDirective.Cancel &
                   verificationDisposition == VerificationDisposition.Neutral;
            guarantee sessionState == SessionState.Idle &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.Cancelled;
          // @trace CASE-04
          case IDLE_INHIBITION "Empty cargo or service conflict inhibits an idle action":
            assume In(sessionState) == SessionState.Idle &
                   (admittedDirective == AdmittedDirective.RejectEmpty |
                    admittedDirective == AdmittedDirective.RejectIneligible |
                    admittedDirective == AdmittedDirective.PreemptUndock |
                    admittedDirective == AdmittedDirective.PreemptService) &
                   verificationDisposition == VerificationDisposition.Neutral;
            guarantee sessionState == SessionState.Idle &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.Inhibited;
          // @trace CASE-01
          case IDLE_HOLD "All remaining producer-consistent idle inputs hold safely":
            assume In(sessionState) == SessionState.Idle &
                   admittedDirective != AdmittedDirective.EnterRecovery &
                   admittedDirective != AdmittedDirective.Begin &
                   admittedDirective != AdmittedDirective.Cancel &
                   admittedDirective != AdmittedDirective.RejectEmpty &
                   admittedDirective != AdmittedDirective.RejectIneligible &
                   admittedDirective != AdmittedDirective.PreemptUndock &
                   admittedDirective != AdmittedDirective.PreemptService &
                   verificationDisposition == VerificationDisposition.Neutral;
            guarantee sessionState == SessionState.Idle &
                      commandProposal == CommandProposal.HoldNoQuery &
                      sessionSnapshot.session_result == SnapshotSessionResult.None;
    }*/
  }

  // @trace PART-05
  part def ShipEvidenceQualifier :> Thread {
    // @trace INT-04
    port transferEvidence : DataPort { in :>> type : ShipTransferEvidence; }
    // @trace INT-10
    port sessionExpectation : DataPort { in :>> type : SessionExpectation; }
    // @trace INT-12
    port shipFinding : DataPort { out :>> type : ShipFinding; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee SHIP_FINDING_INITIAL "Ship evidence initializes neutral":
          shipFinding == ShipFinding.Neutral;

      compute
        compute_cases
          // @trace CASE-07
          case SHIP_ACTIVE_FAULT "Failed or invalid evidence during an active expectation is faulted":
            assume sessionExpectation == SessionExpectation.ActiveTransfer &
                   (transferEvidence == ShipTransferEvidence.Failed |
                    transferEvidence == ShipTransferEvidence.Invalid);
            guarantee shipFinding == ShipFinding.Fault;
          // @trace LOCAL-05
          case SHIP_OTHER_EXPLICIT_FAULT "Failed or invalid evidence is faulted under every other expectation":
            assume sessionExpectation != SessionExpectation.ActiveTransfer &
                   (transferEvidence == ShipTransferEvidence.Failed |
                    transferEvidence == ShipTransferEvidence.Invalid);
            guarantee shipFinding == ShipFinding.Fault;
          // @trace LOCAL-05
          case SHIP_ACTIVE_NOT_COMPLETE "Idle or active ship evidence is incomplete during transfer":
            assume sessionExpectation == SessionExpectation.ActiveTransfer &
                   (transferEvidence == ShipTransferEvidence.Idle |
                    transferEvidence == ShipTransferEvidence.Active);
            guarantee shipFinding == ShipFinding.NotComplete;
          // @trace LOCAL-05
          case SHIP_ACTIVE_COMPLETE "Complete ship evidence is qualified only during transfer":
            assume sessionExpectation == SessionExpectation.ActiveTransfer &
                   transferEvidence == ShipTransferEvidence.Complete;
            guarantee shipFinding == ShipFinding.Complete;
          // @trace LOCAL-05
          case SHIP_NONE_NEUTRAL "Idle evidence is neutral when no transfer is expected":
            assume sessionExpectation == SessionExpectation.None &
                   transferEvidence == ShipTransferEvidence.Idle;
            guarantee shipFinding == ShipFinding.Neutral;
          // @trace CASE-09
          case SHIP_NONE_UNEXPECTED "Active or complete evidence outside a session is a fault":
            assume sessionExpectation == SessionExpectation.None &
                   (transferEvidence == ShipTransferEvidence.Active |
                    transferEvidence == ShipTransferEvidence.Complete);
            guarantee shipFinding == ShipFinding.Fault;
          // @trace LOCAL-05
          case SHIP_RECOVERY_NEUTRAL "Idle evidence is the only recovery-neutral ship fact":
            assume sessionExpectation == SessionExpectation.RecoveryCheck &
                   transferEvidence == ShipTransferEvidence.Idle;
            guarantee shipFinding == ShipFinding.RecoveryNeutral;
          // @trace CASE-09
          case SHIP_RECOVERY_UNEXPECTED "Activity or completion during recovery is a fault":
            assume sessionExpectation == SessionExpectation.RecoveryCheck &
                   (transferEvidence == ShipTransferEvidence.Active |
                    transferEvidence == ShipTransferEvidence.Complete);
            guarantee shipFinding == ShipFinding.Fault;
    }*/
  }

  // @trace PART-06
  part def WarehouseEvidenceQualifier :> Thread {
    // @trace INT-05
    port receiptEvidence : DataPort { in :>> type : WarehouseReceiptEvidence; }
    // @trace INT-11
    port sessionExpectation : DataPort { in :>> type : SessionExpectation; }
    // @trace INT-13
    port warehouseFinding : DataPort { out :>> type : WarehouseFinding; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee WAREHOUSE_FINDING_INITIAL "Warehouse evidence initializes neutral":
          warehouseFinding == WarehouseFinding.Neutral;

      compute
        compute_cases
          // @trace CASE-08
          case WAREHOUSE_ACTIVE_FAULT "Conflicting or invalid receipt evidence during transfer is faulted":
            assume sessionExpectation == SessionExpectation.ActiveTransfer &
                   (receiptEvidence == WarehouseReceiptEvidence.ConflictingReceipt |
                    receiptEvidence == WarehouseReceiptEvidence.Invalid);
            guarantee warehouseFinding == WarehouseFinding.Fault;
          // @trace LOCAL-06
          case WAREHOUSE_OTHER_EXPLICIT_FAULT "Conflicting or invalid receipt evidence is always faulted":
            assume sessionExpectation != SessionExpectation.ActiveTransfer &
                   (receiptEvidence == WarehouseReceiptEvidence.ConflictingReceipt |
                    receiptEvidence == WarehouseReceiptEvidence.Invalid);
            guarantee warehouseFinding == WarehouseFinding.Fault;
          // @trace CASE-14
          case WAREHOUSE_ACTIVE_MISSING "No receipt is explicitly missing while transfer evidence is expected":
            assume sessionExpectation == SessionExpectation.ActiveTransfer &
                   receiptEvidence == WarehouseReceiptEvidence.NoReceipt;
            guarantee warehouseFinding == WarehouseFinding.Missing;
          // @trace LOCAL-06
          case WAREHOUSE_ACTIVE_MATCH "A matching receipt is qualified only during transfer":
            assume sessionExpectation == SessionExpectation.ActiveTransfer &
                   receiptEvidence == WarehouseReceiptEvidence.MatchingReceipt;
            guarantee warehouseFinding == WarehouseFinding.Match;
          // @trace LOCAL-06
          case WAREHOUSE_NONE_NEUTRAL "No receipt is neutral when no transfer is expected":
            assume sessionExpectation == SessionExpectation.None &
                   receiptEvidence == WarehouseReceiptEvidence.NoReceipt;
            guarantee warehouseFinding == WarehouseFinding.Neutral;
          // @trace CASE-09
          case WAREHOUSE_NONE_UNEXPECTED "A receipt outside an active session is a fault":
            assume sessionExpectation == SessionExpectation.None &
                   receiptEvidence == WarehouseReceiptEvidence.MatchingReceipt;
            guarantee warehouseFinding == WarehouseFinding.Fault;
          // @trace LOCAL-06
          case WAREHOUSE_RECOVERY_NEUTRAL "No receipt is the only recovery-neutral warehouse fact":
            assume sessionExpectation == SessionExpectation.RecoveryCheck &
                   receiptEvidence == WarehouseReceiptEvidence.NoReceipt;
            guarantee warehouseFinding == WarehouseFinding.RecoveryNeutral;
          // @trace CASE-09
          case WAREHOUSE_RECOVERY_UNEXPECTED "A matching receipt during recovery is a fault":
            assume sessionExpectation == SessionExpectation.RecoveryCheck &
                   receiptEvidence == WarehouseReceiptEvidence.MatchingReceipt;
            guarantee warehouseFinding == WarehouseFinding.Fault;
    }*/
  }

  // @trace PART-07
  part def CompletionReconciler :> Thread {
    // @trace INT-12
    port shipFinding : DataPort { in :>> type : ShipFinding; }
    // @trace INT-13
    port warehouseFinding : DataPort { in :>> type : WarehouseFinding; }
    // @trace INT-14
    port verificationDisposition : DataPort { out :>> type : VerificationDisposition; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee RECONCILER_INITIAL "Completion reconciliation initializes neutral":
          verificationDisposition == VerificationDisposition.Neutral;

      compute
        compute_cases
          // @trace CASE-09
          case RECONCILE_FAULT "Either qualified evidence fault requires recovery":
            assume shipFinding == ShipFinding.Fault |
                   warehouseFinding == WarehouseFinding.Fault;
            guarantee verificationDisposition == VerificationDisposition.RecoveryRequired;
          // @trace CASE-19
          case RECONCILE_RECOVERY_CLEARABLE "Two independent recovery-neutral facts permit recovery clearance":
            assume shipFinding == ShipFinding.RecoveryNeutral &
                   warehouseFinding == WarehouseFinding.RecoveryNeutral;
            guarantee verificationDisposition == VerificationDisposition.RecoveryClearable;
          // @trace CASE-16
          case RECONCILE_VERIFIED "Only complete ship evidence plus a matching receipt verifies":
            assume shipFinding == ShipFinding.Complete &
                   warehouseFinding == WarehouseFinding.Match;
            guarantee verificationDisposition == VerificationDisposition.Verified;
          // @trace CASE-14
          case RECONCILE_MISSING "A noncomplete ship finding plus missing receipt remains awaiting":
            assume shipFinding == ShipFinding.NotComplete &
                   warehouseFinding == WarehouseFinding.Missing;
            guarantee verificationDisposition == VerificationDisposition.Awaiting;
          // @trace CASE-15
          case RECONCILE_OTHER_PARTIAL "Every other producer-valid active nonfault pair remains awaiting":
            assume ((shipFinding == ShipFinding.Complete &
                     warehouseFinding == WarehouseFinding.Missing) |
                    (shipFinding == ShipFinding.NotComplete &
                     warehouseFinding == WarehouseFinding.Match));
            guarantee verificationDisposition == VerificationDisposition.Awaiting;
          // @trace LOCAL-07
          case RECONCILE_NEUTRAL "Two ordinary neutral findings produce a neutral disposition":
            assume shipFinding == ShipFinding.Neutral &
                   warehouseFinding == WarehouseFinding.Neutral;
            guarantee verificationDisposition == VerificationDisposition.Neutral;
          // @trace LOCAL-07
          case RECONCILE_INCONSISTENT "Cross-expectation pairs fail closed without semantic-case credit":
            assume shipFinding != ShipFinding.Fault &
                   warehouseFinding != WarehouseFinding.Fault &
                   not (shipFinding == ShipFinding.RecoveryNeutral &
                     warehouseFinding == WarehouseFinding.RecoveryNeutral) &
                   not (shipFinding == ShipFinding.Complete &
                     warehouseFinding == WarehouseFinding.Match) &
                   not (shipFinding == ShipFinding.NotComplete &
                     warehouseFinding == WarehouseFinding.Missing) &
                   not (shipFinding == ShipFinding.Complete &
                     warehouseFinding == WarehouseFinding.Missing) &
                   not (shipFinding == ShipFinding.NotComplete &
                     warehouseFinding == WarehouseFinding.Match) &
                   not (shipFinding == ShipFinding.Neutral &
                     warehouseFinding == WarehouseFinding.Neutral);
            guarantee verificationDisposition == VerificationDisposition.RecoveryRequired;
    }*/
  }

  // @trace PART-08
  part def CommandSafetyGate :> Thread {
    // @trace INT-15
    port commandProposal : DataPort { in :>> type : CommandProposal; }
    // @trace INT-16
    port serviceEligibility : DataPort { in :>> type : ServiceEligibility; }
    // @trace INT-18
    port shipCommand : DataPort { out :>> type : ShipCommand; }
    // @trace INT-19
    port receiptQuery : DataPort { out :>> type : WarehouseQuery; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee COMMAND_GATE_INITIAL "Boundary commands initialize held with no query":
          shipCommand == ShipCommand.Hold &
          receiptQuery == WarehouseQuery.NoQuery;

      compute
        compute_cases
          // @trace LOCAL-08
          case COMMAND_STOP_PRESERVED "A stop proposal is preserved for every current service fact":
            assume commandProposal == CommandProposal.StopNoQuery;
            guarantee shipCommand == ShipCommand.StopOffload &
                      receiptQuery == WarehouseQuery.NoQuery;
          // @trace CASE-02
          case COMMAND_BEGIN_READY "Begin and receipt query are authorized jointly only while ready":
            assume commandProposal == CommandProposal.BeginWithQuery &
                   serviceEligibility == ServiceEligibility.Ready;
            guarantee shipCommand == ShipCommand.BeginOffload &
                      receiptQuery == WarehouseQuery.RequestReceipt;
          // @trace LOCAL-08
          case COMMAND_QUERY_READY "Evidence querying continues only while ready":
            assume commandProposal == CommandProposal.HoldWithQuery &
                   serviceEligibility == ServiceEligibility.Ready;
            guarantee shipCommand == ShipCommand.Hold &
                      receiptQuery == WarehouseQuery.RequestReceipt;
          // @trace POL-CONFLICT-01
          case COMMAND_SUPPRESSED "Every other proposal-service pair suppresses begin and query":
            assume commandProposal != CommandProposal.StopNoQuery &
                   not ((commandProposal == CommandProposal.BeginWithQuery |
                      commandProposal == CommandProposal.HoldWithQuery) &
                     serviceEligibility == ServiceEligibility.Ready);
            guarantee shipCommand == ShipCommand.Hold &
                      receiptQuery == WarehouseQuery.NoQuery;
    }*/
  }

  // @trace PART-09
  part def OutcomeReporter :> Thread {
    // @trace INT-17
    port sessionSnapshot : DataPort { in :>> type : SessionSnapshot; }
    // @trace INT-20
    port pilotReport : DataPort { out :>> type : PilotTransferReport; }
    // @trace INT-21
    port stationReport : DataPort { out :>> type : StationTransferReport; }

    language "GUMBO" /*{
      initialize
        // @trace CONSTR-02
        guarantee REPORT_INITIAL "Both stakeholder reports initialize idle":
          pilotReport == PilotTransferReport.Idle &
          stationReport == StationTransferReport.Idle;

      compute
        compute_cases
          // @trace CASE-20
          case REPORT_RESET_COMPLETE "A cleared latch is visible to both stakeholders":
            assume sessionSnapshot.next_state == SnapshotSessionState.Idle &
                   sessionSnapshot.session_result == SnapshotSessionResult.ResetComplete;
            guarantee pilotReport == PilotTransferReport.ResetComplete &
                      stationReport == StationTransferReport.ResetComplete;
          // @trace CASE-13
          case REPORT_IDLE_CANCELLED "An idle cancel is visible only as a pilot cancellation":
            assume sessionSnapshot.next_state == SnapshotSessionState.Idle &
                   sessionSnapshot.session_result == SnapshotSessionResult.Cancelled;
            guarantee pilotReport == PilotTransferReport.Cancelled &
                      stationReport == StationTransferReport.Idle;
          // @trace CASE-04
          case REPORT_IDLE_INHIBITED "Idle inhibition is visible to the pilot without claiming station activity":
            assume sessionSnapshot.next_state == SnapshotSessionState.Idle &
                   sessionSnapshot.session_result == SnapshotSessionResult.Inhibited;
            guarantee pilotReport == PilotTransferReport.Inhibited &
                      stationReport == StationTransferReport.Idle;
          // @trace CASE-01
          case REPORT_IDLE "All remaining idle snapshots report idle fail-closed":
            assume sessionSnapshot.next_state == SnapshotSessionState.Idle &
                   sessionSnapshot.session_result != SnapshotSessionResult.ResetComplete &
                   sessionSnapshot.session_result != SnapshotSessionResult.Cancelled &
                   sessionSnapshot.session_result != SnapshotSessionResult.Inhibited;
            guarantee pilotReport == PilotTransferReport.Idle &
                      stationReport == StationTransferReport.Idle;
          // @trace CASE-02
          case REPORT_STARTED "The commanding start transition has distinct stakeholder views":
            assume sessionSnapshot.next_state == SnapshotSessionState.Commanding &
                   sessionSnapshot.session_result == SnapshotSessionResult.Started;
            guarantee pilotReport == PilotTransferReport.Started &
                      stationReport == StationTransferReport.OffloadActive;
          // @trace LOCAL-09
          case REPORT_COMMANDING_PROGRESS "Other commanding snapshots remain active and in progress":
            assume sessionSnapshot.next_state == SnapshotSessionState.Commanding &
                   sessionSnapshot.session_result != SnapshotSessionResult.Started;
            guarantee pilotReport == PilotTransferReport.InProgress &
                      stationReport == StationTransferReport.OffloadActive;
          // @trace CASE-14
          case REPORT_AWAITING "Awaiting evidence has recipient-specific progress reports":
            assume sessionSnapshot.next_state == SnapshotSessionState.AwaitingEvidence;
            guarantee pilotReport == PilotTransferReport.InProgress &
                      stationReport == StationTransferReport.VerificationPending;
          // @trace CASE-16
          case REPORT_VERIFIED "Verified state is reported identically to both stakeholders":
            assume sessionSnapshot.next_state == SnapshotSessionState.Verified;
            guarantee pilotReport == PilotTransferReport.Verified &
                      stationReport == StationTransferReport.Verified;
          // @trace CASE-12
          case REPORT_CANCEL_STOP "Cancellation stop remains distinct for the pilot":
            assume sessionSnapshot.next_state == SnapshotSessionState.StoppedByCancel;
            guarantee pilotReport == PilotTransferReport.Cancelled &
                      stationReport == StationTransferReport.Stopped;
          // @trace CASE-10
          case REPORT_SERVICE_STOP "Undock and other service stops inhibit the pilot view":
            assume sessionSnapshot.next_state == SnapshotSessionState.StoppedByUndock |
                   sessionSnapshot.next_state == SnapshotSessionState.StoppedByService;
            guarantee pilotReport == PilotTransferReport.Inhibited &
                      stationReport == StationTransferReport.Stopped;
          // @trace CASE-09
          case REPORT_RECOVERY "Recovery state is never hidden from either stakeholder":
            assume sessionSnapshot.next_state == SnapshotSessionState.RecoveryRequired;
            guarantee pilotReport == PilotTransferReport.RecoveryRequired &
                      stationReport == StationTransferReport.RecoveryRequired;
    }*/
  }

  // @generated-support STRUCT-02 behavior-free containment and boundary routing only
  part def CargoTransferSupervisorProcess :> Process {
    // @trace PART-01
    part requestQualifier : RequestQualifier;
    // @trace PART-02
    part serviceReadinessQualifier : ServiceReadinessQualifier;
    // @trace PART-03
    part priorityArbiter : PriorityArbiter;
    // @trace PART-04
    part sessionController : SessionController;
    // @trace PART-05
    part shipEvidenceQualifier : ShipEvidenceQualifier;
    // @trace PART-06
    part warehouseEvidenceQualifier : WarehouseEvidenceQualifier;
    // @trace PART-07
    part completionReconciler : CompletionReconciler;
    // @trace PART-08
    part commandSafetyGate : CommandSafetyGate;
    // @trace PART-09
    part outcomeReporter : OutcomeReporter;

    // @generated-support INT-01 root/Process boundary delegation endpoint only
    port transferRequest : DataPort { in :>> type : TransferRequest; }
    // @generated-support INT-02 root/Process boundary delegation endpoint only
    port cargoState : DataPort { in :>> type : CargoState; }
    // @generated-support INT-03 root/Process boundary delegation endpoint only
    port serviceCondition : DataPort { in :>> type : DockServiceCondition; }
    // @generated-support INT-04 root/Process boundary delegation endpoint only
    port transferEvidence : DataPort { in :>> type : ShipTransferEvidence; }
    // @generated-support INT-05 root/Process boundary delegation endpoint only
    port receiptEvidence : DataPort { in :>> type : WarehouseReceiptEvidence; }
    // @generated-support INT-18 root/Process boundary delegation endpoint only
    port shipCommand : DataPort { out :>> type : ShipCommand; }
    // @generated-support INT-19 root/Process boundary delegation endpoint only
    port receiptQuery : DataPort { out :>> type : WarehouseQuery; }
    // @generated-support INT-20 root/Process boundary delegation endpoint only
    port pilotReport : DataPort { out :>> type : PilotTransferReport; }
    // @generated-support INT-21 root/Process boundary delegation endpoint only
    port stationReport : DataPort { out :>> type : StationTransferReport; }

    // @trace INT-01
    connection int01 : PortConnection connect transferRequest to requestQualifier.transferRequest;
    // @trace INT-02
    connection int02 : PortConnection connect cargoState to requestQualifier.cargoState;
    // @trace INT-03
    connection int03 : PortConnection connect serviceCondition to serviceReadinessQualifier.serviceCondition;
    // @trace INT-04
    connection int04 : PortConnection connect transferEvidence to shipEvidenceQualifier.transferEvidence;
    // @trace INT-05
    connection int05 : PortConnection connect receiptEvidence to warehouseEvidenceQualifier.receiptEvidence;
    // @trace INT-06
    connection int06 : PortConnection connect requestQualifier.qualifiedRequest to priorityArbiter.qualifiedRequest;
    // @trace INT-07
    connection int07 : PortConnection connect serviceReadinessQualifier.serviceEligibility to priorityArbiter.serviceEligibility;
    // @trace INT-08
    connection int08 : PortConnection connect sessionController.sessionPrestate to priorityArbiter.sessionPrestate;
    // @trace INT-09
    connection int09 : PortConnection connect priorityArbiter.admittedDirective to sessionController.admittedDirective;
    // @trace INT-10
    connection int10 : PortConnection connect sessionController.shipExpectation to shipEvidenceQualifier.sessionExpectation;
    // @trace INT-11
    connection int11 : PortConnection connect sessionController.warehouseExpectation to warehouseEvidenceQualifier.sessionExpectation;
    // @trace INT-12
    connection int12 : PortConnection connect shipEvidenceQualifier.shipFinding to completionReconciler.shipFinding;
    // @trace INT-13
    connection int13 : PortConnection connect warehouseEvidenceQualifier.warehouseFinding to completionReconciler.warehouseFinding;
    // @trace INT-14
    connection int14 : PortConnection connect completionReconciler.verificationDisposition to sessionController.verificationDisposition;
    // @trace INT-15
    connection int15 : PortConnection connect sessionController.commandProposal to commandSafetyGate.commandProposal;
    // @trace INT-16
    connection int16 : PortConnection connect serviceReadinessQualifier.gateEligibility to commandSafetyGate.serviceEligibility;
    // @trace INT-17
    connection int17 : PortConnection connect sessionController.sessionSnapshot to outcomeReporter.sessionSnapshot;
    // @trace INT-18
    connection int18 : PortConnection connect commandSafetyGate.shipCommand to shipCommand;
    // @trace INT-19
    connection int19 : PortConnection connect commandSafetyGate.receiptQuery to receiptQuery;
    // @trace INT-20
    connection int20 : PortConnection connect outcomeReporter.pilotReport to pilotReport;
    // @trace INT-21
    connection int21 : PortConnection connect outcomeReporter.stationReport to stationReport;
  }

  // @trace BOUND-01
  part def StationCargoTransferVerificationSystem :> System {
    // @generated-support STRUCT-02 support containment only
    part supervisorProcess : CargoTransferSupervisorProcess;

    // @trace MON-01
    port transferRequest : DataPort { in :>> type : TransferRequest; }
    // @trace MON-02
    port cargoState : DataPort { in :>> type : CargoState; }
    // @trace MON-03
    port serviceCondition : DataPort { in :>> type : DockServiceCondition; }
    // @trace MON-04
    port transferEvidence : DataPort { in :>> type : ShipTransferEvidence; }
    // @trace MON-05
    port receiptEvidence : DataPort { in :>> type : WarehouseReceiptEvidence; }
    // @trace CTRL-01
    port shipCommand : DataPort { out :>> type : ShipCommand; }
    // @trace CTRL-02
    port receiptQuery : DataPort { out :>> type : WarehouseQuery; }
    // @trace CTRL-03
    port pilotReport : DataPort { out :>> type : PilotTransferReport; }
    // @trace CTRL-04
    port stationReport : DataPort { out :>> type : StationTransferReport; }

    // @generated-support INT-01 root delegation only
    connection supportInt01 : PortConnection connect transferRequest to supervisorProcess.transferRequest;
    // @generated-support INT-02 root delegation only
    connection supportInt02 : PortConnection connect cargoState to supervisorProcess.cargoState;
    // @generated-support INT-03 root delegation only
    connection supportInt03 : PortConnection connect serviceCondition to supervisorProcess.serviceCondition;
    // @generated-support INT-04 root delegation only
    connection supportInt04 : PortConnection connect transferEvidence to supervisorProcess.transferEvidence;
    // @generated-support INT-05 root delegation only
    connection supportInt05 : PortConnection connect receiptEvidence to supervisorProcess.receiptEvidence;
    // @generated-support INT-18 root delegation only
    connection supportInt18 : PortConnection connect supervisorProcess.shipCommand to shipCommand;
    // @generated-support INT-19 root delegation only
    connection supportInt19 : PortConnection connect supervisorProcess.receiptQuery to receiptQuery;
    // @generated-support INT-20 root delegation only
    connection supportInt20 : PortConnection connect supervisorProcess.pilotReport to pilotReport;
    // @generated-support INT-21 root delegation only
    connection supportInt21 : PortConnection connect supervisorProcess.stationReport to stationReport;
  }

  // @trace BOUND-01
  part stationCargoTransferVerificationSupervisor : StationCargoTransferVerificationSystem;
}
