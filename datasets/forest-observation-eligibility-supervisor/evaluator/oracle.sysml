package Forest_Observation_Eligibility_Supervisor {

  private import HAMR::*;

  // @trace MON-01
  enum def RequestCommand { enum NoCommand; enum Begin; enum Cancel; }
  // @trace MON-01
  enum def RequestToken { enum TokenA; enum TokenB; }

  // Every record member inspected by GUMBO is an attribute, never a nested part.
  // @trace MON-01
  part def RequestInput :> Data {
    // @trace MON-01
    attribute command : RequestCommand;
    // @trace MON-01
    attribute token : RequestToken;
  }

  // @trace MON-02
  enum def EnergyEvidence {
    enum AdequateCurrent; enum LowCurrent; enum UnknownCurrent; enum Invalid; enum Stale;
  }
  // @trace MON-03
  enum def CameraEvidence {
    enum AvailableCurrent; enum UnavailableCurrent; enum UnknownCurrent; enum Invalid; enum Stale;
  }
  // @trace MON-04
  enum def RadioEvidence {
    enum AvailableCurrent; enum UnavailableCurrent; enum UnknownCurrent; enum Invalid; enum Stale;
  }
  // @trace MON-05
  enum def ObservationProgress { enum Idle; enum Active; enum Completed; enum Failed; }
  // @trace CTRL-01
  enum def ObservationAuthorization { enum Withhold; enum Permit; }
  // @trace CTRL-02
  enum def EligibilityStatus {
    enum Idle; enum Evaluating; enum Authorized; enum Active; enum DeniedPower;
    enum DeniedSupport; enum DuplicateIgnored; enum Busy; enum Cancelled;
    enum Completed; enum ServiceFailed; enum AwaitingRecovery;
  }
  // @trace INT-06
  enum def EvaluationTicket { enum NoTicket; enum TokenA; enum TokenB; }
  // @trace INT-08
  enum def RequestContext {
    enum NoContext; enum EvaluateTokenA; enum EvaluateTokenB; enum CancelOutstanding;
  }
  // @trace INT-09
  enum def EnergyVerdict {
    enum NoEnergyVerdict; enum EnergyReady; enum EnergyInsufficient; enum EnergyUntrusted;
  }

  // @generated-support GEN-SUP-03 record tag representation of EvaluationTicket
  // @trace INT-09
  enum def TaggedTicket { enum NoTicket; enum TokenA; enum TokenB; }

  // @trace INT-09
  part def TaggedEnergyVerdict :> Data {
    // @trace INT-09
    attribute verdict : EnergyVerdict;
    // @trace INT-09
    attribute ticket : TaggedTicket;
  }

  // @trace INT-10
  enum def SupportVerdict {
    enum NoSupportVerdict; enum SupportReady; enum SupportUnavailable; enum SupportUntrusted;
  }

  // @trace INT-10
  part def TaggedSupportVerdict :> Data {
    // @trace INT-10
    attribute verdict : SupportVerdict;
    // @trace INT-10
    attribute ticket : TaggedTicket;
  }

  // @trace INT-11
  enum def EligibilityDecision {
    enum NoDecision; enum Permit; enum DenyPower; enum DenySupport; enum Withdraw;
  }
  // @trace INT-12
  enum def GateOutcome {
    enum None; enum DeniedPower; enum DeniedSupport; enum Authorized; enum Active;
    enum Cancelled; enum Completed; enum Failed; enum Recovered;
  }
  // @trace STATE-01
  enum def RequestState { enum Idle; enum Pending; enum Engaged; enum RecoveryHold; }
  // @trace STATE-01
  enum def LastAcceptedToken { enum None; enum TokenA; enum TokenB; }
  // @trace STATE-02
  enum def GatePhase { enum Closed; enum Authorized; enum Active; enum FailureHold; }

  // @trace PART-01
  part def RequestLifecycle :> Thread {
    // @trace INT-01
    port requestInput : DataPort { in :>> type : RequestInput; }
    // @trace INT-12
    port gateOutcome : DataPort { in :>> type : GateOutcome; }
    // @trace INT-06
    port energyTicket : DataPort { out :>> type : EvaluationTicket; }
    // @trace INT-07
    port supportTicket : DataPort { out :>> type : EvaluationTicket; }
    // @trace INT-08
    port requestContext : DataPort { out :>> type : RequestContext; }
    // @trace INT-14
    port eligibilityStatus : DataPort { out :>> type : EligibilityStatus; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        requestState : RequestState;
        // @trace STATE-01
        lastAcceptedToken : LastAcceptedToken;

      initialize
        guarantee
          // @trace INIT-01
          INITIAL_LIFECYCLE "Lifecycle and every inactive pipeline value initialize explicitly":
            requestState == RequestState.Idle &
            lastAcceptedToken == LastAcceptedToken.None &
            energyTicket == EvaluationTicket.NoTicket &
            supportTicket == EvaluationTicket.NoTicket &
            requestContext == RequestContext.NoContext &
            eligibilityStatus == EligibilityStatus.Idle;

      compute
        // @trace POL-01
        guarantee INACTIVE_PIPELINE_COHERENCE "Only an admitted fresh request emits a real ticket or evaluation context":
          ((energyTicket == EvaluationTicket.NoTicket) ==
           (supportTicket == EvaluationTicket.NoTicket)) &
          ((energyTicket == EvaluationTicket.TokenA) ==
           (supportTicket == EvaluationTicket.TokenA)) &
          ((energyTicket == EvaluationTicket.TokenB) ==
           (supportTicket == EvaluationTicket.TokenB));

        compute_cases
          // @trace CASE-10
          case LIFECYCLE_FAILED_FEEDBACK "Committed gate failure enters recovery hold before request admission":
            assume gateOutcome == GateOutcome.Failed;
            guarantee requestState == RequestState.RecoveryHold &
              lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket &
              supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext &
              eligibilityStatus == EligibilityStatus.ServiceFailed;

          // @trace CASE-12
          case LIFECYCLE_RECOVERED_FEEDBACK "Committed recovery closes the hold without evaluating the same-step command":
            assume gateOutcome == GateOutcome.Recovered;
            guarantee requestState == RequestState.Idle &
              lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket &
              supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext &
              eligibilityStatus == EligibilityStatus.Idle;

          // @trace TRANS-01
          case LIFECYCLE_DENIED_POWER "Power denial closes the outstanding request":
            assume gateOutcome == GateOutcome.DeniedPower;
            guarantee requestState == RequestState.Idle &
              lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.DeniedPower;

          // @trace TRANS-01
          case LIFECYCLE_DENIED_SUPPORT "Support denial closes the outstanding request":
            assume gateOutcome == GateOutcome.DeniedSupport;
            guarantee requestState == RequestState.Idle &
              lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.DeniedSupport;

          // @trace CASE-08
          case LIFECYCLE_CANCELLED "Committed cancellation closes the outstanding request":
            assume gateOutcome == GateOutcome.Cancelled;
            guarantee requestState == RequestState.Idle &
              lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Cancelled;

          // @trace CASE-09
          case LIFECYCLE_COMPLETED "Committed completion closes the outstanding request":
            assume gateOutcome == GateOutcome.Completed;
            guarantee requestState == RequestState.Idle &
              lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Completed;

          // @trace TRANS-01
          case LIFECYCLE_AUTHORIZED "Committed authorization engages the outstanding request":
            assume gateOutcome == GateOutcome.Authorized;
            guarantee requestState == RequestState.Engaged &
              lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Authorized;

          // @trace TRANS-01
          case LIFECYCLE_ACTIVE "Committed active progress retains the engaged request":
            assume gateOutcome == GateOutcome.Active;
            guarantee requestState == RequestState.Engaged &
              lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Active;

          // @trace POL-01
          case LIFECYCLE_NO_COMMAND "No command with no gate transition preserves owner state and keeps the pipeline inactive":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.NoCommand;
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext &
              ((In(requestState) == RequestState.Idle) implies (eligibilityStatus == EligibilityStatus.Idle)) &
              ((In(requestState) == RequestState.Pending) implies (eligibilityStatus == EligibilityStatus.Evaluating)) &
              ((In(requestState) == RequestState.Engaged) implies (eligibilityStatus == EligibilityStatus.Active)) &
              ((In(requestState) == RequestState.RecoveryHold) implies (eligibilityStatus == EligibilityStatus.AwaitingRecovery));

          // @trace CASE-08
          case LIFECYCLE_CANCEL_OUTSTANDING "Cancellation of a pending or engaged request emits only withdrawal context":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Cancel &
              (In(requestState) == RequestState.Pending | In(requestState) == RequestState.Engaged);
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.CancelOutstanding &
              eligibilityStatus == EligibilityStatus.Evaluating;

          // @trace POL-01
          case LIFECYCLE_CANCEL_NOOP "Cancellation with no outstanding request cannot create work or clear recovery":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Cancel &
              (In(requestState) == RequestState.Idle | In(requestState) == RequestState.RecoveryHold);
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext &
              ((In(requestState) == RequestState.Idle) implies (eligibilityStatus == EligibilityStatus.Idle)) &
              ((In(requestState) == RequestState.RecoveryHold) implies (eligibilityStatus == EligibilityStatus.AwaitingRecovery));

          // @trace CASE-12
          case LIFECYCLE_BEGIN_DURING_RECOVERY "A Begin in recovery hold cannot initiate evaluation":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin &
              In(requestState) == RequestState.RecoveryHold;
            guarantee requestState == RequestState.RecoveryHold & lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.AwaitingRecovery;

          // @trace CASE-06
          case LIFECYCLE_REPLAY_TOKEN_A "A replayed TokenA cannot initiate evaluation":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin &
              requestInput.token == RequestToken.TokenA & In(lastAcceptedToken) == LastAcceptedToken.TokenA &
              In(requestState) != RequestState.RecoveryHold;
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.DuplicateIgnored;

          // @trace CASE-06
          case LIFECYCLE_REPLAY_TOKEN_B "A replayed TokenB cannot initiate evaluation":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin &
              requestInput.token == RequestToken.TokenB & In(lastAcceptedToken) == LastAcceptedToken.TokenB &
              In(requestState) != RequestState.RecoveryHold;
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.DuplicateIgnored;

          // @trace POL-01
          case LIFECYCLE_FRESH_TOKEN_A "Fresh TokenA in idle starts one matched evaluation":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin &
              requestInput.token == RequestToken.TokenA & In(lastAcceptedToken) != LastAcceptedToken.TokenA &
              In(requestState) == RequestState.Idle;
            guarantee requestState == RequestState.Pending & lastAcceptedToken == LastAcceptedToken.TokenA &
              energyTicket == EvaluationTicket.TokenA & supportTicket == EvaluationTicket.TokenA &
              requestContext == RequestContext.EvaluateTokenA & eligibilityStatus == EligibilityStatus.Evaluating;

          // @trace POL-01
          case LIFECYCLE_FRESH_TOKEN_B "Fresh TokenB in idle starts one matched evaluation":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin &
              requestInput.token == RequestToken.TokenB & In(lastAcceptedToken) != LastAcceptedToken.TokenB &
              In(requestState) == RequestState.Idle;
            guarantee requestState == RequestState.Pending & lastAcceptedToken == LastAcceptedToken.TokenB &
              energyTicket == EvaluationTicket.TokenB & supportTicket == EvaluationTicket.TokenB &
              requestContext == RequestContext.EvaluateTokenB & eligibilityStatus == EligibilityStatus.Evaluating;

          // @trace CASE-07
          case LIFECYCLE_BUSY_TOKEN_A "Fresh TokenA while another request is outstanding is busy":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin &
              requestInput.token == RequestToken.TokenA & In(lastAcceptedToken) != LastAcceptedToken.TokenA &
              (In(requestState) == RequestState.Pending | In(requestState) == RequestState.Engaged);
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Busy;

          // @trace CASE-07
          case LIFECYCLE_BUSY_TOKEN_B "Fresh TokenB while another request is outstanding is busy":
            assume gateOutcome == GateOutcome.None & requestInput.command == RequestCommand.Begin &
              requestInput.token == RequestToken.TokenB & In(lastAcceptedToken) != LastAcceptedToken.TokenB &
              (In(requestState) == RequestState.Pending | In(requestState) == RequestState.Engaged);
            guarantee requestState == In(requestState) & lastAcceptedToken == In(lastAcceptedToken) &
              energyTicket == EvaluationTicket.NoTicket & supportTicket == EvaluationTicket.NoTicket &
              requestContext == RequestContext.NoContext & eligibilityStatus == EligibilityStatus.Busy;
    }*/
  }

  // @trace PART-02
  part def EnergyAssessor :> Thread {
    // @trace INT-02
    port energyEvidence : DataPort { in :>> type : EnergyEvidence; }
    // @trace INT-06
    port evaluationTicket : DataPort { in :>> type : EvaluationTicket; }
    // @trace INT-09
    port energyVerdictOut : DataPort { out :>> type : TaggedEnergyVerdict; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INITIAL_ENERGY_VERDICT "Energy qualification initializes to its coherent inactive pair":
            energyVerdictOut.verdict == EnergyVerdict.NoEnergyVerdict &
            energyVerdictOut.ticket == TaggedTicket.NoTicket;

      compute
        compute_cases
          // @trace POL-02
          case ENERGY_INACTIVE "NoTicket produces only the coherent inactive energy verdict":
            assume evaluationTicket == EvaluationTicket.NoTicket;
            guarantee energyVerdictOut.ticket == TaggedTicket.NoTicket &
              energyVerdictOut.verdict == EnergyVerdict.NoEnergyVerdict;

          // @trace LOCAL-02
          case ENERGY_READY "Adequate current on a real ticket derives EnergyReady with the same ticket":
            assume evaluationTicket != EvaluationTicket.NoTicket & energyEvidence == EnergyEvidence.AdequateCurrent;
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies
                (energyVerdictOut.ticket == TaggedTicket.TokenA)) &
              ((evaluationTicket == EvaluationTicket.TokenB) implies
                (energyVerdictOut.ticket == TaggedTicket.TokenB)) &
              energyVerdictOut.verdict == EnergyVerdict.EnergyReady;

          // @trace CASE-02
          case ENERGY_INSUFFICIENT "Low current on a real ticket derives EnergyInsufficient with the same ticket":
            assume evaluationTicket != EvaluationTicket.NoTicket & energyEvidence == EnergyEvidence.LowCurrent;
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies
                (energyVerdictOut.ticket == TaggedTicket.TokenA)) &
              ((evaluationTicket == EvaluationTicket.TokenB) implies
                (energyVerdictOut.ticket == TaggedTicket.TokenB)) &
              energyVerdictOut.verdict == EnergyVerdict.EnergyInsufficient;

          // @trace CASE-03
          case ENERGY_UNTRUSTED "Unknown, invalid, or stale energy derives EnergyUntrusted with the same ticket":
            assume evaluationTicket != EvaluationTicket.NoTicket &
              (energyEvidence == EnergyEvidence.UnknownCurrent |
               energyEvidence == EnergyEvidence.Invalid |
               energyEvidence == EnergyEvidence.Stale);
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies
                (energyVerdictOut.ticket == TaggedTicket.TokenA)) &
              ((evaluationTicket == EvaluationTicket.TokenB) implies
                (energyVerdictOut.ticket == TaggedTicket.TokenB)) &
              energyVerdictOut.verdict == EnergyVerdict.EnergyUntrusted;
    }*/
  }

  // @trace PART-03
  part def ObservationSupportAssessor :> Thread {
    // @trace INT-03
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    // @trace INT-04
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    // @trace INT-07
    port evaluationTicket : DataPort { in :>> type : EvaluationTicket; }
    // @trace INT-10
    port supportVerdictOut : DataPort { out :>> type : TaggedSupportVerdict; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INITIAL_SUPPORT_VERDICT "Support qualification initializes to its coherent inactive pair":
            supportVerdictOut.ticket == TaggedTicket.NoTicket &
            supportVerdictOut.verdict == SupportVerdict.NoSupportVerdict;

      compute
        compute_cases
          // @trace POL-03
          case SUPPORT_INACTIVE "NoTicket produces only the coherent inactive support verdict":
            assume evaluationTicket == EvaluationTicket.NoTicket;
            guarantee supportVerdictOut.ticket == TaggedTicket.NoTicket &
              supportVerdictOut.verdict == SupportVerdict.NoSupportVerdict;

          // @trace LOCAL-03
          case SUPPORT_READY "Two available-current values derive SupportReady with the same real ticket":
            assume evaluationTicket != EvaluationTicket.NoTicket &
              cameraEvidence == CameraEvidence.AvailableCurrent &
              radioEvidence == RadioEvidence.AvailableCurrent;
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies
                (supportVerdictOut.ticket == TaggedTicket.TokenA)) &
              ((evaluationTicket == EvaluationTicket.TokenB) implies
                (supportVerdictOut.ticket == TaggedTicket.TokenB)) &
              supportVerdictOut.verdict == SupportVerdict.SupportReady;

          // @trace CASE-05
          case SUPPORT_UNTRUSTED "Any unknown, invalid, or stale support evidence has untrusted priority":
            assume evaluationTicket != EvaluationTicket.NoTicket &
              (cameraEvidence == CameraEvidence.UnknownCurrent |
               cameraEvidence == CameraEvidence.Invalid |
               cameraEvidence == CameraEvidence.Stale |
               radioEvidence == RadioEvidence.UnknownCurrent |
               radioEvidence == RadioEvidence.Invalid |
               radioEvidence == RadioEvidence.Stale);
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies
                (supportVerdictOut.ticket == TaggedTicket.TokenA)) &
              ((evaluationTicket == EvaluationTicket.TokenB) implies
                (supportVerdictOut.ticket == TaggedTicket.TokenB)) &
              supportVerdictOut.verdict == SupportVerdict.SupportUntrusted;

          // @trace CASE-04
          case SUPPORT_UNAVAILABLE "Known evidence with either unavailable value derives SupportUnavailable":
            assume evaluationTicket != EvaluationTicket.NoTicket &
              cameraEvidence != CameraEvidence.UnknownCurrent & cameraEvidence != CameraEvidence.Invalid & cameraEvidence != CameraEvidence.Stale &
              radioEvidence != RadioEvidence.UnknownCurrent & radioEvidence != RadioEvidence.Invalid & radioEvidence != RadioEvidence.Stale &
              (cameraEvidence == CameraEvidence.UnavailableCurrent | radioEvidence == RadioEvidence.UnavailableCurrent);
            guarantee ((evaluationTicket == EvaluationTicket.TokenA) implies
                (supportVerdictOut.ticket == TaggedTicket.TokenA)) &
              ((evaluationTicket == EvaluationTicket.TokenB) implies
                (supportVerdictOut.ticket == TaggedTicket.TokenB)) &
              supportVerdictOut.verdict == SupportVerdict.SupportUnavailable;
    }*/
  }

  // @trace PART-04
  part def EligibilityArbiter :> Thread {
    // @trace INT-08
    port requestContext : DataPort { in :>> type : RequestContext; }
    // @trace INT-09
    port energyVerdictIn : DataPort { in :>> type : TaggedEnergyVerdict; }
    // @trace INT-10
    port supportVerdictIn : DataPort { in :>> type : TaggedSupportVerdict; }
    // @trace INT-11
    port eligibilityDecision : DataPort { out :>> type : EligibilityDecision; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INITIAL_DECISION "The sole principal decision owner initializes inactive":
            eligibilityDecision == EligibilityDecision.NoDecision;

      compute
        compute_cases
          // @trace CASE-08
          case ARBITER_WITHDRAW "Cancellation context has principal withdrawal priority":
            assume requestContext == RequestContext.CancelOutstanding;
            guarantee eligibilityDecision == EligibilityDecision.Withdraw;

          // @trace CASE-02
          case ARBITER_POWER_INSUFFICIENT "Matched insufficient energy has priority over every meaningful support verdict":
            assume ((requestContext == RequestContext.EvaluateTokenA &
                     energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) |
                    (requestContext == RequestContext.EvaluateTokenB &
                     energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) &
              energyVerdictIn.verdict == EnergyVerdict.EnergyInsufficient &
              supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict;
            guarantee eligibilityDecision == EligibilityDecision.DenyPower;

          // @trace CASE-03
          case ARBITER_POWER_UNTRUSTED "Matched untrusted energy has priority over every meaningful support verdict":
            assume ((requestContext == RequestContext.EvaluateTokenA &
                     energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) |
                    (requestContext == RequestContext.EvaluateTokenB &
                     energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) &
              energyVerdictIn.verdict == EnergyVerdict.EnergyUntrusted &
              supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict;
            guarantee eligibilityDecision == EligibilityDecision.DenyPower;

          // @trace CASE-04
          case ARBITER_SUPPORT_UNAVAILABLE "Matched ready energy and unavailable support derive DenySupport":
            assume ((requestContext == RequestContext.EvaluateTokenA &
                     energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) |
                    (requestContext == RequestContext.EvaluateTokenB &
                     energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) &
              energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
              supportVerdictIn.verdict == SupportVerdict.SupportUnavailable;
            guarantee eligibilityDecision == EligibilityDecision.DenySupport;

          // @trace CASE-05
          case ARBITER_SUPPORT_UNTRUSTED "Matched ready energy and untrusted support derive DenySupport":
            assume ((requestContext == RequestContext.EvaluateTokenA &
                     energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) |
                    (requestContext == RequestContext.EvaluateTokenB &
                     energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) &
              energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
              supportVerdictIn.verdict == SupportVerdict.SupportUntrusted;
            guarantee eligibilityDecision == EligibilityDecision.DenySupport;

          // @trace CASE-01
          case ARBITER_PERMIT "Only a context-matched all-ready pair derives Permit":
            assume ((requestContext == RequestContext.EvaluateTokenA &
                     energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) |
                    (requestContext == RequestContext.EvaluateTokenB &
                     energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) &
              energyVerdictIn.verdict == EnergyVerdict.EnergyReady &
              supportVerdictIn.verdict == SupportVerdict.SupportReady;
            guarantee eligibilityDecision == EligibilityDecision.Permit;

          // @trace FAULT-01
          case ARBITER_INACTIVE_OR_MISMATCH "Inactive, absent, incoherent, or ticket-mismatched inputs cannot produce a decision":
            assume requestContext != RequestContext.CancelOutstanding &
              not (((requestContext == RequestContext.EvaluateTokenA &
                     energyVerdictIn.ticket == TaggedTicket.TokenA & supportVerdictIn.ticket == TaggedTicket.TokenA) |
                    (requestContext == RequestContext.EvaluateTokenB &
                     energyVerdictIn.ticket == TaggedTicket.TokenB & supportVerdictIn.ticket == TaggedTicket.TokenB)) &
                   energyVerdictIn.verdict != EnergyVerdict.NoEnergyVerdict &
                   supportVerdictIn.verdict != SupportVerdict.NoSupportVerdict);
            guarantee eligibilityDecision == EligibilityDecision.NoDecision;
    }*/
  }

  // @trace PART-05
  part def AuthorizationGate :> Thread {
    // @trace INT-05
    port observationProgress : DataPort { in :>> type : ObservationProgress; }
    // @trace INT-11
    port eligibilityDecision : DataPort { in :>> type : EligibilityDecision; }
    // @trace INT-12
    port gateOutcome : DataPort { out :>> type : GateOutcome; }
    // @trace INT-13
    port observationAuthorization : DataPort { out :>> type : ObservationAuthorization; }

    language "GUMBO" /*{
      state
        // @trace STATE-02
        gatePhase : GatePhase;

      initialize
        guarantee
          // @trace INIT-01
          INITIAL_GATE "The authorization gate initializes closed, withheld, and without feedback":
            gatePhase == GatePhase.Closed &
            observationAuthorization == ObservationAuthorization.Withhold &
            gateOutcome == GateOutcome.None;

      compute
        // @trace FAULT-02
        guarantee FAILURE_HOLD_WITHHOLDS "FailureHold always pairs with fail-closed authorization":
          (gatePhase == GatePhase.FailureHold) implies
            (observationAuthorization == ObservationAuthorization.Withhold);

        compute_cases
          // @trace CASE-12
          case GATE_RECOVERED "Idle progress is the only transition from FailureHold to Closed":
            assume In(gatePhase) == GatePhase.FailureHold & observationProgress == ObservationProgress.Idle;
            guarantee gatePhase == GatePhase.Closed &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Recovered;

          // @trace POL-07
          case GATE_RECOVERY_RETAINED "Non-idle progress retains FailureHold and cannot authorize":
            assume In(gatePhase) == GatePhase.FailureHold & observationProgress != ObservationProgress.Idle;
            guarantee gatePhase == GatePhase.FailureHold &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.None;

          // @trace CASE-10
          case GATE_REPORTED_FAILURE "Reported service failure from any nonheld phase enters FailureHold":
            assume In(gatePhase) != GatePhase.FailureHold & observationProgress == ObservationProgress.Failed;
            guarantee gatePhase == GatePhase.FailureHold &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Failed;

          // @trace CASE-11
          case GATE_ACTIVE_WHILE_CLOSED "Active progress while closed is inconsistent and fails closed":
            assume In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Active;
            guarantee gatePhase == GatePhase.FailureHold &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Failed;

          // @trace CASE-11
          case GATE_ACTIVE_TO_IDLE_REGRESSION "Idle progress from Active without completion is inconsistent and fails closed":
            assume In(gatePhase) == GatePhase.Active & observationProgress == ObservationProgress.Idle;
            guarantee gatePhase == GatePhase.FailureHold &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Failed;

          // @trace CASE-08
          case GATE_WITHDRAWAL "Withdrawal closes every nonfailed phase before completion or ordinary progress":
            assume In(gatePhase) != GatePhase.FailureHold &
              observationProgress != ObservationProgress.Failed &
              not (In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Active) &
              not (In(gatePhase) == GatePhase.Active & observationProgress == ObservationProgress.Idle) &
              eligibilityDecision == EligibilityDecision.Withdraw;
            guarantee gatePhase == GatePhase.Closed &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Cancelled;

          // @trace CASE-09
          case GATE_COMPLETION "Valid completion closes an authorized or active gate and removes permission":
            assume (In(gatePhase) == GatePhase.Authorized | In(gatePhase) == GatePhase.Active) &
              observationProgress == ObservationProgress.Completed &
              eligibilityDecision != EligibilityDecision.Withdraw;
            guarantee gatePhase == GatePhase.Closed &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.Completed;

          // @trace CASE-02
          case GATE_DENIED_POWER "Power denial closes a nonfailed gate and withholds authorization":
            assume In(gatePhase) != GatePhase.FailureHold & observationProgress != ObservationProgress.Failed &
              not (In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Active) &
              not (In(gatePhase) == GatePhase.Active & observationProgress == ObservationProgress.Idle) &
              not ((In(gatePhase) == GatePhase.Authorized | In(gatePhase) == GatePhase.Active) &
                   observationProgress == ObservationProgress.Completed) &
              eligibilityDecision == EligibilityDecision.DenyPower;
            guarantee gatePhase == GatePhase.Closed &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.DeniedPower;

          // @trace CASE-04
          case GATE_DENIED_SUPPORT "Support denial closes a nonfailed gate and withholds authorization":
            assume In(gatePhase) != GatePhase.FailureHold & observationProgress != ObservationProgress.Failed &
              not (In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Active) &
              not (In(gatePhase) == GatePhase.Active & observationProgress == ObservationProgress.Idle) &
              not ((In(gatePhase) == GatePhase.Authorized | In(gatePhase) == GatePhase.Active) &
                   observationProgress == ObservationProgress.Completed) &
              eligibilityDecision == EligibilityDecision.DenySupport;
            guarantee gatePhase == GatePhase.Closed &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.DeniedSupport;

          // @trace CASE-01
          case GATE_PERMIT_FROM_CLOSED "Permit with idle service opens a closed gate":
            assume In(gatePhase) == GatePhase.Closed & observationProgress == ObservationProgress.Idle &
              eligibilityDecision == EligibilityDecision.Permit;
            guarantee gatePhase == GatePhase.Authorized &
              observationAuthorization == ObservationAuthorization.Permit & gateOutcome == GateOutcome.Authorized;

          // @trace TRANS-02
          case GATE_PROGRESS_ACTIVE "Authorized or active service progress retains logical permission and reports Active":
            assume (In(gatePhase) == GatePhase.Authorized | In(gatePhase) == GatePhase.Active) &
              observationProgress == ObservationProgress.Active &
              eligibilityDecision != EligibilityDecision.Withdraw &
              eligibilityDecision != EligibilityDecision.DenyPower &
              eligibilityDecision != EligibilityDecision.DenySupport;
            guarantee gatePhase == GatePhase.Active &
              observationAuthorization == ObservationAuthorization.Permit & gateOutcome == GateOutcome.Active;

          // @trace POL-06
          case GATE_AUTHORIZED_IDLE "Idle progress with no overriding decision preserves an authorized gate":
            assume In(gatePhase) == GatePhase.Authorized & observationProgress == ObservationProgress.Idle &
              (eligibilityDecision == EligibilityDecision.NoDecision | eligibilityDecision == EligibilityDecision.Permit);
            guarantee gatePhase == GatePhase.Authorized &
              observationAuthorization == ObservationAuthorization.Permit & gateOutcome == GateOutcome.Authorized;

          // @trace POL-06
          case GATE_CLOSED_QUIESCENT "Remaining closed snapshots stay withheld without feedback":
            assume In(gatePhase) == GatePhase.Closed &
              observationProgress != ObservationProgress.Failed & observationProgress != ObservationProgress.Active &
              eligibilityDecision != EligibilityDecision.Withdraw & eligibilityDecision != EligibilityDecision.DenyPower &
              eligibilityDecision != EligibilityDecision.DenySupport &
              not (observationProgress == ObservationProgress.Idle & eligibilityDecision == EligibilityDecision.Permit);
            guarantee gatePhase == GatePhase.Closed &
              observationAuthorization == ObservationAuthorization.Withhold & gateOutcome == GateOutcome.None;
    }*/
  }

  // @generated-support GEN-SUP-01 behavior-free containment and boundary delegation only
  // @trace ARCH-01
  part def EligibilitySupervisionProcess :> Process {
    // @trace INT-01
    port requestInput : DataPort { in :>> type : RequestInput; }
    // @trace INT-02
    port energyEvidence : DataPort { in :>> type : EnergyEvidence; }
    // @trace INT-03
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    // @trace INT-04
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    // @trace INT-05
    port observationProgress : DataPort { in :>> type : ObservationProgress; }
    // @trace INT-13
    port observationAuthorization : DataPort { out :>> type : ObservationAuthorization; }
    // @trace INT-14
    port eligibilityStatus : DataPort { out :>> type : EligibilityStatus; }

    // @trace PART-01
    part requestLifecycle : RequestLifecycle;
    // @trace PART-02
    part energyAssessor : EnergyAssessor;
    // @trace PART-03
    part observationSupportAssessor : ObservationSupportAssessor;
    // @trace PART-04
    part eligibilityArbiter : EligibilityArbiter;
    // @trace PART-05
    part authorizationGate : AuthorizationGate;

    // @generated-support GEN-SUP-02 inbound refinement hop
    // @trace INT-01
    connection processInt01 : PortConnection connect requestInput to requestLifecycle.requestInput;
    // @generated-support GEN-SUP-02 inbound refinement hop
    // @trace INT-02
    connection processInt02 : PortConnection connect energyEvidence to energyAssessor.energyEvidence;
    // @generated-support GEN-SUP-02 inbound refinement hop
    // @trace INT-03
    connection processInt03 : PortConnection connect cameraEvidence to observationSupportAssessor.cameraEvidence;
    // @generated-support GEN-SUP-02 inbound refinement hop
    // @trace INT-04
    connection processInt04 : PortConnection connect radioEvidence to observationSupportAssessor.radioEvidence;
    // @generated-support GEN-SUP-02 inbound refinement hop
    // @trace INT-05
    connection processInt05 : PortConnection connect observationProgress to authorizationGate.observationProgress;
    // @trace INT-06
    connection processInt06 : PortConnection connect requestLifecycle.energyTicket to energyAssessor.evaluationTicket;
    // @trace INT-07
    connection processInt07 : PortConnection connect requestLifecycle.supportTicket to observationSupportAssessor.evaluationTicket;
    // @trace INT-08
    connection processInt08 : PortConnection connect requestLifecycle.requestContext to eligibilityArbiter.requestContext;
    // @trace INT-09
    connection processInt09 : PortConnection connect energyAssessor.energyVerdictOut to eligibilityArbiter.energyVerdictIn;
    // @trace INT-10
    connection processInt10 : PortConnection connect observationSupportAssessor.supportVerdictOut to eligibilityArbiter.supportVerdictIn;
    // @trace INT-11
    connection processInt11 : PortConnection connect eligibilityArbiter.eligibilityDecision to authorizationGate.eligibilityDecision;
    // @trace INT-12
    connection processInt12 : PortConnection connect authorizationGate.gateOutcome to requestLifecycle.gateOutcome;
    // @generated-support GEN-SUP-02 outbound refinement hop
    // @trace INT-13
    connection processInt13 : PortConnection connect authorizationGate.observationAuthorization to observationAuthorization;
    // @generated-support GEN-SUP-02 outbound refinement hop
    // @trace INT-14
    connection processInt14 : PortConnection connect requestLifecycle.eligibilityStatus to eligibilityStatus;
  }

  // @trace SCOPE-01
  part def ForestObservationEligibilitySupervisor :> System {
    // @trace MON-01
    port requestInput : DataPort { in :>> type : RequestInput; }
    // @trace MON-02
    port energyEvidence : DataPort { in :>> type : EnergyEvidence; }
    // @trace MON-03
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    // @trace MON-04
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    // @trace MON-05
    port observationProgress : DataPort { in :>> type : ObservationProgress; }
    // @trace CTRL-01
    port observationAuthorization : DataPort { out :>> type : ObservationAuthorization; }
    // @trace CTRL-02
    port eligibilityStatus : DataPort { out :>> type : EligibilityStatus; }

    // @generated-support GEN-SUP-01 sole behavior-free Process usage
    // @trace ARCH-01
    part eligibilitySupervisionProcess : EligibilitySupervisionProcess;

    // @generated-support GEN-SUP-02 root-to-Process refinement hop
    // @trace INT-01
    connection rootInt01 : PortConnection connect requestInput to eligibilitySupervisionProcess.requestInput;
    // @generated-support GEN-SUP-02 root-to-Process refinement hop
    // @trace INT-02
    connection rootInt02 : PortConnection connect energyEvidence to eligibilitySupervisionProcess.energyEvidence;
    // @generated-support GEN-SUP-02 root-to-Process refinement hop
    // @trace INT-03
    connection rootInt03 : PortConnection connect cameraEvidence to eligibilitySupervisionProcess.cameraEvidence;
    // @generated-support GEN-SUP-02 root-to-Process refinement hop
    // @trace INT-04
    connection rootInt04 : PortConnection connect radioEvidence to eligibilitySupervisionProcess.radioEvidence;
    // @generated-support GEN-SUP-02 root-to-Process refinement hop
    // @trace INT-05
    connection rootInt05 : PortConnection connect observationProgress to eligibilitySupervisionProcess.observationProgress;
    // @generated-support GEN-SUP-02 Process-to-root refinement hop
    // @trace INT-13
    connection rootInt13 : PortConnection connect eligibilitySupervisionProcess.observationAuthorization to observationAuthorization;
    // @generated-support GEN-SUP-02 Process-to-root refinement hop
    // @trace INT-14
    connection rootInt14 : PortConnection connect eligibilitySupervisionProcess.eligibilityStatus to eligibilityStatus;
  }

  // @trace STRUCT-01
  part forestObservationEligibilitySupervisor : ForestObservationEligibilitySupervisor;
}
