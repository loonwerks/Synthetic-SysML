// #Sireum
// @formatter:off

// This file is auto-generated from ClimateRequest.scala, ThermalRelation.scala, ComfortDemand.scala, DefrostRequest.scala, GlazingCondition.scala, VisibilityDemand.scala, ElectricalState.scala, PowerEnvelope.scala, EngineHeat.scala, EnergyCapability.scala, FreshRequest.scala, RecoveryDecision.scala, Service.scala, SelectionReason.scala, ResourceGrant.scala, FanPreference.scala, ThermalService.scala, AirPath.scala, Blower.scala, ActuationDisposition.scala, SupervisorStatus.scala, RecoveryState.scala, EnergyContext.scala, ServiceSelection.scala, PlantCommand.scala, Base_Types.scala, ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Containers.scala, VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_Containers.scala, EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Containers.scala, RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Containers.scala, ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_Containers.scala, ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Containers.scala, ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_Containers.scala, SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._

object MsgPack {

  object Constants {

    val HVAC_Energy_Interface_SupervisorClimateRequest_Payload: Z = -32

    val HVAC_Energy_Interface_SupervisorThermalRelation_Payload: Z = -31

    val HVAC_Energy_Interface_SupervisorComfortDemand_Payload: Z = -30

    val HVAC_Energy_Interface_SupervisorDefrostRequest_Payload: Z = -29

    val HVAC_Energy_Interface_SupervisorGlazingCondition_Payload: Z = -28

    val HVAC_Energy_Interface_SupervisorVisibilityDemand_Payload: Z = -27

    val HVAC_Energy_Interface_SupervisorElectricalState_Payload: Z = -26

    val HVAC_Energy_Interface_SupervisorPowerEnvelope_Payload: Z = -25

    val HVAC_Energy_Interface_SupervisorEngineHeat_Payload: Z = -24

    val HVAC_Energy_Interface_SupervisorEnergyCapability_Payload: Z = -23

    val HVAC_Energy_Interface_SupervisorFreshRequest_Payload: Z = -22

    val HVAC_Energy_Interface_SupervisorRecoveryDecision_Payload: Z = -21

    val HVAC_Energy_Interface_SupervisorService_Payload: Z = -20

    val HVAC_Energy_Interface_SupervisorSelectionReason_Payload: Z = -19

    val HVAC_Energy_Interface_SupervisorResourceGrant_Payload: Z = -18

    val HVAC_Energy_Interface_SupervisorFanPreference_Payload: Z = -17

    val HVAC_Energy_Interface_SupervisorThermalService_Payload: Z = -16

    val HVAC_Energy_Interface_SupervisorAirPath_Payload: Z = -15

    val HVAC_Energy_Interface_SupervisorBlower_Payload: Z = -14

    val HVAC_Energy_Interface_SupervisorActuationDisposition_Payload: Z = -13

    val HVAC_Energy_Interface_SupervisorSupervisorStatus_Payload: Z = -12

    val HVAC_Energy_Interface_SupervisorRecoveryState_Payload: Z = -11

    val HVAC_Energy_Interface_SupervisorEnergyContext: Z = -10

    val HVAC_Energy_Interface_SupervisorEnergyContext_Payload: Z = -9

    val HVAC_Energy_Interface_SupervisorServiceSelection: Z = -8

    val HVAC_Energy_Interface_SupervisorServiceSelection_Payload: Z = -7

    val HVAC_Energy_Interface_SupervisorPlantCommand: Z = -6

    val HVAC_Energy_Interface_SupervisorPlantCommand_Payload: Z = -5

    val Base_TypesBoolean_Payload: Z = -4

    val Base_TypesInteger_Payload: Z = -3

    val Base_TypesInteger_8_Payload: Z = -2

    val Base_TypesInteger_16_Payload: Z = -1

    val Base_TypesInteger_32_Payload: Z = 0

    val Base_TypesInteger_64_Payload: Z = 1

    val Base_TypesUnsigned_8_Payload: Z = 2

    val Base_TypesUnsigned_16_Payload: Z = 3

    val Base_TypesUnsigned_32_Payload: Z = 4

    val Base_TypesUnsigned_64_Payload: Z = 5

    val Base_TypesFloat_Payload: Z = 6

    val Base_TypesFloat_32_Payload: Z = 7

    val Base_TypesFloat_64_Payload: Z = 8

    val Base_TypesCharacter_Payload: Z = 9

    val Base_TypesString_Payload: Z = 10

    val Base_TypesBits_Payload: Z = 11

    val HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P: Z = 12

    val HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS: Z = 13

    val HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P: Z = 14

    val HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS: Z = 15

    val HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P: Z = 16

    val HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS: Z = 17

    val HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P: Z = 18

    val HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS: Z = 19

    val HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P: Z = 20

    val HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS: Z = 21

    val HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P: Z = 22

    val HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS: Z = 23

    val HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P: Z = 24

    val HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS: Z = 25

    val HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P: Z = 26

    val HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS: Z = 27

    val HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P: Z = 28

    val HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS: Z = 29

    val HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P: Z = 30

    val HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS: Z = 31

    val HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P: Z = 32

    val HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS: Z = 33

    val HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P: Z = 34

    val HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS: Z = 35

    val HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P: Z = 36

    val HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS: Z = 37

    val HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P: Z = 38

    val HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS: Z = 39

    val HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P: Z = 40

    val HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS: Z = 41

    val HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P: Z = 42

    val HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS: Z = 43

    val utilEmptyContainer: Z = 44

    val _artEmpty: Z = 45

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeHVAC_Energy_Interface_SupervisorClimateRequestType(o: HVAC_Energy_Interface_Supervisor.ClimateRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorClimateRequest_Payload(o: HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorClimateRequest_Payload)
      writeHVAC_Energy_Interface_SupervisorClimateRequestType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorThermalRelationType(o: HVAC_Energy_Interface_Supervisor.ThermalRelation.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorThermalRelation_Payload(o: HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorThermalRelation_Payload)
      writeHVAC_Energy_Interface_SupervisorThermalRelationType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorComfortDemandType(o: HVAC_Energy_Interface_Supervisor.ComfortDemand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorComfortDemand_Payload(o: HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemand_Payload)
      writeHVAC_Energy_Interface_SupervisorComfortDemandType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorDefrostRequestType(o: HVAC_Energy_Interface_Supervisor.DefrostRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(o: HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorDefrostRequest_Payload)
      writeHVAC_Energy_Interface_SupervisorDefrostRequestType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorGlazingConditionType(o: HVAC_Energy_Interface_Supervisor.GlazingCondition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(o: HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorGlazingCondition_Payload)
      writeHVAC_Energy_Interface_SupervisorGlazingConditionType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorVisibilityDemandType(o: HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(o: HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemand_Payload)
      writeHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorElectricalStateType(o: HVAC_Energy_Interface_Supervisor.ElectricalState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorElectricalState_Payload(o: HVAC_Energy_Interface_Supervisor.ElectricalState_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorElectricalState_Payload)
      writeHVAC_Energy_Interface_SupervisorElectricalStateType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorPowerEnvelopeType(o: HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(o: HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorPowerEnvelope_Payload)
      writeHVAC_Energy_Interface_SupervisorPowerEnvelopeType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorEngineHeatType(o: HVAC_Energy_Interface_Supervisor.EngineHeat.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorEngineHeat_Payload(o: HVAC_Energy_Interface_Supervisor.EngineHeat_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorEngineHeat_Payload)
      writeHVAC_Energy_Interface_SupervisorEngineHeatType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(o: HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapability_Payload)
      writeHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorFreshRequestType(o: HVAC_Energy_Interface_Supervisor.FreshRequest.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorFreshRequest_Payload(o: HVAC_Energy_Interface_Supervisor.FreshRequest_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorFreshRequest_Payload)
      writeHVAC_Energy_Interface_SupervisorFreshRequestType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(o: HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryDecision_Payload)
      writeHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorServiceType(o: HVAC_Energy_Interface_Supervisor.Service.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorService_Payload(o: HVAC_Energy_Interface_Supervisor.Service_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorService_Payload)
      writeHVAC_Energy_Interface_SupervisorServiceType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorSelectionReasonType(o: HVAC_Energy_Interface_Supervisor.SelectionReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorSelectionReason_Payload(o: HVAC_Energy_Interface_Supervisor.SelectionReason_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorSelectionReason_Payload)
      writeHVAC_Energy_Interface_SupervisorSelectionReasonType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorResourceGrantType(o: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorResourceGrant_Payload(o: HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorResourceGrant_Payload)
      writeHVAC_Energy_Interface_SupervisorResourceGrantType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorFanPreferenceType(o: HVAC_Energy_Interface_Supervisor.FanPreference.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorFanPreference_Payload(o: HVAC_Energy_Interface_Supervisor.FanPreference_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorFanPreference_Payload)
      writeHVAC_Energy_Interface_SupervisorFanPreferenceType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorThermalServiceType(o: HVAC_Energy_Interface_Supervisor.ThermalService.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorThermalService_Payload(o: HVAC_Energy_Interface_Supervisor.ThermalService_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorThermalService_Payload)
      writeHVAC_Energy_Interface_SupervisorThermalServiceType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorAirPathType(o: HVAC_Energy_Interface_Supervisor.AirPath.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorAirPath_Payload(o: HVAC_Energy_Interface_Supervisor.AirPath_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorAirPath_Payload)
      writeHVAC_Energy_Interface_SupervisorAirPathType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorBlowerType(o: HVAC_Energy_Interface_Supervisor.Blower.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorBlower_Payload(o: HVAC_Energy_Interface_Supervisor.Blower_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorBlower_Payload)
      writeHVAC_Energy_Interface_SupervisorBlowerType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorActuationDispositionType(o: HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(o: HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorActuationDisposition_Payload)
      writeHVAC_Energy_Interface_SupervisorActuationDispositionType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorSupervisorStatusType(o: HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(o: HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorSupervisorStatus_Payload)
      writeHVAC_Energy_Interface_SupervisorSupervisorStatusType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryStateType(o: HVAC_Energy_Interface_Supervisor.RecoveryState.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryState_Payload(o: HVAC_Energy_Interface_Supervisor.RecoveryState_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryState_Payload)
      writeHVAC_Energy_Interface_SupervisorRecoveryStateType(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyContext(o: HVAC_Energy_Interface_Supervisor.EnergyContext): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorEnergyContext)
      writeHVAC_Energy_Interface_SupervisorElectricalStateType(o.electricalState)
      writeHVAC_Energy_Interface_SupervisorPowerEnvelopeType(o.powerEnvelope)
      writeHVAC_Energy_Interface_SupervisorEngineHeatType(o.engineHeat)
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyContext_Payload(o: HVAC_Energy_Interface_Supervisor.EnergyContext_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorEnergyContext_Payload)
      writeHVAC_Energy_Interface_SupervisorEnergyContext(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorServiceSelection(o: HVAC_Energy_Interface_Supervisor.ServiceSelection): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorServiceSelection)
      writeHVAC_Energy_Interface_SupervisorServiceType(o.service)
      writeHVAC_Energy_Interface_SupervisorSelectionReasonType(o.reason)
    }

    def writeHVAC_Energy_Interface_SupervisorServiceSelection_Payload(o: HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorServiceSelection_Payload)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.value)
    }

    def writeHVAC_Energy_Interface_SupervisorPlantCommand(o: HVAC_Energy_Interface_Supervisor.PlantCommand): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorPlantCommand)
      writeHVAC_Energy_Interface_SupervisorThermalServiceType(o.thermalService)
      writeHVAC_Energy_Interface_SupervisorAirPathType(o.airPath)
      writeHVAC_Energy_Interface_SupervisorBlowerType(o.blower)
    }

    def writeHVAC_Energy_Interface_SupervisorPlantCommand_Payload(o: HVAC_Energy_Interface_Supervisor.PlantCommand_Payload): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorPlantCommand_Payload)
      writeHVAC_Energy_Interface_SupervisorPlantCommand(o.value)
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

    def writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P)
      writeHVAC_Energy_Interface_SupervisorClimateRequestType(o.api_climateRequest)
      writeHVAC_Energy_Interface_SupervisorThermalRelationType(o.api_thermalRelation)
    }

    def writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorClimateRequestType(o.api_climateRequest)
      writeHVAC_Energy_Interface_SupervisorThermalRelationType(o.api_thermalRelation)
    }

    def writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P)
      writeHVAC_Energy_Interface_SupervisorComfortDemandType(o.api_comfortDemand)
    }

    def writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorComfortDemandType(o.api_comfortDemand)
    }

    def writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P)
      writeHVAC_Energy_Interface_SupervisorDefrostRequestType(o.api_defrostRequest)
      writeHVAC_Energy_Interface_SupervisorGlazingConditionType(o.api_glazingCondition)
    }

    def writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorDefrostRequestType(o.api_defrostRequest)
      writeHVAC_Energy_Interface_SupervisorGlazingConditionType(o.api_glazingCondition)
    }

    def writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P)
      writeHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.api_visibilityDemand)
    }

    def writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.api_visibilityDemand)
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P)
      writeHVAC_Energy_Interface_SupervisorEnergyContext(o.api_energyContext)
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorEnergyContext(o.api_energyContext)
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P)
      writeHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)
    }

    def writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P)
      writeHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)
      writeHVAC_Energy_Interface_SupervisorFreshRequestType(o.api_freshRequest)
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorRecoveryStateType(o.In_recoveryState)
      writeHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)
      writeHVAC_Energy_Interface_SupervisorFreshRequestType(o.api_freshRequest)
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P)
      writeHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)
    }

    def writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorRecoveryStateType(o.recoveryState)
      writeHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)
    }

    def writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P)
      writeHVAC_Energy_Interface_SupervisorComfortDemandType(o.api_comfortDemand)
      writeHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)
      writeHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.api_visibilityDemand)
    }

    def writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorComfortDemandType(o.api_comfortDemand)
      writeHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)
      writeHVAC_Energy_Interface_SupervisorVisibilityDemandType(o.api_visibilityDemand)
    }

    def writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection)
    }

    def writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection)
    }

    def writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P)
      writeHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection)
    }

    def writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorEnergyCapabilityType(o.api_energyCapability)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection)
    }

    def writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P)
      writeHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)
    }

    def writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)
    }

    def writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P)
      writeHVAC_Energy_Interface_SupervisorFanPreferenceType(o.api_fanPreference)
      writeHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection)
    }

    def writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorFanPreferenceType(o.api_fanPreference)
      writeHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection)
    }

    def writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P)
      writeHVAC_Energy_Interface_SupervisorActuationDispositionType(o.api_actuationDisposition)
      writeHVAC_Energy_Interface_SupervisorPlantCommand(o.api_plantCommand)
    }

    def writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorActuationDispositionType(o.api_actuationDisposition)
      writeHVAC_Energy_Interface_SupervisorPlantCommand(o.api_plantCommand)
    }

    def writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P)
      writeHVAC_Energy_Interface_SupervisorActuationDispositionType(o.api_actuationDisposition)
      writeHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)
      writeHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection)
    }

    def writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorActuationDispositionType(o.api_actuationDisposition)
      writeHVAC_Energy_Interface_SupervisorRecoveryDecisionType(o.api_recoveryDecision)
      writeHVAC_Energy_Interface_SupervisorResourceGrantType(o.api_resourceGrant)
      writeHVAC_Energy_Interface_SupervisorServiceSelection(o.api_serviceSelection)
    }

    def writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container): Unit = {
      o match {
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o)
      }
    }

    def writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P)
      writeHVAC_Energy_Interface_SupervisorSupervisorStatusType(o.api_supervisorStatus)
    }

    def writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS)
      writeHVAC_Energy_Interface_SupervisorSupervisorStatusType(o.api_supervisorStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o)
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
        case o: HVAC_Energy_Interface_Supervisor.Blower_Payload => writeHVAC_Energy_Interface_SupervisorBlower_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.AirPath_Payload => writeHVAC_Energy_Interface_SupervisorAirPath_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.Service_Payload => writeHVAC_Energy_Interface_SupervisorService_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.EngineHeat_Payload => writeHVAC_Energy_Interface_SupervisorEngineHeat_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.FreshRequest_Payload => writeHVAC_Energy_Interface_SupervisorFreshRequest_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.PlantCommand_Payload => writeHVAC_Energy_Interface_SupervisorPlantCommand_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryState_Payload => writeHVAC_Energy_Interface_SupervisorRecoveryState_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.FanPreference_Payload => writeHVAC_Energy_Interface_SupervisorFanPreference_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload => writeHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload => writeHVAC_Energy_Interface_SupervisorComfortDemand_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload => writeHVAC_Energy_Interface_SupervisorResourceGrant_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyContext_Payload => writeHVAC_Energy_Interface_SupervisorEnergyContext_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload => writeHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload => writeHVAC_Energy_Interface_SupervisorClimateRequest_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ThermalService_Payload => writeHVAC_Energy_Interface_SupervisorThermalService_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload => writeHVAC_Energy_Interface_SupervisorThermalRelation_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ElectricalState_Payload => writeHVAC_Energy_Interface_SupervisorElectricalState_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.SelectionReason_Payload => writeHVAC_Energy_Interface_SupervisorSelectionReason_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload => writeHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload => writeHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload => writeHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload => writeHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload => writeHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload => writeHVAC_Energy_Interface_SupervisorServiceSelection_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload => writeHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o)
        case o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o)
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

    def readHVAC_Energy_Interface_SupervisorClimateRequestType(): HVAC_Energy_Interface_Supervisor.ClimateRequest.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.ClimateRequest.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorClimateRequest_Payload(): HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorClimateRequest_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorClimateRequest_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorClimateRequest_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorClimateRequestType()
      return HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorThermalRelationType(): HVAC_Energy_Interface_Supervisor.ThermalRelation.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.ThermalRelation.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorThermalRelation_Payload(): HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorThermalRelation_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorThermalRelation_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorThermalRelation_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorThermalRelationType()
      return HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandType(): HVAC_Energy_Interface_Supervisor.ComfortDemand.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.ComfortDemand.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemand_Payload(): HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorComfortDemand_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemand_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemand_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorComfortDemandType()
      return HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorDefrostRequestType(): HVAC_Energy_Interface_Supervisor.DefrostRequest.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.DefrostRequest.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(): HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorDefrostRequest_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorDefrostRequest_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorDefrostRequest_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorDefrostRequestType()
      return HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorGlazingConditionType(): HVAC_Energy_Interface_Supervisor.GlazingCondition.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.GlazingCondition.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(): HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorGlazingCondition_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorGlazingCondition_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorGlazingCondition_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorGlazingConditionType()
      return HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandType(): HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemand.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(): HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorVisibilityDemand_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemand_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemand_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorElectricalStateType(): HVAC_Energy_Interface_Supervisor.ElectricalState.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.ElectricalState.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorElectricalState_Payload(): HVAC_Energy_Interface_Supervisor.ElectricalState_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorElectricalState_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorElectricalState_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ElectricalState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorElectricalState_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorElectricalStateType()
      return HVAC_Energy_Interface_Supervisor.ElectricalState_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorPowerEnvelopeType(): HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.PowerEnvelope.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(): HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorPowerEnvelope_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorPowerEnvelope_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorPowerEnvelope_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorPowerEnvelopeType()
      return HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorEngineHeatType(): HVAC_Energy_Interface_Supervisor.EngineHeat.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.EngineHeat.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorEngineHeat_Payload(): HVAC_Energy_Interface_Supervisor.EngineHeat_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorEngineHeat_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorEngineHeat_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EngineHeat_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorEngineHeat_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorEngineHeatType()
      return HVAC_Energy_Interface_Supervisor.EngineHeat_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityType(): HVAC_Energy_Interface_Supervisor.EnergyCapability.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.EnergyCapability.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(): HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorEnergyCapability_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapability_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapability_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      return HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorFreshRequestType(): HVAC_Energy_Interface_Supervisor.FreshRequest.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.FreshRequest.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorFreshRequest_Payload(): HVAC_Energy_Interface_Supervisor.FreshRequest_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorFreshRequest_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorFreshRequest_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.FreshRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorFreshRequest_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorFreshRequestType()
      return HVAC_Energy_Interface_Supervisor.FreshRequest_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryDecisionType(): HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.RecoveryDecision.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(): HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorRecoveryDecision_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryDecision_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryDecision_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      return HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorServiceType(): HVAC_Energy_Interface_Supervisor.Service.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.Service.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorService_Payload(): HVAC_Energy_Interface_Supervisor.Service_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorService_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorService_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.Service_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorService_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorServiceType()
      return HVAC_Energy_Interface_Supervisor.Service_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorSelectionReasonType(): HVAC_Energy_Interface_Supervisor.SelectionReason.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.SelectionReason.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorSelectionReason_Payload(): HVAC_Energy_Interface_Supervisor.SelectionReason_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorSelectionReason_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorSelectionReason_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SelectionReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorSelectionReason_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorSelectionReasonType()
      return HVAC_Energy_Interface_Supervisor.SelectionReason_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorResourceGrantType(): HVAC_Energy_Interface_Supervisor.ResourceGrant.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.ResourceGrant.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorResourceGrant_Payload(): HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorResourceGrant_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorResourceGrant_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorResourceGrant_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorResourceGrantType()
      return HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorFanPreferenceType(): HVAC_Energy_Interface_Supervisor.FanPreference.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.FanPreference.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorFanPreference_Payload(): HVAC_Energy_Interface_Supervisor.FanPreference_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorFanPreference_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorFanPreference_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.FanPreference_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorFanPreference_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorFanPreferenceType()
      return HVAC_Energy_Interface_Supervisor.FanPreference_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorThermalServiceType(): HVAC_Energy_Interface_Supervisor.ThermalService.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.ThermalService.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorThermalService_Payload(): HVAC_Energy_Interface_Supervisor.ThermalService_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorThermalService_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorThermalService_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ThermalService_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorThermalService_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorThermalServiceType()
      return HVAC_Energy_Interface_Supervisor.ThermalService_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorAirPathType(): HVAC_Energy_Interface_Supervisor.AirPath.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.AirPath.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorAirPath_Payload(): HVAC_Energy_Interface_Supervisor.AirPath_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorAirPath_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorAirPath_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.AirPath_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorAirPath_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorAirPathType()
      return HVAC_Energy_Interface_Supervisor.AirPath_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorBlowerType(): HVAC_Energy_Interface_Supervisor.Blower.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.Blower.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorBlower_Payload(): HVAC_Energy_Interface_Supervisor.Blower_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorBlower_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorBlower_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.Blower_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorBlower_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorBlowerType()
      return HVAC_Energy_Interface_Supervisor.Blower_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorActuationDispositionType(): HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.ActuationDisposition.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(): HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorActuationDisposition_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorActuationDisposition_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorActuationDisposition_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorActuationDispositionType()
      return HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorSupervisorStatusType(): HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.SupervisorStatus.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(): HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorSupervisorStatus_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorSupervisorStatus_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorSupervisorStatus_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorSupervisorStatusType()
      return HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryStateType(): HVAC_Energy_Interface_Supervisor.RecoveryState.Type = {
      val r = reader.readZ()
      return HVAC_Energy_Interface_Supervisor.RecoveryState.byOrdinal(r).get
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryState_Payload(): HVAC_Energy_Interface_Supervisor.RecoveryState_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorRecoveryState_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryState_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryState_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryState_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorRecoveryStateType()
      return HVAC_Energy_Interface_Supervisor.RecoveryState_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorEnergyContext(): HVAC_Energy_Interface_Supervisor.EnergyContext = {
      val r = readHVAC_Energy_Interface_SupervisorEnergyContextT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorEnergyContextT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyContext = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorEnergyContext)
      }
      val electricalState = readHVAC_Energy_Interface_SupervisorElectricalStateType()
      val powerEnvelope = readHVAC_Energy_Interface_SupervisorPowerEnvelopeType()
      val engineHeat = readHVAC_Energy_Interface_SupervisorEngineHeatType()
      return HVAC_Energy_Interface_Supervisor.EnergyContext(electricalState, powerEnvelope, engineHeat)
    }

    def readHVAC_Energy_Interface_SupervisorEnergyContext_Payload(): HVAC_Energy_Interface_Supervisor.EnergyContext_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorEnergyContext_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorEnergyContext_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorEnergyContext_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorEnergyContext()
      return HVAC_Energy_Interface_Supervisor.EnergyContext_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorServiceSelection(): HVAC_Energy_Interface_Supervisor.ServiceSelection = {
      val r = readHVAC_Energy_Interface_SupervisorServiceSelectionT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorServiceSelectionT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServiceSelection = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorServiceSelection)
      }
      val service = readHVAC_Energy_Interface_SupervisorServiceType()
      val reason = readHVAC_Energy_Interface_SupervisorSelectionReasonType()
      return HVAC_Energy_Interface_Supervisor.ServiceSelection(service, reason)
    }

    def readHVAC_Energy_Interface_SupervisorServiceSelection_Payload(): HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorServiceSelection_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorServiceSelection_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorServiceSelection_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload(value)
    }

    def readHVAC_Energy_Interface_SupervisorPlantCommand(): HVAC_Energy_Interface_Supervisor.PlantCommand = {
      val r = readHVAC_Energy_Interface_SupervisorPlantCommandT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorPlantCommandT(typeParsed: B): HVAC_Energy_Interface_Supervisor.PlantCommand = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorPlantCommand)
      }
      val thermalService = readHVAC_Energy_Interface_SupervisorThermalServiceType()
      val airPath = readHVAC_Energy_Interface_SupervisorAirPathType()
      val blower = readHVAC_Energy_Interface_SupervisorBlowerType()
      return HVAC_Energy_Interface_Supervisor.PlantCommand(thermalService, airPath, blower)
    }

    def readHVAC_Energy_Interface_SupervisorPlantCommand_Payload(): HVAC_Energy_Interface_Supervisor.PlantCommand_Payload = {
      val r = readHVAC_Energy_Interface_SupervisorPlantCommand_PayloadT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorPlantCommand_PayloadT(typeParsed: B): HVAC_Energy_Interface_Supervisor.PlantCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorPlantCommand_Payload)
      }
      val value = readHVAC_Energy_Interface_SupervisorPlantCommand()
      return HVAC_Energy_Interface_Supervisor.PlantCommand_Payload(value)
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

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P)
      }
      val api_climateRequest = readHVAC_Energy_Interface_SupervisorClimateRequestType()
      val api_thermalRelation = readHVAC_Energy_Interface_SupervisorThermalRelationType()
      return HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(api_climateRequest, api_thermalRelation)
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS)
      }
      val api_climateRequest = readHVAC_Energy_Interface_SupervisorClimateRequestType()
      val api_thermalRelation = readHVAC_Energy_Interface_SupervisorThermalRelationType()
      return HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(api_climateRequest, api_thermalRelation)
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P)
      }
      val api_comfortDemand = readHVAC_Energy_Interface_SupervisorComfortDemandType()
      return HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(api_comfortDemand)
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS)
      }
      val api_comfortDemand = readHVAC_Energy_Interface_SupervisorComfortDemandType()
      return HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(api_comfortDemand)
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P)
      }
      val api_defrostRequest = readHVAC_Energy_Interface_SupervisorDefrostRequestType()
      val api_glazingCondition = readHVAC_Energy_Interface_SupervisorGlazingConditionType()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(api_defrostRequest, api_glazingCondition)
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS)
      }
      val api_defrostRequest = readHVAC_Energy_Interface_SupervisorDefrostRequestType()
      val api_glazingCondition = readHVAC_Energy_Interface_SupervisorGlazingConditionType()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(api_defrostRequest, api_glazingCondition)
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P)
      }
      val api_visibilityDemand = readHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(api_visibilityDemand)
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS)
      }
      val api_visibilityDemand = readHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      return HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(api_visibilityDemand)
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P)
      }
      val api_energyContext = readHVAC_Energy_Interface_SupervisorEnergyContext()
      return HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(api_energyContext)
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS)
      }
      val api_energyContext = readHVAC_Energy_Interface_SupervisorEnergyContext()
      return HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(api_energyContext)
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P)
      }
      val api_energyCapability = readHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      return HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(api_energyCapability)
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS)
      }
      val api_energyCapability = readHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      return HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(api_energyCapability)
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P)
      }
      val api_energyCapability = readHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      val api_freshRequest = readHVAC_Energy_Interface_SupervisorFreshRequestType()
      return HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(api_energyCapability, api_freshRequest)
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS)
      }
      val In_recoveryState = readHVAC_Energy_Interface_SupervisorRecoveryStateType()
      val api_energyCapability = readHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      val api_freshRequest = readHVAC_Energy_Interface_SupervisorFreshRequestType()
      return HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(In_recoveryState, api_energyCapability, api_freshRequest)
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P)
      }
      val api_recoveryDecision = readHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      return HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(api_recoveryDecision)
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS)
      }
      val recoveryState = readHVAC_Energy_Interface_SupervisorRecoveryStateType()
      val api_recoveryDecision = readHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      return HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(recoveryState, api_recoveryDecision)
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P)
      }
      val api_comfortDemand = readHVAC_Energy_Interface_SupervisorComfortDemandType()
      val api_recoveryDecision = readHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      val api_visibilityDemand = readHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      return HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(api_comfortDemand, api_recoveryDecision, api_visibilityDemand)
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS)
      }
      val api_comfortDemand = readHVAC_Energy_Interface_SupervisorComfortDemandType()
      val api_recoveryDecision = readHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      val api_visibilityDemand = readHVAC_Energy_Interface_SupervisorVisibilityDemandType()
      return HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(api_comfortDemand, api_recoveryDecision, api_visibilityDemand)
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P)
      }
      val api_serviceSelection = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(api_serviceSelection)
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS)
      }
      val api_serviceSelection = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(api_serviceSelection)
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P)
      }
      val api_energyCapability = readHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      val api_serviceSelection = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(api_energyCapability, api_serviceSelection)
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS)
      }
      val api_energyCapability = readHVAC_Energy_Interface_SupervisorEnergyCapabilityType()
      val api_serviceSelection = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(api_energyCapability, api_serviceSelection)
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P)
      }
      val api_resourceGrant = readHVAC_Energy_Interface_SupervisorResourceGrantType()
      return HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(api_resourceGrant)
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS)
      }
      val api_resourceGrant = readHVAC_Energy_Interface_SupervisorResourceGrantType()
      return HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(api_resourceGrant)
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P)
      }
      val api_fanPreference = readHVAC_Energy_Interface_SupervisorFanPreferenceType()
      val api_resourceGrant = readHVAC_Energy_Interface_SupervisorResourceGrantType()
      val api_serviceSelection = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(api_fanPreference, api_resourceGrant, api_serviceSelection)
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS)
      }
      val api_fanPreference = readHVAC_Energy_Interface_SupervisorFanPreferenceType()
      val api_resourceGrant = readHVAC_Energy_Interface_SupervisorResourceGrantType()
      val api_serviceSelection = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(api_fanPreference, api_resourceGrant, api_serviceSelection)
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P)
      }
      val api_actuationDisposition = readHVAC_Energy_Interface_SupervisorActuationDispositionType()
      val api_plantCommand = readHVAC_Energy_Interface_SupervisorPlantCommand()
      return HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(api_actuationDisposition, api_plantCommand)
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS)
      }
      val api_actuationDisposition = readHVAC_Energy_Interface_SupervisorActuationDispositionType()
      val api_plantCommand = readHVAC_Energy_Interface_SupervisorPlantCommand()
      return HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(api_actuationDisposition, api_plantCommand)
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P)
      }
      val api_actuationDisposition = readHVAC_Energy_Interface_SupervisorActuationDispositionType()
      val api_recoveryDecision = readHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      val api_resourceGrant = readHVAC_Energy_Interface_SupervisorResourceGrantType()
      val api_serviceSelection = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(api_actuationDisposition, api_recoveryDecision, api_resourceGrant, api_serviceSelection)
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS)
      }
      val api_actuationDisposition = readHVAC_Energy_Interface_SupervisorActuationDispositionType()
      val api_recoveryDecision = readHVAC_Energy_Interface_SupervisorRecoveryDecisionType()
      val api_resourceGrant = readHVAC_Energy_Interface_SupervisorResourceGrantType()
      val api_serviceSelection = readHVAC_Energy_Interface_SupervisorServiceSelection()
      return HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(api_actuationDisposition, api_recoveryDecision, api_resourceGrant, api_serviceSelection)
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container.")
          val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(T)
          return r
      }
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P = {
      val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P)
      }
      val api_supervisorStatus = readHVAC_Energy_Interface_SupervisorSupervisorStatusType()
      return HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(api_supervisorStatus)
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS = {
      val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(F)
      return r
    }

    def readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(typeParsed: B): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS)
      }
      val api_supervisorStatus = readHVAC_Energy_Interface_SupervisorSupervisorStatusType()
      return HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(api_supervisorStatus)
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
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T)
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
        case Constants.HVAC_Energy_Interface_SupervisorBlower_Payload => val r = readHVAC_Energy_Interface_SupervisorBlower_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorAirPath_Payload => val r = readHVAC_Energy_Interface_SupervisorAirPath_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorService_Payload => val r = readHVAC_Energy_Interface_SupervisorService_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEngineHeat_Payload => val r = readHVAC_Energy_Interface_SupervisorEngineHeat_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorFreshRequest_Payload => val r = readHVAC_Energy_Interface_SupervisorFreshRequest_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorPlantCommand_Payload => val r = readHVAC_Energy_Interface_SupervisorPlantCommand_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryState_Payload => val r = readHVAC_Energy_Interface_SupervisorRecoveryState_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorFanPreference_Payload => val r = readHVAC_Energy_Interface_SupervisorFanPreference_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorPowerEnvelope_Payload => val r = readHVAC_Energy_Interface_SupervisorPowerEnvelope_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemand_Payload => val r = readHVAC_Energy_Interface_SupervisorComfortDemand_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceGrant_Payload => val r = readHVAC_Energy_Interface_SupervisorResourceGrant_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyContext_Payload => val r = readHVAC_Energy_Interface_SupervisorEnergyContext_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorDefrostRequest_Payload => val r = readHVAC_Energy_Interface_SupervisorDefrostRequest_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorClimateRequest_Payload => val r = readHVAC_Energy_Interface_SupervisorClimateRequest_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorThermalService_Payload => val r = readHVAC_Energy_Interface_SupervisorThermalService_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorThermalRelation_Payload => val r = readHVAC_Energy_Interface_SupervisorThermalRelation_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorElectricalState_Payload => val r = readHVAC_Energy_Interface_SupervisorElectricalState_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSelectionReason_Payload => val r = readHVAC_Energy_Interface_SupervisorSelectionReason_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemand_Payload => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemand_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorGlazingCondition_Payload => val r = readHVAC_Energy_Interface_SupervisorGlazingCondition_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapability_Payload => val r = readHVAC_Energy_Interface_SupervisorEnergyCapability_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryDecision_Payload => val r = readHVAC_Energy_Interface_SupervisorRecoveryDecision_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisorStatus_Payload => val r = readHVAC_Energy_Interface_SupervisorSupervisorStatus_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServiceSelection_Payload => val r = readHVAC_Energy_Interface_SupervisorServiceSelection_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationDisposition_Payload => val r = readHVAC_Energy_Interface_SupervisorActuationDisposition_PayloadT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PST(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PT(T); return r
        case Constants.HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PST(T)
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

  def fromHVAC_Energy_Interface_SupervisorClimateRequest_Payload(o: HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorClimateRequest_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorClimateRequest_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorClimateRequest_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorClimateRequest_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorClimateRequest_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorThermalRelation_Payload(o: HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorThermalRelation_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorThermalRelation_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorThermalRelation_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorThermalRelation_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorThermalRelation_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemand_Payload(o: HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorComfortDemand_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemand_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemand_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorComfortDemand_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorComfortDemand_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(o: HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorDefrostRequest_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorDefrostRequest_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorDefrostRequest_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(o: HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorGlazingCondition_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorGlazingCondition_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorGlazingCondition_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(o: HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorVisibilityDemand_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorElectricalState_Payload(o: HVAC_Energy_Interface_Supervisor.ElectricalState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorElectricalState_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorElectricalState_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ElectricalState_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorElectricalState_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.ElectricalState_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorElectricalState_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorElectricalState_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(o: HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorPowerEnvelope_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEngineHeat_Payload(o: HVAC_Energy_Interface_Supervisor.EngineHeat_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEngineHeat_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEngineHeat_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EngineHeat_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEngineHeat_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.EngineHeat_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEngineHeat_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEngineHeat_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(o: HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapability_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyCapability_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyCapability_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorFreshRequest_Payload(o: HVAC_Energy_Interface_Supervisor.FreshRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorFreshRequest_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorFreshRequest_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.FreshRequest_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorFreshRequest_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.FreshRequest_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorFreshRequest_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorFreshRequest_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(o: HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorRecoveryDecision_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorService_Payload(o: HVAC_Energy_Interface_Supervisor.Service_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorService_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorService_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.Service_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorService_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.Service_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorService_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorService_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSelectionReason_Payload(o: HVAC_Energy_Interface_Supervisor.SelectionReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorSelectionReason_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorSelectionReason_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.SelectionReason_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSelectionReason_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.SelectionReason_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorSelectionReason_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorSelectionReason_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceGrant_Payload(o: HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorResourceGrant_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorResourceGrant_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceGrant_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorResourceGrant_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorResourceGrant_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorFanPreference_Payload(o: HVAC_Energy_Interface_Supervisor.FanPreference_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorFanPreference_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorFanPreference_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.FanPreference_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorFanPreference_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.FanPreference_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorFanPreference_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorFanPreference_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorThermalService_Payload(o: HVAC_Energy_Interface_Supervisor.ThermalService_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorThermalService_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorThermalService_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ThermalService_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorThermalService_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.ThermalService_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorThermalService_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorThermalService_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorAirPath_Payload(o: HVAC_Energy_Interface_Supervisor.AirPath_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorAirPath_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorAirPath_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.AirPath_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorAirPath_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.AirPath_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorAirPath_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorAirPath_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorBlower_Payload(o: HVAC_Energy_Interface_Supervisor.Blower_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorBlower_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorBlower_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.Blower_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorBlower_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.Blower_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorBlower_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorBlower_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(o: HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationDisposition_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorActuationDisposition_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorActuationDisposition_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(o: HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorSupervisorStatus_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryState_Payload(o: HVAC_Energy_Interface_Supervisor.RecoveryState_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorRecoveryState_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryState_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.RecoveryState_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryState_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.RecoveryState_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorRecoveryState_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorRecoveryState_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyContext(o: HVAC_Energy_Interface_Supervisor.EnergyContext, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyContext(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyContext(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyContext, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyContext(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyContext = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyContext()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyContext _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyContext_Payload(o: HVAC_Energy_Interface_Supervisor.EnergyContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyContext_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyContext_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyContext_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyContext_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyContext_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyContext_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyContext_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServiceSelection(o: HVAC_Energy_Interface_Supervisor.ServiceSelection, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorServiceSelection(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorServiceSelection(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ServiceSelection, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServiceSelection(reader: Reader): HVAC_Energy_Interface_Supervisor.ServiceSelection = {
      val r = reader.readHVAC_Energy_Interface_SupervisorServiceSelection()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorServiceSelection _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServiceSelection_Payload(o: HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorServiceSelection_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorServiceSelection_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServiceSelection_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorServiceSelection_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorServiceSelection_Payload _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorPlantCommand(o: HVAC_Energy_Interface_Supervisor.PlantCommand, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorPlantCommand(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorPlantCommand(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.PlantCommand, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorPlantCommand(reader: Reader): HVAC_Energy_Interface_Supervisor.PlantCommand = {
      val r = reader.readHVAC_Energy_Interface_SupervisorPlantCommand()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorPlantCommand _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorPlantCommand_Payload(o: HVAC_Energy_Interface_Supervisor.PlantCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorPlantCommand_Payload(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorPlantCommand_Payload(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.PlantCommand_Payload, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorPlantCommand_Payload(reader: Reader): HVAC_Energy_Interface_Supervisor.PlantCommand_Payload = {
      val r = reader.readHVAC_Energy_Interface_SupervisorPlantCommand_Payload()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorPlantCommand_Payload _)
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

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(reader: Reader): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container = {
      val r = reader.readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(reader: Reader): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P = {
      val r = reader.readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P _)
    return r
  }

  def fromHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(o)
    return w.result
  }

  def toHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(data: ISZ[U8]): Either[HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(reader: Reader): HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS = {
      val r = reader.readHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS()
      return r
    }
    val r = to(data, fHVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS _)
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