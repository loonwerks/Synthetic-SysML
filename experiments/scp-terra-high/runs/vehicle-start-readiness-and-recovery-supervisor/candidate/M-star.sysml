// Retained architecture checkpoint: types, ports, usages, and connections only.
// GUMBO behavior is intentionally absent from this stage.

package Vehicle_Start_Readiness_Recovery_Supervisor {
  private import HAMR::*;

  enum def BrakeObservation { enum Pressed; enum Released; enum Invalid; }
  enum def ThermalCondition { enum Normal; enum OverMaximum; enum Invalid; }
  enum def MaintenanceCondition { enum NotDue; enum Due; enum Invalid; }
  enum def HealthQualification { enum Ready; enum NotReady; enum Invalid; }
  enum def PowerObservation { enum Available; enum Unavailable; enum Invalid; }
  enum def SelfTestObservation { enum NoEvent; enum FreshPass; enum FreshFail; enum Invalid; }
  enum def RequestDisposition { enum OffDominant; enum ReturnCandidate; enum StartCandidate; enum None; }
  enum def StartDecision { enum OffPriority; enum NoStart; enum DenyInvalid; enum DenyNotReady; enum BeginStartTest; }
  enum def CommittedTestCycle {
    enum Idle; enum AwaitingStart; enum AwaitingRecovery; enum StartPassed;
    enum RecoveryPassed; enum Failed; enum Invalid;
  }
  enum def CycleAssessment {
    enum Idle; enum AwaitingStart; enum AwaitingRecovery; enum StartPassed;
    enum RecoveryPassed; enum Failed; enum Invalid;
  }
  enum def LifecycleMode { enum Off; enum Starting; enum On; enum Degraded; }
  enum def LifecyclePreMode { enum Off; enum Starting; enum On; enum Degraded; }
  enum def TestCycleDirective { enum None; enum BeginStart; enum BeginRecovery; enum Clear; }
  enum def LifecycleDirectiveSnapshot { enum None; enum BeginStart; enum BeginRecovery; enum Clear; }
  enum def LifecycleReason {
    enum Ordinary; enum QualificationInvalid; enum QualificationNotReady;
    enum RecoveryAwaiting; enum RecoveryCompleted;
  }
  enum def StartEnable { enum Inhibit; enum Permit; }
  enum def ParkingBrakeCommand { enum Apply; enum Release; }
  enum def PowerDisposition { enum Isolate; enum TestOnly; enum Enable; }
  enum def SelfTestCommand { enum None; enum Initiate; }
  enum def SupervisoryStatus {
    enum Idle; enum RequestConflict; enum StartBlockedInvalid; enum StartBlockedNotReady;
    enum Testing; enum Operating; enum Degraded; enum RecoveryTesting;
    enum RecoveredAwaitFreshStart;
  }
  enum def ControlLifecycleMode { enum Off; enum Starting; enum On; enum Degraded; }

  // Every record member later inspected by GUMBO is an attribute.
  part def RequestLevels :> Data {
    attribute start : Base_Types::Boolean;
    attribute off : Base_Types::Boolean;
    attribute returnLevel : Base_Types::Boolean;
  }
  part def BrakeFacts :> Data {
    attribute evidenceTrusted : Base_Types::Boolean;
    attribute readyForAdmission : Base_Types::Boolean;
  }
  part def HealthObservation :> Data {
    attribute thermal : ThermalCondition;
    attribute maintenance : MaintenanceCondition;
  }
  part def PowerFacts :> Data {
    attribute evidenceTrusted : Base_Types::Boolean;
    attribute availableForSupervision : Base_Types::Boolean;
  }
  part def RequestFacts :> Data {
    attribute offActive : Base_Types::Boolean;
    attribute freshReturn : Base_Types::Boolean;
    attribute freshStart : Base_Types::Boolean;
    attribute conflict : Base_Types::Boolean;
    attribute disposition : RequestDisposition;
  }
  part def StartAuthorizationFacts :> Data {
    attribute decision : StartDecision;
    attribute conflict : Base_Types::Boolean;
  }
  part def AppliedLifecycleSnapshot :> Data {
    attribute cycleDirective : LifecycleDirectiveSnapshot;
    // Tool-required one-to-one pre-state projection authorized by CONSTR-04.
    attribute preModeSnapshot : LifecyclePreMode;
    attribute nextMode : LifecycleMode;
    attribute reason : LifecycleReason;
  }
  part def ControlFrame :> Data {
    attribute startEnable : StartEnable;
    attribute parkingBrake : ParkingBrakeCommand;
    attribute powerDisposition : PowerDisposition;
    attribute selfTestCommand : SelfTestCommand;
    // Tool-required one-to-one boundary projection authorized by CONSTR-04.
    attribute lifecycleMode : ControlLifecycleMode;
    attribute status : SupervisoryStatus;
  }

  part def RequestPriorityOwner :> Thread {
    port request_levels : DataPort { in :>> type : RequestLevels; }
    port request_to_authorization : DataPort { out :>> type : RequestFacts; }
    port request_to_lifecycle : DataPort { out :>> type : RequestFacts; }

    language "GUMBO" /*{
      state
        previousStart: Base_Types::Boolean;
        previousOff: Base_Types::Boolean;
        previousReturn: Base_Types::Boolean;

      initialize
        guarantee c1:
          not previousStart  and  not previousOff  and  not previousReturn  and 
          not request_to_authorization.offActive  and 
          not request_to_authorization.freshReturn  and 
          not request_to_authorization.freshStart  and 
          not request_to_authorization.conflict  and 
          request_to_authorization.disposition == RequestDisposition.None  and 
          not request_to_lifecycle.offActive  and 
          not request_to_lifecycle.freshReturn  and 
          not request_to_lifecycle.freshStart  and 
          not request_to_lifecycle.conflict  and 
          request_to_lifecycle.disposition == RequestDisposition.None;

      compute
        guarantee c2:
          request_to_authorization.offActive == request_levels.off  and 
          request_to_authorization.freshReturn == (request_levels.returnLevel  and  not In(previousReturn))  and 
          request_to_authorization.freshStart == (request_levels.start  and  not In(previousStart))  and 
          request_to_authorization.conflict ==
            ((request_to_authorization.offActive  and  request_to_authorization.freshReturn)  or 
             (request_to_authorization.offActive  and  request_to_authorization.freshStart)  or 
             (request_to_authorization.freshReturn  and  request_to_authorization.freshStart))  and 
          ((request_to_authorization.offActive  and 
            request_to_authorization.disposition == RequestDisposition.OffDominant)  or 
           (not request_to_authorization.offActive  and  request_to_authorization.freshReturn  and 
            request_to_authorization.disposition == RequestDisposition.ReturnCandidate)  or 
           (not request_to_authorization.offActive  and  not request_to_authorization.freshReturn  and 
            request_to_authorization.freshStart  and 
            request_to_authorization.disposition == RequestDisposition.StartCandidate)  or 
           (not request_to_authorization.offActive  and  not request_to_authorization.freshReturn  and 
            not request_to_authorization.freshStart  and 
            request_to_authorization.disposition == RequestDisposition.None))  and 
          request_to_lifecycle.offActive == request_to_authorization.offActive  and 
          request_to_lifecycle.freshReturn == request_to_authorization.freshReturn  and 
          request_to_lifecycle.freshStart == request_to_authorization.freshStart  and 
          request_to_lifecycle.conflict == request_to_authorization.conflict  and 
          request_to_lifecycle.disposition == request_to_authorization.disposition  and 
          previousStart == request_levels.start  and 
          previousOff == request_levels.off  and 
          previousReturn == request_levels.returnLevel;
    }*/
       
  }

  part def BrakeQualificationOwner :> Thread {
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    port brake_to_authorization : DataPort { out :>> type : BrakeFacts; }
    port brake_to_lifecycle : DataPort { out :>> type : BrakeFacts; }

    language "GUMBO" /*{
      initialize
        guarantee c3:
          not brake_to_authorization.evidenceTrusted  and 
          not brake_to_authorization.readyForAdmission  and 
          not brake_to_lifecycle.evidenceTrusted  and 
          not brake_to_lifecycle.readyForAdmission;

      compute
        guarantee c4:
          ((brake_observation == BrakeObservation.Pressed  and 
            brake_to_authorization.evidenceTrusted  and 
            brake_to_authorization.readyForAdmission)  or 
           (brake_observation == BrakeObservation.Released  and 
            brake_to_authorization.evidenceTrusted  and 
            not brake_to_authorization.readyForAdmission)  or 
           (brake_observation == BrakeObservation.Invalid  and 
            not brake_to_authorization.evidenceTrusted  and 
            not brake_to_authorization.readyForAdmission))  and 
          brake_to_lifecycle.evidenceTrusted == brake_to_authorization.evidenceTrusted  and 
          brake_to_lifecycle.readyForAdmission == brake_to_authorization.readyForAdmission;
    }*/
       
  }

  part def HealthQualificationOwner :> Thread {
    port health_observation : DataPort { in :>> type : HealthObservation; }
    port health_to_authorization : DataPort { out :>> type : HealthQualification; }
    port health_to_lifecycle : DataPort { out :>> type : HealthQualification; }

    language "GUMBO" /*{
      initialize
        guarantee c5:
          health_to_authorization == HealthQualification.Invalid  and 
          health_to_lifecycle == HealthQualification.Invalid;

      compute
        guarantee c6:
          (((health_observation.thermal == ThermalCondition.Invalid  or 
             health_observation.maintenance == MaintenanceCondition.Invalid)  and 
            health_to_authorization == HealthQualification.Invalid)  or 
           (health_observation.thermal != ThermalCondition.Invalid  and 
            health_observation.maintenance != MaintenanceCondition.Invalid  and 
            (health_observation.thermal == ThermalCondition.OverMaximum  or 
             health_observation.maintenance == MaintenanceCondition.Due)  and 
            health_to_authorization == HealthQualification.NotReady)  or 
           (health_observation.thermal == ThermalCondition.Normal  and 
            health_observation.maintenance == MaintenanceCondition.NotDue  and 
            health_to_authorization == HealthQualification.Ready))  and 
          health_to_lifecycle == health_to_authorization;
    }*/
       
  }

  part def PowerQualificationOwner :> Thread {
    port power_observation : DataPort { in :>> type : PowerObservation; }
    port power_to_authorization : DataPort { out :>> type : PowerFacts; }
    port power_to_lifecycle : DataPort { out :>> type : PowerFacts; }

    language "GUMBO" /*{
      initialize
        guarantee c7:
          not power_to_authorization.evidenceTrusted  and 
          not power_to_authorization.availableForSupervision  and 
          not power_to_lifecycle.evidenceTrusted  and 
          not power_to_lifecycle.availableForSupervision;

      compute
        guarantee c8:
          ((power_observation == PowerObservation.Available  and 
            power_to_authorization.evidenceTrusted  and 
            power_to_authorization.availableForSupervision)  or 
           (power_observation == PowerObservation.Unavailable  and 
            power_to_authorization.evidenceTrusted  and 
            not power_to_authorization.availableForSupervision)  or 
           (power_observation == PowerObservation.Invalid  and 
            not power_to_authorization.evidenceTrusted  and 
            not power_to_authorization.availableForSupervision))  and 
          power_to_lifecycle.evidenceTrusted == power_to_authorization.evidenceTrusted  and 
          power_to_lifecycle.availableForSupervision ==
            power_to_authorization.availableForSupervision;
    }*/
       
  }

  part def SelfTestCycleOwner :> Thread {
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    port test_cycle_directive : DataPort { in :>> type : TestCycleDirective; }
    port cycle_assessment : DataPort { out :>> type : CycleAssessment; }

    language "GUMBO" /*{
      state
        committedTestCycle: CommittedTestCycle;

      initialize
        guarantee c9:
          committedTestCycle == CommittedTestCycle.Idle  and 
          cycle_assessment == CycleAssessment.Idle;

      compute
        guarantee c10:
          ((In(committedTestCycle) == CommittedTestCycle.AwaitingStart  and 
            self_test_observation == SelfTestObservation.NoEvent  and 
            cycle_assessment == CycleAssessment.AwaitingStart)  or 
           (In(committedTestCycle) == CommittedTestCycle.AwaitingStart  and 
            self_test_observation == SelfTestObservation.FreshPass  and 
            cycle_assessment == CycleAssessment.StartPassed)  or 
           (In(committedTestCycle) == CommittedTestCycle.AwaitingStart  and 
            self_test_observation == SelfTestObservation.FreshFail  and 
            cycle_assessment == CycleAssessment.Failed)  or 
           (In(committedTestCycle) == CommittedTestCycle.AwaitingStart  and 
            self_test_observation == SelfTestObservation.Invalid  and 
            cycle_assessment == CycleAssessment.Invalid)  or 
           (In(committedTestCycle) == CommittedTestCycle.AwaitingRecovery  and 
            self_test_observation == SelfTestObservation.NoEvent  and 
            cycle_assessment == CycleAssessment.AwaitingRecovery)  or 
           (In(committedTestCycle) == CommittedTestCycle.AwaitingRecovery  and 
            self_test_observation == SelfTestObservation.FreshPass  and 
            cycle_assessment == CycleAssessment.RecoveryPassed)  or 
           (In(committedTestCycle) == CommittedTestCycle.AwaitingRecovery  and 
            self_test_observation == SelfTestObservation.FreshFail  and 
            cycle_assessment == CycleAssessment.Failed)  or 
           (In(committedTestCycle) == CommittedTestCycle.AwaitingRecovery  and 
            self_test_observation == SelfTestObservation.Invalid  and 
            cycle_assessment == CycleAssessment.Invalid)  or 
           ((In(committedTestCycle) == CommittedTestCycle.StartPassed  or 
             In(committedTestCycle) == CommittedTestCycle.RecoveryPassed)  and 
            self_test_observation == SelfTestObservation.Invalid  and 
            cycle_assessment == CycleAssessment.Invalid)  or 
           (In(committedTestCycle) == CommittedTestCycle.Idle  and 
            cycle_assessment == CycleAssessment.Idle)  or 
           (In(committedTestCycle) == CommittedTestCycle.StartPassed  and 
            self_test_observation != SelfTestObservation.Invalid  and 
            cycle_assessment == CycleAssessment.StartPassed)  or 
           (In(committedTestCycle) == CommittedTestCycle.RecoveryPassed  and 
            self_test_observation != SelfTestObservation.Invalid  and 
            cycle_assessment == CycleAssessment.RecoveryPassed)  or 
           (In(committedTestCycle) == CommittedTestCycle.Failed  and 
            cycle_assessment == CycleAssessment.Failed)  or 
           (In(committedTestCycle) == CommittedTestCycle.Invalid  and 
            cycle_assessment == CycleAssessment.Invalid));

        guarantee c11:
          ((test_cycle_directive == TestCycleDirective.Clear  and 
            committedTestCycle == CommittedTestCycle.Idle)  or 
           (test_cycle_directive == TestCycleDirective.BeginStart  and 
            committedTestCycle == CommittedTestCycle.AwaitingStart)  or 
           (test_cycle_directive == TestCycleDirective.BeginRecovery  and 
            committedTestCycle == CommittedTestCycle.AwaitingRecovery)  or 
           (test_cycle_directive == TestCycleDirective.None  and 
            ((cycle_assessment == CycleAssessment.Idle  and 
              committedTestCycle == CommittedTestCycle.Idle)  or 
             (cycle_assessment == CycleAssessment.AwaitingStart  and 
              committedTestCycle == CommittedTestCycle.AwaitingStart)  or 
             (cycle_assessment == CycleAssessment.AwaitingRecovery  and 
              committedTestCycle == CommittedTestCycle.AwaitingRecovery)  or 
             (cycle_assessment == CycleAssessment.StartPassed  and 
              committedTestCycle == CommittedTestCycle.StartPassed)  or 
             (cycle_assessment == CycleAssessment.RecoveryPassed  and 
              committedTestCycle == CommittedTestCycle.RecoveryPassed)  or 
             (cycle_assessment == CycleAssessment.Failed  and 
              committedTestCycle == CommittedTestCycle.Failed)  or 
             (cycle_assessment == CycleAssessment.Invalid  and 
              committedTestCycle == CommittedTestCycle.Invalid))));
    }*/
       
  }

  part def StartAuthorizationOwner :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port brake_facts : DataPort { in :>> type : BrakeFacts; }
    port health_qualification : DataPort { in :>> type : HealthQualification; }
    port power_facts : DataPort { in :>> type : PowerFacts; }
    port authorization_to_lifecycle : DataPort { out :>> type : StartAuthorizationFacts; }
    port authorization_to_outcome : DataPort { out :>> type : StartAuthorizationFacts; }
    language "GUMBO" /*{
      initialize
        guarantee c12:
          authorization_to_lifecycle.decision == StartDecision.NoStart  and 
          not authorization_to_lifecycle.conflict  and 
          authorization_to_outcome.decision == StartDecision.NoStart  and 
          not authorization_to_outcome.conflict;

      compute
        guarantee c13:
          authorization_to_lifecycle.conflict == request_facts.conflict  and 
          authorization_to_outcome.conflict == authorization_to_lifecycle.conflict  and 
          authorization_to_outcome.decision == authorization_to_lifecycle.decision;
        guarantee g1:
          ((request_facts.disposition == RequestDisposition.OffDominant) implies (authorization_to_lifecycle.decision == StartDecision.OffPriority));
        guarantee g2:
          ((request_facts.disposition == RequestDisposition.ReturnCandidate  or 
            request_facts.disposition == RequestDisposition.None) implies (authorization_to_lifecycle.decision == StartDecision.NoStart));
        guarantee g3:
          ((request_facts.disposition == RequestDisposition.StartCandidate  and 
            (not brake_facts.evidenceTrusted  or 
             health_qualification == HealthQualification.Invalid  or 
             not power_facts.evidenceTrusted)) implies (authorization_to_lifecycle.decision == StartDecision.DenyInvalid));
        guarantee g4:
          ((request_facts.disposition == RequestDisposition.StartCandidate  and 
            brake_facts.evidenceTrusted  and  power_facts.evidenceTrusted  and 
            health_qualification != HealthQualification.Invalid  and 
            (not brake_facts.readyForAdmission  or 
             health_qualification == HealthQualification.NotReady  or 
             not power_facts.availableForSupervision)) implies (authorization_to_lifecycle.decision == StartDecision.DenyNotReady));
        guarantee g5:
          ((request_facts.disposition == RequestDisposition.StartCandidate  and 
            brake_facts.evidenceTrusted  and  brake_facts.readyForAdmission  and 
            health_qualification == HealthQualification.Ready  and 
            power_facts.evidenceTrusted  and  power_facts.availableForSupervision) implies (authorization_to_lifecycle.decision == StartDecision.BeginStartTest));
    }*/
                                                                     
                                                         
                                                                                        
                           
                                        
                                                                                   
                                                                           
                                                                 
                                                                                
                                                                                          
       
  }

  part def LifecycleRecoveryOwner :> Thread {
    port request_facts : DataPort { in :>> type : RequestFacts; }
    port brake_facts : DataPort { in :>> type : BrakeFacts; }
    port health_qualification : DataPort { in :>> type : HealthQualification; }
    port power_facts : DataPort { in :>> type : PowerFacts; }
    port cycle_assessment : DataPort { in :>> type : CycleAssessment; }
    port authorization : DataPort { in :>> type : StartAuthorizationFacts; }
    port test_cycle_directive : DataPort { out :>> type : TestCycleDirective; }
    port applied_lifecycle : DataPort { out :>> type : AppliedLifecycleSnapshot; }

    language "GUMBO" /*{
      state
        lifecycleModeMemory: LifecycleMode;

      initialize
        guarantee c29:
          lifecycleModeMemory == LifecycleMode.Off  and 
          test_cycle_directive == TestCycleDirective.None  and 
          applied_lifecycle.preModeSnapshot == LifecyclePreMode.Off  and 
          applied_lifecycle.nextMode == LifecycleMode.Off  and 
          applied_lifecycle.reason == LifecycleReason.Ordinary  and 
          applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.None;

      compute
        guarantee c30:
          ((In(lifecycleModeMemory) == LifecycleMode.Off  and 
            applied_lifecycle.preModeSnapshot == LifecyclePreMode.Off)  or 
           (In(lifecycleModeMemory) == LifecycleMode.Starting  and 
            applied_lifecycle.preModeSnapshot == LifecyclePreMode.Starting)  or 
           (In(lifecycleModeMemory) == LifecycleMode.On  and 
            applied_lifecycle.preModeSnapshot == LifecyclePreMode.On)  or 
           (In(lifecycleModeMemory) == LifecycleMode.Degraded  and 
            applied_lifecycle.preModeSnapshot == LifecyclePreMode.Degraded))  and 
          applied_lifecycle.nextMode == lifecycleModeMemory  and 
          ((test_cycle_directive == TestCycleDirective.None  and 
            applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.None)  or 
           (test_cycle_directive == TestCycleDirective.BeginStart  and 
            applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginStart)  or 
           (test_cycle_directive == TestCycleDirective.BeginRecovery  and 
            applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginRecovery)  or 
           (test_cycle_directive == TestCycleDirective.Clear  and 
            applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.Clear));
        guarantee g6:
          ((In(lifecycleModeMemory) == LifecycleMode.Off  and 
            authorization.decision == StartDecision.BeginStartTest) implies (lifecycleModeMemory == LifecycleMode.Starting  and 
            test_cycle_directive == TestCycleDirective.BeginStart  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g7:
          ((In(lifecycleModeMemory) == LifecycleMode.Off  and 
            authorization.decision != StartDecision.BeginStartTest) implies (lifecycleModeMemory == LifecycleMode.Off  and 
            test_cycle_directive == TestCycleDirective.None  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g8:
          ((In(lifecycleModeMemory) == LifecycleMode.Starting  and  request_facts.offActive) implies (lifecycleModeMemory == LifecycleMode.Off  and 
            test_cycle_directive == TestCycleDirective.Clear  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g9:
          ((In(lifecycleModeMemory) == LifecycleMode.Starting  and  not request_facts.offActive  and 
            (not brake_facts.evidenceTrusted  or  not brake_facts.readyForAdmission  or 
             health_qualification != HealthQualification.Ready  or 
             not power_facts.evidenceTrusted  or  not power_facts.availableForSupervision)) implies (lifecycleModeMemory == LifecycleMode.Degraded  and 
            test_cycle_directive == TestCycleDirective.Clear  and 
            (((not brake_facts.evidenceTrusted  or 
               health_qualification == HealthQualification.Invalid  or 
               not power_facts.evidenceTrusted)  and 
              applied_lifecycle.reason == LifecycleReason.QualificationInvalid)  or 
             (brake_facts.evidenceTrusted  and 
              health_qualification != HealthQualification.Invalid  and 
              power_facts.evidenceTrusted  and 
              applied_lifecycle.reason == LifecycleReason.QualificationNotReady))));
        guarantee g10:
          ((In(lifecycleModeMemory) == LifecycleMode.Starting  and  not request_facts.offActive  and 
            brake_facts.evidenceTrusted  and  brake_facts.readyForAdmission  and 
            health_qualification == HealthQualification.Ready  and 
            power_facts.evidenceTrusted  and  power_facts.availableForSupervision  and 
            (cycle_assessment == CycleAssessment.Failed  or 
             cycle_assessment == CycleAssessment.Invalid)) implies (lifecycleModeMemory == LifecycleMode.Degraded  and 
            test_cycle_directive == TestCycleDirective.Clear  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g11:
          ((In(lifecycleModeMemory) == LifecycleMode.Starting  and  not request_facts.offActive  and 
            brake_facts.evidenceTrusted  and  brake_facts.readyForAdmission  and 
            health_qualification == HealthQualification.Ready  and 
            power_facts.evidenceTrusted  and  power_facts.availableForSupervision  and 
            (cycle_assessment == CycleAssessment.Idle  or 
             cycle_assessment == CycleAssessment.AwaitingStart  or 
             cycle_assessment == CycleAssessment.AwaitingRecovery  or 
             cycle_assessment == CycleAssessment.RecoveryPassed)) implies (lifecycleModeMemory == LifecycleMode.Starting  and 
            test_cycle_directive == TestCycleDirective.None  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g12:
          ((In(lifecycleModeMemory) == LifecycleMode.Starting  and  not request_facts.offActive  and 
            brake_facts.evidenceTrusted  and  brake_facts.readyForAdmission  and 
            health_qualification == HealthQualification.Ready  and 
            power_facts.evidenceTrusted  and  power_facts.availableForSupervision  and 
            cycle_assessment == CycleAssessment.StartPassed) implies (lifecycleModeMemory == LifecycleMode.On  and 
            test_cycle_directive == TestCycleDirective.None  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g13:
          ((In(lifecycleModeMemory) == LifecycleMode.On  and  request_facts.offActive) implies (lifecycleModeMemory == LifecycleMode.Off  and 
            test_cycle_directive == TestCycleDirective.Clear  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g14:
          ((In(lifecycleModeMemory) == LifecycleMode.On  and  not request_facts.offActive  and 
            (health_qualification != HealthQualification.Ready  or 
             not power_facts.evidenceTrusted  or  not power_facts.availableForSupervision  or 
             cycle_assessment != CycleAssessment.StartPassed)) implies (lifecycleModeMemory == LifecycleMode.Degraded  and 
            test_cycle_directive == TestCycleDirective.Clear  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g15:
          ((In(lifecycleModeMemory) == LifecycleMode.On  and  not request_facts.offActive  and 
            health_qualification == HealthQualification.Ready  and 
            power_facts.evidenceTrusted  and  power_facts.availableForSupervision  and 
            cycle_assessment == CycleAssessment.StartPassed) implies (lifecycleModeMemory == LifecycleMode.On  and 
            test_cycle_directive == TestCycleDirective.None  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g16:
          ((In(lifecycleModeMemory) == LifecycleMode.Degraded  and  request_facts.offActive) implies (lifecycleModeMemory == LifecycleMode.Off  and 
            test_cycle_directive == TestCycleDirective.Clear  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g17:
          ((In(lifecycleModeMemory) == LifecycleMode.Degraded  and  not request_facts.offActive  and 
            (not brake_facts.evidenceTrusted  or  not brake_facts.readyForAdmission  or 
             health_qualification != HealthQualification.Ready  or 
             not power_facts.evidenceTrusted  or  not power_facts.availableForSupervision)) implies (lifecycleModeMemory == LifecycleMode.Degraded  and 
            test_cycle_directive == TestCycleDirective.Clear  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g18:
          ((In(lifecycleModeMemory) == LifecycleMode.Degraded  and  not request_facts.offActive  and 
            brake_facts.evidenceTrusted  and  brake_facts.readyForAdmission  and 
            health_qualification == HealthQualification.Ready  and 
            power_facts.evidenceTrusted  and  power_facts.availableForSupervision  and 
            request_facts.freshReturn) implies (lifecycleModeMemory == LifecycleMode.Degraded  and 
            test_cycle_directive == TestCycleDirective.BeginRecovery  and 
            applied_lifecycle.reason == LifecycleReason.Ordinary));
        guarantee g19:
          ((In(lifecycleModeMemory) == LifecycleMode.Degraded  and  not request_facts.offActive  and 
            brake_facts.evidenceTrusted  and  brake_facts.readyForAdmission  and 
            health_qualification == HealthQualification.Ready  and 
            power_facts.evidenceTrusted  and  power_facts.availableForSupervision  and 
            not request_facts.freshReturn  and 
            cycle_assessment == CycleAssessment.RecoveryPassed) implies (lifecycleModeMemory == LifecycleMode.Off  and 
            test_cycle_directive == TestCycleDirective.Clear  and 
            applied_lifecycle.reason == LifecycleReason.RecoveryCompleted));
        guarantee g20:
          ((In(lifecycleModeMemory) == LifecycleMode.Degraded  and  not request_facts.offActive  and 
            brake_facts.evidenceTrusted  and  brake_facts.readyForAdmission  and 
            health_qualification == HealthQualification.Ready  and 
            power_facts.evidenceTrusted  and  power_facts.availableForSupervision  and 
            not request_facts.freshReturn  and 
            cycle_assessment != CycleAssessment.RecoveryPassed) implies (lifecycleModeMemory == LifecycleMode.Degraded  and 
            test_cycle_directive == TestCycleDirective.None  and 
            ((cycle_assessment == CycleAssessment.AwaitingRecovery  and 
              applied_lifecycle.reason == LifecycleReason.RecoveryAwaiting)  or 
             (cycle_assessment != CycleAssessment.AwaitingRecovery  and 
              applied_lifecycle.reason == LifecycleReason.Ordinary))));
    }*/

                        
           
                          
                                           
                
                                     
                        
                                         
                                                    
                                                           
                                                                     
                                                           
                                                                
                                                                              
             
                                     
                         
                                              
                                                          
                                                                        
                                                               
                                                                             
                                                         
                                                                       
                                                               
                                                                              
                                                             
                                                             
                                                                                  
                                                                   
                                                                                        
                                                                      
                                                                                           
                                                              
                                                                                   
                     
                           
                                   
                                                                 
                                                                     
                                                                     
                                                                     
                                                                   
                           
                                  
                                                                 
                                                                     
                                                                
                                                               
                                                                   
                           
                                    
                                                                      
                                      
                                                                
                                                                
                                                                   
                           
                                                   
                                                                      
                                            
                                                 
                                                   
                                                                  
                                                 
                                                         
                                                                     
                                                                
                                                   
                                                                      
                                                    
                                                                                   
                                             
                                                                     
                                             
                                                                                    
                           
                                          
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                                           
                                                            
                                                                     
                                                                
                                                                   
                           
                                     
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                                         
                                                                  
                                                                     
                                                                   
                                                                     
                                                               
                                                                   
                           
                                  
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                                              
                                                               
                                                               
                                                                   
                           
                              
                                                                
                                      
                                                                
                                                                
                                                                   
                           
                                            
                                                                
                                            
                                                                  
                                                 
                                                         
                                                                
                                                                     
                                                                
                                                                   
                           
                                 
                                                                
                                            
                                                                 
                                                                                 
                                                              
                                                               
                                                               
                                                                   
                           
                                    
                                                                      
                                      
                                                                
                                                                
                                                                   
                           
                                                  
                                                                      
                                            
                                                 
                                                   
                                                                  
                                                 
                                                         
                                                                     
                                                                
                                                                   
                           
                                      
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                        
                                                                     
                                                                        
                                                                   
                           
                                         
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                              
                                                                 
                                                                
                                                                
                                                                            
                           
                                     
                                                                      
                                            
                                                                           
                                                                 
                                                                                 
                                              
                                                                 
                                                                     
                                                               
                                                                      
                                                                               
                                                                      
                                                                       
       
  }

  part def CoordinatedOutcomeOwner :> Thread {
    port authorization : DataPort { in :>> type : StartAuthorizationFacts; }
    port applied_lifecycle : DataPort { in :>> type : AppliedLifecycleSnapshot; }
    port control_frame : DataPort { out :>> type : ControlFrame; }

    language "GUMBO" /*{
      initialize
        guarantee c76:
          control_frame.startEnable == StartEnable.Inhibit  and 
          control_frame.parkingBrake == ParkingBrakeCommand.Apply  and 
          control_frame.powerDisposition == PowerDisposition.Isolate  and 
          control_frame.selfTestCommand == SelfTestCommand.None  and 
          control_frame.lifecycleMode == ControlLifecycleMode.Off  and 
          control_frame.status == SupervisoryStatus.Idle;

      compute
        guarantee g21:
          ((applied_lifecycle.nextMode == LifecycleMode.Starting) implies (control_frame.startEnable == StartEnable.Inhibit  and 
            control_frame.parkingBrake == ParkingBrakeCommand.Apply  and 
            control_frame.powerDisposition == PowerDisposition.TestOnly  and 
            ((applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginStart  and 
              control_frame.selfTestCommand == SelfTestCommand.Initiate)  or 
             (applied_lifecycle.cycleDirective != LifecycleDirectiveSnapshot.BeginStart  and 
              control_frame.selfTestCommand == SelfTestCommand.None))  and 
            control_frame.lifecycleMode == ControlLifecycleMode.Starting  and 
            control_frame.status == SupervisoryStatus.Testing));
        guarantee g22:
          ((applied_lifecycle.nextMode == LifecycleMode.On) implies (control_frame.startEnable == StartEnable.Permit  and 
            control_frame.parkingBrake == ParkingBrakeCommand.Release  and 
            control_frame.powerDisposition == PowerDisposition.Enable  and 
            control_frame.selfTestCommand == SelfTestCommand.None  and 
            control_frame.lifecycleMode == ControlLifecycleMode.On  and 
            control_frame.status == SupervisoryStatus.Operating));
        guarantee g23:
          ((applied_lifecycle.nextMode == LifecycleMode.Degraded) implies (control_frame.startEnable == StartEnable.Inhibit  and 
            control_frame.parkingBrake == ParkingBrakeCommand.Apply  and 
            control_frame.powerDisposition == PowerDisposition.Isolate  and 
            ((applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginRecovery  and 
              control_frame.selfTestCommand == SelfTestCommand.Initiate)  or 
             (applied_lifecycle.cycleDirective != LifecycleDirectiveSnapshot.BeginRecovery  and 
              control_frame.selfTestCommand == SelfTestCommand.None))  and 
            control_frame.lifecycleMode == ControlLifecycleMode.Degraded  and 
            (((applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.BeginRecovery  or 
               applied_lifecycle.reason == LifecycleReason.RecoveryAwaiting)  and 
              control_frame.status == SupervisoryStatus.RecoveryTesting)  or 
             (applied_lifecycle.cycleDirective != LifecycleDirectiveSnapshot.BeginRecovery  and 
              applied_lifecycle.reason != LifecycleReason.RecoveryAwaiting  and 
              control_frame.status == SupervisoryStatus.Degraded))));
        guarantee g24:
          ((applied_lifecycle.nextMode == LifecycleMode.Off) implies (control_frame.startEnable == StartEnable.Inhibit  and 
            control_frame.parkingBrake == ParkingBrakeCommand.Apply  and 
            control_frame.powerDisposition == PowerDisposition.Isolate  and 
            control_frame.selfTestCommand == SelfTestCommand.None  and 
            control_frame.lifecycleMode == ControlLifecycleMode.Off  and 
            ((applied_lifecycle.reason == LifecycleReason.RecoveryCompleted  and 
              control_frame.status == SupervisoryStatus.RecoveredAwaitFreshStart)  or 
             (applied_lifecycle.reason != LifecycleReason.RecoveryCompleted  and 
              authorization.decision == StartDecision.DenyInvalid  and 
              control_frame.status == SupervisoryStatus.StartBlockedInvalid)  or 
             (applied_lifecycle.reason != LifecycleReason.RecoveryCompleted  and 
              authorization.decision != StartDecision.DenyInvalid  and 
              authorization.decision == StartDecision.DenyNotReady  and 
              control_frame.status == SupervisoryStatus.StartBlockedNotReady)  or 
             (applied_lifecycle.reason != LifecycleReason.RecoveryCompleted  and 
              authorization.decision != StartDecision.DenyInvalid  and 
              authorization.decision != StartDecision.DenyNotReady  and 
              authorization.conflict  and 
              control_frame.status == SupervisoryStatus.RequestConflict)  or 
             (applied_lifecycle.reason != LifecycleReason.RecoveryCompleted  and 
              authorization.decision != StartDecision.DenyInvalid  and 
              authorization.decision != StartDecision.DenyNotReady  and 
              not authorization.conflict  and 
              control_frame.status == SupervisoryStatus.Idle))));

        guarantee c89:
          ((applied_lifecycle.nextMode == LifecycleMode.Off  and 
            control_frame.lifecycleMode == ControlLifecycleMode.Off)  or 
           (applied_lifecycle.nextMode == LifecycleMode.Starting  and 
            control_frame.lifecycleMode == ControlLifecycleMode.Starting)  or 
           (applied_lifecycle.nextMode == LifecycleMode.On  and 
            control_frame.lifecycleMode == ControlLifecycleMode.On)  or 
           (applied_lifecycle.nextMode == LifecycleMode.Degraded  and 
            control_frame.lifecycleMode == ControlLifecycleMode.Degraded))  and 
          ((control_frame.startEnable == StartEnable.Permit  and 
            control_frame.parkingBrake == ParkingBrakeCommand.Release  and 
            control_frame.powerDisposition == PowerDisposition.Enable  and 
            control_frame.lifecycleMode == ControlLifecycleMode.On)  or 
           (control_frame.startEnable == StartEnable.Inhibit  and 
            control_frame.parkingBrake == ParkingBrakeCommand.Apply  and 
            control_frame.powerDisposition != PowerDisposition.Enable  and 
            control_frame.lifecycleMode != ControlLifecycleMode.On));
    }*/

                        
                
                        
                                             
                                                            
                                                                   
                                                                      
                                                                 
                                                                   
                                                         
             
                        
                                                
                                                                  
                                                              
                                                                     
                                                                         
                                                                                         
                                                                          
                                                                                         
                                                                       
                                                                          
                                                                
                                                            
                                                             
                                                                       
                                                                       
                                                                   
                                                                    
                                                                  
                                                                 
                                                            
                        
                                         
                                                                  
                                                              
                                                                     
                                                                        
                                                                                            
                                                                          
                                                                                            
                                                                       
                                                                          
                                                                                             
                                                                              
                                                                          
                                                                                            
                                                                            
                                                                     
                                                                 
                        
                                    
                                                             
                                                              
                                                                     
                                                                        
                                                                   
                                                                     
                                                                             
                                                                                   
                                                                             
                                                                   
                                                                              
                                                                             
                                                                   
                                                                    
                                                                               
                                                                             
                                                                   
                                                                    
                                      
                                                                          
                                                                             
                                                                   
                                                                    
                                           
                                                                 
                                                            
                        
                                          
                                                              
                                                                       
                                                                   
                                                                            
                                                             
                                                                      
                                                                   
                                                                              
                                                             
                                                                       
                                                                       
                                                                     
                                                              
                                                                     
                                                                       
                                                                     
       
  }

  part def VehicleSupervisorProcess :> Process {
    port request_levels : DataPort { in :>> type : RequestLevels; }
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    port health_observation : DataPort { in :>> type : HealthObservation; }
    port power_observation : DataPort { in :>> type : PowerObservation; }
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    port control_frame : DataPort { out :>> type : ControlFrame; }

    part request_priority_owner : RequestPriorityOwner;
    part brake_qualification_owner : BrakeQualificationOwner;
    part health_qualification_owner : HealthQualificationOwner;
    part power_qualification_owner : PowerQualificationOwner;
    part self_test_cycle_owner : SelfTestCycleOwner;
    part start_authorization_owner : StartAuthorizationOwner;
    part lifecycle_recovery_owner : LifecycleRecoveryOwner;
    part coordinated_outcome_owner : CoordinatedOutcomeOwner;

    connection int01 : PortConnection connect request_levels to request_priority_owner.request_levels;
    connection int02 : PortConnection connect brake_observation to brake_qualification_owner.brake_observation;
    connection int03 : PortConnection connect health_observation to health_qualification_owner.health_observation;
    connection int04 : PortConnection connect power_observation to power_qualification_owner.power_observation;
    connection int05 : PortConnection connect self_test_observation to self_test_cycle_owner.self_test_observation;
    connection int06 : PortConnection connect request_priority_owner.request_to_authorization to start_authorization_owner.request_facts;
    connection int07 : PortConnection connect request_priority_owner.request_to_lifecycle to lifecycle_recovery_owner.request_facts;
    connection int08 : PortConnection connect brake_qualification_owner.brake_to_authorization to start_authorization_owner.brake_facts;
    connection int09 : PortConnection connect brake_qualification_owner.brake_to_lifecycle to lifecycle_recovery_owner.brake_facts;
    connection int10 : PortConnection connect health_qualification_owner.health_to_authorization to start_authorization_owner.health_qualification;
    connection int11 : PortConnection connect health_qualification_owner.health_to_lifecycle to lifecycle_recovery_owner.health_qualification;
    connection int12 : PortConnection connect power_qualification_owner.power_to_authorization to start_authorization_owner.power_facts;
    connection int13 : PortConnection connect power_qualification_owner.power_to_lifecycle to lifecycle_recovery_owner.power_facts;
    connection int14 : PortConnection connect self_test_cycle_owner.cycle_assessment to lifecycle_recovery_owner.cycle_assessment;
    connection int15 : PortConnection connect start_authorization_owner.authorization_to_lifecycle to lifecycle_recovery_owner.authorization;
    connection int16 : PortConnection connect start_authorization_owner.authorization_to_outcome to coordinated_outcome_owner.authorization;
    connection int17 : PortConnection connect lifecycle_recovery_owner.test_cycle_directive to self_test_cycle_owner.test_cycle_directive;
    connection int18 : PortConnection connect lifecycle_recovery_owner.applied_lifecycle to coordinated_outcome_owner.applied_lifecycle;
    connection int19 : PortConnection connect coordinated_outcome_owner.control_frame to control_frame;
  }

  part def VehicleStartReadinessRecoverySupervisorSystem :> System {
    port request_levels : DataPort { in :>> type : RequestLevels; }
    port brake_observation : DataPort { in :>> type : BrakeObservation; }
    port health_observation : DataPort { in :>> type : HealthObservation; }
    port power_observation : DataPort { in :>> type : PowerObservation; }
    port self_test_observation : DataPort { in :>> type : SelfTestObservation; }
    port control_frame : DataPort { out :>> type : ControlFrame; }

    part vehicle_supervisor_process : VehicleSupervisorProcess;

    connection support01 : PortConnection connect request_levels to vehicle_supervisor_process.request_levels;
    connection support02 : PortConnection connect brake_observation to vehicle_supervisor_process.brake_observation;
    connection support03 : PortConnection connect health_observation to vehicle_supervisor_process.health_observation;
    connection support04 : PortConnection connect power_observation to vehicle_supervisor_process.power_observation;
    connection support05 : PortConnection connect self_test_observation to vehicle_supervisor_process.self_test_observation;
    connection support06 : PortConnection connect vehicle_supervisor_process.control_frame to control_frame;
  }

  part vehicle_start_readiness_recovery_supervisor : VehicleStartReadinessRecoverySupervisorSystem;
}
