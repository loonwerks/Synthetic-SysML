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
  part def RequestPriorityOwner :> Thread {
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
          previousStart == F & previousOff == F & previousReturn == F &
          request_to_authorization.offActive == F &
          request_to_authorization.freshReturn == F &
          request_to_authorization.freshStart == F &
          request_to_authorization.conflict == F &
          request_to_authorization.disposition == RequestDisposition.None &
          request_to_lifecycle.offActive == F &
          request_to_lifecycle.freshReturn == F &
          request_to_lifecycle.freshStart == F &
          request_to_lifecycle.conflict == F &
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
  part def BrakeQualificationOwner :> Thread {
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
          brake_to_authorization.evidenceTrusted == F &
          brake_to_authorization.readyForAdmission == F &
          brake_to_lifecycle.evidenceTrusted == F &
          brake_to_lifecycle.readyForAdmission == F;
      compute
        // @trace PART-02
        guarantee BRAKE_FACT_DERIVATION:
          ((brake_observation == BrakeObservation.Pressed &
            brake_to_authorization.evidenceTrusted &
            brake_to_authorization.readyForAdmission) |
           (brake_observation == BrakeObservation.Released &
            brake_to_authorization.evidenceTrusted &
            brake_to_authorization.readyForAdmission == F) |
           (brake_observation == BrakeObservation.Invalid &
            brake_to_authorization.evidenceTrusted == F &
            brake_to_authorization.readyForAdmission == F)) &
          brake_to_lifecycle.evidenceTrusted == brake_to_authorization.evidenceTrusted &
          brake_to_lifecycle.readyForAdmission == brake_to_authorization.readyForAdmission;
    }*/
  }

  // @trace PART-03
  part def HealthQualificationOwner :> Thread {
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
  part def PowerQualificationOwner :> Thread {
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
          power_to_authorization.evidenceTrusted == F &
          power_to_authorization.availableForSupervision == F &
          power_to_lifecycle.evidenceTrusted == F &
          power_to_lifecycle.availableForSupervision == F;
      compute
        // @trace PART-04
        guarantee POWER_FACT_DERIVATION:
          ((power_observation == PowerObservation.Available &
            power_to_authorization.evidenceTrusted &
            power_to_authorization.availableForSupervision) |
           (power_observation == PowerObservation.Unavailable &
            power_to_authorization.evidenceTrusted &
            power_to_authorization.availableForSupervision == F) |
           (power_observation == PowerObservation.Invalid &
            power_to_authorization.evidenceTrusted == F &
            power_to_authorization.availableForSupervision == F)) &
          power_to_lifecycle.evidenceTrusted == power_to_authorization.evidenceTrusted &
          power_to_lifecycle.availableForSupervision ==
            power_to_authorization.availableForSupervision;
    }*/
  }

  // @trace PART-05
  part def SelfTestCycleOwner :> Thread {
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
  part def StartAuthorizationOwner :> Thread {
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
          authorization_to_lifecycle.conflict == F &
          authorization_to_outcome.decision == StartDecision.NoStart &
          authorization_to_outcome.conflict == F;
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
              (brake_facts.evidenceTrusted == F |
               health_qualification == HealthQualification.Invalid |
               power_facts.evidenceTrusted == F);
            guarantee authorization_to_lifecycle.decision == StartDecision.DenyInvalid;
          // @trace CASE-04
          case CASE_04_DENY_NOT_READY:
            assume request_facts.disposition == RequestDisposition.StartCandidate &
              brake_facts.evidenceTrusted & power_facts.evidenceTrusted &
              health_qualification != HealthQualification.Invalid &
              (brake_facts.readyForAdmission == F |
               health_qualification == HealthQualification.NotReady |
               power_facts.availableForSupervision == F);
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
  part def LifecycleRecoveryOwner :> Thread {
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
              request_facts.offActive == F &
              (brake_facts.evidenceTrusted == F |
               brake_facts.readyForAdmission == F |
               health_qualification != HealthQualification.Ready |
               power_facts.evidenceTrusted == F |
               power_facts.availableForSupervision == F);
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.Clear &
              (((brake_facts.evidenceTrusted == F |
                 health_qualification == HealthQualification.Invalid |
                 power_facts.evidenceTrusted == F) &
                applied_lifecycle.reason == LifecycleReason.QualificationInvalid) |
               (brake_facts.evidenceTrusted &
                health_qualification != HealthQualification.Invalid &
                power_facts.evidenceTrusted &
                applied_lifecycle.reason == LifecycleReason.QualificationNotReady));
          // @trace CASE-10
          case CASE_10_START_TEST_FAILURE:
            assume In(lifecycleModeMemory) == LifecycleMode.Starting &
              request_facts.offActive == F &
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
              request_facts.offActive == F &
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
              request_facts.offActive == F &
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
              request_facts.offActive == F &
              (health_qualification != HealthQualification.Ready |
               power_facts.evidenceTrusted == F |
               power_facts.availableForSupervision == F |
               cycle_assessment != CycleAssessment.StartPassed);
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-15
          case CASE_15_RETAIN_ON:
            assume In(lifecycleModeMemory) == LifecycleMode.On &
              request_facts.offActive == F &
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
              request_facts.offActive == F &
              (brake_facts.evidenceTrusted == F |
               brake_facts.readyForAdmission == F |
               health_qualification != HealthQualification.Ready |
               power_facts.evidenceTrusted == F |
               power_facts.availableForSupervision == F);
            guarantee lifecycleModeMemory == LifecycleMode.Degraded &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.Ordinary;
          // @trace CASE-18
          case CASE_18_BEGIN_RECOVERY:
            assume In(lifecycleModeMemory) == LifecycleMode.Degraded &
              request_facts.offActive == F &
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
              request_facts.offActive == F &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              request_facts.freshReturn == F &
              cycle_assessment == CycleAssessment.RecoveryPassed;
            guarantee lifecycleModeMemory == LifecycleMode.Off &
              test_cycle_directive == TestCycleDirective.Clear &
              applied_lifecycle.reason == LifecycleReason.RecoveryCompleted;
          // @trace CASE-20
          case CASE_20_RECOVERY_WAIT:
            assume In(lifecycleModeMemory) == LifecycleMode.Degraded &
              request_facts.offActive == F &
              brake_facts.evidenceTrusted & brake_facts.readyForAdmission &
              health_qualification == HealthQualification.Ready &
              power_facts.evidenceTrusted & power_facts.availableForSupervision &
              request_facts.freshReturn == F &
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
  part def CoordinatedOutcomeOwner :> Thread {
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
              authorization.conflict == F &
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

  // @generated-support CONSTR-01 behavior-free container and transparent boundary endpoints.
  part def VehicleSupervisorProcess :> Process {
    // @generated-support Exact transparent endpoint for INT-01.
    port request_levels : DataPort { in :>> type : RequestLevels; }
    // @generated-support Exact transparent endpoint for INT-02.
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    // @generated-support Exact transparent endpoint for INT-03.
    port health_observation : DataPort { in :>> type : HealthObservation; }
    // @generated-support Exact transparent endpoint for INT-04.
    port power_observation : DataPort { in :>> type : PowerObservation; }
    // @generated-support Exact transparent endpoint for INT-05.
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    // @generated-support Exact transparent endpoint for INT-19.
    port control_frame : DataPort { out :>> type : ControlFrame; }

    // @trace PART-01
    part request_priority_owner : RequestPriorityOwner;
    // @trace PART-02
    part brake_qualification_owner : BrakeQualificationOwner;
    // @trace PART-03
    part health_qualification_owner : HealthQualificationOwner;
    // @trace PART-04
    part power_qualification_owner : PowerQualificationOwner;
    // @trace PART-05
    part self_test_cycle_owner : SelfTestCycleOwner;
    // @trace PART-06
    part start_authorization_owner : StartAuthorizationOwner;
    // @trace PART-07
    part lifecycle_recovery_owner : LifecycleRecoveryOwner;
    // @trace PART-08
    part coordinated_outcome_owner : CoordinatedOutcomeOwner;

    // @trace INT-01
    connection int01 : PortConnection connect request_levels to request_priority_owner.request_levels;
    // @trace INT-02
    connection int02 : PortConnection connect brake_observation to brake_qualification_owner.brake_observation;
    // @trace INT-03
    connection int03 : PortConnection connect health_observation to health_qualification_owner.health_observation;
    // @trace INT-04
    connection int04 : PortConnection connect power_observation to power_qualification_owner.power_observation;
    // @trace INT-05
    connection int05 : PortConnection connect self_test_observation to self_test_cycle_owner.self_test_observation;
    // @trace INT-06
    connection int06 : PortConnection connect request_priority_owner.request_to_authorization to start_authorization_owner.request_facts;
    // @trace INT-07
    connection int07 : PortConnection connect request_priority_owner.request_to_lifecycle to lifecycle_recovery_owner.request_facts;
    // @trace INT-08
    connection int08 : PortConnection connect brake_qualification_owner.brake_to_authorization to start_authorization_owner.brake_facts;
    // @trace INT-09
    connection int09 : PortConnection connect brake_qualification_owner.brake_to_lifecycle to lifecycle_recovery_owner.brake_facts;
    // @trace INT-10
    connection int10 : PortConnection connect health_qualification_owner.health_to_authorization to start_authorization_owner.health_qualification;
    // @trace INT-11
    connection int11 : PortConnection connect health_qualification_owner.health_to_lifecycle to lifecycle_recovery_owner.health_qualification;
    // @trace INT-12
    connection int12 : PortConnection connect power_qualification_owner.power_to_authorization to start_authorization_owner.power_facts;
    // @trace INT-13
    connection int13 : PortConnection connect power_qualification_owner.power_to_lifecycle to lifecycle_recovery_owner.power_facts;
    // @trace INT-14
    connection int14 : PortConnection connect self_test_cycle_owner.cycle_assessment to lifecycle_recovery_owner.cycle_assessment;
    // @trace INT-15
    connection int15 : PortConnection connect start_authorization_owner.authorization_to_lifecycle to lifecycle_recovery_owner.authorization;
    // @trace INT-16
    connection int16 : PortConnection connect start_authorization_owner.authorization_to_outcome to coordinated_outcome_owner.authorization;
    // @trace INT-17
    connection int17 : PortConnection connect lifecycle_recovery_owner.test_cycle_directive to self_test_cycle_owner.test_cycle_directive;
    // @trace INT-18
    connection int18 : PortConnection connect lifecycle_recovery_owner.applied_lifecycle to coordinated_outcome_owner.applied_lifecycle;
    // @trace INT-19
    connection int19 : PortConnection connect coordinated_outcome_owner.control_frame to control_frame;
  }

  // @trace BOUND-01
  part def VehicleStartReadinessRecoverySupervisorSystem :> System {
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

    // @generated-support Sole behavior-free Process authorized by CONSTR-01.
    part vehicle_supervisor_process : VehicleSupervisorProcess;

    // @generated-support Transparent root/Process delegation for exact abstract INT-01.
    connection support01 : PortConnection connect request_levels to vehicle_supervisor_process.request_levels;
    // @generated-support Transparent root/Process delegation for exact abstract INT-02.
    connection support02 : PortConnection connect brake_observation to vehicle_supervisor_process.brake_observation;
    // @generated-support Transparent root/Process delegation for exact abstract INT-03.
    connection support03 : PortConnection connect health_observation to vehicle_supervisor_process.health_observation;
    // @generated-support Transparent root/Process delegation for exact abstract INT-04.
    connection support04 : PortConnection connect power_observation to vehicle_supervisor_process.power_observation;
    // @generated-support Transparent root/Process delegation for exact abstract INT-05.
    connection support05 : PortConnection connect self_test_observation to vehicle_supervisor_process.self_test_observation;
    // @generated-support Transparent Process/root delegation for exact abstract INT-19.
    connection support06 : PortConnection connect vehicle_supervisor_process.control_frame to control_frame;
  }

  // @trace BOUND-01
  part vehicle_start_readiness_recovery_supervisor : VehicleStartReadinessRecoverySupervisorSystem;
}
