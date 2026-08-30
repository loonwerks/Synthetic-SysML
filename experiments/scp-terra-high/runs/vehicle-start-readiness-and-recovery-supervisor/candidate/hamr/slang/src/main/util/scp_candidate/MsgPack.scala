// #Sireum
// @formatter:off

// This file is auto-generated from RequestDisposition.scala, BrakeObservation.scala, ThermalCondition.scala, MaintenanceCondition.scala, HealthQualification.scala, PowerObservation.scala, SelfTestObservation.scala, TestCycleDirective.scala, CycleAssessment.scala, StartDecision.scala, LifecycleDirectiveSnapshot.scala, LifecyclePreMode.scala, LifecycleMode.scala, LifecycleReason.scala, StartEnable.scala, ParkingBrakeCommand.scala, PowerDisposition.scala, SelfTestCommand.scala, ControlLifecycleMode.scala, SupervisoryStatus.scala, CommittedTestCycle.scala, RequestLevels.scala, BrakeFacts.scala, PowerFacts.scala, RequestFacts.scala, HealthObservation.scala, StartAuthorizationFacts.scala, AppliedLifecycleSnapshot.scala, ControlFrame.scala, Base_Types.scala, RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_Containers.scala, BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_Containers.scala, HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_Containers.scala, PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_Containers.scala, SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_Containers.scala, StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_Containers.scala, LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_Containers.scala, CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload: Z = -32

    val Vehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload: Z = -31

    val Vehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload: Z = -30

    val Vehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload: Z = -29

    val Vehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload: Z = -28

    val Vehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload: Z = -27

    val Vehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload: Z = -26

    val Vehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload: Z = -25

    val Vehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload: Z = -24

    val Vehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload: Z = -23

    val Vehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload: Z = -22

    val Vehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload: Z = -21

    val Vehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload: Z = -20

    val Vehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload: Z = -19

    val Vehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload: Z = -18

    val Vehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload: Z = -17

    val Vehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload: Z = -16

    val Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload: Z = -15

    val Vehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload: Z = -14

    val Vehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload: Z = -13

    val Vehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload: Z = -12

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels: Z = -11

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload: Z = -10

    val Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts: Z = -9

    val Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload: Z = -8

    val Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts: Z = -7

    val Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload: Z = -6

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts: Z = -5

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload: Z = -4

    val Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation: Z = -3

    val Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload: Z = -2

    val Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts: Z = -1

    val Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload: Z = 0

    val Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot: Z = 1

    val Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload: Z = 2

    val Vehicle_Start_Readiness_Recovery_SupervisorControlFrame: Z = 3

    val Vehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload: Z = 4

    val Base_TypesBoolean_Payload: Z = 5

    val Base_TypesInteger_Payload: Z = 6

    val Base_TypesInteger_8_Payload: Z = 7

    val Base_TypesInteger_16_Payload: Z = 8

    val Base_TypesInteger_32_Payload: Z = 9

    val Base_TypesInteger_64_Payload: Z = 10

    val Base_TypesUnsigned_8_Payload: Z = 11

    val Base_TypesUnsigned_16_Payload: Z = 12

    val Base_TypesUnsigned_32_Payload: Z = 13

    val Base_TypesUnsigned_64_Payload: Z = 14

    val Base_TypesFloat_Payload: Z = 15

    val Base_TypesFloat_32_Payload: Z = 16

    val Base_TypesFloat_64_Payload: Z = 17

    val Base_TypesCharacter_Payload: Z = 18

    val Base_TypesString_Payload: Z = 19

    val Base_TypesBits_Payload: Z = 20

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P: Z = 21

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS: Z = 22

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P: Z = 23

    val Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS: Z = 24

    val Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P: Z = 25

    val Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS: Z = 26

    val Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P: Z = 27

    val Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS: Z = 28

    val Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P: Z = 29

    val Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS: Z = 30

    val Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P: Z = 31

    val Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS: Z = 32

    val Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P: Z = 33

    val Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS: Z = 34

    val Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P: Z = 35

    val Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS: Z = 36

    val Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P: Z = 37

    val Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS: Z = 38

    val Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P: Z = 39

    val Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS: Z = 40

    val Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P: Z = 41

    val Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS: Z = 42

    val Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P: Z = 43

    val Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS: Z = 44

    val Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P: Z = 45

    val Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS: Z = 46

    val Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P: Z = 47

    val Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS: Z = 48

    val Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P: Z = 49

    val Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS: Z = 50

    val Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P: Z = 51

    val Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS: Z = 52

    val utilEmptyContainer: Z = 53

    val _artEmpty: Z = 54

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartEnableType(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartEnableType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(o: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(o: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(o: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels)
      writer.writeB(o.start)
      writer.writeB(o.off)
      writer.writeB(o.returnLevel)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts)
      writer.writeB(o.evidenceTrusted)
      writer.writeB(o.readyForAdmission)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts)
      writer.writeB(o.evidenceTrusted)
      writer.writeB(o.availableForSupervision)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts)
      writer.writeB(o.offActive)
      writer.writeB(o.freshReturn)
      writer.writeB(o.freshStart)
      writer.writeB(o.conflict)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(o.disposition)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation)
      writeVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(o.thermal)
      writeVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(o.maintenance)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(o.decision)
      writer.writeB(o.conflict)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(o.cycleDirective)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(o.preModeSnapshot)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o.nextMode)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(o.reason)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.value)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorControlFrame)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartEnableType(o.startEnable)
      writeVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(o.parkingBrake)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(o.powerDisposition)
      writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(o.selfTestCommand)
      writeVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(o.lifecycleMode)
      writeVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(o.status)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload)
      writeVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o.api_request_levels)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS)
      writer.writeB(o.In_previousOff)
      writer.writeB(o.In_previousReturn)
      writer.writeB(o.In_previousStart)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o.api_request_levels)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_to_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_to_lifecycle)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS)
      writer.writeB(o.previousOff)
      writer.writeB(o.previousReturn)
      writer.writeB(o.previousStart)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_to_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_to_lifecycle)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(o.api_brake_observation)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(o.api_brake_observation)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_to_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_to_lifecycle)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_to_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_to_lifecycle)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o.api_health_observation)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o.api_health_observation)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_to_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_to_lifecycle)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_to_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_to_lifecycle)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(o.api_power_observation)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(o.api_power_observation)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_to_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_to_lifecycle)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_to_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_to_lifecycle)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(o.api_self_test_observation)
      writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.api_test_cycle_directive)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(o.In_committedTestCycle)
      writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(o.api_self_test_observation)
      writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.api_test_cycle_directive)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.api_cycle_assessment)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(o.committedTestCycle)
      writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.api_cycle_assessment)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_facts)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_qualification)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_facts)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_facts)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_facts)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_qualification)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_facts)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_facts)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization_to_lifecycle)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization_to_outcome)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization_to_lifecycle)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization_to_outcome)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_facts)
      writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.api_cycle_assessment)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_qualification)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_facts)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_facts)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o.In_lifecycleModeMemory)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization)
      writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_facts)
      writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.api_cycle_assessment)
      writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_qualification)
      writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_facts)
      writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_facts)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.api_applied_lifecycle)
      writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.api_test_cycle_directive)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o.lifecycleModeMemory)
      writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.api_applied_lifecycle)
      writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.api_test_cycle_directive)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.api_applied_lifecycle)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.api_applied_lifecycle)
      writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container): Unit = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o)
      }
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P)
      writeVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o.api_control_frame)
    }

    def writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS)
      writeVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o.api_control_frame)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorStartDecision_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartDecision_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartEnableType(): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorStartEnable_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartEnable_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorStartEnableType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type = {
      val r = reader.readZ()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.byOrdinal(r).get
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestLevelsT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestLevelsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels)
      }
      val start = reader.readB()
      val off = reader.readB()
      val returnLevel = reader.readB()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels(start, off, returnLevel)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFactsT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeFactsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts)
      }
      val evidenceTrusted = reader.readB()
      val readyForAdmission = reader.readB()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts(evidenceTrusted, readyForAdmission)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerFactsT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerFactsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts)
      }
      val evidenceTrusted = reader.readB()
      val availableForSupervision = reader.readB()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts(evidenceTrusted, availableForSupervision)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestFactsT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestFactsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts)
      }
      val offActive = reader.readB()
      val freshReturn = reader.readB()
      val freshStart = reader.readB()
      val conflict = reader.readB()
      val disposition = readVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts(offActive, freshReturn, freshStart, conflict, disposition)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthObservationT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthObservationT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation)
      }
      val thermal = readVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType()
      val maintenance = readVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation(thermal, maintenance)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFactsT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFactsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts)
      }
      val decision = readVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType()
      val conflict = reader.readB()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts(decision, conflict)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshotT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshotT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot)
      }
      val cycleDirective = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType()
      val preModeSnapshot = readVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType()
      val nextMode = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType()
      val reason = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot(cycleDirective, preModeSnapshot, nextMode, reason)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      return Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorControlFrame(): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorControlFrameT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorControlFrameT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorControlFrame)
      }
      val startEnable = readVehicle_Start_Readiness_Recovery_SupervisorStartEnableType()
      val parkingBrake = readVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType()
      val powerDisposition = readVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType()
      val selfTestCommand = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType()
      val lifecycleMode = readVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType()
      val status = readVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame(startEnable, parkingBrake, powerDisposition, selfTestCommand, lifecycleMode, status)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorControlFrame_PayloadT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorControlFrame_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload)
      }
      val value = readVehicle_Start_Readiness_Recovery_SupervisorControlFrame()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P)
      }
      val api_request_levels = readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(api_request_levels)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS)
      }
      val In_previousOff = reader.readB()
      val In_previousReturn = reader.readB()
      val In_previousStart = reader.readB()
      val api_request_levels = readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(In_previousOff, In_previousReturn, In_previousStart, api_request_levels)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P)
      }
      val api_request_to_authorization = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      val api_request_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(api_request_to_authorization, api_request_to_lifecycle)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS)
      }
      val previousOff = reader.readB()
      val previousReturn = reader.readB()
      val previousStart = reader.readB()
      val api_request_to_authorization = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      val api_request_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(previousOff, previousReturn, previousStart, api_request_to_authorization, api_request_to_lifecycle)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P)
      }
      val api_brake_observation = readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(api_brake_observation)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS)
      }
      val api_brake_observation = readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(api_brake_observation)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P)
      }
      val api_brake_to_authorization = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      val api_brake_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(api_brake_to_authorization, api_brake_to_lifecycle)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS)
      }
      val api_brake_to_authorization = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      val api_brake_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(api_brake_to_authorization, api_brake_to_lifecycle)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P)
      }
      val api_health_observation = readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(api_health_observation)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS)
      }
      val api_health_observation = readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(api_health_observation)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P)
      }
      val api_health_to_authorization = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      val api_health_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(api_health_to_authorization, api_health_to_lifecycle)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS)
      }
      val api_health_to_authorization = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      val api_health_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(api_health_to_authorization, api_health_to_lifecycle)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P)
      }
      val api_power_observation = readVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(api_power_observation)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS)
      }
      val api_power_observation = readVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(api_power_observation)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P)
      }
      val api_power_to_authorization = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      val api_power_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(api_power_to_authorization, api_power_to_lifecycle)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS)
      }
      val api_power_to_authorization = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      val api_power_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(api_power_to_authorization, api_power_to_lifecycle)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P)
      }
      val api_self_test_observation = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType()
      val api_test_cycle_directive = readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(api_self_test_observation, api_test_cycle_directive)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS)
      }
      val In_committedTestCycle = readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType()
      val api_self_test_observation = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType()
      val api_test_cycle_directive = readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(In_committedTestCycle, api_self_test_observation, api_test_cycle_directive)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P)
      }
      val api_cycle_assessment = readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(api_cycle_assessment)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS)
      }
      val committedTestCycle = readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType()
      val api_cycle_assessment = readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(committedTestCycle, api_cycle_assessment)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P)
      }
      val api_brake_facts = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      val api_health_qualification = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      val api_power_facts = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      val api_request_facts = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(api_brake_facts, api_health_qualification, api_power_facts, api_request_facts)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS)
      }
      val api_brake_facts = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      val api_health_qualification = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      val api_power_facts = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      val api_request_facts = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(api_brake_facts, api_health_qualification, api_power_facts, api_request_facts)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P)
      }
      val api_authorization_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      val api_authorization_to_outcome = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(api_authorization_to_lifecycle, api_authorization_to_outcome)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS)
      }
      val api_authorization_to_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      val api_authorization_to_outcome = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(api_authorization_to_lifecycle, api_authorization_to_outcome)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P)
      }
      val api_authorization = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      val api_brake_facts = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      val api_cycle_assessment = readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      val api_health_qualification = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      val api_power_facts = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      val api_request_facts = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(api_authorization, api_brake_facts, api_cycle_assessment, api_health_qualification, api_power_facts, api_request_facts)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS)
      }
      val In_lifecycleModeMemory = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType()
      val api_authorization = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      val api_brake_facts = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      val api_cycle_assessment = readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      val api_health_qualification = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      val api_power_facts = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      val api_request_facts = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(In_lifecycleModeMemory, api_authorization, api_brake_facts, api_cycle_assessment, api_health_qualification, api_power_facts, api_request_facts)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P)
      }
      val api_applied_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      val api_test_cycle_directive = readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(api_applied_lifecycle, api_test_cycle_directive)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS)
      }
      val lifecycleModeMemory = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType()
      val api_applied_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      val api_test_cycle_directive = readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(lifecycleModeMemory, api_applied_lifecycle, api_test_cycle_directive)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P)
      }
      val api_applied_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      val api_authorization = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(api_applied_lifecycle, api_authorization)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS)
      }
      val api_applied_lifecycle = readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      val api_authorization = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(api_applied_lifecycle, api_authorization)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P)
      }
      val api_control_frame = readVehicle_Start_Readiness_Recovery_SupervisorControlFrame()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(api_control_frame)
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS = {
      val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(F)
      return r
    }

    def readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS)
      }
      val api_control_frame = readVehicle_Start_Readiness_Recovery_SupervisorControlFrame()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(api_control_frame)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartEnable_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorControlFrame_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartDecision_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_PayloadT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Vehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestLevels _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerFacts _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestFacts _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthObservation _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorControlFrame(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorControlFrame(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorControlFrame()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorControlFrame _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o)
    return w.result
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(data: ISZ[U8]): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(reader: Reader): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS = {
      val r = reader.readVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}