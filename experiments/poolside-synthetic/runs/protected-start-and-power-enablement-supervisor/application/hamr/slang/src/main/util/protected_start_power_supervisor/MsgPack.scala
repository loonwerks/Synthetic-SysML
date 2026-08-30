// #Sireum
// @formatter:off

// This file is auto-generated from Command.scala, Validity.scala, PedalCondition.scala, TemperatureBand.scala, QualifiedTemperature.scala, SupplyAvailability.scala, ParkingBrakeCondition.scala, ThermalState.scala, SelfTestProgress.scala, SelfTestState.scala, Session.scala, SessionCause.scala, RearmState.scala, FuelDisposition.scala, ElectricalDisposition.scala, ParkingBrakeDisposition.scala, Notice.scala, CommandReport.scala, QualifiedCommandFacts.scala, QualifiedPedalFacts.scala, QualifiedSupplyFacts.scala, QualifiedParkingBrakeFacts.scala, StartRestraintFact.scala, ReadinessFacts.scala, ExactFaultSummary.scala, RecoveryPermitFact.scala, BrakePedalReport.scala, TemperatureReport.scala, ElectricalPowerReport.scala, ParkingBrakeReport.scala, ThermalStateFacts.scala, SelfTestReport.scala, SelfTestStateFacts.scala, SessionDecisionFacts.scala, RearmStateFacts.scala, ActuationDisposition.scala, SupervisoryStatus.scala, Base_Types.scala, CommandQualificationOwner_protected_start_power_process_command_qualification_owner_Containers.scala, BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_Containers.scala, TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_Containers.scala, ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_Containers.scala, ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_Containers.scala, ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_Containers.scala, SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_Containers.scala, StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_Containers.scala, ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_Containers.scala, OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_Containers.scala, FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_Containers.scala, RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_Containers.scala, ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_Containers.scala, SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package protected_start_power_supervisor

import org.sireum._

object MsgPack {

  object Constants {

    val Protected_Start_Power_SupervisorCommand_Payload: Z = -32

    val Protected_Start_Power_SupervisorValidity_Payload: Z = -31

    val Protected_Start_Power_SupervisorPedalCondition_Payload: Z = -30

    val Protected_Start_Power_SupervisorTemperatureBand_Payload: Z = -29

    val Protected_Start_Power_SupervisorQualifiedTemperature_Payload: Z = -28

    val Protected_Start_Power_SupervisorSupplyAvailability_Payload: Z = -27

    val Protected_Start_Power_SupervisorParkingBrakeCondition_Payload: Z = -26

    val Protected_Start_Power_SupervisorThermalState_Payload: Z = -25

    val Protected_Start_Power_SupervisorSelfTestProgress_Payload: Z = -24

    val Protected_Start_Power_SupervisorSelfTestState_Payload: Z = -23

    val Protected_Start_Power_SupervisorSession_Payload: Z = -22

    val Protected_Start_Power_SupervisorSessionCause_Payload: Z = -21

    val Protected_Start_Power_SupervisorRearmState_Payload: Z = -20

    val Protected_Start_Power_SupervisorFuelDisposition_Payload: Z = -19

    val Protected_Start_Power_SupervisorElectricalDisposition_Payload: Z = -18

    val Protected_Start_Power_SupervisorParkingBrakeDisposition_Payload: Z = -17

    val Protected_Start_Power_SupervisorNotice_Payload: Z = -16

    val Protected_Start_Power_SupervisorCommandReport: Z = -15

    val Protected_Start_Power_SupervisorCommandReport_Payload: Z = -14

    val Protected_Start_Power_SupervisorQualifiedCommandFacts: Z = -13

    val Protected_Start_Power_SupervisorQualifiedCommandFacts_Payload: Z = -12

    val Protected_Start_Power_SupervisorQualifiedPedalFacts: Z = -11

    val Protected_Start_Power_SupervisorQualifiedPedalFacts_Payload: Z = -10

    val Protected_Start_Power_SupervisorQualifiedSupplyFacts: Z = -9

    val Protected_Start_Power_SupervisorQualifiedSupplyFacts_Payload: Z = -8

    val Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts: Z = -7

    val Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload: Z = -6

    val Protected_Start_Power_SupervisorStartRestraintFact: Z = -5

    val Protected_Start_Power_SupervisorStartRestraintFact_Payload: Z = -4

    val Protected_Start_Power_SupervisorReadinessFacts: Z = -3

    val Protected_Start_Power_SupervisorReadinessFacts_Payload: Z = -2

    val Protected_Start_Power_SupervisorExactFaultSummary: Z = -1

    val Protected_Start_Power_SupervisorExactFaultSummary_Payload: Z = 0

    val Protected_Start_Power_SupervisorRecoveryPermitFact: Z = 1

    val Protected_Start_Power_SupervisorRecoveryPermitFact_Payload: Z = 2

    val Protected_Start_Power_SupervisorBrakePedalReport: Z = 3

    val Protected_Start_Power_SupervisorBrakePedalReport_Payload: Z = 4

    val Protected_Start_Power_SupervisorTemperatureReport: Z = 5

    val Protected_Start_Power_SupervisorTemperatureReport_Payload: Z = 6

    val Protected_Start_Power_SupervisorElectricalPowerReport: Z = 7

    val Protected_Start_Power_SupervisorElectricalPowerReport_Payload: Z = 8

    val Protected_Start_Power_SupervisorParkingBrakeReport: Z = 9

    val Protected_Start_Power_SupervisorParkingBrakeReport_Payload: Z = 10

    val Protected_Start_Power_SupervisorThermalStateFacts: Z = 11

    val Protected_Start_Power_SupervisorThermalStateFacts_Payload: Z = 12

    val Protected_Start_Power_SupervisorSelfTestReport: Z = 13

    val Protected_Start_Power_SupervisorSelfTestReport_Payload: Z = 14

    val Protected_Start_Power_SupervisorSelfTestStateFacts: Z = 15

    val Protected_Start_Power_SupervisorSelfTestStateFacts_Payload: Z = 16

    val Protected_Start_Power_SupervisorSessionDecisionFacts: Z = 17

    val Protected_Start_Power_SupervisorSessionDecisionFacts_Payload: Z = 18

    val Protected_Start_Power_SupervisorRearmStateFacts: Z = 19

    val Protected_Start_Power_SupervisorRearmStateFacts_Payload: Z = 20

    val Protected_Start_Power_SupervisorActuationDisposition: Z = 21

    val Protected_Start_Power_SupervisorActuationDisposition_Payload: Z = 22

    val Protected_Start_Power_SupervisorSupervisoryStatus: Z = 23

    val Protected_Start_Power_SupervisorSupervisoryStatus_Payload: Z = 24

    val Base_TypesBoolean_Payload: Z = 25

    val Base_TypesInteger_Payload: Z = 26

    val Base_TypesInteger_8_Payload: Z = 27

    val Base_TypesInteger_16_Payload: Z = 28

    val Base_TypesInteger_32_Payload: Z = 29

    val Base_TypesInteger_64_Payload: Z = 30

    val Base_TypesUnsigned_8_Payload: Z = 31

    val Base_TypesUnsigned_16_Payload: Z = 32

    val Base_TypesUnsigned_32_Payload: Z = 33

    val Base_TypesUnsigned_64_Payload: Z = 34

    val Base_TypesFloat_Payload: Z = 35

    val Base_TypesFloat_32_Payload: Z = 36

    val Base_TypesFloat_64_Payload: Z = 37

    val Base_TypesCharacter_Payload: Z = 38

    val Base_TypesString_Payload: Z = 39

    val Base_TypesBits_Payload: Z = 40

    val Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P: Z = 41

    val Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS: Z = 42

    val Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P: Z = 43

    val Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS: Z = 44

    val Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P: Z = 45

    val Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS: Z = 46

    val Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P: Z = 47

    val Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS: Z = 48

    val Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P: Z = 49

    val Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS: Z = 50

    val Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P: Z = 51

    val Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS: Z = 52

    val Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P: Z = 53

    val Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS: Z = 54

    val Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P: Z = 55

    val Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS: Z = 56

    val Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P: Z = 57

    val Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS: Z = 58

    val Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P: Z = 59

    val Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS: Z = 60

    val Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P: Z = 61

    val Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS: Z = 62

    val Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P: Z = 63

    val Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS: Z = 64

    val Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P: Z = 65

    val Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS: Z = 66

    val Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P: Z = 67

    val Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS: Z = 68

    val Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P: Z = 69

    val Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS: Z = 70

    val Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P: Z = 71

    val Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS: Z = 72

    val Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P: Z = 73

    val Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS: Z = 74

    val Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P: Z = 75

    val Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS: Z = 76

    val Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P: Z = 77

    val Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS: Z = 78

    val Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P: Z = 79

    val Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS: Z = 80

    val Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P: Z = 81

    val Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS: Z = 82

    val Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P: Z = 83

    val Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS: Z = 84

    val Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P: Z = 85

    val Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS: Z = 86

    val Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P: Z = 87

    val Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS: Z = 88

    val Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P: Z = 89

    val Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS: Z = 90

    val Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P: Z = 91

    val Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS: Z = 92

    val Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P: Z = 93

    val Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS: Z = 94

    val Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P: Z = 95

    val Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS: Z = 96

    val utilEmptyContainer: Z = 97

    val _artEmpty: Z = 98

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeProtected_Start_Power_SupervisorCommandType(o: Protected_Start_Power_Supervisor.Command.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorCommand_Payload(o: Protected_Start_Power_Supervisor.Command_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorCommand_Payload)
      writeProtected_Start_Power_SupervisorCommandType(o.value)
    }

    def writeProtected_Start_Power_SupervisorValidityType(o: Protected_Start_Power_Supervisor.Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorValidity_Payload(o: Protected_Start_Power_Supervisor.Validity_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorValidity_Payload)
      writeProtected_Start_Power_SupervisorValidityType(o.value)
    }

    def writeProtected_Start_Power_SupervisorPedalConditionType(o: Protected_Start_Power_Supervisor.PedalCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorPedalCondition_Payload(o: Protected_Start_Power_Supervisor.PedalCondition_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorPedalCondition_Payload)
      writeProtected_Start_Power_SupervisorPedalConditionType(o.value)
    }

    def writeProtected_Start_Power_SupervisorTemperatureBandType(o: Protected_Start_Power_Supervisor.TemperatureBand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorTemperatureBand_Payload(o: Protected_Start_Power_Supervisor.TemperatureBand_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorTemperatureBand_Payload)
      writeProtected_Start_Power_SupervisorTemperatureBandType(o.value)
    }

    def writeProtected_Start_Power_SupervisorQualifiedTemperatureType(o: Protected_Start_Power_Supervisor.QualifiedTemperature.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorQualifiedTemperature_Payload(o: Protected_Start_Power_Supervisor.QualifiedTemperature_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedTemperature_Payload)
      writeProtected_Start_Power_SupervisorQualifiedTemperatureType(o.value)
    }

    def writeProtected_Start_Power_SupervisorSupplyAvailabilityType(o: Protected_Start_Power_Supervisor.SupplyAvailability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorSupplyAvailability_Payload(o: Protected_Start_Power_Supervisor.SupplyAvailability_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSupplyAvailability_Payload)
      writeProtected_Start_Power_SupervisorSupplyAvailabilityType(o.value)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeConditionType(o: Protected_Start_Power_Supervisor.ParkingBrakeCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorParkingBrakeCondition_Payload)
      writeProtected_Start_Power_SupervisorParkingBrakeConditionType(o.value)
    }

    def writeProtected_Start_Power_SupervisorThermalStateType(o: Protected_Start_Power_Supervisor.ThermalState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorThermalState_Payload(o: Protected_Start_Power_Supervisor.ThermalState_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorThermalState_Payload)
      writeProtected_Start_Power_SupervisorThermalStateType(o.value)
    }

    def writeProtected_Start_Power_SupervisorSelfTestProgressType(o: Protected_Start_Power_Supervisor.SelfTestProgress.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorSelfTestProgress_Payload(o: Protected_Start_Power_Supervisor.SelfTestProgress_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestProgress_Payload)
      writeProtected_Start_Power_SupervisorSelfTestProgressType(o.value)
    }

    def writeProtected_Start_Power_SupervisorSelfTestStateType(o: Protected_Start_Power_Supervisor.SelfTestState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorSelfTestState_Payload(o: Protected_Start_Power_Supervisor.SelfTestState_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestState_Payload)
      writeProtected_Start_Power_SupervisorSelfTestStateType(o.value)
    }

    def writeProtected_Start_Power_SupervisorSessionType(o: Protected_Start_Power_Supervisor.Session.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorSession_Payload(o: Protected_Start_Power_Supervisor.Session_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSession_Payload)
      writeProtected_Start_Power_SupervisorSessionType(o.value)
    }

    def writeProtected_Start_Power_SupervisorSessionCauseType(o: Protected_Start_Power_Supervisor.SessionCause.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorSessionCause_Payload(o: Protected_Start_Power_Supervisor.SessionCause_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSessionCause_Payload)
      writeProtected_Start_Power_SupervisorSessionCauseType(o.value)
    }

    def writeProtected_Start_Power_SupervisorRearmStateType(o: Protected_Start_Power_Supervisor.RearmState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorRearmState_Payload(o: Protected_Start_Power_Supervisor.RearmState_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRearmState_Payload)
      writeProtected_Start_Power_SupervisorRearmStateType(o.value)
    }

    def writeProtected_Start_Power_SupervisorFuelDispositionType(o: Protected_Start_Power_Supervisor.FuelDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorFuelDisposition_Payload(o: Protected_Start_Power_Supervisor.FuelDisposition_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorFuelDisposition_Payload)
      writeProtected_Start_Power_SupervisorFuelDispositionType(o.value)
    }

    def writeProtected_Start_Power_SupervisorElectricalDispositionType(o: Protected_Start_Power_Supervisor.ElectricalDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorElectricalDisposition_Payload(o: Protected_Start_Power_Supervisor.ElectricalDisposition_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorElectricalDisposition_Payload)
      writeProtected_Start_Power_SupervisorElectricalDispositionType(o.value)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeDispositionType(o: Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorParkingBrakeDisposition_Payload)
      writeProtected_Start_Power_SupervisorParkingBrakeDispositionType(o.value)
    }

    def writeProtected_Start_Power_SupervisorNoticeType(o: Protected_Start_Power_Supervisor.Notice.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeProtected_Start_Power_SupervisorNotice_Payload(o: Protected_Start_Power_Supervisor.Notice_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorNotice_Payload)
      writeProtected_Start_Power_SupervisorNoticeType(o.value)
    }

    def writeProtected_Start_Power_SupervisorCommandReport(o: Protected_Start_Power_Supervisor.CommandReport): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorCommandReport)
      writeProtected_Start_Power_SupervisorCommandType(o.command)
      writeProtected_Start_Power_SupervisorValidityType(o.status)
    }

    def writeProtected_Start_Power_SupervisorCommandReport_Payload(o: Protected_Start_Power_Supervisor.CommandReport_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorCommandReport_Payload)
      writeProtected_Start_Power_SupervisorCommandReport(o.value)
    }

    def writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o: Protected_Start_Power_Supervisor.QualifiedCommandFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedCommandFacts)
      writeProtected_Start_Power_SupervisorCommandType(o.command)
      writer.writeB(o.selfTestResetRequested)
    }

    def writeProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedCommandFacts_Payload)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorQualifiedPedalFacts(o: Protected_Start_Power_Supervisor.QualifiedPedalFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedPedalFacts)
      writer.writeB(o.pedalStartCondition)
    }

    def writeProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedPedalFacts_Payload)
      writeProtected_Start_Power_SupervisorQualifiedPedalFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorQualifiedSupplyFacts(o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedSupplyFacts)
      writer.writeB(o.supplyUsable)
    }

    def writeProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedSupplyFacts_Payload)
      writeProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts)
      writer.writeB(o.brakeAppliedEvidence)
    }

    def writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload)
      writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorStartRestraintFact(o: Protected_Start_Power_Supervisor.StartRestraintFact): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorStartRestraintFact)
      writer.writeB(o.startRestraintSatisfied)
    }

    def writeProtected_Start_Power_SupervisorStartRestraintFact_Payload(o: Protected_Start_Power_Supervisor.StartRestraintFact_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorStartRestraintFact_Payload)
      writeProtected_Start_Power_SupervisorStartRestraintFact(o.value)
    }

    def writeProtected_Start_Power_SupervisorReadinessFacts(o: Protected_Start_Power_Supervisor.ReadinessFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorReadinessFacts)
      writer.writeB(o.startReady)
      writer.writeB(o.sustainReady)
    }

    def writeProtected_Start_Power_SupervisorReadinessFacts_Payload(o: Protected_Start_Power_Supervisor.ReadinessFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorReadinessFacts_Payload)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorExactFaultSummary(o: Protected_Start_Power_Supervisor.ExactFaultSummary): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorExactFaultSummary)
      writer.writeB(o.commandFault)
      writer.writeB(o.pedalFault)
      writer.writeB(o.thermalFault)
      writer.writeB(o.supplyFault)
      writer.writeB(o.parkingBrakeFault)
      writer.writeB(o.selfTestFault)
      writer.writeB(o.anyFault)
    }

    def writeProtected_Start_Power_SupervisorExactFaultSummary_Payload(o: Protected_Start_Power_Supervisor.ExactFaultSummary_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorExactFaultSummary_Payload)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.value)
    }

    def writeProtected_Start_Power_SupervisorRecoveryPermitFact(o: Protected_Start_Power_Supervisor.RecoveryPermitFact): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRecoveryPermitFact)
      writer.writeB(o.recoveryPermit)
    }

    def writeProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(o: Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRecoveryPermitFact_Payload)
      writeProtected_Start_Power_SupervisorRecoveryPermitFact(o.value)
    }

    def writeProtected_Start_Power_SupervisorBrakePedalReport(o: Protected_Start_Power_Supervisor.BrakePedalReport): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorBrakePedalReport)
      writeProtected_Start_Power_SupervisorPedalConditionType(o.condition)
      writeProtected_Start_Power_SupervisorValidityType(o.status)
    }

    def writeProtected_Start_Power_SupervisorBrakePedalReport_Payload(o: Protected_Start_Power_Supervisor.BrakePedalReport_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorBrakePedalReport_Payload)
      writeProtected_Start_Power_SupervisorBrakePedalReport(o.value)
    }

    def writeProtected_Start_Power_SupervisorTemperatureReport(o: Protected_Start_Power_Supervisor.TemperatureReport): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorTemperatureReport)
      writeProtected_Start_Power_SupervisorTemperatureBandType(o.band)
      writeProtected_Start_Power_SupervisorValidityType(o.status)
    }

    def writeProtected_Start_Power_SupervisorTemperatureReport_Payload(o: Protected_Start_Power_Supervisor.TemperatureReport_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorTemperatureReport_Payload)
      writeProtected_Start_Power_SupervisorTemperatureReport(o.value)
    }

    def writeProtected_Start_Power_SupervisorElectricalPowerReport(o: Protected_Start_Power_Supervisor.ElectricalPowerReport): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorElectricalPowerReport)
      writeProtected_Start_Power_SupervisorSupplyAvailabilityType(o.availability)
      writeProtected_Start_Power_SupervisorValidityType(o.status)
    }

    def writeProtected_Start_Power_SupervisorElectricalPowerReport_Payload(o: Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorElectricalPowerReport_Payload)
      writeProtected_Start_Power_SupervisorElectricalPowerReport(o.value)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeReport(o: Protected_Start_Power_Supervisor.ParkingBrakeReport): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorParkingBrakeReport)
      writeProtected_Start_Power_SupervisorParkingBrakeConditionType(o.condition)
      writeProtected_Start_Power_SupervisorValidityType(o.status)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeReport_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorParkingBrakeReport_Payload)
      writeProtected_Start_Power_SupervisorParkingBrakeReport(o.value)
    }

    def writeProtected_Start_Power_SupervisorThermalStateFacts(o: Protected_Start_Power_Supervisor.ThermalStateFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorThermalStateFacts)
      writeProtected_Start_Power_SupervisorThermalStateType(o.thermalState)
      writer.writeB(o.thermalClear)
    }

    def writeProtected_Start_Power_SupervisorThermalStateFacts_Payload(o: Protected_Start_Power_Supervisor.ThermalStateFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorThermalStateFacts_Payload)
      writeProtected_Start_Power_SupervisorThermalStateFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorSelfTestReport(o: Protected_Start_Power_Supervisor.SelfTestReport): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestReport)
      writeProtected_Start_Power_SupervisorSelfTestProgressType(o.progress)
      writeProtected_Start_Power_SupervisorValidityType(o.status)
    }

    def writeProtected_Start_Power_SupervisorSelfTestReport_Payload(o: Protected_Start_Power_Supervisor.SelfTestReport_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestReport_Payload)
      writeProtected_Start_Power_SupervisorSelfTestReport(o.value)
    }

    def writeProtected_Start_Power_SupervisorSelfTestStateFacts(o: Protected_Start_Power_Supervisor.SelfTestStateFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestStateFacts)
      writeProtected_Start_Power_SupervisorSelfTestStateType(o.selfTestState)
      writer.writeB(o.selfTestPassed)
    }

    def writeProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(o: Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestStateFacts_Payload)
      writeProtected_Start_Power_SupervisorSelfTestStateFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorSessionDecisionFacts(o: Protected_Start_Power_Supervisor.SessionDecisionFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSessionDecisionFacts)
      writeProtected_Start_Power_SupervisorSessionType(o.session)
      writeProtected_Start_Power_SupervisorSessionCauseType(o.cause)
    }

    def writeProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(o: Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSessionDecisionFacts_Payload)
      writeProtected_Start_Power_SupervisorSessionDecisionFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorRearmStateFacts(o: Protected_Start_Power_Supervisor.RearmStateFacts): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRearmStateFacts)
      writeProtected_Start_Power_SupervisorRearmStateType(o.rearmState)
    }

    def writeProtected_Start_Power_SupervisorRearmStateFacts_Payload(o: Protected_Start_Power_Supervisor.RearmStateFacts_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRearmStateFacts_Payload)
      writeProtected_Start_Power_SupervisorRearmStateFacts(o.value)
    }

    def writeProtected_Start_Power_SupervisorActuationDisposition(o: Protected_Start_Power_Supervisor.ActuationDisposition): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorActuationDisposition)
      writeProtected_Start_Power_SupervisorFuelDispositionType(o.fuel)
      writeProtected_Start_Power_SupervisorElectricalDispositionType(o.electricalPower)
      writeProtected_Start_Power_SupervisorParkingBrakeDispositionType(o.parkingBrake)
    }

    def writeProtected_Start_Power_SupervisorActuationDisposition_Payload(o: Protected_Start_Power_Supervisor.ActuationDisposition_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorActuationDisposition_Payload)
      writeProtected_Start_Power_SupervisorActuationDisposition(o.value)
    }

    def writeProtected_Start_Power_SupervisorSupervisoryStatus(o: Protected_Start_Power_Supervisor.SupervisoryStatus): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatus)
      writeProtected_Start_Power_SupervisorSessionType(o.session)
      writer.writeB(o.startReady)
      writer.writeB(o.sustainReady)
      writeProtected_Start_Power_SupervisorRearmStateType(o.rearmState)
      writeProtected_Start_Power_SupervisorNoticeType(o.notice)
      writer.writeB(o.commandFault)
      writer.writeB(o.pedalFault)
      writer.writeB(o.thermalFault)
      writer.writeB(o.supplyFault)
      writer.writeB(o.parkingBrakeFault)
      writer.writeB(o.selfTestFault)
      writer.writeB(o.anyFault)
    }

    def writeProtected_Start_Power_SupervisorSupervisoryStatus_Payload(o: Protected_Start_Power_Supervisor.SupervisoryStatus_Payload): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatus_Payload)
      writeProtected_Start_Power_SupervisorSupervisoryStatus(o.value)
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

    def writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorCommandReport(o.api_command_report)
    }

    def writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorCommandReport(o.api_command_report)
    }

    def writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P)
      writer.writeB(o.api_command_fault)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)
    }

    def writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS)
      writer.writeB(o.api_command_fault)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)
    }

    def writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorBrakePedalReport(o.api_brake_pedal_report)
    }

    def writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorBrakePedalReport(o.api_brake_pedal_report)
    }

    def writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P)
      writer.writeB(o.api_pedal_fault)
      writeProtected_Start_Power_SupervisorQualifiedPedalFacts(o.api_qualified_pedal_facts)
    }

    def writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS)
      writer.writeB(o.api_pedal_fault)
      writeProtected_Start_Power_SupervisorQualifiedPedalFacts(o.api_qualified_pedal_facts)
    }

    def writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorTemperatureReport(o.api_temperature_report)
    }

    def writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorTemperatureReport(o.api_temperature_report)
    }

    def writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorQualifiedTemperatureType(o.api_qualified_temperature)
    }

    def writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorQualifiedTemperatureType(o.api_qualified_temperature)
    }

    def writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorElectricalPowerReport(o.api_electrical_power_report)
    }

    def writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorElectricalPowerReport(o.api_electrical_power_report)
    }

    def writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.api_qualified_supply_facts)
      writer.writeB(o.api_supply_fault)
    }

    def writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.api_qualified_supply_facts)
      writer.writeB(o.api_supply_fault)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorParkingBrakeReport(o.api_parking_brake_report)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorParkingBrakeReport(o.api_parking_brake_report)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P)
      writer.writeB(o.api_parking_brake_fault)
      writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.api_qualified_parking_brake_facts)
    }

    def writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS)
      writer.writeB(o.api_parking_brake_fault)
      writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.api_qualified_parking_brake_facts)
    }

    def writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorQualifiedTemperatureType(o.api_qualified_temperature)
    }

    def writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorThermalStateType(o.In_thermalMemory)
      writeProtected_Start_Power_SupervisorQualifiedTemperatureType(o.api_qualified_temperature)
    }

    def writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P)
      writer.writeB(o.api_thermal_fault)
      writeProtected_Start_Power_SupervisorThermalStateFacts(o.api_thermal_state_facts)
    }

    def writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorThermalStateType(o.thermalMemory)
      writer.writeB(o.api_thermal_fault)
      writeProtected_Start_Power_SupervisorThermalStateFacts(o.api_thermal_state_facts)
    }

    def writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)
      writeProtected_Start_Power_SupervisorSelfTestReport(o.api_self_test_report)
    }

    def writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorSelfTestStateType(o.In_selfTestMemory)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)
      writeProtected_Start_Power_SupervisorSelfTestReport(o.api_self_test_report)
    }

    def writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P)
      writer.writeB(o.api_self_test_fault)
      writeProtected_Start_Power_SupervisorSelfTestStateFacts(o.api_self_test_state_facts)
    }

    def writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorSelfTestStateType(o.selfTestMemory)
      writer.writeB(o.api_self_test_fault)
      writeProtected_Start_Power_SupervisorSelfTestStateFacts(o.api_self_test_state_facts)
    }

    def writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.api_qualified_parking_brake_facts)
      writeProtected_Start_Power_SupervisorQualifiedPedalFacts(o.api_qualified_pedal_facts)
    }

    def writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.api_qualified_parking_brake_facts)
      writeProtected_Start_Power_SupervisorQualifiedPedalFacts(o.api_qualified_pedal_facts)
    }

    def writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorStartRestraintFact(o.api_start_restraint_fact)
    }

    def writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorStartRestraintFact(o.api_start_restraint_fact)
    }

    def writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.api_qualified_supply_facts)
      writeProtected_Start_Power_SupervisorSelfTestStateFacts(o.api_self_test_state_facts)
      writeProtected_Start_Power_SupervisorStartRestraintFact(o.api_start_restraint_fact)
      writeProtected_Start_Power_SupervisorThermalStateFacts(o.api_thermal_state_facts)
    }

    def writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.api_qualified_supply_facts)
      writeProtected_Start_Power_SupervisorSelfTestStateFacts(o.api_self_test_state_facts)
      writeProtected_Start_Power_SupervisorStartRestraintFact(o.api_start_restraint_fact)
      writeProtected_Start_Power_SupervisorThermalStateFacts(o.api_thermal_state_facts)
    }

    def writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)
    }

    def writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)
    }

    def writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)
      writeProtected_Start_Power_SupervisorRecoveryPermitFact(o.api_recovery_permit_fact)
    }

    def writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)
      writeProtected_Start_Power_SupervisorRecoveryPermitFact(o.api_recovery_permit_fact)
    }

    def writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts)
    }

    def writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts)
    }

    def writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P)
      writer.writeB(o.api_command_fault)
      writer.writeB(o.api_parking_brake_fault)
      writer.writeB(o.api_pedal_fault)
      writer.writeB(o.api_self_test_fault)
      writer.writeB(o.api_supply_fault)
      writer.writeB(o.api_thermal_fault)
    }

    def writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS)
      writer.writeB(o.api_command_fault)
      writer.writeB(o.api_parking_brake_fault)
      writer.writeB(o.api_pedal_fault)
      writer.writeB(o.api_self_test_fault)
      writer.writeB(o.api_supply_fault)
      writer.writeB(o.api_thermal_fault)
    }

    def writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
    }

    def writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
    }

    def writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)
    }

    def writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorRearmStateType(o.In_rearmMemory)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
      writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)
    }

    def writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorRearmStateFacts(o.api_rearm_state_facts)
      writeProtected_Start_Power_SupervisorRecoveryPermitFact(o.api_recovery_permit_fact)
    }

    def writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorRearmStateType(o.rearmMemory)
      writeProtected_Start_Power_SupervisorRearmStateFacts(o.api_rearm_state_facts)
      writeProtected_Start_Power_SupervisorRecoveryPermitFact(o.api_recovery_permit_fact)
    }

    def writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
      writeProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts)
    }

    def writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
      writeProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts)
    }

    def writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorActuationDisposition(o.api_actuation_disposition)
    }

    def writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorActuationDisposition(o.api_actuation_disposition)
    }

    def writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)
      writeProtected_Start_Power_SupervisorRearmStateFacts(o.api_rearm_state_facts)
      writeProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts)
    }

    def writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS)
      writeProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)
      writeProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)
      writeProtected_Start_Power_SupervisorRearmStateFacts(o.api_rearm_state_facts)
      writeProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts)
    }

    def writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container): Unit = {
      o match {
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o)
      }
    }

    def writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P)
      writeProtected_Start_Power_SupervisorSupervisoryStatus(o.api_supervisory_status)
    }

    def writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS)
      writeProtected_Start_Power_SupervisorSupervisoryStatus(o.api_supervisory_status)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o)
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
        case o: Protected_Start_Power_Supervisor.Notice_Payload => writeProtected_Start_Power_SupervisorNotice_Payload(o)
        case o: Protected_Start_Power_Supervisor.Session_Payload => writeProtected_Start_Power_SupervisorSession_Payload(o)
        case o: Protected_Start_Power_Supervisor.Command_Payload => writeProtected_Start_Power_SupervisorCommand_Payload(o)
        case o: Protected_Start_Power_Supervisor.Validity_Payload => writeProtected_Start_Power_SupervisorValidity_Payload(o)
        case o: Protected_Start_Power_Supervisor.RearmState_Payload => writeProtected_Start_Power_SupervisorRearmState_Payload(o)
        case o: Protected_Start_Power_Supervisor.ThermalState_Payload => writeProtected_Start_Power_SupervisorThermalState_Payload(o)
        case o: Protected_Start_Power_Supervisor.SessionCause_Payload => writeProtected_Start_Power_SupervisorSessionCause_Payload(o)
        case o: Protected_Start_Power_Supervisor.SelfTestState_Payload => writeProtected_Start_Power_SupervisorSelfTestState_Payload(o)
        case o: Protected_Start_Power_Supervisor.CommandReport_Payload => writeProtected_Start_Power_SupervisorCommandReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.PedalCondition_Payload => writeProtected_Start_Power_SupervisorPedalCondition_Payload(o)
        case o: Protected_Start_Power_Supervisor.ReadinessFacts_Payload => writeProtected_Start_Power_SupervisorReadinessFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.SelfTestReport_Payload => writeProtected_Start_Power_SupervisorSelfTestReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.FuelDisposition_Payload => writeProtected_Start_Power_SupervisorFuelDisposition_Payload(o)
        case o: Protected_Start_Power_Supervisor.TemperatureBand_Payload => writeProtected_Start_Power_SupervisorTemperatureBand_Payload(o)
        case o: Protected_Start_Power_Supervisor.RearmStateFacts_Payload => writeProtected_Start_Power_SupervisorRearmStateFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.SelfTestProgress_Payload => writeProtected_Start_Power_SupervisorSelfTestProgress_Payload(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalReport_Payload => writeProtected_Start_Power_SupervisorBrakePedalReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.ThermalStateFacts_Payload => writeProtected_Start_Power_SupervisorThermalStateFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.TemperatureReport_Payload => writeProtected_Start_Power_SupervisorTemperatureReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.ExactFaultSummary_Payload => writeProtected_Start_Power_SupervisorExactFaultSummary_Payload(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatus_Payload => writeProtected_Start_Power_SupervisorSupervisoryStatus_Payload(o)
        case o: Protected_Start_Power_Supervisor.SupplyAvailability_Payload => writeProtected_Start_Power_SupervisorSupplyAvailability_Payload(o)
        case o: Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload => writeProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintFact_Payload => writeProtected_Start_Power_SupervisorStartRestraintFact_Payload(o)
        case o: Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload => writeProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload => writeProtected_Start_Power_SupervisorParkingBrakeReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload => writeProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedTemperature_Payload => writeProtected_Start_Power_SupervisorQualifiedTemperature_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload => writeProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload => writeProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.ActuationDisposition_Payload => writeProtected_Start_Power_SupervisorActuationDisposition_Payload(o)
        case o: Protected_Start_Power_Supervisor.ElectricalDisposition_Payload => writeProtected_Start_Power_SupervisorElectricalDisposition_Payload(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload => writeProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload => writeProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload => writeProtected_Start_Power_SupervisorElectricalPowerReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload => writeProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload => writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o)
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

    def readProtected_Start_Power_SupervisorCommandType(): Protected_Start_Power_Supervisor.Command.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.Command.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorCommand_Payload(): Protected_Start_Power_Supervisor.Command_Payload = {
      val r = readProtected_Start_Power_SupervisorCommand_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorCommand_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.Command_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorCommand_Payload)
      }
      val value = readProtected_Start_Power_SupervisorCommandType()
      return Protected_Start_Power_Supervisor.Command_Payload(value)
    }

    def readProtected_Start_Power_SupervisorValidityType(): Protected_Start_Power_Supervisor.Validity.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.Validity.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorValidity_Payload(): Protected_Start_Power_Supervisor.Validity_Payload = {
      val r = readProtected_Start_Power_SupervisorValidity_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorValidity_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorValidity_Payload)
      }
      val value = readProtected_Start_Power_SupervisorValidityType()
      return Protected_Start_Power_Supervisor.Validity_Payload(value)
    }

    def readProtected_Start_Power_SupervisorPedalConditionType(): Protected_Start_Power_Supervisor.PedalCondition.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.PedalCondition.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorPedalCondition_Payload(): Protected_Start_Power_Supervisor.PedalCondition_Payload = {
      val r = readProtected_Start_Power_SupervisorPedalCondition_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorPedalCondition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.PedalCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorPedalCondition_Payload)
      }
      val value = readProtected_Start_Power_SupervisorPedalConditionType()
      return Protected_Start_Power_Supervisor.PedalCondition_Payload(value)
    }

    def readProtected_Start_Power_SupervisorTemperatureBandType(): Protected_Start_Power_Supervisor.TemperatureBand.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.TemperatureBand.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorTemperatureBand_Payload(): Protected_Start_Power_Supervisor.TemperatureBand_Payload = {
      val r = readProtected_Start_Power_SupervisorTemperatureBand_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorTemperatureBand_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureBand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorTemperatureBand_Payload)
      }
      val value = readProtected_Start_Power_SupervisorTemperatureBandType()
      return Protected_Start_Power_Supervisor.TemperatureBand_Payload(value)
    }

    def readProtected_Start_Power_SupervisorQualifiedTemperatureType(): Protected_Start_Power_Supervisor.QualifiedTemperature.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.QualifiedTemperature.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorQualifiedTemperature_Payload(): Protected_Start_Power_Supervisor.QualifiedTemperature_Payload = {
      val r = readProtected_Start_Power_SupervisorQualifiedTemperature_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedTemperature_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedTemperature_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedTemperature_Payload)
      }
      val value = readProtected_Start_Power_SupervisorQualifiedTemperatureType()
      return Protected_Start_Power_Supervisor.QualifiedTemperature_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSupplyAvailabilityType(): Protected_Start_Power_Supervisor.SupplyAvailability.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.SupplyAvailability.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorSupplyAvailability_Payload(): Protected_Start_Power_Supervisor.SupplyAvailability_Payload = {
      val r = readProtected_Start_Power_SupervisorSupplyAvailability_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSupplyAvailability_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SupplyAvailability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSupplyAvailability_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSupplyAvailabilityType()
      return Protected_Start_Power_Supervisor.SupplyAvailability_Payload(value)
    }

    def readProtected_Start_Power_SupervisorParkingBrakeConditionType(): Protected_Start_Power_Supervisor.ParkingBrakeCondition.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.ParkingBrakeCondition.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(): Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload = {
      val r = readProtected_Start_Power_SupervisorParkingBrakeCondition_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorParkingBrakeCondition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorParkingBrakeCondition_Payload)
      }
      val value = readProtected_Start_Power_SupervisorParkingBrakeConditionType()
      return Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload(value)
    }

    def readProtected_Start_Power_SupervisorThermalStateType(): Protected_Start_Power_Supervisor.ThermalState.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.ThermalState.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorThermalState_Payload(): Protected_Start_Power_Supervisor.ThermalState_Payload = {
      val r = readProtected_Start_Power_SupervisorThermalState_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorThermalState_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorThermalState_Payload)
      }
      val value = readProtected_Start_Power_SupervisorThermalStateType()
      return Protected_Start_Power_Supervisor.ThermalState_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSelfTestProgressType(): Protected_Start_Power_Supervisor.SelfTestProgress.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.SelfTestProgress.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorSelfTestProgress_Payload(): Protected_Start_Power_Supervisor.SelfTestProgress_Payload = {
      val r = readProtected_Start_Power_SupervisorSelfTestProgress_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestProgress_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestProgress_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestProgress_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSelfTestProgressType()
      return Protected_Start_Power_Supervisor.SelfTestProgress_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSelfTestStateType(): Protected_Start_Power_Supervisor.SelfTestState.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.SelfTestState.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorSelfTestState_Payload(): Protected_Start_Power_Supervisor.SelfTestState_Payload = {
      val r = readProtected_Start_Power_SupervisorSelfTestState_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestState_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestState_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSelfTestStateType()
      return Protected_Start_Power_Supervisor.SelfTestState_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSessionType(): Protected_Start_Power_Supervisor.Session.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.Session.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorSession_Payload(): Protected_Start_Power_Supervisor.Session_Payload = {
      val r = readProtected_Start_Power_SupervisorSession_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSession_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.Session_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSession_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSessionType()
      return Protected_Start_Power_Supervisor.Session_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSessionCauseType(): Protected_Start_Power_Supervisor.SessionCause.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.SessionCause.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorSessionCause_Payload(): Protected_Start_Power_Supervisor.SessionCause_Payload = {
      val r = readProtected_Start_Power_SupervisorSessionCause_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSessionCause_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SessionCause_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSessionCause_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSessionCauseType()
      return Protected_Start_Power_Supervisor.SessionCause_Payload(value)
    }

    def readProtected_Start_Power_SupervisorRearmStateType(): Protected_Start_Power_Supervisor.RearmState.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.RearmState.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorRearmState_Payload(): Protected_Start_Power_Supervisor.RearmState_Payload = {
      val r = readProtected_Start_Power_SupervisorRearmState_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRearmState_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.RearmState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRearmState_Payload)
      }
      val value = readProtected_Start_Power_SupervisorRearmStateType()
      return Protected_Start_Power_Supervisor.RearmState_Payload(value)
    }

    def readProtected_Start_Power_SupervisorFuelDispositionType(): Protected_Start_Power_Supervisor.FuelDisposition.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.FuelDisposition.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorFuelDisposition_Payload(): Protected_Start_Power_Supervisor.FuelDisposition_Payload = {
      val r = readProtected_Start_Power_SupervisorFuelDisposition_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorFuelDisposition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.FuelDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorFuelDisposition_Payload)
      }
      val value = readProtected_Start_Power_SupervisorFuelDispositionType()
      return Protected_Start_Power_Supervisor.FuelDisposition_Payload(value)
    }

    def readProtected_Start_Power_SupervisorElectricalDispositionType(): Protected_Start_Power_Supervisor.ElectricalDisposition.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.ElectricalDisposition.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorElectricalDisposition_Payload(): Protected_Start_Power_Supervisor.ElectricalDisposition_Payload = {
      val r = readProtected_Start_Power_SupervisorElectricalDisposition_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorElectricalDisposition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorElectricalDisposition_Payload)
      }
      val value = readProtected_Start_Power_SupervisorElectricalDispositionType()
      return Protected_Start_Power_Supervisor.ElectricalDisposition_Payload(value)
    }

    def readProtected_Start_Power_SupervisorParkingBrakeDispositionType(): Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.ParkingBrakeDisposition.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(): Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload = {
      val r = readProtected_Start_Power_SupervisorParkingBrakeDisposition_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorParkingBrakeDisposition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorParkingBrakeDisposition_Payload)
      }
      val value = readProtected_Start_Power_SupervisorParkingBrakeDispositionType()
      return Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload(value)
    }

    def readProtected_Start_Power_SupervisorNoticeType(): Protected_Start_Power_Supervisor.Notice.Type = {
      val r = reader.readZ()
      return Protected_Start_Power_Supervisor.Notice.byOrdinal(r).get
    }

    def readProtected_Start_Power_SupervisorNotice_Payload(): Protected_Start_Power_Supervisor.Notice_Payload = {
      val r = readProtected_Start_Power_SupervisorNotice_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorNotice_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.Notice_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorNotice_Payload)
      }
      val value = readProtected_Start_Power_SupervisorNoticeType()
      return Protected_Start_Power_Supervisor.Notice_Payload(value)
    }

    def readProtected_Start_Power_SupervisorCommandReport(): Protected_Start_Power_Supervisor.CommandReport = {
      val r = readProtected_Start_Power_SupervisorCommandReportT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorCommandReportT(typeParsed: B): Protected_Start_Power_Supervisor.CommandReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorCommandReport)
      }
      val command = readProtected_Start_Power_SupervisorCommandType()
      val status = readProtected_Start_Power_SupervisorValidityType()
      return Protected_Start_Power_Supervisor.CommandReport(command, status)
    }

    def readProtected_Start_Power_SupervisorCommandReport_Payload(): Protected_Start_Power_Supervisor.CommandReport_Payload = {
      val r = readProtected_Start_Power_SupervisorCommandReport_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorCommandReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.CommandReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorCommandReport_Payload)
      }
      val value = readProtected_Start_Power_SupervisorCommandReport()
      return Protected_Start_Power_Supervisor.CommandReport_Payload(value)
    }

    def readProtected_Start_Power_SupervisorQualifiedCommandFacts(): Protected_Start_Power_Supervisor.QualifiedCommandFacts = {
      val r = readProtected_Start_Power_SupervisorQualifiedCommandFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedCommandFactsT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedCommandFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedCommandFacts)
      }
      val command = readProtected_Start_Power_SupervisorCommandType()
      val selfTestResetRequested = reader.readB()
      return Protected_Start_Power_Supervisor.QualifiedCommandFacts(command, selfTestResetRequested)
    }

    def readProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(): Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorQualifiedCommandFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedCommandFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedCommandFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      return Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorQualifiedPedalFacts(): Protected_Start_Power_Supervisor.QualifiedPedalFacts = {
      val r = readProtected_Start_Power_SupervisorQualifiedPedalFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedPedalFactsT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedPedalFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedPedalFacts)
      }
      val pedalStartCondition = reader.readB()
      return Protected_Start_Power_Supervisor.QualifiedPedalFacts(pedalStartCondition)
    }

    def readProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(): Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorQualifiedPedalFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedPedalFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedPedalFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorQualifiedPedalFacts()
      return Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorQualifiedSupplyFacts(): Protected_Start_Power_Supervisor.QualifiedSupplyFacts = {
      val r = readProtected_Start_Power_SupervisorQualifiedSupplyFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedSupplyFactsT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedSupplyFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedSupplyFacts)
      }
      val supplyUsable = reader.readB()
      return Protected_Start_Power_Supervisor.QualifiedSupplyFacts(supplyUsable)
    }

    def readProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(): Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorQualifiedSupplyFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedSupplyFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedSupplyFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      return Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts = {
      val r = readProtected_Start_Power_SupervisorQualifiedParkingBrakeFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedParkingBrakeFactsT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts)
      }
      val brakeAppliedEvidence = reader.readB()
      return Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts(brakeAppliedEvidence)
    }

    def readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      return Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorStartRestraintFact(): Protected_Start_Power_Supervisor.StartRestraintFact = {
      val r = readProtected_Start_Power_SupervisorStartRestraintFactT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorStartRestraintFactT(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintFact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorStartRestraintFact)
      }
      val startRestraintSatisfied = reader.readB()
      return Protected_Start_Power_Supervisor.StartRestraintFact(startRestraintSatisfied)
    }

    def readProtected_Start_Power_SupervisorStartRestraintFact_Payload(): Protected_Start_Power_Supervisor.StartRestraintFact_Payload = {
      val r = readProtected_Start_Power_SupervisorStartRestraintFact_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorStartRestraintFact_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintFact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorStartRestraintFact_Payload)
      }
      val value = readProtected_Start_Power_SupervisorStartRestraintFact()
      return Protected_Start_Power_Supervisor.StartRestraintFact_Payload(value)
    }

    def readProtected_Start_Power_SupervisorReadinessFacts(): Protected_Start_Power_Supervisor.ReadinessFacts = {
      val r = readProtected_Start_Power_SupervisorReadinessFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorReadinessFactsT(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorReadinessFacts)
      }
      val startReady = reader.readB()
      val sustainReady = reader.readB()
      return Protected_Start_Power_Supervisor.ReadinessFacts(startReady, sustainReady)
    }

    def readProtected_Start_Power_SupervisorReadinessFacts_Payload(): Protected_Start_Power_Supervisor.ReadinessFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorReadinessFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorReadinessFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorReadinessFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorReadinessFacts()
      return Protected_Start_Power_Supervisor.ReadinessFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorExactFaultSummary(): Protected_Start_Power_Supervisor.ExactFaultSummary = {
      val r = readProtected_Start_Power_SupervisorExactFaultSummaryT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorExactFaultSummaryT(typeParsed: B): Protected_Start_Power_Supervisor.ExactFaultSummary = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorExactFaultSummary)
      }
      val commandFault = reader.readB()
      val pedalFault = reader.readB()
      val thermalFault = reader.readB()
      val supplyFault = reader.readB()
      val parkingBrakeFault = reader.readB()
      val selfTestFault = reader.readB()
      val anyFault = reader.readB()
      return Protected_Start_Power_Supervisor.ExactFaultSummary(commandFault, pedalFault, thermalFault, supplyFault, parkingBrakeFault, selfTestFault, anyFault)
    }

    def readProtected_Start_Power_SupervisorExactFaultSummary_Payload(): Protected_Start_Power_Supervisor.ExactFaultSummary_Payload = {
      val r = readProtected_Start_Power_SupervisorExactFaultSummary_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorExactFaultSummary_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ExactFaultSummary_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorExactFaultSummary_Payload)
      }
      val value = readProtected_Start_Power_SupervisorExactFaultSummary()
      return Protected_Start_Power_Supervisor.ExactFaultSummary_Payload(value)
    }

    def readProtected_Start_Power_SupervisorRecoveryPermitFact(): Protected_Start_Power_Supervisor.RecoveryPermitFact = {
      val r = readProtected_Start_Power_SupervisorRecoveryPermitFactT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRecoveryPermitFactT(typeParsed: B): Protected_Start_Power_Supervisor.RecoveryPermitFact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRecoveryPermitFact)
      }
      val recoveryPermit = reader.readB()
      return Protected_Start_Power_Supervisor.RecoveryPermitFact(recoveryPermit)
    }

    def readProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(): Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload = {
      val r = readProtected_Start_Power_SupervisorRecoveryPermitFact_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRecoveryPermitFact_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRecoveryPermitFact_Payload)
      }
      val value = readProtected_Start_Power_SupervisorRecoveryPermitFact()
      return Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload(value)
    }

    def readProtected_Start_Power_SupervisorBrakePedalReport(): Protected_Start_Power_Supervisor.BrakePedalReport = {
      val r = readProtected_Start_Power_SupervisorBrakePedalReportT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorBrakePedalReportT(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorBrakePedalReport)
      }
      val condition = readProtected_Start_Power_SupervisorPedalConditionType()
      val status = readProtected_Start_Power_SupervisorValidityType()
      return Protected_Start_Power_Supervisor.BrakePedalReport(condition, status)
    }

    def readProtected_Start_Power_SupervisorBrakePedalReport_Payload(): Protected_Start_Power_Supervisor.BrakePedalReport_Payload = {
      val r = readProtected_Start_Power_SupervisorBrakePedalReport_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorBrakePedalReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorBrakePedalReport_Payload)
      }
      val value = readProtected_Start_Power_SupervisorBrakePedalReport()
      return Protected_Start_Power_Supervisor.BrakePedalReport_Payload(value)
    }

    def readProtected_Start_Power_SupervisorTemperatureReport(): Protected_Start_Power_Supervisor.TemperatureReport = {
      val r = readProtected_Start_Power_SupervisorTemperatureReportT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorTemperatureReportT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorTemperatureReport)
      }
      val band = readProtected_Start_Power_SupervisorTemperatureBandType()
      val status = readProtected_Start_Power_SupervisorValidityType()
      return Protected_Start_Power_Supervisor.TemperatureReport(band, status)
    }

    def readProtected_Start_Power_SupervisorTemperatureReport_Payload(): Protected_Start_Power_Supervisor.TemperatureReport_Payload = {
      val r = readProtected_Start_Power_SupervisorTemperatureReport_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorTemperatureReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorTemperatureReport_Payload)
      }
      val value = readProtected_Start_Power_SupervisorTemperatureReport()
      return Protected_Start_Power_Supervisor.TemperatureReport_Payload(value)
    }

    def readProtected_Start_Power_SupervisorElectricalPowerReport(): Protected_Start_Power_Supervisor.ElectricalPowerReport = {
      val r = readProtected_Start_Power_SupervisorElectricalPowerReportT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorElectricalPowerReportT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalPowerReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorElectricalPowerReport)
      }
      val availability = readProtected_Start_Power_SupervisorSupplyAvailabilityType()
      val status = readProtected_Start_Power_SupervisorValidityType()
      return Protected_Start_Power_Supervisor.ElectricalPowerReport(availability, status)
    }

    def readProtected_Start_Power_SupervisorElectricalPowerReport_Payload(): Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload = {
      val r = readProtected_Start_Power_SupervisorElectricalPowerReport_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorElectricalPowerReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorElectricalPowerReport_Payload)
      }
      val value = readProtected_Start_Power_SupervisorElectricalPowerReport()
      return Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload(value)
    }

    def readProtected_Start_Power_SupervisorParkingBrakeReport(): Protected_Start_Power_Supervisor.ParkingBrakeReport = {
      val r = readProtected_Start_Power_SupervisorParkingBrakeReportT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorParkingBrakeReportT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorParkingBrakeReport)
      }
      val condition = readProtected_Start_Power_SupervisorParkingBrakeConditionType()
      val status = readProtected_Start_Power_SupervisorValidityType()
      return Protected_Start_Power_Supervisor.ParkingBrakeReport(condition, status)
    }

    def readProtected_Start_Power_SupervisorParkingBrakeReport_Payload(): Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload = {
      val r = readProtected_Start_Power_SupervisorParkingBrakeReport_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorParkingBrakeReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorParkingBrakeReport_Payload)
      }
      val value = readProtected_Start_Power_SupervisorParkingBrakeReport()
      return Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload(value)
    }

    def readProtected_Start_Power_SupervisorThermalStateFacts(): Protected_Start_Power_Supervisor.ThermalStateFacts = {
      val r = readProtected_Start_Power_SupervisorThermalStateFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorThermalStateFactsT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalStateFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorThermalStateFacts)
      }
      val thermalState = readProtected_Start_Power_SupervisorThermalStateType()
      val thermalClear = reader.readB()
      return Protected_Start_Power_Supervisor.ThermalStateFacts(thermalState, thermalClear)
    }

    def readProtected_Start_Power_SupervisorThermalStateFacts_Payload(): Protected_Start_Power_Supervisor.ThermalStateFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorThermalStateFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorThermalStateFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalStateFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorThermalStateFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorThermalStateFacts()
      return Protected_Start_Power_Supervisor.ThermalStateFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSelfTestReport(): Protected_Start_Power_Supervisor.SelfTestReport = {
      val r = readProtected_Start_Power_SupervisorSelfTestReportT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestReportT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestReport = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestReport)
      }
      val progress = readProtected_Start_Power_SupervisorSelfTestProgressType()
      val status = readProtected_Start_Power_SupervisorValidityType()
      return Protected_Start_Power_Supervisor.SelfTestReport(progress, status)
    }

    def readProtected_Start_Power_SupervisorSelfTestReport_Payload(): Protected_Start_Power_Supervisor.SelfTestReport_Payload = {
      val r = readProtected_Start_Power_SupervisorSelfTestReport_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestReport_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestReport_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSelfTestReport()
      return Protected_Start_Power_Supervisor.SelfTestReport_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSelfTestStateFacts(): Protected_Start_Power_Supervisor.SelfTestStateFacts = {
      val r = readProtected_Start_Power_SupervisorSelfTestStateFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestStateFactsT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestStateFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestStateFacts)
      }
      val selfTestState = readProtected_Start_Power_SupervisorSelfTestStateType()
      val selfTestPassed = reader.readB()
      return Protected_Start_Power_Supervisor.SelfTestStateFacts(selfTestState, selfTestPassed)
    }

    def readProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(): Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorSelfTestStateFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestStateFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestStateFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSelfTestStateFacts()
      return Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSessionDecisionFacts(): Protected_Start_Power_Supervisor.SessionDecisionFacts = {
      val r = readProtected_Start_Power_SupervisorSessionDecisionFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSessionDecisionFactsT(typeParsed: B): Protected_Start_Power_Supervisor.SessionDecisionFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSessionDecisionFacts)
      }
      val session = readProtected_Start_Power_SupervisorSessionType()
      val cause = readProtected_Start_Power_SupervisorSessionCauseType()
      return Protected_Start_Power_Supervisor.SessionDecisionFacts(session, cause)
    }

    def readProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(): Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorSessionDecisionFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSessionDecisionFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSessionDecisionFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSessionDecisionFacts()
      return Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorRearmStateFacts(): Protected_Start_Power_Supervisor.RearmStateFacts = {
      val r = readProtected_Start_Power_SupervisorRearmStateFactsT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRearmStateFactsT(typeParsed: B): Protected_Start_Power_Supervisor.RearmStateFacts = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRearmStateFacts)
      }
      val rearmState = readProtected_Start_Power_SupervisorRearmStateType()
      return Protected_Start_Power_Supervisor.RearmStateFacts(rearmState)
    }

    def readProtected_Start_Power_SupervisorRearmStateFacts_Payload(): Protected_Start_Power_Supervisor.RearmStateFacts_Payload = {
      val r = readProtected_Start_Power_SupervisorRearmStateFacts_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRearmStateFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.RearmStateFacts_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRearmStateFacts_Payload)
      }
      val value = readProtected_Start_Power_SupervisorRearmStateFacts()
      return Protected_Start_Power_Supervisor.RearmStateFacts_Payload(value)
    }

    def readProtected_Start_Power_SupervisorActuationDisposition(): Protected_Start_Power_Supervisor.ActuationDisposition = {
      val r = readProtected_Start_Power_SupervisorActuationDispositionT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorActuationDispositionT(typeParsed: B): Protected_Start_Power_Supervisor.ActuationDisposition = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorActuationDisposition)
      }
      val fuel = readProtected_Start_Power_SupervisorFuelDispositionType()
      val electricalPower = readProtected_Start_Power_SupervisorElectricalDispositionType()
      val parkingBrake = readProtected_Start_Power_SupervisorParkingBrakeDispositionType()
      return Protected_Start_Power_Supervisor.ActuationDisposition(fuel, electricalPower, parkingBrake)
    }

    def readProtected_Start_Power_SupervisorActuationDisposition_Payload(): Protected_Start_Power_Supervisor.ActuationDisposition_Payload = {
      val r = readProtected_Start_Power_SupervisorActuationDisposition_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorActuationDisposition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ActuationDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorActuationDisposition_Payload)
      }
      val value = readProtected_Start_Power_SupervisorActuationDisposition()
      return Protected_Start_Power_Supervisor.ActuationDisposition_Payload(value)
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatus(): Protected_Start_Power_Supervisor.SupervisoryStatus = {
      val r = readProtected_Start_Power_SupervisorSupervisoryStatusT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusT(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatus = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatus)
      }
      val session = readProtected_Start_Power_SupervisorSessionType()
      val startReady = reader.readB()
      val sustainReady = reader.readB()
      val rearmState = readProtected_Start_Power_SupervisorRearmStateType()
      val notice = readProtected_Start_Power_SupervisorNoticeType()
      val commandFault = reader.readB()
      val pedalFault = reader.readB()
      val thermalFault = reader.readB()
      val supplyFault = reader.readB()
      val parkingBrakeFault = reader.readB()
      val selfTestFault = reader.readB()
      val anyFault = reader.readB()
      return Protected_Start_Power_Supervisor.SupervisoryStatus(session, startReady, sustainReady, rearmState, notice, commandFault, pedalFault, thermalFault, supplyFault, parkingBrakeFault, selfTestFault, anyFault)
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatus_Payload(): Protected_Start_Power_Supervisor.SupervisoryStatus_Payload = {
      val r = readProtected_Start_Power_SupervisorSupervisoryStatus_PayloadT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatus_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatus_Payload)
      }
      val value = readProtected_Start_Power_SupervisorSupervisoryStatus()
      return Protected_Start_Power_Supervisor.SupervisoryStatus_Payload(value)
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

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P)
      }
      val api_command_report = readProtected_Start_Power_SupervisorCommandReport()
      return Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(api_command_report)
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS)
      }
      val api_command_report = readProtected_Start_Power_SupervisorCommandReport()
      return Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(api_command_report)
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P)
      }
      val api_command_fault = reader.readB()
      val api_qualified_command_facts = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      return Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(api_command_fault, api_qualified_command_facts)
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS)
      }
      val api_command_fault = reader.readB()
      val api_qualified_command_facts = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      return Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(api_command_fault, api_qualified_command_facts)
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P)
      }
      val api_brake_pedal_report = readProtected_Start_Power_SupervisorBrakePedalReport()
      return Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(api_brake_pedal_report)
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS)
      }
      val api_brake_pedal_report = readProtected_Start_Power_SupervisorBrakePedalReport()
      return Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(api_brake_pedal_report)
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P)
      }
      val api_pedal_fault = reader.readB()
      val api_qualified_pedal_facts = readProtected_Start_Power_SupervisorQualifiedPedalFacts()
      return Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(api_pedal_fault, api_qualified_pedal_facts)
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS)
      }
      val api_pedal_fault = reader.readB()
      val api_qualified_pedal_facts = readProtected_Start_Power_SupervisorQualifiedPedalFacts()
      return Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(api_pedal_fault, api_qualified_pedal_facts)
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P)
      }
      val api_temperature_report = readProtected_Start_Power_SupervisorTemperatureReport()
      return Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(api_temperature_report)
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS)
      }
      val api_temperature_report = readProtected_Start_Power_SupervisorTemperatureReport()
      return Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(api_temperature_report)
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P)
      }
      val api_qualified_temperature = readProtected_Start_Power_SupervisorQualifiedTemperatureType()
      return Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(api_qualified_temperature)
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS)
      }
      val api_qualified_temperature = readProtected_Start_Power_SupervisorQualifiedTemperatureType()
      return Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(api_qualified_temperature)
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P)
      }
      val api_electrical_power_report = readProtected_Start_Power_SupervisorElectricalPowerReport()
      return Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(api_electrical_power_report)
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS)
      }
      val api_electrical_power_report = readProtected_Start_Power_SupervisorElectricalPowerReport()
      return Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(api_electrical_power_report)
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P)
      }
      val api_qualified_supply_facts = readProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      val api_supply_fault = reader.readB()
      return Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(api_qualified_supply_facts, api_supply_fault)
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS)
      }
      val api_qualified_supply_facts = readProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      val api_supply_fault = reader.readB()
      return Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(api_qualified_supply_facts, api_supply_fault)
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P)
      }
      val api_parking_brake_report = readProtected_Start_Power_SupervisorParkingBrakeReport()
      return Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(api_parking_brake_report)
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS)
      }
      val api_parking_brake_report = readProtected_Start_Power_SupervisorParkingBrakeReport()
      return Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(api_parking_brake_report)
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P)
      }
      val api_parking_brake_fault = reader.readB()
      val api_qualified_parking_brake_facts = readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      return Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(api_parking_brake_fault, api_qualified_parking_brake_facts)
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS)
      }
      val api_parking_brake_fault = reader.readB()
      val api_qualified_parking_brake_facts = readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      return Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(api_parking_brake_fault, api_qualified_parking_brake_facts)
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P)
      }
      val api_qualified_temperature = readProtected_Start_Power_SupervisorQualifiedTemperatureType()
      return Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(api_qualified_temperature)
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS)
      }
      val In_thermalMemory = readProtected_Start_Power_SupervisorThermalStateType()
      val api_qualified_temperature = readProtected_Start_Power_SupervisorQualifiedTemperatureType()
      return Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(In_thermalMemory, api_qualified_temperature)
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P)
      }
      val api_thermal_fault = reader.readB()
      val api_thermal_state_facts = readProtected_Start_Power_SupervisorThermalStateFacts()
      return Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(api_thermal_fault, api_thermal_state_facts)
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS)
      }
      val thermalMemory = readProtected_Start_Power_SupervisorThermalStateType()
      val api_thermal_fault = reader.readB()
      val api_thermal_state_facts = readProtected_Start_Power_SupervisorThermalStateFacts()
      return Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(thermalMemory, api_thermal_fault, api_thermal_state_facts)
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P)
      }
      val api_qualified_command_facts = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      val api_self_test_report = readProtected_Start_Power_SupervisorSelfTestReport()
      return Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(api_qualified_command_facts, api_self_test_report)
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS)
      }
      val In_selfTestMemory = readProtected_Start_Power_SupervisorSelfTestStateType()
      val api_qualified_command_facts = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      val api_self_test_report = readProtected_Start_Power_SupervisorSelfTestReport()
      return Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(In_selfTestMemory, api_qualified_command_facts, api_self_test_report)
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P)
      }
      val api_self_test_fault = reader.readB()
      val api_self_test_state_facts = readProtected_Start_Power_SupervisorSelfTestStateFacts()
      return Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(api_self_test_fault, api_self_test_state_facts)
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS)
      }
      val selfTestMemory = readProtected_Start_Power_SupervisorSelfTestStateType()
      val api_self_test_fault = reader.readB()
      val api_self_test_state_facts = readProtected_Start_Power_SupervisorSelfTestStateFacts()
      return Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(selfTestMemory, api_self_test_fault, api_self_test_state_facts)
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P)
      }
      val api_qualified_parking_brake_facts = readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      val api_qualified_pedal_facts = readProtected_Start_Power_SupervisorQualifiedPedalFacts()
      return Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(api_qualified_parking_brake_facts, api_qualified_pedal_facts)
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS)
      }
      val api_qualified_parking_brake_facts = readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      val api_qualified_pedal_facts = readProtected_Start_Power_SupervisorQualifiedPedalFacts()
      return Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(api_qualified_parking_brake_facts, api_qualified_pedal_facts)
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P)
      }
      val api_start_restraint_fact = readProtected_Start_Power_SupervisorStartRestraintFact()
      return Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(api_start_restraint_fact)
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS)
      }
      val api_start_restraint_fact = readProtected_Start_Power_SupervisorStartRestraintFact()
      return Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(api_start_restraint_fact)
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P)
      }
      val api_qualified_supply_facts = readProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      val api_self_test_state_facts = readProtected_Start_Power_SupervisorSelfTestStateFacts()
      val api_start_restraint_fact = readProtected_Start_Power_SupervisorStartRestraintFact()
      val api_thermal_state_facts = readProtected_Start_Power_SupervisorThermalStateFacts()
      return Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(api_qualified_supply_facts, api_self_test_state_facts, api_start_restraint_fact, api_thermal_state_facts)
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS)
      }
      val api_qualified_supply_facts = readProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      val api_self_test_state_facts = readProtected_Start_Power_SupervisorSelfTestStateFacts()
      val api_start_restraint_fact = readProtected_Start_Power_SupervisorStartRestraintFact()
      val api_thermal_state_facts = readProtected_Start_Power_SupervisorThermalStateFacts()
      return Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(api_qualified_supply_facts, api_self_test_state_facts, api_start_restraint_fact, api_thermal_state_facts)
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P)
      }
      val api_readiness_facts = readProtected_Start_Power_SupervisorReadinessFacts()
      return Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(api_readiness_facts)
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS)
      }
      val api_readiness_facts = readProtected_Start_Power_SupervisorReadinessFacts()
      return Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(api_readiness_facts)
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      val api_qualified_command_facts = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      val api_readiness_facts = readProtected_Start_Power_SupervisorReadinessFacts()
      val api_recovery_permit_fact = readProtected_Start_Power_SupervisorRecoveryPermitFact()
      return Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(api_exact_fault_summary, api_qualified_command_facts, api_readiness_facts, api_recovery_permit_fact)
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      val api_qualified_command_facts = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      val api_readiness_facts = readProtected_Start_Power_SupervisorReadinessFacts()
      val api_recovery_permit_fact = readProtected_Start_Power_SupervisorRecoveryPermitFact()
      return Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(api_exact_fault_summary, api_qualified_command_facts, api_readiness_facts, api_recovery_permit_fact)
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P)
      }
      val api_session_decision_facts = readProtected_Start_Power_SupervisorSessionDecisionFacts()
      return Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(api_session_decision_facts)
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS)
      }
      val api_session_decision_facts = readProtected_Start_Power_SupervisorSessionDecisionFacts()
      return Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(api_session_decision_facts)
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P)
      }
      val api_command_fault = reader.readB()
      val api_parking_brake_fault = reader.readB()
      val api_pedal_fault = reader.readB()
      val api_self_test_fault = reader.readB()
      val api_supply_fault = reader.readB()
      val api_thermal_fault = reader.readB()
      return Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(api_command_fault, api_parking_brake_fault, api_pedal_fault, api_self_test_fault, api_supply_fault, api_thermal_fault)
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS)
      }
      val api_command_fault = reader.readB()
      val api_parking_brake_fault = reader.readB()
      val api_pedal_fault = reader.readB()
      val api_self_test_fault = reader.readB()
      val api_supply_fault = reader.readB()
      val api_thermal_fault = reader.readB()
      return Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(api_command_fault, api_parking_brake_fault, api_pedal_fault, api_self_test_fault, api_supply_fault, api_thermal_fault)
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      return Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(api_exact_fault_summary)
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      return Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(api_exact_fault_summary)
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      val api_qualified_command_facts = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      val api_readiness_facts = readProtected_Start_Power_SupervisorReadinessFacts()
      return Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(api_exact_fault_summary, api_qualified_command_facts, api_readiness_facts)
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS)
      }
      val In_rearmMemory = readProtected_Start_Power_SupervisorRearmStateType()
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      val api_qualified_command_facts = readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      val api_readiness_facts = readProtected_Start_Power_SupervisorReadinessFacts()
      return Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(In_rearmMemory, api_exact_fault_summary, api_qualified_command_facts, api_readiness_facts)
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P)
      }
      val api_rearm_state_facts = readProtected_Start_Power_SupervisorRearmStateFacts()
      val api_recovery_permit_fact = readProtected_Start_Power_SupervisorRecoveryPermitFact()
      return Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(api_rearm_state_facts, api_recovery_permit_fact)
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS)
      }
      val rearmMemory = readProtected_Start_Power_SupervisorRearmStateType()
      val api_rearm_state_facts = readProtected_Start_Power_SupervisorRearmStateFacts()
      val api_recovery_permit_fact = readProtected_Start_Power_SupervisorRecoveryPermitFact()
      return Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(rearmMemory, api_rearm_state_facts, api_recovery_permit_fact)
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      val api_session_decision_facts = readProtected_Start_Power_SupervisorSessionDecisionFacts()
      return Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(api_exact_fault_summary, api_session_decision_facts)
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      val api_session_decision_facts = readProtected_Start_Power_SupervisorSessionDecisionFacts()
      return Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(api_exact_fault_summary, api_session_decision_facts)
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P)
      }
      val api_actuation_disposition = readProtected_Start_Power_SupervisorActuationDisposition()
      return Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(api_actuation_disposition)
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS)
      }
      val api_actuation_disposition = readProtected_Start_Power_SupervisorActuationDisposition()
      return Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(api_actuation_disposition)
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container.")
          val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P = {
      val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      val api_readiness_facts = readProtected_Start_Power_SupervisorReadinessFacts()
      val api_rearm_state_facts = readProtected_Start_Power_SupervisorRearmStateFacts()
      val api_session_decision_facts = readProtected_Start_Power_SupervisorSessionDecisionFacts()
      return Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(api_exact_fault_summary, api_readiness_facts, api_rearm_state_facts, api_session_decision_facts)
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS)
      }
      val api_exact_fault_summary = readProtected_Start_Power_SupervisorExactFaultSummary()
      val api_readiness_facts = readProtected_Start_Power_SupervisorReadinessFacts()
      val api_rearm_state_facts = readProtected_Start_Power_SupervisorRearmStateFacts()
      val api_session_decision_facts = readProtected_Start_Power_SupervisorSessionDecisionFacts()
      return Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(api_exact_fault_summary, api_readiness_facts, api_rearm_state_facts, api_session_decision_facts)
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container.")
          val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(T)
          return r
      }
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P = {
      val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P)
      }
      val api_supervisory_status = readProtected_Start_Power_SupervisorSupervisoryStatus()
      return Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(api_supervisory_status)
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS = {
      val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(F)
      return r
    }

    def readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS)
      }
      val api_supervisory_status = readProtected_Start_Power_SupervisorSupervisoryStatus()
      return Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(api_supervisory_status)
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
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T)
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
        case Constants.Protected_Start_Power_SupervisorNotice_Payload => val r = readProtected_Start_Power_SupervisorNotice_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSession_Payload => val r = readProtected_Start_Power_SupervisorSession_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommand_Payload => val r = readProtected_Start_Power_SupervisorCommand_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorValidity_Payload => val r = readProtected_Start_Power_SupervisorValidity_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmState_Payload => val r = readProtected_Start_Power_SupervisorRearmState_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalState_Payload => val r = readProtected_Start_Power_SupervisorThermalState_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSessionCause_Payload => val r = readProtected_Start_Power_SupervisorSessionCause_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestState_Payload => val r = readProtected_Start_Power_SupervisorSelfTestState_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandReport_Payload => val r = readProtected_Start_Power_SupervisorCommandReport_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorPedalCondition_Payload => val r = readProtected_Start_Power_SupervisorPedalCondition_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessFacts_Payload => val r = readProtected_Start_Power_SupervisorReadinessFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestReport_Payload => val r = readProtected_Start_Power_SupervisorSelfTestReport_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorFuelDisposition_Payload => val r = readProtected_Start_Power_SupervisorFuelDisposition_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureBand_Payload => val r = readProtected_Start_Power_SupervisorTemperatureBand_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmStateFacts_Payload => val r = readProtected_Start_Power_SupervisorRearmStateFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestProgress_Payload => val r = readProtected_Start_Power_SupervisorSelfTestProgress_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalReport_Payload => val r = readProtected_Start_Power_SupervisorBrakePedalReport_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalStateFacts_Payload => val r = readProtected_Start_Power_SupervisorThermalStateFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureReport_Payload => val r = readProtected_Start_Power_SupervisorTemperatureReport_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorExactFaultSummary_Payload => val r = readProtected_Start_Power_SupervisorExactFaultSummary_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatus_Payload => val r = readProtected_Start_Power_SupervisorSupervisoryStatus_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupplyAvailability_Payload => val r = readProtected_Start_Power_SupervisorSupplyAvailability_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorRecoveryPermitFact_Payload => val r = readProtected_Start_Power_SupervisorRecoveryPermitFact_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintFact_Payload => val r = readProtected_Start_Power_SupervisorStartRestraintFact_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestStateFacts_Payload => val r = readProtected_Start_Power_SupervisorSelfTestStateFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeReport_Payload => val r = readProtected_Start_Power_SupervisorParkingBrakeReport_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorQualifiedPedalFacts_Payload => val r = readProtected_Start_Power_SupervisorQualifiedPedalFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorQualifiedTemperature_Payload => val r = readProtected_Start_Power_SupervisorQualifiedTemperature_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorQualifiedSupplyFacts_Payload => val r = readProtected_Start_Power_SupervisorQualifiedSupplyFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorSessionDecisionFacts_Payload => val r = readProtected_Start_Power_SupervisorSessionDecisionFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationDisposition_Payload => val r = readProtected_Start_Power_SupervisorActuationDisposition_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalDisposition_Payload => val r = readProtected_Start_Power_SupervisorElectricalDisposition_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeCondition_Payload => val r = readProtected_Start_Power_SupervisorParkingBrakeCondition_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorQualifiedCommandFacts_Payload => val r = readProtected_Start_Power_SupervisorQualifiedCommandFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalPowerReport_Payload => val r = readProtected_Start_Power_SupervisorElectricalPowerReport_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeDisposition_Payload => val r = readProtected_Start_Power_SupervisorParkingBrakeDisposition_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload => val r = readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_PayloadT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(T); return r
        case Constants.Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T)
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

  def fromProtected_Start_Power_SupervisorCommand_Payload(o: Protected_Start_Power_Supervisor.Command_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommand_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommand_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.Command_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommand_Payload(reader: Reader): Protected_Start_Power_Supervisor.Command_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorCommand_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommand_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorValidity_Payload(o: Protected_Start_Power_Supervisor.Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorValidity_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorValidity_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.Validity_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorValidity_Payload(reader: Reader): Protected_Start_Power_Supervisor.Validity_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorValidity_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorValidity_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorPedalCondition_Payload(o: Protected_Start_Power_Supervisor.PedalCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorPedalCondition_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorPedalCondition_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.PedalCondition_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorPedalCondition_Payload(reader: Reader): Protected_Start_Power_Supervisor.PedalCondition_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorPedalCondition_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorPedalCondition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureBand_Payload(o: Protected_Start_Power_Supervisor.TemperatureBand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureBand_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureBand_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureBand_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureBand_Payload(reader: Reader): Protected_Start_Power_Supervisor.TemperatureBand_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureBand_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureBand_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedTemperature_Payload(o: Protected_Start_Power_Supervisor.QualifiedTemperature_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedTemperature_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedTemperature_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedTemperature_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedTemperature_Payload(reader: Reader): Protected_Start_Power_Supervisor.QualifiedTemperature_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedTemperature_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedTemperature_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupplyAvailability_Payload(o: Protected_Start_Power_Supervisor.SupplyAvailability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupplyAvailability_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupplyAvailability_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupplyAvailability_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupplyAvailability_Payload(reader: Reader): Protected_Start_Power_Supervisor.SupplyAvailability_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSupplyAvailability_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupplyAvailability_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeCondition_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeCondition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalState_Payload(o: Protected_Start_Power_Supervisor.ThermalState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalState_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalState_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalState_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalState_Payload(reader: Reader): Protected_Start_Power_Supervisor.ThermalState_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorThermalState_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalState_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestProgress_Payload(o: Protected_Start_Power_Supervisor.SelfTestProgress_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestProgress_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestProgress_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestProgress_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestProgress_Payload(reader: Reader): Protected_Start_Power_Supervisor.SelfTestProgress_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestProgress_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestProgress_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestState_Payload(o: Protected_Start_Power_Supervisor.SelfTestState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestState_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestState_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestState_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestState_Payload(reader: Reader): Protected_Start_Power_Supervisor.SelfTestState_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestState_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestState_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSession_Payload(o: Protected_Start_Power_Supervisor.Session_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSession_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSession_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.Session_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSession_Payload(reader: Reader): Protected_Start_Power_Supervisor.Session_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSession_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSession_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSessionCause_Payload(o: Protected_Start_Power_Supervisor.SessionCause_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSessionCause_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSessionCause_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SessionCause_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSessionCause_Payload(reader: Reader): Protected_Start_Power_Supervisor.SessionCause_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSessionCause_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSessionCause_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmState_Payload(o: Protected_Start_Power_Supervisor.RearmState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmState_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmState_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmState_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmState_Payload(reader: Reader): Protected_Start_Power_Supervisor.RearmState_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorRearmState_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmState_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFuelDisposition_Payload(o: Protected_Start_Power_Supervisor.FuelDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorFuelDisposition_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorFuelDisposition_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.FuelDisposition_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFuelDisposition_Payload(reader: Reader): Protected_Start_Power_Supervisor.FuelDisposition_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorFuelDisposition_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorFuelDisposition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalDisposition_Payload(o: Protected_Start_Power_Supervisor.ElectricalDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalDisposition_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalDisposition_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalDisposition_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalDisposition_Payload(reader: Reader): Protected_Start_Power_Supervisor.ElectricalDisposition_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalDisposition_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalDisposition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorNotice_Payload(o: Protected_Start_Power_Supervisor.Notice_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorNotice_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorNotice_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.Notice_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorNotice_Payload(reader: Reader): Protected_Start_Power_Supervisor.Notice_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorNotice_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorNotice_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandReport(o: Protected_Start_Power_Supervisor.CommandReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommandReport(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommandReport(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.CommandReport, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandReport(reader: Reader): Protected_Start_Power_Supervisor.CommandReport = {
      val r = reader.readProtected_Start_Power_SupervisorCommandReport()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommandReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandReport_Payload(o: Protected_Start_Power_Supervisor.CommandReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommandReport_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommandReport_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.CommandReport_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandReport_Payload(reader: Reader): Protected_Start_Power_Supervisor.CommandReport_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorCommandReport_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommandReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedCommandFacts(o: Protected_Start_Power_Supervisor.QualifiedCommandFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedCommandFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedCommandFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedCommandFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedCommandFacts(reader: Reader): Protected_Start_Power_Supervisor.QualifiedCommandFacts = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedCommandFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedCommandFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedPedalFacts(o: Protected_Start_Power_Supervisor.QualifiedPedalFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedPedalFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedPedalFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedPedalFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedPedalFacts(reader: Reader): Protected_Start_Power_Supervisor.QualifiedPedalFacts = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedPedalFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedPedalFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedSupplyFacts(o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedSupplyFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedSupplyFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedSupplyFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedSupplyFacts(reader: Reader): Protected_Start_Power_Supervisor.QualifiedSupplyFacts = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedSupplyFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(reader: Reader): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintFact(o: Protected_Start_Power_Supervisor.StartRestraintFact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorStartRestraintFact(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorStartRestraintFact(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.StartRestraintFact, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintFact(reader: Reader): Protected_Start_Power_Supervisor.StartRestraintFact = {
      val r = reader.readProtected_Start_Power_SupervisorStartRestraintFact()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorStartRestraintFact _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintFact_Payload(o: Protected_Start_Power_Supervisor.StartRestraintFact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorStartRestraintFact_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorStartRestraintFact_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.StartRestraintFact_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintFact_Payload(reader: Reader): Protected_Start_Power_Supervisor.StartRestraintFact_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorStartRestraintFact_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorStartRestraintFact_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessFacts(o: Protected_Start_Power_Supervisor.ReadinessFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorReadinessFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorReadinessFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ReadinessFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessFacts(reader: Reader): Protected_Start_Power_Supervisor.ReadinessFacts = {
      val r = reader.readProtected_Start_Power_SupervisorReadinessFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorReadinessFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessFacts_Payload(o: Protected_Start_Power_Supervisor.ReadinessFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorReadinessFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorReadinessFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ReadinessFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.ReadinessFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorReadinessFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorReadinessFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorExactFaultSummary(o: Protected_Start_Power_Supervisor.ExactFaultSummary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorExactFaultSummary(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorExactFaultSummary(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ExactFaultSummary, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorExactFaultSummary(reader: Reader): Protected_Start_Power_Supervisor.ExactFaultSummary = {
      val r = reader.readProtected_Start_Power_SupervisorExactFaultSummary()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorExactFaultSummary _)
    return r
  }

  def fromProtected_Start_Power_SupervisorExactFaultSummary_Payload(o: Protected_Start_Power_Supervisor.ExactFaultSummary_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorExactFaultSummary_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorExactFaultSummary_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ExactFaultSummary_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorExactFaultSummary_Payload(reader: Reader): Protected_Start_Power_Supervisor.ExactFaultSummary_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorExactFaultSummary_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorExactFaultSummary_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRecoveryPermitFact(o: Protected_Start_Power_Supervisor.RecoveryPermitFact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRecoveryPermitFact(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRecoveryPermitFact(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RecoveryPermitFact, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRecoveryPermitFact(reader: Reader): Protected_Start_Power_Supervisor.RecoveryPermitFact = {
      val r = reader.readProtected_Start_Power_SupervisorRecoveryPermitFact()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRecoveryPermitFact _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(o: Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(reader: Reader): Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorRecoveryPermitFact_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRecoveryPermitFact_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalReport(o: Protected_Start_Power_Supervisor.BrakePedalReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorBrakePedalReport(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorBrakePedalReport(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.BrakePedalReport, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalReport(reader: Reader): Protected_Start_Power_Supervisor.BrakePedalReport = {
      val r = reader.readProtected_Start_Power_SupervisorBrakePedalReport()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorBrakePedalReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalReport_Payload(o: Protected_Start_Power_Supervisor.BrakePedalReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorBrakePedalReport_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorBrakePedalReport_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.BrakePedalReport_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalReport_Payload(reader: Reader): Protected_Start_Power_Supervisor.BrakePedalReport_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorBrakePedalReport_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorBrakePedalReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureReport(o: Protected_Start_Power_Supervisor.TemperatureReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureReport(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureReport(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureReport, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureReport(reader: Reader): Protected_Start_Power_Supervisor.TemperatureReport = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureReport()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureReport_Payload(o: Protected_Start_Power_Supervisor.TemperatureReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureReport_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureReport_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureReport_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureReport_Payload(reader: Reader): Protected_Start_Power_Supervisor.TemperatureReport_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureReport_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalPowerReport(o: Protected_Start_Power_Supervisor.ElectricalPowerReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalPowerReport(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalPowerReport(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalPowerReport, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalPowerReport(reader: Reader): Protected_Start_Power_Supervisor.ElectricalPowerReport = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalPowerReport()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalPowerReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalPowerReport_Payload(o: Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalPowerReport_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalPowerReport_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalPowerReport_Payload(reader: Reader): Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalPowerReport_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalPowerReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeReport(o: Protected_Start_Power_Supervisor.ParkingBrakeReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeReport(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeReport(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeReport, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeReport(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeReport = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeReport()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeReport_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeReport_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeReport_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeReport_Payload(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeReport_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalStateFacts(o: Protected_Start_Power_Supervisor.ThermalStateFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalStateFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalStateFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalStateFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalStateFacts(reader: Reader): Protected_Start_Power_Supervisor.ThermalStateFacts = {
      val r = reader.readProtected_Start_Power_SupervisorThermalStateFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalStateFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalStateFacts_Payload(o: Protected_Start_Power_Supervisor.ThermalStateFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalStateFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalStateFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalStateFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalStateFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.ThermalStateFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorThermalStateFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalStateFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestReport(o: Protected_Start_Power_Supervisor.SelfTestReport, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestReport(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestReport(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestReport, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestReport(reader: Reader): Protected_Start_Power_Supervisor.SelfTestReport = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestReport()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestReport_Payload(o: Protected_Start_Power_Supervisor.SelfTestReport_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestReport_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestReport_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestReport_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestReport_Payload(reader: Reader): Protected_Start_Power_Supervisor.SelfTestReport_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestReport_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestStateFacts(o: Protected_Start_Power_Supervisor.SelfTestStateFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestStateFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestStateFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestStateFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestStateFacts(reader: Reader): Protected_Start_Power_Supervisor.SelfTestStateFacts = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestStateFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestStateFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(o: Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestStateFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestStateFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSessionDecisionFacts(o: Protected_Start_Power_Supervisor.SessionDecisionFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSessionDecisionFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSessionDecisionFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SessionDecisionFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSessionDecisionFacts(reader: Reader): Protected_Start_Power_Supervisor.SessionDecisionFacts = {
      val r = reader.readProtected_Start_Power_SupervisorSessionDecisionFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSessionDecisionFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(o: Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSessionDecisionFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSessionDecisionFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmStateFacts(o: Protected_Start_Power_Supervisor.RearmStateFacts, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmStateFacts(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmStateFacts(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmStateFacts, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmStateFacts(reader: Reader): Protected_Start_Power_Supervisor.RearmStateFacts = {
      val r = reader.readProtected_Start_Power_SupervisorRearmStateFacts()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmStateFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmStateFacts_Payload(o: Protected_Start_Power_Supervisor.RearmStateFacts_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmStateFacts_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmStateFacts_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmStateFacts_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmStateFacts_Payload(reader: Reader): Protected_Start_Power_Supervisor.RearmStateFacts_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorRearmStateFacts_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmStateFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationDisposition(o: Protected_Start_Power_Supervisor.ActuationDisposition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorActuationDisposition(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorActuationDisposition(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ActuationDisposition, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationDisposition(reader: Reader): Protected_Start_Power_Supervisor.ActuationDisposition = {
      val r = reader.readProtected_Start_Power_SupervisorActuationDisposition()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorActuationDisposition _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationDisposition_Payload(o: Protected_Start_Power_Supervisor.ActuationDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorActuationDisposition_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorActuationDisposition_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ActuationDisposition_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationDisposition_Payload(reader: Reader): Protected_Start_Power_Supervisor.ActuationDisposition_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorActuationDisposition_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorActuationDisposition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatus(o: Protected_Start_Power_Supervisor.SupervisoryStatus, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupervisoryStatus(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatus(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupervisoryStatus, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatus(reader: Reader): Protected_Start_Power_Supervisor.SupervisoryStatus = {
      val r = reader.readProtected_Start_Power_SupervisorSupervisoryStatus()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupervisoryStatus _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatus_Payload(o: Protected_Start_Power_Supervisor.SupervisoryStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupervisoryStatus_Payload(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatus_Payload(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupervisoryStatus_Payload, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatus_Payload(reader: Reader): Protected_Start_Power_Supervisor.SupervisoryStatus_Payload = {
      val r = reader.readProtected_Start_Power_SupervisorSupervisoryStatus_Payload()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupervisoryStatus_Payload _)
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

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(reader: Reader): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(reader: Reader): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container = {
      val r = reader.readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(reader: Reader): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P = {
      val r = reader.readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o)
    return w.result
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(data: ISZ[U8]): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(reader: Reader): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS = {
      val r = reader.readProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS()
      return r
    }
    val r = to(data, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS _)
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