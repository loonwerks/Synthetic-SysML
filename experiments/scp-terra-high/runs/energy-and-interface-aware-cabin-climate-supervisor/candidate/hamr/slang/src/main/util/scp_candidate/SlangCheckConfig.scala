// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ClimateRequest.scala

ThermalRelation.scala

ComfortDemand.scala

DefrostRequest.scala

GlazingCondition.scala

VisibilityDemand.scala

ElectricalState.scala

PowerEnvelope.scala

EngineHeat.scala

EnergyCapability.scala

FreshRequest.scala

RecoveryDecision.scala

Service.scala

SelectionReason.scala

ResourceGrant.scala

FanPreference.scala

ThermalService.scala

AirPath.scala

Blower.scala

ActuationDisposition.scala

SupervisorStatus.scala

RecoveryState.scala

EnergyContext.scala

ServiceSelection.scala

PlantCommand.scala

Base_Types.scala

ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Containers.scala

VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_Containers.scala

EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Containers.scala

RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_Containers.scala

ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_Containers.scala

ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Containers.scala

ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_Containers.scala

SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/
@datatype class Config_String(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: String => B) {}
@datatype class Config_Z(low: Option[Z], high: Option[Z], attempts: Z, verbose: B, filter: Z => B) {}

@datatype class Config_B(attempts: Z, verbose: B, filter: B => B) {}

@datatype class Config_C(low: Option[C], high: Option[C], attempts: Z, verbose: B, filter: C => B) {}

@datatype class Config_R(low: Option[R], high: Option[R], attempts: Z, verbose: B, filter: R => B) {}

@datatype class Config_F32(low: Option[F32], high: Option[F32], attempts: Z, verbose: B, filter: F32 => B) {}

@datatype class Config_F64(low: Option[F64], high: Option[F64], attempts: Z, verbose: B, filter: F64 => B) {}

@datatype class Config_S8(low: Option[S8], high: Option[S8], attempts: Z, verbose: B, filter: S8 => B) {}

@datatype class Config_S16(low: Option[S16], high: Option[S16], attempts: Z, verbose: B, filter: S16 => B) {}

@datatype class Config_S32(low: Option[S32], high: Option[S32], attempts: Z, verbose: B, filter: S32 => B) {}

@datatype class Config_S64(low: Option[S64], high: Option[S64], attempts: Z, verbose: B, filter: S64 => B) {}

@datatype class Config_U8(low: Option[U8], high: Option[U8], attempts: Z, verbose: B, filter: U8 => B) {}

@datatype class Config_U16(low: Option[U16], high: Option[U16], attempts: Z, verbose: B, filter: U16 => B) {}

@datatype class Config_U32(low: Option[U32], high: Option[U32], attempts: Z, verbose: B, filter: U32 => B) {}

@datatype class Config_U64(low: Option[U64], high: Option[U64], attempts: Z, verbose: B, filter: U64 => B) {}

@datatype class Config__artDataContent(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[_artDataContent_DataTypeId.Type], filter: art.DataContent => B) {}

@datatype class Config__artEmpty(attempts: Z, verbose: B, filter: art.Empty => B) {}

@datatype class Config_Base_TypesBoolean_Payload(attempts: Z, verbose: B, filter: Base_Types.Boolean_Payload => B) {}

@datatype class Config_Base_TypesInteger_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_Payload => B) {}

@datatype class Config_Base_TypesInteger_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_8_Payload => B) {}

@datatype class Config_Base_TypesInteger_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_16_Payload => B) {}

@datatype class Config_Base_TypesInteger_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_32_Payload => B) {}

@datatype class Config_Base_TypesInteger_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_64_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_8_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_16_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_32_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_64_Payload => B) {}

@datatype class Config_Base_TypesFloat_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_Payload => B) {}

@datatype class Config_Base_TypesFloat_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_32_Payload => B) {}

@datatype class Config_Base_TypesFloat_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_64_Payload => B) {}

@datatype class Config_Base_TypesCharacter_Payload(attempts: Z, verbose: B, filter: Base_Types.Character_Payload => B) {}

@datatype class Config_Base_TypesString_Payload(attempts: Z, verbose: B, filter: Base_Types.String_Payload => B) {}

@datatype class Config_ISZB(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: ISZ[B] => B) {}

@datatype class Config_Base_TypesBits_Payload(attempts: Z, verbose: B, filter: Base_Types.Bits_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorActuationDispositionType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorActuationDisposition_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ActuationDisposition_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorAirPathType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.AirPath.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorAirPath_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.AirPath_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorBlowerType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.Blower.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorBlower_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.Blower_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorClimateRequestType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ClimateRequest.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorClimateRequest_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ClimateRequest_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorComfortDemandType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ComfortDemand.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorComfortDemand_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ComfortDemand_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorDefrostRequestType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.DefrostRequest.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorDefrostRequest_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.DefrostRequest_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorElectricalStateType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ElectricalState.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorElectricalState_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ElectricalState_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyCapabilityType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyCapability_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EnergyCapability_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyContext(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EnergyContext => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEnergyContext_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EnergyContext_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEngineHeatType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EngineHeat.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorEngineHeat_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.EngineHeat_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorFanPreferenceType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.FanPreference.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorFanPreference_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.FanPreference_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorFreshRequestType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.FreshRequest.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorFreshRequest_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.FreshRequest_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorGlazingConditionType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.GlazingCondition.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorGlazingCondition_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.GlazingCondition_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorPlantCommand(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.PlantCommand => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorPlantCommand_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.PlantCommand_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorPowerEnvelopeType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.PowerEnvelope.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorPowerEnvelope_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.PowerEnvelope_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryDecisionType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryDecision_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.RecoveryDecision_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryStateType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.RecoveryState.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorRecoveryState_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.RecoveryState_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorResourceGrantType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorResourceGrant_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ResourceGrant_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSelectionReasonType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.SelectionReason.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSelectionReason_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.SelectionReason_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServiceType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.Service.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorService_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.Service_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServiceSelection(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ServiceSelection => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorServiceSelection_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ServiceSelection_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSupervisorStatusType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSupervisorStatus_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.SupervisorStatus_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorSupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_PostState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorThermalRelationType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ThermalRelation.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorThermalRelation_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ThermalRelation_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorThermalServiceType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ThermalService.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorThermalService_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.ThermalService_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorVisibilityDemandType(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorVisibilityDemand_Payload(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.VisibilityDemand_Payload => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PreState_Container_PS => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_DataTypeId.Type], filter: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_P => B) {}

@datatype class Config_HVAC_Energy_Interface_SupervisorVisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


