package Ore_Hold_Mining_Guard_Supervisor {
  private import HAMR::*;

  enum def InputStatus { enum Valid; enum Invalid; }
  enum def HoldObservation { enum RoomAvailable; enum NearlyFull; }
  enum def AsteroidCondition { enum OreAvailable; enum Depleted; }
  enum def LaserCondition { enum Ready; enum Overheated; }
  enum def TargetCondition { enum Locked; enum Interfered; }
  enum def RequestDisposition { enum InvalidRequest; enum HaltDominant; enum FreshResume; enum FreshStart; enum NoFreshRequest; }
  enum def HoldAssessment { enum SpaceAvailable; enum GuardReached; enum InvalidHold; }
  enum def SupportAssessment { enum SupportReady; enum SupportBlocked; enum InvalidSupport; }
  enum def GuardMode { enum Idle; enum Mining; enum CapacityHold; enum ConditionHold; enum RecoveryReady; }
  enum def ResolutionReason { enum HaltSelected; enum InvalidEvidence; enum HoldGuardReached; enum SupportUnavailable; enum StartAdmitted; enum IdleWaiting; enum MiningMaintained; enum GuardCleared; enum EvidenceRestored; enum ResumeAdmitted; enum RecoveryWaiting; }
  enum def MiningCommand { enum StopMining; enum ContinueMining; }
  enum def GuardStatus { enum Idle; enum MiningAuthorized; enum HaltedByPilot; enum GuardedNearlyFull; enum HeldForSupport; enum InputFault; enum AwaitingFreshResume; enum RequestConflict; }
  enum def OffloadReadiness { enum NotReadyForOffload; enum ReadyForLaterOffload; }

  part def PilotRequestSample :> Data {
    attribute start : Base_Types::Boolean;
    attribute halt_request : Base_Types::Boolean;
    attribute resume : Base_Types::Boolean;
    attribute status : InputStatus;
  }
  part def HoldSample :> Data {
    attribute observation : HoldObservation;
    attribute status : InputStatus;
  }
  part def MiningSupportSample :> Data {
    attribute asteroid : AsteroidCondition;
    attribute laser : LaserCondition;
    attribute target : TargetCondition;
    attribute status : InputStatus;
  }
  part def RequestAssessment :> Data {
    attribute disposition : RequestDisposition;
    attribute conflict : Base_Types::Boolean;
  }
  part def GuardResolution :> Data {
    attribute nextMode : GuardMode;
    attribute reason : ResolutionReason;
    attribute requestConflict : Base_Types::Boolean;
  }

  part def RequestFreshnessPriorityOwner :> Thread {
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    port request_assessment : DataPort { out :>> type : RequestAssessment; }
    language "GUMBO" /*{
      state
        previousStart: Base_Types::Boolean;
        previousHalt: Base_Types::Boolean;
        previousResume: Base_Types::Boolean;
      initialize
        guarantee INITIAL_REQUEST_OWNER_SAFE:
          previousStart == F & previousHalt == F & previousResume == F &
          request_assessment.disposition == RequestDisposition.InvalidRequest &
          request_assessment.conflict == F;
      compute
        modifies previousStart, previousHalt, previousResume;
        guarantee REQUEST_HISTORY:
          previousStart == pilot_request.start & previousHalt == pilot_request.halt_request &
          previousResume == pilot_request.resume;
        guarantee INVALID_REQUEST:
          pilot_request.status == InputStatus.Invalid implies
          request_assessment.disposition == RequestDisposition.InvalidRequest & request_assessment.conflict == F;
        guarantee HALT_DOMINANT:
          pilot_request.status == InputStatus.Valid & pilot_request.halt_request implies
          request_assessment.disposition == RequestDisposition.HaltDominant;
        guarantee FRESH_RESUME:
          pilot_request.status == InputStatus.Valid & ~pilot_request.halt_request & pilot_request.resume &
          ~In(previousResume) implies request_assessment.disposition == RequestDisposition.FreshResume;
        guarantee FRESH_START:
          pilot_request.status == InputStatus.Valid & ~pilot_request.halt_request &
          (~pilot_request.resume | In(previousResume)) & pilot_request.start & ~In(previousStart) implies
          request_assessment.disposition == RequestDisposition.FreshStart;
        guarantee NO_FRESH_REQUEST:
          pilot_request.status == InputStatus.Valid & ~pilot_request.halt_request &
          (~pilot_request.resume | In(previousResume)) & (~pilot_request.start | In(previousStart)) implies
          request_assessment.disposition == RequestDisposition.NoFreshRequest;
        guarantee CONFLICT_EXACT:
          pilot_request.status == InputStatus.Valid implies request_assessment.conflict ==
          ((pilot_request.start & pilot_request.halt_request) | (pilot_request.start & pilot_request.resume) |
          (pilot_request.halt_request & pilot_request.resume));
    }*/
  }

  part def HoldGuardQualificationOwner :> Thread {
    port hold_sample : DataPort { in :>> type : HoldSample; }
    port hold_assessment : DataPort { out :>> type : HoldAssessment; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_HOLD_ASSESSMENT_SAFE: hold_assessment == HoldAssessment.InvalidHold;
      compute
        guarantee INVALID_HOLD: hold_sample.status == InputStatus.Invalid implies hold_assessment == HoldAssessment.InvalidHold;
        guarantee SPACE_AVAILABLE: hold_sample.status == InputStatus.Valid & hold_sample.observation == HoldObservation.RoomAvailable implies hold_assessment == HoldAssessment.SpaceAvailable;
        guarantee GUARD_REACHED: hold_sample.status == InputStatus.Valid & hold_sample.observation == HoldObservation.NearlyFull implies hold_assessment == HoldAssessment.GuardReached;
    }*/
  }

  part def MiningSupportQualificationOwner :> Thread {
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    port support_assessment : DataPort { out :>> type : SupportAssessment; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_SUPPORT_ASSESSMENT_SAFE: support_assessment == SupportAssessment.InvalidSupport;
      compute
        guarantee INVALID_SUPPORT: mining_support.status == InputStatus.Invalid implies support_assessment == SupportAssessment.InvalidSupport;
        guarantee SUPPORT_READY: mining_support.status == InputStatus.Valid & mining_support.asteroid == AsteroidCondition.OreAvailable & mining_support.laser == LaserCondition.Ready & mining_support.target == TargetCondition.Locked implies support_assessment == SupportAssessment.SupportReady;
        guarantee SUPPORT_BLOCKED: mining_support.status == InputStatus.Valid & (mining_support.asteroid != AsteroidCondition.OreAvailable | mining_support.laser != LaserCondition.Ready | mining_support.target != TargetCondition.Locked) implies support_assessment == SupportAssessment.SupportBlocked;
    }*/
  }

  part def OreHoldDecisionOwner :> Thread {
    port request_assessment : DataPort { in :>> type : RequestAssessment; }
    port hold_assessment : DataPort { in :>> type : HoldAssessment; }
    port support_assessment : DataPort { in :>> type : SupportAssessment; }
    port resolution_to_command : DataPort { out :>> type : GuardResolution; }
    port resolution_to_reporting : DataPort { out :>> type : GuardResolution; }
    language "GUMBO" /*{
      state
        guardMode: GuardMode;
      initialize
        guarantee INITIAL_DECISION_SAFE:
          guardMode == GuardMode.Idle & resolution_to_command.nextMode == GuardMode.Idle &
          resolution_to_command.reason == ResolutionReason.IdleWaiting & resolution_to_command.requestConflict == F &
          resolution_to_reporting.nextMode == GuardMode.Idle & resolution_to_reporting.reason == ResolutionReason.IdleWaiting &
          resolution_to_reporting.requestConflict == F;
      compute
        modifies guardMode;
        guarantee MIRRORED_RESOLUTION:
          resolution_to_command.nextMode == resolution_to_reporting.nextMode &
          resolution_to_command.reason == resolution_to_reporting.reason &
          resolution_to_command.requestConflict == resolution_to_reporting.requestConflict &
          resolution_to_command.requestConflict == request_assessment.conflict;
        guarantee INVALID_ASSESSMENT:
          (request_assessment.disposition == RequestDisposition.InvalidRequest | hold_assessment == HoldAssessment.InvalidHold | support_assessment == SupportAssessment.InvalidSupport) implies
          guardMode == GuardMode.ConditionHold & resolution_to_command.nextMode == GuardMode.ConditionHold & resolution_to_command.reason == ResolutionReason.InvalidEvidence;
        guarantee HALT_DOMINANT:
          request_assessment.disposition != RequestDisposition.InvalidRequest & hold_assessment != HoldAssessment.InvalidHold & support_assessment != SupportAssessment.InvalidSupport & request_assessment.disposition == RequestDisposition.HaltDominant implies
          guardMode == GuardMode.Idle & resolution_to_command.nextMode == GuardMode.Idle & resolution_to_command.reason == ResolutionReason.HaltSelected;
        guarantee HOLD_GUARD_REACHED:
          request_assessment.disposition != RequestDisposition.InvalidRequest & hold_assessment != HoldAssessment.InvalidHold & support_assessment != SupportAssessment.InvalidSupport & request_assessment.disposition != RequestDisposition.HaltDominant & hold_assessment == HoldAssessment.GuardReached implies
          guardMode == GuardMode.CapacityHold & resolution_to_command.nextMode == GuardMode.CapacityHold & resolution_to_command.reason == ResolutionReason.HoldGuardReached;
        guarantee SUPPORT_UNAVAILABLE:
          request_assessment.disposition != RequestDisposition.InvalidRequest & request_assessment.disposition != RequestDisposition.HaltDominant & hold_assessment == HoldAssessment.SpaceAvailable & support_assessment == SupportAssessment.SupportBlocked implies
          guardMode == GuardMode.ConditionHold & resolution_to_command.nextMode == GuardMode.ConditionHold & resolution_to_command.reason == ResolutionReason.SupportUnavailable;
        guarantee FRESH_START_ADMITTED:
          request_assessment.disposition == RequestDisposition.FreshStart & hold_assessment == HoldAssessment.SpaceAvailable & support_assessment == SupportAssessment.SupportReady & In(guardMode) == GuardMode.Idle implies
          guardMode == GuardMode.Mining & resolution_to_command.nextMode == GuardMode.Mining & resolution_to_command.reason == ResolutionReason.StartAdmitted;
        guarantee IDLE_WAITING:
          request_assessment.disposition != RequestDisposition.InvalidRequest & request_assessment.disposition != RequestDisposition.HaltDominant & request_assessment.disposition != RequestDisposition.FreshStart & hold_assessment == HoldAssessment.SpaceAvailable & support_assessment == SupportAssessment.SupportReady & In(guardMode) == GuardMode.Idle implies
          guardMode == GuardMode.Idle & resolution_to_command.nextMode == GuardMode.Idle & resolution_to_command.reason == ResolutionReason.IdleWaiting;
        guarantee MINING_MAINTAINED:
          request_assessment.disposition != RequestDisposition.InvalidRequest & request_assessment.disposition != RequestDisposition.HaltDominant & hold_assessment == HoldAssessment.SpaceAvailable & support_assessment == SupportAssessment.SupportReady & In(guardMode) == GuardMode.Mining implies
          guardMode == GuardMode.Mining & resolution_to_command.nextMode == GuardMode.Mining & resolution_to_command.reason == ResolutionReason.MiningMaintained;
        guarantee CAPACITY_GUARD_CLEARED:
          request_assessment.disposition != RequestDisposition.InvalidRequest & request_assessment.disposition != RequestDisposition.HaltDominant & hold_assessment == HoldAssessment.SpaceAvailable & support_assessment == SupportAssessment.SupportReady & In(guardMode) == GuardMode.CapacityHold implies
          guardMode == GuardMode.RecoveryReady & resolution_to_command.nextMode == GuardMode.RecoveryReady & resolution_to_command.reason == ResolutionReason.GuardCleared;
        guarantee CONDITION_EVIDENCE_RESTORED:
          request_assessment.disposition != RequestDisposition.InvalidRequest & request_assessment.disposition != RequestDisposition.HaltDominant & hold_assessment == HoldAssessment.SpaceAvailable & support_assessment == SupportAssessment.SupportReady & In(guardMode) == GuardMode.ConditionHold implies
          guardMode == GuardMode.RecoveryReady & resolution_to_command.nextMode == GuardMode.RecoveryReady & resolution_to_command.reason == ResolutionReason.EvidenceRestored;
        guarantee FRESH_RESUME_ADMITTED:
          request_assessment.disposition == RequestDisposition.FreshResume & hold_assessment == HoldAssessment.SpaceAvailable & support_assessment == SupportAssessment.SupportReady & In(guardMode) == GuardMode.RecoveryReady implies
          guardMode == GuardMode.Mining & resolution_to_command.nextMode == GuardMode.Mining & resolution_to_command.reason == ResolutionReason.ResumeAdmitted;
        guarantee RECOVERY_WAITING:
          request_assessment.disposition != RequestDisposition.InvalidRequest & request_assessment.disposition != RequestDisposition.HaltDominant & request_assessment.disposition != RequestDisposition.FreshResume & hold_assessment == HoldAssessment.SpaceAvailable & support_assessment == SupportAssessment.SupportReady & In(guardMode) == GuardMode.RecoveryReady implies
          guardMode == GuardMode.RecoveryReady & resolution_to_command.nextMode == GuardMode.RecoveryReady & resolution_to_command.reason == ResolutionReason.RecoveryWaiting;
    }*/
  }

  part def MiningCommandDerivationOwner :> Thread {
    port guard_resolution : DataPort { in :>> type : GuardResolution; }
    port mining_command : DataPort { out :>> type : MiningCommand; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_MINING_COMMAND_SAFE: mining_command == MiningCommand.StopMining;
      compute
        guarantee MINING_COMMAND_EXACT_DERIVATION:
          (guard_resolution.nextMode == GuardMode.Mining implies mining_command == MiningCommand.ContinueMining) &
          (guard_resolution.nextMode != GuardMode.Mining implies mining_command == MiningCommand.StopMining);
    }*/
  }

  part def GuardReportingDerivationOwner :> Thread {
    port guard_resolution : DataPort { in :>> type : GuardResolution; }
    port guard_status : DataPort { out :>> type : GuardStatus; }
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }
    language "GUMBO" /*{
      initialize
        guarantee INITIAL_REPORTING_SAFE: guard_status == GuardStatus.Idle & offload_readiness == OffloadReadiness.NotReadyForOffload;
      compute
        guarantee INVALID_EVIDENCE: guard_resolution.reason == ResolutionReason.InvalidEvidence implies guard_status == GuardStatus.InputFault;
        guarantee HALT_STATUS: guard_resolution.reason == ResolutionReason.HaltSelected implies guard_status == GuardStatus.HaltedByPilot;
        guarantee HOLD_STATUS: guard_resolution.reason == ResolutionReason.HoldGuardReached implies guard_status == GuardStatus.GuardedNearlyFull;
        guarantee SUPPORT_STATUS: guard_resolution.reason == ResolutionReason.SupportUnavailable implies guard_status == GuardStatus.HeldForSupport;
        guarantee MINING_STATUS: (guard_resolution.reason == ResolutionReason.StartAdmitted | guard_resolution.reason == ResolutionReason.MiningMaintained | guard_resolution.reason == ResolutionReason.ResumeAdmitted) implies guard_status == GuardStatus.MiningAuthorized;
        guarantee RECOVERY_STATUS: (guard_resolution.reason == ResolutionReason.GuardCleared | guard_resolution.reason == ResolutionReason.EvidenceRestored | guard_resolution.reason == ResolutionReason.RecoveryWaiting) implies guard_status == GuardStatus.AwaitingFreshResume;
        guarantee CONFLICT_STATUS: guard_resolution.reason == ResolutionReason.IdleWaiting & guard_resolution.requestConflict implies guard_status == GuardStatus.RequestConflict;
        guarantee IDLE_STATUS: guard_resolution.reason == ResolutionReason.IdleWaiting & ~guard_resolution.requestConflict implies guard_status == GuardStatus.Idle;
        guarantee OFFLOAD_READINESS_EXACT_DERIVATION:
          (guard_resolution.nextMode == GuardMode.CapacityHold implies offload_readiness == OffloadReadiness.ReadyForLaterOffload) &
          (guard_resolution.nextMode != GuardMode.CapacityHold implies offload_readiness == OffloadReadiness.NotReadyForOffload);
    }*/
  }

  part def MiningGuardProcess :> Process {
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    port hold_sample : DataPort { in :>> type : HoldSample; }
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    port mining_command : DataPort { out :>> type : MiningCommand; }
    port guard_status : DataPort { out :>> type : GuardStatus; }
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }
    part request_freshness_priority_owner : RequestFreshnessPriorityOwner;
    part hold_guard_qualification_owner : HoldGuardQualificationOwner;
    part mining_support_qualification_owner : MiningSupportQualificationOwner;
    part ore_hold_decision_owner : OreHoldDecisionOwner;
    part mining_command_derivation_owner : MiningCommandDerivationOwner;
    part guard_reporting_derivation_owner : GuardReportingDerivationOwner;
    connection int01 : PortConnection connect pilot_request to request_freshness_priority_owner.pilot_request;
    connection int02 : PortConnection connect hold_sample to hold_guard_qualification_owner.hold_sample;
    connection int03 : PortConnection connect mining_support to mining_support_qualification_owner.mining_support;
    connection int04 : PortConnection connect request_freshness_priority_owner.request_assessment to ore_hold_decision_owner.request_assessment;
    connection int05 : PortConnection connect hold_guard_qualification_owner.hold_assessment to ore_hold_decision_owner.hold_assessment;
    connection int06 : PortConnection connect mining_support_qualification_owner.support_assessment to ore_hold_decision_owner.support_assessment;
    connection int07 : PortConnection connect ore_hold_decision_owner.resolution_to_command to mining_command_derivation_owner.guard_resolution;
    connection int08 : PortConnection connect ore_hold_decision_owner.resolution_to_reporting to guard_reporting_derivation_owner.guard_resolution;
    connection int09 : PortConnection connect mining_command_derivation_owner.mining_command to mining_command;
    connection int10 : PortConnection connect guard_reporting_derivation_owner.guard_status to guard_status;
    connection int11 : PortConnection connect guard_reporting_derivation_owner.offload_readiness to offload_readiness;
  }
  part def OreHoldMiningGuardSupervisorSystem :> System {
    port pilot_request : DataPort { in :>> type : PilotRequestSample; }
    port hold_sample : DataPort { in :>> type : HoldSample; }
    port mining_support : DataPort { in :>> type : MiningSupportSample; }
    port mining_command : DataPort { out :>> type : MiningCommand; }
    port guard_status : DataPort { out :>> type : GuardStatus; }
    port offload_readiness : DataPort { out :>> type : OffloadReadiness; }
    part mining_guard_process : MiningGuardProcess;
    connection support01 : PortConnection connect pilot_request to mining_guard_process.pilot_request;
    connection support02 : PortConnection connect hold_sample to mining_guard_process.hold_sample;
    connection support03 : PortConnection connect mining_support to mining_guard_process.mining_support;
    connection support04 : PortConnection connect mining_guard_process.mining_command to mining_command;
    connection support05 : PortConnection connect mining_guard_process.guard_status to guard_status;
    connection support06 : PortConnection connect mining_guard_process.offload_readiness to offload_readiness;
  }
  part ore_hold_mining_guard_supervisor : OreHoldMiningGuardSupervisorSystem;
}
