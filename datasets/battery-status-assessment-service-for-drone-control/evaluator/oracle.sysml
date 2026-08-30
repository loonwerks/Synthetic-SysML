// Canonical source for immutable run
// 20260814T132656Z-fire-observation-sortie-small-r2-a1.

// @trace PURPOSE-01
package Battery_Status_Assessment_Service {
  private import HAMR::*;

  // @trace TYPE-01
  enum def CheckCommand { enum NoCommand; enum Start; enum Cancel; enum Reset; }
  // @trace TYPE-01
  enum def CheckToken { enum TokenA; enum TokenB; }
  // @trace TYPE-02
  enum def ReportTicket { enum NoTicket; enum TokenA; enum TokenB; }
  // @trace TYPE-02
  enum def ReportAvailability { enum Absent; enum Present; enum Unavailable; }
  // @trace TYPE-02
  enum def CapacityLevel { enum NoLevel; enum High; enum Moderate; enum Low; enum Critical; }
  // @trace TYPE-02
  enum def ReportQuality { enum NoQuality; enum Current; enum Stale; enum Invalid; }
  // @trace TYPE-04
  enum def FeedbackTicket { enum NoTicket; enum TokenA; enum TokenB; }
  // @trace TYPE-04
  enum def UseDisposition { enum NoFeedback; enum Pending; enum Consumed; enum Rejected; }
  // @trace TYPE-05
  enum def AssessmentResult {
    enum NoAssessment; enum NormalUse; enum CautionUse; enum RestrictUse; enum Untrusted;
  }
  // @trace TYPE-06
  enum def CheckStatus {
    enum Idle; enum Checking; enum Available; enum DuplicateIgnored; enum Busy;
    enum Cancelled; enum AcquisitionFailed; enum Completed; enum PublicationFailed;
    enum RecoveryRequired; enum ResetCompleted;
  }
  // @trace CTRL-01
  enum def StatusReadRequest { enum NoRead; enum ReadTokenA; enum ReadTokenB; }
  // @trace INT-04
  enum def AcquisitionDirective {
    enum NoAcquisition; enum AcquireTokenA; enum AcquireTokenB; enum ResetAcquisition;
  }
  // @trace INT-05
  enum def AssessmentContext { enum NoContext; enum AssessTokenA; enum AssessTokenB; }
  // @trace INT-06
  enum def PublicationDirective {
    enum NoPublicationDirective; enum OpenTokenA; enum OpenTokenB; enum Withdraw;
    enum ResetPublication;
  }
  // @trace INT-08
  enum def AcquisitionOutcome {
    enum NoAcquisitionOutcome; enum CapturedTokenA; enum CapturedTokenB;
    enum AcquisitionFault; enum AcquisitionReset;
  }
  // @trace INT-09
  enum def QualifiedEvidence {
    enum NoEvidence; enum TrustedHigh; enum TrustedModerate; enum TrustedLow;
    enum TrustedCritical; enum Untrusted;
  }
  // @trace INT-11
  enum def PublicationOutcome {
    enum NoPublicationOutcome; enum OfferedTokenA; enum OfferedTokenB; enum Consumed;
    enum Cancelled; enum PublicationFault; enum PublicationReset;
  }
  // @trace STATE-01
  enum def LifecycleState { enum Idle; enum Checking; enum AwaitingUse; enum RecoveryHold; }
  // @trace STATE-01
  enum def LastAdmittedToken { enum None; enum TokenA; enum TokenB; }
  // @trace STATE-02
  enum def AcquisitionState { enum Ready; enum FailureHold; }
  // @trace STATE-03
  enum def PublicationState { enum Empty; enum OfferedTokenA; enum OfferedTokenB; enum FaultHold; }

  // Every field below is inspected by GUMBO and is a direct attribute.
  // @trace TYPE-01
  part def CheckRequest :> Data {
    attribute command : CheckCommand;
    attribute token : CheckToken;
  }
  // @trace TYPE-02
  part def BatteryReport :> Data {
    attribute ticket : ReportTicket;
    attribute availability : ReportAvailability;
    attribute level : CapacityLevel;
    attribute quality : ReportQuality;
  }
  // @trace TYPE-04
  part def ControlUseFeedback :> Data {
    attribute ticket : FeedbackTicket;
    attribute disposition : UseDisposition;
  }
  // @trace INT-07
  part def CapturedReport :> Data {
    attribute ticket : ReportTicket;
    attribute availability : ReportAvailability;
    attribute level : CapacityLevel;
    attribute quality : ReportQuality;
  }
  // @trace INT-09
  part def TaggedQualifiedEvidence :> Data {
    attribute ticket : ReportTicket;
    attribute evidence : QualifiedEvidence;
  }
  // @trace TYPE-05
  part def TaggedAssessment :> Data {
    attribute ticket : ReportTicket;
    attribute result : AssessmentResult;
  }

  // @trace PART-01
  part def CheckLifecycle :> Thread {
    // @trace INT-01
    port check_request : DataPort { in :>> type : CheckRequest; }
    // @trace INT-08
    port acquisition_outcome : DataPort { in :>> type : AcquisitionOutcome; }
    // @trace INT-11
    port publication_outcome : DataPort { in :>> type : PublicationOutcome; }
    // @trace INT-04
    port acquisition_directive : DataPort { out :>> type : AcquisitionDirective; }
    // @trace INT-05
    port assessment_context : DataPort { out :>> type : AssessmentContext; }
    // @trace INT-06
    port publication_directive : DataPort { out :>> type : PublicationDirective; }
    // @trace INT-14
    port check_status : DataPort { out :>> type : CheckStatus; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        lifecycleState: LifecycleState;
        // @trace STATE-01
        lastAdmittedToken: LastAdmittedToken;
      initialize
        modifies lifecycleState, lastAdmittedToken;
        // @trace INIT-01
        guarantee INITIAL_LIFECYCLE_SAFE:
          lifecycleState == LifecycleState.Idle &
          lastAdmittedToken == LastAdmittedToken.None &
          acquisition_directive == AcquisitionDirective.NoAcquisition &
          assessment_context == AssessmentContext.NoContext &
          publication_directive == PublicationDirective.NoPublicationDirective &
          check_status == CheckStatus.Idle;
      compute
        modifies lifecycleState, lastAdmittedToken;
        compute_cases
          // @trace CASE-10
          case PRIOR_PUBLICATION_FAULT:
            assume In(lifecycleState) != LifecycleState.RecoveryHold &
                   publication_outcome == PublicationOutcome.PublicationFault;
            guarantee lifecycleState == LifecycleState.RecoveryHold &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.PublicationFailed;
          // @trace CASE-05
          case PRIOR_ACQUISITION_FAULT:
            assume In(lifecycleState) != LifecycleState.RecoveryHold &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome == AcquisitionOutcome.AcquisitionFault;
            guarantee lifecycleState == LifecycleState.RecoveryHold &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.AcquisitionFailed;
          // @trace CASE-11
          case RESET_CONFIRMATIONS:
            assume In(lifecycleState) == LifecycleState.RecoveryHold &
                   acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
                   publication_outcome == PublicationOutcome.PublicationReset;
            guarantee lifecycleState == LifecycleState.Idle &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.ResetCompleted;
          // @trace CASE-11
          case RESET_IN_RECOVERY:
            assume In(lifecycleState) == LifecycleState.RecoveryHold &
                   not (acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
                        publication_outcome == PublicationOutcome.PublicationReset) &
                   check_request.command == CheckCommand.Reset;
            guarantee lifecycleState == LifecycleState.RecoveryHold &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.ResetAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.ResetPublication &
              check_status == CheckStatus.RecoveryRequired;
          // @trace CASE-12
          case RECOVERY_BLOCKS_NONRESET:
            assume In(lifecycleState) == LifecycleState.RecoveryHold &
                   not (acquisition_outcome == AcquisitionOutcome.AcquisitionReset &
                        publication_outcome == PublicationOutcome.PublicationReset) &
                   check_request.command != CheckCommand.Reset;
            guarantee lifecycleState == LifecycleState.RecoveryHold &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.RecoveryRequired;
          // @trace CASE-09
          case PRIOR_CONSUMPTION_COMPLETES:
            assume In(lifecycleState) != LifecycleState.RecoveryHold &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome == PublicationOutcome.Consumed;
            guarantee lifecycleState == LifecycleState.Idle &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.Completed;
          // @trace CASE-08
          case ACTIVE_CANCEL:
            assume In(lifecycleState) != LifecycleState.RecoveryHold &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome != PublicationOutcome.Consumed &
                   check_request.command == CheckCommand.Cancel &
                   (In(lifecycleState) == LifecycleState.Checking |
                    In(lifecycleState) == LifecycleState.AwaitingUse);
            guarantee lifecycleState == LifecycleState.Idle &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.Withdraw &
              check_status == CheckStatus.Cancelled;
          // @trace CASE-06
          case IDLE_DUPLICATE_TOKEN_A:
            assume In(lifecycleState) == LifecycleState.Idle &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome != PublicationOutcome.Consumed &
                   check_request.command == CheckCommand.Start &
                   check_request.token == CheckToken.TokenA &
                   In(lastAdmittedToken) == LastAdmittedToken.TokenA;
            guarantee lifecycleState == LifecycleState.Idle &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.DuplicateIgnored;
          // @trace CASE-06
          case IDLE_DUPLICATE_TOKEN_B:
            assume In(lifecycleState) == LifecycleState.Idle &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome != PublicationOutcome.Consumed &
                   check_request.command == CheckCommand.Start &
                   check_request.token == CheckToken.TokenB &
                   In(lastAdmittedToken) == LastAdmittedToken.TokenB;
            guarantee lifecycleState == LifecycleState.Idle &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.DuplicateIgnored;
          // @trace CASE-12
          case FRESH_TOKEN_A_START:
            assume In(lifecycleState) == LifecycleState.Idle &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome != PublicationOutcome.Consumed &
                   check_request.command == CheckCommand.Start &
                   check_request.token == CheckToken.TokenA &
                   In(lastAdmittedToken) != LastAdmittedToken.TokenA;
            guarantee lifecycleState == LifecycleState.Checking &
              lastAdmittedToken == LastAdmittedToken.TokenA &
              acquisition_directive == AcquisitionDirective.AcquireTokenA &
              assessment_context == AssessmentContext.AssessTokenA &
              publication_directive == PublicationDirective.OpenTokenA &
              check_status == CheckStatus.Checking;
          // @trace CASE-12
          case FRESH_TOKEN_B_START:
            assume In(lifecycleState) == LifecycleState.Idle &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome != PublicationOutcome.Consumed &
                   check_request.command == CheckCommand.Start &
                   check_request.token == CheckToken.TokenB &
                   In(lastAdmittedToken) != LastAdmittedToken.TokenB;
            guarantee lifecycleState == LifecycleState.Checking &
              lastAdmittedToken == LastAdmittedToken.TokenB &
              acquisition_directive == AcquisitionDirective.AcquireTokenB &
              assessment_context == AssessmentContext.AssessTokenB &
              publication_directive == PublicationDirective.OpenTokenB &
              check_status == CheckStatus.Checking;
          // @trace CASE-07
          case ACTIVE_START_BUSY:
            assume (In(lifecycleState) == LifecycleState.Checking |
                    In(lifecycleState) == LifecycleState.AwaitingUse) &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome != PublicationOutcome.Consumed &
                   check_request.command == CheckCommand.Start;
            guarantee lifecycleState == In(lifecycleState) &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.Busy;
          // @trace LOCAL-01
          case CHECK_BECOMES_AVAILABLE:
            assume In(lifecycleState) == LifecycleState.Checking &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome != PublicationOutcome.Consumed &
                   check_request.command != CheckCommand.Start &
                   check_request.command != CheckCommand.Cancel &
                   ((In(lastAdmittedToken) == LastAdmittedToken.TokenA &
                     acquisition_outcome == AcquisitionOutcome.CapturedTokenA &
                     publication_outcome == PublicationOutcome.OfferedTokenA) |
                    (In(lastAdmittedToken) == LastAdmittedToken.TokenB &
                     acquisition_outcome == AcquisitionOutcome.CapturedTokenB &
                     publication_outcome == PublicationOutcome.OfferedTokenB));
            guarantee lifecycleState == LifecycleState.AwaitingUse &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              check_status == CheckStatus.Available;
          // @trace LOCAL-01
          case ORDINARY_NONHOLD:
            assume In(lifecycleState) != LifecycleState.RecoveryHold &
                   publication_outcome != PublicationOutcome.PublicationFault &
                   acquisition_outcome != AcquisitionOutcome.AcquisitionFault &
                   publication_outcome != PublicationOutcome.Consumed &
                   not (check_request.command == CheckCommand.Cancel &
                        (In(lifecycleState) == LifecycleState.Checking |
                         In(lifecycleState) == LifecycleState.AwaitingUse)) &
                   not (In(lifecycleState) == LifecycleState.Idle &
                        check_request.command == CheckCommand.Start) &
                   not ((In(lifecycleState) == LifecycleState.Checking |
                         In(lifecycleState) == LifecycleState.AwaitingUse) &
                        check_request.command == CheckCommand.Start) &
                   not (In(lifecycleState) == LifecycleState.Checking &
                        check_request.command != CheckCommand.Start &
                        check_request.command != CheckCommand.Cancel &
                        ((In(lastAdmittedToken) == LastAdmittedToken.TokenA &
                          acquisition_outcome == AcquisitionOutcome.CapturedTokenA &
                          publication_outcome == PublicationOutcome.OfferedTokenA) |
                         (In(lastAdmittedToken) == LastAdmittedToken.TokenB &
                          acquisition_outcome == AcquisitionOutcome.CapturedTokenB &
                          publication_outcome == PublicationOutcome.OfferedTokenB)));
            guarantee lifecycleState == In(lifecycleState) &
              lastAdmittedToken == In(lastAdmittedToken) &
              acquisition_directive == AcquisitionDirective.NoAcquisition &
              assessment_context == AssessmentContext.NoContext &
              publication_directive == PublicationDirective.NoPublicationDirective &
              ((In(lifecycleState) == LifecycleState.AwaitingUse &
                check_status == CheckStatus.Available) |
               (In(lifecycleState) == LifecycleState.Checking &
                check_status == CheckStatus.Checking) |
               (In(lifecycleState) == LifecycleState.Idle &
                check_status == CheckStatus.Idle));
    }*/
  }

  // @trace PART-02
  part def ReportAcquisition :> Thread {
    // @trace INT-02
    port battery_report : DataPort { in :>> type : BatteryReport; }
    // @trace INT-04
    port acquisition_directive : DataPort { in :>> type : AcquisitionDirective; }
    // @trace INT-07
    port captured_report : DataPort { out :>> type : CapturedReport; }
    // @trace INT-08
    port acquisition_outcome : DataPort { out :>> type : AcquisitionOutcome; }
    // @trace INT-12
    port status_read_request : DataPort { out :>> type : StatusReadRequest; }

    language "GUMBO" /*{
      state
        // @trace STATE-02
        acquisitionState: AcquisitionState;
        // @generated-support GEN-SUP-02 prior-commit register only.
        committedAcquisitionOutcome: AcquisitionOutcome;
      initialize
        modifies acquisitionState, committedAcquisitionOutcome;
        // @trace INIT-01
        guarantee INITIAL_ACQUISITION_SAFE:
          acquisitionState == AcquisitionState.Ready &
          committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome &
          acquisition_outcome == AcquisitionOutcome.NoAcquisitionOutcome &
          status_read_request == StatusReadRequest.NoRead &
          captured_report.ticket == ReportTicket.NoTicket &
          captured_report.availability == ReportAvailability.Absent &
          captured_report.level == CapacityLevel.NoLevel &
          captured_report.quality == ReportQuality.NoQuality;
      compute
        modifies acquisitionState, committedAcquisitionOutcome;
        // @generated-support GEN-SUP-02 exposes only the prior committed value.
        guarantee PRIOR_ACQUISITION_OUTCOME:
          acquisition_outcome == In(committedAcquisitionOutcome);
        compute_cases
          // @trace CASE-11
          case ACQUISITION_RESET:
            assume acquisition_directive == AcquisitionDirective.ResetAcquisition;
            guarantee acquisitionState == AcquisitionState.Ready &
              committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionReset &
              status_read_request == StatusReadRequest.NoRead &
              captured_report.ticket == ReportTicket.NoTicket &
              captured_report.availability == ReportAvailability.Absent &
              captured_report.level == CapacityLevel.NoLevel &
              captured_report.quality == ReportQuality.NoQuality;
          // @trace CASE-05
          case ACQUISITION_HELD:
            assume acquisition_directive != AcquisitionDirective.ResetAcquisition &
                   In(acquisitionState) == AcquisitionState.FailureHold;
            guarantee acquisitionState == AcquisitionState.FailureHold &
              committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome &
              status_read_request == StatusReadRequest.NoRead &
              captured_report.ticket == ReportTicket.NoTicket &
              captured_report.availability == ReportAvailability.Absent &
              captured_report.level == CapacityLevel.NoLevel &
              captured_report.quality == ReportQuality.NoQuality;
          // @trace LOCAL-02
          case CAPTURE_TOKEN_A:
            assume In(acquisitionState) == AcquisitionState.Ready &
                   acquisition_directive == AcquisitionDirective.AcquireTokenA &
                   battery_report.ticket == ReportTicket.TokenA &
                   battery_report.availability == ReportAvailability.Present;
            guarantee acquisitionState == AcquisitionState.Ready &
              committedAcquisitionOutcome == AcquisitionOutcome.CapturedTokenA &
              status_read_request == StatusReadRequest.ReadTokenA &
              captured_report.ticket == battery_report.ticket &
              captured_report.availability == battery_report.availability &
              captured_report.level == battery_report.level &
              captured_report.quality == battery_report.quality;
          // @trace LOCAL-02
          case CAPTURE_TOKEN_B:
            assume In(acquisitionState) == AcquisitionState.Ready &
                   acquisition_directive == AcquisitionDirective.AcquireTokenB &
                   battery_report.ticket == ReportTicket.TokenB &
                   battery_report.availability == ReportAvailability.Present;
            guarantee acquisitionState == AcquisitionState.Ready &
              committedAcquisitionOutcome == AcquisitionOutcome.CapturedTokenB &
              status_read_request == StatusReadRequest.ReadTokenB &
              captured_report.ticket == battery_report.ticket &
              captured_report.availability == battery_report.availability &
              captured_report.level == battery_report.level &
              captured_report.quality == battery_report.quality;
          // @trace CASE-05
          case REQUESTED_ACQUISITION_FAULT:
            assume In(acquisitionState) == AcquisitionState.Ready &
                   ((acquisition_directive == AcquisitionDirective.AcquireTokenA &
                     not (battery_report.ticket == ReportTicket.TokenA &
                          battery_report.availability == ReportAvailability.Present)) |
                    (acquisition_directive == AcquisitionDirective.AcquireTokenB &
                     not (battery_report.ticket == ReportTicket.TokenB &
                          battery_report.availability == ReportAvailability.Present)));
            guarantee acquisitionState == AcquisitionState.FailureHold &
              committedAcquisitionOutcome == AcquisitionOutcome.AcquisitionFault &
              ((acquisition_directive == AcquisitionDirective.AcquireTokenA &
                status_read_request == StatusReadRequest.ReadTokenA) |
               (acquisition_directive == AcquisitionDirective.AcquireTokenB &
                status_read_request == StatusReadRequest.ReadTokenB)) &
              captured_report.ticket == ReportTicket.NoTicket &
              captured_report.availability == ReportAvailability.Absent &
              captured_report.level == CapacityLevel.NoLevel &
              captured_report.quality == ReportQuality.NoQuality;
          // @trace LOCAL-02
          case ACQUISITION_INACTIVE:
            assume In(acquisitionState) == AcquisitionState.Ready &
                   acquisition_directive == AcquisitionDirective.NoAcquisition;
            guarantee acquisitionState == AcquisitionState.Ready &
              committedAcquisitionOutcome == AcquisitionOutcome.NoAcquisitionOutcome &
              status_read_request == StatusReadRequest.NoRead &
              captured_report.ticket == ReportTicket.NoTicket &
              captured_report.availability == ReportAvailability.Absent &
              captured_report.level == CapacityLevel.NoLevel &
              captured_report.quality == ReportQuality.NoQuality;
    }*/
  }

  // @trace PART-03
  part def ReportQualification :> Thread {
    // @trace INT-07
    port captured_report : DataPort { in :>> type : CapturedReport; }
    // @trace INT-09
    port qualified_evidence : DataPort { out :>> type : TaggedQualifiedEvidence; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_QUALIFICATION_SAFE:
          qualified_evidence.ticket == ReportTicket.NoTicket &
          qualified_evidence.evidence == QualifiedEvidence.NoEvidence;
      compute
        compute_cases
          // @trace CASE-01
          case QUALIFY_CURRENT_HIGH:
            assume captured_report.ticket != ReportTicket.NoTicket &
                   captured_report.availability == ReportAvailability.Present &
                   captured_report.level == CapacityLevel.High &
                   captured_report.quality == ReportQuality.Current;
            guarantee qualified_evidence.ticket == captured_report.ticket &
              qualified_evidence.evidence == QualifiedEvidence.TrustedHigh;
          // @trace CASE-02
          case QUALIFY_CURRENT_MODERATE:
            assume captured_report.ticket != ReportTicket.NoTicket &
                   captured_report.availability == ReportAvailability.Present &
                   captured_report.level == CapacityLevel.Moderate &
                   captured_report.quality == ReportQuality.Current;
            guarantee qualified_evidence.ticket == captured_report.ticket &
              qualified_evidence.evidence == QualifiedEvidence.TrustedModerate;
          // @trace CASE-03
          case QUALIFY_CURRENT_LOW:
            assume captured_report.ticket != ReportTicket.NoTicket &
                   captured_report.availability == ReportAvailability.Present &
                   captured_report.level == CapacityLevel.Low &
                   captured_report.quality == ReportQuality.Current;
            guarantee qualified_evidence.ticket == captured_report.ticket &
              qualified_evidence.evidence == QualifiedEvidence.TrustedLow;
          // @trace CASE-03
          case QUALIFY_CURRENT_CRITICAL:
            assume captured_report.ticket != ReportTicket.NoTicket &
                   captured_report.availability == ReportAvailability.Present &
                   captured_report.level == CapacityLevel.Critical &
                   captured_report.quality == ReportQuality.Current;
            guarantee qualified_evidence.ticket == captured_report.ticket &
              qualified_evidence.evidence == QualifiedEvidence.TrustedCritical;
          // @trace CASE-04
          case QUALIFY_UNTRUSTED_PRESENT:
            assume captured_report.ticket != ReportTicket.NoTicket &
                   not (captured_report.availability == ReportAvailability.Present &
                        captured_report.level != CapacityLevel.NoLevel &
                        captured_report.quality == ReportQuality.Current);
            guarantee qualified_evidence.ticket == captured_report.ticket &
              qualified_evidence.evidence == QualifiedEvidence.Untrusted;
          // @trace LOCAL-03
          case QUALIFICATION_INACTIVE:
            assume captured_report.ticket == ReportTicket.NoTicket;
            guarantee qualified_evidence.ticket == ReportTicket.NoTicket &
              qualified_evidence.evidence == QualifiedEvidence.NoEvidence;
    }*/
  }

  // @trace PART-04
  part def AssessmentDecision :> Thread {
    // @trace INT-05
    port assessment_context : DataPort { in :>> type : AssessmentContext; }
    // @trace INT-09
    port qualified_evidence : DataPort { in :>> type : TaggedQualifiedEvidence; }
    // @trace INT-10
    port decision_assessment : DataPort { out :>> type : TaggedAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_DECISION_SAFE:
          decision_assessment.ticket == ReportTicket.NoTicket &
          decision_assessment.result == AssessmentResult.NoAssessment;
      compute
        compute_cases
          // @trace CASE-01
          case DECIDE_HIGH:
            assume ((assessment_context == AssessmentContext.AssessTokenA &
                     qualified_evidence.ticket == ReportTicket.TokenA) |
                    (assessment_context == AssessmentContext.AssessTokenB &
                     qualified_evidence.ticket == ReportTicket.TokenB)) &
                   qualified_evidence.evidence == QualifiedEvidence.TrustedHigh;
            guarantee decision_assessment.ticket == qualified_evidence.ticket &
              decision_assessment.result == AssessmentResult.NormalUse;
          // @trace CASE-02
          case DECIDE_MODERATE:
            assume ((assessment_context == AssessmentContext.AssessTokenA &
                     qualified_evidence.ticket == ReportTicket.TokenA) |
                    (assessment_context == AssessmentContext.AssessTokenB &
                     qualified_evidence.ticket == ReportTicket.TokenB)) &
                   qualified_evidence.evidence == QualifiedEvidence.TrustedModerate;
            guarantee decision_assessment.ticket == qualified_evidence.ticket &
              decision_assessment.result == AssessmentResult.CautionUse;
          // @trace CASE-03
          case DECIDE_LOW_OR_CRITICAL:
            assume ((assessment_context == AssessmentContext.AssessTokenA &
                     qualified_evidence.ticket == ReportTicket.TokenA) |
                    (assessment_context == AssessmentContext.AssessTokenB &
                     qualified_evidence.ticket == ReportTicket.TokenB)) &
                   (qualified_evidence.evidence == QualifiedEvidence.TrustedLow |
                    qualified_evidence.evidence == QualifiedEvidence.TrustedCritical);
            guarantee decision_assessment.ticket == qualified_evidence.ticket &
              decision_assessment.result == AssessmentResult.RestrictUse;
          // @trace CASE-04
          case DECIDE_UNTRUSTED:
            assume ((assessment_context == AssessmentContext.AssessTokenA &
                     qualified_evidence.ticket == ReportTicket.TokenA) |
                    (assessment_context == AssessmentContext.AssessTokenB &
                     qualified_evidence.ticket == ReportTicket.TokenB)) &
                   qualified_evidence.evidence == QualifiedEvidence.Untrusted;
            guarantee decision_assessment.ticket == qualified_evidence.ticket &
              decision_assessment.result == AssessmentResult.Untrusted;
          // @trace LOCAL-04
          case DECISION_INAPPLICABLE:
            assume not (((assessment_context == AssessmentContext.AssessTokenA &
                          qualified_evidence.ticket == ReportTicket.TokenA) |
                         (assessment_context == AssessmentContext.AssessTokenB &
                          qualified_evidence.ticket == ReportTicket.TokenB)) &
                        qualified_evidence.evidence != QualifiedEvidence.NoEvidence);
            guarantee decision_assessment.ticket == ReportTicket.NoTicket &
              decision_assessment.result == AssessmentResult.NoAssessment;
    }*/
  }

  // @trace PART-05
  part def ResultCustody :> Thread {
    // @trace INT-03
    port control_use_feedback : DataPort { in :>> type : ControlUseFeedback; }
    // @trace INT-06
    port publication_directive : DataPort { in :>> type : PublicationDirective; }
    // @trace INT-10
    port decision_assessment : DataPort { in :>> type : TaggedAssessment; }
    // @trace INT-11
    port publication_outcome : DataPort { out :>> type : PublicationOutcome; }
    // @trace INT-13
    port battery_assessment : DataPort { out :>> type : TaggedAssessment; }

    language "GUMBO" /*{
      state
        // @trace STATE-03
        publicationState: PublicationState;
        // @trace STATE-03
        retainedAssessment: AssessmentResult;
        // @generated-support GEN-SUP-02 prior-commit register only.
        committedPublicationOutcome: PublicationOutcome;
      initialize
        modifies publicationState, retainedAssessment, committedPublicationOutcome;
        // @trace INIT-01
        guarantee INITIAL_CUSTODY_SAFE:
          publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome &
          publication_outcome == PublicationOutcome.NoPublicationOutcome &
          battery_assessment.ticket == ReportTicket.NoTicket &
          battery_assessment.result == AssessmentResult.NoAssessment;
      compute
        modifies publicationState, retainedAssessment, committedPublicationOutcome;
        // @generated-support GEN-SUP-02 exposes only the prior committed value.
        guarantee PRIOR_PUBLICATION_OUTCOME:
          publication_outcome == In(committedPublicationOutcome);
        compute_cases
          // @trace CASE-11
          case PUBLICATION_RESET:
            assume publication_directive == PublicationDirective.ResetPublication;
            guarantee publicationState == PublicationState.Empty &
              retainedAssessment == AssessmentResult.NoAssessment &
              committedPublicationOutcome == PublicationOutcome.PublicationReset &
              battery_assessment.ticket == ReportTicket.NoTicket &
              battery_assessment.result == AssessmentResult.NoAssessment;
          // @trace CASE-10
          case PUBLICATION_HELD:
            assume publication_directive != PublicationDirective.ResetPublication &
                   In(publicationState) == PublicationState.FaultHold;
            guarantee publicationState == PublicationState.FaultHold &
              retainedAssessment == AssessmentResult.NoAssessment &
              committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome &
              battery_assessment.ticket == ReportTicket.NoTicket &
              battery_assessment.result == AssessmentResult.NoAssessment;
          // @trace LOCAL-05
          case UNEXPECTED_OPEN_WHILE_OFFERED:
            assume (In(publicationState) == PublicationState.OfferedTokenA |
                    In(publicationState) == PublicationState.OfferedTokenB) &
                   (publication_directive == PublicationDirective.OpenTokenA |
                    publication_directive == PublicationDirective.OpenTokenB) &
                   ((control_use_feedback.ticket == FeedbackTicket.NoTicket &
                     control_use_feedback.disposition == UseDisposition.NoFeedback) |
                    (In(publicationState) == PublicationState.OfferedTokenA &
                     control_use_feedback.ticket == FeedbackTicket.TokenA &
                     control_use_feedback.disposition == UseDisposition.Pending) |
                    (In(publicationState) == PublicationState.OfferedTokenB &
                     control_use_feedback.ticket == FeedbackTicket.TokenB &
                     control_use_feedback.disposition == UseDisposition.Pending));
            guarantee publicationState == PublicationState.FaultHold &
              retainedAssessment == AssessmentResult.NoAssessment &
              committedPublicationOutcome == PublicationOutcome.PublicationFault &
              battery_assessment.ticket == ReportTicket.NoTicket &
              battery_assessment.result == AssessmentResult.NoAssessment;
          // @trace CASE-10
          case FEEDBACK_FAULT:
            assume publication_directive != PublicationDirective.ResetPublication &
                   In(publicationState) != PublicationState.FaultHold &
                   not ((control_use_feedback.ticket == FeedbackTicket.NoTicket &
                         control_use_feedback.disposition == UseDisposition.NoFeedback) |
                        (In(publicationState) == PublicationState.OfferedTokenA &
                         control_use_feedback.ticket == FeedbackTicket.TokenA &
                         (control_use_feedback.disposition == UseDisposition.Pending |
                          control_use_feedback.disposition == UseDisposition.Consumed)) |
                        (In(publicationState) == PublicationState.OfferedTokenB &
                         control_use_feedback.ticket == FeedbackTicket.TokenB &
                         (control_use_feedback.disposition == UseDisposition.Pending |
                          control_use_feedback.disposition == UseDisposition.Consumed)));
            guarantee publicationState == PublicationState.FaultHold &
              retainedAssessment == AssessmentResult.NoAssessment &
              committedPublicationOutcome == PublicationOutcome.PublicationFault &
              battery_assessment.ticket == ReportTicket.NoTicket &
              battery_assessment.result == AssessmentResult.NoAssessment;
          // @trace CASE-09
          case CONSUME_TOKEN_A:
            assume In(publicationState) == PublicationState.OfferedTokenA &
                   control_use_feedback.ticket == FeedbackTicket.TokenA &
                   control_use_feedback.disposition == UseDisposition.Consumed &
                   publication_directive != PublicationDirective.ResetPublication;
            guarantee publicationState == PublicationState.Empty &
              retainedAssessment == AssessmentResult.NoAssessment &
              committedPublicationOutcome == PublicationOutcome.Consumed &
              battery_assessment.ticket == ReportTicket.NoTicket &
              battery_assessment.result == AssessmentResult.NoAssessment;
          // @trace CASE-09
          case CONSUME_TOKEN_B:
            assume In(publicationState) == PublicationState.OfferedTokenB &
                   control_use_feedback.ticket == FeedbackTicket.TokenB &
                   control_use_feedback.disposition == UseDisposition.Consumed &
                   publication_directive != PublicationDirective.ResetPublication;
            guarantee publicationState == PublicationState.Empty &
              retainedAssessment == AssessmentResult.NoAssessment &
              committedPublicationOutcome == PublicationOutcome.Consumed &
              battery_assessment.ticket == ReportTicket.NoTicket &
              battery_assessment.result == AssessmentResult.NoAssessment;
          // @trace CASE-08
          case WITHDRAW_COHERENT_OFFER:
            assume (In(publicationState) == PublicationState.OfferedTokenA |
                    In(publicationState) == PublicationState.OfferedTokenB) &
                   publication_directive == PublicationDirective.Withdraw &
                   ((control_use_feedback.ticket == FeedbackTicket.NoTicket &
                     control_use_feedback.disposition == UseDisposition.NoFeedback) |
                    (In(publicationState) == PublicationState.OfferedTokenA &
                     control_use_feedback.ticket == FeedbackTicket.TokenA &
                     control_use_feedback.disposition == UseDisposition.Pending) |
                    (In(publicationState) == PublicationState.OfferedTokenB &
                     control_use_feedback.ticket == FeedbackTicket.TokenB &
                     control_use_feedback.disposition == UseDisposition.Pending));
            guarantee publicationState == PublicationState.Empty &
              retainedAssessment == AssessmentResult.NoAssessment &
              committedPublicationOutcome == PublicationOutcome.Cancelled &
              battery_assessment.ticket == ReportTicket.NoTicket &
              battery_assessment.result == AssessmentResult.NoAssessment;
          // @trace CASE-09
          case PRESERVE_TOKEN_A:
            assume In(publicationState) == PublicationState.OfferedTokenA &
                   publication_directive == PublicationDirective.NoPublicationDirective &
                   ((control_use_feedback.ticket == FeedbackTicket.NoTicket &
                     control_use_feedback.disposition == UseDisposition.NoFeedback) |
                    (control_use_feedback.ticket == FeedbackTicket.TokenA &
                     control_use_feedback.disposition == UseDisposition.Pending));
            guarantee publicationState == PublicationState.OfferedTokenA &
              retainedAssessment == In(retainedAssessment) &
              committedPublicationOutcome == PublicationOutcome.OfferedTokenA &
              battery_assessment.ticket == ReportTicket.TokenA &
              battery_assessment.result == In(retainedAssessment);
          // @trace CASE-09
          case PRESERVE_TOKEN_B:
            assume In(publicationState) == PublicationState.OfferedTokenB &
                   publication_directive == PublicationDirective.NoPublicationDirective &
                   ((control_use_feedback.ticket == FeedbackTicket.NoTicket &
                     control_use_feedback.disposition == UseDisposition.NoFeedback) |
                    (control_use_feedback.ticket == FeedbackTicket.TokenB &
                     control_use_feedback.disposition == UseDisposition.Pending));
            guarantee publicationState == PublicationState.OfferedTokenB &
              retainedAssessment == In(retainedAssessment) &
              committedPublicationOutcome == PublicationOutcome.OfferedTokenB &
              battery_assessment.ticket == ReportTicket.TokenB &
              battery_assessment.result == In(retainedAssessment);
          // @trace LOCAL-05
          case OPEN_TOKEN_A:
            assume In(publicationState) == PublicationState.Empty &
                   control_use_feedback.ticket == FeedbackTicket.NoTicket &
                   control_use_feedback.disposition == UseDisposition.NoFeedback &
                   publication_directive == PublicationDirective.OpenTokenA &
                   decision_assessment.ticket == ReportTicket.TokenA &
                   decision_assessment.result != AssessmentResult.NoAssessment;
            guarantee publicationState == PublicationState.OfferedTokenA &
              retainedAssessment == decision_assessment.result &
              committedPublicationOutcome == PublicationOutcome.OfferedTokenA &
              battery_assessment.ticket == ReportTicket.TokenA &
              battery_assessment.result == decision_assessment.result;
          // @trace LOCAL-05
          case OPEN_TOKEN_B:
            assume In(publicationState) == PublicationState.Empty &
                   control_use_feedback.ticket == FeedbackTicket.NoTicket &
                   control_use_feedback.disposition == UseDisposition.NoFeedback &
                   publication_directive == PublicationDirective.OpenTokenB &
                   decision_assessment.ticket == ReportTicket.TokenB &
                   decision_assessment.result != AssessmentResult.NoAssessment;
            guarantee publicationState == PublicationState.OfferedTokenB &
              retainedAssessment == decision_assessment.result &
              committedPublicationOutcome == PublicationOutcome.OfferedTokenB &
              battery_assessment.ticket == ReportTicket.TokenB &
              battery_assessment.result == decision_assessment.result;
          // @trace LOCAL-05
          case CUSTODY_INACTIVE:
            assume In(publicationState) == PublicationState.Empty &
                   control_use_feedback.ticket == FeedbackTicket.NoTicket &
                   control_use_feedback.disposition == UseDisposition.NoFeedback &
                   publication_directive != PublicationDirective.ResetPublication &
                   not (publication_directive == PublicationDirective.OpenTokenA &
                        decision_assessment.ticket == ReportTicket.TokenA &
                        decision_assessment.result != AssessmentResult.NoAssessment) &
                   not (publication_directive == PublicationDirective.OpenTokenB &
                        decision_assessment.ticket == ReportTicket.TokenB &
                        decision_assessment.result != AssessmentResult.NoAssessment);
            guarantee publicationState == PublicationState.Empty &
              retainedAssessment == AssessmentResult.NoAssessment &
              committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome &
              battery_assessment.ticket == ReportTicket.NoTicket &
              battery_assessment.result == AssessmentResult.NoAssessment;
    }*/
  }

  // @generated-support GEN-SUP-01 behavior-free containment only.
  part def BatteryAssessmentProcess :> Process {
    // @trace MON-01
    port check_request : DataPort { in :>> type : CheckRequest; }
    // @trace MON-02
    port battery_report : DataPort { in :>> type : BatteryReport; }
    // @trace MON-03
    port control_use_feedback : DataPort { in :>> type : ControlUseFeedback; }
    // @trace CTRL-01
    port status_read_request : DataPort { out :>> type : StatusReadRequest; }
    // @trace CTRL-02
    port battery_assessment : DataPort { out :>> type : TaggedAssessment; }
    // @trace CTRL-03
    port check_status : DataPort { out :>> type : CheckStatus; }

    // @trace PART-01
    part check_lifecycle : CheckLifecycle;
    // @trace PART-02
    part report_acquisition : ReportAcquisition;
    // @trace PART-03
    part report_qualification : ReportQualification;
    // @trace PART-04
    part assessment_decision : AssessmentDecision;
    // @trace PART-05
    part result_custody : ResultCustody;

    // @trace INT-01
    connection int01 : PortConnection connect check_request to check_lifecycle.check_request;
    // @trace INT-02
    connection int02 : PortConnection connect battery_report to report_acquisition.battery_report;
    // @trace INT-03
    connection int03 : PortConnection connect control_use_feedback to result_custody.control_use_feedback;
    // @trace INT-04
    connection int04 : PortConnection connect check_lifecycle.acquisition_directive to report_acquisition.acquisition_directive;
    // @trace INT-05
    connection int05 : PortConnection connect check_lifecycle.assessment_context to assessment_decision.assessment_context;
    // @trace INT-06
    connection int06 : PortConnection connect check_lifecycle.publication_directive to result_custody.publication_directive;
    // @trace INT-07
    connection int07 : PortConnection connect report_acquisition.captured_report to report_qualification.captured_report;
    // @trace INT-08
    connection int08 : PortConnection connect report_acquisition.acquisition_outcome to check_lifecycle.acquisition_outcome;
    // @trace INT-09
    connection int09 : PortConnection connect report_qualification.qualified_evidence to assessment_decision.qualified_evidence;
    // @trace INT-10
    connection int10 : PortConnection connect assessment_decision.decision_assessment to result_custody.decision_assessment;
    // @trace INT-11
    connection int11 : PortConnection connect result_custody.publication_outcome to check_lifecycle.publication_outcome;
    // @trace INT-12
    connection int12 : PortConnection connect report_acquisition.status_read_request to status_read_request;
    // @trace INT-13
    connection int13 : PortConnection connect result_custody.battery_assessment to battery_assessment;
    // @trace INT-14
    connection int14 : PortConnection connect check_lifecycle.check_status to check_status;
  }

  // @trace BOUND-01
  part def BatteryStatusAssessmentServiceSystem :> System {
    // @trace MON-01
    port check_request : DataPort { in :>> type : CheckRequest; }
    // @trace MON-02
    port battery_report : DataPort { in :>> type : BatteryReport; }
    // @trace MON-03
    port control_use_feedback : DataPort { in :>> type : ControlUseFeedback; }
    // @trace CTRL-01
    port status_read_request : DataPort { out :>> type : StatusReadRequest; }
    // @trace CTRL-02
    port battery_assessment : DataPort { out :>> type : TaggedAssessment; }
    // @trace CTRL-03
    port check_status : DataPort { out :>> type : CheckStatus; }

    // @generated-support GEN-SUP-01 behavior-free containment only.
    part battery_assessment_process : BatteryAssessmentProcess;
    // @generated-support GEN-SUP-03 transparent delegation of INT-01.
    connection support01 : PortConnection connect check_request to battery_assessment_process.check_request;
    // @generated-support GEN-SUP-03 transparent delegation of INT-02.
    connection support02 : PortConnection connect battery_report to battery_assessment_process.battery_report;
    // @generated-support GEN-SUP-03 transparent delegation of INT-03.
    connection support03 : PortConnection connect control_use_feedback to battery_assessment_process.control_use_feedback;
    // @generated-support GEN-SUP-03 transparent delegation of INT-12.
    connection support04 : PortConnection connect battery_assessment_process.status_read_request to status_read_request;
    // @generated-support GEN-SUP-03 transparent delegation of INT-13.
    connection support05 : PortConnection connect battery_assessment_process.battery_assessment to battery_assessment;
    // @generated-support GEN-SUP-03 transparent delegation of INT-14.
    connection support06 : PortConnection connect battery_assessment_process.check_status to check_status;
  }

  // @trace STRUCT-01
  part battery_status_assessment_service : BatteryStatusAssessmentServiceSystem;
}
