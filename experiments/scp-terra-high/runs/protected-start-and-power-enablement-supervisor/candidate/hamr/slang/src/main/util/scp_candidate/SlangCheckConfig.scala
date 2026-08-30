// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Command.scala

Validity.scala

PedalCondition.scala

TemperatureBand.scala

QualifiedTemperature.scala

SupplyAvailability.scala

ParkingBrakeCondition.scala

ThermalState.scala

SelfTestProgress.scala

SelfTestState.scala

Session.scala

SessionCause.scala

RearmState.scala

FuelDisposition.scala

ElectricalDisposition.scala

ParkingBrakeDisposition.scala

Notice.scala

CommandReport.scala

QualifiedCommandFacts.scala

QualifiedPedalFacts.scala

QualifiedSupplyFacts.scala

QualifiedParkingBrakeFacts.scala

StartRestraintFact.scala

ReadinessFacts.scala

ExactFaultSummary.scala

RecoveryPermitFact.scala

BrakePedalReport.scala

TemperatureReport.scala

ElectricalPowerReport.scala

ParkingBrakeReport.scala

ThermalStateFacts.scala

SelfTestReport.scala

SelfTestStateFacts.scala

SessionDecisionFacts.scala

RearmStateFacts.scala

ActuationDisposition.scala

SupervisoryStatus.scala

Base_Types.scala

CommandQualificationOwner_protected_start_power_process_command_qualification_owner_Containers.scala

BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_Containers.scala

TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_Containers.scala

ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_Containers.scala

ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_Containers.scala

ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_Containers.scala

SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_Containers.scala

StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_Containers.scala

ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_Containers.scala

OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_Containers.scala

FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_Containers.scala

RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_Containers.scala

ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_Containers.scala

SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_Containers.scala

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

@datatype class Config_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorActuationDisposition(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ActuationDisposition => B) {}

@datatype class Config_Protected_Start_Power_SupervisorActuationDisposition_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ActuationDisposition_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorBrakePedalReport(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.BrakePedalReport => B) {}

@datatype class Config_Protected_Start_Power_SupervisorBrakePedalReport_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.BrakePedalReport_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.Command.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommand_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.Command_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandReport(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.CommandReport => B) {}

@datatype class Config_Protected_Start_Power_SupervisorCommandReport_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.CommandReport_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalDispositionType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ElectricalDisposition.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalDisposition_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ElectricalDisposition_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalPowerReport(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ElectricalPowerReport => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalPowerReport_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorExactFaultSummary(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ExactFaultSummary => B) {}

@datatype class Config_Protected_Start_Power_SupervisorExactFaultSummary_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ExactFaultSummary_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorFuelDispositionType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.FuelDisposition.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorFuelDisposition_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.FuelDisposition_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorNoticeType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.Notice.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorNotice_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.Notice_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeConditionType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeCondition.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeCondition_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeDispositionType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeDisposition_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeReport(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeReport => B) {}

@datatype class Config_Protected_Start_Power_SupervisorParkingBrakeReport_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorPedalConditionType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.PedalCondition.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorPedalCondition_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.PedalCondition_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedCommandFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedCommandFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedCommandFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedPedalFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedPedalFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedPedalFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedSupplyFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedSupplyFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedTemperatureType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedTemperature.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorQualifiedTemperature_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.QualifiedTemperature_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorReadinessFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ReadinessFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorReadinessFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ReadinessFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmStateType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RearmState.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmState_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RearmState_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmStateFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RearmStateFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRearmStateFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RearmStateFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRecoveryPermitFact(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RecoveryPermitFact => B) {}

@datatype class Config_Protected_Start_Power_SupervisorRecoveryPermitFact_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestProgressType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestProgress.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestProgress_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestProgress_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestReport(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestReport => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestReport_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestReport_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestStateType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestState.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestState_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestState_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestStateFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestStateFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSelfTestStateFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSessionType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.Session.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSession_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.Session_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSessionCauseType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SessionCause.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSessionCause_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SessionCause_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSessionDecisionFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SessionDecisionFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSessionDecisionFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorStartRestraintFact(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.StartRestraintFact => B) {}

@datatype class Config_Protected_Start_Power_SupervisorStartRestraintFact_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.StartRestraintFact_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupervisoryStatus(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SupervisoryStatus => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupervisoryStatus_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SupervisoryStatus_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupplyAvailabilityType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SupplyAvailability.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorSupplyAvailability_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.SupplyAvailability_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureBandType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.TemperatureBand.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureBand_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.TemperatureBand_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureReport(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.TemperatureReport => B) {}

@datatype class Config_Protected_Start_Power_SupervisorTemperatureReport_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.TemperatureReport_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_DataTypeId.Type], filter: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalStateType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ThermalState.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalState_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ThermalState_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalStateFacts(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ThermalStateFacts => B) {}

@datatype class Config_Protected_Start_Power_SupervisorThermalStateFacts_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.ThermalStateFacts_Payload => B) {}

@datatype class Config_Protected_Start_Power_SupervisorValidityType(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.Validity.Type => B) {}

@datatype class Config_Protected_Start_Power_SupervisorValidity_Payload(attempts: Z, verbose: B, filter: Protected_Start_Power_Supervisor.Validity_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


