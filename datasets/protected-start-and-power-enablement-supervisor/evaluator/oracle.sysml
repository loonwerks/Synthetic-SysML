// Canonical final source: retained architecture plus approved GUMBO behavior.
// @trace PURPOSE-01
package Protected_Start_Power_Supervisor {
  private import HAMR::*;

  // Closed finite boundary and policy domains.
  // @trace TYPE-01
  enum def Validity { enum Valid; enum Invalid; }
  // @trace TYPE-01
  enum def Command { enum None; enum Start; enum Off; enum EnterMaintenance; enum ReturnToNormal; }
  // @trace TYPE-02
  enum def PedalCondition { enum Pressed; enum Released; }
  // @trace TYPE-03
  enum def TemperatureBand { enum Nominal; enum Elevated; enum OverLimit; }
  // @trace TYPE-04
  enum def SupplyAvailability { enum Available; enum Unavailable; }
  // @trace TYPE-05
  enum def ParkingBrakeCondition { enum Applied; enum Released; }
  // @trace TYPE-06
  enum def SelfTestProgress { enum Idle; enum Running; enum Passed; enum Failed; }
  // @trace TYPE-11
  enum def QualifiedTemperature { enum InvalidEvidence; enum Nominal; enum Elevated; enum OverLimit; }
  // @trace TYPE-14
  enum def ThermalState { enum Blocked; enum Confirming; enum Clear; }
  // @trace TYPE-15
  enum def SelfTestState { enum Untested; enum Testing; enum Passed; enum Failed; }
  // @trace TYPE-08
  enum def Session { enum Off; enum Arming; enum On; enum Degraded; enum Maintenance; }
  // @trace TYPE-19
  enum def RearmState { enum Blocked; enum Confirming; enum Ready; }
  // @trace TYPE-08
  enum def Notice { enum FaultAttention; enum RecoveryRequired; enum RecoveryConfirming; enum Maintenance; enum Starting; enum Enabled; enum Off; }
  // @trace TYPE-20
  enum def SessionCause {
    enum CurrentFault; enum FreshRecoveryAccepted; enum RecoveryPending;
    enum OffAccepted; enum MaintenanceAccepted; enum StartAccepted;
    enum StartRejected; enum EnableCompleted; enum EnableAborted;
    enum OnSustained; enum ReadinessWithdrawn; enum NoApplicableRequest;
  }
  // @trace TYPE-07
  enum def FuelDisposition { enum Inhibit; enum Enable; }
  // @trace TYPE-07
  enum def ElectricalDisposition { enum Isolate; enum Provide; }
  // @trace TYPE-07
  enum def ParkingBrakeDisposition { enum Apply; enum Release; }

  // Every field below is an attribute because final GUMBO inspects it.
  // @trace TYPE-01
  part def CommandReport :> Data {
    attribute command : Command;
    attribute status : Validity;
  }
  // @trace TYPE-02
  part def BrakePedalReport :> Data {
    attribute condition : PedalCondition;
    attribute status : Validity;
  }
  // @trace TYPE-03
  part def TemperatureReport :> Data {
    attribute band : TemperatureBand;
    attribute status : Validity;
  }
  // @trace TYPE-04
  part def ElectricalPowerReport :> Data {
    attribute availability : SupplyAvailability;
    attribute status : Validity;
  }
  // @trace TYPE-05
  part def ParkingBrakeReport :> Data {
    attribute condition : ParkingBrakeCondition;
    attribute status : Validity;
  }
  // @trace TYPE-06
  part def SelfTestReport :> Data {
    attribute progress : SelfTestProgress;
    attribute status : Validity;
  }
  // @trace TYPE-09
  part def QualifiedCommandFacts :> Data {
    attribute command : Command;
    attribute selfTestResetRequested : Base_Types::Boolean;
  }
  // @trace TYPE-10
  part def QualifiedPedalFacts :> Data {
    attribute pedalStartCondition : Base_Types::Boolean;
  }
  // @trace TYPE-12
  part def QualifiedSupplyFacts :> Data {
    attribute supplyUsable : Base_Types::Boolean;
  }
  // @trace TYPE-13
  part def QualifiedParkingBrakeFacts :> Data {
    attribute brakeAppliedEvidence : Base_Types::Boolean;
  }
  // @trace TYPE-14
  part def ThermalStateFacts :> Data {
    attribute thermalState : ThermalState;
    attribute thermalClear : Base_Types::Boolean;
  }
  // @trace TYPE-15
  part def SelfTestStateFacts :> Data {
    attribute selfTestState : SelfTestState;
    attribute selfTestPassed : Base_Types::Boolean;
  }
  // @trace TYPE-16
  part def StartRestraintFact :> Data {
    attribute startRestraintSatisfied : Base_Types::Boolean;
  }
  // @trace TYPE-17
  part def ReadinessFacts :> Data {
    attribute startReady : Base_Types::Boolean;
    attribute sustainReady : Base_Types::Boolean;
  }
  // @trace TYPE-18
  part def ExactFaultSummary :> Data {
    attribute commandFault : Base_Types::Boolean;
    attribute pedalFault : Base_Types::Boolean;
    attribute thermalFault : Base_Types::Boolean;
    attribute supplyFault : Base_Types::Boolean;
    attribute parkingBrakeFault : Base_Types::Boolean;
    attribute selfTestFault : Base_Types::Boolean;
    attribute anyFault : Base_Types::Boolean;
  }
  // @trace TYPE-19
  part def RearmStateFacts :> Data {
    attribute rearmState : RearmState;
  }
  // @trace TYPE-19
  part def RecoveryPermitFact :> Data {
    attribute recoveryPermit : Base_Types::Boolean;
  }
  // @trace TYPE-20
  part def SessionDecisionFacts :> Data {
    attribute session : Session;
    attribute cause : SessionCause;
  }
  // @trace TYPE-07
  part def ActuationDisposition :> Data {
    attribute fuel : FuelDisposition;
    attribute electricalPower : ElectricalDisposition;
    attribute parkingBrake : ParkingBrakeDisposition;
  }
  // @trace TYPE-08
  part def SupervisoryStatus :> Data {
    attribute session : Session;
    attribute startReady : Base_Types::Boolean;
    attribute sustainReady : Base_Types::Boolean;
    attribute rearmState : RearmState;
    attribute notice : Notice;
    attribute commandFault : Base_Types::Boolean;
    attribute pedalFault : Base_Types::Boolean;
    attribute thermalFault : Base_Types::Boolean;
    attribute supplyFault : Base_Types::Boolean;
    attribute parkingBrakeFault : Base_Types::Boolean;
    attribute selfTestFault : Base_Types::Boolean;
    attribute anyFault : Base_Types::Boolean;
  }

  // @trace PART-01
  part def CommandQualificationOwner :> Thread {
    // @trace MON-01
    port command_report : DataPort { in :>> type : CommandReport; }
    // @trace TYPE-09
    port qualified_command_facts : DataPort { out :>> type : QualifiedCommandFacts; }
    // @trace TYPE-21
    port command_fault : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_COMMAND_QUALIFICATION:
          qualified_command_facts.command == Command.None &
          qualified_command_facts.selfTestResetRequested == F & command_fault == F;
      compute
        // @trace PART-01
        guarantee COMMAND_QUALIFICATION_TOTAL:
          ((command_report.status == Validity.Invalid &
            qualified_command_facts.command == Command.None) |
           (command_report.status == Validity.Valid &
            qualified_command_facts.command == command_report.command)) &
          (qualified_command_facts.selfTestResetRequested ==
            (command_report.status == Validity.Valid &
             (command_report.command == Command.Off |
              command_report.command == Command.EnterMaintenance))) &
          (command_fault == (command_report.status == Validity.Invalid));
    }*/
  }
  // @trace PART-02
  part def BrakePedalQualificationOwner :> Thread {
    // @trace MON-02
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    // @trace TYPE-10
    port qualified_pedal_facts : DataPort { out :>> type : QualifiedPedalFacts; }
    // @trace TYPE-21
    port pedal_fault : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_PEDAL_QUALIFICATION:
          qualified_pedal_facts.pedalStartCondition == F & pedal_fault == F;
      compute
        // @trace PART-02
        guarantee PEDAL_QUALIFICATION_TOTAL:
          (qualified_pedal_facts.pedalStartCondition ==
            (brake_pedal_report.status == Validity.Valid &
             brake_pedal_report.condition == PedalCondition.Pressed)) &
          (pedal_fault == (brake_pedal_report.status == Validity.Invalid));
    }*/
  }
  // @trace PART-03
  part def TemperatureQualificationOwner :> Thread {
    // @trace MON-03
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    // @trace TYPE-11
    port qualified_temperature : DataPort { out :>> type : QualifiedTemperature; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_TEMPERATURE_QUALIFICATION:
          qualified_temperature == QualifiedTemperature.InvalidEvidence;
      compute
        // @trace PART-03
        guarantee TEMPERATURE_QUALIFICATION_TOTAL:
          ((temperature_report.status == Validity.Invalid &
            qualified_temperature == QualifiedTemperature.InvalidEvidence) |
           (temperature_report.status == Validity.Valid &
            temperature_report.band == TemperatureBand.Nominal &
            qualified_temperature == QualifiedTemperature.Nominal) |
           (temperature_report.status == Validity.Valid &
            temperature_report.band == TemperatureBand.Elevated &
            qualified_temperature == QualifiedTemperature.Elevated) |
           (temperature_report.status == Validity.Valid &
            temperature_report.band == TemperatureBand.OverLimit &
            qualified_temperature == QualifiedTemperature.OverLimit));
    }*/
  }
  // @trace PART-04
  part def ElectricalSupplyQualificationOwner :> Thread {
    // @trace MON-04
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    // @trace TYPE-12
    port qualified_supply_facts : DataPort { out :>> type : QualifiedSupplyFacts; }
    // @trace TYPE-21
    port supply_fault : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_SUPPLY_QUALIFICATION:
          qualified_supply_facts.supplyUsable == F & supply_fault == F;
      compute
        // @trace PART-04
        guarantee SUPPLY_QUALIFICATION_TOTAL:
          (qualified_supply_facts.supplyUsable ==
            (electrical_power_report.status == Validity.Valid &
             electrical_power_report.availability == SupplyAvailability.Available)) &
          (supply_fault == (electrical_power_report.status == Validity.Invalid));
    }*/
  }
  // @trace PART-05
  part def ParkingBrakeQualificationOwner :> Thread {
    // @trace MON-05
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    // @trace TYPE-13
    port qualified_parking_brake_facts : DataPort { out :>> type : QualifiedParkingBrakeFacts; }
    // @trace TYPE-21
    port parking_brake_fault : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_PARKING_BRAKE_QUALIFICATION:
          qualified_parking_brake_facts.brakeAppliedEvidence == F &
          parking_brake_fault == F;
      compute
        // @trace PART-05
        guarantee PARKING_BRAKE_QUALIFICATION_TOTAL:
          (qualified_parking_brake_facts.brakeAppliedEvidence ==
            (parking_brake_report.status == Validity.Valid &
             parking_brake_report.condition == ParkingBrakeCondition.Applied)) &
          (parking_brake_fault == (parking_brake_report.status == Validity.Invalid));
    }*/
  }
  // @trace PART-06
  part def ThermalClearanceStateOwner :> Thread {
    // @trace INT-13
    port qualified_temperature : DataPort { in :>> type : QualifiedTemperature; }
    // @trace TYPE-14
    port thermal_state_facts : DataPort { out :>> type : ThermalStateFacts; }
    // @trace TYPE-21
    port thermal_fault : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      state
        // @trace PART-06
        thermalMemory: ThermalState;
      initialize
        modifies thermalMemory;
        // @trace ASM-09
        guarantee INITIAL_THERMAL_BLOCKED:
          thermalMemory == ThermalState.Blocked &
          thermal_state_facts.thermalState == ThermalState.Blocked &
          thermal_state_facts.thermalClear == F & thermal_fault == F;
      compute
        modifies thermalMemory;
        // @trace PART-06
        guarantee THERMAL_OUTPUT_COHERENCE:
          thermal_state_facts.thermalState == thermalMemory &
          (thermal_state_facts.thermalClear == (thermalMemory == ThermalState.Clear));
        compute_cases
          // @trace CASE-THERM-01
          case THERMAL_BLOCK_CURRENT_FAULT:
            assume qualified_temperature == QualifiedTemperature.InvalidEvidence |
              qualified_temperature == QualifiedTemperature.OverLimit;
            guarantee thermalMemory == ThermalState.Blocked &
              thermal_state_facts.thermalClear == F & thermal_fault == T;
          // @trace CASE-THERM-02
          case THERMAL_ELEVATED_RESET_BLOCKED:
            assume qualified_temperature == QualifiedTemperature.Elevated;
            guarantee thermalMemory == ThermalState.Blocked &
              thermal_state_facts.thermalClear == F & thermal_fault == F;
          // @trace CASE-THERM-03
          case THERMAL_FIRST_NOMINAL:
            assume qualified_temperature == QualifiedTemperature.Nominal &
              In(thermalMemory) == ThermalState.Blocked;
            guarantee thermalMemory == ThermalState.Confirming &
              thermal_state_facts.thermalClear == F & thermal_fault == F;
          // @trace CASE-THERM-04
          case THERMAL_SECOND_NOMINAL:
            assume qualified_temperature == QualifiedTemperature.Nominal &
              In(thermalMemory) == ThermalState.Confirming;
            guarantee thermalMemory == ThermalState.Clear &
              thermal_state_facts.thermalClear == T & thermal_fault == F;
          // @trace CASE-THERM-05
          case THERMAL_CLEAR_RETENTION:
            assume qualified_temperature == QualifiedTemperature.Nominal &
              In(thermalMemory) == ThermalState.Clear;
            guarantee thermalMemory == ThermalState.Clear &
              thermal_state_facts.thermalClear == T & thermal_fault == F;
    }*/
  }
  // @trace PART-07
  part def SelfTestCampaignStateOwner :> Thread {
    // @trace MON-06
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    // @trace INT-07
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    // @trace TYPE-15
    port self_test_state_facts : DataPort { out :>> type : SelfTestStateFacts; }
    // @trace TYPE-21
    port self_test_fault : DataPort { out :>> type : Base_Types::Boolean; }

    language "GUMBO" /*{
      state
        // @trace PART-07
        selfTestMemory: SelfTestState;
      initialize
        modifies selfTestMemory;
        // @trace ASM-09
        guarantee INITIAL_SELF_TEST_UNTESTED:
          selfTestMemory == SelfTestState.Untested &
          self_test_state_facts.selfTestState == SelfTestState.Untested &
          self_test_state_facts.selfTestPassed == F & self_test_fault == F;
      compute
        modifies selfTestMemory;
        // @trace PART-07
        guarantee SELF_TEST_OUTPUT_COHERENCE:
          self_test_state_facts.selfTestState == selfTestMemory &
          (self_test_state_facts.selfTestPassed == (selfTestMemory == SelfTestState.Passed));
        compute_cases
          // @trace CASE-TEST-01
          case SELF_TEST_FAILURE_DOMINATES:
            assume self_test_report.status == Validity.Invalid |
              (self_test_report.status == Validity.Valid &
               self_test_report.progress == SelfTestProgress.Failed);
            guarantee selfTestMemory == SelfTestState.Failed &
              self_test_state_facts.selfTestPassed == F & self_test_fault == T;
          // @trace CASE-TEST-02
          case SELF_TEST_VALID_RESET:
            assume self_test_report.status == Validity.Valid &
              self_test_report.progress != SelfTestProgress.Failed &
              qualified_command_facts.selfTestResetRequested;
            guarantee selfTestMemory == SelfTestState.Untested &
              self_test_state_facts.selfTestPassed == F & self_test_fault == F;
          // @trace CASE-TEST-03
          case SELF_TEST_START_RUNNING:
            assume self_test_report.status == Validity.Valid &
              self_test_report.progress != SelfTestProgress.Failed &
              qualified_command_facts.selfTestResetRequested == F &
              In(selfTestMemory) == SelfTestState.Untested &
              qualified_command_facts.command == Command.Start &
              self_test_report.progress == SelfTestProgress.Running;
            guarantee selfTestMemory == SelfTestState.Testing &
              self_test_state_facts.selfTestPassed == F & self_test_fault == F;
          // @trace CASE-TEST-04
          case SELF_TEST_FRESH_START_PASS:
            assume self_test_report.status == Validity.Valid &
              self_test_report.progress != SelfTestProgress.Failed &
              qualified_command_facts.selfTestResetRequested == F &
              In(selfTestMemory) == SelfTestState.Untested &
              qualified_command_facts.command == Command.Start &
              self_test_report.progress == SelfTestProgress.Passed;
            guarantee selfTestMemory == SelfTestState.Passed &
              self_test_state_facts.selfTestPassed == T & self_test_fault == F;
          // @trace CASE-TEST-05
          case SELF_TEST_RUNNING_TO_PASS:
            assume self_test_report.status == Validity.Valid &
              self_test_report.progress != SelfTestProgress.Failed &
              qualified_command_facts.selfTestResetRequested == F &
              In(selfTestMemory) == SelfTestState.Testing &
              self_test_report.progress == SelfTestProgress.Passed;
            guarantee selfTestMemory == SelfTestState.Passed &
              self_test_state_facts.selfTestPassed == T & self_test_fault == F;
          // @trace CASE-TEST-06
          case SELF_TEST_PASS_RETENTION:
            assume self_test_report.status == Validity.Valid &
              self_test_report.progress != SelfTestProgress.Failed &
              qualified_command_facts.selfTestResetRequested == F &
              In(selfTestMemory) == SelfTestState.Passed;
            guarantee selfTestMemory == SelfTestState.Passed &
              self_test_state_facts.selfTestPassed == T & self_test_fault == F;
          // @trace CASE-TEST-07
          case SELF_TEST_OTHER_RETENTION:
            assume self_test_report.status == Validity.Valid &
              self_test_report.progress != SelfTestProgress.Failed &
              qualified_command_facts.selfTestResetRequested == F &
              ((In(selfTestMemory) == SelfTestState.Untested &
                (qualified_command_facts.command != Command.Start |
                 (self_test_report.progress != SelfTestProgress.Running &
                  self_test_report.progress != SelfTestProgress.Passed))) |
               (In(selfTestMemory) == SelfTestState.Testing &
                self_test_report.progress != SelfTestProgress.Passed) |
               In(selfTestMemory) == SelfTestState.Failed);
            guarantee selfTestMemory == In(selfTestMemory) &
              self_test_state_facts.selfTestPassed == F &
              (self_test_fault == (selfTestMemory == SelfTestState.Failed));
    }*/
  }
  // @trace PART-08
  part def StartRestraintDecisionOwner :> Thread {
    // @trace INT-11
    port qualified_pedal_facts : DataPort { in :>> type : QualifiedPedalFacts; }
    // @trace INT-16
    port qualified_parking_brake_facts : DataPort { in :>> type : QualifiedParkingBrakeFacts; }
    // @trace TYPE-16
    port start_restraint_fact : DataPort { out :>> type : StartRestraintFact; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_RESTRAINT_UNSATISFIED:
          start_restraint_fact.startRestraintSatisfied == F;
      compute
        // @trace PART-08
        guarantee START_RESTRAINT_DECISION:
          (start_restraint_fact.startRestraintSatisfied ==
            (qualified_pedal_facts.pedalStartCondition &
             qualified_parking_brake_facts.brakeAppliedEvidence));
    }*/
  }
  // @trace PART-09
  part def ReadinessCompositionOwner :> Thread {
    // @trace INT-14
    port qualified_supply_facts : DataPort { in :>> type : QualifiedSupplyFacts; }
    // @trace INT-18
    port thermal_state_facts : DataPort { in :>> type : ThermalStateFacts; }
    // @trace INT-20
    port self_test_state_facts : DataPort { in :>> type : SelfTestStateFacts; }
    // @trace INT-22
    port start_restraint_fact : DataPort { in :>> type : StartRestraintFact; }
    // @trace TYPE-17
    port readiness_facts : DataPort { out :>> type : ReadinessFacts; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_NOT_READY:
          readiness_facts.startReady == F & readiness_facts.sustainReady == F;
      compute
        // @trace PART-09
        guarantee READINESS_COMPOSITION:
          (readiness_facts.startReady ==
            (qualified_supply_facts.supplyUsable &
             thermal_state_facts.thermalClear &
             self_test_state_facts.selfTestPassed &
             start_restraint_fact.startRestraintSatisfied)) &
          (readiness_facts.sustainReady ==
            (qualified_supply_facts.supplyUsable &
             thermal_state_facts.thermalClear &
             self_test_state_facts.selfTestPassed));
    }*/
  }
  // @trace PART-10
  part def OperatingSessionStatePriorityOwner :> Thread {
    // @trace INT-08
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    // @trace INT-23
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    // @trace INT-26
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    // @trace INT-30
    port recovery_permit_fact : DataPort { in :>> type : RecoveryPermitFact; }
    // @trace TYPE-20
    port session_decision_facts : DataPort { out :>> type : SessionDecisionFacts; }

    language "GUMBO" /*{
      state
        // @trace PART-10
        sessionMemory: Session;
      initialize
        modifies sessionMemory;
        // @trace ASM-09
        guarantee INITIAL_SESSION_OFF:
          sessionMemory == Session.Off &
          session_decision_facts.session == Session.Off &
          session_decision_facts.cause == SessionCause.NoApplicableRequest;
      compute
        modifies sessionMemory;
        // @trace POL-SESSION-01
        guarantee SESSION_OUTPUT_COHERENCE:
          session_decision_facts.session == sessionMemory;
        compute_cases
          // @trace CASE-SESSION-01
          case SESSION_CURRENT_FAULT:
            assume exact_fault_summary.anyFault;
            guarantee sessionMemory == Session.Degraded &
              session_decision_facts.cause == SessionCause.CurrentFault;
          // @trace CASE-SESSION-02
          case SESSION_FRESH_RECOVERY_ACCEPTED:
            assume exact_fault_summary.anyFault == F &
              In(sessionMemory) == Session.Degraded &
              recovery_permit_fact.recoveryPermit;
            guarantee sessionMemory == Session.Off &
              session_decision_facts.cause == SessionCause.FreshRecoveryAccepted;
          // @trace CASE-SESSION-03
          case SESSION_DEGRADED_RETENTION:
            assume exact_fault_summary.anyFault == F &
              In(sessionMemory) == Session.Degraded &
              recovery_permit_fact.recoveryPermit == F;
            guarantee sessionMemory == Session.Degraded &
              session_decision_facts.cause == SessionCause.RecoveryPending;
          // @trace CASE-SESSION-04
          case SESSION_OFF_ACCEPTED:
            assume exact_fault_summary.anyFault == F &
              In(sessionMemory) != Session.Degraded &
              qualified_command_facts.command == Command.Off;
            guarantee sessionMemory == Session.Off &
              session_decision_facts.cause == SessionCause.OffAccepted;
          // @trace CASE-SESSION-05
          case SESSION_MAINTENANCE_ACCEPTED:
            assume exact_fault_summary.anyFault == F &
              In(sessionMemory) != Session.Degraded &
              qualified_command_facts.command == Command.EnterMaintenance;
            guarantee sessionMemory == Session.Maintenance &
              session_decision_facts.cause == SessionCause.MaintenanceAccepted;
          // @trace CASE-SESSION-06
          case SESSION_START_ACCEPTED:
            assume exact_fault_summary.anyFault == F &
              (In(sessionMemory) == Session.Off |
               In(sessionMemory) == Session.Maintenance) &
              qualified_command_facts.command == Command.Start &
              readiness_facts.startReady;
            guarantee sessionMemory == Session.Arming &
              session_decision_facts.cause == SessionCause.StartAccepted;
          // @trace CASE-SESSION-07
          case SESSION_START_REJECTED:
            assume exact_fault_summary.anyFault == F &
              (In(sessionMemory) == Session.Off |
               In(sessionMemory) == Session.Maintenance) &
              qualified_command_facts.command == Command.Start &
              readiness_facts.startReady == F;
            guarantee sessionMemory == In(sessionMemory) &
              session_decision_facts.cause == SessionCause.StartRejected;
          // @trace CASE-SESSION-08
          case SESSION_ENABLE_COMPLETED:
            assume exact_fault_summary.anyFault == F &
              In(sessionMemory) == Session.Arming &
              qualified_command_facts.command != Command.Off &
              qualified_command_facts.command != Command.EnterMaintenance &
              readiness_facts.sustainReady;
            guarantee sessionMemory == Session.On &
              session_decision_facts.cause == SessionCause.EnableCompleted;
          // @trace CASE-SESSION-09
          case SESSION_ENABLE_ABORTED:
            assume exact_fault_summary.anyFault == F &
              In(sessionMemory) == Session.Arming &
              qualified_command_facts.command != Command.Off &
              qualified_command_facts.command != Command.EnterMaintenance &
              readiness_facts.sustainReady == F;
            guarantee sessionMemory == Session.Off &
              session_decision_facts.cause == SessionCause.EnableAborted;
          // @trace CASE-SESSION-10
          case SESSION_ON_SUSTAINED:
            assume exact_fault_summary.anyFault == F &
              In(sessionMemory) == Session.On &
              qualified_command_facts.command != Command.Off &
              qualified_command_facts.command != Command.EnterMaintenance &
              readiness_facts.sustainReady;
            guarantee sessionMemory == Session.On &
              session_decision_facts.cause == SessionCause.OnSustained;
          // @trace CASE-SESSION-11
          case SESSION_READINESS_WITHDRAWN:
            assume exact_fault_summary.anyFault == F &
              In(sessionMemory) == Session.On &
              qualified_command_facts.command != Command.Off &
              qualified_command_facts.command != Command.EnterMaintenance &
              readiness_facts.sustainReady == F;
            guarantee sessionMemory == Session.Degraded &
              session_decision_facts.cause == SessionCause.ReadinessWithdrawn;
          // @trace CASE-SESSION-12
          case SESSION_NO_APPLICABLE_REQUEST:
            assume exact_fault_summary.anyFault == F &
              (In(sessionMemory) == Session.Off |
               In(sessionMemory) == Session.Maintenance) &
              (qualified_command_facts.command == Command.None |
               qualified_command_facts.command == Command.ReturnToNormal);
            guarantee sessionMemory == In(sessionMemory) &
              session_decision_facts.cause == SessionCause.NoApplicableRequest;
    }*/
  }
  // @trace PART-11
  part def FaultVectorCompositionOwner :> Thread {
    // @trace INT-10
    port command_fault : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-12
    port pedal_fault : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-19
    port thermal_fault : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-15
    port supply_fault : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-17
    port parking_brake_fault : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace INT-21
    port self_test_fault : DataPort { in :>> type : Base_Types::Boolean; }
    // @trace TYPE-18
    port exact_fault_summary : DataPort { out :>> type : ExactFaultSummary; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_FAULT_VECTOR_CLEAR:
          exact_fault_summary.commandFault == F &
          exact_fault_summary.pedalFault == F &
          exact_fault_summary.thermalFault == F &
          exact_fault_summary.supplyFault == F &
          exact_fault_summary.parkingBrakeFault == F &
          exact_fault_summary.selfTestFault == F &
          exact_fault_summary.anyFault == F;
      compute
        // @trace POL-FAULT-01
        guarantee EXACT_FAULT_VECTOR_AND_OR:
          exact_fault_summary.commandFault == command_fault &
          exact_fault_summary.pedalFault == pedal_fault &
          exact_fault_summary.thermalFault == thermal_fault &
          exact_fault_summary.supplyFault == supply_fault &
          exact_fault_summary.parkingBrakeFault == parking_brake_fault &
          exact_fault_summary.selfTestFault == self_test_fault &
          (exact_fault_summary.anyFault ==
            (command_fault | pedal_fault | thermal_fault | supply_fault |
             parking_brake_fault | self_test_fault));
    }*/
  }
  // @trace PART-12
  part def RearmQualificationStateOwner :> Thread {
    // @trace INT-09
    port qualified_command_facts : DataPort { in :>> type : QualifiedCommandFacts; }
    // @trace INT-24
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    // @trace INT-27
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    // @trace TYPE-19
    port rearm_state_facts : DataPort { out :>> type : RearmStateFacts; }
    // @trace TYPE-19
    port recovery_permit_fact : DataPort { out :>> type : RecoveryPermitFact; }

    language "GUMBO" /*{
      state
        // @trace PART-12
        rearmMemory: RearmState;
      initialize
        modifies rearmMemory;
        // @trace ASM-09
        guarantee INITIAL_REARM_BLOCKED:
          rearmMemory == RearmState.Blocked &
          rearm_state_facts.rearmState == RearmState.Blocked &
          recovery_permit_fact.recoveryPermit == F;
      compute
        modifies rearmMemory;
        // @trace PART-12
        guarantee REARM_OUTPUT_COHERENCE:
          rearm_state_facts.rearmState == rearmMemory;
        compute_cases
          // @trace CASE-REARM-01
          case REARM_CURRENT_FAULT:
            assume exact_fault_summary.anyFault;
            guarantee rearmMemory == RearmState.Blocked &
              recovery_permit_fact.recoveryPermit == F;
          // @trace CASE-REARM-02
          case REARM_NOT_SUSTAIN_READY:
            assume exact_fault_summary.anyFault == F & readiness_facts.sustainReady == F;
            guarantee rearmMemory == RearmState.Blocked &
              recovery_permit_fact.recoveryPermit == F;
          // @trace CASE-REARM-03
          case REARM_FIRST_CLEAN_SNAPSHOT:
            assume exact_fault_summary.anyFault == F & readiness_facts.sustainReady &
              In(rearmMemory) == RearmState.Blocked;
            guarantee rearmMemory == RearmState.Confirming &
              recovery_permit_fact.recoveryPermit == F;
          // @trace CASE-REARM-04
          case REARM_SECOND_CLEAN_SNAPSHOT:
            assume exact_fault_summary.anyFault == F & readiness_facts.sustainReady &
              In(rearmMemory) == RearmState.Confirming;
            guarantee rearmMemory == RearmState.Ready &
              recovery_permit_fact.recoveryPermit == F;
          // @trace CASE-REARM-05
          case REARM_READY_FRESH_REQUEST:
            assume exact_fault_summary.anyFault == F & readiness_facts.sustainReady &
              In(rearmMemory) == RearmState.Ready;
            guarantee rearmMemory == RearmState.Ready &
              (recovery_permit_fact.recoveryPermit ==
                (qualified_command_facts.command == Command.ReturnToNormal));
    }*/
  }
  // @trace PART-13
  part def ActuationCompositionOwner :> Thread {
    // @trace INT-32
    port session_decision_facts : DataPort { in :>> type : SessionDecisionFacts; }
    // @trace INT-28
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    // @trace CTRL-01
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_SAFE_ACTUATION:
          actuation_disposition.fuel == FuelDisposition.Inhibit &
          actuation_disposition.electricalPower == ElectricalDisposition.Isolate &
          actuation_disposition.parkingBrake == ParkingBrakeDisposition.Apply;
      compute
        // @trace POL-ACT-01
        guarantee ACTUATION_COMPOSITION_TOTAL:
          ((exact_fault_summary.anyFault &
            actuation_disposition.fuel == FuelDisposition.Inhibit &
            actuation_disposition.electricalPower == ElectricalDisposition.Isolate &
            actuation_disposition.parkingBrake == ParkingBrakeDisposition.Apply) |
           (exact_fault_summary.anyFault == F &
            session_decision_facts.session == Session.On &
            actuation_disposition.fuel == FuelDisposition.Enable &
            actuation_disposition.electricalPower == ElectricalDisposition.Provide &
            actuation_disposition.parkingBrake == ParkingBrakeDisposition.Release) |
           (exact_fault_summary.anyFault == F &
            (session_decision_facts.session == Session.Arming |
             session_decision_facts.session == Session.Maintenance) &
            actuation_disposition.fuel == FuelDisposition.Inhibit &
            actuation_disposition.electricalPower == ElectricalDisposition.Provide &
            actuation_disposition.parkingBrake == ParkingBrakeDisposition.Apply) |
           (exact_fault_summary.anyFault == F &
            (session_decision_facts.session == Session.Off |
             session_decision_facts.session == Session.Degraded) &
            actuation_disposition.fuel == FuelDisposition.Inhibit &
            actuation_disposition.electricalPower == ElectricalDisposition.Isolate &
            actuation_disposition.parkingBrake == ParkingBrakeDisposition.Apply));
    }*/
  }
  // @trace PART-14
  part def SupervisoryStatusNoticeOwner :> Thread {
    // @trace INT-25
    port readiness_facts : DataPort { in :>> type : ReadinessFacts; }
    // @trace INT-29
    port exact_fault_summary : DataPort { in :>> type : ExactFaultSummary; }
    // @trace INT-31
    port rearm_state_facts : DataPort { in :>> type : RearmStateFacts; }
    // @trace INT-33
    port session_decision_facts : DataPort { in :>> type : SessionDecisionFacts; }
    // @trace CTRL-02
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

    language "GUMBO" /*{
      initialize
        // @trace ASM-09
        guarantee INITIAL_PUBLIC_STATUS_EXACT:
          supervisory_status.session == Session.Off &
          supervisory_status.startReady == F & supervisory_status.sustainReady == F &
          supervisory_status.rearmState == RearmState.Blocked &
          supervisory_status.notice == Notice.Off &
          supervisory_status.commandFault == F & supervisory_status.pedalFault == F &
          supervisory_status.thermalFault == F & supervisory_status.supplyFault == F &
          supervisory_status.parkingBrakeFault == F & supervisory_status.selfTestFault == F &
          supervisory_status.anyFault == F;
      compute
        // @trace POL-COMP-01
        guarantee STATUS_PRESERVES_OWNER_FACTS:
          supervisory_status.session == session_decision_facts.session &
          supervisory_status.startReady == readiness_facts.startReady &
          supervisory_status.sustainReady == readiness_facts.sustainReady &
          supervisory_status.rearmState == rearm_state_facts.rearmState &
          supervisory_status.commandFault == exact_fault_summary.commandFault &
          supervisory_status.pedalFault == exact_fault_summary.pedalFault &
          supervisory_status.thermalFault == exact_fault_summary.thermalFault &
          supervisory_status.supplyFault == exact_fault_summary.supplyFault &
          supervisory_status.parkingBrakeFault == exact_fault_summary.parkingBrakeFault &
          supervisory_status.selfTestFault == exact_fault_summary.selfTestFault &
          supervisory_status.anyFault == exact_fault_summary.anyFault;
        // @trace POL-NOTICE-01
        guarantee PRIORITIZED_NOTICE_CLASSIFICATION:
          ((exact_fault_summary.anyFault &
            supervisory_status.notice == Notice.FaultAttention) |
           (exact_fault_summary.anyFault == F &
            session_decision_facts.session == Session.Degraded &
            rearm_state_facts.rearmState == RearmState.Confirming &
            supervisory_status.notice == Notice.RecoveryConfirming) |
           (exact_fault_summary.anyFault == F &
            session_decision_facts.session == Session.Degraded &
            rearm_state_facts.rearmState != RearmState.Confirming &
            supervisory_status.notice == Notice.RecoveryRequired) |
           (exact_fault_summary.anyFault == F &
            session_decision_facts.session == Session.Maintenance &
            supervisory_status.notice == Notice.Maintenance) |
           (exact_fault_summary.anyFault == F &
            session_decision_facts.session == Session.Arming &
            supervisory_status.notice == Notice.Starting) |
           (exact_fault_summary.anyFault == F &
            session_decision_facts.session == Session.On &
            supervisory_status.notice == Notice.Enabled) |
           (exact_fault_summary.anyFault == F &
            session_decision_facts.session == Session.Off &
            supervisory_status.notice == Notice.Off));
    }*/
  }

  // @generated-support Behavior-free containment and transparent boundary endpoints.
  part def ProtectedStartPowerProcess :> Process {
    // @generated-support Transparent Process endpoint for MON-01.
    port command_report : DataPort { in :>> type : CommandReport; }
    // @generated-support Transparent Process endpoint for MON-02.
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    // @generated-support Transparent Process endpoint for MON-03.
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    // @generated-support Transparent Process endpoint for MON-04.
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    // @generated-support Transparent Process endpoint for MON-05.
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    // @generated-support Transparent Process endpoint for MON-06.
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    // @generated-support Transparent Process endpoint for CTRL-01.
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }
    // @generated-support Transparent Process endpoint for CTRL-02.
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

    // Fourteen sibling semantic usages in approved order.
    // @trace PART-01
    part command_qualification_owner : CommandQualificationOwner;
    // @trace PART-02
    part brake_pedal_qualification_owner : BrakePedalQualificationOwner;
    // @trace PART-03
    part temperature_qualification_owner : TemperatureQualificationOwner;
    // @trace PART-04
    part electrical_supply_qualification_owner : ElectricalSupplyQualificationOwner;
    // @trace PART-05
    part parking_brake_qualification_owner : ParkingBrakeQualificationOwner;
    // @trace PART-06
    part thermal_clearance_state_owner : ThermalClearanceStateOwner;
    // @trace PART-07
    part self_test_campaign_state_owner : SelfTestCampaignStateOwner;
    // @trace PART-08
    part start_restraint_decision_owner : StartRestraintDecisionOwner;
    // @trace PART-09
    part readiness_composition_owner : ReadinessCompositionOwner;
    // @trace PART-10
    part operating_session_state_priority_owner : OperatingSessionStatePriorityOwner;
    // @trace PART-11
    part fault_vector_composition_owner : FaultVectorCompositionOwner;
    // @trace PART-12
    part rearm_qualification_state_owner : RearmQualificationStateOwner;
    // @trace PART-13
    part actuation_composition_owner : ActuationCompositionOwner;
    // @trace PART-14
    part supervisory_status_notice_owner : SupervisoryStatusNoticeOwner;

    // Exact thirty-five semantic interactions.
    // @trace INT-01
    connection int01 : PortConnection connect command_report to command_qualification_owner.command_report;
    // @trace INT-02
    connection int02 : PortConnection connect brake_pedal_report to brake_pedal_qualification_owner.brake_pedal_report;
    // @trace INT-03
    connection int03 : PortConnection connect temperature_report to temperature_qualification_owner.temperature_report;
    // @trace INT-04
    connection int04 : PortConnection connect electrical_power_report to electrical_supply_qualification_owner.electrical_power_report;
    // @trace INT-05
    connection int05 : PortConnection connect parking_brake_report to parking_brake_qualification_owner.parking_brake_report;
    // @trace INT-06
    connection int06 : PortConnection connect self_test_report to self_test_campaign_state_owner.self_test_report;
    // @trace INT-07
    connection int07 : PortConnection connect command_qualification_owner.qualified_command_facts to self_test_campaign_state_owner.qualified_command_facts;
    // @trace INT-08
    connection int08 : PortConnection connect command_qualification_owner.qualified_command_facts to operating_session_state_priority_owner.qualified_command_facts;
    // @trace INT-09
    connection int09 : PortConnection connect command_qualification_owner.qualified_command_facts to rearm_qualification_state_owner.qualified_command_facts;
    // @trace INT-10
    connection int10 : PortConnection connect command_qualification_owner.command_fault to fault_vector_composition_owner.command_fault;
    // @trace INT-11
    connection int11 : PortConnection connect brake_pedal_qualification_owner.qualified_pedal_facts to start_restraint_decision_owner.qualified_pedal_facts;
    // @trace INT-12
    connection int12 : PortConnection connect brake_pedal_qualification_owner.pedal_fault to fault_vector_composition_owner.pedal_fault;
    // @trace INT-13
    connection int13 : PortConnection connect temperature_qualification_owner.qualified_temperature to thermal_clearance_state_owner.qualified_temperature;
    // @trace INT-14
    connection int14 : PortConnection connect electrical_supply_qualification_owner.qualified_supply_facts to readiness_composition_owner.qualified_supply_facts;
    // @trace INT-15
    connection int15 : PortConnection connect electrical_supply_qualification_owner.supply_fault to fault_vector_composition_owner.supply_fault;
    // @trace INT-16
    connection int16 : PortConnection connect parking_brake_qualification_owner.qualified_parking_brake_facts to start_restraint_decision_owner.qualified_parking_brake_facts;
    // @trace INT-17
    connection int17 : PortConnection connect parking_brake_qualification_owner.parking_brake_fault to fault_vector_composition_owner.parking_brake_fault;
    // @trace INT-18
    connection int18 : PortConnection connect thermal_clearance_state_owner.thermal_state_facts to readiness_composition_owner.thermal_state_facts;
    // @trace INT-19
    connection int19 : PortConnection connect thermal_clearance_state_owner.thermal_fault to fault_vector_composition_owner.thermal_fault;
    // @trace INT-20
    connection int20 : PortConnection connect self_test_campaign_state_owner.self_test_state_facts to readiness_composition_owner.self_test_state_facts;
    // @trace INT-21
    connection int21 : PortConnection connect self_test_campaign_state_owner.self_test_fault to fault_vector_composition_owner.self_test_fault;
    // @trace INT-22
    connection int22 : PortConnection connect start_restraint_decision_owner.start_restraint_fact to readiness_composition_owner.start_restraint_fact;
    // @trace INT-23
    connection int23 : PortConnection connect readiness_composition_owner.readiness_facts to operating_session_state_priority_owner.readiness_facts;
    // @trace INT-24
    connection int24 : PortConnection connect readiness_composition_owner.readiness_facts to rearm_qualification_state_owner.readiness_facts;
    // @trace INT-25
    connection int25 : PortConnection connect readiness_composition_owner.readiness_facts to supervisory_status_notice_owner.readiness_facts;
    // @trace INT-26
    connection int26 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to operating_session_state_priority_owner.exact_fault_summary;
    // @trace INT-27
    connection int27 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to rearm_qualification_state_owner.exact_fault_summary;
    // @trace INT-28
    connection int28 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to actuation_composition_owner.exact_fault_summary;
    // @trace INT-29
    connection int29 : PortConnection connect fault_vector_composition_owner.exact_fault_summary to supervisory_status_notice_owner.exact_fault_summary;
    // @trace INT-30
    connection int30 : PortConnection connect rearm_qualification_state_owner.recovery_permit_fact to operating_session_state_priority_owner.recovery_permit_fact;
    // @trace INT-31
    connection int31 : PortConnection connect rearm_qualification_state_owner.rearm_state_facts to supervisory_status_notice_owner.rearm_state_facts;
    // @trace INT-32
    connection int32 : PortConnection connect operating_session_state_priority_owner.session_decision_facts to actuation_composition_owner.session_decision_facts;
    // @trace INT-33
    connection int33 : PortConnection connect operating_session_state_priority_owner.session_decision_facts to supervisory_status_notice_owner.session_decision_facts;
    // @trace INT-34
    connection int34 : PortConnection connect actuation_composition_owner.actuation_disposition to actuation_disposition;
    // @trace INT-35
    connection int35 : PortConnection connect supervisory_status_notice_owner.supervisory_status to supervisory_status;
  }

  // @trace SCOPE-01
  part def ProtectedStartPowerSupervisorSystem :> System {
    // @trace MON-01
    port command_report : DataPort { in :>> type : CommandReport; }
    // @trace MON-02
    port brake_pedal_report : DataPort { in :>> type : BrakePedalReport; }
    // @trace MON-03
    port temperature_report : DataPort { in :>> type : TemperatureReport; }
    // @trace MON-04
    port electrical_power_report : DataPort { in :>> type : ElectricalPowerReport; }
    // @trace MON-05
    port parking_brake_report : DataPort { in :>> type : ParkingBrakeReport; }
    // @trace MON-06
    port self_test_report : DataPort { in :>> type : SelfTestReport; }
    // @trace CTRL-01
    port actuation_disposition : DataPort { out :>> type : ActuationDisposition; }
    // @trace CTRL-02
    port supervisory_status : DataPort { out :>> type : SupervisoryStatus; }

    // @generated-support Sole behavior-free support Process authorized by STRUCT-01.
    part protected_start_power_process : ProtectedStartPowerProcess;

    // @generated-support Transparent root-to-Process route for MON-01.
    connection support01 : PortConnection connect command_report to protected_start_power_process.command_report;
    // @generated-support Transparent root-to-Process route for MON-02.
    connection support02 : PortConnection connect brake_pedal_report to protected_start_power_process.brake_pedal_report;
    // @generated-support Transparent root-to-Process route for MON-03.
    connection support03 : PortConnection connect temperature_report to protected_start_power_process.temperature_report;
    // @generated-support Transparent root-to-Process route for MON-04.
    connection support04 : PortConnection connect electrical_power_report to protected_start_power_process.electrical_power_report;
    // @generated-support Transparent root-to-Process route for MON-05.
    connection support05 : PortConnection connect parking_brake_report to protected_start_power_process.parking_brake_report;
    // @generated-support Transparent root-to-Process route for MON-06.
    connection support06 : PortConnection connect self_test_report to protected_start_power_process.self_test_report;
    // @generated-support Transparent Process-to-root route for CTRL-01.
    connection support07 : PortConnection connect protected_start_power_process.actuation_disposition to actuation_disposition;
    // @generated-support Transparent Process-to-root route for CTRL-02.
    connection support08 : PortConnection connect protected_start_power_process.supervisory_status to supervisory_status;
  }

  // Exactly one explicit root System usage.
  // @trace BOUND-01
  part protected_start_power_supervisor : ProtectedStartPowerSupervisorSystem;
}
