// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Request_Value.scala

Input_Validity.scala

Qualified_Request.scala

Attitude_Data_Validity.scala

Attitude_Acceptability.scala

Reference_State.scala

AP_Availability.scala

Request_Indication.scala

FD_Indication.scala

FCS_Failed_Indication.scala

AP_Status.scala

AP_Enable.scala

Base_Types.scala

FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_Containers.scala

Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_Containers.scala

Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_Containers.scala

AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_Containers.scala

Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_Containers.scala

Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_Containers.scala

FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_Containers.scala

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

@datatype class Config_FAA_FCS_CoordinationAP_AvailabilityType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Availability.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Availability_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Availability_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PreState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_PostState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_EnableType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Enable.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Enable_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Enable_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_StatusType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Status.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationAP_Status_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.AP_Status_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_AcceptabilityType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Attitude_Acceptability.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Acceptability_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Attitude_Acceptability_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PreState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Attitude_Condition_Intake_i_fcs_coordination_process_attitude_condition_intake_PostState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Data_ValidityType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Attitude_Data_Validity.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationAttitude_Data_Validity_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Attitude_Data_Validity_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PreState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationAutopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Autopilot_Coordination_i_fcs_coordination_process_autopilot_coordination_PostState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PreState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationFCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCI_Command_Intake_i_fcs_coordination_process_fci_command_intake_PostState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationFCS_Failed_IndicationType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCS_Failed_Indication.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationFCS_Failed_Indication_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCS_Failed_Indication_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PreState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationFCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FCS_Snapshot_Publication_i_fcs_coordination_process_fcs_snapshot_publication_PostState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationFD_IndicationType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FD_Indication.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationFD_Indication_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.FD_Indication_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PreState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationFlight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Flight_Guidance_Coordination_i_fcs_coordination_process_flight_guidance_coordination_PostState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationInput_ValidityType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Input_Validity.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationInput_Validity_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Input_Validity_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationQualified_RequestType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Qualified_Request.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationQualified_Request_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Qualified_Request_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationReference_StateType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Reference_State.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationReference_State_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Reference_State_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PreState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_DataTypeId.Type], filter: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container => B) {}

@datatype class Config_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_P => B) {}

@datatype class Config_FAA_FCS_CoordinationReference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_PostState_Container_PS => B) {}

@datatype class Config_FAA_FCS_CoordinationRequest_IndicationType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Request_Indication.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationRequest_Indication_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Request_Indication_Payload => B) {}

@datatype class Config_FAA_FCS_CoordinationRequest_ValueType(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Request_Value.Type => B) {}

@datatype class Config_FAA_FCS_CoordinationRequest_Value_Payload(attempts: Z, verbose: B, filter: FAA_FCS_Coordination.Request_Value_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


