// Retained architecture checkpoint: types, ports, usages, and connections only.
// GUMBO behavior is intentionally absent from this stage.

// @trace PURP-01
package Vehicle_Start_Readiness_Recovery_Supervisor {
  private import HAMR::*;

  // @trace TYPE-02
  enum def BrakeObservation { enum Pressed; enum Released; enum Invalid; }
  // @trace TYPE-03
  enum def ThermalCondition { enum Normal; enum OverMaximum; enum Invalid; }
  // @trace TYPE-03
  enum def MaintenanceCondition { enum NotDue; enum Due; enum Invalid; }
  // @trace TYPE-03
  enum def HealthQualification { enum Ready; enum NotReady; enum Invalid; }
  // @trace TYPE-04
  enum def PowerObservation { enum Available; enum Unavailable; enum Invalid; }
  // @trace TYPE-05
  enum def SelfTestObservation { enum NoEvent; enum FreshPass; enum FreshFail; enum Invalid; }
  // @trace TYPE-06
  enum def RequestDisposition { enum OffDominant; enum ReturnCandidate; enum StartCandidate; enum None; }
  // @trace TYPE-06
  enum def StartDecision { enum OffPriority; enum NoStart; enum DenyInvalid; enum DenyNotReady; enum BeginStartTest; }
  // @trace TYPE-07
  enum def CommittedTestCycle {
    enum Idle; enum AwaitingStart; enum AwaitingRecovery; enum StartPassed;
    enum RecoveryPassed; enum Failed; enum Invalid;
  }
  // @trace TYPE-07
  enum def CycleAssessment {
    enum Idle; enum AwaitingStart; enum AwaitingRecovery; enum StartPassed;
    enum RecoveryPassed; enum Failed; enum Invalid;
  }
  // @trace TYPE-08
  enum def LifecycleMode { enum Off; enum Starting; enum On; enum Degraded; }
  // @trace TYPE-09
  enum def LifecyclePreMode { enum Off; enum Starting; enum On; enum Degraded; }
  // @trace TYPE-08
  enum def TestCycleDirective { enum None; enum BeginStart; enum BeginRecovery; enum Clear; }
  // @trace TYPE-09
  enum def LifecycleDirectiveSnapshot { enum None; enum BeginStart; enum BeginRecovery; enum Clear; }
  // @trace TYPE-08
  enum def LifecycleReason {
    enum Ordinary; enum QualificationInvalid; enum QualificationNotReady;
    enum RecoveryAwaiting; enum RecoveryCompleted;
  }
  // @trace TYPE-10
  enum def StartEnable { enum Inhibit; enum Permit; }
  // @trace TYPE-10
  enum def ParkingBrakeCommand { enum Apply; enum Release; }
  // @trace TYPE-10
  enum def PowerDisposition { enum Isolate; enum TestOnly; enum Enable; }
  // @trace TYPE-10
  enum def SelfTestCommand { enum None; enum Initiate; }
  // @trace TYPE-11
  enum def SupervisoryStatus {
    enum Idle; enum RequestConflict; enum StartBlockedInvalid; enum StartBlockedNotReady;
    enum Testing; enum Operating; enum Degraded; enum RecoveryTesting;
    enum RecoveredAwaitFreshStart;
  }
  // @trace TYPE-11
  enum def ControlLifecycleMode { enum Off; enum Starting; enum On; enum Degraded; }

  // Every record member later inspected by GUMBO is an attribute.
  // @trace TYPE-01
  part def RequestLevels :> Data {
    attribute start : Base_Types::Boolean;
    attribute off : Base_Types::Boolean;
    attribute returnLevel : Base_Types::Boolean;
  }
  // @trace TYPE-02
  part def BrakeFacts :> Data {
    attribute evidenceTrusted : Base_Types::Boolean;
    attribute readyForAdmission : Base_Types::Boolean;
  }
  // @trace TYPE-03
  part def HealthObservation :> Data {
    attribute thermal : ThermalCondition;
    attribute maintenance : MaintenanceCondition;
  }
  // @trace TYPE-04
  part def PowerFacts :> Data {
    attribute evidenceTrusted : Base_Types::Boolean;
    attribute availableForSupervision : Base_Types::Boolean;
  }
  // @trace PART-01
  part def RequestFacts :> Data {
    attribute offActive : Base_Types::Boolean;
    attribute freshReturn : Base_Types::Boolean;
    attribute freshStart : Base_Types::Boolean;
    attribute conflict : Base_Types::Boolean;
    attribute disposition : RequestDisposition;
  }
  // @trace PART-06
  part def StartAuthorizationFacts :> Data {
    attribute decision : StartDecision;
    attribute conflict : Base_Types::Boolean;
  }
  // @trace TYPE-09
  part def AppliedLifecycleSnapshot :> Data {
    attribute cycleDirective : LifecycleDirectiveSnapshot;
    // Tool-required one-to-one pre-state projection authorized by CONSTR-04.
    attribute preModeSnapshot : LifecyclePreMode;
    attribute nextMode : LifecycleMode;
    attribute reason : LifecycleReason;
  }
  // @trace TYPE-11
  part def ControlFrame :> Data {
    attribute startEnable : StartEnable;
    attribute parkingBrake : ParkingBrakeCommand;
    attribute powerDisposition : PowerDisposition;
    attribute selfTestCommand : SelfTestCommand;
    // Tool-required one-to-one boundary projection authorized by CONSTR-04.
    attribute lifecycleMode : ControlLifecycleMode;
    attribute status : SupervisoryStatus;
  }

  // @trace PART-01
  part def RequestPriorityOwner :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-01
    port request_levels : DataPort { in :>> type : RequestLevels; }
    // @trace INT-06
    port request_to_authorization : DataPort { out :>> type : RequestFacts; }
    // @trace INT-07
    port request_to_lifecycle : DataPort { out :>> type : RequestFacts; }

    language "GUMBO" /*{
      state
        // @trace STATE-01
        previousStart: Base_Types::Boolean;
        // @trace STATE-01
        previousOff: Base_Types::Boolean;
        // @trace STATE-01
        previousReturn: Base_Types::Boolean;
      initialize
        modifies previousStart, previousOff, previousReturn;
        // @trace STATE-01
        guarantee INITIAL_REQUEST_HISTORY:
          previousStart == false & previousOff == false & previousReturn == false &
          request_to_authorization.offActive == false &
          request_to_authorization.freshReturn == false &
          request_to_authorization.freshStart == false &
          request_to_authorization.conflict == false &
          request_to_authorization.disposition == RequestDisposition.None &
          request_to_lifecycle.offActive == false &
          request_to_lifecycle.freshReturn == false &
          request_to_lifecycle.freshStart == false &
          request_to_lifecycle.conflict == false &
          request_to_lifecycle.disposition == RequestDisposition.None;
      compute
        modifies previousStart, previousOff, previousReturn;
        // @trace PART-01
        guarantee REQUEST_PRIORITY_DERIVATION:
          request_to_authorization.offActive == request_levels.off &
          (request_to_authorization.freshReturn ==
            (request_levels.returnLevel & not In(previousReturn))) &
          (request_to_authorization.freshStart ==
            (request_levels.start & not In(previousStart))) &
          (request_to_authorization.conflict ==
            ((request_to_authorization.offActive & request_to_authorization.freshReturn) |
             (request_to_authorization.offActive & request_to_authorization.freshStart) |
             (request_to_authorization.freshReturn & request_to_authorization.freshStart))) &
          ((request_to_authorization.offActive &
            request_to_authorization.disposition == RequestDisposition.OffDominant) |
           (not request_to_authorization.offActive & request_to_authorization.freshReturn &
            request_to_authorization.disposition == RequestDisposition.ReturnCandidate) |
           (not request_to_authorization.offActive & not request_to_authorization.freshReturn &
            request_to_authorization.freshStart &
            request_to_authorization.disposition == RequestDisposition.StartCandidate) |
           (not request_to_authorization.offActive & not request_to_authorization.freshReturn &
            not request_to_authorization.freshStart &
            request_to_authorization.disposition == RequestDisposition.None)) &
          request_to_lifecycle.offActive == request_to_authorization.offActive &
          request_to_lifecycle.freshReturn == request_to_authorization.freshReturn &
          request_to_lifecycle.freshStart == request_to_authorization.freshStart &
          request_to_lifecycle.conflict == request_to_authorization.conflict &
          request_to_lifecycle.disposition == request_to_authorization.disposition &
          previousStart == request_levels.start & previousOff == request_levels.off &
          previousReturn == request_levels.returnLevel;
    }*/
  }

  // @trace PART-02
  part def BrakeQualificationOwner :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-02
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    // @trace INT-08
    port brake_to_authorization : DataPort { out :>> type : BrakeFacts; }
    // @trace INT-09
    port brake_to_lifecycle : DataPort { out :>> type : BrakeFacts; }

    language "GUMBO" /*{
      initialize
        // @trace POL-08
        guarantee INITIAL_BRAKE_FACTS_SAFE:
          brake_to_authorization.evidenceTrusted == false &
          brake_to_authorization.readyForAdmission == false &
          brake_to_lifecycle.evidenceTrusted == false &
          brake_to_lifecycle.readyForAdmission == false;
      compute
        // @trace PART-02
        guarantee BRAKE_FACT_DERIVATION:
          ((brake_observation == BrakeObservation.Pressed &
            brake_to_authorization.evidenceTrusted &
            brake_to_authorization.readyForAdmission) |
           (brake_observation == BrakeObservation.Released &
            brake_to_authorization.evidenceTrusted &
            brake_to_authorization.readyForAdmission == false) |
           (brake_observation == BrakeObservation.Invalid &
            brake_to_authorization.evidenceTrusted == false &
            brake_to_authorization.readyForAdmission == false)) &
          brake_to_lifecycle.evidenceTrusted == brake_to_authorization.evidenceTrusted &
          brake_to_lifecycle.readyForAdmission == brake_to_authorization.readyForAdmission;
    }*/
  }

  // @trace PART-03
  part def HealthQualificationOwner :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-03
    port health_observation : DataPort { in :>> type : HealthObservation; }
    // @trace INT-10
    port health_to_authorization : DataPort { out :>> type : HealthQualification; }
    // @trace INT-11
    port health_to_lifecycle : DataPort { out :>> type : HealthQualification; }

    language "GUMBO" /*{
      initialize
        // @trace POL-08
        guarantee INITIAL_HEALTH_QUALIFICATION_SAFE:
          health_to_authorization == HealthQualification.Invalid &
          health_to_lifecycle == HealthQualification.Invalid;
      compute
        // @trace PART-03
        guarantee HEALTH_QUALIFICATION_DERIVATION:
          (((health_observation.thermal == ThermalCondition.Invalid |
             health_observation.maintenance == MaintenanceCondition.Invalid) &
            health_to_authorization == HealthQualification.Invalid) |
           (health_observation.thermal != ThermalCondition.Invalid &
            health_observation.maintenance != MaintenanceCondition.Invalid &
            (health_observation.thermal == ThermalCondition.OverMaximum |
             health_observation.maintenance == MaintenanceCondition.Due) &
            health_to_authorization == HealthQualification.NotReady) |
           (health_observation.thermal == ThermalCondition.Normal &
            health_observation.maintenance == MaintenanceCondition.NotDue &
            health_to_authorization == HealthQualification.Ready)) &
          health_to_lifecycle == health_to_authorization;
    }*/
  }

  // @trace PART-04
  part def PowerQualificationOwner :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-04
    port power_observation : DataPort { in :>> type : PowerObservation; }
    // @trace INT-12
    port power_to_authorization : DataPort { out :>> type : PowerFacts; }
    // @trace INT-13
    port power_to_lifecycle : DataPort { out :>> type : PowerFacts; }

    language "GUMBO" /*{
      initialize
        // @trace POL-08
        guarantee INITIAL_POWER_FACTS_SAFE:
          power_to_authorization.evidenceTrusted == false &
          power_to_authorization.availableForSupervision == false &
          power_to_lifecycle.evidenceTrusted == false &
          power_to_lifecycle.availableForSupervision == false;
      compute
        // @trace PART-04
        guarantee POWER_FACT_DERIVATION:
          ((power_observation == PowerObservation.Available &
            power_to_authorization.evidenceTrusted &
            power_to_authorization.availableForSupervision) |
           (power_observation == PowerObservation.Unavailable &
            power_to_authorization.evidenceTrusted &
            power_to_authorization.availableForSupervision == false) |
           (power_observation == PowerObservation.Invalid &
            power_to_authorization.evidenceTrusted == false &
            power_to_authorization.availableForSupervision == false)) &
          power_to_lifecycle.evidenceTrusted == power_to_authorization.evidenceTrusted &
          power_to_lifecycle.availableForSupervision ==
            power_to_authorization.availableForSupervision;
    }*/
  }

  // @trace PART-05
  part def SelfTestCycleOwner :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-05
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    // @trace INT-17
    port test_cycle_directive : DataPort { in :>> type : TestCycleDirective; }
    // @trace INT-14
    port cycle_assessment : DataPort { out :>> type : CycleAssessment; }

    language "GUMBO" /*{
      state
        // @trace STATE-02
        committedTestCycle: CommittedTestCycle;
      initialize
        modifies committedTestCycle;
        // @trace STATE-02
        guarantee INITIAL_TEST_CYCLE:
          committedTestCycle == CommittedTestCycle.Idle &
          cycle_assessment == CycleAssessment.Idle;
      compute
        modifies committedTestCycle;
        // @trace STATE-02
        guarantee PRE_UPDATE_CYCLE_ASSESSMENT:
          ((In(committedTestCycle) == CommittedTestCycle.AwaitingStart &
            self_test_observation == SelfTestObservation.NoEvent &
            cycle_assessment == CycleAssessment.AwaitingStart) |
           (In(committedTestCycle) == CommittedTestCycle.AwaitingStart &
            self_test_observation == SelfTestObservation.FreshPass &
            cycle_assessment == CycleAssessment.StartPassed) |
           (In(committedTestCycle) == CommittedTestCycle.AwaitingStart &
            self_test_observation == SelfTestObservation.FreshFail &
            cycle_assessment == CycleAssessment.Failed) |
           (In(committedTestCycle) == CommittedTestCycle.AwaitingStart &
            self_test_observation == SelfTestObservation.Invalid &
            cycle_assessment == CycleAssessment.Invalid) |
           (In(committedTestCycle) == CommittedTestCycle.AwaitingRecovery &
            self_test_observation == SelfTestObservation.NoEvent &
            cycle_assessment == CycleAssessment.AwaitingRecovery) |
           (In(committedTestCycle) == CommittedTestCycle.AwaitingRecovery &
            self_test_observation == SelfTestObservation.FreshPass &
            cycle_assessment == CycleAssessment.RecoveryPassed) |
           (In(committedTestCycle) == CommittedTestCycle.AwaitingRecovery &
            self_test_observation == SelfTestObservation.FreshFail &
            cycle_assessment == CycleAssessment.Failed) |
           (In(committedTestCycle) == CommittedTestCycle.AwaitingRecovery &
            self_test_observation == SelfTestObservation.Invalid &
            cycle_assessment == CycleAssessment.Invalid) |
           ((In(committedTestCycle) == CommittedTestCycle.StartPassed |
             In(committedTestCycle) == CommittedTestCycle.RecoveryPassed) &
            self_test_observation == SelfTestObservation.Invalid &
            cycle_assessment == CycleAssessment.Invalid) |
           (In(committedTestCycle) == CommittedTestCycle.Idle &
            cycle_assessment == CycleAssessment.Idle) |
           (In(committedTestCycle) == CommittedTestCycle.StartPassed &
            self_test_observation != SelfTestObservation.Invalid &
            cycle_assessment == CycleAssessment.StartPassed) |
           (In(committedTestCycle) == CommittedTestCycle.RecoveryPassed &
            self_test_observation != SelfTestObservation.Invalid &
            cycle_assessment == CycleAssessment.RecoveryPassed) |
           (In(committedTestCycle) == CommittedTestCycle.Failed &
            cycle_assessment == CycleAssessment.Failed) |
           (In(committedTestCycle) == CommittedTestCycle.Invalid &
            cycle_assessment == CycleAssessment.Invalid));
        // @trace STATE-03
        guarantee INDEPENDENT_TEST_CYCLE_STORAGE:
          ((test_cycle_directive == TestCycleDirective.Clear &
            committedTestCycle == CommittedTestCycle.Idle) |
           (test_cycle_directive == TestCycleDirective.BeginStart &
            committedTestCycle == CommittedTestCycle.AwaitingStart) |
           (test_cycle_directive == TestCycleDirective.BeginRecovery &
            committedTestCycle == CommittedTestCycle.AwaitingRecovery) |
           (test_cycle_directive == TestCycleDirective.None &
            ((cycle_assessment == CycleAssessment.Idle &
              committedTestCycle == CommittedTestCycle.Idle) |
             (cycle_assessment == CycleAssessment.AwaitingStart &
              committedTestCycle == CommittedTestCycle.AwaitingStart) |
             (cycle_assessment == CycleAssessment.AwaitingRecovery &
              committedTestCycle == CommittedTestCycle.AwaitingRecovery) |
             (cycle_assessment == CycleAssessment.StartPassed &
              committedTestCycle == CommittedTestCycle.StartPassed) |
             (cycle_assessment == CycleAssessment.RecoveryPassed &
              committedTestCycle == CommittedTestCycle.RecoveryPassed) |
             (cycle_assessment == CycleAssessment.Failed &
              committedTestCycle == CommittedTestCycle.Failed) |
             (cycle_assessment == CycleAssessment.Invalid &
              committedTestCycle == CommittedTestCycle.Invalid))));
    }*/
  }

  // @trace PART-06
  part def StartAuthorizationOwner :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-06
    port request_facts : DataPort { in :>> type : RequestFacts; }
    // @trace INT-08
    port brake_facts : DataPort { in :>> type : BrakeFacts; }
    // @trace INT-10
    port health_qualification : DataPort { in :>> type : HealthQualification; }
    // @trace INT-12
    port power_facts : DataPort { in :>> type : PowerFacts; }
    // @trace INT-15
    port authorization_to_lifecycle : DataPort { out :>> type : StartAuthorizationFacts; }
    // @trace INT-16
    port authorization_to_outcome : DataPort { out :>> type : StartAuthorizationFacts; }

    language "GUMBO" /*{
      initialize
        // @trace POL-08
        guarantee INITIAL_START_AUTHORIZATION_SAFE:
          authorization_to_lifecycle.decision == StartDecision.NoStart &
          authorization_to_lifecycle.conflict == false &
          authorization_to_outcome.decision == StartDecision.NoStart &
          authorization_to_outcome.conflict == false;
      compute
        // @trace PART-06
        guarantee AUTHORIZATION_PUBLICATION_COHERENCE:
          authorization_to_lifecycle.conflict == request_facts.conflict &
          authorization_to_outcome.conflict == authorization_to_lifecycle.conflict &
          authorization_to_outcome.decision == authorization_to_lifecycle.decision;
        compute_cases
          // @trace CASE-01
          case CASE_01_OFF_PRIORITY:
            assume request_facts.disposition == RequestDisposition.OffDominant;
            guarantee authorization_to_lifecycle.decision == StartDecision.OffPriority;
          // @trace CASE-02
          case CASE_02_NO_START_APPLICABILITY:
            assume request_facts.disposition == RequestDisposition.ReturnCandidate |
              request_facts.disposition == RequestDisposition.None;
            guarantee authorization_to_lifecycle.decision == StartDecision.NoStart;
          // @trace CASE-03
          case CASE_03_DENY_INVALID:
            assume request_facts.disposition == RequestDisposition.StartCandidate &
              (brake_facts.evidenceTrusted == false |
               health_qualification == HealthQualification.Invalid |
               power_facts.evidenceTrusted == false);
            guarantee authorization_to_lifecycle.decision == StartDecision.DenyInvalid;
          // @trace CASE-04
          case CASE_04_DENY_NOT_READY:
            assume request_facts.disposition == RequestDisposition.StartCandidate &
              brake_facts.evidenceTrusted & power_facts.evidenceTrusted &
              health_qualification != HealthQualification.Invalid &
              (brake_facts.readyForAdmission == false |
               health_qualification == HealthQualification.NotReady |
               power_facts.availableForSupervision == false);
            guarantee authorization_to_lifecycle.decision == StartDecision.DenyNotReady;
          // @trace CASE-05
          case CASE_05_BEGIN_START_TEST:
            assume request_facts.disposition == RequestDisposition.StartCandidate &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision;
            guarantee authorization_to_lifecycle.decision == StartDecision.BeginStartTest;
    }*/
  }

  // @trace PART-07
  part def LifecycleRecoveryOwner :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-07
    port request_facts : DataPort { in :>> type : RequestFacts; }
    // @trace INT-09
    port brake_facts : DataPort { in :>> type : BrakeFacts; }
    // @trace INT-11
    port health_qualification : DataPort { in :>> type : HealthQualification; }
    // @trace INT-13
    port power_facts : DataPort { in :>> type : PowerFacts; }
    // @trace INT-14
    port cycle_assessment : DataPort { in :>> type : CycleAssessment; }
    // @trace INT-15
    port authorization : DataPort { in :>> type : StartAuthorizationFacts; }
    // @trace INT-17
    port test_cycle_directive : DataPort { out :>> type : TestCycleDirective; }
    // @trace INT-18
    port applied_lifecycle : DataPort { out :>> type : AppliedLifecycleSnapshot; }

    language "GUMBO" /*{
      state
        // @trace STATE-04
        lifecycleModeMemory: LifecycleMode;
      initialize
        modifies lifecycleModeMemory;
        // @trace POL-08
        guarantee INITIAL_LIFECYCLE_SAFE:
          lifecycleModeMemory == LifecycleMode.Off &
          test_cycle_directive == TestCycleDirective.None &
          applied_lifecycle.preModeSnapshot == LifecyclePreMode.Off &
          applied_lifecycle.nextMode == LifecycleMode.Off &
          applied_lifecycle.reason == LifecycleReason.Ordinary &
          applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.None;
      compute
        modifies lifecycleModeMemory;
        // @trace TYPE-09
        guarantee APPLIED_LIFECYCLE_COHERENCE:
          ((In(lifecycleModeMemory) == LifecycleMode.Off &
            applied_lifecycle.preModeSnapshot == LifecyclePreMode.Off) |
           (In(lifecycleModeMemory) == LifecycleMode.Starting &
            applied_lifecycle.preModeSnapshot == LifecyclePreMode.Starting) |
           (In(lifecycleModeMemory) == LifecycleMode.On &
            applied_lifecycle.preModeSnapshot == LifecyclePreMode.On) |
           (In(lifecycleModeMemory) == LifecycleMode.Degraded &
            applied_lifecycle.preModeSnapshot == LifecyclePreMode.Degraded)) &
          applied_lifecycle.nextMode == lifecycleModeMemory &
          ((test_cycle_directive == TestCycleDirective.None &
            applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.None) |
           (test_cycle_directive == TestCycleDirective.BeginStart &
            applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginStart) |
           (test_cycle_directive == TestCycleDirective.BeginRecovery &
            applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginRecovery) |
           (test_cycle_directive == TestCycleDirective.Clear &
            applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.Clear));
        compute_cases
          // @trace CASE-06
          case CASE_06_ADMIT_START:
            assume In(lifecycleModeMemory) == LifecycleMode.Off &
              authorization.decision == StartDecision.BeginStartTest;
            guarantee lifecycleModeMemory == LifecycleMode.Starting &
              test_cycle_directive == TestCycleDirective.BeginStart &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-07
          case CASE_07_REMAIN_OFF:
            assume In(lifecycleModeMemory) == LifecycleMode.Off &
              authorization.decision != StartDecision.BeginStartTest;
            guarantee lifecycleModeMemory == LifecycleMode.Off &
              test_cycle_directive == TestCycleDirective.None &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-08
          case CASE_08_STARTING_OFF:
            assume In(lifecycleModeMemory) == LifecycleMode.Starting &
              request_facts.offActive;
            guarantee lifecycleModeMemory == LifecycleMode.Off &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-09
          case CASE_09_STARTING_QUALIFICATION_LOSS:
            assume In(lifecycleModeMemory) == LifecycleMode.Starting &
              request_facts.offActive == false &
              (brake_facts.evidenceTrusted == false |
               brake_facts.readyForAdmission == false |
               health_qualification != HealthQualification.Ready |
               power_facts.evidenceTrusted == false |
               power_facts.availableForSupervision == false);
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.Clear &
              (((brake_facts.evidenceTrusted == false |
                 health_qualification == HealthQualification.Invalid |
                 power_facts.evidenceTrusted == false) &
                applied_lifecycle.reason == LifecycleReason.QualificationInvalid) |
               (brake_facts.evidenceTrusted &
                health_qualification != HealthQualification.Invalid &
                power_facts.evidenceTrusted &
                applied_lifecycle.reason == LifecycleReason.QualificationNotReady));
          // @trace CASE-10
          case CASE_10_START_TEST_FAILURE:
            assume In(lifecycleModeMemory) == LifecycleMode.Starting &
              request_facts.offActive == false &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              (cycle_assessment == CycleAssessment.Failed |
               cycle_assessment == CycleAssessment.Invalid);
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-11
          case CASE_11_STARTING_WAIT:
            assume In(lifecycleModeMemory) == LifecycleMode.Starting &
              request_facts.offActive == false &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              (cycle_assessment == CycleAssessment.Idle |
               cycle_assessment == CycleAssessment.AwaitingStart |
               cycle_assessment == CycleAssessment.AwaitingRecovery |
               cycle_assessment == CycleAssessment.RecoveryPassed);
            guarantee lifecycleModeMemory == LifecycleMode.Starting &
              test_cycle_directive == TestCycleDirective.None &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-12
          case CASE_12_START_PASS:
            assume In(lifecycleModeMemory) == LifecycleMode.Starting &
              request_facts.offActive == false &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              cycle_assessment == CycleAssessment.StartPassed;
            guarantee lifecycleModeMemory == LifecycleMode.On &
              test_cycle_directive == TestCycleDirective.None &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-13
          case CASE_13_ON_OFF:
            assume In(lifecycleModeMemory) == LifecycleMode.On &
              request_facts.offActive;
            guarantee lifecycleModeMemory == LifecycleMode.Off &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-14
          case CASE_14_OPERATING_PROTECTION:
            assume In(lifecycleModeMemory) == LifecycleMode.On &
              request_facts.offActive == false &
              (health_qualification != HealthQualification.Ready |
               power_facts.evidenceTrusted == false |
               power_facts.availableForSupervision == false |
               cycle_assessment != CycleAssessment.StartPassed);
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-15
          case CASE_15_RETAIN_ON:
            assume In(lifecycleModeMemory) == LifecycleMode.On &
              request_facts.offActive == false &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              cycle_assessment == CycleAssessment.StartPassed;
            guarantee lifecycleModeMemory == LifecycleMode.On &
              test_cycle_directive == TestCycleDirective.None &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-16
          case CASE_16_DEGRADED_OFF:
            assume In(lifecycleModeMemory) == LifecycleMode.Degraded &
              request_facts.offActive;
            guarantee lifecycleModeMemory == LifecycleMode.Off &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-17
          case CASE_17_RECOVERY_PREREQUISITE_LOSS:
            assume In(lifecycleModeMemory) == LifecycleMode.Degraded &
              request_facts.offActive == false &
              (brake_facts.evidenceTrusted == false |
               brake_facts.readyForAdmission == false |
               health_qualification != HealthQualification.Ready |
               power_facts.evidenceTrusted == false |
               power_facts.availableForSupervision == false);
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-18
          case CASE_18_BEGIN_RECOVERY:
            assume In(lifecycleModeMemory) == LifecycleMode.Degraded &
              request_facts.offActive == false &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              request_facts.freshReturn;
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.BeginRecovery &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-19
          case CASE_19_RECOVERY_COMPLETE:
            assume In(lifecycleModeMemory) == LifecycleMode.Degraded &
              request_facts.offActive == false &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              request_facts.freshReturn == false &
              cycle_assessment == CycleAssessment.RecoveryPassed;
            guarantee lifecycleModeMemory == LifecycleMode.Off &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.RecoveryCompleted;
          // @trace CASE-20
          case CASE_20_RECOVERY_WAIT:
            assume In(lifecycleModeMemory) == LifecycleMode.Degraded &
              request_facts.offActive == false &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              request_facts.freshReturn == false &
              cycle_assessment != CycleAssessment.RecoveryPassed;
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.None &
              ((cycle_assessment == CycleAssessment.AwaitingRecovery &
                applied_lifecycle.reason == LifecycleReason.RecoveryAwaiting) |
               (cycle_assessment != CycleAssessment.AwaitingRecovery &
                applied_lifecycle.reason == LifecycleReason.Ordinary));
    }*/
  }

  // @trace PART-08
  part def CoordinatedOutcomeOwner :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 100 [ms];
    // @trace INT-16
    port authorization : DataPort { in :>> type : StartAuthorizationFacts; }
    // @trace INT-18
    port applied_lifecycle : DataPort { in :>> type : AppliedLifecycleSnapshot; }
    // @trace INT-19
    port control_frame : DataPort { out :>> type : ControlFrame; }

    language "GUMBO" /*{
      initialize
        // @trace POL-08
        guarantee INITIAL_CONTROL_FRAME_SAFE:
          control_frame.startEnable == StartEnable.Inhibit &
          control_frame.parkingBrake == ParkingBrakeCommand.Apply &
          control_frame.powerDisposition == PowerDisposition.Isolate &
          control_frame.selfTestCommand == SelfTestCommand.None &
          control_frame.lifecycleMode == ControlLifecycleMode.Off &
          control_frame.status == SupervisoryStatus.Idle;
      compute
        // @trace POL-05
        guarantee STARTING_AND_ON_FRAME_MAPPING:
          ((applied_lifecycle.nextMode == LifecycleMode.Starting &
            control_frame.startEnable == StartEnable.Inhibit &
            control_frame.parkingBrake == ParkingBrakeCommand.Apply &
            control_frame.powerDisposition == PowerDisposition.TestOnly &
            ((applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginStart &
              control_frame.selfTestCommand == SelfTestCommand.Initiate) |
             (applied_lifecycle.cycleDirective != LifecycleDirectiveSnapshot.BeginStart &
              control_frame.selfTestCommand == SelfTestCommand.None)) &
            control_frame.lifecycleMode == ControlLifecycleMode.Starting &
            control_frame.status == SupervisoryStatus.Testing) |
           (applied_lifecycle.nextMode == LifecycleMode.On &
            control_frame.startEnable == StartEnable.Permit &
            control_frame.parkingBrake == ParkingBrakeCommand.Release &
            control_frame.powerDisposition == PowerDisposition.Enable &
            control_frame.selfTestCommand == SelfTestCommand.None &
            control_frame.lifecycleMode == ControlLifecycleMode.On &
            control_frame.status == SupervisoryStatus.Operating) |
           applied_lifecycle.nextMode == LifecycleMode.Degraded |
           applied_lifecycle.nextMode == LifecycleMode.Off);
        // @trace POL-06
        guarantee DEGRADED_FRAME_MAPPING:
          ((applied_lifecycle.nextMode == LifecycleMode.Degraded &
            control_frame.startEnable == StartEnable.Inhibit &
            control_frame.parkingBrake == ParkingBrakeCommand.Apply &
            control_frame.powerDisposition == PowerDisposition.Isolate &
            ((applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginRecovery &
              control_frame.selfTestCommand == SelfTestCommand.Initiate) |
             (applied_lifecycle.cycleDirective != LifecycleDirectiveSnapshot.BeginRecovery &
              control_frame.selfTestCommand == SelfTestCommand.None)) &
            control_frame.lifecycleMode == ControlLifecycleMode.Degraded &
            (((applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginRecovery |
               applied_lifecycle.reason == LifecycleReason.RecoveryAwaiting) &
              control_frame.status == SupervisoryStatus.RecoveryTesting) |
             (applied_lifecycle.cycleDirective != LifecycleDirectiveSnapshot.BeginRecovery &
              applied_lifecycle.reason != LifecycleReason.RecoveryAwaiting &
              control_frame.status == SupervisoryStatus.Degraded))) |
           applied_lifecycle.nextMode != LifecycleMode.Degraded);
        // @trace POL-07
        guarantee OFF_FRAME_MAPPING:
          ((applied_lifecycle.nextMode == LifecycleMode.Off &
            control_frame.startEnable == StartEnable.Inhibit &
            control_frame.parkingBrake == ParkingBrakeCommand.Apply &
            control_frame.powerDisposition == PowerDisposition.Isolate &
            control_frame.selfTestCommand == SelfTestCommand.None &
            control_frame.lifecycleMode == ControlLifecycleMode.Off &
            ((applied_lifecycle.reason == LifecycleReason.RecoveryCompleted &
              control_frame.status == SupervisoryStatus.RecoveredAwaitFreshStart) |
             (applied_lifecycle.reason != LifecycleReason.RecoveryCompleted &
              authorization.decision == StartDecision.DenyInvalid &
              control_frame.status == SupervisoryStatus.StartBlockedInvalid) |
             (applied_lifecycle.reason != LifecycleReason.RecoveryCompleted &
              authorization.decision != StartDecision.DenyInvalid &
              authorization.decision == StartDecision.DenyNotReady &
              control_frame.status == SupervisoryStatus.StartBlockedNotReady) |
             (applied_lifecycle.reason != LifecycleReason.RecoveryCompleted &
              authorization.decision != StartDecision.DenyInvalid &
              authorization.decision != StartDecision.DenyNotReady &
              authorization.conflict &
              control_frame.status == SupervisoryStatus.RequestConflict) |
             (applied_lifecycle.reason != LifecycleReason.RecoveryCompleted &
              authorization.decision != StartDecision.DenyInvalid &
              authorization.decision != StartDecision.DenyNotReady &
              authorization.conflict == false &
              control_frame.status == SupervisoryStatus.Idle))) |
           applied_lifecycle.nextMode != LifecycleMode.Off);
        // @trace BEH-02
        guarantee CONTROL_FRAME_COHERENCE:
          (((applied_lifecycle.nextMode == LifecycleMode.Off &
             control_frame.lifecycleMode == ControlLifecycleMode.Off) |
            (applied_lifecycle.nextMode == LifecycleMode.Starting &
             control_frame.lifecycleMode == ControlLifecycleMode.Starting) |
            (applied_lifecycle.nextMode == LifecycleMode.On &
             control_frame.lifecycleMode == ControlLifecycleMode.On) |
            (applied_lifecycle.nextMode == LifecycleMode.Degraded &
             control_frame.lifecycleMode == ControlLifecycleMode.Degraded))) &
          ((control_frame.startEnable == StartEnable.Permit &
            control_frame.parkingBrake == ParkingBrakeCommand.Release &
            control_frame.powerDisposition == PowerDisposition.Enable &
            control_frame.lifecycleMode == ControlLifecycleMode.On) |
           (control_frame.startEnable == StartEnable.Inhibit &
            control_frame.parkingBrake == ParkingBrakeCommand.Apply &
            control_frame.powerDisposition != PowerDisposition.Enable &
            control_frame.lifecycleMode != ControlLifecycleMode.On));
    }*/
  }

  // Deployment-only one-thread Microkit process wrappers. They preserve the
  // accepted owner's typed ports; the root below preserves every INT edge.
  part def RequestPriorityProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 2;
    port request_levels : DataPort { in :>> type : RequestLevels; }
    port request_to_authorization : DataPort { out :>> type : RequestFacts; }
    port request_to_lifecycle : DataPort { out :>> type : RequestFacts; }
    part behavior : RequestPriorityOwner;
    connection deploy_in : PortConnection connect request_levels to behavior.request_levels;
    connection deploy_auth : PortConnection connect behavior.request_to_authorization to request_to_authorization;
    connection deploy_lifecycle : PortConnection connect behavior.request_to_lifecycle to request_to_lifecycle;
  }

  part def BrakeQualificationProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 3;
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    port brake_to_authorization : DataPort { out :>> type : BrakeFacts; }
    port brake_to_lifecycle : DataPort { out :>> type : BrakeFacts; }
    part behavior : BrakeQualificationOwner;
    connection deploy_in : PortConnection connect brake_observation to behavior.brake_observation;
    connection deploy_auth : PortConnection connect behavior.brake_to_authorization to brake_to_authorization;
    connection deploy_lifecycle : PortConnection connect behavior.brake_to_lifecycle to brake_to_lifecycle;
  }

  part def HealthQualificationProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 4;
    port health_observation : DataPort { in :>> type : HealthObservation; }
    port health_to_authorization : DataPort { out :>> type : HealthQualification; }
    port health_to_lifecycle : DataPort { out :>> type : HealthQualification; }
    part behavior : HealthQualificationOwner;
    connection deploy_in : PortConnection connect health_observation to behavior.health_observation;
    connection deploy_auth : PortConnection connect behavior.health_to_authorization to health_to_authorization;
    connection deploy_lifecycle : PortConnection connect behavior.health_to_lifecycle to health_to_lifecycle;
  }

  part def PowerQualificationProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 5;
    port power_observation : DataPort { in :>> type : PowerObservation; }
    port power_to_authorization : DataPort { out :>> type : PowerFacts; }
    port power_to_lifecycle : DataPort { out :>> type : PowerFacts; }
    part behavior : PowerQualificationOwner;
    connection deploy_in : PortConnection connect power_observation to behavior.power_observation;
    connection deploy_auth : PortConnection connect behavior.power_to_authorization to power_to_authorization;
    connection deploy_lifecycle : PortConnection connect behavior.power_to_lifecycle to power_to_lifecycle;
  }

  part def SelfTestCycleProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 6;
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    port test_cycle_directive : DataPort { in :>> type : TestCycleDirective; }
    port cycle_assessment : DataPort { out :>> type : CycleAssessment; }
    part behavior : SelfTestCycleOwner;
    connection deploy_observation : PortConnection connect self_test_observation to behavior.self_test_observation;
    connection deploy_directive : PortConnection connect test_cycle_directive to behavior.test_cycle_directive;
    connection deploy_assessment : PortConnection connect behavior.cycle_assessment to cycle_assessment;
  }

  part def StartAuthorizationProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 7;
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port brake_facts : DataPort { in :>> type : BrakeFacts; }
    port health_qualification : DataPort { in :>> type : HealthQualification; }
    port power_facts : DataPort { in :>> type : PowerFacts; }
    port authorization_to_lifecycle : DataPort { out :>> type : StartAuthorizationFacts; }
    port authorization_to_outcome : DataPort { out :>> type : StartAuthorizationFacts; }
    part behavior : StartAuthorizationOwner;
    connection deploy_request : PortConnection connect request_facts to behavior.request_facts;
    connection deploy_brake : PortConnection connect brake_facts to behavior.brake_facts;
    connection deploy_health : PortConnection connect health_qualification to behavior.health_qualification;
    connection deploy_power : PortConnection connect power_facts to behavior.power_facts;
    connection deploy_lifecycle : PortConnection connect behavior.authorization_to_lifecycle to authorization_to_lifecycle;
    connection deploy_outcome : PortConnection connect behavior.authorization_to_outcome to authorization_to_outcome;
  }

  part def LifecycleRecoveryProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 8;
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port brake_facts : DataPort { in :>> type : BrakeFacts; }
    port health_qualification : DataPort { in :>> type : HealthQualification; }
    port power_facts : DataPort { in :>> type : PowerFacts; }
    port cycle_assessment : DataPort { in :>> type : CycleAssessment; }
    port authorization : DataPort { in :>> type : StartAuthorizationFacts; }
    port test_cycle_directive : DataPort { out :>> type : TestCycleDirective; }
    port applied_lifecycle : DataPort { out :>> type : AppliedLifecycleSnapshot; }
    part behavior : LifecycleRecoveryOwner;
    connection deploy_request : PortConnection connect request_facts to behavior.request_facts;
    connection deploy_brake : PortConnection connect brake_facts to behavior.brake_facts;
    connection deploy_health : PortConnection connect health_qualification to behavior.health_qualification;
    connection deploy_power : PortConnection connect power_facts to behavior.power_facts;
    connection deploy_cycle : PortConnection connect cycle_assessment to behavior.cycle_assessment;
    connection deploy_authorization : PortConnection connect authorization to behavior.authorization;
    connection deploy_directive : PortConnection connect behavior.test_cycle_directive to test_cycle_directive;
    connection deploy_lifecycle : PortConnection connect behavior.applied_lifecycle to applied_lifecycle;
  }

  part def CoordinatedOutcomeProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 9;
    port authorization : DataPort { in :>> type : StartAuthorizationFacts; }
    port applied_lifecycle : DataPort { in :>> type : AppliedLifecycleSnapshot; }
    port control_frame : DataPort { out :>> type : ControlFrame; }
    part behavior : CoordinatedOutcomeOwner;
    connection deploy_authorization : PortConnection connect authorization to behavior.authorization;
    connection deploy_lifecycle : PortConnection connect applied_lifecycle to behavior.applied_lifecycle;
    connection deploy_control : PortConnection connect behavior.control_frame to control_frame;
  }

  // Deployment-only Microkit processor metadata.
  part def VehicleSupervisorProcessor :> HAMR_AADL::Processor {
    attribute :>> Max_Domain = 9;
    attribute :>> Clock_Period = 1 [ms];
    attribute :>> Frame_Period = 1000 [ms];
  }

  // @trace BOUND-01
  part def VehicleStartReadinessRecoverySupervisorSystem :> System {
    attribute :>> Scheduling = HAMR_Microkit::Domain_Scheduling;
    // @trace MON-01
    port request_levels : DataPort { in :>> type : RequestLevels; }
    // @trace MON-02
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    // @trace MON-03
    port health_observation : DataPort { in :>> type : HealthObservation; }
    // @trace MON-04
    port power_observation : DataPort { in :>> type : PowerObservation; }
    // @trace MON-05
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    // @trace CTRL-01
    port control_frame : DataPort { out :>> type : ControlFrame; }

    part vehicle_supervisor_processor : VehicleSupervisorProcessor;

    part request_priority : RequestPriorityProcess;
    part brake_qualification : BrakeQualificationProcess;
    part health_qualification : HealthQualificationProcess;
    part power_qualification : PowerQualificationProcess;
    part self_test_cycle : SelfTestCycleProcess;
    part start_authorization : StartAuthorizationProcess;
    part lifecycle_recovery : LifecycleRecoveryProcess;
    part coordinated_outcome : CoordinatedOutcomeProcess;

    allocation bind_request : Deployment_Properties::Actual_Processor_Binding allocate request_priority to vehicle_supervisor_processor;
    allocation bind_brake : Deployment_Properties::Actual_Processor_Binding allocate brake_qualification to vehicle_supervisor_processor;
    allocation bind_health : Deployment_Properties::Actual_Processor_Binding allocate health_qualification to vehicle_supervisor_processor;
    allocation bind_power : Deployment_Properties::Actual_Processor_Binding allocate power_qualification to vehicle_supervisor_processor;
    allocation bind_test : Deployment_Properties::Actual_Processor_Binding allocate self_test_cycle to vehicle_supervisor_processor;
    allocation bind_auth : Deployment_Properties::Actual_Processor_Binding allocate start_authorization to vehicle_supervisor_processor;
    allocation bind_lifecycle : Deployment_Properties::Actual_Processor_Binding allocate lifecycle_recovery to vehicle_supervisor_processor;
    allocation bind_outcome : Deployment_Properties::Actual_Processor_Binding allocate coordinated_outcome to vehicle_supervisor_processor;

    connection int01 : PortConnection connect request_levels to request_priority.request_levels;
    connection int02 : PortConnection connect brake_observation to brake_qualification.brake_observation;
    connection int03 : PortConnection connect health_observation to health_qualification.health_observation;
    connection int04 : PortConnection connect power_observation to power_qualification.power_observation;
    connection int05 : PortConnection connect self_test_observation to self_test_cycle.self_test_observation;
    connection int06 : PortConnection connect request_priority.request_to_authorization to start_authorization.request_facts;
    connection int07 : PortConnection connect request_priority.request_to_lifecycle to lifecycle_recovery.request_facts;
    connection int08 : PortConnection connect brake_qualification.brake_to_authorization to start_authorization.brake_facts;
    connection int09 : PortConnection connect brake_qualification.brake_to_lifecycle to lifecycle_recovery.brake_facts;
    connection int10 : PortConnection connect health_qualification.health_to_authorization to start_authorization.health_qualification;
    connection int11 : PortConnection connect health_qualification.health_to_lifecycle to lifecycle_recovery.health_qualification;
    connection int12 : PortConnection connect power_qualification.power_to_authorization to start_authorization.power_facts;
    connection int13 : PortConnection connect power_qualification.power_to_lifecycle to lifecycle_recovery.power_facts;
    connection int14 : PortConnection connect self_test_cycle.cycle_assessment to lifecycle_recovery.cycle_assessment;
    connection int15 : PortConnection connect start_authorization.authorization_to_lifecycle to lifecycle_recovery.authorization;
    connection int16 : PortConnection connect start_authorization.authorization_to_outcome to coordinated_outcome.authorization;
    connection int17 : PortConnection connect lifecycle_recovery.test_cycle_directive to self_test_cycle.test_cycle_directive;
    connection int18 : PortConnection connect lifecycle_recovery.applied_lifecycle to coordinated_outcome.applied_lifecycle;
    connection int19 : PortConnection connect coordinated_outcome.control_frame to control_frame;
  }

  // @trace BOUND-01
  part vehicle_start_readiness_recovery_supervisor : VehicleStartReadinessRecoverySupervisorSystem;
}
