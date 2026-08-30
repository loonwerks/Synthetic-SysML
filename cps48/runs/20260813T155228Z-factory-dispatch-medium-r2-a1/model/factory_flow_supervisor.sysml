package Factory_Flow {

  private import HAMR::*;

  // Closed finite domains are generated support for REP-01.
  // @trace REP-01
  enum def RequestPresence {
    enum None;
    enum Present;
  }

  // @trace REP-01
  enum def Validity {
    enum Valid;
    enum Invalid;
  }

  // @trace REP-01
  enum def WorkId {
    enum NoWork;
    enum W1;
    enum W2;
  }

  // @trace REP-01
  enum def ProductKind {
    enum AngleProduct;
    enum UnsupportedProduct;
  }

  // @trace REP-01
  enum def MaterialDisposition {
    enum Ready;
    enum Unavailable;
  }

  // @trace REP-01
  enum def FlowStep {
    enum Heating;
    enum Bending;
    enum Cutting;
    enum Drilling;
    enum Grinding;
    enum Polishing;
  }

  // @trace REP-01
  enum def StepDisposition {
    enum Ready;
    enum Blocked;
  }

  // @trace REP-01
  enum def ProcessEvent {
    enum NoEvent;
    enum InProgress;
    enum Completed;
    enum Failed;
  }

  // @trace CTRL-01
  enum def CommandAction {
    enum NoCommand;
    enum Start;
    enum Advance;
    enum Retry;
    enum Abort;
  }

  // @trace CTRL-02
  enum def ProductionResult {
    enum None;
    enum ProductionComplete;
    enum ProductionFailed;
  }

  // @trace CTRL-03
  enum def ProductionFlowStatus {
    enum Idle;
    enum Rejected;
    enum WaitingMaterial;
    enum WaitingStation;
    enum Started;
    enum Processing;
    enum Busy;
    enum Recovering;
    enum Advanced;
    enum Completed;
    enum Failed;
  }

  // @trace STATE-01
  enum def LedgerPhase {
    enum Idle;
    enum Active;
    enum TransferPending;
    enum RecoveryPending;
    enum TerminalComplete;
    enum TerminalFailed;
  }

  // @trace STATE-01
  enum def AttemptKind {
    enum First;
    enum Retry;
  }

  // @trace PART-01
  enum def AdmissionAssessment {
    enum NoRequest;
    enum Eligible;
    enum Malformed;
  }

  // @trace PART-02
  enum def MaterialAssessment {
    enum MaterialReady;
    enum MaterialUnavailable;
    enum MaterialUnknown;
  }

  // @trace PART-03
  enum def TargetQualification {
    enum HeatingReady;
    enum HeatingBlocked;
    enum HeatingUnknown;
    enum BendingReady;
    enum BendingBlocked;
    enum BendingUnknown;
    enum CuttingReady;
    enum CuttingBlocked;
    enum CuttingUnknown;
    enum DrillingReady;
    enum DrillingBlocked;
    enum DrillingUnknown;
    enum GrindingReady;
    enum GrindingBlocked;
    enum GrindingUnknown;
    enum PolishingReady;
    enum PolishingBlocked;
    enum PolishingUnknown;
  }

  // @trace PART-04
  enum def CorrelatedOutcomePlan {
    enum Preserve;
    enum IntermediateCompleted;
    enum FinalCompleted;
    enum FirstFailure;
    enum RetryFailure;
  }

  // @trace PART-05
  enum def IntentKind {
    enum NoIntent;
    enum FreshIntent;
    enum ActiveIntent;
    enum TransferIntent;
    enum RecoveryIntent;
    enum ResetIntent;
  }

  // @trace PART-05
  enum def CompetitorPresence {
    enum Absent;
    enum Present;
  }

  // Each literal denotes the distinct CASE-01..CASE-20 partition selected by PART-06.
  // @trace PART-06
  enum def FlowDecision {
    enum ResetComplete;
    enum ResetFailed;
    enum HoldActive;
    enum BusyActive;
    enum CompleteProduction;
    enum AdvanceNow;
    enum HoldTransfer;
    enum EnterRecovery;
    enum FailTerminal;
    enum ReleaseTransfer;
    enum WaitTransfer;
    enum RetryNow;
    enum WaitRecovery;
    enum IdleNoRequest;
    enum RejectMalformed;
    enum WaitMaterialUnavailable;
    enum WaitMaterialUnknown;
    enum WaitHeatingBlocked;
    enum WaitHeatingUnknown;
    enum StartWork;
  }

  // @trace PART-06
  enum def DecisionReason {
    enum ResetComplete;
    enum ResetFailed;
    enum Processing;
    enum ProtectedBusy;
    enum Completed;
    enum Advanced;
    enum TransferWaiting;
    enum RecoveryEntered;
    enum Failed;
    enum TransferReleased;
    enum RecoveryReleased;
    enum RecoveryWaiting;
    enum NoRequest;
    enum MalformedRequest;
    enum MaterialUnavailable;
    enum MaterialUnknown;
    enum HeatingBlocked;
    enum HeatingUnknown;
    enum Started;
  }

  // All fields inspected by contracts are attributes, never nested parts.
  // @trace MON-01
  part def PresentedWorkRequest :> Data {
    attribute presence : RequestPresence;
    attribute validity : Validity;
    attribute work_id : WorkId;
    attribute product : ProductKind;
  }

  // @trace MON-02
  part def MaterialHandoffObservation :> Data {
    attribute validity : Validity;
    attribute work_id : WorkId;
    attribute disposition : MaterialDisposition;
  }

  // @trace MON-03
  part def StepReadinessObservation :> Data {
    attribute validity : Validity;
    attribute step : Base_Types::Integer_32;
    attribute disposition : StepDisposition;
  }

  // @trace MON-04
  part def ProcessResultObservation :> Data {
    attribute validity : Validity;
    attribute work_id : WorkId;
    attribute step : Base_Types::Integer_32;
    attribute event_kind : ProcessEvent;
  }

  // @trace CTRL-01
  part def LineFlowCommand :> Data {
    attribute action_kind : CommandAction;
    attribute work_id : WorkId;
    attribute step : Base_Types::Integer_32;
  }

  // @trace CTRL-02
  part def ProductionOutcome :> Data {
    attribute result : ProductionResult;
    attribute work_id : WorkId;
  }

  // @trace INT-05
  part def AdmissionFact :> Data {
    attribute assessment : AdmissionAssessment;
    attribute work_id : WorkId;
  }

  // @trace INT-07
  part def MaterialFact :> Data {
    attribute assessment : MaterialAssessment;
  }

  // @trace INT-12
  part def FlowContext :> Data {
    attribute phase : LedgerPhase;
    attribute work_id : WorkId;
    attribute step_value : Base_Types::Integer_32;
    attribute attempt : AttemptKind;
  }

  // @trace INT-09
  part def OutcomeFact :> Data {
    attribute plan : CorrelatedOutcomePlan;
  }

  // @trace INT-14
  part def ProtectionContext :> Data {
    attribute phase : LedgerPhase;
    attribute work_id : WorkId;
    attribute step_value : Base_Types::Integer_32;
    attribute attempt : AttemptKind;
  }

  // @trace INT-10
  part def FlowIntentFact :> Data {
    attribute kind : IntentKind;
    attribute competitor : CompetitorPresence;
    attribute assessment : AdmissionAssessment;
    attribute phase : LedgerPhase;
    attribute work_id : WorkId;
    attribute step : Base_Types::Integer_32;
  }

  // @trace INT-11
  part def AuthorizationFact :> Data {
    attribute decision : FlowDecision;
    attribute reason : DecisionReason;
    attribute work_id : WorkId;
    attribute step : Base_Types::Integer_32;
  }

  // @trace INT-17
  part def FlowSnapshot :> Data {
    attribute phase : LedgerPhase;
    attribute work_id : WorkId;
    attribute step_value : Base_Types::Integer_32;
    attribute attempt : AttemptKind;
  }

  // @trace PART-01
  part def WorkRequestQualifier :> Thread {
    // @trace INT-01
    port presentedWork : DataPort { in :>> type : PresentedWorkRequest; }
    // @trace INT-05
    port admissionToMaterial : DataPort { out :>> type : AdmissionFact; }
    // @trace INT-06
    port admissionToPriority : DataPort { out :>> type : AdmissionFact; }

    language "GUMBO" /*{
      initialize
        // @trace PART-01
        guarantee SafeAdmissionInitialization:
          admissionToMaterial.assessment == Factory_Flow::AdmissionAssessment.NoRequest &
          admissionToMaterial.work_id == Factory_Flow::WorkId.NoWork &
          admissionToPriority.assessment == Factory_Flow::AdmissionAssessment.NoRequest &
          admissionToPriority.work_id == Factory_Flow::WorkId.NoWork;

      compute
        compute_cases
          // @trace PART-01
          case RequestAbsent "No presented request is classified separately from malformed content":
            assume presentedWork.presence == Factory_Flow::RequestPresence.None;
            guarantee
              admissionToMaterial.assessment == Factory_Flow::AdmissionAssessment.NoRequest &
              admissionToMaterial.work_id == Factory_Flow::WorkId.NoWork &
              admissionToPriority.assessment == Factory_Flow::AdmissionAssessment.NoRequest &
              admissionToPriority.work_id == Factory_Flow::WorkId.NoWork;

          // @trace PART-01
          case RequestEligible "All request fields jointly establish an eligible angle-product work item":
            assume presentedWork.presence == Factory_Flow::RequestPresence.Present &
              presentedWork.validity == Factory_Flow::Validity.Valid &
              (presentedWork.work_id == Factory_Flow::WorkId.W1 |
               presentedWork.work_id == Factory_Flow::WorkId.W2) &
              presentedWork.product == Factory_Flow::ProductKind.AngleProduct;
            guarantee
              admissionToMaterial.assessment == Factory_Flow::AdmissionAssessment.Eligible &
              admissionToMaterial.work_id == presentedWork.work_id &
              admissionToPriority.assessment == Factory_Flow::AdmissionAssessment.Eligible &
              admissionToPriority.work_id == presentedWork.work_id;

          // @trace PART-01
          case RequestMalformed "Any present request outside the eligible field combination is malformed":
            assume presentedWork.presence == Factory_Flow::RequestPresence.Present &
              not (presentedWork.validity == Factory_Flow::Validity.Valid &
                   (presentedWork.work_id == Factory_Flow::WorkId.W1 |
                    presentedWork.work_id == Factory_Flow::WorkId.W2) &
                   presentedWork.product == Factory_Flow::ProductKind.AngleProduct);
            guarantee
              admissionToMaterial.assessment == Factory_Flow::AdmissionAssessment.Malformed &
              admissionToMaterial.work_id == Factory_Flow::WorkId.NoWork &
              admissionToPriority.assessment == Factory_Flow::AdmissionAssessment.Malformed &
              admissionToPriority.work_id == Factory_Flow::WorkId.NoWork;
    }*/
  }

  // @trace PART-02
  part def MaterialCorrelationQualifier :> Thread {
    // @trace INT-02
    port materialObservation : DataPort { in :>> type : MaterialHandoffObservation; }
    // @trace INT-05
    port admission : DataPort { in :>> type : AdmissionFact; }
    // @trace INT-07
    port materialFact : DataPort { out :>> type : MaterialFact; }

    language "GUMBO" /*{
      initialize
        // @trace PART-02
        guarantee SafeMaterialInitialization:
          materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialUnknown;

      compute
        compute_cases
          // @trace PART-02
          case MaterialReadyCorrelated "Valid ready material must correlate to eligible work":
            assume admission.assessment == Factory_Flow::AdmissionAssessment.Eligible &
              materialObservation.validity == Factory_Flow::Validity.Valid &
              materialObservation.work_id == admission.work_id &
              materialObservation.disposition == Factory_Flow::MaterialDisposition.Ready;
            guarantee materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialReady;

          // @trace PART-02
          case MaterialUnavailableCorrelated "Valid unavailable material must correlate to eligible work":
            assume admission.assessment == Factory_Flow::AdmissionAssessment.Eligible &
              materialObservation.validity == Factory_Flow::Validity.Valid &
              materialObservation.work_id == admission.work_id &
              materialObservation.disposition == Factory_Flow::MaterialDisposition.Unavailable;
            guarantee materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialUnavailable;

          // @trace PART-02
          case MaterialUnknownOrInapplicable "Invalid, mismatched, or inapplicable material is unknown":
            assume admission.assessment != Factory_Flow::AdmissionAssessment.Eligible |
              materialObservation.validity == Factory_Flow::Validity.Invalid |
              materialObservation.work_id != admission.work_id;
            guarantee materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialUnknown;
    }*/
  }

  // @trace PART-03
  part def TargetStepReadinessQualifier :> Thread {
    // @trace INT-03
    port readinessObservation : DataPort { in :>> type : StepReadinessObservation; }
    // @trace INT-12
    port flowContext : DataPort { in :>> type : FlowContext; }
    // @trace INT-08
    port targetFact : DataPort { out :>> type : TargetQualification; }

    language "GUMBO" /*{
      functions
        // @trace POL-01
        def successorCode(step: Base_Types::Integer_32): Base_Types::Integer_32 :=
          if (step == 0[s32])? 1[s32]
          else if (step == 1[s32])? 2[s32]
          else if (step == 2[s32])? 3[s32]
          else if (step == 3[s32])? 4[s32]
          else 5[s32];

        // @trace PART-03
        def relevantTarget(phaseValue: Factory_Flow::LedgerPhase,
                           stepValue: Base_Types::Integer_32): Base_Types::Integer_32 :=
          if (phaseValue == Factory_Flow::LedgerPhase.Idle)? 0[s32]
          else if (phaseValue == Factory_Flow::LedgerPhase.Active)? successorCode(stepValue)
          else stepValue;

        // @trace PART-03
        def readyTarget(stepValue: Base_Types::Integer_32): Factory_Flow::TargetQualification :=
          if (stepValue == 0[s32])? Factory_Flow::TargetQualification.HeatingReady
          else if (stepValue == 1[s32])? Factory_Flow::TargetQualification.BendingReady
          else if (stepValue == 2[s32])? Factory_Flow::TargetQualification.CuttingReady
          else if (stepValue == 3[s32])? Factory_Flow::TargetQualification.DrillingReady
          else if (stepValue == 4[s32])? Factory_Flow::TargetQualification.GrindingReady
          else Factory_Flow::TargetQualification.PolishingReady;

        // @trace PART-03
        def blockedTarget(stepValue: Base_Types::Integer_32): Factory_Flow::TargetQualification :=
          if (stepValue == 0[s32])? Factory_Flow::TargetQualification.HeatingBlocked
          else if (stepValue == 1[s32])? Factory_Flow::TargetQualification.BendingBlocked
          else if (stepValue == 2[s32])? Factory_Flow::TargetQualification.CuttingBlocked
          else if (stepValue == 3[s32])? Factory_Flow::TargetQualification.DrillingBlocked
          else if (stepValue == 4[s32])? Factory_Flow::TargetQualification.GrindingBlocked
          else Factory_Flow::TargetQualification.PolishingBlocked;

        // @trace PART-03
        def unknownTarget(stepValue: Base_Types::Integer_32): Factory_Flow::TargetQualification :=
          if (stepValue == 0[s32])? Factory_Flow::TargetQualification.HeatingUnknown
          else if (stepValue == 1[s32])? Factory_Flow::TargetQualification.BendingUnknown
          else if (stepValue == 2[s32])? Factory_Flow::TargetQualification.CuttingUnknown
          else if (stepValue == 3[s32])? Factory_Flow::TargetQualification.DrillingUnknown
          else if (stepValue == 4[s32])? Factory_Flow::TargetQualification.GrindingUnknown
          else Factory_Flow::TargetQualification.PolishingUnknown;

      initialize
        // @trace PART-03
        guarantee SafeTargetInitialization:
          targetFact == Factory_Flow::TargetQualification.HeatingUnknown;

      compute
        compute_cases
          // @trace PART-03
          case TargetReadyCorrelated "Valid ready observation matches the state-derived target":
            assume readinessObservation.validity == Factory_Flow::Validity.Valid &
              readinessObservation.step == relevantTarget(flowContext.phase, flowContext.step_value) &
              readinessObservation.disposition == Factory_Flow::StepDisposition.Ready;
            guarantee targetFact == readyTarget(relevantTarget(flowContext.phase, flowContext.step_value));

          // @trace PART-03
          case TargetBlockedCorrelated "Valid blocked observation matches the state-derived target":
            assume readinessObservation.validity == Factory_Flow::Validity.Valid &
              readinessObservation.step == relevantTarget(flowContext.phase, flowContext.step_value) &
              readinessObservation.disposition == Factory_Flow::StepDisposition.Blocked;
            guarantee targetFact == blockedTarget(relevantTarget(flowContext.phase, flowContext.step_value));

          // @trace PART-03
          case TargetUnknownOrMismatched "Invalid or mismatched readiness cannot qualify a target":
            assume readinessObservation.validity == Factory_Flow::Validity.Invalid |
              readinessObservation.step != relevantTarget(flowContext.phase, flowContext.step_value);
            guarantee targetFact == unknownTarget(relevantTarget(flowContext.phase, flowContext.step_value));
    }*/
  }

  // @trace PART-04
  part def ProcessOutcomeCorrelator :> Thread {
    // @trace INT-04
    port processResult : DataPort { in :>> type : ProcessResultObservation; }
    // @trace INT-13
    port flowContext : DataPort { in :>> type : FlowContext; }
    // @trace INT-09
    port outcomeToAuthorization : DataPort { out :>> type : OutcomeFact; }
    // @trace INT-15
    port outcomeToDeterminer : DataPort { out :>> type : OutcomeFact; }

    language "GUMBO" /*{
      initialize
        // @trace PART-04
        guarantee SafeOutcomeInitialization:
          outcomeToAuthorization.plan == Factory_Flow::CorrelatedOutcomePlan.Preserve &
          outcomeToDeterminer.plan == Factory_Flow::CorrelatedOutcomePlan.Preserve;

      compute
        compute_cases
          // @trace PART-04
          case IntermediateCompletion "A correlated non-polishing completion is intermediate":
            assume flowContext.phase == Factory_Flow::LedgerPhase.Active &
              processResult.validity == Factory_Flow::Validity.Valid &
              processResult.work_id == flowContext.work_id &
              processResult.step == flowContext.step_value &
              processResult.event_kind == Factory_Flow::ProcessEvent.Completed &
              flowContext.step_value != 5[s32];
            guarantee
              outcomeToAuthorization.plan == Factory_Flow::CorrelatedOutcomePlan.IntermediateCompleted &
              outcomeToDeterminer.plan == Factory_Flow::CorrelatedOutcomePlan.IntermediateCompleted;

          // @trace PART-04
          case FinalCompletion "A correlated polishing completion is final":
            assume flowContext.phase == Factory_Flow::LedgerPhase.Active &
              processResult.validity == Factory_Flow::Validity.Valid &
              processResult.work_id == flowContext.work_id &
              processResult.step == flowContext.step_value &
              processResult.event_kind == Factory_Flow::ProcessEvent.Completed &
              flowContext.step_value == 5[s32];
            guarantee
              outcomeToAuthorization.plan == Factory_Flow::CorrelatedOutcomePlan.FinalCompleted &
              outcomeToDeterminer.plan == Factory_Flow::CorrelatedOutcomePlan.FinalCompleted;

          // @trace PART-04
          case FirstAttemptFailure "A correlated first-attempt failure opens recovery":
            assume flowContext.phase == Factory_Flow::LedgerPhase.Active &
              processResult.validity == Factory_Flow::Validity.Valid &
              processResult.work_id == flowContext.work_id &
              processResult.step == flowContext.step_value &
              processResult.event_kind == Factory_Flow::ProcessEvent.Failed &
              flowContext.attempt == Factory_Flow::AttemptKind.First;
            guarantee
              outcomeToAuthorization.plan == Factory_Flow::CorrelatedOutcomePlan.FirstFailure &
              outcomeToDeterminer.plan == Factory_Flow::CorrelatedOutcomePlan.FirstFailure;

          // @trace PART-04
          case RetryAttemptFailure "A correlated retry failure is terminal":
            assume flowContext.phase == Factory_Flow::LedgerPhase.Active &
              processResult.validity == Factory_Flow::Validity.Valid &
              processResult.work_id == flowContext.work_id &
              processResult.step == flowContext.step_value &
              processResult.event_kind == Factory_Flow::ProcessEvent.Failed &
              flowContext.attempt == Factory_Flow::AttemptKind.Retry;
            guarantee
              outcomeToAuthorization.plan == Factory_Flow::CorrelatedOutcomePlan.RetryFailure &
              outcomeToDeterminer.plan == Factory_Flow::CorrelatedOutcomePlan.RetryFailure;

          // @trace PARTITION-02
          case PreserveUncorrelated "Every inactive, invalid, mismatched, absent, or progress result preserves state":
            assume flowContext.phase != Factory_Flow::LedgerPhase.Active |
              processResult.validity == Factory_Flow::Validity.Invalid |
              processResult.work_id != flowContext.work_id |
              processResult.step != flowContext.step_value |
              processResult.event_kind == Factory_Flow::ProcessEvent.NoEvent |
              processResult.event_kind == Factory_Flow::ProcessEvent.InProgress;
            guarantee
              outcomeToAuthorization.plan == Factory_Flow::CorrelatedOutcomePlan.Preserve &
              outcomeToDeterminer.plan == Factory_Flow::CorrelatedOutcomePlan.Preserve;
    }*/
  }

  // @trace PART-05
  part def ProtectedWorkPriorityResolver :> Thread {
    // @trace INT-06
    port admission : DataPort { in :>> type : AdmissionFact; }
    // @trace INT-14
    port protectionContext : DataPort { in :>> type : ProtectionContext; }
    // @trace INT-10
    port intentFact : DataPort { out :>> type : FlowIntentFact; }

    language "GUMBO" /*{
      initialize
        // @trace PART-05
        guarantee SafeIntentInitialization:
          intentFact.kind == Factory_Flow::IntentKind.NoIntent &
          intentFact.competitor == Factory_Flow::CompetitorPresence.Absent &
          intentFact.assessment == Factory_Flow::AdmissionAssessment.NoRequest &
          intentFact.phase == Factory_Flow::LedgerPhase.Idle &
          intentFact.work_id == Factory_Flow::WorkId.NoWork &
          intentFact.step == 0[s32];

      compute
        // @trace PART-05
        guarantee CompetitorClassification:
          ((admission.assessment == Factory_Flow::AdmissionAssessment.Eligible &
            intentFact.competitor == Factory_Flow::CompetitorPresence.Present) |
           (admission.assessment != Factory_Flow::AdmissionAssessment.Eligible &
            intentFact.competitor == Factory_Flow::CompetitorPresence.Absent));

        // @trace INT-10
        guarantee PriorityContextPublication:
          intentFact.assessment == admission.assessment &
          intentFact.phase == protectionContext.phase;

        compute_cases
          // @trace PART-05
          case IdleWithoutEligibleWork "Idle without eligible admission has no flow intent":
            assume protectionContext.phase == Factory_Flow::LedgerPhase.Idle &
              admission.assessment != Factory_Flow::AdmissionAssessment.Eligible;
            guarantee
              intentFact.kind == Factory_Flow::IntentKind.NoIntent &
              intentFact.work_id == Factory_Flow::WorkId.NoWork &
              intentFact.step == 0[s32];

          // @trace PART-05
          case FreshWorkIntent "Idle eligible work selects a fresh heating intent":
            assume protectionContext.phase == Factory_Flow::LedgerPhase.Idle &
              admission.assessment == Factory_Flow::AdmissionAssessment.Eligible;
            guarantee
              intentFact.kind == Factory_Flow::IntentKind.FreshIntent &
              intentFact.work_id == admission.work_id &
              intentFact.step == 0[s32];

          // @trace PART-05
          case ActiveWorkProtected "Active stored work outranks every fresh competitor":
            assume protectionContext.phase == Factory_Flow::LedgerPhase.Active;
            guarantee
              intentFact.kind == Factory_Flow::IntentKind.ActiveIntent &
              intentFact.work_id == protectionContext.work_id &
              intentFact.step == protectionContext.step_value;

          // @trace PART-05
          case TransferWorkProtected "Transfer-pending stored work outranks every fresh competitor":
            assume protectionContext.phase == Factory_Flow::LedgerPhase.TransferPending;
            guarantee
              intentFact.kind == Factory_Flow::IntentKind.TransferIntent &
              intentFact.work_id == protectionContext.work_id &
              intentFact.step == protectionContext.step_value;

          // @trace POL-03
          case RecoveryWorkProtected "Recovery-pending stored work wins the explicit retry-versus-fresh conflict":
            assume protectionContext.phase == Factory_Flow::LedgerPhase.RecoveryPending;
            guarantee
              intentFact.kind == Factory_Flow::IntentKind.RecoveryIntent &
              intentFact.work_id == protectionContext.work_id &
              intentFact.step == protectionContext.step_value;

          // @trace POL-06
          case TerminalResetIntent "Either one-evaluation terminal phase selects reset":
            assume protectionContext.phase == Factory_Flow::LedgerPhase.TerminalComplete |
              protectionContext.phase == Factory_Flow::LedgerPhase.TerminalFailed;
            guarantee
              intentFact.kind == Factory_Flow::IntentKind.ResetIntent &
              intentFact.work_id == protectionContext.work_id &
              intentFact.step == protectionContext.step_value;
    }*/
  }

  // @trace PART-06
  part def FlowAuthorizationOwner :> Thread {
    // @trace INT-07
    port materialFact : DataPort { in :>> type : MaterialFact; }
    // @trace INT-08
    port targetFact : DataPort { in :>> type : TargetQualification; }
    // @trace INT-09
    port outcomeFact : DataPort { in :>> type : OutcomeFact; }
    // @trace INT-10
    port intentFact : DataPort { in :>> type : FlowIntentFact; }
    // @trace INT-11
    port authorization : DataPort { out :>> type : AuthorizationFact; }
    // @trace INT-16
    port reasonToStatus : DataPort { out :>> type : DecisionReason; }

    language "GUMBO" /*{
      functions
        // @trace PART-06
        def targetReady(value: Factory_Flow::TargetQualification): Base_Types::Boolean :=
          value == Factory_Flow::TargetQualification.HeatingReady |
          value == Factory_Flow::TargetQualification.BendingReady |
          value == Factory_Flow::TargetQualification.CuttingReady |
          value == Factory_Flow::TargetQualification.DrillingReady |
          value == Factory_Flow::TargetQualification.GrindingReady |
          value == Factory_Flow::TargetQualification.PolishingReady;

        // @trace PART-06
        def targetBlocked(value: Factory_Flow::TargetQualification): Base_Types::Boolean :=
          value == Factory_Flow::TargetQualification.HeatingBlocked |
          value == Factory_Flow::TargetQualification.BendingBlocked |
          value == Factory_Flow::TargetQualification.CuttingBlocked |
          value == Factory_Flow::TargetQualification.DrillingBlocked |
          value == Factory_Flow::TargetQualification.GrindingBlocked |
          value == Factory_Flow::TargetQualification.PolishingBlocked;

        // @trace PART-06
        def targetUnknown(value: Factory_Flow::TargetQualification): Base_Types::Boolean :=
          value == Factory_Flow::TargetQualification.HeatingUnknown |
          value == Factory_Flow::TargetQualification.BendingUnknown |
          value == Factory_Flow::TargetQualification.CuttingUnknown |
          value == Factory_Flow::TargetQualification.DrillingUnknown |
          value == Factory_Flow::TargetQualification.GrindingUnknown |
          value == Factory_Flow::TargetQualification.PolishingUnknown;

      initialize
        // @trace PART-06
        guarantee SafeAuthorizationInitialization:
          authorization.decision == Factory_Flow::FlowDecision.IdleNoRequest &
          authorization.reason == Factory_Flow::DecisionReason.NoRequest &
          authorization.work_id == Factory_Flow::WorkId.NoWork &
          authorization.step == 0[s32] &
          reasonToStatus == Factory_Flow::DecisionReason.NoRequest;

      compute
        compute_cases
          // @trace CASE-01
          case C01ResetComplete "Terminal completion resets before any boundary valuation":
            assume intentFact.kind == Factory_Flow::IntentKind.ResetIntent &
              intentFact.phase == Factory_Flow::LedgerPhase.TerminalComplete;
            guarantee authorization.decision == Factory_Flow::FlowDecision.ResetComplete &
              authorization.reason == Factory_Flow::DecisionReason.ResetComplete &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.ResetComplete;

          // @trace CASE-02
          case C02ResetFailed "Terminal failure resets before any boundary valuation":
            assume intentFact.kind == Factory_Flow::IntentKind.ResetIntent &
              intentFact.phase == Factory_Flow::LedgerPhase.TerminalFailed;
            guarantee authorization.decision == Factory_Flow::FlowDecision.ResetFailed &
              authorization.reason == Factory_Flow::DecisionReason.ResetFailed &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.ResetFailed;

          // @trace CASE-03
          case C03ActivePreserve "Active work without an eligible competitor keeps processing":
            assume intentFact.kind == Factory_Flow::IntentKind.ActiveIntent &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.Preserve &
              intentFact.competitor == Factory_Flow::CompetitorPresence.Absent;
            guarantee authorization.decision == Factory_Flow::FlowDecision.HoldActive &
              authorization.reason == Factory_Flow::DecisionReason.Processing &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.Processing;

          // @trace CASE-04
          case C04ActiveBusy "Active work with an eligible competitor remains protected":
            assume intentFact.kind == Factory_Flow::IntentKind.ActiveIntent &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.Preserve &
              intentFact.competitor == Factory_Flow::CompetitorPresence.Present;
            guarantee authorization.decision == Factory_Flow::FlowDecision.BusyActive &
              authorization.reason == Factory_Flow::DecisionReason.ProtectedBusy &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.ProtectedBusy;

          // @trace CASE-05
          case C05Complete "Final correlated polishing completion authorizes terminal completion":
            assume intentFact.kind == Factory_Flow::IntentKind.ActiveIntent &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.FinalCompleted;
            guarantee authorization.decision == Factory_Flow::FlowDecision.CompleteProduction &
              authorization.reason == Factory_Flow::DecisionReason.Completed &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.Completed;

          // @trace CASE-06
          case C06Advance "Intermediate completion and ready successor authorize advance":
            assume intentFact.kind == Factory_Flow::IntentKind.ActiveIntent &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.IntermediateCompleted &
              targetReady(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.AdvanceNow &
              authorization.reason == Factory_Flow::DecisionReason.Advanced &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.Advanced;

          // @trace CASE-07
          case C07HoldSuccessor "Intermediate completion without qualified successor readiness holds transfer":
            assume intentFact.kind == Factory_Flow::IntentKind.ActiveIntent &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.IntermediateCompleted &
              not targetReady(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.HoldTransfer &
              authorization.reason == Factory_Flow::DecisionReason.TransferWaiting &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.TransferWaiting;

          // @trace CASE-08
          case C08EnterRecovery "First correlated failure opens later same-step recovery":
            assume intentFact.kind == Factory_Flow::IntentKind.ActiveIntent &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.FirstFailure;
            guarantee authorization.decision == Factory_Flow::FlowDecision.EnterRecovery &
              authorization.reason == Factory_Flow::DecisionReason.RecoveryEntered &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.RecoveryEntered;

          // @trace CASE-09
          case C09FailAfterRetry "A correlated retry failure terminates without another retry":
            assume intentFact.kind == Factory_Flow::IntentKind.ActiveIntent &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.RetryFailure;
            guarantee authorization.decision == Factory_Flow::FlowDecision.FailTerminal &
              authorization.reason == Factory_Flow::DecisionReason.Failed &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.Failed;

          // @trace CASE-10
          case C10ReleaseTransfer "Ready held successor releases transfer despite competitors":
            assume intentFact.kind == Factory_Flow::IntentKind.TransferIntent &
              targetReady(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.ReleaseTransfer &
              authorization.reason == Factory_Flow::DecisionReason.TransferReleased &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.TransferReleased;

          // @trace CASE-11
          case C11WaitTransfer "Blocked or unknown held successor preserves transfer":
            assume intentFact.kind == Factory_Flow::IntentKind.TransferIntent &
              not targetReady(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.WaitTransfer &
              authorization.reason == Factory_Flow::DecisionReason.TransferWaiting &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.TransferWaiting;

          // @trace CASE-12
          case C12RetryStoredWork "Ready recovery selects stored work over any fresh competitor":
            assume intentFact.kind == Factory_Flow::IntentKind.RecoveryIntent &
              targetReady(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.RetryNow &
              authorization.reason == Factory_Flow::DecisionReason.RecoveryReleased &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.RecoveryReleased;

          // @trace CASE-13
          case C13WaitRecovery "Blocked or unknown recovery preserves stored work":
            assume intentFact.kind == Factory_Flow::IntentKind.RecoveryIntent &
              not targetReady(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.WaitRecovery &
              authorization.reason == Factory_Flow::DecisionReason.RecoveryWaiting &
              authorization.work_id == intentFact.work_id &
              authorization.step == intentFact.step &
              reasonToStatus == Factory_Flow::DecisionReason.RecoveryWaiting;

          // @trace CASE-14
          case C14IdleNoRequest "Idle no-request remains empty":
            assume intentFact.kind == Factory_Flow::IntentKind.NoIntent &
              intentFact.assessment == Factory_Flow::AdmissionAssessment.NoRequest;
            guarantee authorization.decision == Factory_Flow::FlowDecision.IdleNoRequest &
              authorization.reason == Factory_Flow::DecisionReason.NoRequest &
              authorization.work_id == Factory_Flow::WorkId.NoWork &
              authorization.step == 0[s32] &
              reasonToStatus == Factory_Flow::DecisionReason.NoRequest;

          // @trace CASE-15
          case C15RejectMalformed "Idle malformed request is rejected":
            assume intentFact.kind == Factory_Flow::IntentKind.NoIntent &
              intentFact.assessment == Factory_Flow::AdmissionAssessment.Malformed;
            guarantee authorization.decision == Factory_Flow::FlowDecision.RejectMalformed &
              authorization.reason == Factory_Flow::DecisionReason.MalformedRequest &
              authorization.work_id == Factory_Flow::WorkId.NoWork &
              authorization.step == 0[s32] &
              reasonToStatus == Factory_Flow::DecisionReason.MalformedRequest;

          // @trace CASE-16
          case C16WaitMaterialUnavailable "Eligible work waits for correlated unavailable material":
            assume intentFact.kind == Factory_Flow::IntentKind.FreshIntent &
              materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialUnavailable;
            guarantee authorization.decision == Factory_Flow::FlowDecision.WaitMaterialUnavailable &
              authorization.reason == Factory_Flow::DecisionReason.MaterialUnavailable &
              authorization.work_id == intentFact.work_id &
              authorization.step == 0[s32] &
              reasonToStatus == Factory_Flow::DecisionReason.MaterialUnavailable;

          // @trace CASE-17
          case C17WaitMaterialUnknown "Eligible work waits for invalid or mismatched material":
            assume intentFact.kind == Factory_Flow::IntentKind.FreshIntent &
              materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialUnknown;
            guarantee authorization.decision == Factory_Flow::FlowDecision.WaitMaterialUnknown &
              authorization.reason == Factory_Flow::DecisionReason.MaterialUnknown &
              authorization.work_id == intentFact.work_id &
              authorization.step == 0[s32] &
              reasonToStatus == Factory_Flow::DecisionReason.MaterialUnknown;

          // @trace CASE-18
          case C18WaitHeatingBlocked "Qualified material with blocked heating waits for station":
            assume intentFact.kind == Factory_Flow::IntentKind.FreshIntent &
              materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialReady &
              targetBlocked(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.WaitHeatingBlocked &
              authorization.reason == Factory_Flow::DecisionReason.HeatingBlocked &
              authorization.work_id == intentFact.work_id &
              authorization.step == 0[s32] &
              reasonToStatus == Factory_Flow::DecisionReason.HeatingBlocked;

          // @trace CASE-19
          case C19WaitHeatingUnknown "Qualified material with invalid or mismatched heating readiness waits":
            assume intentFact.kind == Factory_Flow::IntentKind.FreshIntent &
              materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialReady &
              targetUnknown(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.WaitHeatingUnknown &
              authorization.reason == Factory_Flow::DecisionReason.HeatingUnknown &
              authorization.work_id == intentFact.work_id &
              authorization.step == 0[s32] &
              reasonToStatus == Factory_Flow::DecisionReason.HeatingUnknown;

          // @trace CASE-20
          case C20StartWork "Eligible correlated work starts only with material and heating ready":
            assume intentFact.kind == Factory_Flow::IntentKind.FreshIntent &
              materialFact.assessment == Factory_Flow::MaterialAssessment.MaterialReady &
              targetReady(targetFact);
            guarantee authorization.decision == Factory_Flow::FlowDecision.StartWork &
              authorization.reason == Factory_Flow::DecisionReason.Started &
              authorization.work_id == intentFact.work_id &
              authorization.step == 0[s32] &
              reasonToStatus == Factory_Flow::DecisionReason.Started;
    }*/
  }

  // @trace PART-07
  part def FlowLedger :> Thread {
    // @trace INT-11
    port authorization : DataPort { in :>> type : AuthorizationFact; }
    // @trace INT-12
    port contextToReadiness : DataPort { out :>> type : FlowContext; }
    // @trace INT-13
    port contextToOutcome : DataPort { out :>> type : FlowContext; }
    // @trace INT-14
    port protectionContext : DataPort { out :>> type : ProtectionContext; }
    // @trace INT-17
    port snapshotToOutcome : DataPort { out :>> type : FlowSnapshot; }
    // @trace INT-18
    port snapshotToStatus : DataPort { out :>> type : FlowSnapshot; }
    // @trace INT-19
    port lineCommand : DataPort { out :>> type : LineFlowCommand; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        phase: Factory_Flow::LedgerPhase;
        // @trace STATE-01
        activeWork: Factory_Flow::WorkId;
        // @trace STATE-01
        activeStep: Factory_Flow::FlowStep;
        // @trace STATE-01
        attempt: Factory_Flow::AttemptKind;

      functions
        // @trace POL-01
        def successor(step: Factory_Flow::FlowStep): Factory_Flow::FlowStep :=
          if (step == Factory_Flow::FlowStep.Heating)? Factory_Flow::FlowStep.Bending
          else if (step == Factory_Flow::FlowStep.Bending)? Factory_Flow::FlowStep.Cutting
          else if (step == Factory_Flow::FlowStep.Cutting)? Factory_Flow::FlowStep.Drilling
          else if (step == Factory_Flow::FlowStep.Drilling)? Factory_Flow::FlowStep.Grinding
          else Factory_Flow::FlowStep.Polishing;

        // @trace REP-01
        def stepCode(step: Factory_Flow::FlowStep): Base_Types::Integer_32 :=
          if (step == Factory_Flow::FlowStep.Heating)? 0[s32]
          else if (step == Factory_Flow::FlowStep.Bending)? 1[s32]
          else if (step == Factory_Flow::FlowStep.Cutting)? 2[s32]
          else if (step == Factory_Flow::FlowStep.Drilling)? 3[s32]
          else if (step == Factory_Flow::FlowStep.Grinding)? 4[s32]
          else 5[s32];

      initialize
        // @trace STATE-01
        guarantee SafeLedgerInitialization:
          phase == Factory_Flow::LedgerPhase.Idle &
          activeWork == Factory_Flow::WorkId.NoWork &
          activeStep == Factory_Flow::FlowStep.Heating &
          attempt == Factory_Flow::AttemptKind.First &
          contextToReadiness.phase == Factory_Flow::LedgerPhase.Idle &
          contextToReadiness.work_id == Factory_Flow::WorkId.NoWork &
          contextToReadiness.step_value == 0[s32] &
          contextToReadiness.attempt == Factory_Flow::AttemptKind.First &
          contextToOutcome.phase == Factory_Flow::LedgerPhase.Idle &
          contextToOutcome.work_id == Factory_Flow::WorkId.NoWork &
          contextToOutcome.step_value == 0[s32] &
          contextToOutcome.attempt == Factory_Flow::AttemptKind.First &
          protectionContext.phase == Factory_Flow::LedgerPhase.Idle &
          protectionContext.work_id == Factory_Flow::WorkId.NoWork &
          protectionContext.step_value == 0[s32] &
          protectionContext.attempt == Factory_Flow::AttemptKind.First &
          snapshotToOutcome.phase == Factory_Flow::LedgerPhase.Idle &
          snapshotToOutcome.work_id == Factory_Flow::WorkId.NoWork &
          snapshotToOutcome.step_value == 0[s32] &
          snapshotToOutcome.attempt == Factory_Flow::AttemptKind.First &
          snapshotToStatus.phase == Factory_Flow::LedgerPhase.Idle &
          snapshotToStatus.work_id == Factory_Flow::WorkId.NoWork &
          snapshotToStatus.step_value == 0[s32] &
          snapshotToStatus.attempt == Factory_Flow::AttemptKind.First &
          lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
          lineCommand.work_id == Factory_Flow::WorkId.NoWork &
          lineCommand.step == 0[s32];

      compute
        // Pre-state publications break the apparent feedback paths through state.
        // @trace REP-02
        guarantee PublishPreStateContexts:
          contextToReadiness.phase == In(phase) &
          contextToReadiness.work_id == In(activeWork) &
          contextToReadiness.step_value == stepCode(In(activeStep)) &
          contextToReadiness.attempt == In(attempt) &
          contextToOutcome.phase == In(phase) &
          contextToOutcome.work_id == In(activeWork) &
          contextToOutcome.step_value == stepCode(In(activeStep)) &
          contextToOutcome.attempt == In(attempt) &
          protectionContext.phase == In(phase) &
          protectionContext.work_id == In(activeWork) &
          protectionContext.step_value == stepCode(In(activeStep)) &
          protectionContext.attempt == In(attempt);

        // @trace PART-07
        guarantee PublishAppliedSnapshots:
          snapshotToOutcome.phase == phase &
          snapshotToOutcome.work_id == activeWork &
          snapshotToOutcome.step_value == stepCode(activeStep) &
          snapshotToOutcome.attempt == attempt &
          snapshotToStatus.phase == phase &
          snapshotToStatus.work_id == activeWork &
          snapshotToStatus.step_value == stepCode(activeStep) &
          snapshotToStatus.attempt == attempt;

        compute_cases
          // @trace CASE-01
          case C01ApplyResetComplete "Completion terminal resets unconditionally":
            assume authorization.decision == Factory_Flow::FlowDecision.ResetComplete;
            guarantee phase == Factory_Flow::LedgerPhase.Idle &
              activeWork == Factory_Flow::WorkId.NoWork &
              activeStep == Factory_Flow::FlowStep.Heating &
              attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == Factory_Flow::WorkId.NoWork &
              lineCommand.step == 0[s32];

          // @trace CASE-02
          case C02ApplyResetFailed "Failure terminal resets unconditionally":
            assume authorization.decision == Factory_Flow::FlowDecision.ResetFailed;
            guarantee phase == Factory_Flow::LedgerPhase.Idle &
              activeWork == Factory_Flow::WorkId.NoWork &
              activeStep == Factory_Flow::FlowStep.Heating &
              attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == Factory_Flow::WorkId.NoWork &
              lineCommand.step == 0[s32];

          // @trace CASE-03
          case C03ApplyHoldActive "Processing stutters the complete stored context":
            assume authorization.decision == Factory_Flow::FlowDecision.HoldActive;
            guarantee phase == In(phase) & activeWork == In(activeWork) &
              activeStep == In(activeStep) & attempt == In(attempt) &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-04
          case C04ApplyBusyActive "A fresh competitor cannot change active context":
            assume authorization.decision == Factory_Flow::FlowDecision.BusyActive;
            guarantee phase == In(phase) & activeWork == In(activeWork) &
              activeStep == In(activeStep) & attempt == In(attempt) &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-05
          case C05ApplyComplete "Final completion enters the completion terminal once":
            assume authorization.decision == Factory_Flow::FlowDecision.CompleteProduction;
            guarantee phase == Factory_Flow::LedgerPhase.TerminalComplete &
              activeWork == In(activeWork) & activeStep == In(activeStep) & attempt == In(attempt) &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-06
          case C06ApplyAdvance "The ledger alone applies the explicit successor relation":
            assume authorization.decision == Factory_Flow::FlowDecision.AdvanceNow;
            guarantee phase == Factory_Flow::LedgerPhase.Active &
              activeWork == In(activeWork) & activeStep == successor(In(activeStep)) &
              attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.Advance &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(successor(In(activeStep)));

          // @trace CASE-07
          case C07ApplyHoldTransfer "The held state already names the explicit successor":
            assume authorization.decision == Factory_Flow::FlowDecision.HoldTransfer;
            guarantee phase == Factory_Flow::LedgerPhase.TransferPending &
              activeWork == In(activeWork) & activeStep == successor(In(activeStep)) &
              attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(successor(In(activeStep)));

          // @trace CASE-08
          case C08ApplyEnterRecovery "First failure holds the same step without same-evaluation retry":
            assume authorization.decision == Factory_Flow::FlowDecision.EnterRecovery;
            guarantee phase == Factory_Flow::LedgerPhase.RecoveryPending &
              activeWork == In(activeWork) & activeStep == In(activeStep) &
              attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-09
          case C09ApplyFailure "Retry failure emits one abort and enters terminal failure":
            assume authorization.decision == Factory_Flow::FlowDecision.FailTerminal;
            guarantee phase == Factory_Flow::LedgerPhase.TerminalFailed &
              activeWork == In(activeWork) & activeStep == In(activeStep) &
              attempt == Factory_Flow::AttemptKind.Retry &
              lineCommand.action_kind == Factory_Flow::CommandAction.Abort &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-10
          case C10ApplyReleaseTransfer "Ready held successor advances the stored work":
            assume authorization.decision == Factory_Flow::FlowDecision.ReleaseTransfer;
            guarantee phase == Factory_Flow::LedgerPhase.Active &
              activeWork == In(activeWork) & activeStep == In(activeStep) &
              attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.Advance &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-11
          case C11ApplyWaitTransfer "Unready held successor preserves transfer context":
            assume authorization.decision == Factory_Flow::FlowDecision.WaitTransfer;
            guarantee phase == In(phase) & activeWork == In(activeWork) &
              activeStep == In(activeStep) & attempt == In(attempt) &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-12
          case C12ApplyRetry "Recovery release retries stored work and records the sole retry":
            assume authorization.decision == Factory_Flow::FlowDecision.RetryNow;
            guarantee phase == Factory_Flow::LedgerPhase.Active &
              activeWork == In(activeWork) & activeStep == In(activeStep) &
              attempt == Factory_Flow::AttemptKind.Retry &
              lineCommand.action_kind == Factory_Flow::CommandAction.Retry &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-13
          case C13ApplyWaitRecovery "Unready recovery preserves stored identity and step":
            assume authorization.decision == Factory_Flow::FlowDecision.WaitRecovery;
            guarantee phase == In(phase) & activeWork == In(activeWork) &
              activeStep == In(activeStep) & attempt == In(attempt) &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == In(activeWork) & lineCommand.step == stepCode(In(activeStep));

          // @trace CASE-14
          case C14ApplyIdle "No request preserves canonical empty idle state":
            assume authorization.decision == Factory_Flow::FlowDecision.IdleNoRequest;
            guarantee phase == Factory_Flow::LedgerPhase.Idle & activeWork == Factory_Flow::WorkId.NoWork &
              activeStep == Factory_Flow::FlowStep.Heating & attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == Factory_Flow::WorkId.NoWork & lineCommand.step == 0[s32];

          // @trace CASE-15
          case C15ApplyReject "Malformed request cannot populate idle state":
            assume authorization.decision == Factory_Flow::FlowDecision.RejectMalformed;
            guarantee phase == Factory_Flow::LedgerPhase.Idle & activeWork == Factory_Flow::WorkId.NoWork &
              activeStep == Factory_Flow::FlowStep.Heating & attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == Factory_Flow::WorkId.NoWork & lineCommand.step == 0[s32];

          // @trace CASE-16
          case C16ApplyMaterialUnavailableWait "Unavailable material cannot populate idle state":
            assume authorization.decision == Factory_Flow::FlowDecision.WaitMaterialUnavailable;
            guarantee phase == Factory_Flow::LedgerPhase.Idle & activeWork == Factory_Flow::WorkId.NoWork &
              activeStep == Factory_Flow::FlowStep.Heating & attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == Factory_Flow::WorkId.NoWork & lineCommand.step == 0[s32];

          // @trace CASE-17
          case C17ApplyMaterialUnknownWait "Unknown material cannot populate idle state":
            assume authorization.decision == Factory_Flow::FlowDecision.WaitMaterialUnknown;
            guarantee phase == Factory_Flow::LedgerPhase.Idle & activeWork == Factory_Flow::WorkId.NoWork &
              activeStep == Factory_Flow::FlowStep.Heating & attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == Factory_Flow::WorkId.NoWork & lineCommand.step == 0[s32];

          // @trace CASE-18
          case C18ApplyHeatingBlockedWait "Blocked heating cannot populate idle state":
            assume authorization.decision == Factory_Flow::FlowDecision.WaitHeatingBlocked;
            guarantee phase == Factory_Flow::LedgerPhase.Idle & activeWork == Factory_Flow::WorkId.NoWork &
              activeStep == Factory_Flow::FlowStep.Heating & attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == Factory_Flow::WorkId.NoWork & lineCommand.step == 0[s32];

          // @trace CASE-19
          case C19ApplyHeatingUnknownWait "Unknown heating readiness cannot populate idle state":
            assume authorization.decision == Factory_Flow::FlowDecision.WaitHeatingUnknown;
            guarantee phase == Factory_Flow::LedgerPhase.Idle & activeWork == Factory_Flow::WorkId.NoWork &
              activeStep == Factory_Flow::FlowStep.Heating & attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.NoCommand &
              lineCommand.work_id == Factory_Flow::WorkId.NoWork & lineCommand.step == 0[s32];

          // @trace CASE-20
          case C20ApplyStart "A qualified fresh work item starts at heating":
            assume authorization.decision == Factory_Flow::FlowDecision.StartWork;
            guarantee phase == Factory_Flow::LedgerPhase.Active &
              activeWork == authorization.work_id &
              activeStep == Factory_Flow::FlowStep.Heating &
              attempt == Factory_Flow::AttemptKind.First &
              lineCommand.action_kind == Factory_Flow::CommandAction.Start &
              lineCommand.work_id == authorization.work_id &
              lineCommand.step == 0[s32];
    }*/
  }

  // @trace PART-08
  part def ProductionOutcomeDeterminer :> Thread {
    // @trace INT-15
    port outcomeFact : DataPort { in :>> type : OutcomeFact; }
    // @trace INT-17
    port appliedSnapshot : DataPort { in :>> type : FlowSnapshot; }
    // @trace INT-20
    port productionOutcome : DataPort { out :>> type : ProductionOutcome; }

    language "GUMBO" /*{
      initialize
        // @trace CTRL-02
        guarantee SafeOutcomeOutputInitialization:
          productionOutcome.result == Factory_Flow::ProductionResult.None &
          productionOutcome.work_id == Factory_Flow::WorkId.NoWork;

      compute
        compute_cases
          // @trace CASE-05
          case CompletionEntry "Only correlated final completion plus applied terminal completion emits success":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.TerminalComplete &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.FinalCompleted;
            guarantee productionOutcome.result == Factory_Flow::ProductionResult.ProductionComplete &
              productionOutcome.work_id == appliedSnapshot.work_id;

          // @trace CASE-09
          case FailureEntry "Only correlated retry failure plus applied terminal failure emits failure":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.TerminalFailed &
              outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.RetryFailure;
            guarantee productionOutcome.result == Factory_Flow::ProductionResult.ProductionFailed &
              productionOutcome.work_id == appliedSnapshot.work_id;

          // @trace POL-06
          case SuppressNonterminalAndReset "All nonterminal and reset valuations suppress terminal outcome":
            assume not (appliedSnapshot.phase == Factory_Flow::LedgerPhase.TerminalComplete &
                        outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.FinalCompleted) &
              not (appliedSnapshot.phase == Factory_Flow::LedgerPhase.TerminalFailed &
                   outcomeFact.plan == Factory_Flow::CorrelatedOutcomePlan.RetryFailure);
            guarantee productionOutcome.result == Factory_Flow::ProductionResult.None &
              productionOutcome.work_id == Factory_Flow::WorkId.NoWork;
    }*/
  }

  // @trace PART-09
  part def FlowStatusDeterminer :> Thread {
    // @trace INT-16
    port decisionReason : DataPort { in :>> type : DecisionReason; }
    // @trace INT-18
    port appliedSnapshot : DataPort { in :>> type : FlowSnapshot; }
    // @trace INT-21
    port flowStatus : DataPort { out :>> type : ProductionFlowStatus; }

    language "GUMBO" /*{
      initialize
        // @trace CTRL-03
        guarantee SafeStatusInitialization:
          flowStatus == Factory_Flow::ProductionFlowStatus.Idle;

      compute
        compute_cases
          // @trace CASE-05
          case TerminalCompleteStatus "Applied completion terminal has highest completion precedence":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.TerminalComplete;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Completed;

          // @trace CASE-09
          case TerminalFailedStatus "Applied failure terminal has highest failure precedence":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.TerminalFailed;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Failed;

          // @trace CASE-08
          case RecoveryPendingStatus "Entering or waiting in recovery is externally recovering":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.RecoveryPending;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Recovering;

          // @trace CASE-12
          case RetryReleasedStatus "A released retry remains externally recovering":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Active &
              decisionReason == Factory_Flow::DecisionReason.RecoveryReleased;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Recovering;

          // @trace CASE-07
          case TransferPendingStatus "Any held successor is externally waiting for station":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.TransferPending;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.WaitingStation;

          // @trace CASE-15
          case RejectedStatus "Malformed idle admission is externally rejected":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Idle &
              decisionReason == Factory_Flow::DecisionReason.MalformedRequest;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Rejected;

          // @trace CASE-16
          case MaterialWaitStatus "Unavailable and unknown material share public material-wait status":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Idle &
              (decisionReason == Factory_Flow::DecisionReason.MaterialUnavailable |
               decisionReason == Factory_Flow::DecisionReason.MaterialUnknown);
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.WaitingMaterial;

          // @trace CASE-18
          case HeatingWaitStatus "Blocked and unknown heating readiness share public station-wait status":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Idle &
              (decisionReason == Factory_Flow::DecisionReason.HeatingBlocked |
               decisionReason == Factory_Flow::DecisionReason.HeatingUnknown);
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.WaitingStation;

          // @trace CASE-20
          case StartedStatus "Fresh start combines applied active state with the started reason":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Active &
              decisionReason == Factory_Flow::DecisionReason.Started;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Started;

          // @trace CASE-06
          case AdvancedStatus "Immediate and held transfer releases are externally advanced":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Active &
              (decisionReason == Factory_Flow::DecisionReason.Advanced |
               decisionReason == Factory_Flow::DecisionReason.TransferReleased);
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Advanced;

          // @trace CASE-04
          case BusyStatus "Protected active work plus competitor reports busy":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Active &
              decisionReason == Factory_Flow::DecisionReason.ProtectedBusy;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Busy;

          // @trace CASE-03
          case ProcessingStatus "Active preserved work without competitor reports processing":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Active &
              decisionReason == Factory_Flow::DecisionReason.Processing;
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Processing;

          // @trace CASE-14
          case IdleStatus "No-request and terminal-reset reasons combine with applied idle state":
            assume appliedSnapshot.phase == Factory_Flow::LedgerPhase.Idle &
              (decisionReason == Factory_Flow::DecisionReason.NoRequest |
               decisionReason == Factory_Flow::DecisionReason.ResetComplete |
               decisionReason == Factory_Flow::DecisionReason.ResetFailed);
            guarantee flowStatus == Factory_Flow::ProductionFlowStatus.Idle;
    }*/
  }

  // Behavior-free generated support permitted by SUPPORT-01.
  // @generated-support SUPPORT-01 containment and seven unchanged boundary routes
  part def FlowSupervisorProcess :> Process {
    // @trace MON-01
    port presentedWork : DataPort { in :>> type : PresentedWorkRequest; }
    // @trace MON-02
    port materialObservation : DataPort { in :>> type : MaterialHandoffObservation; }
    // @trace MON-03
    port readinessObservation : DataPort { in :>> type : StepReadinessObservation; }
    // @trace MON-04
    port processResult : DataPort { in :>> type : ProcessResultObservation; }
    // @trace CTRL-01
    port lineCommand : DataPort { out :>> type : LineFlowCommand; }
    // @trace CTRL-02
    port productionOutcome : DataPort { out :>> type : ProductionOutcome; }
    // @trace CTRL-03
    port flowStatus : DataPort { out :>> type : ProductionFlowStatus; }

    // @trace PART-01
    part workRequestQualifier : WorkRequestQualifier;
    // @trace PART-02
    part materialCorrelationQualifier : MaterialCorrelationQualifier;
    // @trace PART-03
    part targetStepReadinessQualifier : TargetStepReadinessQualifier;
    // @trace PART-04
    part processOutcomeCorrelator : ProcessOutcomeCorrelator;
    // @trace PART-05
    part protectedWorkPriorityResolver : ProtectedWorkPriorityResolver;
    // @trace PART-06
    part flowAuthorizationOwner : FlowAuthorizationOwner;
    // @trace PART-07
    part flowLedger : FlowLedger;
    // @trace PART-08
    part productionOutcomeDeterminer : ProductionOutcomeDeterminer;
    // @trace PART-09
    part flowStatusDeterminer : FlowStatusDeterminer;

    // Four semantic boundary-input deliveries.
    // @trace INT-01
    connection int01 : PortConnection
      connect presentedWork to workRequestQualifier.presentedWork;
    // @trace INT-02
    connection int02 : PortConnection
      connect materialObservation to materialCorrelationQualifier.materialObservation;
    // @trace INT-03
    connection int03 : PortConnection
      connect readinessObservation to targetStepReadinessQualifier.readinessObservation;
    // @trace INT-04
    connection int04 : PortConnection
      connect processResult to processOutcomeCorrelator.processResult;

    // Fourteen responsibility-bearing internal interactions.
    // @trace INT-05
    connection int05 : PortConnection
      connect workRequestQualifier.admissionToMaterial to materialCorrelationQualifier.admission;
    // @trace INT-06
    connection int06 : PortConnection
      connect workRequestQualifier.admissionToPriority to protectedWorkPriorityResolver.admission;
    // @trace INT-07
    connection int07 : PortConnection
      connect materialCorrelationQualifier.materialFact to flowAuthorizationOwner.materialFact;
    // @trace INT-08
    connection int08 : PortConnection
      connect targetStepReadinessQualifier.targetFact to flowAuthorizationOwner.targetFact;
    // @trace INT-09
    connection int09 : PortConnection
      connect processOutcomeCorrelator.outcomeToAuthorization to flowAuthorizationOwner.outcomeFact;
    // @trace INT-10
    connection int10 : PortConnection
      connect protectedWorkPriorityResolver.intentFact to flowAuthorizationOwner.intentFact;
    // @trace INT-11
    connection int11 : PortConnection
      connect flowAuthorizationOwner.authorization to flowLedger.authorization;
    // @trace INT-12
    connection int12 : PortConnection
      connect flowLedger.contextToReadiness to targetStepReadinessQualifier.flowContext;
    // @trace INT-13
    connection int13 : PortConnection
      connect flowLedger.contextToOutcome to processOutcomeCorrelator.flowContext;
    // @trace INT-14
    connection int14 : PortConnection
      connect flowLedger.protectionContext to protectedWorkPriorityResolver.protectionContext;
    // @trace INT-15
    connection int15 : PortConnection
      connect processOutcomeCorrelator.outcomeToDeterminer to productionOutcomeDeterminer.outcomeFact;
    // @trace INT-16
    connection int16 : PortConnection
      connect flowAuthorizationOwner.reasonToStatus to flowStatusDeterminer.decisionReason;
    // @trace INT-17
    connection int17 : PortConnection
      connect flowLedger.snapshotToOutcome to productionOutcomeDeterminer.appliedSnapshot;
    // @trace INT-18
    connection int18 : PortConnection
      connect flowLedger.snapshotToStatus to flowStatusDeterminer.appliedSnapshot;

    // Three semantic boundary-output deliveries.
    // @trace INT-19
    connection int19 : PortConnection
      connect flowLedger.lineCommand to lineCommand;
    // @trace INT-20
    connection int20 : PortConnection
      connect productionOutcomeDeterminer.productionOutcome to productionOutcome;
    // @trace INT-21
    connection int21 : PortConnection
      connect flowStatusDeterminer.flowStatus to flowStatus;
  }

  // @trace ARCH-SEL-01
  part def FactoryFlowSupervisor :> System {
    // @trace MON-01
    port presentedWork : DataPort { in :>> type : PresentedWorkRequest; }
    // @trace MON-02
    port materialObservation : DataPort { in :>> type : MaterialHandoffObservation; }
    // @trace MON-03
    port readinessObservation : DataPort { in :>> type : StepReadinessObservation; }
    // @trace MON-04
    port processResult : DataPort { in :>> type : ProcessResultObservation; }
    // @trace CTRL-01
    port lineCommand : DataPort { out :>> type : LineFlowCommand; }
    // @trace CTRL-02
    port productionOutcome : DataPort { out :>> type : ProductionOutcome; }
    // @trace CTRL-03
    port flowStatus : DataPort { out :>> type : ProductionFlowStatus; }

    // @generated-support STRUCT-01 sole support Process usage
    part supervisorProcess : FlowSupervisorProcess;

    // Seven unchanged generated-support delegations; excluded from INT-01..INT-21.
    // @generated-support SUPPORT-01 PresentedWorkRequest delegation
    connection support01 : PortConnection
      connect presentedWork to supervisorProcess.presentedWork;
    // @generated-support SUPPORT-01 MaterialHandoffObservation delegation
    connection support02 : PortConnection
      connect materialObservation to supervisorProcess.materialObservation;
    // @generated-support SUPPORT-01 StepReadinessObservation delegation
    connection support03 : PortConnection
      connect readinessObservation to supervisorProcess.readinessObservation;
    // @generated-support SUPPORT-01 ProcessResultObservation delegation
    connection support04 : PortConnection
      connect processResult to supervisorProcess.processResult;
    // @generated-support SUPPORT-01 LineFlowCommand delegation
    connection support05 : PortConnection
      connect supervisorProcess.lineCommand to lineCommand;
    // @generated-support SUPPORT-01 ProductionOutcome delegation
    connection support06 : PortConnection
      connect supervisorProcess.productionOutcome to productionOutcome;
    // @generated-support SUPPORT-01 ProductionFlowStatus delegation
    connection support07 : PortConnection
      connect supervisorProcess.flowStatus to flowStatus;
  }

  // The one explicit generated root System usage.
  // @trace STRUCT-01
  part factoryFlowSupervisor : FactoryFlowSupervisor;
}
