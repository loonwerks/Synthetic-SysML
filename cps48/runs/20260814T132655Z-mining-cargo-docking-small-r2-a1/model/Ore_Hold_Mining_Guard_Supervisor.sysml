// Canonical source for immutable run 20260814T132655Z-mining-cargo-docking-small-r2-a1.

// @trace PURPOSE-01
package Ore_Hold_Mining_Guard_Supervisor {
  private import HAMR::*;

  // @trace TYPE-01
  enum def InputStatus { enum Valid; enum Invalid; }
  // @trace TYPE-03
  enum def HoldObservation { enum RoomAvailable; enum NearlyFull; }
  // @trace TYPE-04
  enum def AsteroidCondition { enum OreAvailable; enum Depleted; }
  // @trace TYPE-04
  enum def LaserCondition { enum Ready; enum Overheated; }
  // @trace TYPE-04
  enum def TargetCondition { enum Locked; enum Interfered; }
  // @trace TYPE-06
  enum def RequestDisposition {
    enum InvalidRequest; enum HaltDominant; enum FreshResume;
    enum FreshStart; enum NoFreshRequest;
  }
  // @trace TYPE-07
  enum def HoldAssessment { enum SpaceAvailable; enum GuardReached; enum InvalidHold; }
  // @trace TYPE-07
  enum def SupportAssessment { enum SupportReady; enum SupportBlocked; enum InvalidSupport; }
  // @trace TYPE-08
  enum def GuardMode { enum Idle; enum Mining; enum CapacityHold; enum ConditionHold; enum RecoveryReady; }
  // @trace TYPE-09
  enum def ResolutionReason {
    enum HaltSelected; enum InvalidEvidence; enum HoldGuardReached;
    enum SupportUnavailable; enum StartAdmitted; enum IdleWaiting;
    enum MiningMaintained; enum GuardCleared; enum EvidenceRestored;
    enum ResumeAdmitted; enum RecoveryWaiting;
  }
  // @trace TYPE-10
  enum def MiningCommand { enum StopMining; enum ContinueMining; }
  // @trace TYPE-10
  enum def GuardStatus {
    enum Idle; enum MiningAuthorized; enum HaltedByPilot; enum GuardedNearlyFull;
    enum HeldForSupport; enum InputFault; enum AwaitingFreshResume; enum RequestConflict;
  }
  // @trace TYPE-10
  enum def OffloadReadiness { enum NotReadyForOffload; enum ReadyForLaterOffload; }

  // Every record member inspected by GUMBO is an attribute.
  // @trace TYPE-02
  part def PilotRequestSample :> Data {
    attribute start : Base_Types::Boolean;
    attribute halt : Base_Types::Boolean;
    attribute resume : Base_Types::Boolean;
    attribute status : InputStatus;
  }
  // @trace TYPE-03
  part def HoldSample :> Data {
    attribute observation : HoldObservation;
    attribute status : InputStatus;
  }
  // @trace TYPE-05
  part def MiningSupportSample :> Data {
    attribute asteroid : AsteroidCondition;
    attribute laser : LaserCondition;
    attribute target : TargetCondition;
    attribute status : InputStatus;
  }
  // @trace TYPE-06
  part def RequestAssessment :> Data {
    attribute disposition : RequestDisposition;
    attribute conflict : Base_Types::Boolean;
  }
  // @trace TYPE-09
  part def GuardResolution :> Data {
    attribute nextMode : GuardMode;
    attribute reason : ResolutionReason;
    attribute requestConflict : Base_Types::Boolean;
  }

  // @trace PART-01
  part def RequestFreshnessPriorityOwner :> Thread {
    // @trace INT-01
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    // @trace INT-04
    port request_assessment : DataPort { out :>> type : RequestAssessment; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        previousStart: Base_Types::Boolean;
        // @trace STATE-01
        previousHalt: Base_Types::Boolean;
        // @trace STATE-01
        previousResume: Base_Types::Boolean;
      initialize
        modifies previousStart, previousHalt, previousResume;
        // @trace INIT-01
        guarantee INITIAL_REQUEST_OWNER_SAFE:
          previousStart == F & previousHalt == F & previousResume == F &
          request_assessment.disposition == RequestDisposition.InvalidRequest &
          request_assessment.conflict == F;
      compute
        modifies previousStart, previousHalt, previousResume;
        // @trace QUAL-REQ-01
        guarantee REQUEST_QUALIFICATION_PRIORITY_AND_FRESHNESS:
          ((pilot_request.status == InputStatus.Invalid &
            request_assessment.disposition == RequestDisposition.InvalidRequest &
            request_assessment.conflict == F) |
           (pilot_request.status == InputStatus.Valid &
            (request_assessment.conflict ==
              ((pilot_request.start & pilot_request.halt) |
               (pilot_request.start & pilot_request.resume) |
               (pilot_request.halt & pilot_request.resume))) &
            ((pilot_request.halt &
              request_assessment.disposition == RequestDisposition.HaltDominant) |
             (not pilot_request.halt & pilot_request.resume & not In(previousResume) &
              request_assessment.disposition == RequestDisposition.FreshResume) |
             (not pilot_request.halt &
              (not pilot_request.resume | In(previousResume)) &
              pilot_request.start & not In(previousStart) &
              request_assessment.disposition == RequestDisposition.FreshStart) |
             (not pilot_request.halt &
              (not pilot_request.resume | In(previousResume)) &
              (not pilot_request.start | In(previousStart)) &
              request_assessment.disposition == RequestDisposition.NoFreshRequest)))) &
          previousStart == pilot_request.start &
          previousHalt == pilot_request.halt &
          previousResume == pilot_request.resume;
    }*/
  }

  // @trace PART-02
  part def HoldGuardQualificationOwner :> Thread {
    // @trace INT-02
    port hold_sample : DataPort { in :>> type : HoldSample; }
    // @trace INT-05
    port hold_assessment : DataPort { out :>> type : HoldAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_HOLD_ASSESSMENT_SAFE:
          hold_assessment == HoldAssessment.InvalidHold;
      compute
        // @trace QUAL-HOLD-01
        guarantee HOLD_GUARD_QUALIFICATION:
          ((hold_sample.status == InputStatus.Invalid &
            hold_assessment == HoldAssessment.InvalidHold) |
           (hold_sample.status == InputStatus.Valid &
            hold_sample.observation == HoldObservation.RoomAvailable &
            hold_assessment == HoldAssessment.SpaceAvailable) |
           (hold_sample.status == InputStatus.Valid &
            hold_sample.observation == HoldObservation.NearlyFull &
            hold_assessment == HoldAssessment.GuardReached));
    }*/
  }

  // @trace PART-03
  part def MiningSupportQualificationOwner :> Thread {
    // @trace INT-03
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    // @trace INT-06
    port support_assessment : DataPort { out :>> type : SupportAssessment; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_SUPPORT_ASSESSMENT_SAFE:
          support_assessment == SupportAssessment.InvalidSupport;
      compute
        // @trace QUAL-SUPPORT-01
        guarantee MINING_SUPPORT_QUALIFICATION:
          ((mining_support.status == InputStatus.Invalid &
            support_assessment == SupportAssessment.InvalidSupport) |
           (mining_support.status == InputStatus.Valid &
            mining_support.asteroid == AsteroidCondition.OreAvailable &
            mining_support.laser == LaserCondition.Ready &
            mining_support.target == TargetCondition.Locked &
            support_assessment == SupportAssessment.SupportReady) |
           (mining_support.status == InputStatus.Valid &
            (mining_support.asteroid != AsteroidCondition.OreAvailable |
             mining_support.laser != LaserCondition.Ready |
             mining_support.target != TargetCondition.Locked) &
            support_assessment == SupportAssessment.SupportBlocked));
    }*/
  }

  // @trace PART-04
  part def OreHoldDecisionOwner :> Thread {
    // @trace INT-04
    port request_assessment : DataPort { in :>> type : RequestAssessment; }
    // @trace INT-05
    port hold_assessment : DataPort { in :>> type : HoldAssessment; }
    // @trace INT-06
    port support_assessment : DataPort { in :>> type : SupportAssessment; }
    // @trace INT-07
    port resolution_to_command : DataPort { out :>> type : GuardResolution; }
    // @trace INT-08
    port resolution_to_reporting : DataPort { out :>> type : GuardResolution; }

    language "GUMBO" /*{
      state
        // @trace STATE-02
        guardMode: GuardMode;
      initialize
        modifies guardMode;
        // @trace INIT-01
        guarantee INITIAL_DECISION_SAFE:
          guardMode == GuardMode.Idle &
          resolution_to_command.nextMode == GuardMode.Idle &
          resolution_to_command.reason == ResolutionReason.IdleWaiting &
          resolution_to_command.requestConflict == F &
          resolution_to_reporting.nextMode == GuardMode.Idle &
          resolution_to_reporting.reason == ResolutionReason.IdleWaiting &
          resolution_to_reporting.requestConflict == F;
      compute
        modifies guardMode;
        compute_cases
          // @trace CASE-01
          case INVALID_ASSESSMENT "Any invalid assessment fails closed before every lower-priority case":
            assume request_assessment.disposition == RequestDisposition.InvalidRequest |
                   hold_assessment == HoldAssessment.InvalidHold |
                   support_assessment == SupportAssessment.InvalidSupport;
            guarantee guardMode == GuardMode.ConditionHold &
              resolution_to_command.nextMode == GuardMode.ConditionHold &
              resolution_to_command.reason == ResolutionReason.InvalidEvidence &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.ConditionHold &
              resolution_to_reporting.reason == ResolutionReason.InvalidEvidence &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-02
          case HALT_DOMINANT "A valid level-sensitive halt abandons every current mode to Idle":
            assume request_assessment.disposition != RequestDisposition.InvalidRequest &
                   hold_assessment != HoldAssessment.InvalidHold &
                   support_assessment != SupportAssessment.InvalidSupport &
                   request_assessment.disposition == RequestDisposition.HaltDominant;
            guarantee guardMode == GuardMode.Idle &
              resolution_to_command.nextMode == GuardMode.Idle &
              resolution_to_command.reason == ResolutionReason.HaltSelected &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.Idle &
              resolution_to_reporting.reason == ResolutionReason.HaltSelected &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-03
          case HOLD_GUARD_REACHED "The valid nearly-full guard outranks support blockage":
            assume request_assessment.disposition != RequestDisposition.InvalidRequest &
                   hold_assessment != HoldAssessment.InvalidHold &
                   support_assessment != SupportAssessment.InvalidSupport &
                   request_assessment.disposition != RequestDisposition.HaltDominant &
                   hold_assessment == HoldAssessment.GuardReached;
            guarantee guardMode == GuardMode.CapacityHold &
              resolution_to_command.nextMode == GuardMode.CapacityHold &
              resolution_to_command.reason == ResolutionReason.HoldGuardReached &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.CapacityHold &
              resolution_to_reporting.reason == ResolutionReason.HoldGuardReached &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-04
          case SUPPORT_UNAVAILABLE "Valid unavailable support protects after higher-priority exclusions":
            assume request_assessment.disposition != RequestDisposition.InvalidRequest &
                   hold_assessment == HoldAssessment.SpaceAvailable &
                   support_assessment == SupportAssessment.SupportBlocked &
                   request_assessment.disposition != RequestDisposition.HaltDominant;
            guarantee guardMode == GuardMode.ConditionHold &
              resolution_to_command.nextMode == GuardMode.ConditionHold &
              resolution_to_command.reason == ResolutionReason.SupportUnavailable &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.ConditionHold &
              resolution_to_reporting.reason == ResolutionReason.SupportUnavailable &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-05
          case FRESH_START_ADMITTED "Idle admits only a fresh start under acceptable evidence":
            assume request_assessment.disposition == RequestDisposition.FreshStart &
                   hold_assessment == HoldAssessment.SpaceAvailable &
                   support_assessment == SupportAssessment.SupportReady &
                   In(guardMode) == GuardMode.Idle;
            guarantee guardMode == GuardMode.Mining &
              resolution_to_command.nextMode == GuardMode.Mining &
              resolution_to_command.reason == ResolutionReason.StartAdmitted &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.Mining &
              resolution_to_reporting.reason == ResolutionReason.StartAdmitted &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-06
          case IDLE_WAITING "Idle rejects resume and no-fresh-request dispositions":
            assume request_assessment.disposition != RequestDisposition.InvalidRequest &
                   request_assessment.disposition != RequestDisposition.HaltDominant &
                   request_assessment.disposition != RequestDisposition.FreshStart &
                   hold_assessment == HoldAssessment.SpaceAvailable &
                   support_assessment == SupportAssessment.SupportReady &
                   In(guardMode) == GuardMode.Idle;
            guarantee guardMode == GuardMode.Idle &
              resolution_to_command.nextMode == GuardMode.Idle &
              resolution_to_command.reason == ResolutionReason.IdleWaiting &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.Idle &
              resolution_to_reporting.reason == ResolutionReason.IdleWaiting &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-07
          case MINING_MAINTAINED "Mining persists under acceptable evidence regardless of nonhalt request":
            assume request_assessment.disposition != RequestDisposition.InvalidRequest &
                   request_assessment.disposition != RequestDisposition.HaltDominant &
                   hold_assessment == HoldAssessment.SpaceAvailable &
                   support_assessment == SupportAssessment.SupportReady &
                   In(guardMode) == GuardMode.Mining;
            guarantee guardMode == GuardMode.Mining &
              resolution_to_command.nextMode == GuardMode.Mining &
              resolution_to_command.reason == ResolutionReason.MiningMaintained &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.Mining &
              resolution_to_reporting.reason == ResolutionReason.MiningMaintained &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-08
          case CAPACITY_GUARD_CLEARED "A first acceptable CapacityHold evaluation only establishes recovery readiness":
            assume request_assessment.disposition != RequestDisposition.InvalidRequest &
                   request_assessment.disposition != RequestDisposition.HaltDominant &
                   hold_assessment == HoldAssessment.SpaceAvailable &
                   support_assessment == SupportAssessment.SupportReady &
                   In(guardMode) == GuardMode.CapacityHold;
            guarantee guardMode == GuardMode.RecoveryReady &
              resolution_to_command.nextMode == GuardMode.RecoveryReady &
              resolution_to_command.reason == ResolutionReason.GuardCleared &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.RecoveryReady &
              resolution_to_reporting.reason == ResolutionReason.GuardCleared &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-09
          case CONDITION_EVIDENCE_RESTORED "A first acceptable ConditionHold evaluation only establishes recovery readiness":
            assume request_assessment.disposition != RequestDisposition.InvalidRequest &
                   request_assessment.disposition != RequestDisposition.HaltDominant &
                   hold_assessment == HoldAssessment.SpaceAvailable &
                   support_assessment == SupportAssessment.SupportReady &
                   In(guardMode) == GuardMode.ConditionHold;
            guarantee guardMode == GuardMode.RecoveryReady &
              resolution_to_command.nextMode == GuardMode.RecoveryReady &
              resolution_to_command.reason == ResolutionReason.EvidenceRestored &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.RecoveryReady &
              resolution_to_reporting.reason == ResolutionReason.EvidenceRestored &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-10
          case FRESH_RESUME_ADMITTED "RecoveryReady admits only a later fresh resume":
            assume request_assessment.disposition == RequestDisposition.FreshResume &
                   hold_assessment == HoldAssessment.SpaceAvailable &
                   support_assessment == SupportAssessment.SupportReady &
                   In(guardMode) == GuardMode.RecoveryReady;
            guarantee guardMode == GuardMode.Mining &
              resolution_to_command.nextMode == GuardMode.Mining &
              resolution_to_command.reason == ResolutionReason.ResumeAdmitted &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.Mining &
              resolution_to_reporting.reason == ResolutionReason.ResumeAdmitted &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
          // @trace CASE-11
          case RECOVERY_WAITING "RecoveryReady rejects fresh start and every nonfresh request":
            assume request_assessment.disposition != RequestDisposition.InvalidRequest &
                   request_assessment.disposition != RequestDisposition.HaltDominant &
                   request_assessment.disposition != RequestDisposition.FreshResume &
                   hold_assessment == HoldAssessment.SpaceAvailable &
                   support_assessment == SupportAssessment.SupportReady &
                   In(guardMode) == GuardMode.RecoveryReady;
            guarantee guardMode == GuardMode.RecoveryReady &
              resolution_to_command.nextMode == GuardMode.RecoveryReady &
              resolution_to_command.reason == ResolutionReason.RecoveryWaiting &
              resolution_to_command.requestConflict == request_assessment.conflict &
              resolution_to_reporting.nextMode == GuardMode.RecoveryReady &
              resolution_to_reporting.reason == ResolutionReason.RecoveryWaiting &
              resolution_to_reporting.requestConflict == request_assessment.conflict;
    }*/
  }

  // @trace PART-05
  part def MiningCommandDerivationOwner :> Thread {
    // @trace INT-07
    port guard_resolution : DataPort { in :>> type : GuardResolution; }
    // @trace INT-09
    port mining_command : DataPort { out :>> type : MiningCommand; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_MINING_COMMAND_SAFE:
          mining_command == MiningCommand.StopMining;
      compute
        // @trace OUTPUT-01
        guarantee MINING_COMMAND_EXACT_DERIVATION:
          ((guard_resolution.nextMode == GuardMode.Mining &
            mining_command == MiningCommand.ContinueMining) |
           (guard_resolution.nextMode != GuardMode.Mining &
            mining_command == MiningCommand.StopMining));
    }*/
  }

  // @trace PART-06
  part def GuardReportingDerivationOwner :> Thread {
    // @trace INT-08
    port guard_resolution : DataPort { in :>> type : GuardResolution; }
    // @trace INT-10
    port guard_status : DataPort { out :>> type : GuardStatus; }
    // @trace INT-11
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }

    language "GUMBO" /*{
      initialize
        // @trace INIT-01
        guarantee INITIAL_REPORTING_SAFE:
          guard_status == GuardStatus.Idle &
          offload_readiness == OffloadReadiness.NotReadyForOffload;
      compute
        // @trace OUTPUT-02
        guarantee GUARD_STATUS_EXACT_DERIVATION:
          ((guard_resolution.reason == ResolutionReason.InvalidEvidence &
            guard_status == GuardStatus.InputFault) |
           (guard_resolution.reason == ResolutionReason.HaltSelected &
            guard_status == GuardStatus.HaltedByPilot) |
           (guard_resolution.reason == ResolutionReason.HoldGuardReached &
            guard_status == GuardStatus.GuardedNearlyFull) |
           (guard_resolution.reason == ResolutionReason.SupportUnavailable &
            guard_status == GuardStatus.HeldForSupport) |
           ((guard_resolution.reason == ResolutionReason.StartAdmitted |
             guard_resolution.reason == ResolutionReason.MiningMaintained |
             guard_resolution.reason == ResolutionReason.ResumeAdmitted) &
            guard_status == GuardStatus.MiningAuthorized) |
           ((guard_resolution.reason == ResolutionReason.GuardCleared |
             guard_resolution.reason == ResolutionReason.EvidenceRestored |
             guard_resolution.reason == ResolutionReason.RecoveryWaiting) &
            guard_status == GuardStatus.AwaitingFreshResume) |
           (guard_resolution.reason == ResolutionReason.IdleWaiting &
            guard_resolution.requestConflict &
            guard_status == GuardStatus.RequestConflict) |
           (guard_resolution.reason == ResolutionReason.IdleWaiting &
            not guard_resolution.requestConflict &
            guard_status == GuardStatus.Idle));
        // @trace OUTPUT-03
        guarantee OFFLOAD_READINESS_EXACT_DERIVATION:
          ((guard_resolution.nextMode == GuardMode.CapacityHold &
            offload_readiness == OffloadReadiness.ReadyForLaterOffload) |
           (guard_resolution.nextMode != GuardMode.CapacityHold &
            offload_readiness == OffloadReadiness.NotReadyForOffload));
    }*/
  }

  // Behavior-free containment support; it receives no semantic usage credit.
  // @trace BOUND-01
  part def MiningGuardProcess :> Process {
    // @trace MON-01
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    // @trace MON-02
    port hold_sample : DataPort { in :>> type : HoldSample; }
    // @trace MON-03
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    // @trace CTRL-01
    port mining_command : DataPort { out :>> type : MiningCommand; }
    // @trace CTRL-02
    port guard_status : DataPort { out :>> type : GuardStatus; }
    // @trace CTRL-03
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }

    // @trace PART-01
    part request_freshness_priority_owner : RequestFreshnessPriorityOwner;
    // @trace PART-02
    part hold_guard_qualification_owner : HoldGuardQualificationOwner;
    // @trace PART-03
    part mining_support_qualification_owner : MiningSupportQualificationOwner;
    // @trace PART-04
    part ore_hold_decision_owner : OreHoldDecisionOwner;
    // @trace PART-05
    part mining_command_derivation_owner : MiningCommandDerivationOwner;
    // @trace PART-06
    part guard_reporting_derivation_owner : GuardReportingDerivationOwner;

    // @trace INT-01
    connection int01 : PortConnection connect pilot_request to request_freshness_priority_owner.pilot_request;
    // @trace INT-02
    connection int02 : PortConnection connect hold_sample to hold_guard_qualification_owner.hold_sample;
    // @trace INT-03
    connection int03 : PortConnection connect mining_support to mining_support_qualification_owner.mining_support;
    // @trace INT-04
    connection int04 : PortConnection connect request_freshness_priority_owner.request_assessment to ore_hold_decision_owner.request_assessment;
    // @trace INT-05
    connection int05 : PortConnection connect hold_guard_qualification_owner.hold_assessment to ore_hold_decision_owner.hold_assessment;
    // @trace INT-06
    connection int06 : PortConnection connect mining_support_qualification_owner.support_assessment to ore_hold_decision_owner.support_assessment;
    // @trace INT-07
    connection int07 : PortConnection connect ore_hold_decision_owner.resolution_to_command to mining_command_derivation_owner.guard_resolution;
    // @trace INT-08
    connection int08 : PortConnection connect ore_hold_decision_owner.resolution_to_reporting to guard_reporting_derivation_owner.guard_resolution;
    // @trace INT-09
    connection int09 : PortConnection connect mining_command_derivation_owner.mining_command to mining_command;
    // @trace INT-10
    connection int10 : PortConnection connect guard_reporting_derivation_owner.guard_status to guard_status;
    // @trace INT-11
    connection int11 : PortConnection connect guard_reporting_derivation_owner.offload_readiness to offload_readiness;
  }

  // @trace BOUND-01
  part def OreHoldMiningGuardSupervisorSystem :> System {
    // @trace MON-01
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    // @trace MON-02
    port hold_sample : DataPort { in :>> type : HoldSample; }
    // @trace MON-03
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    // @trace CTRL-01
    port mining_command : DataPort { out :>> type : MiningCommand; }
    // @trace CTRL-02
    port guard_status : DataPort { out :>> type : GuardStatus; }
    // @trace CTRL-03
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }

    // @generated-support Sole behavior-free Process authorized by DR-FIND-03.
    part mining_guard_process : MiningGuardProcess;

    // @generated-support Transparent root/Process delegation for INT-01.
    connection support01 : PortConnection connect pilot_request to mining_guard_process.pilot_request;
    // @generated-support Transparent root/Process delegation for INT-02.
    connection support02 : PortConnection connect hold_sample to mining_guard_process.hold_sample;
    // @generated-support Transparent root/Process delegation for INT-03.
    connection support03 : PortConnection connect mining_support to mining_guard_process.mining_support;
    // @generated-support Transparent Process/root delegation for INT-09.
    connection support04 : PortConnection connect mining_guard_process.mining_command to mining_command;
    // @generated-support Transparent Process/root delegation for INT-10.
    connection support05 : PortConnection connect mining_guard_process.guard_status to guard_status;
    // @generated-support Transparent Process/root delegation for INT-11.
    connection support06 : PortConnection connect mining_guard_process.offload_readiness to offload_readiness;
  }

  // @trace BOUND-01
  part ore_hold_mining_guard_supervisor : OreHoldMiningGuardSupervisorSystem;
}
